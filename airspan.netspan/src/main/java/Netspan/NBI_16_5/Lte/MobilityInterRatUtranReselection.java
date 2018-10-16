
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityInterRatUtranReselection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityInterRatUtranReselection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TReselectionUtra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXLow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QRxLevMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PMaxUtra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QQualMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXQr9High" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXQr9Low" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityInterRatUtranReselection", propOrder = {
    "tReselectionUtra",
    "threshXHigh",
    "threshXLow",
    "qRxLevMin",
    "pMaxUtra",
    "qQualMin",
    "threshXQr9High",
    "threshXQr9Low"
})
public class MobilityInterRatUtranReselection {

    @XmlElementRef(name = "TReselectionUtra", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tReselectionUtra;
    @XmlElementRef(name = "ThreshXHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXHigh;
    @XmlElementRef(name = "ThreshXLow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXLow;
    @XmlElementRef(name = "QRxLevMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qRxLevMin;
    @XmlElementRef(name = "PMaxUtra", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pMaxUtra;
    @XmlElementRef(name = "QQualMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qQualMin;
    @XmlElementRef(name = "ThreshXQr9High", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXQr9High;
    @XmlElementRef(name = "ThreshXQr9Low", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXQr9Low;

    /**
     * Gets the value of the tReselectionUtra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTReselectionUtra() {
        return tReselectionUtra;
    }

    /**
     * Sets the value of the tReselectionUtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTReselectionUtra(JAXBElement<Integer> value) {
        this.tReselectionUtra = value;
    }

    /**
     * Gets the value of the threshXHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXHigh() {
        return threshXHigh;
    }

    /**
     * Sets the value of the threshXHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXHigh(JAXBElement<Integer> value) {
        this.threshXHigh = value;
    }

    /**
     * Gets the value of the threshXLow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXLow() {
        return threshXLow;
    }

    /**
     * Sets the value of the threshXLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXLow(JAXBElement<Integer> value) {
        this.threshXLow = value;
    }

    /**
     * Gets the value of the qRxLevMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQRxLevMin() {
        return qRxLevMin;
    }

    /**
     * Sets the value of the qRxLevMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQRxLevMin(JAXBElement<Integer> value) {
        this.qRxLevMin = value;
    }

    /**
     * Gets the value of the pMaxUtra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPMaxUtra() {
        return pMaxUtra;
    }

    /**
     * Sets the value of the pMaxUtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPMaxUtra(JAXBElement<Integer> value) {
        this.pMaxUtra = value;
    }

    /**
     * Gets the value of the qQualMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQQualMin() {
        return qQualMin;
    }

    /**
     * Sets the value of the qQualMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQQualMin(JAXBElement<Integer> value) {
        this.qQualMin = value;
    }

    /**
     * Gets the value of the threshXQr9High property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXQr9High() {
        return threshXQr9High;
    }

    /**
     * Sets the value of the threshXQr9High property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXQr9High(JAXBElement<Integer> value) {
        this.threshXQr9High = value;
    }

    /**
     * Gets the value of the threshXQr9Low property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXQr9Low() {
        return threshXQr9Low;
    }

    /**
     * Sets the value of the threshXQr9Low property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXQr9Low(JAXBElement<Integer> value) {
        this.threshXQr9Low = value;
    }

}
