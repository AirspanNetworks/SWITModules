
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for ReselectionWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReselectionWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UtraSpeedStateScaleFactorsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UtraSpeedStateScaleFactors" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionUtraSfMediumIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionUtraSfMedium" type="{http://Airspan.Netspan.WebServices}ReselectionUtraSf" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionUtraSfHighIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionUtraSfHigh" type="{http://Airspan.Netspan.WebServices}ReselectionUtraSf" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit1" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit3" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit4IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit4" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit5" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit6" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit7" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NccPermittedBit8" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="GeranSpeedStateScaleFactorsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GeranSpeedStateScaleFactors" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionGeranSfMediumIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionGeranSfMedium" type="{http://Airspan.Netspan.WebServices}ReselectionGeranSf" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionGeranSfHighIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReselectionGeranSfHigh" type="{http://Airspan.Netspan.WebServices}ReselectionGeranSf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReselectionWs", propOrder = {
    "utraSpeedStateScaleFactorsIsDefault",
    "utraSpeedStateScaleFactors",
    "reselectionUtraSfMediumIsDefault",
    "reselectionUtraSfMedium",
    "reselectionUtraSfHighIsDefault",
    "reselectionUtraSfHigh",
    "nccPermittedBit1IsDefault",
    "nccPermittedBit1",
    "nccPermittedBit2IsDefault",
    "nccPermittedBit2",
    "nccPermittedBit3IsDefault",
    "nccPermittedBit3",
    "nccPermittedBit4IsDefault",
    "nccPermittedBit4",
    "nccPermittedBit5IsDefault",
    "nccPermittedBit5",
    "nccPermittedBit6IsDefault",
    "nccPermittedBit6",
    "nccPermittedBit7IsDefault",
    "nccPermittedBit7",
    "nccPermittedBit8IsDefault",
    "nccPermittedBit8",
    "geranSpeedStateScaleFactorsIsDefault",
    "geranSpeedStateScaleFactors",
    "reselectionGeranSfMediumIsDefault",
    "reselectionGeranSfMedium",
    "reselectionGeranSfHighIsDefault",
    "reselectionGeranSfHigh"
})
public class ReselectionWs {

