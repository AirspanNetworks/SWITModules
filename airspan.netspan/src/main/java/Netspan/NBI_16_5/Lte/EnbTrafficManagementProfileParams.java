
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbTrafficManagementProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbTrafficManagementProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadSheddingMode" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/&gt;
 *         &lt;element name="MonitorInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StepDown" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StepUp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinDataInactivityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxDataInactivityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeOverloadThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UeOverloadHysteresis" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DataInactivityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Qci1And2InactivityTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbTrafficManagementProfileParams", propOrder = {
    "loadSheddingMode",
    "monitorInterval",
    "stepDown",
    "stepUp",
    "minDataInactivityTimer",
    "maxDataInactivityTimer",
    "ueOverloadThreshold",
    "ueOverloadHysteresis",
    "dataInactivityTimer",
    "qci1And2InactivityTimer"
})
@XmlSeeAlso({
    TrafficManagementProfile.class
})
public class EnbTrafficManagementProfileParams {

    @XmlElementRef(name = "LoadSheddingMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> loadSheddingMode;
    @XmlElementRef(name = "MonitorInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> monitorInterval;
    @XmlElementRef(name = "StepDown", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stepDown;
    @XmlElementRef(name = "StepUp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> stepUp;
    @XmlElementRef(name = "MinDataInactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minDataInactivityTimer;
    @XmlElementRef(name = "MaxDataInactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxDataInactivityTimer;
    @XmlElementRef(name = "UeOverloadThreshold", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueOverloadThreshold;
    @XmlElementRef(name = "UeOverloadHysteresis", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueOverloadHysteresis;
    @XmlElementRef(name = "DataInactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> dataInactivityTimer;
    @XmlElementRef(name = "Qci1And2InactivityTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> qci1And2InactivityTimer;

    /**
     * Gets the value of the loadSheddingMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getLoadSheddingMode() {
        return loadSheddingMode;
    }

    /**
     * Sets the value of the loadSheddingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setLoadSheddingMode(JAXBElement<EnabledDisabledStates> value) {
        this.loadSheddingMode = value;
    }

    /**
     * Gets the value of the monitorInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonitorInterval() {
        return monitorInterval;
    }

    /**
     * Sets the value of the monitorInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonitorInterval(JAXBElement<Integer> value) {
        this.monitorInterval = value;
    }

    /**
     * Gets the value of the stepDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStepDown() {
        return stepDown;
    }

    /**
     * Sets the value of the stepDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStepDown(JAXBElement<Integer> value) {
        this.stepDown = value;
    }

    /**
     * Gets the value of the stepUp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStepUp() {
        return stepUp;
    }

    /**
     * Sets the value of the stepUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStepUp(JAXBElement<Integer> value) {
        this.stepUp = value;
    }

    /**
     * Gets the value of the minDataInactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinDataInactivityTimer() {
        return minDataInactivityTimer;
    }

    /**
     * Sets the value of the minDataInactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinDataInactivityTimer(JAXBElement<Integer> value) {
        this.minDataInactivityTimer = value;
    }

    /**
     * Gets the value of the maxDataInactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxDataInactivityTimer() {
        return maxDataInactivityTimer;
    }

    /**
     * Sets the value of the maxDataInactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxDataInactivityTimer(JAXBElement<Integer> value) {
        this.maxDataInactivityTimer = value;
    }

    /**
     * Gets the value of the ueOverloadThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeOverloadThreshold() {
        return ueOverloadThreshold;
    }

    /**
     * Sets the value of the ueOverloadThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeOverloadThreshold(JAXBElement<Integer> value) {
        this.ueOverloadThreshold = value;
    }

    /**
     * Gets the value of the ueOverloadHysteresis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeOverloadHysteresis() {
        return ueOverloadHysteresis;
    }

    /**
     * Sets the value of the ueOverloadHysteresis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeOverloadHysteresis(JAXBElement<Integer> value) {
        this.ueOverloadHysteresis = value;
    }

    /**
     * Gets the value of the dataInactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDataInactivityTimer() {
        return dataInactivityTimer;
    }

    /**
     * Sets the value of the dataInactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDataInactivityTimer(JAXBElement<Integer> value) {
        this.dataInactivityTimer = value;
    }

    /**
     * Gets the value of the qci1And2InactivityTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getQci1And2InactivityTimer() {
        return qci1And2InactivityTimer;
    }

    /**
     * Sets the value of the qci1And2InactivityTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setQci1And2InactivityTimer(JAXBElement<Integer> value) {
        this.qci1And2InactivityTimer = value;
    }

}
