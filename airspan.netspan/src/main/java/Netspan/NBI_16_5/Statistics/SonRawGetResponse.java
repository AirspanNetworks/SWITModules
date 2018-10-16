
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="SonRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteSonResponse" minOccurs="0"/&gt;
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
    "sonRawGetResult"
})
@XmlRootElement(name = "SonRawGetResponse")
public class SonRawGetResponse {

    @XmlElement(name = "SonRawGetResult")
    protected StatsLteSonResponse sonRawGetResult;

    /**
     * Gets the value of the sonRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public StatsLteSonResponse getSonRawGetResult() {
        return sonRawGetResult;
    }

    /**
     * Sets the value of the sonRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteSonResponse }
     *     
     */
    public void setSonRawGetResult(StatsLteSonResponse value) {
        this.sonRawGetResult = value;
    }

}
