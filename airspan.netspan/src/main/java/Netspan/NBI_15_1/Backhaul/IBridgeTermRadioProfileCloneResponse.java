
package Netspan.NBI_15_1.Backhaul;

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
 *         &lt;element name="IBridgeTermRadioProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "iBridgeTermRadioProfileCloneResult"
})
@XmlRootElement(name = "IBridgeTermRadioProfileCloneResponse")
public class IBridgeTermRadioProfileCloneResponse {

    @XmlElement(name = "IBridgeTermRadioProfileCloneResult")
    protected ProfileResponse iBridgeTermRadioProfileCloneResult;

    /**
     * Gets the value of the iBridgeTermRadioProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridgeTermRadioProfileCloneResult() {
        return iBridgeTermRadioProfileCloneResult;
    }

    /**
     * Sets the value of the iBridgeTermRadioProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridgeTermRadioProfileCloneResult(ProfileResponse value) {
        this.iBridgeTermRadioProfileCloneResult = value;
    }

}
