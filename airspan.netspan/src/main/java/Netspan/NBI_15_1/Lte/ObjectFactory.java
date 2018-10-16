
package Netspan.NBI_15_1.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;import Netspan.API.Enums.ConnectedModeEventTypes;import Netspan.API.Enums.EnabledDisabledStates;import Netspan.API.Enums.PnpModes;import Netspan.API.Enums.SonAnrStates;import Netspan.API.Enums.StopGapEventTypes;import Netspan.API.Enums.TriggerGapEventTypes;import Netspan.API.Enums.TriggerQuantityTypes;
import Netspan.API.Enums.X2ControlStateTypes;
import Netspan.API.Lte.MobilityConnectedModeStopGaps;import Netspan.API.Lte.MobilityConnectedModeTriggerGaps;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_1.Lte package. 
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
    private final static QName _RlcModeWsSrbIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SrbIsDefault");
    private final static QName _RlcModeWsQci9IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci9IsDefault");
    private final static QName _RlcModeWsQci6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci6IsDefault");
    private final static QName _RlcModeWsQci3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci3IsDefault");
    private final static QName _RlcModeWsQci5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci5IsDefault");
    private final static QName _RlcModeWsQci6_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci6");
    private final static QName _RlcModeWsQci2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci2IsDefault");
    private final static QName _RlcModeWsQci5_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci5");
    private final static QName _RlcModeWsQci4_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci4");
    private final static QName _RlcModeWsQci3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci3");
    private final static QName _RlcModeWsQci2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci2");
    private final static QName _RlcModeWsQci1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci1");
    private final static QName _RlcModeWsSrb_QNAME = new QName("http://Airspan.Netspan.WebServices", "Srb");
    private final static QName _RlcModeWsQci7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci7IsDefault");
    private final static QName _RlcModeWsQci9_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci9");
    private final static QName _RlcModeWsQci8_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci8");
    private final static QName _RlcModeWsQci1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci1IsDefault");
    private final static QName _RlcModeWsQci7_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci7");
    private final static QName _RlcModeWsQci8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci8IsDefault");
    private final static QName _RlcModeWsQci4IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Qci4IsDefault");
    private final static QName _QosEarfcnEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _EmbmsWsLeapSeconds_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeapSeconds");
    private final static QName _EmbmsWsSynchronizationSequenceIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationSequenceIsDefault");
    private final static QName _EmbmsWsSynchronizationSequence_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationSequence");
    private final static QName _EmbmsWsSynchronizationPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationPeriod");
    private final static QName _EmbmsWsLeapSecondsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeapSecondsIsDefault");
    private final static QName _EmbmsWsSynchronizationPeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationPeriodIsDefault");
    private final static QName _RsiRangeRsiListSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiListSize");
    private final static QName _RsiRangeRsiStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiStart");
    private final static QName _RsiRangeRsiStep_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiStep");
    private final static QName _MacWsPeriodicBsrTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicBsrTimer");
    private final static QName _MacWsMaxHarqTxForDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxHarqTxForDl");
    private final static QName _MacWsMaxHarqTxForUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxHarqTxForUl");
    private final static QName _MacWsPeriodicBsrTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeriodicBsrTimerIsDefault");
    private final static QName _MacWsRetxBsrTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "RetxBsrTimer");
    private final static QName _MacWsMaxHarqTxForUlIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxHarqTxForUlIsDefault");
    private final static QName _MacWsRetxBsrTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RetxBsrTimerIsDefault");
    private final static QName _MacWsMaxHarqTxForDlIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxHarqTxForDlIsDefault");
    private final static QName _EnbDetailsGetPnpLongAntennaBeam_QNAME = new QName("http://Airspan.Netspan.WebServices", "LongAntennaBeam");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForCSonServer_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForCSonServer");
    private final static QName _EnbDetailsGetPnpMin20MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Min20MHzChannel");
    private final static QName _EnbDetailsGetPnpMax20MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Max20MHzChannel");
    private final static QName _EnbDetailsGetPnpLedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LedMode");
    private final static QName _EnbDetailsGetPnpAltitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Altitude");
    private final static QName _EnbDetailsGetPnpIsM1InterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM1InterfaceEnabled");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForX2U_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForX2U");
    private final static QName _EnbDetailsGetPnpIsAutoX2ControlForNeighboursEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAutoX2ControlForNeighboursEnabled");
    private final static QName _EnbDetailsGetPnpIsS1UInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1UInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpIsX2UInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2UInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpENodeBID_QNAME = new QName("http://Airspan.Netspan.WebServices", "ENodeBID");
    private final static QName _EnbDetailsGetPnpIsCSonServerInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonServerInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpIsX2ConfigurationUpdateForNeighboursEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2ConfigurationUpdateForNeighboursEnabled");
    private final static QName _EnbDetailsGetPnpActiveAntenna_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveAntenna");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForS1C_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForS1C");
    private final static QName _EnbDetailsGetPnpLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Longitude");
    private final static QName _EnbDetailsGetPnpMax40MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Max40MHzChannel");
    private final static QName _EnbDetailsGetPnpCellToUse_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellToUse");
    private final static QName _EnbDetailsGetPnpIsPtpSlaveInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPtpSlaveInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForM2_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForM2");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForM1_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForM1");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForX2C_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForX2C");
    private final static QName _EnbDetailsGetPnpMin40MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Min40MHzChannel");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForManagement_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForManagement");
    private final static QName _EnbDetailsGetPnpIsCallTraceInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCallTraceInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForS1U_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForS1U");
    private final static QName _EnbDetailsGetPnpIsM2InterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM2InterfaceEnabled");
    private final static QName _EnbDetailsGetPnpIsS1CInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1CInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForPtpSlave_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForPtpSlave");
    private final static QName _EnbDetailsGetPnpInterfaceToUseForCallTrace_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForCallTrace");
    private final static QName _EnbDetailsGetPnpLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Latitude");
    private final static QName _EnbDetailsGetPnpIsX2CInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2CInterfaceEnabled");
    private final static QName _EnbDetailsGetPnpDefaultX2ControlStateForNeighbours_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultX2ControlStateForNeighbours");
    private final static QName _EnbDetailsGetPnpLongSbaEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "LongSbaEnable");
    private final static QName _MobilityConnectedQosWsReportAmountIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportAmountIsDefault");
    private final static QName _MobilityConnectedQosWsQosBasedMobilityTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosBasedMobilityTimerIsDefault");
    private final static QName _MobilityConnectedQosWsReportAmount_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportAmount");
    private final static QName _MobilityConnectedQosWsMaxReportCellsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxReportCellsIsDefault");
    private final static QName _MobilityConnectedQosWsMaxReportCells_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxReportCells");
    private final static QName _MobilityConnectedQosWsQosBasedMobilityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "QosBasedMobilityTimer");
    private final static QName _CellRadioInterfaceWsPcchnBIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PcchnBIsDefault");
    private final static QName _CellRadioInterfaceWsCqiPmiPeriodictyForFddIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CqiPmiPeriodictyForFddIsDefault");
    private final static QName _CellRadioInterfaceWsFilterCoefficientIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FilterCoefficientIsDefault");
    private final static QName _CellRadioInterfaceWsCqiPmiPeriodictyForTdd_QNAME = new QName("http://Airspan.Netspan.WebServices", "CqiPmiPeriodictyForTdd");
    private final static QName _CellRadioInterfaceWsSrPeriodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "SrPeriodicity");
    private final static QName _CellRadioInterfaceWsPdschPaIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschPaIsDefault");
    private final static QName _CellRadioInterfaceWsFilterCoefficient_QNAME = new QName("http://Airspan.Netspan.WebServices", "FilterCoefficient");
    private final static QName _CellRadioInterfaceWsPcchnB_QNAME = new QName("http://Airspan.Netspan.WebServices", "PcchnB");
    private final static QName _CellRadioInterfaceWsCqiPmiPeriodictyForTddIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CqiPmiPeriodictyForTddIsDefault");
    private final static QName _CellRadioInterfaceWsSrPeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SrPeriodicityIsDefault");
    private final static QName _CellRadioInterfaceWsCqiPmiPeriodictyForFdd_QNAME = new QName("http://Airspan.Netspan.WebServices", "CqiPmiPeriodictyForFdd");
    private final static QName _CellRadioInterfaceWsPdschPb_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschPb");
    private final static QName _CellRadioInterfaceWsPdschPa_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschPa");
    private final static QName _CellRadioInterfaceWsPdschPbIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschPbIsDefault");
    private final static QName _MobilityInterRatGeranReselectionThreshXHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHigh");
    private final static QName _MobilityInterRatGeranReselectionIsPMaxGeranNotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPMaxGeranNotPresent");
    private final static QName _MobilityInterRatGeranReselectionQRxLevMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QRxLevMin");
    private final static QName _MobilityInterRatGeranReselectionTReselectionGeran_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionGeran");
    private final static QName _MobilityInterRatGeranReselectionThreshXLow_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLow");
    private final static QName _MobilityInterRatGeranReselectionPMaxGeran_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMaxGeran");
    private final static QName _CallTraceProfileTraceType_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceType");
    private final static QName _CallTraceProfileTimeZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeZone");
    private final static QName _CallTraceProfileTraceX2_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceX2");
    private final static QName _CallTraceProfileTraceSib_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceSib");
    private final static QName _CallTraceProfileCallTraceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallTraceEnabled");
    private final static QName _CallTraceProfileTraceS1_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceS1");
    private final static QName _CallTraceProfileTraceUu_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceUu");
    private final static QName _CallTraceProfileHardwareCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareCategory");
    private final static QName _MobilityIdleModeInterEarfcnPMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMax");
    private final static QName _MobilityIdleModeInterEarfcnQOffsetFreq_QNAME = new QName("http://Airspan.Netspan.WebServices", "QOffsetFreq");
    private final static QName _MobilityIdleModeInterEarfcnDlEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlEarfcn");
    private final static QName _MobilityIdleModeInterEarfcnTReselectionEutra_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionEutra");
    private final static QName _MobilityIdleModeInterEarfcnThreshXHighP_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHighP");
    private final static QName _MobilityIdleModeInterEarfcnThreshXLowQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLowQr9");
    private final static QName _MobilityIdleModeInterEarfcnQQualMinr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "QQualMinr9");
    private final static QName _MobilityIdleModeInterEarfcnIsPMaxNotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPMaxNotPresent");
    private final static QName _MobilityIdleModeInterEarfcnIsQQualMinr9NotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsQQualMinr9NotPresent");
    private final static QName _MobilityIdleModeInterEarfcnQRxLevelMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QRxLevelMin");
    private final static QName _MobilityIdleModeInterEarfcnThreshXLowP_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLowP");
    private final static QName _MobilityIdleModeInterEarfcnThreshXHighQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHighQr9");
    private final static QName _MobilityIdleModeInterEarfcnCellReselectionPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellReselectionPriority");
    private final static QName _RandomAccessWsMacContentionResolutionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacContentionResolutionTimer");
    private final static QName _RandomAccessWsMacContentionResolutionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacContentionResolutionTimerIsDefault");
    private final static QName _RandomAccessWsPreambleInitialReceivedTargetPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialReceivedTargetPower");
    private final static QName _RandomAccessWsPrachConfigIndexIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachConfigIndexIsDefault");
    private final static QName _RandomAccessWsRaResponseWindowSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "RaResponseWindowSize");
    private final static QName _RandomAccessWsZeroCorrelationZoneConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZeroCorrelationZoneConfig");
    private final static QName _RandomAccessWsZeroCorrelationZoneConfigIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZeroCorrelationZoneConfigIsDefault");
    private final static QName _RandomAccessWsPowerRampingStep_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerRampingStep");
    private final static QName _RandomAccessWsPreambleTransMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleTransMax");
    private final static QName _RandomAccessWsNumberOfRaPreamblesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreamblesIsDefault");
    private final static QName _RandomAccessWsRaResponseWindowSizeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RaResponseWindowSizeIsDefault");
    private final static QName _RandomAccessWsPreambleInitialReceivedTargetPowerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialReceivedTargetPowerIsDefault");
    private final static QName _RandomAccessWsNumberOfRaPreambles_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreambles");
    private final static QName _RandomAccessWsPrachConfigIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachConfigIndex");
    private final static QName _RandomAccessWsPowerRampingStepIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerRampingStepIsDefault");
    private final static QName _RandomAccessWsPreambleTransMaxIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleTransMaxIsDefault");
    private final static QName _PnpDetailWsPnpLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLongitude");
    private final static QName _PnpDetailWsPnpLatLongRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatLongRadius");
    private final static QName _PnpDetailWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _PnpDetailWsPnpLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatitude");
    private final static QName _PnpDetailWsSnmpTimeoutInMilliSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpTimeoutInMilliSec");
    private final static QName _PnpDetailWsSnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpVersion");
    private final static QName _PnpDetailWsSnmpv3Access_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snmpv3Access");
    private final static QName _PnpDetailWsHardware_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hardware");
    private final static QName _LteEnbDetailsSetWsManagedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagedMode");
    private final static QName _SoftFreqReuseWsPaCellEdgeUesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PaCellEdgeUesIsDefault");
    private final static QName _SoftFreqReuseWsPaCellEdgeUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "PaCellEdgeUes");
    private final static QName _SoftFreqReuseWsPaCellCenterUesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PaCellCenterUesIsDefault");
    private final static QName _SoftFreqReuseWsMcsHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "McsHysteresis");
    private final static QName _SoftFreqReuseWsPaCellCenterUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "PaCellCenterUes");
    private final static QName _SoftFreqReuseWsMcsHysteresisIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "McsHysteresisIsDefault");
    private final static QName _SynchronizationWsLastUlSymSuppression_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastUlSymSuppression");
    private final static QName _SynchronizationWsWimaxCoexistenceFrameShift_QNAME = new QName("http://Airspan.Netspan.WebServices", "WimaxCoexistenceFrameShift");
    private final static QName _SynchronizationWsLastUlSymSuppressionIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastUlSymSuppressionIsDefault");
    private final static QName _SynchronizationWsWimaxCoexistenceFrameShiftIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WimaxCoexistenceFrameShiftIsDefault");
    private final static QName _RadioInterfaceWsDefaultPagingCycleIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultPagingCycleIsDefault");
    private final static QName _RadioInterfaceWsCfiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CfiIsDefault");
    private final static QName _RadioInterfaceWsCfi_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cfi");
    private final static QName _RadioInterfaceWsDefaultPagingCycle_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultPagingCycle");
    private final static QName _EnbNetworkProfileCallTraceSvrPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallTraceSvrPort");
    private final static QName _EnbNetworkProfileIsMgmtVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsMgmtVlanConfigured");
    private final static QName _EnbNetworkProfileIsPtpVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPtpVlanConfigured");
    private final static QName _EnbNetworkProfileIsX2CVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2CVlanConfigured");
    private final static QName _EnbNetworkProfileIsX2UVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2UVlanConfigured");
    private final static QName _EnbNetworkProfileIsM1VlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM1VlanConfigured");
    private final static QName _EnbNetworkProfileCodecType_QNAME = new QName("http://Airspan.Netspan.WebServices", "CodecType");
    private final static QName _EnbNetworkProfileIsCSonVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonVlanConfigured");
    private final static QName _EnbNetworkProfileMmeOverloadAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadAdmin");
    private final static QName _EnbNetworkProfilePacketPeriodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketPeriodicity");
    private final static QName _EnbNetworkProfileCallTraceSvrVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallTraceSvrVlanId");
    private final static QName _EnbNetworkProfileS1CVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1CVlanId");
    private final static QName _EnbNetworkProfileIsS1UVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1UVlanConfigured");
    private final static QName _EnbNetworkProfileX2UVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2UVlanId");
    private final static QName _EnbNetworkProfileMgmtVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "MgmtVlanId");
    private final static QName _EnbNetworkProfileM2McePresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2McePresent");
    private final static QName _EnbNetworkProfileM1VlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "M1VlanId");
    private final static QName _EnbNetworkProfileMmeOverloadLoadReductionAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadLoadReductionAdmin");
    private final static QName _EnbNetworkProfileM2VlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2VlanId");
    private final static QName _EnbNetworkProfileCodecMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "CodecMode");
    private final static QName _EnbNetworkProfileCSonVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonVlanId");
    private final static QName _EnbNetworkProfileCallTraceSvrPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallTraceSvrPresent");
    private final static QName _EnbNetworkProfilePacketSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketSize");
    private final static QName _EnbNetworkProfileMceSctpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "MceSctpPort");
    private final static QName _EnbNetworkProfileIsM2VlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM2VlanConfigured");
    private final static QName _EnbNetworkProfileIsStandardVoLTECodec_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStandardVoLTECodec");
    private final static QName _EnbNetworkProfileX2CVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2CVlanId");
    private final static QName _EnbNetworkProfileMmeOverloadWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadWaitTime");
    private final static QName _EnbNetworkProfileIsS1CVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1CVlanConfigured");
    private final static QName _EnbNetworkProfileIsRohcProfilesQci1Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsRohcProfilesQci1Enabled");
    private final static QName _EnbNetworkProfilePtpVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpVlanId");
    private final static QName _EnbNetworkProfileS1UVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UVlanId");
    private final static QName _LteCellSetWsDataAccessBarringTimeInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataAccessBarringTimeInSec");
    private final static QName _LteCellSetWsIsDataAccessClass13Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass13Barred");
    private final static QName _LteCellSetWsIsEmergencyAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEmergencyAccessBarred");
    private final static QName _LteCellSetWsIsDataAccessClass12Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass12Barred");
    private final static QName _LteCellSetWsIsSignalingAccessClass14Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass14Barred");
    private final static QName _LteCellSetWsIsDataAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessBarred");
    private final static QName _LteCellSetWsIsAccessClassBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAccessClassBarred");
    private final static QName _LteCellSetWsIsSignalingAccessClass11Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass11Barred");
    private final static QName _LteCellSetWsTrackingAreaCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "TrackingAreaCode");
    private final static QName _LteCellSetWsDataAccessBarringFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataAccessBarringFactor");
    private final static QName _LteCellSetWsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnabled");
    private final static QName _LteCellSetWsIsSignalingAccessClass12Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass12Barred");
    private final static QName _LteCellSetWsSignalingAccessBarringFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalingAccessBarringFactor");
    private final static QName _LteCellSetWsPhysicalLayerIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerIdentity");
    private final static QName _LteCellSetWsSignalingAccessBarringTimeInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalingAccessBarringTimeInSec");
    private final static QName _LteCellSetWsEmergencyAreaId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyAreaId");
    private final static QName _LteCellSetWsIsDataAccessClass11Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass11Barred");
    private final static QName _LteCellSetWsPrachFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachFreqOffset");
    private final static QName _LteCellSetWsIsDataAccessClass14Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass14Barred");
    private final static QName _LteCellSetWsIsSignalingAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessBarred");
    private final static QName _LteCellSetWsIsSignalingAccessClass15Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass15Barred");
    private final static QName _LteCellSetWsPhysicalLayerCellGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerCellGroup");
    private final static QName _LteCellSetWsIsDataAccessClass15Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass15Barred");
    private final static QName _LteCellSetWsCellID_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellID");
    private final static QName _LteCellSetWsPrachRsi_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRsi");
    private final static QName _LteCellSetWsIsSignalingAccessClass13Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass13Barred");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchPr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchPr9");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchQr9");
    private final static QName _MobilityIdleModeIntraFreqQHyst_QNAME = new QName("http://Airspan.Netspan.WebServices", "QHyst");
    private final static QName _MobilityIdleModeIntraFreqThreshServingLowQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshServingLowQr9");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchR8");
    private final static QName _MobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsThreshServingLowQr9NotPresent");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchEnable");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchR8");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchQr9");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchPr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchPr9");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchEnable");
    private final static QName _MobilityIdleModeIntraFreqThreshServingLowR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshServingLowR8");
    private final static QName _NetworkingWsIpsecSaLifetimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecSaLifetimeIsDefault");
    private final static QName _NetworkingWsUpdateMessageType_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateMessageType");
    private final static QName _NetworkingWsMarginTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarginTime");
    private final static QName _NetworkingWsIkeSaLifetimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IkeSaLifetimeIsDefault");
    private final static QName _NetworkingWsDpdRetriesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdRetriesIsDefault");
    private final static QName _NetworkingWsDpdDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdDelay");
    private final static QName _NetworkingWsIpsecSaLifetime_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecSaLifetime");
    private final static QName _NetworkingWsSctpHBeatInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpHBeatInterval");
    private final static QName _NetworkingWsDpdRetries_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdRetries");
    private final static QName _NetworkingWsDpdActionIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdActionIsDefault");
    private final static QName _NetworkingWsSgwDownTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "SgwDownTimer");
    private final static QName _NetworkingWsSctpHBeatIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpHBeatIntervalIsDefault");
    private final static QName _NetworkingWsDpdAction_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdAction");
    private final static QName _NetworkingWsCertificateUpdateTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "CertificateUpdateTime");
    private final static QName _NetworkingWsMtuIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MtuIsDefault");
    private final static QName _NetworkingWsUpdateMessageTypeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateMessageTypeIsDefault");
    private final static QName _NetworkingWsSgwDownTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SgwDownTimerIsDefault");
    private final static QName _NetworkingWsCertificateUpdateTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CertificateUpdateTimeIsDefault");
    private final static QName _NetworkingWsUpdateRetryTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateRetryTimer");
    private final static QName _NetworkingWsDpdDelayIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdDelayIsDefault");
    private final static QName _NetworkingWsIkeSaLifetime_QNAME = new QName("http://Airspan.Netspan.WebServices", "IkeSaLifetime");
    private final static QName _NetworkingWsUpdateRetryTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateRetryTimerIsDefault");
    private final static QName _NetworkingWsMtu_QNAME = new QName("http://Airspan.Netspan.WebServices", "Mtu");
    private final static QName _NetworkingWsMarginTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarginTimeIsDefault");
    private final static QName _MobilityConnectedModeStopGapsTriggerQuantity_QNAME = new QName("http://Airspan.Netspan.WebServices", "TriggerQuantity");
    private final static QName _MobilityConnectedModeStopGapsEventType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventType");
    private final static QName _MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpEventThreshold1");
    private final static QName _MobilityConnectedModeStopGapsTimeToTrigger_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeToTrigger");
    private final static QName _MobilityConnectedModeStopGapsHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hysteresis");
    private final static QName _TrafficManagementProfileMonitorInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "MonitorInterval");
    private final static QName _TrafficManagementProfileLoadSheddingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LoadSheddingMode");
    private final static QName _TrafficManagementProfileStepUp_QNAME = new QName("http://Airspan.Netspan.WebServices", "StepUp");
    private final static QName _TrafficManagementProfileMinDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinDataInactivityTimer");
    private final static QName _TrafficManagementProfileUeOverloadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeOverloadThreshold");
    private final static QName _TrafficManagementProfileStepDown_QNAME = new QName("http://Airspan.Netspan.WebServices", "StepDown");
    private final static QName _TrafficManagementProfileUeOverloadHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeOverloadHysteresis");
    private final static QName _TrafficManagementProfileDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataInactivityTimer");
    private final static QName _TrafficManagementProfileMaxDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDataInactivityTimer");
    private final static QName _EmergencyCallQciWsQCI4IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI4IsDefault");
    private final static QName _EmergencyCallQciWsQCI3_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI3");
    private final static QName _EmergencyCallQciWsQCI3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI3IsDefault");
    private final static QName _EmergencyCallQciWsQCI4_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI4");
    private final static QName _EmergencyCallQciWsQCI5_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI5");
    private final static QName _EmergencyCallQciWsQCI6_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI6");
    private final static QName _EmergencyCallQciWsQCI1_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI1");
    private final static QName _EmergencyCallQciWsQCI7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI7IsDefault");
    private final static QName _EmergencyCallQciWsQCI2_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI2");
    private final static QName _EmergencyCallQciWsQCI10IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI10IsDefault");
    private final static QName _EmergencyCallQciWsQCI10_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI10");
    private final static QName _EmergencyCallQciWsQCI2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI2IsDefault");
    private final static QName _EmergencyCallQciWsQCI7_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI7");
    private final static QName _EmergencyCallQciWsQCI8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI8IsDefault");
    private final static QName _EmergencyCallQciWsQCI8_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI8");
    private final static QName _EmergencyCallQciWsQCI6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI6IsDefault");
    private final static QName _EmergencyCallQciWsQCI9_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI9");
    private final static QName _EmergencyCallQciWsQCI1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI1IsDefault");
    private final static QName _EmergencyCallQciWsQCI5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI5IsDefault");
    private final static QName _EmergencyCallQciWsQCI9IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI9IsDefault");
    private final static QName _VolteConfigurationWsActivateVolteDataInactivityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActivateVolteDataInactivityIsDefault");
    private final static QName _VolteConfigurationWsAdditionalBitsForFixedAllocationsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalBitsForFixedAllocationsIsDefault");
    private final static QName _VolteConfigurationWsAdditionalBitsForFixedAllocations_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalBitsForFixedAllocations");
    private final static QName _VolteConfigurationWsHeaderOverhead_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeaderOverhead");
    private final static QName _VolteConfigurationWsRohcCompressionRatioIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RohcCompressionRatioIsDefault");
    private final static QName _VolteConfigurationWsRohcCompressionRatio_QNAME = new QName("http://Airspan.Netspan.WebServices", "RohcCompressionRatio");
    private final static QName _VolteConfigurationWsHeaderOverheadIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeaderOverheadIsDefault");
    private final static QName _VolteConfigurationWsMaximumVolteCalls_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaximumVolteCalls");
    private final static QName _VolteConfigurationWsDlaAckStepDownFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaAckStepDownFactor");
    private final static QName _VolteConfigurationWsActivateVolteDataInactivity_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActivateVolteDataInactivity");
    private final static QName _VolteConfigurationWsDlaAckStepDownFactorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaAckStepDownFactorIsDefault");
    private final static QName _RecurrenceDailySelectedOption_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelectedOption");
    private final static QName _MobilityConnectedWsNeighCellConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighCellConfig");
    private final static QName _MobilityConnectedWsNeighCellConfigIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighCellConfigIsDefault");
    private final static QName _MobilityConnectedWsPresenceAntennaPort1_QNAME = new QName("http://Airspan.Netspan.WebServices", "PresenceAntennaPort1");
    private final static QName _MobilityConnectedWsPresenceAntennaPort1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PresenceAntennaPort1IsDefault");
    private final static QName _UeHandlingEnbWsMaxUeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxUeIsDefault");
    private final static QName _UeHandlingEnbWsMaxUe_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxUe");
    private final static QName _YearlyOption1Month_QNAME = new QName("http://Airspan.Netspan.WebServices", "Month");
    private final static QName _YearlyOption1DayOfMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayOfMonth");
    private final static QName _LteCSonEntryWsIsCSonConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonConfigured");
    private final static QName _LteCSonEntryWsCSonServerPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonServerPort");
    private final static QName _LteSonCSonWsCSonMlbPuschLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbPuschLoadThresh");
    private final static QName _LteSonCSonWsIsCSonEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonEnabled");
    private final static QName _LteSonCSonWsCSonMlbCapacityClassValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbCapacityClassValue");
    private final static QName _LteSonCSonWsIsCSonMcimEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMcimEnabled");
    private final static QName _LteSonCSonWsCSonMlbPdschLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbPdschLoadThresh");
    private final static QName _LteSonCSonWsCSonMlbRrcLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbRrcLoadThresh");
    private final static QName _LteSonCSonWsIsCSonMroEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMroEnabled");
    private final static QName _LteSonCSonWsIsDlTxOptEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDlTxOptEnabled");
    private final static QName _LteSonCSonWsIsCSonRachEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonRachEnabled");
    private final static QName _LteSonCSonWsIsCSonMlbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMlbEnabled");
    private final static QName _LteSonCSonWsCSonMlbCpuLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbCpuLoadThresh");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc5_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc5");
    private final static QName _CsfbCdma2KMobilityParamsEncSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsParameterReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ParameterReg");
    private final static QName _CsfbCdma2KMobilityParamsBandClassInfoReq_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassInfoReq");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupIncl_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupIncl");
    private final static QName _CsfbCdma2KMobilityParamsLtmOffIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "LtmOffIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMultNidsIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultNidsIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAltBandClassIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AltBandClassIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rand");
    private final static QName _CsfbCdma2KMobilityParamsGcsnal2AckTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "Gcsnal2AckTimer");
    private final static QName _CsfbCdma2KMobilityParamsImsi1112Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "Imsi1112Included");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsInitPosLocSupInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsInitPosLocSupInd");
    private final static QName _CsfbCdma2KMobilityParamsUseSyncId_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseSyncId");
    private final static QName _CsfbCdma2KMobilityParamsPowerUpRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerUpRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "Gcsnal2AckTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSigEncryptSupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigEncryptSupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMcc_QNAME = new QName("http://Airspan.Netspan.WebServices", "Mcc");
    private final static QName _CsfbCdma2KMobilityParamsLpSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "LpSec");
    private final static QName _CsfbCdma2KMobilityParamsAuthIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AuthIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSdbSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSdbInRcnmInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbInRcnmInd");
    private final static QName _CsfbCdma2KMobilityParamsPrefMsidTypeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrefMsidTypeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsDayLtIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayLtIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSdbInRcnmIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbInRcnmIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMobQosIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MobQosIncluded");
    private final static QName _CsfbCdma2KMobilityParamsImsiTSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ImsiTSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsBandClass_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClass");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc12_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc12");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc11_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc11");
    private final static QName _CsfbCdma2KMobilityParamsParameterRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ParameterRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsHomeReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "HomeReg");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc3_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc3");
    private final static QName _CsfbCdma2KMobilityParamsPilotInc_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotInc");
    private final static QName _CsfbCdma2KMobilityParamsPacketZoneIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketZoneIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsHomeRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "HomeRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc4_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc4");
    private final static QName _CsfbCdma2KMobilityParamsPilotReportIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotReportIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegPrdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegPrdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRandIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RandIncluded");
    private final static QName _CsfbCdma2KMobilityParamsGcsnaSequenceContextTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "GcsnaSequenceContextTimer");
    private final static QName _CsfbCdma2KMobilityParamsTkzIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsForNidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForNidReg");
    private final static QName _CsfbCdma2KMobilityParamsUseSyncIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseSyncIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMultNids_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultNids");
    private final static QName _CsfbCdma2KMobilityParamsPzHystTimerMul_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystTimerMul");
    private final static QName _CsfbCdma2KMobilityParamsSigEncryptSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigEncryptSup");
    private final static QName _CsfbCdma2KMobilityParamsPowerDownRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerDownRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegPrd_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegPrd");
    private final static QName _CsfbCdma2KMobilityParamsBandClassIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassIncluded");
    private final static QName _CsfbCdma2KMobilityParamsImsiTSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "ImsiTSupported");
    private final static QName _CsfbCdma2KMobilityParamsReconnectMsgInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReconnectMsgInd");
    private final static QName _CsfbCdma2KMobilityParamsLtmOff_QNAME = new QName("http://Airspan.Netspan.WebServices", "LtmOff");
    private final static QName _CsfbCdma2KMobilityParamsMaxNumAltSo_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxNumAltSo");
    private final static QName _CsfbCdma2KMobilityParamsZoneTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZoneTimer");
    private final static QName _CsfbCdma2KMobilityParamsPRev_QNAME = new QName("http://Airspan.Netspan.WebServices", "PRev");
    private final static QName _CsfbCdma2KMobilityParamsMultSids_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultSids");
    private final static QName _CsfbCdma2KMobilityParamsZoneTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZoneTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRerModeSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "RerModeSupported");
    private final static QName _CsfbCdma2KMobilityParamsNidIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "NidIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPzHystListLen_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystListLen");
    private final static QName _CsfbCdma2KMobilityParamsMaxAddServInstance_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAddServInstance");
    private final static QName _CsfbCdma2KMobilityParamsMaxAddServInstanceIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAddServInstanceIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsgIntegritySupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsgIntegritySupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTkzModeSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzModeSupported");
    private final static QName _CsfbCdma2KMobilityParamsExtPrefMsidType_QNAME = new QName("http://Airspan.Netspan.WebServices", "ExtPrefMsidType");
    private final static QName _CsfbCdma2KMobilityParamsPilotReport_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotReport");
    private final static QName _CsfbCdma2KMobilityParamsAltBandClass_QNAME = new QName("http://Airspan.Netspan.WebServices", "AltBandClass");
    private final static QName _CsfbCdma2KMobilityParamsRegZoneIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegZoneIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySup_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySup");
    private final static QName _CsfbCdma2KMobilityParamsTotalZonesIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZonesIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTotalZones_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZones");
    private final static QName _CsfbCdma2KMobilityParamsPzIdHystParametersIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzIdHystParametersIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMaxNumAltSoIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxNumAltSoIncluded");
    private final static QName _CsfbCdma2KMobilityParamsGcsnaSequenceContextTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "GcsnaSequenceContextTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsBypassRegInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "BypassRegInd");
    private final static QName _CsfbCdma2KMobilityParamsPilotIncIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotIncIncluded");
    private final static QName _CsfbCdma2KMobilityParamsNid_QNAME = new QName("http://Airspan.Netspan.WebServices", "Nid");
    private final static QName _CsfbCdma2KMobilityParamsPrefMsidType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrefMsidType");
    private final static QName _CsfbCdma2KMobilityParamsTkzId_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzId");
    private final static QName _CsfbCdma2KMobilityParamsEncryptMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncryptMode");
    private final static QName _CsfbCdma2KMobilityParamsReconnectMsgIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReconnectMsgIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAutoFcsoAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoFcsoAllowed");
    private final static QName _CsfbCdma2KMobilityParamsPzHystTimerExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystTimerExp");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupInclIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupInclIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSdbSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbSupported");
    private final static QName _CsfbCdma2KMobilityParamsBypassRegIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BypassRegIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Auth");
    private final static QName _CsfbCdma2KMobilityParamsRegDist_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegDist");
    private final static QName _CsfbCdma2KMobilityParamsRerModeSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RerModeSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMinPRev_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinPRev");
    private final static QName _CsfbCdma2KMobilityParamsEncSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncSupported");
    private final static QName _CsfbCdma2KMobilityParamsDayLt_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayLt");
    private final static QName _CsfbCdma2KMobilityParamsBandClassInfoReqIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassInfoReqIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMeidReqdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeidReqdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "NegSlotCycleIndexSupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsgIntegritySup_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsgIntegritySup");
    private final static QName _CsfbCdma2KMobilityParamsMsInitPosLocSupIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsInitPosLocSupIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSidIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SidIncluded");
    private final static QName _CsfbCdma2KMobilityParamsExtPrefMsidTypeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ExtPrefMsidTypeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMobQos_QNAME = new QName("http://Airspan.Netspan.WebServices", "MobQos");
    private final static QName _CsfbCdma2KMobilityParamsForSidRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForSidRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTkzModeSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzModeSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPzHystActTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystActTimer");
    private final static QName _CsfbCdma2KMobilityParamsMccIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MccIncluded");
    private final static QName _CsfbCdma2KMobilityParamsForNidRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForNidRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSid_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sid");
    private final static QName _CsfbCdma2KMobilityParamsRegDistIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegDistIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegZone");
    private final static QName _CsfbCdma2KMobilityParamsPzHystEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystEnabled");
    private final static QName _CsfbCdma2KMobilityParamsMultSidsIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultSidsIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPacketZoneId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketZoneId");
    private final static QName _CsfbCdma2KMobilityParamsLpSecIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "LpSecIncluded");
    private final static QName _CsfbCdma2KMobilityParamsForSidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForSidReg");
    private final static QName _CsfbCdma2KMobilityParamsMeidReqd_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeidReqd");
    private final static QName _CsfbCdma2KMobilityParamsPowerUpReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerUpReg");
    private final static QName _CsfbCdma2KMobilityParamsImsi1112_QNAME = new QName("http://Airspan.Netspan.WebServices", "Imsi1112");
    private final static QName _CsfbCdma2KMobilityParamsNegSlotCycleIndexSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "NegSlotCycleIndexSup");
    private final static QName _CsfbCdma2KMobilityParamsEncryptModeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncryptModeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPowerDownReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerDownReg");
    private final static QName _CsfbCdma2KMobilityParamsPzHystInfoIncl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystInfoIncl");
    private final static QName _CsfbCdma2KMobilityParamsMinPRevIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinPRevIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAutoFcsoAllowedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoFcsoAllowedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTAddIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TAddIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPRevIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PRevIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTAdd_QNAME = new QName("http://Airspan.Netspan.WebServices", "TAdd");
    private final static QName _MobilityIdleIntraFreqWsQhystSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "QhystSfMedium");
    private final static QName _MobilityIdleIntraFreqWsQhystSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QhystSfMediumIsDefault");
    private final static QName _MobilityIdleIntraFreqWsQhystSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QhystSfHighIsDefault");
    private final static QName _MobilityIdleIntraFreqWsQhystSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "QhystSfHigh");
    private final static QName _CsfbCdma2KCellParamsMarketId_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarketId");
    private final static QName _CsfbCdma2KCellParamsArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Arfcn");
    private final static QName _CsfbCdma2KCellParamsSwitchNum_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwitchNum");
    private final static QName _CsfbCdma2KCellParamsSectorNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "SectorNumber");
    private final static QName _LteAddNeighbourForCellWsNodeCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeCellNumber");
    private final static QName _LteAddNeighbourForCellWsNeighbourCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourCellNumber");
    private final static QName _CellCallTraceWsSibsGranularityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SibsGranularityIsDefault");
    private final static QName _CellCallTraceWsSibsGranularity_QNAME = new QName("http://Airspan.Netspan.WebServices", "SibsGranularity");
    private final static QName _YearlyOption2DayOfWeek_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayOfWeek");
    private final static QName _YearlyOption2XStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "XStart");
    private final static QName _LteAddNeighbourWsX2ControlState_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2ControlState");
    private final static QName _LteAddNeighbourWsQOffsetRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "QOffsetRange");
    private final static QName _LteAddNeighbourWsCellIndividualOffsetRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIndividualOffsetRange");
    private final static QName _LteAddNeighbourWsIsStaticNeighbour_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStaticNeighbour");
    private final static QName _LteAddNeighbourWsHoControlState_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoControlState");
    private final static QName _LteAddNeighbourWsHandoverType_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverType");
    private final static QName _CellNeighborManagementWsOnDurationTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "OnDurationTimer");
    private final static QName _CellNeighborManagementWsDrxRetransmissionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxRetransmissionTimerIsDefault");
    private final static QName _CellNeighborManagementWsDrxInactivityTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxInactivityTimerIsDefault");
    private final static QName _CellNeighborManagementWsAnrMeasuringUesThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrMeasuringUesThresholdIsDefault");
    private final static QName _CellNeighborManagementWsNumberOfPciToQueryForCgi_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfPciToQueryForCgi");
    private final static QName _CellNeighborManagementWsOnDurationTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "OnDurationTimerIsDefault");
    private final static QName _CellNeighborManagementWsLongDrxCycleIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LongDrxCycleIsDefault");
    private final static QName _CellNeighborManagementWsDrxRetransmissionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxRetransmissionTimer");
    private final static QName _CellNeighborManagementWsCgiRsrpIntraFreqThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CgiRsrpIntraFreqThreshold");
    private final static QName _CellNeighborManagementWsReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportIntervalIsDefault");
    private final static QName _CellNeighborManagementWsCgiRsrpIntraFreqThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CgiRsrpIntraFreqThresholdIsDefault");
    private final static QName _CellNeighborManagementWsAnrMeasuringUesThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrMeasuringUesThreshold");
    private final static QName _CellNeighborManagementWsCgiReportMcsThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CgiReportMcsThreshold");
    private final static QName _CellNeighborManagementWsNghRemoveThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NghRemoveThresholdIsDefault");
    private final static QName _CellNeighborManagementWsReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportInterval");
    private final static QName _CellNeighborManagementWsHoAttemptsThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoAttemptsThresholdIsDefault");
    private final static QName _CellNeighborManagementWsHoAttemptsThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoAttemptsThreshold");
    private final static QName _CellNeighborManagementWsLongDrxCycle_QNAME = new QName("http://Airspan.Netspan.WebServices", "LongDrxCycle");
    private final static QName _CellNeighborManagementWsInitialPiMetric_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPiMetric");
    private final static QName _CellNeighborManagementWsRsrpThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpThresholdIsDefault");
    private final static QName _CellNeighborManagementWsRsrpThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpThreshold");
    private final static QName _CellNeighborManagementWsInitialPiMetricIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPiMetricIsDefault");
    private final static QName _CellNeighborManagementWsCgiReportMcsThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CgiReportMcsThresholdIsDefault");
    private final static QName _CellNeighborManagementWsNumberOfPciToQueryForCgiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfPciToQueryForCgiIsDefault");
    private final static QName _CellNeighborManagementWsDrxInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxInactivityTimer");
    private final static QName _CellNeighborManagementWsNghRemoveThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "NghRemoveThreshold");
    private final static QName _EnbSyncProfileParamsPtpProfileType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpProfileType");
    private final static QName _EnbSyncProfileParamsSecondaryMasterDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryMasterDomain");
    private final static QName _EnbSyncProfileParamsPrimaryMasterDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryMasterDomain");
    private final static QName _EnbSyncProfileParamsAnnounceRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnnounceRateInMsgPerSec");
    private final static QName _EnbSyncProfileParamsPrimaryClockSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryClockSource");
    private final static QName _EnbSyncProfileParamsGnssMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "GnssMode");
    private final static QName _EnbSyncProfileParamsDelayRequestResponseRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "DelayRequestResponseRateInMsgPerSec");
    private final static QName _EnbSyncProfileParamsLeaseDurationInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeaseDurationInSec");
    private final static QName _EnbSyncProfileParamsSyncRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncRateInMsgPerSec");
    private final static QName _LteUlPktDataPriorityEntryWsVlanPcp_QNAME = new QName("http://Airspan.Netspan.WebServices", "VlanPcp");
    private final static QName _LteUlPktDataPriorityEntryWsDscp_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp");
    private final static QName _MobilityIdleInterFreqWsAllowedMeasurementBandwidthIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowedMeasurementBandwidthIsDefault");
    private final static QName _MobilityIdleInterFreqWsAllowedMeasurementBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowedMeasurementBandwidth");
    private final static QName _DlTxOptOsgMinTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "OsgMinTxPower");
    private final static QName _DlTxOptOsgMaxTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "OsgMaxTxPower");
    private final static QName _LteCellGetWsCellIdentity28Bit_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity28Bit");
    private final static QName _LteCellGetWsPhysicalCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalCellId");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci5Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci5Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci6Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci6Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci7Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci7Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci1_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci1");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci2_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci2");
    private final static QName _MobilityConnectedModeQosFreqA3Offset_QNAME = new QName("http://Airspan.Netspan.WebServices", "A3Offset");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci5_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci5");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci6_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci6");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci3_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci3");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci4_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci4");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci9_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci9");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci7_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci7");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci3Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci3Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci8_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci8");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci4Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci4Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci2Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci2Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci1Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci1Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci9Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci9Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci8Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci8Included");
    private final static QName _MobilityConnectedModeQosFreqRsrpEventThreshold2_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpEventThreshold2");
    private final static QName _MobilityConnectedModeEarfcnUseDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseDefault");
    private final static QName _MobilityConnectedModeEarfcnAllowX2NrtUpdate_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowX2NrtUpdate");
    private final static QName _MobilityIdleModeInterBandBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _PciRangePciEnd_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciEnd");
    private final static QName _PciRangePciStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciStart");
    private final static QName _MonthlyOption2Start_QNAME = new QName("http://Airspan.Netspan.WebServices", "Start");
    private final static QName _MonthlyOption2EveryYMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryYMonth");
    private final static QName _UtranProfileSecondaryDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryDuplexMode");
    private final static QName _UtranProfileSecondaryArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryArfcn");
    private final static QName _UtranProfilePrimaryDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryDuplexMode");
    private final static QName _UtranProfileSecondaryArfcnBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryArfcnBand");
    private final static QName _UtranProfilePrimaryArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryArfcn");
    private final static QName _UtranProfileUtranEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtranEnabled");
    private final static QName _UtranProfilePrimaryArfcnBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryArfcnBand");
    private final static QName _UplinkLinkAdaptationWsCellEfficiencyFactorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellEfficiencyFactorIsDefault");
    private final static QName _UplinkLinkAdaptationWsUplinkEfficiencyModeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkEfficiencyModeIsDefault");
    private final static QName _UplinkLinkAdaptationWsTargetMcsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetMcsIsDefault");
    private final static QName _UplinkLinkAdaptationWsTargetMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetMcs");
    private final static QName _UplinkLinkAdaptationWsCellEfficiencyFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellEfficiencyFactor");
    private final static QName _UplinkLinkAdaptationWsUplinkEfficiencyMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkEfficiencyMode");
    private final static QName _NeighborManagementWsX2GuardPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2GuardPeriod");
    private final static QName _NeighborManagementWsX2GuardPeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2GuardPeriodIsDefault");
    private final static QName _HandoverWsSourceTs1ReloCprep_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTs1ReloCprep");
    private final static QName _HandoverWsPacketForwardingEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketForwardingEnabled");
    private final static QName _HandoverWsPacketForwardingEnabledIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketForwardingEnabledIsDefault");
    private final static QName _HandoverWsSourceTx2ReloCprepIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTx2ReloCprepIsDefault");
    private final static QName _HandoverWsSourceTx2ReloCprep_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTx2ReloCprep");
    private final static QName _HandoverWsTargetFwhoContextFetchTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetFwhoContextFetchTimer");
    private final static QName _HandoverWsSourceTx2ReloCoverall_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTx2ReloCoverall");
    private final static QName _HandoverWsAllowHoWithoutHrl_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowHoWithoutHrl");
    private final static QName _HandoverWsTargetFwhoContextFetchTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetFwhoContextFetchTimerIsDefault");
    private final static QName _HandoverWsSourceTx2ReloCoverallIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTx2ReloCoverallIsDefault");
    private final static QName _HandoverWsSourceTs1ReloCoverall_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTs1ReloCoverall");
    private final static QName _HandoverWsSourceTs1ReloCoverallIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTs1ReloCoverallIsDefault");
    private final static QName _HandoverWsAllowHoWithoutHrlIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowHoWithoutHrlIsDefault");
    private final static QName _HandoverWsSourceTs1ReloCprepIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SourceTs1ReloCprepIsDefault");
    private final static QName _HandoverWsTargetX2S1RelocExecutionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetX2S1RelocExecutionTimerIsDefault");
    private final static QName _HandoverWsTargetX2S1RelocExecutionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetX2S1RelocExecutionTimer");
    private final static QName _DailyOption1EveryXDay_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryXDay");
    private final static QName _EnbManagementProfilePerQciStatsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PerQciStatsIsEnabled");
    private final static QName _EnbManagementProfilePerMcsStatsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PerMcsStatsIsEnabled");
    private final static QName _EnbManagementProfilePerTargetCellStatsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PerTargetCellStatsIsEnabled");
    private final static QName _EnbManagementProfileAnrStatusCollectionIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrStatusCollectionIsEnabled");
    private final static QName _EnbManagementProfileStatsCollectionIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsCollectionIsEnabled");
    private final static QName _EnbManagementProfileGranularityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "GranularityPeriod");
    private final static QName _MobilityGeranReselectionPriorityEntryWsPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _EmergencyCallWsPreemptionVulnerability_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionVulnerability");
    private final static QName _EmergencyCallWsEmergencyResetTimeoutTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyResetTimeoutTimer");
    private final static QName _EmergencyCallWsEmergencyCallTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyCallTimerIsDefault");
    private final static QName _EmergencyCallWsPreemptionCapability_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionCapability");
    private final static QName _EmergencyCallWsHighestArp_QNAME = new QName("http://Airspan.Netspan.WebServices", "HighestArp");
    private final static QName _EmergencyCallWsPreemptionVulnerabilityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionVulnerabilityIsDefault");
    private final static QName _EmergencyCallWsHighestArpIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HighestArpIsDefault");
    private final static QName _EmergencyCallWsPreemptionCapabilityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionCapabilityIsDefault");
    private final static QName _EmergencyCallWsEmergencyResetTimeoutTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyResetTimeoutTimerIsDefault");
    private final static QName _EmergencyCallWsEmergencyCheckIntervalTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyCheckIntervalTimerIsDefault");
    private final static QName _EmergencyCallWsEmergencyCheckIntervalTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyCheckIntervalTimer");
    private final static QName _EmergencyCallWsEmergencyCallTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyCallTimer");
    private final static QName _RecurrenceSelectedRecurrence_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelectedRecurrence");
    private final static QName _AuPnpDetailWsIsSwScheduled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSwScheduled");
    private final static QName _CellPuschWsDeltaPreambleMsg3_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaPreambleMsg3");
    private final static QName _CellPuschWsDeltaPreambleMsg3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaPreambleMsg3IsDefault");
    private final static QName _CellPuschWsAlpha_QNAME = new QName("http://Airspan.Netspan.WebServices", "Alpha");
    private final static QName _CellPuschWsP0NominalPuschIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPuschIsDefault");
    private final static QName _CellPuschWsAlphaIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AlphaIsDefault");
    private final static QName _CellPuschWsP0NominalPusch_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPusch");
    private final static QName _Sib1WsS9PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S9PeriodicityIsDefault");
    private final static QName _Sib1WsS11PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S11PeriodicityIsDefault");
    private final static QName _Sib1WsS9Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S9Periodicity");
    private final static QName _Sib1WsPmax_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pmax");
    private final static QName _Sib1WsS11Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S11Periodicity");
    private final static QName _Sib1WsS4Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S4Periodicity");
    private final static QName _Sib1WsS6PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S6PeriodicityIsDefault");
    private final static QName _Sib1WsSiWindowLength_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiWindowLength");
    private final static QName _Sib1WsS4PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S4PeriodicityIsDefault");
    private final static QName _Sib1WsS12Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S12Periodicity");
    private final static QName _Sib1WsS10Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S10Periodicity");
    private final static QName _Sib1WsQqualMinValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "QqualMinValue");
    private final static QName _Sib1WsQrxLevMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QrxLevMin");
    private final static QName _Sib1WsPmaxIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PmaxIsDefault");
    private final static QName _Sib1WsS3PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S3PeriodicityIsDefault");
    private final static QName _Sib1WsS8Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S8Periodicity");
    private final static QName _Sib1WsS12PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S12PeriodicityIsDefault");
    private final static QName _Sib1WsS5Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S5Periodicity");
    private final static QName _Sib1WsS8PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S8PeriodicityIsDefault");
    private final static QName _Sib1WsS13Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S13Periodicity");
    private final static QName _Sib1WsQqualMinOffsetIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QqualMinOffsetIsDefault");
    private final static QName _Sib1WsQqualMinValueIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QqualMinValueIsDefault");
    private final static QName _Sib1WsQrxLevMinIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QrxLevMinIsDefault");
    private final static QName _Sib1WsS7Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S7Periodicity");
    private final static QName _Sib1WsQqualMinOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "QqualMinOffset");
    private final static QName _Sib1WsS2Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S2Periodicity");
    private final static QName _Sib1WsS6Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S6Periodicity");
    private final static QName _Sib1WsS10PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S10PeriodicityIsDefault");
    private final static QName _Sib1WsS5PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S5PeriodicityIsDefault");
    private final static QName _Sib1WsSiWindowLengthIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiWindowLengthIsDefault");
    private final static QName _Sib1WsS13PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S13PeriodicityIsDefault");
    private final static QName _Sib1WsS3Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S3Periodicity");
    private final static QName _Sib1WsS7PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S7PeriodicityIsDefault");
    private final static QName _Sib1WsS2PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S2PeriodicityIsDefault");
    private final static QName _TrafficManagementWsS1MediumThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1MediumThreshold");
    private final static QName _TrafficManagementWsS1HighThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1HighThreshold");
    private final static QName _TrafficManagementWsS1HighThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1HighThresholdIsDefault");
    private final static QName _TrafficManagementWsHwMediumThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwMediumThresholdIsDefault");
    private final static QName _TrafficManagementWsCbrQci9IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci9IsDefault");
    private final static QName _TrafficManagementWsHwMediumThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwMediumThreshold");
    private final static QName _TrafficManagementWsMaxAllowedMeasIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAllowedMeasIsDefault");
    private final static QName _TrafficManagementWsCbrQci6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci6IsDefault");
    private final static QName _TrafficManagementWsS1BandwidthIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1BandwidthIsDefault");
    private final static QName _TrafficManagementWsCapacityClassValueIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityClassValueIsDefault");
    private final static QName _TrafficManagementWsHwLowThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwLowThreshold");
    private final static QName _TrafficManagementWsCbrQci7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci7IsDefault");
    private final static QName _TrafficManagementWsS1Bandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1Bandwidth");
    private final static QName _TrafficManagementWsResourceStatusReportingInitiationTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "ResourceStatusReportingInitiationTimer");
    private final static QName _TrafficManagementWsCbrQci5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci5IsDefault");
    private final static QName _TrafficManagementWsS1MediumThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1MediumThresholdIsDefault");
    private final static QName _TrafficManagementWsCbrQci5_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci5");
    private final static QName _TrafficManagementWsCbrQci6_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci6");
    private final static QName _TrafficManagementWsCbrQci7_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci7");
    private final static QName _TrafficManagementWsMaxAllowedMeas_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAllowedMeas");
    private final static QName _TrafficManagementWsCbrQci8_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci8");
    private final static QName _TrafficManagementWsCbrQci9_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci9");
    private final static QName _TrafficManagementWsHwLowThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwLowThresholdIsDefault");
    private final static QName _TrafficManagementWsMeasSampleIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasSampleIntervalIsDefault");
    private final static QName _TrafficManagementWsS1LowThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1LowThresholdIsDefault");
    private final static QName _TrafficManagementWsHwHighThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwHighThresholdIsDefault");
    private final static QName _TrafficManagementWsCapacityClassValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityClassValue");
    private final static QName _TrafficManagementWsResourceStatusReportingInitiationTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ResourceStatusReportingInitiationTimerIsDefault");
    private final static QName _TrafficManagementWsHwHighThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwHighThreshold");
    private final static QName _TrafficManagementWsMeasSampleInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasSampleInterval");
    private final static QName _TrafficManagementWsS1LowThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1LowThreshold");
    private final static QName _TrafficManagementWsCbrQci8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci8IsDefault");
    private final static QName _EnbEmbmsProfileSyncAreaId_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncAreaId");
    private final static QName _EnbEmbmsProfileBroadcastSib15Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "BroadcastSib15Enabled");
    private final static QName _EnbEmbmsProfileEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "Enabled");
    private final static QName _EnbSonProfilePnpMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpMode");
    private final static QName _EnbSonProfileAnrEnbPciMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrEnbPciMode");
    private final static QName _EnbSonProfileSonCommissioningEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "SonCommissioningEnabled");
    private final static QName _EnbSonProfilePciEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciEnabled");
    private final static QName _EnbSonProfileAnrState_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrState");
    private final static QName _EnbSonProfileMinAllowedHoSuccessRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinAllowedHoSuccessRate");
    private final static QName _EnbSonProfileRsiEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiEnabled");
    private final static QName _MonthlyOption1DateOfMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "DateOfMonth");
    private final static QName _MonthlyOption1EveryXMonth_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryXMonth");
    private final static QName _EnbSecurityProfileNullCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullCipheringLevel");
    private final static QName _EnbSecurityProfileSnow3GCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snow3GCipheringLevel");
    private final static QName _EnbSecurityProfileSecurityForCiphering_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityForCiphering");
    private final static QName _EnbSecurityProfileSecurityForIntegrity_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityForIntegrity");
    private final static QName _EnbSecurityProfileAesIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AesIntegrityLevel");
    private final static QName _EnbSecurityProfileSshEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "SshEnabled");
    private final static QName _EnbSecurityProfileAesCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AesCipheringLevel");
    private final static QName _EnbSecurityProfileNullIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullIntegrityLevel");
    private final static QName _EnbSecurityProfileSnow3GIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snow3GIntegrityLevel");
    private final static QName _EnbSecurityProfileWebGUIAccessEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WebGUIAccessEnabled");
    private final static QName _ReselectionWsReselectionUtraSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtraSfMediumIsDefault");
    private final static QName _ReselectionWsNccPermittedBit2_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit2");
    private final static QName _ReselectionWsReselectionGeranSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfMedium");
    private final static QName _ReselectionWsNccPermittedBit1_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit1");
    private final static QName _ReselectionWsReselectionGeranSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfMediumIsDefault");
    private final static QName _ReselectionWsNccPermittedBit7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit7IsDefault");
    private final static QName _ReselectionWsGeranSpeedStateScaleFactorsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "GeranSpeedStateScaleFactorsIsDefault");
    private final static QName _ReselectionWsNccPermittedBit2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit2IsDefault");
    private final static QName _ReselectionWsNccPermittedBit8_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit8");
    private final static QName _ReselectionWsNccPermittedBit7_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit7");
    private final static QName _ReselectionWsGeranSpeedStateScaleFactors_QNAME = new QName("http://Airspan.Netspan.WebServices", "GeranSpeedStateScaleFactors");
    private final static QName _ReselectionWsNccPermittedBit8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit8IsDefault");
    private final static QName _ReselectionWsNccPermittedBit4_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit4");
    private final static QName _ReselectionWsNccPermittedBit3_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit3");
    private final static QName _ReselectionWsNccPermittedBit6_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit6");
    private final static QName _ReselectionWsReselectionUtraSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtraSfHigh");
    private final static QName _ReselectionWsNccPermittedBit5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit5IsDefault");
    private final static QName _ReselectionWsNccPermittedBit5_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit5");
    private final static QName _ReselectionWsNccPermittedBit6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit6IsDefault");
    private final static QName _ReselectionWsUtraSpeedStateScaleFactorsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtraSpeedStateScaleFactorsIsDefault");
    private final static QName _ReselectionWsNccPermittedBit3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit3IsDefault");
    private final static QName _ReselectionWsReselectionGeranSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfHigh");
    private final static QName _ReselectionWsNccPermittedBit4IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit4IsDefault");
    private final static QName _ReselectionWsUtraSpeedStateScaleFactors_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtraSpeedStateScaleFactors");
    private final static QName _ReselectionWsReselectionUtraSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtraSfHighIsDefault");
    private final static QName _ReselectionWsReselectionUtraSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtraSfMedium");
    private final static QName _ReselectionWsReselectionGeranSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfHighIsDefault");
    private final static QName _ReselectionWsNccPermittedBit1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit1IsDefault");
    private final static QName _LteS1EntryWsSctpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpPort");
    private final static QName _CellAirSonWsCpuLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadWeightIsDefault");
    private final static QName _CellAirSonWsRrcLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadWeightIsDefault");
    private final static QName _CellAirSonWsCapacitySampleIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacitySampleIntervalIsDefault");
    private final static QName _CellAirSonWsCpuLoadThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadThresholdIsDefault");
    private final static QName _CellAirSonWsCapacityReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityReportInterval");
    private final static QName _CellAirSonWsAperiodicCqiGuardTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiGuardTimer");
    private final static QName _CellAirSonWsHoReportEvaluationTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoReportEvaluationTimer");
    private final static QName _CellAirSonWsRrcLoadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadThreshold");
    private final static QName _CellAirSonWsPuschLoadThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PuschLoadThresholdIsDefault");
    private final static QName _CellAirSonWsAperiodicCqiGuardTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiGuardTimerIsDefault");
    private final static QName _CellAirSonWsUeThroughputReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeThroughputReportInterval");
    private final static QName _CellAirSonWsUeThroughputReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeThroughputReportIntervalIsDefault");
    private final static QName _CellAirSonWsCapacityReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityReportIntervalIsDefault");
    private final static QName _CellAirSonWsAperiodicCqiMinMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiMinMcs");
    private final static QName _CellAirSonWsPrbLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrbLoadWeight");
    private final static QName _CellAirSonWsRrcLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadWeight");
    private final static QName _CellAirSonWsHoKpiReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoKpiReportIntervalIsDefault");
    private final static QName _CellAirSonWsHoKpiReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoKpiReportInterval");
    private final static QName _CellAirSonWsAperiodicCqiMinMcsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiMinMcsIsDefault");
    private final static QName _CellAirSonWsHoReportEvaluationTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoReportEvaluationTimerIsDefault");
    private final static QName _CellAirSonWsCpuLoadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadThreshold");
    private final static QName _CellAirSonWsRrcLoadThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadThresholdIsDefault");
    private final static QName _CellAirSonWsCpuLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadWeight");
    private final static QName _CellAirSonWsPuschLoadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "PuschLoadThreshold");
    private final static QName _CellAirSonWsPrbLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrbLoadWeightIsDefault");
    private final static QName _CellAirSonWsCapacitySampleInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacitySampleInterval");
    private final static QName _CellAirSonWsPdschLoadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschLoadThreshold");
    private final static QName _CellAirSonWsPdschLoadThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdschLoadThresholdIsDefault");
    private final static QName _AuRelayDetailsManagementModeOnly_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementModeOnly");
    private final static QName _AuRelayDetailsIsPdclLocked_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPdclLocked");
    private final static QName _CsfbCdma2KSib8ParamsMultipleSid_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultipleSid");
    private final static QName _CsfbCdma2KSib8ParamsMultipleNid_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultipleNid");
    private final static QName _CsfbCdma2KSib8ParamsRegistrationPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegistrationPeriod");
    private final static QName _CsfbCdma2KSib8ParamsTotalZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZone");
    private final static QName _CsfbCdma2KSib8ParamsForeignSidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForeignSidReg");
    private final static QName _CsfbCdma2KSib8ParamsRegistrationZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegistrationZone");
    private final static QName _CsfbCdma2KSib8ParamsForeignNidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForeignNidReg");
    private final static QName _CellEmbmsWsNotificationOffsetIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationOffsetIsDefault");
    private final static QName _CellEmbmsWsChangeNotificationInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChangeNotificationInterval");
    private final static QName _CellEmbmsWsNotificationOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationOffset");
    private final static QName _CellEmbmsWsNotificationSfIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationSfIndex");
    private final static QName _CellEmbmsWsNotificationRepetitionCoeffIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationRepetitionCoeffIsDefault");
    private final static QName _CellEmbmsWsNotificationRepetitionCoeff_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationRepetitionCoeff");
    private final static QName _CellEmbmsWsNotificationSfIndexIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NotificationSfIndexIsDefault");
    private final static QName _CellEmbmsWsChangeNotificationIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChangeNotificationIntervalIsDefault");
    private final static QName _AirSonWsWarmResetModeAdminIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetModeAdminIsDefault");
    private final static QName _AirSonWsGpsLockWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockWaitTimeIsDefault");
    private final static QName _AirSonWsPciAllocPolicy_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciAllocPolicy");
    private final static QName _AirSonWsAnrTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrTimer");
    private final static QName _AirSonWsCellInitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellInitTime");
    private final static QName _AirSonWsPnpGlobalTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpGlobalTimerIsDefault");
    private final static QName _AirSonWsGpsLockWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockWaitTime");
    private final static QName _AirSonWsAutoSoftwareDownload_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareDownload");
    private final static QName _AirSonWsConnectionLostMaxRetriesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionLostMaxRetriesIsDefault");
    private final static QName _AirSonWsDhcpWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpWaitTime");
    private final static QName _AirSonWsDhcpFailWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpFailWaitTime");
    private final static QName _AirSonWsWarmResetAutoInventoryFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoInventoryFailTimerIsDefault");
    private final static QName _AirSonWsSelfTestRetryTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestRetryTimeIsDefault");
    private final static QName _AirSonWsFullDynamicRadioConfigurationIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FullDynamicRadioConfigurationIsDefault");
    private final static QName _AirSonWsDefaultConfigurationWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultConfigurationWaitTimeIsDefault");
    private final static QName _AirSonWsWarmResetConfigurationFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetConfigurationFailTimerIsDefault");
    private final static QName _AirSonWsPowerLevelTimeIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerLevelTimeIntervalIsDefault");
    private final static QName _AirSonWsConfigurationProvisioning_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigurationProvisioning");
    private final static QName _AirSonWsDelayBetweenConnectionRetriesCycleIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DelayBetweenConnectionRetriesCycleIsDefault");
    private final static QName _AirSonWsDefaultConfigurationWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultConfigurationWaitTime");
    private final static QName _AirSonWsLowPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "LowPower");
    private final static QName _AirSonWsEsonConnectionRetryTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EsonConnectionRetryTimer");
    private final static QName _AirSonWsPersistencyModeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PersistencyModeIsDefault");
    private final static QName _AirSonWsPersistencyMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PersistencyMode");
    private final static QName _AirSonWsPowerLevelTimeInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerLevelTimeInterval");
    private final static QName _AirSonWsSelfTestFailWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestFailWaitTime");
    private final static QName _AirSonWsMaxDhcpRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDhcpRetry");
    private final static QName _AirSonWsAutoSoftwareWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareWaitTime");
    private final static QName _AirSonWsConnectionLostMaxRetries_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionLostMaxRetries");
    private final static QName _AirSonWsDelayBetweenConnectionRetriesCycle_QNAME = new QName("http://Airspan.Netspan.WebServices", "DelayBetweenConnectionRetriesCycle");
    private final static QName _AirSonWsWarmResetAutoInventoryFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoInventoryFailTimer");
    private final static QName _AirSonWsMaxSelfTestRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSelfTestRetry");
    private final static QName _AirSonWsAutoInventoryUpdate_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoInventoryUpdate");
    private final static QName _AirSonWsWarmResetConfigurationFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetConfigurationFailTimer");
    private final static QName _AirSonWsWarmResetModeAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetModeAdmin");
    private final static QName _AirSonWsLowPowerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LowPowerIsDefault");
    private final static QName _AirSonWsSelfTestFailWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestFailWaitTimeIsDefault");
    private final static QName _AirSonWsPowerStepIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerStepIsDefault");
    private final static QName _AirSonWsBringupRetryIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "BringupRetryIntervalIsDefault");
    private final static QName _AirSonWsCellInitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellInitTimeIsDefault");
    private final static QName _AirSonWsCollisionResolutionDelayfactorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CollisionResolutionDelayfactorIsDefault");
    private final static QName _AirSonWsWarmResetSiteIdFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetSiteIdFailTimerIsDefault");
    private final static QName _AirSonWsWarmResetAutoSwDownloadFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoSwDownloadFailTimerIsDefault");
    private final static QName _AirSonWsAutoInventoryUpdateIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoInventoryUpdateIsDefault");
    private final static QName _AirSonWsInitialPciListSizeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPciListSizeIsDefault");
    private final static QName _AirSonWsMaxSiteIdentificationRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSiteIdentificationRetry");
    private final static QName _AirSonWsMaxDhcpRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDhcpRetryIsDefault");
    private final static QName _AirSonWsUeCollisionResolutionThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeCollisionResolutionThresholdIsDefault");
    private final static QName _AirSonWsMaxSelfTestRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSelfTestRetryIsDefault");
    private final static QName _AirSonWsCollisionResolutionDelayfactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "CollisionResolutionDelayfactor");
    private final static QName _AirSonWsDhcpWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpWaitTimeIsDefault");
    private final static QName _AirSonWsWarmResetSiteIdFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetSiteIdFailTimer");
    private final static QName _AirSonWsMaxPersistenceTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceTime");
    private final static QName _AirSonWsFullDynamicRadioConfiguration_QNAME = new QName("http://Airspan.Netspan.WebServices", "FullDynamicRadioConfiguration");
    private final static QName _AirSonWsInventoryCompleteWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryCompleteWaitTime");
    private final static QName _AirSonWsSiteIdGlobalTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdGlobalTimerIsDefault");
    private final static QName _AirSonWsPciCollisionResolutionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciCollisionResolutionTimer");
    private final static QName _AirSonWsMaxPersistenceRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceRadius");
    private final static QName _AirSonWsEsonConnectionRetryTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EsonConnectionRetryTimerIsDefault");
    private final static QName _AirSonWsInitialPciListSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPciListSize");
    private final static QName _AirSonWsWarmResetAutoSwDownloadFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoSwDownloadFailTimer");
    private final static QName _AirSonWsSiteIdGlobalTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdGlobalTimer");
    private final static QName _AirSonWsUeCollisionResolutionThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeCollisionResolutionThreshold");
    private final static QName _AirSonWsPciConfusionAllowedIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciConfusionAllowedIsDefault");
    private final static QName _AirSonWsPciCollisionResolutionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciCollisionResolutionTimerIsDefault");
    private final static QName _AirSonWsPciConfusionAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciConfusionAllowed");
    private final static QName _AirSonWsSiteIdFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdFailTimerIsDefault");
    private final static QName _AirSonWsAutoSoftwareDownloadIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareDownloadIsDefault");
    private final static QName _AirSonWsPowerStep_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerStep");
    private final static QName _AirSonWsPciAllocPolicyIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciAllocPolicyIsDefault");
    private final static QName _AirSonWsSelfTestRetryTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestRetryTime");
    private final static QName _AirSonWsMaxPersistenceTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceTimeIsDefault");
    private final static QName _AirSonWsAutoSoftwareWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareWaitTimeIsDefault");
    private final static QName _AirSonWsBringupRetryInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "BringupRetryInterval");
    private final static QName _AirSonWsPnpGlobalTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpGlobalTimer");
    private final static QName _AirSonWsDhcpFailWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpFailWaitTimeIsDefault");
    private final static QName _AirSonWsMaxPersistenceRadiusIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceRadiusIsDefault");
    private final static QName _AirSonWsConfigurationProvisioningIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigurationProvisioningIsDefault");
    private final static QName _AirSonWsAnrTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrTimerIsDefault");
    private final static QName _AirSonWsMaxSiteIdentificationRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSiteIdentificationRetryIsDefault");
    private final static QName _AirSonWsInventoryCompleteWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryCompleteWaitTimeIsDefault");
    private final static QName _AirSonWsSiteIdFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdFailTimer");
    private final static QName _CallTraceEnbWsTraceLogStartWaitForACK_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceLogStartWaitForACK");
    private final static QName _CallTraceEnbWsTraceKeepAliveFailures_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceKeepAliveFailures");
    private final static QName _CallTraceEnbWsTraceKeepAlive_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceKeepAlive");
    private final static QName _CallTraceEnbWsDelayBetweenRetries_QNAME = new QName("http://Airspan.Netspan.WebServices", "DelayBetweenRetries");
    private final static QName _CallTraceEnbWsTraceLogStartEndResumeRetransmissions_QNAME = new QName("http://Airspan.Netspan.WebServices", "TraceLogStartEndResumeRetransmissions");
    private final static QName _ConnectionControlWsT304IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T304IsDefault");
    private final static QName _ConnectionControlWsT320IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T320IsDefault");
    private final static QName _ConnectionControlWsT311IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T311IsDefault");
    private final static QName _ConnectionControlWsT300_QNAME = new QName("http://Airspan.Netspan.WebServices", "T300");
    private final static QName _ConnectionControlWsT311_QNAME = new QName("http://Airspan.Netspan.WebServices", "T311");
    private final static QName _ConnectionControlWsT300IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T300IsDefault");
    private final static QName _ConnectionControlWsT310_QNAME = new QName("http://Airspan.Netspan.WebServices", "T310");
    private final static QName _ConnectionControlWsT320_QNAME = new QName("http://Airspan.Netspan.WebServices", "T320");
    private final static QName _ConnectionControlWsT310IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T310IsDefault");
    private final static QName _ConnectionControlWsT301IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T301IsDefault");
    private final static QName _ConnectionControlWsN310IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "N310IsDefault");
    private final static QName _ConnectionControlWsN311_QNAME = new QName("http://Airspan.Netspan.WebServices", "N311");
    private final static QName _ConnectionControlWsRrcProcedureTimeout_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcProcedureTimeout");
    private final static QName _ConnectionControlWsN310_QNAME = new QName("http://Airspan.Netspan.WebServices", "N310");
    private final static QName _ConnectionControlWsT304_QNAME = new QName("http://Airspan.Netspan.WebServices", "T304");
    private final static QName _ConnectionControlWsT301_QNAME = new QName("http://Airspan.Netspan.WebServices", "T301");
    private final static QName _ConnectionControlWsRrcProcedureTimeoutIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcProcedureTimeoutIsDefault");
    private final static QName _ConnectionControlWsN311IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "N311IsDefault");
    private final static QName _EnbMobilityProfileParamsCsfbCdma2KEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbCdma2kEnabled");
    private final static QName _EnbMobilityProfileParamsIsInterRatUtranCoverageBasedRedirectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatUtranCoverageBasedRedirectionModeEnabled");
    private final static QName _EnbMobilityProfileParamsCsfbUtranEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbUtranEnabled");
    private final static QName _EnbMobilityProfileParamsIsInterRatGeranReselectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatGeranReselectionModeEnabled");
    private final static QName _EnbMobilityProfileParamsIsQosBasedMeasurementEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsQosBasedMeasurementEnabled");
    private final static QName _EnbMobilityProfileParamsIsThresholdBasedMeasurementEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsThresholdBasedMeasurementEnabled");
    private final static QName _EnbMobilityProfileParamsIsInterRatUtranReselectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatUtranReselectionModeEnabled");
    private final static QName _EnbMobilityProfileParamsFwdHoEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "FwdHoEnabled");
    private final static QName _EnbMobilityProfileParamsCsfbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbEnabled");
    private final static QName _MobilityInterRatUtranReselectionPMaxUtra_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMaxUtra");
    private final static QName _MobilityInterRatUtranReselectionTReselectionUtra_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionUtra");
    private final static QName _MobilityInterRatUtranReselectionThreshXQr9Low_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXQr9Low");
    private final static QName _MobilityInterRatUtranReselectionQQualMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QQualMin");
    private final static QName _MobilityInterRatUtranReselectionThreshXQr9High_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXQr9High");
    private final static QName _EnbRadioProfileEcidMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "EcidMode");
    private final static QName _EnbRadioProfileSfrSegments_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrSegments");
    private final static QName _EnbRadioProfileSfrThresholdType_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrThresholdType");
    private final static QName _EnbRadioProfileSfrMinMcsCellCenter_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrMinMcsCellCenter");
    private final static QName _EnbRadioProfileDownlinkFreqKHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkFreqKHz");
    private final static QName _EnbRadioProfileAddlSpectrumEmission_QNAME = new QName("http://Airspan.Netspan.WebServices", "AddlSpectrumEmission");
    private final static QName _EnbRadioProfileSfrThresholdValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrThresholdValue");
    private final static QName _EnbRadioProfileBandwidthMhz_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandwidthMhz");
    private final static QName _EnbRadioProfileMfbiEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MfbiEnabled");
    private final static QName _EnbRadioProfileDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "DuplexMode");
    private final static QName _EnbRadioProfileSsfType_QNAME = new QName("http://Airspan.Netspan.WebServices", "SsfType");
    private final static QName _EnbRadioProfileEcidTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EcidTimer");
    private final static QName _EnbRadioProfileUplinkFreqKHz_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkFreqKHz");
    private final static QName _EnbRadioProfileFrameConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameConfig");
    private final static QName _EnbRadioProfileTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _EnbRadioProfileSfrMaxMcsCellEdge_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrMaxMcsCellEdge");
    private final static QName _EnbRadioProfileSfrIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrIndex");
    private final static QName _DailyOption2EveryWeekDay_QNAME = new QName("http://Airspan.Netspan.WebServices", "EveryWeekDay");
    private final static QName _CellDynamicCfiWsMaxCfi_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxCfi");
    private final static QName _CellDynamicCfiWsTargetPddchPopulationRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetPddchPopulationRate");
    private final static QName _CellDynamicCfiWsCfiMonitoringInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "CfiMonitoringInterval");
    private final static QName _CellDynamicCfiWsMaxCfiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxCfiIsDefault");
    private final static QName _CellDynamicCfiWsMinCfiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinCfiIsDefault");
    private final static QName _CellDynamicCfiWsTargetPddchPopulationRateIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetPddchPopulationRateIsDefault");
    private final static QName _CellDynamicCfiWsCfiMonitoringIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CfiMonitoringIntervalIsDefault");
    private final static QName _CellDynamicCfiWsControlChannelOverloadOptimization_QNAME = new QName("http://Airspan.Netspan.WebServices", "ControlChannelOverloadOptimization");
    private final static QName _CellDynamicCfiWsMaxPddchFailRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPddchFailRate");
    private final static QName _CellDynamicCfiWsMaxPddchFailRateIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPddchFailRateIsDefault");
    private final static QName _CellDynamicCfiWsMinCfi_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinCfi");
    private final static QName _CellDynamicCfiWsChannelFormatIndicator_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelFormatIndicator");
    private final static QName _CellDynamicCfiWsPdcchOverAllocationTh_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcchOverAllocationTh");
    private final static QName _CellDynamicCfiWsPdcchOverAllocationThIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PdcchOverAllocationThIsDefault");
    private final static QName _CellDynamicCfiWsChannelFormatIndicatorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ChannelFormatIndicatorIsDefault");
    private final static QName _CellDynamicCfiWsControlChannelOverloadOptimizationIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ControlChannelOverloadOptimizationIsDefault");
    private final static QName _RelayChannelQualityEnbWsSptEffThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "SptEffThresh");
    private final static QName _RelayChannelQualityEnbWsSinrThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "SinrThresh");
    private final static QName _RelayChannelQualityEnbWsOutdoorTxOff_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutdoorTxOff");
    private final static QName _EtwsWsSib10Duration_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sib10Duration");
    private final static QName _EtwsWsSib10DurationIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sib10DurationIsDefault");
    private final static QName _MobilityIdleFreqWsTreselectionEutraSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TreselectionEutraSfHighIsDefault");
    private final static QName _MobilityIdleFreqWsTreselectionEutraSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TreselectionEutraSfMediumIsDefault");
    private final static QName _MobilityIdleFreqWsTreselectionEutraSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "TreselectionEutraSfMedium");
    private final static QName _MobilityIdleFreqWsTreselectionEutraSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "TreselectionEutraSfHigh");
    private final static QName _MobilityConnectedGeneralWsFiltercoefficientRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrq");
    private final static QName _MobilityConnectedGeneralWsFiltercoefficientRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrp");
    private final static QName _MobilityConnectedGeneralWsFiltercoefficientRsrqIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrqIsDefault");
    private final static QName _MobilityConnectedGeneralWsFiltercoefficientRsrpIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrpIsDefault");
    private final static QName _MobilityConnectedGeneralWsSMeasure_QNAME = new QName("http://Airspan.Netspan.WebServices", "SMeasure");
    private final static QName _MobilityConnectedGeneralWsSMeasureIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SMeasureIsDefault");
    private final static QName _Enb3RdPartyEnbType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbType");
    private final static QName _Enb3RdPartyTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tac");
    private final static QName _Enb3RdPartyBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _Enb3RdPartyCellIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity");
    private final static QName _Enb3RdPartyEnbId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbId");
    private final static QName _Enb3RdPartyCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _LteNbrConfigNodeType_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeType");
    private final static QName _LteNbrConfigNeighbourEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourEarfcn");
    private final static QName _LteNbrConfigNeighbourPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourPci");
    private final static QName _LteNbrConfigNeighbourTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourTac");
    private final static QName _EnbNeighbourNeighbourType_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourType");
    private final static QName _CellPucchWsP0NominalPucchIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPucchIsDefault");
    private final static QName _CellPucchWsP0NominalPucch_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPucch");
    private final static QName _CellPucchWsDeltaFPucchFormat1B_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1b");
    private final static QName _CellPucchWsDeltaFPucchFormat2B_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2b");
    private final static QName _CellPucchWsDeltaFPucchFormat1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1");
    private final static QName _CellPucchWsDeltaFPucchFormat1BIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1bIsDefault");
    private final static QName _CellPucchWsDeltaFPucchFormat2A_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2a");
    private final static QName _CellPucchWsDeltaFPucchFormat1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1IsDefault");
    private final static QName _CellPucchWsDeltaFPucchFormat2AIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2aIsDefault");
    private final static QName _CellPucchWsDeltaFPucchFormat2_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2");
    private final static QName _CellPucchWsDeltaFPucchFormat2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2IsDefault");
    private final static QName _CellPucchWsDeltaFPucchFormat2BIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2bIsDefault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_1.Lte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigGet }
     * 
     */
    public CellAdvancedProfileConfigGet createCellAdvancedProfileConfigGet() {
        return new CellAdvancedProfileConfigGet();
    }

    /**
     * Create an instance of {@link ManagementProfileUpdate }
     * 
     */
    public ManagementProfileUpdate createManagementProfileUpdate() {
        return new ManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbManagementProfile }
     * 
     */
    public EnbManagementProfile createEnbManagementProfile() {
        return new EnbManagementProfile();
    }

    /**
     * Create an instance of {@link EmbmsProfileDeleteResponse }
     * 
     */
    public EmbmsProfileDeleteResponse createEmbmsProfileDeleteResponse() {
        return new EmbmsProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link ProfileResponse }
     * 
     */
    public ProfileResponse createProfileResponse() {
        return new ProfileResponse();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileListResponse }
     * 
     */
    public SystemDefaultProfileListResponse createSystemDefaultProfileListResponse() {
        return new SystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
    }

    /**
     * Create an instance of {@link MobilityProfileUpdate }
     * 
     */
    public MobilityProfileUpdate createMobilityProfileUpdate() {
        return new MobilityProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbMobilityProfile }
     * 
     */
    public EnbMobilityProfile createEnbMobilityProfile() {
        return new EnbMobilityProfile();
    }

    /**
     * Create an instance of {@link UnityPnpConfigListResponse }
     * 
     */
    public UnityPnpConfigListResponse createUnityPnpConfigListResponse() {
        return new UnityPnpConfigListResponse();
    }

    /**
     * Create an instance of {@link NodeListResult }
     * 
     */
    public NodeListResult createNodeListResult() {
        return new NodeListResult();
    }

    /**
     * Create an instance of {@link ManagementProfileGet }
     * 
     */
    public ManagementProfileGet createManagementProfileGet() {
        return new ManagementProfileGet();
    }

    /**
     * Create an instance of {@link EnbFromEcgiGet }
     * 
     */
    public EnbFromEcgiGet createEnbFromEcgiGet() {
        return new EnbFromEcgiGet();
    }

    /**
     * Create an instance of {@link NetworkProfileCloneResponse }
     * 
     */
    public NetworkProfileCloneResponse createNetworkProfileCloneResponse() {
        return new NetworkProfileCloneResponse();
    }

    /**
     * Create an instance of {@link PnpConfigDeleteResponse }
     * 
     */
    public PnpConfigDeleteResponse createPnpConfigDeleteResponse() {
        return new PnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link LteNeighbourAddByCellNumber }
     * 
     */
    public LteNeighbourAddByCellNumber createLteNeighbourAddByCellNumber() {
        return new LteNeighbourAddByCellNumber();
    }

    /**
     * Create an instance of {@link LteAddNeighbourWs }
     * 
     */
    public LteAddNeighbourWs createLteAddNeighbourWs() {
        return new LteAddNeighbourWs();
    }

    /**
     * Create an instance of {@link UtranProfileCreate }
     * 
     */
    public UtranProfileCreate createUtranProfileCreate() {
        return new UtranProfileCreate();
    }

    /**
     * Create an instance of {@link UtranProfile }
     * 
     */
    public UtranProfile createUtranProfile() {
        return new UtranProfile();
    }

    /**
     * Create an instance of {@link UnityPnpConfigDeleteResponse }
     * 
     */
    public UnityPnpConfigDeleteResponse createUnityPnpConfigDeleteResponse() {
        return new UnityPnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link SonProfileGet }
     * 
     */
    public SonProfileGet createSonProfileGet() {
        return new SonProfileGet();
    }

    /**
     * Create an instance of {@link NetworkProfileDeleteResponse }
     * 
     */
    public NetworkProfileDeleteResponse createNetworkProfileDeleteResponse() {
        return new NetworkProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileUpdateResponse }
     * 
     */
    public MobilityProfileUpdateResponse createMobilityProfileUpdateResponse() {
        return new MobilityProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileGetResponse }
     * 
     */
    public SyncProfileGetResponse createSyncProfileGetResponse() {
        return new SyncProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteSyncProfileGetResult }
     * 
     */
    public LteSyncProfileGetResult createLteSyncProfileGetResult() {
        return new LteSyncProfileGetResult();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileGet }
     * 
     */
    public SystemDefaultProfileGet createSystemDefaultProfileGet() {
        return new SystemDefaultProfileGet();
    }

    /**
     * Create an instance of {@link NetworkProfileGetResponse }
     * 
     */
    public NetworkProfileGetResponse createNetworkProfileGetResponse() {
        return new NetworkProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteNetworkProfileGetResult }
     * 
     */
    public LteNetworkProfileGetResult createLteNetworkProfileGetResult() {
        return new LteNetworkProfileGetResult();
    }

    /**
     * Create an instance of {@link Lte3RdPartyGetResponse }
     * 
     */
    public Lte3RdPartyGetResponse createLte3RdPartyGetResponse() {
        return new Lte3RdPartyGetResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyGetResult }
     * 
     */
    public Lte3RdPartyGetResult createLte3RdPartyGetResult() {
        return new Lte3RdPartyGetResult();
    }

    /**
     * Create an instance of {@link SyncProfileCreate }
     * 
     */
    public SyncProfileCreate createSyncProfileCreate() {
        return new SyncProfileCreate();
    }

    /**
     * Create an instance of {@link EnbSyncProfile }
     * 
     */
    public EnbSyncProfile createEnbSyncProfile() {
        return new EnbSyncProfile();
    }

    /**
     * Create an instance of {@link EnbStateSet }
     * 
     */
    public EnbStateSet createEnbStateSet() {
        return new EnbStateSet();
    }

    /**
     * Create an instance of {@link UnityPnpConfigCreate }
     * 
     */
    public UnityPnpConfigCreate createUnityPnpConfigCreate() {
        return new UnityPnpConfigCreate();
    }

    /**
     * Create an instance of {@link AuPnpDetailWs }
     * 
     */
    public AuPnpDetailWs createAuPnpDetailWs() {
        return new AuPnpDetailWs();
    }

    /**
     * Create an instance of {@link AuPnpSnmpDetailWs }
     * 
     */
    public AuPnpSnmpDetailWs createAuPnpSnmpDetailWs() {
        return new AuPnpSnmpDetailWs();
    }

    /**
     * Create an instance of {@link AuRelayDetails }
     * 
     */
    public AuRelayDetails createAuRelayDetails() {
        return new AuRelayDetails();
    }

    /**
     * Create an instance of {@link AuEnbDetailWs }
     * 
     */
    public AuEnbDetailWs createAuEnbDetailWs() {
        return new AuEnbDetailWs();
    }

    /**
     * Create an instance of {@link EmbmsProfileList }
     * 
     */
    public EmbmsProfileList createEmbmsProfileList() {
        return new EmbmsProfileList();
    }

    /**
     * Create an instance of {@link Lte3RdPartyListResponse }
     * 
     */
    public Lte3RdPartyListResponse createLte3RdPartyListResponse() {
        return new Lte3RdPartyListResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigDeleteResponse }
     * 
     */
    public CellAdvancedProfileConfigDeleteResponse createCellAdvancedProfileConfigDeleteResponse() {
        return new CellAdvancedProfileConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileListResponse }
     * 
     */
    public NetworkProfileListResponse createNetworkProfileListResponse() {
        return new NetworkProfileListResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileGet }
     * 
     */
    public MobilityProfileGet createMobilityProfileGet() {
        return new MobilityProfileGet();
    }

    /**
     * Create an instance of {@link UnityPnpConfigList }
     * 
     */
    public UnityPnpConfigList createUnityPnpConfigList() {
        return new UnityPnpConfigList();
    }

    /**
     * Create an instance of {@link UtranProfileListResponse }
     * 
     */
    public UtranProfileListResponse createUtranProfileListResponse() {
        return new UtranProfileListResponse();
    }

    /**
     * Create an instance of {@link RadioProfileList }
     * 
     */
    public RadioProfileList createRadioProfileList() {
        return new RadioProfileList();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileGetResponse }
     * 
     */
    public SystemDefaultProfileGetResponse createSystemDefaultProfileGetResponse() {
        return new SystemDefaultProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteSystemDefaultGetResult }
     * 
     */
    public LteSystemDefaultGetResult createLteSystemDefaultGetResult() {
        return new LteSystemDefaultGetResult();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileDeleteResponse }
     * 
     */
    public TrafficManagementProfileDeleteResponse createTrafficManagementProfileDeleteResponse() {
        return new TrafficManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileListResponse }
     * 
     */
    public TrafficManagementProfileListResponse createTrafficManagementProfileListResponse() {
        return new TrafficManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link UtranProfileGet }
     * 
     */
    public UtranProfileGet createUtranProfileGet() {
        return new UtranProfileGet();
    }

    /**
     * Create an instance of {@link EnbAdvancedConfigProfileList }
     * 
     */
    public EnbAdvancedConfigProfileList createEnbAdvancedConfigProfileList() {
        return new EnbAdvancedConfigProfileList();
    }

    /**
     * Create an instance of {@link ManagementProfileListResponse }
     * 
     */
    public ManagementProfileListResponse createManagementProfileListResponse() {
        return new ManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileCreate }
     * 
     */
    public SecurityProfileCreate createSecurityProfileCreate() {
        return new SecurityProfileCreate();
    }

    /**
     * Create an instance of {@link EnbSecurityProfile }
     * 
     */
    public EnbSecurityProfile createEnbSecurityProfile() {
        return new EnbSecurityProfile();
    }

    /**
     * Create an instance of {@link NetworkProfileUpdate }
     * 
     */
    public NetworkProfileUpdate createNetworkProfileUpdate() {
        return new NetworkProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbNetworkProfile }
     * 
     */
    public EnbNetworkProfile createEnbNetworkProfile() {
        return new EnbNetworkProfile();
    }

    /**
     * Create an instance of {@link EmbmsProfileDelete }
     * 
     */
    public EmbmsProfileDelete createEmbmsProfileDelete() {
        return new EmbmsProfileDelete();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigCreate }
     * 
     */
    public EnbAdvancedProfileConfigCreate createEnbAdvancedProfileConfigCreate() {
        return new EnbAdvancedProfileConfigCreate();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfile }
     * 
     */
    public EnbAdvancedProfile createEnbAdvancedProfile() {
        return new EnbAdvancedProfile();
    }

    /**
     * Create an instance of {@link LteNeighbourSet }
     * 
     */
    public LteNeighbourSet createLteNeighbourSet() {
        return new LteNeighbourSet();
    }

    /**
     * Create an instance of {@link LteNbrConfig }
     * 
     */
    public LteNbrConfig createLteNbrConfig() {
        return new LteNbrConfig();
    }

    /**
     * Create an instance of {@link UtranProfileDelete }
     * 
     */
    public UtranProfileDelete createUtranProfileDelete() {
        return new UtranProfileDelete();
    }

    /**
     * Create an instance of {@link UtranProfileUpdateResponse }
     * 
     */
    public UtranProfileUpdateResponse createUtranProfileUpdateResponse() {
        return new UtranProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyUpdate }
     * 
     */
    public Lte3RdPartyUpdate createLte3RdPartyUpdate() {
        return new Lte3RdPartyUpdate();
    }

    /**
     * Create an instance of {@link Enb3RdParty }
     * 
     */
    public Enb3RdParty createEnb3RdParty() {
        return new Enb3RdParty();
    }

    /**
     * Create an instance of {@link CallTraceProfileGetResponse }
     * 
     */
    public CallTraceProfileGetResponse createCallTraceProfileGetResponse() {
        return new CallTraceProfileGetResponse();
    }

    /**
     * Create an instance of {@link CallTraceProfileGetResult }
     * 
     */
    public CallTraceProfileGetResult createCallTraceProfileGetResult() {
        return new CallTraceProfileGetResult();
    }

    /**
     * Create an instance of {@link MobilityProfileCreateResponse }
     * 
     */
    public MobilityProfileCreateResponse createMobilityProfileCreateResponse() {
        return new MobilityProfileCreateResponse();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileList }
     * 
     */
    public SystemDefaultProfileList createSystemDefaultProfileList() {
        return new SystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link CallTraceProfileListResponse }
     * 
     */
    public CallTraceProfileListResponse createCallTraceProfileListResponse() {
        return new CallTraceProfileListResponse();
    }

    /**
     * Create an instance of {@link RadioProfileCloneResponse }
     * 
     */
    public RadioProfileCloneResponse createRadioProfileCloneResponse() {
        return new RadioProfileCloneResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigClone }
     * 
     */
    public CellAdvancedProfileConfigClone createCellAdvancedProfileConfigClone() {
        return new CellAdvancedProfileConfigClone();
    }

    /**
     * Create an instance of {@link EnbCellAdvancedProfile }
     * 
     */
    public EnbCellAdvancedProfile createEnbCellAdvancedProfile() {
        return new EnbCellAdvancedProfile();
    }

    /**
     * Create an instance of {@link CallTraceProfileList }
     * 
     */
    public CallTraceProfileList createCallTraceProfileList() {
        return new CallTraceProfileList();
    }

    /**
     * Create an instance of {@link CallTraceProfileClone }
     * 
     */
    public CallTraceProfileClone createCallTraceProfileClone() {
        return new CallTraceProfileClone();
    }

    /**
     * Create an instance of {@link CallTraceProfile }
     * 
     */
    public CallTraceProfile createCallTraceProfile() {
        return new CallTraceProfile();
    }

    /**
     * Create an instance of {@link NetworkProfileClone }
     * 
     */
    public NetworkProfileClone createNetworkProfileClone() {
        return new NetworkProfileClone();
    }

    /**
     * Create an instance of {@link SyncProfileListResponse }
     * 
     */
    public SyncProfileListResponse createSyncProfileListResponse() {
        return new SyncProfileListResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileUpdateResponse }
     * 
     */
    public ManagementProfileUpdateResponse createManagementProfileUpdateResponse() {
        return new ManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link SonProfileDeleteResponse }
     * 
     */
    public SonProfileDeleteResponse createSonProfileDeleteResponse() {
        return new SonProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link Lte3RdPartyDeleteResponse }
     * 
     */
    public Lte3RdPartyDeleteResponse createLte3RdPartyDeleteResponse() {
        return new Lte3RdPartyDeleteResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResponse }
     * 
     */
    public Lte3RdPartyResponse createLte3RdPartyResponse() {
        return new Lte3RdPartyResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteAllResponse }
     * 
     */
    public LteNeighbourDeleteAllResponse createLteNeighbourDeleteAllResponse() {
        return new LteNeighbourDeleteAllResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourResponse }
     * 
     */
    public LteNeighbourResponse createLteNeighbourResponse() {
        return new LteNeighbourResponse();
    }

    /**
     * Create an instance of {@link RadioProfileCreate }
     * 
     */
    public RadioProfileCreate createRadioProfileCreate() {
        return new RadioProfileCreate();
    }

    /**
     * Create an instance of {@link EnbRadioProfile }
     * 
     */
    public EnbRadioProfile createEnbRadioProfile() {
        return new EnbRadioProfile();
    }

    /**
     * Create an instance of {@link EmbmsProfileListResponse }
     * 
     */
    public EmbmsProfileListResponse createEmbmsProfileListResponse() {
        return new EmbmsProfileListResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileCloneResponse }
     * 
     */
    public SecurityProfileCloneResponse createSecurityProfileCloneResponse() {
        return new SecurityProfileCloneResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileDelete }
     * 
     */
    public MobilityProfileDelete createMobilityProfileDelete() {
        return new MobilityProfileDelete();
    }

    /**
     * Create an instance of {@link CallTraceProfileDeleteResponse }
     * 
     */
    public CallTraceProfileDeleteResponse createCallTraceProfileDeleteResponse() {
        return new CallTraceProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link EnbConfigSetResponse }
     * 
     */
    public EnbConfigSetResponse createEnbConfigSetResponse() {
        return new EnbConfigSetResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourAdd }
     * 
     */
    public LteNeighbourAdd createLteNeighbourAdd() {
        return new LteNeighbourAdd();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigCloneResponse }
     * 
     */
    public EnbAdvancedProfileConfigCloneResponse createEnbAdvancedProfileConfigCloneResponse() {
        return new EnbAdvancedProfileConfigCloneResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileGetResponse }
     * 
     */
    public ManagementProfileGetResponse createManagementProfileGetResponse() {
        return new ManagementProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteManagementProfileGetResult }
     * 
     */
    public LteManagementProfileGetResult createLteManagementProfileGetResult() {
        return new LteManagementProfileGetResult();
    }

    /**
     * Create an instance of {@link RadioProfileListResponse }
     * 
     */
    public RadioProfileListResponse createRadioProfileListResponse() {
        return new RadioProfileListResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileClone }
     * 
     */
    public MobilityProfileClone createMobilityProfileClone() {
        return new MobilityProfileClone();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileList }
     * 
     */
    public TrafficManagementProfileList createTrafficManagementProfileList() {
        return new TrafficManagementProfileList();
    }

    /**
     * Create an instance of {@link UnityPnpConfigClone }
     * 
     */
    public UnityPnpConfigClone createUnityPnpConfigClone() {
        return new UnityPnpConfigClone();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCloneResponse }
     * 
     */
    public CellAdvancedProfileConfigCloneResponse createCellAdvancedProfileConfigCloneResponse() {
        return new CellAdvancedProfileConfigCloneResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileGetResponse }
     * 
     */
    public EmbmsProfileGetResponse createEmbmsProfileGetResponse() {
        return new EmbmsProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteEmbmsProfileGetResult }
     * 
     */
    public LteEmbmsProfileGetResult createLteEmbmsProfileGetResult() {
        return new LteEmbmsProfileGetResult();
    }

    /**
     * Create an instance of {@link SyncProfileCloneResponse }
     * 
     */
    public SyncProfileCloneResponse createSyncProfileCloneResponse() {
        return new SyncProfileCloneResponse();
    }

    /**
     * Create an instance of {@link CallTraceProfileUpdate }
     * 
     */
    public CallTraceProfileUpdate createCallTraceProfileUpdate() {
        return new CallTraceProfileUpdate();
    }

    /**
     * Create an instance of {@link SecurityProfileDeleteResponse }
     * 
     */
    public SecurityProfileDeleteResponse createSecurityProfileDeleteResponse() {
        return new SecurityProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileClone }
     * 
     */
    public ManagementProfileClone createManagementProfileClone() {
        return new ManagementProfileClone();
    }

    /**
     * Create an instance of {@link UtranProfileDeleteResponse }
     * 
     */
    public UtranProfileDeleteResponse createUtranProfileDeleteResponse() {
        return new UtranProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileListResponse }
     * 
     */
    public SecurityProfileListResponse createSecurityProfileListResponse() {
        return new SecurityProfileListResponse();
    }

    /**
     * Create an instance of {@link SyncProfileGet }
     * 
     */
    public SyncProfileGet createSyncProfileGet() {
        return new SyncProfileGet();
    }

    /**
     * Create an instance of {@link CallTraceProfileUpdateResponse }
     * 
     */
    public CallTraceProfileUpdateResponse createCallTraceProfileUpdateResponse() {
        return new CallTraceProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link CellOutageDetection }
     * 
     */
    public CellOutageDetection createCellOutageDetection() {
        return new CellOutageDetection();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileGet }
     * 
     */
    public TrafficManagementProfileGet createTrafficManagementProfileGet() {
        return new TrafficManagementProfileGet();
    }

    /**
     * Create an instance of {@link MobilityProfileDeleteResponse }
     * 
     */
    public MobilityProfileDeleteResponse createMobilityProfileDeleteResponse() {
        return new MobilityProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCreateResponse }
     * 
     */
    public CellAdvancedProfileConfigCreateResponse createCellAdvancedProfileConfigCreateResponse() {
        return new CellAdvancedProfileConfigCreateResponse();
    }

    /**
     * Create an instance of {@link CallTraceProfileGet }
     * 
     */
    public CallTraceProfileGet createCallTraceProfileGet() {
        return new CallTraceProfileGet();
    }

    /**
     * Create an instance of {@link PnpConfigDelete }
     * 
     */
    public PnpConfigDelete createPnpConfigDelete() {
        return new PnpConfigDelete();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigGet }
     * 
     */
    public EnbAdvancedProfileConfigGet createEnbAdvancedProfileConfigGet() {
        return new EnbAdvancedProfileConfigGet();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigGetResponse }
     * 
     */
    public EnbAdvancedProfileConfigGetResponse createEnbAdvancedProfileConfigGetResponse() {
        return new EnbAdvancedProfileConfigGetResponse();
    }

    /**
     * Create an instance of {@link LteAdvancedProfileGetResult }
     * 
     */
    public LteAdvancedProfileGetResult createLteAdvancedProfileGetResult() {
        return new LteAdvancedProfileGetResult();
    }

    /**
     * Create an instance of {@link SecurityProfileDelete }
     * 
     */
    public SecurityProfileDelete createSecurityProfileDelete() {
        return new SecurityProfileDelete();
    }

    /**
     * Create an instance of {@link SyncProfileUpdateResponse }
     * 
     */
    public SyncProfileUpdateResponse createSyncProfileUpdateResponse() {
        return new SyncProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link UtranProfileCreateResponse }
     * 
     */
    public UtranProfileCreateResponse createUtranProfileCreateResponse() {
        return new UtranProfileCreateResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourAddResponse }
     * 
     */
    public LteNeighbourAddResponse createLteNeighbourAddResponse() {
        return new LteNeighbourAddResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileCreate }
     * 
     */
    public MobilityProfileCreate createMobilityProfileCreate() {
        return new MobilityProfileCreate();
    }

    /**
     * Create an instance of {@link LteNeighbourList }
     * 
     */
    public LteNeighbourList createLteNeighbourList() {
        return new LteNeighbourList();
    }

    /**
     * Create an instance of {@link SecurityProfileGetResponse }
     * 
     */
    public SecurityProfileGetResponse createSecurityProfileGetResponse() {
        return new SecurityProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteSecurityProfileGetResult }
     * 
     */
    public LteSecurityProfileGetResult createLteSecurityProfileGetResult() {
        return new LteSecurityProfileGetResult();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteAll }
     * 
     */
    public LteNeighbourDeleteAll createLteNeighbourDeleteAll() {
        return new LteNeighbourDeleteAll();
    }

    /**
     * Create an instance of {@link CallTraceProfileCreateResponse }
     * 
     */
    public CallTraceProfileCreateResponse createCallTraceProfileCreateResponse() {
        return new CallTraceProfileCreateResponse();
    }

    /**
     * Create an instance of {@link UtranProfileClone }
     * 
     */
    public UtranProfileClone createUtranProfileClone() {
        return new UtranProfileClone();
    }

    /**
     * Create an instance of {@link ManagementProfileList }
     * 
     */
    public ManagementProfileList createManagementProfileList() {
        return new ManagementProfileList();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileUpdateResponse }
     * 
     */
    public TrafficManagementProfileUpdateResponse createTrafficManagementProfileUpdateResponse() {
        return new TrafficManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link RadioProfileClone }
     * 
     */
    public RadioProfileClone createRadioProfileClone() {
        return new RadioProfileClone();
    }

    /**
     * Create an instance of {@link EmbmsProfileGet }
     * 
     */
    public EmbmsProfileGet createEmbmsProfileGet() {
        return new EmbmsProfileGet();
    }

    /**
     * Create an instance of {@link RadioProfileDelete }
     * 
     */
    public RadioProfileDelete createRadioProfileDelete() {
        return new RadioProfileDelete();
    }

    /**
     * Create an instance of {@link SonProfileUpdate }
     * 
     */
    public SonProfileUpdate createSonProfileUpdate() {
        return new SonProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbSonProfile }
     * 
     */
    public EnbSonProfile createEnbSonProfile() {
        return new EnbSonProfile();
    }

    /**
     * Create an instance of {@link PnpConfigList }
     * 
     */
    public PnpConfigList createPnpConfigList() {
        return new PnpConfigList();
    }

    /**
     * Create an instance of {@link SyncProfileUpdate }
     * 
     */
    public SyncProfileUpdate createSyncProfileUpdate() {
        return new SyncProfileUpdate();
    }

    /**
     * Create an instance of {@link MobilityProfileGetResponse }
     * 
     */
    public MobilityProfileGetResponse createMobilityProfileGetResponse() {
        return new MobilityProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteMobilityProfileGetResult }
     * 
     */
    public LteMobilityProfileGetResult createLteMobilityProfileGetResult() {
        return new LteMobilityProfileGetResult();
    }

    /**
     * Create an instance of {@link NetworkProfileUpdateResponse }
     * 
     */
    public NetworkProfileUpdateResponse createNetworkProfileUpdateResponse() {
        return new NetworkProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileGetResponse }
     * 
     */
    public TrafficManagementProfileGetResponse createTrafficManagementProfileGetResponse() {
        return new TrafficManagementProfileGetResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileGetResult }
     * 
     */
    public TrafficManagementProfileGetResult createTrafficManagementProfileGetResult() {
        return new TrafficManagementProfileGetResult();
    }

    /**
     * Create an instance of {@link EmbmsProfileCreateResponse }
     * 
     */
    public EmbmsProfileCreateResponse createEmbmsProfileCreateResponse() {
        return new EmbmsProfileCreateResponse();
    }

    /**
     * Create an instance of {@link PnpConfigGetResponse }
     * 
     */
    public PnpConfigGetResponse createPnpConfigGetResponse() {
        return new PnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link LtePnpConfigGetResult }
     * 
     */
    public LtePnpConfigGetResult createLtePnpConfigGetResult() {
        return new LtePnpConfigGetResult();
    }

    /**
     * Create an instance of {@link SonProfileCreateResponse }
     * 
     */
    public SonProfileCreateResponse createSonProfileCreateResponse() {
        return new SonProfileCreateResponse();
    }

    /**
     * Create an instance of {@link SonProfileClone }
     * 
     */
    public SonProfileClone createSonProfileClone() {
        return new SonProfileClone();
    }

    /**
     * Create an instance of {@link EnbStateGet }
     * 
     */
    public EnbStateGet createEnbStateGet() {
        return new EnbStateGet();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigUpdate }
     * 
     */
    public EnbAdvancedProfileConfigUpdate createEnbAdvancedProfileConfigUpdate() {
        return new EnbAdvancedProfileConfigUpdate();
    }

    /**
     * Create an instance of {@link SonProfileUpdateResponse }
     * 
     */
    public SonProfileUpdateResponse createSonProfileUpdateResponse() {
        return new SonProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileCreateResponse }
     * 
     */
    public NetworkProfileCreateResponse createNetworkProfileCreateResponse() {
        return new NetworkProfileCreateResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCloneResponse }
     * 
     */
    public Lte3RdPartyCloneResponse createLte3RdPartyCloneResponse() {
        return new Lte3RdPartyCloneResponse();
    }

    /**
     * Create an instance of {@link SonProfileList }
     * 
     */
    public SonProfileList createSonProfileList() {
        return new SonProfileList();
    }

    /**
     * Create an instance of {@link UtranProfileUpdate }
     * 
     */
    public UtranProfileUpdate createUtranProfileUpdate() {
        return new UtranProfileUpdate();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteAnr }
     * 
     */
    public LteNeighbourDeleteAnr createLteNeighbourDeleteAnr() {
        return new LteNeighbourDeleteAnr();
    }

    /**
     * Create an instance of {@link LteAnrNeighbour }
     * 
     */
    public LteAnrNeighbour createLteAnrNeighbour() {
        return new LteAnrNeighbour();
    }

    /**
     * Create an instance of {@link Lte3RdPartyDelete }
     * 
     */
    public Lte3RdPartyDelete createLte3RdPartyDelete() {
        return new Lte3RdPartyDelete();
    }

    /**
     * Create an instance of {@link UnityPnpConfigUpdate }
     * 
     */
    public UnityPnpConfigUpdate createUnityPnpConfigUpdate() {
        return new UnityPnpConfigUpdate();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigDelete }
     * 
     */
    public CellAdvancedProfileConfigDelete createCellAdvancedProfileConfigDelete() {
        return new CellAdvancedProfileConfigDelete();
    }

    /**
     * Create an instance of {@link MobilityProfileList }
     * 
     */
    public MobilityProfileList createMobilityProfileList() {
        return new MobilityProfileList();
    }

    /**
     * Create an instance of {@link PnpConfigCloneResponse }
     * 
     */
    public PnpConfigCloneResponse createPnpConfigCloneResponse() {
        return new PnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileDelete }
     * 
     */
    public NetworkProfileDelete createNetworkProfileDelete() {
        return new NetworkProfileDelete();
    }

    /**
     * Create an instance of {@link SecurityProfileUpdate }
     * 
     */
    public SecurityProfileUpdate createSecurityProfileUpdate() {
        return new SecurityProfileUpdate();
    }

    /**
     * Create an instance of {@link RadioProfileCreateResponse }
     * 
     */
    public RadioProfileCreateResponse createRadioProfileCreateResponse() {
        return new RadioProfileCreateResponse();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigClone }
     * 
     */
    public EnbAdvancedProfileConfigClone createEnbAdvancedProfileConfigClone() {
        return new EnbAdvancedProfileConfigClone();
    }

    /**
     * Create an instance of {@link UnityPnpConfigUpdateResponse }
     * 
     */
    public UnityPnpConfigUpdateResponse createUnityPnpConfigUpdateResponse() {
        return new UnityPnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link EnbConfigGet }
     * 
     */
    public EnbConfigGet createEnbConfigGet() {
        return new EnbConfigGet();
    }

    /**
     * Create an instance of {@link EmbmsProfileUpdateResponse }
     * 
     */
    public EmbmsProfileUpdateResponse createEmbmsProfileUpdateResponse() {
        return new EmbmsProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigUpdateResponse }
     * 
     */
    public CellAdvancedProfileConfigUpdateResponse createCellAdvancedProfileConfigUpdateResponse() {
        return new CellAdvancedProfileConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link EnbAdvancedConfigProfileListResponse }
     * 
     */
    public EnbAdvancedConfigProfileListResponse createEnbAdvancedConfigProfileListResponse() {
        return new EnbAdvancedConfigProfileListResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileList }
     * 
     */
    public SecurityProfileList createSecurityProfileList() {
        return new SecurityProfileList();
    }

    /**
     * Create an instance of {@link RadioProfileUpdateResponse }
     * 
     */
    public RadioProfileUpdateResponse createRadioProfileUpdateResponse() {
        return new RadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileCreateResponse }
     * 
     */
    public TrafficManagementProfileCreateResponse createTrafficManagementProfileCreateResponse() {
        return new TrafficManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileClone }
     * 
     */
    public EmbmsProfileClone createEmbmsProfileClone() {
        return new EmbmsProfileClone();
    }

    /**
     * Create an instance of {@link EnbEmbmsProfile }
     * 
     */
    public EnbEmbmsProfile createEnbEmbmsProfile() {
        return new EnbEmbmsProfile();
    }

    /**
     * Create an instance of {@link PnpConfigUpdateResponse }
     * 
     */
    public PnpConfigUpdateResponse createPnpConfigUpdateResponse() {
        return new PnpConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link RadioProfileGetResponse }
     * 
     */
    public RadioProfileGetResponse createRadioProfileGetResponse() {
        return new RadioProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteRadioProfileGetResult }
     * 
     */
    public LteRadioProfileGetResult createLteRadioProfileGetResult() {
        return new LteRadioProfileGetResult();
    }

    /**
     * Create an instance of {@link SonProfileGetResponse }
     * 
     */
    public SonProfileGetResponse createSonProfileGetResponse() {
        return new SonProfileGetResponse();
    }

    /**
     * Create an instance of {@link LteSonProfileGetResult }
     * 
     */
    public LteSonProfileGetResult createLteSonProfileGetResult() {
        return new LteSonProfileGetResult();
    }

    /**
     * Create an instance of {@link UtranProfileList }
     * 
     */
    public UtranProfileList createUtranProfileList() {
        return new UtranProfileList();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileUpdate }
     * 
     */
    public TrafficManagementProfileUpdate createTrafficManagementProfileUpdate() {
        return new TrafficManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link TrafficManagementProfile }
     * 
     */
    public TrafficManagementProfile createTrafficManagementProfile() {
        return new TrafficManagementProfile();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigUpdateResponse }
     * 
     */
    public EnbAdvancedProfileConfigUpdateResponse createEnbAdvancedProfileConfigUpdateResponse() {
        return new EnbAdvancedProfileConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link SonProfileCreate }
     * 
     */
    public SonProfileCreate createSonProfileCreate() {
        return new SonProfileCreate();
    }

    /**
     * Create an instance of {@link CellAdvancedConfigProfileList }
     * 
     */
    public CellAdvancedConfigProfileList createCellAdvancedConfigProfileList() {
        return new CellAdvancedConfigProfileList();
    }

    /**
     * Create an instance of {@link SecurityProfileGet }
     * 
     */
    public SecurityProfileGet createSecurityProfileGet() {
        return new SecurityProfileGet();
    }

    /**
     * Create an instance of {@link Lte3RdPartyClone }
     * 
     */
    public Lte3RdPartyClone createLte3RdPartyClone() {
        return new Lte3RdPartyClone();
    }

    /**
     * Create an instance of {@link PnpConfigCreate }
     * 
     */
    public PnpConfigCreate createPnpConfigCreate() {
        return new PnpConfigCreate();
    }

    /**
     * Create an instance of {@link PnpDetailWs }
     * 
     */
    public PnpDetailWs createPnpDetailWs() {
        return new PnpDetailWs();
    }

    /**
     * Create an instance of {@link LteEnbDetailsSetWsPnp }
     * 
     */
    public LteEnbDetailsSetWsPnp createLteEnbDetailsSetWsPnp() {
        return new LteEnbDetailsSetWsPnp();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigUpdate }
     * 
     */
    public CellAdvancedProfileConfigUpdate createCellAdvancedProfileConfigUpdate() {
        return new CellAdvancedProfileConfigUpdate();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileClone }
     * 
     */
    public TrafficManagementProfileClone createTrafficManagementProfileClone() {
        return new TrafficManagementProfileClone();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileCloneResponse }
     * 
     */
    public TrafficManagementProfileCloneResponse createTrafficManagementProfileCloneResponse() {
        return new TrafficManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link EnbConfigGetResponse }
     * 
     */
    public EnbConfigGetResponse createEnbConfigGetResponse() {
        return new EnbConfigGetResponse();
    }

    /**
     * Create an instance of {@link LteEnbConfigGetResult }
     * 
     */
    public LteEnbConfigGetResult createLteEnbConfigGetResult() {
        return new LteEnbConfigGetResult();
    }

    /**
     * Create an instance of {@link SecurityProfileCreateResponse }
     * 
     */
    public SecurityProfileCreateResponse createSecurityProfileCreateResponse() {
        return new SecurityProfileCreateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileCreateResponse }
     * 
     */
    public SyncProfileCreateResponse createSyncProfileCreateResponse() {
        return new SyncProfileCreateResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileCloneResponse }
     * 
     */
    public EmbmsProfileCloneResponse createEmbmsProfileCloneResponse() {
        return new EmbmsProfileCloneResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedConfigProfileListResponse }
     * 
     */
    public CellAdvancedConfigProfileListResponse createCellAdvancedConfigProfileListResponse() {
        return new CellAdvancedConfigProfileListResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCreateResponse }
     * 
     */
    public Lte3RdPartyCreateResponse createLte3RdPartyCreateResponse() {
        return new Lte3RdPartyCreateResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyGet }
     * 
     */
    public Lte3RdPartyGet createLte3RdPartyGet() {
        return new Lte3RdPartyGet();
    }

    /**
     * Create an instance of {@link LteNeighbourListResponse }
     * 
     */
    public LteNeighbourListResponse createLteNeighbourListResponse() {
        return new LteNeighbourListResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourListResult }
     * 
     */
    public LteNeighbourListResult createLteNeighbourListResult() {
        return new LteNeighbourListResult();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigGetResponse }
     * 
     */
    public CellAdvancedProfileConfigGetResponse createCellAdvancedProfileConfigGetResponse() {
        return new CellAdvancedProfileConfigGetResponse();
    }

    /**
     * Create an instance of {@link LteCellAdvancedProfileGetResult }
     * 
     */
    public LteCellAdvancedProfileGetResult createLteCellAdvancedProfileGetResult() {
        return new LteCellAdvancedProfileGetResult();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteResponse }
     * 
     */
    public LteNeighbourDeleteResponse createLteNeighbourDeleteResponse() {
        return new LteNeighbourDeleteResponse();
    }

    /**
     * Create an instance of {@link UnityPnpConfigGet }
     * 
     */
    public UnityPnpConfigGet createUnityPnpConfigGet() {
        return new UnityPnpConfigGet();
    }

    /**
     * Create an instance of {@link ManagementProfileDelete }
     * 
     */
    public ManagementProfileDelete createManagementProfileDelete() {
        return new ManagementProfileDelete();
    }

    /**
     * Create an instance of {@link UtranProfileGetResponse }
     * 
     */
    public UtranProfileGetResponse createUtranProfileGetResponse() {
        return new UtranProfileGetResponse();
    }

    /**
     * Create an instance of {@link UtranProfileGetResult }
     * 
     */
    public UtranProfileGetResult createUtranProfileGetResult() {
        return new UtranProfileGetResult();
    }

    /**
     * Create an instance of {@link SonProfileDelete }
     * 
     */
    public SonProfileDelete createSonProfileDelete() {
        return new SonProfileDelete();
    }

    /**
     * Create an instance of {@link SyncProfileDelete }
     * 
     */
    public SyncProfileDelete createSyncProfileDelete() {
        return new SyncProfileDelete();
    }

    /**
     * Create an instance of {@link Lte3RdPartyList }
     * 
     */
    public Lte3RdPartyList createLte3RdPartyList() {
        return new Lte3RdPartyList();
    }

    /**
     * Create an instance of {@link PnpConfigListResponse }
     * 
     */
    public PnpConfigListResponse createPnpConfigListResponse() {
        return new PnpConfigListResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileCreate }
     * 
     */
    public EmbmsProfileCreate createEmbmsProfileCreate() {
        return new EmbmsProfileCreate();
    }

    /**
     * Create an instance of {@link EnbWiFiActionSet }
     * 
     */
    public EnbWiFiActionSet createEnbWiFiActionSet() {
        return new EnbWiFiActionSet();
    }

    /**
     * Create an instance of {@link ManagementProfileCloneResponse }
     * 
     */
    public ManagementProfileCloneResponse createManagementProfileCloneResponse() {
        return new ManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteAnrResponse }
     * 
     */
    public LteNeighbourDeleteAnrResponse createLteNeighbourDeleteAnrResponse() {
        return new LteNeighbourDeleteAnrResponse();
    }

    /**
     * Create an instance of {@link LteAnrNeighbourResponse }
     * 
     */
    public LteAnrNeighbourResponse createLteAnrNeighbourResponse() {
        return new LteAnrNeighbourResponse();
    }

    /**
     * Create an instance of {@link EnbFromEcgiGetResponse }
     * 
     */
    public EnbFromEcgiGetResponse createEnbFromEcgiGetResponse() {
        return new EnbFromEcgiGetResponse();
    }

    /**
     * Create an instance of {@link NodeEnodebIdResult }
     * 
     */
    public NodeEnodebIdResult createNodeEnodebIdResult() {
        return new NodeEnodebIdResult();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigDelete }
     * 
     */
    public EnbAdvancedProfileConfigDelete createEnbAdvancedProfileConfigDelete() {
        return new EnbAdvancedProfileConfigDelete();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCreate }
     * 
     */
    public CellAdvancedProfileConfigCreate createCellAdvancedProfileConfigCreate() {
        return new CellAdvancedProfileConfigCreate();
    }

    /**
     * Create an instance of {@link CellOutageDetectionResponse }
     * 
     */
    public CellOutageDetectionResponse createCellOutageDetectionResponse() {
        return new CellOutageDetectionResponse();
    }

    /**
     * Create an instance of {@link NodeAlarmResult }
     * 
     */
    public NodeAlarmResult createNodeAlarmResult() {
        return new NodeAlarmResult();
    }

    /**
     * Create an instance of {@link Lte3RdPartyUpdateResponse }
     * 
     */
    public Lte3RdPartyUpdateResponse createLte3RdPartyUpdateResponse() {
        return new Lte3RdPartyUpdateResponse();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigCreateResponse }
     * 
     */
    public EnbAdvancedProfileConfigCreateResponse createEnbAdvancedProfileConfigCreateResponse() {
        return new EnbAdvancedProfileConfigCreateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileClone }
     * 
     */
    public SyncProfileClone createSyncProfileClone() {
        return new SyncProfileClone();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileCreate }
     * 
     */
    public TrafficManagementProfileCreate createTrafficManagementProfileCreate() {
        return new TrafficManagementProfileCreate();
    }

    /**
     * Create an instance of {@link PnpConfigGet }
     * 
     */
    public PnpConfigGet createPnpConfigGet() {
        return new PnpConfigGet();
    }

    /**
     * Create an instance of {@link SyncProfileDeleteResponse }
     * 
     */
    public SyncProfileDeleteResponse createSyncProfileDeleteResponse() {
        return new SyncProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link CallTraceProfileCloneResponse }
     * 
     */
    public CallTraceProfileCloneResponse createCallTraceProfileCloneResponse() {
        return new CallTraceProfileCloneResponse();
    }

    /**
     * Create an instance of {@link SonProfileCloneResponse }
     * 
     */
    public SonProfileCloneResponse createSonProfileCloneResponse() {
        return new SonProfileCloneResponse();
    }

    /**
     * Create an instance of {@link UtranProfileCloneResponse }
     * 
     */
    public UtranProfileCloneResponse createUtranProfileCloneResponse() {
        return new UtranProfileCloneResponse();
    }

    /**
     * Create an instance of {@link RadioProfileGet }
     * 
     */
    public RadioProfileGet createRadioProfileGet() {
        return new RadioProfileGet();
    }

    /**
     * Create an instance of {@link NetworkProfileList }
     * 
     */
    public NetworkProfileList createNetworkProfileList() {
        return new NetworkProfileList();
    }

    /**
     * Create an instance of {@link CallTraceProfileCreate }
     * 
     */
    public CallTraceProfileCreate createCallTraceProfileCreate() {
        return new CallTraceProfileCreate();
    }

    /**
     * Create an instance of {@link RadioProfileUpdate }
     * 
     */
    public RadioProfileUpdate createRadioProfileUpdate() {
        return new RadioProfileUpdate();
    }

    /**
     * Create an instance of {@link MobilityProfileCloneResponse }
     * 
     */
    public MobilityProfileCloneResponse createMobilityProfileCloneResponse() {
        return new MobilityProfileCloneResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourAddByCellNumberResponse }
     * 
     */
    public LteNeighbourAddByCellNumberResponse createLteNeighbourAddByCellNumberResponse() {
        return new LteNeighbourAddByCellNumberResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileUpdate }
     * 
     */
    public EmbmsProfileUpdate createEmbmsProfileUpdate() {
        return new EmbmsProfileUpdate();
    }

    /**
     * Create an instance of {@link LteNeighbourSetResponse }
     * 
     */
    public LteNeighbourSetResponse createLteNeighbourSetResponse() {
        return new LteNeighbourSetResponse();
    }

    /**
     * Create an instance of {@link LteNbrConfigResponse }
     * 
     */
    public LteNbrConfigResponse createLteNbrConfigResponse() {
        return new LteNbrConfigResponse();
    }

    /**
     * Create an instance of {@link EnbStateSetResponse }
     * 
     */
    public EnbStateSetResponse createEnbStateSetResponse() {
        return new EnbStateSetResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileDeleteResponse }
     * 
     */
    public ManagementProfileDeleteResponse createManagementProfileDeleteResponse() {
        return new ManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link EnbWiFiActionSetResponse }
     * 
     */
    public EnbWiFiActionSetResponse createEnbWiFiActionSetResponse() {
        return new EnbWiFiActionSetResponse();
    }

    /**
     * Create an instance of {@link EnbConfigSet }
     * 
     */
    public EnbConfigSet createEnbConfigSet() {
        return new EnbConfigSet();
    }

    /**
     * Create an instance of {@link LteEnbDetailsSetWs }
     * 
     */
    public LteEnbDetailsSetWs createLteEnbDetailsSetWs() {
        return new LteEnbDetailsSetWs();
    }

    /**
     * Create an instance of {@link ManagementProfileCreateResponse }
     * 
     */
    public ManagementProfileCreateResponse createManagementProfileCreateResponse() {
        return new ManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link PnpConfigUpdate }
     * 
     */
    public PnpConfigUpdate createPnpConfigUpdate() {
        return new PnpConfigUpdate();
    }

    /**
     * Create an instance of {@link SecurityProfileUpdateResponse }
     * 
     */
    public SecurityProfileUpdateResponse createSecurityProfileUpdateResponse() {
        return new SecurityProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileListResponse }
     * 
     */
    public MobilityProfileListResponse createMobilityProfileListResponse() {
        return new MobilityProfileListResponse();
    }

    /**
     * Create an instance of {@link SyncProfileList }
     * 
     */
    public SyncProfileList createSyncProfileList() {
        return new SyncProfileList();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileDelete }
     * 
     */
    public TrafficManagementProfileDelete createTrafficManagementProfileDelete() {
        return new TrafficManagementProfileDelete();
    }

    /**
     * Create an instance of {@link PnpConfigCreateResponse }
     * 
     */
    public PnpConfigCreateResponse createPnpConfigCreateResponse() {
        return new PnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link UnityPnpConfigGetResponse }
     * 
     */
    public UnityPnpConfigGetResponse createUnityPnpConfigGetResponse() {
        return new UnityPnpConfigGetResponse();
    }

    /**
     * Create an instance of {@link UnityPnpConfigGetResult }
     * 
     */
    public UnityPnpConfigGetResult createUnityPnpConfigGetResult() {
        return new UnityPnpConfigGetResult();
    }

    /**
     * Create an instance of {@link RadioProfileDeleteResponse }
     * 
     */
    public RadioProfileDeleteResponse createRadioProfileDeleteResponse() {
        return new RadioProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link SonProfileListResponse }
     * 
     */
    public SonProfileListResponse createSonProfileListResponse() {
        return new SonProfileListResponse();
    }

    /**
     * Create an instance of {@link CallTraceProfileDelete }
     * 
     */
    public CallTraceProfileDelete createCallTraceProfileDelete() {
        return new CallTraceProfileDelete();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigDeleteResponse }
     * 
     */
    public EnbAdvancedProfileConfigDeleteResponse createEnbAdvancedProfileConfigDeleteResponse() {
        return new EnbAdvancedProfileConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link UnityPnpConfigDelete }
     * 
     */
    public UnityPnpConfigDelete createUnityPnpConfigDelete() {
        return new UnityPnpConfigDelete();
    }

    /**
     * Create an instance of {@link UnityPnpConfigCreateResponse }
     * 
     */
    public UnityPnpConfigCreateResponse createUnityPnpConfigCreateResponse() {
        return new UnityPnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link EnbStateGetResponse }
     * 
     */
    public EnbStateGetResponse createEnbStateGetResponse() {
        return new EnbStateGetResponse();
    }

    /**
     * Create an instance of {@link EnbStateGetResult }
     * 
     */
    public EnbStateGetResult createEnbStateGetResult() {
        return new EnbStateGetResult();
    }

    /**
     * Create an instance of {@link ManagementProfileCreate }
     * 
     */
    public ManagementProfileCreate createManagementProfileCreate() {
        return new ManagementProfileCreate();
    }

    /**
     * Create an instance of {@link PnpConfigClone }
     * 
     */
    public PnpConfigClone createPnpConfigClone() {
        return new PnpConfigClone();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCreate }
     * 
     */
    public Lte3RdPartyCreate createLte3RdPartyCreate() {
        return new Lte3RdPartyCreate();
    }

    /**
     * Create an instance of {@link NetworkProfileGet }
     * 
     */
    public NetworkProfileGet createNetworkProfileGet() {
        return new NetworkProfileGet();
    }

    /**
     * Create an instance of {@link UnityPnpConfigCloneResponse }
     * 
     */
    public UnityPnpConfigCloneResponse createUnityPnpConfigCloneResponse() {
        return new UnityPnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourDelete }
     * 
     */
    public LteNeighbourDelete createLteNeighbourDelete() {
        return new LteNeighbourDelete();
    }

    /**
     * Create an instance of {@link SecurityProfileClone }
     * 
     */
    public SecurityProfileClone createSecurityProfileClone() {
        return new SecurityProfileClone();
    }

    /**
     * Create an instance of {@link NetworkProfileCreate }
     * 
     */
    public NetworkProfileCreate createNetworkProfileCreate() {
        return new NetworkProfileCreate();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeInterFreq }
     * 
     */
    public MobilityConnectedModeInterFreq createMobilityConnectedModeInterFreq() {
        return new MobilityConnectedModeInterFreq();
    }

    /**
     * Create an instance of {@link NodeEcgiResult }
     * 
     */
    public NodeEcgiResult createNodeEcgiResult() {
        return new NodeEcgiResult();
    }

    /**
     * Create an instance of {@link MacWs }
     * 
     */
    public MacWs createMacWs() {
        return new MacWs();
    }

    /**
     * Create an instance of {@link IpRouteListContainer }
     * 
     */
    public IpRouteListContainer createIpRouteListContainer() {
        return new IpRouteListContainer();
    }

    /**
     * Create an instance of {@link CallTraceEnbWs }
     * 
     */
    public CallTraceEnbWs createCallTraceEnbWs() {
        return new CallTraceEnbWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeTriggerGaps }
     * 
     */
    public MobilityConnectedModeTriggerGaps createMobilityConnectedModeTriggerGaps() {
        return new MobilityConnectedModeTriggerGaps();
    }

    /**
     * Create an instance of {@link LteCellAdvancedProfileResult }
     * 
     */
    public LteCellAdvancedProfileResult createLteCellAdvancedProfileResult() {
        return new LteCellAdvancedProfileResult();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link LteCellSetWs }
     * 
     */
    public LteCellSetWs createLteCellSetWs() {
        return new LteCellSetWs();
    }

    /**
     * Create an instance of {@link MobilityInterRatUtranReselection }
     * 
     */
    public MobilityInterRatUtranReselection createMobilityInterRatUtranReselection() {
        return new MobilityInterRatUtranReselection();
    }

    /**
     * Create an instance of {@link MaxRetxThresholdWs }
     * 
     */
    public MaxRetxThresholdWs createMaxRetxThresholdWs() {
        return new MaxRetxThresholdWs();
    }

    /**
     * Create an instance of {@link RandomAccessWs }
     * 
     */
    public RandomAccessWs createRandomAccessWs() {
        return new RandomAccessWs();
    }

    /**
     * Create an instance of {@link LteNeighbourResult }
     * 
     */
    public LteNeighbourResult createLteNeighbourResult() {
        return new LteNeighbourResult();
    }

    /**
     * Create an instance of {@link RelayChannelQualityEnbWs }
     * 
     */
    public RelayChannelQualityEnbWs createRelayChannelQualityEnbWs() {
        return new RelayChannelQualityEnbWs();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileResult }
     * 
     */
    public TrafficManagementProfileResult createTrafficManagementProfileResult() {
        return new TrafficManagementProfileResult();
    }

    /**
     * Create an instance of {@link CsfbCdma2KCellParams }
     * 
     */
    public CsfbCdma2KCellParams createCsfbCdma2KCellParams() {
        return new CsfbCdma2KCellParams();
    }

    /**
     * Create an instance of {@link WSEmbmsSib15FreqEntry }
     * 
     */
    public WSEmbmsSib15FreqEntry createWSEmbmsSib15FreqEntry() {
        return new WSEmbmsSib15FreqEntry();
    }

    /**
     * Create an instance of {@link MobilityConnectedGeneralWs }
     * 
     */
    public MobilityConnectedGeneralWs createMobilityConnectedGeneralWs() {
        return new MobilityConnectedGeneralWs();
    }

    /**
     * Create an instance of {@link EmergencyCallQciWs }
     * 
     */
    public EmergencyCallQciWs createEmergencyCallQciWs() {
        return new EmergencyCallQciWs();
    }

    /**
     * Create an instance of {@link EnbMobilityProfileParams }
     * 
     */
    public EnbMobilityProfileParams createEnbMobilityProfileParams() {
        return new EnbMobilityProfileParams();
    }

    /**
     * Create an instance of {@link NetworkingWs }
     * 
     */
    public NetworkingWs createNetworkingWs() {
        return new NetworkingWs();
    }

    /**
     * Create an instance of {@link CsfbCdma2KSib8Params }
     * 
     */
    public CsfbCdma2KSib8Params createCsfbCdma2KSib8Params() {
        return new CsfbCdma2KSib8Params();
    }

    /**
     * Create an instance of {@link LteS1EntryWs }
     * 
     */
    public LteS1EntryWs createLteS1EntryWs() {
        return new LteS1EntryWs();
    }

    /**
     * Create an instance of {@link LteEmbmsProfileResult }
     * 
     */
    public LteEmbmsProfileResult createLteEmbmsProfileResult() {
        return new LteEmbmsProfileResult();
    }

    /**
     * Create an instance of {@link LteSonCSonWs }
     * 
     */
    public LteSonCSonWs createLteSonCSonWs() {
        return new LteSonCSonWs();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link LteManagementProfileResult }
     * 
     */
    public LteManagementProfileResult createLteManagementProfileResult() {
        return new LteManagementProfileResult();
    }

    /**
     * Create an instance of {@link LteAdvancedProfileResult }
     * 
     */
    public LteAdvancedProfileResult createLteAdvancedProfileResult() {
        return new LteAdvancedProfileResult();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResultWs }
     * 
     */
    public Lte3RdPartyResultWs createLte3RdPartyResultWs() {
        return new Lte3RdPartyResultWs();
    }

    /**
     * Create an instance of {@link TstatusProhibitWs }
     * 
     */
    public TstatusProhibitWs createTstatusProhibitWs() {
        return new TstatusProhibitWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeFreqListContainer }
     * 
     */
    public MobilityConnectedModeFreqListContainer createMobilityConnectedModeFreqListContainer() {
        return new MobilityConnectedModeFreqListContainer();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterBand }
     * 
     */
    public MobilityIdleModeInterBand createMobilityIdleModeInterBand() {
        return new MobilityIdleModeInterBand();
    }

    /**
     * Create an instance of {@link VolteConfigurationWs }
     * 
     */
    public VolteConfigurationWs createVolteConfigurationWs() {
        return new VolteConfigurationWs();
    }

    /**
     * Create an instance of {@link LteEnbConfigResult }
     * 
     */
    public LteEnbConfigResult createLteEnbConfigResult() {
        return new LteEnbConfigResult();
    }

    /**
     * Create an instance of {@link LteAddNeighbourForCellWs }
     * 
     */
    public LteAddNeighbourForCellWs createLteAddNeighbourForCellWs() {
        return new LteAddNeighbourForCellWs();
    }

    /**
     * Create an instance of {@link WSEmbmsId }
     * 
     */
    public WSEmbmsId createWSEmbmsId() {
        return new WSEmbmsId();
    }

    /**
     * Create an instance of {@link MobilityInterRatGeranReselection }
     * 
     */
    public MobilityInterRatGeranReselection createMobilityInterRatGeranReselection() {
        return new MobilityInterRatGeranReselection();
    }

    /**
     * Create an instance of {@link MobilityIdleModeIntraFreq }
     * 
     */
    public MobilityIdleModeIntraFreq createMobilityIdleModeIntraFreq() {
        return new MobilityIdleModeIntraFreq();
    }

    /**
     * Create an instance of {@link EtwsWs }
     * 
     */
    public EtwsWs createEtwsWs() {
        return new EtwsWs();
    }

    /**
     * Create an instance of {@link CellPuschWs }
     * 
     */
    public CellPuschWs createCellPuschWs() {
        return new CellPuschWs();
    }

    /**
     * Create an instance of {@link Sib15FrequencyListContainer }
     * 
     */
    public Sib15FrequencyListContainer createSib15FrequencyListContainer() {
        return new Sib15FrequencyListContainer();
    }

    /**
     * Create an instance of {@link UlPktDataPriorityListContainer }
     * 
     */
    public UlPktDataPriorityListContainer createUlPktDataPriorityListContainer() {
        return new UlPktDataPriorityListContainer();
    }

    /**
     * Create an instance of {@link MobilityIdleIntraFreqWs }
     * 
     */
    public MobilityIdleIntraFreqWs createMobilityIdleIntraFreqWs() {
        return new MobilityIdleIntraFreqWs();
    }

    /**
     * Create an instance of {@link RecurrenceWeekly }
     * 
     */
    public RecurrenceWeekly createRecurrenceWeekly() {
        return new RecurrenceWeekly();
    }

    /**
     * Create an instance of {@link LtePlmnEntryWs }
     * 
     */
    public LtePlmnEntryWs createLtePlmnEntryWs() {
        return new LtePlmnEntryWs();
    }

    /**
     * Create an instance of {@link SynchronizationWs }
     * 
     */
    public SynchronizationWs createSynchronizationWs() {
        return new SynchronizationWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedWs }
     * 
     */
    public MobilityConnectedWs createMobilityConnectedWs() {
        return new MobilityConnectedWs();
    }

    /**
     * Create an instance of {@link UnityPnpConfig }
     * 
     */
    public UnityPnpConfig createUnityPnpConfig() {
        return new UnityPnpConfig();
    }

    /**
     * Create an instance of {@link RsiRange }
     * 
     */
    public RsiRange createRsiRange() {
        return new RsiRange();
    }

    /**
     * Create an instance of {@link CellEmbmsWs }
     * 
     */
    public CellEmbmsWs createCellEmbmsWs() {
        return new CellEmbmsWs();
    }

    /**
     * Create an instance of {@link RadioBearersWs }
     * 
     */
    public RadioBearersWs createRadioBearersWs() {
        return new RadioBearersWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterEarfcn }
     * 
     */
    public MobilityIdleModeInterEarfcn createMobilityIdleModeInterEarfcn() {
        return new MobilityIdleModeInterEarfcn();
    }

    /**
     * Create an instance of {@link AuPnpSwSchedule }
     * 
     */
    public AuPnpSwSchedule createAuPnpSwSchedule() {
        return new AuPnpSwSchedule();
    }

    /**
     * Create an instance of {@link S1ListContainer }
     * 
     */
    public S1ListContainer createS1ListContainer() {
        return new S1ListContainer();
    }

    /**
     * Create an instance of {@link LteMobilityProfileResult }
     * 
     */
    public LteMobilityProfileResult createLteMobilityProfileResult() {
        return new LteMobilityProfileResult();
    }

    /**
     * Create an instance of {@link LteAnrNeighbourResult }
     * 
     */
    public LteAnrNeighbourResult createLteAnrNeighbourResult() {
        return new LteAnrNeighbourResult();
    }

    /**
     * Create an instance of {@link TpollRetransmitWs }
     * 
     */
    public TpollRetransmitWs createTpollRetransmitWs() {
        return new TpollRetransmitWs();
    }

    /**
     * Create an instance of {@link LteRadioProfileResult }
     * 
     */
    public LteRadioProfileResult createLteRadioProfileResult() {
        return new LteRadioProfileResult();
    }

    /**
     * Create an instance of {@link MobilityUtranReselectionPriorityListContainer }
     * 
     */
    public MobilityUtranReselectionPriorityListContainer createMobilityUtranReselectionPriorityListContainer() {
        return new MobilityUtranReselectionPriorityListContainer();
    }

    /**
     * Create an instance of {@link TrafficManagementWs }
     * 
     */
    public TrafficManagementWs createTrafficManagementWs() {
        return new TrafficManagementWs();
    }

    /**
     * Create an instance of {@link MobilityInterRatUtranCoverageRedirection }
     * 
     */
    public MobilityInterRatUtranCoverageRedirection createMobilityInterRatUtranCoverageRedirection() {
        return new MobilityInterRatUtranCoverageRedirection();
    }

    /**
     * Create an instance of {@link LteUlPktDataPriorityEntryWs }
     * 
     */
    public LteUlPktDataPriorityEntryWs createLteUlPktDataPriorityEntryWs() {
        return new LteUlPktDataPriorityEntryWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeBand }
     * 
     */
    public MobilityConnectedModeBand createMobilityConnectedModeBand() {
        return new MobilityConnectedModeBand();
    }

    /**
     * Create an instance of {@link PdclList }
     * 
     */
    public PdclList createPdclList() {
        return new PdclList();
    }

    /**
     * Create an instance of {@link AirSonWs }
     * 
     */
    public AirSonWs createAirSonWs() {
        return new AirSonWs();
    }

    /**
     * Create an instance of {@link MonthlyOption2 }
     * 
     */
    public MonthlyOption2 createMonthlyOption2() {
        return new MonthlyOption2();
    }

    /**
     * Create an instance of {@link QosMobilityConnectedModeFreqEarfcnListContainer }
     * 
     */
    public QosMobilityConnectedModeFreqEarfcnListContainer createQosMobilityConnectedModeFreqEarfcnListContainer() {
        return new QosMobilityConnectedModeFreqEarfcnListContainer();
    }

    /**
     * Create an instance of {@link MonthlyOption1 }
     * 
     */
    public MonthlyOption1 createMonthlyOption1() {
        return new MonthlyOption1();
    }

    /**
     * Create an instance of {@link LteNbrConfigResult }
     * 
     */
    public LteNbrConfigResult createLteNbrConfigResult() {
        return new LteNbrConfigResult();
    }

    /**
     * Create an instance of {@link LteSyncProfileResult }
     * 
     */
    public LteSyncProfileResult createLteSyncProfileResult() {
        return new LteSyncProfileResult();
    }

    /**
     * Create an instance of {@link PollByteWs }
     * 
     */
    public PollByteWs createPollByteWs() {
        return new PollByteWs();
    }

    /**
     * Create an instance of {@link EnbDetailsGet }
     * 
     */
    public EnbDetailsGet createEnbDetailsGet() {
        return new EnbDetailsGet();
    }

    /**
     * Create an instance of {@link LteCSonEntryWs }
     * 
     */
    public LteCSonEntryWs createLteCSonEntryWs() {
        return new LteCSonEntryWs();
    }

    /**
     * Create an instance of {@link ConnectionControlWs }
     * 
     */
    public ConnectionControlWs createConnectionControlWs() {
        return new ConnectionControlWs();
    }

    /**
     * Create an instance of {@link LteNetworkProfileResult }
     * 
     */
    public LteNetworkProfileResult createLteNetworkProfileResult() {
        return new LteNetworkProfileResult();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeQosFreq }
     * 
     */
    public MobilityConnectedModeQosFreq createMobilityConnectedModeQosFreq() {
        return new MobilityConnectedModeQosFreq();
    }

    /**
     * Create an instance of {@link LteSonProfileResult }
     * 
     */
    public LteSonProfileResult createLteSonProfileResult() {
        return new LteSonProfileResult();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeEarfcn }
     * 
     */
    public MobilityConnectedModeEarfcn createMobilityConnectedModeEarfcn() {
        return new MobilityConnectedModeEarfcn();
    }

    /**
     * Create an instance of {@link ProfileResult }
     * 
     */
    public ProfileResult createProfileResult() {
        return new ProfileResult();
    }

    /**
     * Create an instance of {@link PollPduWs }
     * 
     */
    public PollPduWs createPollPduWs() {
        return new PollPduWs();
    }

    /**
     * Create an instance of {@link PciRangeListContainer }
     * 
     */
    public PciRangeListContainer createPciRangeListContainer() {
        return new PciRangeListContainer();
    }

    /**
     * Create an instance of {@link CellNeighborManagementWs }
     * 
     */
    public CellNeighborManagementWs createCellNeighborManagementWs() {
        return new CellNeighborManagementWs();
    }

    /**
     * Create an instance of {@link EmbmsWs }
     * 
     */
    public EmbmsWs createEmbmsWs() {
        return new EmbmsWs();
    }

    /**
     * Create an instance of {@link DailyOption1 }
     * 
     */
    public DailyOption1 createDailyOption1() {
        return new DailyOption1();
    }

    /**
     * Create an instance of {@link EmergencyCallWs }
     * 
     */
    public EmergencyCallWs createEmergencyCallWs() {
        return new EmergencyCallWs();
    }

    /**
     * Create an instance of {@link ReselectionWs }
     * 
     */
    public ReselectionWs createReselectionWs() {
        return new ReselectionWs();
    }

    /**
     * Create an instance of {@link ArrayOfDaysOfWeek }
     * 
     */
    public ArrayOfDaysOfWeek createArrayOfDaysOfWeek() {
        return new ArrayOfDaysOfWeek();
    }

    /**
     * Create an instance of {@link DailyOption2 }
     * 
     */
    public DailyOption2 createDailyOption2() {
        return new DailyOption2();
    }

    /**
     * Create an instance of {@link RlcModeWs }
     * 
     */
    public RlcModeWs createRlcModeWs() {
        return new RlcModeWs();
    }

    /**
     * Create an instance of {@link RecurrenceYearly }
     * 
     */
    public RecurrenceYearly createRecurrenceYearly() {
        return new RecurrenceYearly();
    }

    /**
     * Create an instance of {@link RecurrenceMonthly }
     * 
     */
    public RecurrenceMonthly createRecurrenceMonthly() {
        return new RecurrenceMonthly();
    }

    /**
     * Create an instance of {@link MobilityIdleFreqWs }
     * 
     */
    public MobilityIdleFreqWs createMobilityIdleFreqWs() {
        return new MobilityIdleFreqWs();
    }

    /**
     * Create an instance of {@link EnbStateGetWs }
     * 
     */
    public EnbStateGetWs createEnbStateGetWs() {
        return new EnbStateGetWs();
    }

    /**
     * Create an instance of {@link HandoverWs }
     * 
     */
    public HandoverWs createHandoverWs() {
        return new HandoverWs();
    }

    /**
     * Create an instance of {@link PdclEntryWs }
     * 
     */
    public PdclEntryWs createPdclEntryWs() {
        return new PdclEntryWs();
    }

    /**
     * Create an instance of {@link SoftFreqReuseWs }
     * 
     */
    public SoftFreqReuseWs createSoftFreqReuseWs() {
        return new SoftFreqReuseWs();
    }

    /**
     * Create an instance of {@link AnrFreq }
     * 
     */
    public AnrFreq createAnrFreq() {
        return new AnrFreq();
    }

    /**
     * Create an instance of {@link UplinkLinkAdaptationWs }
     * 
     */
    public UplinkLinkAdaptationWs createUplinkLinkAdaptationWs() {
        return new UplinkLinkAdaptationWs();
    }

    /**
     * Create an instance of {@link RsiRangeListContainer }
     * 
     */
    public RsiRangeListContainer createRsiRangeListContainer() {
        return new RsiRangeListContainer();
    }

    /**
     * Create an instance of {@link Sib1Ws }
     * 
     */
    public Sib1Ws createSib1Ws() {
        return new Sib1Ws();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterBandListContainer }
     * 
     */
    public MobilityIdleModeInterBandListContainer createMobilityIdleModeInterBandListContainer() {
        return new MobilityIdleModeInterBandListContainer();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeFreq }
     * 
     */
    public MobilityConnectedModeFreq createMobilityConnectedModeFreq() {
        return new MobilityConnectedModeFreq();
    }

    /**
     * Create an instance of {@link YearlyOption2 }
     * 
     */
    public YearlyOption2 createYearlyOption2() {
        return new YearlyOption2();
    }

    /**
     * Create an instance of {@link CellRadioInterfaceWs }
     * 
     */
    public CellRadioInterfaceWs createCellRadioInterfaceWs() {
        return new CellRadioInterfaceWs();
    }

    /**
     * Create an instance of {@link YearlyOption1 }
     * 
     */
    public YearlyOption1 createYearlyOption1() {
        return new YearlyOption1();
    }

    /**
     * Create an instance of {@link MobilityUtranReselectionPriorityEntryWs }
     * 
     */
    public MobilityUtranReselectionPriorityEntryWs createMobilityUtranReselectionPriorityEntryWs() {
        return new MobilityUtranReselectionPriorityEntryWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterEarfcnListContainer }
     * 
     */
    public MobilityIdleModeInterEarfcnListContainer createMobilityIdleModeInterEarfcnListContainer() {
        return new MobilityIdleModeInterEarfcnListContainer();
    }

    /**
     * Create an instance of {@link PciRange }
     * 
     */
    public PciRange createPciRange() {
        return new PciRange();
    }

    /**
     * Create an instance of {@link CsfbCdma2KMobilityParams }
     * 
     */
    public CsfbCdma2KMobilityParams createCsfbCdma2KMobilityParams() {
        return new CsfbCdma2KMobilityParams();
    }

    /**
     * Create an instance of {@link TreorderingWs }
     * 
     */
    public TreorderingWs createTreorderingWs() {
        return new TreorderingWs();
    }

    /**
     * Create an instance of {@link EnbNeighbour }
     * 
     */
    public EnbNeighbour createEnbNeighbour() {
        return new EnbNeighbour();
    }

    /**
     * Create an instance of {@link MobilityConnectedInterWs }
     * 
     */
    public MobilityConnectedInterWs createMobilityConnectedInterWs() {
        return new MobilityConnectedInterWs();
    }

    /**
     * Create an instance of {@link LteSecurityProfileResult }
     * 
     */
    public LteSecurityProfileResult createLteSecurityProfileResult() {
        return new LteSecurityProfileResult();
    }

    /**
     * Create an instance of {@link AnrFreqListContainer }
     * 
     */
    public AnrFreqListContainer createAnrFreqListContainer() {
        return new AnrFreqListContainer();
    }

    /**
     * Create an instance of {@link Recurrence }
     * 
     */
    public Recurrence createRecurrence() {
        return new Recurrence();
    }

    /**
     * Create an instance of {@link UeHandlingEnbWs }
     * 
     */
    public UeHandlingEnbWs createUeHandlingEnbWs() {
        return new UeHandlingEnbWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedQosWs }
     * 
     */
    public MobilityConnectedQosWs createMobilityConnectedQosWs() {
        return new MobilityConnectedQosWs();
    }

    /**
     * Create an instance of {@link DlTxOpt }
     * 
     */
    public DlTxOpt createDlTxOpt() {
        return new DlTxOpt();
    }

    /**
     * Create an instance of {@link NeighborManagementWs }
     * 
     */
    public NeighborManagementWs createNeighborManagementWs() {
        return new NeighborManagementWs();
    }

    /**
     * Create an instance of {@link QosEarfcn }
     * 
     */
    public QosEarfcn createQosEarfcn() {
        return new QosEarfcn();
    }

    /**
     * Create an instance of {@link LteSystemDefaultProfileResult }
     * 
     */
    public LteSystemDefaultProfileResult createLteSystemDefaultProfileResult() {
        return new LteSystemDefaultProfileResult();
    }

    /**
     * Create an instance of {@link MobilityGeranReselectionPriorityListContainer }
     * 
     */
    public MobilityGeranReselectionPriorityListContainer createMobilityGeranReselectionPriorityListContainer() {
        return new MobilityGeranReselectionPriorityListContainer();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeStopGaps }
     * 
     */
    public MobilityConnectedModeStopGaps createMobilityConnectedModeStopGaps() {
        return new MobilityConnectedModeStopGaps();
    }

    /**
     * Create an instance of {@link EnbPnpConfig }
     * 
     */
    public EnbPnpConfig createEnbPnpConfig() {
        return new EnbPnpConfig();
    }

    /**
     * Create an instance of {@link MobilityIdleInterFreqWs }
     * 
     */
    public MobilityIdleInterFreqWs createMobilityIdleInterFreqWs() {
        return new MobilityIdleInterFreqWs();
    }

    /**
     * Create an instance of {@link CellCallTraceWs }
     * 
     */
    public CellCallTraceWs createCellCallTraceWs() {
        return new CellCallTraceWs();
    }

    /**
     * Create an instance of {@link CallTraceProfileResult }
     * 
     */
    public CallTraceProfileResult createCallTraceProfileResult() {
        return new CallTraceProfileResult();
    }

    /**
     * Create an instance of {@link EnbIPRouteWs }
     * 
     */
    public EnbIPRouteWs createEnbIPRouteWs() {
        return new EnbIPRouteWs();
    }

    /**
     * Create an instance of {@link DiscardTimerWs }
     * 
     */
    public DiscardTimerWs createDiscardTimerWs() {
        return new DiscardTimerWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterFreq }
     * 
     */
    public MobilityIdleModeInterFreq createMobilityIdleModeInterFreq() {
        return new MobilityIdleModeInterFreq();
    }

    /**
     * Create an instance of {@link LteCellGetWs }
     * 
     */
    public LteCellGetWs createLteCellGetWs() {
        return new LteCellGetWs();
    }

    /**
     * Create an instance of {@link AllowedBandWs }
     * 
     */
    public AllowedBandWs createAllowedBandWs() {
        return new AllowedBandWs();
    }

    /**
     * Create an instance of {@link CellPucchWs }
     * 
     */
    public CellPucchWs createCellPucchWs() {
        return new CellPucchWs();
    }

    /**
     * Create an instance of {@link EnbSyncProfileParams }
     * 
     */
    public EnbSyncProfileParams createEnbSyncProfileParams() {
        return new EnbSyncProfileParams();
    }

    /**
     * Create an instance of {@link PlmnListContainer }
     * 
     */
    public PlmnListContainer createPlmnListContainer() {
        return new PlmnListContainer();
    }

    /**
     * Create an instance of {@link MobilityGeranReselectionPriorityEntryWs }
     * 
     */
    public MobilityGeranReselectionPriorityEntryWs createMobilityGeranReselectionPriorityEntryWs() {
        return new MobilityGeranReselectionPriorityEntryWs();
    }

    /**
     * Create an instance of {@link UtranProfileResult }
     * 
     */
    public UtranProfileResult createUtranProfileResult() {
        return new UtranProfileResult();
    }

    /**
     * Create an instance of {@link RadioInterfaceWs }
     * 
     */
    public RadioInterfaceWs createRadioInterfaceWs() {
        return new RadioInterfaceWs();
    }

    /**
     * Create an instance of {@link EnbDetailsGetPnp }
     * 
     */
    public EnbDetailsGetPnp createEnbDetailsGetPnp() {
        return new EnbDetailsGetPnp();
    }

    /**
     * Create an instance of {@link RecurrenceDaily }
     * 
     */
    public RecurrenceDaily createRecurrenceDaily() {
        return new RecurrenceDaily();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeBandListContainer }
     * 
     */
    public MobilityConnectedModeBandListContainer createMobilityConnectedModeBandListContainer() {
        return new MobilityConnectedModeBandListContainer();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResult }
     * 
     */
    public Lte3RdPartyResult createLte3RdPartyResult() {
        return new Lte3RdPartyResult();
    }

    /**
     * Create an instance of {@link CellAirSonWs }
     * 
     */
    public CellAirSonWs createCellAirSonWs() {
        return new CellAirSonWs();
    }

    /**
     * Create an instance of {@link CellDynamicCfiWs }
     * 
     */
    public CellDynamicCfiWs createCellDynamicCfiWs() {
        return new CellDynamicCfiWs();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci6(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci6_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci5(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci5_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci4(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci4_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci3(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci3_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci2(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci2_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci1(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci1_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsSrb(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsSrb_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci9(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci9_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci8(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci8_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = RlcModeWs.class)
    public JAXBElement<AckMode> createRlcModeWsQci7(AckMode value) {
        return new JAXBElement<AckMode>(_RlcModeWsQci7_QNAME, AckMode.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = RlcModeWs.class)
    public JAXBElement<Boolean> createRlcModeWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, RlcModeWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = QosEarfcn.class)
    public JAXBElement<Integer> createQosEarfcnEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, QosEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LeapSeconds", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsLeapSeconds(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsLeapSeconds_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SynchronizationSequenceIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsSynchronizationSequenceIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsSynchronizationSequenceIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SynchronizationSequence", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsSynchronizationSequence(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsSynchronizationSequence_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SynchronizationPeriod", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsSynchronizationPeriod(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsSynchronizationPeriod_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LeapSecondsIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsLeapSecondsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsLeapSecondsIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SynchronizationPeriodIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsSynchronizationPeriodIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsSynchronizationPeriodIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiListSize", scope = RsiRange.class)
    public JAXBElement<Integer> createRsiRangeRsiListSize(Integer value) {
        return new JAXBElement<Integer>(_RsiRangeRsiListSize_QNAME, Integer.class, RsiRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiStart", scope = RsiRange.class)
    public JAXBElement<Integer> createRsiRangeRsiStart(Integer value) {
        return new JAXBElement<Integer>(_RsiRangeRsiStart_QNAME, Integer.class, RsiRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiStep", scope = RsiRange.class)
    public JAXBElement<Integer> createRsiRangeRsiStep(Integer value) {
        return new JAXBElement<Integer>(_RsiRangeRsiStep_QNAME, Integer.class, RsiRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicBsrTimer", scope = MacWs.class)
    public JAXBElement<String> createMacWsPeriodicBsrTimer(String value) {
        return new JAXBElement<String>(_MacWsPeriodicBsrTimer_QNAME, String.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxHarqTxForDl", scope = MacWs.class)
    public JAXBElement<String> createMacWsMaxHarqTxForDl(String value) {
        return new JAXBElement<String>(_MacWsMaxHarqTxForDl_QNAME, String.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxHarqTxForUl", scope = MacWs.class)
    public JAXBElement<String> createMacWsMaxHarqTxForUl(String value) {
        return new JAXBElement<String>(_MacWsMaxHarqTxForUl_QNAME, String.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeriodicBsrTimerIsDefault", scope = MacWs.class)
    public JAXBElement<Boolean> createMacWsPeriodicBsrTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MacWsPeriodicBsrTimerIsDefault_QNAME, Boolean.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RetxBsrTimer", scope = MacWs.class)
    public JAXBElement<String> createMacWsRetxBsrTimer(String value) {
        return new JAXBElement<String>(_MacWsRetxBsrTimer_QNAME, String.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxHarqTxForUlIsDefault", scope = MacWs.class)
    public JAXBElement<Boolean> createMacWsMaxHarqTxForUlIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MacWsMaxHarqTxForUlIsDefault_QNAME, Boolean.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RetxBsrTimerIsDefault", scope = MacWs.class)
    public JAXBElement<Boolean> createMacWsRetxBsrTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MacWsRetxBsrTimerIsDefault_QNAME, Boolean.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxHarqTxForDlIsDefault", scope = MacWs.class)
    public JAXBElement<Boolean> createMacWsMaxHarqTxForDlIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MacWsMaxHarqTxForDlIsDefault_QNAME, Boolean.class, MacWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportedAntennaBeams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LongAntennaBeam", scope = EnbDetailsGetPnp.class)
    public JAXBElement<SupportedAntennaBeams> createEnbDetailsGetPnpLongAntennaBeam(SupportedAntennaBeams value) {
        return new JAXBElement<SupportedAntennaBeams>(_EnbDetailsGetPnpLongAntennaBeam_QNAME, SupportedAntennaBeams.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCSonServer", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForCSonServer(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCSonServer_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min20MHzChannel", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpMin20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin20MHzChannel_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max20MHzChannel", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpMax20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax20MHzChannel_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LedModeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedMode", scope = EnbDetailsGetPnp.class)
    public JAXBElement<LedModeValues> createEnbDetailsGetPnpLedMode(LedModeValues value) {
        return new JAXBElement<LedModeValues>(_EnbDetailsGetPnpLedMode_QNAME, LedModeValues.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpAltitude(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpAltitude_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1InterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsM1InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM1InterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2U", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForX2U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2U_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAutoX2ControlForNeighboursEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Boolean> createEnbDetailsGetPnpIsAutoX2ControlForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsAutoX2ControlForNeighboursEnabled_QNAME, Boolean.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsS1UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1UInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsX2UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2UInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ENodeBID", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpENodeBID(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpENodeBID_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonServerInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsCSonServerInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCSonServerInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2ConfigurationUpdateForNeighboursEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Boolean> createEnbDetailsGetPnpIsX2ConfigurationUpdateForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsX2ConfigurationUpdateForNeighboursEnabled_QNAME, Boolean.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveAntenna", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpActiveAntenna(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpActiveAntenna_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1C", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForS1C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1C_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = EnbDetailsGetPnp.class)
    public JAXBElement<BigDecimal> createEnbDetailsGetPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLongitude_QNAME, BigDecimal.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max40MHzChannel", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpMax40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax40MHzChannel_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellToUseValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellToUse", scope = EnbDetailsGetPnp.class)
    public JAXBElement<CellToUseValues> createEnbDetailsGetPnpCellToUse(CellToUseValues value) {
        return new JAXBElement<CellToUseValues>(_EnbDetailsGetPnpCellToUse_QNAME, CellToUseValues.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpSlaveInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsPtpSlaveInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsPtpSlaveInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM2", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForM2(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM2_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM1", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForM1(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM1_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2C", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForX2C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2C_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min40MHzChannel", scope = EnbDetailsGetPnp.class)
    public JAXBElement<Integer> createEnbDetailsGetPnpMin40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin40MHzChannel_QNAME, Integer.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForManagement", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForManagement(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForManagement_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCallTraceInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsCallTraceInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCallTraceInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1U", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForS1U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1U_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2InterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsM2InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM2InterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsS1CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1CInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForPtpSlave", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForPtpSlave(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForPtpSlave_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCallTrace", scope = EnbDetailsGetPnp.class)
    public JAXBElement<String> createEnbDetailsGetPnpInterfaceToUseForCallTrace(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCallTrace_QNAME, String.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = EnbDetailsGetPnp.class)
    public JAXBElement<BigDecimal> createEnbDetailsGetPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLatitude_QNAME, BigDecimal.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CInterfaceEnabled", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpIsX2CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2CInterfaceEnabled_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultX2ControlStateForNeighbours", scope = EnbDetailsGetPnp.class)
    public JAXBElement<X2ControlStateTypes> createEnbDetailsGetPnpDefaultX2ControlStateForNeighbours(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_EnbDetailsGetPnpDefaultX2ControlStateForNeighbours_QNAME, X2ControlStateTypes.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LongSbaEnable", scope = EnbDetailsGetPnp.class)
    public JAXBElement<EnabledDisabledStates> createEnbDetailsGetPnpLongSbaEnable(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpLongSbaEnable_QNAME, EnabledDisabledStates.class, EnbDetailsGetPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmountIsDefault", scope = MobilityConnectedQosWs.class)
    public JAXBElement<Boolean> createMobilityConnectedQosWsReportAmountIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsReportAmountIsDefault_QNAME, Boolean.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosBasedMobilityTimerIsDefault", scope = MobilityConnectedQosWs.class)
    public JAXBElement<Boolean> createMobilityConnectedQosWsQosBasedMobilityTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsQosBasedMobilityTimerIsDefault_QNAME, Boolean.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmount", scope = MobilityConnectedQosWs.class)
    public JAXBElement<String> createMobilityConnectedQosWsReportAmount(String value) {
        return new JAXBElement<String>(_MobilityConnectedQosWsReportAmount_QNAME, String.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCellsIsDefault", scope = MobilityConnectedQosWs.class)
    public JAXBElement<Boolean> createMobilityConnectedQosWsMaxReportCellsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsMaxReportCellsIsDefault_QNAME, Boolean.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCells", scope = MobilityConnectedQosWs.class)
    public JAXBElement<Integer> createMobilityConnectedQosWsMaxReportCells(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedQosWsMaxReportCells_QNAME, Integer.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QosBasedMobilityTimer", scope = MobilityConnectedQosWs.class)
    public JAXBElement<Integer> createMobilityConnectedQosWsQosBasedMobilityTimer(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedQosWsQosBasedMobilityTimer_QNAME, Integer.class, MobilityConnectedQosWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PcchnBIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsPcchnBIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsPcchnBIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CqiPmiPeriodictyForFddIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsCqiPmiPeriodictyForFddIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsCqiPmiPeriodictyForFddIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FilterCoefficientIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsFilterCoefficientIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsFilterCoefficientIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CqiPmiPeriodictyForTdd", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsCqiPmiPeriodictyForTdd(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsCqiPmiPeriodictyForTdd_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrPeriodicity", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsSrPeriodicity(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsSrPeriodicity_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschPaIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsPdschPaIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsPdschPaIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FilterCoefficient", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsFilterCoefficient(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsFilterCoefficient_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PcchnB", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsPcchnB(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsPcchnB_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CqiPmiPeriodictyForTddIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsCqiPmiPeriodictyForTddIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsCqiPmiPeriodictyForTddIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrPeriodicityIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsSrPeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsSrPeriodicityIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CqiPmiPeriodictyForFdd", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsCqiPmiPeriodictyForFdd(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsCqiPmiPeriodictyForFdd_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschPb", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsPdschPb(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsPdschPb_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschPa", scope = CellRadioInterfaceWs.class)
    public JAXBElement<String> createCellRadioInterfaceWsPdschPa(String value) {
        return new JAXBElement<String>(_CellRadioInterfaceWsPdschPa_QNAME, String.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschPbIsDefault", scope = CellRadioInterfaceWs.class)
    public JAXBElement<Boolean> createCellRadioInterfaceWsPdschPbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRadioInterfaceWsPdschPbIsDefault_QNAME, Boolean.class, CellRadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHigh", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionThreshXHigh(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXHigh_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxGeranNotPresent", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Boolean> createMobilityInterRatGeranReselectionIsPMaxGeranNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityInterRatGeranReselectionIsPMaxGeranNotPresent_QNAME, Boolean.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevMin", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionQRxLevMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionQRxLevMin_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionGeran", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionTReselectionGeran(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionTReselectionGeran_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLow", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionThreshXLow(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXLow_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMaxGeran", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionPMaxGeran(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionPMaxGeran_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraceTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceType", scope = CallTraceProfile.class)
    public JAXBElement<TraceTypes> createCallTraceProfileTraceType(TraceTypes value) {
        return new JAXBElement<TraceTypes>(_CallTraceProfileTraceType_QNAME, TraceTypes.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeZones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeZone", scope = CallTraceProfile.class)
    public JAXBElement<TimeZones> createCallTraceProfileTimeZone(TimeZones value) {
        return new JAXBElement<TimeZones>(_CallTraceProfileTimeZone_QNAME, TimeZones.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDirections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceX2", scope = CallTraceProfile.class)
    public JAXBElement<MessageDirections> createCallTraceProfileTraceX2(MessageDirections value) {
        return new JAXBElement<MessageDirections>(_CallTraceProfileTraceX2_QNAME, MessageDirections.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceSib", scope = CallTraceProfile.class)
    public JAXBElement<EnabledDisabledStates> createCallTraceProfileTraceSib(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_CallTraceProfileTraceSib_QNAME, EnabledDisabledStates.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallTraceEnabled", scope = CallTraceProfile.class)
    public JAXBElement<EnabledDisabledStates> createCallTraceProfileCallTraceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_CallTraceProfileCallTraceEnabled_QNAME, EnabledDisabledStates.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDirections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceS1", scope = CallTraceProfile.class)
    public JAXBElement<MessageDirections> createCallTraceProfileTraceS1(MessageDirections value) {
        return new JAXBElement<MessageDirections>(_CallTraceProfileTraceS1_QNAME, MessageDirections.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkDirections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceUu", scope = CallTraceProfile.class)
    public JAXBElement<LinkDirections> createCallTraceProfileTraceUu(LinkDirections value) {
        return new JAXBElement<LinkDirections>(_CallTraceProfileTraceUu_QNAME, LinkDirections.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = CallTraceProfile.class)
    public JAXBElement<CategoriesLte> createCallTraceProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, CallTraceProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnPMax_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<String> createMobilityIdleModeInterEarfcnQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlEarfcn", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnDlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnDlEarfcn_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnTReselectionEutra_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighP", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnThreshXHighP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighP_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowQr9", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnThreshXLowQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowQr9_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQQualMinr9_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterEarfcnIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterEarfcnIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevelMin", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnQRxLevelMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQRxLevelMin_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowP", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnThreshXLowP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowP_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighQr9", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<Integer> createMobilityIdleModeInterEarfcnThreshXHighQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighQr9_QNAME, Integer.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeInterEarfcn.class)
    public JAXBElement<String> createMobilityIdleModeInterEarfcnCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnCellReselectionPriority_QNAME, String.class, MobilityIdleModeInterEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacContentionResolutionTimer", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsMacContentionResolutionTimer(String value) {
        return new JAXBElement<String>(_RandomAccessWsMacContentionResolutionTimer_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacContentionResolutionTimerIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsMacContentionResolutionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsMacContentionResolutionTimerIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleInitialReceivedTargetPower", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsPreambleInitialReceivedTargetPower(String value) {
        return new JAXBElement<String>(_RandomAccessWsPreambleInitialReceivedTargetPower_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachConfigIndexIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPrachConfigIndexIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPrachConfigIndexIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RaResponseWindowSize", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsRaResponseWindowSize(String value) {
        return new JAXBElement<String>(_RandomAccessWsRaResponseWindowSize_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZeroCorrelationZoneConfig", scope = RandomAccessWs.class)
    public JAXBElement<Integer> createRandomAccessWsZeroCorrelationZoneConfig(Integer value) {
        return new JAXBElement<Integer>(_RandomAccessWsZeroCorrelationZoneConfig_QNAME, Integer.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZeroCorrelationZoneConfigIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsZeroCorrelationZoneConfigIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsZeroCorrelationZoneConfigIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerRampingStep", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsPowerRampingStep(String value) {
        return new JAXBElement<String>(_RandomAccessWsPowerRampingStep_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleTransMax", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsPreambleTransMax(String value) {
        return new JAXBElement<String>(_RandomAccessWsPreambleTransMax_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfRaPreamblesIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsNumberOfRaPreamblesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsNumberOfRaPreamblesIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RaResponseWindowSizeIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsRaResponseWindowSizeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsRaResponseWindowSizeIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleInitialReceivedTargetPowerIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPreambleInitialReceivedTargetPowerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPreambleInitialReceivedTargetPowerIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfRaPreambles", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsNumberOfRaPreambles(String value) {
        return new JAXBElement<String>(_RandomAccessWsNumberOfRaPreambles_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachConfigIndex", scope = RandomAccessWs.class)
    public JAXBElement<Integer> createRandomAccessWsPrachConfigIndex(Integer value) {
        return new JAXBElement<Integer>(_RandomAccessWsPrachConfigIndex_QNAME, Integer.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerRampingStepIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPowerRampingStepIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPowerRampingStepIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleTransMaxIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPreambleTransMaxIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPreambleTransMaxIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = PnpDetailWs.class)
    public JAXBElement<BigDecimal> createPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = PnpDetailWs.class)
    public JAXBElement<Integer> createPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = PnpDetailWs.class)
    public JAXBElement<Integer> createPnpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_PnpDetailWsSnmpPort_QNAME, Integer.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = PnpDetailWs.class)
    public JAXBElement<BigDecimal> createPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = PnpDetailWs.class)
    public JAXBElement<Double> createPnpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_PnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = PnpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createPnpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_PnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = PnpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createPnpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_PnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = PnpDetailWs.class)
    public JAXBElement<PnpHardwareTypes> createPnpDetailWsHardware(PnpHardwareTypes value) {
        return new JAXBElement<PnpHardwareTypes>(_PnpDetailWsHardware_QNAME, PnpHardwareTypes.class, PnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<NodeManagementModes> createLteEnbDetailsSetWsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_LteEnbDetailsSetWsManagedMode_QNAME, NodeManagementModes.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PaCellEdgeUesIsDefault", scope = SoftFreqReuseWs.class)
    public JAXBElement<Boolean> createSoftFreqReuseWsPaCellEdgeUesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SoftFreqReuseWsPaCellEdgeUesIsDefault_QNAME, Boolean.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PaCellEdgeUes", scope = SoftFreqReuseWs.class)
    public JAXBElement<String> createSoftFreqReuseWsPaCellEdgeUes(String value) {
        return new JAXBElement<String>(_SoftFreqReuseWsPaCellEdgeUes_QNAME, String.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PaCellCenterUesIsDefault", scope = SoftFreqReuseWs.class)
    public JAXBElement<Boolean> createSoftFreqReuseWsPaCellCenterUesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SoftFreqReuseWsPaCellCenterUesIsDefault_QNAME, Boolean.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McsHysteresis", scope = SoftFreqReuseWs.class)
    public JAXBElement<Integer> createSoftFreqReuseWsMcsHysteresis(Integer value) {
        return new JAXBElement<Integer>(_SoftFreqReuseWsMcsHysteresis_QNAME, Integer.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PaCellCenterUes", scope = SoftFreqReuseWs.class)
    public JAXBElement<String> createSoftFreqReuseWsPaCellCenterUes(String value) {
        return new JAXBElement<String>(_SoftFreqReuseWsPaCellCenterUes_QNAME, String.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McsHysteresisIsDefault", scope = SoftFreqReuseWs.class)
    public JAXBElement<Boolean> createSoftFreqReuseWsMcsHysteresisIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SoftFreqReuseWsMcsHysteresisIsDefault_QNAME, Boolean.class, SoftFreqReuseWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastUlSymSuppression", scope = SynchronizationWs.class)
    public JAXBElement<EnabledDisabledStates> createSynchronizationWsLastUlSymSuppression(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_SynchronizationWsLastUlSymSuppression_QNAME, EnabledDisabledStates.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WimaxCoexistenceFrameShift", scope = SynchronizationWs.class)
    public JAXBElement<Integer> createSynchronizationWsWimaxCoexistenceFrameShift(Integer value) {
        return new JAXBElement<Integer>(_SynchronizationWsWimaxCoexistenceFrameShift_QNAME, Integer.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastUlSymSuppressionIsDefault", scope = SynchronizationWs.class)
    public JAXBElement<Boolean> createSynchronizationWsLastUlSymSuppressionIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SynchronizationWsLastUlSymSuppressionIsDefault_QNAME, Boolean.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WimaxCoexistenceFrameShiftIsDefault", scope = SynchronizationWs.class)
    public JAXBElement<Boolean> createSynchronizationWsWimaxCoexistenceFrameShiftIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SynchronizationWsWimaxCoexistenceFrameShiftIsDefault_QNAME, Boolean.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultPagingCycleIsDefault", scope = RadioInterfaceWs.class)
    public JAXBElement<Boolean> createRadioInterfaceWsDefaultPagingCycleIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RadioInterfaceWsDefaultPagingCycleIsDefault_QNAME, Boolean.class, RadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CfiIsDefault", scope = RadioInterfaceWs.class)
    public JAXBElement<Boolean> createRadioInterfaceWsCfiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RadioInterfaceWsCfiIsDefault_QNAME, Boolean.class, RadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cfi", scope = RadioInterfaceWs.class)
    public JAXBElement<Integer> createRadioInterfaceWsCfi(Integer value) {
        return new JAXBElement<Integer>(_RadioInterfaceWsCfi_QNAME, Integer.class, RadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultPagingCycle", scope = RadioInterfaceWs.class)
    public JAXBElement<String> createRadioInterfaceWsDefaultPagingCycle(String value) {
        return new JAXBElement<String>(_RadioInterfaceWsDefaultPagingCycle_QNAME, String.class, RadioInterfaceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallTraceSvrPort", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileCallTraceSvrPort(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileCallTraceSvrPort_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsMgmtVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsMgmtVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsMgmtVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsPtpVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsPtpVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsX2CVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsX2CVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsX2UVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsX2UVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1VlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsM1VlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsM1VlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoLTECodecType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CodecType", scope = EnbNetworkProfile.class)
    public JAXBElement<VoLTECodecType> createEnbNetworkProfileCodecType(VoLTECodecType value) {
        return new JAXBElement<VoLTECodecType>(_EnbNetworkProfileCodecType_QNAME, VoLTECodecType.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsCSonVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsCSonVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadAdmin", scope = EnbNetworkProfile.class)
    public JAXBElement<EnabledDisabledStates> createEnbNetworkProfileMmeOverloadAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbNetworkProfileMmeOverloadAdmin_QNAME, EnabledDisabledStates.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoLTEPeriodicity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketPeriodicity", scope = EnbNetworkProfile.class)
    public JAXBElement<VoLTEPeriodicity> createEnbNetworkProfilePacketPeriodicity(VoLTEPeriodicity value) {
        return new JAXBElement<VoLTEPeriodicity>(_EnbNetworkProfilePacketPeriodicity_QNAME, VoLTEPeriodicity.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallTraceSvrVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileCallTraceSvrVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileCallTraceSvrVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1CVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileS1CVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileS1CVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsS1UVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsS1UVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2UVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileX2UVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileX2UVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MgmtVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileMgmtVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileMgmtVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2McePresent", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileM2McePresent(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileM2McePresent_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M1VlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileM1VlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileM1VlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadLoadReductionAdmin", scope = EnbNetworkProfile.class)
    public JAXBElement<EnabledDisabledStates> createEnbNetworkProfileMmeOverloadLoadReductionAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbNetworkProfileMmeOverloadLoadReductionAdmin_QNAME, EnabledDisabledStates.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2VlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileM2VlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileM2VlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoLTECodecMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CodecMode", scope = EnbNetworkProfile.class)
    public JAXBElement<VoLTECodecMode> createEnbNetworkProfileCodecMode(VoLTECodecMode value) {
        return new JAXBElement<VoLTECodecMode>(_EnbNetworkProfileCodecMode_QNAME, VoLTECodecMode.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileCSonVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileCSonVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallTraceSvrPresent", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileCallTraceSvrPresent(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileCallTraceSvrPresent_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketSize", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfilePacketSize(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfilePacketSize_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MceSctpPort", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileMceSctpPort(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileMceSctpPort_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2VlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsM2VlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsM2VlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStandardVoLTECodec", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsStandardVoLTECodec(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsStandardVoLTECodec_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2CVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileX2CVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileX2CVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadWaitTime", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileMmeOverloadWaitTime(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileMmeOverloadWaitTime_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsS1CVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsS1CVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsRohcProfilesQci1Enabled", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsRohcProfilesQci1Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsRohcProfilesQci1Enabled_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfilePtpVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfilePtpVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbNetworkProfile.class)
    public JAXBElement<CategoriesLte> createEnbNetworkProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileS1UVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileS1UVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbMobilityProfile.class)
    public JAXBElement<CategoriesLte> createEnbMobilityProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DataAccessBarringTimeInSec", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsDataAccessBarringTimeInSec(String value) {
        return new JAXBElement<String>(_LteCellSetWsDataAccessBarringTimeInSec_QNAME, String.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass13Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass13Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEmergencyAccessBarred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsEmergencyAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsEmergencyAccessBarred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass12Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass12Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass14Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass14Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass14Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessBarred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessBarred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAccessClassBarred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsAccessClassBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsAccessClassBarred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass11Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass11Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackingAreaCode", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsTrackingAreaCode(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsTrackingAreaCode_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DataAccessBarringFactor", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsDataAccessBarringFactor(String value) {
        return new JAXBElement<String>(_LteCellSetWsDataAccessBarringFactor_QNAME, String.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEnabled", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsEnabled_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass12Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass12Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalingAccessBarringFactor", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsSignalingAccessBarringFactor(String value) {
        return new JAXBElement<String>(_LteCellSetWsSignalingAccessBarringFactor_QNAME, String.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerIdentity_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalingAccessBarringTimeInSec", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsSignalingAccessBarringTimeInSec(String value) {
        return new JAXBElement<String>(_LteCellSetWsSignalingAccessBarringTimeInSec_QNAME, String.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyAreaId", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsEmergencyAreaId(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsEmergencyAreaId_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass11Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass11Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachFreqOffset_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass14Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass14Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass14Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessBarred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessBarred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass15Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass15Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerCellGroup_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass15Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass15Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsCellID(String value) {
        return new JAXBElement<String>(_LteCellSetWsCellID_QNAME, String.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachRsi", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPrachRsi(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachRsi_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass13Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass13Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnPMax_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SNonIntraSearchPr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSNonIntraSearchPr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSNonIntraSearchPr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SNonIntraSearchQr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSNonIntraSearchQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSNonIntraSearchQr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QHyst", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<String> createMobilityIdleModeIntraFreqQHyst(String value) {
        return new JAXBElement<String>(_MobilityIdleModeIntraFreqQHyst_QNAME, String.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshServingLowQr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqThreshServingLowQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqThreshServingLowQr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchR8", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSIntraSearchR8(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSIntraSearchR8_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnTReselectionEutra_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQQualMinr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsThreshServingLowQr9NotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchEnable", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqSIntraSearchEnable(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeIntraFreqSIntraSearchEnable_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevMin", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqQRxLevMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionQRxLevMin_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SNonIntraSearchR8", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSNonIntraSearchR8(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSNonIntraSearchR8_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchQr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSIntraSearchQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSIntraSearchQr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchPr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSIntraSearchPr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSIntraSearchPr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SNonIntraSearchEnable", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqSNonIntraSearchEnable(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeIntraFreqSNonIntraSearchEnable_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<String> createMobilityIdleModeIntraFreqCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnCellReselectionPriority_QNAME, String.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshServingLowR8", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqThreshServingLowR8(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqThreshServingLowR8_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecSaLifetimeIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsIpsecSaLifetimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsIpsecSaLifetimeIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateMessageType", scope = NetworkingWs.class)
    public JAXBElement<MessageTypes> createNetworkingWsUpdateMessageType(MessageTypes value) {
        return new JAXBElement<MessageTypes>(_NetworkingWsUpdateMessageType_QNAME, MessageTypes.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarginTime", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsMarginTime(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsMarginTime_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IkeSaLifetimeIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsIkeSaLifetimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsIkeSaLifetimeIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdRetriesIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsDpdRetriesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsDpdRetriesIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdDelay", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsDpdDelay(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsDpdDelay_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecSaLifetime", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsIpsecSaLifetime(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsIpsecSaLifetime_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SctpHBeatInterval", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsSctpHBeatInterval(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsSctpHBeatInterval_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdRetries", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsDpdRetries(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsDpdRetries_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdActionIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsDpdActionIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsDpdActionIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SgwDownTimer", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsSgwDownTimer(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsSgwDownTimer_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SctpHBeatIntervalIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsSctpHBeatIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsSctpHBeatIntervalIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpdActions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdAction", scope = NetworkingWs.class)
    public JAXBElement<DpdActions> createNetworkingWsDpdAction(DpdActions value) {
        return new JAXBElement<DpdActions>(_NetworkingWsDpdAction_QNAME, DpdActions.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CertificateUpdateTime", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsCertificateUpdateTime(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsCertificateUpdateTime_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MtuIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsMtuIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsMtuIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateMessageTypeIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsUpdateMessageTypeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsUpdateMessageTypeIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SgwDownTimerIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsSgwDownTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsSgwDownTimerIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CertificateUpdateTimeIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsCertificateUpdateTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsCertificateUpdateTimeIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateRetryTimer", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsUpdateRetryTimer(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsUpdateRetryTimer_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdDelayIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsDpdDelayIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsDpdDelayIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IkeSaLifetime", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsIkeSaLifetime(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsIkeSaLifetime_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateRetryTimerIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsUpdateRetryTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsUpdateRetryTimerIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Mtu", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsMtu(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsMtu_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarginTimeIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsMarginTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsMarginTimeIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeStopGapsTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopGapEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<StopGapEventTypes> createMobilityConnectedModeStopGapsEventType(StopGapEventTypes value) {
        return new JAXBElement<StopGapEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, StopGapEventTypes.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<Integer> createMobilityConnectedModeStopGapsRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<String> createMobilityConnectedModeStopGapsTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeStopGapsHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MonitorInterval", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileMonitorInterval(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileMonitorInterval_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LoadSheddingMode", scope = TrafficManagementProfile.class)
    public JAXBElement<EnabledDisabledStates> createTrafficManagementProfileLoadSheddingMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_TrafficManagementProfileLoadSheddingMode_QNAME, EnabledDisabledStates.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StepUp", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileStepUp(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileStepUp_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinDataInactivityTimer", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileMinDataInactivityTimer(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileMinDataInactivityTimer_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeOverloadThreshold", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileUeOverloadThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileUeOverloadThreshold_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StepDown", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileStepDown(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileStepDown_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeOverloadHysteresis", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileUeOverloadHysteresis(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileUeOverloadHysteresis_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DataInactivityTimer", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileDataInactivityTimer(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileDataInactivityTimer_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDataInactivityTimer", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileMaxDataInactivityTimer(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileMaxDataInactivityTimer_QNAME, Integer.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = TrafficManagementProfile.class)
    public JAXBElement<CategoriesLte> createTrafficManagementProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, TrafficManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI4IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI4IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI3", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI3(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI3_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI3IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI3IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI4", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI4(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI4_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI5", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI5(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI5_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI6", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI6(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI6_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI1", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI1(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI1_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI7IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI7IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI2", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI2(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI2_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI10IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI10IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI10IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI10", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI10(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI10_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI2IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI2IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI7", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI7(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI7_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI8IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI8IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI8", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI8(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI8_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI6IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI6IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI9", scope = EmergencyCallQciWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallQciWsQCI9(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallQciWsQCI9_QNAME, EnabledDisabledStates.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI1IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI1IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI5IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI5IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI9IsDefault", scope = EmergencyCallQciWs.class)
    public JAXBElement<Boolean> createEmergencyCallQciWsQCI9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallQciWsQCI9IsDefault_QNAME, Boolean.class, EmergencyCallQciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActivateVolteDataInactivityIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsActivateVolteDataInactivityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsActivateVolteDataInactivityIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalBitsForFixedAllocationsIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsAdditionalBitsForFixedAllocationsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsAdditionalBitsForFixedAllocationsIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalBitsForFixedAllocations", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsAdditionalBitsForFixedAllocations(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsAdditionalBitsForFixedAllocations_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeaderOverhead", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsHeaderOverhead(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsHeaderOverhead_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RohcCompressionRatioIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsRohcCompressionRatioIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsRohcCompressionRatioIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RohcCompressionRatio", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsRohcCompressionRatio(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsRohcCompressionRatio_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeaderOverheadIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsHeaderOverheadIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsHeaderOverheadIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaximumVolteCalls", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsMaximumVolteCalls(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsMaximumVolteCalls_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaAckStepDownFactor", scope = VolteConfigurationWs.class)
    public JAXBElement<String> createVolteConfigurationWsDlaAckStepDownFactor(String value) {
        return new JAXBElement<String>(_VolteConfigurationWsDlaAckStepDownFactor_QNAME, String.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActivateVolteDataInactivity", scope = VolteConfigurationWs.class)
    public JAXBElement<EnabledDisabledValues> createVolteConfigurationWsActivateVolteDataInactivity(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_VolteConfigurationWsActivateVolteDataInactivity_QNAME, EnabledDisabledValues.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaAckStepDownFactorIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsDlaAckStepDownFactorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsDlaAckStepDownFactorIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedOption", scope = RecurrenceDaily.class)
    public JAXBElement<RecurrenceOptions> createRecurrenceDailySelectedOption(RecurrenceOptions value) {
        return new JAXBElement<RecurrenceOptions>(_RecurrenceDailySelectedOption_QNAME, RecurrenceOptions.class, RecurrenceDaily.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighCellConfig", scope = MobilityConnectedWs.class)
    public JAXBElement<String> createMobilityConnectedWsNeighCellConfig(String value) {
        return new JAXBElement<String>(_MobilityConnectedWsNeighCellConfig_QNAME, String.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmountIsDefault", scope = MobilityConnectedWs.class)
    public JAXBElement<Boolean> createMobilityConnectedWsReportAmountIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsReportAmountIsDefault_QNAME, Boolean.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighCellConfigIsDefault", scope = MobilityConnectedWs.class)
    public JAXBElement<Boolean> createMobilityConnectedWsNeighCellConfigIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedWsNeighCellConfigIsDefault_QNAME, Boolean.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PresenceAntennaPort1", scope = MobilityConnectedWs.class)
    public JAXBElement<EnabledDisabledStates> createMobilityConnectedWsPresenceAntennaPort1(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_MobilityConnectedWsPresenceAntennaPort1_QNAME, EnabledDisabledStates.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmount", scope = MobilityConnectedWs.class)
    public JAXBElement<String> createMobilityConnectedWsReportAmount(String value) {
        return new JAXBElement<String>(_MobilityConnectedQosWsReportAmount_QNAME, String.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PresenceAntennaPort1IsDefault", scope = MobilityConnectedWs.class)
    public JAXBElement<Boolean> createMobilityConnectedWsPresenceAntennaPort1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedWsPresenceAntennaPort1IsDefault_QNAME, Boolean.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCellsIsDefault", scope = MobilityConnectedWs.class)
    public JAXBElement<Boolean> createMobilityConnectedWsMaxReportCellsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsMaxReportCellsIsDefault_QNAME, Boolean.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCells", scope = MobilityConnectedWs.class)
    public JAXBElement<Integer> createMobilityConnectedWsMaxReportCells(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedQosWsMaxReportCells_QNAME, Integer.class, MobilityConnectedWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxUeIsDefault", scope = UeHandlingEnbWs.class)
    public JAXBElement<Boolean> createUeHandlingEnbWsMaxUeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UeHandlingEnbWsMaxUeIsDefault_QNAME, Boolean.class, UeHandlingEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxUe", scope = UeHandlingEnbWs.class)
    public JAXBElement<Integer> createUeHandlingEnbWsMaxUe(Integer value) {
        return new JAXBElement<Integer>(_UeHandlingEnbWsMaxUe_QNAME, Integer.class, UeHandlingEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = WSEmbmsSib15FreqEntry.class)
    public JAXBElement<Integer> createWSEmbmsSib15FreqEntryEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, WSEmbmsSib15FreqEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = MaxRetxThresholdWs.class)
    public JAXBElement<String> createMaxRetxThresholdWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = MaxRetxThresholdWs.class)
    public JAXBElement<Boolean> createMaxRetxThresholdWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, MaxRetxThresholdWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Month", scope = YearlyOption1 .class)
    public JAXBElement<Integer> createYearlyOption1Month(Integer value) {
        return new JAXBElement<Integer>(_YearlyOption1Month_QNAME, Integer.class, YearlyOption1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayOfMonth", scope = YearlyOption1 .class)
    public JAXBElement<Integer> createYearlyOption1DayOfMonth(Integer value) {
        return new JAXBElement<Integer>(_YearlyOption1DayOfMonth_QNAME, Integer.class, YearlyOption1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonConfigured", scope = LteCSonEntryWs.class)
    public JAXBElement<Boolean> createLteCSonEntryWsIsCSonConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_LteCSonEntryWsIsCSonConfigured_QNAME, Boolean.class, LteCSonEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonServerPort", scope = LteCSonEntryWs.class)
    public JAXBElement<Integer> createLteCSonEntryWsCSonServerPort(Integer value) {
        return new JAXBElement<Integer>(_LteCSonEntryWsCSonServerPort_QNAME, Integer.class, LteCSonEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbPuschLoadThresh", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbPuschLoadThresh(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbPuschLoadThresh_QNAME, Integer.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbCapacityClassValue", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbCapacityClassValue(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbCapacityClassValue_QNAME, Integer.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonMcimEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonMcimEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonMcimEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbPdschLoadThresh", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbPdschLoadThresh(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbPdschLoadThresh_QNAME, Integer.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbRrcLoadThresh", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbRrcLoadThresh(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbRrcLoadThresh_QNAME, Integer.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonMroEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonMroEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonMroEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDlTxOptEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsDlTxOptEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsDlTxOptEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonRachEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonRachEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonRachEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonMlbEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonMlbEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonMlbEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbCpuLoadThresh", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbCpuLoadThresh(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbCpuLoadThresh_QNAME, Integer.class, LteSonCSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc5", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc5(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc5_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsEncSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsEncSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ParameterReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsParameterReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsParameterReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClassInfoReq", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBandClassInfoReq(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBandClassInfoReq_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupIncl", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupIncl(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupIncl_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LtmOffIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsLtmOffIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsLtmOffIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultNidsIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultNidsIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultNidsIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AltBandClassIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsAltBandClassIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsAltBandClassIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rand", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsRand(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsRand_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Gcsnal2AckTimer", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsGcsnal2AckTimer(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsGcsnal2AckTimer_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Imsi1112Included", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsi1112Included(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsi1112Included_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsInitPosLocSupInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsInitPosLocSupInd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsInitPosLocSupInd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseSyncId", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsUseSyncId(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsUseSyncId_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerUpRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerUpRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerUpRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Gcsnal2AckTimerIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigEncryptSupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigEncryptSupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigEncryptSupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Mcc", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMcc(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMcc_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LpSec", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsLpSec(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsLpSec_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsAuthIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsAuthIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbInRcnmInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbInRcnmInd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbInRcnmInd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrefMsidTypeIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPrefMsidTypeIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPrefMsidTypeIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayLtIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsDayLtIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsDayLtIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbInRcnmIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbInRcnmIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbInRcnmIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MobQosIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMobQosIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMobQosIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ImsiTSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsiTSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsiTSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClass", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsBandClass_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc12", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc12(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc12_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc11", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc11(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc11_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ParameterRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsParameterRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsParameterRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsHomeReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsHomeReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc3", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc3(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc3_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotInc", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPilotInc(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPilotInc_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketZoneIdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPacketZoneIdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPacketZoneIdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsHomeRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsHomeRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc4", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc4(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc4_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotReportIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotReportIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotReportIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegPrdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRegPrdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRegPrdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RandIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRandIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRandIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GcsnaSequenceContextTimer", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsGcsnaSequenceContextTimer(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsGcsnaSequenceContextTimer_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TkzIdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTkzIdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTkzIdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForNidReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForNidReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForNidReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseSyncIdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsUseSyncIdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsUseSyncIdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultNids", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultNids(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultNids_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystTimerMul", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPzHystTimerMul(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPzHystTimerMul_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigEncryptSup", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsSigEncryptSup(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsSigEncryptSup_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerDownRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerDownRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerDownRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegPrd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsRegPrd(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsRegPrd_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClassIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBandClassIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBandClassIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ImsiTSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsiTSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsiTSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReconnectMsgInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsReconnectMsgInd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsReconnectMsgInd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LtmOff", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsLtmOff(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsLtmOff_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxNumAltSo", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMaxNumAltSo(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMaxNumAltSo_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZoneTimer", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsZoneTimer(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsZoneTimer_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PRev", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPRev(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPRev_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultSids", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultSids(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultSids_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZoneTimerIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsZoneTimerIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsZoneTimerIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RerModeSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRerModeSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRerModeSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NidIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsNidIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsNidIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystListLen", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzHystListLen(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzHystListLen_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAddServInstance", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMaxAddServInstance(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMaxAddServInstance_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAddServInstanceIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMaxAddServInstanceIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMaxAddServInstanceIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsgIntegritySupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsgIntegritySupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsgIntegritySupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsFpcFchIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsFpcFchIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TkzModeSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTkzModeSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTkzModeSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ExtPrefMsidType", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsExtPrefMsidType(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsExtPrefMsidType_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotReport", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotReport(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotReport_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AltBandClass", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsAltBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsAltBandClass_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegZoneIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRegZoneIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRegZoneIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySup", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsSigIntegritySup(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsSigIntegritySup_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalZonesIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTotalZonesIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTotalZonesIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalZones", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsTotalZones(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsTotalZones_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzIdHystParametersIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzIdHystParametersIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzIdHystParametersIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxNumAltSoIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMaxNumAltSoIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMaxNumAltSoIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GcsnaSequenceContextTimerIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsGcsnaSequenceContextTimerIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsGcsnaSequenceContextTimerIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BypassRegInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsBypassRegInd(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsBypassRegInd_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotIncIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotIncIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotIncIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Nid", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsNid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsNid_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrefMsidType", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPrefMsidType(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPrefMsidType_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TkzId", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTkzId(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTkzId_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncryptMode", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsEncryptMode(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsEncryptMode_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReconnectMsgIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsReconnectMsgIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsReconnectMsgIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoFcsoAllowed", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsAutoFcsoAllowed(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsAutoFcsoAllowed_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystTimerExp", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPzHystTimerExp(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPzHystTimerExp_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupInclIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupInclIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupInclIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BypassRegIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBypassRegIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBypassRegIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Auth", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsAuth(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsAuth_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegDist", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsRegDist(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsRegDist_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RerModeSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRerModeSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRerModeSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinPRev", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMinPRev(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMinPRev_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsEncSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsEncSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayLt", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsDayLt(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsDayLt_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClassInfoReqIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBandClassInfoReqIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBandClassInfoReqIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeidReqdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMeidReqdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMeidReqdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NegSlotCycleIndexSupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsgIntegritySup", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsgIntegritySup(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsgIntegritySup_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsInitPosLocSupIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsInitPosLocSupIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsInitPosLocSupIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SidIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSidIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSidIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ExtPrefMsidTypeIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsExtPrefMsidTypeIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsExtPrefMsidTypeIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MobQos", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMobQos(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMobQos_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForSidRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForSidRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForSidRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TkzModeSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTkzModeSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTkzModeSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystActTimer", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPzHystActTimer(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPzHystActTimer_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MccIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMccIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMccIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForNidRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForNidRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForNidRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sid", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsSid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsSid_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegDistIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRegDistIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRegDistIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegZone", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsRegZone(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsRegZone_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystEnabled", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzHystEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzHystEnabled_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultSidsIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultSidsIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultSidsIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketZoneId", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsPacketZoneId(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsPacketZoneId_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LpSecIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsLpSecIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsLpSecIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForSidReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForSidReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForSidReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeidReqd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMeidReqd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMeidReqd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerUpReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerUpReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerUpReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Imsi1112", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsImsi1112(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsImsi1112_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NegSlotCycleIndexSup", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsNegSlotCycleIndexSup(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsNegSlotCycleIndexSup_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncryptModeIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsEncryptModeIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsEncryptModeIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerDownReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerDownReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerDownReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystInfoIncl", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzHystInfoIncl(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzHystInfoIncl_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinPRevIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMinPRevIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMinPRevIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoFcsoAllowedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsAutoFcsoAllowedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsAutoFcsoAllowedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TAddIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTAddIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTAddIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PRevIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPRevIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPRevIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TAdd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsTAdd(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsTAdd_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QhystSfMedium", scope = MobilityIdleIntraFreqWs.class)
    public JAXBElement<String> createMobilityIdleIntraFreqWsQhystSfMedium(String value) {
        return new JAXBElement<String>(_MobilityIdleIntraFreqWsQhystSfMedium_QNAME, String.class, MobilityIdleIntraFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QhystSfMediumIsDefault", scope = MobilityIdleIntraFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleIntraFreqWsQhystSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleIntraFreqWsQhystSfMediumIsDefault_QNAME, Boolean.class, MobilityIdleIntraFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QhystSfHighIsDefault", scope = MobilityIdleIntraFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleIntraFreqWsQhystSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleIntraFreqWsQhystSfHighIsDefault_QNAME, Boolean.class, MobilityIdleIntraFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QhystSfHigh", scope = MobilityIdleIntraFreqWs.class)
    public JAXBElement<String> createMobilityIdleIntraFreqWsQhystSfHigh(String value) {
        return new JAXBElement<String>(_MobilityIdleIntraFreqWsQhystSfHigh_QNAME, String.class, MobilityIdleIntraFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarketId", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsMarketId(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsMarketId_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsArfcn(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsArfcn_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClass", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsBandClass_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsCellID(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsCellID_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SwitchNum", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsSwitchNum(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsSwitchNum_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SectorNumber", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsSectorNumber(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsSectorNumber_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NodeCellNumber", scope = LteAddNeighbourForCellWs.class)
    public JAXBElement<Integer> createLteAddNeighbourForCellWsNodeCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteAddNeighbourForCellWsNodeCellNumber_QNAME, Integer.class, LteAddNeighbourForCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourCellNumber", scope = LteAddNeighbourForCellWs.class)
    public JAXBElement<Integer> createLteAddNeighbourForCellWsNeighbourCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteAddNeighbourForCellWsNeighbourCellNumber_QNAME, Integer.class, LteAddNeighbourForCellWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SibsGranularityIsDefault", scope = CellCallTraceWs.class)
    public JAXBElement<Boolean> createCellCallTraceWsSibsGranularityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellCallTraceWsSibsGranularityIsDefault_QNAME, Boolean.class, CellCallTraceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SibsGranularity", scope = CellCallTraceWs.class)
    public JAXBElement<Integer> createCellCallTraceWsSibsGranularity(Integer value) {
        return new JAXBElement<Integer>(_CellCallTraceWsSibsGranularity_QNAME, Integer.class, CellCallTraceWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaysOfWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayOfWeek", scope = YearlyOption2 .class)
    public JAXBElement<DaysOfWeek> createYearlyOption2DayOfWeek(DaysOfWeek value) {
        return new JAXBElement<DaysOfWeek>(_YearlyOption2DayOfWeek_QNAME, DaysOfWeek.class, YearlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Month", scope = YearlyOption2 .class)
    public JAXBElement<Integer> createYearlyOption2Month(Integer value) {
        return new JAXBElement<Integer>(_YearlyOption1Month_QNAME, Integer.class, YearlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "XStart", scope = YearlyOption2 .class)
    public JAXBElement<Integer> createYearlyOption2XStart(Integer value) {
        return new JAXBElement<Integer>(_YearlyOption2XStart_QNAME, Integer.class, YearlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlState", scope = LteAddNeighbourWs.class)
    public JAXBElement<X2ControlStateTypes> createLteAddNeighbourWsX2ControlState(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAddNeighbourWsX2ControlState_QNAME, X2ControlStateTypes.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetRange", scope = LteAddNeighbourWs.class)
    public JAXBElement<String> createLteAddNeighbourWsQOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsQOffsetRange_QNAME, String.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIndividualOffsetRange", scope = LteAddNeighbourWs.class)
    public JAXBElement<String> createLteAddNeighbourWsCellIndividualOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsCellIndividualOffsetRange_QNAME, String.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStaticNeighbour", scope = LteAddNeighbourWs.class)
    public JAXBElement<Boolean> createLteAddNeighbourWsIsStaticNeighbour(Boolean value) {
        return new JAXBElement<Boolean>(_LteAddNeighbourWsIsStaticNeighbour_QNAME, Boolean.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoControlState", scope = LteAddNeighbourWs.class)
    public JAXBElement<HoControlStateTypes> createLteAddNeighbourWsHoControlState(HoControlStateTypes value) {
        return new JAXBElement<HoControlStateTypes>(_LteAddNeighbourWsHoControlState_QNAME, HoControlStateTypes.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = LteAddNeighbourWs.class)
    public JAXBElement<HandoverType> createLteAddNeighbourWsHandoverType(HandoverType value) {
        return new JAXBElement<HandoverType>(_LteAddNeighbourWsHandoverType_QNAME, HandoverType.class, LteAddNeighbourWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OnDurationTimer", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsOnDurationTimer(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsOnDurationTimer_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxRetransmissionTimerIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsDrxRetransmissionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsDrxRetransmissionTimerIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxInactivityTimerIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsDrxInactivityTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsDrxInactivityTimerIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrMeasuringUesThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsAnrMeasuringUesThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsAnrMeasuringUesThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfPciToQueryForCgi", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsNumberOfPciToQueryForCgi(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsNumberOfPciToQueryForCgi_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OnDurationTimerIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsOnDurationTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsOnDurationTimerIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LongDrxCycleIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsLongDrxCycleIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsLongDrxCycleIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxRetransmissionTimer", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsDrxRetransmissionTimer(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsDrxRetransmissionTimer_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CgiRsrpIntraFreqThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsCgiRsrpIntraFreqThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsCgiRsrpIntraFreqThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportIntervalIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsReportIntervalIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CgiRsrpIntraFreqThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsCgiRsrpIntraFreqThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsCgiRsrpIntraFreqThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrMeasuringUesThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsAnrMeasuringUesThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsAnrMeasuringUesThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CgiReportMcsThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsCgiReportMcsThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsCgiReportMcsThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmount", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsReportAmount(String value) {
        return new JAXBElement<String>(_MobilityConnectedQosWsReportAmount_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NghRemoveThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsNghRemoveThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsNghRemoveThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportInterval", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsReportInterval(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsReportInterval_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoAttemptsThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsHoAttemptsThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsHoAttemptsThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoAttemptsThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsHoAttemptsThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsHoAttemptsThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LongDrxCycle", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsLongDrxCycle(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsLongDrxCycle_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPiMetric", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsInitialPiMetric(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsInitialPiMetric_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsRsrpThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsRsrpThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCells", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsMaxReportCells(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedQosWsMaxReportCells_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsRsrpThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsRsrpThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPiMetricIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsInitialPiMetricIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsInitialPiMetricIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmountIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsReportAmountIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsReportAmountIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CgiReportMcsThresholdIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsCgiReportMcsThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsCgiReportMcsThresholdIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfPciToQueryForCgiIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsNumberOfPciToQueryForCgiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsNumberOfPciToQueryForCgiIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxInactivityTimer", scope = CellNeighborManagementWs.class)
    public JAXBElement<String> createCellNeighborManagementWsDrxInactivityTimer(String value) {
        return new JAXBElement<String>(_CellNeighborManagementWsDrxInactivityTimer_QNAME, String.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NghRemoveThreshold", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsNghRemoveThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsNghRemoveThreshold_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCellsIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsMaxReportCellsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedQosWsMaxReportCellsIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpProfileType", scope = EnbSyncProfileParams.class)
    public JAXBElement<ProfileTypeValues> createEnbSyncProfileParamsPtpProfileType(ProfileTypeValues value) {
        return new JAXBElement<ProfileTypeValues>(_EnbSyncProfileParamsPtpProfileType_QNAME, ProfileTypeValues.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryMasterDomain", scope = EnbSyncProfileParams.class)
    public JAXBElement<Integer> createEnbSyncProfileParamsSecondaryMasterDomain(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfileParamsSecondaryMasterDomain_QNAME, Integer.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryMasterDomain", scope = EnbSyncProfileParams.class)
    public JAXBElement<Integer> createEnbSyncProfileParamsPrimaryMasterDomain(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfileParamsPrimaryMasterDomain_QNAME, Integer.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnnounceRateInMsgPerSec", scope = EnbSyncProfileParams.class)
    public JAXBElement<String> createEnbSyncProfileParamsAnnounceRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileParamsAnnounceRateInMsgPerSec_QNAME, String.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryClockSource", scope = EnbSyncProfileParams.class)
    public JAXBElement<ClockSources> createEnbSyncProfileParamsPrimaryClockSource(ClockSources value) {
        return new JAXBElement<ClockSources>(_EnbSyncProfileParamsPrimaryClockSource_QNAME, ClockSources.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GnssMode", scope = EnbSyncProfileParams.class)
    public JAXBElement<SyncProfileGnssModes> createEnbSyncProfileParamsGnssMode(SyncProfileGnssModes value) {
        return new JAXBElement<SyncProfileGnssModes>(_EnbSyncProfileParamsGnssMode_QNAME, SyncProfileGnssModes.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DelayRequestResponseRateInMsgPerSec", scope = EnbSyncProfileParams.class)
    public JAXBElement<String> createEnbSyncProfileParamsDelayRequestResponseRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileParamsDelayRequestResponseRateInMsgPerSec_QNAME, String.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LeaseDurationInSec", scope = EnbSyncProfileParams.class)
    public JAXBElement<Integer> createEnbSyncProfileParamsLeaseDurationInSec(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfileParamsLeaseDurationInSec_QNAME, Integer.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncRateInMsgPerSec", scope = EnbSyncProfileParams.class)
    public JAXBElement<String> createEnbSyncProfileParamsSyncRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileParamsSyncRateInMsgPerSec_QNAME, String.class, EnbSyncProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VlanPcp", scope = LteUlPktDataPriorityEntryWs.class)
    public JAXBElement<Integer> createLteUlPktDataPriorityEntryWsVlanPcp(Integer value) {
        return new JAXBElement<Integer>(_LteUlPktDataPriorityEntryWsVlanPcp_QNAME, Integer.class, LteUlPktDataPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dscp", scope = LteUlPktDataPriorityEntryWs.class)
    public JAXBElement<Integer> createLteUlPktDataPriorityEntryWsDscp(Integer value) {
        return new JAXBElement<Integer>(_LteUlPktDataPriorityEntryWsDscp_QNAME, Integer.class, LteUlPktDataPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnPMax_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<String> createMobilityIdleModeInterFreqQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterFreqIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevelMin", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqQRxLevelMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQRxLevelMin_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowP", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXLowP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowP_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnTReselectionEutra_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighQr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXHighQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighQr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighP", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXHighP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighP_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowQr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXLowQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowQr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQQualMinr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterFreqIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<String> createMobilityIdleModeInterFreqCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnCellReselectionPriority_QNAME, String.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedMeasurementBandwidthIsDefault", scope = MobilityIdleInterFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleInterFreqWsAllowedMeasurementBandwidthIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleInterFreqWsAllowedMeasurementBandwidthIsDefault_QNAME, Boolean.class, MobilityIdleInterFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedMeasurementBandwidth", scope = MobilityIdleInterFreqWs.class)
    public JAXBElement<String> createMobilityIdleInterFreqWsAllowedMeasurementBandwidth(String value) {
        return new JAXBElement<String>(_MobilityIdleInterFreqWsAllowedMeasurementBandwidth_QNAME, String.class, MobilityIdleInterFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OsgMinTxPower", scope = DlTxOpt.class)
    public JAXBElement<Integer> createDlTxOptOsgMinTxPower(Integer value) {
        return new JAXBElement<Integer>(_DlTxOptOsgMinTxPower_QNAME, Integer.class, DlTxOpt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OsgMaxTxPower", scope = DlTxOpt.class)
    public JAXBElement<Integer> createDlTxOptOsgMaxTxPower(Integer value) {
        return new JAXBElement<Integer>(_DlTxOptOsgMaxTxPower_QNAME, Integer.class, DlTxOpt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity28Bit", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsCellIdentity28Bit(Integer value) {
        return new JAXBElement<Integer>(_LteCellGetWsCellIdentity28Bit_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DataAccessBarringTimeInSec", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsDataAccessBarringTimeInSec(String value) {
        return new JAXBElement<String>(_LteCellSetWsDataAccessBarringTimeInSec_QNAME, String.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass13Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass13Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEmergencyAccessBarred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsEmergencyAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsEmergencyAccessBarred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass12Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass12Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass14Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass14Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass14Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessBarred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessBarred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAccessClassBarred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsAccessClassBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsAccessClassBarred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass11Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass11Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackingAreaCode", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsTrackingAreaCode(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsTrackingAreaCode_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DataAccessBarringFactor", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsDataAccessBarringFactor(String value) {
        return new JAXBElement<String>(_LteCellSetWsDataAccessBarringFactor_QNAME, String.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsEnabled", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsEnabled_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass12Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass12Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalCellId", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellGetWsPhysicalCellId_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalingAccessBarringFactor", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsSignalingAccessBarringFactor(String value) {
        return new JAXBElement<String>(_LteCellSetWsSignalingAccessBarringFactor_QNAME, String.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerIdentity_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalingAccessBarringTimeInSec", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsSignalingAccessBarringTimeInSec(String value) {
        return new JAXBElement<String>(_LteCellSetWsSignalingAccessBarringTimeInSec_QNAME, String.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyAreaId", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsEmergencyAreaId(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsEmergencyAreaId_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass11Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass11Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachFreqOffset_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass14Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass14Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass14Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessBarred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessBarred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass15Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass15Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerCellGroup_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass15Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass15Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsCellID(String value) {
        return new JAXBElement<String>(_LteCellSetWsCellID_QNAME, String.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachRsi", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPrachRsi(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachRsi_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass13Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass13Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedMeasurementBandwidthIsDefault", scope = MobilityConnectedInterWs.class)
    public JAXBElement<Boolean> createMobilityConnectedInterWsAllowedMeasurementBandwidthIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleInterFreqWsAllowedMeasurementBandwidthIsDefault_QNAME, Boolean.class, MobilityConnectedInterWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowedMeasurementBandwidth", scope = MobilityConnectedInterWs.class)
    public JAXBElement<String> createMobilityConnectedInterWsAllowedMeasurementBandwidth(String value) {
        return new JAXBElement<String>(_MobilityIdleInterFreqWsAllowedMeasurementBandwidth_QNAME, String.class, MobilityConnectedInterWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci5Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci5Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci5Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeQosFreqTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci6Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci6Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci6Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci7Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci7Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci7Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci1", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci1(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci1_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci2", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci2(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci2_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeQosFreqA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeQosFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci5", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci5(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci5_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci6", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci6(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci6_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci3", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci3(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci3_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci4", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci4(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci4_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci9", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci9(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci9_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci7", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci7(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci7_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci3Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci3Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci3Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci8", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci8(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci8_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci4Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci4Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci4Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci2Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci2Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci2Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci1Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci1Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci1Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeQosFreqHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci9Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci9Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci9Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci8Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci8Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci8Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeQosFreqEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeQosFreqRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<String> createMobilityConnectedModeQosFreqTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeQosFreqRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeQosFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeEarfcnTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<String> createMobilityConnectedModeEarfcnQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeEarfcnA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeQosFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeEarfcnEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<Integer> createMobilityConnectedModeEarfcnRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<String> createMobilityConnectedModeEarfcnTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<Integer> createMobilityConnectedModeEarfcnRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeQosFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseDefault", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<Boolean> createMobilityConnectedModeEarfcnUseDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeEarfcnUseDefault_QNAME, Boolean.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlEarfcn", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<Integer> createMobilityConnectedModeEarfcnDlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnDlEarfcn_QNAME, Integer.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowX2NrtUpdate", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<Boolean> createMobilityConnectedModeEarfcnAllowX2NrtUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeEarfcnAllowX2NrtUpdate_QNAME, Boolean.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeEarfcn.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeEarfcnHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeEarfcn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnPMax_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<String> createMobilityIdleModeInterBandQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnTReselectionEutra_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighP", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandThreshXHighP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighP_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowQr9", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandThreshXLowQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowQr9_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQQualMinr9_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterBandIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterBandIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterEarfcnIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevelMin", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandQRxLevelMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnQRxLevelMin_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowP", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandThreshXLowP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXLowP_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighQr9", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandThreshXHighQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnThreshXHighQr9_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<Integer> createMobilityIdleModeInterBandBand(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterBandBand_QNAME, Integer.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeInterBand.class)
    public JAXBElement<String> createMobilityIdleModeInterBandCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnCellReselectionPriority_QNAME, String.class, MobilityIdleModeInterBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciEnd", scope = PciRange.class)
    public JAXBElement<Integer> createPciRangePciEnd(Integer value) {
        return new JAXBElement<Integer>(_PciRangePciEnd_QNAME, Integer.class, PciRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciStart", scope = PciRange.class)
    public JAXBElement<Integer> createPciRangePciStart(Integer value) {
        return new JAXBElement<Integer>(_PciRangePciStart_QNAME, Integer.class, PciRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaysOfWeek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayOfWeek", scope = MonthlyOption2 .class)
    public JAXBElement<DaysOfWeek> createMonthlyOption2DayOfWeek(DaysOfWeek value) {
        return new JAXBElement<DaysOfWeek>(_YearlyOption2DayOfWeek_QNAME, DaysOfWeek.class, MonthlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Start", scope = MonthlyOption2 .class)
    public JAXBElement<Integer> createMonthlyOption2Start(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOption2Start_QNAME, Integer.class, MonthlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryYMonth", scope = MonthlyOption2 .class)
    public JAXBElement<Integer> createMonthlyOption2EveryYMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOption2EveryYMonth_QNAME, Integer.class, MonthlyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryDuplexMode", scope = UtranProfile.class)
    public JAXBElement<UtranDuplexModes> createUtranProfileSecondaryDuplexMode(UtranDuplexModes value) {
        return new JAXBElement<UtranDuplexModes>(_UtranProfileSecondaryDuplexMode_QNAME, UtranDuplexModes.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryArfcn", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfileSecondaryArfcn(Integer value) {
        return new JAXBElement<Integer>(_UtranProfileSecondaryArfcn_QNAME, Integer.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtranDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryDuplexMode", scope = UtranProfile.class)
    public JAXBElement<UtranDuplexModes> createUtranProfilePrimaryDuplexMode(UtranDuplexModes value) {
        return new JAXBElement<UtranDuplexModes>(_UtranProfilePrimaryDuplexMode_QNAME, UtranDuplexModes.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryArfcnBand", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfileSecondaryArfcnBand(Integer value) {
        return new JAXBElement<Integer>(_UtranProfileSecondaryArfcnBand_QNAME, Integer.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryArfcn", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfilePrimaryArfcn(Integer value) {
        return new JAXBElement<Integer>(_UtranProfilePrimaryArfcn_QNAME, Integer.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtranEnabled", scope = UtranProfile.class)
    public JAXBElement<Boolean> createUtranProfileUtranEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_UtranProfileUtranEnabled_QNAME, Boolean.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryArfcnBand", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfilePrimaryArfcnBand(Integer value) {
        return new JAXBElement<Integer>(_UtranProfilePrimaryArfcnBand_QNAME, Integer.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = UtranProfile.class)
    public JAXBElement<CategoriesLte> createUtranProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellEfficiencyFactorIsDefault", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<Boolean> createUplinkLinkAdaptationWsCellEfficiencyFactorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkLinkAdaptationWsCellEfficiencyFactorIsDefault_QNAME, Boolean.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkEfficiencyModeIsDefault", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<Boolean> createUplinkLinkAdaptationWsUplinkEfficiencyModeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkLinkAdaptationWsUplinkEfficiencyModeIsDefault_QNAME, Boolean.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetMcsIsDefault", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<Boolean> createUplinkLinkAdaptationWsTargetMcsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkLinkAdaptationWsTargetMcsIsDefault_QNAME, Boolean.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetMcs", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<Integer> createUplinkLinkAdaptationWsTargetMcs(Integer value) {
        return new JAXBElement<Integer>(_UplinkLinkAdaptationWsTargetMcs_QNAME, Integer.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellEfficiencyFactor", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<Integer> createUplinkLinkAdaptationWsCellEfficiencyFactor(Integer value) {
        return new JAXBElement<Integer>(_UplinkLinkAdaptationWsCellEfficiencyFactor_QNAME, Integer.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfficiencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkEfficiencyMode", scope = UplinkLinkAdaptationWs.class)
    public JAXBElement<EfficiencyType> createUplinkLinkAdaptationWsUplinkEfficiencyMode(EfficiencyType value) {
        return new JAXBElement<EfficiencyType>(_UplinkLinkAdaptationWsUplinkEfficiencyMode_QNAME, EfficiencyType.class, UplinkLinkAdaptationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2GuardPeriod", scope = NeighborManagementWs.class)
    public JAXBElement<Integer> createNeighborManagementWsX2GuardPeriod(Integer value) {
        return new JAXBElement<Integer>(_NeighborManagementWsX2GuardPeriod_QNAME, Integer.class, NeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2GuardPeriodIsDefault", scope = NeighborManagementWs.class)
    public JAXBElement<Boolean> createNeighborManagementWsX2GuardPeriodIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NeighborManagementWsX2GuardPeriodIsDefault_QNAME, Boolean.class, NeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedOption", scope = RecurrenceMonthly.class)
    public JAXBElement<RecurrenceOptions> createRecurrenceMonthlySelectedOption(RecurrenceOptions value) {
        return new JAXBElement<RecurrenceOptions>(_RecurrenceDailySelectedOption_QNAME, RecurrenceOptions.class, RecurrenceMonthly.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTs1ReloCprep", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsSourceTs1ReloCprep(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsSourceTs1ReloCprep_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketForwardingEnabled", scope = HandoverWs.class)
    public JAXBElement<EnabledDisabledStates> createHandoverWsPacketForwardingEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_HandoverWsPacketForwardingEnabled_QNAME, EnabledDisabledStates.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketForwardingEnabledIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsPacketForwardingEnabledIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsPacketForwardingEnabledIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTx2ReloCprepIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsSourceTx2ReloCprepIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsSourceTx2ReloCprepIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTx2ReloCprep", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsSourceTx2ReloCprep(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsSourceTx2ReloCprep_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetFwhoContextFetchTimer", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsTargetFwhoContextFetchTimer(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsTargetFwhoContextFetchTimer_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTx2ReloCoverall", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsSourceTx2ReloCoverall(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsSourceTx2ReloCoverall_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowHoWithoutHrl", scope = HandoverWs.class)
    public JAXBElement<EnabledDisabledStates> createHandoverWsAllowHoWithoutHrl(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_HandoverWsAllowHoWithoutHrl_QNAME, EnabledDisabledStates.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetFwhoContextFetchTimerIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsTargetFwhoContextFetchTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsTargetFwhoContextFetchTimerIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTx2ReloCoverallIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsSourceTx2ReloCoverallIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsSourceTx2ReloCoverallIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTs1ReloCoverall", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsSourceTs1ReloCoverall(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsSourceTs1ReloCoverall_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTs1ReloCoverallIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsSourceTs1ReloCoverallIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsSourceTs1ReloCoverallIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowHoWithoutHrlIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsAllowHoWithoutHrlIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsAllowHoWithoutHrlIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SourceTs1ReloCprepIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsSourceTs1ReloCprepIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsSourceTs1ReloCprepIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetX2S1RelocExecutionTimerIsDefault", scope = HandoverWs.class)
    public JAXBElement<Boolean> createHandoverWsTargetX2S1RelocExecutionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_HandoverWsTargetX2S1RelocExecutionTimerIsDefault_QNAME, Boolean.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetX2S1RelocExecutionTimer", scope = HandoverWs.class)
    public JAXBElement<Integer> createHandoverWsTargetX2S1RelocExecutionTimer(Integer value) {
        return new JAXBElement<Integer>(_HandoverWsTargetX2S1RelocExecutionTimer_QNAME, Integer.class, HandoverWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryXDay", scope = DailyOption1 .class)
    public JAXBElement<Integer> createDailyOption1EveryXDay(Integer value) {
        return new JAXBElement<Integer>(_DailyOption1EveryXDay_QNAME, Integer.class, DailyOption1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbAdvancedProfile.class)
    public JAXBElement<CategoriesLte> createEnbAdvancedProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbAdvancedProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpPort", scope = AuPnpSnmpDetailWs.class)
    public JAXBElement<Integer> createAuPnpSnmpDetailWsSnmpPort(Integer value) {
        return new JAXBElement<Integer>(_PnpDetailWsSnmpPort_QNAME, Integer.class, AuPnpSnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpTimeoutInMilliSec", scope = AuPnpSnmpDetailWs.class)
    public JAXBElement<Double> createAuPnpSnmpDetailWsSnmpTimeoutInMilliSec(Double value) {
        return new JAXBElement<Double>(_PnpDetailWsSnmpTimeoutInMilliSec_QNAME, Double.class, AuPnpSnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnmpAgentVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SnmpVersion", scope = AuPnpSnmpDetailWs.class)
    public JAXBElement<SnmpAgentVersion> createAuPnpSnmpDetailWsSnmpVersion(SnmpAgentVersion value) {
        return new JAXBElement<SnmpAgentVersion>(_PnpDetailWsSnmpVersion_QNAME, SnmpAgentVersion.class, AuPnpSnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Snmpv3AccessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snmpv3Access", scope = AuPnpSnmpDetailWs.class)
    public JAXBElement<Snmpv3AccessTypes> createAuPnpSnmpDetailWsSnmpv3Access(Snmpv3AccessTypes value) {
        return new JAXBElement<Snmpv3AccessTypes>(_PnpDetailWsSnmpv3Access_QNAME, Snmpv3AccessTypes.class, AuPnpSnmpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PerQciStatsIsEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<Boolean> createEnbManagementProfilePerQciStatsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbManagementProfilePerQciStatsIsEnabled_QNAME, Boolean.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PerMcsStatsIsEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<Boolean> createEnbManagementProfilePerMcsStatsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbManagementProfilePerMcsStatsIsEnabled_QNAME, Boolean.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PerTargetCellStatsIsEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<Boolean> createEnbManagementProfilePerTargetCellStatsIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbManagementProfilePerTargetCellStatsIsEnabled_QNAME, Boolean.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrStatusCollectionIsEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<Boolean> createEnbManagementProfileAnrStatusCollectionIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbManagementProfileAnrStatusCollectionIsEnabled_QNAME, Boolean.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsCollectionIsEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<Boolean> createEnbManagementProfileStatsCollectionIsEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbManagementProfileStatsCollectionIsEnabled_QNAME, Boolean.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = EnbManagementProfile.class)
    public JAXBElement<String> createEnbManagementProfileGranularityPeriod(String value) {
        return new JAXBElement<String>(_EnbManagementProfileGranularityPeriod_QNAME, String.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbManagementProfile.class)
    public JAXBElement<CategoriesLte> createEnbManagementProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<String> createMobilityGeranReselectionPriorityEntryWsPriority(String value) {
        return new JAXBElement<String>(_MobilityGeranReselectionPriorityEntryWsPriority_QNAME, String.class, MobilityGeranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<Integer> createMobilityGeranReselectionPriorityEntryWsArfcn(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsArfcn_QNAME, Integer.class, MobilityGeranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<Bands> createMobilityGeranReselectionPriorityEntryWsBand(Bands value) {
        return new JAXBElement<Bands>(_MobilityIdleModeInterBandBand_QNAME, Bands.class, MobilityGeranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionVulnerability", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallWsPreemptionVulnerability(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallWsPreemptionVulnerability_QNAME, EnabledDisabledStates.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyResetTimeoutTimer", scope = EmergencyCallWs.class)
    public JAXBElement<Integer> createEmergencyCallWsEmergencyResetTimeoutTimer(Integer value) {
        return new JAXBElement<Integer>(_EmergencyCallWsEmergencyResetTimeoutTimer_QNAME, Integer.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyCallTimerIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsEmergencyCallTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsEmergencyCallTimerIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionCapability", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledStates> createEmergencyCallWsPreemptionCapability(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EmergencyCallWsPreemptionCapability_QNAME, EnabledDisabledStates.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HighestArp", scope = EmergencyCallWs.class)
    public JAXBElement<Integer> createEmergencyCallWsHighestArp(Integer value) {
        return new JAXBElement<Integer>(_EmergencyCallWsHighestArp_QNAME, Integer.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionVulnerabilityIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsPreemptionVulnerabilityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsPreemptionVulnerabilityIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HighestArpIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsHighestArpIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsHighestArpIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionCapabilityIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsPreemptionCapabilityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsPreemptionCapabilityIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyResetTimeoutTimerIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsEmergencyResetTimeoutTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsEmergencyResetTimeoutTimerIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyCheckIntervalTimerIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsEmergencyCheckIntervalTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsEmergencyCheckIntervalTimerIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyCheckIntervalTimer", scope = EmergencyCallWs.class)
    public JAXBElement<Integer> createEmergencyCallWsEmergencyCheckIntervalTimer(Integer value) {
        return new JAXBElement<Integer>(_EmergencyCallWsEmergencyCheckIntervalTimer_QNAME, Integer.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyCallTimer", scope = EmergencyCallWs.class)
    public JAXBElement<Integer> createEmergencyCallWsEmergencyCallTimer(Integer value) {
        return new JAXBElement<Integer>(_EmergencyCallWsEmergencyCallTimer_QNAME, Integer.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrencePatterns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedRecurrence", scope = Recurrence.class)
    public JAXBElement<RecurrencePatterns> createRecurrenceSelectedRecurrence(RecurrencePatterns value) {
        return new JAXBElement<RecurrencePatterns>(_RecurrenceSelectedRecurrence_QNAME, RecurrencePatterns.class, Recurrence.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = AuPnpDetailWs.class)
    public JAXBElement<BigDecimal> createAuPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, AuPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatLongRadius", scope = AuPnpDetailWs.class)
    public JAXBElement<Integer> createAuPnpDetailWsPnpLatLongRadius(Integer value) {
        return new JAXBElement<Integer>(_PnpDetailWsPnpLatLongRadius_QNAME, Integer.class, AuPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = AuPnpDetailWs.class)
    public JAXBElement<BigDecimal> createAuPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, AuPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSwScheduled", scope = AuPnpDetailWs.class)
    public JAXBElement<Boolean> createAuPnpDetailWsIsSwScheduled(Boolean value) {
        return new JAXBElement<Boolean>(_AuPnpDetailWsIsSwScheduled_QNAME, Boolean.class, AuPnpDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaPreambleMsg3", scope = CellPuschWs.class)
    public JAXBElement<String> createCellPuschWsDeltaPreambleMsg3(String value) {
        return new JAXBElement<String>(_CellPuschWsDeltaPreambleMsg3_QNAME, String.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaPreambleMsg3IsDefault", scope = CellPuschWs.class)
    public JAXBElement<Boolean> createCellPuschWsDeltaPreambleMsg3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPuschWsDeltaPreambleMsg3IsDefault_QNAME, Boolean.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Alpha", scope = CellPuschWs.class)
    public JAXBElement<String> createCellPuschWsAlpha(String value) {
        return new JAXBElement<String>(_CellPuschWsAlpha_QNAME, String.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPuschIsDefault", scope = CellPuschWs.class)
    public JAXBElement<Boolean> createCellPuschWsP0NominalPuschIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPuschWsP0NominalPuschIsDefault_QNAME, Boolean.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AlphaIsDefault", scope = CellPuschWs.class)
    public JAXBElement<Boolean> createCellPuschWsAlphaIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPuschWsAlphaIsDefault_QNAME, Boolean.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPusch", scope = CellPuschWs.class)
    public JAXBElement<Integer> createCellPuschWsP0NominalPusch(Integer value) {
        return new JAXBElement<Integer>(_CellPuschWsP0NominalPusch_QNAME, Integer.class, CellPuschWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCSonServer", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForCSonServer(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCSonServer_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min20MHzChannel", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpMin20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin20MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max20MHzChannel", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpMax20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax20MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LedModeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedMode", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<LedModeValues> createLteEnbDetailsSetWsPnpLedMode(LedModeValues value) {
        return new JAXBElement<LedModeValues>(_EnbDetailsGetPnpLedMode_QNAME, LedModeValues.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpAltitude(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpAltitude_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1InterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsM1InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM1InterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2U", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForX2U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2U_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAutoX2ControlForNeighboursEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Boolean> createLteEnbDetailsSetWsPnpIsAutoX2ControlForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsAutoX2ControlForNeighboursEnabled_QNAME, Boolean.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsS1UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1UInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsX2UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2UInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ENodeBID", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpENodeBID(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpENodeBID_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonServerInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsCSonServerInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCSonServerInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2ConfigurationUpdateForNeighboursEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Boolean> createLteEnbDetailsSetWsPnpIsX2ConfigurationUpdateForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsX2ConfigurationUpdateForNeighboursEnabled_QNAME, Boolean.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveAntenna", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpActiveAntenna(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpActiveAntenna_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1C", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForS1C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1C_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<BigDecimal> createLteEnbDetailsSetWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLongitude_QNAME, BigDecimal.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max40MHzChannel", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpMax40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax40MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellToUseValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellToUse", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<CellToUseValues> createLteEnbDetailsSetWsPnpCellToUse(CellToUseValues value) {
        return new JAXBElement<CellToUseValues>(_EnbDetailsGetPnpCellToUse_QNAME, CellToUseValues.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpSlaveInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsPtpSlaveInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsPtpSlaveInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM2", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForM2(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM2_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM1", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForM1(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM1_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2C", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForX2C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2C_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min40MHzChannel", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsPnpMin40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin40MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCallTraceInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsCallTraceInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCallTraceInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1U", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForS1U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1U_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2InterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsM2InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM2InterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsS1CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1CInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForPtpSlave", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForPtpSlave(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForPtpSlave_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCallTrace", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<String> createLteEnbDetailsSetWsPnpInterfaceToUseForCallTrace(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCallTrace_QNAME, String.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<BigDecimal> createLteEnbDetailsSetWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLatitude_QNAME, BigDecimal.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CInterfaceEnabled", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<EnabledDisabledStates> createLteEnbDetailsSetWsPnpIsX2CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2CInterfaceEnabled_QNAME, EnabledDisabledStates.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultX2ControlStateForNeighbours", scope = LteEnbDetailsSetWsPnp.class)
    public JAXBElement<X2ControlStateTypes> createLteEnbDetailsSetWsPnpDefaultX2ControlStateForNeighbours(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_EnbDetailsGetPnpDefaultX2ControlStateForNeighbours_QNAME, X2ControlStateTypes.class, LteEnbDetailsSetWsPnp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S9PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS9PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS9PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S11PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS11PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS11PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S9Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS9Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS9Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pmax", scope = Sib1Ws.class)
    public JAXBElement<Integer> createSib1WsPmax(Integer value) {
        return new JAXBElement<Integer>(_Sib1WsPmax_QNAME, Integer.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S11Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS11Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS11Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S4Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS4Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS4Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S6PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS6PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS6PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiWindowLength", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsSiWindowLength(String value) {
        return new JAXBElement<String>(_Sib1WsSiWindowLength_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S4PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS4PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS4PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S12Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS12Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS12Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S10Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS10Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS10Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QqualMinValue", scope = Sib1Ws.class)
    public JAXBElement<Integer> createSib1WsQqualMinValue(Integer value) {
        return new JAXBElement<Integer>(_Sib1WsQqualMinValue_QNAME, Integer.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QrxLevMin", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsQrxLevMin(String value) {
        return new JAXBElement<String>(_Sib1WsQrxLevMin_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PmaxIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsPmaxIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsPmaxIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S3PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS3PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS3PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S8Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS8Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS8Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S12PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS12PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS12PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S5Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS5Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS5Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S8PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS8PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS8PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S13Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS13Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS13Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QqualMinOffsetIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsQqualMinOffsetIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsQqualMinOffsetIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QqualMinValueIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsQqualMinValueIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsQqualMinValueIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QrxLevMinIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsQrxLevMinIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsQrxLevMinIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S7Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS7Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS7Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QqualMinOffset", scope = Sib1Ws.class)
    public JAXBElement<Integer> createSib1WsQqualMinOffset(Integer value) {
        return new JAXBElement<Integer>(_Sib1WsQqualMinOffset_QNAME, Integer.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S2Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS2Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS2Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S6Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS6Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS6Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S10PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS10PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS10PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S5PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS5PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS5PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiWindowLengthIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsSiWindowLengthIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsSiWindowLengthIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S13PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS13PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS13PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S3Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS3Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS3Periodicity_QNAME, String.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S7PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS7PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS7PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S2PeriodicityIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsS2PeriodicityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsS2PeriodicityIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1MediumThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsS1MediumThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsS1MediumThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1HighThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsS1HighThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsS1HighThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1HighThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsS1HighThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsS1HighThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwMediumThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsHwMediumThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsHwMediumThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci9IsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCbrQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCbrQci9IsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwMediumThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsHwMediumThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsHwMediumThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAllowedMeasIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsMaxAllowedMeasIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsMaxAllowedMeasIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci6IsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCbrQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCbrQci6IsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1BandwidthIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsS1BandwidthIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsS1BandwidthIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValueIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCapacityClassValueIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCapacityClassValueIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwLowThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsHwLowThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsHwLowThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci7IsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCbrQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCbrQci7IsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1Bandwidth", scope = TrafficManagementWs.class)
    public JAXBElement<String> createTrafficManagementWsS1Bandwidth(String value) {
        return new JAXBElement<String>(_TrafficManagementWsS1Bandwidth_QNAME, String.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ResourceStatusReportingInitiationTimer", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsResourceStatusReportingInitiationTimer(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsResourceStatusReportingInitiationTimer_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci5IsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCbrQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCbrQci5IsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1MediumThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsS1MediumThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsS1MediumThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci5", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCbrQci5(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCbrQci5_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci6", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCbrQci6(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCbrQci6_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci7", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCbrQci7(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCbrQci7_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAllowedMeas", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsMaxAllowedMeas(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsMaxAllowedMeas_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci8", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCbrQci8(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCbrQci8_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci9", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCbrQci9(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCbrQci9_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwLowThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsHwLowThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsHwLowThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasSampleIntervalIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsMeasSampleIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsMeasSampleIntervalIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1LowThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsS1LowThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsS1LowThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwHighThresholdIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsHwHighThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsHwHighThresholdIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValue", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsCapacityClassValue(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCapacityClassValue_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ResourceStatusReportingInitiationTimerIsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsResourceStatusReportingInitiationTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsResourceStatusReportingInitiationTimerIsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwHighThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsHwHighThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsHwHighThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasSampleInterval", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsMeasSampleInterval(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsMeasSampleInterval_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1LowThreshold", scope = TrafficManagementWs.class)
    public JAXBElement<Integer> createTrafficManagementWsS1LowThreshold(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsS1LowThreshold_QNAME, Integer.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci8IsDefault", scope = TrafficManagementWs.class)
    public JAXBElement<Boolean> createTrafficManagementWsCbrQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCbrQci8IsDefault_QNAME, Boolean.class, TrafficManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCSonServer", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForCSonServer(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCSonServer_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min20MHzChannel", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsMin20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin20MHzChannel_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max20MHzChannel", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsMax20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax20MHzChannel_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Altitude", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsAltitude(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpAltitude_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1InterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsM1InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM1InterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2U", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForX2U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2U_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAutoX2ControlForNeighboursEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<Boolean> createAuEnbDetailWsIsAutoX2ControlForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsAutoX2ControlForNeighboursEnabled_QNAME, Boolean.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsS1UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1UInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsX2UInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2UInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ENodeBID", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsENodeBID(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpENodeBID_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonServerInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsCSonServerInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCSonServerInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2ConfigurationUpdateForNeighboursEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<Boolean> createAuEnbDetailWsIsX2ConfigurationUpdateForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetPnpIsX2ConfigurationUpdateForNeighboursEnabled_QNAME, Boolean.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1C", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForS1C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1C_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = AuEnbDetailWs.class)
    public JAXBElement<BigDecimal> createAuEnbDetailWsLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLongitude_QNAME, BigDecimal.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max40MHzChannel", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsMax40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMax40MHzChannel_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellToUseValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellToUse", scope = AuEnbDetailWs.class)
    public JAXBElement<CellToUseValues> createAuEnbDetailWsCellToUse(CellToUseValues value) {
        return new JAXBElement<CellToUseValues>(_EnbDetailsGetPnpCellToUse_QNAME, CellToUseValues.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpSlaveInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsPtpSlaveInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsPtpSlaveInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM2", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForM2(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM2_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM1", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForM1(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForM1_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2C", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForX2C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForX2C_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min40MHzChannel", scope = AuEnbDetailWs.class)
    public JAXBElement<Integer> createAuEnbDetailWsMin40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetPnpMin40MHzChannel_QNAME, Integer.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCallTraceInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsCallTraceInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsCallTraceInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1U", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForS1U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForS1U_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2InterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsM2InterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsM2InterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsS1CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsS1CInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForPtpSlave", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForPtpSlave(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForPtpSlave_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCallTrace", scope = AuEnbDetailWs.class)
    public JAXBElement<String> createAuEnbDetailWsInterfaceToUseForCallTrace(String value) {
        return new JAXBElement<String>(_EnbDetailsGetPnpInterfaceToUseForCallTrace_QNAME, String.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = AuEnbDetailWs.class)
    public JAXBElement<BigDecimal> createAuEnbDetailWsLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLatitude_QNAME, BigDecimal.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CInterfaceEnabled", scope = AuEnbDetailWs.class)
    public JAXBElement<EnabledDisabledStates> createAuEnbDetailWsIsX2CInterfaceEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpIsX2CInterfaceEnabled_QNAME, EnabledDisabledStates.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultX2ControlStateForNeighbours", scope = AuEnbDetailWs.class)
    public JAXBElement<X2ControlStateTypes> createAuEnbDetailWsDefaultX2ControlStateForNeighbours(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_EnbDetailsGetPnpDefaultX2ControlStateForNeighbours_QNAME, X2ControlStateTypes.class, AuEnbDetailWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = DiscardTimerWs.class)
    public JAXBElement<String> createDiscardTimerWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = DiscardTimerWs.class)
    public JAXBElement<Boolean> createDiscardTimerWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, DiscardTimerWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = TpollRetransmitWs.class)
    public JAXBElement<String> createTpollRetransmitWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = TpollRetransmitWs.class)
    public JAXBElement<Boolean> createTpollRetransmitWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, TpollRetransmitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbCellAdvancedProfile.class)
    public JAXBElement<CategoriesLte> createEnbCellAdvancedProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbCellAdvancedProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncAreaId", scope = EnbEmbmsProfile.class)
    public JAXBElement<Integer> createEnbEmbmsProfileSyncAreaId(Integer value) {
        return new JAXBElement<Integer>(_EnbEmbmsProfileSyncAreaId_QNAME, Integer.class, EnbEmbmsProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BroadcastSib15Enabled", scope = EnbEmbmsProfile.class)
    public JAXBElement<Boolean> createEnbEmbmsProfileBroadcastSib15Enabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbEmbmsProfileBroadcastSib15Enabled_QNAME, Boolean.class, EnbEmbmsProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Enabled", scope = EnbEmbmsProfile.class)
    public JAXBElement<Boolean> createEnbEmbmsProfileEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbEmbmsProfileEnabled_QNAME, Boolean.class, EnbEmbmsProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbEmbmsProfile.class)
    public JAXBElement<CategoriesLte> createEnbEmbmsProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbEmbmsProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeBand.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeBandTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityConnectedModeBand.class)
    public JAXBElement<String> createMobilityConnectedModeBandQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeBand.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeBandA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeQosFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeBand.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeBandEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeBand.class)
    public JAXBElement<Integer> createMobilityConnectedModeBandRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeBand.class)
    public JAXBElement<String> createMobilityConnectedModeBandTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeBand.class)
    public JAXBElement<Integer> createMobilityConnectedModeBandRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeQosFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = MobilityConnectedModeBand.class)
    public JAXBElement<Integer> createMobilityConnectedModeBandBand(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterBandBand_QNAME, Integer.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeBand.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeBandHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeBand.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpMode", scope = EnbSonProfile.class)
    public JAXBElement<PnpModes> createEnbSonProfilePnpMode(PnpModes value) {
        return new JAXBElement<PnpModes>(_EnbSonProfilePnpMode_QNAME, PnpModes.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SonAnrEnbPciModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrEnbPciMode", scope = EnbSonProfile.class)
    public JAXBElement<SonAnrEnbPciModes> createEnbSonProfileAnrEnbPciMode(SonAnrEnbPciModes value) {
        return new JAXBElement<SonAnrEnbPciModes>(_EnbSonProfileAnrEnbPciMode_QNAME, SonAnrEnbPciModes.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SonCommissioningEnabled", scope = EnbSonProfile.class)
    public JAXBElement<Boolean> createEnbSonProfileSonCommissioningEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSonProfileSonCommissioningEnabled_QNAME, Boolean.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciEnabled", scope = EnbSonProfile.class)
    public JAXBElement<Boolean> createEnbSonProfilePciEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSonProfilePciEnabled_QNAME, Boolean.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SonAnrStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrState", scope = EnbSonProfile.class)
    public JAXBElement<SonAnrStates> createEnbSonProfileAnrState(SonAnrStates value) {
        return new JAXBElement<SonAnrStates>(_EnbSonProfileAnrState_QNAME, SonAnrStates.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinAllowedHoSuccessRate", scope = EnbSonProfile.class)
    public JAXBElement<Integer> createEnbSonProfileMinAllowedHoSuccessRate(Integer value) {
        return new JAXBElement<Integer>(_EnbSonProfileMinAllowedHoSuccessRate_QNAME, Integer.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSonProfile.class)
    public JAXBElement<CategoriesLte> createEnbSonProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiEnabled", scope = EnbSonProfile.class)
    public JAXBElement<Boolean> createEnbSonProfileRsiEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSonProfileRsiEnabled_QNAME, Boolean.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DateOfMonth", scope = MonthlyOption1 .class)
    public JAXBElement<Integer> createMonthlyOption1DateOfMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOption1DateOfMonth_QNAME, Integer.class, MonthlyOption1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryXMonth", scope = MonthlyOption1 .class)
    public JAXBElement<Integer> createMonthlyOption1EveryXMonth(Integer value) {
        return new JAXBElement<Integer>(_MonthlyOption1EveryXMonth_QNAME, Integer.class, MonthlyOption1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullCipheringLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileNullCipheringLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileNullCipheringLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snow3GCipheringLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileSnow3GCipheringLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileSnow3GCipheringLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecurityForCiphering", scope = EnbSecurityProfile.class)
    public JAXBElement<SecurityProfileOptionalOrMandatory> createEnbSecurityProfileSecurityForCiphering(SecurityProfileOptionalOrMandatory value) {
        return new JAXBElement<SecurityProfileOptionalOrMandatory>(_EnbSecurityProfileSecurityForCiphering_QNAME, SecurityProfileOptionalOrMandatory.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecurityForIntegrity", scope = EnbSecurityProfile.class)
    public JAXBElement<SecurityProfileOptionalOrMandatory> createEnbSecurityProfileSecurityForIntegrity(SecurityProfileOptionalOrMandatory value) {
        return new JAXBElement<SecurityProfileOptionalOrMandatory>(_EnbSecurityProfileSecurityForIntegrity_QNAME, SecurityProfileOptionalOrMandatory.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AesIntegrityLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileAesIntegrityLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileAesIntegrityLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SshEnabled", scope = EnbSecurityProfile.class)
    public JAXBElement<Boolean> createEnbSecurityProfileSshEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSecurityProfileSshEnabled_QNAME, Boolean.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AesCipheringLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileAesCipheringLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileAesCipheringLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NullIntegrityLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileNullIntegrityLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileNullIntegrityLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snow3GIntegrityLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileSnow3GIntegrityLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileSnow3GIntegrityLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WebGUIAccessEnabled", scope = EnbSecurityProfile.class)
    public JAXBElement<Boolean> createEnbSecurityProfileWebGUIAccessEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSecurityProfileWebGUIAccessEnabled_QNAME, Boolean.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSecurityProfile.class)
    public JAXBElement<CategoriesLte> createEnbSecurityProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeFreqTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetFreq", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<String> createMobilityConnectedModeFreqQOffsetFreq(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterEarfcnQOffsetFreq_QNAME, String.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeFreqA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeQosFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeFreqEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeFreqRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<String> createMobilityConnectedModeFreqTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeFreqRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeQosFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeFreqHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = TstatusProhibitWs.class)
    public JAXBElement<String> createTstatusProhibitWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = TstatusProhibitWs.class)
    public JAXBElement<Boolean> createTstatusProhibitWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, TstatusProhibitWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtraSfMediumIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsReselectionUtraSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsReselectionUtraSfMediumIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit2", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit2(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit2_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfMedium", scope = ReselectionWs.class)
    public JAXBElement<String> createReselectionWsReselectionGeranSfMedium(String value) {
        return new JAXBElement<String>(_ReselectionWsReselectionGeranSfMedium_QNAME, String.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit1", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit1(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit1_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfMediumIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsReselectionGeranSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsReselectionGeranSfMediumIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit7IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit7IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GeranSpeedStateScaleFactorsIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsGeranSpeedStateScaleFactorsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsGeranSpeedStateScaleFactorsIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit2IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit2IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit8", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit8(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit8_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit7", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit7(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit7_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GeranSpeedStateScaleFactors", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsGeranSpeedStateScaleFactors(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsGeranSpeedStateScaleFactors_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit8IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit8IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit4", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit4(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit4_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit3", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit3(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit3_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit6", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit6(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit6_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtraSfHigh", scope = ReselectionWs.class)
    public JAXBElement<String> createReselectionWsReselectionUtraSfHigh(String value) {
        return new JAXBElement<String>(_ReselectionWsReselectionUtraSfHigh_QNAME, String.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit5IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit5IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit5", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsNccPermittedBit5(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsNccPermittedBit5_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit6IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit6IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtraSpeedStateScaleFactorsIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsUtraSpeedStateScaleFactorsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsUtraSpeedStateScaleFactorsIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit3IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit3IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfHigh", scope = ReselectionWs.class)
    public JAXBElement<String> createReselectionWsReselectionGeranSfHigh(String value) {
        return new JAXBElement<String>(_ReselectionWsReselectionGeranSfHigh_QNAME, String.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit4IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit4IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtraSpeedStateScaleFactors", scope = ReselectionWs.class)
    public JAXBElement<EnabledDisabledStates> createReselectionWsUtraSpeedStateScaleFactors(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_ReselectionWsUtraSpeedStateScaleFactors_QNAME, EnabledDisabledStates.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtraSfHighIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsReselectionUtraSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsReselectionUtraSfHighIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtraSfMedium", scope = ReselectionWs.class)
    public JAXBElement<String> createReselectionWsReselectionUtraSfMedium(String value) {
        return new JAXBElement<String>(_ReselectionWsReselectionUtraSfMedium_QNAME, String.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfHighIsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsReselectionGeranSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsReselectionGeranSfHighIsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit1IsDefault", scope = ReselectionWs.class)
    public JAXBElement<Boolean> createReselectionWsNccPermittedBit1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionWsNccPermittedBit1IsDefault_QNAME, Boolean.class, ReselectionWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SctpPort", scope = LteS1EntryWs.class)
    public JAXBElement<Integer> createLteS1EntryWsSctpPort(Integer value) {
        return new JAXBElement<Integer>(_LteS1EntryWsSctpPort_QNAME, Integer.class, LteS1EntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadWeightIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsCpuLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsCpuLoadWeightIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadWeightIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsRrcLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsRrcLoadWeightIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacitySampleIntervalIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsCapacitySampleIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsCapacitySampleIntervalIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadThresholdIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsCpuLoadThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsCpuLoadThresholdIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityReportInterval", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsCapacityReportInterval(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsCapacityReportInterval_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiGuardTimer", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsAperiodicCqiGuardTimer(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsAperiodicCqiGuardTimer_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoReportEvaluationTimer", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsHoReportEvaluationTimer(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsHoReportEvaluationTimer_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValueIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsCapacityClassValueIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_TrafficManagementWsCapacityClassValueIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadThreshold", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsRrcLoadThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsRrcLoadThreshold_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PuschLoadThresholdIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsPuschLoadThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsPuschLoadThresholdIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiGuardTimerIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsAperiodicCqiGuardTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsAperiodicCqiGuardTimerIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeThroughputReportInterval", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsUeThroughputReportInterval(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsUeThroughputReportInterval_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeThroughputReportIntervalIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsUeThroughputReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsUeThroughputReportIntervalIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityReportIntervalIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsCapacityReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsCapacityReportIntervalIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiMinMcs", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsAperiodicCqiMinMcs(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsAperiodicCqiMinMcs_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrbLoadWeight", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsPrbLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsPrbLoadWeight_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadWeight", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsRrcLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsRrcLoadWeight_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoKpiReportIntervalIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsHoKpiReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsHoKpiReportIntervalIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoKpiReportInterval", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsHoKpiReportInterval(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsHoKpiReportInterval_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiMinMcsIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsAperiodicCqiMinMcsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsAperiodicCqiMinMcsIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoReportEvaluationTimerIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsHoReportEvaluationTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsHoReportEvaluationTimerIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadThreshold", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsCpuLoadThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsCpuLoadThreshold_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadThresholdIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsRrcLoadThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsRrcLoadThresholdIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadWeight", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsCpuLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsCpuLoadWeight_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PuschLoadThreshold", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsPuschLoadThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsPuschLoadThreshold_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrbLoadWeightIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsPrbLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsPrbLoadWeightIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacitySampleInterval", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsCapacitySampleInterval(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsCapacitySampleInterval_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValue", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsCapacityClassValue(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementWsCapacityClassValue_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschLoadThreshold", scope = CellAirSonWs.class)
    public JAXBElement<Integer> createCellAirSonWsPdschLoadThreshold(Integer value) {
        return new JAXBElement<Integer>(_CellAirSonWsPdschLoadThreshold_QNAME, Integer.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdschLoadThresholdIsDefault", scope = CellAirSonWs.class)
    public JAXBElement<Boolean> createCellAirSonWsPdschLoadThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellAirSonWsPdschLoadThresholdIsDefault_QNAME, Boolean.class, CellAirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSyncProfile.class)
    public JAXBElement<CategoriesLte> createEnbSyncProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = PollPduWs.class)
    public JAXBElement<String> createPollPduWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = PollPduWs.class)
    public JAXBElement<Boolean> createPollPduWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, PollPduWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityInterRatUtranCoverageRedirectionTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageBasedRedirectionEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<CoverageBasedRedirectionEventTypes> createMobilityInterRatUtranCoverageRedirectionEventType(CoverageBasedRedirectionEventTypes value) {
        return new JAXBElement<CoverageBasedRedirectionEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, CoverageBasedRedirectionEventTypes.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranCoverageRedirectionRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<String> createMobilityInterRatUtranCoverageRedirectionTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<BigDecimal> createMobilityInterRatUtranCoverageRedirectionHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeTriggerGapsTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeStopGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<TriggerGapEventTypes> createMobilityConnectedModeTriggerGapsEventType(TriggerGapEventTypes value) {
        return new JAXBElement<TriggerGapEventTypes>(_MobilityConnectedModeStopGapsEventType_QNAME, TriggerGapEventTypes.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<Integer> createMobilityConnectedModeTriggerGapsRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeStopGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<String> createMobilityConnectedModeTriggerGapsTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeStopGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeTriggerGapsHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeStopGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementModeOnly", scope = AuRelayDetails.class)
    public JAXBElement<Boolean> createAuRelayDetailsManagementModeOnly(Boolean value) {
        return new JAXBElement<Boolean>(_AuRelayDetailsManagementModeOnly_QNAME, Boolean.class, AuRelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPdclLocked", scope = AuRelayDetails.class)
    public JAXBElement<Boolean> createAuRelayDetailsIsPdclLocked(Boolean value) {
        return new JAXBElement<Boolean>(_AuRelayDetailsIsPdclLocked_QNAME, Boolean.class, AuRelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LedMode", scope = AuRelayDetails.class)
    public JAXBElement<EnabledDisabledStates> createAuRelayDetailsLedMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbDetailsGetPnpLedMode_QNAME, EnabledDisabledStates.class, AuRelayDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultipleSid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsMultipleSid(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsMultipleSid_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ZoneTimer", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsZoneTimer(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsZoneTimer_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ParameterReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsParameterReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KMobilityParamsParameterReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultipleNid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsMultipleNid(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsMultipleNid_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegistrationPeriod", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsRegistrationPeriod(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KSib8ParamsRegistrationPeriod_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalZone", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsTotalZone(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KSib8ParamsTotalZone_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerUpReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsPowerUpReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KMobilityParamsPowerUpReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerDownReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsPowerDownReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KMobilityParamsPowerDownReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForeignSidReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsForeignSidReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsForeignSidReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Nid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsNid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsNid_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegistrationZone", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsRegistrationZone(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KSib8ParamsRegistrationZone_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForeignNidReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsForeignNidReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsForeignNidReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsHomeReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KMobilityParamsHomeReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsSid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsSid_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationOffsetIsDefault", scope = CellEmbmsWs.class)
    public JAXBElement<Boolean> createCellEmbmsWsNotificationOffsetIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellEmbmsWsNotificationOffsetIsDefault_QNAME, Boolean.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChangeNotificationInterval", scope = CellEmbmsWs.class)
    public JAXBElement<Integer> createCellEmbmsWsChangeNotificationInterval(Integer value) {
        return new JAXBElement<Integer>(_CellEmbmsWsChangeNotificationInterval_QNAME, Integer.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationOffset", scope = CellEmbmsWs.class)
    public JAXBElement<Integer> createCellEmbmsWsNotificationOffset(Integer value) {
        return new JAXBElement<Integer>(_CellEmbmsWsNotificationOffset_QNAME, Integer.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationSfIndex", scope = CellEmbmsWs.class)
    public JAXBElement<Integer> createCellEmbmsWsNotificationSfIndex(Integer value) {
        return new JAXBElement<Integer>(_CellEmbmsWsNotificationSfIndex_QNAME, Integer.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationRepetitionCoeffIsDefault", scope = CellEmbmsWs.class)
    public JAXBElement<Boolean> createCellEmbmsWsNotificationRepetitionCoeffIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellEmbmsWsNotificationRepetitionCoeffIsDefault_QNAME, Boolean.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationRepetitionCoeff", scope = CellEmbmsWs.class)
    public JAXBElement<String> createCellEmbmsWsNotificationRepetitionCoeff(String value) {
        return new JAXBElement<String>(_CellEmbmsWsNotificationRepetitionCoeff_QNAME, String.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NotificationSfIndexIsDefault", scope = CellEmbmsWs.class)
    public JAXBElement<Boolean> createCellEmbmsWsNotificationSfIndexIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellEmbmsWsNotificationSfIndexIsDefault_QNAME, Boolean.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChangeNotificationIntervalIsDefault", scope = CellEmbmsWs.class)
    public JAXBElement<Boolean> createCellEmbmsWsChangeNotificationIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellEmbmsWsChangeNotificationIntervalIsDefault_QNAME, Boolean.class, CellEmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetModeAdminIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsWarmResetModeAdminIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsWarmResetModeAdminIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsGpsLockWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsGpsLockWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciAllocPolicy", scope = AirSonWs.class)
    public JAXBElement<PciAllocPolicyTypes> createAirSonWsPciAllocPolicy(PciAllocPolicyTypes value) {
        return new JAXBElement<PciAllocPolicyTypes>(_AirSonWsPciAllocPolicy_QNAME, PciAllocPolicyTypes.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsAnrTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsAnrTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellInitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsCellInitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsCellInitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpGlobalTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPnpGlobalTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPnpGlobalTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsGpsLockWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsGpsLockWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareDownload", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsAutoSoftwareDownload(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsAutoSoftwareDownload_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionLostMaxRetriesIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsConnectionLostMaxRetriesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsConnectionLostMaxRetriesIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsDhcpWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsDhcpWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpFailWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsDhcpFailWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsDhcpFailWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoInventoryFailTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsWarmResetAutoInventoryFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsWarmResetAutoInventoryFailTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestRetryTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsSelfTestRetryTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsSelfTestRetryTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FullDynamicRadioConfigurationIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsFullDynamicRadioConfigurationIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsFullDynamicRadioConfigurationIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultConfigurationWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsDefaultConfigurationWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsDefaultConfigurationWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetConfigurationFailTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsWarmResetConfigurationFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsWarmResetConfigurationFailTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerLevelTimeIntervalIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPowerLevelTimeIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPowerLevelTimeIntervalIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigurationProvisioning", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsConfigurationProvisioning(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsConfigurationProvisioning_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DelayBetweenConnectionRetriesCycleIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsDelayBetweenConnectionRetriesCycleIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsDelayBetweenConnectionRetriesCycleIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultConfigurationWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsDefaultConfigurationWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsDefaultConfigurationWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LowPower", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsLowPower(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsLowPower_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EsonConnectionRetryTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsEsonConnectionRetryTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsEsonConnectionRetryTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PersistencyModeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPersistencyModeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPersistencyModeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpPeristencyMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PersistencyMode", scope = AirSonWs.class)
    public JAXBElement<PnpPeristencyMode> createAirSonWsPersistencyMode(PnpPeristencyMode value) {
        return new JAXBElement<PnpPeristencyMode>(_AirSonWsPersistencyMode_QNAME, PnpPeristencyMode.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerLevelTimeInterval", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsPowerLevelTimeInterval(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsPowerLevelTimeInterval_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestFailWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsSelfTestFailWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsSelfTestFailWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDhcpRetry", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsMaxDhcpRetry(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsMaxDhcpRetry_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsAutoSoftwareWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsAutoSoftwareWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionLostMaxRetries", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsConnectionLostMaxRetries(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsConnectionLostMaxRetries_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DelayBetweenConnectionRetriesCycle", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsDelayBetweenConnectionRetriesCycle(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsDelayBetweenConnectionRetriesCycle_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoInventoryFailTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsWarmResetAutoInventoryFailTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsWarmResetAutoInventoryFailTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSelfTestRetry", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsMaxSelfTestRetry(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsMaxSelfTestRetry_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoInventoryUpdate", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsAutoInventoryUpdate(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsAutoInventoryUpdate_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetConfigurationFailTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsWarmResetConfigurationFailTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsWarmResetConfigurationFailTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetModeAdmin", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsWarmResetModeAdmin(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsWarmResetModeAdmin_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LowPowerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsLowPowerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsLowPowerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestFailWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsSelfTestFailWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsSelfTestFailWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerStepIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPowerStepIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPowerStepIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BringupRetryIntervalIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsBringupRetryIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsBringupRetryIntervalIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellInitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsCellInitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsCellInitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CollisionResolutionDelayfactorIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsCollisionResolutionDelayfactorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsCollisionResolutionDelayfactorIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetSiteIdFailTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsWarmResetSiteIdFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsWarmResetSiteIdFailTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoSwDownloadFailTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsWarmResetAutoSwDownloadFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsWarmResetAutoSwDownloadFailTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoInventoryUpdateIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsAutoInventoryUpdateIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsAutoInventoryUpdateIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPciListSizeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsInitialPciListSizeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsInitialPciListSizeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSiteIdentificationRetry", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsMaxSiteIdentificationRetry(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsMaxSiteIdentificationRetry_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDhcpRetryIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsMaxDhcpRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsMaxDhcpRetryIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeCollisionResolutionThresholdIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsUeCollisionResolutionThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsUeCollisionResolutionThresholdIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSelfTestRetryIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsMaxSelfTestRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsMaxSelfTestRetryIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CollisionResolutionDelayfactor", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsCollisionResolutionDelayfactor(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsCollisionResolutionDelayfactor_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsDhcpWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsDhcpWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetSiteIdFailTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsWarmResetSiteIdFailTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsWarmResetSiteIdFailTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsMaxPersistenceTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsMaxPersistenceTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FullDynamicRadioConfiguration", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsFullDynamicRadioConfiguration(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsFullDynamicRadioConfiguration_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryCompleteWaitTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsInventoryCompleteWaitTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsInventoryCompleteWaitTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdGlobalTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsSiteIdGlobalTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsSiteIdGlobalTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciCollisionResolutionTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsPciCollisionResolutionTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsPciCollisionResolutionTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceRadius", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsMaxPersistenceRadius(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsMaxPersistenceRadius_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EsonConnectionRetryTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsEsonConnectionRetryTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsEsonConnectionRetryTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPciListSize", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsInitialPciListSize(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsInitialPciListSize_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoSwDownloadFailTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsWarmResetAutoSwDownloadFailTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsWarmResetAutoSwDownloadFailTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdGlobalTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsSiteIdGlobalTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsSiteIdGlobalTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeCollisionResolutionThreshold", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsUeCollisionResolutionThreshold(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsUeCollisionResolutionThreshold_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciConfusionAllowedIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPciConfusionAllowedIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPciConfusionAllowedIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciCollisionResolutionTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPciCollisionResolutionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPciCollisionResolutionTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciConfusionAllowed", scope = AirSonWs.class)
    public JAXBElement<EnabledDisabledStates> createAirSonWsPciConfusionAllowed(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_AirSonWsPciConfusionAllowed_QNAME, EnabledDisabledStates.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdFailTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsSiteIdFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsSiteIdFailTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareDownloadIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsAutoSoftwareDownloadIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsAutoSoftwareDownloadIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerStep", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsPowerStep(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsPowerStep_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciAllocPolicyIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsPciAllocPolicyIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsPciAllocPolicyIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestRetryTime", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsSelfTestRetryTime(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsSelfTestRetryTime_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsMaxPersistenceTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsMaxPersistenceTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsAutoSoftwareWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsAutoSoftwareWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BringupRetryInterval", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsBringupRetryInterval(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsBringupRetryInterval_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpGlobalTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsPnpGlobalTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsPnpGlobalTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpFailWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsDhcpFailWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsDhcpFailWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceRadiusIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsMaxPersistenceRadiusIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsMaxPersistenceRadiusIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigurationProvisioningIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsConfigurationProvisioningIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsConfigurationProvisioningIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnrTimerIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsAnrTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsAnrTimerIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSiteIdentificationRetryIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsMaxSiteIdentificationRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsMaxSiteIdentificationRetryIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryCompleteWaitTimeIsDefault", scope = AirSonWs.class)
    public JAXBElement<Boolean> createAirSonWsInventoryCompleteWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AirSonWsInventoryCompleteWaitTimeIsDefault_QNAME, Boolean.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdFailTimer", scope = AirSonWs.class)
    public JAXBElement<Integer> createAirSonWsSiteIdFailTimer(Integer value) {
        return new JAXBElement<Integer>(_AirSonWsSiteIdFailTimer_QNAME, Integer.class, AirSonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceLogStartWaitForACK", scope = CallTraceEnbWs.class)
    public JAXBElement<Integer> createCallTraceEnbWsTraceLogStartWaitForACK(Integer value) {
        return new JAXBElement<Integer>(_CallTraceEnbWsTraceLogStartWaitForACK_QNAME, Integer.class, CallTraceEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceKeepAliveFailures", scope = CallTraceEnbWs.class)
    public JAXBElement<Integer> createCallTraceEnbWsTraceKeepAliveFailures(Integer value) {
        return new JAXBElement<Integer>(_CallTraceEnbWsTraceKeepAliveFailures_QNAME, Integer.class, CallTraceEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceKeepAlive", scope = CallTraceEnbWs.class)
    public JAXBElement<Integer> createCallTraceEnbWsTraceKeepAlive(Integer value) {
        return new JAXBElement<Integer>(_CallTraceEnbWsTraceKeepAlive_QNAME, Integer.class, CallTraceEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DelayBetweenRetries", scope = CallTraceEnbWs.class)
    public JAXBElement<Integer> createCallTraceEnbWsDelayBetweenRetries(Integer value) {
        return new JAXBElement<Integer>(_CallTraceEnbWsDelayBetweenRetries_QNAME, Integer.class, CallTraceEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TraceLogStartEndResumeRetransmissions", scope = CallTraceEnbWs.class)
    public JAXBElement<Integer> createCallTraceEnbWsTraceLogStartEndResumeRetransmissions(Integer value) {
        return new JAXBElement<Integer>(_CallTraceEnbWsTraceLogStartEndResumeRetransmissions_QNAME, Integer.class, CallTraceEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T304IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT304IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT304IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T320IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT320IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT320IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T311IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT311IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT311IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T300", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT300(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT300_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T311", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT311(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT311_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T300IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT300IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT300IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T310", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT310(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT310_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T320", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT320(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT320_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T310IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT310IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT310IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T301IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsT301IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsT301IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N310IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsN310IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsN310IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N311", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsN311(String value) {
        return new JAXBElement<String>(_ConnectionControlWsN311_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcProcedureTimeout", scope = ConnectionControlWs.class)
    public JAXBElement<Integer> createConnectionControlWsRrcProcedureTimeout(Integer value) {
        return new JAXBElement<Integer>(_ConnectionControlWsRrcProcedureTimeout_QNAME, Integer.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N310", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsN310(String value) {
        return new JAXBElement<String>(_ConnectionControlWsN310_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T304", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT304(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT304_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T301", scope = ConnectionControlWs.class)
    public JAXBElement<String> createConnectionControlWsT301(String value) {
        return new JAXBElement<String>(_ConnectionControlWsT301_QNAME, String.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcProcedureTimeoutIsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsRrcProcedureTimeoutIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsRrcProcedureTimeoutIsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N311IsDefault", scope = ConnectionControlWs.class)
    public JAXBElement<Boolean> createConnectionControlWsN311IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ConnectionControlWsN311IsDefault_QNAME, Boolean.class, ConnectionControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = TreorderingWs.class)
    public JAXBElement<String> createTreorderingWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = TreorderingWs.class)
    public JAXBElement<Boolean> createTreorderingWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, TreorderingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbCdma2kEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsCsfbCdma2KEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsCsfbCdma2KEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatUtranCoverageBasedRedirectionModeEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsIsInterRatUtranCoverageBasedRedirectionModeEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsIsInterRatUtranCoverageBasedRedirectionModeEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbUtranEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsCsfbUtranEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsCsfbUtranEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatGeranReselectionModeEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsIsInterRatGeranReselectionModeEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsIsInterRatGeranReselectionModeEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQosBasedMeasurementEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsIsQosBasedMeasurementEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsIsQosBasedMeasurementEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsThresholdBasedMeasurementEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsIsThresholdBasedMeasurementEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsIsThresholdBasedMeasurementEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatUtranReselectionModeEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsIsInterRatUtranReselectionModeEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsIsInterRatUtranReselectionModeEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FwdHoEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsFwdHoEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsFwdHoEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbEnabled", scope = EnbMobilityProfileParams.class)
    public JAXBElement<EnabledDisabledStates> createEnbMobilityProfileParamsCsfbEnabled(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbMobilityProfileParamsCsfbEnabled_QNAME, EnabledDisabledStates.class, EnbMobilityProfileParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHigh", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXHigh(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXHigh_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevMin", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionQRxLevMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionQRxLevMin_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMaxUtra", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionPMaxUtra(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionPMaxUtra_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionUtra", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionTReselectionUtra(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionTReselectionUtra_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLow", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXLow(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXLow_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXQr9Low", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXQr9Low(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionThreshXQr9Low_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMin", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionQQualMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionQQualMin_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXQr9High", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXQr9High(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionThreshXQr9High_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EcidMode", scope = EnbRadioProfile.class)
    public JAXBElement<EnabledDisabledStates> createEnbRadioProfileEcidMode(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_EnbRadioProfileEcidMode_QNAME, EnabledDisabledStates.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrSegments", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrSegments(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrSegments_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SfrThresholdTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrThresholdType", scope = EnbRadioProfile.class)
    public JAXBElement<SfrThresholdTypes> createEnbRadioProfileSfrThresholdType(SfrThresholdTypes value) {
        return new JAXBElement<SfrThresholdTypes>(_EnbRadioProfileSfrThresholdType_QNAME, SfrThresholdTypes.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrMinMcsCellCenter", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrMinMcsCellCenter(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrMinMcsCellCenter_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkFreqKHz", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileDownlinkFreqKHz(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileDownlinkFreqKHz_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddlSpectrumEmissions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AddlSpectrumEmission", scope = EnbRadioProfile.class)
    public JAXBElement<AddlSpectrumEmissions> createEnbRadioProfileAddlSpectrumEmission(AddlSpectrumEmissions value) {
        return new JAXBElement<AddlSpectrumEmissions>(_EnbRadioProfileAddlSpectrumEmission_QNAME, AddlSpectrumEmissions.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrThresholdValue", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrThresholdValue(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrThresholdValue_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandwidthMhz", scope = EnbRadioProfile.class)
    public JAXBElement<String> createEnbRadioProfileBandwidthMhz(String value) {
        return new JAXBElement<String>(_EnbRadioProfileBandwidthMhz_QNAME, String.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MfbiEnabled", scope = EnbRadioProfile.class)
    public JAXBElement<Boolean> createEnbRadioProfileMfbiEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbRadioProfileMfbiEnabled_QNAME, Boolean.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DuplexMode", scope = EnbRadioProfile.class)
    public JAXBElement<RfProfileDuplexModes> createEnbRadioProfileDuplexMode(RfProfileDuplexModes value) {
        return new JAXBElement<RfProfileDuplexModes>(_EnbRadioProfileDuplexMode_QNAME, RfProfileDuplexModes.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsfTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SsfType", scope = EnbRadioProfile.class)
    public JAXBElement<SsfTypes> createEnbRadioProfileSsfType(SsfTypes value) {
        return new JAXBElement<SsfTypes>(_EnbRadioProfileSsfType_QNAME, SsfTypes.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EcidTimer", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileEcidTimer(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileEcidTimer_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkFreqKHz", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileUplinkFreqKHz(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileUplinkFreqKHz_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileBand(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterBandBand_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TddFrameConfigurationsSupported }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FrameConfig", scope = EnbRadioProfile.class)
    public JAXBElement<TddFrameConfigurationsSupported> createEnbRadioProfileFrameConfig(TddFrameConfigurationsSupported value) {
        return new JAXBElement<TddFrameConfigurationsSupported>(_EnbRadioProfileFrameConfig_QNAME, TddFrameConfigurationsSupported.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileTxPower(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileTxPower_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrMaxMcsCellEdge", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrMaxMcsCellEdge(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrMaxMcsCellEdge_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbRadioProfile.class)
    public JAXBElement<CategoriesLte> createEnbRadioProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_CallTraceProfileHardwareCategory_QNAME, CategoriesLte.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrIndex", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrIndex(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrIndex_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EveryWeekDay", scope = DailyOption2 .class)
    public JAXBElement<Boolean> createDailyOption2EveryWeekDay(Boolean value) {
        return new JAXBElement<Boolean>(_DailyOption2EveryWeekDay_QNAME, Boolean.class, DailyOption2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxCfi", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsMaxCfi(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsMaxCfi_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetPddchPopulationRate", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsTargetPddchPopulationRate(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsTargetPddchPopulationRate_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CfiMonitoringInterval", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsCfiMonitoringInterval(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsCfiMonitoringInterval_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxCfiIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsMaxCfiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsMaxCfiIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinCfiIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsMinCfiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsMinCfiIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetPddchPopulationRateIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsTargetPddchPopulationRateIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsTargetPddchPopulationRateIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CfiMonitoringIntervalIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsCfiMonitoringIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsCfiMonitoringIntervalIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ControlChannelOverloadOptimization", scope = CellDynamicCfiWs.class)
    public JAXBElement<EnabledDisabledStates> createCellDynamicCfiWsControlChannelOverloadOptimization(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_CellDynamicCfiWsControlChannelOverloadOptimization_QNAME, EnabledDisabledStates.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPddchFailRate", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsMaxPddchFailRate(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsMaxPddchFailRate_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPddchFailRateIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsMaxPddchFailRateIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsMaxPddchFailRateIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinCfi", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsMinCfi(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsMinCfi_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChannelFormatIndicator", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsChannelFormatIndicator(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsChannelFormatIndicator_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcchOverAllocationTh", scope = CellDynamicCfiWs.class)
    public JAXBElement<Integer> createCellDynamicCfiWsPdcchOverAllocationTh(Integer value) {
        return new JAXBElement<Integer>(_CellDynamicCfiWsPdcchOverAllocationTh_QNAME, Integer.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcchOverAllocationThIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsPdcchOverAllocationThIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsPdcchOverAllocationThIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ChannelFormatIndicatorIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsChannelFormatIndicatorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsChannelFormatIndicatorIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ControlChannelOverloadOptimizationIsDefault", scope = CellDynamicCfiWs.class)
    public JAXBElement<Boolean> createCellDynamicCfiWsControlChannelOverloadOptimizationIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellDynamicCfiWsControlChannelOverloadOptimizationIsDefault_QNAME, Boolean.class, CellDynamicCfiWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = EnbDetailsGet.class)
    public JAXBElement<NodeManagementModes> createEnbDetailsGetManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_LteEnbDetailsSetWsManagedMode_QNAME, NodeManagementModes.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DuplexMode", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<RfProfileDuplexModes> createMobilityUtranReselectionPriorityEntryWsDuplexMode(RfProfileDuplexModes value) {
        return new JAXBElement<RfProfileDuplexModes>(_EnbRadioProfileDuplexMode_QNAME, RfProfileDuplexModes.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<String> createMobilityUtranReselectionPriorityEntryWsPriority(String value) {
        return new JAXBElement<String>(_MobilityGeranReselectionPriorityEntryWsPriority_QNAME, String.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<Integer> createMobilityUtranReselectionPriorityEntryWsArfcn(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsArfcn_QNAME, Integer.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LteHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = LteSystemDefaultProfileResult.class)
    public JAXBElement<LteHardwareTypes> createLteSystemDefaultProfileResultHardwareCategory(LteHardwareTypes value) {
        return new JAXBElement<LteHardwareTypes>(_CallTraceProfileHardwareCategory_QNAME, LteHardwareTypes.class, LteSystemDefaultProfileResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SptEffThresh", scope = RelayChannelQualityEnbWs.class)
    public JAXBElement<BigDecimal> createRelayChannelQualityEnbWsSptEffThresh(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayChannelQualityEnbWsSptEffThresh_QNAME, BigDecimal.class, RelayChannelQualityEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SinrThresh", scope = RelayChannelQualityEnbWs.class)
    public JAXBElement<Integer> createRelayChannelQualityEnbWsSinrThresh(Integer value) {
        return new JAXBElement<Integer>(_RelayChannelQualityEnbWsSinrThresh_QNAME, Integer.class, RelayChannelQualityEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Alpha", scope = RelayChannelQualityEnbWs.class)
    public JAXBElement<Integer> createRelayChannelQualityEnbWsAlpha(Integer value) {
        return new JAXBElement<Integer>(_CellPuschWsAlpha_QNAME, Integer.class, RelayChannelQualityEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutdoorTxOff", scope = RelayChannelQualityEnbWs.class)
    public JAXBElement<Integer> createRelayChannelQualityEnbWsOutdoorTxOff(Integer value) {
        return new JAXBElement<Integer>(_RelayChannelQualityEnbWsOutdoorTxOff_QNAME, Integer.class, RelayChannelQualityEnbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sib10Duration", scope = EtwsWs.class)
    public JAXBElement<Integer> createEtwsWsSib10Duration(Integer value) {
        return new JAXBElement<Integer>(_EtwsWsSib10Duration_QNAME, Integer.class, EtwsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sib10DurationIsDefault", scope = EtwsWs.class)
    public JAXBElement<Boolean> createEtwsWsSib10DurationIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EtwsWsSib10DurationIsDefault_QNAME, Boolean.class, EtwsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowX2NrtUpdate", scope = MobilityConnectedModeInterFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeInterFreqAllowX2NrtUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeEarfcnAllowX2NrtUpdate_QNAME, Boolean.class, MobilityConnectedModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TreselectionEutraSfHighIsDefault", scope = MobilityIdleFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleFreqWsTreselectionEutraSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleFreqWsTreselectionEutraSfHighIsDefault_QNAME, Boolean.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighCellConfig", scope = MobilityIdleFreqWs.class)
    public JAXBElement<String> createMobilityIdleFreqWsNeighCellConfig(String value) {
        return new JAXBElement<String>(_MobilityConnectedWsNeighCellConfig_QNAME, String.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TreselectionEutraSfMediumIsDefault", scope = MobilityIdleFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleFreqWsTreselectionEutraSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleFreqWsTreselectionEutraSfMediumIsDefault_QNAME, Boolean.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TreselectionEutraSfMedium", scope = MobilityIdleFreqWs.class)
    public JAXBElement<String> createMobilityIdleFreqWsTreselectionEutraSfMedium(String value) {
        return new JAXBElement<String>(_MobilityIdleFreqWsTreselectionEutraSfMedium_QNAME, String.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighCellConfigIsDefault", scope = MobilityIdleFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleFreqWsNeighCellConfigIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedWsNeighCellConfigIsDefault_QNAME, Boolean.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TreselectionEutraSfHigh", scope = MobilityIdleFreqWs.class)
    public JAXBElement<String> createMobilityIdleFreqWsTreselectionEutraSfHigh(String value) {
        return new JAXBElement<String>(_MobilityIdleFreqWsTreselectionEutraSfHigh_QNAME, String.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PresenceAntennaPort1", scope = MobilityIdleFreqWs.class)
    public JAXBElement<EnabledDisabledStates> createMobilityIdleFreqWsPresenceAntennaPort1(EnabledDisabledStates value) {
        return new JAXBElement<EnabledDisabledStates>(_MobilityConnectedWsPresenceAntennaPort1_QNAME, EnabledDisabledStates.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PresenceAntennaPort1IsDefault", scope = MobilityIdleFreqWs.class)
    public JAXBElement<Boolean> createMobilityIdleFreqWsPresenceAntennaPort1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedWsPresenceAntennaPort1IsDefault_QNAME, Boolean.class, MobilityIdleFreqWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrq", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<String> createMobilityConnectedGeneralWsFiltercoefficientRsrq(String value) {
        return new JAXBElement<String>(_MobilityConnectedGeneralWsFiltercoefficientRsrq_QNAME, String.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrp", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<String> createMobilityConnectedGeneralWsFiltercoefficientRsrp(String value) {
        return new JAXBElement<String>(_MobilityConnectedGeneralWsFiltercoefficientRsrp_QNAME, String.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrqIsDefault", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<Boolean> createMobilityConnectedGeneralWsFiltercoefficientRsrqIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedGeneralWsFiltercoefficientRsrqIsDefault_QNAME, Boolean.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrpIsDefault", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<Boolean> createMobilityConnectedGeneralWsFiltercoefficientRsrpIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedGeneralWsFiltercoefficientRsrpIsDefault_QNAME, Boolean.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SMeasure", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<Integer> createMobilityConnectedGeneralWsSMeasure(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedGeneralWsSMeasure_QNAME, Integer.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SMeasureIsDefault", scope = MobilityConnectedGeneralWs.class)
    public JAXBElement<Boolean> createMobilityConnectedGeneralWsSMeasureIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedGeneralWsSMeasureIsDefault_QNAME, Boolean.class, MobilityConnectedGeneralWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurrenceOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelectedOption", scope = RecurrenceYearly.class)
    public JAXBElement<RecurrenceOptions> createRecurrenceYearlySelectedOption(RecurrenceOptions value) {
        return new JAXBElement<RecurrenceOptions>(_RecurrenceDailySelectedOption_QNAME, RecurrenceOptions.class, RecurrenceYearly.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerIdentity_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbType", scope = Enb3RdParty.class)
    public JAXBElement<EnbTypes> createEnb3RdPartyEnbType(EnbTypes value) {
        return new JAXBElement<EnbTypes>(_Enb3RdPartyEnbType_QNAME, EnbTypes.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPhysicalLayerCellGroup_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyTac(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyTac_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bandwidth", scope = Enb3RdParty.class)
    public JAXBElement<String> createEnb3RdPartyBandwidth(String value) {
        return new JAXBElement<String>(_Enb3RdPartyBandwidth_QNAME, String.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyCellIdentity_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlEarfcn", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyDlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterEarfcnDlEarfcn_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbId", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyEnbId(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyEnbId_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyCellId(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyCellId_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = Enb3RdParty.class)
    public JAXBElement<BigDecimal> createEnb3RdPartyLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLatitude_QNAME, BigDecimal.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = Enb3RdParty.class)
    public JAXBElement<BigDecimal> createEnb3RdPartyLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EnbDetailsGetPnpLongitude_QNAME, BigDecimal.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlState", scope = LteNbrConfig.class)
    public JAXBElement<X2ControlStateTypes> createLteNbrConfigX2ControlState(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAddNeighbourWsX2ControlState_QNAME, X2ControlStateTypes.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeighbourEnbTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NodeType", scope = LteNbrConfig.class)
    public JAXBElement<NeighbourEnbTypes> createLteNbrConfigNodeType(NeighbourEnbTypes value) {
        return new JAXBElement<NeighbourEnbTypes>(_LteNbrConfigNodeType_QNAME, NeighbourEnbTypes.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetRange", scope = LteNbrConfig.class)
    public JAXBElement<String> createLteNbrConfigQOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsQOffsetRange_QNAME, String.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIndividualOffsetRange", scope = LteNbrConfig.class)
    public JAXBElement<String> createLteNbrConfigCellIndividualOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsCellIndividualOffsetRange_QNAME, String.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourEarfcn", scope = LteNbrConfig.class)
    public JAXBElement<Integer> createLteNbrConfigNeighbourEarfcn(Integer value) {
        return new JAXBElement<Integer>(_LteNbrConfigNeighbourEarfcn_QNAME, Integer.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourPci", scope = LteNbrConfig.class)
    public JAXBElement<Integer> createLteNbrConfigNeighbourPci(Integer value) {
        return new JAXBElement<Integer>(_LteNbrConfigNeighbourPci_QNAME, Integer.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourTac", scope = LteNbrConfig.class)
    public JAXBElement<Integer> createLteNbrConfigNeighbourTac(Integer value) {
        return new JAXBElement<Integer>(_LteNbrConfigNeighbourTac_QNAME, Integer.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStaticNeighbour", scope = LteNbrConfig.class)
    public JAXBElement<Boolean> createLteNbrConfigIsStaticNeighbour(Boolean value) {
        return new JAXBElement<Boolean>(_LteAddNeighbourWsIsStaticNeighbour_QNAME, Boolean.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoControlState", scope = LteNbrConfig.class)
    public JAXBElement<HoControlStateTypes> createLteNbrConfigHoControlState(HoControlStateTypes value) {
        return new JAXBElement<HoControlStateTypes>(_LteAddNeighbourWsHoControlState_QNAME, HoControlStateTypes.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = LteNbrConfig.class)
    public JAXBElement<HandoverTypes> createLteNbrConfigHandoverType(HandoverTypes value) {
        return new JAXBElement<HandoverTypes>(_LteAddNeighbourWsHandoverType_QNAME, HandoverTypes.class, LteNbrConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LteNeighbourTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourType", scope = EnbNeighbour.class)
    public JAXBElement<LteNeighbourTypes> createEnbNeighbourNeighbourType(LteNeighbourTypes value) {
        return new JAXBElement<LteNeighbourTypes>(_EnbNeighbourNeighbourType_QNAME, LteNeighbourTypes.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourCellNumber", scope = EnbNeighbour.class)
    public JAXBElement<Integer> createEnbNeighbourNeighbourCellNumber(Integer value) {
        return new JAXBElement<Integer>(_LteAddNeighbourForCellWsNeighbourCellNumber_QNAME, Integer.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlState", scope = EnbNeighbour.class)
    public JAXBElement<X2ControlStateTypes> createEnbNeighbourX2ControlState(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAddNeighbourWsX2ControlState_QNAME, X2ControlStateTypes.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetRange", scope = EnbNeighbour.class)
    public JAXBElement<String> createEnbNeighbourQOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsQOffsetRange_QNAME, String.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStaticNeighbour", scope = EnbNeighbour.class)
    public JAXBElement<Boolean> createEnbNeighbourIsStaticNeighbour(Boolean value) {
        return new JAXBElement<Boolean>(_LteAddNeighbourWsIsStaticNeighbour_QNAME, Boolean.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoControlState", scope = EnbNeighbour.class)
    public JAXBElement<HoControlStateTypes> createEnbNeighbourHoControlState(HoControlStateTypes value) {
        return new JAXBElement<HoControlStateTypes>(_LteAddNeighbourWsHoControlState_QNAME, HoControlStateTypes.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = EnbNeighbour.class)
    public JAXBElement<HandoverType> createEnbNeighbourHandoverType(HandoverType value) {
        return new JAXBElement<HandoverType>(_LteAddNeighbourWsHandoverType_QNAME, HandoverType.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPucchIsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsP0NominalPucchIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsP0NominalPucchIsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPucch", scope = CellPucchWs.class)
    public JAXBElement<Integer> createCellPucchWsP0NominalPucch(Integer value) {
        return new JAXBElement<Integer>(_CellPucchWsP0NominalPucch_QNAME, Integer.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1b", scope = CellPucchWs.class)
    public JAXBElement<String> createCellPucchWsDeltaFPucchFormat1B(String value) {
        return new JAXBElement<String>(_CellPucchWsDeltaFPucchFormat1B_QNAME, String.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2b", scope = CellPucchWs.class)
    public JAXBElement<String> createCellPucchWsDeltaFPucchFormat2B(String value) {
        return new JAXBElement<String>(_CellPucchWsDeltaFPucchFormat2B_QNAME, String.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1", scope = CellPucchWs.class)
    public JAXBElement<String> createCellPucchWsDeltaFPucchFormat1(String value) {
        return new JAXBElement<String>(_CellPucchWsDeltaFPucchFormat1_QNAME, String.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1bIsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsDeltaFPucchFormat1BIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsDeltaFPucchFormat1BIsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2a", scope = CellPucchWs.class)
    public JAXBElement<String> createCellPucchWsDeltaFPucchFormat2A(String value) {
        return new JAXBElement<String>(_CellPucchWsDeltaFPucchFormat2A_QNAME, String.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1IsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsDeltaFPucchFormat1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsDeltaFPucchFormat1IsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2aIsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsDeltaFPucchFormat2AIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsDeltaFPucchFormat2AIsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2", scope = CellPucchWs.class)
    public JAXBElement<String> createCellPucchWsDeltaFPucchFormat2(String value) {
        return new JAXBElement<String>(_CellPucchWsDeltaFPucchFormat2_QNAME, String.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2IsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsDeltaFPucchFormat2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsDeltaFPucchFormat2IsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2bIsDefault", scope = CellPucchWs.class)
    public JAXBElement<Boolean> createCellPucchWsDeltaFPucchFormat2BIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellPucchWsDeltaFPucchFormat2BIsDefault_QNAME, Boolean.class, CellPucchWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbIsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsSrbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsSrbIsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci9IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci6IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci3IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci5IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci6", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci6(String value) {
        return new JAXBElement<String>(_RlcModeWsQci6_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci2IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci5", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci5(String value) {
        return new JAXBElement<String>(_RlcModeWsQci5_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci4(String value) {
        return new JAXBElement<String>(_RlcModeWsQci4_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci3", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci3(String value) {
        return new JAXBElement<String>(_RlcModeWsQci3_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci2", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci2(String value) {
        return new JAXBElement<String>(_RlcModeWsQci2_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci1(String value) {
        return new JAXBElement<String>(_RlcModeWsQci1_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Srb", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsSrb(String value) {
        return new JAXBElement<String>(_RlcModeWsSrb_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci7IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci9", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci9(String value) {
        return new JAXBElement<String>(_RlcModeWsQci9_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci8(String value) {
        return new JAXBElement<String>(_RlcModeWsQci8_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci1IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci1IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci7", scope = PollByteWs.class)
    public JAXBElement<String> createPollByteWsQci7(String value) {
        return new JAXBElement<String>(_RlcModeWsQci7_QNAME, String.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci8IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci8IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Qci4IsDefault", scope = PollByteWs.class)
    public JAXBElement<Boolean> createPollByteWsQci4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RlcModeWsQci4IsDefault_QNAME, Boolean.class, PollByteWs.class, value);
    }

}
