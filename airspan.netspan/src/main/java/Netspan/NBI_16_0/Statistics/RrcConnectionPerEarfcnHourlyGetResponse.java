
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
 *         &lt;element name="RrcConnectionPerEarfcnHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRrcConnectionPerEarfcnResponse" minOccurs="0"/>
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
    "rrcConnectionPerEarfcnHourlyGetResult"
})
@XmlRootElement(name = "RrcConnectionPerEarfcnHourlyGetResponse")
public class RrcConnectionPerEarfcnHourlyGetResponse {

    @XmlElement(name = "RrcConnectionPerEarfcnHourlyGetResult")
    protected StatsLteRrcConnectionPerEarfcnResponse rrcConnectionPerEarfcnHourlyGetResult;

    /**
     * Gets the value of the rrcConnectionPerEarfcnHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRrcConnectionPerEarfcnResponse }
     *     
     */
    public StatsLteRrcConnectionPerEarfcnResponse getRrcConnectionPerEarfcnHourlyGetResult() {
        return rrcConnectionPerEarfcnHourlyGetResult;
    }

    /**
     * Sets the value of the rrcConnectionPerEarfcnHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRrcConnectionPerEarfcnResponse }
     *     
     */
    public void setRrcConnectionPerEarfcnHourlyGetResult(StatsLteRrcConnectionPerEarfcnResponse value) {
        this.rrcConnectionPerEarfcnHourlyGetResult = value;
    }

}
