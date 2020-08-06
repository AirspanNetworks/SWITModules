
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
 *         &lt;element name="EtwsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEtwsResponse" minOccurs="0"/&gt;
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
    "etwsHourlyGetResult"
})
@XmlRootElement(name = "EtwsHourlyGetResponse")
public class EtwsHourlyGetResponse {

    @XmlElement(name = "EtwsHourlyGetResult")
    protected StatsLteEtwsResponse etwsHourlyGetResult;

    /**
     * Gets the value of the etwsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public StatsLteEtwsResponse getEtwsHourlyGetResult() {
        return etwsHourlyGetResult;
    }

    /**
     * Sets the value of the etwsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public void setEtwsHourlyGetResult(StatsLteEtwsResponse value) {
        this.etwsHourlyGetResult = value;
    }

}
