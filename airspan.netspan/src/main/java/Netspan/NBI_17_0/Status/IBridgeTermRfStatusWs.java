
package Netspan.NBI_17_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermRfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermRfStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCombinedConfiguredTxPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FemStatusInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TiltStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TiltAngle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AntennaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfiguredChannels" type="{http://Airspan.Netspan.WebServices}IBridgeTermChannelProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActiveChannel" type="{http://Airspan.Netspan.WebServices}IBridgeTermActiveChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScannedChannels" type="{http://Airspan.Netspan.WebServices}IBridgeTermScannedChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RxNulling" type="{http://Airspan.Netspan.WebServices}IBridgeTermRxNulling" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermRfStatusWs", propOrder = {
    "totalCombinedConfiguredTxPower",
    "femStatus",
    "femStatusInformation",
    "tiltStatus",
    "tiltAngle",
    "antennaType",
    "configuredChannels",
    "activeChannel",
    "scannedChannels",
    "rxNulling"
})
public class IBridgeTermRfStatusWs {

    @XmlElement(name = "TotalCombinedConfiguredTxPower")
    protected String totalCombinedConfiguredTxPower;
    @XmlElement(name = "FemStatus")
    protected String femStatus;
    @XmlElement(name = "FemStatusInformation")
    protected String femStatusInformation;
    @XmlElement(name = "TiltStatus")
    protected String tiltStatus;
    @XmlElement(name = "TiltAngle")
    protected String tiltAngle;
    @XmlElement(name = "AntennaType")
    protected String antennaType;
    @XmlElement(name = "ConfiguredChannels")
    protected List<IBridgeTermChannelProfile> configuredChannels;
    @XmlElement(name = "ActiveChannel")
    protected List<IBridgeTermActiveChannel> activeChannel;
    @XmlElement(name = "ScannedChannels")
    protected List<IBridgeTermScannedChannel> scannedChannels;
    @XmlElement(name = "RxNulling")
    protected IBridgeTermRxNulling rxNulling;

    /**
     * Gets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCombinedConfiguredTxPower() {
        return totalCombinedConfiguredTxPower;
    }

    /**
     * Sets the value of the totalCombinedConfiguredTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCombinedConfiguredTxPower(String value) {
        this.totalCombinedConfiguredTxPower = value;
    }

    /**
     * Gets the value of the femStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatus() {
        return femStatus;
    }

    /**
     * Sets the value of the femStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatus(String value) {
        this.femStatus = value;
    }

    /**
     * Gets the value of the femStatusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFemStatusInformation() {
        return femStatusInformation;
    }

    /**
     * Sets the value of the femStatusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFemStatusInformation(String value) {
        this.femStatusInformation = value;
    }

    /**
     * Gets the value of the tiltStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltStatus() {
        return tiltStatus;
    }

    /**
     * Sets the value of the tiltStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltStatus(String value) {
        this.tiltStatus = value;
    }

    /**
     * Gets the value of the tiltAngle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiltAngle() {
        return tiltAngle;
    }

    /**
     * Sets the value of the tiltAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiltAngle(String value) {
        this.tiltAngle = value;
    }

    /**
     * Gets the value of the antennaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaType() {
        return antennaType;
    }

    /**
     * Sets the value of the antennaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaType(String value) {
        this.antennaType = value;
    }

    /**
     * Gets the value of the configuredChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermChannelProfile }
     * 
     * 
     */
    public List<IBridgeTermChannelProfile> getConfiguredChannels() {
        if (configuredChannels == null) {
            configuredChannels = new ArrayList<IBridgeTermChannelProfile>();
        }
        return this.configuredChannels;
    }

    /**
     * Gets the value of the activeChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermActiveChannel }
     * 
     * 
     */
    public List<IBridgeTermActiveChannel> getActiveChannel() {
        if (activeChannel == null) {
            activeChannel = new ArrayList<IBridgeTermActiveChannel>();
        }
        return this.activeChannel;
    }

    /**
     * Gets the value of the scannedChannels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scannedChannels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScannedChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IBridgeTermScannedChannel }
     * 
     * 
     */
    public List<IBridgeTermScannedChannel> getScannedChannels() {
        if (scannedChannels == null) {
            scannedChannels = new ArrayList<IBridgeTermScannedChannel>();
        }
        return this.scannedChannels;
    }

    /**
     * Gets the value of the rxNulling property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermRxNulling }
     *     
     */
    public IBridgeTermRxNulling getRxNulling() {
        return rxNulling;
    }

    /**
     * Sets the value of the rxNulling property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermRxNulling }
     *     
     */
    public void setRxNulling(IBridgeTermRxNulling value) {
        this.rxNulling = value;
    }

}
