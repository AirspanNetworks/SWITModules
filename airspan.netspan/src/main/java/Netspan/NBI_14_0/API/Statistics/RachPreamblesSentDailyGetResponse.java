
package Netspan.NBI_14_0.API.Statistics;

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
 *         &lt;element name="RachPreamblesSentDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachPreamblesSentResponse" minOccurs="0"/>
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
    "rachPreamblesSentDailyGetResult"
})
@XmlRootElement(name = "RachPreamblesSentDailyGetResponse")
public class RachPreamblesSentDailyGetResponse {

    @XmlElement(name = "RachPreamblesSentDailyGetResult")
    protected StatsLteRachPreamblesSentResponse rachPreamblesSentDailyGetResult;

    /**
     * Gets the value of the rachPreamblesSentDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public StatsLteRachPreamblesSentResponse getRachPreamblesSentDailyGetResult() {
        return rachPreamblesSentDailyGetResult;
    }

    /**
     * Sets the value of the rachPreamblesSentDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public void setRachPreamblesSentDailyGetResult(StatsLteRachPreamblesSentResponse value) {
        this.rachPreamblesSentDailyGetResult = value;
    }

}
