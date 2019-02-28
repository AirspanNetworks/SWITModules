
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
 *         &lt;element name="VolteWbCqiRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteVolteWbCqiResponse" minOccurs="0"/&gt;
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
    "volteWbCqiRawGetResult"
})
@XmlRootElement(name = "VolteWbCqiRawGetResponse")
public class VolteWbCqiRawGetResponse {

    @XmlElement(name = "VolteWbCqiRawGetResult")
    protected StatsLteVolteWbCqiResponse volteWbCqiRawGetResult;

    /**
     * Gets the value of the volteWbCqiRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteVolteWbCqiResponse }
     *     
     */
    public StatsLteVolteWbCqiResponse getVolteWbCqiRawGetResult() {
        return volteWbCqiRawGetResult;
    }

    /**
     * Sets the value of the volteWbCqiRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteVolteWbCqiResponse }
     *     
     */
    public void setVolteWbCqiRawGetResult(StatsLteVolteWbCqiResponse value) {
        this.volteWbCqiRawGetResult = value;
    }

}
