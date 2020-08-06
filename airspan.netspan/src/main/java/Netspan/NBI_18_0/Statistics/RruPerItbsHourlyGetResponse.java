
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
 *         &lt;element name="RruPerItbsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerItbsResponse" minOccurs="0"/&gt;
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
    "rruPerItbsHourlyGetResult"
})
@XmlRootElement(name = "RruPerItbsHourlyGetResponse")
public class RruPerItbsHourlyGetResponse {

    @XmlElement(name = "RruPerItbsHourlyGetResult")
    protected StatsLteRruPerItbsResponse rruPerItbsHourlyGetResult;

    /**
     * Gets the value of the rruPerItbsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public StatsLteRruPerItbsResponse getRruPerItbsHourlyGetResult() {
        return rruPerItbsHourlyGetResult;
    }

    /**
     * Sets the value of the rruPerItbsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public void setRruPerItbsHourlyGetResult(StatsLteRruPerItbsResponse value) {
        this.rruPerItbsHourlyGetResult = value;
    }

}
