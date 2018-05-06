
package Netspan.NBI_15_5.Backhaul;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelayDetail" type="{http://Airspan.Netspan.WebServices}RelayDetails" minOccurs="0"/>
 *         &lt;element name="RelaySnmpDetail" type="{http://Airspan.Netspan.WebServices}SnmpDetailSetWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeName",
    "relayDetail",
    "relaySnmpDetail"
})
@XmlRootElement(name = "RelayConfigSet")
public class RelayConfigSet {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "RelayDetail")
    protected RelayDetails relayDetail;
    @XmlElement(name = "RelaySnmpDetail")
    protected SnmpDetailSetWs relaySnmpDetail;

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
     * Gets the value of the relayDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RelayDetails }
     *     
     */
    public RelayDetails getRelayDetail() {
        return relayDetail;
    }

    /**
     * Sets the value of the relayDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayDetails }
     *     
     */
    public void setRelayDetail(RelayDetails value) {
        this.relayDetail = value;
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

}
