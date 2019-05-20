
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CsgModes;


/**
 * <p>Java class for LteCellGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCellGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://Airspan.Netspan.WebServices}EnbCellNumber" minOccurs="0"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellIdForEci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellIdentity28Bit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachRsi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrackingAreaCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyAreaIds" type="{http://Airspan.Netspan.WebServices}EaidsParams" minOccurs="0"/&gt;
 *         &lt;element name="PrachFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellAdvancedConfigurationProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomRadioProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbRadioProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="MobilityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomMobilityProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbMobilityProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="EmbmsProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomEmbmsProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbEmbmsProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="TrafficManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomTrafficManagementProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbTrafficManagementProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="CallTraceProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomCallTraceProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbCallTraceProfileParams" minOccurs="0"/&gt;
 *         &lt;element name="CellBarringPolicy" type="{http://Airspan.Netspan.WebServices}CellBarringPolicies" minOccurs="0"/&gt;
 *         &lt;element name="IsAccessClassBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEmergencyAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SignalingAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="SignalingAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSignalingAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="DataAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsDataAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VoiceAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="VoiceAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVoiceAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VideoAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="VideoAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsVideoAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CsfbAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/&gt;
 *         &lt;element name="CsfbAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCsfbAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CsfbCdma2kCellParam" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kCellParams" minOccurs="0"/&gt;
 *         &lt;element name="CsfbCdma2kSib8Param" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kSib8Params" minOccurs="0"/&gt;
 *         &lt;element name="CsfbCdma2kMobilityParam" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kMobilityParams" minOccurs="0"/&gt;
 *         &lt;element name="Csfb2gRimParams" type="{http://Airspan.Netspan.WebServices}Csfb2gRimParams" minOccurs="0"/&gt;
 *         &lt;element name="CsgMode" type="{http://Airspan.Netspan.WebServices}CsgModes" minOccurs="0"/&gt;
 *         &lt;element name="CsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCellGetWs", propOrder = {
    "cellNumber",
    "cellId",
    "cellIdForEci",
    "cellIdentity28Bit",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "prachRsi",
    "trackingAreaCode",
    "emergencyAreaIds",
    "prachFreqOffset",
    "cellAdvancedConfigurationProfile",
    "radioProfile",
    "customRadioProfileParameters",
    "mobilityProfile",
    "customMobilityProfileParameters",
    "embmsProfile",
    "customEmbmsProfileParameters",
    "trafficManagementProfile",
    "customTrafficManagementProfileParameters",
    "callTraceProfile",
    "customCallTraceProfileParameters",
    "cellBarringPolicy",
    "isAccessClassBarred",
    "isEmergencyAccessBarred",
    "isSignalingAccessBarred",
    "signalingAccessBarringFactor",
    "signalingAccessBarringTimeInSec",
    "isSignalingAccessClass11Barred",
    "isSignalingAccessClass12Barred",
    "isSignalingAccessClass13Barred",
    "isSignalingAccessClass14Barred",
    "isSignalingAccessClass15Barred",
    "isDataAccessBarred",
    "dataAccessBarringFactor",
    "dataAccessBarringTimeInSec",
    "isDataAccessClass11Barred",
    "isDataAccessClass12Barred",
    "isDataAccessClass13Barred",
    "isDataAccessClass14Barred",
    "isDataAccessClass15Barred",
    "isVoiceAccessBarred",
    "voiceAccessBarringFactor",
    "voiceAccessBarringTimeInSec",
    "isVoiceAccessClass11Barred",
    "isVoiceAccessClass12Barred",
    "isVoiceAccessClass13Barred",
    "isVoiceAccessClass14Barred",
    "isVoiceAccessClass15Barred",
    "isVideoAccessBarred",
    "videoAccessBarringFactor",
    "videoAccessBarringTimeInSec",
    "isVideoAccessClass11Barred",
    "isVideoAccessClass12Barred",
    "isVideoAccessClass13Barred",
    "isVideoAccessClass14Barred",
    "isVideoAccessClass15Barred",
    "isCsfbAccessBarred",
    "csfbAccessBarringFactor",
    "csfbAccessBarringTimeInSec",
    "isCsfbAccessClass11Barred",
    "isCsfbAccessClass12Barred",
    "isCsfbAccessClass13Barred",
    "isCsfbAccessClass14Barred",
    "isCsfbAccessClass15Barred",
    "isEnabled",
    "csfbCdma2KCellParam",
    "csfbCdma2KSib8Param",
    "csfbCdma2KMobilityParam",
    "csfb2GRimParams",
    "csgMode",
    "csgId"
})
public class LteCellGetWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellNumber;
    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "CellIdForEci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdForEci;
    @XmlElementRef(name = "CellIdentity28Bit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentity28Bit;
    @XmlElementRef(name = "PhysicalLayerCellGroup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerCellGroup;
    @XmlElementRef(name = "PhysicalLayerIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerIdentity;
    @XmlElementRef(name = "PhysicalCellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalCellId;
    @XmlElementRef(name = "PrachRsi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachRsi;
    @XmlElementRef(name = "TrackingAreaCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trackingAreaCode;
    @XmlElement(name = "EmergencyAreaIds")
    protected EaidsParams emergencyAreaIds;
    @XmlElementRef(name = "PrachFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachFreqOffset;
    @XmlElement(name = "CellAdvancedConfigurationProfile")
    protected String cellAdvancedConfigurationProfile;
    @XmlElement(name = "RadioProfile")
    protected String radioProfile;
    @XmlElement(name = "CustomRadioProfileParameters")
    protected EnbRadioProfileParams customRadioProfileParameters;
    @XmlElement(name = "MobilityProfile")
    protected String mobilityProfile;
    @XmlElement(name = "CustomMobilityProfileParameters")
    protected EnbMobilityProfileParams customMobilityProfileParameters;
    @XmlElement(name = "EmbmsProfile")
    protected String embmsProfile;
    @XmlElement(name = "CustomEmbmsProfileParameters")
    protected EnbEmbmsProfileParams customEmbmsProfileParameters;
    @XmlElement(name = "TrafficManagementProfile")
    protected String trafficManagementProfile;
    @XmlElement(name = "CustomTrafficManagementProfileParameters")
    protected EnbTrafficManagementProfileParams customTrafficManagementProfileParameters;
    @XmlElement(name = "CallTraceProfile")
    protected String callTraceProfile;
    @XmlElement(name = "CustomCallTraceProfileParameters")
    protected EnbCallTraceProfileParams customCallTraceProfileParameters;
    @XmlElementRef(name = "CellBarringPolicy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CellBarringPolicies> cellBarringPolicy;
    @XmlElementRef(name = "IsAccessClassBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAccessClassBarred;
    @XmlElementRef(name = "IsEmergencyAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEmergencyAccessBarred;
    @XmlElementRef(name = "IsSignalingAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessBarred;
    @XmlElementRef(name = "SignalingAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringFactor;
    @XmlElementRef(name = "SignalingAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringTimeInSec;
    @XmlElementRef(name = "IsSignalingAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass11Barred;
    @XmlElementRef(name = "IsSignalingAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass12Barred;
    @XmlElementRef(name = "IsSignalingAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass13Barred;
    @XmlElementRef(name = "IsSignalingAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass14Barred;
    @XmlElementRef(name = "IsSignalingAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass15Barred;
    @XmlElementRef(name = "IsDataAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessBarred;
    @XmlElementRef(name = "DataAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringFactor;
    @XmlElementRef(name = "DataAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringTimeInSec;
    @XmlElementRef(name = "IsDataAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass11Barred;
    @XmlElementRef(name = "IsDataAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass12Barred;
    @XmlElementRef(name = "IsDataAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass13Barred;
    @XmlElementRef(name = "IsDataAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass14Barred;
    @XmlElementRef(name = "IsDataAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass15Barred;
    @XmlElementRef(name = "IsVoiceAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessBarred;
    @XmlElementRef(name = "VoiceAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceAccessBarringFactor;
    @XmlElementRef(name = "VoiceAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceAccessBarringTimeInSec;
    @XmlElementRef(name = "IsVoiceAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass11Barred;
    @XmlElementRef(name = "IsVoiceAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass12Barred;
    @XmlElementRef(name = "IsVoiceAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass13Barred;
    @XmlElementRef(name = "IsVoiceAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass14Barred;
    @XmlElementRef(name = "IsVoiceAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVoiceAccessClass15Barred;
    @XmlElementRef(name = "IsVideoAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessBarred;
    @XmlElementRef(name = "VideoAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoAccessBarringFactor;
    @XmlElementRef(name = "VideoAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> videoAccessBarringTimeInSec;
    @XmlElementRef(name = "IsVideoAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass11Barred;
    @XmlElementRef(name = "IsVideoAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass12Barred;
    @XmlElementRef(name = "IsVideoAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass13Barred;
    @XmlElementRef(name = "IsVideoAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass14Barred;
    @XmlElementRef(name = "IsVideoAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isVideoAccessClass15Barred;
    @XmlElementRef(name = "IsCsfbAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessBarred;
    @XmlElementRef(name = "CsfbAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csfbAccessBarringFactor;
    @XmlElementRef(name = "CsfbAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csfbAccessBarringTimeInSec;
    @XmlElementRef(name = "IsCsfbAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass11Barred;
    @XmlElementRef(name = "IsCsfbAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass12Barred;
    @XmlElementRef(name = "IsCsfbAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass13Barred;
    @XmlElementRef(name = "IsCsfbAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass14Barred;
    @XmlElementRef(name = "IsCsfbAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCsfbAccessClass15Barred;
    @XmlElementRef(name = "IsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElement(name = "CsfbCdma2kCellParam")
    protected CsfbCdma2KCellParams csfbCdma2KCellParam;
    @XmlElement(name = "CsfbCdma2kSib8Param")
    protected CsfbCdma2KSib8Params csfbCdma2KSib8Param;
    @XmlElement(name = "CsfbCdma2kMobilityParam")
    protected CsfbCdma2KMobilityParams csfbCdma2KMobilityParam;
    @XmlElement(name = "Csfb2gRimParams")
    protected Csfb2GRimParams csfb2GRimParams;
    @XmlElementRef(name = "CsgMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CsgModes> csgMode;
    @XmlElementRef(name = "CsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csgId;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<String> value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellId(JAXBElement<Integer> value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the cellIdForEci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdForEci() {
        return cellIdForEci;
    }

    /**
     * Sets the value of the cellIdForEci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdForEci(JAXBElement<Integer> value) {
        this.cellIdForEci = value;
    }

    /**
     * Gets the value of the cellIdentity28Bit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentity28Bit() {
        return cellIdentity28Bit;
    }

    /**
     * Sets the value of the cellIdentity28Bit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentity28Bit(JAXBElement<Integer> value) {
        this.cellIdentity28Bit = value;
    }

    /**
     * Gets the value of the physicalLayerCellGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerCellGroup() {
        return physicalLayerCellGroup;
    }

    /**
     * Sets the value of the physicalLayerCellGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerCellGroup(JAXBElement<Integer> value) {
        this.physicalLayerCellGroup = value;
    }

    /**
     * Gets the value of the physicalLayerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerIdentity() {
        return physicalLayerIdentity;
    }

    /**
     * Sets the value of the physicalLayerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerIdentity(JAXBElement<Integer> value) {
        this.physicalLayerIdentity = value;
    }

    /**
     * Gets the value of the physicalCellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalCellId() {
        return physicalCellId;
    }

    /**
     * Sets the value of the physicalCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalCellId(JAXBElement<Integer> value) {
        this.physicalCellId = value;
    }

    /**
     * Gets the value of the prachRsi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachRsi() {
        return prachRsi;
    }

    /**
     * Sets the value of the prachRsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachRsi(JAXBElement<Integer> value) {
        this.prachRsi = value;
    }

    /**
     * Gets the value of the trackingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrackingAreaCode() {
        return trackingAreaCode;
    }

    /**
     * Sets the value of the trackingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrackingAreaCode(JAXBElement<Integer> value) {
        this.trackingAreaCode = value;
    }

    /**
     * Gets the value of the emergencyAreaIds property.
     * 
     * @return
     *     possible object is
     *     {@link EaidsParams }
     *     
     */
    public EaidsParams getEmergencyAreaIds() {
        return emergencyAreaIds;
    }

    /**
     * Sets the value of the emergencyAreaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EaidsParams }
     *     
     */
    public void setEmergencyAreaIds(EaidsParams value) {
        this.emergencyAreaIds = value;
    }

    /**
     * Gets the value of the prachFreqOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachFreqOffset() {
        return prachFreqOffset;
    }

    /**
     * Sets the value of the prachFreqOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachFreqOffset(JAXBElement<Integer> value) {
        this.prachFreqOffset = value;
    }

    /**
     * Gets the value of the cellAdvancedConfigurationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellAdvancedConfigurationProfile() {
        return cellAdvancedConfigurationProfile;
    }

    /**
     * Sets the value of the cellAdvancedConfigurationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellAdvancedConfigurationProfile(String value) {
        this.cellAdvancedConfigurationProfile = value;
    }

    /**
     * Gets the value of the radioProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioProfile() {
        return radioProfile;
    }

    /**
     * Sets the value of the radioProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioProfile(String value) {
        this.radioProfile = value;
    }

    /**
     * Gets the value of the customRadioProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbRadioProfileParams }
     *     
     */
    public EnbRadioProfileParams getCustomRadioProfileParameters() {
        return customRadioProfileParameters;
    }

    /**
     * Sets the value of the customRadioProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbRadioProfileParams }
     *     
     */
    public void setCustomRadioProfileParameters(EnbRadioProfileParams value) {
        this.customRadioProfileParameters = value;
    }

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityProfile(String value) {
        this.mobilityProfile = value;
    }

    /**
     * Gets the value of the customMobilityProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMobilityProfileParams }
     *     
     */
    public EnbMobilityProfileParams getCustomMobilityProfileParameters() {
        return customMobilityProfileParameters;
    }

    /**
     * Sets the value of the customMobilityProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMobilityProfileParams }
     *     
     */
    public void setCustomMobilityProfileParameters(EnbMobilityProfileParams value) {
        this.customMobilityProfileParameters = value;
    }

    /**
     * Gets the value of the embmsProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbmsProfile() {
        return embmsProfile;
    }

    /**
     * Sets the value of the embmsProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbmsProfile(String value) {
        this.embmsProfile = value;
    }

    /**
     * Gets the value of the customEmbmsProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbEmbmsProfileParams }
     *     
     */
    public EnbEmbmsProfileParams getCustomEmbmsProfileParameters() {
        return customEmbmsProfileParameters;
    }

    /**
     * Sets the value of the customEmbmsProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbEmbmsProfileParams }
     *     
     */
    public void setCustomEmbmsProfileParameters(EnbEmbmsProfileParams value) {
        this.customEmbmsProfileParameters = value;
    }

    /**
     * Gets the value of the trafficManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficManagementProfile() {
        return trafficManagementProfile;
    }

    /**
     * Sets the value of the trafficManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficManagementProfile(String value) {
        this.trafficManagementProfile = value;
    }

    /**
     * Gets the value of the customTrafficManagementProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbTrafficManagementProfileParams }
     *     
     */
    public EnbTrafficManagementProfileParams getCustomTrafficManagementProfileParameters() {
        return customTrafficManagementProfileParameters;
    }

    /**
     * Sets the value of the customTrafficManagementProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbTrafficManagementProfileParams }
     *     
     */
    public void setCustomTrafficManagementProfileParameters(EnbTrafficManagementProfileParams value) {
        this.customTrafficManagementProfileParameters = value;
    }

    /**
     * Gets the value of the callTraceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceProfile() {
        return callTraceProfile;
    }

    /**
     * Sets the value of the callTraceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceProfile(String value) {
        this.callTraceProfile = value;
    }

    /**
     * Gets the value of the customCallTraceProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbCallTraceProfileParams }
     *     
     */
    public EnbCallTraceProfileParams getCustomCallTraceProfileParameters() {
        return customCallTraceProfileParameters;
    }

    /**
     * Sets the value of the customCallTraceProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbCallTraceProfileParams }
     *     
     */
    public void setCustomCallTraceProfileParameters(EnbCallTraceProfileParams value) {
        this.customCallTraceProfileParameters = value;
    }

    /**
     * Gets the value of the cellBarringPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellBarringPolicies }{@code >}
     *     
     */
    public JAXBElement<CellBarringPolicies> getCellBarringPolicy() {
        return cellBarringPolicy;
    }

    /**
     * Sets the value of the cellBarringPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellBarringPolicies }{@code >}
     *     
     */
    public void setCellBarringPolicy(JAXBElement<CellBarringPolicies> value) {
        this.cellBarringPolicy = value;
    }

    /**
     * Gets the value of the isAccessClassBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAccessClassBarred() {
        return isAccessClassBarred;
    }

    /**
     * Sets the value of the isAccessClassBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAccessClassBarred(JAXBElement<Boolean> value) {
        this.isAccessClassBarred = value;
    }

    /**
     * Gets the value of the isEmergencyAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEmergencyAccessBarred() {
        return isEmergencyAccessBarred;
    }

    /**
     * Sets the value of the isEmergencyAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEmergencyAccessBarred(JAXBElement<Boolean> value) {
        this.isEmergencyAccessBarred = value;
    }

    /**
     * Gets the value of the isSignalingAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessBarred() {
        return isSignalingAccessBarred;
    }

    /**
     * Sets the value of the isSignalingAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessBarred(JAXBElement<Boolean> value) {
        this.isSignalingAccessBarred = value;
    }

    /**
     * Gets the value of the signalingAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringFactor() {
        return signalingAccessBarringFactor;
    }

    /**
     * Sets the value of the signalingAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringFactor(JAXBElement<String> value) {
        this.signalingAccessBarringFactor = value;
    }

    /**
     * Gets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringTimeInSec() {
        return signalingAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringTimeInSec(JAXBElement<String> value) {
        this.signalingAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass11Barred() {
        return isSignalingAccessClass11Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass12Barred() {
        return isSignalingAccessClass12Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass13Barred() {
        return isSignalingAccessClass13Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass14Barred() {
        return isSignalingAccessClass14Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass15Barred() {
        return isSignalingAccessClass15Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isDataAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessBarred() {
        return isDataAccessBarred;
    }

    /**
     * Sets the value of the isDataAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessBarred(JAXBElement<Boolean> value) {
        this.isDataAccessBarred = value;
    }

    /**
     * Gets the value of the dataAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringFactor() {
        return dataAccessBarringFactor;
    }

    /**
     * Sets the value of the dataAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringFactor(JAXBElement<String> value) {
        this.dataAccessBarringFactor = value;
    }

    /**
     * Gets the value of the dataAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringTimeInSec() {
        return dataAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the dataAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringTimeInSec(JAXBElement<String> value) {
        this.dataAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isDataAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass11Barred() {
        return isDataAccessClass11Barred;
    }

    /**
     * Sets the value of the isDataAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass12Barred() {
        return isDataAccessClass12Barred;
    }

    /**
     * Sets the value of the isDataAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass13Barred() {
        return isDataAccessClass13Barred;
    }

    /**
     * Sets the value of the isDataAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass14Barred() {
        return isDataAccessClass14Barred;
    }

    /**
     * Sets the value of the isDataAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass15Barred() {
        return isDataAccessClass15Barred;
    }

    /**
     * Sets the value of the isDataAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessBarred() {
        return isVoiceAccessBarred;
    }

    /**
     * Sets the value of the isVoiceAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessBarred(JAXBElement<Boolean> value) {
        this.isVoiceAccessBarred = value;
    }

    /**
     * Gets the value of the voiceAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceAccessBarringFactor() {
        return voiceAccessBarringFactor;
    }

    /**
     * Sets the value of the voiceAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceAccessBarringFactor(JAXBElement<String> value) {
        this.voiceAccessBarringFactor = value;
    }

    /**
     * Gets the value of the voiceAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceAccessBarringTimeInSec() {
        return voiceAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the voiceAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceAccessBarringTimeInSec(JAXBElement<String> value) {
        this.voiceAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass11Barred() {
        return isVoiceAccessClass11Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass12Barred() {
        return isVoiceAccessClass12Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass13Barred() {
        return isVoiceAccessClass13Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass14Barred() {
        return isVoiceAccessClass14Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isVoiceAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVoiceAccessClass15Barred() {
        return isVoiceAccessClass15Barred;
    }

    /**
     * Sets the value of the isVoiceAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVoiceAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isVoiceAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessBarred() {
        return isVideoAccessBarred;
    }

    /**
     * Sets the value of the isVideoAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessBarred(JAXBElement<Boolean> value) {
        this.isVideoAccessBarred = value;
    }

    /**
     * Gets the value of the videoAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoAccessBarringFactor() {
        return videoAccessBarringFactor;
    }

    /**
     * Sets the value of the videoAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoAccessBarringFactor(JAXBElement<String> value) {
        this.videoAccessBarringFactor = value;
    }

    /**
     * Gets the value of the videoAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVideoAccessBarringTimeInSec() {
        return videoAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the videoAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVideoAccessBarringTimeInSec(JAXBElement<String> value) {
        this.videoAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isVideoAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass11Barred() {
        return isVideoAccessClass11Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass12Barred() {
        return isVideoAccessClass12Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass13Barred() {
        return isVideoAccessClass13Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass14Barred() {
        return isVideoAccessClass14Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isVideoAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsVideoAccessClass15Barred() {
        return isVideoAccessClass15Barred;
    }

    /**
     * Sets the value of the isVideoAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsVideoAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isVideoAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessBarred() {
        return isCsfbAccessBarred;
    }

    /**
     * Sets the value of the isCsfbAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessBarred(JAXBElement<Boolean> value) {
        this.isCsfbAccessBarred = value;
    }

    /**
     * Gets the value of the csfbAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsfbAccessBarringFactor() {
        return csfbAccessBarringFactor;
    }

    /**
     * Sets the value of the csfbAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsfbAccessBarringFactor(JAXBElement<String> value) {
        this.csfbAccessBarringFactor = value;
    }

    /**
     * Gets the value of the csfbAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCsfbAccessBarringTimeInSec() {
        return csfbAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the csfbAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCsfbAccessBarringTimeInSec(JAXBElement<String> value) {
        this.csfbAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass11Barred() {
        return isCsfbAccessClass11Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass12Barred() {
        return isCsfbAccessClass12Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass13Barred() {
        return isCsfbAccessClass13Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass14Barred() {
        return isCsfbAccessClass14Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isCsfbAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCsfbAccessClass15Barred() {
        return isCsfbAccessClass15Barred;
    }

    /**
     * Sets the value of the isCsfbAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCsfbAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isCsfbAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the csfbCdma2KCellParam property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KCellParams }
     *     
     */
    public CsfbCdma2KCellParams getCsfbCdma2KCellParam() {
        return csfbCdma2KCellParam;
    }

    /**
     * Sets the value of the csfbCdma2KCellParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KCellParams }
     *     
     */
    public void setCsfbCdma2KCellParam(CsfbCdma2KCellParams value) {
        this.csfbCdma2KCellParam = value;
    }

    /**
     * Gets the value of the csfbCdma2KSib8Param property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KSib8Params }
     *     
     */
    public CsfbCdma2KSib8Params getCsfbCdma2KSib8Param() {
        return csfbCdma2KSib8Param;
    }

    /**
     * Sets the value of the csfbCdma2KSib8Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KSib8Params }
     *     
     */
    public void setCsfbCdma2KSib8Param(CsfbCdma2KSib8Params value) {
        this.csfbCdma2KSib8Param = value;
    }

    /**
     * Gets the value of the csfbCdma2KMobilityParam property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KMobilityParams }
     *     
     */
    public CsfbCdma2KMobilityParams getCsfbCdma2KMobilityParam() {
        return csfbCdma2KMobilityParam;
    }

    /**
     * Sets the value of the csfbCdma2KMobilityParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KMobilityParams }
     *     
     */
    public void setCsfbCdma2KMobilityParam(CsfbCdma2KMobilityParams value) {
        this.csfbCdma2KMobilityParam = value;
    }

    /**
     * Gets the value of the csfb2GRimParams property.
     * 
     * @return
     *     possible object is
     *     {@link Csfb2GRimParams }
     *     
     */
    public Csfb2GRimParams getCsfb2GRimParams() {
        return csfb2GRimParams;
    }

    /**
     * Sets the value of the csfb2GRimParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Csfb2GRimParams }
     *     
     */
    public void setCsfb2GRimParams(Csfb2GRimParams value) {
        this.csfb2GRimParams = value;
    }

    /**
     * Gets the value of the csgMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CsgModes }{@code >}
     *     
     */
    public JAXBElement<CsgModes> getCsgMode() {
        return csgMode;
    }

    /**
     * Sets the value of the csgMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CsgModes }{@code >}
     *     
     */
    public void setCsgMode(JAXBElement<CsgModes> value) {
        this.csgMode = value;
    }

    /**
     * Gets the value of the csgId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsgId() {
        return csgId;
    }

    /**
     * Sets the value of the csgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsgId(JAXBElement<Integer> value) {
        this.csgId = value;
    }

}
