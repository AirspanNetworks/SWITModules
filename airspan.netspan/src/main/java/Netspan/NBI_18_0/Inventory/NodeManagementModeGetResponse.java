
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
 *         &lt;element name="NodeManagementModeGetResult" type="{http://Airspan.Netspan.WebServices}NodeManagementModeGetResult" minOccurs="0"/&gt;
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
    "nodeManagementModeGetResult"
})
@XmlRootElement(name = "NodeManagementModeGetResponse")
public class NodeManagementModeGetResponse {

    @XmlElement(name = "NodeManagementModeGetResult")
    protected NodeManagementModeGetResult nodeManagementModeGetResult;

    /**
     * Gets the value of the nodeManagementModeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeManagementModeGetResult }
     *     
     */
    public NodeManagementModeGetResult getNodeManagementModeGetResult() {
        return nodeManagementModeGetResult;
    }

    /**
     * Sets the value of the nodeManagementModeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeManagementModeGetResult }
     *     
     */
    public void setNodeManagementModeGetResult(NodeManagementModeGetResult value) {
        this.nodeManagementModeGetResult = value;
    }

}
