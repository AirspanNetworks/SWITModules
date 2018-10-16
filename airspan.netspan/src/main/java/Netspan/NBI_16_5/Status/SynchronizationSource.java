
package Netspan.NBI_16_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveSource" type="{http://Airspan.Netspan.WebServices}ClockSources" minOccurs="0"/&gt;
 *         &lt;element name="SyncState" type="{http://Airspan.Netspan.WebServices}EnbSyncStatus" minOccurs="0"/&gt;
 *         &lt;element name="HoldoverExpiredTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastHoReasonString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSource", propOrder = {
    "activeSource",
    "syncState",
    "holdoverExpiredTime",
    "lastHoReasonString"
})
public class SynchronizationSource {

    @XmlElementRef(name = "ActiveSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSources> activeSource;
    @XmlElementRef(name = "SyncState", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EnbSyncStatus> syncState;
    @XmlElementRef(name = "HoldoverExpiredTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> holdoverExpiredTime;
    @XmlElement(name = "LastHoReasonString")
    protected String lastHoReasonString;

    /**
     * Gets the value of the activeSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSources }{@code >}
     *     
     */
    public JAXBElement<ClockSources> getActiveSource() {
        return activeSource;
    }

    /**
     * Sets the value of the activeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSources }{@code >}
     *     
     */
    public void setActiveSource(JAXBElement<ClockSources> value) {
        this.activeSource = value;
    }

    /**
     * Gets the value of the syncState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnbSyncStatus }{@code >}
     *     
     */
    public JAXBElement<EnbSyncStatus> getSyncState() {
        return syncState;
    }

    /**
     * Sets the value of the syncState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnbSyncStatus }{@code >}
     *     
     */
    public void setSyncState(JAXBElement<EnbSyncStatus> value) {
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
     * Gets the value of the lastHoReasonString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastHoReasonString() {
        return lastHoReasonString;
    }

    /**
     * Sets the value of the lastHoReasonString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastHoReasonString(String value) {
        this.lastHoReasonString = value;
    }

}
