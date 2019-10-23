
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
 *         &lt;element name="RruItbsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerItbsResponse" minOccurs="0"/&gt;
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
    "rruItbsDailyGetResult"
})
@XmlRootElement(name = "RruItbsDailyGetResponse")
public class RruItbsDailyGetResponse {

    @XmlElement(name = "RruItbsDailyGetResult")
    protected StatsLteRruPerItbsResponse rruItbsDailyGetResult;

    /**
     * Gets the value of the rruItbsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public StatsLteRruPerItbsResponse getRruItbsDailyGetResult() {
        return rruItbsDailyGetResult;
    }

    /**
     * Sets the value of the rruItbsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public void setRruItbsDailyGetResult(StatsLteRruPerItbsResponse value) {
        this.rruItbsDailyGetResult = value;
    }

}
