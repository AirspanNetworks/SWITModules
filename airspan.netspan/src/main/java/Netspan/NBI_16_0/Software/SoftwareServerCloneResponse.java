
package Netspan.NBI_16_0.Software;

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
 *         &lt;element name="SoftwareServerCloneResult" type="{http://Airspan.Netspan.WebServices}SwServerResponse" minOccurs="0"/>
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
    "softwareServerCloneResult"
})
@XmlRootElement(name = "SoftwareServerCloneResponse")
public class SoftwareServerCloneResponse {

    @XmlElement(name = "SoftwareServerCloneResult")
    protected SwServerResponse softwareServerCloneResult;

    /**
     * Gets the value of the softwareServerCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerResponse }
     *     
     */
    public SwServerResponse getSoftwareServerCloneResult() {
        return softwareServerCloneResult;
    }

    /**
     * Sets the value of the softwareServerCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerResponse }
     *     
     */
    public void setSoftwareServerCloneResult(SwServerResponse value) {
        this.softwareServerCloneResult = value;
    }

}
