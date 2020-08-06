
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbFaultManagementProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbFaultManagementProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveClockSourceChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="AGpsFileStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="AllMmeS1CCommsStatusChangePerPlmnCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="AutoRsiChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="AutoPciAllocationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulQosBwServerConnectionStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulQosCapacityLimitingStatusCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="BackhaulQosServiceAffectingStatusCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Cell1StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Cell2StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="CellActiveStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="ClockManagerConfigurationStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="ClockSourceAvailabilityChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="ClockSourceConfigurationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="CommandFailedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="DhcpT2TimerStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyCallResetDelayCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="EnabledPortDownCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="ESonServerConnectionChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="EtwsFileUploadCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="EtwsSftpSessionCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="ExtPpsStreamStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="GpsAlarmsStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="GpsCommsChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="GpsLockChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="GpsSnrChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Ikev2SaExpiryCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="IpSecSaExpiryCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="LockoutCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MbsfnSfConfigurationConflictCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MceConnectivityCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MeasuredBwStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MmePlmnOverloadServiceInterruptionChangePerPlmnCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MmePlmnOverloadServiceInterruptionStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="MmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NeighbourAdditionRejectedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NeighbouringCellInNrtCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncClockSourceOperationStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NlSyncProcedureStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NlmFrequencyScanCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeCallTraceStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeConfigStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeCurrentChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeDiskUsageChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeEncryptionLicenceInvalidCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeGpsReceiverStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeInternalClockStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeLocalAccessAttemptCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodePowerChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodePtpGrandMasterStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodePtpQualityStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeResourcesStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeSelfTestCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeShutdownCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeSoftwareVersionStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeSyncLockStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeSynchronizationLockStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeTemperatureChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeVoltageStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="NodeX2NeighbourStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="OperatorCertificateExpiryCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="OutdoorCellStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PasswordChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PasswordResetCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PciConflictStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PciRangeConfigurationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PciUpdateStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PortDisablePreventionCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="PortStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="RetAntennaCriticalErrorCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="RetAntennaFaultCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="RetAntennaTiltOutOfRangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="RfStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Rf1StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Rf2StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Rf3StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="Rf4StatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SasGrantStatusCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SasGrantSuspensionStatusCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SasHeartbeatStatusCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SasRegistrationUpdateCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SasSpectrumInquiryUpdateCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SbaConfigurationStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SGws1UCommsStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SnmpV3FallbackStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SoftwareUpgradeAuthenticationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SwBankInfoChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SystemInformationTruncationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="SystemMonitoringMeasurementStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="TwampOverloadStatusChangedCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="TwampSenderOperationalStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="UeTraceAndMdtStatusChangeCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="WiFiBoardConnectivityCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *         &lt;element name="WiFiBoardInitializationCategory" type="{http://Airspan.Netspan.WebServices}EventCategories" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbFaultManagementProfileParams", propOrder = {
    "activeClockSourceChangeCategory",
    "aGpsFileStatusChangeCategory",
    "allMmeS1CCommsStatusChangePerPlmnCategory",
    "autoRsiChangeCategory",
    "autoPciAllocationCategory",
    "backhaulQosBwServerConnectionStatusChangeCategory",
    "backhaulQosCapacityLimitingStatusCategory",
    "backhaulQosServiceAffectingStatusCategory",
    "cell1StatusChangeCategory",
    "cell2StatusChangeCategory",
    "cellActiveStatusChangeCategory",
    "clockManagerConfigurationStatusChangeCategory",
    "clockSourceAvailabilityChangeCategory",
    "clockSourceConfigurationCategory",
    "commandFailedCategory",
    "dhcpT2TimerStatusChangeCategory",
    "emergencyCallResetDelayCategory",
    "enabledPortDownCategory",
    "eSonServerConnectionChangeCategory",
    "etwsFileUploadCategory",
    "etwsSftpSessionCategory",
    "extPpsStreamStatusChangedCategory",
    "gpsAlarmsStatusChangeCategory",
    "gpsCommsChangeCategory",
    "gpsLockChangeCategory",
    "gpsSnrChangeCategory",
    "ikev2SaExpiryCategory",
    "ipSecSaExpiryCategory",
    "lockoutCategory",
    "mbsfnSfConfigurationConflictCategory",
    "mceConnectivityCategory",
    "measuredBwStatusChangeCategory",
    "mmePlmnOverloadServiceInterruptionChangePerPlmnCategory",
    "mmePlmnOverloadServiceInterruptionStatusChangedCategory",
    "mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory",
    "mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory",
    "neighbourAdditionRejectedCategory",
    "neighbouringCellInNrtCategory",
    "nlSyncClockSourceOperationStatusChangeCategory",
    "nlSyncProcedureStatusChangeCategory",
    "nlmFrequencyScanCategory",
    "nodeCallTraceStatusChangedCategory",
    "nodeConfigStatusChangeCategory",
    "nodeCurrentChangeCategory",
    "nodeDiskUsageChangeCategory",
    "nodeEncryptionLicenceInvalidCategory",
    "nodeGpsReceiverStatusChangeCategory",
    "nodeInternalClockStatusChangeCategory",
    "nodeLocalAccessAttemptCategory",
    "nodePowerChangeCategory",
    "nodePtpGrandMasterStatusChangeCategory",
    "nodePtpQualityStatusChangeCategory",
    "nodeResourcesStatusChangeCategory",
    "nodeSelfTestCategory",
    "nodeShutdownCategory",
    "nodeSoftwareVersionStatusChangeCategory",
    "nodeSyncLockStatusChangeCategory",
    "nodeSynchronizationLockStatusChangeCategory",
    "nodeTemperatureChangeCategory",
    "nodeVoltageStatusChangeCategory",
    "nodeX2NeighbourStatusChangeCategory",
    "operatorCertificateExpiryCategory",
    "outdoorCellStatusChangedCategory",
    "passwordChangeCategory",
    "passwordResetCategory",
    "pciConflictStatusChangedCategory",
    "pciRangeConfigurationCategory",
    "pciUpdateStatusChangeCategory",
    "portDisablePreventionCategory",
    "portStatusChangedCategory",
    "retAntennaCriticalErrorCategory",
    "retAntennaFaultCategory",
    "retAntennaTiltOutOfRangeCategory",
    "rfStatusChangeCategory",
    "rf1StatusChangeCategory",
    "rf2StatusChangeCategory",
    "rf3StatusChangeCategory",
    "rf4StatusChangeCategory",
    "sasGrantStatusCategory",
    "sasGrantSuspensionStatusCategory",
    "sasHeartbeatStatusCategory",
    "sasRegistrationUpdateCategory",
    "sasSpectrumInquiryUpdateCategory",
    "sbaConfigurationStatusChangedCategory",
    "sGws1UCommsStatusChangeCategory",
    "snmpV3FallbackStatusChangedCategory",
    "softwareUpgradeAuthenticationCategory",
    "swBankInfoChangedCategory",
    "systemInformationTruncationCategory",
    "systemMonitoringMeasurementStatusChangeCategory",
    "twampOverloadStatusChangedCategory",
    "twampSenderOperationalStatusChangeCategory",
    "ueTraceAndMdtStatusChangeCategory",
    "wiFiBoardConnectivityCategory",
    "wiFiBoardInitializationCategory"
})
@XmlSeeAlso({
    EnbFaultManagementProfile.class
})
public class EnbFaultManagementProfileParams {

