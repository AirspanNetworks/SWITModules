
package Netspan.NBI_15_5.Inventory;

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
 *         &lt;element name="NodeInfoGetResult" type="{http://Airspan.Netspan.WebServices}NodeDetailGetResult" minOccurs="0"/>
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
    "nodeInfoGetResult"
})
@XmlRootElement(name = "NodeInfoGetResponse")
public class NodeInfoGetResponse {

    @XmlElement(name = "NodeInfoGetResult")
    protected NodeDetailGetResult nodeInfoGetResult;

    /**
     * Gets the value of the nodeInfoGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeDetailGetResult }
     *     
     */
    public NodeDetailGetResult getNodeInfoGetResult() {
        return nodeInfoGetResult;
    }

    /**
     * Sets the value of the nodeInfoGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeDetailGetResult }
     *     
     */
    public void setNodeInfoGetResult(NodeDetailGetResult value) {
        this.nodeInfoGetResult = value;
    }

}
