
package Netspan.NBI_15_5.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_5.Backhaul package. 
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
    private final static QName _Ib440DetailsGetCellRadiusRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellRadiusRange");
    private final static QName _Ib440DetailsGetHtSupportedMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "HtSupportedMcs");
    private final static QName _Ib440DetailsGetGuardInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "GuardInterval");
    private final static QName _Ib440DetailsGetWirelessProtocol_QNAME = new QName("http://Airspan.Netspan.WebServices", "WirelessProtocol");
    private final static QName _Ib440DetailsGetBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _Ib440DetailsGetVhtSupportedMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "VhtSupportedMcs");
    private final static QName _Ib440DetailsGetFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _Ib440DetailsGetConfigMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigMode");
    private final static QName _Ib440DetailsGetManagedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagedMode");
    private final static QName _Ib440DetailsGetIsQosEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsQosEnabled");
    private final static QName _Ib440DetailsGetTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _Ib440DetailsGetMediumAccessMethod_QNAME = new QName("http://Airspan.Netspan.WebServices", "MediumAccessMethod");
    private final static QName _RelayRedirectDetailWsNmsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "NmsSnmpPort");
    private final static QName _RelayRedirectDetailWsRelaySnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "RelaySnmpPort");
    private final static QName _RelayRedirectDetailWsRelaySnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "RelaySnmpVersion");
    private final static QName _SnmpDetailWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _IbBaseDetailsPnpReadyForService_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReadyForService");
    private final static QName _IbBaseDetailsPnpPreambleIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleIndex");
    private final static QName _IbBaseDetailsPnpManagementVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementVlanId");
    private final static QName _IbBaseDetailsPnpUplinkPermutationBase_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkPermutationBase");
    private final static QName _IbBaseDetailsPnpCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _IbBaseDetailsPnpDownlinkPermutationBase_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkPermutationBase");
    private final static QName _IbBaseDetailsPnpLedEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedEnabled");
    private final static QName _IbBaseDetailsPnpUseManagementIfForPtp_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseManagementIfForPtp");
    private final static QName _IbBaseDetailsPnpPtpSubnetCidr_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpSubnetCidr");
    private final static QName _IbBaseDetailsPnpPtpVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpVlanId");
    private final static QName _RelayDetailsParamsManagementModeOnly_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementModeOnly");
    private final static QName _RelayDetailsParamsIsPdclLocked_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPdclLocked");
    private final static QName _RelayDetailsParamsLedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedMode");
    private final static QName _IBridgeBaseManagementProfileNtpServerIpAddress1Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress1Enabled");
    private final static QName _IBridgeBaseManagementProfileTermDataStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermDataStats");
    private final static QName _IBridgeBaseManagementProfileTiltProtectionThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionThreshold");
    private final static QName _IBridgeBaseManagementProfileTiltAlarmEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltAlarmEnabled");
    private final static QName _IBridgeBaseManagementProfileGpsSoftHoldoverEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsSoftHoldoverEnabled");
    private final static QName _IBridgeBaseManagementProfileAirInterfaceUsageStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "AirInterfaceUsageStats");
    private final static QName _IBridgeBaseManagementProfileNtpServerIpAddress4Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress4Enabled");
    private final static QName _IBridgeBaseManagementProfilePtpLeaseDuration_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpLeaseDuration");
    private final static QName _IBridgeBaseManagementProfileNtpServerIpAddress3Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress3Enabled");
    private final static QName _IBridgeBaseManagementProfileNtpServerIpAddress2Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "NtpServerIpAddress2Enabled");
    private final static QName _IBridgeBaseManagementProfileTermRfStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermRfStats");
    private final static QName _IBridgeBaseManagementProfilePtpDelayReqRespRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpDelayReqRespRate");
    private final static QName _IBridgeBaseManagementProfileTiltAlarmRaiseThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltAlarmRaiseThreshold");
    private final static QName _IBridgeBaseManagementProfilePtpAnnounceRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpAnnounceRate");
    private final static QName _IBridgeBaseManagementProfileClockSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "ClockSource");
    private final static QName _IBridgeBaseManagementProfilePtpSyncRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpSyncRate");
    private final static QName _IBridgeBaseManagementProfileTiltProtectionDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionDelay");
    private final static QName _IBridgeBaseManagementProfileAirInterfaceStats_QNAME = new QName("http://Airspan.Netspan.WebServices", "AirInterfaceStats");
    private final static QName _IBridgeBaseManagementProfileStatsCollectionPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsCollectionPeriod");
    private final static QName _IBridgeBaseManagementProfileTiltProtectionEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "TiltProtectionEnabled");
    private final static QName _IBridgeBaseManagementProfilePtpMasterEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpMasterEnabled");
    private final static QName _IBridgeBaseManagementProfileUseNms3_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms3");
    private final static QName _IBridgeBaseManagementProfileUseNms4_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms4");
    private final static QName _IBridgeBaseManagementProfileUseNms1_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms1");
    private final static QName _IBridgeBaseManagementProfileUseNms2_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseNms2");
    private final static QName _IBridgeBaseManagementProfilePtpDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpDomain");
    private final static QName _IBridgeBaseManagementProfileHardwareCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareCategory");
    private final static QName _RelayPnpDetailWsPnpLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLongitude");
    private final static QName _RelayPnpDetailWsPnpLatLongRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatLongRadius");
    private final static QName _RelayPnpDetailWsPnpLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatitude");
    private final static QName _RelayPnpDetailWsSnmpTimeoutInMilliSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpTimeoutInMilliSec");
    private final static QName _RelayPnpDetailWsSnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpVersion");
    private final static QName _RelayPnpDetailWsSnmpv3Access_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snmpv3Access");
    private final static QName _IBridgeBasePnpDetailWsHardware_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hardware");
    private final static QName _ChannelProfileEntryPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _ChannelProfileEntryId_QNAME = new QName("http://Airspan.Netspan.WebServices", "Id");
    private final static QName _ChannelProfileEntryAntennaDirection_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaDirection");
    private final static QName _IBridgeTermDetailsPnpMaxLockPeriodForSignOn_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxLockPeriodForSignOn");
    private final static QName _IBridgeTermDetailsPnpServiceAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "ServiceAllowed");
    private final static QName _IBridgeTermDetailsPnpEnableHomeBs_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableHomeBs");
    private final static QName _IbTermRadioProfileChannelBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelBandwidth");
    private final static QName _IbTermRadioProfileDownlinkMimoMatrix_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMimoMatrix");
    private final static QName _IbTermRadioProfileUseIbBaseSettings_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseIbBaseSettings");
    private final static QName _IbTermRadioProfileUplinkModulation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkModulation");
    private final static QName _IbTermRadioProfileClockSynchronisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "ClockSynchronisation");
    private final static QName _IbTermRadioProfileDownlinkModulation_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkModulation");
    private final static QName _IbTermRadioProfileUplinkMimoMatrix_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMimoMatrix");
    private final static QName _ConnectedDeviceTypeToApnEntryWsTypeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "TypeId");
    private final static QName _ConnectedDeviceTypeToApnEntryWsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnabled");
    private final static QName _ConnectedDeviceTypeToApnEntryWsAuthType_QNAME = new QName("http://Airspan.Netspan.WebServices", "AuthType");
    private final static QName _RelayProfileDenbSinrHystersis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSinrHystersis");
    private final static QName _RelayProfileAutoBackoffScanPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoBackoffScanPeriod");
    private final static QName _RelayProfileAutoBackoffMaxScanEvents_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoBackoffMaxScanEvents");
    private final static QName _RelayProfileEnbReportingInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbReportingInterval");
    private final static QName _RelayProfilePeriodicReScanPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicReScanPeriod");
    private final static QName _RelayProfileFineAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FineAlignMode");
    private final static QName _RelayProfileAutonomousReScanMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutonomousReScanMode");
    private final static QName _RelayProfileDenbSinrThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSinrThreshold");
    private final static QName _RelayProfileEnbReportingEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbReportingEnabled");
    private final static QName _RelayProfileNodeSshAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeSshAccess");
    private final static QName _RelayProfileMimoSpectralEfficiencyThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "MimoSpectralEfficiencyThreshold");
    private final static QName _RelayProfileRbv_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rbv");
    private final static QName _RelayProfileStatsGranularityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsGranularityPeriod");
    private final static QName _RelayProfileDenbSeThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSeThreshold");
    private final static QName _RelayProfileDenbSeHystersis_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbSeHystersis");
    private final static QName _RelayProfilePeriodicReScanMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicReScanMode");
    private final static QName _RelayProfileAllowedLocationRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowedLocationRadius");
    private final static QName _RelayProfileLocationAccuracyThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationAccuracyThreshold");
    private final static QName _RelayProfileFineAlignAvgPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "FineAlignAvgPeriod");
    private final static QName _RelayProfileLocationPersistancy_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationPersistancy");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam23Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam23Enabled");
    private final static QName _IBridgeBaseRadioProfileBackhaulMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulMode");
    private final static QName _IBridgeBaseRadioProfileDownlinkMatrixBThresholdPcinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMatrixBThresholdPcinr");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam12");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam12");
    private final static QName _IBridgeBaseRadioProfileCarrierSense_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierSense");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam56");
    private final static QName _IBridgeBaseRadioProfileFrameMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameMode");
    private final static QName _IBridgeBaseRadioProfileUplinkTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkTraffic");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileRxTargetRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxTargetRssi");
    private final static QName _IBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkMatrixBAdditionalCinrMargin");
    private final static QName _IBridgeBaseRadioProfileFloodUnknownTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "FloodUnknownTraffic");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam34");
    private final static QName _IBridgeBaseRadioProfileMaxSisoZoneSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSisoZoneSize");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplinkMimo_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMimo");
    private final static QName _IBridgeBaseRadioProfileDownlinkCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkCinrMargin");
    private final static QName _IBridgeBaseRadioProfileSecurityMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityMode");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam56");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam12Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileRfGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "RfGain");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk34");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk12");
    private final static QName _IBridgeBaseRadioProfileCarrierSenseThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierSenseThreshold");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam34");
    private final static QName _IBridgeBaseRadioProfileDownlinkBroadcastMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkBroadcastMcs");
    private final static QName _IBridgeBaseRadioProfileDownlinkTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkTraffic");
    private final static QName _IBridgeBaseRadioProfileAntennaMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaMode");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk34Enabled");
    private final static QName _IBridgeBaseRadioProfileBsEirpTotalCombined_QNAME = new QName("http://Airspan.Netspan.WebServices", "BsEirpTotalCombined");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam34");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam34");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam23");
    private final static QName _IBridgeBaseRadioProfileInitialRangingRxLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialRangingRxLevel");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam34");
    private final static QName _IBridgeBaseRadioProfileSubchannels_QNAME = new QName("http://Airspan.Netspan.WebServices", "Subchannels");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam23Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam23Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam23");
    private final static QName _IBridgeBaseRadioProfileFbNullingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FbNullingMode");
    private final static QName _IBridgeBaseRadioProfileUplinkCinrMargin_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkCinrMargin");
    private final static QName _IBridgeBaseRadioProfileDownlink16Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink16Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam34Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink16Qam12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink16Qam12Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "Range");
    private final static QName _IBridgeBaseRadioProfileDownlink256Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink256Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam56");
    private final static QName _IBridgeBaseRadioProfileUplinkMatrixBThresholdCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkMatrixBThresholdCinr");
    private final static QName _IBridgeBaseRadioProfileFtNullingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "FtNullingMode");
    private final static QName _IBridgeBaseRadioProfileAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaGain");
    private final static QName _IBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkAdaptationEfficiencyMode");
    private final static QName _IBridgeBaseRadioProfileDownlink64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "Downlink64Qam34");
    private final static QName _IBridgeBaseRadioProfileTddSplit_QNAME = new QName("http://Airspan.Netspan.WebServices", "TddSplit");
    private final static QName _IBridgeBaseRadioProfileFt2FtLocalSwitching_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ft2FtLocalSwitching");
    private final static QName _IBridgeBaseRadioProfileUplinkPermutation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkPermutation");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk12");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk34");
    private final static QName _IBridgeBaseRadioProfileUplink256Qam56Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink256Qam56Enabled");
    private final static QName _IBridgeBaseRadioProfileUplinkQpsk12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkQpsk12Enabled");
    private final static QName _IBridgeBaseRadioProfileUplink64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uplink64Qam56");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk34Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk34Enabled");
    private final static QName _IBridgeBaseRadioProfileAutoAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignMode");
    private final static QName _IBridgeBaseRadioProfileDownlinkQpsk12Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkQpsk12Enabled");
    private final static QName _IBridgeBaseRadioProfileBackoffFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackoffFrames");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_5.Backhaul
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigUpdate }
     * 
     */
    public IBridgeTermPnpConfigUpdate createIBridgeTermPnpConfigUpdate() {
        return new IBridgeTermPnpConfigUpdate();
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
     * Create an instance of {@link RelayForceScan }
     * 
     */
    public RelayForceScan createRelayForceScan() {
        return new RelayForceScan();
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
     * Create an instance of {@link IBridgeTermRadioProfileUpdateResponse }
     * 
     */
    public IBridgeTermRadioProfileUpdateResponse createIBridgeTermRadioProfileUpdateResponse() {
        return new IBridgeTermRadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link ProfileResponse }
     * 
     */
    public ProfileResponse createProfileResponse() {
        return new ProfileResponse();
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
     * Create an instance of {@link IBridgeBasePnpConfigUpdateResponse }
     * 
     */
    public IBridgeBasePnpConfigUpdateResponse createIBridgeBasePnpConfigUpdateResponse() {
        return new IBridgeBasePnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link RelayPnpConfigList }
     * 
     */
    public RelayPnpConfigList createRelayPnpConfigList() {
        return new RelayPnpConfigList();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigGet }
     * 
     */
    public IBridgeBaseConfigGet createIBridgeBaseConfigGet() {
        return new IBridgeBaseConfigGet();
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
     * Create an instance of {@link SnmpDetailSetWs }
     * 
     */
    public SnmpDetailSetWs createSnmpDetailSetWs() {
        return new SnmpDetailSetWs();
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
     * Create an instance of {@link IBridgeTermRadioProfileUpdate }
     * 
     */
    public IBridgeTermRadioProfileUpdate createIBridgeTermRadioProfileUpdate() {
        return new IBridgeTermRadioProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateSetResponse }
     * 
     */
    public IBridgeBaseStateSetResponse createIBridgeBaseStateSetResponse() {
        return new IBridgeBaseStateSetResponse();
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
     * Create an instance of {@link IBridgeBasePnpConfigCreateResponse }
     * 
     */
    public IBridgeBasePnpConfigCreateResponse createIBridgeBasePnpConfigCreateResponse() {
        return new IBridgeBasePnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileUpdateResponse }
     * 
     */
    public IBridgeBaseRadioProfileUpdateResponse createIBridgeBaseRadioProfileUpdateResponse() {
        return new IBridgeBaseRadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCreateResponse }
     * 
     */
    public IBridgeTermPnpConfigCreateResponse createIBridgeTermPnpConfigCreateResponse() {
        return new IBridgeTermPnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigGet }
     * 
     */
    public IBridgeTermPnpConfigGet createIBridgeTermPnpConfigGet() {
        return new IBridgeTermPnpConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileDelete }
     * 
     */
    public IBridgeBaseRadioProfileDelete createIBridgeBaseRadioProfileDelete() {
        return new IBridgeBaseRadioProfileDelete();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileGet }
     * 
     */
    public IBridgeTermRadioProfileGet createIBridgeTermRadioProfileGet() {
        return new IBridgeTermRadioProfileGet();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileList }
     * 
     */
    public RelaySystemDefaultProfileList createRelaySystemDefaultProfileList() {
        return new RelaySystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileListResponse }
     * 
     */
    public IBridgeBaseRadioProfileListResponse createIBridgeBaseRadioProfileListResponse() {
        return new IBridgeBaseRadioProfileListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileList }
     * 
     */
    public IBridgeBaseSystemDefaultProfileList createIBridgeBaseSystemDefaultProfileList() {
        return new IBridgeBaseSystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileClone }
     * 
     */
    public IBridgeBaseRadioProfileClone createIBridgeBaseRadioProfileClone() {
        return new IBridgeBaseRadioProfileClone();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfile }
     * 
     */
    public IBridgeBaseRadioProfile createIBridgeBaseRadioProfile() {
        return new IBridgeBaseRadioProfile();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigList }
     * 
     */
    public IBridgeTermPnpConfigList createIBridgeTermPnpConfigList() {
        return new IBridgeTermPnpConfigList();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileUpdate }
     * 
     */
    public IBridgeBaseRadioProfileUpdate createIBridgeBaseRadioProfileUpdate() {
        return new IBridgeBaseRadioProfileUpdate();
    }

    /**
     * Create an instance of {@link RelayProfileListResponse }
     * 
     */
    public RelayProfileListResponse createRelayProfileListResponse() {
        return new RelayProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigDeleteResponse }
     * 
     */
    public RelayPnpConfigDeleteResponse createRelayPnpConfigDeleteResponse() {
        return new RelayPnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileListResponse }
     * 
     */
    public IBridgeTermRadioProfileListResponse createIBridgeTermRadioProfileListResponse() {
        return new IBridgeTermRadioProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCreate }
     * 
     */
    public IBridgeTermPnpConfigCreate createIBridgeTermPnpConfigCreate() {
        return new IBridgeTermPnpConfigCreate();
    }

    /**
     * Create an instance of {@link RelayForceScanResponse }
     * 
     */
    public RelayForceScanResponse createRelayForceScanResponse() {
        return new RelayForceScanResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigGet }
     * 
     */
    public RelayPnpConfigGet createRelayPnpConfigGet() {
        return new RelayPnpConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigCloneResponse }
     * 
     */
    public IBridgeBasePnpConfigCloneResponse createIBridgeBasePnpConfigCloneResponse() {
        return new IBridgeBasePnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileDeleteResponse }
     * 
     */
    public IBridgeBaseRadioProfileDeleteResponse createIBridgeBaseRadioProfileDeleteResponse() {
        return new IBridgeBaseRadioProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileDelete }
     * 
     */
    public IBridgeBaseManagementProfileDelete createIBridgeBaseManagementProfileDelete() {
        return new IBridgeBaseManagementProfileDelete();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileGet }
     * 
     */
    public IBridgeBaseRadioProfileGet createIBridgeBaseRadioProfileGet() {
        return new IBridgeBaseRadioProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileGet }
     * 
     */
    public IBridgeBaseSystemDefaultProfileGet createIBridgeBaseSystemDefaultProfileGet() {
        return new IBridgeBaseSystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link RelayProfileCloneResponse }
     * 
     */
    public RelayProfileCloneResponse createRelayProfileCloneResponse() {
        return new RelayProfileCloneResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseStateGet }
     * 
     */
    public IBridgeBaseStateGet createIBridgeBaseStateGet() {
        return new IBridgeBaseStateGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileUpdateResponse }
     * 
     */
    public IBridgeBaseManagementProfileUpdateResponse createIBridgeBaseManagementProfileUpdateResponse() {
        return new IBridgeBaseManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileList }
     * 
     */
    public IBridgeTermRadioProfileList createIBridgeTermRadioProfileList() {
        return new IBridgeTermRadioProfileList();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigUpdateResponse }
     * 
     */
    public IBridgeTermPnpConfigUpdateResponse createIBridgeTermPnpConfigUpdateResponse() {
        return new IBridgeTermPnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigUpdate }
     * 
     */
    public IBridgeBasePnpConfigUpdate createIBridgeBasePnpConfigUpdate() {
        return new IBridgeBasePnpConfigUpdate();
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
     * Create an instance of {@link RelaySystemDefaultProfileListResponse }
     * 
     */
    public RelaySystemDefaultProfileListResponse createRelaySystemDefaultProfileListResponse() {
        return new RelaySystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigDelete }
     * 
     */
    public RelayPnpConfigDelete createRelayPnpConfigDelete() {
        return new RelayPnpConfigDelete();
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
     * Create an instance of {@link IBridgeBaseStateSet }
     * 
     */
    public IBridgeBaseStateSet createIBridgeBaseStateSet() {
        return new IBridgeBaseStateSet();
    }

    /**
     * Create an instance of {@link RelayPnpConfigClone }
     * 
     */
    public RelayPnpConfigClone createRelayPnpConfigClone() {
        return new RelayPnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileClone }
     * 
     */
    public IBridgeTermRadioProfileClone createIBridgeTermRadioProfileClone() {
        return new IBridgeTermRadioProfileClone();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
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
     * Create an instance of {@link IBridgeTermPnpConfigDelete }
     * 
     */
    public IBridgeTermPnpConfigDelete createIBridgeTermPnpConfigDelete() {
        return new IBridgeTermPnpConfigDelete();
    }

    /**
     * Create an instance of {@link RelayProfileCreateResponse }
     * 
     */
    public RelayProfileCreateResponse createRelayProfileCreateResponse() {
        return new RelayProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigCloneResponse }
     * 
     */
    public IBridgeTermPnpConfigCloneResponse createIBridgeTermPnpConfigCloneResponse() {
        return new IBridgeTermPnpConfigCloneResponse();
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
     * Create an instance of {@link RelayRedirectResponse }
     * 
     */
    public RelayRedirectResponse createRelayRedirectResponse() {
        return new RelayRedirectResponse();
    }

    /**
     * Create an instance of {@link RelayConfigSetResponse }
     * 
     */
    public RelayConfigSetResponse createRelayConfigSetResponse() {
        return new RelayConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileListResponse }
     * 
     */
    public IBridgeBaseManagementProfileListResponse createIBridgeBaseManagementProfileListResponse() {
        return new IBridgeBaseManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileGet }
     * 
     */
    public IBridgeTermSystemDefaultProfileGet createIBridgeTermSystemDefaultProfileGet() {
        return new IBridgeTermSystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link RelayProfileUpdateResponse }
     * 
     */
    public RelayProfileUpdateResponse createRelayProfileUpdateResponse() {
        return new RelayProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link Ib440ConfigSet }
     * 
     */
    public Ib440ConfigSet createIb440ConfigSet() {
        return new Ib440ConfigSet();
    }

    /**
     * Create an instance of {@link Ib440DetailsSetWs }
     * 
     */
    public Ib440DetailsSetWs createIb440DetailsSetWs() {
        return new Ib440DetailsSetWs();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigListResponse }
     * 
     */
    public IBridgeTermPnpConfigListResponse createIBridgeTermPnpConfigListResponse() {
        return new IBridgeTermPnpConfigListResponse();
    }

    /**
     * Create an instance of {@link NodeListResult }
     * 
     */
    public NodeListResult createNodeListResult() {
        return new NodeListResult();
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
     * Create an instance of {@link IBridgeBasePnpConfigDelete }
     * 
     */
    public IBridgeBasePnpConfigDelete createIBridgeBasePnpConfigDelete() {
        return new IBridgeBasePnpConfigDelete();
    }

    /**
     * Create an instance of {@link RelayProfileDelete }
     * 
     */
    public RelayProfileDelete createRelayProfileDelete() {
        return new RelayProfileDelete();
    }

    /**
     * Create an instance of {@link Ib440ConfigGet }
     * 
     */
    public Ib440ConfigGet createIb440ConfigGet() {
        return new Ib440ConfigGet();
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
     * Create an instance of {@link RelayPnpConfigListResponse }
     * 
     */
    public RelayPnpConfigListResponse createRelayPnpConfigListResponse() {
        return new RelayPnpConfigListResponse();
    }

    /**
     * Create an instance of {@link RelayProfileGet }
     * 
     */
    public RelayProfileGet createRelayProfileGet() {
        return new RelayProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileList }
     * 
     */
    public IBridgeBaseManagementProfileList createIBridgeBaseManagementProfileList() {
        return new IBridgeBaseManagementProfileList();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigSetResponse }
     * 
     */
    public IBridgeTermConfigSetResponse createIBridgeTermConfigSetResponse() {
        return new IBridgeTermConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigClone }
     * 
     */
    public IBridgeTermPnpConfigClone createIBridgeTermPnpConfigClone() {
        return new IBridgeTermPnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigSetResponse }
     * 
     */
    public IBridgeBaseConfigSetResponse createIBridgeBaseConfigSetResponse() {
        return new IBridgeBaseConfigSetResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigUpdateResponse }
     * 
     */
    public RelayPnpConfigUpdateResponse createRelayPnpConfigUpdateResponse() {
        return new RelayPnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigGet }
     * 
     */
    public IBridgeBasePnpConfigGet createIBridgeBasePnpConfigGet() {
        return new IBridgeBasePnpConfigGet();
    }

    /**
     * Create an instance of {@link RelayPnpConfigUpdate }
     * 
     */
    public RelayPnpConfigUpdate createRelayPnpConfigUpdate() {
        return new RelayPnpConfigUpdate();
    }

    /**
     * Create an instance of {@link RelayProfileDeleteResponse }
     * 
     */
    public RelayProfileDeleteResponse createRelayProfileDeleteResponse() {
        return new RelayProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigGet }
     * 
     */
    public IBridgeTermConfigGet createIBridgeTermConfigGet() {
        return new IBridgeTermConfigGet();
    }

    /**
     * Create an instance of {@link Ib440ConfigSetResponse }
     * 
     */
    public Ib440ConfigSetResponse createIb440ConfigSetResponse() {
        return new Ib440ConfigSetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileClone }
     * 
     */
    public IBridgeBaseManagementProfileClone createIBridgeBaseManagementProfileClone() {
        return new IBridgeBaseManagementProfileClone();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileUpdate }
     * 
     */
    public IBridgeBaseManagementProfileUpdate createIBridgeBaseManagementProfileUpdate() {
        return new IBridgeBaseManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigList }
     * 
     */
    public IBridgeBasePnpConfigList createIBridgeBasePnpConfigList() {
        return new IBridgeBasePnpConfigList();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileList }
     * 
     */
    public IBridgeTermSystemDefaultProfileList createIBridgeTermSystemDefaultProfileList() {
        return new IBridgeTermSystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileDeleteResponse }
     * 
     */
    public IBridgeBaseManagementProfileDeleteResponse createIBridgeBaseManagementProfileDeleteResponse() {
        return new IBridgeBaseManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link RelayProfileList }
     * 
     */
    public RelayProfileList createRelayProfileList() {
        return new RelayProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileCloneResponse }
     * 
     */
    public IBridgeBaseRadioProfileCloneResponse createIBridgeBaseRadioProfileCloneResponse() {
        return new IBridgeBaseRadioProfileCloneResponse();
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
     * Create an instance of {@link IBridgeBaseManagementProfileCreateResponse }
     * 
     */
    public IBridgeBaseManagementProfileCreateResponse createIBridgeBaseManagementProfileCreateResponse() {
        return new IBridgeBaseManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileList }
     * 
     */
    public IBridgeBaseRadioProfileList createIBridgeBaseRadioProfileList() {
        return new IBridgeBaseRadioProfileList();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileCloneResponse }
     * 
     */
    public IBridgeBaseManagementProfileCloneResponse createIBridgeBaseManagementProfileCloneResponse() {
        return new IBridgeBaseManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link RelayConfigGet }
     * 
     */
    public RelayConfigGet createRelayConfigGet() {
        return new RelayConfigGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileCreateResponse }
     * 
     */
    public IBridgeBaseRadioProfileCreateResponse createIBridgeBaseRadioProfileCreateResponse() {
        return new IBridgeBaseRadioProfileCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigDeleteResponse }
     * 
     */
    public IBridgeTermPnpConfigDeleteResponse createIBridgeTermPnpConfigDeleteResponse() {
        return new IBridgeTermPnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigClone }
     * 
     */
    public IBridgeBasePnpConfigClone createIBridgeBasePnpConfigClone() {
        return new IBridgeBasePnpConfigClone();
    }

    /**
     * Create an instance of {@link IBridgeTermSystemDefaultProfileListResponse }
     * 
     */
    public IBridgeTermSystemDefaultProfileListResponse createIBridgeTermSystemDefaultProfileListResponse() {
        return new IBridgeTermSystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigCreateResponse }
     * 
     */
    public RelayPnpConfigCreateResponse createRelayPnpConfigCreateResponse() {
        return new RelayPnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileDelete }
     * 
     */
    public IBridgeTermRadioProfileDelete createIBridgeTermRadioProfileDelete() {
        return new IBridgeTermRadioProfileDelete();
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
     * Create an instance of {@link RelayProfileUpdate }
     * 
     */
    public RelayProfileUpdate createRelayProfileUpdate() {
        return new RelayProfileUpdate();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigDeleteResponse }
     * 
     */
    public IBridgeBasePnpConfigDeleteResponse createIBridgeBasePnpConfigDeleteResponse() {
        return new IBridgeBasePnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileGet }
     * 
     */
    public IBridgeBaseManagementProfileGet createIBridgeBaseManagementProfileGet() {
        return new IBridgeBaseManagementProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileListResponse }
     * 
     */
    public IBridgeBaseSystemDefaultProfileListResponse createIBridgeBaseSystemDefaultProfileListResponse() {
        return new IBridgeBaseSystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link RelayProfileClone }
     * 
     */
    public RelayProfileClone createRelayProfileClone() {
        return new RelayProfileClone();
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
     * Create an instance of {@link RelaySystemDefaultProfileGet }
     * 
     */
    public RelaySystemDefaultProfileGet createRelaySystemDefaultProfileGet() {
        return new RelaySystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfigListResponse }
     * 
     */
    public IBridgeBasePnpConfigListResponse createIBridgeBasePnpConfigListResponse() {
        return new IBridgeBasePnpConfigListResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileCreateResponse }
     * 
     */
    public IBridgeTermRadioProfileCreateResponse createIBridgeTermRadioProfileCreateResponse() {
        return new IBridgeTermRadioProfileCreateResponse();
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
     * Create an instance of {@link IBridgeBaseRadioProfileCreate }
     * 
     */
    public IBridgeBaseRadioProfileCreate createIBridgeBaseRadioProfileCreate() {
        return new IBridgeBaseRadioProfileCreate();
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
     * Create an instance of {@link IBridgeTermRadioProfileCloneResponse }
     * 
     */
    public IBridgeTermRadioProfileCloneResponse createIBridgeTermRadioProfileCloneResponse() {
        return new IBridgeTermRadioProfileCloneResponse();
    }

    /**
     * Create an instance of {@link RelayPnpConfigCloneResponse }
     * 
     */
    public RelayPnpConfigCloneResponse createRelayPnpConfigCloneResponse() {
        return new RelayPnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link ProfileResult }
     * 
     */
    public ProfileResult createProfileResult() {
        return new ProfileResult();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link RelaySystemDefaultProfileResult }
     * 
     */
    public RelaySystemDefaultProfileResult createRelaySystemDefaultProfileResult() {
        return new RelaySystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link PdclEntryWs }
     * 
     */
    public PdclEntryWs createPdclEntryWs() {
        return new PdclEntryWs();
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
     * Create an instance of {@link RelayDetailsParams }
     * 
     */
    public RelayDetailsParams createRelayDetailsParams() {
        return new RelayDetailsParams();
    }

    /**
     * Create an instance of {@link IBridgeTermRadioProfileResult }
     * 
     */
    public IBridgeTermRadioProfileResult createIBridgeTermRadioProfileResult() {
        return new IBridgeTermRadioProfileResult();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link IBridgeTermConfigResult }
     * 
     */
    public IBridgeTermConfigResult createIBridgeTermConfigResult() {
        return new IBridgeTermConfigResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseConfigResult }
     * 
     */
    public IBridgeBaseConfigResult createIBridgeBaseConfigResult() {
        return new IBridgeBaseConfigResult();
    }

    /**
     * Create an instance of {@link RelayProfileResult }
     * 
     */
    public RelayProfileResult createRelayProfileResult() {
        return new RelayProfileResult();
    }

    /**
     * Create an instance of {@link RelayPnpConfigWs }
     * 
     */
    public RelayPnpConfigWs createRelayPnpConfigWs() {
        return new RelayPnpConfigWs();
    }

    /**
     * Create an instance of {@link IBridgeBaseSystemDefaultProfileResult }
     * 
     */
    public IBridgeBaseSystemDefaultProfileResult createIBridgeBaseSystemDefaultProfileResult() {
        return new IBridgeBaseSystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link IBridgeTermPnpConfigWs }
     * 
     */
    public IBridgeTermPnpConfigWs createIBridgeTermPnpConfigWs() {
        return new IBridgeTermPnpConfigWs();
    }

    /**
     * Create an instance of {@link ChannelProfileEntry }
     * 
     */
    public ChannelProfileEntry createChannelProfileEntry() {
        return new ChannelProfileEntry();
    }

    /**
     * Create an instance of {@link ArrayOfChannelProfileEntry }
     * 
     */
    public ArrayOfChannelProfileEntry createArrayOfChannelProfileEntry() {
        return new ArrayOfChannelProfileEntry();
    }

    /**
     * Create an instance of {@link RelayConfigResult }
     * 
     */
    public RelayConfigResult createRelayConfigResult() {
        return new RelayConfigResult();
    }

    /**
     * Create an instance of {@link SnmpDetailWs }
     * 
     */
    public SnmpDetailWs createSnmpDetailWs() {
        return new SnmpDetailWs();
    }

    /**
     * Create an instance of {@link IBridgeBaseManagementProfileResult }
     * 
     */
    public IBridgeBaseManagementProfileResult createIBridgeBaseManagementProfileResult() {
        return new IBridgeBaseManagementProfileResult();
    }

    /**
     * Create an instance of {@link ConnectedDeviceVciToTypeList }
     * 
     */
    public ConnectedDeviceVciToTypeList createConnectedDeviceVciToTypeList() {
        return new ConnectedDeviceVciToTypeList();
    }

    /**
     * Create an instance of {@link ConnectedDeviceVciToTypeEntryWs }
     * 
     */
    public ConnectedDeviceVciToTypeEntryWs createConnectedDeviceVciToTypeEntryWs() {
        return new ConnectedDeviceVciToTypeEntryWs();
    }

    /**
     * Create an instance of {@link Ib440DetailsGet }
     * 
     */
    public Ib440DetailsGet createIb440DetailsGet() {
        return new Ib440DetailsGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseRadioProfileResult }
     * 
     */
    public IBridgeBaseRadioProfileResult createIBridgeBaseRadioProfileResult() {
        return new IBridgeBaseRadioProfileResult();
    }

    /**
     * Create an instance of {@link AllowedBandWs }
     * 
     */
    public AllowedBandWs createAllowedBandWs() {
        return new AllowedBandWs();
    }

    /**
     * Create an instance of {@link ConnectedDeviceTypeToApnEntryWs }
     * 
     */
    public ConnectedDeviceTypeToApnEntryWs createConnectedDeviceTypeToApnEntryWs() {
        return new ConnectedDeviceTypeToApnEntryWs();
    }

    /**
     * Create an instance of {@link Ib440ConfigResult }
     * 
     */
    public Ib440ConfigResult createIb440ConfigResult() {
        return new Ib440ConfigResult();
    }

    /**
     * Create an instance of {@link PdclList }
     * 
     */
    public PdclList createPdclList() {
        return new PdclList();
    }

    /**
     * Create an instance of {@link ConnectedDeviceTypeToApnList }
     * 
     */
    public ConnectedDeviceTypeToApnList createConnectedDeviceTypeToApnList() {
        return new ConnectedDeviceTypeToApnList();
    }

    /**
     * Create an instance of {@link IBridgeBasePnpConfig }
     * 
     */
    public IBridgeBasePnpConfig createIBridgeBasePnpConfig() {
        return new IBridgeBasePnpConfig();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CellRadiusRanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellRadiusRange", scope = Ib440DetailsGet.class)
    public JAXBElement<CellRadiusRanges> createIb440DetailsGetCellRadiusRange(CellRadiusRanges value) {
        return new JAXBElement<CellRadiusRanges>(_Ib440DetailsGetCellRadiusRange_QNAME, CellRadiusRanges.class, Ib440DetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardIntervalTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GuardInterval", scope = Ib440DetailsGet.class)
    public JAXBElement<GuardIntervalTypes> createIb440DetailsGetGuardInterval(GuardIntervalTypes value) {
        return new JAXBElement<GuardIntervalTypes>(_Ib440DetailsGetGuardInterval_QNAME, GuardIntervalTypes.class, Ib440DetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = Ib440DetailsGet.class)
    public JAXBElement<String> createIb440DetailsGetBandwidth(String value) {
        return new JAXBElement<String>(_Ib440DetailsGetBandwidth_QNAME, String.class, Ib440DetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440DetailsGet.class)
    public JAXBElement<Integer> createIb440DetailsGetFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetFrequency_QNAME, Integer.class, Ib440DetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = Ib440DetailsGet.class)
    public JAXBElement<NodeManagementModes> createIb440DetailsGetManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QosValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQosEnabled", scope = Ib440DetailsGet.class)
    public JAXBElement<QosValues> createIb440DetailsGetIsQosEnabled(QosValues value) {
        return new JAXBElement<QosValues>(_Ib440DetailsGetIsQosEnabled_QNAME, QosValues.class, Ib440DetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440DetailsGet.class)
    public JAXBElement<Integer> createIb440DetailsGetTxPower(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetTxPower_QNAME, Integer.class, Ib440DetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NmsSnmpPort", scope = RelayRedirectDetailWs.class)
    public JAXBElement<Integer> createRelayRedirectDetailWsNmsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_RelayRedirectDetailWsNmsSnmpPort_QNAME, Integer.class, RelayRedirectDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RelaySnmpPort", scope = RelayRedirectDetailWs.class)
    public JAXBElement<Integer> createRelayRedirectDetailWsRelaySnmpPort(Integer value) {
        return new JAXBElement<Integer>(_RelayRedirectDetailWsRelaySnmpPort_QNAME, Integer.class, RelayRedirectDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RelaySnmpVersion", scope = RelayRedirectDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createRelayRedirectDetailWsRelaySnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_RelayRedirectDetailWsRelaySnmpVersion_QNAME, SnmpAgentVersion.class, RelayRedirectDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = SnmpDetailWs.class)
    public JAXBElement<Integer> createSnmpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_SnmpDetailWsSnmpPort_QNAME, Integer.class, SnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadyForService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReadyForService", scope = IbBaseDetailsPnp.class)
    public JAXBElement<ReadyForService> createIbBaseDetailsPnpReadyForService(ReadyForService value) {
        return new JAXBElement<ReadyForService>(_IbBaseDetailsPnpReadyForService_QNAME, ReadyForService.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPreambleIndex_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpManagementVlanId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpCellId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpCellId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedEnabled", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Boolean> createIbBaseDetailsPnpLedEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IbBaseDetailsPnpLedEnabled_QNAME, Boolean.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseManagementIfForPtp", scope = IbBaseDetailsPnp.class)
    public JAXBElement<EnabledDisabledValues> createIbBaseDetailsPnpUseManagementIfForPtp(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IbBaseDetailsPnpUseManagementIfForPtp_QNAME, EnabledDisabledValues.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSubnetCidr", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPtpSubnetCidr(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPtpSubnetCidr_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpVlanId", scope = IbBaseDetailsPnp.class)
    public JAXBElement<Integer> createIbBaseDetailsPnpPtpVlanId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPtpVlanId_QNAME, Integer.class, IbBaseDetailsPnp.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionThreshold", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltProtectionThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltProtectionThreshold_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfileTiltAlarmEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfileTiltAlarmEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AirInterfaceUsageStats", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileAirInterfaceUsageStats(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileAirInterfaceUsageStats_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpLeaseDuration", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfilePtpLeaseDuration(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfilePtpLeaseDuration_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createIBridgeBaseManagementProfileNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, IBridgeBaseManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDelayReqRespRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpDelayReqRespRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpDelayReqRespRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmRaiseThreshold", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltAlarmRaiseThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltAlarmRaiseThreshold_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpAnnounceRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpAnnounceRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpAnnounceRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSyncRate", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<String> createIBridgeBaseManagementProfilePtpSyncRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpSyncRate_QNAME, String.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionDelay", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileTiltProtectionDelay(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltProtectionDelay_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsCollectionPeriod", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfileStatsCollectionPeriod(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileStatsCollectionPeriod_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfileTiltProtectionEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfileTiltProtectionEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpMasterEnabled", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseManagementProfilePtpMasterEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfilePtpMasterEnabled_QNAME, EnabledDisabledValues.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms3_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms4_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms1_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseManagementProfileUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms2_QNAME, Boolean.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDomain", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<Integer> createIBridgeBaseManagementProfilePtpDomain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfilePtpDomain_QNAME, Integer.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseManagementProfile.class)
    public JAXBElement<CategoriesIbBase> createIBridgeBaseManagementProfileHardwareCategory(CategoriesIbBase value) {
        return new JAXBElement<CategoriesIbBase>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, CategoriesIbBase.class, IBridgeBaseManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = RelayPnpDetailWs.class)
    public JAXBElement<BigDecimal> createRelayPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLongitude_QNAME, BigDecimal.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = RelayPnpDetailWs.class)
    public JAXBElement<Integer> createRelayPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_RelayPnpDetailWsPnpLatLongRadius_QNAME, Integer.class, RelayPnpDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = RelayPnpDetailWs.class)
    public JAXBElement<BigDecimal> createRelayPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLatitude_QNAME, BigDecimal.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = RelayPnpDetailWs.class)
    public JAXBElement<Double> createRelayPnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_RelayPnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = RelayPnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createRelayPnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_RelayPnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = RelayPnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createRelayPnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_RelayPnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, RelayPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeBasePnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLongitude_QNAME, BigDecimal.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeBasePnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_RelayPnpDetailWsPnpLatLongRadius_QNAME, Integer.class, IBridgeBasePnpDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeBasePnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLatitude_QNAME, BigDecimal.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Double> createIBridgeBasePnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_RelayPnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createIBridgeBasePnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_RelayPnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createIBridgeBasePnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_RelayPnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbBasePnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = IBridgeBasePnpDetailWs.class)
    public JAXBElement<IbBasePnpHardwareTypes> createIBridgeBasePnpDetailWsHardware(IbBasePnpHardwareTypes value) {
        return new JAXBElement<IbBasePnpHardwareTypes>(_IBridgeBasePnpDetailWsHardware_QNAME, IbBasePnpHardwareTypes.class, IBridgeBasePnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = ChannelProfileEntry.class)
    public JAXBElement<Integer> createChannelProfileEntryPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPreambleIndex_QNAME, Integer.class, ChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = ChannelProfileEntry.class)
    public JAXBElement<Integer> createChannelProfileEntryPriority(Integer value) {
        return new JAXBElement<Integer>(_ChannelProfileEntryPriority_QNAME, Integer.class, ChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = ChannelProfileEntry.class)
    public JAXBElement<Integer> createChannelProfileEntryFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetFrequency_QNAME, Integer.class, ChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Id", scope = ChannelProfileEntry.class)
    public JAXBElement<Integer> createChannelProfileEntryId(Integer value) {
        return new JAXBElement<Integer>(_ChannelProfileEntryId_QNAME, Integer.class, ChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaDirection", scope = ChannelProfileEntry.class)
    public JAXBElement<String> createChannelProfileEntryAntennaDirection(String value) {
        return new JAXBElement<String>(_ChannelProfileEntryAntennaDirection_QNAME, String.class, ChannelProfileEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = RelaySystemDefaultProfileResult.class)
    public JAXBElement<RelayHardwareTypes> createRelaySystemDefaultProfileResultHardwareCategory(RelayHardwareTypes value) {
        return new JAXBElement<RelayHardwareTypes>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, RelayHardwareTypes.class, RelaySystemDefaultProfileResult.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeTermHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeTermSystemDefaultProfileResult.class)
    public JAXBElement<IBridgeTermHardwareTypes> createIBridgeTermSystemDefaultProfileResultHardwareCategory(IBridgeTermHardwareTypes value) {
        return new JAXBElement<IBridgeTermHardwareTypes>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, IBridgeTermHardwareTypes.class, IBridgeTermSystemDefaultProfileResult.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ServiceAllowed", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Boolean> createIBridgeTermDetailsPnpServiceAllowed(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeTermDetailsPnpServiceAllowed_QNAME, Boolean.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpManagementVlanId_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedEnabled", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Boolean> createIBridgeTermDetailsPnpLedEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IbBaseDetailsPnpLedEnabled_QNAME, Boolean.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseManagementIfForPtp", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeTermDetailsPnpUseManagementIfForPtp(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IbBaseDetailsPnpUseManagementIfForPtp_QNAME, EnabledDisabledValues.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSubnetCidr", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpPtpSubnetCidr(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPtpSubnetCidr_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpVlanId", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<Integer> createIBridgeTermDetailsPnpPtpVlanId(Integer value) {
        return new JAXBElement<Integer>(_IbBaseDetailsPnpPtpVlanId_QNAME, Integer.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableDisableOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnableHomeBs", scope = IBridgeTermDetailsPnp.class)
    public JAXBElement<EnableDisableOptions> createIBridgeTermDetailsPnpEnableHomeBs(EnableDisableOptions value) {
        return new JAXBElement<EnableDisableOptions>(_IBridgeTermDetailsPnpEnableHomeBs_QNAME, EnableDisableOptions.class, IBridgeTermDetailsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionThreshold", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltProtectionThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltProtectionThreshold_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIbTermRadioProfileTiltAlarmEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfileTiltAlarmEnabled_QNAME, EnabledDisabledValues.class, IbTermRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkModulation", scope = IbTermRadioProfile.class)
    public JAXBElement<OfdmaFecCodeTypesIbridge> createIbTermRadioProfileUplinkModulation(OfdmaFecCodeTypesIbridge value) {
        return new JAXBElement<OfdmaFecCodeTypesIbridge>(_IbTermRadioProfileUplinkModulation_QNAME, OfdmaFecCodeTypesIbridge.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpLeaseDuration", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfilePtpLeaseDuration(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfilePtpLeaseDuration_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createIbTermRadioProfileNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltAlarmRaiseThreshold", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltAlarmRaiseThreshold(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltAlarmRaiseThreshold_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDelayReqRespRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpDelayReqRespRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpDelayReqRespRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpAnnounceRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpAnnounceRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpAnnounceRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpSyncRate", scope = IbTermRadioProfile.class)
    public JAXBElement<String> createIbTermRadioProfilePtpSyncRate(String value) {
        return new JAXBElement<String>(_IBridgeBaseManagementProfilePtpSyncRate_QNAME, String.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionDelay", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfileTiltProtectionDelay(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfileTiltProtectionDelay_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTClockSourceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ClockSynchronisation", scope = IbTermRadioProfile.class)
    public JAXBElement<FTClockSourceTypes> createIbTermRadioProfileClockSynchronisation(FTClockSourceTypes value) {
        return new JAXBElement<FTClockSourceTypes>(_IbTermRadioProfileClockSynchronisation_QNAME, FTClockSourceTypes.class, IbTermRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TiltProtectionEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIbTermRadioProfileTiltProtectionEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfileTiltProtectionEnabled_QNAME, EnabledDisabledValues.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpMasterEnabled", scope = IbTermRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIbTermRadioProfilePtpMasterEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseManagementProfilePtpMasterEnabled_QNAME, EnabledDisabledValues.class, IbTermRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms3_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms4_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms1_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = IbTermRadioProfile.class)
    public JAXBElement<Boolean> createIbTermRadioProfileUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms2_QNAME, Boolean.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpDomain", scope = IbTermRadioProfile.class)
    public JAXBElement<Integer> createIbTermRadioProfilePtpDomain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseManagementProfilePtpDomain_QNAME, Integer.class, IbTermRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesIbTerm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IbTermRadioProfile.class)
    public JAXBElement<CategoriesIbTerm> createIbTermRadioProfileHardwareCategory(CategoriesIbTerm value) {
        return new JAXBElement<CategoriesIbTerm>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, CategoriesIbTerm.class, IbTermRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApnAuthenticationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthType", scope = ConnectedDeviceTypeToApnEntryWs.class)
    public JAXBElement<ApnAuthenticationTypes> createConnectedDeviceTypeToApnEntryWsAuthType(ApnAuthenticationTypes value) {
        return new JAXBElement<ApnAuthenticationTypes>(_ConnectedDeviceTypeToApnEntryWsAuthType_QNAME, ApnAuthenticationTypes.class, ConnectedDeviceTypeToApnEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress1Enabled", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileNtpServerIpAddress1Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress1Enabled_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSinrHystersis", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileDenbSinrHystersis(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileDenbSinrHystersis_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoBackoffScanPeriod", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileAutoBackoffScanPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileAutoBackoffScanPeriod_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoBackoffMaxScanEvents", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileAutoBackoffMaxScanEvents(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileAutoBackoffMaxScanEvents_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbReportingInterval", scope = RelayProfile.class)
    public JAXBElement<String> createRelayProfileEnbReportingInterval(String value) {
        return new JAXBElement<String>(_RelayProfileEnbReportingInterval_QNAME, String.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicReScanPeriod", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfilePeriodicReScanPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfilePeriodicReScanPeriod_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FineAlignMode", scope = RelayProfile.class)
    public JAXBElement<Boolean> createRelayProfileFineAlignMode(Boolean value) {
        return new JAXBElement<Boolean>(_RelayProfileFineAlignMode_QNAME, Boolean.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutonomousRescanModeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutonomousReScanMode", scope = RelayProfile.class)
    public JAXBElement<AutonomousRescanModeValues> createRelayProfileAutonomousReScanMode(AutonomousRescanModeValues value) {
        return new JAXBElement<AutonomousRescanModeValues>(_RelayProfileAutonomousReScanMode_QNAME, AutonomousRescanModeValues.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSinrThreshold", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileDenbSinrThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileDenbSinrThreshold_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbReportingEnabled", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileEnbReportingEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileEnbReportingEnabled_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NodeSshAccess", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileNodeSshAccess(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileNodeSshAccess_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MimoSpectralEfficiencyThreshold", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileMimoSpectralEfficiencyThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileMimoSpectralEfficiencyThreshold_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rbv", scope = RelayProfile.class)
    public JAXBElement<BigDecimal> createRelayProfileRbv(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileRbv_QNAME, BigDecimal.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress4Enabled", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileNtpServerIpAddress4Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress4Enabled_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress3Enabled", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileNtpServerIpAddress3Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress3Enabled_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NtpServerIpAddress2Enabled", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileNtpServerIpAddress2Enabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_IBridgeBaseManagementProfileNtpServerIpAddress2Enabled_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsGranularityPeriod", scope = RelayProfile.class)
    public JAXBElement<String> createRelayProfileStatsGranularityPeriod(String value) {
        return new JAXBElement<String>(_RelayProfileStatsGranularityPeriod_QNAME, String.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSeThreshold", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileDenbSeThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileDenbSeThreshold_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbSeHystersis", scope = RelayProfile.class)
    public JAXBElement<BigDecimal> createRelayProfileDenbSeHystersis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayProfileDenbSeHystersis_QNAME, BigDecimal.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodicReScan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicReScanMode", scope = RelayProfile.class)
    public JAXBElement<PeriodicReScan> createRelayProfilePeriodicReScanMode(PeriodicReScan value) {
        return new JAXBElement<PeriodicReScan>(_RelayProfilePeriodicReScanMode_QNAME, PeriodicReScan.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedLocationRadius", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileAllowedLocationRadius(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileAllowedLocationRadius_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationAccuracyThreshold", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileLocationAccuracyThreshold(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileLocationAccuracyThreshold_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FineAlignAvgPeriod", scope = RelayProfile.class)
    public JAXBElement<Integer> createRelayProfileFineAlignAvgPeriod(Integer value) {
        return new JAXBElement<Integer>(_RelayProfileFineAlignAvgPeriod_QNAME, Integer.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationPersistancy", scope = RelayProfile.class)
    public JAXBElement<EnabledDisabledStates> createRelayProfileLocationPersistancy(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_RelayProfileLocationPersistancy_QNAME, EnabledDisabledStates.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms3", scope = RelayProfile.class)
    public JAXBElement<Boolean> createRelayProfileUseNms3(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms3_QNAME, Boolean.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms4", scope = RelayProfile.class)
    public JAXBElement<Boolean> createRelayProfileUseNms4(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms4_QNAME, Boolean.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms1", scope = RelayProfile.class)
    public JAXBElement<Boolean> createRelayProfileUseNms1(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms1_QNAME, Boolean.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseNms2", scope = RelayProfile.class)
    public JAXBElement<Boolean> createRelayProfileUseNms2(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseManagementProfileUseNms2_QNAME, Boolean.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesRelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = RelayProfile.class)
    public JAXBElement<CategoriesRelay> createRelayProfileHardwareCategory(CategoriesRelay value) {
        return new JAXBElement<CategoriesRelay>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, CategoriesRelay.class, RelayProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = SnmpDetailSetWs.class)
    public JAXBElement<Double> createSnmpDetailSetWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_RelayPnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = SnmpDetailSetWs.class)
    public JAXBElement<SnmpAgentVersion> createSnmpDetailSetWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_RelayPnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = SnmpDetailSetWs.class)
    public JAXBElement<Snmpv3AccessTypes> createSnmpDetailSetWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_RelayPnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, SnmpDetailSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = Ib440DetailsSetWs.class)
    public JAXBElement<String> createIb440DetailsSetWsBandwidth(String value) {
        return new JAXBElement<String>(_Ib440DetailsGetBandwidth_QNAME, String.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440DetailsSetWs.class)
    public JAXBElement<Integer> createIb440DetailsSetWsFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetFrequency_QNAME, Integer.class, Ib440DetailsSetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = Ib440DetailsSetWs.class)
    public JAXBElement<NodeManagementModes> createIb440DetailsSetWsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_Ib440DetailsGetManagedMode_QNAME, NodeManagementModes.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QosValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQosEnabled", scope = Ib440DetailsSetWs.class)
    public JAXBElement<QosValues> createIb440DetailsSetWsIsQosEnabled(QosValues value) {
        return new JAXBElement<QosValues>(_Ib440DetailsGetIsQosEnabled_QNAME, QosValues.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440DetailsSetWs.class)
    public JAXBElement<Integer> createIb440DetailsSetWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetTxPower_QNAME, Integer.class, Ib440DetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeTermPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLongitude_QNAME, BigDecimal.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Integer> createIBridgeTermPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_RelayPnpDetailWsPnpLatLongRadius_QNAME, Integer.class, IBridgeTermPnpDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<BigDecimal> createIBridgeTermPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayPnpDetailWsPnpLatitude_QNAME, BigDecimal.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Double> createIBridgeTermPnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_RelayPnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createIBridgeTermPnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_RelayPnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createIBridgeTermPnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_RelayPnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IbTermPnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = IBridgeTermPnpDetailWs.class)
    public JAXBElement<IbTermPnpHardwareTypes> createIBridgeTermPnpDetailWsHardware(IbTermPnpHardwareTypes value) {
        return new JAXBElement<IbTermPnpHardwareTypes>(_IBridgeBasePnpDetailWsHardware_QNAME, IbTermPnpHardwareTypes.class, IBridgeTermPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeBaseHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseSystemDefaultProfileResult.class)
    public JAXBElement<IBridgeBaseHardwareTypes> createIBridgeBaseSystemDefaultProfileResultHardwareCategory(IBridgeBaseHardwareTypes value) {
        return new JAXBElement<IBridgeBaseHardwareTypes>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, IBridgeBaseHardwareTypes.class, IBridgeBaseSystemDefaultProfileResult.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BackhaulModes> createIBridgeBaseRadioProfileBackhaulMode(BackhaulModes value) {
        return new JAXBElement<BackhaulModes>(_IBridgeBaseRadioProfileBackhaulMode_QNAME, BackhaulModes.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlink16Qam12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlink16Qam12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440DetailsGetFrequency_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CarrierSense", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseRadioProfileCarrierSense(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseRadioProfileCarrierSense_QNAME, EnabledDisabledValues.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeDlMimoModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMimoMatrix", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeDlMimoModes> createIBridgeBaseRadioProfileDownlinkMimoMatrix(IBridgeDlMimoModes value) {
        return new JAXBElement<IBridgeDlMimoModes>(_IbTermRadioProfileDownlinkMimoMatrix_QNAME, IBridgeDlMimoModes.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeFrameModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FrameMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeFrameModes> createIBridgeBaseRadioProfileFrameMode(IBridgeFrameModes value) {
        return new JAXBElement<IBridgeFrameModes>(_IBridgeBaseRadioProfileFrameMode_QNAME, IBridgeFrameModes.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink64Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink64Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink64Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkMatrixBAdditionalCinrMargin", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkMatrixBAdditionalCinrMargin_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FloodUnknownTraffic", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseRadioProfileFloodUnknownTraffic(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseRadioProfileFloodUnknownTraffic_QNAME, EnabledDisabledValues.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSisoZoneSize", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileMaxSisoZoneSize(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileMaxSisoZoneSize_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link IBridgeUlMimoModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkMimo", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<IBridgeUlMimoModes> createIBridgeBaseRadioProfileUplinkMimo(IBridgeUlMimoModes value) {
        return new JAXBElement<IBridgeUlMimoModes>(_IBridgeBaseRadioProfileUplinkMimo_QNAME, IBridgeUlMimoModes.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileBandwidth(String value) {
        return new JAXBElement<String>(_Ib440DetailsGetBandwidth_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecurityMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<SecurityModes> createIBridgeBaseRadioProfileSecurityMode(SecurityModes value) {
        return new JAXBElement<SecurityModes>(_IBridgeBaseRadioProfileSecurityMode_QNAME, SecurityModes.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam12Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink16Qam12Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink16Qam12Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileRfGain_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkQpsk12", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileDownlinkQpsk12(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileDownlinkQpsk12_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink64Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink64Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkTraffic", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<String> createIBridgeBaseRadioProfileDownlinkTraffic(String value) {
        return new JAXBElement<String>(_IBridgeBaseRadioProfileDownlinkTraffic_QNAME, String.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<CategoriesIbBase> createIBridgeBaseRadioProfileHardwareCategory(CategoriesIbBase value) {
        return new JAXBElement<CategoriesIbBase>(_IBridgeBaseManagementProfileHardwareCategory_QNAME, CategoriesIbBase.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink256Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink256Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink256Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BsEirpTotalCombined", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileBsEirpTotalCombined(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileBsEirpTotalCombined_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink16Qam34", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink16Qam34(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink16Qam34_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialRangingRxLevel", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileInitialRangingRxLevel(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileInitialRangingRxLevel_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Ib4X0PuscGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Subchannels", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Ib4X0PuscGroups> createIBridgeBaseRadioProfileSubchannels(Ib4X0PuscGroups value) {
        return new JAXBElement<Ib4X0PuscGroups>(_IBridgeBaseRadioProfileSubchannels_QNAME, Ib4X0PuscGroups.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FbNullingMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RxNullingModes> createIBridgeBaseRadioProfileFbNullingMode(RxNullingModes value) {
        return new JAXBElement<RxNullingModes>(_IBridgeBaseRadioProfileFbNullingMode_QNAME, RxNullingModes.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Downlink16Qam34Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileDownlink16Qam34Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileDownlink16Qam34Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileTxPower(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Ib440DetailsGetTxPower_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Range", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RangeModes> createIBridgeBaseRadioProfileRange(RangeModes value) {
        return new JAXBElement<RangeModes>(_IBridgeBaseRadioProfileRange_QNAME, RangeModes.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink256Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink256Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FtNullingMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<RxNullingModes> createIBridgeBaseRadioProfileFtNullingMode(RxNullingModes value) {
        return new JAXBElement<RxNullingModes>(_IBridgeBaseRadioProfileFtNullingMode_QNAME, RxNullingModes.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UlAdaptationEfficiencyModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkAdaptationEfficiencyMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<UlAdaptationEfficiencyModes> createIBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode(UlAdaptationEfficiencyModes value) {
        return new JAXBElement<UlAdaptationEfficiencyModes>(_IBridgeBaseRadioProfileUplinkAdaptationEfficiencyMode_QNAME, UlAdaptationEfficiencyModes.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TddSplit", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileTddSplit(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileTddSplit_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ft2FtLocalSwitching", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<EnabledDisabledValues> createIBridgeBaseRadioProfileFt2FtLocalSwitching(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_IBridgeBaseRadioProfileFt2FtLocalSwitching_QNAME, EnabledDisabledValues.class, IBridgeBaseRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UlPermutationTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkPermutation", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<UlPermutationTypes> createIBridgeBaseRadioProfileUplinkPermutation(UlPermutationTypes value) {
        return new JAXBElement<UlPermutationTypes>(_IBridgeBaseRadioProfileUplinkPermutation_QNAME, UlPermutationTypes.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink256Qam56Enabled", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Boolean> createIBridgeBaseRadioProfileUplink256Qam56Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridgeBaseRadioProfileUplink256Qam56Enabled_QNAME, Boolean.class, IBridgeBaseRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uplink64Qam56", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<BigDecimal> createIBridgeBaseRadioProfileUplink64Qam56(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridgeBaseRadioProfileUplink64Qam56_QNAME, BigDecimal.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoAlignOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoAlignMode", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<AutoAlignOptions> createIBridgeBaseRadioProfileAutoAlignMode(AutoAlignOptions value) {
        return new JAXBElement<AutoAlignOptions>(_IBridgeBaseRadioProfileAutoAlignMode_QNAME, AutoAlignOptions.class, IBridgeBaseRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackoffFrames", scope = IBridgeBaseRadioProfile.class)
    public JAXBElement<Integer> createIBridgeBaseRadioProfileBackoffFrames(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRadioProfileBackoffFrames_QNAME, Integer.class, IBridgeBaseRadioProfile.class, value);
    }

}
