
package Netspan.NBI_15_5.Statistics;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelayStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RadioTxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioPowerHeadroom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioRssi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioRsrp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioRsrq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioSinr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RadioSe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IfInBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IfOutBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IfInDiscard" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="IfOutDiscard" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="IfInErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="IfOutErrors" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="RadioMcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioMnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioEci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioEarfcn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioTac" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioSccCaState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioSccEarfcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioSccBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioSccPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RadioSccBandwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioPci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DonorCellChangeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Drm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HeadingAngle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RankIndex" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Pci1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pci2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pci3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Rsrp1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rsrp2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rsrp3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rsrq1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rsrq2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Rsrq3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayStatsRowWs", propOrder = {
    "node",
    "softwareVersion",
    "dateTimeStart",
    "dateTimeEnd",
    "radioTxPower",
    "radioPowerHeadroom",
    "radioRssi",
    "radioRsrp",
    "radioRsrq",
    "radioSinr",
    "radioSe",
    "ifInBytes",
    "ifOutBytes",
    "ifInDiscard",
    "ifOutDiscard",
    "ifInErrors",
    "ifOutErrors",
    "radioMcc",
    "radioMnc",
    "radioEci",
    "radioEarfcn",
    "radioBand",
    "radioBandwidth",
    "radioTac",
    "radioSccCaState",
    "radioSccEarfcn",
    "radioSccBand",
    "radioSccPci",
    "radioSccBandwidth",
    "radioPci",
    "donorCellChangeCount",
    "drm",
    "headingAngle",
    "rankIndex",
    "pci1",
    "pci2",
    "pci3",
    "rsrp1",
    "rsrp2",
    "rsrp3",
    "rsrq1",
    "rsrq2",
    "rsrq3"
})
public class RelayStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "SoftwareVersion")
    protected String softwareVersion;
    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "RadioTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTxPower;
    @XmlElementRef(name = "RadioPowerHeadroom", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioPowerHeadroom;
    @XmlElementRef(name = "RadioRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRssi;
    @XmlElementRef(name = "RadioRsrp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrp;
    @XmlElementRef(name = "RadioRsrq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioRsrq;
    @XmlElementRef(name = "RadioSinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radioSinr;
    @XmlElementRef(name = "RadioSe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> radioSe;
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
    @XmlElementRef(name = "RadioTac", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioTac;
    @XmlElement(name = "RadioSccCaState")
    protected String radioSccCaState;
    @XmlElement(name = "RadioSccEarfcn")
    protected String radioSccEarfcn;
    @XmlElement(name = "RadioSccBand")
    protected String radioSccBand;
    @XmlElementRef(name = "RadioSccPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioSccPci;
    @XmlElement(name = "RadioSccBandwidth")
    protected String radioSccBandwidth;
    @XmlElementRef(name = "RadioPci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> radioPci;
    @XmlElementRef(name = "DonorCellChangeCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> donorCellChangeCount;
    @XmlElementRef(name = "Drm", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> drm;
    @XmlElementRef(name = "HeadingAngle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> headingAngle;
    @XmlElementRef(name = "RankIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rankIndex;
    @XmlElementRef(name = "Pci1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci1;
    @XmlElementRef(name = "Pci2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci2;
    @XmlElementRef(name = "Pci3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pci3;
    @XmlElementRef(name = "Rsrp1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp1;
    @XmlElementRef(name = "Rsrp2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp2;
    @XmlElementRef(name = "Rsrp3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrp3;
    @XmlElementRef(name = "Rsrq1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq1;
    @XmlElementRef(name = "Rsrq2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq2;
    @XmlElementRef(name = "Rsrq3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rsrq3;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

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
     * Gets the value of the radioPowerHeadroom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioPowerHeadroom() {
        return radioPowerHeadroom;
    }

    /**
     * Sets the value of the radioPowerHeadroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioPowerHeadroom(JAXBElement<Integer> value) {
        this.radioPowerHeadroom = value;
    }

    /**
     * Gets the value of the radioRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRssi() {
        return radioRssi;
    }

    /**
     * Sets the value of the radioRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRssi(JAXBElement<Integer> value) {
        this.radioRssi = value;
    }

    /**
     * Gets the value of the radioRsrp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrp() {
        return radioRsrp;
    }

    /**
     * Sets the value of the radioRsrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrp(JAXBElement<Integer> value) {
        this.radioRsrp = value;
    }

    /**
     * Gets the value of the radioRsrq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRadioRsrq() {
        return radioRsrq;
    }

    /**
     * Sets the value of the radioRsrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRadioRsrq(JAXBElement<Integer> value) {
        this.radioRsrq = value;
    }

    /**
     * Gets the value of the radioSinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadioSinr() {
        return radioSinr;
    }

    /**
     * Sets the value of the radioSinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadioSinr(JAXBElement<Double> value) {
        this.radioSinr = value;
    }

    /**
     * Gets the value of the radioSe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRadioSe() {
        return radioSe;
    }

    /**
     * Sets the value of the radioSe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRadioSe(JAXBElement<Double> value) {
        this.radioSe = value;
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
     * Gets the value of the donorCellChangeCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDonorCellChangeCount() {
        return donorCellChangeCount;
    }

    /**
     * Sets the value of the donorCellChangeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDonorCellChangeCount(JAXBElement<Integer> value) {
        this.donorCellChangeCount = value;
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
     * Gets the value of the rankIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRankIndex() {
        return rankIndex;
    }

    /**
     * Sets the value of the rankIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRankIndex(JAXBElement<BigDecimal> value) {
        this.rankIndex = value;
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

}
