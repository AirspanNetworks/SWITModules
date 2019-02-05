
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
 *         &lt;element name="RelayDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIRelayResponse" minOccurs="0"/&gt;
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
    "relayDailyGetResult"
})
@XmlRootElement(name = "RelayDailyGetResponse")
public class RelayDailyGetResponse {

    @XmlElement(name = "RelayDailyGetResult")
    protected StatsBsIRelayResponse relayDailyGetResult;

    /**
     * Gets the value of the relayDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public StatsBsIRelayResponse getRelayDailyGetResult() {
        return relayDailyGetResult;
    }

    /**
     * Sets the value of the relayDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public void setRelayDailyGetResult(StatsBsIRelayResponse value) {
        this.relayDailyGetResult = value;
    }

}
