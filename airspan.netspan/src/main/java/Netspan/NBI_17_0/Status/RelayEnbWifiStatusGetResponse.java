
package Netspan.NBI_17_0.Status;

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
 *         &lt;element name="RelayEnbWifiStatusGetResult" type="{http://Airspan.Netspan.WebServices}RelayEnbWifiGetResult" minOccurs="0"/&gt;
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
    "relayEnbWifiStatusGetResult"
})
@XmlRootElement(name = "RelayEnbWifiStatusGetResponse")
public class RelayEnbWifiStatusGetResponse {

    @XmlElement(name = "RelayEnbWifiStatusGetResult")
    protected RelayEnbWifiGetResult relayEnbWifiStatusGetResult;

    /**
     * Gets the value of the relayEnbWifiStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayEnbWifiGetResult }
     *     
     */
    public RelayEnbWifiGetResult getRelayEnbWifiStatusGetResult() {
        return relayEnbWifiStatusGetResult;
    }

    /**
     * Sets the value of the relayEnbWifiStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayEnbWifiGetResult }
     *     
     */
    public void setRelayEnbWifiStatusGetResult(RelayEnbWifiGetResult value) {
        this.relayEnbWifiStatusGetResult = value;
    }

}
