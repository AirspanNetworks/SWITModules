
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for AirSonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSonWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PnpGlobalTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PnpGlobalTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SelfTestRetryTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SelfTestRetryTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxSelfTestRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxSelfTestRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SelfTestFailWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SelfTestFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DhcpWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DhcpWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxDhcpRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxDhcpRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DhcpFailWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DhcpFailWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsLockWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsLockWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdGlobalTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdGlobalTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxSiteIdentificationRetryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxSiteIdentificationRetry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PersistencyModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PersistencyMode" type="{http://Airspan.Netspan.WebServices}PnpPeristencyMode" minOccurs="0"/&gt;
 *         &lt;element name="MaxPersistenceRadiusIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxPersistenceRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxPersistenceTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxPersistenceTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InventoryCompleteWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InventoryCompleteWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoSoftwareWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSoftwareWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultConfigurationWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultConfigurationWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetSiteIdFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetSiteIdFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetAutoInventoryFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetAutoInventoryFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetAutoSwDownloadFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetAutoSwDownloadFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetConfigurationFailTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetConfigurationFailTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetModeAdminIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WarmResetModeAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdentificationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SiteIdentification" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AutoInventoryUpdateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoInventoryUpdate" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AutoSoftwareDownloadIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoSoftwareDownload" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurationProvisioningIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConfigurationProvisioning" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="FullDynamicRadioConfigurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FullDynamicRadioConfiguration" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="LowPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LowPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PowerStepIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerStep" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PowerLevelTimeIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerLevelTimeInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BringupRetryIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BringupRetryInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnrTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnrTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PciCollisionResolutionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciCollisionResolutionTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellInitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CellInitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeCollisionResolutionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UeCollisionResolutionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CollisionResolutionDelayfactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CollisionResolutionDelayfactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PciAllocPolicyIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciAllocPolicy" type="{http://Airspan.Netspan.WebServices}PciAllocPolicyTypes" minOccurs="0"/&gt;
 *         &lt;element name="PciConfusionAllowedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciConfusionAllowed" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="InitialPciListSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InitialPciListSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EsonConnectionRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EsonConnectionRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLostMaxRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLostMaxRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DelayBetweenConnectionRetriesCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayBetweenConnectionRetriesCycle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSonWs", propOrder = {
    "pnpGlobalTimerIsDefault",
    "pnpGlobalTimer",
    "selfTestRetryTimeIsDefault",
    "selfTestRetryTime",
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
    "siteIdGlobalTimerIsDefault",
    "siteIdGlobalTimer",
    "maxSiteIdentificationRetryIsDefault",
    "maxSiteIdentificationRetry",
    "siteIdFailTimerIsDefault",
    "siteIdFailTimer",
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
    "warmResetSiteIdFailTimerIsDefault",
    "warmResetSiteIdFailTimer",
    "warmResetAutoInventoryFailTimerIsDefault",
    "warmResetAutoInventoryFailTimer",
    "warmResetAutoSwDownloadFailTimerIsDefault",
    "warmResetAutoSwDownloadFailTimer",
    "warmResetConfigurationFailTimerIsDefault",
    "warmResetConfigurationFailTimer",
    "warmResetModeAdminIsDefault",
    "warmResetModeAdmin",
    "siteIdentificationIsDefault",
    "siteIdentification",
    "autoInventoryUpdateIsDefault",
    "autoInventoryUpdate",
    "autoSoftwareDownloadIsDefault",
    "autoSoftwareDownload",
    "configurationProvisioningIsDefault",
    "configurationProvisioning",
    "fullDynamicRadioConfigurationIsDefault",
    "fullDynamicRadioConfiguration",
    "lowPowerIsDefault",
    "lowPower",
    "powerStepIsDefault",
    "powerStep",
    "powerLevelTimeIntervalIsDefault",
    "powerLevelTimeInterval",
    "bringupRetryIntervalIsDefault",
    "bringupRetryInterval",
    "anrTimerIsDefault",
    "anrTimer",
    "pciCollisionResolutionTimerIsDefault",
    "pciCollisionResolutionTimer",
    "cellInitTimeIsDefault",
    "cellInitTime",
    "ueCollisionResolutionThresholdIsDefault",
    "ueCollisionResolutionThreshold",
    "collisionResolutionDelayfactorIsDefault",
    "collisionResolutionDelayfactor",
    "pciAllocPolicyIsDefault",
    "pciAllocPolicy",
    "pciConfusionAllowedIsDefault",
    "pciConfusionAllowed",
    "initialPciListSizeIsDefault",
    "initialPciListSize",
    "esonConnectionRetryTimerIsDefault",
    "esonConnectionRetryTimer",
    "connectionLostMaxRetriesIsDefault",
    "connectionLostMaxRetries",
    "delayBetweenConnectionRetriesCycleIsDefault",
    "delayBetweenConnectionRetriesCycle"
})
public class AirSonWs {

