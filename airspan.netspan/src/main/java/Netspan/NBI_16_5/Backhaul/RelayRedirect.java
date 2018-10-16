
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
 *         &lt;element name="RelayRedirectDetail" type="{http://Airspan.Netspan.WebServices}RelayRedirectDetailWs" minOccurs="0"/&gt;
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
    "relayRedirectDetail"
})
@XmlRootElement(name = "RelayRedirect")
public class RelayRedirect {

    @XmlElement(name = "RelayRedirectDetail")
    protected RelayRedirectDetailWs relayRedirectDetail;

    /**
     * Gets the value of the relayRedirectDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RelayRedirectDetailWs }
     *     
     */
    public RelayRedirectDetailWs getRelayRedirectDetail() {
        return relayRedirectDetail;
    }

    /**
     * Sets the value of the relayRedirectDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayRedirectDetailWs }
     *     
     */
    public void setRelayRedirectDetail(RelayRedirectDetailWs value) {
        this.relayRedirectDetail = value;
    }

}
