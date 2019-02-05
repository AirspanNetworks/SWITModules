
package Netspan.NBI_15_2.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayConnectedDevicesWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayConnectedDevicesWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceType" type="{http://Airspan.Netspan.WebServices}AccessDeviceTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionStatus" type="{http://Airspan.Netspan.WebServices}ConnectionStatusStates" minOccurs="0"/&gt;
 *         &lt;element name="ApnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorClassId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LeaseTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayConnectedDevicesWs", propOrder = {
    "deviceType",
    "connectionStatus",
    "apnName",
    "macAddress",
    "ipAddress",
    "vendorClassId",
    "leaseTime"
})
public class RelayConnectedDevicesWs {

    @XmlElementRef(name = "DeviceType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessDeviceTypesWs> deviceType;
    @XmlElementRef(name = "ConnectionStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ConnectionStatusStates> connectionStatus;
    @XmlElement(name = "ApnName")
    protected String apnName;
    @XmlElement(name = "MacAddress")
    protected String macAddress;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "VendorClassId")
    protected String vendorClassId;
    @XmlElementRef(name = "LeaseTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> leaseTime;

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypesWs }{@code >}
     *     
     */
    public JAXBElement<AccessDeviceTypesWs> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypesWs }{@code >}
     *     
     */
    public void setDeviceType(JAXBElement<AccessDeviceTypesWs> value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the connectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConnectionStatusStates }{@code >}
     *     
     */
    public JAXBElement<ConnectionStatusStates> getConnectionStatus() {
        return connectionStatus;
    }

    /**
     * Sets the value of the connectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConnectionStatusStates }{@code >}
     *     
     */
    public void setConnectionStatus(JAXBElement<ConnectionStatusStates> value) {
        this.connectionStatus = value;
    }

    /**
     * Gets the value of the apnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApnName() {
        return apnName;
    }

    /**
     * Sets the value of the apnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApnName(String value) {
        this.apnName = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
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
     * Gets the value of the vendorClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorClassId() {
        return vendorClassId;
    }

    /**
     * Sets the value of the vendorClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorClassId(String value) {
        this.vendorClassId = value;
    }

    /**
     * Gets the value of the leaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLeaseTime() {
        return leaseTime;
    }

    /**
     * Sets the value of the leaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLeaseTime(JAXBElement<Integer> value) {
        this.leaseTime = value;
    }

}
