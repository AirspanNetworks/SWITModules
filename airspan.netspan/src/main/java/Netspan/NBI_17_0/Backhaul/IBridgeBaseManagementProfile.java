
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseManagementProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseManagementProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesIbBase" minOccurs="0"/&gt;
 *         &lt;element name="DefaultServiceProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClockSource" type="{http://Airspan.Netspan.WebServices}ClockSyncSource" minOccurs="0"/&gt;
 *         &lt;element name="PtpMasterEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="GpsSoftHoldoverEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress1Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress2Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress3Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress4Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PtpAnnounceRate" type="{http://Airspan.Netspan.WebServices}AnnounceRateTypesIbridge" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncRate" type="{http://Airspan.Netspan.WebServices}SyncRateTypesIbridge" minOccurs="0"/&gt;
 *         &lt;element name="PtpDelayReqRespRate" type="{http://Airspan.Netspan.WebServices}DelayRateTypesIbridge" minOccurs="0"/&gt;
 *         &lt;element name="PtpLeaseDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TiltProtectionEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="TiltProtectionDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TiltProtectionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TiltAlarmEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="TiltAlarmRaiseThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StatsCollectionPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AirInterfaceStats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AirInterfaceUsageStats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TermRfStats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TermDataStats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseManagementProfile", propOrder = {
    "name",
    "hardwareCategory",
    "defaultServiceProductName",
    "clockSource",
    "ptpMasterEnabled",
    "gpsSoftHoldoverEnabled",
    "ntpServerIpAddress1Enabled",
    "ntpServerIpAddress1",
    "useNms1",
    "ntpServerIpAddress2Enabled",
    "ntpServerIpAddress2",
    "useNms2",
    "ntpServerIpAddress3Enabled",
    "ntpServerIpAddress3",
    "useNms3",
    "ntpServerIpAddress4Enabled",
    "ntpServerIpAddress4",
    "useNms4",
    "ptpDomain",
    "ptpIpAddress",
    "ptpAnnounceRate",
    "ptpSyncRate",
    "ptpDelayReqRespRate",
    "ptpLeaseDuration",
    "tiltProtectionEnabled",
    "tiltProtectionDelay",
    "tiltProtectionThreshold",
    "tiltAlarmEnabled",
    "tiltAlarmRaiseThreshold",
    "statsCollectionPeriod",
    "airInterfaceStats",
    "airInterfaceUsageStats",
    "termRfStats",
    "termDataStats"
})
public class IBridgeBaseManagementProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesIbBase> hardwareCategory;
    @XmlElement(name = "DefaultServiceProductName")
    protected String defaultServiceProductName;
    @XmlElementRef(name = "ClockSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSyncSource> clockSource;
    @XmlElementRef(name = "PtpMasterEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> ptpMasterEnabled;
    @XmlElementRef(name = "GpsSoftHoldoverEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> gpsSoftHoldoverEnabled;
    @XmlElementRef(name = "NtpServerIpAddress1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress1Enabled;
    @XmlElement(name = "NtpServerIpAddress1")
    protected String ntpServerIpAddress1;
    @XmlElementRef(name = "UseNms1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms1;
    @XmlElementRef(name = "NtpServerIpAddress2Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress2Enabled;
    @XmlElement(name = "NtpServerIpAddress2")
    protected String ntpServerIpAddress2;
    @XmlElementRef(name = "UseNms2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms2;
    @XmlElementRef(name = "NtpServerIpAddress3Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress3Enabled;
    @XmlElement(name = "NtpServerIpAddress3")
    protected String ntpServerIpAddress3;
    @XmlElementRef(name = "UseNms3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms3;
    @XmlElementRef(name = "NtpServerIpAddress4Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress4Enabled;
    @XmlElement(name = "NtpServerIpAddress4")
    protected String ntpServerIpAddress4;
    @XmlElementRef(name = "UseNms4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms4;
    @XmlElementRef(name = "PtpDomain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpDomain;
    @XmlElement(name = "PtpIpAddress")
    protected String ptpIpAddress;
    @XmlElementRef(name = "PtpAnnounceRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ptpAnnounceRate;
    @XmlElementRef(name = "PtpSyncRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ptpSyncRate;
    @XmlElementRef(name = "PtpDelayReqRespRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ptpDelayReqRespRate;
    @XmlElementRef(name = "PtpLeaseDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpLeaseDuration;
    @XmlElementRef(name = "TiltProtectionEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> tiltProtectionEnabled;
    @XmlElementRef(name = "TiltProtectionDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tiltProtectionDelay;
    @XmlElementRef(name = "TiltProtectionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tiltProtectionThreshold;
    @XmlElementRef(name = "TiltAlarmEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> tiltAlarmEnabled;
    @XmlElementRef(name = "TiltAlarmRaiseThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tiltAlarmRaiseThreshold;
    @XmlElementRef(name = "StatsCollectionPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> statsCollectionPeriod;
    @XmlElementRef(name = "AirInterfaceStats", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> airInterfaceStats;
    @XmlElementRef(name = "AirInterfaceUsageStats", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> airInterfaceUsageStats;
    @XmlElementRef(name = "TermRfStats", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> termRfStats;
    @XmlElementRef(name = "TermDataStats", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> termDataStats;

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
     *     {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}
     *     
     */
    public JAXBElement<CategoriesIbBase> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesIbBase> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the defaultServiceProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultServiceProductName() {
        return defaultServiceProductName;
    }

    /**
     * Sets the value of the defaultServiceProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultServiceProductName(String value) {
        this.defaultServiceProductName = value;
    }

    /**
     * Gets the value of the clockSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSyncSource }{@code >}
     *     
     */
    public JAXBElement<ClockSyncSource> getClockSource() {
        return clockSource;
    }

    /**
     * Sets the value of the clockSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSyncSource }{@code >}
     *     
     */
    public void setClockSource(JAXBElement<ClockSyncSource> value) {
        this.clockSource = value;
    }

    /**
     * Gets the value of the ptpMasterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getPtpMasterEnabled() {
        return ptpMasterEnabled;
    }

    /**
     * Sets the value of the ptpMasterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setPtpMasterEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.ptpMasterEnabled = value;
    }

    /**
     * Gets the value of the gpsSoftHoldoverEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getGpsSoftHoldoverEnabled() {
        return gpsSoftHoldoverEnabled;
    }

    /**
     * Sets the value of the gpsSoftHoldoverEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setGpsSoftHoldoverEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.gpsSoftHoldoverEnabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress1Enabled() {
        return ntpServerIpAddress1Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress1Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress1Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress1() {
        return ntpServerIpAddress1;
    }

    /**
     * Sets the value of the ntpServerIpAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress1(String value) {
        this.ntpServerIpAddress1 = value;
    }

    /**
     * Gets the value of the useNms1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms1() {
        return useNms1;
    }

    /**
     * Sets the value of the useNms1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms1(JAXBElement<Boolean> value) {
        this.useNms1 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress2Enabled() {
        return ntpServerIpAddress2Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress2Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress2Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress2() {
        return ntpServerIpAddress2;
    }

    /**
     * Sets the value of the ntpServerIpAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress2(String value) {
        this.ntpServerIpAddress2 = value;
    }

    /**
     * Gets the value of the useNms2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms2() {
        return useNms2;
    }

    /**
     * Sets the value of the useNms2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms2(JAXBElement<Boolean> value) {
        this.useNms2 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress3Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress3Enabled() {
        return ntpServerIpAddress3Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress3Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress3Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress3Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress3() {
        return ntpServerIpAddress3;
    }

    /**
     * Sets the value of the ntpServerIpAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress3(String value) {
        this.ntpServerIpAddress3 = value;
    }

    /**
     * Gets the value of the useNms3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms3() {
        return useNms3;
    }

    /**
     * Sets the value of the useNms3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms3(JAXBElement<Boolean> value) {
        this.useNms3 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress4Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress4Enabled() {
        return ntpServerIpAddress4Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress4Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress4Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress4Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress4() {
        return ntpServerIpAddress4;
    }

    /**
     * Sets the value of the ntpServerIpAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress4(String value) {
        this.ntpServerIpAddress4 = value;
    }

    /**
     * Gets the value of the useNms4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms4() {
        return useNms4;
    }

    /**
     * Sets the value of the useNms4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms4(JAXBElement<Boolean> value) {
        this.useNms4 = value;
    }

    /**
     * Gets the value of the ptpDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpDomain() {
        return ptpDomain;
    }

    /**
     * Sets the value of the ptpDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpDomain(JAXBElement<Integer> value) {
        this.ptpDomain = value;
    }

    /**
     * Gets the value of the ptpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtpIpAddress() {
        return ptpIpAddress;
    }

    /**
     * Sets the value of the ptpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtpIpAddress(String value) {
        this.ptpIpAddress = value;
    }

    /**
     * Gets the value of the ptpAnnounceRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpAnnounceRate() {
        return ptpAnnounceRate;
    }

    /**
     * Sets the value of the ptpAnnounceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpAnnounceRate(JAXBElement<String> value) {
        this.ptpAnnounceRate = value;
    }

    /**
     * Gets the value of the ptpSyncRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpSyncRate() {
        return ptpSyncRate;
    }

    /**
     * Sets the value of the ptpSyncRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpSyncRate(JAXBElement<String> value) {
        this.ptpSyncRate = value;
    }

    /**
     * Gets the value of the ptpDelayReqRespRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPtpDelayReqRespRate() {
        return ptpDelayReqRespRate;
    }

    /**
     * Sets the value of the ptpDelayReqRespRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPtpDelayReqRespRate(JAXBElement<String> value) {
        this.ptpDelayReqRespRate = value;
    }

    /**
     * Gets the value of the ptpLeaseDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpLeaseDuration() {
        return ptpLeaseDuration;
    }

    /**
     * Sets the value of the ptpLeaseDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpLeaseDuration(JAXBElement<Integer> value) {
        this.ptpLeaseDuration = value;
    }

    /**
     * Gets the value of the tiltProtectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getTiltProtectionEnabled() {
        return tiltProtectionEnabled;
    }

    /**
     * Sets the value of the tiltProtectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setTiltProtectionEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.tiltProtectionEnabled = value;
    }

    /**
     * Gets the value of the tiltProtectionDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTiltProtectionDelay() {
        return tiltProtectionDelay;
    }

    /**
     * Sets the value of the tiltProtectionDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTiltProtectionDelay(JAXBElement<Integer> value) {
        this.tiltProtectionDelay = value;
    }

    /**
     * Gets the value of the tiltProtectionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTiltProtectionThreshold() {
        return tiltProtectionThreshold;
    }

    /**
     * Sets the value of the tiltProtectionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTiltProtectionThreshold(JAXBElement<Integer> value) {
        this.tiltProtectionThreshold = value;
    }

    /**
     * Gets the value of the tiltAlarmEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getTiltAlarmEnabled() {
        return tiltAlarmEnabled;
    }

    /**
     * Sets the value of the tiltAlarmEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setTiltAlarmEnabled(JAXBElement<EnabledDisabledValues> value) {
        this.tiltAlarmEnabled = value;
    }

    /**
     * Gets the value of the tiltAlarmRaiseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTiltAlarmRaiseThreshold() {
        return tiltAlarmRaiseThreshold;
    }

    /**
     * Sets the value of the tiltAlarmRaiseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTiltAlarmRaiseThreshold(JAXBElement<Integer> value) {
        this.tiltAlarmRaiseThreshold = value;
    }

    /**
     * Gets the value of the statsCollectionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStatsCollectionPeriod() {
        return statsCollectionPeriod;
    }

    /**
     * Sets the value of the statsCollectionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStatsCollectionPeriod(JAXBElement<Integer> value) {
        this.statsCollectionPeriod = value;
    }

    /**
     * Gets the value of the airInterfaceStats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAirInterfaceStats() {
        return airInterfaceStats;
    }

    /**
     * Sets the value of the airInterfaceStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAirInterfaceStats(JAXBElement<Boolean> value) {
        this.airInterfaceStats = value;
    }

    /**
     * Gets the value of the airInterfaceUsageStats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAirInterfaceUsageStats() {
        return airInterfaceUsageStats;
    }

    /**
     * Sets the value of the airInterfaceUsageStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAirInterfaceUsageStats(JAXBElement<Boolean> value) {
        this.airInterfaceUsageStats = value;
    }

    /**
     * Gets the value of the termRfStats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTermRfStats() {
        return termRfStats;
    }

    /**
     * Sets the value of the termRfStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTermRfStats(JAXBElement<Boolean> value) {
        this.termRfStats = value;
    }

    /**
     * Gets the value of the termDataStats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTermDataStats() {
        return termDataStats;
    }

    /**
     * Sets the value of the termDataStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTermDataStats(JAXBElement<Boolean> value) {
        this.termDataStats = value;
    }

}
