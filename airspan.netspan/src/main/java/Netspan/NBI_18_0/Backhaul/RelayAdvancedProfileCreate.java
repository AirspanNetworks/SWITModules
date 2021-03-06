
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
 *         &lt;element name="RelayAdvancedProfile" type="{http://Airspan.Netspan.WebServices}RelayAdvancedProfile" minOccurs="0"/&gt;
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
    "relayAdvancedProfile"
})
@XmlRootElement(name = "RelayAdvancedProfileCreate")
public class RelayAdvancedProfileCreate {

    @XmlElement(name = "RelayAdvancedProfile")
    protected RelayAdvancedProfile relayAdvancedProfile;

    /**
     * Gets the value of the relayAdvancedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link RelayAdvancedProfile }
     *     
     */
    public RelayAdvancedProfile getRelayAdvancedProfile() {
        return relayAdvancedProfile;
    }

    /**
     * Sets the value of the relayAdvancedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayAdvancedProfile }
     *     
     */
    public void setRelayAdvancedProfile(RelayAdvancedProfile value) {
        this.relayAdvancedProfile = value;
    }

}
