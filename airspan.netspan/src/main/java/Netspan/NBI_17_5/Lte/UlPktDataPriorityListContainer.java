
package Netspan.NBI_17_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UlPktDataPriorityListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UlPktDataPriorityListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UlPktDataPriority" type="{http://Airspan.Netspan.WebServices}LteUlPktDataPriorityEntryWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UlPktDataPriorityListContainer", propOrder = {
    "ulPktDataPriority"
})
public class UlPktDataPriorityListContainer {

    @XmlElement(name = "UlPktDataPriority")
    protected List<LteUlPktDataPriorityEntryWs> ulPktDataPriority;

    /**
     * Gets the value of the ulPktDataPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ulPktDataPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUlPktDataPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteUlPktDataPriorityEntryWs }
     * 
     * 
     */
    public List<LteUlPktDataPriorityEntryWs> getUlPktDataPriority() {
        if (ulPktDataPriority == null) {
            ulPktDataPriority = new ArrayList<LteUlPktDataPriorityEntryWs>();
        }
        return this.ulPktDataPriority;
    }

}