    @XmlElementRef(name = "PnpGlobalTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pnpGlobalTimerIsDefault;
    @XmlElementRef(name = "PnpGlobalTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpGlobalTimer;
    @XmlElementRef(name = "SelfTestRetryTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> selfTestRetryTimeIsDefault;
    @XmlElementRef(name = "SelfTestRetryTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> selfTestRetryTime;
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
    @XmlElementRef(name = "SiteIdGlobalTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siteIdGlobalTimerIsDefault;
    @XmlElementRef(name = "SiteIdGlobalTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> siteIdGlobalTimer;
    @XmlElementRef(name = "MaxSiteIdentificationRetryIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxSiteIdentificationRetryIsDefault;
    @XmlElementRef(name = "MaxSiteIdentificationRetry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSiteIdentificationRetry;
    @XmlElementRef(name = "SiteIdFailTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siteIdFailTimerIsDefault;
    @XmlElementRef(name = "SiteIdFailTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> siteIdFailTimer;
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
    @XmlElementRef(name = "WarmResetSiteIdFailTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetSiteIdFailTimerIsDefault;
    @XmlElementRef(name = "WarmResetSiteIdFailTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> warmResetSiteIdFailTimer;
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
    @XmlElementRef(name = "WarmResetModeAdminIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> warmResetModeAdminIsDefault;
    @XmlElementRef(name = "WarmResetModeAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> warmResetModeAdmin;
    @XmlElementRef(name = "SiteIdentificationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siteIdentificationIsDefault;
    @XmlElementRef(name = "SiteIdentification", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> siteIdentification;
    @XmlElementRef(name = "AutoInventoryUpdateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoInventoryUpdateIsDefault;
    @XmlElementRef(name = "AutoInventoryUpdate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> autoInventoryUpdate;
    @XmlElementRef(name = "AutoSoftwareDownloadIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoSoftwareDownloadIsDefault;
    @XmlElementRef(name = "AutoSoftwareDownload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> autoSoftwareDownload;
    @XmlElementRef(name = "ConfigurationProvisioningIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> configurationProvisioningIsDefault;
    @XmlElementRef(name = "ConfigurationProvisioning", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> configurationProvisioning;
    @XmlElementRef(name = "FullDynamicRadioConfigurationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> fullDynamicRadioConfigurationIsDefault;
    @XmlElementRef(name = "FullDynamicRadioConfiguration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> fullDynamicRadioConfiguration;
    @XmlElementRef(name = "LowPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lowPowerIsDefault;
    @XmlElementRef(name = "LowPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lowPower;
    @XmlElementRef(name = "PowerStepIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerStepIsDefault;
    @XmlElementRef(name = "PowerStep", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> powerStep;
    @XmlElementRef(name = "PowerLevelTimeIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerLevelTimeIntervalIsDefault;
    @XmlElementRef(name = "PowerLevelTimeInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> powerLevelTimeInterval;
    @XmlElementRef(name = "BringupRetryIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bringupRetryIntervalIsDefault;
    @XmlElementRef(name = "BringupRetryInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bringupRetryInterval;
    @XmlElementRef(name = "AnrTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anrTimerIsDefault;
    @XmlElementRef(name = "AnrTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> anrTimer;
    @XmlElementRef(name = "PciCollisionResolutionTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciCollisionResolutionTimerIsDefault;
    @XmlElementRef(name = "PciCollisionResolutionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciCollisionResolutionTimer;
    @XmlElementRef(name = "CellInitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cellInitTimeIsDefault;
    @XmlElementRef(name = "CellInitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellInitTime;
    @XmlElementRef(name = "UeCollisionResolutionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ueCollisionResolutionThresholdIsDefault;
    @XmlElementRef(name = "UeCollisionResolutionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueCollisionResolutionThreshold;
    @XmlElementRef(name = "CollisionResolutionDelayfactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> collisionResolutionDelayfactorIsDefault;
    @XmlElementRef(name = "CollisionResolutionDelayfactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> collisionResolutionDelayfactor;
    @XmlElementRef(name = "PciAllocPolicyIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciAllocPolicyIsDefault;
    @XmlElementRef(name = "PciAllocPolicy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PciAllocPolicyTypes> pciAllocPolicy;
    @XmlElementRef(name = "PciConfusionAllowedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciConfusionAllowedIsDefault;
    @XmlElementRef(name = "PciConfusionAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> pciConfusionAllowed;
    @XmlElementRef(name = "InitialPciListSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> initialPciListSizeIsDefault;
    @XmlElementRef(name = "InitialPciListSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialPciListSize;
    @XmlElementRef(name = "EsonConnectionRetryTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> esonConnectionRetryTimerIsDefault;
    @XmlElementRef(name = "EsonConnectionRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> esonConnectionRetryTimer;
    @XmlElementRef(name = "ConnectionLostMaxRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> connectionLostMaxRetriesIsDefault;
    @XmlElementRef(name = "ConnectionLostMaxRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectionLostMaxRetries;
    @XmlElementRef(name = "DelayBetweenConnectionRetriesCycleIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> delayBetweenConnectionRetriesCycleIsDefault;
    @XmlElementRef(name = "DelayBetweenConnectionRetriesCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> delayBetweenConnectionRetriesCycle;

    /**
     * Gets the value of the pnpGlobalTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPnpGlobalTimerIsDefault() {
        return pnpGlobalTimerIsDefault;
    }

    /**
     * Sets the value of the pnpGlobalTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPnpGlobalTimerIsDefault(JAXBElement<Boolean> value) {
        this.pnpGlobalTimerIsDefault = value;
    }

    /**
     * Gets the value of the pnpGlobalTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPnpGlobalTimer() {
        return pnpGlobalTimer;
    }

    /**
     * Sets the value of the pnpGlobalTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPnpGlobalTimer(JAXBElement<Integer> value) {
        this.pnpGlobalTimer = value;
    }

    /**
     * Gets the value of the selfTestRetryTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSelfTestRetryTimeIsDefault() {
        return selfTestRetryTimeIsDefault;
    }

    /**
     * Sets the value of the selfTestRetryTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSelfTestRetryTimeIsDefault(JAXBElement<Boolean> value) {
        this.selfTestRetryTimeIsDefault = value;
    }

    /**
     * Gets the value of the selfTestRetryTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSelfTestRetryTime() {
        return selfTestRetryTime;
    }

    /**
     * Sets the value of the selfTestRetryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSelfTestRetryTime(JAXBElement<Integer> value) {
        this.selfTestRetryTime = value;
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
     * Gets the value of the siteIdGlobalTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiteIdGlobalTimerIsDefault() {
        return siteIdGlobalTimerIsDefault;
    }

    /**
     * Sets the value of the siteIdGlobalTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiteIdGlobalTimerIsDefault(JAXBElement<Boolean> value) {
        this.siteIdGlobalTimerIsDefault = value;
    }

    /**
     * Gets the value of the siteIdGlobalTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSiteIdGlobalTimer() {
        return siteIdGlobalTimer;
    }

    /**
     * Sets the value of the siteIdGlobalTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSiteIdGlobalTimer(JAXBElement<Integer> value) {
        this.siteIdGlobalTimer = value;
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
     * Gets the value of the siteIdFailTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiteIdFailTimerIsDefault() {
        return siteIdFailTimerIsDefault;
    }

    /**
     * Sets the value of the siteIdFailTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiteIdFailTimerIsDefault(JAXBElement<Boolean> value) {
        this.siteIdFailTimerIsDefault = value;
    }

    /**
     * Gets the value of the siteIdFailTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSiteIdFailTimer() {
        return siteIdFailTimer;
    }

    /**
     * Sets the value of the siteIdFailTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSiteIdFailTimer(JAXBElement<Integer> value) {
        this.siteIdFailTimer = value;
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
     * Gets the value of the warmResetSiteIdFailTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWarmResetSiteIdFailTimerIsDefault() {
        return warmResetSiteIdFailTimerIsDefault;
    }

    /**
     * Sets the value of the warmResetSiteIdFailTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWarmResetSiteIdFailTimerIsDefault(JAXBElement<Boolean> value) {
        this.warmResetSiteIdFailTimerIsDefault = value;
    }

    /**
     * Gets the value of the warmResetSiteIdFailTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWarmResetSiteIdFailTimer() {
        return warmResetSiteIdFailTimer;
    }

    /**
     * Sets the value of the warmResetSiteIdFailTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWarmResetSiteIdFailTimer(JAXBElement<Integer> value) {
        this.warmResetSiteIdFailTimer = value;
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
     * Gets the value of the siteIdentificationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiteIdentificationIsDefault() {
        return siteIdentificationIsDefault;
    }

    /**
     * Sets the value of the siteIdentificationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiteIdentificationIsDefault(JAXBElement<Boolean> value) {
        this.siteIdentificationIsDefault = value;
    }

    /**
     * Gets the value of the siteIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getSiteIdentification() {
        return siteIdentification;
    }

    /**
     * Sets the value of the siteIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setSiteIdentification(JAXBElement<EnabledDisabledStates> value) {
        this.siteIdentification = value;
    }

    /**
     * Gets the value of the autoInventoryUpdateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoInventoryUpdateIsDefault() {
        return autoInventoryUpdateIsDefault;
    }

    /**
     * Sets the value of the autoInventoryUpdateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoInventoryUpdateIsDefault(JAXBElement<Boolean> value) {
        this.autoInventoryUpdateIsDefault = value;
    }

    /**
     * Gets the value of the autoInventoryUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAutoInventoryUpdate() {
        return autoInventoryUpdate;
    }

    /**
     * Sets the value of the autoInventoryUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAutoInventoryUpdate(JAXBElement<EnabledDisabledStates> value) {
        this.autoInventoryUpdate = value;
    }

    /**
     * Gets the value of the autoSoftwareDownloadIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoSoftwareDownloadIsDefault() {
        return autoSoftwareDownloadIsDefault;
    }

    /**
     * Sets the value of the autoSoftwareDownloadIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoSoftwareDownloadIsDefault(JAXBElement<Boolean> value) {
        this.autoSoftwareDownloadIsDefault = value;
    }

    /**
     * Gets the value of the autoSoftwareDownload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAutoSoftwareDownload() {
        return autoSoftwareDownload;
    }

    /**
     * Sets the value of the autoSoftwareDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAutoSoftwareDownload(JAXBElement<EnabledDisabledStates> value) {
        this.autoSoftwareDownload = value;
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getConfigurationProvisioning() {
        return configurationProvisioning;
    }

    /**
     * Sets the value of the configurationProvisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setConfigurationProvisioning(JAXBElement<EnabledDisabledStates> value) {
        this.configurationProvisioning = value;
    }

    /**
     * Gets the value of the fullDynamicRadioConfigurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFullDynamicRadioConfigurationIsDefault() {
        return fullDynamicRadioConfigurationIsDefault;
    }

    /**
     * Sets the value of the fullDynamicRadioConfigurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFullDynamicRadioConfigurationIsDefault(JAXBElement<Boolean> value) {
        this.fullDynamicRadioConfigurationIsDefault = value;
    }

    /**
     * Gets the value of the fullDynamicRadioConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getFullDynamicRadioConfiguration() {
        return fullDynamicRadioConfiguration;
    }

    /**
     * Sets the value of the fullDynamicRadioConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setFullDynamicRadioConfiguration(JAXBElement<EnabledDisabledStates> value) {
        this.fullDynamicRadioConfiguration = value;
    }

    /**
     * Gets the value of the lowPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLowPowerIsDefault() {
        return lowPowerIsDefault;
    }

    /**
     * Sets the value of the lowPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLowPowerIsDefault(JAXBElement<Boolean> value) {
        this.lowPowerIsDefault = value;
    }

    /**
     * Gets the value of the lowPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLowPower() {
        return lowPower;
    }

    /**
     * Sets the value of the lowPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLowPower(JAXBElement<Integer> value) {
        this.lowPower = value;
    }

    /**
     * Gets the value of the powerStepIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerStepIsDefault() {
        return powerStepIsDefault;
    }

    /**
     * Sets the value of the powerStepIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerStepIsDefault(JAXBElement<Boolean> value) {
        this.powerStepIsDefault = value;
    }

    /**
     * Gets the value of the powerStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPowerStep() {
        return powerStep;
    }

    /**
     * Sets the value of the powerStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPowerStep(JAXBElement<Integer> value) {
        this.powerStep = value;
    }

    /**
     * Gets the value of the powerLevelTimeIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerLevelTimeIntervalIsDefault() {
        return powerLevelTimeIntervalIsDefault;
    }

    /**
     * Sets the value of the powerLevelTimeIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerLevelTimeIntervalIsDefault(JAXBElement<Boolean> value) {
        this.powerLevelTimeIntervalIsDefault = value;
    }

    /**
     * Gets the value of the powerLevelTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPowerLevelTimeInterval() {
        return powerLevelTimeInterval;
    }

    /**
     * Sets the value of the powerLevelTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPowerLevelTimeInterval(JAXBElement<Integer> value) {
        this.powerLevelTimeInterval = value;
    }

    /**
     * Gets the value of the bringupRetryIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBringupRetryIntervalIsDefault() {
        return bringupRetryIntervalIsDefault;
    }

    /**
     * Sets the value of the bringupRetryIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBringupRetryIntervalIsDefault(JAXBElement<Boolean> value) {
        this.bringupRetryIntervalIsDefault = value;
    }

    /**
     * Gets the value of the bringupRetryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBringupRetryInterval() {
        return bringupRetryInterval;
    }

    /**
     * Sets the value of the bringupRetryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBringupRetryInterval(JAXBElement<Integer> value) {
        this.bringupRetryInterval = value;
    }

    /**
     * Gets the value of the anrTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAnrTimerIsDefault() {
        return anrTimerIsDefault;
    }

    /**
     * Sets the value of the anrTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAnrTimerIsDefault(JAXBElement<Boolean> value) {
        this.anrTimerIsDefault = value;
    }

    /**
     * Gets the value of the anrTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnrTimer() {
        return anrTimer;
    }

    /**
     * Sets the value of the anrTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnrTimer(JAXBElement<Integer> value) {
        this.anrTimer = value;
    }

    /**
     * Gets the value of the pciCollisionResolutionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciCollisionResolutionTimerIsDefault() {
        return pciCollisionResolutionTimerIsDefault;
    }

    /**
     * Sets the value of the pciCollisionResolutionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciCollisionResolutionTimerIsDefault(JAXBElement<Boolean> value) {
        this.pciCollisionResolutionTimerIsDefault = value;
    }

    /**
     * Gets the value of the pciCollisionResolutionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciCollisionResolutionTimer() {
        return pciCollisionResolutionTimer;
    }

    /**
     * Sets the value of the pciCollisionResolutionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciCollisionResolutionTimer(JAXBElement<Integer> value) {
        this.pciCollisionResolutionTimer = value;
    }

    /**
     * Gets the value of the cellInitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCellInitTimeIsDefault() {
        return cellInitTimeIsDefault;
    }

    /**
     * Sets the value of the cellInitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCellInitTimeIsDefault(JAXBElement<Boolean> value) {
        this.cellInitTimeIsDefault = value;
    }

    /**
     * Gets the value of the cellInitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellInitTime() {
        return cellInitTime;
    }

    /**
     * Sets the value of the cellInitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellInitTime(JAXBElement<Integer> value) {
        this.cellInitTime = value;
    }

    /**
     * Gets the value of the ueCollisionResolutionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUeCollisionResolutionThresholdIsDefault() {
        return ueCollisionResolutionThresholdIsDefault;
    }

    /**
     * Sets the value of the ueCollisionResolutionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUeCollisionResolutionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ueCollisionResolutionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ueCollisionResolutionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeCollisionResolutionThreshold() {
        return ueCollisionResolutionThreshold;
    }

    /**
     * Sets the value of the ueCollisionResolutionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeCollisionResolutionThreshold(JAXBElement<Integer> value) {
        this.ueCollisionResolutionThreshold = value;
    }

    /**
     * Gets the value of the collisionResolutionDelayfactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCollisionResolutionDelayfactorIsDefault() {
        return collisionResolutionDelayfactorIsDefault;
    }

    /**
     * Sets the value of the collisionResolutionDelayfactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCollisionResolutionDelayfactorIsDefault(JAXBElement<Boolean> value) {
        this.collisionResolutionDelayfactorIsDefault = value;
    }

    /**
     * Gets the value of the collisionResolutionDelayfactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCollisionResolutionDelayfactor() {
        return collisionResolutionDelayfactor;
    }

    /**
     * Sets the value of the collisionResolutionDelayfactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCollisionResolutionDelayfactor(JAXBElement<Integer> value) {
        this.collisionResolutionDelayfactor = value;
    }

    /**
     * Gets the value of the pciAllocPolicyIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciAllocPolicyIsDefault() {
        return pciAllocPolicyIsDefault;
    }

    /**
     * Sets the value of the pciAllocPolicyIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciAllocPolicyIsDefault(JAXBElement<Boolean> value) {
        this.pciAllocPolicyIsDefault = value;
    }

    /**
     * Gets the value of the pciAllocPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}
     *     
     */
    public JAXBElement<PciAllocPolicyTypes> getPciAllocPolicy() {
        return pciAllocPolicy;
    }

    /**
     * Sets the value of the pciAllocPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}
     *     
     */
    public void setPciAllocPolicy(JAXBElement<PciAllocPolicyTypes> value) {
        this.pciAllocPolicy = value;
    }

    /**
     * Gets the value of the pciConfusionAllowedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciConfusionAllowedIsDefault() {
        return pciConfusionAllowedIsDefault;
    }

    /**
     * Sets the value of the pciConfusionAllowedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciConfusionAllowedIsDefault(JAXBElement<Boolean> value) {
        this.pciConfusionAllowedIsDefault = value;
    }

    /**
     * Gets the value of the pciConfusionAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPciConfusionAllowed() {
        return pciConfusionAllowed;
    }

    /**
     * Sets the value of the pciConfusionAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPciConfusionAllowed(JAXBElement<EnabledDisabledStates> value) {
        this.pciConfusionAllowed = value;
    }

    /**
     * Gets the value of the initialPciListSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInitialPciListSizeIsDefault() {
        return initialPciListSizeIsDefault;
    }

    /**
     * Sets the value of the initialPciListSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInitialPciListSizeIsDefault(JAXBElement<Boolean> value) {
        this.initialPciListSizeIsDefault = value;
    }

    /**
     * Gets the value of the initialPciListSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialPciListSize() {
        return initialPciListSize;
    }

    /**
     * Sets the value of the initialPciListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialPciListSize(JAXBElement<Integer> value) {
        this.initialPciListSize = value;
    }

    /**
     * Gets the value of the esonConnectionRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEsonConnectionRetryTimerIsDefault() {
        return esonConnectionRetryTimerIsDefault;
    }

    /**
     * Sets the value of the esonConnectionRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEsonConnectionRetryTimerIsDefault(JAXBElement<Boolean> value) {
        this.esonConnectionRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the esonConnectionRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEsonConnectionRetryTimer() {
        return esonConnectionRetryTimer;
    }

    /**
     * Sets the value of the esonConnectionRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEsonConnectionRetryTimer(JAXBElement<Integer> value) {
        this.esonConnectionRetryTimer = value;
    }

    /**
     * Gets the value of the connectionLostMaxRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getConnectionLostMaxRetriesIsDefault() {
        return connectionLostMaxRetriesIsDefault;
    }

    /**
     * Sets the value of the connectionLostMaxRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setConnectionLostMaxRetriesIsDefault(JAXBElement<Boolean> value) {
        this.connectionLostMaxRetriesIsDefault = value;
    }

    /**
     * Gets the value of the connectionLostMaxRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectionLostMaxRetries() {
        return connectionLostMaxRetries;
    }

    /**
     * Sets the value of the connectionLostMaxRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectionLostMaxRetries(JAXBElement<Integer> value) {
        this.connectionLostMaxRetries = value;
    }

    /**
     * Gets the value of the delayBetweenConnectionRetriesCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDelayBetweenConnectionRetriesCycleIsDefault() {
        return delayBetweenConnectionRetriesCycleIsDefault;
    }

    /**
     * Sets the value of the delayBetweenConnectionRetriesCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDelayBetweenConnectionRetriesCycleIsDefault(JAXBElement<Boolean> value) {
        this.delayBetweenConnectionRetriesCycleIsDefault = value;
    }

    /**
     * Gets the value of the delayBetweenConnectionRetriesCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDelayBetweenConnectionRetriesCycle() {
        return delayBetweenConnectionRetriesCycle;
    }

    /**
     * Sets the value of the delayBetweenConnectionRetriesCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDelayBetweenConnectionRetriesCycle(JAXBElement<Integer> value) {
        this.delayBetweenConnectionRetriesCycle = value;
    }

}
