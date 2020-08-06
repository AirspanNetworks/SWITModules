
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
 * <p>Java class for IBridge2EthernetStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2EthernetStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LocalMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoteMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxFrTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrTotalMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrTotalMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrOK" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrOKMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrOKMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxOctetsOK" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxOctetsOKMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxOctetsOKMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrOK" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrOKMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrOKMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotalMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotalMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsOK" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsOKMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsOKMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsTotalMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxOctetsTotalMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrSingleClsn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrSingleClsnMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrSingleClsnMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMultipleClsn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMultipleClsnMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMultipleClsnMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrLateClsn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrLateClsnMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrLateClsnMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrExcessiveClsn" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrExcessiveClsnMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrExcessiveClsnMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrUnicast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrUnicastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrUnicastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMulticast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMulticastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrMulticastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrBroadcast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrBroadcastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrBroadcastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrPause" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrPauseMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TxFrPauseMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrCrcErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrCrcErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrCrcErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrAlignErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrAlignErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrAlignErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotalErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotalErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTotalErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrLenErr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrLenErrMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrLenErrMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrDropBufFull" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrDropBufFullMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrDropBufFullMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTruncBufFull" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTruncBufFullMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrTruncBufFullMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrUnicast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrUnicastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrUnicastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrMulticast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrMulticastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrMulticastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrBroadcast" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrBroadcastMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrBroadcastMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrPause" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrPauseMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RxFrPauseMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2EthernetStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "localMacAddress",
    "remoteMacAddress",
    "txFrTotal",
    "txFrTotalMin",
    "txFrTotalMax",
    "txFrOK",
    "txFrOKMin",
    "txFrOKMax",
    "txOctetsOK",
    "txOctetsOKMin",
    "txOctetsOKMax",
    "rxFrOK",
    "rxFrOKMin",
    "rxFrOKMax",
    "rxFrTotal",
    "rxFrTotalMin",
    "rxFrTotalMax",
    "rxOctetsOK",
    "rxOctetsOKMin",
    "rxOctetsOKMax",
    "rxOctetsTotal",
    "rxOctetsTotalMin",
    "rxOctetsTotalMax",
    "txFrErr",
    "txFrErrMin",
    "txFrErrMax",
    "txFrSingleClsn",
    "txFrSingleClsnMin",
    "txFrSingleClsnMax",
    "txFrMultipleClsn",
    "txFrMultipleClsnMin",
    "txFrMultipleClsnMax",
    "txFrLateClsn",
    "txFrLateClsnMin",
    "txFrLateClsnMax",
    "txFrExcessiveClsn",
    "txFrExcessiveClsnMin",
    "txFrExcessiveClsnMax",
    "txFrUnicast",
    "txFrUnicastMin",
    "txFrUnicastMax",
    "txFrMulticast",
    "txFrMulticastMin",
    "txFrMulticastMax",
    "txFrBroadcast",
    "txFrBroadcastMin",
    "txFrBroadcastMax",
    "txFrPause",
    "txFrPauseMin",
    "txFrPauseMax",
    "rxFrCrcErr",
    "rxFrCrcErrMin",
    "rxFrCrcErrMax",
    "rxFrAlignErr",
    "rxFrAlignErrMin",
    "rxFrAlignErrMax",
    "rxFrTotalErr",
    "rxFrTotalErrMin",
    "rxFrTotalErrMax",
    "rxFrLenErr",
    "rxFrLenErrMin",
    "rxFrLenErrMax",
    "rxFrDropBufFull",
    "rxFrDropBufFullMin",
    "rxFrDropBufFullMax",
    "rxFrTruncBufFull",
    "rxFrTruncBufFullMin",
    "rxFrTruncBufFullMax",
    "rxFrUnicast",
    "rxFrUnicastMin",
    "rxFrUnicastMax",
    "rxFrMulticast",
    "rxFrMulticastMin",
    "rxFrMulticastMax",
    "rxFrBroadcast",
    "rxFrBroadcastMin",
    "rxFrBroadcastMax",
    "rxFrPause",
    "rxFrPauseMin",
    "rxFrPauseMax"
})
public class IBridge2EthernetStatsRowWs {

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
    @XmlElementRef(name = "TxFrTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrTotal;
    @XmlElementRef(name = "TxFrTotalMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrTotalMin;
    @XmlElementRef(name = "TxFrTotalMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrTotalMax;
    @XmlElementRef(name = "TxFrOK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrOK;
    @XmlElementRef(name = "TxFrOKMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrOKMin;
    @XmlElementRef(name = "TxFrOKMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrOKMax;
    @XmlElementRef(name = "TxOctetsOK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txOctetsOK;
    @XmlElementRef(name = "TxOctetsOKMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txOctetsOKMin;
    @XmlElementRef(name = "TxOctetsOKMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txOctetsOKMax;
    @XmlElementRef(name = "RxFrOK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrOK;
    @XmlElementRef(name = "RxFrOKMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrOKMin;
    @XmlElementRef(name = "RxFrOKMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrOKMax;
    @XmlElementRef(name = "RxFrTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotal;
    @XmlElementRef(name = "RxFrTotalMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotalMin;
    @XmlElementRef(name = "RxFrTotalMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotalMax;
    @XmlElementRef(name = "RxOctetsOK", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsOK;
    @XmlElementRef(name = "RxOctetsOKMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsOKMin;
    @XmlElementRef(name = "RxOctetsOKMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsOKMax;
    @XmlElementRef(name = "RxOctetsTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsTotal;
    @XmlElementRef(name = "RxOctetsTotalMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsTotalMin;
    @XmlElementRef(name = "RxOctetsTotalMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxOctetsTotalMax;
    @XmlElementRef(name = "TxFrErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrErr;
    @XmlElementRef(name = "TxFrErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrErrMin;
    @XmlElementRef(name = "TxFrErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrErrMax;
    @XmlElementRef(name = "TxFrSingleClsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrSingleClsn;
    @XmlElementRef(name = "TxFrSingleClsnMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrSingleClsnMin;
    @XmlElementRef(name = "TxFrSingleClsnMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrSingleClsnMax;
    @XmlElementRef(name = "TxFrMultipleClsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMultipleClsn;
    @XmlElementRef(name = "TxFrMultipleClsnMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMultipleClsnMin;
    @XmlElementRef(name = "TxFrMultipleClsnMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMultipleClsnMax;
    @XmlElementRef(name = "TxFrLateClsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrLateClsn;
    @XmlElementRef(name = "TxFrLateClsnMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrLateClsnMin;
    @XmlElementRef(name = "TxFrLateClsnMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrLateClsnMax;
    @XmlElementRef(name = "TxFrExcessiveClsn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrExcessiveClsn;
    @XmlElementRef(name = "TxFrExcessiveClsnMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrExcessiveClsnMin;
    @XmlElementRef(name = "TxFrExcessiveClsnMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrExcessiveClsnMax;
    @XmlElementRef(name = "TxFrUnicast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrUnicast;
    @XmlElementRef(name = "TxFrUnicastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrUnicastMin;
    @XmlElementRef(name = "TxFrUnicastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrUnicastMax;
    @XmlElementRef(name = "TxFrMulticast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMulticast;
    @XmlElementRef(name = "TxFrMulticastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMulticastMin;
    @XmlElementRef(name = "TxFrMulticastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrMulticastMax;
    @XmlElementRef(name = "TxFrBroadcast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrBroadcast;
    @XmlElementRef(name = "TxFrBroadcastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrBroadcastMin;
    @XmlElementRef(name = "TxFrBroadcastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrBroadcastMax;
    @XmlElementRef(name = "TxFrPause", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrPause;
    @XmlElementRef(name = "TxFrPauseMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrPauseMin;
    @XmlElementRef(name = "TxFrPauseMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> txFrPauseMax;
    @XmlElementRef(name = "RxFrCrcErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrCrcErr;
    @XmlElementRef(name = "RxFrCrcErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrCrcErrMin;
    @XmlElementRef(name = "RxFrCrcErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrCrcErrMax;
    @XmlElementRef(name = "RxFrAlignErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrAlignErr;
    @XmlElementRef(name = "RxFrAlignErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrAlignErrMin;
    @XmlElementRef(name = "RxFrAlignErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrAlignErrMax;
    @XmlElementRef(name = "RxFrTotalErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotalErr;
    @XmlElementRef(name = "RxFrTotalErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotalErrMin;
    @XmlElementRef(name = "RxFrTotalErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTotalErrMax;
    @XmlElementRef(name = "RxFrLenErr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrLenErr;
    @XmlElementRef(name = "RxFrLenErrMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrLenErrMin;
    @XmlElementRef(name = "RxFrLenErrMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrLenErrMax;
    @XmlElementRef(name = "RxFrDropBufFull", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrDropBufFull;
    @XmlElementRef(name = "RxFrDropBufFullMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrDropBufFullMin;
    @XmlElementRef(name = "RxFrDropBufFullMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrDropBufFullMax;
    @XmlElementRef(name = "RxFrTruncBufFull", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTruncBufFull;
    @XmlElementRef(name = "RxFrTruncBufFullMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTruncBufFullMin;
    @XmlElementRef(name = "RxFrTruncBufFullMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrTruncBufFullMax;
    @XmlElementRef(name = "RxFrUnicast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrUnicast;
    @XmlElementRef(name = "RxFrUnicastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrUnicastMin;
    @XmlElementRef(name = "RxFrUnicastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrUnicastMax;
    @XmlElementRef(name = "RxFrMulticast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrMulticast;
    @XmlElementRef(name = "RxFrMulticastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrMulticastMin;
    @XmlElementRef(name = "RxFrMulticastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrMulticastMax;
    @XmlElementRef(name = "RxFrBroadcast", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrBroadcast;
    @XmlElementRef(name = "RxFrBroadcastMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrBroadcastMin;
    @XmlElementRef(name = "RxFrBroadcastMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrBroadcastMax;
    @XmlElementRef(name = "RxFrPause", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrPause;
    @XmlElementRef(name = "RxFrPauseMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrPauseMin;
    @XmlElementRef(name = "RxFrPauseMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> rxFrPauseMax;

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
     * Gets the value of the txFrTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrTotal() {
        return txFrTotal;
    }

    /**
     * Sets the value of the txFrTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrTotal(JAXBElement<Double> value) {
        this.txFrTotal = value;
    }

    /**
     * Gets the value of the txFrTotalMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrTotalMin() {
        return txFrTotalMin;
    }

    /**
     * Sets the value of the txFrTotalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrTotalMin(JAXBElement<Double> value) {
        this.txFrTotalMin = value;
    }

    /**
     * Gets the value of the txFrTotalMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrTotalMax() {
        return txFrTotalMax;
    }

    /**
     * Sets the value of the txFrTotalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrTotalMax(JAXBElement<Double> value) {
        this.txFrTotalMax = value;
    }

    /**
     * Gets the value of the txFrOK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrOK() {
        return txFrOK;
    }

    /**
     * Sets the value of the txFrOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrOK(JAXBElement<Double> value) {
        this.txFrOK = value;
    }

    /**
     * Gets the value of the txFrOKMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrOKMin() {
        return txFrOKMin;
    }

    /**
     * Sets the value of the txFrOKMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrOKMin(JAXBElement<Double> value) {
        this.txFrOKMin = value;
    }

    /**
     * Gets the value of the txFrOKMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrOKMax() {
        return txFrOKMax;
    }

    /**
     * Sets the value of the txFrOKMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrOKMax(JAXBElement<Double> value) {
        this.txFrOKMax = value;
    }

    /**
     * Gets the value of the txOctetsOK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxOctetsOK() {
        return txOctetsOK;
    }

    /**
     * Sets the value of the txOctetsOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxOctetsOK(JAXBElement<Double> value) {
        this.txOctetsOK = value;
    }

    /**
     * Gets the value of the txOctetsOKMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxOctetsOKMin() {
        return txOctetsOKMin;
    }

    /**
     * Sets the value of the txOctetsOKMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxOctetsOKMin(JAXBElement<Double> value) {
        this.txOctetsOKMin = value;
    }

    /**
     * Gets the value of the txOctetsOKMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxOctetsOKMax() {
        return txOctetsOKMax;
    }

    /**
     * Sets the value of the txOctetsOKMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxOctetsOKMax(JAXBElement<Double> value) {
        this.txOctetsOKMax = value;
    }

    /**
     * Gets the value of the rxFrOK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrOK() {
        return rxFrOK;
    }

    /**
     * Sets the value of the rxFrOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrOK(JAXBElement<Double> value) {
        this.rxFrOK = value;
    }

    /**
     * Gets the value of the rxFrOKMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrOKMin() {
        return rxFrOKMin;
    }

    /**
     * Sets the value of the rxFrOKMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrOKMin(JAXBElement<Double> value) {
        this.rxFrOKMin = value;
    }

    /**
     * Gets the value of the rxFrOKMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrOKMax() {
        return rxFrOKMax;
    }

    /**
     * Sets the value of the rxFrOKMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrOKMax(JAXBElement<Double> value) {
        this.rxFrOKMax = value;
    }

    /**
     * Gets the value of the rxFrTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotal() {
        return rxFrTotal;
    }

    /**
     * Sets the value of the rxFrTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotal(JAXBElement<Double> value) {
        this.rxFrTotal = value;
    }

    /**
     * Gets the value of the rxFrTotalMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotalMin() {
        return rxFrTotalMin;
    }

    /**
     * Sets the value of the rxFrTotalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotalMin(JAXBElement<Double> value) {
        this.rxFrTotalMin = value;
    }

    /**
     * Gets the value of the rxFrTotalMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotalMax() {
        return rxFrTotalMax;
    }

    /**
     * Sets the value of the rxFrTotalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotalMax(JAXBElement<Double> value) {
        this.rxFrTotalMax = value;
    }

    /**
     * Gets the value of the rxOctetsOK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsOK() {
        return rxOctetsOK;
    }

    /**
     * Sets the value of the rxOctetsOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsOK(JAXBElement<Double> value) {
        this.rxOctetsOK = value;
    }

    /**
     * Gets the value of the rxOctetsOKMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsOKMin() {
        return rxOctetsOKMin;
    }

    /**
     * Sets the value of the rxOctetsOKMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsOKMin(JAXBElement<Double> value) {
        this.rxOctetsOKMin = value;
    }

    /**
     * Gets the value of the rxOctetsOKMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsOKMax() {
        return rxOctetsOKMax;
    }

    /**
     * Sets the value of the rxOctetsOKMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsOKMax(JAXBElement<Double> value) {
        this.rxOctetsOKMax = value;
    }

    /**
     * Gets the value of the rxOctetsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsTotal() {
        return rxOctetsTotal;
    }

    /**
     * Sets the value of the rxOctetsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsTotal(JAXBElement<Double> value) {
        this.rxOctetsTotal = value;
    }

    /**
     * Gets the value of the rxOctetsTotalMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsTotalMin() {
        return rxOctetsTotalMin;
    }

    /**
     * Sets the value of the rxOctetsTotalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsTotalMin(JAXBElement<Double> value) {
        this.rxOctetsTotalMin = value;
    }

    /**
     * Gets the value of the rxOctetsTotalMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxOctetsTotalMax() {
        return rxOctetsTotalMax;
    }

    /**
     * Sets the value of the rxOctetsTotalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxOctetsTotalMax(JAXBElement<Double> value) {
        this.rxOctetsTotalMax = value;
    }

    /**
     * Gets the value of the txFrErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrErr() {
        return txFrErr;
    }

    /**
     * Sets the value of the txFrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrErr(JAXBElement<Double> value) {
        this.txFrErr = value;
    }

    /**
     * Gets the value of the txFrErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrErrMin() {
        return txFrErrMin;
    }

    /**
     * Sets the value of the txFrErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrErrMin(JAXBElement<Double> value) {
        this.txFrErrMin = value;
    }

    /**
     * Gets the value of the txFrErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrErrMax() {
        return txFrErrMax;
    }

    /**
     * Sets the value of the txFrErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrErrMax(JAXBElement<Double> value) {
        this.txFrErrMax = value;
    }

    /**
     * Gets the value of the txFrSingleClsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrSingleClsn() {
        return txFrSingleClsn;
    }

    /**
     * Sets the value of the txFrSingleClsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrSingleClsn(JAXBElement<Double> value) {
        this.txFrSingleClsn = value;
    }

    /**
     * Gets the value of the txFrSingleClsnMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrSingleClsnMin() {
        return txFrSingleClsnMin;
    }

    /**
     * Sets the value of the txFrSingleClsnMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrSingleClsnMin(JAXBElement<Double> value) {
        this.txFrSingleClsnMin = value;
    }

    /**
     * Gets the value of the txFrSingleClsnMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrSingleClsnMax() {
        return txFrSingleClsnMax;
    }

    /**
     * Sets the value of the txFrSingleClsnMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrSingleClsnMax(JAXBElement<Double> value) {
        this.txFrSingleClsnMax = value;
    }

    /**
     * Gets the value of the txFrMultipleClsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMultipleClsn() {
        return txFrMultipleClsn;
    }

    /**
     * Sets the value of the txFrMultipleClsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMultipleClsn(JAXBElement<Double> value) {
        this.txFrMultipleClsn = value;
    }

    /**
     * Gets the value of the txFrMultipleClsnMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMultipleClsnMin() {
        return txFrMultipleClsnMin;
    }

    /**
     * Sets the value of the txFrMultipleClsnMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMultipleClsnMin(JAXBElement<Double> value) {
        this.txFrMultipleClsnMin = value;
    }

    /**
     * Gets the value of the txFrMultipleClsnMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMultipleClsnMax() {
        return txFrMultipleClsnMax;
    }

    /**
     * Sets the value of the txFrMultipleClsnMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMultipleClsnMax(JAXBElement<Double> value) {
        this.txFrMultipleClsnMax = value;
    }

    /**
     * Gets the value of the txFrLateClsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrLateClsn() {
        return txFrLateClsn;
    }

    /**
     * Sets the value of the txFrLateClsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrLateClsn(JAXBElement<Double> value) {
        this.txFrLateClsn = value;
    }

    /**
     * Gets the value of the txFrLateClsnMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrLateClsnMin() {
        return txFrLateClsnMin;
    }

    /**
     * Sets the value of the txFrLateClsnMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrLateClsnMin(JAXBElement<Double> value) {
        this.txFrLateClsnMin = value;
    }

    /**
     * Gets the value of the txFrLateClsnMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrLateClsnMax() {
        return txFrLateClsnMax;
    }

    /**
     * Sets the value of the txFrLateClsnMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrLateClsnMax(JAXBElement<Double> value) {
        this.txFrLateClsnMax = value;
    }

    /**
     * Gets the value of the txFrExcessiveClsn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrExcessiveClsn() {
        return txFrExcessiveClsn;
    }

    /**
     * Sets the value of the txFrExcessiveClsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrExcessiveClsn(JAXBElement<Double> value) {
        this.txFrExcessiveClsn = value;
    }

    /**
     * Gets the value of the txFrExcessiveClsnMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrExcessiveClsnMin() {
        return txFrExcessiveClsnMin;
    }

    /**
     * Sets the value of the txFrExcessiveClsnMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrExcessiveClsnMin(JAXBElement<Double> value) {
        this.txFrExcessiveClsnMin = value;
    }

    /**
     * Gets the value of the txFrExcessiveClsnMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrExcessiveClsnMax() {
        return txFrExcessiveClsnMax;
    }

    /**
     * Sets the value of the txFrExcessiveClsnMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrExcessiveClsnMax(JAXBElement<Double> value) {
        this.txFrExcessiveClsnMax = value;
    }

    /**
     * Gets the value of the txFrUnicast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrUnicast() {
        return txFrUnicast;
    }

    /**
     * Sets the value of the txFrUnicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrUnicast(JAXBElement<Double> value) {
        this.txFrUnicast = value;
    }

    /**
     * Gets the value of the txFrUnicastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrUnicastMin() {
        return txFrUnicastMin;
    }

    /**
     * Sets the value of the txFrUnicastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrUnicastMin(JAXBElement<Double> value) {
        this.txFrUnicastMin = value;
    }

    /**
     * Gets the value of the txFrUnicastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrUnicastMax() {
        return txFrUnicastMax;
    }

    /**
     * Sets the value of the txFrUnicastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrUnicastMax(JAXBElement<Double> value) {
        this.txFrUnicastMax = value;
    }

    /**
     * Gets the value of the txFrMulticast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMulticast() {
        return txFrMulticast;
    }

    /**
     * Sets the value of the txFrMulticast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMulticast(JAXBElement<Double> value) {
        this.txFrMulticast = value;
    }

    /**
     * Gets the value of the txFrMulticastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMulticastMin() {
        return txFrMulticastMin;
    }

    /**
     * Sets the value of the txFrMulticastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMulticastMin(JAXBElement<Double> value) {
        this.txFrMulticastMin = value;
    }

    /**
     * Gets the value of the txFrMulticastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrMulticastMax() {
        return txFrMulticastMax;
    }

    /**
     * Sets the value of the txFrMulticastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrMulticastMax(JAXBElement<Double> value) {
        this.txFrMulticastMax = value;
    }

    /**
     * Gets the value of the txFrBroadcast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrBroadcast() {
        return txFrBroadcast;
    }

    /**
     * Sets the value of the txFrBroadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrBroadcast(JAXBElement<Double> value) {
        this.txFrBroadcast = value;
    }

    /**
     * Gets the value of the txFrBroadcastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrBroadcastMin() {
        return txFrBroadcastMin;
    }

    /**
     * Sets the value of the txFrBroadcastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrBroadcastMin(JAXBElement<Double> value) {
        this.txFrBroadcastMin = value;
    }

    /**
     * Gets the value of the txFrBroadcastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrBroadcastMax() {
        return txFrBroadcastMax;
    }

    /**
     * Sets the value of the txFrBroadcastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrBroadcastMax(JAXBElement<Double> value) {
        this.txFrBroadcastMax = value;
    }

    /**
     * Gets the value of the txFrPause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrPause() {
        return txFrPause;
    }

    /**
     * Sets the value of the txFrPause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrPause(JAXBElement<Double> value) {
        this.txFrPause = value;
    }

    /**
     * Gets the value of the txFrPauseMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrPauseMin() {
        return txFrPauseMin;
    }

    /**
     * Sets the value of the txFrPauseMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrPauseMin(JAXBElement<Double> value) {
        this.txFrPauseMin = value;
    }

    /**
     * Gets the value of the txFrPauseMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTxFrPauseMax() {
        return txFrPauseMax;
    }

    /**
     * Sets the value of the txFrPauseMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTxFrPauseMax(JAXBElement<Double> value) {
        this.txFrPauseMax = value;
    }

    /**
     * Gets the value of the rxFrCrcErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrCrcErr() {
        return rxFrCrcErr;
    }

    /**
     * Sets the value of the rxFrCrcErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrCrcErr(JAXBElement<Double> value) {
        this.rxFrCrcErr = value;
    }

    /**
     * Gets the value of the rxFrCrcErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrCrcErrMin() {
        return rxFrCrcErrMin;
    }

    /**
     * Sets the value of the rxFrCrcErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrCrcErrMin(JAXBElement<Double> value) {
        this.rxFrCrcErrMin = value;
    }

    /**
     * Gets the value of the rxFrCrcErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrCrcErrMax() {
        return rxFrCrcErrMax;
    }

    /**
     * Sets the value of the rxFrCrcErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrCrcErrMax(JAXBElement<Double> value) {
        this.rxFrCrcErrMax = value;
    }

    /**
     * Gets the value of the rxFrAlignErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrAlignErr() {
        return rxFrAlignErr;
    }

    /**
     * Sets the value of the rxFrAlignErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrAlignErr(JAXBElement<Double> value) {
        this.rxFrAlignErr = value;
    }

    /**
     * Gets the value of the rxFrAlignErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrAlignErrMin() {
        return rxFrAlignErrMin;
    }

    /**
     * Sets the value of the rxFrAlignErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrAlignErrMin(JAXBElement<Double> value) {
        this.rxFrAlignErrMin = value;
    }

    /**
     * Gets the value of the rxFrAlignErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrAlignErrMax() {
        return rxFrAlignErrMax;
    }

    /**
     * Sets the value of the rxFrAlignErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrAlignErrMax(JAXBElement<Double> value) {
        this.rxFrAlignErrMax = value;
    }

    /**
     * Gets the value of the rxFrTotalErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotalErr() {
        return rxFrTotalErr;
    }

    /**
     * Sets the value of the rxFrTotalErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotalErr(JAXBElement<Double> value) {
        this.rxFrTotalErr = value;
    }

    /**
     * Gets the value of the rxFrTotalErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotalErrMin() {
        return rxFrTotalErrMin;
    }

    /**
     * Sets the value of the rxFrTotalErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotalErrMin(JAXBElement<Double> value) {
        this.rxFrTotalErrMin = value;
    }

    /**
     * Gets the value of the rxFrTotalErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTotalErrMax() {
        return rxFrTotalErrMax;
    }

    /**
     * Sets the value of the rxFrTotalErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTotalErrMax(JAXBElement<Double> value) {
        this.rxFrTotalErrMax = value;
    }

    /**
     * Gets the value of the rxFrLenErr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrLenErr() {
        return rxFrLenErr;
    }

    /**
     * Sets the value of the rxFrLenErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrLenErr(JAXBElement<Double> value) {
        this.rxFrLenErr = value;
    }

    /**
     * Gets the value of the rxFrLenErrMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrLenErrMin() {
        return rxFrLenErrMin;
    }

    /**
     * Sets the value of the rxFrLenErrMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrLenErrMin(JAXBElement<Double> value) {
        this.rxFrLenErrMin = value;
    }

    /**
     * Gets the value of the rxFrLenErrMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrLenErrMax() {
        return rxFrLenErrMax;
    }

    /**
     * Sets the value of the rxFrLenErrMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrLenErrMax(JAXBElement<Double> value) {
        this.rxFrLenErrMax = value;
    }

    /**
     * Gets the value of the rxFrDropBufFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrDropBufFull() {
        return rxFrDropBufFull;
    }

    /**
     * Sets the value of the rxFrDropBufFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrDropBufFull(JAXBElement<Double> value) {
        this.rxFrDropBufFull = value;
    }

    /**
     * Gets the value of the rxFrDropBufFullMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrDropBufFullMin() {
        return rxFrDropBufFullMin;
    }

    /**
     * Sets the value of the rxFrDropBufFullMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrDropBufFullMin(JAXBElement<Double> value) {
        this.rxFrDropBufFullMin = value;
    }

    /**
     * Gets the value of the rxFrDropBufFullMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrDropBufFullMax() {
        return rxFrDropBufFullMax;
    }

    /**
     * Sets the value of the rxFrDropBufFullMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrDropBufFullMax(JAXBElement<Double> value) {
        this.rxFrDropBufFullMax = value;
    }

    /**
     * Gets the value of the rxFrTruncBufFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTruncBufFull() {
        return rxFrTruncBufFull;
    }

    /**
     * Sets the value of the rxFrTruncBufFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTruncBufFull(JAXBElement<Double> value) {
        this.rxFrTruncBufFull = value;
    }

    /**
     * Gets the value of the rxFrTruncBufFullMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTruncBufFullMin() {
        return rxFrTruncBufFullMin;
    }

    /**
     * Sets the value of the rxFrTruncBufFullMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTruncBufFullMin(JAXBElement<Double> value) {
        this.rxFrTruncBufFullMin = value;
    }

    /**
     * Gets the value of the rxFrTruncBufFullMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrTruncBufFullMax() {
        return rxFrTruncBufFullMax;
    }

    /**
     * Sets the value of the rxFrTruncBufFullMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrTruncBufFullMax(JAXBElement<Double> value) {
        this.rxFrTruncBufFullMax = value;
    }

    /**
     * Gets the value of the rxFrUnicast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrUnicast() {
        return rxFrUnicast;
    }

    /**
     * Sets the value of the rxFrUnicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrUnicast(JAXBElement<Double> value) {
        this.rxFrUnicast = value;
    }

    /**
     * Gets the value of the rxFrUnicastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrUnicastMin() {
        return rxFrUnicastMin;
    }

    /**
     * Sets the value of the rxFrUnicastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrUnicastMin(JAXBElement<Double> value) {
        this.rxFrUnicastMin = value;
    }

    /**
     * Gets the value of the rxFrUnicastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrUnicastMax() {
        return rxFrUnicastMax;
    }

    /**
     * Sets the value of the rxFrUnicastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrUnicastMax(JAXBElement<Double> value) {
        this.rxFrUnicastMax = value;
    }

    /**
     * Gets the value of the rxFrMulticast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrMulticast() {
        return rxFrMulticast;
    }

    /**
     * Sets the value of the rxFrMulticast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrMulticast(JAXBElement<Double> value) {
        this.rxFrMulticast = value;
    }

    /**
     * Gets the value of the rxFrMulticastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrMulticastMin() {
        return rxFrMulticastMin;
    }

    /**
     * Sets the value of the rxFrMulticastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrMulticastMin(JAXBElement<Double> value) {
        this.rxFrMulticastMin = value;
    }

    /**
     * Gets the value of the rxFrMulticastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrMulticastMax() {
        return rxFrMulticastMax;
    }

    /**
     * Sets the value of the rxFrMulticastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrMulticastMax(JAXBElement<Double> value) {
        this.rxFrMulticastMax = value;
    }

    /**
     * Gets the value of the rxFrBroadcast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrBroadcast() {
        return rxFrBroadcast;
    }

    /**
     * Sets the value of the rxFrBroadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrBroadcast(JAXBElement<Double> value) {
        this.rxFrBroadcast = value;
    }

    /**
     * Gets the value of the rxFrBroadcastMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrBroadcastMin() {
        return rxFrBroadcastMin;
    }

    /**
     * Sets the value of the rxFrBroadcastMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrBroadcastMin(JAXBElement<Double> value) {
        this.rxFrBroadcastMin = value;
    }

    /**
     * Gets the value of the rxFrBroadcastMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrBroadcastMax() {
        return rxFrBroadcastMax;
    }

    /**
     * Sets the value of the rxFrBroadcastMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrBroadcastMax(JAXBElement<Double> value) {
        this.rxFrBroadcastMax = value;
    }

    /**
     * Gets the value of the rxFrPause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrPause() {
        return rxFrPause;
    }

    /**
     * Sets the value of the rxFrPause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrPause(JAXBElement<Double> value) {
        this.rxFrPause = value;
    }

    /**
     * Gets the value of the rxFrPauseMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrPauseMin() {
        return rxFrPauseMin;
    }

    /**
     * Sets the value of the rxFrPauseMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrPauseMin(JAXBElement<Double> value) {
        this.rxFrPauseMin = value;
    }

    /**
     * Gets the value of the rxFrPauseMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getRxFrPauseMax() {
        return rxFrPauseMax;
    }

    /**
     * Sets the value of the rxFrPauseMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setRxFrPauseMax(JAXBElement<Double> value) {
        this.rxFrPauseMax = value;
    }

}
