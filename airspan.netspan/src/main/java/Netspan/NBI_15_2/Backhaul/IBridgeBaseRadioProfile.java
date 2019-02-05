
package Netspan.NBI_15_2.Backhaul;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridgeBaseRadioProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridgeBaseRadioProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesIbBase" minOccurs="0"/&gt;
 *         &lt;element name="Frequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AntennaMode" type="{http://Airspan.Netspan.WebServices}SteerableAntennaTxModes" minOccurs="0"/&gt;
 *         &lt;element name="AntennaGain" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BsEirpTotalCombined" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RxTargetRssi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RfGain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialRangingRxLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FloodUnknownTraffic" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="Ft2FtLocalSwitching" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="BroadcastServiceClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FbNullingMode" type="{http://Airspan.Netspan.WebServices}RxNullingModes" minOccurs="0"/&gt;
 *         &lt;element name="FtNullingMode" type="{http://Airspan.Netspan.WebServices}RxNullingModes" minOccurs="0"/&gt;
 *         &lt;element name="AutoAlignMode" type="{http://Airspan.Netspan.WebServices}AutoAlignOptions" minOccurs="0"/&gt;
 *         &lt;element name="Bandwidth" type="{http://Airspan.Netspan.WebServices}IbBaseRadioBandwidthValues" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulMode" type="{http://Airspan.Netspan.WebServices}BackhaulModes" minOccurs="0"/&gt;
 *         &lt;element name="Range" type="{http://Airspan.Netspan.WebServices}RangeModes" minOccurs="0"/&gt;
 *         &lt;element name="UplinkPermutation" type="{http://Airspan.Netspan.WebServices}UlPermutationTypes" minOccurs="0"/&gt;
 *         &lt;element name="TddSplit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxSisoZoneSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkMimoMatrix" type="{http://Airspan.Netspan.WebServices}IBridgeDlMimoModes" minOccurs="0"/&gt;
 *         &lt;element name="UplinkMimo" type="{http://Airspan.Netspan.WebServices}IBridgeUlMimoModes" minOccurs="0"/&gt;
 *         &lt;element name="FrameMode" type="{http://Airspan.Netspan.WebServices}IBridgeFrameModes" minOccurs="0"/&gt;
 *         &lt;element name="Subchannels" type="{http://Airspan.Netspan.WebServices}Ib4x0PuscGroups" minOccurs="0"/&gt;
 *         &lt;element name="CarrierSense" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="BackoffFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CarrierSenseThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecurityMode" type="{http://Airspan.Netspan.WebServices}SecurityModes" minOccurs="0"/&gt;
 *         &lt;element name="UplinkAdaptationEfficiencyMode" type="{http://Airspan.Netspan.WebServices}UlAdaptationEfficiencyModes" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkTraffic" type="{http://Airspan.Netspan.WebServices}OfdmaFecCodeTypesIbridgeRadioDownlink" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkBroadcastMcs" type="{http://Airspan.Netspan.WebServices}OfdmaFecCodeTypesIbridgeRadioBroadcastDownlink" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkCinrMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkMatrixBThresholdPcinr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkMatrixBAdditionalCinrMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UplinkTraffic" type="{http://Airspan.Netspan.WebServices}OfdmaFecCodeTypesIbridgeRadioUplink" minOccurs="0"/&gt;
 *         &lt;element name="UplinkCinrMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UplinkMatrixBThresholdCinr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkQpsk12Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkQpsk12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkQpsk34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkQpsk34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink16Qam12Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink16Qam12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink16Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink16Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam23Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam56Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink64Qam56" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink256Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink256Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Downlink256Qam56Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Downlink256Qam56" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UplinkQpsk12Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UplinkQpsk12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UplinkQpsk34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UplinkQpsk34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink16Qam12Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink16Qam12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink16Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink16Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam23Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam23" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam56Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink64Qam56" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink256Qam34Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink256Qam34" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Uplink256Qam56Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Uplink256Qam56" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridgeBaseRadioProfile", propOrder = {
    "name",
    "hardwareCategory",
    "frequency",
    "antennaMode",
    "antennaGain",
    "txPower",
    "bsEirpTotalCombined",
    "rxTargetRssi",
    "rfGain",
    "initialRangingRxLevel",
    "floodUnknownTraffic",
    "ft2FtLocalSwitching",
    "broadcastServiceClassName",
    "fbNullingMode",
    "ftNullingMode",
    "autoAlignMode",
    "bandwidth",
    "backhaulMode",
    "range",
    "uplinkPermutation",
    "tddSplit",
    "maxSisoZoneSize",
    "downlinkMimoMatrix",
    "uplinkMimo",
    "frameMode",
    "subchannels",
    "carrierSense",
    "backoffFrames",
    "carrierSenseThreshold",
    "securityMode",
    "uplinkAdaptationEfficiencyMode",
    "downlinkTraffic",
    "downlinkBroadcastMcs",
    "downlinkCinrMargin",
    "downlinkMatrixBThresholdPcinr",
    "downlinkMatrixBAdditionalCinrMargin",
    "uplinkTraffic",
    "uplinkCinrMargin",
    "uplinkMatrixBThresholdCinr",
    "downlinkQpsk12Enabled",
    "downlinkQpsk12",
    "downlinkQpsk34Enabled",
    "downlinkQpsk34",
    "downlink16Qam12Enabled",
    "downlink16Qam12",
    "downlink16Qam34Enabled",
    "downlink16Qam34",
    "downlink64Qam23Enabled",
    "downlink64Qam23",
    "downlink64Qam34Enabled",
    "downlink64Qam34",
    "downlink64Qam56Enabled",
    "downlink64Qam56",
    "downlink256Qam34Enabled",
    "downlink256Qam34",
    "downlink256Qam56Enabled",
    "downlink256Qam56",
    "uplinkQpsk12Enabled",
    "uplinkQpsk12",
    "uplinkQpsk34Enabled",
    "uplinkQpsk34",
    "uplink16Qam12Enabled",
    "uplink16Qam12",
    "uplink16Qam34Enabled",
    "uplink16Qam34",
    "uplink64Qam23Enabled",
    "uplink64Qam23",
    "uplink64Qam34Enabled",
    "uplink64Qam34",
    "uplink64Qam56Enabled",
    "uplink64Qam56",
    "uplink256Qam34Enabled",
    "uplink256Qam34",
    "uplink256Qam56Enabled",
    "uplink256Qam56"
})
public class IBridgeBaseRadioProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesIbBase> hardwareCategory;
    @XmlElementRef(name = "Frequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> frequency;
    @XmlElementRef(name = "AntennaMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> antennaMode;
    @XmlElementRef(name = "AntennaGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> antennaGain;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> txPower;
    @XmlElementRef(name = "BsEirpTotalCombined", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bsEirpTotalCombined;
    @XmlElementRef(name = "RxTargetRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxTargetRssi;
    @XmlElementRef(name = "RfGain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rfGain;
    @XmlElementRef(name = "InitialRangingRxLevel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialRangingRxLevel;
    @XmlElementRef(name = "FloodUnknownTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> floodUnknownTraffic;
    @XmlElementRef(name = "Ft2FtLocalSwitching", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> ft2FtLocalSwitching;
    @XmlElement(name = "BroadcastServiceClassName")
    protected String broadcastServiceClassName;
    @XmlElementRef(name = "FbNullingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RxNullingModes> fbNullingMode;
    @XmlElementRef(name = "FtNullingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RxNullingModes> ftNullingMode;
    @XmlElementRef(name = "AutoAlignMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoAlignOptions> autoAlignMode;
    @XmlElementRef(name = "Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bandwidth;
    @XmlElementRef(name = "BackhaulMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BackhaulModes> backhaulMode;
    @XmlElementRef(name = "Range", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RangeModes> range;
    @XmlElementRef(name = "UplinkPermutation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UlPermutationTypes> uplinkPermutation;
    @XmlElementRef(name = "TddSplit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tddSplit;
    @XmlElementRef(name = "MaxSisoZoneSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxSisoZoneSize;
    @XmlElementRef(name = "DownlinkMimoMatrix", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridgeDlMimoModes> downlinkMimoMatrix;
    @XmlElementRef(name = "UplinkMimo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridgeUlMimoModes> uplinkMimo;
    @XmlElementRef(name = "FrameMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<IBridgeFrameModes> frameMode;
    @XmlElementRef(name = "Subchannels", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Ib4X0PuscGroups> subchannels;
    @XmlElementRef(name = "CarrierSense", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> carrierSense;
    @XmlElementRef(name = "BackoffFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> backoffFrames;
    @XmlElementRef(name = "CarrierSenseThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> carrierSenseThreshold;
    @XmlElementRef(name = "SecurityMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityModes> securityMode;
    @XmlElementRef(name = "UplinkAdaptationEfficiencyMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<UlAdaptationEfficiencyModes> uplinkAdaptationEfficiencyMode;
    @XmlElementRef(name = "DownlinkTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downlinkTraffic;
    @XmlElementRef(name = "DownlinkBroadcastMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downlinkBroadcastMcs;
    @XmlElementRef(name = "DownlinkCinrMargin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlinkCinrMargin;
    @XmlElementRef(name = "DownlinkMatrixBThresholdPcinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlinkMatrixBThresholdPcinr;
    @XmlElementRef(name = "DownlinkMatrixBAdditionalCinrMargin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlinkMatrixBAdditionalCinrMargin;
    @XmlElementRef(name = "UplinkTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uplinkTraffic;
    @XmlElementRef(name = "UplinkCinrMargin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplinkCinrMargin;
    @XmlElementRef(name = "UplinkMatrixBThresholdCinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplinkMatrixBThresholdCinr;
    @XmlElementRef(name = "DownlinkQpsk12Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlinkQpsk12Enabled;
    @XmlElementRef(name = "DownlinkQpsk12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlinkQpsk12;
    @XmlElementRef(name = "DownlinkQpsk34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlinkQpsk34Enabled;
    @XmlElementRef(name = "DownlinkQpsk34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlinkQpsk34;
    @XmlElementRef(name = "Downlink16Qam12Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink16Qam12Enabled;
    @XmlElementRef(name = "Downlink16Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink16Qam12;
    @XmlElementRef(name = "Downlink16Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink16Qam34Enabled;
    @XmlElementRef(name = "Downlink16Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink16Qam34;
    @XmlElementRef(name = "Downlink64Qam23Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink64Qam23Enabled;
    @XmlElementRef(name = "Downlink64Qam23", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink64Qam23;
    @XmlElementRef(name = "Downlink64Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink64Qam34Enabled;
    @XmlElementRef(name = "Downlink64Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink64Qam34;
    @XmlElementRef(name = "Downlink64Qam56Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink64Qam56Enabled;
    @XmlElementRef(name = "Downlink64Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink64Qam56;
    @XmlElementRef(name = "Downlink256Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink256Qam34Enabled;
    @XmlElementRef(name = "Downlink256Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink256Qam34;
    @XmlElementRef(name = "Downlink256Qam56Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> downlink256Qam56Enabled;
    @XmlElementRef(name = "Downlink256Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> downlink256Qam56;
    @XmlElementRef(name = "UplinkQpsk12Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplinkQpsk12Enabled;
    @XmlElementRef(name = "UplinkQpsk12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplinkQpsk12;
    @XmlElementRef(name = "UplinkQpsk34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplinkQpsk34Enabled;
    @XmlElementRef(name = "UplinkQpsk34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplinkQpsk34;
    @XmlElementRef(name = "Uplink16Qam12Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink16Qam12Enabled;
    @XmlElementRef(name = "Uplink16Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink16Qam12;
    @XmlElementRef(name = "Uplink16Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink16Qam34Enabled;
    @XmlElementRef(name = "Uplink16Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink16Qam34;
    @XmlElementRef(name = "Uplink64Qam23Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink64Qam23Enabled;
    @XmlElementRef(name = "Uplink64Qam23", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink64Qam23;
    @XmlElementRef(name = "Uplink64Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink64Qam34Enabled;
    @XmlElementRef(name = "Uplink64Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink64Qam34;
    @XmlElementRef(name = "Uplink64Qam56Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink64Qam56Enabled;
    @XmlElementRef(name = "Uplink64Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink64Qam56;
    @XmlElementRef(name = "Uplink256Qam34Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink256Qam34Enabled;
    @XmlElementRef(name = "Uplink256Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink256Qam34;
    @XmlElementRef(name = "Uplink256Qam56Enabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> uplink256Qam56Enabled;
    @XmlElementRef(name = "Uplink256Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> uplink256Qam56;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}
     *     
     */
    public JAXBElement<CategoriesIbBase> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesIbBase }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesIbBase> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFrequency(JAXBElement<Integer> value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the antennaMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAntennaMode() {
        return antennaMode;
    }

    /**
     * Sets the value of the antennaMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAntennaMode(JAXBElement<String> value) {
        this.antennaMode = value;
    }

    /**
     * Gets the value of the antennaGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAntennaGain() {
        return antennaGain;
    }

    /**
     * Sets the value of the antennaGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAntennaGain(JAXBElement<BigDecimal> value) {
        this.antennaGain = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTxPower(JAXBElement<BigDecimal> value) {
        this.txPower = value;
    }

    /**
     * Gets the value of the bsEirpTotalCombined property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBsEirpTotalCombined() {
        return bsEirpTotalCombined;
    }

    /**
     * Sets the value of the bsEirpTotalCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBsEirpTotalCombined(JAXBElement<Integer> value) {
        this.bsEirpTotalCombined = value;
    }

    /**
     * Gets the value of the rxTargetRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxTargetRssi() {
        return rxTargetRssi;
    }

    /**
     * Sets the value of the rxTargetRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxTargetRssi(JAXBElement<Integer> value) {
        this.rxTargetRssi = value;
    }

    /**
     * Gets the value of the rfGain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRfGain() {
        return rfGain;
    }

    /**
     * Sets the value of the rfGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRfGain(JAXBElement<Integer> value) {
        this.rfGain = value;
    }

    /**
     * Gets the value of the initialRangingRxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialRangingRxLevel() {
        return initialRangingRxLevel;
    }

    /**
     * Sets the value of the initialRangingRxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialRangingRxLevel(JAXBElement<Integer> value) {
        this.initialRangingRxLevel = value;
    }

    /**
     * Gets the value of the floodUnknownTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getFloodUnknownTraffic() {
        return floodUnknownTraffic;
    }

    /**
     * Sets the value of the floodUnknownTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setFloodUnknownTraffic(JAXBElement<EnabledDisabledValues> value) {
        this.floodUnknownTraffic = value;
    }

    /**
     * Gets the value of the ft2FtLocalSwitching property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getFt2FtLocalSwitching() {
        return ft2FtLocalSwitching;
    }

    /**
     * Sets the value of the ft2FtLocalSwitching property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setFt2FtLocalSwitching(JAXBElement<EnabledDisabledValues> value) {
        this.ft2FtLocalSwitching = value;
    }

    /**
     * Gets the value of the broadcastServiceClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadcastServiceClassName() {
        return broadcastServiceClassName;
    }

    /**
     * Sets the value of the broadcastServiceClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadcastServiceClassName(String value) {
        this.broadcastServiceClassName = value;
    }

    /**
     * Gets the value of the fbNullingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}
     *     
     */
    public JAXBElement<RxNullingModes> getFbNullingMode() {
        return fbNullingMode;
    }

    /**
     * Sets the value of the fbNullingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}
     *     
     */
    public void setFbNullingMode(JAXBElement<RxNullingModes> value) {
        this.fbNullingMode = value;
    }

    /**
     * Gets the value of the ftNullingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}
     *     
     */
    public JAXBElement<RxNullingModes> getFtNullingMode() {
        return ftNullingMode;
    }

    /**
     * Sets the value of the ftNullingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RxNullingModes }{@code >}
     *     
     */
    public void setFtNullingMode(JAXBElement<RxNullingModes> value) {
        this.ftNullingMode = value;
    }

    /**
     * Gets the value of the autoAlignMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignOptions }{@code >}
     *     
     */
    public JAXBElement<AutoAlignOptions> getAutoAlignMode() {
        return autoAlignMode;
    }

    /**
     * Sets the value of the autoAlignMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoAlignOptions }{@code >}
     *     
     */
    public void setAutoAlignMode(JAXBElement<AutoAlignOptions> value) {
        this.autoAlignMode = value;
    }

    /**
     * Gets the value of the bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBandwidth() {
        return bandwidth;
    }

    /**
     * Sets the value of the bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBandwidth(JAXBElement<String> value) {
        this.bandwidth = value;
    }

    /**
     * Gets the value of the backhaulMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackhaulModes }{@code >}
     *     
     */
    public JAXBElement<BackhaulModes> getBackhaulMode() {
        return backhaulMode;
    }

    /**
     * Sets the value of the backhaulMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackhaulModes }{@code >}
     *     
     */
    public void setBackhaulMode(JAXBElement<BackhaulModes> value) {
        this.backhaulMode = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RangeModes }{@code >}
     *     
     */
    public JAXBElement<RangeModes> getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RangeModes }{@code >}
     *     
     */
    public void setRange(JAXBElement<RangeModes> value) {
        this.range = value;
    }

    /**
     * Gets the value of the uplinkPermutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UlPermutationTypes }{@code >}
     *     
     */
    public JAXBElement<UlPermutationTypes> getUplinkPermutation() {
        return uplinkPermutation;
    }

    /**
     * Sets the value of the uplinkPermutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UlPermutationTypes }{@code >}
     *     
     */
    public void setUplinkPermutation(JAXBElement<UlPermutationTypes> value) {
        this.uplinkPermutation = value;
    }

    /**
     * Gets the value of the tddSplit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTddSplit() {
        return tddSplit;
    }

    /**
     * Sets the value of the tddSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTddSplit(JAXBElement<Integer> value) {
        this.tddSplit = value;
    }

    /**
     * Gets the value of the maxSisoZoneSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxSisoZoneSize() {
        return maxSisoZoneSize;
    }

    /**
     * Sets the value of the maxSisoZoneSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxSisoZoneSize(JAXBElement<Integer> value) {
        this.maxSisoZoneSize = value;
    }

    /**
     * Gets the value of the downlinkMimoMatrix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridgeDlMimoModes }{@code >}
     *     
     */
    public JAXBElement<IBridgeDlMimoModes> getDownlinkMimoMatrix() {
        return downlinkMimoMatrix;
    }

    /**
     * Sets the value of the downlinkMimoMatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridgeDlMimoModes }{@code >}
     *     
     */
    public void setDownlinkMimoMatrix(JAXBElement<IBridgeDlMimoModes> value) {
        this.downlinkMimoMatrix = value;
    }

    /**
     * Gets the value of the uplinkMimo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridgeUlMimoModes }{@code >}
     *     
     */
    public JAXBElement<IBridgeUlMimoModes> getUplinkMimo() {
        return uplinkMimo;
    }

    /**
     * Sets the value of the uplinkMimo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridgeUlMimoModes }{@code >}
     *     
     */
    public void setUplinkMimo(JAXBElement<IBridgeUlMimoModes> value) {
        this.uplinkMimo = value;
    }

    /**
     * Gets the value of the frameMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IBridgeFrameModes }{@code >}
     *     
     */
    public JAXBElement<IBridgeFrameModes> getFrameMode() {
        return frameMode;
    }

    /**
     * Sets the value of the frameMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IBridgeFrameModes }{@code >}
     *     
     */
    public void setFrameMode(JAXBElement<IBridgeFrameModes> value) {
        this.frameMode = value;
    }

    /**
     * Gets the value of the subchannels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Ib4X0PuscGroups }{@code >}
     *     
     */
    public JAXBElement<Ib4X0PuscGroups> getSubchannels() {
        return subchannels;
    }

    /**
     * Sets the value of the subchannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Ib4X0PuscGroups }{@code >}
     *     
     */
    public void setSubchannels(JAXBElement<Ib4X0PuscGroups> value) {
        this.subchannels = value;
    }

    /**
     * Gets the value of the carrierSense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getCarrierSense() {
        return carrierSense;
    }

    /**
     * Sets the value of the carrierSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setCarrierSense(JAXBElement<EnabledDisabledValues> value) {
        this.carrierSense = value;
    }

    /**
     * Gets the value of the backoffFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBackoffFrames() {
        return backoffFrames;
    }

    /**
     * Sets the value of the backoffFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBackoffFrames(JAXBElement<Integer> value) {
        this.backoffFrames = value;
    }

    /**
     * Gets the value of the carrierSenseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCarrierSenseThreshold() {
        return carrierSenseThreshold;
    }

    /**
     * Sets the value of the carrierSenseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCarrierSenseThreshold(JAXBElement<Integer> value) {
        this.carrierSenseThreshold = value;
    }

    /**
     * Gets the value of the securityMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityModes }{@code >}
     *     
     */
    public JAXBElement<SecurityModes> getSecurityMode() {
        return securityMode;
    }

    /**
     * Sets the value of the securityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityModes }{@code >}
     *     
     */
    public void setSecurityMode(JAXBElement<SecurityModes> value) {
        this.securityMode = value;
    }

    /**
     * Gets the value of the uplinkAdaptationEfficiencyMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UlAdaptationEfficiencyModes }{@code >}
     *     
     */
    public JAXBElement<UlAdaptationEfficiencyModes> getUplinkAdaptationEfficiencyMode() {
        return uplinkAdaptationEfficiencyMode;
    }

    /**
     * Sets the value of the uplinkAdaptationEfficiencyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UlAdaptationEfficiencyModes }{@code >}
     *     
     */
    public void setUplinkAdaptationEfficiencyMode(JAXBElement<UlAdaptationEfficiencyModes> value) {
        this.uplinkAdaptationEfficiencyMode = value;
    }

    /**
     * Gets the value of the downlinkTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownlinkTraffic() {
        return downlinkTraffic;
    }

    /**
     * Sets the value of the downlinkTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownlinkTraffic(JAXBElement<String> value) {
        this.downlinkTraffic = value;
    }

    /**
     * Gets the value of the downlinkBroadcastMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownlinkBroadcastMcs() {
        return downlinkBroadcastMcs;
    }

    /**
     * Sets the value of the downlinkBroadcastMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownlinkBroadcastMcs(JAXBElement<String> value) {
        this.downlinkBroadcastMcs = value;
    }

    /**
     * Gets the value of the downlinkCinrMargin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlinkCinrMargin() {
        return downlinkCinrMargin;
    }

    /**
     * Sets the value of the downlinkCinrMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlinkCinrMargin(JAXBElement<BigDecimal> value) {
        this.downlinkCinrMargin = value;
    }

    /**
     * Gets the value of the downlinkMatrixBThresholdPcinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlinkMatrixBThresholdPcinr() {
        return downlinkMatrixBThresholdPcinr;
    }

    /**
     * Sets the value of the downlinkMatrixBThresholdPcinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlinkMatrixBThresholdPcinr(JAXBElement<BigDecimal> value) {
        this.downlinkMatrixBThresholdPcinr = value;
    }

    /**
     * Gets the value of the downlinkMatrixBAdditionalCinrMargin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlinkMatrixBAdditionalCinrMargin() {
        return downlinkMatrixBAdditionalCinrMargin;
    }

    /**
     * Sets the value of the downlinkMatrixBAdditionalCinrMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlinkMatrixBAdditionalCinrMargin(JAXBElement<BigDecimal> value) {
        this.downlinkMatrixBAdditionalCinrMargin = value;
    }

    /**
     * Gets the value of the uplinkTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUplinkTraffic() {
        return uplinkTraffic;
    }

    /**
     * Sets the value of the uplinkTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUplinkTraffic(JAXBElement<String> value) {
        this.uplinkTraffic = value;
    }

    /**
     * Gets the value of the uplinkCinrMargin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplinkCinrMargin() {
        return uplinkCinrMargin;
    }

    /**
     * Sets the value of the uplinkCinrMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplinkCinrMargin(JAXBElement<BigDecimal> value) {
        this.uplinkCinrMargin = value;
    }

    /**
     * Gets the value of the uplinkMatrixBThresholdCinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplinkMatrixBThresholdCinr() {
        return uplinkMatrixBThresholdCinr;
    }

    /**
     * Sets the value of the uplinkMatrixBThresholdCinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplinkMatrixBThresholdCinr(JAXBElement<BigDecimal> value) {
        this.uplinkMatrixBThresholdCinr = value;
    }

    /**
     * Gets the value of the downlinkQpsk12Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlinkQpsk12Enabled() {
        return downlinkQpsk12Enabled;
    }

    /**
     * Sets the value of the downlinkQpsk12Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlinkQpsk12Enabled(JAXBElement<Boolean> value) {
        this.downlinkQpsk12Enabled = value;
    }

    /**
     * Gets the value of the downlinkQpsk12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlinkQpsk12() {
        return downlinkQpsk12;
    }

    /**
     * Sets the value of the downlinkQpsk12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlinkQpsk12(JAXBElement<BigDecimal> value) {
        this.downlinkQpsk12 = value;
    }

    /**
     * Gets the value of the downlinkQpsk34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlinkQpsk34Enabled() {
        return downlinkQpsk34Enabled;
    }

    /**
     * Sets the value of the downlinkQpsk34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlinkQpsk34Enabled(JAXBElement<Boolean> value) {
        this.downlinkQpsk34Enabled = value;
    }

    /**
     * Gets the value of the downlinkQpsk34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlinkQpsk34() {
        return downlinkQpsk34;
    }

    /**
     * Sets the value of the downlinkQpsk34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlinkQpsk34(JAXBElement<BigDecimal> value) {
        this.downlinkQpsk34 = value;
    }

    /**
     * Gets the value of the downlink16Qam12Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink16Qam12Enabled() {
        return downlink16Qam12Enabled;
    }

    /**
     * Sets the value of the downlink16Qam12Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink16Qam12Enabled(JAXBElement<Boolean> value) {
        this.downlink16Qam12Enabled = value;
    }

    /**
     * Gets the value of the downlink16Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink16Qam12() {
        return downlink16Qam12;
    }

    /**
     * Sets the value of the downlink16Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink16Qam12(JAXBElement<BigDecimal> value) {
        this.downlink16Qam12 = value;
    }

    /**
     * Gets the value of the downlink16Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink16Qam34Enabled() {
        return downlink16Qam34Enabled;
    }

    /**
     * Sets the value of the downlink16Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink16Qam34Enabled(JAXBElement<Boolean> value) {
        this.downlink16Qam34Enabled = value;
    }

    /**
     * Gets the value of the downlink16Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink16Qam34() {
        return downlink16Qam34;
    }

    /**
     * Sets the value of the downlink16Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink16Qam34(JAXBElement<BigDecimal> value) {
        this.downlink16Qam34 = value;
    }

    /**
     * Gets the value of the downlink64Qam23Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink64Qam23Enabled() {
        return downlink64Qam23Enabled;
    }

    /**
     * Sets the value of the downlink64Qam23Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink64Qam23Enabled(JAXBElement<Boolean> value) {
        this.downlink64Qam23Enabled = value;
    }

    /**
     * Gets the value of the downlink64Qam23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink64Qam23() {
        return downlink64Qam23;
    }

    /**
     * Sets the value of the downlink64Qam23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink64Qam23(JAXBElement<BigDecimal> value) {
        this.downlink64Qam23 = value;
    }

    /**
     * Gets the value of the downlink64Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink64Qam34Enabled() {
        return downlink64Qam34Enabled;
    }

    /**
     * Sets the value of the downlink64Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink64Qam34Enabled(JAXBElement<Boolean> value) {
        this.downlink64Qam34Enabled = value;
    }

    /**
     * Gets the value of the downlink64Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink64Qam34() {
        return downlink64Qam34;
    }

    /**
     * Sets the value of the downlink64Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink64Qam34(JAXBElement<BigDecimal> value) {
        this.downlink64Qam34 = value;
    }

    /**
     * Gets the value of the downlink64Qam56Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink64Qam56Enabled() {
        return downlink64Qam56Enabled;
    }

    /**
     * Sets the value of the downlink64Qam56Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink64Qam56Enabled(JAXBElement<Boolean> value) {
        this.downlink64Qam56Enabled = value;
    }

    /**
     * Gets the value of the downlink64Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink64Qam56() {
        return downlink64Qam56;
    }

    /**
     * Sets the value of the downlink64Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink64Qam56(JAXBElement<BigDecimal> value) {
        this.downlink64Qam56 = value;
    }

    /**
     * Gets the value of the downlink256Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink256Qam34Enabled() {
        return downlink256Qam34Enabled;
    }

    /**
     * Sets the value of the downlink256Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink256Qam34Enabled(JAXBElement<Boolean> value) {
        this.downlink256Qam34Enabled = value;
    }

    /**
     * Gets the value of the downlink256Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink256Qam34() {
        return downlink256Qam34;
    }

    /**
     * Sets the value of the downlink256Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink256Qam34(JAXBElement<BigDecimal> value) {
        this.downlink256Qam34 = value;
    }

    /**
     * Gets the value of the downlink256Qam56Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDownlink256Qam56Enabled() {
        return downlink256Qam56Enabled;
    }

    /**
     * Sets the value of the downlink256Qam56Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDownlink256Qam56Enabled(JAXBElement<Boolean> value) {
        this.downlink256Qam56Enabled = value;
    }

    /**
     * Gets the value of the downlink256Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDownlink256Qam56() {
        return downlink256Qam56;
    }

    /**
     * Sets the value of the downlink256Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDownlink256Qam56(JAXBElement<BigDecimal> value) {
        this.downlink256Qam56 = value;
    }

    /**
     * Gets the value of the uplinkQpsk12Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplinkQpsk12Enabled() {
        return uplinkQpsk12Enabled;
    }

    /**
     * Sets the value of the uplinkQpsk12Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplinkQpsk12Enabled(JAXBElement<Boolean> value) {
        this.uplinkQpsk12Enabled = value;
    }

    /**
     * Gets the value of the uplinkQpsk12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplinkQpsk12() {
        return uplinkQpsk12;
    }

    /**
     * Sets the value of the uplinkQpsk12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplinkQpsk12(JAXBElement<BigDecimal> value) {
        this.uplinkQpsk12 = value;
    }

    /**
     * Gets the value of the uplinkQpsk34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplinkQpsk34Enabled() {
        return uplinkQpsk34Enabled;
    }

    /**
     * Sets the value of the uplinkQpsk34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplinkQpsk34Enabled(JAXBElement<Boolean> value) {
        this.uplinkQpsk34Enabled = value;
    }

    /**
     * Gets the value of the uplinkQpsk34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplinkQpsk34() {
        return uplinkQpsk34;
    }

    /**
     * Sets the value of the uplinkQpsk34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplinkQpsk34(JAXBElement<BigDecimal> value) {
        this.uplinkQpsk34 = value;
    }

    /**
     * Gets the value of the uplink16Qam12Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink16Qam12Enabled() {
        return uplink16Qam12Enabled;
    }

    /**
     * Sets the value of the uplink16Qam12Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink16Qam12Enabled(JAXBElement<Boolean> value) {
        this.uplink16Qam12Enabled = value;
    }

    /**
     * Gets the value of the uplink16Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink16Qam12() {
        return uplink16Qam12;
    }

    /**
     * Sets the value of the uplink16Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink16Qam12(JAXBElement<BigDecimal> value) {
        this.uplink16Qam12 = value;
    }

    /**
     * Gets the value of the uplink16Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink16Qam34Enabled() {
        return uplink16Qam34Enabled;
    }

    /**
     * Sets the value of the uplink16Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink16Qam34Enabled(JAXBElement<Boolean> value) {
        this.uplink16Qam34Enabled = value;
    }

    /**
     * Gets the value of the uplink16Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink16Qam34() {
        return uplink16Qam34;
    }

    /**
     * Sets the value of the uplink16Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink16Qam34(JAXBElement<BigDecimal> value) {
        this.uplink16Qam34 = value;
    }

    /**
     * Gets the value of the uplink64Qam23Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink64Qam23Enabled() {
        return uplink64Qam23Enabled;
    }

    /**
     * Sets the value of the uplink64Qam23Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink64Qam23Enabled(JAXBElement<Boolean> value) {
        this.uplink64Qam23Enabled = value;
    }

    /**
     * Gets the value of the uplink64Qam23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink64Qam23() {
        return uplink64Qam23;
    }

    /**
     * Sets the value of the uplink64Qam23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink64Qam23(JAXBElement<BigDecimal> value) {
        this.uplink64Qam23 = value;
    }

    /**
     * Gets the value of the uplink64Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink64Qam34Enabled() {
        return uplink64Qam34Enabled;
    }

    /**
     * Sets the value of the uplink64Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink64Qam34Enabled(JAXBElement<Boolean> value) {
        this.uplink64Qam34Enabled = value;
    }

    /**
     * Gets the value of the uplink64Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink64Qam34() {
        return uplink64Qam34;
    }

    /**
     * Sets the value of the uplink64Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink64Qam34(JAXBElement<BigDecimal> value) {
        this.uplink64Qam34 = value;
    }

    /**
     * Gets the value of the uplink64Qam56Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink64Qam56Enabled() {
        return uplink64Qam56Enabled;
    }

    /**
     * Sets the value of the uplink64Qam56Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink64Qam56Enabled(JAXBElement<Boolean> value) {
        this.uplink64Qam56Enabled = value;
    }

    /**
     * Gets the value of the uplink64Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink64Qam56() {
        return uplink64Qam56;
    }

    /**
     * Sets the value of the uplink64Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink64Qam56(JAXBElement<BigDecimal> value) {
        this.uplink64Qam56 = value;
    }

    /**
     * Gets the value of the uplink256Qam34Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink256Qam34Enabled() {
        return uplink256Qam34Enabled;
    }

    /**
     * Sets the value of the uplink256Qam34Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink256Qam34Enabled(JAXBElement<Boolean> value) {
        this.uplink256Qam34Enabled = value;
    }

    /**
     * Gets the value of the uplink256Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink256Qam34() {
        return uplink256Qam34;
    }

    /**
     * Sets the value of the uplink256Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink256Qam34(JAXBElement<BigDecimal> value) {
        this.uplink256Qam34 = value;
    }

    /**
     * Gets the value of the uplink256Qam56Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUplink256Qam56Enabled() {
        return uplink256Qam56Enabled;
    }

    /**
     * Sets the value of the uplink256Qam56Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUplink256Qam56Enabled(JAXBElement<Boolean> value) {
        this.uplink256Qam56Enabled = value;
    }

    /**
     * Gets the value of the uplink256Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUplink256Qam56() {
        return uplink256Qam56;
    }

    /**
     * Sets the value of the uplink256Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUplink256Qam56(JAXBElement<BigDecimal> value) {
        this.uplink256Qam56 = value;
    }

}
