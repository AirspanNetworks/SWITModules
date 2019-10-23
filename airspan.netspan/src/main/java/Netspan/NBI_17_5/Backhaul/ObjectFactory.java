
package Netspan.NBI_17_5.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_17_5.Backhaul package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Credentials_QNAME = new QName("http://Airspan.Netspan.WebServices", "Credentials");
    private final static QName _IBridge2PnpSwScheduleDateStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "DateStart");
    private final static QName _IBridge2PnpSwScheduleDateEnd_QNAME = new QName("http://Airspan.Netspan.WebServices", "DateEnd");
    private final static QName _IBridge2PnpSwScheduleSunday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sunday");
    private final static QName _IBridge2PnpSwScheduleMonday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Monday");
    private final static QName _IBridge2PnpSwScheduleTuesday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tuesday");
    private final static QName _IBridge2PnpSwScheduleWednesday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Wednesday");
    private final static QName _IBridge2PnpSwScheduleThursday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Thursday");
    private final static QName _IBridge2PnpSwScheduleFriday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Friday");
    private final static QName _IBridge2PnpSwScheduleSaturday_QNAME = new QName("http://Airspan.Netspan.WebServices", "Saturday");
    private final static QName _IBridge2DetailsParamsRole_QNAME = new QName("http://Airspan.Netspan.WebServices", "Role");
    private final static QName _IBridge2DetailsParamsWirelessEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessEnabled");
    private final static QName _IBridge2DetailsParamsEthernetEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetEnabled");
    private final static QName _IBridge2DetailsParamsAutoChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoChannel");
    private final static QName _IBridge2DetailsParamsMaximumChannelWidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaximumChannelWidth");
    private final static QName _IBridge2DetailsParamsChannelWidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelWidth");
    private final static QName _IBridge2DetailsParamsCenterFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "CenterFrequency");
    private final static QName _IBridge2DetailsParamsCenterFrequency2_QNAME = new QName("http://Airspan.Netspan.WebServices", "CenterFrequency2");
    private final static QName _IBridge2DetailsParamsBaseAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "BaseAntennaGain");
    private final static QName _IBridge2DetailsParamsTermAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermAntennaGain");
    private final static QName _IBridge2DetailsParamsAutoPowerMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoPowerMode");
    private final static QName _IBridge2DetailsParamsTxPower1_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower1");
    private final static QName _IBridge2DetailsParamsTxPower2_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower2");
    private final static QName _IBridge2DetailsParamsEthernetPortSpeed_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetPortSpeed");
    private final static QName _IBridge2DetailsParamsAutoNegotiationMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoNegotiationMode");
    private final static QName _IBridge2DetailsParamsRecoverySSIDEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RecoverySSIDEnabled");
    private final static QName _Ib11AcQosProfileTrafficClassesVlanPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "VlanPriority");
    private final static QName _Ib11AcQosProfileTrafficClassesUlCir_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCir");
    private final static QName _Ib11AcQosProfileTrafficClassesUlCirUnit_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCirUnit");
    private final static QName _Ib11AcQosProfileTrafficClassesUlMir_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMir");
    private final static QName _Ib11AcQosProfileTrafficClassesUlMirUnit_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMirUnit");
    private final static QName _Ib11AcQosProfileTrafficClassesDlCir_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCir");
    private final static QName _Ib11AcQosProfileTrafficClassesDlCirUnit_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCirUnit");
    private final static QName _Ib11AcQosProfileTrafficClassesDlMir_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMir");
    private final static QName _Ib11AcQosProfileTrafficClassesDlMirUnit_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMirUnit");
    private final static QName _IBridge11AcQosProfileHardwareCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareCategory");
    private final static QName _IBridge11AcQosProfileBandwidthRestriction_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandwidthRestriction");
    private final static QName _IBridge11AcQosProfileUlBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlBandwidth");
    private final static QName _IBridge11AcQosProfileDlBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlBandwidth");
    private final static QName _RelayAdvancedProfileParamsPowerCycleRescanInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerCycleRescanInterval");
    private final static QName _RelayAdvancedProfileParamsWebGUIAccessEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WebGUIAccessEnabled");
    private final static QName _RelayAdvancedProfileParamsWifiDisableTemp_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiDisableTemp");
    private final static QName _RelayAdvancedProfileParamsEnodebDisableTemp_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnodebDisableTemp");
    private final static QName _RelayAdvancedProfileParamsTempHysteris_QNAME = new QName("http://Airspan.Netspan.WebServices", "TempHysteris");
    private final static QName _RelayAdvancedProfileParamsCarrierAggregationRsrpThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierAggregationRsrpThreshold");
    private final static QName _RelayAdvancedProfileParamsWifiRssiThresholdExcellent_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiRssiThresholdExcellent");
    private final static QName _RelayAdvancedProfileParamsWifiRssiThresholdGood_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiRssiThresholdGood");
    private final static QName _RelayAdvancedProfileParamsWifiRssiThresholdAcceptable_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiRssiThresholdAcceptable");
    private final static QName _RelayAdvancedProfileParamsPageTimeout_QNAME = new QName("http://Airspan.Netspan.WebServices", "PageTimeout");
    private final static QName _RelayAdvancedProfileParamsGroupScanMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "GroupScanMode");
    private final static QName _RelayAdvancedProfileParamsApn1SnmpConnectionLossTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "Apn1SnmpConnectionLossTimer");
    private final static QName _BaseRedirectRelaySnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "RelaySnmpPort");
    private final static QName _BaseRedirectRelaySnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "RelaySnmpVersion");
    private final static QName _RelayProfileParamsNtpServerIpAddress1Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress1Enabled");
    private final static QName _RelayProfileParamsUseNms1_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms1");
    private final static QName _RelayProfileParamsNtpServerIpAddress2Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress2Enabled");
    private final static QName _RelayProfileParamsUseNms2_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms2");
    private final static QName _RelayProfileParamsNtpServerIpAddress3Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress3Enabled");
    private final static QName _RelayProfileParamsUseNms3_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms3");
    private final static QName _RelayProfileParamsNtpServerIpAddress4Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress4Enabled");
    private final static QName _RelayProfileParamsUseNms4_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms4");
    private final static QName _RelayProfileParamsFrameShiftNs_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameShiftNs");
    private final static QName _RelayProfileParamsStatsGranularityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsGranularityPeriod");
    private final static QName _RelayProfileParamsNodeSshAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeSshAccess");
    private final static QName _RelayProfileParamsMaxNumberOfCandidatesPerBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxNumberOfCandidatesPerBand");
    private final static QName _RelayProfileParamsDenbSinrRanking_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSinrRanking");
    private final static QName _RelayProfileParamsDenbSinrThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSinrThreshold");
    private final static QName _RelayProfileParamsDenbSeThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSeThreshold");
    private final static QName _RelayProfileParamsLocationPersistancy_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationPersistancy");
    private final static QName _RelayProfileParamsAllowedLocationRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowedLocationRadius");
    private final static QName _RelayProfileParamsLocationAccuracyThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationAccuracyThreshold");
    private final static QName _RelayProfileParamsDenbSortingAlgorithm_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSortingAlgorithm");
    private final static QName _RelayProfileParamsDrmGroupingOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrmGroupingOffset");
    private final static QName _RelayProfileParamsDenbSinrHystersis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSinrHystersis");
    private final static QName _RelayProfileParamsDenbSeHystersis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSeHystersis");
    private final static QName _RelayProfileParamsDenbRsrpDomThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbRsrpDomThreshold");
    private final static QName _RelayProfileParamsDenbRsrpDomHystersis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbRsrpDomHystersis");
    private final static QName _RelayProfileParamsDrmThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrmThreshold");
    private final static QName _RelayProfileParamsDrmHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrmHysteresis");
    private final static QName _RelayProfileParamsAutoBackoffScanPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoBackoffScanPeriod");
    private final static QName _RelayProfileParamsAutoBackoffMaxScanEvents_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoBackoffMaxScanEvents");
    private final static QName _RelayProfileParamsEnbReportingEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbReportingEnabled");
    private final static QName _RelayProfileParamsEnbReportingInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbReportingInterval");
    private final static QName _RelayProfileParamsShareRelayIpv6PdnConnectionMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ShareRelayIpv6PdnConnectionMode");
    private final static QName _RelayProfileParamsRbv_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rbv");
    private final static QName _RelayProfileParamsFineAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FineAlignMode");
    private final static QName _RelayProfileParamsFineAlignAvgPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "FineAlignAvgPeriod");
    private final static QName _RelayProfileParamsDrmAveragePeriodForScanning_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrmAveragePeriodForScanning");
    private final static QName _RelayProfileParamsDrmAveragePeriodForMonitoring_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrmAveragePeriodForMonitoring");
    private final static QName _RelayProfileParamsIgnoreDenbBarring_QNAME = new QName("http://Airspan.Netspan.WebServices", "IgnoreDenbBarring");
    private final static QName _RelayProfileParamsMaxDlTransmissionMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDlTransmissionMode");
    private final static QName _RelayProfileParamsDonorEndcDetectionMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "DonorEndcDetectionMode");
    private final static QName _RelayProfileParamsPrimarySyncSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimarySyncSource");
    private final static QName _RelayProfileParamsFailoverAction_QNAME = new QName("http://Airspan.Netspan.WebServices", "FailoverAction");
    private final static QName _RelayProfileParamsSfnInitialisationTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfnInitialisationTime");
    private final static QName _RelayProfileParamsEnbBackhaulSecurity_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbBackhaulSecurity");
    private final static QName _RelayProfileParamsMaintenanceWindowMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaintenanceWindowMode");
    private final static QName _RelayProfileParamsTimeZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeZone");
    private final static QName _RelayProfileParamsMaxRandomDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxRandomDelay");
    private final static QName _RelayProfileParamsPeriodicReScanMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicReScanMode");
    private final static QName _RelayProfileParamsPeriodicReScanPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicReScanPeriod");
    private final static QName _RelayProfileParamsAutonomousReScanMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutonomousReScanMode");
    private final static QName _RelayProfileParamsUlPkdDataPriorityNtp_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPkdDataPriorityNtp");
    private final static QName _RelayProfileParamsUlPkdDataPriorityNetwork_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPkdDataPriorityNetwork");
    private final static QName _RelayProfileParamsUlPkdDataPriorityManagement_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPkdDataPriorityManagement");
    private final static QName _RelayProfileParamsUlPkdDataPriorityBulkTransfer_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPkdDataPriorityBulkTransfer");
    private final static QName _RelayProfileParamsMtuSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "MtuSize");
    private final static QName _RelayProfileParamsWifiMaxThroughputLimited_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiMaxThroughputLimited");
    private final static QName _RelayProfileParamsWifiMaxThroughput_QNAME = new QName("http://Airspan.Netspan.WebServices", "WifiMaxThroughput");
    private final static QName _RelayProfileParamsHourlyDailyEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "HourlyDailyEnabled");
    private final static QName _RelayProfileParamsTimePersistency_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimePersistency");
    private final static QName _RelayProfileParamsAllowedTimePersistencyDelta_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowedTimePersistencyDelta");
    private final static QName _RelayProfileParamsLocationLockAlertThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockAlertThreshold");
    private final static QName _RelayProfileParamsLocationLockAlarmThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockAlarmThreshold");
    private final static QName _RelayProfileParamsLocationLockStopServiceAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockStopServiceAdmin");
    private final static QName _RelayProfileParamsLocationLockMaxRtdError_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockMaxRtdError");
    private final static QName _RelayProfileParamsLocationLockAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockAdmin");
    private final static QName _RelayProfileParamsLocationLockMaxCellsFingerprint_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockMaxCellsFingerprint");
    private final static QName _RelayProfileParamsLocationLockMaxCellCandidateListSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationLockMaxCellCandidateListSize");
    private final static QName _EciBlackListEntryWsBit0_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit0");
    private final static QName _EciBlackListEntryWsBit1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit1");
    private final static QName _EciBlackListEntryWsBit2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit2");
    private final static QName _EciBlackListEntryWsBit3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit3");
    private final static QName _EciBlackListEntryWsBit4_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit4");
    private final static QName _EciBlackListEntryWsBit5_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit5");
    private final static QName _EciBlackListEntryWsBit6_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit6");
    private final static QName _EciBlackListEntryWsBit7_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit7");
    private final static QName _EciBlackListEntryWsBit8_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit8");
    private final static QName _EciBlackListEntryWsBit9_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit9");
    private final static QName _EciBlackListEntryWsBit10_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit10");
    private final static QName _EciBlackListEntryWsBit11_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit11");
    private final static QName _EciBlackListEntryWsBit12_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit12");
    private final static QName _EciBlackListEntryWsBit13_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit13");
    private final static QName _EciBlackListEntryWsBit14_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit14");
    private final static QName _EciBlackListEntryWsBit15_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit15");
    private final static QName _EciBlackListEntryWsBit16_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit16");
    private final static QName _EciBlackListEntryWsBit17_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit17");
    private final static QName _EciBlackListEntryWsBit18_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit18");
    private final static QName _EciBlackListEntryWsBit19_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit19");
    private final static QName _EciBlackListEntryWsBit20_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit20");
    private final static QName _EciBlackListEntryWsBit21_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit21");
    private final static QName _EciBlackListEntryWsBit22_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit22");
    private final static QName _EciBlackListEntryWsBit23_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit23");
    private final static QName _EciBlackListEntryWsBit24_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit24");
    private final static QName _EciBlackListEntryWsBit25_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit25");
    private final static QName _EciBlackListEntryWsBit26_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit26");
    private final static QName _EciBlackListEntryWsBit27_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bit27");
    private final static QName _MonthlyOptionDayWeekOfEveryYMonthsDayOfWeek_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayOfWeek");
    private final static QName _MonthlyOptionDayWeekOfEveryYMonthsStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "Start");
    private final static QName _MonthlyOptionDayWeekOfEveryYMonthsEveryYMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryYMonth");
    private final static QName _MonthlyOptionDateOfEveryXMonthsDateOfMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "DateOfMonth");
    private final static QName _MonthlyOptionDateOfEveryXMonthsEveryXMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryXMonth");
    private final static QName _DailyOptionEveryWeekDayEveryWeekDay_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryWeekDay");
    private final static QName _DailyOptionEveryXDayEveryXDay_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryXDay");
    private final static QName _ConnectedDeviceTypeToApnEntryWsTypeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "TypeId");
    private final static QName _ConnectedDeviceTypeToApnEntryWsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnabled");
    private final static QName _ConnectedDeviceTypeToApnEntryWsVlanIdentifier_QNAME = new QName("http://Airspan.Netspan.WebServices", "VlanIdentifier");
    private final static QName _ConnectedDeviceTypeToApnEntryWsBlocked_QNAME = new QName("http://Airspan.Netspan.WebServices", "Blocked");
    private final static QName _ConnectedDeviceTypeToApnEntryWsAuthType_QNAME = new QName("http://Airspan.Netspan.WebServices", "AuthType");
    private final static QName _ConnectedDeviceTypeToApnEntryWsPdnConnectionType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdnConnectionType");
    private final static QName _ConnectedDeviceTypeToApnEntryWsAddressAllocationMethod_QNAME = new QName("http://Airspan.Netspan.WebServices", "AddressAllocationMethod");
    private final static QName _ConnectedDeviceTypeToApnEntryWsPnpMethod_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpMethod");
    private final static QName _ConnectedDeviceTypeToApnEntryWsIPAssignment_QNAME = new QName("http://Airspan.Netspan.WebServices", "IPAssignment");
    private final static QName _ConnectedDeviceTypeToApnEntryWsCidrPrefix_QNAME = new QName("http://Airspan.Netspan.WebServices", "CidrPrefix");
    private final static QName _QdclEntryWsEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _QdclEntryWsPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci");
    private final static QName _QdclEntryWsEci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Eci");
    private final static QName _PeriodicRescanMonthlyWsSelectedOption_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelectedOption");
    private final static QName _RelayDetailsParamsManagementModeOnly_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementModeOnly");
    private final static QName _RelayDetailsParamsIsPdclLocked_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPdclLocked");
    private final static QName _RelayDetailsParamsLedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedMode");
    private final static QName _RelayDetailsParamsPdclGroupMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdclGroupMode");
    private final static QName _RelayDetailsParamsCaMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaMode");
    private final static QName _RelayDetailsParamsIsSeGwInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSeGwInterfaceEnabled");
    private final static QName _RelayDetailsParamsRelaySbaMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "RelaySbaMode");
    private final static QName _RelayDetailsParamsBackhaulWifi_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifi");
    private final static QName _RelayDetailsParamsBackhaulEthernet_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulEthernet");
    private final static QName _RelayDetailsParamsBackhaulUsb_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulUsb");
    private final static QName _RelayDetailsParamsQdclGroupMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "QdclGroupMode");
    private final static QName _IBridge2QosParamsQosEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosEnabled");
    private final static QName _IBridge2QosParamsBandwidthLimitEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandwidthLimitEnabled");
    private final static QName _IBridge2QosParamsBandwidthLimit_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandwidthLimit");
    private final static QName _IBridge2QosParamsAutoQueueLength_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoQueueLength");
    private final static QName _IBridge2QosParamsQosPrecedence_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosPrecedence");
    private final static QName _IBridge2QosParamsQueue1Mode_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Mode");
    private final static QName _IBridge2QosParamsQueue1Weight_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Weight");
    private final static QName _IBridge2QosParamsQueue1Cir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Cir");
    private final static QName _IBridge2QosParamsQueue1Mir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Mir");
    private final static QName _IBridge2QosParamsQueue1Mbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Mbs");
    private final static QName _IBridge2QosParamsQueue1Size_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue1Size");
    private final static QName _IBridge2QosParamsQueue2Mode_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Mode");
    private final static QName _IBridge2QosParamsQueue2Weight_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Weight");
    private final static QName _IBridge2QosParamsQueue2Cir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Cir");
    private final static QName _IBridge2QosParamsQueue2Mir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Mir");
    private final static QName _IBridge2QosParamsQueue2Mbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Mbs");
    private final static QName _IBridge2QosParamsQueue2Size_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue2Size");
    private final static QName _IBridge2QosParamsQueue3Mode_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Mode");
    private final static QName _IBridge2QosParamsQueue3Weight_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Weight");
    private final static QName _IBridge2QosParamsQueue3Cir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Cir");
    private final static QName _IBridge2QosParamsQueue3Mir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Mir");
    private final static QName _IBridge2QosParamsQueue3Mbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Mbs");
    private final static QName _IBridge2QosParamsQueue3Size_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue3Size");
    private final static QName _IBridge2QosParamsQueue4Mode_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Mode");
    private final static QName _IBridge2QosParamsQueue4Weight_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Weight");
    private final static QName _IBridge2QosParamsQueue4Cir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Cir");
    private final static QName _IBridge2QosParamsQueue4Mir_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Mir");
    private final static QName _IBridge2QosParamsQueue4Mbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Mbs");
    private final static QName _IBridge2QosParamsQueue4Size_QNAME = new QName("http://Airspan.Netspan.WebServices", "Queue4Size");
    private final static QName _IBridge2QosParamsCos0Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos0Queue");
    private final static QName _IBridge2QosParamsCos1Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos1Queue");
    private final static QName _IBridge2QosParamsCos2Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos2Queue");
    private final static QName _IBridge2QosParamsCos3Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos3Queue");
    private final static QName _IBridge2QosParamsCos4Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos4Queue");
    private final static QName _IBridge2QosParamsCos5Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos5Queue");
    private final static QName _IBridge2QosParamsCos6Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos6Queue");
    private final static QName _IBridge2QosParamsCos7Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cos7Queue");
    private final static QName _IBridge2QosParamsDscp0Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp0Queue");
    private final static QName _IBridge2QosParamsDscp1Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp1Queue");
    private final static QName _IBridge2QosParamsDscp2Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp2Queue");
    private final static QName _IBridge2QosParamsDscp3Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp3Queue");
    private final static QName _IBridge2QosParamsDscp4Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp4Queue");
    private final static QName _IBridge2QosParamsDscp5Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp5Queue");
    private final static QName _IBridge2QosParamsDscp6Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp6Queue");
    private final static QName _IBridge2QosParamsDscp7Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp7Queue");
    private final static QName _IBridge2QosParamsDscp8Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp8Queue");
    private final static QName _IBridge2QosParamsDscp9Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp9Queue");
    private final static QName _IBridge2QosParamsDscp10Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp10Queue");
    private final static QName _IBridge2QosParamsDscp11Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp11Queue");
    private final static QName _IBridge2QosParamsDscp12Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp12Queue");
    private final static QName _IBridge2QosParamsDscp13Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp13Queue");
    private final static QName _IBridge2QosParamsDscp14Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp14Queue");
    private final static QName _IBridge2QosParamsDscp15Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp15Queue");
    private final static QName _IBridge2QosParamsDscp16Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp16Queue");
    private final static QName _IBridge2QosParamsDscp17Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp17Queue");
    private final static QName _IBridge2QosParamsDscp18Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp18Queue");
    private final static QName _IBridge2QosParamsDscp19Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp19Queue");
    private final static QName _IBridge2QosParamsDscp20Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp20Queue");
    private final static QName _IBridge2QosParamsDscp21Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp21Queue");
    private final static QName _IBridge2QosParamsDscp22Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp22Queue");
    private final static QName _IBridge2QosParamsDscp23Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp23Queue");
    private final static QName _IBridge2QosParamsDscp24Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp24Queue");
    private final static QName _IBridge2QosParamsDscp25Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp25Queue");
    private final static QName _IBridge2QosParamsDscp26Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp26Queue");
    private final static QName _IBridge2QosParamsDscp27Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp27Queue");
    private final static QName _IBridge2QosParamsDscp28Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp28Queue");
    private final static QName _IBridge2QosParamsDscp29Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp29Queue");
    private final static QName _IBridge2QosParamsDscp30Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp30Queue");
    private final static QName _IBridge2QosParamsDscp31Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp31Queue");
    private final static QName _IBridge2QosParamsDscp32Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp32Queue");
    private final static QName _IBridge2QosParamsDscp33Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp33Queue");
    private final static QName _IBridge2QosParamsDscp34Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp34Queue");
    private final static QName _IBridge2QosParamsDscp35Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp35Queue");
    private final static QName _IBridge2QosParamsDscp36Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp36Queue");
    private final static QName _IBridge2QosParamsDscp37Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp37Queue");
    private final static QName _IBridge2QosParamsDscp38Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp38Queue");
    private final static QName _IBridge2QosParamsDscp39Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp39Queue");
    private final static QName _IBridge2QosParamsDscp40Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp40Queue");
    private final static QName _IBridge2QosParamsDscp41Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp41Queue");
    private final static QName _IBridge2QosParamsDscp42Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp42Queue");
    private final static QName _IBridge2QosParamsDscp43Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp43Queue");
    private final static QName _IBridge2QosParamsDscp44Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp44Queue");
    private final static QName _IBridge2QosParamsDscp45Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp45Queue");
    private final static QName _IBridge2QosParamsDscp46Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp46Queue");
    private final static QName _IBridge2QosParamsDscp47Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp47Queue");
    private final static QName _IBridge2QosParamsDscp48Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp48Queue");
    private final static QName _IBridge2QosParamsDscp49Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp49Queue");
    private final static QName _IBridge2QosParamsDscp50Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp50Queue");
    private final static QName _IBridge2QosParamsDscp51Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp51Queue");
    private final static QName _IBridge2QosParamsDscp52Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp52Queue");
    private final static QName _IBridge2QosParamsDscp53Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp53Queue");
    private final static QName _IBridge2QosParamsDscp54Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp54Queue");
    private final static QName _IBridge2QosParamsDscp55Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp55Queue");
    private final static QName _IBridge2QosParamsDscp56Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp56Queue");
    private final static QName _IBridge2QosParamsDscp57Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp57Queue");
    private final static QName _IBridge2QosParamsDscp58Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp58Queue");
    private final static QName _IBridge2QosParamsDscp59Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp59Queue");
    private final static QName _IBridge2QosParamsDscp60Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp60Queue");
    private final static QName _IBridge2QosParamsDscp61Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp61Queue");
    private final static QName _IBridge2QosParamsDscp62Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp62Queue");
    private final static QName _IBridge2QosParamsDscp63Queue_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp63Queue");
    private final static QName _IBridge2AlarmParamsCriticalFault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CriticalFault");
    private final static QName _IBridge2AlarmParamsBootReboot_QNAME = new QName("http://Airspan.Netspan.WebServices", "BootReboot");
    private final static QName _IBridge2AlarmParamsWirelessUpDown_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessUpDown");
    private final static QName _IBridge2AlarmParamsEthernetUpDown_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetUpDown");
    private final static QName _IBridge2AlarmParamsEthernetSpeedChange_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetSpeedChange");
    private final static QName _IBridge2AlarmParamsTemperatureLowHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "TemperatureLowHigh");
    private final static QName _IBridge2AlarmParamsMultipleLoginAttempts_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultipleLoginAttempts");
    private final static QName _IBridge2AlarmParamsReceiveSignalStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReceiveSignalStrength");
    private final static QName _IBridge2AlarmParamsRxSnr_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSnr");
    private final static QName _IBridge2AlarmParamsCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cinr");
    private final static QName _IBridge2AlarmParamsTxPer_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPer");
    private final static QName _IBridge2AlarmParamsWirelessLinkAvailability_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessLinkAvailability");
    private final static QName _IBridge2AlarmParamsUnauthorizedAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "UnauthorizedAccess");
    private final static QName _IBridge2AlarmParamsTxPowerConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPowerConfig");
    private final static QName _IBridge2AlarmParamsGnssSatelliteStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "GnssSatelliteStrength");
    private final static QName _IBridge2AlarmParamsTemperatureLowHighLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TemperatureLowHighLowerThreshold");
    private final static QName _IBridge2AlarmParamsTemperatureLowHighUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TemperatureLowHighUpperThreshold");
    private final static QName _IBridge2AlarmParamsReceiveSignalStrengthLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReceiveSignalStrengthLowerThreshold");
    private final static QName _IBridge2AlarmParamsReceiveSignalStrengthUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReceiveSignalStrengthUpperThreshold");
    private final static QName _IBridge2AlarmParamsRxSnrLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSnrLowerThreshold");
    private final static QName _IBridge2AlarmParamsRxSnrUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSnrUpperThreshold");
    private final static QName _IBridge2AlarmParamsCinrLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CinrLowerThreshold");
    private final static QName _IBridge2AlarmParamsCinrUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CinrUpperThreshold");
    private final static QName _IBridge2AlarmParamsTxPerLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPerLowerThreshold");
    private final static QName _IBridge2AlarmParamsTxPerUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPerUpperThreshold");
    private final static QName _IBridge2AlarmParamsWirelessLinkAvailabilityLowerThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessLinkAvailabilityLowerThreshold");
    private final static QName _IBridge2AlarmParamsWirelessLinkAvailabilityUpperThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessLinkAvailabilityUpperThreshold");
    private final static QName _IBridge2TermManagementParamsManagementVlan_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementVlan");
    private final static QName _IBridge2TermManagementParamsManagementVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementVlanId");
    private final static QName _IBridge2TermManagementParamsLedBrightness_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedBrightness");
    private final static QName _IBridge2TermManagementParamsTwoPointFourGhzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "TwoPointFourGhzChannel");
    private final static QName _IBridge2TermManagementParamsMaxClients_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxClients");
    private final static QName _IBridge2BaseManagementParamsTdmaTrafficSplit_QNAME = new QName("http://Airspan.Netspan.WebServices", "TdmaTrafficSplit");
    private final static QName _IBridge2BaseManagementParamsTdmaWindow_QNAME = new QName("http://Airspan.Netspan.WebServices", "TdmaWindow");
    private final static QName _IBridge2BaseManagementParamsWirelessGender_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessGender");
    private final static QName _IbTermChannelProfileEntryPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _IbTermChannelProfileEntryFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _IbTermChannelProfileEntryPreambleIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleIndex");
    private final static QName _IbTermChannelProfileEntryAntennaDirection_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaDirection");
    private final static QName _IbTermRadioProfileTiltProtectionEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionEnabled");
    private final static QName _IbTermRadioProfileTiltProtectionDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionDelay");
    private final static QName _IbTermRadioProfileTiltProtectionThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionThreshold");
    private final static QName _IbTermRadioProfileTiltAlarmEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltAlarmEnabled");
    private final static QName _IbTermRadioProfileTiltAlarmRaiseThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltAlarmRaiseThreshold");
    private final static QName _IbTermRadioProfileClockSynchronisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "ClockSynchronisation");
    private final static QName _IbTermRadioProfilePtpMasterEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpMasterEnabled");
    private final static QName _IbTermRadioProfilePtpDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpDomain");
    private final static QName _IbTermRadioProfilePtpAnnounceRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpAnnounceRate");
    private final static QName _IbTermRadioProfilePtpSyncRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpSyncRate");
    private final static QName _IbTermRadioProfilePtpDelayReqRespRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpDelayReqRespRate");
    private final static QName _IbTermRadioProfilePtpLeaseDuration_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpLeaseDuration");
    private final static QName _IbTermRadioProfilePtpDscpTag_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpDscpTag");
    private final static QName _IbTermRadioProfileUseIbBaseSettings_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseIbBaseSettings");
    private final static QName _IbTermRadioProfileDownlinkModulation_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkModulation");
    private final static QName _IbTermRadioProfileUplinkModulation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkModulation");
    private final static QName _IbTermRadioProfileDownlinkMimoMatrix_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMimoMatrix");
    private final static QName _IbTermRadioProfileUplinkMimoMatrix_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMimoMatrix");
    private final static QName _IbTermRadioProfileChannelBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelBandwidth");
    private final static QName _IBridgeBaseRadioProfileAntennaMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaMode");
    private final static QName _IBridgeBaseRadioProfileAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaGain");
    private final static QName _IBridgeBaseRadioProfileTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _IBridgeBaseRadioProfileBsEirpTotalCombined_QNAME = new QName("http://Airspan.Netspan.WebServices", "BsEirpTotalCombined");
    private final static QName _IBridgeBaseRadioProfileRxTargetRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxTargetRssi");
    private final static QName _IBridgeBaseRadioProfileRfGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "RfGain");
    private final static QName _IBridgeBaseRadioProfileInitialRangingRxLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialRangingRxLevel");
    private final static QName _IBridgeBaseRadioProfileFloodUnknownTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "FloodUnknownTraffic");
    private final static QName _IBridgeBaseRadioProfileFt2FtLocalSwitching_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ft2FtLocalSwitching");
    private final static QName _IBridgeBaseRadioProfileFbNullingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FbNullingMode");
    private final static QName _IBridgeBaseRadioProfileFtNullingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FtNullingMode");
    private final static QName _IBridgeBaseRadioProfileAutoAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignMode");
    private final static QName _IBridgeBaseRadioProfileBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _IBridgeBaseRadioProfileBackhaulMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulMode");
    private final static QName _IBridgeBaseRadioProfileRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "Range");
    private final static QName _IBridgeBaseRadioProfileUplinkPermutation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkPermutation");
    private final static QName _IBridgeBaseRadioProfileTddSplit_QNAME = new QName("http://Airspan.Netspan.WebServices", "TddSplit");
    private final static QName _IBridgeBaseRadioProfileMaxSisoZoneSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSisoZoneSize");
    private final static QName _IBridgeBaseRadioProfileUplinkMimo_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMimo");
    private final static QName _IBridgeBaseRadioProfileFrameMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameMode");
    private final static QName _IBridgeBaseRadioProfileSubchannels_QNAME = new QName("http://Airspan.Netspan.WebServices", "Subchannels");
    private final static QName _IBridgeBaseRadioProfileCarrierSense_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierSense");
    private final static QName _IBridgeBaseRadioProfileBackoffFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackoffFrames");
    private final static QName _IBridgeBaseRadioProfileCarrierSenseThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierSenseThreshold");
    private final static QName _IBridgeBaseRadioProfileSecurityMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityMode");
    private final static QName _IBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkAdaptationEfficiencyMode");
    private final static QName _IBridgeBaseRadioProfileDownlinkTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkTraffic");
    private final static QName _IBridgeBaseRadioProfileDownlinkBroadcastMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkBroadcastMcs");
    private final static QName _IBridgeBaseRadioProfileDownlinkCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkCinrMargin");
    private final static QName _IBridgeBaseRadioProfileDownlinkMatrixBThresholdPcinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMatrixBThresholdPcinr");
    private final static QName _IBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMatrixBAdditionalCinrMargin");
    private final static QName _IBridgeBaseRadioProfileUplinkTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkTraffic");
    private final static QName _IBridgeBaseRadioProfileUplinkCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkCinrMargin");
    private final static QName _IBridgeBaseRadioProfileUplinkMatrixBThresholdCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMatrixBThresholdCinr");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk12Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk12");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk34Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk34");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam12Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam12");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam34");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam23Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam23Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam23");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam34");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam56");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam34");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam56");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk12Enabled");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk12");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk34");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam12Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam12");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam34");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam23Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam23Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam23");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam34");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam56");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam34");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam56");
    private final static QName _IBridgeBaseManagementProfileClockSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "ClockSource");
    private final static QName _IBridgeBaseManagementProfileGpsSoftHoldoverEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsSoftHoldoverEnabled");
    private final static QName _IBridgeBaseManagementProfileStatsCollectionPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsCollectionPeriod");
    private final static QName _IBridgeBaseManagementProfileAirInterfaceStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "AirInterfaceStats");
    private final static QName _IBridgeBaseManagementProfileAirInterfaceUsageStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "AirInterfaceUsageStats");
    private final static QName _IBridgeBaseManagementProfileTermRfStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermRfStats");
    private final static QName _IBridgeBaseManagementProfileTermDataStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermDataStats");
    private final static QName _SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpTimeoutInMilliSec");
    private final static QName _SnmpDetailSetWsSnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpVersion");
    private final static QName _SnmpDetailSetWsSnmpv3Access_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snmpv3Access");
    private final static QName _SnmpDetailWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _Ib440DetailsGetManagedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagedMode");
    private final static QName _Ib440DetailsGetLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Latitude");
    private final static QName _Ib440DetailsGetLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Longitude");
    private final static QName _Ib440DetailsGetAltitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Altitude");
    private final static QName _Ib440DetailsGetNbifEventAlarmForwarding_QNAME = new QName("http://Airspan.Netspan.WebServices", "NbifEventAlarmForwarding");
    private final static QName _Ib440DetailsGetConfigMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigMode");
    private final static QName _Ib440DetailsGetMediumAccessMethod_QNAME = new QName("http://Airspan.Netspan.WebServices", "MediumAccessMethod");
    private final static QName _Ib440DetailsGetWirelessProtocol_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessProtocol");
    private final static QName _Ib440DetailsGetHtSupportedMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "HtSupportedMcs");
    private final static QName _Ib440DetailsGetVhtSupportedMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "VhtSupportedMcs");
    private final static QName _Ib440DetailsGetCellRadiusRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellRadiusRange");
    private final static QName _Ib440DetailsGetGuardInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "GuardInterval");
    private final static QName _IBridge2DetailsPnpReadyForService_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReadyForService");
    private final static QName _IBridge2PnpDetailWsHardware_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hardware");
    private final static QName _IBridge2PnpDetailWsPnpLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatitude");
    private final static QName _IBridge2PnpDetailWsPnpLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLongitude");
    private final static QName _IBridge2PnpDetailWsPnpLatLongRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatLongRadius");
    private final static QName _IBridge2PnpDetailWsIsSwScheduled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSwScheduled");
    private final static QName _IBridge2PnpDetailWsIsDownloadOnlySwScheduled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDownloadOnlySwScheduled");
    private final static QName _RelayEnbErrorDetailWsErrorCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ErrorCode");
    private final static QName _RelayRedirectDetailWsNmsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "NmsSnmpPort");
    private final static QName _RelayGlobalConfigDetailBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _RelayGlobalConfigDetailEarfcnHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "EarfcnHigh");
    private final static QName _RelayGlobalConfigDetailEarfcnLow_QNAME = new QName("http://Airspan.Netspan.WebServices", "EarfcnLow");
    private final static QName _RelayGlobalConfigDetailIsVoLteEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsVoLteEnabled");
    private final static QName _RelayGlobalConfigDetailIsBandEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsBandEnabled");
    private final static QName _IBridgeTermDetailsPnpServiceAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "ServiceAllowed");
    private final static QName _IBridgeTermDetailsPnpEnableHomeBs_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableHomeBs");
    private final static QName _IBridgeTermDetailsPnpSignOnLockMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignOnLockMode");
    private final static QName _IBridgeTermDetailsPnpMaxLockPeriodForSignOn_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxLockPeriodForSignOn");
    private final static QName _IBridgeTermDetailsPnpUseManagementIfForPtp_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseManagementIfForPtp");
    private final static QName _IBridgeTermDetailsPnpPtpSubnetCidr_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpSubnetCidr");
    private final static QName _IBridgeTermDetailsPnpPtpVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpVlanId");
    private final static QName _IBridgeTermDetailsPnpLedEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedEnabled");
    private final static QName _IBridgeTermPnpDetailWsPnpServiceState_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpServiceState");
    private final static QName _IbBaseDetailsPnpCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _IbBaseDetailsPnpUplinkPermutationBase_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkPermutationBase");
    private final static QName _IbBaseDetailsPnpDownlinkPermutationBase_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkPermutationBase");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_17_5.Backhaul
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ib440ConfigGet }
     * 
     */
    public Ib440ConfigGet createIb440ConfigGet() {
        return new Ib440ConfigGet();
    }

    /**
     * Create an instance of {@link Ib440ConfigGetResponse }
     * 
     */
    public Ib440ConfigGetResponse createIb440ConfigGetResponse() {
        return new Ib440ConfigGetResponse();
    }

    /**
     * Create an instance of {@link Ib440ConfigGetResult }
     * 
     */
    public Ib440ConfigGetResult createIb440ConfigGetResult() {
        return new Ib440ConfigGetResult();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link Ib440ConfigSet }
     * 
     */
    public Ib440ConfigSet createIb440ConfigSet() {
        return new Ib440ConfigSet();
    }

    /**
     * Create an instance of {@link NodeProperty }
     * 
     */
    public NodeProperty createNodeProperty() {
        return new NodeProperty();
    }

    /**
     * Create an instance of {@link Ib440DetailsSetWs }
     * 
     */
    public Ib440DetailsSetWs createIb440DetailsSetWs() {
        return new Ib440DetailsSetWs();
    }

    /**
     * Create an instance of {@link SnmpDetailSetWs }
     * 
     */
    public SnmpDetailSetWs createSnmpDetailSetWs() {
        return new SnmpDetailSetWs();
    }

    /**
     * Create an instance of {@link Ib440ConfigSetResponse }
     * 
     */
    public Ib440ConfigSetResponse createIb440ConfigSetResponse() {
        return new Ib440ConfigSetResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigGet }
     * 
     */
    public IBridgeBaseConfigGet createIBridgeBaseConfigGet() {
        return new IBridgeBaseConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigGetResponse }
     * 
     */
    public IBridgeBaseConfigGetResponse createIBridgeBaseConfigGetResponse() {
        return new IBridgeBaseConfigGetResponse();
    }

    /**
     * Create an instance of {@link IbBaseConfigGetResult }
     * 
     */
    public IbBaseConfigGetResult createIbBaseConfigGetResult() {
        return new IbBaseConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigSet }
     * 
     */
    public IBridgeBaseConfigSet createIBridgeBaseConfigSet() {
        return new IBridgeBaseConfigSet();
    }

    /**
     * Create an instance of {@link IbBaseDetails }
     * 
     */
    public IbBaseDetails createIbBaseDetails() {
        return new IbBaseDetails();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigSetResponse }
     * 
     */
    public IBridgeBaseConfigSetResponse createIBridgeBaseConfigSetResponse() {
        return new IBridgeBaseConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigGet }
     * 
     */
    public IBridgeTermConfigGet createIBridgeTermConfigGet() {
        return new IBridgeTermConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigGetResponse }
     * 
     */
    public IBridgeTermConfigGetResponse createIBridgeTermConfigGetResponse() {
        return new IBridgeTermConfigGetResponse();
    }

    /**
     * Create an instance of {@link IbTermConfigGetResult }
     * 
     */
    public IbTermConfigGetResult createIbTermConfigGetResult() {
        return new IbTermConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigSet }
     * 
     */
    public IBridgeTermConfigSet createIBridgeTermConfigSet() {
        return new IBridgeTermConfigSet();
    }

    /**
     * Create an instance of {@link IBridgeTermDetails }
     * 
     */
    public IBridgeTermDetails createIBridgeTermDetails() {
        return new IBridgeTermDetails();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigSetResponse }
     * 
     */
    public IBridgeTermConfigSetResponse createIBridgeTermConfigSetResponse() {
        return new IBridgeTermConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileList }
     * 
     */
    public IBridgeBaseManagementProfileList createIBridgeBaseManagementProfileList() {
        return new IBridgeBaseManagementProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileListResponse }
     * 
     */
    public IBridgeBaseManagementProfileListResponse createIBridgeBaseManagementProfileListResponse() {
        return new IBridgeBaseManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileGet }
     * 
     */
    public IBridgeBaseManagementProfileGet createIBridgeBaseManagementProfileGet() {
        return new IBridgeBaseManagementProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileGetResponse }
     * 
     */
    public IBridgeBaseManagementProfileGetResponse createIBridgeBaseManagementProfileGetResponse() {
        return new IBridgeBaseManagementProfileGetResponse();
    }

    /**
     * Create an instance of {@link IbBaseManagementProfileGetResult }
     * 
     */
    public IbBaseManagementProfileGetResult createIbBaseManagementProfileGetResult() {
        return new IbBaseManagementProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileDelete }
     * 
     */
    public IBridgeBaseManagementProfileDelete createIBridgeBaseManagementProfileDelete() {
        return new IBridgeBaseManagementProfileDelete();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileDeleteResponse }
     * 
     */
    public IBridgeBaseManagementProfileDeleteResponse createIBridgeBaseManagementProfileDeleteResponse() {
        return new IBridgeBaseManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link ProfileResponse }
     * 
     */
    public ProfileResponse createProfileResponse() {
        return new ProfileResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileCreate }
     * 
     */
    public IBridgeBaseManagementProfileCreate createIBridgeBaseManagementProfileCreate() {
        return new IBridgeBaseManagementProfileCreate();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfile }
     * 
     */
    public IBridgeBaseManagementProfile createIBridgeBaseManagementProfile() {
        return new IBridgeBaseManagementProfile();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileCreateResponse }
     * 
     */
    public IBridgeBaseManagementProfileCreateResponse createIBridgeBaseManagementProfileCreateResponse() {
        return new IBridgeBaseManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileClone }
     * 
     */
    public IBridgeBaseManagementProfileClone createIBridgeBaseManagementProfileClone() {
        return new IBridgeBaseManagementProfileClone();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileCloneResponse }
     * 
     */
    public IBridgeBaseManagementProfileCloneResponse createIBridgeBaseManagementProfileCloneResponse() {
        return new IBridgeBaseManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileUpdate }
     * 
     */
    public IBridgeBaseManagementProfileUpdate createIBridgeBaseManagementProfileUpdate() {
        return new IBridgeBaseManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileUpdateResponse }
     * 
     */
    public IBridgeBaseManagementProfileUpdateResponse createIBridgeBaseManagementProfileUpdateResponse() {
        return new IBridgeBaseManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileList }
     * 
     */
    public IBridgeBaseRadioProfileList createIBridgeBaseRadioProfileList() {
        return new IBridgeBaseRadioProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileListResponse }
     * 
     */
    public IBridgeBaseRadioProfileListResponse createIBridgeBaseRadioProfileListResponse() {
        return new IBridgeBaseRadioProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileGet }
     * 
     */
    public IBridgeBaseRadioProfileGet createIBridgeBaseRadioProfileGet() {
        return new IBridgeBaseRadioProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileGetResponse }
     * 
     */
    public IBridgeBaseRadioProfileGetResponse createIBridgeBaseRadioProfileGetResponse() {
        return new IBridgeBaseRadioProfileGetResponse();
    }

    /**
     * Create an instance of {@link IbBaseRadioProfileGetResult }
     * 
     */
    public IbBaseRadioProfileGetResult createIbBaseRadioProfileGetResult() {
        return new IbBaseRadioProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileDelete }
     * 
     */
    public IBridgeBaseRadioProfileDelete createIBridgeBaseRadioProfileDelete() {
        return new IBridgeBaseRadioProfileDelete();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileDeleteResponse }
     * 
     */
    public IBridgeBaseRadioProfileDeleteResponse createIBridgeBaseRadioProfileDeleteResponse() {
        return new IBridgeBaseRadioProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileCreate }
     * 
     */
    public IBridgeBaseRadioProfileCreate createIBridgeBaseRadioProfileCreate() {
        return new IBridgeBaseRadioProfileCreate();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfile }
     * 
     */
    public IBridgeBaseRadioProfile createIBridgeBaseRadioProfile() {
        return new IBridgeBaseRadioProfile();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileCreateResponse }
     * 
     */
    public IBridgeBaseRadioProfileCreateResponse createIBridgeBaseRadioProfileCreateResponse() {
        return new IBridgeBaseRadioProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileClone }
     * 
     */
    public IBridgeBaseRadioProfileClone createIBridgeBaseRadioProfileClone() {
        return new IBridgeBaseRadioProfileClone();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileCloneResponse }
     * 
     */
    public IBridgeBaseRadioProfileCloneResponse createIBridgeBaseRadioProfileCloneResponse() {
        return new IBridgeBaseRadioProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileUpdate }
     * 
     */
    public IBridgeBaseRadioProfileUpdate createIBridgeBaseRadioProfileUpdate() {
        return new IBridgeBaseRadioProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileUpdateResponse }
     * 
     */
    public IBridgeBaseRadioProfileUpdateResponse createIBridgeBaseRadioProfileUpdateResponse() {
        return new IBridgeBaseRadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigList }
     * 
     */
    public IBridgeBasePnpConfigList createIBridgeBasePnpConfigList() {
        return new IBridgeBasePnpConfigList();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigListResponse }
     * 
     */
    public IBridgeBasePnpConfigListResponse createIBridgeBasePnpConfigListResponse() {
        return new IBridgeBasePnpConfigListResponse();
    }

    /**
     * Create an instance of {@link NodeListResult }
     * 
     */
    public NodeListResult createNodeListResult() {
        return new NodeListResult();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigDelete }
     * 
     */
    public IBridgeBasePnpConfigDelete createIBridgeBasePnpConfigDelete() {
        return new IBridgeBasePnpConfigDelete();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigDeleteResponse }
     * 
     */
    public IBridgeBasePnpConfigDeleteResponse createIBridgeBasePnpConfigDeleteResponse() {
        return new IBridgeBasePnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigGet }
     * 
     */
    public IBridgeBasePnpConfigGet createIBridgeBasePnpConfigGet() {
        return new IBridgeBasePnpConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigGetResponse }
     * 
     */
    public IBridgeBasePnpConfigGetResponse createIBridgeBasePnpConfigGetResponse() {
        return new IBridgeBasePnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigGetResult }
     * 
     */
    public IBridgeBasePnpConfigGetResult createIBridgeBasePnpConfigGetResult() {
        return new IBridgeBasePnpConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigCreate }
     * 
     */
    public IBridgeBasePnpConfigCreate createIBridgeBasePnpConfigCreate() {
        return new IBridgeBasePnpConfigCreate();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpDetailWs }
     * 
     */
    public IBridgeBasePnpDetailWs createIBridgeBasePnpDetailWs() {
        return new IBridgeBasePnpDetailWs();
    }

    /**
     * Create an instance of {@link IbBaseDetailsPnp }
     * 
     */
    public IbBaseDetailsPnp createIbBaseDetailsPnp() {
        return new IbBaseDetailsPnp();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigCreateResponse }
     * 
     */
    public IBridgeBasePnpConfigCreateResponse createIBridgeBasePnpConfigCreateResponse() {
        return new IBridgeBasePnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigClone }
     * 
     */
    public IBridgeBasePnpConfigClone createIBridgeBasePnpConfigClone() {
        return new IBridgeBasePnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigCloneResponse }
     * 
     */
    public IBridgeBasePnpConfigCloneResponse createIBridgeBasePnpConfigCloneResponse() {
        return new IBridgeBasePnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigUpdate }
     * 
     */
    public IBridgeBasePnpConfigUpdate createIBridgeBasePnpConfigUpdate() {
        return new IBridgeBasePnpConfigUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigUpdateResponse }
     * 
     */
    public IBridgeBasePnpConfigUpdateResponse createIBridgeBasePnpConfigUpdateResponse() {
        return new IBridgeBasePnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigConvertFromNode }
     * 
     */
    public IBridgeBasePnpConfigConvertFromNode createIBridgeBasePnpConfigConvertFromNode() {
        return new IBridgeBasePnpConfigConvertFromNode();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigConvertFromNodeResponse }
     * 
     */
    public IBridgeBasePnpConfigConvertFromNodeResponse createIBridgeBasePnpConfigConvertFromNodeResponse() {
        return new IBridgeBasePnpConfigConvertFromNodeResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigList }
     * 
     */
    public IBridgeTermPnpConfigList createIBridgeTermPnpConfigList() {
        return new IBridgeTermPnpConfigList();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigListResponse }
     * 
     */
    public IBridgeTermPnpConfigListResponse createIBridgeTermPnpConfigListResponse() {
        return new IBridgeTermPnpConfigListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigDelete }
     * 
     */
    public IBridgeTermPnpConfigDelete createIBridgeTermPnpConfigDelete() {
        return new IBridgeTermPnpConfigDelete();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigDeleteResponse }
     * 
     */
    public IBridgeTermPnpConfigDeleteResponse createIBridgeTermPnpConfigDeleteResponse() {
        return new IBridgeTermPnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigGet }
     * 
     */
    public IBridgeTermPnpConfigGet createIBridgeTermPnpConfigGet() {
        return new IBridgeTermPnpConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigGetResponse }
     * 
     */
    public IBridgeTermPnpConfigGetResponse createIBridgeTermPnpConfigGetResponse() {
        return new IBridgeTermPnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigGetResult }
     * 
     */
    public IBridgeTermPnpConfigGetResult createIBridgeTermPnpConfigGetResult() {
        return new IBridgeTermPnpConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCreate }
     * 
     */
    public IBridgeTermPnpConfigCreate createIBridgeTermPnpConfigCreate() {
        return new IBridgeTermPnpConfigCreate();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpDetailWs }
     * 
     */
    public IBridgeTermPnpDetailWs createIBridgeTermPnpDetailWs() {
        return new IBridgeTermPnpDetailWs();
    }

    /**
     * Create an instance of {@link IBridgeTermDetailsPnp }
     * 
     */
    public IBridgeTermDetailsPnp createIBridgeTermDetailsPnp() {
        return new IBridgeTermDetailsPnp();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCreateResponse }
     * 
     */
    public IBridgeTermPnpConfigCreateResponse createIBridgeTermPnpConfigCreateResponse() {
        return new IBridgeTermPnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigClone }
     * 
     */
    public IBridgeTermPnpConfigClone createIBridgeTermPnpConfigClone() {
        return new IBridgeTermPnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCloneResponse }
     * 
     */
    public IBridgeTermPnpConfigCloneResponse createIBridgeTermPnpConfigCloneResponse() {
        return new IBridgeTermPnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigUpdate }
     * 
     */
    public IBridgeTermPnpConfigUpdate createIBridgeTermPnpConfigUpdate() {
        return new IBridgeTermPnpConfigUpdate();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigUpdateResponse }
     * 
     */
    public IBridgeTermPnpConfigUpdateResponse createIBridgeTermPnpConfigUpdateResponse() {
        return new IBridgeTermPnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigConvertFromNode }
     * 
     */
    public IBridgeTermPnpConfigConvertFromNode createIBridgeTermPnpConfigConvertFromNode() {
        return new IBridgeTermPnpConfigConvertFromNode();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigConvertFromNodeResponse }
     * 
     */
    public IBridgeTermPnpConfigConvertFromNodeResponse createIBridgeTermPnpConfigConvertFromNodeResponse() {
        return new IBridgeTermPnpConfigConvertFromNodeResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileList }
     * 
     */
    public IBridgeTermRadioProfileList createIBridgeTermRadioProfileList() {
        return new IBridgeTermRadioProfileList();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileListResponse }
     * 
     */
    public IBridgeTermRadioProfileListResponse createIBridgeTermRadioProfileListResponse() {
        return new IBridgeTermRadioProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileGet }
     * 
     */
    public IBridgeTermRadioProfileGet createIBridgeTermRadioProfileGet() {
        return new IBridgeTermRadioProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileGetResponse }
     * 
     */
    public IBridgeTermRadioProfileGetResponse createIBridgeTermRadioProfileGetResponse() {
        return new IBridgeTermRadioProfileGetResponse();
    }

    /**
     * Create an instance of {@link IbTermRadioProfileGetResult }
     * 
     */
    public IbTermRadioProfileGetResult createIbTermRadioProfileGetResult() {
        return new IbTermRadioProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileDelete }
     * 
     */
    public IBridgeTermRadioProfileDelete createIBridgeTermRadioProfileDelete() {
        return new IBridgeTermRadioProfileDelete();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileDeleteResponse }
     * 
     */
    public IBridgeTermRadioProfileDeleteResponse createIBridgeTermRadioProfileDeleteResponse() {
        return new IBridgeTermRadioProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileCreate }
     * 
     */
    public IBridgeTermRadioProfileCreate createIBridgeTermRadioProfileCreate() {
        return new IBridgeTermRadioProfileCreate();
    }

    /**
     * Create an instance of {@link IbTermRadioProfile }
     * 
     */
    public IbTermRadioProfile createIbTermRadioProfile() {
        return new IbTermRadioProfile();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileCreateResponse }
     * 
     */
    public IBridgeTermRadioProfileCreateResponse createIBridgeTermRadioProfileCreateResponse() {
        return new IBridgeTermRadioProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileClone }
     * 
     */
    public IBridgeTermRadioProfileClone createIBridgeTermRadioProfileClone() {
        return new IBridgeTermRadioProfileClone();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileCloneResponse }
     * 
     */
    public IBridgeTermRadioProfileCloneResponse createIBridgeTermRadioProfileCloneResponse() {
        return new IBridgeTermRadioProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileUpdate }
     * 
     */
    public IBridgeTermRadioProfileUpdate createIBridgeTermRadioProfileUpdate() {
        return new IBridgeTermRadioProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileUpdateResponse }
     * 
     */
    public IBridgeTermRadioProfileUpdateResponse createIBridgeTermRadioProfileUpdateResponse() {
        return new IBridgeTermRadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileList }
     * 
     */
    public IBridgeBaseSystemDefaultProfileList createIBridgeBaseSystemDefaultProfileList() {
        return new IBridgeBaseSystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileListResponse }
     * 
     */
    public IBridgeBaseSystemDefaultProfileListResponse createIBridgeBaseSystemDefaultProfileListResponse() {
        return new IBridgeBaseSystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileGet }
     * 
     */
    public IBridgeBaseSystemDefaultProfileGet createIBridgeBaseSystemDefaultProfileGet() {
        return new IBridgeBaseSystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileGetResponse }
     * 
     */
    public IBridgeBaseSystemDefaultProfileGetResponse createIBridgeBaseSystemDefaultProfileGetResponse() {
        return new IBridgeBaseSystemDefaultProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileGetResult }
     * 
     */
    public IBridgeBaseSystemDefaultProfileGetResult createIBridgeBaseSystemDefaultProfileGetResult() {
        return new IBridgeBaseSystemDefaultProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileList }
     * 
     */
    public IBridgeTermSystemDefaultProfileList createIBridgeTermSystemDefaultProfileList() {
        return new IBridgeTermSystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileListResponse }
     * 
     */
    public IBridgeTermSystemDefaultProfileListResponse createIBridgeTermSystemDefaultProfileListResponse() {
        return new IBridgeTermSystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileGet }
     * 
     */
    public IBridgeTermSystemDefaultProfileGet createIBridgeTermSystemDefaultProfileGet() {
        return new IBridgeTermSystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileGetResponse }
     * 
     */
    public IBridgeTermSystemDefaultProfileGetResponse createIBridgeTermSystemDefaultProfileGetResponse() {
        return new IBridgeTermSystemDefaultProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileGetResult }
     * 
     */
    public IBridgeTermSystemDefaultProfileGetResult createIBridgeTermSystemDefaultProfileGetResult() {
        return new IBridgeTermSystemDefaultProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateGet }
     * 
     */
    public IBridgeBaseStateGet createIBridgeBaseStateGet() {
        return new IBridgeBaseStateGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateGetResponse }
     * 
     */
    public IBridgeBaseStateGetResponse createIBridgeBaseStateGetResponse() {
        return new IBridgeBaseStateGetResponse();
    }

    /**
     * Create an instance of {@link IbBaseStateGetResult }
     * 
     */
    public IbBaseStateGetResult createIbBaseStateGetResult() {
        return new IbBaseStateGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateSet }
     * 
     */
    public IBridgeBaseStateSet createIBridgeBaseStateSet() {
        return new IBridgeBaseStateSet();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateSetResponse }
     * 
     */
    public IBridgeBaseStateSetResponse createIBridgeBaseStateSetResponse() {
        return new IBridgeBaseStateSetResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileList }
     * 
     */
    public IBridge2BaseManagementProfileList createIBridge2BaseManagementProfileList() {
        return new IBridge2BaseManagementProfileList();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileListResponse }
     * 
     */
    public IBridge2BaseManagementProfileListResponse createIBridge2BaseManagementProfileListResponse() {
        return new IBridge2BaseManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileGet }
     * 
     */
    public IBridge2BaseManagementProfileGet createIBridge2BaseManagementProfileGet() {
        return new IBridge2BaseManagementProfileGet();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileGetResponse }
     * 
     */
    public IBridge2BaseManagementProfileGetResponse createIBridge2BaseManagementProfileGetResponse() {
        return new IBridge2BaseManagementProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileGetResult }
     * 
     */
    public IBridge2BaseManagementProfileGetResult createIBridge2BaseManagementProfileGetResult() {
        return new IBridge2BaseManagementProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileDelete }
     * 
     */
    public IBridge2BaseManagementProfileDelete createIBridge2BaseManagementProfileDelete() {
        return new IBridge2BaseManagementProfileDelete();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileDeleteResponse }
     * 
     */
    public IBridge2BaseManagementProfileDeleteResponse createIBridge2BaseManagementProfileDeleteResponse() {
        return new IBridge2BaseManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileCreate }
     * 
     */
    public IBridge2BaseManagementProfileCreate createIBridge2BaseManagementProfileCreate() {
        return new IBridge2BaseManagementProfileCreate();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfile }
     * 
     */
    public IBridge2BaseManagementProfile createIBridge2BaseManagementProfile() {
        return new IBridge2BaseManagementProfile();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileCreateResponse }
     * 
     */
    public IBridge2BaseManagementProfileCreateResponse createIBridge2BaseManagementProfileCreateResponse() {
        return new IBridge2BaseManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileClone }
     * 
     */
    public IBridge2BaseManagementProfileClone createIBridge2BaseManagementProfileClone() {
        return new IBridge2BaseManagementProfileClone();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileCloneResponse }
     * 
     */
    public IBridge2BaseManagementProfileCloneResponse createIBridge2BaseManagementProfileCloneResponse() {
        return new IBridge2BaseManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileUpdate }
     * 
     */
    public IBridge2BaseManagementProfileUpdate createIBridge2BaseManagementProfileUpdate() {
        return new IBridge2BaseManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileUpdateResponse }
     * 
     */
    public IBridge2BaseManagementProfileUpdateResponse createIBridge2BaseManagementProfileUpdateResponse() {
        return new IBridge2BaseManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileList }
     * 
     */
    public IBridge2TermManagementProfileList createIBridge2TermManagementProfileList() {
        return new IBridge2TermManagementProfileList();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileListResponse }
     * 
     */
    public IBridge2TermManagementProfileListResponse createIBridge2TermManagementProfileListResponse() {
        return new IBridge2TermManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileGet }
     * 
     */
    public IBridge2TermManagementProfileGet createIBridge2TermManagementProfileGet() {
        return new IBridge2TermManagementProfileGet();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileGetResponse }
     * 
     */
    public IBridge2TermManagementProfileGetResponse createIBridge2TermManagementProfileGetResponse() {
        return new IBridge2TermManagementProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileGetResult }
     * 
     */
    public IBridge2TermManagementProfileGetResult createIBridge2TermManagementProfileGetResult() {
        return new IBridge2TermManagementProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileDelete }
     * 
     */
    public IBridge2TermManagementProfileDelete createIBridge2TermManagementProfileDelete() {
        return new IBridge2TermManagementProfileDelete();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileDeleteResponse }
     * 
     */
    public IBridge2TermManagementProfileDeleteResponse createIBridge2TermManagementProfileDeleteResponse() {
        return new IBridge2TermManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileCreate }
     * 
     */
    public IBridge2TermManagementProfileCreate createIBridge2TermManagementProfileCreate() {
        return new IBridge2TermManagementProfileCreate();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfile }
     * 
     */
    public IBridge2TermManagementProfile createIBridge2TermManagementProfile() {
        return new IBridge2TermManagementProfile();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileCreateResponse }
     * 
     */
    public IBridge2TermManagementProfileCreateResponse createIBridge2TermManagementProfileCreateResponse() {
        return new IBridge2TermManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileClone }
     * 
     */
    public IBridge2TermManagementProfileClone createIBridge2TermManagementProfileClone() {
        return new IBridge2TermManagementProfileClone();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileCloneResponse }
     * 
     */
    public IBridge2TermManagementProfileCloneResponse createIBridge2TermManagementProfileCloneResponse() {
        return new IBridge2TermManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileUpdate }
     * 
     */
    public IBridge2TermManagementProfileUpdate createIBridge2TermManagementProfileUpdate() {
        return new IBridge2TermManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileUpdateResponse }
     * 
     */
    public IBridge2TermManagementProfileUpdateResponse createIBridge2TermManagementProfileUpdateResponse() {
        return new IBridge2TermManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileList }
     * 
     */
    public IBridge2AlarmProfileList createIBridge2AlarmProfileList() {
        return new IBridge2AlarmProfileList();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileListResponse }
     * 
     */
    public IBridge2AlarmProfileListResponse createIBridge2AlarmProfileListResponse() {
        return new IBridge2AlarmProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileGet }
     * 
     */
    public IBridge2AlarmProfileGet createIBridge2AlarmProfileGet() {
        return new IBridge2AlarmProfileGet();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileGetResponse }
     * 
     */
    public IBridge2AlarmProfileGetResponse createIBridge2AlarmProfileGetResponse() {
        return new IBridge2AlarmProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileGetResult }
     * 
     */
    public IBridge2AlarmProfileGetResult createIBridge2AlarmProfileGetResult() {
        return new IBridge2AlarmProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileDelete }
     * 
     */
    public IBridge2AlarmProfileDelete createIBridge2AlarmProfileDelete() {
        return new IBridge2AlarmProfileDelete();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileDeleteResponse }
     * 
     */
    public IBridge2AlarmProfileDeleteResponse createIBridge2AlarmProfileDeleteResponse() {
        return new IBridge2AlarmProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileCreate }
     * 
     */
    public IBridge2AlarmProfileCreate createIBridge2AlarmProfileCreate() {
        return new IBridge2AlarmProfileCreate();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfile }
     * 
     */
    public IBridge2AlarmProfile createIBridge2AlarmProfile() {
        return new IBridge2AlarmProfile();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileCreateResponse }
     * 
     */
    public IBridge2AlarmProfileCreateResponse createIBridge2AlarmProfileCreateResponse() {
        return new IBridge2AlarmProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileClone }
     * 
     */
    public IBridge2AlarmProfileClone createIBridge2AlarmProfileClone() {
        return new IBridge2AlarmProfileClone();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileCloneResponse }
     * 
     */
    public IBridge2AlarmProfileCloneResponse createIBridge2AlarmProfileCloneResponse() {
        return new IBridge2AlarmProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileUpdate }
     * 
     */
    public IBridge2AlarmProfileUpdate createIBridge2AlarmProfileUpdate() {
        return new IBridge2AlarmProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileUpdateResponse }
     * 
     */
    public IBridge2AlarmProfileUpdateResponse createIBridge2AlarmProfileUpdateResponse() {
        return new IBridge2AlarmProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileList }
     * 
     */
    public IBridge2QosProfileList createIBridge2QosProfileList() {
        return new IBridge2QosProfileList();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileListResponse }
     * 
     */
    public IBridge2QosProfileListResponse createIBridge2QosProfileListResponse() {
        return new IBridge2QosProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileGet }
     * 
     */
    public IBridge2QosProfileGet createIBridge2QosProfileGet() {
        return new IBridge2QosProfileGet();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileGetResponse }
     * 
     */
    public IBridge2QosProfileGetResponse createIBridge2QosProfileGetResponse() {
        return new IBridge2QosProfileGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileGetResult }
     * 
     */
    public IBridge2QosProfileGetResult createIBridge2QosProfileGetResult() {
        return new IBridge2QosProfileGetResult();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileDelete }
     * 
     */
    public IBridge2QosProfileDelete createIBridge2QosProfileDelete() {
        return new IBridge2QosProfileDelete();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileDeleteResponse }
     * 
     */
    public IBridge2QosProfileDeleteResponse createIBridge2QosProfileDeleteResponse() {
        return new IBridge2QosProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileCreate }
     * 
     */
    public IBridge2QosProfileCreate createIBridge2QosProfileCreate() {
        return new IBridge2QosProfileCreate();
    }

    /**
     * Create an instance of {@link IBridge2QosProfile }
     * 
     */
    public IBridge2QosProfile createIBridge2QosProfile() {
        return new IBridge2QosProfile();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileCreateResponse }
     * 
     */
    public IBridge2QosProfileCreateResponse createIBridge2QosProfileCreateResponse() {
        return new IBridge2QosProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileClone }
     * 
     */
    public IBridge2QosProfileClone createIBridge2QosProfileClone() {
        return new IBridge2QosProfileClone();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileCloneResponse }
     * 
     */
    public IBridge2QosProfileCloneResponse createIBridge2QosProfileCloneResponse() {
        return new IBridge2QosProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileUpdate }
     * 
     */
    public IBridge2QosProfileUpdate createIBridge2QosProfileUpdate() {
        return new IBridge2QosProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileUpdateResponse }
     * 
     */
    public IBridge2QosProfileUpdateResponse createIBridge2QosProfileUpdateResponse() {
        return new IBridge2QosProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridge2WebUiAccessSet }
     * 
     */
    public IBridge2WebUiAccessSet createIBridge2WebUiAccessSet() {
        return new IBridge2WebUiAccessSet();
    }

    /**
     * Create an instance of {@link IBridge2WebUiAccessSetResponse }
     * 
     */
    public IBridge2WebUiAccessSetResponse createIBridge2WebUiAccessSetResponse() {
        return new IBridge2WebUiAccessSetResponse();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigGet }
     * 
     */
    public RelayGlobalConfigGet createRelayGlobalConfigGet() {
        return new RelayGlobalConfigGet();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigGetResponse }
     * 
     */
    public RelayGlobalConfigGetResponse createRelayGlobalConfigGetResponse() {
        return new RelayGlobalConfigGetResponse();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigGetResult }
     * 
     */
    public RelayGlobalConfigGetResult createRelayGlobalConfigGetResult() {
        return new RelayGlobalConfigGetResult();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigUpdate }
     * 
     */
    public RelayGlobalConfigUpdate createRelayGlobalConfigUpdate() {
        return new RelayGlobalConfigUpdate();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigDetail }
     * 
     */
    public RelayGlobalConfigDetail createRelayGlobalConfigDetail() {
        return new RelayGlobalConfigDetail();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigUpdateResponse }
     * 
     */
    public RelayGlobalConfigUpdateResponse createRelayGlobalConfigUpdateResponse() {
        return new RelayGlobalConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigAdd }
     * 
     */
    public RelayGlobalConfigAdd createRelayGlobalConfigAdd() {
        return new RelayGlobalConfigAdd();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigAddResponse }
     * 
     */
    public RelayGlobalConfigAddResponse createRelayGlobalConfigAddResponse() {
        return new RelayGlobalConfigAddResponse();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigDelete }
     * 
     */
    public RelayGlobalConfigDelete createRelayGlobalConfigDelete() {
        return new RelayGlobalConfigDelete();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigDeleteDetail }
     * 
     */
    public RelayGlobalConfigDeleteDetail createRelayGlobalConfigDeleteDetail() {
        return new RelayGlobalConfigDeleteDetail();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigDeleteResponse }
     * 
     */
    public RelayGlobalConfigDeleteResponse createRelayGlobalConfigDeleteResponse() {
        return new RelayGlobalConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link RelayConfigGet }
     * 
     */
    public RelayConfigGet createRelayConfigGet() {
        return new RelayConfigGet();
    }

    /**
     * Create an instance of {@link RelayConfigGetResponse }
     * 
     */
    public RelayConfigGetResponse createRelayConfigGetResponse() {
        return new RelayConfigGetResponse();
    }

    /**
     * Create an instance of {@link RelayConfigGetResult }
     * 
     */
    public RelayConfigGetResult createRelayConfigGetResult() {
        return new RelayConfigGetResult();
    }

    /**
     * Create an instance of {@link RelayConfigSet }
     * 
     */
    public RelayConfigSet createRelayConfigSet() {
        return new RelayConfigSet();
    }

    /**
     * Create an instance of {@link RelayDetails }
     * 
     */
    public RelayDetails createRelayDetails() {
        return new RelayDetails();
    }

    /**
     * Create an instance of {@link RelayConfigSetResponse }
     * 
     */
    public RelayConfigSetResponse createRelayConfigSetResponse() {
        return new RelayConfigSetResponse();
    }

    /**
     * Create an instance of {@link RelayProfileList }
     * 
     */
    public RelayProfileList createRelayProfileList() {
        return new RelayProfileList();
    }

    /**
     * Create an instance of {@link RelayProfileListResponse }
     * 
     */
    public RelayProfileListResponse createRelayProfileListResponse() {
        return new RelayProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayProfileGet }
     * 
     */
    public RelayProfileGet createRelayProfileGet() {
        return new RelayProfileGet();
    }

    /**
     * Create an instance of {@link RelayProfileGetResponse }
     * 
     */
    public RelayProfileGetResponse createRelayProfileGetResponse() {
        return new RelayProfileGetResponse();
    }

    /**
     * Create an instance of {@link RelayProfileGetResult }
     * 
     */
    public RelayProfileGetResult createRelayProfileGetResult() {
        return new RelayProfileGetResult();
    }

    /**
     * Create an instance of {@link RelayProfileDelete }
     * 
     */
    public RelayProfileDelete createRelayProfileDelete() {
        return new RelayProfileDelete();
    }

    /**
     * Create an instance of {@link RelayProfileDeleteResponse }
     * 
     */
    public RelayProfileDeleteResponse createRelayProfileDeleteResponse() {
        return new RelayProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link RelayProfileCreate }
     * 
     */
    public RelayProfileCreate createRelayProfileCreate() {
        return new RelayProfileCreate();
    }

    /**
     * Create an instance of {@link RelayProfile }
     * 
     */
    public RelayProfile createRelayProfile() {
        return new RelayProfile();
    }

    /**
     * Create an instance of {@link RelayProfileCreateResponse }
     * 
     */
    public RelayProfileCreateResponse createRelayProfileCreateResponse() {
        return new RelayProfileCreateResponse();
    }

    /**
     * Create an instance of {@link RelayProfileClone }
     * 
     */
    public RelayProfileClone createRelayProfileClone() {
        return new RelayProfileClone();
    }

    /**
     * Create an instance of {@link RelayProfileCloneResponse }
     * 
     */
    public RelayProfileCloneResponse createRelayProfileCloneResponse() {
        return new RelayProfileCloneResponse();
    }

    /**
     * Create an instance of {@link RelayProfileUpdate }
     * 
     */
    public RelayProfileUpdate createRelayProfileUpdate() {
        return new RelayProfileUpdate();
    }

    /**
     * Create an instance of {@link RelayProfileUpdateResponse }
     * 
     */
    public RelayProfileUpdateResponse createRelayProfileUpdateResponse() {
        return new RelayProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileList }
     * 
     */
    public RelaySystemDefaultProfileList createRelaySystemDefaultProfileList() {
        return new RelaySystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileListResponse }
     * 
     */
    public RelaySystemDefaultProfileListResponse createRelaySystemDefaultProfileListResponse() {
        return new RelaySystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileGet }
     * 
     */
    public RelaySystemDefaultProfileGet createRelaySystemDefaultProfileGet() {
        return new RelaySystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileGetResponse }
     * 
     */
    public RelaySystemDefaultProfileGetResponse createRelaySystemDefaultProfileGetResponse() {
        return new RelaySystemDefaultProfileGetResponse();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileGetResult }
     * 
     */
    public RelaySystemDefaultProfileGetResult createRelaySystemDefaultProfileGetResult() {
        return new RelaySystemDefaultProfileGetResult();
    }

    /**
     * Create an instance of {@link RelayPnpConfigList }
     * 
     */
    public RelayPnpConfigList createRelayPnpConfigList() {
        return new RelayPnpConfigList();
    }

    /**
     * Create an instance of {@link RelayPnpConfigListResponse }
     * 
     */
    public RelayPnpConfigListResponse createRelayPnpConfigListResponse() {
        return new RelayPnpConfigListResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigDelete }
     * 
     */
    public RelayPnpConfigDelete createRelayPnpConfigDelete() {
        return new RelayPnpConfigDelete();
    }

    /**
     * Create an instance of {@link RelayPnpConfigDeleteResponse }
     * 
     */
    public RelayPnpConfigDeleteResponse createRelayPnpConfigDeleteResponse() {
        return new RelayPnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigGet }
     * 
     */
    public RelayPnpConfigGet createRelayPnpConfigGet() {
        return new RelayPnpConfigGet();
    }

    /**
     * Create an instance of {@link RelayPnpConfigGetResponse }
     * 
     */
    public RelayPnpConfigGetResponse createRelayPnpConfigGetResponse() {
        return new RelayPnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigGetResult }
     * 
     */
    public RelayPnpConfigGetResult createRelayPnpConfigGetResult() {
        return new RelayPnpConfigGetResult();
    }

    /**
     * Create an instance of {@link RelayPnpConfigCreate }
     * 
     */
    public RelayPnpConfigCreate createRelayPnpConfigCreate() {
        return new RelayPnpConfigCreate();
    }

    /**
     * Create an instance of {@link RelayPnpDetailWs }
     * 
     */
    public RelayPnpDetailWs createRelayPnpDetailWs() {
        return new RelayPnpDetailWs();
    }

    /**
     * Create an instance of {@link RelayDetailsPnp }
     * 
     */
    public RelayDetailsPnp createRelayDetailsPnp() {
        return new RelayDetailsPnp();
    }

    /**
     * Create an instance of {@link RelayPnpConfigCreateResponse }
     * 
     */
    public RelayPnpConfigCreateResponse createRelayPnpConfigCreateResponse() {
        return new RelayPnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigClone }
     * 
     */
    public RelayPnpConfigClone createRelayPnpConfigClone() {
        return new RelayPnpConfigClone();
    }

    /**
     * Create an instance of {@link RelayPnpConfigCloneResponse }
     * 
     */
    public RelayPnpConfigCloneResponse createRelayPnpConfigCloneResponse() {
        return new RelayPnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigUpdate }
     * 
     */
    public RelayPnpConfigUpdate createRelayPnpConfigUpdate() {
        return new RelayPnpConfigUpdate();
    }

    /**
     * Create an instance of {@link RelayPnpConfigUpdateResponse }
     * 
     */
    public RelayPnpConfigUpdateResponse createRelayPnpConfigUpdateResponse() {
        return new RelayPnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigConvertFromNode }
     * 
     */
    public RelayPnpConfigConvertFromNode createRelayPnpConfigConvertFromNode() {
        return new RelayPnpConfigConvertFromNode();
    }

    /**
     * Create an instance of {@link RelayPnpConfigConvertFromNodeResponse }
     * 
     */
    public RelayPnpConfigConvertFromNodeResponse createRelayPnpConfigConvertFromNodeResponse() {
        return new RelayPnpConfigConvertFromNodeResponse();
    }

    /**
     * Create an instance of {@link RelayRedirect }
     * 
     */
    public RelayRedirect createRelayRedirect() {
        return new RelayRedirect();
    }

    /**
     * Create an instance of {@link RelayRedirectDetailWs }
     * 
     */
    public RelayRedirectDetailWs createRelayRedirectDetailWs() {
        return new RelayRedirectDetailWs();
    }

    /**
     * Create an instance of {@link RelayRedirectResponse }
     * 
     */
    public RelayRedirectResponse createRelayRedirectResponse() {
        return new RelayRedirectResponse();
    }

    /**
     * Create an instance of {@link RelayEnbError }
     * 
     */
    public RelayEnbError createRelayEnbError() {
        return new RelayEnbError();
    }

    /**
     * Create an instance of {@link RelayEnbErrorDetailWs }
     * 
     */
    public RelayEnbErrorDetailWs createRelayEnbErrorDetailWs() {
        return new RelayEnbErrorDetailWs();
    }

    /**
     * Create an instance of {@link RelayEnbErrorResponse }
     * 
     */
    public RelayEnbErrorResponse createRelayEnbErrorResponse() {
        return new RelayEnbErrorResponse();
    }

    /**
     * Create an instance of {@link RelayScan }
     * 
     */
    public RelayScan createRelayScan() {
        return new RelayScan();
    }

    /**
     * Create an instance of {@link RelayScanResponse }
     * 
     */
    public RelayScanResponse createRelayScanResponse() {
        return new RelayScanResponse();
    }

    /**
     * Create an instance of {@link RelayForceScan }
     * 
     */
    public RelayForceScan createRelayForceScan() {
        return new RelayForceScan();
    }

    /**
     * Create an instance of {@link RelayForceScanResponse }
     * 
     */
    public RelayForceScanResponse createRelayForceScanResponse() {
        return new RelayForceScanResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileList }
     * 
     */
    public RelayAdvancedProfileList createRelayAdvancedProfileList() {
        return new RelayAdvancedProfileList();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileListResponse }
     * 
     */
    public RelayAdvancedProfileListResponse createRelayAdvancedProfileListResponse() {
        return new RelayAdvancedProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileGet }
     * 
     */
    public RelayAdvancedProfileGet createRelayAdvancedProfileGet() {
        return new RelayAdvancedProfileGet();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileGetResponse }
     * 
     */
    public RelayAdvancedProfileGetResponse createRelayAdvancedProfileGetResponse() {
        return new RelayAdvancedProfileGetResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileGetResult }
     * 
     */
    public RelayAdvancedProfileGetResult createRelayAdvancedProfileGetResult() {
        return new RelayAdvancedProfileGetResult();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileDelete }
     * 
     */
    public RelayAdvancedProfileDelete createRelayAdvancedProfileDelete() {
        return new RelayAdvancedProfileDelete();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileDeleteResponse }
     * 
     */
    public RelayAdvancedProfileDeleteResponse createRelayAdvancedProfileDeleteResponse() {
        return new RelayAdvancedProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileCreate }
     * 
     */
    public RelayAdvancedProfileCreate createRelayAdvancedProfileCreate() {
        return new RelayAdvancedProfileCreate();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfile }
     * 
     */
    public RelayAdvancedProfile createRelayAdvancedProfile() {
        return new RelayAdvancedProfile();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileCreateResponse }
     * 
     */
    public RelayAdvancedProfileCreateResponse createRelayAdvancedProfileCreateResponse() {
        return new RelayAdvancedProfileCreateResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileClone }
     * 
     */
    public RelayAdvancedProfileClone createRelayAdvancedProfileClone() {
        return new RelayAdvancedProfileClone();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileCloneResponse }
     * 
     */
    public RelayAdvancedProfileCloneResponse createRelayAdvancedProfileCloneResponse() {
        return new RelayAdvancedProfileCloneResponse();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileUpdate }
     * 
     */
    public RelayAdvancedProfileUpdate createRelayAdvancedProfileUpdate() {
        return new RelayAdvancedProfileUpdate();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileUpdateResponse }
     * 
     */
    public RelayAdvancedProfileUpdateResponse createRelayAdvancedProfileUpdateResponse() {
        return new RelayAdvancedProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link Ib440QosProfileList }
     * 
     */
    public Ib440QosProfileList createIb440QosProfileList() {
        return new Ib440QosProfileList();
    }

    /**
     * Create an instance of {@link Ib440QosProfileListResponse }
     * 
     */
    public Ib440QosProfileListResponse createIb440QosProfileListResponse() {
        return new Ib440QosProfileListResponse();
    }

    /**
     * Create an instance of {@link Ib440QosProfileGet }
     * 
     */
    public Ib440QosProfileGet createIb440QosProfileGet() {
        return new Ib440QosProfileGet();
    }

    /**
     * Create an instance of {@link Ib440QosProfileGetResponse }
     * 
     */
    public Ib440QosProfileGetResponse createIb440QosProfileGetResponse() {
        return new Ib440QosProfileGetResponse();
    }

    /**
     * Create an instance of {@link Ib440ProfileGetResult }
     * 
     */
    public Ib440ProfileGetResult createIb440ProfileGetResult() {
        return new Ib440ProfileGetResult();
    }

    /**
     * Create an instance of {@link Ib440QosProfileDelete }
     * 
     */
    public Ib440QosProfileDelete createIb440QosProfileDelete() {
        return new Ib440QosProfileDelete();
    }

    /**
     * Create an instance of {@link Ib440QosProfileDeleteResponse }
     * 
     */
    public Ib440QosProfileDeleteResponse createIb440QosProfileDeleteResponse() {
        return new Ib440QosProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link Ib440QosProfileCreate }
     * 
     */
    public Ib440QosProfileCreate createIb440QosProfileCreate() {
        return new Ib440QosProfileCreate();
    }

    /**
     * Create an instance of {@link IBridge11AcQosProfile }
     * 
     */
    public IBridge11AcQosProfile createIBridge11AcQosProfile() {
        return new IBridge11AcQosProfile();
    }

    /**
     * Create an instance of {@link Ib440QosProfileCreateResponse }
     * 
     */
    public Ib440QosProfileCreateResponse createIb440QosProfileCreateResponse() {
        return new Ib440QosProfileCreateResponse();
    }

    /**
     * Create an instance of {@link Ib440QosProfileClone }
     * 
     */
    public Ib440QosProfileClone createIb440QosProfileClone() {
        return new Ib440QosProfileClone();
    }

    /**
     * Create an instance of {@link Ib440QosProfileCloneResponse }
     * 
     */
    public Ib440QosProfileCloneResponse createIb440QosProfileCloneResponse() {
        return new Ib440QosProfileCloneResponse();
    }

    /**
     * Create an instance of {@link Ib440QosProfileUpdate }
     * 
     */
    public Ib440QosProfileUpdate createIb440QosProfileUpdate() {
        return new Ib440QosProfileUpdate();
    }

    /**
     * Create an instance of {@link Ib440QosProfileUpdateResponse }
     * 
     */
    public Ib440QosProfileUpdateResponse createIb440QosProfileUpdateResponse() {
        return new Ib440QosProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link RelayLocationLockRedeploymentActionSet }
     * 
     */
    public RelayLocationLockRedeploymentActionSet createRelayLocationLockRedeploymentActionSet() {
        return new RelayLocationLockRedeploymentActionSet();
    }

    /**
     * Create an instance of {@link RelayLocationLockRedeploymentActionSetResponse }
     * 
     */
    public RelayLocationLockRedeploymentActionSetResponse createRelayLocationLockRedeploymentActionSetResponse() {
        return new RelayLocationLockRedeploymentActionSetResponse();
    }

    /**
     * Create an instance of {@link IBridge2ConfigGet }
     * 
     */
    public IBridge2ConfigGet createIBridge2ConfigGet() {
        return new IBridge2ConfigGet();
    }

    /**
     * Create an instance of {@link IBridge2ConfigGetResponse }
     * 
     */
    public IBridge2ConfigGetResponse createIBridge2ConfigGetResponse() {
        return new IBridge2ConfigGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2ConfigGetResult }
     * 
     */
    public IBridge2ConfigGetResult createIBridge2ConfigGetResult() {
        return new IBridge2ConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridge2ConfigSet }
     * 
     */
    public IBridge2ConfigSet createIBridge2ConfigSet() {
        return new IBridge2ConfigSet();
    }

    /**
     * Create an instance of {@link IBridge2Details }
     * 
     */
    public IBridge2Details createIBridge2Details() {
        return new IBridge2Details();
    }

    /**
     * Create an instance of {@link IBridge2ConfigSetResponse }
     * 
     */
    public IBridge2ConfigSetResponse createIBridge2ConfigSetResponse() {
        return new IBridge2ConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigList }
     * 
     */
    public IBridge2PnpConfigList createIBridge2PnpConfigList() {
        return new IBridge2PnpConfigList();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigListResponse }
     * 
     */
    public IBridge2PnpConfigListResponse createIBridge2PnpConfigListResponse() {
        return new IBridge2PnpConfigListResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigDelete }
     * 
     */
    public IBridge2PnpConfigDelete createIBridge2PnpConfigDelete() {
        return new IBridge2PnpConfigDelete();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigDeleteResponse }
     * 
     */
    public IBridge2PnpConfigDeleteResponse createIBridge2PnpConfigDeleteResponse() {
        return new IBridge2PnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigGet }
     * 
     */
    public IBridge2PnpConfigGet createIBridge2PnpConfigGet() {
        return new IBridge2PnpConfigGet();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigGetResponse }
     * 
     */
    public IBridge2PnpConfigGetResponse createIBridge2PnpConfigGetResponse() {
        return new IBridge2PnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigGetResult }
     * 
     */
    public IBridge2PnpConfigGetResult createIBridge2PnpConfigGetResult() {
        return new IBridge2PnpConfigGetResult();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigCreate }
     * 
     */
    public IBridge2PnpConfigCreate createIBridge2PnpConfigCreate() {
        return new IBridge2PnpConfigCreate();
    }

    /**
     * Create an instance of {@link IBridge2PnpDetailWs }
     * 
     */
    public IBridge2PnpDetailWs createIBridge2PnpDetailWs() {
        return new IBridge2PnpDetailWs();
    }

    /**
     * Create an instance of {@link IBridge2DetailsPnp }
     * 
     */
    public IBridge2DetailsPnp createIBridge2DetailsPnp() {
        return new IBridge2DetailsPnp();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigCreateResponse }
     * 
     */
    public IBridge2PnpConfigCreateResponse createIBridge2PnpConfigCreateResponse() {
        return new IBridge2PnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigClone }
     * 
     */
    public IBridge2PnpConfigClone createIBridge2PnpConfigClone() {
        return new IBridge2PnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigCloneResponse }
     * 
     */
    public IBridge2PnpConfigCloneResponse createIBridge2PnpConfigCloneResponse() {
        return new IBridge2PnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigUpdate }
     * 
     */
    public IBridge2PnpConfigUpdate createIBridge2PnpConfigUpdate() {
        return new IBridge2PnpConfigUpdate();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigUpdateResponse }
     * 
     */
    public IBridge2PnpConfigUpdateResponse createIBridge2PnpConfigUpdateResponse() {
        return new IBridge2PnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigConvertFromNode }
     * 
     */
    public IBridge2PnpConfigConvertFromNode createIBridge2PnpConfigConvertFromNode() {
        return new IBridge2PnpConfigConvertFromNode();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigConvertFromNodeResponse }
     * 
     */
    public IBridge2PnpConfigConvertFromNodeResponse createIBridge2PnpConfigConvertFromNodeResponse() {
        return new IBridge2PnpConfigConvertFromNodeResponse();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link Ib440ConfigResult }
     * 
     */
    public Ib440ConfigResult createIb440ConfigResult() {
        return new Ib440ConfigResult();
    }

    /**
     * Create an instance of {@link Ib440DetailsGet }
     * 
     */
    public Ib440DetailsGet createIb440DetailsGet() {
        return new Ib440DetailsGet();
    }

    /**
     * Create an instance of {@link SnmpDetailWs }
     * 
     */
    public SnmpDetailWs createSnmpDetailWs() {
        return new SnmpDetailWs();
    }

    /**
     * Create an instance of {@link NodeCustomProperty }
     * 
     */
    public NodeCustomProperty createNodeCustomProperty() {
        return new NodeCustomProperty();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigResult }
     * 
     */
    public IBridgeBaseConfigResult createIBridgeBaseConfigResult() {
        return new IBridgeBaseConfigResult();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigResult }
     * 
     */
    public IBridgeTermConfigResult createIBridgeTermConfigResult() {
        return new IBridgeTermConfigResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileResult }
     * 
     */
    public IBridgeBaseManagementProfileResult createIBridgeBaseManagementProfileResult() {
        return new IBridgeBaseManagementProfileResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileGet2 }
     * 
     */
    public IBridgeBaseManagementProfileGet2 createIBridgeBaseManagementProfileGet2() {
        return new IBridgeBaseManagementProfileGet2();
    }

    /**
     * Create an instance of {@link ProfileResult }
     * 
     */
    public ProfileResult createProfileResult() {
        return new ProfileResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileResult }
     * 
     */
    public IBridgeBaseRadioProfileResult createIBridgeBaseRadioProfileResult() {
        return new IBridgeBaseRadioProfileResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileGet2 }
     * 
     */
    public IBridgeBaseRadioProfileGet2 createIBridgeBaseRadioProfileGet2() {
        return new IBridgeBaseRadioProfileGet2();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfig }
     * 
     */
    public IBridgeBasePnpConfig createIBridgeBasePnpConfig() {
        return new IBridgeBasePnpConfig();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpSwSchedule }
     * 
     */
    public IBridgeBasePnpSwSchedule createIBridgeBasePnpSwSchedule() {
        return new IBridgeBasePnpSwSchedule();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigWs }
     * 
     */
    public IBridgeTermPnpConfigWs createIBridgeTermPnpConfigWs() {
        return new IBridgeTermPnpConfigWs();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpSwSchedule }
     * 
     */
    public IBridgeTermPnpSwSchedule createIBridgeTermPnpSwSchedule() {
        return new IBridgeTermPnpSwSchedule();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileResult }
     * 
     */
    public IBridgeTermRadioProfileResult createIBridgeTermRadioProfileResult() {
        return new IBridgeTermRadioProfileResult();
    }

    /**
     * Create an instance of {@link IbTermRadioProfileGet }
     * 
     */
    public IbTermRadioProfileGet createIbTermRadioProfileGet() {
        return new IbTermRadioProfileGet();
    }

    /**
     * Create an instance of {@link ChannelProfileListContainer }
     * 
     */
    public ChannelProfileListContainer createChannelProfileListContainer() {
        return new ChannelProfileListContainer();
    }

    /**
     * Create an instance of {@link IbTermChannelProfileEntry }
     * 
     */
    public IbTermChannelProfileEntry createIbTermChannelProfileEntry() {
        return new IbTermChannelProfileEntry();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileResult }
     * 
     */
    public IBridgeBaseSystemDefaultProfileResult createIBridgeBaseSystemDefaultProfileResult() {
        return new IBridgeBaseSystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileResult }
     * 
     */
    public IBridgeTermSystemDefaultProfileResult createIBridgeTermSystemDefaultProfileResult() {
        return new IBridgeTermSystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link IbBaseStateGetWs }
     * 
     */
    public IbBaseStateGetWs createIbBaseStateGetWs() {
        return new IbBaseStateGetWs();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileResult }
     * 
     */
    public IBridge2BaseManagementProfileResult createIBridge2BaseManagementProfileResult() {
        return new IBridge2BaseManagementProfileResult();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementProfileGet2 }
     * 
     */
    public IBridge2BaseManagementProfileGet2 createIBridge2BaseManagementProfileGet2() {
        return new IBridge2BaseManagementProfileGet2();
    }

    /**
     * Create an instance of {@link IBridge2BaseManagementParams }
     * 
     */
    public IBridge2BaseManagementParams createIBridge2BaseManagementParams() {
        return new IBridge2BaseManagementParams();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileResult }
     * 
     */
    public IBridge2TermManagementProfileResult createIBridge2TermManagementProfileResult() {
        return new IBridge2TermManagementProfileResult();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementProfileGet2 }
     * 
     */
    public IBridge2TermManagementProfileGet2 createIBridge2TermManagementProfileGet2() {
        return new IBridge2TermManagementProfileGet2();
    }

    /**
     * Create an instance of {@link IBridge2TermManagementParams }
     * 
     */
    public IBridge2TermManagementParams createIBridge2TermManagementParams() {
        return new IBridge2TermManagementParams();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileResult }
     * 
     */
    public IBridge2AlarmProfileResult createIBridge2AlarmProfileResult() {
        return new IBridge2AlarmProfileResult();
    }

    /**
     * Create an instance of {@link IBridge2AlarmProfileGet2 }
     * 
     */
    public IBridge2AlarmProfileGet2 createIBridge2AlarmProfileGet2() {
        return new IBridge2AlarmProfileGet2();
    }

    /**
     * Create an instance of {@link IBridge2AlarmParams }
     * 
     */
    public IBridge2AlarmParams createIBridge2AlarmParams() {
        return new IBridge2AlarmParams();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileResult }
     * 
     */
    public IBridge2QosProfileResult createIBridge2QosProfileResult() {
        return new IBridge2QosProfileResult();
    }

    /**
     * Create an instance of {@link IBridge2QosProfileGet2 }
     * 
     */
    public IBridge2QosProfileGet2 createIBridge2QosProfileGet2() {
        return new IBridge2QosProfileGet2();
    }

    /**
     * Create an instance of {@link IBridge2QosParams }
     * 
     */
    public IBridge2QosParams createIBridge2QosParams() {
        return new IBridge2QosParams();
    }

    /**
     * Create an instance of {@link RelayGlobalConfigResult }
     * 
     */
    public RelayGlobalConfigResult createRelayGlobalConfigResult() {
        return new RelayGlobalConfigResult();
    }

    /**
     * Create an instance of {@link RelayConfigResult }
     * 
     */
    public RelayConfigResult createRelayConfigResult() {
        return new RelayConfigResult();
    }

    /**
     * Create an instance of {@link RelayDetailsParams }
     * 
     */
    public RelayDetailsParams createRelayDetailsParams() {
        return new RelayDetailsParams();
    }

    /**
     * Create an instance of {@link RelayProfileParams }
     * 
     */
    public RelayProfileParams createRelayProfileParams() {
        return new RelayProfileParams();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileParams }
     * 
     */
    public RelayAdvancedProfileParams createRelayAdvancedProfileParams() {
        return new RelayAdvancedProfileParams();
    }

    /**
     * Create an instance of {@link PdclList }
     * 
     */
    public PdclList createPdclList() {
        return new PdclList();
    }

    /**
     * Create an instance of {@link AllowedBandWs }
     * 
     */
    public AllowedBandWs createAllowedBandWs() {
        return new AllowedBandWs();
    }

    /**
     * Create an instance of {@link QdclListContainer }
     * 
     */
    public QdclListContainer createQdclListContainer() {
        return new QdclListContainer();
    }

    /**
     * Create an instance of {@link ConnectedDeviceTypeToApnList }
     * 
     */
    public ConnectedDeviceTypeToApnList createConnectedDeviceTypeToApnList() {
        return new ConnectedDeviceTypeToApnList();
    }

    /**
     * Create an instance of {@link PeriodicRescanDailyWs }
     * 
     */
    public PeriodicRescanDailyWs createPeriodicRescanDailyWs() {
        return new PeriodicRescanDailyWs();
    }

    /**
     * Create an instance of {@link PeriodicRescanWeeklyWs }
     * 
     */
    public PeriodicRescanWeeklyWs createPeriodicRescanWeeklyWs() {
        return new PeriodicRescanWeeklyWs();
    }

    /**
     * Create an instance of {@link PeriodicRescanMonthlyWs }
     * 
     */
    public PeriodicRescanMonthlyWs createPeriodicRescanMonthlyWs() {
        return new PeriodicRescanMonthlyWs();
    }

    /**
     * Create an instance of {@link EciBlacklistValuesListContainer }
     * 
     */
    public EciBlacklistValuesListContainer createEciBlacklistValuesListContainer() {
        return new EciBlacklistValuesListContainer();
    }

    /**
     * Create an instance of {@link LanMacAddressListContainer }
     * 
     */
    public LanMacAddressListContainer createLanMacAddressListContainer() {
        return new LanMacAddressListContainer();
    }

    /**
     * Create an instance of {@link PdclEntryWs }
     * 
     */
    public PdclEntryWs createPdclEntryWs() {
        return new PdclEntryWs();
    }

    /**
     * Create an instance of {@link AllowedBandItemWs }
     * 
     */
    public AllowedBandItemWs createAllowedBandItemWs() {
        return new AllowedBandItemWs();
    }

    /**
     * Create an instance of {@link QdclEntryWs }
     * 
     */
    public QdclEntryWs createQdclEntryWs() {
        return new QdclEntryWs();
    }

    /**
     * Create an instance of {@link ConnectedDeviceTypeToApnEntryWs }
     * 
     */
    public ConnectedDeviceTypeToApnEntryWs createConnectedDeviceTypeToApnEntryWs() {
        return new ConnectedDeviceTypeToApnEntryWs();
    }

    /**
     * Create an instance of {@link DailyOptionEveryXDay }
     * 
     */
    public DailyOptionEveryXDay createDailyOptionEveryXDay() {
        return new DailyOptionEveryXDay();
    }

    /**
     * Create an instance of {@link DailyOptionEveryWeekDay }
     * 
     */
    public DailyOptionEveryWeekDay createDailyOptionEveryWeekDay() {
        return new DailyOptionEveryWeekDay();
    }

    /**
     * Create an instance of {@link ArrayOfDaysOfWeekRelay }
     * 
     */
    public ArrayOfDaysOfWeekRelay createArrayOfDaysOfWeekRelay() {
        return new ArrayOfDaysOfWeekRelay();
    }

    /**
     * Create an instance of {@link MonthlyOptionDateOfEveryXMonths }
     * 
     */
    public MonthlyOptionDateOfEveryXMonths createMonthlyOptionDateOfEveryXMonths() {
        return new MonthlyOptionDateOfEveryXMonths();
    }

    /**
     * Create an instance of {@link MonthlyOptionDayWeekOfEveryYMonths }
     * 
     */
    public MonthlyOptionDayWeekOfEveryYMonths createMonthlyOptionDayWeekOfEveryYMonths() {
        return new MonthlyOptionDayWeekOfEveryYMonths();
    }

    /**
     * Create an instance of {@link EciBlackListEntryWs }
     * 
     */
    public EciBlackListEntryWs createEciBlackListEntryWs() {
        return new EciBlackListEntryWs();
    }

    /**
     * Create an instance of {@link LanMacAddressEntryWs }
     * 
     */
    public LanMacAddressEntryWs createLanMacAddressEntryWs() {
        return new LanMacAddressEntryWs();
    }

    /**
     * Create an instance of {@link RelayProfileResult }
     * 
     */
    public RelayProfileResult createRelayProfileResult() {
        return new RelayProfileResult();
    }

    /**
     * Create an instance of {@link RelayProfileGet2 }
     * 
     */
    public RelayProfileGet2 createRelayProfileGet2() {
        return new RelayProfileGet2();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileResult }
     * 
     */
    public RelaySystemDefaultProfileResult createRelaySystemDefaultProfileResult() {
        return new RelaySystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link RelayPnpConfigWs }
     * 
     */
    public RelayPnpConfigWs createRelayPnpConfigWs() {
        return new RelayPnpConfigWs();
    }

    /**
     * Create an instance of {@link RelayPnpSwSchedule }
     * 
     */
    public RelayPnpSwSchedule createRelayPnpSwSchedule() {
        return new RelayPnpSwSchedule();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileResult }
     * 
     */
    public RelayAdvancedProfileResult createRelayAdvancedProfileResult() {
        return new RelayAdvancedProfileResult();
    }

    /**
     * Create an instance of {@link RelayAdvancedProfileGet2 }
     * 
     */
    public RelayAdvancedProfileGet2 createRelayAdvancedProfileGet2() {
        return new RelayAdvancedProfileGet2();
    }

    /**
     * Create an instance of {@link Ib11AcQosProfileResult }
     * 
     */
    public Ib11AcQosProfileResult createIb11AcQosProfileResult() {
        return new Ib11AcQosProfileResult();
    }

    /**
     * Create an instance of {@link IBridge11AcQosProfileGet }
     * 
     */
    public IBridge11AcQosProfileGet createIBridge11AcQosProfileGet() {
        return new IBridge11AcQosProfileGet();
    }

    /**
     * Create an instance of {@link Ib11AcQosProfileTrafficClassesListContainer }
     * 
     */
    public Ib11AcQosProfileTrafficClassesListContainer createIb11AcQosProfileTrafficClassesListContainer() {
        return new Ib11AcQosProfileTrafficClassesListContainer();
    }

    /**
     * Create an instance of {@link Ib11AcQosProfileTrafficClasses }
     * 
     */
    public Ib11AcQosProfileTrafficClasses createIb11AcQosProfileTrafficClasses() {
        return new Ib11AcQosProfileTrafficClasses();
    }

    /**
     * Create an instance of {@link IBridge2ConfigResult }
     * 
     */
    public IBridge2ConfigResult createIBridge2ConfigResult() {
        return new IBridge2ConfigResult();
    }

    /**
     * Create an instance of {@link IBridge2DetailsParams }
     * 
     */
    public IBridge2DetailsParams createIBridge2DetailsParams() {
        return new IBridge2DetailsParams();
    }

    /**
     * Create an instance of {@link ArrayOfChannelMode }
     * 
     */
    public ArrayOfChannelMode createArrayOfChannelMode() {
        return new ArrayOfChannelMode();
    }

    /**
     * Create an instance of {@link IBridge2PnpConfigWs }
     * 
     */
    public IBridge2PnpConfigWs createIBridge2PnpConfigWs() {
        return new IBridge2PnpConfigWs();
    }

    /**
     * Create an instance of {@link IBridge2PnpSwSchedule }
     * 
     */
    public IBridge2PnpSwSchedule createIBridge2PnpSwSchedule() {
        return new IBridge2PnpSwSchedule();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateStart", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridge2PnpSwScheduleDateStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateStart_QNAME, XMLGregorianCalendar.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateEnd", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridge2PnpSwScheduleDateEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateEnd_QNAME, XMLGregorianCalendar.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sunday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleSunday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSunday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Monday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleMonday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleMonday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tuesday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleTuesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleTuesday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Wednesday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleWednesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleWednesday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Thursday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleThursday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleThursday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Friday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleFriday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleFriday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Saturday", scope = IBridge2PnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridge2PnpSwScheduleSaturday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSaturday_QNAME, Boolean.class, IBridge2PnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Role", scope = IBridge2DetailsParams.class)
    public JAXBElement<DeviceModes> createIBridge2DetailsParamsRole(DeviceModes value) {
        return new JAXBElement<DeviceModes>(_IBridge2DetailsParamsRole_QNAME, DeviceModes.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessEnabled", scope = IBridge2DetailsParams.class)
    public JAXBElement<Boolean> createIBridge2DetailsParamsWirelessEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2DetailsParamsWirelessEnabled_QNAME, Boolean.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetEnabled", scope = IBridge2DetailsParams.class)
    public JAXBElement<Boolean> createIBridge2DetailsParamsEthernetEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2DetailsParamsEthernetEnabled_QNAME, Boolean.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoChannel", scope = IBridge2DetailsParams.class)
    public JAXBElement<Boolean> createIBridge2DetailsParamsAutoChannel(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2DetailsParamsAutoChannel_QNAME, Boolean.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaximumChannelWidth", scope = IBridge2DetailsParams.class)
    public JAXBElement<String> createIBridge2DetailsParamsMaximumChannelWidth(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsMaximumChannelWidth_QNAME, String.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChannelWidth", scope = IBridge2DetailsParams.class)
    public JAXBElement<String> createIBridge2DetailsParamsChannelWidth(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsChannelWidth_QNAME, String.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CenterFrequency", scope = IBridge2DetailsParams.class)
    public JAXBElement<String> createIBridge2DetailsParamsCenterFrequency(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsCenterFrequency_QNAME, String.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CenterFrequency2", scope = IBridge2DetailsParams.class)
    public JAXBElement<String> createIBridge2DetailsParamsCenterFrequency2(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsCenterFrequency2_QNAME, String.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BaseAntennaGain", scope = IBridge2DetailsParams.class)
    public JAXBElement<Integer> createIBridge2DetailsParamsBaseAntennaGain(Integer value) {
        return new JAXBElement<Integer>(_IBridge2DetailsParamsBaseAntennaGain_QNAME, Integer.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TermAntennaGain", scope = IBridge2DetailsParams.class)
    public JAXBElement<Integer> createIBridge2DetailsParamsTermAntennaGain(Integer value) {
        return new JAXBElement<Integer>(_IBridge2DetailsParamsTermAntennaGain_QNAME, Integer.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoPowerModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoPowerMode", scope = IBridge2DetailsParams.class)
    public JAXBElement<AutoPowerModes> createIBridge2DetailsParamsAutoPowerMode(AutoPowerModes value) {
        return new JAXBElement<AutoPowerModes>(_IBridge2DetailsParamsAutoPowerMode_QNAME, AutoPowerModes.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower1", scope = IBridge2DetailsParams.class)
    public JAXBElement<Integer> createIBridge2DetailsParamsTxPower1(Integer value) {
        return new JAXBElement<Integer>(_IBridge2DetailsParamsTxPower1_QNAME, Integer.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower2", scope = IBridge2DetailsParams.class)
    public JAXBElement<Integer> createIBridge2DetailsParamsTxPower2(Integer value) {
        return new JAXBElement<Integer>(_IBridge2DetailsParamsTxPower2_QNAME, Integer.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetPortSpeed", scope = IBridge2DetailsParams.class)
    public JAXBElement<String> createIBridge2DetailsParamsEthernetPortSpeed(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsEthernetPortSpeed_QNAME, String.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoNegMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoNegotiationMode", scope = IBridge2DetailsParams.class)
    public JAXBElement<AutoNegMode> createIBridge2DetailsParamsAutoNegotiationMode(AutoNegMode value) {
        return new JAXBElement<AutoNegMode>(_IBridge2DetailsParamsAutoNegotiationMode_QNAME, AutoNegMode.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RecoverySSIDEnabled", scope = IBridge2DetailsParams.class)
    public JAXBElement<Boolean> createIBridge2DetailsParamsRecoverySSIDEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2DetailsParamsRecoverySSIDEnabled_QNAME, Boolean.class, IBridge2DetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VlanPriority", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Boolean> createIb11AcQosProfileTrafficClassesVlanPriority(Boolean value) {
        return new JAXBElement<Boolean>(_Ib11AcQosProfileTrafficClassesVlanPriority_QNAME, Boolean.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCir", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Double> createIb11AcQosProfileTrafficClassesUlCir(Double value) {
        return new JAXBElement<Double>(_Ib11AcQosProfileTrafficClassesUlCir_QNAME, Double.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCirUnit", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Unit> createIb11AcQosProfileTrafficClassesUlCirUnit(Unit value) {
        return new JAXBElement<Unit>(_Ib11AcQosProfileTrafficClassesUlCirUnit_QNAME, Unit.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMir", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Double> createIb11AcQosProfileTrafficClassesUlMir(Double value) {
        return new JAXBElement<Double>(_Ib11AcQosProfileTrafficClassesUlMir_QNAME, Double.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMirUnit", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Unit> createIb11AcQosProfileTrafficClassesUlMirUnit(Unit value) {
        return new JAXBElement<Unit>(_Ib11AcQosProfileTrafficClassesUlMirUnit_QNAME, Unit.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCir", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Double> createIb11AcQosProfileTrafficClassesDlCir(Double value) {
        return new JAXBElement<Double>(_Ib11AcQosProfileTrafficClassesDlCir_QNAME, Double.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCirUnit", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Unit> createIb11AcQosProfileTrafficClassesDlCirUnit(Unit value) {
        return new JAXBElement<Unit>(_Ib11AcQosProfileTrafficClassesDlCirUnit_QNAME, Unit.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMir", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Double> createIb11AcQosProfileTrafficClassesDlMir(Double value) {
        return new JAXBElement<Double>(_Ib11AcQosProfileTrafficClassesDlMir_QNAME, Double.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMirUnit", scope = Ib11AcQosProfileTrafficClasses.class)
    public JAXBElement<Unit> createIb11AcQosProfileTrafficClassesDlMirUnit(Unit value) {
        return new JAXBElement<Unit>(_Ib11AcQosProfileTrafficClassesDlMirUnit_QNAME, Unit.class, Ib11AcQosProfileTrafficClasses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge440HardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridge11AcQosProfile.class)
    public JAXBElement<IBridge440HardwareTypes> createIBridge11AcQosProfileHardwareCategory(IBridge440HardwareTypes value) {
        return new JAXBElement<IBridge440HardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridge440HardwareTypes.class, IBridge11AcQosProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandwidthRestrictions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandwidthRestriction", scope = IBridge11AcQosProfile.class)
    public JAXBElement<BandwidthRestrictions> createIBridge11AcQosProfileBandwidthRestriction(BandwidthRestrictions value) {
        return new JAXBElement<BandwidthRestrictions>(_IBridge11AcQosProfileBandwidthRestriction_QNAME, BandwidthRestrictions.class, IBridge11AcQosProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlBandwidth", scope = IBridge11AcQosProfile.class)
    public JAXBElement<Double> createIBridge11AcQosProfileUlBandwidth(Double value) {
        return new JAXBElement<Double>(_IBridge11AcQosProfileUlBandwidth_QNAME, Double.class, IBridge11AcQosProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlBandwidth", scope = IBridge11AcQosProfile.class)
    public JAXBElement<Double> createIBridge11AcQosProfileDlBandwidth(Double value) {
        return new JAXBElement<Double>(_IBridge11AcQosProfileDlBandwidth_QNAME, Double.class, IBridge11AcQosProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerCycleRescanInterval", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsPowerCycleRescanInterval(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsPowerCycleRescanInterval_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebGuiAccessWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WebGUIAccessEnabled", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<WebGuiAccessWs> createRelayAdvancedProfileParamsWebGUIAccessEnabled(WebGuiAccessWs value) {
        return new JAXBElement<WebGuiAccessWs>(_RelayAdvancedProfileParamsWebGUIAccessEnabled_QNAME, WebGuiAccessWs.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiDisableTemp", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsWifiDisableTemp(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsWifiDisableTemp_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnodebDisableTemp", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsEnodebDisableTemp(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsEnodebDisableTemp_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TempHysteris", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsTempHysteris(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsTempHysteris_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CarrierAggregationRsrpThreshold", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsCarrierAggregationRsrpThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsCarrierAggregationRsrpThreshold_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiRssiThresholdExcellent", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsWifiRssiThresholdExcellent(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsWifiRssiThresholdExcellent_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiRssiThresholdGood", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsWifiRssiThresholdGood(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsWifiRssiThresholdGood_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiRssiThresholdAcceptable", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsWifiRssiThresholdAcceptable(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsWifiRssiThresholdAcceptable_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PageTimeout", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsPageTimeout(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsPageTimeout_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupScanModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GroupScanMode", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<GroupScanModesWs> createRelayAdvancedProfileParamsGroupScanMode(GroupScanModesWs value) {
        return new JAXBElement<GroupScanModesWs>(_RelayAdvancedProfileParamsGroupScanMode_QNAME, GroupScanModesWs.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Apn1SnmpConnectionLossTimer", scope = RelayAdvancedProfileParams.class)
    public JAXBElement<Integer> createRelayAdvancedProfileParamsApn1SnmpConnectionLossTimer(Integer value) {
        return new JAXBElement<Integer>(_RelayAdvancedProfileParamsApn1SnmpConnectionLossTimer_QNAME, Integer.class, RelayAdvancedProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesRelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = RelayAdvancedProfile.class)
    public JAXBElement<CategoriesRelay> createRelayAdvancedProfileHardwareCategory(CategoriesRelay value) {
        return new JAXBElement<CategoriesRelay>(_IBridge11AcQosProfileHardwareCategory_QNAME, CategoriesRelay.class, RelayAdvancedProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RelaySnmpPort", scope = BaseRedirect.class)
    public JAXBElement<Integer> createBaseRedirectRelaySnmpPort(Integer value) {
        return new JAXBElement<Integer>(_BaseRedirectRelaySnmpPort_QNAME, Integer.class, BaseRedirect.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RelaySnmpVersion", scope = BaseRedirect.class)
    public JAXBElement<SnmpAgentVersion> createBaseRedirectRelaySnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_BaseRedirectRelaySnmpVersion_QNAME, SnmpAgentVersion.class, BaseRedirect.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateStart", scope = RelayPnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createRelayPnpSwScheduleDateStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateStart_QNAME, XMLGregorianCalendar.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateEnd", scope = RelayPnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createRelayPnpSwScheduleDateEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateEnd_QNAME, XMLGregorianCalendar.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sunday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleSunday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSunday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Monday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleMonday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleMonday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tuesday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleTuesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleTuesday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Wednesday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleWednesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleWednesday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Thursday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleThursday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleThursday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Friday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleFriday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleFriday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Saturday", scope = RelayPnpSwSchedule.class)
    public JAXBElement<Boolean> createRelayPnpSwScheduleSaturday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSaturday_QNAME, Boolean.class, RelayPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = RelaySystemDefaultProfileResult.class)
    public JAXBElement<RelayHardwareTypes> createRelaySystemDefaultProfileResultHardwareCategory(RelayHardwareTypes value) {
        return new JAXBElement<RelayHardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, RelayHardwareTypes.class, RelaySystemDefaultProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms1_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms2_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms3_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms4_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FrameShiftNs", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsFrameShiftNs(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsFrameShiftNs_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsGranularityPeriod", scope = RelayProfileParams.class)
    public JAXBElement<String> createRelayProfileParamsStatsGranularityPeriod(String value) {
        return new JAXBElement<String>(_RelayProfileParamsStatsGranularityPeriod_QNAME, String.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NodeSshAccess", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsNodeSshAccess(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNodeSshAccess_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxNumberOfCandidatesPerBand", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsMaxNumberOfCandidatesPerBand(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsMaxNumberOfCandidatesPerBand_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SinrRanking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSinrRanking", scope = RelayProfileParams.class)
    public JAXBElement<SinrRanking> createRelayProfileParamsDenbSinrRanking(SinrRanking value) {
        return new JAXBElement<SinrRanking>(_RelayProfileParamsDenbSinrRanking_QNAME, SinrRanking.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSinrThreshold", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsDenbSinrThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsDenbSinrThreshold_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSeThreshold", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsDenbSeThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsDenbSeThreshold_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationPersistancy", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsLocationPersistancy(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsLocationPersistancy_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedLocationRadius", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsAllowedLocationRadius(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsAllowedLocationRadius_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationAccuracyThreshold", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationAccuracyThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationAccuracyThreshold_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DenbSortingAlgorithmValuesWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSortingAlgorithm", scope = RelayProfileParams.class)
    public JAXBElement<DenbSortingAlgorithmValuesWS> createRelayProfileParamsDenbSortingAlgorithm(DenbSortingAlgorithmValuesWS value) {
        return new JAXBElement<DenbSortingAlgorithmValuesWS>(_RelayProfileParamsDenbSortingAlgorithm_QNAME, DenbSortingAlgorithmValuesWS.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrmGroupingOffset", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDrmGroupingOffset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDrmGroupingOffset_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSinrHystersis", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsDenbSinrHystersis(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsDenbSinrHystersis_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSeHystersis", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDenbSeHystersis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDenbSeHystersis_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbRsrpDomThreshold", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDenbRsrpDomThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDenbRsrpDomThreshold_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbRsrpDomHystersis", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDenbRsrpDomHystersis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDenbRsrpDomHystersis_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrmThreshold", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDrmThreshold(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDrmThreshold_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrmHysteresis", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsDrmHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsDrmHysteresis_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoBackoffScanPeriod", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsAutoBackoffScanPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsAutoBackoffScanPeriod_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoBackoffMaxScanEvents", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsAutoBackoffMaxScanEvents(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsAutoBackoffMaxScanEvents_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbReportingEnabled", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsEnbReportingEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsEnbReportingEnabled_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbReportingInterval", scope = RelayProfileParams.class)
    public JAXBElement<String> createRelayProfileParamsEnbReportingInterval(String value) {
        return new JAXBElement<String>(_RelayProfileParamsEnbReportingInterval_QNAME, String.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApnShareModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ShareRelayIpv6PdnConnectionMode", scope = RelayProfileParams.class)
    public JAXBElement<ApnShareModesWs> createRelayProfileParamsShareRelayIpv6PdnConnectionMode(ApnShareModesWs value) {
        return new JAXBElement<ApnShareModesWs>(_RelayProfileParamsShareRelayIpv6PdnConnectionMode_QNAME, ApnShareModesWs.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rbv", scope = RelayProfileParams.class)
    public JAXBElement<BigDecimal> createRelayProfileParamsRbv(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileParamsRbv_QNAME, BigDecimal.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FineAlignMode", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsFineAlignMode(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsFineAlignMode_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FineAlignAvgPeriod", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsFineAlignAvgPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsFineAlignAvgPeriod_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrmAveragePeriodForScanning", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsDrmAveragePeriodForScanning(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsDrmAveragePeriodForScanning_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrmAveragePeriodForMonitoring", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsDrmAveragePeriodForMonitoring(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsDrmAveragePeriodForMonitoring_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IgnoreDenbBarring", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsIgnoreDenbBarring(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsIgnoreDenbBarring_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxDlTransmissionModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDlTransmissionMode", scope = RelayProfileParams.class)
    public JAXBElement<MaxDlTransmissionModesWs> createRelayProfileParamsMaxDlTransmissionMode(MaxDlTransmissionModesWs value) {
        return new JAXBElement<MaxDlTransmissionModesWs>(_RelayProfileParamsMaxDlTransmissionMode_QNAME, MaxDlTransmissionModesWs.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DonorEndcDetectionMode", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabled> createRelayProfileParamsDonorEndcDetectionMode(EnabledDisabled value) {
        return new JAXBElement<EnabledDisabled>(_RelayProfileParamsDonorEndcDetectionMode_QNAME, EnabledDisabled.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimarySyncSourceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimarySyncSource", scope = RelayProfileParams.class)
    public JAXBElement<PrimarySyncSourceTypes> createRelayProfileParamsPrimarySyncSource(PrimarySyncSourceTypes value) {
        return new JAXBElement<PrimarySyncSourceTypes>(_RelayProfileParamsPrimarySyncSource_QNAME, PrimarySyncSourceTypes.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailoverActionTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailoverAction", scope = RelayProfileParams.class)
    public JAXBElement<FailoverActionTypes> createRelayProfileParamsFailoverAction(FailoverActionTypes value) {
        return new JAXBElement<FailoverActionTypes>(_RelayProfileParamsFailoverAction_QNAME, FailoverActionTypes.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfnInitialisationTime", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsSfnInitialisationTime(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsSfnInitialisationTime_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulSecurityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbBackhaulSecurity", scope = RelayProfileParams.class)
    public JAXBElement<BackhaulSecurityTypes> createRelayProfileParamsEnbBackhaulSecurity(BackhaulSecurityTypes value) {
        return new JAXBElement<BackhaulSecurityTypes>(_RelayProfileParamsEnbBackhaulSecurity_QNAME, BackhaulSecurityTypes.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaintenanceWindowMode", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsMaintenanceWindowMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsMaintenanceWindowMode_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZonesRelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeZone", scope = RelayProfileParams.class)
    public JAXBElement<TimeZonesRelay> createRelayProfileParamsTimeZone(TimeZonesRelay value) {
        return new JAXBElement<TimeZonesRelay>(_RelayProfileParamsTimeZone_QNAME, TimeZonesRelay.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxRandomDelay", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsMaxRandomDelay(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsMaxRandomDelay_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicReScanMode", scope = RelayProfileParams.class)
    public JAXBElement<PeriodicReScan> createRelayProfileParamsPeriodicReScanMode(PeriodicReScan value) {
        return new JAXBElement<PeriodicReScan>(_RelayProfileParamsPeriodicReScanMode_QNAME, PeriodicReScan.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicReScanPeriod", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsPeriodicReScanPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsPeriodicReScanPeriod_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutonomousRescanModeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutonomousReScanMode", scope = RelayProfileParams.class)
    public JAXBElement<AutonomousRescanModeValues> createRelayProfileParamsAutonomousReScanMode(AutonomousRescanModeValues value) {
        return new JAXBElement<AutonomousRescanModeValues>(_RelayProfileParamsAutonomousReScanMode_QNAME, AutonomousRescanModeValues.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPkdDataPriorityNtp", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsUlPkdDataPriorityNtp(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsUlPkdDataPriorityNtp_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPkdDataPriorityNetwork", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsUlPkdDataPriorityNetwork(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsUlPkdDataPriorityNetwork_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPkdDataPriorityManagement", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsUlPkdDataPriorityManagement(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsUlPkdDataPriorityManagement_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPkdDataPriorityBulkTransfer", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsUlPkdDataPriorityBulkTransfer(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsUlPkdDataPriorityBulkTransfer_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MtuSize", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsMtuSize(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsMtuSize_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaxWifiThroughputTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiMaxThroughputLimited", scope = RelayProfileParams.class)
    public JAXBElement<MaxWifiThroughputTypes> createRelayProfileParamsWifiMaxThroughputLimited(MaxWifiThroughputTypes value) {
        return new JAXBElement<MaxWifiThroughputTypes>(_RelayProfileParamsWifiMaxThroughputLimited_QNAME, MaxWifiThroughputTypes.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WifiMaxThroughput", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsWifiMaxThroughput(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsWifiMaxThroughput_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HourlyDailyEnabled", scope = RelayProfileParams.class)
    public JAXBElement<Boolean> createRelayProfileParamsHourlyDailyEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsHourlyDailyEnabled_QNAME, Boolean.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimePersistency", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsTimePersistency(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsTimePersistency_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedTimePersistencyDelta", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsAllowedTimePersistencyDelta(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsAllowedTimePersistencyDelta_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockAlertThreshold", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationLockAlertThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationLockAlertThreshold_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockAlarmThreshold", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationLockAlarmThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationLockAlarmThreshold_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockStopServiceAdmin", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsLocationLockStopServiceAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsLocationLockStopServiceAdmin_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockMaxRtdError", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationLockMaxRtdError(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationLockMaxRtdError_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockAdmin", scope = RelayProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileParamsLocationLockAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsLocationLockAdmin_QNAME, EnabledDisabledStates.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockMaxCellsFingerprint", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationLockMaxCellsFingerprint(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationLockMaxCellsFingerprint_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationLockMaxCellCandidateListSize", scope = RelayProfileParams.class)
    public JAXBElement<Integer> createRelayProfileParamsLocationLockMaxCellCandidateListSize(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileParamsLocationLockMaxCellCandidateListSize_QNAME, Integer.class, RelayProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesRelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = RelayProfile.class)
    public JAXBElement<CategoriesRelay> createRelayProfileHardwareCategory(CategoriesRelay value) {
        return new JAXBElement<CategoriesRelay>(_IBridge11AcQosProfileHardwareCategory_QNAME, CategoriesRelay.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit0", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit0(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit0_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit1", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit1(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit1_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit2", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit2(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit2_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit3", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit3(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit3_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit4", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit4(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit4_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit5", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit5(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit5_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit6", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit6(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit6_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit7", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit7(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit7_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit8", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit8(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit8_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit9", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit9(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit9_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit10", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit10(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit10_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit11", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit11(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit11_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit12", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit12(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit12_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit13", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit13(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit13_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit14", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit14(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit14_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit15", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit15(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit15_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit16", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit16(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit16_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit17", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit17(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit17_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit18", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit18(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit18_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit19", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit19(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit19_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit20", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit20(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit20_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit21", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit21(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit21_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit22", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit22(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit22_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit23", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit23(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit23_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit24", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit24(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit24_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit25", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit25(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit25_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit26", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit26(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit26_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bit27", scope = EciBlackListEntryWs.class)
    public JAXBElement<String> createEciBlackListEntryWsBit27(String value) {
        return new JAXBElement<String>(_EciBlackListEntryWsBit27_QNAME, String.class, EciBlackListEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaysOfWeekRelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayOfWeek", scope = MonthlyOptionDayWeekOfEveryYMonths.class)
    public JAXBElement<DaysOfWeekRelay> createMonthlyOptionDayWeekOfEveryYMonthsDayOfWeek(DaysOfWeekRelay value) {
        return new JAXBElement<DaysOfWeekRelay>(_MonthlyOptionDayWeekOfEveryYMonthsDayOfWeek_QNAME, DaysOfWeekRelay.class, MonthlyOptionDayWeekOfEveryYMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Start", scope = MonthlyOptionDayWeekOfEveryYMonths.class)
    public JAXBElement<Integer> createMonthlyOptionDayWeekOfEveryYMonthsStart(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOptionDayWeekOfEveryYMonthsStart_QNAME, Integer.class, MonthlyOptionDayWeekOfEveryYMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryYMonth", scope = MonthlyOptionDayWeekOfEveryYMonths.class)
    public JAXBElement<Integer> createMonthlyOptionDayWeekOfEveryYMonthsEveryYMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOptionDayWeekOfEveryYMonthsEveryYMonth_QNAME, Integer.class, MonthlyOptionDayWeekOfEveryYMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateOfMonth", scope = MonthlyOptionDateOfEveryXMonths.class)
    public JAXBElement<Integer> createMonthlyOptionDateOfEveryXMonthsDateOfMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOptionDateOfEveryXMonthsDateOfMonth_QNAME, Integer.class, MonthlyOptionDateOfEveryXMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryXMonth", scope = MonthlyOptionDateOfEveryXMonths.class)
    public JAXBElement<Integer> createMonthlyOptionDateOfEveryXMonthsEveryXMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOptionDateOfEveryXMonthsEveryXMonth_QNAME, Integer.class, MonthlyOptionDateOfEveryXMonths.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryWeekDay", scope = DailyOptionEveryWeekDay.class)
    public JAXBElement<Boolean> createDailyOptionEveryWeekDayEveryWeekDay(Boolean value) {
        return new JAXBElement<Boolean>(_DailyOptionEveryWeekDayEveryWeekDay_QNAME, Boolean.class, DailyOptionEveryWeekDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryXDay", scope = DailyOptionEveryXDay.class)
    public JAXBElement<Integer> createDailyOptionEveryXDayEveryXDay(Integer value) {
        return new JAXBElement<Integer>(_DailyOptionEveryXDayEveryXDay_QNAME, Integer.class, DailyOptionEveryXDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeviceTypeIdsWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TypeId", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<AccessDeviceTypeIdsWs> createConnectedDeviceTypeToApnEntryWsTypeId(AccessDeviceTypeIdsWs value) {
        return new JAXBElement<AccessDeviceTypeIdsWs>(_ConnectedDeviceTypeToApnEntryWsTypeId_QNAME, AccessDeviceTypeIdsWs.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEnabled", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<Boolean> createConnectedDeviceTypeToApnEntryWsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectedDeviceTypeToApnEntryWsIsEnabled_QNAME, Boolean.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VlanIdentifier", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<Integer> createConnectedDeviceTypeToApnEntryWsVlanIdentifier(Integer value) {
        return new JAXBElement<Integer>(_ConnectedDeviceTypeToApnEntryWsVlanIdentifier_QNAME, Integer.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Blocked", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<Boolean> createConnectedDeviceTypeToApnEntryWsBlocked(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectedDeviceTypeToApnEntryWsBlocked_QNAME, Boolean.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthType", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<ApnAuthenticationTypes> createConnectedDeviceTypeToApnEntryWsAuthType(ApnAuthenticationTypes value) {
        return new JAXBElement<ApnAuthenticationTypes>(_ConnectedDeviceTypeToApnEntryWsAuthType_QNAME, ApnAuthenticationTypes.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdnConnectionType", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<String> createConnectedDeviceTypeToApnEntryWsPdnConnectionType(String value) {
        return new JAXBElement<String>(_ConnectedDeviceTypeToApnEntryWsPdnConnectionType_QNAME, String.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressAllocationMethodTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AddressAllocationMethod", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<AddressAllocationMethodTypes> createConnectedDeviceTypeToApnEntryWsAddressAllocationMethod(AddressAllocationMethodTypes value) {
        return new JAXBElement<AddressAllocationMethodTypes>(_ConnectedDeviceTypeToApnEntryWsAddressAllocationMethod_QNAME, AddressAllocationMethodTypes.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpMethodTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpMethod", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<PnpMethodTypes> createConnectedDeviceTypeToApnEntryWsPnpMethod(PnpMethodTypes value) {
        return new JAXBElement<PnpMethodTypes>(_ConnectedDeviceTypeToApnEntryWsPnpMethod_QNAME, PnpMethodTypes.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAssignmentTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IPAssignment", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<IPAssignmentTypesWs> createConnectedDeviceTypeToApnEntryWsIPAssignment(IPAssignmentTypesWs value) {
        return new JAXBElement<IPAssignmentTypesWs>(_ConnectedDeviceTypeToApnEntryWsIPAssignment_QNAME, IPAssignmentTypesWs.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CidrPrefix", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<Integer> createConnectedDeviceTypeToApnEntryWsCidrPrefix(Integer value) {
        return new JAXBElement<Integer>(_ConnectedDeviceTypeToApnEntryWsCidrPrefix_QNAME, Integer.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = QdclEntryWs.class)
    public JAXBElement<Integer> createQdclEntryWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsEarfcn_QNAME, Integer.class, QdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = QdclEntryWs.class)
    public JAXBElement<Integer> createQdclEntryWsPci(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsPci_QNAME, Integer.class, QdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = QdclEntryWs.class)
    public JAXBElement<Integer> createQdclEntryWsEci(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsEci_QNAME, Integer.class, QdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = PdclEntryWs.class)
    public JAXBElement<Integer> createPdclEntryWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsEarfcn_QNAME, Integer.class, PdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = PdclEntryWs.class)
    public JAXBElement<Integer> createPdclEntryWsEci(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsEci_QNAME, Integer.class, PdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = PdclEntryWs.class)
    public JAXBElement<Integer> createPdclEntryWsPci(Integer value) {
        return new JAXBElement<Integer>(_QdclEntryWsPci_QNAME, Integer.class, PdclEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsMonthly }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedOption", scope = PeriodicRescanMonthlyWs.class)
    public JAXBElement<PeriodicRescanOptionsMonthly> createPeriodicRescanMonthlyWsSelectedOption(PeriodicRescanOptionsMonthly value) {
        return new JAXBElement<PeriodicRescanOptionsMonthly>(_PeriodicRescanMonthlyWsSelectedOption_QNAME, PeriodicRescanOptionsMonthly.class, PeriodicRescanMonthlyWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsDaily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedOption", scope = PeriodicRescanDailyWs.class)
    public JAXBElement<PeriodicRescanOptionsDaily> createPeriodicRescanDailyWsSelectedOption(PeriodicRescanOptionsDaily value) {
        return new JAXBElement<PeriodicRescanOptionsDaily>(_PeriodicRescanMonthlyWsSelectedOption_QNAME, PeriodicRescanOptionsDaily.class, PeriodicRescanDailyWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementModeOnly", scope = RelayDetailsParams.class)
    public JAXBElement<Boolean> createRelayDetailsParamsManagementModeOnly(Boolean value) {
        return new JAXBElement<Boolean>(_RelayDetailsParamsManagementModeOnly_QNAME, Boolean.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPdclLocked", scope = RelayDetailsParams.class)
    public JAXBElement<Boolean> createRelayDetailsParamsIsPdclLocked(Boolean value) {
        return new JAXBElement<Boolean>(_RelayDetailsParamsIsPdclLocked_QNAME, Boolean.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedMode", scope = RelayDetailsParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayDetailsParamsLedMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayDetailsParamsLedMode_QNAME, EnabledDisabledStates.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdclGroupModeValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdclGroupMode", scope = RelayDetailsParams.class)
    public JAXBElement<PdclGroupModeValuesWs> createRelayDetailsParamsPdclGroupMode(PdclGroupModeValuesWs value) {
        return new JAXBElement<PdclGroupModeValuesWs>(_RelayDetailsParamsPdclGroupMode_QNAME, PdclGroupModeValuesWs.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaModeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaMode", scope = RelayDetailsParams.class)
    public JAXBElement<CaModeValues> createRelayDetailsParamsCaMode(CaModeValues value) {
        return new JAXBElement<CaModeValues>(_RelayDetailsParamsCaMode_QNAME, CaModeValues.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSeGwInterfaceEnabled", scope = RelayDetailsParams.class)
    public JAXBElement<EnabledDisabledStates> createRelayDetailsParamsIsSeGwInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayDetailsParamsIsSeGwInterfaceEnabled_QNAME, EnabledDisabledStates.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RelaySbaMode", scope = RelayDetailsParams.class)
    public JAXBElement<String> createRelayDetailsParamsRelaySbaMode(String value) {
        return new JAXBElement<String>(_RelayDetailsParamsRelaySbaMode_QNAME, String.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBackhaulWifiMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifi", scope = RelayDetailsParams.class)
    public JAXBElement<RelayBackhaulWifiMode> createRelayDetailsParamsBackhaulWifi(RelayBackhaulWifiMode value) {
        return new JAXBElement<RelayBackhaulWifiMode>(_RelayDetailsParamsBackhaulWifi_QNAME, RelayBackhaulWifiMode.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBackhaulEthernetMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulEthernet", scope = RelayDetailsParams.class)
    public JAXBElement<RelayBackhaulEthernetMode> createRelayDetailsParamsBackhaulEthernet(RelayBackhaulEthernetMode value) {
        return new JAXBElement<RelayBackhaulEthernetMode>(_RelayDetailsParamsBackhaulEthernet_QNAME, RelayBackhaulEthernetMode.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBackhaulUsbMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulUsb", scope = RelayDetailsParams.class)
    public JAXBElement<RelayBackhaulUsbMode> createRelayDetailsParamsBackhaulUsb(RelayBackhaulUsbMode value) {
        return new JAXBElement<RelayBackhaulUsbMode>(_RelayDetailsParamsBackhaulUsb_QNAME, RelayBackhaulUsbMode.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QdclGroupModeValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QdclGroupMode", scope = RelayDetailsParams.class)
    public JAXBElement<QdclGroupModeValuesWs> createRelayDetailsParamsQdclGroupMode(QdclGroupModeValuesWs value) {
        return new JAXBElement<QdclGroupModeValuesWs>(_RelayDetailsParamsQdclGroupMode_QNAME, QdclGroupModeValuesWs.class, RelayDetailsParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosEnabled", scope = IBridge2QosParams.class)
    public JAXBElement<Boolean> createIBridge2QosParamsQosEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2QosParamsQosEnabled_QNAME, Boolean.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandwidthLimitEnabled", scope = IBridge2QosParams.class)
    public JAXBElement<Boolean> createIBridge2QosParamsBandwidthLimitEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2QosParamsBandwidthLimitEnabled_QNAME, Boolean.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandwidthLimit", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsBandwidthLimit(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsBandwidthLimit_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoQueueLength", scope = IBridge2QosParams.class)
    public JAXBElement<Boolean> createIBridge2QosParamsAutoQueueLength(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2QosParamsAutoQueueLength_QNAME, Boolean.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosPrecedenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosPrecedence", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosPrecedenceOptions> createIBridge2QosParamsQosPrecedence(IBridge2QosPrecedenceOptions value) {
        return new JAXBElement<IBridge2QosPrecedenceOptions>(_IBridge2QosParamsQosPrecedence_QNAME, IBridge2QosPrecedenceOptions.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Mode", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueueMode> createIBridge2QosParamsQueue1Mode(IBridge2QosQueueMode value) {
        return new JAXBElement<IBridge2QosQueueMode>(_IBridge2QosParamsQueue1Mode_QNAME, IBridge2QosQueueMode.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Weight", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue1Weight(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue1Weight_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Cir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue1Cir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue1Cir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Mir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue1Mir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue1Mir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Mbs", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue1Mbs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue1Mbs_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue1Size", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue1Size(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue1Size_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Mode", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueueMode> createIBridge2QosParamsQueue2Mode(IBridge2QosQueueMode value) {
        return new JAXBElement<IBridge2QosQueueMode>(_IBridge2QosParamsQueue2Mode_QNAME, IBridge2QosQueueMode.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Weight", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue2Weight(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue2Weight_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Cir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue2Cir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue2Cir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Mir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue2Mir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue2Mir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Mbs", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue2Mbs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue2Mbs_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue2Size", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue2Size(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue2Size_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Mode", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueueMode> createIBridge2QosParamsQueue3Mode(IBridge2QosQueueMode value) {
        return new JAXBElement<IBridge2QosQueueMode>(_IBridge2QosParamsQueue3Mode_QNAME, IBridge2QosQueueMode.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Weight", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue3Weight(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue3Weight_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Cir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue3Cir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue3Cir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Mir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue3Mir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue3Mir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Mbs", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue3Mbs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue3Mbs_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue3Size", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue3Size(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue3Size_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueueMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Mode", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueueMode> createIBridge2QosParamsQueue4Mode(IBridge2QosQueueMode value) {
        return new JAXBElement<IBridge2QosQueueMode>(_IBridge2QosParamsQueue4Mode_QNAME, IBridge2QosQueueMode.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Weight", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue4Weight(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue4Weight_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Cir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue4Cir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue4Cir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Mir", scope = IBridge2QosParams.class)
    public JAXBElement<BigDecimal> createIBridge2QosParamsQueue4Mir(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2QosParamsQueue4Mir_QNAME, BigDecimal.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Mbs", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue4Mbs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue4Mbs_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Queue4Size", scope = IBridge2QosParams.class)
    public JAXBElement<Integer> createIBridge2QosParamsQueue4Size(Integer value) {
        return new JAXBElement<Integer>(_IBridge2QosParamsQueue4Size_QNAME, Integer.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos0Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos0Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos0Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos1Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos1Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos1Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos2Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos2Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos2Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos3Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos3Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos3Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos4Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos4Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos4Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos5Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos5Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos5Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos6Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos6Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos6Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cos7Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsCos7Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsCos7Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp0Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp0Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp0Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp1Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp1Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp1Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp2Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp2Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp2Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp3Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp3Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp3Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp4Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp4Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp4Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp5Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp5Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp5Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp6Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp6Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp6Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp7Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp7Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp7Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp8Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp8Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp8Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp9Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp9Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp9Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp10Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp10Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp10Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp11Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp11Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp11Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp12Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp12Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp12Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp13Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp13Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp13Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp14Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp14Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp14Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp15Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp15Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp15Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp16Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp16Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp16Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp17Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp17Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp17Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp18Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp18Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp18Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp19Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp19Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp19Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp20Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp20Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp20Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp21Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp21Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp21Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp22Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp22Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp22Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp23Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp23Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp23Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp24Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp24Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp24Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp25Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp25Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp25Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp26Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp26Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp26Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp27Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp27Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp27Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp28Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp28Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp28Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp29Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp29Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp29Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp30Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp30Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp30Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp31Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp31Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp31Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp32Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp32Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp32Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp33Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp33Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp33Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp34Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp34Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp34Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp35Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp35Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp35Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp36Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp36Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp36Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp37Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp37Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp37Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp38Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp38Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp38Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp39Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp39Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp39Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp40Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp40Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp40Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp41Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp41Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp41Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp42Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp42Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp42Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp43Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp43Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp43Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp44Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp44Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp44Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp45Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp45Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp45Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp46Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp46Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp46Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp47Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp47Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp47Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp48Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp48Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp48Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp49Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp49Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp49Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp50Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp50Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp50Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp51Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp51Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp51Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp52Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp52Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp52Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp53Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp53Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp53Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp54Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp54Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp54Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp55Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp55Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp55Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp56Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp56Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp56Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp57Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp57Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp57Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp58Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp58Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp58Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp59Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp59Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp59Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp60Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp60Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp60Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp61Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp61Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp61Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp62Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp62Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp62Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2QosQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp63Queue", scope = IBridge2QosParams.class)
    public JAXBElement<IBridge2QosQueue> createIBridge2QosParamsDscp63Queue(IBridge2QosQueue value) {
        return new JAXBElement<IBridge2QosQueue>(_IBridge2QosParamsDscp63Queue_QNAME, IBridge2QosQueue.class, IBridge2QosParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2HardwareCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridge2QosProfile.class)
    public JAXBElement<IBridge2HardwareCategory> createIBridge2QosProfileHardwareCategory(IBridge2HardwareCategory value) {
        return new JAXBElement<IBridge2HardwareCategory>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridge2HardwareCategory.class, IBridge2QosProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CriticalFault", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsCriticalFault(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsCriticalFault_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BootReboot", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsBootReboot(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsBootReboot_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessUpDown", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsWirelessUpDown(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsWirelessUpDown_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetUpDown", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsEthernetUpDown(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsEthernetUpDown_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetSpeedChange", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsEthernetSpeedChange(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsEthernetSpeedChange_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TemperatureLowHigh", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsTemperatureLowHigh(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsTemperatureLowHigh_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultipleLoginAttempts", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsMultipleLoginAttempts(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsMultipleLoginAttempts_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReceiveSignalStrength", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsReceiveSignalStrength(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsReceiveSignalStrength_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSnr", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsRxSnr(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsRxSnr_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cinr", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsCinr(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsCinr_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPer", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsTxPer(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsTxPer_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessLinkAvailability", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsWirelessLinkAvailability(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsWirelessLinkAvailability_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UnauthorizedAccess", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsUnauthorizedAccess(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsUnauthorizedAccess_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPowerConfig", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsTxPowerConfig(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsTxPowerConfig_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GnssSatelliteStrength", scope = IBridge2AlarmParams.class)
    public JAXBElement<Boolean> createIBridge2AlarmParamsGnssSatelliteStrength(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2AlarmParamsGnssSatelliteStrength_QNAME, Boolean.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TemperatureLowHighLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsTemperatureLowHighLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsTemperatureLowHighLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TemperatureLowHighUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsTemperatureLowHighUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsTemperatureLowHighUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReceiveSignalStrengthLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsReceiveSignalStrengthLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsReceiveSignalStrengthLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReceiveSignalStrengthUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsReceiveSignalStrengthUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsReceiveSignalStrengthUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSnrLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsRxSnrLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsRxSnrLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSnrUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsRxSnrUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsRxSnrUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CinrLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsCinrLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsCinrLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CinrUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsCinrUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsCinrUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPerLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsTxPerLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsTxPerLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPerUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsTxPerUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsTxPerUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessLinkAvailabilityLowerThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsWirelessLinkAvailabilityLowerThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsWirelessLinkAvailabilityLowerThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessLinkAvailabilityUpperThreshold", scope = IBridge2AlarmParams.class)
    public JAXBElement<Integer> createIBridge2AlarmParamsWirelessLinkAvailabilityUpperThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridge2AlarmParamsWirelessLinkAvailabilityUpperThreshold_QNAME, Integer.class, IBridge2AlarmParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2HardwareCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridge2AlarmProfile.class)
    public JAXBElement<IBridge2HardwareCategory> createIBridge2AlarmProfileHardwareCategory(IBridge2HardwareCategory value) {
        return new JAXBElement<IBridge2HardwareCategory>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridge2HardwareCategory.class, IBridge2AlarmProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlan", scope = IBridge2TermManagementParams.class)
    public JAXBElement<Boolean> createIBridge2TermManagementParamsManagementVlan(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2TermManagementParamsManagementVlan_QNAME, Boolean.class, IBridge2TermManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IBridge2TermManagementParams.class)
    public JAXBElement<Integer> createIBridge2TermManagementParamsManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsManagementVlanId_QNAME, Integer.class, IBridge2TermManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LedBrightness }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedBrightness", scope = IBridge2TermManagementParams.class)
    public JAXBElement<LedBrightness> createIBridge2TermManagementParamsLedBrightness(LedBrightness value) {
        return new JAXBElement<LedBrightness>(_IBridge2TermManagementParamsLedBrightness_QNAME, LedBrightness.class, IBridge2TermManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TwoPointFourGhzChannel", scope = IBridge2TermManagementParams.class)
    public JAXBElement<Integer> createIBridge2TermManagementParamsTwoPointFourGhzChannel(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsTwoPointFourGhzChannel_QNAME, Integer.class, IBridge2TermManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxClients", scope = IBridge2TermManagementParams.class)
    public JAXBElement<Integer> createIBridge2TermManagementParamsMaxClients(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsMaxClients_QNAME, Integer.class, IBridge2TermManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2HardwareCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridge2TermManagementProfile.class)
    public JAXBElement<IBridge2HardwareCategory> createIBridge2TermManagementProfileHardwareCategory(IBridge2HardwareCategory value) {
        return new JAXBElement<IBridge2HardwareCategory>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridge2HardwareCategory.class, IBridge2TermManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2TdmaTrafficSplit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TdmaTrafficSplit", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<IBridge2TdmaTrafficSplit> createIBridge2BaseManagementParamsTdmaTrafficSplit(IBridge2TdmaTrafficSplit value) {
        return new JAXBElement<IBridge2TdmaTrafficSplit>(_IBridge2BaseManagementParamsTdmaTrafficSplit_QNAME, IBridge2TdmaTrafficSplit.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TdmaWindow", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<String> createIBridge2BaseManagementParamsTdmaWindow(String value) {
        return new JAXBElement<String>(_IBridge2BaseManagementParamsTdmaWindow_QNAME, String.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2WirelessGender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessGender", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<IBridge2WirelessGender> createIBridge2BaseManagementParamsWirelessGender(IBridge2WirelessGender value) {
        return new JAXBElement<IBridge2WirelessGender>(_IBridge2BaseManagementParamsWirelessGender_QNAME, IBridge2WirelessGender.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TwoPointFourGhzChannel", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<Integer> createIBridge2BaseManagementParamsTwoPointFourGhzChannel(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsTwoPointFourGhzChannel_QNAME, Integer.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxClients", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<Integer> createIBridge2BaseManagementParamsMaxClients(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsMaxClients_QNAME, Integer.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlan", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<Boolean> createIBridge2BaseManagementParamsManagementVlan(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2TermManagementParamsManagementVlan_QNAME, Boolean.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<Integer> createIBridge2BaseManagementParamsManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsManagementVlanId_QNAME, Integer.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LedBrightness }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedBrightness", scope = IBridge2BaseManagementParams.class)
    public JAXBElement<LedBrightness> createIBridge2BaseManagementParamsLedBrightness(LedBrightness value) {
        return new JAXBElement<LedBrightness>(_IBridge2TermManagementParamsLedBrightness_QNAME, LedBrightness.class, IBridge2BaseManagementParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2HardwareCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridge2BaseManagementProfile.class)
    public JAXBElement<IBridge2HardwareCategory> createIBridge2BaseManagementProfileHardwareCategory(IBridge2HardwareCategory value) {
        return new JAXBElement<IBridge2HardwareCategory>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridge2HardwareCategory.class, IBridge2BaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeTermHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeTermSystemDefaultProfileResult.class)
    public JAXBElement<IBridgeTermHardwareTypes> createIBridgeTermSystemDefaultProfileResultHardwareCategory(IBridgeTermHardwareTypes value) {
        return new JAXBElement<IBridgeTermHardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridgeTermHardwareTypes.class, IBridgeTermSystemDefaultProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeBaseHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseSystemDefaultProfileResult.class)
    public JAXBElement<IBridgeBaseHardwareTypes> createIBridgeBaseSystemDefaultProfileResultHardwareCategory(IBridgeBaseHardwareTypes value) {
        return new JAXBElement<IBridgeBaseHardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridgeBaseHardwareTypes.class, IBridgeBaseSystemDefaultProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = IbTermChannelProfileEntry.class)
    public JAXBElement<Integer> createIbTermChannelProfileEntryPriority(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryPriority_QNAME, Integer.class, IbTermChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IbTermChannelProfileEntry.class)
    public JAXBElement<Integer> createIbTermChannelProfileEntryFrequency(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryFrequency_QNAME, Integer.class, IbTermChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IbTermChannelProfileEntry.class)
    public JAXBElement<Integer> createIbTermChannelProfileEntryPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryPreambleIndex_QNAME, Integer.class, IbTermChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaDirection", scope = IbTermChannelProfileEntry.class)
    public JAXBElement<String> createIbTermChannelProfileEntryAntennaDirection(String value) {
        return new JAXBElement<String>(_IbTermChannelProfileEntryAntennaDirection_QNAME, String.class, IbTermChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeTermHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IbTermRadioProfile.class)
    public JAXBElement<IBridgeTermHardwareTypes> createIbTermRadioProfileHardwareCategory(IBridgeTermHardwareTypes value) {
        return new JAXBElement<IBridgeTermHardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridgeTermHardwareTypes.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileTiltProtectionEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IbTermRadioProfileTiltProtectionEnabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionDelay", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltProtectionDelay(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltProtectionDelay_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionThreshold", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltProtectionThreshold(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltProtectionThreshold_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileTiltAlarmEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IbTermRadioProfileTiltAlarmEnabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmRaiseThreshold", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltAlarmRaiseThreshold(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltAlarmRaiseThreshold_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtClockSourceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ClockSynchronisation", scope = IbTermRadioProfile.class)
    public JAXBElement<FtClockSourceTypes> createIbTermRadioProfileClockSynchronisation(FtClockSourceTypes value) {
        return new JAXBElement<FtClockSourceTypes>(_IbTermRadioProfileClockSynchronisation_QNAME, FtClockSourceTypes.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpMasterEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfilePtpMasterEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IbTermRadioProfilePtpMasterEnabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDomain", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfilePtpDomain(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfilePtpDomain_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpAnnounceRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpAnnounceRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpAnnounceRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSyncRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpSyncRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpSyncRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDelayReqRespRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpDelayReqRespRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpDelayReqRespRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpLeaseDuration", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfilePtpLeaseDuration(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfilePtpLeaseDuration_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDscpTag", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfilePtpDscpTag(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfilePtpDscpTag_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms1_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms2_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms3_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms4_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseIbBaseSettings", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseIbBaseSettings(Boolean value) {
        return new JAXBElement<Boolean>(_IbTermRadioProfileUseIbBaseSettings_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfdmaFecCodeTypesIbridge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkModulation", scope = IbTermRadioProfile.class)
    public JAXBElement<OfdmaFecCodeTypesIbridge> createIbTermRadioProfileDownlinkModulation(OfdmaFecCodeTypesIbridge value) {
        return new JAXBElement<OfdmaFecCodeTypesIbridge>(_IbTermRadioProfileDownlinkModulation_QNAME, OfdmaFecCodeTypesIbridge.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfdmaFecCodeTypesIbridge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkModulation", scope = IbTermRadioProfile.class)
    public JAXBElement<OfdmaFecCodeTypesIbridge> createIbTermRadioProfileUplinkModulation(OfdmaFecCodeTypesIbridge value) {
        return new JAXBElement<OfdmaFecCodeTypesIbridge>(_IbTermRadioProfileUplinkModulation_QNAME, OfdmaFecCodeTypesIbridge.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMimoMatrix", scope = IbTermRadioProfile.class)
    public JAXBElement<MatrixConfig> createIbTermRadioProfileDownlinkMimoMatrix(MatrixConfig value) {
        return new JAXBElement<MatrixConfig>(_IbTermRadioProfileDownlinkMimoMatrix_QNAME, MatrixConfig.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatrixConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkMimoMatrix", scope = IbTermRadioProfile.class)
    public JAXBElement<MatrixConfig> createIbTermRadioProfileUplinkMimoMatrix(MatrixConfig value) {
        return new JAXBElement<MatrixConfig>(_IbTermRadioProfileUplinkMimoMatrix_QNAME, MatrixConfig.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChannelBandwidth", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfileChannelBandwidth(String value) {
        return new JAXBElement<String>(_IbTermRadioProfileChannelBandwidth_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateStart", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridgeTermPnpSwScheduleDateStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateStart_QNAME, XMLGregorianCalendar.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateEnd", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridgeTermPnpSwScheduleDateEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateEnd_QNAME, XMLGregorianCalendar.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sunday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleSunday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSunday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Monday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleMonday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleMonday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tuesday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleTuesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleTuesday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Wednesday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleWednesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleWednesday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Thursday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleThursday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleThursday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Friday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleFriday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleFriday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Saturday", scope = IBridgeTermPnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeTermPnpSwScheduleSaturday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSaturday_QNAME, Boolean.class, IBridgeTermPnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateStart", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridgeBasePnpSwScheduleDateStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateStart_QNAME, XMLGregorianCalendar.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateEnd", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<XMLGregorianCalendar> createIBridgeBasePnpSwScheduleDateEnd(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IBridge2PnpSwScheduleDateEnd_QNAME, XMLGregorianCalendar.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sunday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleSunday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSunday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Monday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleMonday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleMonday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tuesday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleTuesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleTuesday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Wednesday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleWednesday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleWednesday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Thursday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleThursday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleThursday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Friday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleFriday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleFriday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Saturday", scope = IBridgeBasePnpSwSchedule.class)
    public JAXBElement<Boolean> createIBridgeBasePnpSwScheduleSaturday(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpSwScheduleSaturday_QNAME, Boolean.class, IBridgeBasePnpSwSchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeBaseHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeBaseHardwareTypes> createIBridgeBaseRadioProfileHardwareCategory(IBridgeBaseHardwareTypes value) {
        return new JAXBElement<IBridgeBaseHardwareTypes>(_IBridge11AcQosProfileHardwareCategory_QNAME, IBridgeBaseHardwareTypes.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileFrequency(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryFrequency_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileAntennaMode(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileAntennaMode_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaGain", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileAntennaGain(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileAntennaGain_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileTxPower(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileTxPower_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BsEirpTotalCombined", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileBsEirpTotalCombined(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileBsEirpTotalCombined_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxTargetRssi", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileRxTargetRssi(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileRxTargetRssi_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileRfGain_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialRangingRxLevel", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileInitialRangingRxLevel(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileInitialRangingRxLevel_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FloodUnknownTraffic", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseRadioProfileFloodUnknownTraffic(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseRadioProfileFloodUnknownTraffic_QNAME, EnabledDisabledStates.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ft2FtLocalSwitching", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseRadioProfileFt2FtLocalSwitching(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseRadioProfileFt2FtLocalSwitching_QNAME, EnabledDisabledStates.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RxNullingModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FbNullingMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RxNullingModesWs> createIBridgeBaseRadioProfileFbNullingMode(RxNullingModesWs value) {
        return new JAXBElement<RxNullingModesWs>(_IBridgeBaseRadioProfileFbNullingMode_QNAME, RxNullingModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RxNullingModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FtNullingMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RxNullingModesWs> createIBridgeBaseRadioProfileFtNullingMode(RxNullingModesWs value) {
        return new JAXBElement<RxNullingModesWs>(_IBridgeBaseRadioProfileFtNullingMode_QNAME, RxNullingModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoAlignOptionsWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoAlignMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<AutoAlignOptionsWs> createIBridgeBaseRadioProfileAutoAlignMode(AutoAlignOptionsWs value) {
        return new JAXBElement<AutoAlignOptionsWs>(_IBridgeBaseRadioProfileAutoAlignMode_QNAME, AutoAlignOptionsWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileBandwidth(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileBandwidth_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BackhaulModesWs> createIBridgeBaseRadioProfileBackhaulMode(BackhaulModesWs value) {
        return new JAXBElement<BackhaulModesWs>(_IBridgeBaseRadioProfileBackhaulMode_QNAME, BackhaulModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Range", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RangeModesWs> createIBridgeBaseRadioProfileRange(RangeModesWs value) {
        return new JAXBElement<RangeModesWs>(_IBridgeBaseRadioProfileRange_QNAME, RangeModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UlPermutationTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkPermutation", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<UlPermutationTypesWs> createIBridgeBaseRadioProfileUplinkPermutation(UlPermutationTypesWs value) {
        return new JAXBElement<UlPermutationTypesWs>(_IBridgeBaseRadioProfileUplinkPermutation_QNAME, UlPermutationTypesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TddSplit", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileTddSplit(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileTddSplit_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSisoZoneSize", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileMaxSisoZoneSize(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileMaxSisoZoneSize_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeDlMimoModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMimoMatrix", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeDlMimoModesWs> createIBridgeBaseRadioProfileDownlinkMimoMatrix(IBridgeDlMimoModesWs value) {
        return new JAXBElement<IBridgeDlMimoModesWs>(_IbTermRadioProfileDownlinkMimoMatrix_QNAME, IBridgeDlMimoModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeUlMimoModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkMimo", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeUlMimoModesWs> createIBridgeBaseRadioProfileUplinkMimo(IBridgeUlMimoModesWs value) {
        return new JAXBElement<IBridgeUlMimoModesWs>(_IBridgeBaseRadioProfileUplinkMimo_QNAME, IBridgeUlMimoModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeFrameModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FrameMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeFrameModesWs> createIBridgeBaseRadioProfileFrameMode(IBridgeFrameModesWs value) {
        return new JAXBElement<IBridgeFrameModesWs>(_IBridgeBaseRadioProfileFrameMode_QNAME, IBridgeFrameModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ib4X0PuscGroupsWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Subchannels", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Ib4X0PuscGroupsWs> createIBridgeBaseRadioProfileSubchannels(Ib4X0PuscGroupsWs value) {
        return new JAXBElement<Ib4X0PuscGroupsWs>(_IBridgeBaseRadioProfileSubchannels_QNAME, Ib4X0PuscGroupsWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CarrierSense", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseRadioProfileCarrierSense(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseRadioProfileCarrierSense_QNAME, EnabledDisabledStates.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackoffFrames", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileBackoffFrames(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileBackoffFrames_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CarrierSenseThreshold", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileCarrierSenseThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileCarrierSenseThreshold_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeSecurityModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecurityMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeSecurityModesWs> createIBridgeBaseRadioProfileSecurityMode(IBridgeSecurityModesWs value) {
        return new JAXBElement<IBridgeSecurityModesWs>(_IBridgeBaseRadioProfileSecurityMode_QNAME, IBridgeSecurityModesWs.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeUlAdaptationEfficiencyModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkAdaptationEfficiencyMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeUlAdaptationEfficiencyModes> createIBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode(IBridgeUlAdaptationEfficiencyModes value) {
        return new JAXBElement<IBridgeUlAdaptationEfficiencyModes>(_IBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode_QNAME, IBridgeUlAdaptationEfficiencyModes.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkTraffic", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileDownlinkTraffic(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileDownlinkTraffic_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkBroadcastMcs", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileDownlinkBroadcastMcs(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileDownlinkBroadcastMcs_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkCinrMargin", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkCinrMargin(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkCinrMargin_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMatrixBThresholdPcinr", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkMatrixBThresholdPcinr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkMatrixBThresholdPcinr_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMatrixBAdditionalCinrMargin", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkTraffic", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileUplinkTraffic(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileUplinkTraffic_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkCinrMargin", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplinkCinrMargin(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplinkCinrMargin_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkMatrixBThresholdCinr", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplinkMatrixBThresholdCinr(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplinkMatrixBThresholdCinr_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkQpsk12Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlinkQpsk12Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlinkQpsk12Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkQpsk12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkQpsk12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkQpsk12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkQpsk34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlinkQpsk34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlinkQpsk34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkQpsk34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkQpsk34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkQpsk34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam12Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink16Qam12Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink16Qam12Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink16Qam12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink16Qam12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink16Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink16Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink16Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink16Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam23Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink64Qam23Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink64Qam23Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam23", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink64Qam23(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink64Qam23_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink64Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink64Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink64Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink64Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink64Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink64Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink64Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink64Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink256Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink256Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink256Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink256Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink256Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink256Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink256Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink256Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink256Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink256Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink256Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink256Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkQpsk12Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplinkQpsk12Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplinkQpsk12Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkQpsk12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplinkQpsk12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplinkQpsk12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkQpsk34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplinkQpsk34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplinkQpsk34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkQpsk34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplinkQpsk34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplinkQpsk34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink16Qam12Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink16Qam12Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink16Qam12Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink16Qam12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink16Qam12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink16Qam12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink16Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink16Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink16Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink16Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink16Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink16Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam23Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink64Qam23Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink64Qam23Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam23", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink64Qam23(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink64Qam23_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink64Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink64Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink64Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink64Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink64Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink64Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink64Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink64Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink256Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink256Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink256Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink256Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink256Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink256Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink256Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink256Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<CategoriesIbBase> createIBridgeBaseManagementProfileHardwareCategory(CategoriesIbBase value) {
        return new JAXBElement<CategoriesIbBase>(_IBridge11AcQosProfileHardwareCategory_QNAME, CategoriesIbBase.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSyncSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ClockSource", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<ClockSyncSource> createIBridgeBaseManagementProfileClockSource(ClockSyncSource value) {
        return new JAXBElement<ClockSyncSource>(_IBridgeBaseManagementProfileClockSource_QNAME, ClockSyncSource.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpMasterEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfilePtpMasterEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IbTermRadioProfilePtpMasterEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsSoftHoldoverEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfileGpsSoftHoldoverEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfileGpsSoftHoldoverEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms1_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms2_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms3_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileParamsNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileParamsUseNms4_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDomain", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfilePtpDomain(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfilePtpDomain_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpAnnounceRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpAnnounceRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpAnnounceRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSyncRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpSyncRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpSyncRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDelayReqRespRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpDelayReqRespRate(String value) {
        return new JAXBElement<String>(_IbTermRadioProfilePtpDelayReqRespRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpLeaseDuration", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfilePtpLeaseDuration(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfilePtpLeaseDuration_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfileTiltProtectionEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IbTermRadioProfileTiltProtectionEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionDelay", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltProtectionDelay(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltProtectionDelay_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionThreshold", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltProtectionThreshold(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltProtectionThreshold_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfileTiltAlarmEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IbTermRadioProfileTiltAlarmEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmRaiseThreshold", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltAlarmRaiseThreshold(Integer value) {
        return new JAXBElement<Integer>(_IbTermRadioProfileTiltAlarmRaiseThreshold_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsCollectionPeriod", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileStatsCollectionPeriod(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileStatsCollectionPeriod_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AirInterfaceStats", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileAirInterfaceStats(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileAirInterfaceStats_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AirInterfaceUsageStats", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileAirInterfaceUsageStats(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileAirInterfaceUsageStats_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TermRfStats", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileTermRfStats(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileTermRfStats_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TermDataStats", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileTermDataStats(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileTermDataStats_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = SnmpDetailSetWs.class)
    public JAXBElement<Double> createSnmpDetailSetWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME, Double.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = SnmpDetailSetWs.class)
    public JAXBElement<SnmpAgentVersion> createSnmpDetailSetWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_SnmpDetailSetWsSnmpVersion_QNAME, SnmpAgentVersion.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = SnmpDetailSetWs.class)
    public JAXBElement<Snmpv3AccessTypes> createSnmpDetailSetWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_SnmpDetailSetWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = SnmpDetailWs.class)
    public JAXBElement<Integer> createSnmpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, SnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = Ib440DetailsGet.class)
    public JAXBElement<NodeManagementModes> createIb440DetailsGetManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = Ib440DetailsGet.class)
    public JAXBElement<BigDecimal> createIb440DetailsGetLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLatitude_QNAME, BigDecimal.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = Ib440DetailsGet.class)
    public JAXBElement<BigDecimal> createIb440DetailsGetLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLongitude_QNAME, BigDecimal.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = Ib440DetailsGet.class)
    public JAXBElement<Integer> createIb440DetailsGetAltitude(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetAltitude_QNAME, Integer.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = Ib440DetailsGet.class)
    public JAXBElement<EnabledDisabledStates> createIb440DetailsGetNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigMode", scope = Ib440DetailsGet.class)
    public JAXBElement<ConfigNames> createIb440DetailsGetConfigMode(ConfigNames value) {
        return new JAXBElement<ConfigNames>(_Ib440DetailsGetConfigMode_QNAME, ConfigNames.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WirelessProtocolTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MediumAccessMethod", scope = Ib440DetailsGet.class)
    public JAXBElement<WirelessProtocolTypes> createIb440DetailsGetMediumAccessMethod(WirelessProtocolTypes value) {
        return new JAXBElement<WirelessProtocolTypes>(_Ib440DetailsGetMediumAccessMethod_QNAME, WirelessProtocolTypes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WirelessProtocol", scope = Ib440DetailsGet.class)
    public JAXBElement<String> createIb440DetailsGetWirelessProtocol(String value) {
        return new JAXBElement<String>(_Ib440DetailsGetWirelessProtocol_QNAME, String.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HtSupportedMcsTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HtSupportedMcs", scope = Ib440DetailsGet.class)
    public JAXBElement<HtSupportedMcsTypes> createIb440DetailsGetHtSupportedMcs(HtSupportedMcsTypes value) {
        return new JAXBElement<HtSupportedMcsTypes>(_Ib440DetailsGetHtSupportedMcs_QNAME, HtSupportedMcsTypes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VhtSupportedMcsTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VhtSupportedMcs", scope = Ib440DetailsGet.class)
    public JAXBElement<VhtSupportedMcsTypes> createIb440DetailsGetVhtSupportedMcs(VhtSupportedMcsTypes value) {
        return new JAXBElement<VhtSupportedMcsTypes>(_Ib440DetailsGetVhtSupportedMcs_QNAME, VhtSupportedMcsTypes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellRadiusRanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellRadiusRange", scope = Ib440DetailsGet.class)
    public JAXBElement<CellRadiusRanges> createIb440DetailsGetCellRadiusRange(CellRadiusRanges value) {
        return new JAXBElement<CellRadiusRanges>(_Ib440DetailsGetCellRadiusRange_QNAME, CellRadiusRanges.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardIntervalTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GuardInterval", scope = Ib440DetailsGet.class)
    public JAXBElement<GuardIntervalTypes> createIb440DetailsGetGuardInterval(GuardIntervalTypes value) {
        return new JAXBElement<GuardIntervalTypes>(_Ib440DetailsGetGuardInterval_QNAME, GuardIntervalTypes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440DetailsGet.class)
    public JAXBElement<Integer> createIb440DetailsGetFrequency(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryFrequency_QNAME, Integer.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = Ib440DetailsGet.class)
    public JAXBElement<String> createIb440DetailsGetBandwidth(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileBandwidth_QNAME, String.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440DetailsGet.class)
    public JAXBElement<Integer> createIb440DetailsGetTxPower(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileTxPower_QNAME, Integer.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetPortSpeed", scope = Ib440DetailsGet.class)
    public JAXBElement<String> createIb440DetailsGetEthernetPortSpeed(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsEthernetPortSpeed_QNAME, String.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = IBridge2DetailsPnp.class)
    public JAXBElement<BigDecimal> createIBridge2DetailsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLatitude_QNAME, BigDecimal.class, IBridge2DetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = IBridge2DetailsPnp.class)
    public JAXBElement<BigDecimal> createIBridge2DetailsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLongitude_QNAME, BigDecimal.class, IBridge2DetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = IBridge2DetailsPnp.class)
    public JAXBElement<Integer> createIBridge2DetailsPnpAltitude(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetAltitude_QNAME, Integer.class, IBridge2DetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = IBridge2DetailsPnp.class)
    public JAXBElement<EnabledDisabledStates> createIBridge2DetailsPnpNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, IBridge2DetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadyForService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReadyForService", scope = IBridge2DetailsPnp.class)
    public JAXBElement<ReadyForService> createIBridge2DetailsPnpReadyForService(ReadyForService value) {
        return new JAXBElement<ReadyForService>(_IBridge2DetailsPnpReadyForService_QNAME, ReadyForService.class, IBridge2DetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridge2PnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<IBridge2PnpHardwareTypes> createIBridge2PnpDetailWsHardware(IBridge2PnpHardwareTypes value) {
        return new JAXBElement<IBridge2PnpHardwareTypes>(_IBridge2PnpDetailWsHardware_QNAME, IBridge2PnpHardwareTypes.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridge2PnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridge2PnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Integer> createIBridge2PnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_IBridge2PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSwScheduled", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Boolean> createIBridge2PnpDetailWsIsSwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsSwScheduled_QNAME, Boolean.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDownloadOnlySwScheduled", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Boolean> createIBridge2PnpDetailWsIsDownloadOnlySwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsDownloadOnlySwScheduled_QNAME, Boolean.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Integer> createIBridge2PnpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Double> createIBridge2PnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME, Double.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createIBridge2PnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_SnmpDetailSetWsSnmpVersion_QNAME, SnmpAgentVersion.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = IBridge2PnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createIBridge2PnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_SnmpDetailSetWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, IBridge2PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = IBridge2Details.class)
    public JAXBElement<NodeManagementModes> createIBridge2DetailsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, IBridge2Details.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnbErrorCodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ErrorCode", scope = RelayEnbErrorDetailWs.class)
    public JAXBElement<EnbErrorCodes> createRelayEnbErrorDetailWsErrorCode(EnbErrorCodes value) {
        return new JAXBElement<EnbErrorCodes>(_RelayEnbErrorDetailWsErrorCode_QNAME, EnbErrorCodes.class, RelayEnbErrorDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NmsSnmpPort", scope = RelayRedirectDetailWs.class)
    public JAXBElement<Integer> createRelayRedirectDetailWsNmsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_RelayRedirectDetailWsNmsSnmpPort_QNAME, Integer.class, RelayRedirectDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = RelayDetailsPnp.class)
    public JAXBElement<EnabledDisabledStates> createRelayDetailsPnpNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, RelayDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayPnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = RelayPnpDetailWs.class)
    public JAXBElement<RelayPnpHardwareTypes> createRelayPnpDetailWsHardware(RelayPnpHardwareTypes value) {
        return new JAXBElement<RelayPnpHardwareTypes>(_IBridge2PnpDetailWsHardware_QNAME, RelayPnpHardwareTypes.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = RelayPnpDetailWs.class)
    public JAXBElement<BigDecimal> createRelayPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = RelayPnpDetailWs.class)
    public JAXBElement<BigDecimal> createRelayPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = RelayPnpDetailWs.class)
    public JAXBElement<Integer> createRelayPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_IBridge2PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSwScheduled", scope = RelayPnpDetailWs.class)
    public JAXBElement<Boolean> createRelayPnpDetailWsIsSwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsSwScheduled_QNAME, Boolean.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDownloadOnlySwScheduled", scope = RelayPnpDetailWs.class)
    public JAXBElement<Boolean> createRelayPnpDetailWsIsDownloadOnlySwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsDownloadOnlySwScheduled_QNAME, Boolean.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = RelayPnpDetailWs.class)
    public JAXBElement<Integer> createRelayPnpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = RelayPnpDetailWs.class)
    public JAXBElement<Double> createRelayPnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME, Double.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = RelayPnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createRelayPnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_SnmpDetailSetWsSnmpVersion_QNAME, SnmpAgentVersion.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = RelayPnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createRelayPnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_SnmpDetailSetWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = RelayDetails.class)
    public JAXBElement<NodeManagementModes> createRelayDetailsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, RelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = RelayGlobalConfigDetail.class)
    public JAXBElement<BandValuesWs> createRelayGlobalConfigDetailBand(BandValuesWs value) {
        return new JAXBElement<BandValuesWs>(_RelayGlobalConfigDetailBand_QNAME, BandValuesWs.class, RelayGlobalConfigDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EarfcnHigh", scope = RelayGlobalConfigDetail.class)
    public JAXBElement<Integer> createRelayGlobalConfigDetailEarfcnHigh(Integer value) {
        return new JAXBElement<Integer>(_RelayGlobalConfigDetailEarfcnHigh_QNAME, Integer.class, RelayGlobalConfigDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EarfcnLow", scope = RelayGlobalConfigDetail.class)
    public JAXBElement<Integer> createRelayGlobalConfigDetailEarfcnLow(Integer value) {
        return new JAXBElement<Integer>(_RelayGlobalConfigDetailEarfcnLow_QNAME, Integer.class, RelayGlobalConfigDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsVoLteEnabled", scope = RelayGlobalConfigDetail.class)
    public JAXBElement<Boolean> createRelayGlobalConfigDetailIsVoLteEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_RelayGlobalConfigDetailIsVoLteEnabled_QNAME, Boolean.class, RelayGlobalConfigDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsBandEnabled", scope = RelayGlobalConfigDetail.class)
    public JAXBElement<Boolean> createRelayGlobalConfigDetailIsBandEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_RelayGlobalConfigDetailIsBandEnabled_QNAME, Boolean.class, RelayGlobalConfigDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeTermDetailsPnpNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ServiceAllowed", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Boolean> createIBridgeTermDetailsPnpServiceAllowed(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeTermDetailsPnpServiceAllowed_QNAME, Boolean.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HomeBsOptionsWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnableHomeBs", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<HomeBsOptionsWs> createIBridgeTermDetailsPnpEnableHomeBs(HomeBsOptionsWs value) {
        return new JAXBElement<HomeBsOptionsWs>(_IBridgeTermDetailsPnpEnableHomeBs_QNAME, HomeBsOptionsWs.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignonLockModesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignOnLockMode", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<SignonLockModesWs> createIBridgeTermDetailsPnpSignOnLockMode(SignonLockModesWs value) {
        return new JAXBElement<SignonLockModesWs>(_IBridgeTermDetailsPnpSignOnLockMode_QNAME, SignonLockModesWs.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxLockPeriodForSignOn", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpMaxLockPeriodForSignOn(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermDetailsPnpMaxLockPeriodForSignOn_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsManagementVlanId_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseManagementIfForPtp", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeTermDetailsPnpUseManagementIfForPtp(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeTermDetailsPnpUseManagementIfForPtp_QNAME, EnabledDisabledStates.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSubnetCidr", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpPtpSubnetCidr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermDetailsPnpPtpSubnetCidr_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpVlanId", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpPtpVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermDetailsPnpPtpVlanId_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedEnabled", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Boolean> createIBridgeTermDetailsPnpLedEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeTermDetailsPnpLedEnabled_QNAME, Boolean.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbTermPnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<IbTermPnpHardwareTypes> createIBridgeTermPnpDetailWsHardware(IbTermPnpHardwareTypes value) {
        return new JAXBElement<IbTermPnpHardwareTypes>(_IBridge2PnpDetailWsHardware_QNAME, IbTermPnpHardwareTypes.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbBaseStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpServiceState", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<IbBaseStates> createIBridgeTermPnpDetailWsPnpServiceState(IbBaseStates value) {
        return new JAXBElement<IbBaseStates>(_IBridgeTermPnpDetailWsPnpServiceState_QNAME, IbBaseStates.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeTermPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeTermPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeTermPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_IBridge2PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSwScheduled", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Boolean> createIBridgeTermPnpDetailWsIsSwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsSwScheduled_QNAME, Boolean.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDownloadOnlySwScheduled", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Boolean> createIBridgeTermPnpDetailWsIsDownloadOnlySwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsDownloadOnlySwScheduled_QNAME, Boolean.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeTermPnpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Double> createIBridgeTermPnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME, Double.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createIBridgeTermPnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_SnmpDetailSetWsSnmpVersion_QNAME, SnmpAgentVersion.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createIBridgeTermPnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_SnmpDetailSetWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = IbBaseDetailsPnp.class)
    public JAXBElement<EnabledDisabledStates> createIbBaseDetailsPnpNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadyForService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReadyForService", scope = IbBaseDetailsPnp.class)
    public JAXBElement<ReadyForService> createIbBaseDetailsPnpReadyForService(ReadyForService value) {
        return new JAXBElement<ReadyForService>(_IBridge2DetailsPnpReadyForService_QNAME, ReadyForService.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpCellId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpCellId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryPreambleIndex_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkPermutationBase", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpUplinkPermutationBase(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpUplinkPermutationBase_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkPermutationBase", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpDownlinkPermutationBase(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpDownlinkPermutationBase_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridge2TermManagementParamsManagementVlanId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseManagementIfForPtp", scope = IbBaseDetailsPnp.class)
    public JAXBElement<EnabledDisabledValues> createIbBaseDetailsPnpUseManagementIfForPtp(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeTermDetailsPnpUseManagementIfForPtp_QNAME, EnabledDisabledValues.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSubnetCidr", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPtpSubnetCidr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermDetailsPnpPtpSubnetCidr_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpVlanId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPtpVlanId(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermDetailsPnpPtpVlanId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedEnabled", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Boolean> createIbBaseDetailsPnpLedEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeTermDetailsPnpLedEnabled_QNAME, Boolean.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbBasePnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<IbBasePnpHardwareTypes> createIBridgeBasePnpDetailWsHardware(IbBasePnpHardwareTypes value) {
        return new JAXBElement<IbBasePnpHardwareTypes>(_IBridge2PnpDetailWsHardware_QNAME, IbBasePnpHardwareTypes.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbBaseStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpServiceState", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<IbBaseStates> createIBridgeBasePnpDetailWsPnpServiceState(IbBaseStates value) {
        return new JAXBElement<IbBaseStates>(_IBridgeTermPnpDetailWsPnpServiceState_QNAME, IbBaseStates.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeBasePnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeBasePnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeBasePnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_IBridge2PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSwScheduled", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Boolean> createIBridgeBasePnpDetailWsIsSwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsSwScheduled_QNAME, Boolean.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDownloadOnlySwScheduled", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Boolean> createIBridgeBasePnpDetailWsIsDownloadOnlySwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2PnpDetailWsIsDownloadOnlySwScheduled_QNAME, Boolean.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeBasePnpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Double> createIBridgeBasePnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_SnmpDetailSetWsSnmpTimeoutInMilliSec_QNAME, Double.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createIBridgeBasePnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_SnmpDetailSetWsSnmpVersion_QNAME, SnmpAgentVersion.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createIBridgeBasePnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_SnmpDetailSetWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = IBridgeTermDetails.class)
    public JAXBElement<NodeManagementModes> createIBridgeTermDetailsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, IBridgeTermDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = IbBaseDetails.class)
    public JAXBElement<NodeManagementModes> createIbBaseDetailsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, IbBaseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = Ib440DetailsSetWs.class)
    public JAXBElement<NodeManagementModes> createIb440DetailsSetWsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = Ib440DetailsSetWs.class)
    public JAXBElement<BigDecimal> createIb440DetailsSetWsLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLatitude_QNAME, BigDecimal.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = Ib440DetailsSetWs.class)
    public JAXBElement<BigDecimal> createIb440DetailsSetWsLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetLongitude_QNAME, BigDecimal.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = Ib440DetailsSetWs.class)
    public JAXBElement<Integer> createIb440DetailsSetWsAltitude(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetAltitude_QNAME, Integer.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbifEventAlarmForwarding", scope = Ib440DetailsSetWs.class)
    public JAXBElement<EnabledDisabledStates> createIb440DetailsSetWsNbifEventAlarmForwarding(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_Ib440DetailsGetNbifEventAlarmForwarding_QNAME, EnabledDisabledStates.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigNamesSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigMode", scope = Ib440DetailsSetWs.class)
    public JAXBElement<ConfigNamesSet> createIb440DetailsSetWsConfigMode(ConfigNamesSet value) {
        return new JAXBElement<ConfigNamesSet>(_Ib440DetailsGetConfigMode_QNAME, ConfigNamesSet.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440DetailsSetWs.class)
    public JAXBElement<Integer> createIb440DetailsSetWsFrequency(Integer value) {
        return new JAXBElement<Integer>(_IbTermChannelProfileEntryFrequency_QNAME, Integer.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = Ib440DetailsSetWs.class)
    public JAXBElement<String> createIb440DetailsSetWsBandwidth(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileBandwidth_QNAME, String.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440DetailsSetWs.class)
    public JAXBElement<Integer> createIb440DetailsSetWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileTxPower_QNAME, Integer.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetPortSpeed", scope = Ib440DetailsSetWs.class)
    public JAXBElement<String> createIb440DetailsSetWsEthernetPortSpeed(String value) {
        return new JAXBElement<String>(_IBridge2DetailsParamsEthernetPortSpeed_QNAME, String.class, Ib440DetailsSetWs.class, value);
    }

}
