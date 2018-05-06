
package Netspan.NBI_14_0.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib440RfStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440RfStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LinkStatus" type="{http://Airspan.Netspan.WebServices}LinkStatusValues"/>
 *         &lt;element name="LinkedToNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxLinkEfficiency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxLinkEfficiency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SNR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxSignalStrengthChannel0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxSignalStrengthChannel0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxSignalStrengthChannel1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxSignalStrengthChannel1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxPhyRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RxPhyRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "txPhyRate",
    "rxPhyRate"
})
public class Ib440RfStatusWs {

    @XmlElement(name = "Role")
    protected String role;
    @XmlElement(name = "SSID")
    protected String ssid;
    @XmlElement(name = "Bandwidth")
    protected String bandwidth;
    @XmlElement(name = "Frequency", required = true, type = Integer.class, nillable = true)
    protected Integer frequency;
    @XmlElement(name = "TxPower", required = true, type = Integer.class, nillable = true)
    protected Integer txPower;
    @XmlElement(name = "LinkStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LinkStatusValues linkStatus;
    @XmlElement(name = "LinkedToNode")
    protected String linkedToNode;
    @XmlElement(name = "TxLinkEfficiency", required = true, type = Integer.class, nillable = true)
    protected Integer txLinkEfficiency;
    @XmlElement(name = "RxLinkEfficiency", required = true, type = Integer.class, nillable = true)
    protected Integer rxLinkEfficiency;
    @XmlElement(name = "SNR", required = true, type = Integer.class, nillable = true)
    protected Integer snr;
    @XmlElement(name = "TxSignalStrengthChannel0", required = true, type = Integer.class, nillable = true)
    protected Integer txSignalStrengthChannel0;
    @XmlElement(name = "RxSignalStrengthChannel0", required = true, type = Integer.class, nillable = true)
    protected Integer rxSignalStrengthChannel0;
    @XmlElement(name = "TxSignalStrengthChannel1", required = true, type = Integer.class, nillable = true)
    protected Integer txSignalStrengthChannel1;
    @XmlElement(name = "RxSignalStrengthChannel1", required = true, type = Integer.class, nillable = true)
    protected Integer rxSignalStrengthChannel1;
    @XmlElement(name = "TxPhyRate", required = true, type = Float.class, nillable = true)
    protected Float txPhyRate;
    @XmlElement(name = "RxPhyRate", required = true, type = Float.class, nillable = true)
    protected Float rxPhyRate;

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
     *     {@link Integer }
     *     
     */
    public Integer getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFrequency(Integer value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxPower(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getTxLinkEfficiency() {
        return txLinkEfficiency;
    }

    /**
     * Sets the value of the txLinkEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxLinkEfficiency(Integer value) {
        this.txLinkEfficiency = value;
    }

    /**
     * Gets the value of the rxLinkEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxLinkEfficiency() {
        return rxLinkEfficiency;
    }

    /**
     * Sets the value of the rxLinkEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxLinkEfficiency(Integer value) {
        this.rxLinkEfficiency = value;
    }

    /**
     * Gets the value of the snr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSNR() {
        return snr;
    }

    /**
     * Sets the value of the snr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSNR(Integer value) {
        this.snr = value;
    }

    /**
     * Gets the value of the txSignalStrengthChannel0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxSignalStrengthChannel0() {
        return txSignalStrengthChannel0;
    }

    /**
     * Sets the value of the txSignalStrengthChannel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxSignalStrengthChannel0(Integer value) {
        this.txSignalStrengthChannel0 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthChannel0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxSignalStrengthChannel0() {
        return rxSignalStrengthChannel0;
    }

    /**
     * Sets the value of the rxSignalStrengthChannel0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxSignalStrengthChannel0(Integer value) {
        this.rxSignalStrengthChannel0 = value;
    }

    /**
     * Gets the value of the txSignalStrengthChannel1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxSignalStrengthChannel1() {
        return txSignalStrengthChannel1;
    }

    /**
     * Sets the value of the txSignalStrengthChannel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxSignalStrengthChannel1(Integer value) {
        this.txSignalStrengthChannel1 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthChannel1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxSignalStrengthChannel1() {
        return rxSignalStrengthChannel1;
    }

    /**
     * Sets the value of the rxSignalStrengthChannel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxSignalStrengthChannel1(Integer value) {
        this.rxSignalStrengthChannel1 = value;
    }

    /**
     * Gets the value of the txPhyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTxPhyRate() {
        return txPhyRate;
    }

    /**
     * Sets the value of the txPhyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTxPhyRate(Float value) {
        this.txPhyRate = value;
    }

    /**
     * Gets the value of the rxPhyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRxPhyRate() {
        return rxPhyRate;
    }

    /**
     * Sets the value of the rxPhyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRxPhyRate(Float value) {
        this.rxPhyRate = value;
    }

}
