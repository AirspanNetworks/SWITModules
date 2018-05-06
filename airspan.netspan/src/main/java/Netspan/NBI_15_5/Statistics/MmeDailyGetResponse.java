
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
 *         &lt;element name="MmeDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMmeResponse" minOccurs="0"/>
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
    "mmeDailyGetResult"
})
@XmlRootElement(name = "MmeDailyGetResponse")
public class MmeDailyGetResponse {

    @XmlElement(name = "MmeDailyGetResult")
    protected StatsLteMmeResponse mmeDailyGetResult;

    /**
     * Gets the value of the mmeDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public StatsLteMmeResponse getMmeDailyGetResult() {
        return mmeDailyGetResult;
    }

    /**
     * Sets the value of the mmeDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMmeResponse }
     *     
     */
    public void setMmeDailyGetResult(StatsLteMmeResponse value) {
        this.mmeDailyGetResult = value;
    }

}
