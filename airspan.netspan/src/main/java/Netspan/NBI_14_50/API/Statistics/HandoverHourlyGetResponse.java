
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="HandoverHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHandoverResponse" minOccurs="0"/>
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
    "handoverHourlyGetResult"
})
@XmlRootElement(name = "HandoverHourlyGetResponse")
public class HandoverHourlyGetResponse {

    @XmlElement(name = "HandoverHourlyGetResult")
    protected StatsLteHandoverResponse handoverHourlyGetResult;

    /**
     * Gets the value of the handoverHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public StatsLteHandoverResponse getHandoverHourlyGetResult() {
        return handoverHourlyGetResult;
    }

    /**
     * Sets the value of the handoverHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHandoverResponse }
     *     
     */
    public void setHandoverHourlyGetResult(StatsLteHandoverResponse value) {
        this.handoverHourlyGetResult = value;
    }

}
