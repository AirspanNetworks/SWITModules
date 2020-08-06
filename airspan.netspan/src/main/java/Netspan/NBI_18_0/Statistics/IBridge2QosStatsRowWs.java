
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
 * <p>Java class for IBridge2QosStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2QosStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QosTxPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxPktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxPktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxBytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxBytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxDropPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxDropPktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxDropPktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Pkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0PktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0PktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Bytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0BytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0BytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0PktsDropRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0PktsDropRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0PktsDropRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Occup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0OccupMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0OccupMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Latency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0LatencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0LatencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Jitter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0JitterMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0JitterMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0Rtt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0RttMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ0RttMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Pkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1PktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1PktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Bytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1BytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1BytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1PktsDropRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1PktsDropRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1PktsDropRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Occup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1OccupMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1OccupMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Latency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1LatencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1LatencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Jitter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1JitterMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1JitterMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1Rtt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1RttMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ1RttMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Pkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2PktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2PktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Bytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2BytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2BytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2PktsDropRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2PktsDropRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2PktsDropRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Occup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2OccupMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2OccupMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Latency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2LatencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2LatencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Jitter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2JitterMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2JitterMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2Rtt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2RttMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ2RttMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Pkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3PktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3PktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Bytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3BytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3BytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3PktsDropRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3PktsDropRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3PktsDropRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Occup" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3OccupMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3OccupMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Latency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3LatencyMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3LatencyMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Jitter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3JitterMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3JitterMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3Rtt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3RttMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QosTxQ3RttMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2QosStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "localMacAddress",
    "remoteMacAddress",
    "qosTxPkts",
    "qosTxPktsMin",
    "qosTxPktsMax",
    "qosTxBytes",
    "qosTxBytesMin",
    "qosTxBytesMax",
    "qosTxDropPkts",
    "qosTxDropPktsMin",
    "qosTxDropPktsMax",
    "qosTxQ0Pkts",
    "qosTxQ0PktsMin",
    "qosTxQ0PktsMax",
    "qosTxQ0Bytes",
    "qosTxQ0BytesMin",
    "qosTxQ0BytesMax",
    "qosTxQ0PktsDropRate",
    "qosTxQ0PktsDropRateMin",
    "qosTxQ0PktsDropRateMax",
    "qosTxQ0Occup",
    "qosTxQ0OccupMin",
    "qosTxQ0OccupMax",
    "qosTxQ0Latency",
    "qosTxQ0LatencyMin",
    "qosTxQ0LatencyMax",
    "qosTxQ0Jitter",
    "qosTxQ0JitterMin",
    "qosTxQ0JitterMax",
    "qosTxQ0Rtt",
    "qosTxQ0RttMin",
    "qosTxQ0RttMax",
    "qosTxQ1Pkts",
    "qosTxQ1PktsMin",
    "qosTxQ1PktsMax",
    "qosTxQ1Bytes",
    "qosTxQ1BytesMin",
    "qosTxQ1BytesMax",
    "qosTxQ1PktsDropRate",
    "qosTxQ1PktsDropRateMin",
    "qosTxQ1PktsDropRateMax",
    "qosTxQ1Occup",
    "qosTxQ1OccupMin",
    "qosTxQ1OccupMax",
    "qosTxQ1Latency",
    "qosTxQ1LatencyMin",
    "qosTxQ1LatencyMax",
    "qosTxQ1Jitter",
    "qosTxQ1JitterMin",
    "qosTxQ1JitterMax",
    "qosTxQ1Rtt",
    "qosTxQ1RttMin",
    "qosTxQ1RttMax",
    "qosTxQ2Pkts",
    "qosTxQ2PktsMin",
    "qosTxQ2PktsMax",
    "qosTxQ2Bytes",
    "qosTxQ2BytesMin",
    "qosTxQ2BytesMax",
    "qosTxQ2PktsDropRate",
    "qosTxQ2PktsDropRateMin",
    "qosTxQ2PktsDropRateMax",
    "qosTxQ2Occup",
    "qosTxQ2OccupMin",
    "qosTxQ2OccupMax",
    "qosTxQ2Latency",
    "qosTxQ2LatencyMin",
    "qosTxQ2LatencyMax",
    "qosTxQ2Jitter",
    "qosTxQ2JitterMin",
    "qosTxQ2JitterMax",
    "qosTxQ2Rtt",
    "qosTxQ2RttMin",
    "qosTxQ2RttMax",
    "qosTxQ3Pkts",
    "qosTxQ3PktsMin",
    "qosTxQ3PktsMax",
    "qosTxQ3Bytes",
    "qosTxQ3BytesMin",
    "qosTxQ3BytesMax",
    "qosTxQ3PktsDropRate",
    "qosTxQ3PktsDropRateMin",
    "qosTxQ3PktsDropRateMax",
    "qosTxQ3Occup",
    "qosTxQ3OccupMin",
    "qosTxQ3OccupMax",
    "qosTxQ3Latency",
    "qosTxQ3LatencyMin",
    "qosTxQ3LatencyMax",
    "qosTxQ3Jitter",
    "qosTxQ3JitterMin",
    "qosTxQ3JitterMax",
    "qosTxQ3Rtt",
    "qosTxQ3RttMin",
    "qosTxQ3RttMax"
})
public class IBridge2QosStatsRowWs {

    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElement(name = "LocalMacAddress")
    protected String localMacAddress;
    @XmlElement(name = "RemoteMacAddress")
    protected String remoteMacAddress;
    @XmlElementRef(name = "QosTxPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxPkts;
    @XmlElementRef(name = "QosTxPktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxPktsMin;
    @XmlElementRef(name = "QosTxPktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxPktsMax;
    @XmlElementRef(name = "QosTxBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxBytes;
    @XmlElementRef(name = "QosTxBytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxBytesMin;
    @XmlElementRef(name = "QosTxBytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxBytesMax;
    @XmlElementRef(name = "QosTxDropPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxDropPkts;
    @XmlElementRef(name = "QosTxDropPktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxDropPktsMin;
    @XmlElementRef(name = "QosTxDropPktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxDropPktsMax;
    @XmlElementRef(name = "QosTxQ0Pkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Pkts;
    @XmlElementRef(name = "QosTxQ0PktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0PktsMin;
    @XmlElementRef(name = "QosTxQ0PktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0PktsMax;
    @XmlElementRef(name = "QosTxQ0Bytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Bytes;
    @XmlElementRef(name = "QosTxQ0BytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0BytesMin;
    @XmlElementRef(name = "QosTxQ0BytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0BytesMax;
    @XmlElementRef(name = "QosTxQ0PktsDropRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0PktsDropRate;
    @XmlElementRef(name = "QosTxQ0PktsDropRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0PktsDropRateMin;
    @XmlElementRef(name = "QosTxQ0PktsDropRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0PktsDropRateMax;
    @XmlElementRef(name = "QosTxQ0Occup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Occup;
    @XmlElementRef(name = "QosTxQ0OccupMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0OccupMin;
    @XmlElementRef(name = "QosTxQ0OccupMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0OccupMax;
    @XmlElementRef(name = "QosTxQ0Latency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Latency;
    @XmlElementRef(name = "QosTxQ0LatencyMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0LatencyMin;
    @XmlElementRef(name = "QosTxQ0LatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0LatencyMax;
    @XmlElementRef(name = "QosTxQ0Jitter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Jitter;
    @XmlElementRef(name = "QosTxQ0JitterMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0JitterMin;
    @XmlElementRef(name = "QosTxQ0JitterMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0JitterMax;
    @XmlElementRef(name = "QosTxQ0Rtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0Rtt;
    @XmlElementRef(name = "QosTxQ0RttMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0RttMin;
    @XmlElementRef(name = "QosTxQ0RttMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ0RttMax;
    @XmlElementRef(name = "QosTxQ1Pkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Pkts;
    @XmlElementRef(name = "QosTxQ1PktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1PktsMin;
    @XmlElementRef(name = "QosTxQ1PktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1PktsMax;
    @XmlElementRef(name = "QosTxQ1Bytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Bytes;
    @XmlElementRef(name = "QosTxQ1BytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1BytesMin;
    @XmlElementRef(name = "QosTxQ1BytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1BytesMax;
    @XmlElementRef(name = "QosTxQ1PktsDropRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1PktsDropRate;
    @XmlElementRef(name = "QosTxQ1PktsDropRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1PktsDropRateMin;
    @XmlElementRef(name = "QosTxQ1PktsDropRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1PktsDropRateMax;
    @XmlElementRef(name = "QosTxQ1Occup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Occup;
    @XmlElementRef(name = "QosTxQ1OccupMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1OccupMin;
    @XmlElementRef(name = "QosTxQ1OccupMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1OccupMax;
    @XmlElementRef(name = "QosTxQ1Latency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Latency;
    @XmlElementRef(name = "QosTxQ1LatencyMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1LatencyMin;
    @XmlElementRef(name = "QosTxQ1LatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1LatencyMax;
    @XmlElementRef(name = "QosTxQ1Jitter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Jitter;
    @XmlElementRef(name = "QosTxQ1JitterMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1JitterMin;
    @XmlElementRef(name = "QosTxQ1JitterMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1JitterMax;
    @XmlElementRef(name = "QosTxQ1Rtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1Rtt;
    @XmlElementRef(name = "QosTxQ1RttMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1RttMin;
    @XmlElementRef(name = "QosTxQ1RttMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ1RttMax;
    @XmlElementRef(name = "QosTxQ2Pkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Pkts;
    @XmlElementRef(name = "QosTxQ2PktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2PktsMin;
    @XmlElementRef(name = "QosTxQ2PktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2PktsMax;
    @XmlElementRef(name = "QosTxQ2Bytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Bytes;
    @XmlElementRef(name = "QosTxQ2BytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2BytesMin;
    @XmlElementRef(name = "QosTxQ2BytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2BytesMax;
    @XmlElementRef(name = "QosTxQ2PktsDropRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2PktsDropRate;
    @XmlElementRef(name = "QosTxQ2PktsDropRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2PktsDropRateMin;
    @XmlElementRef(name = "QosTxQ2PktsDropRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2PktsDropRateMax;
    @XmlElementRef(name = "QosTxQ2Occup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Occup;
    @XmlElementRef(name = "QosTxQ2OccupMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2OccupMin;
    @XmlElementRef(name = "QosTxQ2OccupMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2OccupMax;
    @XmlElementRef(name = "QosTxQ2Latency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Latency;
    @XmlElementRef(name = "QosTxQ2LatencyMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2LatencyMin;
    @XmlElementRef(name = "QosTxQ2LatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2LatencyMax;
    @XmlElementRef(name = "QosTxQ2Jitter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Jitter;
    @XmlElementRef(name = "QosTxQ2JitterMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2JitterMin;
    @XmlElementRef(name = "QosTxQ2JitterMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2JitterMax;
    @XmlElementRef(name = "QosTxQ2Rtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2Rtt;
    @XmlElementRef(name = "QosTxQ2RttMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2RttMin;
    @XmlElementRef(name = "QosTxQ2RttMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ2RttMax;
    @XmlElementRef(name = "QosTxQ3Pkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Pkts;
    @XmlElementRef(name = "QosTxQ3PktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3PktsMin;
    @XmlElementRef(name = "QosTxQ3PktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3PktsMax;
    @XmlElementRef(name = "QosTxQ3Bytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Bytes;
    @XmlElementRef(name = "QosTxQ3BytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3BytesMin;
    @XmlElementRef(name = "QosTxQ3BytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3BytesMax;
    @XmlElementRef(name = "QosTxQ3PktsDropRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3PktsDropRate;
    @XmlElementRef(name = "QosTxQ3PktsDropRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3PktsDropRateMin;
    @XmlElementRef(name = "QosTxQ3PktsDropRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3PktsDropRateMax;
    @XmlElementRef(name = "QosTxQ3Occup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Occup;
    @XmlElementRef(name = "QosTxQ3OccupMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3OccupMin;
    @XmlElementRef(name = "QosTxQ3OccupMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3OccupMax;
    @XmlElementRef(name = "QosTxQ3Latency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Latency;
    @XmlElementRef(name = "QosTxQ3LatencyMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3LatencyMin;
    @XmlElementRef(name = "QosTxQ3LatencyMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3LatencyMax;
    @XmlElementRef(name = "QosTxQ3Jitter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Jitter;
    @XmlElementRef(name = "QosTxQ3JitterMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3JitterMin;
    @XmlElementRef(name = "QosTxQ3JitterMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3JitterMax;
    @XmlElementRef(name = "QosTxQ3Rtt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3Rtt;
    @XmlElementRef(name = "QosTxQ3RttMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3RttMin;
    @XmlElementRef(name = "QosTxQ3RttMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> qosTxQ3RttMax;

    /**
     * Gets the value of the dateTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStart() {
        return dateTimeStart;
    }

    /**
     * Sets the value of the dateTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStart(XMLGregorianCalendar value) {
        this.dateTimeStart = value;
    }

    /**
     * Gets the value of the dateTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeEnd() {
        return dateTimeEnd;
    }

    /**
     * Sets the value of the dateTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeEnd(XMLGregorianCalendar value) {
        this.dateTimeEnd = value;
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
     * Gets the value of the localMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalMacAddress() {
        return localMacAddress;
    }

    /**
     * Sets the value of the localMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalMacAddress(String value) {
        this.localMacAddress = value;
    }

    /**
     * Gets the value of the remoteMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteMacAddress() {
        return remoteMacAddress;
    }

    /**
     * Sets the value of the remoteMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteMacAddress(String value) {
        this.remoteMacAddress = value;
    }

    /**
     * Gets the value of the qosTxPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxPkts() {
        return qosTxPkts;
    }

    /**
     * Sets the value of the qosTxPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxPkts(JAXBElement<Double> value) {
        this.qosTxPkts = value;
    }

    /**
     * Gets the value of the qosTxPktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxPktsMin() {
        return qosTxPktsMin;
    }

    /**
     * Sets the value of the qosTxPktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxPktsMin(JAXBElement<Double> value) {
        this.qosTxPktsMin = value;
    }

    /**
     * Gets the value of the qosTxPktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxPktsMax() {
        return qosTxPktsMax;
    }

    /**
     * Sets the value of the qosTxPktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxPktsMax(JAXBElement<Double> value) {
        this.qosTxPktsMax = value;
    }

    /**
     * Gets the value of the qosTxBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxBytes() {
        return qosTxBytes;
    }

    /**
     * Sets the value of the qosTxBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxBytes(JAXBElement<Double> value) {
        this.qosTxBytes = value;
    }

    /**
     * Gets the value of the qosTxBytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxBytesMin() {
        return qosTxBytesMin;
    }

    /**
     * Sets the value of the qosTxBytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxBytesMin(JAXBElement<Double> value) {
        this.qosTxBytesMin = value;
    }

    /**
     * Gets the value of the qosTxBytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxBytesMax() {
        return qosTxBytesMax;
    }

    /**
     * Sets the value of the qosTxBytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxBytesMax(JAXBElement<Double> value) {
        this.qosTxBytesMax = value;
    }

    /**
     * Gets the value of the qosTxDropPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxDropPkts() {
        return qosTxDropPkts;
    }

    /**
     * Sets the value of the qosTxDropPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxDropPkts(JAXBElement<Double> value) {
        this.qosTxDropPkts = value;
    }

    /**
     * Gets the value of the qosTxDropPktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxDropPktsMin() {
        return qosTxDropPktsMin;
    }

    /**
     * Sets the value of the qosTxDropPktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxDropPktsMin(JAXBElement<Double> value) {
        this.qosTxDropPktsMin = value;
    }

    /**
     * Gets the value of the qosTxDropPktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxDropPktsMax() {
        return qosTxDropPktsMax;
    }

    /**
     * Sets the value of the qosTxDropPktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxDropPktsMax(JAXBElement<Double> value) {
        this.qosTxDropPktsMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Pkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Pkts() {
        return qosTxQ0Pkts;
    }

    /**
     * Sets the value of the qosTxQ0Pkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Pkts(JAXBElement<Double> value) {
        this.qosTxQ0Pkts = value;
    }

    /**
     * Gets the value of the qosTxQ0PktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0PktsMin() {
        return qosTxQ0PktsMin;
    }

    /**
     * Sets the value of the qosTxQ0PktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0PktsMin(JAXBElement<Double> value) {
        this.qosTxQ0PktsMin = value;
    }

    /**
     * Gets the value of the qosTxQ0PktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0PktsMax() {
        return qosTxQ0PktsMax;
    }

    /**
     * Sets the value of the qosTxQ0PktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0PktsMax(JAXBElement<Double> value) {
        this.qosTxQ0PktsMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Bytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Bytes() {
        return qosTxQ0Bytes;
    }

    /**
     * Sets the value of the qosTxQ0Bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Bytes(JAXBElement<Double> value) {
        this.qosTxQ0Bytes = value;
    }

    /**
     * Gets the value of the qosTxQ0BytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0BytesMin() {
        return qosTxQ0BytesMin;
    }

    /**
     * Sets the value of the qosTxQ0BytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0BytesMin(JAXBElement<Double> value) {
        this.qosTxQ0BytesMin = value;
    }

    /**
     * Gets the value of the qosTxQ0BytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0BytesMax() {
        return qosTxQ0BytesMax;
    }

    /**
     * Sets the value of the qosTxQ0BytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0BytesMax(JAXBElement<Double> value) {
        this.qosTxQ0BytesMax = value;
    }

    /**
     * Gets the value of the qosTxQ0PktsDropRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0PktsDropRate() {
        return qosTxQ0PktsDropRate;
    }

    /**
     * Sets the value of the qosTxQ0PktsDropRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0PktsDropRate(JAXBElement<Double> value) {
        this.qosTxQ0PktsDropRate = value;
    }

    /**
     * Gets the value of the qosTxQ0PktsDropRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0PktsDropRateMin() {
        return qosTxQ0PktsDropRateMin;
    }

    /**
     * Sets the value of the qosTxQ0PktsDropRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0PktsDropRateMin(JAXBElement<Double> value) {
        this.qosTxQ0PktsDropRateMin = value;
    }

    /**
     * Gets the value of the qosTxQ0PktsDropRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0PktsDropRateMax() {
        return qosTxQ0PktsDropRateMax;
    }

    /**
     * Sets the value of the qosTxQ0PktsDropRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0PktsDropRateMax(JAXBElement<Double> value) {
        this.qosTxQ0PktsDropRateMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Occup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Occup() {
        return qosTxQ0Occup;
    }

    /**
     * Sets the value of the qosTxQ0Occup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Occup(JAXBElement<Double> value) {
        this.qosTxQ0Occup = value;
    }

    /**
     * Gets the value of the qosTxQ0OccupMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0OccupMin() {
        return qosTxQ0OccupMin;
    }

    /**
     * Sets the value of the qosTxQ0OccupMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0OccupMin(JAXBElement<Double> value) {
        this.qosTxQ0OccupMin = value;
    }

    /**
     * Gets the value of the qosTxQ0OccupMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0OccupMax() {
        return qosTxQ0OccupMax;
    }

    /**
     * Sets the value of the qosTxQ0OccupMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0OccupMax(JAXBElement<Double> value) {
        this.qosTxQ0OccupMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Latency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Latency() {
        return qosTxQ0Latency;
    }

    /**
     * Sets the value of the qosTxQ0Latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Latency(JAXBElement<Double> value) {
        this.qosTxQ0Latency = value;
    }

    /**
     * Gets the value of the qosTxQ0LatencyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0LatencyMin() {
        return qosTxQ0LatencyMin;
    }

    /**
     * Sets the value of the qosTxQ0LatencyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0LatencyMin(JAXBElement<Double> value) {
        this.qosTxQ0LatencyMin = value;
    }

    /**
     * Gets the value of the qosTxQ0LatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0LatencyMax() {
        return qosTxQ0LatencyMax;
    }

    /**
     * Sets the value of the qosTxQ0LatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0LatencyMax(JAXBElement<Double> value) {
        this.qosTxQ0LatencyMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Jitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Jitter() {
        return qosTxQ0Jitter;
    }

    /**
     * Sets the value of the qosTxQ0Jitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Jitter(JAXBElement<Double> value) {
        this.qosTxQ0Jitter = value;
    }

    /**
     * Gets the value of the qosTxQ0JitterMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0JitterMin() {
        return qosTxQ0JitterMin;
    }

    /**
     * Sets the value of the qosTxQ0JitterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0JitterMin(JAXBElement<Double> value) {
        this.qosTxQ0JitterMin = value;
    }

    /**
     * Gets the value of the qosTxQ0JitterMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0JitterMax() {
        return qosTxQ0JitterMax;
    }

    /**
     * Sets the value of the qosTxQ0JitterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0JitterMax(JAXBElement<Double> value) {
        this.qosTxQ0JitterMax = value;
    }

    /**
     * Gets the value of the qosTxQ0Rtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0Rtt() {
        return qosTxQ0Rtt;
    }

    /**
     * Sets the value of the qosTxQ0Rtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0Rtt(JAXBElement<Double> value) {
        this.qosTxQ0Rtt = value;
    }

    /**
     * Gets the value of the qosTxQ0RttMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0RttMin() {
        return qosTxQ0RttMin;
    }

    /**
     * Sets the value of the qosTxQ0RttMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0RttMin(JAXBElement<Double> value) {
        this.qosTxQ0RttMin = value;
    }

    /**
     * Gets the value of the qosTxQ0RttMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ0RttMax() {
        return qosTxQ0RttMax;
    }

    /**
     * Sets the value of the qosTxQ0RttMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ0RttMax(JAXBElement<Double> value) {
        this.qosTxQ0RttMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Pkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Pkts() {
        return qosTxQ1Pkts;
    }

    /**
     * Sets the value of the qosTxQ1Pkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Pkts(JAXBElement<Double> value) {
        this.qosTxQ1Pkts = value;
    }

    /**
     * Gets the value of the qosTxQ1PktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1PktsMin() {
        return qosTxQ1PktsMin;
    }

    /**
     * Sets the value of the qosTxQ1PktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1PktsMin(JAXBElement<Double> value) {
        this.qosTxQ1PktsMin = value;
    }

    /**
     * Gets the value of the qosTxQ1PktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1PktsMax() {
        return qosTxQ1PktsMax;
    }

    /**
     * Sets the value of the qosTxQ1PktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1PktsMax(JAXBElement<Double> value) {
        this.qosTxQ1PktsMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Bytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Bytes() {
        return qosTxQ1Bytes;
    }

    /**
     * Sets the value of the qosTxQ1Bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Bytes(JAXBElement<Double> value) {
        this.qosTxQ1Bytes = value;
    }

    /**
     * Gets the value of the qosTxQ1BytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1BytesMin() {
        return qosTxQ1BytesMin;
    }

    /**
     * Sets the value of the qosTxQ1BytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1BytesMin(JAXBElement<Double> value) {
        this.qosTxQ1BytesMin = value;
    }

    /**
     * Gets the value of the qosTxQ1BytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1BytesMax() {
        return qosTxQ1BytesMax;
    }

    /**
     * Sets the value of the qosTxQ1BytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1BytesMax(JAXBElement<Double> value) {
        this.qosTxQ1BytesMax = value;
    }

    /**
     * Gets the value of the qosTxQ1PktsDropRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1PktsDropRate() {
        return qosTxQ1PktsDropRate;
    }

    /**
     * Sets the value of the qosTxQ1PktsDropRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1PktsDropRate(JAXBElement<Double> value) {
        this.qosTxQ1PktsDropRate = value;
    }

    /**
     * Gets the value of the qosTxQ1PktsDropRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1PktsDropRateMin() {
        return qosTxQ1PktsDropRateMin;
    }

    /**
     * Sets the value of the qosTxQ1PktsDropRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1PktsDropRateMin(JAXBElement<Double> value) {
        this.qosTxQ1PktsDropRateMin = value;
    }

    /**
     * Gets the value of the qosTxQ1PktsDropRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1PktsDropRateMax() {
        return qosTxQ1PktsDropRateMax;
    }

    /**
     * Sets the value of the qosTxQ1PktsDropRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1PktsDropRateMax(JAXBElement<Double> value) {
        this.qosTxQ1PktsDropRateMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Occup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Occup() {
        return qosTxQ1Occup;
    }

    /**
     * Sets the value of the qosTxQ1Occup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Occup(JAXBElement<Double> value) {
        this.qosTxQ1Occup = value;
    }

    /**
     * Gets the value of the qosTxQ1OccupMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1OccupMin() {
        return qosTxQ1OccupMin;
    }

    /**
     * Sets the value of the qosTxQ1OccupMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1OccupMin(JAXBElement<Double> value) {
        this.qosTxQ1OccupMin = value;
    }

    /**
     * Gets the value of the qosTxQ1OccupMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1OccupMax() {
        return qosTxQ1OccupMax;
    }

    /**
     * Sets the value of the qosTxQ1OccupMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1OccupMax(JAXBElement<Double> value) {
        this.qosTxQ1OccupMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Latency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Latency() {
        return qosTxQ1Latency;
    }

    /**
     * Sets the value of the qosTxQ1Latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Latency(JAXBElement<Double> value) {
        this.qosTxQ1Latency = value;
    }

    /**
     * Gets the value of the qosTxQ1LatencyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1LatencyMin() {
        return qosTxQ1LatencyMin;
    }

    /**
     * Sets the value of the qosTxQ1LatencyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1LatencyMin(JAXBElement<Double> value) {
        this.qosTxQ1LatencyMin = value;
    }

    /**
     * Gets the value of the qosTxQ1LatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1LatencyMax() {
        return qosTxQ1LatencyMax;
    }

    /**
     * Sets the value of the qosTxQ1LatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1LatencyMax(JAXBElement<Double> value) {
        this.qosTxQ1LatencyMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Jitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Jitter() {
        return qosTxQ1Jitter;
    }

    /**
     * Sets the value of the qosTxQ1Jitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Jitter(JAXBElement<Double> value) {
        this.qosTxQ1Jitter = value;
    }

    /**
     * Gets the value of the qosTxQ1JitterMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1JitterMin() {
        return qosTxQ1JitterMin;
    }

    /**
     * Sets the value of the qosTxQ1JitterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1JitterMin(JAXBElement<Double> value) {
        this.qosTxQ1JitterMin = value;
    }

    /**
     * Gets the value of the qosTxQ1JitterMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1JitterMax() {
        return qosTxQ1JitterMax;
    }

    /**
     * Sets the value of the qosTxQ1JitterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1JitterMax(JAXBElement<Double> value) {
        this.qosTxQ1JitterMax = value;
    }

    /**
     * Gets the value of the qosTxQ1Rtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1Rtt() {
        return qosTxQ1Rtt;
    }

    /**
     * Sets the value of the qosTxQ1Rtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1Rtt(JAXBElement<Double> value) {
        this.qosTxQ1Rtt = value;
    }

    /**
     * Gets the value of the qosTxQ1RttMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1RttMin() {
        return qosTxQ1RttMin;
    }

    /**
     * Sets the value of the qosTxQ1RttMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1RttMin(JAXBElement<Double> value) {
        this.qosTxQ1RttMin = value;
    }

    /**
     * Gets the value of the qosTxQ1RttMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ1RttMax() {
        return qosTxQ1RttMax;
    }

    /**
     * Sets the value of the qosTxQ1RttMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ1RttMax(JAXBElement<Double> value) {
        this.qosTxQ1RttMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Pkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Pkts() {
        return qosTxQ2Pkts;
    }

    /**
     * Sets the value of the qosTxQ2Pkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Pkts(JAXBElement<Double> value) {
        this.qosTxQ2Pkts = value;
    }

    /**
     * Gets the value of the qosTxQ2PktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2PktsMin() {
        return qosTxQ2PktsMin;
    }

    /**
     * Sets the value of the qosTxQ2PktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2PktsMin(JAXBElement<Double> value) {
        this.qosTxQ2PktsMin = value;
    }

    /**
     * Gets the value of the qosTxQ2PktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2PktsMax() {
        return qosTxQ2PktsMax;
    }

    /**
     * Sets the value of the qosTxQ2PktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2PktsMax(JAXBElement<Double> value) {
        this.qosTxQ2PktsMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Bytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Bytes() {
        return qosTxQ2Bytes;
    }

    /**
     * Sets the value of the qosTxQ2Bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Bytes(JAXBElement<Double> value) {
        this.qosTxQ2Bytes = value;
    }

    /**
     * Gets the value of the qosTxQ2BytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2BytesMin() {
        return qosTxQ2BytesMin;
    }

    /**
     * Sets the value of the qosTxQ2BytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2BytesMin(JAXBElement<Double> value) {
        this.qosTxQ2BytesMin = value;
    }

    /**
     * Gets the value of the qosTxQ2BytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2BytesMax() {
        return qosTxQ2BytesMax;
    }

    /**
     * Sets the value of the qosTxQ2BytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2BytesMax(JAXBElement<Double> value) {
        this.qosTxQ2BytesMax = value;
    }

    /**
     * Gets the value of the qosTxQ2PktsDropRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2PktsDropRate() {
        return qosTxQ2PktsDropRate;
    }

    /**
     * Sets the value of the qosTxQ2PktsDropRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2PktsDropRate(JAXBElement<Double> value) {
        this.qosTxQ2PktsDropRate = value;
    }

    /**
     * Gets the value of the qosTxQ2PktsDropRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2PktsDropRateMin() {
        return qosTxQ2PktsDropRateMin;
    }

    /**
     * Sets the value of the qosTxQ2PktsDropRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2PktsDropRateMin(JAXBElement<Double> value) {
        this.qosTxQ2PktsDropRateMin = value;
    }

    /**
     * Gets the value of the qosTxQ2PktsDropRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2PktsDropRateMax() {
        return qosTxQ2PktsDropRateMax;
    }

    /**
     * Sets the value of the qosTxQ2PktsDropRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2PktsDropRateMax(JAXBElement<Double> value) {
        this.qosTxQ2PktsDropRateMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Occup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Occup() {
        return qosTxQ2Occup;
    }

    /**
     * Sets the value of the qosTxQ2Occup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Occup(JAXBElement<Double> value) {
        this.qosTxQ2Occup = value;
    }

    /**
     * Gets the value of the qosTxQ2OccupMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2OccupMin() {
        return qosTxQ2OccupMin;
    }

    /**
     * Sets the value of the qosTxQ2OccupMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2OccupMin(JAXBElement<Double> value) {
        this.qosTxQ2OccupMin = value;
    }

    /**
     * Gets the value of the qosTxQ2OccupMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2OccupMax() {
        return qosTxQ2OccupMax;
    }

    /**
     * Sets the value of the qosTxQ2OccupMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2OccupMax(JAXBElement<Double> value) {
        this.qosTxQ2OccupMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Latency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Latency() {
        return qosTxQ2Latency;
    }

    /**
     * Sets the value of the qosTxQ2Latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Latency(JAXBElement<Double> value) {
        this.qosTxQ2Latency = value;
    }

    /**
     * Gets the value of the qosTxQ2LatencyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2LatencyMin() {
        return qosTxQ2LatencyMin;
    }

    /**
     * Sets the value of the qosTxQ2LatencyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2LatencyMin(JAXBElement<Double> value) {
        this.qosTxQ2LatencyMin = value;
    }

    /**
     * Gets the value of the qosTxQ2LatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2LatencyMax() {
        return qosTxQ2LatencyMax;
    }

    /**
     * Sets the value of the qosTxQ2LatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2LatencyMax(JAXBElement<Double> value) {
        this.qosTxQ2LatencyMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Jitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Jitter() {
        return qosTxQ2Jitter;
    }

    /**
     * Sets the value of the qosTxQ2Jitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Jitter(JAXBElement<Double> value) {
        this.qosTxQ2Jitter = value;
    }

    /**
     * Gets the value of the qosTxQ2JitterMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2JitterMin() {
        return qosTxQ2JitterMin;
    }

    /**
     * Sets the value of the qosTxQ2JitterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2JitterMin(JAXBElement<Double> value) {
        this.qosTxQ2JitterMin = value;
    }

    /**
     * Gets the value of the qosTxQ2JitterMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2JitterMax() {
        return qosTxQ2JitterMax;
    }

    /**
     * Sets the value of the qosTxQ2JitterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2JitterMax(JAXBElement<Double> value) {
        this.qosTxQ2JitterMax = value;
    }

    /**
     * Gets the value of the qosTxQ2Rtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2Rtt() {
        return qosTxQ2Rtt;
    }

    /**
     * Sets the value of the qosTxQ2Rtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2Rtt(JAXBElement<Double> value) {
        this.qosTxQ2Rtt = value;
    }

    /**
     * Gets the value of the qosTxQ2RttMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2RttMin() {
        return qosTxQ2RttMin;
    }

    /**
     * Sets the value of the qosTxQ2RttMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2RttMin(JAXBElement<Double> value) {
        this.qosTxQ2RttMin = value;
    }

    /**
     * Gets the value of the qosTxQ2RttMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ2RttMax() {
        return qosTxQ2RttMax;
    }

    /**
     * Sets the value of the qosTxQ2RttMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ2RttMax(JAXBElement<Double> value) {
        this.qosTxQ2RttMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Pkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Pkts() {
        return qosTxQ3Pkts;
    }

    /**
     * Sets the value of the qosTxQ3Pkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Pkts(JAXBElement<Double> value) {
        this.qosTxQ3Pkts = value;
    }

    /**
     * Gets the value of the qosTxQ3PktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3PktsMin() {
        return qosTxQ3PktsMin;
    }

    /**
     * Sets the value of the qosTxQ3PktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3PktsMin(JAXBElement<Double> value) {
        this.qosTxQ3PktsMin = value;
    }

    /**
     * Gets the value of the qosTxQ3PktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3PktsMax() {
        return qosTxQ3PktsMax;
    }

    /**
     * Sets the value of the qosTxQ3PktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3PktsMax(JAXBElement<Double> value) {
        this.qosTxQ3PktsMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Bytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Bytes() {
        return qosTxQ3Bytes;
    }

    /**
     * Sets the value of the qosTxQ3Bytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Bytes(JAXBElement<Double> value) {
        this.qosTxQ3Bytes = value;
    }

    /**
     * Gets the value of the qosTxQ3BytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3BytesMin() {
        return qosTxQ3BytesMin;
    }

    /**
     * Sets the value of the qosTxQ3BytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3BytesMin(JAXBElement<Double> value) {
        this.qosTxQ3BytesMin = value;
    }

    /**
     * Gets the value of the qosTxQ3BytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3BytesMax() {
        return qosTxQ3BytesMax;
    }

    /**
     * Sets the value of the qosTxQ3BytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3BytesMax(JAXBElement<Double> value) {
        this.qosTxQ3BytesMax = value;
    }

    /**
     * Gets the value of the qosTxQ3PktsDropRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3PktsDropRate() {
        return qosTxQ3PktsDropRate;
    }

    /**
     * Sets the value of the qosTxQ3PktsDropRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3PktsDropRate(JAXBElement<Double> value) {
        this.qosTxQ3PktsDropRate = value;
    }

    /**
     * Gets the value of the qosTxQ3PktsDropRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3PktsDropRateMin() {
        return qosTxQ3PktsDropRateMin;
    }

    /**
     * Sets the value of the qosTxQ3PktsDropRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3PktsDropRateMin(JAXBElement<Double> value) {
        this.qosTxQ3PktsDropRateMin = value;
    }

    /**
     * Gets the value of the qosTxQ3PktsDropRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3PktsDropRateMax() {
        return qosTxQ3PktsDropRateMax;
    }

    /**
     * Sets the value of the qosTxQ3PktsDropRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3PktsDropRateMax(JAXBElement<Double> value) {
        this.qosTxQ3PktsDropRateMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Occup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Occup() {
        return qosTxQ3Occup;
    }

    /**
     * Sets the value of the qosTxQ3Occup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Occup(JAXBElement<Double> value) {
        this.qosTxQ3Occup = value;
    }

    /**
     * Gets the value of the qosTxQ3OccupMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3OccupMin() {
        return qosTxQ3OccupMin;
    }

    /**
     * Sets the value of the qosTxQ3OccupMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3OccupMin(JAXBElement<Double> value) {
        this.qosTxQ3OccupMin = value;
    }

    /**
     * Gets the value of the qosTxQ3OccupMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3OccupMax() {
        return qosTxQ3OccupMax;
    }

    /**
     * Sets the value of the qosTxQ3OccupMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3OccupMax(JAXBElement<Double> value) {
        this.qosTxQ3OccupMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Latency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Latency() {
        return qosTxQ3Latency;
    }

    /**
     * Sets the value of the qosTxQ3Latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Latency(JAXBElement<Double> value) {
        this.qosTxQ3Latency = value;
    }

    /**
     * Gets the value of the qosTxQ3LatencyMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3LatencyMin() {
        return qosTxQ3LatencyMin;
    }

    /**
     * Sets the value of the qosTxQ3LatencyMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3LatencyMin(JAXBElement<Double> value) {
        this.qosTxQ3LatencyMin = value;
    }

    /**
     * Gets the value of the qosTxQ3LatencyMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3LatencyMax() {
        return qosTxQ3LatencyMax;
    }

    /**
     * Sets the value of the qosTxQ3LatencyMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3LatencyMax(JAXBElement<Double> value) {
        this.qosTxQ3LatencyMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Jitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Jitter() {
        return qosTxQ3Jitter;
    }

    /**
     * Sets the value of the qosTxQ3Jitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Jitter(JAXBElement<Double> value) {
        this.qosTxQ3Jitter = value;
    }

    /**
     * Gets the value of the qosTxQ3JitterMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3JitterMin() {
        return qosTxQ3JitterMin;
    }

    /**
     * Sets the value of the qosTxQ3JitterMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3JitterMin(JAXBElement<Double> value) {
        this.qosTxQ3JitterMin = value;
    }

    /**
     * Gets the value of the qosTxQ3JitterMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3JitterMax() {
        return qosTxQ3JitterMax;
    }

    /**
     * Sets the value of the qosTxQ3JitterMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3JitterMax(JAXBElement<Double> value) {
        this.qosTxQ3JitterMax = value;
    }

    /**
     * Gets the value of the qosTxQ3Rtt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3Rtt() {
        return qosTxQ3Rtt;
    }

    /**
     * Sets the value of the qosTxQ3Rtt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3Rtt(JAXBElement<Double> value) {
        this.qosTxQ3Rtt = value;
    }

    /**
     * Gets the value of the qosTxQ3RttMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3RttMin() {
        return qosTxQ3RttMin;
    }

    /**
     * Sets the value of the qosTxQ3RttMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3RttMin(JAXBElement<Double> value) {
        this.qosTxQ3RttMin = value;
    }

    /**
     * Gets the value of the qosTxQ3RttMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getQosTxQ3RttMax() {
        return qosTxQ3RttMax;
    }

    /**
     * Sets the value of the qosTxQ3RttMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setQosTxQ3RttMax(JAXBElement<Double> value) {
        this.qosTxQ3RttMax = value;
    }

}
