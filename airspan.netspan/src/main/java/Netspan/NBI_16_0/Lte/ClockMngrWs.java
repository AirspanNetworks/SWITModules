
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockMngrWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClockMngrWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StratumGnssIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StratumGnss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StratumPtpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StratumPtp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StratumNlmIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StratumNlm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StratumDenbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StratumDenb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StratumGponIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StratumGpon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeToLockIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TimeToLock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockMngrWs", propOrder = {
    "stratumGnssIsDefault",
    "stratumGnss",
    "stratumPtpIsDefault",
    "stratumPtp",
    "stratumNlmIsDefault",
    "stratumNlm",
    "stratumDenbIsDefault",
    "stratumDenb",
    "stratumGponIsDefault",
    "stratumGpon",
    "timeToLockIsDefault",
    "timeToLock"
})
public class ClockMngrWs {

    @XmlElementRef(name = "StratumGnssIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumGnssIsDefault;
    @XmlElementRef(name = "StratumGnss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumGnss;
    @XmlElementRef(name = "StratumPtpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumPtpIsDefault;
    @XmlElementRef(name = "StratumPtp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumPtp;
    @XmlElementRef(name = "StratumNlmIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumNlmIsDefault;
    @XmlElementRef(name = "StratumNlm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumNlm;
    @XmlElementRef(name = "StratumDenbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumDenbIsDefault;
    @XmlElementRef(name = "StratumDenb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumDenb;
    @XmlElementRef(name = "StratumGponIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumGponIsDefault;
    @XmlElementRef(name = "StratumGpon", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumGpon;
    @XmlElementRef(name = "TimeToLockIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timeToLockIsDefault;
    @XmlElementRef(name = "TimeToLock", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeToLock;

    /**
     * Gets the value of the stratumGnssIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumGnssIsDefault() {
        return stratumGnssIsDefault;
    }

    /**
     * Sets the value of the stratumGnssIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumGnssIsDefault(JAXBElement<Boolean> value) {
        this.stratumGnssIsDefault = value;
    }

    /**
     * Gets the value of the stratumGnss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumGnss() {
        return stratumGnss;
    }

    /**
     * Sets the value of the stratumGnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumGnss(JAXBElement<Integer> value) {
        this.stratumGnss = value;
    }

    /**
     * Gets the value of the stratumPtpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumPtpIsDefault() {
        return stratumPtpIsDefault;
    }

    /**
     * Sets the value of the stratumPtpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumPtpIsDefault(JAXBElement<Boolean> value) {
        this.stratumPtpIsDefault = value;
    }

    /**
     * Gets the value of the stratumPtp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumPtp() {
        return stratumPtp;
    }

    /**
     * Sets the value of the stratumPtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumPtp(JAXBElement<Integer> value) {
        this.stratumPtp = value;
    }

    /**
     * Gets the value of the stratumNlmIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumNlmIsDefault() {
        return stratumNlmIsDefault;
    }

    /**
     * Sets the value of the stratumNlmIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumNlmIsDefault(JAXBElement<Boolean> value) {
        this.stratumNlmIsDefault = value;
    }

    /**
     * Gets the value of the stratumNlm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumNlm() {
        return stratumNlm;
    }

    /**
     * Sets the value of the stratumNlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumNlm(JAXBElement<Integer> value) {
        this.stratumNlm = value;
    }

    /**
     * Gets the value of the stratumDenbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumDenbIsDefault() {
        return stratumDenbIsDefault;
    }

    /**
     * Sets the value of the stratumDenbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumDenbIsDefault(JAXBElement<Boolean> value) {
        this.stratumDenbIsDefault = value;
    }

    /**
     * Gets the value of the stratumDenb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumDenb() {
        return stratumDenb;
    }

    /**
     * Sets the value of the stratumDenb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumDenb(JAXBElement<Integer> value) {
        this.stratumDenb = value;
    }

    /**
     * Gets the value of the stratumGponIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumGponIsDefault() {
        return stratumGponIsDefault;
    }

    /**
     * Sets the value of the stratumGponIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumGponIsDefault(JAXBElement<Boolean> value) {
        this.stratumGponIsDefault = value;
    }

    /**
     * Gets the value of the stratumGpon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumGpon() {
        return stratumGpon;
    }

    /**
     * Sets the value of the stratumGpon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumGpon(JAXBElement<Integer> value) {
        this.stratumGpon = value;
    }

    /**
     * Gets the value of the timeToLockIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimeToLockIsDefault() {
        return timeToLockIsDefault;
    }

    /**
     * Sets the value of the timeToLockIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimeToLockIsDefault(JAXBElement<Boolean> value) {
        this.timeToLockIsDefault = value;
    }

    /**
     * Gets the value of the timeToLock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeToLock() {
        return timeToLock;
    }

    /**
     * Sets the value of the timeToLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeToLock(JAXBElement<Integer> value) {
        this.timeToLock = value;
    }

}
