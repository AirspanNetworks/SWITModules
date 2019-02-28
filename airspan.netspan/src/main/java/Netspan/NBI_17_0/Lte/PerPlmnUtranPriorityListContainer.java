
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPlmnUtranPriorityListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPlmnUtranPriorityListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UtranPriority" type="{http://Airspan.Netspan.WebServices}PerPlmnUtranPriorityWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPlmnUtranPriorityListContainer", propOrder = {
    "utranPriority"
})
public class PerPlmnUtranPriorityListContainer {

    @XmlElement(name = "UtranPriority")
    protected List<PerPlmnUtranPriorityWs> utranPriority;

    /**
     * Gets the value of the utranPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utranPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtranPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerPlmnUtranPriorityWs }
     * 
     * 
     */
    public List<PerPlmnUtranPriorityWs> getUtranPriority() {
        if (utranPriority == null) {
            utranPriority = new ArrayList<PerPlmnUtranPriorityWs>();
        }
        return this.utranPriority;
    }

}
