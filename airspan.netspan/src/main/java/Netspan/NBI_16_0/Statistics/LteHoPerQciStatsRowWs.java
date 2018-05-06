
package Netspan.NBI_16_0.Statistics;

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
 * &lt;complexType name="LteHoPerQciStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HoInterEnbOutAttToMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutAttToSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutSuccToMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutSuccToSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInAttFromMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInAttFromSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInSuccFromMacroFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInSuccFromSmcFdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutAttToMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutAttToSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutSuccToMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbOutSuccToSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInAttFromMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInAttFromSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInSuccFromMacroTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterEnbInSuccFromSmcTdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttDesRadReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutAttSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccDesRadReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccReduceLoadInSvgCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccResOptimisation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccTimeCritical" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccUnspecified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccUnknown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoInterRatOutSuccSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteHoPerQciStatsRowWs", propOrder = {
    "cellId",
    "qciIndex",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "hoInterEnbOutAttToMacroFdd",
    "hoInterEnbOutAttToSmcFdd",
    "hoInterEnbOutSuccToMacroFdd",
    "hoInterEnbOutSuccToSmcFdd",
    "hoInterEnbInAttFromMacroFdd",
    "hoInterEnbInAttFromSmcFdd",
    "hoInterEnbInSuccFromMacroFdd",
    "hoInterEnbInSuccFromSmcFdd",
    "hoInterEnbOutAttToMacroTdd",
    "hoInterEnbOutAttToSmcTdd",
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
    "hoInterRatOutSuccSum"
})
public class LteHoPerQciStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
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
    @XmlElementRef(name = "HoInterEnbOutAttToMacroFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttToMacroFdd;
    @XmlElementRef(name = "HoInterEnbOutAttToSmcFdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttToSmcFdd;
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
    @XmlElementRef(name = "HoInterEnbOutAttToMacroTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttToMacroTdd;
    @XmlElementRef(name = "HoInterEnbOutAttToSmcTdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoInterEnbOutAttToSmcTdd;
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
     * Gets the value of the hoInterEnbOutAttToMacroFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttToMacroFdd() {
        return hoInterEnbOutAttToMacroFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutAttToMacroFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttToMacroFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttToMacroFdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttToSmcFdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttToSmcFdd() {
        return hoInterEnbOutAttToSmcFdd;
    }

    /**
     * Sets the value of the hoInterEnbOutAttToSmcFdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttToSmcFdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttToSmcFdd = value;
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
     * Gets the value of the hoInterEnbOutAttToMacroTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttToMacroTdd() {
        return hoInterEnbOutAttToMacroTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutAttToMacroTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttToMacroTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttToMacroTdd = value;
    }

    /**
     * Gets the value of the hoInterEnbOutAttToSmcTdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoInterEnbOutAttToSmcTdd() {
        return hoInterEnbOutAttToSmcTdd;
    }

    /**
     * Sets the value of the hoInterEnbOutAttToSmcTdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoInterEnbOutAttToSmcTdd(JAXBElement<Integer> value) {
        this.hoInterEnbOutAttToSmcTdd = value;
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

}
