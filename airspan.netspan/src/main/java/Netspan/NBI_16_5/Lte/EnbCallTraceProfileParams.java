
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EnbCallTraceProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbCallTraceProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallTraceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceX2" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceS1" type="{http://Airspan.Netspan.WebServices}CallTraceMessageDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceUu" type="{http://Airspan.Netspan.WebServices}CallTraceLinkDirections" minOccurs="0"/&gt;
 *         &lt;element name="TraceSib" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceL1" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TraceType" type="{http://Airspan.Netspan.WebServices}CallTraceTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://Airspan.Netspan.WebServices}CallTraceTimeZones" minOccurs="0"/&gt;
 *         &lt;element name="IsStartDateTimeEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Recurrence" type="{http://Airspan.Netspan.WebServices}RecurrenceWs" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ActivationMode" type="{http://Airspan.Netspan.WebServices}ActivationModesWs" minOccurs="0"/&gt;
 *         &lt;element name="TraceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="MdtEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceX2" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceS1" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceUu" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfUes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ManagementActivationMode" type="{http://Airspan.Netspan.WebServices}ManagementActivationModesWs" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceList" type="{http://Airspan.Netspan.WebServices}UeTraceListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "traceL1",
    "traceType",
    "timeZone",
    "isStartDateTimeEnable",
    "startDateUtc",
    "endDateUtc",
    "recurrence",
    "ueTraceEnabled",
    "activationMode",
    "traceEnabled",
    "mdtEnabled",
    "ueTraceX2",
    "ueTraceS1",
    "ueTraceUu",
    "numberOfUes",
    "managementActivationMode",
    "ueTraceList"
})
@XmlSeeAlso({
    CallTraceProfile.class
})
public class EnbCallTraceProfileParams {

    @XmlElement(name = "Description")
    protected String description;
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
    @XmlElementRef(name = "TraceL1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> traceL1;
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
    @XmlElementRef(name = "UeTraceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ueTraceEnabled;
    @XmlElementRef(name = "ActivationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivationModesWs> activationMode;
    @XmlElementRef(name = "TraceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> traceEnabled;
    @XmlElementRef(name = "MdtEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> mdtEnabled;
    @XmlElementRef(name = "UeTraceX2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ueTraceX2;
    @XmlElementRef(name = "UeTraceS1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ueTraceS1;
    @XmlElementRef(name = "UeTraceUu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ueTraceUu;
    @XmlElementRef(name = "NumberOfUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfUes;
    @XmlElementRef(name = "ManagementActivationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ManagementActivationModesWs> managementActivationMode;
    @XmlElement(name = "UeTraceList")
    protected UeTraceListContainer ueTraceList;

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
     * Gets the value of the traceL1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getTraceL1() {
        return traceL1;
    }

    /**
     * Sets the value of the traceL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setTraceL1(JAXBElement<EnabledStates> value) {
        this.traceL1 = value;
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

    /**
     * Gets the value of the ueTraceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUeTraceEnabled() {
        return ueTraceEnabled;
    }

    /**
     * Sets the value of the ueTraceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUeTraceEnabled(JAXBElement<EnabledStates> value) {
        this.ueTraceEnabled = value;
    }

    /**
     * Gets the value of the activationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivationModesWs }{@code >}
     *     
     */
    public JAXBElement<ActivationModesWs> getActivationMode() {
        return activationMode;
    }

    /**
     * Sets the value of the activationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivationModesWs }{@code >}
     *     
     */
    public void setActivationMode(JAXBElement<ActivationModesWs> value) {
        this.activationMode = value;
    }

    /**
     * Gets the value of the traceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getTraceEnabled() {
        return traceEnabled;
    }

    /**
     * Sets the value of the traceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setTraceEnabled(JAXBElement<EnabledStates> value) {
        this.traceEnabled = value;
    }

    /**
     * Gets the value of the mdtEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getMdtEnabled() {
        return mdtEnabled;
    }

    /**
     * Sets the value of the mdtEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setMdtEnabled(JAXBElement<EnabledStates> value) {
        this.mdtEnabled = value;
    }

    /**
     * Gets the value of the ueTraceX2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUeTraceX2() {
        return ueTraceX2;
    }

    /**
     * Sets the value of the ueTraceX2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUeTraceX2(JAXBElement<EnabledStates> value) {
        this.ueTraceX2 = value;
    }

    /**
     * Gets the value of the ueTraceS1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUeTraceS1() {
        return ueTraceS1;
    }

    /**
     * Sets the value of the ueTraceS1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUeTraceS1(JAXBElement<EnabledStates> value) {
        this.ueTraceS1 = value;
    }

    /**
     * Gets the value of the ueTraceUu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUeTraceUu() {
        return ueTraceUu;
    }

    /**
     * Sets the value of the ueTraceUu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUeTraceUu(JAXBElement<EnabledStates> value) {
        this.ueTraceUu = value;
    }

    /**
     * Gets the value of the numberOfUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfUes() {
        return numberOfUes;
    }

    /**
     * Sets the value of the numberOfUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfUes(JAXBElement<Integer> value) {
        this.numberOfUes = value;
    }

    /**
     * Gets the value of the managementActivationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ManagementActivationModesWs }{@code >}
     *     
     */
    public JAXBElement<ManagementActivationModesWs> getManagementActivationMode() {
        return managementActivationMode;
    }

    /**
     * Sets the value of the managementActivationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ManagementActivationModesWs }{@code >}
     *     
     */
    public void setManagementActivationMode(JAXBElement<ManagementActivationModesWs> value) {
        this.managementActivationMode = value;
    }

    /**
     * Gets the value of the ueTraceList property.
     * 
     * @return
     *     possible object is
     *     {@link UeTraceListContainer }
     *     
     */
    public UeTraceListContainer getUeTraceList() {
        return ueTraceList;
    }

    /**
     * Sets the value of the ueTraceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeTraceListContainer }
     *     
     */
    public void setUeTraceList(UeTraceListContainer value) {
        this.ueTraceList = value;
    }

}
