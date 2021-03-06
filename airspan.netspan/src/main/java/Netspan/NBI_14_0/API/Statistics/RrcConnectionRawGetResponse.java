
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
 *         &lt;element name="RrcConnectionRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRrcConnectionResponse" minOccurs="0"/>
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
    "rrcConnectionRawGetResult"
})
@XmlRootElement(name = "RrcConnectionRawGetResponse")
public class RrcConnectionRawGetResponse {

    @XmlElement(name = "RrcConnectionRawGetResult")
    protected StatsLteRrcConnectionResponse rrcConnectionRawGetResult;

    /**
     * Gets the value of the rrcConnectionRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRrcConnectionResponse }
     *     
     */
    public StatsLteRrcConnectionResponse getRrcConnectionRawGetResult() {
        return rrcConnectionRawGetResult;
    }

    /**
     * Sets the value of the rrcConnectionRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRrcConnectionResponse }
     *     
     */
    public void setRrcConnectionRawGetResult(StatsLteRrcConnectionResponse value) {
        this.rrcConnectionRawGetResult = value;
    }

}
