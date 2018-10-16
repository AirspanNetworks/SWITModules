
package Netspan.NBI_16_5.Lte;

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
 *         &lt;element name="EnbAdvancedConfigProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteAdvancedProfileGetResult" minOccurs="0"/&gt;
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
    "enbAdvancedConfigProfileGetResult"
})
@XmlRootElement(name = "EnbAdvancedConfigProfileGetResponse")
public class EnbAdvancedConfigProfileGetResponse {

    @XmlElement(name = "EnbAdvancedConfigProfileGetResult")
    protected LteAdvancedProfileGetResult enbAdvancedConfigProfileGetResult;

    /**
     * Gets the value of the enbAdvancedConfigProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteAdvancedProfileGetResult }
     *     
     */
    public LteAdvancedProfileGetResult getEnbAdvancedConfigProfileGetResult() {
        return enbAdvancedConfigProfileGetResult;
    }

    /**
     * Sets the value of the enbAdvancedConfigProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteAdvancedProfileGetResult }
     *     
     */
    public void setEnbAdvancedConfigProfileGetResult(LteAdvancedProfileGetResult value) {
        this.enbAdvancedConfigProfileGetResult = value;
    }

}
