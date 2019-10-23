
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
 *         &lt;element name="IBridge2QosDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2QosResponse" minOccurs="0"/&gt;
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
    "iBridge2QosDailyGetResult"
})
@XmlRootElement(name = "IBridge2QosDailyGetResponse")
public class IBridge2QosDailyGetResponse {

    @XmlElement(name = "IBridge2QosDailyGetResult")
    protected StatsIBridge2QosResponse iBridge2QosDailyGetResult;

    /**
     * Gets the value of the iBridge2QosDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2QosResponse }
     *     
     */
    public StatsIBridge2QosResponse getIBridge2QosDailyGetResult() {
        return iBridge2QosDailyGetResult;
    }

    /**
     * Sets the value of the iBridge2QosDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2QosResponse }
     *     
     */
    public void setIBridge2QosDailyGetResult(StatsIBridge2QosResponse value) {
        this.iBridge2QosDailyGetResult = value;
    }

}
