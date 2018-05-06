
package Netspan.NBI_15_2.Backhaul;

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
 *         &lt;element name="IBridgeBaseRadioProfileCloneResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "iBridgeBaseRadioProfileCloneResult"
})
@XmlRootElement(name = "IBridgeBaseRadioProfileCloneResponse")
public class IBridgeBaseRadioProfileCloneResponse {

    @XmlElement(name = "IBridgeBaseRadioProfileCloneResult")
    protected ProfileResponse iBridgeBaseRadioProfileCloneResult;

    /**
     * Gets the value of the iBridgeBaseRadioProfileCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridgeBaseRadioProfileCloneResult() {
        return iBridgeBaseRadioProfileCloneResult;
    }

    /**
     * Sets the value of the iBridgeBaseRadioProfileCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridgeBaseRadioProfileCloneResult(ProfileResponse value) {
        this.iBridgeBaseRadioProfileCloneResult = value;
    }

}
