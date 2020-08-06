
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
 * <p>Java class for BsIbBaseTermDataStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BsIbBaseTermDataStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TermName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SysUpTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="UlBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlBytes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqUlAcks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqUlNacks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqDlAcks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="HarqDlNacks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlPackets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlPackets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlHarqLoss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlHarqLoss" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FtNullingQi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BsIbBaseTermDataStatsRowWs", propOrder = {
    "node",
    "termName",
    "msMacAddress",
    "isRegistered",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "sysUpTime",
    "ulBytes",
    "dlBytes",
    "harqUlAcks",
    "harqUlNacks",
    "harqDlAcks",
    "harqDlNacks",
    "ulPackets",
    "dlPackets",
    "ulHarqLoss",
    "dlHarqLoss",
    "ftNullingQi"
})
public class BsIbBaseTermDataStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "TermName")
    protected String termName;
    @XmlElement(name = "MsMacAddress")
    protected String msMacAddress;
    @XmlElement(name = "IsRegistered")
    protected boolean isRegistered;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "SysUpTime")
    protected long sysUpTime;
    @XmlElementRef(name = "UlBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulBytes;
    @XmlElementRef(name = "DlBytes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlBytes;
    @XmlElementRef(name = "HarqUlAcks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqUlAcks;
    @XmlElementRef(name = "HarqUlNacks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqUlNacks;
    @XmlElementRef(name = "HarqDlAcks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqDlAcks;
    @XmlElementRef(name = "HarqDlNacks", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> harqDlNacks;
    @XmlElementRef(name = "UlPackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulPackets;
    @XmlElementRef(name = "DlPackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlPackets;
    @XmlElementRef(name = "UlHarqLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulHarqLoss;
    @XmlElementRef(name = "DlHarqLoss", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlHarqLoss;
    @XmlElementRef(name = "FtNullingQi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ftNullingQi;

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
     * Gets the value of the ulBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlBytes() {
        return ulBytes;
    }

    /**
     * Sets the value of the ulBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlBytes(JAXBElement<Double> value) {
        this.ulBytes = value;
    }

    /**
     * Gets the value of the dlBytes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlBytes() {
        return dlBytes;
    }

    /**
     * Sets the value of the dlBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlBytes(JAXBElement<Double> value) {
        this.dlBytes = value;
    }

    /**
     * Gets the value of the harqUlAcks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqUlAcks() {
        return harqUlAcks;
    }

    /**
     * Sets the value of the harqUlAcks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqUlAcks(JAXBElement<Double> value) {
        this.harqUlAcks = value;
    }

    /**
     * Gets the value of the harqUlNacks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqUlNacks() {
        return harqUlNacks;
    }

    /**
     * Sets the value of the harqUlNacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqUlNacks(JAXBElement<Double> value) {
        this.harqUlNacks = value;
    }

    /**
     * Gets the value of the harqDlAcks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqDlAcks() {
        return harqDlAcks;
    }

    /**
     * Sets the value of the harqDlAcks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqDlAcks(JAXBElement<Double> value) {
        this.harqDlAcks = value;
    }

    /**
     * Gets the value of the harqDlNacks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getHarqDlNacks() {
        return harqDlNacks;
    }

    /**
     * Sets the value of the harqDlNacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setHarqDlNacks(JAXBElement<Double> value) {
        this.harqDlNacks = value;
    }

    /**
     * Gets the value of the ulPackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlPackets() {
        return ulPackets;
    }

    /**
     * Sets the value of the ulPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlPackets(JAXBElement<Double> value) {
        this.ulPackets = value;
    }

    /**
     * Gets the value of the dlPackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlPackets() {
        return dlPackets;
    }

    /**
     * Sets the value of the dlPackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlPackets(JAXBElement<Double> value) {
        this.dlPackets = value;
    }

    /**
     * Gets the value of the ulHarqLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlHarqLoss() {
        return ulHarqLoss;
    }

    /**
     * Sets the value of the ulHarqLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlHarqLoss(JAXBElement<Double> value) {
        this.ulHarqLoss = value;
    }

    /**
     * Gets the value of the dlHarqLoss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlHarqLoss() {
        return dlHarqLoss;
    }

    /**
     * Sets the value of the dlHarqLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlHarqLoss(JAXBElement<Double> value) {
        this.dlHarqLoss = value;
    }

    /**
     * Gets the value of the ftNullingQi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFtNullingQi() {
        return ftNullingQi;
    }

    /**
     * Sets the value of the ftNullingQi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFtNullingQi(JAXBElement<Integer> value) {
        this.ftNullingQi = value;
    }

}
