
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="DlaForceVolteTdIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DlaForceVolteTd" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="LowUlBlerForVolteIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LowUlBlerForVolte" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="AllowDlDcchDtchIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowDlDcchDtch" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="EnableVolteFixedAllocationsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnableVolteFixedAllocations" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/>
 *         &lt;element name="AdditionalBitsForFixedAllocationsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalBitsForFixedAllocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VolteHeaderOverheadIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VolteHeaderOverhead" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RohcRatioIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RohcRatio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberofVoltePacketsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofVoltePackets" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxVolteUesPerUlTtiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxVolteUesPerUlTti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxVolteUesPerDlTtiIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxVolteUesPerDlTti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "dlaForceVolteTdIsDefault",
    "dlaForceVolteTd",
    "lowUlBlerForVolteIsDefault",
    "lowUlBlerForVolte",
    "allowDlDcchDtchIsDefault",
    "allowDlDcchDtch",
    "enableVolteFixedAllocationsIsDefault",
    "enableVolteFixedAllocations",
    "additionalBitsForFixedAllocationsIsDefault",
    "additionalBitsForFixedAllocations",
    "volteHeaderOverheadIsDefault",
    "volteHeaderOverhead",
    "rohcRatioIsDefault",
    "rohcRatio",
    "numberofVoltePacketsIsDefault",
    "numberofVoltePackets",
    "maxVolteUesPerUlTtiIsDefault",
    "maxVolteUesPerUlTti",
    "maxVolteUesPerDlTtiIsDefault",
    "maxVolteUesPerDlTti"
})
public class VolteConfigurationWs {

