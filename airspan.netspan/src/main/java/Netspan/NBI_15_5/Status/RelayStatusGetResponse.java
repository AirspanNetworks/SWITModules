
package Netspan.NBI_15_5.Status;

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
 *         &lt;element name="RelayStatusGetResult" type="{http://Airspan.Netspan.WebServices}RelayStatusGetResult" minOccurs="0"/>
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
    "relayStatusGetResult"
})
@XmlRootElement(name = "RelayStatusGetResponse")
public class RelayStatusGetResponse {

    @XmlElement(name = "RelayStatusGetResult")
    protected RelayStatusGetResult relayStatusGetResult;

    /**
     * Gets the value of the relayStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link RelayStatusGetResult }
     *     
     */
    public RelayStatusGetResult getRelayStatusGetResult() {
        return relayStatusGetResult;
    }

    /**
     * Sets the value of the relayStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayStatusGetResult }
     *     
     */
    public void setRelayStatusGetResult(RelayStatusGetResult value) {
        this.relayStatusGetResult = value;
    }

}
