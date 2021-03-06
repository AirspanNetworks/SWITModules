
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
 *         &lt;element name="CellLevelInterRatNeighboursHourlyGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelInterRatNeighboursResponse" minOccurs="0"/&gt;
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
    "cellLevelInterRatNeighboursHourlyGetResult"
})
@XmlRootElement(name = "CellLevelInterRatNeighboursHourlyGetResponse")
public class CellLevelInterRatNeighboursHourlyGetResponse {

    @XmlElement(name = "CellLevelInterRatNeighboursHourlyGetResult")
    protected StatsLteCellLevelInterRatNeighboursResponse cellLevelInterRatNeighboursHourlyGetResult;

    /**
     * Gets the value of the cellLevelInterRatNeighboursHourlyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public StatsLteCellLevelInterRatNeighboursResponse getCellLevelInterRatNeighboursHourlyGetResult() {
        return cellLevelInterRatNeighboursHourlyGetResult;
    }

    /**
     * Sets the value of the cellLevelInterRatNeighboursHourlyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public void setCellLevelInterRatNeighboursHourlyGetResult(StatsLteCellLevelInterRatNeighboursResponse value) {
        this.cellLevelInterRatNeighboursHourlyGetResult = value;
    }

}
