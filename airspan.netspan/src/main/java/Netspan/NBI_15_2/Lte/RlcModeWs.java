
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Qci2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci2" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci3" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci4IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci4" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci5" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci6" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci7" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci8" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="Qci9IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Qci9" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
 *         &lt;element name="SrbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Srb" type="{http://Airspan.Netspan.WebServices}AckMode" minOccurs="0"/>
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
    "qci2IsDefault",
    "qci2",
    "qci3IsDefault",
    "qci3",
    "qci4IsDefault",
    "qci4",
    "qci5IsDefault",
    "qci5",
    "qci6IsDefault",
    "qci6",
    "qci7IsDefault",
    "qci7",
    "qci8IsDefault",
    "qci8",
    "qci9IsDefault",
    "qci9",
    "srbIsDefault",
    "srb"
})
public class RlcModeWs {

    @XmlElementRef(name = "Qci1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1IsDefault;
    @XmlElementRef(name = "Qci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci1;
    @XmlElementRef(name = "Qci2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2IsDefault;
    @XmlElementRef(name = "Qci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci2;
    @XmlElementRef(name = "Qci3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3IsDefault;
    @XmlElementRef(name = "Qci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci3;
    @XmlElementRef(name = "Qci4IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4IsDefault;
    @XmlElementRef(name = "Qci4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci4;
    @XmlElementRef(name = "Qci5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5IsDefault;
    @XmlElementRef(name = "Qci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci5;
    @XmlElementRef(name = "Qci6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6IsDefault;
    @XmlElementRef(name = "Qci6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci6;
    @XmlElementRef(name = "Qci7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7IsDefault;
    @XmlElementRef(name = "Qci7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci7;
    @XmlElementRef(name = "Qci8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8IsDefault;
    @XmlElementRef(name = "Qci8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci8;
    @XmlElementRef(name = "Qci9IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9IsDefault;
    @XmlElementRef(name = "Qci9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> qci9;
    @XmlElementRef(name = "SrbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> srbIsDefault;
    @XmlElementRef(name = "Srb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AckMode> srb;

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
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public JAXBElement<AckMode> getSrb() {
        return srb;
    }

    /**
     * Sets the value of the srb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AckMode }{@code >}
     *     
     */
    public void setSrb(JAXBElement<AckMode> value) {
        this.srb = value;
    }

}
