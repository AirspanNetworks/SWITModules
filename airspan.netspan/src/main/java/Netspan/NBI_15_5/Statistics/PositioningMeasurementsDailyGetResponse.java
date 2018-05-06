
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
 *         &lt;element name="PositioningMeasurementsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePosMeasurementsResponse" minOccurs="0"/>
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
    "positioningMeasurementsDailyGetResult"
})
@XmlRootElement(name = "PositioningMeasurementsDailyGetResponse")
public class PositioningMeasurementsDailyGetResponse {

    @XmlElement(name = "PositioningMeasurementsDailyGetResult")
    protected StatsLtePosMeasurementsResponse positioningMeasurementsDailyGetResult;

    /**
     * Gets the value of the positioningMeasurementsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePosMeasurementsResponse }
     *     
     */
    public StatsLtePosMeasurementsResponse getPositioningMeasurementsDailyGetResult() {
        return positioningMeasurementsDailyGetResult;
    }

    /**
     * Sets the value of the positioningMeasurementsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePosMeasurementsResponse }
     *     
     */
    public void setPositioningMeasurementsDailyGetResult(StatsLtePosMeasurementsResponse value) {
        this.positioningMeasurementsDailyGetResult = value;
    }

}
