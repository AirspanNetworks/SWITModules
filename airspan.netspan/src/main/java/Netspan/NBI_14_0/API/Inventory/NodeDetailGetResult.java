
package Netspan.NBI_14_0.API.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeDetailGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeDetailGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeDetailResultCode" type="{http://Airspan.Netspan.WebServices}NodeResultValues"/>
 *         &lt;element name="NodeDetailResultString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}NodeDetailWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeDetailGetResult", propOrder = {
    "nodeDetailResultCode",
    "nodeDetailResultString",
    "nodeDetail"
})
public class NodeDetailGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeDetailResultCode", required = true)
    @XmlSchemaType(name = "string")
    protected NodeResultValues nodeDetailResultCode;
    @XmlElement(name = "NodeDetailResultString")
    protected String nodeDetailResultString;
    @XmlElement(name = "NodeDetail")
    protected List<NodeDetailWs> nodeDetail;

    /**
     * Gets the value of the nodeDetailResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link NodeResultValues }
     *     
     */
    public NodeResultValues getNodeDetailResultCode() {
        return nodeDetailResultCode;
    }

    /**
     * Sets the value of the nodeDetailResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeResultValues }
     *     
     */
    public void setNodeDetailResultCode(NodeResultValues value) {
        this.nodeDetailResultCode = value;
    }

    /**
     * Gets the value of the nodeDetailResultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeDetailResultString() {
        return nodeDetailResultString;
    }

    /**
     * Sets the value of the nodeDetailResultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeDetailResultString(String value) {
        this.nodeDetailResultString = value;
    }

    /**
     * Gets the value of the nodeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeDetailWs }
     * 
     * 
     */
    public List<NodeDetailWs> getNodeDetail() {
        if (nodeDetail == null) {
            nodeDetail = new ArrayList<NodeDetailWs>();
        }
        return this.nodeDetail;
    }

}
