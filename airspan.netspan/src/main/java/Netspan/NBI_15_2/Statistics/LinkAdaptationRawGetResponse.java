
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="LinkAdaptationRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteMcsResponse" minOccurs="0"/>
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
    "linkAdaptationRawGetResult"
})
@XmlRootElement(name = "LinkAdaptationRawGetResponse")
public class LinkAdaptationRawGetResponse {

    @XmlElement(name = "LinkAdaptationRawGetResult")
    protected StatsLteMcsResponse linkAdaptationRawGetResult;

    /**
     * Gets the value of the linkAdaptationRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public StatsLteMcsResponse getLinkAdaptationRawGetResult() {
        return linkAdaptationRawGetResult;
    }

    /**
     * Sets the value of the linkAdaptationRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteMcsResponse }
     *     
     */
    public void setLinkAdaptationRawGetResult(StatsLteMcsResponse value) {
        this.linkAdaptationRawGetResult = value;
    }

}
