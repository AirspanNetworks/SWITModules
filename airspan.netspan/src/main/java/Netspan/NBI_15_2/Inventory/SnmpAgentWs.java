
package Netspan.NBI_15_2.Inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnmpAgentWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnmpAgentWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionState" type="{http://Airspan.Netspan.WebServices}SnmpConnectionState" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualOperationalStatus" type="{http://Airspan.Netspan.WebServices}OperationalStatusValues" minOccurs="0"/&gt;
 *         &lt;element name="RequestedOperationalStatus" type="{http://Airspan.Netspan.WebServices}OperationalStatusValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnmpAgentWs", propOrder = {
    "agentType",
    "snmpIpAddress",
    "snmpPort",
    "connectionState",
    "softwareVersion",
    "actualOperationalStatus",
    "requestedOperationalStatus"
})
public class SnmpAgentWs {

    @XmlElement(name = "AgentType")
    protected String agentType;
    @XmlElement(name = "SnmpIpAddress")
    protected String snmpIpAddress;
    @XmlElementRef(name = "SnmpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snmpPort;
    @XmlElementRef(name = "ConnectionState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SnmpConnectionState> connectionState;
    @XmlElement(name = "SoftwareVersion")
    protected String softwareVersion;
    @XmlElementRef(name = "ActualOperationalStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OperationalStatusValues> actualOperationalStatus;
    @XmlElementRef(name = "RequestedOperationalStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OperationalStatusValues> requestedOperationalStatus;

    /**
     * Gets the value of the agentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentType() {
        return agentType;
    }

    /**
     * Sets the value of the agentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentType(String value) {
        this.agentType = value;
    }

    /**
     * Gets the value of the snmpIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnmpIpAddress() {
        return snmpIpAddress;
    }

    /**
     * Sets the value of the snmpIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnmpIpAddress(String value) {
        this.snmpIpAddress = value;
    }

    /**
     * Gets the value of the snmpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSnmpPort() {
        return snmpPort;
    }

    /**
     * Sets the value of the snmpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSnmpPort(JAXBElement<Integer> value) {
        this.snmpPort = value;
    }

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SnmpConnectionState }{@code >}
     *     
     */
    public JAXBElement<SnmpConnectionState> getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SnmpConnectionState }{@code >}
     *     
     */
    public void setConnectionState(JAXBElement<SnmpConnectionState> value) {
        this.connectionState = value;
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
     * Gets the value of the actualOperationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public JAXBElement<OperationalStatusValues> getActualOperationalStatus() {
        return actualOperationalStatus;
    }

    /**
     * Sets the value of the actualOperationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public void setActualOperationalStatus(JAXBElement<OperationalStatusValues> value) {
        this.actualOperationalStatus = value;
    }

    /**
     * Gets the value of the requestedOperationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public JAXBElement<OperationalStatusValues> getRequestedOperationalStatus() {
        return requestedOperationalStatus;
    }

    /**
     * Sets the value of the requestedOperationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationalStatusValues }{@code >}
     *     
     */
    public void setRequestedOperationalStatus(JAXBElement<OperationalStatusValues> value) {
        this.requestedOperationalStatus = value;
    }

}
