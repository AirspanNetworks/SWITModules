
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
 *         &lt;element name="EthernetCounterPerPortRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEthernetCounterPerPortResponse" minOccurs="0"/&gt;
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
    "ethernetCounterPerPortRawGetResult"
})
@XmlRootElement(name = "EthernetCounterPerPortRawGetResponse")
public class EthernetCounterPerPortRawGetResponse {

    @XmlElement(name = "EthernetCounterPerPortRawGetResult")
    protected StatsLteEthernetCounterPerPortResponse ethernetCounterPerPortRawGetResult;

    /**
     * Gets the value of the ethernetCounterPerPortRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public StatsLteEthernetCounterPerPortResponse getEthernetCounterPerPortRawGetResult() {
        return ethernetCounterPerPortRawGetResult;
    }

    /**
     * Sets the value of the ethernetCounterPerPortRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public void setEthernetCounterPerPortRawGetResult(StatsLteEthernetCounterPerPortResponse value) {
        this.ethernetCounterPerPortRawGetResult = value;
    }

}
