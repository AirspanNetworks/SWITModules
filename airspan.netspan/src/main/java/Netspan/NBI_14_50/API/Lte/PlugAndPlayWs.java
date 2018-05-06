
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


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
 *         &lt;element name="PnPConfigurationTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PnPConfigurationTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelfTestRetryWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelfTestRetryWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSelfTestRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxSelfTestRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelfTestFailWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelfTestFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DhcpWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DhcpWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxDhcpRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxDhcpRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DhcpFailWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DhcpFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GpsLockWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GpsLockWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiteIdentificationWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SiteIdentificationWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSiteIdentificationRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxSiteIdentificationRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiteIdentificationFailWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SiteIdentificationFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PersistencyModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersistencyMode" type="{http://Airspan.Netspan.WebServices}PnpPeristencyMode" minOccurs="0"/>
 *         &lt;element name="MaxPersistenceRadiusIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxPersistenceRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxPersistenceTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxPersistenceTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InventoryCompleteWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InventoryCompleteWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AutoSoftwareWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoSoftwareWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DefaultConfigurationWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultConfigurationWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarmResetModeAdminIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarmResetModeAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="WarmResetAutoInventoryFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarmResetAutoInventoryFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarmResetAutoSwDownloadFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarmResetAutoSwDownloadFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WarmResetConfigurationFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarmResetConfigurationFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "pnPConfigurationTimeIsDefault",
    "pnPConfigurationTime",
    "selfTestRetryWaitTimeIsDefault",
    "selfTestRetryWaitTime",
    "maxSelfTestRetryIsDefault",
    "maxSelfTestRetry",
    "selfTestFailWaitTimeIsDefault",
    "selfTestFailWaitTime",
    "dhcpWaitTimeIsDefault",
    "dhcpWaitTime",
    "maxDhcpRetryIsDefault",
    "maxDhcpRetry",
    "dhcpFailWaitTimeIsDefault",
    "dhcpFailWaitTime",
    "gpsLockWaitTimeIsDefault",
    "gpsLockWaitTime",
    "siteIdentificationWaitTimeIsDefault",
    "siteIdentificationWaitTime",
    "maxSiteIdentificationRetryIsDefault",
    "maxSiteIdentificationRetry",
    "siteIdentificationFailWaitTimeIsDefault",
    "siteIdentificationFailWaitTime",
    "persistencyModeIsDefault",
    "persistencyMode",
    "maxPersistenceRadiusIsDefault",
    "maxPersistenceRadius",
    "maxPersistenceTimeIsDefault",
    "maxPersistenceTime",
    "inventoryCompleteWaitTimeIsDefault",
    "inventoryCompleteWaitTime",
    "autoSoftwareWaitTimeIsDefault",
    "autoSoftwareWaitTime",
    "defaultConfigurationWaitTimeIsDefault",
    "defaultConfigurationWaitTime",
    "warmResetModeAdminIsDefault",
    "warmResetModeAdmin",
    "warmResetAutoInventoryFailTimerIsDefault",
    "warmResetAutoInventoryFailTimer",
    "warmResetAutoSwDownloadFailTimerIsDefault",
    "warmResetAutoSwDownloadFailTimer",
    "warmResetConfigurationFailTimerIsDefault",
    "warmResetConfigurationFailTimer"
})
public class PlugAndPlayWs {

