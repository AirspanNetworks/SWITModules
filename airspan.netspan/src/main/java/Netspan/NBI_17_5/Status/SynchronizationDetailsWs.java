
package Netspan.NBI_17_5.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationDetailsWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationDetailsWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActiveSource" type="{http://Airspan.Netspan.WebServices}ClockSourceTypesWs" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://Airspan.Netspan.WebServices}SyncStatesWs" minOccurs="0"/&gt;
 *         &lt;element name="TimeToHandoverExpirySecs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastHoldoverReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SwitchRatePerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastSwitchTimeInSecs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationDetailsWs", propOrder = {
    "activeSource",
    "status",
    "timeToHandoverExpirySecs",
    "lastHoldoverReason",
    "switchRatePerDay",
    "lastSwitchTimeInSecs"
})
public class SynchronizationDetailsWs {

    @XmlElementRef(name = "ActiveSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSourceTypesWs> activeSource;
    @XmlElementRef(name = "Status", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<SyncStatesWs> status;
    @XmlElementRef(name = "TimeToHandoverExpirySecs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeToHandoverExpirySecs;
    @XmlElement(name = "LastHoldoverReason")
    protected String lastHoldoverReason;
    @XmlElementRef(name = "SwitchRatePerDay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> switchRatePerDay;
    @XmlElementRef(name = "LastSwitchTimeInSecs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lastSwitchTimeInSecs;

    /**
     * Gets the value of the activeSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceTypesWs }{@code >}
     *     
     */
    public JAXBElement<ClockSourceTypesWs> getActiveSource() {
        return activeSource;
    }

    /**
     * Sets the value of the activeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceTypesWs }{@code >}
     *     
     */
    public void setActiveSource(JAXBElement<ClockSourceTypesWs> value) {
        this.activeSource = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SyncStatesWs }{@code >}
     *     
     */
    public JAXBElement<SyncStatesWs> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SyncStatesWs }{@code >}
     *     
     */
    public void setStatus(JAXBElement<SyncStatesWs> value) {
        this.status = value;
    }

    /**
     * Gets the value of the timeToHandoverExpirySecs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeToHandoverExpirySecs() {
        return timeToHandoverExpirySecs;
    }

    /**
     * Sets the value of the timeToHandoverExpirySecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeToHandoverExpirySecs(JAXBElement<Integer> value) {
        this.timeToHandoverExpirySecs = value;
    }

    /**
     * Gets the value of the lastHoldoverReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastHoldoverReason() {
        return lastHoldoverReason;
    }

    /**
     * Sets the value of the lastHoldoverReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastHoldoverReason(String value) {
        this.lastHoldoverReason = value;
    }

    /**
     * Gets the value of the switchRatePerDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSwitchRatePerDay() {
        return switchRatePerDay;
    }

    /**
     * Sets the value of the switchRatePerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSwitchRatePerDay(JAXBElement<Integer> value) {
        this.switchRatePerDay = value;
    }

    /**
     * Gets the value of the lastSwitchTimeInSecs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLastSwitchTimeInSecs() {
        return lastSwitchTimeInSecs;
    }

    /**
     * Sets the value of the lastSwitchTimeInSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLastSwitchTimeInSecs(JAXBElement<Integer> value) {
        this.lastSwitchTimeInSecs = value;
    }

}
