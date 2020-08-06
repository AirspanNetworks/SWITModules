
package Netspan.NBI_18_0.Software;

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
 *         &lt;element name="SoftwareWindowDeleteResult" type="{http://Airspan.Netspan.WebServices}SwWindowResponse" minOccurs="0"/&gt;
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
    "softwareWindowDeleteResult"
})
@XmlRootElement(name = "SoftwareWindowDeleteResponse")
public class SoftwareWindowDeleteResponse {

    @XmlElement(name = "SoftwareWindowDeleteResult")
    protected SwWindowResponse softwareWindowDeleteResult;

    /**
     * Gets the value of the softwareWindowDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowResponse }
     *     
     */
    public SwWindowResponse getSoftwareWindowDeleteResult() {
        return softwareWindowDeleteResult;
    }

    /**
     * Sets the value of the softwareWindowDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowResponse }
     *     
     */
    public void setSoftwareWindowDeleteResult(SwWindowResponse value) {
        this.softwareWindowDeleteResult = value;
    }

}
