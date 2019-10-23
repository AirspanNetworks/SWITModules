
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
 *         &lt;element name="VolteQualityRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteVolteQualityResponse" minOccurs="0"/&gt;
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
    "volteQualityRawGetResult"
})
@XmlRootElement(name = "VolteQualityRawGetResponse")
public class VolteQualityRawGetResponse {

    @XmlElement(name = "VolteQualityRawGetResult")
    protected StatsLteVolteQualityResponse volteQualityRawGetResult;

    /**
     * Gets the value of the volteQualityRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteVolteQualityResponse }
     *     
     */
    public StatsLteVolteQualityResponse getVolteQualityRawGetResult() {
        return volteQualityRawGetResult;
    }

    /**
     * Sets the value of the volteQualityRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteVolteQualityResponse }
     *     
     */
    public void setVolteQualityRawGetResult(StatsLteVolteQualityResponse value) {
        this.volteQualityRawGetResult = value;
    }

}
