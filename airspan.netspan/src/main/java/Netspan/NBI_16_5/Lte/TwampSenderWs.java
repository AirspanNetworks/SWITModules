
package Netspan.NBI_16_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for TwampSenderWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TwampSenderWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SenderPacketTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderPacketTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ZeroPaddingAdminIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ZeroPaddingAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="RtdMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RtdMetric" type="{http://Airspan.Netspan.WebServices}TwampAverageTypes" minOccurs="0"/&gt;
 *         &lt;element name="DelayMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelayMetric" type="{http://Airspan.Netspan.WebServices}TwampAverageTypes" minOccurs="0"/&gt;
 *         &lt;element name="DvMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DvMetric" type="{http://Airspan.Netspan.WebServices}TwampAverageTypes" minOccurs="0"/&gt;
 *         &lt;element name="ReflectorRxPacketTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReflectorRxPacketTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GreetingTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GreetingTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxTcpRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxTcpRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxSetupResponseRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxSetupResponseRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcceptSessionTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AcceptSessionTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxRequestSessionRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxRequestSessionRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartAckTimeoutIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartAckTimeout" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MaxStartSessionsRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxStartSessionsRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwampSenderWs", propOrder = {
    "senderPacketTimeoutIsDefault",
    "senderPacketTimeout",
    "zeroPaddingAdminIsDefault",
    "zeroPaddingAdmin",
    "rtdMetricIsDefault",
    "rtdMetric",
    "delayMetricIsDefault",
    "delayMetric",
    "dvMetricIsDefault",
    "dvMetric",
    "reflectorRxPacketTimeoutIsDefault",
    "reflectorRxPacketTimeout",
    "greetingTimeoutIsDefault",
    "greetingTimeout",
    "maxTcpRetriesIsDefault",
    "maxTcpRetries",
    "startTimeoutIsDefault",
    "startTimeout",
    "maxSetupResponseRetriesIsDefault",
    "maxSetupResponseRetries",
    "acceptSessionTimeoutIsDefault",
    "acceptSessionTimeout",
    "maxRequestSessionRetriesIsDefault",
    "maxRequestSessionRetries",
    "startAckTimeoutIsDefault",
    "startAckTimeout",
    "maxStartSessionsRetriesIsDefault",
    "maxStartSessionsRetries"
})
public class TwampSenderWs {

