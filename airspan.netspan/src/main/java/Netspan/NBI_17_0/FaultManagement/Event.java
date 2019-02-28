
package Netspan.NBI_17_0.FaultManagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceType" type="{http://Airspan.Netspan.WebServices}SourceType"/&gt;
 *         &lt;element name="SourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceIfIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SourceMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "eventId",
    "eventTypeId",
    "eventType",
    "sourceType",
    "sourceName",
    "sourceId",
    "sourceIfIndex",
    "sourceMacAddress",
    "sourceUniqueId",
    "eventInfo",
    "eventStatus",
    "hardwareType",
    "receivedTime"
})
public class Event {

    @XmlElementRef(name = "EventId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventId;
    @XmlElementRef(name = "EventTypeId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventTypeId;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "SourceType", required = true)
    protected String sourceType;
    @XmlElement(name = "SourceName")
    protected String sourceName;
    @XmlElement(name = "SourceId")
    protected String sourceId;
    @XmlElementRef(name = "SourceIfIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceIfIndex;
    @XmlElement(name = "SourceMacAddress")
    protected String sourceMacAddress;
    @XmlElement(name = "SourceUniqueId")
    protected String sourceUniqueId;
    @XmlElement(name = "EventInfo")
    protected String eventInfo;
    @XmlElement(name = "EventStatus")
    protected String eventStatus;
    @XmlElement(name = "HardwareType")
    protected String hardwareType;
    @XmlElementRef(name = "ReceivedTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> receivedTime;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventId(JAXBElement<Integer> value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventTypeId() {
        return eventTypeId;
    }

    /**
     * Sets the value of the eventTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventTypeId(JAXBElement<Integer> value) {
        this.eventTypeId = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the sourceIfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceIfIndex() {
        return sourceIfIndex;
    }

    /**
     * Sets the value of the sourceIfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceIfIndex(JAXBElement<Integer> value) {
        this.sourceIfIndex = value;
    }

    /**
     * Gets the value of the sourceMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceMacAddress() {
        return sourceMacAddress;
    }

    /**
     * Sets the value of the sourceMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceMacAddress(String value) {
        this.sourceMacAddress = value;
    }

    /**
     * Gets the value of the sourceUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUniqueId() {
        return sourceUniqueId;
    }

    /**
     * Sets the value of the sourceUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUniqueId(String value) {
        this.sourceUniqueId = value;
    }

    /**
     * Gets the value of the eventInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventInfo() {
        return eventInfo;
    }

    /**
     * Sets the value of the eventInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventInfo(String value) {
        this.eventInfo = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatus(String value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the hardwareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareType() {
        return hardwareType;
    }

    /**
     * Sets the value of the hardwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareType(String value) {
        this.hardwareType = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReceivedTime(JAXBElement<XMLGregorianCalendar> value) {
        this.receivedTime = value;
    }

}
