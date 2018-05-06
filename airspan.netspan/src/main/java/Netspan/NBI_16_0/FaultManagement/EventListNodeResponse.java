
package Netspan.NBI_16_0.FaultManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventListNodeResult" type="{http://Airspan.Netspan.WebServices}EventResultList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventListNodeResult"
})
@XmlRootElement(name = "EventListNodeResponse")
public class EventListNodeResponse {

    @XmlElement(name = "EventListNodeResult")
    protected EventResultList eventListNodeResult;

    /**
     * Gets the value of the eventListNodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResultList }
     *     
     */
    public EventResultList getEventListNodeResult() {
        return eventListNodeResult;
    }

    /**
     * Sets the value of the eventListNodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResultList }
     *     
     */
    public void setEventListNodeResult(EventResultList value) {
        this.eventListNodeResult = value;
    }

}
