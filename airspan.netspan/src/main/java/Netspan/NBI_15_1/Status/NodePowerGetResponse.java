
package Netspan.NBI_15_1.Status;

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
 *         &lt;element name="NodePowerGetResult" type="{http://Airspan.Netspan.WebServices}NodeSensorGetResult" minOccurs="0"/>
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
    "nodePowerGetResult"
})
@XmlRootElement(name = "NodePowerGetResponse")
public class NodePowerGetResponse {

    @XmlElement(name = "NodePowerGetResult")
    protected NodeSensorGetResult nodePowerGetResult;

    /**
     * Gets the value of the nodePowerGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public NodeSensorGetResult getNodePowerGetResult() {
        return nodePowerGetResult;
    }

    /**
     * Sets the value of the nodePowerGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public void setNodePowerGetResult(NodeSensorGetResult value) {
        this.nodePowerGetResult = value;
    }

}
