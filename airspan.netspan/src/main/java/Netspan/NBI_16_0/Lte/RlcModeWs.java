
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for RlcModeWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RlcModeWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qci1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci1" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci1PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci1PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci2" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci2PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci2PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci3" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci3PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci3PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci4IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci4" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci4PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci4PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci5" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci5PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci5PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci6" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci6PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci6PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci7" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci7PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci7PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci8" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci8PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci8PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="Qci9IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci9" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci9PdcpStatusReportEnableIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci9PdcpStatusReportEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="SrbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Srb" type="{http://Airspan.Netspan.WebServices}AckModeOnly" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlcModeWs", propOrder = {
    "qci1IsDefault",
    "qci1",
    "qci1PdcpStatusReportEnableIsDefault",
    "qci1PdcpStatusReportEnable",
    "qci2IsDefault",
    "qci2",
    "qci2PdcpStatusReportEnableIsDefault",
    "qci2PdcpStatusReportEnable",
    "qci3IsDefault",
    "qci3",
    "qci3PdcpStatusReportEnableIsDefault",
    "qci3PdcpStatusReportEnable",
    "qci4IsDefault",
    "qci4",
    "qci4PdcpStatusReportEnableIsDefault",
    "qci4PdcpStatusReportEnable",
    "qci5IsDefault",
    "qci5",
    "qci5PdcpStatusReportEnableIsDefault",
    "qci5PdcpStatusReportEnable",
    "qci6IsDefault",
    "qci6",
    "qci6PdcpStatusReportEnableIsDefault",
    "qci6PdcpStatusReportEnable",
    "qci7IsDefault",
    "qci7",
    "qci7PdcpStatusReportEnableIsDefault",
    "qci7PdcpStatusReportEnable",
    "qci8IsDefault",
    "qci8",
    "qci8PdcpStatusReportEnableIsDefault",
    "qci8PdcpStatusReportEnable",
    "qci9IsDefault",
    "qci9",
    "qci9PdcpStatusReportEnableIsDefault",
    "qci9PdcpStatusReportEnable",
    "srbIsDefault",
    "srb"
})
public class RlcModeWs {

