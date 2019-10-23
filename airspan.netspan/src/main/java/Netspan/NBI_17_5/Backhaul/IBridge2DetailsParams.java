
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2DetailsParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2DetailsParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://Airspan.Netspan.WebServices}DeviceModes" minOccurs="0"/&gt;
 *         &lt;element name="WirelessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EthernetEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumChannelWidth" type="{http://Airspan.Netspan.WebServices}MaxChannelWidths" minOccurs="0"/&gt;
 *         &lt;element name="ChannelWidth" type="{http://Airspan.Netspan.WebServices}ChannelWidths" minOccurs="0"/&gt;
 *         &lt;element name="ChannelModes" type="{http://Airspan.Netspan.WebServices}ArrayOfChannelMode" minOccurs="0"/&gt;
 *         &lt;element name="CenterFrequency" type="{http://Airspan.Netspan.WebServices}CenterFrequencies" minOccurs="0"/&gt;
 *         &lt;element name="CenterFrequency2" type="{http://Airspan.Netspan.WebServices}CenterFrequencies" minOccurs="0"/&gt;
 *         &lt;element name="BaseAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TermAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPowerMode" type="{http://Airspan.Netspan.WebServices}AutoPowerModes" minOccurs="0"/&gt;
 *         &lt;element name="TxPower1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPower2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BaseManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomBaseManagementProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2BaseManagementParams" minOccurs="0"/&gt;
 *         &lt;element name="TermManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomTermManagementProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2TermManagementParams" minOccurs="0"/&gt;
 *         &lt;element name="AlarmProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomAlarmProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2AlarmParams" minOccurs="0"/&gt;
 *         &lt;element name="QosProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomQosProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2QosParams" minOccurs="0"/&gt;
 *         &lt;element name="EthernetPortSpeed" type="{http://Airspan.Netspan.WebServices}PortSpeeds" minOccurs="0"/&gt;
 *         &lt;element name="AutoNegotiationMode" type="{http://Airspan.Netspan.WebServices}AutoNegMode" minOccurs="0"/&gt;
 *         &lt;element name="Ssid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecoverySSIDEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2DetailsParams", propOrder = {
    "role",
    "wirelessEnabled",
    "ethernetEnabled",
    "autoChannel",
    "maximumChannelWidth",
    "channelWidth",
    "channelModes",
    "centerFrequency",
    "centerFrequency2",
    "baseAntennaGain",
    "termAntennaGain",
    "autoPowerMode",
    "txPower1",
    "txPower2",
    "baseManagementProfile",
    "customBaseManagementProfileParameters",
    "termManagementProfile",
    "customTermManagementProfileParameters",
    "alarmProfile",
    "customAlarmProfileParameters",
    "qosProfile",
    "customQosProfileParameters",
    "ethernetPortSpeed",
    "autoNegotiationMode",
    "ssid",
    "recoverySSIDEnabled"
})
@XmlSeeAlso({
    IBridge2DetailsPnp.class
})
public class IBridge2DetailsParams {

