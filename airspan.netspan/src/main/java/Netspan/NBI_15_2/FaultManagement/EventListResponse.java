
package Netspan.NBI_15_2.FaultManagement;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventListResult" type="{http://Airspan.Netspan.WebServices}EventResultList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventListResult"
})
@XmlRootElement(name = "EventListResponse")
public class EventListResponse {

    @XmlElement(name = "EventListResult")
    protected EventResultList eventListResult;

    /**
     * Gets the value of the eventListResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventResultList }
     *     
     */
    public EventResultList getEventListResult() {
        return eventListResult;
    }

    /**
     * Sets the value of the eventListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResultList }
     *     
     */
    public void setEventListResult(EventResultList value) {
        this.eventListResult = value;
    }

}
