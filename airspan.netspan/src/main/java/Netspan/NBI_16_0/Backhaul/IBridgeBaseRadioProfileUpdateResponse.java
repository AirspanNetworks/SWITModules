
package Netspan.NBI_16_0.Backhaul;

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
 *         &lt;element name="IBridgeBaseRadioProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
