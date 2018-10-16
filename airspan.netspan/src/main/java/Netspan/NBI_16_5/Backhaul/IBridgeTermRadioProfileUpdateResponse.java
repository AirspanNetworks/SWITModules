
package Netspan.NBI_16_5.Backhaul;

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
 *         &lt;element name="IBridgeTermRadioProfileUpdateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "iBridgeTermRadioProfileUpdateResult"
})
@XmlRootElement(name = "IBridgeTermRadioProfileUpdateResponse")
public class IBridgeTermRadioProfileUpdateResponse {

    @XmlElement(name = "IBridgeTermRadioProfileUpdateResult")
    protected ProfileResponse iBridgeTermRadioProfileUpdateResult;

    /**
     * Gets the value of the iBridgeTermRadioProfileUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getIBridgeTermRadioProfileUpdateResult() {
        return iBridgeTermRadioProfileUpdateResult;
    }

    /**
     * Sets the value of the iBridgeTermRadioProfileUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setIBridgeTermRadioProfileUpdateResult(ProfileResponse value) {
        this.iBridgeTermRadioProfileUpdateResult = value;
    }

}
