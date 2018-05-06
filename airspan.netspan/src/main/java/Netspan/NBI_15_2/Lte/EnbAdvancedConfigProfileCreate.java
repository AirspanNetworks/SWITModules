
package Netspan.NBI_15_2.Lte;

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
 *         &lt;element name="EnbAdvancedProfile" type="{http://Airspan.Netspan.WebServices}EnbAdvancedProfile" minOccurs="0"/>
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
    "enbAdvancedProfile"
})
@XmlRootElement(name = "EnbAdvancedConfigProfileCreate")
public class EnbAdvancedConfigProfileCreate {

    @XmlElement(name = "EnbAdvancedProfile")
    protected EnbAdvancedProfile enbAdvancedProfile;

    /**
     * Gets the value of the enbAdvancedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbAdvancedProfile }
     *     
     */
    public EnbAdvancedProfile getEnbAdvancedProfile() {
        return enbAdvancedProfile;
    }

    /**
     * Sets the value of the enbAdvancedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbAdvancedProfile }
     *     
     */
    public void setEnbAdvancedProfile(EnbAdvancedProfile value) {
        this.enbAdvancedProfile = value;
    }

}
