
package Netspan.NBI_17_5.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewDeviceDetailsStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewDeviceDetailsStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalWirelessProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalDeviceMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalTdmaWindowMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalTdmaTrafficSplit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalEthernetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalFirmware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalCPUTempC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LocalMac50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalMacEther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalLastReboot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteDeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteWirelessProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteDeviceMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteTdmaWindowMs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemoteTdmaTrafficSplit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteEthernetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteFirmware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteCPUTempC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemoteMac50" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteMacEther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteLastReboot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewDeviceDetailsStatusWs", propOrder = {
    "localDeviceName",
    "localSerialNumber",
    "localIpAddress",
    "localWirelessProtocol",
    "localDeviceMode",
    "localTdmaWindowMs",
    "localTdmaTrafficSplit",
    "localEthernetStatus",
    "localFirmware",
    "localCPUTempC",
    "localMac50",
    "localMacEther",
    "localLastReboot",
    "remoteDeviceName",
    "remoteSerialNumber",
    "remoteIpAddress",
    "remoteWirelessProtocol",
    "remoteDeviceMode",
    "remoteTdmaWindowMs",
    "remoteTdmaTrafficSplit",
    "remoteEthernetStatus",
    "remoteFirmware",
    "remoteCPUTempC",
    "remoteMac50",
    "remoteMacEther",
    "remoteLastReboot"
})
public class IBridge2OverviewDeviceDetailsStatusWs {

