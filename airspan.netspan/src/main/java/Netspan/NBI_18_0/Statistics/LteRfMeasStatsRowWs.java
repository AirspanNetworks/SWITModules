
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
 * <p>Java class for LteRfMeasStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRfMeasStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant1RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant1RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant1RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant2RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant2RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant2RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant3RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant3RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant3RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant4RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant4RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ant4RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocDlNum1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocDlNum2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw0WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaPcellCw1WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw0WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaScellCw1WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaAvgUesWithActiveSCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaAvgCaCapableUes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaAvgUesWithCfgSCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RfCarrierTxPowerMax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RfCarrierTxPowerMean" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi1DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi2DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi3DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi4DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi5DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi6DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi7DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi8DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi9DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi10DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi11DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi12DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi13DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi14DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw0WbCqi15DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi1DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi2DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi3DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi4DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi5DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi6DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi7DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi8DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi9DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi10DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi11DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi12DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi13DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi14DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cw1WbCqi15DistHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRfMeasStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "cw0WbCqi1Dist",
    "cw0WbCqi2Dist",
    "cw0WbCqi3Dist",
    "cw0WbCqi4Dist",
    "cw0WbCqi5Dist",
    "cw0WbCqi6Dist",
    "cw0WbCqi7Dist",
    "cw0WbCqi8Dist",
    "cw0WbCqi9Dist",
    "cw0WbCqi10Dist",
    "cw0WbCqi11Dist",
    "cw0WbCqi12Dist",
    "cw0WbCqi13Dist",
    "cw0WbCqi14Dist",
    "cw0WbCqi15Dist",
    "cw1WbCqi1Dist",
    "cw1WbCqi2Dist",
    "cw1WbCqi3Dist",
    "cw1WbCqi4Dist",
    "cw1WbCqi5Dist",
    "cw1WbCqi6Dist",
    "cw1WbCqi7Dist",
    "cw1WbCqi8Dist",
    "cw1WbCqi9Dist",
    "cw1WbCqi10Dist",
    "cw1WbCqi11Dist",
    "cw1WbCqi12Dist",
    "cw1WbCqi13Dist",
    "cw1WbCqi14Dist",
    "cw1WbCqi15Dist",
    "ant1RssiMin",
    "ant1RssiAvg",
    "ant1RssiMax",
    "ant2RssiMin",
    "ant2RssiAvg",
    "ant2RssiMax",
    "ant3RssiMin",
    "ant3RssiAvg",
    "ant3RssiMax",
    "ant4RssiMin",
    "ant4RssiAvg",
    "ant4RssiMax",
    "niMin",
    "niAvg",
    "niMax",
    "cwAllocDlNum1",
    "cwAllocDlNum2",
    "caPcellCw0WbCqi1Dist",
    "caPcellCw0WbCqi2Dist",
    "caPcellCw0WbCqi3Dist",
    "caPcellCw0WbCqi4Dist",
    "caPcellCw0WbCqi5Dist",
    "caPcellCw0WbCqi6Dist",
    "caPcellCw0WbCqi7Dist",
    "caPcellCw0WbCqi8Dist",
    "caPcellCw0WbCqi9Dist",
    "caPcellCw0WbCqi10Dist",
    "caPcellCw0WbCqi11Dist",
    "caPcellCw0WbCqi12Dist",
    "caPcellCw0WbCqi13Dist",
    "caPcellCw0WbCqi14Dist",
    "caPcellCw0WbCqi15Dist",
    "caPcellCw1WbCqi1Dist",
    "caPcellCw1WbCqi2Dist",
    "caPcellCw1WbCqi3Dist",
    "caPcellCw1WbCqi4Dist",
    "caPcellCw1WbCqi5Dist",
    "caPcellCw1WbCqi6Dist",
    "caPcellCw1WbCqi7Dist",
    "caPcellCw1WbCqi8Dist",
    "caPcellCw1WbCqi9Dist",
    "caPcellCw1WbCqi10Dist",
    "caPcellCw1WbCqi11Dist",
    "caPcellCw1WbCqi12Dist",
    "caPcellCw1WbCqi13Dist",
    "caPcellCw1WbCqi14Dist",
    "caPcellCw1WbCqi15Dist",
    "caScellCw0WbCqi1Dist",
    "caScellCw0WbCqi2Dist",
    "caScellCw0WbCqi3Dist",
    "caScellCw0WbCqi4Dist",
    "caScellCw0WbCqi5Dist",
    "caScellCw0WbCqi6Dist",
    "caScellCw0WbCqi7Dist",
    "caScellCw0WbCqi8Dist",
    "caScellCw0WbCqi9Dist",
    "caScellCw0WbCqi10Dist",
    "caScellCw0WbCqi11Dist",
    "caScellCw0WbCqi12Dist",
    "caScellCw0WbCqi13Dist",
    "caScellCw0WbCqi14Dist",
    "caScellCw0WbCqi15Dist",
    "caScellCw1WbCqi1Dist",
    "caScellCw1WbCqi2Dist",
    "caScellCw1WbCqi3Dist",
    "caScellCw1WbCqi4Dist",
    "caScellCw1WbCqi5Dist",
    "caScellCw1WbCqi6Dist",
    "caScellCw1WbCqi7Dist",
    "caScellCw1WbCqi8Dist",
    "caScellCw1WbCqi9Dist",
    "caScellCw1WbCqi10Dist",
    "caScellCw1WbCqi11Dist",
    "caScellCw1WbCqi12Dist",
    "caScellCw1WbCqi13Dist",
    "caScellCw1WbCqi14Dist",
    "caScellCw1WbCqi15Dist",
    "caAvgUesWithActiveSCell",
    "caAvgCaCapableUes",
    "caAvgUesWithCfgSCell",
    "rfCarrierTxPowerMax",
    "rfCarrierTxPowerMean",
    "cw0WbCqi1DistHpue",
    "cw0WbCqi2DistHpue",
    "cw0WbCqi3DistHpue",
    "cw0WbCqi4DistHpue",
    "cw0WbCqi5DistHpue",
    "cw0WbCqi6DistHpue",
    "cw0WbCqi7DistHpue",
    "cw0WbCqi8DistHpue",
    "cw0WbCqi9DistHpue",
    "cw0WbCqi10DistHpue",
    "cw0WbCqi11DistHpue",
    "cw0WbCqi12DistHpue",
    "cw0WbCqi13DistHpue",
    "cw0WbCqi14DistHpue",
    "cw0WbCqi15DistHpue",
    "cw1WbCqi1DistHpue",
    "cw1WbCqi2DistHpue",
    "cw1WbCqi3DistHpue",
    "cw1WbCqi4DistHpue",
    "cw1WbCqi5DistHpue",
    "cw1WbCqi6DistHpue",
    "cw1WbCqi7DistHpue",
    "cw1WbCqi8DistHpue",
    "cw1WbCqi9DistHpue",
    "cw1WbCqi10DistHpue",
    "cw1WbCqi11DistHpue",
    "cw1WbCqi12DistHpue",
    "cw1WbCqi13DistHpue",
    "cw1WbCqi14DistHpue",
    "cw1WbCqi15DistHpue"
})
public class LteRfMeasStatsRowWs {

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
    @XmlElementRef(name = "Cw0WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi1Dist;
    @XmlElementRef(name = "Cw0WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi2Dist;
    @XmlElementRef(name = "Cw0WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi3Dist;
    @XmlElementRef(name = "Cw0WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi4Dist;
    @XmlElementRef(name = "Cw0WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi5Dist;
    @XmlElementRef(name = "Cw0WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi6Dist;
    @XmlElementRef(name = "Cw0WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi7Dist;
    @XmlElementRef(name = "Cw0WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi8Dist;
    @XmlElementRef(name = "Cw0WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi9Dist;
    @XmlElementRef(name = "Cw0WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi10Dist;
    @XmlElementRef(name = "Cw0WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi11Dist;
    @XmlElementRef(name = "Cw0WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi12Dist;
    @XmlElementRef(name = "Cw0WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi13Dist;
    @XmlElementRef(name = "Cw0WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi14Dist;
    @XmlElementRef(name = "Cw0WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi15Dist;
    @XmlElementRef(name = "Cw1WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi1Dist;
    @XmlElementRef(name = "Cw1WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi2Dist;
    @XmlElementRef(name = "Cw1WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi3Dist;
    @XmlElementRef(name = "Cw1WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi4Dist;
    @XmlElementRef(name = "Cw1WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi5Dist;
    @XmlElementRef(name = "Cw1WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi6Dist;
    @XmlElementRef(name = "Cw1WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi7Dist;
    @XmlElementRef(name = "Cw1WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi8Dist;
    @XmlElementRef(name = "Cw1WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi9Dist;
    @XmlElementRef(name = "Cw1WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi10Dist;
    @XmlElementRef(name = "Cw1WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi11Dist;
    @XmlElementRef(name = "Cw1WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi12Dist;
    @XmlElementRef(name = "Cw1WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi13Dist;
    @XmlElementRef(name = "Cw1WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi14Dist;
    @XmlElementRef(name = "Cw1WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi15Dist;
    @XmlElementRef(name = "Ant1RssiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant1RssiMin;
    @XmlElementRef(name = "Ant1RssiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant1RssiAvg;
    @XmlElementRef(name = "Ant1RssiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant1RssiMax;
    @XmlElementRef(name = "Ant2RssiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant2RssiMin;
    @XmlElementRef(name = "Ant2RssiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant2RssiAvg;
    @XmlElementRef(name = "Ant2RssiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant2RssiMax;
    @XmlElementRef(name = "Ant3RssiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant3RssiMin;
    @XmlElementRef(name = "Ant3RssiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant3RssiAvg;
    @XmlElementRef(name = "Ant3RssiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant3RssiMax;
    @XmlElementRef(name = "Ant4RssiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant4RssiMin;
    @XmlElementRef(name = "Ant4RssiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant4RssiAvg;
    @XmlElementRef(name = "Ant4RssiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ant4RssiMax;
    @XmlElementRef(name = "NiMin", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> niMin;
    @XmlElementRef(name = "NiAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> niAvg;
    @XmlElementRef(name = "NiMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> niMax;
    @XmlElementRef(name = "CwAllocDlNum1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocDlNum1;
    @XmlElementRef(name = "CwAllocDlNum2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocDlNum2;
    @XmlElementRef(name = "CaPcellCw0WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi1Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi2Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi3Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi4Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi5Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi6Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi7Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi8Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi9Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi10Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi11Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi12Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi13Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi14Dist;
    @XmlElementRef(name = "CaPcellCw0WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw0WbCqi15Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi1Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi2Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi3Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi4Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi5Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi6Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi7Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi8Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi9Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi10Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi11Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi12Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi13Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi14Dist;
    @XmlElementRef(name = "CaPcellCw1WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caPcellCw1WbCqi15Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi1Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi2Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi3Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi4Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi5Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi6Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi7Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi8Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi9Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi10Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi11Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi12Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi13Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi14Dist;
    @XmlElementRef(name = "CaScellCw0WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw0WbCqi15Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi1Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi1Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi2Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi2Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi3Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi3Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi4Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi4Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi5Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi5Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi6Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi6Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi7Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi7Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi8Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi8Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi9Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi9Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi10Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi10Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi11Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi11Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi12Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi12Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi13Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi13Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi14Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi14Dist;
    @XmlElementRef(name = "CaScellCw1WbCqi15Dist", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caScellCw1WbCqi15Dist;
    @XmlElementRef(name = "CaAvgUesWithActiveSCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caAvgUesWithActiveSCell;
    @XmlElementRef(name = "CaAvgCaCapableUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caAvgCaCapableUes;
    @XmlElementRef(name = "CaAvgUesWithCfgSCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> caAvgUesWithCfgSCell;
    @XmlElementRef(name = "RfCarrierTxPowerMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rfCarrierTxPowerMax;
    @XmlElementRef(name = "RfCarrierTxPowerMean", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rfCarrierTxPowerMean;
    @XmlElementRef(name = "Cw0WbCqi1DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi1DistHpue;
    @XmlElementRef(name = "Cw0WbCqi2DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi2DistHpue;
    @XmlElementRef(name = "Cw0WbCqi3DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi3DistHpue;
    @XmlElementRef(name = "Cw0WbCqi4DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi4DistHpue;
    @XmlElementRef(name = "Cw0WbCqi5DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi5DistHpue;
    @XmlElementRef(name = "Cw0WbCqi6DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi6DistHpue;
    @XmlElementRef(name = "Cw0WbCqi7DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi7DistHpue;
    @XmlElementRef(name = "Cw0WbCqi8DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi8DistHpue;
    @XmlElementRef(name = "Cw0WbCqi9DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi9DistHpue;
    @XmlElementRef(name = "Cw0WbCqi10DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi10DistHpue;
    @XmlElementRef(name = "Cw0WbCqi11DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi11DistHpue;
    @XmlElementRef(name = "Cw0WbCqi12DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi12DistHpue;
    @XmlElementRef(name = "Cw0WbCqi13DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi13DistHpue;
    @XmlElementRef(name = "Cw0WbCqi14DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi14DistHpue;
    @XmlElementRef(name = "Cw0WbCqi15DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw0WbCqi15DistHpue;
    @XmlElementRef(name = "Cw1WbCqi1DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi1DistHpue;
    @XmlElementRef(name = "Cw1WbCqi2DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi2DistHpue;
    @XmlElementRef(name = "Cw1WbCqi3DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi3DistHpue;
    @XmlElementRef(name = "Cw1WbCqi4DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi4DistHpue;
    @XmlElementRef(name = "Cw1WbCqi5DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi5DistHpue;
    @XmlElementRef(name = "Cw1WbCqi6DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi6DistHpue;
    @XmlElementRef(name = "Cw1WbCqi7DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi7DistHpue;
    @XmlElementRef(name = "Cw1WbCqi8DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi8DistHpue;
    @XmlElementRef(name = "Cw1WbCqi9DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi9DistHpue;
    @XmlElementRef(name = "Cw1WbCqi10DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi10DistHpue;
    @XmlElementRef(name = "Cw1WbCqi11DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi11DistHpue;
    @XmlElementRef(name = "Cw1WbCqi12DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi12DistHpue;
    @XmlElementRef(name = "Cw1WbCqi13DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi13DistHpue;
    @XmlElementRef(name = "Cw1WbCqi14DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi14DistHpue;
    @XmlElementRef(name = "Cw1WbCqi15DistHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cw1WbCqi15DistHpue;

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
     * Gets the value of the cw0WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi1Dist() {
        return cw0WbCqi1Dist;
    }

    /**
     * Sets the value of the cw0WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi1Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi1Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi2Dist() {
        return cw0WbCqi2Dist;
    }

    /**
     * Sets the value of the cw0WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi2Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi2Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi3Dist() {
        return cw0WbCqi3Dist;
    }

    /**
     * Sets the value of the cw0WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi3Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi3Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi4Dist() {
        return cw0WbCqi4Dist;
    }

    /**
     * Sets the value of the cw0WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi4Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi4Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi5Dist() {
        return cw0WbCqi5Dist;
    }

    /**
     * Sets the value of the cw0WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi5Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi5Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi6Dist() {
        return cw0WbCqi6Dist;
    }

    /**
     * Sets the value of the cw0WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi6Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi6Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi7Dist() {
        return cw0WbCqi7Dist;
    }

    /**
     * Sets the value of the cw0WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi7Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi7Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi8Dist() {
        return cw0WbCqi8Dist;
    }

    /**
     * Sets the value of the cw0WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi8Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi8Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi9Dist() {
        return cw0WbCqi9Dist;
    }

    /**
     * Sets the value of the cw0WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi9Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi9Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi10Dist() {
        return cw0WbCqi10Dist;
    }

    /**
     * Sets the value of the cw0WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi10Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi10Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi11Dist() {
        return cw0WbCqi11Dist;
    }

    /**
     * Sets the value of the cw0WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi11Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi11Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi12Dist() {
        return cw0WbCqi12Dist;
    }

    /**
     * Sets the value of the cw0WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi12Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi12Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi13Dist() {
        return cw0WbCqi13Dist;
    }

    /**
     * Sets the value of the cw0WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi13Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi13Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi14Dist() {
        return cw0WbCqi14Dist;
    }

    /**
     * Sets the value of the cw0WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi14Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi14Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi15Dist() {
        return cw0WbCqi15Dist;
    }

    /**
     * Sets the value of the cw0WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi15Dist(JAXBElement<Integer> value) {
        this.cw0WbCqi15Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi1Dist() {
        return cw1WbCqi1Dist;
    }

    /**
     * Sets the value of the cw1WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi1Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi1Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi2Dist() {
        return cw1WbCqi2Dist;
    }

    /**
     * Sets the value of the cw1WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi2Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi2Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi3Dist() {
        return cw1WbCqi3Dist;
    }

    /**
     * Sets the value of the cw1WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi3Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi3Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi4Dist() {
        return cw1WbCqi4Dist;
    }

    /**
     * Sets the value of the cw1WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi4Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi4Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi5Dist() {
        return cw1WbCqi5Dist;
    }

    /**
     * Sets the value of the cw1WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi5Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi5Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi6Dist() {
        return cw1WbCqi6Dist;
    }

    /**
     * Sets the value of the cw1WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi6Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi6Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi7Dist() {
        return cw1WbCqi7Dist;
    }

    /**
     * Sets the value of the cw1WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi7Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi7Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi8Dist() {
        return cw1WbCqi8Dist;
    }

    /**
     * Sets the value of the cw1WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi8Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi8Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi9Dist() {
        return cw1WbCqi9Dist;
    }

    /**
     * Sets the value of the cw1WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi9Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi9Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi10Dist() {
        return cw1WbCqi10Dist;
    }

    /**
     * Sets the value of the cw1WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi10Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi10Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi11Dist() {
        return cw1WbCqi11Dist;
    }

    /**
     * Sets the value of the cw1WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi11Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi11Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi12Dist() {
        return cw1WbCqi12Dist;
    }

    /**
     * Sets the value of the cw1WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi12Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi12Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi13Dist() {
        return cw1WbCqi13Dist;
    }

    /**
     * Sets the value of the cw1WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi13Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi13Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi14Dist() {
        return cw1WbCqi14Dist;
    }

    /**
     * Sets the value of the cw1WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi14Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi14Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi15Dist() {
        return cw1WbCqi15Dist;
    }

    /**
     * Sets the value of the cw1WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi15Dist(JAXBElement<Integer> value) {
        this.cw1WbCqi15Dist = value;
    }

    /**
     * Gets the value of the ant1RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt1RssiMin() {
        return ant1RssiMin;
    }

    /**
     * Sets the value of the ant1RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt1RssiMin(JAXBElement<Integer> value) {
        this.ant1RssiMin = value;
    }

    /**
     * Gets the value of the ant1RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt1RssiAvg() {
        return ant1RssiAvg;
    }

    /**
     * Sets the value of the ant1RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt1RssiAvg(JAXBElement<Integer> value) {
        this.ant1RssiAvg = value;
    }

    /**
     * Gets the value of the ant1RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt1RssiMax() {
        return ant1RssiMax;
    }

    /**
     * Sets the value of the ant1RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt1RssiMax(JAXBElement<Integer> value) {
        this.ant1RssiMax = value;
    }

    /**
     * Gets the value of the ant2RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt2RssiMin() {
        return ant2RssiMin;
    }

    /**
     * Sets the value of the ant2RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt2RssiMin(JAXBElement<Integer> value) {
        this.ant2RssiMin = value;
    }

    /**
     * Gets the value of the ant2RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt2RssiAvg() {
        return ant2RssiAvg;
    }

    /**
     * Sets the value of the ant2RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt2RssiAvg(JAXBElement<Integer> value) {
        this.ant2RssiAvg = value;
    }

    /**
     * Gets the value of the ant2RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt2RssiMax() {
        return ant2RssiMax;
    }

    /**
     * Sets the value of the ant2RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt2RssiMax(JAXBElement<Integer> value) {
        this.ant2RssiMax = value;
    }

    /**
     * Gets the value of the ant3RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt3RssiMin() {
        return ant3RssiMin;
    }

    /**
     * Sets the value of the ant3RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt3RssiMin(JAXBElement<Integer> value) {
        this.ant3RssiMin = value;
    }

    /**
     * Gets the value of the ant3RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt3RssiAvg() {
        return ant3RssiAvg;
    }

    /**
     * Sets the value of the ant3RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt3RssiAvg(JAXBElement<Integer> value) {
        this.ant3RssiAvg = value;
    }

    /**
     * Gets the value of the ant3RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt3RssiMax() {
        return ant3RssiMax;
    }

    /**
     * Sets the value of the ant3RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt3RssiMax(JAXBElement<Integer> value) {
        this.ant3RssiMax = value;
    }

    /**
     * Gets the value of the ant4RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt4RssiMin() {
        return ant4RssiMin;
    }

    /**
     * Sets the value of the ant4RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt4RssiMin(JAXBElement<Integer> value) {
        this.ant4RssiMin = value;
    }

    /**
     * Gets the value of the ant4RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt4RssiAvg() {
        return ant4RssiAvg;
    }

    /**
     * Sets the value of the ant4RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt4RssiAvg(JAXBElement<Integer> value) {
        this.ant4RssiAvg = value;
    }

    /**
     * Gets the value of the ant4RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAnt4RssiMax() {
        return ant4RssiMax;
    }

    /**
     * Sets the value of the ant4RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAnt4RssiMax(JAXBElement<Integer> value) {
        this.ant4RssiMax = value;
    }

    /**
     * Gets the value of the niMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNiMin() {
        return niMin;
    }

    /**
     * Sets the value of the niMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNiMin(JAXBElement<Integer> value) {
        this.niMin = value;
    }

    /**
     * Gets the value of the niAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNiAvg() {
        return niAvg;
    }

    /**
     * Sets the value of the niAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNiAvg(JAXBElement<Integer> value) {
        this.niAvg = value;
    }

    /**
     * Gets the value of the niMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNiMax() {
        return niMax;
    }

    /**
     * Sets the value of the niMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNiMax(JAXBElement<Integer> value) {
        this.niMax = value;
    }

    /**
     * Gets the value of the cwAllocDlNum1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocDlNum1() {
        return cwAllocDlNum1;
    }

    /**
     * Sets the value of the cwAllocDlNum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocDlNum1(JAXBElement<Long> value) {
        this.cwAllocDlNum1 = value;
    }

    /**
     * Gets the value of the cwAllocDlNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocDlNum2() {
        return cwAllocDlNum2;
    }

    /**
     * Sets the value of the cwAllocDlNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocDlNum2(JAXBElement<Long> value) {
        this.cwAllocDlNum2 = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi1Dist() {
        return caPcellCw0WbCqi1Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi1Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi1Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi2Dist() {
        return caPcellCw0WbCqi2Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi2Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi2Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi3Dist() {
        return caPcellCw0WbCqi3Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi3Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi3Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi4Dist() {
        return caPcellCw0WbCqi4Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi4Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi4Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi5Dist() {
        return caPcellCw0WbCqi5Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi5Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi5Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi6Dist() {
        return caPcellCw0WbCqi6Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi6Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi6Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi7Dist() {
        return caPcellCw0WbCqi7Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi7Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi7Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi8Dist() {
        return caPcellCw0WbCqi8Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi8Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi8Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi9Dist() {
        return caPcellCw0WbCqi9Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi9Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi9Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi10Dist() {
        return caPcellCw0WbCqi10Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi10Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi10Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi11Dist() {
        return caPcellCw0WbCqi11Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi11Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi11Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi12Dist() {
        return caPcellCw0WbCqi12Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi12Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi12Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi13Dist() {
        return caPcellCw0WbCqi13Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi13Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi13Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi14Dist() {
        return caPcellCw0WbCqi14Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi14Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi14Dist = value;
    }

    /**
     * Gets the value of the caPcellCw0WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw0WbCqi15Dist() {
        return caPcellCw0WbCqi15Dist;
    }

    /**
     * Sets the value of the caPcellCw0WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw0WbCqi15Dist(JAXBElement<Long> value) {
        this.caPcellCw0WbCqi15Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi1Dist() {
        return caPcellCw1WbCqi1Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi1Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi1Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi2Dist() {
        return caPcellCw1WbCqi2Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi2Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi2Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi3Dist() {
        return caPcellCw1WbCqi3Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi3Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi3Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi4Dist() {
        return caPcellCw1WbCqi4Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi4Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi4Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi5Dist() {
        return caPcellCw1WbCqi5Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi5Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi5Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi6Dist() {
        return caPcellCw1WbCqi6Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi6Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi6Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi7Dist() {
        return caPcellCw1WbCqi7Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi7Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi7Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi8Dist() {
        return caPcellCw1WbCqi8Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi8Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi8Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi9Dist() {
        return caPcellCw1WbCqi9Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi9Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi9Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi10Dist() {
        return caPcellCw1WbCqi10Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi10Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi10Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi11Dist() {
        return caPcellCw1WbCqi11Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi11Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi11Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi12Dist() {
        return caPcellCw1WbCqi12Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi12Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi12Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi13Dist() {
        return caPcellCw1WbCqi13Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi13Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi13Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi14Dist() {
        return caPcellCw1WbCqi14Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi14Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi14Dist = value;
    }

    /**
     * Gets the value of the caPcellCw1WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaPcellCw1WbCqi15Dist() {
        return caPcellCw1WbCqi15Dist;
    }

    /**
     * Sets the value of the caPcellCw1WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaPcellCw1WbCqi15Dist(JAXBElement<Long> value) {
        this.caPcellCw1WbCqi15Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi1Dist() {
        return caScellCw0WbCqi1Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi1Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi1Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi2Dist() {
        return caScellCw0WbCqi2Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi2Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi2Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi3Dist() {
        return caScellCw0WbCqi3Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi3Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi3Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi4Dist() {
        return caScellCw0WbCqi4Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi4Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi4Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi5Dist() {
        return caScellCw0WbCqi5Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi5Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi5Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi6Dist() {
        return caScellCw0WbCqi6Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi6Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi6Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi7Dist() {
        return caScellCw0WbCqi7Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi7Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi7Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi8Dist() {
        return caScellCw0WbCqi8Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi8Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi8Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi9Dist() {
        return caScellCw0WbCqi9Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi9Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi9Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi10Dist() {
        return caScellCw0WbCqi10Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi10Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi10Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi11Dist() {
        return caScellCw0WbCqi11Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi11Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi11Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi12Dist() {
        return caScellCw0WbCqi12Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi12Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi12Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi13Dist() {
        return caScellCw0WbCqi13Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi13Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi13Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi14Dist() {
        return caScellCw0WbCqi14Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi14Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi14Dist = value;
    }

    /**
     * Gets the value of the caScellCw0WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw0WbCqi15Dist() {
        return caScellCw0WbCqi15Dist;
    }

    /**
     * Sets the value of the caScellCw0WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw0WbCqi15Dist(JAXBElement<Long> value) {
        this.caScellCw0WbCqi15Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi1Dist() {
        return caScellCw1WbCqi1Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi1Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi1Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi2Dist() {
        return caScellCw1WbCqi2Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi2Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi2Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi3Dist() {
        return caScellCw1WbCqi3Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi3Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi3Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi4Dist() {
        return caScellCw1WbCqi4Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi4Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi4Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi5Dist() {
        return caScellCw1WbCqi5Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi5Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi5Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi6Dist() {
        return caScellCw1WbCqi6Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi6Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi6Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi7Dist() {
        return caScellCw1WbCqi7Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi7Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi7Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi8Dist() {
        return caScellCw1WbCqi8Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi8Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi8Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi9Dist() {
        return caScellCw1WbCqi9Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi9Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi9Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi10Dist() {
        return caScellCw1WbCqi10Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi10Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi10Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi11Dist() {
        return caScellCw1WbCqi11Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi11Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi11Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi12Dist() {
        return caScellCw1WbCqi12Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi12Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi12Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi13Dist() {
        return caScellCw1WbCqi13Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi13Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi13Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi14Dist() {
        return caScellCw1WbCqi14Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi14Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi14Dist = value;
    }

    /**
     * Gets the value of the caScellCw1WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaScellCw1WbCqi15Dist() {
        return caScellCw1WbCqi15Dist;
    }

    /**
     * Sets the value of the caScellCw1WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaScellCw1WbCqi15Dist(JAXBElement<Long> value) {
        this.caScellCw1WbCqi15Dist = value;
    }

    /**
     * Gets the value of the caAvgUesWithActiveSCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaAvgUesWithActiveSCell() {
        return caAvgUesWithActiveSCell;
    }

    /**
     * Sets the value of the caAvgUesWithActiveSCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaAvgUesWithActiveSCell(JAXBElement<Integer> value) {
        this.caAvgUesWithActiveSCell = value;
    }

    /**
     * Gets the value of the caAvgCaCapableUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaAvgCaCapableUes() {
        return caAvgCaCapableUes;
    }

    /**
     * Sets the value of the caAvgCaCapableUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaAvgCaCapableUes(JAXBElement<Integer> value) {
        this.caAvgCaCapableUes = value;
    }

    /**
     * Gets the value of the caAvgUesWithCfgSCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaAvgUesWithCfgSCell() {
        return caAvgUesWithCfgSCell;
    }

    /**
     * Sets the value of the caAvgUesWithCfgSCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaAvgUesWithCfgSCell(JAXBElement<Integer> value) {
        this.caAvgUesWithCfgSCell = value;
    }

    /**
     * Gets the value of the rfCarrierTxPowerMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRfCarrierTxPowerMax() {
        return rfCarrierTxPowerMax;
    }

    /**
     * Sets the value of the rfCarrierTxPowerMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRfCarrierTxPowerMax(JAXBElement<Long> value) {
        this.rfCarrierTxPowerMax = value;
    }

    /**
     * Gets the value of the rfCarrierTxPowerMean property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRfCarrierTxPowerMean() {
        return rfCarrierTxPowerMean;
    }

    /**
     * Sets the value of the rfCarrierTxPowerMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRfCarrierTxPowerMean(JAXBElement<Long> value) {
        this.rfCarrierTxPowerMean = value;
    }

    /**
     * Gets the value of the cw0WbCqi1DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi1DistHpue() {
        return cw0WbCqi1DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi1DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi1DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi1DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi2DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi2DistHpue() {
        return cw0WbCqi2DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi2DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi2DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi2DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi3DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi3DistHpue() {
        return cw0WbCqi3DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi3DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi3DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi3DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi4DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi4DistHpue() {
        return cw0WbCqi4DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi4DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi4DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi4DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi5DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi5DistHpue() {
        return cw0WbCqi5DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi5DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi5DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi5DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi6DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi6DistHpue() {
        return cw0WbCqi6DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi6DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi6DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi6DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi7DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi7DistHpue() {
        return cw0WbCqi7DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi7DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi7DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi7DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi8DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi8DistHpue() {
        return cw0WbCqi8DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi8DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi8DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi8DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi9DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi9DistHpue() {
        return cw0WbCqi9DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi9DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi9DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi9DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi10DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi10DistHpue() {
        return cw0WbCqi10DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi10DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi10DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi10DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi11DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi11DistHpue() {
        return cw0WbCqi11DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi11DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi11DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi11DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi12DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi12DistHpue() {
        return cw0WbCqi12DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi12DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi12DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi12DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi13DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi13DistHpue() {
        return cw0WbCqi13DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi13DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi13DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi13DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi14DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi14DistHpue() {
        return cw0WbCqi14DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi14DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi14DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi14DistHpue = value;
    }

    /**
     * Gets the value of the cw0WbCqi15DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw0WbCqi15DistHpue() {
        return cw0WbCqi15DistHpue;
    }

    /**
     * Sets the value of the cw0WbCqi15DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw0WbCqi15DistHpue(JAXBElement<Integer> value) {
        this.cw0WbCqi15DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi1DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi1DistHpue() {
        return cw1WbCqi1DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi1DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi1DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi1DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi2DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi2DistHpue() {
        return cw1WbCqi2DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi2DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi2DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi2DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi3DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi3DistHpue() {
        return cw1WbCqi3DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi3DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi3DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi3DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi4DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi4DistHpue() {
        return cw1WbCqi4DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi4DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi4DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi4DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi5DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi5DistHpue() {
        return cw1WbCqi5DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi5DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi5DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi5DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi6DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi6DistHpue() {
        return cw1WbCqi6DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi6DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi6DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi6DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi7DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi7DistHpue() {
        return cw1WbCqi7DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi7DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi7DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi7DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi8DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi8DistHpue() {
        return cw1WbCqi8DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi8DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi8DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi8DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi9DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi9DistHpue() {
        return cw1WbCqi9DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi9DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi9DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi9DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi10DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi10DistHpue() {
        return cw1WbCqi10DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi10DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi10DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi10DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi11DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi11DistHpue() {
        return cw1WbCqi11DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi11DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi11DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi11DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi12DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi12DistHpue() {
        return cw1WbCqi12DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi12DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi12DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi12DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi13DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi13DistHpue() {
        return cw1WbCqi13DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi13DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi13DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi13DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi14DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi14DistHpue() {
        return cw1WbCqi14DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi14DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi14DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi14DistHpue = value;
    }

    /**
     * Gets the value of the cw1WbCqi15DistHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCw1WbCqi15DistHpue() {
        return cw1WbCqi15DistHpue;
    }

    /**
     * Sets the value of the cw1WbCqi15DistHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCw1WbCqi15DistHpue(JAXBElement<Integer> value) {
        this.cw1WbCqi15DistHpue = value;
    }

}
