
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
 *         &lt;element name="RelayGlobalConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "relayGlobalConfigDeleteResult"
})
@XmlRootElement(name = "RelayGlobalConfigDeleteResponse")
public class RelayGlobalConfigDeleteResponse {

    @XmlElement(name = "RelayGlobalConfigDeleteResult")
    protected NodeActionResult relayGlobalConfigDeleteResult;

    /**
     * Gets the value of the relayGlobalConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayGlobalConfigDeleteResult() {
        return relayGlobalConfigDeleteResult;
    }

    /**
     * Sets the value of the relayGlobalConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayGlobalConfigDeleteResult(NodeActionResult value) {
        this.relayGlobalConfigDeleteResult = value;
    }

}
