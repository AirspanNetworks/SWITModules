
package Netspan.NBI_16_5.Lte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClockSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Clock" type="{http://Airspan.Netspan.WebServices}ClockSources"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockSource", propOrder = {
    "priority",
    "clock"
})
public class ClockSource {

    @XmlElement(name = "Priority")
    protected int priority;
    @XmlElement(name = "Clock", required = true)
    @XmlSchemaType(name = "string")
    protected ClockSources clock;

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the clock property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSources }
     *     
     */
    public ClockSources getClock() {
        return clock;
    }

    /**
     * Sets the value of the clock property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSources }
     *     
     */
    public void setClock(ClockSources value) {
        this.clock = value;
    }

}
