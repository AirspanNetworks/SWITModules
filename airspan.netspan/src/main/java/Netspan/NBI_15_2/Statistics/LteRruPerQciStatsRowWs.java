
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
 * <p>Java class for LteRruPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruPerQciStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlPrbUsageForTraffic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlPrbUsageForTraffic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlMacTrafficKbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMacTrafficKbps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMacTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlMacTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlEffMacTrafficKbPerTti" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlEffMacTrafficKbPerTti" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlActiveTti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlActiveTti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CaThpTimeDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaThpVolDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaThpTimeUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CaThpVolUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRruPerQciStatsRowWs", propOrder = {
    "cellId",
    "qciIndex",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "dlPrbUsageForTraffic",
    "ulPrbUsageForTraffic",
    "dlMacTrafficKbps",
    "ulMacTrafficKbps",
    "dlMacTrafficBytes",
    "ulMacTrafficBytes",
    "dlEffMacTrafficKbPerTti",
    "ulEffMacTrafficKbPerTti",
    "dlActiveTti",
    "ulActiveTti",
    "caThpTimeDl",
    "caThpVolDl",
    "caThpTimeUl",
    "caThpVolUl"
})
public class LteRruPerQciStatsRowWs {

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
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "DlPrbUsageForTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlPrbUsageForTraffic;
    @XmlElementRef(name = "UlPrbUsageForTraffic", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulPrbUsageForTraffic;
    @XmlElementRef(name = "DlMacTrafficKbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMacTrafficKbps;
    @XmlElementRef(name = "UlMacTrafficKbps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMacTrafficKbps;
    @XmlElementRef(name = "DlMacTrafficBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlMacTrafficBytes;
    @XmlElementRef(name = "UlMacTrafficBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulMacTrafficBytes;
    @XmlElementRef(name = "DlEffMacTrafficKbPerTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlEffMacTrafficKbPerTti;
    @XmlElementRef(name = "UlEffMacTrafficKbPerTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulEffMacTrafficKbPerTti;
    @XmlElementRef(name = "DlActiveTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlActiveTti;
    @XmlElementRef(name = "UlActiveTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulActiveTti;
    @XmlElementRef(name = "CaThpTimeDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caThpTimeDl;
    @XmlElementRef(name = "CaThpVolDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caThpVolDl;
    @XmlElementRef(name = "CaThpTimeUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caThpTimeUl;
    @XmlElementRef(name = "CaThpVolUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> caThpVolUl;

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
     * Gets the value of the dlPrbUsageForTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlPrbUsageForTraffic() {
        return dlPrbUsageForTraffic;
    }

    /**
     * Sets the value of the dlPrbUsageForTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlPrbUsageForTraffic(JAXBElement<Integer> value) {
        this.dlPrbUsageForTraffic = value;
    }

    /**
     * Gets the value of the ulPrbUsageForTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlPrbUsageForTraffic() {
        return ulPrbUsageForTraffic;
    }

    /**
     * Sets the value of the ulPrbUsageForTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlPrbUsageForTraffic(JAXBElement<Integer> value) {
        this.ulPrbUsageForTraffic = value;
    }

    /**
     * Gets the value of the dlMacTrafficKbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMacTrafficKbps() {
        return dlMacTrafficKbps;
    }

    /**
     * Sets the value of the dlMacTrafficKbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMacTrafficKbps(JAXBElement<Double> value) {
        this.dlMacTrafficKbps = value;
    }

    /**
     * Gets the value of the ulMacTrafficKbps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMacTrafficKbps() {
        return ulMacTrafficKbps;
    }

    /**
     * Sets the value of the ulMacTrafficKbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMacTrafficKbps(JAXBElement<Double> value) {
        this.ulMacTrafficKbps = value;
    }

    /**
     * Gets the value of the dlMacTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlMacTrafficBytes() {
        return dlMacTrafficBytes;
    }

    /**
     * Sets the value of the dlMacTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlMacTrafficBytes(JAXBElement<Long> value) {
        this.dlMacTrafficBytes = value;
    }

    /**
     * Gets the value of the ulMacTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlMacTrafficBytes() {
        return ulMacTrafficBytes;
    }

    /**
     * Sets the value of the ulMacTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlMacTrafficBytes(JAXBElement<Long> value) {
        this.ulMacTrafficBytes = value;
    }

    /**
     * Gets the value of the dlEffMacTrafficKbPerTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlEffMacTrafficKbPerTti() {
        return dlEffMacTrafficKbPerTti;
    }

    /**
     * Sets the value of the dlEffMacTrafficKbPerTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlEffMacTrafficKbPerTti(JAXBElement<Double> value) {
        this.dlEffMacTrafficKbPerTti = value;
    }

    /**
     * Gets the value of the ulEffMacTrafficKbPerTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlEffMacTrafficKbPerTti() {
        return ulEffMacTrafficKbPerTti;
    }

    /**
     * Sets the value of the ulEffMacTrafficKbPerTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlEffMacTrafficKbPerTti(JAXBElement<Double> value) {
        this.ulEffMacTrafficKbPerTti = value;
    }

    /**
     * Gets the value of the dlActiveTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlActiveTti() {
        return dlActiveTti;
    }

    /**
     * Sets the value of the dlActiveTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlActiveTti(JAXBElement<Integer> value) {
        this.dlActiveTti = value;
    }

    /**
     * Gets the value of the ulActiveTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlActiveTti() {
        return ulActiveTti;
    }

    /**
     * Sets the value of the ulActiveTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlActiveTti(JAXBElement<Integer> value) {
        this.ulActiveTti = value;
    }

    /**
     * Gets the value of the caThpTimeDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaThpTimeDl() {
        return caThpTimeDl;
    }

    /**
     * Sets the value of the caThpTimeDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaThpTimeDl(JAXBElement<Long> value) {
        this.caThpTimeDl = value;
    }

    /**
     * Gets the value of the caThpVolDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaThpVolDl() {
        return caThpVolDl;
    }

    /**
     * Sets the value of the caThpVolDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaThpVolDl(JAXBElement<Long> value) {
        this.caThpVolDl = value;
    }

    /**
     * Gets the value of the caThpTimeUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaThpTimeUl() {
        return caThpTimeUl;
    }

    /**
     * Sets the value of the caThpTimeUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaThpTimeUl(JAXBElement<Long> value) {
        this.caThpTimeUl = value;
    }

    /**
     * Gets the value of the caThpVolUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCaThpVolUl() {
        return caThpVolUl;
    }

    /**
     * Sets the value of the caThpVolUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCaThpVolUl(JAXBElement<Long> value) {
        this.caThpVolUl = value;
    }

}
