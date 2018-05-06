
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="RruPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRruPerQciResponse" minOccurs="0"/>
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
    "rruPerQciRawGetResult"
})
@XmlRootElement(name = "RruPerQciRawGetResponse")
public class RruPerQciRawGetResponse {

    @XmlElement(name = "RruPerQciRawGetResult")
    protected StatsLteRruPerQciResponse rruPerQciRawGetResult;

    /**
     * Gets the value of the rruPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRruPerQciResponse }
     *     
     */
    public StatsLteRruPerQciResponse getRruPerQciRawGetResult() {
        return rruPerQciRawGetResult;
    }

    /**
     * Sets the value of the rruPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRruPerQciResponse }
     *     
     */
    public void setRruPerQciRawGetResult(StatsLteRruPerQciResponse value) {
        this.rruPerQciRawGetResult = value;
    }

}
