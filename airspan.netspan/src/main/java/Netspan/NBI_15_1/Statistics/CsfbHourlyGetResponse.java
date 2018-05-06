
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="CsfbHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCsfbResponse" minOccurs="0"/>
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
    "csfbHourlyGetResult"
})
@XmlRootElement(name = "CsfbHourlyGetResponse")
public class CsfbHourlyGetResponse {

    @XmlElement(name = "CsfbHourlyGetResult")
    protected StatsLteCsfbResponse csfbHourlyGetResult;

    /**
     * Gets the value of the csfbHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCsfbResponse }
     *     
     */
    public StatsLteCsfbResponse getCsfbHourlyGetResult() {
        return csfbHourlyGetResult;
    }

    /**
     * Sets the value of the csfbHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCsfbResponse }
     *     
     */
    public void setCsfbHourlyGetResult(StatsLteCsfbResponse value) {
        this.csfbHourlyGetResult = value;
    }

}
