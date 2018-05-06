
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
 *         &lt;element name="RachAccessDelayHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachAccessDelayResponse" minOccurs="0"/>
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
    "rachAccessDelayHourlyGetResult"
})
@XmlRootElement(name = "RachAccessDelayHourlyGetResponse")
public class RachAccessDelayHourlyGetResponse {

    @XmlElement(name = "RachAccessDelayHourlyGetResult")
    protected StatsLteRachAccessDelayResponse rachAccessDelayHourlyGetResult;

    /**
     * Gets the value of the rachAccessDelayHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public StatsLteRachAccessDelayResponse getRachAccessDelayHourlyGetResult() {
        return rachAccessDelayHourlyGetResult;
    }

    /**
     * Sets the value of the rachAccessDelayHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public void setRachAccessDelayHourlyGetResult(StatsLteRachAccessDelayResponse value) {
        this.rachAccessDelayHourlyGetResult = value;
    }

}
