
package Netspan.NBI_16_0.Statistics;

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
 *         &lt;element name="CellLevelInterRatNeighboursDailyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelInterRatNeighboursResponse" minOccurs="0"/>
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
    "cellLevelInterRatNeighboursDailyGetResult"
})
@XmlRootElement(name = "CellLevelInterRatNeighboursDailyGetResponse")
public class CellLevelInterRatNeighboursDailyGetResponse {

    @XmlElement(name = "CellLevelInterRatNeighboursDailyGetResult")
    protected StatsLteCellLevelInterRatNeighboursResponse cellLevelInterRatNeighboursDailyGetResult;

    /**
     * Gets the value of the cellLevelInterRatNeighboursDailyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public StatsLteCellLevelInterRatNeighboursResponse getCellLevelInterRatNeighboursDailyGetResult() {
        return cellLevelInterRatNeighboursDailyGetResult;
    }

    /**
     * Sets the value of the cellLevelInterRatNeighboursDailyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public void setCellLevelInterRatNeighboursDailyGetResult(StatsLteCellLevelInterRatNeighboursResponse value) {
        this.cellLevelInterRatNeighboursDailyGetResult = value;
    }

}
