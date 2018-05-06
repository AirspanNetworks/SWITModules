
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteRbPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteRbPerQciStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduBitrateDlAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduBitrateUlAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeActiveDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UeActiveUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduDelayDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduDropRateDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduAirLossRateDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduLossRateUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IpThroughputDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IpThroughputUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpTrafficBytesDl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PdcpTrafficBytesUl" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRbPerQciStatsRowWs", propOrder = {
    "cellId",
    "qciIndex",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "pdcpSduBitrateDlAvg",
    "pdcpSduBitrateUlAvg",
    "ueActiveDl",
    "ueActiveUl",
    "pdcpSduDelayDl",
    "pdcpSduDropRateDl",
    "pdcpSduAirLossRateDl",
    "pdcpSduLossRateUl",
    "ipThroughputDl",
    "ipThroughputUl",
    "pdcpTrafficKbpsDl",
    "pdcpTrafficKbpsUl",
    "pdcpTrafficBytesDl",
    "pdcpTrafficBytesUl"
})
public class LteRbPerQciStatsRowWs {

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
    @XmlElement(name = "GranularityPeriod")
    protected int granularityPeriod;
    @XmlElement(name = "PdcpSduBitrateDlAvg", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduBitrateDlAvg;
    @XmlElement(name = "PdcpSduBitrateUlAvg", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduBitrateUlAvg;
    @XmlElement(name = "UeActiveDl", required = true, type = Integer.class, nillable = true)
    protected Integer ueActiveDl;
    @XmlElement(name = "UeActiveUl", required = true, type = Integer.class, nillable = true)
    protected Integer ueActiveUl;
    @XmlElement(name = "PdcpSduDelayDl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduDelayDl;
    @XmlElement(name = "PdcpSduDropRateDl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduDropRateDl;
    @XmlElement(name = "PdcpSduAirLossRateDl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduAirLossRateDl;
    @XmlElement(name = "PdcpSduLossRateUl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpSduLossRateUl;
    @XmlElement(name = "IpThroughputDl", required = true, type = Integer.class, nillable = true)
    protected Integer ipThroughputDl;
    @XmlElement(name = "IpThroughputUl", required = true, type = Integer.class, nillable = true)
    protected Integer ipThroughputUl;
    @XmlElement(name = "PdcpTrafficKbpsDl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpTrafficKbpsDl;
    @XmlElement(name = "PdcpTrafficKbpsUl", required = true, type = Integer.class, nillable = true)
    protected Integer pdcpTrafficKbpsUl;
    @XmlElement(name = "PdcpTrafficBytesDl", required = true, type = Long.class, nillable = true)
    protected Long pdcpTrafficBytesDl;
    @XmlElement(name = "PdcpTrafficBytesUl", required = true, type = Long.class, nillable = true)
    protected Long pdcpTrafficBytesUl;

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
     */
    public int getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     */
    public void setGranularityPeriod(int value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the pdcpSduBitrateDlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduBitrateDlAvg() {
        return pdcpSduBitrateDlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateDlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduBitrateDlAvg(Integer value) {
        this.pdcpSduBitrateDlAvg = value;
    }

    /**
     * Gets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduBitrateUlAvg() {
        return pdcpSduBitrateUlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduBitrateUlAvg(Integer value) {
        this.pdcpSduBitrateUlAvg = value;
    }

    /**
     * Gets the value of the ueActiveDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeActiveDl() {
        return ueActiveDl;
    }

    /**
     * Sets the value of the ueActiveDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeActiveDl(Integer value) {
        this.ueActiveDl = value;
    }

    /**
     * Gets the value of the ueActiveUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUeActiveUl() {
        return ueActiveUl;
    }

    /**
     * Sets the value of the ueActiveUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUeActiveUl(Integer value) {
        this.ueActiveUl = value;
    }

    /**
     * Gets the value of the pdcpSduDelayDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduDelayDl() {
        return pdcpSduDelayDl;
    }

    /**
     * Sets the value of the pdcpSduDelayDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduDelayDl(Integer value) {
        this.pdcpSduDelayDl = value;
    }

    /**
     * Gets the value of the pdcpSduDropRateDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduDropRateDl() {
        return pdcpSduDropRateDl;
    }

    /**
     * Sets the value of the pdcpSduDropRateDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduDropRateDl(Integer value) {
        this.pdcpSduDropRateDl = value;
    }

    /**
     * Gets the value of the pdcpSduAirLossRateDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduAirLossRateDl() {
        return pdcpSduAirLossRateDl;
    }

    /**
     * Sets the value of the pdcpSduAirLossRateDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduAirLossRateDl(Integer value) {
        this.pdcpSduAirLossRateDl = value;
    }

    /**
     * Gets the value of the pdcpSduLossRateUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpSduLossRateUl() {
        return pdcpSduLossRateUl;
    }

    /**
     * Sets the value of the pdcpSduLossRateUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpSduLossRateUl(Integer value) {
        this.pdcpSduLossRateUl = value;
    }

    /**
     * Gets the value of the ipThroughputDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpThroughputDl() {
        return ipThroughputDl;
    }

    /**
     * Sets the value of the ipThroughputDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpThroughputDl(Integer value) {
        this.ipThroughputDl = value;
    }

    /**
     * Gets the value of the ipThroughputUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIpThroughputUl() {
        return ipThroughputUl;
    }

    /**
     * Sets the value of the ipThroughputUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIpThroughputUl(Integer value) {
        this.ipThroughputUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpTrafficKbpsDl() {
        return pdcpTrafficKbpsDl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpTrafficKbpsDl(Integer value) {
        this.pdcpTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPdcpTrafficKbpsUl() {
        return pdcpTrafficKbpsUl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPdcpTrafficKbpsUl(Integer value) {
        this.pdcpTrafficKbpsUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficBytesDl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPdcpTrafficBytesDl() {
        return pdcpTrafficBytesDl;
    }

    /**
     * Sets the value of the pdcpTrafficBytesDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPdcpTrafficBytesDl(Long value) {
        this.pdcpTrafficBytesDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficBytesUl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPdcpTrafficBytesUl() {
        return pdcpTrafficBytesUl;
    }

    /**
     * Sets the value of the pdcpTrafficBytesUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPdcpTrafficBytesUl(Long value) {
        this.pdcpTrafficBytesUl = value;
    }

}
