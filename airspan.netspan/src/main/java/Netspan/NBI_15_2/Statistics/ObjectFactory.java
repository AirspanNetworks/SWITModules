
package Netspan.NBI_15_2.Statistics;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Netspan.NBI_15_2.Statistics package. 
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
    private final static QName _RelayStatsRowWsRadioTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioTxPower");
    private final static QName _RelayStatsRowWsRadioPowerHeadroom_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioPowerHeadroom");
    private final static QName _RelayStatsRowWsRadioRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioRssi");
    private final static QName _RelayStatsRowWsRadioRsrp_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioRsrp");
    private final static QName _RelayStatsRowWsRadioRsrq_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioRsrq");
    private final static QName _RelayStatsRowWsRadioSinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioSinr");
    private final static QName _RelayStatsRowWsRadioSe_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioSe");
    private final static QName _RelayStatsRowWsIfInBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfInBytes");
    private final static QName _RelayStatsRowWsIfOutBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfOutBytes");
    private final static QName _RelayStatsRowWsIfInDiscard_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfInDiscard");
    private final static QName _RelayStatsRowWsIfOutDiscard_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfOutDiscard");
    private final static QName _RelayStatsRowWsIfInErrors_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfInErrors");
    private final static QName _RelayStatsRowWsIfOutErrors_QNAME = new QName("http://Airspan.Netspan.WebServices", "IfOutErrors");
    private final static QName _RelayStatsRowWsRadioEci_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioEci");
    private final static QName _RelayStatsRowWsRadioEarfcn_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioEarfcn");
    private final static QName _RelayStatsRowWsRadioTac_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioTac");
    private final static QName _RelayStatsRowWsRadioSccPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioSccPci");
    private final static QName _RelayStatsRowWsRadioPci_QNAME = new QName("http://Airspan.Netspan.WebServices", "RadioPci");
    private final static QName _RelayStatsRowWsDonorCellChangeCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "DonorCellChangeCount");
    private final static QName _RelayStatsRowWsDrm_QNAME = new QName("http://Airspan.Netspan.WebServices", "Drm");
    private final static QName _RelayStatsRowWsHeadingAngle_QNAME = new QName("http://Airspan.Netspan.WebServices", "HeadingAngle");
    private final static QName _RelayStatsRowWsRankIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "RankIndex");
    private final static QName _RelayStatsRowWsPci1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci1");
    private final static QName _RelayStatsRowWsPci2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci2");
    private final static QName _RelayStatsRowWsPci3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Pci3");
    private final static QName _RelayStatsRowWsRsrp1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp1");
    private final static QName _RelayStatsRowWsRsrp2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp2");
    private final static QName _RelayStatsRowWsRsrp3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrp3");
    private final static QName _RelayStatsRowWsRsrq1_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq1");
    private final static QName _RelayStatsRowWsRsrq2_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq2");
    private final static QName _RelayStatsRowWsRsrq3_QNAME = new QName("http://Airspan.Netspan.WebServices", "Rsrq3");
    private final static QName _StatsServerDiskRowWsGranularityPeriod_QNAME = new QName("http://Airspan.Netspan.WebServices", "GranularityPeriod");
    private final static QName _StatsServerDiskRowWsAvailableAverageGb_QNAME = new QName("http://Airspan.Netspan.WebServices", "AvailableAverageGb");
    private final static QName _StatsServerDiskRowWsDiskSizeGb_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiskSizeGb");
    private final static QName _StatsServerProcessRowWsSystemCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SystemCpuAverage");
    private final static QName _StatsServerProcessRowWsSystemMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SystemMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsEventServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventServCpuAverage");
    private final static QName _StatsServerProcessRowWsEventServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "EventServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsProvisioningServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ProvisioningServCpuAverage");
    private final static QName _StatsServerProcessRowWsProvisioningServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ProvisioningServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsDiscoveryServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiscoveryServCpuAverage");
    private final static QName _StatsServerProcessRowWsDiscoveryServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiscoveryServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsSwMngrServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwMngrServCpuAverage");
    private final static QName _StatsServerProcessRowWsSwMngrServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SwMngrServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsArchiveServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ArchiveServCpuAverage");
    private final static QName _StatsServerProcessRowWsArchiveServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ArchiveServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsStatsServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsServCpuAverage");
    private final static QName _StatsServerProcessRowWsStatsServMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "StatsServMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsManagementServCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementServCpuAverage");
    private final static QName _StatsServerProcessRowWsManagementMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "ManagementMemoryMbAverage");
    private final static QName _StatsServerProcessRowWsSqlCpuAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SqlCpuAverage");
    private final static QName _StatsServerProcessRowWsSqlMemoryMbAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "SqlMemoryMbAverage");
    private final static QName _BsIbBaseTermRfStatsRowWsDlRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlRssi");
    private final static QName _BsIbBaseTermRfStatsRowWsUlRssi_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlRssi");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinr1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinr1");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinr3_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinr3");
    private final static QName _BsIbBaseTermRfStatsRowWsUlCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCinr");
    private final static QName _BsIbBaseTermRfStatsRowWsDlZoneIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlZoneIndex");
    private final static QName _BsIbBaseTermRfStatsRowWsDlBitsPerSymbol_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlBitsPerSymbol");
    private final static QName _BsIbBaseTermRfStatsRowWsUlBitsPerSymbol_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlBitsPerSymbol");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinr_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinr");
    private final static QName _BsIbBaseTermRfStatsRowWsMsTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "MsTxPower");
    private final static QName _BsIbBaseTermRfStatsRowWsMaxUlSubChannels_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxUlSubChannels");
    private final static QName _BsIbBaseTermRfStatsRowWsUlRssiCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlRssiCh0");
    private final static QName _BsIbBaseTermRfStatsRowWsUlRssiCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlRssiCh1");
    private final static QName _BsIbBaseTermRfStatsRowWsUlCinrCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCinrCh0");
    private final static QName _BsIbBaseTermRfStatsRowWsUlCinrCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCinrCh1");
    private final static QName _BsIbBaseTermRfStatsRowWsUlCinrMimoA_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCinrMimoA");
    private final static QName _BsIbBaseTermRfStatsRowWsUlCinrMimoB_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlCinrMimoB");
    private final static QName _BsIbBaseTermRfStatsRowWsDlRssiCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlRssiCh0");
    private final static QName _BsIbBaseTermRfStatsRowWsDlRssiCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlRssiCh1");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinrCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinrCh0");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinrCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinrCh1");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinrMimoA_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinrMimoA");
    private final static QName _BsIbBaseTermRfStatsRowWsDlCinrMimoB_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlCinrMimoB");
    private final static QName _BsIbBaseTermRfStatsRowWsAntennaDirection_QNAME = new QName("http://Airspan.Netspan.WebServices", "AntennaDirection");
    private final static QName _BsIbBaseTermDataStatsRowWsUlBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlBytes");
    private final static QName _BsIbBaseTermDataStatsRowWsDlBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlBytes");
    private final static QName _BsIbBaseTermDataStatsRowWsHarqUlAcks_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqUlAcks");
    private final static QName _BsIbBaseTermDataStatsRowWsHarqUlNacks_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqUlNacks");
    private final static QName _BsIbBaseTermDataStatsRowWsHarqDlAcks_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqDlAcks");
    private final static QName _BsIbBaseTermDataStatsRowWsHarqDlNacks_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqDlNacks");
    private final static QName _BsIbBaseTermDataStatsRowWsUlPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPackets");
    private final static QName _BsIbBaseTermDataStatsRowWsDlPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlPackets");
    private final static QName _BsIbBaseTermDataStatsRowWsUlHarqLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlHarqLoss");
    private final static QName _BsIbBaseTermDataStatsRowWsDlHarqLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlHarqLoss");
    private final static QName _BsIbBaseTermDataStatsRowWsFtNullingQi_QNAME = new QName("http://Airspan.Netspan.WebServices", "FtNullingQi");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlModQpsk12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep2_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlModQpsk12rep2");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep4_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlModQpsk12rep4");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep6_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlModQpsk12rep6");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlModQpsk34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod16Qam12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod16Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod64Qam12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod64Qam23");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod64Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod64Qam56");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod256Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMod256Qam56");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlFrameUtilization_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlFrameUtilization");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlSubFrameSlots_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlSubFrameSlots");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlUsedSubFrameSlots_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlUsedSubFrameSlots");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlFrameOverhead_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlFrameOverhead");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoA_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlSubframeSlotsMimoA");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoB_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlSubframeSlotsMimoB");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsSiso_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlSubframeSlotsSiso");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlModQpsk12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep2_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlModQpsk12rep2");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep4_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlModQpsk12rep4");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep6_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlModQpsk12rep6");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlModQpsk34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod16Qam12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod16Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam12_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod64Qam12");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam23_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod64Qam23");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod64Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod64Qam56");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam34_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod256Qam34");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam56_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMod256Qam56");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlFrameUtilization_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlFrameUtilization");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlSubFrameSlots_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlSubFrameSlots");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlUsedSubFrameSlots_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlUsedSubFrameSlots");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlFrameOverhead_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlFrameOverhead");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoA_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlSubframeSlotsMimoA");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoB_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlSubframeSlotsMimoB");
    private final static QName _BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsSiso_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlSubframeSlotsSiso");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsUlErrorPkts_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlErrorPkts");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsUlPkts_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPkts");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsDlPkts_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlPkts");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsHarqUlBursts_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqUlBursts");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsHarqDlBursts_QNAME = new QName("http://Airspan.Netspan.WebServices", "HarqDlBursts");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsNoiseLevelLowCounter_QNAME = new QName("http://Airspan.Netspan.WebServices", "NoiseLevelLowCounter");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsNoiseLevelMedCounter_QNAME = new QName("http://Airspan.Netspan.WebServices", "NoiseLevelMedCounter");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsNoiseLevelHighCounter_QNAME = new QName("http://Airspan.Netspan.WebServices", "NoiseLevelHighCounter");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsNoiseLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "NoiseLevel");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsPeakNoiseLevel_QNAME = new QName("http://Airspan.Netspan.WebServices", "PeakNoiseLevel");
    private final static QName _BsIbBaseAirInterfaceStatsRowWsFbNullingQi_QNAME = new QName("http://Airspan.Netspan.WebServices", "FbNullingQi");
    private final static QName _Ib440QosPerQciStatsRowWsPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "Packets");
    private final static QName _Ib440QosPerQciStatsRowWsBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "Bytes");
    private final static QName _Ib440QosPerQciStatsRowWsDropped_QNAME = new QName("http://Airspan.Netspan.WebServices", "Dropped");
    private final static QName _Ib440IpStatsRowWsInBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "InBytes");
    private final static QName _Ib440IpStatsRowWsInUnicastPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "InUnicastPackets");
    private final static QName _Ib440IpStatsRowWsInMulticastPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "InMulticastPackets");
    private final static QName _Ib440IpStatsRowWsInDiscards_QNAME = new QName("http://Airspan.Netspan.WebServices", "InDiscards");
    private final static QName _Ib440IpStatsRowWsInErrors_QNAME = new QName("http://Airspan.Netspan.WebServices", "InErrors");
    private final static QName _Ib440IpStatsRowWsOutBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutBytes");
    private final static QName _Ib440IpStatsRowWsOutUnicastPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutUnicastPackets");
    private final static QName _Ib440IpStatsRowWsOutMulticastPackets_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutMulticastPackets");
    private final static QName _Ib440IpStatsRowWsOutDiscards_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutDiscards");
    private final static QName _Ib440IpStatsRowWsOutErrors_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutErrors");
    private final static QName _Ib440IpStatsRowWsRxThroughput_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxThroughput");
    private final static QName _Ib440IpStatsRowWsTxThroughput_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxThroughput");
    private final static QName _Ib440RfStatsRowWsSignalToNoise_QNAME = new QName("http://Airspan.Netspan.WebServices", "SignalToNoise");
    private final static QName _Ib440RfStatsRowWsTxSignalStrengthCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthCh0");
    private final static QName _Ib440RfStatsRowWsTxSignalStrengthCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxSignalStrengthCh1");
    private final static QName _Ib440RfStatsRowWsRxSignalStrengthCh0_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthCh0");
    private final static QName _Ib440RfStatsRowWsRxSignalStrengthCh1_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrengthCh1");
    private final static QName _Ib440RfStatsRowWsRxSignalStrength_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxSignalStrength");
    private final static QName _Ib440RfStatsRowWsTxPower_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxPower");
    private final static QName _Ib440RfStatsRowWsFrequency_QNAME = new QName("http://Airspan.Netspan.WebServices", "Frequency");
    private final static QName _Ib440RfStatsRowWsUptime_QNAME = new QName("http://Airspan.Netspan.WebServices", "Uptime");
    private final static QName _Ib440RfStatsRowWsTxRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxRate");
    private final static QName _Ib440RfStatsRowWsRxRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxRate");
    private final static QName _Ib440RfStatsRowWsTxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "TxLinkEfficiency");
    private final static QName _Ib440RfStatsRowWsRxLinkEfficiency_QNAME = new QName("http://Airspan.Netspan.WebServices", "RxLinkEfficiency");
    private final static QName _LteRachPreamblesSentStatsRowWsCellId_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellId");
    private final static QName _LteRachPreamblesSentStatsRowWsRachPreamblesSent_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreamblesSent");
    private final static QName _LteRachPreamblesSentStatsRowWsRachBinMinValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachBinMinValue");
    private final static QName _LteRachPreamblesSentStatsRowWsRachBinMaxValue_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachBinMaxValue");
    private final static QName _LteRachAccessDelayStatsRowWsRachAccessDelay_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachAccessDelay");
    private final static QName _LteMmeStatsRowWsSctpPort_QNAME = new QName("http://Airspan.Netspan.WebServices", "SctpPort");
    private final static QName _LteMmeStatsRowWsPermitEmrgSessAndMobileTerminatedSrvOnly_QNAME = new QName("http://Airspan.Netspan.WebServices", "PermitEmrgSessAndMobileTerminatedSrvOnly");
    private final static QName _LteMmeStatsRowWsPermitHighPrioSessAndMobileTerminatedSrvOnly_QNAME = new QName("http://Airspan.Netspan.WebServices", "PermitHighPrioSessAndMobileTerminatedSrvOnly");
    private final static QName _LteMmeStatsRowWsRejectDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "RejectDelayTolerantAccess");
    private final static QName _LteMmeStatsRowWsRejectNonEmergencyMoDt_QNAME = new QName("http://Airspan.Netspan.WebServices", "RejectNonEmergencyMoDt");
    private final static QName _LteMmeStatsRowWsRejectRrcCrSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "RejectRrcCrSignalling");
    private final static QName _LteMmeStatsRowWsStop_QNAME = new QName("http://Airspan.Netspan.WebServices", "Stop");
    private final static QName _LteMcsStatsRowWsMcsAllocIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "McsAllocIndex");
    private final static QName _LteMcsStatsRowWsDlMcsAllocCw1_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMcsAllocCw1");
    private final static QName _LteMcsStatsRowWsDlMcsAllocCw2_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMcsAllocCw2");
    private final static QName _LteMcsStatsRowWsUlMcsAlloc_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMcsAlloc");
    private final static QName _LteIntraEnbLbStatsRowWsX2InterFreqInAttRnlIntraEnbLoadBalancingRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlIntraEnbLoadBalancingRsn");
    private final static QName _LteIntraEnbLbStatsRowWsX2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn");
    private final static QName _LteIntraEnbLbStatsRowWsX2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn");
    private final static QName _LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadAverage_QNAME = new QName("http://Airspan.Netspan.WebServices", "LoadMeasurementsCompositeLoadAverage");
    private final static QName _LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMinimum_QNAME = new QName("http://Airspan.Netspan.WebServices", "LoadMeasurementsCompositeLoadMinimum");
    private final static QName _LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMaximum_QNAME = new QName("http://Airspan.Netspan.WebServices", "LoadMeasurementsCompositeLoadMaximum");
    private final static QName _LteHarqStatsRowWsBinId_QNAME = new QName("http://Airspan.Netspan.WebServices", "BinId");
    private final static QName _LteHarqStatsRowWsDlAckCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlAckCount");
    private final static QName _LteHarqStatsRowWsDlNackCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlNackCount");
    private final static QName _LteHarqStatsRowWsUlAckCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlAckCount");
    private final static QName _LteHarqStatsRowWsUlNackCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlNackCount");
    private final static QName _LteHarqStatsRowWsDlMsg4AckCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMsg4AckCount");
    private final static QName _LteHarqStatsRowWsDlMsg4NackCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMsg4NackCount");
    private final static QName _LteHarqStatsRowWsUlMsg3AckCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMsg3AckCount");
    private final static QName _LteHarqStatsRowWsUlMsg3NackCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMsg3NackCount");
    private final static QName _LteEmbmsStatsRowWsM2ConnSetupAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2ConnSetupAtt");
    private final static QName _LteEmbmsStatsRowWsM2ConnSetupSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2ConnSetupSucc");
    private final static QName _LteEmbmsStatsRowWsM2ConnSetupFailStd_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2ConnSetupFailStd");
    private final static QName _LteEmbmsStatsRowWsM2ConnSetupFailLinkLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2ConnSetupFailLinkLoss");
    private final static QName _LteEmbmsStatsRowWsM2SessionStartAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStartAtt");
    private final static QName _LteEmbmsStatsRowWsM2SessionStartSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStartSucc");
    private final static QName _LteEmbmsStatsRowWsM2SessionStartFailSpec_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStartFailSpec");
    private final static QName _LteEmbmsStatsRowWsM2SessionStartFailLinkLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStartFailLinkLoss");
    private final static QName _LteEmbmsStatsRowWsM2SessionStartFailUnSpec_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStartFailUnSpec");
    private final static QName _LteEmbmsStatsRowWsM2SessionStopAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStopAtt");
    private final static QName _LteEmbmsStatsRowWsM2SessionStopSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStopSucc");
    private final static QName _LteEmbmsStatsRowWsM2SessionStopFailLinkLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStopFailLinkLoss");
    private final static QName _LteEmbmsStatsRowWsM2SessionStopFailOther_QNAME = new QName("http://Airspan.Netspan.WebServices", "M2SessionStopFailOther");
    private final static QName _LteEmbmsStatsRowWsSyncPduCountType0_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncPduCountType0");
    private final static QName _LteEmbmsStatsRowWsSyncPduCountType1_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncPduCountType1");
    private final static QName _LteEmbmsStatsRowWsSyncPduCountType3_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncPduCountType3");
    private final static QName _LteEmbmsStatsRowWsSyncByteType0_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncByteType0");
    private final static QName _LteEmbmsStatsRowWsSyncByteType1_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncByteType1");
    private final static QName _LteEmbmsStatsRowWsSyncByteType3_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncByteType3");
    private final static QName _LteEmbmsStatsRowWsSyncSyncSeqDiscard_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncSyncSeqDiscard");
    private final static QName _LteEmbmsStatsRowWsSyncSyncPduDropWrongTeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncSyncPduDropWrongTeId");
    private final static QName _LteEmbmsStatsRowWsSyncSyncByteDropWrongTeId_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncSyncByteDropWrongTeId");
    private final static QName _LteEmbmsStatsRowWsSyncSyncSduDropOtherReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncSyncSduDropOtherReason");
    private final static QName _LteEmbmsStatsRowWsSyncSyncSeqCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncSyncSeqCount");
    private final static QName _LteEmbmsStatsRowWsSyncDiscardedSyncSeqCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "SyncDiscardedSyncSeqCount");
    private final static QName _LteEmbmsStatsRowWsCellSyncSync2RlcPduCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellSyncSync2RlcPduCount");
    private final static QName _LteEmbmsStatsRowWsCellSyncSync2RlcByteCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellSyncSync2RlcByteCount");
    private final static QName _LteEmbmsStatsRowWsCellSyncSync2RlcSyncSeqCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "CellSyncSync2RlcSyncSeqCount");
    private final static QName _LteCsfbStatsRowWsUtranRedirectionAttempts_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtranRedirectionAttempts");
    private final static QName _LteCsfbStatsRowWsUtranFailedRedirections_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtranFailedRedirections");
    private final static QName _LteCsfbStatsRowWsUtranSuccessfulRedirections_QNAME = new QName("http://Airspan.Netspan.WebServices", "UtranSuccessfulRedirections");
    private final static QName _LteCsfbStatsRowWsCdma2KRedirections_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cdma2kRedirections");
    private final static QName _LteCsfbStatsRowWsCdma2KTransferRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cdma2kTransferRate");
    private final static QName _LteCsfbStatsRowWsCsfb3GRedirectionMeas_QNAME = new QName("http://Airspan.Netspan.WebServices", "Csfb3GRedirectionMeas");
    private final static QName _LteCsfbStatsRowWsCdma2KRequest_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cdma2kRequest");
    private final static QName _LteCsfbStatsRowWsCdma2KResponse_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cdma2kResponse");
    private final static QName _LtePagingStatsRowWsDiscardedNumber_QNAME = new QName("http://Airspan.Netspan.WebServices", "DiscardedNumber");
    private final static QName _LteCarrAggreStatsRowWsCaSCellReleaseSentNum_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaSCellReleaseSentNum");
    private final static QName _LteCarrAggreStatsRowWsCaScellAdditionAttemptCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellAdditionAttemptCount");
    private final static QName _LteCarrAggreStatsRowWsCaScellAdditionSuccessCount_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellAdditionSuccessCount");
    private final static QName _LteCarrAggreStatsRowWsCaScellAdditionSuccessRate_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellAdditionSuccessRate");
    private final static QName _LteCarrAggreStatsRowWsCaNumActivateCommandsSent_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaNumActivateCommandsSent");
    private final static QName _LteCarrAggreStatsRowWsCaNumDeactivateCommandsSent_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaNumDeactivateCommandsSent");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCw0WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw0WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCw1WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "Cw1WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsAnt1RssiMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant1RssiMin");
    private final static QName _LteRfMeasStatsRowWsAnt1RssiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant1RssiAvg");
    private final static QName _LteRfMeasStatsRowWsAnt1RssiMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant1RssiMax");
    private final static QName _LteRfMeasStatsRowWsAnt2RssiMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant2RssiMin");
    private final static QName _LteRfMeasStatsRowWsAnt2RssiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant2RssiAvg");
    private final static QName _LteRfMeasStatsRowWsAnt2RssiMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant2RssiMax");
    private final static QName _LteRfMeasStatsRowWsAnt3RssiMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant3RssiMin");
    private final static QName _LteRfMeasStatsRowWsAnt3RssiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant3RssiAvg");
    private final static QName _LteRfMeasStatsRowWsAnt3RssiMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant3RssiMax");
    private final static QName _LteRfMeasStatsRowWsAnt4RssiMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant4RssiMin");
    private final static QName _LteRfMeasStatsRowWsAnt4RssiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant4RssiAvg");
    private final static QName _LteRfMeasStatsRowWsAnt4RssiMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "Ant4RssiMax");
    private final static QName _LteRfMeasStatsRowWsNiMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "NiMin");
    private final static QName _LteRfMeasStatsRowWsNiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "NiAvg");
    private final static QName _LteRfMeasStatsRowWsNiMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "NiMax");
    private final static QName _LteRfMeasStatsRowWsCwAllocDlNum1_QNAME = new QName("http://Airspan.Netspan.WebServices", "CwAllocDlNum1");
    private final static QName _LteRfMeasStatsRowWsCwAllocDlNum2_QNAME = new QName("http://Airspan.Netspan.WebServices", "CwAllocDlNum2");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw0WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw0WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCaPcellCw1WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPcellCw1WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw0WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw0WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi1Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi1Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi2Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi2Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi3Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi3Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi4Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi4Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi5Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi5Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi6Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi6Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi7Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi7Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi8Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi8Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi9Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi9Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi10Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi10Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi11Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi11Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi12Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi12Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi13Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi13Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi14Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi14Dist");
    private final static QName _LteRfMeasStatsRowWsCaScellCw1WbCqi15Dist_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaScellCw1WbCqi15Dist");
    private final static QName _LteRfMeasStatsRowWsCaAvgUesWithActiveSCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaAvgUesWithActiveSCell");
    private final static QName _LteRfMeasStatsRowWsCaAvgCaCapableUes_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaAvgCaCapableUes");
    private final static QName _LteRfMeasStatsRowWsCaAvgUesWithCfgSCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaAvgUesWithCfgSCell");
    private final static QName _LteRfMeasStatsRowWsCaPCellMacDlDataVolume_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPCellMacDlDataVolume");
    private final static QName _LteRfMeasStatsRowWsCaSCellMacDlDataVolume_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaSCellMacDlDataVolume");
    private final static QName _LteRfMeasStatsRowWsCaPCellMacUlDataVolume_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaPCellMacUlDataVolume");
    private final static QName _LteRfMeasStatsRowWsCaSCellMacUlDataVolume_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaSCellMacUlDataVolume");
    private final static QName _LteEquipMeasStatsRowWsEquipMeasMeanProcUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "EquipMeasMeanProcUsage");
    private final static QName _LteEquipMeasStatsRowWsEquipMeasMaxProcUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "EquipMeasMaxProcUsage");
    private final static QName _LteEquipMeasStatsRowWsEquipMemoryUsageMean_QNAME = new QName("http://Airspan.Netspan.WebServices", "EquipMemoryUsageMean");
    private final static QName _LteEquipMeasStatsRowWsEquipMemoryUsageMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "EquipMemoryUsageMax");
    private final static QName _LteLiteCompStatsRowWsLiteCompIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "LiteCompIndex");
    private final static QName _LteLiteCompStatsRowWsEfficiencyGain_QNAME = new QName("http://Airspan.Netspan.WebServices", "EfficiencyGain");
    private final static QName _LtePosMeasurementsStatsRowWsEcidSuccMeasInitResponse_QNAME = new QName("http://Airspan.Netspan.WebServices", "EcidSuccMeasInitResponse");
    private final static QName _LtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemNotSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "EcidFailMeasInitCauseReqItemNotSupported");
    private final static QName _LtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemTemporarilyNotSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "EcidFailMeasInitCauseReqItemTemporarilyNotSupported");
    private final static QName _LteRruPerQciStatsRowWsQciIndex_QNAME = new QName("http://Airspan.Netspan.WebServices", "QciIndex");
    private final static QName _LteRruPerQciStatsRowWsDlPrbUsageForTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlPrbUsageForTraffic");
    private final static QName _LteRruPerQciStatsRowWsUlPrbUsageForTraffic_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPrbUsageForTraffic");
    private final static QName _LteRruPerQciStatsRowWsDlMacTrafficKbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMacTrafficKbps");
    private final static QName _LteRruPerQciStatsRowWsUlMacTrafficKbps_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMacTrafficKbps");
    private final static QName _LteRruPerQciStatsRowWsDlMacTrafficBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlMacTrafficBytes");
    private final static QName _LteRruPerQciStatsRowWsUlMacTrafficBytes_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlMacTrafficBytes");
    private final static QName _LteRruPerQciStatsRowWsDlEffMacTrafficKbPerTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlEffMacTrafficKbPerTti");
    private final static QName _LteRruPerQciStatsRowWsUlEffMacTrafficKbPerTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlEffMacTrafficKbPerTti");
    private final static QName _LteRruPerQciStatsRowWsDlActiveTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlActiveTti");
    private final static QName _LteRruPerQciStatsRowWsUlActiveTti_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlActiveTti");
    private final static QName _LteRruPerQciStatsRowWsCaThpTimeDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaThpTimeDl");
    private final static QName _LteRruPerQciStatsRowWsCaThpVolDl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaThpVolDl");
    private final static QName _LteRruPerQciStatsRowWsCaThpTimeUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaThpTimeUl");
    private final static QName _LteRruPerQciStatsRowWsCaThpVolUl_QNAME = new QName("http://Airspan.Netspan.WebServices", "CaThpVolUl");
    private final static QName _LteRrcStatsRowWsConnEstabAttEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttEmergency");
    private final static QName _LteRrcStatsRowWsConnEstabAttHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsConnEstabAttMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttMtAccess");
    private final static QName _LteRrcStatsRowWsConnEstabAttMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttMoSignalling");
    private final static QName _LteRrcStatsRowWsConnEstabAttMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttMoData");
    private final static QName _LteRrcStatsRowWsConnEstabAttSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttSum");
    private final static QName _LteRrcStatsRowWsConnEstabSuccEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccEmergency");
    private final static QName _LteRrcStatsRowWsConnEstabSuccHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsConnEstabSuccMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccMtAccess");
    private final static QName _LteRrcStatsRowWsConnEstabSuccMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccMoSignalling");
    private final static QName _LteRrcStatsRowWsConnEstabSuccMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccMoData");
    private final static QName _LteRrcStatsRowWsConnEstabSuccSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccSum");
    private final static QName _LteRrcStatsRowWsConnEstabFailEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailEmergency");
    private final static QName _LteRrcStatsRowWsConnEstabFailHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsConnEstabFailMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailMtAccess");
    private final static QName _LteRrcStatsRowWsConnEstabFailMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailMoSignalling");
    private final static QName _LteRrcStatsRowWsConnEstabFailMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailMoData");
    private final static QName _LteRrcStatsRowWsConnEstabFailSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailSum");
    private final static QName _LteRrcStatsRowWsConnEstabFailNBCauseCongestion_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailNBCauseCongestion");
    private final static QName _LteRrcStatsRowWsConnEstabFailNBCauseUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailNBCauseUnspecified");
    private final static QName _LteRrcStatsRowWsConnReEstabAttReconfigurationFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabAttReconfigurationFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabAttHandoverFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabAttHandoverFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabAttOtherFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabAttOtherFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabAttSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabAttSum");
    private final static QName _LteRrcStatsRowWsConnReEstabSuccReconfigurationFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabSuccReconfigurationFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabSuccHandoverFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabSuccHandoverFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabSuccOtherFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabSuccOtherFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabSuccSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabSuccSum");
    private final static QName _LteRrcStatsRowWsConnReEstabFailReconfigurationFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabFailReconfigurationFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabFailHandoverFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabFailHandoverFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabFailOtherFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabFailOtherFailure");
    private final static QName _LteRrcStatsRowWsConnReEstabFailSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabFailSum");
    private final static QName _LteRrcStatsRowWsConnMeanVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnMeanVal");
    private final static QName _LteRrcStatsRowWsConnMaxVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnMaxVal");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMeanEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMeanEmergency");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMeanHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMeanHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMeanMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMeanMtAccess");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMeanMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMeanMoSignalling");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMeanMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMeanMoData");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMaxEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMaxEmergency");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMaxHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMaxHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMaxMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMaxMtAccess");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMaxMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMaxMoSignalling");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMaxMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMaxMoData");
    private final static QName _LteRrcStatsRowWsUeContextRelReqSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqSum");
    private final static QName _LteRrcStatsRowWsUeContextRelSuccNbr_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelSuccNbr");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMean_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMean");
    private final static QName _LteRrcStatsRowWsConnEstabTimeMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabTimeMax");
    private final static QName _LteRrcStatsRowWsConnEstabAttDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabAttDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsConnEstabSuccDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabSuccDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsConnEstabFailDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsConnEstabFailNBCauseEnergySaving_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailNBCauseEnergySaving");
    private final static QName _LteRrcStatsRowWsUeContextRelReqCauseUeConnLoss_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqCauseUeConnLoss");
    private final static QName _LteRrcStatsRowWsUeContextRelReqCauseUserInactivity_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqCauseUserInactivity");
    private final static QName _LteRrcStatsRowWsUeContextRelReqCauseCsFallbackTriggered_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqCauseCsFallbackTriggered");
    private final static QName _LteRrcStatsRowWsConnectedUesCat1Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat1Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat2Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat2Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat3Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat3Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat4Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat4Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat5Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat5Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat6Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat6Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat7Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat7Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat8Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat8Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat9Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat9Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat10Avg_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat10Avg");
    private final static QName _LteRrcStatsRowWsConnectedUesCat1Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat1Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat2Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat2Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat3Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat3Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat4Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat4Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat5Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat5Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat6Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat6Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat7Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat7Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat8Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat8Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat9Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat9Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat10Min_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat10Min");
    private final static QName _LteRrcStatsRowWsConnectedUesCat1Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat1Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat2Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat2Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat3Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat3Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat4Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat4Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat5Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat5Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat6Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat6Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat7Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat7Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat8Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat8Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat9Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat9Max");
    private final static QName _LteRrcStatsRowWsConnectedUesCat10Max_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesCat10Max");
    private final static QName _LteRrcStatsRowWsConnectedUesTotal_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesTotal");
    private final static QName _LteRrcStatsRowWsConnectedUesMin_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesMin");
    private final static QName _LteRrcStatsRowWsConnectedUesMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnectedUesMax");
    private final static QName _LteRrcStatsRowWsConnReconfigAttempt_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReconfigAttempt");
    private final static QName _LteRrcStatsRowWsConnReconfigSuccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReconfigSuccess");
    private final static QName _LteRrcStatsRowWsUeContextRelReqRedirectionTowards1XRTT_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqRedirectionTowards1xRTT");
    private final static QName _LteRrcStatsRowWsUeContextRelReqInterRATRedirection_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqInterRATRedirection");
    private final static QName _LteRrcStatsRowWsUeContextRelReqRNwTx2RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqRNwTx2RelocOverallExpiry");
    private final static QName _LteRrcStatsRowWsUeContextRelReqRNwTS1RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqRNwTS1RelocOverallExpiry");
    private final static QName _LteRrcStatsRowWsUeContextRelReqRNwRelDueTOEUtranGenReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqRNwRelDueTOEUtranGenReason");
    private final static QName _LteRrcStatsRowWsUeContextRelReqRNwHOFailureTEnbEpcOrTSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqRNwHOFailureTEnbEpcOrTSys");
    private final static QName _LteRrcStatsRowWsUeContextRelReqFailInRadioInterfaceProcedure_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqFailInRadioInterfaceProcedure");
    private final static QName _LteRrcStatsRowWsUeContextRelReqUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqUnspecified");
    private final static QName _LteRrcStatsRowWsUeContextRelReqTPTransportResourceUnavailable_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqTPTransportResourceUnavailable");
    private final static QName _LteRrcStatsRowWsUeContextRelReqCsgSubscriptionExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqCsgSubscriptionExpiry");
    private final static QName _LteRrcStatsRowWsUeContextRelReqUeNotAvailableForPsService_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqUeNotAvailableForPsService");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxEmergency");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxMtAccess");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxMoSignaling_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxMoSignaling");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxMoData");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsCallDropRlcMaxHandover_QNAME = new QName("http://Airspan.Netspan.WebServices", "CallDropRlcMaxHandover");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfEmergency");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfMtAccess");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfMoSignaling_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfMoSignaling");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfMoData");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsLinkInactivityRlfHandover_QNAME = new QName("http://Airspan.Netspan.WebServices", "LinkInactivityRlfHandover");
    private final static QName _LteRrcStatsRowWsUeContextRelCommUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommUnspecified");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectEmergency_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectEmergency");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectHighPriorityAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectHighPriorityAccess");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectMtAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectMtAccess");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectMoSignalling_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectMoSignalling");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectMoData_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectMoData");
    private final static QName _LteRrcStatsRowWsMmeOverloadRejectDelayTolerantAccess_QNAME = new QName("http://Airspan.Netspan.WebServices", "MmeOverloadRejectDelayTolerantAccess");
    private final static QName _LteRrcStatsRowWsUeContextRelCommNASNormalRelease_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommNASNormalRelease");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwTS1RelocOverAllExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwTS1RelocOverAllExpiry");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRadioNwtx2RelocOverAllExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRadioNwtx2RelocOverAllExpiry");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwRelDueToEutranGenReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwRelDueToEutranGenReason");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwUserInactivity_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwUserInactivity");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwRadioConnWithUeLost_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwRadioConnWithUeLost");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwLoadBalTauReq_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwLoadBalTauReq");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwCSFBkTrig_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwCSFBkTrig");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwRedirectionTowards1XRTT_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwRedirectionTowards1xRTT");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwInterratRedirection_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwInterratRedirection");
    private final static QName _LteRrcStatsRowWsUeContextRelCommNASAuthenticationEnum_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommNASAuthenticationEnum");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwSuccHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwSuccHO");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwHoFailInTargEPCEnbOrTargSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwHoFailInTargEPCEnbOrTargSys");
    private final static QName _LteRrcStatsRowWsUeContextRelCommRNwFailInRadioInterfProc_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommRNwFailInRadioInterfProc");
    private final static QName _LteRrcStatsRowWsUeContextRelCommTPTransportResUnavail_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommTPTransportResUnavail");
    private final static QName _LteRrcStatsRowWsUeContextRelCommNASDetach_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelCommNASDetach");
    private final static QName _LteRrcStatsRowWsConnEstabFailS1APSignallingFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnEstabFailS1APSignallingFailure");
    private final static QName _LteRrcStatsRowWsUeContextRelReqCallDrpS1ApLinkOutOfService_QNAME = new QName("http://Airspan.Netspan.WebServices", "UeContextRelReqCallDrpS1apLinkOutOfService");
    private final static QName _LteRrcStatsRowWsConnReEstabFailS1APSignallingFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "ConnReEstabFailS1APSignallingFailure");
    private final static QName _LteRruStatsRowWsTotalNumOfDlTbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalNumOfDlTbs");
    private final static QName _LteRruStatsRowWsTotalNumOfErrorDlTbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalNumOfErrorDlTbs");
    private final static QName _LteRruStatsRowWsTotalNumOfUlTbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalNumOfUlTbs");
    private final static QName _LteRruStatsRowWsTotalNumOfErrorUlTbs_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalNumOfErrorUlTbs");
    private final static QName _LteRruStatsRowWsDlPrbUsageForTrafficSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlPrbUsageForTrafficSum");
    private final static QName _LteRruStatsRowWsUlPrbUsageForTrafficSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlPrbUsageForTrafficSum");
    private final static QName _LteRruStatsRowWsDlTotalPrbUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "DlTotalPrbUsage");
    private final static QName _LteRruStatsRowWsUlTotalPrbUsage_QNAME = new QName("http://Airspan.Netspan.WebServices", "UlTotalPrbUsage");
    private final static QName _LteRruStatsRowWsTotalCellUnavailableTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalCellUnavailableTime");
    private final static QName _LteRruStatsRowWsRachContentiousAttempts_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachContentiousAttempts");
    private final static QName _LteRruStatsRowWsRachUEReportsReceived_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachUEReportsReceived");
    private final static QName _LteRruStatsRowWsRachPreamblesUsageTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreamblesUsageTime");
    private final static QName _LteRruStatsRowWsTotalCellUnavailableTimeFault_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalCellUnavailableTimeFault");
    private final static QName _LteRruStatsRowWsTotalCellUnavailableTimeManualIntervention_QNAME = new QName("http://Airspan.Netspan.WebServices", "TotalCellUnavailableTimeManualIntervention");
    private final static QName _LteRruStatsRowWsRachPreambleDedicatedMean_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreambleDedicatedMean");
    private final static QName _LteRruStatsRowWsRachPreambleGroupAMean_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreambleGroupAMean");
    private final static QName _LteRruStatsRowWsRachPreambleGroupBMean_QNAME = new QName("http://Airspan.Netspan.WebServices", "RachPreambleGroupBMean");
    private final static QName _LteRruStatsRowWsRruCfiAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "RruCfiAvg");
    private final static QName _LtePerCellHoStatsRowWsTargetCellIdentity_QNAME = new QName("http://Airspan.Netspan.WebServices", "TargetCellIdentity");
    private final static QName _LtePerCellHoStatsRowWsOutAttSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutAttSum");
    private final static QName _LtePerCellHoStatsRowWsOutAttDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutAttDesForRadReasons");
    private final static QName _LtePerCellHoStatsRowWsOutAttTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutAttTimeCritical");
    private final static QName _LtePerCellHoStatsRowWsOutAttResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutAttResOptimisation");
    private final static QName _LtePerCellHoStatsRowWsOutAttReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutAttReduceLoadInServingCell");
    private final static QName _LtePerCellHoStatsRowWsOutSuccSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutSuccSum");
    private final static QName _LtePerCellHoStatsRowWsOutSuccDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutSuccDesForRadReasons");
    private final static QName _LtePerCellHoStatsRowWsOutSuccTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutSuccTimeCritical");
    private final static QName _LtePerCellHoStatsRowWsOutSuccResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutSuccResOptimisation");
    private final static QName _LtePerCellHoStatsRowWsOutSuccReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "OutSuccReduceLoadInServingCell");
    private final static QName _LtePerCellHoStatsRowWsHoFailureMroTooEarly_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoFailureMroTooEarly");
    private final static QName _LtePerCellHoStatsRowWsHoFailureMroTooLate_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoFailureMroTooLate");
    private final static QName _LtePerCellHoStatsRowWsHoFailureMroWrongCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoFailureMroWrongCell");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttSum");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttDesForRadReasons");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttTimeCritical");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttResOptimisation");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccSum");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccDesForRadReasons");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccTimeCritical");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccResOptimisation");
    private final static QName _LteHoStatsRowWsInterEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsInterEnbOutAttSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutAttSum");
    private final static QName _LteHoStatsRowWsInterEnbOutAttDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutAttDesForRadReasons");
    private final static QName _LteHoStatsRowWsInterEnbOutAttTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutAttTimeCritical");
    private final static QName _LteHoStatsRowWsInterEnbOutAttResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutAttResOptimisation");
    private final static QName _LteHoStatsRowWsInterEnbOutSuccSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutSuccSum");
    private final static QName _LteHoStatsRowWsInterEnbOutSuccDesForRadReasons_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutSuccDesForRadReasons");
    private final static QName _LteHoStatsRowWsInterEnbOutSuccTimeCritical_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutSuccTimeCritical");
    private final static QName _LteHoStatsRowWsInterEnbOutSuccResOptimisation_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutSuccResOptimisation");
    private final static QName _LteHoStatsRowWsIntraFreqOutAttempts_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqOutAttempts");
    private final static QName _LteHoStatsRowWsIntraFreqOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqOutSucc");
    private final static QName _LteHoStatsRowWsInterFreqMeasGapOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqMeasGapOutAtt");
    private final static QName _LteHoStatsRowWsInterFreqMeasGapOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqMeasGapOutSucc");
    private final static QName _LteHoStatsRowWsInterFreqNoMeasGapOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqNoMeasGapOutAtt");
    private final static QName _LteHoStatsRowWsInterFreqNoMeasGapOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqNoMeasGapOutSucc");
    private final static QName _LteHoStatsRowWsDrxOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxOutAtt");
    private final static QName _LteHoStatsRowWsDrxOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "DrxOutSucc");
    private final static QName _LteHoStatsRowWsNonDrxOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "NonDrxOutAtt");
    private final static QName _LteHoStatsRowWsNonDrxOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "NonDrxOutSucc");
    private final static QName _LteHoStatsRowWsInterEnbOutAttReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutAttReduceLoadInServingCell");
    private final static QName _LteHoStatsRowWsInterEnbOutSuccReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutSuccReduceLoadInServingCell");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttReduceLoadInServingCell");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccReduceLoadInServingCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccReduceLoadInServingCell");
    private final static QName _LteHoStatsRowWsInterEnbOutQosAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosAtt");
    private final static QName _LteHoStatsRowWsInterEnbOutQosSuccSentConnReconfig_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosSuccSentConnReconfig");
    private final static QName _LteHoStatsRowWsInterEnbOutQosAttSuccCSFB_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosAttSuccCSFB");
    private final static QName _LteHoStatsRowWsInterEnbOutQosFailTimerExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosFailTimerExp");
    private final static QName _LteHoStatsRowWsInterEnbOutQosFailUECapability_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosFailUECapability");
    private final static QName _LteHoStatsRowWsInterEnbOutQosFailNoNeighbors_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterEnbOutQosFailNoNeighbors");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlResOpt");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInAttUnknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlResOpt");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInAttUnknown");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepSuccUnknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccUnknown");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlInvalidMmeGrpId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlInvalidMmeGrpId");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlHandoverTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlHandoverTgtNotAllow");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownMmeCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlUnknownMmeCode");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlUnknownNewEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlUnknownOldEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailRnlUnknownPairEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailTnlTransResUnAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailTnlTransResUnAvail");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInPrepFailUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInPrepFailUnknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlInvalidMmeGrpId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlInvalidMmeGrpId");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlHandoverTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlHandoverTgtNotAllow");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownMmeCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlUnknownMmeCode");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownNewEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlUnknownNewEnbX2apId");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownOldEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlUnknownOldEnbX2apId");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownPairEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailRnlUnknownPairEnbX2apId");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailTnlTransResUnAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailTnlTransResUnAvail");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepFailUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepFailUnknown");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompSuccUnknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompSuccUnknown");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailRnlMultipleErabIdInst_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailRnlMultipleErabIdInst");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailTlTransResUnvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailTlTransResUnvail");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailTlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailTlTransUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtAbsSynErrFlsContructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtAbsSynErrFlsContructMsg");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailProtUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailMiscCtrlProcOvld_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailMiscCtrlProcOvld");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailMiscNoEnoughUPRAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailMiscNoEnoughUPRAvail");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailMisHwErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailMisHwErr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailMiscOAMInt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailMiscOAMInt");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailRelocExecTmrExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailRelocExecTmrExp");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailPathSwitchTmrExpr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailPathSwitchTmrExpr");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailunknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailunknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailRnlMultipleErabIdInst_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailRnlMultipleErabIdInst");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailTlTransResUnvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailTlTransResUnvail");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailTlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailTlTransUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrIgnorAndNotift_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtAbstSynErrIgnorAndNotift");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtAbsSynErrFlsContructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtAbsSynErrFlsContructMsg");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailProtUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailMiscCtrlProcOvld_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailMiscCtrlProcOvld");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailMiscNoEnoughUPRAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailMiscNoEnoughUPRAvail");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailMisHwErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailMisHwErr");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailMiscOAMInt_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailMiscOAMInt");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailRelocExecTmrExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailRelocExecTmrExp");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailPathSwitchTmrExpr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailPathSwitchTmrExpr");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailunknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailunknown");
    private final static QName _LteHoStatsRowWsX2InterFreqInPrepSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInPrepSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttRnlResOpt");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInAttUnknown");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttRnlResOpt");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInAttUnknown");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttRnlResOpt");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1UnknFreqInAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1UnknFreqInAttUnknown");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepSuccUnknown");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepSuccUnknown");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInRadioInfProc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlFailInRadioInfProc");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlTgtNotAllow");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlInvalidCsgId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlInvalidCsgId");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlHOCancelled");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInTgtSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlFailInTgtSys");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownTgtId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlUnknownTgtId");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlUnknownMmeUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlUnknownEnbUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownPairUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailRnlUnknownPairUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailTlTransResUnavail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailTlTransResUnavail");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailNasUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailNasUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsS1IntraFreqInPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlFailInRadioInfProc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlFailInRadioInfProc");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlTgtNotAllow");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlInvalidCsgId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlInvalidCsgId");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlHOCancelled");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlFailInTgtSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlFailInTgtSys");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownTgtId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlUnknownTgtId");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownMmeUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlUnknownMmeUeS1apId");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownEnbUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlUnknownEnbUeS1apId");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownPairUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailRnlUnknownPairUeS1apId");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailTlTransResUnavail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailTlTransResUnavail");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailNasUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailNasUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsS1InterFreqInPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompSuccUnknown");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccRnlRadioRsn_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccRnlRadioRsn");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccRnlTimeCrit_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccRnlTimeCrit");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccRnlResOpt_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccRnlResOpt");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccRnlReduceLoadInSvgCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccRnlReduceLoadInSvgCell");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompSuccUnknown");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompFailTgtRelocTmrExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompFailTgtRelocTmrExp");
    private final static QName _LteHoStatsRowWsS1IntraFreqInCompFailHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqInCompFailHOCancelled");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompFailTgtRelocTmrExp_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompFailTgtRelocTmrExp");
    private final static QName _LteHoStatsRowWsS1InterFreqInCompFailHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqInCompFailHOCancelled");
    private final static QName _LteHoStatsRowWsS1IntraFreqTimeAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqTimeAvg");
    private final static QName _LteHoStatsRowWsS1IntraFreqTimeMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntraFreqTimeMax");
    private final static QName _LteHoStatsRowWsS1InterFreqTimeAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqTimeAvg");
    private final static QName _LteHoStatsRowWsS1InterFreqTimeMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1InterFreqTimeMax");
    private final static QName _LteHoStatsRowWsX2IntraFreqTimeAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqTimeAvg");
    private final static QName _LteHoStatsRowWsX2IntraFreqTimeMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqTimeMax");
    private final static QName _LteHoStatsRowWsX2InterFreqTimeAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqTimeAvg");
    private final static QName _LteHoStatsRowWsX2InterFreqTimeMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqTimeMax");
    private final static QName _LteHoStatsRowWsX2IntraFreqInCompFailRnlHandoverTgtNotAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntraFreqInCompFailRnlHandoverTgtNotAllowed");
    private final static QName _LteHoStatsRowWsX2InterFreqInCompFailRnlHandoverTgtNotAllowed_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2InterFreqInCompFailRnlHandoverTgtNotAllowed");
    private final static QName _LteHoStatsRowWsHoInterFrameOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoInterFrameOutAtt");
    private final static QName _LteHoStatsRowWsHoInterFrameOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoInterFrameOutSucc");
    private final static QName _LteHoStatsRowWsHoS1InterEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoS1InterEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsHoX2InterEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoX2InterEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsHoS1InterEnbOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoS1InterEnbOutSucc");
    private final static QName _LteHoStatsRowWsHoX2InterEnbOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "HoX2InterEnbOutSucc");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInRadioInfProc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlFailInRadioInfProc");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlTgtNotAllow");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidCsgId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlInvalidCsgId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlHOCancelled");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInTgtSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlFailInTgtSys");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownTgtId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnknownTgtId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnknownMmeUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnknownEnbUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownPairUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnknownPairUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlTX2RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlTX2relocOverallExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlTS1relocOverallExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocPrepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlTS1relocPrepExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioConnectionWithUELost_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlRadioConnectionWithUELost");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUENotAvlblForPSService_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUENotAvlblForPSService");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioResourceNotAvlbl_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlRadioResourceNotAvlbl");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailureInRadioInterface_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlFailureInRadioInterface");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidQOSCombination_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlInvalidQOSCombination");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlInteractionWithOtherProcedure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlInteractionWithOtherProcedure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownERABID_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlUnknownERABID");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlMultipleERABIDInstances_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlMultipleERABIDInstances");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlRedirectionTowards1XRTT_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlRedirectionTowards1XRTT");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlNotSupportedQCIVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlNotSupportedQCIVal");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailTlTransResUnavail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailTlTransResUnavail");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailTlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailTlTransUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailNasUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailNasUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailNasAuthenticationFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailNasAuthenticationFailure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailNasCSGSubscriptionExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailNasCSGSubscriptionExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscCtrlProcessingOverload_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscCtrlProcessingOverload");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscHwFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscHwFailure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscOMIntervention_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscOMIntervention");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailMiscUnknownPLMN_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailMiscUnknownPLMN");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlInvalidMmeGrpId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlInvalidMmeGrpId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlHandoverTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlHandoverTgtNotAllow");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownMmeCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlUnknownMmeCode");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlTX2RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlTX2relocOverallExpiry");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlUnknownNewEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlUnknownOldEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlUnknownPairEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlValueOutofAllowedRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlValueOutofAllowedRange");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlMultipleERABIDInstances_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlMultipleERABIDInstances");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailRnlNotSupportedQCIVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailRnlNotSupportedQCIVal");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransResUnAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailTnlTransResUnAvail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransSyntaxError_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailTnlTransSyntaxError");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailMiscControlProcessingOverload_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailMiscControlProcessingOverload");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailMiscHwFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailMiscHwFailure");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailMiscOMIntervention_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailMiscOMIntervention");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailMiscEnoughProcessingResource_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailMiscEnoughProcessingResource");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailUnknown");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlFailInRadioInfProc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlFailInRadioInfProc");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlTgtNotAllow");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidCsgId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlInvalidCsgId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlHOCancelled_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlHOCancelled");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlFailInTgtSys_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlFailInTgtSys");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownTgtId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnknownTgtId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownMmeUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnknownMmeUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownEnbUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnknownEnbUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownPairUeS1ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnknownPairUeS1apId");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlTX2RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlTX2relocOverallExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlTS1relocOverallExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocPrepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlTS1relocPrepExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlRadioConnectionWithUELost_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlRadioConnectionWithUELost");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUENotAvlblForPSService_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUENotAvlblForPSService");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlRadioResourceNotAvlbl_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlRadioResourceNotAvlbl");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlFailureInRadioInterface_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlFailureInRadioInterface");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidQOSCombination_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlInvalidQOSCombination");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlInteractionWithOtherProcedure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlInteractionWithOtherProcedure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownERABID_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlUnknownERABID");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlMultipleERABIDInstances_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlMultipleERABIDInstances");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlRedirectionTowards1XRTT_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlRedirectionTowards1XRTT");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlNotSupportedQCIVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlNotSupportedQCIVal");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailTlTransResUnavail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailTlTransResUnavail");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailTlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailTlTransUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailNasUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailNasUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailNasAuthenticationFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailNasAuthenticationFailure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailNasCSGSubscriptionExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailNasCSGSubscriptionExpiry");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscCtrlProcessingOverload_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscCtrlProcessingOverload");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscHwFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscHwFailure");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscOMIntervention_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscOMIntervention");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailMiscUnknownPLMN_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailMiscUnknownPLMN");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlCellNotAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlCellNotAvail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlInvalidMmeGrpId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlInvalidMmeGrpId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlHandoverTgtNotAllow_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlHandoverTgtNotAllow");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownMmeCode_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlUnknownMmeCode");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlTrelocprepExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlTrelocprepExpiry");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlTX2RelocOverallExpiry_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlTX2relocOverallExpiry");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownNewEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlUnknownNewEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownOldEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlUnknownOldEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownPairEnbX2ApId_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlUnknownPairEnbX2apId");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlSwitchOffOngoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlSwitchOffOngoing");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlValueOutofAllowedRange_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlValueOutofAllowedRange");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlMultipleERABIDInstances_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlMultipleERABIDInstances");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRnlNotSupportedQCIVal_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRnlNotSupportedQCIVal");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailTnlTransResUnAvail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailTnlTransResUnAvail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrRej_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtAbstSynErrRej");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtSemanticErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtSemanticErr");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtTransferSynErr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtTransferSynErr");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailMiscControlProcessingOverload_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailMiscControlProcessingOverload");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailMiscHwFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailMiscHwFailure");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailMiscOMIntervention_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailMiscOMIntervention");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailMiscEnoughProcessingResource_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailMiscEnoughProcessingResource");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailMiscUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailMiscUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailUnknown");
    private final static QName _LteHoStatsRowWsInterFrameOutAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFrameOutAtt");
    private final static QName _LteHoStatsRowWsInterFrameOutSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFrameOutSucc");
    private final static QName _LteHoStatsRowWsIntraFreqInterEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqInterEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsInterFreqInterEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqInterEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailCritDiag_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailCritDiag");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRnlPartialHO_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRnlPartialHO");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailRrcSignalHoFail_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailRrcSignalHoFail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailTnlTransUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailCritDiag_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailCritDiag");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailTnlTransUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailTnlTransUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtUnspecified");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailRrcSignalHoFail_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailRrcSignalHoFail");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailPathSwitchTmrExpr_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailPathSwitchTmrExpr");
    private final static QName _LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify");
    private final static QName _LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify");
    private final static QName _LteHoStatsRowWsS1IntereNBOutExecFailCritDiag_QNAME = new QName("http://Airspan.Netspan.WebServices", "S1IntereNBOutExecFailCritDiag");
    private final static QName _LteHoStatsRowWsX2IntereNBOutExecFailCritDiag_QNAME = new QName("http://Airspan.Netspan.WebServices", "X2IntereNBOutExecFailCritDiag");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttSwitchOffOnGoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttSwitchOffOnGoing");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttIntraEnbLb_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttIntraEnbLb");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttUnspecified");
    private final static QName _LteHoStatsRowWsIntraEnbOutAttUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutAttUnknown");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccSwitchOffOnGoing_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccSwitchOffOnGoing");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccIntraEnbLb_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccIntraEnbLb");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccUnspecified");
    private final static QName _LteHoStatsRowWsIntraEnbOutSuccUnknown_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraEnbOutSuccUnknown");
    private final static QName _LteHoStatsRowWsIntraFreqIntraEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqIntraEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsInterFreqIntraEnbOutPrepAtt_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqIntraEnbOutPrepAtt");
    private final static QName _LteHoStatsRowWsIntraFreqIntraEnbOutExecSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "IntraFreqIntraEnbOutExecSucc");
    private final static QName _LteHoStatsRowWsInterFreqIntraEnbOutExecSucc_QNAME = new QName("http://Airspan.Netspan.WebServices", "InterFreqIntraEnbOutExecSucc");
    private final static QName _LteERabPerQciStatsRowWsInitialAttemptedToSetup_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialAttemptedToSetup");
    private final static QName _LteERabPerQciStatsRowWsSuccessfullyEstablished_QNAME = new QName("http://Airspan.Netspan.WebServices", "SuccessfullyEstablished");
    private final static QName _LteERabPerQciStatsRowWsAdditionalAttemptedToSetup_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalAttemptedToSetup");
    private final static QName _LteERabPerQciStatsRowWsAdditionalSuccessfullyEstablished_QNAME = new QName("http://Airspan.Netspan.WebServices", "AdditionalSuccessfullyEstablished");
    private final static QName _LteERabPerQciStatsRowWsMeanERabSetupTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MeanERabSetupTime");
    private final static QName _LteERabPerQciStatsRowWsMaxERabSetupTime_QNAME = new QName("http://Airspan.Netspan.WebServices", "MaxERabSetupTime");
    private final static QName _LteERabPerQciStatsRowWsReqToReleasePerQci_QNAME = new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerQci");
    private final static QName _LteERabPerQciStatsRowWsAttemptedToRelease_QNAME = new QName("http://Airspan.Netspan.WebServices", "AttemptedToRelease");
    private final static QName _LteERabPerQciStatsRowWsSuccessfullyReleased_QNAME = new QName("http://Airspan.Netspan.WebServices", "SuccessfullyReleased");
    private final static QName _LteERabPerQciStatsRowWsNumberOfReleasedActive_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfReleasedActive");
    private final static QName _LteERabPerQciStatsRowWsAttemptedToModifyQos_QNAME = new QName("http://Airspan.Netspan.WebServices", "AttemptedToModifyQos");
    private final static QName _LteERabPerQciStatsRowWsSuccessfullyModifiedQos_QNAME = new QName("http://Airspan.Netspan.WebServices", "SuccessfullyModifiedQos");
    private final static QName _LteERabPerQciStatsRowWsInSessionActivityTimeForERab_QNAME = new QName("http://Airspan.Netspan.WebServices", "InSessionActivityTimeForERab");
    private final static QName _LteERabPerQciStatsRowWsSimultaneousERabAvg_QNAME = new QName("http://Airspan.Netspan.WebServices", "SimultaneousERabAvg");
    private final static QName _LteERabPerQciStatsRowWsSimultaneousERabMax_QNAME = new QName("http://Airspan.Netspan.WebServices", "SimultaneousERabMax");
    private final static QName _LteERabPerQciStatsRowWsNumberOfReleasedActiveNonActive_QNAME = new QName("http://Airspan.Netspan.WebServices", "NumberOfReleasedActiveNonActive");
    private final static QName _LteERabStatsRowWsInitialAttemptedToSetupSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialAttemptedToSetupSum");
    private final static QName _LteERabStatsRowWsInitialSuccessfullyEstablishedSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialSuccessfullyEstablishedSum");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupSum_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupSum");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupRadioResUnavailable_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupRadioResUnavailable");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupRadIntProcFailure_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupRadIntProcFailure");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupInvalidQosCombination_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupInvalidQosCombination");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupMultiERabIdInstances_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupMultiERabIdInstances");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupQciValNotSupported_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupQciValNotSupported");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupS1IntraSysHOTriggered_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupS1IntraSysHOTriggered");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupS1InterSysHOTriggered_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupS1InterSysHOTriggered");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupX2HOTriggered_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupX2HOTriggered");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupTransportSrcUnavailable_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupTransportSrcUnavailable");
    private final static QName _LteERabStatsRowWsInitialFailedToSetupCauseUnspecified_QNAME = new QName("http://Airspan.Netspan.WebServices", "InitialFailedToSetupCauseUnspecified");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Netspan.NBI_15_2.Statistics
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetRaw }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetRaw createUeAssociatedLogicalS1ConnectionGetRaw() {
        return new UeAssociatedLogicalS1ConnectionGetRaw();
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetRawResponse }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetRawResponse createUeAssociatedLogicalS1ConnectionGetRawResponse() {
        return new UeAssociatedLogicalS1ConnectionGetRawResponse();
    }

    /**
     * Create an instance of {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     * 
     */
    public StatsLteUeAssociatedLogicalS1ConnectionResponse createStatsLteUeAssociatedLogicalS1ConnectionResponse() {
        return new StatsLteUeAssociatedLogicalS1ConnectionResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetHourly }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetHourly createUeAssociatedLogicalS1ConnectionGetHourly() {
        return new UeAssociatedLogicalS1ConnectionGetHourly();
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetHourlyResponse }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetHourlyResponse createUeAssociatedLogicalS1ConnectionGetHourlyResponse() {
        return new UeAssociatedLogicalS1ConnectionGetHourlyResponse();
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetDaily }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetDaily createUeAssociatedLogicalS1ConnectionGetDaily() {
        return new UeAssociatedLogicalS1ConnectionGetDaily();
    }

    /**
     * Create an instance of {@link UeAssociatedLogicalS1ConnectionGetDailyResponse }
     * 
     */
    public UeAssociatedLogicalS1ConnectionGetDailyResponse createUeAssociatedLogicalS1ConnectionGetDailyResponse() {
        return new UeAssociatedLogicalS1ConnectionGetDailyResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosRawGet }
     * 
     */
    public CellLevelRadioBearerQosRawGet createCellLevelRadioBearerQosRawGet() {
        return new CellLevelRadioBearerQosRawGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosRawGetResponse }
     * 
     */
    public CellLevelRadioBearerQosRawGetResponse createCellLevelRadioBearerQosRawGetResponse() {
        return new CellLevelRadioBearerQosRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteCellLevelRadioBearerQosResponse }
     * 
     */
    public StatsLteCellLevelRadioBearerQosResponse createStatsLteCellLevelRadioBearerQosResponse() {
        return new StatsLteCellLevelRadioBearerQosResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosHourlyGet }
     * 
     */
    public CellLevelRadioBearerQosHourlyGet createCellLevelRadioBearerQosHourlyGet() {
        return new CellLevelRadioBearerQosHourlyGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosHourlyGetResponse }
     * 
     */
    public CellLevelRadioBearerQosHourlyGetResponse createCellLevelRadioBearerQosHourlyGetResponse() {
        return new CellLevelRadioBearerQosHourlyGetResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosDailyGet }
     * 
     */
    public CellLevelRadioBearerQosDailyGet createCellLevelRadioBearerQosDailyGet() {
        return new CellLevelRadioBearerQosDailyGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosDailyGetResponse }
     * 
     */
    public CellLevelRadioBearerQosDailyGetResponse createCellLevelRadioBearerQosDailyGetResponse() {
        return new CellLevelRadioBearerQosDailyGetResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciRawGet }
     * 
     */
    public CellLevelRadioBearerQosPerQciRawGet createCellLevelRadioBearerQosPerQciRawGet() {
        return new CellLevelRadioBearerQosPerQciRawGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciRawGetResponse }
     * 
     */
    public CellLevelRadioBearerQosPerQciRawGetResponse createCellLevelRadioBearerQosPerQciRawGetResponse() {
        return new CellLevelRadioBearerQosPerQciRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     * 
     */
    public StatsLteCellLevelRadioBearerQosPerQciResponse createStatsLteCellLevelRadioBearerQosPerQciResponse() {
        return new StatsLteCellLevelRadioBearerQosPerQciResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciHourlyGet }
     * 
     */
    public CellLevelRadioBearerQosPerQciHourlyGet createCellLevelRadioBearerQosPerQciHourlyGet() {
        return new CellLevelRadioBearerQosPerQciHourlyGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciHourlyGetResponse }
     * 
     */
    public CellLevelRadioBearerQosPerQciHourlyGetResponse createCellLevelRadioBearerQosPerQciHourlyGetResponse() {
        return new CellLevelRadioBearerQosPerQciHourlyGetResponse();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciDailyGet }
     * 
     */
    public CellLevelRadioBearerQosPerQciDailyGet createCellLevelRadioBearerQosPerQciDailyGet() {
        return new CellLevelRadioBearerQosPerQciDailyGet();
    }

    /**
     * Create an instance of {@link CellLevelRadioBearerQosPerQciDailyGetResponse }
     * 
     */
    public CellLevelRadioBearerQosPerQciDailyGetResponse createCellLevelRadioBearerQosPerQciDailyGetResponse() {
        return new CellLevelRadioBearerQosPerQciDailyGetResponse();
    }

    /**
     * Create an instance of {@link ErabRawGet }
     * 
     */
    public ErabRawGet createErabRawGet() {
        return new ErabRawGet();
    }

    /**
     * Create an instance of {@link ErabRawGetResponse }
     * 
     */
    public ErabRawGetResponse createErabRawGetResponse() {
        return new ErabRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteErabResponse }
     * 
     */
    public StatsLteErabResponse createStatsLteErabResponse() {
        return new StatsLteErabResponse();
    }

    /**
     * Create an instance of {@link ErabHourlyGet }
     * 
     */
    public ErabHourlyGet createErabHourlyGet() {
        return new ErabHourlyGet();
    }

    /**
     * Create an instance of {@link ErabHourlyGetResponse }
     * 
     */
    public ErabHourlyGetResponse createErabHourlyGetResponse() {
        return new ErabHourlyGetResponse();
    }

    /**
     * Create an instance of {@link ErabDailyGet }
     * 
     */
    public ErabDailyGet createErabDailyGet() {
        return new ErabDailyGet();
    }

    /**
     * Create an instance of {@link ErabDailyGetResponse }
     * 
     */
    public ErabDailyGetResponse createErabDailyGetResponse() {
        return new ErabDailyGetResponse();
    }

    /**
     * Create an instance of {@link ErabPerQciRawGet }
     * 
     */
    public ErabPerQciRawGet createErabPerQciRawGet() {
        return new ErabPerQciRawGet();
    }

    /**
     * Create an instance of {@link ErabPerQciRawGetResponse }
     * 
     */
    public ErabPerQciRawGetResponse createErabPerQciRawGetResponse() {
        return new ErabPerQciRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteErabPerQciResponse }
     * 
     */
    public StatsLteErabPerQciResponse createStatsLteErabPerQciResponse() {
        return new StatsLteErabPerQciResponse();
    }

    /**
     * Create an instance of {@link ErabPerQciHourlyGet }
     * 
     */
    public ErabPerQciHourlyGet createErabPerQciHourlyGet() {
        return new ErabPerQciHourlyGet();
    }

    /**
     * Create an instance of {@link ErabPerQciHourlyGetResponse }
     * 
     */
    public ErabPerQciHourlyGetResponse createErabPerQciHourlyGetResponse() {
        return new ErabPerQciHourlyGetResponse();
    }

    /**
     * Create an instance of {@link ErabPerQciDailyGet }
     * 
     */
    public ErabPerQciDailyGet createErabPerQciDailyGet() {
        return new ErabPerQciDailyGet();
    }

    /**
     * Create an instance of {@link ErabPerQciDailyGetResponse }
     * 
     */
    public ErabPerQciDailyGetResponse createErabPerQciDailyGetResponse() {
        return new ErabPerQciDailyGetResponse();
    }

    /**
     * Create an instance of {@link HandoverRawGet }
     * 
     */
    public HandoverRawGet createHandoverRawGet() {
        return new HandoverRawGet();
    }

    /**
     * Create an instance of {@link HandoverRawGetResponse }
     * 
     */
    public HandoverRawGetResponse createHandoverRawGetResponse() {
        return new HandoverRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteHandoverResponse }
     * 
     */
    public StatsLteHandoverResponse createStatsLteHandoverResponse() {
        return new StatsLteHandoverResponse();
    }

    /**
     * Create an instance of {@link HandoverHourlyGet }
     * 
     */
    public HandoverHourlyGet createHandoverHourlyGet() {
        return new HandoverHourlyGet();
    }

    /**
     * Create an instance of {@link HandoverHourlyGetResponse }
     * 
     */
    public HandoverHourlyGetResponse createHandoverHourlyGetResponse() {
        return new HandoverHourlyGetResponse();
    }

    /**
     * Create an instance of {@link HandoverDailyGet }
     * 
     */
    public HandoverDailyGet createHandoverDailyGet() {
        return new HandoverDailyGet();
    }

    /**
     * Create an instance of {@link HandoverDailyGetResponse }
     * 
     */
    public HandoverDailyGetResponse createHandoverDailyGetResponse() {
        return new HandoverDailyGetResponse();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellRawGet }
     * 
     */
    public HandoverPerTargetCellRawGet createHandoverPerTargetCellRawGet() {
        return new HandoverPerTargetCellRawGet();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellRawGetResponse }
     * 
     */
    public HandoverPerTargetCellRawGetResponse createHandoverPerTargetCellRawGetResponse() {
        return new HandoverPerTargetCellRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteHandoverPerTargetCellResponse }
     * 
     */
    public StatsLteHandoverPerTargetCellResponse createStatsLteHandoverPerTargetCellResponse() {
        return new StatsLteHandoverPerTargetCellResponse();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellHourlyGet }
     * 
     */
    public HandoverPerTargetCellHourlyGet createHandoverPerTargetCellHourlyGet() {
        return new HandoverPerTargetCellHourlyGet();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellHourlyGetResponse }
     * 
     */
    public HandoverPerTargetCellHourlyGetResponse createHandoverPerTargetCellHourlyGetResponse() {
        return new HandoverPerTargetCellHourlyGetResponse();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellDailyGet }
     * 
     */
    public HandoverPerTargetCellDailyGet createHandoverPerTargetCellDailyGet() {
        return new HandoverPerTargetCellDailyGet();
    }

    /**
     * Create an instance of {@link HandoverPerTargetCellDailyGetResponse }
     * 
     */
    public HandoverPerTargetCellDailyGetResponse createHandoverPerTargetCellDailyGetResponse() {
        return new HandoverPerTargetCellDailyGetResponse();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationRawGet }
     * 
     */
    public RadioResourceUtilizationRawGet createRadioResourceUtilizationRawGet() {
        return new RadioResourceUtilizationRawGet();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationRawGetResponse }
     * 
     */
    public RadioResourceUtilizationRawGetResponse createRadioResourceUtilizationRawGetResponse() {
        return new RadioResourceUtilizationRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRadioResourceUtilizationResponse }
     * 
     */
    public StatsLteRadioResourceUtilizationResponse createStatsLteRadioResourceUtilizationResponse() {
        return new StatsLteRadioResourceUtilizationResponse();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationHourlyGet }
     * 
     */
    public RadioResourceUtilizationHourlyGet createRadioResourceUtilizationHourlyGet() {
        return new RadioResourceUtilizationHourlyGet();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationHourlyGetResponse }
     * 
     */
    public RadioResourceUtilizationHourlyGetResponse createRadioResourceUtilizationHourlyGetResponse() {
        return new RadioResourceUtilizationHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationDailyGet }
     * 
     */
    public RadioResourceUtilizationDailyGet createRadioResourceUtilizationDailyGet() {
        return new RadioResourceUtilizationDailyGet();
    }

    /**
     * Create an instance of {@link RadioResourceUtilizationDailyGetResponse }
     * 
     */
    public RadioResourceUtilizationDailyGetResponse createRadioResourceUtilizationDailyGetResponse() {
        return new RadioResourceUtilizationDailyGetResponse();
    }

    /**
     * Create an instance of {@link RrcConnectionRawGet }
     * 
     */
    public RrcConnectionRawGet createRrcConnectionRawGet() {
        return new RrcConnectionRawGet();
    }

    /**
     * Create an instance of {@link RrcConnectionRawGetResponse }
     * 
     */
    public RrcConnectionRawGetResponse createRrcConnectionRawGetResponse() {
        return new RrcConnectionRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRrcConnectionResponse }
     * 
     */
    public StatsLteRrcConnectionResponse createStatsLteRrcConnectionResponse() {
        return new StatsLteRrcConnectionResponse();
    }

    /**
     * Create an instance of {@link RrcConnectionHourlyGet }
     * 
     */
    public RrcConnectionHourlyGet createRrcConnectionHourlyGet() {
        return new RrcConnectionHourlyGet();
    }

    /**
     * Create an instance of {@link RrcConnectionHourlyGetResponse }
     * 
     */
    public RrcConnectionHourlyGetResponse createRrcConnectionHourlyGetResponse() {
        return new RrcConnectionHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RrcConnectionDailyGet }
     * 
     */
    public RrcConnectionDailyGet createRrcConnectionDailyGet() {
        return new RrcConnectionDailyGet();
    }

    /**
     * Create an instance of {@link RrcConnectionDailyGetResponse }
     * 
     */
    public RrcConnectionDailyGetResponse createRrcConnectionDailyGetResponse() {
        return new RrcConnectionDailyGetResponse();
    }

    /**
     * Create an instance of {@link RruPerQciRawGet }
     * 
     */
    public RruPerQciRawGet createRruPerQciRawGet() {
        return new RruPerQciRawGet();
    }

    /**
     * Create an instance of {@link RruPerQciRawGetResponse }
     * 
     */
    public RruPerQciRawGetResponse createRruPerQciRawGetResponse() {
        return new RruPerQciRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRruPerQciResponse }
     * 
     */
    public StatsLteRruPerQciResponse createStatsLteRruPerQciResponse() {
        return new StatsLteRruPerQciResponse();
    }

    /**
     * Create an instance of {@link RruPerQciHourlyGet }
     * 
     */
    public RruPerQciHourlyGet createRruPerQciHourlyGet() {
        return new RruPerQciHourlyGet();
    }

    /**
     * Create an instance of {@link RruPerQciHourlyGetResponse }
     * 
     */
    public RruPerQciHourlyGetResponse createRruPerQciHourlyGetResponse() {
        return new RruPerQciHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RruPerQciDailyGet }
     * 
     */
    public RruPerQciDailyGet createRruPerQciDailyGet() {
        return new RruPerQciDailyGet();
    }

    /**
     * Create an instance of {@link RruPerQciDailyGetResponse }
     * 
     */
    public RruPerQciDailyGetResponse createRruPerQciDailyGetResponse() {
        return new RruPerQciDailyGetResponse();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsRawGet }
     * 
     */
    public PositioningMeasurementsRawGet createPositioningMeasurementsRawGet() {
        return new PositioningMeasurementsRawGet();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsRawGetResponse }
     * 
     */
    public PositioningMeasurementsRawGetResponse createPositioningMeasurementsRawGetResponse() {
        return new PositioningMeasurementsRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLtePosMeasurementsResponse }
     * 
     */
    public StatsLtePosMeasurementsResponse createStatsLtePosMeasurementsResponse() {
        return new StatsLtePosMeasurementsResponse();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsHourlyGet }
     * 
     */
    public PositioningMeasurementsHourlyGet createPositioningMeasurementsHourlyGet() {
        return new PositioningMeasurementsHourlyGet();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsHourlyGetResponse }
     * 
     */
    public PositioningMeasurementsHourlyGetResponse createPositioningMeasurementsHourlyGetResponse() {
        return new PositioningMeasurementsHourlyGetResponse();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsDailyGet }
     * 
     */
    public PositioningMeasurementsDailyGet createPositioningMeasurementsDailyGet() {
        return new PositioningMeasurementsDailyGet();
    }

    /**
     * Create an instance of {@link PositioningMeasurementsDailyGetResponse }
     * 
     */
    public PositioningMeasurementsDailyGetResponse createPositioningMeasurementsDailyGetResponse() {
        return new PositioningMeasurementsDailyGetResponse();
    }

    /**
     * Create an instance of {@link LiteCompRawGet }
     * 
     */
    public LiteCompRawGet createLiteCompRawGet() {
        return new LiteCompRawGet();
    }

    /**
     * Create an instance of {@link LiteCompRawGetResponse }
     * 
     */
    public LiteCompRawGetResponse createLiteCompRawGetResponse() {
        return new LiteCompRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteLiteCompResponse }
     * 
     */
    public StatsLteLiteCompResponse createStatsLteLiteCompResponse() {
        return new StatsLteLiteCompResponse();
    }

    /**
     * Create an instance of {@link LiteCompHourlyGet }
     * 
     */
    public LiteCompHourlyGet createLiteCompHourlyGet() {
        return new LiteCompHourlyGet();
    }

    /**
     * Create an instance of {@link LiteCompHourlyGetResponse }
     * 
     */
    public LiteCompHourlyGetResponse createLiteCompHourlyGetResponse() {
        return new LiteCompHourlyGetResponse();
    }

    /**
     * Create an instance of {@link LiteCompDailyGet }
     * 
     */
    public LiteCompDailyGet createLiteCompDailyGet() {
        return new LiteCompDailyGet();
    }

    /**
     * Create an instance of {@link LiteCompDailyGetResponse }
     * 
     */
    public LiteCompDailyGetResponse createLiteCompDailyGetResponse() {
        return new LiteCompDailyGetResponse();
    }

    /**
     * Create an instance of {@link EquipmentMeasureRawGet }
     * 
     */
    public EquipmentMeasureRawGet createEquipmentMeasureRawGet() {
        return new EquipmentMeasureRawGet();
    }

    /**
     * Create an instance of {@link EquipmentMeasureRawGetResponse }
     * 
     */
    public EquipmentMeasureRawGetResponse createEquipmentMeasureRawGetResponse() {
        return new EquipmentMeasureRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteEquipmentMeasureResponse }
     * 
     */
    public StatsLteEquipmentMeasureResponse createStatsLteEquipmentMeasureResponse() {
        return new StatsLteEquipmentMeasureResponse();
    }

    /**
     * Create an instance of {@link EquipmentMeasureHourlyGet }
     * 
     */
    public EquipmentMeasureHourlyGet createEquipmentMeasureHourlyGet() {
        return new EquipmentMeasureHourlyGet();
    }

    /**
     * Create an instance of {@link EquipmentMeasureHourlyGetResponse }
     * 
     */
    public EquipmentMeasureHourlyGetResponse createEquipmentMeasureHourlyGetResponse() {
        return new EquipmentMeasureHourlyGetResponse();
    }

    /**
     * Create an instance of {@link EquipmentMeasureDailyGet }
     * 
     */
    public EquipmentMeasureDailyGet createEquipmentMeasureDailyGet() {
        return new EquipmentMeasureDailyGet();
    }

    /**
     * Create an instance of {@link EquipmentMeasureDailyGetResponse }
     * 
     */
    public EquipmentMeasureDailyGetResponse createEquipmentMeasureDailyGetResponse() {
        return new EquipmentMeasureDailyGetResponse();
    }

    /**
     * Create an instance of {@link RfMeasureRawGet }
     * 
     */
    public RfMeasureRawGet createRfMeasureRawGet() {
        return new RfMeasureRawGet();
    }

    /**
     * Create an instance of {@link RfMeasureRawGetResponse }
     * 
     */
    public RfMeasureRawGetResponse createRfMeasureRawGetResponse() {
        return new RfMeasureRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRfMeasureResponse }
     * 
     */
    public StatsLteRfMeasureResponse createStatsLteRfMeasureResponse() {
        return new StatsLteRfMeasureResponse();
    }

    /**
     * Create an instance of {@link RfMeasureHourlyGet }
     * 
     */
    public RfMeasureHourlyGet createRfMeasureHourlyGet() {
        return new RfMeasureHourlyGet();
    }

    /**
     * Create an instance of {@link RfMeasureHourlyGetResponse }
     * 
     */
    public RfMeasureHourlyGetResponse createRfMeasureHourlyGetResponse() {
        return new RfMeasureHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RfMeasureDailyGet }
     * 
     */
    public RfMeasureDailyGet createRfMeasureDailyGet() {
        return new RfMeasureDailyGet();
    }

    /**
     * Create an instance of {@link RfMeasureDailyGetResponse }
     * 
     */
    public RfMeasureDailyGetResponse createRfMeasureDailyGetResponse() {
        return new RfMeasureDailyGetResponse();
    }

    /**
     * Create an instance of {@link CarrierAggregationRawGet }
     * 
     */
    public CarrierAggregationRawGet createCarrierAggregationRawGet() {
        return new CarrierAggregationRawGet();
    }

    /**
     * Create an instance of {@link CarrierAggregationRawGetResponse }
     * 
     */
    public CarrierAggregationRawGetResponse createCarrierAggregationRawGetResponse() {
        return new CarrierAggregationRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteCarrierAggregationResponse }
     * 
     */
    public StatsLteCarrierAggregationResponse createStatsLteCarrierAggregationResponse() {
        return new StatsLteCarrierAggregationResponse();
    }

    /**
     * Create an instance of {@link CarrierAggregationHourlyGet }
     * 
     */
    public CarrierAggregationHourlyGet createCarrierAggregationHourlyGet() {
        return new CarrierAggregationHourlyGet();
    }

    /**
     * Create an instance of {@link CarrierAggregationHourlyGetResponse }
     * 
     */
    public CarrierAggregationHourlyGetResponse createCarrierAggregationHourlyGetResponse() {
        return new CarrierAggregationHourlyGetResponse();
    }

    /**
     * Create an instance of {@link CarrierAggregationDailyGet }
     * 
     */
    public CarrierAggregationDailyGet createCarrierAggregationDailyGet() {
        return new CarrierAggregationDailyGet();
    }

    /**
     * Create an instance of {@link CarrierAggregationDailyGetResponse }
     * 
     */
    public CarrierAggregationDailyGetResponse createCarrierAggregationDailyGetResponse() {
        return new CarrierAggregationDailyGetResponse();
    }

    /**
     * Create an instance of {@link PagingRawGet }
     * 
     */
    public PagingRawGet createPagingRawGet() {
        return new PagingRawGet();
    }

    /**
     * Create an instance of {@link PagingRawGetResponse }
     * 
     */
    public PagingRawGetResponse createPagingRawGetResponse() {
        return new PagingRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLtePagingResponse }
     * 
     */
    public StatsLtePagingResponse createStatsLtePagingResponse() {
        return new StatsLtePagingResponse();
    }

    /**
     * Create an instance of {@link PagingHourlyGet }
     * 
     */
    public PagingHourlyGet createPagingHourlyGet() {
        return new PagingHourlyGet();
    }

    /**
     * Create an instance of {@link PagingHourlyGetResponse }
     * 
     */
    public PagingHourlyGetResponse createPagingHourlyGetResponse() {
        return new PagingHourlyGetResponse();
    }

    /**
     * Create an instance of {@link PagingDailyGet }
     * 
     */
    public PagingDailyGet createPagingDailyGet() {
        return new PagingDailyGet();
    }

    /**
     * Create an instance of {@link PagingDailyGetResponse }
     * 
     */
    public PagingDailyGetResponse createPagingDailyGetResponse() {
        return new PagingDailyGetResponse();
    }

    /**
     * Create an instance of {@link CsfbRawGet }
     * 
     */
    public CsfbRawGet createCsfbRawGet() {
        return new CsfbRawGet();
    }

    /**
     * Create an instance of {@link CsfbRawGetResponse }
     * 
     */
    public CsfbRawGetResponse createCsfbRawGetResponse() {
        return new CsfbRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteCsfbResponse }
     * 
     */
    public StatsLteCsfbResponse createStatsLteCsfbResponse() {
        return new StatsLteCsfbResponse();
    }

    /**
     * Create an instance of {@link CsfbHourlyGet }
     * 
     */
    public CsfbHourlyGet createCsfbHourlyGet() {
        return new CsfbHourlyGet();
    }

    /**
     * Create an instance of {@link CsfbHourlyGetResponse }
     * 
     */
    public CsfbHourlyGetResponse createCsfbHourlyGetResponse() {
        return new CsfbHourlyGetResponse();
    }

    /**
     * Create an instance of {@link CsfbDailyGet }
     * 
     */
    public CsfbDailyGet createCsfbDailyGet() {
        return new CsfbDailyGet();
    }

    /**
     * Create an instance of {@link CsfbDailyGetResponse }
     * 
     */
    public CsfbDailyGetResponse createCsfbDailyGetResponse() {
        return new CsfbDailyGetResponse();
    }

    /**
     * Create an instance of {@link EmbmsRawGet }
     * 
     */
    public EmbmsRawGet createEmbmsRawGet() {
        return new EmbmsRawGet();
    }

    /**
     * Create an instance of {@link EmbmsRawGetResponse }
     * 
     */
    public EmbmsRawGetResponse createEmbmsRawGetResponse() {
        return new EmbmsRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteEmbmsResponse }
     * 
     */
    public StatsLteEmbmsResponse createStatsLteEmbmsResponse() {
        return new StatsLteEmbmsResponse();
    }

    /**
     * Create an instance of {@link EmbmsHourlyGet }
     * 
     */
    public EmbmsHourlyGet createEmbmsHourlyGet() {
        return new EmbmsHourlyGet();
    }

    /**
     * Create an instance of {@link EmbmsHourlyGetResponse }
     * 
     */
    public EmbmsHourlyGetResponse createEmbmsHourlyGetResponse() {
        return new EmbmsHourlyGetResponse();
    }

    /**
     * Create an instance of {@link EmbmsDailyGet }
     * 
     */
    public EmbmsDailyGet createEmbmsDailyGet() {
        return new EmbmsDailyGet();
    }

    /**
     * Create an instance of {@link EmbmsDailyGetResponse }
     * 
     */
    public EmbmsDailyGetResponse createEmbmsDailyGetResponse() {
        return new EmbmsDailyGetResponse();
    }

    /**
     * Create an instance of {@link HarqRawGet }
     * 
     */
    public HarqRawGet createHarqRawGet() {
        return new HarqRawGet();
    }

    /**
     * Create an instance of {@link HarqRawGetResponse }
     * 
     */
    public HarqRawGetResponse createHarqRawGetResponse() {
        return new HarqRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteHarqResponse }
     * 
     */
    public StatsLteHarqResponse createStatsLteHarqResponse() {
        return new StatsLteHarqResponse();
    }

    /**
     * Create an instance of {@link HarqHourlyGet }
     * 
     */
    public HarqHourlyGet createHarqHourlyGet() {
        return new HarqHourlyGet();
    }

    /**
     * Create an instance of {@link HarqHourlyGetResponse }
     * 
     */
    public HarqHourlyGetResponse createHarqHourlyGetResponse() {
        return new HarqHourlyGetResponse();
    }

    /**
     * Create an instance of {@link HarqDailyGet }
     * 
     */
    public HarqDailyGet createHarqDailyGet() {
        return new HarqDailyGet();
    }

    /**
     * Create an instance of {@link HarqDailyGetResponse }
     * 
     */
    public HarqDailyGetResponse createHarqDailyGetResponse() {
        return new HarqDailyGetResponse();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingRawGet }
     * 
     */
    public IntraEnbLoadBalancingRawGet createIntraEnbLoadBalancingRawGet() {
        return new IntraEnbLoadBalancingRawGet();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingRawGetResponse }
     * 
     */
    public IntraEnbLoadBalancingRawGetResponse createIntraEnbLoadBalancingRawGetResponse() {
        return new IntraEnbLoadBalancingRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteIntraEnbLoadBalancingResponse }
     * 
     */
    public StatsLteIntraEnbLoadBalancingResponse createStatsLteIntraEnbLoadBalancingResponse() {
        return new StatsLteIntraEnbLoadBalancingResponse();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingHourlyGet }
     * 
     */
    public IntraEnbLoadBalancingHourlyGet createIntraEnbLoadBalancingHourlyGet() {
        return new IntraEnbLoadBalancingHourlyGet();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingHourlyGetResponse }
     * 
     */
    public IntraEnbLoadBalancingHourlyGetResponse createIntraEnbLoadBalancingHourlyGetResponse() {
        return new IntraEnbLoadBalancingHourlyGetResponse();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingDailyGet }
     * 
     */
    public IntraEnbLoadBalancingDailyGet createIntraEnbLoadBalancingDailyGet() {
        return new IntraEnbLoadBalancingDailyGet();
    }

    /**
     * Create an instance of {@link IntraEnbLoadBalancingDailyGetResponse }
     * 
     */
    public IntraEnbLoadBalancingDailyGetResponse createIntraEnbLoadBalancingDailyGetResponse() {
        return new IntraEnbLoadBalancingDailyGetResponse();
    }

    /**
     * Create an instance of {@link LinkAdaptationRawGet }
     * 
     */
    public LinkAdaptationRawGet createLinkAdaptationRawGet() {
        return new LinkAdaptationRawGet();
    }

    /**
     * Create an instance of {@link LinkAdaptationRawGetResponse }
     * 
     */
    public LinkAdaptationRawGetResponse createLinkAdaptationRawGetResponse() {
        return new LinkAdaptationRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteMcsResponse }
     * 
     */
    public StatsLteMcsResponse createStatsLteMcsResponse() {
        return new StatsLteMcsResponse();
    }

    /**
     * Create an instance of {@link LinkAdaptationHourlyGet }
     * 
     */
    public LinkAdaptationHourlyGet createLinkAdaptationHourlyGet() {
        return new LinkAdaptationHourlyGet();
    }

    /**
     * Create an instance of {@link LinkAdaptationHourlyGetResponse }
     * 
     */
    public LinkAdaptationHourlyGetResponse createLinkAdaptationHourlyGetResponse() {
        return new LinkAdaptationHourlyGetResponse();
    }

    /**
     * Create an instance of {@link LinkAdaptationDailyGet }
     * 
     */
    public LinkAdaptationDailyGet createLinkAdaptationDailyGet() {
        return new LinkAdaptationDailyGet();
    }

    /**
     * Create an instance of {@link LinkAdaptationDailyGetResponse }
     * 
     */
    public LinkAdaptationDailyGetResponse createLinkAdaptationDailyGetResponse() {
        return new LinkAdaptationDailyGetResponse();
    }

    /**
     * Create an instance of {@link MmeRawGet }
     * 
     */
    public MmeRawGet createMmeRawGet() {
        return new MmeRawGet();
    }

    /**
     * Create an instance of {@link MmeRawGetResponse }
     * 
     */
    public MmeRawGetResponse createMmeRawGetResponse() {
        return new MmeRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteMmeResponse }
     * 
     */
    public StatsLteMmeResponse createStatsLteMmeResponse() {
        return new StatsLteMmeResponse();
    }

    /**
     * Create an instance of {@link MmeHourlyGet }
     * 
     */
    public MmeHourlyGet createMmeHourlyGet() {
        return new MmeHourlyGet();
    }

    /**
     * Create an instance of {@link MmeHourlyGetResponse }
     * 
     */
    public MmeHourlyGetResponse createMmeHourlyGetResponse() {
        return new MmeHourlyGetResponse();
    }

    /**
     * Create an instance of {@link MmeDailyGet }
     * 
     */
    public MmeDailyGet createMmeDailyGet() {
        return new MmeDailyGet();
    }

    /**
     * Create an instance of {@link MmeDailyGetResponse }
     * 
     */
    public MmeDailyGetResponse createMmeDailyGetResponse() {
        return new MmeDailyGetResponse();
    }

    /**
     * Create an instance of {@link RachAccessDelayRawGet }
     * 
     */
    public RachAccessDelayRawGet createRachAccessDelayRawGet() {
        return new RachAccessDelayRawGet();
    }

    /**
     * Create an instance of {@link RachAccessDelayRawGetResponse }
     * 
     */
    public RachAccessDelayRawGetResponse createRachAccessDelayRawGetResponse() {
        return new RachAccessDelayRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRachAccessDelayResponse }
     * 
     */
    public StatsLteRachAccessDelayResponse createStatsLteRachAccessDelayResponse() {
        return new StatsLteRachAccessDelayResponse();
    }

    /**
     * Create an instance of {@link RachAccessDelayHourlyGet }
     * 
     */
    public RachAccessDelayHourlyGet createRachAccessDelayHourlyGet() {
        return new RachAccessDelayHourlyGet();
    }

    /**
     * Create an instance of {@link RachAccessDelayHourlyGetResponse }
     * 
     */
    public RachAccessDelayHourlyGetResponse createRachAccessDelayHourlyGetResponse() {
        return new RachAccessDelayHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RachAccessDelayDailyGet }
     * 
     */
    public RachAccessDelayDailyGet createRachAccessDelayDailyGet() {
        return new RachAccessDelayDailyGet();
    }

    /**
     * Create an instance of {@link RachAccessDelayDailyGetResponse }
     * 
     */
    public RachAccessDelayDailyGetResponse createRachAccessDelayDailyGetResponse() {
        return new RachAccessDelayDailyGetResponse();
    }

    /**
     * Create an instance of {@link RachPreamblesSentRawGet }
     * 
     */
    public RachPreamblesSentRawGet createRachPreamblesSentRawGet() {
        return new RachPreamblesSentRawGet();
    }

    /**
     * Create an instance of {@link RachPreamblesSentRawGetResponse }
     * 
     */
    public RachPreamblesSentRawGetResponse createRachPreamblesSentRawGetResponse() {
        return new RachPreamblesSentRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsLteRachPreamblesSentResponse }
     * 
     */
    public StatsLteRachPreamblesSentResponse createStatsLteRachPreamblesSentResponse() {
        return new StatsLteRachPreamblesSentResponse();
    }

    /**
     * Create an instance of {@link RachPreamblesSentHourlyGet }
     * 
     */
    public RachPreamblesSentHourlyGet createRachPreamblesSentHourlyGet() {
        return new RachPreamblesSentHourlyGet();
    }

    /**
     * Create an instance of {@link RachPreamblesSentHourlyGetResponse }
     * 
     */
    public RachPreamblesSentHourlyGetResponse createRachPreamblesSentHourlyGetResponse() {
        return new RachPreamblesSentHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RachPreamblesSentDailyGet }
     * 
     */
    public RachPreamblesSentDailyGet createRachPreamblesSentDailyGet() {
        return new RachPreamblesSentDailyGet();
    }

    /**
     * Create an instance of {@link RachPreamblesSentDailyGetResponse }
     * 
     */
    public RachPreamblesSentDailyGetResponse createRachPreamblesSentDailyGetResponse() {
        return new RachPreamblesSentDailyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440RfRawGet }
     * 
     */
    public Ib440RfRawGet createIb440RfRawGet() {
        return new Ib440RfRawGet();
    }

    /**
     * Create an instance of {@link Ib440RfRawGetResponse }
     * 
     */
    public Ib440RfRawGetResponse createIb440RfRawGetResponse() {
        return new Ib440RfRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsIb440RfResponse }
     * 
     */
    public StatsIb440RfResponse createStatsIb440RfResponse() {
        return new StatsIb440RfResponse();
    }

    /**
     * Create an instance of {@link Ib440RfHourlyGet }
     * 
     */
    public Ib440RfHourlyGet createIb440RfHourlyGet() {
        return new Ib440RfHourlyGet();
    }

    /**
     * Create an instance of {@link Ib440RfHourlyGetResponse }
     * 
     */
    public Ib440RfHourlyGetResponse createIb440RfHourlyGetResponse() {
        return new Ib440RfHourlyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440RfDailyGet }
     * 
     */
    public Ib440RfDailyGet createIb440RfDailyGet() {
        return new Ib440RfDailyGet();
    }

    /**
     * Create an instance of {@link Ib440RfDailyGetResponse }
     * 
     */
    public Ib440RfDailyGetResponse createIb440RfDailyGetResponse() {
        return new Ib440RfDailyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440IpRawGet }
     * 
     */
    public Ib440IpRawGet createIb440IpRawGet() {
        return new Ib440IpRawGet();
    }

    /**
     * Create an instance of {@link Ib440IpRawGetResponse }
     * 
     */
    public Ib440IpRawGetResponse createIb440IpRawGetResponse() {
        return new Ib440IpRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsIb440IpResponse }
     * 
     */
    public StatsIb440IpResponse createStatsIb440IpResponse() {
        return new StatsIb440IpResponse();
    }

    /**
     * Create an instance of {@link Ib440IpHourlyGet }
     * 
     */
    public Ib440IpHourlyGet createIb440IpHourlyGet() {
        return new Ib440IpHourlyGet();
    }

    /**
     * Create an instance of {@link Ib440IpHourlyGetResponse }
     * 
     */
    public Ib440IpHourlyGetResponse createIb440IpHourlyGetResponse() {
        return new Ib440IpHourlyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440IpDailyGet }
     * 
     */
    public Ib440IpDailyGet createIb440IpDailyGet() {
        return new Ib440IpDailyGet();
    }

    /**
     * Create an instance of {@link Ib440IpDailyGetResponse }
     * 
     */
    public Ib440IpDailyGetResponse createIb440IpDailyGetResponse() {
        return new Ib440IpDailyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciRawGet }
     * 
     */
    public Ib440QosPerQciRawGet createIb440QosPerQciRawGet() {
        return new Ib440QosPerQciRawGet();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciRawGetResponse }
     * 
     */
    public Ib440QosPerQciRawGetResponse createIb440QosPerQciRawGetResponse() {
        return new Ib440QosPerQciRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsIb440QosPerQciResponse }
     * 
     */
    public StatsIb440QosPerQciResponse createStatsIb440QosPerQciResponse() {
        return new StatsIb440QosPerQciResponse();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciHourlyGet }
     * 
     */
    public Ib440QosPerQciHourlyGet createIb440QosPerQciHourlyGet() {
        return new Ib440QosPerQciHourlyGet();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciHourlyGetResponse }
     * 
     */
    public Ib440QosPerQciHourlyGetResponse createIb440QosPerQciHourlyGetResponse() {
        return new Ib440QosPerQciHourlyGetResponse();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciDailyGet }
     * 
     */
    public Ib440QosPerQciDailyGet createIb440QosPerQciDailyGet() {
        return new Ib440QosPerQciDailyGet();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciDailyGetResponse }
     * 
     */
    public Ib440QosPerQciDailyGetResponse createIb440QosPerQciDailyGetResponse() {
        return new Ib440QosPerQciDailyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceRawGet }
     * 
     */
    public BsIbBaseAirInterfaceRawGet createBsIbBaseAirInterfaceRawGet() {
        return new BsIbBaseAirInterfaceRawGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceRawGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceRawGetResponse createBsIbBaseAirInterfaceRawGetResponse() {
        return new BsIbBaseAirInterfaceRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsBsIbBaseAirInterfaceResponse }
     * 
     */
    public StatsBsIbBaseAirInterfaceResponse createStatsBsIbBaseAirInterfaceResponse() {
        return new StatsBsIbBaseAirInterfaceResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceHourlyGet }
     * 
     */
    public BsIbBaseAirInterfaceHourlyGet createBsIbBaseAirInterfaceHourlyGet() {
        return new BsIbBaseAirInterfaceHourlyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceHourlyGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceHourlyGetResponse createBsIbBaseAirInterfaceHourlyGetResponse() {
        return new BsIbBaseAirInterfaceHourlyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceDailyGet }
     * 
     */
    public BsIbBaseAirInterfaceDailyGet createBsIbBaseAirInterfaceDailyGet() {
        return new BsIbBaseAirInterfaceDailyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceDailyGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceDailyGetResponse createBsIbBaseAirInterfaceDailyGetResponse() {
        return new BsIbBaseAirInterfaceDailyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageRawGet }
     * 
     */
    public BsIbBaseAirInterfaceUsageRawGet createBsIbBaseAirInterfaceUsageRawGet() {
        return new BsIbBaseAirInterfaceUsageRawGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageRawGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceUsageRawGetResponse createBsIbBaseAirInterfaceUsageRawGetResponse() {
        return new BsIbBaseAirInterfaceUsageRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsBsIbBaseAirInterfaceUsageResponse }
     * 
     */
    public StatsBsIbBaseAirInterfaceUsageResponse createStatsBsIbBaseAirInterfaceUsageResponse() {
        return new StatsBsIbBaseAirInterfaceUsageResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageHourlyGet }
     * 
     */
    public BsIbBaseAirInterfaceUsageHourlyGet createBsIbBaseAirInterfaceUsageHourlyGet() {
        return new BsIbBaseAirInterfaceUsageHourlyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageHourlyGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceUsageHourlyGetResponse createBsIbBaseAirInterfaceUsageHourlyGetResponse() {
        return new BsIbBaseAirInterfaceUsageHourlyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageDailyGet }
     * 
     */
    public BsIbBaseAirInterfaceUsageDailyGet createBsIbBaseAirInterfaceUsageDailyGet() {
        return new BsIbBaseAirInterfaceUsageDailyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageDailyGetResponse }
     * 
     */
    public BsIbBaseAirInterfaceUsageDailyGetResponse createBsIbBaseAirInterfaceUsageDailyGetResponse() {
        return new BsIbBaseAirInterfaceUsageDailyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataRawGet }
     * 
     */
    public BsIbBaseTermDataRawGet createBsIbBaseTermDataRawGet() {
        return new BsIbBaseTermDataRawGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataRawGetResponse }
     * 
     */
    public BsIbBaseTermDataRawGetResponse createBsIbBaseTermDataRawGetResponse() {
        return new BsIbBaseTermDataRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsBsIbBaseTermDataResponse }
     * 
     */
    public StatsBsIbBaseTermDataResponse createStatsBsIbBaseTermDataResponse() {
        return new StatsBsIbBaseTermDataResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataHourlyGet }
     * 
     */
    public BsIbBaseTermDataHourlyGet createBsIbBaseTermDataHourlyGet() {
        return new BsIbBaseTermDataHourlyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataHourlyGetResponse }
     * 
     */
    public BsIbBaseTermDataHourlyGetResponse createBsIbBaseTermDataHourlyGetResponse() {
        return new BsIbBaseTermDataHourlyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataDailyGet }
     * 
     */
    public BsIbBaseTermDataDailyGet createBsIbBaseTermDataDailyGet() {
        return new BsIbBaseTermDataDailyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataDailyGetResponse }
     * 
     */
    public BsIbBaseTermDataDailyGetResponse createBsIbBaseTermDataDailyGetResponse() {
        return new BsIbBaseTermDataDailyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfRawGet }
     * 
     */
    public BsIbBaseTermRfRawGet createBsIbBaseTermRfRawGet() {
        return new BsIbBaseTermRfRawGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfRawGetResponse }
     * 
     */
    public BsIbBaseTermRfRawGetResponse createBsIbBaseTermRfRawGetResponse() {
        return new BsIbBaseTermRfRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsBsIbBaseTermRfResponse }
     * 
     */
    public StatsBsIbBaseTermRfResponse createStatsBsIbBaseTermRfResponse() {
        return new StatsBsIbBaseTermRfResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfHourlyGet }
     * 
     */
    public BsIbBaseTermRfHourlyGet createBsIbBaseTermRfHourlyGet() {
        return new BsIbBaseTermRfHourlyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfHourlyGetResponse }
     * 
     */
    public BsIbBaseTermRfHourlyGetResponse createBsIbBaseTermRfHourlyGetResponse() {
        return new BsIbBaseTermRfHourlyGetResponse();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfDailyGet }
     * 
     */
    public BsIbBaseTermRfDailyGet createBsIbBaseTermRfDailyGet() {
        return new BsIbBaseTermRfDailyGet();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfDailyGetResponse }
     * 
     */
    public BsIbBaseTermRfDailyGetResponse createBsIbBaseTermRfDailyGetResponse() {
        return new BsIbBaseTermRfDailyGetResponse();
    }

    /**
     * Create an instance of {@link ServerProcessRawGet }
     * 
     */
    public ServerProcessRawGet createServerProcessRawGet() {
        return new ServerProcessRawGet();
    }

    /**
     * Create an instance of {@link ServerProcessRawGetResponse }
     * 
     */
    public ServerProcessRawGetResponse createServerProcessRawGetResponse() {
        return new ServerProcessRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsServerProcessResponse }
     * 
     */
    public StatsServerProcessResponse createStatsServerProcessResponse() {
        return new StatsServerProcessResponse();
    }

    /**
     * Create an instance of {@link ServerProcessHourGet }
     * 
     */
    public ServerProcessHourGet createServerProcessHourGet() {
        return new ServerProcessHourGet();
    }

    /**
     * Create an instance of {@link ServerProcessHourGetResponse }
     * 
     */
    public ServerProcessHourGetResponse createServerProcessHourGetResponse() {
        return new ServerProcessHourGetResponse();
    }

    /**
     * Create an instance of {@link ServerProcessDayGet }
     * 
     */
    public ServerProcessDayGet createServerProcessDayGet() {
        return new ServerProcessDayGet();
    }

    /**
     * Create an instance of {@link ServerProcessDayGetResponse }
     * 
     */
    public ServerProcessDayGetResponse createServerProcessDayGetResponse() {
        return new ServerProcessDayGetResponse();
    }

    /**
     * Create an instance of {@link ServerDiskRawGet }
     * 
     */
    public ServerDiskRawGet createServerDiskRawGet() {
        return new ServerDiskRawGet();
    }

    /**
     * Create an instance of {@link ServerDiskRawGetResponse }
     * 
     */
    public ServerDiskRawGetResponse createServerDiskRawGetResponse() {
        return new ServerDiskRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsServerDiskResponse }
     * 
     */
    public StatsServerDiskResponse createStatsServerDiskResponse() {
        return new StatsServerDiskResponse();
    }

    /**
     * Create an instance of {@link ServerDiskHourGet }
     * 
     */
    public ServerDiskHourGet createServerDiskHourGet() {
        return new ServerDiskHourGet();
    }

    /**
     * Create an instance of {@link ServerDiskHourGetResponse }
     * 
     */
    public ServerDiskHourGetResponse createServerDiskHourGetResponse() {
        return new ServerDiskHourGetResponse();
    }

    /**
     * Create an instance of {@link ServerDiskDayGet }
     * 
     */
    public ServerDiskDayGet createServerDiskDayGet() {
        return new ServerDiskDayGet();
    }

    /**
     * Create an instance of {@link ServerDiskDayGetResponse }
     * 
     */
    public ServerDiskDayGetResponse createServerDiskDayGetResponse() {
        return new ServerDiskDayGetResponse();
    }

    /**
     * Create an instance of {@link RelayRawGet }
     * 
     */
    public RelayRawGet createRelayRawGet() {
        return new RelayRawGet();
    }

    /**
     * Create an instance of {@link RelayRawGetResponse }
     * 
     */
    public RelayRawGetResponse createRelayRawGetResponse() {
        return new RelayRawGetResponse();
    }

    /**
     * Create an instance of {@link StatsBsIRelayResponse }
     * 
     */
    public StatsBsIRelayResponse createStatsBsIRelayResponse() {
        return new StatsBsIRelayResponse();
    }

    /**
     * Create an instance of {@link RelayHourlyGet }
     * 
     */
    public RelayHourlyGet createRelayHourlyGet() {
        return new RelayHourlyGet();
    }

    /**
     * Create an instance of {@link RelayHourlyGetResponse }
     * 
     */
    public RelayHourlyGetResponse createRelayHourlyGetResponse() {
        return new RelayHourlyGetResponse();
    }

    /**
     * Create an instance of {@link RelayDailyGet }
     * 
     */
    public RelayDailyGet createRelayDailyGet() {
        return new RelayDailyGet();
    }

    /**
     * Create an instance of {@link RelayDailyGetResponse }
     * 
     */
    public RelayDailyGetResponse createRelayDailyGetResponse() {
        return new RelayDailyGetResponse();
    }

    /**
     * Create an instance of {@link WsResponse }
     * 
     */
    public WsResponse createWsResponse() {
        return new WsResponse();
    }

    /**
     * Create an instance of {@link NodeLteS1StatsResult }
     * 
     */
    public NodeLteS1StatsResult createNodeLteS1StatsResult() {
        return new NodeLteS1StatsResult();
    }

    /**
     * Create an instance of {@link LteS1StatsRowWs }
     * 
     */
    public LteS1StatsRowWs createLteS1StatsRowWs() {
        return new LteS1StatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRbStatsResult }
     * 
     */
    public NodeLteRbStatsResult createNodeLteRbStatsResult() {
        return new NodeLteRbStatsResult();
    }

    /**
     * Create an instance of {@link LteRbStatsRowWs }
     * 
     */
    public LteRbStatsRowWs createLteRbStatsRowWs() {
        return new LteRbStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRbPerQciStatsResult }
     * 
     */
    public NodeLteRbPerQciStatsResult createNodeLteRbPerQciStatsResult() {
        return new NodeLteRbPerQciStatsResult();
    }

    /**
     * Create an instance of {@link LteRbPerQciStatsRowWs }
     * 
     */
    public LteRbPerQciStatsRowWs createLteRbPerQciStatsRowWs() {
        return new LteRbPerQciStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteERabStatsResult }
     * 
     */
    public NodeLteERabStatsResult createNodeLteERabStatsResult() {
        return new NodeLteERabStatsResult();
    }

    /**
     * Create an instance of {@link LteERabStatsRowWs }
     * 
     */
    public LteERabStatsRowWs createLteERabStatsRowWs() {
        return new LteERabStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteERabPerQciStatsResult }
     * 
     */
    public NodeLteERabPerQciStatsResult createNodeLteERabPerQciStatsResult() {
        return new NodeLteERabPerQciStatsResult();
    }

    /**
     * Create an instance of {@link LteERabPerQciStatsRowWs }
     * 
     */
    public LteERabPerQciStatsRowWs createLteERabPerQciStatsRowWs() {
        return new LteERabPerQciStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteHoStatsResult }
     * 
     */
    public NodeLteHoStatsResult createNodeLteHoStatsResult() {
        return new NodeLteHoStatsResult();
    }

    /**
     * Create an instance of {@link LteHoStatsRowWs }
     * 
     */
    public LteHoStatsRowWs createLteHoStatsRowWs() {
        return new LteHoStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLtePerCellHoStatsResult }
     * 
     */
    public NodeLtePerCellHoStatsResult createNodeLtePerCellHoStatsResult() {
        return new NodeLtePerCellHoStatsResult();
    }

    /**
     * Create an instance of {@link LtePerCellHoStatsRowWs }
     * 
     */
    public LtePerCellHoStatsRowWs createLtePerCellHoStatsRowWs() {
        return new LtePerCellHoStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRruStatsResult }
     * 
     */
    public NodeLteRruStatsResult createNodeLteRruStatsResult() {
        return new NodeLteRruStatsResult();
    }

    /**
     * Create an instance of {@link LteRruStatsRowWs }
     * 
     */
    public LteRruStatsRowWs createLteRruStatsRowWs() {
        return new LteRruStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRrcStatsResult }
     * 
     */
    public NodeLteRrcStatsResult createNodeLteRrcStatsResult() {
        return new NodeLteRrcStatsResult();
    }

    /**
     * Create an instance of {@link LteRrcStatsRowWs }
     * 
     */
    public LteRrcStatsRowWs createLteRrcStatsRowWs() {
        return new LteRrcStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRruPerQciStatsResult }
     * 
     */
    public NodeLteRruPerQciStatsResult createNodeLteRruPerQciStatsResult() {
        return new NodeLteRruPerQciStatsResult();
    }

    /**
     * Create an instance of {@link LteRruPerQciStatsRowWs }
     * 
     */
    public LteRruPerQciStatsRowWs createLteRruPerQciStatsRowWs() {
        return new LteRruPerQciStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLtePosMeasurementsStatsResult }
     * 
     */
    public NodeLtePosMeasurementsStatsResult createNodeLtePosMeasurementsStatsResult() {
        return new NodeLtePosMeasurementsStatsResult();
    }

    /**
     * Create an instance of {@link LtePosMeasurementsStatsRowWs }
     * 
     */
    public LtePosMeasurementsStatsRowWs createLtePosMeasurementsStatsRowWs() {
        return new LtePosMeasurementsStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteLiteCompStatsResult }
     * 
     */
    public NodeLteLiteCompStatsResult createNodeLteLiteCompStatsResult() {
        return new NodeLteLiteCompStatsResult();
    }

    /**
     * Create an instance of {@link LteLiteCompStatsRowWs }
     * 
     */
    public LteLiteCompStatsRowWs createLteLiteCompStatsRowWs() {
        return new LteLiteCompStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteEquipMeasStatsResult }
     * 
     */
    public NodeLteEquipMeasStatsResult createNodeLteEquipMeasStatsResult() {
        return new NodeLteEquipMeasStatsResult();
    }

    /**
     * Create an instance of {@link LteEquipMeasStatsRowWs }
     * 
     */
    public LteEquipMeasStatsRowWs createLteEquipMeasStatsRowWs() {
        return new LteEquipMeasStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRfMeasStatsResult }
     * 
     */
    public NodeLteRfMeasStatsResult createNodeLteRfMeasStatsResult() {
        return new NodeLteRfMeasStatsResult();
    }

    /**
     * Create an instance of {@link LteRfMeasStatsRowWs }
     * 
     */
    public LteRfMeasStatsRowWs createLteRfMeasStatsRowWs() {
        return new LteRfMeasStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteCarrAggreStatsResult }
     * 
     */
    public NodeLteCarrAggreStatsResult createNodeLteCarrAggreStatsResult() {
        return new NodeLteCarrAggreStatsResult();
    }

    /**
     * Create an instance of {@link LteCarrAggreStatsRowWs }
     * 
     */
    public LteCarrAggreStatsRowWs createLteCarrAggreStatsRowWs() {
        return new LteCarrAggreStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLtePagingStatsResult }
     * 
     */
    public NodeLtePagingStatsResult createNodeLtePagingStatsResult() {
        return new NodeLtePagingStatsResult();
    }

    /**
     * Create an instance of {@link LtePagingStatsRowWs }
     * 
     */
    public LtePagingStatsRowWs createLtePagingStatsRowWs() {
        return new LtePagingStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteCsfbStatsResult }
     * 
     */
    public NodeLteCsfbStatsResult createNodeLteCsfbStatsResult() {
        return new NodeLteCsfbStatsResult();
    }

    /**
     * Create an instance of {@link LteCsfbStatsRowWs }
     * 
     */
    public LteCsfbStatsRowWs createLteCsfbStatsRowWs() {
        return new LteCsfbStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteEmbmsStatsResult }
     * 
     */
    public NodeLteEmbmsStatsResult createNodeLteEmbmsStatsResult() {
        return new NodeLteEmbmsStatsResult();
    }

    /**
     * Create an instance of {@link LteEmbmsStatsRowWs }
     * 
     */
    public LteEmbmsStatsRowWs createLteEmbmsStatsRowWs() {
        return new LteEmbmsStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteHarqStatsResult }
     * 
     */
    public NodeLteHarqStatsResult createNodeLteHarqStatsResult() {
        return new NodeLteHarqStatsResult();
    }

    /**
     * Create an instance of {@link LteHarqStatsRowWs }
     * 
     */
    public LteHarqStatsRowWs createLteHarqStatsRowWs() {
        return new LteHarqStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteIntraEnbLbStatsResult }
     * 
     */
    public NodeLteIntraEnbLbStatsResult createNodeLteIntraEnbLbStatsResult() {
        return new NodeLteIntraEnbLbStatsResult();
    }

    /**
     * Create an instance of {@link LteIntraEnbLbStatsRowWs }
     * 
     */
    public LteIntraEnbLbStatsRowWs createLteIntraEnbLbStatsRowWs() {
        return new LteIntraEnbLbStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteMcsStatsResult }
     * 
     */
    public NodeLteMcsStatsResult createNodeLteMcsStatsResult() {
        return new NodeLteMcsStatsResult();
    }

    /**
     * Create an instance of {@link LteMcsStatsRowWs }
     * 
     */
    public LteMcsStatsRowWs createLteMcsStatsRowWs() {
        return new LteMcsStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteMmeStatsResult }
     * 
     */
    public NodeLteMmeStatsResult createNodeLteMmeStatsResult() {
        return new NodeLteMmeStatsResult();
    }

    /**
     * Create an instance of {@link LteMmeStatsRowWs }
     * 
     */
    public LteMmeStatsRowWs createLteMmeStatsRowWs() {
        return new LteMmeStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRachAccessDelayStatsResult }
     * 
     */
    public NodeLteRachAccessDelayStatsResult createNodeLteRachAccessDelayStatsResult() {
        return new NodeLteRachAccessDelayStatsResult();
    }

    /**
     * Create an instance of {@link LteRachAccessDelayStatsRowWs }
     * 
     */
    public LteRachAccessDelayStatsRowWs createLteRachAccessDelayStatsRowWs() {
        return new LteRachAccessDelayStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeLteRachPreamblesSentStatsResult }
     * 
     */
    public NodeLteRachPreamblesSentStatsResult createNodeLteRachPreamblesSentStatsResult() {
        return new NodeLteRachPreamblesSentStatsResult();
    }

    /**
     * Create an instance of {@link LteRachPreamblesSentStatsRowWs }
     * 
     */
    public LteRachPreamblesSentStatsRowWs createLteRachPreamblesSentStatsRowWs() {
        return new LteRachPreamblesSentStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeIb440RfStatsResult }
     * 
     */
    public NodeIb440RfStatsResult createNodeIb440RfStatsResult() {
        return new NodeIb440RfStatsResult();
    }

    /**
     * Create an instance of {@link Ib440RfStatsRowWs }
     * 
     */
    public Ib440RfStatsRowWs createIb440RfStatsRowWs() {
        return new Ib440RfStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeIb440IpStatsResult }
     * 
     */
    public NodeIb440IpStatsResult createNodeIb440IpStatsResult() {
        return new NodeIb440IpStatsResult();
    }

    /**
     * Create an instance of {@link Ib440IpStatsRowWs }
     * 
     */
    public Ib440IpStatsRowWs createIb440IpStatsRowWs() {
        return new Ib440IpStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeIb440QosPerQciStatsResult }
     * 
     */
    public NodeIb440QosPerQciStatsResult createNodeIb440QosPerQciStatsResult() {
        return new NodeIb440QosPerQciStatsResult();
    }

    /**
     * Create an instance of {@link Ib440QosPerQciStatsRowWs }
     * 
     */
    public Ib440QosPerQciStatsRowWs createIb440QosPerQciStatsRowWs() {
        return new Ib440QosPerQciStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeBsIbBaseAirInterfaceStatsResult }
     * 
     */
    public NodeBsIbBaseAirInterfaceStatsResult createNodeBsIbBaseAirInterfaceStatsResult() {
        return new NodeBsIbBaseAirInterfaceStatsResult();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceStatsRowWs }
     * 
     */
    public BsIbBaseAirInterfaceStatsRowWs createBsIbBaseAirInterfaceStatsRowWs() {
        return new BsIbBaseAirInterfaceStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeBsIbBaseAirInterfaceUsageStatsResult }
     * 
     */
    public NodeBsIbBaseAirInterfaceUsageStatsResult createNodeBsIbBaseAirInterfaceUsageStatsResult() {
        return new NodeBsIbBaseAirInterfaceUsageStatsResult();
    }

    /**
     * Create an instance of {@link BsIbBaseAirInterfaceUsageStatsRowWs }
     * 
     */
    public BsIbBaseAirInterfaceUsageStatsRowWs createBsIbBaseAirInterfaceUsageStatsRowWs() {
        return new BsIbBaseAirInterfaceUsageStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeBsIbBaseTermDataStatsResult }
     * 
     */
    public NodeBsIbBaseTermDataStatsResult createNodeBsIbBaseTermDataStatsResult() {
        return new NodeBsIbBaseTermDataStatsResult();
    }

    /**
     * Create an instance of {@link BsIbBaseTermDataStatsRowWs }
     * 
     */
    public BsIbBaseTermDataStatsRowWs createBsIbBaseTermDataStatsRowWs() {
        return new BsIbBaseTermDataStatsRowWs();
    }

    /**
     * Create an instance of {@link NodeBsIbBaseTermRfStatsResult }
     * 
     */
    public NodeBsIbBaseTermRfStatsResult createNodeBsIbBaseTermRfStatsResult() {
        return new NodeBsIbBaseTermRfStatsResult();
    }

    /**
     * Create an instance of {@link BsIbBaseTermRfStatsRowWs }
     * 
     */
    public BsIbBaseTermRfStatsRowWs createBsIbBaseTermRfStatsRowWs() {
        return new BsIbBaseTermRfStatsRowWs();
    }

    /**
     * Create an instance of {@link StatsServerProcessResult }
     * 
     */
    public StatsServerProcessResult createStatsServerProcessResult() {
        return new StatsServerProcessResult();
    }

    /**
     * Create an instance of {@link StatsServerProcessRowWs }
     * 
     */
    public StatsServerProcessRowWs createStatsServerProcessRowWs() {
        return new StatsServerProcessRowWs();
    }

    /**
     * Create an instance of {@link StatsServerDiskResult }
     * 
     */
    public StatsServerDiskResult createStatsServerDiskResult() {
        return new StatsServerDiskResult();
    }

    /**
     * Create an instance of {@link StatsServerDiskRowWs }
     * 
     */
    public StatsServerDiskRowWs createStatsServerDiskRowWs() {
        return new StatsServerDiskRowWs();
    }

    /**
     * Create an instance of {@link NodeBsIRelayStatsResult }
     * 
     */
    public NodeBsIRelayStatsResult createNodeBsIRelayStatsResult() {
        return new NodeBsIRelayStatsResult();
    }

    /**
     * Create an instance of {@link RelayStatsRowWs }
     * 
     */
    public RelayStatsRowWs createRelayStatsRowWs() {
        return new RelayStatsRowWs();
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
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioTxPower", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioTxPower(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioTxPower_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioPowerHeadroom", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioPowerHeadroom(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioPowerHeadroom_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioRssi", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioRssi(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioRssi_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioRsrp", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioRsrp(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioRsrp_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioRsrq", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioRsrq(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioRsrq_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioSinr", scope = RelayStatsRowWs.class)
    public JAXBElement<Double> createRelayStatsRowWsRadioSinr(Double value) {
        return new JAXBElement<Double>(_RelayStatsRowWsRadioSinr_QNAME, Double.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioSe", scope = RelayStatsRowWs.class)
    public JAXBElement<Double> createRelayStatsRowWsRadioSe(Double value) {
        return new JAXBElement<Double>(_RelayStatsRowWsRadioSe_QNAME, Double.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfInBytes", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfInBytes(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfInBytes_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfOutBytes", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfOutBytes(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfOutBytes_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfInDiscard", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfInDiscard(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfInDiscard_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfOutDiscard", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfOutDiscard(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfOutDiscard_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfInErrors", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfInErrors(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfInErrors_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IfOutErrors", scope = RelayStatsRowWs.class)
    public JAXBElement<Long> createRelayStatsRowWsIfOutErrors(Long value) {
        return new JAXBElement<Long>(_RelayStatsRowWsIfOutErrors_QNAME, Long.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioEci", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioEci(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioEci_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioEarfcn", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioEarfcn(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioEarfcn_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioTac", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioTac(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioTac_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioSccPci", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioSccPci(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioSccPci_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RadioPci", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsRadioPci(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsRadioPci_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DonorCellChangeCount", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsDonorCellChangeCount(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsDonorCellChangeCount_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Drm", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsDrm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsDrm_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HeadingAngle", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsHeadingAngle(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsHeadingAngle_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RankIndex", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRankIndex(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRankIndex_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci1", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsPci1(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsPci1_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci2", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsPci2(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsPci2_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Pci3", scope = RelayStatsRowWs.class)
    public JAXBElement<Integer> createRelayStatsRowWsPci3(Integer value) {
        return new JAXBElement<Integer>(_RelayStatsRowWsPci3_QNAME, Integer.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp1", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrp1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrp1_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp2", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrp2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrp2_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrp3", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrp3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrp3_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq1", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrq1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrq1_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq2", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrq2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrq2_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Rsrq3", scope = RelayStatsRowWs.class)
    public JAXBElement<BigDecimal> createRelayStatsRowWsRsrq3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelayStatsRowWsRsrq3_QNAME, BigDecimal.class, RelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = StatsServerDiskRowWs.class)
    public JAXBElement<Integer> createStatsServerDiskRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, StatsServerDiskRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AvailableAverageGb", scope = StatsServerDiskRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerDiskRowWsAvailableAverageGb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerDiskRowWsAvailableAverageGb_QNAME, BigDecimal.class, StatsServerDiskRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiskSizeGb", scope = StatsServerDiskRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerDiskRowWsDiskSizeGb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerDiskRowWsDiskSizeGb_QNAME, BigDecimal.class, StatsServerDiskRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SystemCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSystemCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSystemCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SystemMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSystemMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSystemMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsEventServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsEventServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EventServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsEventServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsEventServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ProvisioningServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsProvisioningServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsProvisioningServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ProvisioningServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsProvisioningServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsProvisioningServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiscoveryServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsDiscoveryServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsDiscoveryServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiscoveryServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsDiscoveryServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsDiscoveryServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SwMngrServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSwMngrServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSwMngrServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SwMngrServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSwMngrServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSwMngrServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ArchiveServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsArchiveServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsArchiveServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ArchiveServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsArchiveServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsArchiveServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsStatsServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsStatsServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "StatsServMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsStatsServMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsStatsServMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementServCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsManagementServCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsManagementServCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ManagementMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsManagementMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsManagementMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SqlCpuAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSqlCpuAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSqlCpuAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SqlMemoryMbAverage", scope = StatsServerProcessRowWs.class)
    public JAXBElement<BigDecimal> createStatsServerProcessRowWsSqlMemoryMbAverage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_StatsServerProcessRowWsSqlMemoryMbAverage_QNAME, BigDecimal.class, StatsServerProcessRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlRssi", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlRssi(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlRssi_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlRssi", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlRssi(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlRssi_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinr1", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinr1(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinr1_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinr3", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinr3(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinr3_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCinr", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlCinr(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlCinr_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlZoneIndex", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseTermRfStatsRowWsDlZoneIndex(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseTermRfStatsRowWsDlZoneIndex_QNAME, Integer.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlBitsPerSymbol", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<BigDecimal> createBsIbBaseTermRfStatsRowWsDlBitsPerSymbol(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BsIbBaseTermRfStatsRowWsDlBitsPerSymbol_QNAME, BigDecimal.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlBitsPerSymbol", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<BigDecimal> createBsIbBaseTermRfStatsRowWsUlBitsPerSymbol(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BsIbBaseTermRfStatsRowWsUlBitsPerSymbol_QNAME, BigDecimal.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinr", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinr(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinr_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MsTxPower", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsMsTxPower(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsMsTxPower_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxUlSubChannels", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseTermRfStatsRowWsMaxUlSubChannels(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseTermRfStatsRowWsMaxUlSubChannels_QNAME, Integer.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlRssiCh0", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlRssiCh0(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlRssiCh0_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlRssiCh1", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlRssiCh1(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlRssiCh1_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCinrCh0", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlCinrCh0(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlCinrCh0_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCinrCh1", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlCinrCh1(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlCinrCh1_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCinrMimoA", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlCinrMimoA(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlCinrMimoA_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlCinrMimoB", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsUlCinrMimoB(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsUlCinrMimoB_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlRssiCh0", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlRssiCh0(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlRssiCh0_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlRssiCh1", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlRssiCh1(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlRssiCh1_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinrCh0", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinrCh0(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinrCh0_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinrCh1", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinrCh1(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinrCh1_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinrMimoA", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinrMimoA(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinrMimoA_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlCinrMimoB", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermRfStatsRowWsDlCinrMimoB(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermRfStatsRowWsDlCinrMimoB_QNAME, Double.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AntennaDirectionValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AntennaDirection", scope = BsIbBaseTermRfStatsRowWs.class)
    public JAXBElement<AntennaDirectionValues> createBsIbBaseTermRfStatsRowWsAntennaDirection(AntennaDirectionValues value) {
        return new JAXBElement<AntennaDirectionValues>(_BsIbBaseTermRfStatsRowWsAntennaDirection_QNAME, AntennaDirectionValues.class, BsIbBaseTermRfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlBytes", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsUlBytes(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsUlBytes_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlBytes", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsDlBytes(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsDlBytes_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqUlAcks", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsHarqUlAcks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqUlAcks_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqUlNacks", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsHarqUlNacks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqUlNacks_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqDlAcks", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsHarqDlAcks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqDlAcks_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqDlNacks", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsHarqDlNacks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqDlNacks_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPackets", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsUlPackets(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsUlPackets_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlPackets", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsDlPackets(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsDlPackets_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlHarqLoss", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsUlHarqLoss(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsUlHarqLoss_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlHarqLoss", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseTermDataStatsRowWsDlHarqLoss(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsDlHarqLoss_QNAME, Double.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FtNullingQi", scope = BsIbBaseTermDataStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseTermDataStatsRowWsFtNullingQi(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseTermDataStatsRowWsFtNullingQi_QNAME, Integer.class, BsIbBaseTermDataStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlModQpsk12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlModQpsk12rep2", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep2(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep2_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlModQpsk12rep4", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep4(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep4_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlModQpsk12rep6", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep6(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk12Rep6_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlModQpsk34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlModQpsk34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod16Qam12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod16Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod16Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod64Qam12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod64Qam23", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam23(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam23_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod64Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod64Qam56", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam56(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod64Qam56_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod256Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMod256Qam56", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam56(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlMod256Qam56_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlFrameUtilization", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseAirInterfaceUsageStatsRowWsDlFrameUtilization(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseAirInterfaceUsageStatsRowWsDlFrameUtilization_QNAME, Integer.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlSubFrameSlots", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlSubFrameSlots(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlSubFrameSlots_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlUsedSubFrameSlots", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlUsedSubFrameSlots(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlUsedSubFrameSlots_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlFrameOverhead", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlFrameOverhead(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlFrameOverhead_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlSubframeSlotsMimoA", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoA(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoA_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlSubframeSlotsMimoB", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoB(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsMimoB_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlSubframeSlotsSiso", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsSiso(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsDlSubframeSlotsSiso_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlModQpsk12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlModQpsk12rep2", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep2(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep2_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlModQpsk12rep4", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep4(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep4_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlModQpsk12rep6", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep6(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk12Rep6_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlModQpsk34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlModQpsk34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod16Qam12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod16Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod16Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod64Qam12", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam12(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam12_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod64Qam23", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam23(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam23_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod64Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod64Qam56", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam56(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod64Qam56_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod256Qam34", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam34(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam34_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMod256Qam56", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam56(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlMod256Qam56_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlFrameUtilization", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseAirInterfaceUsageStatsRowWsUlFrameUtilization(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseAirInterfaceUsageStatsRowWsUlFrameUtilization_QNAME, Integer.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlSubFrameSlots", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlSubFrameSlots(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlSubFrameSlots_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlUsedSubFrameSlots", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlUsedSubFrameSlots(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlUsedSubFrameSlots_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlFrameOverhead", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlFrameOverhead(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlFrameOverhead_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlSubframeSlotsMimoA", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoA(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoA_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlSubframeSlotsMimoB", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoB(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsMimoB_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlSubframeSlotsSiso", scope = BsIbBaseAirInterfaceUsageStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsSiso(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceUsageStatsRowWsUlSubframeSlotsSiso_QNAME, Double.class, BsIbBaseAirInterfaceUsageStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlErrorPkts", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsUlErrorPkts(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsUlErrorPkts_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPkts", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsUlPkts(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsUlPkts_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlBytes", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsUlBytes(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsUlBytes_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlPkts", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsDlPkts(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsDlPkts_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlBytes", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsDlBytes(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsDlBytes_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqUlBursts", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqUlBursts(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsHarqUlBursts_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqUlAcks", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqUlAcks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqUlAcks_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqUlNacks", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqUlNacks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqUlNacks_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqDlBursts", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqDlBursts(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsHarqDlBursts_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqDlAcks", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqDlAcks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqDlAcks_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HarqDlNacks", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsHarqDlNacks(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsHarqDlNacks_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NoiseLevelLowCounter", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsNoiseLevelLowCounter(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsNoiseLevelLowCounter_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NoiseLevelMedCounter", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsNoiseLevelMedCounter(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsNoiseLevelMedCounter_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NoiseLevelHighCounter", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsNoiseLevelHighCounter(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsNoiseLevelHighCounter_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NoiseLevel", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsNoiseLevel(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsNoiseLevel_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PeakNoiseLevel", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsPeakNoiseLevel(Double value) {
        return new JAXBElement<Double>(_BsIbBaseAirInterfaceStatsRowWsPeakNoiseLevel_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlHarqLoss", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsUlHarqLoss(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsUlHarqLoss_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlHarqLoss", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Double> createBsIbBaseAirInterfaceStatsRowWsDlHarqLoss(Double value) {
        return new JAXBElement<Double>(_BsIbBaseTermDataStatsRowWsDlHarqLoss_QNAME, Double.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FbNullingQi", scope = BsIbBaseAirInterfaceStatsRowWs.class)
    public JAXBElement<Integer> createBsIbBaseAirInterfaceStatsRowWsFbNullingQi(Integer value) {
        return new JAXBElement<Integer>(_BsIbBaseAirInterfaceStatsRowWsFbNullingQi_QNAME, Integer.class, BsIbBaseAirInterfaceStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Packets", scope = Ib440QosPerQciStatsRowWs.class)
    public JAXBElement<Long> createIb440QosPerQciStatsRowWsPackets(Long value) {
        return new JAXBElement<Long>(_Ib440QosPerQciStatsRowWsPackets_QNAME, Long.class, Ib440QosPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Bytes", scope = Ib440QosPerQciStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440QosPerQciStatsRowWsBytes(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440QosPerQciStatsRowWsBytes_QNAME, BigInteger.class, Ib440QosPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Dropped", scope = Ib440QosPerQciStatsRowWs.class)
    public JAXBElement<Long> createIb440QosPerQciStatsRowWsDropped(Long value) {
        return new JAXBElement<Long>(_Ib440QosPerQciStatsRowWsDropped_QNAME, Long.class, Ib440QosPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InBytes", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsInBytes(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsInBytes_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InUnicastPackets", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsInUnicastPackets(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsInUnicastPackets_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InMulticastPackets", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsInMulticastPackets(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsInMulticastPackets_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InDiscards", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Long> createIb440IpStatsRowWsInDiscards(Long value) {
        return new JAXBElement<Long>(_Ib440IpStatsRowWsInDiscards_QNAME, Long.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InErrors", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Long> createIb440IpStatsRowWsInErrors(Long value) {
        return new JAXBElement<Long>(_Ib440IpStatsRowWsInErrors_QNAME, Long.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutBytes", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsOutBytes(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsOutBytes_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutUnicastPackets", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsOutUnicastPackets(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsOutUnicastPackets_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutMulticastPackets", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<BigInteger> createIb440IpStatsRowWsOutMulticastPackets(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ib440IpStatsRowWsOutMulticastPackets_QNAME, BigInteger.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutDiscards", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Long> createIb440IpStatsRowWsOutDiscards(Long value) {
        return new JAXBElement<Long>(_Ib440IpStatsRowWsOutDiscards_QNAME, Long.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutErrors", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Long> createIb440IpStatsRowWsOutErrors(Long value) {
        return new JAXBElement<Long>(_Ib440IpStatsRowWsOutErrors_QNAME, Long.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxThroughput", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Double> createIb440IpStatsRowWsRxThroughput(Double value) {
        return new JAXBElement<Double>(_Ib440IpStatsRowWsRxThroughput_QNAME, Double.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxThroughput", scope = Ib440IpStatsRowWs.class)
    public JAXBElement<Double> createIb440IpStatsRowWsTxThroughput(Double value) {
        return new JAXBElement<Double>(_Ib440IpStatsRowWsTxThroughput_QNAME, Double.class, Ib440IpStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SignalToNoise", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsSignalToNoise(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsSignalToNoise_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrengthCh0", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsTxSignalStrengthCh0(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsTxSignalStrengthCh0_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxSignalStrengthCh1", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsTxSignalStrengthCh1(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsTxSignalStrengthCh1_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrengthCh0", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsRxSignalStrengthCh0(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsRxSignalStrengthCh0_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrengthCh1", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsRxSignalStrengthCh1(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsRxSignalStrengthCh1_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxSignalStrength", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsRxSignalStrength(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsRxSignalStrength_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxPower", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsTxPower(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsTxPower_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Frequency", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsFrequency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsFrequency_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Uptime", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Long> createIb440RfStatsRowWsUptime(Long value) {
        return new JAXBElement<Long>(_Ib440RfStatsRowWsUptime_QNAME, Long.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxRate", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Float> createIb440RfStatsRowWsTxRate(Float value) {
        return new JAXBElement<Float>(_Ib440RfStatsRowWsTxRate_QNAME, Float.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxRate", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Float> createIb440RfStatsRowWsRxRate(Float value) {
        return new JAXBElement<Float>(_Ib440RfStatsRowWsRxRate_QNAME, Float.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TxLinkEfficiency", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsTxLinkEfficiency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsTxLinkEfficiency_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RxLinkEfficiency", scope = Ib440RfStatsRowWs.class)
    public JAXBElement<Integer> createIb440RfStatsRowWsRxLinkEfficiency(Integer value) {
        return new JAXBElement<Integer>(_Ib440RfStatsRowWsRxLinkEfficiency_QNAME, Integer.class, Ib440RfStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRachPreamblesSentStatsRowWs.class)
    public JAXBElement<Integer> createLteRachPreamblesSentStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRachPreamblesSentStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRachPreamblesSentStatsRowWs.class)
    public JAXBElement<Integer> createLteRachPreamblesSentStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRachPreamblesSentStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreamblesSent", scope = LteRachPreamblesSentStatsRowWs.class)
    public JAXBElement<Integer> createLteRachPreamblesSentStatsRowWsRachPreamblesSent(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsRachPreamblesSent_QNAME, Integer.class, LteRachPreamblesSentStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachBinMinValue", scope = LteRachPreamblesSentStatsRowWs.class)
    public JAXBElement<Integer> createLteRachPreamblesSentStatsRowWsRachBinMinValue(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsRachBinMinValue_QNAME, Integer.class, LteRachPreamblesSentStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachBinMaxValue", scope = LteRachPreamblesSentStatsRowWs.class)
    public JAXBElement<Integer> createLteRachPreamblesSentStatsRowWsRachBinMaxValue(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsRachBinMaxValue_QNAME, Integer.class, LteRachPreamblesSentStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRachAccessDelayStatsRowWs.class)
    public JAXBElement<Integer> createLteRachAccessDelayStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRachAccessDelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRachAccessDelayStatsRowWs.class)
    public JAXBElement<Integer> createLteRachAccessDelayStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRachAccessDelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachAccessDelay", scope = LteRachAccessDelayStatsRowWs.class)
    public JAXBElement<Integer> createLteRachAccessDelayStatsRowWsRachAccessDelay(Integer value) {
        return new JAXBElement<Integer>(_LteRachAccessDelayStatsRowWsRachAccessDelay_QNAME, Integer.class, LteRachAccessDelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachBinMinValue", scope = LteRachAccessDelayStatsRowWs.class)
    public JAXBElement<Integer> createLteRachAccessDelayStatsRowWsRachBinMinValue(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsRachBinMinValue_QNAME, Integer.class, LteRachAccessDelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachBinMaxValue", scope = LteRachAccessDelayStatsRowWs.class)
    public JAXBElement<Integer> createLteRachAccessDelayStatsRowWsRachBinMaxValue(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsRachBinMaxValue_QNAME, Integer.class, LteRachAccessDelayStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SctpPort", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsSctpPort(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsSctpPort_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PermitEmrgSessAndMobileTerminatedSrvOnly", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsPermitEmrgSessAndMobileTerminatedSrvOnly(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsPermitEmrgSessAndMobileTerminatedSrvOnly_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PermitHighPrioSessAndMobileTerminatedSrvOnly", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsPermitHighPrioSessAndMobileTerminatedSrvOnly(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsPermitHighPrioSessAndMobileTerminatedSrvOnly_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RejectDelayTolerantAccess", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsRejectDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsRejectDelayTolerantAccess_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RejectNonEmergencyMoDt", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsRejectNonEmergencyMoDt(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsRejectNonEmergencyMoDt_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RejectRrcCrSignalling", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsRejectRrcCrSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsRejectRrcCrSignalling_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Stop", scope = LteMmeStatsRowWs.class)
    public JAXBElement<Integer> createLteMmeStatsRowWsStop(Integer value) {
        return new JAXBElement<Integer>(_LteMmeStatsRowWsStop_QNAME, Integer.class, LteMmeStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "McsAllocIndex", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsMcsAllocIndex(Integer value) {
        return new JAXBElement<Integer>(_LteMcsStatsRowWsMcsAllocIndex_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMcsAllocCw1", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsDlMcsAllocCw1(Integer value) {
        return new JAXBElement<Integer>(_LteMcsStatsRowWsDlMcsAllocCw1_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMcsAllocCw2", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsDlMcsAllocCw2(Integer value) {
        return new JAXBElement<Integer>(_LteMcsStatsRowWsDlMcsAllocCw2_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMcsAlloc", scope = LteMcsStatsRowWs.class)
    public JAXBElement<Integer> createLteMcsStatsRowWsUlMcsAlloc(Integer value) {
        return new JAXBElement<Integer>(_LteMcsStatsRowWsUlMcsAlloc_QNAME, Integer.class, LteMcsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlIntraEnbLoadBalancingRsn", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsX2InterFreqInAttRnlIntraEnbLoadBalancingRsn(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsX2InterFreqInAttRnlIntraEnbLoadBalancingRsn_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsX2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsX2InterFreqInCompSuccRnlIntraEnbLoadBalancingRsn_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsX2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsX2InterFreqInPrepFailRnlIntraEnbLoadBalancingRsn_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LoadMeasurementsCompositeLoadAverage", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadAverage(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadAverage_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LoadMeasurementsCompositeLoadMinimum", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMinimum(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMinimum_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LoadMeasurementsCompositeLoadMaximum", scope = LteIntraEnbLbStatsRowWs.class)
    public JAXBElement<Integer> createLteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMaximum(Integer value) {
        return new JAXBElement<Integer>(_LteIntraEnbLbStatsRowWsLoadMeasurementsCompositeLoadMaximum_QNAME, Integer.class, LteIntraEnbLbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "BinId", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsBinId(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsBinId_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlAckCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsDlAckCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsDlAckCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlNackCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsDlNackCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsDlNackCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlAckCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsUlAckCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsUlAckCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlNackCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsUlNackCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsUlNackCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMsg4AckCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsDlMsg4AckCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsDlMsg4AckCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMsg4NackCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsDlMsg4NackCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsDlMsg4NackCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMsg3AckCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsUlMsg3AckCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsUlMsg3AckCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMsg3NackCount", scope = LteHarqStatsRowWs.class)
    public JAXBElement<Integer> createLteHarqStatsRowWsUlMsg3NackCount(Integer value) {
        return new JAXBElement<Integer>(_LteHarqStatsRowWsUlMsg3NackCount_QNAME, Integer.class, LteHarqStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2ConnSetupAtt", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2ConnSetupAtt(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2ConnSetupAtt_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2ConnSetupSucc", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2ConnSetupSucc(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2ConnSetupSucc_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2ConnSetupFailStd", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2ConnSetupFailStd(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2ConnSetupFailStd_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2ConnSetupFailLinkLoss", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2ConnSetupFailLinkLoss(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2ConnSetupFailLinkLoss_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStartAtt", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStartAtt(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStartAtt_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStartSucc", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStartSucc(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStartSucc_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStartFailSpec", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStartFailSpec(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStartFailSpec_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStartFailLinkLoss", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStartFailLinkLoss(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStartFailLinkLoss_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStartFailUnSpec", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStartFailUnSpec(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStartFailUnSpec_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStopAtt", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStopAtt(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStopAtt_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStopSucc", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStopSucc(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStopSucc_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStopFailLinkLoss", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStopFailLinkLoss(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStopFailLinkLoss_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "M2SessionStopFailOther", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsM2SessionStopFailOther(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsM2SessionStopFailOther_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncPduCountType0", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncPduCountType0(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncPduCountType0_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncPduCountType1", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncPduCountType1(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncPduCountType1_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncPduCountType3", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncPduCountType3(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncPduCountType3_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncByteType0", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Long> createLteEmbmsStatsRowWsSyncByteType0(Long value) {
        return new JAXBElement<Long>(_LteEmbmsStatsRowWsSyncByteType0_QNAME, Long.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncByteType1", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Long> createLteEmbmsStatsRowWsSyncByteType1(Long value) {
        return new JAXBElement<Long>(_LteEmbmsStatsRowWsSyncByteType1_QNAME, Long.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncByteType3", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Long> createLteEmbmsStatsRowWsSyncByteType3(Long value) {
        return new JAXBElement<Long>(_LteEmbmsStatsRowWsSyncByteType3_QNAME, Long.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncSyncSeqDiscard", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncSyncSeqDiscard(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncSyncSeqDiscard_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncSyncPduDropWrongTeId", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncSyncPduDropWrongTeId(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncSyncPduDropWrongTeId_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncSyncByteDropWrongTeId", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncSyncByteDropWrongTeId(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncSyncByteDropWrongTeId_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncSyncSduDropOtherReason", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncSyncSduDropOtherReason(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncSyncSduDropOtherReason_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncSyncSeqCount", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncSyncSeqCount(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncSyncSeqCount_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SyncDiscardedSyncSeqCount", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsSyncDiscardedSyncSeqCount(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsSyncDiscardedSyncSeqCount_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellSyncSync2RlcPduCount", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsCellSyncSync2RlcPduCount(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsCellSyncSync2RlcPduCount_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellSyncSync2RlcByteCount", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsCellSyncSync2RlcByteCount(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsCellSyncSync2RlcByteCount_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellSyncSync2RlcSyncSeqCount", scope = LteEmbmsStatsRowWs.class)
    public JAXBElement<Integer> createLteEmbmsStatsRowWsCellSyncSync2RlcSyncSeqCount(Integer value) {
        return new JAXBElement<Integer>(_LteEmbmsStatsRowWsCellSyncSync2RlcSyncSeqCount_QNAME, Integer.class, LteEmbmsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtranRedirectionAttempts", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsUtranRedirectionAttempts(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsUtranRedirectionAttempts_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtranFailedRedirections", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsUtranFailedRedirections(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsUtranFailedRedirections_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UtranSuccessfulRedirections", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsUtranSuccessfulRedirections(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsUtranSuccessfulRedirections_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cdma2kRedirections", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsCdma2KRedirections(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsCdma2KRedirections_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cdma2kTransferRate", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Double> createLteCsfbStatsRowWsCdma2KTransferRate(Double value) {
        return new JAXBElement<Double>(_LteCsfbStatsRowWsCdma2KTransferRate_QNAME, Double.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Csfb3GRedirectionMeas", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsCsfb3GRedirectionMeas(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsCsfb3GRedirectionMeas_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cdma2kRequest", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsCdma2KRequest(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsCdma2KRequest_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cdma2kResponse", scope = LteCsfbStatsRowWs.class)
    public JAXBElement<Integer> createLteCsfbStatsRowWsCdma2KResponse(Integer value) {
        return new JAXBElement<Integer>(_LteCsfbStatsRowWsCdma2KResponse_QNAME, Integer.class, LteCsfbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LtePagingStatsRowWs.class)
    public JAXBElement<Integer> createLtePagingStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LtePagingStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LtePagingStatsRowWs.class)
    public JAXBElement<Integer> createLtePagingStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LtePagingStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DiscardedNumber", scope = LtePagingStatsRowWs.class)
    public JAXBElement<Integer> createLtePagingStatsRowWsDiscardedNumber(Integer value) {
        return new JAXBElement<Integer>(_LtePagingStatsRowWsDiscardedNumber_QNAME, Integer.class, LtePagingStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaSCellReleaseSentNum", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCaSCellReleaseSentNum(Integer value) {
        return new JAXBElement<Integer>(_LteCarrAggreStatsRowWsCaSCellReleaseSentNum_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellAdditionAttemptCount", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCaScellAdditionAttemptCount(Integer value) {
        return new JAXBElement<Integer>(_LteCarrAggreStatsRowWsCaScellAdditionAttemptCount_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellAdditionSuccessCount", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCaScellAdditionSuccessCount(Integer value) {
        return new JAXBElement<Integer>(_LteCarrAggreStatsRowWsCaScellAdditionSuccessCount_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellAdditionSuccessRate", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Double> createLteCarrAggreStatsRowWsCaScellAdditionSuccessRate(Double value) {
        return new JAXBElement<Double>(_LteCarrAggreStatsRowWsCaScellAdditionSuccessRate_QNAME, Double.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaNumActivateCommandsSent", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCaNumActivateCommandsSent(Integer value) {
        return new JAXBElement<Integer>(_LteCarrAggreStatsRowWsCaNumActivateCommandsSent_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaNumDeactivateCommandsSent", scope = LteCarrAggreStatsRowWs.class)
    public JAXBElement<Integer> createLteCarrAggreStatsRowWsCaNumDeactivateCommandsSent(Integer value) {
        return new JAXBElement<Integer>(_LteCarrAggreStatsRowWsCaNumDeactivateCommandsSent_QNAME, Integer.class, LteCarrAggreStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi1Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi1Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi2Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi2Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi3Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi3Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi4Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi4Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi5Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi5Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi6Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi6Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi7Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi7Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi8Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi8Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi9Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi9Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi10Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi10Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi11Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi11Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi12Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi12Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi13Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi13Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi14Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi14Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw0WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw0WbCqi15Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw0WbCqi15Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi1Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi1Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi2Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi2Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi3Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi3Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi4Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi4Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi5Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi5Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi6Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi6Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi7Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi7Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi8Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi8Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi9Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi9Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi10Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi10Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi11Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi11Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi12Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi12Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi13Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi13Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi14Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi14Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Cw1WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCw1WbCqi15Dist(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCw1WbCqi15Dist_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant1RssiMin", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt1RssiMin(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt1RssiMin_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant1RssiAvg", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt1RssiAvg(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt1RssiAvg_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant1RssiMax", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt1RssiMax(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt1RssiMax_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant2RssiMin", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt2RssiMin(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt2RssiMin_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant2RssiAvg", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt2RssiAvg(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt2RssiAvg_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant2RssiMax", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt2RssiMax(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt2RssiMax_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant3RssiMin", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt3RssiMin(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt3RssiMin_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant3RssiAvg", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt3RssiAvg(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt3RssiAvg_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant3RssiMax", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt3RssiMax(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt3RssiMax_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant4RssiMin", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt4RssiMin(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt4RssiMin_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant4RssiAvg", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt4RssiAvg(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt4RssiAvg_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "Ant4RssiMax", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsAnt4RssiMax(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsAnt4RssiMax_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NiMin", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsNiMin(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsNiMin_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NiAvg", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsNiAvg(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsNiAvg_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NiMax", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsNiMax(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsNiMax_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CwAllocDlNum1", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCwAllocDlNum1(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCwAllocDlNum1_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CwAllocDlNum2", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCwAllocDlNum2(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCwAllocDlNum2_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi1Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi1Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi2Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi2Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi3Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi3Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi4Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi4Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi5Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi5Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi6Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi6Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi7Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi7Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi8Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi8Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi9Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi9Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi10Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi10Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi11Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi11Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi12Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi12Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi13Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi13Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi14Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi14Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw0WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw0WbCqi15Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw0WbCqi15Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi1Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi1Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi2Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi2Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi3Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi3Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi4Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi4Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi5Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi5Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi6Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi6Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi7Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi7Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi8Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi8Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi9Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi9Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi10Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi10Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi11Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi11Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi12Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi12Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi13Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi13Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi14Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi14Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPcellCw1WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPcellCw1WbCqi15Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPcellCw1WbCqi15Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi1Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi1Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi2Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi2Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi3Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi3Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi4Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi4Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi5Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi5Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi6Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi6Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi7Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi7Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi8Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi8Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi9Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi9Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi10Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi10Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi11Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi11Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi12Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi12Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi13Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi13Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi14Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi14Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw0WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw0WbCqi15Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw0WbCqi15Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi1Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi1Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi1Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi2Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi2Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi2Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi3Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi3Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi3Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi4Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi4Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi4Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi5Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi5Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi5Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi6Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi6Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi6Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi7Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi7Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi7Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi8Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi8Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi8Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi9Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi9Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi9Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi10Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi10Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi10Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi11Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi11Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi11Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi12Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi12Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi12Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi13Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi13Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi13Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi14Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi14Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi14Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaScellCw1WbCqi15Dist", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaScellCw1WbCqi15Dist(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaScellCw1WbCqi15Dist_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaAvgUesWithActiveSCell", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCaAvgUesWithActiveSCell(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCaAvgUesWithActiveSCell_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaAvgCaCapableUes", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCaAvgCaCapableUes(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCaAvgCaCapableUes_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaAvgUesWithCfgSCell", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteRfMeasStatsRowWsCaAvgUesWithCfgSCell(Integer value) {
        return new JAXBElement<Integer>(_LteRfMeasStatsRowWsCaAvgUesWithCfgSCell_QNAME, Integer.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPCellMacDlDataVolume", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPCellMacDlDataVolume(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPCellMacDlDataVolume_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaSCellMacDlDataVolume", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaSCellMacDlDataVolume(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaSCellMacDlDataVolume_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaPCellMacUlDataVolume", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaPCellMacUlDataVolume(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaPCellMacUlDataVolume_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaSCellMacUlDataVolume", scope = LteRfMeasStatsRowWs.class)
    public JAXBElement<Long> createLteRfMeasStatsRowWsCaSCellMacUlDataVolume(Long value) {
        return new JAXBElement<Long>(_LteRfMeasStatsRowWsCaSCellMacUlDataVolume_QNAME, Long.class, LteRfMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EquipMeasMeanProcUsage", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsEquipMeasMeanProcUsage(Integer value) {
        return new JAXBElement<Integer>(_LteEquipMeasStatsRowWsEquipMeasMeanProcUsage_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EquipMeasMaxProcUsage", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsEquipMeasMaxProcUsage(Integer value) {
        return new JAXBElement<Integer>(_LteEquipMeasStatsRowWsEquipMeasMaxProcUsage_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EquipMemoryUsageMean", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsEquipMemoryUsageMean(Integer value) {
        return new JAXBElement<Integer>(_LteEquipMeasStatsRowWsEquipMemoryUsageMean_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EquipMemoryUsageMax", scope = LteEquipMeasStatsRowWs.class)
    public JAXBElement<Integer> createLteEquipMeasStatsRowWsEquipMemoryUsageMax(Integer value) {
        return new JAXBElement<Integer>(_LteEquipMeasStatsRowWsEquipMemoryUsageMax_QNAME, Integer.class, LteEquipMeasStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteLiteCompStatsRowWs.class)
    public JAXBElement<Integer> createLteLiteCompStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteLiteCompStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteLiteCompStatsRowWs.class)
    public JAXBElement<Integer> createLteLiteCompStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteLiteCompStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LiteCompIndex", scope = LteLiteCompStatsRowWs.class)
    public JAXBElement<Integer> createLteLiteCompStatsRowWsLiteCompIndex(Integer value) {
        return new JAXBElement<Integer>(_LteLiteCompStatsRowWsLiteCompIndex_QNAME, Integer.class, LteLiteCompStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EfficiencyGain", scope = LteLiteCompStatsRowWs.class)
    public JAXBElement<Integer> createLteLiteCompStatsRowWsEfficiencyGain(Integer value) {
        return new JAXBElement<Integer>(_LteLiteCompStatsRowWsEfficiencyGain_QNAME, Integer.class, LteLiteCompStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LtePosMeasurementsStatsRowWs.class)
    public JAXBElement<Integer> createLtePosMeasurementsStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LtePosMeasurementsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LtePosMeasurementsStatsRowWs.class)
    public JAXBElement<Integer> createLtePosMeasurementsStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LtePosMeasurementsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EcidSuccMeasInitResponse", scope = LtePosMeasurementsStatsRowWs.class)
    public JAXBElement<Integer> createLtePosMeasurementsStatsRowWsEcidSuccMeasInitResponse(Integer value) {
        return new JAXBElement<Integer>(_LtePosMeasurementsStatsRowWsEcidSuccMeasInitResponse_QNAME, Integer.class, LtePosMeasurementsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EcidFailMeasInitCauseReqItemNotSupported", scope = LtePosMeasurementsStatsRowWs.class)
    public JAXBElement<Integer> createLtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemNotSupported(Integer value) {
        return new JAXBElement<Integer>(_LtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemNotSupported_QNAME, Integer.class, LtePosMeasurementsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "EcidFailMeasInitCauseReqItemTemporarilyNotSupported", scope = LtePosMeasurementsStatsRowWs.class)
    public JAXBElement<Integer> createLtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemTemporarilyNotSupported(Integer value) {
        return new JAXBElement<Integer>(_LtePosMeasurementsStatsRowWsEcidFailMeasInitCauseReqItemTemporarilyNotSupported_QNAME, Integer.class, LtePosMeasurementsStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QciIndex", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsQciIndex(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsQciIndex_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlPrbUsageForTraffic", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsDlPrbUsageForTraffic(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsDlPrbUsageForTraffic_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPrbUsageForTraffic", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsUlPrbUsageForTraffic(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsUlPrbUsageForTraffic_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMacTrafficKbps", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Double> createLteRruPerQciStatsRowWsDlMacTrafficKbps(Double value) {
        return new JAXBElement<Double>(_LteRruPerQciStatsRowWsDlMacTrafficKbps_QNAME, Double.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMacTrafficKbps", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Double> createLteRruPerQciStatsRowWsUlMacTrafficKbps(Double value) {
        return new JAXBElement<Double>(_LteRruPerQciStatsRowWsUlMacTrafficKbps_QNAME, Double.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlMacTrafficBytes", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsDlMacTrafficBytes(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsDlMacTrafficBytes_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlMacTrafficBytes", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsUlMacTrafficBytes(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsUlMacTrafficBytes_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlEffMacTrafficKbPerTti", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Double> createLteRruPerQciStatsRowWsDlEffMacTrafficKbPerTti(Double value) {
        return new JAXBElement<Double>(_LteRruPerQciStatsRowWsDlEffMacTrafficKbPerTti_QNAME, Double.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlEffMacTrafficKbPerTti", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Double> createLteRruPerQciStatsRowWsUlEffMacTrafficKbPerTti(Double value) {
        return new JAXBElement<Double>(_LteRruPerQciStatsRowWsUlEffMacTrafficKbPerTti_QNAME, Double.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlActiveTti", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsDlActiveTti(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsDlActiveTti_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlActiveTti", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRruPerQciStatsRowWsUlActiveTti(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsUlActiveTti_QNAME, Integer.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaThpTimeDl", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsCaThpTimeDl(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsCaThpTimeDl_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaThpVolDl", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsCaThpVolDl(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsCaThpVolDl_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaThpTimeUl", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsCaThpTimeUl(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsCaThpTimeUl_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CaThpVolUl", scope = LteRruPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRruPerQciStatsRowWsCaThpVolUl(Long value) {
        return new JAXBElement<Long>(_LteRruPerQciStatsRowWsCaThpVolUl_QNAME, Long.class, LteRruPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailNBCauseCongestion", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailNBCauseCongestion(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailNBCauseCongestion_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailNBCauseUnspecified", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailNBCauseUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailNBCauseUnspecified_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabAttReconfigurationFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabAttReconfigurationFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabAttReconfigurationFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabAttHandoverFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabAttHandoverFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabAttHandoverFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabAttOtherFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabAttOtherFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabAttOtherFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabAttSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabAttSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabAttSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabSuccReconfigurationFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabSuccReconfigurationFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabSuccReconfigurationFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabSuccHandoverFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabSuccHandoverFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabSuccHandoverFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabSuccOtherFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabSuccOtherFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabSuccOtherFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabSuccSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabSuccSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabSuccSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabFailReconfigurationFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabFailReconfigurationFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabFailReconfigurationFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabFailHandoverFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabFailHandoverFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabFailHandoverFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabFailOtherFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabFailOtherFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabFailOtherFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabFailSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabFailSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabFailSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnMeanVal", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnMeanVal(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnMeanVal_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnMaxVal", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnMaxVal(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnMaxVal_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMeanEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMeanEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMeanEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMeanHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMeanHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMeanHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMeanMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMeanMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMeanMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMeanMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMeanMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMeanMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMeanMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMeanMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMeanMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMaxEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMaxEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMaxEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMaxHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMaxHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMaxHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMaxMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMaxMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMaxMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMaxMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMaxMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMaxMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMaxMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMaxMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMaxMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqSum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqSum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqSum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelSuccNbr", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelSuccNbr(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelSuccNbr_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMean", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMean(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMean_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabTimeMax", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabTimeMax(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabTimeMax_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabAttDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabAttDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabAttDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabSuccDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabSuccDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabSuccDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailNBCauseEnergySaving", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailNBCauseEnergySaving(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailNBCauseEnergySaving_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqCauseUeConnLoss", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqCauseUeConnLoss(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqCauseUeConnLoss_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqCauseUserInactivity", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqCauseUserInactivity(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqCauseUserInactivity_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqCauseCsFallbackTriggered", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqCauseCsFallbackTriggered(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqCauseCsFallbackTriggered_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat1Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat1Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat1Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat2Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat2Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat2Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat3Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat3Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat3Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat4Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat4Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat4Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat5Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat5Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat5Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat6Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat6Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat6Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat7Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat7Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat7Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat8Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat8Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat8Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat9Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat9Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat9Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat10Avg", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat10Avg(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat10Avg_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat1Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat1Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat1Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat2Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat2Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat2Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat3Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat3Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat3Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat4Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat4Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat4Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat5Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat5Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat5Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat6Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat6Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat6Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat7Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat7Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat7Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat8Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat8Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat8Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat9Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat9Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat9Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat10Min", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat10Min(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat10Min_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat1Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat1Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat1Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat2Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat2Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat2Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat3Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat3Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat3Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat4Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat4Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat4Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat5Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat5Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat5Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat6Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat6Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat6Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat7Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat7Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat7Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat8Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat8Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat8Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat9Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat9Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat9Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesCat10Max", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesCat10Max(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesCat10Max_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesTotal", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesTotal(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesTotal_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesMin", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesMin(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesMin_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnectedUesMax", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnectedUesMax(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnectedUesMax_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReconfigAttempt", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReconfigAttempt(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReconfigAttempt_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReconfigSuccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReconfigSuccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReconfigSuccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqRedirectionTowards1xRTT", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqRedirectionTowards1XRTT(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqRedirectionTowards1XRTT_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqInterRATRedirection", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqInterRATRedirection(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqInterRATRedirection_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqRNwTx2RelocOverallExpiry", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqRNwTx2RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqRNwTx2RelocOverallExpiry_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqRNwTS1RelocOverallExpiry", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqRNwTS1RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqRNwTS1RelocOverallExpiry_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqRNwRelDueTOEUtranGenReason", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqRNwRelDueTOEUtranGenReason(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqRNwRelDueTOEUtranGenReason_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqRNwHOFailureTEnbEpcOrTSys", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqRNwHOFailureTEnbEpcOrTSys(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqRNwHOFailureTEnbEpcOrTSys_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqFailInRadioInterfaceProcedure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqFailInRadioInterfaceProcedure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqFailInRadioInterfaceProcedure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqUnspecified", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqUnspecified_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqTPTransportResourceUnavailable", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqTPTransportResourceUnavailable(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqTPTransportResourceUnavailable_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqCsgSubscriptionExpiry", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqCsgSubscriptionExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqCsgSubscriptionExpiry_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqUeNotAvailableForPsService", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqUeNotAvailableForPsService(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqUeNotAvailableForPsService_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxMoSignaling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxMoSignaling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxMoSignaling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CallDropRlcMaxHandover", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsCallDropRlcMaxHandover(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsCallDropRlcMaxHandover_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfMoSignaling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfMoSignaling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfMoSignaling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "LinkInactivityRlfHandover", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsLinkInactivityRlfHandover(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsLinkInactivityRlfHandover_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommUnspecified", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommUnspecified_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectEmergency", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectEmergency(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectEmergency_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectHighPriorityAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectHighPriorityAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectHighPriorityAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectMtAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectMtAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectMtAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectMoSignalling", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectMoSignalling(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectMoSignalling_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectMoData", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectMoData(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectMoData_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MmeOverloadRejectDelayTolerantAccess", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsMmeOverloadRejectDelayTolerantAccess(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsMmeOverloadRejectDelayTolerantAccess_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommNASNormalRelease", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommNASNormalRelease(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommNASNormalRelease_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwTS1RelocOverAllExpiry", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwTS1RelocOverAllExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwTS1RelocOverAllExpiry_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRadioNwtx2RelocOverAllExpiry", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRadioNwtx2RelocOverAllExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRadioNwtx2RelocOverAllExpiry_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwRelDueToEutranGenReason", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwRelDueToEutranGenReason(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwRelDueToEutranGenReason_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwUserInactivity", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwUserInactivity(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwUserInactivity_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwRadioConnWithUeLost", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwRadioConnWithUeLost(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwRadioConnWithUeLost_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwLoadBalTauReq", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwLoadBalTauReq(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwLoadBalTauReq_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwCSFBkTrig", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwCSFBkTrig(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwCSFBkTrig_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwRedirectionTowards1xRTT", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwRedirectionTowards1XRTT(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwRedirectionTowards1XRTT_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwInterratRedirection", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwInterratRedirection(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwInterratRedirection_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommNASAuthenticationEnum", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommNASAuthenticationEnum(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommNASAuthenticationEnum_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwSuccHO", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwSuccHO(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwSuccHO_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwHoFailInTargEPCEnbOrTargSys", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwHoFailInTargEPCEnbOrTargSys(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwHoFailInTargEPCEnbOrTargSys_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommRNwFailInRadioInterfProc", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommRNwFailInRadioInterfProc(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommRNwFailInRadioInterfProc_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommTPTransportResUnavail", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommTPTransportResUnavail(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommTPTransportResUnavail_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelCommNASDetach", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelCommNASDetach(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelCommNASDetach_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnEstabFailS1APSignallingFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnEstabFailS1APSignallingFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnEstabFailS1APSignallingFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeContextRelReqCallDrpS1apLinkOutOfService", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsUeContextRelReqCallDrpS1ApLinkOutOfService(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsUeContextRelReqCallDrpS1ApLinkOutOfService_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ConnReEstabFailS1APSignallingFailure", scope = LteRrcStatsRowWs.class)
    public JAXBElement<Integer> createLteRrcStatsRowWsConnReEstabFailS1APSignallingFailure(Integer value) {
        return new JAXBElement<Integer>(_LteRrcStatsRowWsConnReEstabFailS1APSignallingFailure_QNAME, Integer.class, LteRrcStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalNumOfDlTbs", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalNumOfDlTbs(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalNumOfDlTbs_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalNumOfErrorDlTbs", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalNumOfErrorDlTbs(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalNumOfErrorDlTbs_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalNumOfUlTbs", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalNumOfUlTbs(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalNumOfUlTbs_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalNumOfErrorUlTbs", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalNumOfErrorUlTbs(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalNumOfErrorUlTbs_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlPrbUsageForTrafficSum", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsDlPrbUsageForTrafficSum(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsDlPrbUsageForTrafficSum_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlPrbUsageForTrafficSum", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsUlPrbUsageForTrafficSum(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsUlPrbUsageForTrafficSum_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DlTotalPrbUsage", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsDlTotalPrbUsage(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsDlTotalPrbUsage_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UlTotalPrbUsage", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsUlTotalPrbUsage(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsUlTotalPrbUsage_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalCellUnavailableTime", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalCellUnavailableTime(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalCellUnavailableTime_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachContentiousAttempts", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachContentiousAttempts(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachContentiousAttempts_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachUEReportsReceived", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachUEReportsReceived(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachUEReportsReceived_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreamblesUsageTime", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachPreamblesUsageTime(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachPreamblesUsageTime_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalCellUnavailableTimeFault", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalCellUnavailableTimeFault(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalCellUnavailableTimeFault_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TotalCellUnavailableTimeManualIntervention", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsTotalCellUnavailableTimeManualIntervention(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsTotalCellUnavailableTimeManualIntervention_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreambleDedicatedMean", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachPreambleDedicatedMean(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachPreambleDedicatedMean_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreambleGroupAMean", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachPreambleGroupAMean(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachPreambleGroupAMean_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RachPreambleGroupBMean", scope = LteRruStatsRowWs.class)
    public JAXBElement<Integer> createLteRruStatsRowWsRachPreambleGroupBMean(Integer value) {
        return new JAXBElement<Integer>(_LteRruStatsRowWsRachPreambleGroupBMean_QNAME, Integer.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RruCfiAvg", scope = LteRruStatsRowWs.class)
    public JAXBElement<Double> createLteRruStatsRowWsRruCfiAvg(Double value) {
        return new JAXBElement<Double>(_LteRruStatsRowWsRruCfiAvg_QNAME, Double.class, LteRruStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "TargetCellIdentity", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsTargetCellIdentity(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsTargetCellIdentity_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutAttSum", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutAttSum(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutAttSum_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutAttDesForRadReasons", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutAttDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutAttDesForRadReasons_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutAttTimeCritical", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutAttTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutAttTimeCritical_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutAttResOptimisation", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutAttResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutAttResOptimisation_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutAttReduceLoadInServingCell", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutAttReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutAttReduceLoadInServingCell_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutSuccSum", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutSuccSum(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutSuccSum_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutSuccDesForRadReasons", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutSuccDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutSuccDesForRadReasons_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutSuccTimeCritical", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutSuccTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutSuccTimeCritical_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutSuccResOptimisation", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutSuccResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutSuccResOptimisation_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "OutSuccReduceLoadInServingCell", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsOutSuccReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsOutSuccReduceLoadInServingCell_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoFailureMroTooEarly", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsHoFailureMroTooEarly(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsHoFailureMroTooEarly_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoFailureMroTooLate", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsHoFailureMroTooLate(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsHoFailureMroTooLate_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoFailureMroWrongCell", scope = LtePerCellHoStatsRowWs.class)
    public JAXBElement<Integer> createLtePerCellHoStatsRowWsHoFailureMroWrongCell(Integer value) {
        return new JAXBElement<Integer>(_LtePerCellHoStatsRowWsHoFailureMroWrongCell_QNAME, Integer.class, LtePerCellHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttSum", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttSum(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttSum_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttDesForRadReasons", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttDesForRadReasons_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttTimeCritical", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttTimeCritical_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttResOptimisation", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttResOptimisation_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccSum", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccSum(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccSum_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccDesForRadReasons", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccDesForRadReasons_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccTimeCritical", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccTimeCritical_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccResOptimisation", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccResOptimisation_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutAttSum", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutAttSum(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutAttSum_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutAttDesForRadReasons", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutAttDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutAttDesForRadReasons_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutAttTimeCritical", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutAttTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutAttTimeCritical_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutAttResOptimisation", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutAttResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutAttResOptimisation_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutSuccSum", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutSuccSum(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutSuccSum_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutSuccDesForRadReasons", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutSuccDesForRadReasons(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutSuccDesForRadReasons_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutSuccTimeCritical", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutSuccTimeCritical(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutSuccTimeCritical_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutSuccResOptimisation", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutSuccResOptimisation(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutSuccResOptimisation_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqOutAttempts", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraFreqOutAttempts(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraFreqOutAttempts_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraFreqOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraFreqOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqMeasGapOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqMeasGapOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqMeasGapOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqMeasGapOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqMeasGapOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqMeasGapOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqNoMeasGapOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqNoMeasGapOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqNoMeasGapOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqNoMeasGapOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqNoMeasGapOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqNoMeasGapOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsDrxOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsDrxOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrxOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsDrxOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsDrxOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NonDrxOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsNonDrxOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsNonDrxOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NonDrxOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsNonDrxOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsNonDrxOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutAttReduceLoadInServingCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutAttReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutAttReduceLoadInServingCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutSuccReduceLoadInServingCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutSuccReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutSuccReduceLoadInServingCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttReduceLoadInServingCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttReduceLoadInServingCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccReduceLoadInServingCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccReduceLoadInServingCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosSuccSentConnReconfig", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosSuccSentConnReconfig(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosSuccSentConnReconfig_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosAttSuccCSFB", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosAttSuccCSFB(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosAttSuccCSFB_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosFailTimerExp", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosFailTimerExp(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosFailTimerExp_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosFailUECapability", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosFailUECapability(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosFailUECapability_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterEnbOutQosFailNoNeighbors", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterEnbOutQosFailNoNeighbors(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterEnbOutQosFailNoNeighbors_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlEncAndOrIntProtectAlgoNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlInvalidMmeGrpId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlInvalidMmeGrpId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlInvalidMmeGrpId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlHandoverTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlHandoverTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlHandoverTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlUnknownMmeCode", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownMmeCode(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownMmeCode_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlUnknownNewEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownNewEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlUnknownOldEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownOldEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailRnlUnknownPairEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailRnlUnknownPairEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailTnlTransResUnAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailTnlTransResUnAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailTnlTransResUnAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInPrepFailUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInPrepFailUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInPrepFailUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlInvalidMmeGrpId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlInvalidMmeGrpId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlInvalidMmeGrpId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlHandoverTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlHandoverTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlHandoverTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlUnknownMmeCode", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownMmeCode(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownMmeCode_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlUnknownNewEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownNewEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownNewEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlUnknownOldEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownOldEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownOldEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailRnlUnknownPairEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownPairEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailRnlUnknownPairEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailTnlTransResUnAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailTnlTransResUnAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailTnlTransResUnAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepFailUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepFailUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepFailUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailRnlMultipleErabIdInst", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailRnlMultipleErabIdInst(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailRnlMultipleErabIdInst_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailTlTransResUnvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailTlTransResUnvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailTlTransResUnvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailTlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailTlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailTlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtAbstSynErrIgnorAndNotift_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtMsgnotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtAbsSynErrFlsContructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtAbsSynErrFlsContructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtAbsSynErrFlsContructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailMiscCtrlProcOvld", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailMiscCtrlProcOvld(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailMiscCtrlProcOvld_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailMiscNoEnoughUPRAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailMiscNoEnoughUPRAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailMiscNoEnoughUPRAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailMisHwErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailMisHwErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailMisHwErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailMiscOAMInt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailMiscOAMInt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailMiscOAMInt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailRelocExecTmrExp", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailRelocExecTmrExp(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailRelocExecTmrExp_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailPathSwitchTmrExpr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailPathSwitchTmrExpr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailPathSwitchTmrExpr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailunknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailunknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailunknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailRnlMultipleErabIdInst", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailRnlMultipleErabIdInst(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailRnlMultipleErabIdInst_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailTlTransResUnvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailTlTransResUnvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailTlTransResUnvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailTlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailTlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailTlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtAbstSynErrIgnorAndNotift", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrIgnorAndNotift(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtAbstSynErrIgnorAndNotift_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtMsgnotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtAbsSynErrFlsContructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtAbsSynErrFlsContructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtAbsSynErrFlsContructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailMiscCtrlProcOvld", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailMiscCtrlProcOvld(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailMiscCtrlProcOvld_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailMiscNoEnoughUPRAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailMiscNoEnoughUPRAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailMiscNoEnoughUPRAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailMisHwErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailMisHwErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailMisHwErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailMiscOAMInt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailMiscOAMInt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailMiscOAMInt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailRelocExecTmrExp", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailRelocExecTmrExp(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailRelocExecTmrExp_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailPathSwitchTmrExpr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailPathSwitchTmrExpr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailPathSwitchTmrExpr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailunknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailunknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailunknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInPrepSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInPrepSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInPrepSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1UnknFreqInAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1UnknFreqInAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1UnknFreqInAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlFailInRadioInfProc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInRadioInfProc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInRadioInfProc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlInvalidCsgId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlInvalidCsgId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlInvalidCsgId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlFailInTgtSys", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInTgtSys(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlFailInTgtSys_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlUnknownTgtId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownTgtId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownTgtId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlUnknownMmeUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownMmeUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlUnknownEnbUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownEnbUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailRnlUnknownPairUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownPairUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailRnlUnknownPairUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailTlTransResUnavail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailTlTransResUnavail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailTlTransResUnavail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailNasUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailNasUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailNasUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlFailInRadioInfProc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlFailInRadioInfProc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlFailInRadioInfProc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlInvalidCsgId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlInvalidCsgId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlInvalidCsgId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlFailInTgtSys", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlFailInTgtSys(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlFailInTgtSys_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlUnknownTgtId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownTgtId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownTgtId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlUnknownMmeUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownMmeUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlUnknownEnbUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownEnbUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailRnlUnknownPairUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownPairUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailRnlUnknownPairUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailTlTransResUnavail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailTlTransResUnavail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailTlTransResUnavail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailNasUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailNasUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailNasUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccRnlRadioRsn", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccRnlRadioRsn(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccRnlRadioRsn_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccRnlTimeCrit", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccRnlTimeCrit(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccRnlTimeCrit_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccRnlResOpt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccRnlResOpt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccRnlResOpt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccRnlReduceLoadInSvgCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccRnlReduceLoadInSvgCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccRnlReduceLoadInSvgCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompFailTgtRelocTmrExp", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompFailTgtRelocTmrExp(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompFailTgtRelocTmrExp_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqInCompFailHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqInCompFailHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqInCompFailHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompFailTgtRelocTmrExp", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompFailTgtRelocTmrExp(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompFailTgtRelocTmrExp_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqInCompFailHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqInCompFailHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqInCompFailHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqTimeAvg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqTimeAvg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqTimeAvg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntraFreqTimeMax", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntraFreqTimeMax(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntraFreqTimeMax_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqTimeAvg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqTimeAvg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqTimeAvg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1InterFreqTimeMax", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1InterFreqTimeMax(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1InterFreqTimeMax_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqTimeAvg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqTimeAvg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqTimeAvg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqTimeMax", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqTimeMax(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqTimeMax_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqTimeAvg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqTimeAvg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqTimeAvg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqTimeMax", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqTimeMax(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqTimeMax_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntraFreqInCompFailRnlHandoverTgtNotAllowed", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntraFreqInCompFailRnlHandoverTgtNotAllowed(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntraFreqInCompFailRnlHandoverTgtNotAllowed_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2InterFreqInCompFailRnlHandoverTgtNotAllowed", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2InterFreqInCompFailRnlHandoverTgtNotAllowed(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2InterFreqInCompFailRnlHandoverTgtNotAllowed_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoInterFrameOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoInterFrameOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoInterFrameOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoInterFrameOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoInterFrameOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoInterFrameOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoS1InterEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoS1InterEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoS1InterEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoX2InterEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoX2InterEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoX2InterEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoS1InterEnbOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoS1InterEnbOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoS1InterEnbOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "HoX2InterEnbOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsHoX2InterEnbOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsHoX2InterEnbOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlFailInRadioInfProc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInRadioInfProc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInRadioInfProc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlInvalidCsgId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidCsgId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidCsgId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlFailInTgtSys", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInTgtSys(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailInTgtSys_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnknownTgtId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownTgtId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownTgtId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnknownMmeUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownMmeUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnknownEnbUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownEnbUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnknownPairUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownPairUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownPairUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlTX2relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlTX2RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlTX2RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlReleaseDuetoEUTRANGenReason_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlTS1relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlTS1relocPrepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocPrepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlTS1RelocPrepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlRadioConnectionWithUELost", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioConnectionWithUELost(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioConnectionWithUELost_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUENotAvlblForPSService", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUENotAvlblForPSService(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUENotAvlblForPSService_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlRadioResourceNotAvlbl", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioResourceNotAvlbl(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlRadioResourceNotAvlbl_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlFailureInRadioInterface", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlFailureInRadioInterface(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlFailureInRadioInterface_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlInvalidQOSCombination", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidQOSCombination(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlInvalidQOSCombination_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlInteractionWithOtherProcedure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlInteractionWithOtherProcedure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlInteractionWithOtherProcedure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlUnknownERABID", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownERABID(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlUnknownERABID_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlMultipleERABIDInstances", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlMultipleERABIDInstances(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlMultipleERABIDInstances_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlRedirectionTowards1XRTT", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlRedirectionTowards1XRTT(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlRedirectionTowards1XRTT_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlNotSupportedQCIVal", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlNotSupportedQCIVal(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlNotSupportedQCIVal_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailTlTransResUnavail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailTlTransResUnavail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailTlTransResUnavail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailTlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailTlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailTlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailNasUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailNasUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailNasUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailNasAuthenticationFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailNasAuthenticationFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailNasAuthenticationFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailNasCSGSubscriptionExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailNasCSGSubscriptionExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailNasCSGSubscriptionExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscCtrlProcessingOverload", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscCtrlProcessingOverload(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscCtrlProcessingOverload_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscNotEnoughUserPlaneProcessingRsrc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscHwFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscHwFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscHwFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscOMIntervention", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscOMIntervention(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscOMIntervention_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailMiscUnknownPLMN", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailMiscUnknownPLMN(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailMiscUnknownPLMN_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlInvalidMmeGrpId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlInvalidMmeGrpId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlInvalidMmeGrpId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlHandoverTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlHandoverTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlHandoverTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlUnknownMmeCode", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownMmeCode(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownMmeCode_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlTX2relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlTX2RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlTX2RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlUnknownNewEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownNewEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlUnknownOldEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownOldEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlUnknownPairEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlUnknownPairEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlValueOutofAllowedRange", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlValueOutofAllowedRange(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlValueOutofAllowedRange_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlMultipleERABIDInstances", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlMultipleERABIDInstances(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlMultipleERABIDInstances_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailRnlNotSupportedQCIVal", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailRnlNotSupportedQCIVal(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailRnlNotSupportedQCIVal_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailTnlTransResUnAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailTnlTransResUnAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransResUnAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailTnlTransSyntaxError", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailTnlTransSyntaxError(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransSyntaxError_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailMiscControlProcessingOverload", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailMiscControlProcessingOverload(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailMiscControlProcessingOverload_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailMiscHwFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailMiscHwFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailMiscHwFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailMiscOMIntervention", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailMiscOMIntervention(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailMiscOMIntervention_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailMiscEnoughProcessingResource", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailMiscEnoughProcessingResource(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailMiscEnoughProcessingResource_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlFailInRadioInfProc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlFailInRadioInfProc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlFailInRadioInfProc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlInvalidCsgId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidCsgId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidCsgId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlHOCancelled", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlHOCancelled(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlHOCancelled_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlFailInTgtSys", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlFailInTgtSys(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlFailInTgtSys_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnknownTgtId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownTgtId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownTgtId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnknownMmeUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownMmeUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnknownEnbUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownEnbUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnknownPairUeS1apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownPairUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownPairUeS1ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlTX2relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlTX2RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlTX2RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlReleaseDuetoEUTRANGenReason_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlTS1relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlTS1relocPrepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocPrepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlTS1RelocPrepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlRadioConnectionWithUELost", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlRadioConnectionWithUELost(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlRadioConnectionWithUELost_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUENotAvlblForPSService", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUENotAvlblForPSService(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUENotAvlblForPSService_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlRadioResourceNotAvlbl", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlRadioResourceNotAvlbl(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlRadioResourceNotAvlbl_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlFailureInRadioInterface", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlFailureInRadioInterface(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlFailureInRadioInterface_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlInvalidQOSCombination", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidQOSCombination(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlInvalidQOSCombination_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlInteractionWithOtherProcedure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlInteractionWithOtherProcedure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlInteractionWithOtherProcedure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlUnknownERABID", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownERABID(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlUnknownERABID_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlMultipleERABIDInstances", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlMultipleERABIDInstances(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlMultipleERABIDInstances_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlRedirectionTowards1XRTT", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlRedirectionTowards1XRTT(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlRedirectionTowards1XRTT_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlNotSupportedQCIVal", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlNotSupportedQCIVal(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlNotSupportedQCIVal_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailTlTransResUnavail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailTlTransResUnavail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailTlTransResUnavail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailTlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailTlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailTlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailNasUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailNasUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailNasUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailNasAuthenticationFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailNasAuthenticationFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailNasAuthenticationFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailNasCSGSubscriptionExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailNasCSGSubscriptionExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailNasCSGSubscriptionExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscCtrlProcessingOverload", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscCtrlProcessingOverload(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscCtrlProcessingOverload_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscNotEnoughUserPlaneProcessingRsrc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscHwFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscHwFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscHwFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscOMIntervention", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscOMIntervention(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscOMIntervention_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailMiscUnknownPLMN", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailMiscUnknownPLMN(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailMiscUnknownPLMN_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlCellNotAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlCellNotAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlCellNotAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlEncAndOrIntgProtectAlgNotSup_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlInvalidMmeGrpId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlInvalidMmeGrpId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlInvalidMmeGrpId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlHandoverTgtNotAllow", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlHandoverTgtNotAllow(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlHandoverTgtNotAllow_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlNoRadioResAvailInTgtCell_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlUnknownMmeCode", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownMmeCode(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownMmeCode_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlTrelocprepExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlTrelocprepExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlTrelocprepExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlTX2relocOverallExpiry", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlTX2RelocOverallExpiry(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlTX2RelocOverallExpiry_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlUnknownNewEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownNewEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownNewEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlUnknownOldEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownOldEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownOldEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlUnknownPairEnbX2apId", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownPairEnbX2ApId(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlUnknownPairEnbX2ApId_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlSwitchOffOngoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlSwitchOffOngoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlSwitchOffOngoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlValueOutofAllowedRange", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlValueOutofAllowedRange(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlValueOutofAllowedRange_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlMultipleERABIDInstances", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlMultipleERABIDInstances(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlMultipleERABIDInstances_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRnlNotSupportedQCIVal", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRnlNotSupportedQCIVal(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRnlNotSupportedQCIVal_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailTnlTransResUnAvail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailTnlTransResUnAvail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailTnlTransResUnAvail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrFlsConstructMsg_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtAbstSynErrRej", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrRej(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrRej_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtMsgNotCompatiblWithRcvrStat_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtSemanticErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtSemanticErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtSemanticErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtTransferSynErr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtTransferSynErr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtTransferSynErr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailMiscControlProcessingOverload", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailMiscControlProcessingOverload(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailMiscControlProcessingOverload_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailMiscHwFailure", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailMiscHwFailure(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailMiscHwFailure_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailMiscOMIntervention", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailMiscOMIntervention(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailMiscOMIntervention_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailMiscEnoughProcessingResource", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailMiscEnoughProcessingResource(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailMiscEnoughProcessingResource_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailMiscUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailMiscUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFrameOutAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFrameOutAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFrameOutAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFrameOutSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFrameOutSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFrameOutSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqInterEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraFreqInterEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraFreqInterEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqInterEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqInterEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqInterEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailCritDiag", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailCritDiag(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailCritDiag_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRnlPartialHO", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRnlPartialHO(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRnlPartialHO_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailRrcSignalHoFail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailRrcSignalHoFail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailRrcSignalHoFail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailTnlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailTnlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailTnlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailCritDiag", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailCritDiag(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailCritDiag_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailTnlTransUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailTnlTransUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailTnlTransUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailRrcSignalHoFail", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailRrcSignalHoFail(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailRrcSignalHoFail_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailPathSwitchTmrExpr", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailPathSwitchTmrExpr(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailPathSwitchTmrExpr_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutPrepFailProtAbstSynErrIgnoreAndNotify_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailProtAbstSynErrIgnoreAndNotify_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "S1IntereNBOutExecFailCritDiag", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsS1IntereNBOutExecFailCritDiag(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsS1IntereNBOutExecFailCritDiag_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "X2IntereNBOutExecFailCritDiag", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsX2IntereNBOutExecFailCritDiag(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsX2IntereNBOutExecFailCritDiag_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttSwitchOffOnGoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttSwitchOffOnGoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttSwitchOffOnGoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttIntraEnbLb", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttIntraEnbLb(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttIntraEnbLb_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutAttUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutAttUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutAttUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccSwitchOffOnGoing", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccSwitchOffOnGoing(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccSwitchOffOnGoing_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccIntraEnbLb", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccIntraEnbLb(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccIntraEnbLb_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccUnspecified", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccUnspecified_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraEnbOutSuccUnknown", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraEnbOutSuccUnknown(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraEnbOutSuccUnknown_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqIntraEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraFreqIntraEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraFreqIntraEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqIntraEnbOutPrepAtt", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqIntraEnbOutPrepAtt(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqIntraEnbOutPrepAtt_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IntraFreqIntraEnbOutExecSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsIntraFreqIntraEnbOutExecSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsIntraFreqIntraEnbOutExecSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InterFreqIntraEnbOutExecSucc", scope = LteHoStatsRowWs.class)
    public JAXBElement<Integer> createLteHoStatsRowWsInterFreqIntraEnbOutExecSucc(Integer value) {
        return new JAXBElement<Integer>(_LteHoStatsRowWsInterFreqIntraEnbOutExecSucc_QNAME, Integer.class, LteHoStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QciIndex", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsQciIndex(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsQciIndex_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialAttemptedToSetup", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsInitialAttemptedToSetup(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsInitialAttemptedToSetup_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SuccessfullyEstablished", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsSuccessfullyEstablished(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsSuccessfullyEstablished_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalAttemptedToSetup", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsAdditionalAttemptedToSetup(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsAdditionalAttemptedToSetup_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalSuccessfullyEstablished", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsAdditionalSuccessfullyEstablished(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsAdditionalSuccessfullyEstablished_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MeanERabSetupTime", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsMeanERabSetupTime(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsMeanERabSetupTime_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "MaxERabSetupTime", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsMaxERabSetupTime(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsMaxERabSetupTime_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerQci", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsReqToReleasePerQci(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsReqToReleasePerQci_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AttemptedToRelease", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsAttemptedToRelease(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsAttemptedToRelease_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SuccessfullyReleased", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsSuccessfullyReleased(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsSuccessfullyReleased_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfReleasedActive", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsNumberOfReleasedActive(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsNumberOfReleasedActive_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AttemptedToModifyQos", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsAttemptedToModifyQos(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsAttemptedToModifyQos_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SuccessfullyModifiedQos", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsSuccessfullyModifiedQos(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsSuccessfullyModifiedQos_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InSessionActivityTimeForERab", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsInSessionActivityTimeForERab(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsInSessionActivityTimeForERab_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SimultaneousERabAvg", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsSimultaneousERabAvg(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsSimultaneousERabAvg_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SimultaneousERabMax", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsSimultaneousERabMax(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsSimultaneousERabMax_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfReleasedActiveNonActive", scope = LteERabPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteERabPerQciStatsRowWsNumberOfReleasedActiveNonActive(Integer value) {
        return new JAXBElement<Integer>(_LteERabPerQciStatsRowWsNumberOfReleasedActiveNonActive_QNAME, Integer.class, LteERabPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialAttemptedToSetupSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialAttemptedToSetupSum(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialAttemptedToSetupSum_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialSuccessfullyEstablishedSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialSuccessfullyEstablishedSum(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialSuccessfullyEstablishedSum_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupSum(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupSum_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupRadioResUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupRadioResUnavailable(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupRadioResUnavailable_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupRadIntProcFailure", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupRadIntProcFailure(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupRadIntProcFailure_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupInvalidQosCombination", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupInvalidQosCombination(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupInvalidQosCombination_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupMultiERabIdInstances", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupMultiERabIdInstances(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupMultiERabIdInstances_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupQciValNotSupported", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupQciValNotSupported(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupQciValNotSupported_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupS1IntraSysHOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupS1IntraSysHOTriggered(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupS1IntraSysHOTriggered_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupS1InterSysHOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupS1InterSysHOTriggered(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupS1InterSysHOTriggered_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupX2HOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupX2HOTriggered(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupX2HOTriggered_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupTransportSrcUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupTransportSrcUnavailable(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupTransportSrcUnavailable_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InitialFailedToSetupCauseUnspecified", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInitialFailedToSetupCauseUnspecified(Integer value) {
        return new JAXBElement<Integer>(_LteERabStatsRowWsInitialFailedToSetupCauseUnspecified_QNAME, Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalAttemptedToSetupSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalAttemptedToSetupSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalAttemptedToSetupSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalSuccessfullyEstablishedSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalSuccessfullyEstablishedSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalSuccessfullyEstablishedSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupRadioResUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupRadioResUnavailable(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupRadioResUnavailable"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupRadIntfProcFailure", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupRadIntfProcFailure(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupRadIntfProcFailure"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupInvalidQosCombination", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupInvalidQosCombination(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupInvalidQosCombination"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupMultiERabIdInstances", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupMultiERabIdInstances(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupMultiERabIdInstances"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupQciValNotSupported", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupQciValNotSupported(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupQciValNotSupported"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupS1IntraSysHOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupS1IntraSysHOTriggered(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupS1IntraSysHOTriggered"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupS1InterSysHOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupS1InterSysHOTriggered(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupS1InterSysHOTriggered"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupX2HOTriggered", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupX2HOTriggered(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupX2HOTriggered"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AdditionalFailedToSetupCauseUnspecified", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAdditionalFailedToSetupCauseUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AdditionalFailedToSetupCauseUnspecified"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseRadResUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseRadResUnavailable(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseRadResUnavailable"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseRadIntfProcFailure", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseRadIntfProcFailure(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseRadIntfProcFailure"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseReduceLoadInServingCell", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseReduceLoadInServingCell(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseReduceLoadInServingCell"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseRelDueToEutranReasons", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseRelDueToEutranReasons(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseRelDueToEutranReasons"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseUserInactivity", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseUserInactivity(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseUserInactivity"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseRadConnWithUeLost", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseRadConnWithUeLost(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseRadConnWithUeLost"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseOamIntervention", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseOamIntervention(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseOamIntervention"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseTransportResourceUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseTransportResourceUnavailable(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseTransportResourceUnavailable"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "ReqToReleasePerCauseTransportCauseUnspecified", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsReqToReleasePerCauseTransportCauseUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "ReqToReleasePerCauseTransportCauseUnspecified"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AttemptedToReleaseSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAttemptedToReleaseSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AttemptedToReleaseSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SuccessfullyReleasedSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsSuccessfullyReleasedSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SuccessfullyReleasedSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToReleaseSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToReleaseSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToReleaseSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToReleaseUnknownERabId", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToReleaseUnknownERabId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToReleaseUnknownERabId"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToReleaseHOFailureInTargetSystem", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToReleaseHOFailureInTargetSystem(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToReleaseHOFailureInTargetSystem"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToReleaseUnknownAllocatedMmeUeS1apId", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToReleaseUnknownAllocatedMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToReleaseUnknownAllocatedMmeUeS1apId"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToReleaseUnknownAllocatedEnbUeS1apId", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToReleaseUnknownAllocatedEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToReleaseUnknownAllocatedEnbUeS1apId"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "NumberOfReleasedActiveSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsNumberOfReleasedActiveSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "NumberOfReleasedActiveSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "AttemptedToModifyQosSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsAttemptedToModifyQosSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "AttemptedToModifyQosSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SuccessfullyModifiedQosSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsSuccessfullyModifiedQosSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SuccessfullyModifiedQosSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosUnknownERabId", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosUnknownERabId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosUnknownERabId"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosMultiERabIdInstances", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosMultiERabIdInstances(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosMultiERabIdInstances"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosRadioResUnavailable", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosRadioResUnavailable(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosRadioResUnavailable"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosRadIntfProcFailure", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosRadIntfProcFailure(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosRadIntfProcFailure"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "FailedToModifyQosInvalidQosCombination", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsFailedToModifyQosInvalidQosCombination(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "FailedToModifyQosInvalidQosCombination"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InSessionActivityTimeForUe", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInSessionActivityTimeForUe(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "InSessionActivityTimeForUe"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "InSessionActivityTimeForERabSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsInSessionActivityTimeForERabSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "InSessionActivityTimeForERabSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SimultaneousERabAvgSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsSimultaneousERabAvgSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SimultaneousERabAvgSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SimultaneousERabMaxSum", scope = LteERabStatsRowWs.class)
    public JAXBElement<Integer> createLteERabStatsRowWsSimultaneousERabMaxSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SimultaneousERabMaxSum"), Integer.class, LteERabStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "CellId", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsCellId(Integer value) {
        return new JAXBElement<Integer>(_LteRachPreamblesSentStatsRowWsCellId_QNAME, Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "QciIndex", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsQciIndex(Integer value) {
        return new JAXBElement<Integer>(_LteRruPerQciStatsRowWsQciIndex_QNAME, Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduBitrateDlAvg", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsPdcpSduBitrateDlAvg(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduBitrateDlAvg"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduBitrateUlAvg", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsPdcpSduBitrateUlAvg(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduBitrateUlAvg"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeActiveDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsUeActiveDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeActiveDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeActiveUl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsUeActiveUl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeActiveUl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduDelayDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsPdcpSduDelayDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduDelayDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduDropRateDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Float> createLteRbPerQciStatsRowWsPdcpSduDropRateDl(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduDropRateDl"), Float.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduAirLossRateDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Float> createLteRbPerQciStatsRowWsPdcpSduAirLossRateDl(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduAirLossRateDl"), Float.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpSduLossRateUl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Float> createLteRbPerQciStatsRowWsPdcpSduLossRateUl(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "PdcpSduLossRateUl"), Float.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsIpThroughputDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "IpThroughputDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpThroughputUl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsIpThroughputUl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "IpThroughputUl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficKbpsDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsPdcpTrafficKbpsDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficKbpsUl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsPdcpTrafficKbpsUl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficKbpsUl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficBytesDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRbPerQciStatsRowWsPdcpTrafficBytesDl(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficBytesDl"), Long.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "PdcpTrafficBytesUl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Long> createLteRbPerQciStatsRowWsPdcpTrafficBytesUl(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "PdcpTrafficBytesUl"), Long.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "RbDlIpLatency", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsRbDlIpLatency(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "RbDlIpLatency"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpLateTimeDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsIpLateTimeDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "IpLateTimeDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "IpLateSamplesDl", scope = LteRbPerQciStatsRowWs.class)
    public JAXBElement<Integer> createLteRbPerQciStatsRowWsIpLateSamplesDl(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "IpLateSamplesDl"), Integer.class, LteRbPerQciStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduBitrateDlAvgSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbPdcpSduBitrateDlAvgSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduBitrateDlAvgSum"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduBitrateUlAvgSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbPdcpSduBitrateUlAvgSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduBitrateUlAvgSum"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduBitrateDlMax", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbPdcpSduBitrateDlMax(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduBitrateDlMax"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduBitrateUlMax", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbPdcpSduBitrateUlMax(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduBitrateUlMax"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbPdcpSduBitrateDlAvg", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsSrbPdcpSduBitrateDlAvg(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SrbPdcpSduBitrateDlAvg"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "SrbPdcpSduBitrateUlAvg", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsSrbPdcpSduBitrateUlAvg(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "SrbPdcpSduBitrateUlAvg"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbUeActiveDlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbUeActiveDlSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbUeActiveDlSum"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbUeActiveUlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbUeActiveUlSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbUeActiveUlSum"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduDelayDlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbPdcpSduDelayDlSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduDelayDlSum"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduDropRateDlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Float> createLteRbStatsRowWsDrbPdcpSduDropRateDlSum(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduDropRateDlSum"), Float.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduAirLossRateDlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Float> createLteRbStatsRowWsDrbPdcpSduAirLossRateDlSum(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduAirLossRateDlSum"), Float.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbPdcpSduLossRateUlSum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Float> createLteRbStatsRowWsDrbPdcpSduLossRateUlSum(Float value) {
        return new JAXBElement<Float>(new QName("http://Airspan.Netspan.WebServices", "DrbPdcpSduLossRateUlSum"), Float.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbMaxDLThCapacity", scope = LteRbStatsRowWs.class)
    public JAXBElement<Long> createLteRbStatsRowWsDrbMaxDLThCapacity(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "DrbMaxDLThCapacity"), Long.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbDLThCapacitySum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Long> createLteRbStatsRowWsDrbDLThCapacitySum(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "DrbDLThCapacitySum"), Long.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbDLThCapacityAvg", scope = LteRbStatsRowWs.class)
    public JAXBElement<Double> createLteRbStatsRowWsDrbDLThCapacityAvg(Double value) {
        return new JAXBElement<Double>(new QName("http://Airspan.Netspan.WebServices", "DrbDLThCapacityAvg"), Double.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbDLNumOfSec", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbDLNumOfSec(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbDLNumOfSec"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbMaxULThCapacity", scope = LteRbStatsRowWs.class)
    public JAXBElement<Long> createLteRbStatsRowWsDrbMaxULThCapacity(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "DrbMaxULThCapacity"), Long.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbULThCapacitySum", scope = LteRbStatsRowWs.class)
    public JAXBElement<Long> createLteRbStatsRowWsDrbULThCapacitySum(Long value) {
        return new JAXBElement<Long>(new QName("http://Airspan.Netspan.WebServices", "DrbULThCapacitySum"), Long.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbULThCapacityAvg", scope = LteRbStatsRowWs.class)
    public JAXBElement<Double> createLteRbStatsRowWsDrbULThCapacityAvg(Double value) {
        return new JAXBElement<Double>(new QName("http://Airspan.Netspan.WebServices", "DrbULThCapacityAvg"), Double.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "DrbULNumOfSec", scope = LteRbStatsRowWs.class)
    public JAXBElement<Integer> createLteRbStatsRowWsDrbULNumOfSec(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "DrbULNumOfSec"), Integer.class, LteRbStatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "GranularityPeriod", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsGranularityPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatsServerDiskRowWsGranularityPeriod_QNAME, Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnEstabAtt", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnEstabAtt(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnEstabAtt"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnEstabSucc", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnEstabSucc(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnEstabSucc"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwUnspecified", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwUnspecified"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwFailInTargEPCEnbOrTargSys"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwFailInRadioInterfProc", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwFailInRadioInterfProc(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwFailInRadioInterfProc"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1apId", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocMmeUeS1apId"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1apId", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1ApId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwUnknownOrAlrdAllocEnbUeS1apId"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1apId", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1ApId(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwUnknownOrInconstPairOfUES1apId"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabRNwFailUENotAvailForPSService", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabRNwFailUENotAvailForPSService(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabRNwFailUENotAvailForPSService"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwInteractionWitOtherProc", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwInteractionWitOtherProc(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwInteractionWitOtherProc"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwRedirectionTowards1xRTT", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwRedirectionTowards1XRTT(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwRedirectionTowards1xRTT"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwNotSupportedQCIVal", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwNotSupportedQCIVal(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwNotSupportedQCIVal"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailRNwInvalidQosComb", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailRNwInvalidQosComb(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailRNwInvalidQosComb"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailTPTransportResunavail", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailTPTransportResunavail(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailTPTransportResunavail"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailTPUnspecified", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailTPUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailTPUnspecified"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailNasCSGSubscriptionExpiry", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailNasCSGSubscriptionExpiry(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailNasCSGSubscriptionExpiry"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailNasAuthenticationfail", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailNasAuthenticationfail(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailNasAuthenticationfail"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailNasUnspecified", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailNasUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailNasUnspecified"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailProtAbstSynOrTransferSynOrSemanticErr"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailProtAbsSynErrFlsContructMsg"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailProtMsgNotCompatibleWithRcvState"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailProtUnspecified", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailProtUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailProtUnspecified"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscCtrlProcOvld", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscCtrlProcOvld(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscCtrlProcOvld"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscNotEnoughUpResAvail", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscNotEnoughUpResAvail(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscNotEnoughUpResAvail"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscHwErr", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscHwErr(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscHwErr"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscOAMInt", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscOAMInt(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscOAMInt"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscUnspecified", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscUnspecified(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscUnspecified"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailMiscUnknownPlmn", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailMiscUnknownPlmn(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailMiscUnknownPlmn"), Integer.class, LteS1StatsRowWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Airspan.Netspan.WebServices", name = "UeAssocS1ConnestabFailSum", scope = LteS1StatsRowWs.class)
    public JAXBElement<Integer> createLteS1StatsRowWsUeAssocS1ConnestabFailSum(Integer value) {
        return new JAXBElement<Integer>(new QName("http://Airspan.Netspan.WebServices", "UeAssocS1ConnestabFailSum"), Integer.class, LteS1StatsRowWs.class, value);
    }

}
