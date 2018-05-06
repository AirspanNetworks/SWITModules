
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
 *         &lt;element name="PnpDetail" type="{http://Airspan.Netspan.WebServices}RelayPnpDetailWs" minOccurs="0"/>
 *         &lt;element name="RelayDetail" type="{http://Airspan.Netspan.WebServices}RelayDetailsPnp" minOccurs="0"/>
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
    "pnpDetail",
    "relayDetail"
})
@XmlRootElement(name = "RelayPnpConfigUpdate")
public class RelayPnpConfigUpdate {

    @XmlElement(name = "NodeName")
    protected String nodeName;
    @XmlElement(name = "PnpDetail")
    protected RelayPnpDetailWs pnpDetail;
    @XmlElement(name = "RelayDetail")
    protected RelayDetailsPnp relayDetail;

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
     * Gets the value of the pnpDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RelayPnpDetailWs }
     *     
     */
    public RelayPnpDetailWs getPnpDetail() {
        return pnpDetail;
    }

    /**
     * Sets the value of the pnpDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayPnpDetailWs }
     *     
     */
    public void setPnpDetail(RelayPnpDetailWs value) {
        this.pnpDetail = value;
    }

    /**
     * Gets the value of the relayDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RelayDetailsPnp }
     *     
     */
    public RelayDetailsPnp getRelayDetail() {
        return relayDetail;
    }

    /**
     * Sets the value of the relayDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayDetailsPnp }
     *     
     */
    public void setRelayDetail(RelayDetailsPnp value) {
        this.relayDetail = value;
    }

}
