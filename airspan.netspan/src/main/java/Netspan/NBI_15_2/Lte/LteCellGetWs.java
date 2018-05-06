
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCellGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCellGetWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellNumber" type="{http://Airspan.Netspan.WebServices}EnbCellNumber" minOccurs="0"/>
 *         &lt;element name="CellIdForEci" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CellIdentity28Bit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalLayerCellGroup" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalLayerIdentity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalCellId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrachRsi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TrackingAreaCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EmergencyAreaId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrachFreqOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CellAdvancedConfigurationProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadioProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomMobilityProfileParameters" type="{http://Airspan.Netspan.WebServices}EnbMobilityProfileParams" minOccurs="0"/>
 *         &lt;element name="EmbmsProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UtranProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrafficManagementProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTraceProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAccessClassBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmergencyAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SignalingAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/>
 *         &lt;element name="SignalingAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSignalingAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDataAccessBarred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DataAccessBarringFactor" type="{http://Airspan.Netspan.WebServices}AccessBarringFactorTypes" minOccurs="0"/>
 *         &lt;element name="DataAccessBarringTimeInSec" type="{http://Airspan.Netspan.WebServices}AccessBarringTimeTypes" minOccurs="0"/>
 *         &lt;element name="IsDataAccessClass11Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDataAccessClass12Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDataAccessClass13Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDataAccessClass14Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDataAccessClass15Barred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kCellParam" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kCellParams" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kSib8Param" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kSib8Params" minOccurs="0"/>
 *         &lt;element name="CsfbCdma2kMobilityParam" type="{http://Airspan.Netspan.WebServices}CsfbCdma2kMobilityParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCellGetWs", propOrder = {
    "cellNumber",
    "cellIdForEci",
    "cellIdentity28Bit",
    "physicalLayerCellGroup",
    "physicalLayerIdentity",
    "physicalCellId",
    "prachRsi",
    "trackingAreaCode",
    "emergencyAreaId",
    "prachFreqOffset",
    "cellAdvancedConfigurationProfile",
    "radioProfile",
    "mobilityProfile",
    "customMobilityProfileParameters",
    "embmsProfile",
    "utranProfile",
    "trafficManagementProfile",
    "callTraceProfile",
    "isAccessClassBarred",
    "isEmergencyAccessBarred",
    "isSignalingAccessBarred",
    "signalingAccessBarringFactor",
    "signalingAccessBarringTimeInSec",
    "isSignalingAccessClass11Barred",
    "isSignalingAccessClass12Barred",
    "isSignalingAccessClass13Barred",
    "isSignalingAccessClass14Barred",
    "isSignalingAccessClass15Barred",
    "isDataAccessBarred",
    "dataAccessBarringFactor",
    "dataAccessBarringTimeInSec",
    "isDataAccessClass11Barred",
    "isDataAccessClass12Barred",
    "isDataAccessClass13Barred",
    "isDataAccessClass14Barred",
    "isDataAccessClass15Barred",
    "isEnabled",
    "csfbCdma2KCellParam",
    "csfbCdma2KSib8Param",
    "csfbCdma2KMobilityParam"
})
public class LteCellGetWs {

