
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="MobilityProfile" type="{http://Airspan.Netspan.WebServices}EnbMobilityProfile" minOccurs="0"/>
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
    "mobilityProfile"
})
@XmlRootElement(name = "MobilityProfileCreate")
public class MobilityProfileCreate {

    @XmlElement(name = "MobilityProfile")
    protected EnbMobilityProfile mobilityProfile;

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMobilityProfile }
     *     
     */
    public EnbMobilityProfile getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMobilityProfile }
     *     
     */
    public void setMobilityProfile(EnbMobilityProfile value) {
        this.mobilityProfile = value;
    }

}
