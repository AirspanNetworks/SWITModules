
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UplinkPowerControlWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UplinkPowerControlWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="P0NominalPuschIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="P0NominalPusch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AlphaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Alpha" type="{http://Airspan.Netspan.WebServices}UplinkAlpha" minOccurs="0"/>
 *         &lt;element name="DeltaPreambleMsg3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaPreambleMsg3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FilterCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FilterCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="P0NominalPucchIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="P0NominalPucch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat1IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat1" type="{http://Airspan.Netspan.WebServices}DeltaFormat" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat1bIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat1b" type="{http://Airspan.Netspan.WebServices}DeltaFormat1b" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2" type="{http://Airspan.Netspan.WebServices}DeltaFormat2" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2aIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2a" type="{http://Airspan.Netspan.WebServices}DeltaFormat" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2bIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeltaFPucchFormat2b" type="{http://Airspan.Netspan.WebServices}DeltaFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UplinkPowerControlWs", propOrder = {
    "p0NominalPuschIsDefault",
    "p0NominalPusch",
    "alphaIsDefault",
    "alpha",
    "deltaPreambleMsg3IsDefault",
    "deltaPreambleMsg3",
    "filterCoefficientIsDefault",
    "filterCoefficient",
    "p0NominalPucchIsDefault",
    "p0NominalPucch",
    "deltaFPucchFormat1IsDefault",
    "deltaFPucchFormat1",
    "deltaFPucchFormat1BIsDefault",
    "deltaFPucchFormat1B",
    "deltaFPucchFormat2IsDefault",
    "deltaFPucchFormat2",
    "deltaFPucchFormat2AIsDefault",
    "deltaFPucchFormat2A",
    "deltaFPucchFormat2BIsDefault",
    "deltaFPucchFormat2B"
})
public class UplinkPowerControlWs {

