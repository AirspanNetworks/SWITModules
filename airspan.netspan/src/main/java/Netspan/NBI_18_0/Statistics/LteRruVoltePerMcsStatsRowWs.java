
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
 * <p>Java class for LteRruVoltePerMcsStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruVoltePerMcsStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="McsAllocIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlVolteMcsNumSuccTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlVolteMcsNumSuccTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlVolteMcsNumErrTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlVolteMcsNumErrTb" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlTotalVolteMcsNumTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlTotalVolteMcsNumTb" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlVolteMcsBlerPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlVolteMcsBlerPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRruVoltePerMcsStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "mcsAllocIndex",
    "dlVolteMcsNumSuccTb",
    "ulVolteMcsNumSuccTb",
    "dlVolteMcsNumErrTb",
    "ulVolteMcsNumErrTb",
    "dlTotalVolteMcsNumTb",
    "ulTotalVolteMcsNumTb",
    "dlVolteMcsBlerPercent",
    "ulVolteMcsBlerPercent"
})
public class LteRruVoltePerMcsStatsRowWs {

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
    @XmlElementRef(name = "DlVolteMcsNumSuccTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlVolteMcsNumSuccTb;
    @XmlElementRef(name = "UlVolteMcsNumSuccTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulVolteMcsNumSuccTb;
    @XmlElementRef(name = "DlVolteMcsNumErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlVolteMcsNumErrTb;
    @XmlElementRef(name = "UlVolteMcsNumErrTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulVolteMcsNumErrTb;
    @XmlElementRef(name = "DlTotalVolteMcsNumTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlTotalVolteMcsNumTb;
    @XmlElementRef(name = "UlTotalVolteMcsNumTb", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulTotalVolteMcsNumTb;
    @XmlElementRef(name = "DlVolteMcsBlerPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlVolteMcsBlerPercent;
    @XmlElementRef(name = "UlVolteMcsBlerPercent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulVolteMcsBlerPercent;

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
     * Gets the value of the dlVolteMcsNumSuccTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlVolteMcsNumSuccTb() {
        return dlVolteMcsNumSuccTb;
    }

    /**
     * Sets the value of the dlVolteMcsNumSuccTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlVolteMcsNumSuccTb(JAXBElement<Integer> value) {
        this.dlVolteMcsNumSuccTb = value;
    }

    /**
     * Gets the value of the ulVolteMcsNumSuccTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlVolteMcsNumSuccTb() {
        return ulVolteMcsNumSuccTb;
    }

    /**
     * Sets the value of the ulVolteMcsNumSuccTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlVolteMcsNumSuccTb(JAXBElement<Integer> value) {
        this.ulVolteMcsNumSuccTb = value;
    }

    /**
     * Gets the value of the dlVolteMcsNumErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlVolteMcsNumErrTb() {
        return dlVolteMcsNumErrTb;
    }

    /**
     * Sets the value of the dlVolteMcsNumErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlVolteMcsNumErrTb(JAXBElement<Integer> value) {
        this.dlVolteMcsNumErrTb = value;
    }

    /**
     * Gets the value of the ulVolteMcsNumErrTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlVolteMcsNumErrTb() {
        return ulVolteMcsNumErrTb;
    }

    /**
     * Sets the value of the ulVolteMcsNumErrTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlVolteMcsNumErrTb(JAXBElement<Integer> value) {
        this.ulVolteMcsNumErrTb = value;
    }

    /**
     * Gets the value of the dlTotalVolteMcsNumTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlTotalVolteMcsNumTb() {
        return dlTotalVolteMcsNumTb;
    }

    /**
     * Sets the value of the dlTotalVolteMcsNumTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlTotalVolteMcsNumTb(JAXBElement<Long> value) {
        this.dlTotalVolteMcsNumTb = value;
    }

    /**
     * Gets the value of the ulTotalVolteMcsNumTb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlTotalVolteMcsNumTb() {
        return ulTotalVolteMcsNumTb;
    }

    /**
     * Sets the value of the ulTotalVolteMcsNumTb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlTotalVolteMcsNumTb(JAXBElement<Long> value) {
        this.ulTotalVolteMcsNumTb = value;
    }

    /**
     * Gets the value of the dlVolteMcsBlerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlVolteMcsBlerPercent() {
        return dlVolteMcsBlerPercent;
    }

    /**
     * Sets the value of the dlVolteMcsBlerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlVolteMcsBlerPercent(JAXBElement<Double> value) {
        this.dlVolteMcsBlerPercent = value;
    }

    /**
     * Gets the value of the ulVolteMcsBlerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlVolteMcsBlerPercent() {
        return ulVolteMcsBlerPercent;
    }

    /**
     * Sets the value of the ulVolteMcsBlerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlVolteMcsBlerPercent(JAXBElement<Double> value) {
        this.ulVolteMcsBlerPercent = value;
    }

}
