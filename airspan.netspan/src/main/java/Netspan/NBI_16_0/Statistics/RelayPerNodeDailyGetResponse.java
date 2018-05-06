
package Netspan.NBI_16_0.Statistics;

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
 *         &lt;element name="RelayPerNodeDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerNodeResponse" minOccurs="0"/>
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
    "relayPerNodeDailyGetResult"
})
@XmlRootElement(name = "RelayPerNodeDailyGetResponse")
public class RelayPerNodeDailyGetResponse {

    @XmlElement(name = "RelayPerNodeDailyGetResult")
    protected StatsRelayPerNodeResponse relayPerNodeDailyGetResult;

    /**
     * Gets the value of the relayPerNodeDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerNodeResponse }
     *     
     */
    public StatsRelayPerNodeResponse getRelayPerNodeDailyGetResult() {
        return relayPerNodeDailyGetResult;
    }

    /**
     * Sets the value of the relayPerNodeDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerNodeResponse }
     *     
     */
    public void setRelayPerNodeDailyGetResult(StatsRelayPerNodeResponse value) {
        this.relayPerNodeDailyGetResult = value;
    }

}
