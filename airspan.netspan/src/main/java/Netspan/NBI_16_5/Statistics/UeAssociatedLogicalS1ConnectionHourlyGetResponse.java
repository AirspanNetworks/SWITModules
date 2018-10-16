
package Netspan.NBI_16_5.Statistics;

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
 *         &lt;element name="UeAssociatedLogicalS1ConnectionHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteUeAssociatedLogicalS1ConnectionResponse" minOccurs="0"/&gt;
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
    "ueAssociatedLogicalS1ConnectionHourlyGetResult"
})
@XmlRootElement(name = "UeAssociatedLogicalS1ConnectionHourlyGetResponse")
public class UeAssociatedLogicalS1ConnectionHourlyGetResponse {

    @XmlElement(name = "UeAssociatedLogicalS1ConnectionHourlyGetResult")
    protected StatsLteUeAssociatedLogicalS1ConnectionResponse ueAssociatedLogicalS1ConnectionHourlyGetResult;

    /**
     * Gets the value of the ueAssociatedLogicalS1ConnectionHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public StatsLteUeAssociatedLogicalS1ConnectionResponse getUeAssociatedLogicalS1ConnectionHourlyGetResult() {
        return ueAssociatedLogicalS1ConnectionHourlyGetResult;
    }

    /**
     * Sets the value of the ueAssociatedLogicalS1ConnectionHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public void setUeAssociatedLogicalS1ConnectionHourlyGetResult(StatsLteUeAssociatedLogicalS1ConnectionResponse value) {
        this.ueAssociatedLogicalS1ConnectionHourlyGetResult = value;
    }

}
