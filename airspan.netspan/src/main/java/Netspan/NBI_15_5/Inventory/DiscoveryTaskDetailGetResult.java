
package Netspan.NBI_15_5.Inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryTaskDetailGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscoveryTaskDetailGetResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="DiscoveryTaskDetail" type="{http://Airspan.Netspan.WebServices}DiscoveryTaskDetailResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoveryTaskDetailGetResult", propOrder = {
    "discoveryTaskDetail"
})
public class DiscoveryTaskDetailGetResult
    extends WsResponse
{

    @XmlElement(name = "DiscoveryTaskDetail")
    protected List<DiscoveryTaskDetailResult> discoveryTaskDetail;

    /**
     * Gets the value of the discoveryTaskDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discoveryTaskDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscoveryTaskDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscoveryTaskDetailResult }
     * 
     * 
     */
    public List<DiscoveryTaskDetailResult> getDiscoveryTaskDetail() {
        if (discoveryTaskDetail == null) {
            discoveryTaskDetail = new ArrayList<DiscoveryTaskDetailResult>();
        }
        return this.discoveryTaskDetail;
    }

}
