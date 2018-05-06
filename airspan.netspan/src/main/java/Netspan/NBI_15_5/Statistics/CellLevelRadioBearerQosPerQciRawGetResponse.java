
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
 *         &lt;element name="CellLevelRadioBearerQosPerQciRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosPerQciResponse" minOccurs="0"/>
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
    "cellLevelRadioBearerQosPerQciRawGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosPerQciRawGetResponse")
public class CellLevelRadioBearerQosPerQciRawGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosPerQciRawGetResult")
    protected StatsLteCellLevelRadioBearerQosPerQciResponse cellLevelRadioBearerQosPerQciRawGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosPerQciRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosPerQciResponse getCellLevelRadioBearerQosPerQciRawGetResult() {
        return cellLevelRadioBearerQosPerQciRawGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosPerQciRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public void setCellLevelRadioBearerQosPerQciRawGetResult(StatsLteCellLevelRadioBearerQosPerQciResponse value) {
        this.cellLevelRadioBearerQosPerQciRawGetResult = value;
    }

}
