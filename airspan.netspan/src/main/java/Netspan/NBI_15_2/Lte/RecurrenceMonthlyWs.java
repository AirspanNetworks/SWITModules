
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceMonthlyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceMonthlyWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedOption" type="{http://Airspan.Netspan.WebServices}CallTraceRecurrenceOptions" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyOption1" type="{http://Airspan.Netspan.WebServices}MonthlyOption1" minOccurs="0"/&gt;
 *         &lt;element name="MonthlyOption2" type="{http://Airspan.Netspan.WebServices}MonthlyOption2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceMonthlyWs", propOrder = {
    "selectedOption",
    "monthlyOption1",
    "monthlyOption2"
})
public class RecurrenceMonthlyWs {

    @XmlElementRef(name = "SelectedOption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceRecurrenceOptions> selectedOption;
    @XmlElement(name = "MonthlyOption1")
    protected MonthlyOption1 monthlyOption1;
    @XmlElement(name = "MonthlyOption2")
    protected MonthlyOption2 monthlyOption2;

    /**
     * Gets the value of the selectedOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallTraceRecurrenceOptions }{@code >}
     *     
     */
    public JAXBElement<CallTraceRecurrenceOptions> getSelectedOption() {
        return selectedOption;
    }

    /**
     * Sets the value of the selectedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallTraceRecurrenceOptions }{@code >}
     *     
     */
    public void setSelectedOption(JAXBElement<CallTraceRecurrenceOptions> value) {
        this.selectedOption = value;
    }

    /**
     * Gets the value of the monthlyOption1 property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyOption1 }
     *     
     */
    public MonthlyOption1 getMonthlyOption1() {
        return monthlyOption1;
    }

    /**
     * Sets the value of the monthlyOption1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyOption1 }
     *     
     */
    public void setMonthlyOption1(MonthlyOption1 value) {
        this.monthlyOption1 = value;
    }

    /**
     * Gets the value of the monthlyOption2 property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyOption2 }
     *     
     */
    public MonthlyOption2 getMonthlyOption2() {
        return monthlyOption2;
    }

    /**
     * Sets the value of the monthlyOption2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyOption2 }
     *     
     */
    public void setMonthlyOption2(MonthlyOption2 value) {
        this.monthlyOption2 = value;
    }

}
