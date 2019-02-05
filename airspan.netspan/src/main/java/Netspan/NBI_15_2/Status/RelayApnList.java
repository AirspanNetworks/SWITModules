
package Netspan.NBI_15_2.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayApnList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelayApnList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApnEntry" type="{http://Airspan.Netspan.WebServices}RelayApnWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelayApnList", propOrder = {
    "apnEntry"
})
public class RelayApnList {

    @XmlElement(name = "ApnEntry")
    protected List<RelayApnWs> apnEntry;

    /**
     * Gets the value of the apnEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apnEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApnEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelayApnWs }
     * 
     * 
     */
    public List<RelayApnWs> getApnEntry() {
        if (apnEntry == null) {
            apnEntry = new ArrayList<RelayApnWs>();
        }
        return this.apnEntry;
    }

}
