
package Netspan.NBI_16_0.Statistics;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RruPerMcsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerMcsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rruPerMcsDailyGetResult"
})
@XmlRootElement(name = "RruPerMcsDailyGetResponse")
public class RruPerMcsDailyGetResponse {

    @XmlElement(name = "RruPerMcsDailyGetResult")
    protected StatsLteRruPerMcsResponse rruPerMcsDailyGetResult;

    /**
     * Gets the value of the rruPerMcsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerMcsResponse }
     *     
     */
    public StatsLteRruPerMcsResponse getRruPerMcsDailyGetResult() {
        return rruPerMcsDailyGetResult;
    }

    /**
     * Sets the value of the rruPerMcsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerMcsResponse }
     *     
     */
    public void setRruPerMcsDailyGetResult(StatsLteRruPerMcsResponse value) {
        this.rruPerMcsDailyGetResult = value;
    }

}
