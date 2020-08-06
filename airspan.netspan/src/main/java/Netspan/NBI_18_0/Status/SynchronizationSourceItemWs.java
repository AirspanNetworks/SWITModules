
package Netspan.NBI_18_0.Status;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchronizationSourceItemWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationSourceItemWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClockSource" type="{http://Airspan.Netspan.WebServices}ClockSourceWs" minOccurs="0"/&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://Airspan.Netspan.WebServices}ClockSourceStatusWs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSourceItemWs", propOrder = {
    "clockSource",
    "priority",
    "status"
})
public class SynchronizationSourceItemWs {

    @XmlElementRef(name = "ClockSource", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSourceWs> clockSource;
    @XmlElementRef(name = "Priority", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priority;
    @XmlElementRef(name = "Status", namespace = "http://Airspan.Netspan.WebServices", type = JAXBElement.class, required = false)
    protected JAXBElement<ClockSourceStatusWs> status;

    /**
     * Gets the value of the clockSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceWs }{@code >}
     *     
     */
    public JAXBElement<ClockSourceWs> getClockSource() {
        return clockSource;
    }

    /**
     * Sets the value of the clockSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceWs }{@code >}
     *     
     */
    public void setClockSource(JAXBElement<ClockSourceWs> value) {
        this.clockSource = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriority(JAXBElement<Integer> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceStatusWs }{@code >}
     *     
     */
    public JAXBElement<ClockSourceStatusWs> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClockSourceStatusWs }{@code >}
     *     
     */
    public void setStatus(JAXBElement<ClockSourceStatusWs> value) {
        this.status = value;
    }

}
