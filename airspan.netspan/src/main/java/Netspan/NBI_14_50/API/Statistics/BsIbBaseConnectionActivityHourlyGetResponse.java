
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
 *         &lt;element name="BsIbBaseConnectionActivityHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseConnectionActivityResponse" minOccurs="0"/>
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
    "bsIbBaseConnectionActivityHourlyGetResult"
})
@XmlRootElement(name = "BsIbBaseConnectionActivityHourlyGetResponse")
public class BsIbBaseConnectionActivityHourlyGetResponse {

    @XmlElement(name = "BsIbBaseConnectionActivityHourlyGetResult")
    protected StatsBsIbBaseConnectionActivityResponse bsIbBaseConnectionActivityHourlyGetResult;

    /**
     * Gets the value of the bsIbBaseConnectionActivityHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseConnectionActivityResponse }
     *     
     */
    public StatsBsIbBaseConnectionActivityResponse getBsIbBaseConnectionActivityHourlyGetResult() {
        return bsIbBaseConnectionActivityHourlyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseConnectionActivityHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseConnectionActivityResponse }
     *     
     */
    public void setBsIbBaseConnectionActivityHourlyGetResult(StatsBsIbBaseConnectionActivityResponse value) {
        this.bsIbBaseConnectionActivityHourlyGetResult = value;
    }

}
