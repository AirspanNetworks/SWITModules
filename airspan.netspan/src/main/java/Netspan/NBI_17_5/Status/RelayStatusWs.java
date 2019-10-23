
package Netspan.NBI_17_5.Status;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelayStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Eci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Band" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LteBandwidth" type="{http://Airspan.Netspan.WebServices}BandwidthValues" minOccurs="0"/&gt;
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DenbTxMode" type="{http://Airspan.Netspan.WebServices}DenbTxModes" minOccurs="0"/&gt;
 *         &lt;element name="RelayState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupportedBands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsedBands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P1CdclUsedStatus" type="{http://Airspan.Netspan.WebServices}P1CdclUsed" minOccurs="0"/&gt;
 *         &lt;element name="P1CdclStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="P1PdclUsedStatus" type="{http://Airspan.Netspan.WebServices}P1PdclUsed" minOccurs="0"/&gt;
 *         &lt;element name="P1PdclStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScanStart" type="{http://Airspan.Netspan.WebServices}ScanStartStatus" minOccurs="0"/&gt;
 *         &lt;element name="ScanStartInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastScanStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsEnbConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LogicalAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HeadingAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rsrq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rsrp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rssi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sinr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RadioTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DonorEnbQuality" type="{http://Airspan.Netspan.WebServices}DonorEnbQuality" minOccurs="0"/&gt;
 *         &lt;element name="DonorEnbQualityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RankIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpectralEfficiency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Drm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RsrpDom" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Pci1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rsrp1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rsrq1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Pci2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rsrp2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rsrq2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Pci3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Rsrp3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rsrq3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TimingAdvance" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="MimoRank" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DlPdcpThroughput" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UlPdcpThroughput" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AntennaCorrelation" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="SccAntennaCorrelation" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UeDlModulationCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UeDlCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UeUlModulationCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UeUlCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DonorEndcIndication" type="{http://Airspan.Netspan.WebServices}DonorEndcStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="APNs" type="{http://Airspan.Netspan.WebServices}RelayApnList" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedDevices" type="{http://Airspan.Netspan.WebServices}RelayConnectedDevicesList" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulType" type="{http://Airspan.Netspan.WebServices}BackhaulTypeWs" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiApSsid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiApSecurity" type="{http://Airspan.Netspan.WebServices}BackhaulWiFiApSecurityTypeWs" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiActiveChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiRssi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiActiveBand" type="{http://Airspan.Netspan.WebServices}BackhaulWiFiBandTypeWs" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiApMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiIpMode" type="{http://Airspan.Netspan.WebServices}BackhaulWiFiIpModeWs" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiGatewayIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulWifiSubnetMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulwifiPublicIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarrierAggregations" type="{http://Airspan.Netspan.WebServices}CarrierAggregationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayStatusWs", propOrder = {
    "mcc",
    "mnc",
    "eci",
    "earfcn",
    "band",
    "pci",
    "lteBandwidth",
    "tac",
    "denbTxMode",
    "relayState",
    "imsi",
    "imei",
    "supportedBands",
    "usedBands",
    "p1CdclUsedStatus",
    "p1CdclStatusInfo",
    "p1PdclUsedStatus",
    "p1PdclStatusInfo",
    "scanStart",
    "scanStartInfo",
    "lastScanStartTime",
    "isEnbConnected",
    "logicalAngle",
    "headingAngle",
    "rsrq",
    "rsrp",
    "rssi",
    "sinr",
    "radioTxPower",
    "donorEnbQuality",
    "donorEnbQualityInfo",
    "rankIndicator",
    "spectralEfficiency",
    "drm",
    "rsrpDom",
    "pci1",
    "rsrp1",
    "rsrq1",
    "pci2",
    "rsrp2",
    "rsrq2",
    "pci3",
    "rsrp3",
    "rsrq3",
    "timingAdvance",
    "mimoRank",
    "dlPdcpThroughput",
    "ulPdcpThroughput",
    "antennaCorrelation",
    "sccAntennaCorrelation",
    "ueDlModulationCapability",
    "ueDlCategory",
    "ueUlModulationCapability",
    "ueUlCategory",
    "donorEndcIndication",
    "apNs",
    "connectedDevices",
    "backhaulType",
    "backhaulWifiApSsid",
    "backhaulWifiApSecurity",
    "backhaulWifiActiveChannel",
    "backhaulWifiRssi",
    "backhaulWifiActiveBand",
    "backhaulWifiApMacAddress",
    "backhaulWifiIpMode",
    "backhaulWifiGatewayIpAddress",
    "backhaulWifiSubnetMask",
    "backhaulwifiPublicIpAddress",
    "carrierAggregations"
})
public class RelayStatusWs {

    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElementRef(name = "Eci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> eci;
    @XmlElementRef(name = "Earfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> earfcn;
    @XmlElement(name = "Band")
    protected String band;
    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElementRef(name = "LteBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lteBandwidth;
    @XmlElementRef(name = "Tac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tac;
    @XmlElementRef(name = "DenbTxMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DenbTxModes> denbTxMode;
    @XmlElement(name = "RelayState")
    protected String relayState;
    @XmlElement(name = "Imsi")
    protected String imsi;
    @XmlElement(name = "Imei")
    protected String imei;
    @XmlElement(name = "SupportedBands")
    protected String supportedBands;
    @XmlElement(name = "UsedBands")
    protected String usedBands;
    @XmlElementRef(name = "P1CdclUsedStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<P1CdclUsed> p1CdclUsedStatus;
    @XmlElement(name = "P1CdclStatusInfo")
    protected String p1CdclStatusInfo;
    @XmlElementRef(name = "P1PdclUsedStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<P1PdclUsed> p1PdclUsedStatus;
    @XmlElement(name = "P1PdclStatusInfo")
    protected String p1PdclStatusInfo;
    @XmlElementRef(name = "ScanStart", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ScanStartStatus> scanStart;
    @XmlElement(name = "ScanStartInfo")
    protected String scanStartInfo;
    @XmlElementRef(name = "LastScanStartTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastScanStartTime;
    @XmlElementRef(name = "IsEnbConnected", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnbConnected;
    @XmlElementRef(name = "LogicalAngle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> logicalAngle;
    @XmlElementRef(name = "HeadingAngle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> headingAngle;
    @XmlElementRef(name = "Rsrq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrq;
    @XmlElementRef(name = "Rsrp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrp;
    @XmlElementRef(name = "Rssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rssi;
    @XmlElementRef(name = "Sinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> sinr;
    @XmlElementRef(name = "RadioTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTxPower;
    @XmlElementRef(name = "DonorEnbQuality", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DonorEnbQuality> donorEnbQuality;
    @XmlElement(name = "DonorEnbQualityInfo")
    protected String donorEnbQualityInfo;
    @XmlElementRef(name = "RankIndicator", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rankIndicator;
    @XmlElementRef(name = "SpectralEfficiency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spectralEfficiency;
    @XmlElementRef(name = "Drm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> drm;
    @XmlElementRef(name = "RsrpDom", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrpDom;
    @XmlElementRef(name = "Pci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci1;
    @XmlElementRef(name = "Rsrp1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp1;
    @XmlElementRef(name = "Rsrq1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq1;
    @XmlElementRef(name = "Pci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci2;
    @XmlElementRef(name = "Rsrp2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp2;
    @XmlElementRef(name = "Rsrq2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq2;
    @XmlElementRef(name = "Pci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci3;
    @XmlElementRef(name = "Rsrp3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp3;
    @XmlElementRef(name = "Rsrq3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq3;
    @XmlElementRef(name = "TimingAdvance", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> timingAdvance;
    @XmlElementRef(name = "MimoRank", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> mimoRank;
    @XmlElementRef(name = "DlPdcpThroughput", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlPdcpThroughput;
    @XmlElementRef(name = "UlPdcpThroughput", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulPdcpThroughput;
    @XmlElementRef(name = "AntennaCorrelation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> antennaCorrelation;
    @XmlElementRef(name = "SccAntennaCorrelation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> sccAntennaCorrelation;
    @XmlElement(name = "UeDlModulationCapability")
    protected String ueDlModulationCapability;
    @XmlElement(name = "UeDlCategory")
    protected String ueDlCategory;
    @XmlElement(name = "UeUlModulationCapability")
    protected String ueUlModulationCapability;
    @XmlElement(name = "UeUlCategory")
    protected String ueUlCategory;
    @XmlElementRef(name = "DonorEndcIndication", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> donorEndcIndication;
    @XmlElement(name = "APNs")
    protected RelayApnList apNs;
    @XmlElement(name = "ConnectedDevices")
    protected RelayConnectedDevicesList connectedDevices;
    @XmlElementRef(name = "BackhaulType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BackhaulTypeWs> backhaulType;
    @XmlElement(name = "BackhaulWifiApSsid")
    protected String backhaulWifiApSsid;
    @XmlElementRef(name = "BackhaulWifiApSecurity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BackhaulWiFiApSecurityTypeWs> backhaulWifiApSecurity;
    @XmlElementRef(name = "BackhaulWifiActiveChannel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> backhaulWifiActiveChannel;
    @XmlElementRef(name = "BackhaulWifiRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> backhaulWifiRssi;
    @XmlElementRef(name = "BackhaulWifiActiveBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backhaulWifiActiveBand;
    @XmlElement(name = "BackhaulWifiApMacAddress")
    protected String backhaulWifiApMacAddress;
    @XmlElementRef(name = "BackhaulWifiIpMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BackhaulWiFiIpModeWs> backhaulWifiIpMode;
    @XmlElement(name = "BackhaulWifiGatewayIpAddress")
    protected String backhaulWifiGatewayIpAddress;
    @XmlElement(name = "BackhaulWifiSubnetMask")
    protected String backhaulWifiSubnetMask;
    @XmlElement(name = "BackhaulwifiPublicIpAddress")
    protected String backhaulwifiPublicIpAddress;
    @XmlElement(name = "CarrierAggregations")
    protected CarrierAggregationList carrierAggregations;

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnc() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnc(String value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEci(JAXBElement<Integer> value) {
        this.eci = value;
    }

    /**
     * Gets the value of the earfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEarfcn() {
        return earfcn;
    }

    /**
     * Sets the value of the earfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEarfcn(JAXBElement<Integer> value) {
        this.earfcn = value;
    }

    /**
     * Gets the value of the band property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBand() {
        return band;
    }

    /**
     * Sets the value of the band property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBand(String value) {
        this.band = value;
    }

    /**
     * Gets the value of the pci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci() {
        return pci;
    }

    /**
     * Sets the value of the pci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci(JAXBElement<Integer> value) {
        this.pci = value;
    }

    /**
     * Gets the value of the lteBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLteBandwidth() {
        return lteBandwidth;
    }

    /**
     * Sets the value of the lteBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLteBandwidth(JAXBElement<String> value) {
        this.lteBandwidth = value;
    }

    /**
     * Gets the value of the tac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTac() {
        return tac;
    }

    /**
     * Sets the value of the tac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTac(JAXBElement<Integer> value) {
        this.tac = value;
    }

    /**
     * Gets the value of the denbTxMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DenbTxModes }{@code >}
     *     
     */
    public JAXBElement<DenbTxModes> getDenbTxMode() {
        return denbTxMode;
    }

    /**
     * Sets the value of the denbTxMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DenbTxModes }{@code >}
     *     
     */
    public void setDenbTxMode(JAXBElement<DenbTxModes> value) {
        this.denbTxMode = value;
    }

    /**
     * Gets the value of the relayState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayState() {
        return relayState;
    }

    /**
     * Sets the value of the relayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayState(String value) {
        this.relayState = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the supportedBands property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedBands() {
        return supportedBands;
    }

    /**
     * Sets the value of the supportedBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedBands(String value) {
        this.supportedBands = value;
    }

    /**
     * Gets the value of the usedBands property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedBands() {
        return usedBands;
    }

    /**
     * Sets the value of the usedBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedBands(String value) {
        this.usedBands = value;
    }

    /**
     * Gets the value of the p1CdclUsedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link P1CdclUsed }{@code >}
     *     
     */
    public JAXBElement<P1CdclUsed> getP1CdclUsedStatus() {
        return p1CdclUsedStatus;
    }

    /**
     * Sets the value of the p1CdclUsedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link P1CdclUsed }{@code >}
     *     
     */
    public void setP1CdclUsedStatus(JAXBElement<P1CdclUsed> value) {
        this.p1CdclUsedStatus = value;
    }

    /**
     * Gets the value of the p1CdclStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP1CdclStatusInfo() {
        return p1CdclStatusInfo;
    }

    /**
     * Sets the value of the p1CdclStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP1CdclStatusInfo(String value) {
        this.p1CdclStatusInfo = value;
    }

    /**
     * Gets the value of the p1PdclUsedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link P1PdclUsed }{@code >}
     *     
     */
    public JAXBElement<P1PdclUsed> getP1PdclUsedStatus() {
        return p1PdclUsedStatus;
    }

    /**
     * Sets the value of the p1PdclUsedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link P1PdclUsed }{@code >}
     *     
     */
    public void setP1PdclUsedStatus(JAXBElement<P1PdclUsed> value) {
        this.p1PdclUsedStatus = value;
    }

    /**
     * Gets the value of the p1PdclStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP1PdclStatusInfo() {
        return p1PdclStatusInfo;
    }

    /**
     * Sets the value of the p1PdclStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP1PdclStatusInfo(String value) {
        this.p1PdclStatusInfo = value;
    }

    /**
     * Gets the value of the scanStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScanStartStatus }{@code >}
     *     
     */
    public JAXBElement<ScanStartStatus> getScanStart() {
        return scanStart;
    }

    /**
     * Sets the value of the scanStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScanStartStatus }{@code >}
     *     
     */
    public void setScanStart(JAXBElement<ScanStartStatus> value) {
        this.scanStart = value;
    }

    /**
     * Gets the value of the scanStartInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanStartInfo() {
        return scanStartInfo;
    }

    /**
     * Sets the value of the scanStartInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanStartInfo(String value) {
        this.scanStartInfo = value;
    }

    /**
     * Gets the value of the lastScanStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastScanStartTime() {
        return lastScanStartTime;
    }

    /**
     * Sets the value of the lastScanStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastScanStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastScanStartTime = value;
    }

    /**
     * Gets the value of the isEnbConnected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnbConnected() {
        return isEnbConnected;
    }

    /**
     * Sets the value of the isEnbConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnbConnected(JAXBElement<Boolean> value) {
        this.isEnbConnected = value;
    }

    /**
     * Gets the value of the logicalAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLogicalAngle() {
        return logicalAngle;
    }

    /**
     * Sets the value of the logicalAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLogicalAngle(JAXBElement<Integer> value) {
        this.logicalAngle = value;
    }

    /**
     * Gets the value of the headingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHeadingAngle() {
        return headingAngle;
    }

    /**
     * Sets the value of the headingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHeadingAngle(JAXBElement<Integer> value) {
        this.headingAngle = value;
    }

    /**
     * Gets the value of the rsrq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrq() {
        return rsrq;
    }

    /**
     * Sets the value of the rsrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrq(JAXBElement<Integer> value) {
        this.rsrq = value;
    }

    /**
     * Gets the value of the rsrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrp() {
        return rsrp;
    }

    /**
     * Sets the value of the rsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrp(JAXBElement<Integer> value) {
        this.rsrp = value;
    }

    /**
     * Gets the value of the rssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRssi() {
        return rssi;
    }

    /**
     * Sets the value of the rssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRssi(JAXBElement<Integer> value) {
        this.rssi = value;
    }

    /**
     * Gets the value of the sinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSinr() {
        return sinr;
    }

    /**
     * Sets the value of the sinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSinr(JAXBElement<Double> value) {
        this.sinr = value;
    }

    /**
     * Gets the value of the radioTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioTxPower() {
        return radioTxPower;
    }

    /**
     * Sets the value of the radioTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioTxPower(JAXBElement<Integer> value) {
        this.radioTxPower = value;
    }

    /**
     * Gets the value of the donorEnbQuality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DonorEnbQuality }{@code >}
     *     
     */
    public JAXBElement<DonorEnbQuality> getDonorEnbQuality() {
        return donorEnbQuality;
    }

    /**
     * Sets the value of the donorEnbQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DonorEnbQuality }{@code >}
     *     
     */
    public void setDonorEnbQuality(JAXBElement<DonorEnbQuality> value) {
        this.donorEnbQuality = value;
    }

    /**
     * Gets the value of the donorEnbQualityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorEnbQualityInfo() {
        return donorEnbQualityInfo;
    }

    /**
     * Sets the value of the donorEnbQualityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorEnbQualityInfo(String value) {
        this.donorEnbQualityInfo = value;
    }

    /**
     * Gets the value of the rankIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRankIndicator() {
        return rankIndicator;
    }

    /**
     * Sets the value of the rankIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRankIndicator(JAXBElement<Integer> value) {
        this.rankIndicator = value;
    }

    /**
     * Gets the value of the spectralEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpectralEfficiency() {
        return spectralEfficiency;
    }

    /**
     * Sets the value of the spectralEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpectralEfficiency(JAXBElement<Double> value) {
        this.spectralEfficiency = value;
    }

    /**
     * Gets the value of the drm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDrm() {
        return drm;
    }

    /**
     * Sets the value of the drm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDrm(JAXBElement<BigDecimal> value) {
        this.drm = value;
    }

    /**
     * Gets the value of the rsrpDom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrpDom() {
        return rsrpDom;
    }

    /**
     * Sets the value of the rsrpDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrpDom(JAXBElement<BigDecimal> value) {
        this.rsrpDom = value;
    }

    /**
     * Gets the value of the pci1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci1() {
        return pci1;
    }

    /**
     * Sets the value of the pci1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci1(JAXBElement<Integer> value) {
        this.pci1 = value;
    }

    /**
     * Gets the value of the rsrp1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrp1() {
        return rsrp1;
    }

    /**
     * Sets the value of the rsrp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrp1(JAXBElement<BigDecimal> value) {
        this.rsrp1 = value;
    }

    /**
     * Gets the value of the rsrq1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrq1() {
        return rsrq1;
    }

    /**
     * Sets the value of the rsrq1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrq1(JAXBElement<BigDecimal> value) {
        this.rsrq1 = value;
    }

    /**
     * Gets the value of the pci2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci2() {
        return pci2;
    }

    /**
     * Sets the value of the pci2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci2(JAXBElement<Integer> value) {
        this.pci2 = value;
    }

    /**
     * Gets the value of the rsrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrp2() {
        return rsrp2;
    }

    /**
     * Sets the value of the rsrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrp2(JAXBElement<BigDecimal> value) {
        this.rsrp2 = value;
    }

    /**
     * Gets the value of the rsrq2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrq2() {
        return rsrq2;
    }

    /**
     * Sets the value of the rsrq2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrq2(JAXBElement<BigDecimal> value) {
        this.rsrq2 = value;
    }

    /**
     * Gets the value of the pci3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPci3() {
        return pci3;
    }

    /**
     * Sets the value of the pci3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPci3(JAXBElement<Integer> value) {
        this.pci3 = value;
    }

    /**
     * Gets the value of the rsrp3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrp3() {
        return rsrp3;
    }

    /**
     * Sets the value of the rsrp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrp3(JAXBElement<BigDecimal> value) {
        this.rsrp3 = value;
    }

    /**
     * Gets the value of the rsrq3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRsrq3() {
        return rsrq3;
    }

    /**
     * Sets the value of the rsrq3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRsrq3(JAXBElement<BigDecimal> value) {
        this.rsrq3 = value;
    }

    /**
     * Gets the value of the timingAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTimingAdvance() {
        return timingAdvance;
    }

    /**
     * Sets the value of the timingAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTimingAdvance(JAXBElement<Long> value) {
        this.timingAdvance = value;
    }

    /**
     * Gets the value of the mimoRank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMimoRank() {
        return mimoRank;
    }

    /**
     * Sets the value of the mimoRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMimoRank(JAXBElement<Long> value) {
        this.mimoRank = value;
    }

    /**
     * Gets the value of the dlPdcpThroughput property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlPdcpThroughput() {
        return dlPdcpThroughput;
    }

    /**
     * Sets the value of the dlPdcpThroughput property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlPdcpThroughput(JAXBElement<Long> value) {
        this.dlPdcpThroughput = value;
    }

    /**
     * Gets the value of the ulPdcpThroughput property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlPdcpThroughput() {
        return ulPdcpThroughput;
    }

    /**
     * Sets the value of the ulPdcpThroughput property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlPdcpThroughput(JAXBElement<Long> value) {
        this.ulPdcpThroughput = value;
    }

    /**
     * Gets the value of the antennaCorrelation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAntennaCorrelation() {
        return antennaCorrelation;
    }

    /**
     * Sets the value of the antennaCorrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAntennaCorrelation(JAXBElement<Long> value) {
        this.antennaCorrelation = value;
    }

    /**
     * Gets the value of the sccAntennaCorrelation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSccAntennaCorrelation() {
        return sccAntennaCorrelation;
    }

    /**
     * Sets the value of the sccAntennaCorrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSccAntennaCorrelation(JAXBElement<Long> value) {
        this.sccAntennaCorrelation = value;
    }

    /**
     * Gets the value of the ueDlModulationCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeDlModulationCapability() {
        return ueDlModulationCapability;
    }

    /**
     * Sets the value of the ueDlModulationCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeDlModulationCapability(String value) {
        this.ueDlModulationCapability = value;
    }

    /**
     * Gets the value of the ueDlCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeDlCategory() {
        return ueDlCategory;
    }

    /**
     * Sets the value of the ueDlCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeDlCategory(String value) {
        this.ueDlCategory = value;
    }

    /**
     * Gets the value of the ueUlModulationCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeUlModulationCapability() {
        return ueUlModulationCapability;
    }

    /**
     * Sets the value of the ueUlModulationCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeUlModulationCapability(String value) {
        this.ueUlModulationCapability = value;
    }

    /**
     * Gets the value of the ueUlCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUeUlCategory() {
        return ueUlCategory;
    }

    /**
     * Sets the value of the ueUlCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeUlCategory(String value) {
        this.ueUlCategory = value;
    }

    /**
     * Gets the value of the donorEndcIndication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDonorEndcIndication() {
        return donorEndcIndication;
    }

    /**
     * Sets the value of the donorEndcIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDonorEndcIndication(JAXBElement<String> value) {
        this.donorEndcIndication = value;
    }

    /**
     * Gets the value of the apNs property.
     * 
     * @return
     *     possible object is
     *     {@link RelayApnList }
     *     
     */
    public RelayApnList getAPNs() {
        return apNs;
    }

    /**
     * Sets the value of the apNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayApnList }
     *     
     */
    public void setAPNs(RelayApnList value) {
        this.apNs = value;
    }

    /**
     * Gets the value of the connectedDevices property.
     * 
     * @return
     *     possible object is
     *     {@link RelayConnectedDevicesList }
     *     
     */
    public RelayConnectedDevicesList getConnectedDevices() {
        return connectedDevices;
    }

    /**
     * Sets the value of the connectedDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayConnectedDevicesList }
     *     
     */
    public void setConnectedDevices(RelayConnectedDevicesList value) {
        this.connectedDevices = value;
    }

    /**
     * Gets the value of the backhaulType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackhaulTypeWs }{@code >}
     *     
     */
    public JAXBElement<BackhaulTypeWs> getBackhaulType() {
        return backhaulType;
    }

    /**
     * Sets the value of the backhaulType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackhaulTypeWs }{@code >}
     *     
     */
    public void setBackhaulType(JAXBElement<BackhaulTypeWs> value) {
        this.backhaulType = value;
    }

    /**
     * Gets the value of the backhaulWifiApSsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulWifiApSsid() {
        return backhaulWifiApSsid;
    }

    /**
     * Sets the value of the backhaulWifiApSsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulWifiApSsid(String value) {
        this.backhaulWifiApSsid = value;
    }

    /**
     * Gets the value of the backhaulWifiApSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackhaulWiFiApSecurityTypeWs }{@code >}
     *     
     */
    public JAXBElement<BackhaulWiFiApSecurityTypeWs> getBackhaulWifiApSecurity() {
        return backhaulWifiApSecurity;
    }

    /**
     * Sets the value of the backhaulWifiApSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackhaulWiFiApSecurityTypeWs }{@code >}
     *     
     */
    public void setBackhaulWifiApSecurity(JAXBElement<BackhaulWiFiApSecurityTypeWs> value) {
        this.backhaulWifiApSecurity = value;
    }

    /**
     * Gets the value of the backhaulWifiActiveChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBackhaulWifiActiveChannel() {
        return backhaulWifiActiveChannel;
    }

    /**
     * Sets the value of the backhaulWifiActiveChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBackhaulWifiActiveChannel(JAXBElement<Integer> value) {
        this.backhaulWifiActiveChannel = value;
    }

    /**
     * Gets the value of the backhaulWifiRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBackhaulWifiRssi() {
        return backhaulWifiRssi;
    }

    /**
     * Sets the value of the backhaulWifiRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBackhaulWifiRssi(JAXBElement<Integer> value) {
        this.backhaulWifiRssi = value;
    }

    /**
     * Gets the value of the backhaulWifiActiveBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackhaulWifiActiveBand() {
        return backhaulWifiActiveBand;
    }

    /**
     * Sets the value of the backhaulWifiActiveBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackhaulWifiActiveBand(JAXBElement<String> value) {
        this.backhaulWifiActiveBand = value;
    }

    /**
     * Gets the value of the backhaulWifiApMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulWifiApMacAddress() {
        return backhaulWifiApMacAddress;
    }

    /**
     * Sets the value of the backhaulWifiApMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulWifiApMacAddress(String value) {
        this.backhaulWifiApMacAddress = value;
    }

    /**
     * Gets the value of the backhaulWifiIpMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BackhaulWiFiIpModeWs }{@code >}
     *     
     */
    public JAXBElement<BackhaulWiFiIpModeWs> getBackhaulWifiIpMode() {
        return backhaulWifiIpMode;
    }

    /**
     * Sets the value of the backhaulWifiIpMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BackhaulWiFiIpModeWs }{@code >}
     *     
     */
    public void setBackhaulWifiIpMode(JAXBElement<BackhaulWiFiIpModeWs> value) {
        this.backhaulWifiIpMode = value;
    }

    /**
     * Gets the value of the backhaulWifiGatewayIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulWifiGatewayIpAddress() {
        return backhaulWifiGatewayIpAddress;
    }

    /**
     * Sets the value of the backhaulWifiGatewayIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulWifiGatewayIpAddress(String value) {
        this.backhaulWifiGatewayIpAddress = value;
    }

    /**
     * Gets the value of the backhaulWifiSubnetMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulWifiSubnetMask() {
        return backhaulWifiSubnetMask;
    }

    /**
     * Sets the value of the backhaulWifiSubnetMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulWifiSubnetMask(String value) {
        this.backhaulWifiSubnetMask = value;
    }

    /**
     * Gets the value of the backhaulwifiPublicIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackhaulwifiPublicIpAddress() {
        return backhaulwifiPublicIpAddress;
    }

    /**
     * Sets the value of the backhaulwifiPublicIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackhaulwifiPublicIpAddress(String value) {
        this.backhaulwifiPublicIpAddress = value;
    }

    /**
     * Gets the value of the carrierAggregations property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAggregationList }
     *     
     */
    public CarrierAggregationList getCarrierAggregations() {
        return carrierAggregations;
    }

    /**
     * Sets the value of the carrierAggregations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAggregationList }
     *     
     */
    public void setCarrierAggregations(CarrierAggregationList value) {
        this.carrierAggregations = value;
    }

}
