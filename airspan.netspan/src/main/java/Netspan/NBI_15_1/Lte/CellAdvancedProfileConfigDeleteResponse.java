
package Netspan.NBI_15_1.Lte;

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
 *         &lt;element name="CellAdvancedProfileConfigDeleteResult" type="{http://Airspan.Netspan.WebServices}ProfileResponse" minOccurs="0"/>
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
    "cellAdvancedProfileConfigDeleteResult"
})
@XmlRootElement(name = "CellAdvancedProfileConfigDeleteResponse")
public class CellAdvancedProfileConfigDeleteResponse {

    @XmlElement(name = "CellAdvancedProfileConfigDeleteResult")
    protected ProfileResponse cellAdvancedProfileConfigDeleteResult;

    /**
     * Gets the value of the cellAdvancedProfileConfigDeleteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileResponse }
     *     
     */
    public ProfileResponse getCellAdvancedProfileConfigDeleteResult() {
        return cellAdvancedProfileConfigDeleteResult;
    }

    /**
     * Sets the value of the cellAdvancedProfileConfigDeleteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileResponse }
     *     
     */
    public void setCellAdvancedProfileConfigDeleteResult(ProfileResponse value) {
        this.cellAdvancedProfileConfigDeleteResult = value;
    }

}
