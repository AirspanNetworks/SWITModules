
package Netspan.NBI_18_0.Statistics;

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
 *         &lt;element name="EquipmentMeasureDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEquipmentMeasureResponse" minOccurs="0"/&gt;
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
    "equipmentMeasureDailyGetResult"
})
@XmlRootElement(name = "EquipmentMeasureDailyGetResponse")
public class EquipmentMeasureDailyGetResponse {

    @XmlElement(name = "EquipmentMeasureDailyGetResult")
    protected StatsLteEquipmentMeasureResponse equipmentMeasureDailyGetResult;

    /**
     * Gets the value of the equipmentMeasureDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEquipmentMeasureResponse }
     *     
     */
    public StatsLteEquipmentMeasureResponse getEquipmentMeasureDailyGetResult() {
        return equipmentMeasureDailyGetResult;
    }

    /**
     * Sets the value of the equipmentMeasureDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEquipmentMeasureResponse }
     *     
     */
    public void setEquipmentMeasureDailyGetResult(StatsLteEquipmentMeasureResponse value) {
        this.equipmentMeasureDailyGetResult = value;
    }

}
