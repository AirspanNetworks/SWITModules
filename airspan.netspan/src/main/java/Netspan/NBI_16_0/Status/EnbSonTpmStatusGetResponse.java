
package Netspan.NBI_16_0.Status;

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
 *         &lt;element name="EnbSonTpmStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteSonTpmGetResult" minOccurs="0"/>
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
    "enbSonTpmStatusGetResult"
})
@XmlRootElement(name = "EnbSonTpmStatusGetResponse")
public class EnbSonTpmStatusGetResponse {

    @XmlElement(name = "EnbSonTpmStatusGetResult")
    protected LteSonTpmGetResult enbSonTpmStatusGetResult;

    /**
     * Gets the value of the enbSonTpmStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteSonTpmGetResult }
     *     
     */
    public LteSonTpmGetResult getEnbSonTpmStatusGetResult() {
        return enbSonTpmStatusGetResult;
    }

    /**
     * Sets the value of the enbSonTpmStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSonTpmGetResult }
     *     
     */
    public void setEnbSonTpmStatusGetResult(LteSonTpmGetResult value) {
        this.enbSonTpmStatusGetResult = value;
    }

}
