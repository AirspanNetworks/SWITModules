
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
 *         &lt;element name="LiteCompRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteLiteCompResponse" minOccurs="0"/&gt;
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
    "liteCompRawGetResult"
})
@XmlRootElement(name = "LiteCompRawGetResponse")
public class LiteCompRawGetResponse {

    @XmlElement(name = "LiteCompRawGetResult")
    protected StatsLteLiteCompResponse liteCompRawGetResult;

    /**
     * Gets the value of the liteCompRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteLiteCompResponse }
     *     
     */
    public StatsLteLiteCompResponse getLiteCompRawGetResult() {
        return liteCompRawGetResult;
    }

    /**
     * Sets the value of the liteCompRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteLiteCompResponse }
     *     
     */
    public void setLiteCompRawGetResult(StatsLteLiteCompResponse value) {
        this.liteCompRawGetResult = value;
    }

}
