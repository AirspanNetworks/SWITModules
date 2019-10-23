
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="RelayPerQciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerQciResponse" minOccurs="0"/&gt;
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
    "relayPerQciHourlyGetResult"
})
@XmlRootElement(name = "RelayPerQciHourlyGetResponse")
public class RelayPerQciHourlyGetResponse {

    @XmlElement(name = "RelayPerQciHourlyGetResult")
    protected StatsRelayPerQciResponse relayPerQciHourlyGetResult;

    /**
     * Gets the value of the relayPerQciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerQciResponse }
     *     
     */
    public StatsRelayPerQciResponse getRelayPerQciHourlyGetResult() {
        return relayPerQciHourlyGetResult;
    }

    /**
     * Sets the value of the relayPerQciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerQciResponse }
     *     
     */
    public void setRelayPerQciHourlyGetResult(StatsRelayPerQciResponse value) {
        this.relayPerQciHourlyGetResult = value;
    }

}
