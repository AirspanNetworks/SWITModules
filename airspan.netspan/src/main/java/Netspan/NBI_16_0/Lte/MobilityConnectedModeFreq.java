
package Netspan.NBI_16_0.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}ConnectedModeEventTypes" minOccurs="0"/>
 *         &lt;element name="TriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RsrqEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RsrqEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="A3Offset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/>
 *         &lt;element name="QOffsetFreq" type="{http://Airspan.Netspan.WebServices}OffsetFreq" minOccurs="0"/>
 *         &lt;element name="RsrqA3OffsetForDualMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RsrqHysteresisForDualMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RsrqTimeToTriggerForDualMode" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/>
 *         &lt;element name="RsrqQOffsetFreqForDualMode" type="{http://Airspan.Netspan.WebServices}OffsetFreq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeFreq", propOrder = {
    "eventType",
    "triggerQuantity",
    "rsrpEventThreshold1",
    "rsrpEventThreshold2",
    "rsrqEventThreshold1",
    "rsrqEventThreshold2",
    "a3Offset",
    "hysteresis",
    "timeToTrigger",
    "qOffsetFreq",
    "rsrqA3OffsetForDualMode",
    "rsrqHysteresisForDualMode",
    "rsrqTimeToTriggerForDualMode",
    "rsrqQOffsetFreqForDualMode"
})
@XmlSeeAlso({
    MobilityConnectedModeInterFreq.class
})
public class MobilityConnectedModeFreq {

    @XmlElementRef(name = "EventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectedModeEventTypes> eventType;
    @XmlElementRef(name = "TriggerQuantity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> triggerQuantity;
    @XmlElementRef(name = "RsrpEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpEventThreshold1;
    @XmlElementRef(name = "RsrpEventThreshold2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpEventThreshold2;
    @XmlElementRef(name = "RsrqEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqEventThreshold1;
    @XmlElementRef(name = "RsrqEventThreshold2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqEventThreshold2;
    @XmlElementRef(name = "A3Offset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> a3Offset;
    @XmlElementRef(name = "Hysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hysteresis;
    @XmlElementRef(name = "TimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeToTrigger;
    @XmlElementRef(name = "QOffsetFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qOffsetFreq;
    @XmlElementRef(name = "RsrqA3OffsetForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqA3OffsetForDualMode;
    @XmlElementRef(name = "RsrqHysteresisForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrqHysteresisForDualMode;
    @XmlElementRef(name = "RsrqTimeToTriggerForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rsrqTimeToTriggerForDualMode;
    @XmlElementRef(name = "RsrqQOffsetFreqForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rsrqQOffsetFreqForDualMode;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}
     *     
     */
    public JAXBElement<ConnectedModeEventTypes> getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}
     *     
     */
    public void setEventType(JAXBElement<ConnectedModeEventTypes> value) {
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
     * Gets the value of the rsrpEventThreshold2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpEventThreshold2() {
        return rsrpEventThreshold2;
    }

    /**
     * Sets the value of the rsrpEventThreshold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpEventThreshold2(JAXBElement<Integer> value) {
        this.rsrpEventThreshold2 = value;
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
     * Gets the value of the rsrqEventThreshold2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrqEventThreshold2() {
        return rsrqEventThreshold2;
    }

    /**
     * Sets the value of the rsrqEventThreshold2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrqEventThreshold2(JAXBElement<BigDecimal> value) {
        this.rsrqEventThreshold2 = value;
    }

    /**
     * Gets the value of the a3Offset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getA3Offset() {
        return a3Offset;
    }

    /**
     * Sets the value of the a3Offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setA3Offset(JAXBElement<BigDecimal> value) {
        this.a3Offset = value;
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
     * Gets the value of the qOffsetFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQOffsetFreq() {
        return qOffsetFreq;
    }

    /**
     * Sets the value of the qOffsetFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQOffsetFreq(JAXBElement<String> value) {
        this.qOffsetFreq = value;
    }

    /**
     * Gets the value of the rsrqA3OffsetForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrqA3OffsetForDualMode() {
        return rsrqA3OffsetForDualMode;
    }

    /**
     * Sets the value of the rsrqA3OffsetForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrqA3OffsetForDualMode(JAXBElement<BigDecimal> value) {
        this.rsrqA3OffsetForDualMode = value;
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

    /**
     * Gets the value of the rsrqQOffsetFreqForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRsrqQOffsetFreqForDualMode() {
        return rsrqQOffsetFreqForDualMode;
    }

    /**
     * Sets the value of the rsrqQOffsetFreqForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRsrqQOffsetFreqForDualMode(JAXBElement<String> value) {
        this.rsrqQOffsetFreqForDualMode = value;
    }

}
