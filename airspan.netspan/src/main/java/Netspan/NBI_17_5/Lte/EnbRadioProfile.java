
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbRadioProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbRadioProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}EnbRadioProfileParams"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbRadioProfile", propOrder = {
    "name",
    "hardwareCategory"
})
@XmlSeeAlso({
    EnbRadioProfileGet.class
})
public class EnbRadioProfile
    extends EnbRadioProfileParams
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

}
