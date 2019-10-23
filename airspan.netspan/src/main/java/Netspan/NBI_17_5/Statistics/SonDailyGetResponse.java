
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
 *         &lt;element name="SonDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteSonResponse" minOccurs="0"/&gt;
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
    "sonDailyGetResult"
})
@XmlRootElement(name = "SonDailyGetResponse")
public class SonDailyGetResponse {

    @XmlElement(name = "SonDailyGetResult")
    protected StatsLteSonResponse sonDailyGetResult;

    /**
     * Gets the value of the sonDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public StatsLteSonResponse getSonDailyGetResult() {
        return sonDailyGetResult;
    }

    /**
     * Sets the value of the sonDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public void setSonDailyGetResult(StatsLteSonResponse value) {
        this.sonDailyGetResult = value;
    }

}
