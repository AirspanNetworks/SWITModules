
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for CallTraceProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallTraceProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="CallTraceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceX2" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceS1" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceUu" type="{http://Airspan.Netspan.WebServices}CallTraceLinkDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceSib" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceType" type="{http://Airspan.Netspan.WebServices}CallTraceTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://Airspan.Netspan.WebServices}CallTraceTimeZones" minOccurs="0"/&gt;
 *         &lt;element name="StartDateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDateUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeUtc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Recurrence" type="{http://Airspan.Netspan.WebServices}RecurrenceWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallTraceProfile", propOrder = {
    "name",
    "description",
    "hardwareCategory",
    "callTraceEnabled",
    "traceX2",
    "traceS1",
    "traceUu",
    "traceSib",
    "traceType",
    "timeZone",
    "startDateUtc",
    "endDateUtc",
    "startTimeUtc",
    "endTimeUtc",
    "recurrence"
})
public class CallTraceProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "CallTraceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> callTraceEnabled;
    @XmlElementRef(name = "TraceX2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceMessageDirections> traceX2;
    @XmlElementRef(name = "TraceS1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceMessageDirections> traceS1;
    @XmlElementRef(name = "TraceUu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceLinkDirections> traceUu;
    @XmlElementRef(name = "TraceSib", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> traceSib;
    @XmlElementRef(name = "TraceType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceTypes> traceType;
    @XmlElementRef(name = "TimeZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceTimeZones> timeZone;
    @XmlElement(name = "StartDateUtc")
    protected String startDateUtc;
    @XmlElement(name = "EndDateUtc")
    protected String endDateUtc;
    @XmlElement(name = "StartTimeUtc")
    protected String startTimeUtc;
    @XmlElement(name = "EndTimeUtc")
    protected String endTimeUtc;
    @XmlElement(name = "Recurrence")
    protected RecurrenceWs recurrence;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the callTraceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCallTraceEnabled() {
        return callTraceEnabled;
    }

    /**
     * Sets the value of the callTraceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCallTraceEnabled(JAXBElement<EnabledStates> value) {
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
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getTraceSib() {
        return traceSib;
    }

    /**
     * Sets the value of the traceSib property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setTraceSib(JAXBElement<EnabledStates> value) {
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
     * Gets the value of the startDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateUtc() {
        return startDateUtc;
    }

    /**
     * Sets the value of the startDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateUtc(String value) {
        this.startDateUtc = value;
    }

    /**
     * Gets the value of the endDateUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateUtc() {
        return endDateUtc;
    }

    /**
     * Sets the value of the endDateUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateUtc(String value) {
        this.endDateUtc = value;
    }

    /**
     * Gets the value of the startTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTimeUtc() {
        return startTimeUtc;
    }

    /**
     * Sets the value of the startTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeUtc(String value) {
        this.startTimeUtc = value;
    }

    /**
     * Gets the value of the endTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTimeUtc() {
        return endTimeUtc;
    }

    /**
     * Sets the value of the endTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeUtc(String value) {
        this.endTimeUtc = value;
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
