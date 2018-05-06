
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectedDeviceTypeToApnList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedDeviceTypeToApnList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectedDeviceTypeToApnEntry" type="{http://Airspan.Netspan.WebServices}ConnectedDeviceTypeToApnEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedDeviceTypeToApnList", propOrder = {
    "connectedDeviceTypeToApnEntry"
})
public class ConnectedDeviceTypeToApnList {

    @XmlElement(name = "ConnectedDeviceTypeToApnEntry")
    protected List<ConnectedDeviceTypeToApnEntryWs> connectedDeviceTypeToApnEntry;

    /**
     * Gets the value of the connectedDeviceTypeToApnEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedDeviceTypeToApnEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedDeviceTypeToApnEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectedDeviceTypeToApnEntryWs }
     * 
     * 
     */
    public List<ConnectedDeviceTypeToApnEntryWs> getConnectedDeviceTypeToApnEntry() {
        if (connectedDeviceTypeToApnEntry == null) {
            connectedDeviceTypeToApnEntry = new ArrayList<ConnectedDeviceTypeToApnEntryWs>();
        }
        return this.connectedDeviceTypeToApnEntry;
    }

}
