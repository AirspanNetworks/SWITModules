
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EmergencyCallWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmergencyCallWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmergencyCallTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyCallTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HighestArpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighestArp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreemptionCapabilityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreemptionCapability" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="PreemptionVulnerabilityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreemptionVulnerability" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="EmergencyResetTimeoutTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyResetTimeoutTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmergencyCheckIntervalTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmergencyCheckIntervalTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmergencyCallQci" type="{http://Airspan.Netspan.WebServices}EmergencyCallQciWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmergencyCallWs", propOrder = {
    "emergencyCallTimerIsDefault",
    "emergencyCallTimer",
    "highestArpIsDefault",
    "highestArp",
    "preemptionCapabilityIsDefault",
    "preemptionCapability",
    "preemptionVulnerabilityIsDefault",
    "preemptionVulnerability",
    "emergencyResetTimeoutTimerIsDefault",
    "emergencyResetTimeoutTimer",
    "emergencyCheckIntervalTimerIsDefault",
    "emergencyCheckIntervalTimer",
    "emergencyCallQci"
})
public class EmergencyCallWs {

    @XmlElementRef(name = "EmergencyCallTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emergencyCallTimerIsDefault;
    @XmlElementRef(name = "EmergencyCallTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> emergencyCallTimer;
    @XmlElementRef(name = "HighestArpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> highestArpIsDefault;
    @XmlElementRef(name = "HighestArp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> highestArp;
    @XmlElementRef(name = "PreemptionCapabilityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preemptionCapabilityIsDefault;
    @XmlElementRef(name = "PreemptionCapability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> preemptionCapability;
    @XmlElementRef(name = "PreemptionVulnerabilityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preemptionVulnerabilityIsDefault;
    @XmlElementRef(name = "PreemptionVulnerability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> preemptionVulnerability;
    @XmlElementRef(name = "EmergencyResetTimeoutTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emergencyResetTimeoutTimerIsDefault;
    @XmlElementRef(name = "EmergencyResetTimeoutTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> emergencyResetTimeoutTimer;
    @XmlElementRef(name = "EmergencyCheckIntervalTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emergencyCheckIntervalTimerIsDefault;
    @XmlElementRef(name = "EmergencyCheckIntervalTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> emergencyCheckIntervalTimer;
    @XmlElement(name = "EmergencyCallQci")
    protected EmergencyCallQciWs emergencyCallQci;

    /**
     * Gets the value of the emergencyCallTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmergencyCallTimerIsDefault() {
        return emergencyCallTimerIsDefault;
    }

    /**
     * Sets the value of the emergencyCallTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmergencyCallTimerIsDefault(JAXBElement<Boolean> value) {
        this.emergencyCallTimerIsDefault = value;
    }

    /**
     * Gets the value of the emergencyCallTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmergencyCallTimer() {
        return emergencyCallTimer;
    }

    /**
     * Sets the value of the emergencyCallTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmergencyCallTimer(JAXBElement<Integer> value) {
        this.emergencyCallTimer = value;
    }

    /**
     * Gets the value of the highestArpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHighestArpIsDefault() {
        return highestArpIsDefault;
    }

    /**
     * Sets the value of the highestArpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHighestArpIsDefault(JAXBElement<Boolean> value) {
        this.highestArpIsDefault = value;
    }

    /**
     * Gets the value of the highestArp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHighestArp() {
        return highestArp;
    }

    /**
     * Sets the value of the highestArp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHighestArp(JAXBElement<Integer> value) {
        this.highestArp = value;
    }

    /**
     * Gets the value of the preemptionCapabilityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreemptionCapabilityIsDefault() {
        return preemptionCapabilityIsDefault;
    }

    /**
     * Sets the value of the preemptionCapabilityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreemptionCapabilityIsDefault(JAXBElement<Boolean> value) {
        this.preemptionCapabilityIsDefault = value;
    }

    /**
     * Gets the value of the preemptionCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getPreemptionCapability() {
        return preemptionCapability;
    }

    /**
     * Sets the value of the preemptionCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setPreemptionCapability(JAXBElement<EnabledStates> value) {
        this.preemptionCapability = value;
    }

    /**
     * Gets the value of the preemptionVulnerabilityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreemptionVulnerabilityIsDefault() {
        return preemptionVulnerabilityIsDefault;
    }

    /**
     * Sets the value of the preemptionVulnerabilityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreemptionVulnerabilityIsDefault(JAXBElement<Boolean> value) {
        this.preemptionVulnerabilityIsDefault = value;
    }

    /**
     * Gets the value of the preemptionVulnerability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getPreemptionVulnerability() {
        return preemptionVulnerability;
    }

    /**
     * Sets the value of the preemptionVulnerability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setPreemptionVulnerability(JAXBElement<EnabledStates> value) {
        this.preemptionVulnerability = value;
    }

    /**
     * Gets the value of the emergencyResetTimeoutTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmergencyResetTimeoutTimerIsDefault() {
        return emergencyResetTimeoutTimerIsDefault;
    }

    /**
     * Sets the value of the emergencyResetTimeoutTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmergencyResetTimeoutTimerIsDefault(JAXBElement<Boolean> value) {
        this.emergencyResetTimeoutTimerIsDefault = value;
    }

    /**
     * Gets the value of the emergencyResetTimeoutTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmergencyResetTimeoutTimer() {
        return emergencyResetTimeoutTimer;
    }

    /**
     * Sets the value of the emergencyResetTimeoutTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmergencyResetTimeoutTimer(JAXBElement<Integer> value) {
        this.emergencyResetTimeoutTimer = value;
    }

    /**
     * Gets the value of the emergencyCheckIntervalTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmergencyCheckIntervalTimerIsDefault() {
        return emergencyCheckIntervalTimerIsDefault;
    }

    /**
     * Sets the value of the emergencyCheckIntervalTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmergencyCheckIntervalTimerIsDefault(JAXBElement<Boolean> value) {
        this.emergencyCheckIntervalTimerIsDefault = value;
    }

    /**
     * Gets the value of the emergencyCheckIntervalTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmergencyCheckIntervalTimer() {
        return emergencyCheckIntervalTimer;
    }

    /**
     * Sets the value of the emergencyCheckIntervalTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmergencyCheckIntervalTimer(JAXBElement<Integer> value) {
        this.emergencyCheckIntervalTimer = value;
    }

    /**
     * Gets the value of the emergencyCallQci property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyCallQciWs }
     *     
     */
    public EmergencyCallQciWs getEmergencyCallQci() {
        return emergencyCallQci;
    }

    /**
     * Sets the value of the emergencyCallQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyCallQciWs }
     *     
     */
    public void setEmergencyCallQci(EmergencyCallQciWs value) {
        this.emergencyCallQci = value;
    }

}
