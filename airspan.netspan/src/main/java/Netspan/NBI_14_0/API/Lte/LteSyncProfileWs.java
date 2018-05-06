
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for LteSyncProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSyncProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="PrimaryClockSource" type="{http://Airspan.Netspan.WebServices}ClockSources"/>
 *         &lt;element name="GnssMode" type="{http://Airspan.Netspan.WebServices}SyncProfileGnssModes"/>
 *         &lt;element name="PrimaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecondaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlanEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VlanId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VlanPriority" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PtpProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypeValues"/>
 *         &lt;element name="AnnounceRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}AnnounceRateValues"/>
 *         &lt;element name="SyncRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}SyncRateValues"/>
 *         &lt;element name="DelayRequestResponseRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}DelayRateValues"/>
 *         &lt;element name="LeaseDurationInSec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSyncProfileWs", propOrder = {
    "name",
    "hardwareCategory",
    "primaryClockSource",
    "gnssMode",
    "primaryMasterIpAddress",
    "primaryMasterDomain",
    "secondaryMasterIpAddress",
    "secondaryMasterDomain",
    "vlanEnabled",
    "vlanId",
    "vlanPriority",
    "ptpProfileType",
    "announceRateInMsgPerSec",
    "syncRateInMsgPerSec",
    "delayRequestResponseRateInMsgPerSec",
    "leaseDurationInSec"
})
public class LteSyncProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "PrimaryClockSource", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ClockSources primaryClockSource;
    @XmlElement(name = "GnssMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SyncProfileGnssModes gnssMode;
    @XmlElement(name = "PrimaryMasterIpAddress")
    protected String primaryMasterIpAddress;
    @XmlElement(name = "PrimaryMasterDomain", required = true, type = Integer.class, nillable = true)
    protected Integer primaryMasterDomain;
    @XmlElement(name = "SecondaryMasterIpAddress")
    protected String secondaryMasterIpAddress;
    @XmlElement(name = "SecondaryMasterDomain", required = true, type = Integer.class, nillable = true)
    protected Integer secondaryMasterDomain;
    @XmlElement(name = "VlanEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean vlanEnabled;
    @XmlElement(name = "VlanId", required = true, type = Integer.class, nillable = true)
    protected Integer vlanId;
    @XmlElement(name = "VlanPriority", required = true, type = Integer.class, nillable = true)
    protected Integer vlanPriority;
    @XmlElement(name = "PtpProfileType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ProfileTypeValues ptpProfileType;
    @XmlElement(name = "AnnounceRateInMsgPerSec", required = true, nillable = true)
    protected String announceRateInMsgPerSec;
    @XmlElement(name = "SyncRateInMsgPerSec", required = true, nillable = true)
    protected String syncRateInMsgPerSec;
    @XmlElement(name = "DelayRequestResponseRateInMsgPerSec", required = true, nillable = true)
    protected String delayRequestResponseRateInMsgPerSec;
    @XmlElement(name = "LeaseDurationInSec", required = true, type = Integer.class, nillable = true)
    protected Integer leaseDurationInSec;

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
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the primaryClockSource property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSources }
     *     
     */
    public ClockSources getPrimaryClockSource() {
        return primaryClockSource;
    }

    /**
     * Sets the value of the primaryClockSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSources }
     *     
     */
    public void setPrimaryClockSource(ClockSources value) {
        this.primaryClockSource = value;
    }

    /**
     * Gets the value of the gnssMode property.
     * 
     * @return
     *     possible object is
     *     {@link SyncProfileGnssModes }
     *     
     */
    public SyncProfileGnssModes getGnssMode() {
        return gnssMode;
    }

    /**
     * Sets the value of the gnssMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncProfileGnssModes }
     *     
     */
    public void setGnssMode(SyncProfileGnssModes value) {
        this.gnssMode = value;
    }

    /**
     * Gets the value of the primaryMasterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryMasterIpAddress() {
        return primaryMasterIpAddress;
    }

    /**
     * Sets the value of the primaryMasterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryMasterIpAddress(String value) {
        this.primaryMasterIpAddress = value;
    }

    /**
     * Gets the value of the primaryMasterDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimaryMasterDomain() {
        return primaryMasterDomain;
    }

    /**
     * Sets the value of the primaryMasterDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimaryMasterDomain(Integer value) {
        this.primaryMasterDomain = value;
    }

    /**
     * Gets the value of the secondaryMasterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryMasterIpAddress() {
        return secondaryMasterIpAddress;
    }

    /**
     * Sets the value of the secondaryMasterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryMasterIpAddress(String value) {
        this.secondaryMasterIpAddress = value;
    }

    /**
     * Gets the value of the secondaryMasterDomain property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondaryMasterDomain() {
        return secondaryMasterDomain;
    }

    /**
     * Sets the value of the secondaryMasterDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondaryMasterDomain(Integer value) {
        this.secondaryMasterDomain = value;
    }

    /**
     * Gets the value of the vlanEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVlanEnabled() {
        return vlanEnabled;
    }

    /**
     * Sets the value of the vlanEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVlanEnabled(Boolean value) {
        this.vlanEnabled = value;
    }

    /**
     * Gets the value of the vlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVlanId() {
        return vlanId;
    }

    /**
     * Sets the value of the vlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVlanId(Integer value) {
        this.vlanId = value;
    }

    /**
     * Gets the value of the vlanPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVlanPriority() {
        return vlanPriority;
    }

    /**
     * Sets the value of the vlanPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVlanPriority(Integer value) {
        this.vlanPriority = value;
    }

    /**
     * Gets the value of the ptpProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileTypeValues }
     *     
     */
    public ProfileTypeValues getPtpProfileType() {
        return ptpProfileType;
    }

    /**
     * Sets the value of the ptpProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileTypeValues }
     *     
     */
    public void setPtpProfileType(ProfileTypeValues value) {
        this.ptpProfileType = value;
    }

    /**
     * Gets the value of the announceRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnounceRateInMsgPerSec() {
        return announceRateInMsgPerSec;
    }

    /**
     * Sets the value of the announceRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnounceRateInMsgPerSec(String value) {
        this.announceRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the syncRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncRateInMsgPerSec() {
        return syncRateInMsgPerSec;
    }

    /**
     * Sets the value of the syncRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncRateInMsgPerSec(String value) {
        this.syncRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the delayRequestResponseRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayRequestResponseRateInMsgPerSec() {
        return delayRequestResponseRateInMsgPerSec;
    }

    /**
     * Sets the value of the delayRequestResponseRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayRequestResponseRateInMsgPerSec(String value) {
        this.delayRequestResponseRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the leaseDurationInSec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeaseDurationInSec() {
        return leaseDurationInSec;
    }

    /**
     * Sets the value of the leaseDurationInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeaseDurationInSec(Integer value) {
        this.leaseDurationInSec = value;
    }

}
