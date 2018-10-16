
package Netspan.NBI_16_5.Inventory;

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
 *         &lt;element name="NodeProvisioningStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeProvisioningGetResult" minOccurs="0"/&gt;
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
    "nodeProvisioningStatusGetResult"
})
@XmlRootElement(name = "NodeProvisioningStatusGetResponse")
public class NodeProvisioningStatusGetResponse {

    @XmlElement(name = "NodeProvisioningStatusGetResult")
    protected NodeProvisioningGetResult nodeProvisioningStatusGetResult;

    /**
     * Gets the value of the nodeProvisioningStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeProvisioningGetResult }
     *     
     */
    public NodeProvisioningGetResult getNodeProvisioningStatusGetResult() {
        return nodeProvisioningStatusGetResult;
    }

    /**
     * Sets the value of the nodeProvisioningStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeProvisioningGetResult }
     *     
     */
    public void setNodeProvisioningStatusGetResult(NodeProvisioningGetResult value) {
        this.nodeProvisioningStatusGetResult = value;
    }

}
