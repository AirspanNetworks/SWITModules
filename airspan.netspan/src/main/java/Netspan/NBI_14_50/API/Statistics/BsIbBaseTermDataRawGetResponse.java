
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
 *         &lt;element name="BsIbBaseTermDataRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermDataResponse" minOccurs="0"/>
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
    "bsIbBaseTermDataRawGetResult"
})
@XmlRootElement(name = "BsIbBaseTermDataRawGetResponse")
public class BsIbBaseTermDataRawGetResponse {

    @XmlElement(name = "BsIbBaseTermDataRawGetResult")
    protected StatsBsIbBaseTermDataResponse bsIbBaseTermDataRawGetResult;

    /**
     * Gets the value of the bsIbBaseTermDataRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseTermDataResponse }
     *     
     */
    public StatsBsIbBaseTermDataResponse getBsIbBaseTermDataRawGetResult() {
        return bsIbBaseTermDataRawGetResult;
    }

    /**
     * Sets the value of the bsIbBaseTermDataRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseTermDataResponse }
     *     
     */
    public void setBsIbBaseTermDataRawGetResult(StatsBsIbBaseTermDataResponse value) {
        this.bsIbBaseTermDataRawGetResult = value;
    }

}
