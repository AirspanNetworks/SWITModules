
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
 *         &lt;element name="RachPreamblesSentRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachPreamblesSentResponse" minOccurs="0"/&gt;
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
    "rachPreamblesSentRawGetResult"
})
@XmlRootElement(name = "RachPreamblesSentRawGetResponse")
public class RachPreamblesSentRawGetResponse {

    @XmlElement(name = "RachPreamblesSentRawGetResult")
    protected StatsLteRachPreamblesSentResponse rachPreamblesSentRawGetResult;

    /**
     * Gets the value of the rachPreamblesSentRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public StatsLteRachPreamblesSentResponse getRachPreamblesSentRawGetResult() {
        return rachPreamblesSentRawGetResult;
    }

    /**
     * Sets the value of the rachPreamblesSentRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachPreamblesSentResponse }
     *     
     */
    public void setRachPreamblesSentRawGetResult(StatsLteRachPreamblesSentResponse value) {
        this.rachPreamblesSentRawGetResult = value;
    }

}
