
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="Ib440RfRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440RfResponse" minOccurs="0"/>
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
    "ib440RfRawGetResult"
})
@XmlRootElement(name = "Ib440RfRawGetResponse")
public class Ib440RfRawGetResponse {

    @XmlElement(name = "Ib440RfRawGetResult")
    protected StatsIb440RfResponse ib440RfRawGetResult;

    /**
     * Gets the value of the ib440RfRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public StatsIb440RfResponse getIb440RfRawGetResult() {
        return ib440RfRawGetResult;
    }

    /**
     * Sets the value of the ib440RfRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public void setIb440RfRawGetResult(StatsIb440RfResponse value) {
        this.ib440RfRawGetResult = value;
    }

}
