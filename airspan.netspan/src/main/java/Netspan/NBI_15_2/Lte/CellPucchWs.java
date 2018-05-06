
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellPucchWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellPucchWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "CellPucchWs", propOrder = {
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
public class CellPucchWs {

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
