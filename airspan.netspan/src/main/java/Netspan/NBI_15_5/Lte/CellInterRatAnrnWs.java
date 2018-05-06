
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellInterRatAnrnWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellInterRatAnrnWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RscpThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RscpThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MeasurementTimeDiffIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MeasurementTimeDiff" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MeasurementThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MeasurementThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemovalThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RemovalThreshold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MeasurementCountIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MeasurementCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrxOnDurationIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DrxOnDuration" type="{http://Airspan.Netspan.WebServices}InterRatAnrDurationTimer" minOccurs="0"/>
 *         &lt;element name="DrxInactivityTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DrxInactivityTimer" type="{http://Airspan.Netspan.WebServices}InterRatInactivityTimer" minOccurs="0"/>
 *         &lt;element name="DrxRetransmissionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DrxRetransmissionTimer" type="{http://Airspan.Netspan.WebServices}InterRatRetransmissionTimer" minOccurs="0"/>
 *         &lt;element name="DrxLongCycleIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DrxLongCycle" type="{http://Airspan.Netspan.WebServices}InterRatDrxCycle" minOccurs="0"/>
 *         &lt;element name="RollbackTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RollbackTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellInterRatAnrnWs", propOrder = {
    "rscpThresholdIsDefault",
    "rscpThreshold",
    "measurementTimeDiffIsDefault",
    "measurementTimeDiff",
    "measurementThresholdIsDefault",
    "measurementThreshold",
    "removalThresholdIsDefault",
    "removalThreshold",
    "measurementCountIsDefault",
    "measurementCount",
    "drxOnDurationIsDefault",
    "drxOnDuration",
    "drxInactivityTimerIsDefault",
    "drxInactivityTimer",
    "drxRetransmissionTimerIsDefault",
    "drxRetransmissionTimer",
    "drxLongCycleIsDefault",
    "drxLongCycle",
    "rollbackTimerIsDefault",
    "rollbackTimer"
})
public class CellInterRatAnrnWs {

