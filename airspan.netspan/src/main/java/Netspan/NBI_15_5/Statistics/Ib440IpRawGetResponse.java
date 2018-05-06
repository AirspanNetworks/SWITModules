
package Netspan.NBI_15_5.Statistics;

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
 *         &lt;element name="Ib440IpRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440IpResponse" minOccurs="0"/>
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
    "ib440IpRawGetResult"
})
@XmlRootElement(name = "Ib440IpRawGetResponse")
public class Ib440IpRawGetResponse {

    @XmlElement(name = "Ib440IpRawGetResult")
    protected StatsIb440IpResponse ib440IpRawGetResult;

    /**
     * Gets the value of the ib440IpRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440IpResponse }
     *     
     */
    public StatsIb440IpResponse getIb440IpRawGetResult() {
        return ib440IpRawGetResult;
    }

    /**
     * Sets the value of the ib440IpRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440IpResponse }
     *     
     */
    public void setIb440IpRawGetResult(StatsIb440IpResponse value) {
        this.ib440IpRawGetResult = value;
    }

}
