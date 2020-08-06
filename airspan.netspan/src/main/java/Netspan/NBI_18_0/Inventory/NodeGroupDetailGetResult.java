
package Netspan.NBI_18_0.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeGroupDetailGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeGroupDetailGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeGroupDetail" type="{http://Airspan.Netspan.WebServices}NodeGroupDetailResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeGroupDetailGetResult", propOrder = {
    "nodeGroupDetail"
})
public class NodeGroupDetailGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeGroupDetail")
    protected List<NodeGroupDetailResult> nodeGroupDetail;

    /**
     * Gets the value of the nodeGroupDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeGroupDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeGroupDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeGroupDetailResult }
     * 
     * 
     */
    public List<NodeGroupDetailResult> getNodeGroupDetail() {
        if (nodeGroupDetail == null) {
            nodeGroupDetail = new ArrayList<NodeGroupDetailResult>();
        }
        return this.nodeGroupDetail;
    }

}
