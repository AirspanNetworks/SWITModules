
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
 *         &lt;element name="NodeGroup" type="{http://Airspan.Netspan.WebServices}NodeGroup" minOccurs="0"/&gt;
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
    "nodeGroup"
})
@XmlRootElement(name = "NodeGroupCreate")
public class NodeGroupCreate {

    @XmlElement(name = "NodeGroup")
    protected NodeGroup nodeGroup;

    /**
     * Gets the value of the nodeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroup }
     *     
     */
    public NodeGroup getNodeGroup() {
        return nodeGroup;
    }

    /**
     * Sets the value of the nodeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroup }
     *     
     */
    public void setNodeGroup(NodeGroup value) {
        this.nodeGroup = value;
    }

}
