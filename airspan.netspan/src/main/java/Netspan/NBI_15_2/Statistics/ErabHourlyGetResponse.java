
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="ErabHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabResponse" minOccurs="0"/&gt;
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
    "erabHourlyGetResult"
})
@XmlRootElement(name = "ErabHourlyGetResponse")
public class ErabHourlyGetResponse {

    @XmlElement(name = "ErabHourlyGetResult")
    protected StatsLteErabResponse erabHourlyGetResult;

    /**
     * Gets the value of the erabHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public StatsLteErabResponse getErabHourlyGetResult() {
        return erabHourlyGetResult;
    }

    /**
     * Sets the value of the erabHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public void setErabHourlyGetResult(StatsLteErabResponse value) {
        this.erabHourlyGetResult = value;
    }

}
