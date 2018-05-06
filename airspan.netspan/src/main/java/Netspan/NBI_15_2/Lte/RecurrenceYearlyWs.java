
package Netspan.NBI_15_2.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurrenceYearlyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceYearlyWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedOption" type="{http://Airspan.Netspan.WebServices}CallTraceRecurrenceOptions" minOccurs="0"/>
 *         &lt;element name="YearlyOption1" type="{http://Airspan.Netspan.WebServices}YearlyOption1" minOccurs="0"/>
 *         &lt;element name="YearlyOption2" type="{http://Airspan.Netspan.WebServices}YearlyOption2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceYearlyWs", propOrder = {
    "selectedOption",
    "yearlyOption1",
    "yearlyOption2"
})
public class RecurrenceYearlyWs {

    @XmlElementRef(name = "SelectedOption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<CallTraceRecurrenceOptions> selectedOption;
    @XmlElement(name = "YearlyOption1")
    protected YearlyOption1 yearlyOption1;
    @XmlElement(name = "YearlyOption2")
    protected YearlyOption2 yearlyOption2;

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
     * Gets the value of the yearlyOption1 property.
     * 
     * @return
     *     possible object is
     *     {@link YearlyOption1 }
     *     
     */
    public YearlyOption1 getYearlyOption1() {
        return yearlyOption1;
    }

    /**
     * Sets the value of the yearlyOption1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearlyOption1 }
     *     
     */
    public void setYearlyOption1(YearlyOption1 value) {
        this.yearlyOption1 = value;
    }

    /**
     * Gets the value of the yearlyOption2 property.
     * 
     * @return
     *     possible object is
     *     {@link YearlyOption2 }
     *     
     */
    public YearlyOption2 getYearlyOption2() {
        return yearlyOption2;
    }

    /**
     * Sets the value of the yearlyOption2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearlyOption2 }
     *     
     */
    public void setYearlyOption2(YearlyOption2 value) {
        this.yearlyOption2 = value;
    }

}
