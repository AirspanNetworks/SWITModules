
package Netspan.NBI_16_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityInterRatMeasCfgListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityInterRatMeasCfgListContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterRatMeasConfigEntry" type="{http://Airspan.Netspan.WebServices}MobilityInterRatMeasCfgEntryWs" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityInterRatMeasCfgListContainer", propOrder = {
    "interRatMeasConfigEntry"
})
public class MobilityInterRatMeasCfgListContainer {

    @XmlElement(name = "InterRatMeasConfigEntry")
    protected List<MobilityInterRatMeasCfgEntryWs> interRatMeasConfigEntry;

    /**
     * Gets the value of the interRatMeasConfigEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interRatMeasConfigEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterRatMeasConfigEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityInterRatMeasCfgEntryWs }
     * 
     * 
     */
    public List<MobilityInterRatMeasCfgEntryWs> getInterRatMeasConfigEntry() {
        if (interRatMeasConfigEntry == null) {
            interRatMeasConfigEntry = new ArrayList<MobilityInterRatMeasCfgEntryWs>();
        }
        return this.interRatMeasConfigEntry;
    }

}
