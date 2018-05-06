
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
 * <p>Java class for LteRruStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumOfDlTbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumOfErrorDlTbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumOfUlTbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalNumOfErrorUlTbs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalCellUnavailableTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachContentiousAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachUEReportsReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachPreamblesUsageTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalCellUnavailableTimeFault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalCellUnavailableTimeManualIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachPreambleDedicatedMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachPreambleGroupAMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RachPreambleGroupBMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RruCfiAvg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "rachPreambleGroupBMean",
    "rruCfiAvg"
})
public class LteRruStatsRowWs {

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
    @XmlElementRef(name = "TotalNumOfDlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalNumOfDlTbs;
    @XmlElementRef(name = "TotalNumOfErrorDlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalNumOfErrorDlTbs;
    @XmlElementRef(name = "TotalNumOfUlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalNumOfUlTbs;
    @XmlElementRef(name = "TotalNumOfErrorUlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalNumOfErrorUlTbs;
    @XmlElementRef(name = "DlPrbUsageForTrafficSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlPrbUsageForTrafficSum;
    @XmlElementRef(name = "UlPrbUsageForTrafficSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPrbUsageForTrafficSum;
    @XmlElementRef(name = "DlTotalPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlTotalPrbUsage;
    @XmlElementRef(name = "UlTotalPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulTotalPrbUsage;
    @XmlElementRef(name = "TotalCellUnavailableTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalCellUnavailableTime;
    @XmlElementRef(name = "RachContentiousAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachContentiousAttempts;
    @XmlElementRef(name = "RachUEReportsReceived", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachUEReportsReceived;
    @XmlElementRef(name = "RachPreamblesUsageTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachPreamblesUsageTime;
    @XmlElementRef(name = "TotalCellUnavailableTimeFault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalCellUnavailableTimeFault;
    @XmlElementRef(name = "TotalCellUnavailableTimeManualIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totalCellUnavailableTimeManualIntervention;
    @XmlElementRef(name = "RachPreambleDedicatedMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachPreambleDedicatedMean;
    @XmlElementRef(name = "RachPreambleGroupAMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachPreambleGroupAMean;
    @XmlElementRef(name = "RachPreambleGroupBMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rachPreambleGroupBMean;
    @XmlElementRef(name = "RruCfiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rruCfiAvg;

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
     * Gets the value of the totalNumOfDlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalNumOfDlTbs() {
        return totalNumOfDlTbs;
    }

    /**
     * Sets the value of the totalNumOfDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalNumOfDlTbs(JAXBElement<Integer> value) {
        this.totalNumOfDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorDlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalNumOfErrorDlTbs() {
        return totalNumOfErrorDlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalNumOfErrorDlTbs(JAXBElement<Integer> value) {
        this.totalNumOfErrorDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalNumOfUlTbs() {
        return totalNumOfUlTbs;
    }

    /**
     * Sets the value of the totalNumOfUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalNumOfUlTbs(JAXBElement<Integer> value) {
        this.totalNumOfUlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalNumOfErrorUlTbs() {
        return totalNumOfErrorUlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalNumOfErrorUlTbs(JAXBElement<Integer> value) {
        this.totalNumOfErrorUlTbs = value;
    }

    /**
     * Gets the value of the dlPrbUsageForTrafficSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlPrbUsageForTrafficSum() {
        return dlPrbUsageForTrafficSum;
    }

    /**
     * Sets the value of the dlPrbUsageForTrafficSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlPrbUsageForTrafficSum(JAXBElement<Integer> value) {
        this.dlPrbUsageForTrafficSum = value;
    }

    /**
     * Gets the value of the ulPrbUsageForTrafficSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPrbUsageForTrafficSum() {
        return ulPrbUsageForTrafficSum;
    }

    /**
     * Sets the value of the ulPrbUsageForTrafficSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPrbUsageForTrafficSum(JAXBElement<Integer> value) {
        this.ulPrbUsageForTrafficSum = value;
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
     * Gets the value of the totalCellUnavailableTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalCellUnavailableTime() {
        return totalCellUnavailableTime;
    }

    /**
     * Sets the value of the totalCellUnavailableTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalCellUnavailableTime(JAXBElement<Integer> value) {
        this.totalCellUnavailableTime = value;
    }

    /**
     * Gets the value of the rachContentiousAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachContentiousAttempts() {
        return rachContentiousAttempts;
    }

    /**
     * Sets the value of the rachContentiousAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachContentiousAttempts(JAXBElement<Integer> value) {
        this.rachContentiousAttempts = value;
    }

    /**
     * Gets the value of the rachUEReportsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachUEReportsReceived() {
        return rachUEReportsReceived;
    }

    /**
     * Sets the value of the rachUEReportsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachUEReportsReceived(JAXBElement<Integer> value) {
        this.rachUEReportsReceived = value;
    }

    /**
     * Gets the value of the rachPreamblesUsageTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachPreamblesUsageTime() {
        return rachPreamblesUsageTime;
    }

    /**
     * Sets the value of the rachPreamblesUsageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachPreamblesUsageTime(JAXBElement<Integer> value) {
        this.rachPreamblesUsageTime = value;
    }

    /**
     * Gets the value of the totalCellUnavailableTimeFault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalCellUnavailableTimeFault() {
        return totalCellUnavailableTimeFault;
    }

    /**
     * Sets the value of the totalCellUnavailableTimeFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalCellUnavailableTimeFault(JAXBElement<Integer> value) {
        this.totalCellUnavailableTimeFault = value;
    }

    /**
     * Gets the value of the totalCellUnavailableTimeManualIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalCellUnavailableTimeManualIntervention() {
        return totalCellUnavailableTimeManualIntervention;
    }

    /**
     * Sets the value of the totalCellUnavailableTimeManualIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalCellUnavailableTimeManualIntervention(JAXBElement<Integer> value) {
        this.totalCellUnavailableTimeManualIntervention = value;
    }

    /**
     * Gets the value of the rachPreambleDedicatedMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachPreambleDedicatedMean() {
        return rachPreambleDedicatedMean;
    }

    /**
     * Sets the value of the rachPreambleDedicatedMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachPreambleDedicatedMean(JAXBElement<Integer> value) {
        this.rachPreambleDedicatedMean = value;
    }

    /**
     * Gets the value of the rachPreambleGroupAMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachPreambleGroupAMean() {
        return rachPreambleGroupAMean;
    }

    /**
     * Sets the value of the rachPreambleGroupAMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachPreambleGroupAMean(JAXBElement<Integer> value) {
        this.rachPreambleGroupAMean = value;
    }

    /**
     * Gets the value of the rachPreambleGroupBMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRachPreambleGroupBMean() {
        return rachPreambleGroupBMean;
    }

    /**
     * Sets the value of the rachPreambleGroupBMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRachPreambleGroupBMean(JAXBElement<Integer> value) {
        this.rachPreambleGroupBMean = value;
    }

    /**
     * Gets the value of the rruCfiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRruCfiAvg() {
        return rruCfiAvg;
    }

    /**
     * Sets the value of the rruCfiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRruCfiAvg(JAXBElement<Double> value) {
        this.rruCfiAvg = value;
    }

}
