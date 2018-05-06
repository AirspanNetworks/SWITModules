
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteRruStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalNumOfDlTbs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalNumOfErrorDlTbs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalNumOfUlTbs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalNumOfErrorUlTbs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalCellUnavailableTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachContentiousAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachUEReportsReceived" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachPreamblesUsageTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalCellUnavailableTimeFault" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TotalCellUnavailableTimeManualIntervention" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachPreambleDedicatedMean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachPreambleGroupAMean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RachPreambleGroupBMean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRruStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "totalNumOfDlTbs",
    "totalNumOfErrorDlTbs",
    "totalNumOfUlTbs",
    "totalNumOfErrorUlTbs",
    "dlPrbUsageForTrafficSum",
    "ulPrbUsageForTrafficSum",
    "dlTotalPrbUsage",
    "ulTotalPrbUsage",
    "totalCellUnavailableTime",
    "rachContentiousAttempts",
    "rachUEReportsReceived",
    "rachPreamblesUsageTime",
    "totalCellUnavailableTimeFault",
    "totalCellUnavailableTimeManualIntervention",
    "rachPreambleDedicatedMean",
    "rachPreambleGroupAMean",
    "rachPreambleGroupBMean"
})
public class LteRruStatsRowWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "TotalNumOfDlTbs", required = true, type = Integer.class, nillable = true)
    protected Integer totalNumOfDlTbs;
    @XmlElement(name = "TotalNumOfErrorDlTbs", required = true, type = Integer.class, nillable = true)
    protected Integer totalNumOfErrorDlTbs;
    @XmlElement(name = "TotalNumOfUlTbs", required = true, type = Integer.class, nillable = true)
    protected Integer totalNumOfUlTbs;
    @XmlElement(name = "TotalNumOfErrorUlTbs", required = true, type = Integer.class, nillable = true)
    protected Integer totalNumOfErrorUlTbs;
    @XmlElement(name = "DlPrbUsageForTrafficSum", required = true, type = Integer.class, nillable = true)
    protected Integer dlPrbUsageForTrafficSum;
    @XmlElement(name = "UlPrbUsageForTrafficSum", required = true, type = Integer.class, nillable = true)
    protected Integer ulPrbUsageForTrafficSum;
    @XmlElement(name = "DlTotalPrbUsage", required = true, type = Integer.class, nillable = true)
    protected Integer dlTotalPrbUsage;
    @XmlElement(name = "UlTotalPrbUsage", required = true, type = Integer.class, nillable = true)
    protected Integer ulTotalPrbUsage;
    @XmlElement(name = "TotalCellUnavailableTime", required = true, type = Integer.class, nillable = true)
    protected Integer totalCellUnavailableTime;
    @XmlElement(name = "RachContentiousAttempts", required = true, type = Integer.class, nillable = true)
    protected Integer rachContentiousAttempts;
    @XmlElement(name = "RachUEReportsReceived", required = true, type = Integer.class, nillable = true)
    protected Integer rachUEReportsReceived;
    @XmlElement(name = "RachPreamblesUsageTime", required = true, type = Integer.class, nillable = true)
    protected Integer rachPreamblesUsageTime;
    @XmlElement(name = "TotalCellUnavailableTimeFault", required = true, type = Integer.class, nillable = true)
    protected Integer totalCellUnavailableTimeFault;
    @XmlElement(name = "TotalCellUnavailableTimeManualIntervention", required = true, type = Integer.class, nillable = true)
    protected Integer totalCellUnavailableTimeManualIntervention;
    @XmlElement(name = "RachPreambleDedicatedMean", required = true, type = Integer.class, nillable = true)
    protected Integer rachPreambleDedicatedMean;
    @XmlElement(name = "RachPreambleGroupAMean", required = true, type = Integer.class, nillable = true)
    protected Integer rachPreambleGroupAMean;
    @XmlElement(name = "RachPreambleGroupBMean", required = true, type = Integer.class, nillable = true)
    protected Integer rachPreambleGroupBMean;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellId(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGranularityPeriod(Integer value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the totalNumOfDlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfDlTbs() {
        return totalNumOfDlTbs;
    }

    /**
     * Sets the value of the totalNumOfDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfDlTbs(Integer value) {
        this.totalNumOfDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorDlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfErrorDlTbs() {
        return totalNumOfErrorDlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfErrorDlTbs(Integer value) {
        this.totalNumOfErrorDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfUlTbs() {
        return totalNumOfUlTbs;
    }

    /**
     * Sets the value of the totalNumOfUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfUlTbs(Integer value) {
        this.totalNumOfUlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumOfErrorUlTbs() {
        return totalNumOfErrorUlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumOfErrorUlTbs(Integer value) {
        this.totalNumOfErrorUlTbs = value;
    }

    /**
     * Gets the value of the dlPrbUsageForTrafficSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlPrbUsageForTrafficSum() {
        return dlPrbUsageForTrafficSum;
    }

    /**
     * Sets the value of the dlPrbUsageForTrafficSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlPrbUsageForTrafficSum(Integer value) {
        this.dlPrbUsageForTrafficSum = value;
    }

    /**
     * Gets the value of the ulPrbUsageForTrafficSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlPrbUsageForTrafficSum() {
        return ulPrbUsageForTrafficSum;
    }

    /**
     * Sets the value of the ulPrbUsageForTrafficSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlPrbUsageForTrafficSum(Integer value) {
        this.ulPrbUsageForTrafficSum = value;
    }

    /**
     * Gets the value of the dlTotalPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlTotalPrbUsage() {
        return dlTotalPrbUsage;
    }

    /**
     * Sets the value of the dlTotalPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlTotalPrbUsage(Integer value) {
        this.dlTotalPrbUsage = value;
    }

    /**
     * Gets the value of the ulTotalPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlTotalPrbUsage() {
        return ulTotalPrbUsage;
    }

    /**
     * Sets the value of the ulTotalPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlTotalPrbUsage(Integer value) {
        this.ulTotalPrbUsage = value;
    }

    /**
     * Gets the value of the totalCellUnavailableTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCellUnavailableTime() {
        return totalCellUnavailableTime;
    }

    /**
     * Sets the value of the totalCellUnavailableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCellUnavailableTime(Integer value) {
        this.totalCellUnavailableTime = value;
    }

    /**
     * Gets the value of the rachContentiousAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachContentiousAttempts() {
        return rachContentiousAttempts;
    }

    /**
     * Sets the value of the rachContentiousAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachContentiousAttempts(Integer value) {
        this.rachContentiousAttempts = value;
    }

    /**
     * Gets the value of the rachUEReportsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachUEReportsReceived() {
        return rachUEReportsReceived;
    }

    /**
     * Sets the value of the rachUEReportsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachUEReportsReceived(Integer value) {
        this.rachUEReportsReceived = value;
    }

    /**
     * Gets the value of the rachPreamblesUsageTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachPreamblesUsageTime() {
        return rachPreamblesUsageTime;
    }

    /**
     * Sets the value of the rachPreamblesUsageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachPreamblesUsageTime(Integer value) {
        this.rachPreamblesUsageTime = value;
    }

    /**
     * Gets the value of the totalCellUnavailableTimeFault property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCellUnavailableTimeFault() {
        return totalCellUnavailableTimeFault;
    }

    /**
     * Sets the value of the totalCellUnavailableTimeFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCellUnavailableTimeFault(Integer value) {
        this.totalCellUnavailableTimeFault = value;
    }

    /**
     * Gets the value of the totalCellUnavailableTimeManualIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCellUnavailableTimeManualIntervention() {
        return totalCellUnavailableTimeManualIntervention;
    }

    /**
     * Sets the value of the totalCellUnavailableTimeManualIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCellUnavailableTimeManualIntervention(Integer value) {
        this.totalCellUnavailableTimeManualIntervention = value;
    }

    /**
     * Gets the value of the rachPreambleDedicatedMean property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachPreambleDedicatedMean() {
        return rachPreambleDedicatedMean;
    }

    /**
     * Sets the value of the rachPreambleDedicatedMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachPreambleDedicatedMean(Integer value) {
        this.rachPreambleDedicatedMean = value;
    }

    /**
     * Gets the value of the rachPreambleGroupAMean property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachPreambleGroupAMean() {
        return rachPreambleGroupAMean;
    }

    /**
     * Sets the value of the rachPreambleGroupAMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachPreambleGroupAMean(Integer value) {
        this.rachPreambleGroupAMean = value;
    }

    /**
     * Gets the value of the rachPreambleGroupBMean property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRachPreambleGroupBMean() {
        return rachPreambleGroupBMean;
    }

    /**
     * Sets the value of the rachPreambleGroupBMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRachPreambleGroupBMean(Integer value) {
        this.rachPreambleGroupBMean = value;
    }

}
