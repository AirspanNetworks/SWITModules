
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for ClockMngrWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClockMngrWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StratumGnssIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StratumGnss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StratumPtpIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StratumPtp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StratumNlmIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StratumNlm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StratumDenbIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StratumDenb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StratumGponIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StratumGpon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeToLockIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeToLock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RebootTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RebootTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ForceTimeSyncIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceTimeSync" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcDisqualificationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcDisqualificationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcPromotionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcPromotionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcSynchronizationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcSynchronizationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcFrequencyCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcFrequencyCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcTimeCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcTimeCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcSyncIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PtpSyncSrcSyncInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcDisqualificationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcDisqualificationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcPromotionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcPromotionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcSynchronizationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcSynchronizationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcFrequencyCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcFrequencyCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcTimeCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcTimeCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcSyncIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsSyncSrcSyncInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcDisqualificationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcDisqualificationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcPromotionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcPromotionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcSynchronizationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcSynchronizationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcFrequencyCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcFrequencyCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcTimeCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcTimeCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcSyncIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncSrcSyncInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcDisqualificationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcDisqualificationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcPromotionThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcPromotionThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcSynchronizationThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcSynchronizationThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcFrequencyCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcFrequencyCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcTimeCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcTimeCoefficient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcSyncIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsSyncSrcSyncInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SyncModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SyncMode" type="{http://Airspan.Netspan.WebServices}SyncModes" minOccurs="0"/&gt;
 *         &lt;element name="MaxFreqErrorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxFreqError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxTimeErrorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxTimeError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FreqUncertaintyThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FreqUncertaintyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FreqErrorThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FreqErrorThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimeUncertaintyThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeUncertaintyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SlewRateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SlewRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GpsLeapSecondsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GpsLeapSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResyncSlewRateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResyncSlewRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockMngrWs", propOrder = {
    "stratumGnssIsDefault",
    "stratumGnss",
    "stratumPtpIsDefault",
    "stratumPtp",
    "stratumNlmIsDefault",
    "stratumNlm",
    "stratumDenbIsDefault",
    "stratumDenb",
    "stratumGponIsDefault",
    "stratumGpon",
    "timeToLockIsDefault",
    "timeToLock",
    "rebootTimerIsDefault",
    "rebootTimer",
    "forceTimeSyncIsDefault",
    "forceTimeSync",
    "ptpSyncSrcDisqualificationThresholdIsDefault",
    "ptpSyncSrcDisqualificationThreshold",
    "ptpSyncSrcPromotionThresholdIsDefault",
    "ptpSyncSrcPromotionThreshold",
    "ptpSyncSrcSynchronizationThresholdIsDefault",
    "ptpSyncSrcSynchronizationThreshold",
    "ptpSyncSrcFrequencyCoefficientIsDefault",
    "ptpSyncSrcFrequencyCoefficient",
    "ptpSyncSrcTimeCoefficientIsDefault",
    "ptpSyncSrcTimeCoefficient",
    "ptpSyncSrcSyncIntervalIsDefault",
    "ptpSyncSrcSyncInterval",
    "gpsSyncSrcDisqualificationThresholdIsDefault",
    "gpsSyncSrcDisqualificationThreshold",
    "gpsSyncSrcPromotionThresholdIsDefault",
    "gpsSyncSrcPromotionThreshold",
    "gpsSyncSrcSynchronizationThresholdIsDefault",
    "gpsSyncSrcSynchronizationThreshold",
    "gpsSyncSrcFrequencyCoefficientIsDefault",
    "gpsSyncSrcFrequencyCoefficient",
    "gpsSyncSrcTimeCoefficientIsDefault",
    "gpsSyncSrcTimeCoefficient",
    "gpsSyncSrcSyncIntervalIsDefault",
    "gpsSyncSrcSyncInterval",
    "nlSyncSrcDisqualificationThresholdIsDefault",
    "nlSyncSrcDisqualificationThreshold",
    "nlSyncSrcPromotionThresholdIsDefault",
    "nlSyncSrcPromotionThreshold",
    "nlSyncSrcSynchronizationThresholdIsDefault",
    "nlSyncSrcSynchronizationThreshold",
    "nlSyncSrcFrequencyCoefficientIsDefault",
    "nlSyncSrcFrequencyCoefficient",
    "nlSyncSrcTimeCoefficientIsDefault",
    "nlSyncSrcTimeCoefficient",
    "nlSyncSrcSyncIntervalIsDefault",
    "nlSyncSrcSyncInterval",
    "extPpsSyncSrcDisqualificationThresholdIsDefault",
    "extPpsSyncSrcDisqualificationThreshold",
    "extPpsSyncSrcPromotionThresholdIsDefault",
    "extPpsSyncSrcPromotionThreshold",
    "extPpsSyncSrcSynchronizationThresholdIsDefault",
    "extPpsSyncSrcSynchronizationThreshold",
    "extPpsSyncSrcFrequencyCoefficientIsDefault",
    "extPpsSyncSrcFrequencyCoefficient",
    "extPpsSyncSrcTimeCoefficientIsDefault",
    "extPpsSyncSrcTimeCoefficient",
    "extPpsSyncSrcSyncIntervalIsDefault",
    "extPpsSyncSrcSyncInterval",
    "syncModeIsDefault",
    "syncMode",
    "maxFreqErrorIsDefault",
    "maxFreqError",
    "maxTimeErrorIsDefault",
    "maxTimeError",
    "freqUncertaintyThresholdIsDefault",
    "freqUncertaintyThreshold",
    "freqErrorThresholdIsDefault",
    "freqErrorThreshold",
    "timeUncertaintyThresholdIsDefault",
    "timeUncertaintyThreshold",
    "slewRateIsDefault",
    "slewRate",
    "gpsLeapSecondsIsDefault",
    "gpsLeapSeconds",
    "resyncSlewRateIsDefault",
    "resyncSlewRate"
})
public class ClockMngrWs {

