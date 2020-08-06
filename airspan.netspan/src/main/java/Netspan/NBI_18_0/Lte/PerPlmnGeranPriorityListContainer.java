
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPlmnGeranPriorityListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPlmnGeranPriorityListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeranPriority" type="{http://Airspan.Netspan.WebServices}PerPlmnGeranPriorityWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPlmnGeranPriorityListContainer", propOrder = {
    "geranPriority"
})
public class PerPlmnGeranPriorityListContainer {

    @XmlElement(name = "GeranPriority")
    protected List<PerPlmnGeranPriorityWs> geranPriority;

    /**
     * Gets the value of the geranPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geranPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeranPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerPlmnGeranPriorityWs }
     * 
     * 
     */
    public List<PerPlmnGeranPriorityWs> getGeranPriority() {
        if (geranPriority == null) {
            geranPriority = new ArrayList<PerPlmnGeranPriorityWs>();
        }
        return this.geranPriority;
    }

}
