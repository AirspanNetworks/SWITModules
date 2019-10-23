
package Netspan.NBI_17_5.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2PnpConfigWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2PnpConfigWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/&gt;
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="IBridge2PnpConfig" type="{http://Airspan.Netspan.WebServices}IBridge2PnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="IBridge2Config" type="{http://Airspan.Netspan.WebServices}IBridge2DetailsPnp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2PnpConfigWs", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "nodeDetail",
    "iBridge2PnpConfig",
    "iBridge2Config"
})
public class IBridge2PnpConfigWs {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "IBridge2PnpConfig")
    protected IBridge2PnpDetailWs iBridge2PnpConfig;
    @XmlElement(name = "IBridge2Config")
    protected IBridge2DetailsPnp iBridge2Config;

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
     * Gets the value of the nodeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NodeProperty }
     *     
     */
    public NodeProperty getNodeDetail() {
        return nodeDetail;
    }

    /**
     * Sets the value of the nodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeProperty }
     *     
     */
    public void setNodeDetail(NodeProperty value) {
        this.nodeDetail = value;
    }

    /**
     * Gets the value of the iBridge2PnpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2PnpDetailWs }
     *     
     */
    public IBridge2PnpDetailWs getIBridge2PnpConfig() {
        return iBridge2PnpConfig;
    }

    /**
     * Sets the value of the iBridge2PnpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2PnpDetailWs }
     *     
     */
    public void setIBridge2PnpConfig(IBridge2PnpDetailWs value) {
        this.iBridge2PnpConfig = value;
    }

    /**
     * Gets the value of the iBridge2Config property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2DetailsPnp }
     *     
     */
    public IBridge2DetailsPnp getIBridge2Config() {
        return iBridge2Config;
    }

    /**
     * Sets the value of the iBridge2Config property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2DetailsPnp }
     *     
     */
    public void setIBridge2Config(IBridge2DetailsPnp value) {
        this.iBridge2Config = value;
    }

}
