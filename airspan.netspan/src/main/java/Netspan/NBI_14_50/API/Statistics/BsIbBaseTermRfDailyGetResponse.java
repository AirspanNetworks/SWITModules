
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
 *         &lt;element name="BsIbBaseTermRfDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermRfResponse" minOccurs="0"/>
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
    "bsIbBaseTermRfDailyGetResult"
})
@XmlRootElement(name = "BsIbBaseTermRfDailyGetResponse")
public class BsIbBaseTermRfDailyGetResponse {

    @XmlElement(name = "BsIbBaseTermRfDailyGetResult")
    protected StatsBsIbBaseTermRfResponse bsIbBaseTermRfDailyGetResult;

    /**
     * Gets the value of the bsIbBaseTermRfDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public StatsBsIbBaseTermRfResponse getBsIbBaseTermRfDailyGetResult() {
        return bsIbBaseTermRfDailyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseTermRfDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public void setBsIbBaseTermRfDailyGetResult(StatsBsIbBaseTermRfResponse value) {
        this.bsIbBaseTermRfDailyGetResult = value;
    }

}
