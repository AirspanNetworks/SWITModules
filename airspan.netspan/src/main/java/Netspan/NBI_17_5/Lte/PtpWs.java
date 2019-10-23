
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PtpWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtpWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PdvAlarmThresholdTddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdvAlarmThresholdTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdvAlarmThresholdFddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdvAlarmThresholdFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdvHoldOverThresholdTddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdvHoldOverThresholdTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdvHoldOverThresholdFddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PdvHoldOverThresholdFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpTimeToLockTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpTimeToLockTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpOverPublicInternetIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpOverPublicInternet" type="{http://Airspan.Netspan.WebServices}PtpOverPublicInternetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtpWs", propOrder = {
    "pdvAlarmThresholdTddIsDefault",
    "pdvAlarmThresholdTdd",
    "pdvAlarmThresholdFddIsDefault",
    "pdvAlarmThresholdFdd",
    "pdvHoldOverThresholdTddIsDefault",
    "pdvHoldOverThresholdTdd",
    "pdvHoldOverThresholdFddIsDefault",
    "pdvHoldOverThresholdFdd",
    "ptpTimeToLockTimerIsDefault",
    "ptpTimeToLockTimer",
    "ptpOverPublicInternetIsDefault",
    "ptpOverPublicInternet"
})
public class PtpWs {

    @XmlElementRef(name = "PdvAlarmThresholdTddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdvAlarmThresholdTddIsDefault;
    @XmlElementRef(name = "PdvAlarmThresholdTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdvAlarmThresholdTdd;
    @XmlElementRef(name = "PdvAlarmThresholdFddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdvAlarmThresholdFddIsDefault;
    @XmlElementRef(name = "PdvAlarmThresholdFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdvAlarmThresholdFdd;
    @XmlElementRef(name = "PdvHoldOverThresholdTddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdvHoldOverThresholdTddIsDefault;
    @XmlElementRef(name = "PdvHoldOverThresholdTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdvHoldOverThresholdTdd;
    @XmlElementRef(name = "PdvHoldOverThresholdFddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdvHoldOverThresholdFddIsDefault;
    @XmlElementRef(name = "PdvHoldOverThresholdFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdvHoldOverThresholdFdd;
    @XmlElementRef(name = "PtpTimeToLockTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpTimeToLockTimerIsDefault;
    @XmlElementRef(name = "PtpTimeToLockTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpTimeToLockTimer;
    @XmlElementRef(name = "PtpOverPublicInternetIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpOverPublicInternetIsDefault;
    @XmlElementRef(name = "PtpOverPublicInternet", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PtpOverPublicInternetType> ptpOverPublicInternet;

    /**
     * Gets the value of the pdvAlarmThresholdTddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdvAlarmThresholdTddIsDefault() {
        return pdvAlarmThresholdTddIsDefault;
    }

    /**
     * Sets the value of the pdvAlarmThresholdTddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdvAlarmThresholdTddIsDefault(JAXBElement<Boolean> value) {
        this.pdvAlarmThresholdTddIsDefault = value;
    }

    /**
     * Gets the value of the pdvAlarmThresholdTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdvAlarmThresholdTdd() {
        return pdvAlarmThresholdTdd;
    }

    /**
     * Sets the value of the pdvAlarmThresholdTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdvAlarmThresholdTdd(JAXBElement<Integer> value) {
        this.pdvAlarmThresholdTdd = value;
    }

    /**
     * Gets the value of the pdvAlarmThresholdFddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdvAlarmThresholdFddIsDefault() {
        return pdvAlarmThresholdFddIsDefault;
    }

    /**
     * Sets the value of the pdvAlarmThresholdFddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdvAlarmThresholdFddIsDefault(JAXBElement<Boolean> value) {
        this.pdvAlarmThresholdFddIsDefault = value;
    }

    /**
     * Gets the value of the pdvAlarmThresholdFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdvAlarmThresholdFdd() {
        return pdvAlarmThresholdFdd;
    }

    /**
     * Sets the value of the pdvAlarmThresholdFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdvAlarmThresholdFdd(JAXBElement<Integer> value) {
        this.pdvAlarmThresholdFdd = value;
    }

    /**
     * Gets the value of the pdvHoldOverThresholdTddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdvHoldOverThresholdTddIsDefault() {
        return pdvHoldOverThresholdTddIsDefault;
    }

    /**
     * Sets the value of the pdvHoldOverThresholdTddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdvHoldOverThresholdTddIsDefault(JAXBElement<Boolean> value) {
        this.pdvHoldOverThresholdTddIsDefault = value;
    }

    /**
     * Gets the value of the pdvHoldOverThresholdTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdvHoldOverThresholdTdd() {
        return pdvHoldOverThresholdTdd;
    }

    /**
     * Sets the value of the pdvHoldOverThresholdTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdvHoldOverThresholdTdd(JAXBElement<Integer> value) {
        this.pdvHoldOverThresholdTdd = value;
    }

    /**
     * Gets the value of the pdvHoldOverThresholdFddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdvHoldOverThresholdFddIsDefault() {
        return pdvHoldOverThresholdFddIsDefault;
    }

    /**
     * Sets the value of the pdvHoldOverThresholdFddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdvHoldOverThresholdFddIsDefault(JAXBElement<Boolean> value) {
        this.pdvHoldOverThresholdFddIsDefault = value;
    }

    /**
     * Gets the value of the pdvHoldOverThresholdFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdvHoldOverThresholdFdd() {
        return pdvHoldOverThresholdFdd;
    }

    /**
     * Sets the value of the pdvHoldOverThresholdFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdvHoldOverThresholdFdd(JAXBElement<Integer> value) {
        this.pdvHoldOverThresholdFdd = value;
    }

    /**
     * Gets the value of the ptpTimeToLockTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpTimeToLockTimerIsDefault() {
        return ptpTimeToLockTimerIsDefault;
    }

    /**
     * Sets the value of the ptpTimeToLockTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpTimeToLockTimerIsDefault(JAXBElement<Boolean> value) {
        this.ptpTimeToLockTimerIsDefault = value;
    }

    /**
     * Gets the value of the ptpTimeToLockTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpTimeToLockTimer() {
        return ptpTimeToLockTimer;
    }

    /**
     * Sets the value of the ptpTimeToLockTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpTimeToLockTimer(JAXBElement<Integer> value) {
        this.ptpTimeToLockTimer = value;
    }

    /**
     * Gets the value of the ptpOverPublicInternetIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpOverPublicInternetIsDefault() {
        return ptpOverPublicInternetIsDefault;
    }

    /**
     * Sets the value of the ptpOverPublicInternetIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpOverPublicInternetIsDefault(JAXBElement<Boolean> value) {
        this.ptpOverPublicInternetIsDefault = value;
    }

    /**
     * Gets the value of the ptpOverPublicInternet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PtpOverPublicInternetType }{@code >}
     *     
     */
    public JAXBElement<PtpOverPublicInternetType> getPtpOverPublicInternet() {
        return ptpOverPublicInternet;
    }

    /**
     * Sets the value of the ptpOverPublicInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PtpOverPublicInternetType }{@code >}
     *     
     */
    public void setPtpOverPublicInternet(JAXBElement<PtpOverPublicInternetType> value) {
        this.ptpOverPublicInternet = value;
    }

}
