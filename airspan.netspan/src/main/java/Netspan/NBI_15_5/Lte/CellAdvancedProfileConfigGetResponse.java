
package Netspan.NBI_15_5.Lte;

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
 *         &lt;element name="CellAdvancedProfileConfigGetResult" type="{http://Airspan.Netspan.WebServices}LteCellAdvancedProfileGetResult" minOccurs="0"/>
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
    "cellAdvancedProfileConfigGetResult"
})
@XmlRootElement(name = "CellAdvancedProfileConfigGetResponse")
public class CellAdvancedProfileConfigGetResponse {

    @XmlElement(name = "CellAdvancedProfileConfigGetResult")
    protected LteCellAdvancedProfileGetResult cellAdvancedProfileConfigGetResult;

    /**
     * Gets the value of the cellAdvancedProfileConfigGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCellAdvancedProfileGetResult }
     *     
     */
    public LteCellAdvancedProfileGetResult getCellAdvancedProfileConfigGetResult() {
        return cellAdvancedProfileConfigGetResult;
    }

    /**
     * Sets the value of the cellAdvancedProfileConfigGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCellAdvancedProfileGetResult }
     *     
     */
    public void setCellAdvancedProfileConfigGetResult(LteCellAdvancedProfileGetResult value) {
        this.cellAdvancedProfileConfigGetResult = value;
    }

}
