
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbManagementProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbManagementProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GranularityPeriod" type="{http://Airspan.Netspan.WebServices}GranularityPeriod" minOccurs="0"/&gt;
 *         &lt;element name="HourlyDailyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StatsCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnrStatusCollectionIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaintenanceWindowConfiguration" type="{http://Airspan.Netspan.WebServices}MaintenanceWindowConfigurationWs" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionEstablishment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionReestablishment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionDrx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcCallDrops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcReconfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcImmci" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcDataInactivityTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionRejectDueToMmeOverload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcThresholdBasedMeasurements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabModify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabRelease" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabInSessionTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabSimultaneousErabs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabInSessionActivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntraLteHoForward" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntraLteHoOutgoing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntraLteHoIncoming" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntraLteHoTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMobHOs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMobCsfb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMobRim" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMobCsfbOverall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosCellPdcpSduBitRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosPacketDelayDropRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosPacketLossRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosIpThroughputLatencyMeasurements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosActiveUes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosThroughputCapacity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosPdcpTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosRohc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosGtpu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruPdcch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruPrbUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruTbUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruRachMeasurements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruCellUnavailability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruCarrierAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RruLightComp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1UeAssociatedLogicalS1Connections" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1Paging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipCpuUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipMemoryUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipRebootAndUptime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipEthernetUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipMmeOverload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfWidebandCqi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfAntennaRssi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfNoiseAndInterference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfCodeWordAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfCaUes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfCaWidebandCqi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfCaMacTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfTimeAdvance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BhQosD1Cbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BhQosD2Cbr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BhQosHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BhQosMeasurementsTwamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PwsEtws" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PwsCmas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsM2ConnectionSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsM2SessionStart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsM2SessionStop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsSyncPduCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsSyncByteCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MbmsSyncCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LinkCodewordAllocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LinkUplinkAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LinkHarq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonIntraEnbLoadBalancing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonDicic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonAutoPci" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonMro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonNeighborManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonPositioningMeasurements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SonTpm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosPrbUsagePerQci" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosCaTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RbQosMacTraffic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EquipSynchronization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VolteMuting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VolteStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CarrierTxPower" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DynamicAcb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcCongestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ErabHardBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RfUePrachInitialTimingAdvance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EventHandlingMode" type="{http://Airspan.Netspan.WebServices}EventHandlingModes" minOccurs="0"/&gt;
 *         &lt;element name="CoreDumpIsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileUploadDestination" type="{http://Airspan.Netspan.WebServices}FileUploadDestinationsWs" minOccurs="0"/&gt;
 *         &lt;element name="FileUploadFolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsFileUploadDestinationSsl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FileServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbManagementProfileParams", propOrder = {
    "granularityPeriod",
    "hourlyDailyEnabled",
    "statsCollectionIsEnabled",
    "anrStatusCollectionIsEnabled",
    "maintenanceWindowIsEnabled",
    "maintenanceWindowConfiguration",
    "rrcConnectionEstablishment",
    "rrcConnectionReestablishment",
    "rrcConnectionRelease",
    "rrcConnections",
    "rrcConnectionDrx",
    "rrcCallDrops",
    "rrcReconfiguration",
    "rrcImmci",
    "rrcDataInactivityTime",
    "rrcConnectionRejectDueToMmeOverload",
    "rrcThresholdBasedMeasurements",
    "erabSetup",
    "erabModify",
    "erabRelease",
    "erabInSessionTime",
    "erabSimultaneousErabs",
    "erabInSessionActivity",
    "intraLteHoForward",
    "intraLteHoOutgoing",
    "intraLteHoIncoming",
    "intraLteHoTimes",
    "interRatMobHOs",
    "interRatMobCsfb",
    "interRatMobRim",
    "interRatMobCsfbOverall",
    "rbQosCellPdcpSduBitRate",
    "rbQosPacketDelayDropRate",
    "rbQosPacketLossRate",
    "rbQosIpThroughputLatencyMeasurements",
    "rbQosActiveUes",
    "rbQosThroughputCapacity",
    "rbQosPdcpTraffic",
    "rbQosRohc",
    "rbQosGtpu",
    "rruPdcch",
    "rruPrbUsage",
    "rruTbUsage",
    "rruRachMeasurements",
    "rruCellUnavailability",
    "rruCarrierAggregation",
    "rruLightComp",
    "s1UeAssociatedLogicalS1Connections",
    "s1Paging",
    "equipCpuUsage",
    "equipMemoryUsage",
    "equipRebootAndUptime",
    "equipEthernetUsage",
    "equipMmeOverload",
    "rfWidebandCqi",
    "rfAntennaRssi",
    "rfNoiseAndInterference",
    "rfCodeWordAllocation",
    "rfCaUes",
    "rfCaWidebandCqi",
    "rfCaMacTraffic",
    "rfTimeAdvance",
    "bhQosD1Cbr",
    "bhQosD2Cbr",
    "bhQosHeartbeat",
    "bhQosMeasurementsTwamp",
    "pwsEtws",
    "pwsCmas",
    "mbmsM2ConnectionSetup",
    "mbmsM2SessionStart",
    "mbmsM2SessionStop",
    "mbmsSyncPduCount",
    "mbmsSyncByteCount",
    "mbmsSyncCount",
    "linkCodewordAllocations",
    "linkUplinkAllocation",
    "linkHarq",
    "sonIntraEnbLoadBalancing",
    "sonDicic",
    "sonAutoPci",
    "sonMro",
    "sonNeighborManagement",
    "sonPositioningMeasurements",
    "sonTpm",
    "rbQosPrbUsagePerQci",
    "rbQosCaTraffic",
    "rbQosMacTraffic",
    "equipSynchronization",
    "volteMuting",
    "volteStatistics",
    "carrierTxPower",
    "dynamicAcb",
    "rrcCongestion",
    "erabHardBlock",
    "rfUePrachInitialTimingAdvance",
    "eventHandlingMode",
    "coreDumpIsEnabled",
    "fileUploadDestination",
    "fileUploadFolder",
    "isFileUploadDestinationSsl",
    "fileServerName"
})
@XmlSeeAlso({
    EnbManagementProfile.class
})
public class EnbManagementProfileParams {

    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> granularityPeriod;
    @XmlElementRef(name = "HourlyDailyEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hourlyDailyEnabled;
    @XmlElementRef(name = "StatsCollectionIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> statsCollectionIsEnabled;
    @XmlElementRef(name = "AnrStatusCollectionIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anrStatusCollectionIsEnabled;
    @XmlElementRef(name = "MaintenanceWindowIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maintenanceWindowIsEnabled;
    @XmlElement(name = "MaintenanceWindowConfiguration")
    protected MaintenanceWindowConfigurationWs maintenanceWindowConfiguration;
    @XmlElementRef(name = "RrcConnectionEstablishment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnectionEstablishment;
    @XmlElementRef(name = "RrcConnectionReestablishment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnectionReestablishment;
    @XmlElementRef(name = "RrcConnectionRelease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnectionRelease;
    @XmlElementRef(name = "RrcConnections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnections;
    @XmlElementRef(name = "RrcConnectionDrx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnectionDrx;
    @XmlElementRef(name = "RrcCallDrops", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcCallDrops;
    @XmlElementRef(name = "RrcReconfiguration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcReconfiguration;
    @XmlElementRef(name = "RrcImmci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcImmci;
    @XmlElementRef(name = "RrcDataInactivityTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcDataInactivityTime;
    @XmlElementRef(name = "RrcConnectionRejectDueToMmeOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcConnectionRejectDueToMmeOverload;
    @XmlElementRef(name = "RrcThresholdBasedMeasurements", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcThresholdBasedMeasurements;
    @XmlElementRef(name = "ErabSetup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabSetup;
    @XmlElementRef(name = "ErabModify", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabModify;
    @XmlElementRef(name = "ErabRelease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabRelease;
    @XmlElementRef(name = "ErabInSessionTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabInSessionTime;
    @XmlElementRef(name = "ErabSimultaneousErabs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabSimultaneousErabs;
    @XmlElementRef(name = "ErabInSessionActivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabInSessionActivity;
    @XmlElementRef(name = "IntraLteHoForward", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraLteHoForward;
    @XmlElementRef(name = "IntraLteHoOutgoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraLteHoOutgoing;
    @XmlElementRef(name = "IntraLteHoIncoming", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraLteHoIncoming;
    @XmlElementRef(name = "IntraLteHoTimes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> intraLteHoTimes;
    @XmlElementRef(name = "InterRatMobHOs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatMobHOs;
    @XmlElementRef(name = "InterRatMobCsfb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatMobCsfb;
    @XmlElementRef(name = "InterRatMobRim", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatMobRim;
    @XmlElementRef(name = "InterRatMobCsfbOverall", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interRatMobCsfbOverall;
    @XmlElementRef(name = "RbQosCellPdcpSduBitRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosCellPdcpSduBitRate;
    @XmlElementRef(name = "RbQosPacketDelayDropRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosPacketDelayDropRate;
    @XmlElementRef(name = "RbQosPacketLossRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosPacketLossRate;
    @XmlElementRef(name = "RbQosIpThroughputLatencyMeasurements", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosIpThroughputLatencyMeasurements;
    @XmlElementRef(name = "RbQosActiveUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosActiveUes;
    @XmlElementRef(name = "RbQosThroughputCapacity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosThroughputCapacity;
    @XmlElementRef(name = "RbQosPdcpTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosPdcpTraffic;
    @XmlElementRef(name = "RbQosRohc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosRohc;
    @XmlElementRef(name = "RbQosGtpu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosGtpu;
    @XmlElementRef(name = "RruPdcch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruPdcch;
    @XmlElementRef(name = "RruPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruPrbUsage;
    @XmlElementRef(name = "RruTbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruTbUsage;
    @XmlElementRef(name = "RruRachMeasurements", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruRachMeasurements;
    @XmlElementRef(name = "RruCellUnavailability", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruCellUnavailability;
    @XmlElementRef(name = "RruCarrierAggregation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruCarrierAggregation;
    @XmlElementRef(name = "RruLightComp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rruLightComp;
    @XmlElementRef(name = "S1UeAssociatedLogicalS1Connections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1UeAssociatedLogicalS1Connections;
    @XmlElementRef(name = "S1Paging", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1Paging;
    @XmlElementRef(name = "EquipCpuUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipCpuUsage;
    @XmlElementRef(name = "EquipMemoryUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipMemoryUsage;
    @XmlElementRef(name = "EquipRebootAndUptime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipRebootAndUptime;
    @XmlElementRef(name = "EquipEthernetUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipEthernetUsage;
    @XmlElementRef(name = "EquipMmeOverload", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipMmeOverload;
    @XmlElementRef(name = "RfWidebandCqi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfWidebandCqi;
    @XmlElementRef(name = "RfAntennaRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfAntennaRssi;
    @XmlElementRef(name = "RfNoiseAndInterference", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfNoiseAndInterference;
    @XmlElementRef(name = "RfCodeWordAllocation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfCodeWordAllocation;
    @XmlElementRef(name = "RfCaUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfCaUes;
    @XmlElementRef(name = "RfCaWidebandCqi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfCaWidebandCqi;
    @XmlElementRef(name = "RfCaMacTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfCaMacTraffic;
    @XmlElementRef(name = "RfTimeAdvance", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfTimeAdvance;
    @XmlElementRef(name = "BhQosD1Cbr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bhQosD1Cbr;
    @XmlElementRef(name = "BhQosD2Cbr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bhQosD2Cbr;
    @XmlElementRef(name = "BhQosHeartbeat", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bhQosHeartbeat;
    @XmlElementRef(name = "BhQosMeasurementsTwamp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bhQosMeasurementsTwamp;
    @XmlElementRef(name = "PwsEtws", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pwsEtws;
    @XmlElementRef(name = "PwsCmas", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pwsCmas;
    @XmlElementRef(name = "MbmsM2ConnectionSetup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsM2ConnectionSetup;
    @XmlElementRef(name = "MbmsM2SessionStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsM2SessionStart;
    @XmlElementRef(name = "MbmsM2SessionStop", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsM2SessionStop;
    @XmlElementRef(name = "MbmsSyncPduCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsSyncPduCount;
    @XmlElementRef(name = "MbmsSyncByteCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsSyncByteCount;
    @XmlElementRef(name = "MbmsSyncCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mbmsSyncCount;
    @XmlElementRef(name = "LinkCodewordAllocations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> linkCodewordAllocations;
    @XmlElementRef(name = "LinkUplinkAllocation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> linkUplinkAllocation;
    @XmlElementRef(name = "LinkHarq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> linkHarq;
    @XmlElementRef(name = "SonIntraEnbLoadBalancing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonIntraEnbLoadBalancing;
    @XmlElementRef(name = "SonDicic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonDicic;
    @XmlElementRef(name = "SonAutoPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonAutoPci;
    @XmlElementRef(name = "SonMro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonMro;
    @XmlElementRef(name = "SonNeighborManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonNeighborManagement;
    @XmlElementRef(name = "SonPositioningMeasurements", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonPositioningMeasurements;
    @XmlElementRef(name = "SonTpm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sonTpm;
    @XmlElementRef(name = "RbQosPrbUsagePerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosPrbUsagePerQci;
    @XmlElementRef(name = "RbQosCaTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosCaTraffic;
    @XmlElementRef(name = "RbQosMacTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rbQosMacTraffic;
    @XmlElementRef(name = "EquipSynchronization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> equipSynchronization;
    @XmlElementRef(name = "VolteMuting", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteMuting;
    @XmlElementRef(name = "VolteStatistics", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteStatistics;
    @XmlElementRef(name = "CarrierTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> carrierTxPower;
    @XmlElementRef(name = "DynamicAcb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dynamicAcb;
    @XmlElementRef(name = "RrcCongestion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcCongestion;
    @XmlElementRef(name = "ErabHardBlock", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> erabHardBlock;
    @XmlElementRef(name = "RfUePrachInitialTimingAdvance", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rfUePrachInitialTimingAdvance;
    @XmlElementRef(name = "EventHandlingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventHandlingModes> eventHandlingMode;
    @XmlElementRef(name = "CoreDumpIsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> coreDumpIsEnabled;
    @XmlElementRef(name = "FileUploadDestination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<FileUploadDestinationsWs> fileUploadDestination;
    @XmlElement(name = "FileUploadFolder")
    protected String fileUploadFolder;
    @XmlElementRef(name = "IsFileUploadDestinationSsl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isFileUploadDestinationSsl;
    @XmlElement(name = "FileServerName")
    protected String fileServerName;

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<String> value) {
        this.granularityPeriod = value;
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
     * Gets the value of the statsCollectionIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getStatsCollectionIsEnabled() {
        return statsCollectionIsEnabled;
    }

    /**
     * Sets the value of the statsCollectionIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setStatsCollectionIsEnabled(JAXBElement<Boolean> value) {
        this.statsCollectionIsEnabled = value;
    }

    /**
     * Gets the value of the anrStatusCollectionIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAnrStatusCollectionIsEnabled() {
        return anrStatusCollectionIsEnabled;
    }

    /**
     * Sets the value of the anrStatusCollectionIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAnrStatusCollectionIsEnabled(JAXBElement<Boolean> value) {
        this.anrStatusCollectionIsEnabled = value;
    }

    /**
     * Gets the value of the maintenanceWindowIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaintenanceWindowIsEnabled() {
        return maintenanceWindowIsEnabled;
    }

    /**
     * Sets the value of the maintenanceWindowIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaintenanceWindowIsEnabled(JAXBElement<Boolean> value) {
        this.maintenanceWindowIsEnabled = value;
    }

    /**
     * Gets the value of the maintenanceWindowConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceWindowConfigurationWs }
     *     
     */
    public MaintenanceWindowConfigurationWs getMaintenanceWindowConfiguration() {
        return maintenanceWindowConfiguration;
    }

    /**
     * Sets the value of the maintenanceWindowConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceWindowConfigurationWs }
     *     
     */
    public void setMaintenanceWindowConfiguration(MaintenanceWindowConfigurationWs value) {
        this.maintenanceWindowConfiguration = value;
    }

    /**
     * Gets the value of the rrcConnectionEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnectionEstablishment() {
        return rrcConnectionEstablishment;
    }

    /**
     * Sets the value of the rrcConnectionEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnectionEstablishment(JAXBElement<Boolean> value) {
        this.rrcConnectionEstablishment = value;
    }

    /**
     * Gets the value of the rrcConnectionReestablishment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnectionReestablishment() {
        return rrcConnectionReestablishment;
    }

    /**
     * Sets the value of the rrcConnectionReestablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnectionReestablishment(JAXBElement<Boolean> value) {
        this.rrcConnectionReestablishment = value;
    }

    /**
     * Gets the value of the rrcConnectionRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnectionRelease() {
        return rrcConnectionRelease;
    }

    /**
     * Sets the value of the rrcConnectionRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnectionRelease(JAXBElement<Boolean> value) {
        this.rrcConnectionRelease = value;
    }

    /**
     * Gets the value of the rrcConnections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnections() {
        return rrcConnections;
    }

    /**
     * Sets the value of the rrcConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnections(JAXBElement<Boolean> value) {
        this.rrcConnections = value;
    }

    /**
     * Gets the value of the rrcConnectionDrx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnectionDrx() {
        return rrcConnectionDrx;
    }

    /**
     * Sets the value of the rrcConnectionDrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnectionDrx(JAXBElement<Boolean> value) {
        this.rrcConnectionDrx = value;
    }

    /**
     * Gets the value of the rrcCallDrops property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcCallDrops() {
        return rrcCallDrops;
    }

    /**
     * Sets the value of the rrcCallDrops property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcCallDrops(JAXBElement<Boolean> value) {
        this.rrcCallDrops = value;
    }

    /**
     * Gets the value of the rrcReconfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcReconfiguration() {
        return rrcReconfiguration;
    }

    /**
     * Sets the value of the rrcReconfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcReconfiguration(JAXBElement<Boolean> value) {
        this.rrcReconfiguration = value;
    }

    /**
     * Gets the value of the rrcImmci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcImmci() {
        return rrcImmci;
    }

    /**
     * Sets the value of the rrcImmci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcImmci(JAXBElement<Boolean> value) {
        this.rrcImmci = value;
    }

    /**
     * Gets the value of the rrcDataInactivityTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcDataInactivityTime() {
        return rrcDataInactivityTime;
    }

    /**
     * Sets the value of the rrcDataInactivityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcDataInactivityTime(JAXBElement<Boolean> value) {
        this.rrcDataInactivityTime = value;
    }

    /**
     * Gets the value of the rrcConnectionRejectDueToMmeOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcConnectionRejectDueToMmeOverload() {
        return rrcConnectionRejectDueToMmeOverload;
    }

    /**
     * Sets the value of the rrcConnectionRejectDueToMmeOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcConnectionRejectDueToMmeOverload(JAXBElement<Boolean> value) {
        this.rrcConnectionRejectDueToMmeOverload = value;
    }

    /**
     * Gets the value of the rrcThresholdBasedMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcThresholdBasedMeasurements() {
        return rrcThresholdBasedMeasurements;
    }

    /**
     * Sets the value of the rrcThresholdBasedMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcThresholdBasedMeasurements(JAXBElement<Boolean> value) {
        this.rrcThresholdBasedMeasurements = value;
    }

    /**
     * Gets the value of the erabSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabSetup() {
        return erabSetup;
    }

    /**
     * Sets the value of the erabSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabSetup(JAXBElement<Boolean> value) {
        this.erabSetup = value;
    }

    /**
     * Gets the value of the erabModify property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabModify() {
        return erabModify;
    }

    /**
     * Sets the value of the erabModify property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabModify(JAXBElement<Boolean> value) {
        this.erabModify = value;
    }

    /**
     * Gets the value of the erabRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabRelease() {
        return erabRelease;
    }

    /**
     * Sets the value of the erabRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabRelease(JAXBElement<Boolean> value) {
        this.erabRelease = value;
    }

    /**
     * Gets the value of the erabInSessionTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabInSessionTime() {
        return erabInSessionTime;
    }

    /**
     * Sets the value of the erabInSessionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabInSessionTime(JAXBElement<Boolean> value) {
        this.erabInSessionTime = value;
    }

    /**
     * Gets the value of the erabSimultaneousErabs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabSimultaneousErabs() {
        return erabSimultaneousErabs;
    }

    /**
     * Sets the value of the erabSimultaneousErabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabSimultaneousErabs(JAXBElement<Boolean> value) {
        this.erabSimultaneousErabs = value;
    }

    /**
     * Gets the value of the erabInSessionActivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabInSessionActivity() {
        return erabInSessionActivity;
    }

    /**
     * Sets the value of the erabInSessionActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabInSessionActivity(JAXBElement<Boolean> value) {
        this.erabInSessionActivity = value;
    }

    /**
     * Gets the value of the intraLteHoForward property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraLteHoForward() {
        return intraLteHoForward;
    }

    /**
     * Sets the value of the intraLteHoForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraLteHoForward(JAXBElement<Boolean> value) {
        this.intraLteHoForward = value;
    }

    /**
     * Gets the value of the intraLteHoOutgoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraLteHoOutgoing() {
        return intraLteHoOutgoing;
    }

    /**
     * Sets the value of the intraLteHoOutgoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraLteHoOutgoing(JAXBElement<Boolean> value) {
        this.intraLteHoOutgoing = value;
    }

    /**
     * Gets the value of the intraLteHoIncoming property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraLteHoIncoming() {
        return intraLteHoIncoming;
    }

    /**
     * Sets the value of the intraLteHoIncoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraLteHoIncoming(JAXBElement<Boolean> value) {
        this.intraLteHoIncoming = value;
    }

    /**
     * Gets the value of the intraLteHoTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIntraLteHoTimes() {
        return intraLteHoTimes;
    }

    /**
     * Sets the value of the intraLteHoTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIntraLteHoTimes(JAXBElement<Boolean> value) {
        this.intraLteHoTimes = value;
    }

    /**
     * Gets the value of the interRatMobHOs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatMobHOs() {
        return interRatMobHOs;
    }

    /**
     * Sets the value of the interRatMobHOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatMobHOs(JAXBElement<Boolean> value) {
        this.interRatMobHOs = value;
    }

    /**
     * Gets the value of the interRatMobCsfb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatMobCsfb() {
        return interRatMobCsfb;
    }

    /**
     * Sets the value of the interRatMobCsfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatMobCsfb(JAXBElement<Boolean> value) {
        this.interRatMobCsfb = value;
    }

    /**
     * Gets the value of the interRatMobRim property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatMobRim() {
        return interRatMobRim;
    }

    /**
     * Sets the value of the interRatMobRim property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatMobRim(JAXBElement<Boolean> value) {
        this.interRatMobRim = value;
    }

    /**
     * Gets the value of the interRatMobCsfbOverall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterRatMobCsfbOverall() {
        return interRatMobCsfbOverall;
    }

    /**
     * Sets the value of the interRatMobCsfbOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterRatMobCsfbOverall(JAXBElement<Boolean> value) {
        this.interRatMobCsfbOverall = value;
    }

    /**
     * Gets the value of the rbQosCellPdcpSduBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosCellPdcpSduBitRate() {
        return rbQosCellPdcpSduBitRate;
    }

    /**
     * Sets the value of the rbQosCellPdcpSduBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosCellPdcpSduBitRate(JAXBElement<Boolean> value) {
        this.rbQosCellPdcpSduBitRate = value;
    }

    /**
     * Gets the value of the rbQosPacketDelayDropRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosPacketDelayDropRate() {
        return rbQosPacketDelayDropRate;
    }

    /**
     * Sets the value of the rbQosPacketDelayDropRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosPacketDelayDropRate(JAXBElement<Boolean> value) {
        this.rbQosPacketDelayDropRate = value;
    }

    /**
     * Gets the value of the rbQosPacketLossRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosPacketLossRate() {
        return rbQosPacketLossRate;
    }

    /**
     * Sets the value of the rbQosPacketLossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosPacketLossRate(JAXBElement<Boolean> value) {
        this.rbQosPacketLossRate = value;
    }

    /**
     * Gets the value of the rbQosIpThroughputLatencyMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosIpThroughputLatencyMeasurements() {
        return rbQosIpThroughputLatencyMeasurements;
    }

    /**
     * Sets the value of the rbQosIpThroughputLatencyMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosIpThroughputLatencyMeasurements(JAXBElement<Boolean> value) {
        this.rbQosIpThroughputLatencyMeasurements = value;
    }

    /**
     * Gets the value of the rbQosActiveUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosActiveUes() {
        return rbQosActiveUes;
    }

    /**
     * Sets the value of the rbQosActiveUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosActiveUes(JAXBElement<Boolean> value) {
        this.rbQosActiveUes = value;
    }

    /**
     * Gets the value of the rbQosThroughputCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosThroughputCapacity() {
        return rbQosThroughputCapacity;
    }

    /**
     * Sets the value of the rbQosThroughputCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosThroughputCapacity(JAXBElement<Boolean> value) {
        this.rbQosThroughputCapacity = value;
    }

    /**
     * Gets the value of the rbQosPdcpTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosPdcpTraffic() {
        return rbQosPdcpTraffic;
    }

    /**
     * Sets the value of the rbQosPdcpTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosPdcpTraffic(JAXBElement<Boolean> value) {
        this.rbQosPdcpTraffic = value;
    }

    /**
     * Gets the value of the rbQosRohc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosRohc() {
        return rbQosRohc;
    }

    /**
     * Sets the value of the rbQosRohc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosRohc(JAXBElement<Boolean> value) {
        this.rbQosRohc = value;
    }

    /**
     * Gets the value of the rbQosGtpu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosGtpu() {
        return rbQosGtpu;
    }

    /**
     * Sets the value of the rbQosGtpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosGtpu(JAXBElement<Boolean> value) {
        this.rbQosGtpu = value;
    }

    /**
     * Gets the value of the rruPdcch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruPdcch() {
        return rruPdcch;
    }

    /**
     * Sets the value of the rruPdcch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruPdcch(JAXBElement<Boolean> value) {
        this.rruPdcch = value;
    }

    /**
     * Gets the value of the rruPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruPrbUsage() {
        return rruPrbUsage;
    }

    /**
     * Sets the value of the rruPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruPrbUsage(JAXBElement<Boolean> value) {
        this.rruPrbUsage = value;
    }

    /**
     * Gets the value of the rruTbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruTbUsage() {
        return rruTbUsage;
    }

    /**
     * Sets the value of the rruTbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruTbUsage(JAXBElement<Boolean> value) {
        this.rruTbUsage = value;
    }

    /**
     * Gets the value of the rruRachMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruRachMeasurements() {
        return rruRachMeasurements;
    }

    /**
     * Sets the value of the rruRachMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruRachMeasurements(JAXBElement<Boolean> value) {
        this.rruRachMeasurements = value;
    }

    /**
     * Gets the value of the rruCellUnavailability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruCellUnavailability() {
        return rruCellUnavailability;
    }

    /**
     * Sets the value of the rruCellUnavailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruCellUnavailability(JAXBElement<Boolean> value) {
        this.rruCellUnavailability = value;
    }

    /**
     * Gets the value of the rruCarrierAggregation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruCarrierAggregation() {
        return rruCarrierAggregation;
    }

    /**
     * Sets the value of the rruCarrierAggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruCarrierAggregation(JAXBElement<Boolean> value) {
        this.rruCarrierAggregation = value;
    }

    /**
     * Gets the value of the rruLightComp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRruLightComp() {
        return rruLightComp;
    }

    /**
     * Sets the value of the rruLightComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRruLightComp(JAXBElement<Boolean> value) {
        this.rruLightComp = value;
    }

    /**
     * Gets the value of the s1UeAssociatedLogicalS1Connections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1UeAssociatedLogicalS1Connections() {
        return s1UeAssociatedLogicalS1Connections;
    }

    /**
     * Sets the value of the s1UeAssociatedLogicalS1Connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1UeAssociatedLogicalS1Connections(JAXBElement<Boolean> value) {
        this.s1UeAssociatedLogicalS1Connections = value;
    }

    /**
     * Gets the value of the s1Paging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1Paging() {
        return s1Paging;
    }

    /**
     * Sets the value of the s1Paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1Paging(JAXBElement<Boolean> value) {
        this.s1Paging = value;
    }

    /**
     * Gets the value of the equipCpuUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipCpuUsage() {
        return equipCpuUsage;
    }

    /**
     * Sets the value of the equipCpuUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipCpuUsage(JAXBElement<Boolean> value) {
        this.equipCpuUsage = value;
    }

    /**
     * Gets the value of the equipMemoryUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipMemoryUsage() {
        return equipMemoryUsage;
    }

    /**
     * Sets the value of the equipMemoryUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipMemoryUsage(JAXBElement<Boolean> value) {
        this.equipMemoryUsage = value;
    }

    /**
     * Gets the value of the equipRebootAndUptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipRebootAndUptime() {
        return equipRebootAndUptime;
    }

    /**
     * Sets the value of the equipRebootAndUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipRebootAndUptime(JAXBElement<Boolean> value) {
        this.equipRebootAndUptime = value;
    }

    /**
     * Gets the value of the equipEthernetUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipEthernetUsage() {
        return equipEthernetUsage;
    }

    /**
     * Sets the value of the equipEthernetUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipEthernetUsage(JAXBElement<Boolean> value) {
        this.equipEthernetUsage = value;
    }

    /**
     * Gets the value of the equipMmeOverload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipMmeOverload() {
        return equipMmeOverload;
    }

    /**
     * Sets the value of the equipMmeOverload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipMmeOverload(JAXBElement<Boolean> value) {
        this.equipMmeOverload = value;
    }

    /**
     * Gets the value of the rfWidebandCqi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfWidebandCqi() {
        return rfWidebandCqi;
    }

    /**
     * Sets the value of the rfWidebandCqi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfWidebandCqi(JAXBElement<Boolean> value) {
        this.rfWidebandCqi = value;
    }

    /**
     * Gets the value of the rfAntennaRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfAntennaRssi() {
        return rfAntennaRssi;
    }

    /**
     * Sets the value of the rfAntennaRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfAntennaRssi(JAXBElement<Boolean> value) {
        this.rfAntennaRssi = value;
    }

    /**
     * Gets the value of the rfNoiseAndInterference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfNoiseAndInterference() {
        return rfNoiseAndInterference;
    }

    /**
     * Sets the value of the rfNoiseAndInterference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfNoiseAndInterference(JAXBElement<Boolean> value) {
        this.rfNoiseAndInterference = value;
    }

    /**
     * Gets the value of the rfCodeWordAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfCodeWordAllocation() {
        return rfCodeWordAllocation;
    }

    /**
     * Sets the value of the rfCodeWordAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfCodeWordAllocation(JAXBElement<Boolean> value) {
        this.rfCodeWordAllocation = value;
    }

    /**
     * Gets the value of the rfCaUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfCaUes() {
        return rfCaUes;
    }

    /**
     * Sets the value of the rfCaUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfCaUes(JAXBElement<Boolean> value) {
        this.rfCaUes = value;
    }

    /**
     * Gets the value of the rfCaWidebandCqi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfCaWidebandCqi() {
        return rfCaWidebandCqi;
    }

    /**
     * Sets the value of the rfCaWidebandCqi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfCaWidebandCqi(JAXBElement<Boolean> value) {
        this.rfCaWidebandCqi = value;
    }

    /**
     * Gets the value of the rfCaMacTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfCaMacTraffic() {
        return rfCaMacTraffic;
    }

    /**
     * Sets the value of the rfCaMacTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfCaMacTraffic(JAXBElement<Boolean> value) {
        this.rfCaMacTraffic = value;
    }

    /**
     * Gets the value of the rfTimeAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfTimeAdvance() {
        return rfTimeAdvance;
    }

    /**
     * Sets the value of the rfTimeAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfTimeAdvance(JAXBElement<Boolean> value) {
        this.rfTimeAdvance = value;
    }

    /**
     * Gets the value of the bhQosD1Cbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBhQosD1Cbr() {
        return bhQosD1Cbr;
    }

    /**
     * Sets the value of the bhQosD1Cbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBhQosD1Cbr(JAXBElement<Boolean> value) {
        this.bhQosD1Cbr = value;
    }

    /**
     * Gets the value of the bhQosD2Cbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBhQosD2Cbr() {
        return bhQosD2Cbr;
    }

    /**
     * Sets the value of the bhQosD2Cbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBhQosD2Cbr(JAXBElement<Boolean> value) {
        this.bhQosD2Cbr = value;
    }

    /**
     * Gets the value of the bhQosHeartbeat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBhQosHeartbeat() {
        return bhQosHeartbeat;
    }

    /**
     * Sets the value of the bhQosHeartbeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBhQosHeartbeat(JAXBElement<Boolean> value) {
        this.bhQosHeartbeat = value;
    }

    /**
     * Gets the value of the bhQosMeasurementsTwamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBhQosMeasurementsTwamp() {
        return bhQosMeasurementsTwamp;
    }

    /**
     * Sets the value of the bhQosMeasurementsTwamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBhQosMeasurementsTwamp(JAXBElement<Boolean> value) {
        this.bhQosMeasurementsTwamp = value;
    }

    /**
     * Gets the value of the pwsEtws property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPwsEtws() {
        return pwsEtws;
    }

    /**
     * Sets the value of the pwsEtws property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPwsEtws(JAXBElement<Boolean> value) {
        this.pwsEtws = value;
    }

    /**
     * Gets the value of the pwsCmas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPwsCmas() {
        return pwsCmas;
    }

    /**
     * Sets the value of the pwsCmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPwsCmas(JAXBElement<Boolean> value) {
        this.pwsCmas = value;
    }

    /**
     * Gets the value of the mbmsM2ConnectionSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsM2ConnectionSetup() {
        return mbmsM2ConnectionSetup;
    }

    /**
     * Sets the value of the mbmsM2ConnectionSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsM2ConnectionSetup(JAXBElement<Boolean> value) {
        this.mbmsM2ConnectionSetup = value;
    }

    /**
     * Gets the value of the mbmsM2SessionStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsM2SessionStart() {
        return mbmsM2SessionStart;
    }

    /**
     * Sets the value of the mbmsM2SessionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsM2SessionStart(JAXBElement<Boolean> value) {
        this.mbmsM2SessionStart = value;
    }

    /**
     * Gets the value of the mbmsM2SessionStop property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsM2SessionStop() {
        return mbmsM2SessionStop;
    }

    /**
     * Sets the value of the mbmsM2SessionStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsM2SessionStop(JAXBElement<Boolean> value) {
        this.mbmsM2SessionStop = value;
    }

    /**
     * Gets the value of the mbmsSyncPduCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsSyncPduCount() {
        return mbmsSyncPduCount;
    }

    /**
     * Sets the value of the mbmsSyncPduCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsSyncPduCount(JAXBElement<Boolean> value) {
        this.mbmsSyncPduCount = value;
    }

    /**
     * Gets the value of the mbmsSyncByteCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsSyncByteCount() {
        return mbmsSyncByteCount;
    }

    /**
     * Sets the value of the mbmsSyncByteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsSyncByteCount(JAXBElement<Boolean> value) {
        this.mbmsSyncByteCount = value;
    }

    /**
     * Gets the value of the mbmsSyncCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMbmsSyncCount() {
        return mbmsSyncCount;
    }

    /**
     * Sets the value of the mbmsSyncCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMbmsSyncCount(JAXBElement<Boolean> value) {
        this.mbmsSyncCount = value;
    }

    /**
     * Gets the value of the linkCodewordAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLinkCodewordAllocations() {
        return linkCodewordAllocations;
    }

    /**
     * Sets the value of the linkCodewordAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLinkCodewordAllocations(JAXBElement<Boolean> value) {
        this.linkCodewordAllocations = value;
    }

    /**
     * Gets the value of the linkUplinkAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLinkUplinkAllocation() {
        return linkUplinkAllocation;
    }

    /**
     * Sets the value of the linkUplinkAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLinkUplinkAllocation(JAXBElement<Boolean> value) {
        this.linkUplinkAllocation = value;
    }

    /**
     * Gets the value of the linkHarq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLinkHarq() {
        return linkHarq;
    }

    /**
     * Sets the value of the linkHarq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLinkHarq(JAXBElement<Boolean> value) {
        this.linkHarq = value;
    }

    /**
     * Gets the value of the sonIntraEnbLoadBalancing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonIntraEnbLoadBalancing() {
        return sonIntraEnbLoadBalancing;
    }

    /**
     * Sets the value of the sonIntraEnbLoadBalancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonIntraEnbLoadBalancing(JAXBElement<Boolean> value) {
        this.sonIntraEnbLoadBalancing = value;
    }

    /**
     * Gets the value of the sonDicic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonDicic() {
        return sonDicic;
    }

    /**
     * Sets the value of the sonDicic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonDicic(JAXBElement<Boolean> value) {
        this.sonDicic = value;
    }

    /**
     * Gets the value of the sonAutoPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonAutoPci() {
        return sonAutoPci;
    }

    /**
     * Sets the value of the sonAutoPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonAutoPci(JAXBElement<Boolean> value) {
        this.sonAutoPci = value;
    }

    /**
     * Gets the value of the sonMro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonMro() {
        return sonMro;
    }

    /**
     * Sets the value of the sonMro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonMro(JAXBElement<Boolean> value) {
        this.sonMro = value;
    }

    /**
     * Gets the value of the sonNeighborManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonNeighborManagement() {
        return sonNeighborManagement;
    }

    /**
     * Sets the value of the sonNeighborManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonNeighborManagement(JAXBElement<Boolean> value) {
        this.sonNeighborManagement = value;
    }

    /**
     * Gets the value of the sonPositioningMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonPositioningMeasurements() {
        return sonPositioningMeasurements;
    }

    /**
     * Sets the value of the sonPositioningMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonPositioningMeasurements(JAXBElement<Boolean> value) {
        this.sonPositioningMeasurements = value;
    }

    /**
     * Gets the value of the sonTpm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSonTpm() {
        return sonTpm;
    }

    /**
     * Sets the value of the sonTpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSonTpm(JAXBElement<Boolean> value) {
        this.sonTpm = value;
    }

    /**
     * Gets the value of the rbQosPrbUsagePerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosPrbUsagePerQci() {
        return rbQosPrbUsagePerQci;
    }

    /**
     * Sets the value of the rbQosPrbUsagePerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosPrbUsagePerQci(JAXBElement<Boolean> value) {
        this.rbQosPrbUsagePerQci = value;
    }

    /**
     * Gets the value of the rbQosCaTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosCaTraffic() {
        return rbQosCaTraffic;
    }

    /**
     * Sets the value of the rbQosCaTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosCaTraffic(JAXBElement<Boolean> value) {
        this.rbQosCaTraffic = value;
    }

    /**
     * Gets the value of the rbQosMacTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRbQosMacTraffic() {
        return rbQosMacTraffic;
    }

    /**
     * Sets the value of the rbQosMacTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRbQosMacTraffic(JAXBElement<Boolean> value) {
        this.rbQosMacTraffic = value;
    }

    /**
     * Gets the value of the equipSynchronization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEquipSynchronization() {
        return equipSynchronization;
    }

    /**
     * Sets the value of the equipSynchronization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEquipSynchronization(JAXBElement<Boolean> value) {
        this.equipSynchronization = value;
    }

    /**
     * Gets the value of the volteMuting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteMuting() {
        return volteMuting;
    }

    /**
     * Sets the value of the volteMuting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteMuting(JAXBElement<Boolean> value) {
        this.volteMuting = value;
    }

    /**
     * Gets the value of the volteStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteStatistics() {
        return volteStatistics;
    }

    /**
     * Sets the value of the volteStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteStatistics(JAXBElement<Boolean> value) {
        this.volteStatistics = value;
    }

    /**
     * Gets the value of the carrierTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCarrierTxPower() {
        return carrierTxPower;
    }

    /**
     * Sets the value of the carrierTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCarrierTxPower(JAXBElement<Boolean> value) {
        this.carrierTxPower = value;
    }

    /**
     * Gets the value of the dynamicAcb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDynamicAcb() {
        return dynamicAcb;
    }

    /**
     * Sets the value of the dynamicAcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDynamicAcb(JAXBElement<Boolean> value) {
        this.dynamicAcb = value;
    }

    /**
     * Gets the value of the rrcCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcCongestion() {
        return rrcCongestion;
    }

    /**
     * Sets the value of the rrcCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcCongestion(JAXBElement<Boolean> value) {
        this.rrcCongestion = value;
    }

    /**
     * Gets the value of the erabHardBlock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getErabHardBlock() {
        return erabHardBlock;
    }

    /**
     * Sets the value of the erabHardBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setErabHardBlock(JAXBElement<Boolean> value) {
        this.erabHardBlock = value;
    }

    /**
     * Gets the value of the rfUePrachInitialTimingAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRfUePrachInitialTimingAdvance() {
        return rfUePrachInitialTimingAdvance;
    }

    /**
     * Sets the value of the rfUePrachInitialTimingAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRfUePrachInitialTimingAdvance(JAXBElement<Boolean> value) {
        this.rfUePrachInitialTimingAdvance = value;
    }

    /**
     * Gets the value of the eventHandlingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventHandlingModes }{@code >}
     *     
     */
    public JAXBElement<EventHandlingModes> getEventHandlingMode() {
        return eventHandlingMode;
    }

    /**
     * Sets the value of the eventHandlingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventHandlingModes }{@code >}
     *     
     */
    public void setEventHandlingMode(JAXBElement<EventHandlingModes> value) {
        this.eventHandlingMode = value;
    }

    /**
     * Gets the value of the coreDumpIsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCoreDumpIsEnabled() {
        return coreDumpIsEnabled;
    }

    /**
     * Sets the value of the coreDumpIsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCoreDumpIsEnabled(JAXBElement<Boolean> value) {
        this.coreDumpIsEnabled = value;
    }

    /**
     * Gets the value of the fileUploadDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileUploadDestinationsWs }{@code >}
     *     
     */
    public JAXBElement<FileUploadDestinationsWs> getFileUploadDestination() {
        return fileUploadDestination;
    }

    /**
     * Sets the value of the fileUploadDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileUploadDestinationsWs }{@code >}
     *     
     */
    public void setFileUploadDestination(JAXBElement<FileUploadDestinationsWs> value) {
        this.fileUploadDestination = value;
    }

    /**
     * Gets the value of the fileUploadFolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUploadFolder() {
        return fileUploadFolder;
    }

    /**
     * Sets the value of the fileUploadFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUploadFolder(String value) {
        this.fileUploadFolder = value;
    }

    /**
     * Gets the value of the isFileUploadDestinationSsl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsFileUploadDestinationSsl() {
        return isFileUploadDestinationSsl;
    }

    /**
     * Sets the value of the isFileUploadDestinationSsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsFileUploadDestinationSsl(JAXBElement<Boolean> value) {
        this.isFileUploadDestinationSsl = value;
    }

    /**
     * Gets the value of the fileServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileServerName() {
        return fileServerName;
    }

    /**
     * Sets the value of the fileServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileServerName(String value) {
        this.fileServerName = value;
    }

}
