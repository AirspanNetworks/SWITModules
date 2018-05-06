
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedDeviceVciToTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedDeviceVciToTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectedDeviceVciToTypeEntry" type="{http://Airspan.Netspan.WebServices}ConnectedDeviceVciToTypeEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedDeviceVciToTypeList", propOrder = {
    "connectedDeviceVciToTypeEntry"
})
public class ConnectedDeviceVciToTypeList {

    @XmlElement(name = "ConnectedDeviceVciToTypeEntry")
    protected List<ConnectedDeviceVciToTypeEntryWs> connectedDeviceVciToTypeEntry;

    /**
     * Gets the value of the connectedDeviceVciToTypeEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedDeviceVciToTypeEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedDeviceVciToTypeEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectedDeviceVciToTypeEntryWs }
     * 
     * 
     */
    public List<ConnectedDeviceVciToTypeEntryWs> getConnectedDeviceVciToTypeEntry() {
        if (connectedDeviceVciToTypeEntry == null) {
            connectedDeviceVciToTypeEntry = new ArrayList<ConnectedDeviceVciToTypeEntryWs>();
        }
        return this.connectedDeviceVciToTypeEntry;
    }

}
