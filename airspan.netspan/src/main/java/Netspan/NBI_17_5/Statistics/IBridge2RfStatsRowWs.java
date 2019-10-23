
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
 * <p>Java class for IBridge2RfStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2RfStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EthernetInterfaceSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelFrequency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ChannelFrequency2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ChannelBandwidth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxPower2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxPktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxPktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxBytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxBytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxStreams" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxStreamsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxStreamsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxPkts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxPktsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxPktsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxBytesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxBytesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Per" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PerMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PerMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxStreams" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxStreamsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxStreamsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr1Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr1Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr2Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr2Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr3Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr3Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr4Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Snr4Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi1Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi1Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi2Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi2Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi3Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi3Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi4Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Rssi4Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr1Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr1Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr2Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr2Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr3Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr3Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr4Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Cinr4Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Noise" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NoiseMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Noise2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Noise2Min" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Noise2Max" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxMacRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxMacRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxMacRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxMacRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxMacRateMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxMacRateMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Crc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CrcMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CrcMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SpErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LpErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LpErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LpErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxDefers" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxDefersMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxDefersMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxTOuts" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxTOutsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxTOutsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRetries" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRetriesMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxRetriesMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Txfails" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxfailsMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxfailsMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Temp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TempMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TempMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LinkUp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LinkUptime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NodeUptime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2RfStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "localMacAddress",
    "remoteMacAddress",
    "ethernetInterfaceSpeed",
    "channelFrequency",
    "channelFrequency2",
    "channelBandwidth",
    "txPower",
    "txPower2",
    "txRate",
    "txRateMin",
    "txRateMax",
    "txPkts",
    "txPktsMin",
    "txPktsMax",
    "txBytes",
    "txBytesMin",
    "txBytesMax",
    "txMcs",
    "txStreams",
    "txStreamsMin",
    "txStreamsMax",
    "rxRate",
    "rxRateMin",
    "rxRateMax",
    "rxPkts",
    "rxPktsMin",
    "rxPktsMax",
    "rxBytes",
    "rxBytesMin",
    "rxBytesMax",
    "rxMcs",
    "per",
    "perMin",
    "perMax",
    "rxStreams",
    "rxStreamsMin",
    "rxStreamsMax",
    "snr1",
    "snr1Min",
    "snr1Max",
    "snr2",
    "snr2Min",
    "snr2Max",
    "snr3",
    "snr3Min",
    "snr3Max",
    "snr4",
    "snr4Min",
    "snr4Max",
    "rssi1",
    "rssi1Min",
    "rssi1Max",
    "rssi2",
    "rssi2Min",
    "rssi2Max",
    "rssi3",
    "rssi3Min",
    "rssi3Max",
    "rssi4",
    "rssi4Min",
    "rssi4Max",
    "cinr1",
    "cinr1Min",
    "cinr1Max",
    "cinr2",
    "cinr2Min",
    "cinr2Max",
    "cinr3",
    "cinr3Min",
    "cinr3Max",
    "cinr4",
    "cinr4Min",
    "cinr4Max",
    "noise",
    "noiseMin",
    "noiseMax",
    "noise2",
    "noise2Min",
    "noise2Max",
    "txMacRate",
    "txMacRateMin",
    "txMacRateMax",
    "rxMacRate",
    "rxMacRateMin",
    "rxMacRateMax",
    "crc",
    "crcMin",
    "crcMax",
    "spErr",
    "spErrMin",
    "spErrMax",
    "lpErr",
    "lpErrMin",
    "lpErrMax",
    "txDefers",
    "txDefersMin",
    "txDefersMax",
    "txTOuts",
    "txTOutsMin",
    "txTOutsMax",
    "txRetries",
    "txRetriesMin",
    "txRetriesMax",
    "txfails",
    "txfailsMin",
    "txfailsMax",
    "temp",
    "tempMin",
    "tempMax",
    "linkUp",
    "linkUptime",
    "nodeUptime"
})
public class IBridge2RfStatsRowWs {

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
    @XmlElement(name = "EthernetInterfaceSpeed")
    protected String ethernetInterfaceSpeed;
    @XmlElementRef(name = "ChannelFrequency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> channelFrequency;
    @XmlElementRef(name = "ChannelFrequency2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> channelFrequency2;
    @XmlElementRef(name = "ChannelBandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> channelBandwidth;
    @XmlElementRef(name = "TxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txPower;
    @XmlElementRef(name = "TxPower2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txPower2;
    @XmlElementRef(name = "TxRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRate;
    @XmlElementRef(name = "TxRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRateMin;
    @XmlElementRef(name = "TxRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRateMax;
    @XmlElementRef(name = "TxPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txPkts;
    @XmlElementRef(name = "TxPktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txPktsMin;
    @XmlElementRef(name = "TxPktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txPktsMax;
    @XmlElementRef(name = "TxBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txBytes;
    @XmlElementRef(name = "TxBytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txBytesMin;
    @XmlElementRef(name = "TxBytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txBytesMax;
    @XmlElementRef(name = "TxMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txMcs;
    @XmlElementRef(name = "TxStreams", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txStreams;
    @XmlElementRef(name = "TxStreamsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txStreamsMin;
    @XmlElementRef(name = "TxStreamsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txStreamsMax;
    @XmlElementRef(name = "RxRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxRate;
    @XmlElementRef(name = "RxRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxRateMin;
    @XmlElementRef(name = "RxRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxRateMax;
    @XmlElementRef(name = "RxPkts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxPkts;
    @XmlElementRef(name = "RxPktsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxPktsMin;
    @XmlElementRef(name = "RxPktsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxPktsMax;
    @XmlElementRef(name = "RxBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxBytes;
    @XmlElementRef(name = "RxBytesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxBytesMin;
    @XmlElementRef(name = "RxBytesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxBytesMax;
    @XmlElementRef(name = "RxMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rxMcs;
    @XmlElementRef(name = "Per", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> per;
    @XmlElementRef(name = "PerMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perMin;
    @XmlElementRef(name = "PerMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> perMax;
    @XmlElementRef(name = "RxStreams", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxStreams;
    @XmlElementRef(name = "RxStreamsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxStreamsMin;
    @XmlElementRef(name = "RxStreamsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxStreamsMax;
    @XmlElementRef(name = "Snr1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr1;
    @XmlElementRef(name = "Snr1Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr1Min;
    @XmlElementRef(name = "Snr1Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr1Max;
    @XmlElementRef(name = "Snr2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr2;
    @XmlElementRef(name = "Snr2Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr2Min;
    @XmlElementRef(name = "Snr2Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr2Max;
    @XmlElementRef(name = "Snr3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr3;
    @XmlElementRef(name = "Snr3Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr3Min;
    @XmlElementRef(name = "Snr3Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr3Max;
    @XmlElementRef(name = "Snr4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr4;
    @XmlElementRef(name = "Snr4Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr4Min;
    @XmlElementRef(name = "Snr4Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> snr4Max;
    @XmlElementRef(name = "Rssi1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi1;
    @XmlElementRef(name = "Rssi1Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi1Min;
    @XmlElementRef(name = "Rssi1Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi1Max;
    @XmlElementRef(name = "Rssi2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi2;
    @XmlElementRef(name = "Rssi2Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi2Min;
    @XmlElementRef(name = "Rssi2Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi2Max;
    @XmlElementRef(name = "Rssi3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi3;
    @XmlElementRef(name = "Rssi3Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi3Min;
    @XmlElementRef(name = "Rssi3Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi3Max;
    @XmlElementRef(name = "Rssi4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi4;
    @XmlElementRef(name = "Rssi4Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi4Min;
    @XmlElementRef(name = "Rssi4Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rssi4Max;
    @XmlElementRef(name = "Cinr1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr1;
    @XmlElementRef(name = "Cinr1Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr1Min;
    @XmlElementRef(name = "Cinr1Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr1Max;
    @XmlElementRef(name = "Cinr2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr2;
    @XmlElementRef(name = "Cinr2Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr2Min;
    @XmlElementRef(name = "Cinr2Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr2Max;
    @XmlElementRef(name = "Cinr3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr3;
    @XmlElementRef(name = "Cinr3Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr3Min;
    @XmlElementRef(name = "Cinr3Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr3Max;
    @XmlElementRef(name = "Cinr4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr4;
    @XmlElementRef(name = "Cinr4Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr4Min;
    @XmlElementRef(name = "Cinr4Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> cinr4Max;
    @XmlElementRef(name = "Noise", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noise;
    @XmlElementRef(name = "NoiseMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseMin;
    @XmlElementRef(name = "NoiseMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noiseMax;
    @XmlElementRef(name = "Noise2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noise2;
    @XmlElementRef(name = "Noise2Min", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noise2Min;
    @XmlElementRef(name = "Noise2Max", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> noise2Max;
    @XmlElementRef(name = "TxMacRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txMacRate;
    @XmlElementRef(name = "TxMacRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txMacRateMin;
    @XmlElementRef(name = "TxMacRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txMacRateMax;
    @XmlElementRef(name = "RxMacRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxMacRate;
    @XmlElementRef(name = "RxMacRateMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxMacRateMin;
    @XmlElementRef(name = "RxMacRateMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxMacRateMax;
    @XmlElementRef(name = "Crc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> crc;
    @XmlElementRef(name = "CrcMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> crcMin;
    @XmlElementRef(name = "CrcMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> crcMax;
    @XmlElementRef(name = "SpErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spErr;
    @XmlElementRef(name = "SpErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spErrMin;
    @XmlElementRef(name = "SpErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> spErrMax;
    @XmlElementRef(name = "LpErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lpErr;
    @XmlElementRef(name = "LpErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lpErrMin;
    @XmlElementRef(name = "LpErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> lpErrMax;
    @XmlElementRef(name = "TxDefers", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txDefers;
    @XmlElementRef(name = "TxDefersMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txDefersMin;
    @XmlElementRef(name = "TxDefersMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txDefersMax;
    @XmlElementRef(name = "TxTOuts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txTOuts;
    @XmlElementRef(name = "TxTOutsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txTOutsMin;
    @XmlElementRef(name = "TxTOutsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txTOutsMax;
    @XmlElementRef(name = "TxRetries", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRetries;
    @XmlElementRef(name = "TxRetriesMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRetriesMin;
    @XmlElementRef(name = "TxRetriesMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txRetriesMax;
    @XmlElementRef(name = "Txfails", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txfails;
    @XmlElementRef(name = "TxfailsMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txfailsMin;
    @XmlElementRef(name = "TxfailsMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txfailsMax;
    @XmlElementRef(name = "Temp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> temp;
    @XmlElementRef(name = "TempMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> tempMin;
    @XmlElementRef(name = "TempMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> tempMax;
    @XmlElementRef(name = "LinkUp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> linkUp;
    @XmlElementRef(name = "LinkUptime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> linkUptime;
    @XmlElementRef(name = "NodeUptime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nodeUptime;

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
     * Gets the value of the ethernetInterfaceSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEthernetInterfaceSpeed() {
        return ethernetInterfaceSpeed;
    }

    /**
     * Sets the value of the ethernetInterfaceSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEthernetInterfaceSpeed(String value) {
        this.ethernetInterfaceSpeed = value;
    }

    /**
     * Gets the value of the channelFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getChannelFrequency() {
        return channelFrequency;
    }

    /**
     * Sets the value of the channelFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setChannelFrequency(JAXBElement<Double> value) {
        this.channelFrequency = value;
    }

    /**
     * Gets the value of the channelFrequency2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getChannelFrequency2() {
        return channelFrequency2;
    }

    /**
     * Sets the value of the channelFrequency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setChannelFrequency2(JAXBElement<Double> value) {
        this.channelFrequency2 = value;
    }

    /**
     * Gets the value of the channelBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getChannelBandwidth() {
        return channelBandwidth;
    }

    /**
     * Sets the value of the channelBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setChannelBandwidth(JAXBElement<Double> value) {
        this.channelBandwidth = value;
    }

    /**
     * Gets the value of the txPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxPower() {
        return txPower;
    }

    /**
     * Sets the value of the txPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxPower(JAXBElement<Double> value) {
        this.txPower = value;
    }

    /**
     * Gets the value of the txPower2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxPower2() {
        return txPower2;
    }

    /**
     * Sets the value of the txPower2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxPower2(JAXBElement<Double> value) {
        this.txPower2 = value;
    }

    /**
     * Gets the value of the txRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRate() {
        return txRate;
    }

    /**
     * Sets the value of the txRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRate(JAXBElement<Double> value) {
        this.txRate = value;
    }

    /**
     * Gets the value of the txRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRateMin() {
        return txRateMin;
    }

    /**
     * Sets the value of the txRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRateMin(JAXBElement<Double> value) {
        this.txRateMin = value;
    }

    /**
     * Gets the value of the txRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRateMax() {
        return txRateMax;
    }

    /**
     * Sets the value of the txRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRateMax(JAXBElement<Double> value) {
        this.txRateMax = value;
    }

    /**
     * Gets the value of the txPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxPkts() {
        return txPkts;
    }

    /**
     * Sets the value of the txPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxPkts(JAXBElement<Double> value) {
        this.txPkts = value;
    }

    /**
     * Gets the value of the txPktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxPktsMin() {
        return txPktsMin;
    }

    /**
     * Sets the value of the txPktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxPktsMin(JAXBElement<Double> value) {
        this.txPktsMin = value;
    }

    /**
     * Gets the value of the txPktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxPktsMax() {
        return txPktsMax;
    }

    /**
     * Sets the value of the txPktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxPktsMax(JAXBElement<Double> value) {
        this.txPktsMax = value;
    }

    /**
     * Gets the value of the txBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxBytes() {
        return txBytes;
    }

    /**
     * Sets the value of the txBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxBytes(JAXBElement<Double> value) {
        this.txBytes = value;
    }

    /**
     * Gets the value of the txBytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxBytesMin() {
        return txBytesMin;
    }

    /**
     * Sets the value of the txBytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxBytesMin(JAXBElement<Double> value) {
        this.txBytesMin = value;
    }

    /**
     * Gets the value of the txBytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxBytesMax() {
        return txBytesMax;
    }

    /**
     * Sets the value of the txBytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxBytesMax(JAXBElement<Double> value) {
        this.txBytesMax = value;
    }

    /**
     * Gets the value of the txMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxMcs() {
        return txMcs;
    }

    /**
     * Sets the value of the txMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxMcs(JAXBElement<Integer> value) {
        this.txMcs = value;
    }

    /**
     * Gets the value of the txStreams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxStreams() {
        return txStreams;
    }

    /**
     * Sets the value of the txStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxStreams(JAXBElement<Double> value) {
        this.txStreams = value;
    }

    /**
     * Gets the value of the txStreamsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxStreamsMin() {
        return txStreamsMin;
    }

    /**
     * Sets the value of the txStreamsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxStreamsMin(JAXBElement<Double> value) {
        this.txStreamsMin = value;
    }

    /**
     * Gets the value of the txStreamsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxStreamsMax() {
        return txStreamsMax;
    }

    /**
     * Sets the value of the txStreamsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxStreamsMax(JAXBElement<Double> value) {
        this.txStreamsMax = value;
    }

    /**
     * Gets the value of the rxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxRate() {
        return rxRate;
    }

    /**
     * Sets the value of the rxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxRate(JAXBElement<Double> value) {
        this.rxRate = value;
    }

    /**
     * Gets the value of the rxRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxRateMin() {
        return rxRateMin;
    }

    /**
     * Sets the value of the rxRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxRateMin(JAXBElement<Double> value) {
        this.rxRateMin = value;
    }

    /**
     * Gets the value of the rxRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxRateMax() {
        return rxRateMax;
    }

    /**
     * Sets the value of the rxRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxRateMax(JAXBElement<Double> value) {
        this.rxRateMax = value;
    }

    /**
     * Gets the value of the rxPkts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxPkts() {
        return rxPkts;
    }

    /**
     * Sets the value of the rxPkts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxPkts(JAXBElement<Double> value) {
        this.rxPkts = value;
    }

    /**
     * Gets the value of the rxPktsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxPktsMin() {
        return rxPktsMin;
    }

    /**
     * Sets the value of the rxPktsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxPktsMin(JAXBElement<Double> value) {
        this.rxPktsMin = value;
    }

    /**
     * Gets the value of the rxPktsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxPktsMax() {
        return rxPktsMax;
    }

    /**
     * Sets the value of the rxPktsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxPktsMax(JAXBElement<Double> value) {
        this.rxPktsMax = value;
    }

    /**
     * Gets the value of the rxBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxBytes() {
        return rxBytes;
    }

    /**
     * Sets the value of the rxBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxBytes(JAXBElement<Double> value) {
        this.rxBytes = value;
    }

    /**
     * Gets the value of the rxBytesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxBytesMin() {
        return rxBytesMin;
    }

    /**
     * Sets the value of the rxBytesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxBytesMin(JAXBElement<Double> value) {
        this.rxBytesMin = value;
    }

    /**
     * Gets the value of the rxBytesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxBytesMax() {
        return rxBytesMax;
    }

    /**
     * Sets the value of the rxBytesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxBytesMax(JAXBElement<Double> value) {
        this.rxBytesMax = value;
    }

    /**
     * Gets the value of the rxMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRxMcs() {
        return rxMcs;
    }

    /**
     * Sets the value of the rxMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRxMcs(JAXBElement<Integer> value) {
        this.rxMcs = value;
    }

    /**
     * Gets the value of the per property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPer() {
        return per;
    }

    /**
     * Sets the value of the per property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPer(JAXBElement<Double> value) {
        this.per = value;
    }

    /**
     * Gets the value of the perMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerMin() {
        return perMin;
    }

    /**
     * Sets the value of the perMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerMin(JAXBElement<Double> value) {
        this.perMin = value;
    }

    /**
     * Gets the value of the perMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPerMax() {
        return perMax;
    }

    /**
     * Sets the value of the perMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPerMax(JAXBElement<Double> value) {
        this.perMax = value;
    }

    /**
     * Gets the value of the rxStreams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxStreams() {
        return rxStreams;
    }

    /**
     * Sets the value of the rxStreams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxStreams(JAXBElement<Double> value) {
        this.rxStreams = value;
    }

    /**
     * Gets the value of the rxStreamsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxStreamsMin() {
        return rxStreamsMin;
    }

    /**
     * Sets the value of the rxStreamsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxStreamsMin(JAXBElement<Double> value) {
        this.rxStreamsMin = value;
    }

    /**
     * Gets the value of the rxStreamsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxStreamsMax() {
        return rxStreamsMax;
    }

    /**
     * Sets the value of the rxStreamsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxStreamsMax(JAXBElement<Double> value) {
        this.rxStreamsMax = value;
    }

    /**
     * Gets the value of the snr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr1() {
        return snr1;
    }

    /**
     * Sets the value of the snr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr1(JAXBElement<Double> value) {
        this.snr1 = value;
    }

    /**
     * Gets the value of the snr1Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr1Min() {
        return snr1Min;
    }

    /**
     * Sets the value of the snr1Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr1Min(JAXBElement<Double> value) {
        this.snr1Min = value;
    }

    /**
     * Gets the value of the snr1Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr1Max() {
        return snr1Max;
    }

    /**
     * Sets the value of the snr1Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr1Max(JAXBElement<Double> value) {
        this.snr1Max = value;
    }

    /**
     * Gets the value of the snr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr2() {
        return snr2;
    }

    /**
     * Sets the value of the snr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr2(JAXBElement<Double> value) {
        this.snr2 = value;
    }

    /**
     * Gets the value of the snr2Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr2Min() {
        return snr2Min;
    }

    /**
     * Sets the value of the snr2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr2Min(JAXBElement<Double> value) {
        this.snr2Min = value;
    }

    /**
     * Gets the value of the snr2Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr2Max() {
        return snr2Max;
    }

    /**
     * Sets the value of the snr2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr2Max(JAXBElement<Double> value) {
        this.snr2Max = value;
    }

    /**
     * Gets the value of the snr3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr3() {
        return snr3;
    }

    /**
     * Sets the value of the snr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr3(JAXBElement<Double> value) {
        this.snr3 = value;
    }

    /**
     * Gets the value of the snr3Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr3Min() {
        return snr3Min;
    }

    /**
     * Sets the value of the snr3Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr3Min(JAXBElement<Double> value) {
        this.snr3Min = value;
    }

    /**
     * Gets the value of the snr3Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr3Max() {
        return snr3Max;
    }

    /**
     * Sets the value of the snr3Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr3Max(JAXBElement<Double> value) {
        this.snr3Max = value;
    }

    /**
     * Gets the value of the snr4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr4() {
        return snr4;
    }

    /**
     * Sets the value of the snr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr4(JAXBElement<Double> value) {
        this.snr4 = value;
    }

    /**
     * Gets the value of the snr4Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr4Min() {
        return snr4Min;
    }

    /**
     * Sets the value of the snr4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr4Min(JAXBElement<Double> value) {
        this.snr4Min = value;
    }

    /**
     * Gets the value of the snr4Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSnr4Max() {
        return snr4Max;
    }

    /**
     * Sets the value of the snr4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSnr4Max(JAXBElement<Double> value) {
        this.snr4Max = value;
    }

    /**
     * Gets the value of the rssi1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi1() {
        return rssi1;
    }

    /**
     * Sets the value of the rssi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi1(JAXBElement<Double> value) {
        this.rssi1 = value;
    }

    /**
     * Gets the value of the rssi1Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi1Min() {
        return rssi1Min;
    }

    /**
     * Sets the value of the rssi1Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi1Min(JAXBElement<Double> value) {
        this.rssi1Min = value;
    }

    /**
     * Gets the value of the rssi1Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi1Max() {
        return rssi1Max;
    }

    /**
     * Sets the value of the rssi1Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi1Max(JAXBElement<Double> value) {
        this.rssi1Max = value;
    }

    /**
     * Gets the value of the rssi2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi2() {
        return rssi2;
    }

    /**
     * Sets the value of the rssi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi2(JAXBElement<Double> value) {
        this.rssi2 = value;
    }

    /**
     * Gets the value of the rssi2Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi2Min() {
        return rssi2Min;
    }

    /**
     * Sets the value of the rssi2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi2Min(JAXBElement<Double> value) {
        this.rssi2Min = value;
    }

    /**
     * Gets the value of the rssi2Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi2Max() {
        return rssi2Max;
    }

    /**
     * Sets the value of the rssi2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi2Max(JAXBElement<Double> value) {
        this.rssi2Max = value;
    }

    /**
     * Gets the value of the rssi3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi3() {
        return rssi3;
    }

    /**
     * Sets the value of the rssi3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi3(JAXBElement<Double> value) {
        this.rssi3 = value;
    }

    /**
     * Gets the value of the rssi3Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi3Min() {
        return rssi3Min;
    }

    /**
     * Sets the value of the rssi3Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi3Min(JAXBElement<Double> value) {
        this.rssi3Min = value;
    }

    /**
     * Gets the value of the rssi3Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi3Max() {
        return rssi3Max;
    }

    /**
     * Sets the value of the rssi3Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi3Max(JAXBElement<Double> value) {
        this.rssi3Max = value;
    }

    /**
     * Gets the value of the rssi4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi4() {
        return rssi4;
    }

    /**
     * Sets the value of the rssi4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi4(JAXBElement<Double> value) {
        this.rssi4 = value;
    }

    /**
     * Gets the value of the rssi4Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi4Min() {
        return rssi4Min;
    }

    /**
     * Sets the value of the rssi4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi4Min(JAXBElement<Double> value) {
        this.rssi4Min = value;
    }

    /**
     * Gets the value of the rssi4Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRssi4Max() {
        return rssi4Max;
    }

    /**
     * Sets the value of the rssi4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRssi4Max(JAXBElement<Double> value) {
        this.rssi4Max = value;
    }

    /**
     * Gets the value of the cinr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr1() {
        return cinr1;
    }

    /**
     * Sets the value of the cinr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr1(JAXBElement<Double> value) {
        this.cinr1 = value;
    }

    /**
     * Gets the value of the cinr1Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr1Min() {
        return cinr1Min;
    }

    /**
     * Sets the value of the cinr1Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr1Min(JAXBElement<Double> value) {
        this.cinr1Min = value;
    }

    /**
     * Gets the value of the cinr1Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr1Max() {
        return cinr1Max;
    }

    /**
     * Sets the value of the cinr1Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr1Max(JAXBElement<Double> value) {
        this.cinr1Max = value;
    }

    /**
     * Gets the value of the cinr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr2() {
        return cinr2;
    }

    /**
     * Sets the value of the cinr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr2(JAXBElement<Double> value) {
        this.cinr2 = value;
    }

    /**
     * Gets the value of the cinr2Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr2Min() {
        return cinr2Min;
    }

    /**
     * Sets the value of the cinr2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr2Min(JAXBElement<Double> value) {
        this.cinr2Min = value;
    }

    /**
     * Gets the value of the cinr2Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr2Max() {
        return cinr2Max;
    }

    /**
     * Sets the value of the cinr2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr2Max(JAXBElement<Double> value) {
        this.cinr2Max = value;
    }

    /**
     * Gets the value of the cinr3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr3() {
        return cinr3;
    }

    /**
     * Sets the value of the cinr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr3(JAXBElement<Double> value) {
        this.cinr3 = value;
    }

    /**
     * Gets the value of the cinr3Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr3Min() {
        return cinr3Min;
    }

    /**
     * Sets the value of the cinr3Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr3Min(JAXBElement<Double> value) {
        this.cinr3Min = value;
    }

    /**
     * Gets the value of the cinr3Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr3Max() {
        return cinr3Max;
    }

    /**
     * Sets the value of the cinr3Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr3Max(JAXBElement<Double> value) {
        this.cinr3Max = value;
    }

    /**
     * Gets the value of the cinr4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr4() {
        return cinr4;
    }

    /**
     * Sets the value of the cinr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr4(JAXBElement<Double> value) {
        this.cinr4 = value;
    }

    /**
     * Gets the value of the cinr4Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr4Min() {
        return cinr4Min;
    }

    /**
     * Sets the value of the cinr4Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr4Min(JAXBElement<Double> value) {
        this.cinr4Min = value;
    }

    /**
     * Gets the value of the cinr4Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCinr4Max() {
        return cinr4Max;
    }

    /**
     * Sets the value of the cinr4Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCinr4Max(JAXBElement<Double> value) {
        this.cinr4Max = value;
    }

    /**
     * Gets the value of the noise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoise() {
        return noise;
    }

    /**
     * Sets the value of the noise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoise(JAXBElement<Double> value) {
        this.noise = value;
    }

    /**
     * Gets the value of the noiseMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseMin() {
        return noiseMin;
    }

    /**
     * Sets the value of the noiseMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseMin(JAXBElement<Double> value) {
        this.noiseMin = value;
    }

    /**
     * Gets the value of the noiseMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoiseMax() {
        return noiseMax;
    }

    /**
     * Sets the value of the noiseMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoiseMax(JAXBElement<Double> value) {
        this.noiseMax = value;
    }

    /**
     * Gets the value of the noise2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoise2() {
        return noise2;
    }

    /**
     * Sets the value of the noise2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoise2(JAXBElement<Double> value) {
        this.noise2 = value;
    }

    /**
     * Gets the value of the noise2Min property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoise2Min() {
        return noise2Min;
    }

    /**
     * Sets the value of the noise2Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoise2Min(JAXBElement<Double> value) {
        this.noise2Min = value;
    }

    /**
     * Gets the value of the noise2Max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getNoise2Max() {
        return noise2Max;
    }

    /**
     * Sets the value of the noise2Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setNoise2Max(JAXBElement<Double> value) {
        this.noise2Max = value;
    }

    /**
     * Gets the value of the txMacRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxMacRate() {
        return txMacRate;
    }

    /**
     * Sets the value of the txMacRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxMacRate(JAXBElement<Double> value) {
        this.txMacRate = value;
    }

    /**
     * Gets the value of the txMacRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxMacRateMin() {
        return txMacRateMin;
    }

    /**
     * Sets the value of the txMacRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxMacRateMin(JAXBElement<Double> value) {
        this.txMacRateMin = value;
    }

    /**
     * Gets the value of the txMacRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxMacRateMax() {
        return txMacRateMax;
    }

    /**
     * Sets the value of the txMacRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxMacRateMax(JAXBElement<Double> value) {
        this.txMacRateMax = value;
    }

    /**
     * Gets the value of the rxMacRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxMacRate() {
        return rxMacRate;
    }

    /**
     * Sets the value of the rxMacRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxMacRate(JAXBElement<Double> value) {
        this.rxMacRate = value;
    }

    /**
     * Gets the value of the rxMacRateMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxMacRateMin() {
        return rxMacRateMin;
    }

    /**
     * Sets the value of the rxMacRateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxMacRateMin(JAXBElement<Double> value) {
        this.rxMacRateMin = value;
    }

    /**
     * Gets the value of the rxMacRateMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxMacRateMax() {
        return rxMacRateMax;
    }

    /**
     * Sets the value of the rxMacRateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxMacRateMax(JAXBElement<Double> value) {
        this.rxMacRateMax = value;
    }

    /**
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCrc() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCrc(JAXBElement<Double> value) {
        this.crc = value;
    }

    /**
     * Gets the value of the crcMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCrcMin() {
        return crcMin;
    }

    /**
     * Sets the value of the crcMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCrcMin(JAXBElement<Double> value) {
        this.crcMin = value;
    }

    /**
     * Gets the value of the crcMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getCrcMax() {
        return crcMax;
    }

    /**
     * Sets the value of the crcMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setCrcMax(JAXBElement<Double> value) {
        this.crcMax = value;
    }

    /**
     * Gets the value of the spErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpErr() {
        return spErr;
    }

    /**
     * Sets the value of the spErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpErr(JAXBElement<Double> value) {
        this.spErr = value;
    }

    /**
     * Gets the value of the spErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpErrMin() {
        return spErrMin;
    }

    /**
     * Sets the value of the spErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpErrMin(JAXBElement<Double> value) {
        this.spErrMin = value;
    }

    /**
     * Gets the value of the spErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getSpErrMax() {
        return spErrMax;
    }

    /**
     * Sets the value of the spErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setSpErrMax(JAXBElement<Double> value) {
        this.spErrMax = value;
    }

    /**
     * Gets the value of the lpErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLpErr() {
        return lpErr;
    }

    /**
     * Sets the value of the lpErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLpErr(JAXBElement<Double> value) {
        this.lpErr = value;
    }

    /**
     * Gets the value of the lpErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLpErrMin() {
        return lpErrMin;
    }

    /**
     * Sets the value of the lpErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLpErrMin(JAXBElement<Double> value) {
        this.lpErrMin = value;
    }

    /**
     * Gets the value of the lpErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLpErrMax() {
        return lpErrMax;
    }

    /**
     * Sets the value of the lpErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLpErrMax(JAXBElement<Double> value) {
        this.lpErrMax = value;
    }

    /**
     * Gets the value of the txDefers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxDefers() {
        return txDefers;
    }

    /**
     * Sets the value of the txDefers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxDefers(JAXBElement<Double> value) {
        this.txDefers = value;
    }

    /**
     * Gets the value of the txDefersMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxDefersMin() {
        return txDefersMin;
    }

    /**
     * Sets the value of the txDefersMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxDefersMin(JAXBElement<Double> value) {
        this.txDefersMin = value;
    }

    /**
     * Gets the value of the txDefersMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxDefersMax() {
        return txDefersMax;
    }

    /**
     * Sets the value of the txDefersMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxDefersMax(JAXBElement<Double> value) {
        this.txDefersMax = value;
    }

    /**
     * Gets the value of the txTOuts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxTOuts() {
        return txTOuts;
    }

    /**
     * Sets the value of the txTOuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxTOuts(JAXBElement<Double> value) {
        this.txTOuts = value;
    }

    /**
     * Gets the value of the txTOutsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxTOutsMin() {
        return txTOutsMin;
    }

    /**
     * Sets the value of the txTOutsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxTOutsMin(JAXBElement<Double> value) {
        this.txTOutsMin = value;
    }

    /**
     * Gets the value of the txTOutsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxTOutsMax() {
        return txTOutsMax;
    }

    /**
     * Sets the value of the txTOutsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxTOutsMax(JAXBElement<Double> value) {
        this.txTOutsMax = value;
    }

    /**
     * Gets the value of the txRetries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRetries() {
        return txRetries;
    }

    /**
     * Sets the value of the txRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRetries(JAXBElement<Double> value) {
        this.txRetries = value;
    }

    /**
     * Gets the value of the txRetriesMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRetriesMin() {
        return txRetriesMin;
    }

    /**
     * Sets the value of the txRetriesMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRetriesMin(JAXBElement<Double> value) {
        this.txRetriesMin = value;
    }

    /**
     * Gets the value of the txRetriesMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxRetriesMax() {
        return txRetriesMax;
    }

    /**
     * Sets the value of the txRetriesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxRetriesMax(JAXBElement<Double> value) {
        this.txRetriesMax = value;
    }

    /**
     * Gets the value of the txfails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxfails() {
        return txfails;
    }

    /**
     * Sets the value of the txfails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxfails(JAXBElement<Double> value) {
        this.txfails = value;
    }

    /**
     * Gets the value of the txfailsMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxfailsMin() {
        return txfailsMin;
    }

    /**
     * Sets the value of the txfailsMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxfailsMin(JAXBElement<Double> value) {
        this.txfailsMin = value;
    }

    /**
     * Gets the value of the txfailsMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxfailsMax() {
        return txfailsMax;
    }

    /**
     * Sets the value of the txfailsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxfailsMax(JAXBElement<Double> value) {
        this.txfailsMax = value;
    }

    /**
     * Gets the value of the temp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTemp(JAXBElement<Double> value) {
        this.temp = value;
    }

    /**
     * Gets the value of the tempMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTempMin() {
        return tempMin;
    }

    /**
     * Sets the value of the tempMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTempMin(JAXBElement<Double> value) {
        this.tempMin = value;
    }

    /**
     * Gets the value of the tempMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTempMax() {
        return tempMax;
    }

    /**
     * Sets the value of the tempMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTempMax(JAXBElement<Double> value) {
        this.tempMax = value;
    }

    /**
     * Gets the value of the linkUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLinkUp() {
        return linkUp;
    }

    /**
     * Sets the value of the linkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLinkUp(JAXBElement<Double> value) {
        this.linkUp = value;
    }

    /**
     * Gets the value of the linkUptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLinkUptime() {
        return linkUptime;
    }

    /**
     * Sets the value of the linkUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLinkUptime(JAXBElement<Integer> value) {
        this.linkUptime = value;
    }

    /**
     * Gets the value of the nodeUptime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNodeUptime() {
        return nodeUptime;
    }

    /**
     * Sets the value of the nodeUptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNodeUptime(JAXBElement<Integer> value) {
        this.nodeUptime = value;
    }

}
