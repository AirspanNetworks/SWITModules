
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="RelayLocationLockRedeploymentActionSetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "relayLocationLockRedeploymentActionSetResult"
})
@XmlRootElement(name = "RelayLocationLockRedeploymentActionSetResponse")
public class RelayLocationLockRedeploymentActionSetResponse {

    @XmlElement(name = "RelayLocationLockRedeploymentActionSetResult")
    protected NodeActionResult relayLocationLockRedeploymentActionSetResult;

    /**
     * Gets the value of the relayLocationLockRedeploymentActionSetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getRelayLocationLockRedeploymentActionSetResult() {
        return relayLocationLockRedeploymentActionSetResult;
    }

    /**
     * Sets the value of the relayLocationLockRedeploymentActionSetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setRelayLocationLockRedeploymentActionSetResult(NodeActionResult value) {
        this.relayLocationLockRedeploymentActionSetResult = value;
    }

}
