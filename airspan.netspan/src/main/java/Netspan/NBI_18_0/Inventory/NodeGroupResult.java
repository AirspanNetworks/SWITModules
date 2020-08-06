
package Netspan.NBI_18_0.Inventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeGroupResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeGroupResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeGroupResultCode" type="{http://Airspan.Netspan.WebServices}NodeGroupResultValues"/&gt;
 *         &lt;element name="NodeGroupResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NodeGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeGroupResult", propOrder = {
    "nodeGroupResultCode",
    "nodeGroupResultString",
    "nodeGroupName"
})
public class NodeGroupResult {

    @XmlElement(name = "NodeGroupResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeGroupResultValues nodeGroupResultCode;
    @XmlElement(name = "NodeGroupResultString")
    protected String nodeGroupResultString;
    @XmlElement(name = "NodeGroupName")
    protected String nodeGroupName;

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
     * Gets the value of the nodeGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeGroupName() {
        return nodeGroupName;
    }

    /**
     * Sets the value of the nodeGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeGroupName(String value) {
        this.nodeGroupName = value;
    }

}
