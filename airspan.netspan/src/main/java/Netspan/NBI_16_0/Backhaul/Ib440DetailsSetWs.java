
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440DetailsSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440DetailsSetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedMode" type="{http://Airspan.Netspan.WebServices}NodeManagementModes" minOccurs="0"/&gt;
 *         &lt;element name="Site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConfigMode" type="{http://Airspan.Netspan.WebServices}ConfigNamesSet" minOccurs="0"/&gt;
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}BsIb11acBandwidthValues" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QosProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440DetailsSetWs", propOrder = {
    "name",
    "description",
    "managedMode",
    "site",
    "region",
    "configMode",
    "frequency",
    "bandwidth",
    "txPower",
    "qosProfile",
    "ntpServerIpAddress",
    "neId"
})
public class Ib440DetailsSetWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "ManagedMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NodeManagementModes> managedMode;
    @XmlElement(name = "Site")
    protected String site;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElementRef(name = "ConfigMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ConfigNamesSet> configMode;
    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower;
    @XmlElement(name = "QosProfile")
    protected String qosProfile;
    @XmlElement(name = "NtpServerIpAddress")
    protected String ntpServerIpAddress;
    @XmlElement(name = "NeId")
    protected String neId;

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
     *     {@link JAXBElement }{@code <}{@link ConfigNamesSet }{@code >}
     *     
     */
    public JAXBElement<ConfigNamesSet> getConfigMode() {
        return configMode;
    }

    /**
     * Sets the value of the configMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConfigNamesSet }{@code >}
     *     
     */
    public void setConfigMode(JAXBElement<ConfigNamesSet> value) {
        this.configMode = value;
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

}
