
package Netspan.NBI_16_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.TriggerGapEventTypes;
import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeTriggerGaps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeTriggerGaps"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}TriggerGapEventTypes" minOccurs="0"/&gt;
 *         &lt;element name="TriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/&gt;
 *         &lt;element name="RsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrqEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="RsrqHysteresisForDualMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RsrqTimeToTriggerForDualMode" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeTriggerGaps", propOrder = {
    "eventType",
    "triggerQuantity",
    "rsrpEventThreshold1",
    "rsrqEventThreshold1",
    "hysteresis",
    "timeToTrigger",
    "rsrqHysteresisForDualMode",
    "rsrqTimeToTriggerForDualMode"
})
public class MobilityConnectedModeTriggerGaps {

    @XmlElementRef(name = "EventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerGapEventTypes> eventType;
    @XmlElementRef(name = "TriggerQuantity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> triggerQuantity;
    @XmlElementRef(name = "RsrpEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpEventThreshold1;
    @XmlElementRef(name = "RsrqEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqEventThreshold1;
    @XmlElementRef(name = "Hysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hysteresis;
    @XmlElementRef(name = "TimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeToTrigger;
    @XmlElementRef(name = "RsrqHysteresisForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqHysteresisForDualMode;
    @XmlElementRef(name = "RsrqTimeToTriggerForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rsrqTimeToTriggerForDualMode;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerGapEventTypes> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}
     *     
     */
    public void setEventType(JAXBElement<TriggerGapEventTypes> value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the triggerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerQuantityTypes> getTriggerQuantity() {
        return triggerQuantity;
    }

    /**
     * Sets the value of the triggerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public void setTriggerQuantity(JAXBElement<TriggerQuantityTypes> value) {
        this.triggerQuantity = value;
    }

    /**
     * Gets the value of the rsrpEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpEventThreshold1() {
        return rsrpEventThreshold1;
    }

    /**
     * Sets the value of the rsrpEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpEventThreshold1(JAXBElement<Integer> value) {
        this.rsrpEventThreshold1 = value;
    }

    /**
     * Gets the value of the rsrqEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrqEventThreshold1() {
        return rsrqEventThreshold1;
    }

    /**
     * Sets the value of the rsrqEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrqEventThreshold1(JAXBElement<BigDecimal> value) {
        this.rsrqEventThreshold1 = value;
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
     * Gets the value of the rsrqHysteresisForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrqHysteresisForDualMode() {
        return rsrqHysteresisForDualMode;
    }

    /**
     * Sets the value of the rsrqHysteresisForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrqHysteresisForDualMode(JAXBElement<BigDecimal> value) {
        this.rsrqHysteresisForDualMode = value;
    }

    /**
     * Gets the value of the rsrqTimeToTriggerForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRsrqTimeToTriggerForDualMode() {
        return rsrqTimeToTriggerForDualMode;
    }

    /**
     * Sets the value of the rsrqTimeToTriggerForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRsrqTimeToTriggerForDualMode(JAXBElement<String> value) {
        this.rsrqTimeToTriggerForDualMode = value;
    }

}
