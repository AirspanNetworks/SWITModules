
package Netspan.NBI_17_0.Lte;

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
 *         &lt;element name="RelayEnbPnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "relayEnbPnpConfigUpdateResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigUpdateResponse")
public class RelayEnbPnpConfigUpdateResponse {

    @XmlElement(name = "RelayEnbPnpConfigUpdateResult")
    protected NodeActionResult relayEnbPnpConfigUpdateResult;

    /**
     * Gets the value of the relayEnbPnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayEnbPnpConfigUpdateResult() {
        return relayEnbPnpConfigUpdateResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayEnbPnpConfigUpdateResult(NodeActionResult value) {
        this.relayEnbPnpConfigUpdateResult = value;
    }

}
