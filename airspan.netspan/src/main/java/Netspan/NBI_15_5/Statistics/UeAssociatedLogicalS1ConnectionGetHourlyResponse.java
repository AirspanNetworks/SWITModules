
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
 *         &lt;element name="UeAssociatedLogicalS1ConnectionGetHourlyResult" type="{http://Airspan.Netspan.WebServices}StatsLteUeAssociatedLogicalS1ConnectionResponse" minOccurs="0"/>
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
    "ueAssociatedLogicalS1ConnectionGetHourlyResult"
})
@XmlRootElement(name = "UeAssociatedLogicalS1ConnectionGetHourlyResponse")
public class UeAssociatedLogicalS1ConnectionGetHourlyResponse {

    @XmlElement(name = "UeAssociatedLogicalS1ConnectionGetHourlyResult")
    protected StatsLteUeAssociatedLogicalS1ConnectionResponse ueAssociatedLogicalS1ConnectionGetHourlyResult;

    /**
     * Gets the value of the ueAssociatedLogicalS1ConnectionGetHourlyResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public StatsLteUeAssociatedLogicalS1ConnectionResponse getUeAssociatedLogicalS1ConnectionGetHourlyResult() {
        return ueAssociatedLogicalS1ConnectionGetHourlyResult;
    }

    /**
     * Sets the value of the ueAssociatedLogicalS1ConnectionGetHourlyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteUeAssociatedLogicalS1ConnectionResponse }
     *     
     */
    public void setUeAssociatedLogicalS1ConnectionGetHourlyResult(StatsLteUeAssociatedLogicalS1ConnectionResponse value) {
        this.ueAssociatedLogicalS1ConnectionGetHourlyResult = value;
    }

}
