
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="BsIRelayDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIRelayResponse" minOccurs="0"/>
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
    "bsIRelayDailyGetResult"
})
@XmlRootElement(name = "BsIRelayDailyGetResponse")
public class BsIRelayDailyGetResponse {

    @XmlElement(name = "BsIRelayDailyGetResult")
    protected StatsBsIRelayResponse bsIRelayDailyGetResult;

    /**
     * Gets the value of the bsIRelayDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public StatsBsIRelayResponse getBsIRelayDailyGetResult() {
        return bsIRelayDailyGetResult;
    }

    /**
     * Sets the value of the bsIRelayDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIRelayResponse }
     *     
     */
    public void setBsIRelayDailyGetResult(StatsBsIRelayResponse value) {
        this.bsIRelayDailyGetResult = value;
    }

}
