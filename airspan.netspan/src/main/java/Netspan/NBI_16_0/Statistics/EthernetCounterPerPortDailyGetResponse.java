
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
 *         &lt;element name="EthernetCounterPerPortDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEthernetCounterPerPortResponse" minOccurs="0"/>
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
    "ethernetCounterPerPortDailyGetResult"
})
@XmlRootElement(name = "EthernetCounterPerPortDailyGetResponse")
public class EthernetCounterPerPortDailyGetResponse {

    @XmlElement(name = "EthernetCounterPerPortDailyGetResult")
    protected StatsLteEthernetCounterPerPortResponse ethernetCounterPerPortDailyGetResult;

    /**
     * Gets the value of the ethernetCounterPerPortDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public StatsLteEthernetCounterPerPortResponse getEthernetCounterPerPortDailyGetResult() {
        return ethernetCounterPerPortDailyGetResult;
    }

    /**
     * Sets the value of the ethernetCounterPerPortDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public void setEthernetCounterPerPortDailyGetResult(StatsLteEthernetCounterPerPortResponse value) {
        this.ethernetCounterPerPortDailyGetResult = value;
    }

}
