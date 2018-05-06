
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
 *         &lt;element name="HarqRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHarqResponse" minOccurs="0"/>
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
    "harqRawGetResult"
})
@XmlRootElement(name = "HarqRawGetResponse")
public class HarqRawGetResponse {

    @XmlElement(name = "HarqRawGetResult")
    protected StatsLteHarqResponse harqRawGetResult;

    /**
     * Gets the value of the harqRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public StatsLteHarqResponse getHarqRawGetResult() {
        return harqRawGetResult;
    }

    /**
     * Sets the value of the harqRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHarqResponse }
     *     
     */
    public void setHarqRawGetResult(StatsLteHarqResponse value) {
        this.harqRawGetResult = value;
    }

}
