
package Netspan.NBI_16_0.Statistics;

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
 *         &lt;element name="EtwsRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEtwsResponse" minOccurs="0"/>
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
    "etwsRawGetResult"
})
@XmlRootElement(name = "EtwsRawGetResponse")
public class EtwsRawGetResponse {

    @XmlElement(name = "EtwsRawGetResult")
    protected StatsLteEtwsResponse etwsRawGetResult;

    /**
     * Gets the value of the etwsRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public StatsLteEtwsResponse getEtwsRawGetResult() {
        return etwsRawGetResult;
    }

    /**
     * Sets the value of the etwsRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEtwsResponse }
     *     
     */
    public void setEtwsRawGetResult(StatsLteEtwsResponse value) {
        this.etwsRawGetResult = value;
    }

}
