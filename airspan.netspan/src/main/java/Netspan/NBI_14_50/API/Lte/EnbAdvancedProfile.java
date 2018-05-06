
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbAdvancedProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbAdvancedProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="PlugAndPlay" type="{http://Airspan.Netspan.WebServices}PlugAndPlayWs" minOccurs="0"/>
 *         &lt;element name="PlugAndPlayWarmRebootMask" type="{http://Airspan.Netspan.WebServices}PlugAndPlayWarmRebootMaskWs" minOccurs="0"/>
 *         &lt;element name="RrcTimers" type="{http://Airspan.Netspan.WebServices}RrcTimersWs" minOccurs="0"/>
 *         &lt;element name="VolteConfiguration" type="{http://Airspan.Netspan.WebServices}VolteConfigurationWs" minOccurs="0"/>
 *         &lt;element name="Synchronisation" type="{http://Airspan.Netspan.WebServices}SynchronisationWs" minOccurs="0"/>
 *         &lt;element name="Eson" type="{http://Airspan.Netspan.WebServices}EsonWs" minOccurs="0"/>
 *         &lt;element name="EmergencyCall" type="{http://Airspan.Netspan.WebServices}EmergencyCallWs" minOccurs="0"/>
 *         &lt;element name="Embms" type="{http://Airspan.Netspan.WebServices}EmbmsWs" minOccurs="0"/>
 *         &lt;element name="TrafficManagement" type="{http://Airspan.Netspan.WebServices}ResourceStatus" minOccurs="0"/>
 *         &lt;element name="IPSecConfiguration" type="{http://Airspan.Netspan.WebServices}IPSecConfigWS" minOccurs="0"/>
 *         &lt;element name="CMPv2Configuration" type="{http://Airspan.Netspan.WebServices}Cmpv2ConfigWS" minOccurs="0"/>
 *         &lt;element name="Handover" type="{http://Airspan.Netspan.WebServices}HandoverWs" minOccurs="0"/>
 *         &lt;element name="Networking" type="{http://Airspan.Netspan.WebServices}NetworkingWs" minOccurs="0"/>
 *         &lt;element name="AutoPci" type="{http://Airspan.Netspan.WebServices}AutoPciWs" minOccurs="0"/>
 *         &lt;element name="Synchronization" type="{http://Airspan.Netspan.WebServices}SynchronizationWs" minOccurs="0"/>
 *         &lt;element name="NeighborManagement" type="{http://Airspan.Netspan.WebServices}EnbNeighborManagementWs" minOccurs="0"/>
 *         &lt;element name="WiFiAccessPoint" type="{http://Airspan.Netspan.WebServices}WiFiAccessPointWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbAdvancedProfile", propOrder = {
    "name",
    "hardwareCategory",
    "plugAndPlay",
    "plugAndPlayWarmRebootMask",
    "rrcTimers",
    "volteConfiguration",
    "synchronisation",
    "eson",
    "emergencyCall",
    "embms",
    "trafficManagement",
    "ipSecConfiguration",
    "cmPv2Configuration",
    "handover",
    "networking",
    "autoPci",
    "synchronization",
    "neighborManagement",
    "wiFiAccessPoint"
})
public class EnbAdvancedProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "PlugAndPlay")
    protected PlugAndPlayWs plugAndPlay;
    @XmlElement(name = "PlugAndPlayWarmRebootMask")
    protected PlugAndPlayWarmRebootMaskWs plugAndPlayWarmRebootMask;
    @XmlElement(name = "RrcTimers")
    protected RrcTimersWs rrcTimers;
    @XmlElement(name = "VolteConfiguration")
    protected VolteConfigurationWs volteConfiguration;
    @XmlElement(name = "Synchronisation")
    protected SynchronisationWs synchronisation;
    @XmlElement(name = "Eson")
    protected EsonWs eson;
    @XmlElement(name = "EmergencyCall")
    protected EmergencyCallWs emergencyCall;
    @XmlElement(name = "Embms")
    protected EmbmsWs embms;
    @XmlElement(name = "TrafficManagement")
    protected ResourceStatus trafficManagement;
    @XmlElement(name = "IPSecConfiguration")
    protected IPSecConfigWS ipSecConfiguration;
    @XmlElement(name = "CMPv2Configuration")
    protected Cmpv2ConfigWS cmPv2Configuration;
    @XmlElement(name = "Handover")
    protected HandoverWs handover;
    @XmlElement(name = "Networking")
    protected NetworkingWs networking;
    @XmlElement(name = "AutoPci")
    protected AutoPciWs autoPci;
    @XmlElement(name = "Synchronization")
    protected SynchronizationWs synchronization;
    @XmlElement(name = "NeighborManagement")
    protected EnbNeighborManagementWs neighborManagement;
    @XmlElement(name = "WiFiAccessPoint")
    protected WiFiAccessPointWs wiFiAccessPoint;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the plugAndPlay property.
     * 
     * @return
     *     possible object is
     *     {@link PlugAndPlayWs }
     *     
     */
    public PlugAndPlayWs getPlugAndPlay() {
        return plugAndPlay;
    }

    /**
     * Sets the value of the plugAndPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugAndPlayWs }
     *     
     */
    public void setPlugAndPlay(PlugAndPlayWs value) {
        this.plugAndPlay = value;
    }

    /**
     * Gets the value of the plugAndPlayWarmRebootMask property.
     * 
     * @return
     *     possible object is
     *     {@link PlugAndPlayWarmRebootMaskWs }
     *     
     */
    public PlugAndPlayWarmRebootMaskWs getPlugAndPlayWarmRebootMask() {
        return plugAndPlayWarmRebootMask;
    }

    /**
     * Sets the value of the plugAndPlayWarmRebootMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlugAndPlayWarmRebootMaskWs }
     *     
     */
    public void setPlugAndPlayWarmRebootMask(PlugAndPlayWarmRebootMaskWs value) {
        this.plugAndPlayWarmRebootMask = value;
    }

    /**
     * Gets the value of the rrcTimers property.
     * 
     * @return
     *     possible object is
     *     {@link RrcTimersWs }
     *     
     */
    public RrcTimersWs getRrcTimers() {
        return rrcTimers;
    }

    /**
     * Sets the value of the rrcTimers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RrcTimersWs }
     *     
     */
    public void setRrcTimers(RrcTimersWs value) {
        this.rrcTimers = value;
    }

    /**
     * Gets the value of the volteConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link VolteConfigurationWs }
     *     
     */
    public VolteConfigurationWs getVolteConfiguration() {
        return volteConfiguration;
    }

    /**
     * Sets the value of the volteConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolteConfigurationWs }
     *     
     */
    public void setVolteConfiguration(VolteConfigurationWs value) {
        this.volteConfiguration = value;
    }

    /**
     * Gets the value of the synchronisation property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronisationWs }
     *     
     */
    public SynchronisationWs getSynchronisation() {
        return synchronisation;
    }

    /**
     * Sets the value of the synchronisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronisationWs }
     *     
     */
    public void setSynchronisation(SynchronisationWs value) {
        this.synchronisation = value;
    }

    /**
     * Gets the value of the eson property.
     * 
     * @return
     *     possible object is
     *     {@link EsonWs }
     *     
     */
    public EsonWs getEson() {
        return eson;
    }

    /**
     * Sets the value of the eson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsonWs }
     *     
     */
    public void setEson(EsonWs value) {
        this.eson = value;
    }

    /**
     * Gets the value of the emergencyCall property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyCallWs }
     *     
     */
    public EmergencyCallWs getEmergencyCall() {
        return emergencyCall;
    }

    /**
     * Sets the value of the emergencyCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyCallWs }
     *     
     */
    public void setEmergencyCall(EmergencyCallWs value) {
        this.emergencyCall = value;
    }

    /**
     * Gets the value of the embms property.
     * 
     * @return
     *     possible object is
     *     {@link EmbmsWs }
     *     
     */
    public EmbmsWs getEmbms() {
        return embms;
    }

    /**
     * Sets the value of the embms property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbmsWs }
     *     
     */
    public void setEmbms(EmbmsWs value) {
        this.embms = value;
    }

    /**
     * Gets the value of the trafficManagement property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceStatus }
     *     
     */
    public ResourceStatus getTrafficManagement() {
        return trafficManagement;
    }

    /**
     * Sets the value of the trafficManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStatus }
     *     
     */
    public void setTrafficManagement(ResourceStatus value) {
        this.trafficManagement = value;
    }

    /**
     * Gets the value of the ipSecConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link IPSecConfigWS }
     *     
     */
    public IPSecConfigWS getIPSecConfiguration() {
        return ipSecConfiguration;
    }

    /**
     * Sets the value of the ipSecConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPSecConfigWS }
     *     
     */
    public void setIPSecConfiguration(IPSecConfigWS value) {
        this.ipSecConfiguration = value;
    }

    /**
     * Gets the value of the cmPv2Configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Cmpv2ConfigWS }
     *     
     */
    public Cmpv2ConfigWS getCMPv2Configuration() {
        return cmPv2Configuration;
    }

    /**
     * Sets the value of the cmPv2Configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cmpv2ConfigWS }
     *     
     */
    public void setCMPv2Configuration(Cmpv2ConfigWS value) {
        this.cmPv2Configuration = value;
    }

    /**
     * Gets the value of the handover property.
     * 
     * @return
     *     possible object is
     *     {@link HandoverWs }
     *     
     */
    public HandoverWs getHandover() {
        return handover;
    }

    /**
     * Sets the value of the handover property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandoverWs }
     *     
     */
    public void setHandover(HandoverWs value) {
        this.handover = value;
    }

    /**
     * Gets the value of the networking property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkingWs }
     *     
     */
    public NetworkingWs getNetworking() {
        return networking;
    }

    /**
     * Sets the value of the networking property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkingWs }
     *     
     */
    public void setNetworking(NetworkingWs value) {
        this.networking = value;
    }

    /**
     * Gets the value of the autoPci property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPciWs }
     *     
     */
    public AutoPciWs getAutoPci() {
        return autoPci;
    }

    /**
     * Sets the value of the autoPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPciWs }
     *     
     */
    public void setAutoPci(AutoPciWs value) {
        this.autoPci = value;
    }

    /**
     * Gets the value of the synchronization property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationWs }
     *     
     */
    public SynchronizationWs getSynchronization() {
        return synchronization;
    }

    /**
     * Sets the value of the synchronization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationWs }
     *     
     */
    public void setSynchronization(SynchronizationWs value) {
        this.synchronization = value;
    }

    /**
     * Gets the value of the neighborManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EnbNeighborManagementWs }
     *     
     */
    public EnbNeighborManagementWs getNeighborManagement() {
        return neighborManagement;
    }

    /**
     * Sets the value of the neighborManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbNeighborManagementWs }
     *     
     */
    public void setNeighborManagement(EnbNeighborManagementWs value) {
        this.neighborManagement = value;
    }

    /**
     * Gets the value of the wiFiAccessPoint property.
     * 
     * @return
     *     possible object is
     *     {@link WiFiAccessPointWs }
     *     
     */
    public WiFiAccessPointWs getWiFiAccessPoint() {
        return wiFiAccessPoint;
    }

    /**
     * Sets the value of the wiFiAccessPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiAccessPointWs }
     *     
     */
    public void setWiFiAccessPoint(WiFiAccessPointWs value) {
        this.wiFiAccessPoint = value;
    }

}
