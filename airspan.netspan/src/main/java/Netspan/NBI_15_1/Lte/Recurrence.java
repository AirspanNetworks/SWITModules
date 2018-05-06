
package Netspan.NBI_15_1.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recurrence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recurrence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedRecurrence" type="{http://Airspan.Netspan.WebServices}RecurrencePatterns" minOccurs="0"/>
 *         &lt;element name="Daily" type="{http://Airspan.Netspan.WebServices}RecurrenceDaily" minOccurs="0"/>
 *         &lt;element name="Weekly" type="{http://Airspan.Netspan.WebServices}RecurrenceWeekly" minOccurs="0"/>
 *         &lt;element name="Monthly" type="{http://Airspan.Netspan.WebServices}RecurrenceMonthly" minOccurs="0"/>
 *         &lt;element name="Yearly" type="{http://Airspan.Netspan.WebServices}RecurrenceYearly" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recurrence", propOrder = {
    "selectedRecurrence",
    "daily",
    "weekly",
    "monthly",
    "yearly"
})
public class Recurrence {

    @XmlElementRef(name = "SelectedRecurrence", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<RecurrencePatterns> selectedRecurrence;
    @XmlElement(name = "Daily")
    protected RecurrenceDaily daily;
    @XmlElement(name = "Weekly")
    protected RecurrenceWeekly weekly;
    @XmlElement(name = "Monthly")
    protected RecurrenceMonthly monthly;
    @XmlElement(name = "Yearly")
    protected RecurrenceYearly yearly;

    /**
     * Gets the value of the selectedRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecurrencePatterns }{@code >}
     *     
     */
    public JAXBElement<RecurrencePatterns> getSelectedRecurrence() {
        return selectedRecurrence;
    }

    /**
     * Sets the value of the selectedRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecurrencePatterns }{@code >}
     *     
     */
    public void setSelectedRecurrence(JAXBElement<RecurrencePatterns> value) {
        this.selectedRecurrence = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDaily }
     *     
     */
    public RecurrenceDaily getDaily() {
        return daily;
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDaily }
     *     
     */
    public void setDaily(RecurrenceDaily value) {
        this.daily = value;
    }

    /**
     * Gets the value of the weekly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceWeekly }
     *     
     */
    public RecurrenceWeekly getWeekly() {
        return weekly;
    }

    /**
     * Sets the value of the weekly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceWeekly }
     *     
     */
    public void setWeekly(RecurrenceWeekly value) {
        this.weekly = value;
    }

    /**
     * Gets the value of the monthly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceMonthly }
     *     
     */
    public RecurrenceMonthly getMonthly() {
        return monthly;
    }

    /**
     * Sets the value of the monthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceMonthly }
     *     
     */
    public void setMonthly(RecurrenceMonthly value) {
        this.monthly = value;
    }

    /**
     * Gets the value of the yearly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceYearly }
     *     
     */
    public RecurrenceYearly getYearly() {
        return yearly;
    }

    /**
     * Sets the value of the yearly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceYearly }
     *     
     */
    public void setYearly(RecurrenceYearly value) {
        this.yearly = value;
    }

}
