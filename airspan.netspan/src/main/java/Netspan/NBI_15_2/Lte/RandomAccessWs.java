
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RandomAccessWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RandomAccessWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfRaPreamblesIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberOfRaPreambles" type="{http://Airspan.Netspan.WebServices}RaPreambles" minOccurs="0"/>
 *         &lt;element name="PowerRampingStepIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PowerRampingStep" type="{http://Airspan.Netspan.WebServices}PowerRampStep" minOccurs="0"/>
 *         &lt;element name="PreambleInitialReceivedTargetPowerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreambleInitialReceivedTargetPower" type="{http://Airspan.Netspan.WebServices}PreambleTargetPower" minOccurs="0"/>
 *         &lt;element name="PreambleTransMaxIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreambleTransMax" type="{http://Airspan.Netspan.WebServices}PreambleTrans" minOccurs="0"/>
 *         &lt;element name="RaResponseWindowSizeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RaResponseWindowSize" type="{http://Airspan.Netspan.WebServices}RaResponseWindow" minOccurs="0"/>
 *         &lt;element name="MacContentionResolutionTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MacContentionResolutionTimer" type="{http://Airspan.Netspan.WebServices}MacContention" minOccurs="0"/>
 *         &lt;element name="ZeroCorrelationZoneConfigIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ZeroCorrelationZoneConfig" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrachConfigIndexIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrachConfigIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomAccessWs", propOrder = {
    "numberOfRaPreamblesIsDefault",
    "numberOfRaPreambles",
    "powerRampingStepIsDefault",
    "powerRampingStep",
    "preambleInitialReceivedTargetPowerIsDefault",
    "preambleInitialReceivedTargetPower",
    "preambleTransMaxIsDefault",
    "preambleTransMax",
    "raResponseWindowSizeIsDefault",
    "raResponseWindowSize",
    "macContentionResolutionTimerIsDefault",
    "macContentionResolutionTimer",
    "zeroCorrelationZoneConfigIsDefault",
    "zeroCorrelationZoneConfig",
    "prachConfigIndexIsDefault",
    "prachConfigIndex"
})
public class RandomAccessWs {

