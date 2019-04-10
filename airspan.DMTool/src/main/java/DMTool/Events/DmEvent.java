package DMTool.Events;

import DMTool.Util;

public class DmEvent {
	private long time;
	private int eventType;
	private int messageLength;
	private int messageType;
	private int payloadLength;
	private int earfcn;
	private int pci;
	private short[] payload;
	
	public enum DmEventType{
		RRC_ASN_MSG(115);
		
		private final int number;

	    private DmEventType(int number) {
	        this.number = number;
	    }

	    public int getEventType() {
	        return number;
	    }
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("time is: ").append(time).append("\n");
		sb.append("eventType is: ").append(eventType).append("\n");
		sb.append("messageLength is: ").append(messageLength).append("\n");
		sb.append("messageType is: ").append(messageType).append("\n");
		sb.append("payloadLength is: ").append(payloadLength).append("\n");
		sb.append("earfcn is: ").append(earfcn).append("\n");
		sb.append("pci is: ").append(pci).append("\n");
		sb.append("payload is: ").append(Util.shortToHex(payload)).append("\n");
		return sb.toString();
	}
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getEventType() {
		return eventType;
	}
	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	public int getMessageLength() {
		return messageLength;
	}
	public void setMessageLength(int messageLength) {
		this.messageLength = messageLength;
	}
	public int getMessageType() {
		return messageType;
	}
	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}
	public int getPayloadLength() {
		return payloadLength;
	}
	public void setPayloadLength(int payloadLength) {
		this.payloadLength = payloadLength;
	}
	public int getEarfcn() {
		return earfcn;
	}
	public void setEarfcn(int earfcn) {
		this.earfcn = earfcn;
	}
	public int getPci() {
		return pci;
	}
	public void setPci(int pci) {
		this.pci = pci;
	}
	public short[] getPayload() {
		return payload;
	}
	public void setPayload(short[] payload) {
		this.payload = payload;
	}
}
