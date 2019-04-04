
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelayConfigGetResult" type="{http://Airspan.Netspan.WebServices}RelayConfigGetResult" minOccurs="0"/&gt;
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
    "relayConfigGetResult"
})
@XmlRootElement(name = "RelayConfigGetResponse")
public class RelayConfigGetResponse {

    @XmlElement(name = "RelayConfigGetResult")
    protected RelayConfigGetResult relayConfigGetResult;

    /**
     * Gets the value of the relayConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayConfigGetResult }
     *     
     */
    public RelayConfigGetResult getRelayConfigGetResult() {
        return relayConfigGetResult;
    }

    /**
     * Sets the value of the relayConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayConfigGetResult }
     *     
     */
    public void setRelayConfigGetResult(RelayConfigGetResult value) {
        this.relayConfigGetResult = value;
    }

}
