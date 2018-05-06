
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
 *         &lt;element name="BsIbBaseAirInterfaceUsageRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceUsageResponse" minOccurs="0"/>
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
    "bsIbBaseAirInterfaceUsageRawGetResult"
})
@XmlRootElement(name = "BsIbBaseAirInterfaceUsageRawGetResponse")
public class BsIbBaseAirInterfaceUsageRawGetResponse {

    @XmlElement(name = "BsIbBaseAirInterfaceUsageRawGetResult")
    protected StatsBsIbBaseAirInterfaceUsageResponse bsIbBaseAirInterfaceUsageRawGetResult;

    /**
     * Gets the value of the bsIbBaseAirInterfaceUsageRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseAirInterfaceUsageResponse }
     *     
     */
    public StatsBsIbBaseAirInterfaceUsageResponse getBsIbBaseAirInterfaceUsageRawGetResult() {
        return bsIbBaseAirInterfaceUsageRawGetResult;
    }

    /**
     * Sets the value of the bsIbBaseAirInterfaceUsageRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseAirInterfaceUsageResponse }
     *     
     */
    public void setBsIbBaseAirInterfaceUsageRawGetResult(StatsBsIbBaseAirInterfaceUsageResponse value) {
        this.bsIbBaseAirInterfaceUsageRawGetResult = value;
    }

}
