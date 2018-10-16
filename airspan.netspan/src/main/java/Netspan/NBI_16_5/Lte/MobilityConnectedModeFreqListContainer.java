
package Netspan.NBI_16_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityConnectedModeFreqListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityConnectedModeFreqListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectedModeEarfcnEntry" type="{http://Airspan.Netspan.WebServices}MobilityConnectedModeEarfcn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityConnectedModeFreqListContainer", propOrder = {
    "connectedModeEarfcnEntry"
})
public class MobilityConnectedModeFreqListContainer {

    @XmlElement(name = "ConnectedModeEarfcnEntry")
    protected List<MobilityConnectedModeEarfcn> connectedModeEarfcnEntry;

    /**
     * Gets the value of the connectedModeEarfcnEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedModeEarfcnEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedModeEarfcnEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityConnectedModeEarfcn }
     * 
     * 
     */
    public List<MobilityConnectedModeEarfcn> getConnectedModeEarfcnEntry() {
        if (connectedModeEarfcnEntry == null) {
            connectedModeEarfcnEntry = new ArrayList<MobilityConnectedModeEarfcn>();
        }
        return this.connectedModeEarfcnEntry;
    }

}
