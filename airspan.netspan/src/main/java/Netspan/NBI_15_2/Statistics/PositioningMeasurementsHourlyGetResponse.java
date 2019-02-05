
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="PositioningMeasurementsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePosMeasurementsResponse" minOccurs="0"/&gt;
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
    "positioningMeasurementsHourlyGetResult"
})
@XmlRootElement(name = "PositioningMeasurementsHourlyGetResponse")
public class PositioningMeasurementsHourlyGetResponse {

    @XmlElement(name = "PositioningMeasurementsHourlyGetResult")
    protected StatsLtePosMeasurementsResponse positioningMeasurementsHourlyGetResult;

    /**
     * Gets the value of the positioningMeasurementsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePosMeasurementsResponse }
     *     
     */
    public StatsLtePosMeasurementsResponse getPositioningMeasurementsHourlyGetResult() {
        return positioningMeasurementsHourlyGetResult;
    }

    /**
     * Sets the value of the positioningMeasurementsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePosMeasurementsResponse }
     *     
     */
    public void setPositioningMeasurementsHourlyGetResult(StatsLtePosMeasurementsResponse value) {
        this.positioningMeasurementsHourlyGetResult = value;
    }

}
