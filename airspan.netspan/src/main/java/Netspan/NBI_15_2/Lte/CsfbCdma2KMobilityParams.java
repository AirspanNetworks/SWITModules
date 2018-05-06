
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CsfbCdma2kMobilityParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CsfbCdma2kMobilityParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobilityParametersOctet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SidIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Sid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NidIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Nid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultSidsIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultSids" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultNidsIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultNids" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegZoneIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegZone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalZonesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalZones" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneTimerIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ZoneTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketZoneIdIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PacketZoneId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PzIdHystParametersIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PzHystEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PzHystInfoIncl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PzHystListLen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PzHystActTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PzHystTimerMul" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PzHystTimerExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PRevIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PRev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinPRevIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinPRev" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NegSlotCycleIndexSupIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NegSlotCycleIndexSup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EncryptModeIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EncryptMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EncSupportedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EncSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigEncryptSupIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigEncryptSup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MsgIntegritySupIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MsgIntegritySup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigIntegritySupInclIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigIntegritySupIncl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigIntegritySupIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SigIntegritySup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AuthIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Auth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxNumAltSoIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxNumAltSo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UseSyncIdIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseSyncId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MsInitPosLocSupIndIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MsInitPosLocSupInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MobQosIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MobQos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BandClassInfoReqIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BandClassInfoReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BandClassIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BandClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BypassRegIndIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BypassRegInd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AltBandClassIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AltBandClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxAddServInstanceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxAddServInstance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HomeRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HomeReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForSidRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForSidReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForNidRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ForNidReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerUpRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerUpReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerDownRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerDownReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParameterRegIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ParameterReg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegPrdIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegPrd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RegDistIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegDist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrefMsidTypeIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrefMsidType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExtPrefMsidTypeIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtPrefMsidType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MeidReqdIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MeidReqd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MccIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Imsi1112Included" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Imsi1112" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImsiTSupportedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImsiTSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReconnectMsgIndIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReconnectMsgInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RerModeSupportedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RerModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TkzModeSupportedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TkzModeSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TkzIdIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TkzId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PilotReportIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PilotReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SdbSupportedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SdbSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoFcsoAllowedIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoFcsoAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SdbInRcnmIndIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SdbInRcnmInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FpcFchIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FpcFchInitSetPtRc3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FpcFchInitSetPtRc4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FpcFchInitSetPtRc5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FpcFchInitSetPtRc11" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FpcFchInitSetPtRc12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TAddIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PilotIncIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PilotInc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RandIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Rand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LpSecIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LpSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LtmOffIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LtmOff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DayLtIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayLt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gcsnal2AckTimerIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gcsnal2AckTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GcsnaSequenceContextTimerIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GcsnaSequenceContextTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CsfbCdma2kMobilityParams", propOrder = {
    "mobilityParametersOctet",
    "sidIncluded",
    "sid",
    "nidIncluded",
    "nid",
    "multSidsIncluded",
    "multSids",
    "multNidsIncluded",
    "multNids",
    "regZoneIncluded",
    "regZone",
    "totalZonesIncluded",
    "totalZones",
    "zoneTimerIncluded",
    "zoneTimer",
    "packetZoneIdIncluded",
    "packetZoneId",
    "pzIdHystParametersIncluded",
    "pzHystEnabled",
    "pzHystInfoIncl",
    "pzHystListLen",
    "pzHystActTimer",
    "pzHystTimerMul",
    "pzHystTimerExp",
    "pRevIncluded",
    "pRev",
    "minPRevIncluded",
    "minPRev",
    "negSlotCycleIndexSupIncluded",
    "negSlotCycleIndexSup",
    "encryptModeIncluded",
    "encryptMode",
    "encSupportedIncluded",
    "encSupported",
    "sigEncryptSupIncluded",
    "sigEncryptSup",
    "msgIntegritySupIncluded",
    "msgIntegritySup",
    "sigIntegritySupInclIncluded",
    "sigIntegritySupIncl",
    "sigIntegritySupIncluded",
    "sigIntegritySup",
    "authIncluded",
    "auth",
    "maxNumAltSoIncluded",
    "maxNumAltSo",
    "useSyncIdIncluded",
    "useSyncId",
    "msInitPosLocSupIndIncluded",
    "msInitPosLocSupInd",
    "mobQosIncluded",
    "mobQos",
    "bandClassInfoReqIncluded",
    "bandClassInfoReq",
    "bandClassIncluded",
    "bandClass",
    "bypassRegIndIncluded",
    "bypassRegInd",
    "altBandClassIncluded",
    "altBandClass",
    "maxAddServInstanceIncluded",
    "maxAddServInstance",
    "homeRegIncluded",
    "homeReg",
    "forSidRegIncluded",
    "forSidReg",
    "forNidRegIncluded",
    "forNidReg",
    "powerUpRegIncluded",
    "powerUpReg",
    "powerDownRegIncluded",
    "powerDownReg",
    "parameterRegIncluded",
    "parameterReg",
    "regPrdIncluded",
    "regPrd",
    "regDistIncluded",
    "regDist",
    "prefMsidTypeIncluded",
    "prefMsidType",
    "extPrefMsidTypeIncluded",
    "extPrefMsidType",
    "meidReqdIncluded",
    "meidReqd",
    "mccIncluded",
    "mcc",
    "imsi1112Included",
    "imsi1112",
    "imsiTSupportedIncluded",
    "imsiTSupported",
    "reconnectMsgIndIncluded",
    "reconnectMsgInd",
    "rerModeSupportedIncluded",
    "rerModeSupported",
    "tkzModeSupportedIncluded",
    "tkzModeSupported",
    "tkzIdIncluded",
    "tkzId",
    "pilotReportIncluded",
    "pilotReport",
    "sdbSupportedIncluded",
    "sdbSupported",
    "autoFcsoAllowedIncluded",
    "autoFcsoAllowed",
    "sdbInRcnmIndIncluded",
    "sdbInRcnmInd",
    "fpcFchIncluded",
    "fpcFchInitSetPtRc3",
    "fpcFchInitSetPtRc4",
    "fpcFchInitSetPtRc5",
    "fpcFchInitSetPtRc11",
    "fpcFchInitSetPtRc12",
    "tAddIncluded",
    "tAdd",
    "pilotIncIncluded",
    "pilotInc",
    "randIncluded",
    "rand",
    "lpSecIncluded",
    "lpSec",
    "ltmOffIncluded",
    "ltmOff",
    "dayLtIncluded",
    "dayLt",
    "gcsnal2AckTimerIncluded",
    "gcsnal2AckTimer",
    "gcsnaSequenceContextTimerIncluded",
    "gcsnaSequenceContextTimer"
})
public class CsfbCdma2KMobilityParams {

