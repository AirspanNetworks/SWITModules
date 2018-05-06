
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
 *         &lt;element name="Ib440RfHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440RfResponse" minOccurs="0"/>
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
    "ib440RfHourlyGetResult"
})
@XmlRootElement(name = "Ib440RfHourlyGetResponse")
public class Ib440RfHourlyGetResponse {

    @XmlElement(name = "Ib440RfHourlyGetResult")
    protected StatsIb440RfResponse ib440RfHourlyGetResult;

    /**
     * Gets the value of the ib440RfHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public StatsIb440RfResponse getIb440RfHourlyGetResult() {
        return ib440RfHourlyGetResult;
    }

    /**
     * Sets the value of the ib440RfHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public void setIb440RfHourlyGetResult(StatsIb440RfResponse value) {
        this.ib440RfHourlyGetResult = value;
    }

}
