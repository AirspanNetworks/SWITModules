
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="EmbmsProfile" type="{http://Airspan.Netspan.WebServices}EnbEmbmsProfile" minOccurs="0"/>
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
    "embmsProfile"
})
@XmlRootElement(name = "EmbmsProfileCreate")
public class EmbmsProfileCreate {

    @XmlElement(name = "EmbmsProfile")
    protected EnbEmbmsProfile embmsProfile;

    /**
     * Gets the value of the embmsProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbEmbmsProfile }
     *     
     */
    public EnbEmbmsProfile getEmbmsProfile() {
        return embmsProfile;
    }

    /**
     * Sets the value of the embmsProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbEmbmsProfile }
     *     
     */
    public void setEmbmsProfile(EnbEmbmsProfile value) {
        this.embmsProfile = value;
    }

}
