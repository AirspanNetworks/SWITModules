
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
 *         &lt;element name="BsIbBaseAirInterfaceRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceResponse" minOccurs="0"/>
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
    "bsIbBaseAirInterfaceRawGetResult"
})
@XmlRootElement(name = "BsIbBaseAirInterfaceRawGetResponse")
public class BsIbBaseAirInterfaceRawGetResponse {

    @XmlElement(name = "BsIbBaseAirInterfaceRawGetResult")
    protected StatsBsIbBaseAirInterfaceResponse bsIbBaseAirInterfaceRawGetResult;

    /**
     * Gets the value of the bsIbBaseAirInterfaceRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public StatsBsIbBaseAirInterfaceResponse getBsIbBaseAirInterfaceRawGetResult() {
        return bsIbBaseAirInterfaceRawGetResult;
    }

    /**
     * Sets the value of the bsIbBaseAirInterfaceRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public void setBsIbBaseAirInterfaceRawGetResult(StatsBsIbBaseAirInterfaceResponse value) {
        this.bsIbBaseAirInterfaceRawGetResult = value;
    }

}
