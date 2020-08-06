
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
 *         &lt;element name="DynamicAcbDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteDynamicAcbResponse" minOccurs="0"/&gt;
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
    "dynamicAcbDailyGetResult"
})
@XmlRootElement(name = "DynamicAcbDailyGetResponse")
public class DynamicAcbDailyGetResponse {

    @XmlElement(name = "DynamicAcbDailyGetResult")
    protected StatsLteDynamicAcbResponse dynamicAcbDailyGetResult;

    /**
     * Gets the value of the dynamicAcbDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteDynamicAcbResponse }
     *     
     */
    public StatsLteDynamicAcbResponse getDynamicAcbDailyGetResult() {
        return dynamicAcbDailyGetResult;
    }

    /**
     * Sets the value of the dynamicAcbDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteDynamicAcbResponse }
     *     
     */
    public void setDynamicAcbDailyGetResult(StatsLteDynamicAcbResponse value) {
        this.dynamicAcbDailyGetResult = value;
    }

}