    @XmlElement(name = "LocalDeviceName")
    protected String localDeviceName;
    @XmlElement(name = "LocalSerialNumber")
    protected String localSerialNumber;
    @XmlElement(name = "LocalIpAddress")
    protected String localIpAddress;
    @XmlElement(name = "LocalWirelessProtocol")
    protected String localWirelessProtocol;
    @XmlElement(name = "LocalDeviceMode")
    protected String localDeviceMode;
    @XmlElementRef(name = "LocalTdmaWindowMs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> localTdmaWindowMs;
    @XmlElement(name = "LocalTdmaTrafficSplit")
    protected String localTdmaTrafficSplit;
    @XmlElement(name = "LocalEthernetStatus")
    protected String localEthernetStatus;
    @XmlElement(name = "LocalFirmware")
    protected String localFirmware;
    @XmlElementRef(name = "LocalCPUTempC", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> localCPUTempC;
    @XmlElement(name = "LocalMac50")
    protected String localMac50;
    @XmlElement(name = "LocalMacEther")
    protected String localMacEther;
    @XmlElement(name = "LocalLastReboot")
    protected String localLastReboot;
    @XmlElement(name = "RemoteDeviceName")
    protected String remoteDeviceName;
    @XmlElement(name = "RemoteSerialNumber")
    protected String remoteSerialNumber;
    @XmlElement(name = "RemoteIpAddress")
    protected String remoteIpAddress;
    @XmlElement(name = "RemoteWirelessProtocol")
    protected String remoteWirelessProtocol;
    @XmlElement(name = "RemoteDeviceMode")
    protected String remoteDeviceMode;
    @XmlElementRef(name = "RemoteTdmaWindowMs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remoteTdmaWindowMs;
    @XmlElement(name = "RemoteTdmaTrafficSplit")
    protected String remoteTdmaTrafficSplit;
    @XmlElement(name = "RemoteEthernetStatus")
    protected String remoteEthernetStatus;
    @XmlElement(name = "RemoteFirmware")
    protected String remoteFirmware;
    @XmlElementRef(name = "RemoteCPUTempC", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remoteCPUTempC;
    @XmlElement(name = "RemoteMac50")
    protected String remoteMac50;
    @XmlElement(name = "RemoteMacEther")
    protected String remoteMacEther;
    @XmlElement(name = "RemoteLastReboot")
    protected String remoteLastReboot;

    /**
     * Gets the value of the localDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDeviceName() {
        return localDeviceName;
    }

    /**
     * Sets the value of the localDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDeviceName(String value) {
        this.localDeviceName = value;
    }

    /**
     * Gets the value of the localSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSerialNumber() {
        return localSerialNumber;
    }

    /**
     * Sets the value of the localSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSerialNumber(String value) {
        this.localSerialNumber = value;
    }

    /**
     * Gets the value of the localIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIpAddress() {
        return localIpAddress;
    }

    /**
     * Sets the value of the localIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIpAddress(String value) {
        this.localIpAddress = value;
    }

    /**
     * Gets the value of the localWirelessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalWirelessProtocol() {
        return localWirelessProtocol;
    }

    /**
     * Sets the value of the localWirelessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalWirelessProtocol(String value) {
        this.localWirelessProtocol = value;
    }

    /**
     * Gets the value of the localDeviceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDeviceMode() {
        return localDeviceMode;
    }

    /**
     * Sets the value of the localDeviceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDeviceMode(String value) {
        this.localDeviceMode = value;
    }

    /**
     * Gets the value of the localTdmaWindowMs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocalTdmaWindowMs() {
        return localTdmaWindowMs;
    }

    /**
     * Sets the value of the localTdmaWindowMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocalTdmaWindowMs(JAXBElement<Integer> value) {
        this.localTdmaWindowMs = value;
    }

    /**
     * Gets the value of the localTdmaTrafficSplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTdmaTrafficSplit() {
        return localTdmaTrafficSplit;
    }

    /**
     * Sets the value of the localTdmaTrafficSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTdmaTrafficSplit(String value) {
        this.localTdmaTrafficSplit = value;
    }

    /**
     * Gets the value of the localEthernetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalEthernetStatus() {
        return localEthernetStatus;
    }

    /**
     * Sets the value of the localEthernetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalEthernetStatus(String value) {
        this.localEthernetStatus = value;
    }

    /**
     * Gets the value of the localFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalFirmware() {
        return localFirmware;
    }

    /**
     * Sets the value of the localFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalFirmware(String value) {
        this.localFirmware = value;
    }

    /**
     * Gets the value of the localCPUTempC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLocalCPUTempC() {
        return localCPUTempC;
    }

    /**
     * Sets the value of the localCPUTempC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLocalCPUTempC(JAXBElement<BigDecimal> value) {
        this.localCPUTempC = value;
    }

    /**
     * Gets the value of the localMac50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalMac50() {
        return localMac50;
    }

    /**
     * Sets the value of the localMac50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalMac50(String value) {
        this.localMac50 = value;
    }

    /**
     * Gets the value of the localMacEther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalMacEther() {
        return localMacEther;
    }

    /**
     * Sets the value of the localMacEther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalMacEther(String value) {
        this.localMacEther = value;
    }

    /**
     * Gets the value of the localLastReboot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalLastReboot() {
        return localLastReboot;
    }

    /**
     * Sets the value of the localLastReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalLastReboot(String value) {
        this.localLastReboot = value;
    }

    /**
     * Gets the value of the remoteDeviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDeviceName() {
        return remoteDeviceName;
    }

    /**
     * Sets the value of the remoteDeviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDeviceName(String value) {
        this.remoteDeviceName = value;
    }

    /**
     * Gets the value of the remoteSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSerialNumber() {
        return remoteSerialNumber;
    }

    /**
     * Sets the value of the remoteSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSerialNumber(String value) {
        this.remoteSerialNumber = value;
    }

    /**
     * Gets the value of the remoteIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIpAddress() {
        return remoteIpAddress;
    }

    /**
     * Sets the value of the remoteIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIpAddress(String value) {
        this.remoteIpAddress = value;
    }

    /**
     * Gets the value of the remoteWirelessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteWirelessProtocol() {
        return remoteWirelessProtocol;
    }

    /**
     * Sets the value of the remoteWirelessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteWirelessProtocol(String value) {
        this.remoteWirelessProtocol = value;
    }

    /**
     * Gets the value of the remoteDeviceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDeviceMode() {
        return remoteDeviceMode;
    }

    /**
     * Sets the value of the remoteDeviceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDeviceMode(String value) {
        this.remoteDeviceMode = value;
    }

    /**
     * Gets the value of the remoteTdmaWindowMs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemoteTdmaWindowMs() {
        return remoteTdmaWindowMs;
    }

    /**
     * Sets the value of the remoteTdmaWindowMs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemoteTdmaWindowMs(JAXBElement<Integer> value) {
        this.remoteTdmaWindowMs = value;
    }

    /**
     * Gets the value of the remoteTdmaTrafficSplit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTdmaTrafficSplit() {
        return remoteTdmaTrafficSplit;
    }

    /**
     * Sets the value of the remoteTdmaTrafficSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTdmaTrafficSplit(String value) {
        this.remoteTdmaTrafficSplit = value;
    }

    /**
     * Gets the value of the remoteEthernetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteEthernetStatus() {
        return remoteEthernetStatus;
    }

    /**
     * Sets the value of the remoteEthernetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteEthernetStatus(String value) {
        this.remoteEthernetStatus = value;
    }

    /**
     * Gets the value of the remoteFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteFirmware() {
        return remoteFirmware;
    }

    /**
     * Sets the value of the remoteFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteFirmware(String value) {
        this.remoteFirmware = value;
    }

    /**
     * Gets the value of the remoteCPUTempC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRemoteCPUTempC() {
        return remoteCPUTempC;
    }

    /**
     * Sets the value of the remoteCPUTempC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRemoteCPUTempC(JAXBElement<Integer> value) {
        this.remoteCPUTempC = value;
    }

    /**
     * Gets the value of the remoteMac50 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteMac50() {
        return remoteMac50;
    }

    /**
     * Sets the value of the remoteMac50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteMac50(String value) {
        this.remoteMac50 = value;
    }

    /**
     * Gets the value of the remoteMacEther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteMacEther() {
        return remoteMacEther;
    }

    /**
     * Sets the value of the remoteMacEther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteMacEther(String value) {
        this.remoteMacEther = value;
    }

    /**
     * Gets the value of the remoteLastReboot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteLastReboot() {
        return remoteLastReboot;
    }

    /**
     * Sets the value of the remoteLastReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteLastReboot(String value) {
        this.remoteLastReboot = value;
    }

}
