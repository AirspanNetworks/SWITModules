
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for SelfHealingWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelfHealingWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelfHealingEnabledIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SelfHealingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="RachReceivedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RachReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NonActivityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonActivityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NonActivityRebootIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonActivityReboot" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelfHealingWs", propOrder = {
    "selfHealingEnabledIsDefault",
    "selfHealingEnabled",
    "rachReceivedIsDefault",
    "rachReceived",
    "measurementPeriodIsDefault",
    "measurementPeriod",
    "nonActivityTimerIsDefault",
    "nonActivityTimer",
    "nonActivityRebootIsDefault",
    "nonActivityReboot"
})
public class SelfHealingWs {

    @XmlElementRef(name = "SelfHealingEnabledIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> selfHealingEnabledIsDefault;
    @XmlElementRef(name = "SelfHealingEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> selfHealingEnabled;
    @XmlElementRef(name = "RachReceivedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rachReceivedIsDefault;
    @XmlElementRef(name = "RachReceived", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachReceived;
    @XmlElementRef(name = "MeasurementPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> measurementPeriodIsDefault;
    @XmlElementRef(name = "MeasurementPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measurementPeriod;
    @XmlElementRef(name = "NonActivityTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nonActivityTimerIsDefault;
    @XmlElementRef(name = "NonActivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nonActivityTimer;
    @XmlElementRef(name = "NonActivityRebootIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nonActivityRebootIsDefault;
    @XmlElementRef(name = "NonActivityReboot", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nonActivityReboot;

    /**
     * Gets the value of the selfHealingEnabledIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSelfHealingEnabledIsDefault() {
        return selfHealingEnabledIsDefault;
    }

    /**
     * Sets the value of the selfHealingEnabledIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSelfHealingEnabledIsDefault(JAXBElement<Boolean> value) {
        this.selfHealingEnabledIsDefault = value;
    }

    /**
     * Gets the value of the selfHealingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSelfHealingEnabled() {
        return selfHealingEnabled;
    }

    /**
     * Sets the value of the selfHealingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSelfHealingEnabled(JAXBElement<EnabledStates> value) {
        this.selfHealingEnabled = value;
    }

    /**
     * Gets the value of the rachReceivedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRachReceivedIsDefault() {
        return rachReceivedIsDefault;
    }

    /**
     * Sets the value of the rachReceivedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRachReceivedIsDefault(JAXBElement<Boolean> value) {
        this.rachReceivedIsDefault = value;
    }

    /**
     * Gets the value of the rachReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachReceived() {
        return rachReceived;
    }

    /**
     * Sets the value of the rachReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachReceived(JAXBElement<Integer> value) {
        this.rachReceived = value;
    }

    /**
     * Gets the value of the measurementPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeasurementPeriodIsDefault() {
        return measurementPeriodIsDefault;
    }

    /**
     * Sets the value of the measurementPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeasurementPeriodIsDefault(JAXBElement<Boolean> value) {
        this.measurementPeriodIsDefault = value;
    }

    /**
     * Gets the value of the measurementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasurementPeriod() {
        return measurementPeriod;
    }

    /**
     * Sets the value of the measurementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasurementPeriod(JAXBElement<Integer> value) {
        this.measurementPeriod = value;
    }

    /**
     * Gets the value of the nonActivityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNonActivityTimerIsDefault() {
        return nonActivityTimerIsDefault;
    }

    /**
     * Sets the value of the nonActivityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNonActivityTimerIsDefault(JAXBElement<Boolean> value) {
        this.nonActivityTimerIsDefault = value;
    }

    /**
     * Gets the value of the nonActivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNonActivityTimer() {
        return nonActivityTimer;
    }

    /**
     * Sets the value of the nonActivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNonActivityTimer(JAXBElement<Integer> value) {
        this.nonActivityTimer = value;
    }

    /**
     * Gets the value of the nonActivityRebootIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNonActivityRebootIsDefault() {
        return nonActivityRebootIsDefault;
    }

    /**
     * Sets the value of the nonActivityRebootIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNonActivityRebootIsDefault(JAXBElement<Boolean> value) {
        this.nonActivityRebootIsDefault = value;
    }

    /**
     * Gets the value of the nonActivityReboot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNonActivityReboot() {
        return nonActivityReboot;
    }

    /**
     * Sets the value of the nonActivityReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNonActivityReboot(JAXBElement<EnabledStates> value) {
        this.nonActivityReboot = value;
    }

}
