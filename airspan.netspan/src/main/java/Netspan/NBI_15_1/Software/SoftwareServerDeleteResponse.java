
package Netspan.NBI_15_1.Software;

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
 *         &lt;element name="SoftwareServerDeleteResult" type="{http://Airspan.Netspan.WebServices}SwServerResponse" minOccurs="0"/>
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
    "softwareServerDeleteResult"
})
@XmlRootElement(name = "SoftwareServerDeleteResponse")
public class SoftwareServerDeleteResponse {

    @XmlElement(name = "SoftwareServerDeleteResult")
    protected SwServerResponse softwareServerDeleteResult;

    /**
     * Gets the value of the softwareServerDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwServerResponse }
     *     
     */
    public SwServerResponse getSoftwareServerDeleteResult() {
        return softwareServerDeleteResult;
    }

    /**
     * Sets the value of the softwareServerDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwServerResponse }
     *     
     */
    public void setSoftwareServerDeleteResult(SwServerResponse value) {
        this.softwareServerDeleteResult = value;
    }

}
