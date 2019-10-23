
package Netspan.NBI_17_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficManagementWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficManagementWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxAllowedMeasIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxAllowedMeas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="S1LowThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1LowThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="S1MediumThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1MediumThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="S1HighThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1HighThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HwLowThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HwLowThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HwMediumThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HwMediumThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="HwHighThresholdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HwHighThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="S1BandwidthIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="S1Bandwidth" type="{http://Airspan.Netspan.WebServices}S1BandwidthTypes" minOccurs="0"/&gt;
 *         &lt;element name="CapacityClassValueIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CapacityClassValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci5IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci6IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci7IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci8IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci9IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CbrQci9" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeasSampleIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MeasSampleInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ResourceStatusReportingInitiationTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResourceStatusReportingInitiationTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficManagementWs", propOrder = {
    "maxAllowedMeasIsDefault",
    "maxAllowedMeas",
    "s1LowThresholdIsDefault",
    "s1LowThreshold",
    "s1MediumThresholdIsDefault",
    "s1MediumThreshold",
    "s1HighThresholdIsDefault",
    "s1HighThreshold",
    "hwLowThresholdIsDefault",
    "hwLowThreshold",
    "hwMediumThresholdIsDefault",
    "hwMediumThreshold",
    "hwHighThresholdIsDefault",
    "hwHighThreshold",
    "s1BandwidthIsDefault",
    "s1Bandwidth",
    "capacityClassValueIsDefault",
    "capacityClassValue",
    "cbrQci5IsDefault",
    "cbrQci5",
    "cbrQci6IsDefault",
    "cbrQci6",
    "cbrQci7IsDefault",
    "cbrQci7",
    "cbrQci8IsDefault",
    "cbrQci8",
    "cbrQci9IsDefault",
    "cbrQci9",
    "measSampleIntervalIsDefault",
    "measSampleInterval",
    "resourceStatusReportingInitiationTimerIsDefault",
    "resourceStatusReportingInitiationTimer"
})
public class TrafficManagementWs {

