
package Netspan.NBI_15_2.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PciRangeListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PciRangeListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PciRange" type="{http://Airspan.Netspan.WebServices}PciRange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PciRangeListContainer", propOrder = {
    "pciRange"
})
public class PciRangeListContainer {

    @XmlElement(name = "PciRange")
    protected List<PciRange> pciRange;

    /**
     * Gets the value of the pciRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pciRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPciRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PciRange }
     * 
     * 
     */
    public List<PciRange> getPciRange() {
        if (pciRange == null) {
            pciRange = new ArrayList<PciRange>();
        }
        return this.pciRange;
    }

}
