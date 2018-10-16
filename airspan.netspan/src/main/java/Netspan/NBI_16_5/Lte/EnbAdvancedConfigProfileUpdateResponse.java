
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
 *         &lt;element name="EnbAdvancedConfigProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "enbAdvancedConfigProfileUpdateResult"
})
@XmlRootElement(name = "EnbAdvancedConfigProfileUpdateResponse")
public class EnbAdvancedConfigProfileUpdateResponse {

    @XmlElement(name = "EnbAdvancedConfigProfileUpdateResult")
    protected ProfileResponse enbAdvancedConfigProfileUpdateResult;

    /**
     * Gets the value of the enbAdvancedConfigProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getEnbAdvancedConfigProfileUpdateResult() {
        return enbAdvancedConfigProfileUpdateResult;
    }

    /**
     * Sets the value of the enbAdvancedConfigProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setEnbAdvancedConfigProfileUpdateResult(ProfileResponse value) {
        this.enbAdvancedConfigProfileUpdateResult = value;
    }

}
