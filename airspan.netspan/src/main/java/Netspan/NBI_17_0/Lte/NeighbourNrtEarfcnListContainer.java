
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourNrtEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourNrtEarfcnListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NrtEarfcn" type="{http://Airspan.Netspan.WebServices}NeighbourNrtEarfcnConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourNrtEarfcnListContainer", propOrder = {
    "nrtEarfcn"
})
public class NeighbourNrtEarfcnListContainer {

    @XmlElement(name = "NrtEarfcn")
    protected List<NeighbourNrtEarfcnConfig> nrtEarfcn;

    /**
     * Gets the value of the nrtEarfcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nrtEarfcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNrtEarfcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourNrtEarfcnConfig }
     * 
     * 
     */
    public List<NeighbourNrtEarfcnConfig> getNrtEarfcn() {
        if (nrtEarfcn == null) {
            nrtEarfcn = new ArrayList<NeighbourNrtEarfcnConfig>();
        }
        return this.nrtEarfcn;
    }

}
