
package Netspan.NBI_17_0.Backhaul;

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
 *         &lt;element name="RadioProfile" type="{http://Airspan.Netspan.WebServices}IBridgeBaseRadioProfile" minOccurs="0"/&gt;
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
    "radioProfile"
})
@XmlRootElement(name = "IBridgeBaseRadioProfileCreate")
public class IBridgeBaseRadioProfileCreate {

    @XmlElement(name = "RadioProfile")
    protected IBridgeBaseRadioProfile radioProfile;

    /**
     * Gets the value of the radioProfile property.
     * 
     * @return
     *     possible object is
     *     {@link IBridgeBaseRadioProfile }
     *     
     */
    public IBridgeBaseRadioProfile getRadioProfile() {
        return radioProfile;
    }

    /**
     * Sets the value of the radioProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridgeBaseRadioProfile }
     *     
     */
    public void setRadioProfile(IBridgeBaseRadioProfile value) {
        this.radioProfile = value;
    }

}
