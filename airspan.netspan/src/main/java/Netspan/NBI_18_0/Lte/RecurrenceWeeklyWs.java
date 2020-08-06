
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceWeeklyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceWeeklyWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeek" type="{http://Airspan.Netspan.WebServices}ArrayOfDaysOfWeek" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceWeeklyWs", propOrder = {
    "daysOfWeek"
})
public class RecurrenceWeeklyWs {

    @XmlElement(name = "DaysOfWeek")
    protected ArrayOfDaysOfWeek daysOfWeek;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDaysOfWeek }
     *     
     */
    public ArrayOfDaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDaysOfWeek }
     *     
     */
    public void setDaysOfWeek(ArrayOfDaysOfWeek value) {
        this.daysOfWeek = value;
    }

}
