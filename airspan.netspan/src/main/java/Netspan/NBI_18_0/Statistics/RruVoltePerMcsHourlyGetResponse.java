
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
 *         &lt;element name="RruVoltePerMcsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruVoltePerMcsResponse" minOccurs="0"/&gt;
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
    "rruVoltePerMcsHourlyGetResult"
})
@XmlRootElement(name = "RruVoltePerMcsHourlyGetResponse")
public class RruVoltePerMcsHourlyGetResponse {

    @XmlElement(name = "RruVoltePerMcsHourlyGetResult")
    protected StatsLteRruVoltePerMcsResponse rruVoltePerMcsHourlyGetResult;

    /**
     * Gets the value of the rruVoltePerMcsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruVoltePerMcsResponse }
     *     
     */
    public StatsLteRruVoltePerMcsResponse getRruVoltePerMcsHourlyGetResult() {
        return rruVoltePerMcsHourlyGetResult;
    }

    /**
     * Sets the value of the rruVoltePerMcsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruVoltePerMcsResponse }
     *     
     */
    public void setRruVoltePerMcsHourlyGetResult(StatsLteRruVoltePerMcsResponse value) {
        this.rruVoltePerMcsHourlyGetResult = value;
    }

}
