
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2CommissionedPropertiesWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2CommissionedPropertiesWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WirelessMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TdmaTrafficSplit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TdmaWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TdmaGender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpTrapServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpTrapPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel1Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel2Frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredChannel1Power" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredChannel2Power" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemoteAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IPAddressMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPv4Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ipv6AddressList" type="{http://Airspan.Netspan.WebServices}ArrayOfIPv6AddressWs" minOccurs="0"/&gt;
 *         &lt;element name="SignalInformation" type="{http://Airspan.Netspan.WebServices}SignalInfoWs" minOccurs="0"/&gt;
 *         &lt;element name="BandwidthTest" type="{http://Airspan.Netspan.WebServices}BwTestWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2CommissionedPropertiesWs", propOrder = {
    "wirelessMode",
    "serialNumber",
    "ssid",
    "tdmaTrafficSplit",
    "tdmaWindow",
    "tdmaGender",
    "snmpTrapServer",
    "snmpTrapPort",
    "softwareVersion",
    "latitude",
    "longitude",
    "channelBandwidth",
    "channel1Frequency",
    "channel2Frequency",
    "configuredChannel1Power",
    "configuredChannel2Power",
    "actualPower",
    "localAntennaGain",
    "remoteAntennaGain",
    "ipAddressMode",
    "iPv4Address",
    "ipv6AddressList",
    "signalInformation",
    "bandwidthTest"
})
public class IBridge2CommissionedPropertiesWs {

