
package Netspan.NBI_16_0.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NmsUserGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsUserGetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationType" type="{http://Airspan.Netspan.WebServices}UserAuthenticationTypes" minOccurs="0"/>
 *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsExpertUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInstaller" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSSInstaller" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsExpertViewer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsViewer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsServiceProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCallTrace" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEngineer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWSAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWSServiceProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCallTraceUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LoggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastLoggedInFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastLogoutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastFullLogoutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Logins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoginFailures" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Requests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PasswordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastChangeBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NmsUserGetWs", propOrder = {
    "userName",
    "fullName",
    "authenticationType",
    "domain",
    "isAdministrator",
    "isExpertUser",
    "isInstaller",
    "isSSInstaller",
    "isExpertViewer",
    "isViewer",
    "isServiceProvisioner",
    "isCallTrace",
    "isEngineer",
    "isWSAdministrator",
    "isWSServiceProvisioner",
    "isCallTraceUser",
    "loggedIn",
    "lastLoggedInFrom",
    "lastLoginTime",
    "lastLogoutTime",
    "lastFullLogoutTime",
    "logins",
    "loginFailures",
    "requests",
    "passwordExpired",
    "lastChange",
    "lastChangeBy"
})
public class NmsUserGetWs {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElementRef(name = "AuthenticationType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UserAuthenticationTypes> authenticationType;
    @XmlElement(name = "Domain")
    protected String domain;
    @XmlElement(name = "IsAdministrator")
    protected boolean isAdministrator;
    @XmlElement(name = "IsExpertUser")
    protected boolean isExpertUser;
    @XmlElement(name = "IsInstaller")
    protected boolean isInstaller;
    @XmlElement(name = "IsSSInstaller")
    protected boolean isSSInstaller;
    @XmlElement(name = "IsExpertViewer")
    protected boolean isExpertViewer;
    @XmlElement(name = "IsViewer")
    protected boolean isViewer;
    @XmlElement(name = "IsServiceProvisioner")
    protected boolean isServiceProvisioner;
    @XmlElement(name = "IsCallTrace")
    protected boolean isCallTrace;
    @XmlElement(name = "IsEngineer")
    protected boolean isEngineer;
    @XmlElement(name = "IsWSAdministrator")
    protected boolean isWSAdministrator;
    @XmlElement(name = "IsWSServiceProvisioner")
    protected boolean isWSServiceProvisioner;
    @XmlElement(name = "IsCallTraceUser")
    protected boolean isCallTraceUser;
    @XmlElementRef(name = "LoggedIn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> loggedIn;
    @XmlElement(name = "LastLoggedInFrom")
    protected String lastLoggedInFrom;
    @XmlElementRef(name = "LastLoginTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastLoginTime;
    @XmlElementRef(name = "LastLogoutTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastLogoutTime;
    @XmlElementRef(name = "LastFullLogoutTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastFullLogoutTime;
    @XmlElementRef(name = "Logins", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> logins;
    @XmlElementRef(name = "LoginFailures", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> loginFailures;
    @XmlElementRef(name = "Requests", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> requests;
    @XmlElement(name = "PasswordExpired")
    protected boolean passwordExpired;
    @XmlElement(name = "LastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChange;
    @XmlElement(name = "LastChangeBy")
    protected String lastChangeBy;

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
     * Gets the value of the isAdministrator property.
     * 
     */
    public boolean isIsAdministrator() {
        return isAdministrator;
    }

    /**
     * Sets the value of the isAdministrator property.
     * 
     */
    public void setIsAdministrator(boolean value) {
        this.isAdministrator = value;
    }

    /**
     * Gets the value of the isExpertUser property.
     * 
     */
    public boolean isIsExpertUser() {
        return isExpertUser;
    }

    /**
     * Sets the value of the isExpertUser property.
     * 
     */
    public void setIsExpertUser(boolean value) {
        this.isExpertUser = value;
    }

    /**
     * Gets the value of the isInstaller property.
     * 
     */
    public boolean isIsInstaller() {
        return isInstaller;
    }

    /**
     * Sets the value of the isInstaller property.
     * 
     */
    public void setIsInstaller(boolean value) {
        this.isInstaller = value;
    }

    /**
     * Gets the value of the isSSInstaller property.
     * 
     */
    public boolean isIsSSInstaller() {
        return isSSInstaller;
    }

    /**
     * Sets the value of the isSSInstaller property.
     * 
     */
    public void setIsSSInstaller(boolean value) {
        this.isSSInstaller = value;
    }

    /**
     * Gets the value of the isExpertViewer property.
     * 
     */
    public boolean isIsExpertViewer() {
        return isExpertViewer;
    }

    /**
     * Sets the value of the isExpertViewer property.
     * 
     */
    public void setIsExpertViewer(boolean value) {
        this.isExpertViewer = value;
    }

    /**
     * Gets the value of the isViewer property.
     * 
     */
    public boolean isIsViewer() {
        return isViewer;
    }

    /**
     * Sets the value of the isViewer property.
     * 
     */
    public void setIsViewer(boolean value) {
        this.isViewer = value;
    }

    /**
     * Gets the value of the isServiceProvisioner property.
     * 
     */
    public boolean isIsServiceProvisioner() {
        return isServiceProvisioner;
    }

    /**
     * Sets the value of the isServiceProvisioner property.
     * 
     */
    public void setIsServiceProvisioner(boolean value) {
        this.isServiceProvisioner = value;
    }

    /**
     * Gets the value of the isCallTrace property.
     * 
     */
    public boolean isIsCallTrace() {
        return isCallTrace;
    }

    /**
     * Sets the value of the isCallTrace property.
     * 
     */
    public void setIsCallTrace(boolean value) {
        this.isCallTrace = value;
    }

    /**
     * Gets the value of the isEngineer property.
     * 
     */
    public boolean isIsEngineer() {
        return isEngineer;
    }

    /**
     * Sets the value of the isEngineer property.
     * 
     */
    public void setIsEngineer(boolean value) {
        this.isEngineer = value;
    }

    /**
     * Gets the value of the isWSAdministrator property.
     * 
     */
    public boolean isIsWSAdministrator() {
        return isWSAdministrator;
    }

    /**
     * Sets the value of the isWSAdministrator property.
     * 
     */
    public void setIsWSAdministrator(boolean value) {
        this.isWSAdministrator = value;
    }

    /**
     * Gets the value of the isWSServiceProvisioner property.
     * 
     */
    public boolean isIsWSServiceProvisioner() {
        return isWSServiceProvisioner;
    }

    /**
     * Sets the value of the isWSServiceProvisioner property.
     * 
     */
    public void setIsWSServiceProvisioner(boolean value) {
        this.isWSServiceProvisioner = value;
    }

    /**
     * Gets the value of the isCallTraceUser property.
     * 
     */
    public boolean isIsCallTraceUser() {
        return isCallTraceUser;
    }

    /**
     * Sets the value of the isCallTraceUser property.
     * 
     */
    public void setIsCallTraceUser(boolean value) {
        this.isCallTraceUser = value;
    }

    /**
     * Gets the value of the loggedIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLoggedIn() {
        return loggedIn;
    }

    /**
     * Sets the value of the loggedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLoggedIn(JAXBElement<Boolean> value) {
        this.loggedIn = value;
    }

    /**
     * Gets the value of the lastLoggedInFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLoggedInFrom() {
        return lastLoggedInFrom;
    }

    /**
     * Sets the value of the lastLoggedInFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLoggedInFrom(String value) {
        this.lastLoggedInFrom = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastLoginTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the lastLogoutTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastLogoutTime() {
        return lastLogoutTime;
    }

    /**
     * Sets the value of the lastLogoutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastLogoutTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastLogoutTime = value;
    }

    /**
     * Gets the value of the lastFullLogoutTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastFullLogoutTime() {
        return lastFullLogoutTime;
    }

    /**
     * Sets the value of the lastFullLogoutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastFullLogoutTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastFullLogoutTime = value;
    }

    /**
     * Gets the value of the logins property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLogins() {
        return logins;
    }

    /**
     * Sets the value of the logins property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLogins(JAXBElement<Integer> value) {
        this.logins = value;
    }

    /**
     * Gets the value of the loginFailures property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLoginFailures() {
        return loginFailures;
    }

    /**
     * Sets the value of the loginFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLoginFailures(JAXBElement<Integer> value) {
        this.loginFailures = value;
    }

    /**
     * Gets the value of the requests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRequests() {
        return requests;
    }

    /**
     * Sets the value of the requests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRequests(JAXBElement<Integer> value) {
        this.requests = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the lastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChange() {
        return lastChange;
    }

    /**
     * Sets the value of the lastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChange(XMLGregorianCalendar value) {
        this.lastChange = value;
    }

    /**
     * Gets the value of the lastChangeBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeBy() {
        return lastChangeBy;
    }

    /**
     * Sets the value of the lastChangeBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeBy(String value) {
        this.lastChangeBy = value;
    }

}
