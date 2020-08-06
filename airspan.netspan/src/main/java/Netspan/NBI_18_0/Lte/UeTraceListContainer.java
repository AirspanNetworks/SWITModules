
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UeTraceListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UeTraceListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UeTrace" type="{http://Airspan.Netspan.WebServices}WSUeTraceEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UeTraceListContainer", propOrder = {
    "ueTrace"
})
public class UeTraceListContainer {

    @XmlElement(name = "UeTrace")
    protected List<WSUeTraceEntry> ueTrace;

    /**
     * Gets the value of the ueTrace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ueTrace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUeTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSUeTraceEntry }
     * 
     * 
     */
    public List<WSUeTraceEntry> getUeTrace() {
        if (ueTrace == null) {
            ueTrace = new ArrayList<WSUeTraceEntry>();
        }
        return this.ueTrace;
    }

}
