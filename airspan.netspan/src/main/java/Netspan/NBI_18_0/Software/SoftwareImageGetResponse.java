
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
 *         &lt;element name="SoftwareImageGetResult" type="{http://Airspan.Netspan.WebServices}SwImageResponse" minOccurs="0"/&gt;
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
    "softwareImageGetResult"
})
@XmlRootElement(name = "SoftwareImageGetResponse")
public class SoftwareImageGetResponse {

    @XmlElement(name = "SoftwareImageGetResult")
    protected SwImageResponse softwareImageGetResult;

    /**
     * Gets the value of the softwareImageGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwImageResponse }
     *     
     */
    public SwImageResponse getSoftwareImageGetResult() {
        return softwareImageGetResult;
    }

    /**
     * Sets the value of the softwareImageGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwImageResponse }
     *     
     */
    public void setSoftwareImageGetResult(SwImageResponse value) {
        this.softwareImageGetResult = value;
    }

}
