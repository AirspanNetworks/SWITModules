
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolteConfigurationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolteConfigurationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivateVolteDataInactivityIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ActivateVolteDataInactivity" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="AdditionalBitsForFixedAllocationsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalBitsForFixedAllocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HeaderOverheadIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeaderOverhead" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DlaAckStepDownFactorIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DlaAckStepDownFactor" type="{http://Airspan.Netspan.WebServices}DlAck" minOccurs="0"/>
 *         &lt;element name="MaximumVolteCallsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MaximumVolteCalls" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RohcCompressionRatioIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RohcCompressionRatio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolteConfigurationWs", propOrder = {
    "activateVolteDataInactivityIsDefault",
    "activateVolteDataInactivity",
    "additionalBitsForFixedAllocationsIsDefault",
    "additionalBitsForFixedAllocations",
    "headerOverheadIsDefault",
    "headerOverhead",
    "dlaAckStepDownFactorIsDefault",
    "dlaAckStepDownFactor",
    "maximumVolteCallsIsDefault",
    "maximumVolteCalls",
    "rohcCompressionRatioIsDefault",
    "rohcCompressionRatio"
})
public class VolteConfigurationWs {

    @XmlElementRef(name = "ActivateVolteDataInactivityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> activateVolteDataInactivityIsDefault;
    @XmlElementRef(name = "ActivateVolteDataInactivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> activateVolteDataInactivity;
    @XmlElementRef(name = "AdditionalBitsForFixedAllocationsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> additionalBitsForFixedAllocationsIsDefault;
    @XmlElementRef(name = "AdditionalBitsForFixedAllocations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalBitsForFixedAllocations;
    @XmlElementRef(name = "HeaderOverheadIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> headerOverheadIsDefault;
    @XmlElementRef(name = "HeaderOverhead", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> headerOverhead;
    @XmlElementRef(name = "DlaAckStepDownFactorIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlaAckStepDownFactorIsDefault;
    @XmlElementRef(name = "DlaAckStepDownFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dlaAckStepDownFactor;
    @XmlElement(name = "MaximumVolteCallsIsDefault", required = true, type = Boolean.class, nillable = true)
    protected Boolean maximumVolteCallsIsDefault;
    @XmlElementRef(name = "MaximumVolteCalls", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maximumVolteCalls;
    @XmlElementRef(name = "RohcCompressionRatioIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rohcCompressionRatioIsDefault;
    @XmlElementRef(name = "RohcCompressionRatio", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rohcCompressionRatio;

    /**
     * Gets the value of the activateVolteDataInactivityIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getActivateVolteDataInactivityIsDefault() {
        return activateVolteDataInactivityIsDefault;
    }

    /**
     * Sets the value of the activateVolteDataInactivityIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setActivateVolteDataInactivityIsDefault(JAXBElement<Boolean> value) {
        this.activateVolteDataInactivityIsDefault = value;
    }

    /**
     * Gets the value of the activateVolteDataInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getActivateVolteDataInactivity() {
        return activateVolteDataInactivity;
    }

    /**
     * Sets the value of the activateVolteDataInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setActivateVolteDataInactivity(JAXBElement<EnabledDisabledValues> value) {
        this.activateVolteDataInactivity = value;
    }

    /**
     * Gets the value of the additionalBitsForFixedAllocationsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAdditionalBitsForFixedAllocationsIsDefault() {
        return additionalBitsForFixedAllocationsIsDefault;
    }

    /**
     * Sets the value of the additionalBitsForFixedAllocationsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAdditionalBitsForFixedAllocationsIsDefault(JAXBElement<Boolean> value) {
        this.additionalBitsForFixedAllocationsIsDefault = value;
    }

    /**
     * Gets the value of the additionalBitsForFixedAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdditionalBitsForFixedAllocations() {
        return additionalBitsForFixedAllocations;
    }

    /**
     * Sets the value of the additionalBitsForFixedAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdditionalBitsForFixedAllocations(JAXBElement<Integer> value) {
        this.additionalBitsForFixedAllocations = value;
    }

    /**
     * Gets the value of the headerOverheadIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHeaderOverheadIsDefault() {
        return headerOverheadIsDefault;
    }

    /**
     * Sets the value of the headerOverheadIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHeaderOverheadIsDefault(JAXBElement<Boolean> value) {
        this.headerOverheadIsDefault = value;
    }

    /**
     * Gets the value of the headerOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHeaderOverhead() {
        return headerOverhead;
    }

    /**
     * Sets the value of the headerOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHeaderOverhead(JAXBElement<Integer> value) {
        this.headerOverhead = value;
    }

    /**
     * Gets the value of the dlaAckStepDownFactorIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlaAckStepDownFactorIsDefault() {
        return dlaAckStepDownFactorIsDefault;
    }

    /**
     * Sets the value of the dlaAckStepDownFactorIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlaAckStepDownFactorIsDefault(JAXBElement<Boolean> value) {
        this.dlaAckStepDownFactorIsDefault = value;
    }

    /**
     * Gets the value of the dlaAckStepDownFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDlaAckStepDownFactor() {
        return dlaAckStepDownFactor;
    }

    /**
     * Sets the value of the dlaAckStepDownFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDlaAckStepDownFactor(JAXBElement<String> value) {
        this.dlaAckStepDownFactor = value;
    }

    /**
     * Gets the value of the maximumVolteCallsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumVolteCallsIsDefault() {
        return maximumVolteCallsIsDefault;
    }

    /**
     * Sets the value of the maximumVolteCallsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumVolteCallsIsDefault(Boolean value) {
        this.maximumVolteCallsIsDefault = value;
    }

    /**
     * Gets the value of the maximumVolteCalls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaximumVolteCalls() {
        return maximumVolteCalls;
    }

    /**
     * Sets the value of the maximumVolteCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaximumVolteCalls(JAXBElement<Integer> value) {
        this.maximumVolteCalls = value;
    }

    /**
     * Gets the value of the rohcCompressionRatioIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRohcCompressionRatioIsDefault() {
        return rohcCompressionRatioIsDefault;
    }

    /**
     * Sets the value of the rohcCompressionRatioIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRohcCompressionRatioIsDefault(JAXBElement<Boolean> value) {
        this.rohcCompressionRatioIsDefault = value;
    }

    /**
     * Gets the value of the rohcCompressionRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRohcCompressionRatio() {
        return rohcCompressionRatio;
    }

    /**
     * Sets the value of the rohcCompressionRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRohcCompressionRatio(JAXBElement<Integer> value) {
        this.rohcCompressionRatio = value;
    }

}
