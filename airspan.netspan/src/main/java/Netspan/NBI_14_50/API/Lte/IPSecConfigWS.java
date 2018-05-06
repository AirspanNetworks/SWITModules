
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPSecConfigWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPSecConfigWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiffieHellmanGroupIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiffieHellmanGroup" type="{http://Airspan.Netspan.WebServices}DiffieHellmanGroups" minOccurs="0"/>
 *         &lt;element name="IkeSaLifetimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IkeSaLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DpdActionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DpdAction" type="{http://Airspan.Netspan.WebServices}DpdActions" minOccurs="0"/>
 *         &lt;element name="DpdRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DpdRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DpdDelayIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DpdDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IpsecEncryptionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IpsecEncryption" type="{http://Airspan.Netspan.WebServices}Ikev2EncryptionTypes" minOccurs="0"/>
 *         &lt;element name="IpsecSaLifetimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IpsecSaLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarginTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarginTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPSecConfigWS", propOrder = {
    "diffieHellmanGroupIsDefault",
    "diffieHellmanGroup",
    "ikeSaLifetimeIsDefault",
    "ikeSaLifetime",
    "dpdActionIsDefault",
    "dpdAction",
    "dpdRetriesIsDefault",
    "dpdRetries",
    "dpdDelayIsDefault",
    "dpdDelay",
    "ipsecEncryptionIsDefault",
    "ipsecEncryption",
    "ipsecSaLifetimeIsDefault",
    "ipsecSaLifetime",
    "marginTimeIsDefault",
    "marginTime"
})
public class IPSecConfigWS {

