
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440DetailsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440DetailsGet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hardware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModes" minOccurs="0"/&gt;
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfigMode" type="{http://Airspan.Netspan.WebServices}ConfigNames" minOccurs="0"/&gt;
 *         &lt;element name="MediumAccessMethod" type="{http://Airspan.Netspan.WebServices}WirelessProtocolTypes" minOccurs="0"/&gt;
 *         &lt;element name="WirelessProtocol" type="{http://Airspan.Netspan.WebServices}BandValues" minOccurs="0"/&gt;
 *         &lt;element name="HtSupportedMcs" type="{http://Airspan.Netspan.WebServices}HtSupportedMcsTypes" minOccurs="0"/&gt;
 *         &lt;element name="VhtSupportedMcs" type="{http://Airspan.Netspan.WebServices}VhtSupportedMcsTypes" minOccurs="0"/&gt;
 *         &lt;element name="CellRadiusRange" type="{http://Airspan.Netspan.WebServices}CellRadiusRanges" minOccurs="0"/&gt;
 *         &lt;element name="GuardInterval" type="{http://Airspan.Netspan.WebServices}GuardIntervalTypes" minOccurs="0"/&gt;
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}BsIb11acBandwidthValues" minOccurs="0"/&gt;
 *         &lt;element name="QosProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440DetailsGet", propOrder = {
    "name",
    "hardware",
    "description",
    "managedMode",
    "site",
    "region",
    "configMode",
    "mediumAccessMethod",
    "wirelessProtocol",
    "htSupportedMcs",
    "vhtSupportedMcs",
    "cellRadiusRange",
    "guardInterval",
    "frequency",
    "bandwidth",
    "qosProfile",
    "txPower",
    "ntpServerIpAddress",
    "neId",
    "jobId",
    "locationId"
})
public class Ib440DetailsGet {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Hardware")
    protected String hardware;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "ManagedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeManagementModes> managedMode;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElementRef(name = "ConfigMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ConfigNames> configMode;
    @XmlElementRef(name = "MediumAccessMethod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<WirelessProtocolTypes> mediumAccessMethod;
    @XmlElementRef(name = "WirelessProtocol", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wirelessProtocol;
    @XmlElementRef(name = "HtSupportedMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HtSupportedMcsTypes> htSupportedMcs;
    @XmlElementRef(name = "VhtSupportedMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VhtSupportedMcsTypes> vhtSupportedMcs;
    @XmlElementRef(name = "CellRadiusRange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CellRadiusRanges> cellRadiusRange;
    @XmlElementRef(name = "GuardInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GuardIntervalTypes> guardInterval;
    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElement(name = "QosProfile")
    protected String qosProfile;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower;
    @XmlElement(name = "NtpServerIpAddress")
    protected String ntpServerIpAddress;
    @XmlElement(name = "NeId")
    protected String neId;
    @XmlElement(name = "JobId")
    protected String jobId;
    @XmlElement(name = "LocationId")
    protected String locationId;

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
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardware(String value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the managedMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public JAXBElement<NodeManagementModes> getManagedMode() {
        return managedMode;
    }

    /**
     * Sets the value of the managedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}
     *     
     */
    public void setManagedMode(JAXBElement<NodeManagementModes> value) {
        this.managedMode = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the configMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConfigNames }{@code >}
     *     
     */
    public JAXBElement<ConfigNames> getConfigMode() {
        return configMode;
    }

    /**
     * Sets the value of the configMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConfigNames }{@code >}
     *     
     */
    public void setConfigMode(JAXBElement<ConfigNames> value) {
        this.configMode = value;
    }

    /**
     * Gets the value of the mediumAccessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WirelessProtocolTypes }{@code >}
     *     
     */
    public JAXBElement<WirelessProtocolTypes> getMediumAccessMethod() {
        return mediumAccessMethod;
    }

    /**
     * Sets the value of the mediumAccessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WirelessProtocolTypes }{@code >}
     *     
     */
    public void setMediumAccessMethod(JAXBElement<WirelessProtocolTypes> value) {
        this.mediumAccessMethod = value;
    }

    /**
     * Gets the value of the wirelessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWirelessProtocol() {
        return wirelessProtocol;
    }

    /**
     * Sets the value of the wirelessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWirelessProtocol(JAXBElement<String> value) {
        this.wirelessProtocol = value;
    }

    /**
     * Gets the value of the htSupportedMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HtSupportedMcsTypes }{@code >}
     *     
     */
    public JAXBElement<HtSupportedMcsTypes> getHtSupportedMcs() {
        return htSupportedMcs;
    }

    /**
     * Sets the value of the htSupportedMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HtSupportedMcsTypes }{@code >}
     *     
     */
    public void setHtSupportedMcs(JAXBElement<HtSupportedMcsTypes> value) {
        this.htSupportedMcs = value;
    }

    /**
     * Gets the value of the vhtSupportedMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VhtSupportedMcsTypes }{@code >}
     *     
     */
    public JAXBElement<VhtSupportedMcsTypes> getVhtSupportedMcs() {
        return vhtSupportedMcs;
    }

    /**
     * Sets the value of the vhtSupportedMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VhtSupportedMcsTypes }{@code >}
     *     
     */
    public void setVhtSupportedMcs(JAXBElement<VhtSupportedMcsTypes> value) {
        this.vhtSupportedMcs = value;
    }

    /**
     * Gets the value of the cellRadiusRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellRadiusRanges }{@code >}
     *     
     */
    public JAXBElement<CellRadiusRanges> getCellRadiusRange() {
        return cellRadiusRange;
    }

    /**
     * Sets the value of the cellRadiusRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellRadiusRanges }{@code >}
     *     
     */
    public void setCellRadiusRange(JAXBElement<CellRadiusRanges> value) {
        this.cellRadiusRange = value;
    }

    /**
     * Gets the value of the guardInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GuardIntervalTypes }{@code >}
     *     
     */
    public JAXBElement<GuardIntervalTypes> getGuardInterval() {
        return guardInterval;
    }

    /**
     * Sets the value of the guardInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GuardIntervalTypes }{@code >}
     *     
     */
    public void setGuardInterval(JAXBElement<GuardIntervalTypes> value) {
        this.guardInterval = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<Integer> value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBandwidth(JAXBElement<String> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the qosProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQosProfile() {
        return qosProfile;
    }

    /**
     * Sets the value of the qosProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQosProfile(String value) {
        this.qosProfile = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPower(JAXBElement<Integer> value) {
        this.txPower = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress() {
        return ntpServerIpAddress;
    }

    /**
     * Sets the value of the ntpServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress(String value) {
        this.ntpServerIpAddress = value;
    }

    /**
     * Gets the value of the neId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeId() {
        return neId;
    }

    /**
     * Sets the value of the neId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeId(String value) {
        this.neId = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

}
