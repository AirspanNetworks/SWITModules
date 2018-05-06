
package Netspan.NBI_15_2.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="IsAAAManager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAAAUserProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCallTrace" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEngineer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWSAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsWSServiceProvisioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCallTraceUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isAAAManager",
    "isAAAUserProvisioner",
    "isCallTrace",
    "isEngineer",
    "isWSAdministrator",
    "isWSServiceProvisioner",
    "isCallTraceUser"
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
    @XmlElement(name = "IsAAAManager")
    protected boolean isAAAManager;
    @XmlElement(name = "IsAAAUserProvisioner")
    protected boolean isAAAUserProvisioner;
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
     * Gets the value of the isAAAManager property.
     * 
     */
    public boolean isIsAAAManager() {
        return isAAAManager;
    }

    /**
     * Sets the value of the isAAAManager property.
     * 
     */
    public void setIsAAAManager(boolean value) {
        this.isAAAManager = value;
    }

    /**
     * Gets the value of the isAAAUserProvisioner property.
     * 
     */
    public boolean isIsAAAUserProvisioner() {
        return isAAAUserProvisioner;
    }

    /**
     * Sets the value of the isAAAUserProvisioner property.
     * 
     */
    public void setIsAAAUserProvisioner(boolean value) {
        this.isAAAUserProvisioner = value;
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

}
