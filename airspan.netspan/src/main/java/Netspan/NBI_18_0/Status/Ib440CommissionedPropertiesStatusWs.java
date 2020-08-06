
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440CommissionedPropertiesStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440CommissionedPropertiesStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FunctionalMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EthernetMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WirelessMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeerWirelessMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetspanIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrapDestinationIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NtpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WirelessMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WirelessProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultGateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GpsLatitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GpsLongitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnrAchieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RssiAchieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UlDataRateAchieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DlDataRateAchieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentInstallationDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Ib440CommissionedPropertiesStatusWs", propOrder = {
    "functionalMode",
    "serialNumber",
    "ethernetMacAddress",
    "wirelessMacAddress",
    "peerWirelessMacAddress",
    "ipAllocation",
    "ipVersion",
    "ipAddress",
    "netspanIpAddress",
    "trapDestinationIpAddress",
    "ntpIpAddress",
    "wirelessMode",
    "wirelessProtocol",
    "subnet",
    "defaultGateway",
    "softwareVersion",
    "gpsLatitude",
    "gpsLongitude",
    "frequencyBandwidth",
    "frequencyChannel",
    "txPower",
    "snrAchieved",
    "rssiAchieved",
    "ulDataRateAchieved",
    "dlDataRateAchieved",
    "equipmentInstallationDateTime",
    "jobId",
    "locationId"
})
public class Ib440CommissionedPropertiesStatusWs {

