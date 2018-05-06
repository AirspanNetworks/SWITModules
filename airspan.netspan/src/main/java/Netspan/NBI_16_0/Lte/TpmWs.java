
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpmWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpmWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TpmCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TpmCycle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MroCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MroCycle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LongDormancyIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LongDormancy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PowerChangeThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerChangeThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinIntraFreqHoAtmpToReduceTxPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinIntraFreqHoAtmpToReduceTxPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MobFailMetricDecPowerThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MobFailMetricDecPowerThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HighHoFailRateThreshIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighHoFailRateThresh" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DecreaseDeltaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DecreaseDelta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IncreaseDeltaIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IncreaseDelta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxAllowedPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxAllowedPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinAllowedPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinAllowedPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoFailThreshForIncrPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoFailThreshForIncrPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InterFreqCoverageHoleWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InterFreqCoverageHoleWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RlfReportCoverageHoleWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RlfReportCoverageHoleWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NlPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NlPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraFreqRSRPThreshNghCellIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntraFreqRSRPThreshNghCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IntraFreqRSRPThreshServCellIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntraFreqRSRPThreshServCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpmWs", propOrder = {
    "tpmCycleIsDefault",
    "tpmCycle",
    "mroCycleIsDefault",
    "mroCycle",
    "longDormancyIsDefault",
    "longDormancy",
    "powerChangeThresholdIsDefault",
    "powerChangeThreshold",
    "minIntraFreqHoAtmpToReduceTxPowerIsDefault",
    "minIntraFreqHoAtmpToReduceTxPower",
    "mobFailMetricDecPowerThreshIsDefault",
    "mobFailMetricDecPowerThresh",
    "highHoFailRateThreshIsDefault",
    "highHoFailRateThresh",
    "decreaseDeltaIsDefault",
    "decreaseDelta",
    "increaseDeltaIsDefault",
    "increaseDelta",
    "maxAllowedPowerIsDefault",
    "maxAllowedPower",
    "minAllowedPowerIsDefault",
    "minAllowedPower",
    "hoFailThreshForIncrPowerIsDefault",
    "hoFailThreshForIncrPower",
    "interFreqCoverageHoleWeightIsDefault",
    "interFreqCoverageHoleWeight",
    "rlfReportCoverageHoleWeightIsDefault",
    "rlfReportCoverageHoleWeight",
    "nlPeriodIsDefault",
    "nlPeriod",
    "intraFreqRSRPThreshNghCellIsDefault",
    "intraFreqRSRPThreshNghCell",
    "intraFreqRSRPThreshServCellIsDefault",
    "intraFreqRSRPThreshServCell"
})
public class TpmWs {

