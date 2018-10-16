
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="RelayProfileGetResult" type="{http://Airspan.Netspan.WebServices}RelayProfileGetResult" minOccurs="0"/&gt;
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
    "relayProfileGetResult"
})
@XmlRootElement(name = "RelayProfileGetResponse")
public class RelayProfileGetResponse {

    @XmlElement(name = "RelayProfileGetResult")
    protected RelayProfileGetResult relayProfileGetResult;

    /**
     * Gets the value of the relayProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayProfileGetResult }
     *     
     */
    public RelayProfileGetResult getRelayProfileGetResult() {
        return relayProfileGetResult;
    }

    /**
     * Sets the value of the relayProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayProfileGetResult }
     *     
     */
    public void setRelayProfileGetResult(RelayProfileGetResult value) {
        this.relayProfileGetResult = value;
    }

}
