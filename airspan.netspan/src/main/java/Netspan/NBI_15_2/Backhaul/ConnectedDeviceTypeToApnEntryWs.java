
package Netspan.NBI_15_2.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedDeviceTypeToApnEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedDeviceTypeToApnEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeId" type="{http://Airspan.Netspan.WebServices}AccessDeviceTypeIdsWs" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthType" type="{http://Airspan.Netspan.WebServices}ApnAuthenticationTypes" minOccurs="0"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedDeviceTypeToApnEntryWs", propOrder = {
    "typeId",
    "isEnabled",
    "accessPointName",
    "authType",
    "username",
    "password"
})
public class ConnectedDeviceTypeToApnEntryWs {

    @XmlElementRef(name = "TypeId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessDeviceTypeIdsWs> typeId;
    @XmlElementRef(name = "IsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElement(name = "AccessPointName")
    protected String accessPointName;
    @XmlElementRef(name = "AuthType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ApnAuthenticationTypes> authType;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Password")
    protected String password;

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypeIdsWs }{@code >}
     *     
     */
    public JAXBElement<AccessDeviceTypeIdsWs> getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccessDeviceTypeIdsWs }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<AccessDeviceTypeIdsWs> value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the accessPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPointName() {
        return accessPointName;
    }

    /**
     * Sets the value of the accessPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPointName(String value) {
        this.accessPointName = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}
     *     
     */
    public JAXBElement<ApnAuthenticationTypes> getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}
     *     
     */
    public void setAuthType(JAXBElement<ApnAuthenticationTypes> value) {
        this.authType = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