    @XmlElementRef(name = "Role", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DeviceModes> role;
    @XmlElementRef(name = "WirelessEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wirelessEnabled;
    @XmlElementRef(name = "EthernetEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ethernetEnabled;
    @XmlElementRef(name = "AutoChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoChannel;
    @XmlElementRef(name = "MaximumChannelWidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maximumChannelWidth;
    @XmlElementRef(name = "ChannelWidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelWidth;
    @XmlElement(name = "ChannelModes")
    protected ArrayOfChannelMode channelModes;
    @XmlElementRef(name = "CenterFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centerFrequency;
    @XmlElementRef(name = "CenterFrequency2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centerFrequency2;
    @XmlElementRef(name = "BaseAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> baseAntennaGain;
    @XmlElementRef(name = "TermAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> termAntennaGain;
    @XmlElementRef(name = "AutoPowerMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoPowerModes> autoPowerMode;
    @XmlElementRef(name = "TxPower1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower1;
    @XmlElementRef(name = "TxPower2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower2;
    @XmlElement(name = "BaseManagementProfile")
    protected String baseManagementProfile;
    @XmlElement(name = "CustomBaseManagementProfileParameters")
    protected IBridge2BaseManagementParams customBaseManagementProfileParameters;
    @XmlElement(name = "TermManagementProfile")
    protected String termManagementProfile;
    @XmlElement(name = "CustomTermManagementProfileParameters")
    protected IBridge2TermManagementParams customTermManagementProfileParameters;
    @XmlElement(name = "AlarmProfile")
    protected String alarmProfile;
    @XmlElement(name = "CustomAlarmProfileParameters")
    protected IBridge2AlarmParams customAlarmProfileParameters;
    @XmlElement(name = "QosProfile")
    protected String qosProfile;
    @XmlElement(name = "CustomQosProfileParameters")
    protected IBridge2QosParams customQosProfileParameters;
    @XmlElementRef(name = "EthernetPortSpeed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ethernetPortSpeed;
    @XmlElementRef(name = "AutoNegotiationMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoNegMode> autoNegotiationMode;
    @XmlElement(name = "Ssid")
    protected String ssid;
    @XmlElementRef(name = "RecoverySSIDEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> recoverySSIDEnabled;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeviceModes }{@code >}
     *     
     */
    public JAXBElement<DeviceModes> getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeviceModes }{@code >}
     *     
     */
    public void setRole(JAXBElement<DeviceModes> value) {
        this.role = value;
    }

    /**
     * Gets the value of the wirelessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWirelessEnabled() {
        return wirelessEnabled;
    }

    /**
     * Sets the value of the wirelessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWirelessEnabled(JAXBElement<Boolean> value) {
        this.wirelessEnabled = value;
    }

    /**
     * Gets the value of the ethernetEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEthernetEnabled() {
        return ethernetEnabled;
    }

    /**
     * Sets the value of the ethernetEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEthernetEnabled(JAXBElement<Boolean> value) {
        this.ethernetEnabled = value;
    }

    /**
     * Gets the value of the autoChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoChannel() {
        return autoChannel;
    }

    /**
     * Sets the value of the autoChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoChannel(JAXBElement<Boolean> value) {
        this.autoChannel = value;
    }

    /**
     * Gets the value of the maximumChannelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaximumChannelWidth() {
        return maximumChannelWidth;
    }

    /**
     * Sets the value of the maximumChannelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaximumChannelWidth(JAXBElement<String> value) {
        this.maximumChannelWidth = value;
    }

    /**
     * Gets the value of the channelWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelWidth() {
        return channelWidth;
    }

    /**
     * Sets the value of the channelWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelWidth(JAXBElement<String> value) {
        this.channelWidth = value;
    }

    /**
     * Gets the value of the channelModes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChannelMode }
     *     
     */
    public ArrayOfChannelMode getChannelModes() {
        return channelModes;
    }

    /**
     * Sets the value of the channelModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChannelMode }
     *     
     */
    public void setChannelModes(ArrayOfChannelMode value) {
        this.channelModes = value;
    }

    /**
     * Gets the value of the centerFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCenterFrequency() {
        return centerFrequency;
    }

    /**
     * Sets the value of the centerFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCenterFrequency(JAXBElement<String> value) {
        this.centerFrequency = value;
    }

    /**
     * Gets the value of the centerFrequency2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCenterFrequency2() {
        return centerFrequency2;
    }

    /**
     * Sets the value of the centerFrequency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCenterFrequency2(JAXBElement<String> value) {
        this.centerFrequency2 = value;
    }

    /**
     * Gets the value of the baseAntennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBaseAntennaGain() {
        return baseAntennaGain;
    }

    /**
     * Sets the value of the baseAntennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBaseAntennaGain(JAXBElement<Integer> value) {
        this.baseAntennaGain = value;
    }

    /**
     * Gets the value of the termAntennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTermAntennaGain() {
        return termAntennaGain;
    }

    /**
     * Sets the value of the termAntennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTermAntennaGain(JAXBElement<Integer> value) {
        this.termAntennaGain = value;
    }

    /**
     * Gets the value of the autoPowerMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoPowerModes }{@code >}
     *     
     */
    public JAXBElement<AutoPowerModes> getAutoPowerMode() {
        return autoPowerMode;
    }

    /**
     * Sets the value of the autoPowerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoPowerModes }{@code >}
     *     
     */
    public void setAutoPowerMode(JAXBElement<AutoPowerModes> value) {
        this.autoPowerMode = value;
    }

    /**
     * Gets the value of the txPower1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPower1() {
        return txPower1;
    }

    /**
     * Sets the value of the txPower1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPower1(JAXBElement<Integer> value) {
        this.txPower1 = value;
    }

    /**
     * Gets the value of the txPower2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPower2() {
        return txPower2;
    }

    /**
     * Sets the value of the txPower2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPower2(JAXBElement<Integer> value) {
        this.txPower2 = value;
    }

    /**
     * Gets the value of the baseManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseManagementProfile() {
        return baseManagementProfile;
    }

    /**
     * Sets the value of the baseManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseManagementProfile(String value) {
        this.baseManagementProfile = value;
    }

    /**
     * Gets the value of the customBaseManagementProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2BaseManagementParams }
     *     
     */
    public IBridge2BaseManagementParams getCustomBaseManagementProfileParameters() {
        return customBaseManagementProfileParameters;
    }

    /**
     * Sets the value of the customBaseManagementProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2BaseManagementParams }
     *     
     */
    public void setCustomBaseManagementProfileParameters(IBridge2BaseManagementParams value) {
        this.customBaseManagementProfileParameters = value;
    }

    /**
     * Gets the value of the termManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermManagementProfile() {
        return termManagementProfile;
    }

    /**
     * Sets the value of the termManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermManagementProfile(String value) {
        this.termManagementProfile = value;
    }

    /**
     * Gets the value of the customTermManagementProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2TermManagementParams }
     *     
     */
    public IBridge2TermManagementParams getCustomTermManagementProfileParameters() {
        return customTermManagementProfileParameters;
    }

    /**
     * Sets the value of the customTermManagementProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2TermManagementParams }
     *     
     */
    public void setCustomTermManagementProfileParameters(IBridge2TermManagementParams value) {
        this.customTermManagementProfileParameters = value;
    }

    /**
     * Gets the value of the alarmProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarmProfile() {
        return alarmProfile;
    }

    /**
     * Sets the value of the alarmProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarmProfile(String value) {
        this.alarmProfile = value;
    }

    /**
     * Gets the value of the customAlarmProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2AlarmParams }
     *     
     */
    public IBridge2AlarmParams getCustomAlarmProfileParameters() {
        return customAlarmProfileParameters;
    }

    /**
     * Sets the value of the customAlarmProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2AlarmParams }
     *     
     */
    public void setCustomAlarmProfileParameters(IBridge2AlarmParams value) {
        this.customAlarmProfileParameters = value;
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
     * Gets the value of the customQosProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2QosParams }
     *     
     */
    public IBridge2QosParams getCustomQosProfileParameters() {
        return customQosProfileParameters;
    }

    /**
     * Sets the value of the customQosProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2QosParams }
     *     
     */
    public void setCustomQosProfileParameters(IBridge2QosParams value) {
        this.customQosProfileParameters = value;
    }

    /**
     * Gets the value of the ethernetPortSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEthernetPortSpeed() {
        return ethernetPortSpeed;
    }

    /**
     * Sets the value of the ethernetPortSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEthernetPortSpeed(JAXBElement<String> value) {
        this.ethernetPortSpeed = value;
    }

    /**
     * Gets the value of the autoNegotiationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoNegMode }{@code >}
     *     
     */
    public JAXBElement<AutoNegMode> getAutoNegotiationMode() {
        return autoNegotiationMode;
    }

    /**
     * Sets the value of the autoNegotiationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoNegMode }{@code >}
     *     
     */
    public void setAutoNegotiationMode(JAXBElement<AutoNegMode> value) {
        this.autoNegotiationMode = value;
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
     * Gets the value of the recoverySSIDEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRecoverySSIDEnabled() {
        return recoverySSIDEnabled;
    }

    /**
     * Sets the value of the recoverySSIDEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRecoverySSIDEnabled(JAXBElement<Boolean> value) {
        this.recoverySSIDEnabled = value;
    }

}
