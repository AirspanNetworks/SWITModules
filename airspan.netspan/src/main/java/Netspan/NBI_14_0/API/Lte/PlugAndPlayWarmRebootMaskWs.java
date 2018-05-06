
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="BuiltInSelfTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IpAutoConfigDhcp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrimaryIpsecTunnelEstablishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ValidateSiteIdentification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InventoryUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SoftwareDownload" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfigurationProvisioning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="S1Establishment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RestartAirsonAlgorithms" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "builtInSelfTest",
    "ipAutoConfigDhcp",
    "primaryIpsecTunnelEstablishment",
    "validateSiteIdentification",
    "inventoryUpdate",
    "softwareDownload",
    "configurationProvisioning",
    "s1Establishment",
    "restartAirsonAlgorithms"
})
public class PlugAndPlayWarmRebootMaskWs {

    @XmlElement(name = "BuiltInSelfTest")
    protected boolean builtInSelfTest;
    @XmlElement(name = "IpAutoConfigDhcp")
    protected boolean ipAutoConfigDhcp;
    @XmlElement(name = "PrimaryIpsecTunnelEstablishment")
    protected boolean primaryIpsecTunnelEstablishment;
    @XmlElement(name = "ValidateSiteIdentification")
    protected boolean validateSiteIdentification;
    @XmlElement(name = "InventoryUpdate")
    protected boolean inventoryUpdate;
    @XmlElement(name = "SoftwareDownload")
    protected boolean softwareDownload;
    @XmlElement(name = "ConfigurationProvisioning")
    protected boolean configurationProvisioning;
    @XmlElement(name = "S1Establishment")
    protected boolean s1Establishment;
    @XmlElement(name = "RestartAirsonAlgorithms")
    protected boolean restartAirsonAlgorithms;

    /**
     * Gets the value of the builtInSelfTest property.
     * 
     */
    public boolean isBuiltInSelfTest() {
        return builtInSelfTest;
    }

    /**
     * Sets the value of the builtInSelfTest property.
     * 
     */
    public void setBuiltInSelfTest(boolean value) {
        this.builtInSelfTest = value;
    }

    /**
     * Gets the value of the ipAutoConfigDhcp property.
     * 
     */
    public boolean isIpAutoConfigDhcp() {
        return ipAutoConfigDhcp;
    }

    /**
     * Sets the value of the ipAutoConfigDhcp property.
     * 
     */
    public void setIpAutoConfigDhcp(boolean value) {
        this.ipAutoConfigDhcp = value;
    }

    /**
     * Gets the value of the primaryIpsecTunnelEstablishment property.
     * 
     */
    public boolean isPrimaryIpsecTunnelEstablishment() {
        return primaryIpsecTunnelEstablishment;
    }

    /**
     * Sets the value of the primaryIpsecTunnelEstablishment property.
     * 
     */
    public void setPrimaryIpsecTunnelEstablishment(boolean value) {
        this.primaryIpsecTunnelEstablishment = value;
    }

    /**
     * Gets the value of the validateSiteIdentification property.
     * 
     */
    public boolean isValidateSiteIdentification() {
        return validateSiteIdentification;
    }

    /**
     * Sets the value of the validateSiteIdentification property.
     * 
     */
    public void setValidateSiteIdentification(boolean value) {
        this.validateSiteIdentification = value;
    }

    /**
     * Gets the value of the inventoryUpdate property.
     * 
     */
    public boolean isInventoryUpdate() {
        return inventoryUpdate;
    }

    /**
     * Sets the value of the inventoryUpdate property.
     * 
     */
    public void setInventoryUpdate(boolean value) {
        this.inventoryUpdate = value;
    }

    /**
     * Gets the value of the softwareDownload property.
     * 
     */
    public boolean isSoftwareDownload() {
        return softwareDownload;
    }

    /**
     * Sets the value of the softwareDownload property.
     * 
     */
    public void setSoftwareDownload(boolean value) {
        this.softwareDownload = value;
    }

    /**
     * Gets the value of the configurationProvisioning property.
     * 
     */
    public boolean isConfigurationProvisioning() {
        return configurationProvisioning;
    }

    /**
     * Sets the value of the configurationProvisioning property.
     * 
     */
    public void setConfigurationProvisioning(boolean value) {
        this.configurationProvisioning = value;
    }

    /**
     * Gets the value of the s1Establishment property.
     * 
     */
    public boolean isS1Establishment() {
        return s1Establishment;
    }

    /**
     * Sets the value of the s1Establishment property.
     * 
     */
    public void setS1Establishment(boolean value) {
        this.s1Establishment = value;
    }

    /**
     * Gets the value of the restartAirsonAlgorithms property.
     * 
     */
    public boolean isRestartAirsonAlgorithms() {
        return restartAirsonAlgorithms;
    }

    /**
     * Sets the value of the restartAirsonAlgorithms property.
     * 
     */
    public void setRestartAirsonAlgorithms(boolean value) {
        this.restartAirsonAlgorithms = value;
    }

}
