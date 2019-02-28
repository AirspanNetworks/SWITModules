
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
 *         &lt;element name="RadioResourceUtilizationDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRadioResourceUtilizationResponse" minOccurs="0"/&gt;
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
    "radioResourceUtilizationDailyGetResult"
})
@XmlRootElement(name = "RadioResourceUtilizationDailyGetResponse")
public class RadioResourceUtilizationDailyGetResponse {

    @XmlElement(name = "RadioResourceUtilizationDailyGetResult")
    protected StatsLteRadioResourceUtilizationResponse radioResourceUtilizationDailyGetResult;

    /**
     * Gets the value of the radioResourceUtilizationDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRadioResourceUtilizationResponse }
     *     
     */
    public StatsLteRadioResourceUtilizationResponse getRadioResourceUtilizationDailyGetResult() {
        return radioResourceUtilizationDailyGetResult;
    }

    /**
     * Sets the value of the radioResourceUtilizationDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRadioResourceUtilizationResponse }
     *     
     */
    public void setRadioResourceUtilizationDailyGetResult(StatsLteRadioResourceUtilizationResponse value) {
        this.radioResourceUtilizationDailyGetResult = value;
    }

}
