
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="ConnectedModeDrx" type="{http://Airspan.Netspan.WebServices}ConnectedModeDrxWs" minOccurs="0"/&gt;
 *         &lt;element name="NodeResources" type="{http://Airspan.Netspan.WebServices}NodeResourcesWs" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindow" type="{http://Airspan.Netspan.WebServices}MaintenanceWindowWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbDynamicIcicWs" type="{http://Airspan.Netspan.WebServices}EnbDynamicIcicWs" minOccurs="0"/&gt;
 *         &lt;element name="TwampSender" type="{http://Airspan.Netspan.WebServices}TwampSenderWs" minOccurs="0"/&gt;
 *         &lt;element name="Nlm" type="{http://Airspan.Netspan.WebServices}NlmWs" minOccurs="0"/&gt;
 *         &lt;element name="ClockManager" type="{http://Airspan.Netspan.WebServices}ClockMngrWs" minOccurs="0"/&gt;
 *         &lt;element name="Ptp" type="{http://Airspan.Netspan.WebServices}PtpWs" minOccurs="0"/&gt;
 *         &lt;element name="SelfHealing" type="{http://Airspan.Netspan.WebServices}SelfHealingWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbUeTrace" type="{http://Airspan.Netspan.WebServices}EnbUeTraceWs" minOccurs="0"/&gt;
 *         &lt;element name="VolteConfiguration" type="{http://Airspan.Netspan.WebServices}VolteConfigurationWs" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeBackhaul" type="{http://Airspan.Netspan.WebServices}AlternativeBhWs" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticUplinkGrant" type="{http://Airspan.Netspan.WebServices}AutomaticUplinkGrantWs" minOccurs="0"/&gt;
 *         &lt;element name="QosBasedHo" type="{http://Airspan.Netspan.WebServices}QosBasedHoWs" minOccurs="0"/&gt;
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
    "connectedModeDrx",
    "nodeResources",
    "maintenanceWindow",
    "enbDynamicIcicWs",
    "twampSender",
    "nlm",
    "clockManager",
    "ptp",
    "selfHealing",
    "enbUeTrace",
    "volteConfiguration",
    "alternativeBackhaul",
    "automaticUplinkGrant",
    "qosBasedHo"
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
    @XmlElement(name = "ConnectedModeDrx")
    protected ConnectedModeDrxWs connectedModeDrx;
    @XmlElement(name = "NodeResources")
    protected NodeResourcesWs nodeResources;
    @XmlElement(name = "MaintenanceWindow")
    protected MaintenanceWindowWs maintenanceWindow;
    @XmlElement(name = "EnbDynamicIcicWs")
    protected EnbDynamicIcicWs enbDynamicIcicWs;
    @XmlElement(name = "TwampSender")
    protected TwampSenderWs twampSender;
    @XmlElement(name = "Nlm")
    protected NlmWs nlm;
    @XmlElement(name = "ClockManager")
    protected ClockMngrWs clockManager;
    @XmlElement(name = "Ptp")
    protected PtpWs ptp;
    @XmlElement(name = "SelfHealing")
    protected SelfHealingWs selfHealing;
    @XmlElement(name = "EnbUeTrace")
    protected EnbUeTraceWs enbUeTrace;
    @XmlElement(name = "VolteConfiguration")
    protected VolteConfigurationWs volteConfiguration;
    @XmlElement(name = "AlternativeBackhaul")
    protected AlternativeBhWs alternativeBackhaul;
    @XmlElement(name = "AutomaticUplinkGrant")
    protected AutomaticUplinkGrantWs automaticUplinkGrant;
    @XmlElement(name = "QosBasedHo")
    protected QosBasedHoWs qosBasedHo;

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
     * Gets the value of the connectedModeDrx property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedModeDrxWs }
     *     
     */
    public ConnectedModeDrxWs getConnectedModeDrx() {
        return connectedModeDrx;
    }

    /**
     * Sets the value of the connectedModeDrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedModeDrxWs }
     *     
     */
    public void setConnectedModeDrx(ConnectedModeDrxWs value) {
        this.connectedModeDrx = value;
    }

    /**
     * Gets the value of the nodeResources property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResourcesWs }
     *     
     */
    public NodeResourcesWs getNodeResources() {
        return nodeResources;
    }

    /**
     * Sets the value of the nodeResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResourcesWs }
     *     
     */
    public void setNodeResources(NodeResourcesWs value) {
        this.nodeResources = value;
    }

    /**
     * Gets the value of the maintenanceWindow property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceWindowWs }
     *     
     */
    public MaintenanceWindowWs getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * Sets the value of the maintenanceWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceWindowWs }
     *     
     */
    public void setMaintenanceWindow(MaintenanceWindowWs value) {
        this.maintenanceWindow = value;
    }

    /**
     * Gets the value of the enbDynamicIcicWs property.
     * 
     * @return
     *     possible object is
     *     {@link EnbDynamicIcicWs }
     *     
     */
    public EnbDynamicIcicWs getEnbDynamicIcicWs() {
        return enbDynamicIcicWs;
    }

    /**
     * Sets the value of the enbDynamicIcicWs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbDynamicIcicWs }
     *     
     */
    public void setEnbDynamicIcicWs(EnbDynamicIcicWs value) {
        this.enbDynamicIcicWs = value;
    }

    /**
     * Gets the value of the twampSender property.
     * 
     * @return
     *     possible object is
     *     {@link TwampSenderWs }
     *     
     */
    public TwampSenderWs getTwampSender() {
        return twampSender;
    }

    /**
     * Sets the value of the twampSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwampSenderWs }
     *     
     */
    public void setTwampSender(TwampSenderWs value) {
        this.twampSender = value;
    }

    /**
     * Gets the value of the nlm property.
     * 
     * @return
     *     possible object is
     *     {@link NlmWs }
     *     
     */
    public NlmWs getNlm() {
        return nlm;
    }

    /**
     * Sets the value of the nlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlmWs }
     *     
     */
    public void setNlm(NlmWs value) {
        this.nlm = value;
    }

    /**
     * Gets the value of the clockManager property.
     * 
     * @return
     *     possible object is
     *     {@link ClockMngrWs }
     *     
     */
    public ClockMngrWs getClockManager() {
        return clockManager;
    }

    /**
     * Sets the value of the clockManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockMngrWs }
     *     
     */
    public void setClockManager(ClockMngrWs value) {
        this.clockManager = value;
    }

    /**
     * Gets the value of the ptp property.
     * 
     * @return
     *     possible object is
     *     {@link PtpWs }
     *     
     */
    public PtpWs getPtp() {
        return ptp;
    }

    /**
     * Sets the value of the ptp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtpWs }
     *     
     */
    public void setPtp(PtpWs value) {
        this.ptp = value;
    }

    /**
     * Gets the value of the selfHealing property.
     * 
     * @return
     *     possible object is
     *     {@link SelfHealingWs }
     *     
     */
    public SelfHealingWs getSelfHealing() {
        return selfHealing;
    }

    /**
     * Sets the value of the selfHealing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfHealingWs }
     *     
     */
    public void setSelfHealing(SelfHealingWs value) {
        this.selfHealing = value;
    }

    /**
     * Gets the value of the enbUeTrace property.
     * 
     * @return
     *     possible object is
     *     {@link EnbUeTraceWs }
     *     
     */
    public EnbUeTraceWs getEnbUeTrace() {
        return enbUeTrace;
    }

    /**
     * Sets the value of the enbUeTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbUeTraceWs }
     *     
     */
    public void setEnbUeTrace(EnbUeTraceWs value) {
        this.enbUeTrace = value;
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
     * Gets the value of the alternativeBackhaul property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeBhWs }
     *     
     */
    public AlternativeBhWs getAlternativeBackhaul() {
        return alternativeBackhaul;
    }

    /**
     * Sets the value of the alternativeBackhaul property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeBhWs }
     *     
     */
    public void setAlternativeBackhaul(AlternativeBhWs value) {
        this.alternativeBackhaul = value;
    }

    /**
     * Gets the value of the automaticUplinkGrant property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticUplinkGrantWs }
     *     
     */
    public AutomaticUplinkGrantWs getAutomaticUplinkGrant() {
        return automaticUplinkGrant;
    }

    /**
     * Sets the value of the automaticUplinkGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticUplinkGrantWs }
     *     
     */
    public void setAutomaticUplinkGrant(AutomaticUplinkGrantWs value) {
        this.automaticUplinkGrant = value;
    }

    /**
     * Gets the value of the qosBasedHo property.
     * 
     * @return
     *     possible object is
     *     {@link QosBasedHoWs }
     *     
     */
    public QosBasedHoWs getQosBasedHo() {
        return qosBasedHo;
    }

    /**
     * Sets the value of the qosBasedHo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QosBasedHoWs }
     *     
     */
    public void setQosBasedHo(QosBasedHoWs value) {
        this.qosBasedHo = value;
    }

}
