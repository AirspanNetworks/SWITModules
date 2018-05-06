
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="Ib440QosPerQciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440QosPerQciResponse" minOccurs="0"/>
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
    "ib440QosPerQciHourlyGetResult"
})
@XmlRootElement(name = "Ib440QosPerQciHourlyGetResponse")
public class Ib440QosPerQciHourlyGetResponse {

    @XmlElement(name = "Ib440QosPerQciHourlyGetResult")
    protected StatsIb440QosPerQciResponse ib440QosPerQciHourlyGetResult;

    /**
     * Gets the value of the ib440QosPerQciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public StatsIb440QosPerQciResponse getIb440QosPerQciHourlyGetResult() {
        return ib440QosPerQciHourlyGetResult;
    }

    /**
     * Sets the value of the ib440QosPerQciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440QosPerQciResponse }
     *     
     */
    public void setIb440QosPerQciHourlyGetResult(StatsIb440QosPerQciResponse value) {
        this.ib440QosPerQciHourlyGetResult = value;
    }

}
