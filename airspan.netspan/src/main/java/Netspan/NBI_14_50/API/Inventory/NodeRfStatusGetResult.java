
package Netspan.NBI_14_50.API.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeRfStatusGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeRfStatusGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeRfStatus" type="{http://Airspan.Netspan.WebServices}NodeRfStatusResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeRfStatusGetResult", propOrder = {
    "nodeRfStatus"
})
public class NodeRfStatusGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeRfStatus")
    protected List<NodeRfStatusResult> nodeRfStatus;

    /**
     * Gets the value of the nodeRfStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeRfStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeRfStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeRfStatusResult }
     * 
     * 
     */
    public List<NodeRfStatusResult> getNodeRfStatus() {
        if (nodeRfStatus == null) {
            nodeRfStatus = new ArrayList<NodeRfStatusResult>();
        }
        return this.nodeRfStatus;
    }

}
