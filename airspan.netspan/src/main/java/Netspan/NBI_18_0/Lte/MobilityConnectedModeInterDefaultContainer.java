
package Netspan.NBI_18_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedModeInterDefaultContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeInterDefaultContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectedModeInterDefaultEntry" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeFreq" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeInterDefaultContainer", propOrder = {
    "connectedModeInterDefaultEntry"
})
public class MobilityConnectedModeInterDefaultContainer {

    @XmlElement(name = "ConnectedModeInterDefaultEntry")
    protected List<MobilityConnectedModeFreq> connectedModeInterDefaultEntry;

    /**
     * Gets the value of the connectedModeInterDefaultEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedModeInterDefaultEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedModeInterDefaultEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityConnectedModeFreq }
     * 
     * 
     */
    public List<MobilityConnectedModeFreq> getConnectedModeInterDefaultEntry() {
        if (connectedModeInterDefaultEntry == null) {
            connectedModeInterDefaultEntry = new ArrayList<MobilityConnectedModeFreq>();
        }
        return this.connectedModeInterDefaultEntry;
    }

}