    @XmlElementRef(name = "NumberOfRaPreamblesIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberOfRaPreamblesIsDefault;
    @XmlElementRef(name = "NumberOfRaPreambles", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numberOfRaPreambles;
    @XmlElementRef(name = "PowerRampingStepIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> powerRampingStepIsDefault;
    @XmlElementRef(name = "PowerRampingStep", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> powerRampingStep;
    @XmlElementRef(name = "PreambleInitialReceivedTargetPowerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preambleInitialReceivedTargetPowerIsDefault;
    @XmlElementRef(name = "PreambleInitialReceivedTargetPower", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preambleInitialReceivedTargetPower;
    @XmlElementRef(name = "PreambleTransMaxIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preambleTransMaxIsDefault;
    @XmlElementRef(name = "PreambleTransMax", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preambleTransMax;
    @XmlElementRef(name = "RaResponseWindowSizeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> raResponseWindowSizeIsDefault;
    @XmlElementRef(name = "RaResponseWindowSize", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> raResponseWindowSize;
    @XmlElementRef(name = "MacContentionResolutionTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> macContentionResolutionTimerIsDefault;
    @XmlElementRef(name = "MacContentionResolutionTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> macContentionResolutionTimer;
    @XmlElementRef(name = "ZeroCorrelationZoneConfigIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> zeroCorrelationZoneConfigIsDefault;
    @XmlElementRef(name = "ZeroCorrelationZoneConfig", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zeroCorrelationZoneConfig;
    @XmlElementRef(name = "PrachConfigIndexIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> prachConfigIndexIsDefault;
    @XmlElementRef(name = "PrachConfigIndex", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachConfigIndex;

    /**
     * Gets the value of the numberOfRaPreamblesIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberOfRaPreamblesIsDefault() {
        return numberOfRaPreamblesIsDefault;
    }

    /**
     * Sets the value of the numberOfRaPreamblesIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberOfRaPreamblesIsDefault(JAXBElement<Boolean> value) {
        this.numberOfRaPreamblesIsDefault = value;
    }

    /**
     * Gets the value of the numberOfRaPreambles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumberOfRaPreambles() {
        return numberOfRaPreambles;
    }

    /**
     * Sets the value of the numberOfRaPreambles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumberOfRaPreambles(JAXBElement<String> value) {
        this.numberOfRaPreambles = value;
    }

    /**
     * Gets the value of the powerRampingStepIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPowerRampingStepIsDefault() {
        return powerRampingStepIsDefault;
    }

    /**
     * Sets the value of the powerRampingStepIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPowerRampingStepIsDefault(JAXBElement<Boolean> value) {
        this.powerRampingStepIsDefault = value;
    }

    /**
     * Gets the value of the powerRampingStep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPowerRampingStep() {
        return powerRampingStep;
    }

    /**
     * Sets the value of the powerRampingStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPowerRampingStep(JAXBElement<String> value) {
        this.powerRampingStep = value;
    }

    /**
     * Gets the value of the preambleInitialReceivedTargetPowerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreambleInitialReceivedTargetPowerIsDefault() {
        return preambleInitialReceivedTargetPowerIsDefault;
    }

    /**
     * Sets the value of the preambleInitialReceivedTargetPowerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreambleInitialReceivedTargetPowerIsDefault(JAXBElement<Boolean> value) {
        this.preambleInitialReceivedTargetPowerIsDefault = value;
    }

    /**
     * Gets the value of the preambleInitialReceivedTargetPower property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreambleInitialReceivedTargetPower() {
        return preambleInitialReceivedTargetPower;
    }

    /**
     * Sets the value of the preambleInitialReceivedTargetPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreambleInitialReceivedTargetPower(JAXBElement<String> value) {
        this.preambleInitialReceivedTargetPower = value;
    }

    /**
     * Gets the value of the preambleTransMaxIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreambleTransMaxIsDefault() {
        return preambleTransMaxIsDefault;
    }

    /**
     * Sets the value of the preambleTransMaxIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreambleTransMaxIsDefault(JAXBElement<Boolean> value) {
        this.preambleTransMaxIsDefault = value;
    }

    /**
     * Gets the value of the preambleTransMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreambleTransMax() {
        return preambleTransMax;
    }

    /**
     * Sets the value of the preambleTransMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreambleTransMax(JAXBElement<String> value) {
        this.preambleTransMax = value;
    }

    /**
     * Gets the value of the raResponseWindowSizeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRaResponseWindowSizeIsDefault() {
        return raResponseWindowSizeIsDefault;
    }

    /**
     * Sets the value of the raResponseWindowSizeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRaResponseWindowSizeIsDefault(JAXBElement<Boolean> value) {
        this.raResponseWindowSizeIsDefault = value;
    }

    /**
     * Gets the value of the raResponseWindowSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaResponseWindowSize() {
        return raResponseWindowSize;
    }

    /**
     * Sets the value of the raResponseWindowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaResponseWindowSize(JAXBElement<String> value) {
        this.raResponseWindowSize = value;
    }

    /**
     * Gets the value of the macContentionResolutionTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMacContentionResolutionTimerIsDefault() {
        return macContentionResolutionTimerIsDefault;
    }

    /**
     * Sets the value of the macContentionResolutionTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMacContentionResolutionTimerIsDefault(JAXBElement<Boolean> value) {
        this.macContentionResolutionTimerIsDefault = value;
    }

    /**
     * Gets the value of the macContentionResolutionTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMacContentionResolutionTimer() {
        return macContentionResolutionTimer;
    }

    /**
     * Sets the value of the macContentionResolutionTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMacContentionResolutionTimer(JAXBElement<String> value) {
        this.macContentionResolutionTimer = value;
    }

    /**
     * Gets the value of the zeroCorrelationZoneConfigIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getZeroCorrelationZoneConfigIsDefault() {
        return zeroCorrelationZoneConfigIsDefault;
    }

    /**
     * Sets the value of the zeroCorrelationZoneConfigIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setZeroCorrelationZoneConfigIsDefault(JAXBElement<Boolean> value) {
        this.zeroCorrelationZoneConfigIsDefault = value;
    }

    /**
     * Gets the value of the zeroCorrelationZoneConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZeroCorrelationZoneConfig() {
        return zeroCorrelationZoneConfig;
    }

    /**
     * Sets the value of the zeroCorrelationZoneConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZeroCorrelationZoneConfig(JAXBElement<Integer> value) {
        this.zeroCorrelationZoneConfig = value;
    }

    /**
     * Gets the value of the prachConfigIndexIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPrachConfigIndexIsDefault() {
        return prachConfigIndexIsDefault;
    }

    /**
     * Sets the value of the prachConfigIndexIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPrachConfigIndexIsDefault(JAXBElement<Boolean> value) {
        this.prachConfigIndexIsDefault = value;
    }

    /**
     * Gets the value of the prachConfigIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachConfigIndex() {
        return prachConfigIndex;
    }

    /**
     * Sets the value of the prachConfigIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachConfigIndex(JAXBElement<Integer> value) {
        this.prachConfigIndex = value;
    }

}
