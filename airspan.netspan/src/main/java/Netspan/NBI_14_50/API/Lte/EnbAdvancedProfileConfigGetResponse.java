
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="EnbAdvancedProfileConfigGetResult" type="{http://Airspan.Netspan.WebServices}LteAdvancedProfileGetResult" minOccurs="0"/>
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
    "enbAdvancedProfileConfigGetResult"
})
@XmlRootElement(name = "EnbAdvancedProfileConfigGetResponse")
public class EnbAdvancedProfileConfigGetResponse {

    @XmlElement(name = "EnbAdvancedProfileConfigGetResult")
    protected LteAdvancedProfileGetResult enbAdvancedProfileConfigGetResult;

    /**
     * Gets the value of the enbAdvancedProfileConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteAdvancedProfileGetResult }
     *     
     */
    public LteAdvancedProfileGetResult getEnbAdvancedProfileConfigGetResult() {
        return enbAdvancedProfileConfigGetResult;
    }

    /**
     * Sets the value of the enbAdvancedProfileConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteAdvancedProfileGetResult }
     *     
     */
    public void setEnbAdvancedProfileConfigGetResult(LteAdvancedProfileGetResult value) {
        this.enbAdvancedProfileConfigGetResult = value;
    }

}
