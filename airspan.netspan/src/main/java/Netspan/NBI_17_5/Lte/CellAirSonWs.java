
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for CellAirSonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellAirSonWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AperiodicCqiGuardTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AperiodicCqiGuardTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AperiodicCqiMinMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AperiodicCqiMinMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeThroughputReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UeThroughputReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CapacitySampleIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CapacitySampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CapacityReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CapacityReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RrcLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RrcLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CpuLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CpuLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoKpiReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoKpiReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HoReportEvaluationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HoReportEvaluationTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TimerMroUpdateIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimerMroUpdate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MroPerModeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MroPerMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="OcnDeadBandIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OcnDeadBand" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PingPongHoTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PingPongHoTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellAirSonWs", propOrder = {
    "aperiodicCqiGuardTimerIsDefault",
    "aperiodicCqiGuardTimer",
    "aperiodicCqiMinMcsIsDefault",
    "aperiodicCqiMinMcs",
    "ueThroughputReportIntervalIsDefault",
    "ueThroughputReportInterval",
    "capacitySampleIntervalIsDefault",
    "capacitySampleInterval",
    "capacityReportIntervalIsDefault",
    "capacityReportInterval",
    "prbLoadWeightIsDefault",
    "prbLoadWeight",
    "rrcLoadWeightIsDefault",
    "rrcLoadWeight",
    "cpuLoadWeightIsDefault",
    "cpuLoadWeight",
    "hoKpiReportIntervalIsDefault",
    "hoKpiReportInterval",
    "hoReportEvaluationTimerIsDefault",
    "hoReportEvaluationTimer",
    "timerMroUpdateIsDefault",
    "timerMroUpdate",
    "mroPerModeIsDefault",
    "mroPerMode",
    "ocnDeadBandIsDefault",
    "ocnDeadBand",
    "pingPongHoTimerIsDefault",
    "pingPongHoTimer"
})
public class CellAirSonWs {

