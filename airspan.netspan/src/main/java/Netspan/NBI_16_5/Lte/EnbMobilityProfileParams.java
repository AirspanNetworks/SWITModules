
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EnbMobilityProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbMobilityProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdleModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeIntraFreq" minOccurs="0"/&gt;
 *         &lt;element name="IdleModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterFreq" minOccurs="0"/&gt;
 *         &lt;element name="IdleModeInterFrequencyPerBandList" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterBandListContainer" minOccurs="0"/&gt;
 *         &lt;element name="IdleModeInterFrequencyPerEarfcnList" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterEarfcnListContainer" minOccurs="0"/&gt;
 *         &lt;element name="IsThresholdBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsThresholdBasedMeasurementDualMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeThresholdTriggerGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeTriggerGaps" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeThresholdStopGaps" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeStopGaps" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeIntraFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeInterFrequency" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeInterFreq" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeInterFrequencyPerBandList" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeBandListContainer" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeInterFrequencyPerEarfcnList" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreqListContainer" minOccurs="0"/&gt;
 *         &lt;element name="IsQosBasedMeasurementEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsQosHoAccessAdminEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsQosHoBwCapcityAdminEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsQosHoRelayAdminEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsQosHoRelayQualityAdminEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="ConnectedModeQos" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeQosFreq" minOccurs="0"/&gt;
 *         &lt;element name="IsInterRatUtranCoverageBasedRedirectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="InterRatUtranCoverageBasedRedirection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranCoverageRedirection" minOccurs="0"/&gt;
 *         &lt;element name="FwdHoEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="IsInterRatUtranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="InterRatUtranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatUtranReselection" minOccurs="0"/&gt;
 *         &lt;element name="InterRatUtranPriorityList" type="{http://Airspan.Netspan.WebServices}MobilityUtranPriorityListContainer" minOccurs="0"/&gt;
 *         &lt;element name="IsInterRatGeranReselectionModeEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="InterRatGeranReselection" type="{http://Airspan.Netspan.WebServices}MobilityInterRatGeranReselection" minOccurs="0"/&gt;
 *         &lt;element name="InterRatGeranPriorityList" type="{http://Airspan.Netspan.WebServices}MobilityGeranPriorityListContainer" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMeasConfigEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="InterRatMeasConfigList" type="{http://Airspan.Netspan.WebServices}MobilityInterRatMeasCfgListContainer" minOccurs="0"/&gt;
 *         &lt;element name="CsfbUtranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbUtranPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RimTowardsUtran" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbGeranEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbGeranMultipleArfcn" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbGeranBandForMultipleArfcn" type="{http://Airspan.Netspan.WebServices}Bands" minOccurs="0"/&gt;
 *         &lt;element name="CsfbGeranPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RimTowardsGeran" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbGeranCellOrder" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbCdma2kEnabled" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="CsfbCdma2kPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AllowHOto3G" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="EnableSrvcc" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="SrvccType" type="{http://Airspan.Netspan.WebServices}SrvccTypes" minOccurs="0"/&gt;
 *         &lt;element name="SrvccOnly3GHO" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *         &lt;element name="RequestFrequencyBandList" type="{http://Airspan.Netspan.WebServices}MobilityReqFreqBandListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "isThresholdBasedMeasurementEnabled",
    "isThresholdBasedMeasurementDualMode",
    "connectedModeThresholdTriggerGaps",
    "connectedModeThresholdStopGaps",
    "connectedModeIntraFrequency",
    "connectedModeInterFrequency",
    "connectedModeInterFrequencyPerBandList",
    "connectedModeInterFrequencyPerEarfcnList",
    "isQosBasedMeasurementEnabled",
    "isQosHoAccessAdminEnabled",
    "isQosHoBwCapcityAdminEnabled",
    "isQosHoRelayAdminEnabled",
    "isQosHoRelayQualityAdminEnabled",
    "connectedModeQos",
    "isInterRatUtranCoverageBasedRedirectionModeEnabled",
    "interRatUtranCoverageBasedRedirection",
    "fwdHoEnabled",
    "isInterRatUtranReselectionModeEnabled",
    "interRatUtranReselection",
    "interRatUtranPriorityList",
    "isInterRatGeranReselectionModeEnabled",
    "interRatGeranReselection",
    "interRatGeranPriorityList",
    "interRatMeasConfigEnabled",
    "interRatMeasConfigList",
    "csfbUtranEnabled",
    "csfbUtranPriority",
    "rimTowardsUtran",
    "csfbGeranEnabled",
    "csfbGeranMultipleArfcn",
    "csfbGeranBandForMultipleArfcn",
    "csfbGeranPriority",
    "rimTowardsGeran",
    "csfbGeranCellOrder",
    "csfbCdma2KEnabled",
    "csfbCdma2KPriority",
    "allowHOto3G",
    "enableSrvcc",
    "srvccType",
    "srvccOnly3GHO",
    "requestFrequencyBandList"
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
    @XmlElementRef(name = "IsThresholdBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isThresholdBasedMeasurementEnabled;
    @XmlElementRef(name = "IsThresholdBasedMeasurementDualMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isThresholdBasedMeasurementDualMode;
    @XmlElement(name = "ConnectedModeThresholdTriggerGaps")
    protected MobilityConnectedModeTriggerGaps connectedModeThresholdTriggerGaps;
    @XmlElement(name = "ConnectedModeThresholdStopGaps")
    protected MobilityConnectedModeStopGaps connectedModeThresholdStopGaps;
    @XmlElement(name = "ConnectedModeIntraFrequency")
    protected MobilityConnectedModeFreq connectedModeIntraFrequency;
    @XmlElement(name = "ConnectedModeInterFrequency")
    protected MobilityConnectedModeInterFreq connectedModeInterFrequency;
    @XmlElement(name = "ConnectedModeInterFrequencyPerBandList")
    protected MobilityConnectedModeBandListContainer connectedModeInterFrequencyPerBandList;
    @XmlElement(name = "ConnectedModeInterFrequencyPerEarfcnList")
    protected MobilityConnectedModeFreqListContainer connectedModeInterFrequencyPerEarfcnList;
    @XmlElementRef(name = "IsQosBasedMeasurementEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosBasedMeasurementEnabled;
    @XmlElementRef(name = "IsQosHoAccessAdminEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosHoAccessAdminEnabled;
    @XmlElementRef(name = "IsQosHoBwCapcityAdminEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosHoBwCapcityAdminEnabled;
    @XmlElementRef(name = "IsQosHoRelayAdminEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosHoRelayAdminEnabled;
    @XmlElementRef(name = "IsQosHoRelayQualityAdminEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isQosHoRelayQualityAdminEnabled;
    @XmlElement(name = "ConnectedModeQos")
    protected MobilityConnectedModeQosFreq connectedModeQos;
    @XmlElementRef(name = "IsInterRatUtranCoverageBasedRedirectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatUtranCoverageBasedRedirectionModeEnabled;
    @XmlElement(name = "InterRatUtranCoverageBasedRedirection")
    protected MobilityInterRatUtranCoverageRedirection interRatUtranCoverageBasedRedirection;
    @XmlElementRef(name = "FwdHoEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> fwdHoEnabled;
    @XmlElementRef(name = "IsInterRatUtranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatUtranReselectionModeEnabled;
    @XmlElement(name = "InterRatUtranReselection")
    protected MobilityInterRatUtranReselection interRatUtranReselection;
    @XmlElement(name = "InterRatUtranPriorityList")
    protected MobilityUtranPriorityListContainer interRatUtranPriorityList;
    @XmlElementRef(name = "IsInterRatGeranReselectionModeEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> isInterRatGeranReselectionModeEnabled;
    @XmlElement(name = "InterRatGeranReselection")
    protected MobilityInterRatGeranReselection interRatGeranReselection;
    @XmlElement(name = "InterRatGeranPriorityList")
    protected MobilityGeranPriorityListContainer interRatGeranPriorityList;
    @XmlElementRef(name = "InterRatMeasConfigEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> interRatMeasConfigEnabled;
    @XmlElement(name = "InterRatMeasConfigList")
    protected MobilityInterRatMeasCfgListContainer interRatMeasConfigList;
    @XmlElementRef(name = "CsfbUtranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbUtranEnabled;
    @XmlElementRef(name = "CsfbUtranPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbUtranPriority;
    @XmlElementRef(name = "RimTowardsUtran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> rimTowardsUtran;
    @XmlElementRef(name = "CsfbGeranEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbGeranEnabled;
    @XmlElementRef(name = "CsfbGeranMultipleArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbGeranMultipleArfcn;
    @XmlElementRef(name = "CsfbGeranBandForMultipleArfcn", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Bands> csfbGeranBandForMultipleArfcn;
    @XmlElementRef(name = "CsfbGeranPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbGeranPriority;
    @XmlElementRef(name = "RimTowardsGeran", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> rimTowardsGeran;
    @XmlElementRef(name = "CsfbGeranCellOrder", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbGeranCellOrder;
    @XmlElementRef(name = "CsfbCdma2kEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> csfbCdma2KEnabled;
    @XmlElementRef(name = "CsfbCdma2kPriority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> csfbCdma2KPriority;
    @XmlElementRef(name = "AllowHOto3G", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> allowHOto3G;
    @XmlElementRef(name = "EnableSrvcc", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> enableSrvcc;
    @XmlElementRef(name = "SrvccType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SrvccTypes> srvccType;
    @XmlElementRef(name = "SrvccOnly3GHO", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> srvccOnly3GHO;
    @XmlElement(name = "RequestFrequencyBandList")
    protected MobilityReqFreqBandListContainer requestFrequencyBandList;

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
     * Gets the value of the isThresholdBasedMeasurementDualMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsThresholdBasedMeasurementDualMode() {
        return isThresholdBasedMeasurementDualMode;
    }

    /**
     * Sets the value of the isThresholdBasedMeasurementDualMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsThresholdBasedMeasurementDualMode(JAXBElement<Boolean> value) {
        this.isThresholdBasedMeasurementDualMode = value;
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
     * Gets the value of the isQosHoAccessAdminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsQosHoAccessAdminEnabled() {
        return isQosHoAccessAdminEnabled;
    }

    /**
     * Sets the value of the isQosHoAccessAdminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsQosHoAccessAdminEnabled(JAXBElement<EnabledStates> value) {
        this.isQosHoAccessAdminEnabled = value;
    }

    /**
     * Gets the value of the isQosHoBwCapcityAdminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsQosHoBwCapcityAdminEnabled() {
        return isQosHoBwCapcityAdminEnabled;
    }

    /**
     * Sets the value of the isQosHoBwCapcityAdminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsQosHoBwCapcityAdminEnabled(JAXBElement<EnabledStates> value) {
        this.isQosHoBwCapcityAdminEnabled = value;
    }

    /**
     * Gets the value of the isQosHoRelayAdminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsQosHoRelayAdminEnabled() {
        return isQosHoRelayAdminEnabled;
    }

    /**
     * Sets the value of the isQosHoRelayAdminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsQosHoRelayAdminEnabled(JAXBElement<EnabledStates> value) {
        this.isQosHoRelayAdminEnabled = value;
    }

    /**
     * Gets the value of the isQosHoRelayQualityAdminEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getIsQosHoRelayQualityAdminEnabled() {
        return isQosHoRelayQualityAdminEnabled;
    }

    /**
     * Sets the value of the isQosHoRelayQualityAdminEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setIsQosHoRelayQualityAdminEnabled(JAXBElement<EnabledStates> value) {
        this.isQosHoRelayQualityAdminEnabled = value;
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
     * Gets the value of the interRatUtranPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityUtranPriorityListContainer }
     *     
     */
    public MobilityUtranPriorityListContainer getInterRatUtranPriorityList() {
        return interRatUtranPriorityList;
    }

    /**
     * Sets the value of the interRatUtranPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityUtranPriorityListContainer }
     *     
     */
    public void setInterRatUtranPriorityList(MobilityUtranPriorityListContainer value) {
        this.interRatUtranPriorityList = value;
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
     * Gets the value of the interRatGeranPriorityList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityGeranPriorityListContainer }
     *     
     */
    public MobilityGeranPriorityListContainer getInterRatGeranPriorityList() {
        return interRatGeranPriorityList;
    }

    /**
     * Sets the value of the interRatGeranPriorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityGeranPriorityListContainer }
     *     
     */
    public void setInterRatGeranPriorityList(MobilityGeranPriorityListContainer value) {
        this.interRatGeranPriorityList = value;
    }

    /**
     * Gets the value of the interRatMeasConfigEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getInterRatMeasConfigEnabled() {
        return interRatMeasConfigEnabled;
    }

    /**
     * Sets the value of the interRatMeasConfigEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setInterRatMeasConfigEnabled(JAXBElement<EnabledStates> value) {
        this.interRatMeasConfigEnabled = value;
    }

    /**
     * Gets the value of the interRatMeasConfigList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityInterRatMeasCfgListContainer }
     *     
     */
    public MobilityInterRatMeasCfgListContainer getInterRatMeasConfigList() {
        return interRatMeasConfigList;
    }

    /**
     * Sets the value of the interRatMeasConfigList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityInterRatMeasCfgListContainer }
     *     
     */
    public void setInterRatMeasConfigList(MobilityInterRatMeasCfgListContainer value) {
        this.interRatMeasConfigList = value;
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
     * Gets the value of the csfbUtranPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbUtranPriority() {
        return csfbUtranPriority;
    }

    /**
     * Sets the value of the csfbUtranPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbUtranPriority(JAXBElement<Integer> value) {
        this.csfbUtranPriority = value;
    }

    /**
     * Gets the value of the rimTowardsUtran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getRimTowardsUtran() {
        return rimTowardsUtran;
    }

    /**
     * Sets the value of the rimTowardsUtran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setRimTowardsUtran(JAXBElement<EnabledStates> value) {
        this.rimTowardsUtran = value;
    }

    /**
     * Gets the value of the csfbGeranEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbGeranEnabled() {
        return csfbGeranEnabled;
    }

    /**
     * Sets the value of the csfbGeranEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbGeranEnabled(JAXBElement<EnabledStates> value) {
        this.csfbGeranEnabled = value;
    }

    /**
     * Gets the value of the csfbGeranMultipleArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbGeranMultipleArfcn() {
        return csfbGeranMultipleArfcn;
    }

    /**
     * Sets the value of the csfbGeranMultipleArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbGeranMultipleArfcn(JAXBElement<EnabledStates> value) {
        this.csfbGeranMultipleArfcn = value;
    }

    /**
     * Gets the value of the csfbGeranBandForMultipleArfcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public JAXBElement<Bands> getCsfbGeranBandForMultipleArfcn() {
        return csfbGeranBandForMultipleArfcn;
    }

    /**
     * Sets the value of the csfbGeranBandForMultipleArfcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Bands }{@code >}
     *     
     */
    public void setCsfbGeranBandForMultipleArfcn(JAXBElement<Bands> value) {
        this.csfbGeranBandForMultipleArfcn = value;
    }

    /**
     * Gets the value of the csfbGeranPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbGeranPriority() {
        return csfbGeranPriority;
    }

    /**
     * Sets the value of the csfbGeranPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbGeranPriority(JAXBElement<Integer> value) {
        this.csfbGeranPriority = value;
    }

    /**
     * Gets the value of the rimTowardsGeran property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getRimTowardsGeran() {
        return rimTowardsGeran;
    }

    /**
     * Sets the value of the rimTowardsGeran property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setRimTowardsGeran(JAXBElement<EnabledStates> value) {
        this.rimTowardsGeran = value;
    }

    /**
     * Gets the value of the csfbGeranCellOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getCsfbGeranCellOrder() {
        return csfbGeranCellOrder;
    }

    /**
     * Sets the value of the csfbGeranCellOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setCsfbGeranCellOrder(JAXBElement<EnabledStates> value) {
        this.csfbGeranCellOrder = value;
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
     * Gets the value of the csfbCdma2KPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCsfbCdma2KPriority() {
        return csfbCdma2KPriority;
    }

    /**
     * Sets the value of the csfbCdma2KPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCsfbCdma2KPriority(JAXBElement<Integer> value) {
        this.csfbCdma2KPriority = value;
    }

    /**
     * Gets the value of the allowHOto3G property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getAllowHOto3G() {
        return allowHOto3G;
    }

    /**
     * Sets the value of the allowHOto3G property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setAllowHOto3G(JAXBElement<EnabledStates> value) {
        this.allowHOto3G = value;
    }

    /**
     * Gets the value of the enableSrvcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getEnableSrvcc() {
        return enableSrvcc;
    }

    /**
     * Sets the value of the enableSrvcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setEnableSrvcc(JAXBElement<EnabledStates> value) {
        this.enableSrvcc = value;
    }

    /**
     * Gets the value of the srvccType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrvccTypes }{@code >}
     *     
     */
    public JAXBElement<SrvccTypes> getSrvccType() {
        return srvccType;
    }

    /**
     * Sets the value of the srvccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrvccTypes }{@code >}
     *     
     */
    public void setSrvccType(JAXBElement<SrvccTypes> value) {
        this.srvccType = value;
    }

    /**
     * Gets the value of the srvccOnly3GHO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getSrvccOnly3GHO() {
        return srvccOnly3GHO;
    }

    /**
     * Sets the value of the srvccOnly3GHO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setSrvccOnly3GHO(JAXBElement<EnabledStates> value) {
        this.srvccOnly3GHO = value;
    }

    /**
     * Gets the value of the requestFrequencyBandList property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityReqFreqBandListContainer }
     *     
     */
    public MobilityReqFreqBandListContainer getRequestFrequencyBandList() {
        return requestFrequencyBandList;
    }

    /**
     * Sets the value of the requestFrequencyBandList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityReqFreqBandListContainer }
     *     
     */
    public void setRequestFrequencyBandList(MobilityReqFreqBandListContainer value) {
        this.requestFrequencyBandList = value;
    }

}
