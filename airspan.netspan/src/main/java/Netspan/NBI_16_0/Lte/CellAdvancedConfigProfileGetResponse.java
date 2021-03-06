
package Netspan.NBI_16_0.Lte;

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
 *         &lt;element name="CellAdvancedConfigProfileGetResult" type="{http://Airspan.Netspan.WebServices}LteCellAdvancedProfileGetResult" minOccurs="0"/>
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
    "cellAdvancedConfigProfileGetResult"
})
@XmlRootElement(name = "CellAdvancedConfigProfileGetResponse")
public class CellAdvancedConfigProfileGetResponse {

    @XmlElement(name = "CellAdvancedConfigProfileGetResult")
    protected LteCellAdvancedProfileGetResult cellAdvancedConfigProfileGetResult;

    /**
     * Gets the value of the cellAdvancedConfigProfileGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link LteCellAdvancedProfileGetResult }
     *     
     */
    public LteCellAdvancedProfileGetResult getCellAdvancedConfigProfileGetResult() {
        return cellAdvancedConfigProfileGetResult;
    }

    /**
     * Sets the value of the cellAdvancedConfigProfileGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LteCellAdvancedProfileGetResult }
     *     
     */
    public void setCellAdvancedConfigProfileGetResult(LteCellAdvancedProfileGetResult value) {
        this.cellAdvancedConfigProfileGetResult = value;
    }

}
