
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
 *         &lt;element name="SoftwareWindowGetResult" type="{http://Airspan.Netspan.WebServices}SwWindowResponse" minOccurs="0"/&gt;
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
    "softwareWindowGetResult"
})
@XmlRootElement(name = "SoftwareWindowGetResponse")
public class SoftwareWindowGetResponse {

    @XmlElement(name = "SoftwareWindowGetResult")
    protected SwWindowResponse softwareWindowGetResult;

    /**
     * Gets the value of the softwareWindowGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwWindowResponse }
     *     
     */
    public SwWindowResponse getSoftwareWindowGetResult() {
        return softwareWindowGetResult;
    }

    /**
     * Sets the value of the softwareWindowGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwWindowResponse }
     *     
     */
    public void setSoftwareWindowGetResult(SwWindowResponse value) {
        this.softwareWindowGetResult = value;
    }

}
