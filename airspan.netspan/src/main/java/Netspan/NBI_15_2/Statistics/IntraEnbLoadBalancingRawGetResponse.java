
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="IntraEnbLoadBalancingRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteIntraEnbLoadBalancingResponse" minOccurs="0"/&gt;
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
    "intraEnbLoadBalancingRawGetResult"
})
@XmlRootElement(name = "IntraEnbLoadBalancingRawGetResponse")
public class IntraEnbLoadBalancingRawGetResponse {

    @XmlElement(name = "IntraEnbLoadBalancingRawGetResult")
    protected StatsLteIntraEnbLoadBalancingResponse intraEnbLoadBalancingRawGetResult;

    /**
     * Gets the value of the intraEnbLoadBalancingRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public StatsLteIntraEnbLoadBalancingResponse getIntraEnbLoadBalancingRawGetResult() {
        return intraEnbLoadBalancingRawGetResult;
    }

    /**
     * Sets the value of the intraEnbLoadBalancingRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteIntraEnbLoadBalancingResponse }
     *     
     */
    public void setIntraEnbLoadBalancingRawGetResult(StatsLteIntraEnbLoadBalancingResponse value) {
        this.intraEnbLoadBalancingRawGetResult = value;
    }

}
