
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
 *         &lt;element name="BsIbBaseAirInterfaceUsageHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceUsageResponse" minOccurs="0"/&gt;
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
    "bsIbBaseAirInterfaceUsageHourlyGetResult"
})
@XmlRootElement(name = "BsIbBaseAirInterfaceUsageHourlyGetResponse")
public class BsIbBaseAirInterfaceUsageHourlyGetResponse {

    @XmlElement(name = "BsIbBaseAirInterfaceUsageHourlyGetResult")
    protected StatsBsIbBaseAirInterfaceUsageResponse bsIbBaseAirInterfaceUsageHourlyGetResult;

    /**
     * Gets the value of the bsIbBaseAirInterfaceUsageHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseAirInterfaceUsageResponse }
     *     
     */
    public StatsBsIbBaseAirInterfaceUsageResponse getBsIbBaseAirInterfaceUsageHourlyGetResult() {
        return bsIbBaseAirInterfaceUsageHourlyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseAirInterfaceUsageHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseAirInterfaceUsageResponse }
     *     
     */
    public void setBsIbBaseAirInterfaceUsageHourlyGetResult(StatsBsIbBaseAirInterfaceUsageResponse value) {
        this.bsIbBaseAirInterfaceUsageHourlyGetResult = value;
    }

}
