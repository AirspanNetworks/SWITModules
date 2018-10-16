
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
 *         &lt;element name="SonProfileCreateResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/&gt;
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
    "sonProfileCreateResult"
})
@XmlRootElement(name = "SonProfileCreateResponse")
public class SonProfileCreateResponse {

    @XmlElement(name = "SonProfileCreateResult")
    protected ProfileResponse sonProfileCreateResult;

    /**
     * Gets the value of the sonProfileCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getSonProfileCreateResult() {
        return sonProfileCreateResult;
    }

    /**
     * Sets the value of the sonProfileCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setSonProfileCreateResult(ProfileResponse value) {
        this.sonProfileCreateResult = value;
    }

}
