
package Netspan.NBI_17_5.Statistics;

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
 *         &lt;element name="CellLevelRadioBearerQosRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelRadioBearerQosResponse" minOccurs="0"/&gt;
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
    "cellLevelRadioBearerQosRawGetResult"
})
@XmlRootElement(name = "CellLevelRadioBearerQosRawGetResponse")
public class CellLevelRadioBearerQosRawGetResponse {

    @XmlElement(name = "CellLevelRadioBearerQosRawGetResult")
    protected StatsLteCellLevelRadioBearerQosResponse cellLevelRadioBearerQosRawGetResult;

    /**
     * Gets the value of the cellLevelRadioBearerQosRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public StatsLteCellLevelRadioBearerQosResponse getCellLevelRadioBearerQosRawGetResult() {
        return cellLevelRadioBearerQosRawGetResult;
    }

    /**
     * Sets the value of the cellLevelRadioBearerQosRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelRadioBearerQosResponse }
     *     
     */
    public void setCellLevelRadioBearerQosRawGetResult(StatsLteCellLevelRadioBearerQosResponse value) {
        this.cellLevelRadioBearerQosRawGetResult = value;
    }

}
