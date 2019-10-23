
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="EventsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEventsResponse" minOccurs="0"/&gt;
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
    "eventsDailyGetResult"
})
@XmlRootElement(name = "EventsDailyGetResponse")
public class EventsDailyGetResponse {

    @XmlElement(name = "EventsDailyGetResult")
    protected StatsLteEventsResponse eventsDailyGetResult;

    /**
     * Gets the value of the eventsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public StatsLteEventsResponse getEventsDailyGetResult() {
        return eventsDailyGetResult;
    }

    /**
     * Sets the value of the eventsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEventsResponse }
     *     
     */
    public void setEventsDailyGetResult(StatsLteEventsResponse value) {
        this.eventsDailyGetResult = value;
    }

}
