
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbCellAdvancedProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbCellAdvancedProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="NeighborManagement" type="{http://Airspan.Netspan.WebServices}CellNeighborManagementWs" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnr" type="{http://Airspan.Netspan.WebServices}CellInterRatAnrnWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityConnectedGeneral" type="{http://Airspan.Netspan.WebServices}MobilityConnectedGeneralWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityConnectedInterFreq" type="{http://Airspan.Netspan.WebServices}MobilityConnectedInterWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityConnectedIntraFreq" type="{http://Airspan.Netspan.WebServices}MobilityConnectedWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityConnectedQos" type="{http://Airspan.Netspan.WebServices}MobilityConnectedQosWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityIdleInterFreq" type="{http://Airspan.Netspan.WebServices}MobilityIdleInterFreqWs" minOccurs="0"/&gt;
 *         &lt;element name="MobilityIdleIntraFreq" type="{http://Airspan.Netspan.WebServices}MobilityIdleIntraFreqWs" minOccurs="0"/&gt;
 *         &lt;element name="Reselection" type="{http://Airspan.Netspan.WebServices}ReselectionWs" minOccurs="0"/&gt;
 *         &lt;element name="SoftFreqReuse" type="{http://Airspan.Netspan.WebServices}SoftFreqReuseWs" minOccurs="0"/&gt;
 *         &lt;element name="Sib1" type="{http://Airspan.Netspan.WebServices}Sib1Ws" minOccurs="0"/&gt;
 *         &lt;element name="RandomAccess" type="{http://Airspan.Netspan.WebServices}RandomAccessWs" minOccurs="0"/&gt;
 *         &lt;element name="Pusch" type="{http://Airspan.Netspan.WebServices}CellPuschWs" minOccurs="0"/&gt;
 *         &lt;element name="Pucch" type="{http://Airspan.Netspan.WebServices}CellPucchWs" minOccurs="0"/&gt;
 *         &lt;element name="RadioInterface" type="{http://Airspan.Netspan.WebServices}CellRadioInterfaceWs" minOccurs="0"/&gt;
 *         &lt;element name="Mac" type="{http://Airspan.Netspan.WebServices}MacWs" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionControl" type="{http://Airspan.Netspan.WebServices}ConnectionControlWs" minOccurs="0"/&gt;
 *         &lt;element name="UplinkLinkAdaptation" type="{http://Airspan.Netspan.WebServices}UplinkLinkAdaptationWs" minOccurs="0"/&gt;
 *         &lt;element name="AirSon" type="{http://Airspan.Netspan.WebServices}CellAirSonWs" minOccurs="0"/&gt;
 *         &lt;element name="Etws" type="{http://Airspan.Netspan.WebServices}EtwsWs" minOccurs="0"/&gt;
 *         &lt;element name="Embms" type="{http://Airspan.Netspan.WebServices}CellEmbmsWs" minOccurs="0"/&gt;
 *         &lt;element name="CallTrace" type="{http://Airspan.Netspan.WebServices}CellCallTraceWs" minOccurs="0"/&gt;
 *         &lt;element name="ControlChannelOverloadOptimization" type="{http://Airspan.Netspan.WebServices}CellDynamicCfiWs" minOccurs="0"/&gt;
 *         &lt;element name="IntraEnbLoadBalancing" type="{http://Airspan.Netspan.WebServices}IntraEnbLoadBalancingWs" minOccurs="0"/&gt;
 *         &lt;element name="DynamicIcic" type="{http://Airspan.Netspan.WebServices}CellDynamicIcicWs" minOccurs="0"/&gt;
 *         &lt;element name="Tpm" type="{http://Airspan.Netspan.WebServices}TpmWs" minOccurs="0"/&gt;
 *         &lt;element name="Csfb" type="{http://Airspan.Netspan.WebServices}CsfbWs" minOccurs="0"/&gt;
 *         &lt;element name="SmartUpLinkScheduler" type="{http://Airspan.Netspan.WebServices}SmartUpLinkSchedulerWs" minOccurs="0"/&gt;
 *         &lt;element name="QosBasedHo" type="{http://Airspan.Netspan.WebServices}CellQosBasedHoWs" minOccurs="0"/&gt;
 *         &lt;element name="UeCapability" type="{http://Airspan.Netspan.WebServices}UeCapabilityWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbCellAdvancedProfile", propOrder = {
    "name",
    "hardwareCategory",
    "neighborManagement",
    "interRatAnr",
    "mobilityConnectedGeneral",
    "mobilityConnectedInterFreq",
    "mobilityConnectedIntraFreq",
    "mobilityConnectedQos",
    "mobilityIdleInterFreq",
    "mobilityIdleIntraFreq",
    "reselection",
    "softFreqReuse",
    "sib1",
    "randomAccess",
    "pusch",
    "pucch",
    "radioInterface",
    "mac",
    "connectionControl",
    "uplinkLinkAdaptation",
    "airSon",
    "etws",
    "embms",
    "callTrace",
    "controlChannelOverloadOptimization",
    "intraEnbLoadBalancing",
    "dynamicIcic",
    "tpm",
    "csfb",
    "smartUpLinkScheduler",
    "qosBasedHo",
    "ueCapability"
})
@XmlSeeAlso({
    EnbCellAdvancedProfileGet.class
})
public class EnbCellAdvancedProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "NeighborManagement")
    protected CellNeighborManagementWs neighborManagement;
    @XmlElement(name = "InterRatAnr")
    protected CellInterRatAnrnWs interRatAnr;
    @XmlElement(name = "MobilityConnectedGeneral")
    protected MobilityConnectedGeneralWs mobilityConnectedGeneral;
    @XmlElement(name = "MobilityConnectedInterFreq")
    protected MobilityConnectedInterWs mobilityConnectedInterFreq;
    @XmlElement(name = "MobilityConnectedIntraFreq")
    protected MobilityConnectedWs mobilityConnectedIntraFreq;
    @XmlElement(name = "MobilityConnectedQos")
    protected MobilityConnectedQosWs mobilityConnectedQos;
    @XmlElement(name = "MobilityIdleInterFreq")
    protected MobilityIdleInterFreqWs mobilityIdleInterFreq;
    @XmlElement(name = "MobilityIdleIntraFreq")
    protected MobilityIdleIntraFreqWs mobilityIdleIntraFreq;
    @XmlElement(name = "Reselection")
    protected ReselectionWs reselection;
    @XmlElement(name = "SoftFreqReuse")
    protected SoftFreqReuseWs softFreqReuse;
    @XmlElement(name = "Sib1")
    protected Sib1Ws sib1;
    @XmlElement(name = "RandomAccess")
    protected RandomAccessWs randomAccess;
    @XmlElement(name = "Pusch")
    protected CellPuschWs pusch;
    @XmlElement(name = "Pucch")
    protected CellPucchWs pucch;
    @XmlElement(name = "RadioInterface")
    protected CellRadioInterfaceWs radioInterface;
    @XmlElement(name = "Mac")
    protected MacWs mac;
    @XmlElement(name = "ConnectionControl")
    protected ConnectionControlWs connectionControl;
    @XmlElement(name = "UplinkLinkAdaptation")
    protected UplinkLinkAdaptationWs uplinkLinkAdaptation;
    @XmlElement(name = "AirSon")
    protected CellAirSonWs airSon;
    @XmlElement(name = "Etws")
    protected EtwsWs etws;
    @XmlElement(name = "Embms")
    protected CellEmbmsWs embms;
    @XmlElement(name = "CallTrace")
    protected CellCallTraceWs callTrace;
    @XmlElement(name = "ControlChannelOverloadOptimization")
    protected CellDynamicCfiWs controlChannelOverloadOptimization;
    @XmlElement(name = "IntraEnbLoadBalancing")
    protected IntraEnbLoadBalancingWs intraEnbLoadBalancing;
    @XmlElement(name = "DynamicIcic")
    protected CellDynamicIcicWs dynamicIcic;
    @XmlElement(name = "Tpm")
    protected TpmWs tpm;
    @XmlElement(name = "Csfb")
    protected CsfbWs csfb;
    @XmlElement(name = "SmartUpLinkScheduler")
    protected SmartUpLinkSchedulerWs smartUpLinkScheduler;
    @XmlElement(name = "QosBasedHo")
    protected CellQosBasedHoWs qosBasedHo;
    @XmlElement(name = "UeCapability")
    protected UeCapabilityWs ueCapability;

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
     *     {@link CellNeighborManagementWs }
     *     
     */
    public CellNeighborManagementWs getNeighborManagement() {
        return neighborManagement;
    }

    /**
     * Sets the value of the neighborManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellNeighborManagementWs }
     *     
     */
    public void setNeighborManagement(CellNeighborManagementWs value) {
        this.neighborManagement = value;
    }

    /**
     * Gets the value of the interRatAnr property.
     * 
     * @return
     *     possible object is
     *     {@link CellInterRatAnrnWs }
     *     
     */
    public CellInterRatAnrnWs getInterRatAnr() {
        return interRatAnr;
    }

    /**
     * Sets the value of the interRatAnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellInterRatAnrnWs }
     *     
     */
    public void setInterRatAnr(CellInterRatAnrnWs value) {
        this.interRatAnr = value;
    }

    /**
     * Gets the value of the mobilityConnectedGeneral property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedGeneralWs }
     *     
     */
    public MobilityConnectedGeneralWs getMobilityConnectedGeneral() {
        return mobilityConnectedGeneral;
    }

    /**
     * Sets the value of the mobilityConnectedGeneral property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedGeneralWs }
     *     
     */
    public void setMobilityConnectedGeneral(MobilityConnectedGeneralWs value) {
        this.mobilityConnectedGeneral = value;
    }

    /**
     * Gets the value of the mobilityConnectedInterFreq property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedInterWs }
     *     
     */
    public MobilityConnectedInterWs getMobilityConnectedInterFreq() {
        return mobilityConnectedInterFreq;
    }

    /**
     * Sets the value of the mobilityConnectedInterFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedInterWs }
     *     
     */
    public void setMobilityConnectedInterFreq(MobilityConnectedInterWs value) {
        this.mobilityConnectedInterFreq = value;
    }

    /**
     * Gets the value of the mobilityConnectedIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedWs }
     *     
     */
    public MobilityConnectedWs getMobilityConnectedIntraFreq() {
        return mobilityConnectedIntraFreq;
    }

    /**
     * Sets the value of the mobilityConnectedIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedWs }
     *     
     */
    public void setMobilityConnectedIntraFreq(MobilityConnectedWs value) {
        this.mobilityConnectedIntraFreq = value;
    }

    /**
     * Gets the value of the mobilityConnectedQos property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedQosWs }
     *     
     */
    public MobilityConnectedQosWs getMobilityConnectedQos() {
        return mobilityConnectedQos;
    }

    /**
     * Sets the value of the mobilityConnectedQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedQosWs }
     *     
     */
    public void setMobilityConnectedQos(MobilityConnectedQosWs value) {
        this.mobilityConnectedQos = value;
    }

    /**
     * Gets the value of the mobilityIdleInterFreq property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleInterFreqWs }
     *     
     */
    public MobilityIdleInterFreqWs getMobilityIdleInterFreq() {
        return mobilityIdleInterFreq;
    }

    /**
     * Sets the value of the mobilityIdleInterFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleInterFreqWs }
     *     
     */
    public void setMobilityIdleInterFreq(MobilityIdleInterFreqWs value) {
        this.mobilityIdleInterFreq = value;
    }

    /**
     * Gets the value of the mobilityIdleIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleIntraFreqWs }
     *     
     */
    public MobilityIdleIntraFreqWs getMobilityIdleIntraFreq() {
        return mobilityIdleIntraFreq;
    }

    /**
     * Sets the value of the mobilityIdleIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleIntraFreqWs }
     *     
     */
    public void setMobilityIdleIntraFreq(MobilityIdleIntraFreqWs value) {
        this.mobilityIdleIntraFreq = value;
    }

    /**
     * Gets the value of the reselection property.
     * 
     * @return
     *     possible object is
     *     {@link ReselectionWs }
     *     
     */
    public ReselectionWs getReselection() {
        return reselection;
    }

    /**
     * Sets the value of the reselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReselectionWs }
     *     
     */
    public void setReselection(ReselectionWs value) {
        this.reselection = value;
    }

    /**
     * Gets the value of the softFreqReuse property.
     * 
     * @return
     *     possible object is
     *     {@link SoftFreqReuseWs }
     *     
     */
    public SoftFreqReuseWs getSoftFreqReuse() {
        return softFreqReuse;
    }

    /**
     * Sets the value of the softFreqReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftFreqReuseWs }
     *     
     */
    public void setSoftFreqReuse(SoftFreqReuseWs value) {
        this.softFreqReuse = value;
    }

    /**
     * Gets the value of the sib1 property.
     * 
     * @return
     *     possible object is
     *     {@link Sib1Ws }
     *     
     */
    public Sib1Ws getSib1() {
        return sib1;
    }

    /**
     * Sets the value of the sib1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sib1Ws }
     *     
     */
    public void setSib1(Sib1Ws value) {
        this.sib1 = value;
    }

    /**
     * Gets the value of the randomAccess property.
     * 
     * @return
     *     possible object is
     *     {@link RandomAccessWs }
     *     
     */
    public RandomAccessWs getRandomAccess() {
        return randomAccess;
    }

    /**
     * Sets the value of the randomAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomAccessWs }
     *     
     */
    public void setRandomAccess(RandomAccessWs value) {
        this.randomAccess = value;
    }

    /**
     * Gets the value of the pusch property.
     * 
     * @return
     *     possible object is
     *     {@link CellPuschWs }
     *     
     */
    public CellPuschWs getPusch() {
        return pusch;
    }

    /**
     * Sets the value of the pusch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellPuschWs }
     *     
     */
    public void setPusch(CellPuschWs value) {
        this.pusch = value;
    }

    /**
     * Gets the value of the pucch property.
     * 
     * @return
     *     possible object is
     *     {@link CellPucchWs }
     *     
     */
    public CellPucchWs getPucch() {
        return pucch;
    }

    /**
     * Sets the value of the pucch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellPucchWs }
     *     
     */
    public void setPucch(CellPucchWs value) {
        this.pucch = value;
    }

    /**
     * Gets the value of the radioInterface property.
     * 
     * @return
     *     possible object is
     *     {@link CellRadioInterfaceWs }
     *     
     */
    public CellRadioInterfaceWs getRadioInterface() {
        return radioInterface;
    }

    /**
     * Sets the value of the radioInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellRadioInterfaceWs }
     *     
     */
    public void setRadioInterface(CellRadioInterfaceWs value) {
        this.radioInterface = value;
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link MacWs }
     *     
     */
    public MacWs getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link MacWs }
     *     
     */
    public void setMac(MacWs value) {
        this.mac = value;
    }

    /**
     * Gets the value of the connectionControl property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionControlWs }
     *     
     */
    public ConnectionControlWs getConnectionControl() {
        return connectionControl;
    }

    /**
     * Sets the value of the connectionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionControlWs }
     *     
     */
    public void setConnectionControl(ConnectionControlWs value) {
        this.connectionControl = value;
    }

    /**
     * Gets the value of the uplinkLinkAdaptation property.
     * 
     * @return
     *     possible object is
     *     {@link UplinkLinkAdaptationWs }
     *     
     */
    public UplinkLinkAdaptationWs getUplinkLinkAdaptation() {
        return uplinkLinkAdaptation;
    }

    /**
     * Sets the value of the uplinkLinkAdaptation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UplinkLinkAdaptationWs }
     *     
     */
    public void setUplinkLinkAdaptation(UplinkLinkAdaptationWs value) {
        this.uplinkLinkAdaptation = value;
    }

    /**
     * Gets the value of the airSon property.
     * 
     * @return
     *     possible object is
     *     {@link CellAirSonWs }
     *     
     */
    public CellAirSonWs getAirSon() {
        return airSon;
    }

    /**
     * Sets the value of the airSon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellAirSonWs }
     *     
     */
    public void setAirSon(CellAirSonWs value) {
        this.airSon = value;
    }

    /**
     * Gets the value of the etws property.
     * 
     * @return
     *     possible object is
     *     {@link EtwsWs }
     *     
     */
    public EtwsWs getEtws() {
        return etws;
    }

    /**
     * Sets the value of the etws property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtwsWs }
     *     
     */
    public void setEtws(EtwsWs value) {
        this.etws = value;
    }

    /**
     * Gets the value of the embms property.
     * 
     * @return
     *     possible object is
     *     {@link CellEmbmsWs }
     *     
     */
    public CellEmbmsWs getEmbms() {
        return embms;
    }

    /**
     * Sets the value of the embms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellEmbmsWs }
     *     
     */
    public void setEmbms(CellEmbmsWs value) {
        this.embms = value;
    }

    /**
     * Gets the value of the callTrace property.
     * 
     * @return
     *     possible object is
     *     {@link CellCallTraceWs }
     *     
     */
    public CellCallTraceWs getCallTrace() {
        return callTrace;
    }

    /**
     * Sets the value of the callTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellCallTraceWs }
     *     
     */
    public void setCallTrace(CellCallTraceWs value) {
        this.callTrace = value;
    }

    /**
     * Gets the value of the controlChannelOverloadOptimization property.
     * 
     * @return
     *     possible object is
     *     {@link CellDynamicCfiWs }
     *     
     */
    public CellDynamicCfiWs getControlChannelOverloadOptimization() {
        return controlChannelOverloadOptimization;
    }

    /**
     * Sets the value of the controlChannelOverloadOptimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellDynamicCfiWs }
     *     
     */
    public void setControlChannelOverloadOptimization(CellDynamicCfiWs value) {
        this.controlChannelOverloadOptimization = value;
    }

    /**
     * Gets the value of the intraEnbLoadBalancing property.
     * 
     * @return
     *     possible object is
     *     {@link IntraEnbLoadBalancingWs }
     *     
     */
    public IntraEnbLoadBalancingWs getIntraEnbLoadBalancing() {
        return intraEnbLoadBalancing;
    }

    /**
     * Sets the value of the intraEnbLoadBalancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraEnbLoadBalancingWs }
     *     
     */
    public void setIntraEnbLoadBalancing(IntraEnbLoadBalancingWs value) {
        this.intraEnbLoadBalancing = value;
    }

    /**
     * Gets the value of the dynamicIcic property.
     * 
     * @return
     *     possible object is
     *     {@link CellDynamicIcicWs }
     *     
     */
    public CellDynamicIcicWs getDynamicIcic() {
        return dynamicIcic;
    }

    /**
     * Sets the value of the dynamicIcic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellDynamicIcicWs }
     *     
     */
    public void setDynamicIcic(CellDynamicIcicWs value) {
        this.dynamicIcic = value;
    }

    /**
     * Gets the value of the tpm property.
     * 
     * @return
     *     possible object is
     *     {@link TpmWs }
     *     
     */
    public TpmWs getTpm() {
        return tpm;
    }

    /**
     * Sets the value of the tpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpmWs }
     *     
     */
    public void setTpm(TpmWs value) {
        this.tpm = value;
    }

    /**
     * Gets the value of the csfb property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbWs }
     *     
     */
    public CsfbWs getCsfb() {
        return csfb;
    }

    /**
     * Sets the value of the csfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbWs }
     *     
     */
    public void setCsfb(CsfbWs value) {
        this.csfb = value;
    }

    /**
     * Gets the value of the smartUpLinkScheduler property.
     * 
     * @return
     *     possible object is
     *     {@link SmartUpLinkSchedulerWs }
     *     
     */
    public SmartUpLinkSchedulerWs getSmartUpLinkScheduler() {
        return smartUpLinkScheduler;
    }

    /**
     * Sets the value of the smartUpLinkScheduler property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartUpLinkSchedulerWs }
     *     
     */
    public void setSmartUpLinkScheduler(SmartUpLinkSchedulerWs value) {
        this.smartUpLinkScheduler = value;
    }

    /**
     * Gets the value of the qosBasedHo property.
     * 
     * @return
     *     possible object is
     *     {@link CellQosBasedHoWs }
     *     
     */
    public CellQosBasedHoWs getQosBasedHo() {
        return qosBasedHo;
    }

    /**
     * Sets the value of the qosBasedHo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellQosBasedHoWs }
     *     
     */
    public void setQosBasedHo(CellQosBasedHoWs value) {
        this.qosBasedHo = value;
    }

    /**
     * Gets the value of the ueCapability property.
     * 
     * @return
     *     possible object is
     *     {@link UeCapabilityWs }
     *     
     */
    public UeCapabilityWs getUeCapability() {
        return ueCapability;
    }

    /**
     * Sets the value of the ueCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link UeCapabilityWs }
     *     
     */
    public void setUeCapability(UeCapabilityWs value) {
        this.ueCapability = value;
    }

}
