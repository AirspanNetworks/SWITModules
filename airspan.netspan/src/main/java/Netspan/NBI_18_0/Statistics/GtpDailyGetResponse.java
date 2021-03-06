
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
 *         &lt;element name="GtpDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteGtpResponse" minOccurs="0"/&gt;
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
    "gtpDailyGetResult"
})
@XmlRootElement(name = "GtpDailyGetResponse")
public class GtpDailyGetResponse {

    @XmlElement(name = "GtpDailyGetResult")
    protected StatsLteGtpResponse gtpDailyGetResult;

    /**
     * Gets the value of the gtpDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteGtpResponse }
     *     
     */
    public StatsLteGtpResponse getGtpDailyGetResult() {
        return gtpDailyGetResult;
    }

    /**
     * Sets the value of the gtpDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteGtpResponse }
     *     
     */
    public void setGtpDailyGetResult(StatsLteGtpResponse value) {
        this.gtpDailyGetResult = value;
    }

}
