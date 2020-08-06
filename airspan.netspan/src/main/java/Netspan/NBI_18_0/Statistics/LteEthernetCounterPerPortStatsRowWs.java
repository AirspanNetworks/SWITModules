
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
 * <p>Java class for LteEthernetCounterPerPortStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteEthernetCounterPerPortStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmitEthernetFrames" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransmitEthernetBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransmitEthernetErronousFrames" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TransmitErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TransmitLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveEthernetFrames" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveEthernetBytes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveEthernetErronousFrames" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ReceiveLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEthernetCounterPerPortStatsRowWs", propOrder = {
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "portName",
    "transmitEthernetFrames",
    "transmitEthernetBytes",
    "transmitEthernetErronousFrames",
    "transmitErrorRate",
    "transmitLinkUsage",
    "receiveEthernetFrames",
    "receiveEthernetBytes",
    "receiveEthernetErronousFrames",
    "receiveErrorRate",
    "receiveLinkUsage"
})
public class LteEthernetCounterPerPortStatsRowWs {

    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElement(name = "PortName")
    protected String portName;
    @XmlElementRef(name = "TransmitEthernetFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transmitEthernetFrames;
    @XmlElementRef(name = "TransmitEthernetBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transmitEthernetBytes;
    @XmlElementRef(name = "TransmitEthernetErronousFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> transmitEthernetErronousFrames;
    @XmlElementRef(name = "TransmitErrorRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> transmitErrorRate;
    @XmlElementRef(name = "TransmitLinkUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> transmitLinkUsage;
    @XmlElementRef(name = "ReceiveEthernetFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> receiveEthernetFrames;
    @XmlElementRef(name = "ReceiveEthernetBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> receiveEthernetBytes;
    @XmlElementRef(name = "ReceiveEthernetErronousFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> receiveEthernetErronousFrames;
    @XmlElementRef(name = "ReceiveErrorRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receiveErrorRate;
    @XmlElementRef(name = "ReceiveLinkUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> receiveLinkUsage;

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
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
    }

    /**
     * Gets the value of the transmitEthernetFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransmitEthernetFrames() {
        return transmitEthernetFrames;
    }

    /**
     * Sets the value of the transmitEthernetFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransmitEthernetFrames(JAXBElement<Long> value) {
        this.transmitEthernetFrames = value;
    }

    /**
     * Gets the value of the transmitEthernetBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransmitEthernetBytes() {
        return transmitEthernetBytes;
    }

    /**
     * Sets the value of the transmitEthernetBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransmitEthernetBytes(JAXBElement<Long> value) {
        this.transmitEthernetBytes = value;
    }

    /**
     * Gets the value of the transmitEthernetErronousFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTransmitEthernetErronousFrames() {
        return transmitEthernetErronousFrames;
    }

    /**
     * Sets the value of the transmitEthernetErronousFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTransmitEthernetErronousFrames(JAXBElement<Long> value) {
        this.transmitEthernetErronousFrames = value;
    }

    /**
     * Gets the value of the transmitErrorRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTransmitErrorRate() {
        return transmitErrorRate;
    }

    /**
     * Sets the value of the transmitErrorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTransmitErrorRate(JAXBElement<Double> value) {
        this.transmitErrorRate = value;
    }

    /**
     * Gets the value of the transmitLinkUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTransmitLinkUsage() {
        return transmitLinkUsage;
    }

    /**
     * Sets the value of the transmitLinkUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTransmitLinkUsage(JAXBElement<Double> value) {
        this.transmitLinkUsage = value;
    }

    /**
     * Gets the value of the receiveEthernetFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReceiveEthernetFrames() {
        return receiveEthernetFrames;
    }

    /**
     * Sets the value of the receiveEthernetFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReceiveEthernetFrames(JAXBElement<Long> value) {
        this.receiveEthernetFrames = value;
    }

    /**
     * Gets the value of the receiveEthernetBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReceiveEthernetBytes() {
        return receiveEthernetBytes;
    }

    /**
     * Sets the value of the receiveEthernetBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReceiveEthernetBytes(JAXBElement<Long> value) {
        this.receiveEthernetBytes = value;
    }

    /**
     * Gets the value of the receiveEthernetErronousFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReceiveEthernetErronousFrames() {
        return receiveEthernetErronousFrames;
    }

    /**
     * Sets the value of the receiveEthernetErronousFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReceiveEthernetErronousFrames(JAXBElement<Long> value) {
        this.receiveEthernetErronousFrames = value;
    }

    /**
     * Gets the value of the receiveErrorRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceiveErrorRate() {
        return receiveErrorRate;
    }

    /**
     * Sets the value of the receiveErrorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceiveErrorRate(JAXBElement<Double> value) {
        this.receiveErrorRate = value;
    }

    /**
     * Gets the value of the receiveLinkUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getReceiveLinkUsage() {
        return receiveLinkUsage;
    }

    /**
     * Sets the value of the receiveLinkUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setReceiveLinkUsage(JAXBElement<Double> value) {
        this.receiveLinkUsage = value;
    }

}
