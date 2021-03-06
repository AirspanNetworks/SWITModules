
package Netspan.NBI_16_5.Lte;

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
 *         &lt;element name="RelayEnbPnpConfigGetResult" type="{http://Airspan.Netspan.WebServices}RelayEnbPnpConfigGetResult" minOccurs="0"/&gt;
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
    "relayEnbPnpConfigGetResult"
})
@XmlRootElement(name = "RelayEnbPnpConfigGetResponse")
public class RelayEnbPnpConfigGetResponse {

    @XmlElement(name = "RelayEnbPnpConfigGetResult")
    protected RelayEnbPnpConfigGetResult relayEnbPnpConfigGetResult;

    /**
     * Gets the value of the relayEnbPnpConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayEnbPnpConfigGetResult }
     *     
     */
    public RelayEnbPnpConfigGetResult getRelayEnbPnpConfigGetResult() {
        return relayEnbPnpConfigGetResult;
    }

    /**
     * Sets the value of the relayEnbPnpConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayEnbPnpConfigGetResult }
     *     
     */
    public void setRelayEnbPnpConfigGetResult(RelayEnbPnpConfigGetResult value) {
        this.relayEnbPnpConfigGetResult = value;
    }

}
