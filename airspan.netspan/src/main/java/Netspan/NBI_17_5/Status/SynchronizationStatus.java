
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveSource" type="{http://Airspan.Netspan.WebServices}ClockSourceTypes" minOccurs="0"/&gt;
 *         &lt;element name="SyncState" type="{http://Airspan.Netspan.WebServices}SyncStates" minOccurs="0"/&gt;
 *         &lt;element name="HoldoverExpiredTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TxEnable" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="EnableExtPps" type="{http://Airspan.Netspan.WebServices}EnabledDisabledValues" minOccurs="0"/&gt;
 *         &lt;element name="SwitchRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastSwitchTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DeNodeBClock" type="{http://Airspan.Netspan.WebServices}DeNodeBClockStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationStatus", propOrder = {
    "activeSource",
    "syncState",
    "holdoverExpiredTime",
    "txEnable",
    "enableExtPps",
    "switchRate",
    "lastSwitchTime",
    "deNodeBClock"
})
public class SynchronizationStatus {

    @XmlElementRef(name = "ActiveSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSourceTypes> activeSource;
    @XmlElementRef(name = "SyncState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SyncStates> syncState;
    @XmlElementRef(name = "HoldoverExpiredTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> holdoverExpiredTime;
    @XmlElementRef(name = "TxEnable", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> txEnable;
    @XmlElementRef(name = "EnableExtPps", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnabledDisabledValues> enableExtPps;
    @XmlElementRef(name = "SwitchRate", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> switchRate;
    @XmlElementRef(name = "LastSwitchTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lastSwitchTime;
    @XmlElementRef(name = "DeNodeBClock", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<DeNodeBClockStatus> deNodeBClock;

    /**
     * Gets the value of the activeSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceTypes }{@code >}
     *     
     */
    public JAXBElement<ClockSourceTypes> getActiveSource() {
        return activeSource;
    }

    /**
     * Sets the value of the activeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceTypes }{@code >}
     *     
     */
    public void setActiveSource(JAXBElement<ClockSourceTypes> value) {
        this.activeSource = value;
    }

    /**
     * Gets the value of the syncState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncStates }{@code >}
     *     
     */
    public JAXBElement<SyncStates> getSyncState() {
        return syncState;
    }

    /**
     * Sets the value of the syncState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncStates }{@code >}
     *     
     */
    public void setSyncState(JAXBElement<SyncStates> value) {
        this.syncState = value;
    }

    /**
     * Gets the value of the holdoverExpiredTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHoldoverExpiredTime() {
        return holdoverExpiredTime;
    }

    /**
     * Sets the value of the holdoverExpiredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHoldoverExpiredTime(JAXBElement<Integer> value) {
        this.holdoverExpiredTime = value;
    }

    /**
     * Gets the value of the txEnable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getTxEnable() {
        return txEnable;
    }

    /**
     * Sets the value of the txEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setTxEnable(JAXBElement<EnabledDisabledValues> value) {
        this.txEnable = value;
    }

    /**
     * Gets the value of the enableExtPps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public JAXBElement<EnabledDisabledValues> getEnableExtPps() {
        return enableExtPps;
    }

    /**
     * Sets the value of the enableExtPps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnabledDisabledValues }{@code >}
     *     
     */
    public void setEnableExtPps(JAXBElement<EnabledDisabledValues> value) {
        this.enableExtPps = value;
    }

    /**
     * Gets the value of the switchRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSwitchRate() {
        return switchRate;
    }

    /**
     * Sets the value of the switchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSwitchRate(JAXBElement<Integer> value) {
        this.switchRate = value;
    }

    /**
     * Gets the value of the lastSwitchTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastSwitchTime() {
        return lastSwitchTime;
    }

    /**
     * Sets the value of the lastSwitchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastSwitchTime(JAXBElement<Integer> value) {
        this.lastSwitchTime = value;
    }

    /**
     * Gets the value of the deNodeBClock property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeNodeBClockStatus }{@code >}
     *     
     */
    public JAXBElement<DeNodeBClockStatus> getDeNodeBClock() {
        return deNodeBClock;
    }

    /**
     * Sets the value of the deNodeBClock property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeNodeBClockStatus }{@code >}
     *     
     */
    public void setDeNodeBClock(JAXBElement<DeNodeBClockStatus> value) {
        this.deNodeBClock = value;
    }

}
