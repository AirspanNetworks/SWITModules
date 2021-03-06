
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
 *         &lt;element name="Ib440IpDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440IpResponse" minOccurs="0"/&gt;
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
    "ib440IpDailyGetResult"
})
@XmlRootElement(name = "Ib440IpDailyGetResponse")
public class Ib440IpDailyGetResponse {

    @XmlElement(name = "Ib440IpDailyGetResult")
    protected StatsIb440IpResponse ib440IpDailyGetResult;

    /**
     * Gets the value of the ib440IpDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440IpResponse }
     *     
     */
    public StatsIb440IpResponse getIb440IpDailyGetResult() {
        return ib440IpDailyGetResult;
    }

    /**
     * Sets the value of the ib440IpDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440IpResponse }
     *     
     */
    public void setIb440IpDailyGetResult(StatsIb440IpResponse value) {
        this.ib440IpDailyGetResult = value;
    }

}
