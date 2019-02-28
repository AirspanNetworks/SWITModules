
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
 *         &lt;element name="IbMmWirelessHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIbMmWirelessResponse" minOccurs="0"/&gt;
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
    "ibMmWirelessHourlyGetResult"
})
@XmlRootElement(name = "IbMmWirelessHourlyGetResponse")
public class IbMmWirelessHourlyGetResponse {

    @XmlElement(name = "IbMmWirelessHourlyGetResult")
    protected StatsIbMmWirelessResponse ibMmWirelessHourlyGetResult;

    /**
     * Gets the value of the ibMmWirelessHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIbMmWirelessResponse }
     *     
     */
    public StatsIbMmWirelessResponse getIbMmWirelessHourlyGetResult() {
        return ibMmWirelessHourlyGetResult;
    }

    /**
     * Sets the value of the ibMmWirelessHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIbMmWirelessResponse }
     *     
     */
    public void setIbMmWirelessHourlyGetResult(StatsIbMmWirelessResponse value) {
        this.ibMmWirelessHourlyGetResult = value;
    }

}
