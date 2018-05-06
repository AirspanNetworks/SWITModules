
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="RrcConnectionDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRrcConnectionResponse" minOccurs="0"/>
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
    "rrcConnectionDailyGetResult"
})
@XmlRootElement(name = "RrcConnectionDailyGetResponse")
public class RrcConnectionDailyGetResponse {

    @XmlElement(name = "RrcConnectionDailyGetResult")
    protected StatsLteRrcConnectionResponse rrcConnectionDailyGetResult;

    /**
     * Gets the value of the rrcConnectionDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRrcConnectionResponse }
     *     
     */
    public StatsLteRrcConnectionResponse getRrcConnectionDailyGetResult() {
        return rrcConnectionDailyGetResult;
    }

    /**
     * Sets the value of the rrcConnectionDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRrcConnectionResponse }
     *     
     */
    public void setRrcConnectionDailyGetResult(StatsLteRrcConnectionResponse value) {
        this.rrcConnectionDailyGetResult = value;
    }

}
