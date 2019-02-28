
package Netspan.NBI_14_50.API.Status;

import java.math.BigInteger;
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
 * generated in the Netspan.NBI_14_50.API.Status package. 
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
    private final static QName _LteRsiStatusWsCurrentRsiValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentRsiValue");
    private final static QName _LteUeStatusWsConnectedUesTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesTotal");
    private final static QName _LteUeStatusWsCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _LteIpThroughputCellWsCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellNumber");
    private final static QName _IRelayScanWsEcgi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ecgi");
    private final static QName _IRelayScanWsScanListRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "ScanListRank");
    private final static QName _IRelayScanWsHeadingAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeadingAngle");
    private final static QName _IRelayScanWsRankIndicator_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankIndicator");
    private final static QName _IRelayScanWsEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _IRelayScanWsLogicalAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "LogicalAngle");
    private final static QName _IRelayScanWsSignalToNoiseRatio_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalToNoiseRatio");
    private final static QName _IRelayScanWsCellIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity");
    private final static QName _IRelayScanWsPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci");
    private final static QName _IRelayScanWsBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _IRelayScanWsPdclRank_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdclRank");
    private final static QName _Ib440RfStatusWsSNR_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNR");
    private final static QName _Ib440RfStatusWsRxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxLinkEfficiency");
    private final static QName _Ib440RfStatusWsTxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxLinkEfficiency");
    private final static QName _Ib440RfStatusWsRxPhyRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxPhyRate");
    private final static QName _Ib440RfStatusWsTxPhyRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPhyRate");
    private final static QName _Ib440RfStatusWsRxSignalStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrength");
    private final static QName _Ib440RfStatusWsUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uptime");
    private final static QName _Ib440RfStatusWsRxSignalStrengthChannel1_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthChannel1");
    private final static QName _Ib440RfStatusWsRxSignalStrengthChannel0_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthChannel0");
    private final static QName _Ib440RfStatusWsTxSignalStrengthChannel0_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthChannel0");
    private final static QName _Ib440RfStatusWsTxSignalStrengthChannel1_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthChannel1");
    private final static QName _Ib440RfStatusWsTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _Ib440RfStatusWsFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _LteBackhaulWsEthernetRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetRate");
    private final static QName _LteBackhaulWsAutoNegConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoNegConfig");
    private final static QName _LteBackhaulWsPortType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortType");
    private final static QName _LteBackhaulWsEthernetDuplex_QNAME = new QName("http://Airspan.Netspan.WebServices", "EthernetDuplex");
    private final static QName _LteBackhaulWsFlowControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "FlowControlStatus");
    private final static QName _LteBackhaulWsPortSpeed_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortSpeed");
    private final static QName _LteBackhaulWsPortStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "PortStatus");
    private final static QName _IBridgeTermChannelProfilePriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _IBridgeTermActiveChannelNullingQi_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingQi");
    private final static QName _IBridgeTermActiveChannelPreambleIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleIndex");
    private final static QName _IBridgeTermActiveChannelCurrentPowerTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentPowerTotal");
    private final static QName _IBridgeTermActiveChannelAntennaPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaPort");
    private final static QName _IBridgeTermActiveChannelPreambleFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleFreqOffset");
    private final static QName _IBridgeTermActiveChannelPreambleCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleCinr");
    private final static QName _IBridgeTermActiveChannelNullingCurrentPattern_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingCurrentPattern");
    private final static QName _IBridgeTermActiveChannelCurrentPowerPerTone_QNAME = new QName("http://Airspan.Netspan.WebServices", "CurrentPowerPerTone");
    private final static QName _IBridgeTermActiveChannelRfGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "RfGain");
    private final static QName _IBridgeTermActiveChannelNullingCurrentReferencePattern_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullingCurrentReferencePattern");
    private final static QName _IBridgeTermActiveChannelLinkLostCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkLostCount");
    private final static QName _IBridgeTermActiveChannelBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _IBridgeTermScannedChannelChannelQuality_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelQuality");
    private final static QName _IBridgeTermScannedChannelSisoZoneAnt0Cinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "SisoZoneAnt0Cinr");
    private final static QName _IBridgeTermScannedChannelAcqMimo_QNAME = new QName("http://Airspan.Netspan.WebServices", "AcqMimo");
    private final static QName _LteWifiStatusWsActiveChannel5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannel5");
    private final static QName _LteWifiStatusWsActiveChannelBandwidth5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelBandwidth5");
    private final static QName _LteWifiStatusWsOperationalStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "OperationalStatus");
    private final static QName _LteWifiStatusWsStatusInformation_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatusInformation");
    private final static QName _LteWifiStatusWsActiveChannelTxPower2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelTxPower2Dot4");
    private final static QName _LteWifiStatusWsActiveChannelBandwidth2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelBandwidth2Dot4");
    private final static QName _LteWifiStatusWsRadioStatus5GHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioStatus5GHz");
    private final static QName _LteWifiStatusWsRadioStatus2Dot4GHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioStatus2Dot4GHz");
    private final static QName _LteWifiStatusWsActiveChannel2Dot4_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannel2Dot4");
    private final static QName _LteWifiStatusWsWorstSeverityAlarm_QNAME = new QName("http://Airspan.Netspan.WebServices", "WorstSeverityAlarm");
    private final static QName _LteWifiStatusWsActiveChannelTxPower5_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveChannelTxPower5");
    private final static QName _LtePciStatusWsPhysicalLayerIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerIdentity");
    private final static QName _LtePciStatusWsPhysicalLayerCellGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerCellGroup");
    private final static QName _LtePciStatusWsPhysicalCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalCellId");
    private final static QName _GpsStatusGpsSnr_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsSnr");
    private final static QName _GpsStatusVisibleSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "VisibleSatellites");
    private final static QName _GpsStatusGpsComms_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsComms");
    private final static QName _GpsStatusTrackedSatellites_QNAME = new QName("http://Airspan.Netspan.WebServices", "TrackedSatellites");
    private final static QName _GpsStatusGpsLock_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLock");
    private final static QName _LteRachStatusWsPrachCfgIdx_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachCfgIdx");
    private final static QName _LteRachStatusWsPrachZeroCorrelZoneCfg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachZeroCorrelZoneCfg");
    private final static QName _LteRachStatusWsPreambleInitialTargetPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialTargetPower");
    private final static QName _LteRachStatusWsSizeOfPreambleGroupA_QNAME = new QName("http://Airspan.Netspan.WebServices", "SizeOfPreambleGroupA");
    private final static QName _LteRachStatusWsPrachRootSeqIdx_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRootSeqIdx");
    private final static QName _LteRachStatusWsNumberOfRaPreambles_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreambles");
    private final static QName _LteRachStatusWsPrachFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachFreqOffset");
    private final static QName _LteUeCategoryConnectedUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUes");
    private final static QName _LteUeCategoryCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "Category");
    private final static QName _IRelayStatusWsSinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sinr");
    private final static QName _IRelayStatusWsRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp");
    private final static QName _IRelayStatusWsIsEnbConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnbConnected");
    private final static QName _IRelayStatusWsEarfn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfn");
    private final static QName _IRelayStatusWsRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rssi");
    private final static QName _IRelayStatusWsCellID_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellID");
    private final static QName _IRelayStatusWsRadioTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioTxPower");
    private final static QName _IRelayStatusWsIsIRelayConnected_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsIRelayConnected");
    private final static QName _IRelayStatusWsRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq");
    private final static QName _IRelayStatusWsIpAddressType_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpAddressType");
    private final static QName _IRelayStatusWsTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tac");
    private final static QName _NodeTimeStatusGetResultSystemUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SystemUptime");
    private final static QName _NodeTimeStatusGetResultNodeTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeTime");
    private final static QName _SwStatusWsLastReadFromNode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastReadFromNode");
    private final static QName _LteIpThroughputQciWsPdcpTrafficKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsDl");
    private final static QName _LteIpThroughputQciWsPdcpTrafficKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsUl");
    private final static QName _LteIpThroughputQciWsIpThroughputKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpThroughputKbpsDl");
    private final static QName _LteIpThroughputQciWsMacTrafficKbpsDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacTrafficKbpsDl");
    private final static QName _LteIpThroughputQciWsActiveUeUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveUeUl");
    private final static QName _LteIpThroughputQciWsActiveUeDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveUeDl");
    private final static QName _LteIpThroughputQciWsIpThroughputKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpThroughputKbpsUl");
    private final static QName _LteIpThroughputQciWsMacTrafficKbpsUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacTrafficKbpsUl");
    private final static QName _LteIpThroughputQciWsQci_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci");
    private final static QName _LteAnrStatusWsIsStaticNeighbour_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStaticNeighbour");
    private final static QName _LteAnrStatusWsHoSuccessRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoSuccessRate");
    private final static QName _LteAnrStatusWsDownlinkEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkEarfcn");
    private final static QName _LteAnrStatusWsHandoverType_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverType");
    private final static QName _LteAnrStatusWsHoControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoControlStatus");
    private final static QName _LteAnrStatusWsEnbType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbType");
    private final static QName _LteAnrStatusWsDiscoveredBy_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiscoveredBy");
    private final static QName _LteAnrStatusWsX2ControlStatus_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2ControlStatus");
    private final static QName _IBridgeTermRxNullingStatusNumFrames_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumFrames");
    private final static QName _IBridgeTermRxNullingStatusPatternIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PatternIndex");
    private final static QName _IBridgeTermRxNullingStatusNumMeasurements_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumMeasurements");
    private final static QName _IBridgeTermRxNullingStatusRankingIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankingIndex");
    private final static QName _LteSonAnrGetResultIsAnrEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAnrEnabled");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_14_50.API.Status
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link EnbBackhaulInterfaceStatusGet }
     * 
     */
    public EnbBackhaulInterfaceStatusGet createEnbBackhaulInterfaceStatusGet() {
        return new EnbBackhaulInterfaceStatusGet();
    }

    /**
     * Create an instance of {@link EnbIpThroughputStatusGet }
     * 
     */
    public EnbIpThroughputStatusGet createEnbIpThroughputStatusGet() {
        return new EnbIpThroughputStatusGet();
    }

    /**
     * Create an instance of {@link Ib440InterfaceStatusGet }
     * 
     */
    public Ib440InterfaceStatusGet createIb440InterfaceStatusGet() {
        return new Ib440InterfaceStatusGet();
    }

    /**
     * Create an instance of {@link EnbConnectedUeStatusGet }
     * 
     */
    public EnbConnectedUeStatusGet createEnbConnectedUeStatusGet() {
        return new EnbConnectedUeStatusGet();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesGet }
     * 
     */
    public Ib440CommissionedPropertiesGet createIb440CommissionedPropertiesGet() {
        return new Ib440CommissionedPropertiesGet();
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
     * Create an instance of {@link NodePowerGet }
     * 
     */
    public NodePowerGet createNodePowerGet() {
        return new NodePowerGet();
    }

    /**
     * Create an instance of {@link EnbSonRsiStatusGet }
     * 
     */
    public EnbSonRsiStatusGet createEnbSonRsiStatusGet() {
        return new EnbSonRsiStatusGet();
    }

    /**
     * Create an instance of {@link EnbEmbmsStatusGet }
     * 
     */
    public EnbEmbmsStatusGet createEnbEmbmsStatusGet() {
        return new EnbEmbmsStatusGet();
    }

    /**
     * Create an instance of {@link NodeSoftwareStatusGet }
     * 
     */
    public NodeSoftwareStatusGet createNodeSoftwareStatusGet() {
        return new NodeSoftwareStatusGet();
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
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusGet }
     * 
     */
    public IBridgeBaseRfStatusGet createIBridgeBaseRfStatusGet() {
        return new IBridgeBaseRfStatusGet();
    }

    /**
     * Create an instance of {@link IRelayStatusGet }
     * 
     */
    public IRelayStatusGet createIRelayStatusGet() {
        return new IRelayStatusGet();
    }

    /**
     * Create an instance of {@link NodeTimeGet }
     * 
     */
    public NodeTimeGet createNodeTimeGet() {
        return new NodeTimeGet();
    }

    /**
     * Create an instance of {@link NodeCurrentGet }
     * 
     */
    public NodeCurrentGet createNodeCurrentGet() {
        return new NodeCurrentGet();
    }

    /**
     * Create an instance of {@link IRelayScanListGet }
     * 
     */
    public IRelayScanListGet createIRelayScanListGet() {
        return new IRelayScanListGet();
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
     * Create an instance of {@link Ib440RfStatusGet }
     * 
     */
    public Ib440RfStatusGet createIb440RfStatusGet() {
        return new Ib440RfStatusGet();
    }

    /**
     * Create an instance of {@link IBridgeTermRfStatusGet }
     * 
     */
    public IBridgeTermRfStatusGet createIBridgeTermRfStatusGet() {
        return new IBridgeTermRfStatusGet();
    }

    /**
     * Create an instance of {@link NodeTemperatureGet }
     * 
     */
    public NodeTemperatureGet createNodeTemperatureGet() {
        return new NodeTemperatureGet();
    }

    /**
     * Create an instance of {@link IRelayStatusGetResponse }
     * 
     */
    public IRelayStatusGetResponse createIRelayStatusGetResponse() {
        return new IRelayStatusGetResponse();
    }

    /**
     * Create an instance of {@link IRelayStatusGetResult }
     * 
     */
    public IRelayStatusGetResult createIRelayStatusGetResult() {
        return new IRelayStatusGetResult();
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
     * Create an instance of {@link NodeVoltageGetResponse }
     * 
     */
    public NodeVoltageGetResponse createNodeVoltageGetResponse() {
        return new NodeVoltageGetResponse();
    }

    /**
     * Create an instance of {@link EnbRfStatusGet }
     * 
     */
    public EnbRfStatusGet createEnbRfStatusGet() {
        return new EnbRfStatusGet();
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
     * Create an instance of {@link NodeCurrentGetResponse }
     * 
     */
    public NodeCurrentGetResponse createNodeCurrentGetResponse() {
        return new NodeCurrentGetResponse();
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
     * Create an instance of {@link EnbWifiStatusGet }
     * 
     */
    public EnbWifiStatusGet createEnbWifiStatusGet() {
        return new EnbWifiStatusGet();
    }

    /**
     * Create an instance of {@link IRelayScanListGetResponse }
     * 
     */
    public IRelayScanListGetResponse createIRelayScanListGetResponse() {
        return new IRelayScanListGetResponse();
    }

    /**
     * Create an instance of {@link IRelayScanListGetResult }
     * 
     */
    public IRelayScanListGetResult createIRelayScanListGetResult() {
        return new IRelayScanListGetResult();
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
     * Create an instance of {@link NodeGpsGet }
     * 
     */
    public NodeGpsGet createNodeGpsGet() {
        return new NodeGpsGet();
    }

    /**
     * Create an instance of {@link NodeVoltageGet }
     * 
     */
    public NodeVoltageGet createNodeVoltageGet() {
        return new NodeVoltageGet();
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
     * Create an instance of {@link NodePowerGetResponse }
     * 
     */
    public NodePowerGetResponse createNodePowerGetResponse() {
        return new NodePowerGetResponse();
    }

    /**
     * Create an instance of {@link EnbSonAnrStatusGet }
     * 
     */
    public EnbSonAnrStatusGet createEnbSonAnrStatusGet() {
        return new EnbSonAnrStatusGet();
    }

    /**
     * Create an instance of {@link EnbSonRachStatusGet }
     * 
     */
    public EnbSonRachStatusGet createEnbSonRachStatusGet() {
        return new EnbSonRachStatusGet();
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
     * Create an instance of {@link IRelayStatusWs }
     * 
     */
    public IRelayStatusWs createIRelayStatusWs() {
        return new IRelayStatusWs();
    }

    /**
     * Create an instance of {@link Satellite }
     * 
     */
    public Satellite createSatellite() {
        return new Satellite();
    }

    /**
     * Create an instance of {@link IBridgeTermChannelProfile }
     * 
     */
    public IBridgeTermChannelProfile createIBridgeTermChannelProfile() {
        return new IBridgeTermChannelProfile();
    }

    /**
     * Create an instance of {@link IBridgeTermRxNulling }
     * 
     */
    public IBridgeTermRxNulling createIBridgeTermRxNulling() {
        return new IBridgeTermRxNulling();
    }

    /**
     * Create an instance of {@link NodeSensorStatusDetails }
     * 
     */
    public NodeSensorStatusDetails createNodeSensorStatusDetails() {
        return new NodeSensorStatusDetails();
    }

    /**
     * Create an instance of {@link IBridgeTermActiveChannel }
     * 
     */
    public IBridgeTermActiveChannel createIBridgeTermActiveChannel() {
        return new IBridgeTermActiveChannel();
    }

    /**
     * Create an instance of {@link LteBackhaulWs }
     * 
     */
    public LteBackhaulWs createLteBackhaulWs() {
        return new LteBackhaulWs();
    }

    /**
     * Create an instance of {@link SwStatusWs }
     * 
     */
    public SwStatusWs createSwStatusWs() {
        return new SwStatusWs();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSwStatusWs }
     * 
     */
    public ArrayOfSwStatusWs createArrayOfSwStatusWs() {
        return new ArrayOfSwStatusWs();
    }

    /**
     * Create an instance of {@link LteRfStatusInfo }
     * 
     */
    public LteRfStatusInfo createLteRfStatusInfo() {
        return new LteRfStatusInfo();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusInfo }
     * 
     */
    public IBridgeBaseRfStatusInfo createIBridgeBaseRfStatusInfo() {
        return new IBridgeBaseRfStatusInfo();
    }

    /**
     * Create an instance of {@link LtePciStatusWs }
     * 
     */
    public LtePciStatusWs createLtePciStatusWs() {
        return new LtePciStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeTermRfStatusWs }
     * 
     */
    public IBridgeTermRfStatusWs createIBridgeTermRfStatusWs() {
        return new IBridgeTermRfStatusWs();
    }

    /**
     * Create an instance of {@link GpsStatus }
     * 
     */
    public GpsStatus createGpsStatus() {
        return new GpsStatus();
    }

    /**
     * Create an instance of {@link LteRsiStatusWs }
     * 
     */
    public LteRsiStatusWs createLteRsiStatusWs() {
        return new LteRsiStatusWs();
    }

    /**
     * Create an instance of {@link IRelayScanWs }
     * 
     */
    public IRelayScanWs createIRelayScanWs() {
        return new IRelayScanWs();
    }

    /**
     * Create an instance of {@link EmbmsStatusWs }
     * 
     */
    public EmbmsStatusWs createEmbmsStatusWs() {
        return new EmbmsStatusWs();
    }

    /**
     * Create an instance of {@link LteIpThroughputCellWs }
     * 
     */
    public LteIpThroughputCellWs createLteIpThroughputCellWs() {
        return new LteIpThroughputCellWs();
    }

    /**
     * Create an instance of {@link Ib440RfStatusWs }
     * 
     */
    public Ib440RfStatusWs createIb440RfStatusWs() {
        return new Ib440RfStatusWs();
    }

    /**
     * Create an instance of {@link LteRachStatusWs }
     * 
     */
    public LteRachStatusWs createLteRachStatusWs() {
        return new LteRachStatusWs();
    }

    /**
     * Create an instance of {@link LteUeCategory }
     * 
     */
    public LteUeCategory createLteUeCategory() {
        return new LteUeCategory();
    }

    /**
     * Create an instance of {@link ArrayOfEmbmsStatusWs }
     * 
     */
    public ArrayOfEmbmsStatusWs createArrayOfEmbmsStatusWs() {
        return new ArrayOfEmbmsStatusWs();
    }

    /**
     * Create an instance of {@link Ib440InterfaceStatusWs }
     * 
     */
    public Ib440InterfaceStatusWs createIb440InterfaceStatusWs() {
        return new Ib440InterfaceStatusWs();
    }

    /**
     * Create an instance of {@link LteRfStatusWs }
     * 
     */
    public LteRfStatusWs createLteRfStatusWs() {
        return new LteRfStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeTermScannedChannel }
     * 
     */
    public IBridgeTermScannedChannel createIBridgeTermScannedChannel() {
        return new IBridgeTermScannedChannel();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfPathInfo }
     * 
     */
    public IBridgeBaseRfPathInfo createIBridgeBaseRfPathInfo() {
        return new IBridgeBaseRfPathInfo();
    }

    /**
     * Create an instance of {@link LteWifiStatusWs }
     * 
     */
    public LteWifiStatusWs createLteWifiStatusWs() {
        return new LteWifiStatusWs();
    }

    /**
     * Create an instance of {@link LteAnrStatusWs }
     * 
     */
    public LteAnrStatusWs createLteAnrStatusWs() {
        return new LteAnrStatusWs();
    }

    /**
     * Create an instance of {@link LteIpThroughputQciWs }
     * 
     */
    public LteIpThroughputQciWs createLteIpThroughputQciWs() {
        return new LteIpThroughputQciWs();
    }

    /**
     * Create an instance of {@link IBridgeBaseRfStatusWs }
     * 
     */
    public IBridgeBaseRfStatusWs createIBridgeBaseRfStatusWs() {
        return new IBridgeBaseRfStatusWs();
    }

    /**
     * Create an instance of {@link IBridgeTermRxNullingStatus }
     * 
     */
    public IBridgeTermRxNullingStatus createIBridgeTermRxNullingStatus() {
        return new IBridgeTermRxNullingStatus();
    }

    /**
     * Create an instance of {@link LteUeStatusWs }
     * 
     */
    public LteUeStatusWs createLteUeStatusWs() {
        return new LteUeStatusWs();
    }

    /**
     * Create an instance of {@link Ib440CommissionedPropertiesStatusWs }
     * 
     */
    public Ib440CommissionedPropertiesStatusWs createIb440CommissionedPropertiesStatusWs() {
        return new Ib440CommissionedPropertiesStatusWs();
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CurrentRsiValue", scope = LteRsiStatusWs.class)
    public JAXBElement<Integer> createLteRsiStatusWsCurrentRsiValue(Integer value) {
        return new JAXBElement<Integer>(_LteRsiStatusWsCurrentRsiValue_QNAME, Integer.class, LteRsiStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteUeStatusWs.class)
    public JAXBElement<Integer> createLteUeStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsCellId_QNAME, Integer.class, LteUeStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ecgi", scope = IRelayScanWs.class)
    public JAXBElement<BigInteger> createIRelayScanWsEcgi(BigInteger value) {
        return new JAXBElement<BigInteger>(_IRelayScanWsEcgi_QNAME, BigInteger.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ScanListRank", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsScanListRank(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsScanListRank_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsHeadingAngle_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndicator", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsRankIndicator(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsRankIndicator_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsEarfcn_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsLogicalAngle_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalToNoiseRatio", scope = IRelayScanWs.class)
    public JAXBElement<Double> createIRelayScanWsSignalToNoiseRatio(Double value) {
        return new JAXBElement<Double>(_IRelayScanWsSignalToNoiseRatio_QNAME, Double.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsCellIdentity_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsPci(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsPci_QNAME, Integer.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BandValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = IRelayScanWs.class)
    public JAXBElement<BandValues> createIRelayScanWsBand(BandValues value) {
        return new JAXBElement<BandValues>(_IRelayScanWsBand_QNAME, BandValues.class, IRelayScanWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdclRank", scope = IRelayScanWs.class)
    public JAXBElement<Integer> createIRelayScanWsPdclRank(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsPdclRank_QNAME, Integer.class, IRelayScanWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxLinkEfficiency", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxLinkEfficiency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxLinkEfficiency_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxPhyRate", scope = Ib440RfStatusWs.class)
    public JAXBElement<Float> createIb440RfStatusWsRxPhyRate(Float value) {
        return new JAXBElement<Float>(_Ib440RfStatusWsRxPhyRate_QNAME, Float.class, Ib440RfStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrength", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxSignalStrength(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxSignalStrength_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrengthChannel1", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsRxSignalStrengthChannel1(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsRxSignalStrengthChannel1_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrengthChannel0", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxSignalStrengthChannel0(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxSignalStrengthChannel0_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsTxPower_QNAME, Integer.class, Ib440RfStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440RfStatusWs.class)
    public JAXBElement<Integer> createIb440RfStatusWsFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsFrequency_QNAME, Integer.class, Ib440RfStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PortType", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsPortType(String value) {
        return new JAXBElement<String>(_LteBackhaulWsPortType_QNAME, String.class, LteBackhaulWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FlowControlStatus", scope = LteBackhaulWs.class)
    public JAXBElement<EnabledDisabled> createLteBackhaulWsFlowControlStatus(EnabledDisabled value) {
        return new JAXBElement<EnabledDisabled>(_LteBackhaulWsFlowControlStatus_QNAME, EnabledDisabled.class, LteBackhaulWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PortStatus", scope = LteBackhaulWs.class)
    public JAXBElement<String> createLteBackhaulWsPortStatus(String value) {
        return new JAXBElement<String>(_LteBackhaulWsPortStatus_QNAME, String.class, LteBackhaulWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermChannelProfile.class)
    public JAXBElement<Integer> createIBridgeTermChannelProfileFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsFrequency_QNAME, Integer.class, IBridgeTermChannelProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingQi", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelNullingQi(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelNullingQi_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleIndex_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaPort", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelAntennaPort(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelAntennaPort_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleFreqOffset", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleFreqOffset_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleCinr", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelPreambleCinr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleCinr_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelRfGain_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkLostCount", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelLinkLostCount(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelLinkLostCount_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Double> createIBridgeTermActiveChannelBandwidth(Double value) {
        return new JAXBElement<Double>(_IBridgeTermActiveChannelBandwidth_QNAME, Double.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermActiveChannel.class)
    public JAXBElement<Integer> createIBridgeTermActiveChannelFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsFrequency_QNAME, Integer.class, IBridgeTermActiveChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleIndex", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleIndex(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleIndex_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfGain", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelRfGain(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelRfGain_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaPort", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelAntennaPort(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelAntennaPort_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleFreqOffset", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleFreqOffset_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleCinr", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelPreambleCinr(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelPreambleCinr_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Double> createIBridgeTermScannedChannelBandwidth(Double value) {
        return new JAXBElement<Double>(_IBridgeTermActiveChannelBandwidth_QNAME, Double.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = IBridgeTermScannedChannel.class)
    public JAXBElement<Integer> createIBridgeTermScannedChannelFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatusWsFrequency_QNAME, Integer.class, IBridgeTermScannedChannel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannel5(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannel5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelBandwidth5(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannelBandwidth5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OperationalStatus", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsOperationalStatus(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsOperationalStatus_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatusInformation", scope = LteWifiStatusWs.class)
    public JAXBElement<Boolean> createLteWifiStatusWsStatusInformation(Boolean value) {
        return new JAXBElement<Boolean>(_LteWifiStatusWsStatusInformation_QNAME, Boolean.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelTxPower2Dot4(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannelTxPower2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelBandwidth2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelBandwidth2Dot4(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannelBandwidth2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus5GHz", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsRadioStatus5GHz(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsRadioStatus5GHz_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioStatus2Dot4GHz", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsRadioStatus2Dot4GHz(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsRadioStatus2Dot4GHz_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannel2Dot4", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannel2Dot4(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannel2Dot4_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WorstSeverityAlarm", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsWorstSeverityAlarm(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsWorstSeverityAlarm_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveChannelTxPower5", scope = LteWifiStatusWs.class)
    public JAXBElement<Integer> createLteWifiStatusWsActiveChannelTxPower5(Integer value) {
        return new JAXBElement<Integer>(_LteWifiStatusWsActiveChannelTxPower5_QNAME, Integer.class, LteWifiStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LtePciStatusWsPhysicalLayerIdentity_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LtePciStatusWsPhysicalLayerCellGroup_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalCellId", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsPhysicalCellId(Integer value) {
        return new JAXBElement<Integer>(_LtePciStatusWsPhysicalCellId_QNAME, Integer.class, LtePciStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LtePciStatusWs.class)
    public JAXBElement<Integer> createLtePciStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsCellId_QNAME, Integer.class, LtePciStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackedSatellites", scope = GpsStatus.class)
    public JAXBElement<Integer> createGpsStatusTrackedSatellites(Integer value) {
        return new JAXBElement<Integer>(_GpsStatusTrackedSatellites_QNAME, Integer.class, GpsStatus.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachZeroCorrelZoneCfg", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsPrachZeroCorrelZoneCfg(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsPrachZeroCorrelZoneCfg_QNAME, Integer.class, LteRachStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SizeOfPreambleGroupA", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsSizeOfPreambleGroupA(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsSizeOfPreambleGroupA_QNAME, Integer.class, LteRachStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfRaPreambles", scope = LteRachStatusWs.class)
    public JAXBElement<Integer> createLteRachStatusWsNumberOfRaPreambles(Integer value) {
        return new JAXBElement<Integer>(_LteRachStatusWsNumberOfRaPreambles_QNAME, Integer.class, LteRachStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUes", scope = LteUeCategory.class)
    public JAXBElement<Integer> createLteUeCategoryConnectedUes(Integer value) {
        return new JAXBElement<Integer>(_LteUeCategoryConnectedUes_QNAME, Integer.class, LteUeCategory.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsHeadingAngle_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sinr", scope = IRelayStatusWs.class)
    public JAXBElement<Double> createIRelayStatusWsSinr(Double value) {
        return new JAXBElement<Double>(_IRelayStatusWsSinr_QNAME, Double.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsRsrp(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsRsrp_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEnbConnected", scope = IRelayStatusWs.class)
    public JAXBElement<Boolean> createIRelayStatusWsIsEnbConnected(Boolean value) {
        return new JAXBElement<Boolean>(_IRelayStatusWsIsEnbConnected_QNAME, Boolean.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfn", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsEarfn(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsEarfn_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rssi", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsRssi(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsRssi_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsCellID(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsCellID_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ecgi", scope = IRelayStatusWs.class)
    public JAXBElement<BigInteger> createIRelayStatusWsEcgi(BigInteger value) {
        return new JAXBElement<BigInteger>(_IRelayScanWsEcgi_QNAME, BigInteger.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LogicalAngle", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsLogicalAngle(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsLogicalAngle_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioTxPower", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsRadioTxPower(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsRadioTxPower_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsIRelayConnected", scope = IRelayStatusWs.class)
    public JAXBElement<Boolean> createIRelayStatusWsIsIRelayConnected(Boolean value) {
        return new JAXBElement<Boolean>(_IRelayStatusWsIsIRelayConnected_QNAME, Boolean.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsRsrq(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsRsrq_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsPci_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsCellIdentity_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpAddressType", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsIpAddressType(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsIpAddressType_QNAME, Integer.class, IRelayStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = IRelayStatusWs.class)
    public JAXBElement<Integer> createIRelayStatusWsTac(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsTac_QNAME, Integer.class, IRelayStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastReadFromNode", scope = SwStatusWs.class)
    public JAXBElement<XMLGregorianCalendar> createSwStatusWsLastReadFromNode(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SwStatusWsLastReadFromNode_QNAME, XMLGregorianCalendar.class, SwStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputKbpsDl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsIpThroughputKbpsDl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsIpThroughputKbpsDl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveUeUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsActiveUeUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsActiveUeUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputKbpsUl", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsIpThroughputKbpsUl(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsIpThroughputKbpsUl_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci", scope = LteIpThroughputQciWs.class)
    public JAXBElement<Integer> createLteIpThroughputQciWsQci(Integer value) {
        return new JAXBElement<Integer>(_LteIpThroughputQciWsQci_QNAME, Integer.class, LteIpThroughputQciWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkEarfcn", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsDownlinkEarfcn(Integer value) {
        return new JAXBElement<Integer>(_LteAnrStatusWsDownlinkEarfcn_QNAME, Integer.class, LteAnrStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsCellIdentity_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsPci(Integer value) {
        return new JAXBElement<Integer>(_IRelayScanWsPci_QNAME, Integer.class, LteAnrStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbType", scope = LteAnrStatusWs.class)
    public JAXBElement<EnbTypes> createLteAnrStatusWsEnbType(EnbTypes value) {
        return new JAXBElement<EnbTypes>(_LteAnrStatusWsEnbType_QNAME, EnbTypes.class, LteAnrStatusWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlStatus", scope = LteAnrStatusWs.class)
    public JAXBElement<X2ControlStateTypes> createLteAnrStatusWsX2ControlStatus(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAnrStatusWsX2ControlStatus_QNAME, X2ControlStateTypes.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsTac(Integer value) {
        return new JAXBElement<Integer>(_IRelayStatusWsTac_QNAME, Integer.class, LteAnrStatusWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteAnrStatusWs.class)
    public JAXBElement<Integer> createLteAnrStatusWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteUeStatusWsCellId_QNAME, Integer.class, LteAnrStatusWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullingQi", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusNullingQi(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermActiveChannelNullingQi_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumMeasurements", scope = IBridgeTermRxNullingStatus.class)
    public JAXBElement<Integer> createIBridgeTermRxNullingStatusNumMeasurements(Integer value) {
        return new JAXBElement<Integer>(_IBridgeTermRxNullingStatusNumMeasurements_QNAME, Integer.class, IBridgeTermRxNullingStatus.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAnrEnabled", scope = LteSonAnrGetResult.class)
    public JAXBElement<Boolean> createLteSonAnrGetResultIsAnrEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonAnrGetResultIsAnrEnabled_QNAME, Boolean.class, LteSonAnrGetResult.class, value);
    }

}
