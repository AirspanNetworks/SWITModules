
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sib1Ws complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sib1Ws">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QrxLevMinIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QrxLevMin" type="{http://Airspan.Netspan.WebServices}QrxLevelMinValues" minOccurs="0"/>
 *         &lt;element name="PmaxIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Pmax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SiWindowLengthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SiWindowLength" type="{http://Airspan.Netspan.WebServices}WindowLength" minOccurs="0"/>
 *         &lt;element name="S2PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S2Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S3PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S3Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S4PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S4Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S5PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S5Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S6PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S6Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S7PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S7Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S8PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S8Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S9PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S9Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S10PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S10Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S11PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S11Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S12PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S12Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S13PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S13Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S15PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="S15Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity"/>
 *         &lt;element name="QqualMinValueIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QqualMinValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QqualMinOffsetIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QqualMinOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sib1Ws", propOrder = {
    "qrxLevMinIsDefault",
    "qrxLevMin",
    "pmaxIsDefault",
    "pmax",
    "siWindowLengthIsDefault",
    "siWindowLength",
    "s2PeriodicityIsDefault",
    "s2Periodicity",
    "s3PeriodicityIsDefault",
    "s3Periodicity",
    "s4PeriodicityIsDefault",
    "s4Periodicity",
    "s5PeriodicityIsDefault",
    "s5Periodicity",
    "s6PeriodicityIsDefault",
    "s6Periodicity",
    "s7PeriodicityIsDefault",
    "s7Periodicity",
    "s8PeriodicityIsDefault",
    "s8Periodicity",
    "s9PeriodicityIsDefault",
    "s9Periodicity",
    "s10PeriodicityIsDefault",
    "s10Periodicity",
    "s11PeriodicityIsDefault",
    "s11Periodicity",
    "s12PeriodicityIsDefault",
    "s12Periodicity",
    "s13PeriodicityIsDefault",
    "s13Periodicity",
    "s15PeriodicityIsDefault",
    "s15Periodicity",
    "qqualMinValueIsDefault",
    "qqualMinValue",
    "qqualMinOffsetIsDefault",
    "qqualMinOffset"
})
public class Sib1Ws {

