
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
 *         &lt;element name="IntraEnbLoadBalancingDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteIntraEnbLoadBalancingResponse" minOccurs="0"/>
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
    "intraEnbLoadBalancingDailyGetResult"
})
@XmlRootElement(name = "IntraEnbLoadBalancingDailyGetResponse")
public class IntraEnbLoadBalancingDailyGetResponse {

    @XmlElement(name = "IntraEnbLoadBalancingDailyGetResult")
    protected StatsLteIntraEnbLoadBalancingResponse intraEnbLoadBalancingDailyGetResult;

    /**
     * Gets the value of the intraEnbLoadBalancingDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public StatsLteIntraEnbLoadBalancingResponse getIntraEnbLoadBalancingDailyGetResult() {
        return intraEnbLoadBalancingDailyGetResult;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public void setIntraEnbLoadBalancingDailyGetResult(StatsLteIntraEnbLoadBalancingResponse value) {
        this.intraEnbLoadBalancingDailyGetResult = value;
    }

}
