
package Netspan.NBI_14_50.API.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NmsUserSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsUserSetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationType" type="{http://Airspan.Netspan.WebServices}UserAuthenticationTypes" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExpertUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInstaller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSSInstaller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExpertViewer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsViewer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsServiceProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAAAManager" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAAAUserProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEngineer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWSAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWSServiceProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsUserSetWs", propOrder = {
    "userName",
    "fullName",
    "authenticationType",
    "domain",
    "password",
    "isAdministrator",
    "isExpertUser",
    "isInstaller",
    "isSSInstaller",
    "isExpertViewer",
    "isViewer",
    "isServiceProvisioner",
    "isAAAManager",
    "isAAAUserProvisioner",
    "isEngineer",
    "isWSAdministrator",
    "isWSServiceProvisioner"
})
public class NmsUserSetWs {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElementRef(name = "AuthenticationType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UserAuthenticationTypes> authenticationType;
    @XmlElement(name = "Domain")
    protected String domain;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElementRef(name = "IsAdministrator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAdministrator;
    @XmlElementRef(name = "IsExpertUser", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isExpertUser;
    @XmlElementRef(name = "IsInstaller", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isInstaller;
    @XmlElementRef(name = "IsSSInstaller", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSSInstaller;
    @XmlElementRef(name = "IsExpertViewer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isExpertViewer;
    @XmlElementRef(name = "IsViewer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isViewer;
    @XmlElementRef(name = "IsServiceProvisioner", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isServiceProvisioner;
    @XmlElementRef(name = "IsAAAManager", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAAAManager;
    @XmlElementRef(name = "IsAAAUserProvisioner", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAAAUserProvisioner;
    @XmlElementRef(name = "IsEngineer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEngineer;
    @XmlElementRef(name = "IsWSAdministrator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWSAdministrator;
    @XmlElementRef(name = "IsWSServiceProvisioner", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWSServiceProvisioner;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserAuthenticationTypes }{@code >}
     *     
     */
    public JAXBElement<UserAuthenticationTypes> getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserAuthenticationTypes }{@code >}
     *     
     */
    public void setAuthenticationType(JAXBElement<UserAuthenticationTypes> value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
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

    /**
     * Gets the value of the isAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAdministrator() {
        return isAdministrator;
    }

    /**
     * Sets the value of the isAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAdministrator(JAXBElement<Boolean> value) {
        this.isAdministrator = value;
    }

    /**
     * Gets the value of the isExpertUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsExpertUser() {
        return isExpertUser;
    }

    /**
     * Sets the value of the isExpertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsExpertUser(JAXBElement<Boolean> value) {
        this.isExpertUser = value;
    }

    /**
     * Gets the value of the isInstaller property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsInstaller() {
        return isInstaller;
    }

    /**
     * Sets the value of the isInstaller property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsInstaller(JAXBElement<Boolean> value) {
        this.isInstaller = value;
    }

    /**
     * Gets the value of the isSSInstaller property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSSInstaller() {
        return isSSInstaller;
    }

    /**
     * Sets the value of the isSSInstaller property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSSInstaller(JAXBElement<Boolean> value) {
        this.isSSInstaller = value;
    }

    /**
     * Gets the value of the isExpertViewer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsExpertViewer() {
        return isExpertViewer;
    }

    /**
     * Sets the value of the isExpertViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsExpertViewer(JAXBElement<Boolean> value) {
        this.isExpertViewer = value;
    }

    /**
     * Gets the value of the isViewer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsViewer() {
        return isViewer;
    }

    /**
     * Sets the value of the isViewer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsViewer(JAXBElement<Boolean> value) {
        this.isViewer = value;
    }

    /**
     * Gets the value of the isServiceProvisioner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsServiceProvisioner() {
        return isServiceProvisioner;
    }

    /**
     * Sets the value of the isServiceProvisioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsServiceProvisioner(JAXBElement<Boolean> value) {
        this.isServiceProvisioner = value;
    }

    /**
     * Gets the value of the isAAAManager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAAAManager() {
        return isAAAManager;
    }

    /**
     * Sets the value of the isAAAManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAAAManager(JAXBElement<Boolean> value) {
        this.isAAAManager = value;
    }

    /**
     * Gets the value of the isAAAUserProvisioner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAAAUserProvisioner() {
        return isAAAUserProvisioner;
    }

    /**
     * Sets the value of the isAAAUserProvisioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAAAUserProvisioner(JAXBElement<Boolean> value) {
        this.isAAAUserProvisioner = value;
    }

    /**
     * Gets the value of the isEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEngineer() {
        return isEngineer;
    }

    /**
     * Sets the value of the isEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEngineer(JAXBElement<Boolean> value) {
        this.isEngineer = value;
    }

    /**
     * Gets the value of the isWSAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWSAdministrator() {
        return isWSAdministrator;
    }

    /**
     * Sets the value of the isWSAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWSAdministrator(JAXBElement<Boolean> value) {
        this.isWSAdministrator = value;
    }

    /**
     * Gets the value of the isWSServiceProvisioner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsWSServiceProvisioner() {
        return isWSServiceProvisioner;
    }

    /**
     * Sets the value of the isWSServiceProvisioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsWSServiceProvisioner(JAXBElement<Boolean> value) {
        this.isWSServiceProvisioner = value;
    }

}
