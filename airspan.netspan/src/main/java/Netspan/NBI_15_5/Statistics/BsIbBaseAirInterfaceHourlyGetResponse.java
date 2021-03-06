
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="BsIbBaseAirInterfaceHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceResponse" minOccurs="0"/>
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
    "bsIbBaseAirInterfaceHourlyGetResult"
})
@XmlRootElement(name = "BsIbBaseAirInterfaceHourlyGetResponse")
public class BsIbBaseAirInterfaceHourlyGetResponse {

    @XmlElement(name = "BsIbBaseAirInterfaceHourlyGetResult")
    protected StatsBsIbBaseAirInterfaceResponse bsIbBaseAirInterfaceHourlyGetResult;

    /**
     * Gets the value of the bsIbBaseAirInterfaceHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public StatsBsIbBaseAirInterfaceResponse getBsIbBaseAirInterfaceHourlyGetResult() {
        return bsIbBaseAirInterfaceHourlyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseAirInterfaceHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public void setBsIbBaseAirInterfaceHourlyGetResult(StatsBsIbBaseAirInterfaceResponse value) {
        this.bsIbBaseAirInterfaceHourlyGetResult = value;
    }

}
