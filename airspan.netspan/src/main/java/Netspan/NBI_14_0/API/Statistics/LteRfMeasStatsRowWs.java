
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw0WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi1Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi2Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi3Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi4Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi5Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi6Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi7Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi8Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi9Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi10Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi11Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi12Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi13Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi14Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cw1WbCqi15Dist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant1RssiMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant1RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant1RssiMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant2RssiMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant2RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant2RssiMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant3RssiMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant3RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant3RssiMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant4RssiMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant4RssiAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ant4RssiMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NiMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NiAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NiMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "niMax"
})
public class LteRfMeasStatsRowWs {

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
    @XmlElement(name = "Cw0WbCqi1Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi1Dist;
    @XmlElement(name = "Cw0WbCqi2Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi2Dist;
    @XmlElement(name = "Cw0WbCqi3Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi3Dist;
    @XmlElement(name = "Cw0WbCqi4Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi4Dist;
    @XmlElement(name = "Cw0WbCqi5Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi5Dist;
    @XmlElement(name = "Cw0WbCqi6Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi6Dist;
    @XmlElement(name = "Cw0WbCqi7Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi7Dist;
    @XmlElement(name = "Cw0WbCqi8Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi8Dist;
    @XmlElement(name = "Cw0WbCqi9Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi9Dist;
    @XmlElement(name = "Cw0WbCqi10Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi10Dist;
    @XmlElement(name = "Cw0WbCqi11Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi11Dist;
    @XmlElement(name = "Cw0WbCqi12Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi12Dist;
    @XmlElement(name = "Cw0WbCqi13Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi13Dist;
    @XmlElement(name = "Cw0WbCqi14Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi14Dist;
    @XmlElement(name = "Cw0WbCqi15Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw0WbCqi15Dist;
    @XmlElement(name = "Cw1WbCqi1Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi1Dist;
    @XmlElement(name = "Cw1WbCqi2Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi2Dist;
    @XmlElement(name = "Cw1WbCqi3Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi3Dist;
    @XmlElement(name = "Cw1WbCqi4Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi4Dist;
    @XmlElement(name = "Cw1WbCqi5Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi5Dist;
    @XmlElement(name = "Cw1WbCqi6Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi6Dist;
    @XmlElement(name = "Cw1WbCqi7Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi7Dist;
    @XmlElement(name = "Cw1WbCqi8Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi8Dist;
    @XmlElement(name = "Cw1WbCqi9Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi9Dist;
    @XmlElement(name = "Cw1WbCqi10Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi10Dist;
    @XmlElement(name = "Cw1WbCqi11Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi11Dist;
    @XmlElement(name = "Cw1WbCqi12Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi12Dist;
    @XmlElement(name = "Cw1WbCqi13Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi13Dist;
    @XmlElement(name = "Cw1WbCqi14Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi14Dist;
    @XmlElement(name = "Cw1WbCqi15Dist", required = true, type = Integer.class, nillable = true)
    protected Integer cw1WbCqi15Dist;
    @XmlElement(name = "Ant1RssiMin", required = true, type = Integer.class, nillable = true)
    protected Integer ant1RssiMin;
    @XmlElement(name = "Ant1RssiAvg", required = true, type = Integer.class, nillable = true)
    protected Integer ant1RssiAvg;
    @XmlElement(name = "Ant1RssiMax", required = true, type = Integer.class, nillable = true)
    protected Integer ant1RssiMax;
    @XmlElement(name = "Ant2RssiMin", required = true, type = Integer.class, nillable = true)
    protected Integer ant2RssiMin;
    @XmlElement(name = "Ant2RssiAvg", required = true, type = Integer.class, nillable = true)
    protected Integer ant2RssiAvg;
    @XmlElement(name = "Ant2RssiMax", required = true, type = Integer.class, nillable = true)
    protected Integer ant2RssiMax;
    @XmlElement(name = "Ant3RssiMin", required = true, type = Integer.class, nillable = true)
    protected Integer ant3RssiMin;
    @XmlElement(name = "Ant3RssiAvg", required = true, type = Integer.class, nillable = true)
    protected Integer ant3RssiAvg;
    @XmlElement(name = "Ant3RssiMax", required = true, type = Integer.class, nillable = true)
    protected Integer ant3RssiMax;
    @XmlElement(name = "Ant4RssiMin", required = true, type = Integer.class, nillable = true)
    protected Integer ant4RssiMin;
    @XmlElement(name = "Ant4RssiAvg", required = true, type = Integer.class, nillable = true)
    protected Integer ant4RssiAvg;
    @XmlElement(name = "Ant4RssiMax", required = true, type = Integer.class, nillable = true)
    protected Integer ant4RssiMax;
    @XmlElement(name = "NiMin", required = true, type = Integer.class, nillable = true)
    protected Integer niMin;
    @XmlElement(name = "NiAvg", required = true, type = Integer.class, nillable = true)
    protected Integer niAvg;
    @XmlElement(name = "NiMax", required = true, type = Integer.class, nillable = true)
    protected Integer niMax;

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
     * Gets the value of the cw0WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi1Dist() {
        return cw0WbCqi1Dist;
    }

    /**
     * Sets the value of the cw0WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi1Dist(Integer value) {
        this.cw0WbCqi1Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi2Dist() {
        return cw0WbCqi2Dist;
    }

    /**
     * Sets the value of the cw0WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi2Dist(Integer value) {
        this.cw0WbCqi2Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi3Dist() {
        return cw0WbCqi3Dist;
    }

    /**
     * Sets the value of the cw0WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi3Dist(Integer value) {
        this.cw0WbCqi3Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi4Dist() {
        return cw0WbCqi4Dist;
    }

    /**
     * Sets the value of the cw0WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi4Dist(Integer value) {
        this.cw0WbCqi4Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi5Dist() {
        return cw0WbCqi5Dist;
    }

    /**
     * Sets the value of the cw0WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi5Dist(Integer value) {
        this.cw0WbCqi5Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi6Dist() {
        return cw0WbCqi6Dist;
    }

    /**
     * Sets the value of the cw0WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi6Dist(Integer value) {
        this.cw0WbCqi6Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi7Dist() {
        return cw0WbCqi7Dist;
    }

    /**
     * Sets the value of the cw0WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi7Dist(Integer value) {
        this.cw0WbCqi7Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi8Dist() {
        return cw0WbCqi8Dist;
    }

    /**
     * Sets the value of the cw0WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi8Dist(Integer value) {
        this.cw0WbCqi8Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi9Dist() {
        return cw0WbCqi9Dist;
    }

    /**
     * Sets the value of the cw0WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi9Dist(Integer value) {
        this.cw0WbCqi9Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi10Dist() {
        return cw0WbCqi10Dist;
    }

    /**
     * Sets the value of the cw0WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi10Dist(Integer value) {
        this.cw0WbCqi10Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi11Dist() {
        return cw0WbCqi11Dist;
    }

    /**
     * Sets the value of the cw0WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi11Dist(Integer value) {
        this.cw0WbCqi11Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi12Dist() {
        return cw0WbCqi12Dist;
    }

    /**
     * Sets the value of the cw0WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi12Dist(Integer value) {
        this.cw0WbCqi12Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi13Dist() {
        return cw0WbCqi13Dist;
    }

    /**
     * Sets the value of the cw0WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi13Dist(Integer value) {
        this.cw0WbCqi13Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi14Dist() {
        return cw0WbCqi14Dist;
    }

    /**
     * Sets the value of the cw0WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi14Dist(Integer value) {
        this.cw0WbCqi14Dist = value;
    }

    /**
     * Gets the value of the cw0WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw0WbCqi15Dist() {
        return cw0WbCqi15Dist;
    }

    /**
     * Sets the value of the cw0WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw0WbCqi15Dist(Integer value) {
        this.cw0WbCqi15Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi1Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi1Dist() {
        return cw1WbCqi1Dist;
    }

    /**
     * Sets the value of the cw1WbCqi1Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi1Dist(Integer value) {
        this.cw1WbCqi1Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi2Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi2Dist() {
        return cw1WbCqi2Dist;
    }

    /**
     * Sets the value of the cw1WbCqi2Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi2Dist(Integer value) {
        this.cw1WbCqi2Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi3Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi3Dist() {
        return cw1WbCqi3Dist;
    }

    /**
     * Sets the value of the cw1WbCqi3Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi3Dist(Integer value) {
        this.cw1WbCqi3Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi4Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi4Dist() {
        return cw1WbCqi4Dist;
    }

    /**
     * Sets the value of the cw1WbCqi4Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi4Dist(Integer value) {
        this.cw1WbCqi4Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi5Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi5Dist() {
        return cw1WbCqi5Dist;
    }

    /**
     * Sets the value of the cw1WbCqi5Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi5Dist(Integer value) {
        this.cw1WbCqi5Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi6Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi6Dist() {
        return cw1WbCqi6Dist;
    }

    /**
     * Sets the value of the cw1WbCqi6Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi6Dist(Integer value) {
        this.cw1WbCqi6Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi7Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi7Dist() {
        return cw1WbCqi7Dist;
    }

    /**
     * Sets the value of the cw1WbCqi7Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi7Dist(Integer value) {
        this.cw1WbCqi7Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi8Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi8Dist() {
        return cw1WbCqi8Dist;
    }

    /**
     * Sets the value of the cw1WbCqi8Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi8Dist(Integer value) {
        this.cw1WbCqi8Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi9Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi9Dist() {
        return cw1WbCqi9Dist;
    }

    /**
     * Sets the value of the cw1WbCqi9Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi9Dist(Integer value) {
        this.cw1WbCqi9Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi10Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi10Dist() {
        return cw1WbCqi10Dist;
    }

    /**
     * Sets the value of the cw1WbCqi10Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi10Dist(Integer value) {
        this.cw1WbCqi10Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi11Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi11Dist() {
        return cw1WbCqi11Dist;
    }

    /**
     * Sets the value of the cw1WbCqi11Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi11Dist(Integer value) {
        this.cw1WbCqi11Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi12Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi12Dist() {
        return cw1WbCqi12Dist;
    }

    /**
     * Sets the value of the cw1WbCqi12Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi12Dist(Integer value) {
        this.cw1WbCqi12Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi13Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi13Dist() {
        return cw1WbCqi13Dist;
    }

    /**
     * Sets the value of the cw1WbCqi13Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi13Dist(Integer value) {
        this.cw1WbCqi13Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi14Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi14Dist() {
        return cw1WbCqi14Dist;
    }

    /**
     * Sets the value of the cw1WbCqi14Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi14Dist(Integer value) {
        this.cw1WbCqi14Dist = value;
    }

    /**
     * Gets the value of the cw1WbCqi15Dist property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCw1WbCqi15Dist() {
        return cw1WbCqi15Dist;
    }

    /**
     * Sets the value of the cw1WbCqi15Dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCw1WbCqi15Dist(Integer value) {
        this.cw1WbCqi15Dist = value;
    }

    /**
     * Gets the value of the ant1RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt1RssiMin() {
        return ant1RssiMin;
    }

    /**
     * Sets the value of the ant1RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt1RssiMin(Integer value) {
        this.ant1RssiMin = value;
    }

    /**
     * Gets the value of the ant1RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt1RssiAvg() {
        return ant1RssiAvg;
    }

    /**
     * Sets the value of the ant1RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt1RssiAvg(Integer value) {
        this.ant1RssiAvg = value;
    }

    /**
     * Gets the value of the ant1RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt1RssiMax() {
        return ant1RssiMax;
    }

    /**
     * Sets the value of the ant1RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt1RssiMax(Integer value) {
        this.ant1RssiMax = value;
    }

    /**
     * Gets the value of the ant2RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt2RssiMin() {
        return ant2RssiMin;
    }

    /**
     * Sets the value of the ant2RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt2RssiMin(Integer value) {
        this.ant2RssiMin = value;
    }

    /**
     * Gets the value of the ant2RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt2RssiAvg() {
        return ant2RssiAvg;
    }

    /**
     * Sets the value of the ant2RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt2RssiAvg(Integer value) {
        this.ant2RssiAvg = value;
    }

    /**
     * Gets the value of the ant2RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt2RssiMax() {
        return ant2RssiMax;
    }

    /**
     * Sets the value of the ant2RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt2RssiMax(Integer value) {
        this.ant2RssiMax = value;
    }

    /**
     * Gets the value of the ant3RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt3RssiMin() {
        return ant3RssiMin;
    }

    /**
     * Sets the value of the ant3RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt3RssiMin(Integer value) {
        this.ant3RssiMin = value;
    }

    /**
     * Gets the value of the ant3RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt3RssiAvg() {
        return ant3RssiAvg;
    }

    /**
     * Sets the value of the ant3RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt3RssiAvg(Integer value) {
        this.ant3RssiAvg = value;
    }

    /**
     * Gets the value of the ant3RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt3RssiMax() {
        return ant3RssiMax;
    }

    /**
     * Sets the value of the ant3RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt3RssiMax(Integer value) {
        this.ant3RssiMax = value;
    }

    /**
     * Gets the value of the ant4RssiMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt4RssiMin() {
        return ant4RssiMin;
    }

    /**
     * Sets the value of the ant4RssiMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt4RssiMin(Integer value) {
        this.ant4RssiMin = value;
    }

    /**
     * Gets the value of the ant4RssiAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt4RssiAvg() {
        return ant4RssiAvg;
    }

    /**
     * Sets the value of the ant4RssiAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt4RssiAvg(Integer value) {
        this.ant4RssiAvg = value;
    }

    /**
     * Gets the value of the ant4RssiMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnt4RssiMax() {
        return ant4RssiMax;
    }

    /**
     * Sets the value of the ant4RssiMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnt4RssiMax(Integer value) {
        this.ant4RssiMax = value;
    }

    /**
     * Gets the value of the niMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNiMin() {
        return niMin;
    }

    /**
     * Sets the value of the niMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNiMin(Integer value) {
        this.niMin = value;
    }

    /**
     * Gets the value of the niAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNiAvg() {
        return niAvg;
    }

    /**
     * Sets the value of the niAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNiAvg(Integer value) {
        this.niAvg = value;
    }

    /**
     * Gets the value of the niMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNiMax() {
        return niMax;
    }

    /**
     * Sets the value of the niMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNiMax(Integer value) {
        this.niMax = value;
    }

}
