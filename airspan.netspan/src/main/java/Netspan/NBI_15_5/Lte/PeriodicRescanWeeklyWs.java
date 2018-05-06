
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicRescanWeeklyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicRescanWeeklyWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DaysOfWeek" type="{http://Airspan.Netspan.WebServices}ArrayOfDaysOfWeekRelay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicRescanWeeklyWs", propOrder = {
    "daysOfWeek"
})
public class PeriodicRescanWeeklyWs {

    @XmlElement(name = "DaysOfWeek")
    protected ArrayOfDaysOfWeekRelay daysOfWeek;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDaysOfWeekRelay }
     *     
     */
    public ArrayOfDaysOfWeekRelay getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDaysOfWeekRelay }
     *     
     */
    public void setDaysOfWeek(ArrayOfDaysOfWeekRelay value) {
        this.daysOfWeek = value;
    }

}
