
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
 *         &lt;element name="RachPreamblesSentHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachPreamblesSentResponse" minOccurs="0"/>
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
    "rachPreamblesSentHourlyGetResult"
})
@XmlRootElement(name = "RachPreamblesSentHourlyGetResponse")
public class RachPreamblesSentHourlyGetResponse {

    @XmlElement(name = "RachPreamblesSentHourlyGetResult")
    protected StatsLteRachPreamblesSentResponse rachPreamblesSentHourlyGetResult;

    /**
     * Gets the value of the rachPreamblesSentHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public StatsLteRachPreamblesSentResponse getRachPreamblesSentHourlyGetResult() {
        return rachPreamblesSentHourlyGetResult;
    }

    /**
     * Sets the value of the rachPreamblesSentHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public void setRachPreamblesSentHourlyGetResult(StatsLteRachPreamblesSentResponse value) {
        this.rachPreamblesSentHourlyGetResult = value;
    }

}
