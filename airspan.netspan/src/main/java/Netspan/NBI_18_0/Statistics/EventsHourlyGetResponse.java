
package Netspan.NBI_18_0.Statistics;

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
 *         &lt;element name="EventsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEventsResponse" minOccurs="0"/&gt;
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
    "eventsHourlyGetResult"
})
@XmlRootElement(name = "EventsHourlyGetResponse")
public class EventsHourlyGetResponse {

    @XmlElement(name = "EventsHourlyGetResult")
    protected StatsLteEventsResponse eventsHourlyGetResult;

    /**
     * Gets the value of the eventsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public StatsLteEventsResponse getEventsHourlyGetResult() {
        return eventsHourlyGetResult;
    }

    /**
     * Sets the value of the eventsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public void setEventsHourlyGetResult(StatsLteEventsResponse value) {
        this.eventsHourlyGetResult = value;
    }

}
