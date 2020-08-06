
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteEnbConfigResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEnbConfigResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/&gt;
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}PnpLocationDetail" minOccurs="0"/&gt;
 *         &lt;element name="EnbConfig" type="{http://Airspan.Netspan.WebServices}EnbDetailsGet" minOccurs="0"/&gt;
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEnbConfigResult", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "nodeDetail",
    "pnpDetail",
    "enbConfig",
    "enbSnmpDetail"
})
public class LteEnbConfigResult {

    @XmlElement(name = "NodeResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeResultCode;
    @XmlElement(name = "NodeResultString")
    protected String nodeResultString;
    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected NodeProperty nodeDetail;
    @XmlElement(name = "PnpDetail")
    protected PnpLocationDetail pnpDetail;
    @XmlElement(name = "EnbConfig")
    protected EnbDetailsGet enbConfig;
    @XmlElement(name = "EnbSnmpDetail")
    protected SnmpDetailWs enbSnmpDetail;

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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PnpLocationDetail }
     *     
     */
    public PnpLocationDetail getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnpLocationDetail }
     *     
     */
    public void setPnpDetail(PnpLocationDetail value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the enbConfig property.
     * 
     * @return
     *     possible object is
     *     {@link EnbDetailsGet }
     *     
     */
    public EnbDetailsGet getEnbConfig() {
        return enbConfig;
    }

    /**
     * Sets the value of the enbConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbDetailsGet }
     *     
     */
    public void setEnbConfig(EnbDetailsGet value) {
        this.enbConfig = value;
    }

    /**
     * Gets the value of the enbSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailWs }
     *     
     */
    public SnmpDetailWs getEnbSnmpDetail() {
        return enbSnmpDetail;
    }

    /**
     * Sets the value of the enbSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailWs }
     *     
     */
    public void setEnbSnmpDetail(SnmpDetailWs value) {
        this.enbSnmpDetail = value;
    }

}
