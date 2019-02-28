
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
 * <p>Java class for IbMmWirelessStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IbMmWirelessStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaMaxClients" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaTxPower1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaTxPower2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxPower1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxPower2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxNoise1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxNoise2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaSnr1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaSnr2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxMcs1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaRxMcs2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaTotalRxPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaPhyTxRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MimosaPhyRxRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IbMmWirelessStatsRowWs", propOrder = {
    "dateTimeStart",
    "dateTimeEnd",
    "granularityPeriod",
    "mimosaMaxClients",
    "mimosaTxPower1",
    "mimosaTxPower2",
    "mimosaRxPower1",
    "mimosaRxPower2",
    "mimosaRxNoise1",
    "mimosaRxNoise2",
    "mimosaSnr1",
    "mimosaSnr2",
    "mimosaRxMcs1",
    "mimosaRxMcs2",
    "mimosaTotalRxPower",
    "mimosaPhyTxRate",
    "mimosaPhyRxRate"
})
public class IbMmWirelessStatsRowWs {

    @XmlElement(name = "DateTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStart;
    @XmlElement(name = "DateTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "MimosaMaxClients", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaMaxClients;
    @XmlElementRef(name = "MimosaTxPower1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaTxPower1;
    @XmlElementRef(name = "MimosaTxPower2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaTxPower2;
    @XmlElementRef(name = "MimosaRxPower1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxPower1;
    @XmlElementRef(name = "MimosaRxPower2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxPower2;
    @XmlElementRef(name = "MimosaRxNoise1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxNoise1;
    @XmlElementRef(name = "MimosaRxNoise2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxNoise2;
    @XmlElementRef(name = "MimosaSnr1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaSnr1;
    @XmlElementRef(name = "MimosaSnr2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaSnr2;
    @XmlElementRef(name = "MimosaRxMcs1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxMcs1;
    @XmlElementRef(name = "MimosaRxMcs2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaRxMcs2;
    @XmlElementRef(name = "MimosaTotalRxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaTotalRxPower;
    @XmlElementRef(name = "MimosaPhyTxRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaPhyTxRate;
    @XmlElementRef(name = "MimosaPhyRxRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mimosaPhyRxRate;

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
     * Gets the value of the mimosaMaxClients property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaMaxClients() {
        return mimosaMaxClients;
    }

    /**
     * Sets the value of the mimosaMaxClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaMaxClients(JAXBElement<Integer> value) {
        this.mimosaMaxClients = value;
    }

    /**
     * Gets the value of the mimosaTxPower1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaTxPower1() {
        return mimosaTxPower1;
    }

    /**
     * Sets the value of the mimosaTxPower1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaTxPower1(JAXBElement<Integer> value) {
        this.mimosaTxPower1 = value;
    }

    /**
     * Gets the value of the mimosaTxPower2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaTxPower2() {
        return mimosaTxPower2;
    }

    /**
     * Sets the value of the mimosaTxPower2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaTxPower2(JAXBElement<Integer> value) {
        this.mimosaTxPower2 = value;
    }

    /**
     * Gets the value of the mimosaRxPower1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxPower1() {
        return mimosaRxPower1;
    }

    /**
     * Sets the value of the mimosaRxPower1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxPower1(JAXBElement<Integer> value) {
        this.mimosaRxPower1 = value;
    }

    /**
     * Gets the value of the mimosaRxPower2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxPower2() {
        return mimosaRxPower2;
    }

    /**
     * Sets the value of the mimosaRxPower2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxPower2(JAXBElement<Integer> value) {
        this.mimosaRxPower2 = value;
    }

    /**
     * Gets the value of the mimosaRxNoise1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxNoise1() {
        return mimosaRxNoise1;
    }

    /**
     * Sets the value of the mimosaRxNoise1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxNoise1(JAXBElement<Integer> value) {
        this.mimosaRxNoise1 = value;
    }

    /**
     * Gets the value of the mimosaRxNoise2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxNoise2() {
        return mimosaRxNoise2;
    }

    /**
     * Sets the value of the mimosaRxNoise2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxNoise2(JAXBElement<Integer> value) {
        this.mimosaRxNoise2 = value;
    }

    /**
     * Gets the value of the mimosaSnr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaSnr1() {
        return mimosaSnr1;
    }

    /**
     * Sets the value of the mimosaSnr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaSnr1(JAXBElement<Integer> value) {
        this.mimosaSnr1 = value;
    }

    /**
     * Gets the value of the mimosaSnr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaSnr2() {
        return mimosaSnr2;
    }

    /**
     * Sets the value of the mimosaSnr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaSnr2(JAXBElement<Integer> value) {
        this.mimosaSnr2 = value;
    }

    /**
     * Gets the value of the mimosaRxMcs1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxMcs1() {
        return mimosaRxMcs1;
    }

    /**
     * Sets the value of the mimosaRxMcs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxMcs1(JAXBElement<Integer> value) {
        this.mimosaRxMcs1 = value;
    }

    /**
     * Gets the value of the mimosaRxMcs2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaRxMcs2() {
        return mimosaRxMcs2;
    }

    /**
     * Sets the value of the mimosaRxMcs2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaRxMcs2(JAXBElement<Integer> value) {
        this.mimosaRxMcs2 = value;
    }

    /**
     * Gets the value of the mimosaTotalRxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaTotalRxPower() {
        return mimosaTotalRxPower;
    }

    /**
     * Sets the value of the mimosaTotalRxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaTotalRxPower(JAXBElement<Integer> value) {
        this.mimosaTotalRxPower = value;
    }

    /**
     * Gets the value of the mimosaPhyTxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaPhyTxRate() {
        return mimosaPhyTxRate;
    }

    /**
     * Sets the value of the mimosaPhyTxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaPhyTxRate(JAXBElement<Integer> value) {
        this.mimosaPhyTxRate = value;
    }

    /**
     * Gets the value of the mimosaPhyRxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMimosaPhyRxRate() {
        return mimosaPhyRxRate;
    }

    /**
     * Sets the value of the mimosaPhyRxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMimosaPhyRxRate(JAXBElement<Integer> value) {
        this.mimosaPhyRxRate = value;
    }

}
