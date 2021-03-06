
package Netspan.NBI_14_50.API.Backhaul;

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
 *         &lt;element name="IBridgeBaseRadioProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "iBridgeBaseRadioProfileUpdateResult"
})
@XmlRootElement(name = "IBridgeBaseRadioProfileUpdateResponse")
public class IBridgeBaseRadioProfileUpdateResponse {

    @XmlElement(name = "IBridgeBaseRadioProfileUpdateResult")
    protected ProfileResponse iBridgeBaseRadioProfileUpdateResult;

    /**
     * Gets the value of the iBridgeBaseRadioProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridgeBaseRadioProfileUpdateResult() {
        return iBridgeBaseRadioProfileUpdateResult;
    }

    /**
     * Sets the value of the iBridgeBaseRadioProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridgeBaseRadioProfileUpdateResult(ProfileResponse value) {
        this.iBridgeBaseRadioProfileUpdateResult = value;
    }

}
