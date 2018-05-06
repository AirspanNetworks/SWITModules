
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
 *         &lt;element name="ErabPerQciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabPerQciResponse" minOccurs="0"/>
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
    "erabPerQciHourlyGetResult"
})
@XmlRootElement(name = "ErabPerQciHourlyGetResponse")
public class ErabPerQciHourlyGetResponse {

    @XmlElement(name = "ErabPerQciHourlyGetResult")
    protected StatsLteErabPerQciResponse erabPerQciHourlyGetResult;

    /**
     * Gets the value of the erabPerQciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public StatsLteErabPerQciResponse getErabPerQciHourlyGetResult() {
        return erabPerQciHourlyGetResult;
    }

    /**
     * Sets the value of the erabPerQciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public void setErabPerQciHourlyGetResult(StatsLteErabPerQciResponse value) {
        this.erabPerQciHourlyGetResult = value;
    }

}
