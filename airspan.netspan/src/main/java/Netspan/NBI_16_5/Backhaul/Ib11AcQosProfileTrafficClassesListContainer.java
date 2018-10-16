
package Netspan.NBI_16_5.Backhaul;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ib11acQosProfileTrafficClassesListContainer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ib11acQosProfileTrafficClassesListContainer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrafficClasses" type="{http://Airspan.Netspan.WebServices}Ib11acQosProfileTrafficClasses" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ib11acQosProfileTrafficClassesListContainer", propOrder = {
    "trafficClasses"
})
public class Ib11AcQosProfileTrafficClassesListContainer {

    @XmlElement(name = "TrafficClasses")
    protected List<Ib11AcQosProfileTrafficClasses> trafficClasses;

    /**
     * Gets the value of the trafficClasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficClasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficClasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ib11AcQosProfileTrafficClasses }
     * 
     * 
     */
    public List<Ib11AcQosProfileTrafficClasses> getTrafficClasses() {
        if (trafficClasses == null) {
            trafficClasses = new ArrayList<Ib11AcQosProfileTrafficClasses>();
        }
        return this.trafficClasses;
    }

}
