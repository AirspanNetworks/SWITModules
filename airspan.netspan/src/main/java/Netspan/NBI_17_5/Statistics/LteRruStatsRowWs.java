
package Netspan.NBI_17_5.Statistics;

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
 * &lt;complexType name="LteRruStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumOfDlTbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumOfErrorDlTbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumOfUlTbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumOfErrorUlTbs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPrbUsageForTrafficSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlTotalPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCellUnavailableTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachContentiousAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachUEReportsReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachPreamblesUsageTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCellUnavailableTimeFault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalCellUnavailableTimeManualIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachPreambleDedicatedMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachPreambleGroupAMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachPreambleGroupBMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RruCfiAvg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NumPdcchCceUsed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumPdcchCceAvl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcchCceAvg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UeSpecificAggLvl1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeSpecificAggLvl2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeSpecificAggLvl4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeSpecificAggLvl8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeSpecificAggLvlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommonAggLvl4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommonAggLvl8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CommonAggLvlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcchAggLvlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumCfi1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumCfi2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumCfi3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CfiSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPucchPrbUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RachAttempts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RachSuccess" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RachSuccessRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CellInService" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RruPrbDlFullUtilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RruPrbUlFullUtilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaPCellMacDlDataVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaSCellMacDlDataVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPCellMacUlDataVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaSCellMacUlDataVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRruStatsRowWs", propOrder = {
    "cellNumber",
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
    "rruCfiAvg",
    "numPdcchCceUsed",
    "numPdcchCceAvl",
    "pdcchCceAvg",
    "ueSpecificAggLvl1",
    "ueSpecificAggLvl2",
    "ueSpecificAggLvl4",
    "ueSpecificAggLvl8",
    "ueSpecificAggLvlSum",
    "commonAggLvl4",
    "commonAggLvl8",
    "commonAggLvlSum",
    "pdcchAggLvlSum",
    "numCfi1",
    "numCfi2",
    "numCfi3",
    "cfiSum",
    "ulPucchPrbUsage",
    "rachAttempts",
    "rachSuccess",
    "rachSuccessRate",
    "cellInService",
    "rruPrbDlFullUtilization",
    "rruPrbUlFullUtilization",
    "caPCellMacDlDataVolume",
    "caSCellMacDlDataVolume",
    "caPCellMacUlDataVolume",
    "caSCellMacUlDataVolume"
})
public class LteRruStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "TotalNumOfDlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalNumOfDlTbs;
    @XmlElementRef(name = "TotalNumOfErrorDlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalNumOfErrorDlTbs;
    @XmlElementRef(name = "TotalNumOfUlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalNumOfUlTbs;
    @XmlElementRef(name = "TotalNumOfErrorUlTbs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totalNumOfErrorUlTbs;
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
    @XmlElementRef(name = "NumPdcchCceUsed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numPdcchCceUsed;
    @XmlElementRef(name = "NumPdcchCceAvl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> numPdcchCceAvl;
    @XmlElementRef(name = "PdcchCceAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> pdcchCceAvg;
    @XmlElementRef(name = "UeSpecificAggLvl1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueSpecificAggLvl1;
    @XmlElementRef(name = "UeSpecificAggLvl2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueSpecificAggLvl2;
    @XmlElementRef(name = "UeSpecificAggLvl4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueSpecificAggLvl4;
    @XmlElementRef(name = "UeSpecificAggLvl8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueSpecificAggLvl8;
    @XmlElementRef(name = "UeSpecificAggLvlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueSpecificAggLvlSum;
    @XmlElementRef(name = "CommonAggLvl4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commonAggLvl4;
    @XmlElementRef(name = "CommonAggLvl8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commonAggLvl8;
    @XmlElementRef(name = "CommonAggLvlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commonAggLvlSum;
    @XmlElementRef(name = "PdcchAggLvlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcchAggLvlSum;
    @XmlElementRef(name = "NumCfi1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCfi1;
    @XmlElementRef(name = "NumCfi2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCfi2;
    @XmlElementRef(name = "NumCfi3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numCfi3;
    @XmlElementRef(name = "CfiSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cfiSum;
    @XmlElementRef(name = "UlPucchPrbUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPucchPrbUsage;
    @XmlElementRef(name = "RachAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rachAttempts;
    @XmlElementRef(name = "RachSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rachSuccess;
    @XmlElementRef(name = "RachSuccessRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rachSuccessRate;
    @XmlElementRef(name = "CellInService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cellInService;
    @XmlElementRef(name = "RruPrbDlFullUtilization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rruPrbDlFullUtilization;
    @XmlElementRef(name = "RruPrbUlFullUtilization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rruPrbUlFullUtilization;
    @XmlElementRef(name = "CaPCellMacDlDataVolume", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPCellMacDlDataVolume;
    @XmlElementRef(name = "CaSCellMacDlDataVolume", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caSCellMacDlDataVolume;
    @XmlElementRef(name = "CaPCellMacUlDataVolume", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPCellMacUlDataVolume;
    @XmlElementRef(name = "CaSCellMacUlDataVolume", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caSCellMacUlDataVolume;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<Integer> value) {
        this.cellNumber = value;
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalNumOfDlTbs() {
        return totalNumOfDlTbs;
    }

    /**
     * Sets the value of the totalNumOfDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalNumOfDlTbs(JAXBElement<Long> value) {
        this.totalNumOfDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorDlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalNumOfErrorDlTbs() {
        return totalNumOfErrorDlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorDlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalNumOfErrorDlTbs(JAXBElement<Long> value) {
        this.totalNumOfErrorDlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalNumOfUlTbs() {
        return totalNumOfUlTbs;
    }

    /**
     * Sets the value of the totalNumOfUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalNumOfUlTbs(JAXBElement<Long> value) {
        this.totalNumOfUlTbs = value;
    }

    /**
     * Gets the value of the totalNumOfErrorUlTbs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotalNumOfErrorUlTbs() {
        return totalNumOfErrorUlTbs;
    }

    /**
     * Sets the value of the totalNumOfErrorUlTbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotalNumOfErrorUlTbs(JAXBElement<Long> value) {
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

    /**
     * Gets the value of the numPdcchCceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumPdcchCceUsed() {
        return numPdcchCceUsed;
    }

    /**
     * Sets the value of the numPdcchCceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumPdcchCceUsed(JAXBElement<Integer> value) {
        this.numPdcchCceUsed = value;
    }

    /**
     * Gets the value of the numPdcchCceAvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNumPdcchCceAvl() {
        return numPdcchCceAvl;
    }

    /**
     * Sets the value of the numPdcchCceAvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNumPdcchCceAvl(JAXBElement<Long> value) {
        this.numPdcchCceAvl = value;
    }

    /**
     * Gets the value of the pdcchCceAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPdcchCceAvg() {
        return pdcchCceAvg;
    }

    /**
     * Sets the value of the pdcchCceAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPdcchCceAvg(JAXBElement<Double> value) {
        this.pdcchCceAvg = value;
    }

    /**
     * Gets the value of the ueSpecificAggLvl1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeSpecificAggLvl1() {
        return ueSpecificAggLvl1;
    }

    /**
     * Sets the value of the ueSpecificAggLvl1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeSpecificAggLvl1(JAXBElement<Integer> value) {
        this.ueSpecificAggLvl1 = value;
    }

    /**
     * Gets the value of the ueSpecificAggLvl2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeSpecificAggLvl2() {
        return ueSpecificAggLvl2;
    }

    /**
     * Sets the value of the ueSpecificAggLvl2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeSpecificAggLvl2(JAXBElement<Integer> value) {
        this.ueSpecificAggLvl2 = value;
    }

    /**
     * Gets the value of the ueSpecificAggLvl4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeSpecificAggLvl4() {
        return ueSpecificAggLvl4;
    }

    /**
     * Sets the value of the ueSpecificAggLvl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeSpecificAggLvl4(JAXBElement<Integer> value) {
        this.ueSpecificAggLvl4 = value;
    }

    /**
     * Gets the value of the ueSpecificAggLvl8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeSpecificAggLvl8() {
        return ueSpecificAggLvl8;
    }

    /**
     * Sets the value of the ueSpecificAggLvl8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeSpecificAggLvl8(JAXBElement<Integer> value) {
        this.ueSpecificAggLvl8 = value;
    }

    /**
     * Gets the value of the ueSpecificAggLvlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeSpecificAggLvlSum() {
        return ueSpecificAggLvlSum;
    }

    /**
     * Sets the value of the ueSpecificAggLvlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeSpecificAggLvlSum(JAXBElement<Integer> value) {
        this.ueSpecificAggLvlSum = value;
    }

    /**
     * Gets the value of the commonAggLvl4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommonAggLvl4() {
        return commonAggLvl4;
    }

    /**
     * Sets the value of the commonAggLvl4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommonAggLvl4(JAXBElement<Integer> value) {
        this.commonAggLvl4 = value;
    }

    /**
     * Gets the value of the commonAggLvl8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommonAggLvl8() {
        return commonAggLvl8;
    }

    /**
     * Sets the value of the commonAggLvl8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommonAggLvl8(JAXBElement<Integer> value) {
        this.commonAggLvl8 = value;
    }

    /**
     * Gets the value of the commonAggLvlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommonAggLvlSum() {
        return commonAggLvlSum;
    }

    /**
     * Sets the value of the commonAggLvlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommonAggLvlSum(JAXBElement<Integer> value) {
        this.commonAggLvlSum = value;
    }

    /**
     * Gets the value of the pdcchAggLvlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcchAggLvlSum() {
        return pdcchAggLvlSum;
    }

    /**
     * Sets the value of the pdcchAggLvlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcchAggLvlSum(JAXBElement<Integer> value) {
        this.pdcchAggLvlSum = value;
    }

    /**
     * Gets the value of the numCfi1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCfi1() {
        return numCfi1;
    }

    /**
     * Sets the value of the numCfi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCfi1(JAXBElement<Integer> value) {
        this.numCfi1 = value;
    }

    /**
     * Gets the value of the numCfi2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCfi2() {
        return numCfi2;
    }

    /**
     * Sets the value of the numCfi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCfi2(JAXBElement<Integer> value) {
        this.numCfi2 = value;
    }

    /**
     * Gets the value of the numCfi3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumCfi3() {
        return numCfi3;
    }

    /**
     * Sets the value of the numCfi3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumCfi3(JAXBElement<Integer> value) {
        this.numCfi3 = value;
    }

    /**
     * Gets the value of the cfiSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCfiSum() {
        return cfiSum;
    }

    /**
     * Sets the value of the cfiSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCfiSum(JAXBElement<Integer> value) {
        this.cfiSum = value;
    }

    /**
     * Gets the value of the ulPucchPrbUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPucchPrbUsage() {
        return ulPucchPrbUsage;
    }

    /**
     * Sets the value of the ulPucchPrbUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPucchPrbUsage(JAXBElement<Integer> value) {
        this.ulPucchPrbUsage = value;
    }

    /**
     * Gets the value of the rachAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRachAttempts() {
        return rachAttempts;
    }

    /**
     * Sets the value of the rachAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRachAttempts(JAXBElement<Double> value) {
        this.rachAttempts = value;
    }

    /**
     * Gets the value of the rachSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRachSuccess() {
        return rachSuccess;
    }

    /**
     * Sets the value of the rachSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRachSuccess(JAXBElement<Double> value) {
        this.rachSuccess = value;
    }

    /**
     * Gets the value of the rachSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRachSuccessRate() {
        return rachSuccessRate;
    }

    /**
     * Sets the value of the rachSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRachSuccessRate(JAXBElement<Double> value) {
        this.rachSuccessRate = value;
    }

    /**
     * Gets the value of the cellInService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCellInService() {
        return cellInService;
    }

    /**
     * Sets the value of the cellInService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCellInService(JAXBElement<Long> value) {
        this.cellInService = value;
    }

    /**
     * Gets the value of the rruPrbDlFullUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRruPrbDlFullUtilization() {
        return rruPrbDlFullUtilization;
    }

    /**
     * Sets the value of the rruPrbDlFullUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRruPrbDlFullUtilization(JAXBElement<Integer> value) {
        this.rruPrbDlFullUtilization = value;
    }

    /**
     * Gets the value of the rruPrbUlFullUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRruPrbUlFullUtilization() {
        return rruPrbUlFullUtilization;
    }

    /**
     * Sets the value of the rruPrbUlFullUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRruPrbUlFullUtilization(JAXBElement<Integer> value) {
        this.rruPrbUlFullUtilization = value;
    }

    /**
     * Gets the value of the caPCellMacDlDataVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPCellMacDlDataVolume() {
        return caPCellMacDlDataVolume;
    }

    /**
     * Sets the value of the caPCellMacDlDataVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPCellMacDlDataVolume(JAXBElement<Long> value) {
        this.caPCellMacDlDataVolume = value;
    }

    /**
     * Gets the value of the caSCellMacDlDataVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaSCellMacDlDataVolume() {
        return caSCellMacDlDataVolume;
    }

    /**
     * Sets the value of the caSCellMacDlDataVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaSCellMacDlDataVolume(JAXBElement<Long> value) {
        this.caSCellMacDlDataVolume = value;
    }

    /**
     * Gets the value of the caPCellMacUlDataVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPCellMacUlDataVolume() {
        return caPCellMacUlDataVolume;
    }

    /**
     * Sets the value of the caPCellMacUlDataVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPCellMacUlDataVolume(JAXBElement<Long> value) {
        this.caPCellMacUlDataVolume = value;
    }

    /**
     * Gets the value of the caSCellMacUlDataVolume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaSCellMacUlDataVolume() {
        return caSCellMacUlDataVolume;
    }

    /**
     * Sets the value of the caSCellMacUlDataVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaSCellMacUlDataVolume(JAXBElement<Long> value) {
        this.caSCellMacUlDataVolume = value;
    }

}