    @XmlElement(name = "TpmCycleIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean tpmCycleIsDefault;
    @XmlElement(name = "TpmCycle", required = true, type = Integer.class, nillable = true)
    protected Integer tpmCycle;
    @XmlElement(name = "MroCycleIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean mroCycleIsDefault;
    @XmlElement(name = "MroCycle", required = true, type = Integer.class, nillable = true)
    protected Integer mroCycle;
    @XmlElementRef(name = "LongDormancyIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> longDormancyIsDefault;
    @XmlElement(name = "LongDormancy", required = true, type = Integer.class, nillable = true)
    protected Integer longDormancy;
    @XmlElementRef(name = "PowerChangeThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerChangeThresholdIsDefault;
    @XmlElement(name = "PowerChangeThreshold", required = true, type = Integer.class, nillable = true)
    protected Integer powerChangeThreshold;
    @XmlElementRef(name = "MinIntraFreqHoAtmpToReduceTxPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minIntraFreqHoAtmpToReduceTxPowerIsDefault;
    @XmlElement(name = "MinIntraFreqHoAtmpToReduceTxPower", required = true, type = Integer.class, nillable = true)
    protected Integer minIntraFreqHoAtmpToReduceTxPower;
    @XmlElementRef(name = "MobFailMetricDecPowerThreshIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mobFailMetricDecPowerThreshIsDefault;
    @XmlElement(name = "MobFailMetricDecPowerThresh", required = true, type = Integer.class, nillable = true)
    protected Integer mobFailMetricDecPowerThresh;
    @XmlElementRef(name = "HighHoFailRateThreshIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> highHoFailRateThreshIsDefault;
    @XmlElement(name = "HighHoFailRateThresh", required = true, type = Integer.class, nillable = true)
    protected Integer highHoFailRateThresh;
    @XmlElementRef(name = "DecreaseDeltaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> decreaseDeltaIsDefault;
    @XmlElement(name = "DecreaseDelta", required = true, type = Integer.class, nillable = true)
    protected Integer decreaseDelta;
    @XmlElementRef(name = "IncreaseDeltaIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> increaseDeltaIsDefault;
    @XmlElement(name = "IncreaseDelta", required = true, type = Integer.class, nillable = true)
    protected Integer increaseDelta;
    @XmlElementRef(name = "MaxAllowedPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxAllowedPowerIsDefault;
    @XmlElement(name = "MaxAllowedPower", required = true, type = Integer.class, nillable = true)
    protected Integer maxAllowedPower;
    @XmlElementRef(name = "MinAllowedPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minAllowedPowerIsDefault;
    @XmlElement(name = "MinAllowedPower", required = true, type = Integer.class, nillable = true)
    protected Integer minAllowedPower;
    @XmlElementRef(name = "HoFailThreshForIncrPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoFailThreshForIncrPowerIsDefault;
    @XmlElement(name = "HoFailThreshForIncrPower", required = true, type = Integer.class, nillable = true)
    protected Integer hoFailThreshForIncrPower;
    @XmlElementRef(name = "InterFreqCoverageHoleWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interFreqCoverageHoleWeightIsDefault;
    @XmlElement(name = "InterFreqCoverageHoleWeight", required = true, type = Integer.class, nillable = true)
    protected Integer interFreqCoverageHoleWeight;
    @XmlElementRef(name = "RlfReportCoverageHoleWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rlfReportCoverageHoleWeightIsDefault;
    @XmlElement(name = "RlfReportCoverageHoleWeight", required = true, type = Integer.class, nillable = true)
    protected Integer rlfReportCoverageHoleWeight;
    @XmlElement(name = "NlPeriodIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean nlPeriodIsDefault;
    @XmlElement(name = "NlPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer nlPeriod;
    @XmlElementRef(name = "IntraFreqRSRPThreshNghCellIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraFreqRSRPThreshNghCellIsDefault;
    @XmlElement(name = "IntraFreqRSRPThreshNghCell", required = true, type = Integer.class, nillable = true)
    protected Integer intraFreqRSRPThreshNghCell;
    @XmlElementRef(name = "IntraFreqRSRPThreshServCellIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraFreqRSRPThreshServCellIsDefault;
    @XmlElement(name = "IntraFreqRSRPThreshServCell", required = true, type = Integer.class, nillable = true)
    protected Integer intraFreqRSRPThreshServCell;

    /**
     * Gets the value of the tpmCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpmCycleIsDefault() {
        return tpmCycleIsDefault;
    }

    /**
     * Sets the value of the tpmCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTpmCycleIsDefault(Boolean value) {
        this.tpmCycleIsDefault = value;
    }

    /**
     * Gets the value of the tpmCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTpmCycle() {
        return tpmCycle;
    }

    /**
     * Sets the value of the tpmCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTpmCycle(Integer value) {
        this.tpmCycle = value;
    }

    /**
     * Gets the value of the mroCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMroCycleIsDefault() {
        return mroCycleIsDefault;
    }

    /**
     * Sets the value of the mroCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMroCycleIsDefault(Boolean value) {
        this.mroCycleIsDefault = value;
    }

    /**
     * Gets the value of the mroCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMroCycle() {
        return mroCycle;
    }

    /**
     * Sets the value of the mroCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMroCycle(Integer value) {
        this.mroCycle = value;
    }

    /**
     * Gets the value of the longDormancyIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLongDormancyIsDefault() {
        return longDormancyIsDefault;
    }

    /**
     * Sets the value of the longDormancyIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLongDormancyIsDefault(JAXBElement<Boolean> value) {
        this.longDormancyIsDefault = value;
    }

    /**
     * Gets the value of the longDormancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongDormancy() {
        return longDormancy;
    }

    /**
     * Sets the value of the longDormancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongDormancy(Integer value) {
        this.longDormancy = value;
    }

    /**
     * Gets the value of the powerChangeThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerChangeThresholdIsDefault() {
        return powerChangeThresholdIsDefault;
    }

    /**
     * Sets the value of the powerChangeThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerChangeThresholdIsDefault(JAXBElement<Boolean> value) {
        this.powerChangeThresholdIsDefault = value;
    }

    /**
     * Gets the value of the powerChangeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPowerChangeThreshold() {
        return powerChangeThreshold;
    }

    /**
     * Sets the value of the powerChangeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPowerChangeThreshold(Integer value) {
        this.powerChangeThreshold = value;
    }

    /**
     * Gets the value of the minIntraFreqHoAtmpToReduceTxPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinIntraFreqHoAtmpToReduceTxPowerIsDefault() {
        return minIntraFreqHoAtmpToReduceTxPowerIsDefault;
    }

    /**
     * Sets the value of the minIntraFreqHoAtmpToReduceTxPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinIntraFreqHoAtmpToReduceTxPowerIsDefault(JAXBElement<Boolean> value) {
        this.minIntraFreqHoAtmpToReduceTxPowerIsDefault = value;
    }

    /**
     * Gets the value of the minIntraFreqHoAtmpToReduceTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinIntraFreqHoAtmpToReduceTxPower() {
        return minIntraFreqHoAtmpToReduceTxPower;
    }

    /**
     * Sets the value of the minIntraFreqHoAtmpToReduceTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinIntraFreqHoAtmpToReduceTxPower(Integer value) {
        this.minIntraFreqHoAtmpToReduceTxPower = value;
    }

    /**
     * Gets the value of the mobFailMetricDecPowerThreshIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMobFailMetricDecPowerThreshIsDefault() {
        return mobFailMetricDecPowerThreshIsDefault;
    }

    /**
     * Sets the value of the mobFailMetricDecPowerThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMobFailMetricDecPowerThreshIsDefault(JAXBElement<Boolean> value) {
        this.mobFailMetricDecPowerThreshIsDefault = value;
    }

    /**
     * Gets the value of the mobFailMetricDecPowerThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMobFailMetricDecPowerThresh() {
        return mobFailMetricDecPowerThresh;
    }

    /**
     * Sets the value of the mobFailMetricDecPowerThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMobFailMetricDecPowerThresh(Integer value) {
        this.mobFailMetricDecPowerThresh = value;
    }

    /**
     * Gets the value of the highHoFailRateThreshIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHighHoFailRateThreshIsDefault() {
        return highHoFailRateThreshIsDefault;
    }

    /**
     * Sets the value of the highHoFailRateThreshIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHighHoFailRateThreshIsDefault(JAXBElement<Boolean> value) {
        this.highHoFailRateThreshIsDefault = value;
    }

    /**
     * Gets the value of the highHoFailRateThresh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHighHoFailRateThresh() {
        return highHoFailRateThresh;
    }

    /**
     * Sets the value of the highHoFailRateThresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHighHoFailRateThresh(Integer value) {
        this.highHoFailRateThresh = value;
    }

    /**
     * Gets the value of the decreaseDeltaIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDecreaseDeltaIsDefault() {
        return decreaseDeltaIsDefault;
    }

    /**
     * Sets the value of the decreaseDeltaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDecreaseDeltaIsDefault(JAXBElement<Boolean> value) {
        this.decreaseDeltaIsDefault = value;
    }

    /**
     * Gets the value of the decreaseDelta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecreaseDelta() {
        return decreaseDelta;
    }

    /**
     * Sets the value of the decreaseDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecreaseDelta(Integer value) {
        this.decreaseDelta = value;
    }

    /**
     * Gets the value of the increaseDeltaIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIncreaseDeltaIsDefault() {
        return increaseDeltaIsDefault;
    }

    /**
     * Sets the value of the increaseDeltaIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIncreaseDeltaIsDefault(JAXBElement<Boolean> value) {
        this.increaseDeltaIsDefault = value;
    }

    /**
     * Gets the value of the increaseDelta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIncreaseDelta() {
        return increaseDelta;
    }

    /**
     * Sets the value of the increaseDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIncreaseDelta(Integer value) {
        this.increaseDelta = value;
    }

    /**
     * Gets the value of the maxAllowedPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxAllowedPowerIsDefault() {
        return maxAllowedPowerIsDefault;
    }

    /**
     * Sets the value of the maxAllowedPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxAllowedPowerIsDefault(JAXBElement<Boolean> value) {
        this.maxAllowedPowerIsDefault = value;
    }

    /**
     * Gets the value of the maxAllowedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAllowedPower() {
        return maxAllowedPower;
    }

    /**
     * Sets the value of the maxAllowedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAllowedPower(Integer value) {
        this.maxAllowedPower = value;
    }

    /**
     * Gets the value of the minAllowedPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinAllowedPowerIsDefault() {
        return minAllowedPowerIsDefault;
    }

    /**
     * Sets the value of the minAllowedPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinAllowedPowerIsDefault(JAXBElement<Boolean> value) {
        this.minAllowedPowerIsDefault = value;
    }

    /**
     * Gets the value of the minAllowedPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAllowedPower() {
        return minAllowedPower;
    }

    /**
     * Sets the value of the minAllowedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAllowedPower(Integer value) {
        this.minAllowedPower = value;
    }

    /**
     * Gets the value of the hoFailThreshForIncrPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoFailThreshForIncrPowerIsDefault() {
        return hoFailThreshForIncrPowerIsDefault;
    }

    /**
     * Sets the value of the hoFailThreshForIncrPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoFailThreshForIncrPowerIsDefault(JAXBElement<Boolean> value) {
        this.hoFailThreshForIncrPowerIsDefault = value;
    }

    /**
     * Gets the value of the hoFailThreshForIncrPower property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoFailThreshForIncrPower() {
        return hoFailThreshForIncrPower;
    }

    /**
     * Sets the value of the hoFailThreshForIncrPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoFailThreshForIncrPower(Integer value) {
        this.hoFailThreshForIncrPower = value;
    }

    /**
     * Gets the value of the interFreqCoverageHoleWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterFreqCoverageHoleWeightIsDefault() {
        return interFreqCoverageHoleWeightIsDefault;
    }

    /**
     * Sets the value of the interFreqCoverageHoleWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterFreqCoverageHoleWeightIsDefault(JAXBElement<Boolean> value) {
        this.interFreqCoverageHoleWeightIsDefault = value;
    }

    /**
     * Gets the value of the interFreqCoverageHoleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterFreqCoverageHoleWeight() {
        return interFreqCoverageHoleWeight;
    }

    /**
     * Sets the value of the interFreqCoverageHoleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterFreqCoverageHoleWeight(Integer value) {
        this.interFreqCoverageHoleWeight = value;
    }

    /**
     * Gets the value of the rlfReportCoverageHoleWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRlfReportCoverageHoleWeightIsDefault() {
        return rlfReportCoverageHoleWeightIsDefault;
    }

    /**
     * Sets the value of the rlfReportCoverageHoleWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRlfReportCoverageHoleWeightIsDefault(JAXBElement<Boolean> value) {
        this.rlfReportCoverageHoleWeightIsDefault = value;
    }

    /**
     * Gets the value of the rlfReportCoverageHoleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRlfReportCoverageHoleWeight() {
        return rlfReportCoverageHoleWeight;
    }

    /**
     * Sets the value of the rlfReportCoverageHoleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRlfReportCoverageHoleWeight(Integer value) {
        this.rlfReportCoverageHoleWeight = value;
    }

    /**
     * Gets the value of the nlPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNlPeriodIsDefault() {
        return nlPeriodIsDefault;
    }

    /**
     * Sets the value of the nlPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNlPeriodIsDefault(Boolean value) {
        this.nlPeriodIsDefault = value;
    }

    /**
     * Gets the value of the nlPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNlPeriod() {
        return nlPeriod;
    }

    /**
     * Sets the value of the nlPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNlPeriod(Integer value) {
        this.nlPeriod = value;
    }

    /**
     * Gets the value of the intraFreqRSRPThreshNghCellIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraFreqRSRPThreshNghCellIsDefault() {
        return intraFreqRSRPThreshNghCellIsDefault;
    }

    /**
     * Sets the value of the intraFreqRSRPThreshNghCellIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraFreqRSRPThreshNghCellIsDefault(JAXBElement<Boolean> value) {
        this.intraFreqRSRPThreshNghCellIsDefault = value;
    }

    /**
     * Gets the value of the intraFreqRSRPThreshNghCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraFreqRSRPThreshNghCell() {
        return intraFreqRSRPThreshNghCell;
    }

    /**
     * Sets the value of the intraFreqRSRPThreshNghCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraFreqRSRPThreshNghCell(Integer value) {
        this.intraFreqRSRPThreshNghCell = value;
    }

    /**
     * Gets the value of the intraFreqRSRPThreshServCellIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraFreqRSRPThreshServCellIsDefault() {
        return intraFreqRSRPThreshServCellIsDefault;
    }

    /**
     * Sets the value of the intraFreqRSRPThreshServCellIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraFreqRSRPThreshServCellIsDefault(JAXBElement<Boolean> value) {
        this.intraFreqRSRPThreshServCellIsDefault = value;
    }

    /**
     * Gets the value of the intraFreqRSRPThreshServCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntraFreqRSRPThreshServCell() {
        return intraFreqRSRPThreshServCell;
    }

    /**
     * Sets the value of the intraFreqRSRPThreshServCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntraFreqRSRPThreshServCell(Integer value) {
        this.intraFreqRSRPThreshServCell = value;
    }

}