    @XmlElementRef(name = "QrxLevMinIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qrxLevMinIsDefault;
    @XmlElementRef(name = "QrxLevMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qrxLevMin;
    @XmlElementRef(name = "PmaxIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pmaxIsDefault;
    @XmlElementRef(name = "Pmax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pmax;
    @XmlElementRef(name = "SiWindowLengthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> siWindowLengthIsDefault;
    @XmlElementRef(name = "SiWindowLength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> siWindowLength;
    @XmlElementRef(name = "S2PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s2PeriodicityIsDefault;
    @XmlElementRef(name = "S2Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s2Periodicity;
    @XmlElementRef(name = "S3PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s3PeriodicityIsDefault;
    @XmlElementRef(name = "S3Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s3Periodicity;
    @XmlElementRef(name = "S4PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s4PeriodicityIsDefault;
    @XmlElementRef(name = "S4Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s4Periodicity;
    @XmlElementRef(name = "S5PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s5PeriodicityIsDefault;
    @XmlElementRef(name = "S5Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s5Periodicity;
    @XmlElementRef(name = "S6PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s6PeriodicityIsDefault;
    @XmlElementRef(name = "S6Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s6Periodicity;
    @XmlElementRef(name = "S7PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s7PeriodicityIsDefault;
    @XmlElementRef(name = "S7Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s7Periodicity;
    @XmlElementRef(name = "S8PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s8PeriodicityIsDefault;
    @XmlElementRef(name = "S8Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s8Periodicity;
    @XmlElementRef(name = "S9PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s9PeriodicityIsDefault;
    @XmlElementRef(name = "S9Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s9Periodicity;
    @XmlElementRef(name = "S10PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s10PeriodicityIsDefault;
    @XmlElementRef(name = "S10Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s10Periodicity;
    @XmlElementRef(name = "S11PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s11PeriodicityIsDefault;
    @XmlElementRef(name = "S11Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s11Periodicity;
    @XmlElementRef(name = "S12PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s12PeriodicityIsDefault;
    @XmlElementRef(name = "S12Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s12Periodicity;
    @XmlElementRef(name = "S13PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s13PeriodicityIsDefault;
    @XmlElementRef(name = "S13Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s13Periodicity;
    @XmlElement(name = "S15PeriodicityIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean s15PeriodicityIsDefault;
    @XmlElement(name = "S15Periodicity", required = true, nillable = true)
    protected String s15Periodicity;
    @XmlElementRef(name = "QqualMinValueIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qqualMinValueIsDefault;
    @XmlElementRef(name = "QqualMinValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qqualMinValue;
    @XmlElementRef(name = "QqualMinOffsetIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qqualMinOffsetIsDefault;
    @XmlElementRef(name = "QqualMinOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qqualMinOffset;

    /**
     * Gets the value of the qrxLevMinIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQrxLevMinIsDefault() {
        return qrxLevMinIsDefault;
    }

    /**
     * Sets the value of the qrxLevMinIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQrxLevMinIsDefault(JAXBElement<Boolean> value) {
        this.qrxLevMinIsDefault = value;
    }

    /**
     * Gets the value of the qrxLevMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQrxLevMin() {
        return qrxLevMin;
    }

    /**
     * Sets the value of the qrxLevMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQrxLevMin(JAXBElement<String> value) {
        this.qrxLevMin = value;
    }

    /**
     * Gets the value of the pmaxIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPmaxIsDefault() {
        return pmaxIsDefault;
    }

    /**
     * Sets the value of the pmaxIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPmaxIsDefault(JAXBElement<Boolean> value) {
        this.pmaxIsDefault = value;
    }

    /**
     * Gets the value of the pmax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPmax() {
        return pmax;
    }

    /**
     * Sets the value of the pmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPmax(JAXBElement<Integer> value) {
        this.pmax = value;
    }

    /**
     * Gets the value of the siWindowLengthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSiWindowLengthIsDefault() {
        return siWindowLengthIsDefault;
    }

    /**
     * Sets the value of the siWindowLengthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSiWindowLengthIsDefault(JAXBElement<Boolean> value) {
        this.siWindowLengthIsDefault = value;
    }

    /**
     * Gets the value of the siWindowLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSiWindowLength() {
        return siWindowLength;
    }

    /**
     * Sets the value of the siWindowLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSiWindowLength(JAXBElement<String> value) {
        this.siWindowLength = value;
    }

    /**
     * Gets the value of the s2PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS2PeriodicityIsDefault() {
        return s2PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s2PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS2PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s2PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s2Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS2Periodicity() {
        return s2Periodicity;
    }

    /**
     * Sets the value of the s2Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS2Periodicity(JAXBElement<String> value) {
        this.s2Periodicity = value;
    }

    /**
     * Gets the value of the s3PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS3PeriodicityIsDefault() {
        return s3PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s3PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS3PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s3PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s3Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS3Periodicity() {
        return s3Periodicity;
    }

    /**
     * Sets the value of the s3Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS3Periodicity(JAXBElement<String> value) {
        this.s3Periodicity = value;
    }

    /**
     * Gets the value of the s4PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS4PeriodicityIsDefault() {
        return s4PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s4PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS4PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s4PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s4Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS4Periodicity() {
        return s4Periodicity;
    }

    /**
     * Sets the value of the s4Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS4Periodicity(JAXBElement<String> value) {
        this.s4Periodicity = value;
    }

    /**
     * Gets the value of the s5PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS5PeriodicityIsDefault() {
        return s5PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s5PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS5PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s5PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s5Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS5Periodicity() {
        return s5Periodicity;
    }

    /**
     * Sets the value of the s5Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS5Periodicity(JAXBElement<String> value) {
        this.s5Periodicity = value;
    }

    /**
     * Gets the value of the s6PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS6PeriodicityIsDefault() {
        return s6PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s6PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS6PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s6PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s6Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS6Periodicity() {
        return s6Periodicity;
    }

    /**
     * Sets the value of the s6Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS6Periodicity(JAXBElement<String> value) {
        this.s6Periodicity = value;
    }

    /**
     * Gets the value of the s7PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS7PeriodicityIsDefault() {
        return s7PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s7PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS7PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s7PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s7Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS7Periodicity() {
        return s7Periodicity;
    }

    /**
     * Sets the value of the s7Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS7Periodicity(JAXBElement<String> value) {
        this.s7Periodicity = value;
    }

    /**
     * Gets the value of the s8PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS8PeriodicityIsDefault() {
        return s8PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s8PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS8PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s8PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s8Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS8Periodicity() {
        return s8Periodicity;
    }

    /**
     * Sets the value of the s8Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS8Periodicity(JAXBElement<String> value) {
        this.s8Periodicity = value;
    }

    /**
     * Gets the value of the s9PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS9PeriodicityIsDefault() {
        return s9PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s9PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS9PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s9PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s9Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS9Periodicity() {
        return s9Periodicity;
    }

    /**
     * Sets the value of the s9Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS9Periodicity(JAXBElement<String> value) {
        this.s9Periodicity = value;
    }

    /**
     * Gets the value of the s10PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS10PeriodicityIsDefault() {
        return s10PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s10PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS10PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s10PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s10Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS10Periodicity() {
        return s10Periodicity;
    }

    /**
     * Sets the value of the s10Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS10Periodicity(JAXBElement<String> value) {
        this.s10Periodicity = value;
    }

    /**
     * Gets the value of the s11PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS11PeriodicityIsDefault() {
        return s11PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s11PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS11PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s11PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s11Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS11Periodicity() {
        return s11Periodicity;
    }

    /**
     * Sets the value of the s11Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS11Periodicity(JAXBElement<String> value) {
        this.s11Periodicity = value;
    }

    /**
     * Gets the value of the s12PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS12PeriodicityIsDefault() {
        return s12PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s12PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS12PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s12PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s12Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS12Periodicity() {
        return s12Periodicity;
    }

    /**
     * Sets the value of the s12Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS12Periodicity(JAXBElement<String> value) {
        this.s12Periodicity = value;
    }

    /**
     * Gets the value of the s13PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS13PeriodicityIsDefault() {
        return s13PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s13PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS13PeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.s13PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s13Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS13Periodicity() {
        return s13Periodicity;
    }

    /**
     * Sets the value of the s13Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS13Periodicity(JAXBElement<String> value) {
        this.s13Periodicity = value;
    }

    /**
     * Gets the value of the s15PeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isS15PeriodicityIsDefault() {
        return s15PeriodicityIsDefault;
    }

    /**
     * Sets the value of the s15PeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setS15PeriodicityIsDefault(Boolean value) {
        this.s15PeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the s15Periodicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS15Periodicity() {
        return s15Periodicity;
    }

    /**
     * Sets the value of the s15Periodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS15Periodicity(String value) {
        this.s15Periodicity = value;
    }

    /**
     * Gets the value of the qqualMinValueIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQqualMinValueIsDefault() {
        return qqualMinValueIsDefault;
    }

    /**
     * Sets the value of the qqualMinValueIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQqualMinValueIsDefault(JAXBElement<Boolean> value) {
        this.qqualMinValueIsDefault = value;
    }

    /**
     * Gets the value of the qqualMinValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQqualMinValue() {
        return qqualMinValue;
    }

    /**
     * Sets the value of the qqualMinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQqualMinValue(JAXBElement<Integer> value) {
        this.qqualMinValue = value;
    }

    /**
     * Gets the value of the qqualMinOffsetIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQqualMinOffsetIsDefault() {
        return qqualMinOffsetIsDefault;
    }

    /**
     * Sets the value of the qqualMinOffsetIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setQqualMinOffsetIsDefault(JAXBElement<Boolean> value) {
        this.qqualMinOffsetIsDefault = value;
    }

    /**
     * Gets the value of the qqualMinOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQqualMinOffset() {
        return qqualMinOffset;
    }

    /**
     * Sets the value of the qqualMinOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQqualMinOffset(JAXBElement<Integer> value) {
        this.qqualMinOffset = value;
    }

}
