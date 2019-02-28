
package Netspan.NBI_17_0.Status;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeTemperatureGetResult" type="{http://Airspan.Netspan.WebServices}NodeSensorGetResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeTemperatureGetResult"
})
@XmlRootElement(name = "NodeTemperatureGetResponse")
public class NodeTemperatureGetResponse {

    @XmlElement(name = "NodeTemperatureGetResult")
    protected NodeSensorGetResult nodeTemperatureGetResult;

    /**
     * Gets the value of the nodeTemperatureGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public NodeSensorGetResult getNodeTemperatureGetResult() {
        return nodeTemperatureGetResult;
    }

    /**
     * Sets the value of the nodeTemperatureGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public void setNodeTemperatureGetResult(NodeSensorGetResult value) {
        this.nodeTemperatureGetResult = value;
    }

}
