
package Netspan.NBI_14_50.API.Statistics;

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
 *         &lt;element name="CellLevelRadioBearerQosPerQciHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosPerQciResponse" minOccurs="0"/>
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
    "cellLevelRadioBearerQosPerQciHourlyGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosPerQciHourlyGetResponse")
public class CellLevelRadioBearerQosPerQciHourlyGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosPerQciHourlyGetResult")
    protected StatsLteCellLevelRadioBearerQosPerQciResponse cellLevelRadioBearerQosPerQciHourlyGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosPerQciHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosPerQciResponse getCellLevelRadioBearerQosPerQciHourlyGetResult() {
        return cellLevelRadioBearerQosPerQciHourlyGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosPerQciHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public void setCellLevelRadioBearerQosPerQciHourlyGetResult(StatsLteCellLevelRadioBearerQosPerQciResponse value) {
        this.cellLevelRadioBearerQosPerQciHourlyGetResult = value;
    }

}
