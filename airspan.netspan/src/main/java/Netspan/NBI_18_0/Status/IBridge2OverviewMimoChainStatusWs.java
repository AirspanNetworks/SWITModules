
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewMimoChainStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewMimoChainStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChainId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Rssi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RxNoiseDbm" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="RxMaxNoiseDbm" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="CinrDb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CenterFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Polarization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewMimoChainStatusWs", propOrder = {
    "chainId",
    "rssi",
    "rxNoiseDbm",
    "rxMaxNoiseDbm",
    "cinrDb",
    "centerFreq",
    "polarization"
})
public class IBridge2OverviewMimoChainStatusWs {

    @XmlElement(name = "ChainId")
    protected int chainId;
    @XmlElement(name = "Rssi")
    protected String rssi;
    @XmlElement(name = "RxNoiseDbm")
    protected double rxNoiseDbm;
    @XmlElement(name = "RxMaxNoiseDbm")
    protected double rxMaxNoiseDbm;
    @XmlElement(name = "CinrDb")
    protected int cinrDb;
    @XmlElement(name = "CenterFreq")
    protected String centerFreq;
    @XmlElementRef(name = "Polarization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> polarization;

    /**
     * Gets the value of the chainId property.
     * 
     */
    public int getChainId() {
        return chainId;
    }

    /**
     * Sets the value of the chainId property.
     * 
     */
    public void setChainId(int value) {
        this.chainId = value;
    }

    /**
     * Gets the value of the rssi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRssi() {
        return rssi;
    }

    /**
     * Sets the value of the rssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRssi(String value) {
        this.rssi = value;
    }

    /**
     * Gets the value of the rxNoiseDbm property.
     * 
     */
    public double getRxNoiseDbm() {
        return rxNoiseDbm;
    }

    /**
     * Sets the value of the rxNoiseDbm property.
     * 
     */
    public void setRxNoiseDbm(double value) {
        this.rxNoiseDbm = value;
    }

    /**
     * Gets the value of the rxMaxNoiseDbm property.
     * 
     */
    public double getRxMaxNoiseDbm() {
        return rxMaxNoiseDbm;
    }

    /**
     * Sets the value of the rxMaxNoiseDbm property.
     * 
     */
    public void setRxMaxNoiseDbm(double value) {
        this.rxMaxNoiseDbm = value;
    }

    /**
     * Gets the value of the cinrDb property.
     * 
     */
    public int getCinrDb() {
        return cinrDb;
    }

    /**
     * Sets the value of the cinrDb property.
     * 
     */
    public void setCinrDb(int value) {
        this.cinrDb = value;
    }

    /**
     * Gets the value of the centerFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterFreq() {
        return centerFreq;
    }

    /**
     * Sets the value of the centerFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterFreq(String value) {
        this.centerFreq = value;
    }

    /**
     * Gets the value of the polarization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPolarization() {
        return polarization;
    }

    /**
     * Sets the value of the polarization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPolarization(JAXBElement<Integer> value) {
        this.polarization = value;
    }

}
