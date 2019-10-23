
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
 *         &lt;element name="BackhaulQoSRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteBhQosResponse" minOccurs="0"/&gt;
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
    "backhaulQoSRawGetResult"
})
@XmlRootElement(name = "BackhaulQoSRawGetResponse")
public class BackhaulQoSRawGetResponse {

    @XmlElement(name = "BackhaulQoSRawGetResult")
    protected StatsLteBhQosResponse backhaulQoSRawGetResult;

    /**
     * Gets the value of the backhaulQoSRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteBhQosResponse }
     *     
     */
    public StatsLteBhQosResponse getBackhaulQoSRawGetResult() {
        return backhaulQoSRawGetResult;
    }

    /**
     * Sets the value of the backhaulQoSRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteBhQosResponse }
     *     
     */
    public void setBackhaulQoSRawGetResult(StatsLteBhQosResponse value) {
        this.backhaulQoSRawGetResult = value;
    }

}
