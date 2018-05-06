
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="RelayPnpConfigCreateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/>
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
    "relayPnpConfigCreateResult"
})
@XmlRootElement(name = "RelayPnpConfigCreateResponse")
public class RelayPnpConfigCreateResponse {

    @XmlElement(name = "RelayPnpConfigCreateResult")
    protected NodeActionResult relayPnpConfigCreateResult;

    /**
     * Gets the value of the relayPnpConfigCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayPnpConfigCreateResult() {
        return relayPnpConfigCreateResult;
    }

    /**
     * Sets the value of the relayPnpConfigCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayPnpConfigCreateResult(NodeActionResult value) {
        this.relayPnpConfigCreateResult = value;
    }

}
