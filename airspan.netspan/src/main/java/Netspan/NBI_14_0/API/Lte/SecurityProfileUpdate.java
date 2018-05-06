
package Netspan.NBI_14_0.API.Lte;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityProfile" type="{http://Airspan.Netspan.WebServices}LteSecurityProfileWs" minOccurs="0"/>
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
    "name",
    "securityProfile"
})
@XmlRootElement(name = "SecurityProfileUpdate")
public class SecurityProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SecurityProfile")
    protected LteSecurityProfileWs securityProfile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the securityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link LteSecurityProfileWs }
     *     
     */
    public LteSecurityProfileWs getSecurityProfile() {
        return securityProfile;
    }

    /**
     * Sets the value of the securityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteSecurityProfileWs }
     *     
     */
    public void setSecurityProfile(LteSecurityProfileWs value) {
        this.securityProfile = value;
    }

}
