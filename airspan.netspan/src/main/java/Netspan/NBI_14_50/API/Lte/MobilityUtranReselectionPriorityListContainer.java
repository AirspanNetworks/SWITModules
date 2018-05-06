
package Netspan.NBI_14_50.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityUtranReselectionPriorityListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityUtranReselectionPriorityListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReselectionPriority" type="{http://Airspan.Netspan.WebServices}MobilityUtranReselectionPriorityEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityUtranReselectionPriorityListContainer", propOrder = {
    "reselectionPriority"
})
public class MobilityUtranReselectionPriorityListContainer {

    @XmlElement(name = "ReselectionPriority")
    protected List<MobilityUtranReselectionPriorityEntryWs> reselectionPriority;

    /**
     * Gets the value of the reselectionPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reselectionPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReselectionPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityUtranReselectionPriorityEntryWs }
     * 
     * 
     */
    public List<MobilityUtranReselectionPriorityEntryWs> getReselectionPriority() {
        if (reselectionPriority == null) {
            reselectionPriority = new ArrayList<MobilityUtranReselectionPriorityEntryWs>();
        }
        return this.reselectionPriority;
    }

}
