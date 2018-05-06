
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlugAndPlayWarmRebootMaskWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlugAndPlayWarmRebootMaskWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuiltInSelfTestIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuiltInSelfTest" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="IpAutoConfigDhcpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IpAutoConfigDhcp" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ValidateSiteIdentificationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ValidateSiteIdentification" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="InventoryUpdateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InventoryUpdate" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="SoftwareDownloadIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoftwareDownload" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="ConfigurationProvisioningIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfigurationProvisioning" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="S1EstablishmentIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S1Establishment" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="RestartAirsonAlgorithmsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestartAirsonAlgorithms" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlugAndPlayWarmRebootMaskWs", propOrder = {
    "builtInSelfTestIsDefault",
    "builtInSelfTest",
    "ipAutoConfigDhcpIsDefault",
    "ipAutoConfigDhcp",
    "validateSiteIdentificationIsDefault",
    "validateSiteIdentification",
    "inventoryUpdateIsDefault",
    "inventoryUpdate",
    "softwareDownloadIsDefault",
    "softwareDownload",
    "configurationProvisioningIsDefault",
    "configurationProvisioning",
    "s1EstablishmentIsDefault",
    "s1Establishment",
    "restartAirsonAlgorithmsIsDefault",
    "restartAirsonAlgorithms"
})
public class PlugAndPlayWarmRebootMaskWs {

