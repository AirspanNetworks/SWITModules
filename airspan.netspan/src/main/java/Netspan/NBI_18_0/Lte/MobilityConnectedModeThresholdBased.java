
package Netspan.NBI_18_0.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.StopGapEventTypes;
import Netspan.API.Enums.TriggerGapEventTypes;
import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeThresholdBased complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeThresholdBased"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TriggerGapsEventType" type="{http://Airspan.Netspan.WebServices}TriggerGapEventTypes" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsTriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsRsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsRsrqEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsHysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsTimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsRsrqHysteresisForDualMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TriggerGapsRsrqTimeToTriggerForDualMode" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsEventType" type="{http://Airspan.Netspan.WebServices}StopGapEventTypes" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsTriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsRsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsRsrqEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsHysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsTimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsRsrqHysteresisForDualMode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="StopGapsRsrqTimeToTriggerForDualMode" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/&gt;
 *         &lt;element name="Qci" type="{http://Airspan.Netspan.WebServices}QciValues" minOccurs="0"/&gt;
 *         &lt;element name="Hpue" type="{http://Airspan.Netspan.WebServices}HpueValues" minOccurs="0"/&gt;
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeThresholdBased", propOrder = {
    "triggerGapsEventType",
    "triggerGapsTriggerQuantity",
    "triggerGapsRsrpEventThreshold1",
    "triggerGapsRsrqEventThreshold1",
    "triggerGapsHysteresis",
    "triggerGapsTimeToTrigger",
    "triggerGapsRsrqHysteresisForDualMode",
    "triggerGapsRsrqTimeToTriggerForDualMode",
    "stopGapsEventType",
    "stopGapsTriggerQuantity",
    "stopGapsRsrpEventThreshold1",
    "stopGapsRsrqEventThreshold1",
    "stopGapsHysteresis",
    "stopGapsTimeToTrigger",
    "stopGapsRsrqHysteresisForDualMode",
    "stopGapsRsrqTimeToTriggerForDualMode",
    "qci",
    "hpue",
    "isDefault"
})
public class MobilityConnectedModeThresholdBased {