    @XmlElementRef(name = "ActivateVolteDataInactivityIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> activateVolteDataInactivityIsDefault;
    @XmlElementRef(name = "ActivateVolteDataInactivity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> activateVolteDataInactivity;
    @XmlElementRef(name = "DlaForceVolteTdIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dlaForceVolteTdIsDefault;
    @XmlElementRef(name = "DlaForceVolteTd", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> dlaForceVolteTd;
    @XmlElementRef(name = "LowUlBlerForVolteIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> lowUlBlerForVolteIsDefault;
    @XmlElementRef(name = "LowUlBlerForVolte", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> lowUlBlerForVolte;
    @XmlElementRef(name = "AllowDlDcchDtchIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowDlDcchDtchIsDefault;
    @XmlElementRef(name = "AllowDlDcchDtch", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> allowDlDcchDtch;
    @XmlElementRef(name = "EnableVolteFixedAllocationsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> enableVolteFixedAllocationsIsDefault;
    @XmlElementRef(name = "EnableVolteFixedAllocations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> enableVolteFixedAllocations;
    @XmlElementRef(name = "AdditionalBitsForFixedAllocationsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> additionalBitsForFixedAllocationsIsDefault;
    @XmlElementRef(name = "AdditionalBitsForFixedAllocations", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> additionalBitsForFixedAllocations;
    @XmlElementRef(name = "VolteHeaderOverheadIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> volteHeaderOverheadIsDefault;
    @XmlElementRef(name = "VolteHeaderOverhead", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> volteHeaderOverhead;
    @XmlElementRef(name = "RohcRatioIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> rohcRatioIsDefault;
    @XmlElementRef(name = "RohcRatio", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rohcRatio;
    @XmlElementRef(name = "NumberofVoltePacketsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> numberofVoltePacketsIsDefault;
    @XmlElementRef(name = "NumberofVoltePackets", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberofVoltePackets;
    @XmlElementRef(name = "MaxVolteUesPerUlTtiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxVolteUesPerUlTtiIsDefault;
    @XmlElementRef(name = "MaxVolteUesPerUlTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxVolteUesPerUlTti;
    @XmlElementRef(name = "MaxVolteUesPerDlTtiIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> maxVolteUesPerDlTtiIsDefault;
    @XmlElementRef(name = "MaxVolteUesPerDlTti", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxVolteUesPerDlTti;

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
     * Gets the value of the dlaForceVolteTdIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDlaForceVolteTdIsDefault() {
        return dlaForceVolteTdIsDefault;
    }

    /**
     * Sets the value of the dlaForceVolteTdIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDlaForceVolteTdIsDefault(JAXBElement<Boolean> value) {
        this.dlaForceVolteTdIsDefault = value;
    }

    /**
     * Gets the value of the dlaForceVolteTd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getDlaForceVolteTd() {
        return dlaForceVolteTd;
    }

    /**
     * Sets the value of the dlaForceVolteTd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setDlaForceVolteTd(JAXBElement<EnabledDisabledValues> value) {
        this.dlaForceVolteTd = value;
    }

    /**
     * Gets the value of the lowUlBlerForVolteIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getLowUlBlerForVolteIsDefault() {
        return lowUlBlerForVolteIsDefault;
    }

    /**
     * Sets the value of the lowUlBlerForVolteIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setLowUlBlerForVolteIsDefault(JAXBElement<Boolean> value) {
        this.lowUlBlerForVolteIsDefault = value;
    }

    /**
     * Gets the value of the lowUlBlerForVolte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getLowUlBlerForVolte() {
        return lowUlBlerForVolte;
    }

    /**
     * Sets the value of the lowUlBlerForVolte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setLowUlBlerForVolte(JAXBElement<EnabledDisabledValues> value) {
        this.lowUlBlerForVolte = value;
    }

    /**
     * Gets the value of the allowDlDcchDtchIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowDlDcchDtchIsDefault() {
        return allowDlDcchDtchIsDefault;
    }

    /**
     * Sets the value of the allowDlDcchDtchIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowDlDcchDtchIsDefault(JAXBElement<Boolean> value) {
        this.allowDlDcchDtchIsDefault = value;
    }

    /**
     * Gets the value of the allowDlDcchDtch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getAllowDlDcchDtch() {
        return allowDlDcchDtch;
    }

    /**
     * Sets the value of the allowDlDcchDtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setAllowDlDcchDtch(JAXBElement<EnabledDisabledValues> value) {
        this.allowDlDcchDtch = value;
    }

    /**
     * Gets the value of the enableVolteFixedAllocationsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnableVolteFixedAllocationsIsDefault() {
        return enableVolteFixedAllocationsIsDefault;
    }

    /**
     * Sets the value of the enableVolteFixedAllocationsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnableVolteFixedAllocationsIsDefault(JAXBElement<Boolean> value) {
        this.enableVolteFixedAllocationsIsDefault = value;
    }

    /**
     * Gets the value of the enableVolteFixedAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getEnableVolteFixedAllocations() {
        return enableVolteFixedAllocations;
    }

    /**
     * Sets the value of the enableVolteFixedAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setEnableVolteFixedAllocations(JAXBElement<EnabledDisabledValues> value) {
        this.enableVolteFixedAllocations = value;
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
     * Gets the value of the volteHeaderOverheadIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVolteHeaderOverheadIsDefault() {
        return volteHeaderOverheadIsDefault;
    }

    /**
     * Sets the value of the volteHeaderOverheadIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVolteHeaderOverheadIsDefault(JAXBElement<Boolean> value) {
        this.volteHeaderOverheadIsDefault = value;
    }

    /**
     * Gets the value of the volteHeaderOverhead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getVolteHeaderOverhead() {
        return volteHeaderOverhead;
    }

    /**
     * Sets the value of the volteHeaderOverhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setVolteHeaderOverhead(JAXBElement<Integer> value) {
        this.volteHeaderOverhead = value;
    }

    /**
     * Gets the value of the rohcRatioIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRohcRatioIsDefault() {
        return rohcRatioIsDefault;
    }

    /**
     * Sets the value of the rohcRatioIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRohcRatioIsDefault(JAXBElement<Boolean> value) {
        this.rohcRatioIsDefault = value;
    }

    /**
     * Gets the value of the rohcRatio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRohcRatio() {
        return rohcRatio;
    }

    /**
     * Sets the value of the rohcRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRohcRatio(JAXBElement<Integer> value) {
        this.rohcRatio = value;
    }

    /**
     * Gets the value of the numberofVoltePacketsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNumberofVoltePacketsIsDefault() {
        return numberofVoltePacketsIsDefault;
    }

    /**
     * Sets the value of the numberofVoltePacketsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNumberofVoltePacketsIsDefault(JAXBElement<Boolean> value) {
        this.numberofVoltePacketsIsDefault = value;
    }

    /**
     * Gets the value of the numberofVoltePackets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberofVoltePackets() {
        return numberofVoltePackets;
    }

    /**
     * Sets the value of the numberofVoltePackets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberofVoltePackets(JAXBElement<Integer> value) {
        this.numberofVoltePackets = value;
    }

    /**
     * Gets the value of the maxVolteUesPerUlTtiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxVolteUesPerUlTtiIsDefault() {
        return maxVolteUesPerUlTtiIsDefault;
    }

    /**
     * Sets the value of the maxVolteUesPerUlTtiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxVolteUesPerUlTtiIsDefault(JAXBElement<Boolean> value) {
        this.maxVolteUesPerUlTtiIsDefault = value;
    }

    /**
     * Gets the value of the maxVolteUesPerUlTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxVolteUesPerUlTti() {
        return maxVolteUesPerUlTti;
    }

    /**
     * Sets the value of the maxVolteUesPerUlTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxVolteUesPerUlTti(JAXBElement<Integer> value) {
        this.maxVolteUesPerUlTti = value;
    }

    /**
     * Gets the value of the maxVolteUesPerDlTtiIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMaxVolteUesPerDlTtiIsDefault() {
        return maxVolteUesPerDlTtiIsDefault;
    }

    /**
     * Sets the value of the maxVolteUesPerDlTtiIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMaxVolteUesPerDlTtiIsDefault(JAXBElement<Boolean> value) {
        this.maxVolteUesPerDlTtiIsDefault = value;
    }

    /**
     * Gets the value of the maxVolteUesPerDlTti property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxVolteUesPerDlTti() {
        return maxVolteUesPerDlTti;
    }

    /**
     * Sets the value of the maxVolteUesPerDlTti property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxVolteUesPerDlTti(JAXBElement<Integer> value) {
        this.maxVolteUesPerDlTti = value;
    }

}
