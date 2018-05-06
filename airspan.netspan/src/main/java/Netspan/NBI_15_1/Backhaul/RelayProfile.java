
package Netspan.NBI_15_1.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesRelay" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress1Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress2Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress3Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress4Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="NtpServerIpAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseNms4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatsGranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/>
 *         &lt;element name="NodeSshAccess" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MimoSpectralEfficiencyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DenbSinrRanking" type="{http://Airspan.Netspan.WebServices}SinrRanking"/>
 *         &lt;element name="DenbSinrThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DenbSeThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RLocationMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocationPersistancy" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="LocationAccuracyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DenbSinrHystersis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DenbSeHystersis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PeriodicReScanMode" type="{http://Airspan.Netspan.WebServices}PeriodicReScan" minOccurs="0"/>
 *         &lt;element name="PeriodicReScanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PeriodicReScanStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoBackoffScanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AutoBackoffMaxScanEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EnbReportingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="EnbReportingInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayProfile", propOrder = {
    "name",
    "hardwareCategory",
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
    "statsGranularityPeriod",
    "nodeSshAccess",
    "mimoSpectralEfficiencyThreshold",
    "denbSinrRanking",
    "denbSinrThreshold",
    "denbSeThreshold",
    "rLocationMax",
    "locationPersistancy",
    "locationAccuracyThreshold",
    "denbSinrHystersis",
    "denbSeHystersis",
    "periodicReScanMode",
    "periodicReScanPeriod",
    "periodicReScanStartDate",
    "autoBackoffScanPeriod",
    "autoBackoffMaxScanEvents",
    "enbReportingEnabled",
    "enbReportingInterval"
})
public class RelayProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesRelay> hardwareCategory;
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
    @XmlElementRef(name = "StatsGranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statsGranularityPeriod;
    @XmlElementRef(name = "NodeSshAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> nodeSshAccess;
    @XmlElementRef(name = "MimoSpectralEfficiencyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimoSpectralEfficiencyThreshold;
    @XmlElement(name = "DenbSinrRanking", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SinrRanking denbSinrRanking;
    @XmlElementRef(name = "DenbSinrThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSinrThreshold;
    @XmlElementRef(name = "DenbSeThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSeThreshold;
    @XmlElementRef(name = "RLocationMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rLocationMax;
    @XmlElementRef(name = "LocationPersistancy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> locationPersistancy;
    @XmlElementRef(name = "LocationAccuracyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationAccuracyThreshold;
    @XmlElementRef(name = "DenbSinrHystersis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSinrHystersis;
    @XmlElementRef(name = "DenbSeHystersis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> denbSeHystersis;
    @XmlElementRef(name = "PeriodicReScanMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodicReScan> periodicReScanMode;
    @XmlElementRef(name = "PeriodicReScanPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> periodicReScanPeriod;
    @XmlElement(name = "PeriodicReScanStartDate")
    protected String periodicReScanStartDate;
    @XmlElementRef(name = "AutoBackoffScanPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoBackoffScanPeriod;
    @XmlElementRef(name = "AutoBackoffMaxScanEvents", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoBackoffMaxScanEvents;
    @XmlElementRef(name = "EnbReportingEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> enbReportingEnabled;
    @XmlElementRef(name = "EnbReportingInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> enbReportingInterval;

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
     *     {@link JAXBElement }{@code <}{@link CategoriesRelay }{@code >}
     *     
     */
    public JAXBElement<CategoriesRelay> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesRelay }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesRelay> value) {
        this.hardwareCategory = value;
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
     * Gets the value of the statsGranularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatsGranularityPeriod() {
        return statsGranularityPeriod;
    }

    /**
     * Sets the value of the statsGranularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatsGranularityPeriod(JAXBElement<String> value) {
        this.statsGranularityPeriod = value;
    }

    /**
     * Gets the value of the nodeSshAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNodeSshAccess() {
        return nodeSshAccess;
    }

    /**
     * Sets the value of the nodeSshAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNodeSshAccess(JAXBElement<EnabledDisabledStates> value) {
        this.nodeSshAccess = value;
    }

    /**
     * Gets the value of the mimoSpectralEfficiencyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimoSpectralEfficiencyThreshold() {
        return mimoSpectralEfficiencyThreshold;
    }

    /**
     * Sets the value of the mimoSpectralEfficiencyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimoSpectralEfficiencyThreshold(JAXBElement<Integer> value) {
        this.mimoSpectralEfficiencyThreshold = value;
    }

    /**
     * Gets the value of the denbSinrRanking property.
     * 
     * @return
     *     possible object is
     *     {@link SinrRanking }
     *     
     */
    public SinrRanking getDenbSinrRanking() {
        return denbSinrRanking;
    }

    /**
     * Sets the value of the denbSinrRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link SinrRanking }
     *     
     */
    public void setDenbSinrRanking(SinrRanking value) {
        this.denbSinrRanking = value;
    }

    /**
     * Gets the value of the denbSinrThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSinrThreshold() {
        return denbSinrThreshold;
    }

    /**
     * Sets the value of the denbSinrThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSinrThreshold(JAXBElement<Integer> value) {
        this.denbSinrThreshold = value;
    }

    /**
     * Gets the value of the denbSeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSeThreshold() {
        return denbSeThreshold;
    }

    /**
     * Sets the value of the denbSeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSeThreshold(JAXBElement<Integer> value) {
        this.denbSeThreshold = value;
    }

    /**
     * Gets the value of the rLocationMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRLocationMax() {
        return rLocationMax;
    }

    /**
     * Sets the value of the rLocationMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRLocationMax(JAXBElement<Integer> value) {
        this.rLocationMax = value;
    }

    /**
     * Gets the value of the locationPersistancy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLocationPersistancy() {
        return locationPersistancy;
    }

    /**
     * Sets the value of the locationPersistancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLocationPersistancy(JAXBElement<EnabledDisabledStates> value) {
        this.locationPersistancy = value;
    }

    /**
     * Gets the value of the locationAccuracyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationAccuracyThreshold() {
        return locationAccuracyThreshold;
    }

    /**
     * Sets the value of the locationAccuracyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationAccuracyThreshold(JAXBElement<Integer> value) {
        this.locationAccuracyThreshold = value;
    }

    /**
     * Gets the value of the denbSinrHystersis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSinrHystersis() {
        return denbSinrHystersis;
    }

    /**
     * Sets the value of the denbSinrHystersis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSinrHystersis(JAXBElement<Integer> value) {
        this.denbSinrHystersis = value;
    }

    /**
     * Gets the value of the denbSeHystersis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDenbSeHystersis() {
        return denbSeHystersis;
    }

    /**
     * Sets the value of the denbSeHystersis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDenbSeHystersis(JAXBElement<BigDecimal> value) {
        this.denbSeHystersis = value;
    }

    /**
     * Gets the value of the periodicReScanMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}
     *     
     */
    public JAXBElement<PeriodicReScan> getPeriodicReScanMode() {
        return periodicReScanMode;
    }

    /**
     * Sets the value of the periodicReScanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}
     *     
     */
    public void setPeriodicReScanMode(JAXBElement<PeriodicReScan> value) {
        this.periodicReScanMode = value;
    }

    /**
     * Gets the value of the periodicReScanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPeriodicReScanPeriod() {
        return periodicReScanPeriod;
    }

    /**
     * Sets the value of the periodicReScanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPeriodicReScanPeriod(JAXBElement<Integer> value) {
        this.periodicReScanPeriod = value;
    }

    /**
     * Gets the value of the periodicReScanStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicReScanStartDate() {
        return periodicReScanStartDate;
    }

    /**
     * Sets the value of the periodicReScanStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicReScanStartDate(String value) {
        this.periodicReScanStartDate = value;
    }

    /**
     * Gets the value of the autoBackoffScanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoBackoffScanPeriod() {
        return autoBackoffScanPeriod;
    }

    /**
     * Sets the value of the autoBackoffScanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoBackoffScanPeriod(JAXBElement<Integer> value) {
        this.autoBackoffScanPeriod = value;
    }

    /**
     * Gets the value of the autoBackoffMaxScanEvents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoBackoffMaxScanEvents() {
        return autoBackoffMaxScanEvents;
    }

    /**
     * Sets the value of the autoBackoffMaxScanEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoBackoffMaxScanEvents(JAXBElement<Integer> value) {
        this.autoBackoffMaxScanEvents = value;
    }

    /**
     * Gets the value of the enbReportingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getEnbReportingEnabled() {
        return enbReportingEnabled;
    }

    /**
     * Sets the value of the enbReportingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setEnbReportingEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.enbReportingEnabled = value;
    }

    /**
     * Gets the value of the enbReportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEnbReportingInterval() {
        return enbReportingInterval;
    }

    /**
     * Sets the value of the enbReportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEnbReportingInterval(JAXBElement<Integer> value) {
        this.enbReportingInterval = value;
    }

}
