
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
 *         &lt;element name="RelayPerNbrPciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsRelayPerNbrPciResponse" minOccurs="0"/>
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
    "relayPerNbrPciHourlyGetResult"
})
@XmlRootElement(name = "RelayPerNbrPciHourlyGetResponse")
public class RelayPerNbrPciHourlyGetResponse {

    @XmlElement(name = "RelayPerNbrPciHourlyGetResult")
    protected StatsRelayPerNbrPciResponse relayPerNbrPciHourlyGetResult;

    /**
     * Gets the value of the relayPerNbrPciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsRelayPerNbrPciResponse }
     *     
     */
    public StatsRelayPerNbrPciResponse getRelayPerNbrPciHourlyGetResult() {
        return relayPerNbrPciHourlyGetResult;
    }

    /**
     * Sets the value of the relayPerNbrPciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsRelayPerNbrPciResponse }
     *     
     */
    public void setRelayPerNbrPciHourlyGetResult(StatsRelayPerNbrPciResponse value) {
        this.relayPerNbrPciHourlyGetResult = value;
    }

}
