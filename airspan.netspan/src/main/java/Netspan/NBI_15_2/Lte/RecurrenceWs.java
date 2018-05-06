
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedRecurrence" type="{http://Airspan.Netspan.WebServices}CallTraceRecurrencePatterns" minOccurs="0"/>
 *         &lt;element name="Daily" type="{http://Airspan.Netspan.WebServices}RecurrenceDailyWs" minOccurs="0"/>
 *         &lt;element name="Weekly" type="{http://Airspan.Netspan.WebServices}RecurrenceWeeklyWs" minOccurs="0"/>
 *         &lt;element name="Monthly" type="{http://Airspan.Netspan.WebServices}RecurrenceMonthlyWs" minOccurs="0"/>
 *         &lt;element name="Yearly" type="{http://Airspan.Netspan.WebServices}RecurrenceYearlyWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceWs", propOrder = {
    "selectedRecurrence",
    "daily",
    "weekly",
    "monthly",
    "yearly"
})
public class RecurrenceWs {

    @XmlElementRef(name = "SelectedRecurrence", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceRecurrencePatterns> selectedRecurrence;
    @XmlElement(name = "Daily")
    protected RecurrenceDailyWs daily;
    @XmlElement(name = "Weekly")
    protected RecurrenceWeeklyWs weekly;
    @XmlElement(name = "Monthly")
    protected RecurrenceMonthlyWs monthly;
    @XmlElement(name = "Yearly")
    protected RecurrenceYearlyWs yearly;

    /**
     * Gets the value of the selectedRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceRecurrencePatterns }{@code >}
     *     
     */
    public JAXBElement<CallTraceRecurrencePatterns> getSelectedRecurrence() {
        return selectedRecurrence;
    }

    /**
     * Sets the value of the selectedRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceRecurrencePatterns }{@code >}
     *     
     */
    public void setSelectedRecurrence(JAXBElement<CallTraceRecurrencePatterns> value) {
        this.selectedRecurrence = value;
    }

    /**
     * Gets the value of the daily property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDailyWs }
     *     
     */
    public RecurrenceDailyWs getDaily() {
        return daily;
    }

    /**
     * Sets the value of the daily property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDailyWs }
     *     
     */
    public void setDaily(RecurrenceDailyWs value) {
        this.daily = value;
    }

    /**
     * Gets the value of the weekly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceWeeklyWs }
     *     
     */
    public RecurrenceWeeklyWs getWeekly() {
        return weekly;
    }

    /**
     * Sets the value of the weekly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceWeeklyWs }
     *     
     */
    public void setWeekly(RecurrenceWeeklyWs value) {
        this.weekly = value;
    }

    /**
     * Gets the value of the monthly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceMonthlyWs }
     *     
     */
    public RecurrenceMonthlyWs getMonthly() {
        return monthly;
    }

    /**
     * Sets the value of the monthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceMonthlyWs }
     *     
     */
    public void setMonthly(RecurrenceMonthlyWs value) {
        this.monthly = value;
    }

    /**
     * Gets the value of the yearly property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceYearlyWs }
     *     
     */
    public RecurrenceYearlyWs getYearly() {
        return yearly;
    }

    /**
     * Sets the value of the yearly property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceYearlyWs }
     *     
     */
    public void setYearly(RecurrenceYearlyWs value) {
        this.yearly = value;
    }

}
