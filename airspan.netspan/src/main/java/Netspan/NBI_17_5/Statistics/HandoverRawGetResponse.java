
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
 *         &lt;element name="HandoverRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHandoverResponse" minOccurs="0"/&gt;
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
    "handoverRawGetResult"
})
@XmlRootElement(name = "HandoverRawGetResponse")
public class HandoverRawGetResponse {

    @XmlElement(name = "HandoverRawGetResult")
    protected StatsLteHandoverResponse handoverRawGetResult;

    /**
     * Gets the value of the handoverRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public StatsLteHandoverResponse getHandoverRawGetResult() {
        return handoverRawGetResult;
    }

    /**
     * Sets the value of the handoverRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public void setHandoverRawGetResult(StatsLteHandoverResponse value) {
        this.handoverRawGetResult = value;
    }

}
