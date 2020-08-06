
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleModeIntraFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleModeIntraFreq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QHyst" type="{http://Airspan.Netspan.WebServices}QHystValues" minOccurs="0"/&gt;
 *         &lt;element name="SNonIntraSearchEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SNonIntraSearchR8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SNonIntraSearchPr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SNonIntraSearchQr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshServingLowR8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsThreshServingLowQr9NotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ThreshServingLowQr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues" minOccurs="0"/&gt;
 *         &lt;element name="QRxLevMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsPMaxNotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SIntraSearchEnable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SIntraSearchR8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SIntraSearchPr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SIntraSearchQr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TReselectionEutra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsQQualMinr9NotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QQualMinr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleModeIntraFreq", propOrder = {
    "qHyst",
    "sNonIntraSearchEnable",
    "sNonIntraSearchR8",
    "sNonIntraSearchPr9",
    "sNonIntraSearchQr9",
    "threshServingLowR8",
    "isThreshServingLowQr9NotPresent",
    "threshServingLowQr9",
    "cellReselectionPriority",
    "qRxLevMin",
    "isPMaxNotPresent",
    "pMax",
    "sIntraSearchEnable",
    "sIntraSearchR8",
    "sIntraSearchPr9",
    "sIntraSearchQr9",
    "tReselectionEutra",
    "isQQualMinr9NotPresent",
    "qQualMinr9"
})
public class MobilityIdleModeIntraFreq {

