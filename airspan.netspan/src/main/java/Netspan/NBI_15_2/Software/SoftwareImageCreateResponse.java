
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
 *         &lt;element name="SoftwareImageCreateResult" type="{http://Airspan.Netspan.WebServices}SwImageResponse" minOccurs="0"/&gt;
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
    "softwareImageCreateResult"
})
@XmlRootElement(name = "SoftwareImageCreateResponse")
public class SoftwareImageCreateResponse {

    @XmlElement(name = "SoftwareImageCreateResult")
    protected SwImageResponse softwareImageCreateResult;

    /**
     * Gets the value of the softwareImageCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwImageResponse }
     *     
     */
    public SwImageResponse getSoftwareImageCreateResult() {
        return softwareImageCreateResult;
    }

    /**
     * Sets the value of the softwareImageCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwImageResponse }
     *     
     */
    public void setSoftwareImageCreateResult(SwImageResponse value) {
        this.softwareImageCreateResult = value;
    }

}
