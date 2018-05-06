
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourHomeEnbEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourHomeEnbEarfcnListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeEnbEarfcn" type="{http://Airspan.Netspan.WebServices}NeighbourHomeEnbEarfcnConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourHomeEnbEarfcnListContainer", propOrder = {
    "homeEnbEarfcn"
})
public class NeighbourHomeEnbEarfcnListContainer {

    @XmlElement(name = "HomeEnbEarfcn")
    protected List<NeighbourHomeEnbEarfcnConfig> homeEnbEarfcn;

    /**
     * Gets the value of the homeEnbEarfcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeEnbEarfcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeEnbEarfcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourHomeEnbEarfcnConfig }
     * 
     * 
     */
    public List<NeighbourHomeEnbEarfcnConfig> getHomeEnbEarfcn() {
        if (homeEnbEarfcn == null) {
            homeEnbEarfcn = new ArrayList<NeighbourHomeEnbEarfcnConfig>();
        }
        return this.homeEnbEarfcn;
    }

}
