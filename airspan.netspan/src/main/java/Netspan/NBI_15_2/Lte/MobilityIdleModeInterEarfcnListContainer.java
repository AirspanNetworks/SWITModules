
package Netspan.NBI_15_2.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityIdleModeInterEarfcnListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityIdleModeInterEarfcnListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterIdleEarfcnEntry" type="{http://Airspan.Netspan.WebServices}MobilityIdleModeInterEarfcn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityIdleModeInterEarfcnListContainer", propOrder = {
    "interIdleEarfcnEntry"
})
public class MobilityIdleModeInterEarfcnListContainer {

    @XmlElement(name = "InterIdleEarfcnEntry")
    protected List<MobilityIdleModeInterEarfcn> interIdleEarfcnEntry;

    /**
     * Gets the value of the interIdleEarfcnEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interIdleEarfcnEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterIdleEarfcnEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityIdleModeInterEarfcn }
     * 
     * 
     */
    public List<MobilityIdleModeInterEarfcn> getInterIdleEarfcnEntry() {
        if (interIdleEarfcnEntry == null) {
            interIdleEarfcnEntry = new ArrayList<MobilityIdleModeInterEarfcn>();
        }
        return this.interIdleEarfcnEntry;
    }

}
