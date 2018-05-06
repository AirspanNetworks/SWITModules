
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
 *         &lt;element name="HarqHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHarqResponse" minOccurs="0"/>
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
    "harqHourlyGetResult"
})
@XmlRootElement(name = "HarqHourlyGetResponse")
public class HarqHourlyGetResponse {

    @XmlElement(name = "HarqHourlyGetResult")
    protected StatsLteHarqResponse harqHourlyGetResult;

    /**
     * Gets the value of the harqHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public StatsLteHarqResponse getHarqHourlyGetResult() {
        return harqHourlyGetResult;
    }

    /**
     * Sets the value of the harqHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public void setHarqHourlyGetResult(StatsLteHarqResponse value) {
        this.harqHourlyGetResult = value;
    }

}
