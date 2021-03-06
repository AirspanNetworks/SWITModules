
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighbourHomeEnbBandListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighbourHomeEnbBandListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HomeEnbBand" type="{http://Airspan.Netspan.WebServices}NeighbourHomeEnbBandConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighbourHomeEnbBandListContainer", propOrder = {
    "homeEnbBand"
})
public class NeighbourHomeEnbBandListContainer {

    @XmlElement(name = "HomeEnbBand")
    protected List<NeighbourHomeEnbBandConfig> homeEnbBand;

    /**
     * Gets the value of the homeEnbBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homeEnbBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomeEnbBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeighbourHomeEnbBandConfig }
     * 
     * 
     */
    public List<NeighbourHomeEnbBandConfig> getHomeEnbBand() {
        if (homeEnbBand == null) {
            homeEnbBand = new ArrayList<NeighbourHomeEnbBandConfig>();
        }
        return this.homeEnbBand;
    }

}
