
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlugAndPlayWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlugAndPlayWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PnPConfigurationTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SelfTestRetryWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxSelfTestRetry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SelfTestFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DhcpWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxDhcpRetry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DhcpFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GpsLockWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SiteIdentificationWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxSiteIdentificationRetry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SiteIdentificationFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersistencyMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxPersistenceRadius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxPersistenceTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InventoryCompleteWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AutoSoftwareWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DefaultConfigurationWaitTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlugAndPlayWs", propOrder = {
    "pnPConfigurationTime",
    "selfTestRetryWaitTime",
    "maxSelfTestRetry",
    "selfTestFailWaitTime",
    "dhcpWaitTime",
    "maxDhcpRetry",
    "dhcpFailWaitTime",
    "gpsLockWaitTime",
    "siteIdentificationWaitTime",
    "maxSiteIdentificationRetry",
    "siteIdentificationFailWaitTime",
    "persistencyMode",
    "maxPersistenceRadius",
    "maxPersistenceTime",
    "inventoryCompleteWaitTime",
    "autoSoftwareWaitTime",
    "defaultConfigurationWaitTime"
})
public class PlugAndPlayWs {

    @XmlElement(name = "PnPConfigurationTime")
    protected int pnPConfigurationTime;
    @XmlElement(name = "SelfTestRetryWaitTime")
    protected int selfTestRetryWaitTime;
    @XmlElement(name = "MaxSelfTestRetry")
    protected int maxSelfTestRetry;
    @XmlElement(name = "SelfTestFailWaitTime")
    protected int selfTestFailWaitTime;
    @XmlElement(name = "DhcpWaitTime")
    protected int dhcpWaitTime;
    @XmlElement(name = "MaxDhcpRetry")
    protected int maxDhcpRetry;
    @XmlElement(name = "DhcpFailWaitTime")
    protected int dhcpFailWaitTime;
    @XmlElement(name = "GpsLockWaitTime")
    protected int gpsLockWaitTime;
    @XmlElement(name = "SiteIdentificationWaitTime")
    protected int siteIdentificationWaitTime;
    @XmlElement(name = "MaxSiteIdentificationRetry")
    protected int maxSiteIdentificationRetry;
    @XmlElement(name = "SiteIdentificationFailWaitTime")
    protected int siteIdentificationFailWaitTime;
    @XmlElement(name = "PersistencyMode")
    protected int persistencyMode;
    @XmlElement(name = "MaxPersistenceRadius")
    protected int maxPersistenceRadius;
    @XmlElement(name = "MaxPersistenceTime")
    protected int maxPersistenceTime;
    @XmlElement(name = "InventoryCompleteWaitTime")
    protected int inventoryCompleteWaitTime;
    @XmlElement(name = "AutoSoftwareWaitTime")
    protected int autoSoftwareWaitTime;
    @XmlElement(name = "DefaultConfigurationWaitTime")
    protected int defaultConfigurationWaitTime;

    /**
     * Gets the value of the pnPConfigurationTime property.
     * 
     */
    public int getPnPConfigurationTime() {
        return pnPConfigurationTime;
    }

    /**
     * Sets the value of the pnPConfigurationTime property.
     * 
     */
    public void setPnPConfigurationTime(int value) {
        this.pnPConfigurationTime = value;
    }

    /**
     * Gets the value of the selfTestRetryWaitTime property.
     * 
     */
    public int getSelfTestRetryWaitTime() {
        return selfTestRetryWaitTime;
    }

    /**
     * Sets the value of the selfTestRetryWaitTime property.
     * 
     */
    public void setSelfTestRetryWaitTime(int value) {
        this.selfTestRetryWaitTime = value;
    }

    /**
     * Gets the value of the maxSelfTestRetry property.
     * 
     */
    public int getMaxSelfTestRetry() {
        return maxSelfTestRetry;
    }

    /**
     * Sets the value of the maxSelfTestRetry property.
     * 
     */
    public void setMaxSelfTestRetry(int value) {
        this.maxSelfTestRetry = value;
    }

    /**
     * Gets the value of the selfTestFailWaitTime property.
     * 
     */
    public int getSelfTestFailWaitTime() {
        return selfTestFailWaitTime;
    }

    /**
     * Sets the value of the selfTestFailWaitTime property.
     * 
     */
    public void setSelfTestFailWaitTime(int value) {
        this.selfTestFailWaitTime = value;
    }

    /**
     * Gets the value of the dhcpWaitTime property.
     * 
     */
    public int getDhcpWaitTime() {
        return dhcpWaitTime;
    }

