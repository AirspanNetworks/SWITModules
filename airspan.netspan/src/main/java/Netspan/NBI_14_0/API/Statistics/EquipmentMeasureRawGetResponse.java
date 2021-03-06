
package Netspan.NBI_14_0.API.Statistics;

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
 *         &lt;element name="EquipmentMeasureRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteEquipmentMeasureResponse" minOccurs="0"/>
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
    "equipmentMeasureRawGetResult"
})
@XmlRootElement(name = "EquipmentMeasureRawGetResponse")
public class EquipmentMeasureRawGetResponse {

    @XmlElement(name = "EquipmentMeasureRawGetResult")
    protected StatsLteEquipmentMeasureResponse equipmentMeasureRawGetResult;

    /**
     * Gets the value of the equipmentMeasureRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteEquipmentMeasureResponse }
     *     
     */
    public StatsLteEquipmentMeasureResponse getEquipmentMeasureRawGetResult() {
        return equipmentMeasureRawGetResult;
    }

    /**
     * Sets the value of the equipmentMeasureRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteEquipmentMeasureResponse }
     *     
     */
    public void setEquipmentMeasureRawGetResult(StatsLteEquipmentMeasureResponse value) {
        this.equipmentMeasureRawGetResult = value;
    }

}
