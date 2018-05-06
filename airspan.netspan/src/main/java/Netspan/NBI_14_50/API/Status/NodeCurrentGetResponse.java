
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
 *         &lt;element name="NodeCurrentGetResult" type="{http://Airspan.Netspan.WebServices}NodeSensorGetResult" minOccurs="0"/>
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
    "nodeCurrentGetResult"
})
@XmlRootElement(name = "NodeCurrentGetResponse")
public class NodeCurrentGetResponse {

    @XmlElement(name = "NodeCurrentGetResult")
    protected NodeSensorGetResult nodeCurrentGetResult;

    /**
     * Gets the value of the nodeCurrentGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public NodeSensorGetResult getNodeCurrentGetResult() {
        return nodeCurrentGetResult;
    }

    /**
     * Sets the value of the nodeCurrentGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSensorGetResult }
     *     
     */
    public void setNodeCurrentGetResult(NodeSensorGetResult value) {
        this.nodeCurrentGetResult = value;
    }

}
