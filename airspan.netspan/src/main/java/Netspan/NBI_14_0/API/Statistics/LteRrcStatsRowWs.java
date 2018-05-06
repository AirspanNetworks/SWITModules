
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteRrcStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRrcStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttEmergency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttMtAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttMoData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccEmergency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccMtAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccMoData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailEmergency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailMtAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailMoData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailNBCauseCongestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailNBCauseUnspecified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabAttReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabAttHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabAttOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabAttSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabSuccReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabSuccHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabSuccOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabSuccSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabFailReconfigurationFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabFailHandoverFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabFailOtherFailure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnReEstabFailSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnMeanVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnMaxVal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMeanEmergency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMeanHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMeanMtAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMeanMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMeanMoData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMaxEmergency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMaxHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMaxMtAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMaxMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMaxMoData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeContextRelReqSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeContextRelSuccNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMean" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabTimeMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabAttDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabSuccDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnEstabFailNBCauseEnergySaving" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeContextRelReqCauseUeConnLoss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeContextRelReqCauseUserInactivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeContextRelReqCauseCsFallbackTriggered" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat1Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat2Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat3Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat4Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat5Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat6Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat7Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat8Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat9Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat10Avg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat1Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat2Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat3Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat4Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat5Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat6Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat7Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat8Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat9Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat10Min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat1Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat2Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat3Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat4Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat5Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat6Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat7Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat8Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat9Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesCat10Max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConnectedUesTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "connectedUesTotal"
})
public class LteRrcStatsRowWs {

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
    @XmlElement(name = "ConnEstabAttEmergency", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttEmergency;
    @XmlElement(name = "ConnEstabAttHighPriorityAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttHighPriorityAccess;
    @XmlElement(name = "ConnEstabAttMtAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttMtAccess;
    @XmlElement(name = "ConnEstabAttMoSignalling", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttMoSignalling;
    @XmlElement(name = "ConnEstabAttMoData", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttMoData;
    @XmlElement(name = "ConnEstabAttSum", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttSum;
    @XmlElement(name = "ConnEstabSuccEmergency", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccEmergency;
    @XmlElement(name = "ConnEstabSuccHighPriorityAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccHighPriorityAccess;
    @XmlElement(name = "ConnEstabSuccMtAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccMtAccess;
    @XmlElement(name = "ConnEstabSuccMoSignalling", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccMoSignalling;
    @XmlElement(name = "ConnEstabSuccMoData", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccMoData;
    @XmlElement(name = "ConnEstabSuccSum", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccSum;
    @XmlElement(name = "ConnEstabFailEmergency", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailEmergency;
    @XmlElement(name = "ConnEstabFailHighPriorityAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailHighPriorityAccess;
    @XmlElement(name = "ConnEstabFailMtAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailMtAccess;
    @XmlElement(name = "ConnEstabFailMoSignalling", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailMoSignalling;
    @XmlElement(name = "ConnEstabFailMoData", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailMoData;
    @XmlElement(name = "ConnEstabFailSum", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailSum;
    @XmlElement(name = "ConnEstabFailNBCauseCongestion", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailNBCauseCongestion;
    @XmlElement(name = "ConnEstabFailNBCauseUnspecified", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailNBCauseUnspecified;
    @XmlElement(name = "ConnReEstabAttReconfigurationFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabAttReconfigurationFailure;
    @XmlElement(name = "ConnReEstabAttHandoverFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabAttHandoverFailure;
    @XmlElement(name = "ConnReEstabAttOtherFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabAttOtherFailure;
    @XmlElement(name = "ConnReEstabAttSum", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabAttSum;
    @XmlElement(name = "ConnReEstabSuccReconfigurationFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabSuccReconfigurationFailure;
    @XmlElement(name = "ConnReEstabSuccHandoverFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabSuccHandoverFailure;
    @XmlElement(name = "ConnReEstabSuccOtherFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabSuccOtherFailure;
    @XmlElement(name = "ConnReEstabSuccSum", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabSuccSum;
    @XmlElement(name = "ConnReEstabFailReconfigurationFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabFailReconfigurationFailure;
    @XmlElement(name = "ConnReEstabFailHandoverFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabFailHandoverFailure;
    @XmlElement(name = "ConnReEstabFailOtherFailure", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabFailOtherFailure;
    @XmlElement(name = "ConnReEstabFailSum", required = true, type = Integer.class, nillable = true)
    protected Integer connReEstabFailSum;
    @XmlElement(name = "ConnMeanVal", required = true, type = Integer.class, nillable = true)
    protected Integer connMeanVal;
    @XmlElement(name = "ConnMaxVal", required = true, type = Integer.class, nillable = true)
    protected Integer connMaxVal;
    @XmlElement(name = "ConnEstabTimeMeanEmergency", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMeanEmergency;
    @XmlElement(name = "ConnEstabTimeMeanHighPriorityAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMeanHighPriorityAccess;
    @XmlElement(name = "ConnEstabTimeMeanMtAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMeanMtAccess;
    @XmlElement(name = "ConnEstabTimeMeanMoSignalling", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMeanMoSignalling;
    @XmlElement(name = "ConnEstabTimeMeanMoData", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMeanMoData;
    @XmlElement(name = "ConnEstabTimeMaxEmergency", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMaxEmergency;
    @XmlElement(name = "ConnEstabTimeMaxHighPriorityAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMaxHighPriorityAccess;
    @XmlElement(name = "ConnEstabTimeMaxMtAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMaxMtAccess;
    @XmlElement(name = "ConnEstabTimeMaxMoSignalling", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMaxMoSignalling;
    @XmlElement(name = "ConnEstabTimeMaxMoData", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMaxMoData;
    @XmlElement(name = "UeContextRelReqSum", required = true, type = Integer.class, nillable = true)
    protected Integer ueContextRelReqSum;
    @XmlElement(name = "UeContextRelSuccNbr", required = true, type = Integer.class, nillable = true)
    protected Integer ueContextRelSuccNbr;
    @XmlElement(name = "ConnEstabTimeMean", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMean;
    @XmlElement(name = "ConnEstabTimeMax", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabTimeMax;
    @XmlElement(name = "ConnEstabAttDelayTolerantAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabAttDelayTolerantAccess;
    @XmlElement(name = "ConnEstabSuccDelayTolerantAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabSuccDelayTolerantAccess;
    @XmlElement(name = "ConnEstabFailDelayTolerantAccess", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailDelayTolerantAccess;
    @XmlElement(name = "ConnEstabFailNBCauseEnergySaving", required = true, type = Integer.class, nillable = true)
    protected Integer connEstabFailNBCauseEnergySaving;
    @XmlElement(name = "UeContextRelReqCauseUeConnLoss", required = true, type = Integer.class, nillable = true)
    protected Integer ueContextRelReqCauseUeConnLoss;
    @XmlElement(name = "UeContextRelReqCauseUserInactivity", required = true, type = Integer.class, nillable = true)
    protected Integer ueContextRelReqCauseUserInactivity;
    @XmlElement(name = "UeContextRelReqCauseCsFallbackTriggered", required = true, type = Integer.class, nillable = true)
    protected Integer ueContextRelReqCauseCsFallbackTriggered;
    @XmlElement(name = "ConnectedUesCat1Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat1Avg;
    @XmlElement(name = "ConnectedUesCat2Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat2Avg;
    @XmlElement(name = "ConnectedUesCat3Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat3Avg;
    @XmlElement(name = "ConnectedUesCat4Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat4Avg;
    @XmlElement(name = "ConnectedUesCat5Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat5Avg;
    @XmlElement(name = "ConnectedUesCat6Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat6Avg;
    @XmlElement(name = "ConnectedUesCat7Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat7Avg;
    @XmlElement(name = "ConnectedUesCat8Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat8Avg;
    @XmlElement(name = "ConnectedUesCat9Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat9Avg;
    @XmlElement(name = "ConnectedUesCat10Avg", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat10Avg;
    @XmlElement(name = "ConnectedUesCat1Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat1Min;
    @XmlElement(name = "ConnectedUesCat2Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat2Min;
    @XmlElement(name = "ConnectedUesCat3Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat3Min;
    @XmlElement(name = "ConnectedUesCat4Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat4Min;
    @XmlElement(name = "ConnectedUesCat5Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat5Min;
    @XmlElement(name = "ConnectedUesCat6Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat6Min;
    @XmlElement(name = "ConnectedUesCat7Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat7Min;
    @XmlElement(name = "ConnectedUesCat8Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat8Min;
    @XmlElement(name = "ConnectedUesCat9Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat9Min;
    @XmlElement(name = "ConnectedUesCat10Min", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat10Min;
    @XmlElement(name = "ConnectedUesCat1Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat1Max;
    @XmlElement(name = "ConnectedUesCat2Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat2Max;
    @XmlElement(name = "ConnectedUesCat3Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat3Max;
    @XmlElement(name = "ConnectedUesCat4Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat4Max;
    @XmlElement(name = "ConnectedUesCat5Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat5Max;
    @XmlElement(name = "ConnectedUesCat6Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat6Max;
    @XmlElement(name = "ConnectedUesCat7Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat7Max;
    @XmlElement(name = "ConnectedUesCat8Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat8Max;
    @XmlElement(name = "ConnectedUesCat9Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat9Max;
    @XmlElement(name = "ConnectedUesCat10Max", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesCat10Max;
    @XmlElement(name = "ConnectedUesTotal", required = true, type = Integer.class, nillable = true)
    protected Integer connectedUesTotal;

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
     * Gets the value of the connEstabAttEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttEmergency() {
        return connEstabAttEmergency;
    }

    /**
     * Sets the value of the connEstabAttEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttEmergency(Integer value) {
        this.connEstabAttEmergency = value;
    }

    /**
     * Gets the value of the connEstabAttHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttHighPriorityAccess() {
        return connEstabAttHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabAttHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttHighPriorityAccess(Integer value) {
        this.connEstabAttHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabAttMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttMtAccess() {
        return connEstabAttMtAccess;
    }

    /**
     * Sets the value of the connEstabAttMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttMtAccess(Integer value) {
        this.connEstabAttMtAccess = value;
    }

    /**
     * Gets the value of the connEstabAttMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttMoSignalling() {
        return connEstabAttMoSignalling;
    }

    /**
     * Sets the value of the connEstabAttMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttMoSignalling(Integer value) {
        this.connEstabAttMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabAttMoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttMoData() {
        return connEstabAttMoData;
    }

    /**
     * Sets the value of the connEstabAttMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttMoData(Integer value) {
        this.connEstabAttMoData = value;
    }

    /**
     * Gets the value of the connEstabAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttSum() {
        return connEstabAttSum;
    }

    /**
     * Sets the value of the connEstabAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttSum(Integer value) {
        this.connEstabAttSum = value;
    }

    /**
     * Gets the value of the connEstabSuccEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccEmergency() {
        return connEstabSuccEmergency;
    }

    /**
     * Sets the value of the connEstabSuccEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccEmergency(Integer value) {
        this.connEstabSuccEmergency = value;
    }

    /**
     * Gets the value of the connEstabSuccHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccHighPriorityAccess() {
        return connEstabSuccHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabSuccHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccHighPriorityAccess(Integer value) {
        this.connEstabSuccHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccMtAccess() {
        return connEstabSuccMtAccess;
    }

    /**
     * Sets the value of the connEstabSuccMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccMtAccess(Integer value) {
        this.connEstabSuccMtAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccMoSignalling() {
        return connEstabSuccMoSignalling;
    }

    /**
     * Sets the value of the connEstabSuccMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccMoSignalling(Integer value) {
        this.connEstabSuccMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabSuccMoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccMoData() {
        return connEstabSuccMoData;
    }

    /**
     * Sets the value of the connEstabSuccMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccMoData(Integer value) {
        this.connEstabSuccMoData = value;
    }

    /**
     * Gets the value of the connEstabSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccSum() {
        return connEstabSuccSum;
    }

    /**
     * Sets the value of the connEstabSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccSum(Integer value) {
        this.connEstabSuccSum = value;
    }

    /**
     * Gets the value of the connEstabFailEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailEmergency() {
        return connEstabFailEmergency;
    }

    /**
     * Sets the value of the connEstabFailEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailEmergency(Integer value) {
        this.connEstabFailEmergency = value;
    }

    /**
     * Gets the value of the connEstabFailHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailHighPriorityAccess() {
        return connEstabFailHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabFailHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailHighPriorityAccess(Integer value) {
        this.connEstabFailHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabFailMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailMtAccess() {
        return connEstabFailMtAccess;
    }

    /**
     * Sets the value of the connEstabFailMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailMtAccess(Integer value) {
        this.connEstabFailMtAccess = value;
    }

    /**
     * Gets the value of the connEstabFailMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailMoSignalling() {
        return connEstabFailMoSignalling;
    }

    /**
     * Sets the value of the connEstabFailMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailMoSignalling(Integer value) {
        this.connEstabFailMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabFailMoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailMoData() {
        return connEstabFailMoData;
    }

    /**
     * Sets the value of the connEstabFailMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailMoData(Integer value) {
        this.connEstabFailMoData = value;
    }

    /**
     * Gets the value of the connEstabFailSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailSum() {
        return connEstabFailSum;
    }

    /**
     * Sets the value of the connEstabFailSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailSum(Integer value) {
        this.connEstabFailSum = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseCongestion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailNBCauseCongestion() {
        return connEstabFailNBCauseCongestion;
    }

    /**
     * Sets the value of the connEstabFailNBCauseCongestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailNBCauseCongestion(Integer value) {
        this.connEstabFailNBCauseCongestion = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailNBCauseUnspecified() {
        return connEstabFailNBCauseUnspecified;
    }

    /**
     * Sets the value of the connEstabFailNBCauseUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailNBCauseUnspecified(Integer value) {
        this.connEstabFailNBCauseUnspecified = value;
    }

    /**
     * Gets the value of the connReEstabAttReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabAttReconfigurationFailure() {
        return connReEstabAttReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabAttReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabAttReconfigurationFailure(Integer value) {
        this.connReEstabAttReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabAttHandoverFailure() {
        return connReEstabAttHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabAttHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabAttHandoverFailure(Integer value) {
        this.connReEstabAttHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabAttOtherFailure() {
        return connReEstabAttOtherFailure;
    }

    /**
     * Sets the value of the connReEstabAttOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabAttOtherFailure(Integer value) {
        this.connReEstabAttOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabAttSum() {
        return connReEstabAttSum;
    }

    /**
     * Sets the value of the connReEstabAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabAttSum(Integer value) {
        this.connReEstabAttSum = value;
    }

    /**
     * Gets the value of the connReEstabSuccReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabSuccReconfigurationFailure() {
        return connReEstabSuccReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabSuccReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabSuccReconfigurationFailure(Integer value) {
        this.connReEstabSuccReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabSuccHandoverFailure() {
        return connReEstabSuccHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabSuccHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabSuccHandoverFailure(Integer value) {
        this.connReEstabSuccHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabSuccOtherFailure() {
        return connReEstabSuccOtherFailure;
    }

    /**
     * Sets the value of the connReEstabSuccOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabSuccOtherFailure(Integer value) {
        this.connReEstabSuccOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabSuccSum() {
        return connReEstabSuccSum;
    }

    /**
     * Sets the value of the connReEstabSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabSuccSum(Integer value) {
        this.connReEstabSuccSum = value;
    }

    /**
     * Gets the value of the connReEstabFailReconfigurationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabFailReconfigurationFailure() {
        return connReEstabFailReconfigurationFailure;
    }

    /**
     * Sets the value of the connReEstabFailReconfigurationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabFailReconfigurationFailure(Integer value) {
        this.connReEstabFailReconfigurationFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailHandoverFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabFailHandoverFailure() {
        return connReEstabFailHandoverFailure;
    }

    /**
     * Sets the value of the connReEstabFailHandoverFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabFailHandoverFailure(Integer value) {
        this.connReEstabFailHandoverFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailOtherFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabFailOtherFailure() {
        return connReEstabFailOtherFailure;
    }

    /**
     * Sets the value of the connReEstabFailOtherFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabFailOtherFailure(Integer value) {
        this.connReEstabFailOtherFailure = value;
    }

    /**
     * Gets the value of the connReEstabFailSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnReEstabFailSum() {
        return connReEstabFailSum;
    }

    /**
     * Sets the value of the connReEstabFailSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnReEstabFailSum(Integer value) {
        this.connReEstabFailSum = value;
    }

    /**
     * Gets the value of the connMeanVal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnMeanVal() {
        return connMeanVal;
    }

    /**
     * Sets the value of the connMeanVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnMeanVal(Integer value) {
        this.connMeanVal = value;
    }

    /**
     * Gets the value of the connMaxVal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnMaxVal() {
        return connMaxVal;
    }

    /**
     * Sets the value of the connMaxVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnMaxVal(Integer value) {
        this.connMaxVal = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMeanEmergency() {
        return connEstabTimeMeanEmergency;
    }

    /**
     * Sets the value of the connEstabTimeMeanEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMeanEmergency(Integer value) {
        this.connEstabTimeMeanEmergency = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMeanHighPriorityAccess() {
        return connEstabTimeMeanHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabTimeMeanHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMeanHighPriorityAccess(Integer value) {
        this.connEstabTimeMeanHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMeanMtAccess() {
        return connEstabTimeMeanMtAccess;
    }

    /**
     * Sets the value of the connEstabTimeMeanMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMeanMtAccess(Integer value) {
        this.connEstabTimeMeanMtAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMeanMoSignalling() {
        return connEstabTimeMeanMoSignalling;
    }

    /**
     * Sets the value of the connEstabTimeMeanMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMeanMoSignalling(Integer value) {
        this.connEstabTimeMeanMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabTimeMeanMoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMeanMoData() {
        return connEstabTimeMeanMoData;
    }

    /**
     * Sets the value of the connEstabTimeMeanMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMeanMoData(Integer value) {
        this.connEstabTimeMeanMoData = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMaxEmergency() {
        return connEstabTimeMaxEmergency;
    }

    /**
     * Sets the value of the connEstabTimeMaxEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMaxEmergency(Integer value) {
        this.connEstabTimeMaxEmergency = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMaxHighPriorityAccess() {
        return connEstabTimeMaxHighPriorityAccess;
    }

    /**
     * Sets the value of the connEstabTimeMaxHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMaxHighPriorityAccess(Integer value) {
        this.connEstabTimeMaxHighPriorityAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMaxMtAccess() {
        return connEstabTimeMaxMtAccess;
    }

    /**
     * Sets the value of the connEstabTimeMaxMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMaxMtAccess(Integer value) {
        this.connEstabTimeMaxMtAccess = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMaxMoSignalling() {
        return connEstabTimeMaxMoSignalling;
    }

    /**
     * Sets the value of the connEstabTimeMaxMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMaxMoSignalling(Integer value) {
        this.connEstabTimeMaxMoSignalling = value;
    }

    /**
     * Gets the value of the connEstabTimeMaxMoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMaxMoData() {
        return connEstabTimeMaxMoData;
    }

    /**
     * Sets the value of the connEstabTimeMaxMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMaxMoData(Integer value) {
        this.connEstabTimeMaxMoData = value;
    }

    /**
     * Gets the value of the ueContextRelReqSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeContextRelReqSum() {
        return ueContextRelReqSum;
    }

    /**
     * Sets the value of the ueContextRelReqSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeContextRelReqSum(Integer value) {
        this.ueContextRelReqSum = value;
    }

    /**
     * Gets the value of the ueContextRelSuccNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeContextRelSuccNbr() {
        return ueContextRelSuccNbr;
    }

    /**
     * Sets the value of the ueContextRelSuccNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeContextRelSuccNbr(Integer value) {
        this.ueContextRelSuccNbr = value;
    }

    /**
     * Gets the value of the connEstabTimeMean property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMean() {
        return connEstabTimeMean;
    }

    /**
     * Sets the value of the connEstabTimeMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMean(Integer value) {
        this.connEstabTimeMean = value;
    }

    /**
     * Gets the value of the connEstabTimeMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabTimeMax() {
        return connEstabTimeMax;
    }

    /**
     * Sets the value of the connEstabTimeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabTimeMax(Integer value) {
        this.connEstabTimeMax = value;
    }

    /**
     * Gets the value of the connEstabAttDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabAttDelayTolerantAccess() {
        return connEstabAttDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabAttDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabAttDelayTolerantAccess(Integer value) {
        this.connEstabAttDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabSuccDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabSuccDelayTolerantAccess() {
        return connEstabSuccDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabSuccDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabSuccDelayTolerantAccess(Integer value) {
        this.connEstabSuccDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabFailDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailDelayTolerantAccess() {
        return connEstabFailDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabFailDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailDelayTolerantAccess(Integer value) {
        this.connEstabFailDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the connEstabFailNBCauseEnergySaving property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnEstabFailNBCauseEnergySaving() {
        return connEstabFailNBCauseEnergySaving;
    }

    /**
     * Sets the value of the connEstabFailNBCauseEnergySaving property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnEstabFailNBCauseEnergySaving(Integer value) {
        this.connEstabFailNBCauseEnergySaving = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseUeConnLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeContextRelReqCauseUeConnLoss() {
        return ueContextRelReqCauseUeConnLoss;
    }

    /**
     * Sets the value of the ueContextRelReqCauseUeConnLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeContextRelReqCauseUeConnLoss(Integer value) {
        this.ueContextRelReqCauseUeConnLoss = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseUserInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeContextRelReqCauseUserInactivity() {
        return ueContextRelReqCauseUserInactivity;
    }

    /**
     * Sets the value of the ueContextRelReqCauseUserInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeContextRelReqCauseUserInactivity(Integer value) {
        this.ueContextRelReqCauseUserInactivity = value;
    }

    /**
     * Gets the value of the ueContextRelReqCauseCsFallbackTriggered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeContextRelReqCauseCsFallbackTriggered() {
        return ueContextRelReqCauseCsFallbackTriggered;
    }

    /**
     * Sets the value of the ueContextRelReqCauseCsFallbackTriggered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeContextRelReqCauseCsFallbackTriggered(Integer value) {
        this.ueContextRelReqCauseCsFallbackTriggered = value;
    }

    /**
     * Gets the value of the connectedUesCat1Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat1Avg() {
        return connectedUesCat1Avg;
    }

    /**
     * Sets the value of the connectedUesCat1Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat1Avg(Integer value) {
        this.connectedUesCat1Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat2Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat2Avg() {
        return connectedUesCat2Avg;
    }

    /**
     * Sets the value of the connectedUesCat2Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat2Avg(Integer value) {
        this.connectedUesCat2Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat3Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat3Avg() {
        return connectedUesCat3Avg;
    }

    /**
     * Sets the value of the connectedUesCat3Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat3Avg(Integer value) {
        this.connectedUesCat3Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat4Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat4Avg() {
        return connectedUesCat4Avg;
    }

    /**
     * Sets the value of the connectedUesCat4Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat4Avg(Integer value) {
        this.connectedUesCat4Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat5Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat5Avg() {
        return connectedUesCat5Avg;
    }

    /**
     * Sets the value of the connectedUesCat5Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat5Avg(Integer value) {
        this.connectedUesCat5Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat6Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat6Avg() {
        return connectedUesCat6Avg;
    }

    /**
     * Sets the value of the connectedUesCat6Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat6Avg(Integer value) {
        this.connectedUesCat6Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat7Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat7Avg() {
        return connectedUesCat7Avg;
    }

    /**
     * Sets the value of the connectedUesCat7Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat7Avg(Integer value) {
        this.connectedUesCat7Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat8Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat8Avg() {
        return connectedUesCat8Avg;
    }

    /**
     * Sets the value of the connectedUesCat8Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat8Avg(Integer value) {
        this.connectedUesCat8Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat9Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat9Avg() {
        return connectedUesCat9Avg;
    }

    /**
     * Sets the value of the connectedUesCat9Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat9Avg(Integer value) {
        this.connectedUesCat9Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat10Avg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat10Avg() {
        return connectedUesCat10Avg;
    }

    /**
     * Sets the value of the connectedUesCat10Avg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat10Avg(Integer value) {
        this.connectedUesCat10Avg = value;
    }

    /**
     * Gets the value of the connectedUesCat1Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat1Min() {
        return connectedUesCat1Min;
    }

    /**
     * Sets the value of the connectedUesCat1Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat1Min(Integer value) {
        this.connectedUesCat1Min = value;
    }

    /**
     * Gets the value of the connectedUesCat2Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat2Min() {
        return connectedUesCat2Min;
    }

    /**
     * Sets the value of the connectedUesCat2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat2Min(Integer value) {
        this.connectedUesCat2Min = value;
    }

    /**
     * Gets the value of the connectedUesCat3Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat3Min() {
        return connectedUesCat3Min;
    }

    /**
     * Sets the value of the connectedUesCat3Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat3Min(Integer value) {
        this.connectedUesCat3Min = value;
    }

    /**
     * Gets the value of the connectedUesCat4Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat4Min() {
        return connectedUesCat4Min;
    }

    /**
     * Sets the value of the connectedUesCat4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat4Min(Integer value) {
        this.connectedUesCat4Min = value;
    }

    /**
     * Gets the value of the connectedUesCat5Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat5Min() {
        return connectedUesCat5Min;
    }

    /**
     * Sets the value of the connectedUesCat5Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat5Min(Integer value) {
        this.connectedUesCat5Min = value;
    }

    /**
     * Gets the value of the connectedUesCat6Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat6Min() {
        return connectedUesCat6Min;
    }

    /**
     * Sets the value of the connectedUesCat6Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat6Min(Integer value) {
        this.connectedUesCat6Min = value;
    }

    /**
     * Gets the value of the connectedUesCat7Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat7Min() {
        return connectedUesCat7Min;
    }

    /**
     * Sets the value of the connectedUesCat7Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat7Min(Integer value) {
        this.connectedUesCat7Min = value;
    }

    /**
     * Gets the value of the connectedUesCat8Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat8Min() {
        return connectedUesCat8Min;
    }

    /**
     * Sets the value of the connectedUesCat8Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat8Min(Integer value) {
        this.connectedUesCat8Min = value;
    }

    /**
     * Gets the value of the connectedUesCat9Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat9Min() {
        return connectedUesCat9Min;
    }

    /**
     * Sets the value of the connectedUesCat9Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat9Min(Integer value) {
        this.connectedUesCat9Min = value;
    }

    /**
     * Gets the value of the connectedUesCat10Min property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat10Min() {
        return connectedUesCat10Min;
    }

    /**
     * Sets the value of the connectedUesCat10Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat10Min(Integer value) {
        this.connectedUesCat10Min = value;
    }

    /**
     * Gets the value of the connectedUesCat1Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat1Max() {
        return connectedUesCat1Max;
    }

    /**
     * Sets the value of the connectedUesCat1Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat1Max(Integer value) {
        this.connectedUesCat1Max = value;
    }

    /**
     * Gets the value of the connectedUesCat2Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat2Max() {
        return connectedUesCat2Max;
    }

    /**
     * Sets the value of the connectedUesCat2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat2Max(Integer value) {
        this.connectedUesCat2Max = value;
    }

    /**
     * Gets the value of the connectedUesCat3Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat3Max() {
        return connectedUesCat3Max;
    }

    /**
     * Sets the value of the connectedUesCat3Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat3Max(Integer value) {
        this.connectedUesCat3Max = value;
    }

    /**
     * Gets the value of the connectedUesCat4Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat4Max() {
        return connectedUesCat4Max;
    }

    /**
     * Sets the value of the connectedUesCat4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat4Max(Integer value) {
        this.connectedUesCat4Max = value;
    }

    /**
     * Gets the value of the connectedUesCat5Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat5Max() {
        return connectedUesCat5Max;
    }

    /**
     * Sets the value of the connectedUesCat5Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat5Max(Integer value) {
        this.connectedUesCat5Max = value;
    }

    /**
     * Gets the value of the connectedUesCat6Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat6Max() {
        return connectedUesCat6Max;
    }

    /**
     * Sets the value of the connectedUesCat6Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat6Max(Integer value) {
        this.connectedUesCat6Max = value;
    }

    /**
     * Gets the value of the connectedUesCat7Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat7Max() {
        return connectedUesCat7Max;
    }

    /**
     * Sets the value of the connectedUesCat7Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat7Max(Integer value) {
        this.connectedUesCat7Max = value;
    }

    /**
     * Gets the value of the connectedUesCat8Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat8Max() {
        return connectedUesCat8Max;
    }

    /**
     * Sets the value of the connectedUesCat8Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat8Max(Integer value) {
        this.connectedUesCat8Max = value;
    }

    /**
     * Gets the value of the connectedUesCat9Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat9Max() {
        return connectedUesCat9Max;
    }

    /**
     * Sets the value of the connectedUesCat9Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat9Max(Integer value) {
        this.connectedUesCat9Max = value;
    }

    /**
     * Gets the value of the connectedUesCat10Max property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesCat10Max() {
        return connectedUesCat10Max;
    }

    /**
     * Sets the value of the connectedUesCat10Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesCat10Max(Integer value) {
        this.connectedUesCat10Max = value;
    }

    /**
     * Gets the value of the connectedUesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConnectedUesTotal() {
        return connectedUesTotal;
    }

    /**
     * Sets the value of the connectedUesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConnectedUesTotal(Integer value) {
        this.connectedUesTotal = value;
    }

}
