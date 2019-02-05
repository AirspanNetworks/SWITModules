
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
 * <p>Java class for LteRrcStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRrcStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailNBCauseCongestion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailNBCauseUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabAttReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabAttHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabAttOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabSuccReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabSuccHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabSuccOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabFailReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabFailHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabFailOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabFailSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnMeanVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnMaxVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelSuccNbr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMean" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabAttDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabSuccDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailNBCauseEnergySaving" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqCauseUeConnLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqCauseUserInactivity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqCauseCsFallbackTriggered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat1Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat2Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat3Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat4Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat5Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat6Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat7Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat8Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat9Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat10Avg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat1Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat2Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat3Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat4Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat5Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat6Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat7Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat8Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat9Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat10Min" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat1Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat2Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat3Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat4Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat5Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat6Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat7Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat8Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat9Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesCat10Max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedUesMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReconfigAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReconfigSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqRedirectionTowards1xRTT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqInterRATRedirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqRNwTx2RelocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqRNwTS1RelocOverallExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqRNwRelDueTOEUtranGenReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqRNwHOFailureTEnbEpcOrTSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqFailInRadioInterfaceProcedure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqTPTransportResourceUnavailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqCsgSubscriptionExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqUeNotAvailableForPsService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxMoSignaling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallDropRlcMaxHandover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfMoSignaling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LinkInactivityRlfHandover" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MmeOverloadRejectDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommNASNormalRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwTS1RelocOverAllExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRadioNwtx2RelocOverAllExpiry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwRelDueToEutranGenReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwUserInactivity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwRadioConnWithUeLost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwLoadBalTauReq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwCSFBkTrig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwRedirectionTowards1xRTT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwInterratRedirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommNASAuthenticationEnum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwSuccHO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwHoFailInTargEPCEnbOrTargSys" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommRNwFailInRadioInterfProc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommTPTransportResUnavail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelCommNASDetach" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabFailS1APSignallingFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeContextRelReqCallDrpS1apLinkOutOfService" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnReEstabFailS1APSignallingFailure" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRrcStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "connEstabAttEmergency",
    "connEstabAttHighPriorityAccess",
    "connEstabAttMtAccess",
    "connEstabAttMoSignalling",
    "connEstabAttMoData",
    "connEstabAttSum",
    "connEstabSuccEmergency",
    "connEstabSuccHighPriorityAccess",
    "connEstabSuccMtAccess",
    "connEstabSuccMoSignalling",
    "connEstabSuccMoData",
    "connEstabSuccSum",
    "connEstabFailEmergency",
    "connEstabFailHighPriorityAccess",
    "connEstabFailMtAccess",
    "connEstabFailMoSignalling",
    "connEstabFailMoData",
    "connEstabFailSum",
    "connEstabFailNBCauseCongestion",
    "connEstabFailNBCauseUnspecified",
    "connReEstabAttReconfigurationFailure",
    "connReEstabAttHandoverFailure",
    "connReEstabAttOtherFailure",
    "connReEstabAttSum",
    "connReEstabSuccReconfigurationFailure",
    "connReEstabSuccHandoverFailure",
    "connReEstabSuccOtherFailure",
    "connReEstabSuccSum",
    "connReEstabFailReconfigurationFailure",
    "connReEstabFailHandoverFailure",
    "connReEstabFailOtherFailure",
    "connReEstabFailSum",
    "connMeanVal",
    "connMaxVal",
    "connEstabTimeMeanEmergency",
    "connEstabTimeMeanHighPriorityAccess",
    "connEstabTimeMeanMtAccess",
    "connEstabTimeMeanMoSignalling",
    "connEstabTimeMeanMoData",
    "connEstabTimeMaxEmergency",
    "connEstabTimeMaxHighPriorityAccess",
    "connEstabTimeMaxMtAccess",
    "connEstabTimeMaxMoSignalling",
    "connEstabTimeMaxMoData",
    "ueContextRelReqSum",
    "ueContextRelSuccNbr",
    "connEstabTimeMean",
    "connEstabTimeMax",
    "connEstabAttDelayTolerantAccess",
    "connEstabSuccDelayTolerantAccess",
    "connEstabFailDelayTolerantAccess",
    "connEstabFailNBCauseEnergySaving",
    "ueContextRelReqCauseUeConnLoss",
    "ueContextRelReqCauseUserInactivity",
    "ueContextRelReqCauseCsFallbackTriggered",
    "connectedUesCat1Avg",
    "connectedUesCat2Avg",
    "connectedUesCat3Avg",
    "connectedUesCat4Avg",
    "connectedUesCat5Avg",
    "connectedUesCat6Avg",
    "connectedUesCat7Avg",
    "connectedUesCat8Avg",
    "connectedUesCat9Avg",
    "connectedUesCat10Avg",
    "connectedUesCat1Min",
    "connectedUesCat2Min",
    "connectedUesCat3Min",
    "connectedUesCat4Min",
    "connectedUesCat5Min",
    "connectedUesCat6Min",
    "connectedUesCat7Min",
    "connectedUesCat8Min",
    "connectedUesCat9Min",
    "connectedUesCat10Min",
    "connectedUesCat1Max",
    "connectedUesCat2Max",
    "connectedUesCat3Max",
    "connectedUesCat4Max",
    "connectedUesCat5Max",
    "connectedUesCat6Max",
    "connectedUesCat7Max",
    "connectedUesCat8Max",
    "connectedUesCat9Max",
    "connectedUesCat10Max",
    "connectedUesTotal",
    "connectedUesMin",
    "connectedUesMax",
    "connReconfigAttempt",
    "connReconfigSuccess",
    "ueContextRelReqRedirectionTowards1XRTT",
    "ueContextRelReqInterRATRedirection",
    "ueContextRelReqRNwTx2RelocOverallExpiry",
    "ueContextRelReqRNwTS1RelocOverallExpiry",
    "ueContextRelReqRNwRelDueTOEUtranGenReason",
    "ueContextRelReqRNwHOFailureTEnbEpcOrTSys",
    "ueContextRelReqFailInRadioInterfaceProcedure",
    "ueContextRelReqUnspecified",
    "ueContextRelReqTPTransportResourceUnavailable",
    "ueContextRelReqCsgSubscriptionExpiry",
    "ueContextRelReqUeNotAvailableForPsService",
    "callDropRlcMaxEmergency",
    "callDropRlcMaxHighPriorityAccess",
    "callDropRlcMaxMtAccess",
    "callDropRlcMaxMoSignaling",
    "callDropRlcMaxMoData",
    "callDropRlcMaxDelayTolerantAccess",
    "callDropRlcMaxHandover",
    "linkInactivityRlfEmergency",
    "linkInactivityRlfHighPriorityAccess",
    "linkInactivityRlfMtAccess",
    "linkInactivityRlfMoSignaling",
    "linkInactivityRlfMoData",
    "linkInactivityRlfDelayTolerantAccess",
    "linkInactivityRlfHandover",
    "ueContextRelCommUnspecified",
    "mmeOverloadRejectEmergency",
    "mmeOverloadRejectHighPriorityAccess",
    "mmeOverloadRejectMtAccess",
    "mmeOverloadRejectMoSignalling",
    "mmeOverloadRejectMoData",
    "mmeOverloadRejectDelayTolerantAccess",
    "ueContextRelCommNASNormalRelease",
    "ueContextRelCommRNwTS1RelocOverAllExpiry",
    "ueContextRelCommRadioNwtx2RelocOverAllExpiry",
    "ueContextRelCommRNwRelDueToEutranGenReason",
    "ueContextRelCommRNwUserInactivity",
    "ueContextRelCommRNwRadioConnWithUeLost",
    "ueContextRelCommRNwLoadBalTauReq",
    "ueContextRelCommRNwCSFBkTrig",
    "ueContextRelCommRNwRedirectionTowards1XRTT",
    "ueContextRelCommRNwInterratRedirection",
    "ueContextRelCommNASAuthenticationEnum",
    "ueContextRelCommRNwSuccHO",
    "ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys",
    "ueContextRelCommRNwFailInRadioInterfProc",
    "ueContextRelCommTPTransportResUnavail",
    "ueContextRelCommNASDetach",
    "connEstabFailS1APSignallingFailure",
    "ueContextRelReqCallDrpS1ApLinkOutOfService",
    "connReEstabFailS1APSignallingFailure"
})
public class LteRrcStatsRowWs {

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
    @XmlElementRef(name = "ConnEstabAttEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttEmergency;
    @XmlElementRef(name = "ConnEstabAttHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttHighPriorityAccess;
    @XmlElementRef(name = "ConnEstabAttMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttMtAccess;
    @XmlElementRef(name = "ConnEstabAttMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttMoSignalling;
    @XmlElementRef(name = "ConnEstabAttMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttMoData;
    @XmlElementRef(name = "ConnEstabAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttSum;
    @XmlElementRef(name = "ConnEstabSuccEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccEmergency;
    @XmlElementRef(name = "ConnEstabSuccHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccHighPriorityAccess;
    @XmlElementRef(name = "ConnEstabSuccMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccMtAccess;
    @XmlElementRef(name = "ConnEstabSuccMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccMoSignalling;
    @XmlElementRef(name = "ConnEstabSuccMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccMoData;
    @XmlElementRef(name = "ConnEstabSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccSum;
    @XmlElementRef(name = "ConnEstabFailEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailEmergency;
    @XmlElementRef(name = "ConnEstabFailHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailHighPriorityAccess;
    @XmlElementRef(name = "ConnEstabFailMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailMtAccess;
    @XmlElementRef(name = "ConnEstabFailMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailMoSignalling;
    @XmlElementRef(name = "ConnEstabFailMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailMoData;
    @XmlElementRef(name = "ConnEstabFailSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailSum;
    @XmlElementRef(name = "ConnEstabFailNBCauseCongestion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailNBCauseCongestion;
    @XmlElementRef(name = "ConnEstabFailNBCauseUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailNBCauseUnspecified;
    @XmlElementRef(name = "ConnReEstabAttReconfigurationFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabAttReconfigurationFailure;
    @XmlElementRef(name = "ConnReEstabAttHandoverFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabAttHandoverFailure;
    @XmlElementRef(name = "ConnReEstabAttOtherFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabAttOtherFailure;
    @XmlElementRef(name = "ConnReEstabAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabAttSum;
    @XmlElementRef(name = "ConnReEstabSuccReconfigurationFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabSuccReconfigurationFailure;
    @XmlElementRef(name = "ConnReEstabSuccHandoverFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabSuccHandoverFailure;
    @XmlElementRef(name = "ConnReEstabSuccOtherFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabSuccOtherFailure;
    @XmlElementRef(name = "ConnReEstabSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabSuccSum;
    @XmlElementRef(name = "ConnReEstabFailReconfigurationFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabFailReconfigurationFailure;
    @XmlElementRef(name = "ConnReEstabFailHandoverFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabFailHandoverFailure;
    @XmlElementRef(name = "ConnReEstabFailOtherFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabFailOtherFailure;
    @XmlElementRef(name = "ConnReEstabFailSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabFailSum;
    @XmlElementRef(name = "ConnMeanVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connMeanVal;
    @XmlElementRef(name = "ConnMaxVal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connMaxVal;
    @XmlElementRef(name = "ConnEstabTimeMeanEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanEmergency;
    @XmlElementRef(name = "ConnEstabTimeMeanHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanHighPriorityAccess;
    @XmlElementRef(name = "ConnEstabTimeMeanMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanMtAccess;
    @XmlElementRef(name = "ConnEstabTimeMeanMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanMoSignalling;
    @XmlElementRef(name = "ConnEstabTimeMeanMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanMoData;
    @XmlElementRef(name = "ConnEstabTimeMaxEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxEmergency;
    @XmlElementRef(name = "ConnEstabTimeMaxHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxHighPriorityAccess;
    @XmlElementRef(name = "ConnEstabTimeMaxMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxMtAccess;
    @XmlElementRef(name = "ConnEstabTimeMaxMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxMoSignalling;
    @XmlElementRef(name = "ConnEstabTimeMaxMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxMoData;
    @XmlElementRef(name = "UeContextRelReqSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqSum;
    @XmlElementRef(name = "UeContextRelSuccNbr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelSuccNbr;
    @XmlElementRef(name = "ConnEstabTimeMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMean;
    @XmlElementRef(name = "ConnEstabTimeMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMax;
    @XmlElementRef(name = "ConnEstabAttDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabAttDelayTolerantAccess;
    @XmlElementRef(name = "ConnEstabSuccDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabSuccDelayTolerantAccess;
    @XmlElementRef(name = "ConnEstabFailDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailDelayTolerantAccess;
    @XmlElementRef(name = "ConnEstabFailNBCauseEnergySaving", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailNBCauseEnergySaving;
    @XmlElementRef(name = "UeContextRelReqCauseUeConnLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqCauseUeConnLoss;
    @XmlElementRef(name = "UeContextRelReqCauseUserInactivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqCauseUserInactivity;
    @XmlElementRef(name = "UeContextRelReqCauseCsFallbackTriggered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqCauseCsFallbackTriggered;
    @XmlElementRef(name = "ConnectedUesCat1Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat1Avg;
    @XmlElementRef(name = "ConnectedUesCat2Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat2Avg;
    @XmlElementRef(name = "ConnectedUesCat3Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat3Avg;
    @XmlElementRef(name = "ConnectedUesCat4Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat4Avg;
    @XmlElementRef(name = "ConnectedUesCat5Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat5Avg;
    @XmlElementRef(name = "ConnectedUesCat6Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat6Avg;
    @XmlElementRef(name = "ConnectedUesCat7Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat7Avg;
    @XmlElementRef(name = "ConnectedUesCat8Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat8Avg;
    @XmlElementRef(name = "ConnectedUesCat9Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat9Avg;
    @XmlElementRef(name = "ConnectedUesCat10Avg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat10Avg;
    @XmlElementRef(name = "ConnectedUesCat1Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat1Min;
    @XmlElementRef(name = "ConnectedUesCat2Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat2Min;
    @XmlElementRef(name = "ConnectedUesCat3Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat3Min;
    @XmlElementRef(name = "ConnectedUesCat4Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat4Min;
    @XmlElementRef(name = "ConnectedUesCat5Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat5Min;
    @XmlElementRef(name = "ConnectedUesCat6Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat6Min;
    @XmlElementRef(name = "ConnectedUesCat7Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat7Min;
    @XmlElementRef(name = "ConnectedUesCat8Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat8Min;
    @XmlElementRef(name = "ConnectedUesCat9Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat9Min;
    @XmlElementRef(name = "ConnectedUesCat10Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat10Min;
    @XmlElementRef(name = "ConnectedUesCat1Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat1Max;
    @XmlElementRef(name = "ConnectedUesCat2Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat2Max;
    @XmlElementRef(name = "ConnectedUesCat3Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat3Max;
    @XmlElementRef(name = "ConnectedUesCat4Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat4Max;
    @XmlElementRef(name = "ConnectedUesCat5Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat5Max;
    @XmlElementRef(name = "ConnectedUesCat6Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat6Max;
    @XmlElementRef(name = "ConnectedUesCat7Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat7Max;
    @XmlElementRef(name = "ConnectedUesCat8Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat8Max;
    @XmlElementRef(name = "ConnectedUesCat9Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat9Max;
    @XmlElementRef(name = "ConnectedUesCat10Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesCat10Max;
    @XmlElementRef(name = "ConnectedUesTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesTotal;
    @XmlElementRef(name = "ConnectedUesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesMin;
    @XmlElementRef(name = "ConnectedUesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connectedUesMax;
    @XmlElementRef(name = "ConnReconfigAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReconfigAttempt;
    @XmlElementRef(name = "ConnReconfigSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReconfigSuccess;
    @XmlElementRef(name = "UeContextRelReqRedirectionTowards1xRTT", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqRedirectionTowards1XRTT;
    @XmlElementRef(name = "UeContextRelReqInterRATRedirection", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqInterRATRedirection;
    @XmlElementRef(name = "UeContextRelReqRNwTx2RelocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqRNwTx2RelocOverallExpiry;
    @XmlElementRef(name = "UeContextRelReqRNwTS1RelocOverallExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqRNwTS1RelocOverallExpiry;
    @XmlElementRef(name = "UeContextRelReqRNwRelDueTOEUtranGenReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqRNwRelDueTOEUtranGenReason;
    @XmlElementRef(name = "UeContextRelReqRNwHOFailureTEnbEpcOrTSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqRNwHOFailureTEnbEpcOrTSys;
    @XmlElementRef(name = "UeContextRelReqFailInRadioInterfaceProcedure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqFailInRadioInterfaceProcedure;
    @XmlElementRef(name = "UeContextRelReqUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqUnspecified;
    @XmlElementRef(name = "UeContextRelReqTPTransportResourceUnavailable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqTPTransportResourceUnavailable;
    @XmlElementRef(name = "UeContextRelReqCsgSubscriptionExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqCsgSubscriptionExpiry;
    @XmlElementRef(name = "UeContextRelReqUeNotAvailableForPsService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqUeNotAvailableForPsService;
    @XmlElementRef(name = "CallDropRlcMaxEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxEmergency;
    @XmlElementRef(name = "CallDropRlcMaxHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxHighPriorityAccess;
    @XmlElementRef(name = "CallDropRlcMaxMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxMtAccess;
    @XmlElementRef(name = "CallDropRlcMaxMoSignaling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxMoSignaling;
    @XmlElementRef(name = "CallDropRlcMaxMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxMoData;
    @XmlElementRef(name = "CallDropRlcMaxDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxDelayTolerantAccess;
    @XmlElementRef(name = "CallDropRlcMaxHandover", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> callDropRlcMaxHandover;
    @XmlElementRef(name = "LinkInactivityRlfEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfEmergency;
    @XmlElementRef(name = "LinkInactivityRlfHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfHighPriorityAccess;
    @XmlElementRef(name = "LinkInactivityRlfMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfMtAccess;
    @XmlElementRef(name = "LinkInactivityRlfMoSignaling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfMoSignaling;
    @XmlElementRef(name = "LinkInactivityRlfMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfMoData;
    @XmlElementRef(name = "LinkInactivityRlfDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfDelayTolerantAccess;
    @XmlElementRef(name = "LinkInactivityRlfHandover", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkInactivityRlfHandover;
    @XmlElementRef(name = "UeContextRelCommUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommUnspecified;
    @XmlElementRef(name = "MmeOverloadRejectEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectEmergency;
    @XmlElementRef(name = "MmeOverloadRejectHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectHighPriorityAccess;
    @XmlElementRef(name = "MmeOverloadRejectMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectMtAccess;
    @XmlElementRef(name = "MmeOverloadRejectMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectMoSignalling;
    @XmlElementRef(name = "MmeOverloadRejectMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectMoData;
    @XmlElementRef(name = "MmeOverloadRejectDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mmeOverloadRejectDelayTolerantAccess;
    @XmlElementRef(name = "UeContextRelCommNASNormalRelease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommNASNormalRelease;
    @XmlElementRef(name = "UeContextRelCommRNwTS1RelocOverAllExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwTS1RelocOverAllExpiry;
    @XmlElementRef(name = "UeContextRelCommRadioNwtx2RelocOverAllExpiry", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRadioNwtx2RelocOverAllExpiry;
    @XmlElementRef(name = "UeContextRelCommRNwRelDueToEutranGenReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwRelDueToEutranGenReason;
    @XmlElementRef(name = "UeContextRelCommRNwUserInactivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwUserInactivity;
    @XmlElementRef(name = "UeContextRelCommRNwRadioConnWithUeLost", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwRadioConnWithUeLost;
    @XmlElementRef(name = "UeContextRelCommRNwLoadBalTauReq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwLoadBalTauReq;
    @XmlElementRef(name = "UeContextRelCommRNwCSFBkTrig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwCSFBkTrig;
    @XmlElementRef(name = "UeContextRelCommRNwRedirectionTowards1xRTT", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwRedirectionTowards1XRTT;
    @XmlElementRef(name = "UeContextRelCommRNwInterratRedirection", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwInterratRedirection;
    @XmlElementRef(name = "UeContextRelCommNASAuthenticationEnum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommNASAuthenticationEnum;
    @XmlElementRef(name = "UeContextRelCommRNwSuccHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwSuccHO;
    @XmlElementRef(name = "UeContextRelCommRNwHoFailInTargEPCEnbOrTargSys", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys;
    @XmlElementRef(name = "UeContextRelCommRNwFailInRadioInterfProc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommRNwFailInRadioInterfProc;
    @XmlElementRef(name = "UeContextRelCommTPTransportResUnavail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommTPTransportResUnavail;
    @XmlElementRef(name = "UeContextRelCommNASDetach", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelCommNASDetach;
    @XmlElementRef(name = "ConnEstabFailS1APSignallingFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabFailS1APSignallingFailure;
    @XmlElementRef(name = "UeContextRelReqCallDrpS1apLinkOutOfService", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueContextRelReqCallDrpS1ApLinkOutOfService;
    @XmlElementRef(name = "ConnReEstabFailS1APSignallingFailure", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connReEstabFailS1APSignallingFailure;

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
     * Gets the value of the connEstabAttEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttEmergency() {
        return connEstabAttEmergency;
    }

    /**
     * Sets the value of the connEstabAttEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttEmergency(JAXBElement<Integer> value) {
        this.connEstabAttEmergency = value;
    }

    /**
     * Gets the value of the connEstabAttHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttHighPriorityAccess() {
        return connEstabAttHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabAttHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttHighPriorityAccess(JAXBElement<Integer> value) {
        this.connEstabAttHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabAttMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttMtAccess() {
        return connEstabAttMtAccess;
    }

    /**
     * Sets the value of the connEstabAttMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttMtAccess(JAXBElement<Integer> value) {
        this.connEstabAttMtAccess = value;
    }

    /**
     * Gets the value of the connEstabAttMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttMoSignalling() {
        return connEstabAttMoSignalling;
    }

    /**
     * Sets the value of the connEstabAttMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttMoSignalling(JAXBElement<Integer> value) {
        this.connEstabAttMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabAttMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttMoData() {
        return connEstabAttMoData;
    }

    /**
     * Sets the value of the connEstabAttMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttMoData(JAXBElement<Integer> value) {
        this.connEstabAttMoData = value;
    }

    /**
     * Gets the value of the connEstabAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttSum() {
        return connEstabAttSum;
    }

    /**
     * Sets the value of the connEstabAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttSum(JAXBElement<Integer> value) {
        this.connEstabAttSum = value;
    }

    /**
     * Gets the value of the connEstabSuccEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccEmergency() {
        return connEstabSuccEmergency;
    }

    /**
     * Sets the value of the connEstabSuccEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccEmergency(JAXBElement<Integer> value) {
        this.connEstabSuccEmergency = value;
    }

    /**
     * Gets the value of the connEstabSuccHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccHighPriorityAccess() {
        return connEstabSuccHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabSuccHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccHighPriorityAccess(JAXBElement<Integer> value) {
        this.connEstabSuccHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccMtAccess() {
        return connEstabSuccMtAccess;
    }

    /**
     * Sets the value of the connEstabSuccMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccMtAccess(JAXBElement<Integer> value) {
        this.connEstabSuccMtAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccMoSignalling() {
        return connEstabSuccMoSignalling;
    }

    /**
     * Sets the value of the connEstabSuccMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccMoSignalling(JAXBElement<Integer> value) {
        this.connEstabSuccMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabSuccMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccMoData() {
        return connEstabSuccMoData;
    }

    /**
     * Sets the value of the connEstabSuccMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccMoData(JAXBElement<Integer> value) {
        this.connEstabSuccMoData = value;
    }

    /**
     * Gets the value of the connEstabSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccSum() {
        return connEstabSuccSum;
    }

    /**
     * Sets the value of the connEstabSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccSum(JAXBElement<Integer> value) {
        this.connEstabSuccSum = value;
    }

    /**
     * Gets the value of the connEstabFailEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailEmergency() {
        return connEstabFailEmergency;
    }

    /**
     * Sets the value of the connEstabFailEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailEmergency(JAXBElement<Integer> value) {
        this.connEstabFailEmergency = value;
    }

    /**
     * Gets the value of the connEstabFailHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailHighPriorityAccess() {
        return connEstabFailHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabFailHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailHighPriorityAccess(JAXBElement<Integer> value) {
        this.connEstabFailHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabFailMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailMtAccess() {
        return connEstabFailMtAccess;
    }

    /**
     * Sets the value of the connEstabFailMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailMtAccess(JAXBElement<Integer> value) {
        this.connEstabFailMtAccess = value;
    }

    /**
     * Gets the value of the connEstabFailMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailMoSignalling() {
        return connEstabFailMoSignalling;
    }

    /**
     * Sets the value of the connEstabFailMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailMoSignalling(JAXBElement<Integer> value) {
        this.connEstabFailMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabFailMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailMoData() {
        return connEstabFailMoData;
    }

    /**
     * Sets the value of the connEstabFailMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailMoData(JAXBElement<Integer> value) {
        this.connEstabFailMoData = value;
    }

    /**
     * Gets the value of the connEstabFailSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailSum() {
        return connEstabFailSum;
    }

    /**
     * Sets the value of the connEstabFailSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailSum(JAXBElement<Integer> value) {
        this.connEstabFailSum = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailNBCauseCongestion() {
        return connEstabFailNBCauseCongestion;
    }

    /**
     * Sets the value of the connEstabFailNBCauseCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailNBCauseCongestion(JAXBElement<Integer> value) {
        this.connEstabFailNBCauseCongestion = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailNBCauseUnspecified() {
        return connEstabFailNBCauseUnspecified;
    }

    /**
     * Sets the value of the connEstabFailNBCauseUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailNBCauseUnspecified(JAXBElement<Integer> value) {
        this.connEstabFailNBCauseUnspecified = value;
    }

    /**
     * Gets the value of the connReEstabAttReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabAttReconfigurationFailure() {
        return connReEstabAttReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabAttReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabAttReconfigurationFailure(JAXBElement<Integer> value) {
        this.connReEstabAttReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabAttHandoverFailure() {
        return connReEstabAttHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabAttHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabAttHandoverFailure(JAXBElement<Integer> value) {
        this.connReEstabAttHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabAttOtherFailure() {
        return connReEstabAttOtherFailure;
    }

    /**
     * Sets the value of the connReEstabAttOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabAttOtherFailure(JAXBElement<Integer> value) {
        this.connReEstabAttOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabAttSum() {
        return connReEstabAttSum;
    }

    /**
     * Sets the value of the connReEstabAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabAttSum(JAXBElement<Integer> value) {
        this.connReEstabAttSum = value;
    }

    /**
     * Gets the value of the connReEstabSuccReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabSuccReconfigurationFailure() {
        return connReEstabSuccReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabSuccReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabSuccReconfigurationFailure(JAXBElement<Integer> value) {
        this.connReEstabSuccReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabSuccHandoverFailure() {
        return connReEstabSuccHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabSuccHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabSuccHandoverFailure(JAXBElement<Integer> value) {
        this.connReEstabSuccHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabSuccOtherFailure() {
        return connReEstabSuccOtherFailure;
    }

    /**
     * Sets the value of the connReEstabSuccOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabSuccOtherFailure(JAXBElement<Integer> value) {
        this.connReEstabSuccOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabSuccSum() {
        return connReEstabSuccSum;
    }

    /**
     * Sets the value of the connReEstabSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabSuccSum(JAXBElement<Integer> value) {
        this.connReEstabSuccSum = value;
    }

    /**
     * Gets the value of the connReEstabFailReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabFailReconfigurationFailure() {
        return connReEstabFailReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabFailReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabFailReconfigurationFailure(JAXBElement<Integer> value) {
        this.connReEstabFailReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabFailHandoverFailure() {
        return connReEstabFailHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabFailHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabFailHandoverFailure(JAXBElement<Integer> value) {
        this.connReEstabFailHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabFailOtherFailure() {
        return connReEstabFailOtherFailure;
    }

    /**
     * Sets the value of the connReEstabFailOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabFailOtherFailure(JAXBElement<Integer> value) {
        this.connReEstabFailOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabFailSum() {
        return connReEstabFailSum;
    }

    /**
     * Sets the value of the connReEstabFailSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabFailSum(JAXBElement<Integer> value) {
        this.connReEstabFailSum = value;
    }

    /**
     * Gets the value of the connMeanVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnMeanVal() {
        return connMeanVal;
    }

    /**
     * Sets the value of the connMeanVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnMeanVal(JAXBElement<Integer> value) {
        this.connMeanVal = value;
    }

    /**
     * Gets the value of the connMaxVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnMaxVal() {
        return connMaxVal;
    }

    /**
     * Sets the value of the connMaxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnMaxVal(JAXBElement<Integer> value) {
        this.connMaxVal = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanEmergency() {
        return connEstabTimeMeanEmergency;
    }

    /**
     * Sets the value of the connEstabTimeMeanEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanEmergency(JAXBElement<Integer> value) {
        this.connEstabTimeMeanEmergency = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanHighPriorityAccess() {
        return connEstabTimeMeanHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabTimeMeanHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanHighPriorityAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMeanHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanMtAccess() {
        return connEstabTimeMeanMtAccess;
    }

    /**
     * Sets the value of the connEstabTimeMeanMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanMtAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMeanMtAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanMoSignalling() {
        return connEstabTimeMeanMoSignalling;
    }

    /**
     * Sets the value of the connEstabTimeMeanMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanMoSignalling(JAXBElement<Integer> value) {
        this.connEstabTimeMeanMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanMoData() {
        return connEstabTimeMeanMoData;
    }

    /**
     * Sets the value of the connEstabTimeMeanMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanMoData(JAXBElement<Integer> value) {
        this.connEstabTimeMeanMoData = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxEmergency() {
        return connEstabTimeMaxEmergency;
    }

    /**
     * Sets the value of the connEstabTimeMaxEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxEmergency(JAXBElement<Integer> value) {
        this.connEstabTimeMaxEmergency = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxHighPriorityAccess() {
        return connEstabTimeMaxHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabTimeMaxHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxHighPriorityAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMaxHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxMtAccess() {
        return connEstabTimeMaxMtAccess;
    }

    /**
     * Sets the value of the connEstabTimeMaxMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxMtAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMaxMtAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxMoSignalling() {
        return connEstabTimeMaxMoSignalling;
    }

    /**
     * Sets the value of the connEstabTimeMaxMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxMoSignalling(JAXBElement<Integer> value) {
        this.connEstabTimeMaxMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxMoData() {
        return connEstabTimeMaxMoData;
    }

    /**
     * Sets the value of the connEstabTimeMaxMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxMoData(JAXBElement<Integer> value) {
        this.connEstabTimeMaxMoData = value;
    }

    /**
     * Gets the value of the ueContextRelReqSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqSum() {
        return ueContextRelReqSum;
    }

    /**
     * Sets the value of the ueContextRelReqSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqSum(JAXBElement<Integer> value) {
        this.ueContextRelReqSum = value;
    }

    /**
     * Gets the value of the ueContextRelSuccNbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelSuccNbr() {
        return ueContextRelSuccNbr;
    }

    /**
     * Sets the value of the ueContextRelSuccNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelSuccNbr(JAXBElement<Integer> value) {
        this.ueContextRelSuccNbr = value;
    }

    /**
     * Gets the value of the connEstabTimeMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMean() {
        return connEstabTimeMean;
    }

    /**
     * Sets the value of the connEstabTimeMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMean(JAXBElement<Integer> value) {
        this.connEstabTimeMean = value;
    }

    /**
     * Gets the value of the connEstabTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMax() {
        return connEstabTimeMax;
    }

    /**
     * Sets the value of the connEstabTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMax(JAXBElement<Integer> value) {
        this.connEstabTimeMax = value;
    }

    /**
     * Gets the value of the connEstabAttDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabAttDelayTolerantAccess() {
        return connEstabAttDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabAttDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabAttDelayTolerantAccess(JAXBElement<Integer> value) {
        this.connEstabAttDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabSuccDelayTolerantAccess() {
        return connEstabSuccDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabSuccDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabSuccDelayTolerantAccess(JAXBElement<Integer> value) {
        this.connEstabSuccDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabFailDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailDelayTolerantAccess() {
        return connEstabFailDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabFailDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailDelayTolerantAccess(JAXBElement<Integer> value) {
        this.connEstabFailDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseEnergySaving property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailNBCauseEnergySaving() {
        return connEstabFailNBCauseEnergySaving;
    }

    /**
     * Sets the value of the connEstabFailNBCauseEnergySaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailNBCauseEnergySaving(JAXBElement<Integer> value) {
        this.connEstabFailNBCauseEnergySaving = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseUeConnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqCauseUeConnLoss() {
        return ueContextRelReqCauseUeConnLoss;
    }

    /**
     * Sets the value of the ueContextRelReqCauseUeConnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqCauseUeConnLoss(JAXBElement<Integer> value) {
        this.ueContextRelReqCauseUeConnLoss = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseUserInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqCauseUserInactivity() {
        return ueContextRelReqCauseUserInactivity;
    }

    /**
     * Sets the value of the ueContextRelReqCauseUserInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqCauseUserInactivity(JAXBElement<Integer> value) {
        this.ueContextRelReqCauseUserInactivity = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseCsFallbackTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqCauseCsFallbackTriggered() {
        return ueContextRelReqCauseCsFallbackTriggered;
    }

    /**
     * Sets the value of the ueContextRelReqCauseCsFallbackTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqCauseCsFallbackTriggered(JAXBElement<Integer> value) {
        this.ueContextRelReqCauseCsFallbackTriggered = value;
    }

    /**
     * Gets the value of the connectedUesCat1Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat1Avg() {
        return connectedUesCat1Avg;
    }

    /**
     * Sets the value of the connectedUesCat1Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat1Avg(JAXBElement<Integer> value) {
        this.connectedUesCat1Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat2Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat2Avg() {
        return connectedUesCat2Avg;
    }

    /**
     * Sets the value of the connectedUesCat2Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat2Avg(JAXBElement<Integer> value) {
        this.connectedUesCat2Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat3Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat3Avg() {
        return connectedUesCat3Avg;
    }

    /**
     * Sets the value of the connectedUesCat3Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat3Avg(JAXBElement<Integer> value) {
        this.connectedUesCat3Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat4Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat4Avg() {
        return connectedUesCat4Avg;
    }

    /**
     * Sets the value of the connectedUesCat4Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat4Avg(JAXBElement<Integer> value) {
        this.connectedUesCat4Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat5Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat5Avg() {
        return connectedUesCat5Avg;
    }

    /**
     * Sets the value of the connectedUesCat5Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat5Avg(JAXBElement<Integer> value) {
        this.connectedUesCat5Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat6Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat6Avg() {
        return connectedUesCat6Avg;
    }

    /**
     * Sets the value of the connectedUesCat6Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat6Avg(JAXBElement<Integer> value) {
        this.connectedUesCat6Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat7Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat7Avg() {
        return connectedUesCat7Avg;
    }

    /**
     * Sets the value of the connectedUesCat7Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat7Avg(JAXBElement<Integer> value) {
        this.connectedUesCat7Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat8Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat8Avg() {
        return connectedUesCat8Avg;
    }

    /**
     * Sets the value of the connectedUesCat8Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat8Avg(JAXBElement<Integer> value) {
        this.connectedUesCat8Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat9Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat9Avg() {
        return connectedUesCat9Avg;
    }

    /**
     * Sets the value of the connectedUesCat9Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat9Avg(JAXBElement<Integer> value) {
        this.connectedUesCat9Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat10Avg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat10Avg() {
        return connectedUesCat10Avg;
    }

    /**
     * Sets the value of the connectedUesCat10Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat10Avg(JAXBElement<Integer> value) {
        this.connectedUesCat10Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat1Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat1Min() {
        return connectedUesCat1Min;
    }

    /**
     * Sets the value of the connectedUesCat1Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat1Min(JAXBElement<Integer> value) {
        this.connectedUesCat1Min = value;
    }

    /**
     * Gets the value of the connectedUesCat2Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat2Min() {
        return connectedUesCat2Min;
    }

    /**
     * Sets the value of the connectedUesCat2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat2Min(JAXBElement<Integer> value) {
        this.connectedUesCat2Min = value;
    }

    /**
     * Gets the value of the connectedUesCat3Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat3Min() {
        return connectedUesCat3Min;
    }

    /**
     * Sets the value of the connectedUesCat3Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat3Min(JAXBElement<Integer> value) {
        this.connectedUesCat3Min = value;
    }

    /**
     * Gets the value of the connectedUesCat4Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat4Min() {
        return connectedUesCat4Min;
    }

    /**
     * Sets the value of the connectedUesCat4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat4Min(JAXBElement<Integer> value) {
        this.connectedUesCat4Min = value;
    }

    /**
     * Gets the value of the connectedUesCat5Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat5Min() {
        return connectedUesCat5Min;
    }

    /**
     * Sets the value of the connectedUesCat5Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat5Min(JAXBElement<Integer> value) {
        this.connectedUesCat5Min = value;
    }

    /**
     * Gets the value of the connectedUesCat6Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat6Min() {
        return connectedUesCat6Min;
    }

    /**
     * Sets the value of the connectedUesCat6Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat6Min(JAXBElement<Integer> value) {
        this.connectedUesCat6Min = value;
    }

    /**
     * Gets the value of the connectedUesCat7Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat7Min() {
        return connectedUesCat7Min;
    }

    /**
     * Sets the value of the connectedUesCat7Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat7Min(JAXBElement<Integer> value) {
        this.connectedUesCat7Min = value;
    }

    /**
     * Gets the value of the connectedUesCat8Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat8Min() {
        return connectedUesCat8Min;
    }

    /**
     * Sets the value of the connectedUesCat8Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat8Min(JAXBElement<Integer> value) {
        this.connectedUesCat8Min = value;
    }

    /**
     * Gets the value of the connectedUesCat9Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat9Min() {
        return connectedUesCat9Min;
    }

    /**
     * Sets the value of the connectedUesCat9Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat9Min(JAXBElement<Integer> value) {
        this.connectedUesCat9Min = value;
    }

    /**
     * Gets the value of the connectedUesCat10Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat10Min() {
        return connectedUesCat10Min;
    }

    /**
     * Sets the value of the connectedUesCat10Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat10Min(JAXBElement<Integer> value) {
        this.connectedUesCat10Min = value;
    }

    /**
     * Gets the value of the connectedUesCat1Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat1Max() {
        return connectedUesCat1Max;
    }

    /**
     * Sets the value of the connectedUesCat1Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat1Max(JAXBElement<Integer> value) {
        this.connectedUesCat1Max = value;
    }

    /**
     * Gets the value of the connectedUesCat2Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat2Max() {
        return connectedUesCat2Max;
    }

    /**
     * Sets the value of the connectedUesCat2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat2Max(JAXBElement<Integer> value) {
        this.connectedUesCat2Max = value;
    }

    /**
     * Gets the value of the connectedUesCat3Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat3Max() {
        return connectedUesCat3Max;
    }

    /**
     * Sets the value of the connectedUesCat3Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat3Max(JAXBElement<Integer> value) {
        this.connectedUesCat3Max = value;
    }

    /**
     * Gets the value of the connectedUesCat4Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat4Max() {
        return connectedUesCat4Max;
    }

    /**
     * Sets the value of the connectedUesCat4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat4Max(JAXBElement<Integer> value) {
        this.connectedUesCat4Max = value;
    }

    /**
     * Gets the value of the connectedUesCat5Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat5Max() {
        return connectedUesCat5Max;
    }

    /**
     * Sets the value of the connectedUesCat5Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat5Max(JAXBElement<Integer> value) {
        this.connectedUesCat5Max = value;
    }

    /**
     * Gets the value of the connectedUesCat6Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat6Max() {
        return connectedUesCat6Max;
    }

    /**
     * Sets the value of the connectedUesCat6Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat6Max(JAXBElement<Integer> value) {
        this.connectedUesCat6Max = value;
    }

    /**
     * Gets the value of the connectedUesCat7Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat7Max() {
        return connectedUesCat7Max;
    }

    /**
     * Sets the value of the connectedUesCat7Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat7Max(JAXBElement<Integer> value) {
        this.connectedUesCat7Max = value;
    }

    /**
     * Gets the value of the connectedUesCat8Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat8Max() {
        return connectedUesCat8Max;
    }

    /**
     * Sets the value of the connectedUesCat8Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat8Max(JAXBElement<Integer> value) {
        this.connectedUesCat8Max = value;
    }

    /**
     * Gets the value of the connectedUesCat9Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat9Max() {
        return connectedUesCat9Max;
    }

    /**
     * Sets the value of the connectedUesCat9Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat9Max(JAXBElement<Integer> value) {
        this.connectedUesCat9Max = value;
    }

    /**
     * Gets the value of the connectedUesCat10Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesCat10Max() {
        return connectedUesCat10Max;
    }

    /**
     * Sets the value of the connectedUesCat10Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesCat10Max(JAXBElement<Integer> value) {
        this.connectedUesCat10Max = value;
    }

    /**
     * Gets the value of the connectedUesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesTotal() {
        return connectedUesTotal;
    }

    /**
     * Sets the value of the connectedUesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesTotal(JAXBElement<Integer> value) {
        this.connectedUesTotal = value;
    }

    /**
     * Gets the value of the connectedUesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesMin() {
        return connectedUesMin;
    }

    /**
     * Sets the value of the connectedUesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesMin(JAXBElement<Integer> value) {
        this.connectedUesMin = value;
    }

    /**
     * Gets the value of the connectedUesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnectedUesMax() {
        return connectedUesMax;
    }

    /**
     * Sets the value of the connectedUesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnectedUesMax(JAXBElement<Integer> value) {
        this.connectedUesMax = value;
    }

    /**
     * Gets the value of the connReconfigAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReconfigAttempt() {
        return connReconfigAttempt;
    }

    /**
     * Sets the value of the connReconfigAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReconfigAttempt(JAXBElement<Integer> value) {
        this.connReconfigAttempt = value;
    }

    /**
     * Gets the value of the connReconfigSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReconfigSuccess() {
        return connReconfigSuccess;
    }

    /**
     * Sets the value of the connReconfigSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReconfigSuccess(JAXBElement<Integer> value) {
        this.connReconfigSuccess = value;
    }

    /**
     * Gets the value of the ueContextRelReqRedirectionTowards1XRTT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqRedirectionTowards1XRTT() {
        return ueContextRelReqRedirectionTowards1XRTT;
    }

    /**
     * Sets the value of the ueContextRelReqRedirectionTowards1XRTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqRedirectionTowards1XRTT(JAXBElement<Integer> value) {
        this.ueContextRelReqRedirectionTowards1XRTT = value;
    }

    /**
     * Gets the value of the ueContextRelReqInterRATRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqInterRATRedirection() {
        return ueContextRelReqInterRATRedirection;
    }

    /**
     * Sets the value of the ueContextRelReqInterRATRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqInterRATRedirection(JAXBElement<Integer> value) {
        this.ueContextRelReqInterRATRedirection = value;
    }

    /**
     * Gets the value of the ueContextRelReqRNwTx2RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqRNwTx2RelocOverallExpiry() {
        return ueContextRelReqRNwTx2RelocOverallExpiry;
    }

    /**
     * Sets the value of the ueContextRelReqRNwTx2RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqRNwTx2RelocOverallExpiry(JAXBElement<Integer> value) {
        this.ueContextRelReqRNwTx2RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the ueContextRelReqRNwTS1RelocOverallExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqRNwTS1RelocOverallExpiry() {
        return ueContextRelReqRNwTS1RelocOverallExpiry;
    }

    /**
     * Sets the value of the ueContextRelReqRNwTS1RelocOverallExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqRNwTS1RelocOverallExpiry(JAXBElement<Integer> value) {
        this.ueContextRelReqRNwTS1RelocOverallExpiry = value;
    }

    /**
     * Gets the value of the ueContextRelReqRNwRelDueTOEUtranGenReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqRNwRelDueTOEUtranGenReason() {
        return ueContextRelReqRNwRelDueTOEUtranGenReason;
    }

    /**
     * Sets the value of the ueContextRelReqRNwRelDueTOEUtranGenReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqRNwRelDueTOEUtranGenReason(JAXBElement<Integer> value) {
        this.ueContextRelReqRNwRelDueTOEUtranGenReason = value;
    }

    /**
     * Gets the value of the ueContextRelReqRNwHOFailureTEnbEpcOrTSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqRNwHOFailureTEnbEpcOrTSys() {
        return ueContextRelReqRNwHOFailureTEnbEpcOrTSys;
    }

    /**
     * Sets the value of the ueContextRelReqRNwHOFailureTEnbEpcOrTSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqRNwHOFailureTEnbEpcOrTSys(JAXBElement<Integer> value) {
        this.ueContextRelReqRNwHOFailureTEnbEpcOrTSys = value;
    }

    /**
     * Gets the value of the ueContextRelReqFailInRadioInterfaceProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqFailInRadioInterfaceProcedure() {
        return ueContextRelReqFailInRadioInterfaceProcedure;
    }

    /**
     * Sets the value of the ueContextRelReqFailInRadioInterfaceProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqFailInRadioInterfaceProcedure(JAXBElement<Integer> value) {
        this.ueContextRelReqFailInRadioInterfaceProcedure = value;
    }

    /**
     * Gets the value of the ueContextRelReqUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqUnspecified() {
        return ueContextRelReqUnspecified;
    }

    /**
     * Sets the value of the ueContextRelReqUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqUnspecified(JAXBElement<Integer> value) {
        this.ueContextRelReqUnspecified = value;
    }

    /**
     * Gets the value of the ueContextRelReqTPTransportResourceUnavailable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqTPTransportResourceUnavailable() {
        return ueContextRelReqTPTransportResourceUnavailable;
    }

    /**
     * Sets the value of the ueContextRelReqTPTransportResourceUnavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqTPTransportResourceUnavailable(JAXBElement<Integer> value) {
        this.ueContextRelReqTPTransportResourceUnavailable = value;
    }

    /**
     * Gets the value of the ueContextRelReqCsgSubscriptionExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqCsgSubscriptionExpiry() {
        return ueContextRelReqCsgSubscriptionExpiry;
    }

    /**
     * Sets the value of the ueContextRelReqCsgSubscriptionExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqCsgSubscriptionExpiry(JAXBElement<Integer> value) {
        this.ueContextRelReqCsgSubscriptionExpiry = value;
    }

    /**
     * Gets the value of the ueContextRelReqUeNotAvailableForPsService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqUeNotAvailableForPsService() {
        return ueContextRelReqUeNotAvailableForPsService;
    }

    /**
     * Sets the value of the ueContextRelReqUeNotAvailableForPsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqUeNotAvailableForPsService(JAXBElement<Integer> value) {
        this.ueContextRelReqUeNotAvailableForPsService = value;
    }

    /**
     * Gets the value of the callDropRlcMaxEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxEmergency() {
        return callDropRlcMaxEmergency;
    }

    /**
     * Sets the value of the callDropRlcMaxEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxEmergency(JAXBElement<Integer> value) {
        this.callDropRlcMaxEmergency = value;
    }

    /**
     * Gets the value of the callDropRlcMaxHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxHighPriorityAccess() {
        return callDropRlcMaxHighPriorityAccess;
    }

    /**
     * Sets the value of the callDropRlcMaxHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxHighPriorityAccess(JAXBElement<Integer> value) {
        this.callDropRlcMaxHighPriorityAccess = value;
    }

    /**
     * Gets the value of the callDropRlcMaxMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxMtAccess() {
        return callDropRlcMaxMtAccess;
    }

    /**
     * Sets the value of the callDropRlcMaxMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxMtAccess(JAXBElement<Integer> value) {
        this.callDropRlcMaxMtAccess = value;
    }

    /**
     * Gets the value of the callDropRlcMaxMoSignaling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxMoSignaling() {
        return callDropRlcMaxMoSignaling;
    }

    /**
     * Sets the value of the callDropRlcMaxMoSignaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxMoSignaling(JAXBElement<Integer> value) {
        this.callDropRlcMaxMoSignaling = value;
    }

    /**
     * Gets the value of the callDropRlcMaxMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxMoData() {
        return callDropRlcMaxMoData;
    }

    /**
     * Sets the value of the callDropRlcMaxMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxMoData(JAXBElement<Integer> value) {
        this.callDropRlcMaxMoData = value;
    }

    /**
     * Gets the value of the callDropRlcMaxDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxDelayTolerantAccess() {
        return callDropRlcMaxDelayTolerantAccess;
    }

    /**
     * Sets the value of the callDropRlcMaxDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxDelayTolerantAccess(JAXBElement<Integer> value) {
        this.callDropRlcMaxDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the callDropRlcMaxHandover property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCallDropRlcMaxHandover() {
        return callDropRlcMaxHandover;
    }

    /**
     * Sets the value of the callDropRlcMaxHandover property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCallDropRlcMaxHandover(JAXBElement<Integer> value) {
        this.callDropRlcMaxHandover = value;
    }

    /**
     * Gets the value of the linkInactivityRlfEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfEmergency() {
        return linkInactivityRlfEmergency;
    }

    /**
     * Sets the value of the linkInactivityRlfEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfEmergency(JAXBElement<Integer> value) {
        this.linkInactivityRlfEmergency = value;
    }

    /**
     * Gets the value of the linkInactivityRlfHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfHighPriorityAccess() {
        return linkInactivityRlfHighPriorityAccess;
    }

    /**
     * Sets the value of the linkInactivityRlfHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfHighPriorityAccess(JAXBElement<Integer> value) {
        this.linkInactivityRlfHighPriorityAccess = value;
    }

    /**
     * Gets the value of the linkInactivityRlfMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfMtAccess() {
        return linkInactivityRlfMtAccess;
    }

    /**
     * Sets the value of the linkInactivityRlfMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfMtAccess(JAXBElement<Integer> value) {
        this.linkInactivityRlfMtAccess = value;
    }

    /**
     * Gets the value of the linkInactivityRlfMoSignaling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfMoSignaling() {
        return linkInactivityRlfMoSignaling;
    }

    /**
     * Sets the value of the linkInactivityRlfMoSignaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfMoSignaling(JAXBElement<Integer> value) {
        this.linkInactivityRlfMoSignaling = value;
    }

    /**
     * Gets the value of the linkInactivityRlfMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfMoData() {
        return linkInactivityRlfMoData;
    }

    /**
     * Sets the value of the linkInactivityRlfMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfMoData(JAXBElement<Integer> value) {
        this.linkInactivityRlfMoData = value;
    }

    /**
     * Gets the value of the linkInactivityRlfDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfDelayTolerantAccess() {
        return linkInactivityRlfDelayTolerantAccess;
    }

    /**
     * Sets the value of the linkInactivityRlfDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfDelayTolerantAccess(JAXBElement<Integer> value) {
        this.linkInactivityRlfDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the linkInactivityRlfHandover property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkInactivityRlfHandover() {
        return linkInactivityRlfHandover;
    }

    /**
     * Sets the value of the linkInactivityRlfHandover property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkInactivityRlfHandover(JAXBElement<Integer> value) {
        this.linkInactivityRlfHandover = value;
    }

    /**
     * Gets the value of the ueContextRelCommUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommUnspecified() {
        return ueContextRelCommUnspecified;
    }

    /**
     * Sets the value of the ueContextRelCommUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommUnspecified(JAXBElement<Integer> value) {
        this.ueContextRelCommUnspecified = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectEmergency() {
        return mmeOverloadRejectEmergency;
    }

    /**
     * Sets the value of the mmeOverloadRejectEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectEmergency(JAXBElement<Integer> value) {
        this.mmeOverloadRejectEmergency = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectHighPriorityAccess() {
        return mmeOverloadRejectHighPriorityAccess;
    }

    /**
     * Sets the value of the mmeOverloadRejectHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectHighPriorityAccess(JAXBElement<Integer> value) {
        this.mmeOverloadRejectHighPriorityAccess = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectMtAccess() {
        return mmeOverloadRejectMtAccess;
    }

    /**
     * Sets the value of the mmeOverloadRejectMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectMtAccess(JAXBElement<Integer> value) {
        this.mmeOverloadRejectMtAccess = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectMoSignalling() {
        return mmeOverloadRejectMoSignalling;
    }

    /**
     * Sets the value of the mmeOverloadRejectMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectMoSignalling(JAXBElement<Integer> value) {
        this.mmeOverloadRejectMoSignalling = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectMoData() {
        return mmeOverloadRejectMoData;
    }

    /**
     * Sets the value of the mmeOverloadRejectMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectMoData(JAXBElement<Integer> value) {
        this.mmeOverloadRejectMoData = value;
    }

    /**
     * Gets the value of the mmeOverloadRejectDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMmeOverloadRejectDelayTolerantAccess() {
        return mmeOverloadRejectDelayTolerantAccess;
    }

    /**
     * Sets the value of the mmeOverloadRejectDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMmeOverloadRejectDelayTolerantAccess(JAXBElement<Integer> value) {
        this.mmeOverloadRejectDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the ueContextRelCommNASNormalRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommNASNormalRelease() {
        return ueContextRelCommNASNormalRelease;
    }

    /**
     * Sets the value of the ueContextRelCommNASNormalRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommNASNormalRelease(JAXBElement<Integer> value) {
        this.ueContextRelCommNASNormalRelease = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwTS1RelocOverAllExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwTS1RelocOverAllExpiry() {
        return ueContextRelCommRNwTS1RelocOverAllExpiry;
    }

    /**
     * Sets the value of the ueContextRelCommRNwTS1RelocOverAllExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwTS1RelocOverAllExpiry(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwTS1RelocOverAllExpiry = value;
    }

    /**
     * Gets the value of the ueContextRelCommRadioNwtx2RelocOverAllExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRadioNwtx2RelocOverAllExpiry() {
        return ueContextRelCommRadioNwtx2RelocOverAllExpiry;
    }

    /**
     * Sets the value of the ueContextRelCommRadioNwtx2RelocOverAllExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRadioNwtx2RelocOverAllExpiry(JAXBElement<Integer> value) {
        this.ueContextRelCommRadioNwtx2RelocOverAllExpiry = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwRelDueToEutranGenReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwRelDueToEutranGenReason() {
        return ueContextRelCommRNwRelDueToEutranGenReason;
    }

    /**
     * Sets the value of the ueContextRelCommRNwRelDueToEutranGenReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwRelDueToEutranGenReason(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwRelDueToEutranGenReason = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwUserInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwUserInactivity() {
        return ueContextRelCommRNwUserInactivity;
    }

    /**
     * Sets the value of the ueContextRelCommRNwUserInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwUserInactivity(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwUserInactivity = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwRadioConnWithUeLost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwRadioConnWithUeLost() {
        return ueContextRelCommRNwRadioConnWithUeLost;
    }

    /**
     * Sets the value of the ueContextRelCommRNwRadioConnWithUeLost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwRadioConnWithUeLost(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwRadioConnWithUeLost = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwLoadBalTauReq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwLoadBalTauReq() {
        return ueContextRelCommRNwLoadBalTauReq;
    }

    /**
     * Sets the value of the ueContextRelCommRNwLoadBalTauReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwLoadBalTauReq(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwLoadBalTauReq = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwCSFBkTrig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwCSFBkTrig() {
        return ueContextRelCommRNwCSFBkTrig;
    }

    /**
     * Sets the value of the ueContextRelCommRNwCSFBkTrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwCSFBkTrig(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwCSFBkTrig = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwRedirectionTowards1XRTT property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwRedirectionTowards1XRTT() {
        return ueContextRelCommRNwRedirectionTowards1XRTT;
    }

    /**
     * Sets the value of the ueContextRelCommRNwRedirectionTowards1XRTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwRedirectionTowards1XRTT(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwRedirectionTowards1XRTT = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwInterratRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwInterratRedirection() {
        return ueContextRelCommRNwInterratRedirection;
    }

    /**
     * Sets the value of the ueContextRelCommRNwInterratRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwInterratRedirection(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwInterratRedirection = value;
    }

    /**
     * Gets the value of the ueContextRelCommNASAuthenticationEnum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommNASAuthenticationEnum() {
        return ueContextRelCommNASAuthenticationEnum;
    }

    /**
     * Sets the value of the ueContextRelCommNASAuthenticationEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommNASAuthenticationEnum(JAXBElement<Integer> value) {
        this.ueContextRelCommNASAuthenticationEnum = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwSuccHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwSuccHO() {
        return ueContextRelCommRNwSuccHO;
    }

    /**
     * Sets the value of the ueContextRelCommRNwSuccHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwSuccHO(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwSuccHO = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwHoFailInTargEPCEnbOrTargSys() {
        return ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys;
    }

    /**
     * Sets the value of the ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwHoFailInTargEPCEnbOrTargSys(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwHoFailInTargEPCEnbOrTargSys = value;
    }

    /**
     * Gets the value of the ueContextRelCommRNwFailInRadioInterfProc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommRNwFailInRadioInterfProc() {
        return ueContextRelCommRNwFailInRadioInterfProc;
    }

    /**
     * Sets the value of the ueContextRelCommRNwFailInRadioInterfProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommRNwFailInRadioInterfProc(JAXBElement<Integer> value) {
        this.ueContextRelCommRNwFailInRadioInterfProc = value;
    }

    /**
     * Gets the value of the ueContextRelCommTPTransportResUnavail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommTPTransportResUnavail() {
        return ueContextRelCommTPTransportResUnavail;
    }

    /**
     * Sets the value of the ueContextRelCommTPTransportResUnavail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommTPTransportResUnavail(JAXBElement<Integer> value) {
        this.ueContextRelCommTPTransportResUnavail = value;
    }

    /**
     * Gets the value of the ueContextRelCommNASDetach property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelCommNASDetach() {
        return ueContextRelCommNASDetach;
    }

    /**
     * Sets the value of the ueContextRelCommNASDetach property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelCommNASDetach(JAXBElement<Integer> value) {
        this.ueContextRelCommNASDetach = value;
    }

    /**
     * Gets the value of the connEstabFailS1APSignallingFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabFailS1APSignallingFailure() {
        return connEstabFailS1APSignallingFailure;
    }

    /**
     * Sets the value of the connEstabFailS1APSignallingFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabFailS1APSignallingFailure(JAXBElement<Integer> value) {
        this.connEstabFailS1APSignallingFailure = value;
    }

    /**
     * Gets the value of the ueContextRelReqCallDrpS1ApLinkOutOfService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeContextRelReqCallDrpS1ApLinkOutOfService() {
        return ueContextRelReqCallDrpS1ApLinkOutOfService;
    }

    /**
     * Sets the value of the ueContextRelReqCallDrpS1ApLinkOutOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeContextRelReqCallDrpS1ApLinkOutOfService(JAXBElement<Integer> value) {
        this.ueContextRelReqCallDrpS1ApLinkOutOfService = value;
    }

    /**
     * Gets the value of the connReEstabFailS1APSignallingFailure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnReEstabFailS1APSignallingFailure() {
        return connReEstabFailS1APSignallingFailure;
    }

    /**
     * Sets the value of the connReEstabFailS1APSignallingFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnReEstabFailS1APSignallingFailure(JAXBElement<Integer> value) {
        this.connReEstabFailS1APSignallingFailure = value;
    }

}
