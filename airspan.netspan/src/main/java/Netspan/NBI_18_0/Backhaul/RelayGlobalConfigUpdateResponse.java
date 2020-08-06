
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
 *         &lt;element name="RelayGlobalConfigUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "relayGlobalConfigUpdateResult"
})
@XmlRootElement(name = "RelayGlobalConfigUpdateResponse")
public class RelayGlobalConfigUpdateResponse {

    @XmlElement(name = "RelayGlobalConfigUpdateResult")
    protected NodeActionResult relayGlobalConfigUpdateResult;

    /**
     * Gets the value of the relayGlobalConfigUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayGlobalConfigUpdateResult() {
        return relayGlobalConfigUpdateResult;
    }

    /**
     * Sets the value of the relayGlobalConfigUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayGlobalConfigUpdateResult(NodeActionResult value) {
        this.relayGlobalConfigUpdateResult = value;
    }

}
