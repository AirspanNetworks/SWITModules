
package Netspan.NBI_17_5.Statistics;

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
 * &lt;complexType name="LteRbPerQciStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PdcpSduBitrateDlAvg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduBitrateUlAvg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UeActiveDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeActiveUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduDelayDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduDropRateDl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduAirLossRateDl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduLossRateUl" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficKbpsDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficKbpsUl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficBytesDl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcpTrafficBytesUl" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RbDlIpLatency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpLateTimeDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpLateSamplesDl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RohcOnDrbQci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RohcOffDrbQci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputDlNumOfKBits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputUlNumOfKBits" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputDlTimeDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="IpThroughputUlTimeDuration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduDlKBits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduDlDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduUlKBits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PdcpSduUlDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcBytesTxPerQci" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcBytesReTxPerQci" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DlRlcThroughputPerQci" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlRlcBytesRxPerQci" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="UlRlcThroughputPerQci" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteRbPerQciStatsRowWs", propOrder = {
    "cellNumber",
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
    "ipLateSamplesDl",
    "rohcOnDrbQci",
    "rohcOffDrbQci",
    "ipThroughputDlNumOfKBits",
    "ipThroughputUlNumOfKBits",
    "ipThroughputDlTimeDuration",
    "ipThroughputUlTimeDuration",
    "pdcpSduDlKBits",
    "pdcpSduDlDuration",
    "pdcpSduUlKBits",
    "pdcpSduUlDuration",
    "dlRlcBytesTxPerQci",
    "dlRlcBytesReTxPerQci",
    "dlRlcThroughputPerQci",
    "ulRlcBytesRxPerQci",
    "ulRlcThroughputPerQci"
})
public class LteRbPerQciStatsRowWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
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
    protected JAXBElement<Long> pdcpSduBitrateDlAvg;
    @XmlElementRef(name = "PdcpSduBitrateUlAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpSduBitrateUlAvg;
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
    @XmlElementRef(name = "RohcOnDrbQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rohcOnDrbQci;
    @XmlElementRef(name = "RohcOffDrbQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rohcOffDrbQci;
    @XmlElementRef(name = "IpThroughputDlNumOfKBits", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputDlNumOfKBits;
    @XmlElementRef(name = "IpThroughputUlNumOfKBits", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ipThroughputUlNumOfKBits;
    @XmlElementRef(name = "IpThroughputDlTimeDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ipThroughputDlTimeDuration;
    @XmlElementRef(name = "IpThroughputUlTimeDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ipThroughputUlTimeDuration;
    @XmlElementRef(name = "PdcpSduDlKBits", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpSduDlKBits;
    @XmlElementRef(name = "PdcpSduDlDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpSduDlDuration;
    @XmlElementRef(name = "PdcpSduUlKBits", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpSduUlKBits;
    @XmlElementRef(name = "PdcpSduUlDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pdcpSduUlDuration;
    @XmlElementRef(name = "DlRlcBytesTxPerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlRlcBytesTxPerQci;
    @XmlElementRef(name = "DlRlcBytesReTxPerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dlRlcBytesReTxPerQci;
    @XmlElementRef(name = "DlRlcThroughputPerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlRlcThroughputPerQci;
    @XmlElementRef(name = "UlRlcBytesRxPerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ulRlcBytesRxPerQci;
    @XmlElementRef(name = "UlRlcThroughputPerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulRlcThroughputPerQci;

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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduBitrateDlAvg() {
        return pdcpSduBitrateDlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateDlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduBitrateDlAvg(JAXBElement<Long> value) {
        this.pdcpSduBitrateDlAvg = value;
    }

    /**
     * Gets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduBitrateUlAvg() {
        return pdcpSduBitrateUlAvg;
    }

    /**
     * Sets the value of the pdcpSduBitrateUlAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduBitrateUlAvg(JAXBElement<Long> value) {
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

    /**
     * Gets the value of the rohcOnDrbQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRohcOnDrbQci() {
        return rohcOnDrbQci;
    }

    /**
     * Sets the value of the rohcOnDrbQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRohcOnDrbQci(JAXBElement<Integer> value) {
        this.rohcOnDrbQci = value;
    }

    /**
     * Gets the value of the rohcOffDrbQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRohcOffDrbQci() {
        return rohcOffDrbQci;
    }

    /**
     * Sets the value of the rohcOffDrbQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRohcOffDrbQci(JAXBElement<Integer> value) {
        this.rohcOffDrbQci = value;
    }

    /**
     * Gets the value of the ipThroughputDlNumOfKBits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputDlNumOfKBits() {
        return ipThroughputDlNumOfKBits;
    }

    /**
     * Sets the value of the ipThroughputDlNumOfKBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputDlNumOfKBits(JAXBElement<Integer> value) {
        this.ipThroughputDlNumOfKBits = value;
    }

    /**
     * Gets the value of the ipThroughputUlNumOfKBits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIpThroughputUlNumOfKBits() {
        return ipThroughputUlNumOfKBits;
    }

    /**
     * Sets the value of the ipThroughputUlNumOfKBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIpThroughputUlNumOfKBits(JAXBElement<Integer> value) {
        this.ipThroughputUlNumOfKBits = value;
    }

    /**
     * Gets the value of the ipThroughputDlTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIpThroughputDlTimeDuration() {
        return ipThroughputDlTimeDuration;
    }

    /**
     * Sets the value of the ipThroughputDlTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIpThroughputDlTimeDuration(JAXBElement<Double> value) {
        this.ipThroughputDlTimeDuration = value;
    }

    /**
     * Gets the value of the ipThroughputUlTimeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getIpThroughputUlTimeDuration() {
        return ipThroughputUlTimeDuration;
    }

    /**
     * Sets the value of the ipThroughputUlTimeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setIpThroughputUlTimeDuration(JAXBElement<Double> value) {
        this.ipThroughputUlTimeDuration = value;
    }

    /**
     * Gets the value of the pdcpSduDlKBits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduDlKBits() {
        return pdcpSduDlKBits;
    }

    /**
     * Sets the value of the pdcpSduDlKBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduDlKBits(JAXBElement<Long> value) {
        this.pdcpSduDlKBits = value;
    }

    /**
     * Gets the value of the pdcpSduDlDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduDlDuration() {
        return pdcpSduDlDuration;
    }

    /**
     * Sets the value of the pdcpSduDlDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduDlDuration(JAXBElement<Long> value) {
        this.pdcpSduDlDuration = value;
    }

    /**
     * Gets the value of the pdcpSduUlKBits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduUlKBits() {
        return pdcpSduUlKBits;
    }

    /**
     * Sets the value of the pdcpSduUlKBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduUlKBits(JAXBElement<Long> value) {
        this.pdcpSduUlKBits = value;
    }

    /**
     * Gets the value of the pdcpSduUlDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPdcpSduUlDuration() {
        return pdcpSduUlDuration;
    }

    /**
     * Sets the value of the pdcpSduUlDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPdcpSduUlDuration(JAXBElement<Long> value) {
        this.pdcpSduUlDuration = value;
    }

    /**
     * Gets the value of the dlRlcBytesTxPerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlRlcBytesTxPerQci() {
        return dlRlcBytesTxPerQci;
    }

    /**
     * Sets the value of the dlRlcBytesTxPerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlRlcBytesTxPerQci(JAXBElement<Long> value) {
        this.dlRlcBytesTxPerQci = value;
    }

    /**
     * Gets the value of the dlRlcBytesReTxPerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDlRlcBytesReTxPerQci() {
        return dlRlcBytesReTxPerQci;
    }

    /**
     * Sets the value of the dlRlcBytesReTxPerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDlRlcBytesReTxPerQci(JAXBElement<Long> value) {
        this.dlRlcBytesReTxPerQci = value;
    }

    /**
     * Gets the value of the dlRlcThroughputPerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlRlcThroughputPerQci() {
        return dlRlcThroughputPerQci;
    }

    /**
     * Sets the value of the dlRlcThroughputPerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlRlcThroughputPerQci(JAXBElement<Double> value) {
        this.dlRlcThroughputPerQci = value;
    }

    /**
     * Gets the value of the ulRlcBytesRxPerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUlRlcBytesRxPerQci() {
        return ulRlcBytesRxPerQci;
    }

    /**
     * Sets the value of the ulRlcBytesRxPerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUlRlcBytesRxPerQci(JAXBElement<Long> value) {
        this.ulRlcBytesRxPerQci = value;
    }

    /**
     * Gets the value of the ulRlcThroughputPerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlRlcThroughputPerQci() {
        return ulRlcThroughputPerQci;
    }

    /**
     * Sets the value of the ulRlcThroughputPerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlRlcThroughputPerQci(JAXBElement<Double> value) {
        this.ulRlcThroughputPerQci = value;
    }

}
