
package Netspan.NBI_16_0.Lte;

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
 * &lt;complexType name="RecurrenceWeeklyWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysOfWeek" type="{http://Airspan.Netspan.WebServices}ArrayOfDaysOfWeek" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
