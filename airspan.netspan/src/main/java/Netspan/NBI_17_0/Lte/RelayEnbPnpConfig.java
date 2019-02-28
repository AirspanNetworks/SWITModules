
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayEnbPnpConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayEnbPnpConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/&gt;
 *         &lt;element name="NodeResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeProperty" minOccurs="0"/&gt;
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}AuPnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpDetail" type="{http://Airspan.Netspan.WebServices}AuPnpSnmpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}AuPnpSnmpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="RelayDetail" type="{http://Airspan.Netspan.WebServices}AuRelayDetails" minOccurs="0"/&gt;
 *         &lt;element name="EnbDetail" type="{http://Airspan.Netspan.WebServices}AuEnbDetailWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayEnbPnpConfig", propOrder = {
    "nodeResultCode",
    "nodeResultString",
    "nodeName",
    "nodeDetail",
    "pnpDetail",
    "relaySnmpDetail",
    "enbSnmpDetail",
    "relayDetail",
    "enbDetail"
})
public class RelayEnbPnpConfig {

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
    protected AuPnpDetailWs pnpDetail;
    @XmlElement(name = "RelaySnmpDetail")
    protected AuPnpSnmpDetailWs relaySnmpDetail;
    @XmlElement(name = "EnbSnmpDetail")
    protected AuPnpSnmpDetailWs enbSnmpDetail;
    @XmlElement(name = "RelayDetail")
    protected AuRelayDetails relayDetail;
    @XmlElement(name = "EnbDetail")
    protected AuEnbDetailWs enbDetail;

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
     *     {@link AuPnpDetailWs }
     *     
     */
    public AuPnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpDetailWs }
     *     
     */
    public void setPnpDetail(AuPnpDetailWs value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the relaySnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AuPnpSnmpDetailWs }
     *     
     */
    public AuPnpSnmpDetailWs getRelaySnmpDetail() {
        return relaySnmpDetail;
    }

    /**
     * Sets the value of the relaySnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpSnmpDetailWs }
     *     
     */
    public void setRelaySnmpDetail(AuPnpSnmpDetailWs value) {
        this.relaySnmpDetail = value;
    }

    /**
     * Gets the value of the enbSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AuPnpSnmpDetailWs }
     *     
     */
    public AuPnpSnmpDetailWs getEnbSnmpDetail() {
        return enbSnmpDetail;
    }

    /**
     * Sets the value of the enbSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuPnpSnmpDetailWs }
     *     
     */
    public void setEnbSnmpDetail(AuPnpSnmpDetailWs value) {
        this.enbSnmpDetail = value;
    }

    /**
     * Gets the value of the relayDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AuRelayDetails }
     *     
     */
    public AuRelayDetails getRelayDetail() {
        return relayDetail;
    }

    /**
     * Sets the value of the relayDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuRelayDetails }
     *     
     */
    public void setRelayDetail(AuRelayDetails value) {
        this.relayDetail = value;
    }

    /**
     * Gets the value of the enbDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AuEnbDetailWs }
     *     
     */
    public AuEnbDetailWs getEnbDetail() {
        return enbDetail;
    }

    /**
     * Sets the value of the enbDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuEnbDetailWs }
     *     
     */
    public void setEnbDetail(AuEnbDetailWs value) {
        this.enbDetail = value;
    }

}
