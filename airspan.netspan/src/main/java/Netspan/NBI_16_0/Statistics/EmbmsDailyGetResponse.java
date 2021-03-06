
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
 *         &lt;element name="EmbmsDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEmbmsResponse" minOccurs="0"/>
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
    "embmsDailyGetResult"
})
@XmlRootElement(name = "EmbmsDailyGetResponse")
public class EmbmsDailyGetResponse {

    @XmlElement(name = "EmbmsDailyGetResult")
    protected StatsLteEmbmsResponse embmsDailyGetResult;

    /**
     * Gets the value of the embmsDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEmbmsResponse }
     *     
     */
    public StatsLteEmbmsResponse getEmbmsDailyGetResult() {
        return embmsDailyGetResult;
    }

    /**
     * Sets the value of the embmsDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEmbmsResponse }
     *     
     */
    public void setEmbmsDailyGetResult(StatsLteEmbmsResponse value) {
        this.embmsDailyGetResult = value;
    }

}
