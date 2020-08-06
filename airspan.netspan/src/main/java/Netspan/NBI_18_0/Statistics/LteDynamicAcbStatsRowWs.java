
package Netspan.NBI_18_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteDynamicAcbStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteDynamicAcbStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttEmergencyCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttHighPriorityAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMtAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMoSignallingCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMoDataCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttDelayTolerantAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttEmergencyCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttHighPriorityAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMtAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMoSignallingCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttMoDataCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttDelayTolerantAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabAttInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccEmergencyCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccHighPriorityAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMtAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMoSignallingCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMoDataCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccDelayTolerantAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccEmergencyCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccHighPriorityAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMtAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMoSignallingCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccMoDataCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccDelayTolerantAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabSuccInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailEmergencyCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailHighPriorityAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMtAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMoSignallingCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMoDataCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailDelayTolerantAccessCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailEmergencyCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailHighPriorityAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMtAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMoSignallingCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailMoDataCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailDelayTolerantAccessCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnEstabFailInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttReconfigurationFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttHandoverFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttOtherFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttReconfigurationFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttHandoverFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttOtherFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabAttInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccReconfigurationFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccHandoverFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccOtherFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccReconfigurationFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccHandoverFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccOtherFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabSuccInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailReconfigurationFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailHandoverFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailOtherFailureCongMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailReconfigurationFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailHandoverFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailOtherFailureCongHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailInCongMeduimSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcConnReEstabFailInCongHighSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbCongMediumDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbCongHighDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbCongTransitionMedium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbCongTransitionHigh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbMediumStartTimerManagement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbMediumEndTimerManagement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbHighStartTimerManagement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AcbHighEndTimerManagement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteDynamicAcbStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "rrcConnEstabAttEmergencyCongMedium",
    "rrcConnEstabAttHighPriorityAccessCongMedium",
    "rrcConnEstabAttMtAccessCongMedium",
    "rrcConnEstabAttMoSignallingCongMedium",
    "rrcConnEstabAttMoDataCongMedium",
    "rrcConnEstabAttDelayTolerantAccessCongMedium",
    "rrcConnEstabAttEmergencyCongHigh",
    "rrcConnEstabAttHighPriorityAccessCongHigh",
    "rrcConnEstabAttMtAccessCongHigh",
    "rrcConnEstabAttMoSignallingCongHigh",
    "rrcConnEstabAttMoDataCongHigh",
    "rrcConnEstabAttDelayTolerantAccessCongHigh",
    "rrcConnEstabAttInCongMeduimSum",
    "rrcConnEstabAttInCongHighSum",
    "rrcConnEstabSuccEmergencyCongMedium",
    "rrcConnEstabSuccHighPriorityAccessCongMedium",
    "rrcConnEstabSuccMtAccessCongMedium",
    "rrcConnEstabSuccMoSignallingCongMedium",
    "rrcConnEstabSuccMoDataCongMedium",
    "rrcConnEstabSuccDelayTolerantAccessCongMedium",
    "rrcConnEstabSuccEmergencyCongHigh",
    "rrcConnEstabSuccHighPriorityAccessCongHigh",
    "rrcConnEstabSuccMtAccessCongHigh",
    "rrcConnEstabSuccMoSignallingCongHigh",
    "rrcConnEstabSuccMoDataCongHigh",
    "rrcConnEstabSuccDelayTolerantAccessCongHigh",
    "rrcConnEstabSuccInCongMeduimSum",
    "rrcConnEstabSuccInCongHighSum",
    "rrcConnEstabFailEmergencyCongMedium",
    "rrcConnEstabFailHighPriorityAccessCongMedium",
    "rrcConnEstabFailMtAccessCongMedium",
    "rrcConnEstabFailMoSignallingCongMedium",
    "rrcConnEstabFailMoDataCongMedium",
    "rrcConnEstabFailDelayTolerantAccessCongMedium",
    "rrcConnEstabFailEmergencyCongHigh",
    "rrcConnEstabFailHighPriorityAccessCongHigh",
    "rrcConnEstabFailMtAccessCongHigh",
    "rrcConnEstabFailMoSignallingCongHigh",
    "rrcConnEstabFailMoDataCongHigh",
    "rrcConnEstabFailDelayTolerantAccessCongHigh",
    "rrcConnEstabFailInCongMeduimSum",
    "rrcConnEstabFailInCongHighSum",
    "rrcConnReEstabAttReconfigurationFailureCongMedium",
    "rrcConnReEstabAttHandoverFailureCongMedium",
    "rrcConnReEstabAttOtherFailureCongMedium",
    "rrcConnReEstabAttReconfigurationFailureCongHigh",
    "rrcConnReEstabAttHandoverFailureCongHigh",
    "rrcConnReEstabAttOtherFailureCongHigh",
    "rrcConnReEstabAttInCongMeduimSum",
    "rrcConnReEstabAttInCongHighSum",
    "rrcConnReEstabSuccReconfigurationFailureCongMedium",
    "rrcConnReEstabSuccHandoverFailureCongMedium",
    "rrcConnReEstabSuccOtherFailureCongMedium",
    "rrcConnReEstabSuccReconfigurationFailureCongHigh",
    "rrcConnReEstabSuccHandoverFailureCongHigh",
    "rrcConnReEstabSuccOtherFailureCongHigh",
    "rrcConnReEstabSuccInCongMeduimSum",
    "rrcConnReEstabSuccInCongHighSum",
    "rrcConnReEstabFailReconfigurationFailureCongMedium",
    "rrcConnReEstabFailHandoverFailureCongMedium",
    "rrcConnReEstabFailOtherFailureCongMedium",
    "rrcConnReEstabFailReconfigurationFailureCongHigh",
    "rrcConnReEstabFailHandoverFailureCongHigh",
    "rrcConnReEstabFailOtherFailureCongHigh",
    "rrcConnReEstabFailInCongMeduimSum",
    "rrcConnReEstabFailInCongHighSum",
    "acbCongMediumDuration",
    "acbCongHighDuration",
    "acbCongTransitionMedium",
    "acbCongTransitionHigh",
    "acbMediumStartTimerManagement",
    "acbMediumEndTimerManagement",
    "acbHighStartTimerManagement",
    "acbHighEndTimerManagement"
})
public class LteDynamicAcbStatsRowWs {

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
    @XmlElementRef(name = "RrcConnEstabAttEmergencyCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttEmergencyCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttHighPriorityAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttHighPriorityAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttMtAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMtAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttMoSignallingCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMoSignallingCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttMoDataCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMoDataCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttDelayTolerantAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttDelayTolerantAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabAttEmergencyCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttEmergencyCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttHighPriorityAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttHighPriorityAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttMtAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMtAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttMoSignallingCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMoSignallingCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttMoDataCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttMoDataCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttDelayTolerantAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttDelayTolerantAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabAttInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttInCongMeduimSum;
    @XmlElementRef(name = "RrcConnEstabAttInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabAttInCongHighSum;
    @XmlElementRef(name = "RrcConnEstabSuccEmergencyCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccEmergencyCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccHighPriorityAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccHighPriorityAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccMtAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMtAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccMoSignallingCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMoSignallingCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccMoDataCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMoDataCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccDelayTolerantAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccDelayTolerantAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabSuccEmergencyCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccEmergencyCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccHighPriorityAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccHighPriorityAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccMtAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMtAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccMoSignallingCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMoSignallingCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccMoDataCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccMoDataCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccDelayTolerantAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccDelayTolerantAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabSuccInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccInCongMeduimSum;
    @XmlElementRef(name = "RrcConnEstabSuccInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabSuccInCongHighSum;
    @XmlElementRef(name = "RrcConnEstabFailEmergencyCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailEmergencyCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailHighPriorityAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailHighPriorityAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailMtAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMtAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailMoSignallingCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMoSignallingCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailMoDataCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMoDataCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailDelayTolerantAccessCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailDelayTolerantAccessCongMedium;
    @XmlElementRef(name = "RrcConnEstabFailEmergencyCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailEmergencyCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailHighPriorityAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailHighPriorityAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailMtAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMtAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailMoSignallingCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMoSignallingCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailMoDataCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailMoDataCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailDelayTolerantAccessCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailDelayTolerantAccessCongHigh;
    @XmlElementRef(name = "RrcConnEstabFailInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailInCongMeduimSum;
    @XmlElementRef(name = "RrcConnEstabFailInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnEstabFailInCongHighSum;
    @XmlElementRef(name = "RrcConnReEstabAttReconfigurationFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttReconfigurationFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabAttHandoverFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttHandoverFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabAttOtherFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttOtherFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabAttReconfigurationFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttReconfigurationFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabAttHandoverFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttHandoverFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabAttOtherFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttOtherFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabAttInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttInCongMeduimSum;
    @XmlElementRef(name = "RrcConnReEstabAttInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabAttInCongHighSum;
    @XmlElementRef(name = "RrcConnReEstabSuccReconfigurationFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccReconfigurationFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabSuccHandoverFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccHandoverFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabSuccOtherFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccOtherFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabSuccReconfigurationFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccReconfigurationFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabSuccHandoverFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccHandoverFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabSuccOtherFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccOtherFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabSuccInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccInCongMeduimSum;
    @XmlElementRef(name = "RrcConnReEstabSuccInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabSuccInCongHighSum;
    @XmlElementRef(name = "RrcConnReEstabFailReconfigurationFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailReconfigurationFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabFailHandoverFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailHandoverFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabFailOtherFailureCongMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailOtherFailureCongMedium;
    @XmlElementRef(name = "RrcConnReEstabFailReconfigurationFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailReconfigurationFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabFailHandoverFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailHandoverFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabFailOtherFailureCongHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailOtherFailureCongHigh;
    @XmlElementRef(name = "RrcConnReEstabFailInCongMeduimSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailInCongMeduimSum;
    @XmlElementRef(name = "RrcConnReEstabFailInCongHighSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcConnReEstabFailInCongHighSum;
    @XmlElementRef(name = "AcbCongMediumDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbCongMediumDuration;
    @XmlElementRef(name = "AcbCongHighDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbCongHighDuration;
    @XmlElementRef(name = "AcbCongTransitionMedium", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbCongTransitionMedium;
    @XmlElementRef(name = "AcbCongTransitionHigh", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbCongTransitionHigh;
    @XmlElementRef(name = "AcbMediumStartTimerManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbMediumStartTimerManagement;
    @XmlElementRef(name = "AcbMediumEndTimerManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbMediumEndTimerManagement;
    @XmlElementRef(name = "AcbHighStartTimerManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbHighStartTimerManagement;
    @XmlElementRef(name = "AcbHighEndTimerManagement", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> acbHighEndTimerManagement;

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
     * Gets the value of the rrcConnEstabAttEmergencyCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttEmergencyCongMedium() {
        return rrcConnEstabAttEmergencyCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttEmergencyCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttEmergencyCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttEmergencyCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttHighPriorityAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttHighPriorityAccessCongMedium() {
        return rrcConnEstabAttHighPriorityAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttHighPriorityAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttHighPriorityAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttHighPriorityAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMtAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMtAccessCongMedium() {
        return rrcConnEstabAttMtAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttMtAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMtAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMtAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMoSignallingCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMoSignallingCongMedium() {
        return rrcConnEstabAttMoSignallingCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttMoSignallingCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMoSignallingCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMoSignallingCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMoDataCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMoDataCongMedium() {
        return rrcConnEstabAttMoDataCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttMoDataCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMoDataCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMoDataCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttDelayTolerantAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttDelayTolerantAccessCongMedium() {
        return rrcConnEstabAttDelayTolerantAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabAttDelayTolerantAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttDelayTolerantAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabAttDelayTolerantAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttEmergencyCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttEmergencyCongHigh() {
        return rrcConnEstabAttEmergencyCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttEmergencyCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttEmergencyCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttEmergencyCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttHighPriorityAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttHighPriorityAccessCongHigh() {
        return rrcConnEstabAttHighPriorityAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttHighPriorityAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttHighPriorityAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttHighPriorityAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMtAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMtAccessCongHigh() {
        return rrcConnEstabAttMtAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttMtAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMtAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMtAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMoSignallingCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMoSignallingCongHigh() {
        return rrcConnEstabAttMoSignallingCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttMoSignallingCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMoSignallingCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMoSignallingCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttMoDataCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttMoDataCongHigh() {
        return rrcConnEstabAttMoDataCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttMoDataCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttMoDataCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttMoDataCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttDelayTolerantAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttDelayTolerantAccessCongHigh() {
        return rrcConnEstabAttDelayTolerantAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabAttDelayTolerantAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttDelayTolerantAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabAttDelayTolerantAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttInCongMeduimSum() {
        return rrcConnEstabAttInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnEstabAttInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnEstabAttInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnEstabAttInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabAttInCongHighSum() {
        return rrcConnEstabAttInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnEstabAttInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabAttInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnEstabAttInCongHighSum = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccEmergencyCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccEmergencyCongMedium() {
        return rrcConnEstabSuccEmergencyCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccEmergencyCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccEmergencyCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccEmergencyCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccHighPriorityAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccHighPriorityAccessCongMedium() {
        return rrcConnEstabSuccHighPriorityAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccHighPriorityAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccHighPriorityAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccHighPriorityAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMtAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMtAccessCongMedium() {
        return rrcConnEstabSuccMtAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMtAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMtAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMtAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMoSignallingCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMoSignallingCongMedium() {
        return rrcConnEstabSuccMoSignallingCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMoSignallingCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMoSignallingCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMoSignallingCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMoDataCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMoDataCongMedium() {
        return rrcConnEstabSuccMoDataCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMoDataCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMoDataCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMoDataCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccDelayTolerantAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccDelayTolerantAccessCongMedium() {
        return rrcConnEstabSuccDelayTolerantAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabSuccDelayTolerantAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccDelayTolerantAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccDelayTolerantAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccEmergencyCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccEmergencyCongHigh() {
        return rrcConnEstabSuccEmergencyCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccEmergencyCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccEmergencyCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccEmergencyCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccHighPriorityAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccHighPriorityAccessCongHigh() {
        return rrcConnEstabSuccHighPriorityAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccHighPriorityAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccHighPriorityAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccHighPriorityAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMtAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMtAccessCongHigh() {
        return rrcConnEstabSuccMtAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMtAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMtAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMtAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMoSignallingCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMoSignallingCongHigh() {
        return rrcConnEstabSuccMoSignallingCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMoSignallingCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMoSignallingCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMoSignallingCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccMoDataCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccMoDataCongHigh() {
        return rrcConnEstabSuccMoDataCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccMoDataCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccMoDataCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccMoDataCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccDelayTolerantAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccDelayTolerantAccessCongHigh() {
        return rrcConnEstabSuccDelayTolerantAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabSuccDelayTolerantAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccDelayTolerantAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccDelayTolerantAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccInCongMeduimSum() {
        return rrcConnEstabSuccInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnEstabSuccInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnEstabSuccInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabSuccInCongHighSum() {
        return rrcConnEstabSuccInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnEstabSuccInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabSuccInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnEstabSuccInCongHighSum = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailEmergencyCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailEmergencyCongMedium() {
        return rrcConnEstabFailEmergencyCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailEmergencyCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailEmergencyCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailEmergencyCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailHighPriorityAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailHighPriorityAccessCongMedium() {
        return rrcConnEstabFailHighPriorityAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailHighPriorityAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailHighPriorityAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailHighPriorityAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMtAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMtAccessCongMedium() {
        return rrcConnEstabFailMtAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailMtAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMtAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMtAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMoSignallingCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMoSignallingCongMedium() {
        return rrcConnEstabFailMoSignallingCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailMoSignallingCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMoSignallingCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMoSignallingCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMoDataCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMoDataCongMedium() {
        return rrcConnEstabFailMoDataCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailMoDataCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMoDataCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMoDataCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailDelayTolerantAccessCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailDelayTolerantAccessCongMedium() {
        return rrcConnEstabFailDelayTolerantAccessCongMedium;
    }

    /**
     * Sets the value of the rrcConnEstabFailDelayTolerantAccessCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailDelayTolerantAccessCongMedium(JAXBElement<Integer> value) {
        this.rrcConnEstabFailDelayTolerantAccessCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailEmergencyCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailEmergencyCongHigh() {
        return rrcConnEstabFailEmergencyCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailEmergencyCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailEmergencyCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailEmergencyCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailHighPriorityAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailHighPriorityAccessCongHigh() {
        return rrcConnEstabFailHighPriorityAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailHighPriorityAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailHighPriorityAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailHighPriorityAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMtAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMtAccessCongHigh() {
        return rrcConnEstabFailMtAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailMtAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMtAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMtAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMoSignallingCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMoSignallingCongHigh() {
        return rrcConnEstabFailMoSignallingCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailMoSignallingCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMoSignallingCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMoSignallingCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailMoDataCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailMoDataCongHigh() {
        return rrcConnEstabFailMoDataCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailMoDataCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailMoDataCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailMoDataCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailDelayTolerantAccessCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailDelayTolerantAccessCongHigh() {
        return rrcConnEstabFailDelayTolerantAccessCongHigh;
    }

    /**
     * Sets the value of the rrcConnEstabFailDelayTolerantAccessCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailDelayTolerantAccessCongHigh(JAXBElement<Integer> value) {
        this.rrcConnEstabFailDelayTolerantAccessCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailInCongMeduimSum() {
        return rrcConnEstabFailInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnEstabFailInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnEstabFailInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnEstabFailInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnEstabFailInCongHighSum() {
        return rrcConnEstabFailInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnEstabFailInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnEstabFailInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnEstabFailInCongHighSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttReconfigurationFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttReconfigurationFailureCongMedium() {
        return rrcConnReEstabAttReconfigurationFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabAttReconfigurationFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttReconfigurationFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttReconfigurationFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttHandoverFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttHandoverFailureCongMedium() {
        return rrcConnReEstabAttHandoverFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabAttHandoverFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttHandoverFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttHandoverFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttOtherFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttOtherFailureCongMedium() {
        return rrcConnReEstabAttOtherFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabAttOtherFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttOtherFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttOtherFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttReconfigurationFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttReconfigurationFailureCongHigh() {
        return rrcConnReEstabAttReconfigurationFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabAttReconfigurationFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttReconfigurationFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttReconfigurationFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttHandoverFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttHandoverFailureCongHigh() {
        return rrcConnReEstabAttHandoverFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabAttHandoverFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttHandoverFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttHandoverFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttOtherFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttOtherFailureCongHigh() {
        return rrcConnReEstabAttOtherFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabAttOtherFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttOtherFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttOtherFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttInCongMeduimSum() {
        return rrcConnReEstabAttInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnReEstabAttInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabAttInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabAttInCongHighSum() {
        return rrcConnReEstabAttInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnReEstabAttInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabAttInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabAttInCongHighSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccReconfigurationFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccReconfigurationFailureCongMedium() {
        return rrcConnReEstabSuccReconfigurationFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccReconfigurationFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccReconfigurationFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccReconfigurationFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccHandoverFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccHandoverFailureCongMedium() {
        return rrcConnReEstabSuccHandoverFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccHandoverFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccHandoverFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccHandoverFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccOtherFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccOtherFailureCongMedium() {
        return rrcConnReEstabSuccOtherFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccOtherFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccOtherFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccOtherFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccReconfigurationFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccReconfigurationFailureCongHigh() {
        return rrcConnReEstabSuccReconfigurationFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccReconfigurationFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccReconfigurationFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccReconfigurationFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccHandoverFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccHandoverFailureCongHigh() {
        return rrcConnReEstabSuccHandoverFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccHandoverFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccHandoverFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccHandoverFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccOtherFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccOtherFailureCongHigh() {
        return rrcConnReEstabSuccOtherFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccOtherFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccOtherFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccOtherFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccInCongMeduimSum() {
        return rrcConnReEstabSuccInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabSuccInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabSuccInCongHighSum() {
        return rrcConnReEstabSuccInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnReEstabSuccInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabSuccInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabSuccInCongHighSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailReconfigurationFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailReconfigurationFailureCongMedium() {
        return rrcConnReEstabFailReconfigurationFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabFailReconfigurationFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailReconfigurationFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailReconfigurationFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailHandoverFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailHandoverFailureCongMedium() {
        return rrcConnReEstabFailHandoverFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabFailHandoverFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailHandoverFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailHandoverFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailOtherFailureCongMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailOtherFailureCongMedium() {
        return rrcConnReEstabFailOtherFailureCongMedium;
    }

    /**
     * Sets the value of the rrcConnReEstabFailOtherFailureCongMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailOtherFailureCongMedium(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailOtherFailureCongMedium = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailReconfigurationFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailReconfigurationFailureCongHigh() {
        return rrcConnReEstabFailReconfigurationFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabFailReconfigurationFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailReconfigurationFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailReconfigurationFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailHandoverFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailHandoverFailureCongHigh() {
        return rrcConnReEstabFailHandoverFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabFailHandoverFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailHandoverFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailHandoverFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailOtherFailureCongHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailOtherFailureCongHigh() {
        return rrcConnReEstabFailOtherFailureCongHigh;
    }

    /**
     * Sets the value of the rrcConnReEstabFailOtherFailureCongHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailOtherFailureCongHigh(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailOtherFailureCongHigh = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailInCongMeduimSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailInCongMeduimSum() {
        return rrcConnReEstabFailInCongMeduimSum;
    }

    /**
     * Sets the value of the rrcConnReEstabFailInCongMeduimSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailInCongMeduimSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailInCongMeduimSum = value;
    }

    /**
     * Gets the value of the rrcConnReEstabFailInCongHighSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcConnReEstabFailInCongHighSum() {
        return rrcConnReEstabFailInCongHighSum;
    }

    /**
     * Sets the value of the rrcConnReEstabFailInCongHighSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcConnReEstabFailInCongHighSum(JAXBElement<Integer> value) {
        this.rrcConnReEstabFailInCongHighSum = value;
    }

    /**
     * Gets the value of the acbCongMediumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbCongMediumDuration() {
        return acbCongMediumDuration;
    }

    /**
     * Sets the value of the acbCongMediumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbCongMediumDuration(JAXBElement<Integer> value) {
        this.acbCongMediumDuration = value;
    }

    /**
     * Gets the value of the acbCongHighDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbCongHighDuration() {
        return acbCongHighDuration;
    }

    /**
     * Sets the value of the acbCongHighDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbCongHighDuration(JAXBElement<Integer> value) {
        this.acbCongHighDuration = value;
    }

    /**
     * Gets the value of the acbCongTransitionMedium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbCongTransitionMedium() {
        return acbCongTransitionMedium;
    }

    /**
     * Sets the value of the acbCongTransitionMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbCongTransitionMedium(JAXBElement<Integer> value) {
        this.acbCongTransitionMedium = value;
    }

    /**
     * Gets the value of the acbCongTransitionHigh property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbCongTransitionHigh() {
        return acbCongTransitionHigh;
    }

    /**
     * Sets the value of the acbCongTransitionHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbCongTransitionHigh(JAXBElement<Integer> value) {
        this.acbCongTransitionHigh = value;
    }

    /**
     * Gets the value of the acbMediumStartTimerManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbMediumStartTimerManagement() {
        return acbMediumStartTimerManagement;
    }

    /**
     * Sets the value of the acbMediumStartTimerManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbMediumStartTimerManagement(JAXBElement<Integer> value) {
        this.acbMediumStartTimerManagement = value;
    }

    /**
     * Gets the value of the acbMediumEndTimerManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbMediumEndTimerManagement() {
        return acbMediumEndTimerManagement;
    }

    /**
     * Sets the value of the acbMediumEndTimerManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbMediumEndTimerManagement(JAXBElement<Integer> value) {
        this.acbMediumEndTimerManagement = value;
    }

    /**
     * Gets the value of the acbHighStartTimerManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbHighStartTimerManagement() {
        return acbHighStartTimerManagement;
    }

    /**
     * Sets the value of the acbHighStartTimerManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbHighStartTimerManagement(JAXBElement<Integer> value) {
        this.acbHighStartTimerManagement = value;
    }

    /**
     * Gets the value of the acbHighEndTimerManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAcbHighEndTimerManagement() {
        return acbHighEndTimerManagement;
    }

    /**
     * Sets the value of the acbHighEndTimerManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAcbHighEndTimerManagement(JAXBElement<Integer> value) {
        this.acbHighEndTimerManagement = value;
    }

}
