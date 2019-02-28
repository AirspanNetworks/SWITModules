
package Netspan.NBI_17_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeighborManagementWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighborManagementWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NghStatusWaitTimeIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NghStatusWaitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="X2GuardPeriodIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="X2GuardPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighborManagementWs", propOrder = {
    "nghStatusWaitTimeIsDefault",
    "nghStatusWaitTime",
    "x2GuardPeriodIsDefault",
    "x2GuardPeriod"
})
public class NeighborManagementWs {

    @XmlElementRef(name = "NghStatusWaitTimeIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> nghStatusWaitTimeIsDefault;
    @XmlElementRef(name = "NghStatusWaitTime", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nghStatusWaitTime;
    @XmlElementRef(name = "X2GuardPeriodIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> x2GuardPeriodIsDefault;
    @XmlElementRef(name = "X2GuardPeriod", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> x2GuardPeriod;

    /**
     * Gets the value of the nghStatusWaitTimeIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getNghStatusWaitTimeIsDefault() {
        return nghStatusWaitTimeIsDefault;
    }

    /**
     * Sets the value of the nghStatusWaitTimeIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setNghStatusWaitTimeIsDefault(JAXBElement<Boolean> value) {
        this.nghStatusWaitTimeIsDefault = value;
    }

    /**
     * Gets the value of the nghStatusWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNghStatusWaitTime() {
        return nghStatusWaitTime;
    }

    /**
     * Sets the value of the nghStatusWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNghStatusWaitTime(JAXBElement<Integer> value) {
        this.nghStatusWaitTime = value;
    }

    /**
     * Gets the value of the x2GuardPeriodIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getX2GuardPeriodIsDefault() {
        return x2GuardPeriodIsDefault;
    }

    /**
     * Sets the value of the x2GuardPeriodIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setX2GuardPeriodIsDefault(JAXBElement<Boolean> value) {
        this.x2GuardPeriodIsDefault = value;
    }

    /**
     * Gets the value of the x2GuardPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getX2GuardPeriod() {
        return x2GuardPeriod;
    }

    /**
     * Sets the value of the x2GuardPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setX2GuardPeriod(JAXBElement<Integer> value) {
        this.x2GuardPeriod = value;
    }

}
