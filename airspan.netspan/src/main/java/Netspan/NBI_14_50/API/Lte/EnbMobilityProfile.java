
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.CategoriesLte;
import Netspan.API.Enums.EnabledStates;
import Netspan.API.Lte.MobilityConnectedModeStopGaps;
import Netspan.API.Lte.MobilityConnectedModeTriggerGaps;


/**
 * <p>Java class for EnbMobilityProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMobilityProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareCategory" type="{http://Airspan.Netspan.WebServices}CategoriesLte" minOccurs="0"/>
 *         &lt;element name="IdleModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeIntraFreq" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterFreq" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFreqReselectionPriorityList" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterFreqReselectionPriorityListContainer" minOccurs="0"/>
 *         &lt;element name="ConnectedModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/>
 *         &lt;element name="UseConnectedModeIntraPropertiesForInter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectedModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/>
 *         &lt;element name="IsQosBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ConnectedModeQos" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeQosFreq" minOccurs="0"/>
 *         &lt;element name="IsThresholdBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ConnectedModeThresholdTriggerGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeTriggerGaps" minOccurs="0"/>
 *         &lt;element name="ConnectedModeThresholdStopGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeStopGaps" minOccurs="0"/>
 *         &lt;element name="ConnectedModeHandover" type="{http://Airspan.Netspan.WebServices}HandoverMobilityConnectedModeEarfcnListContainer" minOccurs="0"/>
 *         &lt;element name="IsInterRatUtranCoverageBasedRedirectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatUtranCoverageBasedRedirection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranCoverageRedirection" minOccurs="0"/>
 *         &lt;element name="IsInterRatUtranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatUtranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranReselection" minOccurs="0"/>
 *         &lt;element name="IsInterRatGeranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatGeranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatGeranReselection" minOccurs="0"/>
 *         &lt;element name="CsfbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CsfbUtranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="FwdHoEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbMobilityProfile", propOrder = {
    "name",
    "hardwareCategory",
    "idleModeIntraFrequency",
    "idleModeInterFrequency",
    "idleModeInterFreqReselectionPriorityList",
    "connectedModeIntraFrequency",
    "useConnectedModeIntraPropertiesForInter",
    "connectedModeInterFrequency",
    "isQosBasedMeasurementEnabled",
    "connectedModeQos",
    "isThresholdBasedMeasurementEnabled",
    "connectedModeThresholdTriggerGaps",
    "connectedModeThresholdStopGaps",
    "connectedModeHandover",
    "isInterRatUtranCoverageBasedRedirectionModeEnabled",
    "interRatUtranCoverageBasedRedirection",
    "isInterRatUtranReselectionModeEnabled",
    "interRatUtranReselection",
    "isInterRatGeranReselectionModeEnabled",
    "interRatGeranReselection",
    "csfbEnabled",
    "csfbUtranEnabled",
    "csfbCdma2KEnabled",
    "fwdHoEnabled"
})
public class EnbMobilityProfile {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "HardwareCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoriesLte> hardwareCategory;
    @XmlElement(name = "IdleModeIntraFrequency")
    protected MobilityIdleModeIntraFreq idleModeIntraFrequency;
    @XmlElement(name = "IdleModeInterFrequency")
    protected MobilityIdleModeInterFreq idleModeInterFrequency;
    @XmlElement(name = "IdleModeInterFreqReselectionPriorityList")
    protected MobilityIdleModeInterFreqReselectionPriorityListContainer idleModeInterFreqReselectionPriorityList;
    @XmlElement(name = "ConnectedModeIntraFrequency")
    protected MobilityConnectedModeFreq connectedModeIntraFrequency;
    @XmlElementRef(name = "UseConnectedModeIntraPropertiesForInter", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> useConnectedModeIntraPropertiesForInter;
    @XmlElement(name = "ConnectedModeInterFrequency")
    protected MobilityConnectedModeFreq connectedModeInterFrequency;
    @XmlElementRef(name = "IsQosBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosBasedMeasurementEnabled;
    @XmlElement(name = "ConnectedModeQos")
    protected MobilityConnectedModeQosFreq connectedModeQos;
    @XmlElementRef(name = "IsThresholdBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isThresholdBasedMeasurementEnabled;
    @XmlElement(name = "ConnectedModeThresholdTriggerGaps")
    protected MobilityConnectedModeTriggerGaps connectedModeThresholdTriggerGaps;
    @XmlElement(name = "ConnectedModeThresholdStopGaps")
    protected MobilityConnectedModeStopGaps connectedModeThresholdStopGaps;
    @XmlElement(name = "ConnectedModeHandover")
    protected HandoverMobilityConnectedModeEarfcnListContainer connectedModeHandover;
    @XmlElementRef(name = "IsInterRatUtranCoverageBasedRedirectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatUtranCoverageBasedRedirectionModeEnabled;
    @XmlElement(name = "InterRatUtranCoverageBasedRedirection")
    protected MobilityInterRatUtranCoverageRedirection interRatUtranCoverageBasedRedirection;
    @XmlElementRef(name = "IsInterRatUtranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatUtranReselectionModeEnabled;
    @XmlElement(name = "InterRatUtranReselection")
    protected MobilityInterRatUtranReselection interRatUtranReselection;
    @XmlElementRef(name = "IsInterRatGeranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatGeranReselectionModeEnabled;
    @XmlElement(name = "InterRatGeranReselection")
    protected MobilityInterRatGeranReselection interRatGeranReselection;
    @XmlElementRef(name = "CsfbEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbEnabled;
    @XmlElementRef(name = "CsfbUtranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbUtranEnabled;
    @XmlElementRef(name = "CsfbCdma2kEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbCdma2KEnabled;
    @XmlElementRef(name = "FwdHoEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> fwdHoEnabled;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the hardwareCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public JAXBElement<CategoriesLte> getHardwareCategory() {
        return hardwareCategory;
    }

    /**
     * Sets the value of the hardwareCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoriesLte }{@code >}
     *     
     */
    public void setHardwareCategory(JAXBElement<CategoriesLte> value) {
        this.hardwareCategory = value;
    }

    /**
     * Gets the value of the idleModeIntraFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeIntraFreq }
     *     
     */
    public MobilityIdleModeIntraFreq getIdleModeIntraFrequency() {
        return idleModeIntraFrequency;
    }

    /**
     * Sets the value of the idleModeIntraFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeIntraFreq }
     *     
     */
    public void setIdleModeIntraFrequency(MobilityIdleModeIntraFreq value) {
        this.idleModeIntraFrequency = value;
    }

    /**
     * Gets the value of the idleModeInterFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeInterFreq }
     *     
     */
    public MobilityIdleModeInterFreq getIdleModeInterFrequency() {
        return idleModeInterFrequency;
    }

    /**
     * Sets the value of the idleModeInterFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeInterFreq }
     *     
     */
    public void setIdleModeInterFrequency(MobilityIdleModeInterFreq value) {
        this.idleModeInterFrequency = value;
    }

    /**
     * Gets the value of the idleModeInterFreqReselectionPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeInterFreqReselectionPriorityListContainer }
     *     
     */
    public MobilityIdleModeInterFreqReselectionPriorityListContainer getIdleModeInterFreqReselectionPriorityList() {
        return idleModeInterFreqReselectionPriorityList;
    }

    /**
     * Sets the value of the idleModeInterFreqReselectionPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeInterFreqReselectionPriorityListContainer }
     *     
     */
    public void setIdleModeInterFreqReselectionPriorityList(MobilityIdleModeInterFreqReselectionPriorityListContainer value) {
        this.idleModeInterFreqReselectionPriorityList = value;
    }

    /**
     * Gets the value of the connectedModeIntraFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public MobilityConnectedModeFreq getConnectedModeIntraFrequency() {
        return connectedModeIntraFrequency;
    }

    /**
     * Sets the value of the connectedModeIntraFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public void setConnectedModeIntraFrequency(MobilityConnectedModeFreq value) {
        this.connectedModeIntraFrequency = value;
    }

    /**
     * Gets the value of the useConnectedModeIntraPropertiesForInter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUseConnectedModeIntraPropertiesForInter() {
        return useConnectedModeIntraPropertiesForInter;
    }

    /**
     * Sets the value of the useConnectedModeIntraPropertiesForInter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUseConnectedModeIntraPropertiesForInter(JAXBElement<Boolean> value) {
        this.useConnectedModeIntraPropertiesForInter = value;
    }

    /**
     * Gets the value of the connectedModeInterFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public MobilityConnectedModeFreq getConnectedModeInterFrequency() {
        return connectedModeInterFrequency;
    }

    /**
     * Sets the value of the connectedModeInterFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeFreq }
     *     
     */
    public void setConnectedModeInterFrequency(MobilityConnectedModeFreq value) {
        this.connectedModeInterFrequency = value;
    }

    /**
     * Gets the value of the isQosBasedMeasurementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsQosBasedMeasurementEnabled() {
        return isQosBasedMeasurementEnabled;
    }

    /**
     * Sets the value of the isQosBasedMeasurementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsQosBasedMeasurementEnabled(JAXBElement<EnabledStates> value) {
        this.isQosBasedMeasurementEnabled = value;
    }

    /**
     * Gets the value of the connectedModeQos property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeQosFreq }
     *     
     */
    public MobilityConnectedModeQosFreq getConnectedModeQos() {
        return connectedModeQos;
    }

    /**
     * Sets the value of the connectedModeQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeQosFreq }
     *     
     */
    public void setConnectedModeQos(MobilityConnectedModeQosFreq value) {
        this.connectedModeQos = value;
    }

    /**
     * Gets the value of the isThresholdBasedMeasurementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsThresholdBasedMeasurementEnabled() {
        return isThresholdBasedMeasurementEnabled;
    }

    /**
     * Sets the value of the isThresholdBasedMeasurementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsThresholdBasedMeasurementEnabled(JAXBElement<EnabledStates> value) {
        this.isThresholdBasedMeasurementEnabled = value;
    }

    /**
     * Gets the value of the connectedModeThresholdTriggerGaps property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeTriggerGaps }
     *     
     */
    public MobilityConnectedModeTriggerGaps getConnectedModeThresholdTriggerGaps() {
        return connectedModeThresholdTriggerGaps;
    }

    /**
     * Sets the value of the connectedModeThresholdTriggerGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeTriggerGaps }
     *     
     */
    public void setConnectedModeThresholdTriggerGaps(MobilityConnectedModeTriggerGaps value) {
        this.connectedModeThresholdTriggerGaps = value;
    }

    /**
     * Gets the value of the connectedModeThresholdStopGaps property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeStopGaps }
     *     
     */
    public MobilityConnectedModeStopGaps getConnectedModeThresholdStopGaps() {
        return connectedModeThresholdStopGaps;
    }

    /**
     * Sets the value of the connectedModeThresholdStopGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeStopGaps }
     *     
     */
    public void setConnectedModeThresholdStopGaps(MobilityConnectedModeStopGaps value) {
        this.connectedModeThresholdStopGaps = value;
    }

    /**
     * Gets the value of the connectedModeHandover property.
     * 
     * @return
     *     possible object is
     *     {@link HandoverMobilityConnectedModeEarfcnListContainer }
     *     
     */
    public HandoverMobilityConnectedModeEarfcnListContainer getConnectedModeHandover() {
        return connectedModeHandover;
    }

    /**
     * Sets the value of the connectedModeHandover property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandoverMobilityConnectedModeEarfcnListContainer }
     *     
     */
    public void setConnectedModeHandover(HandoverMobilityConnectedModeEarfcnListContainer value) {
        this.connectedModeHandover = value;
    }

    /**
     * Gets the value of the isInterRatUtranCoverageBasedRedirectionModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsInterRatUtranCoverageBasedRedirectionModeEnabled() {
        return isInterRatUtranCoverageBasedRedirectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatUtranCoverageBasedRedirectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsInterRatUtranCoverageBasedRedirectionModeEnabled(JAXBElement<EnabledStates> value) {
        this.isInterRatUtranCoverageBasedRedirectionModeEnabled = value;
    }

    /**
     * Gets the value of the interRatUtranCoverageBasedRedirection property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityInterRatUtranCoverageRedirection }
     *     
     */
    public MobilityInterRatUtranCoverageRedirection getInterRatUtranCoverageBasedRedirection() {
        return interRatUtranCoverageBasedRedirection;
    }

    /**
     * Sets the value of the interRatUtranCoverageBasedRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityInterRatUtranCoverageRedirection }
     *     
     */
    public void setInterRatUtranCoverageBasedRedirection(MobilityInterRatUtranCoverageRedirection value) {
        this.interRatUtranCoverageBasedRedirection = value;
    }

    /**
     * Gets the value of the isInterRatUtranReselectionModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsInterRatUtranReselectionModeEnabled() {
        return isInterRatUtranReselectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatUtranReselectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsInterRatUtranReselectionModeEnabled(JAXBElement<EnabledStates> value) {
        this.isInterRatUtranReselectionModeEnabled = value;
    }

    /**
     * Gets the value of the interRatUtranReselection property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityInterRatUtranReselection }
     *     
     */
    public MobilityInterRatUtranReselection getInterRatUtranReselection() {
        return interRatUtranReselection;
    }

    /**
     * Sets the value of the interRatUtranReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityInterRatUtranReselection }
     *     
     */
    public void setInterRatUtranReselection(MobilityInterRatUtranReselection value) {
        this.interRatUtranReselection = value;
    }

    /**
     * Gets the value of the isInterRatGeranReselectionModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsInterRatGeranReselectionModeEnabled() {
        return isInterRatGeranReselectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatGeranReselectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsInterRatGeranReselectionModeEnabled(JAXBElement<EnabledStates> value) {
        this.isInterRatGeranReselectionModeEnabled = value;
    }

    /**
     * Gets the value of the interRatGeranReselection property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityInterRatGeranReselection }
     *     
     */
    public MobilityInterRatGeranReselection getInterRatGeranReselection() {
        return interRatGeranReselection;
    }

    /**
     * Sets the value of the interRatGeranReselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityInterRatGeranReselection }
     *     
     */
    public void setInterRatGeranReselection(MobilityInterRatGeranReselection value) {
        this.interRatGeranReselection = value;
    }

    /**
     * Gets the value of the csfbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbEnabled() {
        return csfbEnabled;
    }

    /**
     * Sets the value of the csfbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbEnabled(JAXBElement<EnabledStates> value) {
        this.csfbEnabled = value;
    }

    /**
     * Gets the value of the csfbUtranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbUtranEnabled() {
        return csfbUtranEnabled;
    }

    /**
     * Sets the value of the csfbUtranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbUtranEnabled(JAXBElement<EnabledStates> value) {
        this.csfbUtranEnabled = value;
    }

    /**
     * Gets the value of the csfbCdma2KEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbCdma2KEnabled() {
        return csfbCdma2KEnabled;
    }

    /**
     * Sets the value of the csfbCdma2KEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbCdma2KEnabled(JAXBElement<EnabledStates> value) {
        this.csfbCdma2KEnabled = value;
    }

    /**
     * Gets the value of the fwdHoEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getFwdHoEnabled() {
        return fwdHoEnabled;
    }

    /**
     * Sets the value of the fwdHoEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setFwdHoEnabled(JAXBElement<EnabledStates> value) {
        this.fwdHoEnabled = value;
    }

}
