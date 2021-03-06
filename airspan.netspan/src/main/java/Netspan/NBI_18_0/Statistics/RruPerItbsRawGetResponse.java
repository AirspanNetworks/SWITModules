
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
 *         &lt;element name="RruPerItbsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerItbsResponse" minOccurs="0"/&gt;
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
    "rruPerItbsRawGetResult"
})
@XmlRootElement(name = "RruPerItbsRawGetResponse")
public class RruPerItbsRawGetResponse {

    @XmlElement(name = "RruPerItbsRawGetResult")
    protected StatsLteRruPerItbsResponse rruPerItbsRawGetResult;

    /**
     * Gets the value of the rruPerItbsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public StatsLteRruPerItbsResponse getRruPerItbsRawGetResult() {
        return rruPerItbsRawGetResult;
    }

    /**
     * Sets the value of the rruPerItbsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerItbsResponse }
     *     
     */
    public void setRruPerItbsRawGetResult(StatsLteRruPerItbsResponse value) {
        this.rruPerItbsRawGetResult = value;
    }

}
