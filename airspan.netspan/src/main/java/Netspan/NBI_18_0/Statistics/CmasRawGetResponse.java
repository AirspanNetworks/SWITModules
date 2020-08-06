
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
 *         &lt;element name="CmasRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCmasResponse" minOccurs="0"/&gt;
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
    "cmasRawGetResult"
})
@XmlRootElement(name = "CmasRawGetResponse")
public class CmasRawGetResponse {

    @XmlElement(name = "CmasRawGetResult")
    protected StatsLteCmasResponse cmasRawGetResult;

    /**
     * Gets the value of the cmasRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public StatsLteCmasResponse getCmasRawGetResult() {
        return cmasRawGetResult;
    }

    /**
     * Sets the value of the cmasRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCmasResponse }
     *     
     */
    public void setCmasRawGetResult(StatsLteCmasResponse value) {
        this.cmasRawGetResult = value;
    }

}
