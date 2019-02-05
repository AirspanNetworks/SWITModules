
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MacWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MacWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxHarqTxForUlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxHarqTxForUl" type="{http://Airspan.Netspan.WebServices}MaxHarqUlType" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicBsrTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicBsrTimer" type="{http://Airspan.Netspan.WebServices}BsrType" minOccurs="0"/&gt;
 *         &lt;element name="RetxBsrTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetxBsrTimer" type="{http://Airspan.Netspan.WebServices}RetxBsrTimerType" minOccurs="0"/&gt;
 *         &lt;element name="MaxHarqTxForDlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxHarqTxForDl" type="{http://Airspan.Netspan.WebServices}MaxHarqDlType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacWs", propOrder = {
    "maxHarqTxForUlIsDefault",
    "maxHarqTxForUl",
    "periodicBsrTimerIsDefault",
    "periodicBsrTimer",
    "retxBsrTimerIsDefault",
    "retxBsrTimer",
    "maxHarqTxForDlIsDefault",
    "maxHarqTxForDl"
})
public class MacWs {

    @XmlElementRef(name = "MaxHarqTxForUlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxHarqTxForUlIsDefault;
    @XmlElementRef(name = "MaxHarqTxForUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maxHarqTxForUl;
    @XmlElementRef(name = "PeriodicBsrTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> periodicBsrTimerIsDefault;
    @XmlElementRef(name = "PeriodicBsrTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> periodicBsrTimer;
    @XmlElementRef(name = "RetxBsrTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> retxBsrTimerIsDefault;
    @XmlElementRef(name = "RetxBsrTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retxBsrTimer;
    @XmlElementRef(name = "MaxHarqTxForDlIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxHarqTxForDlIsDefault;
    @XmlElementRef(name = "MaxHarqTxForDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maxHarqTxForDl;

    /**
     * Gets the value of the maxHarqTxForUlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxHarqTxForUlIsDefault() {
        return maxHarqTxForUlIsDefault;
    }

    /**
     * Sets the value of the maxHarqTxForUlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxHarqTxForUlIsDefault(JAXBElement<Boolean> value) {
        this.maxHarqTxForUlIsDefault = value;
    }

    /**
     * Gets the value of the maxHarqTxForUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxHarqTxForUl() {
        return maxHarqTxForUl;
    }

    /**
     * Sets the value of the maxHarqTxForUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxHarqTxForUl(JAXBElement<String> value) {
        this.maxHarqTxForUl = value;
    }

    /**
     * Gets the value of the periodicBsrTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPeriodicBsrTimerIsDefault() {
        return periodicBsrTimerIsDefault;
    }

    /**
     * Sets the value of the periodicBsrTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPeriodicBsrTimerIsDefault(JAXBElement<Boolean> value) {
        this.periodicBsrTimerIsDefault = value;
    }

    /**
     * Gets the value of the periodicBsrTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPeriodicBsrTimer() {
        return periodicBsrTimer;
    }

    /**
     * Sets the value of the periodicBsrTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPeriodicBsrTimer(JAXBElement<String> value) {
        this.periodicBsrTimer = value;
    }

    /**
     * Gets the value of the retxBsrTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRetxBsrTimerIsDefault() {
        return retxBsrTimerIsDefault;
    }

    /**
     * Sets the value of the retxBsrTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRetxBsrTimerIsDefault(JAXBElement<Boolean> value) {
        this.retxBsrTimerIsDefault = value;
    }

    /**
     * Gets the value of the retxBsrTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetxBsrTimer() {
        return retxBsrTimer;
    }

    /**
     * Sets the value of the retxBsrTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetxBsrTimer(JAXBElement<String> value) {
        this.retxBsrTimer = value;
    }

    /**
     * Gets the value of the maxHarqTxForDlIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxHarqTxForDlIsDefault() {
        return maxHarqTxForDlIsDefault;
    }

    /**
     * Sets the value of the maxHarqTxForDlIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxHarqTxForDlIsDefault(JAXBElement<Boolean> value) {
        this.maxHarqTxForDlIsDefault = value;
    }

    /**
     * Gets the value of the maxHarqTxForDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxHarqTxForDl() {
        return maxHarqTxForDl;
    }

    /**
     * Sets the value of the maxHarqTxForDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxHarqTxForDl(JAXBElement<String> value) {
        this.maxHarqTxForDl = value;
    }

}
