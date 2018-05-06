
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LtePerCellHoStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePerCellHoStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TargetCellIdentity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoFailureMroTooEarly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoFailureMroTooLate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoFailureMroWrongCell" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePerCellHoStatsRowWs", propOrder = {
    "cellId",
    "targetCellIdentity",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "outAttSum",
    "outAttDesForRadReasons",
    "outAttTimeCritical",
    "outAttResOptimisation",
    "outAttReduceLoadInServingCell",
    "outSuccSum",
    "outSuccDesForRadReasons",
    "outSuccTimeCritical",
    "outSuccResOptimisation",
    "outSuccReduceLoadInServingCell",
    "hoFailureMroTooEarly",
    "hoFailureMroTooLate",
    "hoFailureMroWrongCell"
})
public class LtePerCellHoStatsRowWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "TargetCellIdentity", required = true, type = Integer.class, nillable = true)
    protected Integer targetCellIdentity;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "OutAttSum", required = true, type = Integer.class, nillable = true)
    protected Integer outAttSum;
    @XmlElement(name = "OutAttDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer outAttDesForRadReasons;
    @XmlElement(name = "OutAttTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer outAttTimeCritical;
    @XmlElement(name = "OutAttResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer outAttResOptimisation;
    @XmlElement(name = "OutAttReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer outAttReduceLoadInServingCell;
    @XmlElement(name = "OutSuccSum", required = true, type = Integer.class, nillable = true)
    protected Integer outSuccSum;
    @XmlElement(name = "OutSuccDesForRadReasons", required = true, type = Integer.class, nillable = true)
    protected Integer outSuccDesForRadReasons;
    @XmlElement(name = "OutSuccTimeCritical", required = true, type = Integer.class, nillable = true)
    protected Integer outSuccTimeCritical;
    @XmlElement(name = "OutSuccResOptimisation", required = true, type = Integer.class, nillable = true)
    protected Integer outSuccResOptimisation;
    @XmlElement(name = "OutSuccReduceLoadInServingCell", required = true, type = Integer.class, nillable = true)
    protected Integer outSuccReduceLoadInServingCell;
    @XmlElement(name = "HoFailureMroTooEarly", required = true, type = Integer.class, nillable = true)
    protected Integer hoFailureMroTooEarly;
    @XmlElement(name = "HoFailureMroTooLate", required = true, type = Integer.class, nillable = true)
    protected Integer hoFailureMroTooLate;
    @XmlElement(name = "HoFailureMroWrongCell", required = true, type = Integer.class, nillable = true)
    protected Integer hoFailureMroWrongCell;

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
     * Gets the value of the targetCellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetCellIdentity() {
        return targetCellIdentity;
    }

    /**
     * Sets the value of the targetCellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetCellIdentity(Integer value) {
        this.targetCellIdentity = value;
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
     * Gets the value of the outAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutAttSum() {
        return outAttSum;
    }

    /**
     * Sets the value of the outAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutAttSum(Integer value) {
        this.outAttSum = value;
    }

    /**
     * Gets the value of the outAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutAttDesForRadReasons() {
        return outAttDesForRadReasons;
    }

    /**
     * Sets the value of the outAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutAttDesForRadReasons(Integer value) {
        this.outAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the outAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutAttTimeCritical() {
        return outAttTimeCritical;
    }

    /**
     * Sets the value of the outAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutAttTimeCritical(Integer value) {
        this.outAttTimeCritical = value;
    }

    /**
     * Gets the value of the outAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutAttResOptimisation() {
        return outAttResOptimisation;
    }

    /**
     * Sets the value of the outAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutAttResOptimisation(Integer value) {
        this.outAttResOptimisation = value;
    }

    /**
     * Gets the value of the outAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutAttReduceLoadInServingCell() {
        return outAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the outAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutAttReduceLoadInServingCell(Integer value) {
        this.outAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the outSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutSuccSum() {
        return outSuccSum;
    }

    /**
     * Sets the value of the outSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutSuccSum(Integer value) {
        this.outSuccSum = value;
    }

    /**
     * Gets the value of the outSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutSuccDesForRadReasons() {
        return outSuccDesForRadReasons;
    }

    /**
     * Sets the value of the outSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutSuccDesForRadReasons(Integer value) {
        this.outSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the outSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutSuccTimeCritical() {
        return outSuccTimeCritical;
    }

    /**
     * Sets the value of the outSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutSuccTimeCritical(Integer value) {
        this.outSuccTimeCritical = value;
    }

    /**
     * Gets the value of the outSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutSuccResOptimisation() {
        return outSuccResOptimisation;
    }

    /**
     * Sets the value of the outSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutSuccResOptimisation(Integer value) {
        this.outSuccResOptimisation = value;
    }

    /**
     * Gets the value of the outSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutSuccReduceLoadInServingCell() {
        return outSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the outSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutSuccReduceLoadInServingCell(Integer value) {
        this.outSuccReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the hoFailureMroTooEarly property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoFailureMroTooEarly() {
        return hoFailureMroTooEarly;
    }

    /**
     * Sets the value of the hoFailureMroTooEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoFailureMroTooEarly(Integer value) {
        this.hoFailureMroTooEarly = value;
    }

    /**
     * Gets the value of the hoFailureMroTooLate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoFailureMroTooLate() {
        return hoFailureMroTooLate;
    }

    /**
     * Sets the value of the hoFailureMroTooLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoFailureMroTooLate(Integer value) {
        this.hoFailureMroTooLate = value;
    }

    /**
     * Gets the value of the hoFailureMroWrongCell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHoFailureMroWrongCell() {
        return hoFailureMroWrongCell;
    }

    /**
     * Sets the value of the hoFailureMroWrongCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHoFailureMroWrongCell(Integer value) {
        this.hoFailureMroWrongCell = value;
    }

}
