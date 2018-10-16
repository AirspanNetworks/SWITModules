
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
 *         &lt;element name="PerPlmnPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePerPlmnPerQciResponse" minOccurs="0"/&gt;
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
    "perPlmnPerQciRawGetResult"
})
@XmlRootElement(name = "PerPlmnPerQciRawGetResponse")
public class PerPlmnPerQciRawGetResponse {

    @XmlElement(name = "PerPlmnPerQciRawGetResult")
    protected StatsLtePerPlmnPerQciResponse perPlmnPerQciRawGetResult;

    /**
     * Gets the value of the perPlmnPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePerPlmnPerQciResponse }
     *     
     */
    public StatsLtePerPlmnPerQciResponse getPerPlmnPerQciRawGetResult() {
        return perPlmnPerQciRawGetResult;
    }

    /**
     * Sets the value of the perPlmnPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePerPlmnPerQciResponse }
     *     
     */
    public void setPerPlmnPerQciRawGetResult(StatsLtePerPlmnPerQciResponse value) {
        this.perPlmnPerQciRawGetResult = value;
    }

}
