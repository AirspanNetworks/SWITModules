
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayAdvancedProfileParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayAdvancedProfileParams"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EciBlackListEntries" type="{http://Airspan.Netspan.WebServices}EciBlacklistValuesListContainer" minOccurs="0"/&gt;
 *         &lt;element name="PowerCycleRescanInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WebGUIAccessEnabled" type="{http://Airspan.Netspan.WebServices}WebGuiAccessWs" minOccurs="0"/&gt;
 *         &lt;element name="WifiDisableTemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnodebDisableTemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TempHysteris" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WifiRssiThresholdExcellent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WifiRssiThresholdGood" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WifiRssiThresholdAcceptable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageTimeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="GroupScanMode" type="{http://Airspan.Netspan.WebServices}GroupScanModesWs" minOccurs="0"/&gt;
 *         &lt;element name="Apn1SnmpConnectionLossTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LanMacAddressList" type="{http://Airspan.Netspan.WebServices}LanMacAddressListContainer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayAdvancedProfileParams", propOrder = {
    "eciBlackListEntries",
    "powerCycleRescanInterval",
    "webGUIAccessEnabled",
    "wifiDisableTemp",
    "enodebDisableTemp",
    "tempHysteris",
    "wifiRssiThresholdExcellent",
    "wifiRssiThresholdGood",
    "wifiRssiThresholdAcceptable",
    "pageTimeout",
    "groupScanMode",
    "apn1SnmpConnectionLossTimer",
    "lanMacAddressList"
})
public class RelayAdvancedProfileParams {

    @XmlElement(name = "EciBlackListEntries")
    protected EciBlacklistValuesListContainer eciBlackListEntries;
    @XmlElementRef(name = "PowerCycleRescanInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> powerCycleRescanInterval;
    @XmlElementRef(name = "WebGUIAccessEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<WebGuiAccessWs> webGUIAccessEnabled;
    @XmlElementRef(name = "WifiDisableTemp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiDisableTemp;
    @XmlElementRef(name = "EnodebDisableTemp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> enodebDisableTemp;
    @XmlElementRef(name = "TempHysteris", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tempHysteris;
    @XmlElementRef(name = "WifiRssiThresholdExcellent", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiRssiThresholdExcellent;
    @XmlElementRef(name = "WifiRssiThresholdGood", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiRssiThresholdGood;
    @XmlElementRef(name = "WifiRssiThresholdAcceptable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiRssiThresholdAcceptable;
    @XmlElementRef(name = "PageTimeout", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pageTimeout;
    @XmlElementRef(name = "GroupScanMode", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupScanModesWs> groupScanMode;
    @XmlElementRef(name = "Apn1SnmpConnectionLossTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> apn1SnmpConnectionLossTimer;
    @XmlElement(name = "LanMacAddressList")
    protected LanMacAddressListContainer lanMacAddressList;

    /**
     * Gets the value of the eciBlackListEntries property.
     * 
     * @return
     *     possible object is
     *     {@link EciBlacklistValuesListContainer }
     *     
     */
    public EciBlacklistValuesListContainer getEciBlackListEntries() {
        return eciBlackListEntries;
    }

    /**
     * Sets the value of the eciBlackListEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EciBlacklistValuesListContainer }
     *     
     */
    public void setEciBlackListEntries(EciBlacklistValuesListContainer value) {
        this.eciBlackListEntries = value;
    }

    /**
     * Gets the value of the powerCycleRescanInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPowerCycleRescanInterval() {
        return powerCycleRescanInterval;
    }

    /**
     * Sets the value of the powerCycleRescanInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPowerCycleRescanInterval(JAXBElement<Integer> value) {
        this.powerCycleRescanInterval = value;
    }

    /**
     * Gets the value of the webGUIAccessEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WebGuiAccessWs }{@code >}
     *     
     */
    public JAXBElement<WebGuiAccessWs> getWebGUIAccessEnabled() {
        return webGUIAccessEnabled;
    }

    /**
     * Sets the value of the webGUIAccessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WebGuiAccessWs }{@code >}
     *     
     */
    public void setWebGUIAccessEnabled(JAXBElement<WebGuiAccessWs> value) {
        this.webGUIAccessEnabled = value;
    }

    /**
     * Gets the value of the wifiDisableTemp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWifiDisableTemp() {
        return wifiDisableTemp;
    }

    /**
     * Sets the value of the wifiDisableTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWifiDisableTemp(JAXBElement<Integer> value) {
        this.wifiDisableTemp = value;
    }

    /**
     * Gets the value of the enodebDisableTemp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEnodebDisableTemp() {
        return enodebDisableTemp;
    }

    /**
     * Sets the value of the enodebDisableTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEnodebDisableTemp(JAXBElement<Integer> value) {
        this.enodebDisableTemp = value;
    }

    /**
     * Gets the value of the tempHysteris property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTempHysteris() {
        return tempHysteris;
    }

    /**
     * Sets the value of the tempHysteris property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTempHysteris(JAXBElement<Integer> value) {
        this.tempHysteris = value;
    }

    /**
     * Gets the value of the wifiRssiThresholdExcellent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWifiRssiThresholdExcellent() {
        return wifiRssiThresholdExcellent;
    }

    /**
     * Sets the value of the wifiRssiThresholdExcellent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWifiRssiThresholdExcellent(JAXBElement<Integer> value) {
        this.wifiRssiThresholdExcellent = value;
    }

    /**
     * Gets the value of the wifiRssiThresholdGood property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWifiRssiThresholdGood() {
        return wifiRssiThresholdGood;
    }

    /**
     * Sets the value of the wifiRssiThresholdGood property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWifiRssiThresholdGood(JAXBElement<Integer> value) {
        this.wifiRssiThresholdGood = value;
    }

    /**
     * Gets the value of the wifiRssiThresholdAcceptable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWifiRssiThresholdAcceptable() {
        return wifiRssiThresholdAcceptable;
    }

    /**
     * Sets the value of the wifiRssiThresholdAcceptable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWifiRssiThresholdAcceptable(JAXBElement<Integer> value) {
        this.wifiRssiThresholdAcceptable = value;
    }

    /**
     * Gets the value of the pageTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPageTimeout() {
        return pageTimeout;
    }

    /**
     * Sets the value of the pageTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPageTimeout(JAXBElement<Integer> value) {
        this.pageTimeout = value;
    }

    /**
     * Gets the value of the groupScanMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupScanModesWs }{@code >}
     *     
     */
    public JAXBElement<GroupScanModesWs> getGroupScanMode() {
        return groupScanMode;
    }

    /**
     * Sets the value of the groupScanMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupScanModesWs }{@code >}
     *     
     */
    public void setGroupScanMode(JAXBElement<GroupScanModesWs> value) {
        this.groupScanMode = value;
    }

    /**
     * Gets the value of the apn1SnmpConnectionLossTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getApn1SnmpConnectionLossTimer() {
        return apn1SnmpConnectionLossTimer;
    }

    /**
     * Sets the value of the apn1SnmpConnectionLossTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setApn1SnmpConnectionLossTimer(JAXBElement<Integer> value) {
        this.apn1SnmpConnectionLossTimer = value;
    }

    /**
     * Gets the value of the lanMacAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link LanMacAddressListContainer }
     *     
     */
    public LanMacAddressListContainer getLanMacAddressList() {
        return lanMacAddressList;
    }

    /**
     * Sets the value of the lanMacAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanMacAddressListContainer }
     *     
     */
    public void setLanMacAddressList(LanMacAddressListContainer value) {
        this.lanMacAddressList = value;
    }

}
