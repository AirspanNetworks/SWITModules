
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="CmasDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCmasResponse" minOccurs="0"/&gt;
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
    "cmasDailyGetResult"
})
@XmlRootElement(name = "CmasDailyGetResponse")
public class CmasDailyGetResponse {

    @XmlElement(name = "CmasDailyGetResult")
    protected StatsLteCmasResponse cmasDailyGetResult;

    /**
     * Gets the value of the cmasDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public StatsLteCmasResponse getCmasDailyGetResult() {
        return cmasDailyGetResult;
    }

    /**
     * Sets the value of the cmasDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public void setCmasDailyGetResult(StatsLteCmasResponse value) {
        this.cmasDailyGetResult = value;
    }

}