    @XmlElementRef(name = "SenderPacketTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> senderPacketTimeoutIsDefault;
    @XmlElementRef(name = "SenderPacketTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> senderPacketTimeout;
    @XmlElementRef(name = "ZeroPaddingAdminIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> zeroPaddingAdminIsDefault;
    @XmlElementRef(name = "ZeroPaddingAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> zeroPaddingAdmin;
    @XmlElementRef(name = "RtdMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rtdMetricIsDefault;
    @XmlElementRef(name = "RtdMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtdMetric;
    @XmlElementRef(name = "DelayMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> delayMetricIsDefault;
    @XmlElementRef(name = "DelayMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delayMetric;
    @XmlElementRef(name = "DvMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dvMetricIsDefault;
    @XmlElementRef(name = "DvMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvMetric;
    @XmlElementRef(name = "ReflectorRxPacketTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reflectorRxPacketTimeoutIsDefault;
    @XmlElementRef(name = "ReflectorRxPacketTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> reflectorRxPacketTimeout;
    @XmlElementRef(name = "GreetingTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> greetingTimeoutIsDefault;
    @XmlElementRef(name = "GreetingTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> greetingTimeout;
    @XmlElementRef(name = "MaxTcpRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxTcpRetriesIsDefault;
    @XmlElementRef(name = "MaxTcpRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxTcpRetries;
    @XmlElementRef(name = "StartTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> startTimeoutIsDefault;
    @XmlElementRef(name = "StartTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> startTimeout;
    @XmlElementRef(name = "MaxSetupResponseRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxSetupResponseRetriesIsDefault;
    @XmlElementRef(name = "MaxSetupResponseRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSetupResponseRetries;
    @XmlElementRef(name = "AcceptSessionTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> acceptSessionTimeoutIsDefault;
    @XmlElementRef(name = "AcceptSessionTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> acceptSessionTimeout;
    @XmlElementRef(name = "MaxRequestSessionRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxRequestSessionRetriesIsDefault;
    @XmlElementRef(name = "MaxRequestSessionRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxRequestSessionRetries;
    @XmlElementRef(name = "StartAckTimeoutIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> startAckTimeoutIsDefault;
    @XmlElementRef(name = "StartAckTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> startAckTimeout;
    @XmlElementRef(name = "MaxStartSessionsRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxStartSessionsRetriesIsDefault;
    @XmlElementRef(name = "MaxStartSessionsRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxStartSessionsRetries;

    /**
     * Gets the value of the senderPacketTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSenderPacketTimeoutIsDefault() {
        return senderPacketTimeoutIsDefault;
    }

    /**
     * Sets the value of the senderPacketTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSenderPacketTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.senderPacketTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the senderPacketTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSenderPacketTimeout() {
        return senderPacketTimeout;
    }

    /**
     * Sets the value of the senderPacketTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSenderPacketTimeout(JAXBElement<BigDecimal> value) {
        this.senderPacketTimeout = value;
    }

    /**
     * Gets the value of the zeroPaddingAdminIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getZeroPaddingAdminIsDefault() {
        return zeroPaddingAdminIsDefault;
    }

    /**
     * Sets the value of the zeroPaddingAdminIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setZeroPaddingAdminIsDefault(JAXBElement<Boolean> value) {
        this.zeroPaddingAdminIsDefault = value;
    }

    /**
     * Gets the value of the zeroPaddingAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getZeroPaddingAdmin() {
        return zeroPaddingAdmin;
    }

    /**
     * Sets the value of the zeroPaddingAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setZeroPaddingAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.zeroPaddingAdmin = value;
    }

    /**
     * Gets the value of the rtdMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRtdMetricIsDefault() {
        return rtdMetricIsDefault;
    }

    /**
     * Sets the value of the rtdMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRtdMetricIsDefault(JAXBElement<Boolean> value) {
        this.rtdMetricIsDefault = value;
    }

    /**
     * Gets the value of the rtdMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRtdMetric() {
        return rtdMetric;
    }

    /**
     * Sets the value of the rtdMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRtdMetric(JAXBElement<String> value) {
        this.rtdMetric = value;
    }

    /**
     * Gets the value of the delayMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDelayMetricIsDefault() {
        return delayMetricIsDefault;
    }

    /**
     * Sets the value of the delayMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDelayMetricIsDefault(JAXBElement<Boolean> value) {
        this.delayMetricIsDefault = value;
    }

    /**
     * Gets the value of the delayMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelayMetric() {
        return delayMetric;
    }

    /**
     * Sets the value of the delayMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelayMetric(JAXBElement<String> value) {
        this.delayMetric = value;
    }

    /**
     * Gets the value of the dvMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDvMetricIsDefault() {
        return dvMetricIsDefault;
    }

    /**
     * Sets the value of the dvMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDvMetricIsDefault(JAXBElement<Boolean> value) {
        this.dvMetricIsDefault = value;
    }

    /**
     * Gets the value of the dvMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDvMetric() {
        return dvMetric;
    }

    /**
     * Sets the value of the dvMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDvMetric(JAXBElement<String> value) {
        this.dvMetric = value;
    }

    /**
     * Gets the value of the reflectorRxPacketTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReflectorRxPacketTimeoutIsDefault() {
        return reflectorRxPacketTimeoutIsDefault;
    }

    /**
     * Sets the value of the reflectorRxPacketTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReflectorRxPacketTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.reflectorRxPacketTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the reflectorRxPacketTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getReflectorRxPacketTimeout() {
        return reflectorRxPacketTimeout;
    }

    /**
     * Sets the value of the reflectorRxPacketTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setReflectorRxPacketTimeout(JAXBElement<BigDecimal> value) {
        this.reflectorRxPacketTimeout = value;
    }

    /**
     * Gets the value of the greetingTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGreetingTimeoutIsDefault() {
        return greetingTimeoutIsDefault;
    }

    /**
     * Sets the value of the greetingTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGreetingTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.greetingTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the greetingTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGreetingTimeout() {
        return greetingTimeout;
    }

    /**
     * Sets the value of the greetingTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGreetingTimeout(JAXBElement<BigDecimal> value) {
        this.greetingTimeout = value;
    }

    /**
     * Gets the value of the maxTcpRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxTcpRetriesIsDefault() {
        return maxTcpRetriesIsDefault;
    }

    /**
     * Sets the value of the maxTcpRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxTcpRetriesIsDefault(JAXBElement<Boolean> value) {
        this.maxTcpRetriesIsDefault = value;
    }

    /**
     * Gets the value of the maxTcpRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxTcpRetries() {
        return maxTcpRetries;
    }

    /**
     * Sets the value of the maxTcpRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxTcpRetries(JAXBElement<Integer> value) {
        this.maxTcpRetries = value;
    }

    /**
     * Gets the value of the startTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStartTimeoutIsDefault() {
        return startTimeoutIsDefault;
    }

    /**
     * Sets the value of the startTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStartTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.startTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the startTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStartTimeout() {
        return startTimeout;
    }

    /**
     * Sets the value of the startTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStartTimeout(JAXBElement<BigDecimal> value) {
        this.startTimeout = value;
    }

    /**
     * Gets the value of the maxSetupResponseRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxSetupResponseRetriesIsDefault() {
        return maxSetupResponseRetriesIsDefault;
    }

    /**
     * Sets the value of the maxSetupResponseRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxSetupResponseRetriesIsDefault(JAXBElement<Boolean> value) {
        this.maxSetupResponseRetriesIsDefault = value;
    }

    /**
     * Gets the value of the maxSetupResponseRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxSetupResponseRetries() {
        return maxSetupResponseRetries;
    }

    /**
     * Sets the value of the maxSetupResponseRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxSetupResponseRetries(JAXBElement<Integer> value) {
        this.maxSetupResponseRetries = value;
    }

    /**
     * Gets the value of the acceptSessionTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAcceptSessionTimeoutIsDefault() {
        return acceptSessionTimeoutIsDefault;
    }

    /**
     * Sets the value of the acceptSessionTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAcceptSessionTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.acceptSessionTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the acceptSessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAcceptSessionTimeout() {
        return acceptSessionTimeout;
    }

    /**
     * Sets the value of the acceptSessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAcceptSessionTimeout(JAXBElement<BigDecimal> value) {
        this.acceptSessionTimeout = value;
    }

    /**
     * Gets the value of the maxRequestSessionRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxRequestSessionRetriesIsDefault() {
        return maxRequestSessionRetriesIsDefault;
    }

    /**
     * Sets the value of the maxRequestSessionRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxRequestSessionRetriesIsDefault(JAXBElement<Boolean> value) {
        this.maxRequestSessionRetriesIsDefault = value;
    }

    /**
     * Gets the value of the maxRequestSessionRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxRequestSessionRetries() {
        return maxRequestSessionRetries;
    }

    /**
     * Sets the value of the maxRequestSessionRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxRequestSessionRetries(JAXBElement<Integer> value) {
        this.maxRequestSessionRetries = value;
    }

    /**
     * Gets the value of the startAckTimeoutIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStartAckTimeoutIsDefault() {
        return startAckTimeoutIsDefault;
    }

    /**
     * Sets the value of the startAckTimeoutIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStartAckTimeoutIsDefault(JAXBElement<Boolean> value) {
        this.startAckTimeoutIsDefault = value;
    }

    /**
     * Gets the value of the startAckTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStartAckTimeout() {
        return startAckTimeout;
    }

    /**
     * Sets the value of the startAckTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStartAckTimeout(JAXBElement<BigDecimal> value) {
        this.startAckTimeout = value;
    }

    /**
     * Gets the value of the maxStartSessionsRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxStartSessionsRetriesIsDefault() {
        return maxStartSessionsRetriesIsDefault;
    }

    /**
     * Sets the value of the maxStartSessionsRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxStartSessionsRetriesIsDefault(JAXBElement<Boolean> value) {
        this.maxStartSessionsRetriesIsDefault = value;
    }

    /**
     * Gets the value of the maxStartSessionsRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxStartSessionsRetries() {
        return maxStartSessionsRetries;
    }

    /**
     * Sets the value of the maxStartSessionsRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxStartSessionsRetries(JAXBElement<Integer> value) {
        this.maxStartSessionsRetries = value;
    }

}
