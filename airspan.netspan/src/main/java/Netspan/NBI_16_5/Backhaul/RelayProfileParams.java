
package Netspan.NBI_16_5.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NtpServerIpAddress1Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress2Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress3Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress4Enabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="NtpServerIpAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UseNms4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FrameShiftNs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StatsGranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriodRelay" minOccurs="0"/&gt;
 *         &lt;element name="NodeSshAccess" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="MimoSpectralEfficiencyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumberOfCandidatesPerBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DenbSinrRanking" type="{http://Airspan.Netspan.WebServices}SinrRanking" minOccurs="0"/&gt;
 *         &lt;element name="DenbSinrThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DenbSeThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationPersistancy" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AllowedLocationRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationAccuracyThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DenbSortingAlgorithm" type="{http://Airspan.Netspan.WebServices}DenbSortingAlgorithmValuesWS" minOccurs="0"/&gt;
 *         &lt;element name="DrmGroupingOffset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DenbSinrHystersis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DenbSeHystersis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DenbRsrpDomThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DenbRsrpDomHystersis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DrmThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DrmHysteresis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AutoBackoffScanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoBackoffMaxScanEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnbReportingEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="EnbReportingInterval" type="{http://Airspan.Netspan.WebServices}ReportingIntervals" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedDeviceVciToTypeMatchingRules" type="{http://Airspan.Netspan.WebServices}ConnectedDeviceVciToTypeList" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedDeviceTypeToApnMapping" type="{http://Airspan.Netspan.WebServices}ConnectedDeviceTypeToApnList" minOccurs="0"/&gt;
 *         &lt;element name="Rbv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FineAlignMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FineAlignAvgPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DrmAveragePeriodForScanning" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DrmAveragePeriodForMonitoring" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreDenbBarring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimarySyncSource" type="{http://Airspan.Netspan.WebServices}PrimarySyncSourceTypes" minOccurs="0"/&gt;
 *         &lt;element name="FailoverAction" type="{http://Airspan.Netspan.WebServices}FailoverActionTypes" minOccurs="0"/&gt;
 *         &lt;element name="SfnInitialisationTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnbBackhaulSecurity" type="{http://Airspan.Netspan.WebServices}BackhaulSecurityTypes" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://Airspan.Netspan.WebServices}TimeZonesRelay" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRandomDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicReScanMode" type="{http://Airspan.Netspan.WebServices}PeriodicReScan" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicReScanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicRescanDaily" type="{http://Airspan.Netspan.WebServices}PeriodicRescanDailyWs" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicRescanWeekly" type="{http://Airspan.Netspan.WebServices}PeriodicRescanWeeklyWs" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicRescanMonthly" type="{http://Airspan.Netspan.WebServices}PeriodicRescanMonthlyWs" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousReScanMode" type="{http://Airspan.Netspan.WebServices}AutonomousRescanModeValues" minOccurs="0"/&gt;
 *         &lt;element name="UlPkdDataPriorityNtp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPkdDataPriorityNetwork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPkdDataPriorityManagement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPkdDataPriorityBulkTransfer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MtuSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WifiMaxThroughputLimited" type="{http://Airspan.Netspan.WebServices}MaxWifiThroughputTypes" minOccurs="0"/&gt;
 *         &lt;element name="WifiMaxThroughput" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HourlyDailyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimePersistency" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="AllowedTimePersistencyDelta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockAlertThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockAlarmThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockStopServiceAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockMaxRtdError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockMaxCellsFingerprint" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockMaxCellCandidateListSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayProfileParams", propOrder = {
    "ntpServerIpAddress1Enabled",
    "ntpServerIpAddress1",
    "useNms1",
    "ntpServerIpAddress2Enabled",
    "ntpServerIpAddress2",
    "useNms2",
    "ntpServerIpAddress3Enabled",
    "ntpServerIpAddress3",
    "useNms3",
    "ntpServerIpAddress4Enabled",
    "ntpServerIpAddress4",
    "useNms4",
    "frameShiftNs",
    "statsGranularityPeriod",
    "nodeSshAccess",
    "mimoSpectralEfficiencyThreshold",
    "maxNumberOfCandidatesPerBand",
    "denbSinrRanking",
    "denbSinrThreshold",
    "denbSeThreshold",
    "locationPersistancy",
    "allowedLocationRadius",
    "locationAccuracyThreshold",
    "denbSortingAlgorithm",
    "drmGroupingOffset",
    "denbSinrHystersis",
    "denbSeHystersis",
    "denbRsrpDomThreshold",
    "denbRsrpDomHystersis",
    "drmThreshold",
    "drmHysteresis",
    "autoBackoffScanPeriod",
    "autoBackoffMaxScanEvents",
    "enbReportingEnabled",
    "enbReportingInterval",
    "connectedDeviceVciToTypeMatchingRules",
    "connectedDeviceTypeToApnMapping",
    "rbv",
    "fineAlignMode",
    "fineAlignAvgPeriod",
    "drmAveragePeriodForScanning",
    "drmAveragePeriodForMonitoring",
    "ignoreDenbBarring",
    "primarySyncSource",
    "failoverAction",
    "sfnInitialisationTime",
    "enbBackhaulSecurity",
    "maintenanceWindowMode",
    "timeZone",
    "maintenanceWindowStartTime",
    "maintenanceWindowEndTime",
    "maxRandomDelay",
    "periodicReScanMode",
    "periodicReScanPeriod",
    "periodicRescanDaily",
    "periodicRescanWeekly",
    "periodicRescanMonthly",
    "autonomousReScanMode",
    "ulPkdDataPriorityNtp",
    "ulPkdDataPriorityNetwork",
    "ulPkdDataPriorityManagement",
    "ulPkdDataPriorityBulkTransfer",
    "mtuSize",
    "wifiMaxThroughputLimited",
    "wifiMaxThroughput",
    "hourlyDailyEnabled",
    "timePersistency",
    "allowedTimePersistencyDelta",
    "locationLockAlertThreshold",
    "locationLockAlarmThreshold",
    "locationLockStopServiceAdmin",
    "locationLockMaxRtdError",
    "locationLockAdmin",
    "locationLockMaxCellsFingerprint",
    "locationLockMaxCellCandidateListSize"
})
@XmlSeeAlso({
    RelayProfile.class
})
public class RelayProfileParams {

    @XmlElementRef(name = "NtpServerIpAddress1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress1Enabled;
    @XmlElement(name = "NtpServerIpAddress1")
    protected String ntpServerIpAddress1;
    @XmlElementRef(name = "UseNms1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms1;
    @XmlElementRef(name = "NtpServerIpAddress2Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress2Enabled;
    @XmlElement(name = "NtpServerIpAddress2")
    protected String ntpServerIpAddress2;
    @XmlElementRef(name = "UseNms2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms2;
    @XmlElementRef(name = "NtpServerIpAddress3Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress3Enabled;
    @XmlElement(name = "NtpServerIpAddress3")
    protected String ntpServerIpAddress3;
    @XmlElementRef(name = "UseNms3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms3;
    @XmlElementRef(name = "NtpServerIpAddress4Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> ntpServerIpAddress4Enabled;
    @XmlElement(name = "NtpServerIpAddress4")
    protected String ntpServerIpAddress4;
    @XmlElementRef(name = "UseNms4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useNms4;
    @XmlElementRef(name = "FrameShiftNs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frameShiftNs;
    @XmlElementRef(name = "StatsGranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statsGranularityPeriod;
    @XmlElementRef(name = "NodeSshAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> nodeSshAccess;
    @XmlElementRef(name = "MimoSpectralEfficiencyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimoSpectralEfficiencyThreshold;
    @XmlElementRef(name = "MaxNumberOfCandidatesPerBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxNumberOfCandidatesPerBand;
    @XmlElementRef(name = "DenbSinrRanking", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SinrRanking> denbSinrRanking;
    @XmlElementRef(name = "DenbSinrThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSinrThreshold;
    @XmlElementRef(name = "DenbSeThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSeThreshold;
    @XmlElementRef(name = "LocationPersistancy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> locationPersistancy;
    @XmlElementRef(name = "AllowedLocationRadius", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> allowedLocationRadius;
    @XmlElementRef(name = "LocationAccuracyThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationAccuracyThreshold;
    @XmlElementRef(name = "DenbSortingAlgorithm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DenbSortingAlgorithmValuesWS> denbSortingAlgorithm;
    @XmlElementRef(name = "DrmGroupingOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> drmGroupingOffset;
    @XmlElementRef(name = "DenbSinrHystersis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> denbSinrHystersis;
    @XmlElementRef(name = "DenbSeHystersis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> denbSeHystersis;
    @XmlElementRef(name = "DenbRsrpDomThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> denbRsrpDomThreshold;
    @XmlElementRef(name = "DenbRsrpDomHystersis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> denbRsrpDomHystersis;
    @XmlElementRef(name = "DrmThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> drmThreshold;
    @XmlElementRef(name = "DrmHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> drmHysteresis;
    @XmlElementRef(name = "AutoBackoffScanPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoBackoffScanPeriod;
    @XmlElementRef(name = "AutoBackoffMaxScanEvents", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoBackoffMaxScanEvents;
    @XmlElementRef(name = "EnbReportingEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> enbReportingEnabled;
    @XmlElementRef(name = "EnbReportingInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enbReportingInterval;
    @XmlElement(name = "ConnectedDeviceVciToTypeMatchingRules")
    protected ConnectedDeviceVciToTypeList connectedDeviceVciToTypeMatchingRules;
    @XmlElement(name = "ConnectedDeviceTypeToApnMapping")
    protected ConnectedDeviceTypeToApnList connectedDeviceTypeToApnMapping;
    @XmlElementRef(name = "Rbv", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rbv;
    @XmlElementRef(name = "FineAlignMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> fineAlignMode;
    @XmlElementRef(name = "FineAlignAvgPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fineAlignAvgPeriod;
    @XmlElementRef(name = "DrmAveragePeriodForScanning", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drmAveragePeriodForScanning;
    @XmlElementRef(name = "DrmAveragePeriodForMonitoring", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drmAveragePeriodForMonitoring;
    @XmlElementRef(name = "IgnoreDenbBarring", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ignoreDenbBarring;
    @XmlElementRef(name = "PrimarySyncSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PrimarySyncSourceTypes> primarySyncSource;
    @XmlElementRef(name = "FailoverAction", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<FailoverActionTypes> failoverAction;
    @XmlElementRef(name = "SfnInitialisationTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sfnInitialisationTime;
    @XmlElementRef(name = "EnbBackhaulSecurity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BackhaulSecurityTypes> enbBackhaulSecurity;
    @XmlElementRef(name = "MaintenanceWindowMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> maintenanceWindowMode;
    @XmlElementRef(name = "TimeZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeZonesRelay> timeZone;
    @XmlElement(name = "MaintenanceWindowStartTime")
    protected String maintenanceWindowStartTime;
    @XmlElement(name = "MaintenanceWindowEndTime")
    protected String maintenanceWindowEndTime;
    @XmlElementRef(name = "MaxRandomDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxRandomDelay;
    @XmlElementRef(name = "PeriodicReScanMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodicReScan> periodicReScanMode;
    @XmlElementRef(name = "PeriodicReScanPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> periodicReScanPeriod;
    @XmlElement(name = "PeriodicRescanDaily")
    protected PeriodicRescanDailyWs periodicRescanDaily;
    @XmlElement(name = "PeriodicRescanWeekly")
    protected PeriodicRescanWeeklyWs periodicRescanWeekly;
    @XmlElement(name = "PeriodicRescanMonthly")
    protected PeriodicRescanMonthlyWs periodicRescanMonthly;
    @XmlElementRef(name = "AutonomousReScanMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutonomousRescanModeValues> autonomousReScanMode;
    @XmlElementRef(name = "UlPkdDataPriorityNtp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPkdDataPriorityNtp;
    @XmlElementRef(name = "UlPkdDataPriorityNetwork", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPkdDataPriorityNetwork;
    @XmlElementRef(name = "UlPkdDataPriorityManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPkdDataPriorityManagement;
    @XmlElementRef(name = "UlPkdDataPriorityBulkTransfer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPkdDataPriorityBulkTransfer;
    @XmlElementRef(name = "MtuSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mtuSize;
    @XmlElementRef(name = "WifiMaxThroughputLimited", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MaxWifiThroughputTypes> wifiMaxThroughputLimited;
    @XmlElementRef(name = "WifiMaxThroughput", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiMaxThroughput;
    @XmlElementRef(name = "HourlyDailyEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hourlyDailyEnabled;
    @XmlElementRef(name = "TimePersistency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> timePersistency;
    @XmlElementRef(name = "AllowedTimePersistencyDelta", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> allowedTimePersistencyDelta;
    @XmlElementRef(name = "LocationLockAlertThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationLockAlertThreshold;
    @XmlElementRef(name = "LocationLockAlarmThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationLockAlarmThreshold;
    @XmlElementRef(name = "LocationLockStopServiceAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> locationLockStopServiceAdmin;
    @XmlElementRef(name = "LocationLockMaxRtdError", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationLockMaxRtdError;
    @XmlElementRef(name = "LocationLockAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> locationLockAdmin;
    @XmlElementRef(name = "LocationLockMaxCellsFingerprint", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationLockMaxCellsFingerprint;
    @XmlElementRef(name = "LocationLockMaxCellCandidateListSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> locationLockMaxCellCandidateListSize;

    /**
     * Gets the value of the ntpServerIpAddress1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress1Enabled() {
        return ntpServerIpAddress1Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress1Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress1Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress1() {
        return ntpServerIpAddress1;
    }

    /**
     * Sets the value of the ntpServerIpAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress1(String value) {
        this.ntpServerIpAddress1 = value;
    }

    /**
     * Gets the value of the useNms1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms1() {
        return useNms1;
    }

    /**
     * Sets the value of the useNms1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms1(JAXBElement<Boolean> value) {
        this.useNms1 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress2Enabled() {
        return ntpServerIpAddress2Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress2Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress2Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress2() {
        return ntpServerIpAddress2;
    }

    /**
     * Sets the value of the ntpServerIpAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress2(String value) {
        this.ntpServerIpAddress2 = value;
    }

    /**
     * Gets the value of the useNms2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms2() {
        return useNms2;
    }

    /**
     * Sets the value of the useNms2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms2(JAXBElement<Boolean> value) {
        this.useNms2 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress3Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress3Enabled() {
        return ntpServerIpAddress3Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress3Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress3Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress3Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress3() {
        return ntpServerIpAddress3;
    }

    /**
     * Sets the value of the ntpServerIpAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress3(String value) {
        this.ntpServerIpAddress3 = value;
    }

    /**
     * Gets the value of the useNms3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms3() {
        return useNms3;
    }

    /**
     * Sets the value of the useNms3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms3(JAXBElement<Boolean> value) {
        this.useNms3 = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress4Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNtpServerIpAddress4Enabled() {
        return ntpServerIpAddress4Enabled;
    }

    /**
     * Sets the value of the ntpServerIpAddress4Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNtpServerIpAddress4Enabled(JAXBElement<EnabledDisabledStates> value) {
        this.ntpServerIpAddress4Enabled = value;
    }

    /**
     * Gets the value of the ntpServerIpAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpServerIpAddress4() {
        return ntpServerIpAddress4;
    }

    /**
     * Sets the value of the ntpServerIpAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpServerIpAddress4(String value) {
        this.ntpServerIpAddress4 = value;
    }

    /**
     * Gets the value of the useNms4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseNms4() {
        return useNms4;
    }

    /**
     * Sets the value of the useNms4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseNms4(JAXBElement<Boolean> value) {
        this.useNms4 = value;
    }

    /**
     * Gets the value of the frameShiftNs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrameShiftNs() {
        return frameShiftNs;
    }

    /**
     * Sets the value of the frameShiftNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrameShiftNs(JAXBElement<Integer> value) {
        this.frameShiftNs = value;
    }

    /**
     * Gets the value of the statsGranularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatsGranularityPeriod() {
        return statsGranularityPeriod;
    }

    /**
     * Sets the value of the statsGranularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatsGranularityPeriod(JAXBElement<String> value) {
        this.statsGranularityPeriod = value;
    }

    /**
     * Gets the value of the nodeSshAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getNodeSshAccess() {
        return nodeSshAccess;
    }

    /**
     * Sets the value of the nodeSshAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setNodeSshAccess(JAXBElement<EnabledDisabledStates> value) {
        this.nodeSshAccess = value;
    }

    /**
     * Gets the value of the mimoSpectralEfficiencyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimoSpectralEfficiencyThreshold() {
        return mimoSpectralEfficiencyThreshold;
    }

    /**
     * Sets the value of the mimoSpectralEfficiencyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimoSpectralEfficiencyThreshold(JAXBElement<Integer> value) {
        this.mimoSpectralEfficiencyThreshold = value;
    }

    /**
     * Gets the value of the maxNumberOfCandidatesPerBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxNumberOfCandidatesPerBand() {
        return maxNumberOfCandidatesPerBand;
    }

    /**
     * Sets the value of the maxNumberOfCandidatesPerBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxNumberOfCandidatesPerBand(JAXBElement<Integer> value) {
        this.maxNumberOfCandidatesPerBand = value;
    }

    /**
     * Gets the value of the denbSinrRanking property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SinrRanking }{@code >}
     *     
     */
    public JAXBElement<SinrRanking> getDenbSinrRanking() {
        return denbSinrRanking;
    }

    /**
     * Sets the value of the denbSinrRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SinrRanking }{@code >}
     *     
     */
    public void setDenbSinrRanking(JAXBElement<SinrRanking> value) {
        this.denbSinrRanking = value;
    }

    /**
     * Gets the value of the denbSinrThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSinrThreshold() {
        return denbSinrThreshold;
    }

    /**
     * Sets the value of the denbSinrThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSinrThreshold(JAXBElement<Integer> value) {
        this.denbSinrThreshold = value;
    }

    /**
     * Gets the value of the denbSeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSeThreshold() {
        return denbSeThreshold;
    }

    /**
     * Sets the value of the denbSeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSeThreshold(JAXBElement<Integer> value) {
        this.denbSeThreshold = value;
    }

    /**
     * Gets the value of the locationPersistancy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLocationPersistancy() {
        return locationPersistancy;
    }

    /**
     * Sets the value of the locationPersistancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLocationPersistancy(JAXBElement<EnabledDisabledStates> value) {
        this.locationPersistancy = value;
    }

    /**
     * Gets the value of the allowedLocationRadius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAllowedLocationRadius() {
        return allowedLocationRadius;
    }

    /**
     * Sets the value of the allowedLocationRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAllowedLocationRadius(JAXBElement<Integer> value) {
        this.allowedLocationRadius = value;
    }

    /**
     * Gets the value of the locationAccuracyThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationAccuracyThreshold() {
        return locationAccuracyThreshold;
    }

    /**
     * Sets the value of the locationAccuracyThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationAccuracyThreshold(JAXBElement<Integer> value) {
        this.locationAccuracyThreshold = value;
    }

    /**
     * Gets the value of the denbSortingAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DenbSortingAlgorithmValuesWS }{@code >}
     *     
     */
    public JAXBElement<DenbSortingAlgorithmValuesWS> getDenbSortingAlgorithm() {
        return denbSortingAlgorithm;
    }

    /**
     * Sets the value of the denbSortingAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DenbSortingAlgorithmValuesWS }{@code >}
     *     
     */
    public void setDenbSortingAlgorithm(JAXBElement<DenbSortingAlgorithmValuesWS> value) {
        this.denbSortingAlgorithm = value;
    }

    /**
     * Gets the value of the drmGroupingOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDrmGroupingOffset() {
        return drmGroupingOffset;
    }

    /**
     * Sets the value of the drmGroupingOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDrmGroupingOffset(JAXBElement<BigDecimal> value) {
        this.drmGroupingOffset = value;
    }

    /**
     * Gets the value of the denbSinrHystersis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDenbSinrHystersis() {
        return denbSinrHystersis;
    }

    /**
     * Sets the value of the denbSinrHystersis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDenbSinrHystersis(JAXBElement<Integer> value) {
        this.denbSinrHystersis = value;
    }

    /**
     * Gets the value of the denbSeHystersis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDenbSeHystersis() {
        return denbSeHystersis;
    }

    /**
     * Sets the value of the denbSeHystersis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDenbSeHystersis(JAXBElement<BigDecimal> value) {
        this.denbSeHystersis = value;
    }

    /**
     * Gets the value of the denbRsrpDomThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDenbRsrpDomThreshold() {
        return denbRsrpDomThreshold;
    }

    /**
     * Sets the value of the denbRsrpDomThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDenbRsrpDomThreshold(JAXBElement<BigDecimal> value) {
        this.denbRsrpDomThreshold = value;
    }

    /**
     * Gets the value of the denbRsrpDomHystersis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDenbRsrpDomHystersis() {
        return denbRsrpDomHystersis;
    }

    /**
     * Sets the value of the denbRsrpDomHystersis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDenbRsrpDomHystersis(JAXBElement<BigDecimal> value) {
        this.denbRsrpDomHystersis = value;
    }

    /**
     * Gets the value of the drmThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDrmThreshold() {
        return drmThreshold;
    }

    /**
     * Sets the value of the drmThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDrmThreshold(JAXBElement<BigDecimal> value) {
        this.drmThreshold = value;
    }

    /**
     * Gets the value of the drmHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDrmHysteresis() {
        return drmHysteresis;
    }

    /**
     * Sets the value of the drmHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDrmHysteresis(JAXBElement<BigDecimal> value) {
        this.drmHysteresis = value;
    }

    /**
     * Gets the value of the autoBackoffScanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoBackoffScanPeriod() {
        return autoBackoffScanPeriod;
    }

    /**
     * Sets the value of the autoBackoffScanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoBackoffScanPeriod(JAXBElement<Integer> value) {
        this.autoBackoffScanPeriod = value;
    }

    /**
     * Gets the value of the autoBackoffMaxScanEvents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoBackoffMaxScanEvents() {
        return autoBackoffMaxScanEvents;
    }

    /**
     * Sets the value of the autoBackoffMaxScanEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoBackoffMaxScanEvents(JAXBElement<Integer> value) {
        this.autoBackoffMaxScanEvents = value;
    }

    /**
     * Gets the value of the enbReportingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getEnbReportingEnabled() {
        return enbReportingEnabled;
    }

    /**
     * Sets the value of the enbReportingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setEnbReportingEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.enbReportingEnabled = value;
    }

    /**
     * Gets the value of the enbReportingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnbReportingInterval() {
        return enbReportingInterval;
    }

    /**
     * Sets the value of the enbReportingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnbReportingInterval(JAXBElement<String> value) {
        this.enbReportingInterval = value;
    }

    /**
     * Gets the value of the connectedDeviceVciToTypeMatchingRules property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedDeviceVciToTypeList }
     *     
     */
    public ConnectedDeviceVciToTypeList getConnectedDeviceVciToTypeMatchingRules() {
        return connectedDeviceVciToTypeMatchingRules;
    }

    /**
     * Sets the value of the connectedDeviceVciToTypeMatchingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedDeviceVciToTypeList }
     *     
     */
    public void setConnectedDeviceVciToTypeMatchingRules(ConnectedDeviceVciToTypeList value) {
        this.connectedDeviceVciToTypeMatchingRules = value;
    }

    /**
     * Gets the value of the connectedDeviceTypeToApnMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedDeviceTypeToApnList }
     *     
     */
    public ConnectedDeviceTypeToApnList getConnectedDeviceTypeToApnMapping() {
        return connectedDeviceTypeToApnMapping;
    }

    /**
     * Sets the value of the connectedDeviceTypeToApnMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedDeviceTypeToApnList }
     *     
     */
    public void setConnectedDeviceTypeToApnMapping(ConnectedDeviceTypeToApnList value) {
        this.connectedDeviceTypeToApnMapping = value;
    }

    /**
     * Gets the value of the rbv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRbv() {
        return rbv;
    }

    /**
     * Sets the value of the rbv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRbv(JAXBElement<BigDecimal> value) {
        this.rbv = value;
    }

    /**
     * Gets the value of the fineAlignMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFineAlignMode() {
        return fineAlignMode;
    }

    /**
     * Sets the value of the fineAlignMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFineAlignMode(JAXBElement<Boolean> value) {
        this.fineAlignMode = value;
    }

    /**
     * Gets the value of the fineAlignAvgPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFineAlignAvgPeriod() {
        return fineAlignAvgPeriod;
    }

    /**
     * Sets the value of the fineAlignAvgPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFineAlignAvgPeriod(JAXBElement<Integer> value) {
        this.fineAlignAvgPeriod = value;
    }

    /**
     * Gets the value of the drmAveragePeriodForScanning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrmAveragePeriodForScanning() {
        return drmAveragePeriodForScanning;
    }

    /**
     * Sets the value of the drmAveragePeriodForScanning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrmAveragePeriodForScanning(JAXBElement<Integer> value) {
        this.drmAveragePeriodForScanning = value;
    }

    /**
     * Gets the value of the drmAveragePeriodForMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrmAveragePeriodForMonitoring() {
        return drmAveragePeriodForMonitoring;
    }

    /**
     * Sets the value of the drmAveragePeriodForMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrmAveragePeriodForMonitoring(JAXBElement<Integer> value) {
        this.drmAveragePeriodForMonitoring = value;
    }

    /**
     * Gets the value of the ignoreDenbBarring property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIgnoreDenbBarring() {
        return ignoreDenbBarring;
    }

    /**
     * Sets the value of the ignoreDenbBarring property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIgnoreDenbBarring(JAXBElement<Boolean> value) {
        this.ignoreDenbBarring = value;
    }

    /**
     * Gets the value of the primarySyncSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimarySyncSourceTypes }{@code >}
     *     
     */
    public JAXBElement<PrimarySyncSourceTypes> getPrimarySyncSource() {
        return primarySyncSource;
    }

    /**
     * Sets the value of the primarySyncSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimarySyncSourceTypes }{@code >}
     *     
     */
    public void setPrimarySyncSource(JAXBElement<PrimarySyncSourceTypes> value) {
        this.primarySyncSource = value;
    }

    /**
     * Gets the value of the failoverAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FailoverActionTypes }{@code >}
     *     
     */
    public JAXBElement<FailoverActionTypes> getFailoverAction() {
        return failoverAction;
    }

    /**
     * Sets the value of the failoverAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FailoverActionTypes }{@code >}
     *     
     */
    public void setFailoverAction(JAXBElement<FailoverActionTypes> value) {
        this.failoverAction = value;
    }

    /**
     * Gets the value of the sfnInitialisationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSfnInitialisationTime() {
        return sfnInitialisationTime;
    }

    /**
     * Sets the value of the sfnInitialisationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSfnInitialisationTime(JAXBElement<Integer> value) {
        this.sfnInitialisationTime = value;
    }

    /**
     * Gets the value of the enbBackhaulSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackhaulSecurityTypes }{@code >}
     *     
     */
    public JAXBElement<BackhaulSecurityTypes> getEnbBackhaulSecurity() {
        return enbBackhaulSecurity;
    }

    /**
     * Sets the value of the enbBackhaulSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackhaulSecurityTypes }{@code >}
     *     
     */
    public void setEnbBackhaulSecurity(JAXBElement<BackhaulSecurityTypes> value) {
        this.enbBackhaulSecurity = value;
    }

    /**
     * Gets the value of the maintenanceWindowMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMaintenanceWindowMode() {
        return maintenanceWindowMode;
    }

    /**
     * Sets the value of the maintenanceWindowMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMaintenanceWindowMode(JAXBElement<EnabledDisabledStates> value) {
        this.maintenanceWindowMode = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeZonesRelay }{@code >}
     *     
     */
    public JAXBElement<TimeZonesRelay> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeZonesRelay }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<TimeZonesRelay> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the maintenanceWindowStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceWindowStartTime() {
        return maintenanceWindowStartTime;
    }

    /**
     * Sets the value of the maintenanceWindowStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceWindowStartTime(String value) {
        this.maintenanceWindowStartTime = value;
    }

    /**
     * Gets the value of the maintenanceWindowEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceWindowEndTime() {
        return maintenanceWindowEndTime;
    }

    /**
     * Sets the value of the maintenanceWindowEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceWindowEndTime(String value) {
        this.maintenanceWindowEndTime = value;
    }

    /**
     * Gets the value of the maxRandomDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxRandomDelay() {
        return maxRandomDelay;
    }

    /**
     * Sets the value of the maxRandomDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxRandomDelay(JAXBElement<Integer> value) {
        this.maxRandomDelay = value;
    }

    /**
     * Gets the value of the periodicReScanMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}
     *     
     */
    public JAXBElement<PeriodicReScan> getPeriodicReScanMode() {
        return periodicReScanMode;
    }

    /**
     * Sets the value of the periodicReScanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}
     *     
     */
    public void setPeriodicReScanMode(JAXBElement<PeriodicReScan> value) {
        this.periodicReScanMode = value;
    }

    /**
     * Gets the value of the periodicReScanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPeriodicReScanPeriod() {
        return periodicReScanPeriod;
    }

    /**
     * Sets the value of the periodicReScanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPeriodicReScanPeriod(JAXBElement<Integer> value) {
        this.periodicReScanPeriod = value;
    }

    /**
     * Gets the value of the periodicRescanDaily property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicRescanDailyWs }
     *     
     */
    public PeriodicRescanDailyWs getPeriodicRescanDaily() {
        return periodicRescanDaily;
    }

    /**
     * Sets the value of the periodicRescanDaily property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicRescanDailyWs }
     *     
     */
    public void setPeriodicRescanDaily(PeriodicRescanDailyWs value) {
        this.periodicRescanDaily = value;
    }

    /**
     * Gets the value of the periodicRescanWeekly property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicRescanWeeklyWs }
     *     
     */
    public PeriodicRescanWeeklyWs getPeriodicRescanWeekly() {
        return periodicRescanWeekly;
    }

    /**
     * Sets the value of the periodicRescanWeekly property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicRescanWeeklyWs }
     *     
     */
    public void setPeriodicRescanWeekly(PeriodicRescanWeeklyWs value) {
        this.periodicRescanWeekly = value;
    }

    /**
     * Gets the value of the periodicRescanMonthly property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicRescanMonthlyWs }
     *     
     */
    public PeriodicRescanMonthlyWs getPeriodicRescanMonthly() {
        return periodicRescanMonthly;
    }

    /**
     * Sets the value of the periodicRescanMonthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicRescanMonthlyWs }
     *     
     */
    public void setPeriodicRescanMonthly(PeriodicRescanMonthlyWs value) {
        this.periodicRescanMonthly = value;
    }

    /**
     * Gets the value of the autonomousReScanMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutonomousRescanModeValues }{@code >}
     *     
     */
    public JAXBElement<AutonomousRescanModeValues> getAutonomousReScanMode() {
        return autonomousReScanMode;
    }

    /**
     * Sets the value of the autonomousReScanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutonomousRescanModeValues }{@code >}
     *     
     */
    public void setAutonomousReScanMode(JAXBElement<AutonomousRescanModeValues> value) {
        this.autonomousReScanMode = value;
    }

    /**
     * Gets the value of the ulPkdDataPriorityNtp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPkdDataPriorityNtp() {
        return ulPkdDataPriorityNtp;
    }

    /**
     * Sets the value of the ulPkdDataPriorityNtp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPkdDataPriorityNtp(JAXBElement<Integer> value) {
        this.ulPkdDataPriorityNtp = value;
    }

    /**
     * Gets the value of the ulPkdDataPriorityNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPkdDataPriorityNetwork() {
        return ulPkdDataPriorityNetwork;
    }

    /**
     * Sets the value of the ulPkdDataPriorityNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPkdDataPriorityNetwork(JAXBElement<Integer> value) {
        this.ulPkdDataPriorityNetwork = value;
    }

    /**
     * Gets the value of the ulPkdDataPriorityManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPkdDataPriorityManagement() {
        return ulPkdDataPriorityManagement;
    }

    /**
     * Sets the value of the ulPkdDataPriorityManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPkdDataPriorityManagement(JAXBElement<Integer> value) {
        this.ulPkdDataPriorityManagement = value;
    }

    /**
     * Gets the value of the ulPkdDataPriorityBulkTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPkdDataPriorityBulkTransfer() {
        return ulPkdDataPriorityBulkTransfer;
    }

    /**
     * Sets the value of the ulPkdDataPriorityBulkTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPkdDataPriorityBulkTransfer(JAXBElement<Integer> value) {
        this.ulPkdDataPriorityBulkTransfer = value;
    }

    /**
     * Gets the value of the mtuSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMtuSize() {
        return mtuSize;
    }

    /**
     * Sets the value of the mtuSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMtuSize(JAXBElement<Integer> value) {
        this.mtuSize = value;
    }

    /**
     * Gets the value of the wifiMaxThroughputLimited property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MaxWifiThroughputTypes }{@code >}
     *     
     */
    public JAXBElement<MaxWifiThroughputTypes> getWifiMaxThroughputLimited() {
        return wifiMaxThroughputLimited;
    }

    /**
     * Sets the value of the wifiMaxThroughputLimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MaxWifiThroughputTypes }{@code >}
     *     
     */
    public void setWifiMaxThroughputLimited(JAXBElement<MaxWifiThroughputTypes> value) {
        this.wifiMaxThroughputLimited = value;
    }

    /**
     * Gets the value of the wifiMaxThroughput property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWifiMaxThroughput() {
        return wifiMaxThroughput;
    }

    /**
     * Sets the value of the wifiMaxThroughput property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWifiMaxThroughput(JAXBElement<Integer> value) {
        this.wifiMaxThroughput = value;
    }

    /**
     * Gets the value of the hourlyDailyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHourlyDailyEnabled() {
        return hourlyDailyEnabled;
    }

    /**
     * Sets the value of the hourlyDailyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHourlyDailyEnabled(JAXBElement<Boolean> value) {
        this.hourlyDailyEnabled = value;
    }

    /**
     * Gets the value of the timePersistency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTimePersistency() {
        return timePersistency;
    }

    /**
     * Sets the value of the timePersistency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTimePersistency(JAXBElement<EnabledDisabledStates> value) {
        this.timePersistency = value;
    }

    /**
     * Gets the value of the allowedTimePersistencyDelta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAllowedTimePersistencyDelta() {
        return allowedTimePersistencyDelta;
    }

    /**
     * Sets the value of the allowedTimePersistencyDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAllowedTimePersistencyDelta(JAXBElement<Integer> value) {
        this.allowedTimePersistencyDelta = value;
    }

    /**
     * Gets the value of the locationLockAlertThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationLockAlertThreshold() {
        return locationLockAlertThreshold;
    }

    /**
     * Sets the value of the locationLockAlertThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationLockAlertThreshold(JAXBElement<Integer> value) {
        this.locationLockAlertThreshold = value;
    }

    /**
     * Gets the value of the locationLockAlarmThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationLockAlarmThreshold() {
        return locationLockAlarmThreshold;
    }

    /**
     * Sets the value of the locationLockAlarmThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationLockAlarmThreshold(JAXBElement<Integer> value) {
        this.locationLockAlarmThreshold = value;
    }

    /**
     * Gets the value of the locationLockStopServiceAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLocationLockStopServiceAdmin() {
        return locationLockStopServiceAdmin;
    }

    /**
     * Sets the value of the locationLockStopServiceAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLocationLockStopServiceAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.locationLockStopServiceAdmin = value;
    }

    /**
     * Gets the value of the locationLockMaxRtdError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationLockMaxRtdError() {
        return locationLockMaxRtdError;
    }

    /**
     * Sets the value of the locationLockMaxRtdError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationLockMaxRtdError(JAXBElement<Integer> value) {
        this.locationLockMaxRtdError = value;
    }

    /**
     * Gets the value of the locationLockAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLocationLockAdmin() {
        return locationLockAdmin;
    }

    /**
     * Sets the value of the locationLockAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLocationLockAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.locationLockAdmin = value;
    }

    /**
     * Gets the value of the locationLockMaxCellsFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationLockMaxCellsFingerprint() {
        return locationLockMaxCellsFingerprint;
    }

    /**
     * Sets the value of the locationLockMaxCellsFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationLockMaxCellsFingerprint(JAXBElement<Integer> value) {
        this.locationLockMaxCellsFingerprint = value;
    }

    /**
     * Gets the value of the locationLockMaxCellCandidateListSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLocationLockMaxCellCandidateListSize() {
        return locationLockMaxCellCandidateListSize;
    }

    /**
     * Sets the value of the locationLockMaxCellCandidateListSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLocationLockMaxCellCandidateListSize(JAXBElement<Integer> value) {
        this.locationLockMaxCellCandidateListSize = value;
    }

}
