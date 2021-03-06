
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
 *         &lt;element name="HandoverPerTargetCellRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteHandoverPerTargetCellResponse" minOccurs="0"/>
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
    "handoverPerTargetCellRawGetResult"
})
@XmlRootElement(name = "HandoverPerTargetCellRawGetResponse")
public class HandoverPerTargetCellRawGetResponse {

    @XmlElement(name = "HandoverPerTargetCellRawGetResult")
    protected StatsLteHandoverPerTargetCellResponse handoverPerTargetCellRawGetResult;

    /**
     * Gets the value of the handoverPerTargetCellRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteHandoverPerTargetCellResponse }
     *     
     */
    public StatsLteHandoverPerTargetCellResponse getHandoverPerTargetCellRawGetResult() {
        return handoverPerTargetCellRawGetResult;
    }

    /**
     * Sets the value of the handoverPerTargetCellRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteHandoverPerTargetCellResponse }
     *     
     */
    public void setHandoverPerTargetCellRawGetResult(StatsLteHandoverPerTargetCellResponse value) {
        this.handoverPerTargetCellRawGetResult = value;
    }

}
