
package Netspan.NBI_15_1.Statistics;

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
 * &lt;complexType name="LteRfMeasStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw0WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Cw1WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant1RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant1RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant1RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant2RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant2RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant2RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant3RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant3RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant3RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant4RssiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant4RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ant4RssiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NiMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NiAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NiMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CwAllocDlNum1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CwAllocDlNum2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRfMeasStatsRowWs", propOrder = {
    "cellId",
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
    "cwAllocDlNum2"
})
public class LteRfMeasStatsRowWs {

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
    protected JAXBElement<Integer> cwAllocDlNum1;
    @XmlElementRef(name = "CwAllocDlNum2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cwAllocDlNum2;

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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCwAllocDlNum1() {
        return cwAllocDlNum1;
    }

    /**
     * Sets the value of the cwAllocDlNum1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCwAllocDlNum1(JAXBElement<Integer> value) {
        this.cwAllocDlNum1 = value;
    }

    /**
     * Gets the value of the cwAllocDlNum2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCwAllocDlNum2() {
        return cwAllocDlNum2;
    }

    /**
     * Sets the value of the cwAllocDlNum2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCwAllocDlNum2(JAXBElement<Integer> value) {
        this.cwAllocDlNum2 = value;
    }

}
