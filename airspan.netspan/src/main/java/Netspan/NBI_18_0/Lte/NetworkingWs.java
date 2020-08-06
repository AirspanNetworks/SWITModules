
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkingWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkingWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MtuIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mtu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OverwriteDlTcpMaximumSegmentSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverwriteDlTcpMaximumSegmentSize" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="DlTcpMaximumSegmentSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DlTcpMaximumSegmentSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OverwriteUlTcpMaximumSegmentSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverwriteUlTcpMaximumSegmentSize" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UlTcpMaximumSegmentSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UlTcpMaximumSegmentSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SctpHBeatIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SctpHBeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SgwDownTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SgwDownTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IkeSaLifetimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IkeSaLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DpdActionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DpdAction" type="{http://Airspan.Netspan.WebServices}DpdActions" minOccurs="0"/&gt;
 *         &lt;element name="DpdRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DpdRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DpdDelayIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DpdDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpsecSaLifetimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IpsecSaLifetime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MarginTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MarginTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TunnelTearDownPolicyIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TunnelTearDownPolicy" type="{http://Airspan.Netspan.WebServices}TunnelTearDownPolicy" minOccurs="0"/&gt;
 *         &lt;element name="CertificateUpdateTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CertificateUpdateTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UpdateMessageTypeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateMessageType" type="{http://Airspan.Netspan.WebServices}MessageTypes" minOccurs="0"/&gt;
 *         &lt;element name="UpdateRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdateRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkingWs", propOrder = {
    "mtuIsDefault",
    "mtu",
    "overwriteDlTcpMaximumSegmentSizeIsDefault",
    "overwriteDlTcpMaximumSegmentSize",
    "dlTcpMaximumSegmentSizeIsDefault",
    "dlTcpMaximumSegmentSize",
    "overwriteUlTcpMaximumSegmentSizeIsDefault",
    "overwriteUlTcpMaximumSegmentSize",
    "ulTcpMaximumSegmentSizeIsDefault",
    "ulTcpMaximumSegmentSize",
    "sctpHBeatIntervalIsDefault",
    "sctpHBeatInterval",
    "sgwDownTimerIsDefault",
    "sgwDownTimer",
    "ikeSaLifetimeIsDefault",
    "ikeSaLifetime",
    "dpdActionIsDefault",
    "dpdAction",
    "dpdRetriesIsDefault",
    "dpdRetries",
    "dpdDelayIsDefault",
    "dpdDelay",
    "ipsecSaLifetimeIsDefault",
    "ipsecSaLifetime",
    "marginTimeIsDefault",
    "marginTime",
    "tunnelTearDownPolicyIsDefault",
    "tunnelTearDownPolicy",
    "certificateUpdateTimeIsDefault",
    "certificateUpdateTime",
    "updateMessageTypeIsDefault",
    "updateMessageType",
    "updateRetryTimerIsDefault",
    "updateRetryTimer"
})
public class NetworkingWs {

