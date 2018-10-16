
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440RfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440RfStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkStatus" type="{http://Airspan.Netspan.WebServices}LinkStatusValues"/&gt;
 *         &lt;element name="LinkedToNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxLinkEfficiency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxLinkEfficiency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SNR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxSignalStrengthChannel0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxSignalStrengthChannel0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxSignalStrengthChannel1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxSignalStrengthChannel1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Uptime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RxSignalStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPhyRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RxPhyRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TxSignalStrength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440RfStatusWs", propOrder = {
    "role",
    "ssid",
    "bandwidth",
    "frequency",
    "txPower",
    "linkStatus",
    "linkedToNode",
    "txLinkEfficiency",
    "rxLinkEfficiency",
    "snr",
    "txSignalStrengthChannel0",
    "rxSignalStrengthChannel0",
    "txSignalStrengthChannel1",
    "rxSignalStrengthChannel1",
    "uptime",
    "rxSignalStrength",
    "txPhyRate",
    "rxPhyRate",
    "txSignalStrength"
})
public class Ib440RfStatusWs {

    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "SSID")
    protected String ssid;
    @XmlElement(name = "Bandwidth")
    protected String bandwidth;
    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower;
    @XmlElement(name = "LinkStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LinkStatusValues linkStatus;
    @XmlElement(name = "LinkedToNode")
    protected String linkedToNode;
    @XmlElementRef(name = "TxLinkEfficiency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txLinkEfficiency;
    @XmlElementRef(name = "RxLinkEfficiency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxLinkEfficiency;
    @XmlElementRef(name = "SNR", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> snr;
    @XmlElementRef(name = "TxSignalStrengthChannel0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txSignalStrengthChannel0;
    @XmlElementRef(name = "RxSignalStrengthChannel0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxSignalStrengthChannel0;
    @XmlElementRef(name = "TxSignalStrengthChannel1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txSignalStrengthChannel1;
    @XmlElementRef(name = "RxSignalStrengthChannel1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxSignalStrengthChannel1;
    @XmlElementRef(name = "Uptime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> uptime;
    @XmlElementRef(name = "RxSignalStrength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxSignalStrength;
    @XmlElementRef(name = "TxPhyRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> txPhyRate;
    @XmlElementRef(name = "RxPhyRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> rxPhyRate;
    @XmlElementRef(name = "TxSignalStrength", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txSignalStrength;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSID() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(String value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidth(String value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<Integer> value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPower(JAXBElement<Integer> value) {
        this.txPower = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatusValues }
     *     
     */
    public LinkStatusValues getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatusValues }
     *     
     */
    public void setLinkStatus(LinkStatusValues value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the linkedToNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedToNode() {
        return linkedToNode;
    }

    /**
     * Sets the value of the linkedToNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedToNode(String value) {
        this.linkedToNode = value;
    }

    /**
     * Gets the value of the txLinkEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxLinkEfficiency() {
        return txLinkEfficiency;
    }

    /**
     * Sets the value of the txLinkEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxLinkEfficiency(JAXBElement<Integer> value) {
        this.txLinkEfficiency = value;
    }

    /**
     * Gets the value of the rxLinkEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxLinkEfficiency() {
        return rxLinkEfficiency;
    }

    /**
     * Sets the value of the rxLinkEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxLinkEfficiency(JAXBElement<Integer> value) {
        this.rxLinkEfficiency = value;
    }

    /**
     * Gets the value of the snr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSNR() {
        return snr;
    }

    /**
     * Sets the value of the snr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSNR(JAXBElement<Integer> value) {
        this.snr = value;
    }

    /**
     * Gets the value of the txSignalStrengthChannel0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxSignalStrengthChannel0() {
        return txSignalStrengthChannel0;
    }

    /**
     * Sets the value of the txSignalStrengthChannel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxSignalStrengthChannel0(JAXBElement<Integer> value) {
        this.txSignalStrengthChannel0 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthChannel0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxSignalStrengthChannel0() {
        return rxSignalStrengthChannel0;
    }

    /**
     * Sets the value of the rxSignalStrengthChannel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxSignalStrengthChannel0(JAXBElement<Integer> value) {
        this.rxSignalStrengthChannel0 = value;
    }

    /**
     * Gets the value of the txSignalStrengthChannel1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxSignalStrengthChannel1() {
        return txSignalStrengthChannel1;
    }

    /**
     * Sets the value of the txSignalStrengthChannel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxSignalStrengthChannel1(JAXBElement<Integer> value) {
        this.txSignalStrengthChannel1 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthChannel1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxSignalStrengthChannel1() {
        return rxSignalStrengthChannel1;
    }

    /**
     * Sets the value of the rxSignalStrengthChannel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxSignalStrengthChannel1(JAXBElement<Integer> value) {
        this.rxSignalStrengthChannel1 = value;
    }

    /**
     * Gets the value of the uptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUptime() {
        return uptime;
    }

    /**
     * Sets the value of the uptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUptime(JAXBElement<Long> value) {
        this.uptime = value;
    }

    /**
     * Gets the value of the rxSignalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxSignalStrength() {
        return rxSignalStrength;
    }

    /**
     * Sets the value of the rxSignalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxSignalStrength(JAXBElement<Integer> value) {
        this.rxSignalStrength = value;
    }

    /**
     * Gets the value of the txPhyRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getTxPhyRate() {
        return txPhyRate;
    }

    /**
     * Sets the value of the txPhyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setTxPhyRate(JAXBElement<Float> value) {
        this.txPhyRate = value;
    }

    /**
     * Gets the value of the rxPhyRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getRxPhyRate() {
        return rxPhyRate;
    }

    /**
     * Sets the value of the rxPhyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setRxPhyRate(JAXBElement<Float> value) {
        this.rxPhyRate = value;
    }

    /**
     * Gets the value of the txSignalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxSignalStrength() {
        return txSignalStrength;
    }

    /**
     * Sets the value of the txSignalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxSignalStrength(JAXBElement<Integer> value) {
        this.txSignalStrength = value;
    }

}
