
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
 *         &lt;element name="SubBandCqiHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelSubBandCqiResponse" minOccurs="0"/&gt;
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
    "subBandCqiHourlyGetResult"
})
@XmlRootElement(name = "SubBandCqiHourlyGetResponse")
public class SubBandCqiHourlyGetResponse {

    @XmlElement(name = "SubBandCqiHourlyGetResult")
    protected StatsLteCellLevelSubBandCqiResponse subBandCqiHourlyGetResult;

    /**
     * Gets the value of the subBandCqiHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelSubBandCqiResponse }
     *     
     */
    public StatsLteCellLevelSubBandCqiResponse getSubBandCqiHourlyGetResult() {
        return subBandCqiHourlyGetResult;
    }

    /**
     * Sets the value of the subBandCqiHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelSubBandCqiResponse }
     *     
     */
    public void setSubBandCqiHourlyGetResult(StatsLteCellLevelSubBandCqiResponse value) {
        this.subBandCqiHourlyGetResult = value;
    }

}
