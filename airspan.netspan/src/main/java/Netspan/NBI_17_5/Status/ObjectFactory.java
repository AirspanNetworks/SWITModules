
package Netspan.NBI_17_5.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import Netspan.API.Enums.DiscoveredByValues;
import Netspan.API.Enums.EnbTypes;
import Netspan.API.Enums.HandoverType;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.NghCellStatus;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_17_5.Status package. 
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
    private final static QName _NlmScanStatusEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _NlmScanStatusDlBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlBandwidth");
    private final static QName _NlmScanStatusPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci");
    private final static QName _NlmScanStatusRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp");
    private final static QName _NlmScanStatusRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rssi");
    private final static QName _NlmScanStatusRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq");
    private final static QName _NlmScanStatusTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tac");
    private final static QName _NlmScanStatusStratumLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "StratumLevel");
    private final static QName _NlmScanStatusSyncStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncStatus");
    private final static QName _LocationLockFingerPrintWsEcgi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ecgi");
    private final static QName _LocationLockFingerPrintWsTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _LocationLockFingerPrintWsRtd_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rtd");
    private final static QName _NlScanStatusItemWsDownlinkBandwidthRB_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkBandwidthRB");
    private final static QName _NlScanStatusItemWsState_QNAME = new QName("http://Airspan.Netspan.WebServices", "State");
    private final static QName _SynchronizationSourceItemWsClockSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "ClockSource");
    private final static QName _SynchronizationSourceItemWsPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _SynchronizationSourceItemWsStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "Status");
    private final static QName _LocationLockStatusWsFingerPrintMark_QNAME = new QName("http://Airspan.Netspan.WebServices", "FingerPrintMark");
    private final static QName _LocationLockStatusWsEvalFingerPrintMark_QNAME = new QName("http://Airspan.Netspan.WebServices", "EvalFingerPrintMark");
    private final static QName _NlSyncDetailsWsUnavailableReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "UnavailableReason");
    private final static QName _NlSyncDetailsWsLockedPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "LockedPci");
    private final static QName _NlSyncDetailsWsLockedEcgi_QNAME = new QName("http://Airspan.Netspan.WebServices", "LockedEcgi");
    private final static QName _PtpDetailsWsActiveMasterStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveMasterStatus");
    private final static QName _PtpDetailsWsCurrentGrandMasterClockClass_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentGrandMasterClockClass");
    private final static QName _PtpDetailsWsCurrentUtcOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentUtcOffset");
    private final static QName _SynchronizationDetailsWsActiveSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveSource");
    private final static QName _SynchronizationDetailsWsTimeToHandoverExpirySecs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeToHandoverExpirySecs");
    private final static QName _SynchronizationDetailsWsSwitchRatePerDay_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwitchRatePerDay");
    private final static QName _SynchronizationDetailsWsLastSwitchTimeInSecs_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastSwitchTimeInSecs");
    private final static QName _GpsDetailsWsComms_QNAME = new QName("http://Airspan.Netspan.WebServices", "Comms");
    private final static QName _GpsDetailsWsTrackedSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "TrackedSatellites");
    private final static QName _GpsDetailsWsVisibleSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "VisibleSatellites");
    private final static QName _GpsDetailsWsSnr_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snr");
    private final static QName _GpsDetailsWsGpsFileStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsFileStatus");
    private final static QName _LocationDetailsWsSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "Source");
    private final static QName _LocationDetailsWsPnpReferenceLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpReferenceLatitude");
    private final static QName _LocationDetailsWsPnpReferenceLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpReferenceLongitude");
    private final static QName _LocationDetailsWsPnpReferenceAccuracy_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpReferenceAccuracy");
    private final static QName _LocationDetailsWsPnpReferenceSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpReferenceSource");
    private final static QName _RelayDonorCellWsPdclRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdclRank");
    private final static QName _RelayDonorCellWsGpsLockDetection_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockDetection");
    private final static QName _RelayDonorCellWsBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _RelayDonorCellWsEci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Eci");
    private final static QName _RelayDonorCellWsRankIndicator_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankIndicator");
    private final static QName _RelayDonorCellWsSignalToNoiseRatio_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalToNoiseRatio");
    private final static QName _RelayDonorCellWsLogicalAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "LogicalAngle");
    private final static QName _RelayDonorCellWsHeadingAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeadingAngle");
    private final static QName _RelayDonorCellWsSpectralEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpectralEfficiency");
    private final static QName _RelayDonorCellWsUsableLocation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UsableLocation");
    private final static QName _RelayDonorCellWsDrm_QNAME = new QName("http://Airspan.Netspan.WebServices", "Drm");
    private final static QName _RelayDonorCellWsCdclRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "CdclRank");
    private final static QName _RelayDonorCellWsRsrpDom_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpDom");
    private final static QName _RelayDonorCellWsQuarantineState_QNAME = new QName("http://Airspan.Netspan.WebServices", "QuarantineState");
    private final static QName _RelayDonorCellWsBandPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandPriority");
    private final static QName _RelayDonorCellWsDonorEndcIndication_QNAME = new QName("http://Airspan.Netspan.WebServices", "DonorEndcIndication");
    private final static QName _CarrierAggregationWsBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _CarrierAggregationWsCaState_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaState");
    private final static QName _RelayConnectedDevicesWsDeviceType_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeviceType");
    private final static QName _RelayConnectedDevicesWsConnectionStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionStatus");
    private final static QName _RelayConnectedDevicesWsLeaseTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeaseTime");
    private final static QName _RelayConnectedDevicesWsConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "Connected");
    private final static QName _RelayConnectedDevicesWsVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "VlanId");
    private final static QName _RelayStatusWsLteBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "LteBandwidth");
    private final static QName _RelayStatusWsDenbTxMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "DenbTxMode");
    private final static QName _RelayStatusWsP1CdclUsedStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "P1CdclUsedStatus");
    private final static QName _RelayStatusWsP1PdclUsedStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "P1PdclUsedStatus");
    private final static QName _RelayStatusWsScanStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "ScanStart");
    private final static QName _RelayStatusWsLastScanStartTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastScanStartTime");
    private final static QName _RelayStatusWsIsEnbConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnbConnected");
    private final static QName _RelayStatusWsSinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sinr");
    private final static QName _RelayStatusWsRadioTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioTxPower");
    private final static QName _RelayStatusWsDonorEnbQuality_QNAME = new QName("http://Airspan.Netspan.WebServices", "DonorEnbQuality");
    private final static QName _RelayStatusWsPci1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci1");
    private final static QName _RelayStatusWsRsrp1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp1");
    private final static QName _RelayStatusWsRsrq1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq1");
    private final static QName _RelayStatusWsPci2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci2");
    private final static QName _RelayStatusWsRsrp2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp2");
    private final static QName _RelayStatusWsRsrq2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq2");
    private final static QName _RelayStatusWsPci3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci3");
    private final static QName _RelayStatusWsRsrp3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp3");
    private final static QName _RelayStatusWsRsrq3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq3");
    private final static QName _RelayStatusWsTimingAdvance_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimingAdvance");
    private final static QName _RelayStatusWsMimoRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "MimoRank");
    private final static QName _RelayStatusWsDlPdcpThroughput_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlPdcpThroughput");
    private final static QName _RelayStatusWsUlPdcpThroughput_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPdcpThroughput");
    private final static QName _RelayStatusWsAntennaCorrelation_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaCorrelation");
    private final static QName _RelayStatusWsSccAntennaCorrelation_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccAntennaCorrelation");
    private final static QName _RelayStatusWsBackhaulType_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulType");
    private final static QName _RelayStatusWsBackhaulWifiApSecurity_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifiApSecurity");
    private final static QName _RelayStatusWsBackhaulWifiActiveChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifiActiveChannel");
    private final static QName _RelayStatusWsBackhaulWifiRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifiRssi");
    private final static QName _RelayStatusWsBackhaulWifiActiveBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifiActiveBand");
    private final static QName _RelayStatusWsBackhaulWifiIpMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "BackhaulWifiIpMode");
    private final static QName _IBridge2OverviewMimoChainStatusWsPolarization_QNAME = new QName("http://Airspan.Netspan.WebServices", "Polarization");
    private final static QName _IBridge2OverviewDeviceDetailsStatusWsLocalTdmaWindowMs_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocalTdmaWindowMs");
    private final static QName _IBridge2OverviewDeviceDetailsStatusWsLocalCPUTempC_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocalCPUTempC");
    private final static QName _IBridge2OverviewDeviceDetailsStatusWsRemoteTdmaWindowMs_QNAME = new QName("http://Airspan.Netspan.WebServices", "RemoteTdmaWindowMs");
    private final static QName _IBridge2OverviewDeviceDetailsStatusWsRemoteCPUTempC_QNAME = new QName("http://Airspan.Netspan.WebServices", "RemoteCPUTempC");
    private final static QName _IBridge2OverviewSignalMeterStatusWsPhyTxMbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhyTxMbps");
    private final static QName _IBridge2OverviewSignalMeterStatusWsPhyRxMbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhyRxMbps");
    private final static QName _IBridge2OverviewSignalMeterStatusWsMacTxMbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacTxMbps");
    private final static QName _IBridge2OverviewSignalMeterStatusWsMacRxMbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacRxMbps");
    private final static QName _IBridge2OverviewSignalMeterStatusWsTxPowerDbm_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPowerDbm");
    private final static QName _IBridge2OverviewSignalMeterStatusWsLinkLengthM_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkLengthM");
    private final static QName _IBridge2OverviewTopLevelStatusWsLinkUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkUptime");
    private final static QName _IBridge2ChannelAndPowerStatusWsAutoChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoChannel");
    private final static QName _IBridge2ChannelAndPowerStatusWsCenterFrequencyMhz_QNAME = new QName("http://Airspan.Netspan.WebServices", "CenterFrequencyMhz");
    private final static QName _IBridge2ChannelAndPowerStatusWsBaseAntennaGainDbi_QNAME = new QName("http://Airspan.Netspan.WebServices", "BaseAntennaGainDbi");
    private final static QName _IBridge2ChannelAndPowerStatusWsTermAntennaGainDbi_QNAME = new QName("http://Airspan.Netspan.WebServices", "TermAntennaGainDbi");
    private final static QName _IBridge2ChannelAndPowerStatusWsAutoPowerMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoPowerMode");
    private final static QName _IBridge2CommissionedPropertiesWsLocalAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocalAntennaGain");
    private final static QName _IBridge2CommissionedPropertiesWsRemoteAntennaGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "RemoteAntennaGain");
    private final static QName _IBridge2WebUiStatusResultWebUiEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WebUiEnabled");
    private final static QName _IBridgeTermRxNullingStatusRankingIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankingIndex");
    private final static QName _IBridgeTermRxNullingStatusPatternIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PatternIndex");
    private final static QName _IBridgeTermRxNullingStatusNullingQi_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingQi");
    private final static QName _IBridgeTermRxNullingStatusNumFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumFrames");
    private final static QName _IBridgeTermRxNullingStatusNumMeasurements_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumMeasurements");
    private final static QName _IBridgeTermScannedChannelFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _IBridgeTermScannedChannelAntennaPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaPort");
    private final static QName _IBridgeTermScannedChannelRfGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "RfGain");
    private final static QName _IBridgeTermScannedChannelChannelQuality_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelQuality");
    private final static QName _IBridgeTermScannedChannelAcqMimo_QNAME = new QName("http://Airspan.Netspan.WebServices", "AcqMimo");
    private final static QName _IBridgeTermScannedChannelPreambleIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleIndex");
    private final static QName _IBridgeTermScannedChannelPreambleCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleCinr");
    private final static QName _IBridgeTermScannedChannelPreambleFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleFreqOffset");
    private final static QName _IBridgeTermScannedChannelSisoZoneAnt0Cinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "SisoZoneAnt0Cinr");
    private final static QName _IBridgeTermActiveChannelCurrentPowerTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentPowerTotal");
    private final static QName _IBridgeTermActiveChannelCurrentPowerPerTone_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentPowerPerTone");
    private final static QName _IBridgeTermActiveChannelLinkLostCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkLostCount");
    private final static QName _IBridgeTermActiveChannelNullingCurrentPattern_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingCurrentPattern");
    private final static QName _IBridgeTermActiveChannelNullingCurrentReferencePattern_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingCurrentReferencePattern");
    private final static QName _FineAlignShmResultId_QNAME = new QName("http://Airspan.Netspan.WebServices", "Id");
    private final static QName _FineAlignShmResultMotorAzimuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "MotorAzimuth");
    private final static QName _FineAlignShmResultShmStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ShmStatus");
    private final static QName _FineAlignShmResultShm_QNAME = new QName("http://Airspan.Netspan.WebServices", "Shm");
    private final static QName _IBridgeBaseRfStatusWsConfiguredEirpDbm_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfiguredEirpDbm");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignMode");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignAzimuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignAzimuth");
    private final static QName _IBridgeBaseRfStatusWsCalculationStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "CalculationStatus");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignStatus");
    private final static QName _Ib440RfStatusWsTxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxLinkEfficiency");
    private final static QName _Ib440RfStatusWsRxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxLinkEfficiency");
    private final static QName _Ib440RfStatusWsSNR_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNR");
    private final static QName _Ib440RfStatusWsTxSignalStrengthChannel0_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthChannel0");
    private final static QName _Ib440RfStatusWsRxSignalStrengthChannel0_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthChannel0");
    private final static QName _Ib440RfStatusWsTxSignalStrengthChannel1_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthChannel1");
    private final static QName _Ib440RfStatusWsRxSignalStrengthChannel1_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthChannel1");
    private final static QName _Ib440RfStatusWsUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uptime");
    private final static QName _Ib440RfStatusWsRxSignalStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrength");
    private final static QName _Ib440RfStatusWsTxPhyRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPhyRate");
    private final static QName _Ib440RfStatusWsRxPhyRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxPhyRate");
    private final static QName _Ib440RfStatusWsTxSignalStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrength");
    private final static QName _LteCellStatusCachedWsCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellNumber");
    private final static QName _LteCellStatusCachedWsCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _LteCellStatusCachedWsPhysicalLayerCellGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerCellGroup");
    private final static QName _LteCellStatusCachedWsPhysicalLayerIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerIdentity");
    private final static QName _LteCellStatusCachedWsPhysicalCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalCellId");
    private final static QName _LteCellStatusCachedWsCurrentRsiValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentRsiValue");
    private final static QName _LteSfpStatusWsSfpSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpSupported");
    private final static QName _LteSfpStatusWsSfpConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpConnected");
    private final static QName _LteSfpStatusWsSfpDdmSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmSupported");
    private final static QName _LteSfpStatusWsSfpDdmTemperature_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmTemperature");
    private final static QName _LteSfpStatusWsSfpDdmTemperatureStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmTemperatureStatus");
    private final static QName _LteSfpStatusWsSfpDdmVoltage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmVoltage");
    private final static QName _LteSfpStatusWsSfpDdmVoltageStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmVoltageStatus");
    private final static QName _LteSfpStatusWsSfpDdmBias_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmBias");
    private final static QName _LteSfpStatusWsSfpDdmBiasStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmBiasStatus");
    private final static QName _LteSfpStatusWsSfpDdmTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmTxPower");
    private final static QName _LteSfpStatusWsSfpDdmTxPowerStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmTxPowerStatus");
    private final static QName _LteSfpStatusWsSfpDdmRxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmRxPower");
    private final static QName _LteSfpStatusWsSfpDdmRxPowerStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfpDdmRxPowerStatus");
    private final static QName _EthernetPerPortStatusWsTxEthFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxEthFrames");
    private final static QName _EthernetPerPortStatusWsTxEthBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxEthBytes");
    private final static QName _EthernetPerPortStatusWsTxEthErrFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxEthErrFrames");
    private final static QName _EthernetPerPortStatusWsRxEthFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxEthFrames");
    private final static QName _EthernetPerPortStatusWsRxEthBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxEthBytes");
    private final static QName _EthernetPerPortStatusWsRxEthErrFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxEthErrFrames");
    private final static QName _EthernetPerPortStatusWsTxErrorRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxErrorRate");
    private final static QName _EthernetPerPortStatusWsRxErrorRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxErrorRate");
    private final static QName _EthernetPerPortStatusWsTxLinkUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxLinkUsage");
    private final static QName _EthernetPerPortStatusWsRxLinkUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxLinkUsage");
    private final static QName _LteMaintenanceWindowWsRebootRequested_QNAME = new QName("http://Airspan.Netspan.WebServices", "RebootRequested");
    private final static QName _LteMaintenanceWindowListMaintenanceWindowEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaintenanceWindowEnabled");
    private final static QName _LteMaintenanceWindowListMaintenanceWinActive_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaintenanceWinActive");
    private final static QName _LteTwampReflectorWsUdpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "UdpPort");
    private final static QName _LteTwampReflectorWsPpsCounter_QNAME = new QName("http://Airspan.Netspan.WebServices", "PpsCounter");
    private final static QName _LteTwampSenderWsAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "Admin");
    private final static QName _LteTwampSenderWsMeasuredDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasuredDelay");
    private final static QName _LteTwampSenderWsMeasuredDv_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasuredDv");
    private final static QName _LteTwampSenderWsMeasuredRtd_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasuredRtd");
    private final static QName _LteTwampSenderWsMeasuredPacketLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasuredPacketLoss");
    private final static QName _LteTwampSenderWsOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "OperationalStatus");
    private final static QName _LteTwampSenderWsOperationalStatusFailureReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "OperationalStatusFailureReason");
    private final static QName _LteTwampSenderWsReflectorUdpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReflectorUdpPort");
    private final static QName _LteTwampSenderWsNumberOfSamplesInSession_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfSamplesInSession");
    private final static QName _LteTwampSenderWsReflSvrIpAddressStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReflSvrIpAddressStatus");
    private final static QName _LteTwampSenderWsSenderUdpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SenderUdpPort");
    private final static QName _EnbResetRequiredStatusResultIsResetRequired_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsResetRequired");
    private final static QName _ServerIPAddressListStatusWsBhQosBwReservationServerIPAddressCbrStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "BhQosBwReservationServerIPAddressCbrStatus");
    private final static QName _FtpIpAddressStatusWsBhQosFtpServerIpAddressStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "BhQosFtpServerIpAddressStatus");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityGbrUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityGbrUl");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityGbrDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityGbrDl");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityMcsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityMcsUl");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityMcsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityMcsDl");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityLayersNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityLayersNumber");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityFrameStructure_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityFrameStructure");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityChannelBw_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityChannelBw");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityPhr_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityPhr");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityPhrRbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityPhrRbs");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualitySyncCounter_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualitySyncCounter");
    private final static QName _LteQosHoRelayQualityWsQosHoRelayQualityAcceptableCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosHoRelayQualityAcceptableCalls");
    private final static QName _LteBhQosStatusWsAcceptableCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "AcceptableCalls");
    private final static QName _LteBhQosStatusWsBearerStatusD1_QNAME = new QName("http://Airspan.Netspan.WebServices", "BearerStatusD1");
    private final static QName _LteBhQosStatusWsBearerStatusD2_QNAME = new QName("http://Airspan.Netspan.WebServices", "BearerStatusD2");
    private final static QName _LteBhQosStatusWsMovingHighLimit_QNAME = new QName("http://Airspan.Netspan.WebServices", "MovingHighLimit");
    private final static QName _LteBhQosStatusWsMeasResult_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasResult");
    private final static QName _LteBhQosStatusWsZeroOngoingCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZeroOngoingCalls");
    private final static QName _LteBhQosStatusWsIpCbrStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpCbrStatus");
    private final static QName _LteBhQosStatusWsIpAddressIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpAddressIndex");
    private final static QName _LteBhQosStatusWsBwMeasurementResult_QNAME = new QName("http://Airspan.Netspan.WebServices", "BwMeasurementResult");
    private final static QName _LteBhQosStatusWsCpeBw_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpeBw");
    private final static QName _LteBhQosStatusWsCpeDlBw_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpeDlBw");
    private final static QName _LteBhQosStatusWsCpeUlBw_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpeUlBw");
    private final static QName _LteBhQosStatusWsDelta_QNAME = new QName("http://Airspan.Netspan.WebServices", "Delta");
    private final static QName _LteBhQosStatusWsDlMeasurement_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMeasurement");
    private final static QName _LteBhQosStatusWsMbrRequestedBw_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbrRequestedBw");
    private final static QName _LteBhQosStatusWsMbrRequestedCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbrRequestedCalls");
    private final static QName _LteBhQosStatusWsUlMeasurement_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMeasurement");
    private final static QName _LteBhQosStatusWsVolteBh_QNAME = new QName("http://Airspan.Netspan.WebServices", "VolteBh");
    private final static QName _LteBhQosStatusWsBhQos_QNAME = new QName("http://Airspan.Netspan.WebServices", "BhQos");
    private final static QName _LteCbrsStatusWsCbrsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrsEnabled");
    private final static QName _LteCbrsStatusWsCbsdState_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbsdState");
    private final static QName _LteCbrsStatusWsCell1AssignedBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell1AssignedBandwidth");
    private final static QName _LteCbrsStatusWsCell1DlEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell1DlEarfcn");
    private final static QName _LteCbrsStatusWsCell1AssignedFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell1AssignedFrequency");
    private final static QName _LteCbrsStatusWsCell1AssignedTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell1AssignedTxPower");
    private final static QName _LteCbrsStatusWsGrant1ExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Grant1ExpiryTime");
    private final static QName _LteCbrsStatusWsGrant1TransmissionExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Grant1TransmissionExpiryTime");
    private final static QName _LteCbrsStatusWsCell2AssignedBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell2AssignedBandwidth");
    private final static QName _LteCbrsStatusWsCell2DlEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell2DlEarfcn");
    private final static QName _LteCbrsStatusWsCell2AssignedFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell2AssignedFrequency");
    private final static QName _LteCbrsStatusWsCell2AssignedTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cell2AssignedTxPower");
    private final static QName _LteCbrsStatusWsGrant2ExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Grant2ExpiryTime");
    private final static QName _LteCbrsStatusWsGrant2TransmissionExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Grant2TransmissionExpiryTime");
    private final static QName _LteCbrsStatusWsCarrierAggregationMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "CarrierAggregationMode");
    private final static QName _LteCbrsStatusWsMeasurementBandwidthKhz_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasurementBandwidthKhz");
    private final static QName _EnbUtraNeighbourStatusWsNbDBID_QNAME = new QName("http://Airspan.Netspan.WebServices", "NbDBID");
    private final static QName _EnbUtraNeighbourStatusWsFrameDuplex_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameDuplex");
    private final static QName _EnbUtraNeighbourStatusWsArfcnBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "ArfcnBand");
    private final static QName _EnbUtraNeighbourStatusWsRncId_QNAME = new QName("http://Airspan.Netspan.WebServices", "RncId");
    private final static QName _EnbUtraNeighbourStatusWsLac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Lac");
    private final static QName _EnbUtraNeighbourStatusWsRac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rac");
    private final static QName _EnbUtraNeighbourStatusWsArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Arfcn");
    private final static QName _EnbUtraNeighbourStatusWsCsgId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsgId");
    private final static QName _EnbUtraNeighbourStatusWsHoCtrlState_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoCtrlState");
    private final static QName _LteNetworkElementStatusWsVlan_QNAME = new QName("http://Airspan.Netspan.WebServices", "Vlan");
    private final static QName _LteNetworkElementStatusWsMmeOverloadStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadStatus");
    private final static QName _LteNetworkElementStatusWsMmeOverloadResponse_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadResponse");
    private final static QName _RelayEnbWifiStatusWsStatusInformation_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatusInformation");
    private final static QName _RelayEnbWifiStatusWsRadioStatus2Dot4GHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioStatus2Dot4GHz");
    private final static QName _RelayEnbWifiStatusWsRadioStatus5GHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioStatus5GHz");
    private final static QName _RelayEnbWifiStatusWsActiveChannel2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannel2Dot4");
    private final static QName _RelayEnbWifiStatusWsActiveChannelBandwidth2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelBandwidth2Dot4");
    private final static QName _RelayEnbWifiStatusWsActiveChannelTxPower2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelTxPower2Dot4");
    private final static QName _RelayEnbWifiStatusWsActiveChannel5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannel5");
    private final static QName _RelayEnbWifiStatusWsActiveChannelBandwidth5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelBandwidth5");
    private final static QName _RelayEnbWifiStatusWsActiveChannelTxPower5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelTxPower5");
    private final static QName _RelayEnbWifiStatusWsWorstSeverityAlarm_QNAME = new QName("http://Airspan.Netspan.WebServices", "WorstSeverityAlarm");
    private final static QName _RelayEnbWifiStatusWsManagementVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementVlanId");
    private final static QName _SwStatusWsLastReadFromNode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastReadFromNode");
    private final static QName _LteBackhaulWsEthernetDuplex_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetDuplex");
    private final static QName _LteBackhaulWsEthernetRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetRate");
    private final static QName _LteBackhaulWsPortType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortType");
    private final static QName _LteBackhaulWsPortStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortStatus");
    private final static QName _LteBackhaulWsPortSpeed_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortSpeed");
    private final static QName _LteBackhaulWsFlowControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "FlowControlStatus");
    private final static QName _LteIpThroughputQciWsQci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci");
    private final static QName _LteIpThroughputQciWsActiveUeDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveUeDl");
    private final static QName _LteIpThroughputQciWsActiveUeUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveUeUl");
    private final static QName _LteIpThroughputQciWsIpThroughputKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpThroughputKbpsDl");
    private final static QName _LteIpThroughputQciWsIpThroughputKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpThroughputKbpsUl");
    private final static QName _LteIpThroughputQciWsPdcpTrafficKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsDl");
    private final static QName _LteIpThroughputQciWsPdcpTrafficKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsUl");
    private final static QName _LteIpThroughputQciWsMacTrafficKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacTrafficKbpsDl");
    private final static QName _LteIpThroughputQciWsMacTrafficKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacTrafficKbpsUl");
    private final static QName _LteIpThroughputQciWsCaAvgThroughputKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaAvgThroughputKbpsDl");
    private final static QName _LteIpThroughputQciWsCaAvgThroughputKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaAvgThroughputKbpsUl");
    private final static QName _LteIpThroughputQciWsRlcTrafficKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "RlcTrafficKbpsDl");
    private final static QName _LteIpThroughputQciWsRlcTrafficKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "RlcTrafficKbpsUl");
    private final static QName _LteUeCategoryCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "Category");
    private final static QName _LteUeCategoryConnectedUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUes");
    private final static QName _LteUeCategoryConnectedUesDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesDl");
    private final static QName _LteUeCategoryConnectedUesUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesUl");
    private final static QName _LteUeStatusWsActualMaxUeSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActualMaxUeSupported");
    private final static QName _LteUeStatusWsConnectedUesTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesTotal");
    private final static QName _LteUeStatusWsCaPCellMacDataVolumeMbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPCellMacDataVolumeMbpsDl");
    private final static QName _LteUeStatusWsCaPCellMacDataVolumeMbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPCellMacDataVolumeMbpsUl");
    private final static QName _LteUeStatusWsCaSCellMacDataVolumeMbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaSCellMacDataVolumeMbpsDl");
    private final static QName _LteUeStatusWsCaSCellMacDataVolumeMbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaSCellMacDataVolumeMbpsUl");
    private final static QName _LteUeStatusWsRttsUeNumInService_QNAME = new QName("http://Airspan.Netspan.WebServices", "RttsUeNumInService");
    private final static QName _LteUeStatusWsRttsUeNumConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "RttsUeNumConfigured");
    private final static QName _LteSonMcimsWsMcimEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "McimEnabled");
    private final static QName _LteSonMcimsWsMroEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MroEnabled");
    private final static QName _LteSonMcimsWsMlbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MlbEnabled");
    private final static QName _LteSonMcimsWsDlTxEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlTxEnabled");
    private final static QName _LteSonMcimsWsDlTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlTxPower");
    private final static QName _LteDicicUnmanagedInterferenceStatusWsAverageRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "AverageRsrp");
    private final static QName _LteDicicStatusWsNumberOfCellEdgeRbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfCellEdgeRbs");
    private final static QName _LteDicicStatusWsRbgMapping_QNAME = new QName("http://Airspan.Netspan.WebServices", "RbgMapping");
    private final static QName _LteDicicStatusWsNumberOfCeu_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfCeu");
    private final static QName _LteDicicStatusWsNumberOfCcu_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfCcu");
    private final static QName _LteDicicStatusWsCeuRbUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "CeuRbUsage");
    private final static QName _LteDicicStatusWsCcuRbUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "CcuRbUsage");
    private final static QName _LteDicicStatusWsMinCeuThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinCeuThreshold");
    private final static QName _LteDicicStatusWsMaxCeuThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxCeuThreshold");
    private final static QName _LteDicicStatusWsEffectiveCeuThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "EffectiveCeuThreshold");
    private final static QName _LteRachStatusWsPrachRootSeqIdx_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRootSeqIdx");
    private final static QName _LteRachStatusWsPrachZeroCorrelZoneCfg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachZeroCorrelZoneCfg");
    private final static QName _LteRachStatusWsPrachCfgIdx_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachCfgIdx");
    private final static QName _LteRachStatusWsPrachFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachFreqOffset");
    private final static QName _LteRachStatusWsNumberOfRaPreambles_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreambles");
    private final static QName _LteRachStatusWsSizeOfPreambleGroupA_QNAME = new QName("http://Airspan.Netspan.WebServices", "SizeOfPreambleGroupA");
    private final static QName _LteRachStatusWsPreambleInitialTargetPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialTargetPower");
    private final static QName _LteAnrStatusWsEnbType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbType");
    private final static QName _LteAnrStatusWsCellIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity");
    private final static QName _LteAnrStatusWsDownlinkEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkEarfcn");
    private final static QName _LteAnrStatusWsHoControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoControlStatus");
    private final static QName _LteAnrStatusWsX2ControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2ControlStatus");
    private final static QName _LteAnrStatusWsHandoverType_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverType");
    private final static QName _LteAnrStatusWsDiscoveredBy_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiscoveredBy");
    private final static QName _LteAnrStatusWsIsStaticNeighbour_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStaticNeighbour");
    private final static QName _LteAnrStatusWsHoSuccessRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoSuccessRate");
    private final static QName _LteAnrStatusWsPi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pi");
    private final static QName _LteAnrStatusWsQOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "QOffset");
    private final static QName _LteAnrStatusWsActiveQOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveQOffset");
    private final static QName _LteAnrStatusWsCellIndividualOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIndividualOffset");
    private final static QName _LteAnrStatusWsActiveCellIndividualOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveCellIndividualOffset");
    private final static QName _LteAnrStatusWsPrachRsi_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRsi");
    private final static QName _LteAnrStatusWsPrachRsi0CorelZoneConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRsi0CorelZoneConfig");
    private final static QName _LteAnrStatusWsPrachCfgIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachCfgIndex");
    private final static QName _LteAnrStatusWsCommsStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "CommsStatus");
    private final static QName _LteAnrStatusWsCellStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellStatus");
    private final static QName _LteAnrStatusWsAvgRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "AvgRsrp");
    private final static QName _LteAnrStatusWsInterferingNeighbor_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterferingNeighbor");
    private final static QName _DynamicAcBarringStatusWsDynamicAcBarringCongestionIndicator_QNAME = new QName("http://Airspan.Netspan.WebServices", "DynamicAcBarringCongestionIndicator");
    private final static QName _DynamicAcBarringStatusWsDynamicAcBarringCongestionLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "DynamicAcBarringCongestionLevel");
    private final static QName _DynamicAcBarringStatusWsDynamicAcBarringCongestionDuration_QNAME = new QName("http://Airspan.Netspan.WebServices", "DynamicAcBarringCongestionDuration");
    private final static QName _LteTpmStatusWsIntraFreqHoTooLateGoodCoverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqHoTooLateGoodCoverage");
    private final static QName _LteTpmStatusWsIntraFreqHoTooLateGoodCoverageUnprepCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqHoTooLateGoodCoverageUnprepCell");
    private final static QName _LteTpmStatusWsIntraFreqHoTooLatePoorCoverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqHoTooLatePoorCoverage");
    private final static QName _LteTpmStatusWsOutgoingCoverageInterFreqHoAttempts_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutgoingCoverageInterFreqHoAttempts");
    private final static QName _LteTpmStatusWsPowerAdjustment_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerAdjustment");
    private final static QName _LteTpmStatusWsPassiveMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PassiveMode");
    private final static QName _LteTpmStatusWsWasEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WasEnabled");
    private final static QName _LteTpmStatusWsMoCycleDuration_QNAME = new QName("http://Airspan.Netspan.WebServices", "MoCycleDuration");
    private final static QName _LteTpmStatusWsLongDormancyTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LongDormancyTime");
    private final static QName _LteTpmStatusWsCountTpMoCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "CountTpMoCalls");
    private final static QName _LteTpmStatusWsCoverageFailureRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "CoverageFailureRate");
    private final static QName _LteTpmStatusWsMobilityFailureRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "MobilityFailureRate");
    private final static QName _LteTpmStatusWsDormancyTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DormancyTime");
    private final static QName _LteTpmStatusWsConsecutiveHighFailureRateCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConsecutiveHighFailureRateCount");
    private final static QName _LteTpmStatusWsIntraFreqHoEarly_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqHoEarly");
    private final static QName _LteTpmStatusWsIntraHoWrongCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraHoWrongCell");
    private final static QName _LteTpmStatusWsIntraFreqOutHoAttempt_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqOutHoAttempt");
    private final static QName _LteTpmStatusWsTargetPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetPower");
    private final static QName _LteTpmStatusWsPTxInusePrevious_QNAME = new QName("http://Airspan.Netspan.WebServices", "PTxInusePrevious");
    private final static QName _LteTpmStatusWsTxPowerDecidedByTpmMo_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPowerDecidedByTpmMo");
    private final static QName _LteTpmStatusWsReEstabSameCellPoorCoverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReEstabSameCellPoorCoverage");
    private final static QName _LtePciStatusWsTacSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "TacSource");
    private final static QName _CellAcBarringStatusWsCellBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellBarred");
    private final static QName _CellAcBarringStatusWsFactorVoiceR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "FactorVoiceR9");
    private final static QName _CellAcBarringStatusWsTimeVoiceR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeVoiceR9");
    private final static QName _CellAcBarringStatusWsSpecialAcVoiceR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpecialAcVoiceR9");
    private final static QName _CellAcBarringStatusWsFactorVideoR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "FactorVideoR9");
    private final static QName _CellAcBarringStatusWsTimeVideoR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeVideoR9");
    private final static QName _CellAcBarringStatusWsSpecialAcVideoR9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpecialAcVideoR9");
    private final static QName _CellAcBarringStatusWsFactorCsfbR10_QNAME = new QName("http://Airspan.Netspan.WebServices", "FactorCsfbR10");
    private final static QName _CellAcBarringStatusWsTimeCsfbR10_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeCsfbR10");
    private final static QName _CellAcBarringStatusWsSpecialAcCsfbR10_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpecialAcCsfbR10");
    private final static QName _CellAcBarringStatusWsEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Emergency");
    private final static QName _CellAcBarringStatusWsFactorSig_QNAME = new QName("http://Airspan.Netspan.WebServices", "FactorSig");
    private final static QName _CellAcBarringStatusWsTimeSig_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeSig");
    private final static QName _CellAcBarringStatusWsSpecialAcSig_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpecialAcSig");
    private final static QName _CellAcBarringStatusWsFactorDat_QNAME = new QName("http://Airspan.Netspan.WebServices", "FactorDat");
    private final static QName _CellAcBarringStatusWsTimeDat_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeDat");
    private final static QName _CellAcBarringStatusWsSpecialAcDat_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpecialAcDat");
    private final static QName _CellAcBarringStatusWsVoiceR9Pres_QNAME = new QName("http://Airspan.Netspan.WebServices", "VoiceR9Pres");
    private final static QName _CellAcBarringStatusWsVideoR9Pres_QNAME = new QName("http://Airspan.Netspan.WebServices", "VideoR9Pres");
    private final static QName _CellAcBarringStatusWsCsfbR10BarringnPres_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbR10BarringnPres");
    private final static QName _CellAcBarringStatusWsInfoSigPres_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoSigPres");
    private final static QName _CellAcBarringStatusWsInfoDatPres_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoDatPres");
    private final static QName _CellAcBarringStatusWsInfoSigVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoSigVal");
    private final static QName _CellAcBarringStatusWsInfoDatVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoDatVal");
    private final static QName _CellAcBarringStatusWsInfoVoiceVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoVoiceVal");
    private final static QName _CellAcBarringStatusWsInfoVideoVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoVideoVal");
    private final static QName _CellAcBarringStatusWsInfoCsfbVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "InfoCsfbVal");
    private final static QName _PtpStatusHoldExpiredTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoldExpiredTime");
    private final static QName _SynchronizationSourceSyncState_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncState");
    private final static QName _SynchronizationSourceHoldoverExpiredTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoldoverExpiredTime");
    private final static QName _SynchronizationStatusTxEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxEnable");
    private final static QName _SynchronizationStatusEnableExtPps_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableExtPps");
    private final static QName _SynchronizationStatusSwitchRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwitchRate");
    private final static QName _SynchronizationStatusLastSwitchTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastSwitchTime");
    private final static QName _SynchronizationStatusDeNodeBClock_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeNodeBClock");
    private final static QName _GpsStatusGpsComms_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsComms");
    private final static QName _GpsStatusGpsLock_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLock");
    private final static QName _GpsStatusGpsSnr_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsSnr");
    private final static QName _GpsStatusLocationAccuracy_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationAccuracy");
    private final static QName _GpsStatusPnpRefLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpRefLongitude");
    private final static QName _GpsStatusPnpRefLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpRefLatitude");
    private final static QName _GpsStatusPnpRefLocationAccuracy_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpRefLocationAccuracy");
    private final static QName _NodeTimeStatusGetResultSystemUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SystemUptime");
    private final static QName _NodeTimeStatusGetResultNodeTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeTime");
    private final static QName _LteSonAnrGetResultIsAnrEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAnrEnabled");
    private final static QName _LteAirSonOptimizationStatusGetResultAirSonOptimizationMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AirSonOptimizationMode");
    private final static QName _LteAirSonOptimizationStatusGetResultTpmMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "TpmMode");
    private final static QName _LteSonTpmGetResultTpmStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "TpmStatus");
    private final static QName _LteSonPciGetResultPciStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_17_5.Status
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NodeTemperatureGet }
     * 
     */
    public NodeTemperatureGet createNodeTemperatureGet() {
        return new NodeTemperatureGet();
    }

    /**
     * Create an instance of {@link NodeTemperatureGetResponse }
     * 
     */
    public NodeTemperatureGetResponse createNodeTemperatureGetResponse() {
        return new NodeTemperatureGetResponse();
    }

    /**
     * Create an instance of {@link NodeSensorGetResult }
     * 
     */
    public NodeSensorGetResult createNodeSensorGetResult() {
        return new NodeSensorGetResult();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link NodeVoltageGet }
     * 
     */
    public NodeVoltageGet createNodeVoltageGet() {
        return new NodeVoltageGet();
    }

    /**
     * Create an instance of {@link NodeVoltageGetResponse }
     * 
     */
    public NodeVoltageGetResponse createNodeVoltageGetResponse() {
        return new NodeVoltageGetResponse();
    }

    /**
     * Create an instance of {@link NodePowerGet }
     * 
     */
    public NodePowerGet createNodePowerGet() {
        return new NodePowerGet();
    }

    /**
     * Create an instance of {@link NodePowerGetResponse }
     * 
     */
    public NodePowerGetResponse createNodePowerGetResponse() {
        return new NodePowerGetResponse();
    }

    /**
     * Create an instance of {@link NodeCurrentGet }
     * 
     */
    public NodeCurrentGet createNodeCurrentGet() {
        return new NodeCurrentGet();
    }

    /**
     * Create an instance of {@link NodeCurrentGetResponse }
     * 
     */
    public NodeCurrentGetResponse createNodeCurrentGetResponse() {
        return new NodeCurrentGetResponse();
    }

    /**
     * Create an instance of {@link NodeBatteryGet }
     * 
     */
    public NodeBatteryGet createNodeBatteryGet() {
        return new NodeBatteryGet();
    }

    /**
     * Create an instance of {@link NodeBatteryGetResponse }
     * 
     */
    public NodeBatteryGetResponse createNodeBatteryGetResponse() {
        return new NodeBatteryGetResponse();
    }

    /**
     * Create an instance of {@link NodeGpsGet }
     * 
     */
    public NodeGpsGet createNodeGpsGet() {
        return new NodeGpsGet();
    }

    /**
     * Create an instance of {@link NodeGpsGetResponse }
     * 
     */
    public NodeGpsGetResponse createNodeGpsGetResponse() {
        return new NodeGpsGetResponse();
    }

    /**
     * Create an instance of {@link NodeGpsGetResult }
     * 
     */
    public NodeGpsGetResult createNodeGpsGetResult() {
        return new NodeGpsGetResult();
    }

    /**
     * Create an instance of {@link IBridge2NodeGpsGet }
     * 
     */
    public IBridge2NodeGpsGet createIBridge2NodeGpsGet() {
        return new IBridge2NodeGpsGet();
    }

    /**
     * Create an instance of {@link IBridge2NodeGpsGetResponse }
     * 
     */
    public IBridge2NodeGpsGetResponse createIBridge2NodeGpsGetResponse() {
        return new IBridge2NodeGpsGetResponse();
    }

    /**
     * Create an instance of {@link Ibridge2GpsGetResult }
     * 
     */
    public Ibridge2GpsGetResult createIbridge2GpsGetResult() {
        return new Ibridge2GpsGetResult();
    }

    /**
     * Create an instance of {@link NodePtpGet }
     * 
     */
    public NodePtpGet createNodePtpGet() {
        return new NodePtpGet();
    }

    /**
     * Create an instance of {@link NodePtpGetResponse }
     * 
     */
    public NodePtpGetResponse createNodePtpGetResponse() {
        return new NodePtpGetResponse();
    }

    /**
     * Create an instance of {@link NodePtpGetResult }
     * 
     */
    public NodePtpGetResult createNodePtpGetResult() {
        return new NodePtpGetResult();
    }

    /**
     * Create an instance of {@link EnbRfStatusGet }
     * 
     */
    public EnbRfStatusGet createEnbRfStatusGet() {
        return new EnbRfStatusGet();
    }

    /**
     * Create an instance of {@link EnbRfStatusGetResponse }
     * 
     */
    public EnbRfStatusGetResponse createEnbRfStatusGetResponse() {
        return new EnbRfStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteRfGetResult }
     * 
     */
    public LteRfGetResult createLteRfGetResult() {
        return new LteRfGetResult();
    }

    /**
     * Create an instance of {@link EnbCellAcBarringStatusGet }
     * 
     */
    public EnbCellAcBarringStatusGet createEnbCellAcBarringStatusGet() {
        return new EnbCellAcBarringStatusGet();
    }

    /**
     * Create an instance of {@link EnbCellAcBarringStatusGetResponse }
     * 
     */
    public EnbCellAcBarringStatusGetResponse createEnbCellAcBarringStatusGetResponse() {
        return new EnbCellAcBarringStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteCellAcBarringGetResult }
     * 
     */
    public LteCellAcBarringGetResult createLteCellAcBarringGetResult() {
        return new LteCellAcBarringGetResult();
    }

    /**
     * Create an instance of {@link EnbSonPciStatusGet }
     * 
     */
    public EnbSonPciStatusGet createEnbSonPciStatusGet() {
        return new EnbSonPciStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonPciStatusGetResponse }
     * 
     */
    public EnbSonPciStatusGetResponse createEnbSonPciStatusGetResponse() {
        return new EnbSonPciStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonPciGetResult }
     * 
     */
    public LteSonPciGetResult createLteSonPciGetResult() {
        return new LteSonPciGetResult();
    }

    /**
     * Create an instance of {@link EnbSonTpmStatusGet }
     * 
     */
    public EnbSonTpmStatusGet createEnbSonTpmStatusGet() {
        return new EnbSonTpmStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonTpmStatusGetResponse }
     * 
     */
    public EnbSonTpmStatusGetResponse createEnbSonTpmStatusGetResponse() {
        return new EnbSonTpmStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonTpmGetResult }
     * 
     */
    public LteSonTpmGetResult createLteSonTpmGetResult() {
        return new LteSonTpmGetResult();
    }

    /**
     * Create an instance of {@link EnbAirSonOptimizationStatusGet }
     * 
     */
    public EnbAirSonOptimizationStatusGet createEnbAirSonOptimizationStatusGet() {
        return new EnbAirSonOptimizationStatusGet();
    }

    /**
     * Create an instance of {@link EnbAirSonOptimizationStatusGetResponse }
     * 
     */
    public EnbAirSonOptimizationStatusGetResponse createEnbAirSonOptimizationStatusGetResponse() {
        return new EnbAirSonOptimizationStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteAirSonOptimizationStatusGetResult }
     * 
     */
    public LteAirSonOptimizationStatusGetResult createLteAirSonOptimizationStatusGetResult() {
        return new LteAirSonOptimizationStatusGetResult();
    }

    /**
     * Create an instance of {@link EnbSonAnrStatusGet }
     * 
     */
    public EnbSonAnrStatusGet createEnbSonAnrStatusGet() {
        return new EnbSonAnrStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonAnrStatusGetResponse }
     * 
     */
    public EnbSonAnrStatusGetResponse createEnbSonAnrStatusGetResponse() {
        return new EnbSonAnrStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonAnrGetResult }
     * 
     */
    public LteSonAnrGetResult createLteSonAnrGetResult() {
        return new LteSonAnrGetResult();
    }

    /**
     * Create an instance of {@link EnbSonRsiStatusGet }
     * 
     */
    public EnbSonRsiStatusGet createEnbSonRsiStatusGet() {
        return new EnbSonRsiStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonRsiStatusGetResponse }
     * 
     */
    public EnbSonRsiStatusGetResponse createEnbSonRsiStatusGetResponse() {
        return new EnbSonRsiStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonRsiGetResult }
     * 
     */
    public LteSonRsiGetResult createLteSonRsiGetResult() {
        return new LteSonRsiGetResult();
    }

    /**
     * Create an instance of {@link EnbSonRachStatusGet }
     * 
     */
    public EnbSonRachStatusGet createEnbSonRachStatusGet() {
        return new EnbSonRachStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonRachStatusGetResponse }
     * 
     */
    public EnbSonRachStatusGetResponse createEnbSonRachStatusGetResponse() {
        return new EnbSonRachStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonRachGetResult }
     * 
     */
    public LteSonRachGetResult createLteSonRachGetResult() {
        return new LteSonRachGetResult();
    }

    /**
     * Create an instance of {@link EnbSonDynamicIcicStatusGet }
     * 
     */
    public EnbSonDynamicIcicStatusGet createEnbSonDynamicIcicStatusGet() {
        return new EnbSonDynamicIcicStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonDynamicIcicStatusGetResponse }
     * 
     */
    public EnbSonDynamicIcicStatusGetResponse createEnbSonDynamicIcicStatusGetResponse() {
        return new EnbSonDynamicIcicStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonDynamicIcicGetResult }
     * 
     */
    public LteSonDynamicIcicGetResult createLteSonDynamicIcicGetResult() {
        return new LteSonDynamicIcicGetResult();
    }

    /**
     * Create an instance of {@link EnbSonDynamicIcicUnmanagedInterferenceStatusGet }
     * 
     */
    public EnbSonDynamicIcicUnmanagedInterferenceStatusGet createEnbSonDynamicIcicUnmanagedInterferenceStatusGet() {
        return new EnbSonDynamicIcicUnmanagedInterferenceStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse }
     * 
     */
    public EnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse createEnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse() {
        return new EnbSonDynamicIcicUnmanagedInterferenceStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonDynamicIcicUnmanagedInterferenceGetResult }
     * 
     */
    public LteSonDynamicIcicUnmanagedInterferenceGetResult createLteSonDynamicIcicUnmanagedInterferenceGetResult() {
        return new LteSonDynamicIcicUnmanagedInterferenceGetResult();
    }

    /**
     * Create an instance of {@link EnbCSonStatusGet }
     * 
     */
    public EnbCSonStatusGet createEnbCSonStatusGet() {
        return new EnbCSonStatusGet();
    }

    /**
     * Create an instance of {@link EnbCSonStatusGetResponse }
     * 
     */
    public EnbCSonStatusGetResponse createEnbCSonStatusGetResponse() {
        return new EnbCSonStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSonMcimGetResult }
     * 
     */
    public LteSonMcimGetResult createLteSonMcimGetResult() {
        return new LteSonMcimGetResult();
    }

    /**
     * Create an instance of {@link EnbConnectedUeStatusGet }
     * 
     */
    public EnbConnectedUeStatusGet createEnbConnectedUeStatusGet() {
        return new EnbConnectedUeStatusGet();
    }

    /**
     * Create an instance of {@link EnbConnectedUeStatusGetResponse }
     * 
     */
    public EnbConnectedUeStatusGetResponse createEnbConnectedUeStatusGetResponse() {
        return new EnbConnectedUeStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteUeGetResult }
     * 
     */
    public LteUeGetResult createLteUeGetResult() {
        return new LteUeGetResult();
    }

    /**
     * Create an instance of {@link EnbIpThroughputStatusGet }
     * 
     */
    public EnbIpThroughputStatusGet createEnbIpThroughputStatusGet() {
        return new EnbIpThroughputStatusGet();
    }

    /**
     * Create an instance of {@link EnbIpThroughputStatusGetResponse }
     * 
     */
    public EnbIpThroughputStatusGetResponse createEnbIpThroughputStatusGetResponse() {
        return new EnbIpThroughputStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteIpThroughputGetResult }
     * 
     */
    public LteIpThroughputGetResult createLteIpThroughputGetResult() {
        return new LteIpThroughputGetResult();
    }

    /**
     * Create an instance of {@link EnbBackhaulInterfaceStatusGet }
     * 
     */
    public EnbBackhaulInterfaceStatusGet createEnbBackhaulInterfaceStatusGet() {
        return new EnbBackhaulInterfaceStatusGet();
    }

    /**
     * Create an instance of {@link EnbBackhaulInterfaceStatusGetResponse }
     * 
     */
    public EnbBackhaulInterfaceStatusGetResponse createEnbBackhaulInterfaceStatusGetResponse() {
        return new EnbBackhaulInterfaceStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteBackhaulIfGetResult }
     * 
     */
    public LteBackhaulIfGetResult createLteBackhaulIfGetResult() {
        return new LteBackhaulIfGetResult();
    }

    /**
     * Create an instance of {@link NodeSoftwareStatusGet }
     * 
     */
    public NodeSoftwareStatusGet createNodeSoftwareStatusGet() {
        return new NodeSoftwareStatusGet();
    }

    /**
     * Create an instance of {@link NodeSoftwareStatusGetResponse }
     * 
     */
    public NodeSoftwareStatusGetResponse createNodeSoftwareStatusGetResponse() {
        return new NodeSoftwareStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeSoftwareGetResult }
     * 
     */
    public NodeSoftwareGetResult createNodeSoftwareGetResult() {
        return new NodeSoftwareGetResult();
    }

    /**
     * Create an instance of {@link EnbEmbmsStatusGet }
     * 
     */
    public EnbEmbmsStatusGet createEnbEmbmsStatusGet() {
        return new EnbEmbmsStatusGet();
    }

    /**
     * Create an instance of {@link EnbEmbmsStatusGetResponse }
     * 
     */
    public EnbEmbmsStatusGetResponse createEnbEmbmsStatusGetResponse() {
        return new EnbEmbmsStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeEmbmsGetResult }
     * 
     */
    public NodeEmbmsGetResult createNodeEmbmsGetResult() {
        return new NodeEmbmsGetResult();
    }

    /**
     * Create an instance of {@link EnbWifiStatusGet }
     * 
     */
    public EnbWifiStatusGet createEnbWifiStatusGet() {
        return new EnbWifiStatusGet();
    }

    /**
     * Create an instance of {@link EnbWifiStatusGetResponse }
     * 
     */
    public EnbWifiStatusGetResponse createEnbWifiStatusGetResponse() {
        return new EnbWifiStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteWifiGetResult }
     * 
     */
    public LteWifiGetResult createLteWifiGetResult() {
        return new LteWifiGetResult();
    }

    /**
     * Create an instance of {@link RelayEnbWifiStatusGet }
     * 
     */
    public RelayEnbWifiStatusGet createRelayEnbWifiStatusGet() {
        return new RelayEnbWifiStatusGet();
    }

    /**
     * Create an instance of {@link RelayEnbWifiStatusGetResponse }
     * 
     */
    public RelayEnbWifiStatusGetResponse createRelayEnbWifiStatusGetResponse() {
        return new RelayEnbWifiStatusGetResponse();
    }

    /**
     * Create an instance of {@link RelayEnbWifiGetResult }
     * 
     */
    public RelayEnbWifiGetResult createRelayEnbWifiGetResult() {
        return new RelayEnbWifiGetResult();
    }

    /**
     * Create an instance of {@link EnbNetworkElementStatusGet }
     * 
     */
    public EnbNetworkElementStatusGet createEnbNetworkElementStatusGet() {
        return new EnbNetworkElementStatusGet();
    }

    /**
     * Create an instance of {@link EnbNetworkElementStatusGetResponse }
     * 
     */
    public EnbNetworkElementStatusGetResponse createEnbNetworkElementStatusGetResponse() {
        return new EnbNetworkElementStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteNetworkElementGetResult }
     * 
     */
    public LteNetworkElementGetResult createLteNetworkElementGetResult() {
        return new LteNetworkElementGetResult();
    }

    /**
     * Create an instance of {@link EnbUtraNeighbourStatusGet }
     * 
     */
    public EnbUtraNeighbourStatusGet createEnbUtraNeighbourStatusGet() {
        return new EnbUtraNeighbourStatusGet();
    }

    /**
     * Create an instance of {@link EnbUtraNeighbourStatusGetResponse }
     * 
     */
    public EnbUtraNeighbourStatusGetResponse createEnbUtraNeighbourStatusGetResponse() {
        return new EnbUtraNeighbourStatusGetResponse();
    }

    /**
     * Create an instance of {@link EnbUtraNeighbourStatusGetResult }
     * 
     */
    public EnbUtraNeighbourStatusGetResult createEnbUtraNeighbourStatusGetResult() {
        return new EnbUtraNeighbourStatusGetResult();
    }

    /**
     * Create an instance of {@link EnbCachedUtraNeighbourStatusGet }
     * 
     */
    public EnbCachedUtraNeighbourStatusGet createEnbCachedUtraNeighbourStatusGet() {
        return new EnbCachedUtraNeighbourStatusGet();
    }

    /**
     * Create an instance of {@link EnbCachedUtraNeighbourStatusGetResponse }
     * 
     */
    public EnbCachedUtraNeighbourStatusGetResponse createEnbCachedUtraNeighbourStatusGetResponse() {
        return new EnbCachedUtraNeighbourStatusGetResponse();
    }

    /**
     * Create an instance of {@link EnbCbrsStatusGet }
     * 
     */
    public EnbCbrsStatusGet createEnbCbrsStatusGet() {
        return new EnbCbrsStatusGet();
    }

    /**
     * Create an instance of {@link EnbCbrsStatusGetResponse }
     * 
     */
    public EnbCbrsStatusGetResponse createEnbCbrsStatusGetResponse() {
        return new EnbCbrsStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteCbrsGetResult }
     * 
     */
    public LteCbrsGetResult createLteCbrsGetResult() {
        return new LteCbrsGetResult();
    }

    /**
     * Create an instance of {@link EnbBhQosStatusGet }
     * 
     */
    public EnbBhQosStatusGet createEnbBhQosStatusGet() {
        return new EnbBhQosStatusGet();
    }

    /**
     * Create an instance of {@link EnbBhQosStatusGetResponse }
     * 
     */
    public EnbBhQosStatusGetResponse createEnbBhQosStatusGetResponse() {
        return new EnbBhQosStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteBhQosGetResult }
     * 
     */
    public LteBhQosGetResult createLteBhQosGetResult() {
        return new LteBhQosGetResult();
    }

    /**
     * Create an instance of {@link EnbResetRequiredStatusGet }
     * 
     */
    public EnbResetRequiredStatusGet createEnbResetRequiredStatusGet() {
        return new EnbResetRequiredStatusGet();
    }

    /**
     * Create an instance of {@link EnbResetRequiredStatusGetResponse }
     * 
     */
    public EnbResetRequiredStatusGetResponse createEnbResetRequiredStatusGetResponse() {
        return new EnbResetRequiredStatusGetResponse();
    }

    /**
     * Create an instance of {@link EnbResetRequiredStatusGetResult }
     * 
     */
    public EnbResetRequiredStatusGetResult createEnbResetRequiredStatusGetResult() {
        return new EnbResetRequiredStatusGetResult();
    }

    /**
     * Create an instance of {@link EnbTwampStatusGet }
     * 
     */
    public EnbTwampStatusGet createEnbTwampStatusGet() {
        return new EnbTwampStatusGet();
    }

    /**
     * Create an instance of {@link EnbTwampStatusGetResponse }
     * 
     */
    public EnbTwampStatusGetResponse createEnbTwampStatusGetResponse() {
        return new EnbTwampStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteTwampGetResult }
     * 
     */
    public LteTwampGetResult createLteTwampGetResult() {
        return new LteTwampGetResult();
    }

    /**
     * Create an instance of {@link EnbMaintenanceWindowStatusGet }
     * 
     */
    public EnbMaintenanceWindowStatusGet createEnbMaintenanceWindowStatusGet() {
        return new EnbMaintenanceWindowStatusGet();
    }

    /**
     * Create an instance of {@link EnbMaintenanceWindowStatusGetResponse }
     * 
     */
    public EnbMaintenanceWindowStatusGetResponse createEnbMaintenanceWindowStatusGetResponse() {
        return new EnbMaintenanceWindowStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteMaintenanceWindowGetResult }
     * 
     */
    public LteMaintenanceWindowGetResult createLteMaintenanceWindowGetResult() {
        return new LteMaintenanceWindowGetResult();
    }

    /**
     * Create an instance of {@link EnbEthernetPerPortStatusGet }
     * 
     */
    public EnbEthernetPerPortStatusGet createEnbEthernetPerPortStatusGet() {
        return new EnbEthernetPerPortStatusGet();
    }

    /**
     * Create an instance of {@link EnbEthernetPerPortStatusGetResponse }
     * 
     */
    public EnbEthernetPerPortStatusGetResponse createEnbEthernetPerPortStatusGetResponse() {
        return new EnbEthernetPerPortStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteEthernetPerPortStatusGetResult }
     * 
     */
    public LteEthernetPerPortStatusGetResult createLteEthernetPerPortStatusGetResult() {
        return new LteEthernetPerPortStatusGetResult();
    }

    /**
     * Create an instance of {@link EnbSfpStatusGet }
     * 
     */
    public EnbSfpStatusGet createEnbSfpStatusGet() {
        return new EnbSfpStatusGet();
    }

    /**
     * Create an instance of {@link EnbSfpStatusGetResponse }
     * 
     */
    public EnbSfpStatusGetResponse createEnbSfpStatusGetResponse() {
        return new EnbSfpStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteSfpStatusGetResult }
     * 
     */
    public LteSfpStatusGetResult createLteSfpStatusGetResult() {
        return new LteSfpStatusGetResult();
    }

    /**
     * Create an instance of {@link EnbCachedAnrStatusGet }
     * 
     */
    public EnbCachedAnrStatusGet createEnbCachedAnrStatusGet() {
        return new EnbCachedAnrStatusGet();
    }

    /**
     * Create an instance of {@link EnbCachedAnrStatusGetResponse }
     * 
     */
    public EnbCachedAnrStatusGetResponse createEnbCachedAnrStatusGetResponse() {
        return new EnbCachedAnrStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteCachedAnrListResult }
     * 
     */
    public LteCachedAnrListResult createLteCachedAnrListResult() {
        return new LteCachedAnrListResult();
    }

    /**
     * Create an instance of {@link EnbCachedCellStatusGet }
     * 
     */
    public EnbCachedCellStatusGet createEnbCachedCellStatusGet() {
        return new EnbCachedCellStatusGet();
    }

    /**
     * Create an instance of {@link EnbCachedCellStatusGetResponse }
     * 
     */
    public EnbCachedCellStatusGetResponse createEnbCachedCellStatusGetResponse() {
        return new EnbCachedCellStatusGetResponse();
    }

    /**
     * Create an instance of {@link LteCellStatusCachedListResult }
     * 
     */
    public LteCellStatusCachedListResult createLteCellStatusCachedListResult() {
        return new LteCellStatusCachedListResult();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesGet }
     * 
     */
    public Ib440CommissionedPropertiesGet createIb440CommissionedPropertiesGet() {
        return new Ib440CommissionedPropertiesGet();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesGetResponse }
     * 
     */
    public Ib440CommissionedPropertiesGetResponse createIb440CommissionedPropertiesGetResponse() {
        return new Ib440CommissionedPropertiesGetResponse();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesGetResult }
     * 
     */
    public Ib440CommissionedPropertiesGetResult createIb440CommissionedPropertiesGetResult() {
        return new Ib440CommissionedPropertiesGetResult();
    }

    /**
     * Create an instance of {@link Ib440RfStatusGet }
     * 
     */
    public Ib440RfStatusGet createIb440RfStatusGet() {
        return new Ib440RfStatusGet();
    }

    /**
     * Create an instance of {@link Ib440RfStatusGetResponse }
     * 
     */
    public Ib440RfStatusGetResponse createIb440RfStatusGetResponse() {
        return new Ib440RfStatusGetResponse();
    }

    /**
     * Create an instance of {@link Ib440RfGetResult }
     * 
     */
    public Ib440RfGetResult createIb440RfGetResult() {
        return new Ib440RfGetResult();
    }

    /**
     * Create an instance of {@link Ib440InterfaceStatusGet }
     * 
     */
    public Ib440InterfaceStatusGet createIb440InterfaceStatusGet() {
        return new Ib440InterfaceStatusGet();
    }

    /**
     * Create an instance of {@link Ib440InterfaceStatusGetResponse }
     * 
     */
    public Ib440InterfaceStatusGetResponse createIb440InterfaceStatusGetResponse() {
        return new Ib440InterfaceStatusGetResponse();
    }

    /**
     * Create an instance of {@link Ib440InterfaceGetResult }
     * 
     */
    public Ib440InterfaceGetResult createIb440InterfaceGetResult() {
        return new Ib440InterfaceGetResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusGet }
     * 
     */
    public IBridgeBaseRfStatusGet createIBridgeBaseRfStatusGet() {
        return new IBridgeBaseRfStatusGet();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusGetResponse }
     * 
     */
    public IBridgeBaseRfStatusGetResponse createIBridgeBaseRfStatusGetResponse() {
        return new IBridgeBaseRfStatusGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfGetResult }
     * 
     */
    public IBridgeBaseRfGetResult createIBridgeBaseRfGetResult() {
        return new IBridgeBaseRfGetResult();
    }

    /**
     * Create an instance of {@link IBridgeTermRfStatusGet }
     * 
     */
    public IBridgeTermRfStatusGet createIBridgeTermRfStatusGet() {
        return new IBridgeTermRfStatusGet();
    }

    /**
     * Create an instance of {@link IBridgeTermRfStatusGetResponse }
     * 
     */
    public IBridgeTermRfStatusGetResponse createIBridgeTermRfStatusGetResponse() {
        return new IBridgeTermRfStatusGetResponse();
    }

    /**
     * Create an instance of {@link IBridgeTermRfGetResult }
     * 
     */
    public IBridgeTermRfGetResult createIBridgeTermRfGetResult() {
        return new IBridgeTermRfGetResult();
    }

    /**
     * Create an instance of {@link IBridge2WebUiStatusGet }
     * 
     */
    public IBridge2WebUiStatusGet createIBridge2WebUiStatusGet() {
        return new IBridge2WebUiStatusGet();
    }

    /**
     * Create an instance of {@link IBridge2WebUiStatusGetResponse }
     * 
     */
    public IBridge2WebUiStatusGetResponse createIBridge2WebUiStatusGetResponse() {
        return new IBridge2WebUiStatusGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2WebUiStatusGetResult }
     * 
     */
    public IBridge2WebUiStatusGetResult createIBridge2WebUiStatusGetResult() {
        return new IBridge2WebUiStatusGetResult();
    }

    /**
     * Create an instance of {@link IBridge2CommissionedPropertiesGet }
     * 
     */
    public IBridge2CommissionedPropertiesGet createIBridge2CommissionedPropertiesGet() {
        return new IBridge2CommissionedPropertiesGet();
    }

    /**
     * Create an instance of {@link IBridge2CommissionedPropertiesGetResponse }
     * 
     */
    public IBridge2CommissionedPropertiesGetResponse createIBridge2CommissionedPropertiesGetResponse() {
        return new IBridge2CommissionedPropertiesGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2CommissionedPropertiesGetResult }
     * 
     */
    public IBridge2CommissionedPropertiesGetResult createIBridge2CommissionedPropertiesGetResult() {
        return new IBridge2CommissionedPropertiesGetResult();
    }

    /**
     * Create an instance of {@link IBridge2ChannelAndPowerStatusGet }
     * 
     */
    public IBridge2ChannelAndPowerStatusGet createIBridge2ChannelAndPowerStatusGet() {
        return new IBridge2ChannelAndPowerStatusGet();
    }

    /**
     * Create an instance of {@link IBridge2ChannelAndPowerStatusGetResponse }
     * 
     */
    public IBridge2ChannelAndPowerStatusGetResponse createIBridge2ChannelAndPowerStatusGetResponse() {
        return new IBridge2ChannelAndPowerStatusGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2ChannelAndPowerStatusGetResult }
     * 
     */
    public IBridge2ChannelAndPowerStatusGetResult createIBridge2ChannelAndPowerStatusGetResult() {
        return new IBridge2ChannelAndPowerStatusGetResult();
    }

    /**
     * Create an instance of {@link IBridge2OverviewStatusGet }
     * 
     */
    public IBridge2OverviewStatusGet createIBridge2OverviewStatusGet() {
        return new IBridge2OverviewStatusGet();
    }

    /**
     * Create an instance of {@link IBridge2OverviewStatusGetResponse }
     * 
     */
    public IBridge2OverviewStatusGetResponse createIBridge2OverviewStatusGetResponse() {
        return new IBridge2OverviewStatusGetResponse();
    }

    /**
     * Create an instance of {@link IBridge2OverviewStatusGetResult }
     * 
     */
    public IBridge2OverviewStatusGetResult createIBridge2OverviewStatusGetResult() {
        return new IBridge2OverviewStatusGetResult();
    }

    /**
     * Create an instance of {@link RelayStatusGet }
     * 
     */
    public RelayStatusGet createRelayStatusGet() {
        return new RelayStatusGet();
    }

    /**
     * Create an instance of {@link RelayStatusGetResponse }
     * 
     */
    public RelayStatusGetResponse createRelayStatusGetResponse() {
        return new RelayStatusGetResponse();
    }

    /**
     * Create an instance of {@link RelayStatusGetResult }
     * 
     */
    public RelayStatusGetResult createRelayStatusGetResult() {
        return new RelayStatusGetResult();
    }

    /**
     * Create an instance of {@link RelayCandidateDonorCellsListGet }
     * 
     */
    public RelayCandidateDonorCellsListGet createRelayCandidateDonorCellsListGet() {
        return new RelayCandidateDonorCellsListGet();
    }

    /**
     * Create an instance of {@link RelayCandidateDonorCellsListGetResponse }
     * 
     */
    public RelayCandidateDonorCellsListGetResponse createRelayCandidateDonorCellsListGetResponse() {
        return new RelayCandidateDonorCellsListGetResponse();
    }

    /**
     * Create an instance of {@link RelayDonorCellListGetResult }
     * 
     */
    public RelayDonorCellListGetResult createRelayDonorCellListGetResult() {
        return new RelayDonorCellListGetResult();
    }

    /**
     * Create an instance of {@link RelayBulkCandidateDonorCellsListGet }
     * 
     */
    public RelayBulkCandidateDonorCellsListGet createRelayBulkCandidateDonorCellsListGet() {
        return new RelayBulkCandidateDonorCellsListGet();
    }

    /**
     * Create an instance of {@link RelayBulkCandidateDonorCellsListGetResponse }
     * 
     */
    public RelayBulkCandidateDonorCellsListGetResponse createRelayBulkCandidateDonorCellsListGetResponse() {
        return new RelayBulkCandidateDonorCellsListGetResponse();
    }

    /**
     * Create an instance of {@link LocationAndSyncStatusGet }
     * 
     */
    public LocationAndSyncStatusGet createLocationAndSyncStatusGet() {
        return new LocationAndSyncStatusGet();
    }

    /**
     * Create an instance of {@link LocationAndSyncStatusGetResponse }
     * 
     */
    public LocationAndSyncStatusGetResponse createLocationAndSyncStatusGetResponse() {
        return new LocationAndSyncStatusGetResponse();
    }

    /**
     * Create an instance of {@link LocationAndSyncStatusResult }
     * 
     */
    public LocationAndSyncStatusResult createLocationAndSyncStatusResult() {
        return new LocationAndSyncStatusResult();
    }

    /**
     * Create an instance of {@link RelayBulkStatusGet }
     * 
     */
    public RelayBulkStatusGet createRelayBulkStatusGet() {
        return new RelayBulkStatusGet();
    }

    /**
     * Create an instance of {@link RelayBulkStatusGetResponse }
     * 
     */
    public RelayBulkStatusGetResponse createRelayBulkStatusGetResponse() {
        return new RelayBulkStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeNlSyncStatusGet }
     * 
     */
    public NodeNlSyncStatusGet createNodeNlSyncStatusGet() {
        return new NodeNlSyncStatusGet();
    }

    /**
     * Create an instance of {@link NodeNlSyncStatusGetResponse }
     * 
     */
    public NodeNlSyncStatusGetResponse createNodeNlSyncStatusGetResponse() {
        return new NodeNlSyncStatusGetResponse();
    }

    /**
     * Create an instance of {@link NodeNLSyncStatusGetResult }
     * 
     */
    public NodeNLSyncStatusGetResult createNodeNLSyncStatusGetResult() {
        return new NodeNLSyncStatusGetResult();
    }

    /**
     * Create an instance of {@link NodeTimeGet }
     * 
     */
    public NodeTimeGet createNodeTimeGet() {
        return new NodeTimeGet();
    }

    /**
     * Create an instance of {@link NodeTimeGetResponse }
     * 
     */
    public NodeTimeGetResponse createNodeTimeGetResponse() {
        return new NodeTimeGetResponse();
    }

    /**
     * Create an instance of {@link NodeTimeStatusGetResult }
     * 
     */
    public NodeTimeStatusGetResult createNodeTimeStatusGetResult() {
        return new NodeTimeStatusGetResult();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link NodeSensorStatusDetails }
     * 
     */
    public NodeSensorStatusDetails createNodeSensorStatusDetails() {
        return new NodeSensorStatusDetails();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link GpsStatus }
     * 
     */
    public GpsStatus createGpsStatus() {
        return new GpsStatus();
    }

    /**
     * Create an instance of {@link SynchronizationStatus }
     * 
     */
    public SynchronizationStatus createSynchronizationStatus() {
        return new SynchronizationStatus();
    }

    /**
     * Create an instance of {@link SynchronizationSource }
     * 
     */
    public SynchronizationSource createSynchronizationSource() {
        return new SynchronizationSource();
    }

    /**
     * Create an instance of {@link Satellite }
     * 
     */
    public Satellite createSatellite() {
        return new Satellite();
    }

    /**
     * Create an instance of {@link Ibridge2GpsStatus }
     * 
     */
    public Ibridge2GpsStatus createIbridge2GpsStatus() {
        return new Ibridge2GpsStatus();
    }

    /**
     * Create an instance of {@link PtpStatus }
     * 
     */
    public PtpStatus createPtpStatus() {
        return new PtpStatus();
    }

    /**
     * Create an instance of {@link LteRfStatusWs }
     * 
     */
    public LteRfStatusWs createLteRfStatusWs() {
        return new LteRfStatusWs();
    }

    /**
     * Create an instance of {@link CellAcBarringStatusWs }
     * 
     */
    public CellAcBarringStatusWs createCellAcBarringStatusWs() {
        return new CellAcBarringStatusWs();
    }

    /**
     * Create an instance of {@link LteRfStatusInfo }
     * 
     */
    public LteRfStatusInfo createLteRfStatusInfo() {
        return new LteRfStatusInfo();
    }

    /**
     * Create an instance of {@link LtePciStatusWs }
     * 
     */
    public LtePciStatusWs createLtePciStatusWs() {
        return new LtePciStatusWs();
    }

    /**
     * Create an instance of {@link LteTpmStatusWs }
     * 
     */
    public LteTpmStatusWs createLteTpmStatusWs() {
        return new LteTpmStatusWs();
    }

    /**
     * Create an instance of {@link LteSonTpmStatusContainer }
     * 
     */
    public LteSonTpmStatusContainer createLteSonTpmStatusContainer() {
        return new LteSonTpmStatusContainer();
    }

    /**
     * Create an instance of {@link DynamicAcBarringStatusContainer }
     * 
     */
    public DynamicAcBarringStatusContainer createDynamicAcBarringStatusContainer() {
        return new DynamicAcBarringStatusContainer();
    }

    /**
     * Create an instance of {@link DynamicAcBarringStatusWs }
     * 
     */
    public DynamicAcBarringStatusWs createDynamicAcBarringStatusWs() {
        return new DynamicAcBarringStatusWs();
    }

    /**
     * Create an instance of {@link LteAnrStatusWs }
     * 
     */
    public LteAnrStatusWs createLteAnrStatusWs() {
        return new LteAnrStatusWs();
    }

    /**
     * Create an instance of {@link LteRsiStatusWs }
     * 
     */
    public LteRsiStatusWs createLteRsiStatusWs() {
        return new LteRsiStatusWs();
    }

    /**
     * Create an instance of {@link LteRachStatusWs }
     * 
     */
    public LteRachStatusWs createLteRachStatusWs() {
        return new LteRachStatusWs();
    }

    /**
     * Create an instance of {@link LteDicicStatusWs }
     * 
     */
    public LteDicicStatusWs createLteDicicStatusWs() {
        return new LteDicicStatusWs();
    }

    /**
     * Create an instance of {@link LteDicicUnmanagedInterferenceStatusWs }
     * 
     */
    public LteDicicUnmanagedInterferenceStatusWs createLteDicicUnmanagedInterferenceStatusWs() {
        return new LteDicicUnmanagedInterferenceStatusWs();
    }

    /**
     * Create an instance of {@link LteSonMcimsWs }
     * 
     */
    public LteSonMcimsWs createLteSonMcimsWs() {
        return new LteSonMcimsWs();
    }

    /**
     * Create an instance of {@link LteUeStatusWs }
     * 
     */
    public LteUeStatusWs createLteUeStatusWs() {
        return new LteUeStatusWs();
    }

    /**
     * Create an instance of {@link LteUeCategory }
     * 
     */
    public LteUeCategory createLteUeCategory() {
        return new LteUeCategory();
    }

    /**
     * Create an instance of {@link LteIpThroughputCellWs }
     * 
     */
    public LteIpThroughputCellWs createLteIpThroughputCellWs() {
        return new LteIpThroughputCellWs();
    }

    /**
     * Create an instance of {@link LteIpThroughputQciWs }
     * 
     */
    public LteIpThroughputQciWs createLteIpThroughputQciWs() {
        return new LteIpThroughputQciWs();
    }

    /**
     * Create an instance of {@link LteBackhaulWs }
     * 
     */
    public LteBackhaulWs createLteBackhaulWs() {
        return new LteBackhaulWs();
    }

    /**
     * Create an instance of {@link ArrayOfSwStatusWs }
     * 
     */
    public ArrayOfSwStatusWs createArrayOfSwStatusWs() {
        return new ArrayOfSwStatusWs();
    }

    /**
     * Create an instance of {@link SwStatusWs }
     * 
     */
    public SwStatusWs createSwStatusWs() {
        return new SwStatusWs();
    }

    /**
     * Create an instance of {@link ArrayOfEmbmsStatusWs }
     * 
     */
    public ArrayOfEmbmsStatusWs createArrayOfEmbmsStatusWs() {
        return new ArrayOfEmbmsStatusWs();
    }

    /**
     * Create an instance of {@link EmbmsStatusWs }
     * 
     */
    public EmbmsStatusWs createEmbmsStatusWs() {
        return new EmbmsStatusWs();
    }

    /**
     * Create an instance of {@link LteWifiStatusWs }
     * 
     */
    public LteWifiStatusWs createLteWifiStatusWs() {
        return new LteWifiStatusWs();
    }

    /**
     * Create an instance of {@link RelayEnbWifiStatusWs }
     * 
     */
    public RelayEnbWifiStatusWs createRelayEnbWifiStatusWs() {
        return new RelayEnbWifiStatusWs();
    }

    /**
     * Create an instance of {@link LteNetworkElementStatusWs }
     * 
     */
    public LteNetworkElementStatusWs createLteNetworkElementStatusWs() {
        return new LteNetworkElementStatusWs();
    }

    /**
     * Create an instance of {@link EnbUtraNeighbourStatusWs }
     * 
     */
    public EnbUtraNeighbourStatusWs createEnbUtraNeighbourStatusWs() {
        return new EnbUtraNeighbourStatusWs();
    }

    /**
     * Create an instance of {@link LteCbrsStatusWs }
     * 
     */
    public LteCbrsStatusWs createLteCbrsStatusWs() {
        return new LteCbrsStatusWs();
    }

    /**
     * Create an instance of {@link ArrayOfLteCbrsMeasReportWs }
     * 
     */
    public ArrayOfLteCbrsMeasReportWs createArrayOfLteCbrsMeasReportWs() {
        return new ArrayOfLteCbrsMeasReportWs();
    }

    /**
     * Create an instance of {@link LteCbrsMeasReportWs }
     * 
     */
    public LteCbrsMeasReportWs createLteCbrsMeasReportWs() {
        return new LteCbrsMeasReportWs();
    }

    /**
     * Create an instance of {@link LteBhQosStatusWs }
     * 
     */
    public LteBhQosStatusWs createLteBhQosStatusWs() {
        return new LteBhQosStatusWs();
    }

    /**
     * Create an instance of {@link LteQosHoRelayQualityWs }
     * 
     */
    public LteQosHoRelayQualityWs createLteQosHoRelayQualityWs() {
        return new LteQosHoRelayQualityWs();
    }

    /**
     * Create an instance of {@link FtpIpAddressStatusWs }
     * 
     */
    public FtpIpAddressStatusWs createFtpIpAddressStatusWs() {
        return new FtpIpAddressStatusWs();
    }

    /**
     * Create an instance of {@link ServerIPAddressListStatusWs }
     * 
     */
    public ServerIPAddressListStatusWs createServerIPAddressListStatusWs() {
        return new ServerIPAddressListStatusWs();
    }

    /**
     * Create an instance of {@link EnbResetRequiredStatusResult }
     * 
     */
    public EnbResetRequiredStatusResult createEnbResetRequiredStatusResult() {
        return new EnbResetRequiredStatusResult();
    }

    /**
     * Create an instance of {@link LteTwampReflectorList }
     * 
     */
    public LteTwampReflectorList createLteTwampReflectorList() {
        return new LteTwampReflectorList();
    }

    /**
     * Create an instance of {@link LteTwampSenderWs }
     * 
     */
    public LteTwampSenderWs createLteTwampSenderWs() {
        return new LteTwampSenderWs();
    }

    /**
     * Create an instance of {@link LteTwampReflectorWs }
     * 
     */
    public LteTwampReflectorWs createLteTwampReflectorWs() {
        return new LteTwampReflectorWs();
    }

    /**
     * Create an instance of {@link LteMaintenanceWindowList }
     * 
     */
    public LteMaintenanceWindowList createLteMaintenanceWindowList() {
        return new LteMaintenanceWindowList();
    }

    /**
     * Create an instance of {@link LteMaintenanceWindowWs }
     * 
     */
    public LteMaintenanceWindowWs createLteMaintenanceWindowWs() {
        return new LteMaintenanceWindowWs();
    }

    /**
     * Create an instance of {@link EthernetPerPortStatusWs }
     * 
     */
    public EthernetPerPortStatusWs createEthernetPerPortStatusWs() {
        return new EthernetPerPortStatusWs();
    }

    /**
     * Create an instance of {@link LteSfpStatusWs }
     * 
     */
    public LteSfpStatusWs createLteSfpStatusWs() {
        return new LteSfpStatusWs();
    }

    /**
     * Create an instance of {@link ArrayOfLteSonAnrGetResult }
     * 
     */
    public ArrayOfLteSonAnrGetResult createArrayOfLteSonAnrGetResult() {
        return new ArrayOfLteSonAnrGetResult();
    }

    /**
     * Create an instance of {@link LteCellStatusCachedGetResult }
     * 
     */
    public LteCellStatusCachedGetResult createLteCellStatusCachedGetResult() {
        return new LteCellStatusCachedGetResult();
    }

    /**
     * Create an instance of {@link LteCellStatusCachedWs }
     * 
     */
    public LteCellStatusCachedWs createLteCellStatusCachedWs() {
        return new LteCellStatusCachedWs();
    }

    /**
     * Create an instance of {@link LteCachedRfStatusWs }
     * 
     */
    public LteCachedRfStatusWs createLteCachedRfStatusWs() {
        return new LteCachedRfStatusWs();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesStatusWs }
     * 
     */
    public Ib440CommissionedPropertiesStatusWs createIb440CommissionedPropertiesStatusWs() {
        return new Ib440CommissionedPropertiesStatusWs();
    }

    /**
     * Create an instance of {@link Ib440RfStatusWs }
     * 
     */
    public Ib440RfStatusWs createIb440RfStatusWs() {
        return new Ib440RfStatusWs();
    }

    /**
     * Create an instance of {@link Ib440InterfaceStatusWs }
     * 
     */
    public Ib440InterfaceStatusWs createIb440InterfaceStatusWs() {
        return new Ib440InterfaceStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusWs }
     * 
     */
    public IBridgeBaseRfStatusWs createIBridgeBaseRfStatusWs() {
        return new IBridgeBaseRfStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeBaseRxNulling }
     * 
     */
    public IBridgeBaseRxNulling createIBridgeBaseRxNulling() {
        return new IBridgeBaseRxNulling();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfPathInfo }
     * 
     */
    public IBridgeBaseRfPathInfo createIBridgeBaseRfPathInfo() {
        return new IBridgeBaseRfPathInfo();
    }

    /**
     * Create an instance of {@link AutoAlignShmResult }
     * 
     */
    public AutoAlignShmResult createAutoAlignShmResult() {
        return new AutoAlignShmResult();
    }

    /**
     * Create an instance of {@link FineAlignShmResult }
     * 
     */
    public FineAlignShmResult createFineAlignShmResult() {
        return new FineAlignShmResult();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusInfo }
     * 
     */
    public IBridgeBaseRfStatusInfo createIBridgeBaseRfStatusInfo() {
        return new IBridgeBaseRfStatusInfo();
    }

    /**
     * Create an instance of {@link IBridgeTermRfStatusWs }
     * 
     */
    public IBridgeTermRfStatusWs createIBridgeTermRfStatusWs() {
        return new IBridgeTermRfStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeTermChannelProfile }
     * 
     */
    public IBridgeTermChannelProfile createIBridgeTermChannelProfile() {
        return new IBridgeTermChannelProfile();
    }

    /**
     * Create an instance of {@link IBridgeTermActiveChannel }
     * 
     */
    public IBridgeTermActiveChannel createIBridgeTermActiveChannel() {
        return new IBridgeTermActiveChannel();
    }

    /**
     * Create an instance of {@link IBridgeTermScannedChannel }
     * 
     */
    public IBridgeTermScannedChannel createIBridgeTermScannedChannel() {
        return new IBridgeTermScannedChannel();
    }

    /**
     * Create an instance of {@link IBridgeTermRxNulling }
     * 
     */
    public IBridgeTermRxNulling createIBridgeTermRxNulling() {
        return new IBridgeTermRxNulling();
    }

    /**
     * Create an instance of {@link IBridgeTermRxNullingStatus }
     * 
     */
    public IBridgeTermRxNullingStatus createIBridgeTermRxNullingStatus() {
        return new IBridgeTermRxNullingStatus();
    }

    /**
     * Create an instance of {@link IBridge2WebUiStatusResult }
     * 
     */
    public IBridge2WebUiStatusResult createIBridge2WebUiStatusResult() {
        return new IBridge2WebUiStatusResult();
    }

    /**
     * Create an instance of {@link IBridge2CommissionedPropertiesWs }
     * 
     */
    public IBridge2CommissionedPropertiesWs createIBridge2CommissionedPropertiesWs() {
        return new IBridge2CommissionedPropertiesWs();
    }

    /**
     * Create an instance of {@link ArrayOfIPv6AddressWs }
     * 
     */
    public ArrayOfIPv6AddressWs createArrayOfIPv6AddressWs() {
        return new ArrayOfIPv6AddressWs();
    }

    /**
     * Create an instance of {@link SignalInfoWs }
     * 
     */
    public SignalInfoWs createSignalInfoWs() {
        return new SignalInfoWs();
    }

    /**
     * Create an instance of {@link BwTestWs }
     * 
     */
    public BwTestWs createBwTestWs() {
        return new BwTestWs();
    }

    /**
     * Create an instance of {@link IPv6AddressWs }
     * 
     */
    public IPv6AddressWs createIPv6AddressWs() {
        return new IPv6AddressWs();
    }

    /**
     * Create an instance of {@link IBridge2ChannelAndPowerStatusWs }
     * 
     */
    public IBridge2ChannelAndPowerStatusWs createIBridge2ChannelAndPowerStatusWs() {
        return new IBridge2ChannelAndPowerStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewTopLevelStatusWs }
     * 
     */
    public IBridge2OverviewTopLevelStatusWs createIBridge2OverviewTopLevelStatusWs() {
        return new IBridge2OverviewTopLevelStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewSignalMeterStatusWs }
     * 
     */
    public IBridge2OverviewSignalMeterStatusWs createIBridge2OverviewSignalMeterStatusWs() {
        return new IBridge2OverviewSignalMeterStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewDeviceDetailsStatusWs }
     * 
     */
    public IBridge2OverviewDeviceDetailsStatusWs createIBridge2OverviewDeviceDetailsStatusWs() {
        return new IBridge2OverviewDeviceDetailsStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewMimoStatusWs }
     * 
     */
    public IBridge2OverviewMimoStatusWs createIBridge2OverviewMimoStatusWs() {
        return new IBridge2OverviewMimoStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewMimoChainStatusWs }
     * 
     */
    public IBridge2OverviewMimoChainStatusWs createIBridge2OverviewMimoChainStatusWs() {
        return new IBridge2OverviewMimoChainStatusWs();
    }

    /**
     * Create an instance of {@link IBridge2OverviewMimoStreamStatusWs }
     * 
     */
    public IBridge2OverviewMimoStreamStatusWs createIBridge2OverviewMimoStreamStatusWs() {
        return new IBridge2OverviewMimoStreamStatusWs();
    }

    /**
     * Create an instance of {@link RelayStatusResult }
     * 
     */
    public RelayStatusResult createRelayStatusResult() {
        return new RelayStatusResult();
    }

    /**
     * Create an instance of {@link RelayStatusWs }
     * 
     */
    public RelayStatusWs createRelayStatusWs() {
        return new RelayStatusWs();
    }

    /**
     * Create an instance of {@link RelayApnList }
     * 
     */
    public RelayApnList createRelayApnList() {
        return new RelayApnList();
    }

    /**
     * Create an instance of {@link RelayConnectedDevicesList }
     * 
     */
    public RelayConnectedDevicesList createRelayConnectedDevicesList() {
        return new RelayConnectedDevicesList();
    }

    /**
     * Create an instance of {@link CarrierAggregationList }
     * 
     */
    public CarrierAggregationList createCarrierAggregationList() {
        return new CarrierAggregationList();
    }

    /**
     * Create an instance of {@link RelayApnWs }
     * 
     */
    public RelayApnWs createRelayApnWs() {
        return new RelayApnWs();
    }

    /**
     * Create an instance of {@link RelayConnectedDevicesWs }
     * 
     */
    public RelayConnectedDevicesWs createRelayConnectedDevicesWs() {
        return new RelayConnectedDevicesWs();
    }

    /**
     * Create an instance of {@link CarrierAggregationWs }
     * 
     */
    public CarrierAggregationWs createCarrierAggregationWs() {
        return new CarrierAggregationWs();
    }

    /**
     * Create an instance of {@link RelayDonorCellListResult }
     * 
     */
    public RelayDonorCellListResult createRelayDonorCellListResult() {
        return new RelayDonorCellListResult();
    }

    /**
     * Create an instance of {@link RelayDonorCellWs }
     * 
     */
    public RelayDonorCellWs createRelayDonorCellWs() {
        return new RelayDonorCellWs();
    }

    /**
     * Create an instance of {@link LocationDetailsWs }
     * 
     */
    public LocationDetailsWs createLocationDetailsWs() {
        return new LocationDetailsWs();
    }

    /**
     * Create an instance of {@link GpsDetailsWs }
     * 
     */
    public GpsDetailsWs createGpsDetailsWs() {
        return new GpsDetailsWs();
    }

    /**
     * Create an instance of {@link SynchronizationDetailsWs }
     * 
     */
    public SynchronizationDetailsWs createSynchronizationDetailsWs() {
        return new SynchronizationDetailsWs();
    }

    /**
     * Create an instance of {@link SynchronizationSourcesWs }
     * 
     */
    public SynchronizationSourcesWs createSynchronizationSourcesWs() {
        return new SynchronizationSourcesWs();
    }

    /**
     * Create an instance of {@link PtpDetailsWs }
     * 
     */
    public PtpDetailsWs createPtpDetailsWs() {
        return new PtpDetailsWs();
    }

    /**
     * Create an instance of {@link NlSyncDetailsWs }
     * 
     */
    public NlSyncDetailsWs createNlSyncDetailsWs() {
        return new NlSyncDetailsWs();
    }

    /**
     * Create an instance of {@link LocationLockStatusWs }
     * 
     */
    public LocationLockStatusWs createLocationLockStatusWs() {
        return new LocationLockStatusWs();
    }

    /**
     * Create an instance of {@link SynchronizationSourceItemWs }
     * 
     */
    public SynchronizationSourceItemWs createSynchronizationSourceItemWs() {
        return new SynchronizationSourceItemWs();
    }

    /**
     * Create an instance of {@link NlScanStatusItemWs }
     * 
     */
    public NlScanStatusItemWs createNlScanStatusItemWs() {
        return new NlScanStatusItemWs();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLockFingerPrintWs }
     * 
     */
    public ArrayOfLocationLockFingerPrintWs createArrayOfLocationLockFingerPrintWs() {
        return new ArrayOfLocationLockFingerPrintWs();
    }

    /**
     * Create an instance of {@link LocationLockFingerPrintWs }
     * 
     */
    public LocationLockFingerPrintWs createLocationLockFingerPrintWs() {
        return new LocationLockFingerPrintWs();
    }

    /**
     * Create an instance of {@link ArrayOfNlmScanStatus }
     * 
     */
    public ArrayOfNlmScanStatus createArrayOfNlmScanStatus() {
        return new ArrayOfNlmScanStatus();
    }

    /**
     * Create an instance of {@link NlmScanStatus }
     * 
     */
    public NlmScanStatus createNlmScanStatus() {
        return new NlmScanStatus();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusEarfcn(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusEarfcn_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlBandwidth", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusDlBandwidth(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusDlBandwidth_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusRsrp(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrp_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusRssi(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRssi_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusRsrq(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrq_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StratumLevel", scope = NlmScanStatus.class)
    public JAXBElement<Integer> createNlmScanStatusStratumLevel(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusStratumLevel_QNAME, Integer.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanSyncStatusWS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncStatus", scope = NlmScanStatus.class)
    public JAXBElement<ScanSyncStatusWS> createNlmScanStatusSyncStatus(ScanSyncStatusWS value) {
        return new JAXBElement<ScanSyncStatusWS>(_NlmScanStatusSyncStatus_QNAME, ScanSyncStatusWS.class, NlmScanStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ecgi", scope = LocationLockFingerPrintWs.class)
    public JAXBElement<Integer> createLocationLockFingerPrintWsEcgi(Integer value) {
        return new JAXBElement<Integer>(_LocationLockFingerPrintWsEcgi_QNAME, Integer.class, LocationLockFingerPrintWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = LocationLockFingerPrintWs.class)
    public JAXBElement<Integer> createLocationLockFingerPrintWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrp_QNAME, Integer.class, LocationLockFingerPrintWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = LocationLockFingerPrintWs.class)
    public JAXBElement<Integer> createLocationLockFingerPrintWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_LocationLockFingerPrintWsTxPower_QNAME, Integer.class, LocationLockFingerPrintWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rtd", scope = LocationLockFingerPrintWs.class)
    public JAXBElement<Integer> createLocationLockFingerPrintWsRtd(Integer value) {
        return new JAXBElement<Integer>(_LocationLockFingerPrintWsRtd_QNAME, Integer.class, LocationLockFingerPrintWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusEarfcn_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkBandwidthRB", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsDownlinkBandwidthRB(Integer value) {
        return new JAXBElement<Integer>(_NlScanStatusItemWsDownlinkBandwidthRB_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrp_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsRssi(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRssi_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrq_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ecgi", scope = NlScanStatusItemWs.class)
    public JAXBElement<Long> createNlScanStatusItemWsEcgi(Long value) {
        return new JAXBElement<Long>(_LocationLockFingerPrintWsEcgi_QNAME, Long.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StratumLevel", scope = NlScanStatusItemWs.class)
    public JAXBElement<Integer> createNlScanStatusItemWsStratumLevel(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusStratumLevel_QNAME, Integer.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NlScanSyncStatusWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncStatus", scope = NlScanStatusItemWs.class)
    public JAXBElement<NlScanSyncStatusWs> createNlScanStatusItemWsSyncStatus(NlScanSyncStatusWs value) {
        return new JAXBElement<NlScanSyncStatusWs>(_NlmScanStatusSyncStatus_QNAME, NlScanSyncStatusWs.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanStatesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "State", scope = NlScanStatusItemWs.class)
    public JAXBElement<ScanStatesWs> createNlScanStatusItemWsState(ScanStatesWs value) {
        return new JAXBElement<ScanStatesWs>(_NlScanStatusItemWsState_QNAME, ScanStatesWs.class, NlScanStatusItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSourceWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ClockSource", scope = SynchronizationSourceItemWs.class)
    public JAXBElement<ClockSourceWs> createSynchronizationSourceItemWsClockSource(ClockSourceWs value) {
        return new JAXBElement<ClockSourceWs>(_SynchronizationSourceItemWsClockSource_QNAME, ClockSourceWs.class, SynchronizationSourceItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = SynchronizationSourceItemWs.class)
    public JAXBElement<Integer> createSynchronizationSourceItemWsPriority(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationSourceItemWsPriority_QNAME, Integer.class, SynchronizationSourceItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSourceStatusWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Status", scope = SynchronizationSourceItemWs.class)
    public JAXBElement<ClockSourceStatusWs> createSynchronizationSourceItemWsStatus(ClockSourceStatusWs value) {
        return new JAXBElement<ClockSourceStatusWs>(_SynchronizationSourceItemWsStatus_QNAME, ClockSourceStatusWs.class, SynchronizationSourceItemWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FingerPrintMark", scope = LocationLockStatusWs.class)
    public JAXBElement<Integer> createLocationLockStatusWsFingerPrintMark(Integer value) {
        return new JAXBElement<Integer>(_LocationLockStatusWsFingerPrintMark_QNAME, Integer.class, LocationLockStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EvalFingerPrintMark", scope = LocationLockStatusWs.class)
    public JAXBElement<Integer> createLocationLockStatusWsEvalFingerPrintMark(Integer value) {
        return new JAXBElement<Integer>(_LocationLockStatusWsEvalFingerPrintMark_QNAME, Integer.class, LocationLockStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnavailReasonTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UnavailableReason", scope = NlSyncDetailsWs.class)
    public JAXBElement<UnavailReasonTypesWs> createNlSyncDetailsWsUnavailableReason(UnavailReasonTypesWs value) {
        return new JAXBElement<UnavailReasonTypesWs>(_NlSyncDetailsWsUnavailableReason_QNAME, UnavailReasonTypesWs.class, NlSyncDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LockedPci", scope = NlSyncDetailsWs.class)
    public JAXBElement<Integer> createNlSyncDetailsWsLockedPci(Integer value) {
        return new JAXBElement<Integer>(_NlSyncDetailsWsLockedPci_QNAME, Integer.class, NlSyncDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LockedEcgi", scope = NlSyncDetailsWs.class)
    public JAXBElement<Long> createNlSyncDetailsWsLockedEcgi(Long value) {
        return new JAXBElement<Long>(_NlSyncDetailsWsLockedEcgi_QNAME, Long.class, NlSyncDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivePtpTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveMasterStatus", scope = PtpDetailsWs.class)
    public JAXBElement<ActivePtpTypesWs> createPtpDetailsWsActiveMasterStatus(ActivePtpTypesWs value) {
        return new JAXBElement<ActivePtpTypesWs>(_PtpDetailsWsActiveMasterStatus_QNAME, ActivePtpTypesWs.class, PtpDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentGrandMasterClockClass", scope = PtpDetailsWs.class)
    public JAXBElement<Integer> createPtpDetailsWsCurrentGrandMasterClockClass(Integer value) {
        return new JAXBElement<Integer>(_PtpDetailsWsCurrentGrandMasterClockClass_QNAME, Integer.class, PtpDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentUtcOffset", scope = PtpDetailsWs.class)
    public JAXBElement<Integer> createPtpDetailsWsCurrentUtcOffset(Integer value) {
        return new JAXBElement<Integer>(_PtpDetailsWsCurrentUtcOffset_QNAME, Integer.class, PtpDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSourceTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveSource", scope = SynchronizationDetailsWs.class)
    public JAXBElement<ClockSourceTypesWs> createSynchronizationDetailsWsActiveSource(ClockSourceTypesWs value) {
        return new JAXBElement<ClockSourceTypesWs>(_SynchronizationDetailsWsActiveSource_QNAME, ClockSourceTypesWs.class, SynchronizationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncStatesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Status", scope = SynchronizationDetailsWs.class)
    public JAXBElement<SyncStatesWs> createSynchronizationDetailsWsStatus(SyncStatesWs value) {
        return new JAXBElement<SyncStatesWs>(_SynchronizationSourceItemWsStatus_QNAME, SyncStatesWs.class, SynchronizationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToHandoverExpirySecs", scope = SynchronizationDetailsWs.class)
    public JAXBElement<Integer> createSynchronizationDetailsWsTimeToHandoverExpirySecs(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationDetailsWsTimeToHandoverExpirySecs_QNAME, Integer.class, SynchronizationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SwitchRatePerDay", scope = SynchronizationDetailsWs.class)
    public JAXBElement<Integer> createSynchronizationDetailsWsSwitchRatePerDay(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationDetailsWsSwitchRatePerDay_QNAME, Integer.class, SynchronizationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastSwitchTimeInSecs", scope = SynchronizationDetailsWs.class)
    public JAXBElement<Integer> createSynchronizationDetailsWsLastSwitchTimeInSecs(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationDetailsWsLastSwitchTimeInSecs_QNAME, Integer.class, SynchronizationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsCommsWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Comms", scope = GpsDetailsWs.class)
    public JAXBElement<GpsCommsWs> createGpsDetailsWsComms(GpsCommsWs value) {
        return new JAXBElement<GpsCommsWs>(_GpsDetailsWsComms_QNAME, GpsCommsWs.class, GpsDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackedSatellites", scope = GpsDetailsWs.class)
    public JAXBElement<Integer> createGpsDetailsWsTrackedSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsDetailsWsTrackedSatellites_QNAME, Integer.class, GpsDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VisibleSatellites", scope = GpsDetailsWs.class)
    public JAXBElement<Integer> createGpsDetailsWsVisibleSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsDetailsWsVisibleSatellites_QNAME, Integer.class, GpsDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsSnrWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snr", scope = GpsDetailsWs.class)
    public JAXBElement<GpsSnrWs> createGpsDetailsWsSnr(GpsSnrWs value) {
        return new JAXBElement<GpsSnrWs>(_GpsDetailsWsSnr_QNAME, GpsSnrWs.class, GpsDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsFileStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsFileStatus", scope = GpsDetailsWs.class)
    public JAXBElement<GpsFileStatusValues> createGpsDetailsWsGpsFileStatus(GpsFileStatusValues value) {
        return new JAXBElement<GpsFileStatusValues>(_GpsDetailsWsGpsFileStatus_QNAME, GpsFileStatusValues.class, GpsDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Source", scope = LocationDetailsWs.class)
    public JAXBElement<SourceTypeWs> createLocationDetailsWsSource(SourceTypeWs value) {
        return new JAXBElement<SourceTypeWs>(_LocationDetailsWsSource_QNAME, SourceTypeWs.class, LocationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpReferenceLatitude", scope = LocationDetailsWs.class)
    public JAXBElement<BigDecimal> createLocationDetailsWsPnpReferenceLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationDetailsWsPnpReferenceLatitude_QNAME, BigDecimal.class, LocationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpReferenceLongitude", scope = LocationDetailsWs.class)
    public JAXBElement<BigDecimal> createLocationDetailsWsPnpReferenceLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LocationDetailsWsPnpReferenceLongitude_QNAME, BigDecimal.class, LocationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpReferenceAccuracy", scope = LocationDetailsWs.class)
    public JAXBElement<Integer> createLocationDetailsWsPnpReferenceAccuracy(Integer value) {
        return new JAXBElement<Integer>(_LocationDetailsWsPnpReferenceAccuracy_QNAME, Integer.class, LocationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceTypeWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpReferenceSource", scope = LocationDetailsWs.class)
    public JAXBElement<SourceTypeWs> createLocationDetailsWsPnpReferenceSource(SourceTypeWs value) {
        return new JAXBElement<SourceTypeWs>(_LocationDetailsWsPnpReferenceSource_QNAME, SourceTypeWs.class, LocationDetailsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdclRank", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsPdclRank(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsPdclRank_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockDetection", scope = RelayDonorCellWs.class)
    public JAXBElement<Boolean> createRelayDonorCellWsGpsLockDetection(Boolean value) {
        return new JAXBElement<Boolean>(_RelayDonorCellWsGpsLockDetection_QNAME, Boolean.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = RelayDonorCellWs.class)
    public JAXBElement<BandValuesWs> createRelayDonorCellWsBand(BandValuesWs value) {
        return new JAXBElement<BandValuesWs>(_RelayDonorCellWsBand_QNAME, BandValuesWs.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsEci(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsEci_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusEarfcn_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndicator", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsRankIndicator(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsRankIndicator_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalToNoiseRatio", scope = RelayDonorCellWs.class)
    public JAXBElement<Double> createRelayDonorCellWsSignalToNoiseRatio(Double value) {
        return new JAXBElement<Double>(_RelayDonorCellWsSignalToNoiseRatio_QNAME, Double.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsLogicalAngle_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsHeadingAngle_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpectralEfficiency", scope = RelayDonorCellWs.class)
    public JAXBElement<Double> createRelayDonorCellWsSpectralEfficiency(Double value) {
        return new JAXBElement<Double>(_RelayDonorCellWsSpectralEfficiency_QNAME, Double.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrp_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrq_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UsableLocation", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsUsableLocation(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsUsableLocation_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayDonorCellWs.class)
    public JAXBElement<BigDecimal> createRelayDonorCellWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayDonorCellWsDrm_QNAME, BigDecimal.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsRssi(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRssi_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CdclRank", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsCdclRank(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsCdclRank_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpDom", scope = RelayDonorCellWs.class)
    public JAXBElement<BigDecimal> createRelayDonorCellWsRsrpDom(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayDonorCellWsRsrpDom_QNAME, BigDecimal.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuarantineStateWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QuarantineState", scope = RelayDonorCellWs.class)
    public JAXBElement<QuarantineStateWs> createRelayDonorCellWsQuarantineState(QuarantineStateWs value) {
        return new JAXBElement<QuarantineStateWs>(_RelayDonorCellWsQuarantineState_QNAME, QuarantineStateWs.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandPriority", scope = RelayDonorCellWs.class)
    public JAXBElement<Integer> createRelayDonorCellWsBandPriority(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsBandPriority_QNAME, Integer.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DonorEndcIndication", scope = RelayDonorCellWs.class)
    public JAXBElement<String> createRelayDonorCellWsDonorEndcIndication(String value) {
        return new JAXBElement<String>(_RelayDonorCellWsDonorEndcIndication_QNAME, String.class, RelayDonorCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = CarrierAggregationWs.class)
    public JAXBElement<Integer> createCarrierAggregationWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusEarfcn_QNAME, Integer.class, CarrierAggregationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = CarrierAggregationWs.class)
    public JAXBElement<RelayBands> createCarrierAggregationWsBand(RelayBands value) {
        return new JAXBElement<RelayBands>(_RelayDonorCellWsBand_QNAME, RelayBands.class, CarrierAggregationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = CarrierAggregationWs.class)
    public JAXBElement<Integer> createCarrierAggregationWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, CarrierAggregationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = CarrierAggregationWs.class)
    public JAXBElement<RelaySccBandwidths> createCarrierAggregationWsBandwidth(RelaySccBandwidths value) {
        return new JAXBElement<RelaySccBandwidths>(_CarrierAggregationWsBandwidth_QNAME, RelaySccBandwidths.class, CarrierAggregationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaState", scope = CarrierAggregationWs.class)
    public JAXBElement<RelaySccCaStates> createCarrierAggregationWsCaState(RelaySccCaStates value) {
        return new JAXBElement<RelaySccCaStates>(_CarrierAggregationWsCaState_QNAME, RelaySccCaStates.class, CarrierAggregationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeviceTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeviceType", scope = RelayConnectedDevicesWs.class)
    public JAXBElement<AccessDeviceTypesWs> createRelayConnectedDevicesWsDeviceType(AccessDeviceTypesWs value) {
        return new JAXBElement<AccessDeviceTypesWs>(_RelayConnectedDevicesWsDeviceType_QNAME, AccessDeviceTypesWs.class, RelayConnectedDevicesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionStatus", scope = RelayConnectedDevicesWs.class)
    public JAXBElement<ConnectionStatusStates> createRelayConnectedDevicesWsConnectionStatus(ConnectionStatusStates value) {
        return new JAXBElement<ConnectionStatusStates>(_RelayConnectedDevicesWsConnectionStatus_QNAME, ConnectionStatusStates.class, RelayConnectedDevicesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LeaseTime", scope = RelayConnectedDevicesWs.class)
    public JAXBElement<Integer> createRelayConnectedDevicesWsLeaseTime(Integer value) {
        return new JAXBElement<Integer>(_RelayConnectedDevicesWsLeaseTime_QNAME, Integer.class, RelayConnectedDevicesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Connected", scope = RelayConnectedDevicesWs.class)
    public JAXBElement<Boolean> createRelayConnectedDevicesWsConnected(Boolean value) {
        return new JAXBElement<Boolean>(_RelayConnectedDevicesWsConnected_QNAME, Boolean.class, RelayConnectedDevicesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VlanId", scope = RelayConnectedDevicesWs.class)
    public JAXBElement<Integer> createRelayConnectedDevicesWsVlanId(Integer value) {
        return new JAXBElement<Integer>(_RelayConnectedDevicesWsVlanId_QNAME, Integer.class, RelayConnectedDevicesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApnStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "State", scope = RelayApnWs.class)
    public JAXBElement<ApnStatusStates> createRelayApnWsState(ApnStatusStates value) {
        return new JAXBElement<ApnStatusStates>(_NlScanStatusItemWsState_QNAME, ApnStatusStates.class, RelayApnWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsEci(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsEci_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusEarfcn_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LteBandwidth", scope = RelayStatusWs.class)
    public JAXBElement<String> createRelayStatusWsLteBandwidth(String value) {
        return new JAXBElement<String>(_RelayStatusWsLteBandwidth_QNAME, String.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DenbTxModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DenbTxMode", scope = RelayStatusWs.class)
    public JAXBElement<DenbTxModes> createRelayStatusWsDenbTxMode(DenbTxModes value) {
        return new JAXBElement<DenbTxModes>(_RelayStatusWsDenbTxMode_QNAME, DenbTxModes.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P1CdclUsed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P1CdclUsedStatus", scope = RelayStatusWs.class)
    public JAXBElement<P1CdclUsed> createRelayStatusWsP1CdclUsedStatus(P1CdclUsed value) {
        return new JAXBElement<P1CdclUsed>(_RelayStatusWsP1CdclUsedStatus_QNAME, P1CdclUsed.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P1PdclUsed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P1PdclUsedStatus", scope = RelayStatusWs.class)
    public JAXBElement<P1PdclUsed> createRelayStatusWsP1PdclUsedStatus(P1PdclUsed value) {
        return new JAXBElement<P1PdclUsed>(_RelayStatusWsP1PdclUsedStatus_QNAME, P1PdclUsed.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanStartStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ScanStart", scope = RelayStatusWs.class)
    public JAXBElement<ScanStartStatus> createRelayStatusWsScanStart(ScanStartStatus value) {
        return new JAXBElement<ScanStartStatus>(_RelayStatusWsScanStart_QNAME, ScanStartStatus.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastScanStartTime", scope = RelayStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createRelayStatusWsLastScanStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelayStatusWsLastScanStartTime_QNAME, XMLGregorianCalendar.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEnbConnected", scope = RelayStatusWs.class)
    public JAXBElement<Boolean> createRelayStatusWsIsEnbConnected(Boolean value) {
        return new JAXBElement<Boolean>(_RelayStatusWsIsEnbConnected_QNAME, Boolean.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsLogicalAngle_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsHeadingAngle_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrq_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRsrp_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRssi(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusRssi_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sinr", scope = RelayStatusWs.class)
    public JAXBElement<Double> createRelayStatusWsSinr(Double value) {
        return new JAXBElement<Double>(_RelayStatusWsSinr_QNAME, Double.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioTxPower", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRadioTxPower(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsRadioTxPower_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DonorEnbQuality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DonorEnbQuality", scope = RelayStatusWs.class)
    public JAXBElement<DonorEnbQuality> createRelayStatusWsDonorEnbQuality(DonorEnbQuality value) {
        return new JAXBElement<DonorEnbQuality>(_RelayStatusWsDonorEnbQuality_QNAME, DonorEnbQuality.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndicator", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRankIndicator(Integer value) {
        return new JAXBElement<Integer>(_RelayDonorCellWsRankIndicator_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpectralEfficiency", scope = RelayStatusWs.class)
    public JAXBElement<Double> createRelayStatusWsSpectralEfficiency(Double value) {
        return new JAXBElement<Double>(_RelayDonorCellWsSpectralEfficiency_QNAME, Double.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayDonorCellWsDrm_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpDom", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrpDom(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayDonorCellWsRsrpDom_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci1", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsPci1(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsPci1_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp1", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrp1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrp1_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq1", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrq1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrq1_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci2", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsPci2(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsPci2_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp2", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrp2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrp2_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq2", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrq2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrq2_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci3", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsPci3(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsPci3_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp3", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrp3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrp3_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq3", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsRsrq3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatusWsRsrq3_QNAME, BigDecimal.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimingAdvance", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsTimingAdvance(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsTimingAdvance_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MimoRank", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsMimoRank(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsMimoRank_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlPdcpThroughput", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsDlPdcpThroughput(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsDlPdcpThroughput_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPdcpThroughput", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsUlPdcpThroughput(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsUlPdcpThroughput_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaCorrelation", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsAntennaCorrelation(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsAntennaCorrelation_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccAntennaCorrelation", scope = RelayStatusWs.class)
    public JAXBElement<Long> createRelayStatusWsSccAntennaCorrelation(Long value) {
        return new JAXBElement<Long>(_RelayStatusWsSccAntennaCorrelation_QNAME, Long.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DonorEndcIndication", scope = RelayStatusWs.class)
    public JAXBElement<String> createRelayStatusWsDonorEndcIndication(String value) {
        return new JAXBElement<String>(_RelayDonorCellWsDonorEndcIndication_QNAME, String.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulTypeWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulType", scope = RelayStatusWs.class)
    public JAXBElement<BackhaulTypeWs> createRelayStatusWsBackhaulType(BackhaulTypeWs value) {
        return new JAXBElement<BackhaulTypeWs>(_RelayStatusWsBackhaulType_QNAME, BackhaulTypeWs.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulWiFiApSecurityTypeWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifiApSecurity", scope = RelayStatusWs.class)
    public JAXBElement<BackhaulWiFiApSecurityTypeWs> createRelayStatusWsBackhaulWifiApSecurity(BackhaulWiFiApSecurityTypeWs value) {
        return new JAXBElement<BackhaulWiFiApSecurityTypeWs>(_RelayStatusWsBackhaulWifiApSecurity_QNAME, BackhaulWiFiApSecurityTypeWs.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifiActiveChannel", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsBackhaulWifiActiveChannel(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsBackhaulWifiActiveChannel_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifiRssi", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsBackhaulWifiRssi(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsBackhaulWifiRssi_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifiActiveBand", scope = RelayStatusWs.class)
    public JAXBElement<String> createRelayStatusWsBackhaulWifiActiveBand(String value) {
        return new JAXBElement<String>(_RelayStatusWsBackhaulWifiActiveBand_QNAME, String.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackhaulWiFiIpModeWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BackhaulWifiIpMode", scope = RelayStatusWs.class)
    public JAXBElement<BackhaulWiFiIpModeWs> createRelayStatusWsBackhaulWifiIpMode(BackhaulWiFiIpModeWs value) {
        return new JAXBElement<BackhaulWiFiIpModeWs>(_RelayStatusWsBackhaulWifiIpMode_QNAME, BackhaulWiFiIpModeWs.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Polarization", scope = IBridge2OverviewMimoChainStatusWs.class)
    public JAXBElement<Integer> createIBridge2OverviewMimoChainStatusWsPolarization(Integer value) {
        return new JAXBElement<Integer>(_IBridge2OverviewMimoChainStatusWsPolarization_QNAME, Integer.class, IBridge2OverviewMimoChainStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocalTdmaWindowMs", scope = IBridge2OverviewDeviceDetailsStatusWs.class)
    public JAXBElement<Integer> createIBridge2OverviewDeviceDetailsStatusWsLocalTdmaWindowMs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2OverviewDeviceDetailsStatusWsLocalTdmaWindowMs_QNAME, Integer.class, IBridge2OverviewDeviceDetailsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocalCPUTempC", scope = IBridge2OverviewDeviceDetailsStatusWs.class)
    public JAXBElement<BigDecimal> createIBridge2OverviewDeviceDetailsStatusWsLocalCPUTempC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2OverviewDeviceDetailsStatusWsLocalCPUTempC_QNAME, BigDecimal.class, IBridge2OverviewDeviceDetailsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RemoteTdmaWindowMs", scope = IBridge2OverviewDeviceDetailsStatusWs.class)
    public JAXBElement<Integer> createIBridge2OverviewDeviceDetailsStatusWsRemoteTdmaWindowMs(Integer value) {
        return new JAXBElement<Integer>(_IBridge2OverviewDeviceDetailsStatusWsRemoteTdmaWindowMs_QNAME, Integer.class, IBridge2OverviewDeviceDetailsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RemoteCPUTempC", scope = IBridge2OverviewDeviceDetailsStatusWs.class)
    public JAXBElement<Integer> createIBridge2OverviewDeviceDetailsStatusWsRemoteCPUTempC(Integer value) {
        return new JAXBElement<Integer>(_IBridge2OverviewDeviceDetailsStatusWsRemoteCPUTempC_QNAME, Integer.class, IBridge2OverviewDeviceDetailsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<Double> createIBridge2OverviewSignalMeterStatusWsRssi(Double value) {
        return new JAXBElement<Double>(_NlmScanStatusRssi_QNAME, Double.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhyTxMbps", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<Double> createIBridge2OverviewSignalMeterStatusWsPhyTxMbps(Double value) {
        return new JAXBElement<Double>(_IBridge2OverviewSignalMeterStatusWsPhyTxMbps_QNAME, Double.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhyRxMbps", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<Double> createIBridge2OverviewSignalMeterStatusWsPhyRxMbps(Double value) {
        return new JAXBElement<Double>(_IBridge2OverviewSignalMeterStatusWsPhyRxMbps_QNAME, Double.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacTxMbps", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<Double> createIBridge2OverviewSignalMeterStatusWsMacTxMbps(Double value) {
        return new JAXBElement<Double>(_IBridge2OverviewSignalMeterStatusWsMacTxMbps_QNAME, Double.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacRxMbps", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<Double> createIBridge2OverviewSignalMeterStatusWsMacRxMbps(Double value) {
        return new JAXBElement<Double>(_IBridge2OverviewSignalMeterStatusWsMacRxMbps_QNAME, Double.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPowerDbm", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<BigDecimal> createIBridge2OverviewSignalMeterStatusWsTxPowerDbm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2OverviewSignalMeterStatusWsTxPowerDbm_QNAME, BigDecimal.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkLengthM", scope = IBridge2OverviewSignalMeterStatusWs.class)
    public JAXBElement<BigDecimal> createIBridge2OverviewSignalMeterStatusWsLinkLengthM(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2OverviewSignalMeterStatusWsLinkLengthM_QNAME, BigDecimal.class, IBridge2OverviewSignalMeterStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkUptime", scope = IBridge2OverviewTopLevelStatusWs.class)
    public JAXBElement<BigDecimal> createIBridge2OverviewTopLevelStatusWsLinkUptime(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IBridge2OverviewTopLevelStatusWsLinkUptime_QNAME, BigDecimal.class, IBridge2OverviewTopLevelStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoChannel", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Boolean> createIBridge2ChannelAndPowerStatusWsAutoChannel(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2ChannelAndPowerStatusWsAutoChannel_QNAME, Boolean.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CenterFrequencyMhz", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Integer> createIBridge2ChannelAndPowerStatusWsCenterFrequencyMhz(Integer value) {
        return new JAXBElement<Integer>(_IBridge2ChannelAndPowerStatusWsCenterFrequencyMhz_QNAME, Integer.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BaseAntennaGainDbi", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Integer> createIBridge2ChannelAndPowerStatusWsBaseAntennaGainDbi(Integer value) {
        return new JAXBElement<Integer>(_IBridge2ChannelAndPowerStatusWsBaseAntennaGainDbi_QNAME, Integer.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TermAntennaGainDbi", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Integer> createIBridge2ChannelAndPowerStatusWsTermAntennaGainDbi(Integer value) {
        return new JAXBElement<Integer>(_IBridge2ChannelAndPowerStatusWsTermAntennaGainDbi_QNAME, Integer.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoPowerMode", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Integer> createIBridge2ChannelAndPowerStatusWsAutoPowerMode(Integer value) {
        return new JAXBElement<Integer>(_IBridge2ChannelAndPowerStatusWsAutoPowerMode_QNAME, Integer.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPowerDbm", scope = IBridge2ChannelAndPowerStatusWs.class)
    public JAXBElement<Integer> createIBridge2ChannelAndPowerStatusWsTxPowerDbm(Integer value) {
        return new JAXBElement<Integer>(_IBridge2OverviewSignalMeterStatusWsTxPowerDbm_QNAME, Integer.class, IBridge2ChannelAndPowerStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocalAntennaGain", scope = IBridge2CommissionedPropertiesWs.class)
    public JAXBElement<Integer> createIBridge2CommissionedPropertiesWsLocalAntennaGain(Integer value) {
        return new JAXBElement<Integer>(_IBridge2CommissionedPropertiesWsLocalAntennaGain_QNAME, Integer.class, IBridge2CommissionedPropertiesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RemoteAntennaGain", scope = IBridge2CommissionedPropertiesWs.class)
    public JAXBElement<Integer> createIBridge2CommissionedPropertiesWsRemoteAntennaGain(Integer value) {
        return new JAXBElement<Integer>(_IBridge2CommissionedPropertiesWsRemoteAntennaGain_QNAME, Integer.class, IBridge2CommissionedPropertiesWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WebUiEnabled", scope = IBridge2WebUiStatusResult.class)
    public JAXBElement<Boolean> createIBridge2WebUiStatusResultWebUiEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_IBridge2WebUiStatusResultWebUiEnabled_QNAME, Boolean.class, IBridge2WebUiStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankingIndex", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Long> createIBridgeTermRxNullingStatusRankingIndex(Long value) {
        return new JAXBElement<Long>(_IBridgeTermRxNullingStatusRankingIndex_QNAME, Long.class, IBridgeTermRxNullingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PatternIndex", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusPatternIndex(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusPatternIndex_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingQi", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusNullingQi(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusNullingQi_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumFrames", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusNumFrames(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusNumFrames_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumMeasurements", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusNumMeasurements(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusNumMeasurements_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelFrequency(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelFrequency_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Double> createIBridgeTermScannedChannelBandwidth(Double value) {
        return new JAXBElement<Double>(_CarrierAggregationWsBandwidth_QNAME, Double.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaPort", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelAntennaPort(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelAntennaPort_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelRfGain_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChannelQuality", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelChannelQuality(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelChannelQuality_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AcqMimo", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelAcqMimo(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelAcqMimo_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleIndex_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleCinr", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleCinr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleCinr_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleFreqOffset", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleFreqOffset_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SisoZoneAnt0Cinr", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelSisoZoneAnt0Cinr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelSisoZoneAnt0Cinr_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelFrequency(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelFrequency_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Double> createIBridgeTermActiveChannelBandwidth(Double value) {
        return new JAXBElement<Double>(_CarrierAggregationWsBandwidth_QNAME, Double.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaPort", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelAntennaPort(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelAntennaPort_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelRfGain_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleIndex_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleCinr", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleCinr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleCinr_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleFreqOffset", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelPreambleFreqOffset_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentPowerTotal", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Double> createIBridgeTermActiveChannelCurrentPowerTotal(Double value) {
        return new JAXBElement<Double>(_IBridgeTermActiveChannelCurrentPowerTotal_QNAME, Double.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentPowerPerTone", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Double> createIBridgeTermActiveChannelCurrentPowerPerTone(Double value) {
        return new JAXBElement<Double>(_IBridgeTermActiveChannelCurrentPowerPerTone_QNAME, Double.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkLostCount", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelLinkLostCount(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelLinkLostCount_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingCurrentPattern", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelNullingCurrentPattern(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelNullingCurrentPattern_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingCurrentReferencePattern", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelNullingCurrentReferencePattern(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelNullingCurrentReferencePattern_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingQi", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelNullingQi(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusNullingQi_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermChannelProfile.class)
    public JAXBElement<Integer> createIBridgeTermChannelProfileFrequency(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelFrequency_QNAME, Integer.class, IBridgeTermChannelProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = IBridgeTermChannelProfile.class)
    public JAXBElement<Integer> createIBridgeTermChannelProfilePriority(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationSourceItemWsPriority_QNAME, Integer.class, IBridgeTermChannelProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Id", scope = FineAlignShmResult.class)
    public JAXBElement<Integer> createFineAlignShmResultId(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultId_QNAME, Integer.class, FineAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MotorAzimuth", scope = FineAlignShmResult.class)
    public JAXBElement<Integer> createFineAlignShmResultMotorAzimuth(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultMotorAzimuth_QNAME, Integer.class, FineAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ShmStatus", scope = FineAlignShmResult.class)
    public JAXBElement<CalculationStatusValues> createFineAlignShmResultShmStatus(CalculationStatusValues value) {
        return new JAXBElement<CalculationStatusValues>(_FineAlignShmResultShmStatus_QNAME, CalculationStatusValues.class, FineAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Shm", scope = FineAlignShmResult.class)
    public JAXBElement<Integer> createFineAlignShmResultShm(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultShm_QNAME, Integer.class, FineAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Id", scope = AutoAlignShmResult.class)
    public JAXBElement<Integer> createAutoAlignShmResultId(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultId_QNAME, Integer.class, AutoAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MotorAzimuth", scope = AutoAlignShmResult.class)
    public JAXBElement<Integer> createAutoAlignShmResultMotorAzimuth(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultMotorAzimuth_QNAME, Integer.class, AutoAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ShmStatus", scope = AutoAlignShmResult.class)
    public JAXBElement<CalculationStatusValues> createAutoAlignShmResultShmStatus(CalculationStatusValues value) {
        return new JAXBElement<CalculationStatusValues>(_FineAlignShmResultShmStatus_QNAME, CalculationStatusValues.class, AutoAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Shm", scope = AutoAlignShmResult.class)
    public JAXBElement<Integer> createAutoAlignShmResultShm(Integer value) {
        return new JAXBElement<Integer>(_FineAlignShmResultShm_QNAME, Integer.class, AutoAlignShmResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfiguredEirpDbm", scope = IBridgeBaseRfStatusWs.class)
    public JAXBElement<Integer> createIBridgeBaseRfStatusWsConfiguredEirpDbm(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRfStatusWsConfiguredEirpDbm_QNAME, Integer.class, IBridgeBaseRfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoAlignModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoAlignMode", scope = IBridgeBaseRfStatusWs.class)
    public JAXBElement<AutoAlignModes> createIBridgeBaseRfStatusWsAutoAlignMode(AutoAlignModes value) {
        return new JAXBElement<AutoAlignModes>(_IBridgeBaseRfStatusWsAutoAlignMode_QNAME, AutoAlignModes.class, IBridgeBaseRfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoAlignAzimuth", scope = IBridgeBaseRfStatusWs.class)
    public JAXBElement<Integer> createIBridgeBaseRfStatusWsAutoAlignAzimuth(Integer value) {
        return new JAXBElement<Integer>(_IBridgeBaseRfStatusWsAutoAlignAzimuth_QNAME, Integer.class, IBridgeBaseRfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CalculationStatus", scope = IBridgeBaseRfStatusWs.class)
    public JAXBElement<CalculationStatusValues> createIBridgeBaseRfStatusWsCalculationStatus(CalculationStatusValues value) {
        return new JAXBElement<CalculationStatusValues>(_IBridgeBaseRfStatusWsCalculationStatus_QNAME, CalculationStatusValues.class, IBridgeBaseRfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoAlignStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoAlignStatus", scope = IBridgeBaseRfStatusWs.class)
    public JAXBElement<AutoAlignStatusValues> createIBridgeBaseRfStatusWsAutoAlignStatus(AutoAlignStatusValues value) {
        return new JAXBElement<AutoAlignStatusValues>(_IBridgeBaseRfStatusWsAutoAlignStatus_QNAME, AutoAlignStatusValues.class, IBridgeBaseRfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsFrequency(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermScannedChannelFrequency_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_LocationLockFingerPrintWsTxPower_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxLinkEfficiency", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxLinkEfficiency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxLinkEfficiency_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxLinkEfficiency", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxLinkEfficiency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxLinkEfficiency_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SNR", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsSNR(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsSNR_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrengthChannel0", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxSignalStrengthChannel0(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxSignalStrengthChannel0_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrengthChannel0", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxSignalStrengthChannel0(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxSignalStrengthChannel0_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrengthChannel1", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxSignalStrengthChannel1(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxSignalStrengthChannel1_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrengthChannel1", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxSignalStrengthChannel1(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxSignalStrengthChannel1_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uptime", scope = Ib440RfStatusWs.class)
    public JAXBElement<Long> createIb440RfStatusWsUptime(Long value) {
        return new JAXBElement<Long>(_Ib440RfStatusWsUptime_QNAME, Long.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrength", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxSignalStrength(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxSignalStrength_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPhyRate", scope = Ib440RfStatusWs.class)
    public JAXBElement<Float> createIb440RfStatusWsTxPhyRate(Float value) {
        return new JAXBElement<Float>(_Ib440RfStatusWsTxPhyRate_QNAME, Float.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxPhyRate", scope = Ib440RfStatusWs.class)
    public JAXBElement<Float> createIb440RfStatusWsRxPhyRate(Float value) {
        return new JAXBElement<Float>(_Ib440RfStatusWsRxPhyRate_QNAME, Float.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrength", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxSignalStrength(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxSignalStrength_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalLayerCellGroup_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalLayerIdentity_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalCellId", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsPhysicalCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalCellId_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentRsiValue", scope = LteCellStatusCachedWs.class)
    public JAXBElement<Integer> createLteCellStatusCachedWsCurrentRsiValue(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCurrentRsiValue_QNAME, Integer.class, LteCellStatusCachedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpSupported", scope = LteSfpStatusWs.class)
    public JAXBElement<Boolean> createLteSfpStatusWsSfpSupported(Boolean value) {
        return new JAXBElement<Boolean>(_LteSfpStatusWsSfpSupported_QNAME, Boolean.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpConnected", scope = LteSfpStatusWs.class)
    public JAXBElement<Boolean> createLteSfpStatusWsSfpConnected(Boolean value) {
        return new JAXBElement<Boolean>(_LteSfpStatusWsSfpConnected_QNAME, Boolean.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmSupported", scope = LteSfpStatusWs.class)
    public JAXBElement<Boolean> createLteSfpStatusWsSfpDdmSupported(Boolean value) {
        return new JAXBElement<Boolean>(_LteSfpStatusWsSfpDdmSupported_QNAME, Boolean.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmTemperature", scope = LteSfpStatusWs.class)
    public JAXBElement<Integer> createLteSfpStatusWsSfpDdmTemperature(Integer value) {
        return new JAXBElement<Integer>(_LteSfpStatusWsSfpDdmTemperature_QNAME, Integer.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmTemperatureStatus", scope = LteSfpStatusWs.class)
    public JAXBElement<SfpDdmStatusValuesWs> createLteSfpStatusWsSfpDdmTemperatureStatus(SfpDdmStatusValuesWs value) {
        return new JAXBElement<SfpDdmStatusValuesWs>(_LteSfpStatusWsSfpDdmTemperatureStatus_QNAME, SfpDdmStatusValuesWs.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmVoltage", scope = LteSfpStatusWs.class)
    public JAXBElement<Integer> createLteSfpStatusWsSfpDdmVoltage(Integer value) {
        return new JAXBElement<Integer>(_LteSfpStatusWsSfpDdmVoltage_QNAME, Integer.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmVoltageStatus", scope = LteSfpStatusWs.class)
    public JAXBElement<SfpDdmStatusValuesWs> createLteSfpStatusWsSfpDdmVoltageStatus(SfpDdmStatusValuesWs value) {
        return new JAXBElement<SfpDdmStatusValuesWs>(_LteSfpStatusWsSfpDdmVoltageStatus_QNAME, SfpDdmStatusValuesWs.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmBias", scope = LteSfpStatusWs.class)
    public JAXBElement<Integer> createLteSfpStatusWsSfpDdmBias(Integer value) {
        return new JAXBElement<Integer>(_LteSfpStatusWsSfpDdmBias_QNAME, Integer.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmBiasStatus", scope = LteSfpStatusWs.class)
    public JAXBElement<SfpDdmStatusValuesWs> createLteSfpStatusWsSfpDdmBiasStatus(SfpDdmStatusValuesWs value) {
        return new JAXBElement<SfpDdmStatusValuesWs>(_LteSfpStatusWsSfpDdmBiasStatus_QNAME, SfpDdmStatusValuesWs.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmTxPower", scope = LteSfpStatusWs.class)
    public JAXBElement<Double> createLteSfpStatusWsSfpDdmTxPower(Double value) {
        return new JAXBElement<Double>(_LteSfpStatusWsSfpDdmTxPower_QNAME, Double.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmTxPowerStatus", scope = LteSfpStatusWs.class)
    public JAXBElement<SfpDdmStatusValuesWs> createLteSfpStatusWsSfpDdmTxPowerStatus(SfpDdmStatusValuesWs value) {
        return new JAXBElement<SfpDdmStatusValuesWs>(_LteSfpStatusWsSfpDdmTxPowerStatus_QNAME, SfpDdmStatusValuesWs.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmRxPower", scope = LteSfpStatusWs.class)
    public JAXBElement<Double> createLteSfpStatusWsSfpDdmRxPower(Double value) {
        return new JAXBElement<Double>(_LteSfpStatusWsSfpDdmRxPower_QNAME, Double.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfpDdmStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfpDdmRxPowerStatus", scope = LteSfpStatusWs.class)
    public JAXBElement<SfpDdmStatusValuesWs> createLteSfpStatusWsSfpDdmRxPowerStatus(SfpDdmStatusValuesWs value) {
        return new JAXBElement<SfpDdmStatusValuesWs>(_LteSfpStatusWsSfpDdmRxPowerStatus_QNAME, SfpDdmStatusValuesWs.class, LteSfpStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxEthFrames", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsTxEthFrames(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsTxEthFrames_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxEthBytes", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsTxEthBytes(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsTxEthBytes_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxEthErrFrames", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsTxEthErrFrames(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsTxEthErrFrames_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxEthFrames", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsRxEthFrames(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsRxEthFrames_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxEthBytes", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsRxEthBytes(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsRxEthBytes_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxEthErrFrames", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Integer> createEthernetPerPortStatusWsRxEthErrFrames(Integer value) {
        return new JAXBElement<Integer>(_EthernetPerPortStatusWsRxEthErrFrames_QNAME, Integer.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxErrorRate", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Double> createEthernetPerPortStatusWsTxErrorRate(Double value) {
        return new JAXBElement<Double>(_EthernetPerPortStatusWsTxErrorRate_QNAME, Double.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxErrorRate", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Double> createEthernetPerPortStatusWsRxErrorRate(Double value) {
        return new JAXBElement<Double>(_EthernetPerPortStatusWsRxErrorRate_QNAME, Double.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxLinkUsage", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Double> createEthernetPerPortStatusWsTxLinkUsage(Double value) {
        return new JAXBElement<Double>(_EthernetPerPortStatusWsTxLinkUsage_QNAME, Double.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxLinkUsage", scope = EthernetPerPortStatusWs.class)
    public JAXBElement<Double> createEthernetPerPortStatusWsRxLinkUsage(Double value) {
        return new JAXBElement<Double>(_EthernetPerPortStatusWsRxLinkUsage_QNAME, Double.class, EthernetPerPortStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteMaintenanceWindowWs.class)
    public JAXBElement<Integer> createLteMaintenanceWindowWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteMaintenanceWindowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RebootRequested", scope = LteMaintenanceWindowWs.class)
    public JAXBElement<Boolean> createLteMaintenanceWindowWsRebootRequested(Boolean value) {
        return new JAXBElement<Boolean>(_LteMaintenanceWindowWsRebootRequested_QNAME, Boolean.class, LteMaintenanceWindowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaintenanceWindowEnabled", scope = LteMaintenanceWindowList.class)
    public JAXBElement<EnabledDisabledStates> createLteMaintenanceWindowListMaintenanceWindowEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteMaintenanceWindowListMaintenanceWindowEnabled_QNAME, EnabledDisabledStates.class, LteMaintenanceWindowList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActiveStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaintenanceWinActive", scope = LteMaintenanceWindowList.class)
    public JAXBElement<ActiveStatus> createLteMaintenanceWindowListMaintenanceWinActive(ActiveStatus value) {
        return new JAXBElement<ActiveStatus>(_LteMaintenanceWindowListMaintenanceWinActive_QNAME, ActiveStatus.class, LteMaintenanceWindowList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UdpPort", scope = LteTwampReflectorWs.class)
    public JAXBElement<Integer> createLteTwampReflectorWsUdpPort(Integer value) {
        return new JAXBElement<Integer>(_LteTwampReflectorWsUdpPort_QNAME, Integer.class, LteTwampReflectorWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PpsCounter", scope = LteTwampReflectorWs.class)
    public JAXBElement<Integer> createLteTwampReflectorWsPpsCounter(Integer value) {
        return new JAXBElement<Integer>(_LteTwampReflectorWsPpsCounter_QNAME, Integer.class, LteTwampReflectorWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Admin", scope = LteTwampSenderWs.class)
    public JAXBElement<EnabledDisabledStates> createLteTwampSenderWsAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteTwampSenderWsAdmin_QNAME, EnabledDisabledStates.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasuredDelay", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsMeasuredDelay(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsMeasuredDelay_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasuredDv", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsMeasuredDv(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsMeasuredDv_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasuredRtd", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsMeasuredRtd(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsMeasuredRtd_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasuredPacketLoss", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsMeasuredPacketLoss(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsMeasuredPacketLoss_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = LteTwampSenderWs.class)
    public JAXBElement<OperStatusStates> createLteTwampSenderWsOperationalStatus(OperStatusStates value) {
        return new JAXBElement<OperStatusStates>(_LteTwampSenderWsOperationalStatus_QNAME, OperStatusStates.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperFailReasonStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatusFailureReason", scope = LteTwampSenderWs.class)
    public JAXBElement<OperFailReasonStatusStates> createLteTwampSenderWsOperationalStatusFailureReason(OperFailReasonStatusStates value) {
        return new JAXBElement<OperFailReasonStatusStates>(_LteTwampSenderWsOperationalStatusFailureReason_QNAME, OperFailReasonStatusStates.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReflectorUdpPort", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsReflectorUdpPort(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsReflectorUdpPort_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfSamplesInSession", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsNumberOfSamplesInSession(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsNumberOfSamplesInSession_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReflectorIPAddressStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReflSvrIpAddressStatus", scope = LteTwampSenderWs.class)
    public JAXBElement<ReflectorIPAddressStatusStates> createLteTwampSenderWsReflSvrIpAddressStatus(ReflectorIPAddressStatusStates value) {
        return new JAXBElement<ReflectorIPAddressStatusStates>(_LteTwampSenderWsReflSvrIpAddressStatus_QNAME, ReflectorIPAddressStatusStates.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SenderUdpPort", scope = LteTwampSenderWs.class)
    public JAXBElement<Integer> createLteTwampSenderWsSenderUdpPort(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsSenderUdpPort_QNAME, Integer.class, LteTwampSenderWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsResetRequired", scope = EnbResetRequiredStatusResult.class)
    public JAXBElement<Boolean> createEnbResetRequiredStatusResultIsResetRequired(Boolean value) {
        return new JAXBElement<Boolean>(_EnbResetRequiredStatusResultIsResetRequired_QNAME, Boolean.class, EnbResetRequiredStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerIpAddressStatesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BhQosBwReservationServerIPAddressCbrStatus", scope = ServerIPAddressListStatusWs.class)
    public JAXBElement<ServerIpAddressStatesWs> createServerIPAddressListStatusWsBhQosBwReservationServerIPAddressCbrStatus(ServerIpAddressStatesWs value) {
        return new JAXBElement<ServerIpAddressStatesWs>(_ServerIPAddressListStatusWsBhQosBwReservationServerIPAddressCbrStatus_QNAME, ServerIpAddressStatesWs.class, ServerIPAddressListStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpAddressStatesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BhQosFtpServerIpAddressStatus", scope = FtpIpAddressStatusWs.class)
    public JAXBElement<IpAddressStatesWs> createFtpIpAddressStatusWsBhQosFtpServerIpAddressStatus(IpAddressStatesWs value) {
        return new JAXBElement<IpAddressStatesWs>(_FtpIpAddressStatusWsBhQosFtpServerIpAddressStatus_QNAME, IpAddressStatesWs.class, FtpIpAddressStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityGbrUl", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityGbrUl(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityGbrUl_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityGbrDl", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityGbrDl(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityGbrDl_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityMcsUl", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityMcsUl(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityMcsUl_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityMcsDl", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityMcsDl(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityMcsDl_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityLayersNumber", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityLayersNumber(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityLayersNumber_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrameStructureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityFrameStructure", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<FrameStructureTypes> createLteQosHoRelayQualityWsQosHoRelayQualityFrameStructure(FrameStructureTypes value) {
        return new JAXBElement<FrameStructureTypes>(_LteQosHoRelayQualityWsQosHoRelayQualityFrameStructure_QNAME, FrameStructureTypes.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayQualityChannelBandwidths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityChannelBw", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<RelayQualityChannelBandwidths> createLteQosHoRelayQualityWsQosHoRelayQualityChannelBw(RelayQualityChannelBandwidths value) {
        return new JAXBElement<RelayQualityChannelBandwidths>(_LteQosHoRelayQualityWsQosHoRelayQualityChannelBw_QNAME, RelayQualityChannelBandwidths.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityPhr", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityPhr(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityPhr_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityPhrRbs", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityPhrRbs(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityPhrRbs_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualitySyncCounter", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualitySyncCounter(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualitySyncCounter_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosHoRelayQualityAcceptableCalls", scope = LteQosHoRelayQualityWs.class)
    public JAXBElement<Integer> createLteQosHoRelayQualityWsQosHoRelayQualityAcceptableCalls(Integer value) {
        return new JAXBElement<Integer>(_LteQosHoRelayQualityWsQosHoRelayQualityAcceptableCalls_QNAME, Integer.class, LteQosHoRelayQualityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AcceptableCalls", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsAcceptableCalls(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsAcceptableCalls_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BearerStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BearerStatusD1", scope = LteBhQosStatusWs.class)
    public JAXBElement<BearerStates> createLteBhQosStatusWsBearerStatusD1(BearerStates value) {
        return new JAXBElement<BearerStates>(_LteBhQosStatusWsBearerStatusD1_QNAME, BearerStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BearerStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BearerStatusD2", scope = LteBhQosStatusWs.class)
    public JAXBElement<BearerStates> createLteBhQosStatusWsBearerStatusD2(BearerStates value) {
        return new JAXBElement<BearerStates>(_LteBhQosStatusWsBearerStatusD2_QNAME, BearerStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MovingHighLimit", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsMovingHighLimit(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsMovingHighLimit_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasResultStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasResult", scope = LteBhQosStatusWs.class)
    public JAXBElement<MeasResultStates> createLteBhQosStatusWsMeasResult(MeasResultStates value) {
        return new JAXBElement<MeasResultStates>(_LteBhQosStatusWsMeasResult_QNAME, MeasResultStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZeroOngoingCalls", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsZeroOngoingCalls(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsZeroOngoingCalls_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbrStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpCbrStatus", scope = LteBhQosStatusWs.class)
    public JAXBElement<CbrStates> createLteBhQosStatusWsIpCbrStatus(CbrStates value) {
        return new JAXBElement<CbrStates>(_LteBhQosStatusWsIpCbrStatus_QNAME, CbrStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpAddressIndex", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsIpAddressIndex(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsIpAddressIndex_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BwMeasurementResultStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BwMeasurementResult", scope = LteBhQosStatusWs.class)
    public JAXBElement<BwMeasurementResultStates> createLteBhQosStatusWsBwMeasurementResult(BwMeasurementResultStates value) {
        return new JAXBElement<BwMeasurementResultStates>(_LteBhQosStatusWsBwMeasurementResult_QNAME, BwMeasurementResultStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpeBw", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsCpeBw(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsCpeBw_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpeDlBw", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsCpeDlBw(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsCpeDlBw_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpeUlBw", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsCpeUlBw(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsCpeUlBw_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Delta", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsDelta(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsDelta_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMeasurement", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsDlMeasurement(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsDlMeasurement_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbrRequestedBw", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsMbrRequestedBw(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsMbrRequestedBw_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbrRequestedCalls", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsMbrRequestedCalls(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsMbrRequestedCalls_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMeasurement", scope = LteBhQosStatusWs.class)
    public JAXBElement<Integer> createLteBhQosStatusWsUlMeasurement(Integer value) {
        return new JAXBElement<Integer>(_LteBhQosStatusWsUlMeasurement_QNAME, Integer.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VolteBh", scope = LteBhQosStatusWs.class)
    public JAXBElement<EnabledDisabledStates> createLteBhQosStatusWsVolteBh(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteBhQosStatusWsVolteBh_QNAME, EnabledDisabledStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BhQos", scope = LteBhQosStatusWs.class)
    public JAXBElement<EnabledDisabledStates> createLteBhQosStatusWsBhQos(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteBhQosStatusWsBhQos_QNAME, EnabledDisabledStates.class, LteBhQosStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrsEnabled", scope = LteCbrsStatusWs.class)
    public JAXBElement<EnabledDisabledStates> createLteCbrsStatusWsCbrsEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteCbrsStatusWsCbrsEnabled_QNAME, EnabledDisabledStates.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CbrsStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbsdState", scope = LteCbrsStatusWs.class)
    public JAXBElement<CbrsStates> createLteCbrsStatusWsCbsdState(CbrsStates value) {
        return new JAXBElement<CbrsStates>(_LteCbrsStatusWsCbsdState_QNAME, CbrsStates.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell1AssignedBandwidth", scope = LteCbrsStatusWs.class)
    public JAXBElement<String> createLteCbrsStatusWsCell1AssignedBandwidth(String value) {
        return new JAXBElement<String>(_LteCbrsStatusWsCell1AssignedBandwidth_QNAME, String.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell1DlEarfcn", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell1DlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell1DlEarfcn_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell1AssignedFrequency", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell1AssignedFrequency(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell1AssignedFrequency_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell1AssignedTxPower", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell1AssignedTxPower(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell1AssignedTxPower_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Grant1ExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsGrant1ExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsGrant1ExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Grant1TransmissionExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsGrant1TransmissionExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsGrant1TransmissionExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell2AssignedBandwidth", scope = LteCbrsStatusWs.class)
    public JAXBElement<String> createLteCbrsStatusWsCell2AssignedBandwidth(String value) {
        return new JAXBElement<String>(_LteCbrsStatusWsCell2AssignedBandwidth_QNAME, String.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell2DlEarfcn", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell2DlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell2DlEarfcn_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell2AssignedFrequency", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell2AssignedFrequency(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell2AssignedFrequency_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cell2AssignedTxPower", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCell2AssignedTxPower(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCell2AssignedTxPower_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Grant2ExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsGrant2ExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsGrant2ExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Grant2TransmissionExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsGrant2TransmissionExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsGrant2TransmissionExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsCarrierAggModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CarrierAggregationMode", scope = LteCbrsStatusWs.class)
    public JAXBElement<WsCarrierAggModes> createLteCbrsStatusWsCarrierAggregationMode(WsCarrierAggModes value) {
        return new JAXBElement<WsCarrierAggModes>(_LteCbrsStatusWsCarrierAggregationMode_QNAME, WsCarrierAggModes.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasurementBandwidthKhz", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsMeasurementBandwidthKhz(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsMeasurementBandwidthKhz_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbDBID", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<BigDecimal> createEnbUtraNeighbourStatusWsNbDBID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbUtraNeighbourStatusWsNbDBID_QNAME, BigDecimal.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FrameDuplex", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<RfProfileDuplexModes> createEnbUtraNeighbourStatusWsFrameDuplex(RfProfileDuplexModes value) {
        return new JAXBElement<RfProfileDuplexModes>(_EnbUtraNeighbourStatusWsFrameDuplex_QNAME, RfProfileDuplexModes.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ArfcnBand", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsArfcnBand(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsArfcnBand_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RncId", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsRncId(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsRncId_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Lac", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsLac(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsLac_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rac", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsRac(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsRac_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsArfcn(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsArfcn_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsgId", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<Integer> createEnbUtraNeighbourStatusWsCsgId(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsCsgId_QNAME, Integer.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoCtrlState", scope = EnbUtraNeighbourStatusWs.class)
    public JAXBElement<HoControlStateTypes> createEnbUtraNeighbourStatusWsHoCtrlState(HoControlStateTypes value) {
        return new JAXBElement<HoControlStateTypes>(_EnbUtraNeighbourStatusWsHoCtrlState_QNAME, HoControlStateTypes.class, EnbUtraNeighbourStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Vlan", scope = LteNetworkElementStatusWs.class)
    public JAXBElement<Integer> createLteNetworkElementStatusWsVlan(Integer value) {
        return new JAXBElement<Integer>(_LteNetworkElementStatusWsVlan_QNAME, Integer.class, LteNetworkElementStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MmeOverloadStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadStatus", scope = LteNetworkElementStatusWs.class)
    public JAXBElement<MmeOverloadStatus> createLteNetworkElementStatusWsMmeOverloadStatus(MmeOverloadStatus value) {
        return new JAXBElement<MmeOverloadStatus>(_LteNetworkElementStatusWsMmeOverloadStatus_QNAME, MmeOverloadStatus.class, LteNetworkElementStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MmeOverloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadResponse", scope = LteNetworkElementStatusWs.class)
    public JAXBElement<MmeOverloadResponse> createLteNetworkElementStatusWsMmeOverloadResponse(MmeOverloadResponse value) {
        return new JAXBElement<MmeOverloadResponse>(_LteNetworkElementStatusWsMmeOverloadResponse_QNAME, MmeOverloadResponse.class, LteNetworkElementStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatusInformation", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Boolean> createRelayEnbWifiStatusWsStatusInformation(Boolean value) {
        return new JAXBElement<Boolean>(_RelayEnbWifiStatusWsStatusInformation_QNAME, Boolean.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpStatusValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<OpStatusValuesWs> createRelayEnbWifiStatusWsOperationalStatus(OpStatusValuesWs value) {
        return new JAXBElement<OpStatusValuesWs>(_LteTwampSenderWsOperationalStatus_QNAME, OpStatusValuesWs.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus2Dot4GHz", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsRadioStatus2Dot4GHz(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsRadioStatus2Dot4GHz_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus5GHz", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsRadioStatus5GHz(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsRadioStatus5GHz_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel2Dot4", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannel2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannel2Dot4_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth2Dot4", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannelBandwidth2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelBandwidth2Dot4_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower2Dot4", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannelTxPower2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelTxPower2Dot4_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel5", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannel5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannel5_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth5", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannelBandwidth5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelBandwidth5_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower5", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsActiveChannelTxPower5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelTxPower5_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmSeverityValuesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WorstSeverityAlarm", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<AlarmSeverityValuesWs> createRelayEnbWifiStatusWsWorstSeverityAlarm(AlarmSeverityValuesWs value) {
        return new JAXBElement<AlarmSeverityValuesWs>(_RelayEnbWifiStatusWsWorstSeverityAlarm_QNAME, AlarmSeverityValuesWs.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementVlanId", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsManagementVlanId(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsManagementVlanId_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatusInformation", scope = LteWifiStatusWs.class)
    public JAXBElement<Boolean> createLteWifiStatusWsStatusInformation(Boolean value) {
        return new JAXBElement<Boolean>(_RelayEnbWifiStatusWsStatusInformation_QNAME, Boolean.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsOperationalStatus(Integer value) {
        return new JAXBElement<Integer>(_LteTwampSenderWsOperationalStatus_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus2Dot4GHz", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsRadioStatus2Dot4GHz(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsRadioStatus2Dot4GHz_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus5GHz", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsRadioStatus5GHz(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsRadioStatus5GHz_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannel2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannel2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelBandwidth2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelBandwidth2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelTxPower2Dot4(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelTxPower2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannel5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannel5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelBandwidth5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelBandwidth5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelTxPower5(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsActiveChannelTxPower5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WorstSeverityAlarm", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsWorstSeverityAlarm(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsWorstSeverityAlarm_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastReadFromNode", scope = SwStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createSwStatusWsLastReadFromNode(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SwStatusWsLastReadFromNode_QNAME, XMLGregorianCalendar.class, SwStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetDuplex", scope = LteBackhaulWs.class)
    public JAXBElement<DuplexType> createLteBackhaulWsEthernetDuplex(DuplexType value) {
        return new JAXBElement<DuplexType>(_LteBackhaulWsEthernetDuplex_QNAME, DuplexType.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EthernetRate", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsEthernetRate(String value) {
        return new JAXBElement<String>(_LteBackhaulWsEthernetRate_QNAME, String.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PortType", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsPortType(String value) {
        return new JAXBElement<String>(_LteBackhaulWsPortType_QNAME, String.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PortStatus", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsPortStatus(String value) {
        return new JAXBElement<String>(_LteBackhaulWsPortStatus_QNAME, String.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PortSpeed", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsPortSpeed(String value) {
        return new JAXBElement<String>(_LteBackhaulWsPortSpeed_QNAME, String.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FlowControlStatus", scope = LteBackhaulWs.class)
    public JAXBElement<EnabledDisabled> createLteBackhaulWsFlowControlStatus(EnabledDisabled value) {
        return new JAXBElement<EnabledDisabled>(_LteBackhaulWsFlowControlStatus_QNAME, EnabledDisabled.class, LteBackhaulWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsQci(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsQci_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveUeDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsActiveUeDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsActiveUeDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveUeUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsActiveUeUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsActiveUeUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsIpThroughputKbpsDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsIpThroughputKbpsDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsIpThroughputKbpsUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsIpThroughputKbpsUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsPdcpTrafficKbpsDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsPdcpTrafficKbpsDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsPdcpTrafficKbpsUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsPdcpTrafficKbpsUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacTrafficKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsMacTrafficKbpsDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsMacTrafficKbpsDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacTrafficKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsMacTrafficKbpsUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsMacTrafficKbpsUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaAvgThroughputKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsCaAvgThroughputKbpsDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsCaAvgThroughputKbpsDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaAvgThroughputKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsCaAvgThroughputKbpsUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsCaAvgThroughputKbpsUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RlcTrafficKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Double> createLteIpThroughputQciWsRlcTrafficKbpsDl(Double value) {
        return new JAXBElement<Double>(_LteIpThroughputQciWsRlcTrafficKbpsDl_QNAME, Double.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RlcTrafficKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Double> createLteIpThroughputQciWsRlcTrafficKbpsUl(Double value) {
        return new JAXBElement<Double>(_LteIpThroughputQciWsRlcTrafficKbpsUl_QNAME, Double.class, LteIpThroughputQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteIpThroughputCellWs.class)
    public JAXBElement<Integer> createLteIpThroughputCellWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteIpThroughputCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Category", scope = LteUeCategory.class)
    public JAXBElement<Integer> createLteUeCategoryCategory(Integer value) {
        return new JAXBElement<Integer>(_LteUeCategoryCategory_QNAME, Integer.class, LteUeCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUes", scope = LteUeCategory.class)
    public JAXBElement<Integer> createLteUeCategoryConnectedUes(Integer value) {
        return new JAXBElement<Integer>(_LteUeCategoryConnectedUes_QNAME, Integer.class, LteUeCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesDl", scope = LteUeCategory.class)
    public JAXBElement<Integer> createLteUeCategoryConnectedUesDl(Integer value) {
        return new JAXBElement<Integer>(_LteUeCategoryConnectedUesDl_QNAME, Integer.class, LteUeCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesUl", scope = LteUeCategory.class)
    public JAXBElement<Integer> createLteUeCategoryConnectedUesUl(Integer value) {
        return new JAXBElement<Integer>(_LteUeCategoryConnectedUesUl_QNAME, Integer.class, LteUeCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActualMaxUeSupported", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsActualMaxUeSupported(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsActualMaxUeSupported_QNAME, Integer.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesTotal", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsConnectedUesTotal(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsConnectedUesTotal_QNAME, Integer.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPCellMacDataVolumeMbpsDl", scope = LteUeStatusWs.class)
    public JAXBElement<Long> createLteUeStatusWsCaPCellMacDataVolumeMbpsDl(Long value) {
        return new JAXBElement<Long>(_LteUeStatusWsCaPCellMacDataVolumeMbpsDl_QNAME, Long.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPCellMacDataVolumeMbpsUl", scope = LteUeStatusWs.class)
    public JAXBElement<Long> createLteUeStatusWsCaPCellMacDataVolumeMbpsUl(Long value) {
        return new JAXBElement<Long>(_LteUeStatusWsCaPCellMacDataVolumeMbpsUl_QNAME, Long.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaSCellMacDataVolumeMbpsDl", scope = LteUeStatusWs.class)
    public JAXBElement<Long> createLteUeStatusWsCaSCellMacDataVolumeMbpsDl(Long value) {
        return new JAXBElement<Long>(_LteUeStatusWsCaSCellMacDataVolumeMbpsDl_QNAME, Long.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaSCellMacDataVolumeMbpsUl", scope = LteUeStatusWs.class)
    public JAXBElement<Long> createLteUeStatusWsCaSCellMacDataVolumeMbpsUl(Long value) {
        return new JAXBElement<Long>(_LteUeStatusWsCaSCellMacDataVolumeMbpsUl_QNAME, Long.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RttsUeNumInService", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsRttsUeNumInService(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsRttsUeNumInService_QNAME, Integer.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RttsUeNumConfigured", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsRttsUeNumConfigured(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsRttsUeNumConfigured_QNAME, Integer.class, LteUeStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteSonMcimsWs.class)
    public JAXBElement<Integer> createLteSonMcimsWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteSonMcimsWs.class)
    public JAXBElement<Integer> createLteSonMcimsWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McimEnabled", scope = LteSonMcimsWs.class)
    public JAXBElement<EnabledDisabledStates> createLteSonMcimsWsMcimEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteSonMcimsWsMcimEnabled_QNAME, EnabledDisabledStates.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MroEnabled", scope = LteSonMcimsWs.class)
    public JAXBElement<EnabledDisabledStates> createLteSonMcimsWsMroEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteSonMcimsWsMroEnabled_QNAME, EnabledDisabledStates.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MlbEnabled", scope = LteSonMcimsWs.class)
    public JAXBElement<EnabledDisabledStates> createLteSonMcimsWsMlbEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteSonMcimsWsMlbEnabled_QNAME, EnabledDisabledStates.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlTxEnabled", scope = LteSonMcimsWs.class)
    public JAXBElement<EnabledDisabledStates> createLteSonMcimsWsDlTxEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteSonMcimsWsDlTxEnabled_QNAME, EnabledDisabledStates.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlTxPower", scope = LteSonMcimsWs.class)
    public JAXBElement<Integer> createLteSonMcimsWsDlTxPower(Integer value) {
        return new JAXBElement<Integer>(_LteSonMcimsWsDlTxPower_QNAME, Integer.class, LteSonMcimsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteDicicUnmanagedInterferenceStatusWs.class)
    public JAXBElement<Integer> createLteDicicUnmanagedInterferenceStatusWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteDicicUnmanagedInterferenceStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = LteDicicUnmanagedInterferenceStatusWs.class)
    public JAXBElement<Integer> createLteDicicUnmanagedInterferenceStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, LteDicicUnmanagedInterferenceStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AverageRsrp", scope = LteDicicUnmanagedInterferenceStatusWs.class)
    public JAXBElement<Integer> createLteDicicUnmanagedInterferenceStatusWsAverageRsrp(Integer value) {
        return new JAXBElement<Integer>(_LteDicicUnmanagedInterferenceStatusWsAverageRsrp_QNAME, Integer.class, LteDicicUnmanagedInterferenceStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfCellEdgeRbs", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsNumberOfCellEdgeRbs(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsNumberOfCellEdgeRbs_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RbgMapping", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsRbgMapping(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsRbgMapping_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfCeu", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsNumberOfCeu(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsNumberOfCeu_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfCcu", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsNumberOfCcu(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsNumberOfCcu_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CeuRbUsage", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsCeuRbUsage(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsCeuRbUsage_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CcuRbUsage", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsCcuRbUsage(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsCcuRbUsage_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinCeuThreshold", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsMinCeuThreshold(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsMinCeuThreshold_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxCeuThreshold", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsMaxCeuThreshold(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsMaxCeuThreshold_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EffectiveCeuThreshold", scope = LteDicicStatusWs.class)
    public JAXBElement<Integer> createLteDicicStatusWsEffectiveCeuThreshold(Integer value) {
        return new JAXBElement<Integer>(_LteDicicStatusWsEffectiveCeuThreshold_QNAME, Integer.class, LteDicicStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachRootSeqIdx", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPrachRootSeqIdx(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachRootSeqIdx_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachZeroCorrelZoneCfg", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPrachZeroCorrelZoneCfg(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachZeroCorrelZoneCfg_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachCfgIdx", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPrachCfgIdx(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachCfgIdx_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachFreqOffset_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfRaPreambles", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsNumberOfRaPreambles(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsNumberOfRaPreambles_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SizeOfPreambleGroupA", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsSizeOfPreambleGroupA(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsSizeOfPreambleGroupA_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleInitialTargetPower", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPreambleInitialTargetPower(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPreambleInitialTargetPower_QNAME, Integer.class, LteRachStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentRsiValue", scope = LteRsiStatusWs.class)
    public JAXBElement<Integer> createLteRsiStatusWsCurrentRsiValue(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCurrentRsiValue_QNAME, Integer.class, LteRsiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusPci_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbType", scope = LteAnrStatusWs.class)
    public JAXBElement<EnbTypes> createLteAnrStatusWsEnbType(EnbTypes value) {
        return new JAXBElement<EnbTypes>(_LteAnrStatusWsEnbType_QNAME, EnbTypes.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsCellIdentity_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkEarfcn", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsDownlinkEarfcn(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsDownlinkEarfcn_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoControlStatus", scope = LteAnrStatusWs.class)
    public JAXBElement<HoControlStateTypes> createLteAnrStatusWsHoControlStatus(HoControlStateTypes value) {
        return new JAXBElement<HoControlStateTypes>(_LteAnrStatusWsHoControlStatus_QNAME, HoControlStateTypes.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlStatus", scope = LteAnrStatusWs.class)
    public JAXBElement<X2ControlStateTypes> createLteAnrStatusWsX2ControlStatus(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAnrStatusWsX2ControlStatus_QNAME, X2ControlStateTypes.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = LteAnrStatusWs.class)
    public JAXBElement<HandoverType> createLteAnrStatusWsHandoverType(HandoverType value) {
        return new JAXBElement<HandoverType>(_LteAnrStatusWsHandoverType_QNAME, HandoverType.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscoveredByValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiscoveredBy", scope = LteAnrStatusWs.class)
    public JAXBElement<DiscoveredByValues> createLteAnrStatusWsDiscoveredBy(DiscoveredByValues value) {
        return new JAXBElement<DiscoveredByValues>(_LteAnrStatusWsDiscoveredBy_QNAME, DiscoveredByValues.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStaticNeighbour", scope = LteAnrStatusWs.class)
    public JAXBElement<Boolean> createLteAnrStatusWsIsStaticNeighbour(Boolean value) {
        return new JAXBElement<Boolean>(_LteAnrStatusWsIsStaticNeighbour_QNAME, Boolean.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoSuccessRate", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsHoSuccessRate(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsHoSuccessRate_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pi", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPi(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsPi_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffset", scope = LteAnrStatusWs.class)
    public JAXBElement<String> createLteAnrStatusWsQOffset(String value) {
        return new JAXBElement<String>(_LteAnrStatusWsQOffset_QNAME, String.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveQOffset", scope = LteAnrStatusWs.class)
    public JAXBElement<String> createLteAnrStatusWsActiveQOffset(String value) {
        return new JAXBElement<String>(_LteAnrStatusWsActiveQOffset_QNAME, String.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIndividualOffset", scope = LteAnrStatusWs.class)
    public JAXBElement<String> createLteAnrStatusWsCellIndividualOffset(String value) {
        return new JAXBElement<String>(_LteAnrStatusWsCellIndividualOffset_QNAME, String.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveCellIndividualOffset", scope = LteAnrStatusWs.class)
    public JAXBElement<String> createLteAnrStatusWsActiveCellIndividualOffset(String value) {
        return new JAXBElement<String>(_LteAnrStatusWsActiveCellIndividualOffset_QNAME, String.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachRsi", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPrachRsi(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsPrachRsi_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachRsi0CorelZoneConfig", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPrachRsi0CorelZoneConfig(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsPrachRsi0CorelZoneConfig_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachFreqOffset_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachCfgIndex", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPrachCfgIndex(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsPrachCfgIndex_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CommsStatus", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCommsStatus(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsCommsStatus_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NghCellStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellStatus", scope = LteAnrStatusWs.class)
    public JAXBElement<NghCellStatus> createLteAnrStatusWsCellStatus(NghCellStatus value) {
        return new JAXBElement<NghCellStatus>(_LteAnrStatusWsCellStatus_QNAME, NghCellStatus.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsgId", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCsgId(Integer value) {
        return new JAXBElement<Integer>(_EnbUtraNeighbourStatusWsCsgId_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AvgRsrp", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsAvgRsrp(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsAvgRsrp_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterferingNeighbor", scope = LteAnrStatusWs.class)
    public JAXBElement<Boolean> createLteAnrStatusWsInterferingNeighbor(Boolean value) {
        return new JAXBElement<Boolean>(_LteAnrStatusWsInterferingNeighbor_QNAME, Boolean.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CongestionIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DynamicAcBarringCongestionIndicator", scope = DynamicAcBarringStatusWs.class)
    public JAXBElement<CongestionIndicator> createDynamicAcBarringStatusWsDynamicAcBarringCongestionIndicator(CongestionIndicator value) {
        return new JAXBElement<CongestionIndicator>(_DynamicAcBarringStatusWsDynamicAcBarringCongestionIndicator_QNAME, CongestionIndicator.class, DynamicAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CongestionLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DynamicAcBarringCongestionLevel", scope = DynamicAcBarringStatusWs.class)
    public JAXBElement<CongestionLevel> createDynamicAcBarringStatusWsDynamicAcBarringCongestionLevel(CongestionLevel value) {
        return new JAXBElement<CongestionLevel>(_DynamicAcBarringStatusWsDynamicAcBarringCongestionLevel_QNAME, CongestionLevel.class, DynamicAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DynamicAcBarringCongestionDuration", scope = DynamicAcBarringStatusWs.class)
    public JAXBElement<Integer> createDynamicAcBarringStatusWsDynamicAcBarringCongestionDuration(Integer value) {
        return new JAXBElement<Integer>(_DynamicAcBarringStatusWsDynamicAcBarringCongestionDuration_QNAME, Integer.class, DynamicAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqHoTooLateGoodCoverage", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraFreqHoTooLateGoodCoverage(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraFreqHoTooLateGoodCoverage_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqHoTooLateGoodCoverageUnprepCell", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraFreqHoTooLateGoodCoverageUnprepCell(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraFreqHoTooLateGoodCoverageUnprepCell_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqHoTooLatePoorCoverage", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraFreqHoTooLatePoorCoverage(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraFreqHoTooLatePoorCoverage_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutgoingCoverageInterFreqHoAttempts", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsOutgoingCoverageInterFreqHoAttempts(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsOutgoingCoverageInterFreqHoAttempts_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerAdjustment", scope = LteTpmStatusWs.class)
    public JAXBElement<Boolean> createLteTpmStatusWsPowerAdjustment(Boolean value) {
        return new JAXBElement<Boolean>(_LteTpmStatusWsPowerAdjustment_QNAME, Boolean.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PassiveMode", scope = LteTpmStatusWs.class)
    public JAXBElement<Boolean> createLteTpmStatusWsPassiveMode(Boolean value) {
        return new JAXBElement<Boolean>(_LteTpmStatusWsPassiveMode_QNAME, Boolean.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WasEnabled", scope = LteTpmStatusWs.class)
    public JAXBElement<Boolean> createLteTpmStatusWsWasEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteTpmStatusWsWasEnabled_QNAME, Boolean.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MoCycleDuration", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsMoCycleDuration(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsMoCycleDuration_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LongDormancyTime", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsLongDormancyTime(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsLongDormancyTime_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CountTpMoCalls", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsCountTpMoCalls(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsCountTpMoCalls_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CoverageFailureRate", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsCoverageFailureRate(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsCoverageFailureRate_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MobilityFailureRate", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsMobilityFailureRate(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsMobilityFailureRate_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DormancyTime", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsDormancyTime(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsDormancyTime_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConsecutiveHighFailureRateCount", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsConsecutiveHighFailureRateCount(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsConsecutiveHighFailureRateCount_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqHoEarly", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraFreqHoEarly(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraFreqHoEarly_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraHoWrongCell", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraHoWrongCell(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraHoWrongCell_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqOutHoAttempt", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsIntraFreqOutHoAttempt(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsIntraFreqOutHoAttempt_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetPower", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsTargetPower(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsTargetPower_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PTxInusePrevious", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsPTxInusePrevious(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsPTxInusePrevious_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPowerDecidedByTpmMo", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsTxPowerDecidedByTpmMo(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsTxPowerDecidedByTpmMo_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReEstabSameCellPoorCoverage", scope = LteTpmStatusWs.class)
    public JAXBElement<Integer> createLteTpmStatusWsReEstabSameCellPoorCoverage(Integer value) {
        return new JAXBElement<Integer>(_LteTpmStatusWsReEstabSameCellPoorCoverage_QNAME, Integer.class, LteTpmStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellNumber_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalLayerCellGroup_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalLayerIdentity_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalCellId", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsPhysicalCellId_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TacSourceTypesWs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TacSource", scope = LtePciStatusWs.class)
    public JAXBElement<TacSourceTypesWs> createLtePciStatusWsTacSource(TacSourceTypesWs value) {
        return new JAXBElement<TacSourceTypesWs>(_LtePciStatusWsTacSource_QNAME, TacSourceTypesWs.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsTac(Integer value) {
        return new JAXBElement<Integer>(_NlmScanStatusTac_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellBarringModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellBarred", scope = CellAcBarringStatusWs.class)
    public JAXBElement<CellBarringModes> createCellAcBarringStatusWsCellBarred(CellBarringModes value) {
        return new JAXBElement<CellBarringModes>(_CellAcBarringStatusWsCellBarred_QNAME, CellBarringModes.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FactorVoiceR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsFactorVoiceR9(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsFactorVoiceR9_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeVoiceR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsTimeVoiceR9(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsTimeVoiceR9_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpecialAcVoiceR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsSpecialAcVoiceR9(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsSpecialAcVoiceR9_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FactorVideoR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsFactorVideoR9(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsFactorVideoR9_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeVideoR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsTimeVideoR9(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsTimeVideoR9_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpecialAcVideoR9", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsSpecialAcVideoR9(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsSpecialAcVideoR9_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FactorCsfbR10", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsFactorCsfbR10(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsFactorCsfbR10_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeCsfbR10", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsTimeCsfbR10(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsTimeCsfbR10_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpecialAcCsfbR10", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsSpecialAcCsfbR10(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsSpecialAcCsfbR10_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Emergency", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Boolean> createCellAcBarringStatusWsEmergency(Boolean value) {
        return new JAXBElement<Boolean>(_CellAcBarringStatusWsEmergency_QNAME, Boolean.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FactorSig", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsFactorSig(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsFactorSig_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeSig", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsTimeSig(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsTimeSig_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpecialAcSig", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsSpecialAcSig(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsSpecialAcSig_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FactorDat", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsFactorDat(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsFactorDat_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeDat", scope = CellAcBarringStatusWs.class)
    public JAXBElement<String> createCellAcBarringStatusWsTimeDat(String value) {
        return new JAXBElement<String>(_CellAcBarringStatusWsTimeDat_QNAME, String.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpecialAcDat", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsSpecialAcDat(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsSpecialAcDat_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VoiceR9Pres", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsVoiceR9Pres(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsVoiceR9Pres_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VideoR9Pres", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsVideoR9Pres(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsVideoR9Pres_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbR10BarringnPres", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsCsfbR10BarringnPres(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsCsfbR10BarringnPres_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoSigPres", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoSigPres(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoSigPres_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoDatPres", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoDatPres(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoDatPres_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoSigVal", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoSigVal(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoSigVal_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoDatVal", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoDatVal(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoDatVal_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoVoiceVal", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoVoiceVal(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoVoiceVal_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoVideoVal", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoVideoVal(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoVideoVal_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InfoCsfbVal", scope = CellAcBarringStatusWs.class)
    public JAXBElement<Integer> createCellAcBarringStatusWsInfoCsfbVal(Integer value) {
        return new JAXBElement<Integer>(_CellAcBarringStatusWsInfoCsfbVal_QNAME, Integer.class, CellAcBarringStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoldExpiredTime", scope = PtpStatus.class)
    public JAXBElement<Integer> createPtpStatusHoldExpiredTime(Integer value) {
        return new JAXBElement<Integer>(_PtpStatusHoldExpiredTime_QNAME, Integer.class, PtpStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivePtpTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveMasterStatus", scope = PtpStatus.class)
    public JAXBElement<ActivePtpTypes> createPtpStatusActiveMasterStatus(ActivePtpTypes value) {
        return new JAXBElement<ActivePtpTypes>(_PtpDetailsWsActiveMasterStatus_QNAME, ActivePtpTypes.class, PtpStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveSource", scope = SynchronizationSource.class)
    public JAXBElement<ClockSources> createSynchronizationSourceActiveSource(ClockSources value) {
        return new JAXBElement<ClockSources>(_SynchronizationDetailsWsActiveSource_QNAME, ClockSources.class, SynchronizationSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnbSyncStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncState", scope = SynchronizationSource.class)
    public JAXBElement<EnbSyncStatus> createSynchronizationSourceSyncState(EnbSyncStatus value) {
        return new JAXBElement<EnbSyncStatus>(_SynchronizationSourceSyncState_QNAME, EnbSyncStatus.class, SynchronizationSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoldoverExpiredTime", scope = SynchronizationSource.class)
    public JAXBElement<Integer> createSynchronizationSourceHoldoverExpiredTime(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationSourceHoldoverExpiredTime_QNAME, Integer.class, SynchronizationSource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSourceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveSource", scope = SynchronizationStatus.class)
    public JAXBElement<ClockSourceTypes> createSynchronizationStatusActiveSource(ClockSourceTypes value) {
        return new JAXBElement<ClockSourceTypes>(_SynchronizationDetailsWsActiveSource_QNAME, ClockSourceTypes.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncState", scope = SynchronizationStatus.class)
    public JAXBElement<SyncStates> createSynchronizationStatusSyncState(SyncStates value) {
        return new JAXBElement<SyncStates>(_SynchronizationSourceSyncState_QNAME, SyncStates.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoldoverExpiredTime", scope = SynchronizationStatus.class)
    public JAXBElement<Integer> createSynchronizationStatusHoldoverExpiredTime(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationSourceHoldoverExpiredTime_QNAME, Integer.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxEnable", scope = SynchronizationStatus.class)
    public JAXBElement<EnabledDisabledValues> createSynchronizationStatusTxEnable(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_SynchronizationStatusTxEnable_QNAME, EnabledDisabledValues.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnableExtPps", scope = SynchronizationStatus.class)
    public JAXBElement<EnabledDisabledValues> createSynchronizationStatusEnableExtPps(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_SynchronizationStatusEnableExtPps_QNAME, EnabledDisabledValues.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SwitchRate", scope = SynchronizationStatus.class)
    public JAXBElement<Integer> createSynchronizationStatusSwitchRate(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationStatusSwitchRate_QNAME, Integer.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastSwitchTime", scope = SynchronizationStatus.class)
    public JAXBElement<Integer> createSynchronizationStatusLastSwitchTime(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationStatusLastSwitchTime_QNAME, Integer.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeNodeBClockStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeNodeBClock", scope = SynchronizationStatus.class)
    public JAXBElement<DeNodeBClockStatus> createSynchronizationStatusDeNodeBClock(DeNodeBClockStatus value) {
        return new JAXBElement<DeNodeBClockStatus>(_SynchronizationStatusDeNodeBClock_QNAME, DeNodeBClockStatus.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackedSatellites", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusTrackedSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsDetailsWsTrackedSatellites_QNAME, Integer.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VisibleSatellites", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusVisibleSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsDetailsWsVisibleSatellites_QNAME, Integer.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrapStatusGpsComms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsComms", scope = GpsStatus.class)
    public JAXBElement<TrapStatusGpsComms> createGpsStatusGpsComms(TrapStatusGpsComms value) {
        return new JAXBElement<TrapStatusGpsComms>(_GpsStatusGpsComms_QNAME, TrapStatusGpsComms.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrapStatusGpsLock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLock", scope = GpsStatus.class)
    public JAXBElement<TrapStatusGpsLock> createGpsStatusGpsLock(TrapStatusGpsLock value) {
        return new JAXBElement<TrapStatusGpsLock>(_GpsStatusGpsLock_QNAME, TrapStatusGpsLock.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrapStatusGpsSnr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsSnr", scope = GpsStatus.class)
    public JAXBElement<TrapStatusGpsSnr> createGpsStatusGpsSnr(TrapStatusGpsSnr value) {
        return new JAXBElement<TrapStatusGpsSnr>(_GpsStatusGpsSnr_QNAME, TrapStatusGpsSnr.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GpsFileStatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsFileStatus", scope = GpsStatus.class)
    public JAXBElement<GpsFileStatusValues> createGpsStatusGpsFileStatus(GpsFileStatusValues value) {
        return new JAXBElement<GpsFileStatusValues>(_GpsDetailsWsGpsFileStatus_QNAME, GpsFileStatusValues.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LocationAccuracy", scope = GpsStatus.class)
    public JAXBElement<BigDecimal> createGpsStatusLocationAccuracy(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GpsStatusLocationAccuracy_QNAME, BigDecimal.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpRefLongitude", scope = GpsStatus.class)
    public JAXBElement<BigDecimal> createGpsStatusPnpRefLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GpsStatusPnpRefLongitude_QNAME, BigDecimal.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpRefLatitude", scope = GpsStatus.class)
    public JAXBElement<BigDecimal> createGpsStatusPnpRefLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GpsStatusPnpRefLatitude_QNAME, BigDecimal.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpRefLocationAccuracy", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusPnpRefLocationAccuracy(Integer value) {
        return new JAXBElement<Integer>(_GpsStatusPnpRefLocationAccuracy_QNAME, Integer.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Status", scope = Sensor.class)
    public JAXBElement<StatusValues> createSensorStatus(StatusValues value) {
        return new JAXBElement<StatusValues>(_SynchronizationSourceItemWsStatus_QNAME, StatusValues.class, Sensor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SystemUptime", scope = NodeTimeStatusGetResult.class)
    public JAXBElement<Long> createNodeTimeStatusGetResultSystemUptime(Long value) {
        return new JAXBElement<Long>(_NodeTimeStatusGetResultSystemUptime_QNAME, Long.class, NodeTimeStatusGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NodeTime", scope = NodeTimeStatusGetResult.class)
    public JAXBElement<XMLGregorianCalendar> createNodeTimeStatusGetResultNodeTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NodeTimeStatusGetResultNodeTime_QNAME, XMLGregorianCalendar.class, NodeTimeStatusGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAnrEnabled", scope = LteSonAnrGetResult.class)
    public JAXBElement<Boolean> createLteSonAnrGetResultIsAnrEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonAnrGetResultIsAnrEnabled_QNAME, Boolean.class, LteSonAnrGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AirSonOptimizationMode", scope = LteAirSonOptimizationStatusGetResult.class)
    public JAXBElement<EnabledDisabledStates> createLteAirSonOptimizationStatusGetResultAirSonOptimizationMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteAirSonOptimizationStatusGetResultAirSonOptimizationMode_QNAME, EnabledDisabledStates.class, LteAirSonOptimizationStatusGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TpmMode", scope = LteAirSonOptimizationStatusGetResult.class)
    public JAXBElement<EnabledDisabledStates> createLteAirSonOptimizationStatusGetResultTpmMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_LteAirSonOptimizationStatusGetResultTpmMode_QNAME, EnabledDisabledStates.class, LteAirSonOptimizationStatusGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TpmStatus", scope = LteSonTpmGetResult.class)
    public JAXBElement<Boolean> createLteSonTpmGetResultTpmStatus(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonTpmGetResultTpmStatus_QNAME, Boolean.class, LteSonTpmGetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualAutomaticValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciStatus", scope = LteSonPciGetResult.class)
    public JAXBElement<ManualAutomaticValues> createLteSonPciGetResultPciStatus(ManualAutomaticValues value) {
        return new JAXBElement<ManualAutomaticValues>(_LteSonPciGetResultPciStatus_QNAME, ManualAutomaticValues.class, LteSonPciGetResult.class, value);
    }

}
