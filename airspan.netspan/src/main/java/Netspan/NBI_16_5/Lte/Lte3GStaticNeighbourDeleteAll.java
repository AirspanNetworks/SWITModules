
package Netspan.NBI_16_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cell3gStaticNeighbour" type="{http://Airspan.Netspan.WebServices}Cell3gStaticNeighbour" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cell3GStaticNeighbour"
})
@XmlRootElement(name = "Lte3gStaticNeighbourDeleteAll")
public class Lte3GStaticNeighbourDeleteAll {

    @XmlElement(name = "Cell3gStaticNeighbour")
    protected List<Cell3GStaticNeighbour> cell3GStaticNeighbour;

    /**
     * Gets the value of the cell3GStaticNeighbour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cell3GStaticNeighbour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCell3GStaticNeighbour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cell3GStaticNeighbour }
     * 
     * 
     */
    public List<Cell3GStaticNeighbour> getCell3GStaticNeighbour() {
        if (cell3GStaticNeighbour == null) {
            cell3GStaticNeighbour = new ArrayList<Cell3GStaticNeighbour>();
        }
        return this.cell3GStaticNeighbour;
    }

}
