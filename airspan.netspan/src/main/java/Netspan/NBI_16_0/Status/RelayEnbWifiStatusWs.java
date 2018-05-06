
package Netspan.NBI_16_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbWifiStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnbWifiStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationalStatus" type="{http://Airspan.Netspan.WebServices}OpStatusValuesWs" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioStatus2Dot4GHz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioStatus5GHz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannel2Dot4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannelBandwidth2Dot4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannelTxPower2Dot4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannel5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannelBandwidth5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActiveChannelTxPower5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WorstSeverityAlarm" type="{http://Airspan.Netspan.WebServices}AlarmSeverityValuesWs" minOccurs="0"/>
 *         &lt;element name="ManagementVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayEnbWifiStatusWs", propOrder = {
    "rfNumber",
    "statusInformation",
    "operationalStatus",
    "ipAddress",
    "firmwareVersion",
    "serialNumber",
    "radioStatus2Dot4GHz",
    "radioStatus5GHz",
    "activeChannel2Dot4",
    "activeChannelBandwidth2Dot4",
    "activeChannelTxPower2Dot4",
    "activeChannel5",
    "activeChannelBandwidth5",
    "activeChannelTxPower5",
    "worstSeverityAlarm",
    "managementVlanId"
})
public class RelayEnbWifiStatusWs {

    @XmlElement(name = "RfNumber")
    protected String rfNumber;
    @XmlElementRef(name = "StatusInformation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> statusInformation;
    @XmlElementRef(name = "OperationalStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OpStatusValuesWs> operationalStatus;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "FirmwareVersion")
    protected String firmwareVersion;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElementRef(name = "RadioStatus2Dot4GHz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioStatus2Dot4GHz;
    @XmlElementRef(name = "RadioStatus5GHz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioStatus5GHz;
    @XmlElementRef(name = "ActiveChannel2Dot4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannel2Dot4;
    @XmlElementRef(name = "ActiveChannelBandwidth2Dot4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannelBandwidth2Dot4;
    @XmlElementRef(name = "ActiveChannelTxPower2Dot4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannelTxPower2Dot4;
    @XmlElementRef(name = "ActiveChannel5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannel5;
    @XmlElementRef(name = "ActiveChannelBandwidth5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannelBandwidth5;
    @XmlElementRef(name = "ActiveChannelTxPower5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> activeChannelTxPower5;
    @XmlElementRef(name = "WorstSeverityAlarm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AlarmSeverityValuesWs> worstSeverityAlarm;
    @XmlElementRef(name = "ManagementVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> managementVlanId;

    /**
     * Gets the value of the rfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfNumber() {
        return rfNumber;
    }

    /**
     * Sets the value of the rfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfNumber(String value) {
        this.rfNumber = value;
    }

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStatusInformation(JAXBElement<Boolean> value) {
        this.statusInformation = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OpStatusValuesWs }{@code >}
     *     
     */
    public JAXBElement<OpStatusValuesWs> getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OpStatusValuesWs }{@code >}
     *     
     */
    public void setOperationalStatus(JAXBElement<OpStatusValuesWs> value) {
        this.operationalStatus = value;
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
     * Gets the value of the firmwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmwareVersion(String value) {
        this.firmwareVersion = value;
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
     * Gets the value of the radioStatus2Dot4GHz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioStatus2Dot4GHz() {
        return radioStatus2Dot4GHz;
    }

    /**
     * Sets the value of the radioStatus2Dot4GHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioStatus2Dot4GHz(JAXBElement<Integer> value) {
        this.radioStatus2Dot4GHz = value;
    }

    /**
     * Gets the value of the radioStatus5GHz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioStatus5GHz() {
        return radioStatus5GHz;
    }

    /**
     * Sets the value of the radioStatus5GHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioStatus5GHz(JAXBElement<Integer> value) {
        this.radioStatus5GHz = value;
    }

    /**
     * Gets the value of the activeChannel2Dot4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannel2Dot4() {
        return activeChannel2Dot4;
    }

    /**
     * Sets the value of the activeChannel2Dot4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannel2Dot4(JAXBElement<Integer> value) {
        this.activeChannel2Dot4 = value;
    }

    /**
     * Gets the value of the activeChannelBandwidth2Dot4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannelBandwidth2Dot4() {
        return activeChannelBandwidth2Dot4;
    }

    /**
     * Sets the value of the activeChannelBandwidth2Dot4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannelBandwidth2Dot4(JAXBElement<Integer> value) {
        this.activeChannelBandwidth2Dot4 = value;
    }

    /**
     * Gets the value of the activeChannelTxPower2Dot4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannelTxPower2Dot4() {
        return activeChannelTxPower2Dot4;
    }

    /**
     * Sets the value of the activeChannelTxPower2Dot4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannelTxPower2Dot4(JAXBElement<Integer> value) {
        this.activeChannelTxPower2Dot4 = value;
    }

    /**
     * Gets the value of the activeChannel5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannel5() {
        return activeChannel5;
    }

    /**
     * Sets the value of the activeChannel5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannel5(JAXBElement<Integer> value) {
        this.activeChannel5 = value;
    }

    /**
     * Gets the value of the activeChannelBandwidth5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannelBandwidth5() {
        return activeChannelBandwidth5;
    }

    /**
     * Sets the value of the activeChannelBandwidth5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannelBandwidth5(JAXBElement<Integer> value) {
        this.activeChannelBandwidth5 = value;
    }

    /**
     * Gets the value of the activeChannelTxPower5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getActiveChannelTxPower5() {
        return activeChannelTxPower5;
    }

    /**
     * Sets the value of the activeChannelTxPower5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setActiveChannelTxPower5(JAXBElement<Integer> value) {
        this.activeChannelTxPower5 = value;
    }

    /**
     * Gets the value of the worstSeverityAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlarmSeverityValuesWs }{@code >}
     *     
     */
    public JAXBElement<AlarmSeverityValuesWs> getWorstSeverityAlarm() {
        return worstSeverityAlarm;
    }

    /**
     * Sets the value of the worstSeverityAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlarmSeverityValuesWs }{@code >}
     *     
     */
    public void setWorstSeverityAlarm(JAXBElement<AlarmSeverityValuesWs> value) {
        this.worstSeverityAlarm = value;
    }

    /**
     * Gets the value of the managementVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getManagementVlanId() {
        return managementVlanId;
    }

    /**
     * Sets the value of the managementVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setManagementVlanId(JAXBElement<Integer> value) {
        this.managementVlanId = value;
    }

}
