
package Netspan.NBI_15_2.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiCellProfileGetResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiCellProfileGetResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiCellProfileResult" type="{http://Airspan.Netspan.WebServices}MultiCellProfileResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCellProfileGetResult", propOrder = {
    "multiCellProfileResult"
})
public class MultiCellProfileGetResult
    extends WsResponse
{

    @XmlElement(name = "MultiCellProfileResult")
    protected List<MultiCellProfileResult> multiCellProfileResult;

    /**
     * Gets the value of the multiCellProfileResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiCellProfileResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiCellProfileResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiCellProfileResult }
     * 
     * 
     */
    public List<MultiCellProfileResult> getMultiCellProfileResult() {
        if (multiCellProfileResult == null) {
            multiCellProfileResult = new ArrayList<MultiCellProfileResult>();
        }
        return this.multiCellProfileResult;
    }

}
