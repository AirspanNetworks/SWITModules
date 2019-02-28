
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedGeneralWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedGeneralWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SMeasureIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SMeasure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FiltercoefficientRsrpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FiltercoefficientRsrp" type="{http://Airspan.Netspan.WebServices}FilterCoefficient" minOccurs="0"/&gt;
 *         &lt;element name="FiltercoefficientRsrqIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FiltercoefficientRsrq" type="{http://Airspan.Netspan.WebServices}FilterCoefficient" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedGeneralWs", propOrder = {
    "sMeasureIsDefault",
    "sMeasure",
    "filtercoefficientRsrpIsDefault",
    "filtercoefficientRsrp",
    "filtercoefficientRsrqIsDefault",
    "filtercoefficientRsrq"
})
public class MobilityConnectedGeneralWs {

    @XmlElementRef(name = "SMeasureIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sMeasureIsDefault;
    @XmlElementRef(name = "SMeasure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sMeasure;
    @XmlElementRef(name = "FiltercoefficientRsrpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filtercoefficientRsrpIsDefault;
    @XmlElementRef(name = "FiltercoefficientRsrp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filtercoefficientRsrp;
    @XmlElementRef(name = "FiltercoefficientRsrqIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filtercoefficientRsrqIsDefault;
    @XmlElementRef(name = "FiltercoefficientRsrq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filtercoefficientRsrq;

    /**
     * Gets the value of the sMeasureIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSMeasureIsDefault() {
        return sMeasureIsDefault;
    }

    /**
     * Sets the value of the sMeasureIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSMeasureIsDefault(JAXBElement<Boolean> value) {
        this.sMeasureIsDefault = value;
    }

    /**
     * Gets the value of the sMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSMeasure() {
        return sMeasure;
    }

    /**
     * Sets the value of the sMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSMeasure(JAXBElement<Integer> value) {
        this.sMeasure = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFiltercoefficientRsrpIsDefault() {
        return filtercoefficientRsrpIsDefault;
    }

    /**
     * Sets the value of the filtercoefficientRsrpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFiltercoefficientRsrpIsDefault(JAXBElement<Boolean> value) {
        this.filtercoefficientRsrpIsDefault = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiltercoefficientRsrp() {
        return filtercoefficientRsrp;
    }

    /**
     * Sets the value of the filtercoefficientRsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiltercoefficientRsrp(JAXBElement<String> value) {
        this.filtercoefficientRsrp = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrqIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFiltercoefficientRsrqIsDefault() {
        return filtercoefficientRsrqIsDefault;
    }

    /**
     * Sets the value of the filtercoefficientRsrqIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFiltercoefficientRsrqIsDefault(JAXBElement<Boolean> value) {
        this.filtercoefficientRsrqIsDefault = value;
    }

    /**
     * Gets the value of the filtercoefficientRsrq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiltercoefficientRsrq() {
        return filtercoefficientRsrq;
    }

    /**
     * Sets the value of the filtercoefficientRsrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiltercoefficientRsrq(JAXBElement<String> value) {
        this.filtercoefficientRsrq = value;
    }

}
