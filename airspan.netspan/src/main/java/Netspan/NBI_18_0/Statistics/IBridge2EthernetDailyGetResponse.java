
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
 *         &lt;element name="IBridge2EthernetDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2EthernetResponse" minOccurs="0"/&gt;
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
    "iBridge2EthernetDailyGetResult"
})
@XmlRootElement(name = "IBridge2EthernetDailyGetResponse")
public class IBridge2EthernetDailyGetResponse {

    @XmlElement(name = "IBridge2EthernetDailyGetResult")
    protected StatsIBridge2EthernetResponse iBridge2EthernetDailyGetResult;

    /**
     * Gets the value of the iBridge2EthernetDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2EthernetResponse }
     *     
     */
    public StatsIBridge2EthernetResponse getIBridge2EthernetDailyGetResult() {
        return iBridge2EthernetDailyGetResult;
    }

    /**
     * Sets the value of the iBridge2EthernetDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2EthernetResponse }
     *     
     */
    public void setIBridge2EthernetDailyGetResult(StatsIBridge2EthernetResponse value) {
        this.iBridge2EthernetDailyGetResult = value;
    }

}
