
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
 *         &lt;element name="IBridge2ThroughputRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2ThroughputResponse" minOccurs="0"/&gt;
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
    "iBridge2ThroughputRawGetResult"
})
@XmlRootElement(name = "IBridge2ThroughputRawGetResponse")
public class IBridge2ThroughputRawGetResponse {

    @XmlElement(name = "IBridge2ThroughputRawGetResult")
    protected StatsIBridge2ThroughputResponse iBridge2ThroughputRawGetResult;

    /**
     * Gets the value of the iBridge2ThroughputRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2ThroughputResponse }
     *     
     */
    public StatsIBridge2ThroughputResponse getIBridge2ThroughputRawGetResult() {
        return iBridge2ThroughputRawGetResult;
    }

    /**
     * Sets the value of the iBridge2ThroughputRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2ThroughputResponse }
     *     
     */
    public void setIBridge2ThroughputRawGetResult(StatsIBridge2ThroughputResponse value) {
        this.iBridge2ThroughputRawGetResult = value;
    }

}
