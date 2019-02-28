
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterRatMobilityPerPlmnGroupListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterRatMobilityPerPlmnGroupListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterRatMobilityPerPlmnGroup" type="{http://Airspan.Netspan.WebServices}InterRatMobilityPerPlmnGroupWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterRatMobilityPerPlmnGroupListContainer", propOrder = {
    "interRatMobilityPerPlmnGroup"
})
public class InterRatMobilityPerPlmnGroupListContainer {

    @XmlElement(name = "InterRatMobilityPerPlmnGroup")
    protected List<InterRatMobilityPerPlmnGroupWs> interRatMobilityPerPlmnGroup;

    /**
     * Gets the value of the interRatMobilityPerPlmnGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interRatMobilityPerPlmnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterRatMobilityPerPlmnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterRatMobilityPerPlmnGroupWs }
     * 
     * 
     */
    public List<InterRatMobilityPerPlmnGroupWs> getInterRatMobilityPerPlmnGroup() {
        if (interRatMobilityPerPlmnGroup == null) {
            interRatMobilityPerPlmnGroup = new ArrayList<InterRatMobilityPerPlmnGroupWs>();
        }
        return this.interRatMobilityPerPlmnGroup;
    }

}
