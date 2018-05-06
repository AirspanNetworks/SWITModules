
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourNrtDefaultConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourNrtDefaultConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pci" type="{http://Airspan.Netspan.WebServices}NeighbourNrtPciWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourNrtDefaultConfig", propOrder = {
    "pci"
})
public class NeighbourNrtDefaultConfig {

    @XmlElement(name = "Pci")
    protected List<NeighbourNrtPciWs> pci;

    /**
     * Gets the value of the pci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourNrtPciWs }
     * 
     * 
     */
    public List<NeighbourNrtPciWs> getPci() {
        if (pci == null) {
            pci = new ArrayList<NeighbourNrtPciWs>();
        }
        return this.pci;
    }

}
