
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleModeInterFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleModeInterFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QRxLevelMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPMaxNotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TReselectionEutra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThreshXHighP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThreshXHighQr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThreshXLowP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThreshXLowQr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues"/>
 *         &lt;element name="IsQQualMinr9NotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="QQualMinr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleModeInterFreq", propOrder = {
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
    "qQualMinr9"
})
public class MobilityIdleModeInterFreq {

    @XmlElement(name = "QRxLevelMin", required = true, type = Integer.class, nillable = true)
    protected Integer qRxLevelMin;
    @XmlElement(name = "IsPMaxNotPresent", required = true, type = Boolean.class, nillable = true)
    protected Boolean isPMaxNotPresent;
    @XmlElement(name = "PMax", required = true, type = Integer.class, nillable = true)
    protected Integer pMax;
    @XmlElement(name = "TReselectionEutra", required = true, type = Integer.class, nillable = true)
    protected Integer tReselectionEutra;
    @XmlElement(name = "ThreshXHighP", required = true, type = Integer.class, nillable = true)
    protected Integer threshXHighP;
    @XmlElement(name = "ThreshXHighQr9", required = true, type = Integer.class, nillable = true)
    protected Integer threshXHighQr9;
    @XmlElement(name = "ThreshXLowP", required = true, type = Integer.class, nillable = true)
    protected Integer threshXLowP;
    @XmlElement(name = "ThreshXLowQr9", required = true, type = Integer.class, nillable = true)
    protected Integer threshXLowQr9;
    @XmlElement(name = "CellReselectionPriority", required = true, nillable = true)
    protected String cellReselectionPriority;
    @XmlElement(name = "IsQQualMinr9NotPresent", required = true, type = Boolean.class, nillable = true)
    protected Boolean isQQualMinr9NotPresent;
    @XmlElement(name = "QQualMinr9", required = true, type = Integer.class, nillable = true)
    protected Integer qQualMinr9;

    /**
     * Gets the value of the qRxLevelMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQRxLevelMin() {
        return qRxLevelMin;
    }

    /**
     * Sets the value of the qRxLevelMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQRxLevelMin(Integer value) {
        this.qRxLevelMin = value;
    }

    /**
     * Gets the value of the isPMaxNotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPMaxNotPresent() {
        return isPMaxNotPresent;
    }

    /**
     * Sets the value of the isPMaxNotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPMaxNotPresent(Boolean value) {
        this.isPMaxNotPresent = value;
    }

    /**
     * Gets the value of the pMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPMax() {
        return pMax;
    }

    /**
     * Sets the value of the pMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPMax(Integer value) {
        this.pMax = value;
    }

    /**
     * Gets the value of the tReselectionEutra property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTReselectionEutra() {
        return tReselectionEutra;
    }

    /**
     * Sets the value of the tReselectionEutra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTReselectionEutra(Integer value) {
        this.tReselectionEutra = value;
    }

    /**
     * Gets the value of the threshXHighP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshXHighP() {
        return threshXHighP;
    }

    /**
     * Sets the value of the threshXHighP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshXHighP(Integer value) {
        this.threshXHighP = value;
    }

    /**
     * Gets the value of the threshXHighQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshXHighQr9() {
        return threshXHighQr9;
    }

    /**
     * Sets the value of the threshXHighQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshXHighQr9(Integer value) {
        this.threshXHighQr9 = value;
    }

    /**
     * Gets the value of the threshXLowP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshXLowP() {
        return threshXLowP;
    }

    /**
     * Sets the value of the threshXLowP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshXLowP(Integer value) {
        this.threshXLowP = value;
    }

    /**
     * Gets the value of the threshXLowQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshXLowQr9() {
        return threshXLowQr9;
    }

    /**
     * Sets the value of the threshXLowQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshXLowQr9(Integer value) {
        this.threshXLowQr9 = value;
    }

    /**
     * Gets the value of the cellReselectionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellReselectionPriority() {
        return cellReselectionPriority;
    }

    /**
     * Sets the value of the cellReselectionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellReselectionPriority(String value) {
        this.cellReselectionPriority = value;
    }

    /**
     * Gets the value of the isQQualMinr9NotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQQualMinr9NotPresent() {
        return isQQualMinr9NotPresent;
    }

    /**
     * Sets the value of the isQQualMinr9NotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQQualMinr9NotPresent(Boolean value) {
        this.isQQualMinr9NotPresent = value;
    }

    /**
     * Gets the value of the qQualMinr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQQualMinr9() {
        return qQualMinr9;
    }

    /**
     * Sets the value of the qQualMinr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQQualMinr9(Integer value) {
        this.qQualMinr9 = value;
    }

}
