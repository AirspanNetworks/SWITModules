
package Netspan.NBI_16_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteEquipMeasStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEquipMeasStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EquipMeasMeanProcUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EquipMeasMaxProcUsage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EquipMemoryUsageMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EquipMemoryUsageMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RebootMaintenance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RebootControlled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RebootTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RebootUnplanned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NlSyncNumTimesInit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumTimesLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumTimesNotLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumTimesUnavailabilityTimerExpired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumSecondsInit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumSecondsLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumSecondsNotLocked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumSecondsUnavailabilityTimerExpired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncErrorAll" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncRequestQueueFull" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncL1ResourceUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncL1ResourceGrantCancelled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncRequestRecNotEarlyEnough" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncRequestRecTooEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncRequestDelayedInternally" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNoBchTransmissionInScheduleWindow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncRequestRejectedByRf" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncInternalError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncInvalidRequestMessage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncInvalidServiceHandle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncInvalidClientSpecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncInvalidRequestParameter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncReportCellSyncLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncAllowedFreqOffsetThresholdNotMet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNghCellsNotDetected" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNghCellsTooFar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNoSuitableCells" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NlSyncNumTimesSyncedCellChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SyncStatesHoldOverTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SyncStatesHoldOverExpTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SyncStatesHoldOver" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SyncStatesHoldOverExpired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SyncStatesActiveClockSrcTimePercnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEquipMeasStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "equipMeasMeanProcUsage",
    "equipMeasMaxProcUsage",
    "equipMemoryUsageMean",
    "equipMemoryUsageMax",
    "rebootMaintenance",
    "rebootControlled",
    "rebootTotal",
    "rebootUnplanned",
    "upTime",
    "nlSyncNumTimesInit",
    "nlSyncNumTimesLocked",
    "nlSyncNumTimesNotLocked",
    "nlSyncNumTimesUnavailabilityTimerExpired",
    "nlSyncNumSecondsInit",
    "nlSyncNumSecondsLocked",
    "nlSyncNumSecondsNotLocked",
    "nlSyncNumSecondsUnavailabilityTimerExpired",
    "nlSyncErrorAll",
    "nlSyncRequestQueueFull",
    "nlSyncL1ResourceUnavailable",
    "nlSyncL1ResourceGrantCancelled",
    "nlSyncRequestRecNotEarlyEnough",
    "nlSyncRequestRecTooEarly",
    "nlSyncRequestDelayedInternally",
    "nlSyncNoBchTransmissionInScheduleWindow",
    "nlSyncRequestRejectedByRf",
    "nlSyncInternalError",
    "nlSyncInvalidRequestMessage",
    "nlSyncInvalidServiceHandle",
    "nlSyncInvalidClientSpecified",
    "nlSyncInvalidRequestParameter",
    "nlSyncReportCellSyncLoss",
    "nlSyncAllowedFreqOffsetThresholdNotMet",
    "nlSyncNghCellsNotDetected",
    "nlSyncNghCellsTooFar",
    "nlSyncNoSuitableCells",
    "nlSyncNumTimesSyncedCellChange",
    "syncStatesHoldOverTime",
    "syncStatesHoldOverExpTime",
    "syncStatesHoldOver",
    "syncStatesHoldOverExpired",
    "syncStatesActiveClockSrcTimePercnt"
})
public class LteEquipMeasStatsRowWs {

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
    @XmlElementRef(name = "EquipMeasMeanProcUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> equipMeasMeanProcUsage;
    @XmlElementRef(name = "EquipMeasMaxProcUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> equipMeasMaxProcUsage;
    @XmlElementRef(name = "EquipMemoryUsageMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> equipMemoryUsageMean;
    @XmlElementRef(name = "EquipMemoryUsageMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> equipMemoryUsageMax;
    @XmlElementRef(name = "RebootMaintenance", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rebootMaintenance;
    @XmlElementRef(name = "RebootControlled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rebootControlled;
    @XmlElementRef(name = "RebootTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rebootTotal;
    @XmlElementRef(name = "RebootUnplanned", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rebootUnplanned;
    @XmlElementRef(name = "UpTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> upTime;
    @XmlElementRef(name = "NlSyncNumTimesInit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumTimesInit;
    @XmlElementRef(name = "NlSyncNumTimesLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumTimesLocked;
    @XmlElementRef(name = "NlSyncNumTimesNotLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumTimesNotLocked;
    @XmlElementRef(name = "NlSyncNumTimesUnavailabilityTimerExpired", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumTimesUnavailabilityTimerExpired;
    @XmlElementRef(name = "NlSyncNumSecondsInit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumSecondsInit;
    @XmlElementRef(name = "NlSyncNumSecondsLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumSecondsLocked;
    @XmlElementRef(name = "NlSyncNumSecondsNotLocked", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumSecondsNotLocked;
    @XmlElementRef(name = "NlSyncNumSecondsUnavailabilityTimerExpired", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumSecondsUnavailabilityTimerExpired;
    @XmlElementRef(name = "NlSyncErrorAll", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncErrorAll;
    @XmlElementRef(name = "NlSyncRequestQueueFull", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncRequestQueueFull;
    @XmlElementRef(name = "NlSyncL1ResourceUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncL1ResourceUnavailable;
    @XmlElementRef(name = "NlSyncL1ResourceGrantCancelled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncL1ResourceGrantCancelled;
    @XmlElementRef(name = "NlSyncRequestRecNotEarlyEnough", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncRequestRecNotEarlyEnough;
    @XmlElementRef(name = "NlSyncRequestRecTooEarly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncRequestRecTooEarly;
    @XmlElementRef(name = "NlSyncRequestDelayedInternally", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncRequestDelayedInternally;
    @XmlElementRef(name = "NlSyncNoBchTransmissionInScheduleWindow", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNoBchTransmissionInScheduleWindow;
    @XmlElementRef(name = "NlSyncRequestRejectedByRf", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncRequestRejectedByRf;
    @XmlElementRef(name = "NlSyncInternalError", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncInternalError;
    @XmlElementRef(name = "NlSyncInvalidRequestMessage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncInvalidRequestMessage;
    @XmlElementRef(name = "NlSyncInvalidServiceHandle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncInvalidServiceHandle;
    @XmlElementRef(name = "NlSyncInvalidClientSpecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncInvalidClientSpecified;
    @XmlElementRef(name = "NlSyncInvalidRequestParameter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncInvalidRequestParameter;
    @XmlElementRef(name = "NlSyncReportCellSyncLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncReportCellSyncLoss;
    @XmlElementRef(name = "NlSyncAllowedFreqOffsetThresholdNotMet", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncAllowedFreqOffsetThresholdNotMet;
    @XmlElementRef(name = "NlSyncNghCellsNotDetected", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNghCellsNotDetected;
    @XmlElementRef(name = "NlSyncNghCellsTooFar", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNghCellsTooFar;
    @XmlElementRef(name = "NlSyncNoSuitableCells", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNoSuitableCells;
    @XmlElementRef(name = "NlSyncNumTimesSyncedCellChange", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nlSyncNumTimesSyncedCellChange;
    @XmlElementRef(name = "SyncStatesHoldOverTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncStatesHoldOverTime;
    @XmlElementRef(name = "SyncStatesHoldOverExpTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncStatesHoldOverExpTime;
    @XmlElementRef(name = "SyncStatesHoldOver", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncStatesHoldOver;
    @XmlElementRef(name = "SyncStatesHoldOverExpired", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> syncStatesHoldOverExpired;
    @XmlElement(name = "SyncStatesActiveClockSrcTimePercnt")
    protected String syncStatesActiveClockSrcTimePercnt;

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
     * Gets the value of the equipMeasMeanProcUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEquipMeasMeanProcUsage() {
        return equipMeasMeanProcUsage;
    }

    /**
     * Sets the value of the equipMeasMeanProcUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEquipMeasMeanProcUsage(JAXBElement<Integer> value) {
        this.equipMeasMeanProcUsage = value;
    }

    /**
     * Gets the value of the equipMeasMaxProcUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEquipMeasMaxProcUsage() {
        return equipMeasMaxProcUsage;
    }

    /**
     * Sets the value of the equipMeasMaxProcUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEquipMeasMaxProcUsage(JAXBElement<Integer> value) {
        this.equipMeasMaxProcUsage = value;
    }

    /**
     * Gets the value of the equipMemoryUsageMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEquipMemoryUsageMean() {
        return equipMemoryUsageMean;
    }

    /**
     * Sets the value of the equipMemoryUsageMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEquipMemoryUsageMean(JAXBElement<Integer> value) {
        this.equipMemoryUsageMean = value;
    }

    /**
     * Gets the value of the equipMemoryUsageMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEquipMemoryUsageMax() {
        return equipMemoryUsageMax;
    }

    /**
     * Sets the value of the equipMemoryUsageMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEquipMemoryUsageMax(JAXBElement<Integer> value) {
        this.equipMemoryUsageMax = value;
    }

    /**
     * Gets the value of the rebootMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRebootMaintenance() {
        return rebootMaintenance;
    }

    /**
     * Sets the value of the rebootMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRebootMaintenance(JAXBElement<Integer> value) {
        this.rebootMaintenance = value;
    }

    /**
     * Gets the value of the rebootControlled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRebootControlled() {
        return rebootControlled;
    }

    /**
     * Sets the value of the rebootControlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRebootControlled(JAXBElement<Integer> value) {
        this.rebootControlled = value;
    }

    /**
     * Gets the value of the rebootTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRebootTotal() {
        return rebootTotal;
    }

    /**
     * Sets the value of the rebootTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRebootTotal(JAXBElement<Integer> value) {
        this.rebootTotal = value;
    }

    /**
     * Gets the value of the rebootUnplanned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRebootUnplanned() {
        return rebootUnplanned;
    }

    /**
     * Sets the value of the rebootUnplanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRebootUnplanned(JAXBElement<Integer> value) {
        this.rebootUnplanned = value;
    }

    /**
     * Gets the value of the upTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUpTime() {
        return upTime;
    }

    /**
     * Sets the value of the upTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUpTime(JAXBElement<Long> value) {
        this.upTime = value;
    }

    /**
     * Gets the value of the nlSyncNumTimesInit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumTimesInit() {
        return nlSyncNumTimesInit;
    }

    /**
     * Sets the value of the nlSyncNumTimesInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumTimesInit(JAXBElement<Integer> value) {
        this.nlSyncNumTimesInit = value;
    }

    /**
     * Gets the value of the nlSyncNumTimesLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumTimesLocked() {
        return nlSyncNumTimesLocked;
    }

    /**
     * Sets the value of the nlSyncNumTimesLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumTimesLocked(JAXBElement<Integer> value) {
        this.nlSyncNumTimesLocked = value;
    }

    /**
     * Gets the value of the nlSyncNumTimesNotLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumTimesNotLocked() {
        return nlSyncNumTimesNotLocked;
    }

    /**
     * Sets the value of the nlSyncNumTimesNotLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumTimesNotLocked(JAXBElement<Integer> value) {
        this.nlSyncNumTimesNotLocked = value;
    }

    /**
     * Gets the value of the nlSyncNumTimesUnavailabilityTimerExpired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumTimesUnavailabilityTimerExpired() {
        return nlSyncNumTimesUnavailabilityTimerExpired;
    }

    /**
     * Sets the value of the nlSyncNumTimesUnavailabilityTimerExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumTimesUnavailabilityTimerExpired(JAXBElement<Integer> value) {
        this.nlSyncNumTimesUnavailabilityTimerExpired = value;
    }

    /**
     * Gets the value of the nlSyncNumSecondsInit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumSecondsInit() {
        return nlSyncNumSecondsInit;
    }

    /**
     * Sets the value of the nlSyncNumSecondsInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumSecondsInit(JAXBElement<Integer> value) {
        this.nlSyncNumSecondsInit = value;
    }

    /**
     * Gets the value of the nlSyncNumSecondsLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumSecondsLocked() {
        return nlSyncNumSecondsLocked;
    }

    /**
     * Sets the value of the nlSyncNumSecondsLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumSecondsLocked(JAXBElement<Integer> value) {
        this.nlSyncNumSecondsLocked = value;
    }

    /**
     * Gets the value of the nlSyncNumSecondsNotLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumSecondsNotLocked() {
        return nlSyncNumSecondsNotLocked;
    }

    /**
     * Sets the value of the nlSyncNumSecondsNotLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumSecondsNotLocked(JAXBElement<Integer> value) {
        this.nlSyncNumSecondsNotLocked = value;
    }

    /**
     * Gets the value of the nlSyncNumSecondsUnavailabilityTimerExpired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumSecondsUnavailabilityTimerExpired() {
        return nlSyncNumSecondsUnavailabilityTimerExpired;
    }

    /**
     * Sets the value of the nlSyncNumSecondsUnavailabilityTimerExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumSecondsUnavailabilityTimerExpired(JAXBElement<Integer> value) {
        this.nlSyncNumSecondsUnavailabilityTimerExpired = value;
    }

    /**
     * Gets the value of the nlSyncErrorAll property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncErrorAll() {
        return nlSyncErrorAll;
    }

    /**
     * Sets the value of the nlSyncErrorAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncErrorAll(JAXBElement<Integer> value) {
        this.nlSyncErrorAll = value;
    }

    /**
     * Gets the value of the nlSyncRequestQueueFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncRequestQueueFull() {
        return nlSyncRequestQueueFull;
    }

    /**
     * Sets the value of the nlSyncRequestQueueFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncRequestQueueFull(JAXBElement<Integer> value) {
        this.nlSyncRequestQueueFull = value;
    }

    /**
     * Gets the value of the nlSyncL1ResourceUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncL1ResourceUnavailable() {
        return nlSyncL1ResourceUnavailable;
    }

    /**
     * Sets the value of the nlSyncL1ResourceUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncL1ResourceUnavailable(JAXBElement<Integer> value) {
        this.nlSyncL1ResourceUnavailable = value;
    }

    /**
     * Gets the value of the nlSyncL1ResourceGrantCancelled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncL1ResourceGrantCancelled() {
        return nlSyncL1ResourceGrantCancelled;
    }

    /**
     * Sets the value of the nlSyncL1ResourceGrantCancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncL1ResourceGrantCancelled(JAXBElement<Integer> value) {
        this.nlSyncL1ResourceGrantCancelled = value;
    }

    /**
     * Gets the value of the nlSyncRequestRecNotEarlyEnough property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncRequestRecNotEarlyEnough() {
        return nlSyncRequestRecNotEarlyEnough;
    }

    /**
     * Sets the value of the nlSyncRequestRecNotEarlyEnough property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncRequestRecNotEarlyEnough(JAXBElement<Integer> value) {
        this.nlSyncRequestRecNotEarlyEnough = value;
    }

    /**
     * Gets the value of the nlSyncRequestRecTooEarly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncRequestRecTooEarly() {
        return nlSyncRequestRecTooEarly;
    }

    /**
     * Sets the value of the nlSyncRequestRecTooEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncRequestRecTooEarly(JAXBElement<Integer> value) {
        this.nlSyncRequestRecTooEarly = value;
    }

    /**
     * Gets the value of the nlSyncRequestDelayedInternally property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncRequestDelayedInternally() {
        return nlSyncRequestDelayedInternally;
    }

    /**
     * Sets the value of the nlSyncRequestDelayedInternally property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncRequestDelayedInternally(JAXBElement<Integer> value) {
        this.nlSyncRequestDelayedInternally = value;
    }

    /**
     * Gets the value of the nlSyncNoBchTransmissionInScheduleWindow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNoBchTransmissionInScheduleWindow() {
        return nlSyncNoBchTransmissionInScheduleWindow;
    }

    /**
     * Sets the value of the nlSyncNoBchTransmissionInScheduleWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNoBchTransmissionInScheduleWindow(JAXBElement<Integer> value) {
        this.nlSyncNoBchTransmissionInScheduleWindow = value;
    }

    /**
     * Gets the value of the nlSyncRequestRejectedByRf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncRequestRejectedByRf() {
        return nlSyncRequestRejectedByRf;
    }

    /**
     * Sets the value of the nlSyncRequestRejectedByRf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncRequestRejectedByRf(JAXBElement<Integer> value) {
        this.nlSyncRequestRejectedByRf = value;
    }

    /**
     * Gets the value of the nlSyncInternalError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncInternalError() {
        return nlSyncInternalError;
    }

    /**
     * Sets the value of the nlSyncInternalError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncInternalError(JAXBElement<Integer> value) {
        this.nlSyncInternalError = value;
    }

    /**
     * Gets the value of the nlSyncInvalidRequestMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncInvalidRequestMessage() {
        return nlSyncInvalidRequestMessage;
    }

    /**
     * Sets the value of the nlSyncInvalidRequestMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncInvalidRequestMessage(JAXBElement<Integer> value) {
        this.nlSyncInvalidRequestMessage = value;
    }

    /**
     * Gets the value of the nlSyncInvalidServiceHandle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncInvalidServiceHandle() {
        return nlSyncInvalidServiceHandle;
    }

    /**
     * Sets the value of the nlSyncInvalidServiceHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncInvalidServiceHandle(JAXBElement<Integer> value) {
        this.nlSyncInvalidServiceHandle = value;
    }

    /**
     * Gets the value of the nlSyncInvalidClientSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncInvalidClientSpecified() {
        return nlSyncInvalidClientSpecified;
    }

    /**
     * Sets the value of the nlSyncInvalidClientSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncInvalidClientSpecified(JAXBElement<Integer> value) {
        this.nlSyncInvalidClientSpecified = value;
    }

    /**
     * Gets the value of the nlSyncInvalidRequestParameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncInvalidRequestParameter() {
        return nlSyncInvalidRequestParameter;
    }

    /**
     * Sets the value of the nlSyncInvalidRequestParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncInvalidRequestParameter(JAXBElement<Integer> value) {
        this.nlSyncInvalidRequestParameter = value;
    }

    /**
     * Gets the value of the nlSyncReportCellSyncLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncReportCellSyncLoss() {
        return nlSyncReportCellSyncLoss;
    }

    /**
     * Sets the value of the nlSyncReportCellSyncLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncReportCellSyncLoss(JAXBElement<Integer> value) {
        this.nlSyncReportCellSyncLoss = value;
    }

    /**
     * Gets the value of the nlSyncAllowedFreqOffsetThresholdNotMet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncAllowedFreqOffsetThresholdNotMet() {
        return nlSyncAllowedFreqOffsetThresholdNotMet;
    }

    /**
     * Sets the value of the nlSyncAllowedFreqOffsetThresholdNotMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncAllowedFreqOffsetThresholdNotMet(JAXBElement<Integer> value) {
        this.nlSyncAllowedFreqOffsetThresholdNotMet = value;
    }

    /**
     * Gets the value of the nlSyncNghCellsNotDetected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNghCellsNotDetected() {
        return nlSyncNghCellsNotDetected;
    }

    /**
     * Sets the value of the nlSyncNghCellsNotDetected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNghCellsNotDetected(JAXBElement<Integer> value) {
        this.nlSyncNghCellsNotDetected = value;
    }

    /**
     * Gets the value of the nlSyncNghCellsTooFar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNghCellsTooFar() {
        return nlSyncNghCellsTooFar;
    }

    /**
     * Sets the value of the nlSyncNghCellsTooFar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNghCellsTooFar(JAXBElement<Integer> value) {
        this.nlSyncNghCellsTooFar = value;
    }

    /**
     * Gets the value of the nlSyncNoSuitableCells property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNoSuitableCells() {
        return nlSyncNoSuitableCells;
    }

    /**
     * Sets the value of the nlSyncNoSuitableCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNoSuitableCells(JAXBElement<Integer> value) {
        this.nlSyncNoSuitableCells = value;
    }

    /**
     * Gets the value of the nlSyncNumTimesSyncedCellChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNlSyncNumTimesSyncedCellChange() {
        return nlSyncNumTimesSyncedCellChange;
    }

    /**
     * Sets the value of the nlSyncNumTimesSyncedCellChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNlSyncNumTimesSyncedCellChange(JAXBElement<Integer> value) {
        this.nlSyncNumTimesSyncedCellChange = value;
    }

    /**
     * Gets the value of the syncStatesHoldOverTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncStatesHoldOverTime() {
        return syncStatesHoldOverTime;
    }

    /**
     * Sets the value of the syncStatesHoldOverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncStatesHoldOverTime(JAXBElement<Integer> value) {
        this.syncStatesHoldOverTime = value;
    }

    /**
     * Gets the value of the syncStatesHoldOverExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncStatesHoldOverExpTime() {
        return syncStatesHoldOverExpTime;
    }

    /**
     * Sets the value of the syncStatesHoldOverExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncStatesHoldOverExpTime(JAXBElement<Integer> value) {
        this.syncStatesHoldOverExpTime = value;
    }

    /**
     * Gets the value of the syncStatesHoldOver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncStatesHoldOver() {
        return syncStatesHoldOver;
    }

    /**
     * Sets the value of the syncStatesHoldOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncStatesHoldOver(JAXBElement<Integer> value) {
        this.syncStatesHoldOver = value;
    }

    /**
     * Gets the value of the syncStatesHoldOverExpired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncStatesHoldOverExpired() {
        return syncStatesHoldOverExpired;
    }

    /**
     * Sets the value of the syncStatesHoldOverExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncStatesHoldOverExpired(JAXBElement<Integer> value) {
        this.syncStatesHoldOverExpired = value;
    }

    /**
     * Gets the value of the syncStatesActiveClockSrcTimePercnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncStatesActiveClockSrcTimePercnt() {
        return syncStatesActiveClockSrcTimePercnt;
    }

    /**
     * Sets the value of the syncStatesActiveClockSrcTimePercnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncStatesActiveClockSrcTimePercnt(String value) {
        this.syncStatesActiveClockSrcTimePercnt = value;
    }

}