    @XmlElement(name = "FunctionalMode")
    protected String functionalMode;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "EthernetMacAddress")
    protected String ethernetMacAddress;
    @XmlElement(name = "WirelessMacAddress")
    protected String wirelessMacAddress;
    @XmlElement(name = "PeerWirelessMacAddress")
    protected String peerWirelessMacAddress;
    @XmlElement(name = "IpAllocation")
    protected String ipAllocation;
    @XmlElement(name = "IpVersion")
    protected String ipVersion;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "NetspanIpAddress")
    protected String netspanIpAddress;
    @XmlElement(name = "TrapDestinationIpAddress")
    protected String trapDestinationIpAddress;
    @XmlElement(name = "NtpIpAddress")
    protected String ntpIpAddress;
    @XmlElement(name = "WirelessMode")
    protected String wirelessMode;
    @XmlElement(name = "WirelessProtocol")
    protected String wirelessProtocol;
    @XmlElement(name = "Subnet")
    protected String subnet;
    @XmlElement(name = "DefaultGateway")
    protected String defaultGateway;
    @XmlElement(name = "SoftwareVersion")
    protected String softwareVersion;
    @XmlElement(name = "GpsLatitude")
    protected String gpsLatitude;
    @XmlElement(name = "GpsLongitude")
    protected String gpsLongitude;
    @XmlElement(name = "FrequencyBandwidth")
    protected String frequencyBandwidth;
    @XmlElement(name = "FrequencyChannel")
    protected String frequencyChannel;
    @XmlElement(name = "TxPower")
    protected String txPower;
    @XmlElement(name = "SnrAchieved")
    protected String snrAchieved;
    @XmlElement(name = "RssiAchieved")
    protected String rssiAchieved;
    @XmlElement(name = "UlDataRateAchieved")
    protected String ulDataRateAchieved;
    @XmlElement(name = "DlDataRateAchieved")
    protected String dlDataRateAchieved;
    @XmlElement(name = "EquipmentInstallationDateTime")
    protected String equipmentInstallationDateTime;
    @XmlElement(name = "JobId")
    protected String jobId;
    @XmlElement(name = "LocationId")
    protected String locationId;

    /**
     * Gets the value of the functionalMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalMode() {
        return functionalMode;
    }

    /**
     * Sets the value of the functionalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalMode(String value) {
        this.functionalMode = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the ethernetMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthernetMacAddress() {
        return ethernetMacAddress;
    }

    /**
     * Sets the value of the ethernetMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthernetMacAddress(String value) {
        this.ethernetMacAddress = value;
    }

    /**
     * Gets the value of the wirelessMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessMacAddress() {
        return wirelessMacAddress;
    }

    /**
     * Sets the value of the wirelessMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessMacAddress(String value) {
        this.wirelessMacAddress = value;
    }

    /**
     * Gets the value of the peerWirelessMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerWirelessMacAddress() {
        return peerWirelessMacAddress;
    }

    /**
     * Sets the value of the peerWirelessMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerWirelessMacAddress(String value) {
        this.peerWirelessMacAddress = value;
    }

    /**
     * Gets the value of the ipAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAllocation() {
        return ipAllocation;
    }

    /**
     * Sets the value of the ipAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAllocation(String value) {
        this.ipAllocation = value;
    }

    /**
     * Gets the value of the ipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpVersion(String value) {
        this.ipVersion = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the netspanIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetspanIpAddress() {
        return netspanIpAddress;
    }

    /**
     * Sets the value of the netspanIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetspanIpAddress(String value) {
        this.netspanIpAddress = value;
    }

    /**
     * Gets the value of the trapDestinationIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrapDestinationIpAddress() {
        return trapDestinationIpAddress;
    }

    /**
     * Sets the value of the trapDestinationIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrapDestinationIpAddress(String value) {
        this.trapDestinationIpAddress = value;
    }

    /**
     * Gets the value of the ntpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpIpAddress() {
        return ntpIpAddress;
    }

    /**
     * Sets the value of the ntpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpIpAddress(String value) {
        this.ntpIpAddress = value;
    }

    /**
     * Gets the value of the wirelessMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessMode() {
        return wirelessMode;
    }

    /**
     * Sets the value of the wirelessMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessMode(String value) {
        this.wirelessMode = value;
    }

    /**
     * Gets the value of the wirelessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirelessProtocol() {
        return wirelessProtocol;
    }

    /**
     * Sets the value of the wirelessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirelessProtocol(String value) {
        this.wirelessProtocol = value;
    }

    /**
     * Gets the value of the subnet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubnet() {
        return subnet;
    }

    /**
     * Sets the value of the subnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubnet(String value) {
        this.subnet = value;
    }

    /**
     * Gets the value of the defaultGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGateway() {
        return defaultGateway;
    }

    /**
     * Sets the value of the defaultGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGateway(String value) {
        this.defaultGateway = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the gpsLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsLatitude() {
        return gpsLatitude;
    }

    /**
     * Sets the value of the gpsLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsLatitude(String value) {
        this.gpsLatitude = value;
    }

    /**
     * Gets the value of the gpsLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsLongitude() {
        return gpsLongitude;
    }

    /**
     * Sets the value of the gpsLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsLongitude(String value) {
        this.gpsLongitude = value;
    }

    /**
     * Gets the value of the frequencyBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyBandwidth() {
        return frequencyBandwidth;
    }

    /**
     * Sets the value of the frequencyBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyBandwidth(String value) {
        this.frequencyBandwidth = value;
    }

    /**
     * Gets the value of the frequencyChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyChannel() {
        return frequencyChannel;
    }

    /**
     * Sets the value of the frequencyChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyChannel(String value) {
        this.frequencyChannel = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxPower(String value) {
        this.txPower = value;
    }

    /**
     * Gets the value of the snrAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnrAchieved() {
        return snrAchieved;
    }

    /**
     * Sets the value of the snrAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnrAchieved(String value) {
        this.snrAchieved = value;
    }

    /**
     * Gets the value of the rssiAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssiAchieved() {
        return rssiAchieved;
    }

    /**
     * Sets the value of the rssiAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssiAchieved(String value) {
        this.rssiAchieved = value;
    }

    /**
     * Gets the value of the ulDataRateAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlDataRateAchieved() {
        return ulDataRateAchieved;
    }

    /**
     * Sets the value of the ulDataRateAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlDataRateAchieved(String value) {
        this.ulDataRateAchieved = value;
    }

    /**
     * Gets the value of the dlDataRateAchieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlDataRateAchieved() {
        return dlDataRateAchieved;
    }

    /**
     * Sets the value of the dlDataRateAchieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlDataRateAchieved(String value) {
        this.dlDataRateAchieved = value;
    }

    /**
     * Gets the value of the equipmentInstallationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentInstallationDateTime() {
        return equipmentInstallationDateTime;
    }

    /**
     * Sets the value of the equipmentInstallationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentInstallationDateTime(String value) {
        this.equipmentInstallationDateTime = value;
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
