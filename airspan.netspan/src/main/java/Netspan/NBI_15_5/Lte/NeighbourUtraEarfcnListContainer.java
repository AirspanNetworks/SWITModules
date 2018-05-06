
package Netspan.NBI_15_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourUtraEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourUtraEarfcnListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UtraArfcn" type="{http://Airspan.Netspan.WebServices}NeighbourUtraEarfcnConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourUtraEarfcnListContainer", propOrder = {
    "utraArfcn"
})
public class NeighbourUtraEarfcnListContainer {

    @XmlElement(name = "UtraArfcn")
    protected List<NeighbourUtraEarfcnConfig> utraArfcn;

    /**
     * Gets the value of the utraArfcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utraArfcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtraArfcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourUtraEarfcnConfig }
     * 
     * 
     */
    public List<NeighbourUtraEarfcnConfig> getUtraArfcn() {
        if (utraArfcn == null) {
            utraArfcn = new ArrayList<NeighbourUtraEarfcnConfig>();
        }
        return this.utraArfcn;
    }

}
