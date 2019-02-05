
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellNeighborManagementWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellNeighborManagementWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnDurationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnDurationTimer" type="{http://Airspan.Netspan.WebServices}AnrDurationTimer" minOccurs="0"/&gt;
 *         &lt;element name="DrxInactivityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DrxInactivityTimer" type="{http://Airspan.Netspan.WebServices}InactivityTimer" minOccurs="0"/&gt;
 *         &lt;element name="DrxRetransmissionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DrxRetransmissionTimer" type="{http://Airspan.Netspan.WebServices}RetransmissionTimer" minOccurs="0"/&gt;
 *         &lt;element name="LongDrxCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LongDrxCycle" type="{http://Airspan.Netspan.WebServices}DrxCycle" minOccurs="0"/&gt;
 *         &lt;element name="RsrpThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RsrpThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxReportCellsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxReportCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportInterval" type="{http://Airspan.Netspan.WebServices}MobilityReportInterval" minOccurs="0"/&gt;
 *         &lt;element name="ReportAmountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportAmount" type="{http://Airspan.Netspan.WebServices}MobilityReportAmount" minOccurs="0"/&gt;
 *         &lt;element name="CgiReportMcsThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CgiReportMcsThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CgiRsrpIntraFreqThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CgiRsrpIntraFreqThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NghRemoveThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NghRemoveThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AnrMeasuringUesThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AnrMeasuringUesThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialPiMetricIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InitialPiMetric" type="{http://Airspan.Netspan.WebServices}InitialPiMetricValues" minOccurs="0"/&gt;
 *         &lt;element name="HoAttemptsThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoAttemptsThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPciToQueryForCgiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPciToQueryForCgi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellNeighborManagementWs", propOrder = {
    "onDurationTimerIsDefault",
    "onDurationTimer",
    "drxInactivityTimerIsDefault",
    "drxInactivityTimer",
    "drxRetransmissionTimerIsDefault",
    "drxRetransmissionTimer",
    "longDrxCycleIsDefault",
    "longDrxCycle",
    "rsrpThresholdIsDefault",
    "rsrpThreshold",
    "maxReportCellsIsDefault",
    "maxReportCells",
    "reportIntervalIsDefault",
    "reportInterval",
    "reportAmountIsDefault",
    "reportAmount",
    "cgiReportMcsThresholdIsDefault",
    "cgiReportMcsThreshold",
    "cgiRsrpIntraFreqThresholdIsDefault",
    "cgiRsrpIntraFreqThreshold",
    "nghRemoveThresholdIsDefault",
    "nghRemoveThreshold",
    "anrMeasuringUesThresholdIsDefault",
    "anrMeasuringUesThreshold",
    "initialPiMetricIsDefault",
    "initialPiMetric",
    "hoAttemptsThresholdIsDefault",
    "hoAttemptsThreshold",
    "numberOfPciToQueryForCgiIsDefault",
    "numberOfPciToQueryForCgi"
})
public class CellNeighborManagementWs {

