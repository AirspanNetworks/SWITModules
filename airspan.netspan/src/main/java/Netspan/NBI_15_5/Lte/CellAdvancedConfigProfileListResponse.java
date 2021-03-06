
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
 *         &lt;element name="CellAdvancedConfigProfileListResult" type="{http://Airspan.Netspan.WebServices}NameResult" minOccurs="0"/>
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
    "cellAdvancedConfigProfileListResult"
})
@XmlRootElement(name = "CellAdvancedConfigProfileListResponse")
public class CellAdvancedConfigProfileListResponse {

    @XmlElement(name = "CellAdvancedConfigProfileListResult")
    protected NameResult cellAdvancedConfigProfileListResult;

    /**
     * Gets the value of the cellAdvancedConfigProfileListResult property.
     * 
     * @return
     *     possible object is
     *     {@link NameResult }
     *     
     */
    public NameResult getCellAdvancedConfigProfileListResult() {
        return cellAdvancedConfigProfileListResult;
    }

    /**
     * Sets the value of the cellAdvancedConfigProfileListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameResult }
     *     
     */
    public void setCellAdvancedConfigProfileListResult(NameResult value) {
        this.cellAdvancedConfigProfileListResult = value;
    }

}
