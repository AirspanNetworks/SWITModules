
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
 *         &lt;element name="UeAssociatedLogicalS1ConnectionDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteUeAssociatedLogicalS1ConnectionResponse" minOccurs="0"/&gt;
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
    "ueAssociatedLogicalS1ConnectionDailyGetResult"
})
@XmlRootElement(name = "UeAssociatedLogicalS1ConnectionDailyGetResponse")
public class UeAssociatedLogicalS1ConnectionDailyGetResponse {

    @XmlElement(name = "UeAssociatedLogicalS1ConnectionDailyGetResult")
    protected StatsLteUeAssociatedLogicalS1ConnectionResponse ueAssociatedLogicalS1ConnectionDailyGetResult;

    /**
     * Gets the value of the ueAssociatedLogicalS1ConnectionDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public StatsLteUeAssociatedLogicalS1ConnectionResponse getUeAssociatedLogicalS1ConnectionDailyGetResult() {
        return ueAssociatedLogicalS1ConnectionDailyGetResult;
    }

    /**
     * Sets the value of the ueAssociatedLogicalS1ConnectionDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public void setUeAssociatedLogicalS1ConnectionDailyGetResult(StatsLteUeAssociatedLogicalS1ConnectionResponse value) {
        this.ueAssociatedLogicalS1ConnectionDailyGetResult = value;
    }

}
