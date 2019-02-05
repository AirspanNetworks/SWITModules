
package Netspan.NBI_15_2.Software;

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
 *         &lt;element name="SoftwareImageDeleteResult" type="{http://Airspan.Netspan.WebServices}SwImageResponse" minOccurs="0"/&gt;
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
    "softwareImageDeleteResult"
})
@XmlRootElement(name = "SoftwareImageDeleteResponse")
public class SoftwareImageDeleteResponse {

    @XmlElement(name = "SoftwareImageDeleteResult")
    protected SwImageResponse softwareImageDeleteResult;

    /**
     * Gets the value of the softwareImageDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwImageResponse }
     *     
     */
    public SwImageResponse getSoftwareImageDeleteResult() {
        return softwareImageDeleteResult;
    }

    /**
     * Sets the value of the softwareImageDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwImageResponse }
     *     
     */
    public void setSoftwareImageDeleteResult(SwImageResponse value) {
        this.softwareImageDeleteResult = value;
    }

}
