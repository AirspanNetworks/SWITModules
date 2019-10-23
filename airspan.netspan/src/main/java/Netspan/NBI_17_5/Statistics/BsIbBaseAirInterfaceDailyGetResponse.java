
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="BsIbBaseAirInterfaceDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseAirInterfaceResponse" minOccurs="0"/&gt;
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
    "bsIbBaseAirInterfaceDailyGetResult"
})
@XmlRootElement(name = "BsIbBaseAirInterfaceDailyGetResponse")
public class BsIbBaseAirInterfaceDailyGetResponse {

    @XmlElement(name = "BsIbBaseAirInterfaceDailyGetResult")
    protected StatsBsIbBaseAirInterfaceResponse bsIbBaseAirInterfaceDailyGetResult;

    /**
     * Gets the value of the bsIbBaseAirInterfaceDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public StatsBsIbBaseAirInterfaceResponse getBsIbBaseAirInterfaceDailyGetResult() {
        return bsIbBaseAirInterfaceDailyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseAirInterfaceDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseAirInterfaceResponse }
     *     
     */
    public void setBsIbBaseAirInterfaceDailyGetResult(StatsBsIbBaseAirInterfaceResponse value) {
        this.bsIbBaseAirInterfaceDailyGetResult = value;
    }

}
