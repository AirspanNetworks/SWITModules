
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellPuschWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellPuschWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="P0NominalPuschIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="P0NominalPusch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeltaPreambleMsg3IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeltaPreambleMsg3" type="{http://Airspan.Netspan.WebServices}DeltaPreamble" minOccurs="0"/&gt;
 *         &lt;element name="AlphaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Alpha" type="{http://Airspan.Netspan.WebServices}UplinkAlpha" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellPuschWs", propOrder = {
    "p0NominalPuschIsDefault",
    "p0NominalPusch",
    "deltaPreambleMsg3IsDefault",
    "deltaPreambleMsg3",
    "alphaIsDefault",
    "alpha"
})
public class CellPuschWs {

    @XmlElementRef(name = "P0NominalPuschIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> p0NominalPuschIsDefault;
    @XmlElementRef(name = "P0NominalPusch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> p0NominalPusch;
    @XmlElementRef(name = "DeltaPreambleMsg3IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deltaPreambleMsg3IsDefault;
    @XmlElementRef(name = "DeltaPreambleMsg3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deltaPreambleMsg3;
    @XmlElementRef(name = "AlphaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaIsDefault;
    @XmlElementRef(name = "Alpha", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alpha;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeltaPreambleMsg3() {
        return deltaPreambleMsg3;
    }

    /**
     * Sets the value of the deltaPreambleMsg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeltaPreambleMsg3(JAXBElement<String> value) {
        this.deltaPreambleMsg3 = value;
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

}
