
package Netspan.NBI_15_2.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.ConnectedModeEventTypes;
import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeQosFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeQosFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HandoverTriggerPerQci1Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci2Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci3Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci4Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci5Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci6Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci7Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci7" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci8Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci8" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci9Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HandoverTriggerPerQci9" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QosMobilityConnectedModeFreqEarfcnList" type="{http://Airspan.Netspan.WebServices}QosMobilityConnectedModeFreqEarfcnListContainer" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}ConnectedModeEventTypes" minOccurs="0"/>
 *         &lt;element name="TriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RsrqEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RsrqEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="A3Offset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeQosFreq", propOrder = {
    "handoverTriggerPerQci1Included",
    "handoverTriggerPerQci1",
    "handoverTriggerPerQci2Included",
    "handoverTriggerPerQci2",
    "handoverTriggerPerQci3Included",
    "handoverTriggerPerQci3",
    "handoverTriggerPerQci4Included",
    "handoverTriggerPerQci4",
    "handoverTriggerPerQci5Included",
    "handoverTriggerPerQci5",
    "handoverTriggerPerQci6Included",
    "handoverTriggerPerQci6",
    "handoverTriggerPerQci7Included",
    "handoverTriggerPerQci7",
    "handoverTriggerPerQci8Included",
    "handoverTriggerPerQci8",
    "handoverTriggerPerQci9Included",
    "handoverTriggerPerQci9",
    "qosMobilityConnectedModeFreqEarfcnList",
    "eventType",
    "triggerQuantity",
    "rsrpEventThreshold1",
    "rsrpEventThreshold2",
    "rsrqEventThreshold1",
    "rsrqEventThreshold2",
    "a3Offset",
    "hysteresis",
    "timeToTrigger"
})
public class MobilityConnectedModeQosFreq {

    @XmlElementRef(name = "HandoverTriggerPerQci1Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci1Included;
    @XmlElementRef(name = "HandoverTriggerPerQci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci1;
    @XmlElementRef(name = "HandoverTriggerPerQci2Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci2Included;
    @XmlElementRef(name = "HandoverTriggerPerQci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci2;
    @XmlElementRef(name = "HandoverTriggerPerQci3Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci3Included;
    @XmlElementRef(name = "HandoverTriggerPerQci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci3;
    @XmlElementRef(name = "HandoverTriggerPerQci4Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci4Included;
    @XmlElementRef(name = "HandoverTriggerPerQci4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci4;
    @XmlElementRef(name = "HandoverTriggerPerQci5Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci5Included;
    @XmlElementRef(name = "HandoverTriggerPerQci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci5;
    @XmlElementRef(name = "HandoverTriggerPerQci6Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci6Included;
    @XmlElementRef(name = "HandoverTriggerPerQci6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci6;
    @XmlElementRef(name = "HandoverTriggerPerQci7Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci7Included;
    @XmlElementRef(name = "HandoverTriggerPerQci7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci7;
    @XmlElementRef(name = "HandoverTriggerPerQci8Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci8Included;
    @XmlElementRef(name = "HandoverTriggerPerQci8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci8;
    @XmlElementRef(name = "HandoverTriggerPerQci9Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci9Included;
    @XmlElementRef(name = "HandoverTriggerPerQci9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> handoverTriggerPerQci9;
    @XmlElement(name = "QosMobilityConnectedModeFreqEarfcnList")
    protected QosMobilityConnectedModeFreqEarfcnListContainer qosMobilityConnectedModeFreqEarfcnList;
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

    /**
     * Gets the value of the handoverTriggerPerQci1Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci1Included() {
        return handoverTriggerPerQci1Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci1Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci1Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci1Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci1() {
        return handoverTriggerPerQci1;
    }

    /**
     * Sets the value of the handoverTriggerPerQci1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci1(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci1 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci2Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci2Included() {
        return handoverTriggerPerQci2Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci2Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci2Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci2Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci2() {
        return handoverTriggerPerQci2;
    }

    /**
     * Sets the value of the handoverTriggerPerQci2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci2(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci2 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci3Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci3Included() {
        return handoverTriggerPerQci3Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci3Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci3Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci3Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci3() {
        return handoverTriggerPerQci3;
    }

    /**
     * Sets the value of the handoverTriggerPerQci3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci3(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci3 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci4Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci4Included() {
        return handoverTriggerPerQci4Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci4Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci4Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci4Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci4() {
        return handoverTriggerPerQci4;
    }

    /**
     * Sets the value of the handoverTriggerPerQci4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci4(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci4 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci5Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci5Included() {
        return handoverTriggerPerQci5Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci5Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci5Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci5Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci5() {
        return handoverTriggerPerQci5;
    }

    /**
     * Sets the value of the handoverTriggerPerQci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci5(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci5 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci6Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci6Included() {
        return handoverTriggerPerQci6Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci6Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci6Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci6Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci6() {
        return handoverTriggerPerQci6;
    }

    /**
     * Sets the value of the handoverTriggerPerQci6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci6(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci6 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci7Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci7Included() {
        return handoverTriggerPerQci7Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci7Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci7Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci7Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci7() {
        return handoverTriggerPerQci7;
    }

    /**
     * Sets the value of the handoverTriggerPerQci7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci7(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci7 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci8Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci8Included() {
        return handoverTriggerPerQci8Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci8Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci8Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci8Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci8() {
        return handoverTriggerPerQci8;
    }

    /**
     * Sets the value of the handoverTriggerPerQci8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci8(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci8 = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci9Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci9Included() {
        return handoverTriggerPerQci9Included;
    }

    /**
     * Sets the value of the handoverTriggerPerQci9Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci9Included(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci9Included = value;
    }

    /**
     * Gets the value of the handoverTriggerPerQci9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHandoverTriggerPerQci9() {
        return handoverTriggerPerQci9;
    }

    /**
     * Sets the value of the handoverTriggerPerQci9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHandoverTriggerPerQci9(JAXBElement<Boolean> value) {
        this.handoverTriggerPerQci9 = value;
    }

    /**
     * Gets the value of the qosMobilityConnectedModeFreqEarfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link QosMobilityConnectedModeFreqEarfcnListContainer }
     *     
     */
    public QosMobilityConnectedModeFreqEarfcnListContainer getQosMobilityConnectedModeFreqEarfcnList() {
        return qosMobilityConnectedModeFreqEarfcnList;
    }

    /**
     * Sets the value of the qosMobilityConnectedModeFreqEarfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QosMobilityConnectedModeFreqEarfcnListContainer }
     *     
     */
    public void setQosMobilityConnectedModeFreqEarfcnList(QosMobilityConnectedModeFreqEarfcnListContainer value) {
        this.qosMobilityConnectedModeFreqEarfcnList = value;
    }

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

}
