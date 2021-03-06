
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EnbRadioProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbRadioProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CbrsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferBand48" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DownlinkFreqKHz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UplinkFreqKHz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Band" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}DuplexModeTypes" minOccurs="0"/>
 *         &lt;element name="BandwidthMhz" type="{http://Airspan.Netspan.WebServices}BandwidthsSupported" minOccurs="0"/>
 *         &lt;element name="MfbiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FrameConfig" type="{http://Airspan.Netspan.WebServices}TddFrameConfigurationsSupported" minOccurs="0"/>
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RmMode" type="{http://Airspan.Netspan.WebServices}ResourceManagementTypes"/>
 *         &lt;element name="SfrSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrThresholdType" type="{http://Airspan.Netspan.WebServices}SfrThresholdTypes" minOccurs="0"/>
 *         &lt;element name="SfrThresholdValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrMaxMcsCellEdge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrMinMcsCellCenter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SsfType" type="{http://Airspan.Netspan.WebServices}SsfTypes" minOccurs="0"/>
 *         &lt;element name="AddlSpectrumEmission" type="{http://Airspan.Netspan.WebServices}AddlSpectrumEmissions" minOccurs="0"/>
 *         &lt;element name="EcidMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="EcidTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtdoaMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="OtdoaPrsBw" type="{http://Airspan.Netspan.WebServices}OtdoaPrsBandwidthsWs" minOccurs="0"/>
 *         &lt;element name="OtdaPrsPeriodicity" type="{http://Airspan.Netspan.WebServices}OtdoaPeriodicitiesWs" minOccurs="0"/>
 *         &lt;element name="OtdaPrsOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OtdoaPrsMutePattSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtdoaPrsMutePeriod" type="{http://Airspan.Netspan.WebServices}OtdoaPrsMutePeriodsWs" minOccurs="0"/>
 *         &lt;element name="OtdoaPrsTxOff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RfSubframes" type="{http://Airspan.Netspan.WebServices}RfSubframe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbRadioProfileParams", propOrder = {
    "cbrsEnabled",
    "preferBand48",
    "earfcn",
    "downlinkFreqKHz",
    "uplinkFreqKHz",
    "band",
    "duplexMode",
    "bandwidthMhz",
    "mfbiEnabled",
    "frameConfig",
    "txPower",
    "rmMode",
    "sfrSegments",
    "sfrIndex",
    "sfrThresholdType",
    "sfrThresholdValue",
    "sfrMaxMcsCellEdge",
    "sfrMinMcsCellCenter",
    "ssfType",
    "addlSpectrumEmission",
    "ecidMode",
    "ecidTimer",
    "otdoaMode",
    "otdoaPrsBw",
    "otdaPrsPeriodicity",
    "otdaPrsOffset",
    "otdoaPrsMutePattSeq",
    "otdoaPrsMutePeriod",
    "otdoaPrsTxOff",
    "rfSubframes"
})
@XmlSeeAlso({
    EnbRadioProfile.class
})
public class EnbRadioProfileParams {

