
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
 *         &lt;element name="SoftwareImage" type="{http://Airspan.Netspan.WebServices}SwImageWs" minOccurs="0"/>
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
    "softwareImage"
})
@XmlRootElement(name = "SoftwareImageCreate")
public class SoftwareImageCreate {

    @XmlElement(name = "SoftwareImage")
    protected SwImageWs softwareImage;

    /**
     * Gets the value of the softwareImage property.
     * 
     * @return
     *     possible object is
     *     {@link SwImageWs }
     *     
     */
    public SwImageWs getSoftwareImage() {
        return softwareImage;
    }

    /**
     * Sets the value of the softwareImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwImageWs }
     *     
     */
    public void setSoftwareImage(SwImageWs value) {
        this.softwareImage = value;
    }

}
