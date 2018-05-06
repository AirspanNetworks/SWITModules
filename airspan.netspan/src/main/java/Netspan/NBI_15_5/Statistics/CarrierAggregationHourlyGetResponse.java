
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="CarrierAggregationHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCarrierAggregationResponse" minOccurs="0"/>
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
    "carrierAggregationHourlyGetResult"
})
@XmlRootElement(name = "CarrierAggregationHourlyGetResponse")
public class CarrierAggregationHourlyGetResponse {

    @XmlElement(name = "CarrierAggregationHourlyGetResult")
    protected StatsLteCarrierAggregationResponse carrierAggregationHourlyGetResult;

    /**
     * Gets the value of the carrierAggregationHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCarrierAggregationResponse }
     *     
     */
    public StatsLteCarrierAggregationResponse getCarrierAggregationHourlyGetResult() {
        return carrierAggregationHourlyGetResult;
    }

    /**
     * Sets the value of the carrierAggregationHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCarrierAggregationResponse }
     *     
     */
    public void setCarrierAggregationHourlyGetResult(StatsLteCarrierAggregationResponse value) {
        this.carrierAggregationHourlyGetResult = value;
    }

}
