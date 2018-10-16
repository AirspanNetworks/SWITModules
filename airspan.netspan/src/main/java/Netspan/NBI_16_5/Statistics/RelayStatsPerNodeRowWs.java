
package Netspan.NBI_16_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelayStatsPerNodeRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayStatsPerNodeRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IfInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfInDiscard" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IfOutDiscard" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IfInErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="IfOutErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RadioRssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRssiMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrpMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrpMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrpMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrqMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrqMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioRsrqMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioSinrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RadioSinrMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RadioSinrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpectralEfficiencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpectralEfficiencyMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpectralEfficiencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RadioTxPowerMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioTxPowerMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioTxPowerMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DrmMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DrmMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DrmMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RankIndexMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RankIndexMean" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RankIndexMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HeadingAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioMnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioEci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioTac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RadioSccCaState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioSccEarfcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioSccBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioSccBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RadioSccPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumOfDenbChanges" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReestabMessageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrpDomMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrpDomMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RsrpDomMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalDlTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalDlTrafficDiscards" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalDlTrafficPackets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalUlTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalUlTrafficDiscards" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalUlTrafficPackets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayStatsPerNodeRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "ifInBytes",
    "ifOutBytes",
    "ifInDiscard",
    "ifOutDiscard",
    "ifInErrors",
    "ifOutErrors",
    "radioRssiMin",
    "radioRssiMean",
    "radioRssiMax",
    "radioRsrpMin",
    "radioRsrpMean",
    "radioRsrpMax",
    "radioRsrqMin",
    "radioRsrqMean",
    "radioRsrqMax",
    "radioSinrMin",
    "radioSinrMean",
    "radioSinrMax",
    "spectralEfficiencyMin",
    "spectralEfficiencyMean",
    "spectralEfficiencyMax",
    "radioTxPowerMin",
    "radioTxPowerMean",
    "radioTxPowerMax",
    "drmMin",
    "drmMean",
    "drmMax",
    "rankIndexMin",
    "rankIndexMean",
    "rankIndexMax",
    "headingAngle",
    "radioMcc",
    "radioMnc",
    "radioEci",
    "radioEarfcn",
    "radioBand",
    "radioBandwidth",
    "radioPci",
    "radioTac",
    "radioSccCaState",
    "radioSccEarfcn",
    "radioSccBand",
    "radioSccBandwidth",
    "radioSccPci",
    "numOfDenbChanges",
    "reestabMessageCount",
    "rsrpDomMin",
    "rsrpDomMean",
    "rsrpDomMax",
    "totalDlTrafficBytes",
    "totalDlTrafficDiscards",
    "totalDlTrafficPackets",
    "totalUlTrafficBytes",
    "totalUlTrafficDiscards",
    "totalUlTrafficPackets"
})
public class RelayStatsPerNodeRowWs {

    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "IfInBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifInBytes;
    @XmlElementRef(name = "IfOutBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutBytes;
    @XmlElementRef(name = "IfInDiscard", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifInDiscard;
    @XmlElementRef(name = "IfOutDiscard", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutDiscard;
    @XmlElementRef(name = "IfInErrors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifInErrors;
    @XmlElementRef(name = "IfOutErrors", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutErrors;
    @XmlElementRef(name = "RadioRssiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRssiMin;
    @XmlElementRef(name = "RadioRssiMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRssiMean;
    @XmlElementRef(name = "RadioRssiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRssiMax;
    @XmlElementRef(name = "RadioRsrpMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrpMin;
    @XmlElementRef(name = "RadioRsrpMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrpMean;
    @XmlElementRef(name = "RadioRsrpMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrpMax;
    @XmlElementRef(name = "RadioRsrqMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrqMin;
    @XmlElementRef(name = "RadioRsrqMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrqMean;
    @XmlElementRef(name = "RadioRsrqMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrqMax;
    @XmlElementRef(name = "RadioSinrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radioSinrMin;
    @XmlElementRef(name = "RadioSinrMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radioSinrMean;
    @XmlElementRef(name = "RadioSinrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radioSinrMax;
    @XmlElementRef(name = "SpectralEfficiencyMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spectralEfficiencyMin;
    @XmlElementRef(name = "SpectralEfficiencyMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spectralEfficiencyMean;
    @XmlElementRef(name = "SpectralEfficiencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spectralEfficiencyMax;
    @XmlElementRef(name = "RadioTxPowerMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTxPowerMin;
    @XmlElementRef(name = "RadioTxPowerMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTxPowerMean;
    @XmlElementRef(name = "RadioTxPowerMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTxPowerMax;
    @XmlElementRef(name = "DrmMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> drmMin;
    @XmlElementRef(name = "DrmMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> drmMean;
    @XmlElementRef(name = "DrmMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> drmMax;
    @XmlElementRef(name = "RankIndexMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rankIndexMin;
    @XmlElementRef(name = "RankIndexMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rankIndexMean;
    @XmlElementRef(name = "RankIndexMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rankIndexMax;
    @XmlElementRef(name = "HeadingAngle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> headingAngle;
    @XmlElement(name = "RadioMcc")
    protected String radioMcc;
    @XmlElement(name = "RadioMnc")
    protected String radioMnc;
    @XmlElementRef(name = "RadioEci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioEci;
    @XmlElementRef(name = "RadioEarfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioEarfcn;
    @XmlElement(name = "RadioBand")
    protected String radioBand;
    @XmlElement(name = "RadioBandwidth")
    protected String radioBandwidth;
    @XmlElementRef(name = "RadioPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioPci;
    @XmlElementRef(name = "RadioTac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTac;
    @XmlElement(name = "RadioSccCaState")
    protected String radioSccCaState;
    @XmlElement(name = "RadioSccEarfcn")
    protected String radioSccEarfcn;
    @XmlElement(name = "RadioSccBand")
    protected String radioSccBand;
    @XmlElement(name = "RadioSccBandwidth")
    protected String radioSccBandwidth;
    @XmlElementRef(name = "RadioSccPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioSccPci;
    @XmlElementRef(name = "NumOfDenbChanges", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numOfDenbChanges;
    @XmlElementRef(name = "ReestabMessageCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reestabMessageCount;
    @XmlElementRef(name = "RsrpDomMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpDomMin;
    @XmlElementRef(name = "RsrpDomMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpDomMean;
    @XmlElementRef(name = "RsrpDomMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpDomMax;
    @XmlElementRef(name = "TotalDlTrafficBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalDlTrafficBytes;
    @XmlElementRef(name = "TotalDlTrafficDiscards", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalDlTrafficDiscards;
    @XmlElementRef(name = "TotalDlTrafficPackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalDlTrafficPackets;
    @XmlElementRef(name = "TotalUlTrafficBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalUlTrafficBytes;
    @XmlElementRef(name = "TotalUlTrafficDiscards", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalUlTrafficDiscards;
    @XmlElementRef(name = "TotalUlTrafficPackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalUlTrafficPackets;

    /**
     * Gets the value of the dateTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStart() {
        return dateTimeStart;
    }

    /**
     * Sets the value of the dateTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStart(XMLGregorianCalendar value) {
        this.dateTimeStart = value;
    }

    /**
     * Gets the value of the dateTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeEnd() {
        return dateTimeEnd;
    }

    /**
     * Sets the value of the dateTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeEnd(XMLGregorianCalendar value) {
        this.dateTimeEnd = value;
    }

    /**
     * Gets the value of the granularityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGranularityPeriod(JAXBElement<Integer> value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the ifInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfInBytes() {
        return ifInBytes;
    }

    /**
     * Sets the value of the ifInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfInBytes(JAXBElement<Long> value) {
        this.ifInBytes = value;
    }

    /**
     * Gets the value of the ifOutBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutBytes() {
        return ifOutBytes;
    }

    /**
     * Sets the value of the ifOutBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutBytes(JAXBElement<Long> value) {
        this.ifOutBytes = value;
    }

    /**
     * Gets the value of the ifInDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfInDiscard() {
        return ifInDiscard;
    }

    /**
     * Sets the value of the ifInDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfInDiscard(JAXBElement<Long> value) {
        this.ifInDiscard = value;
    }

    /**
     * Gets the value of the ifOutDiscard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutDiscard() {
        return ifOutDiscard;
    }

    /**
     * Sets the value of the ifOutDiscard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutDiscard(JAXBElement<Long> value) {
        this.ifOutDiscard = value;
    }

    /**
     * Gets the value of the ifInErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfInErrors() {
        return ifInErrors;
    }

    /**
     * Sets the value of the ifInErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfInErrors(JAXBElement<Long> value) {
        this.ifInErrors = value;
    }

    /**
     * Gets the value of the ifOutErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutErrors() {
        return ifOutErrors;
    }

    /**
     * Sets the value of the ifOutErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutErrors(JAXBElement<Long> value) {
        this.ifOutErrors = value;
    }

    /**
     * Gets the value of the radioRssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRssiMin() {
        return radioRssiMin;
    }

    /**
     * Sets the value of the radioRssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRssiMin(JAXBElement<Integer> value) {
        this.radioRssiMin = value;
    }

    /**
     * Gets the value of the radioRssiMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRssiMean() {
        return radioRssiMean;
    }

    /**
     * Sets the value of the radioRssiMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRssiMean(JAXBElement<Integer> value) {
        this.radioRssiMean = value;
    }

    /**
     * Gets the value of the radioRssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRssiMax() {
        return radioRssiMax;
    }

    /**
     * Sets the value of the radioRssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRssiMax(JAXBElement<Integer> value) {
        this.radioRssiMax = value;
    }

    /**
     * Gets the value of the radioRsrpMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrpMin() {
        return radioRsrpMin;
    }

    /**
     * Sets the value of the radioRsrpMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrpMin(JAXBElement<Integer> value) {
        this.radioRsrpMin = value;
    }

    /**
     * Gets the value of the radioRsrpMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrpMean() {
        return radioRsrpMean;
    }

    /**
     * Sets the value of the radioRsrpMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrpMean(JAXBElement<Integer> value) {
        this.radioRsrpMean = value;
    }

    /**
     * Gets the value of the radioRsrpMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrpMax() {
        return radioRsrpMax;
    }

    /**
     * Sets the value of the radioRsrpMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrpMax(JAXBElement<Integer> value) {
        this.radioRsrpMax = value;
    }

    /**
     * Gets the value of the radioRsrqMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrqMin() {
        return radioRsrqMin;
    }

    /**
     * Sets the value of the radioRsrqMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrqMin(JAXBElement<Integer> value) {
        this.radioRsrqMin = value;
    }

    /**
     * Gets the value of the radioRsrqMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrqMean() {
        return radioRsrqMean;
    }

    /**
     * Sets the value of the radioRsrqMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrqMean(JAXBElement<Integer> value) {
        this.radioRsrqMean = value;
    }

    /**
     * Gets the value of the radioRsrqMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrqMax() {
        return radioRsrqMax;
    }

    /**
     * Sets the value of the radioRsrqMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrqMax(JAXBElement<Integer> value) {
        this.radioRsrqMax = value;
    }

    /**
     * Gets the value of the radioSinrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadioSinrMin() {
        return radioSinrMin;
    }

    /**
     * Sets the value of the radioSinrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadioSinrMin(JAXBElement<Double> value) {
        this.radioSinrMin = value;
    }

    /**
     * Gets the value of the radioSinrMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadioSinrMean() {
        return radioSinrMean;
    }

    /**
     * Sets the value of the radioSinrMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadioSinrMean(JAXBElement<Double> value) {
        this.radioSinrMean = value;
    }

    /**
     * Gets the value of the radioSinrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadioSinrMax() {
        return radioSinrMax;
    }

    /**
     * Sets the value of the radioSinrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadioSinrMax(JAXBElement<Double> value) {
        this.radioSinrMax = value;
    }

    /**
     * Gets the value of the spectralEfficiencyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpectralEfficiencyMin() {
        return spectralEfficiencyMin;
    }

    /**
     * Sets the value of the spectralEfficiencyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpectralEfficiencyMin(JAXBElement<Double> value) {
        this.spectralEfficiencyMin = value;
    }

    /**
     * Gets the value of the spectralEfficiencyMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpectralEfficiencyMean() {
        return spectralEfficiencyMean;
    }

    /**
     * Sets the value of the spectralEfficiencyMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpectralEfficiencyMean(JAXBElement<Double> value) {
        this.spectralEfficiencyMean = value;
    }

    /**
     * Gets the value of the spectralEfficiencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpectralEfficiencyMax() {
        return spectralEfficiencyMax;
    }

    /**
     * Sets the value of the spectralEfficiencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpectralEfficiencyMax(JAXBElement<Double> value) {
        this.spectralEfficiencyMax = value;
    }

    /**
     * Gets the value of the radioTxPowerMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioTxPowerMin() {
        return radioTxPowerMin;
    }

    /**
     * Sets the value of the radioTxPowerMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioTxPowerMin(JAXBElement<Integer> value) {
        this.radioTxPowerMin = value;
    }

    /**
     * Gets the value of the radioTxPowerMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioTxPowerMean() {
        return radioTxPowerMean;
    }

    /**
     * Sets the value of the radioTxPowerMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioTxPowerMean(JAXBElement<Integer> value) {
        this.radioTxPowerMean = value;
    }

    /**
     * Gets the value of the radioTxPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioTxPowerMax() {
        return radioTxPowerMax;
    }

    /**
     * Sets the value of the radioTxPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioTxPowerMax(JAXBElement<Integer> value) {
        this.radioTxPowerMax = value;
    }

    /**
     * Gets the value of the drmMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDrmMin() {
        return drmMin;
    }

    /**
     * Sets the value of the drmMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDrmMin(JAXBElement<Double> value) {
        this.drmMin = value;
    }

    /**
     * Gets the value of the drmMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDrmMean() {
        return drmMean;
    }

    /**
     * Sets the value of the drmMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDrmMean(JAXBElement<Double> value) {
        this.drmMean = value;
    }

    /**
     * Gets the value of the drmMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDrmMax() {
        return drmMax;
    }

    /**
     * Sets the value of the drmMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDrmMax(JAXBElement<Double> value) {
        this.drmMax = value;
    }

    /**
     * Gets the value of the rankIndexMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRankIndexMin() {
        return rankIndexMin;
    }

    /**
     * Sets the value of the rankIndexMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRankIndexMin(JAXBElement<Double> value) {
        this.rankIndexMin = value;
    }

    /**
     * Gets the value of the rankIndexMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRankIndexMean() {
        return rankIndexMean;
    }

    /**
     * Sets the value of the rankIndexMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRankIndexMean(JAXBElement<Double> value) {
        this.rankIndexMean = value;
    }

    /**
     * Gets the value of the rankIndexMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRankIndexMax() {
        return rankIndexMax;
    }

    /**
     * Sets the value of the rankIndexMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRankIndexMax(JAXBElement<Double> value) {
        this.rankIndexMax = value;
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
     * Gets the value of the radioMcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioMcc() {
        return radioMcc;
    }

    /**
     * Sets the value of the radioMcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioMcc(String value) {
        this.radioMcc = value;
    }

    /**
     * Gets the value of the radioMnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioMnc() {
        return radioMnc;
    }

    /**
     * Sets the value of the radioMnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioMnc(String value) {
        this.radioMnc = value;
    }

    /**
     * Gets the value of the radioEci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioEci() {
        return radioEci;
    }

    /**
     * Sets the value of the radioEci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioEci(JAXBElement<Integer> value) {
        this.radioEci = value;
    }

    /**
     * Gets the value of the radioEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioEarfcn() {
        return radioEarfcn;
    }

    /**
     * Sets the value of the radioEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioEarfcn(JAXBElement<Integer> value) {
        this.radioEarfcn = value;
    }

    /**
     * Gets the value of the radioBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioBand() {
        return radioBand;
    }

    /**
     * Sets the value of the radioBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioBand(String value) {
        this.radioBand = value;
    }

    /**
     * Gets the value of the radioBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioBandwidth() {
        return radioBandwidth;
    }

    /**
     * Sets the value of the radioBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioBandwidth(String value) {
        this.radioBandwidth = value;
    }

    /**
     * Gets the value of the radioPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioPci() {
        return radioPci;
    }

    /**
     * Sets the value of the radioPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioPci(JAXBElement<Integer> value) {
        this.radioPci = value;
    }

    /**
     * Gets the value of the radioTac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioTac() {
        return radioTac;
    }

    /**
     * Sets the value of the radioTac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioTac(JAXBElement<Integer> value) {
        this.radioTac = value;
    }

    /**
     * Gets the value of the radioSccCaState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioSccCaState() {
        return radioSccCaState;
    }

    /**
     * Sets the value of the radioSccCaState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioSccCaState(String value) {
        this.radioSccCaState = value;
    }

    /**
     * Gets the value of the radioSccEarfcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioSccEarfcn() {
        return radioSccEarfcn;
    }

    /**
     * Sets the value of the radioSccEarfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioSccEarfcn(String value) {
        this.radioSccEarfcn = value;
    }

    /**
     * Gets the value of the radioSccBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioSccBand() {
        return radioSccBand;
    }

    /**
     * Sets the value of the radioSccBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioSccBand(String value) {
        this.radioSccBand = value;
    }

    /**
     * Gets the value of the radioSccBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioSccBandwidth() {
        return radioSccBandwidth;
    }

    /**
     * Sets the value of the radioSccBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioSccBandwidth(String value) {
        this.radioSccBandwidth = value;
    }

    /**
     * Gets the value of the radioSccPci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioSccPci() {
        return radioSccPci;
    }

    /**
     * Sets the value of the radioSccPci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioSccPci(JAXBElement<Integer> value) {
        this.radioSccPci = value;
    }

    /**
     * Gets the value of the numOfDenbChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumOfDenbChanges() {
        return numOfDenbChanges;
    }

    /**
     * Sets the value of the numOfDenbChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumOfDenbChanges(JAXBElement<Integer> value) {
        this.numOfDenbChanges = value;
    }

    /**
     * Gets the value of the reestabMessageCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReestabMessageCount() {
        return reestabMessageCount;
    }

    /**
     * Sets the value of the reestabMessageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReestabMessageCount(JAXBElement<Integer> value) {
        this.reestabMessageCount = value;
    }

    /**
     * Gets the value of the rsrpDomMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpDomMin() {
        return rsrpDomMin;
    }

    /**
     * Sets the value of the rsrpDomMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpDomMin(JAXBElement<Integer> value) {
        this.rsrpDomMin = value;
    }

    /**
     * Gets the value of the rsrpDomMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpDomMean() {
        return rsrpDomMean;
    }

    /**
     * Sets the value of the rsrpDomMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpDomMean(JAXBElement<Integer> value) {
        this.rsrpDomMean = value;
    }

    /**
     * Gets the value of the rsrpDomMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpDomMax() {
        return rsrpDomMax;
    }

    /**
     * Sets the value of the rsrpDomMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpDomMax(JAXBElement<Integer> value) {
        this.rsrpDomMax = value;
    }

    /**
     * Gets the value of the totalDlTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalDlTrafficBytes() {
        return totalDlTrafficBytes;
    }

    /**
     * Sets the value of the totalDlTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalDlTrafficBytes(JAXBElement<Long> value) {
        this.totalDlTrafficBytes = value;
    }

    /**
     * Gets the value of the totalDlTrafficDiscards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalDlTrafficDiscards() {
        return totalDlTrafficDiscards;
    }

    /**
     * Sets the value of the totalDlTrafficDiscards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalDlTrafficDiscards(JAXBElement<Long> value) {
        this.totalDlTrafficDiscards = value;
    }

    /**
     * Gets the value of the totalDlTrafficPackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalDlTrafficPackets() {
        return totalDlTrafficPackets;
    }

    /**
     * Sets the value of the totalDlTrafficPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalDlTrafficPackets(JAXBElement<Long> value) {
        this.totalDlTrafficPackets = value;
    }

    /**
     * Gets the value of the totalUlTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalUlTrafficBytes() {
        return totalUlTrafficBytes;
    }

    /**
     * Sets the value of the totalUlTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalUlTrafficBytes(JAXBElement<Long> value) {
        this.totalUlTrafficBytes = value;
    }

    /**
     * Gets the value of the totalUlTrafficDiscards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalUlTrafficDiscards() {
        return totalUlTrafficDiscards;
    }

    /**
     * Sets the value of the totalUlTrafficDiscards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalUlTrafficDiscards(JAXBElement<Long> value) {
        this.totalUlTrafficDiscards = value;
    }

    /**
     * Gets the value of the totalUlTrafficPackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalUlTrafficPackets() {
        return totalUlTrafficPackets;
    }

    /**
     * Sets the value of the totalUlTrafficPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalUlTrafficPackets(JAXBElement<Long> value) {
        this.totalUlTrafficPackets = value;
    }

}
