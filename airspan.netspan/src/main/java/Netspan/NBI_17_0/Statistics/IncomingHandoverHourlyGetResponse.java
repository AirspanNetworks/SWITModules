
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
 *         &lt;element name="IncomingHandoverHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteIncomingHandoverResponse" minOccurs="0"/&gt;
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
    "incomingHandoverHourlyGetResult"
})
@XmlRootElement(name = "IncomingHandoverHourlyGetResponse")
public class IncomingHandoverHourlyGetResponse {

    @XmlElement(name = "IncomingHandoverHourlyGetResult")
    protected StatsLteIncomingHandoverResponse incomingHandoverHourlyGetResult;

    /**
     * Gets the value of the incomingHandoverHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteIncomingHandoverResponse }
     *     
     */
    public StatsLteIncomingHandoverResponse getIncomingHandoverHourlyGetResult() {
        return incomingHandoverHourlyGetResult;
    }

    /**
     * Sets the value of the incomingHandoverHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteIncomingHandoverResponse }
     *     
     */
    public void setIncomingHandoverHourlyGetResult(StatsLteIncomingHandoverResponse value) {
        this.incomingHandoverHourlyGetResult = value;
    }

}
