
package Netspan.NBI_15_5.Lte;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbNetworkProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbNetworkProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsStandardVoLTECodec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CodecType" type="{http://Airspan.Netspan.WebServices}VoLTECodecType" minOccurs="0"/>
 *         &lt;element name="CodecMode" type="{http://Airspan.Netspan.WebServices}VoLTECodecMode" minOccurs="0"/>
 *         &lt;element name="PacketSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PacketPeriodicity" type="{http://Airspan.Netspan.WebServices}VoLTEPeriodicity" minOccurs="0"/>
 *         &lt;element name="IsRohcRtpQci1Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRohcUdpQci1Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRohcRtpQci2Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRohcUdpQci2Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MmeOverloadAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="MmeOverloadWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MmeOverloadLoadReductionAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ConnectedModeDrx" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="DrxData" type="{http://Airspan.Netspan.WebServices}LteDrxEntryWs" minOccurs="0"/>
 *         &lt;element name="DrxModeQci1And2" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="DrxQci1And2" type="{http://Airspan.Netspan.WebServices}LteDrxEntryWs" minOccurs="0"/>
 *         &lt;element name="DrxModeQci5" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="DrxQci5" type="{http://Airspan.Netspan.WebServices}LteDrxEntryWs" minOccurs="0"/>
 *         &lt;element name="TwampAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="TwampReflectorMaxPps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampReflectorRenewalInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampReflectorList" type="{http://Airspan.Netspan.WebServices}TwampReflectorListContainer" minOccurs="0"/>
 *         &lt;element name="PlmnList" type="{http://Airspan.Netspan.WebServices}PlmnListContainer" minOccurs="0"/>
 *         &lt;element name="OperateBehindHenbGw" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="S1X2List" type="{http://Airspan.Netspan.WebServices}S1ListContainer" minOccurs="0"/>
 *         &lt;element name="CSONConfig" type="{http://Airspan.Netspan.WebServices}LteCSonEntryWs" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrPresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="M2McePresent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MceIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MceSctpPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsS1CVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S1CVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsS1UVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="S1UVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsX2CVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2CVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsX2UVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="X2UVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPtpVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PtpVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCSonVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CSonVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsM2VlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="M2VlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsM1VlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="M1VlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCallTraceSvrVlanConfigured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CallTraceSvrVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosProfile" type="{http://Airspan.Netspan.WebServices}BhQosProfileTypes" minOccurs="0"/>
 *         &lt;element name="BhQosVolteBh" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosBearerResponseTimeoutBwReservationServer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosBearerResponseTimeoutCpe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BhQosBwReservationServerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosHeartbeatInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosHeartbeatMaxRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMaxCreateBearerRetries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMeasDelayAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosMeasDelayThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMeasJitterAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosMeasJitterThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMeasPacketLossAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosMeasPacketLossThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMeasRtdAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosMeasRtdThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMinReservedForCallsNotYetAttempted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosMeasRfOff" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="BhQosPeriodicInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosRecoveryInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosResourceShortageExperimentalResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosResourceShortageResultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosRfAndAlarmOffThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhQosReservationServerIpAddressList" type="{http://Airspan.Netspan.WebServices}LteBhQosReservationServerIpAddressListContainer" minOccurs="0"/>
 *         &lt;element name="TwampSenderAdmin" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="TwampSender" type="{http://Airspan.Netspan.WebServices}LteTwampSenderContainer" minOccurs="0"/>
 *         &lt;element name="UlPktDataPriorityList" type="{http://Airspan.Netspan.WebServices}UlPktDataPriorityListContainer" minOccurs="0"/>
 *         &lt;element name="EtwsEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="EtwsUploadPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EtwsUploadPeriodNoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EtwsFileServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbNetworkProfileParams", propOrder = {
    "isStandardVoLTECodec",
    "codecType",
    "codecMode",
    "packetSize",
    "packetPeriodicity",
    "isRohcRtpQci1Enabled",
    "isRohcUdpQci1Enabled",
    "isRohcRtpQci2Enabled",
    "isRohcUdpQci2Enabled",
    "mmeOverloadAdmin",
    "mmeOverloadWaitTime",
    "mmeOverloadLoadReductionAdmin",
    "connectedModeDrx",
    "drxData",
    "drxModeQci1And2",
    "drxQci1And2",
    "drxModeQci5",
    "drxQci5",
    "twampAdmin",
    "twampReflectorMaxPps",
    "twampReflectorRenewalInterval",
    "twampReflectorList",
    "plmnList",
    "operateBehindHenbGw",
    "s1X2List",
    "csonConfig",
    "callTraceSvrPresent",
    "callTraceSvrIpAddress",
    "callTraceSvrPort",
    "m2McePresent",
    "mceIpAddress",
    "mceSctpPort",
    "isS1CVlanConfigured",
    "s1CVlanId",
    "isS1UVlanConfigured",
    "s1UVlanId",
    "isX2CVlanConfigured",
    "x2CVlanId",
    "isX2UVlanConfigured",
    "x2UVlanId",
    "isPtpVlanConfigured",
    "ptpVlanId",
    "isCSonVlanConfigured",
    "cSonVlanId",
    "isM2VlanConfigured",
    "m2VlanId",
    "isM1VlanConfigured",
    "m1VlanId",
    "isCallTraceSvrVlanConfigured",
    "callTraceSvrVlanId",
    "bhQosAdmin",
    "bhQosProfile",
    "bhQosVolteBh",
    "bhQosBearerResponseTimeoutBwReservationServer",
    "bhQosBearerResponseTimeoutCpe",
    "bhQosBwReservationServerPort",
    "bhQosHeartbeatInterval",
    "bhQosHeartbeatMaxRetries",
    "bhQosMaxCreateBearerRetries",
    "bhQosMeasDelayAdmin",
    "bhQosMeasDelayThreshold",
    "bhQosMeasJitterAdmin",
    "bhQosMeasJitterThreshold",
    "bhQosMeasPacketLossAdmin",
    "bhQosMeasPacketLossThreshold",
    "bhQosMeasRtdAdmin",
    "bhQosMeasRtdThreshold",
    "bhQosMinReservedForCallsNotYetAttempted",
    "bhQosMeasRfOff",
    "bhQosPeriodicInterval",
    "bhQosRecoveryInterval",
    "bhQosResourceShortageExperimentalResult",
    "bhQosResourceShortageResultCode",
    "bhQosRfAndAlarmOffThreshold",
    "bhQosReservationServerIpAddressList",
    "twampSenderAdmin",
    "twampSender",
    "ulPktDataPriorityList",
    "etwsEnabled",
    "etwsUploadPeriod",
    "etwsUploadPeriodNoData",
    "etwsFileServer"
})
@XmlSeeAlso({
    EnbNetworkProfile.class
})
public class EnbNetworkProfileParams {

    @XmlElementRef(name = "IsStandardVoLTECodec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStandardVoLTECodec;
    @XmlElementRef(name = "CodecType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTECodecType> codecType;
    @XmlElementRef(name = "CodecMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTECodecMode> codecMode;
    @XmlElementRef(name = "PacketSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packetSize;
    @XmlElementRef(name = "PacketPeriodicity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<VoLTEPeriodicity> packetPeriodicity;
    @XmlElementRef(name = "IsRohcRtpQci1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcRtpQci1Enabled;
    @XmlElementRef(name = "IsRohcUdpQci1Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcUdpQci1Enabled;
    @XmlElementRef(name = "IsRohcRtpQci2Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcRtpQci2Enabled;
    @XmlElementRef(name = "IsRohcUdpQci2Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isRohcUdpQci2Enabled;
    @XmlElementRef(name = "MmeOverloadAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mmeOverloadAdmin;
    @XmlElementRef(name = "MmeOverloadWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadWaitTime;
    @XmlElementRef(name = "MmeOverloadLoadReductionAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> mmeOverloadLoadReductionAdmin;
    @XmlElementRef(name = "ConnectedModeDrx", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> connectedModeDrx;
    @XmlElement(name = "DrxData")
    protected LteDrxEntryWs drxData;
    @XmlElementRef(name = "DrxModeQci1And2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> drxModeQci1And2;
    @XmlElement(name = "DrxQci1And2")
    protected LteDrxEntryWs drxQci1And2;
    @XmlElementRef(name = "DrxModeQci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> drxModeQci5;
    @XmlElement(name = "DrxQci5")
    protected LteDrxEntryWs drxQci5;
    @XmlElementRef(name = "TwampAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> twampAdmin;
    @XmlElementRef(name = "TwampReflectorMaxPps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampReflectorMaxPps;
    @XmlElementRef(name = "TwampReflectorRenewalInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampReflectorRenewalInterval;
    @XmlElement(name = "TwampReflectorList")
    protected TwampReflectorListContainer twampReflectorList;
    @XmlElement(name = "PlmnList")
    protected PlmnListContainer plmnList;
    @XmlElementRef(name = "OperateBehindHenbGw", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> operateBehindHenbGw;
    @XmlElement(name = "S1X2List")
    protected S1ListContainer s1X2List;
    @XmlElement(name = "CSONConfig")
    protected LteCSonEntryWs csonConfig;
    @XmlElementRef(name = "CallTraceSvrPresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> callTraceSvrPresent;
    @XmlElement(name = "CallTraceSvrIpAddress")
    protected String callTraceSvrIpAddress;
    @XmlElementRef(name = "CallTraceSvrPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callTraceSvrPort;
    @XmlElementRef(name = "M2McePresent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> m2McePresent;
    @XmlElement(name = "MceIpAddress")
    protected String mceIpAddress;
    @XmlElementRef(name = "MceSctpPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mceSctpPort;
    @XmlElementRef(name = "IsS1CVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isS1CVlanConfigured;
    @XmlElementRef(name = "S1CVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1CVlanId;
    @XmlElementRef(name = "IsS1UVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isS1UVlanConfigured;
    @XmlElementRef(name = "S1UVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1UVlanId;
    @XmlElementRef(name = "IsX2CVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isX2CVlanConfigured;
    @XmlElementRef(name = "X2CVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2CVlanId;
    @XmlElementRef(name = "IsX2UVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isX2UVlanConfigured;
    @XmlElementRef(name = "X2UVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2UVlanId;
    @XmlElementRef(name = "IsPtpVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPtpVlanConfigured;
    @XmlElementRef(name = "PtpVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ptpVlanId;
    @XmlElementRef(name = "IsCSonVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCSonVlanConfigured;
    @XmlElementRef(name = "CSonVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cSonVlanId;
    @XmlElementRef(name = "IsM2VlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isM2VlanConfigured;
    @XmlElementRef(name = "M2VlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m2VlanId;
    @XmlElementRef(name = "IsM1VlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isM1VlanConfigured;
    @XmlElementRef(name = "M1VlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> m1VlanId;
    @XmlElementRef(name = "IsCallTraceSvrVlanConfigured", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCallTraceSvrVlanConfigured;
    @XmlElementRef(name = "CallTraceSvrVlanId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callTraceSvrVlanId;
    @XmlElementRef(name = "BhQosAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosAdmin;
    @XmlElementRef(name = "BhQosProfile", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BhQosProfileTypes> bhQosProfile;
    @XmlElementRef(name = "BhQosVolteBh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosVolteBh;
    @XmlElementRef(name = "BhQosBearerResponseTimeoutBwReservationServer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosBearerResponseTimeoutBwReservationServer;
    @XmlElementRef(name = "BhQosBearerResponseTimeoutCpe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> bhQosBearerResponseTimeoutCpe;
    @XmlElementRef(name = "BhQosBwReservationServerPort", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosBwReservationServerPort;
    @XmlElementRef(name = "BhQosHeartbeatInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosHeartbeatInterval;
    @XmlElementRef(name = "BhQosHeartbeatMaxRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosHeartbeatMaxRetries;
    @XmlElementRef(name = "BhQosMaxCreateBearerRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMaxCreateBearerRetries;
    @XmlElementRef(name = "BhQosMeasDelayAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosMeasDelayAdmin;
    @XmlElementRef(name = "BhQosMeasDelayThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMeasDelayThreshold;
    @XmlElementRef(name = "BhQosMeasJitterAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosMeasJitterAdmin;
    @XmlElementRef(name = "BhQosMeasJitterThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMeasJitterThreshold;
    @XmlElementRef(name = "BhQosMeasPacketLossAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosMeasPacketLossAdmin;
    @XmlElementRef(name = "BhQosMeasPacketLossThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMeasPacketLossThreshold;
    @XmlElementRef(name = "BhQosMeasRtdAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosMeasRtdAdmin;
    @XmlElementRef(name = "BhQosMeasRtdThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMeasRtdThreshold;
    @XmlElementRef(name = "BhQosMinReservedForCallsNotYetAttempted", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosMinReservedForCallsNotYetAttempted;
    @XmlElementRef(name = "BhQosMeasRfOff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> bhQosMeasRfOff;
    @XmlElementRef(name = "BhQosPeriodicInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosPeriodicInterval;
    @XmlElementRef(name = "BhQosRecoveryInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosRecoveryInterval;
    @XmlElementRef(name = "BhQosResourceShortageExperimentalResult", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosResourceShortageExperimentalResult;
    @XmlElementRef(name = "BhQosResourceShortageResultCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosResourceShortageResultCode;
    @XmlElementRef(name = "BhQosRfAndAlarmOffThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhQosRfAndAlarmOffThreshold;
    @XmlElement(name = "BhQosReservationServerIpAddressList")
    protected LteBhQosReservationServerIpAddressListContainer bhQosReservationServerIpAddressList;
    @XmlElementRef(name = "TwampSenderAdmin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> twampSenderAdmin;
    @XmlElement(name = "TwampSender")
    protected LteTwampSenderContainer twampSender;
    @XmlElement(name = "UlPktDataPriorityList")
    protected UlPktDataPriorityListContainer ulPktDataPriorityList;
    @XmlElementRef(name = "EtwsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> etwsEnabled;
    @XmlElementRef(name = "EtwsUploadPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> etwsUploadPeriod;
    @XmlElementRef(name = "EtwsUploadPeriodNoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> etwsUploadPeriodNoData;
    @XmlElement(name = "EtwsFileServer")
    protected String etwsFileServer;

    /**
     * Gets the value of the isStandardVoLTECodec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStandardVoLTECodec() {
        return isStandardVoLTECodec;
    }

    /**
     * Sets the value of the isStandardVoLTECodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStandardVoLTECodec(JAXBElement<Boolean> value) {
        this.isStandardVoLTECodec = value;
    }

    /**
     * Gets the value of the codecType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecType }{@code >}
     *     
     */
    public JAXBElement<VoLTECodecType> getCodecType() {
        return codecType;
    }

    /**
     * Sets the value of the codecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecType }{@code >}
     *     
     */
    public void setCodecType(JAXBElement<VoLTECodecType> value) {
        this.codecType = value;
    }

    /**
     * Gets the value of the codecMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecMode }{@code >}
     *     
     */
    public JAXBElement<VoLTECodecMode> getCodecMode() {
        return codecMode;
    }

    /**
     * Sets the value of the codecMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTECodecMode }{@code >}
     *     
     */
    public void setCodecMode(JAXBElement<VoLTECodecMode> value) {
        this.codecMode = value;
    }

    /**
     * Gets the value of the packetSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPacketSize() {
        return packetSize;
    }

    /**
     * Sets the value of the packetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPacketSize(JAXBElement<Integer> value) {
        this.packetSize = value;
    }

    /**
     * Gets the value of the packetPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VoLTEPeriodicity }{@code >}
     *     
     */
    public JAXBElement<VoLTEPeriodicity> getPacketPeriodicity() {
        return packetPeriodicity;
    }

    /**
     * Sets the value of the packetPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VoLTEPeriodicity }{@code >}
     *     
     */
    public void setPacketPeriodicity(JAXBElement<VoLTEPeriodicity> value) {
        this.packetPeriodicity = value;
    }

    /**
     * Gets the value of the isRohcRtpQci1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcRtpQci1Enabled() {
        return isRohcRtpQci1Enabled;
    }

    /**
     * Sets the value of the isRohcRtpQci1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcRtpQci1Enabled(JAXBElement<Boolean> value) {
        this.isRohcRtpQci1Enabled = value;
    }

    /**
     * Gets the value of the isRohcUdpQci1Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcUdpQci1Enabled() {
        return isRohcUdpQci1Enabled;
    }

    /**
     * Sets the value of the isRohcUdpQci1Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcUdpQci1Enabled(JAXBElement<Boolean> value) {
        this.isRohcUdpQci1Enabled = value;
    }

    /**
     * Gets the value of the isRohcRtpQci2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcRtpQci2Enabled() {
        return isRohcRtpQci2Enabled;
    }

    /**
     * Sets the value of the isRohcRtpQci2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcRtpQci2Enabled(JAXBElement<Boolean> value) {
        this.isRohcRtpQci2Enabled = value;
    }

    /**
     * Gets the value of the isRohcUdpQci2Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsRohcUdpQci2Enabled() {
        return isRohcUdpQci2Enabled;
    }

    /**
     * Sets the value of the isRohcUdpQci2Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsRohcUdpQci2Enabled(JAXBElement<Boolean> value) {
        this.isRohcUdpQci2Enabled = value;
    }

    /**
     * Gets the value of the mmeOverloadAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMmeOverloadAdmin() {
        return mmeOverloadAdmin;
    }

    /**
     * Sets the value of the mmeOverloadAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMmeOverloadAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.mmeOverloadAdmin = value;
    }

    /**
     * Gets the value of the mmeOverloadWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadWaitTime() {
        return mmeOverloadWaitTime;
    }

    /**
     * Sets the value of the mmeOverloadWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadWaitTime(JAXBElement<Integer> value) {
        this.mmeOverloadWaitTime = value;
    }

    /**
     * Gets the value of the mmeOverloadLoadReductionAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getMmeOverloadLoadReductionAdmin() {
        return mmeOverloadLoadReductionAdmin;
    }

    /**
     * Sets the value of the mmeOverloadLoadReductionAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setMmeOverloadLoadReductionAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.mmeOverloadLoadReductionAdmin = value;
    }

    /**
     * Gets the value of the connectedModeDrx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getConnectedModeDrx() {
        return connectedModeDrx;
    }

    /**
     * Sets the value of the connectedModeDrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setConnectedModeDrx(JAXBElement<EnabledDisabledStates> value) {
        this.connectedModeDrx = value;
    }

    /**
     * Gets the value of the drxData property.
     * 
     * @return
     *     possible object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public LteDrxEntryWs getDrxData() {
        return drxData;
    }

    /**
     * Sets the value of the drxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public void setDrxData(LteDrxEntryWs value) {
        this.drxData = value;
    }

    /**
     * Gets the value of the drxModeQci1And2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getDrxModeQci1And2() {
        return drxModeQci1And2;
    }

    /**
     * Sets the value of the drxModeQci1And2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setDrxModeQci1And2(JAXBElement<EnabledDisabledStates> value) {
        this.drxModeQci1And2 = value;
    }

    /**
     * Gets the value of the drxQci1And2 property.
     * 
     * @return
     *     possible object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public LteDrxEntryWs getDrxQci1And2() {
        return drxQci1And2;
    }

    /**
     * Sets the value of the drxQci1And2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public void setDrxQci1And2(LteDrxEntryWs value) {
        this.drxQci1And2 = value;
    }

    /**
     * Gets the value of the drxModeQci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getDrxModeQci5() {
        return drxModeQci5;
    }

    /**
     * Sets the value of the drxModeQci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setDrxModeQci5(JAXBElement<EnabledDisabledStates> value) {
        this.drxModeQci5 = value;
    }

    /**
     * Gets the value of the drxQci5 property.
     * 
     * @return
     *     possible object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public LteDrxEntryWs getDrxQci5() {
        return drxQci5;
    }

    /**
     * Sets the value of the drxQci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteDrxEntryWs }
     *     
     */
    public void setDrxQci5(LteDrxEntryWs value) {
        this.drxQci5 = value;
    }

    /**
     * Gets the value of the twampAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTwampAdmin() {
        return twampAdmin;
    }

    /**
     * Sets the value of the twampAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTwampAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.twampAdmin = value;
    }

    /**
     * Gets the value of the twampReflectorMaxPps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampReflectorMaxPps() {
        return twampReflectorMaxPps;
    }

    /**
     * Sets the value of the twampReflectorMaxPps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampReflectorMaxPps(JAXBElement<Integer> value) {
        this.twampReflectorMaxPps = value;
    }

    /**
     * Gets the value of the twampReflectorRenewalInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampReflectorRenewalInterval() {
        return twampReflectorRenewalInterval;
    }

    /**
     * Sets the value of the twampReflectorRenewalInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampReflectorRenewalInterval(JAXBElement<Integer> value) {
        this.twampReflectorRenewalInterval = value;
    }

    /**
     * Gets the value of the twampReflectorList property.
     * 
     * @return
     *     possible object is
     *     {@link TwampReflectorListContainer }
     *     
     */
    public TwampReflectorListContainer getTwampReflectorList() {
        return twampReflectorList;
    }

    /**
     * Sets the value of the twampReflectorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwampReflectorListContainer }
     *     
     */
    public void setTwampReflectorList(TwampReflectorListContainer value) {
        this.twampReflectorList = value;
    }

    /**
     * Gets the value of the plmnList property.
     * 
     * @return
     *     possible object is
     *     {@link PlmnListContainer }
     *     
     */
    public PlmnListContainer getPlmnList() {
        return plmnList;
    }

    /**
     * Sets the value of the plmnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlmnListContainer }
     *     
     */
    public void setPlmnList(PlmnListContainer value) {
        this.plmnList = value;
    }

    /**
     * Gets the value of the operateBehindHenbGw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getOperateBehindHenbGw() {
        return operateBehindHenbGw;
    }

    /**
     * Sets the value of the operateBehindHenbGw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setOperateBehindHenbGw(JAXBElement<EnabledDisabledStates> value) {
        this.operateBehindHenbGw = value;
    }

    /**
     * Gets the value of the s1X2List property.
     * 
     * @return
     *     possible object is
     *     {@link S1ListContainer }
     *     
     */
    public S1ListContainer getS1X2List() {
        return s1X2List;
    }

    /**
     * Sets the value of the s1X2List property.
     * 
     * @param value
     *     allowed object is
     *     {@link S1ListContainer }
     *     
     */
    public void setS1X2List(S1ListContainer value) {
        this.s1X2List = value;
    }

    /**
     * Gets the value of the csonConfig property.
     * 
     * @return
     *     possible object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public LteCSonEntryWs getCSONConfig() {
        return csonConfig;
    }

    /**
     * Sets the value of the csonConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCSonEntryWs }
     *     
     */
    public void setCSONConfig(LteCSonEntryWs value) {
        this.csonConfig = value;
    }

    /**
     * Gets the value of the callTraceSvrPresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCallTraceSvrPresent() {
        return callTraceSvrPresent;
    }

    /**
     * Sets the value of the callTraceSvrPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCallTraceSvrPresent(JAXBElement<Boolean> value) {
        this.callTraceSvrPresent = value;
    }

    /**
     * Gets the value of the callTraceSvrIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceSvrIpAddress() {
        return callTraceSvrIpAddress;
    }

    /**
     * Sets the value of the callTraceSvrIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceSvrIpAddress(String value) {
        this.callTraceSvrIpAddress = value;
    }

    /**
     * Gets the value of the callTraceSvrPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallTraceSvrPort() {
        return callTraceSvrPort;
    }

    /**
     * Sets the value of the callTraceSvrPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallTraceSvrPort(JAXBElement<Integer> value) {
        this.callTraceSvrPort = value;
    }

    /**
     * Gets the value of the m2McePresent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getM2McePresent() {
        return m2McePresent;
    }

    /**
     * Sets the value of the m2McePresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setM2McePresent(JAXBElement<Boolean> value) {
        this.m2McePresent = value;
    }

    /**
     * Gets the value of the mceIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMceIpAddress() {
        return mceIpAddress;
    }

    /**
     * Sets the value of the mceIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMceIpAddress(String value) {
        this.mceIpAddress = value;
    }

    /**
     * Gets the value of the mceSctpPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMceSctpPort() {
        return mceSctpPort;
    }

    /**
     * Sets the value of the mceSctpPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMceSctpPort(JAXBElement<Integer> value) {
        this.mceSctpPort = value;
    }

    /**
     * Gets the value of the isS1CVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsS1CVlanConfigured() {
        return isS1CVlanConfigured;
    }

    /**
     * Sets the value of the isS1CVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsS1CVlanConfigured(JAXBElement<Boolean> value) {
        this.isS1CVlanConfigured = value;
    }

    /**
     * Gets the value of the s1CVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1CVlanId() {
        return s1CVlanId;
    }

    /**
     * Sets the value of the s1CVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1CVlanId(JAXBElement<Integer> value) {
        this.s1CVlanId = value;
    }

    /**
     * Gets the value of the isS1UVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsS1UVlanConfigured() {
        return isS1UVlanConfigured;
    }

    /**
     * Sets the value of the isS1UVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsS1UVlanConfigured(JAXBElement<Boolean> value) {
        this.isS1UVlanConfigured = value;
    }

    /**
     * Gets the value of the s1UVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1UVlanId() {
        return s1UVlanId;
    }

    /**
     * Sets the value of the s1UVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1UVlanId(JAXBElement<Integer> value) {
        this.s1UVlanId = value;
    }

    /**
     * Gets the value of the isX2CVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsX2CVlanConfigured() {
        return isX2CVlanConfigured;
    }

    /**
     * Sets the value of the isX2CVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsX2CVlanConfigured(JAXBElement<Boolean> value) {
        this.isX2CVlanConfigured = value;
    }

    /**
     * Gets the value of the x2CVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2CVlanId() {
        return x2CVlanId;
    }

    /**
     * Sets the value of the x2CVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2CVlanId(JAXBElement<Integer> value) {
        this.x2CVlanId = value;
    }

    /**
     * Gets the value of the isX2UVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsX2UVlanConfigured() {
        return isX2UVlanConfigured;
    }

    /**
     * Sets the value of the isX2UVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsX2UVlanConfigured(JAXBElement<Boolean> value) {
        this.isX2UVlanConfigured = value;
    }

    /**
     * Gets the value of the x2UVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2UVlanId() {
        return x2UVlanId;
    }

    /**
     * Sets the value of the x2UVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2UVlanId(JAXBElement<Integer> value) {
        this.x2UVlanId = value;
    }

    /**
     * Gets the value of the isPtpVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPtpVlanConfigured() {
        return isPtpVlanConfigured;
    }

    /**
     * Sets the value of the isPtpVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPtpVlanConfigured(JAXBElement<Boolean> value) {
        this.isPtpVlanConfigured = value;
    }

    /**
     * Gets the value of the ptpVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPtpVlanId() {
        return ptpVlanId;
    }

    /**
     * Sets the value of the ptpVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPtpVlanId(JAXBElement<Integer> value) {
        this.ptpVlanId = value;
    }

    /**
     * Gets the value of the isCSonVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCSonVlanConfigured() {
        return isCSonVlanConfigured;
    }

    /**
     * Sets the value of the isCSonVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCSonVlanConfigured(JAXBElement<Boolean> value) {
        this.isCSonVlanConfigured = value;
    }

    /**
     * Gets the value of the cSonVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCSonVlanId() {
        return cSonVlanId;
    }

    /**
     * Sets the value of the cSonVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCSonVlanId(JAXBElement<Integer> value) {
        this.cSonVlanId = value;
    }

    /**
     * Gets the value of the isM2VlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsM2VlanConfigured() {
        return isM2VlanConfigured;
    }

    /**
     * Sets the value of the isM2VlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsM2VlanConfigured(JAXBElement<Boolean> value) {
        this.isM2VlanConfigured = value;
    }

    /**
     * Gets the value of the m2VlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM2VlanId() {
        return m2VlanId;
    }

    /**
     * Sets the value of the m2VlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM2VlanId(JAXBElement<Integer> value) {
        this.m2VlanId = value;
    }

    /**
     * Gets the value of the isM1VlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsM1VlanConfigured() {
        return isM1VlanConfigured;
    }

    /**
     * Sets the value of the isM1VlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsM1VlanConfigured(JAXBElement<Boolean> value) {
        this.isM1VlanConfigured = value;
    }

    /**
     * Gets the value of the m1VlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getM1VlanId() {
        return m1VlanId;
    }

    /**
     * Sets the value of the m1VlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setM1VlanId(JAXBElement<Integer> value) {
        this.m1VlanId = value;
    }

    /**
     * Gets the value of the isCallTraceSvrVlanConfigured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCallTraceSvrVlanConfigured() {
        return isCallTraceSvrVlanConfigured;
    }

    /**
     * Sets the value of the isCallTraceSvrVlanConfigured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCallTraceSvrVlanConfigured(JAXBElement<Boolean> value) {
        this.isCallTraceSvrVlanConfigured = value;
    }

    /**
     * Gets the value of the callTraceSvrVlanId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallTraceSvrVlanId() {
        return callTraceSvrVlanId;
    }

    /**
     * Sets the value of the callTraceSvrVlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallTraceSvrVlanId(JAXBElement<Integer> value) {
        this.callTraceSvrVlanId = value;
    }

    /**
     * Gets the value of the bhQosAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosAdmin() {
        return bhQosAdmin;
    }

    /**
     * Sets the value of the bhQosAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosAdmin = value;
    }

    /**
     * Gets the value of the bhQosProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BhQosProfileTypes }{@code >}
     *     
     */
    public JAXBElement<BhQosProfileTypes> getBhQosProfile() {
        return bhQosProfile;
    }

    /**
     * Sets the value of the bhQosProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BhQosProfileTypes }{@code >}
     *     
     */
    public void setBhQosProfile(JAXBElement<BhQosProfileTypes> value) {
        this.bhQosProfile = value;
    }

    /**
     * Gets the value of the bhQosVolteBh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosVolteBh() {
        return bhQosVolteBh;
    }

    /**
     * Sets the value of the bhQosVolteBh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosVolteBh(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosVolteBh = value;
    }

    /**
     * Gets the value of the bhQosBearerResponseTimeoutBwReservationServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosBearerResponseTimeoutBwReservationServer() {
        return bhQosBearerResponseTimeoutBwReservationServer;
    }

    /**
     * Sets the value of the bhQosBearerResponseTimeoutBwReservationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosBearerResponseTimeoutBwReservationServer(JAXBElement<Integer> value) {
        this.bhQosBearerResponseTimeoutBwReservationServer = value;
    }

    /**
     * Gets the value of the bhQosBearerResponseTimeoutCpe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBhQosBearerResponseTimeoutCpe() {
        return bhQosBearerResponseTimeoutCpe;
    }

    /**
     * Sets the value of the bhQosBearerResponseTimeoutCpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBhQosBearerResponseTimeoutCpe(JAXBElement<BigDecimal> value) {
        this.bhQosBearerResponseTimeoutCpe = value;
    }

    /**
     * Gets the value of the bhQosBwReservationServerPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosBwReservationServerPort() {
        return bhQosBwReservationServerPort;
    }

    /**
     * Sets the value of the bhQosBwReservationServerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosBwReservationServerPort(JAXBElement<Integer> value) {
        this.bhQosBwReservationServerPort = value;
    }

    /**
     * Gets the value of the bhQosHeartbeatInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosHeartbeatInterval() {
        return bhQosHeartbeatInterval;
    }

    /**
     * Sets the value of the bhQosHeartbeatInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosHeartbeatInterval(JAXBElement<Integer> value) {
        this.bhQosHeartbeatInterval = value;
    }

    /**
     * Gets the value of the bhQosHeartbeatMaxRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosHeartbeatMaxRetries() {
        return bhQosHeartbeatMaxRetries;
    }

    /**
     * Sets the value of the bhQosHeartbeatMaxRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosHeartbeatMaxRetries(JAXBElement<Integer> value) {
        this.bhQosHeartbeatMaxRetries = value;
    }

    /**
     * Gets the value of the bhQosMaxCreateBearerRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMaxCreateBearerRetries() {
        return bhQosMaxCreateBearerRetries;
    }

    /**
     * Sets the value of the bhQosMaxCreateBearerRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMaxCreateBearerRetries(JAXBElement<Integer> value) {
        this.bhQosMaxCreateBearerRetries = value;
    }

    /**
     * Gets the value of the bhQosMeasDelayAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosMeasDelayAdmin() {
        return bhQosMeasDelayAdmin;
    }

    /**
     * Sets the value of the bhQosMeasDelayAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosMeasDelayAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosMeasDelayAdmin = value;
    }

    /**
     * Gets the value of the bhQosMeasDelayThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMeasDelayThreshold() {
        return bhQosMeasDelayThreshold;
    }

    /**
     * Sets the value of the bhQosMeasDelayThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMeasDelayThreshold(JAXBElement<Integer> value) {
        this.bhQosMeasDelayThreshold = value;
    }

    /**
     * Gets the value of the bhQosMeasJitterAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosMeasJitterAdmin() {
        return bhQosMeasJitterAdmin;
    }

    /**
     * Sets the value of the bhQosMeasJitterAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosMeasJitterAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosMeasJitterAdmin = value;
    }

    /**
     * Gets the value of the bhQosMeasJitterThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMeasJitterThreshold() {
        return bhQosMeasJitterThreshold;
    }

    /**
     * Sets the value of the bhQosMeasJitterThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMeasJitterThreshold(JAXBElement<Integer> value) {
        this.bhQosMeasJitterThreshold = value;
    }

    /**
     * Gets the value of the bhQosMeasPacketLossAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosMeasPacketLossAdmin() {
        return bhQosMeasPacketLossAdmin;
    }

    /**
     * Sets the value of the bhQosMeasPacketLossAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosMeasPacketLossAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosMeasPacketLossAdmin = value;
    }

    /**
     * Gets the value of the bhQosMeasPacketLossThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMeasPacketLossThreshold() {
        return bhQosMeasPacketLossThreshold;
    }

    /**
     * Sets the value of the bhQosMeasPacketLossThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMeasPacketLossThreshold(JAXBElement<Integer> value) {
        this.bhQosMeasPacketLossThreshold = value;
    }

    /**
     * Gets the value of the bhQosMeasRtdAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosMeasRtdAdmin() {
        return bhQosMeasRtdAdmin;
    }

    /**
     * Sets the value of the bhQosMeasRtdAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosMeasRtdAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosMeasRtdAdmin = value;
    }

    /**
     * Gets the value of the bhQosMeasRtdThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMeasRtdThreshold() {
        return bhQosMeasRtdThreshold;
    }

    /**
     * Sets the value of the bhQosMeasRtdThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMeasRtdThreshold(JAXBElement<Integer> value) {
        this.bhQosMeasRtdThreshold = value;
    }

    /**
     * Gets the value of the bhQosMinReservedForCallsNotYetAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosMinReservedForCallsNotYetAttempted() {
        return bhQosMinReservedForCallsNotYetAttempted;
    }

    /**
     * Sets the value of the bhQosMinReservedForCallsNotYetAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosMinReservedForCallsNotYetAttempted(JAXBElement<Integer> value) {
        this.bhQosMinReservedForCallsNotYetAttempted = value;
    }

    /**
     * Gets the value of the bhQosMeasRfOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getBhQosMeasRfOff() {
        return bhQosMeasRfOff;
    }

    /**
     * Sets the value of the bhQosMeasRfOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setBhQosMeasRfOff(JAXBElement<EnabledDisabledStates> value) {
        this.bhQosMeasRfOff = value;
    }

    /**
     * Gets the value of the bhQosPeriodicInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosPeriodicInterval() {
        return bhQosPeriodicInterval;
    }

    /**
     * Sets the value of the bhQosPeriodicInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosPeriodicInterval(JAXBElement<Integer> value) {
        this.bhQosPeriodicInterval = value;
    }

    /**
     * Gets the value of the bhQosRecoveryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosRecoveryInterval() {
        return bhQosRecoveryInterval;
    }

    /**
     * Sets the value of the bhQosRecoveryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosRecoveryInterval(JAXBElement<Integer> value) {
        this.bhQosRecoveryInterval = value;
    }

    /**
     * Gets the value of the bhQosResourceShortageExperimentalResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosResourceShortageExperimentalResult() {
        return bhQosResourceShortageExperimentalResult;
    }

    /**
     * Sets the value of the bhQosResourceShortageExperimentalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosResourceShortageExperimentalResult(JAXBElement<Integer> value) {
        this.bhQosResourceShortageExperimentalResult = value;
    }

    /**
     * Gets the value of the bhQosResourceShortageResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosResourceShortageResultCode() {
        return bhQosResourceShortageResultCode;
    }

    /**
     * Sets the value of the bhQosResourceShortageResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosResourceShortageResultCode(JAXBElement<Integer> value) {
        this.bhQosResourceShortageResultCode = value;
    }

    /**
     * Gets the value of the bhQosRfAndAlarmOffThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhQosRfAndAlarmOffThreshold() {
        return bhQosRfAndAlarmOffThreshold;
    }

    /**
     * Sets the value of the bhQosRfAndAlarmOffThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhQosRfAndAlarmOffThreshold(JAXBElement<Integer> value) {
        this.bhQosRfAndAlarmOffThreshold = value;
    }

    /**
     * Gets the value of the bhQosReservationServerIpAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link LteBhQosReservationServerIpAddressListContainer }
     *     
     */
    public LteBhQosReservationServerIpAddressListContainer getBhQosReservationServerIpAddressList() {
        return bhQosReservationServerIpAddressList;
    }

    /**
     * Sets the value of the bhQosReservationServerIpAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteBhQosReservationServerIpAddressListContainer }
     *     
     */
    public void setBhQosReservationServerIpAddressList(LteBhQosReservationServerIpAddressListContainer value) {
        this.bhQosReservationServerIpAddressList = value;
    }

    /**
     * Gets the value of the twampSenderAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getTwampSenderAdmin() {
        return twampSenderAdmin;
    }

    /**
     * Sets the value of the twampSenderAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setTwampSenderAdmin(JAXBElement<EnabledDisabledStates> value) {
        this.twampSenderAdmin = value;
    }

    /**
     * Gets the value of the twampSender property.
     * 
     * @return
     *     possible object is
     *     {@link LteTwampSenderContainer }
     *     
     */
    public LteTwampSenderContainer getTwampSender() {
        return twampSender;
    }

    /**
     * Sets the value of the twampSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteTwampSenderContainer }
     *     
     */
    public void setTwampSender(LteTwampSenderContainer value) {
        this.twampSender = value;
    }

    /**
     * Gets the value of the ulPktDataPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public UlPktDataPriorityListContainer getUlPktDataPriorityList() {
        return ulPktDataPriorityList;
    }

    /**
     * Sets the value of the ulPktDataPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UlPktDataPriorityListContainer }
     *     
     */
    public void setUlPktDataPriorityList(UlPktDataPriorityListContainer value) {
        this.ulPktDataPriorityList = value;
    }

    /**
     * Gets the value of the etwsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getEtwsEnabled() {
        return etwsEnabled;
    }

    /**
     * Sets the value of the etwsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setEtwsEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.etwsEnabled = value;
    }

    /**
     * Gets the value of the etwsUploadPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEtwsUploadPeriod() {
        return etwsUploadPeriod;
    }

    /**
     * Sets the value of the etwsUploadPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEtwsUploadPeriod(JAXBElement<Integer> value) {
        this.etwsUploadPeriod = value;
    }

    /**
     * Gets the value of the etwsUploadPeriodNoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEtwsUploadPeriodNoData() {
        return etwsUploadPeriodNoData;
    }

    /**
     * Sets the value of the etwsUploadPeriodNoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEtwsUploadPeriodNoData(JAXBElement<Integer> value) {
        this.etwsUploadPeriodNoData = value;
    }

    /**
     * Gets the value of the etwsFileServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtwsFileServer() {
        return etwsFileServer;
    }

    /**
     * Sets the value of the etwsFileServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtwsFileServer(String value) {
        this.etwsFileServer = value;
    }

}
