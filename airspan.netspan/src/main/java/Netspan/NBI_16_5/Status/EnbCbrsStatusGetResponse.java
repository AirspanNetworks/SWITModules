
package Netspan.NBI_16_5.Status;

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
 *         &lt;element name="EnbCbrsStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteCbrsGetResult" minOccurs="0"/&gt;
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
