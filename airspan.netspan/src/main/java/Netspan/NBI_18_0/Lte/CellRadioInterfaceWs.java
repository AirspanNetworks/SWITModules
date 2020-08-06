
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellRadioInterfaceWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellRadioInterfaceWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PcchnBIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PcchnB" type="{http://Airspan.Netspan.WebServices}PcchnBType" minOccurs="0"/&gt;
 *         &lt;element name="PdschPaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdschPa" type="{http://Airspan.Netspan.WebServices}PdschPaType" minOccurs="0"/&gt;
 *         &lt;element name="PdschPbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdschPb" type="{http://Airspan.Netspan.WebServices}PdschPbType" minOccurs="0"/&gt;
 *         &lt;element name="FilterCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FilterCoefficient" type="{http://Airspan.Netspan.WebServices}FilterCoefficientType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellRadioInterfaceWs", propOrder = {
    "pcchnBIsDefault",
    "pcchnB",
    "pdschPaIsDefault",
    "pdschPa",
    "pdschPbIsDefault",
    "pdschPb",
    "filterCoefficientIsDefault",
    "filterCoefficient"
})
public class CellRadioInterfaceWs {

    @XmlElementRef(name = "PcchnBIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pcchnBIsDefault;
    @XmlElementRef(name = "PcchnB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pcchnB;
    @XmlElementRef(name = "PdschPaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdschPaIsDefault;
    @XmlElementRef(name = "PdschPa", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdschPa;
    @XmlElementRef(name = "PdschPbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdschPbIsDefault;
    @XmlElementRef(name = "PdschPb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pdschPb;
    @XmlElementRef(name = "FilterCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filterCoefficientIsDefault;
    @XmlElementRef(name = "FilterCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterCoefficient;

    /**
     * Gets the value of the pcchnBIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPcchnBIsDefault() {
        return pcchnBIsDefault;
    }

    /**
     * Sets the value of the pcchnBIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPcchnBIsDefault(JAXBElement<Boolean> value) {
        this.pcchnBIsDefault = value;
    }

    /**
     * Gets the value of the pcchnB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPcchnB() {
        return pcchnB;
    }

    /**
     * Sets the value of the pcchnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPcchnB(JAXBElement<String> value) {
        this.pcchnB = value;
    }

    /**
     * Gets the value of the pdschPaIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdschPaIsDefault() {
        return pdschPaIsDefault;
    }

    /**
     * Sets the value of the pdschPaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdschPaIsDefault(JAXBElement<Boolean> value) {
        this.pdschPaIsDefault = value;
    }

    /**
     * Gets the value of the pdschPa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdschPa() {
        return pdschPa;
    }

    /**
     * Sets the value of the pdschPa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdschPa(JAXBElement<String> value) {
        this.pdschPa = value;
    }

    /**
     * Gets the value of the pdschPbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdschPbIsDefault() {
        return pdschPbIsDefault;
    }

    /**
     * Sets the value of the pdschPbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdschPbIsDefault(JAXBElement<Boolean> value) {
        this.pdschPbIsDefault = value;
    }

    /**
     * Gets the value of the pdschPb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPdschPb() {
        return pdschPb;
    }

    /**
     * Sets the value of the pdschPb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPdschPb(JAXBElement<String> value) {
        this.pdschPb = value;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterCoefficient() {
        return filterCoefficient;
    }

    /**
     * Sets the value of the filterCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterCoefficient(JAXBElement<String> value) {
        this.filterCoefficient = value;
    }

}
