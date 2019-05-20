
package Netspan.NBI_16_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for CellDynamicIcicWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellDynamicIcicWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlphaRSRPIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlphaRSRP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AvgRSRPDeadBandIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvgRSRPDeadBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DicicReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DicicReportInterval" type="{http://Airspan.Netspan.WebServices}DicicReportIntervalTypes" minOccurs="0"/&gt;
 *         &lt;element name="DicicReportAmountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DicicReportAmount" type="{http://Airspan.Netspan.WebServices}DicicReportAmountTypes" minOccurs="0"/&gt;
 *         &lt;element name="DicicMaxReportedCellsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DicicMaxReportedCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NrtThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NrtThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetFractionCEUsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetFractionCEUs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AlphaFreeCERsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlphaFreeCERs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FreeCERThrIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FreeCERThr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FreeCERFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FreeCERFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CERUsageThrIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CERUsageThr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinTimeforSwitchIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinTimeforSwitch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialUECategoryIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InitialUECategory" type="{http://Airspan.Netspan.WebServices}InitialUECategoryTypes" minOccurs="0"/&gt;
 *         &lt;element name="DicicPaCCUIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DicicPaCCU" type="{http://Airspan.Netspan.WebServices}DicicPaCCUTypes" minOccurs="0"/&gt;
 *         &lt;element name="CERSelfConfigPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CERSelfConfigPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CERSelfConfigInitialDelayIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CERSelfConfigInitialDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AlphaRBUsageIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlphaRBUsage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CERStepSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CERStepSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumCERMinIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumCERMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumCERMaxIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumCERMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AlphaICICMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlphaICICMetric" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UserCatPeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserCatPeriodicity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetHeadroomIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TargetHeadroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RBUsageHystIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RBUsageHyst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KNghCappingIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="KNghCapping" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NonContiguousCERIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NonContiguousCER" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="UnmanagedIntThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnmanagedIntThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CERMetricHystIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CERMetricHyst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgRSRPAgingFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AvgRSRPAgingFactor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellDynamicIcicWs", propOrder = {
    "alphaRSRPIsDefault",
    "alphaRSRP",
    "avgRSRPDeadBandIsDefault",
    "avgRSRPDeadBand",
    "dicicReportIntervalIsDefault",
    "dicicReportInterval",
    "dicicReportAmountIsDefault",
    "dicicReportAmount",
    "dicicMaxReportedCellsIsDefault",
    "dicicMaxReportedCells",
    "nrtThresholdIsDefault",
    "nrtThreshold",
    "targetFractionCEUsIsDefault",
    "targetFractionCEUs",
    "alphaFreeCERsIsDefault",
    "alphaFreeCERs",
    "freeCERThrIsDefault",
    "freeCERThr",
    "freeCERFactorIsDefault",
    "freeCERFactor",
    "cerUsageThrIsDefault",
    "cerUsageThr",
    "minTimeforSwitchIsDefault",
    "minTimeforSwitch",
    "initialUECategoryIsDefault",
    "initialUECategory",
    "dicicPaCCUIsDefault",
    "dicicPaCCU",
    "cerSelfConfigPeriodIsDefault",
    "cerSelfConfigPeriod",
    "cerSelfConfigInitialDelayIsDefault",
    "cerSelfConfigInitialDelay",
    "alphaRBUsageIsDefault",
    "alphaRBUsage",
    "cerStepSizeIsDefault",
    "cerStepSize",
    "numCERMinIsDefault",
    "numCERMin",
    "numCERMaxIsDefault",
    "numCERMax",
    "alphaICICMetricIsDefault",
    "alphaICICMetric",
    "userCatPeriodicityIsDefault",
    "userCatPeriodicity",
    "targetHeadroomIsDefault",
    "targetHeadroom",
    "rbUsageHystIsDefault",
    "rbUsageHyst",
    "kNghCappingIsDefault",
    "kNghCapping",
    "nonContiguousCERIsDefault",
    "nonContiguousCER",
    "unmanagedIntThresholdIsDefault",
    "unmanagedIntThreshold",
    "cerMetricHystIsDefault",
    "cerMetricHyst",
    "avgRSRPAgingFactorIsDefault",
    "avgRSRPAgingFactor"
})
public class CellDynamicIcicWs {

