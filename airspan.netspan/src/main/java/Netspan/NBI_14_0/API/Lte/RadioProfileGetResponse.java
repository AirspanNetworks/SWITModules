
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="RadioProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteRadioProfileGetResult" minOccurs="0"/>
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
    "radioProfileGetResult"
})
@XmlRootElement(name = "RadioProfileGetResponse")
public class RadioProfileGetResponse {

    @XmlElement(name = "RadioProfileGetResult")
    protected LteRadioProfileGetResult radioProfileGetResult;

    /**
     * Gets the value of the radioProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteRadioProfileGetResult }
     *     
     */
    public LteRadioProfileGetResult getRadioProfileGetResult() {
        return radioProfileGetResult;
    }

    /**
     * Sets the value of the radioProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteRadioProfileGetResult }
     *     
     */
    public void setRadioProfileGetResult(LteRadioProfileGetResult value) {
        this.radioProfileGetResult = value;
    }

}
