
package Netspan.NBI_18_0.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewSignalMeterStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewSignalMeterStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rssi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PhyTxMbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PhyRxMbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MacTxMbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MacRxMbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CenterFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CenterWidthMhz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxPowerDbm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LinkLengthM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewSignalMeterStatusWs", propOrder = {
    "rssi",
    "phyTxMbps",
    "phyRxMbps",
    "macTxMbps",
    "macRxMbps",
    "centerFrequency",
    "centerWidthMhz",
    "txPowerDbm",
    "linkLengthM"
})
public class IBridge2OverviewSignalMeterStatusWs {

    @XmlElementRef(name = "Rssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi;
    @XmlElementRef(name = "PhyTxMbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> phyTxMbps;
    @XmlElementRef(name = "PhyRxMbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> phyRxMbps;
    @XmlElementRef(name = "MacTxMbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> macTxMbps;
    @XmlElementRef(name = "MacRxMbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> macRxMbps;
    @XmlElement(name = "CenterFrequency")
    protected String centerFrequency;
    @XmlElement(name = "CenterWidthMhz")
    protected String centerWidthMhz;
    @XmlElementRef(name = "TxPowerDbm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> txPowerDbm;
    @XmlElementRef(name = "LinkLengthM", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> linkLengthM;

    /**
     * Gets the value of the rssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi() {
        return rssi;
    }

    /**
     * Sets the value of the rssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi(JAXBElement<Double> value) {
        this.rssi = value;
    }

    /**
     * Gets the value of the phyTxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPhyTxMbps() {
        return phyTxMbps;
    }

    /**
     * Sets the value of the phyTxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPhyTxMbps(JAXBElement<Double> value) {
        this.phyTxMbps = value;
    }

    /**
     * Gets the value of the phyRxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPhyRxMbps() {
        return phyRxMbps;
    }

    /**
     * Sets the value of the phyRxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPhyRxMbps(JAXBElement<Double> value) {
        this.phyRxMbps = value;
    }

    /**
     * Gets the value of the macTxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMacTxMbps() {
        return macTxMbps;
    }

    /**
     * Sets the value of the macTxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMacTxMbps(JAXBElement<Double> value) {
        this.macTxMbps = value;
    }

    /**
     * Gets the value of the macRxMbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMacRxMbps() {
        return macRxMbps;
    }

    /**
     * Sets the value of the macRxMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMacRxMbps(JAXBElement<Double> value) {
        this.macRxMbps = value;
    }

    /**
     * Gets the value of the centerFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterFrequency() {
        return centerFrequency;
    }

    /**
     * Sets the value of the centerFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterFrequency(String value) {
        this.centerFrequency = value;
    }

    /**
     * Gets the value of the centerWidthMhz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterWidthMhz() {
        return centerWidthMhz;
    }

    /**
     * Sets the value of the centerWidthMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterWidthMhz(String value) {
        this.centerWidthMhz = value;
    }

    /**
     * Gets the value of the txPowerDbm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTxPowerDbm() {
        return txPowerDbm;
    }

    /**
     * Sets the value of the txPowerDbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTxPowerDbm(JAXBElement<BigDecimal> value) {
        this.txPowerDbm = value;
    }

    /**
     * Gets the value of the linkLengthM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLinkLengthM() {
        return linkLengthM;
    }

    /**
     * Sets the value of the linkLengthM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLinkLengthM(JAXBElement<BigDecimal> value) {
        this.linkLengthM = value;
    }

}
