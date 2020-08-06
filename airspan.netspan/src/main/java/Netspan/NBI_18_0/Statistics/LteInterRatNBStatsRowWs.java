
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
 * <p>Java class for LteInterRatNBStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteInterRatNBStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnrUtranAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterRatNmsUtranAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterRatAnrUtranDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterRatNmsUtranDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqAnrNeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqX2NeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqNmsNeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqAnrNeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqX2NeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqNmsNeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqAnrNeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqX2NeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqNmsNeighAdd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqAnrNeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqX2NeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InterFreqNmsNeighDel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteInterRatNBStatsRowWs", propOrder = {
    "cellNumber",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "interRatAnrUtranAdd",
    "interRatNmsUtranAdd",
    "interRatAnrUtranDel",
    "interRatNmsUtranDel",
    "intraFreqAnrNeighAdd",
    "intraFreqX2NeighAdd",
    "intraFreqNmsNeighAdd",
    "intraFreqAnrNeighDel",
    "intraFreqX2NeighDel",
    "intraFreqNmsNeighDel",
    "interFreqAnrNeighAdd",
    "interFreqX2NeighAdd",
    "interFreqNmsNeighAdd",
    "interFreqAnrNeighDel",
    "interFreqX2NeighDel",
    "interFreqNmsNeighDel"
})
public class LteInterRatNBStatsRowWs {

