
package Netspan.NBI_18_0.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeGroupDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeGroupDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeGroupResultCode" type="{http://Airspan.Netspan.WebServices}NodeGroupResultValues"/&gt;
 *         &lt;element name="NodeGroupResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "NodeGroupDetailResult", propOrder = {
    "nodeGroupResultCode",
    "nodeGroupResultString",
    "nodeGroup"
})
public class NodeGroupDetailResult {

    @XmlElement(name = "NodeGroupResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeGroupResultValues nodeGroupResultCode;
    @XmlElement(name = "NodeGroupResultString")
    protected String nodeGroupResultString;
    @XmlElement(name = "NodeGroup")
    protected NodeGroup nodeGroup;

    /**
     * Gets the value of the nodeGroupResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeGroupResultValues }
     *     
     */
    public NodeGroupResultValues getNodeGroupResultCode() {
        return nodeGroupResultCode;
    }

    /**
     * Sets the value of the nodeGroupResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeGroupResultValues }
     *     
     */
    public void setNodeGroupResultCode(NodeGroupResultValues value) {
        this.nodeGroupResultCode = value;
    }

    /**
     * Gets the value of the nodeGroupResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeGroupResultString() {
        return nodeGroupResultString;
    }

    /**
     * Sets the value of the nodeGroupResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeGroupResultString(String value) {
        this.nodeGroupResultString = value;
    }

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