    @XmlElementRef(name = "UtraSpeedStateScaleFactorsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> utraSpeedStateScaleFactorsIsDefault;
    @XmlElementRef(name = "UtraSpeedStateScaleFactors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> utraSpeedStateScaleFactors;
    @XmlElementRef(name = "ReselectionUtraSfMediumIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionUtraSfMediumIsDefault;
    @XmlElementRef(name = "ReselectionUtraSfMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionUtraSfMedium;
    @XmlElementRef(name = "ReselectionUtraSfHighIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionUtraSfHighIsDefault;
    @XmlElementRef(name = "ReselectionUtraSfHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionUtraSfHigh;
    @XmlElementRef(name = "NccPermittedBit1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit1IsDefault;
    @XmlElementRef(name = "NccPermittedBit1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit1;
    @XmlElementRef(name = "NccPermittedBit2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit2IsDefault;
    @XmlElementRef(name = "NccPermittedBit2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit2;
    @XmlElementRef(name = "NccPermittedBit3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit3IsDefault;
    @XmlElementRef(name = "NccPermittedBit3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit3;
    @XmlElementRef(name = "NccPermittedBit4IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit4IsDefault;
    @XmlElementRef(name = "NccPermittedBit4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit4;
    @XmlElementRef(name = "NccPermittedBit5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit5IsDefault;
    @XmlElementRef(name = "NccPermittedBit5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit5;
    @XmlElementRef(name = "NccPermittedBit6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit6IsDefault;
    @XmlElementRef(name = "NccPermittedBit6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit6;
    @XmlElementRef(name = "NccPermittedBit7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit7IsDefault;
    @XmlElementRef(name = "NccPermittedBit7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit7;
    @XmlElementRef(name = "NccPermittedBit8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nccPermittedBit8IsDefault;
    @XmlElementRef(name = "NccPermittedBit8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nccPermittedBit8;
    @XmlElementRef(name = "GeranSpeedStateScaleFactorsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> geranSpeedStateScaleFactorsIsDefault;
    @XmlElementRef(name = "GeranSpeedStateScaleFactors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> geranSpeedStateScaleFactors;
    @XmlElementRef(name = "ReselectionGeranSfMediumIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionGeranSfMediumIsDefault;
    @XmlElementRef(name = "ReselectionGeranSfMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionGeranSfMedium;
    @XmlElementRef(name = "ReselectionGeranSfHighIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionGeranSfHighIsDefault;
    @XmlElementRef(name = "ReselectionGeranSfHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionGeranSfHigh;

    /**
     * Gets the value of the utraSpeedStateScaleFactorsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUtraSpeedStateScaleFactorsIsDefault() {
        return utraSpeedStateScaleFactorsIsDefault;
    }

    /**
     * Sets the value of the utraSpeedStateScaleFactorsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUtraSpeedStateScaleFactorsIsDefault(JAXBElement<Boolean> value) {
        this.utraSpeedStateScaleFactorsIsDefault = value;
    }

    /**
     * Gets the value of the utraSpeedStateScaleFactors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getUtraSpeedStateScaleFactors() {
        return utraSpeedStateScaleFactors;
    }

    /**
     * Sets the value of the utraSpeedStateScaleFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setUtraSpeedStateScaleFactors(JAXBElement<EnabledStates> value) {
        this.utraSpeedStateScaleFactors = value;
    }

    /**
     * Gets the value of the reselectionUtraSfMediumIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionUtraSfMediumIsDefault() {
        return reselectionUtraSfMediumIsDefault;
    }

    /**
     * Sets the value of the reselectionUtraSfMediumIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionUtraSfMediumIsDefault(JAXBElement<Boolean> value) {
        this.reselectionUtraSfMediumIsDefault = value;
    }

    /**
     * Gets the value of the reselectionUtraSfMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionUtraSfMedium() {
        return reselectionUtraSfMedium;
    }

    /**
     * Sets the value of the reselectionUtraSfMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionUtraSfMedium(JAXBElement<String> value) {
        this.reselectionUtraSfMedium = value;
    }

    /**
     * Gets the value of the reselectionUtraSfHighIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionUtraSfHighIsDefault() {
        return reselectionUtraSfHighIsDefault;
    }

    /**
     * Sets the value of the reselectionUtraSfHighIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionUtraSfHighIsDefault(JAXBElement<Boolean> value) {
        this.reselectionUtraSfHighIsDefault = value;
    }

    /**
     * Gets the value of the reselectionUtraSfHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionUtraSfHigh() {
        return reselectionUtraSfHigh;
    }

    /**
     * Sets the value of the reselectionUtraSfHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionUtraSfHigh(JAXBElement<String> value) {
        this.reselectionUtraSfHigh = value;
    }

    /**
     * Gets the value of the nccPermittedBit1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit1IsDefault() {
        return nccPermittedBit1IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit1IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit1IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit1() {
        return nccPermittedBit1;
    }

    /**
     * Sets the value of the nccPermittedBit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit1(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit1 = value;
    }

    /**
     * Gets the value of the nccPermittedBit2IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit2IsDefault() {
        return nccPermittedBit2IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit2IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit2IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit2IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit2() {
        return nccPermittedBit2;
    }

    /**
     * Sets the value of the nccPermittedBit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit2(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit2 = value;
    }

    /**
     * Gets the value of the nccPermittedBit3IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit3IsDefault() {
        return nccPermittedBit3IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit3IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit3IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit3IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit3() {
        return nccPermittedBit3;
    }

    /**
     * Sets the value of the nccPermittedBit3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit3(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit3 = value;
    }

    /**
     * Gets the value of the nccPermittedBit4IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit4IsDefault() {
        return nccPermittedBit4IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit4IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit4IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit4IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit4() {
        return nccPermittedBit4;
    }

    /**
     * Sets the value of the nccPermittedBit4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit4(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit4 = value;
    }

    /**
     * Gets the value of the nccPermittedBit5IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit5IsDefault() {
        return nccPermittedBit5IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit5IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit5IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit5IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit5() {
        return nccPermittedBit5;
    }

    /**
     * Sets the value of the nccPermittedBit5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit5(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit5 = value;
    }

    /**
     * Gets the value of the nccPermittedBit6IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit6IsDefault() {
        return nccPermittedBit6IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit6IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit6IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit6IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit6() {
        return nccPermittedBit6;
    }

    /**
     * Sets the value of the nccPermittedBit6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit6(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit6 = value;
    }

    /**
     * Gets the value of the nccPermittedBit7IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit7IsDefault() {
        return nccPermittedBit7IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit7IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit7IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit7IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit7() {
        return nccPermittedBit7;
    }

    /**
     * Sets the value of the nccPermittedBit7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit7(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit7 = value;
    }

    /**
     * Gets the value of the nccPermittedBit8IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNccPermittedBit8IsDefault() {
        return nccPermittedBit8IsDefault;
    }

    /**
     * Sets the value of the nccPermittedBit8IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNccPermittedBit8IsDefault(JAXBElement<Boolean> value) {
        this.nccPermittedBit8IsDefault = value;
    }

    /**
     * Gets the value of the nccPermittedBit8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNccPermittedBit8() {
        return nccPermittedBit8;
    }

    /**
     * Sets the value of the nccPermittedBit8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNccPermittedBit8(JAXBElement<EnabledStates> value) {
        this.nccPermittedBit8 = value;
    }

    /**
     * Gets the value of the geranSpeedStateScaleFactorsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGeranSpeedStateScaleFactorsIsDefault() {
        return geranSpeedStateScaleFactorsIsDefault;
    }

    /**
     * Sets the value of the geranSpeedStateScaleFactorsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGeranSpeedStateScaleFactorsIsDefault(JAXBElement<Boolean> value) {
        this.geranSpeedStateScaleFactorsIsDefault = value;
    }

    /**
     * Gets the value of the geranSpeedStateScaleFactors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getGeranSpeedStateScaleFactors() {
        return geranSpeedStateScaleFactors;
    }

    /**
     * Sets the value of the geranSpeedStateScaleFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setGeranSpeedStateScaleFactors(JAXBElement<EnabledStates> value) {
        this.geranSpeedStateScaleFactors = value;
    }

    /**
     * Gets the value of the reselectionGeranSfMediumIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionGeranSfMediumIsDefault() {
        return reselectionGeranSfMediumIsDefault;
    }

    /**
     * Sets the value of the reselectionGeranSfMediumIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionGeranSfMediumIsDefault(JAXBElement<Boolean> value) {
        this.reselectionGeranSfMediumIsDefault = value;
    }

    /**
     * Gets the value of the reselectionGeranSfMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionGeranSfMedium() {
        return reselectionGeranSfMedium;
    }

    /**
     * Sets the value of the reselectionGeranSfMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionGeranSfMedium(JAXBElement<String> value) {
        this.reselectionGeranSfMedium = value;
    }

    /**
     * Gets the value of the reselectionGeranSfHighIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionGeranSfHighIsDefault() {
        return reselectionGeranSfHighIsDefault;
    }

    /**
     * Sets the value of the reselectionGeranSfHighIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionGeranSfHighIsDefault(JAXBElement<Boolean> value) {
        this.reselectionGeranSfHighIsDefault = value;
    }

    /**
     * Gets the value of the reselectionGeranSfHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionGeranSfHigh() {
        return reselectionGeranSfHigh;
    }

    /**
     * Sets the value of the reselectionGeranSfHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionGeranSfHigh(JAXBElement<String> value) {
        this.reselectionGeranSfHigh = value;
    }

}
