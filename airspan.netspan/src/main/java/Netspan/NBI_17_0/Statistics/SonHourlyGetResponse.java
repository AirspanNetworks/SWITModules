
package Netspan.NBI_17_0.Statistics;

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
 *         &lt;element name="SonHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteSonResponse" minOccurs="0"/&gt;
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
    "sonHourlyGetResult"
})
@XmlRootElement(name = "SonHourlyGetResponse")
public class SonHourlyGetResponse {

    @XmlElement(name = "SonHourlyGetResult")
    protected StatsLteSonResponse sonHourlyGetResult;

    /**
     * Gets the value of the sonHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public StatsLteSonResponse getSonHourlyGetResult() {
        return sonHourlyGetResult;
    }

    /**
     * Sets the value of the sonHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public void setSonHourlyGetResult(StatsLteSonResponse value) {
        this.sonHourlyGetResult = value;
    }

}
