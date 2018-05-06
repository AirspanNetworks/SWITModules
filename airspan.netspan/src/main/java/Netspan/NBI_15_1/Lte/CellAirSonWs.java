
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellAirSonWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellAirSonWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AperiodicCqiGuardTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiGuardTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiMinMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiMinMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UeThroughputReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UeThroughputReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CapacityClassValueIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacityClassValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CapacitySampleIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacitySampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CapacityReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapacityReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PdschLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PdschLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PuschLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PuschLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RrcLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RrcLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpuLoadThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CpuLoadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrbLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrbLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RrcLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RrcLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CpuLoadWeightIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CpuLoadWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoKpiReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoKpiReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoReportEvaluationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoReportEvaluationTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "capacityClassValueIsDefault",
    "capacityClassValue",
    "capacitySampleIntervalIsDefault",
    "capacitySampleInterval",
    "capacityReportIntervalIsDefault",
    "capacityReportInterval",
    "pdschLoadThresholdIsDefault",
    "pdschLoadThreshold",
    "puschLoadThresholdIsDefault",
    "puschLoadThreshold",
    "rrcLoadThresholdIsDefault",
    "rrcLoadThreshold",
    "cpuLoadThresholdIsDefault",
    "cpuLoadThreshold",
    "prbLoadWeightIsDefault",
    "prbLoadWeight",
    "rrcLoadWeightIsDefault",
    "rrcLoadWeight",
    "cpuLoadWeightIsDefault",
    "cpuLoadWeight",
    "hoKpiReportIntervalIsDefault",
    "hoKpiReportInterval",
    "hoReportEvaluationTimerIsDefault",
    "hoReportEvaluationTimer"
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
    @XmlElementRef(name = "CapacityClassValueIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacityClassValueIsDefault;
    @XmlElementRef(name = "CapacityClassValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacityClassValue;
    @XmlElementRef(name = "CapacitySampleIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacitySampleIntervalIsDefault;
    @XmlElementRef(name = "CapacitySampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacitySampleInterval;
    @XmlElementRef(name = "CapacityReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacityReportIntervalIsDefault;
    @XmlElementRef(name = "CapacityReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacityReportInterval;
    @XmlElementRef(name = "PdschLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pdschLoadThresholdIsDefault;
    @XmlElementRef(name = "PdschLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pdschLoadThreshold;
    @XmlElementRef(name = "PuschLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> puschLoadThresholdIsDefault;
    @XmlElementRef(name = "PuschLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> puschLoadThreshold;
    @XmlElementRef(name = "RrcLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rrcLoadThresholdIsDefault;
    @XmlElementRef(name = "RrcLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rrcLoadThreshold;
    @XmlElementRef(name = "CpuLoadThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cpuLoadThresholdIsDefault;
    @XmlElementRef(name = "CpuLoadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpuLoadThreshold;
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
     * Gets the value of the capacityClassValueIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCapacityClassValueIsDefault() {
        return capacityClassValueIsDefault;
    }

    /**
     * Sets the value of the capacityClassValueIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCapacityClassValueIsDefault(JAXBElement<Boolean> value) {
        this.capacityClassValueIsDefault = value;
    }

    /**
     * Gets the value of the capacityClassValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCapacityClassValue() {
        return capacityClassValue;
    }

    /**
     * Sets the value of the capacityClassValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCapacityClassValue(JAXBElement<Integer> value) {
        this.capacityClassValue = value;
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
     * Gets the value of the pdschLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPdschLoadThresholdIsDefault() {
        return pdschLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the pdschLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPdschLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.pdschLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the pdschLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPdschLoadThreshold() {
        return pdschLoadThreshold;
    }

    /**
     * Sets the value of the pdschLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPdschLoadThreshold(JAXBElement<Integer> value) {
        this.pdschLoadThreshold = value;
    }

    /**
     * Gets the value of the puschLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPuschLoadThresholdIsDefault() {
        return puschLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the puschLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPuschLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.puschLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the puschLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPuschLoadThreshold() {
        return puschLoadThreshold;
    }

    /**
     * Sets the value of the puschLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPuschLoadThreshold(JAXBElement<Integer> value) {
        this.puschLoadThreshold = value;
    }

    /**
     * Gets the value of the rrcLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRrcLoadThresholdIsDefault() {
        return rrcLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the rrcLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRrcLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.rrcLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the rrcLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRrcLoadThreshold() {
        return rrcLoadThreshold;
    }

    /**
     * Sets the value of the rrcLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRrcLoadThreshold(JAXBElement<Integer> value) {
        this.rrcLoadThreshold = value;
    }

    /**
     * Gets the value of the cpuLoadThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCpuLoadThresholdIsDefault() {
        return cpuLoadThresholdIsDefault;
    }

    /**
     * Sets the value of the cpuLoadThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCpuLoadThresholdIsDefault(JAXBElement<Boolean> value) {
        this.cpuLoadThresholdIsDefault = value;
    }

    /**
     * Gets the value of the cpuLoadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpuLoadThreshold() {
        return cpuLoadThreshold;
    }

    /**
     * Sets the value of the cpuLoadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpuLoadThreshold(JAXBElement<Integer> value) {
        this.cpuLoadThreshold = value;
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

}
