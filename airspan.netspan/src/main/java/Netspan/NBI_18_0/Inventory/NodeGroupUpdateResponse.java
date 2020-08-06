
package Netspan.NBI_18_0.Inventory;

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
 *         &lt;element name="NodeGroupUpdateResult" type="{http://Airspan.Netspan.WebServices}NodeGroupActionResult" minOccurs="0"/&gt;
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
    "nodeGroupUpdateResult"
})
@XmlRootElement(name = "NodeGroupUpdateResponse")
public class NodeGroupUpdateResponse {

    @XmlElement(name = "NodeGroupUpdateResult")
    protected NodeGroupActionResult nodeGroupUpdateResult;

    /**
     * Gets the value of the nodeGroupUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public NodeGroupActionResult getNodeGroupUpdateResult() {
        return nodeGroupUpdateResult;
    }

    /**
     * Sets the value of the nodeGroupUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public void setNodeGroupUpdateResult(NodeGroupActionResult value) {
        this.nodeGroupUpdateResult = value;
    }

}
