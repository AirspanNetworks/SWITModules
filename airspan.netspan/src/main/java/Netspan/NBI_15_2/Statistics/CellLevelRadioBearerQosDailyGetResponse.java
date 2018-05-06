
package Netspan.NBI_15_2.Statistics;

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
 *         &lt;element name="CellLevelRadioBearerQosDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosResponse" minOccurs="0"/>
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
    "cellLevelRadioBearerQosDailyGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosDailyGetResponse")
public class CellLevelRadioBearerQosDailyGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosDailyGetResult")
    protected StatsLteCellLevelRadioBearerQosResponse cellLevelRadioBearerQosDailyGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosResponse getCellLevelRadioBearerQosDailyGetResult() {
        return cellLevelRadioBearerQosDailyGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public void setCellLevelRadioBearerQosDailyGetResult(StatsLteCellLevelRadioBearerQosResponse value) {
        this.cellLevelRadioBearerQosDailyGetResult = value;
    }

}
