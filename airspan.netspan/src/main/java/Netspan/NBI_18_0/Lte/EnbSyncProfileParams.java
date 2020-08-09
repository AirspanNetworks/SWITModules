
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import Netspan.API.Enums.EnabledStates;


/**
 * <p>Java class for EnbSyncProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSyncProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClockSourceList" type="{http://Airspan.Netspan.WebServices}ClockContainer" minOccurs="0"/&gt;
 *         &lt;element name="GnssMode" type="{http://Airspan.Netspan.WebServices}SyncProfileGnssModes" minOccurs="0"/&gt;
 *         &lt;element name="RelayMode" type="{http://Airspan.Netspan.WebServices}SyncProfileGnssModes" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypeValues" minOccurs="0"/&gt;
 *         &lt;element name="AnnounceRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}AnnounceRateValues" minOccurs="0"/&gt;
 *         &lt;element name="SyncRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}SyncRateValues" minOccurs="0"/&gt;
 *         &lt;element name="DelayRequestResponseRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}DelayRateValues" minOccurs="0"/&gt;
 *         &lt;element name="LeaseDurationInSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PtpPhaseCorrectionUsage" type="{http://Airspan.Netspan.WebServices}PtpPhaseCorrectionUsages" minOccurs="0"/&gt;
 *         &lt;element name="NlmIntraFreqScanMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlmScanAllBands" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlmIntraFreqScanList" type="{http://Airspan.Netspan.WebServices}NlmIntraFreqScanListContainer" minOccurs="0"/&gt;
 *         &lt;element name="NlmNtpServerIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NlmPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlmS1Sync" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NlmPlmnSync" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RevertiveMode" type="{http://Airspan.Netspan.WebServices}EnabledStates" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSyncProfileParams", propOrder = {
    "clockSourceList",
    "gnssMode",
    "relayMode",
    "primaryMasterIpAddress",
    "primaryMasterDomain",
    "secondaryMasterIpAddress",
    "secondaryMasterDomain",
    "ptpProfileType",
    "announceRateInMsgPerSec",
    "syncRateInMsgPerSec",
    "delayRequestResponseRateInMsgPerSec",
    "leaseDurationInSec",
    "ptpPhaseCorrectionUsage",
    "nlmIntraFreqScanMode",
    "nlmScanAllBands",
    "nlmIntraFreqScanList",
    "nlmNtpServerIpAddress",
    "nlmPrimary",
    "nlmS1Sync",
    "nlmPlmnSync",
    "revertiveMode"
})
@XmlSeeAlso({
    EnbSyncProfile.class
})
public class EnbSyncProfileParams {

    @XmlElement(name = "ClockSourceList")
    protected ClockContainer clockSourceList;
    @XmlElementRef(name = "GnssMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SyncProfileGnssModes> gnssMode;
    @XmlElementRef(name = "RelayMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SyncProfileGnssModes> relayMode;
    @XmlElement(name = "PrimaryMasterIpAddress")
    protected String primaryMasterIpAddress;
    @XmlElementRef(name = "PrimaryMasterDomain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> primaryMasterDomain;
    @XmlElement(name = "SecondaryMasterIpAddress")
    protected String secondaryMasterIpAddress;
    @XmlElementRef(name = "SecondaryMasterDomain", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secondaryMasterDomain;
    @XmlElementRef(name = "PtpProfileType", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileTypeValues> ptpProfileType;
    @XmlElementRef(name = "AnnounceRateInMsgPerSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> announceRateInMsgPerSec;
    @XmlElementRef(name = "SyncRateInMsgPerSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> syncRateInMsgPerSec;
    @XmlElementRef(name = "DelayRequestResponseRateInMsgPerSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delayRequestResponseRateInMsgPerSec;
    @XmlElementRef(name = "LeaseDurationInSec", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> leaseDurationInSec;
    @XmlElementRef(name = "PtpPhaseCorrectionUsage", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PtpPhaseCorrectionUsages> ptpPhaseCorrectionUsage;
    @XmlElementRef(name = "NlmIntraFreqScanMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlmIntraFreqScanMode;
    @XmlElementRef(name = "NlmScanAllBands", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlmScanAllBands;
    @XmlElement(name = "NlmIntraFreqScanList")
    protected NlmIntraFreqScanListContainer nlmIntraFreqScanList;
    @XmlElement(name = "NlmNtpServerIpAddress")
    protected String nlmNtpServerIpAddress;
    @XmlElementRef(name = "NlmPrimary", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlmPrimary;
    @XmlElementRef(name = "NlmS1Sync", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlmS1Sync;
    @XmlElementRef(name = "NlmPlmnSync", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nlmPlmnSync;
    @XmlElementRef(name = "RevertiveMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledStates> revertiveMode;

    /**
     * Gets the value of the clockSourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ClockContainer }
     *     
     */
    public ClockContainer getClockSourceList() {
        return clockSourceList;
    }

    /**
     * Sets the value of the clockSourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockContainer }
     *     
     */
    public void setClockSourceList(ClockContainer value) {
        this.clockSourceList = value;
    }

    /**
     * Gets the value of the gnssMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}
     *     
     */
    public JAXBElement<SyncProfileGnssModes> getGnssMode() {
        return gnssMode;
    }

    /**
     * Sets the value of the gnssMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}
     *     
     */
    public void setGnssMode(JAXBElement<SyncProfileGnssModes> value) {
        this.gnssMode = value;
    }

    /**
     * Gets the value of the relayMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}
     *     
     */
    public JAXBElement<SyncProfileGnssModes> getRelayMode() {
        return relayMode;
    }

    /**
     * Sets the value of the relayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncProfileGnssModes }{@code >}
     *     
     */
    public void setRelayMode(JAXBElement<SyncProfileGnssModes> value) {
        this.relayMode = value;
    }

    /**
     * Gets the value of the primaryMasterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryMasterIpAddress() {
        return primaryMasterIpAddress;
    }

    /**
     * Sets the value of the primaryMasterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryMasterIpAddress(String value) {
        this.primaryMasterIpAddress = value;
    }

    /**
     * Gets the value of the primaryMasterDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrimaryMasterDomain() {
        return primaryMasterDomain;
    }

    /**
     * Sets the value of the primaryMasterDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrimaryMasterDomain(JAXBElement<Integer> value) {
        this.primaryMasterDomain = value;
    }

    /**
     * Gets the value of the secondaryMasterIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryMasterIpAddress() {
        return secondaryMasterIpAddress;
    }

    /**
     * Sets the value of the secondaryMasterIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryMasterIpAddress(String value) {
        this.secondaryMasterIpAddress = value;
    }

    /**
     * Gets the value of the secondaryMasterDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecondaryMasterDomain() {
        return secondaryMasterDomain;
    }

    /**
     * Sets the value of the secondaryMasterDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecondaryMasterDomain(JAXBElement<Integer> value) {
        this.secondaryMasterDomain = value;
    }

    /**
     * Gets the value of the ptpProfileType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileTypeValues }{@code >}
     *     
     */
    public JAXBElement<ProfileTypeValues> getPtpProfileType() {
        return ptpProfileType;
    }

    /**
     * Sets the value of the ptpProfileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileTypeValues }{@code >}
     *     
     */
    public void setPtpProfileType(JAXBElement<ProfileTypeValues> value) {
        this.ptpProfileType = value;
    }

    /**
     * Gets the value of the announceRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnnounceRateInMsgPerSec() {
        return announceRateInMsgPerSec;
    }

    /**
     * Sets the value of the announceRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnnounceRateInMsgPerSec(JAXBElement<String> value) {
        this.announceRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the syncRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSyncRateInMsgPerSec() {
        return syncRateInMsgPerSec;
    }

    /**
     * Sets the value of the syncRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSyncRateInMsgPerSec(JAXBElement<String> value) {
        this.syncRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the delayRequestResponseRateInMsgPerSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelayRequestResponseRateInMsgPerSec() {
        return delayRequestResponseRateInMsgPerSec;
    }

    /**
     * Sets the value of the delayRequestResponseRateInMsgPerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelayRequestResponseRateInMsgPerSec(JAXBElement<String> value) {
        this.delayRequestResponseRateInMsgPerSec = value;
    }

    /**
     * Gets the value of the leaseDurationInSec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLeaseDurationInSec() {
        return leaseDurationInSec;
    }

    /**
     * Sets the value of the leaseDurationInSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLeaseDurationInSec(JAXBElement<Integer> value) {
        this.leaseDurationInSec = value;
    }

    /**
     * Gets the value of the ptpPhaseCorrectionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PtpPhaseCorrectionUsages }{@code >}
     *     
     */
    public JAXBElement<PtpPhaseCorrectionUsages> getPtpPhaseCorrectionUsage() {
        return ptpPhaseCorrectionUsage;
    }

    /**
     * Sets the value of the ptpPhaseCorrectionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PtpPhaseCorrectionUsages }{@code >}
     *     
     */
    public void setPtpPhaseCorrectionUsage(JAXBElement<PtpPhaseCorrectionUsages> value) {
        this.ptpPhaseCorrectionUsage = value;
    }

    /**
     * Gets the value of the nlmIntraFreqScanMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlmIntraFreqScanMode() {
        return nlmIntraFreqScanMode;
    }

    /**
     * Sets the value of the nlmIntraFreqScanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlmIntraFreqScanMode(JAXBElement<Boolean> value) {
        this.nlmIntraFreqScanMode = value;
    }

    /**
     * Gets the value of the nlmScanAllBands property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlmScanAllBands() {
        return nlmScanAllBands;
    }

    /**
     * Sets the value of the nlmScanAllBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlmScanAllBands(JAXBElement<Boolean> value) {
        this.nlmScanAllBands = value;
    }

    /**
     * Gets the value of the nlmIntraFreqScanList property.
     * 
     * @return
     *     possible object is
     *     {@link NlmIntraFreqScanListContainer }
     *     
     */
    public NlmIntraFreqScanListContainer getNlmIntraFreqScanList() {
        return nlmIntraFreqScanList;
    }

    /**
     * Sets the value of the nlmIntraFreqScanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlmIntraFreqScanListContainer }
     *     
     */
    public void setNlmIntraFreqScanList(NlmIntraFreqScanListContainer value) {
        this.nlmIntraFreqScanList = value;
    }

    /**
     * Gets the value of the nlmNtpServerIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlmNtpServerIpAddress() {
        return nlmNtpServerIpAddress;
    }

    /**
     * Sets the value of the nlmNtpServerIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlmNtpServerIpAddress(String value) {
        this.nlmNtpServerIpAddress = value;
    }

    /**
     * Gets the value of the nlmPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlmPrimary() {
        return nlmPrimary;
    }

    /**
     * Sets the value of the nlmPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlmPrimary(JAXBElement<Boolean> value) {
        this.nlmPrimary = value;
    }

    /**
     * Gets the value of the nlmS1Sync property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlmS1Sync() {
        return nlmS1Sync;
    }

    /**
     * Sets the value of the nlmS1Sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlmS1Sync(JAXBElement<Boolean> value) {
        this.nlmS1Sync = value;
    }

    /**
     * Gets the value of the nlmPlmnSync property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNlmPlmnSync() {
        return nlmPlmnSync;
    }

    /**
     * Sets the value of the nlmPlmnSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNlmPlmnSync(JAXBElement<Boolean> value) {
        this.nlmPlmnSync = value;
    }

    /**
     * Gets the value of the revertiveMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public JAXBElement<EnabledStates> getRevertiveMode() {
        return revertiveMode;
    }

    /**
     * Sets the value of the revertiveMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledStates }{@code >}
     *     
     */
    public void setRevertiveMode(JAXBElement<EnabledStates> value) {
        this.revertiveMode = value;
    }

}
