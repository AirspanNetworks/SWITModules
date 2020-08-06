
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
 * <p>Java class for BsIbBaseAirInterfaceUsageStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BsIbBaseAirInterfaceUsageStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SysUpTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DlModQpsk12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlModQpsk12rep2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlModQpsk12rep4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlModQpsk12rep6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlModQpsk34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod16Qam12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod16Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod64Qam12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod64Qam23" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod64Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod64Qam56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod256Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlMod256Qam56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlFrameUtilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DlSubFrameSlots" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlUsedSubFrameSlots" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlFrameOverhead" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlSubframeSlotsMimoA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlSubframeSlotsMimoB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DlSubframeSlotsSiso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlModQpsk12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlModQpsk12rep2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlModQpsk12rep4" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlModQpsk12rep6" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlModQpsk34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod16Qam12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod16Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod64Qam12" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod64Qam23" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod64Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod64Qam56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod256Qam34" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlMod256Qam56" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlFrameUtilization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UlSubFrameSlots" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlUsedSubFrameSlots" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlFrameOverhead" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlSubframeSlotsMimoA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlSubframeSlotsMimoB" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UlSubframeSlotsSiso" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BsIbBaseAirInterfaceUsageStatsRowWs", propOrder = {
    "node",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "sysUpTime",
    "dlModQpsk12",
    "dlModQpsk12Rep2",
    "dlModQpsk12Rep4",
    "dlModQpsk12Rep6",
    "dlModQpsk34",
    "dlMod16Qam12",
    "dlMod16Qam34",
    "dlMod64Qam12",
    "dlMod64Qam23",
    "dlMod64Qam34",
    "dlMod64Qam56",
    "dlMod256Qam34",
    "dlMod256Qam56",
    "dlFrameUtilization",
    "dlSubFrameSlots",
    "dlUsedSubFrameSlots",
    "dlFrameOverhead",
    "dlSubframeSlotsMimoA",
    "dlSubframeSlotsMimoB",
    "dlSubframeSlotsSiso",
    "ulModQpsk12",
    "ulModQpsk12Rep2",
    "ulModQpsk12Rep4",
    "ulModQpsk12Rep6",
    "ulModQpsk34",
    "ulMod16Qam12",
    "ulMod16Qam34",
    "ulMod64Qam12",
    "ulMod64Qam23",
    "ulMod64Qam34",
    "ulMod64Qam56",
    "ulMod256Qam34",
    "ulMod256Qam56",
    "ulFrameUtilization",
    "ulSubFrameSlots",
    "ulUsedSubFrameSlots",
    "ulFrameOverhead",
    "ulSubframeSlotsMimoA",
    "ulSubframeSlotsMimoB",
    "ulSubframeSlotsSiso"
})
public class BsIbBaseAirInterfaceUsageStatsRowWs {

