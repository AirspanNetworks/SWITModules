
package Netspan.NBI_16_0.Statistics;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BsIbBaseTermRfStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BsIbBaseTermRfStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MsMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SysUpTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DlRssi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlRssi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinr1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinr3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlCinr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlFecCodeTypeMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DlFecCodeTypeMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UlFecCodeTypeMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UlFecCodeTypeMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DlZoneIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlBitsPerSymbol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UlBitsPerSymbol" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DlCinr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MsTxPower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MaxUlSubChannels" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UlRssiCh0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlRssiCh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlCinrCh0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlCinrCh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlCinrMimoA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UlCinrMimoB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlRssiCh0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlRssiCh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinrCh0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinrCh1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinrMimoA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DlCinrMimoB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AntennaDirection" type="{http://Airspan.Netspan.WebServices}AntennaDirectionValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BsIbBaseTermRfStatsRowWs", propOrder = {
    "node",
    "termName",
    "msMacAddress",
    "isRegistered",
    "dateAndTime",
    "sysUpTime",
    "dlRssi",
    "ulRssi",
    "dlCinr1",
    "dlCinr3",
    "ulCinr",
    "dlFecCodeTypeMin",
    "dlFecCodeTypeMax",
    "ulFecCodeTypeMin",
    "ulFecCodeTypeMax",
    "dlZoneIndex",
    "dlBitsPerSymbol",
    "ulBitsPerSymbol",
    "dlCinr",
    "msTxPower",
    "maxUlSubChannels",
    "ulRssiCh0",
    "ulRssiCh1",
    "ulCinrCh0",
    "ulCinrCh1",
    "ulCinrMimoA",
    "ulCinrMimoB",
    "dlRssiCh0",
    "dlRssiCh1",
    "dlCinrCh0",
    "dlCinrCh1",
    "dlCinrMimoA",
    "dlCinrMimoB",
    "antennaDirection"
})
public class BsIbBaseTermRfStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "TermName")
    protected String termName;
    @XmlElement(name = "MsMacAddress")
    protected String msMacAddress;
    @XmlElement(name = "IsRegistered")
    protected boolean isRegistered;
    @XmlElement(name = "DateAndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTime;
    @XmlElement(name = "SysUpTime")
    protected long sysUpTime;
    @XmlElementRef(name = "DlRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlRssi;
    @XmlElementRef(name = "UlRssi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulRssi;
    @XmlElementRef(name = "DlCinr1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinr1;
    @XmlElementRef(name = "DlCinr3", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinr3;
    @XmlElementRef(name = "UlCinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCinr;
    @XmlElement(name = "DlFecCodeTypeMin")
    protected String dlFecCodeTypeMin;
    @XmlElement(name = "DlFecCodeTypeMax")
    protected String dlFecCodeTypeMax;
    @XmlElement(name = "UlFecCodeTypeMin")
    protected String ulFecCodeTypeMin;
    @XmlElement(name = "UlFecCodeTypeMax")
    protected String ulFecCodeTypeMax;
    @XmlElementRef(name = "DlZoneIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlZoneIndex;
    @XmlElementRef(name = "DlBitsPerSymbol", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dlBitsPerSymbol;
    @XmlElementRef(name = "UlBitsPerSymbol", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ulBitsPerSymbol;
    @XmlElementRef(name = "DlCinr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinr;
    @XmlElementRef(name = "MsTxPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> msTxPower;
    @XmlElementRef(name = "MaxUlSubChannels", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxUlSubChannels;
    @XmlElementRef(name = "UlRssiCh0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulRssiCh0;
    @XmlElementRef(name = "UlRssiCh1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulRssiCh1;
    @XmlElementRef(name = "UlCinrCh0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCinrCh0;
    @XmlElementRef(name = "UlCinrCh1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCinrCh1;
    @XmlElementRef(name = "UlCinrMimoA", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCinrMimoA;
    @XmlElementRef(name = "UlCinrMimoB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulCinrMimoB;
    @XmlElementRef(name = "DlRssiCh0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlRssiCh0;
    @XmlElementRef(name = "DlRssiCh1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlRssiCh1;
    @XmlElementRef(name = "DlCinrCh0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinrCh0;
    @XmlElementRef(name = "DlCinrCh1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinrCh1;
    @XmlElementRef(name = "DlCinrMimoA", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinrMimoA;
    @XmlElementRef(name = "DlCinrMimoB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlCinrMimoB;
    @XmlElementRef(name = "AntennaDirection", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AntennaDirectionValues> antennaDirection;

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
     * Gets the value of the termName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermName() {
        return termName;
    }

    /**
     * Sets the value of the termName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermName(String value) {
        this.termName = value;
    }

    /**
     * Gets the value of the msMacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsMacAddress() {
        return msMacAddress;
    }

    /**
     * Sets the value of the msMacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsMacAddress(String value) {
        this.msMacAddress = value;
    }

    /**
     * Gets the value of the isRegistered property.
     * 
     */
    public boolean isIsRegistered() {
        return isRegistered;
    }

    /**
     * Sets the value of the isRegistered property.
     * 
     */
    public void setIsRegistered(boolean value) {
        this.isRegistered = value;
    }

    /**
     * Gets the value of the dateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Sets the value of the dateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTime(XMLGregorianCalendar value) {
        this.dateAndTime = value;
    }

    /**
     * Gets the value of the sysUpTime property.
     * 
     */
    public long getSysUpTime() {
        return sysUpTime;
    }

    /**
     * Sets the value of the sysUpTime property.
     * 
     */
    public void setSysUpTime(long value) {
        this.sysUpTime = value;
    }

    /**
     * Gets the value of the dlRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlRssi() {
        return dlRssi;
    }

    /**
     * Sets the value of the dlRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlRssi(JAXBElement<Double> value) {
        this.dlRssi = value;
    }

    /**
     * Gets the value of the ulRssi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlRssi() {
        return ulRssi;
    }

    /**
     * Sets the value of the ulRssi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlRssi(JAXBElement<Double> value) {
        this.ulRssi = value;
    }

    /**
     * Gets the value of the dlCinr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinr1() {
        return dlCinr1;
    }

    /**
     * Sets the value of the dlCinr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinr1(JAXBElement<Double> value) {
        this.dlCinr1 = value;
    }

    /**
     * Gets the value of the dlCinr3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinr3() {
        return dlCinr3;
    }

    /**
     * Sets the value of the dlCinr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinr3(JAXBElement<Double> value) {
        this.dlCinr3 = value;
    }

    /**
     * Gets the value of the ulCinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCinr() {
        return ulCinr;
    }

    /**
     * Sets the value of the ulCinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCinr(JAXBElement<Double> value) {
        this.ulCinr = value;
    }

    /**
     * Gets the value of the dlFecCodeTypeMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlFecCodeTypeMin() {
        return dlFecCodeTypeMin;
    }

    /**
     * Sets the value of the dlFecCodeTypeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlFecCodeTypeMin(String value) {
        this.dlFecCodeTypeMin = value;
    }

    /**
     * Gets the value of the dlFecCodeTypeMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlFecCodeTypeMax() {
        return dlFecCodeTypeMax;
    }

    /**
     * Sets the value of the dlFecCodeTypeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlFecCodeTypeMax(String value) {
        this.dlFecCodeTypeMax = value;
    }

    /**
     * Gets the value of the ulFecCodeTypeMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlFecCodeTypeMin() {
        return ulFecCodeTypeMin;
    }

    /**
     * Sets the value of the ulFecCodeTypeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlFecCodeTypeMin(String value) {
        this.ulFecCodeTypeMin = value;
    }

    /**
     * Gets the value of the ulFecCodeTypeMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlFecCodeTypeMax() {
        return ulFecCodeTypeMax;
    }

    /**
     * Sets the value of the ulFecCodeTypeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlFecCodeTypeMax(String value) {
        this.ulFecCodeTypeMax = value;
    }

    /**
     * Gets the value of the dlZoneIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlZoneIndex() {
        return dlZoneIndex;
    }

    /**
     * Sets the value of the dlZoneIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlZoneIndex(JAXBElement<Integer> value) {
        this.dlZoneIndex = value;
    }

    /**
     * Gets the value of the dlBitsPerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDlBitsPerSymbol() {
        return dlBitsPerSymbol;
    }

    /**
     * Sets the value of the dlBitsPerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDlBitsPerSymbol(JAXBElement<BigDecimal> value) {
        this.dlBitsPerSymbol = value;
    }

    /**
     * Gets the value of the ulBitsPerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUlBitsPerSymbol() {
        return ulBitsPerSymbol;
    }

    /**
     * Sets the value of the ulBitsPerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUlBitsPerSymbol(JAXBElement<BigDecimal> value) {
        this.ulBitsPerSymbol = value;
    }

    /**
     * Gets the value of the dlCinr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinr() {
        return dlCinr;
    }

    /**
     * Sets the value of the dlCinr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinr(JAXBElement<Double> value) {
        this.dlCinr = value;
    }

    /**
     * Gets the value of the msTxPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMsTxPower() {
        return msTxPower;
    }

    /**
     * Sets the value of the msTxPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMsTxPower(JAXBElement<Double> value) {
        this.msTxPower = value;
    }

    /**
     * Gets the value of the maxUlSubChannels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxUlSubChannels() {
        return maxUlSubChannels;
    }

    /**
     * Sets the value of the maxUlSubChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxUlSubChannels(JAXBElement<Integer> value) {
        this.maxUlSubChannels = value;
    }

    /**
     * Gets the value of the ulRssiCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlRssiCh0() {
        return ulRssiCh0;
    }

    /**
     * Sets the value of the ulRssiCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlRssiCh0(JAXBElement<Double> value) {
        this.ulRssiCh0 = value;
    }

    /**
     * Gets the value of the ulRssiCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlRssiCh1() {
        return ulRssiCh1;
    }

    /**
     * Sets the value of the ulRssiCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlRssiCh1(JAXBElement<Double> value) {
        this.ulRssiCh1 = value;
    }

    /**
     * Gets the value of the ulCinrCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCinrCh0() {
        return ulCinrCh0;
    }

    /**
     * Sets the value of the ulCinrCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCinrCh0(JAXBElement<Double> value) {
        this.ulCinrCh0 = value;
    }

    /**
     * Gets the value of the ulCinrCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCinrCh1() {
        return ulCinrCh1;
    }

    /**
     * Sets the value of the ulCinrCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCinrCh1(JAXBElement<Double> value) {
        this.ulCinrCh1 = value;
    }

    /**
     * Gets the value of the ulCinrMimoA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCinrMimoA() {
        return ulCinrMimoA;
    }

    /**
     * Sets the value of the ulCinrMimoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCinrMimoA(JAXBElement<Double> value) {
        this.ulCinrMimoA = value;
    }

    /**
     * Gets the value of the ulCinrMimoB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlCinrMimoB() {
        return ulCinrMimoB;
    }

    /**
     * Sets the value of the ulCinrMimoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlCinrMimoB(JAXBElement<Double> value) {
        this.ulCinrMimoB = value;
    }

    /**
     * Gets the value of the dlRssiCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlRssiCh0() {
        return dlRssiCh0;
    }

    /**
     * Sets the value of the dlRssiCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlRssiCh0(JAXBElement<Double> value) {
        this.dlRssiCh0 = value;
    }

    /**
     * Gets the value of the dlRssiCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlRssiCh1() {
        return dlRssiCh1;
    }

    /**
     * Sets the value of the dlRssiCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlRssiCh1(JAXBElement<Double> value) {
        this.dlRssiCh1 = value;
    }

    /**
     * Gets the value of the dlCinrCh0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinrCh0() {
        return dlCinrCh0;
    }

    /**
     * Sets the value of the dlCinrCh0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinrCh0(JAXBElement<Double> value) {
        this.dlCinrCh0 = value;
    }

    /**
     * Gets the value of the dlCinrCh1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinrCh1() {
        return dlCinrCh1;
    }

    /**
     * Sets the value of the dlCinrCh1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinrCh1(JAXBElement<Double> value) {
        this.dlCinrCh1 = value;
    }

    /**
     * Gets the value of the dlCinrMimoA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinrMimoA() {
        return dlCinrMimoA;
    }

    /**
     * Sets the value of the dlCinrMimoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinrMimoA(JAXBElement<Double> value) {
        this.dlCinrMimoA = value;
    }

    /**
     * Gets the value of the dlCinrMimoB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlCinrMimoB() {
        return dlCinrMimoB;
    }

    /**
     * Sets the value of the dlCinrMimoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlCinrMimoB(JAXBElement<Double> value) {
        this.dlCinrMimoB = value;
    }

    /**
     * Gets the value of the antennaDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AntennaDirectionValues }{@code >}
     *     
     */
    public JAXBElement<AntennaDirectionValues> getAntennaDirection() {
        return antennaDirection;
    }

    /**
     * Sets the value of the antennaDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AntennaDirectionValues }{@code >}
     *     
     */
    public void setAntennaDirection(JAXBElement<AntennaDirectionValues> value) {
        this.antennaDirection = value;
    }

}
