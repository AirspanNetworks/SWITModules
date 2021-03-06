
package Netspan.NBI_15_1.Inventory;

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
 *         &lt;element name="NodeRfStatusGetResult" type="{http://Airspan.Netspan.WebServices}NodeRfStatusGetResult" minOccurs="0"/>
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
    "nodeRfStatusGetResult"
})
@XmlRootElement(name = "NodeRfStatusGetResponse")
public class NodeRfStatusGetResponse {

    @XmlElement(name = "NodeRfStatusGetResult")
    protected NodeRfStatusGetResult nodeRfStatusGetResult;

    /**
     * Gets the value of the nodeRfStatusGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeRfStatusGetResult }
     *     
     */
    public NodeRfStatusGetResult getNodeRfStatusGetResult() {
        return nodeRfStatusGetResult;
    }

    /**
     * Sets the value of the nodeRfStatusGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeRfStatusGetResult }
     *     
     */
    public void setNodeRfStatusGetResult(NodeRfStatusGetResult value) {
        this.nodeRfStatusGetResult = value;
    }

}
