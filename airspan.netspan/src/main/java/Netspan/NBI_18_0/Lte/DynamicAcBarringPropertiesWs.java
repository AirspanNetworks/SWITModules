
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicAcBarringPropertiesWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicAcBarringPropertiesWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DynamicAcBarringPropertiesLevel" type="{http://Airspan.Netspan.WebServices}DynamicAcBarringPropertiesLevelTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsEmergencyAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SignalingAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="SignalingAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="DataAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VoiceAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="VoiceAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VideoAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="VideoAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CsfbAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="CsfbAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicAcBarringPropertiesWs", propOrder = {
    "dynamicAcBarringPropertiesLevel",
    "isEmergencyAccessBarred",
    "isSignalingAccessBarred",
    "signalingAccessBarringFactor",
    "signalingAccessBarringTimeInSec",
    "isSignalingAccessClass11Barred",
    "isSignalingAccessClass12Barred",
    "isSignalingAccessClass13Barred",
    "isSignalingAccessClass14Barred",
    "isSignalingAccessClass15Barred",
    "isDataAccessBarred",
    "dataAccessBarringFactor",
    "dataAccessBarringTimeInSec",
    "isDataAccessClass11Barred",
    "isDataAccessClass12Barred",
    "isDataAccessClass13Barred",
    "isDataAccessClass14Barred",
    "isDataAccessClass15Barred",
    "isVoiceAccessBarred",
    "voiceAccessBarringFactor",
    "voiceAccessBarringTimeInSec",
    "isVoiceAccessClass11Barred",
    "isVoiceAccessClass12Barred",
    "isVoiceAccessClass13Barred",
    "isVoiceAccessClass14Barred",
    "isVoiceAccessClass15Barred",
    "isVideoAccessBarred",
    "videoAccessBarringFactor",
    "videoAccessBarringTimeInSec",
    "isVideoAccessClass11Barred",
    "isVideoAccessClass12Barred",
    "isVideoAccessClass13Barred",
    "isVideoAccessClass14Barred",
    "isVideoAccessClass15Barred",
    "isCsfbAccessBarred",
    "csfbAccessBarringFactor",
    "csfbAccessBarringTimeInSec",
    "isCsfbAccessClass11Barred",
    "isCsfbAccessClass12Barred",
    "isCsfbAccessClass13Barred",
    "isCsfbAccessClass14Barred",
    "isCsfbAccessClass15Barred"
})
public class DynamicAcBarringPropertiesWs {

