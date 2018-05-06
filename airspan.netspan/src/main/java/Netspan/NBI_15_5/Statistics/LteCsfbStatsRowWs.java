
package Netspan.NBI_15_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteCsfbStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCsfbStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranRedirectionAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranFailedRedirections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranSuccessfulRedirections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cdma2kRedirections" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cdma2kTransferRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Csfb3GRedirectionMeas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cdma2kRequest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cdma2kResponse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranRedirWithSysInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranRedirCsfbWithout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranRedirAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranRedirOrCcoInitiation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranConnReleases" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranSuccCsfbCco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranFailedCsfbProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranRedirSysInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranIniWithRedir" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kRedirMeas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kParamTransRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RimInfoReqSent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RimInfoPdusRecieved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RimFailedProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UtranRedirWithoutSysInfo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranWithoutRedirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranCcoAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GeranSuccCsfbCcoNacc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kParamFailRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbOverallRedirectionAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbOverallRedirectionSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbOverallRedirectionFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CsfbUnknownRedirectionFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCsfbStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "utranRedirectionAttempts",
    "utranFailedRedirections",
    "utranSuccessfulRedirections",
    "cdma2KRedirections",
    "cdma2KTransferRate",
    "csfb3GRedirectionMeas",
    "cdma2KRequest",
    "cdma2KResponse",
    "utranRedirWithSysInfo",
    "utranRedirCsfbWithout",
    "geranRedirAttempts",
    "geranRedirOrCcoInitiation",
    "geranConnReleases",
    "geranSuccCsfbCco",
    "geranFailedCsfbProc",
    "geranRedirSysInfo",
    "geranIniWithRedir",
    "csfbCdma2KRedirMeas",
    "csfbCdma2KParamTransRate",
    "rimInfoReqSent",
    "rimInfoPdusRecieved",
    "rimFailedProc",
    "utranRedirWithoutSysInfo",
    "geranWithoutRedirection",
    "geranCcoAttempts",
    "geranSuccCsfbCcoNacc",
    "csfbCdma2KParamFailRate",
    "csfbOverallRedirectionAttempt",
    "csfbOverallRedirectionSuccess",
    "csfbOverallRedirectionFailure",
    "csfbUnknownRedirectionFailure"
})
public class LteCsfbStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "UtranRedirectionAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionAttempts;
    @XmlElementRef(name = "UtranFailedRedirections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranFailedRedirections;
    @XmlElementRef(name = "UtranSuccessfulRedirections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranSuccessfulRedirections;
    @XmlElementRef(name = "Cdma2kRedirections", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cdma2KRedirections;
    @XmlElementRef(name = "Cdma2kTransferRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cdma2KTransferRate;
    @XmlElementRef(name = "Csfb3GRedirectionMeas", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfb3GRedirectionMeas;
    @XmlElementRef(name = "Cdma2kRequest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cdma2KRequest;
    @XmlElementRef(name = "Cdma2kResponse", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cdma2KResponse;
    @XmlElementRef(name = "UtranRedirWithSysInfo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirWithSysInfo;
    @XmlElementRef(name = "UtranRedirCsfbWithout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirCsfbWithout;
    @XmlElementRef(name = "GeranRedirAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranRedirAttempts;
    @XmlElementRef(name = "GeranRedirOrCcoInitiation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranRedirOrCcoInitiation;
    @XmlElementRef(name = "GeranConnReleases", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranConnReleases;
    @XmlElementRef(name = "GeranSuccCsfbCco", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranSuccCsfbCco;
    @XmlElementRef(name = "GeranFailedCsfbProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranFailedCsfbProc;
    @XmlElementRef(name = "GeranRedirSysInfo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranRedirSysInfo;
    @XmlElementRef(name = "GeranIniWithRedir", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranIniWithRedir;
    @XmlElementRef(name = "CsfbCdma2kRedirMeas", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbCdma2KRedirMeas;
    @XmlElementRef(name = "CsfbCdma2kParamTransRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbCdma2KParamTransRate;
    @XmlElementRef(name = "RimInfoReqSent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rimInfoReqSent;
    @XmlElementRef(name = "RimInfoPdusRecieved", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rimInfoPdusRecieved;
    @XmlElementRef(name = "RimFailedProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rimFailedProc;
    @XmlElementRef(name = "UtranRedirWithoutSysInfo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirWithoutSysInfo;
    @XmlElementRef(name = "GeranWithoutRedirection", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranWithoutRedirection;
    @XmlElementRef(name = "GeranCcoAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranCcoAttempts;
    @XmlElementRef(name = "GeranSuccCsfbCcoNacc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranSuccCsfbCcoNacc;
    @XmlElementRef(name = "CsfbCdma2kParamFailRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbCdma2KParamFailRate;
    @XmlElementRef(name = "CsfbOverallRedirectionAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionAttempt;
    @XmlElementRef(name = "CsfbOverallRedirectionSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionSuccess;
    @XmlElementRef(name = "CsfbOverallRedirectionFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionFailure;
    @XmlElementRef(name = "CsfbUnknownRedirectionFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbUnknownRedirectionFailure;

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
     * Gets the value of the dateAndTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeStart() {
        return dateAndTimeStart;
    }

    /**
     * Sets the value of the dateAndTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeStart(XMLGregorianCalendar value) {
        this.dateAndTimeStart = value;
    }

    /**
     * Gets the value of the dateAndTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTimeEnd() {
        return dateAndTimeEnd;
    }

    /**
     * Sets the value of the dateAndTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTimeEnd(XMLGregorianCalendar value) {
        this.dateAndTimeEnd = value;
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
     * Gets the value of the utranRedirectionAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionAttempts() {
        return utranRedirectionAttempts;
    }

    /**
     * Sets the value of the utranRedirectionAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionAttempts(JAXBElement<Integer> value) {
        this.utranRedirectionAttempts = value;
    }

    /**
     * Gets the value of the utranFailedRedirections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranFailedRedirections() {
        return utranFailedRedirections;
    }

    /**
     * Sets the value of the utranFailedRedirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranFailedRedirections(JAXBElement<Integer> value) {
        this.utranFailedRedirections = value;
    }

    /**
     * Gets the value of the utranSuccessfulRedirections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranSuccessfulRedirections() {
        return utranSuccessfulRedirections;
    }

    /**
     * Sets the value of the utranSuccessfulRedirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranSuccessfulRedirections(JAXBElement<Integer> value) {
        this.utranSuccessfulRedirections = value;
    }

    /**
     * Gets the value of the cdma2KRedirections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCdma2KRedirections() {
        return cdma2KRedirections;
    }

    /**
     * Sets the value of the cdma2KRedirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCdma2KRedirections(JAXBElement<Integer> value) {
        this.cdma2KRedirections = value;
    }

    /**
     * Gets the value of the cdma2KTransferRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCdma2KTransferRate() {
        return cdma2KTransferRate;
    }

    /**
     * Sets the value of the cdma2KTransferRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCdma2KTransferRate(JAXBElement<Double> value) {
        this.cdma2KTransferRate = value;
    }

    /**
     * Gets the value of the csfb3GRedirectionMeas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfb3GRedirectionMeas() {
        return csfb3GRedirectionMeas;
    }

    /**
     * Sets the value of the csfb3GRedirectionMeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfb3GRedirectionMeas(JAXBElement<Integer> value) {
        this.csfb3GRedirectionMeas = value;
    }

    /**
     * Gets the value of the cdma2KRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCdma2KRequest() {
        return cdma2KRequest;
    }

    /**
     * Sets the value of the cdma2KRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCdma2KRequest(JAXBElement<Integer> value) {
        this.cdma2KRequest = value;
    }

    /**
     * Gets the value of the cdma2KResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCdma2KResponse() {
        return cdma2KResponse;
    }

    /**
     * Sets the value of the cdma2KResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCdma2KResponse(JAXBElement<Integer> value) {
        this.cdma2KResponse = value;
    }

    /**
     * Gets the value of the utranRedirWithSysInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirWithSysInfo() {
        return utranRedirWithSysInfo;
    }

    /**
     * Sets the value of the utranRedirWithSysInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirWithSysInfo(JAXBElement<Integer> value) {
        this.utranRedirWithSysInfo = value;
    }

    /**
     * Gets the value of the utranRedirCsfbWithout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirCsfbWithout() {
        return utranRedirCsfbWithout;
    }

    /**
     * Sets the value of the utranRedirCsfbWithout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirCsfbWithout(JAXBElement<Integer> value) {
        this.utranRedirCsfbWithout = value;
    }

    /**
     * Gets the value of the geranRedirAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranRedirAttempts() {
        return geranRedirAttempts;
    }

    /**
     * Sets the value of the geranRedirAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranRedirAttempts(JAXBElement<Integer> value) {
        this.geranRedirAttempts = value;
    }

    /**
     * Gets the value of the geranRedirOrCcoInitiation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranRedirOrCcoInitiation() {
        return geranRedirOrCcoInitiation;
    }

    /**
     * Sets the value of the geranRedirOrCcoInitiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranRedirOrCcoInitiation(JAXBElement<Integer> value) {
        this.geranRedirOrCcoInitiation = value;
    }

    /**
     * Gets the value of the geranConnReleases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranConnReleases() {
        return geranConnReleases;
    }

    /**
     * Sets the value of the geranConnReleases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranConnReleases(JAXBElement<Integer> value) {
        this.geranConnReleases = value;
    }

    /**
     * Gets the value of the geranSuccCsfbCco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranSuccCsfbCco() {
        return geranSuccCsfbCco;
    }

    /**
     * Sets the value of the geranSuccCsfbCco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranSuccCsfbCco(JAXBElement<Integer> value) {
        this.geranSuccCsfbCco = value;
    }

    /**
     * Gets the value of the geranFailedCsfbProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranFailedCsfbProc() {
        return geranFailedCsfbProc;
    }

    /**
     * Sets the value of the geranFailedCsfbProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranFailedCsfbProc(JAXBElement<Integer> value) {
        this.geranFailedCsfbProc = value;
    }

    /**
     * Gets the value of the geranRedirSysInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranRedirSysInfo() {
        return geranRedirSysInfo;
    }

    /**
     * Sets the value of the geranRedirSysInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranRedirSysInfo(JAXBElement<Integer> value) {
        this.geranRedirSysInfo = value;
    }

    /**
     * Gets the value of the geranIniWithRedir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranIniWithRedir() {
        return geranIniWithRedir;
    }

    /**
     * Sets the value of the geranIniWithRedir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranIniWithRedir(JAXBElement<Integer> value) {
        this.geranIniWithRedir = value;
    }

    /**
     * Gets the value of the csfbCdma2KRedirMeas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbCdma2KRedirMeas() {
        return csfbCdma2KRedirMeas;
    }

    /**
     * Sets the value of the csfbCdma2KRedirMeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbCdma2KRedirMeas(JAXBElement<Integer> value) {
        this.csfbCdma2KRedirMeas = value;
    }

    /**
     * Gets the value of the csfbCdma2KParamTransRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbCdma2KParamTransRate() {
        return csfbCdma2KParamTransRate;
    }

    /**
     * Sets the value of the csfbCdma2KParamTransRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbCdma2KParamTransRate(JAXBElement<Integer> value) {
        this.csfbCdma2KParamTransRate = value;
    }

    /**
     * Gets the value of the rimInfoReqSent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRimInfoReqSent() {
        return rimInfoReqSent;
    }

    /**
     * Sets the value of the rimInfoReqSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRimInfoReqSent(JAXBElement<Integer> value) {
        this.rimInfoReqSent = value;
    }

    /**
     * Gets the value of the rimInfoPdusRecieved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRimInfoPdusRecieved() {
        return rimInfoPdusRecieved;
    }

    /**
     * Sets the value of the rimInfoPdusRecieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRimInfoPdusRecieved(JAXBElement<Integer> value) {
        this.rimInfoPdusRecieved = value;
    }

    /**
     * Gets the value of the rimFailedProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRimFailedProc() {
        return rimFailedProc;
    }

    /**
     * Sets the value of the rimFailedProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRimFailedProc(JAXBElement<Integer> value) {
        this.rimFailedProc = value;
    }

    /**
     * Gets the value of the utranRedirWithoutSysInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirWithoutSysInfo() {
        return utranRedirWithoutSysInfo;
    }

    /**
     * Sets the value of the utranRedirWithoutSysInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirWithoutSysInfo(JAXBElement<Integer> value) {
        this.utranRedirWithoutSysInfo = value;
    }

    /**
     * Gets the value of the geranWithoutRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranWithoutRedirection() {
        return geranWithoutRedirection;
    }

    /**
     * Sets the value of the geranWithoutRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranWithoutRedirection(JAXBElement<Integer> value) {
        this.geranWithoutRedirection = value;
    }

    /**
     * Gets the value of the geranCcoAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranCcoAttempts() {
        return geranCcoAttempts;
    }

    /**
     * Sets the value of the geranCcoAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranCcoAttempts(JAXBElement<Integer> value) {
        this.geranCcoAttempts = value;
    }

    /**
     * Gets the value of the geranSuccCsfbCcoNacc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranSuccCsfbCcoNacc() {
        return geranSuccCsfbCcoNacc;
    }

    /**
     * Sets the value of the geranSuccCsfbCcoNacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranSuccCsfbCcoNacc(JAXBElement<Integer> value) {
        this.geranSuccCsfbCcoNacc = value;
    }

    /**
     * Gets the value of the csfbCdma2KParamFailRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbCdma2KParamFailRate() {
        return csfbCdma2KParamFailRate;
    }

    /**
     * Sets the value of the csfbCdma2KParamFailRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbCdma2KParamFailRate(JAXBElement<Integer> value) {
        this.csfbCdma2KParamFailRate = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionAttempt() {
        return csfbOverallRedirectionAttempt;
    }

    /**
     * Sets the value of the csfbOverallRedirectionAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionAttempt(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionAttempt = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionSuccess() {
        return csfbOverallRedirectionSuccess;
    }

    /**
     * Sets the value of the csfbOverallRedirectionSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionSuccess(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionSuccess = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionFailure() {
        return csfbOverallRedirectionFailure;
    }

    /**
     * Sets the value of the csfbOverallRedirectionFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionFailure(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionFailure = value;
    }

    /**
     * Gets the value of the csfbUnknownRedirectionFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbUnknownRedirectionFailure() {
        return csfbUnknownRedirectionFailure;
    }

    /**
     * Sets the value of the csfbUnknownRedirectionFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbUnknownRedirectionFailure(JAXBElement<Integer> value) {
        this.csfbUnknownRedirectionFailure = value;
    }

}
