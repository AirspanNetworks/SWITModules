
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReselectionToUtranWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReselectionToUtranWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UtraSpeedStateScaleFactorsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UtraSpeedStateScaleFactors" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues"/>
 *         &lt;element name="ReselectionUtranSfMediumIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReselectionUtranSfMedium" type="{http://Airspan.Netspan.WebServices}ReselectionNsf" minOccurs="0"/>
 *         &lt;element name="ReselectionUtranSfHighIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReselectionUtranSfHigh" type="{http://Airspan.Netspan.WebServices}ReselectionNsf" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReselectionToUtranWs", propOrder = {
    "utraSpeedStateScaleFactorsIsDefault",
    "utraSpeedStateScaleFactors",
    "reselectionUtranSfMediumIsDefault",
    "reselectionUtranSfMedium",
    "reselectionUtranSfHighIsDefault",
    "reselectionUtranSfHigh"
})
public class ReselectionToUtranWs {

    @XmlElement(name = "UtraSpeedStateScaleFactorsIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean utraSpeedStateScaleFactorsIsDefault;
    @XmlElement(name = "UtraSpeedStateScaleFactors", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected EnabledDisabledValues utraSpeedStateScaleFactors;
    @XmlElementRef(name = "ReselectionUtranSfMediumIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionUtranSfMediumIsDefault;
    @XmlElementRef(name = "ReselectionUtranSfMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionUtranSfMedium;
    @XmlElementRef(name = "ReselectionUtranSfHighIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reselectionUtranSfHighIsDefault;
    @XmlElementRef(name = "ReselectionUtranSfHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reselectionUtranSfHigh;

    /**
     * Gets the value of the utraSpeedStateScaleFactorsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtraSpeedStateScaleFactorsIsDefault() {
        return utraSpeedStateScaleFactorsIsDefault;
    }

    /**
     * Sets the value of the utraSpeedStateScaleFactorsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtraSpeedStateScaleFactorsIsDefault(Boolean value) {
        this.utraSpeedStateScaleFactorsIsDefault = value;
    }

    /**
     * Gets the value of the utraSpeedStateScaleFactors property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public EnabledDisabledValues getUtraSpeedStateScaleFactors() {
        return utraSpeedStateScaleFactors;
    }

    /**
     * Sets the value of the utraSpeedStateScaleFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledDisabledValues }
     *     
     */
    public void setUtraSpeedStateScaleFactors(EnabledDisabledValues value) {
        this.utraSpeedStateScaleFactors = value;
    }

    /**
     * Gets the value of the reselectionUtranSfMediumIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionUtranSfMediumIsDefault() {
        return reselectionUtranSfMediumIsDefault;
    }

    /**
     * Sets the value of the reselectionUtranSfMediumIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionUtranSfMediumIsDefault(JAXBElement<Boolean> value) {
        this.reselectionUtranSfMediumIsDefault = value;
    }

    /**
     * Gets the value of the reselectionUtranSfMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionUtranSfMedium() {
        return reselectionUtranSfMedium;
    }

    /**
     * Sets the value of the reselectionUtranSfMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionUtranSfMedium(JAXBElement<String> value) {
        this.reselectionUtranSfMedium = value;
    }

    /**
     * Gets the value of the reselectionUtranSfHighIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReselectionUtranSfHighIsDefault() {
        return reselectionUtranSfHighIsDefault;
    }

    /**
     * Sets the value of the reselectionUtranSfHighIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReselectionUtranSfHighIsDefault(JAXBElement<Boolean> value) {
        this.reselectionUtranSfHighIsDefault = value;
    }

    /**
     * Gets the value of the reselectionUtranSfHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReselectionUtranSfHigh() {
        return reselectionUtranSfHigh;
    }

    /**
     * Sets the value of the reselectionUtranSfHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReselectionUtranSfHigh(JAXBElement<String> value) {
        this.reselectionUtranSfHigh = value;
    }

}
