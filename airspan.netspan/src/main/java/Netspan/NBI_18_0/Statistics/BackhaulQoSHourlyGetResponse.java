
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
 *         &lt;element name="BackhaulQoSHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteBhQosResponse" minOccurs="0"/&gt;
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
    "backhaulQoSHourlyGetResult"
})
@XmlRootElement(name = "BackhaulQoSHourlyGetResponse")
public class BackhaulQoSHourlyGetResponse {

    @XmlElement(name = "BackhaulQoSHourlyGetResult")
    protected StatsLteBhQosResponse backhaulQoSHourlyGetResult;

    /**
     * Gets the value of the backhaulQoSHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteBhQosResponse }
     *     
     */
    public StatsLteBhQosResponse getBackhaulQoSHourlyGetResult() {
        return backhaulQoSHourlyGetResult;
    }

    /**
     * Sets the value of the backhaulQoSHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteBhQosResponse }
     *     
     */
    public void setBackhaulQoSHourlyGetResult(StatsLteBhQosResponse value) {
        this.backhaulQoSHourlyGetResult = value;
    }

}
