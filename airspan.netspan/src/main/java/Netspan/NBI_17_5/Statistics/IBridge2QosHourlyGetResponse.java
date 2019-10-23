
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
 *         &lt;element name="IBridge2QosHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2QosResponse" minOccurs="0"/&gt;
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
    "iBridge2QosHourlyGetResult"
})
@XmlRootElement(name = "IBridge2QosHourlyGetResponse")
public class IBridge2QosHourlyGetResponse {

    @XmlElement(name = "IBridge2QosHourlyGetResult")
    protected StatsIBridge2QosResponse iBridge2QosHourlyGetResult;

    /**
     * Gets the value of the iBridge2QosHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2QosResponse }
     *     
     */
    public StatsIBridge2QosResponse getIBridge2QosHourlyGetResult() {
        return iBridge2QosHourlyGetResult;
    }

    /**
     * Sets the value of the iBridge2QosHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2QosResponse }
     *     
     */
    public void setIBridge2QosHourlyGetResult(StatsIBridge2QosResponse value) {
        this.iBridge2QosHourlyGetResult = value;
    }

}
