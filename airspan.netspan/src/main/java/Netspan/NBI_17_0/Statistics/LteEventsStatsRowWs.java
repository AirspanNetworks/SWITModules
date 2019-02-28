
package Netspan.NBI_17_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteEventsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEventsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA2RsrpAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA2RsrqAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA3RsrpAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA3RsrqAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA4RsrpAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA4RsrqAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA5RsrpAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA5RsrpAvgTarget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA5RsrqAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventA5RsrqAvgTarget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventB2RsrpAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventB2RsrqAvgSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventB2RscpAvgTarget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventB2EcnoAvgTraget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventInterFreqUnknownNgh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventIntraFreqUnknownNgh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventQualityHoRsrpSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventQualityHoRsrqSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventQualityHoRsrpTarget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventQualityHoRsrqTarget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventInterFreqAvgAttSuccEcgi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventInterFreqSuccEcgiQuery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventInterFreqFailedEcgiQuery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventIntraFreqAvgAttSuccEcgi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventIntraFreqSuccEcgiQuery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EventIntraFreqFailedEcgiQuery" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEventsStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "eventA2RsrpAvgSource",
    "eventA2RsrqAvgSource",
    "eventA3RsrpAvgSource",
    "eventA3RsrqAvgSource",
    "eventA4RsrpAvgSource",
    "eventA4RsrqAvgSource",
    "eventA5RsrpAvgSource",
    "eventA5RsrpAvgTarget",
    "eventA5RsrqAvgSource",
    "eventA5RsrqAvgTarget",
    "eventB2RsrpAvgSource",
    "eventB2RsrqAvgSource",
    "eventB2RscpAvgTarget",
    "eventB2EcnoAvgTraget",
    "eventInterFreqUnknownNgh",
    "eventIntraFreqUnknownNgh",
    "eventQualityHoRsrpSource",
    "eventQualityHoRsrqSource",
    "eventQualityHoRsrpTarget",
    "eventQualityHoRsrqTarget",
    "eventInterFreqAvgAttSuccEcgi",
    "eventInterFreqSuccEcgiQuery",
    "eventInterFreqFailedEcgiQuery",
    "eventIntraFreqAvgAttSuccEcgi",
    "eventIntraFreqSuccEcgiQuery",
    "eventIntraFreqFailedEcgiQuery"
})
public class LteEventsStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "EventA2RsrpAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA2RsrpAvgSource;
    @XmlElementRef(name = "EventA2RsrqAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA2RsrqAvgSource;
    @XmlElementRef(name = "EventA3RsrpAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA3RsrpAvgSource;
    @XmlElementRef(name = "EventA3RsrqAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA3RsrqAvgSource;
    @XmlElementRef(name = "EventA4RsrpAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA4RsrpAvgSource;
    @XmlElementRef(name = "EventA4RsrqAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA4RsrqAvgSource;
    @XmlElementRef(name = "EventA5RsrpAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA5RsrpAvgSource;
    @XmlElementRef(name = "EventA5RsrpAvgTarget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA5RsrpAvgTarget;
    @XmlElementRef(name = "EventA5RsrqAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA5RsrqAvgSource;
    @XmlElementRef(name = "EventA5RsrqAvgTarget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventA5RsrqAvgTarget;
    @XmlElementRef(name = "EventB2RsrpAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventB2RsrpAvgSource;
    @XmlElementRef(name = "EventB2RsrqAvgSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventB2RsrqAvgSource;
    @XmlElementRef(name = "EventB2RscpAvgTarget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventB2RscpAvgTarget;
    @XmlElementRef(name = "EventB2EcnoAvgTraget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventB2EcnoAvgTraget;
    @XmlElementRef(name = "EventInterFreqUnknownNgh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventInterFreqUnknownNgh;
    @XmlElementRef(name = "EventIntraFreqUnknownNgh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventIntraFreqUnknownNgh;
    @XmlElementRef(name = "EventQualityHoRsrpSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventQualityHoRsrpSource;
    @XmlElementRef(name = "EventQualityHoRsrqSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventQualityHoRsrqSource;
    @XmlElementRef(name = "EventQualityHoRsrpTarget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventQualityHoRsrpTarget;
    @XmlElementRef(name = "EventQualityHoRsrqTarget", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventQualityHoRsrqTarget;
    @XmlElementRef(name = "EventInterFreqAvgAttSuccEcgi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventInterFreqAvgAttSuccEcgi;
    @XmlElementRef(name = "EventInterFreqSuccEcgiQuery", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventInterFreqSuccEcgiQuery;
    @XmlElementRef(name = "EventInterFreqFailedEcgiQuery", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventInterFreqFailedEcgiQuery;
    @XmlElementRef(name = "EventIntraFreqAvgAttSuccEcgi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventIntraFreqAvgAttSuccEcgi;
    @XmlElementRef(name = "EventIntraFreqSuccEcgiQuery", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventIntraFreqSuccEcgiQuery;
    @XmlElementRef(name = "EventIntraFreqFailedEcgiQuery", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eventIntraFreqFailedEcgiQuery;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellId(JAXBElement<Integer> value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<Integer> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the eventA2RsrpAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA2RsrpAvgSource() {
        return eventA2RsrpAvgSource;
    }

    /**
     * Sets the value of the eventA2RsrpAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA2RsrpAvgSource(JAXBElement<Integer> value) {
        this.eventA2RsrpAvgSource = value;
    }

    /**
     * Gets the value of the eventA2RsrqAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA2RsrqAvgSource() {
        return eventA2RsrqAvgSource;
    }

    /**
     * Sets the value of the eventA2RsrqAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA2RsrqAvgSource(JAXBElement<Integer> value) {
        this.eventA2RsrqAvgSource = value;
    }

    /**
     * Gets the value of the eventA3RsrpAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA3RsrpAvgSource() {
        return eventA3RsrpAvgSource;
    }

    /**
     * Sets the value of the eventA3RsrpAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA3RsrpAvgSource(JAXBElement<Integer> value) {
        this.eventA3RsrpAvgSource = value;
    }

    /**
     * Gets the value of the eventA3RsrqAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA3RsrqAvgSource() {
        return eventA3RsrqAvgSource;
    }

    /**
     * Sets the value of the eventA3RsrqAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA3RsrqAvgSource(JAXBElement<Integer> value) {
        this.eventA3RsrqAvgSource = value;
    }

    /**
     * Gets the value of the eventA4RsrpAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA4RsrpAvgSource() {
        return eventA4RsrpAvgSource;
    }

    /**
     * Sets the value of the eventA4RsrpAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA4RsrpAvgSource(JAXBElement<Integer> value) {
        this.eventA4RsrpAvgSource = value;
    }

    /**
     * Gets the value of the eventA4RsrqAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA4RsrqAvgSource() {
        return eventA4RsrqAvgSource;
    }

    /**
     * Sets the value of the eventA4RsrqAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA4RsrqAvgSource(JAXBElement<Integer> value) {
        this.eventA4RsrqAvgSource = value;
    }

    /**
     * Gets the value of the eventA5RsrpAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA5RsrpAvgSource() {
        return eventA5RsrpAvgSource;
    }

    /**
     * Sets the value of the eventA5RsrpAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA5RsrpAvgSource(JAXBElement<Integer> value) {
        this.eventA5RsrpAvgSource = value;
    }

    /**
     * Gets the value of the eventA5RsrpAvgTarget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA5RsrpAvgTarget() {
        return eventA5RsrpAvgTarget;
    }

    /**
     * Sets the value of the eventA5RsrpAvgTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA5RsrpAvgTarget(JAXBElement<Integer> value) {
        this.eventA5RsrpAvgTarget = value;
    }

    /**
     * Gets the value of the eventA5RsrqAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA5RsrqAvgSource() {
        return eventA5RsrqAvgSource;
    }

    /**
     * Sets the value of the eventA5RsrqAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA5RsrqAvgSource(JAXBElement<Integer> value) {
        this.eventA5RsrqAvgSource = value;
    }

    /**
     * Gets the value of the eventA5RsrqAvgTarget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventA5RsrqAvgTarget() {
        return eventA5RsrqAvgTarget;
    }

    /**
     * Sets the value of the eventA5RsrqAvgTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventA5RsrqAvgTarget(JAXBElement<Integer> value) {
        this.eventA5RsrqAvgTarget = value;
    }

    /**
     * Gets the value of the eventB2RsrpAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventB2RsrpAvgSource() {
        return eventB2RsrpAvgSource;
    }

    /**
     * Sets the value of the eventB2RsrpAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventB2RsrpAvgSource(JAXBElement<Integer> value) {
        this.eventB2RsrpAvgSource = value;
    }

    /**
     * Gets the value of the eventB2RsrqAvgSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventB2RsrqAvgSource() {
        return eventB2RsrqAvgSource;
    }

    /**
     * Sets the value of the eventB2RsrqAvgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventB2RsrqAvgSource(JAXBElement<Integer> value) {
        this.eventB2RsrqAvgSource = value;
    }

    /**
     * Gets the value of the eventB2RscpAvgTarget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventB2RscpAvgTarget() {
        return eventB2RscpAvgTarget;
    }

    /**
     * Sets the value of the eventB2RscpAvgTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventB2RscpAvgTarget(JAXBElement<Integer> value) {
        this.eventB2RscpAvgTarget = value;
    }

    /**
     * Gets the value of the eventB2EcnoAvgTraget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventB2EcnoAvgTraget() {
        return eventB2EcnoAvgTraget;
    }

    /**
     * Sets the value of the eventB2EcnoAvgTraget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventB2EcnoAvgTraget(JAXBElement<Integer> value) {
        this.eventB2EcnoAvgTraget = value;
    }

    /**
     * Gets the value of the eventInterFreqUnknownNgh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventInterFreqUnknownNgh() {
        return eventInterFreqUnknownNgh;
    }

    /**
     * Sets the value of the eventInterFreqUnknownNgh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventInterFreqUnknownNgh(JAXBElement<Integer> value) {
        this.eventInterFreqUnknownNgh = value;
    }

    /**
     * Gets the value of the eventIntraFreqUnknownNgh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventIntraFreqUnknownNgh() {
        return eventIntraFreqUnknownNgh;
    }

    /**
     * Sets the value of the eventIntraFreqUnknownNgh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventIntraFreqUnknownNgh(JAXBElement<Integer> value) {
        this.eventIntraFreqUnknownNgh = value;
    }

    /**
     * Gets the value of the eventQualityHoRsrpSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventQualityHoRsrpSource() {
        return eventQualityHoRsrpSource;
    }

    /**
     * Sets the value of the eventQualityHoRsrpSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventQualityHoRsrpSource(JAXBElement<Integer> value) {
        this.eventQualityHoRsrpSource = value;
    }

    /**
     * Gets the value of the eventQualityHoRsrqSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventQualityHoRsrqSource() {
        return eventQualityHoRsrqSource;
    }

    /**
     * Sets the value of the eventQualityHoRsrqSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventQualityHoRsrqSource(JAXBElement<Integer> value) {
        this.eventQualityHoRsrqSource = value;
    }

    /**
     * Gets the value of the eventQualityHoRsrpTarget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventQualityHoRsrpTarget() {
        return eventQualityHoRsrpTarget;
    }

    /**
     * Sets the value of the eventQualityHoRsrpTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventQualityHoRsrpTarget(JAXBElement<Integer> value) {
        this.eventQualityHoRsrpTarget = value;
    }

    /**
     * Gets the value of the eventQualityHoRsrqTarget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventQualityHoRsrqTarget() {
        return eventQualityHoRsrqTarget;
    }

    /**
     * Sets the value of the eventQualityHoRsrqTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventQualityHoRsrqTarget(JAXBElement<Integer> value) {
        this.eventQualityHoRsrqTarget = value;
    }

    /**
     * Gets the value of the eventInterFreqAvgAttSuccEcgi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventInterFreqAvgAttSuccEcgi() {
        return eventInterFreqAvgAttSuccEcgi;
    }

    /**
     * Sets the value of the eventInterFreqAvgAttSuccEcgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventInterFreqAvgAttSuccEcgi(JAXBElement<Integer> value) {
        this.eventInterFreqAvgAttSuccEcgi = value;
    }

    /**
     * Gets the value of the eventInterFreqSuccEcgiQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventInterFreqSuccEcgiQuery() {
        return eventInterFreqSuccEcgiQuery;
    }

    /**
     * Sets the value of the eventInterFreqSuccEcgiQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventInterFreqSuccEcgiQuery(JAXBElement<Integer> value) {
        this.eventInterFreqSuccEcgiQuery = value;
    }

    /**
     * Gets the value of the eventInterFreqFailedEcgiQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventInterFreqFailedEcgiQuery() {
        return eventInterFreqFailedEcgiQuery;
    }

    /**
     * Sets the value of the eventInterFreqFailedEcgiQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventInterFreqFailedEcgiQuery(JAXBElement<Integer> value) {
        this.eventInterFreqFailedEcgiQuery = value;
    }

    /**
     * Gets the value of the eventIntraFreqAvgAttSuccEcgi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventIntraFreqAvgAttSuccEcgi() {
        return eventIntraFreqAvgAttSuccEcgi;
    }

    /**
     * Sets the value of the eventIntraFreqAvgAttSuccEcgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventIntraFreqAvgAttSuccEcgi(JAXBElement<Integer> value) {
        this.eventIntraFreqAvgAttSuccEcgi = value;
    }

    /**
     * Gets the value of the eventIntraFreqSuccEcgiQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventIntraFreqSuccEcgiQuery() {
        return eventIntraFreqSuccEcgiQuery;
    }

    /**
     * Sets the value of the eventIntraFreqSuccEcgiQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventIntraFreqSuccEcgiQuery(JAXBElement<Integer> value) {
        this.eventIntraFreqSuccEcgiQuery = value;
    }

    /**
     * Gets the value of the eventIntraFreqFailedEcgiQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEventIntraFreqFailedEcgiQuery() {
        return eventIntraFreqFailedEcgiQuery;
    }

    /**
     * Sets the value of the eventIntraFreqFailedEcgiQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEventIntraFreqFailedEcgiQuery(JAXBElement<Integer> value) {
        this.eventIntraFreqFailedEcgiQuery = value;
    }

}
