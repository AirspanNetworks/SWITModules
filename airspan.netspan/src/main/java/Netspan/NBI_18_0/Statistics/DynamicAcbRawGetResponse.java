
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
 *         &lt;element name="DynamicAcbRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteDynamicAcbResponse" minOccurs="0"/&gt;
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
    "dynamicAcbRawGetResult"
})
@XmlRootElement(name = "DynamicAcbRawGetResponse")
public class DynamicAcbRawGetResponse {

    @XmlElement(name = "DynamicAcbRawGetResult")
    protected StatsLteDynamicAcbResponse dynamicAcbRawGetResult;

    /**
     * Gets the value of the dynamicAcbRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteDynamicAcbResponse }
     *     
     */
    public StatsLteDynamicAcbResponse getDynamicAcbRawGetResult() {
        return dynamicAcbRawGetResult;
    }

    /**
     * Sets the value of the dynamicAcbRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteDynamicAcbResponse }
     *     
     */
    public void setDynamicAcbRawGetResult(StatsLteDynamicAcbResponse value) {
        this.dynamicAcbRawGetResult = value;
    }

}