    @XmlElementRef(name = "RscpThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rscpThresholdIsDefault;
    @XmlElementRef(name = "RscpThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rscpThreshold;
    @XmlElementRef(name = "MeasurementTimeDiffIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> measurementTimeDiffIsDefault;
    @XmlElementRef(name = "MeasurementTimeDiff", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measurementTimeDiff;
    @XmlElementRef(name = "MeasurementThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> measurementThresholdIsDefault;
    @XmlElementRef(name = "MeasurementThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measurementThreshold;
    @XmlElementRef(name = "RemovalThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> removalThresholdIsDefault;
    @XmlElement(name = "RemovalThreshold", required = true, type = Integer.class, nillable = true)
    protected Integer removalThreshold;
    @XmlElementRef(name = "MeasurementCountIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> measurementCountIsDefault;
    @XmlElementRef(name = "MeasurementCount", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measurementCount;
    @XmlElementRef(name = "DrxOnDurationIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> drxOnDurationIsDefault;
    @XmlElementRef(name = "DrxOnDuration", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxOnDuration;
    @XmlElementRef(name = "DrxInactivityTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> drxInactivityTimerIsDefault;
    @XmlElementRef(name = "DrxInactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxInactivityTimer;
    @XmlElement(name = "DrxRetransmissionTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean drxRetransmissionTimerIsDefault;
    @XmlElementRef(name = "DrxRetransmissionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxRetransmissionTimer;
    @XmlElement(name = "DrxLongCycleIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean drxLongCycleIsDefault;
    @XmlElementRef(name = "DrxLongCycle", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> drxLongCycle;
    @XmlElement(name = "RollbackTimerIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean rollbackTimerIsDefault;
    @XmlElementRef(name = "RollbackTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rollbackTimer;

    /**
     * Gets the value of the rscpThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRscpThresholdIsDefault() {
        return rscpThresholdIsDefault;
    }

    /**
     * Sets the value of the rscpThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRscpThresholdIsDefault(JAXBElement<Boolean> value) {
        this.rscpThresholdIsDefault = value;
    }

    /**
     * Gets the value of the rscpThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRscpThreshold() {
        return rscpThreshold;
    }

    /**
     * Sets the value of the rscpThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRscpThreshold(JAXBElement<Integer> value) {
        this.rscpThreshold = value;
    }

    /**
     * Gets the value of the measurementTimeDiffIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeasurementTimeDiffIsDefault() {
        return measurementTimeDiffIsDefault;
    }

    /**
     * Sets the value of the measurementTimeDiffIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeasurementTimeDiffIsDefault(JAXBElement<Boolean> value) {
        this.measurementTimeDiffIsDefault = value;
    }

    /**
     * Gets the value of the measurementTimeDiff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasurementTimeDiff() {
        return measurementTimeDiff;
    }

    /**
     * Sets the value of the measurementTimeDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasurementTimeDiff(JAXBElement<Integer> value) {
        this.measurementTimeDiff = value;
    }

    /**
     * Gets the value of the measurementThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeasurementThresholdIsDefault() {
        return measurementThresholdIsDefault;
    }

    /**
     * Sets the value of the measurementThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeasurementThresholdIsDefault(JAXBElement<Boolean> value) {
        this.measurementThresholdIsDefault = value;
    }

    /**
     * Gets the value of the measurementThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasurementThreshold() {
        return measurementThreshold;
    }

    /**
     * Sets the value of the measurementThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasurementThreshold(JAXBElement<Integer> value) {
        this.measurementThreshold = value;
    }

    /**
     * Gets the value of the removalThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRemovalThresholdIsDefault() {
        return removalThresholdIsDefault;
    }

    /**
     * Sets the value of the removalThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRemovalThresholdIsDefault(JAXBElement<Boolean> value) {
        this.removalThresholdIsDefault = value;
    }

    /**
     * Gets the value of the removalThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemovalThreshold() {
        return removalThreshold;
    }

    /**
     * Sets the value of the removalThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemovalThreshold(Integer value) {
        this.removalThreshold = value;
    }

    /**
     * Gets the value of the measurementCountIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeasurementCountIsDefault() {
        return measurementCountIsDefault;
    }

    /**
     * Sets the value of the measurementCountIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeasurementCountIsDefault(JAXBElement<Boolean> value) {
        this.measurementCountIsDefault = value;
    }

    /**
     * Gets the value of the measurementCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasurementCount() {
        return measurementCount;
    }

    /**
     * Sets the value of the measurementCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasurementCount(JAXBElement<Integer> value) {
        this.measurementCount = value;
    }

    /**
     * Gets the value of the drxOnDurationIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDrxOnDurationIsDefault() {
        return drxOnDurationIsDefault;
    }

    /**
     * Sets the value of the drxOnDurationIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDrxOnDurationIsDefault(JAXBElement<Boolean> value) {
        this.drxOnDurationIsDefault = value;
    }

    /**
     * Gets the value of the drxOnDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxOnDuration() {
        return drxOnDuration;
    }

    /**
     * Sets the value of the drxOnDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxOnDuration(JAXBElement<String> value) {
        this.drxOnDuration = value;
    }

    /**
     * Gets the value of the drxInactivityTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDrxInactivityTimerIsDefault() {
        return drxInactivityTimerIsDefault;
    }

    /**
     * Sets the value of the drxInactivityTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDrxInactivityTimerIsDefault(JAXBElement<Boolean> value) {
        this.drxInactivityTimerIsDefault = value;
    }

    /**
     * Gets the value of the drxInactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxInactivityTimer() {
        return drxInactivityTimer;
    }

    /**
     * Sets the value of the drxInactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxInactivityTimer(JAXBElement<String> value) {
        this.drxInactivityTimer = value;
    }

    /**
     * Gets the value of the drxRetransmissionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrxRetransmissionTimerIsDefault() {
        return drxRetransmissionTimerIsDefault;
    }

    /**
     * Sets the value of the drxRetransmissionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrxRetransmissionTimerIsDefault(Boolean value) {
        this.drxRetransmissionTimerIsDefault = value;
    }

    /**
     * Gets the value of the drxRetransmissionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxRetransmissionTimer() {
        return drxRetransmissionTimer;
    }

    /**
     * Sets the value of the drxRetransmissionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxRetransmissionTimer(JAXBElement<String> value) {
        this.drxRetransmissionTimer = value;
    }

    /**
     * Gets the value of the drxLongCycleIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrxLongCycleIsDefault() {
        return drxLongCycleIsDefault;
    }

    /**
     * Sets the value of the drxLongCycleIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrxLongCycleIsDefault(Boolean value) {
        this.drxLongCycleIsDefault = value;
    }

    /**
     * Gets the value of the drxLongCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDrxLongCycle() {
        return drxLongCycle;
    }

    /**
     * Sets the value of the drxLongCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDrxLongCycle(JAXBElement<String> value) {
        this.drxLongCycle = value;
    }

    /**
     * Gets the value of the rollbackTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollbackTimerIsDefault() {
        return rollbackTimerIsDefault;
    }

    /**
     * Sets the value of the rollbackTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRollbackTimerIsDefault(Boolean value) {
        this.rollbackTimerIsDefault = value;
    }

    /**
     * Gets the value of the rollbackTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRollbackTimer() {
        return rollbackTimer;
    }

    /**
     * Sets the value of the rollbackTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRollbackTimer(JAXBElement<Integer> value) {
        this.rollbackTimer = value;
    }

}
