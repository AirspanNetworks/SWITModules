
package Netspan.NBI_17_5.Status;

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
 *         &lt;element name="EnbTwampStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteTwampGetResult" minOccurs="0"/&gt;
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
    "enbTwampStatusGetResult"
})
@XmlRootElement(name = "EnbTwampStatusGetResponse")
public class EnbTwampStatusGetResponse {

    @XmlElement(name = "EnbTwampStatusGetResult")
    protected LteTwampGetResult enbTwampStatusGetResult;

    /**
     * Gets the value of the enbTwampStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteTwampGetResult }
     *     
     */
    public LteTwampGetResult getEnbTwampStatusGetResult() {
        return enbTwampStatusGetResult;
    }

    /**
     * Sets the value of the enbTwampStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteTwampGetResult }
     *     
     */
    public void setEnbTwampStatusGetResult(LteTwampGetResult value) {
        this.enbTwampStatusGetResult = value;
    }

}
