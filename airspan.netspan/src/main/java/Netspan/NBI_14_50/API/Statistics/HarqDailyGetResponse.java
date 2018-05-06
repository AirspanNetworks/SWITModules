
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="HarqDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHarqResponse" minOccurs="0"/>
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
    "harqDailyGetResult"
})
@XmlRootElement(name = "HarqDailyGetResponse")
public class HarqDailyGetResponse {

    @XmlElement(name = "HarqDailyGetResult")
    protected StatsLteHarqResponse harqDailyGetResult;

    /**
     * Gets the value of the harqDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public StatsLteHarqResponse getHarqDailyGetResult() {
        return harqDailyGetResult;
    }

    /**
     * Sets the value of the harqDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public void setHarqDailyGetResult(StatsLteHarqResponse value) {
        this.harqDailyGetResult = value;
    }

}
