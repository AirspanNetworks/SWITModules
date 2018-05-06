
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityInterRatGeranReselection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityInterRatGeranReselection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeranReselectionPriorityList" type="{http://Airspan.Netspan.WebServices}MobilityGeranReselectionPriorityListContainer" minOccurs="0"/>
 *         &lt;element name="TReselectionGeran" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThreshXHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ThreshXLow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QRxLevMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPMaxGeranNotPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PMaxGeran" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityInterRatGeranReselection", propOrder = {
    "geranReselectionPriorityList",
    "tReselectionGeran",
    "threshXHigh",
    "threshXLow",
    "qRxLevMin",
    "isPMaxGeranNotPresent",
    "pMaxGeran"
})
public class MobilityInterRatGeranReselection {

    @XmlElement(name = "GeranReselectionPriorityList")
    protected MobilityGeranReselectionPriorityListContainer geranReselectionPriorityList;
    @XmlElementRef(name = "TReselectionGeran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tReselectionGeran;
    @XmlElementRef(name = "ThreshXHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXHigh;
    @XmlElementRef(name = "ThreshXLow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> threshXLow;
    @XmlElementRef(name = "QRxLevMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qRxLevMin;
    @XmlElementRef(name = "IsPMaxGeranNotPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPMaxGeranNotPresent;
    @XmlElementRef(name = "PMaxGeran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pMaxGeran;

    /**
     * Gets the value of the geranReselectionPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityGeranReselectionPriorityListContainer }
     *     
     */
    public MobilityGeranReselectionPriorityListContainer getGeranReselectionPriorityList() {
        return geranReselectionPriorityList;
    }

    /**
     * Sets the value of the geranReselectionPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityGeranReselectionPriorityListContainer }
     *     
     */
    public void setGeranReselectionPriorityList(MobilityGeranReselectionPriorityListContainer value) {
        this.geranReselectionPriorityList = value;
    }

    /**
     * Gets the value of the tReselectionGeran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTReselectionGeran() {
        return tReselectionGeran;
    }

    /**
     * Sets the value of the tReselectionGeran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTReselectionGeran(JAXBElement<Integer> value) {
        this.tReselectionGeran = value;
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
     * Gets the value of the isPMaxGeranNotPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPMaxGeranNotPresent() {
        return isPMaxGeranNotPresent;
    }

    /**
     * Sets the value of the isPMaxGeranNotPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPMaxGeranNotPresent(JAXBElement<Boolean> value) {
        this.isPMaxGeranNotPresent = value;
    }

    /**
     * Gets the value of the pMaxGeran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPMaxGeran() {
        return pMaxGeran;
    }

    /**
     * Sets the value of the pMaxGeran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPMaxGeran(JAXBElement<Integer> value) {
        this.pMaxGeran = value;
    }

}
