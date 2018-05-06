
package Netspan.NBI_15_1.Backhaul;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iBridgeTermPnpConfigWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iBridgeTermPnpConfigWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IbTermPnpConfig" type="{http://Airspan.Netspan.WebServices}iBridgeTermPnpDetailWs" minOccurs="0"/>
 *         &lt;element name="IbTermConfig" type="{http://Airspan.Netspan.WebServices}IBridgeTermDetailsPnp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iBridgeTermPnpConfigWs", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "ibTermPnpConfig",
    "ibTermConfig"
})
public class IBridgeTermPnpConfigWs {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "IbTermPnpConfig")
    protected IBridgeTermPnpDetailWs ibTermPnpConfig;
    @XmlElement(name = "IbTermConfig")
    protected IBridgeTermDetailsPnp ibTermConfig;

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
     * Gets the value of the ibTermPnpConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermPnpDetailWs }
     *     
     */
    public IBridgeTermPnpDetailWs getIbTermPnpConfig() {
        return ibTermPnpConfig;
    }

    /**
     * Sets the value of the ibTermPnpConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermPnpDetailWs }
     *     
     */
    public void setIbTermPnpConfig(IBridgeTermPnpDetailWs value) {
        this.ibTermPnpConfig = value;
    }

    /**
     * Gets the value of the ibTermConfig property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeTermDetailsPnp }
     *     
     */
    public IBridgeTermDetailsPnp getIbTermConfig() {
        return ibTermConfig;
    }

    /**
     * Sets the value of the ibTermConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeTermDetailsPnp }
     *     
     */
    public void setIbTermConfig(IBridgeTermDetailsPnp value) {
        this.ibTermConfig = value;
    }

}
