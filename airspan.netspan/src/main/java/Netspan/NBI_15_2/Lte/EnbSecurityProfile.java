
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.SecurityProfileOptionalOrMandatory;


/**
 * <p>Java class for EnbSecurityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSecurityProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *         &lt;element name="SecurityForIntegrity" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory" minOccurs="0"/&gt;
 *         &lt;element name="NullIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Snow3GIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AesIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityForCiphering" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory" minOccurs="0"/&gt;
 *         &lt;element name="NullCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Snow3GCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AesCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SshEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WebGUIAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSecurityProfile", propOrder = {
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
    "sshEnabled",
    "webGUIAccessEnabled"
})
public class EnbSecurityProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "SecurityForIntegrity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityProfileOptionalOrMandatory> securityForIntegrity;
    @XmlElementRef(name = "NullIntegrityLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullIntegrityLevel;
    @XmlElementRef(name = "Snow3GIntegrityLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snow3GIntegrityLevel;
    @XmlElementRef(name = "AesIntegrityLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aesIntegrityLevel;
    @XmlElementRef(name = "SecurityForCiphering", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityProfileOptionalOrMandatory> securityForCiphering;
    @XmlElementRef(name = "NullCipheringLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullCipheringLevel;
    @XmlElementRef(name = "Snow3GCipheringLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snow3GCipheringLevel;
    @XmlElementRef(name = "AesCipheringLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aesCipheringLevel;
    @XmlElementRef(name = "SshEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sshEnabled;
    @XmlElementRef(name = "WebGUIAccessEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webGUIAccessEnabled;

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
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the securityForIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}
     *     
     */
    public JAXBElement<SecurityProfileOptionalOrMandatory> getSecurityForIntegrity() {
        return securityForIntegrity;
    }

    /**
     * Sets the value of the securityForIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}
     *     
     */
    public void setSecurityForIntegrity(JAXBElement<SecurityProfileOptionalOrMandatory> value) {
        this.securityForIntegrity = value;
    }

    /**
     * Gets the value of the nullIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullIntegrityLevel() {
        return nullIntegrityLevel;
    }

    /**
     * Sets the value of the nullIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullIntegrityLevel(JAXBElement<Integer> value) {
        this.nullIntegrityLevel = value;
    }

    /**
     * Gets the value of the snow3GIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSnow3GIntegrityLevel() {
        return snow3GIntegrityLevel;
    }

    /**
     * Sets the value of the snow3GIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSnow3GIntegrityLevel(JAXBElement<Integer> value) {
        this.snow3GIntegrityLevel = value;
    }

    /**
     * Gets the value of the aesIntegrityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAesIntegrityLevel() {
        return aesIntegrityLevel;
    }

    /**
     * Sets the value of the aesIntegrityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAesIntegrityLevel(JAXBElement<Integer> value) {
        this.aesIntegrityLevel = value;
    }

    /**
     * Gets the value of the securityForCiphering property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}
     *     
     */
    public JAXBElement<SecurityProfileOptionalOrMandatory> getSecurityForCiphering() {
        return securityForCiphering;
    }

    /**
     * Sets the value of the securityForCiphering property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}
     *     
     */
    public void setSecurityForCiphering(JAXBElement<SecurityProfileOptionalOrMandatory> value) {
        this.securityForCiphering = value;
    }

    /**
     * Gets the value of the nullCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullCipheringLevel() {
        return nullCipheringLevel;
    }

    /**
     * Sets the value of the nullCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullCipheringLevel(JAXBElement<Integer> value) {
        this.nullCipheringLevel = value;
    }

    /**
     * Gets the value of the snow3GCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSnow3GCipheringLevel() {
        return snow3GCipheringLevel;
    }

    /**
     * Sets the value of the snow3GCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSnow3GCipheringLevel(JAXBElement<Integer> value) {
        this.snow3GCipheringLevel = value;
    }

    /**
     * Gets the value of the aesCipheringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAesCipheringLevel() {
        return aesCipheringLevel;
    }

    /**
     * Sets the value of the aesCipheringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAesCipheringLevel(JAXBElement<Integer> value) {
        this.aesCipheringLevel = value;
    }

    /**
     * Gets the value of the sshEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSshEnabled() {
        return sshEnabled;
    }

    /**
     * Sets the value of the sshEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSshEnabled(JAXBElement<Boolean> value) {
        this.sshEnabled = value;
    }

    /**
     * Gets the value of the webGUIAccessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWebGUIAccessEnabled() {
        return webGUIAccessEnabled;
    }

    /**
     * Sets the value of the webGUIAccessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWebGUIAccessEnabled(JAXBElement<Boolean> value) {
        this.webGUIAccessEnabled = value;
    }

}
