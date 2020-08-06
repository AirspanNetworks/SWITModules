
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNeighbourResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNeighbourResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LteNeighbourResult" type="{http://Airspan.Netspan.WebServices}LteNeighbourResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNeighbourResponse", propOrder = {
    "lteNeighbourResult"
})
public class LteNeighbourResponse
    extends WsResponse
{

    @XmlElement(name = "LteNeighbourResult")
    protected List<LteNeighbourResult> lteNeighbourResult;

    /**
     * Gets the value of the lteNeighbourResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lteNeighbourResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLteNeighbourResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteNeighbourResult }
     * 
     * 
     */
    public List<LteNeighbourResult> getLteNeighbourResult() {
        if (lteNeighbourResult == null) {
            lteNeighbourResult = new ArrayList<LteNeighbourResult>();
        }
        return this.lteNeighbourResult;
    }

}