    @XmlElementRef(name = "P0NominalPuschIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> p0NominalPuschIsDefault;
    @XmlElementRef(name = "P0NominalPusch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> p0NominalPusch;
    @XmlElementRef(name = "AlphaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaIsDefault;
    @XmlElementRef(name = "Alpha", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alpha;
    @XmlElementRef(name = "DeltaPreambleMsg3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaPreambleMsg3IsDefault;
    @XmlElementRef(name = "DeltaPreambleMsg3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> deltaPreambleMsg3;
    @XmlElementRef(name = "FilterCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filterCoefficientIsDefault;
    @XmlElementRef(name = "FilterCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> filterCoefficient;
    @XmlElementRef(name = "P0NominalPucchIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> p0NominalPucchIsDefault;
    @XmlElementRef(name = "P0NominalPucch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> p0NominalPucch;
    @XmlElementRef(name = "DeltaFPucchFormat1IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaFPucchFormat1IsDefault;
    @XmlElementRef(name = "DeltaFPucchFormat1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaFPucchFormat1;
    @XmlElementRef(name = "DeltaFPucchFormat1bIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaFPucchFormat1BIsDefault;
    @XmlElementRef(name = "DeltaFPucchFormat1b", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaFPucchFormat1B;
    @XmlElementRef(name = "DeltaFPucchFormat2IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaFPucchFormat2IsDefault;
    @XmlElementRef(name = "DeltaFPucchFormat2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaFPucchFormat2;
    @XmlElementRef(name = "DeltaFPucchFormat2aIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaFPucchFormat2AIsDefault;
    @XmlElementRef(name = "DeltaFPucchFormat2a", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaFPucchFormat2A;
    @XmlElementRef(name = "DeltaFPucchFormat2bIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaFPucchFormat2BIsDefault;
    @XmlElementRef(name = "DeltaFPucchFormat2b", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaFPucchFormat2B;

    /**
     * Gets the value of the p0NominalPuschIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getP0NominalPuschIsDefault() {
        return p0NominalPuschIsDefault;
    }

    /**
     * Sets the value of the p0NominalPuschIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setP0NominalPuschIsDefault(JAXBElement<Boolean> value) {
        this.p0NominalPuschIsDefault = value;
    }

    /**
     * Gets the value of the p0NominalPusch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getP0NominalPusch() {
        return p0NominalPusch;
    }

    /**
     * Sets the value of the p0NominalPusch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setP0NominalPusch(JAXBElement<Integer> value) {
        this.p0NominalPusch = value;
    }

    /**
     * Gets the value of the alphaIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaIsDefault() {
        return alphaIsDefault;
    }

    /**
     * Sets the value of the alphaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaIsDefault(JAXBElement<Boolean> value) {
        this.alphaIsDefault = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlpha(JAXBElement<String> value) {
        this.alpha = value;
    }

    /**
     * Gets the value of the deltaPreambleMsg3IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaPreambleMsg3IsDefault() {
        return deltaPreambleMsg3IsDefault;
    }

    /**
     * Sets the value of the deltaPreambleMsg3IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaPreambleMsg3IsDefault(JAXBElement<Boolean> value) {
        this.deltaPreambleMsg3IsDefault = value;
    }

    /**
     * Gets the value of the deltaPreambleMsg3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeltaPreambleMsg3() {
        return deltaPreambleMsg3;
    }

    /**
     * Sets the value of the deltaPreambleMsg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeltaPreambleMsg3(JAXBElement<Integer> value) {
        this.deltaPreambleMsg3 = value;
    }

    /**
     * Gets the value of the filterCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFilterCoefficientIsDefault() {
        return filterCoefficientIsDefault;
    }

    /**
     * Sets the value of the filterCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFilterCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.filterCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the filterCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFilterCoefficient() {
        return filterCoefficient;
    }

    /**
     * Sets the value of the filterCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFilterCoefficient(JAXBElement<Integer> value) {
        this.filterCoefficient = value;
    }

    /**
     * Gets the value of the p0NominalPucchIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getP0NominalPucchIsDefault() {
        return p0NominalPucchIsDefault;
    }

    /**
     * Sets the value of the p0NominalPucchIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setP0NominalPucchIsDefault(JAXBElement<Boolean> value) {
        this.p0NominalPucchIsDefault = value;
    }

    /**
     * Gets the value of the p0NominalPucch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getP0NominalPucch() {
        return p0NominalPucch;
    }

    /**
     * Sets the value of the p0NominalPucch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setP0NominalPucch(JAXBElement<Integer> value) {
        this.p0NominalPucch = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaFPucchFormat1IsDefault() {
        return deltaFPucchFormat1IsDefault;
    }

    /**
     * Sets the value of the deltaFPucchFormat1IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaFPucchFormat1IsDefault(JAXBElement<Boolean> value) {
        this.deltaFPucchFormat1IsDefault = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaFPucchFormat1() {
        return deltaFPucchFormat1;
    }

    /**
     * Sets the value of the deltaFPucchFormat1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaFPucchFormat1(JAXBElement<String> value) {
        this.deltaFPucchFormat1 = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1BIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaFPucchFormat1BIsDefault() {
        return deltaFPucchFormat1BIsDefault;
    }

    /**
     * Sets the value of the deltaFPucchFormat1BIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaFPucchFormat1BIsDefault(JAXBElement<Boolean> value) {
        this.deltaFPucchFormat1BIsDefault = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat1B property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaFPucchFormat1B() {
        return deltaFPucchFormat1B;
    }

    /**
     * Sets the value of the deltaFPucchFormat1B property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaFPucchFormat1B(JAXBElement<String> value) {
        this.deltaFPucchFormat1B = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaFPucchFormat2IsDefault() {
        return deltaFPucchFormat2IsDefault;
    }

    /**
     * Sets the value of the deltaFPucchFormat2IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2IsDefault(JAXBElement<Boolean> value) {
        this.deltaFPucchFormat2IsDefault = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaFPucchFormat2() {
        return deltaFPucchFormat2;
    }

    /**
     * Sets the value of the deltaFPucchFormat2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2(JAXBElement<String> value) {
        this.deltaFPucchFormat2 = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2AIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaFPucchFormat2AIsDefault() {
        return deltaFPucchFormat2AIsDefault;
    }

    /**
     * Sets the value of the deltaFPucchFormat2AIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2AIsDefault(JAXBElement<Boolean> value) {
        this.deltaFPucchFormat2AIsDefault = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2A property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaFPucchFormat2A() {
        return deltaFPucchFormat2A;
    }

    /**
     * Sets the value of the deltaFPucchFormat2A property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2A(JAXBElement<String> value) {
        this.deltaFPucchFormat2A = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2BIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeltaFPucchFormat2BIsDefault() {
        return deltaFPucchFormat2BIsDefault;
    }

    /**
     * Sets the value of the deltaFPucchFormat2BIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2BIsDefault(JAXBElement<Boolean> value) {
        this.deltaFPucchFormat2BIsDefault = value;
    }

    /**
     * Gets the value of the deltaFPucchFormat2B property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaFPucchFormat2B() {
        return deltaFPucchFormat2B;
    }

    /**
     * Sets the value of the deltaFPucchFormat2B property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaFPucchFormat2B(JAXBElement<String> value) {
        this.deltaFPucchFormat2B = value;
    }

}
