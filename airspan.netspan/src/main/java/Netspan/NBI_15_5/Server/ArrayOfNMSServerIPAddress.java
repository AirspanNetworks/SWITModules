
package Netspan.NBI_15_5.Server;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNMSServerIPAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNMSServerIPAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NMSServerIPAddress" type="{http://Airspan.Netspan.WebServices}NMSServerIPAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNMSServerIPAddress", propOrder = {
    "nmsServerIPAddress"
})
public class ArrayOfNMSServerIPAddress {

    @XmlElement(name = "NMSServerIPAddress", nillable = true)
    protected List<NMSServerIPAddress> nmsServerIPAddress;

    /**
     * Gets the value of the nmsServerIPAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nmsServerIPAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNMSServerIPAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NMSServerIPAddress }
     * 
     * 
     */
    public List<NMSServerIPAddress> getNMSServerIPAddress() {
        if (nmsServerIPAddress == null) {
            nmsServerIPAddress = new ArrayList<NMSServerIPAddress>();
        }
        return this.nmsServerIPAddress;
    }

}
