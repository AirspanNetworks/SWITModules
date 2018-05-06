
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
 *         &lt;element name="EthernetCounterPerPortHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEthernetCounterPerPortResponse" minOccurs="0"/>
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
    "ethernetCounterPerPortHourlyGetResult"
})
@XmlRootElement(name = "EthernetCounterPerPortHourlyGetResponse")
public class EthernetCounterPerPortHourlyGetResponse {

    @XmlElement(name = "EthernetCounterPerPortHourlyGetResult")
    protected StatsLteEthernetCounterPerPortResponse ethernetCounterPerPortHourlyGetResult;

    /**
     * Gets the value of the ethernetCounterPerPortHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public StatsLteEthernetCounterPerPortResponse getEthernetCounterPerPortHourlyGetResult() {
        return ethernetCounterPerPortHourlyGetResult;
    }

    /**
     * Sets the value of the ethernetCounterPerPortHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEthernetCounterPerPortResponse }
     *     
     */
    public void setEthernetCounterPerPortHourlyGetResult(StatsLteEthernetCounterPerPortResponse value) {
        this.ethernetCounterPerPortHourlyGetResult = value;
    }

}