    /**
     * Sets the value of the dhcpWaitTime property.
     * 
     */
    public void setDhcpWaitTime(int value) {
        this.dhcpWaitTime = value;
    }

    /**
     * Gets the value of the maxDhcpRetry property.
     * 
     */
    public int getMaxDhcpRetry() {
        return maxDhcpRetry;
    }

    /**
     * Sets the value of the maxDhcpRetry property.
     * 
     */
    public void setMaxDhcpRetry(int value) {
        this.maxDhcpRetry = value;
    }

    /**
     * Gets the value of the dhcpFailWaitTime property.
     * 
     */
    public int getDhcpFailWaitTime() {
        return dhcpFailWaitTime;
    }

    /**
     * Sets the value of the dhcpFailWaitTime property.
     * 
     */
    public void setDhcpFailWaitTime(int value) {
        this.dhcpFailWaitTime = value;
    }

    /**
     * Gets the value of the gpsLockWaitTime property.
     * 
     */
    public int getGpsLockWaitTime() {
        return gpsLockWaitTime;
    }

    /**
     * Sets the value of the gpsLockWaitTime property.
     * 
     */
    public void setGpsLockWaitTime(int value) {
        this.gpsLockWaitTime = value;
    }

    /**
     * Gets the value of the siteIdentificationWaitTime property.
     * 
     */
    public int getSiteIdentificationWaitTime() {
        return siteIdentificationWaitTime;
    }

    /**
     * Sets the value of the siteIdentificationWaitTime property.
     * 
     */
    public void setSiteIdentificationWaitTime(int value) {
        this.siteIdentificationWaitTime = value;
    }

    /**
     * Gets the value of the maxSiteIdentificationRetry property.
     * 
     */
    public int getMaxSiteIdentificationRetry() {
        return maxSiteIdentificationRetry;
    }

    /**
     * Sets the value of the maxSiteIdentificationRetry property.
     * 
     */
    public void setMaxSiteIdentificationRetry(int value) {
        this.maxSiteIdentificationRetry = value;
    }

    /**
     * Gets the value of the siteIdentificationFailWaitTime property.
     * 
     */
    public int getSiteIdentificationFailWaitTime() {
        return siteIdentificationFailWaitTime;
    }

    /**
     * Sets the value of the siteIdentificationFailWaitTime property.
     * 
     */
    public void setSiteIdentificationFailWaitTime(int value) {
        this.siteIdentificationFailWaitTime = value;
    }

    /**
     * Gets the value of the persistencyMode property.
     * 
     */
    public int getPersistencyMode() {
        return persistencyMode;
    }

    /**
     * Sets the value of the persistencyMode property.
     * 
     */
    public void setPersistencyMode(int value) {
        this.persistencyMode = value;
    }

    /**
     * Gets the value of the maxPersistenceRadius property.
     * 
     */
    public int getMaxPersistenceRadius() {
        return maxPersistenceRadius;
    }

    /**
     * Sets the value of the maxPersistenceRadius property.
     * 
     */
    public void setMaxPersistenceRadius(int value) {
        this.maxPersistenceRadius = value;
    }

    /**
     * Gets the value of the maxPersistenceTime property.
     * 
     */
    public int getMaxPersistenceTime() {
        return maxPersistenceTime;
    }

    /**
     * Sets the value of the maxPersistenceTime property.
     * 
     */
    public void setMaxPersistenceTime(int value) {
        this.maxPersistenceTime = value;
    }

    /**
     * Gets the value of the inventoryCompleteWaitTime property.
     * 
     */
    public int getInventoryCompleteWaitTime() {
        return inventoryCompleteWaitTime;
    }

    /**
     * Sets the value of the inventoryCompleteWaitTime property.
     * 
     */
    public void setInventoryCompleteWaitTime(int value) {
        this.inventoryCompleteWaitTime = value;
    }

    /**
     * Gets the value of the autoSoftwareWaitTime property.
     * 
     */
    public int getAutoSoftwareWaitTime() {
        return autoSoftwareWaitTime;
    }

    /**
     * Sets the value of the autoSoftwareWaitTime property.
     * 
     */
    public void setAutoSoftwareWaitTime(int value) {
        this.autoSoftwareWaitTime = value;
    }

    /**
     * Gets the value of the defaultConfigurationWaitTime property.
     * 
     */
    public int getDefaultConfigurationWaitTime() {
        return defaultConfigurationWaitTime;
    }

    /**
     * Sets the value of the defaultConfigurationWaitTime property.
     * 
     */
    public void setDefaultConfigurationWaitTime(int value) {
        this.defaultConfigurationWaitTime = value;
    }

}