    @XmlElementRef(name = "DiffieHellmanGroupIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> diffieHellmanGroupIsDefault;
    @XmlElementRef(name = "DiffieHellmanGroup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DiffieHellmanGroups> diffieHellmanGroup;
    @XmlElementRef(name = "IkeSaLifetimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ikeSaLifetimeIsDefault;
    @XmlElementRef(name = "IkeSaLifetime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ikeSaLifetime;
    @XmlElementRef(name = "DpdActionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dpdActionIsDefault;
    @XmlElementRef(name = "DpdAction", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DpdActions> dpdAction;
    @XmlElementRef(name = "DpdRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dpdRetriesIsDefault;
    @XmlElementRef(name = "DpdRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dpdRetries;
    @XmlElementRef(name = "DpdDelayIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dpdDelayIsDefault;
    @XmlElementRef(name = "DpdDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dpdDelay;
    @XmlElementRef(name = "IpsecEncryptionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ipsecEncryptionIsDefault;
    @XmlElementRef(name = "IpsecEncryption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipsecEncryption;
    @XmlElementRef(name = "IpsecSaLifetimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ipsecSaLifetimeIsDefault;
    @XmlElementRef(name = "IpsecSaLifetime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipsecSaLifetime;
    @XmlElementRef(name = "MarginTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> marginTimeIsDefault;
    @XmlElementRef(name = "MarginTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> marginTime;

    /**
     * Gets the value of the diffieHellmanGroupIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDiffieHellmanGroupIsDefault() {
        return diffieHellmanGroupIsDefault;
    }

    /**
     * Sets the value of the diffieHellmanGroupIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDiffieHellmanGroupIsDefault(JAXBElement<Boolean> value) {
        this.diffieHellmanGroupIsDefault = value;
    }

    /**
     * Gets the value of the diffieHellmanGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiffieHellmanGroups }{@code >}
     *     
     */
    public JAXBElement<DiffieHellmanGroups> getDiffieHellmanGroup() {
        return diffieHellmanGroup;
    }

    /**
     * Sets the value of the diffieHellmanGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiffieHellmanGroups }{@code >}
     *     
     */
    public void setDiffieHellmanGroup(JAXBElement<DiffieHellmanGroups> value) {
        this.diffieHellmanGroup = value;
    }

    /**
     * Gets the value of the ikeSaLifetimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIkeSaLifetimeIsDefault() {
        return ikeSaLifetimeIsDefault;
    }

    /**
     * Sets the value of the ikeSaLifetimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIkeSaLifetimeIsDefault(JAXBElement<Boolean> value) {
        this.ikeSaLifetimeIsDefault = value;
    }

    /**
     * Gets the value of the ikeSaLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIkeSaLifetime() {
        return ikeSaLifetime;
    }

    /**
     * Sets the value of the ikeSaLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIkeSaLifetime(JAXBElement<Integer> value) {
        this.ikeSaLifetime = value;
    }

    /**
     * Gets the value of the dpdActionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDpdActionIsDefault() {
        return dpdActionIsDefault;
    }

    /**
     * Sets the value of the dpdActionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDpdActionIsDefault(JAXBElement<Boolean> value) {
        this.dpdActionIsDefault = value;
    }

    /**
     * Gets the value of the dpdAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DpdActions }{@code >}
     *     
     */
    public JAXBElement<DpdActions> getDpdAction() {
        return dpdAction;
    }

    /**
     * Sets the value of the dpdAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DpdActions }{@code >}
     *     
     */
    public void setDpdAction(JAXBElement<DpdActions> value) {
        this.dpdAction = value;
    }

    /**
     * Gets the value of the dpdRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDpdRetriesIsDefault() {
        return dpdRetriesIsDefault;
    }

    /**
     * Sets the value of the dpdRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDpdRetriesIsDefault(JAXBElement<Boolean> value) {
        this.dpdRetriesIsDefault = value;
    }

    /**
     * Gets the value of the dpdRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDpdRetries() {
        return dpdRetries;
    }

    /**
     * Sets the value of the dpdRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDpdRetries(JAXBElement<Integer> value) {
        this.dpdRetries = value;
    }

    /**
     * Gets the value of the dpdDelayIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDpdDelayIsDefault() {
        return dpdDelayIsDefault;
    }

    /**
     * Sets the value of the dpdDelayIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDpdDelayIsDefault(JAXBElement<Boolean> value) {
        this.dpdDelayIsDefault = value;
    }

    /**
     * Gets the value of the dpdDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDpdDelay() {
        return dpdDelay;
    }

    /**
     * Sets the value of the dpdDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDpdDelay(JAXBElement<Integer> value) {
        this.dpdDelay = value;
    }

    /**
     * Gets the value of the ipsecEncryptionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIpsecEncryptionIsDefault() {
        return ipsecEncryptionIsDefault;
    }

    /**
     * Sets the value of the ipsecEncryptionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIpsecEncryptionIsDefault(JAXBElement<Boolean> value) {
        this.ipsecEncryptionIsDefault = value;
    }

    /**
     * Gets the value of the ipsecEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIpsecEncryption() {
        return ipsecEncryption;
    }

    /**
     * Sets the value of the ipsecEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIpsecEncryption(JAXBElement<String> value) {
        this.ipsecEncryption = value;
    }

    /**
     * Gets the value of the ipsecSaLifetimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIpsecSaLifetimeIsDefault() {
        return ipsecSaLifetimeIsDefault;
    }

    /**
     * Sets the value of the ipsecSaLifetimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIpsecSaLifetimeIsDefault(JAXBElement<Boolean> value) {
        this.ipsecSaLifetimeIsDefault = value;
    }

    /**
     * Gets the value of the ipsecSaLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpsecSaLifetime() {
        return ipsecSaLifetime;
    }

    /**
     * Sets the value of the ipsecSaLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpsecSaLifetime(JAXBElement<Integer> value) {
        this.ipsecSaLifetime = value;
    }

    /**
     * Gets the value of the marginTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMarginTimeIsDefault() {
        return marginTimeIsDefault;
    }

    /**
     * Sets the value of the marginTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMarginTimeIsDefault(JAXBElement<Boolean> value) {
        this.marginTimeIsDefault = value;
    }

    /**
     * Gets the value of the marginTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMarginTime() {
        return marginTime;
    }

    /**
     * Sets the value of the marginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMarginTime(JAXBElement<Integer> value) {
        this.marginTime = value;
    }

}