    @XmlElementRef(name = "BuiltInSelfTestIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> builtInSelfTestIsDefault;
    @XmlElementRef(name = "BuiltInSelfTest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> builtInSelfTest;
    @XmlElementRef(name = "IpAutoConfigDhcpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ipAutoConfigDhcpIsDefault;
    @XmlElementRef(name = "IpAutoConfigDhcp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> ipAutoConfigDhcp;
    @XmlElementRef(name = "ValidateSiteIdentificationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> validateSiteIdentificationIsDefault;
    @XmlElementRef(name = "ValidateSiteIdentification", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> validateSiteIdentification;
    @XmlElementRef(name = "InventoryUpdateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> inventoryUpdateIsDefault;
    @XmlElementRef(name = "InventoryUpdate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> inventoryUpdate;
    @XmlElementRef(name = "SoftwareDownloadIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> softwareDownloadIsDefault;
    @XmlElementRef(name = "SoftwareDownload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> softwareDownload;
    @XmlElementRef(name = "ConfigurationProvisioningIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> configurationProvisioningIsDefault;
    @XmlElementRef(name = "ConfigurationProvisioning", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> configurationProvisioning;
    @XmlElementRef(name = "S1EstablishmentIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1EstablishmentIsDefault;
    @XmlElementRef(name = "S1Establishment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> s1Establishment;
    @XmlElementRef(name = "RestartAirsonAlgorithmsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> restartAirsonAlgorithmsIsDefault;
    @XmlElementRef(name = "RestartAirsonAlgorithms", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> restartAirsonAlgorithms;

    /**
     * Gets the value of the builtInSelfTestIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBuiltInSelfTestIsDefault() {
        return builtInSelfTestIsDefault;
    }

    /**
     * Sets the value of the builtInSelfTestIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBuiltInSelfTestIsDefault(JAXBElement<Boolean> value) {
        this.builtInSelfTestIsDefault = value;
    }

    /**
     * Gets the value of the builtInSelfTest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getBuiltInSelfTest() {
        return builtInSelfTest;
    }

    /**
     * Sets the value of the builtInSelfTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setBuiltInSelfTest(JAXBElement<EnabledDisabledValues> value) {
        this.builtInSelfTest = value;
    }

    /**
     * Gets the value of the ipAutoConfigDhcpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIpAutoConfigDhcpIsDefault() {
        return ipAutoConfigDhcpIsDefault;
    }

    /**
     * Sets the value of the ipAutoConfigDhcpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIpAutoConfigDhcpIsDefault(JAXBElement<Boolean> value) {
        this.ipAutoConfigDhcpIsDefault = value;
    }

    /**
     * Gets the value of the ipAutoConfigDhcp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getIpAutoConfigDhcp() {
        return ipAutoConfigDhcp;
    }

    /**
     * Sets the value of the ipAutoConfigDhcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setIpAutoConfigDhcp(JAXBElement<EnabledDisabledValues> value) {
        this.ipAutoConfigDhcp = value;
    }

    /**
     * Gets the value of the validateSiteIdentificationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getValidateSiteIdentificationIsDefault() {
        return validateSiteIdentificationIsDefault;
    }

    /**
     * Sets the value of the validateSiteIdentificationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setValidateSiteIdentificationIsDefault(JAXBElement<Boolean> value) {
        this.validateSiteIdentificationIsDefault = value;
    }

    /**
     * Gets the value of the validateSiteIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getValidateSiteIdentification() {
        return validateSiteIdentification;
    }

    /**
     * Sets the value of the validateSiteIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setValidateSiteIdentification(JAXBElement<EnabledDisabledValues> value) {
        this.validateSiteIdentification = value;
    }

    /**
     * Gets the value of the inventoryUpdateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInventoryUpdateIsDefault() {
        return inventoryUpdateIsDefault;
    }

    /**
     * Sets the value of the inventoryUpdateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInventoryUpdateIsDefault(JAXBElement<Boolean> value) {
        this.inventoryUpdateIsDefault = value;
    }

    /**
     * Gets the value of the inventoryUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getInventoryUpdate() {
        return inventoryUpdate;
    }

    /**
     * Sets the value of the inventoryUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setInventoryUpdate(JAXBElement<EnabledDisabledValues> value) {
        this.inventoryUpdate = value;
    }

    /**
     * Gets the value of the softwareDownloadIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSoftwareDownloadIsDefault() {
        return softwareDownloadIsDefault;
    }

    /**
     * Sets the value of the softwareDownloadIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSoftwareDownloadIsDefault(JAXBElement<Boolean> value) {
        this.softwareDownloadIsDefault = value;
    }

    /**
     * Gets the value of the softwareDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getSoftwareDownload() {
        return softwareDownload;
    }

    /**
     * Sets the value of the softwareDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setSoftwareDownload(JAXBElement<EnabledDisabledValues> value) {
        this.softwareDownload = value;
    }

    /**
     * Gets the value of the configurationProvisioningIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getConfigurationProvisioningIsDefault() {
        return configurationProvisioningIsDefault;
    }

    /**
     * Sets the value of the configurationProvisioningIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setConfigurationProvisioningIsDefault(JAXBElement<Boolean> value) {
        this.configurationProvisioningIsDefault = value;
    }

    /**
     * Gets the value of the configurationProvisioning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getConfigurationProvisioning() {
        return configurationProvisioning;
    }

    /**
     * Sets the value of the configurationProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setConfigurationProvisioning(JAXBElement<EnabledDisabledValues> value) {
        this.configurationProvisioning = value;
    }

    /**
     * Gets the value of the s1EstablishmentIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1EstablishmentIsDefault() {
        return s1EstablishmentIsDefault;
    }

    /**
     * Sets the value of the s1EstablishmentIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1EstablishmentIsDefault(JAXBElement<Boolean> value) {
        this.s1EstablishmentIsDefault = value;
    }

    /**
     * Gets the value of the s1Establishment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getS1Establishment() {
        return s1Establishment;
    }

    /**
     * Sets the value of the s1Establishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setS1Establishment(JAXBElement<EnabledDisabledValues> value) {
        this.s1Establishment = value;
    }

    /**
     * Gets the value of the restartAirsonAlgorithmsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRestartAirsonAlgorithmsIsDefault() {
        return restartAirsonAlgorithmsIsDefault;
    }

    /**
     * Sets the value of the restartAirsonAlgorithmsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRestartAirsonAlgorithmsIsDefault(JAXBElement<Boolean> value) {
        this.restartAirsonAlgorithmsIsDefault = value;
    }

    /**
     * Gets the value of the restartAirsonAlgorithms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getRestartAirsonAlgorithms() {
        return restartAirsonAlgorithms;
    }

    /**
     * Sets the value of the restartAirsonAlgorithms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setRestartAirsonAlgorithms(JAXBElement<EnabledDisabledValues> value) {
        this.restartAirsonAlgorithms = value;
    }

}
