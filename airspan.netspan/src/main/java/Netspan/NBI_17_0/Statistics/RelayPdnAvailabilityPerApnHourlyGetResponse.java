
package Netspan.NBI_17_0.Statistics;

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
 *         &lt;element name="RelayPdnAvailabilityPerApnHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPdnAvailabilityPerApnResponse" minOccurs="0"/&gt;
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
    "relayPdnAvailabilityPerApnHourlyGetResult"
})
@XmlRootElement(name = "RelayPdnAvailabilityPerApnHourlyGetResponse")
public class RelayPdnAvailabilityPerApnHourlyGetResponse {

    @XmlElement(name = "RelayPdnAvailabilityPerApnHourlyGetResult")
    protected StatsRelayPdnAvailabilityPerApnResponse relayPdnAvailabilityPerApnHourlyGetResult;

    /**
     * Gets the value of the relayPdnAvailabilityPerApnHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPdnAvailabilityPerApnResponse }
     *     
     */
    public StatsRelayPdnAvailabilityPerApnResponse getRelayPdnAvailabilityPerApnHourlyGetResult() {
        return relayPdnAvailabilityPerApnHourlyGetResult;
    }

    /**
     * Sets the value of the relayPdnAvailabilityPerApnHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPdnAvailabilityPerApnResponse }
     *     
     */
    public void setRelayPdnAvailabilityPerApnHourlyGetResult(StatsRelayPdnAvailabilityPerApnResponse value) {
        this.relayPdnAvailabilityPerApnHourlyGetResult = value;
    }

}
