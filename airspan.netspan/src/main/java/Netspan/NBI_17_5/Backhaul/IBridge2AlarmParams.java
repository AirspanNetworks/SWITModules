
package Netspan.NBI_17_5.Backhaul;

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
 *         &lt;element name="ReceiveSignalStrength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RxSnr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Cinr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TxPer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WirelessLinkAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnauthorizedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TxPowerConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GnssSatelliteStrength" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureLowHighLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TemperatureLowHighUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveSignalStrengthLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveSignalStrengthUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxSnrLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxSnrUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CinrLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CinrUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPerLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPerUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WirelessLinkAvailabilityLowerThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WirelessLinkAvailabilityUpperThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "multipleLoginAttempts",
    "receiveSignalStrength",
    "rxSnr",
    "cinr",
    "txPer",
    "wirelessLinkAvailability",
    "unauthorizedAccess",
    "txPowerConfig",
    "gnssSatelliteStrength",
    "temperatureLowHighLowerThreshold",
    "temperatureLowHighUpperThreshold",
    "receiveSignalStrengthLowerThreshold",
    "receiveSignalStrengthUpperThreshold",
    "rxSnrLowerThreshold",
    "rxSnrUpperThreshold",
    "cinrLowerThreshold",
    "cinrUpperThreshold",
    "txPerLowerThreshold",
    "txPerUpperThreshold",
    "wirelessLinkAvailabilityLowerThreshold",
    "wirelessLinkAvailabilityUpperThreshold"
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
    @XmlElementRef(name = "ReceiveSignalStrength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> receiveSignalStrength;
    @XmlElementRef(name = "RxSnr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rxSnr;
    @XmlElementRef(name = "Cinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cinr;
    @XmlElementRef(name = "TxPer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> txPer;
    @XmlElementRef(name = "WirelessLinkAvailability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wirelessLinkAvailability;
    @XmlElementRef(name = "UnauthorizedAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> unauthorizedAccess;
    @XmlElementRef(name = "TxPowerConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> txPowerConfig;
    @XmlElementRef(name = "GnssSatelliteStrength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gnssSatelliteStrength;
    @XmlElementRef(name = "TemperatureLowHighLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> temperatureLowHighLowerThreshold;
    @XmlElementRef(name = "TemperatureLowHighUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> temperatureLowHighUpperThreshold;
    @XmlElementRef(name = "ReceiveSignalStrengthLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> receiveSignalStrengthLowerThreshold;
    @XmlElementRef(name = "ReceiveSignalStrengthUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> receiveSignalStrengthUpperThreshold;
    @XmlElementRef(name = "RxSnrLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxSnrLowerThreshold;
    @XmlElementRef(name = "RxSnrUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxSnrUpperThreshold;
    @XmlElementRef(name = "CinrLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cinrLowerThreshold;
    @XmlElementRef(name = "CinrUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cinrUpperThreshold;
    @XmlElementRef(name = "TxPerLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPerLowerThreshold;
    @XmlElementRef(name = "TxPerUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPerUpperThreshold;
    @XmlElementRef(name = "WirelessLinkAvailabilityLowerThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wirelessLinkAvailabilityLowerThreshold;
    @XmlElementRef(name = "WirelessLinkAvailabilityUpperThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wirelessLinkAvailabilityUpperThreshold;

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

    /**
     * Gets the value of the receiveSignalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReceiveSignalStrength() {
        return receiveSignalStrength;
    }

    /**
     * Sets the value of the receiveSignalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReceiveSignalStrength(JAXBElement<Boolean> value) {
        this.receiveSignalStrength = value;
    }

    /**
     * Gets the value of the rxSnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRxSnr() {
        return rxSnr;
    }

    /**
     * Sets the value of the rxSnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRxSnr(JAXBElement<Boolean> value) {
        this.rxSnr = value;
    }

    /**
     * Gets the value of the cinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCinr() {
        return cinr;
    }

    /**
     * Sets the value of the cinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCinr(JAXBElement<Boolean> value) {
        this.cinr = value;
    }

    /**
     * Gets the value of the txPer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTxPer() {
        return txPer;
    }

    /**
     * Sets the value of the txPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTxPer(JAXBElement<Boolean> value) {
        this.txPer = value;
    }

    /**
     * Gets the value of the wirelessLinkAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWirelessLinkAvailability() {
        return wirelessLinkAvailability;
    }

    /**
     * Sets the value of the wirelessLinkAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWirelessLinkAvailability(JAXBElement<Boolean> value) {
        this.wirelessLinkAvailability = value;
    }

    /**
     * Gets the value of the unauthorizedAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUnauthorizedAccess() {
        return unauthorizedAccess;
    }

    /**
     * Sets the value of the unauthorizedAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUnauthorizedAccess(JAXBElement<Boolean> value) {
        this.unauthorizedAccess = value;
    }

    /**
     * Gets the value of the txPowerConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTxPowerConfig() {
        return txPowerConfig;
    }

    /**
     * Sets the value of the txPowerConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTxPowerConfig(JAXBElement<Boolean> value) {
        this.txPowerConfig = value;
    }

    /**
     * Gets the value of the gnssSatelliteStrength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGnssSatelliteStrength() {
        return gnssSatelliteStrength;
    }

    /**
     * Sets the value of the gnssSatelliteStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGnssSatelliteStrength(JAXBElement<Boolean> value) {
        this.gnssSatelliteStrength = value;
    }

    /**
     * Gets the value of the temperatureLowHighLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTemperatureLowHighLowerThreshold() {
        return temperatureLowHighLowerThreshold;
    }

    /**
     * Sets the value of the temperatureLowHighLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTemperatureLowHighLowerThreshold(JAXBElement<Integer> value) {
        this.temperatureLowHighLowerThreshold = value;
    }

    /**
     * Gets the value of the temperatureLowHighUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTemperatureLowHighUpperThreshold() {
        return temperatureLowHighUpperThreshold;
    }

    /**
     * Sets the value of the temperatureLowHighUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTemperatureLowHighUpperThreshold(JAXBElement<Integer> value) {
        this.temperatureLowHighUpperThreshold = value;
    }

    /**
     * Gets the value of the receiveSignalStrengthLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReceiveSignalStrengthLowerThreshold() {
        return receiveSignalStrengthLowerThreshold;
    }

    /**
     * Sets the value of the receiveSignalStrengthLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReceiveSignalStrengthLowerThreshold(JAXBElement<Integer> value) {
        this.receiveSignalStrengthLowerThreshold = value;
    }

    /**
     * Gets the value of the receiveSignalStrengthUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReceiveSignalStrengthUpperThreshold() {
        return receiveSignalStrengthUpperThreshold;
    }

    /**
     * Sets the value of the receiveSignalStrengthUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReceiveSignalStrengthUpperThreshold(JAXBElement<Integer> value) {
        this.receiveSignalStrengthUpperThreshold = value;
    }

    /**
     * Gets the value of the rxSnrLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxSnrLowerThreshold() {
        return rxSnrLowerThreshold;
    }

    /**
     * Sets the value of the rxSnrLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxSnrLowerThreshold(JAXBElement<Integer> value) {
        this.rxSnrLowerThreshold = value;
    }

    /**
     * Gets the value of the rxSnrUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxSnrUpperThreshold() {
        return rxSnrUpperThreshold;
    }

    /**
     * Sets the value of the rxSnrUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxSnrUpperThreshold(JAXBElement<Integer> value) {
        this.rxSnrUpperThreshold = value;
    }

    /**
     * Gets the value of the cinrLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCinrLowerThreshold() {
        return cinrLowerThreshold;
    }

    /**
     * Sets the value of the cinrLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCinrLowerThreshold(JAXBElement<Integer> value) {
        this.cinrLowerThreshold = value;
    }

    /**
     * Gets the value of the cinrUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCinrUpperThreshold() {
        return cinrUpperThreshold;
    }

    /**
     * Sets the value of the cinrUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCinrUpperThreshold(JAXBElement<Integer> value) {
        this.cinrUpperThreshold = value;
    }

    /**
     * Gets the value of the txPerLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPerLowerThreshold() {
        return txPerLowerThreshold;
    }

    /**
     * Sets the value of the txPerLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPerLowerThreshold(JAXBElement<Integer> value) {
        this.txPerLowerThreshold = value;
    }

    /**
     * Gets the value of the txPerUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPerUpperThreshold() {
        return txPerUpperThreshold;
    }

    /**
     * Sets the value of the txPerUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPerUpperThreshold(JAXBElement<Integer> value) {
        this.txPerUpperThreshold = value;
    }

    /**
     * Gets the value of the wirelessLinkAvailabilityLowerThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWirelessLinkAvailabilityLowerThreshold() {
        return wirelessLinkAvailabilityLowerThreshold;
    }

    /**
     * Sets the value of the wirelessLinkAvailabilityLowerThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWirelessLinkAvailabilityLowerThreshold(JAXBElement<Integer> value) {
        this.wirelessLinkAvailabilityLowerThreshold = value;
    }

    /**
     * Gets the value of the wirelessLinkAvailabilityUpperThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWirelessLinkAvailabilityUpperThreshold() {
        return wirelessLinkAvailabilityUpperThreshold;
    }

    /**
     * Sets the value of the wirelessLinkAvailabilityUpperThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWirelessLinkAvailabilityUpperThreshold(JAXBElement<Integer> value) {
        this.wirelessLinkAvailabilityUpperThreshold = value;
    }

}
