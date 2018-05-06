
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteRbStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRbStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduBitrateDlAvgSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduBitrateUlAvgSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduBitrateDlMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduBitrateUlMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SrbPdcpSduBitrateDlAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SrbPdcpSduBitrateUlAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbUeActiveDlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbUeActiveUlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduDelayDlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduDropRateDlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduAirLossRateDlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DrbPdcpSduLossRateUlSum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRbStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "drbPdcpSduBitrateDlAvgSum",
    "drbPdcpSduBitrateUlAvgSum",
    "drbPdcpSduBitrateDlMax",
    "drbPdcpSduBitrateUlMax",
    "srbPdcpSduBitrateDlAvg",
    "srbPdcpSduBitrateUlAvg",
    "drbUeActiveDlSum",
    "drbUeActiveUlSum",
    "drbPdcpSduDelayDlSum",
    "drbPdcpSduDropRateDlSum",
    "drbPdcpSduAirLossRateDlSum",
    "drbPdcpSduLossRateUlSum"
})
public class LteRbStatsRowWs {

    @XmlElement(name = "CellId")
    protected int cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "DrbPdcpSduBitrateDlAvgSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduBitrateDlAvgSum;
    @XmlElement(name = "DrbPdcpSduBitrateUlAvgSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduBitrateUlAvgSum;
    @XmlElement(name = "DrbPdcpSduBitrateDlMax", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduBitrateDlMax;
    @XmlElement(name = "DrbPdcpSduBitrateUlMax", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduBitrateUlMax;
    @XmlElement(name = "SrbPdcpSduBitrateDlAvg", required = true, type = Integer.class, nillable = true)
    protected Integer srbPdcpSduBitrateDlAvg;
    @XmlElement(name = "SrbPdcpSduBitrateUlAvg", required = true, type = Integer.class, nillable = true)
    protected Integer srbPdcpSduBitrateUlAvg;
    @XmlElement(name = "DrbUeActiveDlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbUeActiveDlSum;
    @XmlElement(name = "DrbUeActiveUlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbUeActiveUlSum;
    @XmlElement(name = "DrbPdcpSduDelayDlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduDelayDlSum;
    @XmlElement(name = "DrbPdcpSduDropRateDlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduDropRateDlSum;
    @XmlElement(name = "DrbPdcpSduAirLossRateDlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduAirLossRateDlSum;
    @XmlElement(name = "DrbPdcpSduLossRateUlSum", required = true, type = Integer.class, nillable = true)
    protected Integer drbPdcpSduLossRateUlSum;

    /**
     * Gets the value of the cellId property.
     * 
     */
    public int getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     */
    public void setCellId(int value) {
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
     * Gets the value of the drbPdcpSduBitrateDlAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduBitrateDlAvgSum() {
        return drbPdcpSduBitrateDlAvgSum;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateDlAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduBitrateDlAvgSum(Integer value) {
        this.drbPdcpSduBitrateDlAvgSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateUlAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduBitrateUlAvgSum() {
        return drbPdcpSduBitrateUlAvgSum;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateUlAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduBitrateUlAvgSum(Integer value) {
        this.drbPdcpSduBitrateUlAvgSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateDlMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduBitrateDlMax() {
        return drbPdcpSduBitrateDlMax;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateDlMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduBitrateDlMax(Integer value) {
        this.drbPdcpSduBitrateDlMax = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateUlMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduBitrateUlMax() {
        return drbPdcpSduBitrateUlMax;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateUlMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduBitrateUlMax(Integer value) {
        this.drbPdcpSduBitrateUlMax = value;
    }

    /**
     * Gets the value of the srbPdcpSduBitrateDlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSrbPdcpSduBitrateDlAvg() {
        return srbPdcpSduBitrateDlAvg;
    }

    /**
     * Sets the value of the srbPdcpSduBitrateDlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSrbPdcpSduBitrateDlAvg(Integer value) {
        this.srbPdcpSduBitrateDlAvg = value;
    }

    /**
     * Gets the value of the srbPdcpSduBitrateUlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSrbPdcpSduBitrateUlAvg() {
        return srbPdcpSduBitrateUlAvg;
    }

    /**
     * Sets the value of the srbPdcpSduBitrateUlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSrbPdcpSduBitrateUlAvg(Integer value) {
        this.srbPdcpSduBitrateUlAvg = value;
    }

    /**
     * Gets the value of the drbUeActiveDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbUeActiveDlSum() {
        return drbUeActiveDlSum;
    }

    /**
     * Sets the value of the drbUeActiveDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbUeActiveDlSum(Integer value) {
        this.drbUeActiveDlSum = value;
    }

    /**
     * Gets the value of the drbUeActiveUlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbUeActiveUlSum() {
        return drbUeActiveUlSum;
    }

    /**
     * Sets the value of the drbUeActiveUlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbUeActiveUlSum(Integer value) {
        this.drbUeActiveUlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduDelayDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduDelayDlSum() {
        return drbPdcpSduDelayDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduDelayDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduDelayDlSum(Integer value) {
        this.drbPdcpSduDelayDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduDropRateDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduDropRateDlSum() {
        return drbPdcpSduDropRateDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduDropRateDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduDropRateDlSum(Integer value) {
        this.drbPdcpSduDropRateDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduAirLossRateDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduAirLossRateDlSum() {
        return drbPdcpSduAirLossRateDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduAirLossRateDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduAirLossRateDlSum(Integer value) {
        this.drbPdcpSduAirLossRateDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduLossRateUlSum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrbPdcpSduLossRateUlSum() {
        return drbPdcpSduLossRateUlSum;
    }

    /**
     * Sets the value of the drbPdcpSduLossRateUlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrbPdcpSduLossRateUlSum(Integer value) {
        this.drbPdcpSduLossRateUlSum = value;
    }

}
