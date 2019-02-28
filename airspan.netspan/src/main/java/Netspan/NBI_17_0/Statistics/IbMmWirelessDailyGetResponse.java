
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
 *         &lt;element name="IbMmWirelessDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIbMmWirelessResponse" minOccurs="0"/&gt;
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
    "ibMmWirelessDailyGetResult"
})
@XmlRootElement(name = "IbMmWirelessDailyGetResponse")
public class IbMmWirelessDailyGetResponse {

    @XmlElement(name = "IbMmWirelessDailyGetResult")
    protected StatsIbMmWirelessResponse ibMmWirelessDailyGetResult;

    /**
     * Gets the value of the ibMmWirelessDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIbMmWirelessResponse }
     *     
     */
    public StatsIbMmWirelessResponse getIbMmWirelessDailyGetResult() {
        return ibMmWirelessDailyGetResult;
    }

    /**
     * Sets the value of the ibMmWirelessDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIbMmWirelessResponse }
     *     
     */
    public void setIbMmWirelessDailyGetResult(StatsIbMmWirelessResponse value) {
        this.ibMmWirelessDailyGetResult = value;
    }

}
