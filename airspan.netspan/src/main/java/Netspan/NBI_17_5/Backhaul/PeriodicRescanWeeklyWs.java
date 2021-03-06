
package Netspan.NBI_17_5.Backhaul;

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
 * &lt;complexType name="PeriodicRescanWeeklyWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysOfWeek" type="{http://Airspan.Netspan.WebServices}ArrayOfDaysOfWeekRelay" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
