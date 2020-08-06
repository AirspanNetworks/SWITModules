
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
 *         &lt;element name="RelayPerMcsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerMcsResponse" minOccurs="0"/&gt;
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
    "relayPerMcsRawGetResult"
})
@XmlRootElement(name = "RelayPerMcsRawGetResponse")
public class RelayPerMcsRawGetResponse {

    @XmlElement(name = "RelayPerMcsRawGetResult")
    protected StatsRelayPerMcsResponse relayPerMcsRawGetResult;

    /**
     * Gets the value of the relayPerMcsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerMcsResponse }
     *     
     */
    public StatsRelayPerMcsResponse getRelayPerMcsRawGetResult() {
        return relayPerMcsRawGetResult;
    }

    /**
     * Sets the value of the relayPerMcsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerMcsResponse }
     *     
     */
    public void setRelayPerMcsRawGetResult(StatsRelayPerMcsResponse value) {
        this.relayPerMcsRawGetResult = value;
    }

}
