
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
 *         &lt;element name="UePrachInitialTimingAdvanceDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteUePrachInitialTimingAdvanceResponse" minOccurs="0"/&gt;
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
    "uePrachInitialTimingAdvanceDailyGetResult"
})
@XmlRootElement(name = "UePrachInitialTimingAdvanceDailyGetResponse")
public class UePrachInitialTimingAdvanceDailyGetResponse {

    @XmlElement(name = "UePrachInitialTimingAdvanceDailyGetResult")
    protected StatsLteUePrachInitialTimingAdvanceResponse uePrachInitialTimingAdvanceDailyGetResult;

    /**
     * Gets the value of the uePrachInitialTimingAdvanceDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteUePrachInitialTimingAdvanceResponse }
     *     
     */
    public StatsLteUePrachInitialTimingAdvanceResponse getUePrachInitialTimingAdvanceDailyGetResult() {
        return uePrachInitialTimingAdvanceDailyGetResult;
    }

    /**
     * Sets the value of the uePrachInitialTimingAdvanceDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteUePrachInitialTimingAdvanceResponse }
     *     
     */
    public void setUePrachInitialTimingAdvanceDailyGetResult(StatsLteUePrachInitialTimingAdvanceResponse value) {
        this.uePrachInitialTimingAdvanceDailyGetResult = value;
    }

}
