
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteTpmStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteTpmStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqHoTooLateGoodCoverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqHoTooLateGoodCoverageUnprepCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqHoTooLatePoorCoverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OutgoingCoverageInterFreqHoAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PowerAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassiveMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WasEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MoCycleDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LongDormancyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CountTpMoCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CoverageFailureRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MobilityFailureRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DormancyTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ConsecutiveHighFailureRateCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqHoEarly" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraHoWrongCell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IntraFreqOutHoAttempt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TargetPower" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PTxInusePrevious" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxPowerDecidedByTpmMo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ReEstabSameCellPoorCoverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteTpmStatusWs", propOrder = {
    "cellNumber",
    "intraFreqHoTooLateGoodCoverage",
    "intraFreqHoTooLateGoodCoverageUnprepCell",
    "intraFreqHoTooLatePoorCoverage",
    "outgoingCoverageInterFreqHoAttempts",
    "powerAdjustment",
    "passiveMode",
    "wasEnabled",
    "moCycleDuration",
    "longDormancyTime",
    "countTpMoCalls",
    "coverageFailureRate",
    "mobilityFailureRate",
    "dormancyTime",
    "consecutiveHighFailureRateCount",
    "intraFreqHoEarly",
    "intraHoWrongCell",
    "intraFreqOutHoAttempt",
    "targetPower",
    "pTxInusePrevious",
    "txPowerDecidedByTpmMo",
    "reEstabSameCellPoorCoverage"
})
public class LteTpmStatusWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellNumber;
    @XmlElementRef(name = "IntraFreqHoTooLateGoodCoverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqHoTooLateGoodCoverage;
    @XmlElementRef(name = "IntraFreqHoTooLateGoodCoverageUnprepCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqHoTooLateGoodCoverageUnprepCell;
    @XmlElementRef(name = "IntraFreqHoTooLatePoorCoverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqHoTooLatePoorCoverage;
    @XmlElementRef(name = "OutgoingCoverageInterFreqHoAttempts", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> outgoingCoverageInterFreqHoAttempts;
    @XmlElementRef(name = "PowerAdjustment", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerAdjustment;
    @XmlElementRef(name = "PassiveMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> passiveMode;
    @XmlElementRef(name = "WasEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> wasEnabled;
    @XmlElementRef(name = "MoCycleDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> moCycleDuration;
    @XmlElementRef(name = "LongDormancyTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> longDormancyTime;
    @XmlElementRef(name = "CountTpMoCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countTpMoCalls;
    @XmlElementRef(name = "CoverageFailureRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> coverageFailureRate;
    @XmlElementRef(name = "MobilityFailureRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mobilityFailureRate;
    @XmlElementRef(name = "DormancyTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dormancyTime;
    @XmlElementRef(name = "ConsecutiveHighFailureRateCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> consecutiveHighFailureRateCount;
    @XmlElementRef(name = "IntraFreqHoEarly", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqHoEarly;
    @XmlElementRef(name = "IntraHoWrongCell", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraHoWrongCell;
    @XmlElementRef(name = "IntraFreqOutHoAttempt", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> intraFreqOutHoAttempt;
    @XmlElementRef(name = "TargetPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> targetPower;
    @XmlElementRef(name = "PTxInusePrevious", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pTxInusePrevious;
    @XmlElementRef(name = "TxPowerDecidedByTpmMo", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> txPowerDecidedByTpmMo;
    @XmlElementRef(name = "ReEstabSameCellPoorCoverage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reEstabSameCellPoorCoverage;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<Integer> value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the intraFreqHoTooLateGoodCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqHoTooLateGoodCoverage() {
        return intraFreqHoTooLateGoodCoverage;
    }

    /**
     * Sets the value of the intraFreqHoTooLateGoodCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqHoTooLateGoodCoverage(JAXBElement<Integer> value) {
        this.intraFreqHoTooLateGoodCoverage = value;
    }

    /**
     * Gets the value of the intraFreqHoTooLateGoodCoverageUnprepCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqHoTooLateGoodCoverageUnprepCell() {
        return intraFreqHoTooLateGoodCoverageUnprepCell;
    }

    /**
     * Sets the value of the intraFreqHoTooLateGoodCoverageUnprepCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqHoTooLateGoodCoverageUnprepCell(JAXBElement<Integer> value) {
        this.intraFreqHoTooLateGoodCoverageUnprepCell = value;
    }

    /**
     * Gets the value of the intraFreqHoTooLatePoorCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqHoTooLatePoorCoverage() {
        return intraFreqHoTooLatePoorCoverage;
    }

    /**
     * Sets the value of the intraFreqHoTooLatePoorCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqHoTooLatePoorCoverage(JAXBElement<Integer> value) {
        this.intraFreqHoTooLatePoorCoverage = value;
    }

    /**
     * Gets the value of the outgoingCoverageInterFreqHoAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOutgoingCoverageInterFreqHoAttempts() {
        return outgoingCoverageInterFreqHoAttempts;
    }

    /**
     * Sets the value of the outgoingCoverageInterFreqHoAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOutgoingCoverageInterFreqHoAttempts(JAXBElement<Integer> value) {
        this.outgoingCoverageInterFreqHoAttempts = value;
    }

    /**
     * Gets the value of the powerAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerAdjustment() {
        return powerAdjustment;
    }

    /**
     * Sets the value of the powerAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerAdjustment(JAXBElement<Boolean> value) {
        this.powerAdjustment = value;
    }

    /**
     * Gets the value of the passiveMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPassiveMode() {
        return passiveMode;
    }

    /**
     * Sets the value of the passiveMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPassiveMode(JAXBElement<Boolean> value) {
        this.passiveMode = value;
    }

    /**
     * Gets the value of the wasEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWasEnabled() {
        return wasEnabled;
    }

    /**
     * Sets the value of the wasEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWasEnabled(JAXBElement<Boolean> value) {
        this.wasEnabled = value;
    }

    /**
     * Gets the value of the moCycleDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMoCycleDuration() {
        return moCycleDuration;
    }

    /**
     * Sets the value of the moCycleDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMoCycleDuration(JAXBElement<Integer> value) {
        this.moCycleDuration = value;
    }

    /**
     * Gets the value of the longDormancyTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLongDormancyTime() {
        return longDormancyTime;
    }

    /**
     * Sets the value of the longDormancyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLongDormancyTime(JAXBElement<Integer> value) {
        this.longDormancyTime = value;
    }

    /**
     * Gets the value of the countTpMoCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountTpMoCalls() {
        return countTpMoCalls;
    }

    /**
     * Sets the value of the countTpMoCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountTpMoCalls(JAXBElement<Integer> value) {
        this.countTpMoCalls = value;
    }

    /**
     * Gets the value of the coverageFailureRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCoverageFailureRate() {
        return coverageFailureRate;
    }

    /**
     * Sets the value of the coverageFailureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCoverageFailureRate(JAXBElement<Integer> value) {
        this.coverageFailureRate = value;
    }

    /**
     * Gets the value of the mobilityFailureRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMobilityFailureRate() {
        return mobilityFailureRate;
    }

    /**
     * Sets the value of the mobilityFailureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMobilityFailureRate(JAXBElement<Integer> value) {
        this.mobilityFailureRate = value;
    }

    /**
     * Gets the value of the dormancyTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDormancyTime() {
        return dormancyTime;
    }

    /**
     * Sets the value of the dormancyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDormancyTime(JAXBElement<Integer> value) {
        this.dormancyTime = value;
    }

    /**
     * Gets the value of the consecutiveHighFailureRateCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConsecutiveHighFailureRateCount() {
        return consecutiveHighFailureRateCount;
    }

    /**
     * Sets the value of the consecutiveHighFailureRateCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConsecutiveHighFailureRateCount(JAXBElement<Integer> value) {
        this.consecutiveHighFailureRateCount = value;
    }

    /**
     * Gets the value of the intraFreqHoEarly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqHoEarly() {
        return intraFreqHoEarly;
    }

    /**
     * Sets the value of the intraFreqHoEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqHoEarly(JAXBElement<Integer> value) {
        this.intraFreqHoEarly = value;
    }

    /**
     * Gets the value of the intraHoWrongCell property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraHoWrongCell() {
        return intraHoWrongCell;
    }

    /**
     * Sets the value of the intraHoWrongCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraHoWrongCell(JAXBElement<Integer> value) {
        this.intraHoWrongCell = value;
    }

    /**
     * Gets the value of the intraFreqOutHoAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIntraFreqOutHoAttempt() {
        return intraFreqOutHoAttempt;
    }

    /**
     * Sets the value of the intraFreqOutHoAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIntraFreqOutHoAttempt(JAXBElement<Integer> value) {
        this.intraFreqOutHoAttempt = value;
    }

    /**
     * Gets the value of the targetPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTargetPower() {
        return targetPower;
    }

    /**
     * Sets the value of the targetPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTargetPower(JAXBElement<Integer> value) {
        this.targetPower = value;
    }

    /**
     * Gets the value of the pTxInusePrevious property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPTxInusePrevious() {
        return pTxInusePrevious;
    }

    /**
     * Sets the value of the pTxInusePrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPTxInusePrevious(JAXBElement<Integer> value) {
        this.pTxInusePrevious = value;
    }

    /**
     * Gets the value of the txPowerDecidedByTpmMo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTxPowerDecidedByTpmMo() {
        return txPowerDecidedByTpmMo;
    }

    /**
     * Sets the value of the txPowerDecidedByTpmMo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTxPowerDecidedByTpmMo(JAXBElement<Integer> value) {
        this.txPowerDecidedByTpmMo = value;
    }

    /**
     * Gets the value of the reEstabSameCellPoorCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReEstabSameCellPoorCoverage() {
        return reEstabSameCellPoorCoverage;
    }

    /**
     * Sets the value of the reEstabSameCellPoorCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReEstabSameCellPoorCoverage(JAXBElement<Integer> value) {
        this.reEstabSameCellPoorCoverage = value;
    }

}
