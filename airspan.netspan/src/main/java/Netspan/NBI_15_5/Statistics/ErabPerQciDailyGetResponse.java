
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
 *         &lt;element name="ErabPerQciDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteErabPerQciResponse" minOccurs="0"/>
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
    "erabPerQciDailyGetResult"
})
@XmlRootElement(name = "ErabPerQciDailyGetResponse")
public class ErabPerQciDailyGetResponse {

    @XmlElement(name = "ErabPerQciDailyGetResult")
    protected StatsLteErabPerQciResponse erabPerQciDailyGetResult;

    /**
     * Gets the value of the erabPerQciDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public StatsLteErabPerQciResponse getErabPerQciDailyGetResult() {
        return erabPerQciDailyGetResult;
    }

    /**
     * Sets the value of the erabPerQciDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteErabPerQciResponse }
     *     
     */
    public void setErabPerQciDailyGetResult(StatsLteErabPerQciResponse value) {
        this.erabPerQciDailyGetResult = value;
    }

}
