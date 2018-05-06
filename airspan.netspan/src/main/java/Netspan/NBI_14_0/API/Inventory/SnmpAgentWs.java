
package Netspan.NBI_14_0.API.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SnmpAgentWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SnmpAgentWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnmpIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnmpPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectionState" type="{http://Airspan.Netspan.WebServices}SnmpConnectionState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnmpAgentWs", propOrder = {
    "agentType",
    "snmpIpAddress",
    "snmpPort",
    "connectionState"
})
public class SnmpAgentWs {

    @XmlElement(name = "AgentType")
    protected String agentType;
    @XmlElement(name = "SnmpIpAddress")
    protected String snmpIpAddress;
    @XmlElement(name = "SnmpPort")
    protected int snmpPort;
    @XmlElement(name = "ConnectionState", required = true)
    @XmlSchemaType(name = "string")
    protected SnmpConnectionState connectionState;

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
     */
    public int getSnmpPort() {
        return snmpPort;
    }

    /**
     * Sets the value of the snmpPort property.
     * 
     */
    public void setSnmpPort(int value) {
        this.snmpPort = value;
    }

    /**
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpConnectionState }
     *     
     */
    public SnmpConnectionState getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpConnectionState }
     *     
     */
    public void setConnectionState(SnmpConnectionState value) {
        this.connectionState = value;
    }

}
