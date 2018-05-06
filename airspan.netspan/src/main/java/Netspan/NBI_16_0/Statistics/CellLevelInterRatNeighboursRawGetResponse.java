
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
 *         &lt;element name="CellLevelInterRatNeighboursRawGetResult" type="{http://Airspan.Netspan.WebServices}StatsLteCellLevelInterRatNeighboursResponse" minOccurs="0"/>
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
    "cellLevelInterRatNeighboursRawGetResult"
})
@XmlRootElement(name = "CellLevelInterRatNeighboursRawGetResponse")
public class CellLevelInterRatNeighboursRawGetResponse {

    @XmlElement(name = "CellLevelInterRatNeighboursRawGetResult")
    protected StatsLteCellLevelInterRatNeighboursResponse cellLevelInterRatNeighboursRawGetResult;

    /**
     * Gets the value of the cellLevelInterRatNeighboursRawGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public StatsLteCellLevelInterRatNeighboursResponse getCellLevelInterRatNeighboursRawGetResult() {
        return cellLevelInterRatNeighboursRawGetResult;
    }

    /**
     * Sets the value of the cellLevelInterRatNeighboursRawGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsLteCellLevelInterRatNeighboursResponse }
     *     
     */
    public void setCellLevelInterRatNeighboursRawGetResult(StatsLteCellLevelInterRatNeighboursResponse value) {
        this.cellLevelInterRatNeighboursRawGetResult = value;
    }

}
