
package Netspan.NBI_17_0.Lte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDaysOfWeek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDaysOfWeek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeek" type="{http://Airspan.Netspan.WebServices}DaysOfWeek" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDaysOfWeek", propOrder = {
    "daysOfWeek"
})
public class ArrayOfDaysOfWeek {

    @XmlElement(name = "DaysOfWeek")
    @XmlSchemaType(name = "string")
    protected List<DaysOfWeek> daysOfWeek;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeek }
     * 
     * 
     */
    public List<DaysOfWeek> getDaysOfWeek() {
        if (daysOfWeek == null) {
            daysOfWeek = new ArrayList<DaysOfWeek>();
        }
        return this.daysOfWeek;
    }

}
