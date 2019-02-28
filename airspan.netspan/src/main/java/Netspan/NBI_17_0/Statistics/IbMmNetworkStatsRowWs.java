
package Netspan.NBI_17_0.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IbMmNetworkStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbMmNetworkStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IfOutOctets1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutOctets2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutUcastPkts1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutUcastPkts2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutNUcastPkts1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IfOutNUcastPkts2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbMmNetworkStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "ifOutOctets1",
    "ifOutOctets2",
    "ifOutUcastPkts1",
    "ifOutUcastPkts2",
    "ifOutNUcastPkts1",
    "ifOutNUcastPkts2"
})
public class IbMmNetworkStatsRowWs {

    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "IfOutOctets1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutOctets1;
    @XmlElementRef(name = "IfOutOctets2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutOctets2;
    @XmlElementRef(name = "IfOutUcastPkts1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutUcastPkts1;
    @XmlElementRef(name = "IfOutUcastPkts2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutUcastPkts2;
    @XmlElementRef(name = "IfOutNUcastPkts1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutNUcastPkts1;
    @XmlElementRef(name = "IfOutNUcastPkts2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> ifOutNUcastPkts2;

    /**
     * Gets the value of the dateTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStart() {
        return dateTimeStart;
    }

    /**
     * Sets the value of the dateTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStart(XMLGregorianCalendar value) {
        this.dateTimeStart = value;
    }

    /**
     * Gets the value of the dateTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeEnd() {
        return dateTimeEnd;
    }

    /**
     * Sets the value of the dateTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeEnd(XMLGregorianCalendar value) {
        this.dateTimeEnd = value;
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
     * Gets the value of the ifOutOctets1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutOctets1() {
        return ifOutOctets1;
    }

    /**
     * Sets the value of the ifOutOctets1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutOctets1(JAXBElement<Long> value) {
        this.ifOutOctets1 = value;
    }

    /**
     * Gets the value of the ifOutOctets2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutOctets2() {
        return ifOutOctets2;
    }

    /**
     * Sets the value of the ifOutOctets2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutOctets2(JAXBElement<Long> value) {
        this.ifOutOctets2 = value;
    }

    /**
     * Gets the value of the ifOutUcastPkts1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutUcastPkts1() {
        return ifOutUcastPkts1;
    }

    /**
     * Sets the value of the ifOutUcastPkts1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutUcastPkts1(JAXBElement<Long> value) {
        this.ifOutUcastPkts1 = value;
    }

    /**
     * Gets the value of the ifOutUcastPkts2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutUcastPkts2() {
        return ifOutUcastPkts2;
    }

    /**
     * Sets the value of the ifOutUcastPkts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutUcastPkts2(JAXBElement<Long> value) {
        this.ifOutUcastPkts2 = value;
    }

    /**
     * Gets the value of the ifOutNUcastPkts1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutNUcastPkts1() {
        return ifOutNUcastPkts1;
    }

    /**
     * Sets the value of the ifOutNUcastPkts1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutNUcastPkts1(JAXBElement<Long> value) {
        this.ifOutNUcastPkts1 = value;
    }

    /**
     * Gets the value of the ifOutNUcastPkts2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIfOutNUcastPkts2() {
        return ifOutNUcastPkts2;
    }

    /**
     * Sets the value of the ifOutNUcastPkts2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIfOutNUcastPkts2(JAXBElement<Long> value) {
        this.ifOutNUcastPkts2 = value;
    }

}
