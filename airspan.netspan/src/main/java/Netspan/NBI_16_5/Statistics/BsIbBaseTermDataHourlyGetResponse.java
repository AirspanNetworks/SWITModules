
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
 *         &lt;element name="BsIbBaseTermDataHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermDataResponse" minOccurs="0"/&gt;
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
    "bsIbBaseTermDataHourlyGetResult"
})
@XmlRootElement(name = "BsIbBaseTermDataHourlyGetResponse")
public class BsIbBaseTermDataHourlyGetResponse {

    @XmlElement(name = "BsIbBaseTermDataHourlyGetResult")
    protected StatsBsIbBaseTermDataResponse bsIbBaseTermDataHourlyGetResult;

    /**
     * Gets the value of the bsIbBaseTermDataHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseTermDataResponse }
     *     
     */
    public StatsBsIbBaseTermDataResponse getBsIbBaseTermDataHourlyGetResult() {
        return bsIbBaseTermDataHourlyGetResult;
    }

    /**
     * Sets the value of the bsIbBaseTermDataHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseTermDataResponse }
     *     
     */
    public void setBsIbBaseTermDataHourlyGetResult(StatsBsIbBaseTermDataResponse value) {
        this.bsIbBaseTermDataHourlyGetResult = value;
    }

}
