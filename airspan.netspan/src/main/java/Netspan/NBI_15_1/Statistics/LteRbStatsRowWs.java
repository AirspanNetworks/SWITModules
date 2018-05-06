
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="DrbMaxDLThCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DrbDLThCapacitySum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DrbDLThCapacityAvg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrbDLNumOfSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrbMaxULThCapacity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DrbULThCapacitySum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DrbULThCapacityAvg" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DrbULNumOfSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "drbPdcpSduLossRateUlSum",
    "drbMaxDLThCapacity",
    "drbDLThCapacitySum",
    "drbDLThCapacityAvg",
    "drbDLNumOfSec",
    "drbMaxULThCapacity",
    "drbULThCapacitySum",
    "drbULThCapacityAvg",
    "drbULNumOfSec"
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
    @XmlElementRef(name = "DrbMaxDLThCapacity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> drbMaxDLThCapacity;
    @XmlElementRef(name = "DrbDLThCapacitySum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> drbDLThCapacitySum;
    @XmlElementRef(name = "DrbDLThCapacityAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> drbDLThCapacityAvg;
    @XmlElementRef(name = "DrbDLNumOfSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbDLNumOfSec;
    @XmlElementRef(name = "DrbMaxULThCapacity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> drbMaxULThCapacity;
    @XmlElementRef(name = "DrbULThCapacitySum", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> drbULThCapacitySum;
    @XmlElementRef(name = "DrbULThCapacityAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> drbULThCapacityAvg;
    @XmlElementRef(name = "DrbULNumOfSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> drbULNumOfSec;

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

    /**
     * Gets the value of the drbMaxDLThCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDrbMaxDLThCapacity() {
        return drbMaxDLThCapacity;
    }

    /**
     * Sets the value of the drbMaxDLThCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDrbMaxDLThCapacity(JAXBElement<Long> value) {
        this.drbMaxDLThCapacity = value;
    }

    /**
     * Gets the value of the drbDLThCapacitySum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDrbDLThCapacitySum() {
        return drbDLThCapacitySum;
    }

    /**
     * Sets the value of the drbDLThCapacitySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDrbDLThCapacitySum(JAXBElement<Long> value) {
        this.drbDLThCapacitySum = value;
    }

    /**
     * Gets the value of the drbDLThCapacityAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDrbDLThCapacityAvg() {
        return drbDLThCapacityAvg;
    }

    /**
     * Sets the value of the drbDLThCapacityAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDrbDLThCapacityAvg(JAXBElement<Double> value) {
        this.drbDLThCapacityAvg = value;
    }

    /**
     * Gets the value of the drbDLNumOfSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbDLNumOfSec() {
        return drbDLNumOfSec;
    }

    /**
     * Sets the value of the drbDLNumOfSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbDLNumOfSec(JAXBElement<Integer> value) {
        this.drbDLNumOfSec = value;
    }

    /**
     * Gets the value of the drbMaxULThCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDrbMaxULThCapacity() {
        return drbMaxULThCapacity;
    }

    /**
     * Sets the value of the drbMaxULThCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDrbMaxULThCapacity(JAXBElement<Long> value) {
        this.drbMaxULThCapacity = value;
    }

    /**
     * Gets the value of the drbULThCapacitySum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDrbULThCapacitySum() {
        return drbULThCapacitySum;
    }

    /**
     * Sets the value of the drbULThCapacitySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDrbULThCapacitySum(JAXBElement<Long> value) {
        this.drbULThCapacitySum = value;
    }

    /**
     * Gets the value of the drbULThCapacityAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDrbULThCapacityAvg() {
        return drbULThCapacityAvg;
    }

    /**
     * Sets the value of the drbULThCapacityAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDrbULThCapacityAvg(JAXBElement<Double> value) {
        this.drbULThCapacityAvg = value;
    }

    /**
     * Gets the value of the drbULNumOfSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDrbULNumOfSec() {
        return drbULNumOfSec;
    }

    /**
     * Sets the value of the drbULNumOfSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDrbULNumOfSec(JAXBElement<Integer> value) {
        this.drbULNumOfSec = value;
    }

}
