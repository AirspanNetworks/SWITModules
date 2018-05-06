
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
 *         &lt;element name="RelayEnbPnpConfigCloneResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "relayEnbPnpConfigCloneResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigCloneResponse")
public class RelayEnbPnpConfigCloneResponse {

    @XmlElement(name = "RelayEnbPnpConfigCloneResult")
    protected NodeActionResult relayEnbPnpConfigCloneResult;

    /**
     * Gets the value of the relayEnbPnpConfigCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayEnbPnpConfigCloneResult() {
        return relayEnbPnpConfigCloneResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayEnbPnpConfigCloneResult(NodeActionResult value) {
        this.relayEnbPnpConfigCloneResult = value;
    }

}
