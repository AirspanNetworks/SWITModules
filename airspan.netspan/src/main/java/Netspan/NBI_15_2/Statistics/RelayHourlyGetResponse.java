
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="RelayHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIRelayResponse" minOccurs="0"/&gt;
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
    "relayHourlyGetResult"
})
@XmlRootElement(name = "RelayHourlyGetResponse")
public class RelayHourlyGetResponse {

    @XmlElement(name = "RelayHourlyGetResult")
    protected StatsBsIRelayResponse relayHourlyGetResult;

    /**
     * Gets the value of the relayHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public StatsBsIRelayResponse getRelayHourlyGetResult() {
        return relayHourlyGetResult;
    }

    /**
     * Sets the value of the relayHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public void setRelayHourlyGetResult(StatsBsIRelayResponse value) {
        this.relayHourlyGetResult = value;
    }

}
