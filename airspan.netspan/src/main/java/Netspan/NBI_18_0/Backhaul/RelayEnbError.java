
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
 *         &lt;element name="RelayEnbErrorDetail" type="{http://Airspan.Netspan.WebServices}RelayEnbErrorDetailWs" minOccurs="0"/&gt;
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
    "relayEnbErrorDetail"
})
@XmlRootElement(name = "RelayEnbError")
public class RelayEnbError {

    @XmlElement(name = "RelayEnbErrorDetail")
    protected RelayEnbErrorDetailWs relayEnbErrorDetail;

    /**
     * Gets the value of the relayEnbErrorDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RelayEnbErrorDetailWs }
     *     
     */
    public RelayEnbErrorDetailWs getRelayEnbErrorDetail() {
        return relayEnbErrorDetail;
    }

    /**
     * Sets the value of the relayEnbErrorDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayEnbErrorDetailWs }
     *     
     */
    public void setRelayEnbErrorDetail(RelayEnbErrorDetailWs value) {
        this.relayEnbErrorDetail = value;
    }

}
