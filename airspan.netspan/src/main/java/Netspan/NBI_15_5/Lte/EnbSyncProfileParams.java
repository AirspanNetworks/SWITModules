
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnbSyncProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnbSyncProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryClockSource" type="{http://Airspan.Netspan.WebServices}ClockSources" minOccurs="0"/>
 *         &lt;element name="GnssMode" type="{http://Airspan.Netspan.WebServices}SyncProfileGnssModes" minOccurs="0"/>
 *         &lt;element name="RelayMode" type="{http://Airspan.Netspan.WebServices}SyncProfileGnssModes" minOccurs="0"/>
 *         &lt;element name="PrimaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SecondaryMasterIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryMasterDomain" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PtpProfileType" type="{http://Airspan.Netspan.WebServices}ProfileTypeValues" minOccurs="0"/>
 *         &lt;element name="AnnounceRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}AnnounceRateValues" minOccurs="0"/>
 *         &lt;element name="SyncRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}SyncRateValues" minOccurs="0"/>
 *         &lt;element name="DelayRequestResponseRateInMsgPerSec" type="{http://Airspan.Netspan.WebServices}DelayRateValues" minOccurs="0"/>
 *         &lt;element name="LeaseDurationInSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnbSyncProfileParams", propOrder = {
    "primaryClockSource",
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
    "leaseDurationInSec"
})
@XmlSeeAlso({
    EnbSyncProfile.class
})
public class EnbSyncProfileParams {

    @XmlElementRef(name = "PrimaryClockSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSources> primaryClockSource;
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

    /**
     * Gets the value of the primaryClockSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSources }{@code >}
     *     
     */
    public JAXBElement<ClockSources> getPrimaryClockSource() {
        return primaryClockSource;
    }

    /**
     * Sets the value of the primaryClockSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSources }{@code >}
     *     
     */
    public void setPrimaryClockSource(JAXBElement<ClockSources> value) {
        this.primaryClockSource = value;
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

}
