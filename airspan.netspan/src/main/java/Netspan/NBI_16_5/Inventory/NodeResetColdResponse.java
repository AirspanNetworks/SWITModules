
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
 *         &lt;element name="NodeResetColdResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "nodeResetColdResult"
})
@XmlRootElement(name = "NodeResetColdResponse")
public class NodeResetColdResponse {

    @XmlElement(name = "NodeResetColdResult")
    protected NodeActionResult nodeResetColdResult;

    /**
     * Gets the value of the nodeResetColdResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getNodeResetColdResult() {
        return nodeResetColdResult;
    }

    /**
     * Sets the value of the nodeResetColdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setNodeResetColdResult(NodeActionResult value) {
        this.nodeResetColdResult = value;
    }

}
