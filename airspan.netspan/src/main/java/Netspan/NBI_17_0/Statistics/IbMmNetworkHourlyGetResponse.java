
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
 *         &lt;element name="IbMmNetworkHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIbMmNetworkResponse" minOccurs="0"/&gt;
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
    "ibMmNetworkHourlyGetResult"
})
@XmlRootElement(name = "IbMmNetworkHourlyGetResponse")
public class IbMmNetworkHourlyGetResponse {

    @XmlElement(name = "IbMmNetworkHourlyGetResult")
    protected StatsIbMmNetworkResponse ibMmNetworkHourlyGetResult;

    /**
     * Gets the value of the ibMmNetworkHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIbMmNetworkResponse }
     *     
     */
    public StatsIbMmNetworkResponse getIbMmNetworkHourlyGetResult() {
        return ibMmNetworkHourlyGetResult;
    }

    /**
     * Sets the value of the ibMmNetworkHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIbMmNetworkResponse }
     *     
     */
    public void setIbMmNetworkHourlyGetResult(StatsIbMmNetworkResponse value) {
        this.ibMmNetworkHourlyGetResult = value;
    }

}
