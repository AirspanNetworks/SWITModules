
package Netspan.NBI_16_0.Backhaul;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicRescanMonthlyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicRescanMonthlyWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedOption" type="{http://Airspan.Netspan.WebServices}PeriodicRescanOptionsMonthly" minOccurs="0"/&gt;
 *         &lt;element name="DateOfEveryXMonths" type="{http://Airspan.Netspan.WebServices}MonthlyOptionDateOfEveryXMonths" minOccurs="0"/&gt;
 *         &lt;element name="DayWeekOfEveryYMonths" type="{http://Airspan.Netspan.WebServices}MonthlyOptionDayWeekOfEveryYMonths" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicRescanMonthlyWs", propOrder = {
    "selectedOption",
    "dateOfEveryXMonths",
    "dayWeekOfEveryYMonths"
})
public class PeriodicRescanMonthlyWs {

    @XmlElementRef(name = "SelectedOption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodicRescanOptionsMonthly> selectedOption;
    @XmlElement(name = "DateOfEveryXMonths")
    protected MonthlyOptionDateOfEveryXMonths dateOfEveryXMonths;
    @XmlElement(name = "DayWeekOfEveryYMonths")
    protected MonthlyOptionDayWeekOfEveryYMonths dayWeekOfEveryYMonths;

    /**
     * Gets the value of the selectedOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsMonthly }{@code >}
     *     
     */
    public JAXBElement<PeriodicRescanOptionsMonthly> getSelectedOption() {
        return selectedOption;
    }

    /**
     * Sets the value of the selectedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsMonthly }{@code >}
     *     
     */
    public void setSelectedOption(JAXBElement<PeriodicRescanOptionsMonthly> value) {
        this.selectedOption = value;
    }

    /**
     * Gets the value of the dateOfEveryXMonths property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyOptionDateOfEveryXMonths }
     *     
     */
    public MonthlyOptionDateOfEveryXMonths getDateOfEveryXMonths() {
        return dateOfEveryXMonths;
    }

    /**
     * Sets the value of the dateOfEveryXMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyOptionDateOfEveryXMonths }
     *     
     */
    public void setDateOfEveryXMonths(MonthlyOptionDateOfEveryXMonths value) {
        this.dateOfEveryXMonths = value;
    }

    /**
     * Gets the value of the dayWeekOfEveryYMonths property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyOptionDayWeekOfEveryYMonths }
     *     
     */
    public MonthlyOptionDayWeekOfEveryYMonths getDayWeekOfEveryYMonths() {
        return dayWeekOfEveryYMonths;
    }

    /**
     * Sets the value of the dayWeekOfEveryYMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyOptionDayWeekOfEveryYMonths }
     *     
     */
    public void setDayWeekOfEveryYMonths(MonthlyOptionDayWeekOfEveryYMonths value) {
        this.dayWeekOfEveryYMonths = value;
    }

}
