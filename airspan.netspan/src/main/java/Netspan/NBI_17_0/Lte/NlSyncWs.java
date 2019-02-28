
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NlSyncWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NlSyncWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PciStartIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PciEndIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PciEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrpThresholdForNlSyncIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RsrpThresholdForNlSync" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyOffsetLockThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyOffsetLockThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhaseOffsetLockThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhaseOffsetLockThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyUncertaintyLockThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyUncertaintyLockThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhaseUncertaintyLockThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhaseUncertaintyLockThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyHysteresisIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FrequencyHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhaseHysteresisIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PhaseHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialSynchronizationSamplingIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InitialSynchronizationSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumSynchronizationSamplingIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumSynchronizationSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSynchronizationSamplingIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSynchronizationSamplingInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumIterationsTriggerSyncIntervalIncreaseIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumIterationsTriggerSyncIntervalIncrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumIterationsTriggerSyncIntervalDecreaseIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumIterationsTriggerSyncIntervalDecrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationSamplingIntervalIncreaseIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationSamplingIntervalIncrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationSamplingIntervalDecreaseIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationSamplingIntervalDecrease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriorityReversionIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PriorityReversion" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NumberofSib1ReadingRetriesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberofSib1ReadingRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberofIterationsTillLockedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberofIterationsTillLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MarginForNumberofIterationsTillLockedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MarginForNumberofIterationsTillLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SonInformationRequestPeriodicityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonInformationRequestPeriodicity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="S1ResponseTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1ResponseTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNumberofConsecutiveLostCellSyncReportsReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumReTxQmiMessagesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumReTxQmiMessages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoldoverTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoldoverTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UnavailabilityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UnavailabilityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnforcePwsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnforcePws" type="{http://Airspan.Netspan.WebServices}TrueFalseStates" minOccurs="0"/&gt;
 *         &lt;element name="SyncMonitorIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SyncMonitorInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinimumStratumLevelIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumStratumLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FilterCoefficientIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FilterCoefficient" type="{http://Airspan.Netspan.WebServices}FilterCoefficientNlmValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NlSyncWs", propOrder = {
    "pciStartIsDefault",
    "pciStart",
    "pciEndIsDefault",
    "pciEnd",
    "rsrpThresholdForNlSyncIsDefault",
    "rsrpThresholdForNlSync",
    "frequencyOffsetLockThresholdIsDefault",
    "frequencyOffsetLockThreshold",
    "phaseOffsetLockThresholdIsDefault",
    "phaseOffsetLockThreshold",
    "frequencyUncertaintyLockThresholdIsDefault",
    "frequencyUncertaintyLockThreshold",
    "phaseUncertaintyLockThresholdIsDefault",
    "phaseUncertaintyLockThreshold",
    "frequencyHysteresisIsDefault",
    "frequencyHysteresis",
    "phaseHysteresisIsDefault",
    "phaseHysteresis",
    "initialSynchronizationSamplingIntervalIsDefault",
    "initialSynchronizationSamplingInterval",
    "maximumSynchronizationSamplingIntervalIsDefault",
    "maximumSynchronizationSamplingInterval",
    "minimumSynchronizationSamplingIntervalIsDefault",
    "minimumSynchronizationSamplingInterval",
    "numIterationsTriggerSyncIntervalIncreaseIsDefault",
    "numIterationsTriggerSyncIntervalIncrease",
    "numIterationsTriggerSyncIntervalDecreaseIsDefault",
    "numIterationsTriggerSyncIntervalDecrease",
    "synchronizationSamplingIntervalIncreaseIsDefault",
    "synchronizationSamplingIntervalIncrease",
    "synchronizationSamplingIntervalDecreaseIsDefault",
    "synchronizationSamplingIntervalDecrease",
    "priorityReversionIsDefault",
    "priorityReversion",
    "numberofSib1ReadingRetriesIsDefault",
    "numberofSib1ReadingRetries",
    "numberofIterationsTillLockedIsDefault",
    "numberofIterationsTillLocked",
    "marginForNumberofIterationsTillLockedIsDefault",
    "marginForNumberofIterationsTillLocked",
    "sonInformationRequestPeriodicityIsDefault",
    "sonInformationRequestPeriodicity",
    "s1ResponseTimerIsDefault",
    "s1ResponseTimer",
    "maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault",
    "maximumNumberofConsecutiveLostCellSyncReportsReceived",
    "maximumReTxQmiMessagesIsDefault",
    "maximumReTxQmiMessages",
    "holdoverTimeIsDefault",
    "holdoverTime",
    "unavailabilityTimerIsDefault",
    "unavailabilityTimer",
    "enforcePwsIsDefault",
    "enforcePws",
    "syncMonitorIntervalIsDefault",
    "syncMonitorInterval",
    "minimumStratumLevelIsDefault",
    "minimumStratumLevel",
    "filterCoefficientIsDefault",
    "filterCoefficient"
})
public class NlSyncWs {

