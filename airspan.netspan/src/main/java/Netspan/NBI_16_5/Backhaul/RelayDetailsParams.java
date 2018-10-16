
package Netspan.NBI_16_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="LedMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Pdcl" type="{http://Airspan.Netspan.WebServices}PdclList" minOccurs="0"/&gt;
 *         &lt;element name="AllowedBandsPriority" type="{http://Airspan.Netspan.WebServices}BandPriorityValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="AllowedBands" type="{http://Airspan.Netspan.WebServices}AllowedBandWs" minOccurs="0"/&gt;
 *         &lt;element name="CaMode" type="{http://Airspan.Netspan.WebServices}CaModeValues" minOccurs="0"/&gt;
 *         &lt;element name="IsSeGwInterfaceEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SeGwAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelaySbaMode" type="{http://Airspan.Netspan.WebServices}RelaySbaValues" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifi" type="{http://Airspan.Netspan.WebServices}RelayBackhaulWifiMode" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulEthernet" type="{http://Airspan.Netspan.WebServices}RelayBackhaulEthernetMode" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulUsb" type="{http://Airspan.Netspan.WebServices}RelayBackhaulUsbMode" minOccurs="0"/&gt;
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
    "pdcl",
    "allowedBandsPriority",
    "allowedBands",
    "caMode",
    "isSeGwInterfaceEnabled",
    "seGwAddress",
    "relaySbaMode",
    "backhaulWifi",
    "backhaulEthernet",
    "backhaulUsb"
})
@XmlSeeAlso({
    RelayDetailsPnp.class
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
    protected JAXBElement<EnabledDisabledStates> ledMode;
    @XmlElement(name = "Pdcl")
    protected PdclList pdcl;
    @XmlElementRef(name = "AllowedBandsPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BandPriorityValuesWs> allowedBandsPriority;
    @XmlElement(name = "AllowedBands")
    protected AllowedBandWs allowedBands;
    @XmlElementRef(name = "CaMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CaModeValues> caMode;
    @XmlElementRef(name = "IsSeGwInterfaceEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isSeGwInterfaceEnabled;
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLedMode() {
        return ledMode;
    }

    /**
     * Sets the value of the ledMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLedMode(JAXBElement<EnabledDisabledStates> value) {
        this.ledMode = value;
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
     * Gets the value of the allowedBandsPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BandPriorityValuesWs }{@code >}
     *     
     */
    public JAXBElement<BandPriorityValuesWs> getAllowedBandsPriority() {
        return allowedBandsPriority;
    }

    /**
     * Sets the value of the allowedBandsPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BandPriorityValuesWs }{@code >}
     *     
     */
    public void setAllowedBandsPriority(JAXBElement<BandPriorityValuesWs> value) {
        this.allowedBandsPriority = value;
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
     * Gets the value of the isSeGwInterfaceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsSeGwInterfaceEnabled() {
        return isSeGwInterfaceEnabled;
    }

    /**
     * Sets the value of the isSeGwInterfaceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsSeGwInterfaceEnabled(JAXBElement<EnabledDisabledStates> value) {
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

}
