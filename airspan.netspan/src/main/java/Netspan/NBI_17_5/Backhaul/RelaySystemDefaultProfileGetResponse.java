
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="RelaySystemDefaultProfileGetResult" type="{http://Airspan.Netspan.WebServices}RelaySystemDefaultProfileGetResult" minOccurs="0"/&gt;
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
    "relaySystemDefaultProfileGetResult"
})
@XmlRootElement(name = "RelaySystemDefaultProfileGetResponse")
public class RelaySystemDefaultProfileGetResponse {

    @XmlElement(name = "RelaySystemDefaultProfileGetResult")
    protected RelaySystemDefaultProfileGetResult relaySystemDefaultProfileGetResult;

    /**
     * Gets the value of the relaySystemDefaultProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelaySystemDefaultProfileGetResult }
     *     
     */
    public RelaySystemDefaultProfileGetResult getRelaySystemDefaultProfileGetResult() {
        return relaySystemDefaultProfileGetResult;
    }

    /**
     * Sets the value of the relaySystemDefaultProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelaySystemDefaultProfileGetResult }
     *     
     */
    public void setRelaySystemDefaultProfileGetResult(RelaySystemDefaultProfileGetResult value) {
        this.relaySystemDefaultProfileGetResult = value;
    }

}
