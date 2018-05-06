
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
 *         &lt;element name="RelayAdvancedProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "relayAdvancedProfileCloneResult"
})
@XmlRootElement(name = "RelayAdvancedProfileCloneResponse")
public class RelayAdvancedProfileCloneResponse {

    @XmlElement(name = "RelayAdvancedProfileCloneResult")
    protected ProfileResponse relayAdvancedProfileCloneResult;

    /**
     * Gets the value of the relayAdvancedProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getRelayAdvancedProfileCloneResult() {
        return relayAdvancedProfileCloneResult;
    }

    /**
     * Sets the value of the relayAdvancedProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setRelayAdvancedProfileCloneResult(ProfileResponse value) {
        this.relayAdvancedProfileCloneResult = value;
    }

}
