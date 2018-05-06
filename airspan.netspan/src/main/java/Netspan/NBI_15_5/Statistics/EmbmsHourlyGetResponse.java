
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
 *         &lt;element name="EmbmsHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEmbmsResponse" minOccurs="0"/>
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
    "embmsHourlyGetResult"
})
@XmlRootElement(name = "EmbmsHourlyGetResponse")
public class EmbmsHourlyGetResponse {

    @XmlElement(name = "EmbmsHourlyGetResult")
    protected StatsLteEmbmsResponse embmsHourlyGetResult;

    /**
     * Gets the value of the embmsHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEmbmsResponse }
     *     
     */
    public StatsLteEmbmsResponse getEmbmsHourlyGetResult() {
        return embmsHourlyGetResult;
    }

    /**
     * Sets the value of the embmsHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEmbmsResponse }
     *     
     */
    public void setEmbmsHourlyGetResult(StatsLteEmbmsResponse value) {
        this.embmsHourlyGetResult = value;
    }

}
