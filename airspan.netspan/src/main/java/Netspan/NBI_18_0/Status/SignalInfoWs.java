
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignalInfoWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignalInfoWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Snr0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Snr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Snr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Snr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SnrTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rssi0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rssi1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rssi2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rssi3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RssiAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxPhyRateMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxPhyRateMbps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalInfoWs", propOrder = {
    "snr0",
    "snr1",
    "snr2",
    "snr3",
    "snrTotal",
    "rssi0",
    "rssi1",
    "rssi2",
    "rssi3",
    "rssiAvg",
    "txPhyRateMbps",
    "rxPhyRateMbps"
})
public class SignalInfoWs {

    @XmlElement(name = "Snr0")
    protected String snr0;
    @XmlElement(name = "Snr1")
    protected String snr1;
    @XmlElement(name = "Snr2")
    protected String snr2;
    @XmlElement(name = "Snr3")
    protected String snr3;
    @XmlElement(name = "SnrTotal")
    protected String snrTotal;
    @XmlElement(name = "Rssi0")
    protected String rssi0;
    @XmlElement(name = "Rssi1")
    protected String rssi1;
    @XmlElement(name = "Rssi2")
    protected String rssi2;
    @XmlElement(name = "Rssi3")
    protected String rssi3;
    @XmlElement(name = "RssiAvg")
    protected String rssiAvg;
    @XmlElement(name = "TxPhyRateMbps")
    protected String txPhyRateMbps;
    @XmlElement(name = "RxPhyRateMbps")
    protected String rxPhyRateMbps;

    /**
     * Gets the value of the snr0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnr0() {
        return snr0;
    }

    /**
     * Sets the value of the snr0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnr0(String value) {
        this.snr0 = value;
    }

    /**
     * Gets the value of the snr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnr1() {
        return snr1;
    }

    /**
     * Sets the value of the snr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnr1(String value) {
        this.snr1 = value;
    }

    /**
     * Gets the value of the snr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnr2() {
        return snr2;
    }

    /**
     * Sets the value of the snr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnr2(String value) {
        this.snr2 = value;
    }

    /**
     * Gets the value of the snr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnr3() {
        return snr3;
    }

    /**
     * Sets the value of the snr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnr3(String value) {
        this.snr3 = value;
    }

    /**
     * Gets the value of the snrTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnrTotal() {
        return snrTotal;
    }

    /**
     * Sets the value of the snrTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnrTotal(String value) {
        this.snrTotal = value;
    }

    /**
     * Gets the value of the rssi0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssi0() {
        return rssi0;
    }

    /**
     * Sets the value of the rssi0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssi0(String value) {
        this.rssi0 = value;
    }

    /**
     * Gets the value of the rssi1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssi1() {
        return rssi1;
    }

    /**
     * Sets the value of the rssi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssi1(String value) {
        this.rssi1 = value;
    }

    /**
     * Gets the value of the rssi2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssi2() {
        return rssi2;
    }

    /**
     * Sets the value of the rssi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssi2(String value) {
        this.rssi2 = value;
    }

    /**
     * Gets the value of the rssi3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssi3() {
        return rssi3;
    }

    /**
     * Sets the value of the rssi3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssi3(String value) {
        this.rssi3 = value;
    }

    /**
     * Gets the value of the rssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssiAvg() {
        return rssiAvg;
    }

    /**
     * Sets the value of the rssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssiAvg(String value) {
        this.rssiAvg = value;
    }

    /**
     * Gets the value of the txPhyRateMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxPhyRateMbps() {
        return txPhyRateMbps;
    }

    /**
     * Sets the value of the txPhyRateMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxPhyRateMbps(String value) {
        this.txPhyRateMbps = value;
    }

    /**
     * Gets the value of the rxPhyRateMbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxPhyRateMbps() {
        return rxPhyRateMbps;
    }

    /**
     * Sets the value of the rxPhyRateMbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxPhyRateMbps(String value) {
        this.rxPhyRateMbps = value;
    }

}
