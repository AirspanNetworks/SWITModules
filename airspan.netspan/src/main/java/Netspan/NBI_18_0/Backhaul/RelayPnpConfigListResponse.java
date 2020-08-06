
package Netspan.NBI_18_0.Backhaul;

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
 *         &lt;element name="RelayPnpConfigListResult" type="{http://Airspan.Netspan.WebServices}NodeListResult" minOccurs="0"/&gt;
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
    "relayPnpConfigListResult"
})
@XmlRootElement(name = "RelayPnpConfigListResponse")
public class RelayPnpConfigListResponse {

    @XmlElement(name = "RelayPnpConfigListResult")
    protected NodeListResult relayPnpConfigListResult;

    /**
     * Gets the value of the relayPnpConfigListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeListResult }
     *     
     */
    public NodeListResult getRelayPnpConfigListResult() {
        return relayPnpConfigListResult;
    }

    /**
     * Sets the value of the relayPnpConfigListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeListResult }
     *     
     */
    public void setRelayPnpConfigListResult(NodeListResult value) {
        this.relayPnpConfigListResult = value;
    }

}
