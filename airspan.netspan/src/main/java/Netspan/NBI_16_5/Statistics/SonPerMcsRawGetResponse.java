
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
 *         &lt;element name="SonPerMcsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteSonPerMcsResponse" minOccurs="0"/&gt;
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
    "sonPerMcsRawGetResult"
})
@XmlRootElement(name = "SonPerMcsRawGetResponse")
public class SonPerMcsRawGetResponse {

    @XmlElement(name = "SonPerMcsRawGetResult")
    protected StatsLteSonPerMcsResponse sonPerMcsRawGetResult;

    /**
     * Gets the value of the sonPerMcsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteSonPerMcsResponse }
     *     
     */
    public StatsLteSonPerMcsResponse getSonPerMcsRawGetResult() {
        return sonPerMcsRawGetResult;
    }

    /**
     * Sets the value of the sonPerMcsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteSonPerMcsResponse }
     *     
     */
    public void setSonPerMcsRawGetResult(StatsLteSonPerMcsResponse value) {
        this.sonPerMcsRawGetResult = value;
    }

}