    @XmlElement(name = "Node")
    protected String node;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "SysUpTime")
    protected long sysUpTime;
    @XmlElementRef(name = "DlModQpsk12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlModQpsk12;
    @XmlElementRef(name = "DlModQpsk12rep2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlModQpsk12Rep2;
    @XmlElementRef(name = "DlModQpsk12rep4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlModQpsk12Rep4;
    @XmlElementRef(name = "DlModQpsk12rep6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlModQpsk12Rep6;
    @XmlElementRef(name = "DlModQpsk34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlModQpsk34;
    @XmlElementRef(name = "DlMod16Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod16Qam12;
    @XmlElementRef(name = "DlMod16Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod16Qam34;
    @XmlElementRef(name = "DlMod64Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod64Qam12;
    @XmlElementRef(name = "DlMod64Qam23", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod64Qam23;
    @XmlElementRef(name = "DlMod64Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod64Qam34;
    @XmlElementRef(name = "DlMod64Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod64Qam56;
    @XmlElementRef(name = "DlMod256Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod256Qam34;
    @XmlElementRef(name = "DlMod256Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlMod256Qam56;
    @XmlElementRef(name = "DlFrameUtilization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dlFrameUtilization;
    @XmlElementRef(name = "DlSubFrameSlots", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlSubFrameSlots;
    @XmlElementRef(name = "DlUsedSubFrameSlots", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlUsedSubFrameSlots;
    @XmlElementRef(name = "DlFrameOverhead", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlFrameOverhead;
    @XmlElementRef(name = "DlSubframeSlotsMimoA", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlSubframeSlotsMimoA;
    @XmlElementRef(name = "DlSubframeSlotsMimoB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlSubframeSlotsMimoB;
    @XmlElementRef(name = "DlSubframeSlotsSiso", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> dlSubframeSlotsSiso;
    @XmlElementRef(name = "UlModQpsk12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulModQpsk12;
    @XmlElementRef(name = "UlModQpsk12rep2", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulModQpsk12Rep2;
    @XmlElementRef(name = "UlModQpsk12rep4", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulModQpsk12Rep4;
    @XmlElementRef(name = "UlModQpsk12rep6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulModQpsk12Rep6;
    @XmlElementRef(name = "UlModQpsk34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulModQpsk34;
    @XmlElementRef(name = "UlMod16Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod16Qam12;
    @XmlElementRef(name = "UlMod16Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod16Qam34;
    @XmlElementRef(name = "UlMod64Qam12", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod64Qam12;
    @XmlElementRef(name = "UlMod64Qam23", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod64Qam23;
    @XmlElementRef(name = "UlMod64Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod64Qam34;
    @XmlElementRef(name = "UlMod64Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod64Qam56;
    @XmlElementRef(name = "UlMod256Qam34", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod256Qam34;
    @XmlElementRef(name = "UlMod256Qam56", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulMod256Qam56;
    @XmlElementRef(name = "UlFrameUtilization", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ulFrameUtilization;
    @XmlElementRef(name = "UlSubFrameSlots", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulSubFrameSlots;
    @XmlElementRef(name = "UlUsedSubFrameSlots", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulUsedSubFrameSlots;
    @XmlElementRef(name = "UlFrameOverhead", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulFrameOverhead;
    @XmlElementRef(name = "UlSubframeSlotsMimoA", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulSubframeSlotsMimoA;
    @XmlElementRef(name = "UlSubframeSlotsMimoB", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulSubframeSlotsMimoB;
    @XmlElementRef(name = "UlSubframeSlotsSiso", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> ulSubframeSlotsSiso;

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
     * Gets the value of the dlModQpsk12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlModQpsk12() {
        return dlModQpsk12;
    }

    /**
     * Sets the value of the dlModQpsk12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlModQpsk12(JAXBElement<Double> value) {
        this.dlModQpsk12 = value;
    }

    /**
     * Gets the value of the dlModQpsk12Rep2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlModQpsk12Rep2() {
        return dlModQpsk12Rep2;
    }

    /**
     * Sets the value of the dlModQpsk12Rep2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlModQpsk12Rep2(JAXBElement<Double> value) {
        this.dlModQpsk12Rep2 = value;
    }

    /**
     * Gets the value of the dlModQpsk12Rep4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlModQpsk12Rep4() {
        return dlModQpsk12Rep4;
    }

    /**
     * Sets the value of the dlModQpsk12Rep4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlModQpsk12Rep4(JAXBElement<Double> value) {
        this.dlModQpsk12Rep4 = value;
    }

    /**
     * Gets the value of the dlModQpsk12Rep6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlModQpsk12Rep6() {
        return dlModQpsk12Rep6;
    }

    /**
     * Sets the value of the dlModQpsk12Rep6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlModQpsk12Rep6(JAXBElement<Double> value) {
        this.dlModQpsk12Rep6 = value;
    }

    /**
     * Gets the value of the dlModQpsk34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlModQpsk34() {
        return dlModQpsk34;
    }

    /**
     * Sets the value of the dlModQpsk34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlModQpsk34(JAXBElement<Double> value) {
        this.dlModQpsk34 = value;
    }

    /**
     * Gets the value of the dlMod16Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod16Qam12() {
        return dlMod16Qam12;
    }

    /**
     * Sets the value of the dlMod16Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod16Qam12(JAXBElement<Double> value) {
        this.dlMod16Qam12 = value;
    }

    /**
     * Gets the value of the dlMod16Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod16Qam34() {
        return dlMod16Qam34;
    }

    /**
     * Sets the value of the dlMod16Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod16Qam34(JAXBElement<Double> value) {
        this.dlMod16Qam34 = value;
    }

    /**
     * Gets the value of the dlMod64Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod64Qam12() {
        return dlMod64Qam12;
    }

    /**
     * Sets the value of the dlMod64Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod64Qam12(JAXBElement<Double> value) {
        this.dlMod64Qam12 = value;
    }

    /**
     * Gets the value of the dlMod64Qam23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod64Qam23() {
        return dlMod64Qam23;
    }

    /**
     * Sets the value of the dlMod64Qam23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod64Qam23(JAXBElement<Double> value) {
        this.dlMod64Qam23 = value;
    }

    /**
     * Gets the value of the dlMod64Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod64Qam34() {
        return dlMod64Qam34;
    }

    /**
     * Sets the value of the dlMod64Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod64Qam34(JAXBElement<Double> value) {
        this.dlMod64Qam34 = value;
    }

    /**
     * Gets the value of the dlMod64Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod64Qam56() {
        return dlMod64Qam56;
    }

    /**
     * Sets the value of the dlMod64Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod64Qam56(JAXBElement<Double> value) {
        this.dlMod64Qam56 = value;
    }

    /**
     * Gets the value of the dlMod256Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod256Qam34() {
        return dlMod256Qam34;
    }

    /**
     * Sets the value of the dlMod256Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod256Qam34(JAXBElement<Double> value) {
        this.dlMod256Qam34 = value;
    }

    /**
     * Gets the value of the dlMod256Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlMod256Qam56() {
        return dlMod256Qam56;
    }

    /**
     * Sets the value of the dlMod256Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlMod256Qam56(JAXBElement<Double> value) {
        this.dlMod256Qam56 = value;
    }

    /**
     * Gets the value of the dlFrameUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDlFrameUtilization() {
        return dlFrameUtilization;
    }

    /**
     * Sets the value of the dlFrameUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDlFrameUtilization(JAXBElement<Integer> value) {
        this.dlFrameUtilization = value;
    }

    /**
     * Gets the value of the dlSubFrameSlots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlSubFrameSlots() {
        return dlSubFrameSlots;
    }

    /**
     * Sets the value of the dlSubFrameSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlSubFrameSlots(JAXBElement<Double> value) {
        this.dlSubFrameSlots = value;
    }

    /**
     * Gets the value of the dlUsedSubFrameSlots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlUsedSubFrameSlots() {
        return dlUsedSubFrameSlots;
    }

    /**
     * Sets the value of the dlUsedSubFrameSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlUsedSubFrameSlots(JAXBElement<Double> value) {
        this.dlUsedSubFrameSlots = value;
    }

    /**
     * Gets the value of the dlFrameOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlFrameOverhead() {
        return dlFrameOverhead;
    }

    /**
     * Sets the value of the dlFrameOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlFrameOverhead(JAXBElement<Double> value) {
        this.dlFrameOverhead = value;
    }

    /**
     * Gets the value of the dlSubframeSlotsMimoA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlSubframeSlotsMimoA() {
        return dlSubframeSlotsMimoA;
    }

    /**
     * Sets the value of the dlSubframeSlotsMimoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlSubframeSlotsMimoA(JAXBElement<Double> value) {
        this.dlSubframeSlotsMimoA = value;
    }

    /**
     * Gets the value of the dlSubframeSlotsMimoB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlSubframeSlotsMimoB() {
        return dlSubframeSlotsMimoB;
    }

    /**
     * Sets the value of the dlSubframeSlotsMimoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlSubframeSlotsMimoB(JAXBElement<Double> value) {
        this.dlSubframeSlotsMimoB = value;
    }

    /**
     * Gets the value of the dlSubframeSlotsSiso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDlSubframeSlotsSiso() {
        return dlSubframeSlotsSiso;
    }

    /**
     * Sets the value of the dlSubframeSlotsSiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDlSubframeSlotsSiso(JAXBElement<Double> value) {
        this.dlSubframeSlotsSiso = value;
    }

    /**
     * Gets the value of the ulModQpsk12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlModQpsk12() {
        return ulModQpsk12;
    }

    /**
     * Sets the value of the ulModQpsk12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlModQpsk12(JAXBElement<Double> value) {
        this.ulModQpsk12 = value;
    }

    /**
     * Gets the value of the ulModQpsk12Rep2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlModQpsk12Rep2() {
        return ulModQpsk12Rep2;
    }

    /**
     * Sets the value of the ulModQpsk12Rep2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlModQpsk12Rep2(JAXBElement<Double> value) {
        this.ulModQpsk12Rep2 = value;
    }

    /**
     * Gets the value of the ulModQpsk12Rep4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlModQpsk12Rep4() {
        return ulModQpsk12Rep4;
    }

    /**
     * Sets the value of the ulModQpsk12Rep4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlModQpsk12Rep4(JAXBElement<Double> value) {
        this.ulModQpsk12Rep4 = value;
    }

    /**
     * Gets the value of the ulModQpsk12Rep6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlModQpsk12Rep6() {
        return ulModQpsk12Rep6;
    }

    /**
     * Sets the value of the ulModQpsk12Rep6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlModQpsk12Rep6(JAXBElement<Double> value) {
        this.ulModQpsk12Rep6 = value;
    }

    /**
     * Gets the value of the ulModQpsk34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlModQpsk34() {
        return ulModQpsk34;
    }

    /**
     * Sets the value of the ulModQpsk34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlModQpsk34(JAXBElement<Double> value) {
        this.ulModQpsk34 = value;
    }

    /**
     * Gets the value of the ulMod16Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod16Qam12() {
        return ulMod16Qam12;
    }

    /**
     * Sets the value of the ulMod16Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod16Qam12(JAXBElement<Double> value) {
        this.ulMod16Qam12 = value;
    }

    /**
     * Gets the value of the ulMod16Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod16Qam34() {
        return ulMod16Qam34;
    }

    /**
     * Sets the value of the ulMod16Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod16Qam34(JAXBElement<Double> value) {
        this.ulMod16Qam34 = value;
    }

    /**
     * Gets the value of the ulMod64Qam12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod64Qam12() {
        return ulMod64Qam12;
    }

    /**
     * Sets the value of the ulMod64Qam12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod64Qam12(JAXBElement<Double> value) {
        this.ulMod64Qam12 = value;
    }

    /**
     * Gets the value of the ulMod64Qam23 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod64Qam23() {
        return ulMod64Qam23;
    }

    /**
     * Sets the value of the ulMod64Qam23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod64Qam23(JAXBElement<Double> value) {
        this.ulMod64Qam23 = value;
    }

    /**
     * Gets the value of the ulMod64Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod64Qam34() {
        return ulMod64Qam34;
    }

    /**
     * Sets the value of the ulMod64Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod64Qam34(JAXBElement<Double> value) {
        this.ulMod64Qam34 = value;
    }

    /**
     * Gets the value of the ulMod64Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod64Qam56() {
        return ulMod64Qam56;
    }

    /**
     * Sets the value of the ulMod64Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod64Qam56(JAXBElement<Double> value) {
        this.ulMod64Qam56 = value;
    }

    /**
     * Gets the value of the ulMod256Qam34 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod256Qam34() {
        return ulMod256Qam34;
    }

    /**
     * Sets the value of the ulMod256Qam34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod256Qam34(JAXBElement<Double> value) {
        this.ulMod256Qam34 = value;
    }

    /**
     * Gets the value of the ulMod256Qam56 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlMod256Qam56() {
        return ulMod256Qam56;
    }

    /**
     * Sets the value of the ulMod256Qam56 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlMod256Qam56(JAXBElement<Double> value) {
        this.ulMod256Qam56 = value;
    }

    /**
     * Gets the value of the ulFrameUtilization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUlFrameUtilization() {
        return ulFrameUtilization;
    }

    /**
     * Sets the value of the ulFrameUtilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUlFrameUtilization(JAXBElement<Integer> value) {
        this.ulFrameUtilization = value;
    }

    /**
     * Gets the value of the ulSubFrameSlots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlSubFrameSlots() {
        return ulSubFrameSlots;
    }

    /**
     * Sets the value of the ulSubFrameSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlSubFrameSlots(JAXBElement<Double> value) {
        this.ulSubFrameSlots = value;
    }

    /**
     * Gets the value of the ulUsedSubFrameSlots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlUsedSubFrameSlots() {
        return ulUsedSubFrameSlots;
    }

    /**
     * Sets the value of the ulUsedSubFrameSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlUsedSubFrameSlots(JAXBElement<Double> value) {
        this.ulUsedSubFrameSlots = value;
    }

    /**
     * Gets the value of the ulFrameOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlFrameOverhead() {
        return ulFrameOverhead;
    }

    /**
     * Sets the value of the ulFrameOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlFrameOverhead(JAXBElement<Double> value) {
        this.ulFrameOverhead = value;
    }

    /**
     * Gets the value of the ulSubframeSlotsMimoA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlSubframeSlotsMimoA() {
        return ulSubframeSlotsMimoA;
    }

    /**
     * Sets the value of the ulSubframeSlotsMimoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlSubframeSlotsMimoA(JAXBElement<Double> value) {
        this.ulSubframeSlotsMimoA = value;
    }

    /**
     * Gets the value of the ulSubframeSlotsMimoB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlSubframeSlotsMimoB() {
        return ulSubframeSlotsMimoB;
    }

    /**
     * Sets the value of the ulSubframeSlotsMimoB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlSubframeSlotsMimoB(JAXBElement<Double> value) {
        this.ulSubframeSlotsMimoB = value;
    }

    /**
     * Gets the value of the ulSubframeSlotsSiso property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUlSubframeSlotsSiso() {
        return ulSubframeSlotsSiso;
    }

    /**
     * Sets the value of the ulSubframeSlotsSiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUlSubframeSlotsSiso(JAXBElement<Double> value) {
        this.ulSubframeSlotsSiso = value;
    }

}
