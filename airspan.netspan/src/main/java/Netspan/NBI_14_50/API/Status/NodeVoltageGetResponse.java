
package Netspan.NBI_14_50.API.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NodeVoltageGetResult" type="{http://Airspan.Netspan.WebServices}NodeSensorGetResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeVoltageGetResult"
})
@XmlRootElement(name = "NodeVoltageGetResponse")
public class NodeVoltageGetResponse {

    @XmlElement(name = "NodeVoltageGetResult")
    protected NodeSensorGetResult nodeVoltageGetResult;

    /**
     * Gets the value of the nodeVoltageGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public NodeSensorGetResult getNodeVoltageGetResult() {
        return nodeVoltageGetResult;
    }

    /**
     * Sets the value of the nodeVoltageGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public void setNodeVoltageGetResult(NodeSensorGetResult value) {
        this.nodeVoltageGetResult = value;
    }

}
