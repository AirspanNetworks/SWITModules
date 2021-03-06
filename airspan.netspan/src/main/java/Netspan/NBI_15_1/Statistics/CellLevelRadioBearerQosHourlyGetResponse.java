
package Netspan.NBI_15_1.Statistics;

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
 *         &lt;element name="CellLevelRadioBearerQosHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosResponse" minOccurs="0"/>
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
    "cellLevelRadioBearerQosHourlyGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosHourlyGetResponse")
public class CellLevelRadioBearerQosHourlyGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosHourlyGetResult")
    protected StatsLteCellLevelRadioBearerQosResponse cellLevelRadioBearerQosHourlyGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosResponse getCellLevelRadioBearerQosHourlyGetResult() {
        return cellLevelRadioBearerQosHourlyGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public void setCellLevelRadioBearerQosHourlyGetResult(StatsLteCellLevelRadioBearerQosResponse value) {
        this.cellLevelRadioBearerQosHourlyGetResult = value;
    }

}
