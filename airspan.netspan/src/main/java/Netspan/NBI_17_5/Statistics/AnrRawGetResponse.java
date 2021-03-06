
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
 *         &lt;element name="AnrRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteAnrResponse" minOccurs="0"/&gt;
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
