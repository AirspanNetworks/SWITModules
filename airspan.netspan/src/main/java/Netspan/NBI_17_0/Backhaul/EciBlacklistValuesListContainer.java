
package Netspan.NBI_17_0.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EciBlacklistValuesListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EciBlacklistValuesListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EciBlacklistValuesEntry" type="{http://Airspan.Netspan.WebServices}EciBlackListEntryWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EciBlacklistValuesListContainer", propOrder = {
    "eciBlacklistValuesEntry"
})
public class EciBlacklistValuesListContainer {

    @XmlElement(name = "EciBlacklistValuesEntry")
    protected List<EciBlackListEntryWs> eciBlacklistValuesEntry;

    /**
     * Gets the value of the eciBlacklistValuesEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eciBlacklistValuesEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEciBlacklistValuesEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EciBlackListEntryWs }
     * 
     * 
     */
    public List<EciBlackListEntryWs> getEciBlacklistValuesEntry() {
        if (eciBlacklistValuesEntry == null) {
            eciBlacklistValuesEntry = new ArrayList<EciBlackListEntryWs>();
        }
        return this.eciBlacklistValuesEntry;
    }

}
