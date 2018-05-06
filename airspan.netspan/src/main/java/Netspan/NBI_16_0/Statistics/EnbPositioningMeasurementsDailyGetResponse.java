
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
 *         &lt;element name="EnbPositioningMeasurementsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEnbPosMeasurementsResponse" minOccurs="0"/>
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
    "enbPositioningMeasurementsDailyGetResult"
})
@XmlRootElement(name = "EnbPositioningMeasurementsDailyGetResponse")
public class EnbPositioningMeasurementsDailyGetResponse {

    @XmlElement(name = "EnbPositioningMeasurementsDailyGetResult")
    protected StatsLteEnbPosMeasurementsResponse enbPositioningMeasurementsDailyGetResult;

    /**
     * Gets the value of the enbPositioningMeasurementsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEnbPosMeasurementsResponse }
     *     
     */
    public StatsLteEnbPosMeasurementsResponse getEnbPositioningMeasurementsDailyGetResult() {
        return enbPositioningMeasurementsDailyGetResult;
    }

    /**
     * Sets the value of the enbPositioningMeasurementsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEnbPosMeasurementsResponse }
     *     
     */
    public void setEnbPositioningMeasurementsDailyGetResult(StatsLteEnbPosMeasurementsResponse value) {
        this.enbPositioningMeasurementsDailyGetResult = value;
    }

}
