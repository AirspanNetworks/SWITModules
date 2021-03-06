
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
 *         &lt;element name="CmasHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCmasResponse" minOccurs="0"/>
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
    "cmasHourlyGetResult"
})
@XmlRootElement(name = "CmasHourlyGetResponse")
public class CmasHourlyGetResponse {

    @XmlElement(name = "CmasHourlyGetResult")
    protected StatsLteCmasResponse cmasHourlyGetResult;

    /**
     * Gets the value of the cmasHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public StatsLteCmasResponse getCmasHourlyGetResult() {
        return cmasHourlyGetResult;
    }

    /**
     * Sets the value of the cmasHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public void setCmasHourlyGetResult(StatsLteCmasResponse value) {
        this.cmasHourlyGetResult = value;
    }

}
