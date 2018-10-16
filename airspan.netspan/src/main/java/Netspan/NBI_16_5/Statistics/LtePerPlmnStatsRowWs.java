
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
 * <p>Java class for LtePerPlmnStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePerPlmnStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mnc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInitialAttachRequest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfInitialAttachSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceReqRequest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfServiceReqSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionNumberMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnectionNumberMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyInitialAttachSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyInitialAttachAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyInitialAttachMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyServiceRequestSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyServiceRequestAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabLatencyServiceRequestMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePerPlmnStatsRowWs", propOrder = {
    "cellId",
    "mcc",
    "mnc",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "numberOfInitialAttachRequest",
    "numberOfInitialAttachSuccess",
    "numberOfServiceReqRequest",
    "numberOfServiceReqSuccess",
    "rrcConnectionNumberMean",
    "rrcConnectionNumberMax",
    "dlTotalPrbUsage",
    "ulTotalPrbUsage",
    "erabLatencyInitialAttachSum",
    "erabLatencyInitialAttachAvg",
    "erabLatencyInitialAttachMax",
    "erabLatencyServiceRequestSum",
    "erabLatencyServiceRequestAvg",
    "erabLatencyServiceRequestMax"
})
public class LtePerPlmnStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Mnc")
    protected String mnc;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "NumberOfInitialAttachRequest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfInitialAttachRequest;
    @XmlElementRef(name = "NumberOfInitialAttachSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfInitialAttachSuccess;
    @XmlElementRef(name = "NumberOfServiceReqRequest", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfServiceReqRequest;
    @XmlElementRef(name = "NumberOfServiceReqSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfServiceReqSuccess;
    @XmlElementRef(name = "RrcConnectionNumberMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnectionNumberMean;
    @XmlElementRef(name = "RrcConnectionNumberMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnectionNumberMax;
    @XmlElementRef(name = "DlTotalPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlTotalPrbUsage;
    @XmlElementRef(name = "UlTotalPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulTotalPrbUsage;
    @XmlElementRef(name = "ErabLatencyInitialAttachSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyInitialAttachSum;
    @XmlElementRef(name = "ErabLatencyInitialAttachAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyInitialAttachAvg;
    @XmlElementRef(name = "ErabLatencyInitialAttachMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyInitialAttachMax;
    @XmlElementRef(name = "ErabLatencyServiceRequestSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyServiceRequestSum;
    @XmlElementRef(name = "ErabLatencyServiceRequestAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyServiceRequestAvg;
    @XmlElementRef(name = "ErabLatencyServiceRequestMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabLatencyServiceRequestMax;

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
     * Gets the value of the numberOfInitialAttachRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfInitialAttachRequest() {
        return numberOfInitialAttachRequest;
    }

    /**
     * Sets the value of the numberOfInitialAttachRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfInitialAttachRequest(JAXBElement<Integer> value) {
        this.numberOfInitialAttachRequest = value;
    }

    /**
     * Gets the value of the numberOfInitialAttachSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfInitialAttachSuccess() {
        return numberOfInitialAttachSuccess;
    }

    /**
     * Sets the value of the numberOfInitialAttachSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfInitialAttachSuccess(JAXBElement<Integer> value) {
        this.numberOfInitialAttachSuccess = value;
    }

    /**
     * Gets the value of the numberOfServiceReqRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfServiceReqRequest() {
        return numberOfServiceReqRequest;
    }

    /**
     * Sets the value of the numberOfServiceReqRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfServiceReqRequest(JAXBElement<Integer> value) {
        this.numberOfServiceReqRequest = value;
    }

    /**
     * Gets the value of the numberOfServiceReqSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfServiceReqSuccess() {
        return numberOfServiceReqSuccess;
    }

    /**
     * Sets the value of the numberOfServiceReqSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfServiceReqSuccess(JAXBElement<Integer> value) {
        this.numberOfServiceReqSuccess = value;
    }

    /**
     * Gets the value of the rrcConnectionNumberMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnectionNumberMean() {
        return rrcConnectionNumberMean;
    }

    /**
     * Sets the value of the rrcConnectionNumberMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnectionNumberMean(JAXBElement<Integer> value) {
        this.rrcConnectionNumberMean = value;
    }

    /**
     * Gets the value of the rrcConnectionNumberMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnectionNumberMax() {
        return rrcConnectionNumberMax;
    }

    /**
     * Sets the value of the rrcConnectionNumberMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnectionNumberMax(JAXBElement<Integer> value) {
        this.rrcConnectionNumberMax = value;
    }

    /**
     * Gets the value of the dlTotalPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlTotalPrbUsage() {
        return dlTotalPrbUsage;
    }

    /**
     * Sets the value of the dlTotalPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlTotalPrbUsage(JAXBElement<Integer> value) {
        this.dlTotalPrbUsage = value;
    }

    /**
     * Gets the value of the ulTotalPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlTotalPrbUsage() {
        return ulTotalPrbUsage;
    }

    /**
     * Sets the value of the ulTotalPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlTotalPrbUsage(JAXBElement<Integer> value) {
        this.ulTotalPrbUsage = value;
    }

    /**
     * Gets the value of the erabLatencyInitialAttachSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyInitialAttachSum() {
        return erabLatencyInitialAttachSum;
    }

    /**
     * Sets the value of the erabLatencyInitialAttachSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyInitialAttachSum(JAXBElement<Integer> value) {
        this.erabLatencyInitialAttachSum = value;
    }

    /**
     * Gets the value of the erabLatencyInitialAttachAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyInitialAttachAvg() {
        return erabLatencyInitialAttachAvg;
    }

    /**
     * Sets the value of the erabLatencyInitialAttachAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyInitialAttachAvg(JAXBElement<Integer> value) {
        this.erabLatencyInitialAttachAvg = value;
    }

    /**
     * Gets the value of the erabLatencyInitialAttachMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyInitialAttachMax() {
        return erabLatencyInitialAttachMax;
    }

    /**
     * Sets the value of the erabLatencyInitialAttachMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyInitialAttachMax(JAXBElement<Integer> value) {
        this.erabLatencyInitialAttachMax = value;
    }

    /**
     * Gets the value of the erabLatencyServiceRequestSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyServiceRequestSum() {
        return erabLatencyServiceRequestSum;
    }

    /**
     * Sets the value of the erabLatencyServiceRequestSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyServiceRequestSum(JAXBElement<Integer> value) {
        this.erabLatencyServiceRequestSum = value;
    }

    /**
     * Gets the value of the erabLatencyServiceRequestAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyServiceRequestAvg() {
        return erabLatencyServiceRequestAvg;
    }

    /**
     * Sets the value of the erabLatencyServiceRequestAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyServiceRequestAvg(JAXBElement<Integer> value) {
        this.erabLatencyServiceRequestAvg = value;
    }

    /**
     * Gets the value of the erabLatencyServiceRequestMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabLatencyServiceRequestMax() {
        return erabLatencyServiceRequestMax;
    }

    /**
     * Sets the value of the erabLatencyServiceRequestMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabLatencyServiceRequestMax(JAXBElement<Integer> value) {
        this.erabLatencyServiceRequestMax = value;
    }

}
