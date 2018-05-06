
package Netspan.NBI_15_2.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TargetCellIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoFailureMroTooEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoFailureMroTooLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoFailureMroWrongCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "TargetCellIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetCellIdentity;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "OutAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttSum;
    @XmlElementRef(name = "OutAttDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttDesForRadReasons;
    @XmlElementRef(name = "OutAttTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttTimeCritical;
    @XmlElementRef(name = "OutAttResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttResOptimisation;
    @XmlElementRef(name = "OutAttReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttReduceLoadInServingCell;
    @XmlElementRef(name = "OutSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccSum;
    @XmlElementRef(name = "OutSuccDesForRadReasons", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccDesForRadReasons;
    @XmlElementRef(name = "OutSuccTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccTimeCritical;
    @XmlElementRef(name = "OutSuccResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccResOptimisation;
    @XmlElementRef(name = "OutSuccReduceLoadInServingCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccReduceLoadInServingCell;
    @XmlElementRef(name = "HoFailureMroTooEarly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroTooEarly;
    @XmlElementRef(name = "HoFailureMroTooLate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroTooLate;
    @XmlElementRef(name = "HoFailureMroWrongCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWrongCell;

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
     * Gets the value of the targetCellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetCellIdentity() {
        return targetCellIdentity;
    }

    /**
     * Sets the value of the targetCellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetCellIdentity(JAXBElement<Integer> value) {
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
     * Gets the value of the outAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttSum() {
        return outAttSum;
    }

    /**
     * Sets the value of the outAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttSum(JAXBElement<Integer> value) {
        this.outAttSum = value;
    }

    /**
     * Gets the value of the outAttDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttDesForRadReasons() {
        return outAttDesForRadReasons;
    }

    /**
     * Sets the value of the outAttDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttDesForRadReasons(JAXBElement<Integer> value) {
        this.outAttDesForRadReasons = value;
    }

    /**
     * Gets the value of the outAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttTimeCritical() {
        return outAttTimeCritical;
    }

    /**
     * Sets the value of the outAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttTimeCritical(JAXBElement<Integer> value) {
        this.outAttTimeCritical = value;
    }

    /**
     * Gets the value of the outAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttResOptimisation() {
        return outAttResOptimisation;
    }

    /**
     * Sets the value of the outAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttResOptimisation(JAXBElement<Integer> value) {
        this.outAttResOptimisation = value;
    }

    /**
     * Gets the value of the outAttReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttReduceLoadInServingCell() {
        return outAttReduceLoadInServingCell;
    }

    /**
     * Sets the value of the outAttReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.outAttReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the outSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccSum() {
        return outSuccSum;
    }

    /**
     * Sets the value of the outSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccSum(JAXBElement<Integer> value) {
        this.outSuccSum = value;
    }

    /**
     * Gets the value of the outSuccDesForRadReasons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccDesForRadReasons() {
        return outSuccDesForRadReasons;
    }

    /**
     * Sets the value of the outSuccDesForRadReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccDesForRadReasons(JAXBElement<Integer> value) {
        this.outSuccDesForRadReasons = value;
    }

    /**
     * Gets the value of the outSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccTimeCritical() {
        return outSuccTimeCritical;
    }

    /**
     * Sets the value of the outSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccTimeCritical(JAXBElement<Integer> value) {
        this.outSuccTimeCritical = value;
    }

    /**
     * Gets the value of the outSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccResOptimisation() {
        return outSuccResOptimisation;
    }

    /**
     * Sets the value of the outSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccResOptimisation(JAXBElement<Integer> value) {
        this.outSuccResOptimisation = value;
    }

    /**
     * Gets the value of the outSuccReduceLoadInServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccReduceLoadInServingCell() {
        return outSuccReduceLoadInServingCell;
    }

    /**
     * Sets the value of the outSuccReduceLoadInServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccReduceLoadInServingCell(JAXBElement<Integer> value) {
        this.outSuccReduceLoadInServingCell = value;
    }

    /**
     * Gets the value of the hoFailureMroTooEarly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroTooEarly() {
        return hoFailureMroTooEarly;
    }

    /**
     * Sets the value of the hoFailureMroTooEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroTooEarly(JAXBElement<Integer> value) {
        this.hoFailureMroTooEarly = value;
    }

    /**
     * Gets the value of the hoFailureMroTooLate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroTooLate() {
        return hoFailureMroTooLate;
    }

    /**
     * Sets the value of the hoFailureMroTooLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroTooLate(JAXBElement<Integer> value) {
        this.hoFailureMroTooLate = value;
    }

    /**
     * Gets the value of the hoFailureMroWrongCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWrongCell() {
        return hoFailureMroWrongCell;
    }

    /**
     * Sets the value of the hoFailureMroWrongCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWrongCell(JAXBElement<Integer> value) {
        this.hoFailureMroWrongCell = value;
    }

}
