
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
 *         &lt;element name="BsIbBaseTermRfHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermRfResponse" minOccurs="0"/>
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
    "bsIbBaseTermRfHourlyGetResult"
})
@XmlRootElement(name = "BsIbBaseTermRfHourlyGetResponse")
public class BsIbBaseTermRfHourlyGetResponse {

    @XmlElement(name = "BsIbBaseTermRfHourlyGetResult")
    protected StatsBsIbBaseTermRfResponse bsIbBaseTermRfHourlyGetResult;

    /**
     * Gets the value of the bsIbBaseTermRfHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public StatsBsIbBaseTermRfResponse getBsIbBaseTermRfHourlyGetResult() {
        return bsIbBaseTermRfHourlyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseTermRfHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public void setBsIbBaseTermRfHourlyGetResult(StatsBsIbBaseTermRfResponse value) {
        this.bsIbBaseTermRfHourlyGetResult = value;
    }

}
