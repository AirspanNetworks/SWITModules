
package Netspan.NBI_17_5.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDaysOfWeekRelay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDaysOfWeekRelay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeekRelay" type="{http://Airspan.Netspan.WebServices}DaysOfWeekRelay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDaysOfWeekRelay", propOrder = {
    "daysOfWeekRelay"
})
public class ArrayOfDaysOfWeekRelay {

    @XmlElement(name = "DaysOfWeekRelay")
    @XmlSchemaType(name = "string")
    protected List<DaysOfWeekRelay> daysOfWeekRelay;

    /**
     * Gets the value of the daysOfWeekRelay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeekRelay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeekRelay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeekRelay }
     * 
     * 
     */
    public List<DaysOfWeekRelay> getDaysOfWeekRelay() {
        if (daysOfWeekRelay == null) {
            daysOfWeekRelay = new ArrayList<DaysOfWeekRelay>();
        }
        return this.daysOfWeekRelay;
    }

}
