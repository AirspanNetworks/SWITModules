
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteDrxEntryWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteDrxEntryWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InactivityTimer" type="{http://Airspan.Netspan.WebServices}CdrxPsfValues" minOccurs="0"/&gt;
 *         &lt;element name="ShortCycle" type="{http://Airspan.Netspan.WebServices}CdrxShortCycleSfValues" minOccurs="0"/&gt;
 *         &lt;element name="ShortCycleTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LongCycle" type="{http://Airspan.Netspan.WebServices}CdrxLongCycleSfValues" minOccurs="0"/&gt;
 *         &lt;element name="OnDuration" type="{http://Airspan.Netspan.WebServices}CdrxOnDurationPsfValues" minOccurs="0"/&gt;
 *         &lt;element name="RetransmissionTimer" type="{http://Airspan.Netspan.WebServices}CdrxRetxPsfValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteDrxEntryWs", propOrder = {
    "inactivityTimer",
    "shortCycle",
    "shortCycleTimer",
    "longCycle",
    "onDuration",
    "retransmissionTimer"
})
public class LteDrxEntryWs {

    @XmlElementRef(name = "InactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inactivityTimer;
    @XmlElementRef(name = "ShortCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortCycle;
    @XmlElementRef(name = "ShortCycleTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> shortCycleTimer;
    @XmlElementRef(name = "LongCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longCycle;
    @XmlElementRef(name = "OnDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onDuration;
    @XmlElementRef(name = "RetransmissionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retransmissionTimer;

    /**
     * Gets the value of the inactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInactivityTimer() {
        return inactivityTimer;
    }

    /**
     * Sets the value of the inactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInactivityTimer(JAXBElement<String> value) {
        this.inactivityTimer = value;
    }

    /**
     * Gets the value of the shortCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortCycle() {
        return shortCycle;
    }

    /**
     * Sets the value of the shortCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortCycle(JAXBElement<String> value) {
        this.shortCycle = value;
    }

    /**
     * Gets the value of the shortCycleTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getShortCycleTimer() {
        return shortCycleTimer;
    }

    /**
     * Sets the value of the shortCycleTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setShortCycleTimer(JAXBElement<Integer> value) {
        this.shortCycleTimer = value;
    }

    /**
     * Gets the value of the longCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongCycle() {
        return longCycle;
    }

    /**
     * Sets the value of the longCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongCycle(JAXBElement<String> value) {
        this.longCycle = value;
    }

    /**
     * Gets the value of the onDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnDuration() {
        return onDuration;
    }

    /**
     * Sets the value of the onDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnDuration(JAXBElement<String> value) {
        this.onDuration = value;
    }

    /**
     * Gets the value of the retransmissionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetransmissionTimer() {
        return retransmissionTimer;
    }

    /**
     * Sets the value of the retransmissionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetransmissionTimer(JAXBElement<String> value) {
        this.retransmissionTimer = value;
    }

}
