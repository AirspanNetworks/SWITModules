
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
 *         &lt;element name="HandoverDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHandoverResponse" minOccurs="0"/&gt;
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
    "handoverDailyGetResult"
})
@XmlRootElement(name = "HandoverDailyGetResponse")
public class HandoverDailyGetResponse {

    @XmlElement(name = "HandoverDailyGetResult")
    protected StatsLteHandoverResponse handoverDailyGetResult;

    /**
     * Gets the value of the handoverDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public StatsLteHandoverResponse getHandoverDailyGetResult() {
        return handoverDailyGetResult;
    }

    /**
     * Sets the value of the handoverDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public void setHandoverDailyGetResult(StatsLteHandoverResponse value) {
        this.handoverDailyGetResult = value;
    }

}
