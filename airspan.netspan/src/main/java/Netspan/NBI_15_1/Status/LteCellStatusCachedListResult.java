
package Netspan.NBI_15_1.Status;

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
 * &lt;complexType name="LteCellStatusCachedListResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="CellStatus" type="{http://Airspan.Netspan.WebServices}LteCellStatusCachedGetResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