    @XmlElement(name = "WirelessMode")
    protected String wirelessMode;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "Ssid")
    protected String ssid;
    @XmlElement(name = "TdmaTrafficSplit")
    protected String tdmaTrafficSplit;
    @XmlElement(name = "TdmaWindow")
    protected String tdmaWindow;
    @XmlElement(name = "TdmaGender")
    protected String tdmaGender;
    @XmlElement(name = "SnmpTrapServer")
    protected String snmpTrapServer;
    @XmlElement(name = "SnmpTrapPort")
    protected String snmpTrapPort;
    @XmlElement(name = "SoftwareVersion")
    protected String softwareVersion;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "ChannelBandwidth")
    protected String channelBandwidth;
    @XmlElement(name = "Channel1Frequency")
    protected String channel1Frequency;
    @XmlElement(name = "Channel2Frequency")
    protected String channel2Frequency;
    @XmlElement(name = "ConfiguredChannel1Power")
    protected String configuredChannel1Power;
    @XmlElement(name = "ConfiguredChannel2Power")
    protected String configuredChannel2Power;
    @XmlElement(name = "ActualPower")
    protected String actualPower;
    @XmlElementRef(name = "LocalAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> localAntennaGain;
    @XmlElementRef(name = "RemoteAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remoteAntennaGain;
    @XmlElement(name = "IPAddressMode")
    protected String ipAddressMode;
    @XmlElement(name = "IPv4Address")
    protected String iPv4Address;
    @XmlElement(name = "Ipv6AddressList")
    protected ArrayOfIPv6AddressWs ipv6AddressList;
    @XmlElement(name = "SignalInformation")
    protected SignalInfoWs signalInformation;
    @XmlElement(name = "BandwidthTest")
    protected BwTestWs bandwidthTest;

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
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsid(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the tdmaTrafficSplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdmaTrafficSplit() {
        return tdmaTrafficSplit;
    }

    /**
     * Sets the value of the tdmaTrafficSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdmaTrafficSplit(String value) {
        this.tdmaTrafficSplit = value;
    }

    /**
     * Gets the value of the tdmaWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdmaWindow() {
        return tdmaWindow;
    }

    /**
     * Sets the value of the tdmaWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdmaWindow(String value) {
        this.tdmaWindow = value;
    }

    /**
     * Gets the value of the tdmaGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdmaGender() {
        return tdmaGender;
    }

    /**
     * Sets the value of the tdmaGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdmaGender(String value) {
        this.tdmaGender = value;
    }

    /**
     * Gets the value of the snmpTrapServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpTrapServer() {
        return snmpTrapServer;
    }

    /**
     * Sets the value of the snmpTrapServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpTrapServer(String value) {
        this.snmpTrapServer = value;
    }

    /**
     * Gets the value of the snmpTrapPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpTrapPort() {
        return snmpTrapPort;
    }

    /**
     * Sets the value of the snmpTrapPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpTrapPort(String value) {
        this.snmpTrapPort = value;
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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the channelBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelBandwidth() {
        return channelBandwidth;
    }

    /**
     * Sets the value of the channelBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelBandwidth(String value) {
        this.channelBandwidth = value;
    }

    /**
     * Gets the value of the channel1Frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel1Frequency() {
        return channel1Frequency;
    }

    /**
     * Sets the value of the channel1Frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel1Frequency(String value) {
        this.channel1Frequency = value;
    }

    /**
     * Gets the value of the channel2Frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel2Frequency() {
        return channel2Frequency;
    }

    /**
     * Sets the value of the channel2Frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel2Frequency(String value) {
        this.channel2Frequency = value;
    }

    /**
     * Gets the value of the configuredChannel1Power property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredChannel1Power() {
        return configuredChannel1Power;
    }

    /**
     * Sets the value of the configuredChannel1Power property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredChannel1Power(String value) {
        this.configuredChannel1Power = value;
    }

    /**
     * Gets the value of the configuredChannel2Power property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguredChannel2Power() {
        return configuredChannel2Power;
    }

    /**
     * Sets the value of the configuredChannel2Power property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguredChannel2Power(String value) {
        this.configuredChannel2Power = value;
    }

    /**
     * Gets the value of the actualPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualPower() {
        return actualPower;
    }

    /**
     * Sets the value of the actualPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualPower(String value) {
        this.actualPower = value;
    }

    /**
     * Gets the value of the localAntennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocalAntennaGain() {
        return localAntennaGain;
    }

    /**
     * Sets the value of the localAntennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocalAntennaGain(JAXBElement<Integer> value) {
        this.localAntennaGain = value;
    }

    /**
     * Gets the value of the remoteAntennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemoteAntennaGain() {
        return remoteAntennaGain;
    }

    /**
     * Sets the value of the remoteAntennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemoteAntennaGain(JAXBElement<Integer> value) {
        this.remoteAntennaGain = value;
    }

    /**
     * Gets the value of the ipAddressMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddressMode() {
        return ipAddressMode;
    }

    /**
     * Sets the value of the ipAddressMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddressMode(String value) {
        this.ipAddressMode = value;
    }

    /**
     * Gets the value of the iPv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv4Address() {
        return iPv4Address;
    }

    /**
     * Sets the value of the iPv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPv4Address(String value) {
        this.iPv4Address = value;
    }

    /**
     * Gets the value of the ipv6AddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIPv6AddressWs }
     *     
     */
    public ArrayOfIPv6AddressWs getIpv6AddressList() {
        return ipv6AddressList;
    }

    /**
     * Sets the value of the ipv6AddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIPv6AddressWs }
     *     
     */
    public void setIpv6AddressList(ArrayOfIPv6AddressWs value) {
        this.ipv6AddressList = value;
    }

    /**
     * Gets the value of the signalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SignalInfoWs }
     *     
     */
    public SignalInfoWs getSignalInformation() {
        return signalInformation;
    }

    /**
     * Sets the value of the signalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalInfoWs }
     *     
     */
    public void setSignalInformation(SignalInfoWs value) {
        this.signalInformation = value;
    }

    /**
     * Gets the value of the bandwidthTest property.
     * 
     * @return
     *     possible object is
     *     {@link BwTestWs }
     *     
     */
    public BwTestWs getBandwidthTest() {
        return bandwidthTest;
    }

    /**
     * Sets the value of the bandwidthTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BwTestWs }
     *     
     */
    public void setBandwidthTest(BwTestWs value) {
        this.bandwidthTest = value;
    }

}
