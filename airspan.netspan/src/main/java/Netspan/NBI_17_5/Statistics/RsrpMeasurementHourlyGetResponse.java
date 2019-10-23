
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="RsrpMeasurementHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRsrpMeasurementResponse" minOccurs="0"/&gt;
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
    "rsrpMeasurementHourlyGetResult"
})
@XmlRootElement(name = "RsrpMeasurementHourlyGetResponse")
public class RsrpMeasurementHourlyGetResponse {

    @XmlElement(name = "RsrpMeasurementHourlyGetResult")
    protected StatsLteRsrpMeasurementResponse rsrpMeasurementHourlyGetResult;

    /**
     * Gets the value of the rsrpMeasurementHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRsrpMeasurementResponse }
     *     
     */
    public StatsLteRsrpMeasurementResponse getRsrpMeasurementHourlyGetResult() {
        return rsrpMeasurementHourlyGetResult;
    }

    /**
     * Sets the value of the rsrpMeasurementHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRsrpMeasurementResponse }
     *     
     */
    public void setRsrpMeasurementHourlyGetResult(StatsLteRsrpMeasurementResponse value) {
        this.rsrpMeasurementHourlyGetResult = value;
    }

}
