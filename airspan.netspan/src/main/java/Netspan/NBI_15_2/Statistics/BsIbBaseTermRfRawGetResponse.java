
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="BsIbBaseTermRfRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsBsIbBaseTermRfResponse" minOccurs="0"/>
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
    "bsIbBaseTermRfRawGetResult"
})
@XmlRootElement(name = "BsIbBaseTermRfRawGetResponse")
public class BsIbBaseTermRfRawGetResponse {

    @XmlElement(name = "BsIbBaseTermRfRawGetResult")
    protected StatsBsIbBaseTermRfResponse bsIbBaseTermRfRawGetResult;

    /**
     * Gets the value of the bsIbBaseTermRfRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public StatsBsIbBaseTermRfResponse getBsIbBaseTermRfRawGetResult() {
        return bsIbBaseTermRfRawGetResult;
    }

    /**
     * Sets the value of the bsIbBaseTermRfRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsBsIbBaseTermRfResponse }
     *     
     */
    public void setBsIbBaseTermRfRawGetResult(StatsBsIbBaseTermRfResponse value) {
        this.bsIbBaseTermRfRawGetResult = value;
    }

}
