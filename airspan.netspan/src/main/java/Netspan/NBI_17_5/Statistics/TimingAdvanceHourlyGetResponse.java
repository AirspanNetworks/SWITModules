
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
 *         &lt;element name="TimingAdvanceHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteTimingAdvanceResponse" minOccurs="0"/&gt;
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
    "timingAdvanceHourlyGetResult"
})
@XmlRootElement(name = "TimingAdvanceHourlyGetResponse")
public class TimingAdvanceHourlyGetResponse {

    @XmlElement(name = "TimingAdvanceHourlyGetResult")
    protected StatsLteTimingAdvanceResponse timingAdvanceHourlyGetResult;

    /**
     * Gets the value of the timingAdvanceHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteTimingAdvanceResponse }
     *     
     */
    public StatsLteTimingAdvanceResponse getTimingAdvanceHourlyGetResult() {
        return timingAdvanceHourlyGetResult;
    }

    /**
     * Sets the value of the timingAdvanceHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteTimingAdvanceResponse }
     *     
     */
    public void setTimingAdvanceHourlyGetResult(StatsLteTimingAdvanceResponse value) {
        this.timingAdvanceHourlyGetResult = value;
    }

}
