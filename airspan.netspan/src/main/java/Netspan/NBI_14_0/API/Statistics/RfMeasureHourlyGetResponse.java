
package Netspan.NBI_14_0.API.Statistics;

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
 *         &lt;element name="RfMeasureHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRfMeasureResponse" minOccurs="0"/>
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
    "rfMeasureHourlyGetResult"
})
@XmlRootElement(name = "RfMeasureHourlyGetResponse")
public class RfMeasureHourlyGetResponse {

    @XmlElement(name = "RfMeasureHourlyGetResult")
    protected StatsLteRfMeasureResponse rfMeasureHourlyGetResult;

    /**
     * Gets the value of the rfMeasureHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRfMeasureResponse }
     *     
     */
    public StatsLteRfMeasureResponse getRfMeasureHourlyGetResult() {
        return rfMeasureHourlyGetResult;
    }

    /**
     * Sets the value of the rfMeasureHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRfMeasureResponse }
     *     
     */
    public void setRfMeasureHourlyGetResult(StatsLteRfMeasureResponse value) {
        this.rfMeasureHourlyGetResult = value;
    }

}
