
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
 *         &lt;element name="LinkAdaptationHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMcsResponse" minOccurs="0"/&gt;
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
    "linkAdaptationHourlyGetResult"
})
@XmlRootElement(name = "LinkAdaptationHourlyGetResponse")
public class LinkAdaptationHourlyGetResponse {

    @XmlElement(name = "LinkAdaptationHourlyGetResult")
    protected StatsLteMcsResponse linkAdaptationHourlyGetResult;

    /**
     * Gets the value of the linkAdaptationHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public StatsLteMcsResponse getLinkAdaptationHourlyGetResult() {
        return linkAdaptationHourlyGetResult;
    }

    /**
     * Sets the value of the linkAdaptationHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public void setLinkAdaptationHourlyGetResult(StatsLteMcsResponse value) {
        this.linkAdaptationHourlyGetResult = value;
    }

}
