
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
 *         &lt;element name="NodeGroupGetResult" type="{http://Airspan.Netspan.WebServices}NodeGroupDetailGetResult" minOccurs="0"/&gt;
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
    "nodeGroupGetResult"
})
@XmlRootElement(name = "NodeGroupGetResponse")
public class NodeGroupGetResponse {

    @XmlElement(name = "NodeGroupGetResult")
    protected NodeGroupDetailGetResult nodeGroupGetResult;

    /**
     * Gets the value of the nodeGroupGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupDetailGetResult }
     *     
     */
    public NodeGroupDetailGetResult getNodeGroupGetResult() {
        return nodeGroupGetResult;
    }

    /**
     * Sets the value of the nodeGroupGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupDetailGetResult }
     *     
     */
    public void setNodeGroupGetResult(NodeGroupDetailGetResult value) {
        this.nodeGroupGetResult = value;
    }

}
