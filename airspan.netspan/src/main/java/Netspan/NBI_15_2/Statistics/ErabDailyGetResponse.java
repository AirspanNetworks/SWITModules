
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErabDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabResponse" minOccurs="0"/>
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
    "erabDailyGetResult"
})
@XmlRootElement(name = "ErabDailyGetResponse")
public class ErabDailyGetResponse {

    @XmlElement(name = "ErabDailyGetResult")
    protected StatsLteErabResponse erabDailyGetResult;

    /**
     * Gets the value of the erabDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public StatsLteErabResponse getErabDailyGetResult() {
        return erabDailyGetResult;
    }

    /**
     * Sets the value of the erabDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabResponse }
     *     
     */
    public void setErabDailyGetResult(StatsLteErabResponse value) {
        this.erabDailyGetResult = value;
    }

}
