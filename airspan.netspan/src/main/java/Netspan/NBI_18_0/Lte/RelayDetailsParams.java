
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for RelayDetailsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayDetailsParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManagementModeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelayProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomRelayProfileParameters" type="{http://Airspan.Netspan.WebServices}RelayProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="RelayAdvancedProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomRelayAdvancedProfileParameters" type="{http://Airspan.Netspan.WebServices}RelayAdvancedProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="IsPdclLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LedMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="PdclGroupMode" type="{http://Airspan.Netspan.WebServices}PdclGroupModeValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="Pdcl" type="{http://Airspan.Netspan.WebServices}PdclList" minOccurs="0"/&gt;
 *         &lt;element name="AllowedBands" type="{http://Airspan.Netspan.WebServices}AllowedBandWs" minOccurs="0"/&gt;
 *         &lt;element name="CaMode" type="{http://Airspan.Netspan.WebServices}CaModeValues" minOccurs="0"/&gt;
 *         &lt;element name="InterBandCaModeDl" type="{http://Airspan.Netspan.WebServices}InterBandCaModeDlValues" minOccurs="0"/&gt;
 *         &lt;element name="IsSeGwInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SeGwAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelaySbaMode" type="{http://Airspan.Netspan.WebServices}RelaySbaValues" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifi" type="{http://Airspan.Netspan.WebServices}RelayBackhaulWifiMode" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulEthernet" type="{http://Airspan.Netspan.WebServices}RelayBackhaulEthernetMode" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulUsb" type="{http://Airspan.Netspan.WebServices}RelayBackhaulUsbMode" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulLte" type="{http://Airspan.Netspan.WebServices}RelayBackhaulLteMode" minOccurs="0"/&gt;
 *         &lt;element name="QdclGroupMode" type="{http://Airspan.Netspan.WebServices}QdclGroupModeValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="Qdcl" type="{http://Airspan.Netspan.WebServices}QdclListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayDetailsParams", propOrder = {
    "managementModeOnly",
    "systemDefaultProfile",
    "relayProfile",
    "customRelayProfileParameters",
    "relayAdvancedProfile",
    "customRelayAdvancedProfileParameters",
    "isPdclLocked",
    "ledMode",
    "pdclGroupMode",
    "pdcl",
    "allowedBands",
    "caMode",
    "interBandCaModeDl",
    "isSeGwInterfaceEnabled",
    "seGwAddress",
    "relaySbaMode",
    "backhaulWifi",
    "backhaulEthernet",
    "backhaulUsb",
    "backhaulLte",
    "qdclGroupMode",
    "qdcl"
})
@XmlSeeAlso({
    AuRelayDetails.class
})
public class RelayDetailsParams {

    @XmlElementRef(name = "ManagementModeOnly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> managementModeOnly;
    @XmlElement(name = "SystemDefaultProfile")
    protected String systemDefaultProfile;
    @XmlElement(name = "RelayProfile")
    protected String relayProfile;
    @XmlElement(name = "CustomRelayProfileParameters")
    protected RelayProfileParams customRelayProfileParameters;
    @XmlElement(name = "RelayAdvancedProfile")
    protected String relayAdvancedProfile;
    @XmlElement(name = "CustomRelayAdvancedProfileParameters")
    protected RelayAdvancedProfileParams customRelayAdvancedProfileParameters;
    @XmlElementRef(name = "IsPdclLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPdclLocked;
    @XmlElementRef(name = "LedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ledMode;
    @XmlElementRef(name = "PdclGroupMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PdclGroupModeValuesWs> pdclGroupMode;
    @XmlElement(name = "Pdcl")
    protected PdclList pdcl;
    @XmlElement(name = "AllowedBands")
    protected AllowedBandWs allowedBands;
    @XmlElementRef(name = "CaMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CaModeValues> caMode;
    @XmlElementRef(name = "InterBandCaModeDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<InterBandCaModeDlValues> interBandCaModeDl;
    @XmlElementRef(name = "IsSeGwInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isSeGwInterfaceEnabled;
    @XmlElement(name = "SeGwAddress")
    protected String seGwAddress;
    @XmlElementRef(name = "RelaySbaMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relaySbaMode;
    @XmlElementRef(name = "BackhaulWifi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBackhaulWifiMode> backhaulWifi;
    @XmlElementRef(name = "BackhaulEthernet", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBackhaulEthernetMode> backhaulEthernet;
    @XmlElementRef(name = "BackhaulUsb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBackhaulUsbMode> backhaulUsb;
    @XmlElementRef(name = "BackhaulLte", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBackhaulLteMode> backhaulLte;
    @XmlElementRef(name = "QdclGroupMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<QdclGroupModeValuesWs> qdclGroupMode;
    @XmlElement(name = "Qdcl")
    protected QdclListContainer qdcl;

    /**
     * Gets the value of the managementModeOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getManagementModeOnly() {
        return managementModeOnly;
    }

    /**
     * Sets the value of the managementModeOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setManagementModeOnly(JAXBElement<Boolean> value) {
        this.managementModeOnly = value;
    }

    /**
     * Gets the value of the systemDefaultProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDefaultProfile() {
        return systemDefaultProfile;
    }

    /**
     * Sets the value of the systemDefaultProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDefaultProfile(String value) {
        this.systemDefaultProfile = value;
    }

    /**
     * Gets the value of the relayProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayProfile() {
        return relayProfile;
    }

    /**
     * Sets the value of the relayProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayProfile(String value) {
        this.relayProfile = value;
    }

    /**
     * Gets the value of the customRelayProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RelayProfileParams }
     *     
     */
    public RelayProfileParams getCustomRelayProfileParameters() {
        return customRelayProfileParameters;
    }

    /**
     * Sets the value of the customRelayProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayProfileParams }
     *     
     */
    public void setCustomRelayProfileParameters(RelayProfileParams value) {
        this.customRelayProfileParameters = value;
    }

    /**
     * Gets the value of the relayAdvancedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayAdvancedProfile() {
        return relayAdvancedProfile;
    }

    /**
     * Sets the value of the relayAdvancedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayAdvancedProfile(String value) {
        this.relayAdvancedProfile = value;
    }

    /**
     * Gets the value of the customRelayAdvancedProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RelayAdvancedProfileParams }
     *     
     */
    public RelayAdvancedProfileParams getCustomRelayAdvancedProfileParameters() {
        return customRelayAdvancedProfileParameters;
    }

    /**
     * Sets the value of the customRelayAdvancedProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayAdvancedProfileParams }
     *     
     */
    public void setCustomRelayAdvancedProfileParameters(RelayAdvancedProfileParams value) {
        this.customRelayAdvancedProfileParameters = value;
    }

    /**
     * Gets the value of the isPdclLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPdclLocked() {
        return isPdclLocked;
    }

    /**
     * Sets the value of the isPdclLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPdclLocked(JAXBElement<Boolean> value) {
        this.isPdclLocked = value;
    }

    /**
     * Gets the value of the ledMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getLedMode() {
        return ledMode;
    }

    /**
     * Sets the value of the ledMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setLedMode(JAXBElement<EnabledStates> value) {
        this.ledMode = value;
    }

    /**
     * Gets the value of the pdclGroupMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PdclGroupModeValuesWs }{@code >}
     *     
     */
    public JAXBElement<PdclGroupModeValuesWs> getPdclGroupMode() {
        return pdclGroupMode;
    }

    /**
     * Sets the value of the pdclGroupMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PdclGroupModeValuesWs }{@code >}
     *     
     */
    public void setPdclGroupMode(JAXBElement<PdclGroupModeValuesWs> value) {
        this.pdclGroupMode = value;
    }

    /**
     * Gets the value of the pdcl property.
     * 
     * @return
     *     possible object is
     *     {@link PdclList }
     *     
     */
    public PdclList getPdcl() {
        return pdcl;
    }

    /**
     * Sets the value of the pdcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PdclList }
     *     
     */
    public void setPdcl(PdclList value) {
        this.pdcl = value;
    }

    /**
     * Gets the value of the allowedBands property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedBandWs }
     *     
     */
    public AllowedBandWs getAllowedBands() {
        return allowedBands;
    }

    /**
     * Sets the value of the allowedBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedBandWs }
     *     
     */
    public void setAllowedBands(AllowedBandWs value) {
        this.allowedBands = value;
    }

    /**
     * Gets the value of the caMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CaModeValues }{@code >}
     *     
     */
    public JAXBElement<CaModeValues> getCaMode() {
        return caMode;
    }

    /**
     * Sets the value of the caMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CaModeValues }{@code >}
     *     
     */
    public void setCaMode(JAXBElement<CaModeValues> value) {
        this.caMode = value;
    }

    /**
     * Gets the value of the interBandCaModeDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InterBandCaModeDlValues }{@code >}
     *     
     */
    public JAXBElement<InterBandCaModeDlValues> getInterBandCaModeDl() {
        return interBandCaModeDl;
    }

    /**
     * Sets the value of the interBandCaModeDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InterBandCaModeDlValues }{@code >}
     *     
     */
    public void setInterBandCaModeDl(JAXBElement<InterBandCaModeDlValues> value) {
        this.interBandCaModeDl = value;
    }

    /**
     * Gets the value of the isSeGwInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsSeGwInterfaceEnabled() {
        return isSeGwInterfaceEnabled;
    }

    /**
     * Sets the value of the isSeGwInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsSeGwInterfaceEnabled(JAXBElement<EnabledStates> value) {
        this.isSeGwInterfaceEnabled = value;
    }

    /**
     * Gets the value of the seGwAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeGwAddress() {
        return seGwAddress;
    }

    /**
     * Sets the value of the seGwAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeGwAddress(String value) {
        this.seGwAddress = value;
    }

    /**
     * Gets the value of the relaySbaMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelaySbaMode() {
        return relaySbaMode;
    }

    /**
     * Sets the value of the relaySbaMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelaySbaMode(JAXBElement<String> value) {
        this.relaySbaMode = value;
    }

    /**
     * Gets the value of the backhaulWifi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulWifiMode }{@code >}
     *     
     */
    public JAXBElement<RelayBackhaulWifiMode> getBackhaulWifi() {
        return backhaulWifi;
    }

    /**
     * Sets the value of the backhaulWifi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulWifiMode }{@code >}
     *     
     */
    public void setBackhaulWifi(JAXBElement<RelayBackhaulWifiMode> value) {
        this.backhaulWifi = value;
    }

    /**
     * Gets the value of the backhaulEthernet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulEthernetMode }{@code >}
     *     
     */
    public JAXBElement<RelayBackhaulEthernetMode> getBackhaulEthernet() {
        return backhaulEthernet;
    }

    /**
     * Sets the value of the backhaulEthernet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulEthernetMode }{@code >}
     *     
     */
    public void setBackhaulEthernet(JAXBElement<RelayBackhaulEthernetMode> value) {
        this.backhaulEthernet = value;
    }

    /**
     * Gets the value of the backhaulUsb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulUsbMode }{@code >}
     *     
     */
    public JAXBElement<RelayBackhaulUsbMode> getBackhaulUsb() {
        return backhaulUsb;
    }

    /**
     * Sets the value of the backhaulUsb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulUsbMode }{@code >}
     *     
     */
    public void setBackhaulUsb(JAXBElement<RelayBackhaulUsbMode> value) {
        this.backhaulUsb = value;
    }

    /**
     * Gets the value of the backhaulLte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulLteMode }{@code >}
     *     
     */
    public JAXBElement<RelayBackhaulLteMode> getBackhaulLte() {
        return backhaulLte;
    }

    /**
     * Sets the value of the backhaulLte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBackhaulLteMode }{@code >}
     *     
     */
    public void setBackhaulLte(JAXBElement<RelayBackhaulLteMode> value) {
        this.backhaulLte = value;
    }

    /**
     * Gets the value of the qdclGroupMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QdclGroupModeValuesWs }{@code >}
     *     
     */
    public JAXBElement<QdclGroupModeValuesWs> getQdclGroupMode() {
        return qdclGroupMode;
    }

    /**
     * Sets the value of the qdclGroupMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QdclGroupModeValuesWs }{@code >}
     *     
     */
    public void setQdclGroupMode(JAXBElement<QdclGroupModeValuesWs> value) {
        this.qdclGroupMode = value;
    }

    /**
     * Gets the value of the qdcl property.
     * 
     * @return
     *     possible object is
     *     {@link QdclListContainer }
     *     
     */
    public QdclListContainer getQdcl() {
        return qdcl;
    }

    /**
     * Sets the value of the qdcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link QdclListContainer }
     *     
     */
    public void setQdcl(QdclListContainer value) {
        this.qdcl = value;
    }

}