    @XmlElementRef(name = "AperiodicCqiGuardTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> aperiodicCqiGuardTimerIsDefault;
    @XmlElementRef(name = "AperiodicCqiGuardTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aperiodicCqiGuardTimer;
    @XmlElementRef(name = "AperiodicCqiMinMcsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> aperiodicCqiMinMcsIsDefault;
    @XmlElementRef(name = "AperiodicCqiMinMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aperiodicCqiMinMcs;
    @XmlElementRef(name = "UeThroughputReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ueThroughputReportIntervalIsDefault;
    @XmlElementRef(name = "UeThroughputReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueThroughputReportInterval;
    @XmlElementRef(name = "CapacitySampleIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacitySampleIntervalIsDefault;
    @XmlElementRef(name = "CapacitySampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacitySampleInterval;
    @XmlElementRef(name = "CapacityReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacityReportIntervalIsDefault;
    @XmlElementRef(name = "CapacityReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacityReportInterval;
    @XmlElementRef(name = "PrbLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> prbLoadWeightIsDefault;
    @XmlElementRef(name = "PrbLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prbLoadWeight;
    @XmlElementRef(name = "RrcLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcLoadWeightIsDefault;
    @XmlElementRef(name = "RrcLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcLoadWeight;
    @XmlElementRef(name = "CpuLoadWeightIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cpuLoadWeightIsDefault;
    @XmlElementRef(name = "CpuLoadWeight", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpuLoadWeight;
    @XmlElementRef(name = "HoKpiReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoKpiReportIntervalIsDefault;
    @XmlElementRef(name = "HoKpiReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoKpiReportInterval;
    @XmlElementRef(name = "HoReportEvaluationTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hoReportEvaluationTimerIsDefault;
    @XmlElementRef(name = "HoReportEvaluationTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hoReportEvaluationTimer;
    @XmlElementRef(name = "TimerMroUpdateIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> timerMroUpdateIsDefault;
    @XmlElementRef(name = "TimerMroUpdate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timerMroUpdate;
    @XmlElementRef(name = "MroPerModeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mroPerModeIsDefault;
    @XmlElementRef(name = "MroPerMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> mroPerMode;
    @XmlElementRef(name = "OcnDeadBandIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ocnDeadBandIsDefault;
    @XmlElementRef(name = "OcnDeadBand", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ocnDeadBand;
    @XmlElementRef(name = "PingPongHoTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pingPongHoTimerIsDefault;
    @XmlElementRef(name = "PingPongHoTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pingPongHoTimer;

    /**
     * Gets the value of the aperiodicCqiGuardTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAperiodicCqiGuardTimerIsDefault() {
        return aperiodicCqiGuardTimerIsDefault;
    }

    /**
     * Sets the value of the aperiodicCqiGuardTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAperiodicCqiGuardTimerIsDefault(JAXBElement<Boolean> value) {
        this.aperiodicCqiGuardTimerIsDefault = value;
    }

    /**
     * Gets the value of the aperiodicCqiGuardTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAperiodicCqiGuardTimer() {
        return aperiodicCqiGuardTimer;
    }

    /**
     * Sets the value of the aperiodicCqiGuardTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAperiodicCqiGuardTimer(JAXBElement<Integer> value) {
        this.aperiodicCqiGuardTimer = value;
    }

    /**
     * Gets the value of the aperiodicCqiMinMcsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAperiodicCqiMinMcsIsDefault() {
        return aperiodicCqiMinMcsIsDefault;
    }

    /**
     * Sets the value of the aperiodicCqiMinMcsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAperiodicCqiMinMcsIsDefault(JAXBElement<Boolean> value) {
        this.aperiodicCqiMinMcsIsDefault = value;
    }

    /**
     * Gets the value of the aperiodicCqiMinMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAperiodicCqiMinMcs() {
        return aperiodicCqiMinMcs;
    }

    /**
     * Sets the value of the aperiodicCqiMinMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAperiodicCqiMinMcs(JAXBElement<Integer> value) {
        this.aperiodicCqiMinMcs = value;
    }

    /**
     * Gets the value of the ueThroughputReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUeThroughputReportIntervalIsDefault() {
        return ueThroughputReportIntervalIsDefault;
    }

    /**
     * Sets the value of the ueThroughputReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUeThroughputReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.ueThroughputReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the ueThroughputReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeThroughputReportInterval() {
        return ueThroughputReportInterval;
    }

    /**
     * Sets the value of the ueThroughputReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeThroughputReportInterval(JAXBElement<Integer> value) {
        this.ueThroughputReportInterval = value;
    }

    /**
     * Gets the value of the capacitySampleIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapacitySampleIntervalIsDefault() {
        return capacitySampleIntervalIsDefault;
    }

    /**
     * Sets the value of the capacitySampleIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapacitySampleIntervalIsDefault(JAXBElement<Boolean> value) {
        this.capacitySampleIntervalIsDefault = value;
    }

    /**
     * Gets the value of the capacitySampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacitySampleInterval() {
        return capacitySampleInterval;
    }

    /**
     * Sets the value of the capacitySampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacitySampleInterval(JAXBElement<Integer> value) {
        this.capacitySampleInterval = value;
    }

    /**
     * Gets the value of the capacityReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapacityReportIntervalIsDefault() {
        return capacityReportIntervalIsDefault;
    }

    /**
     * Sets the value of the capacityReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapacityReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.capacityReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the capacityReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacityReportInterval() {
        return capacityReportInterval;
    }

    /**
     * Sets the value of the capacityReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacityReportInterval(JAXBElement<Integer> value) {
        this.capacityReportInterval = value;
    }

    /**
     * Gets the value of the prbLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrbLoadWeightIsDefault() {
        return prbLoadWeightIsDefault;
    }

    /**
     * Sets the value of the prbLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrbLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.prbLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the prbLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrbLoadWeight() {
        return prbLoadWeight;
    }

    /**
     * Sets the value of the prbLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrbLoadWeight(JAXBElement<Integer> value) {
        this.prbLoadWeight = value;
    }

    /**
     * Gets the value of the rrcLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcLoadWeightIsDefault() {
        return rrcLoadWeightIsDefault;
    }

    /**
     * Sets the value of the rrcLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.rrcLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the rrcLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcLoadWeight() {
        return rrcLoadWeight;
    }

    /**
     * Sets the value of the rrcLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcLoadWeight(JAXBElement<Integer> value) {
        this.rrcLoadWeight = value;
    }

    /**
     * Gets the value of the cpuLoadWeightIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCpuLoadWeightIsDefault() {
        return cpuLoadWeightIsDefault;
    }

    /**
     * Sets the value of the cpuLoadWeightIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCpuLoadWeightIsDefault(JAXBElement<Boolean> value) {
        this.cpuLoadWeightIsDefault = value;
    }

    /**
     * Gets the value of the cpuLoadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpuLoadWeight() {
        return cpuLoadWeight;
    }

    /**
     * Sets the value of the cpuLoadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpuLoadWeight(JAXBElement<Integer> value) {
        this.cpuLoadWeight = value;
    }

    /**
     * Gets the value of the hoKpiReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoKpiReportIntervalIsDefault() {
        return hoKpiReportIntervalIsDefault;
    }

    /**
     * Sets the value of the hoKpiReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoKpiReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.hoKpiReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the hoKpiReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoKpiReportInterval() {
        return hoKpiReportInterval;
    }

    /**
     * Sets the value of the hoKpiReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoKpiReportInterval(JAXBElement<Integer> value) {
        this.hoKpiReportInterval = value;
    }

    /**
     * Gets the value of the hoReportEvaluationTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHoReportEvaluationTimerIsDefault() {
        return hoReportEvaluationTimerIsDefault;
    }

    /**
     * Sets the value of the hoReportEvaluationTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHoReportEvaluationTimerIsDefault(JAXBElement<Boolean> value) {
        this.hoReportEvaluationTimerIsDefault = value;
    }

    /**
     * Gets the value of the hoReportEvaluationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoReportEvaluationTimer() {
        return hoReportEvaluationTimer;
    }

    /**
     * Sets the value of the hoReportEvaluationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoReportEvaluationTimer(JAXBElement<Integer> value) {
        this.hoReportEvaluationTimer = value;
    }

    /**
     * Gets the value of the timerMroUpdateIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getTimerMroUpdateIsDefault() {
        return timerMroUpdateIsDefault;
    }

    /**
     * Sets the value of the timerMroUpdateIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setTimerMroUpdateIsDefault(JAXBElement<Boolean> value) {
        this.timerMroUpdateIsDefault = value;
    }

    /**
     * Gets the value of the timerMroUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimerMroUpdate() {
        return timerMroUpdate;
    }

    /**
     * Sets the value of the timerMroUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimerMroUpdate(JAXBElement<Integer> value) {
        this.timerMroUpdate = value;
    }

    /**
     * Gets the value of the mroPerModeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMroPerModeIsDefault() {
        return mroPerModeIsDefault;
    }

    /**
     * Sets the value of the mroPerModeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMroPerModeIsDefault(JAXBElement<Boolean> value) {
        this.mroPerModeIsDefault = value;
    }

    /**
     * Gets the value of the mroPerMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getMroPerMode() {
        return mroPerMode;
    }

    /**
     * Sets the value of the mroPerMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setMroPerMode(JAXBElement<EnabledStates> value) {
        this.mroPerMode = value;
    }

    /**
     * Gets the value of the ocnDeadBandIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOcnDeadBandIsDefault() {
        return ocnDeadBandIsDefault;
    }

    /**
     * Sets the value of the ocnDeadBandIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOcnDeadBandIsDefault(JAXBElement<Boolean> value) {
        this.ocnDeadBandIsDefault = value;
    }

    /**
     * Gets the value of the ocnDeadBand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOcnDeadBand() {
        return ocnDeadBand;
    }

    /**
     * Sets the value of the ocnDeadBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOcnDeadBand(JAXBElement<Integer> value) {
        this.ocnDeadBand = value;
    }

    /**
     * Gets the value of the pingPongHoTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPingPongHoTimerIsDefault() {
        return pingPongHoTimerIsDefault;
    }

    /**
     * Sets the value of the pingPongHoTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPingPongHoTimerIsDefault(JAXBElement<Boolean> value) {
        this.pingPongHoTimerIsDefault = value;
    }

    /**
     * Gets the value of the pingPongHoTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPingPongHoTimer() {
        return pingPongHoTimer;
    }

    /**
     * Sets the value of the pingPongHoTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPingPongHoTimer(JAXBElement<Integer> value) {
        this.pingPongHoTimer = value;
    }

}
