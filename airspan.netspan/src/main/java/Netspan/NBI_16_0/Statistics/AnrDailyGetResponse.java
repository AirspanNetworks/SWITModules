
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
 *         &lt;element name="AnrDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteAnrResponse" minOccurs="0"/>
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
    "anrDailyGetResult"
})
@XmlRootElement(name = "AnrDailyGetResponse")
public class AnrDailyGetResponse {

    @XmlElement(name = "AnrDailyGetResult")
    protected StatsLteAnrResponse anrDailyGetResult;

    /**
     * Gets the value of the anrDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public StatsLteAnrResponse getAnrDailyGetResult() {
        return anrDailyGetResult;
    }

    /**
     * Sets the value of the anrDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public void setAnrDailyGetResult(StatsLteAnrResponse value) {
        this.anrDailyGetResult = value;
    }

}
