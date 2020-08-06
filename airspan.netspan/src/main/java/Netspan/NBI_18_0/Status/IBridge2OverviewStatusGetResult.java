
package Netspan.NBI_18_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IBridge2OverviewStatusGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IBridge2OverviewStatusGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Overview" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewTopLevelStatusWs" minOccurs="0"/&gt;
 *         &lt;element name="SignalMeter" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewSignalMeterStatusWs" minOccurs="0"/&gt;
 *         &lt;element name="DeviceDetails" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewDeviceDetailsStatusWs" minOccurs="0"/&gt;
 *         &lt;element name="MimoStatus" type="{http://Airspan.Netspan.WebServices}IBridge2OverviewMimoStatusWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IBridge2OverviewStatusGetResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "overview",
    "signalMeter",
    "deviceDetails",
    "mimoStatus"
})
public class IBridge2OverviewStatusGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "Overview")
    protected IBridge2OverviewTopLevelStatusWs overview;
    @XmlElement(name = "SignalMeter")
    protected IBridge2OverviewSignalMeterStatusWs signalMeter;
    @XmlElement(name = "DeviceDetails")
    protected IBridge2OverviewDeviceDetailsStatusWs deviceDetails;
    @XmlElement(name = "MimoStatus")
    protected IBridge2OverviewMimoStatusWs mimoStatus;

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
     * Gets the value of the overview property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2OverviewTopLevelStatusWs }
     *     
     */
    public IBridge2OverviewTopLevelStatusWs getOverview() {
        return overview;
    }

    /**
     * Sets the value of the overview property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2OverviewTopLevelStatusWs }
     *     
     */
    public void setOverview(IBridge2OverviewTopLevelStatusWs value) {
        this.overview = value;
    }

    /**
     * Gets the value of the signalMeter property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2OverviewSignalMeterStatusWs }
     *     
     */
    public IBridge2OverviewSignalMeterStatusWs getSignalMeter() {
        return signalMeter;
    }

    /**
     * Sets the value of the signalMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2OverviewSignalMeterStatusWs }
     *     
     */
    public void setSignalMeter(IBridge2OverviewSignalMeterStatusWs value) {
        this.signalMeter = value;
    }

    /**
     * Gets the value of the deviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2OverviewDeviceDetailsStatusWs }
     *     
     */
    public IBridge2OverviewDeviceDetailsStatusWs getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Sets the value of the deviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2OverviewDeviceDetailsStatusWs }
     *     
     */
    public void setDeviceDetails(IBridge2OverviewDeviceDetailsStatusWs value) {
        this.deviceDetails = value;
    }

    /**
     * Gets the value of the mimoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link IBridge2OverviewMimoStatusWs }
     *     
     */
    public IBridge2OverviewMimoStatusWs getMimoStatus() {
        return mimoStatus;
    }

    /**
     * Sets the value of the mimoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IBridge2OverviewMimoStatusWs }
     *     
     */
    public void setMimoStatus(IBridge2OverviewMimoStatusWs value) {
        this.mimoStatus = value;
    }

}