    @XmlElement(name = "CellNumber")
    protected int cellNumber;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "InterRatAnrUtranAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interRatAnrUtranAdd;
    @XmlElementRef(name = "InterRatNmsUtranAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interRatNmsUtranAdd;
    @XmlElementRef(name = "InterRatAnrUtranDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interRatAnrUtranDel;
    @XmlElementRef(name = "InterRatNmsUtranDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interRatNmsUtranDel;
    @XmlElementRef(name = "IntraFreqAnrNeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqAnrNeighAdd;
    @XmlElementRef(name = "IntraFreqX2NeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqX2NeighAdd;
    @XmlElementRef(name = "IntraFreqNmsNeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqNmsNeighAdd;
    @XmlElementRef(name = "IntraFreqAnrNeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqAnrNeighDel;
    @XmlElementRef(name = "IntraFreqX2NeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqX2NeighDel;
    @XmlElementRef(name = "IntraFreqNmsNeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqNmsNeighDel;
    @XmlElementRef(name = "InterFreqAnrNeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqAnrNeighAdd;
    @XmlElementRef(name = "InterFreqX2NeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqX2NeighAdd;
    @XmlElementRef(name = "InterFreqNmsNeighAdd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqNmsNeighAdd;
    @XmlElementRef(name = "InterFreqAnrNeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqAnrNeighDel;
    @XmlElementRef(name = "InterFreqX2NeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqX2NeighDel;
    @XmlElementRef(name = "InterFreqNmsNeighDel", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> interFreqNmsNeighDel;

    /**
     * Gets the value of the cellNumber property.
     * 
     */
    public int getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     */
    public void setCellNumber(int value) {
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
     * Gets the value of the interRatAnrUtranAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterRatAnrUtranAdd() {
        return interRatAnrUtranAdd;
    }

    /**
     * Sets the value of the interRatAnrUtranAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterRatAnrUtranAdd(JAXBElement<Integer> value) {
        this.interRatAnrUtranAdd = value;
    }

    /**
     * Gets the value of the interRatNmsUtranAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterRatNmsUtranAdd() {
        return interRatNmsUtranAdd;
    }

    /**
     * Sets the value of the interRatNmsUtranAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterRatNmsUtranAdd(JAXBElement<Integer> value) {
        this.interRatNmsUtranAdd = value;
    }

    /**
     * Gets the value of the interRatAnrUtranDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterRatAnrUtranDel() {
        return interRatAnrUtranDel;
    }

    /**
     * Sets the value of the interRatAnrUtranDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterRatAnrUtranDel(JAXBElement<Integer> value) {
        this.interRatAnrUtranDel = value;
    }

    /**
     * Gets the value of the interRatNmsUtranDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterRatNmsUtranDel() {
        return interRatNmsUtranDel;
    }

    /**
     * Sets the value of the interRatNmsUtranDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterRatNmsUtranDel(JAXBElement<Integer> value) {
        this.interRatNmsUtranDel = value;
    }

    /**
     * Gets the value of the intraFreqAnrNeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqAnrNeighAdd() {
        return intraFreqAnrNeighAdd;
    }

    /**
     * Sets the value of the intraFreqAnrNeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqAnrNeighAdd(JAXBElement<Integer> value) {
        this.intraFreqAnrNeighAdd = value;
    }

    /**
     * Gets the value of the intraFreqX2NeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqX2NeighAdd() {
        return intraFreqX2NeighAdd;
    }

    /**
     * Sets the value of the intraFreqX2NeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqX2NeighAdd(JAXBElement<Integer> value) {
        this.intraFreqX2NeighAdd = value;
    }

    /**
     * Gets the value of the intraFreqNmsNeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqNmsNeighAdd() {
        return intraFreqNmsNeighAdd;
    }

    /**
     * Sets the value of the intraFreqNmsNeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqNmsNeighAdd(JAXBElement<Integer> value) {
        this.intraFreqNmsNeighAdd = value;
    }

    /**
     * Gets the value of the intraFreqAnrNeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqAnrNeighDel() {
        return intraFreqAnrNeighDel;
    }

    /**
     * Sets the value of the intraFreqAnrNeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqAnrNeighDel(JAXBElement<Integer> value) {
        this.intraFreqAnrNeighDel = value;
    }

    /**
     * Gets the value of the intraFreqX2NeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqX2NeighDel() {
        return intraFreqX2NeighDel;
    }

    /**
     * Sets the value of the intraFreqX2NeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqX2NeighDel(JAXBElement<Integer> value) {
        this.intraFreqX2NeighDel = value;
    }

    /**
     * Gets the value of the intraFreqNmsNeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqNmsNeighDel() {
        return intraFreqNmsNeighDel;
    }

    /**
     * Sets the value of the intraFreqNmsNeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqNmsNeighDel(JAXBElement<Integer> value) {
        this.intraFreqNmsNeighDel = value;
    }

    /**
     * Gets the value of the interFreqAnrNeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqAnrNeighAdd() {
        return interFreqAnrNeighAdd;
    }

    /**
     * Sets the value of the interFreqAnrNeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqAnrNeighAdd(JAXBElement<Integer> value) {
        this.interFreqAnrNeighAdd = value;
    }

    /**
     * Gets the value of the interFreqX2NeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqX2NeighAdd() {
        return interFreqX2NeighAdd;
    }

    /**
     * Sets the value of the interFreqX2NeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqX2NeighAdd(JAXBElement<Integer> value) {
        this.interFreqX2NeighAdd = value;
    }

    /**
     * Gets the value of the interFreqNmsNeighAdd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqNmsNeighAdd() {
        return interFreqNmsNeighAdd;
    }

    /**
     * Sets the value of the interFreqNmsNeighAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqNmsNeighAdd(JAXBElement<Integer> value) {
        this.interFreqNmsNeighAdd = value;
    }

    /**
     * Gets the value of the interFreqAnrNeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqAnrNeighDel() {
        return interFreqAnrNeighDel;
    }

    /**
     * Sets the value of the interFreqAnrNeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqAnrNeighDel(JAXBElement<Integer> value) {
        this.interFreqAnrNeighDel = value;
    }

    /**
     * Gets the value of the interFreqX2NeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqX2NeighDel() {
        return interFreqX2NeighDel;
    }

    /**
     * Sets the value of the interFreqX2NeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqX2NeighDel(JAXBElement<Integer> value) {
        this.interFreqX2NeighDel = value;
    }

    /**
     * Gets the value of the interFreqNmsNeighDel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInterFreqNmsNeighDel() {
        return interFreqNmsNeighDel;
    }

    /**
     * Sets the value of the interFreqNmsNeighDel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInterFreqNmsNeighDel(JAXBElement<Integer> value) {
        this.interFreqNmsNeighDel = value;
    }

}
