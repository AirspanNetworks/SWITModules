
package Netspan.NBI_16_0.Lte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaintenanceWindowConfigurationWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceWindowConfigurationWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeZone" type="{http://Airspan.Netspan.WebServices}TimeZones" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxRandomDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AutonomousReboot" type="{http://Airspan.Netspan.WebServices}AutonomousRebootValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceWindowConfigurationWs", propOrder = {
    "timeZone",
    "startTime",
    "endTime",
    "maxRandomDelay",
    "autonomousReboot"
})
public class MaintenanceWindowConfigurationWs {

    @XmlElementRef(name = "TimeZone", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeZones> timeZone;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "EndTime")
    protected String endTime;
    @XmlElementRef(name = "MaxRandomDelay", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxRandomDelay;
    @XmlElementRef(name = "AutonomousReboot", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<AutonomousRebootValues> autonomousReboot;

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeZones }{@code >}
     *     
     */
    public JAXBElement<TimeZones> getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeZones }{@code >}
     *     
     */
    public void setTimeZone(JAXBElement<TimeZones> value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the maxRandomDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxRandomDelay() {
        return maxRandomDelay;
    }

    /**
     * Sets the value of the maxRandomDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxRandomDelay(JAXBElement<Integer> value) {
        this.maxRandomDelay = value;
    }

    /**
     * Gets the value of the autonomousReboot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutonomousRebootValues }{@code >}
     *     
     */
    public JAXBElement<AutonomousRebootValues> getAutonomousReboot() {
        return autonomousReboot;
    }

    /**
     * Sets the value of the autonomousReboot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutonomousRebootValues }{@code >}
     *     
     */
    public void setAutonomousReboot(JAXBElement<AutonomousRebootValues> value) {
        this.autonomousReboot = value;
    }

}
