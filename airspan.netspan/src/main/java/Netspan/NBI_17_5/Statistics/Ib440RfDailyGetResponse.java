
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="Ib440RfDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsIb440RfResponse" minOccurs="0"/&gt;
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
    "ib440RfDailyGetResult"
})
@XmlRootElement(name = "Ib440RfDailyGetResponse")
public class Ib440RfDailyGetResponse {

    @XmlElement(name = "Ib440RfDailyGetResult")
    protected StatsIb440RfResponse ib440RfDailyGetResult;

    /**
     * Gets the value of the ib440RfDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public StatsIb440RfResponse getIb440RfDailyGetResult() {
        return ib440RfDailyGetResult;
    }

    /**
     * Sets the value of the ib440RfDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsIb440RfResponse }
     *     
     */
    public void setIb440RfDailyGetResult(StatsIb440RfResponse value) {
        this.ib440RfDailyGetResult = value;
    }

}
