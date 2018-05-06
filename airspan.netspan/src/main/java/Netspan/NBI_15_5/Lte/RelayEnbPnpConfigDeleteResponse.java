
package Netspan.NBI_15_5.Lte;

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
 *         &lt;element name="RelayEnbPnpConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "relayEnbPnpConfigDeleteResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigDeleteResponse")
public class RelayEnbPnpConfigDeleteResponse {

    @XmlElement(name = "RelayEnbPnpConfigDeleteResult")
    protected NodeActionResult relayEnbPnpConfigDeleteResult;

    /**
     * Gets the value of the relayEnbPnpConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayEnbPnpConfigDeleteResult() {
        return relayEnbPnpConfigDeleteResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayEnbPnpConfigDeleteResult(NodeActionResult value) {
        this.relayEnbPnpConfigDeleteResult = value;
    }

}
