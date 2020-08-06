
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeCachedLocationStatusGetListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeCachedLocationStatusGetListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeLocationStatus" type="{http://Airspan.Netspan.WebServices}NodeCachedLocationStatusGetResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeCachedLocationStatusGetListResult", propOrder = {
    "nodeLocationStatus"
})
public class NodeCachedLocationStatusGetListResult
    extends WsResponse
{

    @XmlElement(name = "NodeLocationStatus")
    protected List<NodeCachedLocationStatusGetResult> nodeLocationStatus;

    /**
     * Gets the value of the nodeLocationStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeLocationStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeLocationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeCachedLocationStatusGetResult }
     * 
     * 
     */
    public List<NodeCachedLocationStatusGetResult> getNodeLocationStatus() {
        if (nodeLocationStatus == null) {
            nodeLocationStatus = new ArrayList<NodeCachedLocationStatusGetResult>();
        }
        return this.nodeLocationStatus;
    }

}