    @XmlElementRef(name = "StratumGnssIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumGnssIsDefault;
    @XmlElementRef(name = "StratumGnss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumGnss;
    @XmlElementRef(name = "StratumPtpIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumPtpIsDefault;
    @XmlElementRef(name = "StratumPtp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumPtp;
    @XmlElementRef(name = "StratumNlmIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumNlmIsDefault;
    @XmlElementRef(name = "StratumNlm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumNlm;
    @XmlElementRef(name = "StratumDenbIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumDenbIsDefault;
    @XmlElementRef(name = "StratumDenb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumDenb;
    @XmlElementRef(name = "StratumGponIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> stratumGponIsDefault;
    @XmlElementRef(name = "StratumGpon", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stratumGpon;
    @XmlElementRef(name = "TimeToLockIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timeToLockIsDefault;
    @XmlElementRef(name = "TimeToLock", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeToLock;
    @XmlElementRef(name = "RebootTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rebootTimerIsDefault;
    @XmlElementRef(name = "RebootTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rebootTimer;
    @XmlElementRef(name = "ForceTimeSyncIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forceTimeSyncIsDefault;
    @XmlElementRef(name = "ForceTimeSync", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> forceTimeSync;
    @XmlElementRef(name = "PtpSyncSrcDisqualificationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcDisqualificationThresholdIsDefault;
    @XmlElementRef(name = "PtpSyncSrcDisqualificationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcDisqualificationThreshold;
    @XmlElementRef(name = "PtpSyncSrcPromotionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcPromotionThresholdIsDefault;
    @XmlElementRef(name = "PtpSyncSrcPromotionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcPromotionThreshold;
    @XmlElementRef(name = "PtpSyncSrcSynchronizationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcSynchronizationThresholdIsDefault;
    @XmlElementRef(name = "PtpSyncSrcSynchronizationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcSynchronizationThreshold;
    @XmlElementRef(name = "PtpSyncSrcFrequencyCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcFrequencyCoefficientIsDefault;
    @XmlElementRef(name = "PtpSyncSrcFrequencyCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcFrequencyCoefficient;
    @XmlElementRef(name = "PtpSyncSrcTimeCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcTimeCoefficientIsDefault;
    @XmlElementRef(name = "PtpSyncSrcTimeCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcTimeCoefficient;
    @XmlElementRef(name = "PtpSyncSrcSyncIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ptpSyncSrcSyncIntervalIsDefault;
    @XmlElementRef(name = "PtpSyncSrcSyncInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpSyncSrcSyncInterval;
    @XmlElementRef(name = "GpsSyncSrcDisqualificationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcDisqualificationThresholdIsDefault;
    @XmlElementRef(name = "GpsSyncSrcDisqualificationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcDisqualificationThreshold;
    @XmlElementRef(name = "GpsSyncSrcPromotionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcPromotionThresholdIsDefault;
    @XmlElementRef(name = "GpsSyncSrcPromotionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcPromotionThreshold;
    @XmlElementRef(name = "GpsSyncSrcSynchronizationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcSynchronizationThresholdIsDefault;
    @XmlElementRef(name = "GpsSyncSrcSynchronizationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcSynchronizationThreshold;
    @XmlElementRef(name = "GpsSyncSrcFrequencyCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcFrequencyCoefficientIsDefault;
    @XmlElementRef(name = "GpsSyncSrcFrequencyCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcFrequencyCoefficient;
    @XmlElementRef(name = "GpsSyncSrcTimeCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcTimeCoefficientIsDefault;
    @XmlElementRef(name = "GpsSyncSrcTimeCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcTimeCoefficient;
    @XmlElementRef(name = "GpsSyncSrcSyncIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsSyncSrcSyncIntervalIsDefault;
    @XmlElementRef(name = "GpsSyncSrcSyncInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsSyncSrcSyncInterval;
    @XmlElementRef(name = "NlSyncSrcDisqualificationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcDisqualificationThresholdIsDefault;
    @XmlElementRef(name = "NlSyncSrcDisqualificationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcDisqualificationThreshold;
    @XmlElementRef(name = "NlSyncSrcPromotionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcPromotionThresholdIsDefault;
    @XmlElementRef(name = "NlSyncSrcPromotionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcPromotionThreshold;
    @XmlElementRef(name = "NlSyncSrcSynchronizationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcSynchronizationThresholdIsDefault;
    @XmlElementRef(name = "NlSyncSrcSynchronizationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcSynchronizationThreshold;
    @XmlElementRef(name = "NlSyncSrcFrequencyCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcFrequencyCoefficientIsDefault;
    @XmlElementRef(name = "NlSyncSrcFrequencyCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcFrequencyCoefficient;
    @XmlElementRef(name = "NlSyncSrcTimeCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcTimeCoefficientIsDefault;
    @XmlElementRef(name = "NlSyncSrcTimeCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcTimeCoefficient;
    @XmlElementRef(name = "NlSyncSrcSyncIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlSyncSrcSyncIntervalIsDefault;
    @XmlElementRef(name = "NlSyncSrcSyncInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncSrcSyncInterval;
    @XmlElementRef(name = "ExtPpsSyncSrcDisqualificationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcDisqualificationThresholdIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcDisqualificationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcDisqualificationThreshold;
    @XmlElementRef(name = "ExtPpsSyncSrcPromotionThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcPromotionThresholdIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcPromotionThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcPromotionThreshold;
    @XmlElementRef(name = "ExtPpsSyncSrcSynchronizationThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcSynchronizationThresholdIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcSynchronizationThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcSynchronizationThreshold;
    @XmlElementRef(name = "ExtPpsSyncSrcFrequencyCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcFrequencyCoefficientIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcFrequencyCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcFrequencyCoefficient;
    @XmlElementRef(name = "ExtPpsSyncSrcTimeCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcTimeCoefficientIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcTimeCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcTimeCoefficient;
    @XmlElementRef(name = "ExtPpsSyncSrcSyncIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPpsSyncSrcSyncIntervalIsDefault;
    @XmlElementRef(name = "ExtPpsSyncSrcSyncInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPpsSyncSrcSyncInterval;
    @XmlElementRef(name = "SyncModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> syncModeIsDefault;
    @XmlElementRef(name = "SyncMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SyncModes> syncMode;
    @XmlElementRef(name = "MaxFreqErrorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxFreqErrorIsDefault;
    @XmlElementRef(name = "MaxFreqError", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxFreqError;
    @XmlElementRef(name = "MaxTimeErrorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxTimeErrorIsDefault;
    @XmlElementRef(name = "MaxTimeError", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxTimeError;
    @XmlElementRef(name = "FreqUncertaintyThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> freqUncertaintyThresholdIsDefault;
    @XmlElementRef(name = "FreqUncertaintyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> freqUncertaintyThreshold;
    @XmlElementRef(name = "FreqErrorThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> freqErrorThresholdIsDefault;
    @XmlElementRef(name = "FreqErrorThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> freqErrorThreshold;
    @XmlElementRef(name = "TimeUncertaintyThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timeUncertaintyThresholdIsDefault;
    @XmlElementRef(name = "TimeUncertaintyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeUncertaintyThreshold;
    @XmlElementRef(name = "SlewRateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> slewRateIsDefault;
    @XmlElementRef(name = "SlewRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> slewRate;
    @XmlElementRef(name = "GpsLeapSecondsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gpsLeapSecondsIsDefault;
    @XmlElementRef(name = "GpsLeapSeconds", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gpsLeapSeconds;
    @XmlElementRef(name = "ResyncSlewRateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> resyncSlewRateIsDefault;
    @XmlElementRef(name = "ResyncSlewRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> resyncSlewRate;

    /**
     * Gets the value of the stratumGnssIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumGnssIsDefault() {
        return stratumGnssIsDefault;
    }

    /**
     * Sets the value of the stratumGnssIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumGnssIsDefault(JAXBElement<Boolean> value) {
        this.stratumGnssIsDefault = value;
    }

    /**
     * Gets the value of the stratumGnss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumGnss() {
        return stratumGnss;
    }

    /**
     * Sets the value of the stratumGnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumGnss(JAXBElement<Integer> value) {
        this.stratumGnss = value;
    }

    /**
     * Gets the value of the stratumPtpIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumPtpIsDefault() {
        return stratumPtpIsDefault;
    }

    /**
     * Sets the value of the stratumPtpIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumPtpIsDefault(JAXBElement<Boolean> value) {
        this.stratumPtpIsDefault = value;
    }

    /**
     * Gets the value of the stratumPtp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumPtp() {
        return stratumPtp;
    }

    /**
     * Sets the value of the stratumPtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumPtp(JAXBElement<Integer> value) {
        this.stratumPtp = value;
    }

    /**
     * Gets the value of the stratumNlmIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumNlmIsDefault() {
        return stratumNlmIsDefault;
    }

    /**
     * Sets the value of the stratumNlmIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumNlmIsDefault(JAXBElement<Boolean> value) {
        this.stratumNlmIsDefault = value;
    }

    /**
     * Gets the value of the stratumNlm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumNlm() {
        return stratumNlm;
    }

    /**
     * Sets the value of the stratumNlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumNlm(JAXBElement<Integer> value) {
        this.stratumNlm = value;
    }

    /**
     * Gets the value of the stratumDenbIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumDenbIsDefault() {
        return stratumDenbIsDefault;
    }

    /**
     * Sets the value of the stratumDenbIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumDenbIsDefault(JAXBElement<Boolean> value) {
        this.stratumDenbIsDefault = value;
    }

    /**
     * Gets the value of the stratumDenb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumDenb() {
        return stratumDenb;
    }

    /**
     * Sets the value of the stratumDenb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumDenb(JAXBElement<Integer> value) {
        this.stratumDenb = value;
    }

    /**
     * Gets the value of the stratumGponIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStratumGponIsDefault() {
        return stratumGponIsDefault;
    }

    /**
     * Sets the value of the stratumGponIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStratumGponIsDefault(JAXBElement<Boolean> value) {
        this.stratumGponIsDefault = value;
    }

    /**
     * Gets the value of the stratumGpon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStratumGpon() {
        return stratumGpon;
    }

    /**
     * Sets the value of the stratumGpon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStratumGpon(JAXBElement<Integer> value) {
        this.stratumGpon = value;
    }

    /**
     * Gets the value of the timeToLockIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimeToLockIsDefault() {
        return timeToLockIsDefault;
    }

    /**
     * Sets the value of the timeToLockIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimeToLockIsDefault(JAXBElement<Boolean> value) {
        this.timeToLockIsDefault = value;
    }

    /**
     * Gets the value of the timeToLock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeToLock() {
        return timeToLock;
    }

    /**
     * Sets the value of the timeToLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeToLock(JAXBElement<Integer> value) {
        this.timeToLock = value;
    }

    /**
     * Gets the value of the rebootTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRebootTimerIsDefault() {
        return rebootTimerIsDefault;
    }

    /**
     * Sets the value of the rebootTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRebootTimerIsDefault(JAXBElement<Boolean> value) {
        this.rebootTimerIsDefault = value;
    }

    /**
     * Gets the value of the rebootTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRebootTimer() {
        return rebootTimer;
    }

    /**
     * Sets the value of the rebootTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRebootTimer(JAXBElement<Integer> value) {
        this.rebootTimer = value;
    }

    /**
     * Gets the value of the forceTimeSyncIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForceTimeSyncIsDefault() {
        return forceTimeSyncIsDefault;
    }

    /**
     * Sets the value of the forceTimeSyncIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForceTimeSyncIsDefault(JAXBElement<Boolean> value) {
        this.forceTimeSyncIsDefault = value;
    }

    /**
     * Gets the value of the forceTimeSync property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getForceTimeSync() {
        return forceTimeSync;
    }

    /**
     * Sets the value of the forceTimeSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setForceTimeSync(JAXBElement<EnabledStates> value) {
        this.forceTimeSync = value;
    }

    /**
     * Gets the value of the ptpSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcDisqualificationThresholdIsDefault() {
        return ptpSyncSrcDisqualificationThresholdIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcDisqualificationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcDisqualificationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcDisqualificationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcDisqualificationThreshold() {
        return ptpSyncSrcDisqualificationThreshold;
    }

    /**
     * Sets the value of the ptpSyncSrcDisqualificationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcDisqualificationThreshold(JAXBElement<Integer> value) {
        this.ptpSyncSrcDisqualificationThreshold = value;
    }

    /**
     * Gets the value of the ptpSyncSrcPromotionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcPromotionThresholdIsDefault() {
        return ptpSyncSrcPromotionThresholdIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcPromotionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcPromotionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcPromotionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcPromotionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcPromotionThreshold() {
        return ptpSyncSrcPromotionThreshold;
    }

    /**
     * Sets the value of the ptpSyncSrcPromotionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcPromotionThreshold(JAXBElement<Integer> value) {
        this.ptpSyncSrcPromotionThreshold = value;
    }

    /**
     * Gets the value of the ptpSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcSynchronizationThresholdIsDefault() {
        return ptpSyncSrcSynchronizationThresholdIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcSynchronizationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcSynchronizationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcSynchronizationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcSynchronizationThreshold() {
        return ptpSyncSrcSynchronizationThreshold;
    }

    /**
     * Sets the value of the ptpSyncSrcSynchronizationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcSynchronizationThreshold(JAXBElement<Integer> value) {
        this.ptpSyncSrcSynchronizationThreshold = value;
    }

    /**
     * Gets the value of the ptpSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcFrequencyCoefficientIsDefault() {
        return ptpSyncSrcFrequencyCoefficientIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcFrequencyCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcFrequencyCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcFrequencyCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcFrequencyCoefficient() {
        return ptpSyncSrcFrequencyCoefficient;
    }

    /**
     * Sets the value of the ptpSyncSrcFrequencyCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcFrequencyCoefficient(JAXBElement<Integer> value) {
        this.ptpSyncSrcFrequencyCoefficient = value;
    }

    /**
     * Gets the value of the ptpSyncSrcTimeCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcTimeCoefficientIsDefault() {
        return ptpSyncSrcTimeCoefficientIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcTimeCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcTimeCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcTimeCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcTimeCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcTimeCoefficient() {
        return ptpSyncSrcTimeCoefficient;
    }

    /**
     * Sets the value of the ptpSyncSrcTimeCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcTimeCoefficient(JAXBElement<Integer> value) {
        this.ptpSyncSrcTimeCoefficient = value;
    }

    /**
     * Gets the value of the ptpSyncSrcSyncIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPtpSyncSrcSyncIntervalIsDefault() {
        return ptpSyncSrcSyncIntervalIsDefault;
    }

    /**
     * Sets the value of the ptpSyncSrcSyncIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPtpSyncSrcSyncIntervalIsDefault(JAXBElement<Boolean> value) {
        this.ptpSyncSrcSyncIntervalIsDefault = value;
    }

    /**
     * Gets the value of the ptpSyncSrcSyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpSyncSrcSyncInterval() {
        return ptpSyncSrcSyncInterval;
    }

    /**
     * Sets the value of the ptpSyncSrcSyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpSyncSrcSyncInterval(JAXBElement<Integer> value) {
        this.ptpSyncSrcSyncInterval = value;
    }

    /**
     * Gets the value of the gpsSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcDisqualificationThresholdIsDefault() {
        return gpsSyncSrcDisqualificationThresholdIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcDisqualificationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcDisqualificationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcDisqualificationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcDisqualificationThreshold() {
        return gpsSyncSrcDisqualificationThreshold;
    }

    /**
     * Sets the value of the gpsSyncSrcDisqualificationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcDisqualificationThreshold(JAXBElement<Integer> value) {
        this.gpsSyncSrcDisqualificationThreshold = value;
    }

    /**
     * Gets the value of the gpsSyncSrcPromotionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcPromotionThresholdIsDefault() {
        return gpsSyncSrcPromotionThresholdIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcPromotionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcPromotionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcPromotionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcPromotionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcPromotionThreshold() {
        return gpsSyncSrcPromotionThreshold;
    }

    /**
     * Sets the value of the gpsSyncSrcPromotionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcPromotionThreshold(JAXBElement<Integer> value) {
        this.gpsSyncSrcPromotionThreshold = value;
    }

    /**
     * Gets the value of the gpsSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcSynchronizationThresholdIsDefault() {
        return gpsSyncSrcSynchronizationThresholdIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcSynchronizationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcSynchronizationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcSynchronizationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcSynchronizationThreshold() {
        return gpsSyncSrcSynchronizationThreshold;
    }

    /**
     * Sets the value of the gpsSyncSrcSynchronizationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcSynchronizationThreshold(JAXBElement<Integer> value) {
        this.gpsSyncSrcSynchronizationThreshold = value;
    }

    /**
     * Gets the value of the gpsSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcFrequencyCoefficientIsDefault() {
        return gpsSyncSrcFrequencyCoefficientIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcFrequencyCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcFrequencyCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcFrequencyCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcFrequencyCoefficient() {
        return gpsSyncSrcFrequencyCoefficient;
    }

    /**
     * Sets the value of the gpsSyncSrcFrequencyCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcFrequencyCoefficient(JAXBElement<Integer> value) {
        this.gpsSyncSrcFrequencyCoefficient = value;
    }

    /**
     * Gets the value of the gpsSyncSrcTimeCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcTimeCoefficientIsDefault() {
        return gpsSyncSrcTimeCoefficientIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcTimeCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcTimeCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcTimeCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcTimeCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcTimeCoefficient() {
        return gpsSyncSrcTimeCoefficient;
    }

    /**
     * Sets the value of the gpsSyncSrcTimeCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcTimeCoefficient(JAXBElement<Integer> value) {
        this.gpsSyncSrcTimeCoefficient = value;
    }

    /**
     * Gets the value of the gpsSyncSrcSyncIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsSyncSrcSyncIntervalIsDefault() {
        return gpsSyncSrcSyncIntervalIsDefault;
    }

    /**
     * Sets the value of the gpsSyncSrcSyncIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsSyncSrcSyncIntervalIsDefault(JAXBElement<Boolean> value) {
        this.gpsSyncSrcSyncIntervalIsDefault = value;
    }

    /**
     * Gets the value of the gpsSyncSrcSyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsSyncSrcSyncInterval() {
        return gpsSyncSrcSyncInterval;
    }

    /**
     * Sets the value of the gpsSyncSrcSyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsSyncSrcSyncInterval(JAXBElement<Integer> value) {
        this.gpsSyncSrcSyncInterval = value;
    }

    /**
     * Gets the value of the nlSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcDisqualificationThresholdIsDefault() {
        return nlSyncSrcDisqualificationThresholdIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcDisqualificationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcDisqualificationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcDisqualificationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcDisqualificationThreshold() {
        return nlSyncSrcDisqualificationThreshold;
    }

    /**
     * Sets the value of the nlSyncSrcDisqualificationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcDisqualificationThreshold(JAXBElement<Integer> value) {
        this.nlSyncSrcDisqualificationThreshold = value;
    }

    /**
     * Gets the value of the nlSyncSrcPromotionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcPromotionThresholdIsDefault() {
        return nlSyncSrcPromotionThresholdIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcPromotionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcPromotionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcPromotionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcPromotionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcPromotionThreshold() {
        return nlSyncSrcPromotionThreshold;
    }

    /**
     * Sets the value of the nlSyncSrcPromotionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcPromotionThreshold(JAXBElement<Integer> value) {
        this.nlSyncSrcPromotionThreshold = value;
    }

    /**
     * Gets the value of the nlSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcSynchronizationThresholdIsDefault() {
        return nlSyncSrcSynchronizationThresholdIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcSynchronizationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcSynchronizationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcSynchronizationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcSynchronizationThreshold() {
        return nlSyncSrcSynchronizationThreshold;
    }

    /**
     * Sets the value of the nlSyncSrcSynchronizationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcSynchronizationThreshold(JAXBElement<Integer> value) {
        this.nlSyncSrcSynchronizationThreshold = value;
    }

    /**
     * Gets the value of the nlSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcFrequencyCoefficientIsDefault() {
        return nlSyncSrcFrequencyCoefficientIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcFrequencyCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcFrequencyCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcFrequencyCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcFrequencyCoefficient() {
        return nlSyncSrcFrequencyCoefficient;
    }

    /**
     * Sets the value of the nlSyncSrcFrequencyCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcFrequencyCoefficient(JAXBElement<Integer> value) {
        this.nlSyncSrcFrequencyCoefficient = value;
    }

    /**
     * Gets the value of the nlSyncSrcTimeCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcTimeCoefficientIsDefault() {
        return nlSyncSrcTimeCoefficientIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcTimeCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcTimeCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcTimeCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcTimeCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcTimeCoefficient() {
        return nlSyncSrcTimeCoefficient;
    }

    /**
     * Sets the value of the nlSyncSrcTimeCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcTimeCoefficient(JAXBElement<Integer> value) {
        this.nlSyncSrcTimeCoefficient = value;
    }

    /**
     * Gets the value of the nlSyncSrcSyncIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlSyncSrcSyncIntervalIsDefault() {
        return nlSyncSrcSyncIntervalIsDefault;
    }

    /**
     * Sets the value of the nlSyncSrcSyncIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlSyncSrcSyncIntervalIsDefault(JAXBElement<Boolean> value) {
        this.nlSyncSrcSyncIntervalIsDefault = value;
    }

    /**
     * Gets the value of the nlSyncSrcSyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncSrcSyncInterval() {
        return nlSyncSrcSyncInterval;
    }

    /**
     * Sets the value of the nlSyncSrcSyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncSrcSyncInterval(JAXBElement<Integer> value) {
        this.nlSyncSrcSyncInterval = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcDisqualificationThresholdIsDefault() {
        return extPpsSyncSrcDisqualificationThresholdIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcDisqualificationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcDisqualificationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcDisqualificationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcDisqualificationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcDisqualificationThreshold() {
        return extPpsSyncSrcDisqualificationThreshold;
    }

    /**
     * Sets the value of the extPpsSyncSrcDisqualificationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcDisqualificationThreshold(JAXBElement<Integer> value) {
        this.extPpsSyncSrcDisqualificationThreshold = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcPromotionThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcPromotionThresholdIsDefault() {
        return extPpsSyncSrcPromotionThresholdIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcPromotionThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcPromotionThresholdIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcPromotionThresholdIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcPromotionThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcPromotionThreshold() {
        return extPpsSyncSrcPromotionThreshold;
    }

    /**
     * Sets the value of the extPpsSyncSrcPromotionThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcPromotionThreshold(JAXBElement<Integer> value) {
        this.extPpsSyncSrcPromotionThreshold = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcSynchronizationThresholdIsDefault() {
        return extPpsSyncSrcSynchronizationThresholdIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcSynchronizationThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcSynchronizationThresholdIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcSynchronizationThresholdIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcSynchronizationThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcSynchronizationThreshold() {
        return extPpsSyncSrcSynchronizationThreshold;
    }

    /**
     * Sets the value of the extPpsSyncSrcSynchronizationThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcSynchronizationThreshold(JAXBElement<Integer> value) {
        this.extPpsSyncSrcSynchronizationThreshold = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcFrequencyCoefficientIsDefault() {
        return extPpsSyncSrcFrequencyCoefficientIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcFrequencyCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcFrequencyCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcFrequencyCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcFrequencyCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcFrequencyCoefficient() {
        return extPpsSyncSrcFrequencyCoefficient;
    }

    /**
     * Sets the value of the extPpsSyncSrcFrequencyCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcFrequencyCoefficient(JAXBElement<Integer> value) {
        this.extPpsSyncSrcFrequencyCoefficient = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcTimeCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcTimeCoefficientIsDefault() {
        return extPpsSyncSrcTimeCoefficientIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcTimeCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcTimeCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcTimeCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcTimeCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcTimeCoefficient() {
        return extPpsSyncSrcTimeCoefficient;
    }

    /**
     * Sets the value of the extPpsSyncSrcTimeCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcTimeCoefficient(JAXBElement<Integer> value) {
        this.extPpsSyncSrcTimeCoefficient = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcSyncIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPpsSyncSrcSyncIntervalIsDefault() {
        return extPpsSyncSrcSyncIntervalIsDefault;
    }

    /**
     * Sets the value of the extPpsSyncSrcSyncIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPpsSyncSrcSyncIntervalIsDefault(JAXBElement<Boolean> value) {
        this.extPpsSyncSrcSyncIntervalIsDefault = value;
    }

    /**
     * Gets the value of the extPpsSyncSrcSyncInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPpsSyncSrcSyncInterval() {
        return extPpsSyncSrcSyncInterval;
    }

    /**
     * Sets the value of the extPpsSyncSrcSyncInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPpsSyncSrcSyncInterval(JAXBElement<Integer> value) {
        this.extPpsSyncSrcSyncInterval = value;
    }

    /**
     * Gets the value of the syncModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSyncModeIsDefault() {
        return syncModeIsDefault;
    }

    /**
     * Sets the value of the syncModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSyncModeIsDefault(JAXBElement<Boolean> value) {
        this.syncModeIsDefault = value;
    }

    /**
     * Gets the value of the syncMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncModes }{@code >}
     *     
     */
    public JAXBElement<SyncModes> getSyncMode() {
        return syncMode;
    }

    /**
     * Sets the value of the syncMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncModes }{@code >}
     *     
     */
    public void setSyncMode(JAXBElement<SyncModes> value) {
        this.syncMode = value;
    }

    /**
     * Gets the value of the maxFreqErrorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxFreqErrorIsDefault() {
        return maxFreqErrorIsDefault;
    }

    /**
     * Sets the value of the maxFreqErrorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxFreqErrorIsDefault(JAXBElement<Boolean> value) {
        this.maxFreqErrorIsDefault = value;
    }

    /**
     * Gets the value of the maxFreqError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxFreqError() {
        return maxFreqError;
    }

    /**
     * Sets the value of the maxFreqError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxFreqError(JAXBElement<Integer> value) {
        this.maxFreqError = value;
    }

    /**
     * Gets the value of the maxTimeErrorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxTimeErrorIsDefault() {
        return maxTimeErrorIsDefault;
    }

    /**
     * Sets the value of the maxTimeErrorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxTimeErrorIsDefault(JAXBElement<Boolean> value) {
        this.maxTimeErrorIsDefault = value;
    }

    /**
     * Gets the value of the maxTimeError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxTimeError() {
        return maxTimeError;
    }

    /**
     * Sets the value of the maxTimeError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxTimeError(JAXBElement<Integer> value) {
        this.maxTimeError = value;
    }

    /**
     * Gets the value of the freqUncertaintyThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFreqUncertaintyThresholdIsDefault() {
        return freqUncertaintyThresholdIsDefault;
    }

    /**
     * Sets the value of the freqUncertaintyThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFreqUncertaintyThresholdIsDefault(JAXBElement<Boolean> value) {
        this.freqUncertaintyThresholdIsDefault = value;
    }

    /**
     * Gets the value of the freqUncertaintyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFreqUncertaintyThreshold() {
        return freqUncertaintyThreshold;
    }

    /**
     * Sets the value of the freqUncertaintyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFreqUncertaintyThreshold(JAXBElement<Integer> value) {
        this.freqUncertaintyThreshold = value;
    }

    /**
     * Gets the value of the freqErrorThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFreqErrorThresholdIsDefault() {
        return freqErrorThresholdIsDefault;
    }

    /**
     * Sets the value of the freqErrorThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFreqErrorThresholdIsDefault(JAXBElement<Boolean> value) {
        this.freqErrorThresholdIsDefault = value;
    }

    /**
     * Gets the value of the freqErrorThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFreqErrorThreshold() {
        return freqErrorThreshold;
    }

    /**
     * Sets the value of the freqErrorThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFreqErrorThreshold(JAXBElement<Integer> value) {
        this.freqErrorThreshold = value;
    }

    /**
     * Gets the value of the timeUncertaintyThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimeUncertaintyThresholdIsDefault() {
        return timeUncertaintyThresholdIsDefault;
    }

    /**
     * Sets the value of the timeUncertaintyThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimeUncertaintyThresholdIsDefault(JAXBElement<Boolean> value) {
        this.timeUncertaintyThresholdIsDefault = value;
    }

    /**
     * Gets the value of the timeUncertaintyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeUncertaintyThreshold() {
        return timeUncertaintyThreshold;
    }

    /**
     * Sets the value of the timeUncertaintyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeUncertaintyThreshold(JAXBElement<Integer> value) {
        this.timeUncertaintyThreshold = value;
    }

    /**
     * Gets the value of the slewRateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSlewRateIsDefault() {
        return slewRateIsDefault;
    }

    /**
     * Sets the value of the slewRateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSlewRateIsDefault(JAXBElement<Boolean> value) {
        this.slewRateIsDefault = value;
    }

    /**
     * Gets the value of the slewRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSlewRate() {
        return slewRate;
    }

    /**
     * Sets the value of the slewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSlewRate(JAXBElement<Integer> value) {
        this.slewRate = value;
    }

    /**
     * Gets the value of the gpsLeapSecondsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGpsLeapSecondsIsDefault() {
        return gpsLeapSecondsIsDefault;
    }

    /**
     * Sets the value of the gpsLeapSecondsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGpsLeapSecondsIsDefault(JAXBElement<Boolean> value) {
        this.gpsLeapSecondsIsDefault = value;
    }

    /**
     * Gets the value of the gpsLeapSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGpsLeapSeconds() {
        return gpsLeapSeconds;
    }

    /**
     * Sets the value of the gpsLeapSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGpsLeapSeconds(JAXBElement<Integer> value) {
        this.gpsLeapSeconds = value;
    }

    /**
     * Gets the value of the resyncSlewRateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getResyncSlewRateIsDefault() {
        return resyncSlewRateIsDefault;
    }

    /**
     * Sets the value of the resyncSlewRateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setResyncSlewRateIsDefault(JAXBElement<Boolean> value) {
        this.resyncSlewRateIsDefault = value;
    }

    /**
     * Gets the value of the resyncSlewRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResyncSlewRate() {
        return resyncSlewRate;
    }

    /**
     * Sets the value of the resyncSlewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResyncSlewRate(JAXBElement<Integer> value) {
        this.resyncSlewRate = value;
    }

}
