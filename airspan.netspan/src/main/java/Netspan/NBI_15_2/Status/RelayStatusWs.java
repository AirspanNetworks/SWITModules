
package Netspan.NBI_15_2.Status;

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
 * &lt;complexType name="RelayStatusWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Eci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Earfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Band" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LteBandwidth" type="{http://Airspan.Netspan.WebServices}BandwidthValues" minOccurs="0"/>
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SccCaState" type="{http://Airspan.Netspan.WebServices}RelaySccCaStates" minOccurs="0"/>
 *         &lt;element name="SccBand" type="{http://Airspan.Netspan.WebServices}RelayBands" minOccurs="0"/>
 *         &lt;element name="SccBandwidth" type="{http://Airspan.Netspan.WebServices}RelaySccBandwidths" minOccurs="0"/>
 *         &lt;element name="SccPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SccEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RelayState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportedBands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsedBands" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P1CdclUsedStatus" type="{http://Airspan.Netspan.WebServices}P1CdclUsed" minOccurs="0"/>
 *         &lt;element name="P1CdclStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P1PdclUsedStatus" type="{http://Airspan.Netspan.WebServices}P1PdclUsed" minOccurs="0"/>
 *         &lt;element name="P1PdclStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScanStart" type="{http://Airspan.Netspan.WebServices}ScanStartStatus" minOccurs="0"/>
 *         &lt;element name="ScanStartInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastScanStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsEnbConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LogicalAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HeadingAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rsrq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rsrp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rssi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sinr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RadioTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DonorEnbQuality" type="{http://Airspan.Netspan.WebServices}DonorEnbQuality" minOccurs="0"/>
 *         &lt;element name="DonorEnbQualityInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RankIndicator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpectralEfficiency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Drm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="APNs" type="{http://Airspan.Netspan.WebServices}RelayApnList" minOccurs="0"/>
 *         &lt;element name="ConnectedDevices" type="{http://Airspan.Netspan.WebServices}RelayConnectedDevicesList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "cellID",
    "pci",
    "lteBandwidth",
    "tac",
    "sccCaState",
    "sccBand",
    "sccBandwidth",
    "sccPci",
    "sccEarfcn",
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
    "apNs",
    "connectedDevices"
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
    @XmlElementRef(name = "CellID", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellID;
    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElementRef(name = "LteBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lteBandwidth;
    @XmlElementRef(name = "Tac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tac;
    @XmlElementRef(name = "SccCaState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelaySccCaStates> sccCaState;
    @XmlElementRef(name = "SccBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelayBands> sccBand;
    @XmlElementRef(name = "SccBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RelaySccBandwidths> sccBandwidth;
    @XmlElementRef(name = "SccPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sccPci;
    @XmlElementRef(name = "SccEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sccEarfcn;
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
    @XmlElement(name = "APNs")
    protected RelayApnList apNs;
    @XmlElement(name = "ConnectedDevices")
    protected RelayConnectedDevicesList connectedDevices;

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
     * Gets the value of the cellID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellID() {
        return cellID;
    }

    /**
     * Sets the value of the cellID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellID(JAXBElement<Integer> value) {
        this.cellID = value;
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
     * Gets the value of the sccCaState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}
     *     
     */
    public JAXBElement<RelaySccCaStates> getSccCaState() {
        return sccCaState;
    }

    /**
     * Sets the value of the sccCaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelaySccCaStates }{@code >}
     *     
     */
    public void setSccCaState(JAXBElement<RelaySccCaStates> value) {
        this.sccCaState = value;
    }

    /**
     * Gets the value of the sccBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelayBands }{@code >}
     *     
     */
    public JAXBElement<RelayBands> getSccBand() {
        return sccBand;
    }

    /**
     * Sets the value of the sccBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelayBands }{@code >}
     *     
     */
    public void setSccBand(JAXBElement<RelayBands> value) {
        this.sccBand = value;
    }

    /**
     * Gets the value of the sccBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}
     *     
     */
    public JAXBElement<RelaySccBandwidths> getSccBandwidth() {
        return sccBandwidth;
    }

    /**
     * Sets the value of the sccBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelaySccBandwidths }{@code >}
     *     
     */
    public void setSccBandwidth(JAXBElement<RelaySccBandwidths> value) {
        this.sccBandwidth = value;
    }

    /**
     * Gets the value of the sccPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSccPci() {
        return sccPci;
    }

    /**
     * Sets the value of the sccPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSccPci(JAXBElement<Integer> value) {
        this.sccPci = value;
    }

    /**
     * Gets the value of the sccEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSccEarfcn() {
        return sccEarfcn;
    }

    /**
     * Sets the value of the sccEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSccEarfcn(JAXBElement<Integer> value) {
        this.sccEarfcn = value;
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

}
