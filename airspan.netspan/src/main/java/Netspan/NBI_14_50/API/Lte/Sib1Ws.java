
package Netspan.NBI_14_50.API.Lte;

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
 *         &lt;element name="S6PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S6Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="S7PeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S7Periodicity" type="{http://Airspan.Netspan.WebServices}Periodicity" minOccurs="0"/>
 *         &lt;element name="QrxLevMinIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QrxLevMin" type="{http://Airspan.Netspan.WebServices}QrxLevelMinValues"/>
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
    "s6PeriodicityIsDefault",
    "s6Periodicity",
    "s7PeriodicityIsDefault",
    "s7Periodicity",
    "qrxLevMinIsDefault",
    "qrxLevMin"
})
public class Sib1Ws {

    @XmlElementRef(name = "S6PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s6PeriodicityIsDefault;
    @XmlElementRef(name = "S6Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s6Periodicity;
    @XmlElementRef(name = "S7PeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s7PeriodicityIsDefault;
    @XmlElementRef(name = "S7Periodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s7Periodicity;
    @XmlElementRef(name = "QrxLevMinIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qrxLevMinIsDefault;
    @XmlElement(name = "QrxLevMin", required = true, nillable = true)
    protected String qrxLevMin;

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
     *     {@link String }
     *     
     */
    public String getQrxLevMin() {
        return qrxLevMin;
    }

    /**
     * Sets the value of the qrxLevMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrxLevMin(String value) {
        this.qrxLevMin = value;
    }

}
