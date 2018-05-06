
package Netspan.NBI_16_0.Statistics;

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
 *         &lt;element name="EventsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEventsResponse" minOccurs="0"/>
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
    "eventsRawGetResult"
})
@XmlRootElement(name = "EventsRawGetResponse")
public class EventsRawGetResponse {

    @XmlElement(name = "EventsRawGetResult")
    protected StatsLteEventsResponse eventsRawGetResult;

    /**
     * Gets the value of the eventsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public StatsLteEventsResponse getEventsRawGetResult() {
        return eventsRawGetResult;
    }

    /**
     * Sets the value of the eventsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public void setEventsRawGetResult(StatsLteEventsResponse value) {
        this.eventsRawGetResult = value;
    }

}
