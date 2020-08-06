
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
 *         &lt;element name="RrcConnectionPerEarfcnDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRrcConnectionPerEarfcnResponse" minOccurs="0"/&gt;
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
    "rrcConnectionPerEarfcnDailyGetResult"
})
@XmlRootElement(name = "RrcConnectionPerEarfcnDailyGetResponse")
public class RrcConnectionPerEarfcnDailyGetResponse {

    @XmlElement(name = "RrcConnectionPerEarfcnDailyGetResult")
    protected StatsLteRrcConnectionPerEarfcnResponse rrcConnectionPerEarfcnDailyGetResult;

    /**
     * Gets the value of the rrcConnectionPerEarfcnDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRrcConnectionPerEarfcnResponse }
     *     
     */
    public StatsLteRrcConnectionPerEarfcnResponse getRrcConnectionPerEarfcnDailyGetResult() {
        return rrcConnectionPerEarfcnDailyGetResult;
    }

    /**
     * Sets the value of the rrcConnectionPerEarfcnDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRrcConnectionPerEarfcnResponse }
     *     
     */
    public void setRrcConnectionPerEarfcnDailyGetResult(StatsLteRrcConnectionPerEarfcnResponse value) {
        this.rrcConnectionPerEarfcnDailyGetResult = value;
    }

}