    @XmlElementRef(name = "AlphaRSRPIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaRSRPIsDefault;
    @XmlElementRef(name = "AlphaRSRP", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> alphaRSRP;
    @XmlElementRef(name = "AvgRSRPDeadBandIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> avgRSRPDeadBandIsDefault;
    @XmlElementRef(name = "AvgRSRPDeadBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgRSRPDeadBand;
    @XmlElementRef(name = "DicicReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dicicReportIntervalIsDefault;
    @XmlElementRef(name = "DicicReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DicicReportIntervalTypes> dicicReportInterval;
    @XmlElementRef(name = "DicicReportAmountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dicicReportAmountIsDefault;
    @XmlElementRef(name = "DicicReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DicicReportAmountTypes> dicicReportAmount;
    @XmlElementRef(name = "DicicMaxReportedCellsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dicicMaxReportedCellsIsDefault;
    @XmlElementRef(name = "DicicMaxReportedCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dicicMaxReportedCells;
    @XmlElementRef(name = "NrtThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nrtThresholdIsDefault;
    @XmlElementRef(name = "NrtThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nrtThreshold;
    @XmlElementRef(name = "TargetFractionCEUsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetFractionCEUsIsDefault;
    @XmlElementRef(name = "TargetFractionCEUs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetFractionCEUs;
    @XmlElementRef(name = "AlphaFreeCERsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaFreeCERsIsDefault;
    @XmlElementRef(name = "AlphaFreeCERs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> alphaFreeCERs;
    @XmlElementRef(name = "FreeCERThrIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> freeCERThrIsDefault;
    @XmlElementRef(name = "FreeCERThr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> freeCERThr;
    @XmlElementRef(name = "FreeCERFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> freeCERFactorIsDefault;
    @XmlElementRef(name = "FreeCERFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> freeCERFactor;
    @XmlElementRef(name = "CERUsageThrIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cerUsageThrIsDefault;
    @XmlElementRef(name = "CERUsageThr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cerUsageThr;
    @XmlElementRef(name = "MinTimeforSwitchIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minTimeforSwitchIsDefault;
    @XmlElementRef(name = "MinTimeforSwitch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minTimeforSwitch;
    @XmlElementRef(name = "InitialUECategoryIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> initialUECategoryIsDefault;
    @XmlElementRef(name = "InitialUECategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<InitialUECategoryTypes> initialUECategory;
    @XmlElementRef(name = "DicicPaCCUIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dicicPaCCUIsDefault;
    @XmlElementRef(name = "DicicPaCCU", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dicicPaCCU;
    @XmlElementRef(name = "CERSelfConfigPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cerSelfConfigPeriodIsDefault;
    @XmlElementRef(name = "CERSelfConfigPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cerSelfConfigPeriod;
    @XmlElementRef(name = "CERSelfConfigInitialDelayIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cerSelfConfigInitialDelayIsDefault;
    @XmlElementRef(name = "CERSelfConfigInitialDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cerSelfConfigInitialDelay;
    @XmlElementRef(name = "AlphaRBUsageIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaRBUsageIsDefault;
    @XmlElementRef(name = "AlphaRBUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> alphaRBUsage;
    @XmlElementRef(name = "CERStepSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cerStepSizeIsDefault;
    @XmlElementRef(name = "CERStepSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cerStepSize;
    @XmlElementRef(name = "NumCERMinIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numCERMinIsDefault;
    @XmlElementRef(name = "NumCERMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCERMin;
    @XmlElementRef(name = "NumCERMaxIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numCERMaxIsDefault;
    @XmlElementRef(name = "NumCERMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCERMax;
    @XmlElementRef(name = "AlphaICICMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> alphaICICMetricIsDefault;
    @XmlElementRef(name = "AlphaICICMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> alphaICICMetric;
    @XmlElementRef(name = "UserCatPeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userCatPeriodicityIsDefault;
    @XmlElementRef(name = "UserCatPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userCatPeriodicity;
    @XmlElementRef(name = "TargetHeadroomIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> targetHeadroomIsDefault;
    @XmlElementRef(name = "TargetHeadroom", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetHeadroom;
    @XmlElementRef(name = "RBUsageHystIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbUsageHystIsDefault;
    @XmlElementRef(name = "RBUsageHyst", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rbUsageHyst;
    @XmlElementRef(name = "KNghCappingIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> kNghCappingIsDefault;
    @XmlElementRef(name = "KNghCapping", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kNghCapping;
    @XmlElementRef(name = "NonContiguousCERIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nonContiguousCERIsDefault;
    @XmlElementRef(name = "NonContiguousCER", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> nonContiguousCER;
    @XmlElementRef(name = "UnmanagedIntThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> unmanagedIntThresholdIsDefault;
    @XmlElementRef(name = "UnmanagedIntThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> unmanagedIntThreshold;
    @XmlElementRef(name = "CERMetricHystIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cerMetricHystIsDefault;
    @XmlElementRef(name = "CERMetricHyst", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cerMetricHyst;
    @XmlElementRef(name = "AvgRSRPAgingFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> avgRSRPAgingFactorIsDefault;
    @XmlElementRef(name = "AvgRSRPAgingFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgRSRPAgingFactor;

    /**
     * Gets the value of the alphaRSRPIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaRSRPIsDefault() {
        return alphaRSRPIsDefault;
    }

    /**
     * Sets the value of the alphaRSRPIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaRSRPIsDefault(JAXBElement<Boolean> value) {
        this.alphaRSRPIsDefault = value;
    }

    /**
     * Gets the value of the alphaRSRP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAlphaRSRP() {
        return alphaRSRP;
    }

    /**
     * Sets the value of the alphaRSRP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAlphaRSRP(JAXBElement<BigDecimal> value) {
        this.alphaRSRP = value;
    }

    /**
     * Gets the value of the avgRSRPDeadBandIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAvgRSRPDeadBandIsDefault() {
        return avgRSRPDeadBandIsDefault;
    }

    /**
     * Sets the value of the avgRSRPDeadBandIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAvgRSRPDeadBandIsDefault(JAXBElement<Boolean> value) {
        this.avgRSRPDeadBandIsDefault = value;
    }

    /**
     * Gets the value of the avgRSRPDeadBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgRSRPDeadBand() {
        return avgRSRPDeadBand;
    }

    /**
     * Sets the value of the avgRSRPDeadBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgRSRPDeadBand(JAXBElement<Integer> value) {
        this.avgRSRPDeadBand = value;
    }

    /**
     * Gets the value of the dicicReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDicicReportIntervalIsDefault() {
        return dicicReportIntervalIsDefault;
    }

    /**
     * Sets the value of the dicicReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDicicReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.dicicReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the dicicReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DicicReportIntervalTypes }{@code >}
     *     
     */
    public JAXBElement<DicicReportIntervalTypes> getDicicReportInterval() {
        return dicicReportInterval;
    }

    /**
     * Sets the value of the dicicReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DicicReportIntervalTypes }{@code >}
     *     
     */
    public void setDicicReportInterval(JAXBElement<DicicReportIntervalTypes> value) {
        this.dicicReportInterval = value;
    }

    /**
     * Gets the value of the dicicReportAmountIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDicicReportAmountIsDefault() {
        return dicicReportAmountIsDefault;
    }

    /**
     * Sets the value of the dicicReportAmountIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDicicReportAmountIsDefault(JAXBElement<Boolean> value) {
        this.dicicReportAmountIsDefault = value;
    }

    /**
     * Gets the value of the dicicReportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DicicReportAmountTypes }{@code >}
     *     
     */
    public JAXBElement<DicicReportAmountTypes> getDicicReportAmount() {
        return dicicReportAmount;
    }

    /**
     * Sets the value of the dicicReportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DicicReportAmountTypes }{@code >}
     *     
     */
    public void setDicicReportAmount(JAXBElement<DicicReportAmountTypes> value) {
        this.dicicReportAmount = value;
    }

    /**
     * Gets the value of the dicicMaxReportedCellsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDicicMaxReportedCellsIsDefault() {
        return dicicMaxReportedCellsIsDefault;
    }

    /**
     * Sets the value of the dicicMaxReportedCellsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDicicMaxReportedCellsIsDefault(JAXBElement<Boolean> value) {
        this.dicicMaxReportedCellsIsDefault = value;
    }

    /**
     * Gets the value of the dicicMaxReportedCells property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDicicMaxReportedCells() {
        return dicicMaxReportedCells;
    }

    /**
     * Sets the value of the dicicMaxReportedCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDicicMaxReportedCells(JAXBElement<Integer> value) {
        this.dicicMaxReportedCells = value;
    }

    /**
     * Gets the value of the nrtThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNrtThresholdIsDefault() {
        return nrtThresholdIsDefault;
    }

    /**
     * Sets the value of the nrtThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNrtThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nrtThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nrtThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNrtThreshold() {
        return nrtThreshold;
    }

    /**
     * Sets the value of the nrtThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNrtThreshold(JAXBElement<Integer> value) {
        this.nrtThreshold = value;
    }

    /**
     * Gets the value of the targetFractionCEUsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetFractionCEUsIsDefault() {
        return targetFractionCEUsIsDefault;
    }

    /**
     * Sets the value of the targetFractionCEUsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetFractionCEUsIsDefault(JAXBElement<Boolean> value) {
        this.targetFractionCEUsIsDefault = value;
    }

    /**
     * Gets the value of the targetFractionCEUs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetFractionCEUs() {
        return targetFractionCEUs;
    }

    /**
     * Sets the value of the targetFractionCEUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetFractionCEUs(JAXBElement<Integer> value) {
        this.targetFractionCEUs = value;
    }

    /**
     * Gets the value of the alphaFreeCERsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaFreeCERsIsDefault() {
        return alphaFreeCERsIsDefault;
    }

    /**
     * Sets the value of the alphaFreeCERsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaFreeCERsIsDefault(JAXBElement<Boolean> value) {
        this.alphaFreeCERsIsDefault = value;
    }

    /**
     * Gets the value of the alphaFreeCERs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAlphaFreeCERs() {
        return alphaFreeCERs;
    }

    /**
     * Sets the value of the alphaFreeCERs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAlphaFreeCERs(JAXBElement<BigDecimal> value) {
        this.alphaFreeCERs = value;
    }

    /**
     * Gets the value of the freeCERThrIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFreeCERThrIsDefault() {
        return freeCERThrIsDefault;
    }

    /**
     * Sets the value of the freeCERThrIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFreeCERThrIsDefault(JAXBElement<Boolean> value) {
        this.freeCERThrIsDefault = value;
    }

    /**
     * Gets the value of the freeCERThr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFreeCERThr() {
        return freeCERThr;
    }

    /**
     * Sets the value of the freeCERThr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFreeCERThr(JAXBElement<Integer> value) {
        this.freeCERThr = value;
    }

    /**
     * Gets the value of the freeCERFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFreeCERFactorIsDefault() {
        return freeCERFactorIsDefault;
    }

    /**
     * Sets the value of the freeCERFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFreeCERFactorIsDefault(JAXBElement<Boolean> value) {
        this.freeCERFactorIsDefault = value;
    }

    /**
     * Gets the value of the freeCERFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFreeCERFactor() {
        return freeCERFactor;
    }

    /**
     * Sets the value of the freeCERFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFreeCERFactor(JAXBElement<BigDecimal> value) {
        this.freeCERFactor = value;
    }

    /**
     * Gets the value of the cerUsageThrIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCERUsageThrIsDefault() {
        return cerUsageThrIsDefault;
    }

    /**
     * Sets the value of the cerUsageThrIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCERUsageThrIsDefault(JAXBElement<Boolean> value) {
        this.cerUsageThrIsDefault = value;
    }

    /**
     * Gets the value of the cerUsageThr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCERUsageThr() {
        return cerUsageThr;
    }

    /**
     * Sets the value of the cerUsageThr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCERUsageThr(JAXBElement<Integer> value) {
        this.cerUsageThr = value;
    }

    /**
     * Gets the value of the minTimeforSwitchIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinTimeforSwitchIsDefault() {
        return minTimeforSwitchIsDefault;
    }

    /**
     * Sets the value of the minTimeforSwitchIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinTimeforSwitchIsDefault(JAXBElement<Boolean> value) {
        this.minTimeforSwitchIsDefault = value;
    }

    /**
     * Gets the value of the minTimeforSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinTimeforSwitch() {
        return minTimeforSwitch;
    }

    /**
     * Sets the value of the minTimeforSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinTimeforSwitch(JAXBElement<Integer> value) {
        this.minTimeforSwitch = value;
    }

    /**
     * Gets the value of the initialUECategoryIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInitialUECategoryIsDefault() {
        return initialUECategoryIsDefault;
    }

    /**
     * Sets the value of the initialUECategoryIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInitialUECategoryIsDefault(JAXBElement<Boolean> value) {
        this.initialUECategoryIsDefault = value;
    }

    /**
     * Gets the value of the initialUECategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InitialUECategoryTypes }{@code >}
     *     
     */
    public JAXBElement<InitialUECategoryTypes> getInitialUECategory() {
        return initialUECategory;
    }

    /**
     * Sets the value of the initialUECategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InitialUECategoryTypes }{@code >}
     *     
     */
    public void setInitialUECategory(JAXBElement<InitialUECategoryTypes> value) {
        this.initialUECategory = value;
    }

    /**
     * Gets the value of the dicicPaCCUIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDicicPaCCUIsDefault() {
        return dicicPaCCUIsDefault;
    }

    /**
     * Sets the value of the dicicPaCCUIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDicicPaCCUIsDefault(JAXBElement<Boolean> value) {
        this.dicicPaCCUIsDefault = value;
    }

    /**
     * Gets the value of the dicicPaCCU property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDicicPaCCU() {
        return dicicPaCCU;
    }

    /**
     * Sets the value of the dicicPaCCU property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDicicPaCCU(JAXBElement<String> value) {
        this.dicicPaCCU = value;
    }

    /**
     * Gets the value of the cerSelfConfigPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCERSelfConfigPeriodIsDefault() {
        return cerSelfConfigPeriodIsDefault;
    }

    /**
     * Sets the value of the cerSelfConfigPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCERSelfConfigPeriodIsDefault(JAXBElement<Boolean> value) {
        this.cerSelfConfigPeriodIsDefault = value;
    }

    /**
     * Gets the value of the cerSelfConfigPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCERSelfConfigPeriod() {
        return cerSelfConfigPeriod;
    }

    /**
     * Sets the value of the cerSelfConfigPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCERSelfConfigPeriod(JAXBElement<Integer> value) {
        this.cerSelfConfigPeriod = value;
    }

    /**
     * Gets the value of the cerSelfConfigInitialDelayIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCERSelfConfigInitialDelayIsDefault() {
        return cerSelfConfigInitialDelayIsDefault;
    }

    /**
     * Sets the value of the cerSelfConfigInitialDelayIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCERSelfConfigInitialDelayIsDefault(JAXBElement<Boolean> value) {
        this.cerSelfConfigInitialDelayIsDefault = value;
    }

    /**
     * Gets the value of the cerSelfConfigInitialDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCERSelfConfigInitialDelay() {
        return cerSelfConfigInitialDelay;
    }

    /**
     * Sets the value of the cerSelfConfigInitialDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCERSelfConfigInitialDelay(JAXBElement<Integer> value) {
        this.cerSelfConfigInitialDelay = value;
    }

    /**
     * Gets the value of the alphaRBUsageIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaRBUsageIsDefault() {
        return alphaRBUsageIsDefault;
    }

    /**
     * Sets the value of the alphaRBUsageIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaRBUsageIsDefault(JAXBElement<Boolean> value) {
        this.alphaRBUsageIsDefault = value;
    }

    /**
     * Gets the value of the alphaRBUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAlphaRBUsage() {
        return alphaRBUsage;
    }

    /**
     * Sets the value of the alphaRBUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAlphaRBUsage(JAXBElement<BigDecimal> value) {
        this.alphaRBUsage = value;
    }

    /**
     * Gets the value of the cerStepSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCERStepSizeIsDefault() {
        return cerStepSizeIsDefault;
    }

    /**
     * Sets the value of the cerStepSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCERStepSizeIsDefault(JAXBElement<Boolean> value) {
        this.cerStepSizeIsDefault = value;
    }

    /**
     * Gets the value of the cerStepSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCERStepSize() {
        return cerStepSize;
    }

    /**
     * Sets the value of the cerStepSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCERStepSize(JAXBElement<Integer> value) {
        this.cerStepSize = value;
    }

    /**
     * Gets the value of the numCERMinIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumCERMinIsDefault() {
        return numCERMinIsDefault;
    }

    /**
     * Sets the value of the numCERMinIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumCERMinIsDefault(JAXBElement<Boolean> value) {
        this.numCERMinIsDefault = value;
    }

    /**
     * Gets the value of the numCERMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCERMin() {
        return numCERMin;
    }

    /**
     * Sets the value of the numCERMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCERMin(JAXBElement<Integer> value) {
        this.numCERMin = value;
    }

    /**
     * Gets the value of the numCERMaxIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumCERMaxIsDefault() {
        return numCERMaxIsDefault;
    }

    /**
     * Sets the value of the numCERMaxIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumCERMaxIsDefault(JAXBElement<Boolean> value) {
        this.numCERMaxIsDefault = value;
    }

    /**
     * Gets the value of the numCERMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCERMax() {
        return numCERMax;
    }

    /**
     * Sets the value of the numCERMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCERMax(JAXBElement<Integer> value) {
        this.numCERMax = value;
    }

    /**
     * Gets the value of the alphaICICMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAlphaICICMetricIsDefault() {
        return alphaICICMetricIsDefault;
    }

    /**
     * Sets the value of the alphaICICMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAlphaICICMetricIsDefault(JAXBElement<Boolean> value) {
        this.alphaICICMetricIsDefault = value;
    }

    /**
     * Gets the value of the alphaICICMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAlphaICICMetric() {
        return alphaICICMetric;
    }

    /**
     * Sets the value of the alphaICICMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAlphaICICMetric(JAXBElement<BigDecimal> value) {
        this.alphaICICMetric = value;
    }

    /**
     * Gets the value of the userCatPeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserCatPeriodicityIsDefault() {
        return userCatPeriodicityIsDefault;
    }

    /**
     * Sets the value of the userCatPeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserCatPeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.userCatPeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the userCatPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserCatPeriodicity() {
        return userCatPeriodicity;
    }

    /**
     * Sets the value of the userCatPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserCatPeriodicity(JAXBElement<Integer> value) {
        this.userCatPeriodicity = value;
    }

    /**
     * Gets the value of the targetHeadroomIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTargetHeadroomIsDefault() {
        return targetHeadroomIsDefault;
    }

    /**
     * Sets the value of the targetHeadroomIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTargetHeadroomIsDefault(JAXBElement<Boolean> value) {
        this.targetHeadroomIsDefault = value;
    }

    /**
     * Gets the value of the targetHeadroom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetHeadroom() {
        return targetHeadroom;
    }

    /**
     * Sets the value of the targetHeadroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetHeadroom(JAXBElement<Integer> value) {
        this.targetHeadroom = value;
    }

    /**
     * Gets the value of the rbUsageHystIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRBUsageHystIsDefault() {
        return rbUsageHystIsDefault;
    }

    /**
     * Sets the value of the rbUsageHystIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRBUsageHystIsDefault(JAXBElement<Boolean> value) {
        this.rbUsageHystIsDefault = value;
    }

    /**
     * Gets the value of the rbUsageHyst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRBUsageHyst() {
        return rbUsageHyst;
    }

    /**
     * Sets the value of the rbUsageHyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRBUsageHyst(JAXBElement<Integer> value) {
        this.rbUsageHyst = value;
    }

    /**
     * Gets the value of the kNghCappingIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getKNghCappingIsDefault() {
        return kNghCappingIsDefault;
    }

    /**
     * Sets the value of the kNghCappingIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setKNghCappingIsDefault(JAXBElement<Boolean> value) {
        this.kNghCappingIsDefault = value;
    }

    /**
     * Gets the value of the kNghCapping property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKNghCapping() {
        return kNghCapping;
    }

    /**
     * Sets the value of the kNghCapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKNghCapping(JAXBElement<Integer> value) {
        this.kNghCapping = value;
    }

    /**
     * Gets the value of the nonContiguousCERIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNonContiguousCERIsDefault() {
        return nonContiguousCERIsDefault;
    }

    /**
     * Sets the value of the nonContiguousCERIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNonContiguousCERIsDefault(JAXBElement<Boolean> value) {
        this.nonContiguousCERIsDefault = value;
    }

    /**
     * Gets the value of the nonContiguousCER property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getNonContiguousCER() {
        return nonContiguousCER;
    }

    /**
     * Sets the value of the nonContiguousCER property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setNonContiguousCER(JAXBElement<EnabledStates> value) {
        this.nonContiguousCER = value;
    }

    /**
     * Gets the value of the unmanagedIntThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUnmanagedIntThresholdIsDefault() {
        return unmanagedIntThresholdIsDefault;
    }

    /**
     * Sets the value of the unmanagedIntThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUnmanagedIntThresholdIsDefault(JAXBElement<Boolean> value) {
        this.unmanagedIntThresholdIsDefault = value;
    }

    /**
     * Gets the value of the unmanagedIntThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnmanagedIntThreshold() {
        return unmanagedIntThreshold;
    }

    /**
     * Sets the value of the unmanagedIntThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnmanagedIntThreshold(JAXBElement<Integer> value) {
        this.unmanagedIntThreshold = value;
    }

    /**
     * Gets the value of the cerMetricHystIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCERMetricHystIsDefault() {
        return cerMetricHystIsDefault;
    }

    /**
     * Sets the value of the cerMetricHystIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCERMetricHystIsDefault(JAXBElement<Boolean> value) {
        this.cerMetricHystIsDefault = value;
    }

    /**
     * Gets the value of the cerMetricHyst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCERMetricHyst() {
        return cerMetricHyst;
    }

    /**
     * Sets the value of the cerMetricHyst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCERMetricHyst(JAXBElement<Integer> value) {
        this.cerMetricHyst = value;
    }

    /**
     * Gets the value of the avgRSRPAgingFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAvgRSRPAgingFactorIsDefault() {
        return avgRSRPAgingFactorIsDefault;
    }

    /**
     * Sets the value of the avgRSRPAgingFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAvgRSRPAgingFactorIsDefault(JAXBElement<Boolean> value) {
        this.avgRSRPAgingFactorIsDefault = value;
    }

    /**
     * Gets the value of the avgRSRPAgingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgRSRPAgingFactor() {
        return avgRSRPAgingFactor;
    }

    /**
     * Sets the value of the avgRSRPAgingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgRSRPAgingFactor(JAXBElement<Integer> value) {
        this.avgRSRPAgingFactor = value;
    }

}
