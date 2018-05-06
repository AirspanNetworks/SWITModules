
package Netspan.NBI_15_5.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodicRescanDailyWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodicRescanDailyWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedOption" type="{http://Airspan.Netspan.WebServices}PeriodicRescanOptionsDaily" minOccurs="0"/>
 *         &lt;element name="DailyOptionEveryXDay" type="{http://Airspan.Netspan.WebServices}DailyOptionEveryXDay" minOccurs="0"/>
 *         &lt;element name="DailyOptionEveryWeekDay" type="{http://Airspan.Netspan.WebServices}DailyOptionEveryWeekDay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodicRescanDailyWs", propOrder = {
    "selectedOption",
    "dailyOptionEveryXDay",
    "dailyOptionEveryWeekDay"
})
public class PeriodicRescanDailyWs {

    @XmlElementRef(name = "SelectedOption", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<PeriodicRescanOptionsDaily> selectedOption;
    @XmlElement(name = "DailyOptionEveryXDay")
    protected DailyOptionEveryXDay dailyOptionEveryXDay;
    @XmlElement(name = "DailyOptionEveryWeekDay")
    protected DailyOptionEveryWeekDay dailyOptionEveryWeekDay;

    /**
     * Gets the value of the selectedOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsDaily }{@code >}
     *     
     */
    public JAXBElement<PeriodicRescanOptionsDaily> getSelectedOption() {
        return selectedOption;
    }

    /**
     * Sets the value of the selectedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PeriodicRescanOptionsDaily }{@code >}
     *     
     */
    public void setSelectedOption(JAXBElement<PeriodicRescanOptionsDaily> value) {
        this.selectedOption = value;
    }

    /**
     * Gets the value of the dailyOptionEveryXDay property.
     * 
     * @return
     *     possible object is
     *     {@link DailyOptionEveryXDay }
     *     
     */
    public DailyOptionEveryXDay getDailyOptionEveryXDay() {
        return dailyOptionEveryXDay;
    }

    /**
     * Sets the value of the dailyOptionEveryXDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyOptionEveryXDay }
     *     
     */
    public void setDailyOptionEveryXDay(DailyOptionEveryXDay value) {
        this.dailyOptionEveryXDay = value;
    }

    /**
     * Gets the value of the dailyOptionEveryWeekDay property.
     * 
     * @return
     *     possible object is
     *     {@link DailyOptionEveryWeekDay }
     *     
     */
    public DailyOptionEveryWeekDay getDailyOptionEveryWeekDay() {
        return dailyOptionEveryWeekDay;
    }

    /**
     * Sets the value of the dailyOptionEveryWeekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyOptionEveryWeekDay }
     *     
     */
    public void setDailyOptionEveryWeekDay(DailyOptionEveryWeekDay value) {
        this.dailyOptionEveryWeekDay = value;
    }

}
