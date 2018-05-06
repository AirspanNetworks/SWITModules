
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteERabStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteERabStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialAttemptedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialSuccessfullyEstablishedSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupRadIntProcFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupQciValNotSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupS1IntraSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupS1InterSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupX2HOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalAttemptedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalSuccessfullyEstablishedSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupQciValNotSupported" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupS1IntraSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupS1InterSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalFailedToSetupX2HOTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseRadResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseRelDueToEutranReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseUserInactivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseRadConnWithUeLost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerCauseOamIntervention" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttemptedToReleaseSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuccessfullyReleasedSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToReleaseSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToReleaseUnknownERabId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToReleaseHOFailureInTargetSystem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToReleaseUnknownAllocatedMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToReleaseUnknownAllocatedEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfReleasedActiveSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttemptedToModifyQosSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuccessfullyModifiedQosSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosUnknownERabId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FailedToModifyQosInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSessionActivityTimeForUe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSessionActivityTimeForERabSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SimultaneousERabAvgSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SimultaneousERabMaxSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteERabStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "initialAttemptedToSetupSum",
    "initialSuccessfullyEstablishedSum",
    "initialFailedToSetupSum",
    "initialFailedToSetupRadioResUnavailable",
    "initialFailedToSetupRadIntProcFailure",
    "initialFailedToSetupInvalidQosCombination",
    "initialFailedToSetupMultiERabIdInstances",
    "initialFailedToSetupQciValNotSupported",
    "initialFailedToSetupS1IntraSysHOTriggered",
    "initialFailedToSetupS1InterSysHOTriggered",
    "initialFailedToSetupX2HOTriggered",
    "initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd",
    "additionalAttemptedToSetupSum",
    "additionalSuccessfullyEstablishedSum",
    "additionalFailedToSetupSum",
    "additionalFailedToSetupRadioResUnavailable",
    "additionalFailedToSetupRadIntfProcFailure",
    "additionalFailedToSetupInvalidQosCombination",
    "additionalFailedToSetupMultiERabIdInstances",
    "additionalFailedToSetupQciValNotSupported",
    "additionalFailedToSetupS1IntraSysHOTriggered",
    "additionalFailedToSetupS1InterSysHOTriggered",
    "additionalFailedToSetupX2HOTriggered",
    "reqToReleasePerCauseSum",
    "reqToReleasePerCauseRadResUnavailable",
    "reqToReleasePerCauseRadIntfProcFailure",
    "reqToReleasePerCauseReduceLoadInServingCell",
    "reqToReleasePerCauseRelDueToEutranReasons",
    "reqToReleasePerCauseUserInactivity",
    "reqToReleasePerCauseRadConnWithUeLost",
    "reqToReleasePerCauseOamIntervention",
    "attemptedToReleaseSum",
    "successfullyReleasedSum",
    "failedToReleaseSum",
    "failedToReleaseUnknownERabId",
    "failedToReleaseHOFailureInTargetSystem",
    "failedToReleaseUnknownAllocatedMmeUeS1ApId",
    "failedToReleaseUnknownAllocatedEnbUeS1ApId",
    "numberOfReleasedActiveSum",
    "attemptedToModifyQosSum",
    "successfullyModifiedQosSum",
    "failedToModifyQosSum",
    "failedToModifyQosUnknownERabId",
    "failedToModifyQosMultiERabIdInstances",
    "failedToModifyQosRadioResUnavailable",
    "failedToModifyQosRadIntfProcFailure",
    "failedToModifyQosInvalidQosCombination",
    "inSessionActivityTimeForUe",
    "inSessionActivityTimeForERabSum",
    "simultaneousERabAvgSum",
    "simultaneousERabMaxSum"
})
public class LteERabStatsRowWs {

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
    @XmlElement(name = "InitialAttemptedToSetupSum", required = true, type = Integer.class, nillable = true)
    protected Integer initialAttemptedToSetupSum;
    @XmlElement(name = "InitialSuccessfullyEstablishedSum", required = true, type = Integer.class, nillable = true)
    protected Integer initialSuccessfullyEstablishedSum;
    @XmlElement(name = "InitialFailedToSetupSum", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupSum;
    @XmlElement(name = "InitialFailedToSetupRadioResUnavailable", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupRadioResUnavailable;
    @XmlElement(name = "InitialFailedToSetupRadIntProcFailure", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupRadIntProcFailure;
    @XmlElement(name = "InitialFailedToSetupInvalidQosCombination", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupInvalidQosCombination;
    @XmlElement(name = "InitialFailedToSetupMultiERabIdInstances", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupMultiERabIdInstances;
    @XmlElement(name = "InitialFailedToSetupQciValNotSupported", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupQciValNotSupported;
    @XmlElement(name = "InitialFailedToSetupS1IntraSysHOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupS1IntraSysHOTriggered;
    @XmlElement(name = "InitialFailedToSetupS1InterSysHOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupS1InterSysHOTriggered;
    @XmlElement(name = "InitialFailedToSetupX2HOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupX2HOTriggered;
    @XmlElement(name = "InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd", required = true, type = Integer.class, nillable = true)
    protected Integer initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd;
    @XmlElement(name = "AdditionalAttemptedToSetupSum", required = true, type = Integer.class, nillable = true)
    protected Integer additionalAttemptedToSetupSum;
    @XmlElement(name = "AdditionalSuccessfullyEstablishedSum", required = true, type = Integer.class, nillable = true)
    protected Integer additionalSuccessfullyEstablishedSum;
    @XmlElement(name = "AdditionalFailedToSetupSum", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupSum;
    @XmlElement(name = "AdditionalFailedToSetupRadioResUnavailable", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupRadioResUnavailable;
    @XmlElement(name = "AdditionalFailedToSetupRadIntfProcFailure", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupRadIntfProcFailure;
    @XmlElement(name = "AdditionalFailedToSetupInvalidQosCombination", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupInvalidQosCombination;
    @XmlElement(name = "AdditionalFailedToSetupMultiERabIdInstances", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupMultiERabIdInstances;
    @XmlElement(name = "AdditionalFailedToSetupQciValNotSupported", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupQciValNotSupported;
    @XmlElement(name = "AdditionalFailedToSetupS1IntraSysHOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupS1IntraSysHOTriggered;
    @XmlElement(name = "AdditionalFailedToSetupS1InterSysHOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupS1InterSysHOTriggered;
    @XmlElement(name = "AdditionalFailedToSetupX2HOTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer additionalFailedToSetupX2HOTriggered;
    @XmlElement(name = "ReqToReleasePerCauseSum", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseSum;
    @XmlElement(name = "ReqToReleasePerCauseRadResUnavailable", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseRadResUnavailable;
    @XmlElement(name = "ReqToReleasePerCauseRadIntfProcFailure", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseRadIntfProcFailure;
    @XmlElement(name = "ReqToReleasePerCauseReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseReduceLoadInServingCell;
    @XmlElement(name = "ReqToReleasePerCauseRelDueToEutranReasons", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseRelDueToEutranReasons;
    @XmlElement(name = "ReqToReleasePerCauseUserInactivity", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseUserInactivity;
    @XmlElement(name = "ReqToReleasePerCauseRadConnWithUeLost", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseRadConnWithUeLost;
    @XmlElement(name = "ReqToReleasePerCauseOamIntervention", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerCauseOamIntervention;
    @XmlElement(name = "AttemptedToReleaseSum", required = true, type = Integer.class, nillable = true)
    protected Integer attemptedToReleaseSum;
    @XmlElement(name = "SuccessfullyReleasedSum", required = true, type = Integer.class, nillable = true)
    protected Integer successfullyReleasedSum;
    @XmlElement(name = "FailedToReleaseSum", required = true, type = Integer.class, nillable = true)
    protected Integer failedToReleaseSum;
    @XmlElement(name = "FailedToReleaseUnknownERabId", required = true, type = Integer.class, nillable = true)
    protected Integer failedToReleaseUnknownERabId;
    @XmlElement(name = "FailedToReleaseHOFailureInTargetSystem", required = true, type = Integer.class, nillable = true)
    protected Integer failedToReleaseHOFailureInTargetSystem;
    @XmlElement(name = "FailedToReleaseUnknownAllocatedMmeUeS1apId", required = true, type = Integer.class, nillable = true)
    protected Integer failedToReleaseUnknownAllocatedMmeUeS1ApId;
    @XmlElement(name = "FailedToReleaseUnknownAllocatedEnbUeS1apId", required = true, type = Integer.class, nillable = true)
    protected Integer failedToReleaseUnknownAllocatedEnbUeS1ApId;
    @XmlElement(name = "NumberOfReleasedActiveSum", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfReleasedActiveSum;
    @XmlElement(name = "AttemptedToModifyQosSum", required = true, type = Integer.class, nillable = true)
    protected Integer attemptedToModifyQosSum;
    @XmlElement(name = "SuccessfullyModifiedQosSum", required = true, type = Integer.class, nillable = true)
    protected Integer successfullyModifiedQosSum;
    @XmlElement(name = "FailedToModifyQosSum", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosSum;
    @XmlElement(name = "FailedToModifyQosUnknownERabId", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosUnknownERabId;
    @XmlElement(name = "FailedToModifyQosMultiERabIdInstances", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosMultiERabIdInstances;
    @XmlElement(name = "FailedToModifyQosRadioResUnavailable", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosRadioResUnavailable;
    @XmlElement(name = "FailedToModifyQosRadIntfProcFailure", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosRadIntfProcFailure;
    @XmlElement(name = "FailedToModifyQosInvalidQosCombination", required = true, type = Integer.class, nillable = true)
    protected Integer failedToModifyQosInvalidQosCombination;
    @XmlElement(name = "InSessionActivityTimeForUe", required = true, type = Integer.class, nillable = true)
    protected Integer inSessionActivityTimeForUe;
    @XmlElement(name = "InSessionActivityTimeForERabSum", required = true, type = Integer.class, nillable = true)
    protected Integer inSessionActivityTimeForERabSum;
    @XmlElement(name = "SimultaneousERabAvgSum", required = true, type = Integer.class, nillable = true)
    protected Integer simultaneousERabAvgSum;
    @XmlElement(name = "SimultaneousERabMaxSum", required = true, type = Integer.class, nillable = true)
    protected Integer simultaneousERabMaxSum;

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
     * Gets the value of the initialAttemptedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialAttemptedToSetupSum() {
        return initialAttemptedToSetupSum;
    }

    /**
     * Sets the value of the initialAttemptedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialAttemptedToSetupSum(Integer value) {
        this.initialAttemptedToSetupSum = value;
    }

    /**
     * Gets the value of the initialSuccessfullyEstablishedSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialSuccessfullyEstablishedSum() {
        return initialSuccessfullyEstablishedSum;
    }

    /**
     * Sets the value of the initialSuccessfullyEstablishedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialSuccessfullyEstablishedSum(Integer value) {
        this.initialSuccessfullyEstablishedSum = value;
    }

    /**
     * Gets the value of the initialFailedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupSum() {
        return initialFailedToSetupSum;
    }

    /**
     * Sets the value of the initialFailedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupSum(Integer value) {
        this.initialFailedToSetupSum = value;
    }

    /**
     * Gets the value of the initialFailedToSetupRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupRadioResUnavailable() {
        return initialFailedToSetupRadioResUnavailable;
    }

    /**
     * Sets the value of the initialFailedToSetupRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupRadioResUnavailable(Integer value) {
        this.initialFailedToSetupRadioResUnavailable = value;
    }

    /**
     * Gets the value of the initialFailedToSetupRadIntProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupRadIntProcFailure() {
        return initialFailedToSetupRadIntProcFailure;
    }

    /**
     * Sets the value of the initialFailedToSetupRadIntProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupRadIntProcFailure(Integer value) {
        this.initialFailedToSetupRadIntProcFailure = value;
    }

    /**
     * Gets the value of the initialFailedToSetupInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupInvalidQosCombination() {
        return initialFailedToSetupInvalidQosCombination;
    }

    /**
     * Sets the value of the initialFailedToSetupInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupInvalidQosCombination(Integer value) {
        this.initialFailedToSetupInvalidQosCombination = value;
    }

    /**
     * Gets the value of the initialFailedToSetupMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupMultiERabIdInstances() {
        return initialFailedToSetupMultiERabIdInstances;
    }

    /**
     * Sets the value of the initialFailedToSetupMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupMultiERabIdInstances(Integer value) {
        this.initialFailedToSetupMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the initialFailedToSetupQciValNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupQciValNotSupported() {
        return initialFailedToSetupQciValNotSupported;
    }

    /**
     * Sets the value of the initialFailedToSetupQciValNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupQciValNotSupported(Integer value) {
        this.initialFailedToSetupQciValNotSupported = value;
    }

    /**
     * Gets the value of the initialFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupS1IntraSysHOTriggered() {
        return initialFailedToSetupS1IntraSysHOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupS1IntraSysHOTriggered(Integer value) {
        this.initialFailedToSetupS1IntraSysHOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupS1InterSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupS1InterSysHOTriggered() {
        return initialFailedToSetupS1InterSysHOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupS1InterSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupS1InterSysHOTriggered(Integer value) {
        this.initialFailedToSetupS1InterSysHOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupX2HOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupX2HOTriggered() {
        return initialFailedToSetupX2HOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupX2HOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupX2HOTriggered(Integer value) {
        this.initialFailedToSetupX2HOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd() {
        return initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd;
    }

    /**
     * Sets the value of the initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd(Integer value) {
        this.initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd = value;
    }

    /**
     * Gets the value of the additionalAttemptedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalAttemptedToSetupSum() {
        return additionalAttemptedToSetupSum;
    }

    /**
     * Sets the value of the additionalAttemptedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalAttemptedToSetupSum(Integer value) {
        this.additionalAttemptedToSetupSum = value;
    }

    /**
     * Gets the value of the additionalSuccessfullyEstablishedSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalSuccessfullyEstablishedSum() {
        return additionalSuccessfullyEstablishedSum;
    }

    /**
     * Sets the value of the additionalSuccessfullyEstablishedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalSuccessfullyEstablishedSum(Integer value) {
        this.additionalSuccessfullyEstablishedSum = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupSum() {
        return additionalFailedToSetupSum;
    }

    /**
     * Sets the value of the additionalFailedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupSum(Integer value) {
        this.additionalFailedToSetupSum = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupRadioResUnavailable() {
        return additionalFailedToSetupRadioResUnavailable;
    }

    /**
     * Sets the value of the additionalFailedToSetupRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupRadioResUnavailable(Integer value) {
        this.additionalFailedToSetupRadioResUnavailable = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupRadIntfProcFailure() {
        return additionalFailedToSetupRadIntfProcFailure;
    }

    /**
     * Sets the value of the additionalFailedToSetupRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupRadIntfProcFailure(Integer value) {
        this.additionalFailedToSetupRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupInvalidQosCombination() {
        return additionalFailedToSetupInvalidQosCombination;
    }

    /**
     * Sets the value of the additionalFailedToSetupInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupInvalidQosCombination(Integer value) {
        this.additionalFailedToSetupInvalidQosCombination = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupMultiERabIdInstances() {
        return additionalFailedToSetupMultiERabIdInstances;
    }

    /**
     * Sets the value of the additionalFailedToSetupMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupMultiERabIdInstances(Integer value) {
        this.additionalFailedToSetupMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupQciValNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupQciValNotSupported() {
        return additionalFailedToSetupQciValNotSupported;
    }

    /**
     * Sets the value of the additionalFailedToSetupQciValNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupQciValNotSupported(Integer value) {
        this.additionalFailedToSetupQciValNotSupported = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupS1IntraSysHOTriggered() {
        return additionalFailedToSetupS1IntraSysHOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupS1IntraSysHOTriggered(Integer value) {
        this.additionalFailedToSetupS1IntraSysHOTriggered = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupS1InterSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupS1InterSysHOTriggered() {
        return additionalFailedToSetupS1InterSysHOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupS1InterSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupS1InterSysHOTriggered(Integer value) {
        this.additionalFailedToSetupS1InterSysHOTriggered = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupX2HOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalFailedToSetupX2HOTriggered() {
        return additionalFailedToSetupX2HOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupX2HOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalFailedToSetupX2HOTriggered(Integer value) {
        this.additionalFailedToSetupX2HOTriggered = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseSum() {
        return reqToReleasePerCauseSum;
    }

    /**
     * Sets the value of the reqToReleasePerCauseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseSum(Integer value) {
        this.reqToReleasePerCauseSum = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseRadResUnavailable() {
        return reqToReleasePerCauseRadResUnavailable;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseRadResUnavailable(Integer value) {
        this.reqToReleasePerCauseRadResUnavailable = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseRadIntfProcFailure() {
        return reqToReleasePerCauseRadIntfProcFailure;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseRadIntfProcFailure(Integer value) {
        this.reqToReleasePerCauseRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseReduceLoadInServingCell() {
        return reqToReleasePerCauseReduceLoadInServingCell;
    }

    /**
     * Sets the value of the reqToReleasePerCauseReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseReduceLoadInServingCell(Integer value) {
        this.reqToReleasePerCauseReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRelDueToEutranReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseRelDueToEutranReasons() {
        return reqToReleasePerCauseRelDueToEutranReasons;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRelDueToEutranReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseRelDueToEutranReasons(Integer value) {
        this.reqToReleasePerCauseRelDueToEutranReasons = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseUserInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseUserInactivity() {
        return reqToReleasePerCauseUserInactivity;
    }

    /**
     * Sets the value of the reqToReleasePerCauseUserInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseUserInactivity(Integer value) {
        this.reqToReleasePerCauseUserInactivity = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadConnWithUeLost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseRadConnWithUeLost() {
        return reqToReleasePerCauseRadConnWithUeLost;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadConnWithUeLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseRadConnWithUeLost(Integer value) {
        this.reqToReleasePerCauseRadConnWithUeLost = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseOamIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerCauseOamIntervention() {
        return reqToReleasePerCauseOamIntervention;
    }

    /**
     * Sets the value of the reqToReleasePerCauseOamIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerCauseOamIntervention(Integer value) {
        this.reqToReleasePerCauseOamIntervention = value;
    }

    /**
     * Gets the value of the attemptedToReleaseSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttemptedToReleaseSum() {
        return attemptedToReleaseSum;
    }

    /**
     * Sets the value of the attemptedToReleaseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttemptedToReleaseSum(Integer value) {
        this.attemptedToReleaseSum = value;
    }

    /**
     * Gets the value of the successfullyReleasedSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessfullyReleasedSum() {
        return successfullyReleasedSum;
    }

    /**
     * Sets the value of the successfullyReleasedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessfullyReleasedSum(Integer value) {
        this.successfullyReleasedSum = value;
    }

    /**
     * Gets the value of the failedToReleaseSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToReleaseSum() {
        return failedToReleaseSum;
    }

    /**
     * Sets the value of the failedToReleaseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToReleaseSum(Integer value) {
        this.failedToReleaseSum = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownERabId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToReleaseUnknownERabId() {
        return failedToReleaseUnknownERabId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownERabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToReleaseUnknownERabId(Integer value) {
        this.failedToReleaseUnknownERabId = value;
    }

    /**
     * Gets the value of the failedToReleaseHOFailureInTargetSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToReleaseHOFailureInTargetSystem() {
        return failedToReleaseHOFailureInTargetSystem;
    }

    /**
     * Sets the value of the failedToReleaseHOFailureInTargetSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToReleaseHOFailureInTargetSystem(Integer value) {
        this.failedToReleaseHOFailureInTargetSystem = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownAllocatedMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToReleaseUnknownAllocatedMmeUeS1ApId() {
        return failedToReleaseUnknownAllocatedMmeUeS1ApId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownAllocatedMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToReleaseUnknownAllocatedMmeUeS1ApId(Integer value) {
        this.failedToReleaseUnknownAllocatedMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownAllocatedEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToReleaseUnknownAllocatedEnbUeS1ApId() {
        return failedToReleaseUnknownAllocatedEnbUeS1ApId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownAllocatedEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToReleaseUnknownAllocatedEnbUeS1ApId(Integer value) {
        this.failedToReleaseUnknownAllocatedEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the numberOfReleasedActiveSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfReleasedActiveSum() {
        return numberOfReleasedActiveSum;
    }

    /**
     * Sets the value of the numberOfReleasedActiveSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfReleasedActiveSum(Integer value) {
        this.numberOfReleasedActiveSum = value;
    }

    /**
     * Gets the value of the attemptedToModifyQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttemptedToModifyQosSum() {
        return attemptedToModifyQosSum;
    }

    /**
     * Sets the value of the attemptedToModifyQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttemptedToModifyQosSum(Integer value) {
        this.attemptedToModifyQosSum = value;
    }

    /**
     * Gets the value of the successfullyModifiedQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessfullyModifiedQosSum() {
        return successfullyModifiedQosSum;
    }

    /**
     * Sets the value of the successfullyModifiedQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessfullyModifiedQosSum(Integer value) {
        this.successfullyModifiedQosSum = value;
    }

    /**
     * Gets the value of the failedToModifyQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosSum() {
        return failedToModifyQosSum;
    }

    /**
     * Sets the value of the failedToModifyQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosSum(Integer value) {
        this.failedToModifyQosSum = value;
    }

    /**
     * Gets the value of the failedToModifyQosUnknownERabId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosUnknownERabId() {
        return failedToModifyQosUnknownERabId;
    }

    /**
     * Sets the value of the failedToModifyQosUnknownERabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosUnknownERabId(Integer value) {
        this.failedToModifyQosUnknownERabId = value;
    }

    /**
     * Gets the value of the failedToModifyQosMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosMultiERabIdInstances() {
        return failedToModifyQosMultiERabIdInstances;
    }

    /**
     * Sets the value of the failedToModifyQosMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosMultiERabIdInstances(Integer value) {
        this.failedToModifyQosMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the failedToModifyQosRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosRadioResUnavailable() {
        return failedToModifyQosRadioResUnavailable;
    }

    /**
     * Sets the value of the failedToModifyQosRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosRadioResUnavailable(Integer value) {
        this.failedToModifyQosRadioResUnavailable = value;
    }

    /**
     * Gets the value of the failedToModifyQosRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosRadIntfProcFailure() {
        return failedToModifyQosRadIntfProcFailure;
    }

    /**
     * Sets the value of the failedToModifyQosRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosRadIntfProcFailure(Integer value) {
        this.failedToModifyQosRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the failedToModifyQosInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailedToModifyQosInvalidQosCombination() {
        return failedToModifyQosInvalidQosCombination;
    }

    /**
     * Sets the value of the failedToModifyQosInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailedToModifyQosInvalidQosCombination(Integer value) {
        this.failedToModifyQosInvalidQosCombination = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForUe property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInSessionActivityTimeForUe() {
        return inSessionActivityTimeForUe;
    }

    /**
     * Sets the value of the inSessionActivityTimeForUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInSessionActivityTimeForUe(Integer value) {
        this.inSessionActivityTimeForUe = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForERabSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInSessionActivityTimeForERabSum() {
        return inSessionActivityTimeForERabSum;
    }

    /**
     * Sets the value of the inSessionActivityTimeForERabSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInSessionActivityTimeForERabSum(Integer value) {
        this.inSessionActivityTimeForERabSum = value;
    }

    /**
     * Gets the value of the simultaneousERabAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimultaneousERabAvgSum() {
        return simultaneousERabAvgSum;
    }

    /**
     * Sets the value of the simultaneousERabAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimultaneousERabAvgSum(Integer value) {
        this.simultaneousERabAvgSum = value;
    }

    /**
     * Gets the value of the simultaneousERabMaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimultaneousERabMaxSum() {
        return simultaneousERabMaxSum;
    }

    /**
     * Sets the value of the simultaneousERabMaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimultaneousERabMaxSum(Integer value) {
        this.simultaneousERabMaxSum = value;
    }

}
