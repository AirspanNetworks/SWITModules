
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
 *         &lt;element name="HandoverPerQciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelHoPerQciResponse" minOccurs="0"/>
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
    "handoverPerQciHourlyGetResult"
})
@XmlRootElement(name = "HandoverPerQciHourlyGetResponse")
public class HandoverPerQciHourlyGetResponse {

    @XmlElement(name = "HandoverPerQciHourlyGetResult")
    protected StatsLteCellLevelHoPerQciResponse handoverPerQciHourlyGetResult;

    /**
     * Gets the value of the handoverPerQciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelHoPerQciResponse }
     *     
     */
    public StatsLteCellLevelHoPerQciResponse getHandoverPerQciHourlyGetResult() {
        return handoverPerQciHourlyGetResult;
    }

    /**
     * Sets the value of the handoverPerQciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelHoPerQciResponse }
     *     
     */
    public void setHandoverPerQciHourlyGetResult(StatsLteCellLevelHoPerQciResponse value) {
        this.handoverPerQciHourlyGetResult = value;
    }

}
