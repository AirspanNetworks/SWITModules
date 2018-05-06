
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandoverWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandoverWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowHoWithoutHrlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowHoWithoutHrl" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandoverWs", propOrder = {
    "allowHoWithoutHrlIsDefault",
    "allowHoWithoutHrl"
})
public class HandoverWs {

    @XmlElementRef(name = "AllowHoWithoutHrlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowHoWithoutHrlIsDefault;
    @XmlElementRef(name = "AllowHoWithoutHrl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> allowHoWithoutHrl;

    /**
     * Gets the value of the allowHoWithoutHrlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowHoWithoutHrlIsDefault() {
        return allowHoWithoutHrlIsDefault;
    }

    /**
     * Sets the value of the allowHoWithoutHrlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowHoWithoutHrlIsDefault(JAXBElement<Boolean> value) {
        this.allowHoWithoutHrlIsDefault = value;
    }

    /**
     * Gets the value of the allowHoWithoutHrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getAllowHoWithoutHrl() {
        return allowHoWithoutHrl;
    }

    /**
     * Sets the value of the allowHoWithoutHrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setAllowHoWithoutHrl(JAXBElement<EnabledDisabledValues> value) {
        this.allowHoWithoutHrl = value;
    }

}
