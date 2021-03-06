
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
 *         &lt;element name="AnrHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteAnrResponse" minOccurs="0"/&gt;
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
    "anrHourlyGetResult"
})
@XmlRootElement(name = "AnrHourlyGetResponse")
public class AnrHourlyGetResponse {

    @XmlElement(name = "AnrHourlyGetResult")
    protected StatsLteAnrResponse anrHourlyGetResult;

    /**
     * Gets the value of the anrHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public StatsLteAnrResponse getAnrHourlyGetResult() {
        return anrHourlyGetResult;
    }

    /**
     * Sets the value of the anrHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public void setAnrHourlyGetResult(StatsLteAnrResponse value) {
        this.anrHourlyGetResult = value;
    }

}
