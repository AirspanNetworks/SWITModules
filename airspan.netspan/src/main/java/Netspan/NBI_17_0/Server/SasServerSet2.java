
package Netspan.NBI_17_0.Server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SasServerSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SasServerSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CbrsVersion" type="{http://Airspan.Netspan.WebServices}CbrsVersion"/&gt;
 *         &lt;element name="SasServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SasServerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerCertValidation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailablePalLicences" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PreferredOperationalMode" type="{http://Airspan.Netspan.WebServices}CbrsMode"/&gt;
 *         &lt;element name="HeartbeatKeepAliveCounter" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GrantGuardPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="GrantSuspensionTimer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RegistrationCycleInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AutoRenewGrant" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SasServerSet", propOrder = {
    "cbrsVersion",
    "sasServerName",
    "sasServerAddress",
    "serverCertValidation",
    "userId",
    "availablePalLicences",
    "preferredOperationalMode",
    "heartbeatKeepAliveCounter",
    "grantGuardPeriod",
    "grantSuspensionTimer",
    "registrationCycleInterval",
    "autoRenewGrant"
})
@XmlSeeAlso({
    SasServerGet2 .class
})
public class SasServerSet2 {

    @XmlElement(name = "CbrsVersion", required = true)
    protected String cbrsVersion;
    @XmlElement(name = "SasServerName")
    protected String sasServerName;
    @XmlElement(name = "SasServerAddress")
    protected String sasServerAddress;
    @XmlElement(name = "ServerCertValidation")
    protected boolean serverCertValidation;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "AvailablePalLicences")
    protected int availablePalLicences;
    @XmlElement(name = "PreferredOperationalMode", required = true)
    @XmlSchemaType(name = "string")
    protected CbrsMode preferredOperationalMode;
    @XmlElement(name = "HeartbeatKeepAliveCounter")
    protected int heartbeatKeepAliveCounter;
    @XmlElement(name = "GrantGuardPeriod")
    protected int grantGuardPeriod;
    @XmlElement(name = "GrantSuspensionTimer")
    protected int grantSuspensionTimer;
    @XmlElement(name = "RegistrationCycleInterval")
    protected int registrationCycleInterval;
    @XmlElement(name = "AutoRenewGrant")
    protected boolean autoRenewGrant;

    /**
     * Gets the value of the cbrsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbrsVersion() {
        return cbrsVersion;
    }

    /**
     * Sets the value of the cbrsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbrsVersion(String value) {
        this.cbrsVersion = value;
    }

    /**
     * Gets the value of the sasServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSasServerName() {
        return sasServerName;
    }

    /**
     * Sets the value of the sasServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSasServerName(String value) {
        this.sasServerName = value;
    }

    /**
     * Gets the value of the sasServerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSasServerAddress() {
        return sasServerAddress;
    }

    /**
     * Sets the value of the sasServerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSasServerAddress(String value) {
        this.sasServerAddress = value;
    }

    /**
     * Gets the value of the serverCertValidation property.
     * 
     */
    public boolean isServerCertValidation() {
        return serverCertValidation;
    }

    /**
     * Sets the value of the serverCertValidation property.
     * 
     */
    public void setServerCertValidation(boolean value) {
        this.serverCertValidation = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the availablePalLicences property.
     * 
     */
    public int getAvailablePalLicences() {
        return availablePalLicences;
    }

    /**
     * Sets the value of the availablePalLicences property.
     * 
     */
    public void setAvailablePalLicences(int value) {
        this.availablePalLicences = value;
    }

    /**
     * Gets the value of the preferredOperationalMode property.
     * 
     * @return
     *     possible object is
     *     {@link CbrsMode }
     *     
     */
    public CbrsMode getPreferredOperationalMode() {
        return preferredOperationalMode;
    }

    /**
     * Sets the value of the preferredOperationalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbrsMode }
     *     
     */
    public void setPreferredOperationalMode(CbrsMode value) {
        this.preferredOperationalMode = value;
    }

    /**
     * Gets the value of the heartbeatKeepAliveCounter property.
     * 
     */
    public int getHeartbeatKeepAliveCounter() {
        return heartbeatKeepAliveCounter;
    }

    /**
     * Sets the value of the heartbeatKeepAliveCounter property.
     * 
     */
    public void setHeartbeatKeepAliveCounter(int value) {
        this.heartbeatKeepAliveCounter = value;
    }

    /**
     * Gets the value of the grantGuardPeriod property.
     * 
     */
    public int getGrantGuardPeriod() {
        return grantGuardPeriod;
    }

    /**
     * Sets the value of the grantGuardPeriod property.
     * 
     */
    public void setGrantGuardPeriod(int value) {
        this.grantGuardPeriod = value;
    }

    /**
     * Gets the value of the grantSuspensionTimer property.
     * 
     */
    public int getGrantSuspensionTimer() {
        return grantSuspensionTimer;
    }

    /**
     * Sets the value of the grantSuspensionTimer property.
     * 
     */
    public void setGrantSuspensionTimer(int value) {
        this.grantSuspensionTimer = value;
    }

    /**
     * Gets the value of the registrationCycleInterval property.
     * 
     */
    public int getRegistrationCycleInterval() {
        return registrationCycleInterval;
    }

    /**
     * Sets the value of the registrationCycleInterval property.
     * 
     */
    public void setRegistrationCycleInterval(int value) {
        this.registrationCycleInterval = value;
    }

    /**
     * Gets the value of the autoRenewGrant property.
     * 
     */
    public boolean isAutoRenewGrant() {
        return autoRenewGrant;
    }

    /**
     * Sets the value of the autoRenewGrant property.
     * 
     */
    public void setAutoRenewGrant(boolean value) {
        this.autoRenewGrant = value;
    }

}
