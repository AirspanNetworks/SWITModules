
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for CbrsEnbWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbrsEnbWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseSpectrumInquiryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UseSpectrumInquiry" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MaximumGrantsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaximumGrants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndoorDeploymentIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IndoorDeployment" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="RegistrationRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RegistrationRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GrantRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GrantRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpectrumInquiryRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SpectrumInquiryRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GrantGuardPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GrantGuardPeriod" type="{http://Airspan.Netspan.WebServices}CbrsGrantGuardValues" minOccurs="0"/>
 *         &lt;element name="HeartbeatKeepAliveCounterIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HeartbeatKeepAliveCounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbrsEnbWs", propOrder = {
    "useSpectrumInquiryIsDefault",
    "useSpectrumInquiry",
    "maximumGrantsIsDefault",
    "maximumGrants",
    "indoorDeploymentIsDefault",
    "indoorDeployment",
    "registrationRetryTimerIsDefault",
    "registrationRetryTimer",
    "grantRetryTimerIsDefault",
    "grantRetryTimer",
    "spectrumInquiryRetryTimerIsDefault",
    "spectrumInquiryRetryTimer",
    "grantGuardPeriodIsDefault",
    "grantGuardPeriod",
    "heartbeatKeepAliveCounterIsDefault",
    "heartbeatKeepAliveCounter"
})
public class CbrsEnbWs {

    @XmlElement(name = "UseSpectrumInquiryIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean useSpectrumInquiryIsDefault;
    @XmlElementRef(name = "UseSpectrumInquiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> useSpectrumInquiry;
    @XmlElement(name = "MaximumGrantsIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean maximumGrantsIsDefault;
    @XmlElementRef(name = "MaximumGrants", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumGrants;
    @XmlElement(name = "IndoorDeploymentIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean indoorDeploymentIsDefault;
    @XmlElementRef(name = "IndoorDeployment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> indoorDeployment;
    @XmlElement(name = "RegistrationRetryTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean registrationRetryTimerIsDefault;
    @XmlElementRef(name = "RegistrationRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> registrationRetryTimer;
    @XmlElement(name = "GrantRetryTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean grantRetryTimerIsDefault;
    @XmlElementRef(name = "GrantRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> grantRetryTimer;
    @XmlElement(name = "SpectrumInquiryRetryTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean spectrumInquiryRetryTimerIsDefault;
    @XmlElementRef(name = "SpectrumInquiryRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> spectrumInquiryRetryTimer;
    @XmlElement(name = "GrantGuardPeriodIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean grantGuardPeriodIsDefault;
    @XmlElementRef(name = "GrantGuardPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grantGuardPeriod;
    @XmlElement(name = "HeartbeatKeepAliveCounterIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean heartbeatKeepAliveCounterIsDefault;
    @XmlElementRef(name = "HeartbeatKeepAliveCounter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> heartbeatKeepAliveCounter;

    /**
     * Gets the value of the useSpectrumInquiryIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSpectrumInquiryIsDefault() {
        return useSpectrumInquiryIsDefault;
    }

    /**
     * Sets the value of the useSpectrumInquiryIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSpectrumInquiryIsDefault(Boolean value) {
        this.useSpectrumInquiryIsDefault = value;
    }

    /**
     * Gets the value of the useSpectrumInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getUseSpectrumInquiry() {
        return useSpectrumInquiry;
    }

    /**
     * Sets the value of the useSpectrumInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setUseSpectrumInquiry(JAXBElement<EnabledDisabledStates> value) {
        this.useSpectrumInquiry = value;
    }

    /**
     * Gets the value of the maximumGrantsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumGrantsIsDefault() {
        return maximumGrantsIsDefault;
    }

    /**
     * Sets the value of the maximumGrantsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumGrantsIsDefault(Boolean value) {
        this.maximumGrantsIsDefault = value;
    }

    /**
     * Gets the value of the maximumGrants property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumGrants() {
        return maximumGrants;
    }

    /**
     * Sets the value of the maximumGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumGrants(JAXBElement<Integer> value) {
        this.maximumGrants = value;
    }

    /**
     * Gets the value of the indoorDeploymentIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndoorDeploymentIsDefault() {
        return indoorDeploymentIsDefault;
    }

    /**
     * Sets the value of the indoorDeploymentIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndoorDeploymentIsDefault(Boolean value) {
        this.indoorDeploymentIsDefault = value;
    }

    /**
     * Gets the value of the indoorDeployment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIndoorDeployment() {
        return indoorDeployment;
    }

    /**
     * Sets the value of the indoorDeployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIndoorDeployment(JAXBElement<EnabledDisabledStates> value) {
        this.indoorDeployment = value;
    }

    /**
     * Gets the value of the registrationRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistrationRetryTimerIsDefault() {
        return registrationRetryTimerIsDefault;
    }

    /**
     * Sets the value of the registrationRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistrationRetryTimerIsDefault(Boolean value) {
        this.registrationRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the registrationRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegistrationRetryTimer() {
        return registrationRetryTimer;
    }

    /**
     * Sets the value of the registrationRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegistrationRetryTimer(JAXBElement<Integer> value) {
        this.registrationRetryTimer = value;
    }

    /**
     * Gets the value of the grantRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrantRetryTimerIsDefault() {
        return grantRetryTimerIsDefault;
    }

    /**
     * Sets the value of the grantRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrantRetryTimerIsDefault(Boolean value) {
        this.grantRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the grantRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGrantRetryTimer() {
        return grantRetryTimer;
    }

    /**
     * Sets the value of the grantRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGrantRetryTimer(JAXBElement<Integer> value) {
        this.grantRetryTimer = value;
    }

    /**
     * Gets the value of the spectrumInquiryRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpectrumInquiryRetryTimerIsDefault() {
        return spectrumInquiryRetryTimerIsDefault;
    }

    /**
     * Sets the value of the spectrumInquiryRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpectrumInquiryRetryTimerIsDefault(Boolean value) {
        this.spectrumInquiryRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the spectrumInquiryRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpectrumInquiryRetryTimer() {
        return spectrumInquiryRetryTimer;
    }

    /**
     * Sets the value of the spectrumInquiryRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpectrumInquiryRetryTimer(JAXBElement<Integer> value) {
        this.spectrumInquiryRetryTimer = value;
    }

    /**
     * Gets the value of the grantGuardPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrantGuardPeriodIsDefault() {
        return grantGuardPeriodIsDefault;
    }

    /**
     * Sets the value of the grantGuardPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrantGuardPeriodIsDefault(Boolean value) {
        this.grantGuardPeriodIsDefault = value;
    }

    /**
     * Gets the value of the grantGuardPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrantGuardPeriod() {
        return grantGuardPeriod;
    }

    /**
     * Sets the value of the grantGuardPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrantGuardPeriod(JAXBElement<String> value) {
        this.grantGuardPeriod = value;
    }

    /**
     * Gets the value of the heartbeatKeepAliveCounterIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeartbeatKeepAliveCounterIsDefault() {
        return heartbeatKeepAliveCounterIsDefault;
    }

    /**
     * Sets the value of the heartbeatKeepAliveCounterIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeartbeatKeepAliveCounterIsDefault(Boolean value) {
        this.heartbeatKeepAliveCounterIsDefault = value;
    }

    /**
     * Gets the value of the heartbeatKeepAliveCounter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHeartbeatKeepAliveCounter() {
        return heartbeatKeepAliveCounter;
    }

    /**
     * Sets the value of the heartbeatKeepAliveCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHeartbeatKeepAliveCounter(JAXBElement<Integer> value) {
        this.heartbeatKeepAliveCounter = value;
    }

}
