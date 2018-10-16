
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
 *         &lt;element name="RelayEnbConfigGetResult" type="{http://Airspan.Netspan.WebServices}RelayEnodeBConfigGetResult" minOccurs="0"/&gt;
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
    "relayEnbConfigGetResult"
})
@XmlRootElement(name = "RelayEnbConfigGetResponse")
public class RelayEnbConfigGetResponse {

    @XmlElement(name = "RelayEnbConfigGetResult")
    protected RelayEnodeBConfigGetResult relayEnbConfigGetResult;

    /**
     * Gets the value of the relayEnbConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayEnodeBConfigGetResult }
     *     
     */
    public RelayEnodeBConfigGetResult getRelayEnbConfigGetResult() {
        return relayEnbConfigGetResult;
    }

    /**
     * Sets the value of the relayEnbConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayEnodeBConfigGetResult }
     *     
     */
    public void setRelayEnbConfigGetResult(RelayEnodeBConfigGetResult value) {
        this.relayEnbConfigGetResult = value;
    }

}
