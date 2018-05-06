
package Netspan.NBI_15_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PdcpSduBitrateDlAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpSduBitrateUlAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UeActiveDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UeActiveUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpSduDelayDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpSduDropRateDl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="PdcpSduAirLossRateDl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="PdcpSduLossRateUl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="IpThroughputDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IpThroughputUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdcpTrafficBytesDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PdcpTrafficBytesUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RbDlIpLatency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IpLateTimeDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IpLateSamplesDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "pdcpTrafficBytesUl",
    "rbDlIpLatency",
    "ipLateTimeDl",
    "ipLateSamplesDl"
})
public class LteRbPerQciStatsRowWs {

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
    @XmlElement(name = "GranularityPeriod")
    protected int granularityPeriod;
    @XmlElementRef(name = "PdcpSduBitrateDlAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpSduBitrateDlAvg;
    @XmlElementRef(name = "PdcpSduBitrateUlAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpSduBitrateUlAvg;
    @XmlElementRef(name = "UeActiveDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueActiveDl;
    @XmlElementRef(name = "UeActiveUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueActiveUl;
    @XmlElementRef(name = "PdcpSduDelayDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpSduDelayDl;
    @XmlElementRef(name = "PdcpSduDropRateDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pdcpSduDropRateDl;
    @XmlElementRef(name = "PdcpSduAirLossRateDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pdcpSduAirLossRateDl;
    @XmlElementRef(name = "PdcpSduLossRateUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> pdcpSduLossRateUl;
    @XmlElementRef(name = "IpThroughputDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputDl;
    @XmlElementRef(name = "IpThroughputUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputUl;
    @XmlElementRef(name = "PdcpTrafficKbpsDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpTrafficKbpsDl;
    @XmlElementRef(name = "PdcpTrafficKbpsUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdcpTrafficKbpsUl;
    @XmlElementRef(name = "PdcpTrafficBytesDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpTrafficBytesDl;
    @XmlElementRef(name = "PdcpTrafficBytesUl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpTrafficBytesUl;
    @XmlElementRef(name = "RbDlIpLatency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rbDlIpLatency;
    @XmlElementRef(name = "IpLateTimeDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipLateTimeDl;
    @XmlElementRef(name = "IpLateSamplesDl", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipLateSamplesDl;

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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpSduBitrateDlAvg() {
        return pdcpSduBitrateDlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateDlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpSduBitrateDlAvg(JAXBElement<Integer> value) {
        this.pdcpSduBitrateDlAvg = value;
    }

    /**
     * Gets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpSduBitrateUlAvg() {
        return pdcpSduBitrateUlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpSduBitrateUlAvg(JAXBElement<Integer> value) {
        this.pdcpSduBitrateUlAvg = value;
    }

    /**
     * Gets the value of the ueActiveDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeActiveDl() {
        return ueActiveDl;
    }

    /**
     * Sets the value of the ueActiveDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeActiveDl(JAXBElement<Integer> value) {
        this.ueActiveDl = value;
    }

    /**
     * Gets the value of the ueActiveUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeActiveUl() {
        return ueActiveUl;
    }

    /**
     * Sets the value of the ueActiveUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeActiveUl(JAXBElement<Integer> value) {
        this.ueActiveUl = value;
    }

    /**
     * Gets the value of the pdcpSduDelayDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpSduDelayDl() {
        return pdcpSduDelayDl;
    }

    /**
     * Sets the value of the pdcpSduDelayDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpSduDelayDl(JAXBElement<Integer> value) {
        this.pdcpSduDelayDl = value;
    }

    /**
     * Gets the value of the pdcpSduDropRateDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPdcpSduDropRateDl() {
        return pdcpSduDropRateDl;
    }

    /**
     * Sets the value of the pdcpSduDropRateDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPdcpSduDropRateDl(JAXBElement<Float> value) {
        this.pdcpSduDropRateDl = value;
    }

    /**
     * Gets the value of the pdcpSduAirLossRateDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPdcpSduAirLossRateDl() {
        return pdcpSduAirLossRateDl;
    }

    /**
     * Sets the value of the pdcpSduAirLossRateDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPdcpSduAirLossRateDl(JAXBElement<Float> value) {
        this.pdcpSduAirLossRateDl = value;
    }

    /**
     * Gets the value of the pdcpSduLossRateUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getPdcpSduLossRateUl() {
        return pdcpSduLossRateUl;
    }

    /**
     * Sets the value of the pdcpSduLossRateUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setPdcpSduLossRateUl(JAXBElement<Float> value) {
        this.pdcpSduLossRateUl = value;
    }

    /**
     * Gets the value of the ipThroughputDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputDl() {
        return ipThroughputDl;
    }

    /**
     * Sets the value of the ipThroughputDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputDl(JAXBElement<Integer> value) {
        this.ipThroughputDl = value;
    }

    /**
     * Gets the value of the ipThroughputUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputUl() {
        return ipThroughputUl;
    }

    /**
     * Sets the value of the ipThroughputUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputUl(JAXBElement<Integer> value) {
        this.ipThroughputUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpTrafficKbpsDl() {
        return pdcpTrafficKbpsDl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpTrafficKbpsDl(JAXBElement<Integer> value) {
        this.pdcpTrafficKbpsDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficKbpsUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdcpTrafficKbpsUl() {
        return pdcpTrafficKbpsUl;
    }

    /**
     * Sets the value of the pdcpTrafficKbpsUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdcpTrafficKbpsUl(JAXBElement<Integer> value) {
        this.pdcpTrafficKbpsUl = value;
    }

    /**
     * Gets the value of the pdcpTrafficBytesDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpTrafficBytesDl() {
        return pdcpTrafficBytesDl;
    }

    /**
     * Sets the value of the pdcpTrafficBytesDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpTrafficBytesDl(JAXBElement<Long> value) {
        this.pdcpTrafficBytesDl = value;
    }

    /**
     * Gets the value of the pdcpTrafficBytesUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpTrafficBytesUl() {
        return pdcpTrafficBytesUl;
    }

    /**
     * Sets the value of the pdcpTrafficBytesUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpTrafficBytesUl(JAXBElement<Long> value) {
        this.pdcpTrafficBytesUl = value;
    }

    /**
     * Gets the value of the rbDlIpLatency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRbDlIpLatency() {
        return rbDlIpLatency;
    }

    /**
     * Sets the value of the rbDlIpLatency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRbDlIpLatency(JAXBElement<Integer> value) {
        this.rbDlIpLatency = value;
    }

    /**
     * Gets the value of the ipLateTimeDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpLateTimeDl() {
        return ipLateTimeDl;
    }

    /**
     * Sets the value of the ipLateTimeDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpLateTimeDl(JAXBElement<Integer> value) {
        this.ipLateTimeDl = value;
    }

    /**
     * Gets the value of the ipLateSamplesDl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpLateSamplesDl() {
        return ipLateSamplesDl;
    }

    /**
     * Sets the value of the ipLateSamplesDl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpLateSamplesDl(JAXBElement<Integer> value) {
        this.ipLateSamplesDl = value;
    }

}
