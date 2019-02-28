
package Netspan.NBI_17_0.Statistics;

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
 *         &lt;element name="LiteCompHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteLiteCompResponse" minOccurs="0"/&gt;
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
    "liteCompHourlyGetResult"
})
@XmlRootElement(name = "LiteCompHourlyGetResponse")
public class LiteCompHourlyGetResponse {

    @XmlElement(name = "LiteCompHourlyGetResult")
    protected StatsLteLiteCompResponse liteCompHourlyGetResult;

    /**
     * Gets the value of the liteCompHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteLiteCompResponse }
     *     
     */
    public StatsLteLiteCompResponse getLiteCompHourlyGetResult() {
        return liteCompHourlyGetResult;
    }

    /**
     * Sets the value of the liteCompHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteLiteCompResponse }
     *     
     */
    public void setLiteCompHourlyGetResult(StatsLteLiteCompResponse value) {
        this.liteCompHourlyGetResult = value;
    }

}
