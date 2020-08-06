
package Netspan.NBI_18_0.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityInterRatMeasCfgEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityInterRatMeasCfgEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RatType" type="{http://Airspan.Netspan.WebServices}InterRatTypes" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://Airspan.Netspan.WebServices}InterRatPurposes" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}InterRatEventTypeValues" minOccurs="0"/&gt;
 *         &lt;element name="TriggerQuantityLte" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/&gt;
 *         &lt;element name="EventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EventThreshold2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}MobilityTimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="MaxReportedCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportInterval" type="{http://Airspan.Netspan.WebServices}InterRatReportInterval" minOccurs="0"/&gt;
 *         &lt;element name="ReportAmount" type="{http://Airspan.Netspan.WebServices}MobilityReportAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityInterRatMeasCfgEntryWs", propOrder = {
    "ratType",
    "purpose",
    "eventType",
    "triggerQuantityLte",
    "eventThreshold1",
    "eventThreshold2",
    "hysteresis",
    "timeToTrigger",
    "maxReportedCells",
    "reportInterval",
    "reportAmount"
})
public class MobilityInterRatMeasCfgEntryWs {

    @XmlElementRef(name = "RatType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<InterRatTypes> ratType;
    @XmlElementRef(name = "Purpose", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<InterRatPurposes> purpose;
    @XmlElementRef(name = "EventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<InterRatEventTypeValues> eventType;
    @XmlElementRef(name = "TriggerQuantityLte", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> triggerQuantityLte;
    @XmlElementRef(name = "EventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> eventThreshold1;
    @XmlElementRef(name = "EventThreshold2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> eventThreshold2;
    @XmlElementRef(name = "Hysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hysteresis;
    @XmlElementRef(name = "TimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeToTrigger;
    @XmlElementRef(name = "MaxReportedCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReportedCells;
    @XmlElementRef(name = "ReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportInterval;
    @XmlElementRef(name = "ReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportAmount;

    /**
     * Gets the value of the ratType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterRatTypes }{@code >}
     *     
     */
    public JAXBElement<InterRatTypes> getRatType() {
        return ratType;
    }

    /**
     * Sets the value of the ratType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterRatTypes }{@code >}
     *     
     */
    public void setRatType(JAXBElement<InterRatTypes> value) {
        this.ratType = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterRatPurposes }{@code >}
     *     
     */
    public JAXBElement<InterRatPurposes> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterRatPurposes }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<InterRatPurposes> value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterRatEventTypeValues }{@code >}
     *     
     */
    public JAXBElement<InterRatEventTypeValues> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterRatEventTypeValues }{@code >}
     *     
     */
    public void setEventType(JAXBElement<InterRatEventTypeValues> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the triggerQuantityLte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerQuantityTypes> getTriggerQuantityLte() {
        return triggerQuantityLte;
    }

    /**
     * Sets the value of the triggerQuantityLte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public void setTriggerQuantityLte(JAXBElement<TriggerQuantityTypes> value) {
        this.triggerQuantityLte = value;
    }

    /**
     * Gets the value of the eventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEventThreshold1() {
        return eventThreshold1;
    }

    /**
     * Sets the value of the eventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEventThreshold1(JAXBElement<BigDecimal> value) {
        this.eventThreshold1 = value;
    }

    /**
     * Gets the value of the eventThreshold2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEventThreshold2() {
        return eventThreshold2;
    }

    /**
     * Sets the value of the eventThreshold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEventThreshold2(JAXBElement<BigDecimal> value) {
        this.eventThreshold2 = value;
    }

    /**
     * Gets the value of the hysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHysteresis() {
        return hysteresis;
    }

    /**
     * Sets the value of the hysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHysteresis(JAXBElement<BigDecimal> value) {
        this.hysteresis = value;
    }

    /**
     * Gets the value of the timeToTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeToTrigger() {
        return timeToTrigger;
    }

    /**
     * Sets the value of the timeToTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeToTrigger(JAXBElement<String> value) {
        this.timeToTrigger = value;
    }

    /**
     * Gets the value of the maxReportedCells property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxReportedCells() {
        return maxReportedCells;
    }

    /**
     * Sets the value of the maxReportedCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxReportedCells(JAXBElement<Integer> value) {
        this.maxReportedCells = value;
    }

    /**
     * Gets the value of the reportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportInterval() {
        return reportInterval;
    }

    /**
     * Sets the value of the reportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportInterval(JAXBElement<String> value) {
        this.reportInterval = value;
    }

    /**
     * Gets the value of the reportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportAmount() {
        return reportAmount;
    }

    /**
     * Sets the value of the reportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportAmount(JAXBElement<String> value) {
        this.reportAmount = value;
    }

}
