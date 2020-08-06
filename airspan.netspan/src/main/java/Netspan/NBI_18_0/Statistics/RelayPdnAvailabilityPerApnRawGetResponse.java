
package Netspan.NBI_18_0.Statistics;

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
 *         &lt;element name="RelayPdnAvailabilityPerApnRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPdnAvailabilityPerApnResponse" minOccurs="0"/&gt;
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
    "relayPdnAvailabilityPerApnRawGetResult"
})
@XmlRootElement(name = "RelayPdnAvailabilityPerApnRawGetResponse")
public class RelayPdnAvailabilityPerApnRawGetResponse {

    @XmlElement(name = "RelayPdnAvailabilityPerApnRawGetResult")
    protected StatsRelayPdnAvailabilityPerApnResponse relayPdnAvailabilityPerApnRawGetResult;

    /**
     * Gets the value of the relayPdnAvailabilityPerApnRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPdnAvailabilityPerApnResponse }
     *     
     */
    public StatsRelayPdnAvailabilityPerApnResponse getRelayPdnAvailabilityPerApnRawGetResult() {
        return relayPdnAvailabilityPerApnRawGetResult;
    }

    /**
     * Sets the value of the relayPdnAvailabilityPerApnRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPdnAvailabilityPerApnResponse }
     *     
     */
    public void setRelayPdnAvailabilityPerApnRawGetResult(StatsRelayPdnAvailabilityPerApnResponse value) {
        this.relayPdnAvailabilityPerApnRawGetResult = value;
    }

}