    @XmlElementRef(name = "ActiveClockSourceChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> activeClockSourceChangeCategory;
    @XmlElementRef(name = "AGpsFileStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> aGpsFileStatusChangeCategory;
    @XmlElementRef(name = "AllMmeS1CCommsStatusChangePerPlmnCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> allMmeS1CCommsStatusChangePerPlmnCategory;
    @XmlElementRef(name = "AutoRsiChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> autoRsiChangeCategory;
    @XmlElementRef(name = "AutoPciAllocationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> autoPciAllocationCategory;
    @XmlElementRef(name = "BackhaulQosBwServerConnectionStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> backhaulQosBwServerConnectionStatusChangeCategory;
    @XmlElementRef(name = "BackhaulQosCapacityLimitingStatusCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> backhaulQosCapacityLimitingStatusCategory;
    @XmlElementRef(name = "BackhaulQosServiceAffectingStatusCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> backhaulQosServiceAffectingStatusCategory;
    @XmlElementRef(name = "Cell1StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> cell1StatusChangeCategory;
    @XmlElementRef(name = "Cell2StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> cell2StatusChangeCategory;
    @XmlElementRef(name = "CellActiveStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> cellActiveStatusChangeCategory;
    @XmlElementRef(name = "ClockManagerConfigurationStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> clockManagerConfigurationStatusChangeCategory;
    @XmlElementRef(name = "ClockSourceAvailabilityChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> clockSourceAvailabilityChangeCategory;
    @XmlElementRef(name = "ClockSourceConfigurationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> clockSourceConfigurationCategory;
    @XmlElementRef(name = "CommandFailedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> commandFailedCategory;
    @XmlElementRef(name = "DhcpT2TimerStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> dhcpT2TimerStatusChangeCategory;
    @XmlElementRef(name = "EmergencyCallResetDelayCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> emergencyCallResetDelayCategory;
    @XmlElementRef(name = "EnabledPortDownCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> enabledPortDownCategory;
    @XmlElementRef(name = "ESonServerConnectionChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> eSonServerConnectionChangeCategory;
    @XmlElementRef(name = "EtwsFileUploadCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> etwsFileUploadCategory;
    @XmlElementRef(name = "EtwsSftpSessionCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> etwsSftpSessionCategory;
    @XmlElementRef(name = "ExtPpsStreamStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> extPpsStreamStatusChangedCategory;
    @XmlElementRef(name = "GpsAlarmsStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> gpsAlarmsStatusChangeCategory;
    @XmlElementRef(name = "GpsCommsChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> gpsCommsChangeCategory;
    @XmlElementRef(name = "GpsLockChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> gpsLockChangeCategory;
    @XmlElementRef(name = "GpsSnrChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> gpsSnrChangeCategory;
    @XmlElementRef(name = "Ikev2SaExpiryCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> ikev2SaExpiryCategory;
    @XmlElementRef(name = "IpSecSaExpiryCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> ipSecSaExpiryCategory;
    @XmlElementRef(name = "LockoutCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> lockoutCategory;
    @XmlElementRef(name = "MbsfnSfConfigurationConflictCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mbsfnSfConfigurationConflictCategory;
    @XmlElementRef(name = "MceConnectivityCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mceConnectivityCategory;
    @XmlElementRef(name = "MeasuredBwStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> measuredBwStatusChangeCategory;
    @XmlElementRef(name = "MmePlmnOverloadServiceInterruptionChangePerPlmnCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mmePlmnOverloadServiceInterruptionChangePerPlmnCategory;
    @XmlElementRef(name = "MmePlmnOverloadServiceInterruptionStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mmePlmnOverloadServiceInterruptionStatusChangedCategory;
    @XmlElementRef(name = "MmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory;
    @XmlElementRef(name = "MmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory;
    @XmlElementRef(name = "NeighbourAdditionRejectedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> neighbourAdditionRejectedCategory;
    @XmlElementRef(name = "NeighbouringCellInNrtCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> neighbouringCellInNrtCategory;
    @XmlElementRef(name = "NlSyncClockSourceOperationStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nlSyncClockSourceOperationStatusChangeCategory;
    @XmlElementRef(name = "NlSyncProcedureStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nlSyncProcedureStatusChangeCategory;
    @XmlElementRef(name = "NlmFrequencyScanCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nlmFrequencyScanCategory;
    @XmlElementRef(name = "NodeCallTraceStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeCallTraceStatusChangedCategory;
    @XmlElementRef(name = "NodeConfigStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeConfigStatusChangeCategory;
    @XmlElementRef(name = "NodeCurrentChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeCurrentChangeCategory;
    @XmlElementRef(name = "NodeDiskUsageChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeDiskUsageChangeCategory;
    @XmlElementRef(name = "NodeEncryptionLicenceInvalidCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeEncryptionLicenceInvalidCategory;
    @XmlElementRef(name = "NodeGpsReceiverStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeGpsReceiverStatusChangeCategory;
    @XmlElementRef(name = "NodeInternalClockStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeInternalClockStatusChangeCategory;
    @XmlElementRef(name = "NodeLocalAccessAttemptCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeLocalAccessAttemptCategory;
    @XmlElementRef(name = "NodePowerChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodePowerChangeCategory;
    @XmlElementRef(name = "NodePtpGrandMasterStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodePtpGrandMasterStatusChangeCategory;
    @XmlElementRef(name = "NodePtpQualityStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodePtpQualityStatusChangeCategory;
    @XmlElementRef(name = "NodeResourcesStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeResourcesStatusChangeCategory;
    @XmlElementRef(name = "NodeSelfTestCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeSelfTestCategory;
    @XmlElementRef(name = "NodeShutdownCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeShutdownCategory;
    @XmlElementRef(name = "NodeSoftwareVersionStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeSoftwareVersionStatusChangeCategory;
    @XmlElementRef(name = "NodeSyncLockStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeSyncLockStatusChangeCategory;
    @XmlElementRef(name = "NodeSynchronizationLockStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeSynchronizationLockStatusChangeCategory;
    @XmlElementRef(name = "NodeTemperatureChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeTemperatureChangeCategory;
    @XmlElementRef(name = "NodeVoltageStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeVoltageStatusChangeCategory;
    @XmlElementRef(name = "NodeX2NeighbourStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> nodeX2NeighbourStatusChangeCategory;
    @XmlElementRef(name = "OperatorCertificateExpiryCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> operatorCertificateExpiryCategory;
    @XmlElementRef(name = "OutdoorCellStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> outdoorCellStatusChangedCategory;
    @XmlElementRef(name = "PasswordChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> passwordChangeCategory;
    @XmlElementRef(name = "PasswordResetCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> passwordResetCategory;
    @XmlElementRef(name = "PciConflictStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> pciConflictStatusChangedCategory;
    @XmlElementRef(name = "PciRangeConfigurationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> pciRangeConfigurationCategory;
    @XmlElementRef(name = "PciUpdateStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> pciUpdateStatusChangeCategory;
    @XmlElementRef(name = "PortDisablePreventionCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> portDisablePreventionCategory;
    @XmlElementRef(name = "PortStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> portStatusChangedCategory;
    @XmlElementRef(name = "RetAntennaCriticalErrorCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> retAntennaCriticalErrorCategory;
    @XmlElementRef(name = "RetAntennaFaultCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> retAntennaFaultCategory;
    @XmlElementRef(name = "RetAntennaTiltOutOfRangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> retAntennaTiltOutOfRangeCategory;
    @XmlElementRef(name = "RfStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> rfStatusChangeCategory;
    @XmlElementRef(name = "Rf1StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> rf1StatusChangeCategory;
    @XmlElementRef(name = "Rf2StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> rf2StatusChangeCategory;
    @XmlElementRef(name = "Rf3StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> rf3StatusChangeCategory;
    @XmlElementRef(name = "Rf4StatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> rf4StatusChangeCategory;
    @XmlElementRef(name = "SasGrantStatusCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sasGrantStatusCategory;
    @XmlElementRef(name = "SasGrantSuspensionStatusCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sasGrantSuspensionStatusCategory;
    @XmlElementRef(name = "SasHeartbeatStatusCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sasHeartbeatStatusCategory;
    @XmlElementRef(name = "SasRegistrationUpdateCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sasRegistrationUpdateCategory;
    @XmlElementRef(name = "SasSpectrumInquiryUpdateCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sasSpectrumInquiryUpdateCategory;
    @XmlElementRef(name = "SbaConfigurationStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sbaConfigurationStatusChangedCategory;
    @XmlElementRef(name = "SGws1UCommsStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> sGws1UCommsStatusChangeCategory;
    @XmlElementRef(name = "SnmpV3FallbackStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> snmpV3FallbackStatusChangedCategory;
    @XmlElementRef(name = "SoftwareUpgradeAuthenticationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> softwareUpgradeAuthenticationCategory;
    @XmlElementRef(name = "SwBankInfoChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> swBankInfoChangedCategory;
    @XmlElementRef(name = "SystemInformationTruncationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> systemInformationTruncationCategory;
    @XmlElementRef(name = "SystemMonitoringMeasurementStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> systemMonitoringMeasurementStatusChangeCategory;
    @XmlElementRef(name = "TwampOverloadStatusChangedCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> twampOverloadStatusChangedCategory;
    @XmlElementRef(name = "TwampSenderOperationalStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> twampSenderOperationalStatusChangeCategory;
    @XmlElementRef(name = "UeTraceAndMdtStatusChangeCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> ueTraceAndMdtStatusChangeCategory;
    @XmlElementRef(name = "WiFiBoardConnectivityCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> wiFiBoardConnectivityCategory;
    @XmlElementRef(name = "WiFiBoardInitializationCategory", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EventCategories> wiFiBoardInitializationCategory;

    /**
     * Gets the value of the activeClockSourceChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getActiveClockSourceChangeCategory() {
        return activeClockSourceChangeCategory;
    }

    /**
     * Sets the value of the activeClockSourceChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setActiveClockSourceChangeCategory(JAXBElement<EventCategories> value) {
        this.activeClockSourceChangeCategory = value;
    }

    /**
     * Gets the value of the aGpsFileStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getAGpsFileStatusChangeCategory() {
        return aGpsFileStatusChangeCategory;
    }

    /**
     * Sets the value of the aGpsFileStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setAGpsFileStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.aGpsFileStatusChangeCategory = value;
    }

    /**
     * Gets the value of the allMmeS1CCommsStatusChangePerPlmnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getAllMmeS1CCommsStatusChangePerPlmnCategory() {
        return allMmeS1CCommsStatusChangePerPlmnCategory;
    }

    /**
     * Sets the value of the allMmeS1CCommsStatusChangePerPlmnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setAllMmeS1CCommsStatusChangePerPlmnCategory(JAXBElement<EventCategories> value) {
        this.allMmeS1CCommsStatusChangePerPlmnCategory = value;
    }

    /**
     * Gets the value of the autoRsiChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getAutoRsiChangeCategory() {
        return autoRsiChangeCategory;
    }

    /**
     * Sets the value of the autoRsiChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setAutoRsiChangeCategory(JAXBElement<EventCategories> value) {
        this.autoRsiChangeCategory = value;
    }

    /**
     * Gets the value of the autoPciAllocationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getAutoPciAllocationCategory() {
        return autoPciAllocationCategory;
    }

    /**
     * Sets the value of the autoPciAllocationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setAutoPciAllocationCategory(JAXBElement<EventCategories> value) {
        this.autoPciAllocationCategory = value;
    }

    /**
     * Gets the value of the backhaulQosBwServerConnectionStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getBackhaulQosBwServerConnectionStatusChangeCategory() {
        return backhaulQosBwServerConnectionStatusChangeCategory;
    }

    /**
     * Sets the value of the backhaulQosBwServerConnectionStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setBackhaulQosBwServerConnectionStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.backhaulQosBwServerConnectionStatusChangeCategory = value;
    }

    /**
     * Gets the value of the backhaulQosCapacityLimitingStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getBackhaulQosCapacityLimitingStatusCategory() {
        return backhaulQosCapacityLimitingStatusCategory;
    }

    /**
     * Sets the value of the backhaulQosCapacityLimitingStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setBackhaulQosCapacityLimitingStatusCategory(JAXBElement<EventCategories> value) {
        this.backhaulQosCapacityLimitingStatusCategory = value;
    }

    /**
     * Gets the value of the backhaulQosServiceAffectingStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getBackhaulQosServiceAffectingStatusCategory() {
        return backhaulQosServiceAffectingStatusCategory;
    }

    /**
     * Sets the value of the backhaulQosServiceAffectingStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setBackhaulQosServiceAffectingStatusCategory(JAXBElement<EventCategories> value) {
        this.backhaulQosServiceAffectingStatusCategory = value;
    }

    /**
     * Gets the value of the cell1StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getCell1StatusChangeCategory() {
        return cell1StatusChangeCategory;
    }

    /**
     * Sets the value of the cell1StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setCell1StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.cell1StatusChangeCategory = value;
    }

    /**
     * Gets the value of the cell2StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getCell2StatusChangeCategory() {
        return cell2StatusChangeCategory;
    }

    /**
     * Sets the value of the cell2StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setCell2StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.cell2StatusChangeCategory = value;
    }

    /**
     * Gets the value of the cellActiveStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getCellActiveStatusChangeCategory() {
        return cellActiveStatusChangeCategory;
    }

    /**
     * Sets the value of the cellActiveStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setCellActiveStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.cellActiveStatusChangeCategory = value;
    }

    /**
     * Gets the value of the clockManagerConfigurationStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getClockManagerConfigurationStatusChangeCategory() {
        return clockManagerConfigurationStatusChangeCategory;
    }

    /**
     * Sets the value of the clockManagerConfigurationStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setClockManagerConfigurationStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.clockManagerConfigurationStatusChangeCategory = value;
    }

    /**
     * Gets the value of the clockSourceAvailabilityChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getClockSourceAvailabilityChangeCategory() {
        return clockSourceAvailabilityChangeCategory;
    }

    /**
     * Sets the value of the clockSourceAvailabilityChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setClockSourceAvailabilityChangeCategory(JAXBElement<EventCategories> value) {
        this.clockSourceAvailabilityChangeCategory = value;
    }

    /**
     * Gets the value of the clockSourceConfigurationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getClockSourceConfigurationCategory() {
        return clockSourceConfigurationCategory;
    }

    /**
     * Sets the value of the clockSourceConfigurationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setClockSourceConfigurationCategory(JAXBElement<EventCategories> value) {
        this.clockSourceConfigurationCategory = value;
    }

    /**
     * Gets the value of the commandFailedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getCommandFailedCategory() {
        return commandFailedCategory;
    }

    /**
     * Sets the value of the commandFailedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setCommandFailedCategory(JAXBElement<EventCategories> value) {
        this.commandFailedCategory = value;
    }

    /**
     * Gets the value of the dhcpT2TimerStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getDhcpT2TimerStatusChangeCategory() {
        return dhcpT2TimerStatusChangeCategory;
    }

    /**
     * Sets the value of the dhcpT2TimerStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setDhcpT2TimerStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.dhcpT2TimerStatusChangeCategory = value;
    }

    /**
     * Gets the value of the emergencyCallResetDelayCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getEmergencyCallResetDelayCategory() {
        return emergencyCallResetDelayCategory;
    }

    /**
     * Sets the value of the emergencyCallResetDelayCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setEmergencyCallResetDelayCategory(JAXBElement<EventCategories> value) {
        this.emergencyCallResetDelayCategory = value;
    }

    /**
     * Gets the value of the enabledPortDownCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getEnabledPortDownCategory() {
        return enabledPortDownCategory;
    }

    /**
     * Sets the value of the enabledPortDownCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setEnabledPortDownCategory(JAXBElement<EventCategories> value) {
        this.enabledPortDownCategory = value;
    }

    /**
     * Gets the value of the eSonServerConnectionChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getESonServerConnectionChangeCategory() {
        return eSonServerConnectionChangeCategory;
    }

    /**
     * Sets the value of the eSonServerConnectionChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setESonServerConnectionChangeCategory(JAXBElement<EventCategories> value) {
        this.eSonServerConnectionChangeCategory = value;
    }

    /**
     * Gets the value of the etwsFileUploadCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getEtwsFileUploadCategory() {
        return etwsFileUploadCategory;
    }

    /**
     * Sets the value of the etwsFileUploadCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setEtwsFileUploadCategory(JAXBElement<EventCategories> value) {
        this.etwsFileUploadCategory = value;
    }

    /**
     * Gets the value of the etwsSftpSessionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getEtwsSftpSessionCategory() {
        return etwsSftpSessionCategory;
    }

    /**
     * Sets the value of the etwsSftpSessionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setEtwsSftpSessionCategory(JAXBElement<EventCategories> value) {
        this.etwsSftpSessionCategory = value;
    }

    /**
     * Gets the value of the extPpsStreamStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getExtPpsStreamStatusChangedCategory() {
        return extPpsStreamStatusChangedCategory;
    }

    /**
     * Sets the value of the extPpsStreamStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setExtPpsStreamStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.extPpsStreamStatusChangedCategory = value;
    }

    /**
     * Gets the value of the gpsAlarmsStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getGpsAlarmsStatusChangeCategory() {
        return gpsAlarmsStatusChangeCategory;
    }

    /**
     * Sets the value of the gpsAlarmsStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setGpsAlarmsStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.gpsAlarmsStatusChangeCategory = value;
    }

    /**
     * Gets the value of the gpsCommsChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getGpsCommsChangeCategory() {
        return gpsCommsChangeCategory;
    }

    /**
     * Sets the value of the gpsCommsChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setGpsCommsChangeCategory(JAXBElement<EventCategories> value) {
        this.gpsCommsChangeCategory = value;
    }

    /**
     * Gets the value of the gpsLockChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getGpsLockChangeCategory() {
        return gpsLockChangeCategory;
    }

    /**
     * Sets the value of the gpsLockChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setGpsLockChangeCategory(JAXBElement<EventCategories> value) {
        this.gpsLockChangeCategory = value;
    }

    /**
     * Gets the value of the gpsSnrChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getGpsSnrChangeCategory() {
        return gpsSnrChangeCategory;
    }

    /**
     * Sets the value of the gpsSnrChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setGpsSnrChangeCategory(JAXBElement<EventCategories> value) {
        this.gpsSnrChangeCategory = value;
    }

    /**
     * Gets the value of the ikev2SaExpiryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getIkev2SaExpiryCategory() {
        return ikev2SaExpiryCategory;
    }

    /**
     * Sets the value of the ikev2SaExpiryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setIkev2SaExpiryCategory(JAXBElement<EventCategories> value) {
        this.ikev2SaExpiryCategory = value;
    }

    /**
     * Gets the value of the ipSecSaExpiryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getIpSecSaExpiryCategory() {
        return ipSecSaExpiryCategory;
    }

    /**
     * Sets the value of the ipSecSaExpiryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setIpSecSaExpiryCategory(JAXBElement<EventCategories> value) {
        this.ipSecSaExpiryCategory = value;
    }

    /**
     * Gets the value of the lockoutCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getLockoutCategory() {
        return lockoutCategory;
    }

    /**
     * Sets the value of the lockoutCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setLockoutCategory(JAXBElement<EventCategories> value) {
        this.lockoutCategory = value;
    }

    /**
     * Gets the value of the mbsfnSfConfigurationConflictCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMbsfnSfConfigurationConflictCategory() {
        return mbsfnSfConfigurationConflictCategory;
    }

    /**
     * Sets the value of the mbsfnSfConfigurationConflictCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMbsfnSfConfigurationConflictCategory(JAXBElement<EventCategories> value) {
        this.mbsfnSfConfigurationConflictCategory = value;
    }

    /**
     * Gets the value of the mceConnectivityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMceConnectivityCategory() {
        return mceConnectivityCategory;
    }

    /**
     * Sets the value of the mceConnectivityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMceConnectivityCategory(JAXBElement<EventCategories> value) {
        this.mceConnectivityCategory = value;
    }

    /**
     * Gets the value of the measuredBwStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMeasuredBwStatusChangeCategory() {
        return measuredBwStatusChangeCategory;
    }

    /**
     * Sets the value of the measuredBwStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMeasuredBwStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.measuredBwStatusChangeCategory = value;
    }

    /**
     * Gets the value of the mmePlmnOverloadServiceInterruptionChangePerPlmnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMmePlmnOverloadServiceInterruptionChangePerPlmnCategory() {
        return mmePlmnOverloadServiceInterruptionChangePerPlmnCategory;
    }

    /**
     * Sets the value of the mmePlmnOverloadServiceInterruptionChangePerPlmnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMmePlmnOverloadServiceInterruptionChangePerPlmnCategory(JAXBElement<EventCategories> value) {
        this.mmePlmnOverloadServiceInterruptionChangePerPlmnCategory = value;
    }

    /**
     * Gets the value of the mmePlmnOverloadServiceInterruptionStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMmePlmnOverloadServiceInterruptionStatusChangedCategory() {
        return mmePlmnOverloadServiceInterruptionStatusChangedCategory;
    }

    /**
     * Sets the value of the mmePlmnOverloadServiceInterruptionStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMmePlmnOverloadServiceInterruptionStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.mmePlmnOverloadServiceInterruptionStatusChangedCategory = value;
    }

    /**
     * Gets the value of the mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory() {
        return mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory;
    }

    /**
     * Sets the value of the mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory(JAXBElement<EventCategories> value) {
        this.mmePlmnOverloadWithoutServiceInterruptionChangePerPlmnCategory = value;
    }

    /**
     * Gets the value of the mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getMmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory() {
        return mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory;
    }

    /**
     * Sets the value of the mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setMmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.mmePlmnOverloadWithoutServiceInterruptionStatusChangedCategory = value;
    }

    /**
     * Gets the value of the neighbourAdditionRejectedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNeighbourAdditionRejectedCategory() {
        return neighbourAdditionRejectedCategory;
    }

    /**
     * Sets the value of the neighbourAdditionRejectedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNeighbourAdditionRejectedCategory(JAXBElement<EventCategories> value) {
        this.neighbourAdditionRejectedCategory = value;
    }

    /**
     * Gets the value of the neighbouringCellInNrtCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNeighbouringCellInNrtCategory() {
        return neighbouringCellInNrtCategory;
    }

    /**
     * Sets the value of the neighbouringCellInNrtCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNeighbouringCellInNrtCategory(JAXBElement<EventCategories> value) {
        this.neighbouringCellInNrtCategory = value;
    }

    /**
     * Gets the value of the nlSyncClockSourceOperationStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNlSyncClockSourceOperationStatusChangeCategory() {
        return nlSyncClockSourceOperationStatusChangeCategory;
    }

    /**
     * Sets the value of the nlSyncClockSourceOperationStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNlSyncClockSourceOperationStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nlSyncClockSourceOperationStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nlSyncProcedureStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNlSyncProcedureStatusChangeCategory() {
        return nlSyncProcedureStatusChangeCategory;
    }

    /**
     * Sets the value of the nlSyncProcedureStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNlSyncProcedureStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nlSyncProcedureStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nlmFrequencyScanCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNlmFrequencyScanCategory() {
        return nlmFrequencyScanCategory;
    }

    /**
     * Sets the value of the nlmFrequencyScanCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNlmFrequencyScanCategory(JAXBElement<EventCategories> value) {
        this.nlmFrequencyScanCategory = value;
    }

    /**
     * Gets the value of the nodeCallTraceStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeCallTraceStatusChangedCategory() {
        return nodeCallTraceStatusChangedCategory;
    }

    /**
     * Sets the value of the nodeCallTraceStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeCallTraceStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.nodeCallTraceStatusChangedCategory = value;
    }

    /**
     * Gets the value of the nodeConfigStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeConfigStatusChangeCategory() {
        return nodeConfigStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeConfigStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeConfigStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeConfigStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeCurrentChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeCurrentChangeCategory() {
        return nodeCurrentChangeCategory;
    }

    /**
     * Sets the value of the nodeCurrentChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeCurrentChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeCurrentChangeCategory = value;
    }

    /**
     * Gets the value of the nodeDiskUsageChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeDiskUsageChangeCategory() {
        return nodeDiskUsageChangeCategory;
    }

    /**
     * Sets the value of the nodeDiskUsageChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeDiskUsageChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeDiskUsageChangeCategory = value;
    }

    /**
     * Gets the value of the nodeEncryptionLicenceInvalidCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeEncryptionLicenceInvalidCategory() {
        return nodeEncryptionLicenceInvalidCategory;
    }

    /**
     * Sets the value of the nodeEncryptionLicenceInvalidCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeEncryptionLicenceInvalidCategory(JAXBElement<EventCategories> value) {
        this.nodeEncryptionLicenceInvalidCategory = value;
    }

    /**
     * Gets the value of the nodeGpsReceiverStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeGpsReceiverStatusChangeCategory() {
        return nodeGpsReceiverStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeGpsReceiverStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeGpsReceiverStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeGpsReceiverStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeInternalClockStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeInternalClockStatusChangeCategory() {
        return nodeInternalClockStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeInternalClockStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeInternalClockStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeInternalClockStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeLocalAccessAttemptCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeLocalAccessAttemptCategory() {
        return nodeLocalAccessAttemptCategory;
    }

    /**
     * Sets the value of the nodeLocalAccessAttemptCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeLocalAccessAttemptCategory(JAXBElement<EventCategories> value) {
        this.nodeLocalAccessAttemptCategory = value;
    }

    /**
     * Gets the value of the nodePowerChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodePowerChangeCategory() {
        return nodePowerChangeCategory;
    }

    /**
     * Sets the value of the nodePowerChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodePowerChangeCategory(JAXBElement<EventCategories> value) {
        this.nodePowerChangeCategory = value;
    }

    /**
     * Gets the value of the nodePtpGrandMasterStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodePtpGrandMasterStatusChangeCategory() {
        return nodePtpGrandMasterStatusChangeCategory;
    }

    /**
     * Sets the value of the nodePtpGrandMasterStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodePtpGrandMasterStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodePtpGrandMasterStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodePtpQualityStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodePtpQualityStatusChangeCategory() {
        return nodePtpQualityStatusChangeCategory;
    }

    /**
     * Sets the value of the nodePtpQualityStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodePtpQualityStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodePtpQualityStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeResourcesStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeResourcesStatusChangeCategory() {
        return nodeResourcesStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeResourcesStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeResourcesStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeResourcesStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeSelfTestCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeSelfTestCategory() {
        return nodeSelfTestCategory;
    }

    /**
     * Sets the value of the nodeSelfTestCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeSelfTestCategory(JAXBElement<EventCategories> value) {
        this.nodeSelfTestCategory = value;
    }

    /**
     * Gets the value of the nodeShutdownCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeShutdownCategory() {
        return nodeShutdownCategory;
    }

    /**
     * Sets the value of the nodeShutdownCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeShutdownCategory(JAXBElement<EventCategories> value) {
        this.nodeShutdownCategory = value;
    }

    /**
     * Gets the value of the nodeSoftwareVersionStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeSoftwareVersionStatusChangeCategory() {
        return nodeSoftwareVersionStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeSoftwareVersionStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeSoftwareVersionStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeSoftwareVersionStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeSyncLockStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeSyncLockStatusChangeCategory() {
        return nodeSyncLockStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeSyncLockStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeSyncLockStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeSyncLockStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeSynchronizationLockStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeSynchronizationLockStatusChangeCategory() {
        return nodeSynchronizationLockStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeSynchronizationLockStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeSynchronizationLockStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeSynchronizationLockStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeTemperatureChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeTemperatureChangeCategory() {
        return nodeTemperatureChangeCategory;
    }

    /**
     * Sets the value of the nodeTemperatureChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeTemperatureChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeTemperatureChangeCategory = value;
    }

    /**
     * Gets the value of the nodeVoltageStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeVoltageStatusChangeCategory() {
        return nodeVoltageStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeVoltageStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeVoltageStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeVoltageStatusChangeCategory = value;
    }

    /**
     * Gets the value of the nodeX2NeighbourStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getNodeX2NeighbourStatusChangeCategory() {
        return nodeX2NeighbourStatusChangeCategory;
    }

    /**
     * Sets the value of the nodeX2NeighbourStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setNodeX2NeighbourStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.nodeX2NeighbourStatusChangeCategory = value;
    }

    /**
     * Gets the value of the operatorCertificateExpiryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getOperatorCertificateExpiryCategory() {
        return operatorCertificateExpiryCategory;
    }

    /**
     * Sets the value of the operatorCertificateExpiryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setOperatorCertificateExpiryCategory(JAXBElement<EventCategories> value) {
        this.operatorCertificateExpiryCategory = value;
    }

    /**
     * Gets the value of the outdoorCellStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getOutdoorCellStatusChangedCategory() {
        return outdoorCellStatusChangedCategory;
    }

    /**
     * Sets the value of the outdoorCellStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setOutdoorCellStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.outdoorCellStatusChangedCategory = value;
    }

    /**
     * Gets the value of the passwordChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPasswordChangeCategory() {
        return passwordChangeCategory;
    }

    /**
     * Sets the value of the passwordChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPasswordChangeCategory(JAXBElement<EventCategories> value) {
        this.passwordChangeCategory = value;
    }

    /**
     * Gets the value of the passwordResetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPasswordResetCategory() {
        return passwordResetCategory;
    }

    /**
     * Sets the value of the passwordResetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPasswordResetCategory(JAXBElement<EventCategories> value) {
        this.passwordResetCategory = value;
    }

    /**
     * Gets the value of the pciConflictStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPciConflictStatusChangedCategory() {
        return pciConflictStatusChangedCategory;
    }

    /**
     * Sets the value of the pciConflictStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPciConflictStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.pciConflictStatusChangedCategory = value;
    }

    /**
     * Gets the value of the pciRangeConfigurationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPciRangeConfigurationCategory() {
        return pciRangeConfigurationCategory;
    }

    /**
     * Sets the value of the pciRangeConfigurationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPciRangeConfigurationCategory(JAXBElement<EventCategories> value) {
        this.pciRangeConfigurationCategory = value;
    }

    /**
     * Gets the value of the pciUpdateStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPciUpdateStatusChangeCategory() {
        return pciUpdateStatusChangeCategory;
    }

    /**
     * Sets the value of the pciUpdateStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPciUpdateStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.pciUpdateStatusChangeCategory = value;
    }

    /**
     * Gets the value of the portDisablePreventionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPortDisablePreventionCategory() {
        return portDisablePreventionCategory;
    }

    /**
     * Sets the value of the portDisablePreventionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPortDisablePreventionCategory(JAXBElement<EventCategories> value) {
        this.portDisablePreventionCategory = value;
    }

    /**
     * Gets the value of the portStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getPortStatusChangedCategory() {
        return portStatusChangedCategory;
    }

    /**
     * Sets the value of the portStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setPortStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.portStatusChangedCategory = value;
    }

    /**
     * Gets the value of the retAntennaCriticalErrorCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRetAntennaCriticalErrorCategory() {
        return retAntennaCriticalErrorCategory;
    }

    /**
     * Sets the value of the retAntennaCriticalErrorCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRetAntennaCriticalErrorCategory(JAXBElement<EventCategories> value) {
        this.retAntennaCriticalErrorCategory = value;
    }

    /**
     * Gets the value of the retAntennaFaultCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRetAntennaFaultCategory() {
        return retAntennaFaultCategory;
    }

    /**
     * Sets the value of the retAntennaFaultCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRetAntennaFaultCategory(JAXBElement<EventCategories> value) {
        this.retAntennaFaultCategory = value;
    }

    /**
     * Gets the value of the retAntennaTiltOutOfRangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRetAntennaTiltOutOfRangeCategory() {
        return retAntennaTiltOutOfRangeCategory;
    }

    /**
     * Sets the value of the retAntennaTiltOutOfRangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRetAntennaTiltOutOfRangeCategory(JAXBElement<EventCategories> value) {
        this.retAntennaTiltOutOfRangeCategory = value;
    }

    /**
     * Gets the value of the rfStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRfStatusChangeCategory() {
        return rfStatusChangeCategory;
    }

    /**
     * Sets the value of the rfStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRfStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.rfStatusChangeCategory = value;
    }

    /**
     * Gets the value of the rf1StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRf1StatusChangeCategory() {
        return rf1StatusChangeCategory;
    }

    /**
     * Sets the value of the rf1StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRf1StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.rf1StatusChangeCategory = value;
    }

    /**
     * Gets the value of the rf2StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRf2StatusChangeCategory() {
        return rf2StatusChangeCategory;
    }

    /**
     * Sets the value of the rf2StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRf2StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.rf2StatusChangeCategory = value;
    }

    /**
     * Gets the value of the rf3StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRf3StatusChangeCategory() {
        return rf3StatusChangeCategory;
    }

    /**
     * Sets the value of the rf3StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRf3StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.rf3StatusChangeCategory = value;
    }

    /**
     * Gets the value of the rf4StatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getRf4StatusChangeCategory() {
        return rf4StatusChangeCategory;
    }

    /**
     * Sets the value of the rf4StatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setRf4StatusChangeCategory(JAXBElement<EventCategories> value) {
        this.rf4StatusChangeCategory = value;
    }

    /**
     * Gets the value of the sasGrantStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSasGrantStatusCategory() {
        return sasGrantStatusCategory;
    }

    /**
     * Sets the value of the sasGrantStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSasGrantStatusCategory(JAXBElement<EventCategories> value) {
        this.sasGrantStatusCategory = value;
    }

    /**
     * Gets the value of the sasGrantSuspensionStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSasGrantSuspensionStatusCategory() {
        return sasGrantSuspensionStatusCategory;
    }

    /**
     * Sets the value of the sasGrantSuspensionStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSasGrantSuspensionStatusCategory(JAXBElement<EventCategories> value) {
        this.sasGrantSuspensionStatusCategory = value;
    }

    /**
     * Gets the value of the sasHeartbeatStatusCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSasHeartbeatStatusCategory() {
        return sasHeartbeatStatusCategory;
    }

    /**
     * Sets the value of the sasHeartbeatStatusCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSasHeartbeatStatusCategory(JAXBElement<EventCategories> value) {
        this.sasHeartbeatStatusCategory = value;
    }

    /**
     * Gets the value of the sasRegistrationUpdateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSasRegistrationUpdateCategory() {
        return sasRegistrationUpdateCategory;
    }

    /**
     * Sets the value of the sasRegistrationUpdateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSasRegistrationUpdateCategory(JAXBElement<EventCategories> value) {
        this.sasRegistrationUpdateCategory = value;
    }

    /**
     * Gets the value of the sasSpectrumInquiryUpdateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSasSpectrumInquiryUpdateCategory() {
        return sasSpectrumInquiryUpdateCategory;
    }

    /**
     * Sets the value of the sasSpectrumInquiryUpdateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSasSpectrumInquiryUpdateCategory(JAXBElement<EventCategories> value) {
        this.sasSpectrumInquiryUpdateCategory = value;
    }

    /**
     * Gets the value of the sbaConfigurationStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSbaConfigurationStatusChangedCategory() {
        return sbaConfigurationStatusChangedCategory;
    }

    /**
     * Sets the value of the sbaConfigurationStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSbaConfigurationStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.sbaConfigurationStatusChangedCategory = value;
    }

    /**
     * Gets the value of the sGws1UCommsStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSGws1UCommsStatusChangeCategory() {
        return sGws1UCommsStatusChangeCategory;
    }

    /**
     * Sets the value of the sGws1UCommsStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSGws1UCommsStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.sGws1UCommsStatusChangeCategory = value;
    }

    /**
     * Gets the value of the snmpV3FallbackStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSnmpV3FallbackStatusChangedCategory() {
        return snmpV3FallbackStatusChangedCategory;
    }

    /**
     * Sets the value of the snmpV3FallbackStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSnmpV3FallbackStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.snmpV3FallbackStatusChangedCategory = value;
    }

    /**
     * Gets the value of the softwareUpgradeAuthenticationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSoftwareUpgradeAuthenticationCategory() {
        return softwareUpgradeAuthenticationCategory;
    }

    /**
     * Sets the value of the softwareUpgradeAuthenticationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSoftwareUpgradeAuthenticationCategory(JAXBElement<EventCategories> value) {
        this.softwareUpgradeAuthenticationCategory = value;
    }

    /**
     * Gets the value of the swBankInfoChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSwBankInfoChangedCategory() {
        return swBankInfoChangedCategory;
    }

    /**
     * Sets the value of the swBankInfoChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSwBankInfoChangedCategory(JAXBElement<EventCategories> value) {
        this.swBankInfoChangedCategory = value;
    }

    /**
     * Gets the value of the systemInformationTruncationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSystemInformationTruncationCategory() {
        return systemInformationTruncationCategory;
    }

    /**
     * Sets the value of the systemInformationTruncationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSystemInformationTruncationCategory(JAXBElement<EventCategories> value) {
        this.systemInformationTruncationCategory = value;
    }

    /**
     * Gets the value of the systemMonitoringMeasurementStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getSystemMonitoringMeasurementStatusChangeCategory() {
        return systemMonitoringMeasurementStatusChangeCategory;
    }

    /**
     * Sets the value of the systemMonitoringMeasurementStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setSystemMonitoringMeasurementStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.systemMonitoringMeasurementStatusChangeCategory = value;
    }

    /**
     * Gets the value of the twampOverloadStatusChangedCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getTwampOverloadStatusChangedCategory() {
        return twampOverloadStatusChangedCategory;
    }

    /**
     * Sets the value of the twampOverloadStatusChangedCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setTwampOverloadStatusChangedCategory(JAXBElement<EventCategories> value) {
        this.twampOverloadStatusChangedCategory = value;
    }

    /**
     * Gets the value of the twampSenderOperationalStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getTwampSenderOperationalStatusChangeCategory() {
        return twampSenderOperationalStatusChangeCategory;
    }

    /**
     * Sets the value of the twampSenderOperationalStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setTwampSenderOperationalStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.twampSenderOperationalStatusChangeCategory = value;
    }

    /**
     * Gets the value of the ueTraceAndMdtStatusChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getUeTraceAndMdtStatusChangeCategory() {
        return ueTraceAndMdtStatusChangeCategory;
    }

    /**
     * Sets the value of the ueTraceAndMdtStatusChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setUeTraceAndMdtStatusChangeCategory(JAXBElement<EventCategories> value) {
        this.ueTraceAndMdtStatusChangeCategory = value;
    }

    /**
     * Gets the value of the wiFiBoardConnectivityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getWiFiBoardConnectivityCategory() {
        return wiFiBoardConnectivityCategory;
    }

    /**
     * Sets the value of the wiFiBoardConnectivityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setWiFiBoardConnectivityCategory(JAXBElement<EventCategories> value) {
        this.wiFiBoardConnectivityCategory = value;
    }

    /**
     * Gets the value of the wiFiBoardInitializationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public JAXBElement<EventCategories> getWiFiBoardInitializationCategory() {
        return wiFiBoardInitializationCategory;
    }

    /**
     * Sets the value of the wiFiBoardInitializationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EventCategories }{@code >}
     *     
     */
    public void setWiFiBoardInitializationCategory(JAXBElement<EventCategories> value) {
        this.wiFiBoardInitializationCategory = value;
    }

}
