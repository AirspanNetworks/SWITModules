
package Netspan.NBI_16_5.Software;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoftwareStatusGetWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoftwareStatusGetWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeSoftwareStatus" type="{http://Airspan.Netspan.WebServices}NodeSoftwareStatusResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareStatusGetWs", propOrder = {
    "nodeSoftwareStatus"
})
public class SoftwareStatusGetWs
    extends WsResponse
{

    @XmlElement(name = "NodeSoftwareStatus")
    protected List<NodeSoftwareStatusResult> nodeSoftwareStatus;

    /**
     * Gets the value of the nodeSoftwareStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeSoftwareStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeSoftwareStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeSoftwareStatusResult }
     * 
     * 
     */
    public List<NodeSoftwareStatusResult> getNodeSoftwareStatus() {
        if (nodeSoftwareStatus == null) {
            nodeSoftwareStatus = new ArrayList<NodeSoftwareStatusResult>();
        }
        return this.nodeSoftwareStatus;
    }

}
