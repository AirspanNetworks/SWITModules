
package Netspan.NBI_14_0.API.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;


/**
 * <p>Java class for LteRadioProfileWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRadioProfileWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte"/>
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DownlinkFreq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UplinkFreq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Band" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DuplexMode" type="{http://Airspan.Netspan.WebServices}DuplexModes"/>
 *         &lt;element name="BandwidthMhz" type="{http://Airspan.Netspan.WebServices}BandwidthsSupported"/>
 *         &lt;element name="MfbiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FrameConfig" type="{http://Airspan.Netspan.WebServices}TddFrameConfigurationsSupported"/>
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SfrEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SfrSegments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SfrIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SfrThresholdType" type="{http://Airspan.Netspan.WebServices}SfrThresholdTypes"/>
 *         &lt;element name="SfrThresholdValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SsfType" type="{http://Airspan.Netspan.WebServices}SsfTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRadioProfileWs", propOrder = {
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
    "ssfType"
})
public class LteRadioProfileWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "HardwareCategory", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CategoriesLte hardwareCategory;
    @XmlElement(name = "Earfcn", required = true, type = Integer.class, nillable = true)
    protected Integer earfcn;
    @XmlElement(name = "DownlinkFreq", required = true, type = Integer.class, nillable = true)
    protected Integer downlinkFreq;
    @XmlElement(name = "UplinkFreq", required = true, type = Integer.class, nillable = true)
    protected Integer uplinkFreq;
    @XmlElement(name = "Band", required = true, type = Integer.class, nillable = true)
    protected Integer band;
    @XmlElement(name = "DuplexMode", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected DuplexModes duplexMode;
    @XmlElement(name = "BandwidthMhz", required = true, nillable = true)
    protected String bandwidthMhz;
    @XmlElement(name = "MfbiEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean mfbiEnabled;
    @XmlElement(name = "FrameConfig", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TddFrameConfigurationsSupported frameConfig;
    @XmlElement(name = "TxPower", required = true, type = Integer.class, nillable = true)
    protected Integer txPower;
    @XmlElement(name = "SfrEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean sfrEnabled;
    @XmlElement(name = "SfrSegments", required = true, type = Integer.class, nillable = true)
    protected Integer sfrSegments;
    @XmlElement(name = "SfrIndex", required = true, type = Integer.class, nillable = true)
    protected Integer sfrIndex;
    @XmlElement(name = "SfrThresholdType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SfrThresholdTypes sfrThresholdType;
    @XmlElement(name = "SfrThresholdValue", required = true, type = Integer.class, nillable = true)
    protected Integer sfrThresholdValue;
    @XmlElement(name = "SsfType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected SsfTypes ssfType;

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
     *     {@link CategoriesLte }
     *     
     */
    public CategoriesLte getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesLte }
     *     
     */
    public void setHardwareCategory(CategoriesLte value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the earfcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEarfcn(Integer value) {
        this.earfcn = value;
    }

    /**
     * Gets the value of the downlinkFreq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDownlinkFreq() {
        return downlinkFreq;
    }

    /**
     * Sets the value of the downlinkFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDownlinkFreq(Integer value) {
        this.downlinkFreq = value;
    }

    /**
     * Gets the value of the uplinkFreq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUplinkFreq() {
        return uplinkFreq;
    }

    /**
     * Sets the value of the uplinkFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUplinkFreq(Integer value) {
        this.uplinkFreq = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBand(Integer value) {
        this.band = value;
    }

    /**
     * Gets the value of the duplexMode property.
     * 
     * @return
     *     possible object is
     *     {@link DuplexModes }
     *     
     */
    public DuplexModes getDuplexMode() {
        return duplexMode;
    }

    /**
     * Sets the value of the duplexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuplexModes }
     *     
     */
    public void setDuplexMode(DuplexModes value) {
        this.duplexMode = value;
    }

    /**
     * Gets the value of the bandwidthMhz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandwidthMhz() {
        return bandwidthMhz;
    }

    /**
     * Sets the value of the bandwidthMhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandwidthMhz(String value) {
        this.bandwidthMhz = value;
    }

    /**
     * Gets the value of the mfbiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMfbiEnabled() {
        return mfbiEnabled;
    }

    /**
     * Sets the value of the mfbiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMfbiEnabled(Boolean value) {
        this.mfbiEnabled = value;
    }

    /**
     * Gets the value of the frameConfig property.
     * 
     * @return
     *     possible object is
     *     {@link TddFrameConfigurationsSupported }
     *     
     */
    public TddFrameConfigurationsSupported getFrameConfig() {
        return frameConfig;
    }

    /**
     * Sets the value of the frameConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TddFrameConfigurationsSupported }
     *     
     */
    public void setFrameConfig(TddFrameConfigurationsSupported value) {
        this.frameConfig = value;
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
     * Gets the value of the sfrEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSfrEnabled() {
        return sfrEnabled;
    }

    /**
     * Sets the value of the sfrEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSfrEnabled(Boolean value) {
        this.sfrEnabled = value;
    }

    /**
     * Gets the value of the sfrSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSfrSegments() {
        return sfrSegments;
    }

    /**
     * Sets the value of the sfrSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSfrSegments(Integer value) {
        this.sfrSegments = value;
    }

    /**
     * Gets the value of the sfrIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSfrIndex() {
        return sfrIndex;
    }

    /**
     * Sets the value of the sfrIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSfrIndex(Integer value) {
        this.sfrIndex = value;
    }

    /**
     * Gets the value of the sfrThresholdType property.
     * 
     * @return
     *     possible object is
     *     {@link SfrThresholdTypes }
     *     
     */
    public SfrThresholdTypes getSfrThresholdType() {
        return sfrThresholdType;
    }

    /**
     * Sets the value of the sfrThresholdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfrThresholdTypes }
     *     
     */
    public void setSfrThresholdType(SfrThresholdTypes value) {
        this.sfrThresholdType = value;
    }

    /**
     * Gets the value of the sfrThresholdValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSfrThresholdValue() {
        return sfrThresholdValue;
    }

    /**
     * Sets the value of the sfrThresholdValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSfrThresholdValue(Integer value) {
        this.sfrThresholdValue = value;
    }

    /**
     * Gets the value of the ssfType property.
     * 
     * @return
     *     possible object is
     *     {@link SsfTypes }
     *     
     */
    public SsfTypes getSsfType() {
        return ssfType;
    }

    /**
     * Sets the value of the ssfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsfTypes }
     *     
     */
    public void setSsfType(SsfTypes value) {
        this.ssfType = value;
    }

}
