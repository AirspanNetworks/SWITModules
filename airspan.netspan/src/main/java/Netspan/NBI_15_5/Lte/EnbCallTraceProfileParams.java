
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbCallTraceProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbCallTraceProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTraceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="TraceX2" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/>
 *         &lt;element name="TraceS1" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/>
 *         &lt;element name="TraceUu" type="{http://Airspan.Netspan.WebServices}CallTraceLinkDirections" minOccurs="0"/>
 *         &lt;element name="TraceSib" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="TraceType" type="{http://Airspan.Netspan.WebServices}CallTraceTypes" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://Airspan.Netspan.WebServices}CallTraceTimeZones" minOccurs="0"/>
 *         &lt;element name="IsStartDateTimeEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Recurrence" type="{http://Airspan.Netspan.WebServices}RecurrenceWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbCallTraceProfileParams", propOrder = {
    "description",
    "callTraceEnabled",
    "traceX2",
    "traceS1",
    "traceUu",
    "traceSib",
    "traceType",
    "timeZone",
    "isStartDateTimeEnable",
    "startDateUtc",
    "endDateUtc",
    "recurrence"
})
@XmlSeeAlso({
    CallTraceProfile.class
})
public class EnbCallTraceProfileParams {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "CallTraceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> callTraceEnabled;
    @XmlElementRef(name = "TraceX2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceMessageDirections> traceX2;
    @XmlElementRef(name = "TraceS1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceMessageDirections> traceS1;
    @XmlElementRef(name = "TraceUu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceLinkDirections> traceUu;
    @XmlElementRef(name = "TraceSib", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> traceSib;
    @XmlElementRef(name = "TraceType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceTypes> traceType;
    @XmlElementRef(name = "TimeZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceTimeZones> timeZone;
    @XmlElementRef(name = "IsStartDateTimeEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStartDateTimeEnable;
    @XmlElementRef(name = "StartDateUtc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateUtc;
    @XmlElementRef(name = "EndDateUtc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateUtc;
    @XmlElement(name = "Recurrence")
    protected RecurrenceWs recurrence;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the callTraceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCallTraceEnabled() {
        return callTraceEnabled;
    }

    /**
     * Sets the value of the callTraceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCallTraceEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.callTraceEnabled = value;
    }

    /**
     * Gets the value of the traceX2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceMessageDirections }{@code >}
     *     
     */
    public JAXBElement<CallTraceMessageDirections> getTraceX2() {
        return traceX2;
    }

    /**
     * Sets the value of the traceX2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceMessageDirections }{@code >}
     *     
     */
    public void setTraceX2(JAXBElement<CallTraceMessageDirections> value) {
        this.traceX2 = value;
    }

    /**
     * Gets the value of the traceS1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceMessageDirections }{@code >}
     *     
     */
    public JAXBElement<CallTraceMessageDirections> getTraceS1() {
        return traceS1;
    }

    /**
     * Sets the value of the traceS1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceMessageDirections }{@code >}
     *     
     */
    public void setTraceS1(JAXBElement<CallTraceMessageDirections> value) {
        this.traceS1 = value;
    }

    /**
     * Gets the value of the traceUu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceLinkDirections }{@code >}
     *     
     */
    public JAXBElement<CallTraceLinkDirections> getTraceUu() {
        return traceUu;
    }

    /**
     * Sets the value of the traceUu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceLinkDirections }{@code >}
     *     
     */
    public void setTraceUu(JAXBElement<CallTraceLinkDirections> value) {
        this.traceUu = value;
    }

    /**
     * Gets the value of the traceSib property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTraceSib() {
        return traceSib;
    }

    /**
     * Sets the value of the traceSib property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTraceSib(JAXBElement<EnabledDisabledStates> value) {
        this.traceSib = value;
    }

    /**
     * Gets the value of the traceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceTypes }{@code >}
     *     
     */
    public JAXBElement<CallTraceTypes> getTraceType() {
        return traceType;
    }

    /**
     * Sets the value of the traceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceTypes }{@code >}
     *     
     */
    public void setTraceType(JAXBElement<CallTraceTypes> value) {
        this.traceType = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceTimeZones }{@code >}
     *     
     */
    public JAXBElement<CallTraceTimeZones> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceTimeZones }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<CallTraceTimeZones> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the isStartDateTimeEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStartDateTimeEnable() {
        return isStartDateTimeEnable;
    }

    /**
     * Sets the value of the isStartDateTimeEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStartDateTimeEnable(JAXBElement<Boolean> value) {
        this.isStartDateTimeEnable = value;
    }

    /**
     * Gets the value of the startDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateUtc() {
        return startDateUtc;
    }

    /**
     * Sets the value of the startDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateUtc(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateUtc = value;
    }

    /**
     * Gets the value of the endDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateUtc() {
        return endDateUtc;
    }

    /**
     * Sets the value of the endDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateUtc(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateUtc = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceWs }
     *     
     */
    public RecurrenceWs getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceWs }
     *     
     */
    public void setRecurrence(RecurrenceWs value) {
        this.recurrence = value;
    }

}
