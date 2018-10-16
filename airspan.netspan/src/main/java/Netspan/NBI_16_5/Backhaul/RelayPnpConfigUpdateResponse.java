
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="RelayPnpConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "relayPnpConfigUpdateResult"
})
@XmlRootElement(name = "RelayPnpConfigUpdateResponse")
public class RelayPnpConfigUpdateResponse {

    @XmlElement(name = "RelayPnpConfigUpdateResult")
    protected NodeActionResult relayPnpConfigUpdateResult;

    /**
     * Gets the value of the relayPnpConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayPnpConfigUpdateResult() {
        return relayPnpConfigUpdateResult;
    }

    /**
     * Sets the value of the relayPnpConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayPnpConfigUpdateResult(NodeActionResult value) {
        this.relayPnpConfigUpdateResult = value;
    }

}
