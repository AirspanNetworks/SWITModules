
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAndSyncStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationAndSyncStatusResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationDetails" type="{http://Airspan.Netspan.WebServices}LocationDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="GpsDetails" type="{http://Airspan.Netspan.WebServices}GpsDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationDetails" type="{http://Airspan.Netspan.WebServices}SynchronizationDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="SynchronizationSources" type="{http://Airspan.Netspan.WebServices}SynchronizationSourcesWs" minOccurs="0"/&gt;
 *         &lt;element name="PtpDetails" type="{http://Airspan.Netspan.WebServices}PtpDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="NLSyncDetails" type="{http://Airspan.Netspan.WebServices}NlSyncDetailsWs" minOccurs="0"/&gt;
 *         &lt;element name="LocationLockStatus" type="{http://Airspan.Netspan.WebServices}LocationLockStatusWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationAndSyncStatusResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "locationDetails",
    "gpsDetails",
    "synchronizationDetails",
    "synchronizationSources",
    "ptpDetails",
    "nlSyncDetails",
    "locationLockStatus"
})
public class LocationAndSyncStatusResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "LocationDetails")
    protected LocationDetailsWs locationDetails;
    @XmlElement(name = "GpsDetails")
    protected GpsDetailsWs gpsDetails;
    @XmlElement(name = "SynchronizationDetails")
    protected SynchronizationDetailsWs synchronizationDetails;
    @XmlElement(name = "SynchronizationSources")
    protected SynchronizationSourcesWs synchronizationSources;
    @XmlElement(name = "PtpDetails")
    protected PtpDetailsWs ptpDetails;
    @XmlElement(name = "NLSyncDetails")
    protected NlSyncDetailsWs nlSyncDetails;
    @XmlElement(name = "LocationLockStatus")
    protected LocationLockStatusWs locationLockStatus;

    /**
     * Gets the value of the nodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeStatusResultValues }
     *     
     */
    public NodeStatusResultValues getNodeResult() {
        return nodeResult;
    }

    /**
     * Sets the value of the nodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeStatusResultValues }
     *     
     */
    public void setNodeResult(NodeStatusResultValues value) {
        this.nodeResult = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nodeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Sets the value of the nodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeId(String value) {
        this.nodeId = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsWs }
     *     
     */
    public LocationDetailsWs getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsWs }
     *     
     */
    public void setLocationDetails(LocationDetailsWs value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the gpsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GpsDetailsWs }
     *     
     */
    public GpsDetailsWs getGpsDetails() {
        return gpsDetails;
    }

    /**
     * Sets the value of the gpsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsDetailsWs }
     *     
     */
    public void setGpsDetails(GpsDetailsWs value) {
        this.gpsDetails = value;
    }

    /**
     * Gets the value of the synchronizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationDetailsWs }
     *     
     */
    public SynchronizationDetailsWs getSynchronizationDetails() {
        return synchronizationDetails;
    }

    /**
     * Sets the value of the synchronizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationDetailsWs }
     *     
     */
    public void setSynchronizationDetails(SynchronizationDetailsWs value) {
        this.synchronizationDetails = value;
    }

    /**
     * Gets the value of the synchronizationSources property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationSourcesWs }
     *     
     */
    public SynchronizationSourcesWs getSynchronizationSources() {
        return synchronizationSources;
    }

    /**
     * Sets the value of the synchronizationSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationSourcesWs }
     *     
     */
    public void setSynchronizationSources(SynchronizationSourcesWs value) {
        this.synchronizationSources = value;
    }

    /**
     * Gets the value of the ptpDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PtpDetailsWs }
     *     
     */
    public PtpDetailsWs getPtpDetails() {
        return ptpDetails;
    }

    /**
     * Sets the value of the ptpDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtpDetailsWs }
     *     
     */
    public void setPtpDetails(PtpDetailsWs value) {
        this.ptpDetails = value;
    }

    /**
     * Gets the value of the nlSyncDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NlSyncDetailsWs }
     *     
     */
    public NlSyncDetailsWs getNLSyncDetails() {
        return nlSyncDetails;
    }

    /**
     * Sets the value of the nlSyncDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NlSyncDetailsWs }
     *     
     */
    public void setNLSyncDetails(NlSyncDetailsWs value) {
        this.nlSyncDetails = value;
    }

    /**
     * Gets the value of the locationLockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LocationLockStatusWs }
     *     
     */
    public LocationLockStatusWs getLocationLockStatus() {
        return locationLockStatus;
    }

    /**
     * Sets the value of the locationLockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationLockStatusWs }
     *     
     */
    public void setLocationLockStatus(LocationLockStatusWs value) {
        this.locationLockStatus = value;
    }

}
