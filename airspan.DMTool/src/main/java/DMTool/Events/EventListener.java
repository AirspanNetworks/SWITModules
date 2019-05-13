package DMTool.Events;

import java.util.HashSet;
import java.util.Set;

import DMTool.EvtClient;
import DMTool.OutValue;
import DMTool.Util;


public class EventListener extends EvtClient {
	private Set<EventData> expectedEvents = new HashSet<>();
	private String ueName;
	
	public EventListener(String ueName){
		this.ueName = ueName;
	}
	
	@Override
	public void Evt(short[] payload) {
		byte[] bytePayload = Util.shortToByte(payload);
		parsePayload(bytePayload);
	}
	
	private void parsePayload(byte[] payload) {
		OutValue<Integer> _offset = new OutValue<Integer>(0);
		DmEvent dmEvent;
		while (_offset._value < payload.length) {
			dmEvent = new DmEvent();
			dmEvent.setTime((long) Util.Copy32FromBuffer(payload, _offset));
			dmEvent.setEventType((int) Util.Copy16FromBuffer(payload, _offset));
			dmEvent.setMessageLength((int) Util.Copy16FromBuffer(payload, _offset));
			dmEvent.setMessageType((int) Util.Copy32FromBuffer(payload, _offset));
			dmEvent.setPayloadLength((int) Util.Copy32FromBuffer(payload, _offset));
			dmEvent.setEarfcn((int) Util.Copy16FromBuffer(payload, _offset));
			dmEvent.setPci((int) Util.Copy16FromBuffer(payload, _offset));
			short[] shortPay = new short[dmEvent.getPayloadLength()];
			for (int i = 0; i < dmEvent.getPayloadLength(); i++) {
				shortPay[i] = (short) Util.Copy8FromBuffer(payload, _offset);
			}
			dmEvent.setPayload(shortPay);
			checkMatch(dmEvent);
		}
	}
	
	private void checkMatch(DmEvent dmEvent){
		for(EventData event : expectedEvents){
			System.out.println("Val1: "+ event.expectedPayload);
			System.out.println("Val2: "+ dmEvent.getPayload());
			String val1 = event.expectedPayload.toLowerCase().replace(" ", "");
			String val2 = Util.shortToHex(dmEvent.getPayload()).toLowerCase().replace(" ", "");
			System.out.println("Val1: "+ val1);
			System.out.println("Size 1 : "+val1.length());
			System.out.println("Val2: "+ val2);
			System.out.println("Size 2 : "+val2.length());
			if(val1.equals(val2)){
				event.eventHappened = true;
				event.data = dmEvent.toString();
				event.count++;
				System.out.println("Found event on " + ueName + ":\n" + dmEvent.toString());
			}
		}
	}
	
	private class EventData{
		private String name;
		private boolean eventHappened;
		private String expectedPayload;
		private String data;
		private int count;
		
		public EventData(String name, String expectedPayload){
			this.count = 0;
			this.eventHappened = false;
			this.name = name;
			this.expectedPayload = expectedPayload;
		}
	}
	
	public boolean addEvent(String name, String expectedPayload) {
		EventData eventData =  new EventData(name, expectedPayload);
		return expectedEvents.add(eventData);
	}
	
	public boolean deleteEvent(String name) {
		return expectedEvents.removeIf(x -> x.name.equals(name));
	}

	public boolean getEventStatus(String eventName) {
		for(EventData event : expectedEvents){
			if(event.name.equals(eventName))
				return event.eventHappened;
		}
		return false;
	}
	
	public String getEventData(String eventName) {
		for(EventData event : expectedEvents){
			if(event.name.equals(eventName))
				return event.data;
		}
		return null;
	}
	
	public Integer getEventCount(String eventName) {
		for(EventData event : expectedEvents){
			if(event.name.equals(eventName))
				return event.count;
		}
		return null;
	}
	
}