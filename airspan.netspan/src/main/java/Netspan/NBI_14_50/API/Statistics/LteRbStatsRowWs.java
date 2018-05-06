
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
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduBitrateDlAvgSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduBitrateUlAvgSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduBitrateDlMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduBitrateUlMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SrbPdcpSduBitrateDlAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SrbPdcpSduBitrateUlAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbUeActiveDlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbUeActiveUlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduDelayDlSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduDropRateDlSum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduAirLossRateDlSum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="DrbPdcpSduLossRateUlSum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "DrbPdcpSduBitrateDlAvgSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbPdcpSduBitrateDlAvgSum;
    @XmlElementRef(name = "DrbPdcpSduBitrateUlAvgSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbPdcpSduBitrateUlAvgSum;
    @XmlElementRef(name = "DrbPdcpSduBitrateDlMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbPdcpSduBitrateDlMax;
    @XmlElementRef(name = "DrbPdcpSduBitrateUlMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbPdcpSduBitrateUlMax;
    @XmlElementRef(name = "SrbPdcpSduBitrateDlAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> srbPdcpSduBitrateDlAvg;
    @XmlElementRef(name = "SrbPdcpSduBitrateUlAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> srbPdcpSduBitrateUlAvg;
    @XmlElementRef(name = "DrbUeActiveDlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbUeActiveDlSum;
    @XmlElementRef(name = "DrbUeActiveUlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbUeActiveUlSum;
    @XmlElementRef(name = "DrbPdcpSduDelayDlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbPdcpSduDelayDlSum;
    @XmlElementRef(name = "DrbPdcpSduDropRateDlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> drbPdcpSduDropRateDlSum;
    @XmlElementRef(name = "DrbPdcpSduAirLossRateDlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> drbPdcpSduAirLossRateDlSum;
    @XmlElementRef(name = "DrbPdcpSduLossRateUlSum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> drbPdcpSduLossRateUlSum;

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
     * Gets the value of the drbPdcpSduBitrateDlAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbPdcpSduBitrateDlAvgSum() {
        return drbPdcpSduBitrateDlAvgSum;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateDlAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbPdcpSduBitrateDlAvgSum(JAXBElement<Integer> value) {
        this.drbPdcpSduBitrateDlAvgSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateUlAvgSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbPdcpSduBitrateUlAvgSum() {
        return drbPdcpSduBitrateUlAvgSum;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateUlAvgSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbPdcpSduBitrateUlAvgSum(JAXBElement<Integer> value) {
        this.drbPdcpSduBitrateUlAvgSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateDlMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbPdcpSduBitrateDlMax() {
        return drbPdcpSduBitrateDlMax;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateDlMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbPdcpSduBitrateDlMax(JAXBElement<Integer> value) {
        this.drbPdcpSduBitrateDlMax = value;
    }

    /**
     * Gets the value of the drbPdcpSduBitrateUlMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbPdcpSduBitrateUlMax() {
        return drbPdcpSduBitrateUlMax;
    }

    /**
     * Sets the value of the drbPdcpSduBitrateUlMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbPdcpSduBitrateUlMax(JAXBElement<Integer> value) {
        this.drbPdcpSduBitrateUlMax = value;
    }

    /**
     * Gets the value of the srbPdcpSduBitrateDlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSrbPdcpSduBitrateDlAvg() {
        return srbPdcpSduBitrateDlAvg;
    }

    /**
     * Sets the value of the srbPdcpSduBitrateDlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSrbPdcpSduBitrateDlAvg(JAXBElement<Integer> value) {
        this.srbPdcpSduBitrateDlAvg = value;
    }

    /**
     * Gets the value of the srbPdcpSduBitrateUlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSrbPdcpSduBitrateUlAvg() {
        return srbPdcpSduBitrateUlAvg;
    }

    /**
     * Sets the value of the srbPdcpSduBitrateUlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSrbPdcpSduBitrateUlAvg(JAXBElement<Integer> value) {
        this.srbPdcpSduBitrateUlAvg = value;
    }

    /**
     * Gets the value of the drbUeActiveDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbUeActiveDlSum() {
        return drbUeActiveDlSum;
    }

    /**
     * Sets the value of the drbUeActiveDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbUeActiveDlSum(JAXBElement<Integer> value) {
        this.drbUeActiveDlSum = value;
    }

    /**
     * Gets the value of the drbUeActiveUlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbUeActiveUlSum() {
        return drbUeActiveUlSum;
    }

    /**
     * Sets the value of the drbUeActiveUlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbUeActiveUlSum(JAXBElement<Integer> value) {
        this.drbUeActiveUlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduDelayDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbPdcpSduDelayDlSum() {
        return drbPdcpSduDelayDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduDelayDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbPdcpSduDelayDlSum(JAXBElement<Integer> value) {
        this.drbPdcpSduDelayDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduDropRateDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDrbPdcpSduDropRateDlSum() {
        return drbPdcpSduDropRateDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduDropRateDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDrbPdcpSduDropRateDlSum(JAXBElement<Float> value) {
        this.drbPdcpSduDropRateDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduAirLossRateDlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDrbPdcpSduAirLossRateDlSum() {
        return drbPdcpSduAirLossRateDlSum;
    }

    /**
     * Sets the value of the drbPdcpSduAirLossRateDlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDrbPdcpSduAirLossRateDlSum(JAXBElement<Float> value) {
        this.drbPdcpSduAirLossRateDlSum = value;
    }

    /**
     * Gets the value of the drbPdcpSduLossRateUlSum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDrbPdcpSduLossRateUlSum() {
        return drbPdcpSduLossRateUlSum;
    }

    /**
     * Sets the value of the drbPdcpSduLossRateUlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDrbPdcpSduLossRateUlSum(JAXBElement<Float> value) {
        this.drbPdcpSduLossRateUlSum = value;
    }

}
