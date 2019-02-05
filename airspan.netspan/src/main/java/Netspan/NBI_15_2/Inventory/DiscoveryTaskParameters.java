
package Netspan.NBI_15_2.Inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryTaskParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}SnmpVersion" minOccurs="0"/&gt;
 *         &lt;element name="WriteCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReadCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpUsername" type="{http://Airspan.Netspan.WebServices}Snmpv3UserNames" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryTaskParameters", propOrder = {
    "name",
    "ipAddress",
    "port",
    "snmpVersion",
    "writeCommunity",
    "readCommunity",
    "snmpUsername",
    "snmpPassword"
})
public class DiscoveryTaskParameters {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElementRef(name = "SnmpVersion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SnmpVersion> snmpVersion;
    @XmlElement(name = "WriteCommunity")
    protected String writeCommunity;
    @XmlElement(name = "ReadCommunity")
    protected String readCommunity;
    @XmlElementRef(name = "SnmpUsername", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Snmpv3UserNames> snmpUsername;
    @XmlElement(name = "SnmpPassword")
    protected String snmpPassword;

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
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
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
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SnmpVersion }{@code >}
     *     
     */
    public JAXBElement<SnmpVersion> getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SnmpVersion }{@code >}
     *     
     */
    public void setSnmpVersion(JAXBElement<SnmpVersion> value) {
        this.snmpVersion = value;
    }

    /**
     * Gets the value of the writeCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriteCommunity() {
        return writeCommunity;
    }

    /**
     * Sets the value of the writeCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriteCommunity(String value) {
        this.writeCommunity = value;
    }

    /**
     * Gets the value of the readCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadCommunity() {
        return readCommunity;
    }

    /**
     * Sets the value of the readCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadCommunity(String value) {
        this.readCommunity = value;
    }

    /**
     * Gets the value of the snmpUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Snmpv3UserNames }{@code >}
     *     
     */
    public JAXBElement<Snmpv3UserNames> getSnmpUsername() {
        return snmpUsername;
    }

    /**
     * Sets the value of the snmpUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Snmpv3UserNames }{@code >}
     *     
     */
    public void setSnmpUsername(JAXBElement<Snmpv3UserNames> value) {
        this.snmpUsername = value;
    }

    /**
     * Gets the value of the snmpPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpPassword() {
        return snmpPassword;
    }

    /**
     * Sets the value of the snmpPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpPassword(String value) {
        this.snmpPassword = value;
    }

}