    @XmlElementRef(name = "MtuIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mtuIsDefault;
    @XmlElementRef(name = "Mtu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mtu;
    @XmlElementRef(name = "OverwriteDlTcpMaximumSegmentSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> overwriteDlTcpMaximumSegmentSizeIsDefault;
    @XmlElementRef(name = "OverwriteDlTcpMaximumSegmentSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> overwriteDlTcpMaximumSegmentSize;
    @XmlElementRef(name = "DlTcpMaximumSegmentSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlTcpMaximumSegmentSizeIsDefault;
    @XmlElementRef(name = "DlTcpMaximumSegmentSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlTcpMaximumSegmentSize;
    @XmlElementRef(name = "OverwriteUlTcpMaximumSegmentSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> overwriteUlTcpMaximumSegmentSizeIsDefault;
    @XmlElementRef(name = "OverwriteUlTcpMaximumSegmentSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> overwriteUlTcpMaximumSegmentSize;
    @XmlElementRef(name = "UlTcpMaximumSegmentSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ulTcpMaximumSegmentSizeIsDefault;
    @XmlElementRef(name = "UlTcpMaximumSegmentSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulTcpMaximumSegmentSize;
    @XmlElementRef(name = "SctpHBeatIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sctpHBeatIntervalIsDefault;
    @XmlElementRef(name = "SctpHBeatInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sctpHBeatInterval;
    @XmlElementRef(name = "SgwDownTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sgwDownTimerIsDefault;
    @XmlElementRef(name = "SgwDownTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sgwDownTimer;
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
    @XmlElementRef(name = "IpsecSaLifetimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ipsecSaLifetimeIsDefault;
    @XmlElementRef(name = "IpsecSaLifetime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipsecSaLifetime;
    @XmlElementRef(name = "MarginTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> marginTimeIsDefault;
    @XmlElementRef(name = "MarginTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> marginTime;
    @XmlElementRef(name = "TunnelTearDownPolicyIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tunnelTearDownPolicyIsDefault;
    @XmlElementRef(name = "TunnelTearDownPolicy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TunnelTearDownPolicy> tunnelTearDownPolicy;
    @XmlElementRef(name = "CertificateUpdateTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> certificateUpdateTimeIsDefault;
    @XmlElementRef(name = "CertificateUpdateTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> certificateUpdateTime;
    @XmlElementRef(name = "UpdateMessageTypeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> updateMessageTypeIsDefault;
    @XmlElementRef(name = "UpdateMessageType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MessageTypes> updateMessageType;
    @XmlElementRef(name = "UpdateRetryTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> updateRetryTimerIsDefault;
    @XmlElementRef(name = "UpdateRetryTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> updateRetryTimer;

    /**
     * Gets the value of the mtuIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMtuIsDefault() {
        return mtuIsDefault;
    }

    /**
     * Sets the value of the mtuIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMtuIsDefault(JAXBElement<Boolean> value) {
        this.mtuIsDefault = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMtu() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMtu(JAXBElement<Integer> value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the overwriteDlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOverwriteDlTcpMaximumSegmentSizeIsDefault() {
        return overwriteDlTcpMaximumSegmentSizeIsDefault;
    }

    /**
     * Sets the value of the overwriteDlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOverwriteDlTcpMaximumSegmentSizeIsDefault(JAXBElement<Boolean> value) {
        this.overwriteDlTcpMaximumSegmentSizeIsDefault = value;
    }

    /**
     * Gets the value of the overwriteDlTcpMaximumSegmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getOverwriteDlTcpMaximumSegmentSize() {
        return overwriteDlTcpMaximumSegmentSize;
    }

    /**
     * Sets the value of the overwriteDlTcpMaximumSegmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setOverwriteDlTcpMaximumSegmentSize(JAXBElement<EnabledDisabledStates> value) {
        this.overwriteDlTcpMaximumSegmentSize = value;
    }

    /**
     * Gets the value of the dlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlTcpMaximumSegmentSizeIsDefault() {
        return dlTcpMaximumSegmentSizeIsDefault;
    }

    /**
     * Sets the value of the dlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlTcpMaximumSegmentSizeIsDefault(JAXBElement<Boolean> value) {
        this.dlTcpMaximumSegmentSizeIsDefault = value;
    }

    /**
     * Gets the value of the dlTcpMaximumSegmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlTcpMaximumSegmentSize() {
        return dlTcpMaximumSegmentSize;
    }

    /**
     * Sets the value of the dlTcpMaximumSegmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlTcpMaximumSegmentSize(JAXBElement<Integer> value) {
        this.dlTcpMaximumSegmentSize = value;
    }

    /**
     * Gets the value of the overwriteUlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOverwriteUlTcpMaximumSegmentSizeIsDefault() {
        return overwriteUlTcpMaximumSegmentSizeIsDefault;
    }

    /**
     * Sets the value of the overwriteUlTcpMaximumSegmentSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOverwriteUlTcpMaximumSegmentSizeIsDefault(JAXBElement<Boolean> value) {
        this.overwriteUlTcpMaximumSegmentSizeIsDefault = value;
    }

    /**
     * Gets the value of the overwriteUlTcpMaximumSegmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getOverwriteUlTcpMaximumSegmentSize() {
        return overwriteUlTcpMaximumSegmentSize;
    }

    /**
     * Sets the value of the overwriteUlTcpMaximumSegmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setOverwriteUlTcpMaximumSegmentSize(JAXBElement<EnabledDisabledStates> value) {
        this.overwriteUlTcpMaximumSegmentSize = value;
    }

    /**
     * Gets the value of the ulTcpMaximumSegmentSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUlTcpMaximumSegmentSizeIsDefault() {
        return ulTcpMaximumSegmentSizeIsDefault;
    }

    /**
     * Sets the value of the ulTcpMaximumSegmentSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUlTcpMaximumSegmentSizeIsDefault(JAXBElement<Boolean> value) {
        this.ulTcpMaximumSegmentSizeIsDefault = value;
    }

    /**
     * Gets the value of the ulTcpMaximumSegmentSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlTcpMaximumSegmentSize() {
        return ulTcpMaximumSegmentSize;
    }

    /**
     * Sets the value of the ulTcpMaximumSegmentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlTcpMaximumSegmentSize(JAXBElement<Integer> value) {
        this.ulTcpMaximumSegmentSize = value;
    }

    /**
     * Gets the value of the sctpHBeatIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSctpHBeatIntervalIsDefault() {
        return sctpHBeatIntervalIsDefault;
    }

    /**
     * Sets the value of the sctpHBeatIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSctpHBeatIntervalIsDefault(JAXBElement<Boolean> value) {
        this.sctpHBeatIntervalIsDefault = value;
    }

    /**
     * Gets the value of the sctpHBeatInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSctpHBeatInterval() {
        return sctpHBeatInterval;
    }

    /**
     * Sets the value of the sctpHBeatInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSctpHBeatInterval(JAXBElement<Integer> value) {
        this.sctpHBeatInterval = value;
    }

    /**
     * Gets the value of the sgwDownTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSgwDownTimerIsDefault() {
        return sgwDownTimerIsDefault;
    }

    /**
     * Sets the value of the sgwDownTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSgwDownTimerIsDefault(JAXBElement<Boolean> value) {
        this.sgwDownTimerIsDefault = value;
    }

    /**
     * Gets the value of the sgwDownTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSgwDownTimer() {
        return sgwDownTimer;
    }

    /**
     * Sets the value of the sgwDownTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSgwDownTimer(JAXBElement<Integer> value) {
        this.sgwDownTimer = value;
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

    /**
     * Gets the value of the tunnelTearDownPolicyIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTunnelTearDownPolicyIsDefault() {
        return tunnelTearDownPolicyIsDefault;
    }

    /**
     * Sets the value of the tunnelTearDownPolicyIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTunnelTearDownPolicyIsDefault(JAXBElement<Boolean> value) {
        this.tunnelTearDownPolicyIsDefault = value;
    }

    /**
     * Gets the value of the tunnelTearDownPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TunnelTearDownPolicy }{@code >}
     *     
     */
    public JAXBElement<TunnelTearDownPolicy> getTunnelTearDownPolicy() {
        return tunnelTearDownPolicy;
    }

    /**
     * Sets the value of the tunnelTearDownPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TunnelTearDownPolicy }{@code >}
     *     
     */
    public void setTunnelTearDownPolicy(JAXBElement<TunnelTearDownPolicy> value) {
        this.tunnelTearDownPolicy = value;
    }

    /**
     * Gets the value of the certificateUpdateTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCertificateUpdateTimeIsDefault() {
        return certificateUpdateTimeIsDefault;
    }

    /**
     * Sets the value of the certificateUpdateTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCertificateUpdateTimeIsDefault(JAXBElement<Boolean> value) {
        this.certificateUpdateTimeIsDefault = value;
    }

    /**
     * Gets the value of the certificateUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCertificateUpdateTime() {
        return certificateUpdateTime;
    }

    /**
     * Sets the value of the certificateUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCertificateUpdateTime(JAXBElement<Integer> value) {
        this.certificateUpdateTime = value;
    }

    /**
     * Gets the value of the updateMessageTypeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUpdateMessageTypeIsDefault() {
        return updateMessageTypeIsDefault;
    }

    /**
     * Sets the value of the updateMessageTypeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUpdateMessageTypeIsDefault(JAXBElement<Boolean> value) {
        this.updateMessageTypeIsDefault = value;
    }

    /**
     * Gets the value of the updateMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MessageTypes }{@code >}
     *     
     */
    public JAXBElement<MessageTypes> getUpdateMessageType() {
        return updateMessageType;
    }

    /**
     * Sets the value of the updateMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MessageTypes }{@code >}
     *     
     */
    public void setUpdateMessageType(JAXBElement<MessageTypes> value) {
        this.updateMessageType = value;
    }

    /**
     * Gets the value of the updateRetryTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUpdateRetryTimerIsDefault() {
        return updateRetryTimerIsDefault;
    }

    /**
     * Sets the value of the updateRetryTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUpdateRetryTimerIsDefault(JAXBElement<Boolean> value) {
        this.updateRetryTimerIsDefault = value;
    }

    /**
     * Gets the value of the updateRetryTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUpdateRetryTimer() {
        return updateRetryTimer;
    }

    /**
     * Sets the value of the updateRetryTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUpdateRetryTimer(JAXBElement<Integer> value) {
        this.updateRetryTimer = value;
    }

}
