
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
 *         &lt;element name="HandoverPerTargetCellDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHandoverPerTargetCellResponse" minOccurs="0"/&gt;
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
    "handoverPerTargetCellDailyGetResult"
})
@XmlRootElement(name = "HandoverPerTargetCellDailyGetResponse")
public class HandoverPerTargetCellDailyGetResponse {

    @XmlElement(name = "HandoverPerTargetCellDailyGetResult")
    protected StatsLteHandoverPerTargetCellResponse handoverPerTargetCellDailyGetResult;

    /**
     * Gets the value of the handoverPerTargetCellDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHandoverPerTargetCellResponse }
     *     
     */
    public StatsLteHandoverPerTargetCellResponse getHandoverPerTargetCellDailyGetResult() {
        return handoverPerTargetCellDailyGetResult;
    }

    /**
     * Sets the value of the handoverPerTargetCellDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHandoverPerTargetCellResponse }
     *     
     */
    public void setHandoverPerTargetCellDailyGetResult(StatsLteHandoverPerTargetCellResponse value) {
        this.handoverPerTargetCellDailyGetResult = value;
    }

}
