
package Netspan.NBI_16_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayDonorCellListGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayDonorCellListGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NodeResult" type="{http://Airspan.Netspan.WebServices}RelayDonorCellListResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayDonorCellListGetResult", propOrder = {
    "nodeResult"
})
public class RelayDonorCellListGetResult
    extends WsResponse
{

    @XmlElement(name = "NodeResult")
    protected List<RelayDonorCellListResult> nodeResult;

    /**
     * Gets the value of the nodeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayDonorCellListResult }
     * 
     * 
     */
    public List<RelayDonorCellListResult> getNodeResult() {
        if (nodeResult == null) {
            nodeResult = new ArrayList<RelayDonorCellListResult>();
        }
        return this.nodeResult;
    }

}
