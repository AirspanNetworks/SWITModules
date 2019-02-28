
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
 *         &lt;element name="RelayPerMcsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerMcsResponse" minOccurs="0"/&gt;
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
    "relayPerMcsDailyGetResult"
})
@XmlRootElement(name = "RelayPerMcsDailyGetResponse")
public class RelayPerMcsDailyGetResponse {

    @XmlElement(name = "RelayPerMcsDailyGetResult")
    protected StatsRelayPerMcsResponse relayPerMcsDailyGetResult;

    /**
     * Gets the value of the relayPerMcsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerMcsResponse }
     *     
     */
    public StatsRelayPerMcsResponse getRelayPerMcsDailyGetResult() {
        return relayPerMcsDailyGetResult;
    }

    /**
     * Sets the value of the relayPerMcsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerMcsResponse }
     *     
     */
    public void setRelayPerMcsDailyGetResult(StatsRelayPerMcsResponse value) {
        this.relayPerMcsDailyGetResult = value;
    }

}
