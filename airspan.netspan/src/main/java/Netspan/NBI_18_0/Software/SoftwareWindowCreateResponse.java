
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
 *         &lt;element name="SoftwareWindowCreateResult" type="{http://Airspan.Netspan.WebServices}SwWindowResponse" minOccurs="0"/&gt;
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
    "softwareWindowCreateResult"
})
@XmlRootElement(name = "SoftwareWindowCreateResponse")
public class SoftwareWindowCreateResponse {

    @XmlElement(name = "SoftwareWindowCreateResult")
    protected SwWindowResponse softwareWindowCreateResult;

    /**
     * Gets the value of the softwareWindowCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowResponse }
     *     
     */
    public SwWindowResponse getSoftwareWindowCreateResult() {
        return softwareWindowCreateResult;
    }

    /**
     * Sets the value of the softwareWindowCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowResponse }
     *     
     */
    public void setSoftwareWindowCreateResult(SwWindowResponse value) {
        this.softwareWindowCreateResult = value;
    }

}
