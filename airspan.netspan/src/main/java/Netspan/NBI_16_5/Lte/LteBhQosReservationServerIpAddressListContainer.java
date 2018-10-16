
package Netspan.NBI_16_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LteBhQosReservationServerIpAddressListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LteBhQosReservationServerIpAddressListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BhQosReservationServerIpAddress" type="{http://Airspan.Netspan.WebServices}LteBhQosReservationServerIpAddressEntryWs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LteBhQosReservationServerIpAddressListContainer", propOrder = {
    "bhQosReservationServerIpAddress"
})
public class LteBhQosReservationServerIpAddressListContainer {

    @XmlElement(name = "BhQosReservationServerIpAddress")
    protected List<LteBhQosReservationServerIpAddressEntryWs> bhQosReservationServerIpAddress;

    /**
     * Gets the value of the bhQosReservationServerIpAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bhQosReservationServerIpAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBhQosReservationServerIpAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LteBhQosReservationServerIpAddressEntryWs }
     * 
     * 
     */
    public List<LteBhQosReservationServerIpAddressEntryWs> getBhQosReservationServerIpAddress() {
        if (bhQosReservationServerIpAddress == null) {
            bhQosReservationServerIpAddress = new ArrayList<LteBhQosReservationServerIpAddressEntryWs>();
        }
        return this.bhQosReservationServerIpAddress;
    }

}
