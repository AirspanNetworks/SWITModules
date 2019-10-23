
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermScannedChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermScannedChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="AntennaDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AntennaMotorAzimuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AntennaPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RfGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChannelQuality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcqMimo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreambleIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreambleCinr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreambleFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SisoZoneAnt0Cinr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimoAntennaCinr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MimoAntennaRssi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermScannedChannel", propOrder = {
    "frequency",
    "bandwidth",
    "antennaDirection",
    "antennaMotorAzimuth",
    "antennaPort",
    "rfGain",
    "channelQuality",
    "acqMimo",
    "preambleIndex",
    "preambleCinr",
    "preambleFreqOffset",
    "sisoZoneAnt0Cinr",
    "mimoAntennaCinr",
    "mimoAntennaRssi"
})
public class IBridgeTermScannedChannel {

    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bandwidth;
    @XmlElement(name = "AntennaDirection")
    protected String antennaDirection;
    @XmlElement(name = "AntennaMotorAzimuth")
    protected String antennaMotorAzimuth;
    @XmlElementRef(name = "AntennaPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaPort;
    @XmlElementRef(name = "RfGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rfGain;
    @XmlElementRef(name = "ChannelQuality", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> channelQuality;
    @XmlElementRef(name = "AcqMimo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acqMimo;
    @XmlElementRef(name = "PreambleIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleIndex;
    @XmlElementRef(name = "PreambleCinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleCinr;
    @XmlElementRef(name = "PreambleFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleFreqOffset;
    @XmlElementRef(name = "SisoZoneAnt0Cinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sisoZoneAnt0Cinr;
    @XmlElement(name = "MimoAntennaCinr")
    protected String mimoAntennaCinr;
    @XmlElement(name = "MimoAntennaRssi")
    protected String mimoAntennaRssi;

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
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBandwidth(JAXBElement<Double> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the antennaDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaDirection() {
        return antennaDirection;
    }

    /**
     * Sets the value of the antennaDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaDirection(String value) {
        this.antennaDirection = value;
    }

    /**
     * Gets the value of the antennaMotorAzimuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaMotorAzimuth() {
        return antennaMotorAzimuth;
    }

    /**
     * Sets the value of the antennaMotorAzimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaMotorAzimuth(String value) {
        this.antennaMotorAzimuth = value;
    }

    /**
     * Gets the value of the antennaPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAntennaPort() {
        return antennaPort;
    }

    /**
     * Sets the value of the antennaPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAntennaPort(JAXBElement<Integer> value) {
        this.antennaPort = value;
    }

    /**
     * Gets the value of the rfGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRfGain() {
        return rfGain;
    }

    /**
     * Sets the value of the rfGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRfGain(JAXBElement<Integer> value) {
        this.rfGain = value;
    }

    /**
     * Gets the value of the channelQuality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getChannelQuality() {
        return channelQuality;
    }

    /**
     * Sets the value of the channelQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setChannelQuality(JAXBElement<Integer> value) {
        this.channelQuality = value;
    }

    /**
     * Gets the value of the acqMimo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcqMimo() {
        return acqMimo;
    }

    /**
     * Sets the value of the acqMimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcqMimo(JAXBElement<Integer> value) {
        this.acqMimo = value;
    }

    /**
     * Gets the value of the preambleIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreambleIndex() {
        return preambleIndex;
    }

    /**
     * Sets the value of the preambleIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreambleIndex(JAXBElement<Integer> value) {
        this.preambleIndex = value;
    }

    /**
     * Gets the value of the preambleCinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreambleCinr() {
        return preambleCinr;
    }

    /**
     * Sets the value of the preambleCinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreambleCinr(JAXBElement<Integer> value) {
        this.preambleCinr = value;
    }

    /**
     * Gets the value of the preambleFreqOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPreambleFreqOffset() {
        return preambleFreqOffset;
    }

    /**
     * Sets the value of the preambleFreqOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPreambleFreqOffset(JAXBElement<Integer> value) {
        this.preambleFreqOffset = value;
    }

    /**
     * Gets the value of the sisoZoneAnt0Cinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSisoZoneAnt0Cinr() {
        return sisoZoneAnt0Cinr;
    }

    /**
     * Sets the value of the sisoZoneAnt0Cinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSisoZoneAnt0Cinr(JAXBElement<Integer> value) {
        this.sisoZoneAnt0Cinr = value;
    }

    /**
     * Gets the value of the mimoAntennaCinr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimoAntennaCinr() {
        return mimoAntennaCinr;
    }

    /**
     * Sets the value of the mimoAntennaCinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimoAntennaCinr(String value) {
        this.mimoAntennaCinr = value;
    }

    /**
     * Gets the value of the mimoAntennaRssi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimoAntennaRssi() {
        return mimoAntennaRssi;
    }

    /**
     * Sets the value of the mimoAntennaRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimoAntennaRssi(String value) {
        this.mimoAntennaRssi = value;
    }

}
