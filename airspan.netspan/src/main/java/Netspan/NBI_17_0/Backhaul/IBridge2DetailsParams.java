
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="CenterFrequency" type="{http://Airspan.Netspan.WebServices}CenterFrequencies" minOccurs="0"/&gt;
 *         &lt;element name="LocalAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelWidth" type="{http://Airspan.Netspan.WebServices}ChannelWidths" minOccurs="0"/&gt;
 *         &lt;element name="TxPower1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RemoteAntennaGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomManagementProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2ManagementParams" minOccurs="0"/&gt;
 *         &lt;element name="AlarmProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomAlarmProfileParameters" type="{http://Airspan.Netspan.WebServices}IBridge2AlarmParams" minOccurs="0"/&gt;
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
    "centerFrequency",
    "localAntennaGain",
    "channelWidth",
    "txPower1",
    "remoteAntennaGain",
    "managementProfile",
    "customManagementProfileParameters",
    "alarmProfile",
    "customAlarmProfileParameters"
})
@XmlSeeAlso({
    IBridge2DetailsPnp.class
})
public class IBridge2DetailsParams {

    @XmlElementRef(name = "CenterFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> centerFrequency;
    @XmlElementRef(name = "LocalAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> localAntennaGain;
    @XmlElementRef(name = "ChannelWidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelWidth;
    @XmlElementRef(name = "TxPower1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower1;
    @XmlElementRef(name = "RemoteAntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> remoteAntennaGain;
    @XmlElement(name = "ManagementProfile")
    protected String managementProfile;
    @XmlElement(name = "CustomManagementProfileParameters")
    protected IBridge2ManagementParams customManagementProfileParameters;
    @XmlElement(name = "AlarmProfile")
    protected String alarmProfile;
    @XmlElement(name = "CustomAlarmProfileParameters")
    protected IBridge2AlarmParams customAlarmProfileParameters;

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
     * Gets the value of the managementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementProfile() {
        return managementProfile;
    }

    /**
     * Sets the value of the managementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementProfile(String value) {
        this.managementProfile = value;
    }

    /**
     * Gets the value of the customManagementProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2ManagementParams }
     *     
     */
    public IBridge2ManagementParams getCustomManagementProfileParameters() {
        return customManagementProfileParameters;
    }

    /**
     * Sets the value of the customManagementProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2ManagementParams }
     *     
     */
    public void setCustomManagementProfileParameters(IBridge2ManagementParams value) {
        this.customManagementProfileParameters = value;
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

}