    @XmlElementRef(name = "CellNumber", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cellNumber;
    @XmlElementRef(name = "CellIdForEci", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdForEci;
    @XmlElementRef(name = "CellIdentity28Bit", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cellIdentity28Bit;
    @XmlElementRef(name = "PhysicalLayerCellGroup", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerCellGroup;
    @XmlElementRef(name = "PhysicalLayerIdentity", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalLayerIdentity;
    @XmlElementRef(name = "PhysicalCellId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> physicalCellId;
    @XmlElementRef(name = "PrachRsi", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachRsi;
    @XmlElementRef(name = "TrackingAreaCode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> trackingAreaCode;
    @XmlElementRef(name = "EmergencyAreaId", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> emergencyAreaId;
    @XmlElementRef(name = "PrachFreqOffset", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> prachFreqOffset;
    @XmlElement(name = "CellAdvancedConfigurationProfile")
    protected String cellAdvancedConfigurationProfile;
    @XmlElement(name = "RadioProfile")
    protected String radioProfile;
    @XmlElement(name = "MobilityProfile")
    protected String mobilityProfile;
    @XmlElement(name = "CustomMobilityProfileParameters")
    protected EnbMobilityProfileParams customMobilityProfileParameters;
    @XmlElement(name = "EmbmsProfile")
    protected String embmsProfile;
    @XmlElement(name = "UtranProfile")
    protected String utranProfile;
    @XmlElement(name = "TrafficManagementProfile")
    protected String trafficManagementProfile;
    @XmlElement(name = "CallTraceProfile")
    protected String callTraceProfile;
    @XmlElementRef(name = "IsAccessClassBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAccessClassBarred;
    @XmlElementRef(name = "IsEmergencyAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEmergencyAccessBarred;
    @XmlElementRef(name = "IsSignalingAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessBarred;
    @XmlElementRef(name = "SignalingAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringFactor;
    @XmlElementRef(name = "SignalingAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> signalingAccessBarringTimeInSec;
    @XmlElementRef(name = "IsSignalingAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass11Barred;
    @XmlElementRef(name = "IsSignalingAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass12Barred;
    @XmlElementRef(name = "IsSignalingAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass13Barred;
    @XmlElementRef(name = "IsSignalingAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass14Barred;
    @XmlElementRef(name = "IsSignalingAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isSignalingAccessClass15Barred;
    @XmlElementRef(name = "IsDataAccessBarred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessBarred;
    @XmlElementRef(name = "DataAccessBarringFactor", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringFactor;
    @XmlElementRef(name = "DataAccessBarringTimeInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataAccessBarringTimeInSec;
    @XmlElementRef(name = "IsDataAccessClass11Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass11Barred;
    @XmlElementRef(name = "IsDataAccessClass12Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass12Barred;
    @XmlElementRef(name = "IsDataAccessClass13Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass13Barred;
    @XmlElementRef(name = "IsDataAccessClass14Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass14Barred;
    @XmlElementRef(name = "IsDataAccessClass15Barred", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDataAccessClass15Barred;
    @XmlElementRef(name = "IsEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isEnabled;
    @XmlElement(name = "CsfbCdma2kCellParam")
    protected CsfbCdma2KCellParams csfbCdma2KCellParam;
    @XmlElement(name = "CsfbCdma2kSib8Param")
    protected CsfbCdma2KSib8Params csfbCdma2KSib8Param;
    @XmlElement(name = "CsfbCdma2kMobilityParam")
    protected CsfbCdma2KMobilityParams csfbCdma2KMobilityParam;

    /**
     * Gets the value of the cellNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCellNumber() {
        return cellNumber;
    }

    /**
     * Sets the value of the cellNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCellNumber(JAXBElement<String> value) {
        this.cellNumber = value;
    }

    /**
     * Gets the value of the cellIdForEci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdForEci() {
        return cellIdForEci;
    }

    /**
     * Sets the value of the cellIdForEci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdForEci(JAXBElement<Integer> value) {
        this.cellIdForEci = value;
    }

    /**
     * Gets the value of the cellIdentity28Bit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCellIdentity28Bit() {
        return cellIdentity28Bit;
    }

    /**
     * Sets the value of the cellIdentity28Bit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCellIdentity28Bit(JAXBElement<Integer> value) {
        this.cellIdentity28Bit = value;
    }

    /**
     * Gets the value of the physicalLayerCellGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerCellGroup() {
        return physicalLayerCellGroup;
    }

    /**
     * Sets the value of the physicalLayerCellGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerCellGroup(JAXBElement<Integer> value) {
        this.physicalLayerCellGroup = value;
    }

    /**
     * Gets the value of the physicalLayerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalLayerIdentity() {
        return physicalLayerIdentity;
    }

    /**
     * Sets the value of the physicalLayerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalLayerIdentity(JAXBElement<Integer> value) {
        this.physicalLayerIdentity = value;
    }

    /**
     * Gets the value of the physicalCellId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhysicalCellId() {
        return physicalCellId;
    }

    /**
     * Sets the value of the physicalCellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhysicalCellId(JAXBElement<Integer> value) {
        this.physicalCellId = value;
    }

    /**
     * Gets the value of the prachRsi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachRsi() {
        return prachRsi;
    }

    /**
     * Sets the value of the prachRsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachRsi(JAXBElement<Integer> value) {
        this.prachRsi = value;
    }

    /**
     * Gets the value of the trackingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTrackingAreaCode() {
        return trackingAreaCode;
    }

    /**
     * Sets the value of the trackingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTrackingAreaCode(JAXBElement<Integer> value) {
        this.trackingAreaCode = value;
    }

    /**
     * Gets the value of the emergencyAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEmergencyAreaId() {
        return emergencyAreaId;
    }

    /**
     * Sets the value of the emergencyAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEmergencyAreaId(JAXBElement<Integer> value) {
        this.emergencyAreaId = value;
    }

    /**
     * Gets the value of the prachFreqOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrachFreqOffset() {
        return prachFreqOffset;
    }

    /**
     * Sets the value of the prachFreqOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrachFreqOffset(JAXBElement<Integer> value) {
        this.prachFreqOffset = value;
    }

    /**
     * Gets the value of the cellAdvancedConfigurationProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellAdvancedConfigurationProfile() {
        return cellAdvancedConfigurationProfile;
    }

    /**
     * Sets the value of the cellAdvancedConfigurationProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellAdvancedConfigurationProfile(String value) {
        this.cellAdvancedConfigurationProfile = value;
    }

    /**
     * Gets the value of the radioProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioProfile() {
        return radioProfile;
    }

    /**
     * Sets the value of the radioProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioProfile(String value) {
        this.radioProfile = value;
    }

    /**
     * Gets the value of the mobilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilityProfile() {
        return mobilityProfile;
    }

    /**
     * Sets the value of the mobilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilityProfile(String value) {
        this.mobilityProfile = value;
    }

    /**
     * Gets the value of the customMobilityProfileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EnbMobilityProfileParams }
     *     
     */
    public EnbMobilityProfileParams getCustomMobilityProfileParameters() {
        return customMobilityProfileParameters;
    }

    /**
     * Sets the value of the customMobilityProfileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnbMobilityProfileParams }
     *     
     */
    public void setCustomMobilityProfileParameters(EnbMobilityProfileParams value) {
        this.customMobilityProfileParameters = value;
    }

    /**
     * Gets the value of the embmsProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbmsProfile() {
        return embmsProfile;
    }

    /**
     * Sets the value of the embmsProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbmsProfile(String value) {
        this.embmsProfile = value;
    }

    /**
     * Gets the value of the utranProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtranProfile() {
        return utranProfile;
    }

    /**
     * Sets the value of the utranProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtranProfile(String value) {
        this.utranProfile = value;
    }

    /**
     * Gets the value of the trafficManagementProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafficManagementProfile() {
        return trafficManagementProfile;
    }

    /**
     * Sets the value of the trafficManagementProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafficManagementProfile(String value) {
        this.trafficManagementProfile = value;
    }

    /**
     * Gets the value of the callTraceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTraceProfile() {
        return callTraceProfile;
    }

    /**
     * Sets the value of the callTraceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTraceProfile(String value) {
        this.callTraceProfile = value;
    }

    /**
     * Gets the value of the isAccessClassBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAccessClassBarred() {
        return isAccessClassBarred;
    }

    /**
     * Sets the value of the isAccessClassBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAccessClassBarred(JAXBElement<Boolean> value) {
        this.isAccessClassBarred = value;
    }

    /**
     * Gets the value of the isEmergencyAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEmergencyAccessBarred() {
        return isEmergencyAccessBarred;
    }

    /**
     * Sets the value of the isEmergencyAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEmergencyAccessBarred(JAXBElement<Boolean> value) {
        this.isEmergencyAccessBarred = value;
    }

    /**
     * Gets the value of the isSignalingAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessBarred() {
        return isSignalingAccessBarred;
    }

    /**
     * Sets the value of the isSignalingAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessBarred(JAXBElement<Boolean> value) {
        this.isSignalingAccessBarred = value;
    }

    /**
     * Gets the value of the signalingAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringFactor() {
        return signalingAccessBarringFactor;
    }

    /**
     * Sets the value of the signalingAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringFactor(JAXBElement<String> value) {
        this.signalingAccessBarringFactor = value;
    }

    /**
     * Gets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSignalingAccessBarringTimeInSec() {
        return signalingAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the signalingAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSignalingAccessBarringTimeInSec(JAXBElement<String> value) {
        this.signalingAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass11Barred() {
        return isSignalingAccessClass11Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass12Barred() {
        return isSignalingAccessClass12Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass13Barred() {
        return isSignalingAccessClass13Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass14Barred() {
        return isSignalingAccessClass14Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isSignalingAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsSignalingAccessClass15Barred() {
        return isSignalingAccessClass15Barred;
    }

    /**
     * Sets the value of the isSignalingAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsSignalingAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isSignalingAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isDataAccessBarred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessBarred() {
        return isDataAccessBarred;
    }

    /**
     * Sets the value of the isDataAccessBarred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessBarred(JAXBElement<Boolean> value) {
        this.isDataAccessBarred = value;
    }

    /**
     * Gets the value of the dataAccessBarringFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringFactor() {
        return dataAccessBarringFactor;
    }

    /**
     * Sets the value of the dataAccessBarringFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringFactor(JAXBElement<String> value) {
        this.dataAccessBarringFactor = value;
    }

    /**
     * Gets the value of the dataAccessBarringTimeInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataAccessBarringTimeInSec() {
        return dataAccessBarringTimeInSec;
    }

    /**
     * Sets the value of the dataAccessBarringTimeInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataAccessBarringTimeInSec(JAXBElement<String> value) {
        this.dataAccessBarringTimeInSec = value;
    }

    /**
     * Gets the value of the isDataAccessClass11Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass11Barred() {
        return isDataAccessClass11Barred;
    }

    /**
     * Sets the value of the isDataAccessClass11Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass11Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass11Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass12Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass12Barred() {
        return isDataAccessClass12Barred;
    }

    /**
     * Sets the value of the isDataAccessClass12Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass12Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass12Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass13Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass13Barred() {
        return isDataAccessClass13Barred;
    }

    /**
     * Sets the value of the isDataAccessClass13Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass13Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass13Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass14Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass14Barred() {
        return isDataAccessClass14Barred;
    }

    /**
     * Sets the value of the isDataAccessClass14Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass14Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass14Barred = value;
    }

    /**
     * Gets the value of the isDataAccessClass15Barred property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDataAccessClass15Barred() {
        return isDataAccessClass15Barred;
    }

    /**
     * Sets the value of the isDataAccessClass15Barred property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDataAccessClass15Barred(JAXBElement<Boolean> value) {
        this.isDataAccessClass15Barred = value;
    }

    /**
     * Gets the value of the isEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the value of the isEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsEnabled(JAXBElement<Boolean> value) {
        this.isEnabled = value;
    }

    /**
     * Gets the value of the csfbCdma2KCellParam property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KCellParams }
     *     
     */
    public CsfbCdma2KCellParams getCsfbCdma2KCellParam() {
        return csfbCdma2KCellParam;
    }

    /**
     * Sets the value of the csfbCdma2KCellParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KCellParams }
     *     
     */
    public void setCsfbCdma2KCellParam(CsfbCdma2KCellParams value) {
        this.csfbCdma2KCellParam = value;
    }

    /**
     * Gets the value of the csfbCdma2KSib8Param property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KSib8Params }
     *     
     */
    public CsfbCdma2KSib8Params getCsfbCdma2KSib8Param() {
        return csfbCdma2KSib8Param;
    }

    /**
     * Sets the value of the csfbCdma2KSib8Param property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KSib8Params }
     *     
     */
    public void setCsfbCdma2KSib8Param(CsfbCdma2KSib8Params value) {
        this.csfbCdma2KSib8Param = value;
    }

    /**
     * Gets the value of the csfbCdma2KMobilityParam property.
     * 
     * @return
     *     possible object is
     *     {@link CsfbCdma2KMobilityParams }
     *     
     */
    public CsfbCdma2KMobilityParams getCsfbCdma2KMobilityParam() {
        return csfbCdma2KMobilityParam;
    }

    /**
     * Sets the value of the csfbCdma2KMobilityParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsfbCdma2KMobilityParams }
     *     
     */
    public void setCsfbCdma2KMobilityParam(CsfbCdma2KMobilityParams value) {
        this.csfbCdma2KMobilityParam = value;
    }

}
