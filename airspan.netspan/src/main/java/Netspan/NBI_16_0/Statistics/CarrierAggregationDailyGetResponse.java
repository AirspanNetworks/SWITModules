
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
 *         &lt;element name="CarrierAggregationDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCarrierAggregationResponse" minOccurs="0"/>
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
    "carrierAggregationDailyGetResult"
})
@XmlRootElement(name = "CarrierAggregationDailyGetResponse")
public class CarrierAggregationDailyGetResponse {

    @XmlElement(name = "CarrierAggregationDailyGetResult")
    protected StatsLteCarrierAggregationResponse carrierAggregationDailyGetResult;

    /**
     * Gets the value of the carrierAggregationDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCarrierAggregationResponse }
     *     
     */
    public StatsLteCarrierAggregationResponse getCarrierAggregationDailyGetResult() {
        return carrierAggregationDailyGetResult;
    }

    /**
     * Sets the value of the carrierAggregationDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCarrierAggregationResponse }
     *     
     */
    public void setCarrierAggregationDailyGetResult(StatsLteCarrierAggregationResponse value) {
        this.carrierAggregationDailyGetResult = value;
    }

}
