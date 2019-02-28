
package Netspan.NBI_14_50.API.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import Netspan.API.Lte.MobilityConnectedModeStopGaps;
import Netspan.API.Lte.MobilityConnectedModeTriggerGaps;
import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.ClockSources;
import Netspan.API.Enums.ConnectedModeEventTypes;
import Netspan.API.Enums.EnabledStates;
import Netspan.API.Enums.EnbTypes;
import Netspan.API.Enums.HandoverType;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.NodeManagementModes;
import Netspan.API.Enums.PnpModes;
import Netspan.API.Enums.SecurityProfileOptionalOrMandatory;
import Netspan.API.Enums.SnmpAgentVersion;
import Netspan.API.Enums.SonAnrStates;
import Netspan.API.Enums.StopGapEventTypes;
import Netspan.API.Enums.TriggerGapEventTypes;
import Netspan.API.Enums.TriggerQuantityTypes;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_14_50.API.Lte package. 
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
    private final static QName _Enb3RdPartyEnbId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbId");
    private final static QName _Enb3RdPartyBandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bandwidth");
    private final static QName _Enb3RdPartyCellIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity");
    private final static QName _Enb3RdPartyPhysicalLayerIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerIdentity");
    private final static QName _Enb3RdPartyPhysicalLayerCellGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalLayerCellGroup");
    private final static QName _Enb3RdPartyLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Latitude");
    private final static QName _Enb3RdPartyEnbType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnbType");
    private final static QName _Enb3RdPartyDlEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlEarfcn");
    private final static QName _Enb3RdPartyLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "Longitude");
    private final static QName _Enb3RdPartyCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _Enb3RdPartyTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "Tac");
    private final static QName _QosEarfcnEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Earfcn");
    private final static QName _AnrWsNrtSteadyThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NrtSteadyThresholdIsDefault");
    private final static QName _AnrWsNrtSteadyThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "NrtSteadyThreshold");
    private final static QName _EsonMroWsHoKpiReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoKpiReportInterval");
    private final static QName _EsonMroWsHoKpiReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoKpiReportIntervalIsDefault");
    private final static QName _EsonMroWsHoReportEvaluationTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoReportEvaluationTimer");
    private final static QName _EsonMroWsHoReportEvaluationTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoReportEvaluationTimerIsDefault");
    private final static QName _MobilityIdleModeInterFreqReselectionPriorityEntryWsPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "Priority");
    private final static QName _UtranProfilePrimaryDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryDuplexMode");
    private final static QName _UtranProfilePrimaryArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryArfcn");
    private final static QName _UtranProfileSecondaryDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryDuplexMode");
    private final static QName _UtranProfilePrimaryArfcnBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryArfcnBand");
    private final static QName _UtranProfileSecondaryArfcnBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryArfcnBand");
    private final static QName _UtranProfileUtranEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtranEnabled");
    private final static QName _UtranProfileSecondaryArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryArfcn");
    private final static QName _RrcTimersWsDefaultPagingCycle_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultPagingCycle");
    private final static QName _RrcTimersWsDefaultPagingCycleIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultPagingCycleIsDefault");
    private final static QName _LteAddNeighbourWsHoControlState_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoControlState");
    private final static QName _LteAddNeighbourWsQOffsetRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "QOffsetRange");
    private final static QName _LteAddNeighbourWsIsStaticNeighbour_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStaticNeighbour");
    private final static QName _LteAddNeighbourWsHandoverType_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverType");
    private final static QName _LteAddNeighbourWsX2ControlState_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2ControlState");
    private final static QName _AutoPciWsPciConfusionAllowedIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciConfusionAllowedIsDefault");
    private final static QName _AutoPciWsUeCollisionResolutionThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeCollisionResolutionThresholdIsDefault");
    private final static QName _AutoPciWsPciAllocPolicy_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciAllocPolicy");
    private final static QName _AutoPciWsCollisionResolutionDelayfactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "CollisionResolutionDelayfactor");
    private final static QName _AutoPciWsPciAllocPolicyIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciAllocPolicyIsDefault");
    private final static QName _AutoPciWsPciConfusionAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciConfusionAllowed");
    private final static QName _AutoPciWsPciCollisionResolutionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciCollisionResolutionTimerIsDefault");
    private final static QName _AutoPciWsInitialPciListSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPciListSize");
    private final static QName _AutoPciWsPciCollisionResolutionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciCollisionResolutionTimer");
    private final static QName _AutoPciWsInitialPciListSizeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialPciListSizeIsDefault");
    private final static QName _AutoPciWsUeCollisionResolutionThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeCollisionResolutionThreshold");
    private final static QName _AutoPciWsCollisionResolutionDelayfactorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CollisionResolutionDelayfactorIsDefault");
    private final static QName _ResourceStatusCbrQci5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci5IsDefault");
    private final static QName _ResourceStatusHwMediumThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwMediumThreshold");
    private final static QName _ResourceStatusMaxAllowedMeasIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAllowedMeasIsDefault");
    private final static QName _ResourceStatusCapacityClassValueIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityClassValueIsDefault");
    private final static QName _ResourceStatusCbrQci8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci8IsDefault");
    private final static QName _ResourceStatusS1BandwidthIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1BandwidthIsDefault");
    private final static QName _ResourceStatusS1MediumThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1MediumThreshold");
    private final static QName _ResourceStatusCapacityClassValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityClassValue");
    private final static QName _ResourceStatusHwLowThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwLowThreshold");
    private final static QName _ResourceStatusCbrQci6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci6IsDefault");
    private final static QName _ResourceStatusS1HighThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1HighThresholdIsDefault");
    private final static QName _ResourceStatusS1LowThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1LowThreshold");
    private final static QName _ResourceStatusMaxAllowedMeas_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAllowedMeas");
    private final static QName _ResourceStatusHwHighThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwHighThreshold");
    private final static QName _ResourceStatusHwLowThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwLowThresholdIsDefault");
    private final static QName _ResourceStatusS1Bandwidth_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1Bandwidth");
    private final static QName _ResourceStatusCbrQci9_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci9");
    private final static QName _ResourceStatusCbrQci8_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci8");
    private final static QName _ResourceStatusCbrQci7_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci7");
    private final static QName _ResourceStatusCbrQci6_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci6");
    private final static QName _ResourceStatusCbrQci5_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci5");
    private final static QName _ResourceStatusCbrQci9IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci9IsDefault");
    private final static QName _ResourceStatusS1HighThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1HighThreshold");
    private final static QName _ResourceStatusMeasSampleInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasSampleInterval");
    private final static QName _ResourceStatusMeasSampleIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeasSampleIntervalIsDefault");
    private final static QName _ResourceStatusHwMediumThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwMediumThresholdIsDefault");
    private final static QName _ResourceStatusCbrQci7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CbrQci7IsDefault");
    private final static QName _ResourceStatusS1LowThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1LowThresholdIsDefault");
    private final static QName _ResourceStatusHwHighThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HwHighThresholdIsDefault");
    private final static QName _ResourceStatusS1MediumThresholdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1MediumThresholdIsDefault");
    private final static QName _ReselectionToUtranWsReselectionUtranSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtranSfMediumIsDefault");
    private final static QName _ReselectionToUtranWsReselectionUtranSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtranSfHighIsDefault");
    private final static QName _ReselectionToUtranWsReselectionUtranSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtranSfMedium");
    private final static QName _ReselectionToUtranWsReselectionUtranSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionUtranSfHigh");
    private final static QName _SynchronisationWsWimaxCoexistenceFrameShiftIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WimaxCoexistenceFrameShiftIsDefault");
    private final static QName _SynchronisationWsWimaxCoexistenceFrameShift_QNAME = new QName("http://Airspan.Netspan.WebServices", "WimaxCoexistenceFrameShift");
    private final static QName _UplinkPowerControlWsDeltaPreambleMsg3_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaPreambleMsg3");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2A_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2a");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1IsDefault");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2BIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2bIsDefault");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2B_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2b");
    private final static QName _UplinkPowerControlWsP0NominalPucchIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPucchIsDefault");
    private final static QName _UplinkPowerControlWsFilterCoefficientIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FilterCoefficientIsDefault");
    private final static QName _UplinkPowerControlWsAlpha_QNAME = new QName("http://Airspan.Netspan.WebServices", "Alpha");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat1B_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1b");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat1BIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1bIsDefault");
    private final static QName _UplinkPowerControlWsP0NominalPuschIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPuschIsDefault");
    private final static QName _UplinkPowerControlWsDeltaPreambleMsg3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaPreambleMsg3IsDefault");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2IsDefault");
    private final static QName _UplinkPowerControlWsFilterCoefficient_QNAME = new QName("http://Airspan.Netspan.WebServices", "FilterCoefficient");
    private final static QName _UplinkPowerControlWsP0NominalPucch_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPucch");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2AIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2aIsDefault");
    private final static QName _UplinkPowerControlWsP0NominalPusch_QNAME = new QName("http://Airspan.Netspan.WebServices", "P0NominalPusch");
    private final static QName _UplinkPowerControlWsAlphaIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AlphaIsDefault");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat1");
    private final static QName _UplinkPowerControlWsDeltaFPucchFormat2_QNAME = new QName("http://Airspan.Netspan.WebServices", "DeltaFPucchFormat2");
    private final static QName _MobilityWsFiltercoefficientRsrpIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrpIsDefault");
    private final static QName _MobilityWsFiltercoefficientRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrp");
    private final static QName _MobilityWsFiltercoefficientRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrq");
    private final static QName _MobilityWsMaxReportCellsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxReportCellsIsDefault");
    private final static QName _MobilityWsReportAmount_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportAmount");
    private final static QName _MobilityWsMaxReportCells_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxReportCells");
    private final static QName _MobilityWsFiltercoefficientRsrqIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "FiltercoefficientRsrqIsDefault");
    private final static QName _MobilityWsReportAmountIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReportAmountIsDefault");
    private final static QName _CellVolteConfigurationWsDlaAckStepDownFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaAckStepDownFactor");
    private final static QName _CellVolteConfigurationWsDlaAckStepDownFactorIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaAckStepDownFactorIsDefault");
    private final static QName _EnbDetailsGetInterfaceToUseForM1_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForM1");
    private final static QName _EnbDetailsGetInterfaceToUseForM2_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForM2");
    private final static QName _EnbDetailsGetMin40MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Min40MHzChannel");
    private final static QName _EnbDetailsGetIsX2UInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2UInterfaceEnabled");
    private final static QName _EnbDetailsGetInterfaceToUseForS1C_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForS1C");
    private final static QName _EnbDetailsGetIsS1CInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1CInterfaceEnabled");
    private final static QName _EnbDetailsGetMax40MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Max40MHzChannel");
    private final static QName _EnbDetailsGetIsX2CInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2CInterfaceEnabled");
    private final static QName _EnbDetailsGetInterfaceToUseForX2U_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForX2U");
    private final static QName _EnbDetailsGetManagedMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagedMode");
    private final static QName _EnbDetailsGetActiveAntenna_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActiveAntenna");
    private final static QName _EnbDetailsGetIsM1InterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM1InterfaceEnabled");
    private final static QName _EnbDetailsGetENodeBID_QNAME = new QName("http://Airspan.Netspan.WebServices", "ENodeBID");
    private final static QName _EnbDetailsGetDefaultX2ControlStateForNeighbours_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultX2ControlStateForNeighbours");
    private final static QName _EnbDetailsGetInterfaceToUseForPtpSlave_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForPtpSlave");
    private final static QName _EnbDetailsGetIsCSonServerInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonServerInterfaceEnabled");
    private final static QName _EnbDetailsGetIsAutoX2ControlForNeighboursEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAutoX2ControlForNeighboursEnabled");
    private final static QName _EnbDetailsGetIsS1UInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1UInterfaceEnabled");
    private final static QName _EnbDetailsGetInterfaceToUseForCSonServer_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForCSonServer");
    private final static QName _EnbDetailsGetIsM2InterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM2InterfaceEnabled");
    private final static QName _EnbDetailsGetInterfaceToUseForManagement_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForManagement");
    private final static QName _EnbDetailsGetMin20MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Min20MHzChannel");
    private final static QName _EnbDetailsGetIsPtpSlaveInterfaceEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPtpSlaveInterfaceEnabled");
    private final static QName _EnbDetailsGetInterfaceToUseForS1U_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForS1U");
    private final static QName _EnbDetailsGetInterfaceToUseForX2C_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterfaceToUseForX2C");
    private final static QName _EnbDetailsGetIsX2ConfigurationUpdateForNeighboursEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2ConfigurationUpdateForNeighboursEnabled");
    private final static QName _EnbDetailsGetMax20MHzChannel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Max20MHzChannel");
    private final static QName _LteCSonEntryWsIsCSonConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonConfigured");
    private final static QName _LteCSonEntryWsCSonServerPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonServerPort");
    private final static QName _LteCellSetWsIsSignalingAccessClass13Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass13Barred");
    private final static QName _LteCellSetWsIsSignalingAccessClass14Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass14Barred");
    private final static QName _LteCellSetWsEmergencyAreaId_QNAME = new QName("http://Airspan.Netspan.WebServices", "EmergencyAreaId");
    private final static QName _LteCellSetWsDataAccessBarringFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataAccessBarringFactor");
    private final static QName _LteCellSetWsIsSignalingAccessClass15Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass15Barred");
    private final static QName _LteCellSetWsSignalingAccessBarringFactor_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalingAccessBarringFactor");
    private final static QName _LteCellSetWsCellID_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellID");
    private final static QName _LteCellSetWsIsDataAccessClass12Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass12Barred");
    private final static QName _LteCellSetWsIsSignalingAccessClass12Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass12Barred");
    private final static QName _LteCellSetWsIsEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEnabled");
    private final static QName _LteCellSetWsPrachRsi_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachRsi");
    private final static QName _LteCellSetWsIsDataAccessClass11Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass11Barred");
    private final static QName _LteCellSetWsIsSignalingAccessClass11Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessClass11Barred");
    private final static QName _LteCellSetWsPrachFreqOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachFreqOffset");
    private final static QName _LteCellSetWsIsEmergencyAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsEmergencyAccessBarred");
    private final static QName _LteCellSetWsIsDataAccessClass14Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass14Barred");
    private final static QName _LteCellSetWsIsSignalingAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsSignalingAccessBarred");
    private final static QName _LteCellSetWsIsDataAccessBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessBarred");
    private final static QName _LteCellSetWsIsDataAccessClass13Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass13Barred");
    private final static QName _LteCellSetWsTrackingAreaCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "TrackingAreaCode");
    private final static QName _LteCellSetWsIsAccessClassBarred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsAccessClassBarred");
    private final static QName _LteCellSetWsIsDataAccessClass15Barred_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsDataAccessClass15Barred");
    private final static QName _LteCellSetWsSignalingAccessBarringTimeInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalingAccessBarringTimeInSec");
    private final static QName _LteCellSetWsDataAccessBarringTimeInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataAccessBarringTimeInSec");
    private final static QName _EnbEmbmsProfileHardwareCategory_QNAME = new QName("http://Airspan.Netspan.WebServices", "HardwareCategory");
    private final static QName _RsiRangeRsiStep_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiStep");
    private final static QName _RsiRangeRsiStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiStart");
    private final static QName _RsiRangeRsiListSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiListSize");
    private final static QName _EnbNetworkProfileX2UVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2UVlanId");
    private final static QName _EnbNetworkProfileIsStandardVoLTECodec_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsStandardVoLTECodec");
    private final static QName _EnbNetworkProfilePacketPeriodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketPeriodicity");
    private final static QName _EnbNetworkProfileMceSctpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "MceSctpPort");
    private final static QName _EnbNetworkProfileS1UVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UVlanId");
    private final static QName _EnbNetworkProfileM2McePresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2McePresent");
    private final static QName _EnbNetworkProfileIsM2VlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM2VlanConfigured");
    private final static QName _EnbNetworkProfileIsMgmtVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsMgmtVlanConfigured");
    private final static QName _EnbNetworkProfileCodecMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "CodecMode");
    private final static QName _EnbNetworkProfileX2CVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2CVlanId");
    private final static QName _EnbNetworkProfileCSonVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonVlanId");
    private final static QName _EnbNetworkProfileMgmtVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "MgmtVlanId");
    private final static QName _EnbNetworkProfileM2VlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2VlanId");
    private final static QName _EnbNetworkProfileCodecType_QNAME = new QName("http://Airspan.Netspan.WebServices", "CodecType");
    private final static QName _EnbNetworkProfileIsX2UVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2UVlanConfigured");
    private final static QName _EnbNetworkProfileM1VlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "M1VlanId");
    private final static QName _EnbNetworkProfileIsCSonVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonVlanConfigured");
    private final static QName _EnbNetworkProfilePtpVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpVlanId");
    private final static QName _EnbNetworkProfilePacketSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketSize");
    private final static QName _EnbNetworkProfileS1CVlanId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1CVlanId");
    private final static QName _EnbNetworkProfileIsX2CVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsX2CVlanConfigured");
    private final static QName _EnbNetworkProfileIsPtpVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPtpVlanConfigured");
    private final static QName _EnbNetworkProfileIsS1UVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1UVlanConfigured");
    private final static QName _EnbNetworkProfileIsM1VlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsM1VlanConfigured");
    private final static QName _EnbNetworkProfileIsRohcProfilesQci1Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsRohcProfilesQci1Enabled");
    private final static QName _EnbNetworkProfileIsS1CVlanConfigured_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsS1CVlanConfigured");
    private final static QName _EnbSonProfileAnrState_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrState");
    private final static QName _EnbSonProfilePciEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciEnabled");
    private final static QName _EnbSonProfileSonCommissioningEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "SonCommissioningEnabled");
    private final static QName _EnbSonProfileAnrEnbPciMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnrEnbPciMode");
    private final static QName _EnbSonProfileRsiEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsiEnabled");
    private final static QName _EnbSonProfileMinAllowedHoSuccessRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinAllowedHoSuccessRate");
    private final static QName _EnbSonProfilePnpMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpMode");
    private final static QName _MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeToTrigger");
    private final static QName _MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME = new QName("http://Airspan.Netspan.WebServices", "TriggerQuantity");
    private final static QName _MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpEventThreshold1");
    private final static QName _MobilityConnectedModeTriggerGapsEventType_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventType");
    private final static QName _MobilityConnectedModeTriggerGapsHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hysteresis");
    private final static QName _MobilityUtranReselectionPriorityEntryWsArfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "Arfcn");
    private final static QName _MobilityUtranReselectionPriorityEntryWsDuplexMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "DuplexMode");
    private final static QName _CsfbCdma2KCellParamsSectorNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "SectorNumber");
    private final static QName _CsfbCdma2KCellParamsSwitchNum_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwitchNum");
    private final static QName _CsfbCdma2KCellParamsMarketId_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarketId");
    private final static QName _CsfbCdma2KCellParamsBandClass_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClass");
    private final static QName _CsfbCdma2KMobilityParamsPRevIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PRevIncluded");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc12_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc12");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc11_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc11");
    private final static QName _CsfbCdma2KMobilityParamsTAddIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TAddIncluded");
    private final static QName _CsfbCdma2KMobilityParamsEncryptMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncryptMode");
    private final static QName _CsfbCdma2KMobilityParamsPzHystEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystEnabled");
    private final static QName _CsfbCdma2KMobilityParamsPacketZoneId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketZoneId");
    private final static QName _CsfbCdma2KMobilityParamsPowerDownRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerDownRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPilotReport_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotReport");
    private final static QName _CsfbCdma2KMobilityParamsMultNidsIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultNidsIncluded");
    private final static QName _CsfbCdma2KMobilityParamsHomeRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "HomeRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsForSidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForSidReg");
    private final static QName _CsfbCdma2KMobilityParamsForNidRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForNidRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegDist_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegDist");
    private final static QName _CsfbCdma2KMobilityParamsPilotIncIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotIncIncluded");
    private final static QName _CsfbCdma2KMobilityParamsZoneTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZoneTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsImsi1112Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "Imsi1112Included");
    private final static QName _CsfbCdma2KMobilityParamsRerModeSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "RerModeSupported");
    private final static QName _CsfbCdma2KMobilityParamsBypassRegIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BypassRegIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAutoFcsoAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoFcsoAllowed");
    private final static QName _CsfbCdma2KMobilityParamsMobQos_QNAME = new QName("http://Airspan.Netspan.WebServices", "MobQos");
    private final static QName _CsfbCdma2KMobilityParamsBandClassInfoReqIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassInfoReqIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPilotInc_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotInc");
    private final static QName _CsfbCdma2KMobilityParamsAltBandClassIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AltBandClassIncluded");
    private final static QName _CsfbCdma2KMobilityParamsHomeReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "HomeReg");
    private final static QName _CsfbCdma2KMobilityParamsUseSyncId_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseSyncId");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupInclIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupInclIncluded");
    private final static QName _CsfbCdma2KMobilityParamsDayLt_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayLt");
    private final static QName _CsfbCdma2KMobilityParamsMaxAddServInstance_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAddServInstance");
    private final static QName _CsfbCdma2KMobilityParamsSigEncryptSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigEncryptSup");
    private final static QName _CsfbCdma2KMobilityParamsPzIdHystParametersIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzIdHystParametersIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTkzIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsLtmOffIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "LtmOffIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTotalZones_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZones");
    private final static QName _CsfbCdma2KMobilityParamsMsgIntegritySup_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsgIntegritySup");
    private final static QName _CsfbCdma2KMobilityParamsMaxNumAltSoIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxNumAltSoIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsgIntegritySupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsgIntegritySupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegPrdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegPrdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRandIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RandIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPowerDownReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerDownReg");
    private final static QName _CsfbCdma2KMobilityParamsImsiTSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ImsiTSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegPrd_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegPrd");
    private final static QName _CsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "Gcsnal2AckTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPzHystListLen_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystListLen");
    private final static QName _CsfbCdma2KMobilityParamsGcsnaSequenceContextTimerIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "GcsnaSequenceContextTimerIncluded");
    private final static QName _CsfbCdma2KMobilityParamsLtmOff_QNAME = new QName("http://Airspan.Netspan.WebServices", "LtmOff");
    private final static QName _CsfbCdma2KMobilityParamsMultSids_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultSids");
    private final static QName _CsfbCdma2KMobilityParamsSid_QNAME = new QName("http://Airspan.Netspan.WebServices", "Sid");
    private final static QName _CsfbCdma2KMobilityParamsReconnectMsgIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReconnectMsgIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc5_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc5");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupIncl_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupIncl");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc3_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc3");
    private final static QName _CsfbCdma2KMobilityParamsFpcFchInitSetPtRc4_QNAME = new QName("http://Airspan.Netspan.WebServices", "FpcFchInitSetPtRc4");
    private final static QName _CsfbCdma2KMobilityParamsMccIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MccIncluded");
    private final static QName _CsfbCdma2KMobilityParamsLpSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "LpSec");
    private final static QName _CsfbCdma2KMobilityParamsSdbInRcnmInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbInRcnmInd");
    private final static QName _CsfbCdma2KMobilityParamsBandClassIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMeidReqdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeidReqdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySup_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySup");
    private final static QName _CsfbCdma2KMobilityParamsMultNids_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultNids");
    private final static QName _CsfbCdma2KMobilityParamsMaxAddServInstanceIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxAddServInstanceIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPacketZoneIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PacketZoneIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsGcsnaSequenceContextTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "GcsnaSequenceContextTimer");
    private final static QName _CsfbCdma2KMobilityParamsSdbInRcnmIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbInRcnmIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSidIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SidIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTAdd_QNAME = new QName("http://Airspan.Netspan.WebServices", "TAdd");
    private final static QName _CsfbCdma2KMobilityParamsSdbSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSigIntegritySupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigIntegritySupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegZone");
    private final static QName _CsfbCdma2KMobilityParamsRerModeSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RerModeSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsZoneTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZoneTimer");
    private final static QName _CsfbCdma2KMobilityParamsBypassRegInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "BypassRegInd");
    private final static QName _CsfbCdma2KMobilityParamsGcsnal2AckTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "Gcsnal2AckTimer");
    private final static QName _CsfbCdma2KMobilityParamsMaxNumAltSo_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxNumAltSo");
    private final static QName _CsfbCdma2KMobilityParamsSdbSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "SdbSupported");
    private final static QName _CsfbCdma2KMobilityParamsReconnectMsgInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReconnectMsgInd");
    private final static QName _CsfbCdma2KMobilityParamsPowerUpRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerUpRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAuthIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AuthIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsInitPosLocSupIndIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsInitPosLocSupIndIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMinPRevIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinPRevIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMeidReqd_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeidReqd");
    private final static QName _CsfbCdma2KMobilityParamsMultSidsIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultSidsIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPzHystActTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystActTimer");
    private final static QName _CsfbCdma2KMobilityParamsNid_QNAME = new QName("http://Airspan.Netspan.WebServices", "Nid");
    private final static QName _CsfbCdma2KMobilityParamsAltBandClass_QNAME = new QName("http://Airspan.Netspan.WebServices", "AltBandClass");
    private final static QName _CsfbCdma2KMobilityParamsPzHystTimerMul_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystTimerMul");
    private final static QName _CsfbCdma2KMobilityParamsForSidRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForSidRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rand");
    private final static QName _CsfbCdma2KMobilityParamsTkzModeSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzModeSupported");
    private final static QName _CsfbCdma2KMobilityParamsEncSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncSupported");
    private final static QName _CsfbCdma2KMobilityParamsEncryptModeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncryptModeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPrefMsidType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrefMsidType");
    private final static QName _CsfbCdma2KMobilityParamsTotalZonesIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZonesIncluded");
    private final static QName _CsfbCdma2KMobilityParamsTkzId_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzId");
    private final static QName _CsfbCdma2KMobilityParamsEncSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "EncSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPRev_QNAME = new QName("http://Airspan.Netspan.WebServices", "PRev");
    private final static QName _CsfbCdma2KMobilityParamsParameterReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ParameterReg");
    private final static QName _CsfbCdma2KMobilityParamsAuth_QNAME = new QName("http://Airspan.Netspan.WebServices", "Auth");
    private final static QName _CsfbCdma2KMobilityParamsMobQosIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "MobQosIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPowerUpReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerUpReg");
    private final static QName _CsfbCdma2KMobilityParamsNegSlotCycleIndexSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "NegSlotCycleIndexSup");
    private final static QName _CsfbCdma2KMobilityParamsForNidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForNidReg");
    private final static QName _CsfbCdma2KMobilityParamsBandClassInfoReq_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandClassInfoReq");
    private final static QName _CsfbCdma2KMobilityParamsExtPrefMsidType_QNAME = new QName("http://Airspan.Netspan.WebServices", "ExtPrefMsidType");
    private final static QName _CsfbCdma2KMobilityParamsPzHystInfoIncl_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystInfoIncl");
    private final static QName _CsfbCdma2KMobilityParamsUseSyncIdIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseSyncIdIncluded");
    private final static QName _CsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "NegSlotCycleIndexSupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegDistIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegDistIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMcc_QNAME = new QName("http://Airspan.Netspan.WebServices", "Mcc");
    private final static QName _CsfbCdma2KMobilityParamsNidIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "NidIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMinPRev_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinPRev");
    private final static QName _CsfbCdma2KMobilityParamsParameterRegIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ParameterRegIncluded");
    private final static QName _CsfbCdma2KMobilityParamsSigEncryptSupIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "SigEncryptSupIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPrefMsidTypeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrefMsidTypeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsImsi1112_QNAME = new QName("http://Airspan.Netspan.WebServices", "Imsi1112");
    private final static QName _CsfbCdma2KMobilityParamsPilotReportIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "PilotReportIncluded");
    private final static QName _CsfbCdma2KMobilityParamsRegZoneIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegZoneIncluded");
    private final static QName _CsfbCdma2KMobilityParamsMsInitPosLocSupInd_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsInitPosLocSupInd");
    private final static QName _CsfbCdma2KMobilityParamsImsiTSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "ImsiTSupported");
    private final static QName _CsfbCdma2KMobilityParamsTkzModeSupportedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "TkzModeSupportedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsAutoFcsoAllowedIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoFcsoAllowedIncluded");
    private final static QName _CsfbCdma2KMobilityParamsLpSecIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "LpSecIncluded");
    private final static QName _CsfbCdma2KMobilityParamsExtPrefMsidTypeIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "ExtPrefMsidTypeIncluded");
    private final static QName _CsfbCdma2KMobilityParamsPzHystTimerExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "PzHystTimerExp");
    private final static QName _CsfbCdma2KMobilityParamsDayLtIncluded_QNAME = new QName("http://Airspan.Netspan.WebServices", "DayLtIncluded");
    private final static QName _CellNeighborManagementWsHoAttemptsTh_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoAttemptsTh");
    private final static QName _CellNeighborManagementWsHoAttemptsThIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoAttemptsThIsDefault");
    private final static QName _MobilityInterRatGeranReselectionIsPMaxGeranNotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPMaxGeranNotPresent");
    private final static QName _MobilityInterRatGeranReselectionQRxLevMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QRxLevMin");
    private final static QName _MobilityInterRatGeranReselectionThreshXLow_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLow");
    private final static QName _MobilityInterRatGeranReselectionPMaxGeran_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMaxGeran");
    private final static QName _MobilityInterRatGeranReselectionThreshXHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHigh");
    private final static QName _MobilityInterRatGeranReselectionTReselectionGeran_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionGeran");
    private final static QName _MobilityConnectedModeFreqRsrpEventThreshold2_QNAME = new QName("http://Airspan.Netspan.WebServices", "RsrpEventThreshold2");
    private final static QName _MobilityConnectedModeFreqA3Offset_QNAME = new QName("http://Airspan.Netspan.WebServices", "A3Offset");
    private final static QName _TrafficManagementProfileDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "DataInactivityTimer");
    private final static QName _TrafficManagementProfileLoadSheddingMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "LoadSheddingMode");
    private final static QName _TrafficManagementProfileMaxDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDataInactivityTimer");
    private final static QName _TrafficManagementProfileUeOverloadHysteresis_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeOverloadHysteresis");
    private final static QName _TrafficManagementProfileUeOverloadThreshold_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeOverloadThreshold");
    private final static QName _TrafficManagementProfileStepDown_QNAME = new QName("http://Airspan.Netspan.WebServices", "StepDown");
    private final static QName _TrafficManagementProfileStepUp_QNAME = new QName("http://Airspan.Netspan.WebServices", "StepUp");
    private final static QName _TrafficManagementProfileMonitorInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "MonitorInterval");
    private final static QName _TrafficManagementProfileMinDataInactivityTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MinDataInactivityTimer");
    private final static QName _EnbMobilityProfileCsfbUtranEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbUtranEnabled");
    private final static QName _EnbMobilityProfileIsThresholdBasedMeasurementEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsThresholdBasedMeasurementEnabled");
    private final static QName _EnbMobilityProfileCsfbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbEnabled");
    private final static QName _EnbMobilityProfileIsInterRatGeranReselectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatGeranReselectionModeEnabled");
    private final static QName _EnbMobilityProfileUseConnectedModeIntraPropertiesForInter_QNAME = new QName("http://Airspan.Netspan.WebServices", "UseConnectedModeIntraPropertiesForInter");
    private final static QName _EnbMobilityProfileFwdHoEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "FwdHoEnabled");
    private final static QName _EnbMobilityProfileIsInterRatUtranReselectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatUtranReselectionModeEnabled");
    private final static QName _EnbMobilityProfileIsInterRatUtranCoverageBasedRedirectionModeEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsInterRatUtranCoverageBasedRedirectionModeEnabled");
    private final static QName _EnbMobilityProfileIsQosBasedMeasurementEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsQosBasedMeasurementEnabled");
    private final static QName _EnbMobilityProfileCsfbCdma2KEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CsfbCdma2kEnabled");
    private final static QName _LteUlPktDataPriorityEntryWsDscp_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dscp");
    private final static QName _LteUlPktDataPriorityEntryWsVlanPcp_QNAME = new QName("http://Airspan.Netspan.WebServices", "VlanPcp");
    private final static QName _EmbmsWsMbmsLowRsrpTh_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsLowRsrpTh");
    private final static QName _EmbmsWsMbmsLowRsrpThIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsLowRsrpThIsDefault");
    private final static QName _EmbmsWsSfnOffsetIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfnOffsetIsDefault");
    private final static QName _EmbmsWsMcchUpdateTimeOffset512IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "McchUpdateTimeOffset512IsDefault");
    private final static QName _EmbmsWsMbmsHighRsrpTh_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsHighRsrpTh");
    private final static QName _EmbmsWsSynchronizationSequence_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationSequence");
    private final static QName _EmbmsWsLeapSecondsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeapSecondsIsDefault");
    private final static QName _EmbmsWsMcchUpdateTimeOffset1024IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "McchUpdateTimeOffset1024IsDefault");
    private final static QName _EmbmsWsMbmsScheduleDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsScheduleDelay");
    private final static QName _EmbmsWsTimeStampOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeStampOffset");
    private final static QName _EmbmsWsMcchUpdateTimeOffset1024_QNAME = new QName("http://Airspan.Netspan.WebServices", "McchUpdateTimeOffset1024");
    private final static QName _EmbmsWsMbmsHighRsrpThIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsHighRsrpThIsDefault");
    private final static QName _EmbmsWsTimeStampOffsetIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TimeStampOffsetIsDefault");
    private final static QName _EmbmsWsM2KeepAlivePeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2KeepAlivePeriod");
    private final static QName _EmbmsWsSfnOffset_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfnOffset");
    private final static QName _EmbmsWsSynchronizationPeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationPeriodIsDefault");
    private final static QName _EmbmsWsSynchronizationPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationPeriod");
    private final static QName _EmbmsWsLeapSeconds_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeapSeconds");
    private final static QName _EmbmsWsSynchronizationSequenceIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SynchronizationSequenceIsDefault");
    private final static QName _EmbmsWsM2KeepAlivePeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2KeepAlivePeriodIsDefault");
    private final static QName _EmbmsWsMcchUpdateTimeOffset512_QNAME = new QName("http://Airspan.Netspan.WebServices", "McchUpdateTimeOffset512");
    private final static QName _EmbmsWsMbmsScheduleDelayIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MbmsScheduleDelayIsDefault");
    private final static QName _CellRrcTimersWsN311IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "N311IsDefault");
    private final static QName _CellRrcTimersWsNbIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NbIsDefault");
    private final static QName _CellRrcTimersWsT301_QNAME = new QName("http://Airspan.Netspan.WebServices", "T301");
    private final static QName _CellRrcTimersWsT304_QNAME = new QName("http://Airspan.Netspan.WebServices", "T304");
    private final static QName _CellRrcTimersWsT301IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T301IsDefault");
    private final static QName _CellRrcTimersWsT304IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T304IsDefault");
    private final static QName _CellRrcTimersWsT320_QNAME = new QName("http://Airspan.Netspan.WebServices", "T320");
    private final static QName _CellRrcTimersWsT300IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T300IsDefault");
    private final static QName _CellRrcTimersWsT300_QNAME = new QName("http://Airspan.Netspan.WebServices", "T300");
    private final static QName _CellRrcTimersWsT310IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T310IsDefault");
    private final static QName _CellRrcTimersWsT320IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T320IsDefault");
    private final static QName _CellRrcTimersWsT310_QNAME = new QName("http://Airspan.Netspan.WebServices", "T310");
    private final static QName _CellRrcTimersWsT311_QNAME = new QName("http://Airspan.Netspan.WebServices", "T311");
    private final static QName _CellRrcTimersWsN310IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "N310IsDefault");
    private final static QName _CellRrcTimersWsT311IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "T311IsDefault");
    private final static QName _CellRrcTimersWsN311_QNAME = new QName("http://Airspan.Netspan.WebServices", "N311");
    private final static QName _CellRrcTimersWsN310_QNAME = new QName("http://Airspan.Netspan.WebServices", "N310");
    private final static QName _CellRrcTimersWsNb_QNAME = new QName("http://Airspan.Netspan.WebServices", "Nb");
    private final static QName _LteCellGetWsCellIdentity28Bit_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellIdentity28Bit");
    private final static QName _LteCellGetWsPhysicalCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "PhysicalCellId");
    private final static QName _PnpDetailWsHardware_QNAME = new QName("http://Airspan.Netspan.WebServices", "Hardware");
    private final static QName _PnpDetailWsSnmpv3Access_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snmpv3Access");
    private final static QName _PnpDetailWsPnpLatitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatitude");
    private final static QName _PnpDetailWsSnmpVersion_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpVersion");
    private final static QName _PnpDetailWsPnpLongitude_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLongitude");
    private final static QName _PnpDetailWsSnmpTimeoutInMilliSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpTimeoutInMilliSec");
    private final static QName _PnpDetailWsPnpLatLongRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnpLatLongRadius");
    private final static QName _PnpDetailWsSnmpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SnmpPort");
    private final static QName _NetworkingWsMtuIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MtuIsDefault");
    private final static QName _NetworkingWsSctpHBeatIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpHBeatIntervalIsDefault");
    private final static QName _NetworkingWsSctpHBeatInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpHBeatInterval");
    private final static QName _NetworkingWsMtu_QNAME = new QName("http://Airspan.Netspan.WebServices", "Mtu");
    private final static QName _MobilityIdleModeInterFreqThreshXHighQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHighQr9");
    private final static QName _MobilityIdleModeInterFreqPMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMax");
    private final static QName _MobilityIdleModeInterFreqThreshXLowQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLowQr9");
    private final static QName _MobilityIdleModeInterFreqCellReselectionPriority_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellReselectionPriority");
    private final static QName _MobilityIdleModeInterFreqThreshXLowP_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXLowP");
    private final static QName _MobilityIdleModeInterFreqQQualMinr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "QQualMinr9");
    private final static QName _MobilityIdleModeInterFreqIsPMaxNotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsPMaxNotPresent");
    private final static QName _MobilityIdleModeInterFreqIsQQualMinr9NotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsQQualMinr9NotPresent");
    private final static QName _MobilityIdleModeInterFreqTReselectionEutra_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionEutra");
    private final static QName _MobilityIdleModeInterFreqThreshXHighP_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXHighP");
    private final static QName _MobilityIdleModeInterFreqQRxLevelMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QRxLevelMin");
    private final static QName _VolteConfigurationWsActivateVolteDataInactivityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActivateVolteDataInactivityIsDefault");
    private final static QName _VolteConfigurationWsDlaForceVolteTdIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaForceVolteTdIsDefault");
    private final static QName _VolteConfigurationWsAdditionalBitsForFixedAllocationsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalBitsForFixedAllocationsIsDefault");
    private final static QName _VolteConfigurationWsRohcRatio_QNAME = new QName("http://Airspan.Netspan.WebServices", "RohcRatio");
    private final static QName _VolteConfigurationWsEnableVolteFixedAllocations_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableVolteFixedAllocations");
    private final static QName _VolteConfigurationWsAllowDlDcchDtchIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowDlDcchDtchIsDefault");
    private final static QName _VolteConfigurationWsMaxVolteUesPerUlTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxVolteUesPerUlTti");
    private final static QName _VolteConfigurationWsAllowDlDcchDtch_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowDlDcchDtch");
    private final static QName _VolteConfigurationWsNumberofVoltePacketsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberofVoltePacketsIsDefault");
    private final static QName _VolteConfigurationWsLowUlBlerForVolte_QNAME = new QName("http://Airspan.Netspan.WebServices", "LowUlBlerForVolte");
    private final static QName _VolteConfigurationWsMaxVolteUesPerUlTtiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxVolteUesPerUlTtiIsDefault");
    private final static QName _VolteConfigurationWsEnableVolteFixedAllocationsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EnableVolteFixedAllocationsIsDefault");
    private final static QName _VolteConfigurationWsActivateVolteDataInactivity_QNAME = new QName("http://Airspan.Netspan.WebServices", "ActivateVolteDataInactivity");
    private final static QName _VolteConfigurationWsMaxVolteUesPerDlTtiIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxVolteUesPerDlTtiIsDefault");
    private final static QName _VolteConfigurationWsNumberofVoltePackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberofVoltePackets");
    private final static QName _VolteConfigurationWsLowUlBlerForVolteIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LowUlBlerForVolteIsDefault");
    private final static QName _VolteConfigurationWsVolteHeaderOverhead_QNAME = new QName("http://Airspan.Netspan.WebServices", "VolteHeaderOverhead");
    private final static QName _VolteConfigurationWsVolteHeaderOverheadIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "VolteHeaderOverheadIsDefault");
    private final static QName _VolteConfigurationWsDlaForceVolteTd_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlaForceVolteTd");
    private final static QName _VolteConfigurationWsMaxVolteUesPerDlTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxVolteUesPerDlTti");
    private final static QName _VolteConfigurationWsAdditionalBitsForFixedAllocations_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalBitsForFixedAllocations");
    private final static QName _VolteConfigurationWsRohcRatioIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RohcRatioIsDefault");
    private final static QName _IPSecConfigWSIpsecEncryption_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecEncryption");
    private final static QName _IPSecConfigWSIpsecSaLifetime_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecSaLifetime");
    private final static QName _IPSecConfigWSDpdDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdDelay");
    private final static QName _IPSecConfigWSIpsecEncryptionIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecEncryptionIsDefault");
    private final static QName _IPSecConfigWSDpdAction_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdAction");
    private final static QName _IPSecConfigWSMarginTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarginTime");
    private final static QName _IPSecConfigWSDpdRetriesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdRetriesIsDefault");
    private final static QName _IPSecConfigWSIkeSaLifetimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IkeSaLifetimeIsDefault");
    private final static QName _IPSecConfigWSIkeSaLifetime_QNAME = new QName("http://Airspan.Netspan.WebServices", "IkeSaLifetime");
    private final static QName _IPSecConfigWSDpdActionIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdActionIsDefault");
    private final static QName _IPSecConfigWSDiffieHellmanGroup_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiffieHellmanGroup");
    private final static QName _IPSecConfigWSMarginTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MarginTimeIsDefault");
    private final static QName _IPSecConfigWSDiffieHellmanGroupIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiffieHellmanGroupIsDefault");
    private final static QName _IPSecConfigWSDpdRetries_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdRetries");
    private final static QName _IPSecConfigWSIpsecSaLifetimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpsecSaLifetimeIsDefault");
    private final static QName _IPSecConfigWSDpdDelayIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DpdDelayIsDefault");
    private final static QName _EmergencyCallWsQCI2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI2IsDefault");
    private final static QName _EmergencyCallWsQCI6_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI6");
    private final static QName _EmergencyCallWsQCI5_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI5");
    private final static QName _EmergencyCallWsQCI4_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI4");
    private final static QName _EmergencyCallWsQCI3_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI3");
    private final static QName _EmergencyCallWsQCI9IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI9IsDefault");
    private final static QName _EmergencyCallWsQCI2_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI2");
    private final static QName _EmergencyCallWsQCI4IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI4IsDefault");
    private final static QName _EmergencyCallWsQCI1_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI1");
    private final static QName _EmergencyCallWsHighestArp_QNAME = new QName("http://Airspan.Netspan.WebServices", "HighestArp");
    private final static QName _EmergencyCallWsHighestArpIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "HighestArpIsDefault");
    private final static QName _EmergencyCallWsQCI5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI5IsDefault");
    private final static QName _EmergencyCallWsPreemptionCapabilityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionCapabilityIsDefault");
    private final static QName _EmergencyCallWsPreemptionVulnerabilityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionVulnerabilityIsDefault");
    private final static QName _EmergencyCallWsQCI8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI8IsDefault");
    private final static QName _EmergencyCallWsQCI3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI3IsDefault");
    private final static QName _EmergencyCallWsQCI7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI7IsDefault");
    private final static QName _EmergencyCallWsPreemptionVulnerability_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionVulnerability");
    private final static QName _EmergencyCallWsQCI6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI6IsDefault");
    private final static QName _EmergencyCallWsRrcConnectedTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcConnectedTimeIsDefault");
    private final static QName _EmergencyCallWsPreemptionCapability_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreemptionCapability");
    private final static QName _EmergencyCallWsQCI1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI1IsDefault");
    private final static QName _EmergencyCallWsRrcConnectedTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcConnectedTime");
    private final static QName _EmergencyCallWsQCI7_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI7");
    private final static QName _EmergencyCallWsQCI8_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI8");
    private final static QName _EmergencyCallWsQCI9_QNAME = new QName("http://Airspan.Netspan.WebServices", "QCI9");
    private final static QName _EnbNeighbourNeighbourType_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourType");
    private final static QName _EnbNeighbourNeighbourCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "NeighbourCellNumber");
    private final static QName _MobilityGeranReselectionPriorityEntryWsBand_QNAME = new QName("http://Airspan.Netspan.WebServices", "Band");
    private final static QName _EnbSecurityProfileNullIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullIntegrityLevel");
    private final static QName _EnbSecurityProfileSecurityForCiphering_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityForCiphering");
    private final static QName _EnbSecurityProfileNullCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "NullCipheringLevel");
    private final static QName _EnbSecurityProfileSshEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "SshEnabled");
    private final static QName _EnbSecurityProfileWebGUIAccessEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "WebGUIAccessEnabled");
    private final static QName _EnbSecurityProfileIpSecEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpSecEnabled");
    private final static QName _EnbSecurityProfileSecurityForIntegrity_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecurityForIntegrity");
    private final static QName _EnbSecurityProfileSnow3GIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snow3GIntegrityLevel");
    private final static QName _EnbSecurityProfileAesIntegrityLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AesIntegrityLevel");
    private final static QName _EnbSecurityProfileAesCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "AesCipheringLevel");
    private final static QName _EnbSecurityProfileSnow3GCipheringLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "Snow3GCipheringLevel");
    private final static QName _EsonWsEsonConnectionRetryTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "EsonConnectionRetryTimer");
    private final static QName _EsonWsConnectionLostMaxRetriesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionLostMaxRetriesIsDefault");
    private final static QName _EsonWsEsonConnectionRetryTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "EsonConnectionRetryTimerIsDefault");
    private final static QName _EsonWsConnectionLostMaxRetries_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectionLostMaxRetries");
    private final static QName _RandomAccessWsMessagePowerOffsetGroupB_QNAME = new QName("http://Airspan.Netspan.WebServices", "MessagePowerOffsetGroupB");
    private final static QName _RandomAccessWsPreambleInitialReceivedTargetPowerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialReceivedTargetPowerIsDefault");
    private final static QName _RandomAccessWsPreambleInitialReceivedTargetPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleInitialReceivedTargetPower");
    private final static QName _RandomAccessWsPrachConfigIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachConfigIndex");
    private final static QName _RandomAccessWsPreambleTransMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleTransMax");
    private final static QName _RandomAccessWsRaResponseWindowSize_QNAME = new QName("http://Airspan.Netspan.WebServices", "RaResponseWindowSize");
    private final static QName _RandomAccessWsMacContentionResolutionTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacContentionResolutionTimer");
    private final static QName _RandomAccessWsMessageSizeGroupAIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MessageSizeGroupAIsDefault");
    private final static QName _RandomAccessWsZeroCorrelationZoneConfigIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZeroCorrelationZoneConfigIsDefault");
    private final static QName _RandomAccessWsPreambleTransMaxIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PreambleTransMaxIsDefault");
    private final static QName _RandomAccessWsNumberOfRaPreamblesIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreamblesIsDefault");
    private final static QName _RandomAccessWsSizeOfRaPreamblesGroupAIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SizeOfRaPreamblesGroupAIsDefault");
    private final static QName _RandomAccessWsPowerRampingStepIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerRampingStepIsDefault");
    private final static QName _RandomAccessWsPrachConfigIndexIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrachConfigIndexIsDefault");
    private final static QName _RandomAccessWsMessageSizeGroupA_QNAME = new QName("http://Airspan.Netspan.WebServices", "MessageSizeGroupA");
    private final static QName _RandomAccessWsMessagePowerOffsetGroupBIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MessagePowerOffsetGroupBIsDefault");
    private final static QName _RandomAccessWsSizeOfRaPreamblesGroupA_QNAME = new QName("http://Airspan.Netspan.WebServices", "SizeOfRaPreamblesGroupA");
    private final static QName _RandomAccessWsZeroCorrelationZoneConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "ZeroCorrelationZoneConfig");
    private final static QName _RandomAccessWsNumberOfRaPreambles_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfRaPreambles");
    private final static QName _RandomAccessWsRaResponseWindowSizeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RaResponseWindowSizeIsDefault");
    private final static QName _RandomAccessWsMacContentionResolutionTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MacContentionResolutionTimerIsDefault");
    private final static QName _RandomAccessWsPowerRampingStep_QNAME = new QName("http://Airspan.Netspan.WebServices", "PowerRampingStep");
    private final static QName _EsonMcimWsUeThroughputReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeThroughputReportInterval");
    private final static QName _EsonMcimWsUeThroughputReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeThroughputReportIntervalIsDefault");
    private final static QName _EsonMcimWsAperiodicCqiMinMcs_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiMinMcs");
    private final static QName _EsonMcimWsAperiodicCqiGuardTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiGuardTimer");
    private final static QName _EsonMcimWsAperiodicCqiMinMcsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiMinMcsIsDefault");
    private final static QName _EsonMcimWsAperiodicCqiGuardTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AperiodicCqiGuardTimerIsDefault");
    private final static QName _Cmpv2ConfigWSUpdateMessageType_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateMessageType");
    private final static QName _Cmpv2ConfigWSUpdateRetryTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateRetryTimerIsDefault");
    private final static QName _Cmpv2ConfigWSUpdateRetryTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateRetryTimer");
    private final static QName _Cmpv2ConfigWSUpdateMessageTypeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "UpdateMessageTypeIsDefault");
    private final static QName _Cmpv2ConfigWSCertificateUpdateTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CertificateUpdateTimeIsDefault");
    private final static QName _Cmpv2ConfigWSPkiMsgProtAlgorithmType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PkiMsgProtAlgorithmType");
    private final static QName _Cmpv2ConfigWSPkiMsgProtAlgorithmTypeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PkiMsgProtAlgorithmTypeIsDefault");
    private final static QName _Cmpv2ConfigWSCertificateUpdateTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "CertificateUpdateTime");
    private final static QName _PlugAndPlayWarmRebootMaskWsConfigurationProvisioning_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigurationProvisioning");
    private final static QName _PlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithmsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RestartAirsonAlgorithmsIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsInventoryUpdateIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryUpdateIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsIpAutoConfigDhcpIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpAutoConfigDhcpIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsS1Establishment_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1Establishment");
    private final static QName _PlugAndPlayWarmRebootMaskWsConfigurationProvisioningIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConfigurationProvisioningIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsInventoryUpdate_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryUpdate");
    private final static QName _PlugAndPlayWarmRebootMaskWsValidateSiteIdentification_QNAME = new QName("http://Airspan.Netspan.WebServices", "ValidateSiteIdentification");
    private final static QName _PlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithms_QNAME = new QName("http://Airspan.Netspan.WebServices", "RestartAirsonAlgorithms");
    private final static QName _PlugAndPlayWarmRebootMaskWsValidateSiteIdentificationIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ValidateSiteIdentificationIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsBuiltInSelfTestIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "BuiltInSelfTestIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsSoftwareDownload_QNAME = new QName("http://Airspan.Netspan.WebServices", "SoftwareDownload");
    private final static QName _PlugAndPlayWarmRebootMaskWsS1EstablishmentIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1EstablishmentIsDefault");
    private final static QName _PlugAndPlayWarmRebootMaskWsIpAutoConfigDhcp_QNAME = new QName("http://Airspan.Netspan.WebServices", "IpAutoConfigDhcp");
    private final static QName _PlugAndPlayWarmRebootMaskWsBuiltInSelfTest_QNAME = new QName("http://Airspan.Netspan.WebServices", "BuiltInSelfTest");
    private final static QName _PlugAndPlayWarmRebootMaskWsSoftwareDownloadIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SoftwareDownloadIsDefault");
    private final static QName _EsonMlbWsPrbLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrbLoadWeight");
    private final static QName _EsonMlbWsPrbLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrbLoadWeightIsDefault");
    private final static QName _EsonMlbWsRrcLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadWeight");
    private final static QName _EsonMlbWsCapacitySampleInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacitySampleInterval");
    private final static QName _EsonMlbWsCapacityReportInterval_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityReportInterval");
    private final static QName _EsonMlbWsRrcLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcLoadWeightIsDefault");
    private final static QName _EsonMlbWsCapacityReportIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacityReportIntervalIsDefault");
    private final static QName _EsonMlbWsCapacitySampleIntervalIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CapacitySampleIntervalIsDefault");
    private final static QName _EsonMlbWsCpuLoadWeightIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadWeightIsDefault");
    private final static QName _EsonMlbWsCpuLoadWeight_QNAME = new QName("http://Airspan.Netspan.WebServices", "CpuLoadWeight");
    private final static QName _EnbRadioProfileMfbiEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "MfbiEnabled");
    private final static QName _EnbRadioProfileSfrSegments_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrSegments");
    private final static QName _EnbRadioProfileUplinkFreq_QNAME = new QName("http://Airspan.Netspan.WebServices", "UplinkFreq");
    private final static QName _EnbRadioProfileSfrThresholdType_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrThresholdType");
    private final static QName _EnbRadioProfileBandwidthMhz_QNAME = new QName("http://Airspan.Netspan.WebServices", "BandwidthMhz");
    private final static QName _EnbRadioProfileSsfType_QNAME = new QName("http://Airspan.Netspan.WebServices", "SsfType");
    private final static QName _EnbRadioProfileDownlinkFreq_QNAME = new QName("http://Airspan.Netspan.WebServices", "DownlinkFreq");
    private final static QName _EnbRadioProfileSfrThresholdValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrThresholdValue");
    private final static QName _EnbRadioProfileAddlSpectrumEmission_QNAME = new QName("http://Airspan.Netspan.WebServices", "AddlSpectrumEmission");
    private final static QName _EnbRadioProfileSfrIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrIndex");
    private final static QName _EnbRadioProfileSfrEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "SfrEnabled");
    private final static QName _EnbRadioProfileFrameConfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "FrameConfig");
    private final static QName _EnbRadioProfileTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci7Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci7Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci8Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci8Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci9_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci9");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci1Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci1Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci8_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci8");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci6Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci6Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci7_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci7");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci2Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci2Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci6_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci6");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci5_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci5");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci4Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci4Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci4_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci4");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci3_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci3");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci9Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci9Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci2_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci2");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci1_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci1");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci3Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci3Included");
    private final static QName _MobilityConnectedModeQosFreqHandoverTriggerPerQci5Included_QNAME = new QName("http://Airspan.Netspan.WebServices", "HandoverTriggerPerQci5Included");
    private final static QName _EnbSyncProfilePtpProfileType_QNAME = new QName("http://Airspan.Netspan.WebServices", "PtpProfileType");
    private final static QName _EnbSyncProfileAnnounceRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "AnnounceRateInMsgPerSec");
    private final static QName _EnbSyncProfileSecondaryMasterDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "SecondaryMasterDomain");
    private final static QName _EnbSyncProfilePrimaryMasterDomain_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryMasterDomain");
    private final static QName _EnbSyncProfilePrimaryClockSource_QNAME = new QName("http://Airspan.Netspan.WebServices", "PrimaryClockSource");
    private final static QName _EnbSyncProfileGnssMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "GnssMode");
    private final static QName _EnbSyncProfileSyncRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncRateInMsgPerSec");
    private final static QName _EnbSyncProfileDelayRequestResponseRateInMsgPerSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "DelayRequestResponseRateInMsgPerSec");
    private final static QName _EnbSyncProfileLeaseDurationInSec_QNAME = new QName("http://Airspan.Netspan.WebServices", "LeaseDurationInSec");
    private final static QName _MobilityIdleModeIntraFreqThreshServingLowQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshServingLowQr9");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchQr9");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchPr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchPr9");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchR8");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchQr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchQr9");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchEnable");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchEnable_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchEnable");
    private final static QName _MobilityIdleModeIntraFreqSNonIntraSearchPr9_QNAME = new QName("http://Airspan.Netspan.WebServices", "SNonIntraSearchPr9");
    private final static QName _MobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsThreshServingLowQr9NotPresent");
    private final static QName _MobilityIdleModeIntraFreqThreshServingLowR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshServingLowR8");
    private final static QName _MobilityIdleModeIntraFreqQHyst_QNAME = new QName("http://Airspan.Netspan.WebServices", "QHyst");
    private final static QName _MobilityIdleModeIntraFreqSIntraSearchR8_QNAME = new QName("http://Airspan.Netspan.WebServices", "SIntraSearchR8");
    private final static QName _Sib1WsS6PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S6PeriodicityIsDefault");
    private final static QName _Sib1WsS7Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S7Periodicity");
    private final static QName _Sib1WsS6Periodicity_QNAME = new QName("http://Airspan.Netspan.WebServices", "S6Periodicity");
    private final static QName _Sib1WsQrxLevMinIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "QrxLevMinIsDefault");
    private final static QName _Sib1WsS7PeriodicityIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "S7PeriodicityIsDefault");
    private final static QName _MobilityInterRatUtranReselectionPMaxUtra_QNAME = new QName("http://Airspan.Netspan.WebServices", "PMaxUtra");
    private final static QName _MobilityInterRatUtranReselectionThreshXQr9High_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXQr9High");
    private final static QName _MobilityInterRatUtranReselectionThreshXQr9Low_QNAME = new QName("http://Airspan.Netspan.WebServices", "ThreshXQr9Low");
    private final static QName _MobilityInterRatUtranReselectionQQualMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "QQualMin");
    private final static QName _MobilityInterRatUtranReselectionTReselectionUtra_QNAME = new QName("http://Airspan.Netspan.WebServices", "TReselectionUtra");
    private final static QName _PlugAndPlayWsWarmResetModeAdmin_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetModeAdmin");
    private final static QName _PlugAndPlayWsDhcpFailWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpFailWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsDhcpWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpWaitTime");
    private final static QName _PlugAndPlayWsMaxSiteIdentificationRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSiteIdentificationRetry");
    private final static QName _PlugAndPlayWsInventoryCompleteWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryCompleteWaitTime");
    private final static QName _PlugAndPlayWsWarmResetAutoSwDownloadFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoSwDownloadFailTimer");
    private final static QName _PlugAndPlayWsMaxPersistenceRadius_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceRadius");
    private final static QName _PlugAndPlayWsMaxPersistenceTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceTimeIsDefault");
    private final static QName _PlugAndPlayWsSiteIdentificationWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdentificationWaitTime");
    private final static QName _PlugAndPlayWsMaxSelfTestRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSelfTestRetry");
    private final static QName _PlugAndPlayWsWarmResetConfigurationFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetConfigurationFailTimer");
    private final static QName _PlugAndPlayWsSelfTestFailWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestFailWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsWarmResetAutoSwDownloadFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoSwDownloadFailTimerIsDefault");
    private final static QName _PlugAndPlayWsWarmResetModeAdminIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetModeAdminIsDefault");
    private final static QName _PlugAndPlayWsDhcpFailWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpFailWaitTime");
    private final static QName _PlugAndPlayWsSelfTestRetryWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestRetryWaitTime");
    private final static QName _PlugAndPlayWsSelfTestRetryWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestRetryWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsPersistencyMode_QNAME = new QName("http://Airspan.Netspan.WebServices", "PersistencyMode");
    private final static QName _PlugAndPlayWsPnPConfigurationTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnPConfigurationTimeIsDefault");
    private final static QName _PlugAndPlayWsAutoSoftwareWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsDhcpWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DhcpWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsSiteIdentificationWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdentificationWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsInventoryCompleteWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "InventoryCompleteWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsGpsLockWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockWaitTime");
    private final static QName _PlugAndPlayWsMaxPersistenceTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceTime");
    private final static QName _PlugAndPlayWsMaxPersistenceRadiusIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxPersistenceRadiusIsDefault");
    private final static QName _PlugAndPlayWsAutoSoftwareWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "AutoSoftwareWaitTime");
    private final static QName _PlugAndPlayWsSiteIdentificationFailWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdentificationFailWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsMaxDhcpRetry_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDhcpRetry");
    private final static QName _PlugAndPlayWsPnPConfigurationTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "PnPConfigurationTime");
    private final static QName _PlugAndPlayWsMaxSiteIdentificationRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSiteIdentificationRetryIsDefault");
    private final static QName _PlugAndPlayWsDefaultConfigurationWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultConfigurationWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsWarmResetAutoInventoryFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoInventoryFailTimerIsDefault");
    private final static QName _PlugAndPlayWsMaxDhcpRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxDhcpRetryIsDefault");
    private final static QName _PlugAndPlayWsSelfTestFailWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SelfTestFailWaitTime");
    private final static QName _PlugAndPlayWsGpsLockWaitTimeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "GpsLockWaitTimeIsDefault");
    private final static QName _PlugAndPlayWsMaxSelfTestRetryIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxSelfTestRetryIsDefault");
    private final static QName _PlugAndPlayWsWarmResetConfigurationFailTimerIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetConfigurationFailTimerIsDefault");
    private final static QName _PlugAndPlayWsPersistencyModeIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "PersistencyModeIsDefault");
    private final static QName _PlugAndPlayWsSiteIdentificationFailWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "SiteIdentificationFailWaitTime");
    private final static QName _PlugAndPlayWsDefaultConfigurationWaitTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "DefaultConfigurationWaitTime");
    private final static QName _PlugAndPlayWsWarmResetAutoInventoryFailTimer_QNAME = new QName("http://Airspan.Netspan.WebServices", "WarmResetAutoInventoryFailTimer");
    private final static QName _LteS1EntryWsSctpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpPort");
    private final static QName _EnbNeighborManagementWsX2MaxConnectionsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2MaxConnectionsIsDefault");
    private final static QName _EnbNeighborManagementWsX2GuardPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2GuardPeriod");
    private final static QName _EnbNeighborManagementWsX2GuardPeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2GuardPeriodIsDefault");
    private final static QName _EnbNeighborManagementWsX2MaxConnections_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2MaxConnections");
    private final static QName _EnbManagementProfileUEAssociatedS1Enabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "UEAssociatedS1Enabled");
    private final static QName _EnbManagementProfileEquipMeasureEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "EquipMeasureEnabled");
    private final static QName _EnbManagementProfileHoEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoEnabled");
    private final static QName _EnbManagementProfileRachPreamblesSentEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreamblesSentEnabled");
    private final static QName _EnbManagementProfileCellLevelRbQoSEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellLevelRbQoSEnabled");
    private final static QName _EnbManagementProfileRruEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RruEnabled");
    private final static QName _EnbManagementProfileERabPerQciEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "ERabPerQciEnabled");
    private final static QName _EnbManagementProfilePagingEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "PagingEnabled");
    private final static QName _EnbManagementProfileRruPerQciEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RruPerQciEnabled");
    private final static QName _EnbManagementProfileRachAccessDelayEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachAccessDelayEnabled");
    private final static QName _EnbManagementProfileRfMeasureEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RfMeasureEnabled");
    private final static QName _EnbManagementProfileERabEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "ERabEnabled");
    private final static QName _EnbManagementProfileGranularityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "GranularityPeriod");
    private final static QName _EnbManagementProfileRachEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachEnabled");
    private final static QName _EnbManagementProfileRrcEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "RrcEnabled");
    private final static QName _EnbManagementProfileHoPerTargetCellEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoPerTargetCellEnabled");
    private final static QName _EnbManagementProfileCellLevelRbQoSPerQciEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellLevelRbQoSPerQciEnabled");
    private final static QName _WiFiAccessPointWsMaxWiFiInactivityPeriodIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxWiFiInactivityPeriodIsDefault");
    private final static QName _WiFiAccessPointWsMaxWiFiInactivityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxWiFiInactivityPeriod");
    private final static QName _LteAddNeighbourForCellWsNodeCellNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "NodeCellNumber");
    private final static QName _HandoverWsAllowHoWithoutHrl_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowHoWithoutHrl");
    private final static QName _HandoverWsAllowHoWithoutHrlIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "AllowHoWithoutHrlIsDefault");
    private final static QName _CsfbCdma2KSib8ParamsRegistrationZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegistrationZone");
    private final static QName _CsfbCdma2KSib8ParamsMultipleNid_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultipleNid");
    private final static QName _CsfbCdma2KSib8ParamsMultipleSid_QNAME = new QName("http://Airspan.Netspan.WebServices", "MultipleSid");
    private final static QName _CsfbCdma2KSib8ParamsForeignNidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForeignNidReg");
    private final static QName _CsfbCdma2KSib8ParamsForeignSidReg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ForeignSidReg");
    private final static QName _CsfbCdma2KSib8ParamsRegistrationPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "RegistrationPeriod");
    private final static QName _CsfbCdma2KSib8ParamsTotalZone_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalZone");
    private final static QName _PciRangePciEnd_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciEnd");
    private final static QName _PciRangePciStart_QNAME = new QName("http://Airspan.Netspan.WebServices", "PciStart");
    private final static QName _ReselectionToGeranWsNccPermittedBit7_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit7");
    private final static QName _ReselectionToGeranWsReselectionGeranSfHighIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfHighIsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit8_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit8");
    private final static QName _ReselectionToGeranWsNccPermittedBit8IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit8IsDefault");
    private final static QName _ReselectionToGeranWsReselectionGeranSfHigh_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfHigh");
    private final static QName _ReselectionToGeranWsNccPermittedBit3_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit3");
    private final static QName _ReselectionToGeranWsNccPermittedBit4_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit4");
    private final static QName _ReselectionToGeranWsGeranSpeedStateScaleFactors_QNAME = new QName("http://Airspan.Netspan.WebServices", "GeranSpeedStateScaleFactors");
    private final static QName _ReselectionToGeranWsNccPermittedBit5_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit5");
    private final static QName _ReselectionToGeranWsNccPermittedBit6_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit6");
    private final static QName _ReselectionToGeranWsNccPermittedBit6IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit6IsDefault");
    private final static QName _ReselectionToGeranWsGeranSpeedStateScaleFactorsIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "GeranSpeedStateScaleFactorsIsDefault");
    private final static QName _ReselectionToGeranWsReselectionGeranSfMediumIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfMediumIsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit4IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit4IsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit7IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit7IsDefault");
    private final static QName _ReselectionToGeranWsReselectionGeranSfMedium_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReselectionGeranSfMedium");
    private final static QName _ReselectionToGeranWsNccPermittedBit2IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit2IsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit5IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit5IsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit1IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit1IsDefault");
    private final static QName _ReselectionToGeranWsNccPermittedBit2_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit2");
    private final static QName _ReselectionToGeranWsNccPermittedBit1_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit1");
    private final static QName _ReselectionToGeranWsNccPermittedBit3IsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "NccPermittedBit3IsDefault");
    private final static QName _LteSonCSonWsCSonMlbPdschLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbPdschLoadThresh");
    private final static QName _LteSonCSonWsIsCSonMlbEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMlbEnabled");
    private final static QName _LteSonCSonWsCSonMlbPuschLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbPuschLoadThresh");
    private final static QName _LteSonCSonWsCSonMlbCpuLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbCpuLoadThresh");
    private final static QName _LteSonCSonWsIsCSonEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonEnabled");
    private final static QName _LteSonCSonWsIsCSonMcimEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMcimEnabled");
    private final static QName _LteSonCSonWsIsCSonRachEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonRachEnabled");
    private final static QName _LteSonCSonWsCSonMlbRrcLoadThresh_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbRrcLoadThresh");
    private final static QName _LteSonCSonWsIsCSonMroEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "IsCSonMroEnabled");
    private final static QName _LteSonCSonWsCSonMlbCapacityClassValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "CSonMlbCapacityClassValue");
    private final static QName _SynchronizationWsLastUlSymSuppressEnabledIsDefault_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastUlSymSuppressEnabledIsDefault");
    private final static QName _SynchronizationWsLastUlSymSuppressEnabled_QNAME = new QName("http://Airspan.Netspan.WebServices", "LastUlSymSuppressEnabled");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_14_50.API.Lte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NetworkProfileList }
     * 
     */
    public NetworkProfileList createNetworkProfileList() {
        return new NetworkProfileList();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigUpdate }
     * 
     */
    public EnbAdvancedProfileConfigUpdate createEnbAdvancedProfileConfigUpdate() {
        return new EnbAdvancedProfileConfigUpdate();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfile }
     * 
     */
    public EnbAdvancedProfile createEnbAdvancedProfile() {
        return new EnbAdvancedProfile();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigDeleteResponse }
     * 
     */
    public EnbAdvancedProfileConfigDeleteResponse createEnbAdvancedProfileConfigDeleteResponse() {
        return new EnbAdvancedProfileConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link ProfileResponse }
     * 
     */
    public ProfileResponse createProfileResponse() {
        return new ProfileResponse();
    }

    /**
     * Create an instance of {@link PnpConfigCreateResponse }
     * 
     */
    public PnpConfigCreateResponse createPnpConfigCreateResponse() {
        return new PnpConfigCreateResponse();
    }

    /**
     * Create an instance of {@link NodeActionResult }
     * 
     */
    public NodeActionResult createNodeActionResult() {
        return new NodeActionResult();
    }

    /**
     * Create an instance of {@link SonProfileUpdateResponse }
     * 
     */
    public SonProfileUpdateResponse createSonProfileUpdateResponse() {
        return new SonProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileCreateResponse }
     * 
     */
    public EmbmsProfileCreateResponse createEmbmsProfileCreateResponse() {
        return new EmbmsProfileCreateResponse();
    }

    /**
     * Create an instance of {@link EnbStateGet }
     * 
     */
    public EnbStateGet createEnbStateGet() {
        return new EnbStateGet();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigDelete }
     * 
     */
    public EnbAdvancedProfileConfigDelete createEnbAdvancedProfileConfigDelete() {
        return new EnbAdvancedProfileConfigDelete();
    }

    /**
     * Create an instance of {@link PnpConfigClone }
     * 
     */
    public PnpConfigClone createPnpConfigClone() {
        return new PnpConfigClone();
    }

    /**
     * Create an instance of {@link PnpDetailWs }
     * 
     */
    public PnpDetailWs createPnpDetailWs() {
        return new PnpDetailWs();
    }

    /**
     * Create an instance of {@link LteEnbDetailsSetWs }
     * 
     */
    public LteEnbDetailsSetWs createLteEnbDetailsSetWs() {
        return new LteEnbDetailsSetWs();
    }

    /**
     * Create an instance of {@link SyncProfileListResponse }
     * 
     */
    public SyncProfileListResponse createSyncProfileListResponse() {
        return new SyncProfileListResponse();
    }

    /**
     * Create an instance of {@link NameResult }
     * 
     */
    public NameResult createNameResult() {
        return new NameResult();
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
     * Create an instance of {@link MobilityProfileCloneResponse }
     * 
     */
    public MobilityProfileCloneResponse createMobilityProfileCloneResponse() {
        return new MobilityProfileCloneResponse();
    }

    /**
     * Create an instance of {@link SyncProfileCloneResponse }
     * 
     */
    public SyncProfileCloneResponse createSyncProfileCloneResponse() {
        return new SyncProfileCloneResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCreate }
     * 
     */
    public Lte3RdPartyCreate createLte3RdPartyCreate() {
        return new Lte3RdPartyCreate();
    }

    /**
     * Create an instance of {@link Enb3RdParty }
     * 
     */
    public Enb3RdParty createEnb3RdParty() {
        return new Enb3RdParty();
    }

    /**
     * Create an instance of {@link ManagementProfileCreate }
     * 
     */
    public ManagementProfileCreate createManagementProfileCreate() {
        return new ManagementProfileCreate();
    }

    /**
     * Create an instance of {@link EnbManagementProfile }
     * 
     */
    public EnbManagementProfile createEnbManagementProfile() {
        return new EnbManagementProfile();
    }

    /**
     * Create an instance of {@link EnbStateSet }
     * 
     */
    public EnbStateSet createEnbStateSet() {
        return new EnbStateSet();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileUpdateResponse }
     * 
     */
    public TrafficManagementProfileUpdateResponse createTrafficManagementProfileUpdateResponse() {
        return new TrafficManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileList }
     * 
     */
    public TrafficManagementProfileList createTrafficManagementProfileList() {
        return new TrafficManagementProfileList();
    }

    /**
     * Create an instance of {@link SonProfileList }
     * 
     */
    public SonProfileList createSonProfileList() {
        return new SonProfileList();
    }

    /**
     * Create an instance of {@link MobilityProfileDeleteResponse }
     * 
     */
    public MobilityProfileDeleteResponse createMobilityProfileDeleteResponse() {
        return new MobilityProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileListResponse }
     * 
     */
    public SystemDefaultProfileListResponse createSystemDefaultProfileListResponse() {
        return new SystemDefaultProfileListResponse();
    }

    /**
     * Create an instance of {@link UtranProfileDelete }
     * 
     */
    public UtranProfileDelete createUtranProfileDelete() {
        return new UtranProfileDelete();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigGet }
     * 
     */
    public EnbAdvancedProfileConfigGet createEnbAdvancedProfileConfigGet() {
        return new EnbAdvancedProfileConfigGet();
    }

    /**
     * Create an instance of {@link SonProfileCloneResponse }
     * 
     */
    public SonProfileCloneResponse createSonProfileCloneResponse() {
        return new SonProfileCloneResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileDelete }
     * 
     */
    public MobilityProfileDelete createMobilityProfileDelete() {
        return new MobilityProfileDelete();
    }

    /**
     * Create an instance of {@link SonProfileDeleteResponse }
     * 
     */
    public SonProfileDeleteResponse createSonProfileDeleteResponse() {
        return new SonProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link EnbAdvancedConfigProfileList }
     * 
     */
    public EnbAdvancedConfigProfileList createEnbAdvancedConfigProfileList() {
        return new EnbAdvancedConfigProfileList();
    }

    /**
     * Create an instance of {@link NetworkProfileDelete }
     * 
     */
    public NetworkProfileDelete createNetworkProfileDelete() {
        return new NetworkProfileDelete();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCloneResponse }
     * 
     */
    public Lte3RdPartyCloneResponse createLte3RdPartyCloneResponse() {
        return new Lte3RdPartyCloneResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResponse }
     * 
     */
    public Lte3RdPartyResponse createLte3RdPartyResponse() {
        return new Lte3RdPartyResponse();
    }

    /**
     * Create an instance of {@link SystemDefaultProfileList }
     * 
     */
    public SystemDefaultProfileList createSystemDefaultProfileList() {
        return new SystemDefaultProfileList();
    }

    /**
     * Create an instance of {@link UtranProfileGet }
     * 
     */
    public UtranProfileGet createUtranProfileGet() {
        return new UtranProfileGet();
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
     * Create an instance of {@link RadioProfileList }
     * 
     */
    public RadioProfileList createRadioProfileList() {
        return new RadioProfileList();
    }

    /**
     * Create an instance of {@link EmbmsProfileUpdate }
     * 
     */
    public EmbmsProfileUpdate createEmbmsProfileUpdate() {
        return new EmbmsProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbEmbmsProfile }
     * 
     */
    public EnbEmbmsProfile createEnbEmbmsProfile() {
        return new EnbEmbmsProfile();
    }

    /**
     * Create an instance of {@link Lte3RdPartyList }
     * 
     */
    public Lte3RdPartyList createLte3RdPartyList() {
        return new Lte3RdPartyList();
    }

    /**
     * Create an instance of {@link Lte3RdPartyListResponse }
     * 
     */
    public Lte3RdPartyListResponse createLte3RdPartyListResponse() {
        return new Lte3RdPartyListResponse();
    }

    /**
     * Create an instance of {@link PnpConfigUpdate }
     * 
     */
    public PnpConfigUpdate createPnpConfigUpdate() {
        return new PnpConfigUpdate();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigCreateResponse }
     * 
     */
    public EnbAdvancedProfileConfigCreateResponse createEnbAdvancedProfileConfigCreateResponse() {
        return new EnbAdvancedProfileConfigCreateResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileCreateResponse }
     * 
     */
    public TrafficManagementProfileCreateResponse createTrafficManagementProfileCreateResponse() {
        return new TrafficManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileList }
     * 
     */
    public MobilityProfileList createMobilityProfileList() {
        return new MobilityProfileList();
    }

    /**
     * Create an instance of {@link PnpConfigDeleteResponse }
     * 
     */
    public PnpConfigDeleteResponse createPnpConfigDeleteResponse() {
        return new PnpConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link PnpConfigDelete }
     * 
     */
    public PnpConfigDelete createPnpConfigDelete() {
        return new PnpConfigDelete();
    }

    /**
     * Create an instance of {@link SecurityProfileList }
     * 
     */
    public SecurityProfileList createSecurityProfileList() {
        return new SecurityProfileList();
    }

    /**
     * Create an instance of {@link ManagementProfileCloneResponse }
     * 
     */
    public ManagementProfileCloneResponse createManagementProfileCloneResponse() {
        return new ManagementProfileCloneResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileListResponse }
     * 
     */
    public MobilityProfileListResponse createMobilityProfileListResponse() {
        return new MobilityProfileListResponse();
    }

    /**
     * Create an instance of {@link SyncProfileGet }
     * 
     */
    public SyncProfileGet createSyncProfileGet() {
        return new SyncProfileGet();
    }

    /**
     * Create an instance of {@link ManagementProfileDelete }
     * 
     */
    public ManagementProfileDelete createManagementProfileDelete() {
        return new ManagementProfileDelete();
    }

    /**
     * Create an instance of {@link LteNeighbourDelete }
     * 
     */
    public LteNeighbourDelete createLteNeighbourDelete() {
        return new LteNeighbourDelete();
    }

    /**
     * Create an instance of {@link EnbAdvancedConfigProfileListResponse }
     * 
     */
    public EnbAdvancedConfigProfileListResponse createEnbAdvancedConfigProfileListResponse() {
        return new EnbAdvancedConfigProfileListResponse();
    }

    /**
     * Create an instance of {@link PnpConfigCreate }
     * 
     */
    public PnpConfigCreate createPnpConfigCreate() {
        return new PnpConfigCreate();
    }

    /**
     * Create an instance of {@link EmbmsProfileCloneResponse }
     * 
     */
    public EmbmsProfileCloneResponse createEmbmsProfileCloneResponse() {
        return new EmbmsProfileCloneResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyDelete }
     * 
     */
    public Lte3RdPartyDelete createLte3RdPartyDelete() {
        return new Lte3RdPartyDelete();
    }

    /**
     * Create an instance of {@link MobilityProfileGet }
     * 
     */
    public MobilityProfileGet createMobilityProfileGet() {
        return new MobilityProfileGet();
    }

    /**
     * Create an instance of {@link NetworkProfileGet }
     * 
     */
    public NetworkProfileGet createNetworkProfileGet() {
        return new NetworkProfileGet();
    }

    /**
     * Create an instance of {@link SonProfileListResponse }
     * 
     */
    public SonProfileListResponse createSonProfileListResponse() {
        return new SonProfileListResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyUpdateResponse }
     * 
     */
    public Lte3RdPartyUpdateResponse createLte3RdPartyUpdateResponse() {
        return new Lte3RdPartyUpdateResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileCloneResponse }
     * 
     */
    public SecurityProfileCloneResponse createSecurityProfileCloneResponse() {
        return new SecurityProfileCloneResponse();
    }

    /**
     * Create an instance of {@link SyncProfileUpdateResponse }
     * 
     */
    public SyncProfileUpdateResponse createSyncProfileUpdateResponse() {
        return new SyncProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileCreate }
     * 
     */
    public EmbmsProfileCreate createEmbmsProfileCreate() {
        return new EmbmsProfileCreate();
    }

    /**
     * Create an instance of {@link NetworkProfileCloneResponse }
     * 
     */
    public NetworkProfileCloneResponse createNetworkProfileCloneResponse() {
        return new NetworkProfileCloneResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileGet }
     * 
     */
    public ManagementProfileGet createManagementProfileGet() {
        return new ManagementProfileGet();
    }

    /**
     * Create an instance of {@link UtranProfileDeleteResponse }
     * 
     */
    public UtranProfileDeleteResponse createUtranProfileDeleteResponse() {
        return new UtranProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link SonProfileDelete }
     * 
     */
    public SonProfileDelete createSonProfileDelete() {
        return new SonProfileDelete();
    }

    /**
     * Create an instance of {@link SecurityProfileGet }
     * 
     */
    public SecurityProfileGet createSecurityProfileGet() {
        return new SecurityProfileGet();
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
     * Create an instance of {@link TrafficManagementProfileDeleteResponse }
     * 
     */
    public TrafficManagementProfileDeleteResponse createTrafficManagementProfileDeleteResponse() {
        return new TrafficManagementProfileDeleteResponse();
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
     * Create an instance of {@link CellAdvancedProfileConfigUpdate }
     * 
     */
    public CellAdvancedProfileConfigUpdate createCellAdvancedProfileConfigUpdate() {
        return new CellAdvancedProfileConfigUpdate();
    }

    /**
     * Create an instance of {@link EnbCellAdvancedProfile }
     * 
     */
    public EnbCellAdvancedProfile createEnbCellAdvancedProfile() {
        return new EnbCellAdvancedProfile();
    }

    /**
     * Create an instance of {@link RadioProfileUpdate }
     * 
     */
    public RadioProfileUpdate createRadioProfileUpdate() {
        return new RadioProfileUpdate();
    }

    /**
     * Create an instance of {@link EnbRadioProfile }
     * 
     */
    public EnbRadioProfile createEnbRadioProfile() {
        return new EnbRadioProfile();
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
     * Create an instance of {@link NetworkProfileDeleteResponse }
     * 
     */
    public NetworkProfileDeleteResponse createNetworkProfileDeleteResponse() {
        return new NetworkProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link UtranProfileList }
     * 
     */
    public UtranProfileList createUtranProfileList() {
        return new UtranProfileList();
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
     * Create an instance of {@link EnbConfigSetResponse }
     * 
     */
    public EnbConfigSetResponse createEnbConfigSetResponse() {
        return new EnbConfigSetResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourAddByCellNumberResponse }
     * 
     */
    public LteNeighbourAddByCellNumberResponse createLteNeighbourAddByCellNumberResponse() {
        return new LteNeighbourAddByCellNumberResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourList }
     * 
     */
    public LteNeighbourList createLteNeighbourList() {
        return new LteNeighbourList();
    }

    /**
     * Create an instance of {@link SecurityProfileUpdateResponse }
     * 
     */
    public SecurityProfileUpdateResponse createSecurityProfileUpdateResponse() {
        return new SecurityProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link Lte3RdPartyGet }
     * 
     */
    public Lte3RdPartyGet createLte3RdPartyGet() {
        return new Lte3RdPartyGet();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigDelete }
     * 
     */
    public CellAdvancedProfileConfigDelete createCellAdvancedProfileConfigDelete() {
        return new CellAdvancedProfileConfigDelete();
    }

    /**
     * Create an instance of {@link CellAdvancedConfigProfileList }
     * 
     */
    public CellAdvancedConfigProfileList createCellAdvancedConfigProfileList() {
        return new CellAdvancedConfigProfileList();
    }

    /**
     * Create an instance of {@link LteNeighbourAddResponse }
     * 
     */
    public LteNeighbourAddResponse createLteNeighbourAddResponse() {
        return new LteNeighbourAddResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileCreateResponse }
     * 
     */
    public SecurityProfileCreateResponse createSecurityProfileCreateResponse() {
        return new SecurityProfileCreateResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCreateResponse }
     * 
     */
    public CellAdvancedProfileConfigCreateResponse createCellAdvancedProfileConfigCreateResponse() {
        return new CellAdvancedProfileConfigCreateResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigDeleteResponse }
     * 
     */
    public CellAdvancedProfileConfigDeleteResponse createCellAdvancedProfileConfigDeleteResponse() {
        return new CellAdvancedProfileConfigDeleteResponse();
    }

    /**
     * Create an instance of {@link PnpConfigGet }
     * 
     */
    public PnpConfigGet createPnpConfigGet() {
        return new PnpConfigGet();
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
     * Create an instance of {@link EnbSonProfile }
     * 
     */
    public EnbSonProfile createEnbSonProfile() {
        return new EnbSonProfile();
    }

    /**
     * Create an instance of {@link SecurityProfileDelete }
     * 
     */
    public SecurityProfileDelete createSecurityProfileDelete() {
        return new SecurityProfileDelete();
    }

    /**
     * Create an instance of {@link Lte3RdPartyUpdate }
     * 
     */
    public Lte3RdPartyUpdate createLte3RdPartyUpdate() {
        return new Lte3RdPartyUpdate();
    }

    /**
     * Create an instance of {@link RadioProfileCloneResponse }
     * 
     */
    public RadioProfileCloneResponse createRadioProfileCloneResponse() {
        return new RadioProfileCloneResponse();
    }

    /**
     * Create an instance of {@link UtranProfileListResponse }
     * 
     */
    public UtranProfileListResponse createUtranProfileListResponse() {
        return new UtranProfileListResponse();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteAll }
     * 
     */
    public LteNeighbourDeleteAll createLteNeighbourDeleteAll() {
        return new LteNeighbourDeleteAll();
    }

    /**
     * Create an instance of {@link UtranProfileClone }
     * 
     */
    public UtranProfileClone createUtranProfileClone() {
        return new UtranProfileClone();
    }

    /**
     * Create an instance of {@link UtranProfile }
     * 
     */
    public UtranProfile createUtranProfile() {
        return new UtranProfile();
    }

    /**
     * Create an instance of {@link EnbConfigGet }
     * 
     */
    public EnbConfigGet createEnbConfigGet() {
        return new EnbConfigGet();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigGet }
     * 
     */
    public CellAdvancedProfileConfigGet createCellAdvancedProfileConfigGet() {
        return new CellAdvancedProfileConfigGet();
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
     * Create an instance of {@link RadioProfileUpdateResponse }
     * 
     */
    public RadioProfileUpdateResponse createRadioProfileUpdateResponse() {
        return new RadioProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileGet }
     * 
     */
    public TrafficManagementProfileGet createTrafficManagementProfileGet() {
        return new TrafficManagementProfileGet();
    }

    /**
     * Create an instance of {@link SonProfileGet }
     * 
     */
    public SonProfileGet createSonProfileGet() {
        return new SonProfileGet();
    }

    /**
     * Create an instance of {@link Lte3RdPartyClone }
     * 
     */
    public Lte3RdPartyClone createLte3RdPartyClone() {
        return new Lte3RdPartyClone();
    }

    /**
     * Create an instance of {@link CellAdvancedConfigProfileListResponse }
     * 
     */
    public CellAdvancedConfigProfileListResponse createCellAdvancedConfigProfileListResponse() {
        return new CellAdvancedConfigProfileListResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileUpdateResponse }
     * 
     */
    public EmbmsProfileUpdateResponse createEmbmsProfileUpdateResponse() {
        return new EmbmsProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileGet }
     * 
     */
    public EmbmsProfileGet createEmbmsProfileGet() {
        return new EmbmsProfileGet();
    }

    /**
     * Create an instance of {@link RadioProfileCreateResponse }
     * 
     */
    public RadioProfileCreateResponse createRadioProfileCreateResponse() {
        return new RadioProfileCreateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileClone }
     * 
     */
    public SyncProfileClone createSyncProfileClone() {
        return new SyncProfileClone();
    }

    /**
     * Create an instance of {@link EnbSyncProfile }
     * 
     */
    public EnbSyncProfile createEnbSyncProfile() {
        return new EnbSyncProfile();
    }

    /**
     * Create an instance of {@link Lte3RdPartyDeleteResponse }
     * 
     */
    public Lte3RdPartyDeleteResponse createLte3RdPartyDeleteResponse() {
        return new Lte3RdPartyDeleteResponse();
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
     * Create an instance of {@link SyncProfileUpdate }
     * 
     */
    public SyncProfileUpdate createSyncProfileUpdate() {
        return new SyncProfileUpdate();
    }

    /**
     * Create an instance of {@link LteNeighbourAdd }
     * 
     */
    public LteNeighbourAdd createLteNeighbourAdd() {
        return new LteNeighbourAdd();
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
     * Create an instance of {@link SyncProfileCreate }
     * 
     */
    public SyncProfileCreate createSyncProfileCreate() {
        return new SyncProfileCreate();
    }

    /**
     * Create an instance of {@link PnpConfigList }
     * 
     */
    public PnpConfigList createPnpConfigList() {
        return new PnpConfigList();
    }

    /**
     * Create an instance of {@link UtranProfileCloneResponse }
     * 
     */
    public UtranProfileCloneResponse createUtranProfileCloneResponse() {
        return new UtranProfileCloneResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileDelete }
     * 
     */
    public TrafficManagementProfileDelete createTrafficManagementProfileDelete() {
        return new TrafficManagementProfileDelete();
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
     * Create an instance of {@link RadioProfileDeleteResponse }
     * 
     */
    public RadioProfileDeleteResponse createRadioProfileDeleteResponse() {
        return new RadioProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileUpdateResponse }
     * 
     */
    public ManagementProfileUpdateResponse createManagementProfileUpdateResponse() {
        return new ManagementProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link RadioProfileGet }
     * 
     */
    public RadioProfileGet createRadioProfileGet() {
        return new RadioProfileGet();
    }

    /**
     * Create an instance of {@link EmbmsProfileList }
     * 
     */
    public EmbmsProfileList createEmbmsProfileList() {
        return new EmbmsProfileList();
    }

    /**
     * Create an instance of {@link RadioProfileDelete }
     * 
     */
    public RadioProfileDelete createRadioProfileDelete() {
        return new RadioProfileDelete();
    }

    /**
     * Create an instance of {@link LteNeighbourDeleteResponse }
     * 
     */
    public LteNeighbourDeleteResponse createLteNeighbourDeleteResponse() {
        return new LteNeighbourDeleteResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileClone }
     * 
     */
    public SecurityProfileClone createSecurityProfileClone() {
        return new SecurityProfileClone();
    }

    /**
     * Create an instance of {@link EnbSecurityProfile }
     * 
     */
    public EnbSecurityProfile createEnbSecurityProfile() {
        return new EnbSecurityProfile();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigUpdateResponse }
     * 
     */
    public CellAdvancedProfileConfigUpdateResponse createCellAdvancedProfileConfigUpdateResponse() {
        return new CellAdvancedProfileConfigUpdateResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileClone }
     * 
     */
    public NetworkProfileClone createNetworkProfileClone() {
        return new NetworkProfileClone();
    }

    /**
     * Create an instance of {@link EnbNetworkProfile }
     * 
     */
    public EnbNetworkProfile createEnbNetworkProfile() {
        return new EnbNetworkProfile();
    }

    /**
     * Create an instance of {@link ManagementProfileUpdate }
     * 
     */
    public ManagementProfileUpdate createManagementProfileUpdate() {
        return new ManagementProfileUpdate();
    }

    /**
     * Create an instance of {@link MobilityProfileUpdateResponse }
     * 
     */
    public MobilityProfileUpdateResponse createMobilityProfileUpdateResponse() {
        return new MobilityProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCloneResponse }
     * 
     */
    public CellAdvancedProfileConfigCloneResponse createCellAdvancedProfileConfigCloneResponse() {
        return new CellAdvancedProfileConfigCloneResponse();
    }

    /**
     * Create an instance of {@link EmbmsProfileDeleteResponse }
     * 
     */
    public EmbmsProfileDeleteResponse createEmbmsProfileDeleteResponse() {
        return new EmbmsProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link EnbStateSetResponse }
     * 
     */
    public EnbStateSetResponse createEnbStateSetResponse() {
        return new EnbStateSetResponse();
    }

    /**
     * Create an instance of {@link MobilityProfileCreate }
     * 
     */
    public MobilityProfileCreate createMobilityProfileCreate() {
        return new MobilityProfileCreate();
    }

    /**
     * Create an instance of {@link EnbMobilityProfile }
     * 
     */
    public EnbMobilityProfile createEnbMobilityProfile() {
        return new EnbMobilityProfile();
    }

    /**
     * Create an instance of {@link PnpConfigUpdateResponse }
     * 
     */
    public PnpConfigUpdateResponse createPnpConfigUpdateResponse() {
        return new PnpConfigUpdateResponse();
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
     * Create an instance of {@link EmbmsProfileListResponse }
     * 
     */
    public EmbmsProfileListResponse createEmbmsProfileListResponse() {
        return new EmbmsProfileListResponse();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileClone }
     * 
     */
    public TrafficManagementProfileClone createTrafficManagementProfileClone() {
        return new TrafficManagementProfileClone();
    }

    /**
     * Create an instance of {@link EnbAdvancedProfileConfigCloneResponse }
     * 
     */
    public EnbAdvancedProfileConfigCloneResponse createEnbAdvancedProfileConfigCloneResponse() {
        return new EnbAdvancedProfileConfigCloneResponse();
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
     * Create an instance of {@link ManagementProfileList }
     * 
     */
    public ManagementProfileList createManagementProfileList() {
        return new ManagementProfileList();
    }

    /**
     * Create an instance of {@link Lte3RdPartyCreateResponse }
     * 
     */
    public Lte3RdPartyCreateResponse createLte3RdPartyCreateResponse() {
        return new Lte3RdPartyCreateResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileDeleteResponse }
     * 
     */
    public ManagementProfileDeleteResponse createManagementProfileDeleteResponse() {
        return new ManagementProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link RadioProfileClone }
     * 
     */
    public RadioProfileClone createRadioProfileClone() {
        return new RadioProfileClone();
    }

    /**
     * Create an instance of {@link SecurityProfileCreate }
     * 
     */
    public SecurityProfileCreate createSecurityProfileCreate() {
        return new SecurityProfileCreate();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigClone }
     * 
     */
    public CellAdvancedProfileConfigClone createCellAdvancedProfileConfigClone() {
        return new CellAdvancedProfileConfigClone();
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
     * Create an instance of {@link TrafficManagementProfileCreate }
     * 
     */
    public TrafficManagementProfileCreate createTrafficManagementProfileCreate() {
        return new TrafficManagementProfileCreate();
    }

    /**
     * Create an instance of {@link NetworkProfileUpdate }
     * 
     */
    public NetworkProfileUpdate createNetworkProfileUpdate() {
        return new NetworkProfileUpdate();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileListResponse }
     * 
     */
    public TrafficManagementProfileListResponse createTrafficManagementProfileListResponse() {
        return new TrafficManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link UtranProfileCreateResponse }
     * 
     */
    public UtranProfileCreateResponse createUtranProfileCreateResponse() {
        return new UtranProfileCreateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileDeleteResponse }
     * 
     */
    public SyncProfileDeleteResponse createSyncProfileDeleteResponse() {
        return new SyncProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileDeleteResponse }
     * 
     */
    public SecurityProfileDeleteResponse createSecurityProfileDeleteResponse() {
        return new SecurityProfileDeleteResponse();
    }

    /**
     * Create an instance of {@link RadioProfileCreate }
     * 
     */
    public RadioProfileCreate createRadioProfileCreate() {
        return new RadioProfileCreate();
    }

    /**
     * Create an instance of {@link SyncProfileDelete }
     * 
     */
    public SyncProfileDelete createSyncProfileDelete() {
        return new SyncProfileDelete();
    }

    /**
     * Create an instance of {@link EnbConfigSet }
     * 
     */
    public EnbConfigSet createEnbConfigSet() {
        return new EnbConfigSet();
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
     * Create an instance of {@link EmbmsProfileClone }
     * 
     */
    public EmbmsProfileClone createEmbmsProfileClone() {
        return new EmbmsProfileClone();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link MobilityProfileUpdate }
     * 
     */
    public MobilityProfileUpdate createMobilityProfileUpdate() {
        return new MobilityProfileUpdate();
    }

    /**
     * Create an instance of {@link CellAdvancedProfileConfigCreate }
     * 
     */
    public CellAdvancedProfileConfigCreate createCellAdvancedProfileConfigCreate() {
        return new CellAdvancedProfileConfigCreate();
    }

    /**
     * Create an instance of {@link MobilityProfileCreateResponse }
     * 
     */
    public MobilityProfileCreateResponse createMobilityProfileCreateResponse() {
        return new MobilityProfileCreateResponse();
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
     * Create an instance of {@link TrafficManagementProfileCloneResponse }
     * 
     */
    public TrafficManagementProfileCloneResponse createTrafficManagementProfileCloneResponse() {
        return new TrafficManagementProfileCloneResponse();
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
     * Create an instance of {@link EnbAdvancedProfileConfigClone }
     * 
     */
    public EnbAdvancedProfileConfigClone createEnbAdvancedProfileConfigClone() {
        return new EnbAdvancedProfileConfigClone();
    }

    /**
     * Create an instance of {@link MobilityProfileClone }
     * 
     */
    public MobilityProfileClone createMobilityProfileClone() {
        return new MobilityProfileClone();
    }

    /**
     * Create an instance of {@link NetworkProfileUpdateResponse }
     * 
     */
    public NetworkProfileUpdateResponse createNetworkProfileUpdateResponse() {
        return new NetworkProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileCreateResponse }
     * 
     */
    public SyncProfileCreateResponse createSyncProfileCreateResponse() {
        return new SyncProfileCreateResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileListResponse }
     * 
     */
    public NetworkProfileListResponse createNetworkProfileListResponse() {
        return new NetworkProfileListResponse();
    }

    /**
     * Create an instance of {@link UtranProfileUpdate }
     * 
     */
    public UtranProfileUpdate createUtranProfileUpdate() {
        return new UtranProfileUpdate();
    }

    /**
     * Create an instance of {@link SonProfileUpdate }
     * 
     */
    public SonProfileUpdate createSonProfileUpdate() {
        return new SonProfileUpdate();
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
     * Create an instance of {@link PnpConfigListResponse }
     * 
     */
    public PnpConfigListResponse createPnpConfigListResponse() {
        return new PnpConfigListResponse();
    }

    /**
     * Create an instance of {@link NodeListResult }
     * 
     */
    public NodeListResult createNodeListResult() {
        return new NodeListResult();
    }

    /**
     * Create an instance of {@link NetworkProfileCreate }
     * 
     */
    public NetworkProfileCreate createNetworkProfileCreate() {
        return new NetworkProfileCreate();
    }

    /**
     * Create an instance of {@link ManagementProfileClone }
     * 
     */
    public ManagementProfileClone createManagementProfileClone() {
        return new ManagementProfileClone();
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
     * Create an instance of {@link UtranProfileCreate }
     * 
     */
    public UtranProfileCreate createUtranProfileCreate() {
        return new UtranProfileCreate();
    }

    /**
     * Create an instance of {@link SecurityProfileListResponse }
     * 
     */
    public SecurityProfileListResponse createSecurityProfileListResponse() {
        return new SecurityProfileListResponse();
    }

    /**
     * Create an instance of {@link SecurityProfileUpdate }
     * 
     */
    public SecurityProfileUpdate createSecurityProfileUpdate() {
        return new SecurityProfileUpdate();
    }

    /**
     * Create an instance of {@link UtranProfileUpdateResponse }
     * 
     */
    public UtranProfileUpdateResponse createUtranProfileUpdateResponse() {
        return new UtranProfileUpdateResponse();
    }

    /**
     * Create an instance of {@link SyncProfileList }
     * 
     */
    public SyncProfileList createSyncProfileList() {
        return new SyncProfileList();
    }

    /**
     * Create an instance of {@link ManagementProfileListResponse }
     * 
     */
    public ManagementProfileListResponse createManagementProfileListResponse() {
        return new ManagementProfileListResponse();
    }

    /**
     * Create an instance of {@link NetworkProfileCreateResponse }
     * 
     */
    public NetworkProfileCreateResponse createNetworkProfileCreateResponse() {
        return new NetworkProfileCreateResponse();
    }

    /**
     * Create an instance of {@link PnpConfigCloneResponse }
     * 
     */
    public PnpConfigCloneResponse createPnpConfigCloneResponse() {
        return new PnpConfigCloneResponse();
    }

    /**
     * Create an instance of {@link ManagementProfileCreateResponse }
     * 
     */
    public ManagementProfileCreateResponse createManagementProfileCreateResponse() {
        return new ManagementProfileCreateResponse();
    }

    /**
     * Create an instance of {@link EnbDetailsGet }
     * 
     */
    public EnbDetailsGet createEnbDetailsGet() {
        return new EnbDetailsGet();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResult }
     * 
     */
    public Lte3RdPartyResult createLte3RdPartyResult() {
        return new Lte3RdPartyResult();
    }

    /**
     * Create an instance of {@link EmbmsWs }
     * 
     */
    public EmbmsWs createEmbmsWs() {
        return new EmbmsWs();
    }

    /**
     * Create an instance of {@link EsonWs }
     * 
     */
    public EsonWs createEsonWs() {
        return new EsonWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeFreq }
     * 
     */
    public MobilityConnectedModeFreq createMobilityConnectedModeFreq() {
        return new MobilityConnectedModeFreq();
    }

    /**
     * Create an instance of {@link LteEmbmsProfileResult }
     * 
     */
    public LteEmbmsProfileResult createLteEmbmsProfileResult() {
        return new LteEmbmsProfileResult();
    }

    /**
     * Create an instance of {@link EnbNeighbour }
     * 
     */
    public EnbNeighbour createEnbNeighbour() {
        return new EnbNeighbour();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link HandoverMobilityConnectedModeEarfcnListContainer }
     * 
     */
    public HandoverMobilityConnectedModeEarfcnListContainer createHandoverMobilityConnectedModeEarfcnListContainer() {
        return new HandoverMobilityConnectedModeEarfcnListContainer();
    }

    /**
     * Create an instance of {@link CsfbCdma2KSib8Params }
     * 
     */
    public CsfbCdma2KSib8Params createCsfbCdma2KSib8Params() {
        return new CsfbCdma2KSib8Params();
    }

    /**
     * Create an instance of {@link EnbStateGetWs }
     * 
     */
    public EnbStateGetWs createEnbStateGetWs() {
        return new EnbStateGetWs();
    }

    /**
     * Create an instance of {@link UplinkPowerControlWs }
     * 
     */
    public UplinkPowerControlWs createUplinkPowerControlWs() {
        return new UplinkPowerControlWs();
    }

    /**
     * Create an instance of {@link LteS1EntryWs }
     * 
     */
    public LteS1EntryWs createLteS1EntryWs() {
        return new LteS1EntryWs();
    }

    /**
     * Create an instance of {@link MobilityUtranReselectionPriorityEntryWs }
     * 
     */
    public MobilityUtranReselectionPriorityEntryWs createMobilityUtranReselectionPriorityEntryWs() {
        return new MobilityUtranReselectionPriorityEntryWs();
    }

    /**
     * Create an instance of {@link MobilityGeranReselectionPriorityEntryWs }
     * 
     */
    public MobilityGeranReselectionPriorityEntryWs createMobilityGeranReselectionPriorityEntryWs() {
        return new MobilityGeranReselectionPriorityEntryWs();
    }

    /**
     * Create an instance of {@link CsfbCdma2KCellParams }
     * 
     */
    public CsfbCdma2KCellParams createCsfbCdma2KCellParams() {
        return new CsfbCdma2KCellParams();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterFreqReselectionPriorityEntryWs }
     * 
     */
    public MobilityIdleModeInterFreqReselectionPriorityEntryWs createMobilityIdleModeInterFreqReselectionPriorityEntryWs() {
        return new MobilityIdleModeInterFreqReselectionPriorityEntryWs();
    }

    /**
     * Create an instance of {@link LteCellAdvancedProfileResult }
     * 
     */
    public LteCellAdvancedProfileResult createLteCellAdvancedProfileResult() {
        return new LteCellAdvancedProfileResult();
    }

    /**
     * Create an instance of {@link EsonMlbWs }
     * 
     */
    public EsonMlbWs createEsonMlbWs() {
        return new EsonMlbWs();
    }

    /**
     * Create an instance of {@link SynchronizationWs }
     * 
     */
    public SynchronizationWs createSynchronizationWs() {
        return new SynchronizationWs();
    }

    /**
     * Create an instance of {@link LteCellSetWs }
     * 
     */
    public LteCellSetWs createLteCellSetWs() {
        return new LteCellSetWs();
    }

    /**
     * Create an instance of {@link NetworkingWs }
     * 
     */
    public NetworkingWs createNetworkingWs() {
        return new NetworkingWs();
    }

    /**
     * Create an instance of {@link RandomAccessWs }
     * 
     */
    public RandomAccessWs createRandomAccessWs() {
        return new RandomAccessWs();
    }

    /**
     * Create an instance of {@link EsonMroWs }
     * 
     */
    public EsonMroWs createEsonMroWs() {
        return new EsonMroWs();
    }

    /**
     * Create an instance of {@link LteSyncProfileResult }
     * 
     */
    public LteSyncProfileResult createLteSyncProfileResult() {
        return new LteSyncProfileResult();
    }

    /**
     * Create an instance of {@link LteNetworkProfileResult }
     * 
     */
    public LteNetworkProfileResult createLteNetworkProfileResult() {
        return new LteNetworkProfileResult();
    }

    /**
     * Create an instance of {@link CsfbCdma2KMobilityParams }
     * 
     */
    public CsfbCdma2KMobilityParams createCsfbCdma2KMobilityParams() {
        return new CsfbCdma2KMobilityParams();
    }

    /**
     * Create an instance of {@link EnbIPRouteWs }
     * 
     */
    public EnbIPRouteWs createEnbIPRouteWs() {
        return new EnbIPRouteWs();
    }

    /**
     * Create an instance of {@link LtePlmnEntryWs }
     * 
     */
    public LtePlmnEntryWs createLtePlmnEntryWs() {
        return new LtePlmnEntryWs();
    }

    /**
     * Create an instance of {@link CellVolteConfigurationWs }
     * 
     */
    public CellVolteConfigurationWs createCellVolteConfigurationWs() {
        return new CellVolteConfigurationWs();
    }

    /**
     * Create an instance of {@link LteSonProfileResult }
     * 
     */
    public LteSonProfileResult createLteSonProfileResult() {
        return new LteSonProfileResult();
    }

    /**
     * Create an instance of {@link UtranProfileResult }
     * 
     */
    public UtranProfileResult createUtranProfileResult() {
        return new UtranProfileResult();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeTriggerGaps }
     * 
     */
    public MobilityConnectedModeTriggerGaps createMobilityConnectedModeTriggerGaps() {
        return new MobilityConnectedModeTriggerGaps();
    }

    /**
     * Create an instance of {@link PlmnListContainer }
     * 
     */
    public PlmnListContainer createPlmnListContainer() {
        return new PlmnListContainer();
    }

    /**
     * Create an instance of {@link S1ListContainer }
     * 
     */
    public S1ListContainer createS1ListContainer() {
        return new S1ListContainer();
    }

    /**
     * Create an instance of {@link EmergencyCallWs }
     * 
     */
    public EmergencyCallWs createEmergencyCallWs() {
        return new EmergencyCallWs();
    }

    /**
     * Create an instance of {@link ReselectionToGeranWs }
     * 
     */
    public ReselectionToGeranWs createReselectionToGeranWs() {
        return new ReselectionToGeranWs();
    }

    /**
     * Create an instance of {@link QosMobilityConnectedModeFreqEarfcnListContainer }
     * 
     */
    public QosMobilityConnectedModeFreqEarfcnListContainer createQosMobilityConnectedModeFreqEarfcnListContainer() {
        return new QosMobilityConnectedModeFreqEarfcnListContainer();
    }

    /**
     * Create an instance of {@link LteEnbConfigResult }
     * 
     */
    public LteEnbConfigResult createLteEnbConfigResult() {
        return new LteEnbConfigResult();
    }

    /**
     * Create an instance of {@link HandoverEarfcn }
     * 
     */
    public HandoverEarfcn createHandoverEarfcn() {
        return new HandoverEarfcn();
    }

    /**
     * Create an instance of {@link EnbNeighborManagementWs }
     * 
     */
    public EnbNeighborManagementWs createEnbNeighborManagementWs() {
        return new EnbNeighborManagementWs();
    }

    /**
     * Create an instance of {@link PciRangeListContainer }
     * 
     */
    public PciRangeListContainer createPciRangeListContainer() {
        return new PciRangeListContainer();
    }

    /**
     * Create an instance of {@link MobilityInterRatUtranCoverageRedirection }
     * 
     */
    public MobilityInterRatUtranCoverageRedirection createMobilityInterRatUtranCoverageRedirection() {
        return new MobilityInterRatUtranCoverageRedirection();
    }

    /**
     * Create an instance of {@link MobilityGeranReselectionPriorityListContainer }
     * 
     */
    public MobilityGeranReselectionPriorityListContainer createMobilityGeranReselectionPriorityListContainer() {
        return new MobilityGeranReselectionPriorityListContainer();
    }

    /**
     * Create an instance of {@link CellNeighborManagementWs }
     * 
     */
    public CellNeighborManagementWs createCellNeighborManagementWs() {
        return new CellNeighborManagementWs();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeQosFreq }
     * 
     */
    public MobilityConnectedModeQosFreq createMobilityConnectedModeQosFreq() {
        return new MobilityConnectedModeQosFreq();
    }

    /**
     * Create an instance of {@link SynchronisationWs }
     * 
     */
    public SynchronisationWs createSynchronisationWs() {
        return new SynchronisationWs();
    }

    /**
     * Create an instance of {@link ProfileResult }
     * 
     */
    public ProfileResult createProfileResult() {
        return new ProfileResult();
    }

    /**
     * Create an instance of {@link LteMobilityProfileResult }
     * 
     */
    public LteMobilityProfileResult createLteMobilityProfileResult() {
        return new LteMobilityProfileResult();
    }

    /**
     * Create an instance of {@link CellRrcTimersWs }
     * 
     */
    public CellRrcTimersWs createCellRrcTimersWs() {
        return new CellRrcTimersWs();
    }

    /**
     * Create an instance of {@link LteNeighbourResult }
     * 
     */
    public LteNeighbourResult createLteNeighbourResult() {
        return new LteNeighbourResult();
    }

    /**
     * Create an instance of {@link LteSecurityProfileResult }
     * 
     */
    public LteSecurityProfileResult createLteSecurityProfileResult() {
        return new LteSecurityProfileResult();
    }

    /**
     * Create an instance of {@link PciRange }
     * 
     */
    public PciRange createPciRange() {
        return new PciRange();
    }

    /**
     * Create an instance of {@link QosEarfcn }
     * 
     */
    public QosEarfcn createQosEarfcn() {
        return new QosEarfcn();
    }

    /**
     * Create an instance of {@link ResourceStatus }
     * 
     */
    public ResourceStatus createResourceStatus() {
        return new ResourceStatus();
    }

    /**
     * Create an instance of {@link MobilityInterRatUtranReselection }
     * 
     */
    public MobilityInterRatUtranReselection createMobilityInterRatUtranReselection() {
        return new MobilityInterRatUtranReselection();
    }

    /**
     * Create an instance of {@link LteSonCSonWs }
     * 
     */
    public LteSonCSonWs createLteSonCSonWs() {
        return new LteSonCSonWs();
    }

    /**
     * Create an instance of {@link LteCellGetWs }
     * 
     */
    public LteCellGetWs createLteCellGetWs() {
        return new LteCellGetWs();
    }

    /**
     * Create an instance of {@link Lte3RdPartyResultWs }
     * 
     */
    public Lte3RdPartyResultWs createLte3RdPartyResultWs() {
        return new Lte3RdPartyResultWs();
    }

    /**
     * Create an instance of {@link UlPktDataPriorityListContainer }
     * 
     */
    public UlPktDataPriorityListContainer createUlPktDataPriorityListContainer() {
        return new UlPktDataPriorityListContainer();
    }

    /**
     * Create an instance of {@link RrcTimersWs }
     * 
     */
    public RrcTimersWs createRrcTimersWs() {
        return new RrcTimersWs();
    }

    /**
     * Create an instance of {@link RsiRange }
     * 
     */
    public RsiRange createRsiRange() {
        return new RsiRange();
    }

    /**
     * Create an instance of {@link NodeSimple }
     * 
     */
    public NodeSimple createNodeSimple() {
        return new NodeSimple();
    }

    /**
     * Create an instance of {@link PlugAndPlayWs }
     * 
     */
    public PlugAndPlayWs createPlugAndPlayWs() {
        return new PlugAndPlayWs();
    }

    /**
     * Create an instance of {@link AnrFreq }
     * 
     */
    public AnrFreq createAnrFreq() {
        return new AnrFreq();
    }

    /**
     * Create an instance of {@link NodeResult }
     * 
     */
    public NodeResult createNodeResult() {
        return new NodeResult();
    }

    /**
     * Create an instance of {@link MobilityInterRatGeranReselection }
     * 
     */
    public MobilityInterRatGeranReselection createMobilityInterRatGeranReselection() {
        return new MobilityInterRatGeranReselection();
    }

    /**
     * Create an instance of {@link MobilityUtranReselectionPriorityListContainer }
     * 
     */
    public MobilityUtranReselectionPriorityListContainer createMobilityUtranReselectionPriorityListContainer() {
        return new MobilityUtranReselectionPriorityListContainer();
    }

    /**
     * Create an instance of {@link MobilityConnectedModeStopGaps }
     * 
     */
    public MobilityConnectedModeStopGaps createMobilityConnectedModeStopGaps() {
        return new MobilityConnectedModeStopGaps();
    }

    /**
     * Create an instance of {@link MobilityWs }
     * 
     */
    public MobilityWs createMobilityWs() {
        return new MobilityWs();
    }

    /**
     * Create an instance of {@link RsiRangeListContainer }
     * 
     */
    public RsiRangeListContainer createRsiRangeListContainer() {
        return new RsiRangeListContainer();
    }

    /**
     * Create an instance of {@link LteRadioProfileResult }
     * 
     */
    public LteRadioProfileResult createLteRadioProfileResult() {
        return new LteRadioProfileResult();
    }

    /**
     * Create an instance of {@link EsonMcimWs }
     * 
     */
    public EsonMcimWs createEsonMcimWs() {
        return new EsonMcimWs();
    }

    /**
     * Create an instance of {@link EnbPnpConfig }
     * 
     */
    public EnbPnpConfig createEnbPnpConfig() {
        return new EnbPnpConfig();
    }

    /**
     * Create an instance of {@link Sib1Ws }
     * 
     */
    public Sib1Ws createSib1Ws() {
        return new Sib1Ws();
    }

    /**
     * Create an instance of {@link LteCSonEntryWs }
     * 
     */
    public LteCSonEntryWs createLteCSonEntryWs() {
        return new LteCSonEntryWs();
    }

    /**
     * Create an instance of {@link LteManagementProfileResult }
     * 
     */
    public LteManagementProfileResult createLteManagementProfileResult() {
        return new LteManagementProfileResult();
    }

    /**
     * Create an instance of {@link AutoPciWs }
     * 
     */
    public AutoPciWs createAutoPciWs() {
        return new AutoPciWs();
    }

    /**
     * Create an instance of {@link AnrFreqListContainer }
     * 
     */
    public AnrFreqListContainer createAnrFreqListContainer() {
        return new AnrFreqListContainer();
    }

    /**
     * Create an instance of {@link ReselectionToUtranWs }
     * 
     */
    public ReselectionToUtranWs createReselectionToUtranWs() {
        return new ReselectionToUtranWs();
    }

    /**
     * Create an instance of {@link WiFiAccessPointWs }
     * 
     */
    public WiFiAccessPointWs createWiFiAccessPointWs() {
        return new WiFiAccessPointWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterFreq }
     * 
     */
    public MobilityIdleModeInterFreq createMobilityIdleModeInterFreq() {
        return new MobilityIdleModeInterFreq();
    }

    /**
     * Create an instance of {@link HandoverWs }
     * 
     */
    public HandoverWs createHandoverWs() {
        return new HandoverWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeInterFreqReselectionPriorityListContainer }
     * 
     */
    public MobilityIdleModeInterFreqReselectionPriorityListContainer createMobilityIdleModeInterFreqReselectionPriorityListContainer() {
        return new MobilityIdleModeInterFreqReselectionPriorityListContainer();
    }

    /**
     * Create an instance of {@link LteAdvancedProfileResult }
     * 
     */
    public LteAdvancedProfileResult createLteAdvancedProfileResult() {
        return new LteAdvancedProfileResult();
    }

    /**
     * Create an instance of {@link LteAddNeighbourForCellWs }
     * 
     */
    public LteAddNeighbourForCellWs createLteAddNeighbourForCellWs() {
        return new LteAddNeighbourForCellWs();
    }

    /**
     * Create an instance of {@link TrafficManagementProfileResult }
     * 
     */
    public TrafficManagementProfileResult createTrafficManagementProfileResult() {
        return new TrafficManagementProfileResult();
    }

    /**
     * Create an instance of {@link PlugAndPlayWarmRebootMaskWs }
     * 
     */
    public PlugAndPlayWarmRebootMaskWs createPlugAndPlayWarmRebootMaskWs() {
        return new PlugAndPlayWarmRebootMaskWs();
    }

    /**
     * Create an instance of {@link Cmpv2ConfigWS }
     * 
     */
    public Cmpv2ConfigWS createCmpv2ConfigWS() {
        return new Cmpv2ConfigWS();
    }

    /**
     * Create an instance of {@link WSEmbmsAreaEntry }
     * 
     */
    public WSEmbmsAreaEntry createWSEmbmsAreaEntry() {
        return new WSEmbmsAreaEntry();
    }

    /**
     * Create an instance of {@link EtwsWs }
     * 
     */
    public EtwsWs createEtwsWs() {
        return new EtwsWs();
    }

    /**
     * Create an instance of {@link MobilityIdleModeIntraFreq }
     * 
     */
    public MobilityIdleModeIntraFreq createMobilityIdleModeIntraFreq() {
        return new MobilityIdleModeIntraFreq();
    }

    /**
     * Create an instance of {@link LteUlPktDataPriorityEntryWs }
     * 
     */
    public LteUlPktDataPriorityEntryWs createLteUlPktDataPriorityEntryWs() {
        return new LteUlPktDataPriorityEntryWs();
    }

    /**
     * Create an instance of {@link IPSecConfigWS }
     * 
     */
    public IPSecConfigWS createIPSecConfigWS() {
        return new IPSecConfigWS();
    }

    /**
     * Create an instance of {@link AnrWs }
     * 
     */
    public AnrWs createAnrWs() {
        return new AnrWs();
    }

    /**
     * Create an instance of {@link WSEmbmsServiceAreaEntry }
     * 
     */
    public WSEmbmsServiceAreaEntry createWSEmbmsServiceAreaEntry() {
        return new WSEmbmsServiceAreaEntry();
    }

    /**
     * Create an instance of {@link IpRouteListContainer }
     * 
     */
    public IpRouteListContainer createIpRouteListContainer() {
        return new IpRouteListContainer();
    }

    /**
     * Create an instance of {@link VolteConfigurationWs }
     * 
     */
    public VolteConfigurationWs createVolteConfigurationWs() {
        return new VolteConfigurationWs();
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnbId", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyEnbId(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyEnbId_QNAME, Integer.class, Enb3RdParty.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerIdentity_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerCellGroup_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Latitude", scope = Enb3RdParty.class)
    public JAXBElement<BigDecimal> createEnb3RdPartyLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Enb3RdPartyLatitude_QNAME, BigDecimal.class, Enb3RdParty.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlEarfcn", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyDlEarfcn(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyDlEarfcn_QNAME, Integer.class, Enb3RdParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Longitude", scope = Enb3RdParty.class)
    public JAXBElement<BigDecimal> createEnb3RdPartyLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Enb3RdPartyLongitude_QNAME, BigDecimal.class, Enb3RdParty.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Tac", scope = Enb3RdParty.class)
    public JAXBElement<Integer> createEnb3RdPartyTac(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyTac_QNAME, Integer.class, Enb3RdParty.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NrtSteadyThresholdIsDefault", scope = AnrWs.class)
    public JAXBElement<Boolean> createAnrWsNrtSteadyThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AnrWsNrtSteadyThresholdIsDefault_QNAME, Boolean.class, AnrWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NrtSteadyThreshold", scope = AnrWs.class)
    public JAXBElement<Integer> createAnrWsNrtSteadyThreshold(Integer value) {
        return new JAXBElement<Integer>(_AnrWsNrtSteadyThreshold_QNAME, Integer.class, AnrWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoKpiReportInterval", scope = EsonMroWs.class)
    public JAXBElement<Integer> createEsonMroWsHoKpiReportInterval(Integer value) {
        return new JAXBElement<Integer>(_EsonMroWsHoKpiReportInterval_QNAME, Integer.class, EsonMroWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoKpiReportIntervalIsDefault", scope = EsonMroWs.class)
    public JAXBElement<Boolean> createEsonMroWsHoKpiReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMroWsHoKpiReportIntervalIsDefault_QNAME, Boolean.class, EsonMroWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoReportEvaluationTimer", scope = EsonMroWs.class)
    public JAXBElement<Integer> createEsonMroWsHoReportEvaluationTimer(Integer value) {
        return new JAXBElement<Integer>(_EsonMroWsHoReportEvaluationTimer_QNAME, Integer.class, EsonMroWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoReportEvaluationTimerIsDefault", scope = EsonMroWs.class)
    public JAXBElement<Boolean> createEsonMroWsHoReportEvaluationTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMroWsHoReportEvaluationTimerIsDefault_QNAME, Boolean.class, EsonMroWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = MobilityIdleModeInterFreqReselectionPriorityEntryWs.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqReselectionPriorityEntryWsEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, MobilityIdleModeInterFreqReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = MobilityIdleModeInterFreqReselectionPriorityEntryWs.class)
    public JAXBElement<String> createMobilityIdleModeInterFreqReselectionPriorityEntryWsPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterFreqReselectionPriorityEntryWsPriority_QNAME, String.class, MobilityIdleModeInterFreqReselectionPriorityEntryWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryArfcn", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfilePrimaryArfcn(Integer value) {
        return new JAXBElement<Integer>(_UtranProfilePrimaryArfcn_QNAME, Integer.class, UtranProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryArfcnBand", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfilePrimaryArfcnBand(Integer value) {
        return new JAXBElement<Integer>(_UtranProfilePrimaryArfcnBand_QNAME, Integer.class, UtranProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryArfcn", scope = UtranProfile.class)
    public JAXBElement<Integer> createUtranProfileSecondaryArfcn(Integer value) {
        return new JAXBElement<Integer>(_UtranProfileSecondaryArfcn_QNAME, Integer.class, UtranProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultPagingCycle", scope = RrcTimersWs.class)
    public JAXBElement<String> createRrcTimersWsDefaultPagingCycle(String value) {
        return new JAXBElement<String>(_RrcTimersWsDefaultPagingCycle_QNAME, String.class, RrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultPagingCycleIsDefault", scope = RrcTimersWs.class)
    public JAXBElement<Boolean> createRrcTimersWsDefaultPagingCycleIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RrcTimersWsDefaultPagingCycleIsDefault_QNAME, Boolean.class, RrcTimersWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QOffsetRange", scope = LteAddNeighbourWs.class)
    public JAXBElement<String> createLteAddNeighbourWsQOffsetRange(String value) {
        return new JAXBElement<String>(_LteAddNeighbourWsQOffsetRange_QNAME, String.class, LteAddNeighbourWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = LteAddNeighbourWs.class)
    public JAXBElement<HandoverType> createLteAddNeighbourWsHandoverType(HandoverType value) {
        return new JAXBElement<HandoverType>(_LteAddNeighbourWsHandoverType_QNAME, HandoverType.class, LteAddNeighbourWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciConfusionAllowedIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsPciConfusionAllowedIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsPciConfusionAllowedIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeCollisionResolutionThresholdIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsUeCollisionResolutionThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsUeCollisionResolutionThresholdIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PciAllocPolicyTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciAllocPolicy", scope = AutoPciWs.class)
    public JAXBElement<PciAllocPolicyTypes> createAutoPciWsPciAllocPolicy(PciAllocPolicyTypes value) {
        return new JAXBElement<PciAllocPolicyTypes>(_AutoPciWsPciAllocPolicy_QNAME, PciAllocPolicyTypes.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CollisionResolutionDelayfactor", scope = AutoPciWs.class)
    public JAXBElement<Integer> createAutoPciWsCollisionResolutionDelayfactor(Integer value) {
        return new JAXBElement<Integer>(_AutoPciWsCollisionResolutionDelayfactor_QNAME, Integer.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciAllocPolicyIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsPciAllocPolicyIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsPciAllocPolicyIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciConfusionAllowed", scope = AutoPciWs.class)
    public JAXBElement<EnabledDisabledValues> createAutoPciWsPciConfusionAllowed(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_AutoPciWsPciConfusionAllowed_QNAME, EnabledDisabledValues.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciCollisionResolutionTimerIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsPciCollisionResolutionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsPciCollisionResolutionTimerIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPciListSize", scope = AutoPciWs.class)
    public JAXBElement<Integer> createAutoPciWsInitialPciListSize(Integer value) {
        return new JAXBElement<Integer>(_AutoPciWsInitialPciListSize_QNAME, Integer.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciCollisionResolutionTimer", scope = AutoPciWs.class)
    public JAXBElement<Integer> createAutoPciWsPciCollisionResolutionTimer(Integer value) {
        return new JAXBElement<Integer>(_AutoPciWsPciCollisionResolutionTimer_QNAME, Integer.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialPciListSizeIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsInitialPciListSizeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsInitialPciListSizeIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeCollisionResolutionThreshold", scope = AutoPciWs.class)
    public JAXBElement<Integer> createAutoPciWsUeCollisionResolutionThreshold(Integer value) {
        return new JAXBElement<Integer>(_AutoPciWsUeCollisionResolutionThreshold_QNAME, Integer.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CollisionResolutionDelayfactorIsDefault", scope = AutoPciWs.class)
    public JAXBElement<Boolean> createAutoPciWsCollisionResolutionDelayfactorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_AutoPciWsCollisionResolutionDelayfactorIsDefault_QNAME, Boolean.class, AutoPciWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci5IsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCbrQci5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCbrQci5IsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwMediumThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusHwMediumThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusHwMediumThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAllowedMeasIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusMaxAllowedMeasIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusMaxAllowedMeasIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValueIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCapacityClassValueIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCapacityClassValueIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci8IsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCbrQci8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCbrQci8IsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1BandwidthIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusS1BandwidthIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusS1BandwidthIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1MediumThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusS1MediumThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusS1MediumThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityClassValue", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCapacityClassValue(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCapacityClassValue_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwLowThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusHwLowThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusHwLowThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci6IsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCbrQci6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCbrQci6IsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1HighThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusS1HighThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusS1HighThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1LowThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusS1LowThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusS1LowThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAllowedMeas", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusMaxAllowedMeas(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusMaxAllowedMeas_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwHighThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusHwHighThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusHwHighThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwLowThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusHwLowThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusHwLowThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1Bandwidth", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusS1Bandwidth(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusS1Bandwidth_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci9", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCbrQci9(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCbrQci9_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci8", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCbrQci8(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCbrQci8_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci7", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCbrQci7(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCbrQci7_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci6", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCbrQci6(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCbrQci6_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci5", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusCbrQci5(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusCbrQci5_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci9IsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCbrQci9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCbrQci9IsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1HighThreshold", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusS1HighThreshold(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusS1HighThreshold_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasSampleInterval", scope = ResourceStatus.class)
    public JAXBElement<Integer> createResourceStatusMeasSampleInterval(Integer value) {
        return new JAXBElement<Integer>(_ResourceStatusMeasSampleInterval_QNAME, Integer.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeasSampleIntervalIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusMeasSampleIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusMeasSampleIntervalIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwMediumThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusHwMediumThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusHwMediumThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CbrQci7IsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusCbrQci7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusCbrQci7IsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1LowThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusS1LowThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusS1LowThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HwHighThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusHwHighThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusHwHighThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1MediumThresholdIsDefault", scope = ResourceStatus.class)
    public JAXBElement<Boolean> createResourceStatusS1MediumThresholdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ResourceStatusS1MediumThresholdIsDefault_QNAME, Boolean.class, ResourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtranSfMediumIsDefault", scope = ReselectionToUtranWs.class)
    public JAXBElement<Boolean> createReselectionToUtranWsReselectionUtranSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToUtranWsReselectionUtranSfMediumIsDefault_QNAME, Boolean.class, ReselectionToUtranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtranSfHighIsDefault", scope = ReselectionToUtranWs.class)
    public JAXBElement<Boolean> createReselectionToUtranWsReselectionUtranSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToUtranWsReselectionUtranSfHighIsDefault_QNAME, Boolean.class, ReselectionToUtranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtranSfMedium", scope = ReselectionToUtranWs.class)
    public JAXBElement<String> createReselectionToUtranWsReselectionUtranSfMedium(String value) {
        return new JAXBElement<String>(_ReselectionToUtranWsReselectionUtranSfMedium_QNAME, String.class, ReselectionToUtranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionUtranSfHigh", scope = ReselectionToUtranWs.class)
    public JAXBElement<String> createReselectionToUtranWsReselectionUtranSfHigh(String value) {
        return new JAXBElement<String>(_ReselectionToUtranWsReselectionUtranSfHigh_QNAME, String.class, ReselectionToUtranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WimaxCoexistenceFrameShiftIsDefault", scope = SynchronisationWs.class)
    public JAXBElement<Boolean> createSynchronisationWsWimaxCoexistenceFrameShiftIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SynchronisationWsWimaxCoexistenceFrameShiftIsDefault_QNAME, Boolean.class, SynchronisationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WimaxCoexistenceFrameShift", scope = SynchronisationWs.class)
    public JAXBElement<Integer> createSynchronisationWsWimaxCoexistenceFrameShift(Integer value) {
        return new JAXBElement<Integer>(_SynchronisationWsWimaxCoexistenceFrameShift_QNAME, Integer.class, SynchronisationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaPreambleMsg3", scope = UplinkPowerControlWs.class)
    public JAXBElement<Integer> createUplinkPowerControlWsDeltaPreambleMsg3(Integer value) {
        return new JAXBElement<Integer>(_UplinkPowerControlWsDeltaPreambleMsg3_QNAME, Integer.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2a", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsDeltaFPucchFormat2A(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsDeltaFPucchFormat2A_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1IsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaFPucchFormat1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaFPucchFormat1IsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2bIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaFPucchFormat2BIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaFPucchFormat2BIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2b", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsDeltaFPucchFormat2B(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsDeltaFPucchFormat2B_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPucchIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsP0NominalPucchIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsP0NominalPucchIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FilterCoefficientIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsFilterCoefficientIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsFilterCoefficientIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Alpha", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsAlpha(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsAlpha_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1b", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsDeltaFPucchFormat1B(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsDeltaFPucchFormat1B_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1bIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaFPucchFormat1BIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaFPucchFormat1BIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPuschIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsP0NominalPuschIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsP0NominalPuschIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaPreambleMsg3IsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaPreambleMsg3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaPreambleMsg3IsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2IsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaFPucchFormat2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaFPucchFormat2IsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FilterCoefficient", scope = UplinkPowerControlWs.class)
    public JAXBElement<Integer> createUplinkPowerControlWsFilterCoefficient(Integer value) {
        return new JAXBElement<Integer>(_UplinkPowerControlWsFilterCoefficient_QNAME, Integer.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPucch", scope = UplinkPowerControlWs.class)
    public JAXBElement<Integer> createUplinkPowerControlWsP0NominalPucch(Integer value) {
        return new JAXBElement<Integer>(_UplinkPowerControlWsP0NominalPucch_QNAME, Integer.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2aIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsDeltaFPucchFormat2AIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsDeltaFPucchFormat2AIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "P0NominalPusch", scope = UplinkPowerControlWs.class)
    public JAXBElement<Integer> createUplinkPowerControlWsP0NominalPusch(Integer value) {
        return new JAXBElement<Integer>(_UplinkPowerControlWsP0NominalPusch_QNAME, Integer.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AlphaIsDefault", scope = UplinkPowerControlWs.class)
    public JAXBElement<Boolean> createUplinkPowerControlWsAlphaIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_UplinkPowerControlWsAlphaIsDefault_QNAME, Boolean.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat1", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsDeltaFPucchFormat1(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsDeltaFPucchFormat1_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DeltaFPucchFormat2", scope = UplinkPowerControlWs.class)
    public JAXBElement<String> createUplinkPowerControlWsDeltaFPucchFormat2(String value) {
        return new JAXBElement<String>(_UplinkPowerControlWsDeltaFPucchFormat2_QNAME, String.class, UplinkPowerControlWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrpIsDefault", scope = MobilityWs.class)
    public JAXBElement<Boolean> createMobilityWsFiltercoefficientRsrpIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityWsFiltercoefficientRsrpIsDefault_QNAME, Boolean.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrp", scope = MobilityWs.class)
    public JAXBElement<String> createMobilityWsFiltercoefficientRsrp(String value) {
        return new JAXBElement<String>(_MobilityWsFiltercoefficientRsrp_QNAME, String.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrq", scope = MobilityWs.class)
    public JAXBElement<String> createMobilityWsFiltercoefficientRsrq(String value) {
        return new JAXBElement<String>(_MobilityWsFiltercoefficientRsrq_QNAME, String.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCellsIsDefault", scope = MobilityWs.class)
    public JAXBElement<Boolean> createMobilityWsMaxReportCellsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityWsMaxReportCellsIsDefault_QNAME, Boolean.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmount", scope = MobilityWs.class)
    public JAXBElement<String> createMobilityWsReportAmount(String value) {
        return new JAXBElement<String>(_MobilityWsReportAmount_QNAME, String.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxReportCells", scope = MobilityWs.class)
    public JAXBElement<Integer> createMobilityWsMaxReportCells(Integer value) {
        return new JAXBElement<Integer>(_MobilityWsMaxReportCells_QNAME, Integer.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FiltercoefficientRsrqIsDefault", scope = MobilityWs.class)
    public JAXBElement<Boolean> createMobilityWsFiltercoefficientRsrqIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityWsFiltercoefficientRsrqIsDefault_QNAME, Boolean.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReportAmountIsDefault", scope = MobilityWs.class)
    public JAXBElement<Boolean> createMobilityWsReportAmountIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityWsReportAmountIsDefault_QNAME, Boolean.class, MobilityWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaAckStepDownFactor", scope = CellVolteConfigurationWs.class)
    public JAXBElement<String> createCellVolteConfigurationWsDlaAckStepDownFactor(String value) {
        return new JAXBElement<String>(_CellVolteConfigurationWsDlaAckStepDownFactor_QNAME, String.class, CellVolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaAckStepDownFactorIsDefault", scope = CellVolteConfigurationWs.class)
    public JAXBElement<Boolean> createCellVolteConfigurationWsDlaAckStepDownFactorIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellVolteConfigurationWsDlaAckStepDownFactorIsDefault_QNAME, Boolean.class, CellVolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM1", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForM1(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForM1_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM2", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForM2(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForM2_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min40MHzChannel", scope = EnbDetailsGet.class)
    public JAXBElement<Integer> createEnbDetailsGetMin40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMin40MHzChannel_QNAME, Integer.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsX2UInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsX2UInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1C", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForS1C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForS1C_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsS1CInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsS1CInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max40MHzChannel", scope = EnbDetailsGet.class)
    public JAXBElement<Integer> createEnbDetailsGetMax40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMax40MHzChannel_QNAME, Integer.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsX2CInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsX2CInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2U", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForX2U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForX2U_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = EnbDetailsGet.class)
    public JAXBElement<NodeManagementModes> createEnbDetailsGetManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_EnbDetailsGetManagedMode_QNAME, NodeManagementModes.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveAntenna", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetActiveAntenna(String value) {
        return new JAXBElement<String>(_EnbDetailsGetActiveAntenna_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1InterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsM1InterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsM1InterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ENodeBID", scope = EnbDetailsGet.class)
    public JAXBElement<Integer> createEnbDetailsGetENodeBID(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetENodeBID_QNAME, Integer.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultX2ControlStateForNeighbours", scope = EnbDetailsGet.class)
    public JAXBElement<X2ControlStateTypes> createEnbDetailsGetDefaultX2ControlStateForNeighbours(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_EnbDetailsGetDefaultX2ControlStateForNeighbours_QNAME, X2ControlStateTypes.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForPtpSlave", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForPtpSlave(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForPtpSlave_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonServerInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsCSonServerInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsCSonServerInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAutoX2ControlForNeighboursEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<Boolean> createEnbDetailsGetIsAutoX2ControlForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetIsAutoX2ControlForNeighboursEnabled_QNAME, Boolean.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsS1UInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsS1UInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCSonServer", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForCSonServer(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForCSonServer_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2InterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsM2InterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsM2InterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForManagement", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForManagement(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForManagement_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min20MHzChannel", scope = EnbDetailsGet.class)
    public JAXBElement<Integer> createEnbDetailsGetMin20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMin20MHzChannel_QNAME, Integer.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpSlaveInterfaceEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<EnabledStates> createEnbDetailsGetIsPtpSlaveInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsPtpSlaveInterfaceEnabled_QNAME, EnabledStates.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1U", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForS1U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForS1U_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2C", scope = EnbDetailsGet.class)
    public JAXBElement<String> createEnbDetailsGetInterfaceToUseForX2C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForX2C_QNAME, String.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2ConfigurationUpdateForNeighboursEnabled", scope = EnbDetailsGet.class)
    public JAXBElement<Boolean> createEnbDetailsGetIsX2ConfigurationUpdateForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetIsX2ConfigurationUpdateForNeighboursEnabled_QNAME, Boolean.class, EnbDetailsGet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max20MHzChannel", scope = EnbDetailsGet.class)
    public JAXBElement<Integer> createEnbDetailsGetMax20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMax20MHzChannel_QNAME, Integer.class, EnbDetailsGet.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass13Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass13Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EmergencyAreaId", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsEmergencyAreaId(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsEmergencyAreaId_QNAME, Integer.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass15Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass15Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = LteCellSetWs.class)
    public JAXBElement<String> createLteCellSetWsCellID(String value) {
        return new JAXBElement<String>(_LteCellSetWsCellID_QNAME, String.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass12Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsSignalingAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass12Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass11Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass11Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachFreqOffset_QNAME, Integer.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessBarred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessBarred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessBarred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TrackingAreaCode", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsTrackingAreaCode(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsTrackingAreaCode_QNAME, Integer.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass15Barred", scope = LteCellSetWs.class)
    public JAXBElement<Boolean> createLteCellSetWsIsDataAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass15Barred_QNAME, Boolean.class, LteCellSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerIdentity_QNAME, Integer.class, LteCellSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LteCellSetWs.class)
    public JAXBElement<Integer> createLteCellSetWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerCellGroup_QNAME, Integer.class, LteCellSetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbEmbmsProfile.class)
    public JAXBElement<CategoriesLte> createEnbEmbmsProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbEmbmsProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiListSize", scope = RsiRange.class)
    public JAXBElement<Integer> createRsiRangeRsiListSize(Integer value) {
        return new JAXBElement<Integer>(_RsiRangeRsiListSize_QNAME, Integer.class, RsiRange.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsStandardVoLTECodec", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsStandardVoLTECodec(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsStandardVoLTECodec_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MceSctpPort", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileMceSctpPort(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileMceSctpPort_QNAME, Integer.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2McePresent", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileM2McePresent(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileM2McePresent_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsMgmtVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsMgmtVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsMgmtVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2CVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileX2CVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileX2CVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MgmtVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileMgmtVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileMgmtVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsX2UVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsX2UVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsCSonVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsCSonVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbNetworkProfile.class)
    public JAXBElement<CategoriesLte> createEnbNetworkProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1CVlanId", scope = EnbNetworkProfile.class)
    public JAXBElement<Integer> createEnbNetworkProfileS1CVlanId(Integer value) {
        return new JAXBElement<Integer>(_EnbNetworkProfileS1CVlanId_QNAME, Integer.class, EnbNetworkProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsPtpVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsPtpVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1VlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsM1VlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsM1VlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CVlanConfigured", scope = EnbNetworkProfile.class)
    public JAXBElement<Boolean> createEnbNetworkProfileIsS1CVlanConfigured(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNetworkProfileIsS1CVlanConfigured_QNAME, Boolean.class, EnbNetworkProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PciEnabled", scope = EnbSonProfile.class)
    public JAXBElement<Boolean> createEnbSonProfilePciEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSonProfilePciEnabled_QNAME, Boolean.class, EnbSonProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSonProfile.class)
    public JAXBElement<CategoriesLte> createEnbSonProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSonProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsiEnabled", scope = EnbSonProfile.class)
    public JAXBElement<Boolean> createEnbSonProfileRsiEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSonProfileRsiEnabled_QNAME, Boolean.class, EnbSonProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpMode", scope = EnbSonProfile.class)
    public JAXBElement<PnpModes> createEnbSonProfilePnpMode(PnpModes value) {
        return new JAXBElement<PnpModes>(_EnbSonProfilePnpMode_QNAME, PnpModes.class, EnbSonProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbCellAdvancedProfile.class)
    public JAXBElement<CategoriesLte> createEnbCellAdvancedProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbCellAdvancedProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<String> createMobilityConnectedModeTriggerGapsTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeTriggerGapsTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<Integer> createMobilityConnectedModeTriggerGapsRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerGapEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<TriggerGapEventTypes> createMobilityConnectedModeTriggerGapsEventType(TriggerGapEventTypes value) {
        return new JAXBElement<TriggerGapEventTypes>(_MobilityConnectedModeTriggerGapsEventType_QNAME, TriggerGapEventTypes.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeTriggerGaps.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeTriggerGapsHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeTriggerGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeTriggerGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<Integer> createMobilityUtranReselectionPriorityEntryWsArfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityUtranReselectionPriorityEntryWsArfcn_QNAME, Integer.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DuplexMode", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<RfProfileDuplexModes> createMobilityUtranReselectionPriorityEntryWsDuplexMode(RfProfileDuplexModes value) {
        return new JAXBElement<RfProfileDuplexModes>(_MobilityUtranReselectionPriorityEntryWsDuplexMode_QNAME, RfProfileDuplexModes.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = MobilityUtranReselectionPriorityEntryWs.class)
    public JAXBElement<String> createMobilityUtranReselectionPriorityEntryWsPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterFreqReselectionPriorityEntryWsPriority_QNAME, String.class, MobilityUtranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = HandoverEarfcn.class)
    public JAXBElement<Integer> createHandoverEarfcnEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, HandoverEarfcn.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsArfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityUtranReselectionPriorityEntryWsArfcn_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarketId", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsMarketId(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsMarketId_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClass", scope = CsfbCdma2KCellParams.class)
    public JAXBElement<Integer> createCsfbCdma2KCellParamsBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsBandClass_QNAME, Integer.class, CsfbCdma2KCellParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TAddIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTAddIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTAddIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystEnabled", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzHystEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzHystEnabled_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerDownRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerDownRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerDownRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotReport", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotReport(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotReport_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsHomeRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsHomeRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForNidRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForNidRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForNidRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotIncIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotIncIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotIncIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Imsi1112Included", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsi1112Included(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsi1112Included_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BypassRegIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBypassRegIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBypassRegIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClassInfoReqIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsBandClassInfoReqIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsBandClassInfoReqIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BandClass", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KCellParamsBandClass_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsHomeReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsHomeReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupInclIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupInclIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupInclIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxAddServInstance", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMaxAddServInstance(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMaxAddServInstance_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzIdHystParametersIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzIdHystParametersIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzIdHystParametersIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LtmOffIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsLtmOffIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsLtmOffIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsgIntegritySup", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsgIntegritySup(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsgIntegritySup_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsgIntegritySupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMsgIntegritySupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMsgIntegritySupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ImsiTSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsiTSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsiTSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Gcsnal2AckTimerIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsGcsnal2AckTimerIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LtmOff", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsLtmOff(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsLtmOff_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReconnectMsgIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsReconnectMsgIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsReconnectMsgIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupIncl", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupIncl(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupIncl_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FpcFchInitSetPtRc4", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsFpcFchInitSetPtRc4(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsFpcFchInitSetPtRc4_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbInRcnmInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbInRcnmInd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbInRcnmInd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeidReqdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMeidReqdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMeidReqdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultNids", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultNids(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultNids_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PacketZoneIdIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPacketZoneIdIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPacketZoneIdIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SdbInRcnmIndIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSdbInRcnmIndIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSdbInRcnmIndIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TAdd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsTAdd(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsTAdd_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SigIntegritySupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsSigIntegritySupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsSigIntegritySupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RerModeSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsRerModeSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsRerModeSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BypassRegInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsBypassRegInd(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsBypassRegInd_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxNumAltSo", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMaxNumAltSo(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMaxNumAltSo_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReconnectMsgInd", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsReconnectMsgInd(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsReconnectMsgInd_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AuthIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsAuthIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsAuthIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MinPRevIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMinPRevIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMinPRevIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultSidsIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsMultSidsIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsMultSidsIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AltBandClass", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsAltBandClass(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsAltBandClass_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForSidRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForSidRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForSidRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TkzModeSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTkzModeSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTkzModeSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncryptModeIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsEncryptModeIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsEncryptModeIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalZonesIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsTotalZonesIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsTotalZonesIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EncSupportedIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsEncSupportedIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsEncSupportedIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ParameterReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsParameterReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsParameterReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PowerUpReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPowerUpReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPowerUpReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForNidReg", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsForNidReg(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsForNidReg_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PzHystInfoIncl", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPzHystInfoIncl(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPzHystInfoIncl_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NegSlotCycleIndexSupIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsNegSlotCycleIndexSupIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Mcc", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Integer> createCsfbCdma2KMobilityParamsMcc(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsMcc_QNAME, Integer.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ParameterRegIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsParameterRegIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsParameterRegIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrefMsidTypeIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPrefMsidTypeIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPrefMsidTypeIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PilotReportIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsPilotReportIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsPilotReportIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ImsiTSupported", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsImsiTSupported(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsImsiTSupported_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LpSecIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsLpSecIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsLpSecIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DayLtIncluded", scope = CsfbCdma2KMobilityParams.class)
    public JAXBElement<Boolean> createCsfbCdma2KMobilityParamsDayLtIncluded(Boolean value) {
        return new JAXBElement<Boolean>(_CsfbCdma2KMobilityParamsDayLtIncluded_QNAME, Boolean.class, CsfbCdma2KMobilityParams.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoAttemptsTh", scope = CellNeighborManagementWs.class)
    public JAXBElement<Integer> createCellNeighborManagementWsHoAttemptsTh(Integer value) {
        return new JAXBElement<Integer>(_CellNeighborManagementWsHoAttemptsTh_QNAME, Integer.class, CellNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoAttemptsThIsDefault", scope = CellNeighborManagementWs.class)
    public JAXBElement<Boolean> createCellNeighborManagementWsHoAttemptsThIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellNeighborManagementWsHoAttemptsThIsDefault_QNAME, Boolean.class, CellNeighborManagementWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHigh", scope = MobilityInterRatGeranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatGeranReselectionThreshXHigh(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXHigh_QNAME, Integer.class, MobilityInterRatGeranReselection.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<String> createMobilityConnectedModeFreqTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeFreqRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeFreqA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeFreqTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeFreqRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeFreqEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeTriggerGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeFreqHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeTriggerGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LoadSheddingMode", scope = TrafficManagementProfile.class)
    public JAXBElement<EnabledStates> createTrafficManagementProfileLoadSheddingMode(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_TrafficManagementProfileLoadSheddingMode_QNAME, EnabledStates.class, TrafficManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = TrafficManagementProfile.class)
    public JAXBElement<CategoriesLte> createTrafficManagementProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, TrafficManagementProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MonitorInterval", scope = TrafficManagementProfile.class)
    public JAXBElement<Integer> createTrafficManagementProfileMonitorInterval(Integer value) {
        return new JAXBElement<Integer>(_TrafficManagementProfileMonitorInterval_QNAME, Integer.class, TrafficManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbUtranEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileCsfbUtranEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileCsfbUtranEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsThresholdBasedMeasurementEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileIsThresholdBasedMeasurementEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileIsThresholdBasedMeasurementEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileCsfbEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileCsfbEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatGeranReselectionModeEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileIsInterRatGeranReselectionModeEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileIsInterRatGeranReselectionModeEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UseConnectedModeIntraPropertiesForInter", scope = EnbMobilityProfile.class)
    public JAXBElement<Boolean> createEnbMobilityProfileUseConnectedModeIntraPropertiesForInter(Boolean value) {
        return new JAXBElement<Boolean>(_EnbMobilityProfileUseConnectedModeIntraPropertiesForInter_QNAME, Boolean.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FwdHoEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileFwdHoEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileFwdHoEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatUtranReselectionModeEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileIsInterRatUtranReselectionModeEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileIsInterRatUtranReselectionModeEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsInterRatUtranCoverageBasedRedirectionModeEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileIsInterRatUtranCoverageBasedRedirectionModeEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileIsInterRatUtranCoverageBasedRedirectionModeEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQosBasedMeasurementEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileIsQosBasedMeasurementEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileIsQosBasedMeasurementEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbMobilityProfile.class)
    public JAXBElement<CategoriesLte> createEnbMobilityProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbMobilityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbCdma2kEnabled", scope = EnbMobilityProfile.class)
    public JAXBElement<EnabledStates> createEnbMobilityProfileCsfbCdma2KEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbMobilityProfileCsfbCdma2KEnabled_QNAME, EnabledStates.class, EnbMobilityProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VlanPcp", scope = LteUlPktDataPriorityEntryWs.class)
    public JAXBElement<Integer> createLteUlPktDataPriorityEntryWsVlanPcp(Integer value) {
        return new JAXBElement<Integer>(_LteUlPktDataPriorityEntryWsVlanPcp_QNAME, Integer.class, LteUlPktDataPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsLowRsrpTh", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsMbmsLowRsrpTh(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsMbmsLowRsrpTh_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsLowRsrpThIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsMbmsLowRsrpThIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsMbmsLowRsrpThIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfnOffsetIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsSfnOffsetIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsSfnOffsetIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McchUpdateTimeOffset512IsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsMcchUpdateTimeOffset512IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsMcchUpdateTimeOffset512IsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsHighRsrpTh", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsMbmsHighRsrpTh(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsMbmsHighRsrpTh_QNAME, Integer.class, EmbmsWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McchUpdateTimeOffset1024IsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsMcchUpdateTimeOffset1024IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsMcchUpdateTimeOffset1024IsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsScheduleDelay", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsMbmsScheduleDelay(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsMbmsScheduleDelay_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeStampOffset", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsTimeStampOffset(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsTimeStampOffset_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McchUpdateTimeOffset1024", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsMcchUpdateTimeOffset1024(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsMcchUpdateTimeOffset1024_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsHighRsrpThIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsMbmsHighRsrpThIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsMbmsHighRsrpThIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeStampOffsetIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsTimeStampOffsetIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsTimeStampOffsetIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2KeepAlivePeriod", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsM2KeepAlivePeriod(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsM2KeepAlivePeriod_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfnOffset", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsSfnOffset(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsSfnOffset_QNAME, Integer.class, EmbmsWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SynchronizationPeriod", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsSynchronizationPeriod(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsSynchronizationPeriod_QNAME, Integer.class, EmbmsWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2KeepAlivePeriodIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsM2KeepAlivePeriodIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsM2KeepAlivePeriodIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McchUpdateTimeOffset512", scope = EmbmsWs.class)
    public JAXBElement<Integer> createEmbmsWsMcchUpdateTimeOffset512(Integer value) {
        return new JAXBElement<Integer>(_EmbmsWsMcchUpdateTimeOffset512_QNAME, Integer.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MbmsScheduleDelayIsDefault", scope = EmbmsWs.class)
    public JAXBElement<Boolean> createEmbmsWsMbmsScheduleDelayIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmbmsWsMbmsScheduleDelayIsDefault_QNAME, Boolean.class, EmbmsWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N311IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsN311IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsN311IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NbIsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsNbIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsNbIsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T301", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT301(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT301_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T304", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT304(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT304_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T301IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT301IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT301IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T304IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT304IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT304IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T320", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT320(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT320_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T300IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT300IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT300IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T300", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT300(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT300_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T310IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT310IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT310IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T320IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT320IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT320IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T310", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT310(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT310_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T311", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsT311(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsT311_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N310IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsN310IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsN310IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "T311IsDefault", scope = CellRrcTimersWs.class)
    public JAXBElement<Boolean> createCellRrcTimersWsT311IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_CellRrcTimersWsT311IsDefault_QNAME, Boolean.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N311", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsN311(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsN311_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "N310", scope = CellRrcTimersWs.class)
    public JAXBElement<String> createCellRrcTimersWsN310(String value) {
        return new JAXBElement<String>(_CellRrcTimersWsN310_QNAME, String.class, CellRrcTimersWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RrcNb }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Nb", scope = CellRrcTimersWs.class)
    public JAXBElement<RrcNb> createCellRrcTimersWsNb(RrcNb value) {
        return new JAXBElement<RrcNb>(_CellRrcTimersWsNb_QNAME, RrcNb.class, CellRrcTimersWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass14Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass14Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass14Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass15Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass15Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellID", scope = LteCellGetWs.class)
    public JAXBElement<String> createLteCellGetWsCellID(String value) {
        return new JAXBElement<String>(_LteCellSetWsCellID_QNAME, String.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsSignalingAccessClass12Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsSignalingAccessClass12Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsSignalingAccessClass12Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass11Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass11Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass11Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachFreqOffset", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPrachFreqOffset(Integer value) {
        return new JAXBElement<Integer>(_LteCellSetWsPrachFreqOffset_QNAME, Integer.class, LteCellGetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellIdentity28Bit", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsCellIdentity28Bit(Integer value) {
        return new JAXBElement<Integer>(_LteCellGetWsCellIdentity28Bit_QNAME, Integer.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass13Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass13Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass13Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalCellId", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalCellId(Integer value) {
        return new JAXBElement<Integer>(_LteCellGetWsPhysicalCellId_QNAME, Integer.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsDataAccessClass15Barred", scope = LteCellGetWs.class)
    public JAXBElement<Boolean> createLteCellGetWsIsDataAccessClass15Barred(Boolean value) {
        return new JAXBElement<Boolean>(_LteCellSetWsIsDataAccessClass15Barred_QNAME, Boolean.class, LteCellGetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerIdentity", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalLayerIdentity(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerIdentity_QNAME, Integer.class, LteCellGetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PhysicalLayerCellGroup", scope = LteCellGetWs.class)
    public JAXBElement<Integer> createLteCellGetWsPhysicalLayerCellGroup(Integer value) {
        return new JAXBElement<Integer>(_Enb3RdPartyPhysicalLayerCellGroup_QNAME, Integer.class, LteCellGetWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpHardwareTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hardware", scope = PnpDetailWs.class)
    public JAXBElement<PnpHardwareTypes> createPnpDetailWsHardware(PnpHardwareTypes value) {
        return new JAXBElement<PnpHardwareTypes>(_PnpDetailWsHardware_QNAME, PnpHardwareTypes.class, PnpDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLatitude", scope = PnpDetailWs.class)
    public JAXBElement<BigDecimal> createPnpDetailWsPnpLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLatitude_QNAME, BigDecimal.class, PnpDetailWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnpLongitude", scope = PnpDetailWs.class)
    public JAXBElement<BigDecimal> createPnpDetailWsPnpLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PnpDetailWsPnpLongitude_QNAME, BigDecimal.class, PnpDetailWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SctpHBeatIntervalIsDefault", scope = NetworkingWs.class)
    public JAXBElement<Boolean> createNetworkingWsSctpHBeatIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_NetworkingWsSctpHBeatIntervalIsDefault_QNAME, Boolean.class, NetworkingWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Mtu", scope = NetworkingWs.class)
    public JAXBElement<Integer> createNetworkingWsMtu(Integer value) {
        return new JAXBElement<Integer>(_NetworkingWsMtu_QNAME, Integer.class, NetworkingWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighQr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXHighQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqThreshXHighQr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqPMax_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowQr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXLowQr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqThreshXLowQr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<String> createMobilityIdleModeInterFreqCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterFreqCellReselectionPriority_QNAME, String.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLowP", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXLowP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqThreshXLowP_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqQQualMinr9_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterFreqIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterFreqIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeInterFreqIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterFreqIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqTReselectionEutra_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHighP", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqThreshXHighP(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqThreshXHighP_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevelMin", scope = MobilityIdleModeInterFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeInterFreqQRxLevelMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqQRxLevelMin_QNAME, Integer.class, MobilityIdleModeInterFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaForceVolteTdIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsDlaForceVolteTdIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsDlaForceVolteTdIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RohcRatio", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsRohcRatio(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsRohcRatio_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnableVolteFixedAllocations", scope = VolteConfigurationWs.class)
    public JAXBElement<EnabledDisabledValues> createVolteConfigurationWsEnableVolteFixedAllocations(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_VolteConfigurationWsEnableVolteFixedAllocations_QNAME, EnabledDisabledValues.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowDlDcchDtchIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsAllowDlDcchDtchIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsAllowDlDcchDtchIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxVolteUesPerUlTti", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsMaxVolteUesPerUlTti(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsMaxVolteUesPerUlTti_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowDlDcchDtch", scope = VolteConfigurationWs.class)
    public JAXBElement<EnabledDisabledValues> createVolteConfigurationWsAllowDlDcchDtch(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_VolteConfigurationWsAllowDlDcchDtch_QNAME, EnabledDisabledValues.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberofVoltePacketsIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsNumberofVoltePacketsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsNumberofVoltePacketsIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LowUlBlerForVolte", scope = VolteConfigurationWs.class)
    public JAXBElement<EnabledDisabledValues> createVolteConfigurationWsLowUlBlerForVolte(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_VolteConfigurationWsLowUlBlerForVolte_QNAME, EnabledDisabledValues.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxVolteUesPerUlTtiIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsMaxVolteUesPerUlTtiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsMaxVolteUesPerUlTtiIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EnableVolteFixedAllocationsIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsEnableVolteFixedAllocationsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsEnableVolteFixedAllocationsIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxVolteUesPerDlTtiIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsMaxVolteUesPerDlTtiIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsMaxVolteUesPerDlTtiIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberofVoltePackets", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsNumberofVoltePackets(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsNumberofVoltePackets_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LowUlBlerForVolteIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsLowUlBlerForVolteIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsLowUlBlerForVolteIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VolteHeaderOverhead", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsVolteHeaderOverhead(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsVolteHeaderOverhead_QNAME, Integer.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "VolteHeaderOverheadIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsVolteHeaderOverheadIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsVolteHeaderOverheadIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlaForceVolteTd", scope = VolteConfigurationWs.class)
    public JAXBElement<EnabledDisabledValues> createVolteConfigurationWsDlaForceVolteTd(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_VolteConfigurationWsDlaForceVolteTd_QNAME, EnabledDisabledValues.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxVolteUesPerDlTti", scope = VolteConfigurationWs.class)
    public JAXBElement<Integer> createVolteConfigurationWsMaxVolteUesPerDlTti(Integer value) {
        return new JAXBElement<Integer>(_VolteConfigurationWsMaxVolteUesPerDlTti_QNAME, Integer.class, VolteConfigurationWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RohcRatioIsDefault", scope = VolteConfigurationWs.class)
    public JAXBElement<Boolean> createVolteConfigurationWsRohcRatioIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_VolteConfigurationWsRohcRatioIsDefault_QNAME, Boolean.class, VolteConfigurationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecEncryption", scope = IPSecConfigWS.class)
    public JAXBElement<String> createIPSecConfigWSIpsecEncryption(String value) {
        return new JAXBElement<String>(_IPSecConfigWSIpsecEncryption_QNAME, String.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecSaLifetime", scope = IPSecConfigWS.class)
    public JAXBElement<Integer> createIPSecConfigWSIpsecSaLifetime(Integer value) {
        return new JAXBElement<Integer>(_IPSecConfigWSIpsecSaLifetime_QNAME, Integer.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdDelay", scope = IPSecConfigWS.class)
    public JAXBElement<Integer> createIPSecConfigWSDpdDelay(Integer value) {
        return new JAXBElement<Integer>(_IPSecConfigWSDpdDelay_QNAME, Integer.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecEncryptionIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSIpsecEncryptionIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSIpsecEncryptionIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpdActions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdAction", scope = IPSecConfigWS.class)
    public JAXBElement<DpdActions> createIPSecConfigWSDpdAction(DpdActions value) {
        return new JAXBElement<DpdActions>(_IPSecConfigWSDpdAction_QNAME, DpdActions.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarginTime", scope = IPSecConfigWS.class)
    public JAXBElement<Integer> createIPSecConfigWSMarginTime(Integer value) {
        return new JAXBElement<Integer>(_IPSecConfigWSMarginTime_QNAME, Integer.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdRetriesIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSDpdRetriesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSDpdRetriesIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IkeSaLifetimeIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSIkeSaLifetimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSIkeSaLifetimeIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IkeSaLifetime", scope = IPSecConfigWS.class)
    public JAXBElement<Integer> createIPSecConfigWSIkeSaLifetime(Integer value) {
        return new JAXBElement<Integer>(_IPSecConfigWSIkeSaLifetime_QNAME, Integer.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdActionIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSDpdActionIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSDpdActionIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiffieHellmanGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiffieHellmanGroup", scope = IPSecConfigWS.class)
    public JAXBElement<DiffieHellmanGroups> createIPSecConfigWSDiffieHellmanGroup(DiffieHellmanGroups value) {
        return new JAXBElement<DiffieHellmanGroups>(_IPSecConfigWSDiffieHellmanGroup_QNAME, DiffieHellmanGroups.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MarginTimeIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSMarginTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSMarginTimeIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiffieHellmanGroupIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSDiffieHellmanGroupIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSDiffieHellmanGroupIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdRetries", scope = IPSecConfigWS.class)
    public JAXBElement<Integer> createIPSecConfigWSDpdRetries(Integer value) {
        return new JAXBElement<Integer>(_IPSecConfigWSDpdRetries_QNAME, Integer.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpsecSaLifetimeIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSIpsecSaLifetimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSIpsecSaLifetimeIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DpdDelayIsDefault", scope = IPSecConfigWS.class)
    public JAXBElement<Boolean> createIPSecConfigWSDpdDelayIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_IPSecConfigWSDpdDelayIsDefault_QNAME, Boolean.class, IPSecConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI2IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI2IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI6", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI6(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI6_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI5", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI5(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI5_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI4", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI4(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI4_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI3", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI3(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI3_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI9IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI9IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI9IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI2", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI2(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI2_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI4IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI4IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI1", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI1(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI1_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HighestArpIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsHighestArpIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsHighestArpIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI5IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI5IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionVulnerabilityIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsPreemptionVulnerabilityIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsPreemptionVulnerabilityIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI8IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI8IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI3IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI3IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI7IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI7IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionVulnerability", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsPreemptionVulnerability(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsPreemptionVulnerability_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI6IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI6IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcConnectedTimeIsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsRrcConnectedTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsRrcConnectedTimeIsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreemptionCapability", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsPreemptionCapability(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsPreemptionCapability_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI1IsDefault", scope = EmergencyCallWs.class)
    public JAXBElement<Boolean> createEmergencyCallWsQCI1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EmergencyCallWsQCI1IsDefault_QNAME, Boolean.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcConnectedTime", scope = EmergencyCallWs.class)
    public JAXBElement<Integer> createEmergencyCallWsRrcConnectedTime(Integer value) {
        return new JAXBElement<Integer>(_EmergencyCallWsRrcConnectedTime_QNAME, Integer.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI7", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI7(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI7_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI8", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI8(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI8_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QCI9", scope = EmergencyCallWs.class)
    public JAXBElement<EnabledDisabledValues> createEmergencyCallWsQCI9(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EmergencyCallWsQCI9_QNAME, EnabledDisabledValues.class, EmergencyCallWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HandoverType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverType", scope = EnbNeighbour.class)
    public JAXBElement<HandoverType> createEnbNeighbourHandoverType(HandoverType value) {
        return new JAXBElement<HandoverType>(_LteAddNeighbourWsHandoverType_QNAME, HandoverType.class, EnbNeighbour.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2ControlState", scope = EnbNeighbour.class)
    public JAXBElement<X2ControlStateTypes> createEnbNeighbourX2ControlState(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_LteAddNeighbourWsX2ControlState_QNAME, X2ControlStateTypes.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourCellNumber", scope = EnbNeighbour.class)
    public JAXBElement<Integer> createEnbNeighbourNeighbourCellNumber(Integer value) {
        return new JAXBElement<Integer>(_EnbNeighbourNeighbourCellNumber_QNAME, Integer.class, EnbNeighbour.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Arfcn", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<Integer> createMobilityGeranReselectionPriorityEntryWsArfcn(Integer value) {
        return new JAXBElement<Integer>(_MobilityUtranReselectionPriorityEntryWsArfcn_QNAME, Integer.class, MobilityGeranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Priority", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<String> createMobilityGeranReselectionPriorityEntryWsPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterFreqReselectionPriorityEntryWsPriority_QNAME, String.class, MobilityGeranReselectionPriorityEntryWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bands }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = MobilityGeranReselectionPriorityEntryWs.class)
    public JAXBElement<Bands> createMobilityGeranReselectionPriorityEntryWsBand(Bands value) {
        return new JAXBElement<Bands>(_MobilityGeranReselectionPriorityEntryWsBand_QNAME, Bands.class, MobilityGeranReselectionPriorityEntryWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityProfileOptionalOrMandatory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecurityForCiphering", scope = EnbSecurityProfile.class)
    public JAXBElement<SecurityProfileOptionalOrMandatory> createEnbSecurityProfileSecurityForCiphering(SecurityProfileOptionalOrMandatory value) {
        return new JAXBElement<SecurityProfileOptionalOrMandatory>(_EnbSecurityProfileSecurityForCiphering_QNAME, SecurityProfileOptionalOrMandatory.class, EnbSecurityProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SshEnabled", scope = EnbSecurityProfile.class)
    public JAXBElement<Boolean> createEnbSecurityProfileSshEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSecurityProfileSshEnabled_QNAME, Boolean.class, EnbSecurityProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpSecEnabled", scope = EnbSecurityProfile.class)
    public JAXBElement<Boolean> createEnbSecurityProfileIpSecEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbSecurityProfileIpSecEnabled_QNAME, Boolean.class, EnbSecurityProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snow3GIntegrityLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileSnow3GIntegrityLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileSnow3GIntegrityLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSecurityProfile.class)
    public JAXBElement<CategoriesLte> createEnbSecurityProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSecurityProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Snow3GCipheringLevel", scope = EnbSecurityProfile.class)
    public JAXBElement<Integer> createEnbSecurityProfileSnow3GCipheringLevel(Integer value) {
        return new JAXBElement<Integer>(_EnbSecurityProfileSnow3GCipheringLevel_QNAME, Integer.class, EnbSecurityProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<String> createMobilityConnectedModeStopGapsTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeStopGapsTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<Integer> createMobilityConnectedModeStopGapsRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopGapEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<StopGapEventTypes> createMobilityConnectedModeStopGapsEventType(StopGapEventTypes value) {
        return new JAXBElement<StopGapEventTypes>(_MobilityConnectedModeTriggerGapsEventType_QNAME, StopGapEventTypes.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeStopGaps.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeStopGapsHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeTriggerGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeStopGaps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EsonConnectionRetryTimer", scope = EsonWs.class)
    public JAXBElement<Integer> createEsonWsEsonConnectionRetryTimer(Integer value) {
        return new JAXBElement<Integer>(_EsonWsEsonConnectionRetryTimer_QNAME, Integer.class, EsonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionLostMaxRetriesIsDefault", scope = EsonWs.class)
    public JAXBElement<Boolean> createEsonWsConnectionLostMaxRetriesIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonWsConnectionLostMaxRetriesIsDefault_QNAME, Boolean.class, EsonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EsonConnectionRetryTimerIsDefault", scope = EsonWs.class)
    public JAXBElement<Boolean> createEsonWsEsonConnectionRetryTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonWsEsonConnectionRetryTimerIsDefault_QNAME, Boolean.class, EsonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectionLostMaxRetries", scope = EsonWs.class)
    public JAXBElement<Integer> createEsonWsConnectionLostMaxRetries(Integer value) {
        return new JAXBElement<Integer>(_EsonWsConnectionLostMaxRetries_QNAME, Integer.class, EsonWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MessagePowerOffsetGroupB", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsMessagePowerOffsetGroupB(String value) {
        return new JAXBElement<String>(_RandomAccessWsMessagePowerOffsetGroupB_QNAME, String.class, RandomAccessWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleInitialReceivedTargetPower", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsPreambleInitialReceivedTargetPower(String value) {
        return new JAXBElement<String>(_RandomAccessWsPreambleInitialReceivedTargetPower_QNAME, String.class, RandomAccessWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleTransMax", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsPreambleTransMax(String value) {
        return new JAXBElement<String>(_RandomAccessWsPreambleTransMax_QNAME, String.class, RandomAccessWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MessageSizeGroupAIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsMessageSizeGroupAIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsMessageSizeGroupAIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PreambleTransMaxIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPreambleTransMaxIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPreambleTransMaxIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SizeOfRaPreamblesGroupAIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsSizeOfRaPreamblesGroupAIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsSizeOfRaPreamblesGroupAIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrachConfigIndexIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsPrachConfigIndexIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsPrachConfigIndexIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MessageSizeGroupA", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsMessageSizeGroupA(String value) {
        return new JAXBElement<String>(_RandomAccessWsMessageSizeGroupA_QNAME, String.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MessagePowerOffsetGroupBIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsMessagePowerOffsetGroupBIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsMessagePowerOffsetGroupBIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SizeOfRaPreamblesGroupA", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsSizeOfRaPreamblesGroupA(String value) {
        return new JAXBElement<String>(_RandomAccessWsSizeOfRaPreamblesGroupA_QNAME, String.class, RandomAccessWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfRaPreambles", scope = RandomAccessWs.class)
    public JAXBElement<String> createRandomAccessWsNumberOfRaPreambles(String value) {
        return new JAXBElement<String>(_RandomAccessWsNumberOfRaPreambles_QNAME, String.class, RandomAccessWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MacContentionResolutionTimerIsDefault", scope = RandomAccessWs.class)
    public JAXBElement<Boolean> createRandomAccessWsMacContentionResolutionTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_RandomAccessWsMacContentionResolutionTimerIsDefault_QNAME, Boolean.class, RandomAccessWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeThroughputReportInterval", scope = EsonMcimWs.class)
    public JAXBElement<Integer> createEsonMcimWsUeThroughputReportInterval(Integer value) {
        return new JAXBElement<Integer>(_EsonMcimWsUeThroughputReportInterval_QNAME, Integer.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeThroughputReportIntervalIsDefault", scope = EsonMcimWs.class)
    public JAXBElement<Boolean> createEsonMcimWsUeThroughputReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMcimWsUeThroughputReportIntervalIsDefault_QNAME, Boolean.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiMinMcs", scope = EsonMcimWs.class)
    public JAXBElement<Integer> createEsonMcimWsAperiodicCqiMinMcs(Integer value) {
        return new JAXBElement<Integer>(_EsonMcimWsAperiodicCqiMinMcs_QNAME, Integer.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiGuardTimer", scope = EsonMcimWs.class)
    public JAXBElement<Integer> createEsonMcimWsAperiodicCqiGuardTimer(Integer value) {
        return new JAXBElement<Integer>(_EsonMcimWsAperiodicCqiGuardTimer_QNAME, Integer.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiMinMcsIsDefault", scope = EsonMcimWs.class)
    public JAXBElement<Boolean> createEsonMcimWsAperiodicCqiMinMcsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMcimWsAperiodicCqiMinMcsIsDefault_QNAME, Boolean.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AperiodicCqiGuardTimerIsDefault", scope = EsonMcimWs.class)
    public JAXBElement<Boolean> createEsonMcimWsAperiodicCqiGuardTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMcimWsAperiodicCqiGuardTimerIsDefault_QNAME, Boolean.class, EsonMcimWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<String> createMobilityInterRatUtranCoverageRedirectionTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME, String.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityInterRatUtranCoverageRedirectionTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranCoverageRedirectionRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageBasedRedirectionEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<CoverageBasedRedirectionEventTypes> createMobilityInterRatUtranCoverageRedirectionEventType(CoverageBasedRedirectionEventTypes value) {
        return new JAXBElement<CoverageBasedRedirectionEventTypes>(_MobilityConnectedModeTriggerGapsEventType_QNAME, CoverageBasedRedirectionEventTypes.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityInterRatUtranCoverageRedirection.class)
    public JAXBElement<BigDecimal> createMobilityInterRatUtranCoverageRedirectionHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeTriggerGapsHysteresis_QNAME, BigDecimal.class, MobilityInterRatUtranCoverageRedirection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateMessageType", scope = Cmpv2ConfigWS.class)
    public JAXBElement<MessageTypes> createCmpv2ConfigWSUpdateMessageType(MessageTypes value) {
        return new JAXBElement<MessageTypes>(_Cmpv2ConfigWSUpdateMessageType_QNAME, MessageTypes.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateRetryTimerIsDefault", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Boolean> createCmpv2ConfigWSUpdateRetryTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Cmpv2ConfigWSUpdateRetryTimerIsDefault_QNAME, Boolean.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateRetryTimer", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Integer> createCmpv2ConfigWSUpdateRetryTimer(Integer value) {
        return new JAXBElement<Integer>(_Cmpv2ConfigWSUpdateRetryTimer_QNAME, Integer.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UpdateMessageTypeIsDefault", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Boolean> createCmpv2ConfigWSUpdateMessageTypeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Cmpv2ConfigWSUpdateMessageTypeIsDefault_QNAME, Boolean.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CertificateUpdateTimeIsDefault", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Boolean> createCmpv2ConfigWSCertificateUpdateTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Cmpv2ConfigWSCertificateUpdateTimeIsDefault_QNAME, Boolean.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtectionAlgorithmTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PkiMsgProtAlgorithmType", scope = Cmpv2ConfigWS.class)
    public JAXBElement<ProtectionAlgorithmTypes> createCmpv2ConfigWSPkiMsgProtAlgorithmType(ProtectionAlgorithmTypes value) {
        return new JAXBElement<ProtectionAlgorithmTypes>(_Cmpv2ConfigWSPkiMsgProtAlgorithmType_QNAME, ProtectionAlgorithmTypes.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PkiMsgProtAlgorithmTypeIsDefault", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Boolean> createCmpv2ConfigWSPkiMsgProtAlgorithmTypeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Cmpv2ConfigWSPkiMsgProtAlgorithmTypeIsDefault_QNAME, Boolean.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CertificateUpdateTime", scope = Cmpv2ConfigWS.class)
    public JAXBElement<Integer> createCmpv2ConfigWSCertificateUpdateTime(Integer value) {
        return new JAXBElement<Integer>(_Cmpv2ConfigWSCertificateUpdateTime_QNAME, Integer.class, Cmpv2ConfigWS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigurationProvisioning", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsConfigurationProvisioning(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsConfigurationProvisioning_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RestartAirsonAlgorithmsIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithmsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithmsIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryUpdateIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsInventoryUpdateIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsInventoryUpdateIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpAutoConfigDhcpIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsIpAutoConfigDhcpIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsIpAutoConfigDhcpIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1Establishment", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsS1Establishment(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsS1Establishment_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConfigurationProvisioningIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsConfigurationProvisioningIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsConfigurationProvisioningIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryUpdate", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsInventoryUpdate(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsInventoryUpdate_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ValidateSiteIdentification", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsValidateSiteIdentification(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsValidateSiteIdentification_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RestartAirsonAlgorithms", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithms(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsRestartAirsonAlgorithms_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ValidateSiteIdentificationIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsValidateSiteIdentificationIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsValidateSiteIdentificationIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BuiltInSelfTestIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsBuiltInSelfTestIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsBuiltInSelfTestIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SoftwareDownload", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsSoftwareDownload(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsSoftwareDownload_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1EstablishmentIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsS1EstablishmentIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsS1EstablishmentIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpAutoConfigDhcp", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsIpAutoConfigDhcp(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsIpAutoConfigDhcp_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BuiltInSelfTest", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<EnabledDisabledValues> createPlugAndPlayWarmRebootMaskWsBuiltInSelfTest(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_PlugAndPlayWarmRebootMaskWsBuiltInSelfTest_QNAME, EnabledDisabledValues.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SoftwareDownloadIsDefault", scope = PlugAndPlayWarmRebootMaskWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWarmRebootMaskWsSoftwareDownloadIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWarmRebootMaskWsSoftwareDownloadIsDefault_QNAME, Boolean.class, PlugAndPlayWarmRebootMaskWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrbLoadWeight", scope = EsonMlbWs.class)
    public JAXBElement<Integer> createEsonMlbWsPrbLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_EsonMlbWsPrbLoadWeight_QNAME, Integer.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrbLoadWeightIsDefault", scope = EsonMlbWs.class)
    public JAXBElement<Boolean> createEsonMlbWsPrbLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMlbWsPrbLoadWeightIsDefault_QNAME, Boolean.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadWeight", scope = EsonMlbWs.class)
    public JAXBElement<Integer> createEsonMlbWsRrcLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_EsonMlbWsRrcLoadWeight_QNAME, Integer.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacitySampleInterval", scope = EsonMlbWs.class)
    public JAXBElement<Integer> createEsonMlbWsCapacitySampleInterval(Integer value) {
        return new JAXBElement<Integer>(_EsonMlbWsCapacitySampleInterval_QNAME, Integer.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityReportInterval", scope = EsonMlbWs.class)
    public JAXBElement<Integer> createEsonMlbWsCapacityReportInterval(Integer value) {
        return new JAXBElement<Integer>(_EsonMlbWsCapacityReportInterval_QNAME, Integer.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcLoadWeightIsDefault", scope = EsonMlbWs.class)
    public JAXBElement<Boolean> createEsonMlbWsRrcLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMlbWsRrcLoadWeightIsDefault_QNAME, Boolean.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacityReportIntervalIsDefault", scope = EsonMlbWs.class)
    public JAXBElement<Boolean> createEsonMlbWsCapacityReportIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMlbWsCapacityReportIntervalIsDefault_QNAME, Boolean.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CapacitySampleIntervalIsDefault", scope = EsonMlbWs.class)
    public JAXBElement<Boolean> createEsonMlbWsCapacitySampleIntervalIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMlbWsCapacitySampleIntervalIsDefault_QNAME, Boolean.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadWeightIsDefault", scope = EsonMlbWs.class)
    public JAXBElement<Boolean> createEsonMlbWsCpuLoadWeightIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EsonMlbWsCpuLoadWeightIsDefault_QNAME, Boolean.class, EsonMlbWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CpuLoadWeight", scope = EsonMlbWs.class)
    public JAXBElement<Integer> createEsonMlbWsCpuLoadWeight(Integer value) {
        return new JAXBElement<Integer>(_EsonMlbWsCpuLoadWeight_QNAME, Integer.class, EsonMlbWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrSegments", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrSegments(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrSegments_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UplinkFreq", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileUplinkFreq(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileUplinkFreq_QNAME, Integer.class, EnbRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Earfcn", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileEarfcn(Integer value) {
        return new JAXBElement<Integer>(_QosEarfcnEarfcn_QNAME, Integer.class, EnbRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DownlinkFreq", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileDownlinkFreq(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileDownlinkFreq_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RfProfileDuplexModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DuplexMode", scope = EnbRadioProfile.class)
    public JAXBElement<RfProfileDuplexModes> createEnbRadioProfileDuplexMode(RfProfileDuplexModes value) {
        return new JAXBElement<RfProfileDuplexModes>(_MobilityUtranReselectionPriorityEntryWsDuplexMode_QNAME, RfProfileDuplexModes.class, EnbRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbRadioProfile.class)
    public JAXBElement<CategoriesLte> createEnbRadioProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Band", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileBand(Integer value) {
        return new JAXBElement<Integer>(_MobilityGeranReselectionPriorityEntryWsBand_QNAME, Integer.class, EnbRadioProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrIndex", scope = EnbRadioProfile.class)
    public JAXBElement<Integer> createEnbRadioProfileSfrIndex(Integer value) {
        return new JAXBElement<Integer>(_EnbRadioProfileSfrIndex_QNAME, Integer.class, EnbRadioProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SfrEnabled", scope = EnbRadioProfile.class)
    public JAXBElement<Boolean> createEnbRadioProfileSfrEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbRadioProfileSfrEnabled_QNAME, Boolean.class, EnbRadioProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci7Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci7Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci7Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectedModeEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventType", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<ConnectedModeEventTypes> createMobilityConnectedModeQosFreqEventType(ConnectedModeEventTypes value) {
        return new JAXBElement<ConnectedModeEventTypes>(_MobilityConnectedModeTriggerGapsEventType_QNAME, ConnectedModeEventTypes.class, MobilityConnectedModeQosFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Hysteresis", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeQosFreqHysteresis(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeTriggerGapsHysteresis_QNAME, BigDecimal.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TimeToTrigger", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<String> createMobilityConnectedModeQosFreqTimeToTrigger(String value) {
        return new JAXBElement<String>(_MobilityConnectedModeTriggerGapsTimeToTrigger_QNAME, String.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci1Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci1Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci1Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci6Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci6Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci6Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold2", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeQosFreqRsrpEventThreshold2(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeFreqRsrpEventThreshold2_QNAME, Integer.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci6", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci6(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci6_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "A3Offset", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<BigDecimal> createMobilityConnectedModeQosFreqA3Offset(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MobilityConnectedModeFreqA3Offset_QNAME, BigDecimal.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerQuantityTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TriggerQuantity", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<TriggerQuantityTypes> createMobilityConnectedModeQosFreqTriggerQuantity(TriggerQuantityTypes value) {
        return new JAXBElement<TriggerQuantityTypes>(_MobilityConnectedModeTriggerGapsTriggerQuantity_QNAME, TriggerQuantityTypes.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci4", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci4(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci4_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RsrpEventThreshold1", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Integer> createMobilityConnectedModeQosFreqRsrpEventThreshold1(Integer value) {
        return new JAXBElement<Integer>(_MobilityConnectedModeTriggerGapsRsrpEventThreshold1_QNAME, Integer.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci9Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci9Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci9Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HandoverTriggerPerQci3Included", scope = MobilityConnectedModeQosFreq.class)
    public JAXBElement<Boolean> createMobilityConnectedModeQosFreqHandoverTriggerPerQci3Included(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityConnectedModeQosFreqHandoverTriggerPerQci3Included_QNAME, Boolean.class, MobilityConnectedModeQosFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileTypeValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PtpProfileType", scope = EnbSyncProfile.class)
    public JAXBElement<ProfileTypeValues> createEnbSyncProfilePtpProfileType(ProfileTypeValues value) {
        return new JAXBElement<ProfileTypeValues>(_EnbSyncProfilePtpProfileType_QNAME, ProfileTypeValues.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AnnounceRateInMsgPerSec", scope = EnbSyncProfile.class)
    public JAXBElement<String> createEnbSyncProfileAnnounceRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileAnnounceRateInMsgPerSec_QNAME, String.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SecondaryMasterDomain", scope = EnbSyncProfile.class)
    public JAXBElement<Integer> createEnbSyncProfileSecondaryMasterDomain(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfileSecondaryMasterDomain_QNAME, Integer.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryMasterDomain", scope = EnbSyncProfile.class)
    public JAXBElement<Integer> createEnbSyncProfilePrimaryMasterDomain(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfilePrimaryMasterDomain_QNAME, Integer.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClockSources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PrimaryClockSource", scope = EnbSyncProfile.class)
    public JAXBElement<ClockSources> createEnbSyncProfilePrimaryClockSource(ClockSources value) {
        return new JAXBElement<ClockSources>(_EnbSyncProfilePrimaryClockSource_QNAME, ClockSources.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GnssMode", scope = EnbSyncProfile.class)
    public JAXBElement<SyncProfileGnssModes> createEnbSyncProfileGnssMode(SyncProfileGnssModes value) {
        return new JAXBElement<SyncProfileGnssModes>(_EnbSyncProfileGnssMode_QNAME, SyncProfileGnssModes.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbSyncProfile.class)
    public JAXBElement<CategoriesLte> createEnbSyncProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncRateInMsgPerSec", scope = EnbSyncProfile.class)
    public JAXBElement<String> createEnbSyncProfileSyncRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileSyncRateInMsgPerSec_QNAME, String.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DelayRequestResponseRateInMsgPerSec", scope = EnbSyncProfile.class)
    public JAXBElement<String> createEnbSyncProfileDelayRequestResponseRateInMsgPerSec(String value) {
        return new JAXBElement<String>(_EnbSyncProfileDelayRequestResponseRateInMsgPerSec_QNAME, String.class, EnbSyncProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LeaseDurationInSec", scope = EnbSyncProfile.class)
    public JAXBElement<Integer> createEnbSyncProfileLeaseDurationInSec(Integer value) {
        return new JAXBElement<Integer>(_EnbSyncProfileLeaseDurationInSec_QNAME, Integer.class, EnbSyncProfile.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QRxLevMin", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqQRxLevMin(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionQRxLevMin_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchPr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSIntraSearchPr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSIntraSearchPr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPMaxNotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsPMaxNotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterFreqIsPMaxNotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsQQualMinr9NotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsQQualMinr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeInterFreqIsQQualMinr9NotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TReselectionEutra", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqTReselectionEutra(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqTReselectionEutra_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PMax", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqPMax(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqPMax_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchEnable", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqSIntraSearchEnable(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeIntraFreqSIntraSearchEnable_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsThreshServingLowQr9NotPresent", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Boolean> createMobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent(Boolean value) {
        return new JAXBElement<Boolean>(_MobilityIdleModeIntraFreqIsThreshServingLowQr9NotPresent_QNAME, Boolean.class, MobilityIdleModeIntraFreq.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellReselectionPriority", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<String> createMobilityIdleModeIntraFreqCellReselectionPriority(String value) {
        return new JAXBElement<String>(_MobilityIdleModeInterFreqCellReselectionPriority_QNAME, String.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QQualMinr9", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqQQualMinr9(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeInterFreqQQualMinr9_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SIntraSearchR8", scope = MobilityIdleModeIntraFreq.class)
    public JAXBElement<Integer> createMobilityIdleModeIntraFreqSIntraSearchR8(Integer value) {
        return new JAXBElement<Integer>(_MobilityIdleModeIntraFreqSIntraSearchR8_QNAME, Integer.class, MobilityIdleModeIntraFreq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM1", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForM1(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForM1_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM2InterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsM2InterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsM2InterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForM2", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForM2(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForM2_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2UInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsX2UInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsX2UInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min40MHzChannel", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsMin40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMin40MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1CInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsS1CInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsS1CInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1C", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForS1C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForS1C_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2U", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForX2U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForX2U_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max40MHzChannel", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsMax40MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMax40MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2CInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsX2CInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsX2CInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeManagementModes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagedMode", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<NodeManagementModes> createLteEnbDetailsSetWsManagedMode(NodeManagementModes value) {
        return new JAXBElement<NodeManagementModes>(_EnbDetailsGetManagedMode_QNAME, NodeManagementModes.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Min20MHzChannel", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsMin20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMin20MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsPtpSlaveInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsPtpSlaveInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsPtpSlaveInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForS1U", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForS1U(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForS1U_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsM1InterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsM1InterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsM1InterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ActiveAntenna", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsActiveAntenna(String value) {
        return new JAXBElement<String>(_EnbDetailsGetActiveAntenna_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForX2C", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForX2C(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForX2C_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ENodeBID", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsENodeBID(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetENodeBID_QNAME, Integer.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultX2ControlStateForNeighbours", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<X2ControlStateTypes> createLteEnbDetailsSetWsDefaultX2ControlStateForNeighbours(X2ControlStateTypes value) {
        return new JAXBElement<X2ControlStateTypes>(_EnbDetailsGetDefaultX2ControlStateForNeighbours_QNAME, X2ControlStateTypes.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsX2ConfigurationUpdateForNeighboursEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Boolean> createLteEnbDetailsSetWsIsX2ConfigurationUpdateForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetIsX2ConfigurationUpdateForNeighboursEnabled_QNAME, Boolean.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForPtpSlave", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForPtpSlave(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForPtpSlave_QNAME, String.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonServerInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsCSonServerInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsCSonServerInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Max20MHzChannel", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Integer> createLteEnbDetailsSetWsMax20MHzChannel(Integer value) {
        return new JAXBElement<Integer>(_EnbDetailsGetMax20MHzChannel_QNAME, Integer.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsAutoX2ControlForNeighboursEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<Boolean> createLteEnbDetailsSetWsIsAutoX2ControlForNeighboursEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_EnbDetailsGetIsAutoX2ControlForNeighboursEnabled_QNAME, Boolean.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsS1UInterfaceEnabled", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<EnabledStates> createLteEnbDetailsSetWsIsS1UInterfaceEnabled(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_EnbDetailsGetIsS1UInterfaceEnabled_QNAME, EnabledStates.class, LteEnbDetailsSetWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterfaceToUseForCSonServer", scope = LteEnbDetailsSetWs.class)
    public JAXBElement<String> createLteEnbDetailsSetWsInterfaceToUseForCSonServer(String value) {
        return new JAXBElement<String>(_EnbDetailsGetInterfaceToUseForCSonServer_QNAME, String.class, LteEnbDetailsSetWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S7Periodicity", scope = Sib1Ws.class)
    public JAXBElement<String> createSib1WsS7Periodicity(String value) {
        return new JAXBElement<String>(_Sib1WsS7Periodicity_QNAME, String.class, Sib1Ws.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QrxLevMinIsDefault", scope = Sib1Ws.class)
    public JAXBElement<Boolean> createSib1WsQrxLevMinIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_Sib1WsQrxLevMinIsDefault_QNAME, Boolean.class, Sib1Ws.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXLow", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXLow(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXLow_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXQr9High", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXQr9High(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatUtranReselectionThreshXQr9High_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ThreshXHigh", scope = MobilityInterRatUtranReselection.class)
    public JAXBElement<Integer> createMobilityInterRatUtranReselectionThreshXHigh(Integer value) {
        return new JAXBElement<Integer>(_MobilityInterRatGeranReselectionThreshXHigh_QNAME, Integer.class, MobilityInterRatUtranReselection.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetModeAdmin", scope = PlugAndPlayWs.class)
    public JAXBElement<EnabledStates> createPlugAndPlayWsWarmResetModeAdmin(EnabledStates value) {
        return new JAXBElement<EnabledStates>(_PlugAndPlayWsWarmResetModeAdmin_QNAME, EnabledStates.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpFailWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsDhcpFailWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsDhcpFailWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsDhcpWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsDhcpWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSiteIdentificationRetry", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsMaxSiteIdentificationRetry(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsMaxSiteIdentificationRetry_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryCompleteWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsInventoryCompleteWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsInventoryCompleteWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoSwDownloadFailTimer", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsWarmResetAutoSwDownloadFailTimer(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsWarmResetAutoSwDownloadFailTimer_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceRadius", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsMaxPersistenceRadius(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsMaxPersistenceRadius_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsMaxPersistenceTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsMaxPersistenceTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdentificationWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsSiteIdentificationWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsSiteIdentificationWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSelfTestRetry", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsMaxSelfTestRetry(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsMaxSelfTestRetry_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetConfigurationFailTimer", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsWarmResetConfigurationFailTimer(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsWarmResetConfigurationFailTimer_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestFailWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsSelfTestFailWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsSelfTestFailWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoSwDownloadFailTimerIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsWarmResetAutoSwDownloadFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsWarmResetAutoSwDownloadFailTimerIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetModeAdminIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsWarmResetModeAdminIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsWarmResetModeAdminIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpFailWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsDhcpFailWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsDhcpFailWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestRetryWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsSelfTestRetryWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsSelfTestRetryWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestRetryWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsSelfTestRetryWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsSelfTestRetryWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PnpPeristencyMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PersistencyMode", scope = PlugAndPlayWs.class)
    public JAXBElement<PnpPeristencyMode> createPlugAndPlayWsPersistencyMode(PnpPeristencyMode value) {
        return new JAXBElement<PnpPeristencyMode>(_PlugAndPlayWsPersistencyMode_QNAME, PnpPeristencyMode.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnPConfigurationTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsPnPConfigurationTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsPnPConfigurationTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsAutoSoftwareWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsAutoSoftwareWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DhcpWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsDhcpWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsDhcpWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdentificationWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsSiteIdentificationWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsSiteIdentificationWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InventoryCompleteWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsInventoryCompleteWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsInventoryCompleteWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsGpsLockWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsGpsLockWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsMaxPersistenceTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsMaxPersistenceTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxPersistenceRadiusIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsMaxPersistenceRadiusIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsMaxPersistenceRadiusIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AutoSoftwareWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsAutoSoftwareWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsAutoSoftwareWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdentificationFailWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsSiteIdentificationFailWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsSiteIdentificationFailWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDhcpRetry", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsMaxDhcpRetry(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsMaxDhcpRetry_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PnPConfigurationTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsPnPConfigurationTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsPnPConfigurationTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSiteIdentificationRetryIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsMaxSiteIdentificationRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsMaxSiteIdentificationRetryIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultConfigurationWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsDefaultConfigurationWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsDefaultConfigurationWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoInventoryFailTimerIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsWarmResetAutoInventoryFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsWarmResetAutoInventoryFailTimerIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxDhcpRetryIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsMaxDhcpRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsMaxDhcpRetryIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SelfTestFailWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsSelfTestFailWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsSelfTestFailWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GpsLockWaitTimeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsGpsLockWaitTimeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsGpsLockWaitTimeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxSelfTestRetryIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsMaxSelfTestRetryIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsMaxSelfTestRetryIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetConfigurationFailTimerIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsWarmResetConfigurationFailTimerIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsWarmResetConfigurationFailTimerIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PersistencyModeIsDefault", scope = PlugAndPlayWs.class)
    public JAXBElement<Boolean> createPlugAndPlayWsPersistencyModeIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_PlugAndPlayWsPersistencyModeIsDefault_QNAME, Boolean.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SiteIdentificationFailWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsSiteIdentificationFailWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsSiteIdentificationFailWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DefaultConfigurationWaitTime", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsDefaultConfigurationWaitTime(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsDefaultConfigurationWaitTime_QNAME, Integer.class, PlugAndPlayWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "WarmResetAutoInventoryFailTimer", scope = PlugAndPlayWs.class)
    public JAXBElement<Integer> createPlugAndPlayWsWarmResetAutoInventoryFailTimer(Integer value) {
        return new JAXBElement<Integer>(_PlugAndPlayWsWarmResetAutoInventoryFailTimer_QNAME, Integer.class, PlugAndPlayWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2MaxConnectionsIsDefault", scope = EnbNeighborManagementWs.class)
    public JAXBElement<Boolean> createEnbNeighborManagementWsX2MaxConnectionsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNeighborManagementWsX2MaxConnectionsIsDefault_QNAME, Boolean.class, EnbNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2GuardPeriod", scope = EnbNeighborManagementWs.class)
    public JAXBElement<Integer> createEnbNeighborManagementWsX2GuardPeriod(Integer value) {
        return new JAXBElement<Integer>(_EnbNeighborManagementWsX2GuardPeriod_QNAME, Integer.class, EnbNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2GuardPeriodIsDefault", scope = EnbNeighborManagementWs.class)
    public JAXBElement<Boolean> createEnbNeighborManagementWsX2GuardPeriodIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_EnbNeighborManagementWsX2GuardPeriodIsDefault_QNAME, Boolean.class, EnbNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2MaxConnections", scope = EnbNeighborManagementWs.class)
    public JAXBElement<Integer> createEnbNeighborManagementWsX2MaxConnections(Integer value) {
        return new JAXBElement<Integer>(_EnbNeighborManagementWsX2MaxConnections_QNAME, Integer.class, EnbNeighborManagementWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UEAssociatedS1Enabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileUEAssociatedS1Enabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileUEAssociatedS1Enabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EquipMeasureEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileEquipMeasureEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileEquipMeasureEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileHoEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileHoEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreamblesSentEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRachPreamblesSentEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRachPreamblesSentEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellLevelRbQoSEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileCellLevelRbQoSEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileCellLevelRbQoSEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RruEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRruEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRruEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbManagementProfile.class)
    public JAXBElement<CategoriesLte> createEnbManagementProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ERabPerQciEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileERabPerQciEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileERabPerQciEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PagingEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfilePagingEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfilePagingEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RruPerQciEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRruPerQciEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRruPerQciEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachAccessDelayEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRachAccessDelayEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRachAccessDelayEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RfMeasureEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRfMeasureEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRfMeasureEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ERabEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileERabEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileERabEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CsfbEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileCsfbEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbMobilityProfileCsfbEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRachEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRachEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RrcEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileRrcEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileRrcEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoPerTargetCellEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileHoPerTargetCellEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileHoPerTargetCellEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellLevelRbQoSPerQciEnabled", scope = EnbManagementProfile.class)
    public JAXBElement<EnabledDisabledValues> createEnbManagementProfileCellLevelRbQoSPerQciEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_EnbManagementProfileCellLevelRbQoSPerQciEnabled_QNAME, EnabledDisabledValues.class, EnbManagementProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxWiFiInactivityPeriodIsDefault", scope = WiFiAccessPointWs.class)
    public JAXBElement<Boolean> createWiFiAccessPointWsMaxWiFiInactivityPeriodIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_WiFiAccessPointWsMaxWiFiInactivityPeriodIsDefault_QNAME, Boolean.class, WiFiAccessPointWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxWiFiInactivityPeriod", scope = WiFiAccessPointWs.class)
    public JAXBElement<Integer> createWiFiAccessPointWsMaxWiFiInactivityPeriod(Integer value) {
        return new JAXBElement<Integer>(_WiFiAccessPointWsMaxWiFiInactivityPeriod_QNAME, Integer.class, WiFiAccessPointWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NeighbourCellNumber", scope = LteAddNeighbourForCellWs.class)
    public JAXBElement<Integer> createLteAddNeighbourForCellWsNeighbourCellNumber(Integer value) {
        return new JAXBElement<Integer>(_EnbNeighbourNeighbourCellNumber_QNAME, Integer.class, LteAddNeighbourForCellWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AllowHoWithoutHrl", scope = HandoverWs.class)
    public JAXBElement<EnabledDisabledValues> createHandoverWsAllowHoWithoutHrl(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_HandoverWsAllowHoWithoutHrl_QNAME, EnabledDisabledValues.class, HandoverWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RegistrationZone", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsRegistrationZone(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KSib8ParamsRegistrationZone_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Nid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsNid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsNid_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MultipleSid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsMultipleSid(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsMultipleSid_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ForeignSidReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsForeignSidReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KSib8ParamsForeignSidReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HomeReg", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<EnabledDisabledValues> createCsfbCdma2KSib8ParamsHomeReg(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_CsfbCdma2KMobilityParamsHomeReg_QNAME, EnabledDisabledValues.class, CsfbCdma2KSib8Params.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Sid", scope = CsfbCdma2KSib8Params.class)
    public JAXBElement<Integer> createCsfbCdma2KSib8ParamsSid(Integer value) {
        return new JAXBElement<Integer>(_CsfbCdma2KMobilityParamsSid_QNAME, Integer.class, CsfbCdma2KSib8Params.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit7", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit7(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit7_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfHighIsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsReselectionGeranSfHighIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsReselectionGeranSfHighIsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit8", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit8(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit8_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit8IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit8IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit8IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfHigh", scope = ReselectionToGeranWs.class)
    public JAXBElement<String> createReselectionToGeranWsReselectionGeranSfHigh(String value) {
        return new JAXBElement<String>(_ReselectionToGeranWsReselectionGeranSfHigh_QNAME, String.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit3", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit3(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit3_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit4", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit4(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit4_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GeranSpeedStateScaleFactors", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsGeranSpeedStateScaleFactors(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsGeranSpeedStateScaleFactors_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit5", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit5(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit5_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit6", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit6(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit6_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit6IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit6IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit6IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GeranSpeedStateScaleFactorsIsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsGeranSpeedStateScaleFactorsIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsGeranSpeedStateScaleFactorsIsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfMediumIsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsReselectionGeranSfMediumIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsReselectionGeranSfMediumIsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit4IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit4IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit4IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit7IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit7IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit7IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReselectionGeranSfMedium", scope = ReselectionToGeranWs.class)
    public JAXBElement<String> createReselectionToGeranWsReselectionGeranSfMedium(String value) {
        return new JAXBElement<String>(_ReselectionToGeranWsReselectionGeranSfMedium_QNAME, String.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit2IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit2IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit2IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit5IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit5IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit5IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit1IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit1IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit1IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit2", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit2(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit2_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit1", scope = ReselectionToGeranWs.class)
    public JAXBElement<EnabledDisabledValues> createReselectionToGeranWsNccPermittedBit1(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_ReselectionToGeranWsNccPermittedBit1_QNAME, EnabledDisabledValues.class, ReselectionToGeranWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NccPermittedBit3IsDefault", scope = ReselectionToGeranWs.class)
    public JAXBElement<Boolean> createReselectionToGeranWsNccPermittedBit3IsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ReselectionToGeranWsNccPermittedBit3IsDefault_QNAME, Boolean.class, ReselectionToGeranWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CSonMlbPuschLoadThresh", scope = LteSonCSonWs.class)
    public JAXBElement<Integer> createLteSonCSonWsCSonMlbPuschLoadThresh(Integer value) {
        return new JAXBElement<Integer>(_LteSonCSonWsCSonMlbPuschLoadThresh_QNAME, Integer.class, LteSonCSonWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IsCSonRachEnabled", scope = LteSonCSonWs.class)
    public JAXBElement<Boolean> createLteSonCSonWsIsCSonRachEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_LteSonCSonWsIsCSonRachEnabled_QNAME, Boolean.class, LteSonCSonWs.class, value);
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastUlSymSuppressEnabledIsDefault", scope = SynchronizationWs.class)
    public JAXBElement<Boolean> createSynchronizationWsLastUlSymSuppressEnabledIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_SynchronizationWsLastUlSymSuppressEnabledIsDefault_QNAME, Boolean.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LastUlSymSuppressEnabled", scope = SynchronizationWs.class)
    public JAXBElement<EnabledDisabledValues> createSynchronizationWsLastUlSymSuppressEnabled(EnabledDisabledValues value) {
        return new JAXBElement<EnabledDisabledValues>(_SynchronizationWsLastUlSymSuppressEnabled_QNAME, EnabledDisabledValues.class, SynchronizationWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HardwareCategory", scope = EnbAdvancedProfile.class)
    public JAXBElement<CategoriesLte> createEnbAdvancedProfileHardwareCategory(CategoriesLte value) {
        return new JAXBElement<CategoriesLte>(_EnbEmbmsProfileHardwareCategory_QNAME, CategoriesLte.class, EnbAdvancedProfile.class, value);
    }

}
