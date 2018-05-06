
package Netspan.NBI_15_1.Statistics;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BsIbBaseAirInterfaceUsageHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceUsageResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
