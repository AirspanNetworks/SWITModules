
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
 *         &lt;element name="IntraEnbLoadBalancingHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteIntraEnbLoadBalancingResponse" minOccurs="0"/>
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
    "intraEnbLoadBalancingHourlyGetResult"
})
@XmlRootElement(name = "IntraEnbLoadBalancingHourlyGetResponse")
public class IntraEnbLoadBalancingHourlyGetResponse {

    @XmlElement(name = "IntraEnbLoadBalancingHourlyGetResult")
    protected StatsLteIntraEnbLoadBalancingResponse intraEnbLoadBalancingHourlyGetResult;

    /**
     * Gets the value of the intraEnbLoadBalancingHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public StatsLteIntraEnbLoadBalancingResponse getIntraEnbLoadBalancingHourlyGetResult() {
        return intraEnbLoadBalancingHourlyGetResult;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public void setIntraEnbLoadBalancingHourlyGetResult(StatsLteIntraEnbLoadBalancingResponse value) {
        this.intraEnbLoadBalancingHourlyGetResult = value;
    }

}
