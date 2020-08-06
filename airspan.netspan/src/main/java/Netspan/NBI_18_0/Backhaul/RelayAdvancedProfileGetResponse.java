
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
 *         &lt;element name="RelayAdvancedProfileGetResult" type="{http://Airspan.Netspan.WebServices}RelayAdvancedProfileGetResult" minOccurs="0"/&gt;
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
    "relayAdvancedProfileGetResult"
})
@XmlRootElement(name = "RelayAdvancedProfileGetResponse")
public class RelayAdvancedProfileGetResponse {

    @XmlElement(name = "RelayAdvancedProfileGetResult")
    protected RelayAdvancedProfileGetResult relayAdvancedProfileGetResult;

    /**
     * Gets the value of the relayAdvancedProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayAdvancedProfileGetResult }
     *     
     */
    public RelayAdvancedProfileGetResult getRelayAdvancedProfileGetResult() {
        return relayAdvancedProfileGetResult;
    }

    /**
     * Sets the value of the relayAdvancedProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayAdvancedProfileGetResult }
     *     
     */
    public void setRelayAdvancedProfileGetResult(RelayAdvancedProfileGetResult value) {
        this.relayAdvancedProfileGetResult = value;
    }

}
