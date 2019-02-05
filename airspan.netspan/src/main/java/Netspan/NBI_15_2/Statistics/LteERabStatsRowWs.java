
package Netspan.NBI_15_2.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteERabStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteERabStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialAttemptedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialSuccessfullyEstablishedSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupRadIntProcFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupQciValNotSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupS1IntraSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupS1InterSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupX2HOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupTransportSrcUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialFailedToSetupCauseUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAttemptedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalSuccessfullyEstablishedSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupQciValNotSupported" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupS1IntraSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupS1InterSysHOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupX2HOTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFailedToSetupCauseUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseRadResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseRelDueToEutranReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseUserInactivity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseRadConnWithUeLost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseOamIntervention" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseTransportResourceUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerCauseTransportCauseUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttemptedToReleaseSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullyReleasedSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToReleaseSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToReleaseUnknownERabId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToReleaseHOFailureInTargetSystem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToReleaseUnknownAllocatedMmeUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToReleaseUnknownAllocatedEnbUeS1apId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfReleasedActiveSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttemptedToModifyQosSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullyModifiedQosSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosUnknownERabId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosMultiERabIdInstances" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosRadioResUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosRadIntfProcFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FailedToModifyQosInvalidQosCombination" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InSessionActivityTimeForUe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InSessionActivityTimeForERabSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SimultaneousERabAvgSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SimultaneousERabMaxSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "initialFailedToSetupTransportSrcUnavailable",
    "initialFailedToSetupCauseUnspecified",
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
    "additionalFailedToSetupCauseUnspecified",
    "reqToReleasePerCauseSum",
    "reqToReleasePerCauseRadResUnavailable",
    "reqToReleasePerCauseRadIntfProcFailure",
    "reqToReleasePerCauseReduceLoadInServingCell",
    "reqToReleasePerCauseRelDueToEutranReasons",
    "reqToReleasePerCauseUserInactivity",
    "reqToReleasePerCauseRadConnWithUeLost",
    "reqToReleasePerCauseOamIntervention",
    "reqToReleasePerCauseTransportResourceUnavailable",
    "reqToReleasePerCauseTransportCauseUnspecified",
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
    @XmlElementRef(name = "InitialAttemptedToSetupSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialAttemptedToSetupSum;
    @XmlElementRef(name = "InitialSuccessfullyEstablishedSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialSuccessfullyEstablishedSum;
    @XmlElementRef(name = "InitialFailedToSetupSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupSum;
    @XmlElementRef(name = "InitialFailedToSetupRadioResUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupRadioResUnavailable;
    @XmlElementRef(name = "InitialFailedToSetupRadIntProcFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupRadIntProcFailure;
    @XmlElementRef(name = "InitialFailedToSetupInvalidQosCombination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupInvalidQosCombination;
    @XmlElementRef(name = "InitialFailedToSetupMultiERabIdInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupMultiERabIdInstances;
    @XmlElementRef(name = "InitialFailedToSetupQciValNotSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupQciValNotSupported;
    @XmlElementRef(name = "InitialFailedToSetupS1IntraSysHOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupS1IntraSysHOTriggered;
    @XmlElementRef(name = "InitialFailedToSetupS1InterSysHOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupS1InterSysHOTriggered;
    @XmlElementRef(name = "InitialFailedToSetupX2HOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupX2HOTriggered;
    @XmlElementRef(name = "InitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd;
    @XmlElementRef(name = "InitialFailedToSetupTransportSrcUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupTransportSrcUnavailable;
    @XmlElementRef(name = "InitialFailedToSetupCauseUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialFailedToSetupCauseUnspecified;
    @XmlElementRef(name = "AdditionalAttemptedToSetupSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalAttemptedToSetupSum;
    @XmlElementRef(name = "AdditionalSuccessfullyEstablishedSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalSuccessfullyEstablishedSum;
    @XmlElementRef(name = "AdditionalFailedToSetupSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupSum;
    @XmlElementRef(name = "AdditionalFailedToSetupRadioResUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupRadioResUnavailable;
    @XmlElementRef(name = "AdditionalFailedToSetupRadIntfProcFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupRadIntfProcFailure;
    @XmlElementRef(name = "AdditionalFailedToSetupInvalidQosCombination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupInvalidQosCombination;
    @XmlElementRef(name = "AdditionalFailedToSetupMultiERabIdInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupMultiERabIdInstances;
    @XmlElementRef(name = "AdditionalFailedToSetupQciValNotSupported", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupQciValNotSupported;
    @XmlElementRef(name = "AdditionalFailedToSetupS1IntraSysHOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupS1IntraSysHOTriggered;
    @XmlElementRef(name = "AdditionalFailedToSetupS1InterSysHOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupS1InterSysHOTriggered;
    @XmlElementRef(name = "AdditionalFailedToSetupX2HOTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupX2HOTriggered;
    @XmlElementRef(name = "AdditionalFailedToSetupCauseUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalFailedToSetupCauseUnspecified;
    @XmlElementRef(name = "ReqToReleasePerCauseSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseSum;
    @XmlElementRef(name = "ReqToReleasePerCauseRadResUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseRadResUnavailable;
    @XmlElementRef(name = "ReqToReleasePerCauseRadIntfProcFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseRadIntfProcFailure;
    @XmlElementRef(name = "ReqToReleasePerCauseReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseReduceLoadInServingCell;
    @XmlElementRef(name = "ReqToReleasePerCauseRelDueToEutranReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseRelDueToEutranReasons;
    @XmlElementRef(name = "ReqToReleasePerCauseUserInactivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseUserInactivity;
    @XmlElementRef(name = "ReqToReleasePerCauseRadConnWithUeLost", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseRadConnWithUeLost;
    @XmlElementRef(name = "ReqToReleasePerCauseOamIntervention", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseOamIntervention;
    @XmlElementRef(name = "ReqToReleasePerCauseTransportResourceUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseTransportResourceUnavailable;
    @XmlElementRef(name = "ReqToReleasePerCauseTransportCauseUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerCauseTransportCauseUnspecified;
    @XmlElementRef(name = "AttemptedToReleaseSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> attemptedToReleaseSum;
    @XmlElementRef(name = "SuccessfullyReleasedSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullyReleasedSum;
    @XmlElementRef(name = "FailedToReleaseSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToReleaseSum;
    @XmlElementRef(name = "FailedToReleaseUnknownERabId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToReleaseUnknownERabId;
    @XmlElementRef(name = "FailedToReleaseHOFailureInTargetSystem", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToReleaseHOFailureInTargetSystem;
    @XmlElementRef(name = "FailedToReleaseUnknownAllocatedMmeUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToReleaseUnknownAllocatedMmeUeS1ApId;
    @XmlElementRef(name = "FailedToReleaseUnknownAllocatedEnbUeS1apId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToReleaseUnknownAllocatedEnbUeS1ApId;
    @XmlElementRef(name = "NumberOfReleasedActiveSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfReleasedActiveSum;
    @XmlElementRef(name = "AttemptedToModifyQosSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> attemptedToModifyQosSum;
    @XmlElementRef(name = "SuccessfullyModifiedQosSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullyModifiedQosSum;
    @XmlElementRef(name = "FailedToModifyQosSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosSum;
    @XmlElementRef(name = "FailedToModifyQosUnknownERabId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosUnknownERabId;
    @XmlElementRef(name = "FailedToModifyQosMultiERabIdInstances", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosMultiERabIdInstances;
    @XmlElementRef(name = "FailedToModifyQosRadioResUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosRadioResUnavailable;
    @XmlElementRef(name = "FailedToModifyQosRadIntfProcFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosRadIntfProcFailure;
    @XmlElementRef(name = "FailedToModifyQosInvalidQosCombination", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> failedToModifyQosInvalidQosCombination;
    @XmlElementRef(name = "InSessionActivityTimeForUe", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> inSessionActivityTimeForUe;
    @XmlElementRef(name = "InSessionActivityTimeForERabSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> inSessionActivityTimeForERabSum;
    @XmlElementRef(name = "SimultaneousERabAvgSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> simultaneousERabAvgSum;
    @XmlElementRef(name = "SimultaneousERabMaxSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> simultaneousERabMaxSum;

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
     * Gets the value of the initialAttemptedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialAttemptedToSetupSum() {
        return initialAttemptedToSetupSum;
    }

    /**
     * Sets the value of the initialAttemptedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialAttemptedToSetupSum(JAXBElement<Integer> value) {
        this.initialAttemptedToSetupSum = value;
    }

    /**
     * Gets the value of the initialSuccessfullyEstablishedSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialSuccessfullyEstablishedSum() {
        return initialSuccessfullyEstablishedSum;
    }

    /**
     * Sets the value of the initialSuccessfullyEstablishedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialSuccessfullyEstablishedSum(JAXBElement<Integer> value) {
        this.initialSuccessfullyEstablishedSum = value;
    }

    /**
     * Gets the value of the initialFailedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupSum() {
        return initialFailedToSetupSum;
    }

    /**
     * Sets the value of the initialFailedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupSum(JAXBElement<Integer> value) {
        this.initialFailedToSetupSum = value;
    }

    /**
     * Gets the value of the initialFailedToSetupRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupRadioResUnavailable() {
        return initialFailedToSetupRadioResUnavailable;
    }

    /**
     * Sets the value of the initialFailedToSetupRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupRadioResUnavailable(JAXBElement<Integer> value) {
        this.initialFailedToSetupRadioResUnavailable = value;
    }

    /**
     * Gets the value of the initialFailedToSetupRadIntProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupRadIntProcFailure() {
        return initialFailedToSetupRadIntProcFailure;
    }

    /**
     * Sets the value of the initialFailedToSetupRadIntProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupRadIntProcFailure(JAXBElement<Integer> value) {
        this.initialFailedToSetupRadIntProcFailure = value;
    }

    /**
     * Gets the value of the initialFailedToSetupInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupInvalidQosCombination() {
        return initialFailedToSetupInvalidQosCombination;
    }

    /**
     * Sets the value of the initialFailedToSetupInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupInvalidQosCombination(JAXBElement<Integer> value) {
        this.initialFailedToSetupInvalidQosCombination = value;
    }

    /**
     * Gets the value of the initialFailedToSetupMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupMultiERabIdInstances() {
        return initialFailedToSetupMultiERabIdInstances;
    }

    /**
     * Sets the value of the initialFailedToSetupMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupMultiERabIdInstances(JAXBElement<Integer> value) {
        this.initialFailedToSetupMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the initialFailedToSetupQciValNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupQciValNotSupported() {
        return initialFailedToSetupQciValNotSupported;
    }

    /**
     * Sets the value of the initialFailedToSetupQciValNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupQciValNotSupported(JAXBElement<Integer> value) {
        this.initialFailedToSetupQciValNotSupported = value;
    }

    /**
     * Gets the value of the initialFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupS1IntraSysHOTriggered() {
        return initialFailedToSetupS1IntraSysHOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupS1IntraSysHOTriggered(JAXBElement<Integer> value) {
        this.initialFailedToSetupS1IntraSysHOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupS1InterSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupS1InterSysHOTriggered() {
        return initialFailedToSetupS1InterSysHOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupS1InterSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupS1InterSysHOTriggered(JAXBElement<Integer> value) {
        this.initialFailedToSetupS1InterSysHOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupX2HOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupX2HOTriggered() {
        return initialFailedToSetupX2HOTriggered;
    }

    /**
     * Sets the value of the initialFailedToSetupX2HOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupX2HOTriggered(JAXBElement<Integer> value) {
        this.initialFailedToSetupX2HOTriggered = value;
    }

    /**
     * Gets the value of the initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd() {
        return initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd;
    }

    /**
     * Sets the value of the initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupEncrAndOrIntegProtAlgNotSupptd(JAXBElement<Integer> value) {
        this.initialFailedToSetupEncrAndOrIntegProtAlgNotSupptd = value;
    }

    /**
     * Gets the value of the initialFailedToSetupTransportSrcUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupTransportSrcUnavailable() {
        return initialFailedToSetupTransportSrcUnavailable;
    }

    /**
     * Sets the value of the initialFailedToSetupTransportSrcUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupTransportSrcUnavailable(JAXBElement<Integer> value) {
        this.initialFailedToSetupTransportSrcUnavailable = value;
    }

    /**
     * Gets the value of the initialFailedToSetupCauseUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialFailedToSetupCauseUnspecified() {
        return initialFailedToSetupCauseUnspecified;
    }

    /**
     * Sets the value of the initialFailedToSetupCauseUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialFailedToSetupCauseUnspecified(JAXBElement<Integer> value) {
        this.initialFailedToSetupCauseUnspecified = value;
    }

    /**
     * Gets the value of the additionalAttemptedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalAttemptedToSetupSum() {
        return additionalAttemptedToSetupSum;
    }

    /**
     * Sets the value of the additionalAttemptedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalAttemptedToSetupSum(JAXBElement<Integer> value) {
        this.additionalAttemptedToSetupSum = value;
    }

    /**
     * Gets the value of the additionalSuccessfullyEstablishedSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalSuccessfullyEstablishedSum() {
        return additionalSuccessfullyEstablishedSum;
    }

    /**
     * Sets the value of the additionalSuccessfullyEstablishedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalSuccessfullyEstablishedSum(JAXBElement<Integer> value) {
        this.additionalSuccessfullyEstablishedSum = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupSum() {
        return additionalFailedToSetupSum;
    }

    /**
     * Sets the value of the additionalFailedToSetupSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupSum(JAXBElement<Integer> value) {
        this.additionalFailedToSetupSum = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupRadioResUnavailable() {
        return additionalFailedToSetupRadioResUnavailable;
    }

    /**
     * Sets the value of the additionalFailedToSetupRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupRadioResUnavailable(JAXBElement<Integer> value) {
        this.additionalFailedToSetupRadioResUnavailable = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupRadIntfProcFailure() {
        return additionalFailedToSetupRadIntfProcFailure;
    }

    /**
     * Sets the value of the additionalFailedToSetupRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupRadIntfProcFailure(JAXBElement<Integer> value) {
        this.additionalFailedToSetupRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupInvalidQosCombination() {
        return additionalFailedToSetupInvalidQosCombination;
    }

    /**
     * Sets the value of the additionalFailedToSetupInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupInvalidQosCombination(JAXBElement<Integer> value) {
        this.additionalFailedToSetupInvalidQosCombination = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupMultiERabIdInstances() {
        return additionalFailedToSetupMultiERabIdInstances;
    }

    /**
     * Sets the value of the additionalFailedToSetupMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupMultiERabIdInstances(JAXBElement<Integer> value) {
        this.additionalFailedToSetupMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupQciValNotSupported property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupQciValNotSupported() {
        return additionalFailedToSetupQciValNotSupported;
    }

    /**
     * Sets the value of the additionalFailedToSetupQciValNotSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupQciValNotSupported(JAXBElement<Integer> value) {
        this.additionalFailedToSetupQciValNotSupported = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupS1IntraSysHOTriggered() {
        return additionalFailedToSetupS1IntraSysHOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupS1IntraSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupS1IntraSysHOTriggered(JAXBElement<Integer> value) {
        this.additionalFailedToSetupS1IntraSysHOTriggered = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupS1InterSysHOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupS1InterSysHOTriggered() {
        return additionalFailedToSetupS1InterSysHOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupS1InterSysHOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupS1InterSysHOTriggered(JAXBElement<Integer> value) {
        this.additionalFailedToSetupS1InterSysHOTriggered = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupX2HOTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupX2HOTriggered() {
        return additionalFailedToSetupX2HOTriggered;
    }

    /**
     * Sets the value of the additionalFailedToSetupX2HOTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupX2HOTriggered(JAXBElement<Integer> value) {
        this.additionalFailedToSetupX2HOTriggered = value;
    }

    /**
     * Gets the value of the additionalFailedToSetupCauseUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalFailedToSetupCauseUnspecified() {
        return additionalFailedToSetupCauseUnspecified;
    }

    /**
     * Sets the value of the additionalFailedToSetupCauseUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalFailedToSetupCauseUnspecified(JAXBElement<Integer> value) {
        this.additionalFailedToSetupCauseUnspecified = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseSum() {
        return reqToReleasePerCauseSum;
    }

    /**
     * Sets the value of the reqToReleasePerCauseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseSum(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseSum = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseRadResUnavailable() {
        return reqToReleasePerCauseRadResUnavailable;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseRadResUnavailable(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseRadResUnavailable = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseRadIntfProcFailure() {
        return reqToReleasePerCauseRadIntfProcFailure;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseRadIntfProcFailure(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseReduceLoadInServingCell() {
        return reqToReleasePerCauseReduceLoadInServingCell;
    }

    /**
     * Sets the value of the reqToReleasePerCauseReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRelDueToEutranReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseRelDueToEutranReasons() {
        return reqToReleasePerCauseRelDueToEutranReasons;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRelDueToEutranReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseRelDueToEutranReasons(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseRelDueToEutranReasons = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseUserInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseUserInactivity() {
        return reqToReleasePerCauseUserInactivity;
    }

    /**
     * Sets the value of the reqToReleasePerCauseUserInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseUserInactivity(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseUserInactivity = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseRadConnWithUeLost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseRadConnWithUeLost() {
        return reqToReleasePerCauseRadConnWithUeLost;
    }

    /**
     * Sets the value of the reqToReleasePerCauseRadConnWithUeLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseRadConnWithUeLost(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseRadConnWithUeLost = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseOamIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseOamIntervention() {
        return reqToReleasePerCauseOamIntervention;
    }

    /**
     * Sets the value of the reqToReleasePerCauseOamIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseOamIntervention(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseOamIntervention = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseTransportResourceUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseTransportResourceUnavailable() {
        return reqToReleasePerCauseTransportResourceUnavailable;
    }

    /**
     * Sets the value of the reqToReleasePerCauseTransportResourceUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseTransportResourceUnavailable(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseTransportResourceUnavailable = value;
    }

    /**
     * Gets the value of the reqToReleasePerCauseTransportCauseUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerCauseTransportCauseUnspecified() {
        return reqToReleasePerCauseTransportCauseUnspecified;
    }

    /**
     * Sets the value of the reqToReleasePerCauseTransportCauseUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerCauseTransportCauseUnspecified(JAXBElement<Integer> value) {
        this.reqToReleasePerCauseTransportCauseUnspecified = value;
    }

    /**
     * Gets the value of the attemptedToReleaseSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAttemptedToReleaseSum() {
        return attemptedToReleaseSum;
    }

    /**
     * Sets the value of the attemptedToReleaseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAttemptedToReleaseSum(JAXBElement<Integer> value) {
        this.attemptedToReleaseSum = value;
    }

    /**
     * Gets the value of the successfullyReleasedSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullyReleasedSum() {
        return successfullyReleasedSum;
    }

    /**
     * Sets the value of the successfullyReleasedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullyReleasedSum(JAXBElement<Integer> value) {
        this.successfullyReleasedSum = value;
    }

    /**
     * Gets the value of the failedToReleaseSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToReleaseSum() {
        return failedToReleaseSum;
    }

    /**
     * Sets the value of the failedToReleaseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToReleaseSum(JAXBElement<Integer> value) {
        this.failedToReleaseSum = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownERabId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToReleaseUnknownERabId() {
        return failedToReleaseUnknownERabId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownERabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToReleaseUnknownERabId(JAXBElement<Integer> value) {
        this.failedToReleaseUnknownERabId = value;
    }

    /**
     * Gets the value of the failedToReleaseHOFailureInTargetSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToReleaseHOFailureInTargetSystem() {
        return failedToReleaseHOFailureInTargetSystem;
    }

    /**
     * Sets the value of the failedToReleaseHOFailureInTargetSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToReleaseHOFailureInTargetSystem(JAXBElement<Integer> value) {
        this.failedToReleaseHOFailureInTargetSystem = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownAllocatedMmeUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToReleaseUnknownAllocatedMmeUeS1ApId() {
        return failedToReleaseUnknownAllocatedMmeUeS1ApId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownAllocatedMmeUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToReleaseUnknownAllocatedMmeUeS1ApId(JAXBElement<Integer> value) {
        this.failedToReleaseUnknownAllocatedMmeUeS1ApId = value;
    }

    /**
     * Gets the value of the failedToReleaseUnknownAllocatedEnbUeS1ApId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToReleaseUnknownAllocatedEnbUeS1ApId() {
        return failedToReleaseUnknownAllocatedEnbUeS1ApId;
    }

    /**
     * Sets the value of the failedToReleaseUnknownAllocatedEnbUeS1ApId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToReleaseUnknownAllocatedEnbUeS1ApId(JAXBElement<Integer> value) {
        this.failedToReleaseUnknownAllocatedEnbUeS1ApId = value;
    }

    /**
     * Gets the value of the numberOfReleasedActiveSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfReleasedActiveSum() {
        return numberOfReleasedActiveSum;
    }

    /**
     * Sets the value of the numberOfReleasedActiveSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfReleasedActiveSum(JAXBElement<Integer> value) {
        this.numberOfReleasedActiveSum = value;
    }

    /**
     * Gets the value of the attemptedToModifyQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAttemptedToModifyQosSum() {
        return attemptedToModifyQosSum;
    }

    /**
     * Sets the value of the attemptedToModifyQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAttemptedToModifyQosSum(JAXBElement<Integer> value) {
        this.attemptedToModifyQosSum = value;
    }

    /**
     * Gets the value of the successfullyModifiedQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullyModifiedQosSum() {
        return successfullyModifiedQosSum;
    }

    /**
     * Sets the value of the successfullyModifiedQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullyModifiedQosSum(JAXBElement<Integer> value) {
        this.successfullyModifiedQosSum = value;
    }

    /**
     * Gets the value of the failedToModifyQosSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosSum() {
        return failedToModifyQosSum;
    }

    /**
     * Sets the value of the failedToModifyQosSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosSum(JAXBElement<Integer> value) {
        this.failedToModifyQosSum = value;
    }

    /**
     * Gets the value of the failedToModifyQosUnknownERabId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosUnknownERabId() {
        return failedToModifyQosUnknownERabId;
    }

    /**
     * Sets the value of the failedToModifyQosUnknownERabId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosUnknownERabId(JAXBElement<Integer> value) {
        this.failedToModifyQosUnknownERabId = value;
    }

    /**
     * Gets the value of the failedToModifyQosMultiERabIdInstances property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosMultiERabIdInstances() {
        return failedToModifyQosMultiERabIdInstances;
    }

    /**
     * Sets the value of the failedToModifyQosMultiERabIdInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosMultiERabIdInstances(JAXBElement<Integer> value) {
        this.failedToModifyQosMultiERabIdInstances = value;
    }

    /**
     * Gets the value of the failedToModifyQosRadioResUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosRadioResUnavailable() {
        return failedToModifyQosRadioResUnavailable;
    }

    /**
     * Sets the value of the failedToModifyQosRadioResUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosRadioResUnavailable(JAXBElement<Integer> value) {
        this.failedToModifyQosRadioResUnavailable = value;
    }

    /**
     * Gets the value of the failedToModifyQosRadIntfProcFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosRadIntfProcFailure() {
        return failedToModifyQosRadIntfProcFailure;
    }

    /**
     * Sets the value of the failedToModifyQosRadIntfProcFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosRadIntfProcFailure(JAXBElement<Integer> value) {
        this.failedToModifyQosRadIntfProcFailure = value;
    }

    /**
     * Gets the value of the failedToModifyQosInvalidQosCombination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFailedToModifyQosInvalidQosCombination() {
        return failedToModifyQosInvalidQosCombination;
    }

    /**
     * Sets the value of the failedToModifyQosInvalidQosCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFailedToModifyQosInvalidQosCombination(JAXBElement<Integer> value) {
        this.failedToModifyQosInvalidQosCombination = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForUe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInSessionActivityTimeForUe() {
        return inSessionActivityTimeForUe;
    }

    /**
     * Sets the value of the inSessionActivityTimeForUe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInSessionActivityTimeForUe(JAXBElement<Integer> value) {
        this.inSessionActivityTimeForUe = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForERabSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInSessionActivityTimeForERabSum() {
        return inSessionActivityTimeForERabSum;
    }

    /**
     * Sets the value of the inSessionActivityTimeForERabSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInSessionActivityTimeForERabSum(JAXBElement<Integer> value) {
        this.inSessionActivityTimeForERabSum = value;
    }

    /**
     * Gets the value of the simultaneousERabAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSimultaneousERabAvgSum() {
        return simultaneousERabAvgSum;
    }

    /**
     * Sets the value of the simultaneousERabAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSimultaneousERabAvgSum(JAXBElement<Integer> value) {
        this.simultaneousERabAvgSum = value;
    }

    /**
     * Gets the value of the simultaneousERabMaxSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSimultaneousERabMaxSum() {
        return simultaneousERabMaxSum;
    }

    /**
     * Sets the value of the simultaneousERabMaxSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSimultaneousERabMaxSum(JAXBElement<Integer> value) {
        this.simultaneousERabMaxSum = value;
    }

}
