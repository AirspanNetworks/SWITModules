
package Netspan.NBI_14_50.API.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeTermActiveChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeTermActiveChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Bandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AntennaDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaTxMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaMotorAzimuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AntennaPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RfGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreambleIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreambleCinr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreambleFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MimoMatrix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MimoAntennaCinr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MimoAntennaRssi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPowerTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CurrentPowerPerTone" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LinkLostCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NullingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NullingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NullingCurrentPattern" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NullingCurrentReferencePattern" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NullingQi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeTermActiveChannel", propOrder = {
    "frequency",
    "bandwidth",
    "antennaDirection",
    "antennaTxMode",
    "antennaMotorAzimuth",
    "antennaPort",
    "rfGain",
    "preambleIndex",
    "preambleCinr",
    "preambleFreqOffset",
    "mimoMatrix",
    "mimoAntennaCinr",
    "mimoAntennaRssi",
    "currentPowerTotal",
    "currentPowerPerTone",
    "linkLostCount",
    "nullingState",
    "nullingMode",
    "nullingCurrentPattern",
    "nullingCurrentReferencePattern",
    "nullingQi"
})
public class IBridgeTermActiveChannel {

    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> bandwidth;
    @XmlElement(name = "AntennaDirection")
    protected String antennaDirection;
    @XmlElement(name = "AntennaTxMode")
    protected String antennaTxMode;
    @XmlElement(name = "AntennaMotorAzimuth")
    protected String antennaMotorAzimuth;
    @XmlElementRef(name = "AntennaPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> antennaPort;
    @XmlElementRef(name = "RfGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rfGain;
    @XmlElementRef(name = "PreambleIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleIndex;
    @XmlElementRef(name = "PreambleCinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleCinr;
    @XmlElementRef(name = "PreambleFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> preambleFreqOffset;
    @XmlElement(name = "MimoMatrix")
    protected String mimoMatrix;
    @XmlElement(name = "MimoAntennaCinr")
    protected String mimoAntennaCinr;
    @XmlElement(name = "MimoAntennaRssi")
    protected String mimoAntennaRssi;
    @XmlElementRef(name = "CurrentPowerTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> currentPowerTotal;
    @XmlElementRef(name = "CurrentPowerPerTone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> currentPowerPerTone;
    @XmlElementRef(name = "LinkLostCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkLostCount;
    @XmlElement(name = "NullingState")
    protected String nullingState;
    @XmlElement(name = "NullingMode")
    protected String nullingMode;
    @XmlElementRef(name = "NullingCurrentPattern", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullingCurrentPattern;
    @XmlElementRef(name = "NullingCurrentReferencePattern", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullingCurrentReferencePattern;
    @XmlElementRef(name = "NullingQi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nullingQi;

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
     * Gets the value of the antennaTxMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntennaTxMode() {
        return antennaTxMode;
    }

    /**
     * Sets the value of the antennaTxMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntennaTxMode(String value) {
        this.antennaTxMode = value;
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
     * Gets the value of the mimoMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimoMatrix() {
        return mimoMatrix;
    }

    /**
     * Sets the value of the mimoMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimoMatrix(String value) {
        this.mimoMatrix = value;
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

    /**
     * Gets the value of the currentPowerTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrentPowerTotal() {
        return currentPowerTotal;
    }

    /**
     * Sets the value of the currentPowerTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrentPowerTotal(JAXBElement<Double> value) {
        this.currentPowerTotal = value;
    }

    /**
     * Gets the value of the currentPowerPerTone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCurrentPowerPerTone() {
        return currentPowerPerTone;
    }

    /**
     * Sets the value of the currentPowerPerTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCurrentPowerPerTone(JAXBElement<Double> value) {
        this.currentPowerPerTone = value;
    }

    /**
     * Gets the value of the linkLostCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkLostCount() {
        return linkLostCount;
    }

    /**
     * Sets the value of the linkLostCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkLostCount(JAXBElement<Integer> value) {
        this.linkLostCount = value;
    }

    /**
     * Gets the value of the nullingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingState() {
        return nullingState;
    }

    /**
     * Sets the value of the nullingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingState(String value) {
        this.nullingState = value;
    }

    /**
     * Gets the value of the nullingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullingMode() {
        return nullingMode;
    }

    /**
     * Sets the value of the nullingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullingMode(String value) {
        this.nullingMode = value;
    }

    /**
     * Gets the value of the nullingCurrentPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullingCurrentPattern() {
        return nullingCurrentPattern;
    }

    /**
     * Sets the value of the nullingCurrentPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullingCurrentPattern(JAXBElement<Integer> value) {
        this.nullingCurrentPattern = value;
    }

    /**
     * Gets the value of the nullingCurrentReferencePattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullingCurrentReferencePattern() {
        return nullingCurrentReferencePattern;
    }

    /**
     * Sets the value of the nullingCurrentReferencePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullingCurrentReferencePattern(JAXBElement<Integer> value) {
        this.nullingCurrentReferencePattern = value;
    }

    /**
     * Gets the value of the nullingQi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNullingQi() {
        return nullingQi;
    }

    /**
     * Sets the value of the nullingQi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNullingQi(JAXBElement<Integer> value) {
        this.nullingQi = value;
    }

}
