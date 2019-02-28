
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
 *         &lt;element name="GtpHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteGtpResponse" minOccurs="0"/&gt;
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
    "gtpHourlyGetResult"
})
@XmlRootElement(name = "GtpHourlyGetResponse")
public class GtpHourlyGetResponse {

    @XmlElement(name = "GtpHourlyGetResult")
    protected StatsLteGtpResponse gtpHourlyGetResult;

    /**
     * Gets the value of the gtpHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteGtpResponse }
     *     
     */
    public StatsLteGtpResponse getGtpHourlyGetResult() {
        return gtpHourlyGetResult;
    }

    /**
     * Sets the value of the gtpHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteGtpResponse }
     *     
     */
    public void setGtpHourlyGetResult(StatsLteGtpResponse value) {
        this.gtpHourlyGetResult = value;
    }

}