    @XmlElementRef(name = "PciStartIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciStartIsDefault;
    @XmlElementRef(name = "PciStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciStart;
    @XmlElementRef(name = "PciEndIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pciEndIsDefault;
    @XmlElementRef(name = "PciEnd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pciEnd;
    @XmlElementRef(name = "RsrpThresholdForNlSyncIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsrpThresholdForNlSyncIsDefault;
    @XmlElementRef(name = "RsrpThresholdForNlSync", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpThresholdForNlSync;
    @XmlElementRef(name = "FrequencyOffsetLockThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> frequencyOffsetLockThresholdIsDefault;
    @XmlElementRef(name = "FrequencyOffsetLockThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequencyOffsetLockThreshold;
    @XmlElementRef(name = "PhaseOffsetLockThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phaseOffsetLockThresholdIsDefault;
    @XmlElementRef(name = "PhaseOffsetLockThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> phaseOffsetLockThreshold;
    @XmlElementRef(name = "FrequencyUncertaintyLockThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> frequencyUncertaintyLockThresholdIsDefault;
    @XmlElementRef(name = "FrequencyUncertaintyLockThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequencyUncertaintyLockThreshold;
    @XmlElementRef(name = "PhaseUncertaintyLockThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phaseUncertaintyLockThresholdIsDefault;
    @XmlElementRef(name = "PhaseUncertaintyLockThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> phaseUncertaintyLockThreshold;
    @XmlElementRef(name = "FrequencyHysteresisIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> frequencyHysteresisIsDefault;
    @XmlElementRef(name = "FrequencyHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequencyHysteresis;
    @XmlElementRef(name = "PhaseHysteresisIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phaseHysteresisIsDefault;
    @XmlElementRef(name = "PhaseHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> phaseHysteresis;
    @XmlElementRef(name = "InitialSynchronizationSamplingIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> initialSynchronizationSamplingIntervalIsDefault;
    @XmlElementRef(name = "InitialSynchronizationSamplingInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialSynchronizationSamplingInterval;
    @XmlElementRef(name = "MaximumSynchronizationSamplingIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumSynchronizationSamplingIntervalIsDefault;
    @XmlElementRef(name = "MaximumSynchronizationSamplingInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumSynchronizationSamplingInterval;
    @XmlElementRef(name = "MinimumSynchronizationSamplingIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minimumSynchronizationSamplingIntervalIsDefault;
    @XmlElementRef(name = "MinimumSynchronizationSamplingInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minimumSynchronizationSamplingInterval;
    @XmlElementRef(name = "NumIterationsTriggerSyncIntervalIncreaseIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numIterationsTriggerSyncIntervalIncreaseIsDefault;
    @XmlElementRef(name = "NumIterationsTriggerSyncIntervalIncrease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numIterationsTriggerSyncIntervalIncrease;
    @XmlElementRef(name = "NumIterationsTriggerSyncIntervalDecreaseIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numIterationsTriggerSyncIntervalDecreaseIsDefault;
    @XmlElementRef(name = "NumIterationsTriggerSyncIntervalDecrease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numIterationsTriggerSyncIntervalDecrease;
    @XmlElementRef(name = "SynchronizationSamplingIntervalIncreaseIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationSamplingIntervalIncreaseIsDefault;
    @XmlElementRef(name = "SynchronizationSamplingIntervalIncrease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationSamplingIntervalIncrease;
    @XmlElementRef(name = "SynchronizationSamplingIntervalDecreaseIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> synchronizationSamplingIntervalDecreaseIsDefault;
    @XmlElementRef(name = "SynchronizationSamplingIntervalDecrease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> synchronizationSamplingIntervalDecrease;
    @XmlElementRef(name = "PriorityReversionIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> priorityReversionIsDefault;
    @XmlElementRef(name = "PriorityReversion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> priorityReversion;
    @XmlElementRef(name = "NumberofSib1ReadingRetriesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberofSib1ReadingRetriesIsDefault;
    @XmlElementRef(name = "NumberofSib1ReadingRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberofSib1ReadingRetries;
    @XmlElementRef(name = "NumberofIterationsTillLockedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberofIterationsTillLockedIsDefault;
    @XmlElementRef(name = "NumberofIterationsTillLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberofIterationsTillLocked;
    @XmlElementRef(name = "MarginForNumberofIterationsTillLockedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> marginForNumberofIterationsTillLockedIsDefault;
    @XmlElementRef(name = "MarginForNumberofIterationsTillLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> marginForNumberofIterationsTillLocked;
    @XmlElementRef(name = "SonInformationRequestPeriodicityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonInformationRequestPeriodicityIsDefault;
    @XmlElementRef(name = "SonInformationRequestPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sonInformationRequestPeriodicity;
    @XmlElementRef(name = "S1ResponseTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1ResponseTimerIsDefault;
    @XmlElementRef(name = "S1ResponseTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1ResponseTimer;
    @XmlElementRef(name = "MaximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault;
    @XmlElementRef(name = "MaximumNumberofConsecutiveLostCellSyncReportsReceived", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumNumberofConsecutiveLostCellSyncReportsReceived;
    @XmlElementRef(name = "MaximumReTxQmiMessagesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maximumReTxQmiMessagesIsDefault;
    @XmlElementRef(name = "MaximumReTxQmiMessages", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumReTxQmiMessages;
    @XmlElementRef(name = "HoldoverTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> holdoverTimeIsDefault;
    @XmlElementRef(name = "HoldoverTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> holdoverTime;
    @XmlElementRef(name = "UnavailabilityTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> unavailabilityTimerIsDefault;
    @XmlElementRef(name = "UnavailabilityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> unavailabilityTimer;
    @XmlElementRef(name = "EnforcePwsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enforcePwsIsDefault;
    @XmlElementRef(name = "EnforcePws", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TrueFalseStates> enforcePws;
    @XmlElementRef(name = "SyncMonitorIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> syncMonitorIntervalIsDefault;
    @XmlElementRef(name = "SyncMonitorInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncMonitorInterval;
    @XmlElementRef(name = "MinimumStratumLevelIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minimumStratumLevelIsDefault;
    @XmlElementRef(name = "MinimumStratumLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minimumStratumLevel;
    @XmlElementRef(name = "FilterCoefficientIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> filterCoefficientIsDefault;
    @XmlElementRef(name = "FilterCoefficient", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filterCoefficient;

    /**
     * Gets the value of the pciStartIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciStartIsDefault() {
        return pciStartIsDefault;
    }

    /**
     * Sets the value of the pciStartIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciStartIsDefault(JAXBElement<Boolean> value) {
        this.pciStartIsDefault = value;
    }

    /**
     * Gets the value of the pciStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciStart() {
        return pciStart;
    }

    /**
     * Sets the value of the pciStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciStart(JAXBElement<Integer> value) {
        this.pciStart = value;
    }

    /**
     * Gets the value of the pciEndIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPciEndIsDefault() {
        return pciEndIsDefault;
    }

    /**
     * Sets the value of the pciEndIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPciEndIsDefault(JAXBElement<Boolean> value) {
        this.pciEndIsDefault = value;
    }

    /**
     * Gets the value of the pciEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPciEnd() {
        return pciEnd;
    }

    /**
     * Sets the value of the pciEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPciEnd(JAXBElement<Integer> value) {
        this.pciEnd = value;
    }

    /**
     * Gets the value of the rsrpThresholdForNlSyncIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRsrpThresholdForNlSyncIsDefault() {
        return rsrpThresholdForNlSyncIsDefault;
    }

    /**
     * Sets the value of the rsrpThresholdForNlSyncIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRsrpThresholdForNlSyncIsDefault(JAXBElement<Boolean> value) {
        this.rsrpThresholdForNlSyncIsDefault = value;
    }

    /**
     * Gets the value of the rsrpThresholdForNlSync property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpThresholdForNlSync() {
        return rsrpThresholdForNlSync;
    }

    /**
     * Sets the value of the rsrpThresholdForNlSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpThresholdForNlSync(JAXBElement<Integer> value) {
        this.rsrpThresholdForNlSync = value;
    }

    /**
     * Gets the value of the frequencyOffsetLockThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFrequencyOffsetLockThresholdIsDefault() {
        return frequencyOffsetLockThresholdIsDefault;
    }

    /**
     * Sets the value of the frequencyOffsetLockThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFrequencyOffsetLockThresholdIsDefault(JAXBElement<Boolean> value) {
        this.frequencyOffsetLockThresholdIsDefault = value;
    }

    /**
     * Gets the value of the frequencyOffsetLockThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequencyOffsetLockThreshold() {
        return frequencyOffsetLockThreshold;
    }

    /**
     * Sets the value of the frequencyOffsetLockThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequencyOffsetLockThreshold(JAXBElement<Integer> value) {
        this.frequencyOffsetLockThreshold = value;
    }

    /**
     * Gets the value of the phaseOffsetLockThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhaseOffsetLockThresholdIsDefault() {
        return phaseOffsetLockThresholdIsDefault;
    }

    /**
     * Sets the value of the phaseOffsetLockThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhaseOffsetLockThresholdIsDefault(JAXBElement<Boolean> value) {
        this.phaseOffsetLockThresholdIsDefault = value;
    }

    /**
     * Gets the value of the phaseOffsetLockThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhaseOffsetLockThreshold() {
        return phaseOffsetLockThreshold;
    }

    /**
     * Sets the value of the phaseOffsetLockThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhaseOffsetLockThreshold(JAXBElement<Integer> value) {
        this.phaseOffsetLockThreshold = value;
    }

    /**
     * Gets the value of the frequencyUncertaintyLockThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFrequencyUncertaintyLockThresholdIsDefault() {
        return frequencyUncertaintyLockThresholdIsDefault;
    }

    /**
     * Sets the value of the frequencyUncertaintyLockThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFrequencyUncertaintyLockThresholdIsDefault(JAXBElement<Boolean> value) {
        this.frequencyUncertaintyLockThresholdIsDefault = value;
    }

    /**
     * Gets the value of the frequencyUncertaintyLockThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequencyUncertaintyLockThreshold() {
        return frequencyUncertaintyLockThreshold;
    }

    /**
     * Sets the value of the frequencyUncertaintyLockThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequencyUncertaintyLockThreshold(JAXBElement<Integer> value) {
        this.frequencyUncertaintyLockThreshold = value;
    }

    /**
     * Gets the value of the phaseUncertaintyLockThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhaseUncertaintyLockThresholdIsDefault() {
        return phaseUncertaintyLockThresholdIsDefault;
    }

    /**
     * Sets the value of the phaseUncertaintyLockThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhaseUncertaintyLockThresholdIsDefault(JAXBElement<Boolean> value) {
        this.phaseUncertaintyLockThresholdIsDefault = value;
    }

    /**
     * Gets the value of the phaseUncertaintyLockThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhaseUncertaintyLockThreshold() {
        return phaseUncertaintyLockThreshold;
    }

    /**
     * Sets the value of the phaseUncertaintyLockThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhaseUncertaintyLockThreshold(JAXBElement<Integer> value) {
        this.phaseUncertaintyLockThreshold = value;
    }

    /**
     * Gets the value of the frequencyHysteresisIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFrequencyHysteresisIsDefault() {
        return frequencyHysteresisIsDefault;
    }

    /**
     * Sets the value of the frequencyHysteresisIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFrequencyHysteresisIsDefault(JAXBElement<Boolean> value) {
        this.frequencyHysteresisIsDefault = value;
    }

    /**
     * Gets the value of the frequencyHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequencyHysteresis() {
        return frequencyHysteresis;
    }

    /**
     * Sets the value of the frequencyHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequencyHysteresis(JAXBElement<Integer> value) {
        this.frequencyHysteresis = value;
    }

    /**
     * Gets the value of the phaseHysteresisIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhaseHysteresisIsDefault() {
        return phaseHysteresisIsDefault;
    }

    /**
     * Sets the value of the phaseHysteresisIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhaseHysteresisIsDefault(JAXBElement<Boolean> value) {
        this.phaseHysteresisIsDefault = value;
    }

    /**
     * Gets the value of the phaseHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhaseHysteresis() {
        return phaseHysteresis;
    }

    /**
     * Sets the value of the phaseHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhaseHysteresis(JAXBElement<Integer> value) {
        this.phaseHysteresis = value;
    }

    /**
     * Gets the value of the initialSynchronizationSamplingIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInitialSynchronizationSamplingIntervalIsDefault() {
        return initialSynchronizationSamplingIntervalIsDefault;
    }

    /**
     * Sets the value of the initialSynchronizationSamplingIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInitialSynchronizationSamplingIntervalIsDefault(JAXBElement<Boolean> value) {
        this.initialSynchronizationSamplingIntervalIsDefault = value;
    }

    /**
     * Gets the value of the initialSynchronizationSamplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialSynchronizationSamplingInterval() {
        return initialSynchronizationSamplingInterval;
    }

    /**
     * Sets the value of the initialSynchronizationSamplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialSynchronizationSamplingInterval(JAXBElement<Integer> value) {
        this.initialSynchronizationSamplingInterval = value;
    }

    /**
     * Gets the value of the maximumSynchronizationSamplingIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumSynchronizationSamplingIntervalIsDefault() {
        return maximumSynchronizationSamplingIntervalIsDefault;
    }

    /**
     * Sets the value of the maximumSynchronizationSamplingIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumSynchronizationSamplingIntervalIsDefault(JAXBElement<Boolean> value) {
        this.maximumSynchronizationSamplingIntervalIsDefault = value;
    }

    /**
     * Gets the value of the maximumSynchronizationSamplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumSynchronizationSamplingInterval() {
        return maximumSynchronizationSamplingInterval;
    }

    /**
     * Sets the value of the maximumSynchronizationSamplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumSynchronizationSamplingInterval(JAXBElement<Integer> value) {
        this.maximumSynchronizationSamplingInterval = value;
    }

    /**
     * Gets the value of the minimumSynchronizationSamplingIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinimumSynchronizationSamplingIntervalIsDefault() {
        return minimumSynchronizationSamplingIntervalIsDefault;
    }

    /**
     * Sets the value of the minimumSynchronizationSamplingIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinimumSynchronizationSamplingIntervalIsDefault(JAXBElement<Boolean> value) {
        this.minimumSynchronizationSamplingIntervalIsDefault = value;
    }

    /**
     * Gets the value of the minimumSynchronizationSamplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinimumSynchronizationSamplingInterval() {
        return minimumSynchronizationSamplingInterval;
    }

    /**
     * Sets the value of the minimumSynchronizationSamplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinimumSynchronizationSamplingInterval(JAXBElement<Integer> value) {
        this.minimumSynchronizationSamplingInterval = value;
    }

    /**
     * Gets the value of the numIterationsTriggerSyncIntervalIncreaseIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumIterationsTriggerSyncIntervalIncreaseIsDefault() {
        return numIterationsTriggerSyncIntervalIncreaseIsDefault;
    }

    /**
     * Sets the value of the numIterationsTriggerSyncIntervalIncreaseIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumIterationsTriggerSyncIntervalIncreaseIsDefault(JAXBElement<Boolean> value) {
        this.numIterationsTriggerSyncIntervalIncreaseIsDefault = value;
    }

    /**
     * Gets the value of the numIterationsTriggerSyncIntervalIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumIterationsTriggerSyncIntervalIncrease() {
        return numIterationsTriggerSyncIntervalIncrease;
    }

    /**
     * Sets the value of the numIterationsTriggerSyncIntervalIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumIterationsTriggerSyncIntervalIncrease(JAXBElement<Integer> value) {
        this.numIterationsTriggerSyncIntervalIncrease = value;
    }

    /**
     * Gets the value of the numIterationsTriggerSyncIntervalDecreaseIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumIterationsTriggerSyncIntervalDecreaseIsDefault() {
        return numIterationsTriggerSyncIntervalDecreaseIsDefault;
    }

    /**
     * Sets the value of the numIterationsTriggerSyncIntervalDecreaseIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumIterationsTriggerSyncIntervalDecreaseIsDefault(JAXBElement<Boolean> value) {
        this.numIterationsTriggerSyncIntervalDecreaseIsDefault = value;
    }

    /**
     * Gets the value of the numIterationsTriggerSyncIntervalDecrease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumIterationsTriggerSyncIntervalDecrease() {
        return numIterationsTriggerSyncIntervalDecrease;
    }

    /**
     * Sets the value of the numIterationsTriggerSyncIntervalDecrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumIterationsTriggerSyncIntervalDecrease(JAXBElement<Integer> value) {
        this.numIterationsTriggerSyncIntervalDecrease = value;
    }

    /**
     * Gets the value of the synchronizationSamplingIntervalIncreaseIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSynchronizationSamplingIntervalIncreaseIsDefault() {
        return synchronizationSamplingIntervalIncreaseIsDefault;
    }

    /**
     * Sets the value of the synchronizationSamplingIntervalIncreaseIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSynchronizationSamplingIntervalIncreaseIsDefault(JAXBElement<Boolean> value) {
        this.synchronizationSamplingIntervalIncreaseIsDefault = value;
    }

    /**
     * Gets the value of the synchronizationSamplingIntervalIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSynchronizationSamplingIntervalIncrease() {
        return synchronizationSamplingIntervalIncrease;
    }

    /**
     * Sets the value of the synchronizationSamplingIntervalIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSynchronizationSamplingIntervalIncrease(JAXBElement<Integer> value) {
        this.synchronizationSamplingIntervalIncrease = value;
    }

    /**
     * Gets the value of the synchronizationSamplingIntervalDecreaseIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSynchronizationSamplingIntervalDecreaseIsDefault() {
        return synchronizationSamplingIntervalDecreaseIsDefault;
    }

    /**
     * Sets the value of the synchronizationSamplingIntervalDecreaseIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSynchronizationSamplingIntervalDecreaseIsDefault(JAXBElement<Boolean> value) {
        this.synchronizationSamplingIntervalDecreaseIsDefault = value;
    }

    /**
     * Gets the value of the synchronizationSamplingIntervalDecrease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSynchronizationSamplingIntervalDecrease() {
        return synchronizationSamplingIntervalDecrease;
    }

    /**
     * Sets the value of the synchronizationSamplingIntervalDecrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSynchronizationSamplingIntervalDecrease(JAXBElement<Integer> value) {
        this.synchronizationSamplingIntervalDecrease = value;
    }

    /**
     * Gets the value of the priorityReversionIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPriorityReversionIsDefault() {
        return priorityReversionIsDefault;
    }

    /**
     * Sets the value of the priorityReversionIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPriorityReversionIsDefault(JAXBElement<Boolean> value) {
        this.priorityReversionIsDefault = value;
    }

    /**
     * Gets the value of the priorityReversion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getPriorityReversion() {
        return priorityReversion;
    }

    /**
     * Sets the value of the priorityReversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setPriorityReversion(JAXBElement<EnabledDisabledStates> value) {
        this.priorityReversion = value;
    }

    /**
     * Gets the value of the numberofSib1ReadingRetriesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberofSib1ReadingRetriesIsDefault() {
        return numberofSib1ReadingRetriesIsDefault;
    }

    /**
     * Sets the value of the numberofSib1ReadingRetriesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberofSib1ReadingRetriesIsDefault(JAXBElement<Boolean> value) {
        this.numberofSib1ReadingRetriesIsDefault = value;
    }

    /**
     * Gets the value of the numberofSib1ReadingRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberofSib1ReadingRetries() {
        return numberofSib1ReadingRetries;
    }

    /**
     * Sets the value of the numberofSib1ReadingRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberofSib1ReadingRetries(JAXBElement<Integer> value) {
        this.numberofSib1ReadingRetries = value;
    }

    /**
     * Gets the value of the numberofIterationsTillLockedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberofIterationsTillLockedIsDefault() {
        return numberofIterationsTillLockedIsDefault;
    }

    /**
     * Sets the value of the numberofIterationsTillLockedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberofIterationsTillLockedIsDefault(JAXBElement<Boolean> value) {
        this.numberofIterationsTillLockedIsDefault = value;
    }

    /**
     * Gets the value of the numberofIterationsTillLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberofIterationsTillLocked() {
        return numberofIterationsTillLocked;
    }

    /**
     * Sets the value of the numberofIterationsTillLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberofIterationsTillLocked(JAXBElement<Integer> value) {
        this.numberofIterationsTillLocked = value;
    }

    /**
     * Gets the value of the marginForNumberofIterationsTillLockedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMarginForNumberofIterationsTillLockedIsDefault() {
        return marginForNumberofIterationsTillLockedIsDefault;
    }

    /**
     * Sets the value of the marginForNumberofIterationsTillLockedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMarginForNumberofIterationsTillLockedIsDefault(JAXBElement<Boolean> value) {
        this.marginForNumberofIterationsTillLockedIsDefault = value;
    }

    /**
     * Gets the value of the marginForNumberofIterationsTillLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMarginForNumberofIterationsTillLocked() {
        return marginForNumberofIterationsTillLocked;
    }

    /**
     * Sets the value of the marginForNumberofIterationsTillLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMarginForNumberofIterationsTillLocked(JAXBElement<Integer> value) {
        this.marginForNumberofIterationsTillLocked = value;
    }

    /**
     * Gets the value of the sonInformationRequestPeriodicityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonInformationRequestPeriodicityIsDefault() {
        return sonInformationRequestPeriodicityIsDefault;
    }

    /**
     * Sets the value of the sonInformationRequestPeriodicityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonInformationRequestPeriodicityIsDefault(JAXBElement<Boolean> value) {
        this.sonInformationRequestPeriodicityIsDefault = value;
    }

    /**
     * Gets the value of the sonInformationRequestPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSonInformationRequestPeriodicity() {
        return sonInformationRequestPeriodicity;
    }

    /**
     * Sets the value of the sonInformationRequestPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSonInformationRequestPeriodicity(JAXBElement<Integer> value) {
        this.sonInformationRequestPeriodicity = value;
    }

    /**
     * Gets the value of the s1ResponseTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1ResponseTimerIsDefault() {
        return s1ResponseTimerIsDefault;
    }

    /**
     * Sets the value of the s1ResponseTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1ResponseTimerIsDefault(JAXBElement<Boolean> value) {
        this.s1ResponseTimerIsDefault = value;
    }

    /**
     * Gets the value of the s1ResponseTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1ResponseTimer() {
        return s1ResponseTimer;
    }

    /**
     * Sets the value of the s1ResponseTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1ResponseTimer(JAXBElement<Integer> value) {
        this.s1ResponseTimer = value;
    }

    /**
     * Gets the value of the maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault() {
        return maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault;
    }

    /**
     * Sets the value of the maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault(JAXBElement<Boolean> value) {
        this.maximumNumberofConsecutiveLostCellSyncReportsReceivedIsDefault = value;
    }

    /**
     * Gets the value of the maximumNumberofConsecutiveLostCellSyncReportsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumNumberofConsecutiveLostCellSyncReportsReceived() {
        return maximumNumberofConsecutiveLostCellSyncReportsReceived;
    }

    /**
     * Sets the value of the maximumNumberofConsecutiveLostCellSyncReportsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumNumberofConsecutiveLostCellSyncReportsReceived(JAXBElement<Integer> value) {
        this.maximumNumberofConsecutiveLostCellSyncReportsReceived = value;
    }

    /**
     * Gets the value of the maximumReTxQmiMessagesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaximumReTxQmiMessagesIsDefault() {
        return maximumReTxQmiMessagesIsDefault;
    }

    /**
     * Sets the value of the maximumReTxQmiMessagesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaximumReTxQmiMessagesIsDefault(JAXBElement<Boolean> value) {
        this.maximumReTxQmiMessagesIsDefault = value;
    }

    /**
     * Gets the value of the maximumReTxQmiMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumReTxQmiMessages() {
        return maximumReTxQmiMessages;
    }

    /**
     * Sets the value of the maximumReTxQmiMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumReTxQmiMessages(JAXBElement<Integer> value) {
        this.maximumReTxQmiMessages = value;
    }

    /**
     * Gets the value of the holdoverTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoldoverTimeIsDefault() {
        return holdoverTimeIsDefault;
    }

    /**
     * Sets the value of the holdoverTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoldoverTimeIsDefault(JAXBElement<Boolean> value) {
        this.holdoverTimeIsDefault = value;
    }

    /**
     * Gets the value of the holdoverTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoldoverTime() {
        return holdoverTime;
    }

    /**
     * Sets the value of the holdoverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoldoverTime(JAXBElement<Integer> value) {
        this.holdoverTime = value;
    }

    /**
     * Gets the value of the unavailabilityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUnavailabilityTimerIsDefault() {
        return unavailabilityTimerIsDefault;
    }

    /**
     * Sets the value of the unavailabilityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUnavailabilityTimerIsDefault(JAXBElement<Boolean> value) {
        this.unavailabilityTimerIsDefault = value;
    }

    /**
     * Gets the value of the unavailabilityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnavailabilityTimer() {
        return unavailabilityTimer;
    }

    /**
     * Sets the value of the unavailabilityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnavailabilityTimer(JAXBElement<Integer> value) {
        this.unavailabilityTimer = value;
    }

    /**
     * Gets the value of the enforcePwsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnforcePwsIsDefault() {
        return enforcePwsIsDefault;
    }

    /**
     * Sets the value of the enforcePwsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnforcePwsIsDefault(JAXBElement<Boolean> value) {
        this.enforcePwsIsDefault = value;
    }

    /**
     * Gets the value of the enforcePws property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrueFalseStates }{@code >}
     *     
     */
    public JAXBElement<TrueFalseStates> getEnforcePws() {
        return enforcePws;
    }

    /**
     * Sets the value of the enforcePws property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrueFalseStates }{@code >}
     *     
     */
    public void setEnforcePws(JAXBElement<TrueFalseStates> value) {
        this.enforcePws = value;
    }

    /**
     * Gets the value of the syncMonitorIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSyncMonitorIntervalIsDefault() {
        return syncMonitorIntervalIsDefault;
    }

    /**
     * Sets the value of the syncMonitorIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSyncMonitorIntervalIsDefault(JAXBElement<Boolean> value) {
        this.syncMonitorIntervalIsDefault = value;
    }

    /**
     * Gets the value of the syncMonitorInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncMonitorInterval() {
        return syncMonitorInterval;
    }

    /**
     * Sets the value of the syncMonitorInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncMonitorInterval(JAXBElement<Integer> value) {
        this.syncMonitorInterval = value;
    }

    /**
     * Gets the value of the minimumStratumLevelIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinimumStratumLevelIsDefault() {
        return minimumStratumLevelIsDefault;
    }

    /**
     * Sets the value of the minimumStratumLevelIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinimumStratumLevelIsDefault(JAXBElement<Boolean> value) {
        this.minimumStratumLevelIsDefault = value;
    }

    /**
     * Gets the value of the minimumStratumLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinimumStratumLevel() {
        return minimumStratumLevel;
    }

    /**
     * Sets the value of the minimumStratumLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinimumStratumLevel(JAXBElement<Integer> value) {
        this.minimumStratumLevel = value;
    }

    /**
     * Gets the value of the filterCoefficientIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFilterCoefficientIsDefault() {
        return filterCoefficientIsDefault;
    }

    /**
     * Sets the value of the filterCoefficientIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFilterCoefficientIsDefault(JAXBElement<Boolean> value) {
        this.filterCoefficientIsDefault = value;
    }

    /**
     * Gets the value of the filterCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilterCoefficient() {
        return filterCoefficient;
    }

    /**
     * Sets the value of the filterCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilterCoefficient(JAXBElement<String> value) {
        this.filterCoefficient = value;
    }

}
