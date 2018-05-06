
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType name="MacWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxHarqTxForUlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxHarqTxForUl" type="{http://Airspan.Netspan.WebServices}MaxHarqUlType" minOccurs="0"/>
 *         &lt;element name="PeriodicBsrTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PeriodicBsrTimer" type="{http://Airspan.Netspan.WebServices}BsrType" minOccurs="0"/>
 *         &lt;element name="RetxBsrTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RetxBsrTimer" type="{http://Airspan.Netspan.WebServices}RetxBsrTimerType" minOccurs="0"/>
 *         &lt;element name="MaxHarqTxForDlIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxHarqTxForDl" type="{http://Airspan.Netspan.WebServices}MaxHarqDlType" minOccurs="0"/>
 *         &lt;element name="MriTddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MriTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MriFddIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MriFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxVolteUlHarqTxIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxVolteUlHarqTx" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxVolteDlHarqTxIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxVolteDlHarqTx" type="{http://Airspan.Netspan.WebServices}MaxVolteDlHarqTxType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "maxHarqTxForDl",
    "mriTddIsDefault",
    "mriTdd",
    "mriFddIsDefault",
    "mriFdd",
    "maxVolteUlHarqTxIsDefault",
    "maxVolteUlHarqTx",
    "maxVolteDlHarqTxIsDefault",
    "maxVolteDlHarqTx"
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
    @XmlElementRef(name = "MriTddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mriTddIsDefault;
    @XmlElementRef(name = "MriTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mriTdd;
    @XmlElementRef(name = "MriFddIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mriFddIsDefault;
    @XmlElementRef(name = "MriFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mriFdd;
    @XmlElementRef(name = "MaxVolteUlHarqTxIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxVolteUlHarqTxIsDefault;
    @XmlElementRef(name = "MaxVolteUlHarqTx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxVolteUlHarqTx;
    @XmlElementRef(name = "MaxVolteDlHarqTxIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxVolteDlHarqTxIsDefault;
    @XmlElementRef(name = "MaxVolteDlHarqTx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maxVolteDlHarqTx;

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

    /**
     * Gets the value of the mriTddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMriTddIsDefault() {
        return mriTddIsDefault;
    }

    /**
     * Sets the value of the mriTddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMriTddIsDefault(JAXBElement<Boolean> value) {
        this.mriTddIsDefault = value;
    }

    /**
     * Gets the value of the mriTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMriTdd() {
        return mriTdd;
    }

    /**
     * Sets the value of the mriTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMriTdd(JAXBElement<Integer> value) {
        this.mriTdd = value;
    }

    /**
     * Gets the value of the mriFddIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMriFddIsDefault() {
        return mriFddIsDefault;
    }

    /**
     * Sets the value of the mriFddIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMriFddIsDefault(JAXBElement<Boolean> value) {
        this.mriFddIsDefault = value;
    }

    /**
     * Gets the value of the mriFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMriFdd() {
        return mriFdd;
    }

    /**
     * Sets the value of the mriFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMriFdd(JAXBElement<Integer> value) {
        this.mriFdd = value;
    }

    /**
     * Gets the value of the maxVolteUlHarqTxIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxVolteUlHarqTxIsDefault() {
        return maxVolteUlHarqTxIsDefault;
    }

    /**
     * Sets the value of the maxVolteUlHarqTxIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxVolteUlHarqTxIsDefault(JAXBElement<Boolean> value) {
        this.maxVolteUlHarqTxIsDefault = value;
    }

    /**
     * Gets the value of the maxVolteUlHarqTx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxVolteUlHarqTx() {
        return maxVolteUlHarqTx;
    }

    /**
     * Sets the value of the maxVolteUlHarqTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxVolteUlHarqTx(JAXBElement<Integer> value) {
        this.maxVolteUlHarqTx = value;
    }

    /**
     * Gets the value of the maxVolteDlHarqTxIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxVolteDlHarqTxIsDefault() {
        return maxVolteDlHarqTxIsDefault;
    }

    /**
     * Sets the value of the maxVolteDlHarqTxIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxVolteDlHarqTxIsDefault(JAXBElement<Boolean> value) {
        this.maxVolteDlHarqTxIsDefault = value;
    }

    /**
     * Gets the value of the maxVolteDlHarqTx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxVolteDlHarqTx() {
        return maxVolteDlHarqTx;
    }

    /**
     * Sets the value of the maxVolteDlHarqTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxVolteDlHarqTx(JAXBElement<String> value) {
        this.maxVolteDlHarqTx = value;
    }

}
