
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
 * <p>Java class for LteERabPerQciStatsRowWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteERabPerQciStatsRowWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InitialAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalSuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeanERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReqToReleasePerQci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttemptedToRelease" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullyReleased" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfReleasedActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttemptedToModifyQos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullyModifiedQos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InSessionActivityTimeForERab" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SimultaneousERabAvg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SimultaneousERabMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfReleasedActiveNonActive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttemptedDuringIncomingHo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuccessfullDuringIncomingHo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialAttDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccEmergency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccHighPriorityAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccMtAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccMoSignalling" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccMoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ErabInitialSuccDelayTolerantAccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "numberOfReleasedActiveNonActive",
    "attemptedDuringIncomingHo",
    "successfullDuringIncomingHo",
    "erabInitialAttEmergency",
    "erabInitialAttHighPriorityAccess",
    "erabInitialAttMtAccess",
    "erabInitialAttMoSignalling",
    "erabInitialAttMoData",
    "erabInitialAttDelayTolerantAccess",
    "erabInitialSuccEmergency",
    "erabInitialSuccHighPriorityAccess",
    "erabInitialSuccMtAccess",
    "erabInitialSuccMoSignalling",
    "erabInitialSuccMoData",
    "erabInitialSuccDelayTolerantAccess"
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
    @XmlElementRef(name = "AttemptedDuringIncomingHo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> attemptedDuringIncomingHo;
    @XmlElementRef(name = "SuccessfullDuringIncomingHo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> successfullDuringIncomingHo;
    @XmlElementRef(name = "ErabInitialAttEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttEmergency;
    @XmlElementRef(name = "ErabInitialAttHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttHighPriorityAccess;
    @XmlElementRef(name = "ErabInitialAttMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttMtAccess;
    @XmlElementRef(name = "ErabInitialAttMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttMoSignalling;
    @XmlElementRef(name = "ErabInitialAttMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttMoData;
    @XmlElementRef(name = "ErabInitialAttDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialAttDelayTolerantAccess;
    @XmlElementRef(name = "ErabInitialSuccEmergency", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccEmergency;
    @XmlElementRef(name = "ErabInitialSuccHighPriorityAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccHighPriorityAccess;
    @XmlElementRef(name = "ErabInitialSuccMtAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccMtAccess;
    @XmlElementRef(name = "ErabInitialSuccMoSignalling", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccMoSignalling;
    @XmlElementRef(name = "ErabInitialSuccMoData", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccMoData;
    @XmlElementRef(name = "ErabInitialSuccDelayTolerantAccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> erabInitialSuccDelayTolerantAccess;

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

    /**
     * Gets the value of the attemptedDuringIncomingHo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAttemptedDuringIncomingHo() {
        return attemptedDuringIncomingHo;
    }

    /**
     * Sets the value of the attemptedDuringIncomingHo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAttemptedDuringIncomingHo(JAXBElement<Integer> value) {
        this.attemptedDuringIncomingHo = value;
    }

    /**
     * Gets the value of the successfullDuringIncomingHo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuccessfullDuringIncomingHo() {
        return successfullDuringIncomingHo;
    }

    /**
     * Sets the value of the successfullDuringIncomingHo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuccessfullDuringIncomingHo(JAXBElement<Integer> value) {
        this.successfullDuringIncomingHo = value;
    }

    /**
     * Gets the value of the erabInitialAttEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttEmergency() {
        return erabInitialAttEmergency;
    }

    /**
     * Sets the value of the erabInitialAttEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttEmergency(JAXBElement<Integer> value) {
        this.erabInitialAttEmergency = value;
    }

    /**
     * Gets the value of the erabInitialAttHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttHighPriorityAccess() {
        return erabInitialAttHighPriorityAccess;
    }

    /**
     * Sets the value of the erabInitialAttHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttHighPriorityAccess(JAXBElement<Integer> value) {
        this.erabInitialAttHighPriorityAccess = value;
    }

    /**
     * Gets the value of the erabInitialAttMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttMtAccess() {
        return erabInitialAttMtAccess;
    }

    /**
     * Sets the value of the erabInitialAttMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttMtAccess(JAXBElement<Integer> value) {
        this.erabInitialAttMtAccess = value;
    }

    /**
     * Gets the value of the erabInitialAttMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttMoSignalling() {
        return erabInitialAttMoSignalling;
    }

    /**
     * Sets the value of the erabInitialAttMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttMoSignalling(JAXBElement<Integer> value) {
        this.erabInitialAttMoSignalling = value;
    }

    /**
     * Gets the value of the erabInitialAttMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttMoData() {
        return erabInitialAttMoData;
    }

    /**
     * Sets the value of the erabInitialAttMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttMoData(JAXBElement<Integer> value) {
        this.erabInitialAttMoData = value;
    }

    /**
     * Gets the value of the erabInitialAttDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialAttDelayTolerantAccess() {
        return erabInitialAttDelayTolerantAccess;
    }

    /**
     * Sets the value of the erabInitialAttDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialAttDelayTolerantAccess(JAXBElement<Integer> value) {
        this.erabInitialAttDelayTolerantAccess = value;
    }

    /**
     * Gets the value of the erabInitialSuccEmergency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccEmergency() {
        return erabInitialSuccEmergency;
    }

    /**
     * Sets the value of the erabInitialSuccEmergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccEmergency(JAXBElement<Integer> value) {
        this.erabInitialSuccEmergency = value;
    }

    /**
     * Gets the value of the erabInitialSuccHighPriorityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccHighPriorityAccess() {
        return erabInitialSuccHighPriorityAccess;
    }

    /**
     * Sets the value of the erabInitialSuccHighPriorityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccHighPriorityAccess(JAXBElement<Integer> value) {
        this.erabInitialSuccHighPriorityAccess = value;
    }

    /**
     * Gets the value of the erabInitialSuccMtAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccMtAccess() {
        return erabInitialSuccMtAccess;
    }

    /**
     * Sets the value of the erabInitialSuccMtAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccMtAccess(JAXBElement<Integer> value) {
        this.erabInitialSuccMtAccess = value;
    }

    /**
     * Gets the value of the erabInitialSuccMoSignalling property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccMoSignalling() {
        return erabInitialSuccMoSignalling;
    }

    /**
     * Sets the value of the erabInitialSuccMoSignalling property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccMoSignalling(JAXBElement<Integer> value) {
        this.erabInitialSuccMoSignalling = value;
    }

    /**
     * Gets the value of the erabInitialSuccMoData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccMoData() {
        return erabInitialSuccMoData;
    }

    /**
     * Sets the value of the erabInitialSuccMoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccMoData(JAXBElement<Integer> value) {
        this.erabInitialSuccMoData = value;
    }

    /**
     * Gets the value of the erabInitialSuccDelayTolerantAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getErabInitialSuccDelayTolerantAccess() {
        return erabInitialSuccDelayTolerantAccess;
    }

    /**
     * Sets the value of the erabInitialSuccDelayTolerantAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setErabInitialSuccDelayTolerantAccess(JAXBElement<Integer> value) {
        this.erabInitialSuccDelayTolerantAccess = value;
    }

}
