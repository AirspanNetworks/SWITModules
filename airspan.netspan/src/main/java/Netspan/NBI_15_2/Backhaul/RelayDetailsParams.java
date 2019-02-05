
package Netspan.NBI_15_2.Backhaul;

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
 *         &lt;element name="IsPdclLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LedMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="Pdcl" type="{http://Airspan.Netspan.WebServices}PdclList" minOccurs="0"/&gt;
 *         &lt;element name="AllowedBandsPriority" type="{http://Airspan.Netspan.WebServices}BandPriorityValuesWs" minOccurs="0"/&gt;
 *         &lt;element name="AllowedBands" type="{http://Airspan.Netspan.WebServices}AllowedBandWs" minOccurs="0"/&gt;
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
    "isPdclLocked",
    "ledMode",
    "pdcl",
    "allowedBandsPriority",
    "allowedBands"
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

}
