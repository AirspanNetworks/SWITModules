
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
 *         &lt;element name="NodeGroupDeleteResult" type="{http://Airspan.Netspan.WebServices}NodeGroupActionResult" minOccurs="0"/&gt;
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
    "nodeGroupDeleteResult"
})
@XmlRootElement(name = "NodeGroupDeleteResponse")
public class NodeGroupDeleteResponse {

    @XmlElement(name = "NodeGroupDeleteResult")
    protected NodeGroupActionResult nodeGroupDeleteResult;

    /**
     * Gets the value of the nodeGroupDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public NodeGroupActionResult getNodeGroupDeleteResult() {
        return nodeGroupDeleteResult;
    }

    /**
     * Sets the value of the nodeGroupDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupActionResult }
     *     
     */
    public void setNodeGroupDeleteResult(NodeGroupActionResult value) {
        this.nodeGroupDeleteResult = value;
    }

}
