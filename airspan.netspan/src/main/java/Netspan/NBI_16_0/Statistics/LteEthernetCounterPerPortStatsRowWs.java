
package Netspan.NBI_16_0.Statistics;

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
 * &lt;complexType name="LteEthernetCounterPerPortStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PortNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransmitEthernetFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransmitEthernetBytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransmitEthernetErronousFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransmitErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TransmitLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReceiveEthernetFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiveEthernetBytes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiveEthernetErronousFrames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReceiveErrorRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReceiveLinkUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteEthernetCounterPerPortStatsRowWs", propOrder = {
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "portNumber",
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
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElementRef(name = "PortNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> portNumber;
    @XmlElementRef(name = "TransmitEthernetFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transmitEthernetFrames;
    @XmlElementRef(name = "TransmitEthernetBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transmitEthernetBytes;
    @XmlElementRef(name = "TransmitEthernetErronousFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transmitEthernetErronousFrames;
    @XmlElementRef(name = "TransmitErrorRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> transmitErrorRate;
    @XmlElementRef(name = "TransmitLinkUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> transmitLinkUsage;
    @XmlElementRef(name = "ReceiveEthernetFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> receiveEthernetFrames;
    @XmlElementRef(name = "ReceiveEthernetBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> receiveEthernetBytes;
    @XmlElementRef(name = "ReceiveEthernetErronousFrames", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> receiveEthernetErronousFrames;
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
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPortNumber(JAXBElement<Integer> value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the transmitEthernetFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransmitEthernetFrames() {
        return transmitEthernetFrames;
    }

    /**
     * Sets the value of the transmitEthernetFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransmitEthernetFrames(JAXBElement<Integer> value) {
        this.transmitEthernetFrames = value;
    }

    /**
     * Gets the value of the transmitEthernetBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransmitEthernetBytes() {
        return transmitEthernetBytes;
    }

    /**
     * Sets the value of the transmitEthernetBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransmitEthernetBytes(JAXBElement<Integer> value) {
        this.transmitEthernetBytes = value;
    }

    /**
     * Gets the value of the transmitEthernetErronousFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransmitEthernetErronousFrames() {
        return transmitEthernetErronousFrames;
    }

    /**
     * Sets the value of the transmitEthernetErronousFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransmitEthernetErronousFrames(JAXBElement<Integer> value) {
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
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReceiveEthernetFrames() {
        return receiveEthernetFrames;
    }

    /**
     * Sets the value of the receiveEthernetFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReceiveEthernetFrames(JAXBElement<Integer> value) {
        this.receiveEthernetFrames = value;
    }

    /**
     * Gets the value of the receiveEthernetBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReceiveEthernetBytes() {
        return receiveEthernetBytes;
    }

    /**
     * Sets the value of the receiveEthernetBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReceiveEthernetBytes(JAXBElement<Integer> value) {
        this.receiveEthernetBytes = value;
    }

    /**
     * Gets the value of the receiveEthernetErronousFrames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReceiveEthernetErronousFrames() {
        return receiveEthernetErronousFrames;
    }

    /**
     * Sets the value of the receiveEthernetErronousFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReceiveEthernetErronousFrames(JAXBElement<Integer> value) {
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