    @XmlElementRef(name = "Qci1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1IsDefault;
    @XmlElementRef(name = "Qci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci1;
    @XmlElementRef(name = "Qci1PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci1PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci1PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2IsDefault;
    @XmlElementRef(name = "Qci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci2;
    @XmlElementRef(name = "Qci2PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci2PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci2PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3IsDefault;
    @XmlElementRef(name = "Qci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci3;
    @XmlElementRef(name = "Qci3PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci3PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci3PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci4IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4IsDefault;
    @XmlElementRef(name = "Qci4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci4;
    @XmlElementRef(name = "Qci4PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci4PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci4PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5IsDefault;
    @XmlElementRef(name = "Qci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci5;
    @XmlElementRef(name = "Qci5PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci5PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci5PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6IsDefault;
    @XmlElementRef(name = "Qci6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci6;
    @XmlElementRef(name = "Qci6PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci6PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci6PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7IsDefault;
    @XmlElementRef(name = "Qci7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci7;
    @XmlElementRef(name = "Qci7PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci7PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci7PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8IsDefault;
    @XmlElementRef(name = "Qci8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci8;
    @XmlElementRef(name = "Qci8PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci8PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci8PdcpStatusReportEnable;
    @XmlElementRef(name = "Qci9IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9IsDefault;
    @XmlElementRef(name = "Qci9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci9;
    @XmlElementRef(name = "Qci9PdcpStatusReportEnableIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9PdcpStatusReportEnableIsDefault;
    @XmlElementRef(name = "Qci9PdcpStatusReportEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> qci9PdcpStatusReportEnable;
    @XmlElementRef(name = "SrbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> srbIsDefault;
    @XmlElementRef(name = "Srb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckModeOnly> srb;

    /**
     * Gets the value of the qci1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1IsDefault() {
        return qci1IsDefault;
    }

    /**
     * Sets the value of the qci1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1IsDefault(JAXBElement<Boolean> value) {
        this.qci1IsDefault = value;
    }

    /**
     * Gets the value of the qci1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci1() {
        return qci1;
    }

    /**
     * Sets the value of the qci1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci1(JAXBElement<AckMode> value) {
        this.qci1 = value;
    }

    /**
     * Gets the value of the qci1PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci1PdcpStatusReportEnableIsDefault() {
        return qci1PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci1PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci1PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci1PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci1PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci1PdcpStatusReportEnable() {
        return qci1PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci1PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci1PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci1PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci2IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2IsDefault() {
        return qci2IsDefault;
    }

    /**
     * Sets the value of the qci2IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2IsDefault(JAXBElement<Boolean> value) {
        this.qci2IsDefault = value;
    }

    /**
     * Gets the value of the qci2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci2() {
        return qci2;
    }

    /**
     * Sets the value of the qci2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci2(JAXBElement<AckMode> value) {
        this.qci2 = value;
    }

    /**
     * Gets the value of the qci2PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci2PdcpStatusReportEnableIsDefault() {
        return qci2PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci2PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci2PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci2PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci2PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci2PdcpStatusReportEnable() {
        return qci2PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci2PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci2PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci2PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci3IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3IsDefault() {
        return qci3IsDefault;
    }

    /**
     * Sets the value of the qci3IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3IsDefault(JAXBElement<Boolean> value) {
        this.qci3IsDefault = value;
    }

    /**
     * Gets the value of the qci3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci3() {
        return qci3;
    }

    /**
     * Sets the value of the qci3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci3(JAXBElement<AckMode> value) {
        this.qci3 = value;
    }

    /**
     * Gets the value of the qci3PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci3PdcpStatusReportEnableIsDefault() {
        return qci3PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci3PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci3PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci3PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci3PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci3PdcpStatusReportEnable() {
        return qci3PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci3PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci3PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci3PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci4IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4IsDefault() {
        return qci4IsDefault;
    }

    /**
     * Sets the value of the qci4IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4IsDefault(JAXBElement<Boolean> value) {
        this.qci4IsDefault = value;
    }

    /**
     * Gets the value of the qci4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci4() {
        return qci4;
    }

    /**
     * Sets the value of the qci4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci4(JAXBElement<AckMode> value) {
        this.qci4 = value;
    }

    /**
     * Gets the value of the qci4PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci4PdcpStatusReportEnableIsDefault() {
        return qci4PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci4PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci4PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci4PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci4PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci4PdcpStatusReportEnable() {
        return qci4PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci4PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci4PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci4PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci5IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5IsDefault() {
        return qci5IsDefault;
    }

    /**
     * Sets the value of the qci5IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5IsDefault(JAXBElement<Boolean> value) {
        this.qci5IsDefault = value;
    }

    /**
     * Gets the value of the qci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci5() {
        return qci5;
    }

    /**
     * Sets the value of the qci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci5(JAXBElement<AckMode> value) {
        this.qci5 = value;
    }

    /**
     * Gets the value of the qci5PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci5PdcpStatusReportEnableIsDefault() {
        return qci5PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci5PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci5PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci5PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci5PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci5PdcpStatusReportEnable() {
        return qci5PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci5PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci5PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci5PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci6IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6IsDefault() {
        return qci6IsDefault;
    }

    /**
     * Sets the value of the qci6IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6IsDefault(JAXBElement<Boolean> value) {
        this.qci6IsDefault = value;
    }

    /**
     * Gets the value of the qci6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci6() {
        return qci6;
    }

    /**
     * Sets the value of the qci6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci6(JAXBElement<AckMode> value) {
        this.qci6 = value;
    }

    /**
     * Gets the value of the qci6PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci6PdcpStatusReportEnableIsDefault() {
        return qci6PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci6PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci6PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci6PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci6PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci6PdcpStatusReportEnable() {
        return qci6PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci6PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci6PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci6PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci7IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7IsDefault() {
        return qci7IsDefault;
    }

    /**
     * Sets the value of the qci7IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7IsDefault(JAXBElement<Boolean> value) {
        this.qci7IsDefault = value;
    }

    /**
     * Gets the value of the qci7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci7() {
        return qci7;
    }

    /**
     * Sets the value of the qci7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci7(JAXBElement<AckMode> value) {
        this.qci7 = value;
    }

    /**
     * Gets the value of the qci7PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci7PdcpStatusReportEnableIsDefault() {
        return qci7PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci7PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci7PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci7PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci7PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci7PdcpStatusReportEnable() {
        return qci7PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci7PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci7PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci7PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci8IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8IsDefault() {
        return qci8IsDefault;
    }

    /**
     * Sets the value of the qci8IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8IsDefault(JAXBElement<Boolean> value) {
        this.qci8IsDefault = value;
    }

    /**
     * Gets the value of the qci8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci8() {
        return qci8;
    }

    /**
     * Sets the value of the qci8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci8(JAXBElement<AckMode> value) {
        this.qci8 = value;
    }

    /**
     * Gets the value of the qci8PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci8PdcpStatusReportEnableIsDefault() {
        return qci8PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci8PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci8PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci8PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci8PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci8PdcpStatusReportEnable() {
        return qci8PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci8PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci8PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci8PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the qci9IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9IsDefault() {
        return qci9IsDefault;
    }

    /**
     * Sets the value of the qci9IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9IsDefault(JAXBElement<Boolean> value) {
        this.qci9IsDefault = value;
    }

    /**
     * Gets the value of the qci9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getQci9() {
        return qci9;
    }

    /**
     * Sets the value of the qci9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setQci9(JAXBElement<AckMode> value) {
        this.qci9 = value;
    }

    /**
     * Gets the value of the qci9PdcpStatusReportEnableIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQci9PdcpStatusReportEnableIsDefault() {
        return qci9PdcpStatusReportEnableIsDefault;
    }

    /**
     * Sets the value of the qci9PdcpStatusReportEnableIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQci9PdcpStatusReportEnableIsDefault(JAXBElement<Boolean> value) {
        this.qci9PdcpStatusReportEnableIsDefault = value;
    }

    /**
     * Gets the value of the qci9PdcpStatusReportEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getQci9PdcpStatusReportEnable() {
        return qci9PdcpStatusReportEnable;
    }

    /**
     * Sets the value of the qci9PdcpStatusReportEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setQci9PdcpStatusReportEnable(JAXBElement<EnabledStates> value) {
        this.qci9PdcpStatusReportEnable = value;
    }

    /**
     * Gets the value of the srbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSrbIsDefault() {
        return srbIsDefault;
    }

    /**
     * Sets the value of the srbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSrbIsDefault(JAXBElement<Boolean> value) {
        this.srbIsDefault = value;
    }

    /**
     * Gets the value of the srb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AckModeOnly }{@code >}
     *     
     */
    public JAXBElement<AckModeOnly> getSrb() {
        return srb;
    }

    /**
     * Sets the value of the srb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckModeOnly }{@code >}
     *     
     */
    public void setSrb(JAXBElement<AckModeOnly> value) {
        this.srb = value;
    }

}
