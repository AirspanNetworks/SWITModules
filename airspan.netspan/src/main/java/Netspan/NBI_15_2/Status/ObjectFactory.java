
package Netspan.NBI_15_2.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import Netspan.API.Enums.HandoverType;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_2.Status package. 
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
    private final static QName _RelayCdclWsPdclRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdclRank");
    private final static QName _RelayCdclWsScanListRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "ScanListRank");
    private final static QName _RelayCdclWsWindowLocation_QNAME = new QName("http://Airspan.Netspan.WebServices", "WindowLocation");
    private final static QName _RelayCdclWsGpsLockDetection_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockDetection");
    private final static QName _RelayCdclWsBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _RelayCdclWsPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci");
    private final static QName _RelayCdclWsEci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Eci");
    private final static QName _RelayCdclWsEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _RelayCdclWsRankIndicator_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankIndicator");
    private final static QName _RelayCdclWsSignalToNoiseRatio_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalToNoiseRatio");
    private final static QName _RelayCdclWsLogicalAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "LogicalAngle");
    private final static QName _RelayCdclWsHeadingAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeadingAngle");
    private final static QName _RelayCdclWsTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tac");
    private final static QName _RelayCdclWsSpectralEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "SpectralEfficiency");
    private final static QName _RelayCdclWsRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp");
    private final static QName _RelayCdclWsRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq");
    private final static QName _RelayCdclWsUsableLocation_QNAME = new QName("http://Airspan.Netspan.WebServices", "UsableLocation");
    private final static QName _RelayCdclWsDrm_QNAME = new QName("http://Airspan.Netspan.WebServices", "Drm");
    private final static QName _RelayConnectedDevicesWsDeviceType_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeviceType");
    private final static QName _RelayConnectedDevicesWsConnectionStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionStatus");
    private final static QName _RelayConnectedDevicesWsLeaseTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeaseTime");
    private final static QName _RelayApnWsState_QNAME = new QName("http://Airspan.Netspan.WebServices", "State");
    private final static QName _RelayStatusWsCellID_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellID");
    private final static QName _RelayStatusWsLteBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "LteBandwidth");
    private final static QName _RelayStatusWsSccCaState_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccCaState");
    private final static QName _RelayStatusWsSccBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccBand");
    private final static QName _RelayStatusWsSccBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccBandwidth");
    private final static QName _RelayStatusWsSccPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccPci");
    private final static QName _RelayStatusWsSccEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "SccEarfcn");
    private final static QName _RelayStatusWsP1CdclUsedStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "P1CdclUsedStatus");
    private final static QName _RelayStatusWsP1PdclUsedStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "P1PdclUsedStatus");
    private final static QName _RelayStatusWsScanStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "ScanStart");
    private final static QName _RelayStatusWsLastScanStartTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastScanStartTime");
    private final static QName _RelayStatusWsIsEnbConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnbConnected");
    private final static QName _RelayStatusWsRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rssi");
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
    private final static QName _IBridgeTermRxNullingStatusRankingIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankingIndex");
    private final static QName _IBridgeTermRxNullingStatusPatternIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PatternIndex");
    private final static QName _IBridgeTermRxNullingStatusNullingQi_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingQi");
    private final static QName _IBridgeTermRxNullingStatusNumFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumFrames");
    private final static QName _IBridgeTermRxNullingStatusNumMeasurements_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumMeasurements");
    private final static QName _IBridgeTermScannedChannelFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _IBridgeTermScannedChannelBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
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
    private final static QName _IBridgeTermChannelProfilePriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _FineAlignShmResultId_QNAME = new QName("http://Airspan.Netspan.WebServices", "Id");
    private final static QName _FineAlignShmResultMotorAzimuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "MotorAzimuth");
    private final static QName _FineAlignShmResultShmStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ShmStatus");
    private final static QName _FineAlignShmResultShm_QNAME = new QName("http://Airspan.Netspan.WebServices", "Shm");
    private final static QName _IBridgeBaseRfStatusWsConfiguredEirpDbm_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfiguredEirpDbm");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignMode");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignAzimuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignAzimuth");
    private final static QName _IBridgeBaseRfStatusWsCalculationStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "CalculationStatus");
    private final static QName _IBridgeBaseRfStatusWsAutoAlignStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoAlignStatus");
    private final static QName _Ib440RfStatusWsTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
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
    private final static QName _LteCellStatusCachedWsCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _LteCellStatusCachedWsPhysicalLayerCellGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerCellGroup");
    private final static QName _LteCellStatusCachedWsPhysicalLayerIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerIdentity");
    private final static QName _LteCellStatusCachedWsPhysicalCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalCellId");
    private final static QName _LteCellStatusCachedWsCurrentRsiValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentRsiValue");
    private final static QName _EnbResetRequiredStatusResultIsResetRequired_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsResetRequired");
    private final static QName _LteCbrsStatusWsCbrsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrsEnabled");
    private final static QName _LteCbrsStatusWsCbsdState_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbsdState");
    private final static QName _LteCbrsStatusWsCbrsAssignedFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrsAssignedFrequency");
    private final static QName _LteCbrsStatusWsCbrsAssignedBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrsAssignedBandwidth");
    private final static QName _LteCbrsStatusWsCbrsAssignedTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrsAssignedTxPower");
    private final static QName _LteCbrsStatusWsGrantExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "GrantExpiryTime");
    private final static QName _LteCbrsStatusWsTransmissionExpiryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "TransmissionExpiryTime");
    private final static QName _LteNetworkElementStatusWsVlan_QNAME = new QName("http://Airspan.Netspan.WebServices", "Vlan");
    private final static QName _LteNetworkElementStatusWsMmeOverloadStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadStatus");
    private final static QName _LteNetworkElementStatusWsMmeOverloadResponse_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadResponse");
    private final static QName _RelayEnbWifiStatusWsStatusInformation_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatusInformation");
    private final static QName _RelayEnbWifiStatusWsOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "OperationalStatus");
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
    private final static QName _LteBackhaulWsAutoNegConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoNegConfig");
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
    private final static QName _LteIpThroughputCellWsCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellNumber");
    private final static QName _LteUeCategoryCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "Category");
    private final static QName _LteUeCategoryConnectedUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUes");
    private final static QName _LteUeStatusWsConnectedUesTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesTotal");
    private final static QName _LteSonMcimsWsMcimEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "McimEnabled");
    private final static QName _LteSonMcimsWsMroEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MroEnabled");
    private final static QName _LteSonMcimsWsMlbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MlbEnabled");
    private final static QName _LteSonMcimsWsDlTxEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlTxEnabled");
    private final static QName _LteSonMcimsWsDlTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlTxPower");
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
    private final static QName _PtpStatusHoldExpiredTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoldExpiredTime");
    private final static QName _PtpStatusActiveMasterStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveMasterStatus");
    private final static QName _SynchronizationStatusActiveSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveSource");
    private final static QName _SynchronizationStatusSyncState_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncState");
    private final static QName _SynchronizationStatusHoldoverExpiredTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoldoverExpiredTime");
    private final static QName _SynchronizationStatusTxEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxEnable");
    private final static QName _SynchronizationStatusEnableExtPps_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableExtPps");
    private final static QName _GpsStatusTrackedSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "TrackedSatellites");
    private final static QName _GpsStatusVisibleSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "VisibleSatellites");
    private final static QName _GpsStatusGpsComms_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsComms");
    private final static QName _GpsStatusGpsLock_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLock");
    private final static QName _GpsStatusGpsSnr_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsSnr");
    private final static QName _GpsStatusGpsFileStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsFileStatus");
    private final static QName _GpsStatusLocationAccuracy_QNAME = new QName("http://Airspan.Netspan.WebServices", "LocationAccuracy");
    private final static QName _GpsStatusPnpRefLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpRefLongitude");
    private final static QName _GpsStatusPnpRefLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpRefLatitude");
    private final static QName _NodeTimeStatusGetResultSystemUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SystemUptime");
    private final static QName _NodeTimeStatusGetResultNodeTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeTime");
    private final static QName _LteSonAnrGetResultIsAnrEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAnrEnabled");
    private final static QName _LteSonPciGetResultPciStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_2.Status
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
     * Create an instance of {@link RelayScanListGet }
     * 
     */
    public RelayScanListGet createRelayScanListGet() {
        return new RelayScanListGet();
    }

    /**
     * Create an instance of {@link RelayScanListGetResponse }
     * 
     */
    public RelayScanListGetResponse createRelayScanListGetResponse() {
        return new RelayScanListGetResponse();
    }

    /**
     * Create an instance of {@link RelayScanListGetResult }
     * 
     */
    public RelayScanListGetResult createRelayScanListGetResult() {
        return new RelayScanListGetResult();
    }

    /**
     * Create an instance of {@link RelayCdclListGet }
     * 
     */
    public RelayCdclListGet createRelayCdclListGet() {
        return new RelayCdclListGet();
    }

    /**
     * Create an instance of {@link RelayCdclListGetResponse }
     * 
     */
    public RelayCdclListGetResponse createRelayCdclListGetResponse() {
        return new RelayCdclListGetResponse();
    }

    /**
     * Create an instance of {@link RelayCdclListGetResult }
     * 
     */
    public RelayCdclListGetResult createRelayCdclListGetResult() {
        return new RelayCdclListGetResult();
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
     * Create an instance of {@link Satellite }
     * 
     */
    public Satellite createSatellite() {
        return new Satellite();
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
     * Create an instance of {@link LteCbrsStatusWs }
     * 
     */
    public LteCbrsStatusWs createLteCbrsStatusWs() {
        return new LteCbrsStatusWs();
    }

    /**
     * Create an instance of {@link EnbResetRequiredStatusResult }
     * 
     */
    public EnbResetRequiredStatusResult createEnbResetRequiredStatusResult() {
        return new EnbResetRequiredStatusResult();
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
     * Create an instance of {@link RelayScanWs }
     * 
     */
    public RelayScanWs createRelayScanWs() {
        return new RelayScanWs();
    }

    /**
     * Create an instance of {@link RelayCdclWs }
     * 
     */
    public RelayCdclWs createRelayCdclWs() {
        return new RelayCdclWs();
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdclRank", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsPdclRank(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsPdclRank_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ScanListRank", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsScanListRank(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsScanListRank_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WindowLocation", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsWindowLocation(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsWindowLocation_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockDetection", scope = RelayCdclWs.class)
    public JAXBElement<Boolean> createRelayCdclWsGpsLockDetection(Boolean value) {
        return new JAXBElement<Boolean>(_RelayCdclWsGpsLockDetection_QNAME, Boolean.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = RelayCdclWs.class)
    public JAXBElement<BandValues> createRelayCdclWsBand(BandValues value) {
        return new JAXBElement<BandValues>(_RelayCdclWsBand_QNAME, BandValues.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsPci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsPci_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsEci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEci_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEarfcn_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndicator", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsRankIndicator(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRankIndicator_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalToNoiseRatio", scope = RelayCdclWs.class)
    public JAXBElement<Double> createRelayCdclWsSignalToNoiseRatio(Double value) {
        return new JAXBElement<Double>(_RelayCdclWsSignalToNoiseRatio_QNAME, Double.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsLogicalAngle_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsHeadingAngle_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsTac(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsTac_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpectralEfficiency", scope = RelayCdclWs.class)
    public JAXBElement<Double> createRelayCdclWsSpectralEfficiency(Double value) {
        return new JAXBElement<Double>(_RelayCdclWsSpectralEfficiency_QNAME, Double.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrp_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrq_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UsableLocation", scope = RelayCdclWs.class)
    public JAXBElement<Integer> createRelayCdclWsUsableLocation(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsUsableLocation_QNAME, Integer.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayCdclWs.class)
    public JAXBElement<BigDecimal> createRelayCdclWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayCdclWsDrm_QNAME, BigDecimal.class, RelayCdclWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WindowLocation", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsWindowLocation(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsWindowLocation_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockDetection", scope = RelayScanWs.class)
    public JAXBElement<Boolean> createRelayScanWsGpsLockDetection(Boolean value) {
        return new JAXBElement<Boolean>(_RelayCdclWsGpsLockDetection_QNAME, Boolean.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = RelayScanWs.class)
    public JAXBElement<BandValues> createRelayScanWsBand(BandValues value) {
        return new JAXBElement<BandValues>(_RelayCdclWsBand_QNAME, BandValues.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsPci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsPci_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsEci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEci_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEarfcn_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndicator", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsRankIndicator(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRankIndicator_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalToNoiseRatio", scope = RelayScanWs.class)
    public JAXBElement<Double> createRelayScanWsSignalToNoiseRatio(Double value) {
        return new JAXBElement<Double>(_RelayCdclWsSignalToNoiseRatio_QNAME, Double.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsLogicalAngle_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsHeadingAngle_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsTac(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsTac_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpectralEfficiency", scope = RelayScanWs.class)
    public JAXBElement<Double> createRelayScanWsSpectralEfficiency(Double value) {
        return new JAXBElement<Double>(_RelayCdclWsSpectralEfficiency_QNAME, Double.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrp_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = RelayScanWs.class)
    public JAXBElement<Integer> createRelayScanWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrq_QNAME, Integer.class, RelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayScanWs.class)
    public JAXBElement<BigDecimal> createRelayScanWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayCdclWsDrm_QNAME, BigDecimal.class, RelayScanWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ApnStatusStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "State", scope = RelayApnWs.class)
    public JAXBElement<ApnStatusStates> createRelayApnWsState(ApnStatusStates value) {
        return new JAXBElement<ApnStatusStates>(_RelayApnWsState_QNAME, ApnStatusStates.class, RelayApnWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Eci", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsEci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEci_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsEarfcn_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsCellID(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsCellID_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsPci_QNAME, Integer.class, RelayStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayCdclWsTac_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccCaState", scope = RelayStatusWs.class)
    public JAXBElement<RelaySccCaStates> createRelayStatusWsSccCaState(RelaySccCaStates value) {
        return new JAXBElement<RelaySccCaStates>(_RelayStatusWsSccCaState_QNAME, RelaySccCaStates.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccBand", scope = RelayStatusWs.class)
    public JAXBElement<RelayBands> createRelayStatusWsSccBand(RelayBands value) {
        return new JAXBElement<RelayBands>(_RelayStatusWsSccBand_QNAME, RelayBands.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccBandwidth", scope = RelayStatusWs.class)
    public JAXBElement<RelaySccBandwidths> createRelayStatusWsSccBandwidth(RelaySccBandwidths value) {
        return new JAXBElement<RelaySccBandwidths>(_RelayStatusWsSccBandwidth_QNAME, RelaySccBandwidths.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccPci", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsSccPci(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsSccPci_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SccEarfcn", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsSccEarfcn(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsSccEarfcn_QNAME, Integer.class, RelayStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayCdclWsLogicalAngle_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsHeadingAngle_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrq_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_RelayCdclWsRsrp_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = RelayStatusWs.class)
    public JAXBElement<Integer> createRelayStatusWsRssi(Integer value) {
        return new JAXBElement<Integer>(_RelayStatusWsRssi_QNAME, Integer.class, RelayStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayCdclWsRankIndicator_QNAME, Integer.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SpectralEfficiency", scope = RelayStatusWs.class)
    public JAXBElement<Double> createRelayStatusWsSpectralEfficiency(Double value) {
        return new JAXBElement<Double>(_RelayCdclWsSpectralEfficiency_QNAME, Double.class, RelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayStatusWs.class)
    public JAXBElement<BigDecimal> createRelayStatusWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayCdclWsDrm_QNAME, BigDecimal.class, RelayStatusWs.class, value);
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
        return new JAXBElement<Double>(_IBridgeTermScannedChannelBandwidth_QNAME, Double.class, IBridgeTermScannedChannel.class, value);
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
        return new JAXBElement<Double>(_IBridgeTermScannedChannelBandwidth_QNAME, Double.class, IBridgeTermActiveChannel.class, value);
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
        return new JAXBElement<Integer>(_IBridgeTermChannelProfilePriority_QNAME, Integer.class, IBridgeTermChannelProfile.class, value);
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
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxPower_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsResetRequired", scope = EnbResetRequiredStatusResult.class)
    public JAXBElement<Boolean> createEnbResetRequiredStatusResultIsResetRequired(Boolean value) {
        return new JAXBElement<Boolean>(_EnbResetRequiredStatusResultIsResetRequired_QNAME, Boolean.class, EnbResetRequiredStatusResult.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrsAssignedFrequency", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCbrsAssignedFrequency(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCbrsAssignedFrequency_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrsAssignedBandwidth", scope = LteCbrsStatusWs.class)
    public JAXBElement<String> createLteCbrsStatusWsCbrsAssignedBandwidth(String value) {
        return new JAXBElement<String>(_LteCbrsStatusWsCbrsAssignedBandwidth_QNAME, String.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrsAssignedTxPower", scope = LteCbrsStatusWs.class)
    public JAXBElement<Integer> createLteCbrsStatusWsCbrsAssignedTxPower(Integer value) {
        return new JAXBElement<Integer>(_LteCbrsStatusWsCbrsAssignedTxPower_QNAME, Integer.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GrantExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsGrantExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsGrantExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TransmissionExpiryTime", scope = LteCbrsStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createLteCbrsStatusWsTransmissionExpiryTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LteCbrsStatusWsTransmissionExpiryTime_QNAME, XMLGregorianCalendar.class, LteCbrsStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsOperationalStatus(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsOperationalStatus_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WorstSeverityAlarm", scope = RelayEnbWifiStatusWs.class)
    public JAXBElement<Integer> createRelayEnbWifiStatusWsWorstSeverityAlarm(Integer value) {
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsWorstSeverityAlarm_QNAME, Integer.class, RelayEnbWifiStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayEnbWifiStatusWsOperationalStatus_QNAME, Integer.class, LteWifiStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoNegConfig", scope = LteBackhaulWs.class)
    public JAXBElement<EnabledDisabled> createLteBackhaulWsAutoNegConfig(EnabledDisabled value) {
        return new JAXBElement<EnabledDisabled>(_LteBackhaulWsAutoNegConfig_QNAME, EnabledDisabled.class, LteBackhaulWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellNumber", scope = LteIpThroughputCellWs.class)
    public JAXBElement<Integer> createLteIpThroughputCellWsCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputCellWsCellNumber_QNAME, Integer.class, LteIpThroughputCellWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellStatusCachedWsCellId_QNAME, Integer.class, LteUeStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayCdclWsPci_QNAME, Integer.class, LteAnrStatusWs.class, value);
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
        return new JAXBElement<Integer>(_RelayCdclWsTac_QNAME, Integer.class, LteAnrStatusWs.class, value);
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
        return new JAXBElement<ActivePtpTypes>(_PtpStatusActiveMasterStatus_QNAME, ActivePtpTypes.class, PtpStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSourceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveSource", scope = SynchronizationStatus.class)
    public JAXBElement<ClockSourceTypes> createSynchronizationStatusActiveSource(ClockSourceTypes value) {
        return new JAXBElement<ClockSourceTypes>(_SynchronizationStatusActiveSource_QNAME, ClockSourceTypes.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncState", scope = SynchronizationStatus.class)
    public JAXBElement<SyncStates> createSynchronizationStatusSyncState(SyncStates value) {
        return new JAXBElement<SyncStates>(_SynchronizationStatusSyncState_QNAME, SyncStates.class, SynchronizationStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoldoverExpiredTime", scope = SynchronizationStatus.class)
    public JAXBElement<Integer> createSynchronizationStatusHoldoverExpiredTime(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationStatusHoldoverExpiredTime_QNAME, Integer.class, SynchronizationStatus.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackedSatellites", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusTrackedSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsStatusTrackedSatellites_QNAME, Integer.class, GpsStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VisibleSatellites", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusVisibleSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsStatusVisibleSatellites_QNAME, Integer.class, GpsStatus.class, value);
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
        return new JAXBElement<GpsFileStatusValues>(_GpsStatusGpsFileStatus_QNAME, GpsFileStatusValues.class, GpsStatus.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ManualAutomaticValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciStatus", scope = LteSonPciGetResult.class)
    public JAXBElement<ManualAutomaticValues> createLteSonPciGetResultPciStatus(ManualAutomaticValues value) {
        return new JAXBElement<ManualAutomaticValues>(_LteSonPciGetResultPciStatus_QNAME, ManualAutomaticValues.class, LteSonPciGetResult.class, value);
    }

}
