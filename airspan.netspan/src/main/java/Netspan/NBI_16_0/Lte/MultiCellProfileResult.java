
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiCellProfileResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiCellProfileResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileResultCode" type="{http://Airspan.Netspan.WebServices}ProfileResultValues"/>
 *         &lt;element name="ProfileResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MultiCellProfile" type="{http://Airspan.Netspan.WebServices}EnbMultiCellProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCellProfileResult", propOrder = {
    "profileResultCode",
    "profileResultString",
    "profileName",
    "multiCellProfile"
})
public class MultiCellProfileResult {

    @XmlElement(name = "ProfileResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected ProfileResultValues profileResultCode;
    @XmlElement(name = "ProfileResultString")
    protected String profileResultString;
    @XmlElement(name = "ProfileName")
    protected String profileName;
    @XmlElement(name = "MultiCellProfile")
    protected EnbMultiCellProfile multiCellProfile;

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
     * Gets the value of the multiCellProfile property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMultiCellProfile }
     *     
     */
    public EnbMultiCellProfile getMultiCellProfile() {
        return multiCellProfile;
    }

    /**
     * Sets the value of the multiCellProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMultiCellProfile }
     *     
     */
    public void setMultiCellProfile(EnbMultiCellProfile value) {
        this.multiCellProfile = value;
    }

}
