
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBasePnpConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBasePnpConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/&gt;
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="IbBasePnpConfig" type="{http://Airspan.Netspan.WebServices}iBridgeBasePnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="IbBaseConfig" type="{http://Airspan.Netspan.WebServices}IbBaseDetailsPnp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBasePnpConfig", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "nodeDetail",
    "ibBasePnpConfig",
    "ibBaseConfig"
})
public class IBridgeBasePnpConfig {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "IbBasePnpConfig")
    protected IBridgeBasePnpDetailWs ibBasePnpConfig;
    @XmlElement(name = "IbBaseConfig")
    protected IbBaseDetailsPnp ibBaseConfig;

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
     * Gets the value of the ibBasePnpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBasePnpDetailWs }
     *     
     */
    public IBridgeBasePnpDetailWs getIbBasePnpConfig() {
        return ibBasePnpConfig;
    }

    /**
     * Sets the value of the ibBasePnpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBasePnpDetailWs }
     *     
     */
    public void setIbBasePnpConfig(IBridgeBasePnpDetailWs value) {
        this.ibBasePnpConfig = value;
    }

    /**
     * Gets the value of the ibBaseConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IbBaseDetailsPnp }
     *     
     */
    public IbBaseDetailsPnp getIbBaseConfig() {
        return ibBaseConfig;
    }

    /**
     * Sets the value of the ibBaseConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbBaseDetailsPnp }
     *     
     */
    public void setIbBaseConfig(IbBaseDetailsPnp value) {
        this.ibBaseConfig = value;
    }

}
