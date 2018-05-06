
package Netspan.NBI_15_2.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeGpsGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeGpsGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/>
 *         &lt;element name="GpsStatus" type="{http://Airspan.Netspan.WebServices}GpsStatus" minOccurs="0"/>
 *         &lt;element name="SynchronizationStatus" type="{http://Airspan.Netspan.WebServices}SynchronizationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeGpsGetResult", propOrder = {
    "nodeResult",
    "gpsStatus",
    "synchronizationStatus"
})
public class NodeGpsGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "GpsStatus")
    protected GpsStatus gpsStatus;
    @XmlElement(name = "SynchronizationStatus")
    protected SynchronizationStatus synchronizationStatus;

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
     * Gets the value of the gpsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GpsStatus }
     *     
     */
    public GpsStatus getGpsStatus() {
        return gpsStatus;
    }

    /**
     * Sets the value of the gpsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GpsStatus }
     *     
     */
    public void setGpsStatus(GpsStatus value) {
        this.gpsStatus = value;
    }

    /**
     * Gets the value of the synchronizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationStatus }
     *     
     */
    public SynchronizationStatus getSynchronizationStatus() {
        return synchronizationStatus;
    }

    /**
     * Sets the value of the synchronizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationStatus }
     *     
     */
    public void setSynchronizationStatus(SynchronizationStatus value) {
        this.synchronizationStatus = value;
    }

}
