
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RohcQciDetailsListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RohcQciDetailsListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RohcQciDetails" type="{http://Airspan.Netspan.WebServices}RohcQciDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RohcQciDetailsListContainer", propOrder = {
    "rohcQciDetails"
})
public class RohcQciDetailsListContainer {

    @XmlElement(name = "RohcQciDetails")
    protected List<RohcQciDetails> rohcQciDetails;

    /**
     * Gets the value of the rohcQciDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rohcQciDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRohcQciDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RohcQciDetails }
     * 
     * 
     */
    public List<RohcQciDetails> getRohcQciDetails() {
        if (rohcQciDetails == null) {
            rohcQciDetails = new ArrayList<RohcQciDetails>();
        }
        return this.rohcQciDetails;
    }

}
