
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
 *         &lt;element name="SoftwareImageUpdateResult" type="{http://Airspan.Netspan.WebServices}SwImageResponse" minOccurs="0"/&gt;
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
    "softwareImageUpdateResult"
})
@XmlRootElement(name = "SoftwareImageUpdateResponse")
public class SoftwareImageUpdateResponse {

    @XmlElement(name = "SoftwareImageUpdateResult")
    protected SwImageResponse softwareImageUpdateResult;

    /**
     * Gets the value of the softwareImageUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwImageResponse }
     *     
     */
    public SwImageResponse getSoftwareImageUpdateResult() {
        return softwareImageUpdateResult;
    }

    /**
     * Sets the value of the softwareImageUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwImageResponse }
     *     
     */
    public void setSoftwareImageUpdateResult(SwImageResponse value) {
        this.softwareImageUpdateResult = value;
    }

}
