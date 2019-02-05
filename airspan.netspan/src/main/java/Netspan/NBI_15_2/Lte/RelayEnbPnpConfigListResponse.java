
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
 *         &lt;element name="RelayEnbPnpConfigListResult" type="{http://Airspan.Netspan.WebServices}NodeListResult" minOccurs="0"/&gt;
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
    "relayEnbPnpConfigListResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigListResponse")
public class RelayEnbPnpConfigListResponse {

    @XmlElement(name = "RelayEnbPnpConfigListResult")
    protected NodeListResult relayEnbPnpConfigListResult;

    /**
     * Gets the value of the relayEnbPnpConfigListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeListResult }
     *     
     */
    public NodeListResult getRelayEnbPnpConfigListResult() {
        return relayEnbPnpConfigListResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeListResult }
     *     
     */
    public void setRelayEnbPnpConfigListResult(NodeListResult value) {
        this.relayEnbPnpConfigListResult = value;
    }

}
