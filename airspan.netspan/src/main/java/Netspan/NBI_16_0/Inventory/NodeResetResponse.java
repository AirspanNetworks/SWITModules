
package Netspan.NBI_16_0.Inventory;

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
 *         &lt;element name="NodeResetResult" type="{http://Airspan.Netspan.WebServices}NodeActionResult" minOccurs="0"/&gt;
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
    "nodeResetResult"
})
@XmlRootElement(name = "NodeResetResponse")
public class NodeResetResponse {

    @XmlElement(name = "NodeResetResult")
    protected NodeActionResult nodeResetResult;

    /**
     * Gets the value of the nodeResetResult property.
     * 
     * @return
     *     possible object is
     *     {@link NodeActionResult }
     *     
     */
    public NodeActionResult getNodeResetResult() {
        return nodeResetResult;
    }

    /**
     * Sets the value of the nodeResetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeActionResult }
     *     
     */
    public void setNodeResetResult(NodeActionResult value) {
        this.nodeResetResult = value;
    }

}