    @XmlElement(name = "MobilityParametersOctet")
    protected String mobilityParametersOctet;
    @XmlElementRef(name = "SidIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sidIncluded;
    @XmlElementRef(name = "Sid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sid;
    @XmlElementRef(name = "NidIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nidIncluded;
    @XmlElementRef(name = "Nid", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nid;
    @XmlElementRef(name = "MultSidsIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multSidsIncluded;
    @XmlElementRef(name = "MultSids", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multSids;
    @XmlElementRef(name = "MultNidsIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multNidsIncluded;
    @XmlElementRef(name = "MultNids", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> multNids;
    @XmlElementRef(name = "RegZoneIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> regZoneIncluded;
    @XmlElementRef(name = "RegZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> regZone;
    @XmlElementRef(name = "TotalZonesIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> totalZonesIncluded;
    @XmlElementRef(name = "TotalZones", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalZones;
    @XmlElementRef(name = "ZoneTimerIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> zoneTimerIncluded;
    @XmlElementRef(name = "ZoneTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneTimer;
    @XmlElementRef(name = "PacketZoneIdIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> packetZoneIdIncluded;
    @XmlElementRef(name = "PacketZoneId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetZoneId;
    @XmlElementRef(name = "PzIdHystParametersIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pzIdHystParametersIncluded;
    @XmlElementRef(name = "PzHystEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pzHystEnabled;
    @XmlElementRef(name = "PzHystInfoIncl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pzHystInfoIncl;
    @XmlElementRef(name = "PzHystListLen", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pzHystListLen;
    @XmlElementRef(name = "PzHystActTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pzHystActTimer;
    @XmlElementRef(name = "PzHystTimerMul", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pzHystTimerMul;
    @XmlElementRef(name = "PzHystTimerExp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pzHystTimerExp;
    @XmlElementRef(name = "PRevIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pRevIncluded;
    @XmlElementRef(name = "PRev", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pRev;
    @XmlElementRef(name = "MinPRevIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> minPRevIncluded;
    @XmlElementRef(name = "MinPRev", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minPRev;
    @XmlElementRef(name = "NegSlotCycleIndexSupIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> negSlotCycleIndexSupIncluded;
    @XmlElementRef(name = "NegSlotCycleIndexSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> negSlotCycleIndexSup;
    @XmlElementRef(name = "EncryptModeIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> encryptModeIncluded;
    @XmlElementRef(name = "EncryptMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> encryptMode;
    @XmlElementRef(name = "EncSupportedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> encSupportedIncluded;
    @XmlElementRef(name = "EncSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> encSupported;
    @XmlElementRef(name = "SigEncryptSupIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sigEncryptSupIncluded;
    @XmlElementRef(name = "SigEncryptSup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sigEncryptSup;
    @XmlElementRef(name = "MsgIntegritySupIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> msgIntegritySupIncluded;
    @XmlElementRef(name = "MsgIntegritySup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> msgIntegritySup;
    @XmlElementRef(name = "SigIntegritySupInclIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sigIntegritySupInclIncluded;
    @XmlElementRef(name = "SigIntegritySupIncl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sigIntegritySupIncl;
    @XmlElementRef(name = "SigIntegritySupIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sigIntegritySupIncluded;
    @XmlElementRef(name = "SigIntegritySup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sigIntegritySup;
    @XmlElementRef(name = "AuthIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> authIncluded;
    @XmlElementRef(name = "Auth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> auth;
    @XmlElementRef(name = "MaxNumAltSoIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxNumAltSoIncluded;
    @XmlElementRef(name = "MaxNumAltSo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxNumAltSo;
    @XmlElementRef(name = "UseSyncIdIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useSyncIdIncluded;
    @XmlElementRef(name = "UseSyncId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useSyncId;
    @XmlElementRef(name = "MsInitPosLocSupIndIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> msInitPosLocSupIndIncluded;
    @XmlElementRef(name = "MsInitPosLocSupInd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> msInitPosLocSupInd;
    @XmlElementRef(name = "MobQosIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mobQosIncluded;
    @XmlElementRef(name = "MobQos", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mobQos;
    @XmlElementRef(name = "BandClassInfoReqIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bandClassInfoReqIncluded;
    @XmlElementRef(name = "BandClassInfoReq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bandClassInfoReq;
    @XmlElementRef(name = "BandClassIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bandClassIncluded;
    @XmlElementRef(name = "BandClass", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bandClass;
    @XmlElementRef(name = "BypassRegIndIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> bypassRegIndIncluded;
    @XmlElementRef(name = "BypassRegInd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bypassRegInd;
    @XmlElementRef(name = "AltBandClassIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> altBandClassIncluded;
    @XmlElementRef(name = "AltBandClass", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> altBandClass;
    @XmlElementRef(name = "MaxAddServInstanceIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxAddServInstanceIncluded;
    @XmlElementRef(name = "MaxAddServInstance", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxAddServInstance;
    @XmlElementRef(name = "HomeRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> homeRegIncluded;
    @XmlElementRef(name = "HomeReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> homeReg;
    @XmlElementRef(name = "ForSidRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forSidRegIncluded;
    @XmlElementRef(name = "ForSidReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forSidReg;
    @XmlElementRef(name = "ForNidRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forNidRegIncluded;
    @XmlElementRef(name = "ForNidReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forNidReg;
    @XmlElementRef(name = "PowerUpRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerUpRegIncluded;
    @XmlElementRef(name = "PowerUpReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerUpReg;
    @XmlElementRef(name = "PowerDownRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerDownRegIncluded;
    @XmlElementRef(name = "PowerDownReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerDownReg;
    @XmlElementRef(name = "ParameterRegIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> parameterRegIncluded;
    @XmlElementRef(name = "ParameterReg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> parameterReg;
    @XmlElementRef(name = "RegPrdIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> regPrdIncluded;
    @XmlElementRef(name = "RegPrd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> regPrd;
    @XmlElementRef(name = "RegDistIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> regDistIncluded;
    @XmlElementRef(name = "RegDist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> regDist;
    @XmlElementRef(name = "PrefMsidTypeIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> prefMsidTypeIncluded;
    @XmlElementRef(name = "PrefMsidType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prefMsidType;
    @XmlElementRef(name = "ExtPrefMsidTypeIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> extPrefMsidTypeIncluded;
    @XmlElementRef(name = "ExtPrefMsidType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> extPrefMsidType;
    @XmlElementRef(name = "MeidReqdIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> meidReqdIncluded;
    @XmlElementRef(name = "MeidReqd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> meidReqd;
    @XmlElementRef(name = "MccIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mccIncluded;
    @XmlElementRef(name = "Mcc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcc;
    @XmlElementRef(name = "Imsi1112Included", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> imsi1112Included;
    @XmlElementRef(name = "Imsi1112", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> imsi1112;
    @XmlElementRef(name = "ImsiTSupportedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> imsiTSupportedIncluded;
    @XmlElementRef(name = "ImsiTSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> imsiTSupported;
    @XmlElementRef(name = "ReconnectMsgIndIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reconnectMsgIndIncluded;
    @XmlElementRef(name = "ReconnectMsgInd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reconnectMsgInd;
    @XmlElementRef(name = "RerModeSupportedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rerModeSupportedIncluded;
    @XmlElementRef(name = "RerModeSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rerModeSupported;
    @XmlElementRef(name = "TkzModeSupportedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tkzModeSupportedIncluded;
    @XmlElementRef(name = "TkzModeSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tkzModeSupported;
    @XmlElementRef(name = "TkzIdIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tkzIdIncluded;
    @XmlElementRef(name = "TkzId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tkzId;
    @XmlElementRef(name = "PilotReportIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pilotReportIncluded;
    @XmlElementRef(name = "PilotReport", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pilotReport;
    @XmlElementRef(name = "SdbSupportedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sdbSupportedIncluded;
    @XmlElementRef(name = "SdbSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sdbSupported;
    @XmlElementRef(name = "AutoFcsoAllowedIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoFcsoAllowedIncluded;
    @XmlElementRef(name = "AutoFcsoAllowed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> autoFcsoAllowed;
    @XmlElementRef(name = "SdbInRcnmIndIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sdbInRcnmIndIncluded;
    @XmlElementRef(name = "SdbInRcnmInd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> sdbInRcnmInd;
    @XmlElementRef(name = "FpcFchIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> fpcFchIncluded;
    @XmlElementRef(name = "FpcFchInitSetPtRc3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fpcFchInitSetPtRc3;
    @XmlElementRef(name = "FpcFchInitSetPtRc4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fpcFchInitSetPtRc4;
    @XmlElementRef(name = "FpcFchInitSetPtRc5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fpcFchInitSetPtRc5;
    @XmlElementRef(name = "FpcFchInitSetPtRc11", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fpcFchInitSetPtRc11;
    @XmlElementRef(name = "FpcFchInitSetPtRc12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> fpcFchInitSetPtRc12;
    @XmlElementRef(name = "TAddIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> tAddIncluded;
    @XmlElementRef(name = "TAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tAdd;
    @XmlElementRef(name = "PilotIncIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pilotIncIncluded;
    @XmlElementRef(name = "PilotInc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pilotInc;
    @XmlElementRef(name = "RandIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> randIncluded;
    @XmlElementRef(name = "Rand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rand;
    @XmlElementRef(name = "LpSecIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lpSecIncluded;
    @XmlElementRef(name = "LpSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lpSec;
    @XmlElementRef(name = "LtmOffIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ltmOffIncluded;
    @XmlElementRef(name = "LtmOff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ltmOff;
    @XmlElementRef(name = "DayLtIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dayLtIncluded;
    @XmlElementRef(name = "DayLt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dayLt;
    @XmlElementRef(name = "Gcsnal2AckTimerIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gcsnal2AckTimerIncluded;
    @XmlElementRef(name = "Gcsnal2AckTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gcsnal2AckTimer;
    @XmlElementRef(name = "GcsnaSequenceContextTimerIncluded", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gcsnaSequenceContextTimerIncluded;
    @XmlElementRef(name = "GcsnaSequenceContextTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> gcsnaSequenceContextTimer;

    /**
     * Gets the value of the mobilityParametersOctet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityParametersOctet() {
        return mobilityParametersOctet;
    }

    /**
     * Sets the value of the mobilityParametersOctet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityParametersOctet(String value) {
        this.mobilityParametersOctet = value;
    }

    /**
     * Gets the value of the sidIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSidIncluded() {
        return sidIncluded;
    }

    /**
     * Sets the value of the sidIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSidIncluded(JAXBElement<Boolean> value) {
        this.sidIncluded = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSid(JAXBElement<Integer> value) {
        this.sid = value;
    }

    /**
     * Gets the value of the nidIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNidIncluded() {
        return nidIncluded;
    }

    /**
     * Sets the value of the nidIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNidIncluded(JAXBElement<Boolean> value) {
        this.nidIncluded = value;
    }

    /**
     * Gets the value of the nid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNid(JAXBElement<Integer> value) {
        this.nid = value;
    }

    /**
     * Gets the value of the multSidsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultSidsIncluded() {
        return multSidsIncluded;
    }

    /**
     * Sets the value of the multSidsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultSidsIncluded(JAXBElement<Boolean> value) {
        this.multSidsIncluded = value;
    }

    /**
     * Gets the value of the multSids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultSids() {
        return multSids;
    }

    /**
     * Sets the value of the multSids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultSids(JAXBElement<Boolean> value) {
        this.multSids = value;
    }

    /**
     * Gets the value of the multNidsIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultNidsIncluded() {
        return multNidsIncluded;
    }

    /**
     * Sets the value of the multNidsIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultNidsIncluded(JAXBElement<Boolean> value) {
        this.multNidsIncluded = value;
    }

    /**
     * Gets the value of the multNids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMultNids() {
        return multNids;
    }

    /**
     * Sets the value of the multNids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMultNids(JAXBElement<Boolean> value) {
        this.multNids = value;
    }

    /**
     * Gets the value of the regZoneIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRegZoneIncluded() {
        return regZoneIncluded;
    }

    /**
     * Sets the value of the regZoneIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRegZoneIncluded(JAXBElement<Boolean> value) {
        this.regZoneIncluded = value;
    }

    /**
     * Gets the value of the regZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegZone() {
        return regZone;
    }

    /**
     * Sets the value of the regZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegZone(JAXBElement<Integer> value) {
        this.regZone = value;
    }

    /**
     * Gets the value of the totalZonesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTotalZonesIncluded() {
        return totalZonesIncluded;
    }

    /**
     * Sets the value of the totalZonesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTotalZonesIncluded(JAXBElement<Boolean> value) {
        this.totalZonesIncluded = value;
    }

    /**
     * Gets the value of the totalZones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalZones() {
        return totalZones;
    }

    /**
     * Sets the value of the totalZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalZones(JAXBElement<Integer> value) {
        this.totalZones = value;
    }

    /**
     * Gets the value of the zoneTimerIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getZoneTimerIncluded() {
        return zoneTimerIncluded;
    }

    /**
     * Sets the value of the zoneTimerIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setZoneTimerIncluded(JAXBElement<Boolean> value) {
        this.zoneTimerIncluded = value;
    }

    /**
     * Gets the value of the zoneTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneTimer() {
        return zoneTimer;
    }

    /**
     * Sets the value of the zoneTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneTimer(JAXBElement<Integer> value) {
        this.zoneTimer = value;
    }

    /**
     * Gets the value of the packetZoneIdIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPacketZoneIdIncluded() {
        return packetZoneIdIncluded;
    }

    /**
     * Sets the value of the packetZoneIdIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPacketZoneIdIncluded(JAXBElement<Boolean> value) {
        this.packetZoneIdIncluded = value;
    }

    /**
     * Gets the value of the packetZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketZoneId() {
        return packetZoneId;
    }

    /**
     * Sets the value of the packetZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketZoneId(JAXBElement<Integer> value) {
        this.packetZoneId = value;
    }

    /**
     * Gets the value of the pzIdHystParametersIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPzIdHystParametersIncluded() {
        return pzIdHystParametersIncluded;
    }

    /**
     * Sets the value of the pzIdHystParametersIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPzIdHystParametersIncluded(JAXBElement<Boolean> value) {
        this.pzIdHystParametersIncluded = value;
    }

    /**
     * Gets the value of the pzHystEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPzHystEnabled() {
        return pzHystEnabled;
    }

    /**
     * Sets the value of the pzHystEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPzHystEnabled(JAXBElement<Boolean> value) {
        this.pzHystEnabled = value;
    }

    /**
     * Gets the value of the pzHystInfoIncl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPzHystInfoIncl() {
        return pzHystInfoIncl;
    }

    /**
     * Sets the value of the pzHystInfoIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPzHystInfoIncl(JAXBElement<Boolean> value) {
        this.pzHystInfoIncl = value;
    }

    /**
     * Gets the value of the pzHystListLen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPzHystListLen() {
        return pzHystListLen;
    }

    /**
     * Sets the value of the pzHystListLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPzHystListLen(JAXBElement<Boolean> value) {
        this.pzHystListLen = value;
    }

    /**
     * Gets the value of the pzHystActTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPzHystActTimer() {
        return pzHystActTimer;
    }

    /**
     * Sets the value of the pzHystActTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPzHystActTimer(JAXBElement<Integer> value) {
        this.pzHystActTimer = value;
    }

    /**
     * Gets the value of the pzHystTimerMul property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPzHystTimerMul() {
        return pzHystTimerMul;
    }

    /**
     * Sets the value of the pzHystTimerMul property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPzHystTimerMul(JAXBElement<Integer> value) {
        this.pzHystTimerMul = value;
    }

    /**
     * Gets the value of the pzHystTimerExp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPzHystTimerExp() {
        return pzHystTimerExp;
    }

    /**
     * Sets the value of the pzHystTimerExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPzHystTimerExp(JAXBElement<Integer> value) {
        this.pzHystTimerExp = value;
    }

    /**
     * Gets the value of the pRevIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPRevIncluded() {
        return pRevIncluded;
    }

    /**
     * Sets the value of the pRevIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPRevIncluded(JAXBElement<Boolean> value) {
        this.pRevIncluded = value;
    }

    /**
     * Gets the value of the pRev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPRev() {
        return pRev;
    }

    /**
     * Sets the value of the pRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPRev(JAXBElement<Integer> value) {
        this.pRev = value;
    }

    /**
     * Gets the value of the minPRevIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMinPRevIncluded() {
        return minPRevIncluded;
    }

    /**
     * Sets the value of the minPRevIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMinPRevIncluded(JAXBElement<Boolean> value) {
        this.minPRevIncluded = value;
    }

    /**
     * Gets the value of the minPRev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinPRev() {
        return minPRev;
    }

    /**
     * Sets the value of the minPRev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinPRev(JAXBElement<Integer> value) {
        this.minPRev = value;
    }

    /**
     * Gets the value of the negSlotCycleIndexSupIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNegSlotCycleIndexSupIncluded() {
        return negSlotCycleIndexSupIncluded;
    }

    /**
     * Sets the value of the negSlotCycleIndexSupIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNegSlotCycleIndexSupIncluded(JAXBElement<Boolean> value) {
        this.negSlotCycleIndexSupIncluded = value;
    }

    /**
     * Gets the value of the negSlotCycleIndexSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNegSlotCycleIndexSup() {
        return negSlotCycleIndexSup;
    }

    /**
     * Sets the value of the negSlotCycleIndexSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNegSlotCycleIndexSup(JAXBElement<Boolean> value) {
        this.negSlotCycleIndexSup = value;
    }

    /**
     * Gets the value of the encryptModeIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEncryptModeIncluded() {
        return encryptModeIncluded;
    }

    /**
     * Sets the value of the encryptModeIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEncryptModeIncluded(JAXBElement<Boolean> value) {
        this.encryptModeIncluded = value;
    }

    /**
     * Gets the value of the encryptMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEncryptMode() {
        return encryptMode;
    }

    /**
     * Sets the value of the encryptMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEncryptMode(JAXBElement<Integer> value) {
        this.encryptMode = value;
    }

    /**
     * Gets the value of the encSupportedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEncSupportedIncluded() {
        return encSupportedIncluded;
    }

    /**
     * Sets the value of the encSupportedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEncSupportedIncluded(JAXBElement<Boolean> value) {
        this.encSupportedIncluded = value;
    }

    /**
     * Gets the value of the encSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEncSupported() {
        return encSupported;
    }

    /**
     * Sets the value of the encSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEncSupported(JAXBElement<Boolean> value) {
        this.encSupported = value;
    }

    /**
     * Gets the value of the sigEncryptSupIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSigEncryptSupIncluded() {
        return sigEncryptSupIncluded;
    }

    /**
     * Sets the value of the sigEncryptSupIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSigEncryptSupIncluded(JAXBElement<Boolean> value) {
        this.sigEncryptSupIncluded = value;
    }

    /**
     * Gets the value of the sigEncryptSup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSigEncryptSup() {
        return sigEncryptSup;
    }

    /**
     * Sets the value of the sigEncryptSup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSigEncryptSup(JAXBElement<Integer> value) {
        this.sigEncryptSup = value;
    }

    /**
     * Gets the value of the msgIntegritySupIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMsgIntegritySupIncluded() {
        return msgIntegritySupIncluded;
    }

    /**
     * Sets the value of the msgIntegritySupIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMsgIntegritySupIncluded(JAXBElement<Boolean> value) {
        this.msgIntegritySupIncluded = value;
    }

    /**
     * Gets the value of the msgIntegritySup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMsgIntegritySup() {
        return msgIntegritySup;
    }

    /**
     * Sets the value of the msgIntegritySup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMsgIntegritySup(JAXBElement<Boolean> value) {
        this.msgIntegritySup = value;
    }

    /**
     * Gets the value of the sigIntegritySupInclIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSigIntegritySupInclIncluded() {
        return sigIntegritySupInclIncluded;
    }

    /**
     * Sets the value of the sigIntegritySupInclIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSigIntegritySupInclIncluded(JAXBElement<Boolean> value) {
        this.sigIntegritySupInclIncluded = value;
    }

    /**
     * Gets the value of the sigIntegritySupIncl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSigIntegritySupIncl() {
        return sigIntegritySupIncl;
    }

    /**
     * Sets the value of the sigIntegritySupIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSigIntegritySupIncl(JAXBElement<Boolean> value) {
        this.sigIntegritySupIncl = value;
    }

    /**
     * Gets the value of the sigIntegritySupIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSigIntegritySupIncluded() {
        return sigIntegritySupIncluded;
    }

    /**
     * Sets the value of the sigIntegritySupIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSigIntegritySupIncluded(JAXBElement<Boolean> value) {
        this.sigIntegritySupIncluded = value;
    }

    /**
     * Gets the value of the sigIntegritySup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSigIntegritySup() {
        return sigIntegritySup;
    }

    /**
     * Sets the value of the sigIntegritySup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSigIntegritySup(JAXBElement<Integer> value) {
        this.sigIntegritySup = value;
    }

    /**
     * Gets the value of the authIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAuthIncluded() {
        return authIncluded;
    }

    /**
     * Sets the value of the authIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAuthIncluded(JAXBElement<Boolean> value) {
        this.authIncluded = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAuth(JAXBElement<Integer> value) {
        this.auth = value;
    }

    /**
     * Gets the value of the maxNumAltSoIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxNumAltSoIncluded() {
        return maxNumAltSoIncluded;
    }

    /**
     * Sets the value of the maxNumAltSoIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxNumAltSoIncluded(JAXBElement<Boolean> value) {
        this.maxNumAltSoIncluded = value;
    }

    /**
     * Gets the value of the maxNumAltSo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxNumAltSo() {
        return maxNumAltSo;
    }

    /**
     * Sets the value of the maxNumAltSo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxNumAltSo(JAXBElement<Integer> value) {
        this.maxNumAltSo = value;
    }

    /**
     * Gets the value of the useSyncIdIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseSyncIdIncluded() {
        return useSyncIdIncluded;
    }

    /**
     * Sets the value of the useSyncIdIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseSyncIdIncluded(JAXBElement<Boolean> value) {
        this.useSyncIdIncluded = value;
    }

    /**
     * Gets the value of the useSyncId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseSyncId() {
        return useSyncId;
    }

    /**
     * Sets the value of the useSyncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseSyncId(JAXBElement<Boolean> value) {
        this.useSyncId = value;
    }

    /**
     * Gets the value of the msInitPosLocSupIndIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMsInitPosLocSupIndIncluded() {
        return msInitPosLocSupIndIncluded;
    }

    /**
     * Sets the value of the msInitPosLocSupIndIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMsInitPosLocSupIndIncluded(JAXBElement<Boolean> value) {
        this.msInitPosLocSupIndIncluded = value;
    }

    /**
     * Gets the value of the msInitPosLocSupInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMsInitPosLocSupInd() {
        return msInitPosLocSupInd;
    }

    /**
     * Sets the value of the msInitPosLocSupInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMsInitPosLocSupInd(JAXBElement<Boolean> value) {
        this.msInitPosLocSupInd = value;
    }

    /**
     * Gets the value of the mobQosIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMobQosIncluded() {
        return mobQosIncluded;
    }

    /**
     * Sets the value of the mobQosIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMobQosIncluded(JAXBElement<Boolean> value) {
        this.mobQosIncluded = value;
    }

    /**
     * Gets the value of the mobQos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMobQos() {
        return mobQos;
    }

    /**
     * Sets the value of the mobQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMobQos(JAXBElement<Boolean> value) {
        this.mobQos = value;
    }

    /**
     * Gets the value of the bandClassInfoReqIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBandClassInfoReqIncluded() {
        return bandClassInfoReqIncluded;
    }

    /**
     * Sets the value of the bandClassInfoReqIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBandClassInfoReqIncluded(JAXBElement<Boolean> value) {
        this.bandClassInfoReqIncluded = value;
    }

    /**
     * Gets the value of the bandClassInfoReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBandClassInfoReq() {
        return bandClassInfoReq;
    }

    /**
     * Sets the value of the bandClassInfoReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBandClassInfoReq(JAXBElement<Boolean> value) {
        this.bandClassInfoReq = value;
    }

    /**
     * Gets the value of the bandClassIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBandClassIncluded() {
        return bandClassIncluded;
    }

    /**
     * Sets the value of the bandClassIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBandClassIncluded(JAXBElement<Boolean> value) {
        this.bandClassIncluded = value;
    }

    /**
     * Gets the value of the bandClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBandClass() {
        return bandClass;
    }

    /**
     * Sets the value of the bandClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBandClass(JAXBElement<Integer> value) {
        this.bandClass = value;
    }

    /**
     * Gets the value of the bypassRegIndIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBypassRegIndIncluded() {
        return bypassRegIndIncluded;
    }

    /**
     * Sets the value of the bypassRegIndIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBypassRegIndIncluded(JAXBElement<Boolean> value) {
        this.bypassRegIndIncluded = value;
    }

    /**
     * Gets the value of the bypassRegInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBypassRegInd() {
        return bypassRegInd;
    }

    /**
     * Sets the value of the bypassRegInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBypassRegInd(JAXBElement<Integer> value) {
        this.bypassRegInd = value;
    }

    /**
     * Gets the value of the altBandClassIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAltBandClassIncluded() {
        return altBandClassIncluded;
    }

    /**
     * Sets the value of the altBandClassIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAltBandClassIncluded(JAXBElement<Boolean> value) {
        this.altBandClassIncluded = value;
    }

    /**
     * Gets the value of the altBandClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAltBandClass() {
        return altBandClass;
    }

    /**
     * Sets the value of the altBandClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAltBandClass(JAXBElement<Integer> value) {
        this.altBandClass = value;
    }

    /**
     * Gets the value of the maxAddServInstanceIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxAddServInstanceIncluded() {
        return maxAddServInstanceIncluded;
    }

    /**
     * Sets the value of the maxAddServInstanceIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxAddServInstanceIncluded(JAXBElement<Boolean> value) {
        this.maxAddServInstanceIncluded = value;
    }

    /**
     * Gets the value of the maxAddServInstance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxAddServInstance() {
        return maxAddServInstance;
    }

    /**
     * Sets the value of the maxAddServInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxAddServInstance(JAXBElement<Integer> value) {
        this.maxAddServInstance = value;
    }

    /**
     * Gets the value of the homeRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHomeRegIncluded() {
        return homeRegIncluded;
    }

    /**
     * Sets the value of the homeRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHomeRegIncluded(JAXBElement<Boolean> value) {
        this.homeRegIncluded = value;
    }

    /**
     * Gets the value of the homeReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHomeReg() {
        return homeReg;
    }

    /**
     * Sets the value of the homeReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHomeReg(JAXBElement<Boolean> value) {
        this.homeReg = value;
    }

    /**
     * Gets the value of the forSidRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForSidRegIncluded() {
        return forSidRegIncluded;
    }

    /**
     * Sets the value of the forSidRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForSidRegIncluded(JAXBElement<Boolean> value) {
        this.forSidRegIncluded = value;
    }

    /**
     * Gets the value of the forSidReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForSidReg() {
        return forSidReg;
    }

    /**
     * Sets the value of the forSidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForSidReg(JAXBElement<Boolean> value) {
        this.forSidReg = value;
    }

    /**
     * Gets the value of the forNidRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForNidRegIncluded() {
        return forNidRegIncluded;
    }

    /**
     * Sets the value of the forNidRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForNidRegIncluded(JAXBElement<Boolean> value) {
        this.forNidRegIncluded = value;
    }

    /**
     * Gets the value of the forNidReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForNidReg() {
        return forNidReg;
    }

    /**
     * Sets the value of the forNidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForNidReg(JAXBElement<Boolean> value) {
        this.forNidReg = value;
    }

    /**
     * Gets the value of the powerUpRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerUpRegIncluded() {
        return powerUpRegIncluded;
    }

    /**
     * Sets the value of the powerUpRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerUpRegIncluded(JAXBElement<Boolean> value) {
        this.powerUpRegIncluded = value;
    }

    /**
     * Gets the value of the powerUpReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerUpReg() {
        return powerUpReg;
    }

    /**
     * Sets the value of the powerUpReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerUpReg(JAXBElement<Boolean> value) {
        this.powerUpReg = value;
    }

    /**
     * Gets the value of the powerDownRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerDownRegIncluded() {
        return powerDownRegIncluded;
    }

    /**
     * Sets the value of the powerDownRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerDownRegIncluded(JAXBElement<Boolean> value) {
        this.powerDownRegIncluded = value;
    }

    /**
     * Gets the value of the powerDownReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerDownReg() {
        return powerDownReg;
    }

    /**
     * Sets the value of the powerDownReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerDownReg(JAXBElement<Boolean> value) {
        this.powerDownReg = value;
    }

    /**
     * Gets the value of the parameterRegIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getParameterRegIncluded() {
        return parameterRegIncluded;
    }

    /**
     * Sets the value of the parameterRegIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setParameterRegIncluded(JAXBElement<Boolean> value) {
        this.parameterRegIncluded = value;
    }

    /**
     * Gets the value of the parameterReg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getParameterReg() {
        return parameterReg;
    }

    /**
     * Sets the value of the parameterReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setParameterReg(JAXBElement<Boolean> value) {
        this.parameterReg = value;
    }

    /**
     * Gets the value of the regPrdIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRegPrdIncluded() {
        return regPrdIncluded;
    }

    /**
     * Sets the value of the regPrdIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRegPrdIncluded(JAXBElement<Boolean> value) {
        this.regPrdIncluded = value;
    }

    /**
     * Gets the value of the regPrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegPrd() {
        return regPrd;
    }

    /**
     * Sets the value of the regPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegPrd(JAXBElement<Integer> value) {
        this.regPrd = value;
    }

    /**
     * Gets the value of the regDistIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRegDistIncluded() {
        return regDistIncluded;
    }

    /**
     * Sets the value of the regDistIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRegDistIncluded(JAXBElement<Boolean> value) {
        this.regDistIncluded = value;
    }

    /**
     * Gets the value of the regDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegDist() {
        return regDist;
    }

    /**
     * Sets the value of the regDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegDist(JAXBElement<Integer> value) {
        this.regDist = value;
    }

    /**
     * Gets the value of the prefMsidTypeIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrefMsidTypeIncluded() {
        return prefMsidTypeIncluded;
    }

    /**
     * Sets the value of the prefMsidTypeIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrefMsidTypeIncluded(JAXBElement<Boolean> value) {
        this.prefMsidTypeIncluded = value;
    }

    /**
     * Gets the value of the prefMsidType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrefMsidType() {
        return prefMsidType;
    }

    /**
     * Sets the value of the prefMsidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrefMsidType(JAXBElement<Integer> value) {
        this.prefMsidType = value;
    }

    /**
     * Gets the value of the extPrefMsidTypeIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExtPrefMsidTypeIncluded() {
        return extPrefMsidTypeIncluded;
    }

    /**
     * Sets the value of the extPrefMsidTypeIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExtPrefMsidTypeIncluded(JAXBElement<Boolean> value) {
        this.extPrefMsidTypeIncluded = value;
    }

    /**
     * Gets the value of the extPrefMsidType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExtPrefMsidType() {
        return extPrefMsidType;
    }

    /**
     * Sets the value of the extPrefMsidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExtPrefMsidType(JAXBElement<Integer> value) {
        this.extPrefMsidType = value;
    }

    /**
     * Gets the value of the meidReqdIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeidReqdIncluded() {
        return meidReqdIncluded;
    }

    /**
     * Sets the value of the meidReqdIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeidReqdIncluded(JAXBElement<Boolean> value) {
        this.meidReqdIncluded = value;
    }

    /**
     * Gets the value of the meidReqd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeidReqd() {
        return meidReqd;
    }

    /**
     * Sets the value of the meidReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeidReqd(JAXBElement<Boolean> value) {
        this.meidReqd = value;
    }

    /**
     * Gets the value of the mccIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMccIncluded() {
        return mccIncluded;
    }

    /**
     * Sets the value of the mccIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMccIncluded(JAXBElement<Boolean> value) {
        this.mccIncluded = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMcc(JAXBElement<Integer> value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the imsi1112Included property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getImsi1112Included() {
        return imsi1112Included;
    }

    /**
     * Sets the value of the imsi1112Included property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setImsi1112Included(JAXBElement<Boolean> value) {
        this.imsi1112Included = value;
    }

    /**
     * Gets the value of the imsi1112 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getImsi1112() {
        return imsi1112;
    }

    /**
     * Sets the value of the imsi1112 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setImsi1112(JAXBElement<Integer> value) {
        this.imsi1112 = value;
    }

    /**
     * Gets the value of the imsiTSupportedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getImsiTSupportedIncluded() {
        return imsiTSupportedIncluded;
    }

    /**
     * Sets the value of the imsiTSupportedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setImsiTSupportedIncluded(JAXBElement<Boolean> value) {
        this.imsiTSupportedIncluded = value;
    }

    /**
     * Gets the value of the imsiTSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getImsiTSupported() {
        return imsiTSupported;
    }

    /**
     * Sets the value of the imsiTSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setImsiTSupported(JAXBElement<Boolean> value) {
        this.imsiTSupported = value;
    }

    /**
     * Gets the value of the reconnectMsgIndIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReconnectMsgIndIncluded() {
        return reconnectMsgIndIncluded;
    }

    /**
     * Sets the value of the reconnectMsgIndIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReconnectMsgIndIncluded(JAXBElement<Boolean> value) {
        this.reconnectMsgIndIncluded = value;
    }

    /**
     * Gets the value of the reconnectMsgInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReconnectMsgInd() {
        return reconnectMsgInd;
    }

    /**
     * Sets the value of the reconnectMsgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReconnectMsgInd(JAXBElement<Boolean> value) {
        this.reconnectMsgInd = value;
    }

    /**
     * Gets the value of the rerModeSupportedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRerModeSupportedIncluded() {
        return rerModeSupportedIncluded;
    }

    /**
     * Sets the value of the rerModeSupportedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRerModeSupportedIncluded(JAXBElement<Boolean> value) {
        this.rerModeSupportedIncluded = value;
    }

    /**
     * Gets the value of the rerModeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRerModeSupported() {
        return rerModeSupported;
    }

    /**
     * Sets the value of the rerModeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRerModeSupported(JAXBElement<Boolean> value) {
        this.rerModeSupported = value;
    }

    /**
     * Gets the value of the tkzModeSupportedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTkzModeSupportedIncluded() {
        return tkzModeSupportedIncluded;
    }

    /**
     * Sets the value of the tkzModeSupportedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTkzModeSupportedIncluded(JAXBElement<Boolean> value) {
        this.tkzModeSupportedIncluded = value;
    }

    /**
     * Gets the value of the tkzModeSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTkzModeSupported() {
        return tkzModeSupported;
    }

    /**
     * Sets the value of the tkzModeSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTkzModeSupported(JAXBElement<Boolean> value) {
        this.tkzModeSupported = value;
    }

    /**
     * Gets the value of the tkzIdIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTkzIdIncluded() {
        return tkzIdIncluded;
    }

    /**
     * Sets the value of the tkzIdIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTkzIdIncluded(JAXBElement<Boolean> value) {
        this.tkzIdIncluded = value;
    }

    /**
     * Gets the value of the tkzId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTkzId() {
        return tkzId;
    }

    /**
     * Sets the value of the tkzId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTkzId(JAXBElement<Boolean> value) {
        this.tkzId = value;
    }

    /**
     * Gets the value of the pilotReportIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPilotReportIncluded() {
        return pilotReportIncluded;
    }

    /**
     * Sets the value of the pilotReportIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPilotReportIncluded(JAXBElement<Boolean> value) {
        this.pilotReportIncluded = value;
    }

    /**
     * Gets the value of the pilotReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPilotReport() {
        return pilotReport;
    }

    /**
     * Sets the value of the pilotReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPilotReport(JAXBElement<Boolean> value) {
        this.pilotReport = value;
    }

    /**
     * Gets the value of the sdbSupportedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSdbSupportedIncluded() {
        return sdbSupportedIncluded;
    }

    /**
     * Sets the value of the sdbSupportedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSdbSupportedIncluded(JAXBElement<Boolean> value) {
        this.sdbSupportedIncluded = value;
    }

    /**
     * Gets the value of the sdbSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSdbSupported() {
        return sdbSupported;
    }

    /**
     * Sets the value of the sdbSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSdbSupported(JAXBElement<Boolean> value) {
        this.sdbSupported = value;
    }

    /**
     * Gets the value of the autoFcsoAllowedIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoFcsoAllowedIncluded() {
        return autoFcsoAllowedIncluded;
    }

    /**
     * Sets the value of the autoFcsoAllowedIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoFcsoAllowedIncluded(JAXBElement<Boolean> value) {
        this.autoFcsoAllowedIncluded = value;
    }

    /**
     * Gets the value of the autoFcsoAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoFcsoAllowed() {
        return autoFcsoAllowed;
    }

    /**
     * Sets the value of the autoFcsoAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoFcsoAllowed(JAXBElement<Boolean> value) {
        this.autoFcsoAllowed = value;
    }

    /**
     * Gets the value of the sdbInRcnmIndIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSdbInRcnmIndIncluded() {
        return sdbInRcnmIndIncluded;
    }

    /**
     * Sets the value of the sdbInRcnmIndIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSdbInRcnmIndIncluded(JAXBElement<Boolean> value) {
        this.sdbInRcnmIndIncluded = value;
    }

    /**
     * Gets the value of the sdbInRcnmInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSdbInRcnmInd() {
        return sdbInRcnmInd;
    }

    /**
     * Sets the value of the sdbInRcnmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSdbInRcnmInd(JAXBElement<Boolean> value) {
        this.sdbInRcnmInd = value;
    }

    /**
     * Gets the value of the fpcFchIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFpcFchIncluded() {
        return fpcFchIncluded;
    }

    /**
     * Sets the value of the fpcFchIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFpcFchIncluded(JAXBElement<Boolean> value) {
        this.fpcFchIncluded = value;
    }

    /**
     * Gets the value of the fpcFchInitSetPtRc3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFpcFchInitSetPtRc3() {
        return fpcFchInitSetPtRc3;
    }

    /**
     * Sets the value of the fpcFchInitSetPtRc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFpcFchInitSetPtRc3(JAXBElement<Integer> value) {
        this.fpcFchInitSetPtRc3 = value;
    }

    /**
     * Gets the value of the fpcFchInitSetPtRc4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFpcFchInitSetPtRc4() {
        return fpcFchInitSetPtRc4;
    }

    /**
     * Sets the value of the fpcFchInitSetPtRc4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFpcFchInitSetPtRc4(JAXBElement<Integer> value) {
        this.fpcFchInitSetPtRc4 = value;
    }

    /**
     * Gets the value of the fpcFchInitSetPtRc5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFpcFchInitSetPtRc5() {
        return fpcFchInitSetPtRc5;
    }

    /**
     * Sets the value of the fpcFchInitSetPtRc5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFpcFchInitSetPtRc5(JAXBElement<Integer> value) {
        this.fpcFchInitSetPtRc5 = value;
    }

    /**
     * Gets the value of the fpcFchInitSetPtRc11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFpcFchInitSetPtRc11() {
        return fpcFchInitSetPtRc11;
    }

    /**
     * Sets the value of the fpcFchInitSetPtRc11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFpcFchInitSetPtRc11(JAXBElement<Integer> value) {
        this.fpcFchInitSetPtRc11 = value;
    }

    /**
     * Gets the value of the fpcFchInitSetPtRc12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFpcFchInitSetPtRc12() {
        return fpcFchInitSetPtRc12;
    }

    /**
     * Sets the value of the fpcFchInitSetPtRc12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFpcFchInitSetPtRc12(JAXBElement<Integer> value) {
        this.fpcFchInitSetPtRc12 = value;
    }

    /**
     * Gets the value of the tAddIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTAddIncluded() {
        return tAddIncluded;
    }

    /**
     * Sets the value of the tAddIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTAddIncluded(JAXBElement<Boolean> value) {
        this.tAddIncluded = value;
    }

    /**
     * Gets the value of the tAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTAdd() {
        return tAdd;
    }

    /**
     * Sets the value of the tAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTAdd(JAXBElement<Integer> value) {
        this.tAdd = value;
    }

    /**
     * Gets the value of the pilotIncIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPilotIncIncluded() {
        return pilotIncIncluded;
    }

    /**
     * Sets the value of the pilotIncIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPilotIncIncluded(JAXBElement<Boolean> value) {
        this.pilotIncIncluded = value;
    }

    /**
     * Gets the value of the pilotInc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPilotInc() {
        return pilotInc;
    }

    /**
     * Sets the value of the pilotInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPilotInc(JAXBElement<Integer> value) {
        this.pilotInc = value;
    }

    /**
     * Gets the value of the randIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRandIncluded() {
        return randIncluded;
    }

    /**
     * Sets the value of the randIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRandIncluded(JAXBElement<Boolean> value) {
        this.randIncluded = value;
    }

    /**
     * Gets the value of the rand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRand() {
        return rand;
    }

    /**
     * Sets the value of the rand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRand(JAXBElement<Integer> value) {
        this.rand = value;
    }

    /**
     * Gets the value of the lpSecIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLpSecIncluded() {
        return lpSecIncluded;
    }

    /**
     * Sets the value of the lpSecIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLpSecIncluded(JAXBElement<Boolean> value) {
        this.lpSecIncluded = value;
    }

    /**
     * Gets the value of the lpSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLpSec() {
        return lpSec;
    }

    /**
     * Sets the value of the lpSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLpSec(JAXBElement<Integer> value) {
        this.lpSec = value;
    }

    /**
     * Gets the value of the ltmOffIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLtmOffIncluded() {
        return ltmOffIncluded;
    }

    /**
     * Sets the value of the ltmOffIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLtmOffIncluded(JAXBElement<Boolean> value) {
        this.ltmOffIncluded = value;
    }

    /**
     * Gets the value of the ltmOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLtmOff() {
        return ltmOff;
    }

    /**
     * Sets the value of the ltmOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLtmOff(JAXBElement<Integer> value) {
        this.ltmOff = value;
    }

    /**
     * Gets the value of the dayLtIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDayLtIncluded() {
        return dayLtIncluded;
    }

    /**
     * Sets the value of the dayLtIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDayLtIncluded(JAXBElement<Boolean> value) {
        this.dayLtIncluded = value;
    }

    /**
     * Gets the value of the dayLt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDayLt() {
        return dayLt;
    }

    /**
     * Sets the value of the dayLt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDayLt(JAXBElement<Boolean> value) {
        this.dayLt = value;
    }

    /**
     * Gets the value of the gcsnal2AckTimerIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGcsnal2AckTimerIncluded() {
        return gcsnal2AckTimerIncluded;
    }

    /**
     * Sets the value of the gcsnal2AckTimerIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGcsnal2AckTimerIncluded(JAXBElement<Boolean> value) {
        this.gcsnal2AckTimerIncluded = value;
    }

    /**
     * Gets the value of the gcsnal2AckTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGcsnal2AckTimer() {
        return gcsnal2AckTimer;
    }

    /**
     * Sets the value of the gcsnal2AckTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGcsnal2AckTimer(JAXBElement<Integer> value) {
        this.gcsnal2AckTimer = value;
    }

    /**
     * Gets the value of the gcsnaSequenceContextTimerIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGcsnaSequenceContextTimerIncluded() {
        return gcsnaSequenceContextTimerIncluded;
    }

    /**
     * Sets the value of the gcsnaSequenceContextTimerIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGcsnaSequenceContextTimerIncluded(JAXBElement<Boolean> value) {
        this.gcsnaSequenceContextTimerIncluded = value;
    }

    /**
     * Gets the value of the gcsnaSequenceContextTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGcsnaSequenceContextTimer() {
        return gcsnaSequenceContextTimer;
    }

    /**
     * Sets the value of the gcsnaSequenceContextTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGcsnaSequenceContextTimer(JAXBElement<Integer> value) {
        this.gcsnaSequenceContextTimer = value;
    }

}
