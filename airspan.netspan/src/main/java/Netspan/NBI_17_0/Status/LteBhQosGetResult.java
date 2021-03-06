
package Netspan.NBI_17_0.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteBhQosGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBhQosGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BhQosStatus" type="{http://Airspan.Netspan.WebServices}LteBhQosStatusWs" minOccurs="0"/&gt;
 *         &lt;element name="QosHoRelayQuality" type="{http://Airspan.Netspan.WebServices}LteQosHoRelayQualityWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBhQosGetResult", propOrder = {
    "nodeResult",
    "name",
    "nodeId",
    "bhQosStatus",
    "qosHoRelayQuality"
})
public class LteBhQosGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NodeId")
    protected String nodeId;
    @XmlElement(name = "BhQosStatus")
    protected LteBhQosStatusWs bhQosStatus;
    @XmlElement(name = "QosHoRelayQuality")
    protected LteQosHoRelayQualityWs qosHoRelayQuality;

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
     * Gets the value of the bhQosStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LteBhQosStatusWs }
     *     
     */
    public LteBhQosStatusWs getBhQosStatus() {
        return bhQosStatus;
    }

    /**
     * Sets the value of the bhQosStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteBhQosStatusWs }
     *     
     */
    public void setBhQosStatus(LteBhQosStatusWs value) {
        this.bhQosStatus = value;
    }

    /**
     * Gets the value of the qosHoRelayQuality property.
     * 
     * @return
     *     possible object is
     *     {@link LteQosHoRelayQualityWs }
     *     
     */
    public LteQosHoRelayQualityWs getQosHoRelayQuality() {
        return qosHoRelayQuality;
    }

    /**
     * Sets the value of the qosHoRelayQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteQosHoRelayQualityWs }
     *     
     */
    public void setQosHoRelayQuality(LteQosHoRelayQualityWs value) {
        this.qosHoRelayQuality = value;
    }

}