    @XmlElementRef(name = "TriggerGapsEventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerGapEventTypes> triggerGapsEventType;
    @XmlElementRef(name = "TriggerGapsTriggerQuantity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> triggerGapsTriggerQuantity;
    @XmlElementRef(name = "TriggerGapsRsrpEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> triggerGapsRsrpEventThreshold1;
    @XmlElementRef(name = "TriggerGapsRsrqEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> triggerGapsRsrqEventThreshold1;
    @XmlElementRef(name = "TriggerGapsHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> triggerGapsHysteresis;
    @XmlElementRef(name = "TriggerGapsTimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> triggerGapsTimeToTrigger;
    @XmlElementRef(name = "TriggerGapsRsrqHysteresisForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> triggerGapsRsrqHysteresisForDualMode;
    @XmlElementRef(name = "TriggerGapsRsrqTimeToTriggerForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> triggerGapsRsrqTimeToTriggerForDualMode;
    @XmlElementRef(name = "StopGapsEventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<StopGapEventTypes> stopGapsEventType;
    @XmlElementRef(name = "StopGapsTriggerQuantity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> stopGapsTriggerQuantity;
    @XmlElementRef(name = "StopGapsRsrpEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stopGapsRsrpEventThreshold1;
    @XmlElementRef(name = "StopGapsRsrqEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stopGapsRsrqEventThreshold1;
    @XmlElementRef(name = "StopGapsHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stopGapsHysteresis;
    @XmlElementRef(name = "StopGapsTimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopGapsTimeToTrigger;
    @XmlElementRef(name = "StopGapsRsrqHysteresisForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> stopGapsRsrqHysteresisForDualMode;
    @XmlElementRef(name = "StopGapsRsrqTimeToTriggerForDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopGapsRsrqTimeToTriggerForDualMode;
    @XmlElementRef(name = "Qci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<QciValues> qci;
    @XmlElementRef(name = "Hpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HpueValues> hpue;
    @XmlElementRef(name = "IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDefault;

    /**
     * Gets the value of the triggerGapsEventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerGapEventTypes> getTriggerGapsEventType() {
        return triggerGapsEventType;
    }

    /**
     * Sets the value of the triggerGapsEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}
     *     
     */
    public void setTriggerGapsEventType(JAXBElement<TriggerGapEventTypes> value) {
        this.triggerGapsEventType = value;
    }

    /**
     * Gets the value of the triggerGapsTriggerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerQuantityTypes> getTriggerGapsTriggerQuantity() {
        return triggerGapsTriggerQuantity;
    }

    /**
     * Sets the value of the triggerGapsTriggerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public void setTriggerGapsTriggerQuantity(JAXBElement<TriggerQuantityTypes> value) {
        this.triggerGapsTriggerQuantity = value;
    }

    /**
     * Gets the value of the triggerGapsRsrpEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTriggerGapsRsrpEventThreshold1() {
        return triggerGapsRsrpEventThreshold1;
    }

    /**
     * Sets the value of the triggerGapsRsrpEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTriggerGapsRsrpEventThreshold1(JAXBElement<Integer> value) {
        this.triggerGapsRsrpEventThreshold1 = value;
    }

    /**
     * Gets the value of the triggerGapsRsrqEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTriggerGapsRsrqEventThreshold1() {
        return triggerGapsRsrqEventThreshold1;
    }

    /**
     * Sets the value of the triggerGapsRsrqEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTriggerGapsRsrqEventThreshold1(JAXBElement<BigDecimal> value) {
        this.triggerGapsRsrqEventThreshold1 = value;
    }

    /**
     * Gets the value of the triggerGapsHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTriggerGapsHysteresis() {
        return triggerGapsHysteresis;
    }

    /**
     * Sets the value of the triggerGapsHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTriggerGapsHysteresis(JAXBElement<BigDecimal> value) {
        this.triggerGapsHysteresis = value;
    }

    /**
     * Gets the value of the triggerGapsTimeToTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTriggerGapsTimeToTrigger() {
        return triggerGapsTimeToTrigger;
    }

    /**
     * Sets the value of the triggerGapsTimeToTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTriggerGapsTimeToTrigger(JAXBElement<String> value) {
        this.triggerGapsTimeToTrigger = value;
    }

    /**
     * Gets the value of the triggerGapsRsrqHysteresisForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTriggerGapsRsrqHysteresisForDualMode() {
        return triggerGapsRsrqHysteresisForDualMode;
    }

    /**
     * Sets the value of the triggerGapsRsrqHysteresisForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTriggerGapsRsrqHysteresisForDualMode(JAXBElement<BigDecimal> value) {
        this.triggerGapsRsrqHysteresisForDualMode = value;
    }

    /**
     * Gets the value of the triggerGapsRsrqTimeToTriggerForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTriggerGapsRsrqTimeToTriggerForDualMode() {
        return triggerGapsRsrqTimeToTriggerForDualMode;
    }

    /**
     * Sets the value of the triggerGapsRsrqTimeToTriggerForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTriggerGapsRsrqTimeToTriggerForDualMode(JAXBElement<String> value) {
        this.triggerGapsRsrqTimeToTriggerForDualMode = value;
    }

    /**
     * Gets the value of the stopGapsEventType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopGapEventTypes }{@code >}
     *     
     */
    public JAXBElement<StopGapEventTypes> getStopGapsEventType() {
        return stopGapsEventType;
    }

    /**
     * Sets the value of the stopGapsEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopGapEventTypes }{@code >}
     *     
     */
    public void setStopGapsEventType(JAXBElement<StopGapEventTypes> value) {
        this.stopGapsEventType = value;
    }

    /**
     * Gets the value of the stopGapsTriggerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public JAXBElement<TriggerQuantityTypes> getStopGapsTriggerQuantity() {
        return stopGapsTriggerQuantity;
    }

    /**
     * Sets the value of the stopGapsTriggerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}
     *     
     */
    public void setStopGapsTriggerQuantity(JAXBElement<TriggerQuantityTypes> value) {
        this.stopGapsTriggerQuantity = value;
    }

    /**
     * Gets the value of the stopGapsRsrpEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStopGapsRsrpEventThreshold1() {
        return stopGapsRsrpEventThreshold1;
    }

    /**
     * Sets the value of the stopGapsRsrpEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStopGapsRsrpEventThreshold1(JAXBElement<Integer> value) {
        this.stopGapsRsrpEventThreshold1 = value;
    }

    /**
     * Gets the value of the stopGapsRsrqEventThreshold1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStopGapsRsrqEventThreshold1() {
        return stopGapsRsrqEventThreshold1;
    }

    /**
     * Sets the value of the stopGapsRsrqEventThreshold1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStopGapsRsrqEventThreshold1(JAXBElement<BigDecimal> value) {
        this.stopGapsRsrqEventThreshold1 = value;
    }

    /**
     * Gets the value of the stopGapsHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStopGapsHysteresis() {
        return stopGapsHysteresis;
    }

    /**
     * Sets the value of the stopGapsHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStopGapsHysteresis(JAXBElement<BigDecimal> value) {
        this.stopGapsHysteresis = value;
    }

    /**
     * Gets the value of the stopGapsTimeToTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopGapsTimeToTrigger() {
        return stopGapsTimeToTrigger;
    }

    /**
     * Sets the value of the stopGapsTimeToTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopGapsTimeToTrigger(JAXBElement<String> value) {
        this.stopGapsTimeToTrigger = value;
    }

    /**
     * Gets the value of the stopGapsRsrqHysteresisForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStopGapsRsrqHysteresisForDualMode() {
        return stopGapsRsrqHysteresisForDualMode;
    }

    /**
     * Sets the value of the stopGapsRsrqHysteresisForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStopGapsRsrqHysteresisForDualMode(JAXBElement<BigDecimal> value) {
        this.stopGapsRsrqHysteresisForDualMode = value;
    }

    /**
     * Gets the value of the stopGapsRsrqTimeToTriggerForDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopGapsRsrqTimeToTriggerForDualMode() {
        return stopGapsRsrqTimeToTriggerForDualMode;
    }

    /**
     * Sets the value of the stopGapsRsrqTimeToTriggerForDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopGapsRsrqTimeToTriggerForDualMode(JAXBElement<String> value) {
        this.stopGapsRsrqTimeToTriggerForDualMode = value;
    }

    /**
     * Gets the value of the qci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QciValues }{@code >}
     *     
     */
    public JAXBElement<QciValues> getQci() {
        return qci;
    }

    /**
     * Sets the value of the qci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QciValues }{@code >}
     *     
     */
    public void setQci(JAXBElement<QciValues> value) {
        this.qci = value;
    }

    /**
     * Gets the value of the hpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HpueValues }{@code >}
     *     
     */
    public JAXBElement<HpueValues> getHpue() {
        return hpue;
    }

    /**
     * Sets the value of the hpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HpueValues }{@code >}
     *     
     */
    public void setHpue(JAXBElement<HpueValues> value) {
        this.hpue = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDefault(JAXBElement<Boolean> value) {
        this.isDefault = value;
    }

}
