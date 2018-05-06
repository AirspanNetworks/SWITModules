
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for EnbRadioProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbRadioProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DownlinkFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UplinkFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Band" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}RfProfileDuplexModes" minOccurs="0"/>
 *         &lt;element name="BandwidthMhz" type="{http://Airspan.Netspan.WebServices}BandwidthsSupported" minOccurs="0"/>
 *         &lt;element name="MfbiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FrameConfig" type="{http://Airspan.Netspan.WebServices}TddFrameConfigurationsSupported" minOccurs="0"/>
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SfrSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SfrThresholdType" type="{http://Airspan.Netspan.WebServices}SfrThresholdTypes" minOccurs="0"/>
 *         &lt;element name="SfrThresholdValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SsfType" type="{http://Airspan.Netspan.WebServices}SsfTypes" minOccurs="0"/>
 *         &lt;element name="AddlSpectrumEmission" type="{http://Airspan.Netspan.WebServices}AddlSpectrumEmissions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbRadioProfile", propOrder = {
    "name",
    "hardwareCategory",
    "earfcn",
    "downlinkFreq",
    "uplinkFreq",
    "band",
    "duplexMode",
    "bandwidthMhz",
    "mfbiEnabled",
    "frameConfig",
    "txPower",
    "sfrEnabled",
    "sfrSegments",
    "sfrIndex",
    "sfrThresholdType",
    "sfrThresholdValue",
    "ssfType",
    "addlSpectrumEmission"
})
public class EnbRadioProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElementRef(name = "Earfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcn;
    @XmlElementRef(name = "DownlinkFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> downlinkFreq;
    @XmlElementRef(name = "UplinkFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> uplinkFreq;
    @XmlElementRef(name = "Band", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> band;
    @XmlElementRef(name = "DuplexMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RfProfileDuplexModes> duplexMode;
    @XmlElementRef(name = "BandwidthMhz", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidthMhz;
    @XmlElementRef(name = "MfbiEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mfbiEnabled;
    @XmlElementRef(name = "FrameConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TddFrameConfigurationsSupported> frameConfig;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPower;
    @XmlElementRef(name = "SfrEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sfrEnabled;
    @XmlElementRef(name = "SfrSegments", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrSegments;
    @XmlElementRef(name = "SfrIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrIndex;
    @XmlElementRef(name = "SfrThresholdType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SfrThresholdTypes> sfrThresholdType;
    @XmlElementRef(name = "SfrThresholdValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfrThresholdValue;
    @XmlElementRef(name = "SsfType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SsfTypes> ssfType;
    @XmlElementRef(name = "AddlSpectrumEmission", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AddlSpectrumEmissions> addlSpectrumEmission;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
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
     * Gets the value of the downlinkFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDownlinkFreq() {
        return downlinkFreq;
    }

    /**
     * Sets the value of the downlinkFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDownlinkFreq(JAXBElement<Integer> value) {
        this.downlinkFreq = value;
    }

    /**
     * Gets the value of the uplinkFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUplinkFreq() {
        return uplinkFreq;
    }

    /**
     * Sets the value of the uplinkFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUplinkFreq(JAXBElement<Integer> value) {
        this.uplinkFreq = value;
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
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public JAXBElement<RfProfileDuplexModes> getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}
     *     
     */
    public void setDuplexMode(JAXBElement<RfProfileDuplexModes> value) {
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
     * Gets the value of the sfrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSfrEnabled() {
        return sfrEnabled;
    }

    /**
     * Sets the value of the sfrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSfrEnabled(JAXBElement<Boolean> value) {
        this.sfrEnabled = value;
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

}
