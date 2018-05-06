
package Netspan.NBI_15_1.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeManagementModeGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeManagementModeGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="NodeDetail" type="{http://Airspan.Netspan.WebServices}ManagementModeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeManagementModeGetResult", propOrder = {
    "nodeDetail"
})
public class NodeManagementModeGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeDetail")
    protected List<ManagementModeResult> nodeDetail;

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
     * {@link ManagementModeResult }
     * 
     * 
     */
    public List<ManagementModeResult> getNodeDetail() {
        if (nodeDetail == null) {
            nodeDetail = new ArrayList<ManagementModeResult>();
        }
        return this.nodeDetail;
    }

}
