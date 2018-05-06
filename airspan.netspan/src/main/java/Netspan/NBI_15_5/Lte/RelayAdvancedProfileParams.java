
package Netspan.NBI_15_5.Lte;

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
 * &lt;complexType name="RelayAdvancedProfileParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EciBlackListEntries" type="{http://Airspan.Netspan.WebServices}EciBlacklistValuesListContainer" minOccurs="0"/>
 *         &lt;element name="PowerCycleRescanInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WebGUIAccessEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WifiDisableTemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EnodebDisableTemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TempHysteris" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "tempHysteris"
})
public class RelayAdvancedProfileParams {

    @XmlElement(name = "EciBlackListEntries")
    protected EciBlacklistValuesListContainer eciBlackListEntries;
    @XmlElementRef(name = "PowerCycleRescanInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> powerCycleRescanInterval;
    @XmlElementRef(name = "WebGUIAccessEnabled", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> webGUIAccessEnabled;
    @XmlElementRef(name = "WifiDisableTemp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> wifiDisableTemp;
    @XmlElementRef(name = "EnodebDisableTemp", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> enodebDisableTemp;
    @XmlElementRef(name = "TempHysteris", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tempHysteris;

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
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getWebGUIAccessEnabled() {
        return webGUIAccessEnabled;
    }

    /**
     * Sets the value of the webGUIAccessEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setWebGUIAccessEnabled(JAXBElement<Boolean> value) {
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

}
