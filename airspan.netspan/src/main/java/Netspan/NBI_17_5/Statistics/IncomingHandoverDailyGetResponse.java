
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
 *         &lt;element name="IncomingHandoverDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteIncomingHandoverResponse" minOccurs="0"/&gt;
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
    "incomingHandoverDailyGetResult"
})
@XmlRootElement(name = "IncomingHandoverDailyGetResponse")
public class IncomingHandoverDailyGetResponse {

    @XmlElement(name = "IncomingHandoverDailyGetResult")
    protected StatsLteIncomingHandoverResponse incomingHandoverDailyGetResult;

    /**
     * Gets the value of the incomingHandoverDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteIncomingHandoverResponse }
     *     
     */
    public StatsLteIncomingHandoverResponse getIncomingHandoverDailyGetResult() {
        return incomingHandoverDailyGetResult;
    }

    /**
     * Sets the value of the incomingHandoverDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteIncomingHandoverResponse }
     *     
     */
    public void setIncomingHandoverDailyGetResult(StatsLteIncomingHandoverResponse value) {
        this.incomingHandoverDailyGetResult = value;
    }

}
