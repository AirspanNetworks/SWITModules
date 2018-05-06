
package Netspan.NBI_15_2.Status;

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
 *         &lt;element name="EnbCbrsStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteCbrsGetResult" minOccurs="0"/>
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
    "enbCbrsStatusGetResult"
})
@XmlRootElement(name = "EnbCbrsStatusGetResponse")
public class EnbCbrsStatusGetResponse {

    @XmlElement(name = "EnbCbrsStatusGetResult")
    protected LteCbrsGetResult enbCbrsStatusGetResult;

    /**
     * Gets the value of the enbCbrsStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCbrsGetResult }
     *     
     */
    public LteCbrsGetResult getEnbCbrsStatusGetResult() {
        return enbCbrsStatusGetResult;
    }

    /**
     * Sets the value of the enbCbrsStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCbrsGetResult }
     *     
     */
    public void setEnbCbrsStatusGetResult(LteCbrsGetResult value) {
        this.enbCbrsStatusGetResult = value;
    }

}
