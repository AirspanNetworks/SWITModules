
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
 *         &lt;element name="AnrRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteAnrResponse" minOccurs="0"/>
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
    "anrRawGetResult"
})
@XmlRootElement(name = "AnrRawGetResponse")
public class AnrRawGetResponse {

    @XmlElement(name = "AnrRawGetResult")
    protected StatsLteAnrResponse anrRawGetResult;

    /**
     * Gets the value of the anrRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public StatsLteAnrResponse getAnrRawGetResult() {
        return anrRawGetResult;
    }

    /**
     * Sets the value of the anrRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteAnrResponse }
     *     
     */
    public void setAnrRawGetResult(StatsLteAnrResponse value) {
        this.anrRawGetResult = value;
    }

}
