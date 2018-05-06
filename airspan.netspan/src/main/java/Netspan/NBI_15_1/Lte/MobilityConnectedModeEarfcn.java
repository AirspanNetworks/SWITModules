
package Netspan.NBI_15_1.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;import Netspan.API.Enums.ConnectedModeEventTypes;import Netspan.API.Enums.TriggerQuantityTypes;


/**
 * <p>Java class for MobilityConnectedModeEarfcn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeEarfcn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UseDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://Airspan.Netspan.WebServices}ConnectedModeEventTypes" minOccurs="0"/>
 *         &lt;element name="TriggerQuantity" type="{http://Airspan.Netspan.WebServices}TriggerQuantityTypes" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RsrpEventThreshold2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="A3Offset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Hysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TimeToTrigger" type="{http://Airspan.Netspan.WebServices}TimeToTriggerValues" minOccurs="0"/>
 *         &lt;element name="QOffsetFreq" type="{http://Airspan.Netspan.WebServices}OffsetFreq" minOccurs="0"/>
 *         &lt;element name="AllowX2NrtUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeEarfcn", propOrder = {
    "dlEarfcn",
    "useDefault",
    "eventType",
    "triggerQuantity",
    "rsrpEventThreshold1",
    "rsrpEventThreshold2",
    "a3Offset",
    "hysteresis",
    "timeToTrigger",
    "qOffsetFreq",
    "allowX2NrtUpdate"
})
public class MobilityConnectedModeEarfcn {

    @XmlElementRef(name = "DlEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlEarfcn;
    @XmlElementRef(name = "UseDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useDefault;
    @XmlElementRef(name = "EventType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectedModeEventTypes> eventType;
    @XmlElementRef(name = "TriggerQuantity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TriggerQuantityTypes> triggerQuantity;
    @XmlElementRef(name = "RsrpEventThreshold1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpEventThreshold1;
    @XmlElementRef(name = "RsrpEventThreshold2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpEventThreshold2;
    @XmlElementRef(name = "A3Offset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> a3Offset;
    @XmlElementRef(name = "Hysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hysteresis;
    @XmlElementRef(name = "TimeToTrigger", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeToTrigger;
    @XmlElementRef(name = "QOffsetFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qOffsetFreq;
    @XmlElementRef(name = "AllowX2NrtUpdate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowX2NrtUpdate;

    /**
     * Gets the value of the dlEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlEarfcn() {
        return dlEarfcn;
    }

    /**
     * Sets the value of the dlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlEarfcn(JAXBElement<Integer> value) {
        this.dlEarfcn = value;
    }

    /**
     * Gets the value of the useDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseDefault() {
        return useDefault;
    }

    /**
     * Sets the value of the useDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseDefault(JAXBElement<Boolean> value) {
        this.useDefault = value;
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
     * Gets the value of the allowX2NrtUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowX2NrtUpdate() {
        return allowX2NrtUpdate;
    }

    /**
     * Sets the value of the allowX2NrtUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowX2NrtUpdate(JAXBElement<Boolean> value) {
        this.allowX2NrtUpdate = value;
    }

}
