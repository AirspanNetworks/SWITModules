
package Netspan.NBI_16_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanMacAddressListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanMacAddressListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LanMacAddressEntry" type="{http://Airspan.Netspan.WebServices}LanMacAddressEntryWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanMacAddressListContainer", propOrder = {
    "lanMacAddressEntry"
})
public class LanMacAddressListContainer {

    @XmlElement(name = "LanMacAddressEntry")
    protected List<LanMacAddressEntryWs> lanMacAddressEntry;

    /**
     * Gets the value of the lanMacAddressEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lanMacAddressEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanMacAddressEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanMacAddressEntryWs }
     * 
     * 
     */
    public List<LanMacAddressEntryWs> getLanMacAddressEntry() {
        if (lanMacAddressEntry == null) {
            lanMacAddressEntry = new ArrayList<LanMacAddressEntryWs>();
        }
        return this.lanMacAddressEntry;
    }

}
