
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="PerPlmnHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePerPlmnResponse" minOccurs="0"/&gt;
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
    "perPlmnHourlyGetResult"
})
@XmlRootElement(name = "PerPlmnHourlyGetResponse")
public class PerPlmnHourlyGetResponse {

    @XmlElement(name = "PerPlmnHourlyGetResult")
    protected StatsLtePerPlmnResponse perPlmnHourlyGetResult;

    /**
     * Gets the value of the perPlmnHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePerPlmnResponse }
     *     
     */
    public StatsLtePerPlmnResponse getPerPlmnHourlyGetResult() {
        return perPlmnHourlyGetResult;
    }

    /**
     * Sets the value of the perPlmnHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePerPlmnResponse }
     *     
     */
    public void setPerPlmnHourlyGetResult(StatsLtePerPlmnResponse value) {
        this.perPlmnHourlyGetResult = value;
    }

}
