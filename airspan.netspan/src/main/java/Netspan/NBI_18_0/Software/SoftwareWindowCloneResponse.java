
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
 *         &lt;element name="SoftwareWindowCloneResult" type="{http://Airspan.Netspan.WebServices}SwWindowResponse" minOccurs="0"/&gt;
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
    "softwareWindowCloneResult"
})
@XmlRootElement(name = "SoftwareWindowCloneResponse")
public class SoftwareWindowCloneResponse {

    @XmlElement(name = "SoftwareWindowCloneResult")
    protected SwWindowResponse softwareWindowCloneResult;

    /**
     * Gets the value of the softwareWindowCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowResponse }
     *     
     */
    public SwWindowResponse getSoftwareWindowCloneResult() {
        return softwareWindowCloneResult;
    }

    /**
     * Sets the value of the softwareWindowCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowResponse }
     *     
     */
    public void setSoftwareWindowCloneResult(SwWindowResponse value) {
        this.softwareWindowCloneResult = value;
    }

}
