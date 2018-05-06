
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbSecurityProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSecurityProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityForIntegrity" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory" minOccurs="0"/>
 *         &lt;element name="NullIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Snow3GIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AesIntegrityLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecurityForCiphering" type="{http://Airspan.Netspan.WebServices}SecurityProfileOptionalOrMandatory" minOccurs="0"/>
 *         &lt;element name="NullCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Snow3GCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AesCipheringLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SshEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumSshConnections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WebGUIAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSecurityProfileParams", propOrder = {
    "securityForIntegrity",
    "nullIntegrityLevel",
    "snow3GIntegrityLevel",
    "aesIntegrityLevel",
    "securityForCiphering",
    "nullCipheringLevel",
    "snow3GCipheringLevel",
    "aesCipheringLevel",
    "sshEnabled",
    "maximumSshConnections",
    "webGUIAccessEnabled"
})
@XmlSeeAlso({
    EnbSecurityProfile.class
})
public class EnbSecurityProfileParams {

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
    @XmlElementRef(name = "MaximumSshConnections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumSshConnections;
    @XmlElementRef(name = "WebGUIAccessEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webGUIAccessEnabled;

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
     * Gets the value of the maximumSshConnections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumSshConnections() {
        return maximumSshConnections;
    }

    /**
     * Sets the value of the maximumSshConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumSshConnections(JAXBElement<Integer> value) {
        this.maximumSshConnections = value;
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