    @XmlElementRef(name = "QHyst", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qHyst;
    @XmlElementRef(name = "SNonIntraSearchEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sNonIntraSearchEnable;
    @XmlElementRef(name = "SNonIntraSearchR8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sNonIntraSearchR8;
    @XmlElementRef(name = "SNonIntraSearchPr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sNonIntraSearchPr9;
    @XmlElementRef(name = "SNonIntraSearchQr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sNonIntraSearchQr9;
    @XmlElementRef(name = "ThreshServingLowR8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshServingLowR8;
    @XmlElementRef(name = "IsThreshServingLowQr9NotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isThreshServingLowQr9NotPresent;
    @XmlElementRef(name = "ThreshServingLowQr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshServingLowQr9;
    @XmlElementRef(name = "CellReselectionPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellReselectionPriority;
    @XmlElementRef(name = "QRxLevMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qRxLevMin;
    @XmlElementRef(name = "IsPMaxNotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPMaxNotPresent;
    @XmlElementRef(name = "PMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pMax;
    @XmlElementRef(name = "SIntraSearchEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sIntraSearchEnable;
    @XmlElementRef(name = "SIntraSearchR8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sIntraSearchR8;
    @XmlElementRef(name = "SIntraSearchPr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sIntraSearchPr9;
    @XmlElementRef(name = "SIntraSearchQr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sIntraSearchQr9;
    @XmlElementRef(name = "TReselectionEutra", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tReselectionEutra;
    @XmlElementRef(name = "IsQQualMinr9NotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isQQualMinr9NotPresent;
    @XmlElementRef(name = "QQualMinr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qQualMinr9;

    /**
     * Gets the value of the qHyst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQHyst() {
        return qHyst;
    }

    /**
     * Sets the value of the qHyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQHyst(JAXBElement<String> value) {
        this.qHyst = value;
    }

    /**
     * Gets the value of the sNonIntraSearchEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSNonIntraSearchEnable() {
        return sNonIntraSearchEnable;
    }

    /**
     * Sets the value of the sNonIntraSearchEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSNonIntraSearchEnable(JAXBElement<Boolean> value) {
        this.sNonIntraSearchEnable = value;
    }

    /**
     * Gets the value of the sNonIntraSearchR8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSNonIntraSearchR8() {
        return sNonIntraSearchR8;
    }

    /**
     * Sets the value of the sNonIntraSearchR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSNonIntraSearchR8(JAXBElement<Integer> value) {
        this.sNonIntraSearchR8 = value;
    }

    /**
     * Gets the value of the sNonIntraSearchPr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSNonIntraSearchPr9() {
        return sNonIntraSearchPr9;
    }

    /**
     * Sets the value of the sNonIntraSearchPr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSNonIntraSearchPr9(JAXBElement<Integer> value) {
        this.sNonIntraSearchPr9 = value;
    }

    /**
     * Gets the value of the sNonIntraSearchQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSNonIntraSearchQr9() {
        return sNonIntraSearchQr9;
    }

    /**
     * Sets the value of the sNonIntraSearchQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSNonIntraSearchQr9(JAXBElement<Integer> value) {
        this.sNonIntraSearchQr9 = value;
    }

    /**
     * Gets the value of the threshServingLowR8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshServingLowR8() {
        return threshServingLowR8;
    }

    /**
     * Sets the value of the threshServingLowR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshServingLowR8(JAXBElement<Integer> value) {
        this.threshServingLowR8 = value;
    }

    /**
     * Gets the value of the isThreshServingLowQr9NotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsThreshServingLowQr9NotPresent() {
        return isThreshServingLowQr9NotPresent;
    }

    /**
     * Sets the value of the isThreshServingLowQr9NotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsThreshServingLowQr9NotPresent(JAXBElement<Boolean> value) {
        this.isThreshServingLowQr9NotPresent = value;
    }

    /**
     * Gets the value of the threshServingLowQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshServingLowQr9() {
        return threshServingLowQr9;
    }

    /**
     * Sets the value of the threshServingLowQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshServingLowQr9(JAXBElement<Integer> value) {
        this.threshServingLowQr9 = value;
    }

    /**
     * Gets the value of the cellReselectionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellReselectionPriority() {
        return cellReselectionPriority;
    }

    /**
     * Sets the value of the cellReselectionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellReselectionPriority(JAXBElement<String> value) {
        this.cellReselectionPriority = value;
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
     * Gets the value of the isPMaxNotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPMaxNotPresent() {
        return isPMaxNotPresent;
    }

    /**
     * Sets the value of the isPMaxNotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPMaxNotPresent(JAXBElement<Boolean> value) {
        this.isPMaxNotPresent = value;
    }

    /**
     * Gets the value of the pMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPMax() {
        return pMax;
    }

    /**
     * Sets the value of the pMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPMax(JAXBElement<Integer> value) {
        this.pMax = value;
    }

    /**
     * Gets the value of the sIntraSearchEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSIntraSearchEnable() {
        return sIntraSearchEnable;
    }

    /**
     * Sets the value of the sIntraSearchEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSIntraSearchEnable(JAXBElement<Boolean> value) {
        this.sIntraSearchEnable = value;
    }

    /**
     * Gets the value of the sIntraSearchR8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSIntraSearchR8() {
        return sIntraSearchR8;
    }

    /**
     * Sets the value of the sIntraSearchR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSIntraSearchR8(JAXBElement<Integer> value) {
        this.sIntraSearchR8 = value;
    }

    /**
     * Gets the value of the sIntraSearchPr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSIntraSearchPr9() {
        return sIntraSearchPr9;
    }

    /**
     * Sets the value of the sIntraSearchPr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSIntraSearchPr9(JAXBElement<Integer> value) {
        this.sIntraSearchPr9 = value;
    }

    /**
     * Gets the value of the sIntraSearchQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSIntraSearchQr9() {
        return sIntraSearchQr9;
    }

    /**
     * Sets the value of the sIntraSearchQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSIntraSearchQr9(JAXBElement<Integer> value) {
        this.sIntraSearchQr9 = value;
    }

    /**
     * Gets the value of the tReselectionEutra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTReselectionEutra() {
        return tReselectionEutra;
    }

    /**
     * Sets the value of the tReselectionEutra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTReselectionEutra(JAXBElement<Integer> value) {
        this.tReselectionEutra = value;
    }

    /**
     * Gets the value of the isQQualMinr9NotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsQQualMinr9NotPresent() {
        return isQQualMinr9NotPresent;
    }

    /**
     * Sets the value of the isQQualMinr9NotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsQQualMinr9NotPresent(JAXBElement<Boolean> value) {
        this.isQQualMinr9NotPresent = value;
    }

    /**
     * Gets the value of the qQualMinr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQQualMinr9() {
        return qQualMinr9;
    }

    /**
     * Sets the value of the qQualMinr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQQualMinr9(JAXBElement<Integer> value) {
        this.qQualMinr9 = value;
    }

}
