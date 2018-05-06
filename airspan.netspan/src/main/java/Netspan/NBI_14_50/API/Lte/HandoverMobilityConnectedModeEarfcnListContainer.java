
package Netspan.NBI_14_50.API.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandoverMobilityConnectedModeEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandoverMobilityConnectedModeEarfcnListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectedModeHandoverEarfcn" type="{http://Airspan.Netspan.WebServices}HandoverEarfcn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandoverMobilityConnectedModeEarfcnListContainer", propOrder = {
    "connectedModeHandoverEarfcn"
})
public class HandoverMobilityConnectedModeEarfcnListContainer {

    @XmlElement(name = "ConnectedModeHandoverEarfcn")
    protected List<HandoverEarfcn> connectedModeHandoverEarfcn;

    /**
     * Gets the value of the connectedModeHandoverEarfcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedModeHandoverEarfcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedModeHandoverEarfcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandoverEarfcn }
     * 
     * 
     */
    public List<HandoverEarfcn> getConnectedModeHandoverEarfcn() {
        if (connectedModeHandoverEarfcn == null) {
            connectedModeHandoverEarfcn = new ArrayList<HandoverEarfcn>();
        }
        return this.connectedModeHandoverEarfcn;
    }

}
