
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteTwampSenderWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteTwampSenderWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Admin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredDv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredRtd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredPacketLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperationalStatus" type="{http://Airspan.Netspan.WebServices}OperStatusStates" minOccurs="0"/&gt;
 *         &lt;element name="OperationalStatusFailureReason" type="{http://Airspan.Netspan.WebServices}OperFailReasonStatusStates" minOccurs="0"/&gt;
 *         &lt;element name="ReflectorUdpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfSamplesInSession" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReflSvrIpAddressStatus" type="{http://Airspan.Netspan.WebServices}ReflectorIPAddressStatusStates" minOccurs="0"/&gt;
 *         &lt;element name="ReflSvrIpAddressUnited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderUdpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteTwampSenderWs", propOrder = {
    "admin",
    "measuredDelay",
    "measuredDv",
    "measuredRtd",
    "measuredPacketLoss",
    "operationalStatus",
    "operationalStatusFailureReason",
    "reflectorUdpPort",
    "numberOfSamplesInSession",
    "reflSvrIpAddressStatus",
    "reflSvrIpAddressUnited",
    "senderUdpPort"
})
public class LteTwampSenderWs {

    @XmlElementRef(name = "Admin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> admin;
    @XmlElementRef(name = "MeasuredDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measuredDelay;
    @XmlElementRef(name = "MeasuredDv", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measuredDv;
    @XmlElementRef(name = "MeasuredRtd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measuredRtd;
    @XmlElementRef(name = "MeasuredPacketLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measuredPacketLoss;
    @XmlElementRef(name = "OperationalStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OperStatusStates> operationalStatus;
    @XmlElementRef(name = "OperationalStatusFailureReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<OperFailReasonStatusStates> operationalStatusFailureReason;
    @XmlElementRef(name = "ReflectorUdpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reflectorUdpPort;
    @XmlElementRef(name = "NumberOfSamplesInSession", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfSamplesInSession;
    @XmlElementRef(name = "ReflSvrIpAddressStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ReflectorIPAddressStatusStates> reflSvrIpAddressStatus;
    @XmlElement(name = "ReflSvrIpAddressUnited")
    protected String reflSvrIpAddressUnited;
    @XmlElementRef(name = "SenderUdpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> senderUdpPort;

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getAdmin() {
        return admin;
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.admin = value;
    }

    /**
     * Gets the value of the measuredDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasuredDelay() {
        return measuredDelay;
    }

    /**
     * Sets the value of the measuredDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasuredDelay(JAXBElement<Integer> value) {
        this.measuredDelay = value;
    }

    /**
     * Gets the value of the measuredDv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasuredDv() {
        return measuredDv;
    }

    /**
     * Sets the value of the measuredDv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasuredDv(JAXBElement<Integer> value) {
        this.measuredDv = value;
    }

    /**
     * Gets the value of the measuredRtd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasuredRtd() {
        return measuredRtd;
    }

    /**
     * Sets the value of the measuredRtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasuredRtd(JAXBElement<Integer> value) {
        this.measuredRtd = value;
    }

    /**
     * Gets the value of the measuredPacketLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasuredPacketLoss() {
        return measuredPacketLoss;
    }

    /**
     * Sets the value of the measuredPacketLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasuredPacketLoss(JAXBElement<Integer> value) {
        this.measuredPacketLoss = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperStatusStates }{@code >}
     *     
     */
    public JAXBElement<OperStatusStates> getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperStatusStates }{@code >}
     *     
     */
    public void setOperationalStatus(JAXBElement<OperStatusStates> value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the operationalStatusFailureReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperFailReasonStatusStates }{@code >}
     *     
     */
    public JAXBElement<OperFailReasonStatusStates> getOperationalStatusFailureReason() {
        return operationalStatusFailureReason;
    }

    /**
     * Sets the value of the operationalStatusFailureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperFailReasonStatusStates }{@code >}
     *     
     */
    public void setOperationalStatusFailureReason(JAXBElement<OperFailReasonStatusStates> value) {
        this.operationalStatusFailureReason = value;
    }

    /**
     * Gets the value of the reflectorUdpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReflectorUdpPort() {
        return reflectorUdpPort;
    }

    /**
     * Sets the value of the reflectorUdpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReflectorUdpPort(JAXBElement<Integer> value) {
        this.reflectorUdpPort = value;
    }

    /**
     * Gets the value of the numberOfSamplesInSession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfSamplesInSession() {
        return numberOfSamplesInSession;
    }

    /**
     * Sets the value of the numberOfSamplesInSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfSamplesInSession(JAXBElement<Integer> value) {
        this.numberOfSamplesInSession = value;
    }

    /**
     * Gets the value of the reflSvrIpAddressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReflectorIPAddressStatusStates }{@code >}
     *     
     */
    public JAXBElement<ReflectorIPAddressStatusStates> getReflSvrIpAddressStatus() {
        return reflSvrIpAddressStatus;
    }

    /**
     * Sets the value of the reflSvrIpAddressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReflectorIPAddressStatusStates }{@code >}
     *     
     */
    public void setReflSvrIpAddressStatus(JAXBElement<ReflectorIPAddressStatusStates> value) {
        this.reflSvrIpAddressStatus = value;
    }

    /**
     * Gets the value of the reflSvrIpAddressUnited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReflSvrIpAddressUnited() {
        return reflSvrIpAddressUnited;
    }

    /**
     * Sets the value of the reflSvrIpAddressUnited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReflSvrIpAddressUnited(String value) {
        this.reflSvrIpAddressUnited = value;
    }

    /**
     * Gets the value of the senderUdpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSenderUdpPort() {
        return senderUdpPort;
    }

    /**
     * Sets the value of the senderUdpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSenderUdpPort(JAXBElement<Integer> value) {
        this.senderUdpPort = value;
    }

}
