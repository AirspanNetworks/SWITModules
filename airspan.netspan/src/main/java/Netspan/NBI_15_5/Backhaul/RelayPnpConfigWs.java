
package Netspan.NBI_15_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayPnpConfigWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayPnpConfigWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelayPnpConfig" type="{http://Airspan.Netspan.WebServices}RelayPnpDetailWs" minOccurs="0"/>
 *         &lt;element name="RelayConfig" type="{http://Airspan.Netspan.WebServices}RelayDetailsPnp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayPnpConfigWs", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "relayPnpConfig",
    "relayConfig"
})
public class RelayPnpConfigWs {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "RelayPnpConfig")
    protected RelayPnpDetailWs relayPnpConfig;
    @XmlElement(name = "RelayConfig")
    protected RelayDetailsPnp relayConfig;

    /**
     * Gets the value of the nodeResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getNodeResultCode() {
        return nodeResultCode;
    }

    /**
     * Sets the value of the nodeResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setNodeResultCode(NodeResultValues value) {
        this.nodeResultCode = value;
    }

    /**
     * Gets the value of the nodeResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeResultString() {
        return nodeResultString;
    }

    /**
     * Sets the value of the nodeResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeResultString(String value) {
        this.nodeResultString = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeName(String value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the relayPnpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link RelayPnpDetailWs }
     *     
     */
    public RelayPnpDetailWs getRelayPnpConfig() {
        return relayPnpConfig;
    }

    /**
     * Sets the value of the relayPnpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayPnpDetailWs }
     *     
     */
    public void setRelayPnpConfig(RelayPnpDetailWs value) {
        this.relayPnpConfig = value;
    }

    /**
     * Gets the value of the relayConfig property.
     * 
     * @return
     *     possible object is
     *     {@link RelayDetailsPnp }
     *     
     */
    public RelayDetailsPnp getRelayConfig() {
        return relayConfig;
    }

    /**
     * Sets the value of the relayConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayDetailsPnp }
     *     
     */
    public void setRelayConfig(RelayDetailsPnp value) {
        this.relayConfig = value;
    }

}
