
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
 *         &lt;element name="IBridge2RfHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2RfResponse" minOccurs="0"/&gt;
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
    "iBridge2RfHourlyGetResult"
})
@XmlRootElement(name = "IBridge2RfHourlyGetResponse")
public class IBridge2RfHourlyGetResponse {

    @XmlElement(name = "IBridge2RfHourlyGetResult")
    protected StatsIBridge2RfResponse iBridge2RfHourlyGetResult;

    /**
     * Gets the value of the iBridge2RfHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2RfResponse }
     *     
     */
    public StatsIBridge2RfResponse getIBridge2RfHourlyGetResult() {
        return iBridge2RfHourlyGetResult;
    }

    /**
     * Sets the value of the iBridge2RfHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2RfResponse }
     *     
     */
    public void setIBridge2RfHourlyGetResult(StatsIBridge2RfResponse value) {
        this.iBridge2RfHourlyGetResult = value;
    }

}
