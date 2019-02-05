
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleModeInterEarfcn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleModeInterEarfcn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DlEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QRxLevelMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsPMaxNotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TReselectionEutra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXHighP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXHighQr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXLowP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ThreshXLowQr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues" minOccurs="0"/&gt;
 *         &lt;element name="IsQQualMinr9NotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QQualMinr9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QOffsetFreq" type="{http://Airspan.Netspan.WebServices}OffsetFreq" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleModeInterEarfcn", propOrder = {
    "dlEarfcn",
    "qRxLevelMin",
    "isPMaxNotPresent",
    "pMax",
    "tReselectionEutra",
    "threshXHighP",
    "threshXHighQr9",
    "threshXLowP",
    "threshXLowQr9",
    "cellReselectionPriority",
    "isQQualMinr9NotPresent",
    "qQualMinr9",
    "qOffsetFreq"
})
public class MobilityIdleModeInterEarfcn {

    @XmlElementRef(name = "DlEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlEarfcn;
    @XmlElementRef(name = "QRxLevelMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qRxLevelMin;
    @XmlElementRef(name = "IsPMaxNotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPMaxNotPresent;
    @XmlElementRef(name = "PMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pMax;
    @XmlElementRef(name = "TReselectionEutra", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tReselectionEutra;
    @XmlElementRef(name = "ThreshXHighP", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXHighP;
    @XmlElementRef(name = "ThreshXHighQr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXHighQr9;
    @XmlElementRef(name = "ThreshXLowP", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXLowP;
    @XmlElementRef(name = "ThreshXLowQr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXLowQr9;
    @XmlElementRef(name = "CellReselectionPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellReselectionPriority;
    @XmlElementRef(name = "IsQQualMinr9NotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isQQualMinr9NotPresent;
    @XmlElementRef(name = "QQualMinr9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qQualMinr9;
    @XmlElementRef(name = "QOffsetFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qOffsetFreq;

    /**
     * Gets the value of the dlEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlEarfcn() {
        return dlEarfcn;
    }

    /**
     * Sets the value of the dlEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlEarfcn(JAXBElement<Integer> value) {
        this.dlEarfcn = value;
    }

    /**
     * Gets the value of the qRxLevelMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQRxLevelMin() {
        return qRxLevelMin;
    }

    /**
     * Sets the value of the qRxLevelMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQRxLevelMin(JAXBElement<Integer> value) {
        this.qRxLevelMin = value;
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
     * Gets the value of the threshXHighP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXHighP() {
        return threshXHighP;
    }

    /**
     * Sets the value of the threshXHighP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXHighP(JAXBElement<Integer> value) {
        this.threshXHighP = value;
    }

    /**
     * Gets the value of the threshXHighQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXHighQr9() {
        return threshXHighQr9;
    }

    /**
     * Sets the value of the threshXHighQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXHighQr9(JAXBElement<Integer> value) {
        this.threshXHighQr9 = value;
    }

    /**
     * Gets the value of the threshXLowP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXLowP() {
        return threshXLowP;
    }

    /**
     * Sets the value of the threshXLowP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXLowP(JAXBElement<Integer> value) {
        this.threshXLowP = value;
    }

    /**
     * Gets the value of the threshXLowQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getThreshXLowQr9() {
        return threshXLowQr9;
    }

    /**
     * Sets the value of the threshXLowQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setThreshXLowQr9(JAXBElement<Integer> value) {
        this.threshXLowQr9 = value;
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

    /**
     * Gets the value of the qOffsetFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQOffsetFreq() {
        return qOffsetFreq;
    }

    /**
     * Sets the value of the qOffsetFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQOffsetFreq(JAXBElement<String> value) {
        this.qOffsetFreq = value;
    }

}
