
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
 *         &lt;element name="MmeHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMmeResponse" minOccurs="0"/>
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
    "mmeHourlyGetResult"
})
@XmlRootElement(name = "MmeHourlyGetResponse")
public class MmeHourlyGetResponse {

    @XmlElement(name = "MmeHourlyGetResult")
    protected StatsLteMmeResponse mmeHourlyGetResult;

    /**
     * Gets the value of the mmeHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public StatsLteMmeResponse getMmeHourlyGetResult() {
        return mmeHourlyGetResult;
    }

    /**
     * Sets the value of the mmeHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public void setMmeHourlyGetResult(StatsLteMmeResponse value) {
        this.mmeHourlyGetResult = value;
    }

}
