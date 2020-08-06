
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
 *         &lt;element name="NodeGroupCreateResult" type="{http://Airspan.Netspan.WebServices}NodeGroupActionResult" minOccurs="0"/&gt;
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
    "nodeGroupCreateResult"
})
@XmlRootElement(name = "NodeGroupCreateResponse")
public class NodeGroupCreateResponse {

    @XmlElement(name = "NodeGroupCreateResult")
    protected NodeGroupActionResult nodeGroupCreateResult;

    /**
     * Gets the value of the nodeGroupCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public NodeGroupActionResult getNodeGroupCreateResult() {
        return nodeGroupCreateResult;
    }

    /**
     * Sets the value of the nodeGroupCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public void setNodeGroupCreateResult(NodeGroupActionResult value) {
        this.nodeGroupCreateResult = value;
    }

}
