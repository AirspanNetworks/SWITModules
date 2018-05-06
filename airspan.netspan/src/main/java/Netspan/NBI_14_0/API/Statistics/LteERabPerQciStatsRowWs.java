
package Netspan.NBI_14_0.API.Statistics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CellId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QciIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateAndTimeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateAndTimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GranularityPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InitialAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalAttemptedToSetup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdditionalSuccessfullyEstablished" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MeanERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxERabSetupTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReqToReleasePerQci" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttemptedToRelease" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuccessfullyReleased" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfReleasedActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttemptedToModifyQos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SuccessfullyModifiedQos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSessionActivityTimeForERab" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SimultaneousERabAvg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SimultaneousERabMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "simultaneousERabMax"
})
public class LteERabPerQciStatsRowWs {

    @XmlElement(name = "CellId", required = true, type = Integer.class, nillable = true)
    protected Integer cellId;
    @XmlElement(name = "QciIndex", required = true, type = Integer.class, nillable = true)
    protected Integer qciIndex;
    @XmlElement(name = "DateAndTimeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeStart;
    @XmlElement(name = "DateAndTimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTimeEnd;
    @XmlElement(name = "GranularityPeriod", required = true, type = Integer.class, nillable = true)
    protected Integer granularityPeriod;
    @XmlElement(name = "InitialAttemptedToSetup", required = true, type = Integer.class, nillable = true)
    protected Integer initialAttemptedToSetup;
    @XmlElement(name = "SuccessfullyEstablished", required = true, type = Integer.class, nillable = true)
    protected Integer successfullyEstablished;
    @XmlElement(name = "AdditionalAttemptedToSetup", required = true, type = Integer.class, nillable = true)
    protected Integer additionalAttemptedToSetup;
    @XmlElement(name = "AdditionalSuccessfullyEstablished", required = true, type = Integer.class, nillable = true)
    protected Integer additionalSuccessfullyEstablished;
    @XmlElement(name = "MeanERabSetupTime", required = true, type = Integer.class, nillable = true)
    protected Integer meanERabSetupTime;
    @XmlElement(name = "MaxERabSetupTime", required = true, type = Integer.class, nillable = true)
    protected Integer maxERabSetupTime;
    @XmlElement(name = "ReqToReleasePerQci", required = true, type = Integer.class, nillable = true)
    protected Integer reqToReleasePerQci;
    @XmlElement(name = "AttemptedToRelease", required = true, type = Integer.class, nillable = true)
    protected Integer attemptedToRelease;
    @XmlElement(name = "SuccessfullyReleased", required = true, type = Integer.class, nillable = true)
    protected Integer successfullyReleased;
    @XmlElement(name = "NumberOfReleasedActive", required = true, type = Integer.class, nillable = true)
    protected Integer numberOfReleasedActive;
    @XmlElement(name = "AttemptedToModifyQos", required = true, type = Integer.class, nillable = true)
    protected Integer attemptedToModifyQos;
    @XmlElement(name = "SuccessfullyModifiedQos", required = true, type = Integer.class, nillable = true)
    protected Integer successfullyModifiedQos;
    @XmlElement(name = "InSessionActivityTimeForERab", required = true, type = Integer.class, nillable = true)
    protected Integer inSessionActivityTimeForERab;
    @XmlElement(name = "SimultaneousERabAvg", required = true, type = Integer.class, nillable = true)
    protected Integer simultaneousERabAvg;
    @XmlElement(name = "SimultaneousERabMax", required = true, type = Integer.class, nillable = true)
    protected Integer simultaneousERabMax;

    /**
     * Gets the value of the cellId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Sets the value of the cellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCellId(Integer value) {
        this.cellId = value;
    }

    /**
     * Gets the value of the qciIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQciIndex() {
        return qciIndex;
    }

    /**
     * Sets the value of the qciIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQciIndex(Integer value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getGranularityPeriod() {
        return granularityPeriod;
    }

    /**
     * Sets the value of the granularityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGranularityPeriod(Integer value) {
        this.granularityPeriod = value;
    }

    /**
     * Gets the value of the initialAttemptedToSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInitialAttemptedToSetup() {
        return initialAttemptedToSetup;
    }

    /**
     * Sets the value of the initialAttemptedToSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInitialAttemptedToSetup(Integer value) {
        this.initialAttemptedToSetup = value;
    }

    /**
     * Gets the value of the successfullyEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessfullyEstablished() {
        return successfullyEstablished;
    }

    /**
     * Sets the value of the successfullyEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessfullyEstablished(Integer value) {
        this.successfullyEstablished = value;
    }

    /**
     * Gets the value of the additionalAttemptedToSetup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalAttemptedToSetup() {
        return additionalAttemptedToSetup;
    }

    /**
     * Sets the value of the additionalAttemptedToSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalAttemptedToSetup(Integer value) {
        this.additionalAttemptedToSetup = value;
    }

    /**
     * Gets the value of the additionalSuccessfullyEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdditionalSuccessfullyEstablished() {
        return additionalSuccessfullyEstablished;
    }

    /**
     * Sets the value of the additionalSuccessfullyEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdditionalSuccessfullyEstablished(Integer value) {
        this.additionalSuccessfullyEstablished = value;
    }

    /**
     * Gets the value of the meanERabSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeanERabSetupTime() {
        return meanERabSetupTime;
    }

    /**
     * Sets the value of the meanERabSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeanERabSetupTime(Integer value) {
        this.meanERabSetupTime = value;
    }

    /**
     * Gets the value of the maxERabSetupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxERabSetupTime() {
        return maxERabSetupTime;
    }

    /**
     * Sets the value of the maxERabSetupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxERabSetupTime(Integer value) {
        this.maxERabSetupTime = value;
    }

    /**
     * Gets the value of the reqToReleasePerQci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReqToReleasePerQci() {
        return reqToReleasePerQci;
    }

    /**
     * Sets the value of the reqToReleasePerQci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReqToReleasePerQci(Integer value) {
        this.reqToReleasePerQci = value;
    }

    /**
     * Gets the value of the attemptedToRelease property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttemptedToRelease() {
        return attemptedToRelease;
    }

    /**
     * Sets the value of the attemptedToRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttemptedToRelease(Integer value) {
        this.attemptedToRelease = value;
    }

    /**
     * Gets the value of the successfullyReleased property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessfullyReleased() {
        return successfullyReleased;
    }

    /**
     * Sets the value of the successfullyReleased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessfullyReleased(Integer value) {
        this.successfullyReleased = value;
    }

    /**
     * Gets the value of the numberOfReleasedActive property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfReleasedActive() {
        return numberOfReleasedActive;
    }

    /**
     * Sets the value of the numberOfReleasedActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfReleasedActive(Integer value) {
        this.numberOfReleasedActive = value;
    }

    /**
     * Gets the value of the attemptedToModifyQos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttemptedToModifyQos() {
        return attemptedToModifyQos;
    }

    /**
     * Sets the value of the attemptedToModifyQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttemptedToModifyQos(Integer value) {
        this.attemptedToModifyQos = value;
    }

    /**
     * Gets the value of the successfullyModifiedQos property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessfullyModifiedQos() {
        return successfullyModifiedQos;
    }

    /**
     * Sets the value of the successfullyModifiedQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessfullyModifiedQos(Integer value) {
        this.successfullyModifiedQos = value;
    }

    /**
     * Gets the value of the inSessionActivityTimeForERab property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInSessionActivityTimeForERab() {
        return inSessionActivityTimeForERab;
    }

    /**
     * Sets the value of the inSessionActivityTimeForERab property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInSessionActivityTimeForERab(Integer value) {
        this.inSessionActivityTimeForERab = value;
    }

    /**
     * Gets the value of the simultaneousERabAvg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimultaneousERabAvg() {
        return simultaneousERabAvg;
    }

    /**
     * Sets the value of the simultaneousERabAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimultaneousERabAvg(Integer value) {
        this.simultaneousERabAvg = value;
    }

    /**
     * Gets the value of the simultaneousERabMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSimultaneousERabMax() {
        return simultaneousERabMax;
    }

    /**
     * Sets the value of the simultaneousERabMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSimultaneousERabMax(Integer value) {
        this.simultaneousERabMax = value;
    }

}
