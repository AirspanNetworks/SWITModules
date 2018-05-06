
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleModeIntraFreq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleModeIntraFreq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QHyst" type="{http://Airspan.Netspan.WebServices}QHystValues"/>
 *         &lt;element name="SNonIntraSearchEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SNonIntraSearchR8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNonIntraSearchPr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNonIntraSearchQr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ThreshServingLowR8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsThreshServingLowQr9NotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ThreshServingLowQr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CellReselectionPriority" type="{http://Airspan.Netspan.WebServices}CellReselectionPriorityValues"/>
 *         &lt;element name="QRxLevMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsPMaxNotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SIntraSearchEnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SIntraSearchR8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SIntraSearchPr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SIntraSearchQr9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TReselectionEutra" type="{http://www.w3.org/2001/XMLSchema}int"/>
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

    @XmlElement(name = "QHyst", required = true, nillable = true)
    protected String qHyst;
    @XmlElement(name = "SNonIntraSearchEnable", required = true, type = Boolean.class, nillable = true)
    protected Boolean sNonIntraSearchEnable;
    @XmlElement(name = "SNonIntraSearchR8", required = true, type = Integer.class, nillable = true)
    protected Integer sNonIntraSearchR8;
    @XmlElement(name = "SNonIntraSearchPr9", required = true, type = Integer.class, nillable = true)
    protected Integer sNonIntraSearchPr9;
    @XmlElement(name = "SNonIntraSearchQr9", required = true, type = Integer.class, nillable = true)
    protected Integer sNonIntraSearchQr9;
    @XmlElement(name = "ThreshServingLowR8", required = true, type = Integer.class, nillable = true)
    protected Integer threshServingLowR8;
    @XmlElement(name = "IsThreshServingLowQr9NotPresent", required = true, type = Boolean.class, nillable = true)
    protected Boolean isThreshServingLowQr9NotPresent;
    @XmlElement(name = "ThreshServingLowQr9", required = true, type = Integer.class, nillable = true)
    protected Integer threshServingLowQr9;
    @XmlElement(name = "CellReselectionPriority", required = true, nillable = true)
    protected String cellReselectionPriority;
    @XmlElement(name = "QRxLevMin", required = true, type = Integer.class, nillable = true)
    protected Integer qRxLevMin;
    @XmlElement(name = "IsPMaxNotPresent", required = true, type = Boolean.class, nillable = true)
    protected Boolean isPMaxNotPresent;
    @XmlElement(name = "PMax", required = true, type = Integer.class, nillable = true)
    protected Integer pMax;
    @XmlElement(name = "SIntraSearchEnable", required = true, type = Boolean.class, nillable = true)
    protected Boolean sIntraSearchEnable;
    @XmlElement(name = "SIntraSearchR8", required = true, type = Integer.class, nillable = true)
    protected Integer sIntraSearchR8;
    @XmlElement(name = "SIntraSearchPr9", required = true, type = Integer.class, nillable = true)
    protected Integer sIntraSearchPr9;
    @XmlElement(name = "SIntraSearchQr9", required = true, type = Integer.class, nillable = true)
    protected Integer sIntraSearchQr9;
    @XmlElement(name = "TReselectionEutra", required = true, type = Integer.class, nillable = true)
    protected Integer tReselectionEutra;
    @XmlElement(name = "IsQQualMinr9NotPresent", required = true, type = Boolean.class, nillable = true)
    protected Boolean isQQualMinr9NotPresent;
    @XmlElement(name = "QQualMinr9", required = true, type = Integer.class, nillable = true)
    protected Integer qQualMinr9;

    /**
     * Gets the value of the qHyst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQHyst() {
        return qHyst;
    }

    /**
     * Sets the value of the qHyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQHyst(String value) {
        this.qHyst = value;
    }

    /**
     * Gets the value of the sNonIntraSearchEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSNonIntraSearchEnable() {
        return sNonIntraSearchEnable;
    }

    /**
     * Sets the value of the sNonIntraSearchEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSNonIntraSearchEnable(Boolean value) {
        this.sNonIntraSearchEnable = value;
    }

    /**
     * Gets the value of the sNonIntraSearchR8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSNonIntraSearchR8() {
        return sNonIntraSearchR8;
    }

    /**
     * Sets the value of the sNonIntraSearchR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSNonIntraSearchR8(Integer value) {
        this.sNonIntraSearchR8 = value;
    }

    /**
     * Gets the value of the sNonIntraSearchPr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSNonIntraSearchPr9() {
        return sNonIntraSearchPr9;
    }

    /**
     * Sets the value of the sNonIntraSearchPr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSNonIntraSearchPr9(Integer value) {
        this.sNonIntraSearchPr9 = value;
    }

    /**
     * Gets the value of the sNonIntraSearchQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSNonIntraSearchQr9() {
        return sNonIntraSearchQr9;
    }

    /**
     * Sets the value of the sNonIntraSearchQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSNonIntraSearchQr9(Integer value) {
        this.sNonIntraSearchQr9 = value;
    }

    /**
     * Gets the value of the threshServingLowR8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshServingLowR8() {
        return threshServingLowR8;
    }

    /**
     * Sets the value of the threshServingLowR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshServingLowR8(Integer value) {
        this.threshServingLowR8 = value;
    }

    /**
     * Gets the value of the isThreshServingLowQr9NotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsThreshServingLowQr9NotPresent() {
        return isThreshServingLowQr9NotPresent;
    }

    /**
     * Sets the value of the isThreshServingLowQr9NotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThreshServingLowQr9NotPresent(Boolean value) {
        this.isThreshServingLowQr9NotPresent = value;
    }

    /**
     * Gets the value of the threshServingLowQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshServingLowQr9() {
        return threshServingLowQr9;
    }

    /**
     * Sets the value of the threshServingLowQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshServingLowQr9(Integer value) {
        this.threshServingLowQr9 = value;
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
     * Gets the value of the qRxLevMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQRxLevMin() {
        return qRxLevMin;
    }

    /**
     * Sets the value of the qRxLevMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQRxLevMin(Integer value) {
        this.qRxLevMin = value;
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
     * Gets the value of the sIntraSearchEnable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSIntraSearchEnable() {
        return sIntraSearchEnable;
    }

    /**
     * Sets the value of the sIntraSearchEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSIntraSearchEnable(Boolean value) {
        this.sIntraSearchEnable = value;
    }

    /**
     * Gets the value of the sIntraSearchR8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIntraSearchR8() {
        return sIntraSearchR8;
    }

    /**
     * Sets the value of the sIntraSearchR8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIntraSearchR8(Integer value) {
        this.sIntraSearchR8 = value;
    }

    /**
     * Gets the value of the sIntraSearchPr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIntraSearchPr9() {
        return sIntraSearchPr9;
    }

    /**
     * Sets the value of the sIntraSearchPr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIntraSearchPr9(Integer value) {
        this.sIntraSearchPr9 = value;
    }

    /**
     * Gets the value of the sIntraSearchQr9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIntraSearchQr9() {
        return sIntraSearchQr9;
    }

    /**
     * Sets the value of the sIntraSearchQr9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIntraSearchQr9(Integer value) {
        this.sIntraSearchQr9 = value;
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
