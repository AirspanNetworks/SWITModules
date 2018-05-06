
package Netspan.NBI_15_1.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeSensorGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeSensorGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}NodeStatusResultValues"/>
 *         &lt;element name="NodeSensorResult" type="{http://Airspan.Netspan.WebServices}NodeSensorStatusDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeSensorGetResult", propOrder = {
    "nodeResult",
    "nodeSensorResult"
})
public class NodeSensorGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected NodeStatusResultValues nodeResult;
    @XmlElement(name = "NodeSensorResult")
    protected NodeSensorStatusDetails nodeSensorResult;

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
     * Gets the value of the nodeSensorResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSensorStatusDetails }
     *     
     */
    public NodeSensorStatusDetails getNodeSensorResult() {
        return nodeSensorResult;
    }

    /**
     * Sets the value of the nodeSensorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSensorStatusDetails }
     *     
     */
    public void setNodeSensorResult(NodeSensorStatusDetails value) {
        this.nodeSensorResult = value;
    }

}
