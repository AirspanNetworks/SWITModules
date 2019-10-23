
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
 *         &lt;element name="RruVoltePerMcsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruVoltePerMcsResponse" minOccurs="0"/&gt;
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
    "rruVoltePerMcsRawGetResult"
})
@XmlRootElement(name = "RruVoltePerMcsRawGetResponse")
public class RruVoltePerMcsRawGetResponse {

    @XmlElement(name = "RruVoltePerMcsRawGetResult")
    protected StatsLteRruVoltePerMcsResponse rruVoltePerMcsRawGetResult;

    /**
     * Gets the value of the rruVoltePerMcsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruVoltePerMcsResponse }
     *     
     */
    public StatsLteRruVoltePerMcsResponse getRruVoltePerMcsRawGetResult() {
        return rruVoltePerMcsRawGetResult;
    }

    /**
     * Sets the value of the rruVoltePerMcsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruVoltePerMcsResponse }
     *     
     */
    public void setRruVoltePerMcsRawGetResult(StatsLteRruVoltePerMcsResponse value) {
        this.rruVoltePerMcsRawGetResult = value;
    }

}
