
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
 *         &lt;element name="RsrqMeasurementHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRsrqMeasurementResponse" minOccurs="0"/&gt;
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
    "rsrqMeasurementHourlyGetResult"
})
@XmlRootElement(name = "RsrqMeasurementHourlyGetResponse")
public class RsrqMeasurementHourlyGetResponse {

    @XmlElement(name = "RsrqMeasurementHourlyGetResult")
    protected StatsLteRsrqMeasurementResponse rsrqMeasurementHourlyGetResult;

    /**
     * Gets the value of the rsrqMeasurementHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRsrqMeasurementResponse }
     *     
     */
    public StatsLteRsrqMeasurementResponse getRsrqMeasurementHourlyGetResult() {
        return rsrqMeasurementHourlyGetResult;
    }

    /**
     * Sets the value of the rsrqMeasurementHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRsrqMeasurementResponse }
     *     
     */
    public void setRsrqMeasurementHourlyGetResult(StatsLteRsrqMeasurementResponse value) {
        this.rsrqMeasurementHourlyGetResult = value;
    }

}
