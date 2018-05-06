
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Ib440RfStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib440RfStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignalToNoise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxSignalStrengthCh0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxSignalStrengthCh1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxSignalStrengthCh0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxSignalStrengthCh1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxSignalStrength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TxRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RxRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="TxCcq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RxCcq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib440RfStatsRowWs", propOrder = {
    "node",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "macAddress",
    "signalToNoise",
    "txSignalStrengthCh0",
    "txSignalStrengthCh1",
    "rxSignalStrengthCh0",
    "rxSignalStrengthCh1",
    "txSignalStrength",
    "txRate",
    "rxRate",
    "txCcq",
    "rxCcq"
})
public class Ib440RfStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "MacAddress")
    protected String macAddress;
    @XmlElement(name = "SignalToNoise", required = true, type = Integer.class, nillable = true)
    protected Integer signalToNoise;
    @XmlElement(name = "TxSignalStrengthCh0", required = true, type = Integer.class, nillable = true)
    protected Integer txSignalStrengthCh0;
    @XmlElement(name = "TxSignalStrengthCh1", required = true, type = Integer.class, nillable = true)
    protected Integer txSignalStrengthCh1;
    @XmlElement(name = "RxSignalStrengthCh0", required = true, type = Integer.class, nillable = true)
    protected Integer rxSignalStrengthCh0;
    @XmlElement(name = "RxSignalStrengthCh1", required = true, type = Integer.class, nillable = true)
    protected Integer rxSignalStrengthCh1;
    @XmlElement(name = "TxSignalStrength", required = true, type = Integer.class, nillable = true)
    protected Integer txSignalStrength;
    @XmlElement(name = "TxRate", required = true, type = Float.class, nillable = true)
    protected Float txRate;
    @XmlElement(name = "RxRate", required = true, type = Float.class, nillable = true)
    protected Float rxRate;
    @XmlElement(name = "TxCcq", required = true, type = Integer.class, nillable = true)
    protected Integer txCcq;
    @XmlElement(name = "RxCcq", required = true, type = Integer.class, nillable = true)
    protected Integer rxCcq;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
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
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the signalToNoise property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignalToNoise() {
        return signalToNoise;
    }

    /**
     * Sets the value of the signalToNoise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignalToNoise(Integer value) {
        this.signalToNoise = value;
    }

    /**
     * Gets the value of the txSignalStrengthCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxSignalStrengthCh0() {
        return txSignalStrengthCh0;
    }

    /**
     * Sets the value of the txSignalStrengthCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxSignalStrengthCh0(Integer value) {
        this.txSignalStrengthCh0 = value;
    }

    /**
     * Gets the value of the txSignalStrengthCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxSignalStrengthCh1() {
        return txSignalStrengthCh1;
    }

    /**
     * Sets the value of the txSignalStrengthCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxSignalStrengthCh1(Integer value) {
        this.txSignalStrengthCh1 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxSignalStrengthCh0() {
        return rxSignalStrengthCh0;
    }

    /**
     * Sets the value of the rxSignalStrengthCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxSignalStrengthCh0(Integer value) {
        this.rxSignalStrengthCh0 = value;
    }

    /**
     * Gets the value of the rxSignalStrengthCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxSignalStrengthCh1() {
        return rxSignalStrengthCh1;
    }

    /**
     * Sets the value of the rxSignalStrengthCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxSignalStrengthCh1(Integer value) {
        this.rxSignalStrengthCh1 = value;
    }

    /**
     * Gets the value of the txSignalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxSignalStrength() {
        return txSignalStrength;
    }

    /**
     * Sets the value of the txSignalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxSignalStrength(Integer value) {
        this.txSignalStrength = value;
    }

    /**
     * Gets the value of the txRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTxRate() {
        return txRate;
    }

    /**
     * Sets the value of the txRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTxRate(Float value) {
        this.txRate = value;
    }

    /**
     * Gets the value of the rxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRxRate() {
        return rxRate;
    }

    /**
     * Sets the value of the rxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRxRate(Float value) {
        this.rxRate = value;
    }

    /**
     * Gets the value of the txCcq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTxCcq() {
        return txCcq;
    }

    /**
     * Sets the value of the txCcq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTxCcq(Integer value) {
        this.txCcq = value;
    }

    /**
     * Gets the value of the rxCcq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRxCcq() {
        return rxCcq;
    }

    /**
     * Sets the value of the rxCcq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRxCcq(Integer value) {
        this.rxCcq = value;
    }

}
