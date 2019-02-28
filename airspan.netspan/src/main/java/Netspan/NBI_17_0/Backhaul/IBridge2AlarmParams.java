
package Netspan.NBI_17_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2AlarmParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2AlarmParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CriticalFault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BootReboot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WirelessUpDown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EthernetUpDown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EthernetSpeedChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureLowHigh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultipleLoginAttempts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2AlarmParams", propOrder = {
    "criticalFault",
    "bootReboot",
    "wirelessUpDown",
    "ethernetUpDown",
    "ethernetSpeedChange",
    "temperatureLowHigh",
    "multipleLoginAttempts"
})
@XmlSeeAlso({
    IBridge2AlarmProfile.class
})
public class IBridge2AlarmParams {

    @XmlElementRef(name = "CriticalFault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> criticalFault;
    @XmlElementRef(name = "BootReboot", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bootReboot;
    @XmlElementRef(name = "WirelessUpDown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wirelessUpDown;
    @XmlElementRef(name = "EthernetUpDown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ethernetUpDown;
    @XmlElementRef(name = "EthernetSpeedChange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ethernetSpeedChange;
    @XmlElementRef(name = "TemperatureLowHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> temperatureLowHigh;
    @XmlElementRef(name = "MultipleLoginAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multipleLoginAttempts;

    /**
     * Gets the value of the criticalFault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCriticalFault() {
        return criticalFault;
    }

    /**
     * Sets the value of the criticalFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCriticalFault(JAXBElement<Boolean> value) {
        this.criticalFault = value;
    }

    /**
     * Gets the value of the bootReboot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBootReboot() {
        return bootReboot;
    }

    /**
     * Sets the value of the bootReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBootReboot(JAXBElement<Boolean> value) {
        this.bootReboot = value;
    }

    /**
     * Gets the value of the wirelessUpDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWirelessUpDown() {
        return wirelessUpDown;
    }

    /**
     * Sets the value of the wirelessUpDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWirelessUpDown(JAXBElement<Boolean> value) {
        this.wirelessUpDown = value;
    }

    /**
     * Gets the value of the ethernetUpDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEthernetUpDown() {
        return ethernetUpDown;
    }

    /**
     * Sets the value of the ethernetUpDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEthernetUpDown(JAXBElement<Boolean> value) {
        this.ethernetUpDown = value;
    }

    /**
     * Gets the value of the ethernetSpeedChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEthernetSpeedChange() {
        return ethernetSpeedChange;
    }

    /**
     * Sets the value of the ethernetSpeedChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEthernetSpeedChange(JAXBElement<Boolean> value) {
        this.ethernetSpeedChange = value;
    }

    /**
     * Gets the value of the temperatureLowHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTemperatureLowHigh() {
        return temperatureLowHigh;
    }

    /**
     * Sets the value of the temperatureLowHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTemperatureLowHigh(JAXBElement<Boolean> value) {
        this.temperatureLowHigh = value;
    }

    /**
     * Gets the value of the multipleLoginAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultipleLoginAttempts() {
        return multipleLoginAttempts;
    }

    /**
     * Sets the value of the multipleLoginAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultipleLoginAttempts(JAXBElement<Boolean> value) {
        this.multipleLoginAttempts = value;
    }

}
