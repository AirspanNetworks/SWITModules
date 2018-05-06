
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cmpv2ConfigWS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cmpv2ConfigWS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateUpdateTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CertificateUpdateTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateMessageTypeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateMessageType" type="{http://Airspan.Netspan.WebServices}MessageTypes" minOccurs="0"/>
 *         &lt;element name="UpdateRetryTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateRetryTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PkiMsgProtAlgorithmTypeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PkiMsgProtAlgorithmType" type="{http://Airspan.Netspan.WebServices}ProtectionAlgorithmTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cmpv2ConfigWS", propOrder = {
    "certificateUpdateTimeIsDefault",
    "certificateUpdateTime",
    "updateMessageTypeIsDefault",
    "updateMessageType",
    "updateRetryTimerIsDefault",
    "updateRetryTimer",
    "pkiMsgProtAlgorithmTypeIsDefault",
    "pkiMsgProtAlgorithmType"
})
public class Cmpv2ConfigWS {

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
    @XmlElementRef(name = "PkiMsgProtAlgorithmTypeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pkiMsgProtAlgorithmTypeIsDefault;
    @XmlElementRef(name = "PkiMsgProtAlgorithmType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtectionAlgorithmTypes> pkiMsgProtAlgorithmType;

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

    /**
     * Gets the value of the pkiMsgProtAlgorithmTypeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPkiMsgProtAlgorithmTypeIsDefault() {
        return pkiMsgProtAlgorithmTypeIsDefault;
    }

    /**
     * Sets the value of the pkiMsgProtAlgorithmTypeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPkiMsgProtAlgorithmTypeIsDefault(JAXBElement<Boolean> value) {
        this.pkiMsgProtAlgorithmTypeIsDefault = value;
    }

    /**
     * Gets the value of the pkiMsgProtAlgorithmType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProtectionAlgorithmTypes }{@code >}
     *     
     */
    public JAXBElement<ProtectionAlgorithmTypes> getPkiMsgProtAlgorithmType() {
        return pkiMsgProtAlgorithmType;
    }

    /**
     * Sets the value of the pkiMsgProtAlgorithmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProtectionAlgorithmTypes }{@code >}
     *     
     */
    public void setPkiMsgProtAlgorithmType(JAXBElement<ProtectionAlgorithmTypes> value) {
        this.pkiMsgProtAlgorithmType = value;
    }

}
