
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="RruPerMcsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerMcsResponse" minOccurs="0"/&gt;
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
    "rruPerMcsHourlyGetResult"
})
@XmlRootElement(name = "RruPerMcsHourlyGetResponse")
public class RruPerMcsHourlyGetResponse {

    @XmlElement(name = "RruPerMcsHourlyGetResult")
    protected StatsLteRruPerMcsResponse rruPerMcsHourlyGetResult;

    /**
     * Gets the value of the rruPerMcsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerMcsResponse }
     *     
     */
    public StatsLteRruPerMcsResponse getRruPerMcsHourlyGetResult() {
        return rruPerMcsHourlyGetResult;
    }

    /**
     * Sets the value of the rruPerMcsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerMcsResponse }
     *     
     */
    public void setRruPerMcsHourlyGetResult(StatsLteRruPerMcsResponse value) {
        this.rruPerMcsHourlyGetResult = value;
    }

}
