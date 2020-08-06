
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
 *         &lt;element name="IBridge2ThroughputHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2ThroughputResponse" minOccurs="0"/&gt;
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
    "iBridge2ThroughputHourlyGetResult"
})
@XmlRootElement(name = "IBridge2ThroughputHourlyGetResponse")
public class IBridge2ThroughputHourlyGetResponse {

    @XmlElement(name = "IBridge2ThroughputHourlyGetResult")
    protected StatsIBridge2ThroughputResponse iBridge2ThroughputHourlyGetResult;

    /**
     * Gets the value of the iBridge2ThroughputHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2ThroughputResponse }
     *     
     */
    public StatsIBridge2ThroughputResponse getIBridge2ThroughputHourlyGetResult() {
        return iBridge2ThroughputHourlyGetResult;
    }

    /**
     * Sets the value of the iBridge2ThroughputHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2ThroughputResponse }
     *     
     */
    public void setIBridge2ThroughputHourlyGetResult(StatsIBridge2ThroughputResponse value) {
        this.iBridge2ThroughputHourlyGetResult = value;
    }

}
