
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
 *         &lt;element name="RachAccessDelayRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRachAccessDelayResponse" minOccurs="0"/&gt;
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
    "rachAccessDelayRawGetResult"
})
@XmlRootElement(name = "RachAccessDelayRawGetResponse")
public class RachAccessDelayRawGetResponse {

    @XmlElement(name = "RachAccessDelayRawGetResult")
    protected StatsLteRachAccessDelayResponse rachAccessDelayRawGetResult;

    /**
     * Gets the value of the rachAccessDelayRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public StatsLteRachAccessDelayResponse getRachAccessDelayRawGetResult() {
        return rachAccessDelayRawGetResult;
    }

    /**
     * Sets the value of the rachAccessDelayRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRachAccessDelayResponse }
     *     
     */
    public void setRachAccessDelayRawGetResult(StatsLteRachAccessDelayResponse value) {
        this.rachAccessDelayRawGetResult = value;
    }

}
