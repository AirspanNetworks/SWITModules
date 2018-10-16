
package Netspan.NBI_16_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteNeighbourListResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteNeighbourListResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://Airspan.Netspan.WebServices}WsResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Neighbour" type="{http://Airspan.Netspan.WebServices}EnbNeighbour" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteNeighbourListResult", propOrder = {
    "neighbour"
})
public class LteNeighbourListResult
    extends WsResponse
{

    @XmlElement(name = "Neighbour")
    protected List<EnbNeighbour> neighbour;

    /**
     * Gets the value of the neighbour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighbour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeighbour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnbNeighbour }
     * 
     * 
     */
    public List<EnbNeighbour> getNeighbour() {
        if (neighbour == null) {
            neighbour = new ArrayList<EnbNeighbour>();
        }
        return this.neighbour;
    }

}
