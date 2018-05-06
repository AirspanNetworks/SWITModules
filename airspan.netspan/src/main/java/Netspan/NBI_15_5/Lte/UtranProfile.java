
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for UtranProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtranProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="UtranEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryArfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryDuplexMode" type="{http://Airspan.Netspan.WebServices}UtranDuplexModes" minOccurs="0"/>
 *         &lt;element name="PrimaryArfcnBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondaryArfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondaryDuplexMode" type="{http://Airspan.Netspan.WebServices}UtranDuplexModes" minOccurs="0"/>
 *         &lt;element name="SecondaryArfcnBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="GeranPrimaryArfcnBand" type="{http://Airspan.Netspan.WebServices}GeranBands" minOccurs="0"/>
 *         &lt;element name="GeranPrimaryArfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranSecondaryArfcnBand" type="{http://Airspan.Netspan.WebServices}GeranBands" minOccurs="0"/>
 *         &lt;element name="GeranSecondaryArfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtranProfile", propOrder = {
    "name",
    "hardwareCategory",
    "utranEnabled",
    "primaryArfcn",
    "primaryDuplexMode",
    "primaryArfcnBand",
    "secondaryArfcn",
    "secondaryDuplexMode",
    "secondaryArfcnBand",
    "geranEnabled",
    "geranPrimaryArfcnBand",
    "geranPrimaryArfcn",
    "geranSecondaryArfcnBand",
    "geranSecondaryArfcn"
})
public class UtranProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "UtranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> utranEnabled;
    @XmlElementRef(name = "PrimaryArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryArfcn;
    @XmlElementRef(name = "PrimaryDuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UtranDuplexModes> primaryDuplexMode;
    @XmlElementRef(name = "PrimaryArfcnBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryArfcnBand;
    @XmlElementRef(name = "SecondaryArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secondaryArfcn;
    @XmlElementRef(name = "SecondaryDuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UtranDuplexModes> secondaryDuplexMode;
    @XmlElementRef(name = "SecondaryArfcnBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secondaryArfcnBand;
    @XmlElementRef(name = "GeranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> geranEnabled;
    @XmlElementRef(name = "GeranPrimaryArfcnBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GeranBands> geranPrimaryArfcnBand;
    @XmlElementRef(name = "GeranPrimaryArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranPrimaryArfcn;
    @XmlElementRef(name = "GeranSecondaryArfcnBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GeranBands> geranSecondaryArfcnBand;
    @XmlElementRef(name = "GeranSecondaryArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranSecondaryArfcn;

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

    /**
     * Gets the value of the utranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUtranEnabled() {
        return utranEnabled;
    }

    /**
     * Sets the value of the utranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUtranEnabled(JAXBElement<Boolean> value) {
        this.utranEnabled = value;
    }

    /**
     * Gets the value of the primaryArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrimaryArfcn() {
        return primaryArfcn;
    }

    /**
     * Sets the value of the primaryArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrimaryArfcn(JAXBElement<Integer> value) {
        this.primaryArfcn = value;
    }

    /**
     * Gets the value of the primaryDuplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}
     *     
     */
    public JAXBElement<UtranDuplexModes> getPrimaryDuplexMode() {
        return primaryDuplexMode;
    }

    /**
     * Sets the value of the primaryDuplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}
     *     
     */
    public void setPrimaryDuplexMode(JAXBElement<UtranDuplexModes> value) {
        this.primaryDuplexMode = value;
    }

    /**
     * Gets the value of the primaryArfcnBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrimaryArfcnBand() {
        return primaryArfcnBand;
    }

    /**
     * Sets the value of the primaryArfcnBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrimaryArfcnBand(JAXBElement<Integer> value) {
        this.primaryArfcnBand = value;
    }

    /**
     * Gets the value of the secondaryArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecondaryArfcn() {
        return secondaryArfcn;
    }

    /**
     * Sets the value of the secondaryArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecondaryArfcn(JAXBElement<Integer> value) {
        this.secondaryArfcn = value;
    }

    /**
     * Gets the value of the secondaryDuplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}
     *     
     */
    public JAXBElement<UtranDuplexModes> getSecondaryDuplexMode() {
        return secondaryDuplexMode;
    }

    /**
     * Sets the value of the secondaryDuplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}
     *     
     */
    public void setSecondaryDuplexMode(JAXBElement<UtranDuplexModes> value) {
        this.secondaryDuplexMode = value;
    }

    /**
     * Gets the value of the secondaryArfcnBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecondaryArfcnBand() {
        return secondaryArfcnBand;
    }

    /**
     * Sets the value of the secondaryArfcnBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecondaryArfcnBand(JAXBElement<Integer> value) {
        this.secondaryArfcnBand = value;
    }

    /**
     * Gets the value of the geranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getGeranEnabled() {
        return geranEnabled;
    }

    /**
     * Sets the value of the geranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setGeranEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.geranEnabled = value;
    }

    /**
     * Gets the value of the geranPrimaryArfcnBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeranBands }{@code >}
     *     
     */
    public JAXBElement<GeranBands> getGeranPrimaryArfcnBand() {
        return geranPrimaryArfcnBand;
    }

    /**
     * Sets the value of the geranPrimaryArfcnBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeranBands }{@code >}
     *     
     */
    public void setGeranPrimaryArfcnBand(JAXBElement<GeranBands> value) {
        this.geranPrimaryArfcnBand = value;
    }

    /**
     * Gets the value of the geranPrimaryArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranPrimaryArfcn() {
        return geranPrimaryArfcn;
    }

    /**
     * Sets the value of the geranPrimaryArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranPrimaryArfcn(JAXBElement<Integer> value) {
        this.geranPrimaryArfcn = value;
    }

    /**
     * Gets the value of the geranSecondaryArfcnBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeranBands }{@code >}
     *     
     */
    public JAXBElement<GeranBands> getGeranSecondaryArfcnBand() {
        return geranSecondaryArfcnBand;
    }

    /**
     * Sets the value of the geranSecondaryArfcnBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeranBands }{@code >}
     *     
     */
    public void setGeranSecondaryArfcnBand(JAXBElement<GeranBands> value) {
        this.geranSecondaryArfcnBand = value;
    }

    /**
     * Gets the value of the geranSecondaryArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranSecondaryArfcn() {
        return geranSecondaryArfcn;
    }

    /**
     * Sets the value of the geranSecondaryArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranSecondaryArfcn(JAXBElement<Integer> value) {
        this.geranSecondaryArfcn = value;
    }

}
