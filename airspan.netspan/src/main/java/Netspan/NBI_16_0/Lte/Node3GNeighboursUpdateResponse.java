
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Node3gNeighboursUpdateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Node3gNeighboursUpdateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse">
 *       &lt;sequence>
 *         &lt;element name="Node3gNeighbourUpdateResult" type="{http://Airspan.Netspan.WebServices}Node3gNeighbourUpdateResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Node3gNeighboursUpdateResponse", propOrder = {
    "node3GNeighbourUpdateResult"
})
public class Node3GNeighboursUpdateResponse
    extends WsResponse
{

    @XmlElement(name = "Node3gNeighbourUpdateResult")
    protected List<Node3GNeighbourUpdateResult> node3GNeighbourUpdateResult;

    /**
     * Gets the value of the node3GNeighbourUpdateResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the node3GNeighbourUpdateResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNode3GNeighbourUpdateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node3GNeighbourUpdateResult }
     * 
     * 
     */
    public List<Node3GNeighbourUpdateResult> getNode3GNeighbourUpdateResult() {
        if (node3GNeighbourUpdateResult == null) {
            node3GNeighbourUpdateResult = new ArrayList<Node3GNeighbourUpdateResult>();
        }
        return this.node3GNeighbourUpdateResult;
    }

}
