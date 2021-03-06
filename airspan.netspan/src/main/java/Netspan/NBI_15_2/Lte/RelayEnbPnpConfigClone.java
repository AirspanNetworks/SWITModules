
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="ExistingNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}AuPnpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="RelaySnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailWs" minOccurs="0"/&gt;
 *         &lt;element name="EnbSnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailWs" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "existingNodeName",
    "pnpDetail",
    "relaySnmpDetail",
    "enbSnmpDetail",
    "relayDetail",
    "enbDetail"
})
@XmlRootElement(name = "RelayEnbPnpConfigClone")
public class RelayEnbPnpConfigClone {

    @XmlElement(name = "ExistingNodeName")
    protected String existingNodeName;
    @XmlElement(name = "PnpDetail")
    protected AuPnpDetailWs pnpDetail;
    @XmlElement(name = "RelaySnmpDetail")
    protected SnmpDetailWs relaySnmpDetail;
    @XmlElement(name = "EnbSnmpDetail")
    protected SnmpDetailWs enbSnmpDetail;
    @XmlElement(name = "RelayDetail")
    protected AuRelayDetails relayDetail;
    @XmlElement(name = "EnbDetail")
    protected AuEnbDetailWs enbDetail;

    /**
     * Gets the value of the existingNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingNodeName() {
        return existingNodeName;
    }

    /**
     * Sets the value of the existingNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingNodeName(String value) {
        this.existingNodeName = value;
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
     *     {@link SnmpDetailWs }
     *     
     */
    public SnmpDetailWs getRelaySnmpDetail() {
        return relaySnmpDetail;
    }

    /**
     * Sets the value of the relaySnmpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnmpDetailWs }
     *     
     */
    public void setRelaySnmpDetail(SnmpDetailWs value) {
        this.relaySnmpDetail = value;
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
