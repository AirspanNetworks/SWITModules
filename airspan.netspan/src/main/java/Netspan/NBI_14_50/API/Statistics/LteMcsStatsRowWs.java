
package Netspan.NBI_14_50.API.Statistics;

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
 * &lt;complexType name="LteMcsStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="McsAllocIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlMcsAllocCw1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlMcsAllocCw2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlMcsAlloc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteMcsStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "mcsAllocIndex",
    "dlMcsAllocCw1",
    "dlMcsAllocCw2",
    "ulMcsAlloc"
})
public class LteMcsStatsRowWs {

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
    @XmlElementRef(name = "McsAllocIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mcsAllocIndex;
    @XmlElementRef(name = "DlMcsAllocCw1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw1;
    @XmlElementRef(name = "DlMcsAllocCw2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlMcsAllocCw2;
    @XmlElementRef(name = "UlMcsAlloc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulMcsAlloc;

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

}
