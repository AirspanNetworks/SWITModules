
package Netspan.NBI_15_1.Statistics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LteERabPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteERabPerQciStatsRowWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InitialAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalSuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MeanERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReqToReleasePerQci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttemptedToRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuccessfullyReleased" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfReleasedActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AttemptedToModifyQos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuccessfullyModifiedQos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InSessionActivityTimeForERab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SimultaneousERabAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SimultaneousERabMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfReleasedActiveNonActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteERabPerQciStatsRowWs", propOrder = {
    "cellId",
    "qciIndex",
    "dateAndTimeStart",
    "dateAndTimeEnd",
    "granularityPeriod",
    "initialAttemptedToSetup",
    "successfullyEstablished",
    "additionalAttemptedToSetup",
    "additionalSuccessfullyEstablished",
    "meanERabSetupTime",
    "maxERabSetupTime",
    "reqToReleasePerQci",
    "attemptedToRelease",
    "successfullyReleased",
    "numberOfReleasedActive",
    "attemptedToModifyQos",
    "successfullyModifiedQos",
    "inSessionActivityTimeForERab",
    "simultaneousERabAvg",
    "simultaneousERabMax",
    "numberOfReleasedActiveNonActive"
})
public class LteERabPerQciStatsRowWs {

    @XmlElementRef(name = "CellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellId;
    @XmlElementRef(name = "QciIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qciIndex;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElementRef(name = "GranularityPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> granularityPeriod;
    @XmlElementRef(name = "InitialAttemptedToSetup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> initialAttemptedToSetup;
    @XmlElementRef(name = "SuccessfullyEstablished", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullyEstablished;
    @XmlElementRef(name = "AdditionalAttemptedToSetup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalAttemptedToSetup;
    @XmlElementRef(name = "AdditionalSuccessfullyEstablished", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalSuccessfullyEstablished;
    @XmlElementRef(name = "MeanERabSetupTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> meanERabSetupTime;
    @XmlElementRef(name = "MaxERabSetupTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxERabSetupTime;
    @XmlElementRef(name = "ReqToReleasePerQci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reqToReleasePerQci;
    @XmlElementRef(name = "AttemptedToRelease", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> attemptedToRelease;
    @XmlElementRef(name = "SuccessfullyReleased", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullyReleased;
    @XmlElementRef(name = "NumberOfReleasedActive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfReleasedActive;
    @XmlElementRef(name = "AttemptedToModifyQos", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> attemptedToModifyQos;
    @XmlElementRef(name = "SuccessfullyModifiedQos", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullyModifiedQos;
    @XmlElementRef(name = "InSessionActivityTimeForERab", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> inSessionActivityTimeForERab;
    @XmlElementRef(name = "SimultaneousERabAvg", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> simultaneousERabAvg;
    @XmlElementRef(name = "SimultaneousERabMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> simultaneousERabMax;
    @XmlElementRef(name = "NumberOfReleasedActiveNonActive", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfReleasedActiveNonActive;

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
     * Gets the value of the qciIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQciIndex() {
        return qciIndex;
    }

    /**
     * Sets the value of the qciIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQciIndex(JAXBElement<Integer> value) {
        this.qciIndex = value;
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
     * Gets the value of the initialAttemptedToSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInitialAttemptedToSetup() {
        return initialAttemptedToSetup;
    }

    /**
     * Sets the value of the initialAttemptedToSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInitialAttemptedToSetup(JAXBElement<Integer> value) {
        this.initialAttemptedToSetup = value;
    }

    /**
     * Gets the value of the successfullyEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullyEstablished() {
        return successfullyEstablished;
    }

    /**
     * Sets the value of the successfullyEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullyEstablished(JAXBElement<Integer> value) {
        this.successfullyEstablished = value;
    }

    /**
     * Gets the value of the additionalAttemptedToSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalAttemptedToSetup() {
        return additionalAttemptedToSetup;
    }

    /**
     * Sets the value of the additionalAttemptedToSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalAttemptedToSetup(JAXBElement<Integer> value) {
        this.additionalAttemptedToSetup = value;
    }

    /**
     * Gets the value of the additionalSuccessfullyEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalSuccessfullyEstablished() {
        return additionalSuccessfullyEstablished;
    }

    /**
     * Sets the value of the additionalSuccessfullyEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalSuccessfullyEstablished(JAXBElement<Integer> value) {
        this.additionalSuccessfullyEstablished = value;
    }

    /**
     * Gets the value of the meanERabSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeanERabSetupTime() {
        return meanERabSetupTime;
    }

    /**
     * Sets the value of the meanERabSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeanERabSetupTime(JAXBElement<Integer> value) {
        this.meanERabSetupTime = value;
    }

    /**
     * Gets the value of the maxERabSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxERabSetupTime() {
        return maxERabSetupTime;
    }

    /**
     * Sets the value of the maxERabSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxERabSetupTime(JAXBElement<Integer> value) {
        this.maxERabSetupTime = value;
    }

    /**
     * Gets the value of the reqToReleasePerQci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReqToReleasePerQci() {
        return reqToReleasePerQci;
    }

    /**
     * Sets the value of the reqToReleasePerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReqToReleasePerQci(JAXBElement<Integer> value) {
        this.reqToReleasePerQci = value;
    }

    /**
     * Gets the value of the attemptedToRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAttemptedToRelease() {
        return attemptedToRelease;
    }

    /**
     * Sets the value of the attemptedToRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAttemptedToRelease(JAXBElement<Integer> value) {
        this.attemptedToRelease = value;
    }

    /**
     * Gets the value of the successfullyReleased property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullyReleased() {
        return successfullyReleased;
    }

    /**
     * Sets the value of the successfullyReleased property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullyReleased(JAXBElement<Integer> value) {
        this.successfullyReleased = value;
    }

    /**
     * Gets the value of the numberOfReleasedActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfReleasedActive() {
        return numberOfReleasedActive;
    }

    /**
     * Sets the value of the numberOfReleasedActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfReleasedActive(JAXBElement<Integer> value) {
        this.numberOfReleasedActive = value;
    }

    /**
     * Gets the value of the attemptedToModifyQos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAttemptedToModifyQos() {
        return attemptedToModifyQos;
    }

    /**
     * Sets the value of the attemptedToModifyQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAttemptedToModifyQos(JAXBElement<Integer> value) {
        this.attemptedToModifyQos = value;
    }

    /**
     * Gets the value of the successfullyModifiedQos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullyModifiedQos() {
        return successfullyModifiedQos;
    }

    /**
     * Sets the value of the successfullyModifiedQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullyModifiedQos(JAXBElement<Integer> value) {
        this.successfullyModifiedQos = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForERab property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInSessionActivityTimeForERab() {
        return inSessionActivityTimeForERab;
    }

    /**
     * Sets the value of the inSessionActivityTimeForERab property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInSessionActivityTimeForERab(JAXBElement<Integer> value) {
        this.inSessionActivityTimeForERab = value;
    }

    /**
     * Gets the value of the simultaneousERabAvg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSimultaneousERabAvg() {
        return simultaneousERabAvg;
    }

    /**
     * Sets the value of the simultaneousERabAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSimultaneousERabAvg(JAXBElement<Integer> value) {
        this.simultaneousERabAvg = value;
    }

    /**
     * Gets the value of the simultaneousERabMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSimultaneousERabMax() {
        return simultaneousERabMax;
    }

    /**
     * Sets the value of the simultaneousERabMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSimultaneousERabMax(JAXBElement<Integer> value) {
        this.simultaneousERabMax = value;
    }

    /**
     * Gets the value of the numberOfReleasedActiveNonActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfReleasedActiveNonActive() {
        return numberOfReleasedActiveNonActive;
    }

    /**
     * Sets the value of the numberOfReleasedActiveNonActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfReleasedActiveNonActive(JAXBElement<Integer> value) {
        this.numberOfReleasedActiveNonActive = value;
    }

}
