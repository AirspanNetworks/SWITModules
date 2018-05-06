
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteRruPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRruPerQciStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlPrbUsageForTraffic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlPrbUsageForTraffic" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlMacTrafficKbps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlMacTrafficKbps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlMacTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UlMacTrafficBytes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DlEffMacTrafficKbPerTti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlEffMacTrafficKbPerTti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DlActiveTti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UlActiveTti" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "ulActiveTti"
})
public class LteRruPerQciStatsRowWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "QciIndex", required = true, type = Integer.class, nillable = true)
    protected Integer qciIndex;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "DlPrbUsageForTraffic", required = true, type = Integer.class, nillable = true)
    protected Integer dlPrbUsageForTraffic;
    @XmlElement(name = "UlPrbUsageForTraffic", required = true, type = Integer.class, nillable = true)
    protected Integer ulPrbUsageForTraffic;
    @XmlElement(name = "DlMacTrafficKbps", required = true, type = Integer.class, nillable = true)
    protected Integer dlMacTrafficKbps;
    @XmlElement(name = "UlMacTrafficKbps", required = true, type = Integer.class, nillable = true)
    protected Integer ulMacTrafficKbps;
    @XmlElement(name = "DlMacTrafficBytes", required = true, type = Long.class, nillable = true)
    protected Long dlMacTrafficBytes;
    @XmlElement(name = "UlMacTrafficBytes", required = true, type = Long.class, nillable = true)
    protected Long ulMacTrafficBytes;
    @XmlElement(name = "DlEffMacTrafficKbPerTti", required = true, type = Integer.class, nillable = true)
    protected Integer dlEffMacTrafficKbPerTti;
    @XmlElement(name = "UlEffMacTrafficKbPerTti", required = true, type = Integer.class, nillable = true)
    protected Integer ulEffMacTrafficKbPerTti;
    @XmlElement(name = "DlActiveTti", required = true, type = Integer.class, nillable = true)
    protected Integer dlActiveTti;
    @XmlElement(name = "UlActiveTti", required = true, type = Integer.class, nillable = true)
    protected Integer ulActiveTti;

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
     * Gets the value of the qciIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQciIndex() {
        return qciIndex;
    }

    /**
     * Sets the value of the qciIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQciIndex(Integer value) {
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
     * Gets the value of the dlPrbUsageForTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlPrbUsageForTraffic() {
        return dlPrbUsageForTraffic;
    }

    /**
     * Sets the value of the dlPrbUsageForTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlPrbUsageForTraffic(Integer value) {
        this.dlPrbUsageForTraffic = value;
    }

    /**
     * Gets the value of the ulPrbUsageForTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlPrbUsageForTraffic() {
        return ulPrbUsageForTraffic;
    }

    /**
     * Sets the value of the ulPrbUsageForTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlPrbUsageForTraffic(Integer value) {
        this.ulPrbUsageForTraffic = value;
    }

    /**
     * Gets the value of the dlMacTrafficKbps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlMacTrafficKbps() {
        return dlMacTrafficKbps;
    }

    /**
     * Sets the value of the dlMacTrafficKbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlMacTrafficKbps(Integer value) {
        this.dlMacTrafficKbps = value;
    }

    /**
     * Gets the value of the ulMacTrafficKbps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlMacTrafficKbps() {
        return ulMacTrafficKbps;
    }

    /**
     * Sets the value of the ulMacTrafficKbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlMacTrafficKbps(Integer value) {
        this.ulMacTrafficKbps = value;
    }

    /**
     * Gets the value of the dlMacTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDlMacTrafficBytes() {
        return dlMacTrafficBytes;
    }

    /**
     * Sets the value of the dlMacTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDlMacTrafficBytes(Long value) {
        this.dlMacTrafficBytes = value;
    }

    /**
     * Gets the value of the ulMacTrafficBytes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUlMacTrafficBytes() {
        return ulMacTrafficBytes;
    }

    /**
     * Sets the value of the ulMacTrafficBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUlMacTrafficBytes(Long value) {
        this.ulMacTrafficBytes = value;
    }

    /**
     * Gets the value of the dlEffMacTrafficKbPerTti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlEffMacTrafficKbPerTti() {
        return dlEffMacTrafficKbPerTti;
    }

    /**
     * Sets the value of the dlEffMacTrafficKbPerTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlEffMacTrafficKbPerTti(Integer value) {
        this.dlEffMacTrafficKbPerTti = value;
    }

    /**
     * Gets the value of the ulEffMacTrafficKbPerTti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlEffMacTrafficKbPerTti() {
        return ulEffMacTrafficKbPerTti;
    }

    /**
     * Sets the value of the ulEffMacTrafficKbPerTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlEffMacTrafficKbPerTti(Integer value) {
        this.ulEffMacTrafficKbPerTti = value;
    }

    /**
     * Gets the value of the dlActiveTti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDlActiveTti() {
        return dlActiveTti;
    }

    /**
     * Sets the value of the dlActiveTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDlActiveTti(Integer value) {
        this.dlActiveTti = value;
    }

    /**
     * Gets the value of the ulActiveTti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUlActiveTti() {
        return ulActiveTti;
    }

    /**
     * Sets the value of the ulActiveTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUlActiveTti(Integer value) {
        this.ulActiveTti = value;
    }

}
