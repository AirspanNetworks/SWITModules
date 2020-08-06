
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
 *         &lt;element name="IBridge2EthernetRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIBridge2EthernetResponse" minOccurs="0"/&gt;
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
    "iBridge2EthernetRawGetResult"
})
@XmlRootElement(name = "IBridge2EthernetRawGetResponse")
public class IBridge2EthernetRawGetResponse {

    @XmlElement(name = "IBridge2EthernetRawGetResult")
    protected StatsIBridge2EthernetResponse iBridge2EthernetRawGetResult;

    /**
     * Gets the value of the iBridge2EthernetRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIBridge2EthernetResponse }
     *     
     */
    public StatsIBridge2EthernetResponse getIBridge2EthernetRawGetResult() {
        return iBridge2EthernetRawGetResult;
    }

    /**
     * Sets the value of the iBridge2EthernetRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIBridge2EthernetResponse }
     *     
     */
    public void setIBridge2EthernetRawGetResult(StatsIBridge2EthernetResponse value) {
        this.iBridge2EthernetRawGetResult = value;
    }

}
