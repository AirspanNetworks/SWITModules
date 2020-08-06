
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
 *         &lt;element name="RelayPerNodeRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerNodeResponse" minOccurs="0"/&gt;
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
    "relayPerNodeRawGetResult"
})
@XmlRootElement(name = "RelayPerNodeRawGetResponse")
public class RelayPerNodeRawGetResponse {

    @XmlElement(name = "RelayPerNodeRawGetResult")
    protected StatsRelayPerNodeResponse relayPerNodeRawGetResult;

    /**
     * Gets the value of the relayPerNodeRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerNodeResponse }
     *     
     */
    public StatsRelayPerNodeResponse getRelayPerNodeRawGetResult() {
        return relayPerNodeRawGetResult;
    }

    /**
     * Sets the value of the relayPerNodeRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerNodeResponse }
     *     
     */
    public void setRelayPerNodeRawGetResult(StatsRelayPerNodeResponse value) {
        this.relayPerNodeRawGetResult = value;
    }

}
