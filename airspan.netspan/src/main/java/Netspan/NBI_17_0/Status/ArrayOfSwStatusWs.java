
package Netspan.NBI_17_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSwStatusWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSwStatusWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SwStatusWs" type="{http://Airspan.Netspan.WebServices}SwStatusWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSwStatusWs", propOrder = {
    "swStatusWs"
})
public class ArrayOfSwStatusWs {

    @XmlElement(name = "SwStatusWs", nillable = true)
    protected List<SwStatusWs> swStatusWs;

    /**
     * Gets the value of the swStatusWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swStatusWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwStatusWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwStatusWs }
     * 
     * 
     */
    public List<SwStatusWs> getSwStatusWs() {
        if (swStatusWs == null) {
            swStatusWs = new ArrayList<SwStatusWs>();
        }
        return this.swStatusWs;
    }

}
