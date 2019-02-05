
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteEmbmsProfileResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEmbmsProfileResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileResultCode" type="{http://Airspan.Netspan.WebServices}ProfileResultValues"/&gt;
 *         &lt;element name="ProfileResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmbmsProfile" type="{http://Airspan.Netspan.WebServices}EnbEmbmsProfile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEmbmsProfileResult", propOrder = {
    "profileResultCode",
    "profileResultString",
    "profileName",
    "embmsProfile"
})
public class LteEmbmsProfileResult {

    @XmlElement(name = "ProfileResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ProfileResultValues profileResultCode;
    @XmlElement(name = "ProfileResultString")
    protected String profileResultString;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "EmbmsProfile")
    protected EnbEmbmsProfile embmsProfile;

    /**
     * Gets the value of the profileResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResultValues }
     *     
     */
    public ProfileResultValues getProfileResultCode() {
        return profileResultCode;
    }

    /**
     * Sets the value of the profileResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResultValues }
     *     
     */
    public void setProfileResultCode(ProfileResultValues value) {
        this.profileResultCode = value;
    }

    /**
     * Gets the value of the profileResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileResultString() {
        return profileResultString;
    }

    /**
     * Sets the value of the profileResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileResultString(String value) {
        this.profileResultString = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

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
