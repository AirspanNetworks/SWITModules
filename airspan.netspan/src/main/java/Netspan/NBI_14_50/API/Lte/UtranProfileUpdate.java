
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtranProfile" type="{http://Airspan.Netspan.WebServices}UtranProfile" minOccurs="0"/>
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
    "utranProfile"
})
@XmlRootElement(name = "UtranProfileUpdate")
public class UtranProfileUpdate {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UtranProfile")
    protected UtranProfile utranProfile;

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
     * Gets the value of the utranProfile property.
     * 
     * @return
     *     possible object is
     *     {@link UtranProfile }
     *     
     */
    public UtranProfile getUtranProfile() {
        return utranProfile;
    }

    /**
     * Sets the value of the utranProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtranProfile }
     *     
     */
    public void setUtranProfile(UtranProfile value) {
        this.utranProfile = value;
    }

}
