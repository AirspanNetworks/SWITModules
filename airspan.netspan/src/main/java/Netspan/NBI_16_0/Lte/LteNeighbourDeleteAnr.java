
package Netspan.NBI_16_0.Lte;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnrNeighbour" type="{http://Airspan.Netspan.WebServices}LteAnrNeighbour" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anrNeighbour"
})
@XmlRootElement(name = "LteNeighbourDeleteAnr")
public class LteNeighbourDeleteAnr {

    @XmlElement(name = "AnrNeighbour")
    protected List<LteAnrNeighbour> anrNeighbour;

    /**
     * Gets the value of the anrNeighbour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anrNeighbour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnrNeighbour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteAnrNeighbour }
     * 
     * 
     */
    public List<LteAnrNeighbour> getAnrNeighbour() {
        if (anrNeighbour == null) {
            anrNeighbour = new ArrayList<LteAnrNeighbour>();
        }
        return this.anrNeighbour;
    }

}
