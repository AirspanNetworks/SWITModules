
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EmergencyCallQciWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmergencyCallQciWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QCI1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI3" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI4IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI4" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI5" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI6" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI7" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI8" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="QCI9IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QCI9" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmergencyCallQciWs", propOrder = {
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
    "qci9"
})
public class EmergencyCallQciWs {

    @XmlElementRef(name = "QCI1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci1IsDefault;
    @XmlElementRef(name = "QCI1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci1;
    @XmlElementRef(name = "QCI2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci2IsDefault;
    @XmlElementRef(name = "QCI2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci2;
    @XmlElementRef(name = "QCI3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci3IsDefault;
    @XmlElementRef(name = "QCI3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci3;
    @XmlElementRef(name = "QCI4IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci4IsDefault;
    @XmlElementRef(name = "QCI4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci4;
    @XmlElementRef(name = "QCI5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci5IsDefault;
    @XmlElementRef(name = "QCI5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci5;
    @XmlElementRef(name = "QCI6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci6IsDefault;
    @XmlElementRef(name = "QCI6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci6;
    @XmlElementRef(name = "QCI7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci7IsDefault;
    @XmlElementRef(name = "QCI7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci7;
    @XmlElementRef(name = "QCI8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci8IsDefault;
    @XmlElementRef(name = "QCI8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci8;
    @XmlElementRef(name = "QCI9IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> qci9IsDefault;
    @XmlElementRef(name = "QCI9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> qci9;

    /**
     * Gets the value of the qci1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getQCI1IsDefault() {
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
    public void setQCI1IsDefault(JAXBElement<Boolean> value) {
        this.qci1IsDefault = value;
    }

    /**
     * Gets the value of the qci1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI1() {
        return qci1;
    }

    /**
     * Sets the value of the qci1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI1(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI2IsDefault() {
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
    public void setQCI2IsDefault(JAXBElement<Boolean> value) {
        this.qci2IsDefault = value;
    }

    /**
     * Gets the value of the qci2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI2() {
        return qci2;
    }

    /**
     * Sets the value of the qci2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI2(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI3IsDefault() {
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
    public void setQCI3IsDefault(JAXBElement<Boolean> value) {
        this.qci3IsDefault = value;
    }

    /**
     * Gets the value of the qci3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI3() {
        return qci3;
    }

    /**
     * Sets the value of the qci3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI3(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI4IsDefault() {
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
    public void setQCI4IsDefault(JAXBElement<Boolean> value) {
        this.qci4IsDefault = value;
    }

    /**
     * Gets the value of the qci4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI4() {
        return qci4;
    }

    /**
     * Sets the value of the qci4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI4(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI5IsDefault() {
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
    public void setQCI5IsDefault(JAXBElement<Boolean> value) {
        this.qci5IsDefault = value;
    }

    /**
     * Gets the value of the qci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI5() {
        return qci5;
    }

    /**
     * Sets the value of the qci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI5(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI6IsDefault() {
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
    public void setQCI6IsDefault(JAXBElement<Boolean> value) {
        this.qci6IsDefault = value;
    }

    /**
     * Gets the value of the qci6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI6() {
        return qci6;
    }

    /**
     * Sets the value of the qci6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI6(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI7IsDefault() {
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
    public void setQCI7IsDefault(JAXBElement<Boolean> value) {
        this.qci7IsDefault = value;
    }

    /**
     * Gets the value of the qci7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI7() {
        return qci7;
    }

    /**
     * Sets the value of the qci7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI7(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI8IsDefault() {
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
    public void setQCI8IsDefault(JAXBElement<Boolean> value) {
        this.qci8IsDefault = value;
    }

    /**
     * Gets the value of the qci8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI8() {
        return qci8;
    }

    /**
     * Sets the value of the qci8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI8(JAXBElement<EnabledDisabledStates> value) {
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
    public JAXBElement<Boolean> getQCI9IsDefault() {
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
    public void setQCI9IsDefault(JAXBElement<Boolean> value) {
        this.qci9IsDefault = value;
    }

    /**
     * Gets the value of the qci9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getQCI9() {
        return qci9;
    }

    /**
     * Sets the value of the qci9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setQCI9(JAXBElement<EnabledDisabledStates> value) {
        this.qci9 = value;
    }

}
