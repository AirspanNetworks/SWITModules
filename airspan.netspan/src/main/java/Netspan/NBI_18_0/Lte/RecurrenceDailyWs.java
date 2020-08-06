
package Netspan.NBI_18_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceDailyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceDailyWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedOption" type="{http://Airspan.Netspan.WebServices}CallTraceRecurrenceOptions" minOccurs="0"/&gt;
 *         &lt;element name="DailyOption1" type="{http://Airspan.Netspan.WebServices}DailyOption1" minOccurs="0"/&gt;
 *         &lt;element name="DailyOption2" type="{http://Airspan.Netspan.WebServices}DailyOption2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceDailyWs", propOrder = {
    "selectedOption",
    "dailyOption1",
    "dailyOption2"
})
public class RecurrenceDailyWs {

    @XmlElementRef(name = "SelectedOption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceRecurrenceOptions> selectedOption;
    @XmlElement(name = "DailyOption1")
    protected DailyOption1 dailyOption1;
    @XmlElement(name = "DailyOption2")
    protected DailyOption2 dailyOption2;

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
     * Gets the value of the dailyOption1 property.
     * 
     * @return
     *     possible object is
     *     {@link DailyOption1 }
     *     
     */
    public DailyOption1 getDailyOption1() {
        return dailyOption1;
    }

    /**
     * Sets the value of the dailyOption1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyOption1 }
     *     
     */
    public void setDailyOption1(DailyOption1 value) {
        this.dailyOption1 = value;
    }

    /**
     * Gets the value of the dailyOption2 property.
     * 
     * @return
     *     possible object is
     *     {@link DailyOption2 }
     *     
     */
    public DailyOption2 getDailyOption2() {
        return dailyOption2;
    }

    /**
     * Sets the value of the dailyOption2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyOption2 }
     *     
     */
    public void setDailyOption2(DailyOption2 value) {
        this.dailyOption2 = value;
    }

}
