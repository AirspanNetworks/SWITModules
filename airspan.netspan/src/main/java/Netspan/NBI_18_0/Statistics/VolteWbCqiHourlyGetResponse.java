
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
 *         &lt;element name="VolteWbCqiHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteVolteWbCqiResponse" minOccurs="0"/&gt;
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
    "volteWbCqiHourlyGetResult"
})
@XmlRootElement(name = "VolteWbCqiHourlyGetResponse")
public class VolteWbCqiHourlyGetResponse {

    @XmlElement(name = "VolteWbCqiHourlyGetResult")
    protected StatsLteVolteWbCqiResponse volteWbCqiHourlyGetResult;

    /**
     * Gets the value of the volteWbCqiHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteVolteWbCqiResponse }
     *     
     */
    public StatsLteVolteWbCqiResponse getVolteWbCqiHourlyGetResult() {
        return volteWbCqiHourlyGetResult;
    }

    /**
     * Sets the value of the volteWbCqiHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteVolteWbCqiResponse }
     *     
     */
    public void setVolteWbCqiHourlyGetResult(StatsLteVolteWbCqiResponse value) {
        this.volteWbCqiHourlyGetResult = value;
    }

}
