
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lte3gNeighbourResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lte3gNeighbourResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node3gNeighbourResult" type="{http://Airspan.Netspan.WebServices}Cell3gNeighboursResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lte3gNeighbourResponse", propOrder = {
    "node3GNeighbourResult"
})
public class Lte3GNeighbourResponse
    extends WsResponse
{

    @XmlElement(name = "Node3gNeighbourResult")
    protected List<Cell3GNeighboursResult> node3GNeighbourResult;

    /**
     * Gets the value of the node3GNeighbourResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node3GNeighbourResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode3GNeighbourResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cell3GNeighboursResult }
     * 
     * 
     */
    public List<Cell3GNeighboursResult> getNode3GNeighbourResult() {
        if (node3GNeighbourResult == null) {
            node3GNeighbourResult = new ArrayList<Cell3GNeighboursResult>();
        }
        return this.node3GNeighbourResult;
    }

}
