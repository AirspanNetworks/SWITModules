
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteSonCSonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonCSonWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCSonEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCSonRachEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCSonMcimEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCSonMroEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCSonMlbEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CSonMlbCapacityClassValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CSonMlbPdschLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CSonMlbPuschLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CSonMlbRrcLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CSonMlbCpuLoadThresh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsDlTxOptEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DlTxOpt" type="{http://Airspan.Netspan.WebServices}DlTxOpt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonCSonWs", propOrder = {
    "isCSonEnabled",
    "isCSonRachEnabled",
    "isCSonMcimEnabled",
    "isCSonMroEnabled",
    "isCSonMlbEnabled",
    "cSonMlbCapacityClassValue",
    "cSonMlbPdschLoadThresh",
    "cSonMlbPuschLoadThresh",
    "cSonMlbRrcLoadThresh",
    "cSonMlbCpuLoadThresh",
    "isDlTxOptEnabled",
    "dlTxOpt"
})
public class LteSonCSonWs {

    @XmlElementRef(name = "IsCSonEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonEnabled;
    @XmlElementRef(name = "IsCSonRachEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonRachEnabled;
    @XmlElementRef(name = "IsCSonMcimEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonMcimEnabled;
    @XmlElementRef(name = "IsCSonMroEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonMroEnabled;
    @XmlElementRef(name = "IsCSonMlbEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonMlbEnabled;
    @XmlElementRef(name = "CSonMlbCapacityClassValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonMlbCapacityClassValue;
    @XmlElementRef(name = "CSonMlbPdschLoadThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonMlbPdschLoadThresh;
    @XmlElementRef(name = "CSonMlbPuschLoadThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonMlbPuschLoadThresh;
    @XmlElementRef(name = "CSonMlbRrcLoadThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonMlbRrcLoadThresh;
    @XmlElementRef(name = "CSonMlbCpuLoadThresh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonMlbCpuLoadThresh;
    @XmlElementRef(name = "IsDlTxOptEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDlTxOptEnabled;
    @XmlElement(name = "DlTxOpt")
    protected DlTxOpt dlTxOpt;

    /**
     * Gets the value of the isCSonEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonEnabled() {
        return isCSonEnabled;
    }

    /**
     * Sets the value of the isCSonEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonEnabled(JAXBElement<Boolean> value) {
        this.isCSonEnabled = value;
    }

    /**
     * Gets the value of the isCSonRachEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonRachEnabled() {
        return isCSonRachEnabled;
    }

    /**
     * Sets the value of the isCSonRachEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonRachEnabled(JAXBElement<Boolean> value) {
        this.isCSonRachEnabled = value;
    }

    /**
     * Gets the value of the isCSonMcimEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonMcimEnabled() {
        return isCSonMcimEnabled;
    }

    /**
     * Sets the value of the isCSonMcimEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonMcimEnabled(JAXBElement<Boolean> value) {
        this.isCSonMcimEnabled = value;
    }

    /**
     * Gets the value of the isCSonMroEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonMroEnabled() {
        return isCSonMroEnabled;
    }

    /**
     * Sets the value of the isCSonMroEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonMroEnabled(JAXBElement<Boolean> value) {
        this.isCSonMroEnabled = value;
    }

    /**
     * Gets the value of the isCSonMlbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonMlbEnabled() {
        return isCSonMlbEnabled;
    }

    /**
     * Sets the value of the isCSonMlbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonMlbEnabled(JAXBElement<Boolean> value) {
        this.isCSonMlbEnabled = value;
    }

    /**
     * Gets the value of the cSonMlbCapacityClassValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonMlbCapacityClassValue() {
        return cSonMlbCapacityClassValue;
    }

    /**
     * Sets the value of the cSonMlbCapacityClassValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonMlbCapacityClassValue(JAXBElement<Integer> value) {
        this.cSonMlbCapacityClassValue = value;
    }

    /**
     * Gets the value of the cSonMlbPdschLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonMlbPdschLoadThresh() {
        return cSonMlbPdschLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbPdschLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonMlbPdschLoadThresh(JAXBElement<Integer> value) {
        this.cSonMlbPdschLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbPuschLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonMlbPuschLoadThresh() {
        return cSonMlbPuschLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbPuschLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonMlbPuschLoadThresh(JAXBElement<Integer> value) {
        this.cSonMlbPuschLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbRrcLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonMlbRrcLoadThresh() {
        return cSonMlbRrcLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbRrcLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonMlbRrcLoadThresh(JAXBElement<Integer> value) {
        this.cSonMlbRrcLoadThresh = value;
    }

    /**
     * Gets the value of the cSonMlbCpuLoadThresh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonMlbCpuLoadThresh() {
        return cSonMlbCpuLoadThresh;
    }

    /**
     * Sets the value of the cSonMlbCpuLoadThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonMlbCpuLoadThresh(JAXBElement<Integer> value) {
        this.cSonMlbCpuLoadThresh = value;
    }

    /**
     * Gets the value of the isDlTxOptEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDlTxOptEnabled() {
        return isDlTxOptEnabled;
    }

    /**
     * Sets the value of the isDlTxOptEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDlTxOptEnabled(JAXBElement<Boolean> value) {
        this.isDlTxOptEnabled = value;
    }

    /**
     * Gets the value of the dlTxOpt property.
     * 
     * @return
     *     possible object is
     *     {@link DlTxOpt }
     *     
     */
    public DlTxOpt getDlTxOpt() {
        return dlTxOpt;
    }

    /**
     * Sets the value of the dlTxOpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlTxOpt }
     *     
     */
    public void setDlTxOpt(DlTxOpt value) {
        this.dlTxOpt = value;
    }

}
