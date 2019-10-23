
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
 * <p>Java class for LtePerPlmnStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePerPlmnStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
 *         &lt;element name="InitialAttachLatencySum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialAttachLatencyAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialAttachLatencyMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRequestLatencySum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRequestLatencyAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRequestLatencyMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcBytesTxPerPlmn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcBytesReTxPerPlmn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcThroughputPerPlmn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlRlcBytesRxPerPlmn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlRlcThroughputPerPlmn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMeanDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConnEstabTimeMaxDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutPrepAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttDesForRadReasonsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttTimeCriticalPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttResOptimisationPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttReduceLoadInServingCellPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttRadioNwUnspecifiedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutAttSumPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccDesForRadReasonsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccTimeCriticalPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccResOptimisationPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccReduceLoadInServingCellPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccRadioNwUnspecifiedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccSumPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqOutAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqOutSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqMeasGapOutAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqMeasGapOutSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqNoMeasGapOutAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqNoMeasGapOutSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoDrxOutAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoDrxOutSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoNonDrxOutAttPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoNonDrxOutSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttDesForRadReasonsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttTimeCriticalPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttResOptimisationPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttReduceLoadInServingCellPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttRadioNwUnspecifiedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutAttSumPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccDesForRadReasonsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccTimeCriticalPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccResOptimisationPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccReduceLoadInServingCellPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccRadioNwUnspecifiedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRat3gOutSuccSumPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtranRedirectionCsfbWithoutPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtranRedirectionWithoutSysInfoPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtranRedirectionAttemptsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtranRedirectionSuccPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UtranRedirectionFailedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeranRedirectionAttemptsPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeranConnReleasesPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeranFailedCsfbProcPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeranInitiationWithRedirectionPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GeranWithoutRedirectionPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CsfbOverallRedirectionAttemptPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CsfbOverallRedirectionSuccessPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CsfbOverallRedirectionFailedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CsfbUnknownRedirectionFailedPerPlmn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "cellNumber",
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
    "initialAttachLatencySum",
    "initialAttachLatencyAvg",
    "initialAttachLatencyMax",
    "serviceRequestLatencySum",
    "serviceRequestLatencyAvg",
    "serviceRequestLatencyMax",
    "dlRlcBytesTxPerPlmn",
    "dlRlcBytesReTxPerPlmn",
    "dlRlcThroughputPerPlmn",
    "ulRlcBytesRxPerPlmn",
    "ulRlcThroughputPerPlmn",
    "connEstabTimeMeanEmergency",
    "connEstabTimeMeanHighPriorityAccess",
    "connEstabTimeMeanMtAccess",
    "connEstabTimeMeanMoSignalling",
    "connEstabTimeMeanMoData",
    "connEstabTimeMeanDelayTolerantAccess",
    "connEstabTimeMaxEmergency",
    "connEstabTimeMaxHighPriorityAccess",
    "connEstabTimeMaxMtAccess",
    "connEstabTimeMaxMoSignalling",
    "connEstabTimeMaxMoData",
    "connEstabTimeMaxDelayTolerantAccess",
    "hoInterEnbOutPrepAttPerPlmn",
    "hoInterEnbOutAttDesForRadReasonsPerPlmn",
    "hoInterEnbOutAttTimeCriticalPerPlmn",
    "hoInterEnbOutAttResOptimisationPerPlmn",
    "hoInterEnbOutAttReduceLoadInServingCellPerPlmn",
    "hoInterEnbOutAttRadioNwUnspecifiedPerPlmn",
    "hoInterEnbOutAttSumPerPlmn",
    "hoInterEnbOutSuccDesForRadReasonsPerPlmn",
    "hoInterEnbOutSuccTimeCriticalPerPlmn",
    "hoInterEnbOutSuccResOptimisationPerPlmn",
    "hoInterEnbOutSuccReduceLoadInServingCellPerPlmn",
    "hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn",
    "hoInterEnbOutSuccSumPerPlmn",
    "hoIntraFreqOutAttPerPlmn",
    "hoIntraFreqOutSuccPerPlmn",
    "hoInterFreqMeasGapOutAttPerPlmn",
    "hoInterFreqMeasGapOutSuccPerPlmn",
    "hoInterFreqNoMeasGapOutAttPerPlmn",
    "hoInterFreqNoMeasGapOutSuccPerPlmn",
    "hoDrxOutAttPerPlmn",
    "hoDrxOutSuccPerPlmn",
    "hoNonDrxOutAttPerPlmn",
    "hoNonDrxOutSuccPerPlmn",
    "hoInterRat3GOutAttDesForRadReasonsPerPlmn",
    "hoInterRat3GOutAttTimeCriticalPerPlmn",
    "hoInterRat3GOutAttResOptimisationPerPlmn",
    "hoInterRat3GOutAttReduceLoadInServingCellPerPlmn",
    "hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn",
    "hoInterRat3GOutAttSumPerPlmn",
    "hoInterRat3GOutSuccDesForRadReasonsPerPlmn",
    "hoInterRat3GOutSuccTimeCriticalPerPlmn",
    "hoInterRat3GOutSuccResOptimisationPerPlmn",
    "hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn",
    "hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn",
    "hoInterRat3GOutSuccSumPerPlmn",
    "utranRedirectionCsfbWithoutPerPlmn",
    "utranRedirectionWithoutSysInfoPerPlmn",
    "utranRedirectionAttemptsPerPlmn",
    "utranRedirectionSuccPerPlmn",
    "utranRedirectionFailedPerPlmn",
    "geranRedirectionAttemptsPerPlmn",
    "geranConnReleasesPerPlmn",
    "geranFailedCsfbProcPerPlmn",
    "geranInitiationWithRedirectionPerPlmn",
    "geranWithoutRedirectionPerPlmn",
    "csfbOverallRedirectionAttemptPerPlmn",
    "csfbOverallRedirectionSuccessPerPlmn",
    "csfbOverallRedirectionFailedPerPlmn",
    "csfbUnknownRedirectionFailedPerPlmn"
})
public class LtePerPlmnStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
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
    @XmlElementRef(name = "InitialAttachLatencySum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialAttachLatencySum;
    @XmlElementRef(name = "InitialAttachLatencyAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialAttachLatencyAvg;
    @XmlElementRef(name = "InitialAttachLatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialAttachLatencyMax;
    @XmlElementRef(name = "ServiceRequestLatencySum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceRequestLatencySum;
    @XmlElementRef(name = "ServiceRequestLatencyAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceRequestLatencyAvg;
    @XmlElementRef(name = "ServiceRequestLatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> serviceRequestLatencyMax;
    @XmlElementRef(name = "DlRlcBytesTxPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlRlcBytesTxPerPlmn;
    @XmlElementRef(name = "DlRlcBytesReTxPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlRlcBytesReTxPerPlmn;
    @XmlElementRef(name = "DlRlcThroughputPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlRlcThroughputPerPlmn;
    @XmlElementRef(name = "UlRlcBytesRxPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulRlcBytesRxPerPlmn;
    @XmlElementRef(name = "UlRlcThroughputPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulRlcThroughputPerPlmn;
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
    @XmlElementRef(name = "ConnEstabTimeMeanDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMeanDelayTolerantAccess;
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
    @XmlElementRef(name = "ConnEstabTimeMaxDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> connEstabTimeMaxDelayTolerantAccess;
    @XmlElementRef(name = "HoInterEnbOutPrepAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutPrepAttPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttDesForRadReasonsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttDesForRadReasonsPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttTimeCriticalPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttTimeCriticalPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttResOptimisationPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttResOptimisationPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttReduceLoadInServingCellPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttReduceLoadInServingCellPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttRadioNwUnspecifiedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttRadioNwUnspecifiedPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutAttSumPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttSumPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccDesForRadReasonsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccDesForRadReasonsPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccTimeCriticalPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccTimeCriticalPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccResOptimisationPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccResOptimisationPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccReduceLoadInServingCellPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccReduceLoadInServingCellPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccRadioNwUnspecifiedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn;
    @XmlElementRef(name = "HoInterEnbOutSuccSumPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccSumPerPlmn;
    @XmlElementRef(name = "HoIntraFreqOutAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqOutAttPerPlmn;
    @XmlElementRef(name = "HoIntraFreqOutSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqOutSuccPerPlmn;
    @XmlElementRef(name = "HoInterFreqMeasGapOutAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqMeasGapOutAttPerPlmn;
    @XmlElementRef(name = "HoInterFreqMeasGapOutSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqMeasGapOutSuccPerPlmn;
    @XmlElementRef(name = "HoInterFreqNoMeasGapOutAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqNoMeasGapOutAttPerPlmn;
    @XmlElementRef(name = "HoInterFreqNoMeasGapOutSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqNoMeasGapOutSuccPerPlmn;
    @XmlElementRef(name = "HoDrxOutAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoDrxOutAttPerPlmn;
    @XmlElementRef(name = "HoDrxOutSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoDrxOutSuccPerPlmn;
    @XmlElementRef(name = "HoNonDrxOutAttPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoNonDrxOutAttPerPlmn;
    @XmlElementRef(name = "HoNonDrxOutSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoNonDrxOutSuccPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttDesForRadReasonsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttDesForRadReasonsPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttTimeCriticalPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttTimeCriticalPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttResOptimisationPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttResOptimisationPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttReduceLoadInServingCellPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttReduceLoadInServingCellPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttRadioNwUnspecifiedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutAttSumPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutAttSumPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccDesForRadReasonsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccDesForRadReasonsPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccTimeCriticalPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccTimeCriticalPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccResOptimisationPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccResOptimisationPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccReduceLoadInServingCellPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccRadioNwUnspecifiedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn;
    @XmlElementRef(name = "HoInterRat3gOutSuccSumPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRat3GOutSuccSumPerPlmn;
    @XmlElementRef(name = "UtranRedirectionCsfbWithoutPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionCsfbWithoutPerPlmn;
    @XmlElementRef(name = "UtranRedirectionWithoutSysInfoPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionWithoutSysInfoPerPlmn;
    @XmlElementRef(name = "UtranRedirectionAttemptsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionAttemptsPerPlmn;
    @XmlElementRef(name = "UtranRedirectionSuccPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionSuccPerPlmn;
    @XmlElementRef(name = "UtranRedirectionFailedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> utranRedirectionFailedPerPlmn;
    @XmlElementRef(name = "GeranRedirectionAttemptsPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranRedirectionAttemptsPerPlmn;
    @XmlElementRef(name = "GeranConnReleasesPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranConnReleasesPerPlmn;
    @XmlElementRef(name = "GeranFailedCsfbProcPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranFailedCsfbProcPerPlmn;
    @XmlElementRef(name = "GeranInitiationWithRedirectionPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranInitiationWithRedirectionPerPlmn;
    @XmlElementRef(name = "GeranWithoutRedirectionPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> geranWithoutRedirectionPerPlmn;
    @XmlElementRef(name = "CsfbOverallRedirectionAttemptPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionAttemptPerPlmn;
    @XmlElementRef(name = "CsfbOverallRedirectionSuccessPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionSuccessPerPlmn;
    @XmlElementRef(name = "CsfbOverallRedirectionFailedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbOverallRedirectionFailedPerPlmn;
    @XmlElementRef(name = "CsfbUnknownRedirectionFailedPerPlmn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbUnknownRedirectionFailedPerPlmn;

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
     * Gets the value of the initialAttachLatencySum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialAttachLatencySum() {
        return initialAttachLatencySum;
    }

    /**
     * Sets the value of the initialAttachLatencySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialAttachLatencySum(JAXBElement<Integer> value) {
        this.initialAttachLatencySum = value;
    }

    /**
     * Gets the value of the initialAttachLatencyAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialAttachLatencyAvg() {
        return initialAttachLatencyAvg;
    }

    /**
     * Sets the value of the initialAttachLatencyAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialAttachLatencyAvg(JAXBElement<Integer> value) {
        this.initialAttachLatencyAvg = value;
    }

    /**
     * Gets the value of the initialAttachLatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialAttachLatencyMax() {
        return initialAttachLatencyMax;
    }

    /**
     * Sets the value of the initialAttachLatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialAttachLatencyMax(JAXBElement<Integer> value) {
        this.initialAttachLatencyMax = value;
    }

    /**
     * Gets the value of the serviceRequestLatencySum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceRequestLatencySum() {
        return serviceRequestLatencySum;
    }

    /**
     * Sets the value of the serviceRequestLatencySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceRequestLatencySum(JAXBElement<Integer> value) {
        this.serviceRequestLatencySum = value;
    }

    /**
     * Gets the value of the serviceRequestLatencyAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceRequestLatencyAvg() {
        return serviceRequestLatencyAvg;
    }

    /**
     * Sets the value of the serviceRequestLatencyAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceRequestLatencyAvg(JAXBElement<Integer> value) {
        this.serviceRequestLatencyAvg = value;
    }

    /**
     * Gets the value of the serviceRequestLatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceRequestLatencyMax() {
        return serviceRequestLatencyMax;
    }

    /**
     * Sets the value of the serviceRequestLatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceRequestLatencyMax(JAXBElement<Integer> value) {
        this.serviceRequestLatencyMax = value;
    }

    /**
     * Gets the value of the dlRlcBytesTxPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlRlcBytesTxPerPlmn() {
        return dlRlcBytesTxPerPlmn;
    }

    /**
     * Sets the value of the dlRlcBytesTxPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlRlcBytesTxPerPlmn(JAXBElement<Long> value) {
        this.dlRlcBytesTxPerPlmn = value;
    }

    /**
     * Gets the value of the dlRlcBytesReTxPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlRlcBytesReTxPerPlmn() {
        return dlRlcBytesReTxPerPlmn;
    }

    /**
     * Sets the value of the dlRlcBytesReTxPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlRlcBytesReTxPerPlmn(JAXBElement<Long> value) {
        this.dlRlcBytesReTxPerPlmn = value;
    }

    /**
     * Gets the value of the dlRlcThroughputPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlRlcThroughputPerPlmn() {
        return dlRlcThroughputPerPlmn;
    }

    /**
     * Sets the value of the dlRlcThroughputPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlRlcThroughputPerPlmn(JAXBElement<Double> value) {
        this.dlRlcThroughputPerPlmn = value;
    }

    /**
     * Gets the value of the ulRlcBytesRxPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlRlcBytesRxPerPlmn() {
        return ulRlcBytesRxPerPlmn;
    }

    /**
     * Sets the value of the ulRlcBytesRxPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlRlcBytesRxPerPlmn(JAXBElement<Long> value) {
        this.ulRlcBytesRxPerPlmn = value;
    }

    /**
     * Gets the value of the ulRlcThroughputPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlRlcThroughputPerPlmn() {
        return ulRlcThroughputPerPlmn;
    }

    /**
     * Sets the value of the ulRlcThroughputPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlRlcThroughputPerPlmn(JAXBElement<Double> value) {
        this.ulRlcThroughputPerPlmn = value;
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
     * Gets the value of the connEstabTimeMeanDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMeanDelayTolerantAccess() {
        return connEstabTimeMeanDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabTimeMeanDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMeanDelayTolerantAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMeanDelayTolerantAccess = value;
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
     * Gets the value of the connEstabTimeMaxDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConnEstabTimeMaxDelayTolerantAccess() {
        return connEstabTimeMaxDelayTolerantAccess;
    }

    /**
     * Sets the value of the connEstabTimeMaxDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConnEstabTimeMaxDelayTolerantAccess(JAXBElement<Integer> value) {
        this.connEstabTimeMaxDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the hoInterEnbOutPrepAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutPrepAttPerPlmn() {
        return hoInterEnbOutPrepAttPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutPrepAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutPrepAttPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutPrepAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttDesForRadReasonsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttDesForRadReasonsPerPlmn() {
        return hoInterEnbOutAttDesForRadReasonsPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttDesForRadReasonsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttDesForRadReasonsPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttDesForRadReasonsPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttTimeCriticalPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttTimeCriticalPerPlmn() {
        return hoInterEnbOutAttTimeCriticalPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttTimeCriticalPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttTimeCriticalPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttTimeCriticalPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttResOptimisationPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttResOptimisationPerPlmn() {
        return hoInterEnbOutAttResOptimisationPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttResOptimisationPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttResOptimisationPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttResOptimisationPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttReduceLoadInServingCellPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttReduceLoadInServingCellPerPlmn() {
        return hoInterEnbOutAttReduceLoadInServingCellPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttReduceLoadInServingCellPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttReduceLoadInServingCellPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttReduceLoadInServingCellPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttRadioNwUnspecifiedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttRadioNwUnspecifiedPerPlmn() {
        return hoInterEnbOutAttRadioNwUnspecifiedPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttRadioNwUnspecifiedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttRadioNwUnspecifiedPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttRadioNwUnspecifiedPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttSumPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttSumPerPlmn() {
        return hoInterEnbOutAttSumPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutAttSumPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttSumPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttSumPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccDesForRadReasonsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccDesForRadReasonsPerPlmn() {
        return hoInterEnbOutSuccDesForRadReasonsPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccDesForRadReasonsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccDesForRadReasonsPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccDesForRadReasonsPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccTimeCriticalPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccTimeCriticalPerPlmn() {
        return hoInterEnbOutSuccTimeCriticalPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccTimeCriticalPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccTimeCriticalPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccTimeCriticalPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccResOptimisationPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccResOptimisationPerPlmn() {
        return hoInterEnbOutSuccResOptimisationPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccResOptimisationPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccResOptimisationPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccResOptimisationPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccReduceLoadInServingCellPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccReduceLoadInServingCellPerPlmn() {
        return hoInterEnbOutSuccReduceLoadInServingCellPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccReduceLoadInServingCellPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccReduceLoadInServingCellPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccReduceLoadInServingCellPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccRadioNwUnspecifiedPerPlmn() {
        return hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccRadioNwUnspecifiedPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccRadioNwUnspecifiedPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccSumPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccSumPerPlmn() {
        return hoInterEnbOutSuccSumPerPlmn;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccSumPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccSumPerPlmn(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccSumPerPlmn = value;
    }

    /**
     * Gets the value of the hoIntraFreqOutAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqOutAttPerPlmn() {
        return hoIntraFreqOutAttPerPlmn;
    }

    /**
     * Sets the value of the hoIntraFreqOutAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqOutAttPerPlmn(JAXBElement<Integer> value) {
        this.hoIntraFreqOutAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoIntraFreqOutSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqOutSuccPerPlmn() {
        return hoIntraFreqOutSuccPerPlmn;
    }

    /**
     * Sets the value of the hoIntraFreqOutSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqOutSuccPerPlmn(JAXBElement<Integer> value) {
        this.hoIntraFreqOutSuccPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterFreqMeasGapOutAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqMeasGapOutAttPerPlmn() {
        return hoInterFreqMeasGapOutAttPerPlmn;
    }

    /**
     * Sets the value of the hoInterFreqMeasGapOutAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqMeasGapOutAttPerPlmn(JAXBElement<Integer> value) {
        this.hoInterFreqMeasGapOutAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterFreqMeasGapOutSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqMeasGapOutSuccPerPlmn() {
        return hoInterFreqMeasGapOutSuccPerPlmn;
    }

    /**
     * Sets the value of the hoInterFreqMeasGapOutSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqMeasGapOutSuccPerPlmn(JAXBElement<Integer> value) {
        this.hoInterFreqMeasGapOutSuccPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterFreqNoMeasGapOutAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqNoMeasGapOutAttPerPlmn() {
        return hoInterFreqNoMeasGapOutAttPerPlmn;
    }

    /**
     * Sets the value of the hoInterFreqNoMeasGapOutAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqNoMeasGapOutAttPerPlmn(JAXBElement<Integer> value) {
        this.hoInterFreqNoMeasGapOutAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterFreqNoMeasGapOutSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqNoMeasGapOutSuccPerPlmn() {
        return hoInterFreqNoMeasGapOutSuccPerPlmn;
    }

    /**
     * Sets the value of the hoInterFreqNoMeasGapOutSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqNoMeasGapOutSuccPerPlmn(JAXBElement<Integer> value) {
        this.hoInterFreqNoMeasGapOutSuccPerPlmn = value;
    }

    /**
     * Gets the value of the hoDrxOutAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoDrxOutAttPerPlmn() {
        return hoDrxOutAttPerPlmn;
    }

    /**
     * Sets the value of the hoDrxOutAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoDrxOutAttPerPlmn(JAXBElement<Integer> value) {
        this.hoDrxOutAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoDrxOutSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoDrxOutSuccPerPlmn() {
        return hoDrxOutSuccPerPlmn;
    }

    /**
     * Sets the value of the hoDrxOutSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoDrxOutSuccPerPlmn(JAXBElement<Integer> value) {
        this.hoDrxOutSuccPerPlmn = value;
    }

    /**
     * Gets the value of the hoNonDrxOutAttPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoNonDrxOutAttPerPlmn() {
        return hoNonDrxOutAttPerPlmn;
    }

    /**
     * Sets the value of the hoNonDrxOutAttPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoNonDrxOutAttPerPlmn(JAXBElement<Integer> value) {
        this.hoNonDrxOutAttPerPlmn = value;
    }

    /**
     * Gets the value of the hoNonDrxOutSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoNonDrxOutSuccPerPlmn() {
        return hoNonDrxOutSuccPerPlmn;
    }

    /**
     * Sets the value of the hoNonDrxOutSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoNonDrxOutSuccPerPlmn(JAXBElement<Integer> value) {
        this.hoNonDrxOutSuccPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttDesForRadReasonsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttDesForRadReasonsPerPlmn() {
        return hoInterRat3GOutAttDesForRadReasonsPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttDesForRadReasonsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttDesForRadReasonsPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttDesForRadReasonsPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttTimeCriticalPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttTimeCriticalPerPlmn() {
        return hoInterRat3GOutAttTimeCriticalPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttTimeCriticalPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttTimeCriticalPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttTimeCriticalPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttResOptimisationPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttResOptimisationPerPlmn() {
        return hoInterRat3GOutAttResOptimisationPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttResOptimisationPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttResOptimisationPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttResOptimisationPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttReduceLoadInServingCellPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttReduceLoadInServingCellPerPlmn() {
        return hoInterRat3GOutAttReduceLoadInServingCellPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttReduceLoadInServingCellPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttReduceLoadInServingCellPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttReduceLoadInServingCellPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttRadioNwUnspecifiedPerPlmn() {
        return hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttRadioNwUnspecifiedPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttRadioNwUnspecifiedPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutAttSumPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutAttSumPerPlmn() {
        return hoInterRat3GOutAttSumPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutAttSumPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutAttSumPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutAttSumPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccDesForRadReasonsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccDesForRadReasonsPerPlmn() {
        return hoInterRat3GOutSuccDesForRadReasonsPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccDesForRadReasonsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccDesForRadReasonsPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccDesForRadReasonsPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccTimeCriticalPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccTimeCriticalPerPlmn() {
        return hoInterRat3GOutSuccTimeCriticalPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccTimeCriticalPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccTimeCriticalPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccTimeCriticalPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccResOptimisationPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccResOptimisationPerPlmn() {
        return hoInterRat3GOutSuccResOptimisationPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccResOptimisationPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccResOptimisationPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccResOptimisationPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccReduceLoadInServingCellPerPlmn() {
        return hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccReduceLoadInServingCellPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccReduceLoadInServingCellPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn() {
        return hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccRadioNwUnspecifiedPerPlmn = value;
    }

    /**
     * Gets the value of the hoInterRat3GOutSuccSumPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRat3GOutSuccSumPerPlmn() {
        return hoInterRat3GOutSuccSumPerPlmn;
    }

    /**
     * Sets the value of the hoInterRat3GOutSuccSumPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRat3GOutSuccSumPerPlmn(JAXBElement<Integer> value) {
        this.hoInterRat3GOutSuccSumPerPlmn = value;
    }

    /**
     * Gets the value of the utranRedirectionCsfbWithoutPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionCsfbWithoutPerPlmn() {
        return utranRedirectionCsfbWithoutPerPlmn;
    }

    /**
     * Sets the value of the utranRedirectionCsfbWithoutPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionCsfbWithoutPerPlmn(JAXBElement<Integer> value) {
        this.utranRedirectionCsfbWithoutPerPlmn = value;
    }

    /**
     * Gets the value of the utranRedirectionWithoutSysInfoPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionWithoutSysInfoPerPlmn() {
        return utranRedirectionWithoutSysInfoPerPlmn;
    }

    /**
     * Sets the value of the utranRedirectionWithoutSysInfoPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionWithoutSysInfoPerPlmn(JAXBElement<Integer> value) {
        this.utranRedirectionWithoutSysInfoPerPlmn = value;
    }

    /**
     * Gets the value of the utranRedirectionAttemptsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionAttemptsPerPlmn() {
        return utranRedirectionAttemptsPerPlmn;
    }

    /**
     * Sets the value of the utranRedirectionAttemptsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionAttemptsPerPlmn(JAXBElement<Integer> value) {
        this.utranRedirectionAttemptsPerPlmn = value;
    }

    /**
     * Gets the value of the utranRedirectionSuccPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionSuccPerPlmn() {
        return utranRedirectionSuccPerPlmn;
    }

    /**
     * Sets the value of the utranRedirectionSuccPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionSuccPerPlmn(JAXBElement<Integer> value) {
        this.utranRedirectionSuccPerPlmn = value;
    }

    /**
     * Gets the value of the utranRedirectionFailedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUtranRedirectionFailedPerPlmn() {
        return utranRedirectionFailedPerPlmn;
    }

    /**
     * Sets the value of the utranRedirectionFailedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUtranRedirectionFailedPerPlmn(JAXBElement<Integer> value) {
        this.utranRedirectionFailedPerPlmn = value;
    }

    /**
     * Gets the value of the geranRedirectionAttemptsPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranRedirectionAttemptsPerPlmn() {
        return geranRedirectionAttemptsPerPlmn;
    }

    /**
     * Sets the value of the geranRedirectionAttemptsPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranRedirectionAttemptsPerPlmn(JAXBElement<Integer> value) {
        this.geranRedirectionAttemptsPerPlmn = value;
    }

    /**
     * Gets the value of the geranConnReleasesPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranConnReleasesPerPlmn() {
        return geranConnReleasesPerPlmn;
    }

    /**
     * Sets the value of the geranConnReleasesPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranConnReleasesPerPlmn(JAXBElement<Integer> value) {
        this.geranConnReleasesPerPlmn = value;
    }

    /**
     * Gets the value of the geranFailedCsfbProcPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranFailedCsfbProcPerPlmn() {
        return geranFailedCsfbProcPerPlmn;
    }

    /**
     * Sets the value of the geranFailedCsfbProcPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranFailedCsfbProcPerPlmn(JAXBElement<Integer> value) {
        this.geranFailedCsfbProcPerPlmn = value;
    }

    /**
     * Gets the value of the geranInitiationWithRedirectionPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranInitiationWithRedirectionPerPlmn() {
        return geranInitiationWithRedirectionPerPlmn;
    }

    /**
     * Sets the value of the geranInitiationWithRedirectionPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranInitiationWithRedirectionPerPlmn(JAXBElement<Integer> value) {
        this.geranInitiationWithRedirectionPerPlmn = value;
    }

    /**
     * Gets the value of the geranWithoutRedirectionPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGeranWithoutRedirectionPerPlmn() {
        return geranWithoutRedirectionPerPlmn;
    }

    /**
     * Sets the value of the geranWithoutRedirectionPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGeranWithoutRedirectionPerPlmn(JAXBElement<Integer> value) {
        this.geranWithoutRedirectionPerPlmn = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionAttemptPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionAttemptPerPlmn() {
        return csfbOverallRedirectionAttemptPerPlmn;
    }

    /**
     * Sets the value of the csfbOverallRedirectionAttemptPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionAttemptPerPlmn(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionAttemptPerPlmn = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionSuccessPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionSuccessPerPlmn() {
        return csfbOverallRedirectionSuccessPerPlmn;
    }

    /**
     * Sets the value of the csfbOverallRedirectionSuccessPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionSuccessPerPlmn(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionSuccessPerPlmn = value;
    }

    /**
     * Gets the value of the csfbOverallRedirectionFailedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbOverallRedirectionFailedPerPlmn() {
        return csfbOverallRedirectionFailedPerPlmn;
    }

    /**
     * Sets the value of the csfbOverallRedirectionFailedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbOverallRedirectionFailedPerPlmn(JAXBElement<Integer> value) {
        this.csfbOverallRedirectionFailedPerPlmn = value;
    }

    /**
     * Gets the value of the csfbUnknownRedirectionFailedPerPlmn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbUnknownRedirectionFailedPerPlmn() {
        return csfbUnknownRedirectionFailedPerPlmn;
    }

    /**
     * Sets the value of the csfbUnknownRedirectionFailedPerPlmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbUnknownRedirectionFailedPerPlmn(JAXBElement<Integer> value) {
        this.csfbUnknownRedirectionFailedPerPlmn = value;
    }

}
