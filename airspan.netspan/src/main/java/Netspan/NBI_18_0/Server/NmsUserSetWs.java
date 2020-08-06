
package Netspan.NBI_18_0.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NmsUserSetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NmsUserSetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationType" type="{http://Airspan.Netspan.WebServices}UserAuthenticationTypes" minOccurs="0"/&gt;
 *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsExpertUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInstaller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsViewer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCallTrace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEngineer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWSAdministrator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCallTraceUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRestrictToNodeGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NodeGroups" type="{http://Airspan.Netspan.WebServices}NodeGroupsWs" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "isViewer",
    "isCallTrace",
    "isEngineer",
    "isWSAdministrator",
    "isCallTraceUser",
    "isRestrictToNodeGroups",
    "nodeGroups",
    "isSuspended",
    "expiryDate"
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
    @XmlElementRef(name = "IsViewer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isViewer;
    @XmlElementRef(name = "IsCallTrace", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCallTrace;
    @XmlElementRef(name = "IsEngineer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEngineer;
    @XmlElementRef(name = "IsWSAdministrator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isWSAdministrator;
    @XmlElementRef(name = "IsCallTraceUser", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCallTraceUser;
    @XmlElementRef(name = "IsRestrictToNodeGroups", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRestrictToNodeGroups;
    @XmlElement(name = "NodeGroups")
    protected NodeGroupsWs nodeGroups;
    @XmlElementRef(name = "IsSuspended", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSuspended;
    @XmlElementRef(name = "ExpiryDate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;

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
     * Gets the value of the isCallTrace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCallTrace() {
        return isCallTrace;
    }

    /**
     * Sets the value of the isCallTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCallTrace(JAXBElement<Boolean> value) {
        this.isCallTrace = value;
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
     * Gets the value of the isCallTraceUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCallTraceUser() {
        return isCallTraceUser;
    }

    /**
     * Sets the value of the isCallTraceUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCallTraceUser(JAXBElement<Boolean> value) {
        this.isCallTraceUser = value;
    }

    /**
     * Gets the value of the isRestrictToNodeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRestrictToNodeGroups() {
        return isRestrictToNodeGroups;
    }

    /**
     * Sets the value of the isRestrictToNodeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRestrictToNodeGroups(JAXBElement<Boolean> value) {
        this.isRestrictToNodeGroups = value;
    }

    /**
     * Gets the value of the nodeGroups property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupsWs }
     *     
     */
    public NodeGroupsWs getNodeGroups() {
        return nodeGroups;
    }

    /**
     * Sets the value of the nodeGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupsWs }
     *     
     */
    public void setNodeGroups(NodeGroupsWs value) {
        this.nodeGroups = value;
    }

    /**
     * Gets the value of the isSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSuspended() {
        return isSuspended;
    }

    /**
     * Sets the value of the isSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSuspended(JAXBElement<Boolean> value) {
        this.isSuspended = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

}
