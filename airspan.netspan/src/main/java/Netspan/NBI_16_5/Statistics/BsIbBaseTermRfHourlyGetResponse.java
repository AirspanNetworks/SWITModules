
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
 *         &lt;element name="BsIbBaseTermRfHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermRfResponse" minOccurs="0"/&gt;
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
