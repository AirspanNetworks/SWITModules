
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellQosBasedHoWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellQosBasedHoWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreferredVolteIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PreferredVolte" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TimeoutFromLastMsgIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeoutFromLastMsg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMaxSuccessIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMaxSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMinAttemptsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMinAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMinCsfbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VolteSwitchMinCsfb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellQosBasedHoWs", propOrder = {
    "preferredVolteIsDefault",
    "preferredVolte",
    "timeoutFromLastMsgIsDefault",
    "timeoutFromLastMsg",
    "volteSwitchMaxSuccessIsDefault",
    "volteSwitchMaxSuccess",
    "volteSwitchMinAttemptsIsDefault",
    "volteSwitchMinAttempts",
    "volteSwitchMinCsfbIsDefault",
    "volteSwitchMinCsfb"
})
public class CellQosBasedHoWs {

    @XmlElementRef(name = "PreferredVolteIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferredVolteIsDefault;
    @XmlElementRef(name = "PreferredVolte", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> preferredVolte;
    @XmlElementRef(name = "TimeoutFromLastMsgIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timeoutFromLastMsgIsDefault;
    @XmlElementRef(name = "TimeoutFromLastMsg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeoutFromLastMsg;
    @XmlElementRef(name = "VolteSwitchMaxSuccessIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteSwitchMaxSuccessIsDefault;
    @XmlElementRef(name = "VolteSwitchMaxSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> volteSwitchMaxSuccess;
    @XmlElementRef(name = "VolteSwitchMinAttemptsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteSwitchMinAttemptsIsDefault;
    @XmlElementRef(name = "VolteSwitchMinAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> volteSwitchMinAttempts;
    @XmlElementRef(name = "VolteSwitchMinCsfbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteSwitchMinCsfbIsDefault;
    @XmlElementRef(name = "VolteSwitchMinCsfb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> volteSwitchMinCsfb;

    /**
     * Gets the value of the preferredVolteIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferredVolteIsDefault() {
        return preferredVolteIsDefault;
    }

    /**
     * Sets the value of the preferredVolteIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferredVolteIsDefault(JAXBElement<Boolean> value) {
        this.preferredVolteIsDefault = value;
    }

    /**
     * Gets the value of the preferredVolte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPreferredVolte() {
        return preferredVolte;
    }

    /**
     * Sets the value of the preferredVolte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPreferredVolte(JAXBElement<EnabledDisabledStates> value) {
        this.preferredVolte = value;
    }

    /**
     * Gets the value of the timeoutFromLastMsgIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimeoutFromLastMsgIsDefault() {
        return timeoutFromLastMsgIsDefault;
    }

    /**
     * Sets the value of the timeoutFromLastMsgIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimeoutFromLastMsgIsDefault(JAXBElement<Boolean> value) {
        this.timeoutFromLastMsgIsDefault = value;
    }

    /**
     * Gets the value of the timeoutFromLastMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeoutFromLastMsg() {
        return timeoutFromLastMsg;
    }

    /**
     * Sets the value of the timeoutFromLastMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeoutFromLastMsg(JAXBElement<Integer> value) {
        this.timeoutFromLastMsg = value;
    }

    /**
     * Gets the value of the volteSwitchMaxSuccessIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteSwitchMaxSuccessIsDefault() {
        return volteSwitchMaxSuccessIsDefault;
    }

    /**
     * Sets the value of the volteSwitchMaxSuccessIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteSwitchMaxSuccessIsDefault(JAXBElement<Boolean> value) {
        this.volteSwitchMaxSuccessIsDefault = value;
    }

    /**
     * Gets the value of the volteSwitchMaxSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVolteSwitchMaxSuccess() {
        return volteSwitchMaxSuccess;
    }

    /**
     * Sets the value of the volteSwitchMaxSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVolteSwitchMaxSuccess(JAXBElement<Integer> value) {
        this.volteSwitchMaxSuccess = value;
    }

    /**
     * Gets the value of the volteSwitchMinAttemptsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteSwitchMinAttemptsIsDefault() {
        return volteSwitchMinAttemptsIsDefault;
    }

    /**
     * Sets the value of the volteSwitchMinAttemptsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteSwitchMinAttemptsIsDefault(JAXBElement<Boolean> value) {
        this.volteSwitchMinAttemptsIsDefault = value;
    }

    /**
     * Gets the value of the volteSwitchMinAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVolteSwitchMinAttempts() {
        return volteSwitchMinAttempts;
    }

    /**
     * Sets the value of the volteSwitchMinAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVolteSwitchMinAttempts(JAXBElement<Integer> value) {
        this.volteSwitchMinAttempts = value;
    }

    /**
     * Gets the value of the volteSwitchMinCsfbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteSwitchMinCsfbIsDefault() {
        return volteSwitchMinCsfbIsDefault;
    }

    /**
     * Sets the value of the volteSwitchMinCsfbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteSwitchMinCsfbIsDefault(JAXBElement<Boolean> value) {
        this.volteSwitchMinCsfbIsDefault = value;
    }

    /**
     * Gets the value of the volteSwitchMinCsfb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVolteSwitchMinCsfb() {
        return volteSwitchMinCsfb;
    }

    /**
     * Sets the value of the volteSwitchMinCsfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVolteSwitchMinCsfb(JAXBElement<Integer> value) {
        this.volteSwitchMinCsfb = value;
    }

}
