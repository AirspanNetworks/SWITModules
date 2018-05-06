
package Netspan.NBI_14_0.API.Statistics;

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
 *         &lt;element name="CsfbRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCsfbResponse" minOccurs="0"/>
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
    "csfbRawGetResult"
})
@XmlRootElement(name = "CsfbRawGetResponse")
public class CsfbRawGetResponse {

    @XmlElement(name = "CsfbRawGetResult")
    protected StatsLteCsfbResponse csfbRawGetResult;

    /**
     * Gets the value of the csfbRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCsfbResponse }
     *     
     */
    public StatsLteCsfbResponse getCsfbRawGetResult() {
        return csfbRawGetResult;
    }

    /**
     * Sets the value of the csfbRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCsfbResponse }
     *     
     */
    public void setCsfbRawGetResult(StatsLteCsfbResponse value) {
        this.csfbRawGetResult = value;
    }

}
