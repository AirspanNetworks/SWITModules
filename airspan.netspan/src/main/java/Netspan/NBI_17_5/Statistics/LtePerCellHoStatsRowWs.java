
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
 * <p>Java class for LtePerCellHoStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtePerCellHoStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetCellIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccDesForRadReasons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccReduceLoadInServingCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroTooEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroTooLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroTooLateServCellThNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroTooLateNghCellThNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWrongCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttDesRadReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttResOptimization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoOutPrepAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccSwitchOffOngoing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWithVolteTooEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWithVolteTooLate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWithVolteWrongCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWithVolteTooLateServCellThresholdNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoFailureMroWithVolteTooLateNghCellThresholdNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtePerCellHoStatsRowWs", propOrder = {
    "cellNumber",
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
    "hoFailureMroTooLateServCellThNotCrossed",
    "hoFailureMroTooLateNghCellThNotCrossed",
    "hoFailureMroWrongCell",
    "hoOutPrepAttDesRadReason",
    "hoOutPrepAttTimeCritical",
    "hoOutPrepAttResOptimization",
    "hoOutPrepAttReduceLoadInSvgCell",
    "hoOutPrepAttSwitchOffOngoing",
    "hoOutPrepAttUnspecified",
    "hoOutPrepAttUnknown",
    "hoOutPrepAttSum",
    "outAttSwitchOffOngoing",
    "outAttUnspecified",
    "outAttUnknown",
    "outSuccSwitchOffOngoing",
    "outSuccUnspecified",
    "outSuccUnknown",
    "hoFailureMroWithVolteTooEarly",
    "hoFailureMroWithVolteTooLate",
    "hoFailureMroWithVolteWrongCell",
    "hoFailureMroWithVolteTooLateServCellThresholdNotCrossed",
    "hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed"
})
public class LtePerCellHoStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
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
    @XmlElementRef(name = "HoFailureMroTooLateServCellThNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroTooLateServCellThNotCrossed;
    @XmlElementRef(name = "HoFailureMroTooLateNghCellThNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroTooLateNghCellThNotCrossed;
    @XmlElementRef(name = "HoFailureMroWrongCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWrongCell;
    @XmlElementRef(name = "HoOutPrepAttDesRadReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttDesRadReason;
    @XmlElementRef(name = "HoOutPrepAttTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttTimeCritical;
    @XmlElementRef(name = "HoOutPrepAttResOptimization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttResOptimization;
    @XmlElementRef(name = "HoOutPrepAttReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttReduceLoadInSvgCell;
    @XmlElementRef(name = "HoOutPrepAttSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttSwitchOffOngoing;
    @XmlElementRef(name = "HoOutPrepAttUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttUnspecified;
    @XmlElementRef(name = "HoOutPrepAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttUnknown;
    @XmlElementRef(name = "HoOutPrepAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoOutPrepAttSum;
    @XmlElementRef(name = "OutAttSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttSwitchOffOngoing;
    @XmlElementRef(name = "OutAttUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttUnspecified;
    @XmlElementRef(name = "OutAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outAttUnknown;
    @XmlElementRef(name = "OutSuccSwitchOffOngoing", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccSwitchOffOngoing;
    @XmlElementRef(name = "OutSuccUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccUnspecified;
    @XmlElementRef(name = "OutSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outSuccUnknown;
    @XmlElementRef(name = "HoFailureMroWithVolteTooEarly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWithVolteTooEarly;
    @XmlElementRef(name = "HoFailureMroWithVolteTooLate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWithVolteTooLate;
    @XmlElementRef(name = "HoFailureMroWithVolteWrongCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWithVolteWrongCell;
    @XmlElementRef(name = "HoFailureMroWithVolteTooLateServCellThresholdNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWithVolteTooLateServCellThresholdNotCrossed;
    @XmlElementRef(name = "HoFailureMroWithVolteTooLateNghCellThresholdNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed;

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
     * Gets the value of the hoFailureMroTooLateServCellThNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroTooLateServCellThNotCrossed() {
        return hoFailureMroTooLateServCellThNotCrossed;
    }

    /**
     * Sets the value of the hoFailureMroTooLateServCellThNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroTooLateServCellThNotCrossed(JAXBElement<Integer> value) {
        this.hoFailureMroTooLateServCellThNotCrossed = value;
    }

    /**
     * Gets the value of the hoFailureMroTooLateNghCellThNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroTooLateNghCellThNotCrossed() {
        return hoFailureMroTooLateNghCellThNotCrossed;
    }

    /**
     * Sets the value of the hoFailureMroTooLateNghCellThNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroTooLateNghCellThNotCrossed(JAXBElement<Integer> value) {
        this.hoFailureMroTooLateNghCellThNotCrossed = value;
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

    /**
     * Gets the value of the hoOutPrepAttDesRadReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttDesRadReason() {
        return hoOutPrepAttDesRadReason;
    }

    /**
     * Sets the value of the hoOutPrepAttDesRadReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttDesRadReason(JAXBElement<Integer> value) {
        this.hoOutPrepAttDesRadReason = value;
    }

    /**
     * Gets the value of the hoOutPrepAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttTimeCritical() {
        return hoOutPrepAttTimeCritical;
    }

    /**
     * Sets the value of the hoOutPrepAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttTimeCritical(JAXBElement<Integer> value) {
        this.hoOutPrepAttTimeCritical = value;
    }

    /**
     * Gets the value of the hoOutPrepAttResOptimization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttResOptimization() {
        return hoOutPrepAttResOptimization;
    }

    /**
     * Sets the value of the hoOutPrepAttResOptimization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttResOptimization(JAXBElement<Integer> value) {
        this.hoOutPrepAttResOptimization = value;
    }

    /**
     * Gets the value of the hoOutPrepAttReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttReduceLoadInSvgCell() {
        return hoOutPrepAttReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the hoOutPrepAttReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.hoOutPrepAttReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the hoOutPrepAttSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttSwitchOffOngoing() {
        return hoOutPrepAttSwitchOffOngoing;
    }

    /**
     * Sets the value of the hoOutPrepAttSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttSwitchOffOngoing(JAXBElement<Integer> value) {
        this.hoOutPrepAttSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the hoOutPrepAttUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttUnspecified() {
        return hoOutPrepAttUnspecified;
    }

    /**
     * Sets the value of the hoOutPrepAttUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttUnspecified(JAXBElement<Integer> value) {
        this.hoOutPrepAttUnspecified = value;
    }

    /**
     * Gets the value of the hoOutPrepAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttUnknown() {
        return hoOutPrepAttUnknown;
    }

    /**
     * Sets the value of the hoOutPrepAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttUnknown(JAXBElement<Integer> value) {
        this.hoOutPrepAttUnknown = value;
    }

    /**
     * Gets the value of the hoOutPrepAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoOutPrepAttSum() {
        return hoOutPrepAttSum;
    }

    /**
     * Sets the value of the hoOutPrepAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoOutPrepAttSum(JAXBElement<Integer> value) {
        this.hoOutPrepAttSum = value;
    }

    /**
     * Gets the value of the outAttSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttSwitchOffOngoing() {
        return outAttSwitchOffOngoing;
    }

    /**
     * Sets the value of the outAttSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttSwitchOffOngoing(JAXBElement<Integer> value) {
        this.outAttSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the outAttUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttUnspecified() {
        return outAttUnspecified;
    }

    /**
     * Sets the value of the outAttUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttUnspecified(JAXBElement<Integer> value) {
        this.outAttUnspecified = value;
    }

    /**
     * Gets the value of the outAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutAttUnknown() {
        return outAttUnknown;
    }

    /**
     * Sets the value of the outAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutAttUnknown(JAXBElement<Integer> value) {
        this.outAttUnknown = value;
    }

    /**
     * Gets the value of the outSuccSwitchOffOngoing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccSwitchOffOngoing() {
        return outSuccSwitchOffOngoing;
    }

    /**
     * Sets the value of the outSuccSwitchOffOngoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccSwitchOffOngoing(JAXBElement<Integer> value) {
        this.outSuccSwitchOffOngoing = value;
    }

    /**
     * Gets the value of the outSuccUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccUnspecified() {
        return outSuccUnspecified;
    }

    /**
     * Sets the value of the outSuccUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccUnspecified(JAXBElement<Integer> value) {
        this.outSuccUnspecified = value;
    }

    /**
     * Gets the value of the outSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutSuccUnknown() {
        return outSuccUnknown;
    }

    /**
     * Sets the value of the outSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutSuccUnknown(JAXBElement<Integer> value) {
        this.outSuccUnknown = value;
    }

    /**
     * Gets the value of the hoFailureMroWithVolteTooEarly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWithVolteTooEarly() {
        return hoFailureMroWithVolteTooEarly;
    }

    /**
     * Sets the value of the hoFailureMroWithVolteTooEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWithVolteTooEarly(JAXBElement<Integer> value) {
        this.hoFailureMroWithVolteTooEarly = value;
    }

    /**
     * Gets the value of the hoFailureMroWithVolteTooLate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWithVolteTooLate() {
        return hoFailureMroWithVolteTooLate;
    }

    /**
     * Sets the value of the hoFailureMroWithVolteTooLate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWithVolteTooLate(JAXBElement<Integer> value) {
        this.hoFailureMroWithVolteTooLate = value;
    }

    /**
     * Gets the value of the hoFailureMroWithVolteWrongCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWithVolteWrongCell() {
        return hoFailureMroWithVolteWrongCell;
    }

    /**
     * Sets the value of the hoFailureMroWithVolteWrongCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWithVolteWrongCell(JAXBElement<Integer> value) {
        this.hoFailureMroWithVolteWrongCell = value;
    }

    /**
     * Gets the value of the hoFailureMroWithVolteTooLateServCellThresholdNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWithVolteTooLateServCellThresholdNotCrossed() {
        return hoFailureMroWithVolteTooLateServCellThresholdNotCrossed;
    }

    /**
     * Sets the value of the hoFailureMroWithVolteTooLateServCellThresholdNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWithVolteTooLateServCellThresholdNotCrossed(JAXBElement<Integer> value) {
        this.hoFailureMroWithVolteTooLateServCellThresholdNotCrossed = value;
    }

    /**
     * Gets the value of the hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoFailureMroWithVolteTooLateNghCellThresholdNotCrossed() {
        return hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed;
    }

    /**
     * Sets the value of the hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoFailureMroWithVolteTooLateNghCellThresholdNotCrossed(JAXBElement<Integer> value) {
        this.hoFailureMroWithVolteTooLateNghCellThresholdNotCrossed = value;
    }

}
