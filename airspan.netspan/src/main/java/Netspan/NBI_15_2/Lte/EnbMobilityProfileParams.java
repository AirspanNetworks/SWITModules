
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledDisabledStates;


/**
 * <p>Java class for EnbMobilityProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMobilityProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdleModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeIntraFreq" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterFreq" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFrequencyPerBandList" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterBandListContainer" minOccurs="0"/>
 *         &lt;element name="IdleModeInterFrequencyPerEarfcnList" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterEarfcnListContainer" minOccurs="0"/>
 *         &lt;element name="ConnectedModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/>
 *         &lt;element name="ConnectedModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeInterFreq" minOccurs="0"/>
 *         &lt;element name="ConnectedModeInterFrequencyPerBandList" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeBandListContainer" minOccurs="0"/>
 *         &lt;element name="ConnectedModeInterFrequencyPerEarfcnList" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreqListContainer" minOccurs="0"/>
 *         &lt;element name="IsQosBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ConnectedModeQos" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeQosFreq" minOccurs="0"/>
 *         &lt;element name="IsThresholdBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="ConnectedModeThresholdTriggerGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeTriggerGaps" minOccurs="0"/>
 *         &lt;element name="ConnectedModeThresholdStopGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeStopGaps" minOccurs="0"/>
 *         &lt;element name="IsInterRatUtranCoverageBasedRedirectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatUtranCoverageBasedRedirection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranCoverageRedirection" minOccurs="0"/>
 *         &lt;element name="FwdHoEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="IsInterRatUtranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatUtranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranReselection" minOccurs="0"/>
 *         &lt;element name="IsInterRatGeranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="InterRatGeranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatGeranReselection" minOccurs="0"/>
 *         &lt;element name="CsfbEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CsfbUtranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *         &lt;element name="CsfbGeranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledDisabledStates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbMobilityProfileParams", propOrder = {
    "idleModeIntraFrequency",
    "idleModeInterFrequency",
    "idleModeInterFrequencyPerBandList",
    "idleModeInterFrequencyPerEarfcnList",
    "connectedModeIntraFrequency",
    "connectedModeInterFrequency",
    "connectedModeInterFrequencyPerBandList",
    "connectedModeInterFrequencyPerEarfcnList",
    "isQosBasedMeasurementEnabled",
    "connectedModeQos",
    "isThresholdBasedMeasurementEnabled",
    "connectedModeThresholdTriggerGaps",
    "connectedModeThresholdStopGaps",
    "isInterRatUtranCoverageBasedRedirectionModeEnabled",
    "interRatUtranCoverageBasedRedirection",
    "fwdHoEnabled",
    "isInterRatUtranReselectionModeEnabled",
    "interRatUtranReselection",
    "isInterRatGeranReselectionModeEnabled",
    "interRatGeranReselection",
    "csfbEnabled",
    "csfbUtranEnabled",
    "csfbCdma2KEnabled",
    "csfbGeranEnabled"
})
@XmlSeeAlso({
    EnbMobilityProfile.class
})
public class EnbMobilityProfileParams {

    @XmlElement(name = "IdleModeIntraFrequency")
    protected MobilityIdleModeIntraFreq idleModeIntraFrequency;
    @XmlElement(name = "IdleModeInterFrequency")
    protected MobilityIdleModeInterFreq idleModeInterFrequency;
    @XmlElement(name = "IdleModeInterFrequencyPerBandList")
    protected MobilityIdleModeInterBandListContainer idleModeInterFrequencyPerBandList;
    @XmlElement(name = "IdleModeInterFrequencyPerEarfcnList")
    protected MobilityIdleModeInterEarfcnListContainer idleModeInterFrequencyPerEarfcnList;
    @XmlElement(name = "ConnectedModeIntraFrequency")
    protected MobilityConnectedModeFreq connectedModeIntraFrequency;
    @XmlElement(name = "ConnectedModeInterFrequency")
    protected MobilityConnectedModeInterFreq connectedModeInterFrequency;
    @XmlElement(name = "ConnectedModeInterFrequencyPerBandList")
    protected MobilityConnectedModeBandListContainer connectedModeInterFrequencyPerBandList;
    @XmlElement(name = "ConnectedModeInterFrequencyPerEarfcnList")
    protected MobilityConnectedModeFreqListContainer connectedModeInterFrequencyPerEarfcnList;
    @XmlElementRef(name = "IsQosBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isQosBasedMeasurementEnabled;
    @XmlElement(name = "ConnectedModeQos")
    protected MobilityConnectedModeQosFreq connectedModeQos;
    @XmlElementRef(name = "IsThresholdBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isThresholdBasedMeasurementEnabled;
    @XmlElement(name = "ConnectedModeThresholdTriggerGaps")
    protected MobilityConnectedModeTriggerGaps connectedModeThresholdTriggerGaps;
    @XmlElement(name = "ConnectedModeThresholdStopGaps")
    protected MobilityConnectedModeStopGaps connectedModeThresholdStopGaps;
    @XmlElementRef(name = "IsInterRatUtranCoverageBasedRedirectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isInterRatUtranCoverageBasedRedirectionModeEnabled;
    @XmlElement(name = "InterRatUtranCoverageBasedRedirection")
    protected MobilityInterRatUtranCoverageRedirection interRatUtranCoverageBasedRedirection;
    @XmlElementRef(name = "FwdHoEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> fwdHoEnabled;
    @XmlElementRef(name = "IsInterRatUtranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isInterRatUtranReselectionModeEnabled;
    @XmlElement(name = "InterRatUtranReselection")
    protected MobilityInterRatUtranReselection interRatUtranReselection;
    @XmlElementRef(name = "IsInterRatGeranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> isInterRatGeranReselectionModeEnabled;
    @XmlElement(name = "InterRatGeranReselection")
    protected MobilityInterRatGeranReselection interRatGeranReselection;
    @XmlElementRef(name = "CsfbEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> csfbEnabled;
    @XmlElementRef(name = "CsfbUtranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> csfbUtranEnabled;
    @XmlElementRef(name = "CsfbCdma2kEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> csfbCdma2KEnabled;
    @XmlElementRef(name = "CsfbGeranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledStates> csfbGeranEnabled;

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
     * Gets the value of the idleModeInterFrequencyPerBandList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeInterBandListContainer }
     *     
     */
    public MobilityIdleModeInterBandListContainer getIdleModeInterFrequencyPerBandList() {
        return idleModeInterFrequencyPerBandList;
    }

    /**
     * Sets the value of the idleModeInterFrequencyPerBandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeInterBandListContainer }
     *     
     */
    public void setIdleModeInterFrequencyPerBandList(MobilityIdleModeInterBandListContainer value) {
        this.idleModeInterFrequencyPerBandList = value;
    }

    /**
     * Gets the value of the idleModeInterFrequencyPerEarfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityIdleModeInterEarfcnListContainer }
     *     
     */
    public MobilityIdleModeInterEarfcnListContainer getIdleModeInterFrequencyPerEarfcnList() {
        return idleModeInterFrequencyPerEarfcnList;
    }

    /**
     * Sets the value of the idleModeInterFrequencyPerEarfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityIdleModeInterEarfcnListContainer }
     *     
     */
    public void setIdleModeInterFrequencyPerEarfcnList(MobilityIdleModeInterEarfcnListContainer value) {
        this.idleModeInterFrequencyPerEarfcnList = value;
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
     * Gets the value of the connectedModeInterFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeInterFreq }
     *     
     */
    public MobilityConnectedModeInterFreq getConnectedModeInterFrequency() {
        return connectedModeInterFrequency;
    }

    /**
     * Sets the value of the connectedModeInterFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeInterFreq }
     *     
     */
    public void setConnectedModeInterFrequency(MobilityConnectedModeInterFreq value) {
        this.connectedModeInterFrequency = value;
    }

    /**
     * Gets the value of the connectedModeInterFrequencyPerBandList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeBandListContainer }
     *     
     */
    public MobilityConnectedModeBandListContainer getConnectedModeInterFrequencyPerBandList() {
        return connectedModeInterFrequencyPerBandList;
    }

    /**
     * Sets the value of the connectedModeInterFrequencyPerBandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeBandListContainer }
     *     
     */
    public void setConnectedModeInterFrequencyPerBandList(MobilityConnectedModeBandListContainer value) {
        this.connectedModeInterFrequencyPerBandList = value;
    }

    /**
     * Gets the value of the connectedModeInterFrequencyPerEarfcnList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityConnectedModeFreqListContainer }
     *     
     */
    public MobilityConnectedModeFreqListContainer getConnectedModeInterFrequencyPerEarfcnList() {
        return connectedModeInterFrequencyPerEarfcnList;
    }

    /**
     * Sets the value of the connectedModeInterFrequencyPerEarfcnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityConnectedModeFreqListContainer }
     *     
     */
    public void setConnectedModeInterFrequencyPerEarfcnList(MobilityConnectedModeFreqListContainer value) {
        this.connectedModeInterFrequencyPerEarfcnList = value;
    }

    /**
     * Gets the value of the isQosBasedMeasurementEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsQosBasedMeasurementEnabled() {
        return isQosBasedMeasurementEnabled;
    }

    /**
     * Sets the value of the isQosBasedMeasurementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsQosBasedMeasurementEnabled(JAXBElement<EnabledDisabledStates> value) {
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsThresholdBasedMeasurementEnabled() {
        return isThresholdBasedMeasurementEnabled;
    }

    /**
     * Sets the value of the isThresholdBasedMeasurementEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsThresholdBasedMeasurementEnabled(JAXBElement<EnabledDisabledStates> value) {
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
     * Gets the value of the isInterRatUtranCoverageBasedRedirectionModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsInterRatUtranCoverageBasedRedirectionModeEnabled() {
        return isInterRatUtranCoverageBasedRedirectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatUtranCoverageBasedRedirectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsInterRatUtranCoverageBasedRedirectionModeEnabled(JAXBElement<EnabledDisabledStates> value) {
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
     * Gets the value of the fwdHoEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getFwdHoEnabled() {
        return fwdHoEnabled;
    }

    /**
     * Sets the value of the fwdHoEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setFwdHoEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.fwdHoEnabled = value;
    }

    /**
     * Gets the value of the isInterRatUtranReselectionModeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsInterRatUtranReselectionModeEnabled() {
        return isInterRatUtranReselectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatUtranReselectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsInterRatUtranReselectionModeEnabled(JAXBElement<EnabledDisabledStates> value) {
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getIsInterRatGeranReselectionModeEnabled() {
        return isInterRatGeranReselectionModeEnabled;
    }

    /**
     * Sets the value of the isInterRatGeranReselectionModeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setIsInterRatGeranReselectionModeEnabled(JAXBElement<EnabledDisabledStates> value) {
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
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCsfbEnabled() {
        return csfbEnabled;
    }

    /**
     * Sets the value of the csfbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCsfbEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.csfbEnabled = value;
    }

    /**
     * Gets the value of the csfbUtranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCsfbUtranEnabled() {
        return csfbUtranEnabled;
    }

    /**
     * Sets the value of the csfbUtranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCsfbUtranEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.csfbUtranEnabled = value;
    }

    /**
     * Gets the value of the csfbCdma2KEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCsfbCdma2KEnabled() {
        return csfbCdma2KEnabled;
    }

    /**
     * Sets the value of the csfbCdma2KEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCsfbCdma2KEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.csfbCdma2KEnabled = value;
    }

    /**
     * Gets the value of the csfbGeranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledStates> getCsfbGeranEnabled() {
        return csfbGeranEnabled;
    }

    /**
     * Sets the value of the csfbGeranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledStates }{@code >}
     *     
     */
    public void setCsfbGeranEnabled(JAXBElement<EnabledDisabledStates> value) {
        this.csfbGeranEnabled = value;
    }

}
