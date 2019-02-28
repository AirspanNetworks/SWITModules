
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
 *         &lt;element name="SonPerMcsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteSonPerMcsResponse" minOccurs="0"/&gt;
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
    "sonPerMcsDailyGetResult"
})
@XmlRootElement(name = "SonPerMcsDailyGetResponse")
public class SonPerMcsDailyGetResponse {

    @XmlElement(name = "SonPerMcsDailyGetResult")
    protected StatsLteSonPerMcsResponse sonPerMcsDailyGetResult;

    /**
     * Gets the value of the sonPerMcsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteSonPerMcsResponse }
     *     
     */
    public StatsLteSonPerMcsResponse getSonPerMcsDailyGetResult() {
        return sonPerMcsDailyGetResult;
    }

    /**
     * Sets the value of the sonPerMcsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteSonPerMcsResponse }
     *     
     */
    public void setSonPerMcsDailyGetResult(StatsLteSonPerMcsResponse value) {
        this.sonPerMcsDailyGetResult = value;
    }

}
