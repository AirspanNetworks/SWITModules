
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
 *         &lt;element name="IBridge2RfRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2RfResponse" minOccurs="0"/&gt;
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
    "iBridge2RfRawGetResult"
})
@XmlRootElement(name = "IBridge2RfRawGetResponse")
public class IBridge2RfRawGetResponse {

    @XmlElement(name = "IBridge2RfRawGetResult")
    protected StatsIBridge2RfResponse iBridge2RfRawGetResult;

    /**
     * Gets the value of the iBridge2RfRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2RfResponse }
     *     
     */
    public StatsIBridge2RfResponse getIBridge2RfRawGetResult() {
        return iBridge2RfRawGetResult;
    }

    /**
     * Sets the value of the iBridge2RfRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2RfResponse }
     *     
     */
    public void setIBridge2RfRawGetResult(StatsIBridge2RfResponse value) {
        this.iBridge2RfRawGetResult = value;
    }

}
