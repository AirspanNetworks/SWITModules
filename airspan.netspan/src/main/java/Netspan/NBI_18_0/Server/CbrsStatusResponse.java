
package Netspan.NBI_18_0.Server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CbrsStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CbrsStatusResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetspanOnlineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetspanActiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetspanWatcherStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetspanLastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyOnlineStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyActiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyWatcherStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyCurrentOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyLastSyncSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyLastHeartbeatSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BackupProxyLastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CbsdTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdUnregistered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdRegistered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdSiSuccess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdGranted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdAuthorized" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CbsdDeregistered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CbrsStatusResponse", propOrder = {
    "netspanOnlineStatus",
    "netspanActiveStatus",
    "netspanWatcherStatus",
    "netspanLastUpdated",
    "backupProxyOnlineStatus",
    "backupProxyActiveStatus",
    "backupProxyWatcherStatus",
    "backupProxyCurrentOperation",
    "backupProxyLastSyncSeconds",
    "backupProxyLastHeartbeatSeconds",
    "backupProxyLastUpdated",
    "cbsdTotal",
    "cbsdUnregistered",
    "cbsdRegistered",
    "cbsdSiSuccess",
    "cbsdGranted",
    "cbsdAuthorized",
    "cbsdDeregistered"
})
public class CbrsStatusResponse
    extends WsResponse
{

    @XmlElement(name = "NetspanOnlineStatus")
    protected String netspanOnlineStatus;
    @XmlElement(name = "NetspanActiveStatus")
    protected String netspanActiveStatus;
    @XmlElement(name = "NetspanWatcherStatus")
    protected String netspanWatcherStatus;
    @XmlElementRef(name = "NetspanLastUpdated", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> netspanLastUpdated;
    @XmlElement(name = "BackupProxyOnlineStatus")
    protected String backupProxyOnlineStatus;
    @XmlElement(name = "BackupProxyActiveStatus")
    protected String backupProxyActiveStatus;
    @XmlElement(name = "BackupProxyWatcherStatus")
    protected String backupProxyWatcherStatus;
    @XmlElement(name = "BackupProxyCurrentOperation")
    protected String backupProxyCurrentOperation;
    @XmlElementRef(name = "BackupProxyLastSyncSeconds", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> backupProxyLastSyncSeconds;
    @XmlElementRef(name = "BackupProxyLastHeartbeatSeconds", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> backupProxyLastHeartbeatSeconds;
    @XmlElementRef(name = "BackupProxyLastUpdated", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> backupProxyLastUpdated;
    @XmlElementRef(name = "CbsdTotal", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdTotal;
    @XmlElementRef(name = "CbsdUnregistered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdUnregistered;
    @XmlElementRef(name = "CbsdRegistered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdRegistered;
    @XmlElementRef(name = "CbsdSiSuccess", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdSiSuccess;
    @XmlElementRef(name = "CbsdGranted", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdGranted;
    @XmlElementRef(name = "CbsdAuthorized", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdAuthorized;
    @XmlElementRef(name = "CbsdDeregistered", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cbsdDeregistered;

    /**
     * Gets the value of the netspanOnlineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetspanOnlineStatus() {
        return netspanOnlineStatus;
    }

    /**
     * Sets the value of the netspanOnlineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetspanOnlineStatus(String value) {
        this.netspanOnlineStatus = value;
    }

    /**
     * Gets the value of the netspanActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetspanActiveStatus() {
        return netspanActiveStatus;
    }

    /**
     * Sets the value of the netspanActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetspanActiveStatus(String value) {
        this.netspanActiveStatus = value;
    }

    /**
     * Gets the value of the netspanWatcherStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetspanWatcherStatus() {
        return netspanWatcherStatus;
    }

    /**
     * Sets the value of the netspanWatcherStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetspanWatcherStatus(String value) {
        this.netspanWatcherStatus = value;
    }

    /**
     * Gets the value of the netspanLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNetspanLastUpdated() {
        return netspanLastUpdated;
    }

    /**
     * Sets the value of the netspanLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNetspanLastUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.netspanLastUpdated = value;
    }

    /**
     * Gets the value of the backupProxyOnlineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupProxyOnlineStatus() {
        return backupProxyOnlineStatus;
    }

    /**
     * Sets the value of the backupProxyOnlineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupProxyOnlineStatus(String value) {
        this.backupProxyOnlineStatus = value;
    }

    /**
     * Gets the value of the backupProxyActiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupProxyActiveStatus() {
        return backupProxyActiveStatus;
    }

    /**
     * Sets the value of the backupProxyActiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupProxyActiveStatus(String value) {
        this.backupProxyActiveStatus = value;
    }

    /**
     * Gets the value of the backupProxyWatcherStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupProxyWatcherStatus() {
        return backupProxyWatcherStatus;
    }

    /**
     * Sets the value of the backupProxyWatcherStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupProxyWatcherStatus(String value) {
        this.backupProxyWatcherStatus = value;
    }

    /**
     * Gets the value of the backupProxyCurrentOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupProxyCurrentOperation() {
        return backupProxyCurrentOperation;
    }

    /**
     * Sets the value of the backupProxyCurrentOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupProxyCurrentOperation(String value) {
        this.backupProxyCurrentOperation = value;
    }

    /**
     * Gets the value of the backupProxyLastSyncSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBackupProxyLastSyncSeconds() {
        return backupProxyLastSyncSeconds;
    }

    /**
     * Sets the value of the backupProxyLastSyncSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBackupProxyLastSyncSeconds(JAXBElement<Integer> value) {
        this.backupProxyLastSyncSeconds = value;
    }

    /**
     * Gets the value of the backupProxyLastHeartbeatSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBackupProxyLastHeartbeatSeconds() {
        return backupProxyLastHeartbeatSeconds;
    }

    /**
     * Sets the value of the backupProxyLastHeartbeatSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBackupProxyLastHeartbeatSeconds(JAXBElement<Integer> value) {
        this.backupProxyLastHeartbeatSeconds = value;
    }

    /**
     * Gets the value of the backupProxyLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBackupProxyLastUpdated() {
        return backupProxyLastUpdated;
    }

    /**
     * Sets the value of the backupProxyLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBackupProxyLastUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.backupProxyLastUpdated = value;
    }

    /**
     * Gets the value of the cbsdTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdTotal() {
        return cbsdTotal;
    }

    /**
     * Sets the value of the cbsdTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdTotal(JAXBElement<Integer> value) {
        this.cbsdTotal = value;
    }

    /**
     * Gets the value of the cbsdUnregistered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdUnregistered() {
        return cbsdUnregistered;
    }

    /**
     * Sets the value of the cbsdUnregistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdUnregistered(JAXBElement<Integer> value) {
        this.cbsdUnregistered = value;
    }

    /**
     * Gets the value of the cbsdRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdRegistered() {
        return cbsdRegistered;
    }

    /**
     * Sets the value of the cbsdRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdRegistered(JAXBElement<Integer> value) {
        this.cbsdRegistered = value;
    }

    /**
     * Gets the value of the cbsdSiSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdSiSuccess() {
        return cbsdSiSuccess;
    }

    /**
     * Sets the value of the cbsdSiSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdSiSuccess(JAXBElement<Integer> value) {
        this.cbsdSiSuccess = value;
    }

    /**
     * Gets the value of the cbsdGranted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdGranted() {
        return cbsdGranted;
    }

    /**
     * Sets the value of the cbsdGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdGranted(JAXBElement<Integer> value) {
        this.cbsdGranted = value;
    }

    /**
     * Gets the value of the cbsdAuthorized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdAuthorized() {
        return cbsdAuthorized;
    }

    /**
     * Sets the value of the cbsdAuthorized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdAuthorized(JAXBElement<Integer> value) {
        this.cbsdAuthorized = value;
    }

    /**
     * Gets the value of the cbsdDeregistered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCbsdDeregistered() {
        return cbsdDeregistered;
    }

    /**
     * Sets the value of the cbsdDeregistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCbsdDeregistered(JAXBElement<Integer> value) {
        this.cbsdDeregistered = value;
    }

}