    @XmlElementRef(name = "OnDurationTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> onDurationTimerIsDefault;
    @XmlElementRef(name = "OnDurationTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onDurationTimer;
    @XmlElementRef(name = "DrxInactivityTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> drxInactivityTimerIsDefault;
    @XmlElementRef(name = "DrxInactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxInactivityTimer;
    @XmlElementRef(name = "DrxRetransmissionTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> drxRetransmissionTimerIsDefault;
    @XmlElementRef(name = "DrxRetransmissionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxRetransmissionTimer;
    @XmlElementRef(name = "LongDrxCycleIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> longDrxCycleIsDefault;
    @XmlElementRef(name = "LongDrxCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longDrxCycle;
    @XmlElementRef(name = "RsrpThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rsrpThresholdIsDefault;
    @XmlElementRef(name = "RsrpThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rsrpThreshold;
    @XmlElementRef(name = "MaxReportCellsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxReportCellsIsDefault;
    @XmlElementRef(name = "MaxReportCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxReportCells;
    @XmlElementRef(name = "ReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportIntervalIsDefault;
    @XmlElementRef(name = "ReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportInterval;
    @XmlElementRef(name = "ReportAmountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> reportAmountIsDefault;
    @XmlElementRef(name = "ReportAmount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportAmount;
    @XmlElementRef(name = "CgiReportMcsThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cgiReportMcsThresholdIsDefault;
    @XmlElementRef(name = "CgiReportMcsThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cgiReportMcsThreshold;
    @XmlElementRef(name = "CgiRsrpIntraFreqThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cgiRsrpIntraFreqThresholdIsDefault;
    @XmlElementRef(name = "CgiRsrpIntraFreqThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cgiRsrpIntraFreqThreshold;
    @XmlElementRef(name = "NghRemoveThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nghRemoveThresholdIsDefault;
    @XmlElementRef(name = "NghRemoveThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nghRemoveThreshold;
    @XmlElementRef(name = "AnrMeasuringUesThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> anrMeasuringUesThresholdIsDefault;
    @XmlElementRef(name = "AnrMeasuringUesThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> anrMeasuringUesThreshold;
    @XmlElementRef(name = "InitialPiMetricIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> initialPiMetricIsDefault;
    @XmlElementRef(name = "InitialPiMetric", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initialPiMetric;
    @XmlElementRef(name = "HoAttemptsThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoAttemptsThresholdIsDefault;
    @XmlElementRef(name = "HoAttemptsThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoAttemptsThreshold;
    @XmlElementRef(name = "NumberOfPciToQueryForCgiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberOfPciToQueryForCgiIsDefault;
    @XmlElementRef(name = "NumberOfPciToQueryForCgi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfPciToQueryForCgi;

    /**
     * Gets the value of the onDurationTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOnDurationTimerIsDefault() {
        return onDurationTimerIsDefault;
    }

    /**
     * Sets the value of the onDurationTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOnDurationTimerIsDefault(JAXBElement<Boolean> value) {
        this.onDurationTimerIsDefault = value;
    }

    /**
     * Gets the value of the onDurationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnDurationTimer() {
        return onDurationTimer;
    }

    /**
     * Sets the value of the onDurationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnDurationTimer(JAXBElement<String> value) {
        this.onDurationTimer = value;
    }

    /**
     * Gets the value of the drxInactivityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDrxInactivityTimerIsDefault() {
        return drxInactivityTimerIsDefault;
    }

    /**
     * Sets the value of the drxInactivityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDrxInactivityTimerIsDefault(JAXBElement<Boolean> value) {
        this.drxInactivityTimerIsDefault = value;
    }

    /**
     * Gets the value of the drxInactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxInactivityTimer() {
        return drxInactivityTimer;
    }

    /**
     * Sets the value of the drxInactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxInactivityTimer(JAXBElement<String> value) {
        this.drxInactivityTimer = value;
    }

    /**
     * Gets the value of the drxRetransmissionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDrxRetransmissionTimerIsDefault() {
        return drxRetransmissionTimerIsDefault;
    }

    /**
     * Sets the value of the drxRetransmissionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDrxRetransmissionTimerIsDefault(JAXBElement<Boolean> value) {
        this.drxRetransmissionTimerIsDefault = value;
    }

    /**
     * Gets the value of the drxRetransmissionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxRetransmissionTimer() {
        return drxRetransmissionTimer;
    }

    /**
     * Sets the value of the drxRetransmissionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxRetransmissionTimer(JAXBElement<String> value) {
        this.drxRetransmissionTimer = value;
    }

    /**
     * Gets the value of the longDrxCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLongDrxCycleIsDefault() {
        return longDrxCycleIsDefault;
    }

    /**
     * Sets the value of the longDrxCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLongDrxCycleIsDefault(JAXBElement<Boolean> value) {
        this.longDrxCycleIsDefault = value;
    }

    /**
     * Gets the value of the longDrxCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongDrxCycle() {
        return longDrxCycle;
    }

    /**
     * Sets the value of the longDrxCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongDrxCycle(JAXBElement<String> value) {
        this.longDrxCycle = value;
    }

    /**
     * Gets the value of the rsrpThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRsrpThresholdIsDefault() {
        return rsrpThresholdIsDefault;
    }

    /**
     * Sets the value of the rsrpThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRsrpThresholdIsDefault(JAXBElement<Boolean> value) {
        this.rsrpThresholdIsDefault = value;
    }

    /**
     * Gets the value of the rsrpThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRsrpThreshold() {
        return rsrpThreshold;
    }

    /**
     * Sets the value of the rsrpThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRsrpThreshold(JAXBElement<Integer> value) {
        this.rsrpThreshold = value;
    }

    /**
     * Gets the value of the maxReportCellsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxReportCellsIsDefault() {
        return maxReportCellsIsDefault;
    }

    /**
     * Sets the value of the maxReportCellsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxReportCellsIsDefault(JAXBElement<Boolean> value) {
        this.maxReportCellsIsDefault = value;
    }

    /**
     * Gets the value of the maxReportCells property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxReportCells() {
        return maxReportCells;
    }

    /**
     * Sets the value of the maxReportCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxReportCells(JAXBElement<Integer> value) {
        this.maxReportCells = value;
    }

    /**
     * Gets the value of the reportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReportIntervalIsDefault() {
        return reportIntervalIsDefault;
    }

    /**
     * Sets the value of the reportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.reportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the reportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportInterval() {
        return reportInterval;
    }

    /**
     * Sets the value of the reportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportInterval(JAXBElement<String> value) {
        this.reportInterval = value;
    }

    /**
     * Gets the value of the reportAmountIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReportAmountIsDefault() {
        return reportAmountIsDefault;
    }

    /**
     * Sets the value of the reportAmountIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReportAmountIsDefault(JAXBElement<Boolean> value) {
        this.reportAmountIsDefault = value;
    }

    /**
     * Gets the value of the reportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportAmount() {
        return reportAmount;
    }

    /**
     * Sets the value of the reportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportAmount(JAXBElement<String> value) {
        this.reportAmount = value;
    }

    /**
     * Gets the value of the cgiReportMcsThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCgiReportMcsThresholdIsDefault() {
        return cgiReportMcsThresholdIsDefault;
    }

    /**
     * Sets the value of the cgiReportMcsThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCgiReportMcsThresholdIsDefault(JAXBElement<Boolean> value) {
        this.cgiReportMcsThresholdIsDefault = value;
    }

    /**
     * Gets the value of the cgiReportMcsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCgiReportMcsThreshold() {
        return cgiReportMcsThreshold;
    }

    /**
     * Sets the value of the cgiReportMcsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCgiReportMcsThreshold(JAXBElement<Integer> value) {
        this.cgiReportMcsThreshold = value;
    }

    /**
     * Gets the value of the cgiRsrpIntraFreqThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCgiRsrpIntraFreqThresholdIsDefault() {
        return cgiRsrpIntraFreqThresholdIsDefault;
    }

    /**
     * Sets the value of the cgiRsrpIntraFreqThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCgiRsrpIntraFreqThresholdIsDefault(JAXBElement<Boolean> value) {
        this.cgiRsrpIntraFreqThresholdIsDefault = value;
    }

    /**
     * Gets the value of the cgiRsrpIntraFreqThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCgiRsrpIntraFreqThreshold() {
        return cgiRsrpIntraFreqThreshold;
    }

    /**
     * Sets the value of the cgiRsrpIntraFreqThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCgiRsrpIntraFreqThreshold(JAXBElement<Integer> value) {
        this.cgiRsrpIntraFreqThreshold = value;
    }

    /**
     * Gets the value of the nghRemoveThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNghRemoveThresholdIsDefault() {
        return nghRemoveThresholdIsDefault;
    }

    /**
     * Sets the value of the nghRemoveThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNghRemoveThresholdIsDefault(JAXBElement<Boolean> value) {
        this.nghRemoveThresholdIsDefault = value;
    }

    /**
     * Gets the value of the nghRemoveThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNghRemoveThreshold() {
        return nghRemoveThreshold;
    }

    /**
     * Sets the value of the nghRemoveThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNghRemoveThreshold(JAXBElement<Integer> value) {
        this.nghRemoveThreshold = value;
    }

    /**
     * Gets the value of the anrMeasuringUesThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAnrMeasuringUesThresholdIsDefault() {
        return anrMeasuringUesThresholdIsDefault;
    }

    /**
     * Sets the value of the anrMeasuringUesThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAnrMeasuringUesThresholdIsDefault(JAXBElement<Boolean> value) {
        this.anrMeasuringUesThresholdIsDefault = value;
    }

    /**
     * Gets the value of the anrMeasuringUesThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnrMeasuringUesThreshold() {
        return anrMeasuringUesThreshold;
    }

    /**
     * Sets the value of the anrMeasuringUesThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnrMeasuringUesThreshold(JAXBElement<Integer> value) {
        this.anrMeasuringUesThreshold = value;
    }

    /**
     * Gets the value of the initialPiMetricIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInitialPiMetricIsDefault() {
        return initialPiMetricIsDefault;
    }

    /**
     * Sets the value of the initialPiMetricIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInitialPiMetricIsDefault(JAXBElement<Boolean> value) {
        this.initialPiMetricIsDefault = value;
    }

    /**
     * Gets the value of the initialPiMetric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialPiMetric() {
        return initialPiMetric;
    }

    /**
     * Sets the value of the initialPiMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialPiMetric(JAXBElement<String> value) {
        this.initialPiMetric = value;
    }

    /**
     * Gets the value of the hoAttemptsThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoAttemptsThresholdIsDefault() {
        return hoAttemptsThresholdIsDefault;
    }

    /**
     * Sets the value of the hoAttemptsThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoAttemptsThresholdIsDefault(JAXBElement<Boolean> value) {
        this.hoAttemptsThresholdIsDefault = value;
    }

    /**
     * Gets the value of the hoAttemptsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoAttemptsThreshold() {
        return hoAttemptsThreshold;
    }

    /**
     * Sets the value of the hoAttemptsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoAttemptsThreshold(JAXBElement<Integer> value) {
        this.hoAttemptsThreshold = value;
    }

    /**
     * Gets the value of the numberOfPciToQueryForCgiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberOfPciToQueryForCgiIsDefault() {
        return numberOfPciToQueryForCgiIsDefault;
    }

    /**
     * Sets the value of the numberOfPciToQueryForCgiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberOfPciToQueryForCgiIsDefault(JAXBElement<Boolean> value) {
        this.numberOfPciToQueryForCgiIsDefault = value;
    }

    /**
     * Gets the value of the numberOfPciToQueryForCgi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfPciToQueryForCgi() {
        return numberOfPciToQueryForCgi;
    }

    /**
     * Sets the value of the numberOfPciToQueryForCgi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfPciToQueryForCgi(JAXBElement<Integer> value) {
        this.numberOfPciToQueryForCgi = value;
    }

}
