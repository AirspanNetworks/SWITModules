
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.SecurityProfileOptionalOrMandatory;


/**
 * <p>Java class for LteSecurityProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSecurityProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="SecurityForIntegrity" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory"/>
 *         &lt;element name="NullIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Snow3GIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AesIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecurityForCiphering" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory"/>
 *         &lt;element name="NullCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Snow3GCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AesCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IpSecEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SshEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WebGUIAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSecurityProfileWs", propOrder = {
    "name",
    "hardwareCategory",
    "securityForIntegrity",
    "nullIntegrityLevel",
    "snow3GIntegrityLevel",
    "aesIntegrityLevel",
    "securityForCiphering",
    "nullCipheringLevel",
    "snow3GCipheringLevel",
    "aesCipheringLevel",
    "ipSecEnabled",
    "sshEnabled",
    "webGUIAccessEnabled"
})
public class LteSecurityProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "SecurityForIntegrity", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SecurityProfileOptionalOrMandatory securityForIntegrity;
    @XmlElement(name = "NullIntegrityLevel", required = true, type = Integer.class, nillable = true)
    protected Integer nullIntegrityLevel;
    @XmlElement(name = "Snow3GIntegrityLevel", required = true, type = Integer.class, nillable = true)
    protected Integer snow3GIntegrityLevel;
    @XmlElement(name = "AesIntegrityLevel", required = true, type = Integer.class, nillable = true)
    protected Integer aesIntegrityLevel;
    @XmlElement(name = "SecurityForCiphering", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SecurityProfileOptionalOrMandatory securityForCiphering;
    @XmlElement(name = "NullCipheringLevel", required = true, type = Integer.class, nillable = true)
    protected Integer nullCipheringLevel;
    @XmlElement(name = "Snow3GCipheringLevel", required = true, type = Integer.class, nillable = true)
    protected Integer snow3GCipheringLevel;
    @XmlElement(name = "AesCipheringLevel", required = true, type = Integer.class, nillable = true)
    protected Integer aesCipheringLevel;
    @XmlElement(name = "IpSecEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean ipSecEnabled;
    @XmlElement(name = "SshEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean sshEnabled;
    @XmlElement(name = "WebGUIAccessEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean webGUIAccessEnabled;

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
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the securityForIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfileOptionalOrMandatory }
     *     
     */
    public SecurityProfileOptionalOrMandatory getSecurityForIntegrity() {
        return securityForIntegrity;
    }

    /**
     * Sets the value of the securityForIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfileOptionalOrMandatory }
     *     
     */
    public void setSecurityForIntegrity(SecurityProfileOptionalOrMandatory value) {
        this.securityForIntegrity = value;
    }

    /**
     * Gets the value of the nullIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNullIntegrityLevel() {
        return nullIntegrityLevel;
    }

    /**
     * Sets the value of the nullIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNullIntegrityLevel(Integer value) {
        this.nullIntegrityLevel = value;
    }

    /**
     * Gets the value of the snow3GIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnow3GIntegrityLevel() {
        return snow3GIntegrityLevel;
    }

    /**
     * Sets the value of the snow3GIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnow3GIntegrityLevel(Integer value) {
        this.snow3GIntegrityLevel = value;
    }

    /**
     * Gets the value of the aesIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAesIntegrityLevel() {
        return aesIntegrityLevel;
    }

    /**
     * Sets the value of the aesIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAesIntegrityLevel(Integer value) {
        this.aesIntegrityLevel = value;
    }

    /**
     * Gets the value of the securityForCiphering property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityProfileOptionalOrMandatory }
     *     
     */
    public SecurityProfileOptionalOrMandatory getSecurityForCiphering() {
        return securityForCiphering;
    }

    /**
     * Sets the value of the securityForCiphering property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityProfileOptionalOrMandatory }
     *     
     */
    public void setSecurityForCiphering(SecurityProfileOptionalOrMandatory value) {
        this.securityForCiphering = value;
    }

    /**
     * Gets the value of the nullCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNullCipheringLevel() {
        return nullCipheringLevel;
    }

    /**
     * Sets the value of the nullCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNullCipheringLevel(Integer value) {
        this.nullCipheringLevel = value;
    }

    /**
     * Gets the value of the snow3GCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSnow3GCipheringLevel() {
        return snow3GCipheringLevel;
    }

    /**
     * Sets the value of the snow3GCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSnow3GCipheringLevel(Integer value) {
        this.snow3GCipheringLevel = value;
    }

    /**
     * Gets the value of the aesCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAesCipheringLevel() {
        return aesCipheringLevel;
    }

    /**
     * Sets the value of the aesCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAesCipheringLevel(Integer value) {
        this.aesCipheringLevel = value;
    }

    /**
     * Gets the value of the ipSecEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIpSecEnabled() {
        return ipSecEnabled;
    }

    /**
     * Sets the value of the ipSecEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIpSecEnabled(Boolean value) {
        this.ipSecEnabled = value;
    }

    /**
     * Gets the value of the sshEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSshEnabled() {
        return sshEnabled;
    }

    /**
     * Sets the value of the sshEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSshEnabled(Boolean value) {
        this.sshEnabled = value;
    }

    /**
     * Gets the value of the webGUIAccessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWebGUIAccessEnabled() {
        return webGUIAccessEnabled;
    }

    /**
     * Sets the value of the webGUIAccessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWebGUIAccessEnabled(Boolean value) {
        this.webGUIAccessEnabled = value;
    }

}
