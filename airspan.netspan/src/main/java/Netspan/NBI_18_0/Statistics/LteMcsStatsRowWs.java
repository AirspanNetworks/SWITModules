
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
 * <p>Java class for LteMcsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteMcsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="McsAllocIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsAllocCw1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsAllocCw2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsAlloc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsAllocCw1Hpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsAllocCw2Hpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsAllocHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw1Hpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw2Hpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw1NonHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcs256QamAllocCw2NonHpue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMcsStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "mcsAllocIndex",
    "dlMcsAllocCw1",
    "dlMcsAllocCw2",
    "ulMcsAlloc",
    "dlMcsAllocCw1Hpue",
    "dlMcsAllocCw2Hpue",
    "ulMcsAllocHpue",
    "dlMcs256QamAllocCw1",
    "dlMcs256QamAllocCw2",
    "dlMcs256QamAllocCw1Hpue",
    "dlMcs256QamAllocCw2Hpue",
    "dlMcs256QamAllocCw1NonHpue",
    "dlMcs256QamAllocCw2NonHpue"
})
public class LteMcsStatsRowWs {

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
    @XmlElementRef(name = "McsAllocIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcsAllocIndex;
    @XmlElementRef(name = "DlMcsAllocCw1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw1;
    @XmlElementRef(name = "DlMcsAllocCw2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw2;
    @XmlElementRef(name = "UlMcsAlloc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulMcsAlloc;
    @XmlElementRef(name = "DlMcsAllocCw1Hpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw1Hpue;
    @XmlElementRef(name = "DlMcsAllocCw2Hpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw2Hpue;
    @XmlElementRef(name = "UlMcsAllocHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulMcsAllocHpue;
    @XmlElementRef(name = "DlMcs256QamAllocCw1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw1;
    @XmlElementRef(name = "DlMcs256QamAllocCw2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw2;
    @XmlElementRef(name = "DlMcs256QamAllocCw1Hpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw1Hpue;
    @XmlElementRef(name = "DlMcs256QamAllocCw2Hpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw2Hpue;
    @XmlElementRef(name = "DlMcs256QamAllocCw1NonHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw1NonHpue;
    @XmlElementRef(name = "DlMcs256QamAllocCw2NonHpue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcs256QamAllocCw2NonHpue;

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
     * Gets the value of the mcsAllocIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMcsAllocIndex() {
        return mcsAllocIndex;
    }

    /**
     * Sets the value of the mcsAllocIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMcsAllocIndex(JAXBElement<Integer> value) {
        this.mcsAllocIndex = value;
    }

    /**
     * Gets the value of the dlMcsAllocCw1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcsAllocCw1() {
        return dlMcsAllocCw1;
    }

    /**
     * Sets the value of the dlMcsAllocCw1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcsAllocCw1(JAXBElement<Integer> value) {
        this.dlMcsAllocCw1 = value;
    }

    /**
     * Gets the value of the dlMcsAllocCw2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcsAllocCw2() {
        return dlMcsAllocCw2;
    }

    /**
     * Sets the value of the dlMcsAllocCw2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcsAllocCw2(JAXBElement<Integer> value) {
        this.dlMcsAllocCw2 = value;
    }

    /**
     * Gets the value of the ulMcsAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlMcsAlloc() {
        return ulMcsAlloc;
    }

    /**
     * Sets the value of the ulMcsAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlMcsAlloc(JAXBElement<Integer> value) {
        this.ulMcsAlloc = value;
    }

    /**
     * Gets the value of the dlMcsAllocCw1Hpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcsAllocCw1Hpue() {
        return dlMcsAllocCw1Hpue;
    }

    /**
     * Sets the value of the dlMcsAllocCw1Hpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcsAllocCw1Hpue(JAXBElement<Integer> value) {
        this.dlMcsAllocCw1Hpue = value;
    }

    /**
     * Gets the value of the dlMcsAllocCw2Hpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcsAllocCw2Hpue() {
        return dlMcsAllocCw2Hpue;
    }

    /**
     * Sets the value of the dlMcsAllocCw2Hpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcsAllocCw2Hpue(JAXBElement<Integer> value) {
        this.dlMcsAllocCw2Hpue = value;
    }

    /**
     * Gets the value of the ulMcsAllocHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlMcsAllocHpue() {
        return ulMcsAllocHpue;
    }

    /**
     * Sets the value of the ulMcsAllocHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlMcsAllocHpue(JAXBElement<Integer> value) {
        this.ulMcsAllocHpue = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw1() {
        return dlMcs256QamAllocCw1;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw1(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw1 = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw2() {
        return dlMcs256QamAllocCw2;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw2(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw2 = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw1Hpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw1Hpue() {
        return dlMcs256QamAllocCw1Hpue;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw1Hpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw1Hpue(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw1Hpue = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw2Hpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw2Hpue() {
        return dlMcs256QamAllocCw2Hpue;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw2Hpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw2Hpue(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw2Hpue = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw1NonHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw1NonHpue() {
        return dlMcs256QamAllocCw1NonHpue;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw1NonHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw1NonHpue(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw1NonHpue = value;
    }

    /**
     * Gets the value of the dlMcs256QamAllocCw2NonHpue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlMcs256QamAllocCw2NonHpue() {
        return dlMcs256QamAllocCw2NonHpue;
    }

    /**
     * Sets the value of the dlMcs256QamAllocCw2NonHpue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlMcs256QamAllocCw2NonHpue(JAXBElement<Integer> value) {
        this.dlMcs256QamAllocCw2NonHpue = value;
    }

}
