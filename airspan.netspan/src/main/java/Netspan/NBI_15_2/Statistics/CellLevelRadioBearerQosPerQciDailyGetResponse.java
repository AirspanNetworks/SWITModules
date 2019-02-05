
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CellLevelRadioBearerQosPerQciDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosPerQciResponse" minOccurs="0"/&gt;
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
    "cellLevelRadioBearerQosPerQciDailyGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosPerQciDailyGetResponse")
public class CellLevelRadioBearerQosPerQciDailyGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosPerQciDailyGetResult")
    protected StatsLteCellLevelRadioBearerQosPerQciResponse cellLevelRadioBearerQosPerQciDailyGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosPerQciDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosPerQciResponse getCellLevelRadioBearerQosPerQciDailyGetResult() {
        return cellLevelRadioBearerQosPerQciDailyGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosPerQciDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosPerQciResponse }
     *     
     */
    public void setCellLevelRadioBearerQosPerQciDailyGetResult(StatsLteCellLevelRadioBearerQosPerQciResponse value) {
        this.cellLevelRadioBearerQosPerQciDailyGetResult = value;
    }

}