    @XmlElementRef(name = "DynamicAcBarringPropertiesLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DynamicAcBarringPropertiesLevelTypes> dynamicAcBarringPropertiesLevel;
    @XmlElementRef(name = "IsEmergencyAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEmergencyAccessBarred;
    @XmlElementRef(name = "IsSignalingAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessBarred;
    @XmlElementRef(name = "SignalingAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringFactor;
    @XmlElementRef(name = "SignalingAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringTimeInSec;
    @XmlElementRef(name = "IsSignalingAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass11Barred;
    @XmlElementRef(name = "IsSignalingAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass12Barred;
    @XmlElementRef(name = "IsSignalingAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass13Barred;
    @XmlElementRef(name = "IsSignalingAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass14Barred;
    @XmlElementRef(name = "IsSignalingAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass15Barred;
    @XmlElementRef(name = "IsDataAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessBarred;
    @XmlElementRef(name = "DataAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringFactor;
    @XmlElementRef(name = "DataAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringTimeInSec;
    @XmlElementRef(name = "IsDataAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass11Barred;
    @XmlElementRef(name = "IsDataAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass12Barred;
    @XmlElementRef(name = "IsDataAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass13Barred;
    @XmlElementRef(name = "IsDataAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass14Barred;
    @XmlElementRef(name = "IsDataAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass15Barred;
    @XmlElementRef(name = "IsVoiceAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessBarred;
    @XmlElementRef(name = "VoiceAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceAccessBarringFactor;
    @XmlElementRef(name = "VoiceAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceAccessBarringTimeInSec;
    @XmlElementRef(name = "IsVoiceAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass11Barred;
    @XmlElementRef(name = "IsVoiceAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass12Barred;
    @XmlElementRef(name = "IsVoiceAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass13Barred;
    @XmlElementRef(name = "IsVoiceAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass14Barred;
    @XmlElementRef(name = "IsVoiceAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass15Barred;
    @XmlElementRef(name = "IsVideoAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessBarred;
    @XmlElementRef(name = "VideoAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoAccessBarringFactor;
    @XmlElementRef(name = "VideoAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoAccessBarringTimeInSec;
    @XmlElementRef(name = "IsVideoAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass11Barred;
    @XmlElementRef(name = "IsVideoAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass12Barred;
    @XmlElementRef(name = "IsVideoAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass13Barred;
    @XmlElementRef(name = "IsVideoAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass14Barred;
    @XmlElementRef(name = "IsVideoAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass15Barred;
    @XmlElementRef(name = "IsCsfbAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessBarred;
    @XmlElementRef(name = "CsfbAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csfbAccessBarringFactor;
    @XmlElementRef(name = "CsfbAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csfbAccessBarringTimeInSec;
    @XmlElementRef(name = "IsCsfbAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass11Barred;
    @XmlElementRef(name = "IsCsfbAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass12Barred;
    @XmlElementRef(name = "IsCsfbAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass13Barred;
    @XmlElementRef(name = "IsCsfbAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass14Barred;
    @XmlElementRef(name = "IsCsfbAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass15Barred;

    /**
     * Gets the value of the dynamicAcBarringPropertiesLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DynamicAcBarringPropertiesLevelTypes }{@code >}
     *     
     */
    public JAXBElement<DynamicAcBarringPropertiesLevelTypes> getDynamicAcBarringPropertiesLevel() {
        return dynamicAcBarringPropertiesLevel;
    }

    /**
     * Sets the value of the dynamicAcBarringPropertiesLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DynamicAcBarringPropertiesLevelTypes }{@code >}
     *     
     */
    public void setDynamicAcBarringPropertiesLevel(JAXBElement<DynamicAcBarringPropertiesLevelTypes> value) {
        this.dynamicAcBarringPropertiesLevel = value;
    }

    /**
     * Gets the value of the isEmergencyAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEmergencyAccessBarred() {
        return isEmergencyAccessBarred;
    }

    /**
     * Sets the value of the isEmergencyAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEmergencyAccessBarred(JAXBElement<Boolean> value) {
        this.isEmergencyAccessBarred = value;
    }

    /**
     * Gets the value of the isSignalingAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessBarred() {
        return isSignalingAccessBarred;
    }

    /**
     * Sets the value of the isSignalingAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessBarred(JAXBElement<Boolean> value) {
        this.isSignalingAccessBarred = value;
    }

    /**
     * Gets the value of the signalingAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringFactor() {
        return signalingAccessBarringFactor;
    }

    /**
     * Sets the value of the signalingAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringFactor(JAXBElement<String> value) {
        this.signalingAccessBarringFactor = value;
    }

    /**
     * Gets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringTimeInSec() {
        return signalingAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringTimeInSec(JAXBElement<String> value) {
        this.signalingAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass11Barred() {
        return isSignalingAccessClass11Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass12Barred() {
        return isSignalingAccessClass12Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass13Barred() {
        return isSignalingAccessClass13Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass14Barred() {
        return isSignalingAccessClass14Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass15Barred() {
        return isSignalingAccessClass15Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isDataAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessBarred() {
        return isDataAccessBarred;
    }

    /**
     * Sets the value of the isDataAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessBarred(JAXBElement<Boolean> value) {
        this.isDataAccessBarred = value;
    }

    /**
     * Gets the value of the dataAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringFactor() {
        return dataAccessBarringFactor;
    }

    /**
     * Sets the value of the dataAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringFactor(JAXBElement<String> value) {
        this.dataAccessBarringFactor = value;
    }

    /**
     * Gets the value of the dataAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringTimeInSec() {
        return dataAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the dataAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringTimeInSec(JAXBElement<String> value) {
        this.dataAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isDataAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass11Barred() {
        return isDataAccessClass11Barred;
    }

    /**
     * Sets the value of the isDataAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass12Barred() {
        return isDataAccessClass12Barred;
    }

    /**
     * Sets the value of the isDataAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass13Barred() {
        return isDataAccessClass13Barred;
    }

    /**
     * Sets the value of the isDataAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass14Barred() {
        return isDataAccessClass14Barred;
    }

    /**
     * Sets the value of the isDataAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass15Barred() {
        return isDataAccessClass15Barred;
    }

    /**
     * Sets the value of the isDataAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessBarred() {
        return isVoiceAccessBarred;
    }

    /**
     * Sets the value of the isVoiceAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessBarred(JAXBElement<Boolean> value) {
        this.isVoiceAccessBarred = value;
    }

    /**
     * Gets the value of the voiceAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceAccessBarringFactor() {
        return voiceAccessBarringFactor;
    }

    /**
     * Sets the value of the voiceAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceAccessBarringFactor(JAXBElement<String> value) {
        this.voiceAccessBarringFactor = value;
    }

    /**
     * Gets the value of the voiceAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceAccessBarringTimeInSec() {
        return voiceAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the voiceAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceAccessBarringTimeInSec(JAXBElement<String> value) {
        this.voiceAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass11Barred() {
        return isVoiceAccessClass11Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass12Barred() {
        return isVoiceAccessClass12Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass13Barred() {
        return isVoiceAccessClass13Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass14Barred() {
        return isVoiceAccessClass14Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass15Barred() {
        return isVoiceAccessClass15Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessBarred() {
        return isVideoAccessBarred;
    }

    /**
     * Sets the value of the isVideoAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessBarred(JAXBElement<Boolean> value) {
        this.isVideoAccessBarred = value;
    }

    /**
     * Gets the value of the videoAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoAccessBarringFactor() {
        return videoAccessBarringFactor;
    }

    /**
     * Sets the value of the videoAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoAccessBarringFactor(JAXBElement<String> value) {
        this.videoAccessBarringFactor = value;
    }

    /**
     * Gets the value of the videoAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoAccessBarringTimeInSec() {
        return videoAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the videoAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoAccessBarringTimeInSec(JAXBElement<String> value) {
        this.videoAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isVideoAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass11Barred() {
        return isVideoAccessClass11Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass12Barred() {
        return isVideoAccessClass12Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass13Barred() {
        return isVideoAccessClass13Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass14Barred() {
        return isVideoAccessClass14Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass15Barred() {
        return isVideoAccessClass15Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessBarred() {
        return isCsfbAccessBarred;
    }

    /**
     * Sets the value of the isCsfbAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessBarred(JAXBElement<Boolean> value) {
        this.isCsfbAccessBarred = value;
    }

    /**
     * Gets the value of the csfbAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsfbAccessBarringFactor() {
        return csfbAccessBarringFactor;
    }

    /**
     * Sets the value of the csfbAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsfbAccessBarringFactor(JAXBElement<String> value) {
        this.csfbAccessBarringFactor = value;
    }

    /**
     * Gets the value of the csfbAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsfbAccessBarringTimeInSec() {
        return csfbAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the csfbAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsfbAccessBarringTimeInSec(JAXBElement<String> value) {
        this.csfbAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass11Barred() {
        return isCsfbAccessClass11Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass12Barred() {
        return isCsfbAccessClass12Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass13Barred() {
        return isCsfbAccessClass13Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass14Barred() {
        return isCsfbAccessClass14Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass15Barred() {
        return isCsfbAccessClass15Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass15Barred = value;
    }

}
