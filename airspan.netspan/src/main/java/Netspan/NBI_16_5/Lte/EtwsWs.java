
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EtwsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtwsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sib10Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sib10DurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EtwsMode" type="{http://Airspan.Netspan.WebServices}EtwsModes" minOccurs="0"/&gt;
 *         &lt;element name="EtwsModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sib11Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sib11DurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtwsWs", propOrder = {
    "sib10Duration",
    "sib10DurationIsDefault",
    "etwsMode",
    "etwsModeIsDefault",
    "sib11Duration",
    "sib11DurationIsDefault"
})
public class EtwsWs {

    @XmlElementRef(name = "Sib10Duration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sib10Duration;
    @XmlElementRef(name = "Sib10DurationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sib10DurationIsDefault;
    @XmlElementRef(name = "EtwsMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EtwsModes> etwsMode;
    @XmlElementRef(name = "EtwsModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> etwsModeIsDefault;
    @XmlElementRef(name = "Sib11Duration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sib11Duration;
    @XmlElementRef(name = "Sib11DurationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sib11DurationIsDefault;

    /**
     * Gets the value of the sib10Duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSib10Duration() {
        return sib10Duration;
    }

    /**
     * Sets the value of the sib10Duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSib10Duration(JAXBElement<Integer> value) {
        this.sib10Duration = value;
    }

    /**
     * Gets the value of the sib10DurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSib10DurationIsDefault() {
        return sib10DurationIsDefault;
    }

    /**
     * Sets the value of the sib10DurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSib10DurationIsDefault(JAXBElement<Boolean> value) {
        this.sib10DurationIsDefault = value;
    }

    /**
     * Gets the value of the etwsMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EtwsModes }{@code >}
     *     
     */
    public JAXBElement<EtwsModes> getEtwsMode() {
        return etwsMode;
    }

    /**
     * Sets the value of the etwsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EtwsModes }{@code >}
     *     
     */
    public void setEtwsMode(JAXBElement<EtwsModes> value) {
        this.etwsMode = value;
    }

    /**
     * Gets the value of the etwsModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEtwsModeIsDefault() {
        return etwsModeIsDefault;
    }

    /**
     * Sets the value of the etwsModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEtwsModeIsDefault(JAXBElement<Boolean> value) {
        this.etwsModeIsDefault = value;
    }

    /**
     * Gets the value of the sib11Duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSib11Duration() {
        return sib11Duration;
    }

    /**
     * Sets the value of the sib11Duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSib11Duration(JAXBElement<Integer> value) {
        this.sib11Duration = value;
    }

    /**
     * Gets the value of the sib11DurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSib11DurationIsDefault() {
        return sib11DurationIsDefault;
    }

    /**
     * Sets the value of the sib11DurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSib11DurationIsDefault(JAXBElement<Boolean> value) {
        this.sib11DurationIsDefault = value;
    }

}
