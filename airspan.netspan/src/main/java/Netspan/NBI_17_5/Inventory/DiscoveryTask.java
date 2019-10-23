
package Netspan.NBI_17_5.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SnmpVersion" type="{http://Airspan.Netspan.WebServices}AgentVersionEnum"/&gt;
 *         &lt;element name="WriteCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReadCommunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IPAddressList" type="{http://Airspan.Netspan.WebServices}ArrayOfIPAddress" minOccurs="0"/&gt;
 *         &lt;element name="PortList" type="{http://Airspan.Netspan.WebServices}PortListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryTask", propOrder = {
    "name",
    "enabled",
    "snmpVersion",
    "writeCommunity",
    "readCommunity",
    "snmpUsername",
    "snmpPassword",
    "ipAddressList",
    "portList"
})
public class DiscoveryTask {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "SnmpVersion", required = true)
    @XmlSchemaType(name = "string")
    protected AgentVersionEnum snmpVersion;
    @XmlElement(name = "WriteCommunity")
    protected String writeCommunity;
    @XmlElement(name = "ReadCommunity")
    protected String readCommunity;
    @XmlElement(name = "SnmpUsername")
    protected String snmpUsername;
    @XmlElement(name = "SnmpPassword")
    protected String snmpPassword;
    @XmlElement(name = "IPAddressList")
    protected ArrayOfIPAddress ipAddressList;
    @XmlElement(name = "PortList")
    protected PortListContainer portList;

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
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the snmpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link AgentVersionEnum }
     *     
     */
    public AgentVersionEnum getSnmpVersion() {
        return snmpVersion;
    }

    /**
     * Sets the value of the snmpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentVersionEnum }
     *     
     */
    public void setSnmpVersion(AgentVersionEnum value) {
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
     *     {@link String }
     *     
     */
    public String getSnmpUsername() {
        return snmpUsername;
    }

    /**
     * Sets the value of the snmpUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpUsername(String value) {
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

    /**
     * Gets the value of the ipAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIPAddress }
     *     
     */
    public ArrayOfIPAddress getIPAddressList() {
        return ipAddressList;
    }

    /**
     * Sets the value of the ipAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIPAddress }
     *     
     */
    public void setIPAddressList(ArrayOfIPAddress value) {
        this.ipAddressList = value;
    }

    /**
     * Gets the value of the portList property.
     * 
     * @return
     *     possible object is
     *     {@link PortListContainer }
     *     
     */
    public PortListContainer getPortList() {
        return portList;
    }

    /**
     * Sets the value of the portList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortListContainer }
     *     
     */
    public void setPortList(PortListContainer value) {
        this.portList = value;
    }

}
