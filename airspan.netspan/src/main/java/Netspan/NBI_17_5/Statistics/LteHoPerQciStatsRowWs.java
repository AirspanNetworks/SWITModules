
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
 * <p>Java class for LteHoPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteHoPerQciStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HoInterEnbOutPrepAttToMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutPrepAttToSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccToMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccToSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInAttFromMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInAttFromSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInSuccFromMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInSuccFromSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutPrepAttToMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutPrepAttToSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccToMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbOutSuccToSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInAttFromMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInAttFromSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInSuccFromMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterEnbInSuccFromSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttDesRadReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccDesRadReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterRatOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutAttToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutAttToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutSuccToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutSuccToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutAttToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutAttToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutSuccToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutSuccToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutFailedToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoIntraFreqEcgiOutFailedToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutFailedToMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoInterFreqEcgiOutFailedToHeNB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteHoPerQciStatsRowWs", propOrder = {
    "cellNumber",
    "qciIndex",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "hoInterEnbOutPrepAttToMacroFdd",
    "hoInterEnbOutPrepAttToSmcFdd",
    "hoInterEnbOutSuccToMacroFdd",
    "hoInterEnbOutSuccToSmcFdd",
    "hoInterEnbInAttFromMacroFdd",
    "hoInterEnbInAttFromSmcFdd",
    "hoInterEnbInSuccFromMacroFdd",
    "hoInterEnbInSuccFromSmcFdd",
    "hoInterEnbOutPrepAttToMacroTdd",
    "hoInterEnbOutPrepAttToSmcTdd",
    "hoInterEnbOutSuccToMacroTdd",
    "hoInterEnbOutSuccToSmcTdd",
    "hoInterEnbInAttFromMacroTdd",
    "hoInterEnbInAttFromSmcTdd",
    "hoInterEnbInSuccFromMacroTdd",
    "hoInterEnbInSuccFromSmcTdd",
    "hoInterRatOutAttDesRadReason",
    "hoInterRatOutAttReduceLoadInSvgCell",
    "hoInterRatOutAttResOptimisation",
    "hoInterRatOutAttTimeCritical",
    "hoInterRatOutAttUnspecified",
    "hoInterRatOutAttUnknown",
    "hoInterRatOutAttSum",
    "hoInterRatOutSuccDesRadReason",
    "hoInterRatOutSuccReduceLoadInSvgCell",
    "hoInterRatOutSuccResOptimisation",
    "hoInterRatOutSuccTimeCritical",
    "hoInterRatOutSuccUnspecified",
    "hoInterRatOutSuccUnknown",
    "hoInterRatOutSuccSum",
    "hoIntraFreqEcgiOutAttToMacro",
    "hoInterFreqEcgiOutAttToMacro",
    "hoIntraFreqEcgiOutSuccToMacro",
    "hoInterFreqEcgiOutSuccToMacro",
    "hoIntraFreqEcgiOutAttToHeNB",
    "hoInterFreqEcgiOutAttToHeNB",
    "hoIntraFreqEcgiOutSuccToHeNB",
    "hoInterFreqEcgiOutSuccToHeNB",
    "hoIntraFreqEcgiOutFailedToMacro",
    "hoIntraFreqEcgiOutFailedToHeNB",
    "hoInterFreqEcgiOutFailedToMacro",
    "hoInterFreqEcgiOutFailedToHeNB"
})
public class LteHoPerQciStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElementRef(name = "QciIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qciIndex;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod")
    protected int granularityPeriod;
    @XmlElementRef(name = "HoInterEnbOutPrepAttToMacroFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutPrepAttToMacroFdd;
    @XmlElementRef(name = "HoInterEnbOutPrepAttToSmcFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutPrepAttToSmcFdd;
    @XmlElementRef(name = "HoInterEnbOutSuccToMacroFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccToMacroFdd;
    @XmlElementRef(name = "HoInterEnbOutSuccToSmcFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccToSmcFdd;
    @XmlElementRef(name = "HoInterEnbInAttFromMacroFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInAttFromMacroFdd;
    @XmlElementRef(name = "HoInterEnbInAttFromSmcFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInAttFromSmcFdd;
    @XmlElementRef(name = "HoInterEnbInSuccFromMacroFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInSuccFromMacroFdd;
    @XmlElementRef(name = "HoInterEnbInSuccFromSmcFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInSuccFromSmcFdd;
    @XmlElementRef(name = "HoInterEnbOutPrepAttToMacroTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutPrepAttToMacroTdd;
    @XmlElementRef(name = "HoInterEnbOutPrepAttToSmcTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutPrepAttToSmcTdd;
    @XmlElementRef(name = "HoInterEnbOutSuccToMacroTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccToMacroTdd;
    @XmlElementRef(name = "HoInterEnbOutSuccToSmcTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutSuccToSmcTdd;
    @XmlElementRef(name = "HoInterEnbInAttFromMacroTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInAttFromMacroTdd;
    @XmlElementRef(name = "HoInterEnbInAttFromSmcTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInAttFromSmcTdd;
    @XmlElementRef(name = "HoInterEnbInSuccFromMacroTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInSuccFromMacroTdd;
    @XmlElementRef(name = "HoInterEnbInSuccFromSmcTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbInSuccFromSmcTdd;
    @XmlElementRef(name = "HoInterRatOutAttDesRadReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttDesRadReason;
    @XmlElementRef(name = "HoInterRatOutAttReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttReduceLoadInSvgCell;
    @XmlElementRef(name = "HoInterRatOutAttResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttResOptimisation;
    @XmlElementRef(name = "HoInterRatOutAttTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttTimeCritical;
    @XmlElementRef(name = "HoInterRatOutAttUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttUnspecified;
    @XmlElementRef(name = "HoInterRatOutAttUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttUnknown;
    @XmlElementRef(name = "HoInterRatOutAttSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutAttSum;
    @XmlElementRef(name = "HoInterRatOutSuccDesRadReason", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccDesRadReason;
    @XmlElementRef(name = "HoInterRatOutSuccReduceLoadInSvgCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccReduceLoadInSvgCell;
    @XmlElementRef(name = "HoInterRatOutSuccResOptimisation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccResOptimisation;
    @XmlElementRef(name = "HoInterRatOutSuccTimeCritical", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccTimeCritical;
    @XmlElementRef(name = "HoInterRatOutSuccUnspecified", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccUnspecified;
    @XmlElementRef(name = "HoInterRatOutSuccUnknown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccUnknown;
    @XmlElementRef(name = "HoInterRatOutSuccSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterRatOutSuccSum;
    @XmlElementRef(name = "HoIntraFreqEcgiOutAttToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutAttToMacro;
    @XmlElementRef(name = "HoInterFreqEcgiOutAttToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutAttToMacro;
    @XmlElementRef(name = "HoIntraFreqEcgiOutSuccToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutSuccToMacro;
    @XmlElementRef(name = "HoInterFreqEcgiOutSuccToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutSuccToMacro;
    @XmlElementRef(name = "HoIntraFreqEcgiOutAttToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutAttToHeNB;
    @XmlElementRef(name = "HoInterFreqEcgiOutAttToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutAttToHeNB;
    @XmlElementRef(name = "HoIntraFreqEcgiOutSuccToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutSuccToHeNB;
    @XmlElementRef(name = "HoInterFreqEcgiOutSuccToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutSuccToHeNB;
    @XmlElementRef(name = "HoIntraFreqEcgiOutFailedToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutFailedToMacro;
    @XmlElementRef(name = "HoIntraFreqEcgiOutFailedToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoIntraFreqEcgiOutFailedToHeNB;
    @XmlElementRef(name = "HoInterFreqEcgiOutFailedToMacro", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutFailedToMacro;
    @XmlElementRef(name = "HoInterFreqEcgiOutFailedToHeNB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterFreqEcgiOutFailedToHeNB;

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
     * Gets the value of the qciIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQciIndex() {
        return qciIndex;
    }

    /**
     * Sets the value of the qciIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQciIndex(JAXBElement<Integer> value) {
        this.qciIndex = value;
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
     */
    public int getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     */
    public void setGranularityPeriod(int value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the hoInterEnbOutPrepAttToMacroFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutPrepAttToMacroFdd() {
        return hoInterEnbOutPrepAttToMacroFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutPrepAttToMacroFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutPrepAttToMacroFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutPrepAttToMacroFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutPrepAttToSmcFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutPrepAttToSmcFdd() {
        return hoInterEnbOutPrepAttToSmcFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutPrepAttToSmcFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutPrepAttToSmcFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutPrepAttToSmcFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccToMacroFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccToMacroFdd() {
        return hoInterEnbOutSuccToMacroFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccToMacroFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccToMacroFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccToMacroFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccToSmcFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccToSmcFdd() {
        return hoInterEnbOutSuccToSmcFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccToSmcFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccToSmcFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccToSmcFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInAttFromMacroFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInAttFromMacroFdd() {
        return hoInterEnbInAttFromMacroFdd;
    }

    /**
     * Sets the value of the hoInterEnbInAttFromMacroFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInAttFromMacroFdd(JAXBElement<Integer> value) {
        this.hoInterEnbInAttFromMacroFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInAttFromSmcFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInAttFromSmcFdd() {
        return hoInterEnbInAttFromSmcFdd;
    }

    /**
     * Sets the value of the hoInterEnbInAttFromSmcFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInAttFromSmcFdd(JAXBElement<Integer> value) {
        this.hoInterEnbInAttFromSmcFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInSuccFromMacroFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInSuccFromMacroFdd() {
        return hoInterEnbInSuccFromMacroFdd;
    }

    /**
     * Sets the value of the hoInterEnbInSuccFromMacroFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInSuccFromMacroFdd(JAXBElement<Integer> value) {
        this.hoInterEnbInSuccFromMacroFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInSuccFromSmcFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInSuccFromSmcFdd() {
        return hoInterEnbInSuccFromSmcFdd;
    }

    /**
     * Sets the value of the hoInterEnbInSuccFromSmcFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInSuccFromSmcFdd(JAXBElement<Integer> value) {
        this.hoInterEnbInSuccFromSmcFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutPrepAttToMacroTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutPrepAttToMacroTdd() {
        return hoInterEnbOutPrepAttToMacroTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutPrepAttToMacroTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutPrepAttToMacroTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutPrepAttToMacroTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutPrepAttToSmcTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutPrepAttToSmcTdd() {
        return hoInterEnbOutPrepAttToSmcTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutPrepAttToSmcTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutPrepAttToSmcTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutPrepAttToSmcTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccToMacroTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccToMacroTdd() {
        return hoInterEnbOutSuccToMacroTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccToMacroTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccToMacroTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccToMacroTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutSuccToSmcTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutSuccToSmcTdd() {
        return hoInterEnbOutSuccToSmcTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutSuccToSmcTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutSuccToSmcTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutSuccToSmcTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInAttFromMacroTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInAttFromMacroTdd() {
        return hoInterEnbInAttFromMacroTdd;
    }

    /**
     * Sets the value of the hoInterEnbInAttFromMacroTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInAttFromMacroTdd(JAXBElement<Integer> value) {
        this.hoInterEnbInAttFromMacroTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInAttFromSmcTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInAttFromSmcTdd() {
        return hoInterEnbInAttFromSmcTdd;
    }

    /**
     * Sets the value of the hoInterEnbInAttFromSmcTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInAttFromSmcTdd(JAXBElement<Integer> value) {
        this.hoInterEnbInAttFromSmcTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInSuccFromMacroTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInSuccFromMacroTdd() {
        return hoInterEnbInSuccFromMacroTdd;
    }

    /**
     * Sets the value of the hoInterEnbInSuccFromMacroTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInSuccFromMacroTdd(JAXBElement<Integer> value) {
        this.hoInterEnbInSuccFromMacroTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbInSuccFromSmcTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbInSuccFromSmcTdd() {
        return hoInterEnbInSuccFromSmcTdd;
    }

    /**
     * Sets the value of the hoInterEnbInSuccFromSmcTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbInSuccFromSmcTdd(JAXBElement<Integer> value) {
        this.hoInterEnbInSuccFromSmcTdd = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttDesRadReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttDesRadReason() {
        return hoInterRatOutAttDesRadReason;
    }

    /**
     * Sets the value of the hoInterRatOutAttDesRadReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttDesRadReason(JAXBElement<Integer> value) {
        this.hoInterRatOutAttDesRadReason = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttReduceLoadInSvgCell() {
        return hoInterRatOutAttReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the hoInterRatOutAttReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.hoInterRatOutAttReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttResOptimisation() {
        return hoInterRatOutAttResOptimisation;
    }

    /**
     * Sets the value of the hoInterRatOutAttResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttResOptimisation(JAXBElement<Integer> value) {
        this.hoInterRatOutAttResOptimisation = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttTimeCritical() {
        return hoInterRatOutAttTimeCritical;
    }

    /**
     * Sets the value of the hoInterRatOutAttTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttTimeCritical(JAXBElement<Integer> value) {
        this.hoInterRatOutAttTimeCritical = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttUnspecified() {
        return hoInterRatOutAttUnspecified;
    }

    /**
     * Sets the value of the hoInterRatOutAttUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttUnspecified(JAXBElement<Integer> value) {
        this.hoInterRatOutAttUnspecified = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttUnknown() {
        return hoInterRatOutAttUnknown;
    }

    /**
     * Sets the value of the hoInterRatOutAttUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttUnknown(JAXBElement<Integer> value) {
        this.hoInterRatOutAttUnknown = value;
    }

    /**
     * Gets the value of the hoInterRatOutAttSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutAttSum() {
        return hoInterRatOutAttSum;
    }

    /**
     * Sets the value of the hoInterRatOutAttSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutAttSum(JAXBElement<Integer> value) {
        this.hoInterRatOutAttSum = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccDesRadReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccDesRadReason() {
        return hoInterRatOutSuccDesRadReason;
    }

    /**
     * Sets the value of the hoInterRatOutSuccDesRadReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccDesRadReason(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccDesRadReason = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccReduceLoadInSvgCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccReduceLoadInSvgCell() {
        return hoInterRatOutSuccReduceLoadInSvgCell;
    }

    /**
     * Sets the value of the hoInterRatOutSuccReduceLoadInSvgCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccReduceLoadInSvgCell(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccReduceLoadInSvgCell = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccResOptimisation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccResOptimisation() {
        return hoInterRatOutSuccResOptimisation;
    }

    /**
     * Sets the value of the hoInterRatOutSuccResOptimisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccResOptimisation(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccResOptimisation = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccTimeCritical property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccTimeCritical() {
        return hoInterRatOutSuccTimeCritical;
    }

    /**
     * Sets the value of the hoInterRatOutSuccTimeCritical property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccTimeCritical(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccTimeCritical = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccUnspecified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccUnspecified() {
        return hoInterRatOutSuccUnspecified;
    }

    /**
     * Sets the value of the hoInterRatOutSuccUnspecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccUnspecified(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccUnspecified = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccUnknown() {
        return hoInterRatOutSuccUnknown;
    }

    /**
     * Sets the value of the hoInterRatOutSuccUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccUnknown(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccUnknown = value;
    }

    /**
     * Gets the value of the hoInterRatOutSuccSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterRatOutSuccSum() {
        return hoInterRatOutSuccSum;
    }

    /**
     * Sets the value of the hoInterRatOutSuccSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterRatOutSuccSum(JAXBElement<Integer> value) {
        this.hoInterRatOutSuccSum = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutAttToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutAttToMacro() {
        return hoIntraFreqEcgiOutAttToMacro;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutAttToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutAttToMacro(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutAttToMacro = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutAttToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutAttToMacro() {
        return hoInterFreqEcgiOutAttToMacro;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutAttToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutAttToMacro(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutAttToMacro = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutSuccToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutSuccToMacro() {
        return hoIntraFreqEcgiOutSuccToMacro;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutSuccToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutSuccToMacro(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutSuccToMacro = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutSuccToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutSuccToMacro() {
        return hoInterFreqEcgiOutSuccToMacro;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutSuccToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutSuccToMacro(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutSuccToMacro = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutAttToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutAttToHeNB() {
        return hoIntraFreqEcgiOutAttToHeNB;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutAttToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutAttToHeNB(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutAttToHeNB = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutAttToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutAttToHeNB() {
        return hoInterFreqEcgiOutAttToHeNB;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutAttToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutAttToHeNB(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutAttToHeNB = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutSuccToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutSuccToHeNB() {
        return hoIntraFreqEcgiOutSuccToHeNB;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutSuccToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutSuccToHeNB(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutSuccToHeNB = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutSuccToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutSuccToHeNB() {
        return hoInterFreqEcgiOutSuccToHeNB;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutSuccToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutSuccToHeNB(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutSuccToHeNB = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutFailedToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutFailedToMacro() {
        return hoIntraFreqEcgiOutFailedToMacro;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutFailedToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutFailedToMacro(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutFailedToMacro = value;
    }

    /**
     * Gets the value of the hoIntraFreqEcgiOutFailedToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoIntraFreqEcgiOutFailedToHeNB() {
        return hoIntraFreqEcgiOutFailedToHeNB;
    }

    /**
     * Sets the value of the hoIntraFreqEcgiOutFailedToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoIntraFreqEcgiOutFailedToHeNB(JAXBElement<Integer> value) {
        this.hoIntraFreqEcgiOutFailedToHeNB = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutFailedToMacro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutFailedToMacro() {
        return hoInterFreqEcgiOutFailedToMacro;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutFailedToMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutFailedToMacro(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutFailedToMacro = value;
    }

    /**
     * Gets the value of the hoInterFreqEcgiOutFailedToHeNB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterFreqEcgiOutFailedToHeNB() {
        return hoInterFreqEcgiOutFailedToHeNB;
    }

    /**
     * Sets the value of the hoInterFreqEcgiOutFailedToHeNB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterFreqEcgiOutFailedToHeNB(JAXBElement<Integer> value) {
        this.hoInterFreqEcgiOutFailedToHeNB = value;
    }

}
