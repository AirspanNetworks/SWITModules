
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="EnbPositioningMeasurementsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEnbPosMeasurementsResponse" minOccurs="0"/&gt;
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
    "enbPositioningMeasurementsRawGetResult"
})
@XmlRootElement(name = "EnbPositioningMeasurementsRawGetResponse")
public class EnbPositioningMeasurementsRawGetResponse {

    @XmlElement(name = "EnbPositioningMeasurementsRawGetResult")
    protected StatsLteEnbPosMeasurementsResponse enbPositioningMeasurementsRawGetResult;

    /**
     * Gets the value of the enbPositioningMeasurementsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEnbPosMeasurementsResponse }
     *     
     */
    public StatsLteEnbPosMeasurementsResponse getEnbPositioningMeasurementsRawGetResult() {
        return enbPositioningMeasurementsRawGetResult;
    }

    /**
     * Sets the value of the enbPositioningMeasurementsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEnbPosMeasurementsResponse }
     *     
     */
    public void setEnbPositioningMeasurementsRawGetResult(StatsLteEnbPosMeasurementsResponse value) {
        this.enbPositioningMeasurementsRawGetResult = value;
    }

}
