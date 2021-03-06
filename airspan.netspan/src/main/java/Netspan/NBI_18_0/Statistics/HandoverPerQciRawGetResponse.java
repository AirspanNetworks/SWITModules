
package Netspan.NBI_18_0.Statistics;

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
 *         &lt;element name="HandoverPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelHoPerQciResponse" minOccurs="0"/&gt;
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
    "handoverPerQciRawGetResult"
})
@XmlRootElement(name = "HandoverPerQciRawGetResponse")
public class HandoverPerQciRawGetResponse {

    @XmlElement(name = "HandoverPerQciRawGetResult")
    protected StatsLteCellLevelHoPerQciResponse handoverPerQciRawGetResult;

    /**
     * Gets the value of the handoverPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelHoPerQciResponse }
     *     
     */
    public StatsLteCellLevelHoPerQciResponse getHandoverPerQciRawGetResult() {
        return handoverPerQciRawGetResult;
    }

    /**
     * Sets the value of the handoverPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelHoPerQciResponse }
     *     
     */
    public void setHandoverPerQciRawGetResult(StatsLteCellLevelHoPerQciResponse value) {
        this.handoverPerQciRawGetResult = value;
    }

}
