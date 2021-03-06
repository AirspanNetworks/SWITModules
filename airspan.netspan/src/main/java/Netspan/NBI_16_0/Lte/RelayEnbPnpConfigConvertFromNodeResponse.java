
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="RelayEnbPnpConfigConvertFromNodeResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "relayEnbPnpConfigConvertFromNodeResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigConvertFromNodeResponse")
public class RelayEnbPnpConfigConvertFromNodeResponse {

    @XmlElement(name = "RelayEnbPnpConfigConvertFromNodeResult")
    protected NodeActionResult relayEnbPnpConfigConvertFromNodeResult;

    /**
     * Gets the value of the relayEnbPnpConfigConvertFromNodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayEnbPnpConfigConvertFromNodeResult() {
        return relayEnbPnpConfigConvertFromNodeResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigConvertFromNodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayEnbPnpConfigConvertFromNodeResult(NodeActionResult value) {
        this.relayEnbPnpConfigConvertFromNodeResult = value;
    }

}
