
package Netspan.NBI_16_5.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteSonStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteSonStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AvgNumCeuUes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgNumCcuUes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgNumCeResources" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgNumCcResources" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AvgEffCEUThr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocCeu0" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocCeu1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocCcu0" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="CwAllocCcu1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotRbsCeu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotRbsCcu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotTTIsCeu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotTTIsCcu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotBytesCeu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotBytesCcu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsDetectedCollision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsDetectedConfusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsDetectedPolicyViolation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsResolvedCollision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsResolvedConfusion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciConflictsResolvedPolicyViolation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroOutTooLatePoorCvrgIntraFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroOutTooLateGoodCvrgIntraFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroOutTooEarlyIntraFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroOutWrongCellIntraFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RestbSameCellPoorCvrg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoCvgOutAttIntraFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoCvgOutAttInterFreq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SonMroServCellThNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SonMroNghCellThNotCrossed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PwrAdjustCanceledDueToLowLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PwrAdjustCanceledDueToHighLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroMobilityFailureRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroCoverageFailureRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteSonStatsRowWs", propOrder = {
    "cellId",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "avgNumCeuUes",
    "avgNumCcuUes",
    "avgNumCeResources",
    "avgNumCcResources",
    "avgEffCEUThr",
    "cwAllocCeu0",
    "cwAllocCeu1",
    "cwAllocCcu0",
    "cwAllocCcu1",
    "totRbsCeu",
    "totRbsCcu",
    "totTTIsCeu",
    "totTTIsCcu",
    "totBytesCeu",
    "totBytesCcu",
    "autoPciConflictsDetectedCollision",
    "autoPciConflictsDetectedConfusion",
    "autoPciConflictsDetectedPolicyViolation",
    "autoPciConflictsResolvedCollision",
    "autoPciConflictsResolvedConfusion",
    "autoPciConflictsResolvedPolicyViolation",
    "mroOutTooLatePoorCvrgIntraFreq",
    "mroOutTooLateGoodCvrgIntraFreq",
    "mroOutTooEarlyIntraFreq",
    "mroOutWrongCellIntraFreq",
    "restbSameCellPoorCvrg",
    "hoCvgOutAttIntraFreq",
    "hoCvgOutAttInterFreq",
    "sonMroServCellThNotCrossed",
    "sonMroNghCellThNotCrossed",
    "pwrAdjustCanceledDueToLowLimit",
    "pwrAdjustCanceledDueToHighLimit",
    "mroMobilityFailureRate",
    "mroCoverageFailureRate"
})
public class LteSonStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "AvgNumCeuUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgNumCeuUes;
    @XmlElementRef(name = "AvgNumCcuUes", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgNumCcuUes;
    @XmlElementRef(name = "AvgNumCeResources", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgNumCeResources;
    @XmlElementRef(name = "AvgNumCcResources", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgNumCcResources;
    @XmlElementRef(name = "AvgEffCEUThr", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> avgEffCEUThr;
    @XmlElementRef(name = "CwAllocCeu0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocCeu0;
    @XmlElementRef(name = "CwAllocCeu1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocCeu1;
    @XmlElementRef(name = "CwAllocCcu0", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocCcu0;
    @XmlElementRef(name = "CwAllocCcu1", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> cwAllocCcu1;
    @XmlElementRef(name = "TotRbsCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totRbsCeu;
    @XmlElementRef(name = "TotRbsCcu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totRbsCcu;
    @XmlElementRef(name = "TotTTIsCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totTTIsCeu;
    @XmlElementRef(name = "TotTTIsCcu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> totTTIsCcu;
    @XmlElementRef(name = "TotBytesCeu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totBytesCeu;
    @XmlElementRef(name = "TotBytesCcu", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> totBytesCcu;
    @XmlElementRef(name = "AutoPciConflictsDetectedCollision", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsDetectedCollision;
    @XmlElementRef(name = "AutoPciConflictsDetectedConfusion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsDetectedConfusion;
    @XmlElementRef(name = "AutoPciConflictsDetectedPolicyViolation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsDetectedPolicyViolation;
    @XmlElementRef(name = "AutoPciConflictsResolvedCollision", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsResolvedCollision;
    @XmlElementRef(name = "AutoPciConflictsResolvedConfusion", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsResolvedConfusion;
    @XmlElementRef(name = "AutoPciConflictsResolvedPolicyViolation", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> autoPciConflictsResolvedPolicyViolation;
    @XmlElementRef(name = "MroOutTooLatePoorCvrgIntraFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroOutTooLatePoorCvrgIntraFreq;
    @XmlElementRef(name = "MroOutTooLateGoodCvrgIntraFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroOutTooLateGoodCvrgIntraFreq;
    @XmlElementRef(name = "MroOutTooEarlyIntraFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroOutTooEarlyIntraFreq;
    @XmlElementRef(name = "MroOutWrongCellIntraFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroOutWrongCellIntraFreq;
    @XmlElementRef(name = "RestbSameCellPoorCvrg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> restbSameCellPoorCvrg;
    @XmlElementRef(name = "HoCvgOutAttIntraFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoCvgOutAttIntraFreq;
    @XmlElementRef(name = "HoCvgOutAttInterFreq", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoCvgOutAttInterFreq;
    @XmlElementRef(name = "SonMroServCellThNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sonMroServCellThNotCrossed;
    @XmlElementRef(name = "SonMroNghCellThNotCrossed", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sonMroNghCellThNotCrossed;
    @XmlElementRef(name = "PwrAdjustCanceledDueToLowLimit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pwrAdjustCanceledDueToLowLimit;
    @XmlElementRef(name = "PwrAdjustCanceledDueToHighLimit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pwrAdjustCanceledDueToHighLimit;
    @XmlElementRef(name = "MroMobilityFailureRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroMobilityFailureRate;
    @XmlElementRef(name = "MroCoverageFailureRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mroCoverageFailureRate;

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
     * Gets the value of the avgNumCeuUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgNumCeuUes() {
        return avgNumCeuUes;
    }

    /**
     * Sets the value of the avgNumCeuUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgNumCeuUes(JAXBElement<Integer> value) {
        this.avgNumCeuUes = value;
    }

    /**
     * Gets the value of the avgNumCcuUes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgNumCcuUes() {
        return avgNumCcuUes;
    }

    /**
     * Sets the value of the avgNumCcuUes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgNumCcuUes(JAXBElement<Integer> value) {
        this.avgNumCcuUes = value;
    }

    /**
     * Gets the value of the avgNumCeResources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgNumCeResources() {
        return avgNumCeResources;
    }

    /**
     * Sets the value of the avgNumCeResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgNumCeResources(JAXBElement<Integer> value) {
        this.avgNumCeResources = value;
    }

    /**
     * Gets the value of the avgNumCcResources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgNumCcResources() {
        return avgNumCcResources;
    }

    /**
     * Sets the value of the avgNumCcResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgNumCcResources(JAXBElement<Integer> value) {
        this.avgNumCcResources = value;
    }

    /**
     * Gets the value of the avgEffCEUThr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvgEffCEUThr() {
        return avgEffCEUThr;
    }

    /**
     * Sets the value of the avgEffCEUThr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvgEffCEUThr(JAXBElement<Integer> value) {
        this.avgEffCEUThr = value;
    }

    /**
     * Gets the value of the cwAllocCeu0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocCeu0() {
        return cwAllocCeu0;
    }

    /**
     * Sets the value of the cwAllocCeu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocCeu0(JAXBElement<Long> value) {
        this.cwAllocCeu0 = value;
    }

    /**
     * Gets the value of the cwAllocCeu1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocCeu1() {
        return cwAllocCeu1;
    }

    /**
     * Sets the value of the cwAllocCeu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocCeu1(JAXBElement<Long> value) {
        this.cwAllocCeu1 = value;
    }

    /**
     * Gets the value of the cwAllocCcu0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocCcu0() {
        return cwAllocCcu0;
    }

    /**
     * Sets the value of the cwAllocCcu0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocCcu0(JAXBElement<Long> value) {
        this.cwAllocCcu0 = value;
    }

    /**
     * Gets the value of the cwAllocCcu1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCwAllocCcu1() {
        return cwAllocCcu1;
    }

    /**
     * Sets the value of the cwAllocCcu1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCwAllocCcu1(JAXBElement<Long> value) {
        this.cwAllocCcu1 = value;
    }

    /**
     * Gets the value of the totRbsCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotRbsCeu() {
        return totRbsCeu;
    }

    /**
     * Sets the value of the totRbsCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotRbsCeu(JAXBElement<Long> value) {
        this.totRbsCeu = value;
    }

    /**
     * Gets the value of the totRbsCcu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotRbsCcu() {
        return totRbsCcu;
    }

    /**
     * Sets the value of the totRbsCcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotRbsCcu(JAXBElement<Long> value) {
        this.totRbsCcu = value;
    }

    /**
     * Gets the value of the totTTIsCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotTTIsCeu() {
        return totTTIsCeu;
    }

    /**
     * Sets the value of the totTTIsCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotTTIsCeu(JAXBElement<Integer> value) {
        this.totTTIsCeu = value;
    }

    /**
     * Gets the value of the totTTIsCcu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotTTIsCcu() {
        return totTTIsCcu;
    }

    /**
     * Sets the value of the totTTIsCcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotTTIsCcu(JAXBElement<Integer> value) {
        this.totTTIsCcu = value;
    }

    /**
     * Gets the value of the totBytesCeu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotBytesCeu() {
        return totBytesCeu;
    }

    /**
     * Sets the value of the totBytesCeu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotBytesCeu(JAXBElement<Long> value) {
        this.totBytesCeu = value;
    }

    /**
     * Gets the value of the totBytesCcu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTotBytesCcu() {
        return totBytesCcu;
    }

    /**
     * Sets the value of the totBytesCcu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTotBytesCcu(JAXBElement<Long> value) {
        this.totBytesCcu = value;
    }

    /**
     * Gets the value of the autoPciConflictsDetectedCollision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsDetectedCollision() {
        return autoPciConflictsDetectedCollision;
    }

    /**
     * Sets the value of the autoPciConflictsDetectedCollision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsDetectedCollision(JAXBElement<Integer> value) {
        this.autoPciConflictsDetectedCollision = value;
    }

    /**
     * Gets the value of the autoPciConflictsDetectedConfusion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsDetectedConfusion() {
        return autoPciConflictsDetectedConfusion;
    }

    /**
     * Sets the value of the autoPciConflictsDetectedConfusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsDetectedConfusion(JAXBElement<Integer> value) {
        this.autoPciConflictsDetectedConfusion = value;
    }

    /**
     * Gets the value of the autoPciConflictsDetectedPolicyViolation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsDetectedPolicyViolation() {
        return autoPciConflictsDetectedPolicyViolation;
    }

    /**
     * Sets the value of the autoPciConflictsDetectedPolicyViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsDetectedPolicyViolation(JAXBElement<Integer> value) {
        this.autoPciConflictsDetectedPolicyViolation = value;
    }

    /**
     * Gets the value of the autoPciConflictsResolvedCollision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsResolvedCollision() {
        return autoPciConflictsResolvedCollision;
    }

    /**
     * Sets the value of the autoPciConflictsResolvedCollision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsResolvedCollision(JAXBElement<Integer> value) {
        this.autoPciConflictsResolvedCollision = value;
    }

    /**
     * Gets the value of the autoPciConflictsResolvedConfusion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsResolvedConfusion() {
        return autoPciConflictsResolvedConfusion;
    }

    /**
     * Sets the value of the autoPciConflictsResolvedConfusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsResolvedConfusion(JAXBElement<Integer> value) {
        this.autoPciConflictsResolvedConfusion = value;
    }

    /**
     * Gets the value of the autoPciConflictsResolvedPolicyViolation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAutoPciConflictsResolvedPolicyViolation() {
        return autoPciConflictsResolvedPolicyViolation;
    }

    /**
     * Sets the value of the autoPciConflictsResolvedPolicyViolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAutoPciConflictsResolvedPolicyViolation(JAXBElement<Integer> value) {
        this.autoPciConflictsResolvedPolicyViolation = value;
    }

    /**
     * Gets the value of the mroOutTooLatePoorCvrgIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroOutTooLatePoorCvrgIntraFreq() {
        return mroOutTooLatePoorCvrgIntraFreq;
    }

    /**
     * Sets the value of the mroOutTooLatePoorCvrgIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroOutTooLatePoorCvrgIntraFreq(JAXBElement<Integer> value) {
        this.mroOutTooLatePoorCvrgIntraFreq = value;
    }

    /**
     * Gets the value of the mroOutTooLateGoodCvrgIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroOutTooLateGoodCvrgIntraFreq() {
        return mroOutTooLateGoodCvrgIntraFreq;
    }

    /**
     * Sets the value of the mroOutTooLateGoodCvrgIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroOutTooLateGoodCvrgIntraFreq(JAXBElement<Integer> value) {
        this.mroOutTooLateGoodCvrgIntraFreq = value;
    }

    /**
     * Gets the value of the mroOutTooEarlyIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroOutTooEarlyIntraFreq() {
        return mroOutTooEarlyIntraFreq;
    }

    /**
     * Sets the value of the mroOutTooEarlyIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroOutTooEarlyIntraFreq(JAXBElement<Integer> value) {
        this.mroOutTooEarlyIntraFreq = value;
    }

    /**
     * Gets the value of the mroOutWrongCellIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroOutWrongCellIntraFreq() {
        return mroOutWrongCellIntraFreq;
    }

    /**
     * Sets the value of the mroOutWrongCellIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroOutWrongCellIntraFreq(JAXBElement<Integer> value) {
        this.mroOutWrongCellIntraFreq = value;
    }

    /**
     * Gets the value of the restbSameCellPoorCvrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRestbSameCellPoorCvrg() {
        return restbSameCellPoorCvrg;
    }

    /**
     * Sets the value of the restbSameCellPoorCvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRestbSameCellPoorCvrg(JAXBElement<Integer> value) {
        this.restbSameCellPoorCvrg = value;
    }

    /**
     * Gets the value of the hoCvgOutAttIntraFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoCvgOutAttIntraFreq() {
        return hoCvgOutAttIntraFreq;
    }

    /**
     * Sets the value of the hoCvgOutAttIntraFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoCvgOutAttIntraFreq(JAXBElement<Integer> value) {
        this.hoCvgOutAttIntraFreq = value;
    }

    /**
     * Gets the value of the hoCvgOutAttInterFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoCvgOutAttInterFreq() {
        return hoCvgOutAttInterFreq;
    }

    /**
     * Sets the value of the hoCvgOutAttInterFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoCvgOutAttInterFreq(JAXBElement<Integer> value) {
        this.hoCvgOutAttInterFreq = value;
    }

    /**
     * Gets the value of the sonMroServCellThNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSonMroServCellThNotCrossed() {
        return sonMroServCellThNotCrossed;
    }

    /**
     * Sets the value of the sonMroServCellThNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSonMroServCellThNotCrossed(JAXBElement<Integer> value) {
        this.sonMroServCellThNotCrossed = value;
    }

    /**
     * Gets the value of the sonMroNghCellThNotCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSonMroNghCellThNotCrossed() {
        return sonMroNghCellThNotCrossed;
    }

    /**
     * Sets the value of the sonMroNghCellThNotCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSonMroNghCellThNotCrossed(JAXBElement<Integer> value) {
        this.sonMroNghCellThNotCrossed = value;
    }

    /**
     * Gets the value of the pwrAdjustCanceledDueToLowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPwrAdjustCanceledDueToLowLimit() {
        return pwrAdjustCanceledDueToLowLimit;
    }

    /**
     * Sets the value of the pwrAdjustCanceledDueToLowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPwrAdjustCanceledDueToLowLimit(JAXBElement<Integer> value) {
        this.pwrAdjustCanceledDueToLowLimit = value;
    }

    /**
     * Gets the value of the pwrAdjustCanceledDueToHighLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPwrAdjustCanceledDueToHighLimit() {
        return pwrAdjustCanceledDueToHighLimit;
    }

    /**
     * Sets the value of the pwrAdjustCanceledDueToHighLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPwrAdjustCanceledDueToHighLimit(JAXBElement<Integer> value) {
        this.pwrAdjustCanceledDueToHighLimit = value;
    }

    /**
     * Gets the value of the mroMobilityFailureRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroMobilityFailureRate() {
        return mroMobilityFailureRate;
    }

    /**
     * Sets the value of the mroMobilityFailureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroMobilityFailureRate(JAXBElement<Integer> value) {
        this.mroMobilityFailureRate = value;
    }

    /**
     * Gets the value of the mroCoverageFailureRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMroCoverageFailureRate() {
        return mroCoverageFailureRate;
    }

    /**
     * Sets the value of the mroCoverageFailureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMroCoverageFailureRate(JAXBElement<Integer> value) {
        this.mroCoverageFailureRate = value;
    }

}