    @XmlElementRef(name = "PnPConfigurationTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pnPConfigurationTimeIsDefault;
    @XmlElementRef(name = "PnPConfigurationTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnPConfigurationTime;
    @XmlElementRef(name = "SelfTestRetryWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> selfTestRetryWaitTimeIsDefault;
    @XmlElementRef(name = "SelfTestRetryWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selfTestRetryWaitTime;
    @XmlElementRef(name = "MaxSelfTestRetryIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxSelfTestRetryIsDefault;
    @XmlElementRef(name = "MaxSelfTestRetry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSelfTestRetry;
    @XmlElementRef(name = "SelfTestFailWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> selfTestFailWaitTimeIsDefault;
    @XmlElementRef(name = "SelfTestFailWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selfTestFailWaitTime;
    @XmlElementRef(name = "DhcpWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dhcpWaitTimeIsDefault;
    @XmlElementRef(name = "DhcpWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dhcpWaitTime;
    @XmlElementRef(name = "MaxDhcpRetryIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxDhcpRetryIsDefault;
    @XmlElementRef(name = "MaxDhcpRetry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxDhcpRetry;
    @XmlElementRef(name = "DhcpFailWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dhcpFailWaitTimeIsDefault;
    @XmlElementRef(name = "DhcpFailWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dhcpFailWaitTime;
    @XmlElementRef(name = "GpsLockWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsLockWaitTimeIsDefault;
    @XmlElementRef(name = "GpsLockWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsLockWaitTime;
    @XmlElementRef(name = "SiteIdentificationWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siteIdentificationWaitTimeIsDefault;
    @XmlElementRef(name = "SiteIdentificationWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> siteIdentificationWaitTime;
    @XmlElementRef(name = "MaxSiteIdentificationRetryIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxSiteIdentificationRetryIsDefault;
    @XmlElementRef(name = "MaxSiteIdentificationRetry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSiteIdentificationRetry;
    @XmlElementRef(name = "SiteIdentificationFailWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siteIdentificationFailWaitTimeIsDefault;
    @XmlElementRef(name = "SiteIdentificationFailWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> siteIdentificationFailWaitTime;
    @XmlElementRef(name = "PersistencyModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> persistencyModeIsDefault;
    @XmlElementRef(name = "PersistencyMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PnpPeristencyMode> persistencyMode;
    @XmlElementRef(name = "MaxPersistenceRadiusIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxPersistenceRadiusIsDefault;
    @XmlElementRef(name = "MaxPersistenceRadius", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxPersistenceRadius;
    @XmlElementRef(name = "MaxPersistenceTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxPersistenceTimeIsDefault;
    @XmlElementRef(name = "MaxPersistenceTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxPersistenceTime;
    @XmlElementRef(name = "InventoryCompleteWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> inventoryCompleteWaitTimeIsDefault;
    @XmlElementRef(name = "InventoryCompleteWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> inventoryCompleteWaitTime;
    @XmlElementRef(name = "AutoSoftwareWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoSoftwareWaitTimeIsDefault;
    @XmlElementRef(name = "AutoSoftwareWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoSoftwareWaitTime;
    @XmlElementRef(name = "DefaultConfigurationWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> defaultConfigurationWaitTimeIsDefault;
    @XmlElementRef(name = "DefaultConfigurationWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> defaultConfigurationWaitTime;
    @XmlElementRef(name = "WarmResetModeAdminIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetModeAdminIsDefault;
    @XmlElementRef(name = "WarmResetModeAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> warmResetModeAdmin;
    @XmlElementRef(name = "WarmResetAutoInventoryFailTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetAutoInventoryFailTimerIsDefault;
    @XmlElementRef(name = "WarmResetAutoInventoryFailTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warmResetAutoInventoryFailTimer;
    @XmlElementRef(name = "WarmResetAutoSwDownloadFailTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetAutoSwDownloadFailTimerIsDefault;
    @XmlElementRef(name = "WarmResetAutoSwDownloadFailTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warmResetAutoSwDownloadFailTimer;
    @XmlElementRef(name = "WarmResetConfigurationFailTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetConfigurationFailTimerIsDefault;
    @XmlElementRef(name = "WarmResetConfigurationFailTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warmResetConfigurationFailTimer;

    /**
     * Gets the value of the pnPConfigurationTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPnPConfigurationTimeIsDefault() {
        return pnPConfigurationTimeIsDefault;
    }

    /**
     * Sets the value of the pnPConfigurationTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPnPConfigurationTimeIsDefault(JAXBElement<Boolean> value) {
        this.pnPConfigurationTimeIsDefault = value;
    }

    /**
     * Gets the value of the pnPConfigurationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPnPConfigurationTime() {
        return pnPConfigurationTime;
    }

    /**
     * Sets the value of the pnPConfigurationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPnPConfigurationTime(JAXBElement<Integer> value) {
        this.pnPConfigurationTime = value;
    }

    /**
     * Gets the value of the selfTestRetryWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSelfTestRetryWaitTimeIsDefault() {
        return selfTestRetryWaitTimeIsDefault;
    }

    /**
     * Sets the value of the selfTestRetryWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSelfTestRetryWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.selfTestRetryWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the selfTestRetryWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelfTestRetryWaitTime() {
        return selfTestRetryWaitTime;
    }

    /**
     * Sets the value of the selfTestRetryWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelfTestRetryWaitTime(JAXBElement<Integer> value) {
        this.selfTestRetryWaitTime = value;
    }

    /**
     * Gets the value of the maxSelfTestRetryIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxSelfTestRetryIsDefault() {
        return maxSelfTestRetryIsDefault;
    }

    /**
     * Sets the value of the maxSelfTestRetryIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxSelfTestRetryIsDefault(JAXBElement<Boolean> value) {
        this.maxSelfTestRetryIsDefault = value;
    }

    /**
     * Gets the value of the maxSelfTestRetry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxSelfTestRetry() {
        return maxSelfTestRetry;
    }

    /**
     * Sets the value of the maxSelfTestRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxSelfTestRetry(JAXBElement<Integer> value) {
        this.maxSelfTestRetry = value;
    }

    /**
     * Gets the value of the selfTestFailWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSelfTestFailWaitTimeIsDefault() {
        return selfTestFailWaitTimeIsDefault;
    }

    /**
     * Sets the value of the selfTestFailWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSelfTestFailWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.selfTestFailWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the selfTestFailWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelfTestFailWaitTime() {
        return selfTestFailWaitTime;
    }

    /**
     * Sets the value of the selfTestFailWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelfTestFailWaitTime(JAXBElement<Integer> value) {
        this.selfTestFailWaitTime = value;
    }

    /**
     * Gets the value of the dhcpWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDhcpWaitTimeIsDefault() {
        return dhcpWaitTimeIsDefault;
    }

    /**
     * Sets the value of the dhcpWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDhcpWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.dhcpWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the dhcpWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDhcpWaitTime() {
        return dhcpWaitTime;
    }

    /**
     * Sets the value of the dhcpWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDhcpWaitTime(JAXBElement<Integer> value) {
        this.dhcpWaitTime = value;
    }

    /**
     * Gets the value of the maxDhcpRetryIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxDhcpRetryIsDefault() {
        return maxDhcpRetryIsDefault;
    }

    /**
     * Sets the value of the maxDhcpRetryIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxDhcpRetryIsDefault(JAXBElement<Boolean> value) {
        this.maxDhcpRetryIsDefault = value;
    }

    /**
     * Gets the value of the maxDhcpRetry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxDhcpRetry() {
        return maxDhcpRetry;
    }

    /**
     * Sets the value of the maxDhcpRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxDhcpRetry(JAXBElement<Integer> value) {
        this.maxDhcpRetry = value;
    }

    /**
     * Gets the value of the dhcpFailWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDhcpFailWaitTimeIsDefault() {
        return dhcpFailWaitTimeIsDefault;
    }

    /**
     * Sets the value of the dhcpFailWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDhcpFailWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.dhcpFailWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the dhcpFailWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDhcpFailWaitTime() {
        return dhcpFailWaitTime;
    }

    /**
     * Sets the value of the dhcpFailWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDhcpFailWaitTime(JAXBElement<Integer> value) {
        this.dhcpFailWaitTime = value;
    }

    /**
     * Gets the value of the gpsLockWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsLockWaitTimeIsDefault() {
        return gpsLockWaitTimeIsDefault;
    }

    /**
     * Sets the value of the gpsLockWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsLockWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.gpsLockWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the gpsLockWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsLockWaitTime() {
        return gpsLockWaitTime;
    }

    /**
     * Sets the value of the gpsLockWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsLockWaitTime(JAXBElement<Integer> value) {
        this.gpsLockWaitTime = value;
    }

    /**
     * Gets the value of the siteIdentificationWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiteIdentificationWaitTimeIsDefault() {
        return siteIdentificationWaitTimeIsDefault;
    }

    /**
     * Sets the value of the siteIdentificationWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiteIdentificationWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.siteIdentificationWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the siteIdentificationWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSiteIdentificationWaitTime() {
        return siteIdentificationWaitTime;
    }

    /**
     * Sets the value of the siteIdentificationWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSiteIdentificationWaitTime(JAXBElement<Integer> value) {
        this.siteIdentificationWaitTime = value;
    }

    /**
     * Gets the value of the maxSiteIdentificationRetryIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxSiteIdentificationRetryIsDefault() {
        return maxSiteIdentificationRetryIsDefault;
    }

    /**
     * Sets the value of the maxSiteIdentificationRetryIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxSiteIdentificationRetryIsDefault(JAXBElement<Boolean> value) {
        this.maxSiteIdentificationRetryIsDefault = value;
    }

    /**
     * Gets the value of the maxSiteIdentificationRetry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxSiteIdentificationRetry() {
        return maxSiteIdentificationRetry;
    }

    /**
     * Sets the value of the maxSiteIdentificationRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxSiteIdentificationRetry(JAXBElement<Integer> value) {
        this.maxSiteIdentificationRetry = value;
    }

    /**
     * Gets the value of the siteIdentificationFailWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiteIdentificationFailWaitTimeIsDefault() {
        return siteIdentificationFailWaitTimeIsDefault;
    }

    /**
     * Sets the value of the siteIdentificationFailWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiteIdentificationFailWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.siteIdentificationFailWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the siteIdentificationFailWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSiteIdentificationFailWaitTime() {
        return siteIdentificationFailWaitTime;
    }

    /**
     * Sets the value of the siteIdentificationFailWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSiteIdentificationFailWaitTime(JAXBElement<Integer> value) {
        this.siteIdentificationFailWaitTime = value;
    }

    /**
     * Gets the value of the persistencyModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPersistencyModeIsDefault() {
        return persistencyModeIsDefault;
    }

    /**
     * Sets the value of the persistencyModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPersistencyModeIsDefault(JAXBElement<Boolean> value) {
        this.persistencyModeIsDefault = value;
    }

    /**
     * Gets the value of the persistencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PnpPeristencyMode }{@code >}
     *     
     */
    public JAXBElement<PnpPeristencyMode> getPersistencyMode() {
        return persistencyMode;
    }

    /**
     * Sets the value of the persistencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PnpPeristencyMode }{@code >}
     *     
     */
    public void setPersistencyMode(JAXBElement<PnpPeristencyMode> value) {
        this.persistencyMode = value;
    }

    /**
     * Gets the value of the maxPersistenceRadiusIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxPersistenceRadiusIsDefault() {
        return maxPersistenceRadiusIsDefault;
    }

    /**
     * Sets the value of the maxPersistenceRadiusIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxPersistenceRadiusIsDefault(JAXBElement<Boolean> value) {
        this.maxPersistenceRadiusIsDefault = value;
    }

    /**
     * Gets the value of the maxPersistenceRadius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxPersistenceRadius() {
        return maxPersistenceRadius;
    }

    /**
     * Sets the value of the maxPersistenceRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxPersistenceRadius(JAXBElement<Integer> value) {
        this.maxPersistenceRadius = value;
    }

    /**
     * Gets the value of the maxPersistenceTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxPersistenceTimeIsDefault() {
        return maxPersistenceTimeIsDefault;
    }

    /**
     * Sets the value of the maxPersistenceTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxPersistenceTimeIsDefault(JAXBElement<Boolean> value) {
        this.maxPersistenceTimeIsDefault = value;
    }

    /**
     * Gets the value of the maxPersistenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxPersistenceTime() {
        return maxPersistenceTime;
    }

    /**
     * Sets the value of the maxPersistenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxPersistenceTime(JAXBElement<Integer> value) {
        this.maxPersistenceTime = value;
    }

    /**
     * Gets the value of the inventoryCompleteWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInventoryCompleteWaitTimeIsDefault() {
        return inventoryCompleteWaitTimeIsDefault;
    }

    /**
     * Sets the value of the inventoryCompleteWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInventoryCompleteWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.inventoryCompleteWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the inventoryCompleteWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInventoryCompleteWaitTime() {
        return inventoryCompleteWaitTime;
    }

    /**
     * Sets the value of the inventoryCompleteWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInventoryCompleteWaitTime(JAXBElement<Integer> value) {
        this.inventoryCompleteWaitTime = value;
    }

    /**
     * Gets the value of the autoSoftwareWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoSoftwareWaitTimeIsDefault() {
        return autoSoftwareWaitTimeIsDefault;
    }

    /**
     * Sets the value of the autoSoftwareWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoSoftwareWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.autoSoftwareWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the autoSoftwareWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoSoftwareWaitTime() {
        return autoSoftwareWaitTime;
    }

    /**
     * Sets the value of the autoSoftwareWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoSoftwareWaitTime(JAXBElement<Integer> value) {
        this.autoSoftwareWaitTime = value;
    }

    /**
     * Gets the value of the defaultConfigurationWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDefaultConfigurationWaitTimeIsDefault() {
        return defaultConfigurationWaitTimeIsDefault;
    }

    /**
     * Sets the value of the defaultConfigurationWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDefaultConfigurationWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.defaultConfigurationWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the defaultConfigurationWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDefaultConfigurationWaitTime() {
        return defaultConfigurationWaitTime;
    }

    /**
     * Sets the value of the defaultConfigurationWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDefaultConfigurationWaitTime(JAXBElement<Integer> value) {
        this.defaultConfigurationWaitTime = value;
    }

    /**
     * Gets the value of the warmResetModeAdminIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWarmResetModeAdminIsDefault() {
        return warmResetModeAdminIsDefault;
    }

    /**
     * Sets the value of the warmResetModeAdminIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWarmResetModeAdminIsDefault(JAXBElement<Boolean> value) {
        this.warmResetModeAdminIsDefault = value;
    }

    /**
     * Gets the value of the warmResetModeAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getWarmResetModeAdmin() {
        return warmResetModeAdmin;
    }

    /**
     * Sets the value of the warmResetModeAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setWarmResetModeAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.warmResetModeAdmin = value;
    }

    /**
     * Gets the value of the warmResetAutoInventoryFailTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWarmResetAutoInventoryFailTimerIsDefault() {
        return warmResetAutoInventoryFailTimerIsDefault;
    }

    /**
     * Sets the value of the warmResetAutoInventoryFailTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWarmResetAutoInventoryFailTimerIsDefault(JAXBElement<Boolean> value) {
        this.warmResetAutoInventoryFailTimerIsDefault = value;
    }

    /**
     * Gets the value of the warmResetAutoInventoryFailTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarmResetAutoInventoryFailTimer() {
        return warmResetAutoInventoryFailTimer;
    }

    /**
     * Sets the value of the warmResetAutoInventoryFailTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarmResetAutoInventoryFailTimer(JAXBElement<Integer> value) {
        this.warmResetAutoInventoryFailTimer = value;
    }

    /**
     * Gets the value of the warmResetAutoSwDownloadFailTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWarmResetAutoSwDownloadFailTimerIsDefault() {
        return warmResetAutoSwDownloadFailTimerIsDefault;
    }

    /**
     * Sets the value of the warmResetAutoSwDownloadFailTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWarmResetAutoSwDownloadFailTimerIsDefault(JAXBElement<Boolean> value) {
        this.warmResetAutoSwDownloadFailTimerIsDefault = value;
    }

    /**
     * Gets the value of the warmResetAutoSwDownloadFailTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarmResetAutoSwDownloadFailTimer() {
        return warmResetAutoSwDownloadFailTimer;
    }

    /**
     * Sets the value of the warmResetAutoSwDownloadFailTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarmResetAutoSwDownloadFailTimer(JAXBElement<Integer> value) {
        this.warmResetAutoSwDownloadFailTimer = value;
    }

    /**
     * Gets the value of the warmResetConfigurationFailTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWarmResetConfigurationFailTimerIsDefault() {
        return warmResetConfigurationFailTimerIsDefault;
    }

    /**
     * Sets the value of the warmResetConfigurationFailTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWarmResetConfigurationFailTimerIsDefault(JAXBElement<Boolean> value) {
        this.warmResetConfigurationFailTimerIsDefault = value;
    }

    /**
     * Gets the value of the warmResetConfigurationFailTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarmResetConfigurationFailTimer() {
        return warmResetConfigurationFailTimer;
    }

    /**
     * Sets the value of the warmResetConfigurationFailTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarmResetConfigurationFailTimer(JAXBElement<Integer> value) {
        this.warmResetConfigurationFailTimer = value;
    }

}
