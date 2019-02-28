
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
 *         &lt;element name="RadioResourceUtilizationHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteRadioResourceUtilizationResponse" minOccurs="0"/&gt;
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
    "radioResourceUtilizationHourlyGetResult"
})
@XmlRootElement(name = "RadioResourceUtilizationHourlyGetResponse")
public class RadioResourceUtilizationHourlyGetResponse {

    @XmlElement(name = "RadioResourceUtilizationHourlyGetResult")
    protected StatsLteRadioResourceUtilizationResponse radioResourceUtilizationHourlyGetResult;

    /**
     * Gets the value of the radioResourceUtilizationHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteRadioResourceUtilizationResponse }
     *     
     */
    public StatsLteRadioResourceUtilizationResponse getRadioResourceUtilizationHourlyGetResult() {
        return radioResourceUtilizationHourlyGetResult;
    }

    /**
     * Sets the value of the radioResourceUtilizationHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteRadioResourceUtilizationResponse }
     *     
     */
    public void setRadioResourceUtilizationHourlyGetResult(StatsLteRadioResourceUtilizationResponse value) {
        this.radioResourceUtilizationHourlyGetResult = value;
    }

}
