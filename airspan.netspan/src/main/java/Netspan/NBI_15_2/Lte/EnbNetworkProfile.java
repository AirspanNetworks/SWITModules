
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbNetworkProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbNetworkProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="IsStandardVoLTECodec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CodecType" type="{http://Airspan.Netspan.WebServices}VoLTECodecType" minOccurs="0"/>
 *         &lt;element name="CodecMode" type="{http://Airspan.Netspan.WebServices}VoLTECodecMode" minOccurs="0"/>
 *         &lt;element name="PacketSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketPeriodicity" type="{http://Airspan.Netspan.WebServices}VoLTEPeriodicity" minOccurs="0"/>
 *         &lt;element name="IsRohcProfilesQci1Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MmeOverloadAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MmeOverloadWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MmeOverloadLoadReductionAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CbrsMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CbrsSasAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlmnList" type="{http://Airspan.Netspan.WebServices}PlmnListContainer" minOccurs="0"/>
 *         &lt;element name="S1X2List" type="{http://Airspan.Netspan.WebServices}S1ListContainer" minOccurs="0"/>
 *         &lt;element name="CSONConfig" type="{http://Airspan.Netspan.WebServices}LteCSonEntryWs" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="M2McePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MceIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MceSctpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsS1CVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S1CVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsS1UVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S1UVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsX2CVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2CVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsX2UVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2UVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPtpVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PtpVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCSonVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CSonVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsM2VlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="M2VlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsM1VlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="M1VlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCallTraceSvrVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CallTraceSvrVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlPktDataPriorityList" type="{http://Airspan.Netspan.WebServices}UlPktDataPriorityListContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbNetworkProfile", propOrder = {
    "name",
    "hardwareCategory",
    "isStandardVoLTECodec",
    "codecType",
    "codecMode",
    "packetSize",
    "packetPeriodicity",
    "isRohcProfilesQci1Enabled",
    "mmeOverloadAdmin",
    "mmeOverloadWaitTime",
    "mmeOverloadLoadReductionAdmin",
    "cbrsMode",
    "cbrsSasAddress",
    "plmnList",
    "s1X2List",
    "csonConfig",
    "callTraceSvrPresent",
    "callTraceSvrIpAddress",
    "callTraceSvrPort",
    "m2McePresent",
    "mceIpAddress",
    "mceSctpPort",
    "isS1CVlanConfigured",
    "s1CVlanId",
    "isS1UVlanConfigured",
    "s1UVlanId",
    "isX2CVlanConfigured",
    "x2CVlanId",
    "isX2UVlanConfigured",
    "x2UVlanId",
    "isPtpVlanConfigured",
    "ptpVlanId",
    "isCSonVlanConfigured",
    "cSonVlanId",
    "isM2VlanConfigured",
    "m2VlanId",
    "isM1VlanConfigured",
    "m1VlanId",
    "isCallTraceSvrVlanConfigured",
    "callTraceSvrVlanId",
    "ulPktDataPriorityList"
})
public class EnbNetworkProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "IsStandardVoLTECodec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStandardVoLTECodec;
    @XmlElementRef(name = "CodecType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTECodecType> codecType;
    @XmlElementRef(name = "CodecMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTECodecMode> codecMode;
    @XmlElementRef(name = "PacketSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetSize;
    @XmlElementRef(name = "PacketPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTEPeriodicity> packetPeriodicity;
    @XmlElementRef(name = "IsRohcProfilesQci1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcProfilesQci1Enabled;
    @XmlElementRef(name = "MmeOverloadAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mmeOverloadAdmin;
    @XmlElementRef(name = "MmeOverloadWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadWaitTime;
    @XmlElementRef(name = "MmeOverloadLoadReductionAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mmeOverloadLoadReductionAdmin;
    @XmlElementRef(name = "CbrsMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> cbrsMode;
    @XmlElement(name = "CbrsSasAddress")
    protected String cbrsSasAddress;
    @XmlElement(name = "PlmnList")
    protected PlmnListContainer plmnList;
    @XmlElement(name = "S1X2List")
    protected S1ListContainer s1X2List;
    @XmlElement(name = "CSONConfig")
    protected LteCSonEntryWs csonConfig;
    @XmlElementRef(name = "CallTraceSvrPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> callTraceSvrPresent;
    @XmlElement(name = "CallTraceSvrIpAddress")
    protected String callTraceSvrIpAddress;
    @XmlElementRef(name = "CallTraceSvrPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callTraceSvrPort;
    @XmlElementRef(name = "M2McePresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> m2McePresent;
    @XmlElement(name = "MceIpAddress")
    protected String mceIpAddress;
    @XmlElementRef(name = "MceSctpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mceSctpPort;
    @XmlElementRef(name = "IsS1CVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isS1CVlanConfigured;
    @XmlElementRef(name = "S1CVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1CVlanId;
    @XmlElementRef(name = "IsS1UVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isS1UVlanConfigured;
    @XmlElementRef(name = "S1UVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UVlanId;
    @XmlElementRef(name = "IsX2CVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isX2CVlanConfigured;
    @XmlElementRef(name = "X2CVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2CVlanId;
    @XmlElementRef(name = "IsX2UVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isX2UVlanConfigured;
    @XmlElementRef(name = "X2UVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2UVlanId;
    @XmlElementRef(name = "IsPtpVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPtpVlanConfigured;
    @XmlElementRef(name = "PtpVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpVlanId;
    @XmlElementRef(name = "IsCSonVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonVlanConfigured;
    @XmlElementRef(name = "CSonVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonVlanId;
    @XmlElementRef(name = "IsM2VlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isM2VlanConfigured;
    @XmlElementRef(name = "M2VlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2VlanId;
    @XmlElementRef(name = "IsM1VlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isM1VlanConfigured;
    @XmlElementRef(name = "M1VlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m1VlanId;
    @XmlElement(name = "IsCallTraceSvrVlanConfigured", required = true, type = Boolean.class, nillable = true)
    protected Boolean isCallTraceSvrVlanConfigured;
    @XmlElementRef(name = "CallTraceSvrVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callTraceSvrVlanId;
    @XmlElement(name = "UlPktDataPriorityList")
    protected UlPktDataPriorityListContainer ulPktDataPriorityList;

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
     * Gets the value of the isStandardVoLTECodec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStandardVoLTECodec() {
        return isStandardVoLTECodec;
    }

    /**
     * Sets the value of the isStandardVoLTECodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStandardVoLTECodec(JAXBElement<Boolean> value) {
        this.isStandardVoLTECodec = value;
    }

    /**
     * Gets the value of the codecType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecType }{@code >}
     *     
     */
    public JAXBElement<VoLTECodecType> getCodecType() {
        return codecType;
    }

    /**
     * Sets the value of the codecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecType }{@code >}
     *     
     */
    public void setCodecType(JAXBElement<VoLTECodecType> value) {
        this.codecType = value;
    }

    /**
     * Gets the value of the codecMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecMode }{@code >}
     *     
     */
    public JAXBElement<VoLTECodecMode> getCodecMode() {
        return codecMode;
    }

    /**
     * Sets the value of the codecMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecMode }{@code >}
     *     
     */
    public void setCodecMode(JAXBElement<VoLTECodecMode> value) {
        this.codecMode = value;
    }

    /**
     * Gets the value of the packetSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketSize() {
        return packetSize;
    }

    /**
     * Sets the value of the packetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketSize(JAXBElement<Integer> value) {
        this.packetSize = value;
    }

    /**
     * Gets the value of the packetPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTEPeriodicity }{@code >}
     *     
     */
    public JAXBElement<VoLTEPeriodicity> getPacketPeriodicity() {
        return packetPeriodicity;
    }

    /**
     * Sets the value of the packetPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTEPeriodicity }{@code >}
     *     
     */
    public void setPacketPeriodicity(JAXBElement<VoLTEPeriodicity> value) {
        this.packetPeriodicity = value;
    }

    /**
     * Gets the value of the isRohcProfilesQci1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcProfilesQci1Enabled() {
        return isRohcProfilesQci1Enabled;
    }

    /**
     * Sets the value of the isRohcProfilesQci1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcProfilesQci1Enabled(JAXBElement<Boolean> value) {
        this.isRohcProfilesQci1Enabled = value;
    }

    /**
     * Gets the value of the mmeOverloadAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMmeOverloadAdmin() {
        return mmeOverloadAdmin;
    }

    /**
     * Sets the value of the mmeOverloadAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMmeOverloadAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.mmeOverloadAdmin = value;
    }

    /**
     * Gets the value of the mmeOverloadWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadWaitTime() {
        return mmeOverloadWaitTime;
    }

    /**
     * Sets the value of the mmeOverloadWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadWaitTime(JAXBElement<Integer> value) {
        this.mmeOverloadWaitTime = value;
    }

    /**
     * Gets the value of the mmeOverloadLoadReductionAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMmeOverloadLoadReductionAdmin() {
        return mmeOverloadLoadReductionAdmin;
    }

    /**
     * Sets the value of the mmeOverloadLoadReductionAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMmeOverloadLoadReductionAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.mmeOverloadLoadReductionAdmin = value;
    }

    /**
     * Gets the value of the cbrsMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCbrsMode() {
        return cbrsMode;
    }

    /**
     * Sets the value of the cbrsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCbrsMode(JAXBElement<EnabledDisabledStates> value) {
        this.cbrsMode = value;
    }

    /**
     * Gets the value of the cbrsSasAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbrsSasAddress() {
        return cbrsSasAddress;
    }

    /**
     * Sets the value of the cbrsSasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbrsSasAddress(String value) {
        this.cbrsSasAddress = value;
    }

    /**
     * Gets the value of the plmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnListContainer }
     *     
     */
    public PlmnListContainer getPlmnList() {
        return plmnList;
    }

    /**
     * Sets the value of the plmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnListContainer }
     *     
     */
    public void setPlmnList(PlmnListContainer value) {
        this.plmnList = value;
    }

    /**
     * Gets the value of the s1X2List property.
     * 
     * @return
     *     possible object is
     *     {@link S1ListContainer }
     *     
     */
    public S1ListContainer getS1X2List() {
        return s1X2List;
    }

    /**
     * Sets the value of the s1X2List property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1ListContainer }
     *     
     */
    public void setS1X2List(S1ListContainer value) {
        this.s1X2List = value;
    }

    /**
     * Gets the value of the csonConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public LteCSonEntryWs getCSONConfig() {
        return csonConfig;
    }

    /**
     * Sets the value of the csonConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public void setCSONConfig(LteCSonEntryWs value) {
        this.csonConfig = value;
    }

    /**
     * Gets the value of the callTraceSvrPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCallTraceSvrPresent() {
        return callTraceSvrPresent;
    }

    /**
     * Sets the value of the callTraceSvrPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCallTraceSvrPresent(JAXBElement<Boolean> value) {
        this.callTraceSvrPresent = value;
    }

    /**
     * Gets the value of the callTraceSvrIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceSvrIpAddress() {
        return callTraceSvrIpAddress;
    }

    /**
     * Sets the value of the callTraceSvrIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceSvrIpAddress(String value) {
        this.callTraceSvrIpAddress = value;
    }

    /**
     * Gets the value of the callTraceSvrPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallTraceSvrPort() {
        return callTraceSvrPort;
    }

    /**
     * Sets the value of the callTraceSvrPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallTraceSvrPort(JAXBElement<Integer> value) {
        this.callTraceSvrPort = value;
    }

    /**
     * Gets the value of the m2McePresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getM2McePresent() {
        return m2McePresent;
    }

    /**
     * Sets the value of the m2McePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setM2McePresent(JAXBElement<Boolean> value) {
        this.m2McePresent = value;
    }

    /**
     * Gets the value of the mceIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMceIpAddress() {
        return mceIpAddress;
    }

    /**
     * Sets the value of the mceIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMceIpAddress(String value) {
        this.mceIpAddress = value;
    }

    /**
     * Gets the value of the mceSctpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMceSctpPort() {
        return mceSctpPort;
    }

    /**
     * Sets the value of the mceSctpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMceSctpPort(JAXBElement<Integer> value) {
        this.mceSctpPort = value;
    }

    /**
     * Gets the value of the isS1CVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsS1CVlanConfigured() {
        return isS1CVlanConfigured;
    }

    /**
     * Sets the value of the isS1CVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsS1CVlanConfigured(JAXBElement<Boolean> value) {
        this.isS1CVlanConfigured = value;
    }

    /**
     * Gets the value of the s1CVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1CVlanId() {
        return s1CVlanId;
    }

    /**
     * Sets the value of the s1CVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1CVlanId(JAXBElement<Integer> value) {
        this.s1CVlanId = value;
    }

    /**
     * Gets the value of the isS1UVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsS1UVlanConfigured() {
        return isS1UVlanConfigured;
    }

    /**
     * Sets the value of the isS1UVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsS1UVlanConfigured(JAXBElement<Boolean> value) {
        this.isS1UVlanConfigured = value;
    }

    /**
     * Gets the value of the s1UVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UVlanId() {
        return s1UVlanId;
    }

    /**
     * Sets the value of the s1UVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UVlanId(JAXBElement<Integer> value) {
        this.s1UVlanId = value;
    }

    /**
     * Gets the value of the isX2CVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsX2CVlanConfigured() {
        return isX2CVlanConfigured;
    }

    /**
     * Sets the value of the isX2CVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsX2CVlanConfigured(JAXBElement<Boolean> value) {
        this.isX2CVlanConfigured = value;
    }

    /**
     * Gets the value of the x2CVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2CVlanId() {
        return x2CVlanId;
    }

    /**
     * Sets the value of the x2CVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2CVlanId(JAXBElement<Integer> value) {
        this.x2CVlanId = value;
    }

    /**
     * Gets the value of the isX2UVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsX2UVlanConfigured() {
        return isX2UVlanConfigured;
    }

    /**
     * Sets the value of the isX2UVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsX2UVlanConfigured(JAXBElement<Boolean> value) {
        this.isX2UVlanConfigured = value;
    }

    /**
     * Gets the value of the x2UVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2UVlanId() {
        return x2UVlanId;
    }

    /**
     * Sets the value of the x2UVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2UVlanId(JAXBElement<Integer> value) {
        this.x2UVlanId = value;
    }

    /**
     * Gets the value of the isPtpVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPtpVlanConfigured() {
        return isPtpVlanConfigured;
    }

    /**
     * Sets the value of the isPtpVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPtpVlanConfigured(JAXBElement<Boolean> value) {
        this.isPtpVlanConfigured = value;
    }

    /**
     * Gets the value of the ptpVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpVlanId() {
        return ptpVlanId;
    }

    /**
     * Sets the value of the ptpVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpVlanId(JAXBElement<Integer> value) {
        this.ptpVlanId = value;
    }

    /**
     * Gets the value of the isCSonVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonVlanConfigured() {
        return isCSonVlanConfigured;
    }

    /**
     * Sets the value of the isCSonVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonVlanConfigured(JAXBElement<Boolean> value) {
        this.isCSonVlanConfigured = value;
    }

    /**
     * Gets the value of the cSonVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonVlanId() {
        return cSonVlanId;
    }

    /**
     * Sets the value of the cSonVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonVlanId(JAXBElement<Integer> value) {
        this.cSonVlanId = value;
    }

    /**
     * Gets the value of the isM2VlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsM2VlanConfigured() {
        return isM2VlanConfigured;
    }

    /**
     * Sets the value of the isM2VlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsM2VlanConfigured(JAXBElement<Boolean> value) {
        this.isM2VlanConfigured = value;
    }

    /**
     * Gets the value of the m2VlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2VlanId() {
        return m2VlanId;
    }

    /**
     * Sets the value of the m2VlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2VlanId(JAXBElement<Integer> value) {
        this.m2VlanId = value;
    }

    /**
     * Gets the value of the isM1VlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsM1VlanConfigured() {
        return isM1VlanConfigured;
    }

    /**
     * Sets the value of the isM1VlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsM1VlanConfigured(JAXBElement<Boolean> value) {
        this.isM1VlanConfigured = value;
    }

    /**
     * Gets the value of the m1VlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM1VlanId() {
        return m1VlanId;
    }

    /**
     * Sets the value of the m1VlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM1VlanId(JAXBElement<Integer> value) {
        this.m1VlanId = value;
    }

    /**
     * Gets the value of the isCallTraceSvrVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallTraceSvrVlanConfigured() {
        return isCallTraceSvrVlanConfigured;
    }

    /**
     * Sets the value of the isCallTraceSvrVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallTraceSvrVlanConfigured(Boolean value) {
        this.isCallTraceSvrVlanConfigured = value;
    }

    /**
     * Gets the value of the callTraceSvrVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallTraceSvrVlanId() {
        return callTraceSvrVlanId;
    }

    /**
     * Sets the value of the callTraceSvrVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallTraceSvrVlanId(JAXBElement<Integer> value) {
        this.callTraceSvrVlanId = value;
    }

    /**
     * Gets the value of the ulPktDataPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public UlPktDataPriorityListContainer getUlPktDataPriorityList() {
        return ulPktDataPriorityList;
    }

    /**
     * Sets the value of the ulPktDataPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public void setUlPktDataPriorityList(UlPktDataPriorityListContainer value) {
        this.ulPktDataPriorityList = value;
    }

}
