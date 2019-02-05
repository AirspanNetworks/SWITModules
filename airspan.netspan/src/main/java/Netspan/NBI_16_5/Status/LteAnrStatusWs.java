
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.DiscoveredByValues;
import Netspan.API.Enums.HandoverTypes;
import Netspan.API.Enums.HoControlStateTypes;
import Netspan.API.Enums.NghCellStatus;
import Netspan.API.Enums.X2ControlStateTypes;


/**
 * <p>Java class for LteAnrStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteAnrStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnbType" type="{http://Airspan.Netspan.WebServices}EnbTypes" minOccurs="0"/&gt;
 *         &lt;element name="EnbId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Tac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DownlinkEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoControlStatus" type="{http://Airspan.Netspan.WebServices}HoControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="X2ControlStatus" type="{http://Airspan.Netspan.WebServices}X2ControlStateTypes" minOccurs="0"/&gt;
 *         &lt;element name="HandoverType" type="{http://Airspan.Netspan.WebServices}HandoverType" minOccurs="0"/&gt;
 *         &lt;element name="DiscoveredBy" type="{http://Airspan.Netspan.WebServices}DiscoveredByValues" minOccurs="0"/&gt;
 *         &lt;element name="IsStaticNeighbour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoSuccessRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QOffset" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="ActiveQOffset" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="Mvno1Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno1Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno2Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno2Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno3Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno3Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno4Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno4Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno5Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mvno5Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellIndividualOffset" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="ActiveCellIndividualOffset" type="{http://Airspan.Netspan.WebServices}QOffsetRangeTypes" minOccurs="0"/&gt;
 *         &lt;element name="PrachRsi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachRsi0CorelZoneConfig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrachCfgIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommsStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommsStatusDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourOfCell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CellStatus" type="{http://Airspan.Netspan.WebServices}NghCellStatus" minOccurs="0"/&gt;
 *         &lt;element name="CsgId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgRsrp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterferingNeighbor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteAnrStatusWs", propOrder = {
    "name",
    "ipAddress",
    "pci",
    "enbType",
    "enbId",
    "cellId",
    "cellIdentity",
    "tac",
    "downlinkEarfcn",
    "mcc",
    "mnc",
    "hoControlStatus",
    "x2ControlStatus",
    "handoverType",
    "discoveredBy",
    "isStaticNeighbour",
    "hoSuccessRate",
    "pi",
    "qOffset",
    "activeQOffset",
    "mvno1Mcc",
    "mvno1Mnc",
    "mvno2Mcc",
    "mvno2Mnc",
    "mvno3Mcc",
    "mvno3Mnc",
    "mvno4Mcc",
    "mvno4Mnc",
    "mvno5Mcc",
    "mvno5Mnc",
    "cellIndividualOffset",
    "activeCellIndividualOffset",
    "prachRsi",
    "prachRsi0CorelZoneConfig",
    "prachFreqOffset",
    "prachCfgIndex",
    "commsStatus",
    "commsStatusDisplay",
    "neighbourOfCell",
    "cellStatus",
    "csgId",
    "avgRsrp",
    "interferingNeighbor"
})
public class LteAnrStatusWs {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElementRef(name = "Pci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci;
    @XmlElementRef(name = "EnbType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnbTypes> enbType;
    @XmlElement(name = "EnbId")
    protected String enbId;
    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "CellIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentity;
    @XmlElementRef(name = "Tac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tac;
    @XmlElementRef(name = "DownlinkEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> downlinkEarfcn;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElementRef(name = "HoControlStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HoControlStateTypes> hoControlStatus;
    @XmlElementRef(name = "X2ControlStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<X2ControlStateTypes> x2ControlStatus;
    @XmlElementRef(name = "HandoverType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<HandoverTypes> handoverType;
    @XmlElementRef(name = "DiscoveredBy", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DiscoveredByValues> discoveredBy;
    @XmlElementRef(name = "IsStaticNeighbour", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isStaticNeighbour;
    @XmlElementRef(name = "HoSuccessRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoSuccessRate;
    @XmlElementRef(name = "Pi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pi;
    @XmlElementRef(name = "QOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> qOffset;
    @XmlElementRef(name = "ActiveQOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeQOffset;
    @XmlElement(name = "Mvno1Mcc")
    protected String mvno1Mcc;
    @XmlElement(name = "Mvno1Mnc")
    protected String mvno1Mnc;
    @XmlElement(name = "Mvno2Mcc")
    protected String mvno2Mcc;
    @XmlElement(name = "Mvno2Mnc")
    protected String mvno2Mnc;
    @XmlElement(name = "Mvno3Mcc")
    protected String mvno3Mcc;
    @XmlElement(name = "Mvno3Mnc")
    protected String mvno3Mnc;
    @XmlElement(name = "Mvno4Mcc")
    protected String mvno4Mcc;
    @XmlElement(name = "Mvno4Mnc")
    protected String mvno4Mnc;
    @XmlElement(name = "Mvno5Mcc")
    protected String mvno5Mcc;
    @XmlElement(name = "Mvno5Mnc")
    protected String mvno5Mnc;
    @XmlElementRef(name = "CellIndividualOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellIndividualOffset;
    @XmlElementRef(name = "ActiveCellIndividualOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeCellIndividualOffset;
    @XmlElementRef(name = "PrachRsi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachRsi;
    @XmlElementRef(name = "PrachRsi0CorelZoneConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachRsi0CorelZoneConfig;
    @XmlElementRef(name = "PrachFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachFreqOffset;
    @XmlElementRef(name = "PrachCfgIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachCfgIndex;
    @XmlElementRef(name = "CommsStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commsStatus;
    @XmlElement(name = "CommsStatusDisplay")
    protected String commsStatusDisplay;
    @XmlElement(name = "NeighbourOfCell")
    protected String neighbourOfCell;
    @XmlElementRef(name = "CellStatus", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<NghCellStatus> cellStatus;
    @XmlElementRef(name = "CsgId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csgId;
    @XmlElementRef(name = "AvgRsrp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgRsrp;
    @XmlElementRef(name = "InterferingNeighbor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> interferingNeighbor;

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
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
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
     * Gets the value of the enbType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}
     *     
     */
    public JAXBElement<EnbTypes> getEnbType() {
        return enbType;
    }

    /**
     * Sets the value of the enbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnbTypes }{@code >}
     *     
     */
    public void setEnbType(JAXBElement<EnbTypes> value) {
        this.enbType = value;
    }

    /**
     * Gets the value of the enbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnbId() {
        return enbId;
    }

    /**
     * Sets the value of the enbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnbId(String value) {
        this.enbId = value;
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
     * Gets the value of the cellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentity(JAXBElement<Integer> value) {
        this.cellIdentity = value;
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
     * Gets the value of the downlinkEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDownlinkEarfcn() {
        return downlinkEarfcn;
    }

    /**
     * Sets the value of the downlinkEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDownlinkEarfcn(JAXBElement<Integer> value) {
        this.downlinkEarfcn = value;
    }

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
     * Gets the value of the hoControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<HoControlStateTypes> getHoControlStatus() {
        return hoControlStatus;
    }

    /**
     * Sets the value of the hoControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoControlStateTypes }{@code >}
     *     
     */
    public void setHoControlStatus(JAXBElement<HoControlStateTypes> value) {
        this.hoControlStatus = value;
    }

    /**
     * Gets the value of the x2ControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public JAXBElement<X2ControlStateTypes> getX2ControlStatus() {
        return x2ControlStatus;
    }

    /**
     * Sets the value of the x2ControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link X2ControlStateTypes }{@code >}
     *     
     */
    public void setX2ControlStatus(JAXBElement<X2ControlStateTypes> value) {
        this.x2ControlStatus = value;
    }

    /**
     * Gets the value of the handoverType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HandoverTypes }{@code >}
     *     
     */
    public JAXBElement<HandoverTypes> getHandoverType() {
        return handoverType;
    }

    /**
     * Sets the value of the handoverType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HandoverTypes }{@code >}
     *     
     */
    public void setHandoverType(JAXBElement<HandoverTypes> value) {
        this.handoverType = value;
    }

    /**
     * Gets the value of the discoveredBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiscoveredByValues }{@code >}
     *     
     */
    public JAXBElement<DiscoveredByValues> getDiscoveredBy() {
        return discoveredBy;
    }

    /**
     * Sets the value of the discoveredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiscoveredByValues }{@code >}
     *     
     */
    public void setDiscoveredBy(JAXBElement<DiscoveredByValues> value) {
        this.discoveredBy = value;
    }

    /**
     * Gets the value of the isStaticNeighbour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsStaticNeighbour() {
        return isStaticNeighbour;
    }

    /**
     * Sets the value of the isStaticNeighbour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsStaticNeighbour(JAXBElement<Boolean> value) {
        this.isStaticNeighbour = value;
    }

    /**
     * Gets the value of the hoSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoSuccessRate() {
        return hoSuccessRate;
    }

    /**
     * Sets the value of the hoSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoSuccessRate(JAXBElement<Integer> value) {
        this.hoSuccessRate = value;
    }

    /**
     * Gets the value of the pi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPi() {
        return pi;
    }

    /**
     * Sets the value of the pi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPi(JAXBElement<Integer> value) {
        this.pi = value;
    }

    /**
     * Gets the value of the qOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQOffset() {
        return qOffset;
    }

    /**
     * Sets the value of the qOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQOffset(JAXBElement<String> value) {
        this.qOffset = value;
    }

    /**
     * Gets the value of the activeQOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveQOffset() {
        return activeQOffset;
    }

    /**
     * Sets the value of the activeQOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveQOffset(JAXBElement<String> value) {
        this.activeQOffset = value;
    }

    /**
     * Gets the value of the mvno1Mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno1Mcc() {
        return mvno1Mcc;
    }

    /**
     * Sets the value of the mvno1Mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno1Mcc(String value) {
        this.mvno1Mcc = value;
    }

    /**
     * Gets the value of the mvno1Mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno1Mnc() {
        return mvno1Mnc;
    }

    /**
     * Sets the value of the mvno1Mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno1Mnc(String value) {
        this.mvno1Mnc = value;
    }

    /**
     * Gets the value of the mvno2Mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno2Mcc() {
        return mvno2Mcc;
    }

    /**
     * Sets the value of the mvno2Mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno2Mcc(String value) {
        this.mvno2Mcc = value;
    }

    /**
     * Gets the value of the mvno2Mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno2Mnc() {
        return mvno2Mnc;
    }

    /**
     * Sets the value of the mvno2Mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno2Mnc(String value) {
        this.mvno2Mnc = value;
    }

    /**
     * Gets the value of the mvno3Mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno3Mcc() {
        return mvno3Mcc;
    }

    /**
     * Sets the value of the mvno3Mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno3Mcc(String value) {
        this.mvno3Mcc = value;
    }

    /**
     * Gets the value of the mvno3Mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno3Mnc() {
        return mvno3Mnc;
    }

    /**
     * Sets the value of the mvno3Mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno3Mnc(String value) {
        this.mvno3Mnc = value;
    }

    /**
     * Gets the value of the mvno4Mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno4Mcc() {
        return mvno4Mcc;
    }

    /**
     * Sets the value of the mvno4Mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno4Mcc(String value) {
        this.mvno4Mcc = value;
    }

    /**
     * Gets the value of the mvno4Mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno4Mnc() {
        return mvno4Mnc;
    }

    /**
     * Sets the value of the mvno4Mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno4Mnc(String value) {
        this.mvno4Mnc = value;
    }

    /**
     * Gets the value of the mvno5Mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno5Mcc() {
        return mvno5Mcc;
    }

    /**
     * Sets the value of the mvno5Mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno5Mcc(String value) {
        this.mvno5Mcc = value;
    }

    /**
     * Gets the value of the mvno5Mnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvno5Mnc() {
        return mvno5Mnc;
    }

    /**
     * Sets the value of the mvno5Mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvno5Mnc(String value) {
        this.mvno5Mnc = value;
    }

    /**
     * Gets the value of the cellIndividualOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellIndividualOffset() {
        return cellIndividualOffset;
    }

    /**
     * Sets the value of the cellIndividualOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellIndividualOffset(JAXBElement<String> value) {
        this.cellIndividualOffset = value;
    }

    /**
     * Gets the value of the activeCellIndividualOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveCellIndividualOffset() {
        return activeCellIndividualOffset;
    }

    /**
     * Sets the value of the activeCellIndividualOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveCellIndividualOffset(JAXBElement<String> value) {
        this.activeCellIndividualOffset = value;
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
     * Gets the value of the prachRsi0CorelZoneConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachRsi0CorelZoneConfig() {
        return prachRsi0CorelZoneConfig;
    }

    /**
     * Sets the value of the prachRsi0CorelZoneConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachRsi0CorelZoneConfig(JAXBElement<Integer> value) {
        this.prachRsi0CorelZoneConfig = value;
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
     * Gets the value of the prachCfgIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachCfgIndex() {
        return prachCfgIndex;
    }

    /**
     * Sets the value of the prachCfgIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachCfgIndex(JAXBElement<Integer> value) {
        this.prachCfgIndex = value;
    }

    /**
     * Gets the value of the commsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommsStatus() {
        return commsStatus;
    }

    /**
     * Sets the value of the commsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommsStatus(JAXBElement<Integer> value) {
        this.commsStatus = value;
    }

    /**
     * Gets the value of the commsStatusDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommsStatusDisplay() {
        return commsStatusDisplay;
    }

    /**
     * Sets the value of the commsStatusDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommsStatusDisplay(String value) {
        this.commsStatusDisplay = value;
    }

    /**
     * Gets the value of the neighbourOfCell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighbourOfCell() {
        return neighbourOfCell;
    }

    /**
     * Sets the value of the neighbourOfCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighbourOfCell(String value) {
        this.neighbourOfCell = value;
    }

    /**
     * Gets the value of the cellStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NghCellStatus }{@code >}
     *     
     */
    public JAXBElement<NghCellStatus> getCellStatus() {
        return cellStatus;
    }

    /**
     * Sets the value of the cellStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NghCellStatus }{@code >}
     *     
     */
    public void setCellStatus(JAXBElement<NghCellStatus> value) {
        this.cellStatus = value;
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

    /**
     * Gets the value of the avgRsrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgRsrp() {
        return avgRsrp;
    }

    /**
     * Sets the value of the avgRsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgRsrp(JAXBElement<Integer> value) {
        this.avgRsrp = value;
    }

    /**
     * Gets the value of the interferingNeighbor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInterferingNeighbor() {
        return interferingNeighbor;
    }

    /**
     * Sets the value of the interferingNeighbor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInterferingNeighbor(JAXBElement<Boolean> value) {
        this.interferingNeighbor = value;
    }

}
