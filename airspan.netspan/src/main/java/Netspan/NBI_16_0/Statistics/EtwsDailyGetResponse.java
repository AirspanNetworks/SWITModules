
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
 *         &lt;element name="EtwsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEtwsResponse" minOccurs="0"/>
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
    "etwsDailyGetResult"
})
@XmlRootElement(name = "EtwsDailyGetResponse")
public class EtwsDailyGetResponse {

    @XmlElement(name = "EtwsDailyGetResult")
    protected StatsLteEtwsResponse etwsDailyGetResult;

    /**
     * Gets the value of the etwsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public StatsLteEtwsResponse getEtwsDailyGetResult() {
        return etwsDailyGetResult;
    }

    /**
     * Sets the value of the etwsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public void setEtwsDailyGetResult(StatsLteEtwsResponse value) {
        this.etwsDailyGetResult = value;
    }

}
