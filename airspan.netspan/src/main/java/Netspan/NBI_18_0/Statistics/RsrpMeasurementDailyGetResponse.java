
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
 *         &lt;element name="RsrpMeasurementDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRsrpMeasurementResponse" minOccurs="0"/&gt;
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
    "rsrpMeasurementDailyGetResult"
})
@XmlRootElement(name = "RsrpMeasurementDailyGetResponse")
public class RsrpMeasurementDailyGetResponse {

    @XmlElement(name = "RsrpMeasurementDailyGetResult")
    protected StatsLteRsrpMeasurementResponse rsrpMeasurementDailyGetResult;

    /**
     * Gets the value of the rsrpMeasurementDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRsrpMeasurementResponse }
     *     
     */
    public StatsLteRsrpMeasurementResponse getRsrpMeasurementDailyGetResult() {
        return rsrpMeasurementDailyGetResult;
    }

    /**
     * Sets the value of the rsrpMeasurementDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRsrpMeasurementResponse }
     *     
     */
    public void setRsrpMeasurementDailyGetResult(StatsLteRsrpMeasurementResponse value) {
        this.rsrpMeasurementDailyGetResult = value;
    }

}
