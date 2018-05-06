package Netspan.API.Lte;

import javax.xml.datatype.XMLGregorianCalendar;

public class EventInfo {
	protected Integer eventId;
    protected Integer eventTypeId;
    protected String eventType;
    protected String sourceType;
    protected String sourceName;
    protected String sourceId;
    protected Integer sourceIfIndex;
    protected String sourceMacAddress;
	protected String sourceUniqueId;
    protected String eventInfo;
    protected XMLGregorianCalendar receivedTime;
    
    public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public Integer getEventTypeId() {
		return eventTypeId;
	}
	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public Integer getSourceIfIndex() {
		return sourceIfIndex;
	}
	public void setSourceIfIndex(Integer sourceIfIndex) {
		this.sourceIfIndex = sourceIfIndex;
	}
	public String getSourceMacAddress() {
		return sourceMacAddress;
	}
	public void setSourceMacAddress(String sourceMacAddress) {
		this.sourceMacAddress = sourceMacAddress;
	}
	public String getSourceUniqueId() {
		return sourceUniqueId;
	}
	public void setSourceUniqueId(String sourceUniqueId) {
		this.sourceUniqueId = sourceUniqueId;
	}
	public String getEventInfo() {
		return eventInfo;
	}
	public void setEventInfo(String eventInfo) {
		this.eventInfo = eventInfo;
	}
	public XMLGregorianCalendar getReceivedTime() {
		return receivedTime;
	}
	public void setReceivedTime(XMLGregorianCalendar receivedTime) {
		this.receivedTime = receivedTime;
	}
}
