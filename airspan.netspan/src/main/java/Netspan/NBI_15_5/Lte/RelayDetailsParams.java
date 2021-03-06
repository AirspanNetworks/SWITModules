
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType name="RelayDetailsParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagementModeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SystemDefaultProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelayProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomRelayProfileParameters" type="{http://Airspan.Netspan.WebServices}RelayProfileParams" minOccurs="0"/>
 *         &lt;element name="RelayAdvancedProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomRelayAdvancedProfileParameters" type="{http://Airspan.Netspan.WebServices}RelayAdvancedProfileParams" minOccurs="0"/>
 *         &lt;element name="IsPdclLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LedMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Pdcl" type="{http://Airspan.Netspan.WebServices}PdclList" minOccurs="0"/>
 *         &lt;element name="AllowedBandsPriority" type="{http://Airspan.Netspan.WebServices}BandPriorityValuesWs" minOccurs="0"/>
 *         &lt;element name="AllowedBands" type="{http://Airspan.Netspan.WebServices}AllowedBandWs" minOccurs="0"/>
 *         &lt;element name="LcdDimmingMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "lcdDimmingMode"
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
    @XmlElement(name = "Pdcl")
    protected PdclList pdcl;
    @XmlElementRef(name = "AllowedBandsPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BandPriorityValuesWs> allowedBandsPriority;
    @XmlElement(name = "AllowedBands")
    protected AllowedBandWs allowedBands;
    @XmlElementRef(name = "LcdDimmingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> lcdDimmingMode;

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
     * Gets the value of the lcdDimmingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getLcdDimmingMode() {
        return lcdDimmingMode;
    }

    /**
     * Sets the value of the lcdDimmingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setLcdDimmingMode(JAXBElement<EnabledStates> value) {
        this.lcdDimmingMode = value;
    }

}
