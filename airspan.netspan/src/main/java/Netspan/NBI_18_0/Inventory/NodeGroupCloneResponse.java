
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
 *         &lt;element name="NodeGroupCloneResult" type="{http://Airspan.Netspan.WebServices}NodeGroupActionResult" minOccurs="0"/&gt;
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
    "nodeGroupCloneResult"
})
@XmlRootElement(name = "NodeGroupCloneResponse")
public class NodeGroupCloneResponse {

    @XmlElement(name = "NodeGroupCloneResult")
    protected NodeGroupActionResult nodeGroupCloneResult;

    /**
     * Gets the value of the nodeGroupCloneResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public NodeGroupActionResult getNodeGroupCloneResult() {
        return nodeGroupCloneResult;
    }

    /**
     * Sets the value of the nodeGroupCloneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public void setNodeGroupCloneResult(NodeGroupActionResult value) {
        this.nodeGroupCloneResult = value;
    }

}
