
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}AuNodeDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="RelayDetail" type="{http://Airspan.Netspan.WebServices}AuRelayDetails" minOccurs="0"/&gt;
 *         &lt;element name="EnbDetail" type="{http://Airspan.Netspan.WebServices}AuEnbDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "nodeDetail",
    "relayDetail",
    "enbDetail",
    "relaySnmpDetail",
    "enbSnmpDetail"
})
@XmlRootElement(name = "RelayEnbConfigSet")
public class RelayEnbConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "NodeDetail")
    protected AuNodeDetailsWs nodeDetail;
    @XmlElement(name = "RelayDetail")
    protected AuRelayDetails relayDetail;
    @XmlElement(name = "EnbDetail")
    protected AuEnbDetailWs enbDetail;
    @XmlElement(name = "RelaySnmpDetail")
    protected SnmpDetailSetWs relaySnmpDetail;
    @XmlElement(name = "EnbSnmpDetail")
    protected SnmpDetailSetWs enbSnmpDetail;

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
     *     {@link AuNodeDetailsWs }
     *     
     */
    public AuNodeDetailsWs getNodeDetail() {
        return nodeDetail;
    }

    /**
     * Sets the value of the nodeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuNodeDetailsWs }
     *     
     */
    public void setNodeDetail(AuNodeDetailsWs value) {
        this.nodeDetail = value;
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

    /**
     * Gets the value of the relaySnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getRelaySnmpDetail() {
        return relaySnmpDetail;
    }

    /**
     * Sets the value of the relaySnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setRelaySnmpDetail(SnmpDetailSetWs value) {
        this.relaySnmpDetail = value;
    }

    /**
     * Gets the value of the enbSnmpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public SnmpDetailSetWs getEnbSnmpDetail() {
        return enbSnmpDetail;
    }

    /**
     * Sets the value of the enbSnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailSetWs }
     *     
     */
    public void setEnbSnmpDetail(SnmpDetailSetWs value) {
        this.enbSnmpDetail = value;
    }

}
