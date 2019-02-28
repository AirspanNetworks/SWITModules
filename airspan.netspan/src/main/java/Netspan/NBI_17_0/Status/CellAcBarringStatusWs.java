
package Netspan.NBI_17_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellAcBarringStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellAcBarringStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CellBarred" type="{http://Airspan.Netspan.WebServices}CellBarringModes" minOccurs="0"/&gt;
 *         &lt;element name="FactorVoiceR9" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeVoiceR9" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAcVoiceR9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FactorVideoR9" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeVideoR9" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAcVideoR9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FactorCsfbR10" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeCsfbR10" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAcCsfbR10" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Emergency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FactorSig" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeSig" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAcSig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FactorDat" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="TimeDat" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="SpecialAcDat" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VoiceR9Pres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VideoR9Pres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CsfbR10BarringnPres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoSigPres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoDatPres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoSigVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoDatVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoVoiceVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoVideoVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InfoCsfbVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellAcBarringStatusWs", propOrder = {
    "cellNumber",
    "cellBarred",
    "factorVoiceR9",
    "timeVoiceR9",
    "specialAcVoiceR9",
    "factorVideoR9",
    "timeVideoR9",
    "specialAcVideoR9",
    "factorCsfbR10",
    "timeCsfbR10",
    "specialAcCsfbR10",
    "emergency",
    "factorSig",
    "timeSig",
    "specialAcSig",
    "factorDat",
    "timeDat",
    "specialAcDat",
    "voiceR9Pres",
    "videoR9Pres",
    "csfbR10BarringnPres",
    "infoSigPres",
    "infoDatPres",
    "infoSigVal",
    "infoDatVal",
    "infoVoiceVal",
    "infoVideoVal",
    "infoCsfbVal"
})
public class CellAcBarringStatusWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElementRef(name = "CellBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CellBarringModes> cellBarred;
    @XmlElementRef(name = "FactorVoiceR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorVoiceR9;
    @XmlElementRef(name = "TimeVoiceR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeVoiceR9;
    @XmlElementRef(name = "SpecialAcVoiceR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specialAcVoiceR9;
    @XmlElementRef(name = "FactorVideoR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorVideoR9;
    @XmlElementRef(name = "TimeVideoR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeVideoR9;
    @XmlElementRef(name = "SpecialAcVideoR9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specialAcVideoR9;
    @XmlElementRef(name = "FactorCsfbR10", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorCsfbR10;
    @XmlElementRef(name = "TimeCsfbR10", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeCsfbR10;
    @XmlElementRef(name = "SpecialAcCsfbR10", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specialAcCsfbR10;
    @XmlElementRef(name = "Emergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> emergency;
    @XmlElementRef(name = "FactorSig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorSig;
    @XmlElementRef(name = "TimeSig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeSig;
    @XmlElementRef(name = "SpecialAcSig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specialAcSig;
    @XmlElementRef(name = "FactorDat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorDat;
    @XmlElementRef(name = "TimeDat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeDat;
    @XmlElementRef(name = "SpecialAcDat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specialAcDat;
    @XmlElementRef(name = "VoiceR9Pres", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> voiceR9Pres;
    @XmlElementRef(name = "VideoR9Pres", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> videoR9Pres;
    @XmlElementRef(name = "CsfbR10BarringnPres", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbR10BarringnPres;
    @XmlElementRef(name = "InfoSigPres", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoSigPres;
    @XmlElementRef(name = "InfoDatPres", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoDatPres;
    @XmlElementRef(name = "InfoSigVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoSigVal;
    @XmlElementRef(name = "InfoDatVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoDatVal;
    @XmlElementRef(name = "InfoVoiceVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoVoiceVal;
    @XmlElementRef(name = "InfoVideoVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoVideoVal;
    @XmlElementRef(name = "InfoCsfbVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> infoCsfbVal;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the cellBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellBarringModes }{@code >}
     *     
     */
    public JAXBElement<CellBarringModes> getCellBarred() {
        return cellBarred;
    }

    /**
     * Sets the value of the cellBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellBarringModes }{@code >}
     *     
     */
    public void setCellBarred(JAXBElement<CellBarringModes> value) {
        this.cellBarred = value;
    }

    /**
     * Gets the value of the factorVoiceR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorVoiceR9() {
        return factorVoiceR9;
    }

    /**
     * Sets the value of the factorVoiceR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorVoiceR9(JAXBElement<String> value) {
        this.factorVoiceR9 = value;
    }

    /**
     * Gets the value of the timeVoiceR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeVoiceR9() {
        return timeVoiceR9;
    }

    /**
     * Sets the value of the timeVoiceR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeVoiceR9(JAXBElement<String> value) {
        this.timeVoiceR9 = value;
    }

    /**
     * Gets the value of the specialAcVoiceR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecialAcVoiceR9() {
        return specialAcVoiceR9;
    }

    /**
     * Sets the value of the specialAcVoiceR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecialAcVoiceR9(JAXBElement<Integer> value) {
        this.specialAcVoiceR9 = value;
    }

    /**
     * Gets the value of the factorVideoR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorVideoR9() {
        return factorVideoR9;
    }

    /**
     * Sets the value of the factorVideoR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorVideoR9(JAXBElement<String> value) {
        this.factorVideoR9 = value;
    }

    /**
     * Gets the value of the timeVideoR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeVideoR9() {
        return timeVideoR9;
    }

    /**
     * Sets the value of the timeVideoR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeVideoR9(JAXBElement<String> value) {
        this.timeVideoR9 = value;
    }

    /**
     * Gets the value of the specialAcVideoR9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecialAcVideoR9() {
        return specialAcVideoR9;
    }

    /**
     * Sets the value of the specialAcVideoR9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecialAcVideoR9(JAXBElement<Integer> value) {
        this.specialAcVideoR9 = value;
    }

    /**
     * Gets the value of the factorCsfbR10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorCsfbR10() {
        return factorCsfbR10;
    }

    /**
     * Sets the value of the factorCsfbR10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorCsfbR10(JAXBElement<String> value) {
        this.factorCsfbR10 = value;
    }

    /**
     * Gets the value of the timeCsfbR10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeCsfbR10() {
        return timeCsfbR10;
    }

    /**
     * Sets the value of the timeCsfbR10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeCsfbR10(JAXBElement<String> value) {
        this.timeCsfbR10 = value;
    }

    /**
     * Gets the value of the specialAcCsfbR10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecialAcCsfbR10() {
        return specialAcCsfbR10;
    }

    /**
     * Sets the value of the specialAcCsfbR10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecialAcCsfbR10(JAXBElement<Integer> value) {
        this.specialAcCsfbR10 = value;
    }

    /**
     * Gets the value of the emergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEmergency() {
        return emergency;
    }

    /**
     * Sets the value of the emergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEmergency(JAXBElement<Boolean> value) {
        this.emergency = value;
    }

    /**
     * Gets the value of the factorSig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorSig() {
        return factorSig;
    }

    /**
     * Sets the value of the factorSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorSig(JAXBElement<String> value) {
        this.factorSig = value;
    }

    /**
     * Gets the value of the timeSig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeSig() {
        return timeSig;
    }

    /**
     * Sets the value of the timeSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeSig(JAXBElement<String> value) {
        this.timeSig = value;
    }

    /**
     * Gets the value of the specialAcSig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecialAcSig() {
        return specialAcSig;
    }

    /**
     * Sets the value of the specialAcSig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecialAcSig(JAXBElement<Integer> value) {
        this.specialAcSig = value;
    }

    /**
     * Gets the value of the factorDat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorDat() {
        return factorDat;
    }

    /**
     * Sets the value of the factorDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorDat(JAXBElement<String> value) {
        this.factorDat = value;
    }

    /**
     * Gets the value of the timeDat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeDat() {
        return timeDat;
    }

    /**
     * Sets the value of the timeDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeDat(JAXBElement<String> value) {
        this.timeDat = value;
    }

    /**
     * Gets the value of the specialAcDat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecialAcDat() {
        return specialAcDat;
    }

    /**
     * Sets the value of the specialAcDat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecialAcDat(JAXBElement<Integer> value) {
        this.specialAcDat = value;
    }

    /**
     * Gets the value of the voiceR9Pres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVoiceR9Pres() {
        return voiceR9Pres;
    }

    /**
     * Sets the value of the voiceR9Pres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVoiceR9Pres(JAXBElement<Integer> value) {
        this.voiceR9Pres = value;
    }

    /**
     * Gets the value of the videoR9Pres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVideoR9Pres() {
        return videoR9Pres;
    }

    /**
     * Sets the value of the videoR9Pres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVideoR9Pres(JAXBElement<Integer> value) {
        this.videoR9Pres = value;
    }

    /**
     * Gets the value of the csfbR10BarringnPres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbR10BarringnPres() {
        return csfbR10BarringnPres;
    }

    /**
     * Sets the value of the csfbR10BarringnPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbR10BarringnPres(JAXBElement<Integer> value) {
        this.csfbR10BarringnPres = value;
    }

    /**
     * Gets the value of the infoSigPres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoSigPres() {
        return infoSigPres;
    }

    /**
     * Sets the value of the infoSigPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoSigPres(JAXBElement<Integer> value) {
        this.infoSigPres = value;
    }

    /**
     * Gets the value of the infoDatPres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoDatPres() {
        return infoDatPres;
    }

    /**
     * Sets the value of the infoDatPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoDatPres(JAXBElement<Integer> value) {
        this.infoDatPres = value;
    }

    /**
     * Gets the value of the infoSigVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoSigVal() {
        return infoSigVal;
    }

    /**
     * Sets the value of the infoSigVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoSigVal(JAXBElement<Integer> value) {
        this.infoSigVal = value;
    }

    /**
     * Gets the value of the infoDatVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoDatVal() {
        return infoDatVal;
    }

    /**
     * Sets the value of the infoDatVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoDatVal(JAXBElement<Integer> value) {
        this.infoDatVal = value;
    }

    /**
     * Gets the value of the infoVoiceVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoVoiceVal() {
        return infoVoiceVal;
    }

    /**
     * Sets the value of the infoVoiceVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoVoiceVal(JAXBElement<Integer> value) {
        this.infoVoiceVal = value;
    }

    /**
     * Gets the value of the infoVideoVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoVideoVal() {
        return infoVideoVal;
    }

    /**
     * Sets the value of the infoVideoVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoVideoVal(JAXBElement<Integer> value) {
        this.infoVideoVal = value;
    }

    /**
     * Gets the value of the infoCsfbVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInfoCsfbVal() {
        return infoCsfbVal;
    }

    /**
     * Sets the value of the infoCsfbVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInfoCsfbVal(JAXBElement<Integer> value) {
        this.infoCsfbVal = value;
    }

}
