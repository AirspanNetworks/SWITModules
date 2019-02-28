
package Netspan.NBI_17_0.Statistics;

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
 *         &lt;element name="RachAccessDelayDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachAccessDelayResponse" minOccurs="0"/&gt;
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
    "rachAccessDelayDailyGetResult"
})
@XmlRootElement(name = "RachAccessDelayDailyGetResponse")
public class RachAccessDelayDailyGetResponse {

    @XmlElement(name = "RachAccessDelayDailyGetResult")
    protected StatsLteRachAccessDelayResponse rachAccessDelayDailyGetResult;

    /**
     * Gets the value of the rachAccessDelayDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public StatsLteRachAccessDelayResponse getRachAccessDelayDailyGetResult() {
        return rachAccessDelayDailyGetResult;
    }

    /**
     * Sets the value of the rachAccessDelayDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public void setRachAccessDelayDailyGetResult(StatsLteRachAccessDelayResponse value) {
        this.rachAccessDelayDailyGetResult = value;
    }

}
