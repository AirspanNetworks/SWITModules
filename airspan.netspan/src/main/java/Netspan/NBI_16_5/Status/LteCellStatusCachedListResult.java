
package Netspan.NBI_16_5.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteCellStatusCachedListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteCellStatusCachedListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellStatus" type="{http://Airspan.Netspan.WebServices}LteCellStatusCachedGetResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteCellStatusCachedListResult", propOrder = {
    "cellStatus"
})
public class LteCellStatusCachedListResult
    extends WsResponse
{

    @XmlElement(name = "CellStatus")
    protected List<LteCellStatusCachedGetResult> cellStatus;

    /**
     * Gets the value of the cellStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteCellStatusCachedGetResult }
     * 
     * 
     */
    public List<LteCellStatusCachedGetResult> getCellStatus() {
        if (cellStatus == null) {
            cellStatus = new ArrayList<LteCellStatusCachedGetResult>();
        }
        return this.cellStatus;
    }

}
