
package Netspan.NBI_18_0.Status;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIPv6AddressWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIPv6AddressWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IPv6AddressWs" type="{http://Airspan.Netspan.WebServices}IPv6AddressWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIPv6AddressWs", propOrder = {
    "iPv6AddressWs"
})
public class ArrayOfIPv6AddressWs {

    @XmlElement(name = "IPv6AddressWs", nillable = true)
    protected List<IPv6AddressWs> iPv6AddressWs;

    /**
     * Gets the value of the iPv6AddressWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iPv6AddressWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPv6AddressWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPv6AddressWs }
     * 
     * 
     */
    public List<IPv6AddressWs> getIPv6AddressWs() {
        if (iPv6AddressWs == null) {
            iPv6AddressWs = new ArrayList<IPv6AddressWs>();
        }
        return this.iPv6AddressWs;
    }

}
