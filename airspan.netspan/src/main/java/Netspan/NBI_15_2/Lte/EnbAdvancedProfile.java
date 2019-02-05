
package Netspan.NBI_15_2.Lte;

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
 * &lt;complexType name="EnbAdvancedProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="NeighborManagement" type="{http://Airspan.Netspan.WebServices}NeighborManagementWs" minOccurs="0"/&gt;
 *         &lt;element name="Handover" type="{http://Airspan.Netspan.WebServices}HandoverWs" minOccurs="0"/&gt;
 *         &lt;element name="RadioBearers" type="{http://Airspan.Netspan.WebServices}RadioBearersWs" minOccurs="0"/&gt;
 *         &lt;element name="AirSon" type="{http://Airspan.Netspan.WebServices}AirSonWs" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyCall" type="{http://Airspan.Netspan.WebServices}EmergencyCallWs" minOccurs="0"/&gt;
 *         &lt;element name="RadioInterface" type="{http://Airspan.Netspan.WebServices}RadioInterfaceWs" minOccurs="0"/&gt;
 *         &lt;element name="Networking" type="{http://Airspan.Netspan.WebServices}NetworkingWs" minOccurs="0"/&gt;
 *         &lt;element name="Synchronization" type="{http://Airspan.Netspan.WebServices}SynchronizationWs" minOccurs="0"/&gt;
 *         &lt;element name="TrafficManagement" type="{http://Airspan.Netspan.WebServices}TrafficManagementWs" minOccurs="0"/&gt;
 *         &lt;element name="Embms" type="{http://Airspan.Netspan.WebServices}EmbmsWs" minOccurs="0"/&gt;
 *         &lt;element name="UeHandlingEnb" type="{http://Airspan.Netspan.WebServices}UeHandlingEnbWs" minOccurs="0"/&gt;
 *         &lt;element name="CallTraceEnbWs" type="{http://Airspan.Netspan.WebServices}CallTraceEnbWs" minOccurs="0"/&gt;
 *         &lt;element name="RelayChannelQuality" type="{http://Airspan.Netspan.WebServices}RelayChannelQualityEnbWs" minOccurs="0"/&gt;
 *         &lt;element name="Cbrs" type="{http://Airspan.Netspan.WebServices}CbrsEnbWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbAdvancedProfile", propOrder = {
    "name",
    "hardwareCategory",
    "neighborManagement",
    "handover",
    "radioBearers",
    "airSon",
    "emergencyCall",
    "radioInterface",
    "networking",
    "synchronization",
    "trafficManagement",
    "embms",
    "ueHandlingEnb",
    "callTraceEnbWs",
    "relayChannelQuality",
    "cbrs"
})
public class EnbAdvancedProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "NeighborManagement")
    protected NeighborManagementWs neighborManagement;
    @XmlElement(name = "Handover")
    protected HandoverWs handover;
    @XmlElement(name = "RadioBearers")
    protected RadioBearersWs radioBearers;
    @XmlElement(name = "AirSon")
    protected AirSonWs airSon;
    @XmlElement(name = "EmergencyCall")
    protected EmergencyCallWs emergencyCall;
    @XmlElement(name = "RadioInterface")
    protected RadioInterfaceWs radioInterface;
    @XmlElement(name = "Networking")
    protected NetworkingWs networking;
    @XmlElement(name = "Synchronization")
    protected SynchronizationWs synchronization;
    @XmlElement(name = "TrafficManagement")
    protected TrafficManagementWs trafficManagement;
    @XmlElement(name = "Embms")
    protected EmbmsWs embms;
    @XmlElement(name = "UeHandlingEnb")
    protected UeHandlingEnbWs ueHandlingEnb;
    @XmlElement(name = "CallTraceEnbWs")
    protected CallTraceEnbWs callTraceEnbWs;
    @XmlElement(name = "RelayChannelQuality")
    protected RelayChannelQualityEnbWs relayChannelQuality;
    @XmlElement(name = "Cbrs")
    protected CbrsEnbWs cbrs;

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
     * Gets the value of the neighborManagement property.
     * 
     * @return
     *     possible object is
     *     {@link NeighborManagementWs }
     *     
     */
    public NeighborManagementWs getNeighborManagement() {
        return neighborManagement;
    }

    /**
     * Sets the value of the neighborManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighborManagementWs }
     *     
     */
    public void setNeighborManagement(NeighborManagementWs value) {
        this.neighborManagement = value;
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
     * Gets the value of the radioBearers property.
     * 
     * @return
     *     possible object is
     *     {@link RadioBearersWs }
     *     
     */
    public RadioBearersWs getRadioBearers() {
        return radioBearers;
    }

    /**
     * Sets the value of the radioBearers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioBearersWs }
     *     
     */
    public void setRadioBearers(RadioBearersWs value) {
        this.radioBearers = value;
    }

    /**
     * Gets the value of the airSon property.
     * 
     * @return
     *     possible object is
     *     {@link AirSonWs }
     *     
     */
    public AirSonWs getAirSon() {
        return airSon;
    }

    /**
     * Sets the value of the airSon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSonWs }
     *     
     */
    public void setAirSon(AirSonWs value) {
        this.airSon = value;
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
     * Gets the value of the radioInterface property.
     * 
     * @return
     *     possible object is
     *     {@link RadioInterfaceWs }
     *     
     */
    public RadioInterfaceWs getRadioInterface() {
        return radioInterface;
    }

    /**
     * Sets the value of the radioInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioInterfaceWs }
     *     
     */
    public void setRadioInterface(RadioInterfaceWs value) {
        this.radioInterface = value;
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
     * Gets the value of the trafficManagement property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficManagementWs }
     *     
     */
    public TrafficManagementWs getTrafficManagement() {
        return trafficManagement;
    }

    /**
     * Sets the value of the trafficManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficManagementWs }
     *     
     */
    public void setTrafficManagement(TrafficManagementWs value) {
        this.trafficManagement = value;
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
     * Gets the value of the ueHandlingEnb property.
     * 
     * @return
     *     possible object is
     *     {@link UeHandlingEnbWs }
     *     
     */
    public UeHandlingEnbWs getUeHandlingEnb() {
        return ueHandlingEnb;
    }

    /**
     * Sets the value of the ueHandlingEnb property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeHandlingEnbWs }
     *     
     */
    public void setUeHandlingEnb(UeHandlingEnbWs value) {
        this.ueHandlingEnb = value;
    }

    /**
     * Gets the value of the callTraceEnbWs property.
     * 
     * @return
     *     possible object is
     *     {@link CallTraceEnbWs }
     *     
     */
    public CallTraceEnbWs getCallTraceEnbWs() {
        return callTraceEnbWs;
    }

    /**
     * Sets the value of the callTraceEnbWs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTraceEnbWs }
     *     
     */
    public void setCallTraceEnbWs(CallTraceEnbWs value) {
        this.callTraceEnbWs = value;
    }

    /**
     * Gets the value of the relayChannelQuality property.
     * 
     * @return
     *     possible object is
     *     {@link RelayChannelQualityEnbWs }
     *     
     */
    public RelayChannelQualityEnbWs getRelayChannelQuality() {
        return relayChannelQuality;
    }

    /**
     * Sets the value of the relayChannelQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayChannelQualityEnbWs }
     *     
     */
    public void setRelayChannelQuality(RelayChannelQualityEnbWs value) {
        this.relayChannelQuality = value;
    }

    /**
     * Gets the value of the cbrs property.
     * 
     * @return
     *     possible object is
     *     {@link CbrsEnbWs }
     *     
     */
    public CbrsEnbWs getCbrs() {
        return cbrs;
    }

    /**
     * Sets the value of the cbrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbrsEnbWs }
     *     
     */
    public void setCbrs(CbrsEnbWs value) {
        this.cbrs = value;
    }

}
