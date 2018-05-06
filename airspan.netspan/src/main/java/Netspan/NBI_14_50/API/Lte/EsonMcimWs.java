
package Netspan.NBI_14_50.API.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsonMcimWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EsonMcimWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AperiodicCqiGuardTimerIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiGuardTimer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiMinMcsIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AperiodicCqiMinMcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UeThroughputReportIntervalIsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UeThroughputReportInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsonMcimWs", propOrder = {
    "aperiodicCqiGuardTimerIsDefault",
    "aperiodicCqiGuardTimer",
    "aperiodicCqiMinMcsIsDefault",
    "aperiodicCqiMinMcs",
    "ueThroughputReportIntervalIsDefault",
    "ueThroughputReportInterval"
})
public class EsonMcimWs {

    @XmlElementRef(name = "AperiodicCqiGuardTimerIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> aperiodicCqiGuardTimerIsDefault;
    @XmlElementRef(name = "AperiodicCqiGuardTimer", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aperiodicCqiGuardTimer;
    @XmlElementRef(name = "AperiodicCqiMinMcsIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> aperiodicCqiMinMcsIsDefault;
    @XmlElementRef(name = "AperiodicCqiMinMcs", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> aperiodicCqiMinMcs;
    @XmlElementRef(name = "UeThroughputReportIntervalIsDefault", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ueThroughputReportIntervalIsDefault;
    @XmlElementRef(name = "UeThroughputReportInterval", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> ueThroughputReportInterval;

    /**
     * Gets the value of the aperiodicCqiGuardTimerIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAperiodicCqiGuardTimerIsDefault() {
        return aperiodicCqiGuardTimerIsDefault;
    }

    /**
     * Sets the value of the aperiodicCqiGuardTimerIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAperiodicCqiGuardTimerIsDefault(JAXBElement<Boolean> value) {
        this.aperiodicCqiGuardTimerIsDefault = value;
    }

    /**
     * Gets the value of the aperiodicCqiGuardTimer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAperiodicCqiGuardTimer() {
        return aperiodicCqiGuardTimer;
    }

    /**
     * Sets the value of the aperiodicCqiGuardTimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAperiodicCqiGuardTimer(JAXBElement<Integer> value) {
        this.aperiodicCqiGuardTimer = value;
    }

    /**
     * Gets the value of the aperiodicCqiMinMcsIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAperiodicCqiMinMcsIsDefault() {
        return aperiodicCqiMinMcsIsDefault;
    }

    /**
     * Sets the value of the aperiodicCqiMinMcsIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAperiodicCqiMinMcsIsDefault(JAXBElement<Boolean> value) {
        this.aperiodicCqiMinMcsIsDefault = value;
    }

    /**
     * Gets the value of the aperiodicCqiMinMcs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAperiodicCqiMinMcs() {
        return aperiodicCqiMinMcs;
    }

    /**
     * Sets the value of the aperiodicCqiMinMcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAperiodicCqiMinMcs(JAXBElement<Integer> value) {
        this.aperiodicCqiMinMcs = value;
    }

    /**
     * Gets the value of the ueThroughputReportIntervalIsDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUeThroughputReportIntervalIsDefault() {
        return ueThroughputReportIntervalIsDefault;
    }

    /**
     * Sets the value of the ueThroughputReportIntervalIsDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUeThroughputReportIntervalIsDefault(JAXBElement<Boolean> value) {
        this.ueThroughputReportIntervalIsDefault = value;
    }

    /**
     * Gets the value of the ueThroughputReportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUeThroughputReportInterval() {
        return ueThroughputReportInterval;
    }

    /**
     * Sets the value of the ueThroughputReportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUeThroughputReportInterval(JAXBElement<Integer> value) {
        this.ueThroughputReportInterval = value;
    }

}