    @XmlElementRef(name = "CbrsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrsEnabled;
    @XmlElementRef(name = "PreferBand48", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preferBand48;
    @XmlElementRef(name = "Earfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcn;
    @XmlElementRef(name = "DownlinkFreqKHz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> downlinkFreqKHz;
    @XmlElementRef(name = "UplinkFreqKHz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uplinkFreqKHz;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> band;
    @XmlElementRef(name = "DuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DuplexModeTypes> duplexMode;
    @XmlElementRef(name = "BandwidthMhz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidthMhz;
    @XmlElementRef(name = "MfbiEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mfbiEnabled;
    @XmlElementRef(name = "FrameConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TddFrameConfigurationsSupported> frameConfig;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower;
    @XmlElement(name = "RmMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ResourceManagementTypes rmMode;
    @XmlElementRef(name = "SfrSegments", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrSegments;
    @XmlElementRef(name = "SfrIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrIndex;
    @XmlElementRef(name = "SfrThresholdType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfrThresholdTypes> sfrThresholdType;
    @XmlElementRef(name = "SfrThresholdValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrThresholdValue;
    @XmlElementRef(name = "SfrMaxMcsCellEdge", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrMaxMcsCellEdge;
    @XmlElementRef(name = "SfrMinMcsCellCenter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrMinMcsCellCenter;
    @XmlElementRef(name = "SsfType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SsfTypes> ssfType;
    @XmlElementRef(name = "AddlSpectrumEmission", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AddlSpectrumEmissions> addlSpectrumEmission;
    @XmlElementRef(name = "EcidMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> ecidMode;
    @XmlElementRef(name = "EcidTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ecidTimer;
    @XmlElementRef(name = "OtdoaMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> otdoaMode;
    @XmlElementRef(name = "OtdoaPrsBw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otdoaPrsBw;
    @XmlElementRef(name = "OtdaPrsPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otdaPrsPeriodicity;
    @XmlElementRef(name = "OtdaPrsOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdaPrsOffset;
    @XmlElement(name = "OtdoaPrsMutePattSeq")
    protected String otdoaPrsMutePattSeq;
    @XmlElementRef(name = "OtdoaPrsMutePeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otdoaPrsMutePeriod;
    @XmlElementRef(name = "OtdoaPrsTxOff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> otdoaPrsTxOff;
    @XmlElement(name = "RfSubframes")
    protected RfSubframe rfSubframes;

    /**
     * Gets the value of the cbrsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrsEnabled() {
        return cbrsEnabled;
    }

    /**
     * Sets the value of the cbrsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrsEnabled(JAXBElement<Boolean> value) {
        this.cbrsEnabled = value;
    }

    /**
     * Gets the value of the preferBand48 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreferBand48() {
        return preferBand48;
    }

    /**
     * Sets the value of the preferBand48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreferBand48(JAXBElement<Boolean> value) {
        this.preferBand48 = value;
    }

    /**
     * Gets the value of the earfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcn(JAXBElement<Integer> value) {
        this.earfcn = value;
    }

    /**
     * Gets the value of the downlinkFreqKHz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDownlinkFreqKHz() {
        return downlinkFreqKHz;
    }

    /**
     * Sets the value of the downlinkFreqKHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDownlinkFreqKHz(JAXBElement<Integer> value) {
        this.downlinkFreqKHz = value;
    }

    /**
     * Gets the value of the uplinkFreqKHz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUplinkFreqKHz() {
        return uplinkFreqKHz;
    }

    /**
     * Sets the value of the uplinkFreqKHz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUplinkFreqKHz(JAXBElement<Integer> value) {
        this.uplinkFreqKHz = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBand(JAXBElement<Integer> value) {
        this.band = value;
    }

    /**
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DuplexModeTypes }{@code >}
     *     
     */
    public JAXBElement<DuplexModeTypes> getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DuplexModeTypes }{@code >}
     *     
     */
    public void setDuplexMode(JAXBElement<DuplexModeTypes> value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the bandwidthMhz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBandwidthMhz() {
        return bandwidthMhz;
    }

    /**
     * Sets the value of the bandwidthMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBandwidthMhz(JAXBElement<String> value) {
        this.bandwidthMhz = value;
    }

    /**
     * Gets the value of the mfbiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMfbiEnabled() {
        return mfbiEnabled;
    }

    /**
     * Sets the value of the mfbiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMfbiEnabled(JAXBElement<Boolean> value) {
        this.mfbiEnabled = value;
    }

    /**
     * Gets the value of the frameConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TddFrameConfigurationsSupported }{@code >}
     *     
     */
    public JAXBElement<TddFrameConfigurationsSupported> getFrameConfig() {
        return frameConfig;
    }

    /**
     * Sets the value of the frameConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TddFrameConfigurationsSupported }{@code >}
     *     
     */
    public void setFrameConfig(JAXBElement<TddFrameConfigurationsSupported> value) {
        this.frameConfig = value;
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
     * Gets the value of the rmMode property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceManagementTypes }
     *     
     */
    public ResourceManagementTypes getRmMode() {
        return rmMode;
    }

    /**
     * Sets the value of the rmMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceManagementTypes }
     *     
     */
    public void setRmMode(ResourceManagementTypes value) {
        this.rmMode = value;
    }

    /**
     * Gets the value of the sfrSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfrSegments() {
        return sfrSegments;
    }

    /**
     * Sets the value of the sfrSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfrSegments(JAXBElement<Integer> value) {
        this.sfrSegments = value;
    }

    /**
     * Gets the value of the sfrIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfrIndex() {
        return sfrIndex;
    }

    /**
     * Sets the value of the sfrIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfrIndex(JAXBElement<Integer> value) {
        this.sfrIndex = value;
    }

    /**
     * Gets the value of the sfrThresholdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SfrThresholdTypes }{@code >}
     *     
     */
    public JAXBElement<SfrThresholdTypes> getSfrThresholdType() {
        return sfrThresholdType;
    }

    /**
     * Sets the value of the sfrThresholdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SfrThresholdTypes }{@code >}
     *     
     */
    public void setSfrThresholdType(JAXBElement<SfrThresholdTypes> value) {
        this.sfrThresholdType = value;
    }

    /**
     * Gets the value of the sfrThresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfrThresholdValue() {
        return sfrThresholdValue;
    }

    /**
     * Sets the value of the sfrThresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfrThresholdValue(JAXBElement<Integer> value) {
        this.sfrThresholdValue = value;
    }

    /**
     * Gets the value of the sfrMaxMcsCellEdge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfrMaxMcsCellEdge() {
        return sfrMaxMcsCellEdge;
    }

    /**
     * Sets the value of the sfrMaxMcsCellEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfrMaxMcsCellEdge(JAXBElement<Integer> value) {
        this.sfrMaxMcsCellEdge = value;
    }

    /**
     * Gets the value of the sfrMinMcsCellCenter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfrMinMcsCellCenter() {
        return sfrMinMcsCellCenter;
    }

    /**
     * Sets the value of the sfrMinMcsCellCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfrMinMcsCellCenter(JAXBElement<Integer> value) {
        this.sfrMinMcsCellCenter = value;
    }

    /**
     * Gets the value of the ssfType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SsfTypes }{@code >}
     *     
     */
    public JAXBElement<SsfTypes> getSsfType() {
        return ssfType;
    }

    /**
     * Sets the value of the ssfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SsfTypes }{@code >}
     *     
     */
    public void setSsfType(JAXBElement<SsfTypes> value) {
        this.ssfType = value;
    }

    /**
     * Gets the value of the addlSpectrumEmission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddlSpectrumEmissions }{@code >}
     *     
     */
    public JAXBElement<AddlSpectrumEmissions> getAddlSpectrumEmission() {
        return addlSpectrumEmission;
    }

    /**
     * Sets the value of the addlSpectrumEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddlSpectrumEmissions }{@code >}
     *     
     */
    public void setAddlSpectrumEmission(JAXBElement<AddlSpectrumEmissions> value) {
        this.addlSpectrumEmission = value;
    }

    /**
     * Gets the value of the ecidMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getEcidMode() {
        return ecidMode;
    }

    /**
     * Sets the value of the ecidMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setEcidMode(JAXBElement<EnabledStates> value) {
        this.ecidMode = value;
    }

    /**
     * Gets the value of the ecidTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEcidTimer() {
        return ecidTimer;
    }

    /**
     * Sets the value of the ecidTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEcidTimer(JAXBElement<Integer> value) {
        this.ecidTimer = value;
    }

    /**
     * Gets the value of the otdoaMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getOtdoaMode() {
        return otdoaMode;
    }

    /**
     * Sets the value of the otdoaMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setOtdoaMode(JAXBElement<EnabledStates> value) {
        this.otdoaMode = value;
    }

    /**
     * Gets the value of the otdoaPrsBw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtdoaPrsBw() {
        return otdoaPrsBw;
    }

    /**
     * Sets the value of the otdoaPrsBw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtdoaPrsBw(JAXBElement<String> value) {
        this.otdoaPrsBw = value;
    }

    /**
     * Gets the value of the otdaPrsPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtdaPrsPeriodicity() {
        return otdaPrsPeriodicity;
    }

    /**
     * Sets the value of the otdaPrsPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtdaPrsPeriodicity(JAXBElement<String> value) {
        this.otdaPrsPeriodicity = value;
    }

    /**
     * Gets the value of the otdaPrsOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdaPrsOffset() {
        return otdaPrsOffset;
    }

    /**
     * Sets the value of the otdaPrsOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdaPrsOffset(JAXBElement<Integer> value) {
        this.otdaPrsOffset = value;
    }

    /**
     * Gets the value of the otdoaPrsMutePattSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtdoaPrsMutePattSeq() {
        return otdoaPrsMutePattSeq;
    }

    /**
     * Sets the value of the otdoaPrsMutePattSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtdoaPrsMutePattSeq(String value) {
        this.otdoaPrsMutePattSeq = value;
    }

    /**
     * Gets the value of the otdoaPrsMutePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtdoaPrsMutePeriod() {
        return otdoaPrsMutePeriod;
    }

    /**
     * Sets the value of the otdoaPrsMutePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtdoaPrsMutePeriod(JAXBElement<String> value) {
        this.otdoaPrsMutePeriod = value;
    }

    /**
     * Gets the value of the otdoaPrsTxOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOtdoaPrsTxOff() {
        return otdoaPrsTxOff;
    }

    /**
     * Sets the value of the otdoaPrsTxOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOtdoaPrsTxOff(JAXBElement<Integer> value) {
        this.otdoaPrsTxOff = value;
    }

    /**
     * Gets the value of the rfSubframes property.
     * 
     * @return
     *     possible object is
     *     {@link RfSubframe }
     *     
     */
    public RfSubframe getRfSubframes() {
        return rfSubframes;
    }

    /**
     * Sets the value of the rfSubframes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RfSubframe }
     *     
     */
    public void setRfSubframes(RfSubframe value) {
        this.rfSubframes = value;
    }

}
