
package Netspan.NBI_15_2.Lte;

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
