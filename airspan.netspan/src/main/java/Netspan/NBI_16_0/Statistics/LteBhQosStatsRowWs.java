
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
 * <p>Java class for LteBhQosStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBhQosStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeatAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeatSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeatPrmntErrFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeat409conflictFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeatOtherTransientFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosHeartbeatTimeoutFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosVolteCallsHandedOverAndRejected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BhqosD1CbrAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1CbrSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1CbrPgwFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1CbrPrmntErrFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1Cbr409ConflictFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1CbrOtherTransientFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD1CbrTimeoutFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrOtherPgwFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrPrmntErrFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2Cbr409ConflictFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrOtherTransientFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrTimeoutFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosD2CbrRsrcShrtFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampS1UPacketLoss" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampS1UDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampS1URtd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TwampS1UJitter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosMbrAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosMbrSucc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosMbrOtherPgwFail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BhqosMbrPrmntErrFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosMbr409ConflictFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BhqosMbrTransientFail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BhqosMbrTimeoutFail" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBhQosStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "bhqosHeartbeatAttempt",
    "bhqosHeartbeatSucc",
    "bhqosHeartbeatPrmntErrFail",
    "bhqosHeartbeat409ConflictFail",
    "bhqosHeartbeatOtherTransientFail",
    "bhqosHeartbeatTimeoutFail",
    "bhqosVolteCallsHandedOverAndRejected",
    "bhqosD1CbrAttempt",
    "bhqosD1CbrSucc",
    "bhqosD1CbrPgwFail",
    "bhqosD1CbrPrmntErrFail",
    "bhqosD1Cbr409ConflictFail",
    "bhqosD1CbrOtherTransientFail",
    "bhqosD1CbrTimeoutFail",
    "bhqosD2CbrAttempt",
    "bhqosD2CbrSucc",
    "bhqosD2CbrOtherPgwFail",
    "bhqosD2CbrPrmntErrFail",
    "bhqosD2Cbr409ConflictFail",
    "bhqosD2CbrOtherTransientFail",
    "bhqosD2CbrTimeoutFail",
    "bhqosD2CbrRsrcShrtFail",
    "twampS1UPacketLoss",
    "twampS1UDelay",
    "twampS1URtd",
    "twampS1UJitter",
    "bhqosMbrAttempt",
    "bhqosMbrSucc",
    "bhqosMbrOtherPgwFail",
    "bhqosMbrPrmntErrFail",
    "bhqosMbr409ConflictFail",
    "bhqosMbrTransientFail",
    "bhqosMbrTimeoutFail"
})
public class LteBhQosStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "BhqosHeartbeatAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeatAttempt;
    @XmlElementRef(name = "BhqosHeartbeatSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeatSucc;
    @XmlElementRef(name = "BhqosHeartbeatPrmntErrFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeatPrmntErrFail;
    @XmlElementRef(name = "BhqosHeartbeat409conflictFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeat409ConflictFail;
    @XmlElementRef(name = "BhqosHeartbeatOtherTransientFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeatOtherTransientFail;
    @XmlElementRef(name = "BhqosHeartbeatTimeoutFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosHeartbeatTimeoutFail;
    @XmlElement(name = "BhqosVolteCallsHandedOverAndRejected", required = true, type = Integer.class, nillable = true)
    protected Integer bhqosVolteCallsHandedOverAndRejected;
    @XmlElementRef(name = "BhqosD1CbrAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrAttempt;
    @XmlElementRef(name = "BhqosD1CbrSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrSucc;
    @XmlElementRef(name = "BhqosD1CbrPgwFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrPgwFail;
    @XmlElementRef(name = "BhqosD1CbrPrmntErrFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrPrmntErrFail;
    @XmlElementRef(name = "BhqosD1Cbr409ConflictFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1Cbr409ConflictFail;
    @XmlElementRef(name = "BhqosD1CbrOtherTransientFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrOtherTransientFail;
    @XmlElementRef(name = "BhqosD1CbrTimeoutFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD1CbrTimeoutFail;
    @XmlElementRef(name = "BhqosD2CbrAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrAttempt;
    @XmlElementRef(name = "BhqosD2CbrSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrSucc;
    @XmlElementRef(name = "BhqosD2CbrOtherPgwFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrOtherPgwFail;
    @XmlElementRef(name = "BhqosD2CbrPrmntErrFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrPrmntErrFail;
    @XmlElementRef(name = "BhqosD2Cbr409ConflictFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2Cbr409ConflictFail;
    @XmlElementRef(name = "BhqosD2CbrOtherTransientFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrOtherTransientFail;
    @XmlElementRef(name = "BhqosD2CbrTimeoutFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrTimeoutFail;
    @XmlElementRef(name = "BhqosD2CbrRsrcShrtFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosD2CbrRsrcShrtFail;
    @XmlElementRef(name = "TwampS1UPacketLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampS1UPacketLoss;
    @XmlElementRef(name = "TwampS1UDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampS1UDelay;
    @XmlElementRef(name = "TwampS1URtd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampS1URtd;
    @XmlElementRef(name = "TwampS1UJitter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> twampS1UJitter;
    @XmlElementRef(name = "BhqosMbrAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosMbrAttempt;
    @XmlElementRef(name = "BhqosMbrSucc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosMbrSucc;
    @XmlElement(name = "BhqosMbrOtherPgwFail", required = true, type = Integer.class, nillable = true)
    protected Integer bhqosMbrOtherPgwFail;
    @XmlElementRef(name = "BhqosMbrPrmntErrFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosMbrPrmntErrFail;
    @XmlElementRef(name = "BhqosMbr409ConflictFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosMbr409ConflictFail;
    @XmlElement(name = "BhqosMbrTransientFail", required = true, type = Integer.class, nillable = true)
    protected Integer bhqosMbrTransientFail;
    @XmlElementRef(name = "BhqosMbrTimeoutFail", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bhqosMbrTimeoutFail;

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
     * Gets the value of the bhqosHeartbeatAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeatAttempt() {
        return bhqosHeartbeatAttempt;
    }

    /**
     * Sets the value of the bhqosHeartbeatAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeatAttempt(JAXBElement<Integer> value) {
        this.bhqosHeartbeatAttempt = value;
    }

    /**
     * Gets the value of the bhqosHeartbeatSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeatSucc() {
        return bhqosHeartbeatSucc;
    }

    /**
     * Sets the value of the bhqosHeartbeatSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeatSucc(JAXBElement<Integer> value) {
        this.bhqosHeartbeatSucc = value;
    }

    /**
     * Gets the value of the bhqosHeartbeatPrmntErrFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeatPrmntErrFail() {
        return bhqosHeartbeatPrmntErrFail;
    }

    /**
     * Sets the value of the bhqosHeartbeatPrmntErrFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeatPrmntErrFail(JAXBElement<Integer> value) {
        this.bhqosHeartbeatPrmntErrFail = value;
    }

    /**
     * Gets the value of the bhqosHeartbeat409ConflictFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeat409ConflictFail() {
        return bhqosHeartbeat409ConflictFail;
    }

    /**
     * Sets the value of the bhqosHeartbeat409ConflictFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeat409ConflictFail(JAXBElement<Integer> value) {
        this.bhqosHeartbeat409ConflictFail = value;
    }

    /**
     * Gets the value of the bhqosHeartbeatOtherTransientFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeatOtherTransientFail() {
        return bhqosHeartbeatOtherTransientFail;
    }

    /**
     * Sets the value of the bhqosHeartbeatOtherTransientFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeatOtherTransientFail(JAXBElement<Integer> value) {
        this.bhqosHeartbeatOtherTransientFail = value;
    }

    /**
     * Gets the value of the bhqosHeartbeatTimeoutFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosHeartbeatTimeoutFail() {
        return bhqosHeartbeatTimeoutFail;
    }

    /**
     * Sets the value of the bhqosHeartbeatTimeoutFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosHeartbeatTimeoutFail(JAXBElement<Integer> value) {
        this.bhqosHeartbeatTimeoutFail = value;
    }

    /**
     * Gets the value of the bhqosVolteCallsHandedOverAndRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBhqosVolteCallsHandedOverAndRejected() {
        return bhqosVolteCallsHandedOverAndRejected;
    }

    /**
     * Sets the value of the bhqosVolteCallsHandedOverAndRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBhqosVolteCallsHandedOverAndRejected(Integer value) {
        this.bhqosVolteCallsHandedOverAndRejected = value;
    }

    /**
     * Gets the value of the bhqosD1CbrAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrAttempt() {
        return bhqosD1CbrAttempt;
    }

    /**
     * Sets the value of the bhqosD1CbrAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrAttempt(JAXBElement<Integer> value) {
        this.bhqosD1CbrAttempt = value;
    }

    /**
     * Gets the value of the bhqosD1CbrSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrSucc() {
        return bhqosD1CbrSucc;
    }

    /**
     * Sets the value of the bhqosD1CbrSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrSucc(JAXBElement<Integer> value) {
        this.bhqosD1CbrSucc = value;
    }

    /**
     * Gets the value of the bhqosD1CbrPgwFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrPgwFail() {
        return bhqosD1CbrPgwFail;
    }

    /**
     * Sets the value of the bhqosD1CbrPgwFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrPgwFail(JAXBElement<Integer> value) {
        this.bhqosD1CbrPgwFail = value;
    }

    /**
     * Gets the value of the bhqosD1CbrPrmntErrFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrPrmntErrFail() {
        return bhqosD1CbrPrmntErrFail;
    }

    /**
     * Sets the value of the bhqosD1CbrPrmntErrFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrPrmntErrFail(JAXBElement<Integer> value) {
        this.bhqosD1CbrPrmntErrFail = value;
    }

    /**
     * Gets the value of the bhqosD1Cbr409ConflictFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1Cbr409ConflictFail() {
        return bhqosD1Cbr409ConflictFail;
    }

    /**
     * Sets the value of the bhqosD1Cbr409ConflictFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1Cbr409ConflictFail(JAXBElement<Integer> value) {
        this.bhqosD1Cbr409ConflictFail = value;
    }

    /**
     * Gets the value of the bhqosD1CbrOtherTransientFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrOtherTransientFail() {
        return bhqosD1CbrOtherTransientFail;
    }

    /**
     * Sets the value of the bhqosD1CbrOtherTransientFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrOtherTransientFail(JAXBElement<Integer> value) {
        this.bhqosD1CbrOtherTransientFail = value;
    }

    /**
     * Gets the value of the bhqosD1CbrTimeoutFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD1CbrTimeoutFail() {
        return bhqosD1CbrTimeoutFail;
    }

    /**
     * Sets the value of the bhqosD1CbrTimeoutFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD1CbrTimeoutFail(JAXBElement<Integer> value) {
        this.bhqosD1CbrTimeoutFail = value;
    }

    /**
     * Gets the value of the bhqosD2CbrAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrAttempt() {
        return bhqosD2CbrAttempt;
    }

    /**
     * Sets the value of the bhqosD2CbrAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrAttempt(JAXBElement<Integer> value) {
        this.bhqosD2CbrAttempt = value;
    }

    /**
     * Gets the value of the bhqosD2CbrSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrSucc() {
        return bhqosD2CbrSucc;
    }

    /**
     * Sets the value of the bhqosD2CbrSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrSucc(JAXBElement<Integer> value) {
        this.bhqosD2CbrSucc = value;
    }

    /**
     * Gets the value of the bhqosD2CbrOtherPgwFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrOtherPgwFail() {
        return bhqosD2CbrOtherPgwFail;
    }

    /**
     * Sets the value of the bhqosD2CbrOtherPgwFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrOtherPgwFail(JAXBElement<Integer> value) {
        this.bhqosD2CbrOtherPgwFail = value;
    }

    /**
     * Gets the value of the bhqosD2CbrPrmntErrFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrPrmntErrFail() {
        return bhqosD2CbrPrmntErrFail;
    }

    /**
     * Sets the value of the bhqosD2CbrPrmntErrFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrPrmntErrFail(JAXBElement<Integer> value) {
        this.bhqosD2CbrPrmntErrFail = value;
    }

    /**
     * Gets the value of the bhqosD2Cbr409ConflictFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2Cbr409ConflictFail() {
        return bhqosD2Cbr409ConflictFail;
    }

    /**
     * Sets the value of the bhqosD2Cbr409ConflictFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2Cbr409ConflictFail(JAXBElement<Integer> value) {
        this.bhqosD2Cbr409ConflictFail = value;
    }

    /**
     * Gets the value of the bhqosD2CbrOtherTransientFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrOtherTransientFail() {
        return bhqosD2CbrOtherTransientFail;
    }

    /**
     * Sets the value of the bhqosD2CbrOtherTransientFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrOtherTransientFail(JAXBElement<Integer> value) {
        this.bhqosD2CbrOtherTransientFail = value;
    }

    /**
     * Gets the value of the bhqosD2CbrTimeoutFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrTimeoutFail() {
        return bhqosD2CbrTimeoutFail;
    }

    /**
     * Sets the value of the bhqosD2CbrTimeoutFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrTimeoutFail(JAXBElement<Integer> value) {
        this.bhqosD2CbrTimeoutFail = value;
    }

    /**
     * Gets the value of the bhqosD2CbrRsrcShrtFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosD2CbrRsrcShrtFail() {
        return bhqosD2CbrRsrcShrtFail;
    }

    /**
     * Sets the value of the bhqosD2CbrRsrcShrtFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosD2CbrRsrcShrtFail(JAXBElement<Integer> value) {
        this.bhqosD2CbrRsrcShrtFail = value;
    }

    /**
     * Gets the value of the twampS1UPacketLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampS1UPacketLoss() {
        return twampS1UPacketLoss;
    }

    /**
     * Sets the value of the twampS1UPacketLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampS1UPacketLoss(JAXBElement<Integer> value) {
        this.twampS1UPacketLoss = value;
    }

    /**
     * Gets the value of the twampS1UDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampS1UDelay() {
        return twampS1UDelay;
    }

    /**
     * Sets the value of the twampS1UDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampS1UDelay(JAXBElement<Integer> value) {
        this.twampS1UDelay = value;
    }

    /**
     * Gets the value of the twampS1URtd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampS1URtd() {
        return twampS1URtd;
    }

    /**
     * Sets the value of the twampS1URtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampS1URtd(JAXBElement<Integer> value) {
        this.twampS1URtd = value;
    }

    /**
     * Gets the value of the twampS1UJitter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTwampS1UJitter() {
        return twampS1UJitter;
    }

    /**
     * Sets the value of the twampS1UJitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTwampS1UJitter(JAXBElement<Integer> value) {
        this.twampS1UJitter = value;
    }

    /**
     * Gets the value of the bhqosMbrAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosMbrAttempt() {
        return bhqosMbrAttempt;
    }

    /**
     * Sets the value of the bhqosMbrAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosMbrAttempt(JAXBElement<Integer> value) {
        this.bhqosMbrAttempt = value;
    }

    /**
     * Gets the value of the bhqosMbrSucc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosMbrSucc() {
        return bhqosMbrSucc;
    }

    /**
     * Sets the value of the bhqosMbrSucc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosMbrSucc(JAXBElement<Integer> value) {
        this.bhqosMbrSucc = value;
    }

    /**
     * Gets the value of the bhqosMbrOtherPgwFail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBhqosMbrOtherPgwFail() {
        return bhqosMbrOtherPgwFail;
    }

    /**
     * Sets the value of the bhqosMbrOtherPgwFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBhqosMbrOtherPgwFail(Integer value) {
        this.bhqosMbrOtherPgwFail = value;
    }

    /**
     * Gets the value of the bhqosMbrPrmntErrFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosMbrPrmntErrFail() {
        return bhqosMbrPrmntErrFail;
    }

    /**
     * Sets the value of the bhqosMbrPrmntErrFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosMbrPrmntErrFail(JAXBElement<Integer> value) {
        this.bhqosMbrPrmntErrFail = value;
    }

    /**
     * Gets the value of the bhqosMbr409ConflictFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosMbr409ConflictFail() {
        return bhqosMbr409ConflictFail;
    }

    /**
     * Sets the value of the bhqosMbr409ConflictFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosMbr409ConflictFail(JAXBElement<Integer> value) {
        this.bhqosMbr409ConflictFail = value;
    }

    /**
     * Gets the value of the bhqosMbrTransientFail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBhqosMbrTransientFail() {
        return bhqosMbrTransientFail;
    }

    /**
     * Sets the value of the bhqosMbrTransientFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBhqosMbrTransientFail(Integer value) {
        this.bhqosMbrTransientFail = value;
    }

    /**
     * Gets the value of the bhqosMbrTimeoutFail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBhqosMbrTimeoutFail() {
        return bhqosMbrTimeoutFail;
    }

    /**
     * Sets the value of the bhqosMbrTimeoutFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBhqosMbrTimeoutFail(JAXBElement<Integer> value) {
        this.bhqosMbrTimeoutFail = value;
    }

}
