
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
 * <p>Java class for LteRruPerMcsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruPerMcsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="McsAllocIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsNumSuccTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsNumErrTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsNumMaxErrTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsTotalTB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlMcsBler" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsNumSuccTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsNumErrTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsNumMaxErrTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsTotalTB" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlMcsBler" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Dl256QamSuccTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Dl256QamErrTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Dl256QamMcsMaxReTxTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Dl256QamTotalTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Dl256QamBler" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRruPerMcsStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "mcsAllocIndex",
    "dlMcsNumSuccTb",
    "dlMcsNumErrTb",
    "dlMcsNumMaxErrTb",
    "dlMcsTotalTB",
    "dlMcsBler",
    "ulMcsNumSuccTb",
    "ulMcsNumErrTb",
    "ulMcsNumMaxErrTb",
    "ulMcsTotalTB",
    "ulMcsBler",
    "dl256QamSuccTb",
    "dl256QamErrTb",
    "dl256QamMcsMaxReTxTb",
    "dl256QamTotalTb",
    "dl256QamBler"
})
public class LteRruPerMcsStatsRowWs {

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
    @XmlElementRef(name = "DlMcsNumSuccTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlMcsNumSuccTb;
    @XmlElementRef(name = "DlMcsNumErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlMcsNumErrTb;
    @XmlElementRef(name = "DlMcsNumMaxErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlMcsNumMaxErrTb;
    @XmlElementRef(name = "DlMcsTotalTB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlMcsTotalTB;
    @XmlElementRef(name = "DlMcsBler", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMcsBler;
    @XmlElementRef(name = "UlMcsNumSuccTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulMcsNumSuccTb;
    @XmlElementRef(name = "UlMcsNumErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulMcsNumErrTb;
    @XmlElementRef(name = "UlMcsNumMaxErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulMcsNumMaxErrTb;
    @XmlElementRef(name = "UlMcsTotalTB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulMcsTotalTB;
    @XmlElementRef(name = "UlMcsBler", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMcsBler;
    @XmlElementRef(name = "Dl256QamSuccTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dl256QamSuccTb;
    @XmlElementRef(name = "Dl256QamErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dl256QamErrTb;
    @XmlElementRef(name = "Dl256QamMcsMaxReTxTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dl256QamMcsMaxReTxTb;
    @XmlElementRef(name = "Dl256QamTotalTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dl256QamTotalTb;
    @XmlElementRef(name = "Dl256QamBler", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dl256QamBler;

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
     * Gets the value of the dlMcsNumSuccTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlMcsNumSuccTb() {
        return dlMcsNumSuccTb;
    }

    /**
     * Sets the value of the dlMcsNumSuccTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlMcsNumSuccTb(JAXBElement<Long> value) {
        this.dlMcsNumSuccTb = value;
    }

    /**
     * Gets the value of the dlMcsNumErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlMcsNumErrTb() {
        return dlMcsNumErrTb;
    }

    /**
     * Sets the value of the dlMcsNumErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlMcsNumErrTb(JAXBElement<Long> value) {
        this.dlMcsNumErrTb = value;
    }

    /**
     * Gets the value of the dlMcsNumMaxErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlMcsNumMaxErrTb() {
        return dlMcsNumMaxErrTb;
    }

    /**
     * Sets the value of the dlMcsNumMaxErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlMcsNumMaxErrTb(JAXBElement<Long> value) {
        this.dlMcsNumMaxErrTb = value;
    }

    /**
     * Gets the value of the dlMcsTotalTB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlMcsTotalTB() {
        return dlMcsTotalTB;
    }

    /**
     * Sets the value of the dlMcsTotalTB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlMcsTotalTB(JAXBElement<Long> value) {
        this.dlMcsTotalTB = value;
    }

    /**
     * Gets the value of the dlMcsBler property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMcsBler() {
        return dlMcsBler;
    }

    /**
     * Sets the value of the dlMcsBler property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMcsBler(JAXBElement<Double> value) {
        this.dlMcsBler = value;
    }

    /**
     * Gets the value of the ulMcsNumSuccTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlMcsNumSuccTb() {
        return ulMcsNumSuccTb;
    }

    /**
     * Sets the value of the ulMcsNumSuccTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlMcsNumSuccTb(JAXBElement<Long> value) {
        this.ulMcsNumSuccTb = value;
    }

    /**
     * Gets the value of the ulMcsNumErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlMcsNumErrTb() {
        return ulMcsNumErrTb;
    }

    /**
     * Sets the value of the ulMcsNumErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlMcsNumErrTb(JAXBElement<Long> value) {
        this.ulMcsNumErrTb = value;
    }

    /**
     * Gets the value of the ulMcsNumMaxErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlMcsNumMaxErrTb() {
        return ulMcsNumMaxErrTb;
    }

    /**
     * Sets the value of the ulMcsNumMaxErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlMcsNumMaxErrTb(JAXBElement<Long> value) {
        this.ulMcsNumMaxErrTb = value;
    }

    /**
     * Gets the value of the ulMcsTotalTB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlMcsTotalTB() {
        return ulMcsTotalTB;
    }

    /**
     * Sets the value of the ulMcsTotalTB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlMcsTotalTB(JAXBElement<Long> value) {
        this.ulMcsTotalTB = value;
    }

    /**
     * Gets the value of the ulMcsBler property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMcsBler() {
        return ulMcsBler;
    }

    /**
     * Sets the value of the ulMcsBler property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMcsBler(JAXBElement<Double> value) {
        this.ulMcsBler = value;
    }

    /**
     * Gets the value of the dl256QamSuccTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDl256QamSuccTb() {
        return dl256QamSuccTb;
    }

    /**
     * Sets the value of the dl256QamSuccTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDl256QamSuccTb(JAXBElement<Integer> value) {
        this.dl256QamSuccTb = value;
    }

    /**
     * Gets the value of the dl256QamErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDl256QamErrTb() {
        return dl256QamErrTb;
    }

    /**
     * Sets the value of the dl256QamErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDl256QamErrTb(JAXBElement<Integer> value) {
        this.dl256QamErrTb = value;
    }

    /**
     * Gets the value of the dl256QamMcsMaxReTxTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDl256QamMcsMaxReTxTb() {
        return dl256QamMcsMaxReTxTb;
    }

    /**
     * Sets the value of the dl256QamMcsMaxReTxTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDl256QamMcsMaxReTxTb(JAXBElement<Integer> value) {
        this.dl256QamMcsMaxReTxTb = value;
    }

    /**
     * Gets the value of the dl256QamTotalTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDl256QamTotalTb() {
        return dl256QamTotalTb;
    }

    /**
     * Sets the value of the dl256QamTotalTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDl256QamTotalTb(JAXBElement<Long> value) {
        this.dl256QamTotalTb = value;
    }

    /**
     * Gets the value of the dl256QamBler property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDl256QamBler() {
        return dl256QamBler;
    }

    /**
     * Sets the value of the dl256QamBler property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDl256QamBler(JAXBElement<Double> value) {
        this.dl256QamBler = value;
    }

}
