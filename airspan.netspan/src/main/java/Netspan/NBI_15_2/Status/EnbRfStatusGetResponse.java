
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnbRfStatusGetResult" type="{http://Airspan.Netspan.WebServices}LteRfGetResult" minOccurs="0"/&gt;
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
    "enbRfStatusGetResult"
})
@XmlRootElement(name = "EnbRfStatusGetResponse")
public class EnbRfStatusGetResponse {

    @XmlElement(name = "EnbRfStatusGetResult")
    protected LteRfGetResult enbRfStatusGetResult;

    /**
     * Gets the value of the enbRfStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteRfGetResult }
     *     
     */
    public LteRfGetResult getEnbRfStatusGetResult() {
        return enbRfStatusGetResult;
    }

    /**
     * Sets the value of the enbRfStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteRfGetResult }
     *     
     */
    public void setEnbRfStatusGetResult(LteRfGetResult value) {
        this.enbRfStatusGetResult = value;
    }

}
