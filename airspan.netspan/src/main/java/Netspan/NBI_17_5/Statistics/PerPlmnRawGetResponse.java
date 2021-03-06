
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
 *         &lt;element name="PerPlmnRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLtePerPlmnResponse" minOccurs="0"/&gt;
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
    "perPlmnRawGetResult"
})
@XmlRootElement(name = "PerPlmnRawGetResponse")
public class PerPlmnRawGetResponse {

    @XmlElement(name = "PerPlmnRawGetResult")
    protected StatsLtePerPlmnResponse perPlmnRawGetResult;

    /**
     * Gets the value of the perPlmnRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLtePerPlmnResponse }
     *     
     */
    public StatsLtePerPlmnResponse getPerPlmnRawGetResult() {
        return perPlmnRawGetResult;
    }

    /**
     * Sets the value of the perPlmnRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLtePerPlmnResponse }
     *     
     */
    public void setPerPlmnRawGetResult(StatsLtePerPlmnResponse value) {
        this.perPlmnRawGetResult = value;
    }

}
