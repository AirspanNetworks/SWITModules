
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
 *         &lt;element name="LinkAdaptationDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMcsResponse" minOccurs="0"/>
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
    "linkAdaptationDailyGetResult"
})
@XmlRootElement(name = "LinkAdaptationDailyGetResponse")
public class LinkAdaptationDailyGetResponse {

    @XmlElement(name = "LinkAdaptationDailyGetResult")
    protected StatsLteMcsResponse linkAdaptationDailyGetResult;

    /**
     * Gets the value of the linkAdaptationDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public StatsLteMcsResponse getLinkAdaptationDailyGetResult() {
        return linkAdaptationDailyGetResult;
    }

    /**
     * Sets the value of the linkAdaptationDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public void setLinkAdaptationDailyGetResult(StatsLteMcsResponse value) {
        this.linkAdaptationDailyGetResult = value;
    }

}