    @XmlElementRef(name = "MaxAllowedMeasIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxAllowedMeasIsDefault;
    @XmlElementRef(name = "MaxAllowedMeas", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxAllowedMeas;
    @XmlElementRef(name = "S1LowThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1LowThresholdIsDefault;
    @XmlElementRef(name = "S1LowThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1LowThreshold;
    @XmlElementRef(name = "S1MediumThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1MediumThresholdIsDefault;
    @XmlElementRef(name = "S1MediumThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1MediumThreshold;
    @XmlElementRef(name = "S1HighThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1HighThresholdIsDefault;
    @XmlElementRef(name = "S1HighThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> s1HighThreshold;
    @XmlElementRef(name = "HwLowThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hwLowThresholdIsDefault;
    @XmlElementRef(name = "HwLowThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hwLowThreshold;
    @XmlElementRef(name = "HwMediumThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hwMediumThresholdIsDefault;
    @XmlElementRef(name = "HwMediumThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hwMediumThreshold;
    @XmlElementRef(name = "HwHighThresholdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hwHighThresholdIsDefault;
    @XmlElementRef(name = "HwHighThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hwHighThreshold;
    @XmlElementRef(name = "S1BandwidthIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> s1BandwidthIsDefault;
    @XmlElementRef(name = "S1Bandwidth", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> s1Bandwidth;
    @XmlElementRef(name = "CapacityClassValueIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> capacityClassValueIsDefault;
    @XmlElementRef(name = "CapacityClassValue", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> capacityClassValue;
    @XmlElementRef(name = "CbrQci5IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrQci5IsDefault;
    @XmlElementRef(name = "CbrQci5", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrQci5;
    @XmlElementRef(name = "CbrQci6IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrQci6IsDefault;
    @XmlElementRef(name = "CbrQci6", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrQci6;
    @XmlElementRef(name = "CbrQci7IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrQci7IsDefault;
    @XmlElementRef(name = "CbrQci7", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrQci7;
    @XmlElementRef(name = "CbrQci8IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrQci8IsDefault;
    @XmlElementRef(name = "CbrQci8", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrQci8;
    @XmlElementRef(name = "CbrQci9IsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> cbrQci9IsDefault;
    @XmlElementRef(name = "CbrQci9", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbrQci9;
    @XmlElementRef(name = "MeasSampleIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> measSampleIntervalIsDefault;
    @XmlElementRef(name = "MeasSampleInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> measSampleInterval;
    @XmlElementRef(name = "ResourceStatusReportingInitiationTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> resourceStatusReportingInitiationTimerIsDefault;
    @XmlElementRef(name = "ResourceStatusReportingInitiationTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> resourceStatusReportingInitiationTimer;

    /**
     * Gets the value of the maxAllowedMeasIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxAllowedMeasIsDefault() {
        return maxAllowedMeasIsDefault;
    }

    /**
     * Sets the value of the maxAllowedMeasIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxAllowedMeasIsDefault(JAXBElement<Boolean> value) {
        this.maxAllowedMeasIsDefault = value;
    }

    /**
     * Gets the value of the maxAllowedMeas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxAllowedMeas() {
        return maxAllowedMeas;
    }

    /**
     * Sets the value of the maxAllowedMeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxAllowedMeas(JAXBElement<Integer> value) {
        this.maxAllowedMeas = value;
    }

    /**
     * Gets the value of the s1LowThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1LowThresholdIsDefault() {
        return s1LowThresholdIsDefault;
    }

    /**
     * Sets the value of the s1LowThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1LowThresholdIsDefault(JAXBElement<Boolean> value) {
        this.s1LowThresholdIsDefault = value;
    }

    /**
     * Gets the value of the s1LowThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1LowThreshold() {
        return s1LowThreshold;
    }

    /**
     * Sets the value of the s1LowThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1LowThreshold(JAXBElement<Integer> value) {
        this.s1LowThreshold = value;
    }

    /**
     * Gets the value of the s1MediumThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1MediumThresholdIsDefault() {
        return s1MediumThresholdIsDefault;
    }

    /**
     * Sets the value of the s1MediumThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1MediumThresholdIsDefault(JAXBElement<Boolean> value) {
        this.s1MediumThresholdIsDefault = value;
    }

    /**
     * Gets the value of the s1MediumThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1MediumThreshold() {
        return s1MediumThreshold;
    }

    /**
     * Sets the value of the s1MediumThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1MediumThreshold(JAXBElement<Integer> value) {
        this.s1MediumThreshold = value;
    }

    /**
     * Gets the value of the s1HighThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1HighThresholdIsDefault() {
        return s1HighThresholdIsDefault;
    }

    /**
     * Sets the value of the s1HighThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1HighThresholdIsDefault(JAXBElement<Boolean> value) {
        this.s1HighThresholdIsDefault = value;
    }

    /**
     * Gets the value of the s1HighThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getS1HighThreshold() {
        return s1HighThreshold;
    }

    /**
     * Sets the value of the s1HighThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setS1HighThreshold(JAXBElement<Integer> value) {
        this.s1HighThreshold = value;
    }

    /**
     * Gets the value of the hwLowThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHwLowThresholdIsDefault() {
        return hwLowThresholdIsDefault;
    }

    /**
     * Sets the value of the hwLowThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHwLowThresholdIsDefault(JAXBElement<Boolean> value) {
        this.hwLowThresholdIsDefault = value;
    }

    /**
     * Gets the value of the hwLowThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHwLowThreshold() {
        return hwLowThreshold;
    }

    /**
     * Sets the value of the hwLowThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHwLowThreshold(JAXBElement<Integer> value) {
        this.hwLowThreshold = value;
    }

    /**
     * Gets the value of the hwMediumThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHwMediumThresholdIsDefault() {
        return hwMediumThresholdIsDefault;
    }

    /**
     * Sets the value of the hwMediumThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHwMediumThresholdIsDefault(JAXBElement<Boolean> value) {
        this.hwMediumThresholdIsDefault = value;
    }

    /**
     * Gets the value of the hwMediumThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHwMediumThreshold() {
        return hwMediumThreshold;
    }

    /**
     * Sets the value of the hwMediumThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHwMediumThreshold(JAXBElement<Integer> value) {
        this.hwMediumThreshold = value;
    }

    /**
     * Gets the value of the hwHighThresholdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHwHighThresholdIsDefault() {
        return hwHighThresholdIsDefault;
    }

    /**
     * Sets the value of the hwHighThresholdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHwHighThresholdIsDefault(JAXBElement<Boolean> value) {
        this.hwHighThresholdIsDefault = value;
    }

    /**
     * Gets the value of the hwHighThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHwHighThreshold() {
        return hwHighThreshold;
    }

    /**
     * Sets the value of the hwHighThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHwHighThreshold(JAXBElement<Integer> value) {
        this.hwHighThreshold = value;
    }

    /**
     * Gets the value of the s1BandwidthIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getS1BandwidthIsDefault() {
        return s1BandwidthIsDefault;
    }

    /**
     * Sets the value of the s1BandwidthIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setS1BandwidthIsDefault(JAXBElement<Boolean> value) {
        this.s1BandwidthIsDefault = value;
    }

    /**
     * Gets the value of the s1Bandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS1Bandwidth() {
        return s1Bandwidth;
    }

    /**
     * Sets the value of the s1Bandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS1Bandwidth(JAXBElement<String> value) {
        this.s1Bandwidth = value;
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
     * Gets the value of the cbrQci5IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrQci5IsDefault() {
        return cbrQci5IsDefault;
    }

    /**
     * Sets the value of the cbrQci5IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrQci5IsDefault(JAXBElement<Boolean> value) {
        this.cbrQci5IsDefault = value;
    }

    /**
     * Gets the value of the cbrQci5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrQci5() {
        return cbrQci5;
    }

    /**
     * Sets the value of the cbrQci5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrQci5(JAXBElement<Integer> value) {
        this.cbrQci5 = value;
    }

    /**
     * Gets the value of the cbrQci6IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrQci6IsDefault() {
        return cbrQci6IsDefault;
    }

    /**
     * Sets the value of the cbrQci6IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrQci6IsDefault(JAXBElement<Boolean> value) {
        this.cbrQci6IsDefault = value;
    }

    /**
     * Gets the value of the cbrQci6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrQci6() {
        return cbrQci6;
    }

    /**
     * Sets the value of the cbrQci6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrQci6(JAXBElement<Integer> value) {
        this.cbrQci6 = value;
    }

    /**
     * Gets the value of the cbrQci7IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrQci7IsDefault() {
        return cbrQci7IsDefault;
    }

    /**
     * Sets the value of the cbrQci7IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrQci7IsDefault(JAXBElement<Boolean> value) {
        this.cbrQci7IsDefault = value;
    }

    /**
     * Gets the value of the cbrQci7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrQci7() {
        return cbrQci7;
    }

    /**
     * Sets the value of the cbrQci7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrQci7(JAXBElement<Integer> value) {
        this.cbrQci7 = value;
    }

    /**
     * Gets the value of the cbrQci8IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrQci8IsDefault() {
        return cbrQci8IsDefault;
    }

    /**
     * Sets the value of the cbrQci8IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrQci8IsDefault(JAXBElement<Boolean> value) {
        this.cbrQci8IsDefault = value;
    }

    /**
     * Gets the value of the cbrQci8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrQci8() {
        return cbrQci8;
    }

    /**
     * Sets the value of the cbrQci8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrQci8(JAXBElement<Integer> value) {
        this.cbrQci8 = value;
    }

    /**
     * Gets the value of the cbrQci9IsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCbrQci9IsDefault() {
        return cbrQci9IsDefault;
    }

    /**
     * Sets the value of the cbrQci9IsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCbrQci9IsDefault(JAXBElement<Boolean> value) {
        this.cbrQci9IsDefault = value;
    }

    /**
     * Gets the value of the cbrQci9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbrQci9() {
        return cbrQci9;
    }

    /**
     * Sets the value of the cbrQci9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbrQci9(JAXBElement<Integer> value) {
        this.cbrQci9 = value;
    }

    /**
     * Gets the value of the measSampleIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMeasSampleIntervalIsDefault() {
        return measSampleIntervalIsDefault;
    }

    /**
     * Sets the value of the measSampleIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMeasSampleIntervalIsDefault(JAXBElement<Boolean> value) {
        this.measSampleIntervalIsDefault = value;
    }

    /**
     * Gets the value of the measSampleInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMeasSampleInterval() {
        return measSampleInterval;
    }

    /**
     * Sets the value of the measSampleInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMeasSampleInterval(JAXBElement<Integer> value) {
        this.measSampleInterval = value;
    }

    /**
     * Gets the value of the resourceStatusReportingInitiationTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getResourceStatusReportingInitiationTimerIsDefault() {
        return resourceStatusReportingInitiationTimerIsDefault;
    }

    /**
     * Sets the value of the resourceStatusReportingInitiationTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setResourceStatusReportingInitiationTimerIsDefault(JAXBElement<Boolean> value) {
        this.resourceStatusReportingInitiationTimerIsDefault = value;
    }

    /**
     * Gets the value of the resourceStatusReportingInitiationTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResourceStatusReportingInitiationTimer() {
        return resourceStatusReportingInitiationTimer;
    }

    /**
     * Sets the value of the resourceStatusReportingInitiationTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResourceStatusReportingInitiationTimer(JAXBElement<Integer> value) {
        this.resourceStatusReportingInitiationTimer = value;
    }

}
