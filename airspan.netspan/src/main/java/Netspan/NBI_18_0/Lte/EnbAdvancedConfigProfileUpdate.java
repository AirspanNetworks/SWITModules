
package Netspan.NBI_18_0.Lte;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnbAdvancedProfile" type="{http://Airspan.Netspan.WebServices}EnbAdvancedProfile" minOccurs="0"/&gt;
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
    "name",
    "enbAdvancedProfile"
})
@XmlRootElement(name = "EnbAdvancedConfigProfileUpdate")
public class EnbAdvancedConfigProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EnbAdvancedProfile")
    protected EnbAdvancedProfile enbAdvancedProfile;

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
